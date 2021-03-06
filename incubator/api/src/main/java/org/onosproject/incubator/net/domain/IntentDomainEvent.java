/*
 * Copyright 2015-present Open Networking Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onosproject.incubator.net.domain;

import org.onosproject.event.AbstractEvent;

/**
 * Describes an intent domain event.
 */
public class IntentDomainEvent
        extends AbstractEvent<IntentDomainEvent.Type, IntentDomain> {

    public enum Type {
        DOMAIN_ADDED,
        DOMAIN_MODIFIED,
        DOMAIN_REMOVED
    }

    protected IntentDomainEvent(Type type, IntentDomain subject) {
        super(type, subject);
    }
}
