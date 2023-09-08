package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.flow.FlowLayoutManager;
import com.tencent.p014mm.plugin.finder.feed.model.C2815r0;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import er1.C58784w3;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import jq3.C60898l;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import nf1.C11157g;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import sx3.C36907w;
import sx3.C64197v;
import te3.C49016cl;
import te3.C49160dl;
import vq1.C14951b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001fB\u001b\b\u0016\u0012\u0006\u0010^\u001a\u00020]\u0012\b\u0010`\u001a\u0004\u0018\u00010_¢\u0006\u0004\ba\u0010bB#\b\u0016\u0012\u0006\u0010^\u001a\u00020]\u0012\b\u0010`\u001a\u0004\u0018\u00010_\u0012\u0006\u0010d\u001a\u00020c¢\u0006\u0004\ba\u0010eJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007J\u0016\u0010\n\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007R\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001d\u001a\u00020\u00168BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u001c\u0010\u0019R'\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u001ej\b\u0012\u0004\u0012\u00020\u0003`\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R*\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010%8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R6\u00105\u001a\u0016\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u0005\u0018\u00010-8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R0\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u0001068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010D\u001a\u00020.8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010L\u001a\u0004\u0018\u00010E8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR$\u0010T\u001a\u0004\u0018\u00010M8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010\\\u001a\u00020U8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[¨\u0006g"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderWordingLayout;", "Landroid/widget/FrameLayout;", "", "Lcom/tencent/mm/plugin/finder/feed/model/r0;", "list", "Lrx3/b0;", "setWordingList", "Ljq3/l$b;", "Ljq3/o;", "listener", "setItemClickListener", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "d", "Lrx3/g;", "getRecyclerView", "()Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "recyclerView", "Landroid/view/View;", "e", "getManageBtn", "()Landroid/view/View;", "manageBtn", "Landroid/widget/TextView;", "f", "getManageBtnText", "()Landroid/widget/TextView;", "manageBtnText", "g", "getTitleTv", "titleTv", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "h", "Ljava/util/ArrayList;", "getDataList", "()Ljava/util/ArrayList;", "dataList", "Lkotlin/Function0;", "i", "Lfy3/a;", "getSizeChangeListener", "()Lfy3/a;", "setSizeChangeListener", "(Lfy3/a;)V", "sizeChangeListener", "Lkotlin/Function2;", "Lcom/tencent/mm/plugin/finder/view/FinderWordingLayout$a;", "j", "Lfy3/p;", "getOnModeChangeListener", "()Lfy3/p;", "setOnModeChangeListener", "(Lfy3/p;)V", "onModeChangeListener", "Lkotlin/Function1;", "n", "Lfy3/l;", "getItemRemoveListener", "()Lfy3/l;", "setItemRemoveListener", "(Lfy3/l;)V", "itemRemoveListener", "o", "Lcom/tencent/mm/plugin/finder/view/FinderWordingLayout$a;", "getCurrMode", "()Lcom/tencent/mm/plugin/finder/view/FinderWordingLayout$a;", "setCurrMode", "(Lcom/tencent/mm/plugin/finder/view/FinderWordingLayout$a;)V", "currMode", "Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;", "p", "Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;", "getFeed", "()Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;", "setFeed", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "feed", "Lte3/dl;", "q", "Lte3/dl;", "getData", "()Lte3/dl;", "setData", "(Lte3/dl;)V", "data", "", "r", "Z", "getSelfFlag", "()Z", "setSelfFlag", "(Z)V", "selfFlag", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderWordingLayout */
public final class FinderWordingLayout extends FrameLayout {

    /* renamed from: s */
    public static final /* synthetic */ int f17970s = 0;

    /* renamed from: d */
    public final C13601g f17971d = C36568h.m40985a(new C4201w5(this));

    /* renamed from: e */
    public final C13601g f17972e = C36568h.m40985a(new C4186u5(this));

    /* renamed from: f */
    public final C13601g f17973f = C36568h.m40985a(new C4196v5(this));

    /* renamed from: g */
    public final C13601g f17974g = C36568h.m40985a(new C4211x5(this));

    /* renamed from: h */
    public final ArrayList<C2815r0> f17975h;

    /* renamed from: i */
    public C32224a<C13598b0> f17976i;

