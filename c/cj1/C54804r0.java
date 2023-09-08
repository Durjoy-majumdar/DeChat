package cj1;

import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import al1.C54127h;
import al1.C54129i;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import androidx.appcompat.app.AppCompatActivity;
import b50.C54424j;
import bl3.C39818r;
import cl1.C54979h1;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.api.LiveConfig;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82801g;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.shopping.MiniProgramHalfScreenStatusChangeListener;
import com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import d50.C58111e;
import di0.C86295k;
import di0.C86299o;
import di3.C7335d;
import di3.C86312j;
import dj1.C58294z;
import er1.C58719f2;
import er1.C58739j4;
import f40.C86709a0;
import fj1.C45795b;
import gg1.C32444a;
import gy3.C8480h;
import gy3.C87412m;
import h81.C59774i;
import hp3.C87581a;
import ht1.C60169f4;
import ht1.C60172g4;
import ht1.C60200t1;
import ht1.C60204t3;
import j20.C117292a;
import jp3.C9487b;
import k20.C9556a;
import np1.C61857d0;
import np1.C61882w;
import np1.C61885z;
import nr3.C89059e;
import ok1.C62042e;
import org.json.JSONObject;
import p185kq.C61130g;
import p185kq.C61131i;
import pt1.C35640b;
import rx3.C36570n;
import te3.C48833bb1;
import te3.C49712hj1;
import te3.C64414h71;
import te3.C64434i11;
import te3.C64674r41;
import tf0.C64916p1;
import wi0.C66117m;
import wi0.C90973a0;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;
import z04.C112550d0;
import z04.C112551y;
import zc1.C66785b;
import zk1.C66880s0;

/* renamed from: cj1.r0 */
public final class C54804r0 {

    /* renamed from: a */
    public static final C54804r0 f153631a = new C54804r0();

    /* renamed from: cj1.r0$b */
    public static final class C0589b<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C58294z.C7350a f1397a;

        /* renamed from: b */
        public final /* synthetic */ Context f1398b;

        /* renamed from: c */
        public final /* synthetic */ C45795b f1399c;

