package com.tencent.p014mm.plugin.finder.live.view;

import a14.C0000n0;
import a14.C53930o0;
import a14.C53973z1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kg3.C76577a;
import kotlin.Metadata;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import te3.C51733vs1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\n"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveGameWelfareTaskProgressView;", "Landroid/widget/RelativeLayout;", "Lte3/vs1;", "getShowingTask", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveGameWelfareTaskProgressView */
public final class FinderLiveGameWelfareTaskProgressView extends RelativeLayout {

    /* renamed from: r */
    public static final /* synthetic */ int f111660r = 0;

    /* renamed from: d */
    public final C0000n0 f111661d = C53930o0.m60555b();

    /* renamed from: e */
    public C53973z1 f111662e;

    /* renamed from: f */
    public C53973z1 f111663f;

    /* renamed from: g */
    public final RelativeLayout f111664g;

    /* renamed from: h */
    public ViewGroup f111665h;

    /* renamed from: i */
    public ViewGroup f111666i;

    /* renamed from: j */
    public PAGView f111667j;

    /* renamed from: n */
    public TextView f111668n;

    /* renamed from: o */
    public final List<C51733vs1> f111669o;

    /* renamed from: p */
    public C51733vs1 f111670p;

    /* renamed from: q */
    public FinderLiveGameWelfareTaskProgressItemView f111671q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveGameWelfareTaskProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.ago, this, false);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) inflate;
        this.f111665h = viewGroup;
        addView(viewGroup);
        ViewGroup viewGroup2 = this.f111665h;
        if (viewGroup2 != null) {
            View findViewById = viewGroup2.findViewById(C0966R.C0970id.kfx);
            C87412m.m108593f(findViewById, "contentRoot.findViewById….id.task_progress_bucket)");
            this.f111664g = (RelativeLayout) findViewById;
            View inflate2 = LayoutInflater.from(context).inflate(C0966R.C0971layout.agm, this, false);
            C87412m.m108592e(inflate2, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup3 = (ViewGroup) inflate2;
            this.f111666i = viewGroup3;
            viewGroup3.setVisibility(8);
            PAGView pAGView = new PAGView(context);
            pAGView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            pAGView.setScaleMode(1);
            pAGView.setComposition(PAGFile.Load(context.getAssets(), "small_lottery_amin.pag"));
            pAGView.setRepeatCount(1);
            this.f111667j = pAGView;
            ViewGroup viewGroup4 = this.f111666i;
            if (viewGroup4 != null) {
                TextView textView = (TextView) viewGroup4.findViewById(C0966R.C0970id.dlw);
                this.f111668n = textView;
                if (textView != null) {
                    textView.setTextSize(10.0f);
                }
                ViewGroup viewGroup5 = this.f111666i;
                if (viewGroup5 != null) {
                    ViewGroup viewGroup6 = (ViewGroup) viewGroup5.findViewById(C0966R.C0970id.eod);
                    viewGroup6.setVisibility(0);
                    viewGroup6.addView(this.f111667j);
                    ViewGroup viewGroup7 = this.f111666i;
                    if (viewGroup7 != null) {
                        viewGroup7.setTranslationY(-((float) C76577a.m92151b(context, 16)));
                        ViewGroup viewGroup8 = this.f111666i;
                        if (viewGroup8 != null) {
                            addView(viewGroup8);
                            this.f111669o = new ArrayList();
                            return;
                        }
                        C87412m.m108603p("bubbleRoot");
                        throw null;
                    }
                    C87412m.m108603p("bubbleRoot");
                    throw null;
                }
                C87412m.m108603p("bubbleRoot");
                throw null;
            }
            C87412m.m108603p("bubbleRoot");
            throw null;
        }
        C87412m.m108603p("contentRoot");
        throw null;
    }

    /* renamed from: a */
    public final void mo64553a() {
        ViewGroup viewGroup = this.f111666i;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
            PAGView pAGView = this.f111667j;
            if (pAGView != null) {
                pAGView.stop();
            }
            ViewGroup viewGroup2 = this.f111665h;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
            } else {
                C87412m.m108603p("contentRoot");
                throw null;
            }
        } else {
            C87412m.m108603p("bubbleRoot");
            throw null;
        }
    }

    public final C51733vs1 getShowingTask() {
        return this.f111670p;
    }
}