    /* renamed from: j */
    public C32227p<? super C3984a, ? super C3984a, C13598b0> f17977j;

    /* renamed from: n */
    public C32226l<? super C2815r0, C13598b0> f17978n;

    /* renamed from: o */
    public C3984a f17979o;

    /* renamed from: p */
    public BaseFinderFeed f17980p;

    /* renamed from: q */
    public C49160dl f17981q;

    /* renamed from: r */
    public boolean f17982r;

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderWordingLayout$a */
    public enum C3984a {
        NORMAL,
        MANAGE
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderWordingLayout$b */
    public static final class C3985b implements C60898l.C9502b<C60905o> {

        /* renamed from: d */
        public final /* synthetic */ FinderWordingLayout f17986d;

        /* renamed from: e */
        public final /* synthetic */ C60898l.C9502b<C60905o> f17987e;

        public C3985b(FinderWordingLayout finderWordingLayout, C60898l.C9502b<C60905o> bVar) {
            this.f17986d = finderWordingLayout;
            this.f17987e = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0034  */
        /* renamed from: q */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo734q(androidx.recyclerview.widget.RecyclerView.C16613e r3, android.view.View r4, int r5, androidx.recyclerview.widget.RecyclerView.C16631z r6) {
            /*
                r2 = this;
                jq3.o r6 = (jq3.C60905o) r6
                java.lang.String r0 = "adapter"
                gy3.C87412m.m108594g(r3, r0)
                java.lang.String r0 = "view"
                gy3.C87412m.m108594g(r4, r0)
                java.lang.String r0 = "holder"
                gy3.C87412m.m108594g(r6, r0)
                com.tencent.mm.plugin.finder.view.FinderWordingLayout r0 = r2.f17986d
                boolean r0 = r0.getSelfFlag()
                if (r0 == 0) goto L_0x002d
                er1.w3 r0 = er1.C58784w3.f168295a
                com.tencent.mm.plugin.finder.view.FinderWordingLayout r1 = r2.f17986d
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r1.getFeed()
                gy3.C87412m.m108591d(r1)
                boolean r0 = r0.mo83897Q0(r1)
                if (r0 == 0) goto L_0x002d
                r0 = 1
                goto L_0x002e
            L_0x002d:
                r0 = 0
            L_0x002e:
                if (r0 != 0) goto L_0x0037
                jq3.l$b<jq3.o> r0 = r2.f17987e
                if (r0 == 0) goto L_0x0037
                r0.mo734q(r3, r4, r5, r6)
            L_0x0037:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.FinderWordingLayout.C3985b.mo734q(androidx.recyclerview.widget.RecyclerView$e, android.view.View, int, androidx.recyclerview.widget.RecyclerView$z):void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderWordingLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        ArrayList<C2815r0> arrayList = new ArrayList<>();
        this.f17975h = arrayList;
        this.f17979o = C3984a.NORMAL;
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.clt, this, true);
        WxRecyclerView recyclerView = getRecyclerView();
        FlowLayoutManager flowLayoutManager = new FlowLayoutManager();
        flowLayoutManager.f52469q = new C4148p5(this);
        flowLayoutManager.f52470r = new C4156q5(this);
        recyclerView.setLayoutManager(flowLayoutManager);
        getRecyclerView().setAdapter(new WxRecyclerAdapter(new FinderWordingLayout$buildItemCoverts$1(this), arrayList, false));
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(C0966R.dimen.f3766df);
        getRecyclerView().mo17085h0(new C11157g(dimensionPixelOffset, dimensionPixelOffset));
        getManageBtn().setOnClickListener(new C4164r5(this));
    }

    /* renamed from: d */
    public static void m4234d(FinderWordingLayout finderWordingLayout, boolean z, int i, Object obj) {
        boolean z2 = true;
        if ((i & 1) != 0) {
            z = false;
        }
        BaseFinderFeed baseFinderFeed = finderWordingLayout.f17980p;
        if (baseFinderFeed != null) {
            C3984a aVar = finderWordingLayout.f17979o;
            if (!finderWordingLayout.f17982r || !C58784w3.f168295a.mo83897Q0(baseFinderFeed)) {
                z2 = false;
            }
            finderWordingLayout.getTitleTv().setText(z2 ? finderWordingLayout.getContext().getString(C0966R.string.lum) : finderWordingLayout.getContext().getString(C0966R.string.luk));
            TextView titleTv = finderWordingLayout.getTitleTv();
            String str = null;
            if (z2) {
                C49160dl dlVar = finderWordingLayout.f17981q;
                if (!Util.isNullOrNil(dlVar != null ? dlVar.f132391h : null)) {
                    C49160dl dlVar2 = finderWordingLayout.f17981q;
                    if (dlVar2 != null) {
                        str = dlVar2.f132391h;
                    }
                } else {
                    str = finderWordingLayout.getContext().getString(C0966R.string.lum);
                }
            } else {
                C49160dl dlVar3 = finderWordingLayout.f17981q;
                if (!Util.isNullOrNil(dlVar3 != null ? dlVar3.f132388e : null)) {
                    C49160dl dlVar4 = finderWordingLayout.f17981q;
                    if (dlVar4 != null) {
                        str = dlVar4.f132388e;
                    }
                } else {
                    str = finderWordingLayout.getContext().getString(C0966R.string.luk);
                }
            }
            titleTv.setText(str);
            finderWordingLayout.getManageBtn().setBackgroundResource(C0966R.C0969drawable.b6i);
            finderWordingLayout.getManageBtnText().setText(C0966R.string.a08);
            finderWordingLayout.getManageBtnText().setTextColor(finderWordingLayout.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_6));
            finderWordingLayout.f17979o = C3984a.NORMAL;
            C14951b0 b0Var = C14951b0.f40992g;
            BaseFinderFeed baseFinderFeed2 = finderWordingLayout.f17980p;
            C87412m.m108591d(baseFinderFeed2);
            long itemId = baseFinderFeed2.getItemId();
            C3984a aVar2 = finderWordingLayout.f17979o;
            b0Var.getClass();
            C87412m.m108594g(aVar2, "mode");
            b0Var.f40996d.put(Long.valueOf(itemId), aVar2);
            finderWordingLayout.mo4762f(aVar, finderWordingLayout.f17979o, z);
        }
    }

    private final View getManageBtn() {
        Object value = this.f17972e.getValue();
        C87412m.m108593f(value, "<get-manageBtn>(...)");
        return (View) value;
    }

    private final TextView getManageBtnText() {
        Object value = this.f17973f.getValue();
        C87412m.m108593f(value, "<get-manageBtnText>(...)");
        return (TextView) value;
    }

    private final WxRecyclerView getRecyclerView() {
        Object value = this.f17971d.getValue();
        C87412m.m108593f(value, "<get-recyclerView>(...)");
        return (WxRecyclerView) value;
    }

    private final TextView getTitleTv() {
        Object value = this.f17974g.getValue();
        C87412m.m108593f(value, "<get-titleTv>(...)");
        return (TextView) value;
    }

    /* renamed from: a */
    public final void mo4758a(BaseFinderFeed baseFinderFeed, C49160dl dlVar, C60898l.C9502b<C60905o> bVar, boolean z) {
        BaseFinderFeed baseFinderFeed2 = baseFinderFeed;
        C49160dl dlVar2 = dlVar;
        boolean z2 = z;
        C87412m.m108594g(baseFinderFeed2, "item");
        LinkedList<C49016cl> linkedList = dlVar2 != null ? dlVar2.f132389f : null;
        this.f17980p = baseFinderFeed2;
        this.f17981q = dlVar2;
        this.f17982r = z2;
        RecyclerView.LayoutManager layoutManager = getRecyclerView().getLayoutManager();
        FlowLayoutManager flowLayoutManager = layoutManager instanceof FlowLayoutManager ? (FlowLayoutManager) layoutManager : null;
        if (flowLayoutManager != null) {
            flowLayoutManager.f52467o = this.f17982r ? Integer.MAX_VALUE : 2;
        }
        if (dlVar2 == null || Util.isNullOrNil((List) linkedList)) {
            setVisibility(8);
            setItemClickListener((C60898l.C9502b<C60905o>) null);
            return;
        }
        m4234d(this, false, 1, (Object) null);
        if (this.f17982r && C58784w3.f168295a.mo83897Q0(baseFinderFeed2)) {
            View manageBtn = getManageBtn();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = manageBtn;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderWordingLayout", "checkSelf", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            manageBtn.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/FinderWordingLayout", "checkSelf", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View manageBtn2 = getManageBtn();
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view2 = manageBtn2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderWordingLayout", "checkSelf", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            manageBtn2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/FinderWordingLayout", "checkSelf", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C87412m.m108591d(linkedList);
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
        for (C49016cl clVar : linkedList) {
            C87412m.m108593f(clVar, LocaleUtil.ITALIAN);
            C2815r0 r0Var = new C2815r0();
            r0Var.f14070h = baseFinderFeed.getItemId();
            r0Var.f14071i = z2 && C58784w3.f168295a.mo83897Q0(baseFinderFeed2);
            r0Var.f131802d = clVar.f131802d;
            r0Var.f131803e = clVar.f131803e;
            r0Var.f131804f = clVar.f131804f;
            r0Var.f131805g = clVar.f131805g;
            arrayList.add(r0Var);
        }
        setWordingList(arrayList);
        setItemClickListener(bVar);
    }

    /* renamed from: b */
    public final void mo4759b(long j, long j2) {
        Iterator<C2815r0> it = this.f17975h.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            C2815r0 next = it.next();
            if (next.f14070h == j && next.f131802d == j2) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            C2815r0 remove = this.f17975h.remove(i);
            C87412m.m108593f(remove, "dataList.removeAt(index)");
            C2815r0 r0Var = remove;
            RecyclerView.C16613e adapter = getRecyclerView().getAdapter();
            if (adapter != null) {
                adapter.notifyItemRemoved(i);
            }
            RecyclerView.C16613e adapter2 = getRecyclerView().getAdapter();
            if (adapter2 != null) {
                adapter2.notifyItemRangeChanged(i, this.f17975h.size() - i);
            }
            C32226l<? super C2815r0, C13598b0> lVar = this.f17978n;
            if (lVar != null) {
                lVar.invoke(r0Var);
            }
        }
    }

    /* renamed from: c */
    public final void mo4760c() {
        BaseFinderFeed baseFinderFeed = this.f17980p;
        if (baseFinderFeed != null) {
            if (this.f17982r && C58784w3.f168295a.mo83897Q0(baseFinderFeed)) {
                C3984a aVar = this.f17979o;
                TextView titleTv = getTitleTv();
                C49160dl dlVar = this.f17981q;
                String str = null;
                if (!Util.isNullOrNil(dlVar != null ? dlVar.f132390g : null)) {
                    C49160dl dlVar2 = this.f17981q;
                    if (dlVar2 != null) {
                        str = dlVar2.f132390g;
                    }
                } else {
                    str = getContext().getString(C0966R.string.lul);
                }
                titleTv.setText(str);
                getManageBtn().setBackgroundResource(C0966R.C0969drawable.b6j);
                getManageBtnText().setText(C0966R.string.f360479d42);
                getManageBtnText().setTextColor(getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
                this.f17979o = C3984a.MANAGE;
                C14951b0 b0Var = C14951b0.f40992g;
                BaseFinderFeed baseFinderFeed2 = this.f17980p;
                C87412m.m108591d(baseFinderFeed2);
                long itemId = baseFinderFeed2.getItemId();
                C3984a aVar2 = this.f17979o;
                b0Var.getClass();
                C87412m.m108594g(aVar2, "mode");
                b0Var.f40996d.put(Long.valueOf(itemId), aVar2);
                mo4762f(aVar, this.f17979o, false);
            }
        }
    }

    /* renamed from: e */
    public final void mo4761e() {
        RecyclerView.C16613e adapter = getRecyclerView().getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: f */
    public final void mo4762f(C3984a aVar, C3984a aVar2, boolean z) {
        Log.m105924i("Finder.FinderWordingView", "onModeChange from: " + aVar + " to: " + aVar2);
        C32227p<? super C3984a, ? super C3984a, C13598b0> pVar = this.f17977j;
        if (pVar != null) {
            pVar.invoke(aVar, aVar2);
        }
    }

    /* renamed from: g */
    public final void mo4763g(long j, long j2) {
        int i;
        T t;
        boolean z;
        Iterator<T> it = this.f17975h.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            C2815r0 r0Var = (C2815r0) t;
            if (r0Var.f14070h == j && r0Var.f131802d == j2) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C2815r0 r0Var2 = (C2815r0) t;
        if (r0Var2 != null) {
            for (T next : this.f17975h) {
                int i2 = i + 1;
                if (i >= 0) {
                    if (((C2815r0) next).f131802d == r0Var2.f131802d) {
                        if (i > 0 && i < this.f17975h.size()) {
                            this.f17975h.set(i, r0Var2);
                        }
                        RecyclerView.C16613e adapter = getRecyclerView().getAdapter();
                        if (adapter != null) {
                            adapter.notifyItemChanged(i);
                        }
                    }
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
    }

    public final C3984a getCurrMode() {
        return this.f17979o;
    }

    public final C49160dl getData() {
        return this.f17981q;
    }

    public final ArrayList<C2815r0> getDataList() {
        return this.f17975h;
    }

    public final BaseFinderFeed getFeed() {
        return this.f17980p;
    }

    public final C32226l<C2815r0, C13598b0> getItemRemoveListener() {
        return this.f17978n;
    }

    public final C32227p<C3984a, C3984a, C13598b0> getOnModeChangeListener() {
        return this.f17977j;
    }

    public final boolean getSelfFlag() {
        return this.f17982r;
    }

    public final C32224a<C13598b0> getSizeChangeListener() {
        return this.f17976i;
    }

    public final void setCurrMode(C3984a aVar) {
        C87412m.m108594g(aVar, "<set-?>");
        this.f17979o = aVar;
    }

    public final void setData(C49160dl dlVar) {
        this.f17981q = dlVar;
    }

    public final void setFeed(BaseFinderFeed baseFinderFeed) {
        this.f17980p = baseFinderFeed;
    }

    public final void setItemClickListener(C60898l.C9502b<C60905o> bVar) {
        RecyclerView.C16613e adapter = getRecyclerView().getAdapter();
        if (adapter != null && (adapter instanceof WxRecyclerAdapter)) {
            ((WxRecyclerAdapter) adapter).f173488o = new C3985b(this, bVar);
        }
    }

    public final void setItemRemoveListener(C32226l<? super C2815r0, C13598b0> lVar) {
        this.f17978n = lVar;
    }

    public final void setOnModeChangeListener(C32227p<? super C3984a, ? super C3984a, C13598b0> pVar) {
        this.f17977j = pVar;
    }

    public final void setSelfFlag(boolean z) {
        this.f17982r = z;
    }

    public final void setSizeChangeListener(C32224a<C13598b0> aVar) {
        this.f17976i = aVar;
    }

    public final void setWordingList(List<C2815r0> list) {
        C87412m.m108594g(list, "list");
        this.f17975h.clear();
        ArrayList<C2815r0> arrayList = this.f17975h;
        C14951b0 b0Var = C14951b0.f40992g;
        C14951b0 b0Var2 = C14951b0.f40992g;
        b0Var2.getClass();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i = 0;
        for (T next : list) {
            int i2 = i + 1;
            if (i >= 0) {
                C2815r0 r0Var = (C2815r0) next;
                C87412m.m108594g(r0Var, "wordingItem");
                Boolean bool = b0Var2.f40997e.get(new C14951b0.C14952a(r0Var.f14070h, r0Var.f131802d));
                if (!(bool == null ? false : bool.booleanValue())) {
                    arrayList2.add(r0Var);
                } else {
                    arrayList3.add(Integer.valueOf(i));
                }
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        arrayList.addAll(arrayList2);
        RecyclerView.C16613e adapter = getRecyclerView().getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderWordingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        ArrayList<C2815r0> arrayList = new ArrayList<>();
        this.f17975h = arrayList;
        this.f17979o = C3984a.NORMAL;
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.clt, this, true);
        WxRecyclerView recyclerView = getRecyclerView();
        FlowLayoutManager flowLayoutManager = new FlowLayoutManager();
        flowLayoutManager.f52469q = new C4148p5(this);
        flowLayoutManager.f52470r = new C4156q5(this);
        recyclerView.setLayoutManager(flowLayoutManager);
        getRecyclerView().setAdapter(new WxRecyclerAdapter(new FinderWordingLayout$buildItemCoverts$1(this), arrayList, false));
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(C0966R.dimen.f3766df);
        getRecyclerView().mo17085h0(new C11157g(dimensionPixelOffset, dimensionPixelOffset));
        getManageBtn().setOnClickListener(new C4164r5(this));
    }
}
