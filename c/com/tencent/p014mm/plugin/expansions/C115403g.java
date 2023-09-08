package com.tencent.p014mm.plugin.expansions;

import com.tencent.p014mm.sdk.platformtools.Log;
import p1174c5.C113246d;
import p1174c5.C113248f;
import p210o.C11323a;

/* renamed from: com.tencent.mm.plugin.expansions.g */
public class C115403g implements C113246d<Void, Void> {

    /* renamed from: a */
    public final /* synthetic */ C11323a f345910a;

    public C115403g(C115406j jVar, C11323a aVar) {
        this.f345910a = aVar;
    }

    /* renamed from: a */
    public Object mo165790a(C113248f fVar) {
        Exception exc;
        boolean z;
        synchronized (fVar.f338849a) {
            synchronized (fVar.f338849a) {
                exc = fVar.f338852d;
            }
            z = exc != null;
        }
        if (!z) {
            return null;
        }
        Log.m105924i("MicroMsg.exp.ExpansionsGlobal", "#isFaulted, request expansions fail");
        this.f345910a.apply(Boolean.FALSE);
        return null;
    }
}
