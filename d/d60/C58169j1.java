package d60;

import a43.C103310i;
import a60.C53979a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.live.p016ui.dialog.LiveVisitorMicTipDialogView;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import d60.C58124b;
import di3.C86312j;
import e60.C58532b;
import eb0.C75592q0;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import g60.C75864h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76912y0;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import p50.C62197e;
import p734vz.C65905c;
import p734vz.C65906d;
import qo3.C77407n;
import rx3.C13598b0;
import te3.C49317ep2;
import z50.C16103b;
import z50.C53740h;
import z50.C53741k;

/* renamed from: d60.j1 */
public final class C58169j1 extends C58121a implements View.OnClickListener, C11385n {

    /* renamed from: f */
    public final C58124b f166606f;

    /* renamed from: g */
    public final Context f166607g;

    /* renamed from: h */
    public final ImageView f166608h;

    /* renamed from: i */
    public final TextView f166609i;

    /* renamed from: j */
    public final ImageView f166610j;

    /* renamed from: n */
    public final ImageView f166611n;

    /* renamed from: o */
    public final RelativeLayout f166612o;

    /* renamed from: p */
    public final LinearLayout f166613p;

    /* renamed from: q */
    public final LinearLayout f166614q;

    /* renamed from: r */
    public final LinearLayout f166615r;

    /* renamed from: s */
    public final TextView f166616s;

    /* renamed from: t */
    public final C75864h f166617t;

    /* renamed from: u */
    public C77407n f166618u;

    /* renamed from: v */
    public C77407n f166619v;

    /* renamed from: w */
    public final C65905c f166620w = ((C65906d) C86312j.m106911c(C65906d.class)).mo89615OY(MMApplicationContext.getContext());

    /* renamed from: x */
    public C62197e f166621x;

    /* renamed from: y */
    public boolean f166622y;

