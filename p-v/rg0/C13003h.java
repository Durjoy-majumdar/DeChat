package rg0;

import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;

@C86522b
/* renamed from: rg0.h */
public class C13003h extends C86301e {

    /* renamed from: d */
    public C13001f f37066d;

    public static C13001f vx0() {
        C13003h hVar;
        C13003h hVar2;
        C13003h hVar3;
        Class cls = C13003h.class;
        C86709a0.m107523b().mo121108c();
        synchronized (cls) {
            hVar = (C13003h) C86312j.m106911c(cls);
        }
        if (hVar.f37066d == null) {
            synchronized (cls) {
                hVar3 = (C13003h) C86312j.m106911c(cls);
            }
            hVar3.f37066d = new C13001f(C86709a0.m107535s().f251811i);
        }
        synchronized (cls) {
            hVar2 = (C13003h) C86312j.m106911c(cls);
        }
        return hVar2.f37066d;
    }
}
