package rr1;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.record.FinderRecordTemplatePluginLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;

/* renamed from: rr1.b */
public final class C13100b implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final /* synthetic */ View f37298d;

    /* renamed from: e */
    public final /* synthetic */ int f37299e;

    /* renamed from: f */
    public final /* synthetic */ FinderRecordTemplatePluginLayout f37300f;

    /* renamed from: g */
    public final /* synthetic */ int f37301g;

    /* renamed from: h */
    public final /* synthetic */ RelativeLayout.LayoutParams f37302h;

    /* renamed from: i */
    public final /* synthetic */ RelativeLayout.LayoutParams f37303i;

    /* renamed from: j */
    public final /* synthetic */ RelativeLayout.LayoutParams f37304j;

    /* renamed from: n */
    public final /* synthetic */ View f37305n;

    /* renamed from: o */
    public final /* synthetic */ Rect f37306o;

    /* renamed from: p */
    public final /* synthetic */ View f37307p;

    /* renamed from: q */
    public final /* synthetic */ View f37308q;

    /* renamed from: r */
    public final /* synthetic */ View f37309r;

    public C13100b(View view, int i, FinderRecordTemplatePluginLayout finderRecordTemplatePluginLayout, int i2, RelativeLayout.LayoutParams layoutParams, RelativeLayout.LayoutParams layoutParams2, RelativeLayout.LayoutParams layoutParams3, View view2, Rect rect, View view3, View view4, View view5) {
        this.f37298d = view;
        this.f37299e = i;
        this.f37300f = finderRecordTemplatePluginLayout;
        this.f37301g = i2;
        this.f37302h = layoutParams;
        this.f37303i = layoutParams2;
        this.f37304j = layoutParams3;
        this.f37305n = view2;
        this.f37306o = rect;
        this.f37307p = view3;
        this.f37308q = view4;
        this.f37309r = view5;
    }

    public void onGlobalLayout() {
        this.f37298d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        int height = (this.f37299e - this.f37298d.getHeight()) / 2;
        Log.m105924i("MicroMsg.FinderRecordLayoutUtil", "blackHeight " + height);
        if (height < C76577a.m92157h(this.f37300f.getContext(), C0966R.dimen.f3743cv)) {
            Log.m105924i("MicroMsg.FinderRecordLayoutUtil", "blackHeight <3A");
        } else if (height < C76577a.m92157h(this.f37300f.getContext(), C0966R.dimen.f3755d6)) {
            Log.m105924i("MicroMsg.FinderRecordLayoutUtil", "blackHeight 3A - 6A");
            this.f37302h.bottomMargin = C76577a.m92157h(this.f37300f.getContext(), C0966R.dimen.f3736cp);
            this.f37303i.bottomMargin = (height - this.f37301g) + C76577a.m92157h(this.f37300f.getContext(), C0966R.dimen.f3703bv);
            this.f37304j.topMargin = height;
        } else {
            Log.m105924i("MicroMsg.FinderRecordLayoutUtil", "blackHeight  >6A");
            int h = (height - C76577a.m92157h(this.f37300f.getContext(), C0966R.dimen.f3723cd)) - this.f37305n.getHeight();
            if (h - this.f37306o.top > 0) {
                this.f37304j.topMargin = h;
            } else {
                this.f37304j.topMargin = C76577a.m92157h(this.f37300f.getContext(), C0966R.dimen.f3723cd) + height;
            }
            if (height - this.f37301g >= C76577a.m92157h(this.f37300f.getContext(), C0966R.dimen.f3755d6)) {
                this.f37302h.bottomMargin = C76577a.m92157h(this.f37300f.getContext(), C0966R.dimen.f3753d4);
                this.f37303i.bottomMargin = (height - this.f37307p.getHeight()) - this.f37301g;
            } else {
                this.f37302h.bottomMargin = C76577a.m92157h(this.f37300f.getContext(), C0966R.dimen.f3736cp);
                this.f37303i.bottomMargin = (height - this.f37301g) + C76577a.m92157h(this.f37300f.getContext(), C0966R.dimen.f3703bv);
            }
        }
        this.f37305n.setLayoutParams(this.f37304j);
        this.f37308q.setLayoutParams(this.f37302h);
        this.f37307p.setLayoutParams(this.f37303i);
        View view = this.f37309r;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/video/util/FinderRecordLayoutUtilKt$reLayoutPluginOnce$2", "onGlobalLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/video/util/FinderRecordLayoutUtilKt$reLayoutPluginOnce$2", "onGlobalLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300);
        alphaAnimation.setFillAfter(true);
        this.f37309r.startAnimation(alphaAnimation);
    }
}
