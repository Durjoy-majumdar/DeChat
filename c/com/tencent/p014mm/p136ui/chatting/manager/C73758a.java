package com.tencent.p014mm.p136ui.chatting.manager;

import ck3.C67391b;
import java.util.HashMap;
import p270xi.C53356d;

/* renamed from: com.tencent.mm.ui.chatting.manager.a */
public class C73758a {

    /* renamed from: a */
    public HashMap<Class<? extends C53356d>, C53356d> f216514a = new HashMap<>();

    /* renamed from: b */
    public C67391b f216515b;

    public C73758a(C67391b bVar) {
        this.f216515b = bVar;
    }

    /* renamed from: a */
    public <T extends C53356d, V extends Class<T>> T mo102812a(V v) {
        if (!v.isInterface()) {
            throw new RuntimeException("[get] " + v + " is not a interface!");
        } else if (this.f216514a.containsKey(v)) {
            return (C53356d) this.f216514a.get(v);
        } else {
            return null;
        }
    }
}
