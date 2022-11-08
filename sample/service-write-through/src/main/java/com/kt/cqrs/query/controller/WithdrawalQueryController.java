package com.kt.cqrs.query.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kt.cqrs.query.repository.entity.Withdrawal;
import com.kt.cqrs.query.service.WithdrawalQueryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/withdrawal")
@RequiredArgsConstructor
class WithdrawalQueryController {

	private final WithdrawalQueryService withdrawalQueryService;

	@GetMapping
	ResponseEntity<List<Withdrawal>> withdrawals(@PathParam("cardId") String cardId) {
		return ResponseEntity.ok().body(withdrawalQueryService.withdraw(cardId));
	}
}