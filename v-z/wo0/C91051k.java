package wo0;

import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: wo0.k */
public class C91051k {

    /* renamed from: a */
    public String f261208a;

    /* renamed from: b */
    public int f261209b;

    /* renamed from: c */
    public int f261210c;

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C91051k)) {
            return false;
        }
        C91051k kVar = (C91051k) obj;
        return !Util.isNullOrNil(this.f261208a) && !Util.isNullOrNil(kVar.f261208a) && this.f261208a.equals(kVar.f261208a) && this.f261209b == kVar.f261209b && this.f261210c == kVar.f261210c;
    }

    public int hashCode() {
        return this.f261208a.hashCode() + this.f261209b + this.f261210c;
    }
}
