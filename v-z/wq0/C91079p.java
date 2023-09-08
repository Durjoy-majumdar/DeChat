package wq0;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import p910lj.C76701a;

/* renamed from: wq0.p */
public class C91079p implements C91077n {

    /* renamed from: d */
    public final AppBrandRuntime f261262d;

    public C91079p(AppBrandRuntime appBrandRuntime) {
        this.f261262d = appBrandRuntime;
    }

    public void i60(String str) {
        C76701a.makeText((Context) this.f261262d.mo113026R(), (CharSequence) String.format("jsapi banned %s", new Object[]{str}), 0).show();
    }
}
