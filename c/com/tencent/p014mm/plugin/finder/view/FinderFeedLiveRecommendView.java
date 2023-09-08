package com.tencent.p014mm.plugin.finder.view;

import ak1.C54067f0;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import di3.C86312j;
import er1.C58739j4;
import gg1.C32444a;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.HashMap;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import p565ir.C60606n;
import rx3.C13601g;
import rx3.C36568h;
import sk1.C63947a;
import te3.C64273c21;
import up1.C37521f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001FB\u0019\b\u0016\u0012\u0006\u0010>\u001a\u00020\u0002\u0012\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010BB!\b\u0016\u0012\u0006\u0010>\u001a\u00020\u0002\u0012\u0006\u0010@\u001a\u00020?\u0012\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bA\u0010ER\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010)\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b&\u0010\f\u001a\u0004\b'\u0010\u000e\"\u0004\b(\u0010\u0010R,\u00102\u001a\f\u0012\b\u0012\u00060+R\u00020\u00000*8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001b\u00108\u001a\u0002038BX\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001b\u0010=\u001a\u0002098BX\u0002¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b;\u0010<¨\u0006G"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "e", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "mContext", "Landroid/view/View;", "f", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "setRoot", "(Landroid/view/View;)V", "root", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "g", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "getRecyclerView", "()Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "setRecyclerView", "(Lcom/tencent/mm/view/recyclerview/WxRecyclerView;)V", "recyclerView", "h", "getStatusIcon", "setStatusIcon", "statusIcon", "Landroid/widget/TextView;", "i", "Landroid/widget/TextView;", "getEntryTextView", "()Landroid/widget/TextView;", "setEntryTextView", "(Landroid/widget/TextView;)V", "entryTextView", "j", "getEntryBg", "setEntryBg", "entryBg", "Landroidx/recyclerview/widget/RecyclerView$e;", "Lcom/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView$a;", "n", "Landroidx/recyclerview/widget/RecyclerView$e;", "getAdapter", "()Landroidx/recyclerview/widget/RecyclerView$e;", "setAdapter", "(Landroidx/recyclerview/widget/RecyclerView$e;)V", "adapter", "Lcom/tencent/mm/sdk/platformtools/MTimerHandler;", "y", "Lrx3/g;", "getTimeHandler", "()Lcom/tencent/mm/sdk/platformtools/MTimerHandler;", "timeHandler", "Lcom/tencent/mm/sdk/platformtools/MMHandler;", "z", "getHandlerForEmptyTips", "()Lcom/tencent/mm/sdk/platformtools/MMHandler;", "handlerForEmptyTips", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderFeedLiveRecommendView */
public final class FinderFeedLiveRecommendView extends FrameLayout {

    /* renamed from: A */
    public static final /* synthetic */ int f17754A = 0;

    /* renamed from: d */
    public final String f17755d = "FinderFeedLiveRecommendView";

    /* renamed from: e */
    public Context f17756e;

    /* renamed from: f */
    public View f17757f;

    /* renamed from: g */
    public WxRecyclerView f17758g;

    /* renamed from: h */
    public View f17759h;

    /* renamed from: i */
    public TextView f17760i;

    /* renamed from: j */
    public View f17761j;

    /* renamed from: n */
    public RecyclerView.C16613e<C3951a> f17762n;

    /* renamed from: o */
    public LinkedList<String> f17763o;

    /* renamed from: p */
    public final long f17764p = 3000;

    /* renamed from: q */
    public long f17765q = 10000;

    /* renamed from: r */
    public boolean f17766r;

    /* renamed from: s */
    public int f17767s = 3;

    /* renamed from: t */
    public volatile boolean f17768t;

    /* renamed from: u */
    public boolean f17769u;

    /* renamed from: v */
    public boolean f17770v;

    /* renamed from: w */
    public final HashMap<String, String> f17771w = new HashMap<>();

    /* renamed from: x */
    public MTimerHandler.CallBack f17772x = new C4136o2(this);

    /* renamed from: y */
    public final C13601g f17773y = C36568h.m40985a(new C4170s2(this));

