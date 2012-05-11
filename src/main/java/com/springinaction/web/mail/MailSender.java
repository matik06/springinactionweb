/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springinaction.web.mail;

import java.util.Properties;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.mail.javamail.JavaMailSenderImpl;

/**
 *
 * @author Mateusz Lubański <mlubanskii@gmail.com>
 */
public class MailSender extends JavaMailSenderImpl implements InitializingBean {
    
    private Boolean smtpSSLEnabled;

    @Override
    public void afterPropertiesSet() throws Exception {
        Properties properties = new Properties();
        if (smtpSSLEnabled) {
            properties.setProperty("mail.smtp.auth", "true");
            properties.setProperty("mail.smtp.starttls.enable", "true");
            properties.setProperty("mail.smtp.timeout", "8500");
            setJavaMailProperties(properties);
        }
    }
    
    public void setSmtpSSLEnabled(final Boolean smtpSSLEnabled) {
        this.smtpSSLEnabled = smtpSSLEnabled;
    }
}
