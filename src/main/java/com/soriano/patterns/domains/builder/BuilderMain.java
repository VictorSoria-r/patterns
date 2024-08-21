package com.soriano.patterns.domains.builder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BuilderMain {

    public static void main(String[] args) {
        TokenUser.Builder builder = TokenUser.builder();
        builder.name("Victor Soriano");
        builder.address("Mala Lima Peru");
        builder.documentNumber("12345678");
        TokenUser tokenUser = builder.build();
        log.info("Usuario : {} , Dirección : {} , Nro documento: {}"
                , tokenUser.getName()
                , tokenUser.getAddress()
                , tokenUser.getDocumentNumber());
    }
}
