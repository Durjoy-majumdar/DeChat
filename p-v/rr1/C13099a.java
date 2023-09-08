package rr1;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.video.FinderRecordPluginLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;

/* renamed from: rr1.a */
public final class C13099a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final /* synthetic */ View f37286d;

    /* renamed from: e */
    public final /* synthetic */ int f37287e;

    /* renamed from: f */
    public final /* synthetic */ FinderRecordPluginLayout f37288f;

    /* renamed from: g */
    public final /* synthetic */ int f37289g;

    /* renamed from: h */
    public final /* synthetic */ RelativeLayout.LayoutParams f37290h;

    /* renamed from: i */
    public final /* synthetic */ RelativeLayout.LayoutParams f37291i;

    /* renamed from: j */
    public final /* synthetic */ RelativeLayout.LayoutParams f37292j;

    /* renamed from: n */
    public final /* synthetic */ View f37293n;

    /* renamed from: o */
    public final /* synthetic */ Rect f37294o;

    /* renamed from: p */
    public final /* synthetic */ View f37295p;

    /* renamed from: q */
    public final /* synthetic */ View f37296q;

    /* renamed from: r */
    public final /* synthetic */ View f37297r;

    public C13099a(View view, int i, FinderRecordPluginLayout finderRecordPluginLayout, int i2, RelativeLayout.LayoutParams layoutParams, RelativeLayout.LayoutParams layoutParams2, RelativeLayout.LayoutParams layoutParams3, View view2, Rect rect, View view3, View view4, View view5) {
        this.f37286d = view;
        this.f37287e = i;
        this.f37288f = finderRecordPluginLayout;
        this.f37289g = i2;
        this.f37290h = layoutParams;
        this.f37291i = layoutParams2;
        this.f37292j = layoutParams3;
        this.f37293n = view2;
        this.f37294o = rect;
        this.f37295p = view3;
        this.f37296q = view4;
        this.f37297r = view5;
    }

    public void onGlobalLayout() {
        this.f37286d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        int height = (this.f37287e - this.f37286d.getHeight()) / 2;
        Log.m105924i("MicroMsg.FinderRecordLayoutUtil", "blackHeight " + height);
        if (height < C76577a.m92157h(this.f37288f.getContext(), C0966R.dimen.f3743cv)) {
            Log.m105924i("MicroMsg.FinderRecordLayoutUtil", "blackHeight <3A");
        } else if (height < C76577a.m92157h(this.f37288f.getContext(), C0966R.dimen.f3755d6)) {
            Log.m105924i("MicroMsg.FinderRecordLayoutUtil", "blackHeight 3A - 6A");
            this.f37290h.bottomMargin = C76577a.m92157h(this.f37288f.getContext(), C0966R.dimen.f3736cp);
            this.f37291i.bottomMargin = (height - this.f37289g) + C76577a.m92157h(this.f37288f.getContext(), C0966R.dimen.f3703bv);
            this.f37292j.topMargin = height;
        } else {
            Log.m105924i("MicroMsg.FinderRecordLayoutUtil", "blackHeight  >6A");
            int h = (height - C76577a.m92157h(this.f37288f.getContext(), C0966R.dimen.f3723cd)) - this.f37293n.getHeight();
            if (h - this.f37294o.top > 0) {
                this.f37292j.topMargin = h;
            } else {
                this.f37292j.topMargin = C76577a.m92157h(this.f37288f.getContext(), C0966R.dimen.f3723cd) + height;
            }
            if (height - this.f37289g >= C76577a.m92157h(this.f37288f.getContext(), C0966R.dimen.f3755d6)) {
                this.f37290h.bottomMargin = C76577a.m92157h(this.f37288f.getContext(), C0966R.dimen.f3753d4);
                this.f37291i.bottomMargin = (height - this.f37295p.getHeight()) - this.f37289g;
            } else {
                this.f37290h.bottomMargin = C76577a.m92157h(this.f37288f.getContext(), C0966R.dimen.f3736cp);
                this.f37291i.bottomMargin = (height - this.f37289g) + C76577a.m92157h(this.f37288f.getContext(), C0966R.dimen.f3703bv);
            }
        }
        this.f37293n.setLayoutParams(this.f37292j);
        this.f37296q.setLayoutParams(this.f37290h);
        this.f37295p.setLayoutParams(this.f37291i);
        View view = this.f37297r;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/video/util/FinderRecordLayoutUtilKt$reLayoutPluginOnce$1", "onGlobalLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/video/util/FinderRecordLayoutUtilKt$reLayoutPluginOnce$1", "onGlobalLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300);
        alphaAnimation.setFillAfter(true);
        this.f37297r.startAnimation(alphaAnimation);
    }
}
