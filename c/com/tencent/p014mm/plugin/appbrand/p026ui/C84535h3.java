package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import fy3.C32224a;
import gy3.C87412m;
import kotlin.Metadata;
import p225rc.C89923l;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/h3;", "Lcom/tencent/mm/plugin/appbrand/ui/e4;", "Lcom/tencent/mm/plugin/appbrand/ui/k4;", "Lcom/tencent/mm/plugin/appbrand/ui/n4;", "Landroid/view/View;", "getView", "", "progress", "Lrx3/b0;", "setProgress", "", "can", "setCanShowHideAnimation", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "luggage-wechat-full-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.h3 */
public final class C84535h3 extends C1986e4 implements C84567n4 {

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.h3$a */
    public static final class C84536a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C84535h3 f246693d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f246694e;

        public C84536a(C84535h3 h3Var, C32224a<C13598b0> aVar) {
            this.f246693d = h3Var;
            this.f246694e = aVar;
        }

        public final void run() {
            this.f246693d.mo1911D(this.f246694e);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84535h3(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        mo122166H(true);
        mo122168R(0, !C89923l.f258408a.mo117495a(), true);
        setBackgroundColor(0);
    }

    /* renamed from: D */
    public void mo1911D(C32224a<C13598b0> aVar) {
        if (!C87412m.m108589b(Looper.getMainLooper(), Looper.myLooper())) {
            post(new C84536a(this, aVar));
            return;
        }
        setVisibility(8);
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: S */
    public String mo1898S() {
        return "AppBrandUITransparentLoadingSplash";
    }

    public View getView() {
        return this;
    }

    /* renamed from: q */
    public void mo1912q(String str, String str2) {
    }

    /* renamed from: r */
    public void mo1913r(int i) {
    }

    public void setCanShowHideAnimation(boolean z) {
    }

    public void setProgress(int i) {
    }
}
