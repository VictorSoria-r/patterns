package com.soriano.patterns.domains.builder;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TokenUser {
    private final String name;
    private final String documentNumber;
    private final String address;

    public static Builder builder() {
        return new Builder();
    }
    public static class Builder {
        private String name;
        private String documentNumber;
        private String address;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder documentNumber(String documentNumber) {
            this.documentNumber = documentNumber;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }
        public  TokenUser build() {
            return new TokenUser(name, documentNumber, address);
        }
    }
}
