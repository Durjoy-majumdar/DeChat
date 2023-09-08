package com.tencent.p014mm.plugin.finder.view.refresh;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import oq3.C110058f;
import oq3.C21804c;
import oq3.C62151e;
import rq3.C22243b;
import rq3.C63509c;
import z00.C16090a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B%\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/refresh/FinderProfileLoaderMoreFooter;", "Landroid/widget/RelativeLayout;", "Loq3/c;", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "Lrq3/c;", "getSpinnerStyle", "()Lrq3/c;", "spinnerStyle", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.refresh.FinderProfileLoaderMoreFooter */
public final class FinderProfileLoaderMoreFooter extends RelativeLayout implements C21804c {

    /* renamed from: d */
    public boolean f162378d;

    public FinderProfileLoaderMoreFooter(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo35206a(C110058f fVar, C22243b bVar, C22243b bVar2) {
        View findViewById;
        C87412m.m108594g(fVar, "refreshLayout");
        C87412m.m108594g(bVar, "oldState");
        C87412m.m108594g(bVar2, "newState");
        if (this.f162378d) {
            return;
        }
        if ((bVar2 == C22243b.Loading || bVar2 == C22243b.LoadReleased) && (findViewById = findViewById(C0966R.C0970id.mtc)) != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/refresh/FinderProfileLoaderMoreFooter", "onStateChanged", "(Lcom/tencent/mm/view/refreshLayout/interfaces/IRefreshLayout;Lcom/tencent/mm/view/refreshLayout/status/RefreshState;Lcom/tencent/mm/view/refreshLayout/status/RefreshState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/refresh/FinderProfileLoaderMoreFooter", "onStateChanged", "(Lcom/tencent/mm/view/refreshLayout/interfaces/IRefreshLayout;Lcom/tencent/mm/view/refreshLayout/status/RefreshState;Lcom/tencent/mm/view/refreshLayout/status/RefreshState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: b */
    public int mo34224b(C110058f fVar, boolean z) {
        C87412m.m108594g(fVar, "refreshLayout");
        return 0;
    }

    /* renamed from: c */
    public void mo34225c(C62151e eVar, int i, int i2) {
        C87412m.m108594g(eVar, "kernel");
    }

    /* renamed from: d */
    public boolean mo34223d(boolean z) {
        boolean z2 = z;
        if (this.f162378d == z2) {
            return true;
        }
        this.f162378d = z2;
        if (z2) {
            View findViewById = findViewById(C0966R.C0970id.mtc);
            if (findViewById != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/refresh/FinderProfileLoaderMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/refresh/FinderProfileLoaderMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View findViewById2 = findViewById(C0966R.C0970id.g2s);
            if (findViewById2 == null) {
                return true;
            }
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/refresh/FinderProfileLoaderMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/refresh/FinderProfileLoaderMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return true;
        }
        View findViewById3 = findViewById(C0966R.C0970id.mtc);
        if (findViewById3 != null) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view3 = findViewById3;
            C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/view/refresh/FinderProfileLoaderMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/view/refresh/FinderProfileLoaderMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View findViewById4 = findViewById(C0966R.C0970id.g2s);
        if (findViewById4 == null) {
            return true;
        }
        C9556a aVar4 = new C9556a();
        ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
        aVar4.mo10233c(8);
        View view4 = findViewById4;
        C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/view/refresh/FinderProfileLoaderMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/view/refresh/FinderProfileLoaderMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return true;
    }

    /* renamed from: e */
    public void mo34226e(float f, int i, int i2) {
    }

    /* renamed from: f */
    public boolean mo34227f() {
        return false;
    }

    /* renamed from: g */
    public void mo34228g(C110058f fVar, int i, int i2) {
        C87412m.m108594g(fVar, "refreshLayout");
    }

    public C63509c getSpinnerStyle() {
        return C63509c.f180133b;
    }

    public View getView() {
        return this;
    }

    /* renamed from: h */
    public void mo34231h(C110058f fVar, int i, int i2) {
        C87412m.m108594g(fVar, "refreshLayout");
    }

    /* renamed from: i */
    public void mo34232i(boolean z, float f, int i, int i2, int i3) {
    }

    public FinderProfileLoaderMoreFooter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C16090a.f43240a);
        C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…e.FinderLoaderMoreFooter)");
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            View.inflate(getContext(), resourceId, this);
        }
        obtainStyledAttributes.recycle();
    }
}
