package cm1;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import te3.C49765hx0;
import te3.C50505n71;
import te3.C51669va1;
import tf1.C13914m;

/* renamed from: cm1.x0 */
public final class C0791x0 implements C0740i2 {

    /* renamed from: d */
    public int f1847d;

    /* renamed from: e */
    public long f1848e;

    /* renamed from: f */
    public final C50505n71 f1849f;

    public C0791x0(int i, long j, C50505n71 n712) {
        C87412m.m108594g(n712, "wecoinHotInfo");
        this.f1847d = i;
        this.f1848e = j;
        this.f1849f = n712;
    }

    /* renamed from: c */
    public int mo75c() {
        return C0791x0.class.hashCode();
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        FinderContact finderContact;
        C87412m.m108594g(mVar, "obj");
        String str = null;
        C51669va1 va12 = mVar instanceof C51669va1 ? (C51669va1) mVar : null;
        if (va12 != null) {
            String str2 = va12.f143406d;
            C49765hx0 hx02 = this.f1849f.f138455d;
            if (!(hx02 == null || (finderContact = hx02.f134919d) == null)) {
                str = finderContact.username;
            }
            if (Util.isEqual(str2, str)) {
                return 0;
            }
        }
        return -1;
    }

    public long getItemId() {
        return (long) hashCode();
    }
}
