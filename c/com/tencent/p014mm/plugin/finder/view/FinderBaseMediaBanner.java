package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.view.FinderViewPager;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import lu3.C34379c;
import p629ny.C76979h;
import te3.C51538uf1;
import zt3.C119157j;
import zt3.C119179t;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004B\u001b\b\u0016\u0012\u0006\u0010.\u001a\u00020-\u0012\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b1\u00102B#\b\u0016\u0012\u0006\u0010.\u001a\u00020-\u0012\b\u00100\u001a\u0004\u0018\u00010/\u0012\u0006\u00103\u001a\u00020\u0005¢\u0006\u0004\b1\u00104R\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0013\u001a\u00028\u00008\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR.\u0010$\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010*\u001a\u00020%8&@&X¦\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0016\u0010,\u001a\u0004\u0018\u00010\u00018VX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0010¨\u00065"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderBaseMediaBanner;", "Landroid/view/View;", "V", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/plugin/finder/view/FinderViewPager$a;", "", "d", "I", "getFocusPosition", "()I", "setFocusPosition", "(I)V", "focusPosition", "e", "Landroid/view/View;", "getMediaView", "()Landroid/view/View;", "setMediaView", "(Landroid/view/View;)V", "mediaView", "Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;", "f", "Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;", "getFinderFeed", "()Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;", "setFinderFeed", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "finderFeed", "Lte3/uf1;", "value", "g", "Lte3/uf1;", "getRefFeedInfo", "()Lte3/uf1;", "setRefFeedInfo", "(Lte3/uf1;)V", "refFeedInfo", "Lcom/tencent/mm/plugin/finder/view/u7;", "getMediaType", "()Lcom/tencent/mm/plugin/finder/view/u7;", "setMediaType", "(Lcom/tencent/mm/plugin/finder/view/u7;)V", "mediaType", "getFocusView", "focusView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderBaseMediaBanner */
public abstract class FinderBaseMediaBanner<V extends View> extends FrameLayout implements FinderViewPager.C3983a {

    /* renamed from: d */
    public int f17623d;

    /* renamed from: e */
    public V f17624e;

    /* renamed from: f */
    public BaseFinderFeed f17625f;

    /* renamed from: g */
    public C51538uf1 f17626g;

    /* renamed from: h */
    public View f17627h;

    /* renamed from: i */
    public View f17628i;

    /* renamed from: j */
    public TextView f17629j;

    /* renamed from: n */
    public View f17630n;

    /* renamed from: o */
    public TextView f17631o;

    /* renamed from: p */
    public C34379c<?> f17632p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderBaseMediaBanner(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        setImportantForAccessibility(1);
        setId(C0966R.C0970id.ol9);
    }

    /* renamed from: a */
    public boolean mo3291a(int i, ViewGroup viewGroup, float f, float f2) {
        C87412m.m108594g(viewGroup, "parent");
        return false;
    }

    /* renamed from: b */
    public abstract View mo4376b();

    public final BaseFinderFeed getFinderFeed() {
        BaseFinderFeed baseFinderFeed = this.f17625f;
        if (baseFinderFeed != null) {
            return baseFinderFeed;
        }
        C87412m.m108603p("finderFeed");
        throw null;
    }

    public final int getFocusPosition() {
        return this.f17623d;
    }

    public View getFocusView() {
        return mo4376b();
    }

    public abstract C4189u7 getMediaType();

    public final V getMediaView() {
        V v = this.f17624e;
        if (v != null) {
            return v;
        }
        C87412m.m108603p("mediaView");
        throw null;
    }

    public final C51538uf1 getRefFeedInfo() {
        return this.f17626g;
    }

    public final void setFinderFeed(BaseFinderFeed baseFinderFeed) {
        C87412m.m108594g(baseFinderFeed, "<set-?>");
        this.f17625f = baseFinderFeed;
    }

    public final void setFocusPosition(int i) {
        this.f17623d = i;
    }

    public abstract void setMediaType(C4189u7 u7Var);

    public final void setMediaView(V v) {
        C87412m.m108594g(v, "<set-?>");
        this.f17624e = v;
    }

