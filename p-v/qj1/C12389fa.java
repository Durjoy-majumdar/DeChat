package qj1;

import ak1.C0073g0;
import ak1.C0076j0;
import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cj1.C54795n5;
import cj1.C54804r0;
import cl1.C0656e1;
import cl1.C0690t1;
import cl1.C54991o;
import cl1.C55001u;
import com.google.android.material.appbar.AppBarLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import gg1.C32444a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60172g4;
import ht1.C8777j5;
import ig1.C33318e;
import ik1.C33342f;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Pattern;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj3.C11184p0;
import o40.C61926c;
import ok1.C11471u;
import ok1.C62042e;
import org.json.JSONObject;
import p165hr.C60106t;
import pe1.C35464c;
import qk1.C12797c2;
import qk1.C12855y1;
import qo3.C77407n;
import rx3.C13598b0;
import rx3.C36570n;
import sx3.C64197v;
import te3.C49712hj1;
import te3.C49765hx0;
import te3.C50767p11;
import te3.C51228sd2;
import te3.C51349t61;
import te3.C51498u61;
import te3.C64273c21;
import zt3.C119157j;

/* renamed from: qj1.fa */
public final class C12389fa extends C62660c {

    /* renamed from: A */
    public int f35664A = ((int) (((float) C75044y4.m89990b(MMApplicationContext.getContext()).y) * (((float) C32444a.f86121a.mo58621b()) / 100.0f)));

    /* renamed from: B */
    public Resources f35665B;

    /* renamed from: C */
    public final View f35666C;

    /* renamed from: D */
    public final TextView f35667D;

    /* renamed from: E */
    public final TextView f35668E;

    /* renamed from: F */
    public final TextView f35669F;

    /* renamed from: G */
    public final TextView f35670G;

    /* renamed from: H */
    public final View f35671H;

    /* renamed from: I */
    public final RecyclerView f35672I;

    /* renamed from: J */
    public final LiveBottomSheetPanel f35673J;

    /* renamed from: K */
    public final ProgressBar f35674K;

    /* renamed from: L */
    public final View f35675L;

    /* renamed from: M */
    public final View f35676M;

    /* renamed from: N */
    public final TextView f35677N;

    /* renamed from: P */
    public final TextView f35678P;

    /* renamed from: Q */
    public final View f35679Q;

    /* renamed from: Q0 */
    public int f35680Q0;

    /* renamed from: R */
    public final View f35681R;

    /* renamed from: S */
    public final C12855y1 f35682S;

    /* renamed from: T */
    public final View f35683T;

    /* renamed from: U */
    public final ImageView f35684U;

    /* renamed from: V */
    public final TextView f35685V;

    /* renamed from: W */
    public C49765hx0 f35686W;

    /* renamed from: X */
    public C77407n f35687X;

    /* renamed from: Y */
    public C77407n f35688Y;

    /* renamed from: Z */
    public ArrayList<C51349t61> f35689Z;

    /* renamed from: p */
    public final C58124b f35690p;

    /* renamed from: p0 */
    public C11184p0 f35691p0;

    /* renamed from: q */
    public final String f35692q = "Finder.FinderLiveMemberListPlugin";

    /* renamed from: r */
    public final String f35693r = "PORTRAIT_ACTION_GOTO_PROFILE_MEMBERLIST";

    /* renamed from: s */
    public final String f35694s = "PORTRAIT_ACTION_KEY_FINDER_USERNAME";

    /* renamed from: t */
    public final int f35695t = 1;

    /* renamed from: u */
    public final int f35696u = 10;

    /* renamed from: v */
    public final int f35697v = 11;

    /* renamed from: w */
    public final int f35698w = 12;

    /* renamed from: x */
    public final int f35699x = 13;

    /* renamed from: x0 */
    public AppBarLayout f35700x0;

    /* renamed from: y */
    public final int f35701y = 14;

    /* renamed from: y0 */
    public final int f35702y0;

    /* renamed from: z */
    public int f35703z;

    /* renamed from: qj1.fa$a */
    public final class C12390a implements AppBarLayout.C67445c {
        public C12390a() {
        }

        /* renamed from: a */
        public void mo3128a(AppBarLayout appBarLayout, int i) {
            C87412m.m108594g(appBarLayout, "view");
            float abs = Math.abs(((float) i) * 1.0f);
            C12389fa faVar = C12389fa.this;
            AppBarLayout appBarLayout2 = faVar.f35700x0;
            float totalScrollRange = abs / ((float) (appBarLayout2 != null ? appBarLayout2.getTotalScrollRange() : faVar.f35702y0));
            C12389fa faVar2 = C12389fa.this;
            View view = faVar2.f35683T;
            int i2 = faVar2.f35680Q0;
            faVar2.getClass();
            view.setBackgroundColor(Color.argb((int) (((float) Color.alpha(i2)) * totalScrollRange), Color.red(i2), Color.green(i2), Color.blue(i2)));
            String str = C12389fa.this.f35692q;
            Log.m105924i(str, "onOffsetChanged fraction:" + totalScrollRange);
        }
    }

    /* renamed from: qj1.fa$b */
    public static final class C12391b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C12389fa f35705d;

