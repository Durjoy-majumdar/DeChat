package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread;

import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.MessageQueue;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.BizFinderLineStatusChangedEvent;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.BizTimeLineUI;
import com.tencent.p014mm.pluginsdk.model.C19428d;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import dx0.C31332a;
import eb0.C45628s0;
import eb0.C75604z3;
import f40.C86709a0;
import f62.C75700k0;
import fx0.C45825h;
import fy0.C20734b;
import fy0.C20739g;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jw0.C9533e;
import kotlin.Metadata;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import rb0.C48009v0;
import sx3.C77813z;
import te3.C118459qf;
import te3.C118474vf;
import te3.mg4;
import te3.pg4;
import wx3.C15601d;
import z04.C112551y;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001b\b\u0016\u0012\u0006\u0010'\u001a\u00020&\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+B#\b\u0016\u0012\u0006\u0010'\u001a\u00020&\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\u0006\u0010,\u001a\u00020\"¢\u0006\u0004\b*\u0010-J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010!\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0011\u0010%\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006."}, mo182094d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotView;", "Landroid/widget/LinearLayout;", "Lcom/tencent/mm/sdk/storage/MStorageEx$IOnStorageChange;", "Lob0/n;", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/a0;", "Lrx3/b0;", "getLocalOftenReadData", "", "left", "setOftenReadTitlePaddingLeft", "setVideoTitlePaddingLeft", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "d", "Ljava/lang/ref/WeakReference;", "getMContextWeakRef", "()Ljava/lang/ref/WeakReference;", "setMContextWeakRef", "(Ljava/lang/ref/WeakReference;)V", "mContextWeakRef", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/v;", "o", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/v;", "getReadReport", "()Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/v;", "readReport", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/b;", "r", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/b;", "getBizFinderLiveBar", "()Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/b;", "setBizFinderLiveBar", "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/b;)V", "bizFinderLiveBar", "", "getItemPadding", "()I", "itemPadding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-brandservice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotView */
public final class BizTimeLineHotView extends LinearLayout implements MStorageEx.IOnStorageChange, C11385n, C18440a0 {

    /* renamed from: x */
    public static IListener<BizFinderLineStatusChangedEvent> f51164x;

    /* renamed from: d */
    public WeakReference<Activity> f51165d;

    /* renamed from: e */
    public BizTimeLineHotListView f51166e;

    /* renamed from: f */
    public LinearLayout f51167f;

    /* renamed from: g */
    public TextView f51168g;

    /* renamed from: h */
    public TextView f51169h;

    /* renamed from: i */
    public int f51170i;

    /* renamed from: j */
    public boolean f51171j;

    /* renamed from: n */
    public CopyOnWriteArrayList<C18468r> f51172n = new CopyOnWriteArrayList<>();

    /* renamed from: o */
    public final C18471v f51173o = new C18471v();

    /* renamed from: p */
    public int f51174p;

    /* renamed from: q */
    public boolean f51175q;

    /* renamed from: r */
    public C18441b f51176r;

    /* renamed from: s */
    public final IListener<?> f51177s = new BizTimeLineHotView$mBizDeleteContactListener$1(this, C40008f.f107254d);

    /* renamed from: t */
    public float f51178t = -1.0f;

    /* renamed from: u */
    public float f51179u = -1.0f;

    /* renamed from: v */
    public boolean f51180v = true;

    /* renamed from: w */
    public final MessageQueue.IdleHandler f51181w = new C18460j(this);

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotView$a */
    public static final class C18435a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public final /* synthetic */ View f51182d;

        /* renamed from: e */
        public final /* synthetic */ BizTimeLineHotView f51183e;

        /* renamed from: f */
        public final /* synthetic */ Configuration f51184f;

        public C18435a(View view, BizTimeLineHotView bizTimeLineHotView, Configuration configuration) {
            this.f51182d = view;
            this.f51183e = bizTimeLineHotView;
            this.f51184f = configuration;
        }

