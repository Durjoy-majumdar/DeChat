package com.tencent.p014mm.plugin.finder.live.widget;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.camera.core.FocusMeteringAction;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.widget.MMRoundCornerImageView;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.view.RecyclerHorizontalViewPager;
import eb0.C31543z5;
import er1.C58777u0;
import gy3.C45983e0;
import gy3.C87412m;
import ht1.C60200t1;
import il1.C60455l6;
import java.util.LinkedList;
import java.util.List;
import kg3.C76577a;
import kotlin.Metadata;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import te3.C50027jr1;
import te3.C50222l61;
import up1.C27696y;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u00049:;\tB\u0019\b\u0016\u0012\u0006\u00101\u001a\u00020!\u0012\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105B!\b\u0016\u0012\u0006\u00101\u001a\u00020!\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00107\u001a\u000206¢\u0006\u0004\b4\u00108J\u0014\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R,\u0010 \u001a\f\u0012\b\u0012\u00060\u0019R\u00020\u00000\u00188\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u00100\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u0006<"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveTaskBannerView;", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/view/RecyclerHorizontalViewPager$a;", "", "Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveTaskBannerView$c;", "taskInfo", "Lrx3/b0;", "setTaskInfoList", "Lcom/tencent/mm/view/RecyclerHorizontalViewPager;", "d", "Lcom/tencent/mm/view/RecyclerHorizontalViewPager;", "getPagerView", "()Lcom/tencent/mm/view/RecyclerHorizontalViewPager;", "setPagerView", "(Lcom/tencent/mm/view/RecyclerHorizontalViewPager;)V", "pagerView", "Landroid/view/View;", "e", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "setRoot", "(Landroid/view/View;)V", "root", "Landroidx/recyclerview/widget/RecyclerView$e;", "Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveTaskBannerView$d;", "f", "Landroidx/recyclerview/widget/RecyclerView$e;", "getAdapter", "()Landroidx/recyclerview/widget/RecyclerView$e;", "setAdapter", "(Landroidx/recyclerview/widget/RecyclerView$e;)V", "adapter", "Landroid/content/Context;", "h", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "mContext", "", "i", "Ljava/lang/String;", "getGameAppId", "()Ljava/lang/String;", "setGameAppId", "(Ljava/lang/String;)V", "gameAppId", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "b", "c", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView */
public final class FinderLiveTaskBannerView extends FrameLayout implements RecyclerHorizontalViewPager.C57875a {

    /* renamed from: d */
    public RecyclerHorizontalViewPager f160088d;

    /* renamed from: e */
    public View f160089e;

    /* renamed from: f */
    public RecyclerView.C16613e<C56134d> f160090f;

    /* renamed from: g */
    public LinkedList<C56133c> f160091g;

    /* renamed from: h */
    public Context f160092h;

    /* renamed from: i */
    public String f160093i;

    /* renamed from: j */
    public final int f160094j = 1;

    /* renamed from: n */
    public final long f160095n = FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION;

    /* renamed from: o */
    public final String f160096o = "FinderLiveTaskBannerView";

    /* renamed from: p */
    public volatile boolean f160097p = true;

    /* renamed from: q */
    public volatile boolean f160098q = true;

    /* renamed from: r */
    public final MMHandler f160099r = new MMHandler(Looper.getMainLooper(), (MMHandler.Callback) new C60455l6(this));

    /* renamed from: s */
    public volatile int f160100s;

    /* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView$a */
    public static final class C41479a implements C56133c {

        /* renamed from: a */
        public final C50222l61 f111699a;

        public C41479a(C50222l61 l612) {
            C87412m.m108594g(l612, "data");
            this.f111699a = l612;
        }

        /* renamed from: a */
        public void mo64567a(int i) {
            this.f111699a.f137222i = i;
        }

        /* renamed from: b */
        public int mo64568b() {
            return this.f111699a.f137222i;
        }

        /* renamed from: c */
        public String mo64569c() {
            return this.f111699a.f137218e;
        }

        /* renamed from: d */
        public long mo64570d() {
            return ((long) this.f111699a.f137223j) * 1000;
        }

        public String getH5Url() {
            return this.f111699a.f137221h;
        }

        public String getWording() {
            return this.f111699a.f137219f;
        }

