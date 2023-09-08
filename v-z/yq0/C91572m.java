package yq0;

import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import gy3.C87412m;

/* renamed from: yq0.m */
public final class C91572m {

    /* renamed from: a */
    public final C81879g f262419a;

    /* renamed from: b */
    public final String f262420b;

    /* renamed from: c */
    public final String f262421c;

    /* renamed from: d */
    public final int f262422d;

    public C91572m(C81879g gVar, String str, String str2, String str3, int i) {
        C87412m.m108594g(gVar, "env");
        C87412m.m108594g(str, ProviderConstants.API_PATH);
        this.f262419a = gVar;
        this.f262420b = str;
        this.f262421c = str3;
        this.f262422d = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("JsAuthExecuteContext(appId='");
        sb.append(this.f262419a.getAppId());
        sb.append("', api='");
        sb.append(this.f262420b);
        sb.append("', privateArgs='");
        String str = this.f262421c;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append("', callbackId=");
        sb.append(this.f262422d);
        sb.append(')');
        return sb.toString();
    }
}