    /* renamed from: z */
    public final C13601g f17774z = C36568h.m40985a(new C4153q2(this));

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderFeedLiveRecommendView$a */
    public final class C3951a extends RecyclerView.C16631z {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3951a(FinderFeedLiveRecommendView finderFeedLiveRecommendView, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderFeedLiveRecommendView$b */
    public static final class C3952b extends RecyclerView.C16613e<C3951a> {

        /* renamed from: d */
        public final /* synthetic */ Context f17775d;

        /* renamed from: e */
        public final /* synthetic */ FinderFeedLiveRecommendView f17776e;

        public C3952b(Context context, FinderFeedLiveRecommendView finderFeedLiveRecommendView) {
            this.f17775d = context;
            this.f17776e = finderFeedLiveRecommendView;
        }

        public int getItemCount() {
            LinkedList<String> linkedList = this.f17776e.f17763o;
            if (linkedList != null) {
                return linkedList.size();
            }
            return 0;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            String str;
            int i2 = i;
            C3951a aVar = (C3951a) zVar;
            C87412m.m108594g(aVar, "holder");
            TextView textView = (TextView) aVar.f44854d.findViewById(C0966R.C0970id.dy_);
            C85875k4.m106189j0(textView.getPaint(), 0.8f);
            LinkedList<String> linkedList = this.f17776e.f17763o;
            if (linkedList == null || (str = linkedList.get(i2)) == null) {
                str = "";
            }
            textView.setText(str);
            if (i2 == 1) {
                View view = aVar.f44854d;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(Float.valueOf(1.0f));
                View view2 = view;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView$init$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView$init$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                return;
            }
            View view3 = aVar.f44854d;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(Float.valueOf(0.0f));
            View view4 = view3;
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView$init$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView$init$1", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = C85868k2.m106137b(this.f17775d).inflate(C0966R.C0971layout.f359686ab2, viewGroup, false);
            FinderFeedLiveRecommendView finderFeedLiveRecommendView = this.f17776e;
            C87412m.m108593f(inflate, "view");
            return new C3951a(finderFeedLiveRecommendView, inflate);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFeedLiveRecommendView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        mo4528e(context);
    }

    /* renamed from: c */
    public static final void m4163c(FinderFeedLiveRecommendView finderFeedLiveRecommendView) {
        String str;
        WxRecyclerView recyclerView = finderFeedLiveRecommendView.getRecyclerView();
        int i = finderFeedLiveRecommendView.f17767s;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(recyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView", "scrollToNext", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView", "scrollToNext", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        int i2 = finderFeedLiveRecommendView.f17767s;
        RecyclerView.C16631z I0 = finderFeedLiveRecommendView.getRecyclerView().mo17023I0(i2 - 2);
        RecyclerView.C16631z I02 = finderFeedLiveRecommendView.getRecyclerView().mo17023I0(i2 - 1);
        C58739j4 j4Var = C58739j4.f168176a;
        if (!(I0 == null || I02 == null)) {
            long j = finderFeedLiveRecommendView.f17766r ? 200 : 800;
            ObjectAnimator duration = ObjectAnimator.ofFloat(I0.f44854d, "alpha", new float[]{1.0f, 0.0f}).setDuration(j);
            C87412m.m108593f(duration, "ofFloat(outing.itemView,…0f).setDuration(duration)");
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(I02.f44854d, "alpha", new float[]{0.0f, 1.0f}).setDuration(j);
            C87412m.m108593f(duration2, "ofFloat(entering.itemVie…1f).setDuration(duration)");
            duration.start();
            duration2.start();
        }
        LinkedList<String> linkedList = finderFeedLiveRecommendView.f17763o;
        if (linkedList != null && (str = linkedList.get(finderFeedLiveRecommendView.f17767s - 3)) != null) {
            finderFeedLiveRecommendView.mo4530g(false, finderFeedLiveRecommendView.f17767s - 2, str);
        }
    }

    /* access modifiers changed from: private */
    public final MMHandler getHandlerForEmptyTips() {
        return (MMHandler) this.f17774z.getValue();
    }

    /* access modifiers changed from: private */
    public final MTimerHandler getTimeHandler() {
        return (MTimerHandler) this.f17773y.getValue();
    }

    /* renamed from: d */
    public final void mo4527d() {
        getTimeHandler().stopTimer();
        getHandlerForEmptyTips().removeCallbacksAndMessages((Object) null);
        this.f17767s = 3;
        this.f17763o = null;
        this.f17768t = false;
        this.f17769u = false;
        View entryBg = getEntryBg();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(0.0f));
        C117292a.m165358d(entryBg, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView", "clearAll", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        entryBg.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(entryBg, "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView", "clearAll", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f17770v = false;
        this.f17771w.clear();
        Log.m105924i(this.f17755d, "[clearAll]");
    }

    /* renamed from: e */
    public final void mo4528e(Context context) {
        Log.m105924i(this.f17755d, "[init]");
        setMContext(context);
        C37521f.f99374d.getClass();
        this.f17765q = C37521f.f99294T6.mo60266n().longValue() * 1000;
        C32444a aVar = C32444a.f86121a;
        boolean z = true;
        if (C32444a.f86164k2.mo60266n().intValue() != 1) {
            z = false;
        }
        this.f17766r = z;
        View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.f359685ab1, this);
        C87412m.m108593f(inflate, "getInflater(context)\n   …mend_banner_layout, this)");
        setRoot(inflate);
        View findViewById = getRoot().findViewById(C0966R.C0970id.dy9);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.f…er_live_recommend_banner)");
        setRecyclerView((WxRecyclerView) findViewById);
        ViewGroup.LayoutParams layoutParams = getRecyclerView().getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        if (this.f17766r) {
            layoutParams2.topMargin = (int) context.getResources().getDimension(C0966R.dimen.f3753d4);
        } else {
            layoutParams2.topMargin = (int) context.getResources().getDimension(C0966R.dimen.f3736cp);
        }
        getRecyclerView().setLayoutParams(layoutParams2);
        View findViewById2 = getRoot().findViewById(C0966R.C0970id.f358598g10);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.living_status_icon)");
        setStatusIcon(findViewById2);
        View findViewById3 = getRoot().findViewById(C0966R.C0970id.d9n);
        C87412m.m108593f(findViewById3, "root.findViewById(R.id.finder_feed_live_entry_bg)");
        setEntryBg(findViewById3);
        if (this.f17766r) {
            View findViewById4 = getRoot().findViewById(C0966R.C0970id.mqr);
            C87412m.m108593f(findViewById4, "root.findViewById(R.id.f…entry_txt_without_shadow)");
            setEntryTextView((TextView) findViewById4);
            View findViewById5 = getRoot().findViewById(C0966R.C0970id.dkf);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view = findViewById5;
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            getEntryBg().setBackground(context.getDrawable(C0966R.C0969drawable.b8l));
            View entryBg = getEntryBg();
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(Float.valueOf(1.0f));
            View view2 = entryBg;
            C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            entryBg.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        } else {
            View findViewById6 = getRoot().findViewById(C0966R.C0970id.dkf);
            C87412m.m108593f(findViewById6, "root.findViewById(R.id.finder_live_entry_txt)");
            setEntryTextView((TextView) findViewById6);
            View findViewById7 = getRoot().findViewById(C0966R.C0970id.mqr);
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar4.mo10233c(8);
            View view3 = findViewById7;
            C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            getEntryBg().setBackground(context.getDrawable(C0966R.C0969drawable.f5101wu));
        }
        getEntryTextView().setVisibility(0);
        C85875k4.m106189j0(getEntryTextView().getPaint(), 0.8f);
        FinderLinearLayoutManager finderLinearLayoutManager = new FinderLinearLayoutManager(context);
        finderLinearLayoutManager.f162360w = 1000.0f;
        getRecyclerView().setLayoutManager(finderLinearLayoutManager);
        setAdapter(new C3952b(context, this));
        getRecyclerView().setAdapter(getAdapter());
    }