    public final void setRefFeedInfo(C51538uf1 uf12) {
        String str;
        this.f17626g = uf12;
        C34379c<?> cVar = this.f17632p;
        if (cVar != null) {
            cVar.cancel(false);
        }
        C51538uf1 uf13 = this.f17626g;
        if (uf13 != null) {
            TextView textView = null;
            if (uf13.f142830f != null) {
                if (!(uf13.f142828d == 0)) {
                    if (this.f17627h == null) {
                        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f359680aa1, this, false);
                        this.f17627h = inflate;
                        addView(inflate, new FrameLayout.LayoutParams(-1, -1));
                        View view = this.f17627h;
                        this.f17628i = view != null ? view.findViewById(C0966R.C0970id.ipv) : null;
                        View view2 = this.f17627h;
                        this.f17629j = view2 != null ? (TextView) view2.findViewById(C0966R.C0970id.ipt) : null;
                        View view3 = this.f17627h;
                        this.f17630n = view3 != null ? view3.findViewById(C0966R.C0970id.c1o) : null;
                        View view4 = this.f17627h;
                        if (view4 != null) {
                            textView = (TextView) view4.findViewById(C0966R.C0970id.c1p);
                        }
                        this.f17631o = textView;
                    }
                    View view5 = this.f17628i;
                    if (view5 != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        C117292a.m165358d(view5, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderBaseMediaBanner", "refreshRefUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view5.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/view/FinderBaseMediaBanner", "refreshRefUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
                    Context context = getContext();
                    C51538uf1 uf14 = this.f17626g;
                    C87412m.m108591d(uf14);
                    FinderContact finderContact = uf14.f142830f;
                    if (finderContact == null || (str = finderContact.nickname) == null) {
                        str = "";
                    }
                    SpannableString T1 = hVar.mo107057T1(context, str);
                    String string = getContext().getString(C0966R.string.emp, new Object[]{T1});
                    C87412m.m108593f(string, "context.getString(R.stri…r_reprint_from, fromName)");
                    TextView textView2 = this.f17629j;
                    if (textView2 != null) {
                        textView2.setText(string);
                    }
                    TextView textView3 = this.f17629j;
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                    }
                    C119179t tVar = C119157j.f356862d;
                    C4070i0 i0Var = new C4070i0(this);
                    C119157j jVar = (C119157j) tVar;
                    jVar.getClass();
                    this.f17632p = jVar.mo183892w(i0Var, 3000, false);
                    C51538uf1 uf15 = this.f17626g;
                    C87412m.m108591d(uf15);
                    if (uf15.f142828d == 2) {
                        View view6 = this.f17630n;
                        if (view6 != null) {
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar2.mo10233c(0);
                            View view7 = view6;
                            C117292a.m165358d(view7, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderBaseMediaBanner", "refreshRefUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view6.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view7, "com/tencent/mm/plugin/finder/view/FinderBaseMediaBanner", "refreshRefUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        View view8 = this.f17628i;
                        if (view8 != null) {
                            C9556a aVar3 = new C9556a();
                            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                            aVar3.mo10233c(8);
                            View view9 = view8;
                            C117292a.m165358d(view9, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderBaseMediaBanner", "refreshRefUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view8.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                            C117292a.m165359e(view9, "com/tencent/mm/plugin/finder/view/FinderBaseMediaBanner", "refreshRefUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        TextView textView4 = this.f17631o;
                        if (textView4 != null) {
                            textView4.setText(T1);
                        }
                        View view10 = this.f17630n;
                        if (view10 != null) {
                            view10.setOnClickListener(new C4075j0(this));
                            return;
                        }
                        return;
                    }
                    View view11 = this.f17630n;
                    if (view11 != null) {
                        C9556a aVar4 = new C9556a();
                        ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                        aVar4.mo10233c(8);
                        View view12 = view11;
                        C117292a.m165358d(view12, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderBaseMediaBanner", "refreshRefUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view11.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                        C117292a.m165359e(view12, "com/tencent/mm/plugin/finder/view/FinderBaseMediaBanner", "refreshRefUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    View view13 = this.f17628i;
                    if (view13 != null) {
                        view13.setOnClickListener(new C4083k0(this));
                        return;
                    }
                    return;
                }
            }
        }
        View view14 = this.f17628i;
        if (view14 != null) {
            C9556a aVar5 = new C9556a();
            ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
            aVar5.mo10233c(8);
            View view15 = view14;
            C117292a.m165358d(view15, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderBaseMediaBanner", "refreshRefUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view14.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view15, "com/tencent/mm/plugin/finder/view/FinderBaseMediaBanner", "refreshRefUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view16 = this.f17630n;
        if (view16 != null) {
            C9556a aVar6 = new C9556a();
            ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
            aVar6.mo10233c(8);
            View view17 = view16;
            C117292a.m165358d(view17, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderBaseMediaBanner", "refreshRefUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view16.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view17, "com/tencent/mm/plugin/finder/view/FinderBaseMediaBanner", "refreshRefUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderBaseMediaBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        setImportantForAccessibility(1);
        setId(C0966R.C0970id.ol9);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderBaseMediaBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        setImportantForAccessibility(1);
        setId(C0966R.C0970id.ol9);
    }
}
