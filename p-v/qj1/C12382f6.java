package qj1;

import a14.C0000n0;
import a14.C53934p0;
import ak1.C54116w;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import bl3.C39818r;
import cl1.C0689t;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.view.ConcertTicketTextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Pattern;
import je1.C46523h2;
import k60.C60979d;
import kotlin.ResultKt;
import l60.C99342a;
import mp3.C88819d;
import nk1.C11207i;
import o40.C61926c;
import ob0.C89132b;
import p565ir.C60606n;
import pe3.C89349b;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import q40.C12040d;
import q40.C89456b;
import rx3.C13598b0;
import te3.C49204dz;
import te3.C49352ez;
import te3.C49712hj1;
import te3.C50613nz0;
import te3.C50756oz0;
import te3.C51276so2;
import up1.C27696y;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: qj1.f6 */
public final class C12382f6 extends C62660c {

    /* renamed from: p */
    public final MMActivity f35643p;

    /* renamed from: q */
    public final View f35644q;

    /* renamed from: r */
    public final ConcertTicketTextView f35645r;

    /* renamed from: s */
    public final ImageView f35646s;

    /* renamed from: qj1.f6$b */
    public static final class C12383b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C12382f6 f35647d;

        public C12383b(C12382f6 f6Var) {
            this.f35647d = f6Var;
        }