    /* renamed from: f */
    public final synchronized void mo4529f() {
        if (this.f17768t) {
            if (!getTimeHandler().stopped()) {
                getTimeHandler().stopTimer();
                this.f17770v = true;
                Log.m105924i(this.f17755d, "[pauseRecommendTipsAnim] success 1");
            } else if (getHandlerForEmptyTips().hasMessages(1)) {
                getHandlerForEmptyTips().removeCallbacksAndMessages((Object) null);
                Log.m105924i(this.f17755d, "[pauseRecommendTipsAnim] success 2");
            }
            Log.m105924i(this.f17755d, "[pauseRecommendTipsAnim] success ");
        } else {
            Log.m105924i(this.f17755d, "[pauseRecommendTipsAnim] timeHandler stopped or not Started ,return");
        }
    }

    /* renamed from: g */
    public final void mo4530g(boolean z, int i, String str) {
        Log.m105924i(this.f17755d, "report23057");
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.f17771w);
        hashMap.put("button_colour", z ? "1" : "0");
        if (!z) {
            LinkedList<String> linkedList = this.f17763o;
            boolean z2 = false;
            if (linkedList != null && (!linkedList.isEmpty())) {
                z2 = true;
            }
            if (z2) {
                hashMap.put("text_index", String.valueOf(i));
                hashMap.put("text_value", str);
            }
        }
        ((C8777j5) C86312j.m106911c(C8777j5.class)).mo9602Jz(C54067f0.C0066n.TIMELINE_BTN_SHOW, hashMap);
    }

    public final RecyclerView.C16613e<C3951a> getAdapter() {
        RecyclerView.C16613e<C3951a> eVar = this.f17762n;
        if (eVar != null) {
            return eVar;
        }
        C87412m.m108603p("adapter");
        throw null;
    }

    public final View getEntryBg() {
        View view = this.f17761j;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("entryBg");
        throw null;
    }

