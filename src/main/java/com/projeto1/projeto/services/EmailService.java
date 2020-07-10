package com.projeto1.projeto.services;

import org.springframework.mail.SimpleMailMessage;

import com.projeto1.projeto.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}