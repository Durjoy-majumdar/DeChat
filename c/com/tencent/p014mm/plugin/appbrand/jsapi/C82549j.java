package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.j */
public class C82549j implements C82531i {

    /* renamed from: d */
    public final Set<C82531i.C82538g> f241645d = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: e */
    public final Set<C82531i.C82533b> f241646e = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: f */
    public final Set<C82531i.C82535d> f241647f = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: g */
    public final Set<C82531i.C82534c> f241648g = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: h */
    public final Set<C82531i.C82532a> f241649h = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: i */
    public final Set<C82531i.C82539h> f241650i = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: j */
    public final Set<C82531i.C82536e> f241651j = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: n */
    public final Set<C82531i.C82537f> f241652n = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: o */
    public boolean f241653o = true;

    /* renamed from: p */
    public final AtomicBoolean f241654p = new AtomicBoolean(false);

    /* renamed from: g */
    public void mo114876g(boolean z) {
        boolean z2 = this.f241653o;
        if (z2 && !z) {
            for (C82531i.C82537f a : this.f241652n) {
                a.mo114871a();
            }
        } else if (!z2 && z) {
            for (C82531i.C82536e a2 : this.f241651j) {
                a2.mo114870a();
            }
        }
        this.f241653o = z;
    }

    /* renamed from: i */
    public void mo114863i(C82531i.C82533b bVar) {
        this.f241646e.remove(bVar);
    }

    /* renamed from: j */
    public void mo114864j(C82531i.C82533b bVar) {
        this.f241646e.add(bVar);
    }

    /* renamed from: m */
    public void mo114865m(C82531i.C82534c cVar) {
        this.f241648g.add(cVar);
    }

    /* renamed from: q */
    public void mo114866q(C82531i.C82535d dVar) {
        this.f241647f.remove(dVar);
    }

    /* renamed from: r */
    public void mo114867r(C82531i.C82534c cVar) {
        this.f241648g.remove(cVar);
    }

    /* renamed from: y */
    public void mo114868y(C82531i.C82535d dVar) {
        this.f241647f.add(dVar);
    }
}
