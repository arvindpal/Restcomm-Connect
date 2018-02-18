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

package org.restcomm.connect.telephony.api;

import org.restcomm.connect.commons.stream.StreamEvent;

/**
 * @author oleg.agafonov@telestax.com (Oleg Agafonov)
 */
public class CallInfoStreamEvent implements StreamEvent {

    private final CallInfo callInfo;

    public CallInfoStreamEvent(CallInfo callInfo) {
        this.callInfo = callInfo;
    }

    public CallInfo getCallInfo() {
        return callInfo;
    }
}
