package up2;

import com.tencent.p014mm.plugin.sns.model.C94851d1;
import com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import gy3.C8480h;

/* renamed from: up2.c */
public final class C102062c {

    /* renamed from: a */
    public final AdClickActionInfo f300549a;

    /* renamed from: b */
    public final SnsInfo f300550b;

    /* renamed from: c */
    public final int f300551c;

    /* renamed from: d */
    public final C94851d1 f300552d;

    /* renamed from: e */
    public final boolean f300553e;

    /* renamed from: f */
    public final int f300554f;

    public C102062c(AdClickActionInfo adClickActionInfo, SnsInfo snsInfo, int i, C94851d1 d1Var) {
        this(adClickActionInfo, snsInfo, i, d1Var, false, 0, 48, (C8480h) null);
    }

    public C102062c(AdClickActionInfo adClickActionInfo, SnsInfo snsInfo, int i, C94851d1 d1Var, boolean z, int i2, int i3, C8480h hVar) {
        i = (i3 & 4) != 0 ? 0 : i;
        d1Var = (i3 & 8) != 0 ? null : d1Var;
        z = (i3 & 16) != 0 ? false : z;
        i2 = (i3 & 32) != 0 ? 0 : i2;
        this.f300549a = adClickActionInfo;
        this.f300550b = snsInfo;
        this.f300551c = i;
        this.f300552d = d1Var;
        this.f300553e = z;
        this.f300554f = i2;
    }
}
