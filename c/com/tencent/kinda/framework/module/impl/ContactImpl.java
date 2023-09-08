package com.tencent.kinda.framework.module.impl;

import com.tencent.kinda.gen.KContact;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C75700k0;

public class ContactImpl implements KContact {
    private C72996z1 contact;

    public ContactImpl(String str) {
        C86709a0.m107528h();
        this.contact = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
    }

    public String displayName() {
        return this.contact.mo62898f();
    }

    public String userName() {
        return this.contact.getUsername();
    }
}