        public C0589b(C58294z.C7350a aVar, Context context, C45795b bVar) {
            this.f1397a = aVar;
            this.f1398b = context;
            this.f1399c = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0051, code lost:
            r4 = r4.f509d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object call(java.lang.Object r13) {
            /*
                r12 = this;
                ob0.b$c r13 = (ob0.C89132b.C89134c) r13
                int r0 = r13.f256793a
                int r1 = r13.f256794b
                java.lang.String r2 = r13.f256795c
                T r13 = r13.f256796d
                te3.nh1 r13 = (te3.C50543nh1) r13
                dj1.z$a r3 = r12.f1397a
                if (r3 == 0) goto L_0x0018
                java.lang.String r4 = "resp"
                gy3.C87412m.m108593f(r13, r4)
                r3.mo8521a(r0, r1, r2, r13)
            L_0x0018:
                r3 = 0
                if (r0 != 0) goto L_0x00f6
                if (r1 != 0) goto L_0x00f6
                int r0 = r13.f138607e
                r1 = 1
                boolean r0 = o40.C61926c.m72696u(r0, r1)
                r1 = 2131827772(0x7f111c3c, float:1.9288466E38)
                r2 = 0
                if (r0 == 0) goto L_0x009c
                android.content.Context r0 = r12.f1398b
                android.content.res.Resources r4 = r0.getResources()
                java.lang.String r4 = r4.getString(r1)
                cj1.t0 r5 = cj1.C0619t0.f1469a
                nj3.C76912y0.m92766e(r0, r4, r5)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r4 = "doPostComment attended lottery success,lotteryId:"
                r0.append(r4)
                fj1.b r4 = r12.f1399c
                java.lang.Class<rl1.d0> r5 = rl1.C13022d0.class
                androidx.lifecycle.i0 r4 = r4.mo71262a(r5)
                rl1.d0 r4 = (rl1.C13022d0) r4
                al1.q r4 = r4.f37098n
                if (r4 == 0) goto L_0x0058
                te3.z21 r4 = r4.f509d
                if (r4 == 0) goto L_0x0058
                java.lang.String r4 = r4.f145640d
                goto L_0x0059
            L_0x0058:
                r4 = r2
            L_0x0059:
                r0.append(r4)
                java.lang.String r0 = r0.toString()
                java.lang.String r4 = "FinderLiveAssistant2"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
                ok1.e r0 = ok1.C62042e.f176370a
                boolean r0 = r0.mo87027N0()
                if (r0 != 0) goto L_0x009c
                java.lang.Class<ak1.w> r0 = ak1.C54116w.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                java.lang.String r4 = "getService(HellLiveVisitorReoprter::class.java)"
                gy3.C87412m.m108593f(r0, r4)
                r5 = r0
                ak1.w r5 = (ak1.C54116w) r5
                ak1.f0$v0 r6 = ak1.C54067f0.C0071v0.POPUP_TOAST_JOINED
                r8 = 0
                r9 = 0
                r10 = 12
                r11 = 0
                java.lang.String r7 = ""
                ak1.C54116w.my0(r5, r6, r7, r8, r9, r10, r11)
                java.lang.Class<l31.e> r0 = l31.C61212e.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                l31.e r0 = (l31.C61212e) r0
                hl1.k$a r4 = hl1.C59988k.f171146g2
                java.util.Map r4 = r4.mo84902a()
                r5 = 25561(0x63d9, float:3.5819E-41)
                java.lang.String r6 = "finder_live_popup_joined_toast"
                r0.mo86153W7(r6, r2, r4, r5)
            L_0x009c:
                int r0 = r13.f138607e
                r4 = 2
                boolean r0 = o40.C61926c.m72696u(r0, r4)
                if (r0 == 0) goto L_0x00d8
                android.content.Context r0 = r12.f1398b
                android.content.res.Resources r4 = r0.getResources()
                java.lang.String r1 = r4.getString(r1)
                cj1.u0 r4 = cj1.C0622u0.f1474a
                nj3.C76912y0.m92766e(r0, r1, r4)
                fj1.b r0 = r12.f1399c
                java.lang.Class<cl1.x0> r1 = cl1.C55006x0.class
                androidx.lifecycle.i0 r0 = r0.mo71262a(r1)
                cl1.x0 r0 = (cl1.C55006x0) r0
                java.lang.String r1 = r0.f154451f
                java.lang.String r4 = "participateCurrentLottery"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
                d14.u0<te3.p31> r1 = r0.f154454i
                d14.j1 r1 = (d14.C58052j1) r1
                java.lang.Object r1 = r1.getValue()
                te3.p31 r1 = (te3.C64622p31) r1
                if (r1 == 0) goto L_0x00d4
                java.lang.String r1 = r1.f184746d
                goto L_0x00d5
            L_0x00d4:
                r1 = r2
            L_0x00d5:
                r0.mo76056i3(r1, r2)
            L_0x00d8:
                int r13 = r13.f138607e
                r0 = 4
                boolean r13 = o40.C61926c.m72696u(r13, r0)
                if (r13 == 0) goto L_0x011b
                android.content.Context r13 = r12.f1398b
                android.content.res.Resources r0 = r13.getResources()
                r1 = 2131828193(0x7f111de1, float:1.928932E38)
                java.lang.String r0 = r0.getString(r1)
                android.widget.Toast r13 = nj3.C76912y0.makeText((android.content.Context) r13, (java.lang.CharSequence) r0, (int) r3)
                r13.show()
                goto L_0x011b
            L_0x00f6:
                er1.j4 r13 = er1.C58739j4.f168176a
                boolean r13 = r13.mo83692U()
                if (r13 == 0) goto L_0x011b
                android.content.Context r13 = r12.f1398b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                r1 = 58
                r0.append(r1)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                android.widget.Toast r13 = nj3.C76912y0.makeText((android.content.Context) r13, (java.lang.CharSequence) r0, (int) r3)
                r13.show()
            L_0x011b:
                rx3.b0 r13 = rx3.C13598b0.f38549a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: cj1.C54804r0.C0589b.call(java.lang.Object):java.lang.Object");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.model.FinderLiveAssistant2", mo125469f = "FinderLiveAssistant2.kt", mo125470l = {582}, mo125471m = "CheckPurchaseLiveInvalid")
    /* renamed from: cj1.r0$a */
    public static final class C54805a extends C66704d {

        /* renamed from: d */
        public long f153632d;

        /* renamed from: e */
        public /* synthetic */ Object f153633e;

        /* renamed from: f */
        public final /* synthetic */ C54804r0 f153634f;

        /* renamed from: g */
        public int f153635g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54805a(C54804r0 r0Var, C15601d<? super C54805a> dVar) {
            super(dVar);
            this.f153634f = r0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f153633e = obj;
            this.f153635g |= Integer.MIN_VALUE;
            return this.f153634f.mo75760a(0, (String) null, 0, 0, 0, 0, (String) null, (String) null, this);
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m61728d(C54804r0 r0Var, Context context, C45795b bVar, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 2;
        }
        r0Var.mo75762c(context, bVar, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo75760a(long r21, java.lang.String r23, long r24, int r26, int r27, int r28, java.lang.String r29, java.lang.String r30, wx3.C15601d<? super java.lang.Boolean> r31) {
        /*
            r20 = this;
            r0 = r21
            r2 = r31
            boolean r3 = r2 instanceof cj1.C54804r0.C54805a
            if (r3 == 0) goto L_0x0019
            r3 = r2
            cj1.r0$a r3 = (cj1.C54804r0.C54805a) r3
            int r4 = r3.f153635g
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f153635g = r4
            r4 = r20
            goto L_0x0020
        L_0x0019:
            cj1.r0$a r3 = new cj1.r0$a
            r4 = r20
            r3.<init>(r4, r2)
        L_0x0020:
            java.lang.Object r2 = r3.f153633e
            xx3.a r5 = xx3.C15911a.COROUTINE_SUSPENDED
            int r6 = r3.f153635g
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L_0x003a
            if (r6 != r8) goto L_0x0032
            long r0 = r3.f153632d
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x008e
        L_0x0032:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003a:
            kotlin.ResultKt.throwOnFailure(r2)
            java.util.LinkedList r10 = new java.util.LinkedList
            r10.<init>()
            te3.wf1 r2 = new te3.wf1
            r2.<init>()
            r2.f186081d = r0
            r6 = r23
            r2.f186082e = r6
            r11 = r24
            r2.f186086i = r11
            r10.add(r2)
            r3.f153632d = r0
            r3.f153635g = r8
            wx3.h r2 = new wx3.h
            wx3.d r3 = xx3.C66447b.m78392b(r3)
            r2.<init>(r3)
            je1.l r3 = new je1.l
            r16 = 0
            r17 = 0
            r18 = 192(0xc0, float:2.69E-43)
            r19 = 0
            r9 = r3
            r11 = r26
            r12 = r27
            r13 = r28
            r14 = r29
            r15 = r30
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r3.f172733o = r7
            nr3.e r3 = r3.mo9225i()
            cj1.q0 r6 = new cj1.q0
            r6.<init>(r2)
            r3.mo123420E(r6)
            java.lang.Object r2 = r2.mo90314b()
            if (r2 != r5) goto L_0x008e
            return r5
        L_0x008e:
            te3.mg0 r2 = (te3.C50397mg0) r2
            r3 = 0
            if (r2 == 0) goto L_0x0096
            java.util.LinkedList<te3.ue1> r2 = r2.f138011d
            goto L_0x0097
        L_0x0096:
            r2 = r3
        L_0x0097:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            if (r2 == 0) goto L_0x00fb
            java.util.Iterator r6 = r2.iterator()
            r9 = 0
        L_0x00a3:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L_0x00fb
            java.lang.Object r10 = r6.next()
            int r11 = r9 + 1
            if (r9 < 0) goto L_0x00f7
            te3.ue1 r10 = (te3.C51533ue1) r10
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "[index:"
            r12.append(r13)
            r12.append(r9)
            r9 = 44
            r12.append(r9)
            te3.c21 r9 = r10.f142798e
            if (r9 == 0) goto L_0x00d1
            long r13 = r9.f182392d
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r13)
            goto L_0x00d2
        L_0x00d1:
            r9 = r3
        L_0x00d2:
            r12.append(r9)
            java.lang.String r9 = ",purchaseLiveInValid:"
            r12.append(r9)
            te3.gi1 r9 = r10.f142805o
            if (r9 == 0) goto L_0x00e5
            boolean r9 = r9.f134059d
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            goto L_0x00e6
        L_0x00e5:
            r9 = r3
        L_0x00e6:
            r12.append(r9)
            r9 = 93
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r5.append(r9)
            r9 = r11
            goto L_0x00a3
        L_0x00f7:
            sx3.C64197v.m75542k()
            throw r3
        L_0x00fb:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "purchaseLiveValid list:"
            r6.append(r9)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "FinderLiveAssistant2"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            if (r2 == 0) goto L_0x013a
            java.util.Iterator r2 = r2.iterator()
        L_0x0117:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0130
            java.lang.Object r5 = r2.next()
            r6 = r5
            te3.ue1 r6 = (te3.C51533ue1) r6
            long r9 = r6.f142797d
            int r6 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x012c
            r6 = 1
            goto L_0x012d
        L_0x012c:
            r6 = 0
        L_0x012d:
            if (r6 == 0) goto L_0x0117
            r3 = r5
        L_0x0130:
            te3.ue1 r3 = (te3.C51533ue1) r3
            if (r3 == 0) goto L_0x013a
            te3.gi1 r0 = r3.f142805o
            if (r0 == 0) goto L_0x013a
            boolean r7 = r0.f134059d
        L_0x013a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cj1.C54804r0.mo75760a(long, java.lang.String, long, int, int, int, java.lang.String, java.lang.String, wx3.d):java.lang.Object");
    }

    /* renamed from: b */
    public final void mo75761b(Context context, C45795b bVar, long j) {
        Class cls = C54979h1.class;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "buContext");
        boolean contains = ((C54979h1) bVar.mo71262a(cls)).f154149x.contains(Long.valueOf(j));
        Log.m105924i("FinderLiveAssistant2", "announceGotoShopping productId:" + j + ", haveBug:" + contains);
        if (j != 0 && !contains) {
            ((C54979h1) bVar.mo71262a(cls)).f154149x.add(Long.valueOf(j));
            mo75763e(context, bVar, C58294z.f166917x.mo8522a("", 10012, 0), (C58294z.C7350a) null);
        }
    }

    /* renamed from: c */
    public final void mo75762c(Context context, C45795b bVar, int i) {
        Class cls;
        Class cls2 = C54979h1.class;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "buContext");
        Log.m105924i("FinderLiveAssistant2", "closeMiniProgram,purpose:" + i + ", shoppingInMiniProgram:" + ((C54979h1) bVar.mo71262a(cls2)).f154109A);
        if (((C54979h1) bVar.mo71262a(cls2)).f154109A) {
            C54129i.f151984l.clear();
            Intent intent = new Intent();
            intent.putExtra("ACTIVITY_PURPOSE", i);
            intent.addFlags(335544320);
            if (!(context instanceof Activity) || !((C60204t3) C86312j.m106911c(C60204t3.class)).iu0((Activity) context)) {
                C35640b bVar2 = C35640b.f95284a;
                cls = (Class) ((C36570n) C35640b.f95296m).getValue();
            } else {
                C35640b bVar3 = C35640b.f95284a;
                cls = (Class) ((C36570n) C35640b.f95297n).getValue();
            }
            intent.setClass(context, cls);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/model/FinderLiveAssistant2", "closeMiniProgram", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/finder/live/model/FinderLiveAssistant2", "closeMiniProgram", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: e */
    public final String mo75763e(Context context, C45795b bVar, C64674r41 r412, C58294z.C7350a aVar) {
        long j;
        String str;
        String str2;
        C49712hj1 hj12;
        String str3;
        String str4;
        Context context2 = context;
        C45795b bVar2 = bVar;
        Class cls = C60172g4.class;
        Class cls2 = C55001u.class;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(bVar2, "buContext");
        C87412m.m108594g(r412, "liveMsg");
        C39818r rVar = C39818r.f106831a;
        C49712hj1 q3 = ((C60172g4) rVar.mo62443b(context2).mo62447c(cls)).mo12861q3();
        String n = C58739j4.f168176a.mo83718n();
        C62042e.f176370a.mo87061a(n, bVar2);
        long j2 = ((C55001u) bVar2.mo71262a(cls2)).f154420q.f182392d;
        byte[] bArr = ((C55001u) bVar2.mo71262a(cls2)).f154417n;
        long j3 = ((C55001u) bVar2.mo71262a(cls2)).f154416j;
        String str5 = ((C55001u) bVar2.mo71262a(cls2)).f154423t;
        String O5 = C66785b.f191882e.mo90662O5();
        C58111e a = C54424j.f152652a.mo75237a();
        String str6 = a != null ? a.f166192B : null;
        Class cls3 = C54108o.class;
        Class cls4 = C54116w.class;
        C64414h71 h712 = new C64414h71();
        String str7 = n;
        if (context2 instanceof AppCompatActivity) {
            AppCompatActivity appCompatActivity = (AppCompatActivity) context2;
            h712.f183424d = ((C60172g4) rVar.mo62444c(appCompatActivity).mo62447c(cls)).mo12839E3();
            String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
            hj12 = q3;
            if (Wb == null) {
                Wb = "";
            }
            h712.f183425e = Wb;
            str2 = str5;
            str = O5;
            h712.f183426f = ((C54116w) C86312j.m106911c(cls4)).f151950p;
            String str8 = ((C54116w) C86312j.m106911c(cls4)).f151927X0;
            if (str8 != null) {
                j = j3;
                str3 = C112551y.m153814n(str8, ",", ";", false);
            } else {
                j = j3;
                str3 = "";
            }
            h712.f183428h = str3;
            h712.f183427g = System.currentTimeMillis();
            String z3 = ((C60172g4) rVar.mo62444c(appCompatActivity).mo62447c(cls)).mo12868z3();
            h712.f183429i = z3 == null || z3.length() == 0 ? f153631a.mo75764f(((C54116w) C86312j.m106911c(cls4)).f151907K, "exposeType") : f153631a.mo75764f(z3, "exposeType");
            if (!C87412m.m108589b(((C54116w) C86312j.m106911c(cls4)).f151945i, "temp_6") || !C87412m.m108589b(((C61131i) C86312j.m106911c(C61131i.class)).mo86084Y7(), "111")) {
                str4 = ((C61130g) C86312j.m106911c(C61130g.class)).mo33244gK();
                if (str4 == null) {
                    str4 = "";
                }
            } else {
                str4 = "temp_7";
            }
            ((C54108o) C86312j.m106911c(cls3)).getClass();
            C54067f0 f0Var = C54108o.f151869h;
            ((C54108o) C86312j.m106911c(cls3)).getClass();
            h712.f183432o = f0Var.mo74755e(str4, (long) f0Var.f151432N.f151689d);
            h712.f183431n = f153631a.mo75764f(((C54116w) C86312j.m106911c(cls4)).f151907K, "enter_immerse_type");
            h712.f183443z = str4;
            C45795b bVar3 = C45795b.f123698n;
            long j4 = 0;
            h712.f183433p = bVar3 != null ? ((C55001u) bVar3.mo71262a(cls2)).f154414h : 0;
            Log.m105924i("FinderLiveAssistant2", "FinderLiveCommentScene get " + h712.f183443z + " when genLiveReportObj2");
            try {
                if (C112550d0.m153769E(str4, "temp_", 0, false, 6, (Object) null) != -1) {
                    j4 = Long.parseLong(C112551y.m153814n(str4, "temp_", "", false));
                }
                h712.f183430j = j4;
            } catch (Exception e) {
                Log.m105920e("FinderLiveAssistant2", "genLiveReportObj err:" + e.getMessage());
            }
            ((C66880s0) C39818r.f106831a.mo62444c(appCompatActivity).mo75002a(C66880s0.class)).mo90878f3(h712);
        } else {
            j = j3;
            str2 = str5;
            str = O5;
            hj12 = q3;
        }
        Log.m105924i("FinderLiveAssistant2", "enter_icon_type :" + h712.f183432o + " chnl_enter_immerse_type: " + h712.f183431n + " chnl_expose_type: " + h712.f183429i);
        String str9 = str7;
        C89059e i = new C58294z(j2, bArr, j, str2, str, hj12, r412, str9, str6, h712).mo9225i();
        Context context3 = context;
        i.mo123420E(new C0589b(aVar, context3, bVar));
        if (context3 instanceof MMActivity) {
            i.mo11397F((C9487b) context3);
        }
        return str9;
    }

    /* renamed from: f */
    public final String mo75764f(String str, String str2) {
        boolean z = true;
        if (str == null || str.length() == 0) {
            return "";
        }
        if (!(str2 == null || str2.length() == 0)) {
            z = false;
        }
        if (z) {
            return "";
        }
        try {
            String optString = new JSONObject(C112551y.m153814n(str, ";", ",", false)).optString(str2);
            C87412m.m108593f(optString, "jsonObject.optString(field)");
            return optString;
        } catch (Exception e) {
            Log.m105924i("FinderLiveAssistant2", String.valueOf(e.getMessage()));
            return "";
        }
    }

    /* renamed from: g */
    public final void mo75765g(Context context, C45795b bVar, boolean z, String str, C49712hj1 hj12) {
        Context context2 = context;
        C45795b bVar2 = bVar;
        String str2 = str;
        C49712hj1 hj13 = hj12;
        Class cls = C55001u.class;
        Class cls2 = C54991o.class;
        C87412m.m108594g(bVar, "buContext");
        C87412m.m108594g(str2, "finderUsername");
        Intent intent = new Intent();
        intent.putExtra("report_scene", 0);
        if (z) {
            if (Util.isNullOrNil(((C54991o) bVar.mo71262a(cls2)).f154345o)) {
                intent.putExtra("finder_username", "");
                intent.putExtra("key_finder_object_Id", String.valueOf(((C55001u) bVar.mo71262a(cls)).f154416j));
                intent.putExtra("key_finder_object_nonce_id_key", ((C55001u) bVar.mo71262a(cls)).f154423t);
            } else {
                intent.putExtra("finder_username", ((C54991o) bVar.mo71262a(cls2)).f154345o);
            }
            intent.putExtra("finder_read_feed_id", ((C55001u) bVar.mo71262a(cls)).f154416j);
            if (((C54991o) bVar.mo71262a(cls2)).mo75986U3().f183215f == 3) {
                intent.putExtra("follow_participant_finder_username", C66785b.f191882e.mo90662O5());
            }
        } else {
            intent.putExtra("finder_username", str2);
        }
        intent.putExtra("key_enter_profile_type", 11);
        if (hj13 != null) {
            String str3 = hj13.f134671e;
            String str4 = hj13.f134672f;
            if (!TextUtils.isEmpty(str3)) {
                intent.putExtra("key_context_id", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                intent.putExtra("key_click_tab_context_id", str4);
            }
        }
        if (context2 != null) {
            C7335d c = C86312j.m106911c(C64916p1.class);
            C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
            C64916p1.C64917a.m76443j((C64916p1) c, context, intent, 0, (String) null, 0, 0, false, 124, (Object) null);
            ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76819V1(context, intent);
        }
    }

    /* renamed from: h */
    public final void mo75766h(Context context, C45795b bVar, C86299o oVar, boolean z, ValueCallback<String> valueCallback) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "buContext");
        C87412m.m108594g(oVar, "bundle");
        Log.m105924i("FinderLiveAssistant2", "open fullscreen miniPro appId:" + oVar.f250930b + ",patch:" + oVar.f250934f + ",luanchFromApp:" + z + ",is test:" + C58739j4.f168176a.mo83673A());
        if (!Util.isNullOrNil(oVar.f250930b) && !Util.isNullOrNil(oVar.f250934f)) {
            String str = oVar.f250930b;
            C87412m.m108593f(str, "bundle.appId");
            ((C54979h1) bVar.mo71262a(C54979h1.class)).f154151z = str;
            oVar.f250913B = C90973a0.OPAQUE;
            mo75768j(context, bVar, oVar, z, valueCallback);
        }
    }

    /* renamed from: i */
    public final void mo75767i(Context context, C45795b bVar, C86299o oVar, C56032b bVar2) {
        HalfScreenConfig halfScreenConfig;
        String str;
        HalfScreenConfig.ShareActionConfig shareActionConfig;
        C45795b bVar3 = bVar;
        C86299o oVar2 = oVar;
        C56032b bVar4 = bVar2;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar3, "buContext");
        C87412m.m108594g(oVar2, "bundle");
        StringBuilder sb = new StringBuilder();
        sb.append("open halfscreen miniPro appId:");
        sb.append(oVar2.f250930b);
        sb.append(",patch:");
        sb.append(oVar2.f250934f);
        sb.append(",is test:");
        sb.append(C58739j4.f168176a.mo83673A());
        sb.append(",halfScreenConfig is null:");
        boolean z = true;
        sb.append(oVar2.f250912A == null);
        Log.m105924i("FinderLiveAssistant2", sb.toString());
        if (!Util.isNullOrNil(oVar2.f250930b) && !Util.isNullOrNil(oVar2.f250934f)) {
            HalfScreenConfig.BackgroundShapeConfig backgroundShapeConfig = new HalfScreenConfig.BackgroundShapeConfig(MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f357030a80), true, true, false, false, 24, (C8480h) null);
            String name = context.getClass().getName();
            HalfScreenConfig.C55451a aVar = HalfScreenConfig.C55451a.POPUP;
            HalfScreenConfig.CloseWhenClickEmptyAreaConfig closeWhenClickEmptyAreaConfig = new HalfScreenConfig.CloseWhenClickEmptyAreaConfig(name, aVar);
            float f = (float) C75044y4.m89990b(MMApplicationContext.getContext()).y;
            if (MMApplicationContext.getResources().getConfiguration().orientation == 2) {
                f = (float) C75044y4.m89990b(MMApplicationContext.getContext()).x;
            }
            int b = ((int) ((((float) C32444a.f86121a.mo58621b()) / 100.0f) * f)) + ((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3745cw));
            C86295k kVar = oVar2.f250937i;
            C61885z zVar = null;
            C54789l6 l6Var = kVar instanceof C54789l6 ? (C54789l6) kVar : null;
            boolean z2 = l6Var != null ? l6Var.f153594r : false;
            C54789l6 l6Var2 = kVar instanceof C54789l6 ? (C54789l6) kVar : null;
            boolean z3 = l6Var2 != null ? l6Var2.f153595s : false;
            C54789l6 l6Var3 = kVar instanceof C54789l6 ? (C54789l6) kVar : null;
            boolean z4 = l6Var3 != null ? l6Var3.f153590n : false;
            MiniProgramHalfScreenStatusChangeListener miniProgramHalfScreenStatusChangeListener = new MiniProgramHalfScreenStatusChangeListener(bVar4);
            HalfScreenConfig halfScreenConfig2 = oVar2.f250912A;
            if (halfScreenConfig2 == null || C87412m.m108589b(halfScreenConfig2, HalfScreenConfig.f157929P)) {
                halfScreenConfig = new HalfScreenConfig(true, b, aVar, true, backgroundShapeConfig, true, closeWhenClickEmptyAreaConfig, HalfScreenConfig.C55453c.SINGLE_CLOSE, z2, true, miniProgramHalfScreenStatusChangeListener, (HalfScreenConfig.C55456f) null, false, false, (C66117m) null, false, (HalfScreenConfig.ShareActionConfig) null, 0, 0, 0, false, false, false, (HalfScreenConfig.C55455e) null, false, (HalfScreenConfig.CustomSubjectInfo) null, (int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3745cw), false, false, 0, false, false, false, -67115008, 1, (C8480h) null);
            } else {
                HalfScreenConfig halfScreenConfig3 = oVar2.f250912A;
                if (halfScreenConfig3 != null) {
                    HalfScreenConfig.C55452b f2 = halfScreenConfig3.mo76935f();
                    f2.f157989a = true;
                    f2.f157995g = true;
                    f2.f157997i = backgroundShapeConfig;
                    f2.f157998j = true;
                    f2.f157996h = closeWhenClickEmptyAreaConfig;
                    f2.f158000l = z2;
                    f2.f158001m = z3;
                    f2.f158003o = miniProgramHalfScreenStatusChangeListener;
                    f2.f157982A = (int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3745cw);
                    if (!z4 || !z2 || z3) {
                        z = false;
                    }
                    f2.f157983B = z;
                    halfScreenConfig = f2.mo76967a();
                } else {
                    halfScreenConfig = null;
                }
            }
            oVar2.f250912A = halfScreenConfig;
            C58719f2 f2Var = C58719f2.f168110a;
            String str2 = ((C54991o) bVar3.mo71262a(C54991o.class)).f154345o;
            HalfScreenConfig halfScreenConfig4 = oVar2.f250912A;
            if (halfScreenConfig4 == null || (shareActionConfig = halfScreenConfig4.f157959v) == null || (str = shareActionConfig.f157978e) == null) {
                str = "";
            }
            f2Var.mo83629a(str2, str, oVar2);
            String str3 = oVar2.f250930b;
            C87412m.m108593f(str3, "bundle.appId");
            ((C54979h1) bVar3.mo71262a(C54979h1.class)).f154151z = str3;
            if (bVar4 != null) {
                String str4 = oVar2.f250930b;
                C87412m.m108593f(str4, "bundle.appId");
                zVar = new C61885z(bVar4, str4);
            }
            mo75768j(context, bVar, oVar, true, zVar);
        }
    }

    /* renamed from: j */
    public final void mo75768j(Context context, C45795b bVar, C86299o oVar, boolean z, ValueCallback<String> valueCallback) {
        Class cls;
        C54127h b;
        LiveConfig liveConfig;
        C54127h b2;
        LiveConfig liveConfig2;
        C54127h b3;
        LiveConfig liveConfig3;
        byte[] bArr;
        C64434i11 i112;
        C48833bb1 bb12;
        String str;
        Context context2 = context;
        C45795b bVar2 = bVar;
        C86299o oVar2 = oVar;
        Class cls2 = C54979h1.class;
        C87412m.m108594g(bVar2, "liveData");
        C87412m.m108594g(oVar2, "bundle");
        Integer num = null;
        if (z) {
            boolean z2 = Util.isNullOrNil(((C54979h1) bVar2.mo71262a(cls2)).f154151z) && !Util.isNullOrNil(oVar2.f250930b);
            C86295k kVar = oVar2.f250937i;
            C54789l6 l6Var = kVar instanceof C54789l6 ? (C54789l6) kVar : null;
            C61882w.f175962a.getClass();
            String str2 = (!C61882w.f175966e || (i112 = ((C54979h1) bVar2.mo71262a(cls2)).f154139n) == null || (bb12 = i112.f183578h) == null || (str = bb12.f131034d) == null) ? "" : str;
            C60169f4 f4Var = (C60169f4) C86312j.m106911c(C60169f4.class);
            if (f4Var != null) {
                Context context3 = MMApplicationContext.getContext();
                C87412m.m108593f(context3, "getContext()");
                int i = l6Var != null ? l6Var.f153591o : 0;
                if (l6Var == null || (bArr = l6Var.f153592p) == null) {
                    bArr = "";
                }
                String valueOf = String.valueOf(bArr);
                String str3 = oVar2.f250930b;
                f4Var.mo83298K6(context3, z2, i, valueOf, str3 == null ? "" : str3, oVar2.f250939k, str2, C61882w.f175964c, C61882w.f175965d, String.valueOf(((C55001u) bVar2.mo71262a(C55001u.class)).f154420q.f182392d), C66785b.f191882e.mo90662O5(), "", String.valueOf(((C54991o) bVar2.mo71262a(C54991o.class)).f154325i1));
            }
        } else {
            Log.m105924i("MiniProgramReportHelper", "luanch from mini program!");
        }
        oVar2.f250931c = C58739j4.f168176a.mo83673A();
        oVar2.f250943o = valueCallback;
        oVar2.f250945q = 1000;
        int hashCode = oVar.hashCode();
        oVar2.f250917F = true;
        WeAppHalfScreenStatusChangeListener weAppHalfScreenStatusChangeListener = oVar2.f250912A.f157953p;
        oVar2.f250916E = new C61857d0(bVar2, weAppHalfScreenStatusChangeListener instanceof MiniProgramHalfScreenStatusChangeListener ? (MiniProgramHalfScreenStatusChangeListener) weAppHalfScreenStatusChangeListener : null);
        C54129i.f151984l.put(Integer.valueOf(hashCode), oVar2);
        FinderLiveService.f159376d.getClass();
        C54129i iVar = FinderLiveService.f159398z;
        String str4 = (iVar == null || (b3 = iVar.mo74924b()) == null || (liveConfig3 = b3.f151977d) == null) ? null : liveConfig3.f157049G;
        C54129i iVar2 = FinderLiveService.f159398z;
        String str5 = (iVar2 == null || (b2 = iVar2.mo74924b()) == null || (liveConfig2 = b2.f151977d) == null) ? null : liveConfig2.f157052J;
        C54129i iVar3 = FinderLiveService.f159398z;
        if (!(iVar3 == null || (b = iVar3.mo74924b()) == null || (liveConfig = b.f151977d) == null)) {
            num = Integer.valueOf(liveConfig.f157051I);
        }
        if (num != null && num.intValue() == 1) {
            WCPaySessionInfoRecorder.f210858a.mo99898a(oVar2.f250930b, new WCPaySessionInfoRecorder.JsApiPayInfo(C87412m.m108589b(str5, C86709a0.m107523b().mo121112j()) ? str4 : str5, str4, 0, ""));
        } else if (num != null && num.intValue() == 2) {
            WCPaySessionInfoRecorder.f210858a.mo99898a(oVar2.f250930b, new WCPaySessionInfoRecorder.JsApiPayInfo(str4, ""));
        }
        Log.m105924i("FinderLiveAssistant2", "launchMiniProgram,key:" + hashCode + ",fromUsername:" + str4 + ",toUsername:" + str5 + ",fromShareSceneNew:" + num);
        Intent intent = new Intent();
        intent.putExtra("ACTIVITY_PURPOSE", 1);
        intent.putExtra("LUANCH_KEY", hashCode);
        intent.putExtra("MMActivity.OverrideEnterAnimation", -1);
        intent.putExtra("MMActivity.OverrideExitAnimation", -1);
        intent.addFlags(67108864);
        C62042e.f176370a.getClass();
        C87412m.m108594g(context2, "context");
        if (((C60204t3) C86312j.m106911c(C60204t3.class)).Kv0(context2)) {
            C35640b bVar3 = C35640b.f95284a;
            cls = (Class) ((C36570n) C35640b.f95297n).getValue();
        } else {
            C35640b bVar4 = C35640b.f95284a;
            cls = (Class) ((C36570n) C35640b.f95296m).getValue();
        }
        intent.setClass(context2, cls);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/model/FinderLiveAssistant2", C82801g.NAME, "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Lcom/tencent/mm/plugin/appbrand/api/WeAppOpenBundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/live/model/FinderLiveAssistant2", C82801g.NAME, "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Lcom/tencent/mm/plugin/appbrand/api/WeAppOpenBundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
