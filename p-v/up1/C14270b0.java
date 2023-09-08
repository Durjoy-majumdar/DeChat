package up1;

import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;
import te3.C50521nc1;

/* renamed from: up1.b0 */
public final class C14270b0 {

    /* renamed from: a */
    public final C50521nc1 f39813a;

    /* renamed from: b */
    public final C13601g f39814b = C36568h.m40985a(new C14271a(this));

    /* renamed from: up1.b0$a */
    public static final class C14271a extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ C14270b0 f39815d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14271a(C14270b0 b0Var) {
            super(0);
            this.f39815d = b0Var;
        }

        public Object invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("FinderMixLocalItem_");
            sb.append(this.f39815d.f39813a.f138528d);
            sb.append('_');
            String str = this.f39815d.f39813a.f138529e;
            if (str == null) {
                str = "";
            }
            sb.append(str);
            return Long.valueOf((long) MD5Util.getMD5String(sb.toString()).hashCode());
        }
    }

    public C14270b0(C50521nc1 nc12) {
        C87412m.m108594g(nc12, "localPb");
        this.f39813a = nc12;
    }

    /* renamed from: a */
    public final boolean mo13638a(C14270b0 b0Var) {
        C87412m.m108594g(b0Var, "other");
        C50521nc1 nc12 = this.f39813a;
        if (nc12.f138528d == b0Var.f39813a.f138528d) {
            String str = nc12.f138529e;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            if (!Util.isNullOrNil(str)) {
                String str3 = this.f39813a.f138529e;
                if (str3 == null) {
                    str3 = str2;
                }
                String str4 = b0Var.f39813a.f138529e;
                if (str4 != null) {
                    str2 = str4;
                }
                if (C87412m.m108589b(str3, str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
