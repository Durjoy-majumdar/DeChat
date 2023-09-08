package com.tencent.p014mm.plugin.finder.p056ui.fav;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import oq3.C110058f;
import oq3.C21804c;
import oq3.C62151e;
import rq3.C22243b;
import rq3.C63509c;
import sx3.C64197v;
import z00.C16090a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dB%\b\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001fR*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006 "}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavLoaderMoreFooter;", "Landroid/widget/RelativeLayout;", "Loq3/c;", "", "Lcm1/i2;", "e", "Ljava/util/List;", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "dataList", "", "f", "getAvailiableList", "availiableList", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "Lrq3/c;", "getSpinnerStyle", "()Lrq3/c;", "spinnerStyle", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavLoaderMoreFooter */
public final class FinderGlobalFavLoaderMoreFooter extends RelativeLayout implements C21804c {

    /* renamed from: d */
    public boolean f161214d;

    /* renamed from: e */
    public List<? extends C0740i2> f161215e;

    /* renamed from: f */
    public final List<Integer> f161216f;

    public FinderGlobalFavLoaderMoreFooter(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo35206a(C110058f fVar, C22243b bVar, C22243b bVar2) {
        View findViewById;
        C87412m.m108594g(fVar, "refreshLayout");
        C87412m.m108594g(bVar, "oldState");
        C87412m.m108594g(bVar2, "newState");
        if (this.f161214d) {
            return;
        }
        if ((bVar2 == C22243b.Loading || bVar2 == C22243b.LoadReleased) && (findViewById = findViewById(C0966R.C0970id.mtc)) != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavLoaderMoreFooter", "onStateChanged", "(Lcom/tencent/mm/view/refreshLayout/interfaces/IRefreshLayout;Lcom/tencent/mm/view/refreshLayout/status/RefreshState;Lcom/tencent/mm/view/refreshLayout/status/RefreshState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavLoaderMoreFooter", "onStateChanged", "(Lcom/tencent/mm/view/refreshLayout/interfaces/IRefreshLayout;Lcom/tencent/mm/view/refreshLayout/status/RefreshState;Lcom/tencent/mm/view/refreshLayout/status/RefreshState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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
        int i;
        if (this.f161214d != z) {
            this.f161214d = z;
            View findViewById = findViewById(C0966R.C0970id.g2s);
            View findViewById2 = findViewById(C0966R.C0970id.mtc);
            if (z) {
                if (findViewById2 != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view = findViewById2;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavLoaderMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavLoaderMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (!Util.isNullOrNil((List) this.f161215e)) {
                    if (findViewById != null) {
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(0);
                        View view2 = findViewById;
                        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavLoaderMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavLoaderMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    List<? extends C0740i2> list = this.f161215e;
                    if (list != null) {
                        ArrayList arrayList = new ArrayList();
                        for (T next : list) {
                            if (this.f161216f.contains(Integer.valueOf(((C0740i2) next).mo75c()))) {
                                arrayList.add(next);
                            }
                        }
                        i = arrayList.size();
                    } else {
                        i = 0;
                    }
                    TextView textView = findViewById != null ? (TextView) findViewById.findViewById(C0966R.C0970id.ayq) : null;
                    if (textView != null) {
                        textView.setText(getContext().getResources().getString(C0966R.string.n6z, new Object[]{Integer.valueOf(i)}));
                    }
                } else if (findViewById != null) {
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar3.mo10233c(8);
                    View view3 = findViewById;
                    C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavLoaderMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavLoaderMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                if (findViewById2 != null) {
                    C9556a aVar4 = new C9556a();
                    ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                    aVar4.mo10233c(0);
                    View view4 = findViewById2;
                    C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavLoaderMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavLoaderMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (findViewById != null) {
                    C9556a aVar5 = new C9556a();
                    ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                    aVar5.mo10233c(8);
                    View view5 = findViewById;
                    C117292a.m165358d(view5, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavLoaderMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                    C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavLoaderMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
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

    public final List<Integer> getAvailiableList() {
        return this.f161216f;
    }

    public final List<C0740i2> getDataList() {
        return this.f161215e;
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

    public final void setDataList(List<? extends C0740i2> list) {
        this.f161215e = list;
    }

    public FinderGlobalFavLoaderMoreFooter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f161216f = C64197v.m75537f(3002, 4, 9, 3001, 2, -3, -5, -7);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C16090a.f43240a);
        C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…e.FinderLoaderMoreFooter)");
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            View.inflate(getContext(), resourceId, this);
        }
        obtainStyledAttributes.recycle();
    }
}
