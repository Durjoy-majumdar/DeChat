package com.tencent.p014mm.plugin.finder.live.plugin.view.gift;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Metadata;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C48770aw0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveLevelProgressView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveLevelProgressView */
public final class FinderLiveLevelProgressView extends FrameLayout {

    /* renamed from: d */
    public final String f15192d = "FinderLiveLevelProgressView";

    /* renamed from: e */
    public Context f15193e;

    /* renamed from: f */
    public View f15194f;

    /* renamed from: g */
    public View f15195g;

    /* renamed from: h */
    public ProgressBar f15196h;

    /* renamed from: i */
    public TextView f15197i;

    /* renamed from: j */
    public TextView f15198j;

    /* renamed from: n */
    public TextView f15199n;

    /* renamed from: o */
    public TextView f15200o;

    /* renamed from: p */
    public View f15201p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveLevelProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        mo3245b(context);
    }

    /* renamed from: a */
    public final void mo3244a(TextView textView) {
        LinkedList<C48770aw0> linkedList;
        String str;
        C54991o oVar = (C54991o) FinderLiveService.f159376d.mo77630e(C54991o.class);
        C13598b0 b0Var = null;
        if (!(oVar == null || (linkedList = oVar.f154320h) == null)) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = linkedList.iterator();
            while (true) {
                boolean z = false;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                int i = ((C48770aw0) next).f130789d;
                if (i == 8 || i == 10) {
                    z = true;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            C48770aw0 aw02 = (C48770aw0) C110818d0.m150925W(arrayList);
            if (aw02 != null) {
                textView.setVisibility(0);
                int i2 = aw02.f130789d;
                if (i2 == 8) {
                    Context context = this.f15193e;
                    if (context != null) {
                        str = context.getString(C0966R.string.f8139ny);
                    } else {
                        C87412m.m108603p("mContext");
                        throw null;
                    }
                } else if (i2 != 10) {
                    textView.setVisibility(8);
                    str = "";
                } else {
                    Context context2 = this.f15193e;
                    if (context2 != null) {
                        str = context2.getString(C0966R.string.f8140o5);
                    } else {
                        C87412m.m108603p("mContext");
                        throw null;
                    }
                }
                C87412m.m108593f(str, "when (it.badge_type) {\n …          }\n            }");
                textView.setText(str);
                b0Var = C13598b0.f38549a;
            }
        }
        if (b0Var == null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: b */
    public final void mo3245b(Context context) {
        this.f15193e = context;
        View inflate = View.inflate(context, C0966R.C0971layout.csz, this);
        C87412m.m108593f(inflate, "inflate(context, R.layou…el_progress_layout, this)");
        this.f15194f = inflate;
        View findViewById = inflate.findViewById(C0966R.C0970id.mqu);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.f…gift_level_progress_root)");
        this.f15195g = findViewById;
        View view = this.f15194f;
        if (view != null) {
            View findViewById2 = view.findViewById(C0966R.C0970id.mqy);
            C87412m.m108593f(findViewById2, "root.findViewById(R.id.f…r_live_gift_progress_bar)");
            this.f15196h = (ProgressBar) findViewById2;
            View view2 = this.f15194f;
            if (view2 != null) {
                View findViewById3 = view2.findViewById(C0966R.C0970id.f358154mr0);
                C87412m.m108593f(findViewById3, "root.findViewById(R.id.f…r_live_gift_progress_txt)");
                this.f15197i = (TextView) findViewById3;
                View view3 = this.f15194f;
                if (view3 != null) {
                    View findViewById4 = view3.findViewById(C0966R.C0970id.mqv);
                    C87412m.m108593f(findViewById4, "root.findViewById(R.id.f…der_live_gift_level_view)");
                    this.f15198j = (TextView) findViewById4;
                    View view4 = this.f15194f;
                    if (view4 != null) {
                        View findViewById5 = view4.findViewById(C0966R.C0970id.f358158nm0);
                        C87412m.m108593f(findViewById5, "root.findViewById(R.id.finder_live_gift_tag)");
                        this.f15199n = (TextView) findViewById5;
                        View view5 = this.f15194f;
                        if (view5 != null) {
                            View findViewById6 = view5.findViewById(C0966R.C0970id.okp);
                            C87412m.m108593f(findViewById6, "root.findViewById(R.id.finder_live_gift_zero_tag)");
                            this.f15200o = (TextView) findViewById6;
                            View view6 = this.f15194f;
                            if (view6 != null) {
                                View findViewById7 = view6.findViewById(C0966R.C0970id.mqw);
                                C87412m.m108593f(findViewById7, "root.findViewById(R.id.f…ive_gift_level_zero_root)");
                                this.f15201p = findViewById7;
                                return;
                            }
                            C87412m.m108603p("root");
                            throw null;
                        }
                        C87412m.m108603p("root");
                        throw null;
                    }
                    C87412m.m108603p("root");
                    throw null;
                }
                C87412m.m108603p("root");
                throw null;
            }
            C87412m.m108603p("root");
            throw null;
        }
        C87412m.m108603p("root");
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveLevelProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        mo3245b(context);
    }
}