    public final TextView getEntryTextView() {
        TextView textView = this.f17760i;
        if (textView != null) {
            return textView;
        }
        C87412m.m108603p("entryTextView");
        throw null;
    }

    public final Context getMContext() {
        Context context = this.f17756e;
        if (context != null) {
            return context;
        }
        C87412m.m108603p("mContext");
        throw null;
    }

    public final WxRecyclerView getRecyclerView() {
        WxRecyclerView wxRecyclerView = this.f17758g;
        if (wxRecyclerView != null) {
            return wxRecyclerView;
        }
        C87412m.m108603p("recyclerView");
        throw null;
    }

    public final View getRoot() {
        View view = this.f17757f;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("root");
        throw null;
    }

    public final View getStatusIcon() {
        View view = this.f17759h;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("statusIcon");
        throw null;
    }

    /* renamed from: h */
    public final void mo4538h() {
        LinkedList<String> linkedList = this.f17763o;
        if ((linkedList != null ? linkedList.size() : 0) > 4) {
            getTimeHandler().startTimer(this.f17764p);
            if (this.f17766r) {
                View entryBg = getEntryBg();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(1.0f));
                View view = entryBg;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView", "startAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                entryBg.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView", "startAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            this.f17770v = false;
            return;
        }
        LinkedList<String> linkedList2 = this.f17763o;
        if ((linkedList2 != null ? linkedList2.size() : 0) == 4) {
            if (this.f17766r) {
                View entryBg2 = getEntryBg();
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(Float.valueOf(1.0f));
                View view2 = entryBg2;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView", "startAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                entryBg2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView", "startAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            } else {
                getHandlerForEmptyTips().sendEmptyMessageDelayed(1, this.f17765q);
            }
            this.f17770v = false;
            return;
        }
        LinkedList<String> linkedList3 = this.f17763o;
        if ((linkedList3 != null ? linkedList3.size() : 0) == 3) {
            if (this.f17766r) {
                View entryBg3 = getEntryBg();
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(Float.valueOf(1.0f));
                View view3 = entryBg3;
                C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView", "startAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                entryBg3.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView", "startAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            } else {
                getHandlerForEmptyTips().sendEmptyMessageDelayed(1, this.f17765q);
            }
            this.f17770v = false;
            return;
        }
        Log.m105924i(this.f17755d, "[startAnim] not start");
    }

    /* renamed from: i */
    public final void mo4539i(C64273c21 c212, int i) {
        Long l = null;
        if (((C60606n) C86312j.m106911c(C60606n.class)).mo85075nB(c212)) {
            boolean a = c212 != null ? C63947a.f181274a.mo88716a(c212, "") : false;
            String str = this.f17755d;
            StringBuilder sb = new StringBuilder();
            sb.append("update live is charge live:");
            if (c212 != null) {
                l = Long.valueOf(c212.f182392d);
            }
            sb.append(l);
            sb.append(",chargeLiveCanPlay:");
            sb.append(a);
            Log.m105924i(str, sb.toString());
            View statusIcon = getStatusIcon();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = statusIcon;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView", "update", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            statusIcon.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView", "update", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (a) {
                getEntryTextView().setText(MMApplicationContext.getContext().getResources().getString(C0966R.string.dkw));
            } else {
                getEntryTextView().setText(MMApplicationContext.getContext().getResources().getString(C0966R.string.dkx));
            }
        } else if (i == 1) {
            View statusIcon2 = getStatusIcon();
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view2 = statusIcon2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView", "update", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            statusIcon2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView", "update", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            getEntryTextView().setText(MMApplicationContext.getContext().getResources().getString(C0966R.string.dkv));
        } else {
            getEntryTextView().setText(MMApplicationContext.getContext().getResources().getString(C0966R.string.dkt));
            getTimeHandler().stopTimer();
            getHandlerForEmptyTips().removeCallbacksAndMessages((Object) null);
            getRecyclerView().setVisibility(4);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final void setAdapter(RecyclerView.C16613e<C3951a> eVar) {
        C87412m.m108594g(eVar, "<set-?>");
        this.f17762n = eVar;
    }

    public final void setEntryBg(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f17761j = view;
    }

    public final void setEntryTextView(TextView textView) {
        C87412m.m108594g(textView, "<set-?>");
        this.f17760i = textView;
    }

    public final void setMContext(Context context) {
        C87412m.m108594g(context, "<set-?>");
        this.f17756e = context;
    }

    public final void setRecyclerView(WxRecyclerView wxRecyclerView) {
        C87412m.m108594g(wxRecyclerView, "<set-?>");
        this.f17758g = wxRecyclerView;
    }

    public final void setRoot(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f17757f = view;
    }

    public final void setStatusIcon(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f17759h = view;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFeedLiveRecommendView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        mo4528e(context);
    }
}