        public final void run() {
            if (!this.f35647d.mo87688G0()) {
                C12382f6.m11947Z0(this.f35647d);
            }
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveConcertTicketPlugin$tryToShowTicket$1", mo125469f = "FinderLiveConcertTicketPlugin.kt", mo125470l = {122}, mo125471m = "invokeSuspend")
    /* renamed from: qj1.f6$c */
    public static final class C12384c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f35648d;

        /* renamed from: e */
        public final /* synthetic */ String f35649e;

        /* renamed from: f */
        public final /* synthetic */ long f35650f;

        /* renamed from: g */
        public final /* synthetic */ C89349b f35651g;

        /* renamed from: h */
        public final /* synthetic */ long f35652h;

        /* renamed from: i */
        public final /* synthetic */ C12382f6 f35653i;

        /* renamed from: qj1.f6$c$a */
        public static final class C12385a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ String f35654d;

            /* renamed from: e */
            public final /* synthetic */ C12382f6 f35655e;

            /* renamed from: f */
            public final /* synthetic */ C49352ez f35656f;

            public C12385a(String str, C12382f6 f6Var, C49352ez ezVar) {
                this.f35654d = str;
                this.f35655e = f6Var;
                this.f35656f = ezVar;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveConcertTicketPlugin$tryToShowTicket$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                ((C54116w) C86312j.m106911c(C54116w.class)).py0(2, this.f35654d);
                ((C0689t) this.f35655e.mo87696x0(C0689t.class)).f1624f = this.f35656f;
                if (this.f35655e.mo82893g0()) {
                    C62660c.m73644Y0(this.f35655e, "PORTRAIT_ACTION_GOTO_TICKET", (Object) null, 0, 6, (Object) null);
                } else {
                    C12382f6.m11947Z0(this.f35655e);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveConcertTicketPlugin$tryToShowTicket$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12384c(String str, long j, C89349b bVar, long j2, C12382f6 f6Var, C15601d<? super C12384c> dVar) {
            super(2, dVar);
            this.f35649e = str;
            this.f35650f = j;
            this.f35651g = bVar;
            this.f35652h = j2;
            this.f35653i = f6Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C12384c(this.f35649e, this.f35650f, this.f35651g, this.f35652h, this.f35653i, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C12384c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C50756oz0 oz02;
            C49352ez ezVar;
            C49204dz dzVar;
            T t;
            Class cls = C11990s0.class;
            Class<C60200t1> cls2 = C60200t1.class;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f35648d;
            String str = null;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C50613nz0 nz02 = new C50613nz0();
                String str2 = this.f35649e;
                long j = this.f35650f;
                C89349b bVar = this.f35651g;
                long j2 = this.f35652h;
                nz02.f138847d = C46523h2.f125330a.mo71859a(10635);
                nz02.f138848e = str2;
                nz02.f138849f = j;
                nz02.f138851h = bVar;
                nz02.f138850g = j2;
                nz02.f138853j = 2;
                C89132b<C50756oz0> b = nz02.mo73345b();
                this.f35648d = 1;
                obj = C89456b.m111831a(b, 0, (C88819d) null, this, 3, (Object) null);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (C12040d e) {
                    Log.m105924i("FinderLiveConcertTicketPlugin", "#tryToShowTicket FinderLiveGetConcertTicketInfoRequest fail. " + e);
                    oz02 = null;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oz02 = (C50756oz0) obj;
            if (!(oz02 == null || (ezVar = oz02.f139459d) == null)) {
                if (!ezVar.f133188j) {
                    ezVar = null;
                }
                if (ezVar != null) {
                    String str3 = this.f35649e;
                    C12382f6 f6Var = this.f35653i;
                    LinkedList<C49204dz> linkedList = ezVar.f133180C;
                    if (linkedList != null) {
                        Iterator<T> it = linkedList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t = null;
                                break;
                            }
                            t = it.next();
                            if (C87412m.m108589b(((C49204dz) t).f132567d, ezVar.f133179B)) {
                                break;
                            }
                        }
                        dzVar = (C49204dz) t;
                    } else {
                        dzVar = null;
                    }
                    ((C54116w) C86312j.m106911c(C54116w.class)).py0(1, str3);
                    f6Var.mo10792g(0);
                    f6Var.f35645r.setText(dzVar != null ? dzVar.f132568e : null);
                    C60979d<C100810g0> f2 = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2();
                    if (dzVar != null) {
                        str = dzVar.f132571h;
                    }
                    ((C99342a) f2.mo85956b(new C11984n0(str, C27696y.RAW_IMAGE), ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.DEFAULT))).mo85954d(f6Var.f35646s);
                    f6Var.f35646s.setOnClickListener(new C12385a(str3, f6Var, ezVar));
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.f6$a */
    public /* synthetic */ class C12386a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35657a;

        static {
            int[] iArr = new int[C58124b.C58125b.values().length];
            C58124b.C58125b bVar = C58124b.C58125b.UNKNOWN;
            iArr[165] = 1;
            f35657a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12382f6(MMActivity mMActivity, ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f35643p = mMActivity;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.bec);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.close_btn)");
        this.f35644q = findViewById;
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.fzf);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.live_title)");
        this.f35645r = (ConcertTicketTextView) findViewById2;
        View findViewById3 = viewGroup.findViewById(C0966R.C0970id.iyw);
        C87412m.m108593f(findViewById3, "root.findViewById(R.id.f…r_live_concert_ticket_bg)");
        this.f35646s = (ImageView) findViewById3;
    }

    /* renamed from: Z0 */
    public static final void m11947Z0(C12382f6 f6Var) {
        C49352ez ezVar = ((C0689t) f6Var.mo87696x0(C0689t.class)).f1624f;
        if (ezVar != null) {
            String str = ((C54991o) f6Var.mo87696x0(C54991o.class)).f154345o;
            C7335d c = C86312j.m106911c(C60606n.class);
            C87412m.m108593f(c, "getService(IFinderLiveFeatureService::class.java)");
            Context context = f6Var.f166287d.getContext();
            C87412m.m108593f(context, "root.context");
            C60606n.C60607a.m70859c((C60606n) c, context, ezVar, (C49712hj1) null, str, "2", 4, (Object) null);
        }
    }

    /* renamed from: a1 */
    public final void mo12066a1() {
        String str;
        Class cls = C0689t.class;
        Class cls2 = C55001u.class;
        C89349b a = C89349b.m111674a(((C55001u) mo87696x0(cls2)).f154417n);
        long j = ((C55001u) mo87696x0(cls2)).f154416j;
        C51276so2 so22 = ((C55001u) mo87696x0(cls2)).f154420q.f182413y0;
        if (so22 == null || (str = so22.f141652e) == null) {
            str = "";
        }
        String str2 = str;
        long j2 = ((C55001u) mo87696x0(cls2)).f154420q.f182392d;
        Log.m105924i("FinderLiveConcertTicketPlugin", "#tryToShowTicket liveId=" + j2);
        FinderLiveService.f159376d.getClass();
        if (FinderLiveService.f159380h) {
            Log.m105924i("FinderLiveConcertTicketPlugin", "#tryToShowTicket isAnchor, return.");
            mo10792g(8);
        } else if (!((C0689t) mo87696x0(cls)).f1625g) {
            Log.m105924i("FinderLiveConcertTicketPlugin", "#tryToShowTicket isHopeShowTicketWindowNow not, return.");
            mo10792g(8);
        } else if (!((C0689t) mo87696x0(cls)).mo649c3()) {
            Log.m105924i("FinderLiveConcertTicketPlugin", "#tryToShowTicket isConcertLive not, return.");
            mo10792g(8);
        } else {
            C11207i.m11067c(this, (C66212f) null, (C53934p0) null, new C12384c(str2, j, a, j2, this, (C15601d<? super C12384c>) null), 3, (Object) null);
        }
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: e */
    public void mo12022e(Bundle bundle, Object obj, long j) {
        String str = "";
        String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", str) : null;
        if (string != null) {
            str = string;
        }
        if (C87412m.m108589b(str, "PORTRAIT_ACTION_GOTO_TICKET")) {
            C12383b bVar = new C12383b(this);
            Pattern pattern = C61926c.f176038a;
            MMHandlerThread.postToMainThreadDelayed(bVar, j);
        }
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 2;
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        super.mo3210u0(bVar, bundle);
        if (C12386a.f35657a[bVar.ordinal()] == 1 && ((C0689t) mo87696x0(C0689t.class)).f1625g) {
            mo12066a1();
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        mo10792g(8);
    }
}
