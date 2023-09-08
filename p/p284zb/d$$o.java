package p284zb;

import android.content.res.AssetFileDescriptor;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.plugin.appbrand.utils.C84754j1;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.concurrent.atomic.AtomicInteger;
import p1044ub.C90636f;
import p774zg.C39348q0;

/* renamed from: zb.d$$o */
public class d$$o implements C84754j1.C84757c {

    /* renamed from: a */
    public final String f262574a;

    /* renamed from: b */
    public final String f262575b;

    /* renamed from: c */
    public final long f262576c;

    /* renamed from: d */
    public final C91635f f262577d;

    /* renamed from: e */
    public final C91633d f262578e;

    /* renamed from: f */
    public final boolean f262579f;

    /* renamed from: g */
    public boolean f262580g = false;

    /* renamed from: h */
    public C80669j.C80676g f262581h = null;

    /* renamed from: i */
    public final AtomicInteger f262582i = new AtomicInteger(2);

    /* renamed from: j */
    public final long f262583j;

    public d$$o(String str, String str2, C91635f fVar, C91633d dVar, boolean z, d$$h d__h) {
        this.f262574a = str;
        this.f262575b = str2;
        this.f262576c = (long) Util.nullAsNil(str2).length();
        this.f262577d = fVar;
        this.f262578e = dVar;
        this.f262579f = z;
        this.f262583j = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void mo117481a(C80669j.C80676g gVar) {
        this.f262581h = gVar;
        mo125514c();
    }

    /* renamed from: b */
    public void mo114825b(String str) {
        this.f262580g = false;
        mo125514c();
    }

    /* renamed from: c */
    public final void mo125514c() {
        if (this.f262582i.decrementAndGet() == 0) {
            C80669j.C80676g gVar = this.f262581h;
            long j = gVar == null ? this.f262583j : gVar.f236058a;
            long currentTimeMillis = gVar == null ? System.currentTimeMillis() : gVar.f236059b;
            C90636f.C90637a aVar = new C90636f.C90637a();
            aVar.f260398i = this.f262574a;
            aVar.f260399j = this.f262575b;
            aVar.f260400k = this.f262576c;
            this.f262577d.mo122648L0(aVar, this.f262580g, j, currentTimeMillis, this.f262581h);
            this.f262578e.mo122612S0(this.f262580g, this.f262574a, this.f262581h);
        }
    }

    public void onSuccess(String str) {
        this.f262580g = true;
        mo125514c();
        if (this.f262574a.equals("WAService.js")) {
            long currentTimeMillis = System.currentTimeMillis() - this.f262583j;
            boolean z = this.f262579f;
            C39348q0.m42097c(2, currentTimeMillis, z ? 1 : 0, this.f262577d.getAppId(), -1, 0, this.f262577d.mo114272k().mo113371a());
        }
    }

    public d$$o(String str, AssetFileDescriptor assetFileDescriptor, C91635f fVar, C91633d dVar, boolean z, d$$h d__h) {
        this.f262574a = str;
        this.f262575b = null;
        this.f262576c = assetFileDescriptor.getLength();
        this.f262577d = fVar;
        this.f262578e = dVar;
        this.f262579f = z;
        this.f262583j = System.currentTimeMillis();
    }
}
