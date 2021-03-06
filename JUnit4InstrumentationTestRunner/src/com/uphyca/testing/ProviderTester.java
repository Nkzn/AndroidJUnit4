package com.uphyca.testing;

import android.content.ContentProvider;
import android.test.ProviderTestCase;

class ProviderTester<T extends ContentProvider> extends ProviderTestCase<T> {

    public ProviderTester(Object owner,
                                Class<T> providerClass,
                                String providerAuthority) {
        super(providerClass, providerAuthority);
        Infrastructure.setInstrumentationToInstrumentationTest(this);
        Infrastructure.setPerformanceWriterIfPerformanceCollectorTestCase(owner);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
    }
}
