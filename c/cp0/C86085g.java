package cp0;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import gy3.C87412m;

/* renamed from: cp0.g */
public final class C86085g {

    /* renamed from: a */
    public Context f250569a;

    /* renamed from: b */
    public Intent f250570b;

    /* renamed from: c */
    public final AppBrandInitConfigWC f250571c;

    /* renamed from: d */
    public final AppBrandStatObject f250572d;

    public C86085g(Context context, Intent intent, AppBrandInitConfigWC appBrandInitConfigWC, AppBrandStatObject appBrandStatObject) {
        C87412m.m108594g(context, "ctx");
        C87412m.m108594g(intent, "intent");
        C87412m.m108594g(appBrandInitConfigWC, "initConfig");
        C87412m.m108594g(appBrandStatObject, "statObject");
        this.f250569a = context;
        this.f250570b = intent;
        this.f250571c = appBrandInitConfigWC;
        this.f250572d = appBrandStatObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C86085g)) {
            return false;
        }
        C86085g gVar = (C86085g) obj;
        return C87412m.m108589b(this.f250569a, gVar.f250569a) && C87412m.m108589b(this.f250570b, gVar.f250570b) && C87412m.m108589b(this.f250571c, gVar.f250571c) && C87412m.m108589b(this.f250572d, gVar.f250572d);
    }

    public int hashCode() {
        return (((((this.f250569a.hashCode() * 31) + this.f250570b.hashCode()) * 31) + this.f250571c.hashCode()) * 31) + this.f250572d.hashCode();
    }

    public String toString() {
        return "PendingIntentTask(ctx=" + this.f250569a + ", intent=" + this.f250570b + ", initConfig=" + this.f250571c + ", statObject=" + this.f250572d + ')';
    }
}