        /* renamed from: qj1.fa$b$a */
        public static final class C12392a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C12389fa f35706d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C12392a(C12389fa faVar) {
                super(0);
                this.f35706d = faVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
                r3 = r3.f134919d;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object invoke() {
                /*
                    r4 = this;
                    qj1.fa r0 = r4.f35706d
                    java.lang.String r1 = r0.f35692q
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "kickMember:"
                    r2.append(r3)
                    te3.hx0 r3 = r0.f35686W
                    if (r3 == 0) goto L_0x0019
                    com.tencent.mm.protocal.protobuf.FinderContact r3 = r3.f134919d
                    if (r3 == 0) goto L_0x0019
                    java.lang.String r3 = r3.username
                    goto L_0x001a
                L_0x0019:
                    r3 = 0
                L_0x001a:
                    r2.append(r3)
                    java.lang.String r2 = r2.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
                    cj1.n5 r1 = r0.mo14476D0()
                    if (r1 == 0) goto L_0x0040
                    te3.hx0 r2 = r0.f35686W
                    if (r2 == 0) goto L_0x0036
                    com.tencent.mm.protocal.protobuf.FinderContact r2 = r2.f134919d
                    if (r2 == 0) goto L_0x0036
                    java.lang.String r2 = r2.username
                    if (r2 != 0) goto L_0x0038
                L_0x0036:
                    java.lang.String r2 = ""
                L_0x0038:
                    qj1.ta r3 = new qj1.ta
                    r3.<init>(r0)
                    r1.mo75742j0(r2, r3)
                L_0x0040:
                    rx3.b0 r0 = rx3.C13598b0.f38549a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: qj1.C12389fa.C12391b.C12392a.invoke():java.lang.Object");
            }
        }

        public C12391b(C12389fa faVar) {
            this.f35705d = faVar;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            FinderContact finderContact;
            FinderContact finderContact2;
            String str;
            FinderContact finderContact3;
            String str2;
            C54795n5 D0;
            FinderContact finderContact4;
            String str3;
            FinderContact finderContact5;
            String str4;
            C0073g0 g0Var = C0073g0.LIVE_ANCHOR_ACTION_AUDIENCE;
            C0073g0 g0Var2 = C0073g0.LIVE_ANCHOR_ACTION_BARRAGE;
            Class cls = C54108o.class;
            String str5 = null;
            Integer valueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
            int i2 = this.f35705d.f35696u;
            String str6 = "";
            boolean z = true;
            if (valueOf != null && valueOf.intValue() == i2) {
                C12389fa.m11955Z0(this.f35705d, false);
                C77407n nVar = this.f35705d.f35687X;
                if (nVar != null) {
                    nVar.mo107572p();
                }
                if (this.f35705d.f35690p.getLiveRole() == 1) {
                    ((C54108o) C86312j.m106911c(cls)).getClass();
                    C54067f0 f0Var = C54108o.f151869h;
                    f0Var.f151443Y.f151842s++;
                    JSONObject jSONObject = new JSONObject();
                    String valueOf2 = String.valueOf(2);
                    C49765hx0 hx02 = this.f35705d.f35686W;
                    if (!(hx02 == null || (finderContact5 = hx02.f134919d) == null || (str4 = finderContact5.username) == null)) {
                        str6 = str4;
                    }
                    jSONObject.put(valueOf2, str6);
                    ((C54108o) C86312j.m106911c(cls)).getClass();
                    C0073g0 g0Var3 = f0Var.f151448b0 ? g0Var : g0Var2;
                    C7335d c = C86312j.m106911c(cls);
                    C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                    C8777j5.C8778a.m8605f((C8777j5) c, g0Var3, jSONObject.toString(), (String) null, 4, (Object) null);
                    return;
                }
                return;
            }
            int i3 = this.f35705d.f35697v;
            if (valueOf != null && valueOf.intValue() == i3) {
                C12389fa.m11955Z0(this.f35705d, true);
                C77407n nVar2 = this.f35705d.f35687X;
                if (nVar2 != null) {
                    nVar2.mo107572p();
                }
                if (this.f35705d.f35690p.getLiveRole() == 1) {
                    ((C54108o) C86312j.m106911c(cls)).getClass();
                    C54067f0 f0Var2 = C54108o.f151869h;
                    f0Var2.f151443Y.f151843t++;
                    JSONObject jSONObject2 = new JSONObject();
                    String valueOf3 = String.valueOf(3);
                    C49765hx0 hx03 = this.f35705d.f35686W;
                    if (!(hx03 == null || (finderContact4 = hx03.f134919d) == null || (str3 = finderContact4.username) == null)) {
                        str6 = str3;
                    }
                    jSONObject2.put(valueOf3, str6);
                    ((C54108o) C86312j.m106911c(cls)).getClass();
                    C0073g0 g0Var4 = f0Var2.f151448b0 ? g0Var : g0Var2;
                    C7335d c2 = C86312j.m106911c(cls);
                    C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
                    C8777j5.C8778a.m8605f((C8777j5) c2, g0Var4, jSONObject2.toString(), (String) null, 4, (Object) null);
                    return;
                }
                return;
            }
            int i4 = this.f35705d.f35698w;
            if (valueOf != null && valueOf.intValue() == i4) {
                C12389fa faVar = this.f35705d;
                C12392a aVar = new C12392a(faVar);
                if (faVar.f35688Y == null) {
                    C77407n nVar3 = new C77407n(faVar.mo14484z0().getContext(), 1, true);
                    faVar.f35688Y = nVar3;
                    nVar3.f225775k1 = true;
                    View inflate = View.inflate(faVar.f166287d.getContext(), C0966R.C0971layout.b6k, (ViewGroup) null);
                    ((TextView) inflate.findViewById(C0966R.C0970id.fs_)).setText(faVar.f166287d.getContext().getString(C0966R.string.f360672e41));
                    C77407n nVar4 = faVar.f35688Y;
                    if (nVar4 != null) {
                        nVar4.mo107569n(inflate, false);
                    }
                    C77407n nVar5 = faVar.f35688Y;
                    if (nVar5 != null) {
                        nVar5.f225761d = C12425ga.f35789a;
                    }
                }
                C77407n nVar6 = faVar.f35688Y;
                if (nVar6 != null) {
                    nVar6.mo107570o(true);
                }
                C77407n nVar7 = faVar.f35688Y;
                if (nVar7 != null) {
                    nVar7.mo107567l((View) null);
                }
                C77407n nVar8 = faVar.f35688Y;
                if (nVar8 != null) {
                    nVar8.f225771i = new C12440ha(C0966R.color.f356948a24, faVar, C0966R.string.f360671e40);
                }
                if (nVar8 != null) {
                    nVar8.f225782p = new C12450ia(faVar, aVar);
                }
                if (nVar8 != null) {
                    nVar8.f225761d = new C12474ja(faVar);
                }
                C77407n nVar9 = this.f35705d.f35688Y;
                if (nVar9 != null) {
                    nVar9.mo107573q();
                }
                C77407n nVar10 = this.f35705d.f35687X;
                if (nVar10 != null) {
                    nVar10.mo107572p();
                    return;
                }
                return;
            }
            int i5 = this.f35705d.f35699x;
            if (valueOf != null && valueOf.intValue() == i5) {
                C12389fa faVar2 = this.f35705d;
                C49765hx0 hx04 = faVar2.f35686W;
                if (!(hx04 == null || (finderContact3 = hx04.f134919d) == null || (str2 = finderContact3.username) == null || (D0 = faVar2.mo14476D0()) == null)) {
                    Context context = faVar2.mo14484z0().getContext();
                    C87412m.m108593f(context, "basePluginLayout.context");
                    D0.mo75698B(context, ((C55001u) ((C54991o) faVar2.mo87696x0(C54991o.class)).business(C55001u.class)).f154420q.f182392d, str2, 0L, 62);
                }
                C77407n nVar11 = this.f35705d.f35687X;
                if (nVar11 != null) {
                    nVar11.mo107572p();
                }
                if (this.f35705d.f35690p.getLiveRole() == 1) {
                    ((C54108o) C86312j.m106911c(cls)).getClass();
                    C54067f0 f0Var3 = C54108o.f151869h;
                    f0Var3.f151443Y.f151839p++;
                    JSONObject jSONObject3 = new JSONObject();
                    String valueOf4 = String.valueOf(4);
                    C49765hx0 hx05 = this.f35705d.f35686W;
                    if (!(hx05 == null || (finderContact2 = hx05.f134919d) == null || (str = finderContact2.username) == null)) {
                        str6 = str;
                    }
                    jSONObject3.put(valueOf4, str6);
                    ((C54108o) C86312j.m106911c(cls)).getClass();
                    C0073g0 g0Var5 = f0Var3.f151448b0 ? g0Var : g0Var2;
                    C7335d c3 = C86312j.m106911c(cls);
                    C87412m.m108593f(c3, "getService(HellLiveReport::class.java)");
                    C8777j5.C8778a.m8605f((C8777j5) c3, g0Var5, jSONObject3.toString(), (String) null, 4, (Object) null);
                    return;
                }
                return;
            }
            int i6 = this.f35705d.f35701y;
            if (valueOf != null && valueOf.intValue() == i6) {
                C12389fa faVar3 = this.f35705d;
                C49765hx0 hx06 = faVar3.f35686W;
                if (!(hx06 == null || (finderContact = hx06.f134919d) == null)) {
                    str5 = finderContact.username;
                }
                if (str5 != null) {
                    faVar3.getClass();
                    if (str5.length() != 0) {
                        z = false;
                    }
                }
                if (z) {
                    Log.m105924i(faVar3.f35692q, "goToFinderProfile finderUsername:" + str5);
                    return;
                }
                if (faVar3.f35690p.getLiveRole() == 0) {
                    ((C54116w) C86312j.m106911c(C54116w.class)).nv0(C0076j0.CLICK_PROFILE_HOT_LIST, str6, 0);
                }
                boolean g0 = faVar3.mo82893g0();
                Log.m105924i(faVar3.f35692q, "goToFinderProfile isLandscape:" + g0);
                if (g0) {
                    Bundle bundle = new Bundle();
                    bundle.putString(faVar3.f35694s, str5);
                    C62660c.m73644Y0(faVar3, faVar3.f35693r, bundle, 0, 4, (Object) null);
                    return;
                }
                C54804r0 r0Var = C54804r0.f153631a;
                Context context2 = faVar3.mo14484z0().getContext();
                C45795b A0 = faVar3.mo87684A0();
                C39818r rVar = C39818r.f106831a;
                Context context3 = faVar3.mo14484z0().getContext();
                C87412m.m108593f(context3, "basePluginLayout.context");
                r0Var.mo75765g(context2, A0, false, str5, ((C60172g4) rVar.mo62443b(context3).mo62447c(C60172g4.class)).mo12861q3());
                return;
            }
            C77407n nVar12 = this.f35705d.f35687X;
            if (nVar12 != null) {
                nVar12.mo107572p();
            }
        }
    }

    /* renamed from: qj1.fa$c */
    public static final class C12393c extends C87413o implements C32226l<C51349t61, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C51349t61 f35707d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12393c(C51349t61 t612) {
            super(1);
            this.f35707d = t612;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
            r3 = r3.f134919d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r3) {
            /*
                r2 = this;
                te3.t61 r3 = (te3.C51349t61) r3
                java.lang.String r0 = "local"
                gy3.C87412m.m108594g(r3, r0)
                te3.hx0 r3 = r3.f141981d
                r0 = 0
                if (r3 == 0) goto L_0x0013
                com.tencent.mm.protocal.protobuf.FinderContact r3 = r3.f134919d
                if (r3 == 0) goto L_0x0013
                java.lang.String r3 = r3.username
                goto L_0x0014
            L_0x0013:
                r3 = r0
            L_0x0014:
                te3.t61 r1 = r2.f35707d
                te3.hx0 r1 = r1.f141981d
                if (r1 == 0) goto L_0x0020
                com.tencent.mm.protocal.protobuf.FinderContact r1 = r1.f134919d
                if (r1 == 0) goto L_0x0020
                java.lang.String r0 = r1.username
            L_0x0020:
                boolean r3 = gy3.C87412m.m108589b(r3, r0)
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: qj1.C12389fa.C12393c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: qj1.fa$d */
    public static final class C12394d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C12389fa f35708d;

        public C12394d(C12389fa faVar) {
            this.f35708d = faVar;
        }

        public final void run() {
            Class cls = C54991o.class;
            C33342f fVar = (C33342f) ((C36570n) ((C60106t) C86312j.m106911c(C60106t.class)).f171517q).getValue();
            String valueOf = String.valueOf(((C55001u) ((C54991o) this.f35708d.mo87696x0(cls)).business(C55001u.class)).f154420q.f182392d);
            LinkedList<C51349t61> linkedList = ((C54991o) this.f35708d.mo87696x0(cls)).f154348o3;
            fVar.getClass();
            C87412m.m108594g(valueOf, "liveId");
            C87412m.m108594g(linkedList, "infoList");
            C33318e eVar = new C33318e();
            eVar.field_liveId = valueOf;
            C51498u61 u612 = new C51498u61();
            u612.f142616d = linkedList;
            eVar.field_lastRewardInfo = u612.toByteArray();
            fVar.replace(eVar);
        }
    }

    /* renamed from: qj1.fa$e */
    public static final class C12395e implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public final /* synthetic */ C12389fa f35709d;

        public C12395e(C12389fa faVar) {
            this.f35709d = faVar;
        }

        public void onGlobalLayout() {
            this.f35709d.f35672I.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f35709d.f35672I.scrollBy(0, 1);
        }
    }

