package com.tencent.p014mm.plugin.appbrand.widget.desktop;

import com.tencent.p014mm.plugin.appbrand.widget.desktop.C68691e;
import dt0.C75448h;
import fy3.C32226l;
import java.util.List;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.desktop.b */
public class C68686b implements C32226l<List<? extends C68691e.C68692a>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AppBrandDesktopView f197329d;

    public C68686b(AppBrandDesktopView appBrandDesktopView) {
        this.f197329d = appBrandDesktopView;
    }

    public Object invoke(Object obj) {
        this.f197329d.post(new C75448h(this, (List) obj));
        return C13598b0.f38549a;
    }
}
