package com.tencent.kinda.framework.module.impl;

import com.tencent.kinda.gen.SecureCtrItem;
import com.tenpay.ndk.Encrypt;

public class KindaSecureCtrItemImpl implements SecureCtrItem {
    private String rawValue;

    public String getValue() {
        return new Encrypt().desedeEncode(this.rawValue);
    }

    public void setRawValue(String str) {
        this.rawValue = str;
    }
}