    /* renamed from: qj1.fa$f */
    public static final class C12396f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C12389fa f35710d;

        /* renamed from: e */
        public final /* synthetic */ Bundle f35711e;

        /* renamed from: f */
        public final /* synthetic */ Object f35712f;

        /* renamed from: g */
        public final /* synthetic */ long f35713g;

        public C12396f(C12389fa faVar, Bundle bundle, Object obj, long j) {
            this.f35710d = faVar;
            this.f35711e = bundle;
            this.f35712f = obj;
            this.f35713g = j;
        }

        public final void run() {
            if (!this.f35710d.mo87688G0()) {
                C54795n5 D0 = this.f35710d.mo14476D0();
                if (D0 != null) {
                    D0.mo75705I(this.f35711e, this.f35712f, this.f35710d.f35694s);
                    return;
                }
                return;
            }
            String str = this.f35710d.f35692q;
            Log.m105924i(str, "goToFinderProfileImpl delayMs:" + this.f35713g + ",isFinished!");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12389fa(ViewGroup viewGroup, C11471u.C11473b bVar, C58124b bVar2) {
        super(viewGroup, bVar2, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "uiMode");
        C87412m.m108594g(bVar2, "statusMonitor");
        this.f35690p = bVar2;
        Resources resources = viewGroup.getContext().getResources();
        C87412m.m108593f(resources, "root.context.resources");
        this.f35665B = resources;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.drl);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.f…bers_list_icon_btn_group)");
        this.f35666C = findViewById;
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.drs);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.f…ve_members_list_title_tv)");
        TextView textView = (TextView) findViewById2;
        this.f35667D = textView;
        View findViewById3 = viewGroup.findViewById(C0966R.C0970id.drn);
        C87412m.m108593f(findViewById3, "root.findViewById(R.id.f…e_members_list_retry_tip)");
        this.f35668E = (TextView) findViewById3;
        View findViewById4 = viewGroup.findViewById(C0966R.C0970id.drh);
        C87412m.m108593f(findViewById4, "root.findViewById(R.id.f…e_members_list_empty_tip)");
        this.f35669F = (TextView) findViewById4;
        View findViewById5 = viewGroup.findViewById(C0966R.C0970id.drg);
        C87412m.m108593f(findViewById5, "root.findViewById(R.id.f…rs_list_empty_action_tip)");
        this.f35670G = (TextView) findViewById5;
        View findViewById6 = viewGroup.findViewById(C0966R.C0970id.dri);
        C87412m.m108593f(findViewById6, "root.findViewById(R.id.f…ers_list_empty_tip_group)");
        this.f35671H = findViewById6;
        View findViewById7 = viewGroup.findViewById(C0966R.C0970id.drf);
        C87412m.m108593f(findViewById7, "root.findViewById(R.id.f…embers_list_content_view)");
        RecyclerView recyclerView = (RecyclerView) findViewById7;
        this.f35672I = recyclerView;
        View findViewById8 = viewGroup.findViewById(C0966R.C0970id.drd);
        C87412m.m108593f(findViewById8, "root.findViewById(R.id.f…embers_list_content_area)");
        LiveBottomSheetPanel liveBottomSheetPanel = (LiveBottomSheetPanel) findViewById8;
        this.f35673J = liveBottomSheetPanel;
        View findViewById9 = viewGroup.findViewById(C0966R.C0970id.dre);
        C87412m.m108593f(findViewById9, "root.findViewById(R.id.f…mbers_list_content_group)");
        RelativeLayout relativeLayout = (RelativeLayout) findViewById9;
        View findViewById10 = viewGroup.findViewById(C0966R.C0970id.drm);
        C87412m.m108593f(findViewById10, "root.findViewById(R.id.f…ive_members_list_loading)");
        this.f35674K = (ProgressBar) findViewById10;
        View findViewById11 = viewGroup.findViewById(C0966R.C0970id.drc);
        C87412m.m108593f(findViewById11, "root.findViewById(R.id.f…_members_list_blank_area)");
        this.f35675L = findViewById11;
        View findViewById12 = viewGroup.findViewById(C0966R.C0970id.drj);
        C87412m.m108593f(findViewById12, "root.findViewById(R.id.f…e_members_list_help_icon)");
        this.f35676M = findViewById12;
        View findViewById13 = viewGroup.findViewById(C0966R.C0970id.drr);
        C87412m.m108593f(findViewById13, "root.findViewById(R.id.f…embers_list_title_tip_tv)");
        this.f35677N = (TextView) findViewById13;
        View findViewById14 = viewGroup.findViewById(C0966R.C0970id.drt);
        C87412m.m108593f(findViewById14, "root.findViewById(R.id.f…s_list_visibility_tip_tv)");
        this.f35678P = (TextView) findViewById14;
        View findViewById15 = viewGroup.findViewById(C0966R.C0970id.dra);
        C87412m.m108593f(findViewById15, "root.findViewById(R.id.f…e_member_stick_container)");
        this.f35679Q = findViewById15;
        View findViewById16 = viewGroup.findViewById(C0966R.C0970id.dro);
        C87412m.m108593f(findViewById16, "root.findViewById(R.id.f…mbers_list_subtitle_line)");
        this.f35681R = findViewById16;
        C12855y1 y1Var = new C12855y1(bVar, this.f35665B, recyclerView, findViewById15, (C54991o) mo87696x0(C54991o.class));
        this.f35682S = y1Var;
        View findViewById17 = viewGroup.findViewById(C0966R.C0970id.drq);
        C87412m.m108593f(findViewById17, "root.findViewById<View?>…members_list_title_group)");
        this.f35683T = findViewById17;
        View findViewById18 = viewGroup.findViewById(C0966R.C0970id.f358181n93);
        C87412m.m108593f(findViewById18, "root.findViewById(R.id.f…ve_members_list_ad_bg_iv)");
        this.f35684U = (ImageView) findViewById18;
        View findViewById19 = viewGroup.findViewById(C0966R.C0970id.n8o);
        C87412m.m108593f(findViewById19, "root.findViewById(R.id.finder_live_bg_ad_tag)");
        this.f35685V = (TextView) findViewById19;
        this.f35689Z = new ArrayList<>();
        this.f35691p0 = new C12391b(this);
        this.f35700x0 = (AppBarLayout) viewGroup.findViewById(C0966R.C0970id.f358180n92);
        this.f35702y0 = C76577a.m92151b(viewGroup.getContext(), 64);
        this.f35665B.getColor(C0966R.color.ahf);
        this.f35680Q0 = this.f35665B.getColor(C0966R.color.f2932f);
        ViewGroup.LayoutParams layoutParams = findViewById17.getLayoutParams();
        int i = layoutParams != null ? layoutParams.height : 0;
        this.f35703z = i;
        if (i <= 0) {
            this.f35703z = this.f35665B.getDimensionPixelOffset(C0966R.dimen.f3761db);
        }
        Log.m105924i("Finder.FinderLiveMemberListPlugin", "initTitleGroupHeight:" + this.f35703z);
        recyclerView.setLayoutManager(new LinearLayoutManager(viewGroup.getContext()));
        recyclerView.setAdapter(y1Var);
        float b = ((float) C76577a.m92151b(viewGroup.getContext(), 12)) * 1.0f;
        LiveBottomSheetPanel.C7039a aVar = liveBottomSheetPanel.f165503j;
        aVar.f24812a = b;
        aVar.f24813b = b;
        aVar.f24814c = 0.0f;
        aVar.f24815d = 0.0f;
        liveBottomSheetPanel.mo82284c();
        liveBottomSheetPanel.postInvalidate();
        int i2 = this.f35703z;
        int c = C75044y4.m89991c(this.f166287d.getContext());
        if (!mo82893g0()) {
            liveBottomSheetPanel.setTranslationY((float) C75044y4.m89990b(this.f166287d.getContext()).y);
            liveBottomSheetPanel.getLayoutParams().height = this.f35664A;
            ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
            C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin += c;
            relativeLayout.getLayoutParams().height = (this.f35664A - i2) - c;
            recyclerView.getLayoutParams().height = (this.f35664A - i2) - c;
        } else {
            liveBottomSheetPanel.getLayoutParams().width = C75044y4.m89990b(this.f166287d.getContext()).y;
            liveBottomSheetPanel.setTranslationX((float) C75044y4.m89990b(this.f166287d.getContext()).x);
            relativeLayout.getLayoutParams().height = C75044y4.m89990b(this.f166287d.getContext()).y - i2;
            recyclerView.getLayoutParams().height = C75044y4.m89990b(this.f166287d.getContext()).y - i2;
        }
        C85875k4.m106189j0(textView.getPaint(), 0.8f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r2 = r2.f134919d;
     */
    /* renamed from: Z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m11955Z0(qj1.C12389fa r4, boolean r5) {
        /*
            java.lang.String r0 = r4.f35692q
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "kickMember:"
            r1.append(r2)
            te3.hx0 r2 = r4.f35686W
            r3 = 0
            if (r2 == 0) goto L_0x0018
            com.tencent.mm.protocal.protobuf.FinderContact r2 = r2.f134919d
            if (r2 == 0) goto L_0x0018
            java.lang.String r2 = r2.username
            goto L_0x0019
        L_0x0018:
            r2 = r3
        L_0x0019:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            cj1.n5 r0 = r4.mo14476D0()
            if (r0 == 0) goto L_0x003c
            te3.hx0 r1 = r4.f35686W
            if (r1 == 0) goto L_0x0033
            com.tencent.mm.protocal.protobuf.FinderContact r1 = r1.f134919d
            if (r1 == 0) goto L_0x0033
            java.lang.String r3 = r1.username
        L_0x0033:
            r1 = 2
            qj1.ma r2 = new qj1.ma
            r2.<init>(r4)
            r0.mo75725b(r3, r5, r1, r2)
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C12389fa.m11955Z0(qj1.fa, boolean):void");
    }

    /* renamed from: a1 */
    public final boolean mo12069a1() {
        return C62042e.f176370a.mo87027N0() || ((C54991o) mo87696x0(C54991o.class)).f154190D;
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: b0 */
    public void mo11966b0(int i, int i2, Bundle bundle) {
        Bundle bundle2 = bundle;
        if (!C61926c.m72696u(i2, 16)) {
            mo10792g(8);
        } else if (mo14483f0() != 0) {
            mo10792g(0);
            if (bundle2 != null ? bundle2.getBoolean("PARAM_FINDER_LIVE_MEMBER_SKIP_LOADING") : false) {
                this.f35673J.post(new C12706va(this));
                this.f35682S.mo12376F4();
                return;
            }
            this.f35674K.setVisibility(0);
            this.f35668E.setVisibility(8);
            View view = this.f35671H;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin", "showMembersListLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin", "showMembersListLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = this.f35683T;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin", "showMembersListLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin", "showMembersListLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f35672I.setVisibility(8);
            this.f35682S.mo12376F4();
            this.f35673J.post(new C12728wa(this));
            int i3 = mo12069a1() ? 1 : 2;
            C54795n5 D0 = mo14476D0();
            if (D0 != null) {
                D0.mo75756x(i3, new C12760ya(this));
            }
        }
    }

    /* renamed from: b1 */
    public final void mo12070b1(boolean z) {
        boolean z2;
        Long l;
        int i;
        int i2;
        FinderContact finderContact;
        C51349t61 t612;
        Iterator<T> it;
        Iterator<T> it4;
        C51349t61 t613;
        T t;
        String str;
        String str2;
        String str3;
        FinderContact finderContact2;
        FinderContact finderContact3;
        Class cls = C0690t1.class;
        Class cls2 = C0656e1.class;
        Class cls3 = C54991o.class;
        ArrayList<C49765hx0> arrayList = ((C0656e1) mo87696x0(cls2)).f1549f;
        ArrayList<C49765hx0> arrayList2 = ((C0656e1) mo87696x0(cls2)).f1551h;
        int i3 = ((C0656e1) mo87696x0(cls2)).f1552i;
        C0656e1 e1Var = (C0656e1) mo87696x0(cls2);
        boolean z3 = arrayList == null || arrayList.isEmpty();
        LinkedList<C51349t61> linkedList = ((C54991o) mo87696x0(cls3)).f154353p3;
        String str4 = ((C0656e1) mo87696x0(cls2)).f1553j;
        if (TextUtils.isEmpty(str4)) {
            this.f35685V.setVisibility(8);
        } else if (!C62042e.f176370a.mo87027N0()) {
            Log.m105924i(this.f35692q, "loadAdBg url:" + str4);
            int width = this.f35673J.getWidth();
            ViewGroup.LayoutParams layoutParams = this.f35684U.getLayoutParams();
            layoutParams.width = width;
            layoutParams.height = (int) (((float) width) * 0.5625f);
            this.f35684U.requestLayout();
            this.f35684U.post(new C12699ua(this, str4));
        }
        if (!z3 || !z) {
            if (z3) {
                View view = this.f35671H;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin", "onGetLiveOnlineMemberSuccess", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin", "onGetLiveOnlineMemberSuccess", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f35674K.setVisibility(8);
                View view3 = this.f35683T;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin", "onGetLiveOnlineMemberSuccess", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin", "onGetLiveOnlineMemberSuccess", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f35672I.setVisibility(8);
                this.f35668E.setVisibility(8);
                if (!mo12069a1() || (((C0690t1) ((C54991o) mo87696x0(cls3)).business(cls)).f1629i != 0 && !((C0690t1) ((C54991o) mo87696x0(cls3)).business(cls)).mo653f3())) {
                    this.f35670G.setVisibility(8);
                    TextView textView = this.f35669F;
                    textView.setText(textView.getContext().getText(C0966R.string.dve));
                }
                mo12071c1(((C54991o) ((C54991o) mo87696x0(cls3)).business(cls3)).f154242Q0);
            } else {
                View view5 = this.f35671H;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin", "onGetLiveOnlineMemberSuccess", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin", "onGetLiveOnlineMemberSuccess", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f35674K.setVisibility(8);
                View view7 = this.f35683T;
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(0);
                View view8 = view7;
                C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin", "onGetLiveOnlineMemberSuccess", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin", "onGetLiveOnlineMemberSuccess", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f35672I.setVisibility(0);
                this.f35668E.setVisibility(8);
                mo12071c1(((C54991o) ((C54991o) mo87696x0(cls3)).business(cls3)).f154242Q0);
                boolean z4 = mo12069a1() ? ((C54991o) ((C54991o) mo87696x0(cls3)).business(cls3)).f154243Q1 : ((C54991o) ((C54991o) mo87696x0(cls3)).business(cls3)).f154248R1;
                this.f35682S.f36783E = ((C54991o) ((C54991o) mo87696x0(cls3)).business(cls3)).f154192D2;
                this.f35682S.f36784F = ((C54991o) ((C54991o) mo87696x0(cls3)).business(cls3)).f154196E2;
                ArrayList<C51349t61> arrayList3 = new ArrayList<>();
                for (C51349t61 byteArray : linkedList) {
                    C51349t61 t614 = new C51349t61();
                    t614.parseFrom(byteArray.toByteArray());
                    arrayList3.add(t614);
                }
                if (!((C54991o) mo87696x0(cls3)).f154348o3.isEmpty()) {
                    Iterator<T> it5 = ((C54991o) mo87696x0(cls3)).f154348o3.iterator();
                    while (it5.hasNext()) {
                        C51349t61 t615 = (C51349t61) it5.next();
                        Iterator<C51349t61> it6 = arrayList3.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                t612 = null;
                                break;
                            }
                            t612 = it6.next();
                            C49765hx0 hx02 = t612.f141981d;
                            if (hx02 == null || (finderContact3 = hx02.f134919d) == null || (str2 = finderContact3.username) == null) {
                                str2 = "";
                            }
                            C49765hx0 hx03 = t615.f141981d;
                            if (hx03 == null || (finderContact2 = hx03.f134919d) == null || (str3 = finderContact2.username) == null) {
                                str3 = "";
                            }
                            if (C87412m.m108589b(str2, str3)) {
                                break;
                            }
                        }
                        C51349t61 t616 = t612;
                        if (t616 != null) {
                            LinkedList<C51228sd2> linkedList2 = t616.f141982e;
                            C87412m.m108593f(linkedList2, "it.items");
                            Iterator<T> it7 = linkedList2.iterator();
                            while (it7.hasNext()) {
                                C51228sd2 sd22 = (C51228sd2) it7.next();
                                Iterator<T> it8 = it5;
                                LinkedList<C51228sd2> linkedList3 = t615.f141982e;
                                if (linkedList3 != null) {
                                    Iterator<T> it9 = linkedList3.iterator();
                                    while (true) {
                                        if (!it9.hasNext()) {
                                            t613 = t615;
                                            it4 = it7;
                                            t = null;
                                            break;
                                        }
                                        t = it9.next();
                                        Iterator<T> it10 = it9;
                                        C51228sd2 sd23 = (C51228sd2) t;
                                        t613 = t615;
                                        C50767p11 p112 = sd23.f141447d;
                                        if (p112 != null) {
                                            str = p112.f139507d;
                                            it4 = it7;
                                        } else {
                                            it4 = it7;
                                            str = null;
                                        }
                                        C50767p11 p113 = sd22.f141447d;
                                        if (C87412m.m108589b(str, p113 != null ? p113.f139507d : null) && sd22.f141448e >= sd23.f141448e) {
                                            break;
                                        }
                                        it9 = it10;
                                        t615 = t613;
                                        it7 = it4;
                                    }
                                    C51228sd2 sd24 = (C51228sd2) t;
                                    if (sd24 != null) {
                                        sd22.f141448e -= sd24.f141448e;
                                    }
                                } else {
                                    t613 = t615;
                                    it4 = it7;
                                }
                                it5 = it8;
                                t615 = t613;
                                it7 = it4;
                            }
                            it = it5;
                            LinkedList<C51228sd2> linkedList4 = t616.f141982e;
                            C87412m.m108593f(linkedList4, "it.items");
                            C61926c.m72675T(linkedList4, C12486ka.f35915d);
                        } else {
                            it = it5;
                        }
                        it5 = it;
                    }
                    C61926c.m72673R(arrayList3, C12501la.f35953d);
                }
                if (arrayList3.size() > 0) {
                    int intValue = C32444a.f86175n1.mo60266n().intValue();
                    if (intValue == 1) {
                        int i4 = 0;
                        int i5 = 0;
                        while (i5 < 2) {
                            arrayList3.add(arrayList3.get(i4));
                            i5++;
                            i4 = 0;
                        }
                    } else if (intValue == 2) {
                        for (int i6 = 0; i6 < 13; i6++) {
                            arrayList3.add(arrayList3.get(0));
                        }
                    } else if (intValue == 3) {
                        for (int i7 = 0; i7 < 39; i7++) {
                            arrayList3.add(arrayList3.get(0));
                        }
                    }
                }
                this.f35689Z = arrayList3;
                if (mo12069a1() && this.f35689Z.isEmpty()) {
                    this.f35677N.setVisibility(0);
                    this.f35677N.setText(this.f35665B.getString(C0966R.string.e5y));
                }
                if (this.f35677N.getVisibility() == 0 && this.f35678P.getVisibility() == 0) {
                    View view9 = this.f35681R;
                    C9556a aVar5 = new C9556a();
                    aVar5.mo10233c(0);
                    View view10 = view9;
                    C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin", "onGetLiveOnlineMemberSuccess", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                    C117292a.m165359e(view10, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin", "onGetLiveOnlineMemberSuccess", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    View view11 = this.f35681R;
                    C9556a aVar6 = new C9556a();
                    aVar6.mo10233c(8);
                    View view12 = view11;
                    C117292a.m165358d(view12, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin", "onGetLiveOnlineMemberSuccess", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view11.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                    C117292a.m165359e(view12, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin", "onGetLiveOnlineMemberSuccess", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                for (C51349t61 t617 : ((C54991o) mo87696x0(cls3)).f154353p3) {
                    C61926c.m72675T(((C54991o) mo87696x0(cls3)).f154348o3, new C12393c(t617));
                    ((C54991o) mo87696x0(cls3)).f154348o3.add(t617);
                }
                ((C119157j) C119157j.f356862d).mo183884o(new C12394d(this));
                C12855y1 y1Var = this.f35682S;
                ArrayList<C51349t61> arrayList4 = this.f35689Z;
                C49765hx0 hx04 = ((C0656e1) mo87696x0(cls2)).f1550g;
                y1Var.getClass();
                C87412m.m108594g(arrayList4, "rewardOnlineMember");
                C87412m.m108594g(arrayList, "onlineMembers");
                C87412m.m108594g(arrayList2, "offlineMembers");
                y1Var.f36806v = arrayList.size();
                y1Var.f36807w = i3;
                y1Var.f36805u = z4;
                y1Var.f36808x.clear();
                y1Var.f36810z = Integer.MAX_VALUE;
                y1Var.mo12376F4();
                y1Var.f36786H = arrayList4;
                y1Var.f36808x.removeAll(y1Var.f36785G);
                y1Var.f36785G.clear();
                if (!arrayList4.isEmpty()) {
                    y1Var.f36785G.add(new C12855y1.C12858c((C49765hx0) null, y1Var.f36803s, 0, 0, false, (LinkedList) null, 48, (C8480h) null));
                    int size = arrayList4.size();
                    if (size > 3) {
                        size = 3;
                    }
                    int i8 = 0;
                    while (i8 < size) {
                        C51349t61 t618 = arrayList4.get(i8);
                        C87412m.m108593f(t618, "rewardOnlineMember[i]");
                        C51349t61 t619 = t618;
                        y1Var.f36785G.add(new C12855y1.C12858c(t619.f141981d, y1Var.f36802r, 0, 0, false, t619.f141982e, 16, (C8480h) null));
                        i8++;
                        size = size;
                    }
                    if (arrayList4.size() > 3) {
                        y1Var.f36785G.add(new C12855y1.C12858c((C49765hx0) null, y1Var.f36804t, 0, 0, false, (LinkedList) null, 48, (C8480h) null));
                    }
                }
                y1Var.f36808x.addAll(y1Var.f36785G);
                if (!arrayList.isEmpty()) {
                    y1Var.f36808x.add(new C12855y1.C12858c((C49765hx0) null, y1Var.f36799o, y1Var.f36806v, 0, false, (LinkedList) null, 48, (C8480h) null));
                    ArrayList arrayList5 = new ArrayList();
                    Iterator<C49765hx0> it11 = arrayList.iterator();
                    boolean z5 = false;
                    int i9 = 0;
                    while (it11.hasNext()) {
                        C49765hx0 next = it11.next();
                        int i15 = i9 + 1;
                        if (i9 >= 0) {
                            C49765hx0 hx05 = next;
                            C12855y1.C12858c cVar = new C12855y1.C12858c(hx05, 0, 0, 0, false, (LinkedList) null, 48, (C8480h) null);
                            Iterator<C49765hx0> it12 = it11;
                            C62042e eVar = C62042e.f176370a;
                            boolean z6 = z5;
                            FinderContact finderContact4 = hx05.f134919d;
                            if (!C62042e.m72805Z0(eVar, finderContact4 != null ? finderContact4.username : null, (hx04 == null || (finderContact = hx04.f134919d) == null) ? null : finderContact.username, false, 4, (Object) null)) {
                                FinderContact finderContact5 = hx05.f134919d;
                                if (!eVar.mo87084h1(finderContact5 != null ? finderContact5.username : null)) {
                                    arrayList5.add(cVar);
                                    i9 = i15;
                                    it11 = it12;
                                    z5 = z6;
                                }
                            }
                            y1Var.f36810z = i9 + y1Var.f36797j;
                            cVar.f36816e = true;
                            z6 = true;
                            arrayList5.add(cVar);
                            i9 = i15;
                            it11 = it12;
                            z5 = z6;
                        } else {
                            C64197v.m75542k();
                            throw null;
                        }
                    }
                    boolean z7 = z5;
                    l = null;
                    y1Var.f36808x.addAll(arrayList5);
                    if (z4 && !y1Var.mo12377G4() && (i2 = y1Var.f36810z) >= 0 && i2 < y1Var.f36808x.size()) {
                        int i16 = y1Var.f36810z;
                        C12855y1.C12858c cVar2 = y1Var.f36808x.get(i16);
                        C87412m.m108593f(cVar2, "dataList[selfItemPosition]");
                        C12855y1.C12858c cVar3 = cVar2;
                        y1Var.f36779A = new C12855y1.C12861f(y1Var, y1Var.f36780B);
                        y1Var.f36780B.setTag(Boolean.TRUE);
                        C12855y1.C12861f fVar = y1Var.f36779A;
                        if (fVar != null) {
                            y1Var.mo12378O4(fVar, i16, cVar3.f36812a, cVar3.f36816e);
                            y1Var.mo12379g5(fVar, i16, cVar3.f36812a, cVar3.f36816e);
                            y1Var.mo12380u5(fVar, i16, cVar3, Boolean.FALSE);
                        }
                        y1Var.f36780B.setOnClickListener(new C12797c2(y1Var, cVar3));
                    }
                    z2 = z7;
                } else {
                    l = null;
                    z2 = false;
                }
                if (y1Var.mo12377G4()) {
                    int i17 = y1Var.f36806v;
                    if (i3 > i17) {
                        y1Var.f36808x.add(new C12855y1.C12858c((C49765hx0) null, y1Var.f36801q, i17, 0, false, (LinkedList) null, 48, (C8480h) null));
                    }
                } else if (y1Var.f36783E == 0 && y1Var.f36808x.size() >= (i = y1Var.f36784F)) {
                    y1Var.f36808x.add(new C12855y1.C12858c((C49765hx0) null, y1Var.f36801q, i, 0, false, (LinkedList) null, 48, (C8480h) null));
                }
                String str5 = y1Var.f36795h;
                StringBuilder sb = new StringBuilder();
                sb.append("updateMemberList enableGift:");
                sb.append(z4);
                sb.append(",onlineList size:");
                sb.append(y1Var.f36806v);
                sb.append(",continueFlag：");
                sb.append(y1Var.f36783E);
                sb.append(",maxMemberCount:");
                sb.append(y1Var.f36784F);
                sb.append(",selfContact is empty:");
                sb.append(hx04 == null);
                sb.append(",self amount heat:");
                sb.append(hx04 != null ? Integer.valueOf(hx04.f134922g) : l);
                sb.append(", live_heat_value:");
                sb.append(hx04 != null ? Long.valueOf(hx04.f134934v) : l);
                sb.append(", haveSelfItem:");
                sb.append(z2);
                sb.append(",selfItemPosition:");
                sb.append(y1Var.f36810z);
                Log.m105924i(str5, sb.toString());
                C12855y1 y1Var2 = this.f35682S;
                C0690t1 t1Var = (C0690t1) ((C54991o) mo87696x0(cls3)).business(cls);
                y1Var2.getClass();
                this.f35682S.notifyDataSetChanged();
                this.f35672I.getViewTreeObserver().addOnGlobalLayoutListener(new C12395e(this));
            }
            Log.m105924i(this.f35692q, "onGetLiveOnlineByRoomSuccess onlineCnt:" + arrayList.size() + " offlineCnt:" + arrayList2.size() + ",amount count:" + C62042e.f176370a.mo87096m0(((C55001u) mo87696x0(C55001u.class)).f154420q));
            return;
        }
        Log.m105924i(this.f35692q, "onGetLiveOnlineMemberSuccess autoRefresh but onlineMembers Is Empty!");
    }

    /* renamed from: c1 */
    public final void mo12071c1(int i) {
        Class cls = C0690t1.class;
        Class cls2 = C55001u.class;
        Class cls3 = C54991o.class;
        if ((!mo12069a1() || !((C54991o) ((C54991o) mo87696x0(cls3)).business(cls3)).f154243Q1) && !((C54991o) ((C54991o) mo87696x0(cls3)).business(cls3)).f154248R1) {
            this.f35677N.setVisibility(8);
            View view = this.f35676M;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin", "showTitle", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin", "showTitle", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            if (((C54991o) ((C54991o) mo87696x0(cls3)).business(cls3)).mo75963I3()) {
                this.f35677N.setVisibility(8);
            } else {
                this.f35677N.setText(this.f166287d.getContext().getString(C0966R.string.doe));
                this.f35677N.setVisibility(0);
            }
            View view3 = this.f35676M;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin", "showTitle", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin", "showTitle", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        long j = 0;
        if (mo12069a1()) {
            if (((C0690t1) ((C54991o) mo87696x0(cls3)).business(cls)).f1629i == 0 || ((C0690t1) ((C54991o) mo87696x0(cls3)).business(cls)).mo653f3()) {
                this.f35678P.setVisibility(8);
            } else {
                this.f35678P.setText(MMApplicationContext.getContext().getResources().getString(C0966R.string.e_7));
                this.f35678P.setVisibility(0);
            }
            int i2 = this.f35703z;
            if (this.f35678P.getVisibility() == 0 && this.f35677N.getVisibility() == 0) {
                i2 = this.f35703z + this.f35665B.getDimensionPixelOffset(C0966R.dimen.f3736cp);
            }
            if (this.f35677N.getVisibility() == 0 && this.f35678P.getVisibility() == 0) {
                View view5 = this.f35681R;
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(0);
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin", "showTitle", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin", "showTitle", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View view7 = this.f35681R;
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(8);
                View view8 = view7;
                C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin", "showTitle", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin", "showTitle", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f35683T.getLayoutParams().height = i2;
            String string = this.f166287d.getContext().getString(C0966R.string.ea8);
            C87412m.m108593f(string, "root.context.getString(R…ive_wecoin_amount_in_hot)");
            C62042e eVar = C62042e.f176370a;
            String format = String.format(string, Arrays.copyOf(new Object[]{eVar.mo87005G(eVar.mo87096m0(((C55001u) mo87696x0(cls2)).f154420q))}, 1));
            C87412m.m108593f(format, "format(format, *args)");
            C45795b A0 = mo87684A0();
            eVar.getClass();
            C87412m.m108594g(A0, "buContext");
            C35464c<Integer> cVar = C32444a.f86141f;
            if (cVar.mo60266n().intValue() > 0 ? cVar.mo60266n().intValue() == 2 : ((C54991o) A0.mo71262a(cls3)).f154201F3) {
                String string2 = this.f166287d.getContext().getString(C0966R.string.mgm);
                C87412m.m108593f(string2, "root.context.getString(R…oin_amount_reward_in_hot)");
                Object[] objArr = new Object[1];
                C64273c21 c212 = ((C55001u) mo87696x0(cls2)).f154420q;
                eVar.getClass();
                if (c212 != null) {
                    j = c212.f182407u;
                }
                objArr[0] = eVar.mo87005G(j);
                String format2 = String.format(string2, Arrays.copyOf(objArr, 1));
                C87412m.m108593f(format2, "format(format, *args)");
                TextView textView = this.f35667D;
                textView.setText(format + " · " + format2);
                return;
            }
            this.f35667D.setText(format);
            return;
        }
        Resources resources = this.f35665B;
        C62042e eVar2 = C62042e.f176370a;
        String string3 = resources.getString(C0966R.string.dvm, new Object[]{eVar2.mo87005G((long) i)});
        C87412m.m108593f(string3, "resources.getString(com.…umber(totalCnt.toLong()))");
        long m0 = eVar2.mo87096m0(((C55001u) mo87696x0(cls2)).f154420q);
        if (m0 > 0) {
            String string4 = this.f166287d.getContext().getString(C0966R.string.ea8);
            C87412m.m108593f(string4, "root.context.getString(R…ive_wecoin_amount_in_hot)");
            String format3 = String.format(string4, Arrays.copyOf(new Object[]{eVar2.mo87005G(m0)}, 1));
            C87412m.m108593f(format3, "format(format, *args)");
            TextView textView2 = this.f35667D;
            textView2.setText(string3 + " · " + format3);
            return;
        }
        this.f35667D.setText(string3);
    }

    /* renamed from: e */
    public void mo12022e(Bundle bundle, Object obj, long j) {
        String str = "";
        String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", str) : null;
        if (string != null) {
            str = string;
        }
        if (C87412m.m108589b(str, this.f35693r)) {
            C12396f fVar = new C12396f(this, bundle, obj, j);
            Pattern pattern = C61926c.f176038a;
            MMHandlerThread.postToMainThreadDelayed(fVar, j);
        }
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        super.mo8357i0();
        this.f35666C.setOnClickListener(new C12554na(this));
        this.f35675L.setOnClickListener(new C12571oa(this));
        this.f35670G.setOnClickListener(new C12600pa(this));
        this.f35676M.setOnClickListener(new C12622qa(this));
        this.f35673J.setOnVisibilityListener(new C12646ra(this));
        this.f35682S.f36809y = new C12661sa(this);
        AppBarLayout appBarLayout = this.f35700x0;
        if (appBarLayout != null) {
            C12390a aVar = new C12390a();
            aVar.mo3128a(appBarLayout, 0);
            appBarLayout.mo146159a(aVar);
        }
    }

    /* renamed from: l0 */
    public boolean mo3207l0() {
        if (mo14483f0() != 0) {
            return false;
        }
        this.f35673J.mo78802a();
        if (this.f35690p.getLiveRole() != 1) {
            return true;
        }
        C7335d c = C86312j.m106911c(C54108o.class);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.SEE_GIFT_LIST, String.valueOf(3), (String) null, 4, (Object) null);
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        this.f35666C.setOnClickListener((View.OnClickListener) null);
        this.f35675L.setOnClickListener((View.OnClickListener) null);
        this.f35670G.setOnClickListener((View.OnClickListener) null);
        this.f35676M.setOnClickListener((View.OnClickListener) null);
        this.f35673J.setOnVisibilityListener((C32226l<? super Boolean, C13598b0>) null);
        this.f35682S.f36809y = null;
    }
}
