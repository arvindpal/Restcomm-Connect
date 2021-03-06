/*
 * TeleStax, Open Source Cloud Communications
 * Copyright 2017, Telestax Inc and individual contributors
 * by the @authors tag.
 *
 * This program is free software: you can redistribute it andor modify
 * under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but OUT ANY WARRANTY; out even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 *  along  this program.  If not, see <http:www.gnu.orglicenses>
 */

package org.restcomm.connect.sdr.api;

import org.restcomm.connect.commons.dao.Sid;

import javax.servlet.sip.SipServletMessage;

/**
 * @author oleg.agafonov@telestax.com (Oleg Agafonov)
 */
public final class B2BUASdrMessage {

    private Sid accountSid;

    private final SipServletMessage sipServletMessage;

    public B2BUASdrMessage(Sid accountSid, SipServletMessage sipServletMessage) {
        this.accountSid = accountSid;
        this.sipServletMessage = sipServletMessage;
    }

    public B2BUASdrMessage(SipServletMessage sipServletMessage) {
        this(null, sipServletMessage);
    }

    public Sid getAccountSid() {
        return accountSid;
    }

    public SipServletMessage getSipServletMessage() {
        return sipServletMessage;
    }
}
