package qp1;

import dj1.C58272a1;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import op1.C62084h;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C51995xm1;
import te3.C64370fp1;
import te3.ge4;
import zc1.C66785b;

/* renamed from: qp1.i */
public final class C63314i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f179653d;

    /* renamed from: e */
    public final /* synthetic */ long f179654e;

    /* renamed from: f */
    public final /* synthetic */ String f179655f;

    /* renamed from: g */
    public final /* synthetic */ String f179656g;

    /* renamed from: h */
    public final /* synthetic */ byte[] f179657h;

    /* renamed from: i */
    public final /* synthetic */ String f179658i;

    /* renamed from: j */
    public final /* synthetic */ C64370fp1 f179659j;

    /* renamed from: n */
    public final /* synthetic */ C62084h f179660n;

    public C63314i(long j, long j2, String str, String str2, byte[] bArr, String str3, C64370fp1 fp12, C62084h hVar) {
        this.f179653d = j;
        this.f179654e = j2;
        this.f179655f = str;
        this.f179656g = str2;
        this.f179657h = bArr;
        this.f179658i = str3;
        this.f179659j = fp12;
        this.f179660n = hVar;
    }

    public final void run() {
        C66785b bVar = C66785b.f191882e;
        boolean z = bVar.mo90673n0().f131584h == 3;
        long j = this.f179653d;
        long j2 = this.f179654e;
        String str = this.f179655f;
        String str2 = this.f179656g;
        String O5 = z ? bVar.mo90662O5() : null;
        C89349b a = C89349b.m111674a(this.f179657h);
        LinkedList linkedList = new LinkedList();
        C64370fp1 fp12 = this.f179659j;
        ge4 ge4 = new ge4();
        ge4.f183319d = 2;
        C51995xm1 xm12 = new C51995xm1();
        xm12.f144748d = fp12.f183176d;
        ge4.f183320e = C89349b.m111674a(xm12.toByteArray());
        linkedList.add(ge4);
        C13598b0 b0Var = C13598b0.f38549a;
        new C58272a1(j, j2, str, str2, O5, a, linkedList, this.f179658i, new C63315j(this.f179653d, this.f179659j, new WeakReference(this.f179660n)), (C49712hj1) null).mo9225i();
    }
}
