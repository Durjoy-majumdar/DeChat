package zo1;

import a14.C0000n0;
import a14.C53934p0;
import ak1.C0047e0;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import bp1.C54519d;
import cl1.C0668l;
import cl1.C54991o;
import cl1.C55001u;
import cm1.C0797z;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import cp1.C57952m;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import dj1.C45381p0;
import er1.C58739j4;
import fj1.C45795b;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76912y0;
import nk1.C11207i;
import o40.C61926c;
import ob0.C89132b;
import ok1.C62042e;
import org.json.JSONObject;
import pe3.C89349b;
import qj1.C62660c;
import qo3.C77407n;
import qo3.C89779i0;
import rx3.C13598b0;
import te3.C48807b41;
import te3.C49712hj1;
import te3.C50401mh0;
import te3.C51778w31;
import te3.C64337e61;
import tf0.C13883o1;
import tf0.C64916p1;
import wc3.C15133e0;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: zo1.r */
public final class C16361r extends C62660c {

    /* renamed from: p */
    public final C58124b f43739p;

    /* renamed from: zo1.r$a */
    public static final class C16362a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C16361r f43740d;

        /* renamed from: e */
        public final /* synthetic */ ViewGroup f43741e;

        public C16362a(C16361r rVar, ViewGroup viewGroup) {
            this.f43740d = rVar;
            this.f43741e = viewGroup;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/replay/plugin/ReplayMoreActionPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C16361r rVar = this.f43740d;
            Context context = this.f43741e.getContext();
            C87412m.m108593f(context, "root.context");
            rVar.getClass();
            Class cls = C54991o.class;
            C15133e0 Ct0 = ((C15133e0) C86312j.m106911c(C15133e0.class)).Ct0();
            boolean z = false;
            C77407n nVar = new C77407n(context, 0, true);
            nVar.f225779n1 = true;
            nVar.f225775k1 = true;
            nVar.mo107570o(true);
            nVar.f225792t1 = false;
            nVar.f225771i = new C16368s(nVar, rVar, context);
            nVar.f225773j = new C16369t(nVar, rVar);
            if (C62042e.f176370a.mo87082h(((C54991o) rVar.mo87696x0(cls)).f154388y0)) {
                C58739j4 j4Var = C58739j4.f168176a;
                FinderObject finderObject = ((C54991o) rVar.mo87696x0(cls)).f154341n;
                j4Var.getClass();
                if (((finderObject != null ? finderObject.permissionFlag : 0) & 1) == 0) {
                    z = true;
                }
                if (z) {
                    nVar.f225778n = new C16370u(nVar, Ct0, context);
                    nVar.f225789s = new C16373w(rVar, Ct0, context, nVar);
                    nVar.f225791t = new C16375x(nVar, Ct0);
                }
            }
            C16363b bVar = new C16363b(nVar, context, rVar.mo87684A0(), rVar.mo14484z0());
            nVar.f225782p = bVar;
            nVar.f225787r = bVar;
            nVar.mo107573q();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/replay/plugin/ReplayMoreActionPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: zo1.r$b */
    public static final class C16363b implements C11184p0 {

        /* renamed from: d */
        public final C77407n f43742d;

        /* renamed from: e */
        public final Context f43743e;

        /* renamed from: f */
        public final C45795b f43744f;

        /* renamed from: g */
        public final C56032b f43745g;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.replay.plugin.ReplayMoreActionPlugin$MoreActionListener$onMMMenuItemSelected$3", mo125469f = "ReplayMoreActionPlugin.kt", mo125470l = {246}, mo125471m = "invokeSuspend")
        /* renamed from: zo1.r$b$a */
        public static final class C16364a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public Object f43746d;

            /* renamed from: e */
            public int f43747e;

            /* renamed from: f */
            public final /* synthetic */ C16363b f43748f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C16364a(C16363b bVar, C15601d<? super C16364a> dVar) {
                super(2, dVar);
                this.f43748f = bVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C16364a(this.f43748f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C16364a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: java.lang.String} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Removed duplicated region for block: B:32:0x00d1  */
            /* JADX WARNING: Removed duplicated region for block: B:33:0x00d3  */
            /* JADX WARNING: Removed duplicated region for block: B:35:0x00d6  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r20) {
                /*
                    r19 = this;
                    r8 = r19
                    java.lang.Class<cl1.u> r0 = cl1.C55001u.class
                    xx3.a r9 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r1 = r8.f43747e
                    r10 = 0
                    r2 = 1
                    if (r1 == 0) goto L_0x0025
                    if (r1 != r2) goto L_0x001d
                    java.lang.Object r0 = r8.f43746d
                    r1 = r0
                    java.lang.String r1 = (java.lang.String) r1
                    kotlin.ResultKt.throwOnFailure(r20)     // Catch:{ Exception -> 0x001a }
                    r0 = r20
                    goto L_0x00a9
                L_0x001a:
                    r0 = move-exception
                    goto L_0x00af
                L_0x001d:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r1)
                    throw r0
                L_0x0025:
                    kotlin.ResultKt.throwOnFailure(r20)
                    zo1.r$b r1 = r8.f43748f
                    fj1.b r1 = r1.f43744f
                    androidx.lifecycle.i0 r1 = r1.mo71262a(r0)
                    cl1.u r1 = (cl1.C55001u) r1
                    byte[] r1 = r1.f154417n
                    pe3.b r1 = pe3.C89349b.m111674a(r1)
                    zo1.r$b r3 = r8.f43748f
                    fj1.b r3 = r3.f43744f
                    androidx.lifecycle.i0 r3 = r3.mo71262a(r0)
                    cl1.u r3 = (cl1.C55001u) r3
                    long r3 = r3.f154416j
                    zo1.r$b r5 = r8.f43748f
                    fj1.b r5 = r5.f43744f
                    androidx.lifecycle.i0 r5 = r5.mo71262a(r0)
                    cl1.u r5 = (cl1.C55001u) r5
                    te3.c21 r5 = r5.f154420q
                    te3.so2 r5 = r5.f182413y0
                    if (r5 == 0) goto L_0x0058
                    java.lang.String r5 = r5.f141652e
                    if (r5 != 0) goto L_0x005a
                L_0x0058:
                    java.lang.String r5 = ""
                L_0x005a:
                    zo1.r$b r6 = r8.f43748f
                    fj1.b r6 = r6.f43744f
                    androidx.lifecycle.i0 r0 = r6.mo71262a(r0)
                    cl1.u r0 = (cl1.C55001u) r0
                    te3.c21 r0 = r0.f154420q
                    long r6 = r0.f182392d
                    zo1.r$b r0 = r8.f43748f
                    fj1.b r0 = r0.f43744f
                    java.lang.Class<cl1.o> r11 = cl1.C54991o.class
                    androidx.lifecycle.i0 r0 = r0.mo71262a(r11)
                    cl1.o r0 = (cl1.C54991o) r0
                    java.lang.String r11 = r0.f154345o
                    te3.nz0 r0 = new te3.nz0     // Catch:{ Exception -> 0x00ad }
                    r0.<init>()     // Catch:{ Exception -> 0x00ad }
                    je1.h2 r12 = je1.C46523h2.f125330a     // Catch:{ Exception -> 0x00ad }
                    r13 = 10635(0x298b, float:1.4903E-41)
                    te3.ig0 r12 = r12.mo71859a(r13)     // Catch:{ Exception -> 0x00ad }
                    r0.f138847d = r12     // Catch:{ Exception -> 0x00ad }
                    r0.f138848e = r5     // Catch:{ Exception -> 0x00ad }
                    r0.f138849f = r3     // Catch:{ Exception -> 0x00ad }
                    r0.f138851h = r1     // Catch:{ Exception -> 0x00ad }
                    r0.f138850g = r6     // Catch:{ Exception -> 0x00ad }
                    r1 = 2
                    r0.f138853j = r1     // Catch:{ Exception -> 0x00ad }
                    ob0.b r1 = r0.mo73345b()     // Catch:{ Exception -> 0x00ad }
                    r3 = 0
                    r0 = 0
                    r6 = 3
                    r7 = 0
                    r8.f43746d = r11     // Catch:{ Exception -> 0x00ad }
                    r8.f43747e = r2     // Catch:{ Exception -> 0x00ad }
                    r2 = r3
                    r4 = r0
                    r5 = r19
                    java.lang.Object r0 = q40.C89456b.m111831a(r1, r2, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00ad }
                    if (r0 != r9) goto L_0x00a8
                    return r9
                L_0x00a8:
                    r1 = r11
                L_0x00a9:
                    te3.oz0 r0 = (te3.C50756oz0) r0     // Catch:{ Exception -> 0x001a }
                    r15 = r1
                    goto L_0x00c7
                L_0x00ad:
                    r0 = move-exception
                    r1 = r11
                L_0x00af:
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "#SHEET_MORE_ACTION_TICKET FinderLiveGetConcertTicketInfoRequest fail. "
                    r2.append(r3)
                    r2.append(r0)
                    java.lang.String r0 = r2.toString()
                    java.lang.String r2 = "ReplayMoreActionPlugin"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
                    r15 = r1
                    r0 = r10
                L_0x00c7:
                    if (r0 == 0) goto L_0x00f2
                    te3.ez r0 = r0.f139459d
                    if (r0 == 0) goto L_0x00f2
                    boolean r1 = r0.f133188j
                    if (r1 == 0) goto L_0x00d3
                    r13 = r0
                    goto L_0x00d4
                L_0x00d3:
                    r13 = r10
                L_0x00d4:
                    if (r13 == 0) goto L_0x00f2
                    zo1.r$b r0 = r8.f43748f
                    java.lang.Class<ir.n> r1 = p565ir.C60606n.class
                    di3.d r1 = di3.C86312j.m106911c(r1)
                    java.lang.String r2 = "getService(IFinderLiveFeatureService::class.java)"
                    gy3.C87412m.m108593f(r1, r2)
                    r11 = r1
                    ir.n r11 = (p565ir.C60606n) r11
                    android.content.Context r12 = r0.f43743e
                    r14 = 0
                    r16 = 0
                    r17 = 20
                    r18 = 0
                    p565ir.C60606n.C60607a.m70859c(r11, r12, r13, r14, r15, r16, r17, r18)
                L_0x00f2:
                    rx3.b0 r0 = rx3.C13598b0.f38549a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: zo1.C16361r.C16363b.C16364a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* renamed from: zo1.r$b$b */
        public static final class C16365b implements C11182m0 {

            /* renamed from: d */
            public final /* synthetic */ C16363b f43749d;

            public C16365b(C16363b bVar) {
                this.f43749d = bVar;
            }

            public final void onCreateMMMenu(C76874e0 e0Var) {
                if (e0Var.mo107176v()) {
                    e0Var.mo107140d(8, this.f43749d.f43743e.getResources().getColor(C0966R.color.f2966ao), this.f43749d.f43743e.getResources().getString(C0966R.string.mb_));
                }
            }
        }

        /* renamed from: zo1.r$b$c */
        public static final class C16366c implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ C16363b f43750d;

            public C16366c(C16363b bVar) {
                this.f43750d = bVar;
            }

            public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
                if (menuItem.getItemId() == 8) {
                    this.f43750d.mo14839a(false, true);
                }
            }
        }

        /* renamed from: zo1.r$b$d */
        public static final class C16367d extends C87413o implements C32226l<C89132b.C89134c<C51778w31>, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C89779i0 f43751d;

            /* renamed from: e */
            public final /* synthetic */ boolean f43752e;

            /* renamed from: f */
            public final /* synthetic */ C16363b f43753f;

            /* renamed from: g */
            public final /* synthetic */ boolean f43754g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C16367d(C89779i0 i0Var, boolean z, C16363b bVar, boolean z2) {
                super(1);
                this.f43751d = i0Var;
                this.f43752e = z;
                this.f43753f = bVar;
                this.f43754g = z2;
            }

            public Object invoke(Object obj) {
                C89132b.C89134c cVar = (C89132b.C89134c) obj;
                Class cls = C54519d.class;
                this.f43751d.dismiss();
                boolean z = false;
                int i = 1;
                if (cVar != null && cVar.f256793a == 0) {
                    z = true;
                }
                if (z && cVar.f256794b == 0) {
                    if (this.f43752e) {
                        C66925j0 j0Var = (C66925j0) this.f43753f.f43745g.getPlugin(C66925j0.class);
                        if (j0Var != null) {
                            j0Var.mo90918d1();
                            C57952m mVar = j0Var.f192301r;
                            if (mVar != null) {
                                mVar.mo82760f();
                            }
                        }
                        Context context = this.f43753f.f43743e;
                        C76912y0.m92768g(context, context.getResources().getString(C0966R.string.mbd));
                        FeedUpdateEvent feedUpdateEvent = new FeedUpdateEvent();
                        feedUpdateEvent.f9173d.f9174a = ((C54519d) this.f43753f.f43744f.mo71262a(cls)).mo75371d3();
                        feedUpdateEvent.f9173d.f9175b = 24;
                        feedUpdateEvent.publish();
                    } else {
                        FeedUpdateEvent feedUpdateEvent2 = new FeedUpdateEvent();
                        feedUpdateEvent2.f9173d.f9174a = ((C54519d) this.f43753f.f43744f.mo71262a(cls)).mo75371d3();
                        feedUpdateEvent2.f9173d.f9175b = 27;
                        feedUpdateEvent2.publish();
                        Context context2 = this.f43753f.f43743e;
                        C76912y0.m92768g(context2, context2.getResources().getString(C0966R.string.fyl));
                        Log.m105924i("ReplayMoreActionPlugin", "setReplay " + ((C54519d) this.f43753f.f43744f.mo71262a(cls)).mo75373f3() + " enable:" + this.f43754g + '!');
                    }
                    C54519d dVar = (C54519d) this.f43753f.f43744f.mo71262a(cls);
                    boolean z2 = this.f43754g;
                    boolean z3 = this.f43752e;
                    if (dVar.f152858u == -1) {
                        dVar.mo75378m3(dVar.mo75372e3().f182366L);
                    }
                    Log.m105924i("MMFinder.LiveReplaySlice", "setAnchorStatus enableForAny:" + z2 + " replay_status " + dVar.mo75372e3().f182366L);
                    if (!z2) {
                        i = z3 ? 2 : 5;
                    }
                    dVar.mo75378m3(i);
                }
                return C13598b0.f38549a;
            }
        }

