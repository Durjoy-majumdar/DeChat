package i93;

import com.tencent.p014mm.sdk.platformtools.Log;
import tc2.C118418g;

/* renamed from: i93.b */
public final class C33247b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C33250d f90194d;

    /* renamed from: e */
    public final /* synthetic */ String f90195e;

    /* renamed from: f */
    public final /* synthetic */ String f90196f;

    /* renamed from: g */
    public final /* synthetic */ String f90197g;

    /* renamed from: h */
    public final /* synthetic */ int f90198h;

    public C33247b(C33250d dVar, String str, String str2, String str3, int i) {
        this.f90194d = dVar;
        this.f90195e = str;
        this.f90196f = str2;
        this.f90197g = str3;
        this.f90198h = i;
    }

    public final void run() {
        String str = this.f90194d.f90208a;
        Log.m105924i(str, "doReport url=" + this.f90195e);
        C118418g.INSTANCE.mo175825k6(this.f90195e, this.f90196f, this.f90197g, this.f90198h);
    }
}
