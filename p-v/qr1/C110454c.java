package qr1;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C45983e0;
import gy3.C87412m;
import gy3.C87413o;
import qr1.C110446b;

/* renamed from: qr1.c */
public final class C110454c extends C87413o implements C32226l<C110446b.C110452c, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ long f330304d;

    /* renamed from: e */
    public final /* synthetic */ C45983e0 f330305e;

    /* renamed from: f */
    public final /* synthetic */ Bitmap f330306f;

    /* renamed from: g */
    public final /* synthetic */ C110446b f330307g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110454c(long j, C45983e0 e0Var, Bitmap bitmap, C110446b bVar) {
        super(1);
        this.f330304d = j;
        this.f330305e = e0Var;
        this.f330306f = bitmap;
        this.f330307g = bVar;
    }

    public Object invoke(Object obj) {
        boolean z;
        C110446b.C110452c cVar = (C110446b.C110452c) obj;
        C87412m.m108594g(cVar, LocaleUtil.ITALIAN);
        long j = cVar.f330300a;
        if (j == this.f330304d) {
            this.f330305e.f124000d = j;
            cVar.f330301b.invoke(Long.valueOf(j), this.f330306f);
            String str = this.f330307g.f330286c;
            Log.m105924i(str, "callback " + cVar.f330300a + ", " + this.f330306f);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
