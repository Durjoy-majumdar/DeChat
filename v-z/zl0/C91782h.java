package zl0;

import am0.C79588a;
import am0.C79589b;
import android.nfc.Tag;
import fy3.C32226l;
import rx3.C13598b0;
import zl0.C91789o;

/* renamed from: zl0.h */
public final class C91782h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C91774e f262847d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<C91789o<Object>, C13598b0> f262848e;

    /* renamed from: f */
    public final /* synthetic */ String f262849f;

    /* renamed from: g */
    public final /* synthetic */ String f262850g;

    public C91782h(C91774e eVar, C32226l<? super C91789o<Object>, C13598b0> lVar, String str, String str2, C79588a aVar) {
        this.f262847d = eVar;
        this.f262848e = lVar;
        this.f262849f = str;
        this.f262850g = str2;
    }

    public final void run() {
        C91774e eVar = this.f262847d;
        C32226l<C91789o<Object>, C13598b0> lVar = this.f262848e;
        Tag a = C91774e.m115306a(eVar);
        if (a == null) {
            lVar.invoke(new C91789o.C91790a(13013, "NFC tag has not been discovered"));
        }
        if (a != null) {
            String str = this.f262849f;
            C32226l<C91789o<Object>, C13598b0> lVar2 = this.f262848e;
            C79589b.f233384h.getClass();
            C79589b bVar = C79589b.f233385i.get(str);
            if (bVar == null) {
                lVar2.invoke(new C91789o.C91790a(13014, "invalid tech"));
            }
            if (bVar != null) {
                C91770b bVar2 = bVar.f233393f;
                if (bVar2 == null) {
                    this.f262848e.invoke(new C91789o.C91790a(13024, "function not support"));
                } else {
                    bVar2.mo125634a(a, this.f262850g, (C79588a) null, this.f262848e);
                }
            }
        }
    }
}
