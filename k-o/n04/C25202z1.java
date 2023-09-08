package n04;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;

/* renamed from: n04.z1 */
public enum C25202z1 {
    INVARIANT("", true, true, 0),
    IN_VARIANCE(LocaleUtil.INDONESIAN_NEWNAME, true, false, -1),
    OUT_VARIANCE("out", false, true, 1);
    

    /* renamed from: d */
    public final String f71660d;

    /* renamed from: e */
    public final boolean f71661e;

    /* access modifiers changed from: public */
    C25202z1(String str, boolean z, boolean z2, int i) {
        this.f71660d = str;
        this.f71661e = z2;
    }

    public String toString() {
        return this.f71660d;
    }
}