        public C16363b(C77407n nVar, Context context, C45795b bVar, C56032b bVar2) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(bVar, "buContext");
            C87412m.m108594g(bVar2, "basePluginLayout");
            this.f43742d = nVar;
            this.f43743e = context;
            this.f43744f = bVar;
            this.f43745g = bVar2;
        }

        /* renamed from: a */
        public final void mo14839a(boolean z, boolean z2) {
            Class cls = C54519d.class;
            Context context = this.f43743e;
            C89779i0 e = C89779i0.m112248e(context, context.getString(C0966R.string.a4d), false, 3, (DialogInterface.OnCancelListener) null);
            C50401mh0 mh02 = new C50401mh0();
            mh02.f138028d = 0;
            C48807b41 b412 = new C48807b41();
            b412.f130930d = z ? 1 : 0;
            if (!z) {
                b412.f130931e = z2 ? 1 : 0;
            }
            mh02.f138029e = C89349b.m111674a(b412.toByteArray());
            C61926c.m72665J(new C45381p0(((C54519d) this.f43744f.mo71262a(cls)).mo75371d3(), ((C54519d) this.f43744f.mo71262a(cls)).mo75373f3(), 1, mh02).mo9225i(), new C16367d(e, z2, this, z));
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            Class cls = C54519d.class;
            Class cls2 = C8777j5.class;
            Class cls3 = C55001u.class;
            Class cls4 = C13883o1.class;
            Class cls5 = C54991o.class;
            Integer valueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
            if (valueOf != null && valueOf.intValue() == 1) {
                FinderObject finderObject = ((C54991o) this.f43744f.mo71262a(cls5)).f154341n;
                if (finderObject != null) {
                    FinderItem a = FinderItem.Companion.mo79056a(finderObject, 16384);
                    a.setEcSource(((C54991o) this.f43744f.mo71262a(cls5)).f154199F1);
                    C7335d c = C86312j.m106911c(cls4);
                    C87412m.m108593f(c, "getService(IActivityRouter::class.java)");
                    Context context = this.f43743e;
                    C87412m.m108592e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                    C13883o1.C13884a.m13254f((C13883o1) c, (AppCompatActivity) context, a, (Bundle) null, 0, (C32226l) null, 28, (Object) null);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("object_id", C61926c.m72691p(((C55001u) this.f43744f.mo71262a(cls3)).f154416j));
                    jSONObject.put("share_des", "chat");
                    C0047e0.f58a.mo54a(jSONObject);
                    String jSONObject2 = jSONObject.toString();
                    C87412m.m108593f(jSONObject2, "this.toString()");
                    ((C8777j5) C86312j.m106911c(cls2)).hg0("share_record_duration", jSONObject2);
                }
                C77407n nVar = this.f43742d;
                if (nVar != null) {
                    nVar.mo107572p();
                }
            } else if (valueOf != null && valueOf.intValue() == 2) {
                FinderObject finderObject2 = ((C54991o) this.f43744f.mo71262a(cls5)).f154341n;
                if (finderObject2 != null) {
                    FinderItem a2 = FinderItem.Companion.mo79056a(finderObject2, 16384);
                    a2.setEcSource(((C54991o) this.f43744f.mo71262a(cls5)).f154199F1);
                    C7335d c2 = C86312j.m106911c(cls4);
                    C87412m.m108593f(c2, "getService(IActivityRouter::class.java)");
                    Context context2 = this.f43743e;
                    C87412m.m108592e(context2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                    C13883o1.C13884a.m13255g((C13883o1) c2, (AppCompatActivity) context2, new C0797z(a2), (Bundle) null, 0, 0, 28, (Object) null);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("object_id", C61926c.m72691p(((C55001u) this.f43744f.mo71262a(cls3)).f154416j));
                    jSONObject3.put("share_des", "moment");
                    C0047e0.f58a.mo54a(jSONObject3);
                    String jSONObject4 = jSONObject3.toString();
                    C87412m.m108593f(jSONObject4, "this.toString()");
                    ((C8777j5) C86312j.m106911c(cls2)).hg0("share_record_duration", jSONObject4);
                }
                C77407n nVar2 = this.f43742d;
                if (nVar2 != null) {
                    nVar2.mo107572p();
                }
            } else if (valueOf != null && valueOf.intValue() == 4) {
                ((C64916p1) C86312j.m106911c(C64916p1.class)).mo76669M7(this.f43743e, "https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=80", ((C54519d) this.f43744f.mo71262a(cls)).mo75371d3(), ((C54519d) this.f43744f.mo71262a(cls)).mo75370c3(), (Long) null, 62);
                C77407n nVar3 = this.f43742d;
                if (nVar3 != null) {
                    nVar3.mo107572p();
                }
            } else if (valueOf != null && valueOf.intValue() == 9) {
                C11207i.m11070f(this.f43745g, (C66212f) null, (C53934p0) null, new C16364a(this, (C15601d<? super C16364a>) null), 3, (Object) null);
            } else if (valueOf != null && valueOf.intValue() == 8) {
                C77407n nVar4 = new C77407n(this.f43743e, 1, true);
                nVar4.mo107570o(true);
                Context context3 = this.f43743e;
                C87412m.m108594g(context3, "context");
                View inflate = LayoutInflater.from(context3).inflate(C0966R.C0971layout.bc5, (ViewGroup) null);
                TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.kpi);
                textView.setGravity(17);
                textView.setText(C0668l.m589e3((C0668l) this.f43744f.mo71262a(C0668l.class), (C64337e61) null, 1, (Object) null) ? context3.getResources().getString(C0966R.string.mbc) : context3.getResources().getString(C0966R.string.mbb));
                textView.setTextColor(context3.getResources().getColor(C0966R.color.BW_100_Alpha_0_3));
                textView.setTextSize(1, 14.0f);
                nVar4.mo107569n(inflate, false);
                nVar4.f225771i = new C16365b(this);
                nVar4.f225782p = new C16366c(this);
                C77407n nVar5 = this.f43742d;
                if (nVar5 != null) {
                    nVar5.mo107572p();
                }
                nVar4.mo107573q();
            } else if (valueOf != null && valueOf.intValue() == 6) {
                mo14839a(true, false);
                C77407n nVar6 = this.f43742d;
                if (nVar6 != null) {
                    nVar6.mo107572p();
                }
            } else if (valueOf != null && valueOf.intValue() == 7) {
                mo14839a(false, false);
                C77407n nVar7 = this.f43742d;
                if (nVar7 != null) {
                    nVar7.mo107572p();
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16361r(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f43739p = bVar;
        viewGroup.setOnClickListener(new C16362a(this, viewGroup));
        C62042e.f176370a.mo87071d(this);
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return false;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return true;
    }
}
