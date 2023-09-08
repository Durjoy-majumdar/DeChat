package cs0;

import gy3.C87412m;
import te3.C51309sw3;
import te3.w75;

/* renamed from: cs0.g0 */
public final class C45166g0 {

    /* renamed from: a */
    public final w75 f122467a;

    /* renamed from: b */
    public final w75 f122468b;

    /* renamed from: c */
    public final C51309sw3 f122469c;

    public C45166g0(w75 w75, w75 w752, C51309sw3 sw32) {
        C87412m.m108594g(w75, "hostAppInfo");
        C87412m.m108594g(sw32, "usageInfo");
        this.f122467a = w75;
        this.f122468b = w752;
        this.f122469c = sw32;
    }

    /* renamed from: a */
    public final String mo70664a(w75 w75) {
        return "WxaUseUserInfoItem(appid=" + w75.f143915d + ", nick_name=" + w75.f143916e + ", icon_url=" + w75.f143917f + ')';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45166g0)) {
            return false;
        }
        C45166g0 g0Var = (C45166g0) obj;
        return C87412m.m108589b(this.f122467a, g0Var.f122467a) && C87412m.m108589b(this.f122468b, g0Var.f122468b) && C87412m.m108589b(this.f122469c, g0Var.f122469c);
    }

    public int hashCode() {
        int hashCode = this.f122467a.hashCode() * 31;
        w75 w75 = this.f122468b;
        return ((hashCode + (w75 == null ? 0 : w75.hashCode())) * 31) + this.f122469c.hashCode();
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("UserInfoUsageInfoItem(hostAppInfo=");
        sb.append(mo70664a(this.f122467a));
        sb.append(", hostPluginInfo=");
        w75 w75 = this.f122468b;
        if (w75 == null || (str = mo70664a(w75)) == null) {
            str = "null";
        }
        sb.append(str);
        sb.append(", usageInfo=");
        sb.append(this.f122469c.toJSON());
        sb.append(')');
        return sb.toString();
    }
}