        /* renamed from: n */
        public String mo64573n() {
            return this.f111699a.f137217d;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView$b */
    public static final class C41480b implements C56133c {

        /* renamed from: a */
        public final C50027jr1 f111700a;

        /* renamed from: b */
        public final long f111701b;

        public C41480b(C50027jr1 jr12, long j) {
            C87412m.m108594g(jr12, "data");
            this.f111700a = jr12;
            this.f111701b = j;
        }

        /* renamed from: a */
        public void mo64567a(int i) {
        }

        /* renamed from: b */
        public int mo64568b() {
            return -1;
        }

        /* renamed from: c */
        public String mo64569c() {
            return this.f111700a.f136275d;
        }

        /* renamed from: d */
        public long mo64570d() {
            return this.f111701b;
        }

        public String getH5Url() {
            return this.f111700a.f136276e;
        }

        public String getWording() {
            return null;
        }

        /* renamed from: n */
        public String mo64573n() {
            return this.f111700a.f136277f;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView$c */
    public interface C56133c {
        /* renamed from: a */
        void mo64567a(int i);

        /* renamed from: b */
        int mo64568b();

        /* renamed from: c */
        String mo64569c();

        /* renamed from: d */
        long mo64570d();

        String getH5Url();

        String getWording();

        /* renamed from: n */
        String mo64573n();
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView$d */
    public final class C56134d extends RecyclerView.C16631z {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56134d(FinderLiveTaskBannerView finderLiveTaskBannerView, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView$e */
    public static final class C56135e extends RecyclerView.C16613e<C56134d> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveTaskBannerView f160101d;

        /* renamed from: e */
        public final /* synthetic */ Context f160102e;

        public C56135e(FinderLiveTaskBannerView finderLiveTaskBannerView, Context context) {
            this.f160101d = finderLiveTaskBannerView;
            this.f160102e = context;
        }

        public int getItemCount() {
            LinkedList<C56133c> linkedList = this.f160101d.f160091g;
            if (linkedList != null) {
                return linkedList.size();
            }
            return 0;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C56134d dVar = (C56134d) zVar;
            Class cls = C11990s0.class;
            Class<C60200t1> cls2 = C60200t1.class;
            C87412m.m108594g(dVar, "holder");
            LinkedList<C56133c> linkedList = this.f160101d.f160091g;
            C56133c cVar = linkedList != null ? linkedList.get(i) : null;
            if (cVar != null) {
                Context context = this.f160102e;
                MMRoundCornerImageView mMRoundCornerImageView = (MMRoundCornerImageView) dVar.f44854d.findViewById(C0966R.C0970id.nv5);
                mMRoundCornerImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                C39818r rVar = C39818r.f106831a;
                ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85957c(new C11984n0(cVar.mo64569c(), C27696y.RAW_IMAGE), mMRoundCornerImageView, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.TIMELINE));
                mMRoundCornerImageView.setTag(C0966R.C0970id.f358038d51, cVar.getWording());
                mMRoundCornerImageView.setRadius(C76577a.m92151b(context, 8));
                mMRoundCornerImageView.setId(C0966R.C0970id.e07);
                ((NeatTextView) dVar.f44854d.findViewById(C0966R.C0970id.nv6)).mo104279b(cVar.getWording());
            }
            dVar.f44854d.setTag(Integer.valueOf(i));
            dVar.f44854d.setOnClickListener(new C56145c(this.f160101d, this.f160102e, this));
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = LayoutInflater.from(this.f160101d.getMContext()).inflate(C0966R.C0971layout.d4m, viewGroup, false);
            FinderLiveTaskBannerView finderLiveTaskBannerView = this.f160101d;
            C87412m.m108593f(inflate, "layout");
            return new C56134d(finderLiveTaskBannerView, inflate);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView$f */
    public static final class C56136f implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveTaskBannerView f160103d;

        public C56136f(FinderLiveTaskBannerView finderLiveTaskBannerView) {
            this.f160103d = finderLiveTaskBannerView;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0029, code lost:
            if (r8 != 2) goto L_0x005b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                r0.add(r9)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskBannerView$init$2"
                java.lang.String r2 = "android/view/View$OnTouchListener"
                java.lang.String r3 = "onTouch"
                java.lang.String r4 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                int r8 = r9.getAction()
                r9 = 0
                r0 = 1
                if (r8 == 0) goto L_0x003f
                if (r8 == r0) goto L_0x002c
                r1 = 2
                if (r8 == r1) goto L_0x003f
                goto L_0x005b
            L_0x002c:
                com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView r8 = r7.f160103d
                java.lang.String r8 = r8.f160096o
                java.lang.String r1 = "bannerRv action up"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
                com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView r8 = r7.f160103d
                r8.f160098q = r0
                com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView r8 = r7.f160103d
                r8.mo78259d()
                goto L_0x005b
            L_0x003f:
                com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView r8 = r7.f160103d
                java.lang.String r8 = r8.f160096o
                java.lang.String r1 = "bannerRv action down"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
                com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView r8 = r7.f160103d
                boolean r8 = r8.f160098q
                if (r8 != r0) goto L_0x005b
                com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView r8 = r7.f160103d
                r8.f160098q = r9
                com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView r8 = r7.f160103d
                com.tencent.mm.sdk.platformtools.MMHandler r0 = r8.f160099r
                int r8 = r8.f160094j
                r0.removeMessages(r8)
            L_0x005b:
                r1 = 0
                java.lang.String r3 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskBannerView$init$2"
                java.lang.String r4 = "android/view/View$OnTouchListener"
                java.lang.String r5 = "onTouch"
                java.lang.String r6 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r2 = r7
                j20.C117292a.m165362h(r1, r2, r3, r4, r5, r6)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.widget.FinderLiveTaskBannerView.C56136f.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView$g */
    public static final class C56137g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveTaskBannerView f160104d;

        /* renamed from: e */
        public final /* synthetic */ Message f160105e;

        /* renamed from: f */
        public final /* synthetic */ C45983e0 f160106f;

        public C56137g(FinderLiveTaskBannerView finderLiveTaskBannerView, Message message, C45983e0 e0Var) {
            this.f160104d = finderLiveTaskBannerView;
            this.f160105e = message;
            this.f160106f = e0Var;
        }

        public final void run() {
            this.f160104d.f160099r.sendMessageDelayed(this.f160105e, this.f160106f.f124000d);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveTaskBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        mo78257b(context);
    }

    /* renamed from: a */
    public void mo23719a(int i, boolean z, boolean z2) {
        LinkedList<C56133c> linkedList = this.f160091g;
        int size = linkedList != null ? linkedList.size() : 0;
        if (size > 0) {
            this.f160100s = i % size;
            String str = this.f160096o;
            Log.m105924i(str, "[pageChange] currentPosition:" + this.f160100s);
        }
        mo78259d();
    }

    /* renamed from: b */
    public final void mo78257b(Context context) {
        setMContext(context);
        View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.akd, this);
        C87412m.m108593f(inflate, "getInflater(context).inf…r_live_task_layout, this)");
        setRoot(inflate);
        View findViewById = getRoot().findViewById(C0966R.C0970id.e08);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.finder_live_task_list_view)");
        setPagerView((RecyclerHorizontalViewPager) findViewById);
        getPagerView().setPageChangeListener(this);
        getPagerView().setHasFixedSize(false);
        FinderLinearLayoutManager finderLinearLayoutManager = new FinderLinearLayoutManager(context);
        finderLinearLayoutManager.f162360w = 80.0f;
        finderLinearLayoutManager.f44689u = 3;
        finderLinearLayoutManager.setItemPrefetchEnabled(true);
        finderLinearLayoutManager.mo16974W(0);
        getPagerView().setLayoutManager(finderLinearLayoutManager);
        setAdapter(new C56135e(this, context));
        getPagerView().setAdapter(getAdapter());
        getPagerView().setOnTouchListener(new C56136f(this));
    }

    /* renamed from: c */
    public final void mo78258c(C56133c cVar) {
        if (cVar != null) {
            if (cVar instanceof C41479a) {
                C115669n.INSTANCE.mo160131h(22748, 4, 1, Long.valueOf(C31543z5.m39453c()), C66785b.f191882e.mo90662O5(), "", ((C41479a) cVar).f111699a.f137217d);
                return;
            }
            C58777u0.f168283a.mo83837f(11, cVar.mo64573n(), this.f160093i);
        }
    }

    /* renamed from: d */
    public final void mo78259d() {
        C56133c cVar;
        if (getVisibility() == 0 && this.f160098q) {
            LinkedList<C56133c> linkedList = this.f160091g;
            if (linkedList != null && linkedList.size() == 0) {
                this.f160099r.removeMessages(this.f160094j);
                setVisibility(8);
                return;
            }
            LinkedList<C56133c> linkedList2 = this.f160091g;
            if (linkedList2 != null && linkedList2.size() == 1) {
                this.f160099r.removeMessages(this.f160094j);
                return;
            }
            this.f160099r.removeMessages(this.f160094j);
            int i = this.f160100s + 1;
            LinkedList<C56133c> linkedList3 = this.f160091g;
            if (i >= (linkedList3 != null ? linkedList3.size() : 0)) {
                i = 0;
            }
            Message obtainMessage = this.f160099r.obtainMessage(this.f160094j, i, 0);
            C45983e0 e0Var = new C45983e0();
            LinkedList<C56133c> linkedList4 = this.f160091g;
            long d = (linkedList4 == null || (cVar = linkedList4.get(this.f160100s)) == null) ? 0 : cVar.mo64570d();
            e0Var.f124000d = d;
            if (d == 0) {
                e0Var.f124000d = this.f160095n;
            }
            getPagerView().post(new C56137g(this, obtainMessage, e0Var));
        }
    }

    public final RecyclerView.C16613e<C56134d> getAdapter() {
        RecyclerView.C16613e<C56134d> eVar = this.f160090f;
        if (eVar != null) {
            return eVar;
        }
        C87412m.m108603p("adapter");
        throw null;
    }

    public final String getGameAppId() {
        return this.f160093i;
    }

    public final Context getMContext() {
        Context context = this.f160092h;
        if (context != null) {
            return context;
        }
        C87412m.m108603p("mContext");
        throw null;
    }

    public final RecyclerHorizontalViewPager getPagerView() {
        RecyclerHorizontalViewPager recyclerHorizontalViewPager = this.f160088d;
        if (recyclerHorizontalViewPager != null) {
            return recyclerHorizontalViewPager;
        }
        C87412m.m108603p("pagerView");
        throw null;
    }

    public final View getRoot() {
        View view = this.f160089e;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("root");
        throw null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f160099r.removeMessages(this.f160094j);
    }

    public final void setAdapter(RecyclerView.C16613e<C56134d> eVar) {
        C87412m.m108594g(eVar, "<set-?>");
        this.f160090f = eVar;
    }

    public final void setGameAppId(String str) {
        this.f160093i = str;
    }

    public final void setMContext(Context context) {
        C87412m.m108594g(context, "<set-?>");
        this.f160092h = context;
    }

    public final void setPagerView(RecyclerHorizontalViewPager recyclerHorizontalViewPager) {
        C87412m.m108594g(recyclerHorizontalViewPager, "<set-?>");
        this.f160088d = recyclerHorizontalViewPager;
    }

    public final void setRoot(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f160089e = view;
    }

    public final void setTaskInfoList(List<? extends C56133c> list) {
        LinkedList<C56133c> linkedList;
        C87412m.m108594g(list, "taskInfo");
        LinkedList<C56133c> linkedList2 = this.f160091g;
        if (linkedList2 != null) {
            linkedList2.clear();
        }
        LinkedList<C56133c> linkedList3 = new LinkedList<>();
        this.f160091g = linkedList3;
        linkedList3.addAll(list);
        LinkedList<C56133c> linkedList4 = this.f160091g;
        C87412m.m108591d(linkedList4);
        if (linkedList4.size() > 1 && (linkedList = this.f160091g) != null) {
            C87412m.m108591d(linkedList);
            int size = linkedList.size();
            LinkedList<C56133c> linkedList5 = this.f160091g;
            C87412m.m108591d(linkedList5);
            linkedList.add(size, linkedList5.get(0));
        }
        LinkedList<C56133c> linkedList6 = this.f160091g;
        C87412m.m108591d(linkedList6);
        if (!linkedList6.isEmpty()) {
            LinkedList<C56133c> linkedList7 = this.f160091g;
            C87412m.m108591d(linkedList7);
            mo78258c(linkedList7.get(0));
        }
        RecyclerHorizontalViewPager pagerView = getPagerView();
        LinkedList<C56133c> linkedList8 = this.f160091g;
        C87412m.m108591d(linkedList8);
        pagerView.setItemViewCacheSize(linkedList8.size());
        getAdapter().notifyDataSetChanged();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveTaskBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        mo78257b(context);
    }
}
