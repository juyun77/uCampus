﻿package mail;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class SMTPAuthenticator extends Authenticator{

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication("shretun@naver.com","rlawndbs0486");
    }
}