    /* renamed from: d60.j1$a */
    public static final class C58170a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58169j1 f166623d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58170a(C58169j1 j1Var) {
            super(1);
            this.f166623d = j1Var;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                this.f166623d.f166617t.cancel();
                C58169j1.m67326x0(this.f166623d);
            } else {
                this.f166623d.f166617t.cancel();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: d60.j1$b */
    public static final class C58171b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58169j1 f166624d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58171b(C58169j1 j1Var) {
            super(0);
            this.f166624d = j1Var;
        }

        public Object invoke() {
            MMHandlerThread.postToMainThread(new C58186k1(this.f166624d));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: d60.j1$c */
    public static final class C58172c extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58169j1 f166625d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58172c(C58169j1 j1Var) {
            super(1);
            this.f166625d = j1Var;
        }

        public Object invoke(Object obj) {
            String str;
            if (((Boolean) obj).booleanValue()) {
                String str2 = RoomLiveService.f157192c;
                long j = RoomLiveService.f157197h.f133050d;
                C53979a.C53980a aVar = RoomLiveService.f157185Q.f151234i;
                if (aVar == null || (str = aVar.f151237b) == null) {
                    str = "";
                }
                long j2 = RoomLiveService.f157183O;
                boolean z = RoomLiveService.f157184P;
                C58532b.m67946b(str2, j, str, j2, 1, z ? 1 : 0, RoomLiveService.f157199j);
                ((C103310i) this.f166625d.f166620w).mo143086b("playend", true, 1, true);
                RoomLiveService.f157185Q.mo74652b();
                this.f166625d.mo82942C0();
                C58124b.C7172a.m7372a(this.f166625d.f166606f, C58124b.C58125b.LIVE_STOP_MIC, (Bundle) null, 2, (Object) null);
                Context context = this.f166625d.f166607g;
                C76912y0.makeText(context, (CharSequence) C76577a.m92166q(context, C0966R.string.g_f), 0).show();
                String str3 = RoomLiveService.f157192c;
                long j3 = RoomLiveService.f157197h.f133050d;
                String str4 = RoomLiveService.f157199j;
                String s = C75592q0.m90789s();
                C87412m.m108593f(s, "getUsernameFromUserInfo()");
                C58532b.m67947c(str3, j3, str4, 9, 4, s, RoomLiveService.f157197h.f133055i);
            } else {
                RoomLiveService.f157185Q.f151234i = null;
                C58124b.C7172a.m7372a(this.f166625d.f166606f, C58124b.C58125b.LIVE_STOP_MIC_OTHER, (Bundle) null, 2, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: d60.j1$d */
    public static final class C58173d extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58169j1 f166626d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58173d(C58169j1 j1Var) {
            super(1);
            this.f166626d = j1Var;
        }

        public Object invoke(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            if (this.f166626d.f166614q.getVisibility() == 0) {
                this.f166626d.mo82942C0();
                this.f166626d.mo82945z0(C7217l1.f25249d);
            }
            if (!booleanValue) {
                C58124b.C7172a.m7372a(this.f166626d.f166606f, C58124b.C58125b.LIVE_START_MIC_PERMISSION_CLSOE, (Bundle) null, 2, (Object) null);
                Context context = this.f166626d.f166607g;
                C76912y0.makeText(context, (CharSequence) C76577a.m92166q(context, C0966R.string.g9s), 0).show();
            }
            this.f166626d.mo82940A0(booleanValue);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: d60.j1$e */
    public static final class C58174e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58169j1 f166627d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58174e(C58169j1 j1Var) {
            super(0);
            this.f166627d = j1Var;
        }

        public Object invoke() {
            C61926c.m72668M(new C58189m1(this.f166627d));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: d60.j1$f */
    public static final class C58175f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C58169j1 f166628d;

        /* renamed from: d60.j1$f$a */
        public static final class C58176a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C58169j1 f166629d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C58176a(C58169j1 j1Var) {
                super(0);
                this.f166629d = j1Var;
            }

            public Object invoke() {
                if (this.f166629d.f166621x.f172989A.mo82882d()) {
                    C58124b.C7172a.m7372a(this.f166629d.f166606f, C58124b.C58125b.LIVE_STATUS_SWITCH_VIDEO_MIC, (Bundle) null, 2, (Object) null);
                } else {
                    C58124b.C7172a.m7372a(this.f166629d.f166606f, C58124b.C58125b.LIVE_STATUS_SWITCH_AUDIO_MIC, (Bundle) null, 2, (Object) null);
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: d60.j1$f$b */
        public static final class C58177b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C58169j1 f166630d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C58177b(C58169j1 j1Var) {
                super(0);
                this.f166630d = j1Var;
            }

            public Object invoke() {
                String str;
                C58169j1 j1Var = this.f166630d;
                j1Var.getClass();
                String str2 = "[cgi]visitor close mic." + RoomLiveService.f157185Q.f151234i;
                C87412m.m108594g(str2, "debugText");
                Log.m105924i("MicroMsg.LiveCoreMic", str2);
                C53979a.C53980a aVar = RoomLiveService.f157185Q.f151234i;
                if (aVar != null) {
                    new C53741k(RoomLiveService.f157197h.f133050d, RoomLiveService.f157192c, String.valueOf(System.currentTimeMillis()), aVar.f151237b, aVar.f151240e).doScene(C86709a0.m107524d().f256809d, new C58212t1(j1Var));
                }
                String str3 = RoomLiveService.f157192c;
                long j = RoomLiveService.f157197h.f133050d;
                C53979a.C53980a aVar2 = RoomLiveService.f157185Q.f151234i;
                if (aVar2 == null || (str = aVar2.f151237b) == null) {
                    str = "";
                }
                C58532b.m67946b(str3, j, str, RoomLiveService.f157183O, 2, RoomLiveService.f157184P ? 1 : 0, RoomLiveService.f157199j);
                return C13598b0.f38549a;
            }
        }

        public C58175f(C58169j1 j1Var) {
            this.f166628d = j1Var;
        }

        public final void onClick(View view) {
            int i;
            int i2;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveVisitorMicPlugin$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f166628d.f166621x.f172989A.mo82882d()) {
                i = C0966R.string.g_a;
                i2 = C0966R.raw.icons_filled_video_call;
            } else {
                i = C0966R.string.g__;
                i2 = C0966R.raw.icons_filled_call;
            }
            C58169j1 j1Var = this.f166628d;
            C58176a aVar = new C58176a(j1Var);
            C58177b bVar = new C58177b(this.f166628d);
            if (j1Var.f166619v == null) {
                C77407n nVar = new C77407n(j1Var.f166607g, 1, true);
                j1Var.f166619v = nVar;
                nVar.f225775k1 = true;
            }
            C77407n nVar2 = j1Var.f166619v;
            if (nVar2 != null) {
                nVar2.mo107570o(true);
            }
            C77407n nVar3 = j1Var.f166619v;
            if (nVar3 != null) {
                nVar3.f225792t1 = true;
            }
            if (nVar3 != null) {
                nVar3.f225771i = new C58191n1(j1Var, i, i2, C0966R.string.g_o);
            }
            if (nVar3 != null) {
                nVar3.f225782p = new C58196o1(aVar, j1Var, bVar);
            }
            if (nVar3 != null) {
                nVar3.f225761d = new C58206p1(j1Var);
            }
            C77407n nVar4 = this.f166628d.f166619v;
            if (nVar4 != null) {
                nVar4.mo107573q();
            }
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveVisitorMicPlugin$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: d60.j1$g */
    public static final class C58178g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C58169j1 f166631d;

        public C58178g(C58169j1 j1Var) {
            this.f166631d = j1Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveVisitorMicPlugin$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f166631d.f166611n.performClick();
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveVisitorMicPlugin$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: d60.j1$h */
    public static final class C58179h implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ C58169j1 f166632d;

        /* renamed from: e */
        public final /* synthetic */ int f166633e;

        public C58179h(C58169j1 j1Var, int i) {
            this.f166632d = j1Var;
            this.f166633e = i;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            C77407n nVar = this.f166632d.f166618u;
            if (nVar != null) {
                nVar.mo107567l((View) null);
            }
            e0Var.clear();
            e0Var.mo107142f(1, this.f166632d.f166607g.getResources().getString(this.f166633e));
        }
    }

    /* renamed from: d60.j1$i */
    public static final class C58180i implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f166634d;

        /* renamed from: e */
        public final /* synthetic */ C58169j1 f166635e;

        public C58180i(C32224a<C13598b0> aVar, C58169j1 j1Var) {
            this.f166634d = aVar;
            this.f166635e = j1Var;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C87412m.m108594g(menuItem, "menuItem");
            int itemId = menuItem.getItemId();
            if (itemId == 0) {
                return;
            }
            if (itemId != 1) {
                C77407n nVar = this.f166635e.f166618u;
                if (nVar != null) {
                    nVar.mo107572p();
                    return;
                }
                return;
            }
            this.f166634d.invoke();
            C77407n nVar2 = this.f166635e.f166618u;
            if (nVar2 != null) {
                nVar2.mo107572p();
            }
        }
    }

    /* renamed from: d60.j1$j */
    public static final class C58181j implements C77407n.C47880p {

        /* renamed from: a */
        public final /* synthetic */ C58169j1 f166636a;

        public C58181j(C58169j1 j1Var) {
            this.f166636a = j1Var;
        }

        public final void onDismiss() {
            this.f166636a.f166618u = null;
        }
    }

    /* renamed from: d60.j1$k */
    public static final class C58182k implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f166637d;

        public C58182k(C32224a<C13598b0> aVar) {
            this.f166637d = aVar;
        }

        public final void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            yVar.setHasCallbackToQueue(true);
            String str2 = "close mic errType:" + i + " errCode:" + i2 + " errMsg:" + str;
            C87412m.m108594g(str2, "debugText");
            Log.m105924i("MicroMsg.LiveCore", str2);
            RoomLiveService roomLiveService = RoomLiveService.f157190a;
            RoomLiveService.f157185Q.mo74652b();
            if (i2 != 0 || i != 0) {
                this.f166637d.invoke();
            }
        }
    }

    /* renamed from: d60.j1$l */
    public static final class C58183l extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58169j1 f166638d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58183l(C58169j1 j1Var) {
            super(0);
            this.f166638d = j1Var;
        }

        public Object invoke() {
            C58169j1.m67326x0(this.f166638d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: d60.j1$m */
    public static final class C58184m extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58169j1 f166639d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58184m(C58169j1 j1Var) {
            super(0);
            this.f166639d = j1Var;
        }

        public Object invoke() {
            C58169j1 j1Var = this.f166639d;
            j1Var.mo82945z0(new C58218u1(j1Var));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: d60.j1$n */
    public static final class C58185n extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C58185n f166640d = new C58185n();

        public C58185n() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58169j1(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f166606f = bVar;
        Context context = viewGroup.getContext();
        this.f166607g = context;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.fya);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.live_right_panel_mic)");
        this.f166608h = (ImageView) findViewById;
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.fyc);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.live_right_panel_mic_tv)");
        this.f166609i = (TextView) findViewById2;
        View findViewById3 = viewGroup.findViewById(C0966R.C0970id.g0v);
        C87412m.m108593f(findViewById3, "root.findViewById(R.id.live_visitor_mic_photo2)");
        ImageView imageView = (ImageView) findViewById3;
        this.f166610j = imageView;
        View findViewById4 = viewGroup.findViewById(C0966R.C0970id.fwb);
        C87412m.m108593f(findViewById4, "root.findViewById(R.id.live_mic_close)");
        ImageView imageView2 = (ImageView) findViewById4;
        this.f166611n = imageView2;
        View findViewById5 = viewGroup.findViewById(C0966R.C0970id.fyb);
        C87412m.m108593f(findViewById5, "root.findViewById(R.id.l…ght_panel_mic_click_area)");
        RelativeLayout relativeLayout = (RelativeLayout) findViewById5;
        this.f166612o = relativeLayout;
        View findViewById6 = viewGroup.findViewById(C0966R.C0970id.fwg);
        C87412m.m108593f(findViewById6, "root.findViewById(R.id.live_mic_layout)");
        this.f166613p = (LinearLayout) findViewById6;
        View findViewById7 = viewGroup.findViewById(C0966R.C0970id.fwp);
        C87412m.m108593f(findViewById7, "root.findViewById(R.id.live_mic_waiting_layout)");
        LinearLayout linearLayout = (LinearLayout) findViewById7;
        this.f166614q = linearLayout;
        View findViewById8 = viewGroup.findViewById(C0966R.C0970id.fwq);
        C87412m.m108593f(findViewById8, "root.findViewById(R.id.live_mic_waiting_layout2)");
        LinearLayout linearLayout2 = (LinearLayout) findViewById8;
        this.f166615r = linearLayout2;
        View findViewById9 = viewGroup.findViewById(C0966R.C0970id.fwh);
        C87412m.m108593f(findViewById9, "root.findViewById(R.id.live_mic_mode_tip)");
        this.f166616s = (TextView) findViewById9;
        C87412m.m108593f(context, "context");
        LiveVisitorMicTipDialogView liveVisitorMicTipDialogView = new LiveVisitorMicTipDialogView(context, (AttributeSet) null, 0);
        Context context2 = viewGroup.getContext();
        C87412m.m108593f(context2, "root.context");
        C75864h hVar = new C75864h(context2);
        this.f166617t = hVar;
        if (C62197e.f176819i1 == null) {
            C62197e.f176819i1 = new C62197e();
        }
        C62197e eVar = C62197e.f176819i1;
        C87412m.m108591d(eVar);
        this.f166621x = eVar;
        liveVisitorMicTipDialogView.setOnButtonClickListener(new C58170a(this));
        hVar.setContentView(liveVisitorMicTipDialogView);
        mo82940A0(false);
        Drawable drawable = viewGroup.getContext().getResources().getDrawable(C0966R.raw.icons_filled_close);
        C74933u4.m89769f(drawable, -16777216);
        imageView2.setImageDrawable(drawable);
        Drawable drawable2 = viewGroup.getContext().getResources().getDrawable(C0966R.raw.icons_filled_call);
        C74933u4.m89769f(drawable2, -16777216);
        imageView.setImageDrawable(drawable2);
        relativeLayout.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        mo82942C0();
        RoomLiveService.f157185Q.f151227b = new C58171b(this);
        C53979a aVar = RoomLiveService.f157185Q;
        C58172c cVar = new C58172c(this);
        aVar.getClass();
        aVar.f151232g = cVar;
        C53979a aVar2 = RoomLiveService.f157185Q;
        C58173d dVar = new C58173d(this);
        aVar2.getClass();
        aVar2.f151229d = dVar;
        RoomLiveService.f157185Q.f151231f = new C58174e(this);
        linearLayout2.setOnClickListener(new C58175f(this));
        linearLayout.setOnClickListener(new C58178g(this));
    }

    /* renamed from: x0 */
    public static final void m67326x0(C58169j1 j1Var) {
        j1Var.getClass();
        Log.m105924i("MicroMsg.LiveCoreMic", "[cgi]doApplyMic start");
        j1Var.f166622y = true;
        j1Var.f166613p.setVisibility(4);
        j1Var.f166614q.setVisibility(0);
        j1Var.f166615r.setVisibility(4);
        new C53740h(RoomLiveService.f157197h.f133050d, RoomLiveService.f157192c, String.valueOf(System.currentTimeMillis())).doScene(C86709a0.m107524d().f256809d, new C58209s1(j1Var));
    }

    /* renamed from: A0 */
    public final void mo82940A0(boolean z) {
        this.f166612o.setEnabled(z);
        this.f166612o.setClickable(z);
        if (z) {
            ImageView imageView = this.f166608h;
            Drawable drawable = this.f166287d.getContext().getResources().getDrawable(C0966R.raw.icons_filled_call);
            C74933u4.m89769f(drawable, -1);
            imageView.setImageDrawable(drawable);
            this.f166609i.setText(this.f166287d.getContext().getResources().getString(C0966R.string.g7x));
            return;
        }
        Drawable drawable2 = this.f166608h.getDrawable();
        if (drawable2 != null) {
            drawable2.clearColorFilter();
        }
        this.f166608h.setImageDrawable(this.f166287d.getContext().getResources().getDrawable(C0966R.raw.icons_filled_mic_visitor_disable));
        this.f166609i.setText(this.f166287d.getContext().getResources().getString(C0966R.string.g7x));
    }

    /* renamed from: B0 */
    public final void mo82941B0() {
        this.f166622y = false;
        this.f166613p.setVisibility(4);
        this.f166615r.setVisibility(0);
        this.f166614q.setVisibility(4);
    }

    /* renamed from: C0 */
    public final void mo82942C0() {
        this.f166622y = false;
        this.f166614q.setVisibility(4);
        this.f166615r.setVisibility(4);
        this.f166613p.setVisibility(0);
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        C86709a0.m107529k().f251779b.mo123455a(3806, this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r20) {
        /*
            r19 = this;
            r6 = r19
            r7 = r20
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r7)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/live/plugin/LiveVisitorMicPlugin"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            r4 = r19
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            if (r7 == 0) goto L_0x002b
            int r0 = r20.getId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            r1 = 2131307758(0x7f092cee, float:1.8233752E38)
            java.lang.String r7 = "(Landroid/view/View;)V"
            java.lang.String r8 = "onClick"
            java.lang.String r9 = "android/view/View$OnClickListener"
            java.lang.String r10 = "com/tencent/mm/live/plugin/LiveVisitorMicPlugin"
            if (r0 != 0) goto L_0x003b
            goto L_0x0106
        L_0x003b:
            int r2 = r0.intValue()
            if (r2 != r1) goto L_0x0106
            java.lang.Class<aw.d> r0 = p447aw.C103918d.class
            di3.d r1 = di3.C86312j.m106911c(r0)
            r11 = r1
            aw.d r11 = (p447aw.C103918d) r11
            android.view.ViewGroup r1 = r6.f166287d
            android.content.Context r1 = r1.getContext()
            java.lang.String r2 = "null cannot be cast to non-null type android.app.Activity"
            gy3.C87412m.m108592e(r1, r2)
            r12 = r1
            android.app.Activity r12 = (android.app.Activity) r12
            r14 = 16
            java.lang.String r13 = "android.permission.CAMERA"
            java.lang.String r15 = ""
            java.lang.String r16 = ""
            boolean r1 = r11.mo125788z1(r12, r13, r14, r15, r16)
            java.lang.String r3 = "not get enough permission checkMicroPhone"
            java.lang.String r4 = "not get enough permission checkCamera"
            r5 = 1
            java.lang.String r11 = "MicroMsg.LiveCoreMic"
            r12 = 0
            if (r1 != 0) goto L_0x0077
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r4)
            com.tencent.mm.live.model.RoomLiveService$d r0 = com.tencent.p014mm.live.model.RoomLiveService.f157209t
            r0.f157227d = r5
        L_0x0075:
            r0 = 0
            goto L_0x00a1
        L_0x0077:
            di3.d r0 = di3.C86312j.m106911c(r0)
            r13 = r0
            aw.d r13 = (p447aw.C103918d) r13
            android.view.ViewGroup r0 = r6.f166287d
            android.content.Context r0 = r0.getContext()
            gy3.C87412m.m108592e(r0, r2)
            r14 = r0
            android.app.Activity r14 = (android.app.Activity) r14
            r16 = 80
            java.lang.String r15 = "android.permission.RECORD_AUDIO"
            java.lang.String r17 = ""
            java.lang.String r18 = ""
            boolean r0 = r13.mo125788z1(r14, r15, r16, r17, r18)
            if (r0 != 0) goto L_0x00a0
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r3)
            com.tencent.mm.live.model.RoomLiveService$d r0 = com.tencent.p014mm.live.model.RoomLiveService.f157209t
            r0.f157227d = r5
            goto L_0x0075
        L_0x00a0:
            r0 = 1
        L_0x00a1:
            if (r0 != 0) goto L_0x00a7
            j20.C117292a.m165361g(r6, r10, r9, r8, r7)
            return
        L_0x00a7:
            java.lang.Class<bh3.k> r0 = bh3.C113177k.class
            di3.d r1 = di3.C86312j.m106911c(r0)
            bh3.k r1 = (bh3.C113177k) r1
            bh3.k$b r2 = bh3.C113177k.C113179b.CAMERA
            bh3.k$a r13 = bh3.C113177k.C113178a.CHATTING
            d60.q1 r14 = new d60.q1
            r14.<init>()
            boolean r1 = r1.mo165712hg(r2, r13, r14)
            if (r1 == 0) goto L_0x00c7
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r4)
            com.tencent.mm.live.model.RoomLiveService$d r0 = com.tencent.p014mm.live.model.RoomLiveService.f157209t
            r0.f157227d = r5
        L_0x00c5:
            r5 = 0
            goto L_0x00e2
        L_0x00c7:
            di3.d r0 = di3.C86312j.m106911c(r0)
            bh3.k r0 = (bh3.C113177k) r0
            bh3.k$b r1 = bh3.C113177k.C113179b.MICRO_PHONE
            d60.r1 r2 = new d60.r1
            r2.<init>()
            boolean r0 = r0.mo165712hg(r1, r13, r2)
            if (r0 == 0) goto L_0x00e2
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r3)
            com.tencent.mm.live.model.RoomLiveService$d r0 = com.tencent.p014mm.live.model.RoomLiveService.f157209t
            r0.f157227d = r5
            goto L_0x00c5
        L_0x00e2:
            if (r5 != 0) goto L_0x00e8
            j20.C117292a.m165361g(r6, r10, r9, r8, r7)
            return
        L_0x00e8:
            r1 = 2131832137(0x7f112d49, float:1.929732E38)
            r2 = 2131832152(0x7f112d58, float:1.929735E38)
            r3 = 2131099674(0x7f06001a, float:1.7811708E38)
            r4 = 2131100168(0x7f060208, float:1.781271E38)
            d60.j1$l r5 = new d60.j1$l
            r5.<init>(r6)
            r0 = r19
            r0.mo82944y0(r1, r2, r3, r4, r5)
            qo3.n r0 = r6.f166618u
            if (r0 == 0) goto L_0x012f
            r0.mo107573q()
            goto L_0x012f
        L_0x0106:
            r1 = 2131307668(0x7f092c94, float:1.823357E38)
            if (r0 != 0) goto L_0x010c
            goto L_0x012f
        L_0x010c:
            int r0 = r0.intValue()
            if (r0 != r1) goto L_0x012f
            r1 = 2131832147(0x7f112d53, float:1.929734E38)
            r2 = 2131832118(0x7f112d36, float:1.929728E38)
            r3 = 2131099674(0x7f06001a, float:1.7811708E38)
            r4 = 2131101045(0x7f060575, float:1.7814489E38)
            d60.j1$m r5 = new d60.j1$m
            r5.<init>(r6)
            r0 = r19
            r0.mo82944y0(r1, r2, r3, r4, r5)
            qo3.n r0 = r6.f166618u
            if (r0 == 0) goto L_0x012f
            r0.mo107573q()
        L_0x012f:
            j20.C117292a.m165361g(r6, r10, r9, r8, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d60.C58169j1.onClick(android.view.View):void");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C49317ep2 j1;
        if ((yVar instanceof C16103b) && i == 0 && i2 == 0 && (j1 = ((C16103b) yVar).mo14699j1()) != null) {
            String str2 = "get live info for mic:" + j1.f133061r;
            C87412m.m108594g(str2, "debugText");
            Log.m105924i("MicroMsg.LiveCore", str2);
            mo82940A0(j1.f133061r);
        }
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        Bundle bundle2 = bundle;
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal != 7) {
            boolean z = true;
            if (ordinal == 16) {
                mo82942C0();
                this.f166616s.setText(this.f166287d.getContext().getResources().getString(C0966R.string.g_q));
                ImageView imageView = this.f166610j;
                Drawable drawable = this.f166287d.getContext().getResources().getDrawable(C0966R.raw.icons_filled_call);
                C74933u4.m89769f(drawable, -16777216);
                imageView.setImageDrawable(drawable);
                if (bundle2 == null || !bundle2.getBoolean("PARAM_HANGUP_SELF", false)) {
                    z = false;
                }
                if (z) {
                    RoomLiveService roomLiveService = RoomLiveService.f157190a;
                    String str = RoomLiveService.f157192c;
                    long j = RoomLiveService.f157197h.f133050d;
                    String str2 = RoomLiveService.f157199j;
                    String s = C75592q0.m90789s();
                    C87412m.m108593f(s, "getUsernameFromUserInfo()");
                    C58532b.m67947c(str, j, str2, 9, 4, s, RoomLiveService.f157197h.f133055i);
                }
            } else if (ordinal == 12) {
                RoomLiveService roomLiveService2 = RoomLiveService.f157190a;
                RoomLiveService.f157177I++;
                String str3 = RoomLiveService.f157192c;
                long j2 = RoomLiveService.f157197h.f133050d;
                String str4 = RoomLiveService.f157199j;
                String s2 = C75592q0.m90789s();
                C87412m.m108593f(s2, "getUsernameFromUserInfo()");
                C58532b.m67947c(str3, j2, str4, 6, 0, s2, RoomLiveService.f157197h.f133055i);
                Log.m105924i("MicroMsg.LiveLinkMicIDKeyStat", "markVisitorRequestLinkMic");
                C115669n.INSTANCE.mo175913w(1386, 2, 1);
            } else if (ordinal == 13) {
                RoomLiveService roomLiveService3 = RoomLiveService.f157190a;
                RoomLiveService.f157178J++;
                String str5 = RoomLiveService.f157192c;
                long j3 = RoomLiveService.f157197h.f133050d;
                String str6 = RoomLiveService.f157199j;
                String s3 = C75592q0.m90789s();
                C87412m.m108593f(s3, "getUsernameFromUserInfo()");
                C58532b.m67947c(str5, j3, str6, 9, 1, s3, RoomLiveService.f157197h.f133055i);
                Log.m105924i("MicroMsg.LiveLinkMicIDKeyStat", "markVisitorLinkMicSuccess");
                C115669n.INSTANCE.mo175913w(1386, 7, 1);
            } else if (ordinal == 43) {
                this.f166616s.setText(this.f166287d.getContext().getResources().getString(C0966R.string.g_q));
                ImageView imageView2 = this.f166610j;
                Drawable drawable2 = this.f166287d.getContext().getResources().getDrawable(C0966R.raw.icons_filled_call);
                C74933u4.m89769f(drawable2, -16777216);
                imageView2.setImageDrawable(drawable2);
            } else if (ordinal == 44) {
                this.f166616s.setText(this.f166287d.getContext().getResources().getString(C0966R.string.g_p));
                ImageView imageView3 = this.f166610j;
                Drawable drawable3 = this.f166287d.getContext().getResources().getDrawable(C0966R.raw.icons_filled_video_call);
                C74933u4.m89769f(drawable3, -16777216);
                imageView3.setImageDrawable(drawable3);
            }
        } else if (this.f166621x.f172989A.mo82884f()) {
            mo82941B0();
            this.f166616s.setText(this.f166287d.getContext().getResources().getString(C0966R.string.g_p));
            ImageView imageView4 = this.f166610j;
            Drawable drawable4 = this.f166287d.getContext().getResources().getDrawable(C0966R.raw.icons_filled_video_call);
            C74933u4.m89769f(drawable4, -16777216);
            imageView4.setImageDrawable(drawable4);
        } else if (this.f166621x.f172989A.mo82882d()) {
            mo82941B0();
            this.f166616s.setText(this.f166287d.getContext().getResources().getString(C0966R.string.g_q));
            ImageView imageView5 = this.f166610j;
            Drawable drawable5 = this.f166287d.getContext().getResources().getDrawable(C0966R.raw.icons_filled_call);
            C74933u4.m89769f(drawable5, -16777216);
            imageView5.setImageDrawable(drawable5);
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        this.f166618u = null;
        C86709a0.m107529k().f251779b.mo123470p(3806, this);
        RoomLiveService roomLiveService = RoomLiveService.f157190a;
        if (!TextUtils.isEmpty(RoomLiveService.f157185Q.f151235j) && RoomLiveService.f157204o) {
            mo82945z0(C58185n.f166640d);
        }
    }

    /* renamed from: y0 */
    public final void mo82944y0(int i, int i2, int i3, int i4, C32224a<C13598b0> aVar) {
        if (this.f166618u == null) {
            C77407n nVar = new C77407n(this.f166607g, 1, true);
            this.f166618u = nVar;
            nVar.f225775k1 = true;
        }
        View inflate = View.inflate(this.f166287d.getContext(), C0966R.C0971layout.b6k, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.fs_);
        C77407n nVar2 = this.f166618u;
        if (nVar2 != null) {
            nVar2.mo107569n(inflate, false);
        }
        textView.setText(this.f166607g.getResources().getString(i));
        C77407n nVar3 = this.f166618u;
        if (nVar3 != null) {
            nVar3.mo107570o(true);
        }
        C77407n nVar4 = this.f166618u;
        if (nVar4 != null) {
            nVar4.f225792t1 = false;
        }
        if (nVar4 != null) {
            nVar4.f225771i = new C58179h(this, i2);
        }
        if (nVar4 != null) {
            nVar4.f225782p = new C58180i(aVar, this);
        }
        if (nVar4 != null) {
            nVar4.f225761d = new C58181j(this);
        }
    }

    /* renamed from: z0 */
    public final void mo82945z0(C32224a<C13598b0> aVar) {
        mo82942C0();
        StringBuilder sb = new StringBuilder();
        sb.append("[cgi]visitor close mic.");
        RoomLiveService roomLiveService = RoomLiveService.f157190a;
        sb.append(RoomLiveService.f157185Q.f151234i);
        String sb4 = sb.toString();
        C87412m.m108594g(sb4, "debugText");
        Log.m105924i("MicroMsg.LiveCoreMic", sb4);
        long j = RoomLiveService.f157197h.f133050d;
        String str = RoomLiveService.f157192c;
        String valueOf = String.valueOf(System.currentTimeMillis());
        String str2 = RoomLiveService.f157185Q.f151235j;
        String str3 = RoomLiveService.f157197h.f133063t;
        C87412m.m108593f(str3, "RoomLiveService.liveInfo.sdk_user_id");
        new C53741k(j, str, valueOf, str2, str3).doScene(C86709a0.m107524d().f256809d, new C58182k(aVar));
        String str4 = RoomLiveService.f157192c;
        long j2 = RoomLiveService.f157197h.f133050d;
        String str5 = RoomLiveService.f157199j;
        String s = C75592q0.m90789s();
        C87412m.m108593f(s, "getUsernameFromUserInfo()");
        C58532b.m67947c(str4, j2, str5, 6, 1, s, RoomLiveService.f157197h.f133055i);
        Log.m105924i("MicroMsg.LiveLinkMicIDKeyStat", "markVisitorForgiveLinkBeforeConnect");
        C115669n.INSTANCE.mo175913w(1386, 3, 1);
    }
}
