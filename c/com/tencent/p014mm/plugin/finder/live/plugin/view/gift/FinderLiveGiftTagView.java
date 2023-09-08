package com.tencent.p014mm.plugin.finder.live.plugin.view.gift;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cj1.C0639y1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import ig1.C8916d;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import ok1.C62042e;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import sx3.C110818d0;
import sx3.C64197v;
import tj1.C13957m;
import tj1.C13958n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00009\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0015\u0018\u00002\u00020\u0001:\u0001#B\u001b\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 B#\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010!\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010\"J\u0014\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0002@BX\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006$"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftTagView;", "Landroid/widget/FrameLayout;", "Lkotlin/Function0;", "Lrx3/b0;", "touchBlock", "setTouchBlock", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "f", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "getRv", "()Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "setRv", "(Lcom/tencent/mm/view/recyclerview/WxRecyclerView;)V", "rv", "", "value", "j", "I", "setSelectedTabIndex", "(I)V", "selectedTabIndex", "tj1/m", "o", "Lrx3/g;", "getAdapter", "()Ltj1/m;", "adapter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveGiftTagView */
public final class FinderLiveGiftTagView extends FrameLayout {

    /* renamed from: d */
    public Context f15182d;

    /* renamed from: e */
    public View f15183e;

    /* renamed from: f */
    public WxRecyclerView f15184f;

    /* renamed from: g */
    public List<String> f15185g;

    /* renamed from: h */
    public List<Integer> f15186h;

    /* renamed from: i */
    public int f15187i = -1;

    /* renamed from: j */
    public int f15188j;

    /* renamed from: n */
    public C32226l<? super Integer, C13598b0> f15189n;

    /* renamed from: o */
    public final C13601g f15190o = C36568h.m40985a(new C13958n(this));

    /* renamed from: com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveGiftTagView$a */
    public final class C3187a extends RecyclerView.C16631z {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3187a(FinderLiveGiftTagView finderLiveGiftTagView, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveGiftTagView$b */
    public static final class C3188b implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f15191d;

        public C3188b(C32224a<C13598b0> aVar) {
            this.f15191d = aVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftTagView$setTouchBlock$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            this.f15191d.invoke();
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftTagView$setTouchBlock$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveGiftTagView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        mo3238c(context);
    }

    private final C13957m getAdapter() {
        return (C13957m) this.f15190o.getValue();
    }

    /* access modifiers changed from: private */
    public final void setSelectedTabIndex(int i) {
        if (this.f15188j == getRv().getChildCount() - 1) {
            Map<String, C8916d> map = C0639y1.f1519j;
            C87412m.m108593f(map, "FinderLiveGiftLoader.pkgGiftCache");
            if (!map.isEmpty()) {
                C62042e.f176370a.mo87013I1(6);
            }
        }
        this.f15188j = i;
    }

    /* renamed from: b */
    public final void mo3237b(int i) {
        List<Integer> list = this.f15186h;
        C13598b0 b0Var = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C64197v.m75542k();
                    throw null;
                } else if (i < ((Number) next).intValue()) {
                    setSelectedTabIndex(i2);
                    break;
                } else {
                    i2 = i3;
                }
            }
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            setSelectedTabIndex(0);
        }
        getAdapter().notifyDataSetChanged();
    }

    /* renamed from: c */
    public final void mo3238c(Context context) {
        this.f15182d = context;
        View inflate = View.inflate(context, C0966R.C0971layout.f359725ct1, this);
        C87412m.m108593f(inflate, "inflate(context, R.layou…gift_tag_rv_layout, this)");
        this.f15183e = inflate;
        View findViewById = inflate.findViewById(C0966R.C0970id.f358155mr1);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.finder_live_gift_tab_rv)");
        setRv((WxRecyclerView) findViewById);
        getRv().setAdapter(getAdapter());
        getRv().setLayoutManager(new LinearLayoutManager(context, 0, false));
    }

    /* renamed from: d */
    public final void mo3239d(LinkedHashMap<String, List<String>> linkedHashMap, LinkedList<Integer> linkedList, C32226l<? super Integer, C13598b0> lVar) {
        C87412m.m108594g(linkedHashMap, "giftTabMap");
        C87412m.m108594g(linkedList, "eachTabEndIndexList");
        Set<String> keySet = linkedHashMap.keySet();
        C87412m.m108593f(keySet, "giftTabMap.keys");
        this.f15185g = C110818d0.m150953y0(keySet);
        this.f15186h = linkedList;
        this.f15189n = lVar;
        getAdapter().notifyDataSetChanged();
    }

    public final WxRecyclerView getRv() {
        WxRecyclerView wxRecyclerView = this.f15184f;
        if (wxRecyclerView != null) {
            return wxRecyclerView;
        }
        C87412m.m108603p("rv");
        throw null;
    }

    public final void setRv(WxRecyclerView wxRecyclerView) {
        C87412m.m108594g(wxRecyclerView, "<set-?>");
        this.f15184f = wxRecyclerView;
    }

    public final void setTouchBlock(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "touchBlock");
        getRv().setOnTouchListener(new C3188b(aVar));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveGiftTagView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        mo3238c(context);
    }
}
