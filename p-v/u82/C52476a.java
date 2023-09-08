package u82;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.newtips.model.C115619a;
import com.tencent.p014mm.plugin.newtips.model.C115631n;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import te3.tg4;

/* renamed from: u82.a */
public final class C52476a implements C115619a {

    /* renamed from: d */
    public Context f146623d;

    /* renamed from: e */
    public View f146624e;

    /* renamed from: f */
    public String f146625f;

    /* renamed from: g */
    public View f146626g;

    public C52476a(Context context, View view, String str, View view2) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(view, "mRootView");
        C87412m.m108594g(str, "mPath");
        C87412m.m108594g(view2, "redDot");
        this.f146623d = context;
        this.f146624e = view;
        this.f146625f = str;
        this.f146626g = view2;
    }

    /* renamed from: e */
    public View mo64133e() {
        return this.f146624e;
    }

    /* renamed from: f */
    public boolean mo25956f(boolean z) {
        if (z) {
            View view = this.f146626g;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/tips/MultitalkScreenProjectNewTips", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/multitalk/ui/tips/MultitalkScreenProjectNewTips", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return true;
        }
        View view3 = this.f146626g;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/tips/MultitalkScreenProjectNewTips", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/multitalk/ui/tips/MultitalkScreenProjectNewTips", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return true;
    }

    /* renamed from: g */
    public boolean mo25958g(boolean z, tg4 tg4) {
        return false;
    }

    public String getPath() {
        return this.f146625f;
    }

    /* renamed from: h */
    public boolean mo25960h(boolean z) {
        return false;
    }

    /* renamed from: i */
    public boolean mo25962i(boolean z, tg4 tg4) {
        return false;
    }

    /* renamed from: j */
    public boolean mo64135j(boolean z, tg4 tg4) {
        return false;
    }

    /* renamed from: k */
    public void mo64136k(C115631n nVar, boolean z) {
    }

    /* renamed from: l */
    public boolean mo64137l() {
        return false;
    }

    /* renamed from: m */
    public boolean mo64138m(boolean z) {
        return false;
    }

    /* renamed from: n */
    public boolean mo64139n(boolean z, tg4 tg4) {
        return false;
    }

    /* renamed from: o */
    public void mo64140o(boolean z, C115631n nVar) {
    }
}