        public void onGlobalLayout() {
            this.f51182d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            BizTimeLineHotView bizTimeLineHotView = this.f51183e;
            if (bizTimeLineHotView.f51174p != this.f51184f.orientation || bizTimeLineHotView.f51170i != bizTimeLineHotView.getItemPadding()) {
                C18466p.m19106e(this.f51183e.getContext());
                BizTimeLineHotView bizTimeLineHotView2 = this.f51183e;
                BizTimeLineHotListView bizTimeLineHotListView = bizTimeLineHotView2.f51166e;
                if (bizTimeLineHotListView != null) {
                    bizTimeLineHotListView.f51116C1.f51281o = C18466p.f51248c;
                }
                bizTimeLineHotView2.f51170i = bizTimeLineHotView2.getItemPadding();
                BizTimeLineHotView bizTimeLineHotView3 = this.f51183e;
                bizTimeLineHotView3.f51174p = this.f51184f.orientation;
                BizTimeLineHotListView bizTimeLineHotListView2 = bizTimeLineHotView3.f51166e;
                if (bizTimeLineHotListView2 != null) {
                    bizTimeLineHotListView2.mo23006M1();
                }
                BizTimeLineHotView bizTimeLineHotView4 = this.f51183e;
                BizTimeLineHotListView bizTimeLineHotListView3 = bizTimeLineHotView4.f51166e;
                if (bizTimeLineHotListView3 != null) {
                    bizTimeLineHotListView3.mo23002I1(bizTimeLineHotView4.f51172n, true);
                }
                C18441b bizFinderLiveBar = this.f51183e.getBizFinderLiveBar();
                if (bizFinderLiveBar != null) {
                    BizTimeLineHotListView d = bizFinderLiveBar.mo23055d();
                    if (d != null) {
                        d.f51116C1.f51281o = C18466p.f51248c;
                    }
                    BizTimeLineHotListView d2 = bizFinderLiveBar.mo23055d();
                    if (d2 != null) {
                        d2.mo23006M1();
                    }
                    BizTimeLineHotListView d3 = bizFinderLiveBar.mo23055d();
                    if (d3 != null) {
                        d3.mo23002I1(bizFinderLiveBar.f51205p, true);
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotView$b */
    public static final class C18436b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C19623o0 f51185d;

        /* renamed from: e */
        public final /* synthetic */ BizTimeLineHotView f51186e;

        public C18436b(C19623o0 o0Var, BizTimeLineHotView bizTimeLineHotView) {
            this.f51185d = o0Var;
            this.f51186e = bizTimeLineHotView;
        }

        public final void run() {
            C19623o0 LL = C48009v0.Jx0().mo25784LL((long) this.f51185d.field_talkerId);
            if (LL != null && LL.field_msgId == this.f51185d.field_msgId) {
                ((C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku()).mo69778p0(this.f51185d.field_talker);
                BizTimeLineHotView bizTimeLineHotView = this.f51186e;
                String str = this.f51185d.field_talker;
                bizTimeLineHotView.getClass();
                C31332a.m39373a("BrandServiceWorkerThread", new C18465o(bizTimeLineHotView, str), 0);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotView$c */
    public static final class C18437c<T> implements Comparator {

        /* renamed from: d */
        public final /* synthetic */ boolean f51187d;

        /* renamed from: e */
        public final /* synthetic */ boolean f51188e;

        public C18437c(boolean z, boolean z2) {
            this.f51187d = z;
            this.f51188e = z2;
        }

        public int compare(Object obj, Object obj2) {
            int i;
            int i2;
            C18468r rVar = (C18468r) obj;
            C18468r rVar2 = (C18468r) obj2;
            C19428d dVar = C19428d.f54856a;
            if (C87412m.m108589b(C19428d.f54877v, rVar.f354229d)) {
                return -1;
            }
            if (!C87412m.m108589b(C19428d.f54877v, rVar2.f354229d)) {
                boolean z = false;
                boolean z2 = dVar.mo25179n() && dVar.mo25187v(rVar.f354229d, rVar.f354232g);
                if (z2 != (dVar.mo25179n() && dVar.mo25187v(rVar2.f354229d, rVar2.f354232g))) {
                    if (z2) {
                        return -1;
                    }
                } else if (!this.f51187d) {
                    boolean z3 = rVar.f51256t;
                    boolean z4 = z3 || rVar.f51261y;
                    if (rVar2.f51256t || rVar2.f51261y) {
                        z = true;
                    }
                    if (z4 != z) {
                        if (z3 || rVar.f51261y) {
                            return -1;
                        }
                    } else if (!this.f51188e || (i = rVar.f354231f) == (i2 = rVar2.f354231f)) {
                        if (rVar.f51259w >= rVar2.f51259w) {
                            return -1;
                        }
                    } else if (i >= i2) {
                        return -1;
                    }
                } else if (rVar.f51254r < rVar2.f51254r) {
                    return -1;
                }
            }
            return 1;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BizTimeLineHotView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        mo23030b(context);
    }

    private final void getLocalOftenReadData() {
        LinkedList<pg4> linkedList;
        T t;
        if (Util.isNullOrNil((List) this.f51172n)) {
            mg4 a = C29763t.m38870a();
            if (!(a == null || (linkedList = a.f184323d) == null)) {
                Iterator<T> it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (C19428d.f54856a.mo25186u(((pg4) t).f354229d)) {
                        break;
                    }
                }
                pg4 pg4 = (pg4) t;
                if (pg4 != null) {
                    String str = pg4.f354232g;
                    if (str == null || C112551y.m153811k(str)) {
                        C19428d dVar = C19428d.f54856a;
                        pg4.f354232g = C19428d.f54878w;
                    }
                }
            }
            mo23031c(a);
        }
    }

    /* renamed from: a */
    public final boolean mo23029a() {
        return C45825h.m51116h() && C45825h.m51115f() != null;
    }

    /* renamed from: b */
    public final void mo23030b(Context context) {
        C87412m.m108594g(context, "context");
        C86709a0.m107524d().mo123455a(2768, this);
        this.f51165d = new WeakReference<>((Activity) context);
        C18466p.m19106e(context);
        this.f51170i = getItemPadding();
        View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.f6601je, this);
        this.f51166e = (BizTimeLineHotListView) inflate.findViewById(C0966R.C0970id.ad5);
        this.f51167f = (LinearLayout) inflate.findViewById(C0966R.C0970id.aeb);
        this.f51168g = (TextView) inflate.findViewById(C0966R.C0970id.adn);
        this.f51169h = (TextView) inflate.findViewById(C0966R.C0970id.ado);
        BizTimeLineHotListView bizTimeLineHotListView = this.f51166e;
        if (bizTimeLineHotListView != null) {
            bizTimeLineHotListView.mo23000G1(context, this.f51172n, this.f51173o, this, false);
        }
        getLocalOftenReadData();
        boolean z = true;
        if (!this.f51171j) {
            this.f51171j = true;
            C86709a0.m107524d().mo123460f(new C18453b0());
        }
        C19428d dVar = C19428d.f54856a;
        if (dVar.mo25177l()) {
            ViewStub viewStub = (ViewStub) inflate.findViewById(C0966R.C0970id.acw);
            if ((viewStub != null ? viewStub.inflate() : null) != null) {
                Context context2 = getContext();
                C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI");
                C18441b bVar = new C18441b((BizTimeLineUI) context2, this, inflate);
                this.f51176r = bVar;
                C53895h.m60466d(C0001s1.f0d, C53872d1.f151119c, (C53934p0) null, new C18438a(new WeakReference(bVar), (C15601d<? super C18438a>) null), 2, (Object) null);
                C118474vf g = dVar.mo25173g();
                if (g != null) {
                    LinkedList<C118459qf> linkedList = g.f354494d;
                    if (linkedList != null && !linkedList.isEmpty()) {
                        z = false;
                    }
                    if (!z) {
                        long decodeLong = dVar.mo25176k().decodeLong("live_bar_list_last_refresh_time", 0);
                        int decodeInt = dVar.mo25176k().decodeInt("bar_list_keep_data_interval-2", 0);
                        if (decodeInt < 60) {
                            decodeInt = 60;
                        }
                        if (System.currentTimeMillis() - decodeLong < ((long) (decodeInt * 1000))) {
                            Log.m105924i("MicroMsg.BizFinderLiveBar", "initFinderLivesBar use cache");
                            dVar.mo25155H(75);
                            LinkedList<C118459qf> linkedList2 = g.f354494d;
                            C87412m.m108593f(linkedList2, "resp.live_info");
                            bVar.mo23058g(linkedList2, 0);
                        }
                    }
                }
            }
        }
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku().add(this);
        this.f51177s.alive();
        if (dVar.mo25179n() && f51164x == null) {
            BizTimeLineHotView$Companion$addLiveStatusChangeListener$1 bizTimeLineHotView$Companion$addLiveStatusChangeListener$1 = new BizTimeLineHotView$Companion$addLiveStatusChangeListener$1(new WeakReference(this), C40008f.f107254d);
            f51164x = bizTimeLineHotView$Companion$addLiveStatusChangeListener$1;
            bizTimeLineHotView$Companion$addLiveStatusChangeListener$1.alive();
        }
    }

    /* renamed from: c */
    public final void mo23031c(mg4 mg4) {
        boolean z;
        boolean z2;
        boolean z3;
        mg4 mg42 = mg4;
        if (mg42 != null) {
            C20734b.f58617b = (long) (mg42.f184326g * 1000);
            C20734b.f58618c = (long) mg42.f184324e;
            C19428d dVar = C19428d.f54856a;
            boolean z4 = mg42.f184327h;
            dVar.mo25176k().encode("SvrShowFinderLive", z4);
            Log.m105918d("MicroMsg.BizFinderLiveLogic", "showOftenReadFinderLive = " + z4);
            Object[] objArr = new Object[3];
            LinkedList<pg4> linkedList = mg42.f184323d;
            objArr[0] = Integer.valueOf(linkedList != null ? linkedList.size() : 0);
            int i = 1;
            objArr[1] = Integer.valueOf(mg42.f184325f);
            objArr[2] = Integer.valueOf(mg42.f184324e);
            Log.m105925i("MicroMsg.BizTimeLineHotList", "initOftenReadList size %d,server_rank:%d,display_ctrl_flag:%d", objArr);
            if ((C20734b.f58618c & ((long) 4)) != 0) {
                LinearLayout linearLayout = this.f51167f;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                    return;
                }
                return;
            }
            if (C9533e.f29717e) {
                mg42.f184323d.clear();
                this.f51172n.clear();
            }
            if (!Util.isNullOrNil((List) mg42.f184323d) || !Util.isNullOrNil((List) this.f51172n) || mo23029a()) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!Util.isNullOrNil((List) mg42.f184323d)) {
                    ArrayList arrayList = new ArrayList();
                    LinkedList<pg4> linkedList2 = mg42.f184323d;
                    C87412m.m108593f(linkedList2, "resp.biz_info_list");
                    String str = C19428d.f54877v;
                    if (!(str == null || C112551y.m153811k(str))) {
                        String str2 = C19428d.f54878w;
                        if (!(str2 == null || C112551y.m153811k(str2))) {
                            if (!linkedList2.isEmpty()) {
                                Iterator<T> it = linkedList2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (C87412m.m108589b(((pg4) it.next()).f354229d, C19428d.f54877v)) {
                                            z3 = true;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                            z3 = false;
                            if (!z3) {
                                pg4 pg4 = new pg4();
                                pg4.f354229d = C19428d.f54877v;
                                pg4.f354232g = C19428d.f54878w;
                                linkedList2.add(0, pg4);
                            }
                        }
                    }
                    Iterator<pg4> it4 = mg42.f184323d.iterator();
                    String str3 = "";
                    int i2 = 0;
                    while (it4.hasNext()) {
                        pg4 next = it4.next();
                        i2 += i;
                        if (i2 > C18466p.f51246a) {
                            break;
                        }
                        C18468r rVar = new C18468r();
                        if (C45628s0.m50740E(next.f354229d)) {
                            rVar.f354229d = next.f354229d;
                            rVar.f354232g = next.f354232g;
                            rVar.f354233h = next.f354233h;
                            rVar.f354235j = next.f354235j;
                            rVar.f354234i = next.f354234i;
                            rVar.f51262z = next.f354238p * ((long) 1000);
                            str3 = str3 + "; username = " + next.f354229d + ", finderTime = " + rVar.f51262z;
                            arrayList.add(rVar);
                            C19428d dVar2 = C19428d.f54856a;
                            if (dVar2.mo25182q(next.f354229d, next.f354232g)) {
                                dVar2.mo25153F(next.f354229d, next.f354232g, 1);
                            }
                            C118459qf qfVar = new C118459qf();
                            qfVar.f354270d = next.f354229d;
                            qfVar.f354271e = next.f354232g;
                            qfVar.f354272f = next.f354233h;
                            qfVar.f354273g = next.f354234i;
                            qfVar.f354274h = next.f354235j;
                            qfVar.f354276j = next.f354236n;
                            qfVar.f354277n = next.f354237o;
                            dVar2.mo25159L(qfVar);
                            i = 1;
                        }
                    }
                    Log.m105924i("MicroMsg.BizTimeLineHotList", "finderTimeList: " + str3);
                    if (!Util.isNullOrNil((List) arrayList)) {
                        Iterator it5 = arrayList.iterator();
                        while (it5.hasNext()) {
                            mo23035g((C18468r) it5.next());
                        }
                    }
                    if (mg42.f184325f == 1) {
                        z2 = false;
                        z = true;
                    } else {
                        z2 = false;
                        z = false;
                    }
                    mo23034f(arrayList, z, z2);
                }
                C61926c.m72668M(new C18462l(this));
                Log.m105918d("MicroMsg.BizTimeLineHotList", "initOftenReadList cost " + (System.currentTimeMillis() - currentTimeMillis));
                return;
            }
            LinearLayout linearLayout2 = this.f51167f;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
            Log.m105924i("MicroMsg.BizTimeLineHotList", "initOftenReadList size is null");
            return;
        }
        LinearLayout linearLayout3 = this.f51167f;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(8);
        }
    }

    /* renamed from: d */
    public final void mo23032d(C19623o0 o0Var) {
        if (o0Var != null) {
            ((C119157j) C119157j.f356862d).mo183876g(new C18436b(o0Var, this), "MicroMsg.BizTimeLineHotList");
        }
    }

    /* renamed from: e */
    public final void mo23033e() {
        C18441b bVar = this.f51176r;
        if (bVar != null) {
            bVar.mo23060k();
        }
        LinearLayout linearLayout = this.f51167f;
        boolean z = true;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            if (Util.isNullOrNil((List) this.f51172n)) {
                BizTimeLineHotListView bizTimeLineHotListView = this.f51166e;
                if (bizTimeLineHotListView == null || !bizTimeLineHotListView.f51123J1) {
                    z = false;
                }
                if (!z) {
                    return;
                }
            }
            BizTimeLineHotListView bizTimeLineHotListView2 = this.f51166e;
            if (bizTimeLineHotListView2 != null) {
                bizTimeLineHotListView2.mo23005L1();
            }
        }
    }

    /* renamed from: f */
    public final void mo23034f(ArrayList<C18468r> arrayList, boolean z, boolean z2) {
        if (!Util.isNullOrNil((List) arrayList)) {
            this.f51175q = z;
            Log.m105918d("MicroMsg.BizTimeLineHotList", "sortListView isServerRank=" + z + ", sortLiveStatusOnly=" + z2);
            C77813z.m93909o(arrayList, new C18437c(z2, z));
            this.f51172n.clear();
            this.f51172n.addAll(arrayList);
        }
    }

    /* renamed from: g */
    public final boolean mo23035g(C18468r rVar) {
        C18468r rVar2 = rVar;
        Class cls = C75700k0.class;
        C44668u3 Ni = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni();
        C87412m.m108591d(rVar);
        long n3 = Ni.mo69715n3(rVar2.f354229d);
        C19623o0 LL = C48009v0.Jx0().mo25784LL(n3);
        if (LL == null) {
            return false;
        }
        rVar2.f51259w = LL.field_createTime;
        C72976h2 j = ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69771j(rVar2.f354229d);
        boolean z = rVar2.f51256t;
        rVar2.f51256t = false;
        if ((j != null ? j.mo108786G2() : 0) > 0) {
            long currentTimeMillis = System.currentTimeMillis() - rVar2.f51259w;
            if (C20734b.f58617b <= 0) {
                C20734b.f58617b = 43200000;
            }
            if (currentTimeMillis < C20734b.f58617b && j.mo108786G2() > C48009v0.Kx0().mo25735TE(n3)) {
                rVar2.f51256t = true;
            }
        }
        boolean z2 = rVar2.f51261y;
        boolean z3 = C29762i.f80770a;
        long decodeLong = MultiProcessMMKV.getMMKV("BizTimeLineHotList_UserClick_FinderMsgTimeStamp").decodeLong(rVar2.f354229d);
        long j2 = rVar2.f51262z;
        long p = C75604z3.m90844p() - j2;
        if (!C29762i.f80770a || !C29762i.f80771b) {
            rVar2.f51261y = false;
        } else if (j2 == 0) {
            rVar2.f51261y = false;
        } else {
            if (p >= 0) {
                if (C20734b.f58617b <= 0) {
                    C20734b.f58617b = 43200000;
                }
                if (p <= C20734b.f58617b) {
                    rVar2.f51261y = j2 > decodeLong;
                }
            }
            rVar2.f51261y = false;
        }
        boolean z4 = rVar2.f51256t;
        if (z4 && !rVar2.f51261y) {
            rVar2.f51252A = 1;
        } else if (!z4 && rVar2.f51261y) {
            rVar2.f51252A = 2;
        } else if (!z4 || !rVar2.f51261y) {
            rVar2.f51252A = 0;
        } else if (rVar2.f51259w < rVar2.f51262z) {
            rVar2.f51252A = 2;
        } else {
            rVar2.f51252A = 1;
        }
        if (rVar2.f51261y) {
            Log.m105924i("BizTimeLineHotListViewUtil", "info.finderUnreadDotShow = true, username = " + rVar2.f354229d + ", time = " + rVar2.f51262z + ", jumpType = " + rVar2.f51252A);
        }
        return (z == rVar2.f51256t && z2 == rVar2.f51261y) ? false : true;
    }

    public final C18441b getBizFinderLiveBar() {
        return this.f51176r;
    }

    public final int getItemPadding() {
        return C18466p.m19103b(getContext(), C18466p.f51247b);
    }

    public final WeakReference<Activity> getMContextWeakRef() {
        return this.f51165d;
    }

    public final C18471v getReadReport() {
        return this.f51173o;
    }

    public void onConfigurationChanged(Configuration configuration) {
        WeakReference<Activity> weakReference;
        Activity activity;
        Window window;
        View decorView;
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        WeakReference<Activity> weakReference2 = this.f51165d;
        if ((weakReference2 != null ? weakReference2.get() : null) != null && (weakReference = this.f51165d) != null && (activity = weakReference.get()) != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.getViewTreeObserver().addOnGlobalLayoutListener(new C18435a(decorView, this, configuration));
        }
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        Activity activity;
        C87412m.m108594g(mStorageEx, "stg");
        C87412m.m108594g(obj, "obj");
        boolean z = false;
        if (!(obj instanceof String)) {
            Log.m105921e("MicroMsg.BizTimeLineHotList", "onNotifyChange obj not String event:%d stg:%s obj:%s", Integer.valueOf(i), mStorageEx, obj);
            return;
        }
        WeakReference<Activity> weakReference = this.f51165d;
        if (!(weakReference == null || (activity = weakReference.get()) == null || !activity.isFinishing())) {
            z = true;
        }
        if (!z) {
            C31332a.m39373a("BrandServiceWorkerThread", new C18465o(this, (String) obj), 0);
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Activity activity;
        C87412m.m108594g(yVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        boolean z = false;
        Log.m105925i("MicroMsg.BizTimeLineHotList", "onSceneEnd, type %d, errType = %d, errCode = %d", Integer.valueOf(yVar.getType()), Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 0 && i2 == 0 && (yVar instanceof C18453b0)) {
            mg4 mg4 = (mg4) ((C18453b0) yVar).f51226e.f127056b.f127083a;
            WeakReference<Activity> weakReference = this.f51165d;
            if (!(weakReference == null || (activity = weakReference.get()) == null || !activity.isFinishing())) {
                z = true;
            }
            if (!z) {
                if (C20739g.m22694f(mg4, C29763t.m38870a())) {
                    Log.m105918d("MicroMsg.BizTimeLineHotList", "onSceneEnd nothing change");
                    return;
                }
                C29763t.m38872c(mg4);
                mo23031c(mg4);
            }
        }
    }

    public final void setBizFinderLiveBar(C18441b bVar) {
        this.f51176r = bVar;
    }

    public final void setMContextWeakRef(WeakReference<Activity> weakReference) {
        this.f51165d = weakReference;
    }

    public void setOftenReadTitlePaddingLeft(float f) {
        TextView textView = this.f51168g;
        if (textView != null) {
            if (!(this.f51178t == f)) {
                this.f51178t = f;
                C87412m.m108591d(textView);
                TextView textView2 = this.f51168g;
                C87412m.m108591d(textView2);
                int paddingTop = textView2.getPaddingTop();
                TextView textView3 = this.f51168g;
                C87412m.m108591d(textView3);
                int paddingRight = textView3.getPaddingRight();
                TextView textView4 = this.f51168g;
                C87412m.m108591d(textView4);
                textView.setPadding((int) f, paddingTop, paddingRight, textView4.getPaddingBottom());
            }
        }
    }

    public void setVideoTitlePaddingLeft(float f) {
        TextView textView = this.f51169h;
        if (textView != null) {
            if (!(this.f51179u == f)) {
                this.f51179u = f;
                C87412m.m108591d(textView);
                if (textView.getVisibility() != 0) {
                    TextView textView2 = this.f51169h;
                    C87412m.m108591d(textView2);
                    textView2.setVisibility(0);
                }
                TextView textView3 = this.f51169h;
                C87412m.m108591d(textView3);
                TextView textView4 = this.f51169h;
                C87412m.m108591d(textView4);
                int paddingTop = textView4.getPaddingTop();
                TextView textView5 = this.f51169h;
                C87412m.m108591d(textView5);
                int paddingRight = textView5.getPaddingRight();
                TextView textView6 = this.f51169h;
                C87412m.m108591d(textView6);
                textView3.setPadding((int) f, paddingTop, paddingRight, textView6.getPaddingBottom());
            }
        }
    }

    /* renamed from: w0 */
    public void mo23045w0() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f51172n);
        mo23034f(arrayList, this.f51175q, true);
        C61926c.m72668M(new C18462l(this));
        ((C119157j) C119157j.f356862d).mo183876g(new C18464n(this), "MicroMsg.BizTimeLineHotList");
    }

    /* renamed from: x0 */
    public void mo23046x0() {
        TextView textView = this.f51169h;
        if (textView != null) {
            C87412m.m108591d(textView);
            if (textView.getVisibility() == 0) {
                TextView textView2 = this.f51169h;
                C87412m.m108591d(textView2);
                textView2.setVisibility(8);
            }
        }
    }

    /* renamed from: y0 */
    public void mo23047y0(String str) {
        BizTimeLineHotListView bizTimeLineHotListView = this.f51166e;
        if (bizTimeLineHotListView != null) {
            bizTimeLineHotListView.mo23001H1(str, (String) null);
        }
    }

    /* renamed from: z0 */
    public void mo23048z0(String str, String str2, int i) {
        C18468r rVar;
        if (str != null && i != 1 && i != 2) {
            Iterator<C18468r> it = this.f51172n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    rVar = null;
                    break;
                }
                rVar = it.next();
                if (C87412m.m108589b(rVar.f354229d, str)) {
                    break;
                }
            }
            C18468r rVar2 = rVar;
            if (rVar2 != null) {
                rVar2.f354232g = str2;
                C61926c.m72668M(new C18462l(this));
                ((C119157j) C119157j.f356862d).mo183876g(new C18464n(this), "MicroMsg.BizTimeLineHotList");
                C19428d.f54856a.mo25155H(10);
                Log.m105924i("MicroMsg.BizTimeLineHotList", "refreshData on live stop for often read");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BizTimeLineHotView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        mo23030b(context);
    }
}
