package rs1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import cm1.C55012e1;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderJointBusinessWithContextIDStruct;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.activity.fragment.FinderActivityFragment;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2483o0;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.p056ui.FinderHomeUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderShareFeedRelUI;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderReportFragment;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.view.C4194v2;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import df1.C7322a;
import di3.C7335d;
import di3.C86312j;
import dp1.C58353a0;
import dp1.C58368h1;
import dp1.C58378j1;
import dp1.C58398q1;
import dp1.C58403t;
import dp1.C58417y0;
import dp1.C7422c0;
import dp1.C7438g1;
import dp1.C7439h0;
import dp1.C7459y1;
import eb0.C31543z5;
import ef1.C58553c;
import ef1.C58556f;
import ef1.C7639h;
import ef1.C7641j;
import er1.C58679a1;
import er1.C58784w3;
import f40.C86709a0;
import gy3.C87412m;
import h81.C32735h;
import he1.C59838a;
import ht1.C60172g4;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import ns3.C11266d;
import org.json.JSONObject;
import os1.C11739f;
import rx3.C13604l;
import sx3.C64197v;
import sx3.C90363p0;
import sx3.C90364q0;
import te3.C48978cb0;
import te3.C49712hj1;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: rs1.s8 */
public final class C13442s8 extends UIComponent implements C4194v2, C60172g4 {

    /* renamed from: Q0 */
    public static final C13443a f38060Q0 = new C13443a();

    /* renamed from: R0 */
    public static final String f38061R0 = "FinderReporterThread";

    /* renamed from: S0 */
    public static final String f38062S0 = "Finder.FinderReporterUIC";

    /* renamed from: T0 */
    public static final int f38063T0 = 1;

    /* renamed from: U0 */
    public static final int f38064U0 = 2;

    /* renamed from: V0 */
    public static final long f38065V0 = 60000;

    /* renamed from: A */
    public C58553c f38066A;

    /* renamed from: B */
    public C7322a f38067B;

    /* renamed from: C */
    public C7438g1 f38068C;

    /* renamed from: D */
    public C58368h1 f38069D;

    /* renamed from: E */
    public C7439h0 f38070E;

    /* renamed from: F */
    public C58398q1 f38071F;

    /* renamed from: G */
    public C7459y1 f38072G;

    /* renamed from: H */
    public C58553c f38073H;

    /* renamed from: I */
    public C7322a f38074I;

    /* renamed from: J */
    public C58556f f38075J;

    /* renamed from: K */
    public C58403t f38076K;

    /* renamed from: L */
    public C58553c f38077L;

    /* renamed from: M */
    public C7322a f38078M;

    /* renamed from: N */
    public C7438g1 f38079N;

    /* renamed from: P */
    public C58368h1 f38080P;

    /* renamed from: Q */
    public C58553c f38081Q;

    /* renamed from: R */
    public C7322a f38082R;

    /* renamed from: S */
    public C7438g1 f38083S;

    /* renamed from: T */
    public C7422c0 f38084T;

    /* renamed from: U */
    public C7639h f38085U;

    /* renamed from: V */
    public C58353a0 f38086V;

    /* renamed from: W */
    public boolean f38087W = true;

    /* renamed from: X */
    public boolean f38088X = true;

    /* renamed from: Y */
    public boolean f38089Y;

    /* renamed from: Z */
    public boolean f38090Z = true;

    /* renamed from: d */
    public int f38091d;

    /* renamed from: e */
    public int f38092e;

    /* renamed from: f */
    public long f38093f;

    /* renamed from: g */
    public String f38094g;

    /* renamed from: h */
    public int f38095h;

    /* renamed from: i */
    public int f38096i;

    /* renamed from: j */
    public String f38097j = "";

    /* renamed from: n */
    public String f38098n;

    /* renamed from: o */
    public String f38099o;

    /* renamed from: p */
    public String f38100p;

    /* renamed from: p0 */
    public LinkedList<WeakReference<WxRecyclerAdapter<?>>> f38101p0 = new LinkedList<>();

    /* renamed from: q */
    public String f38102q;

    /* renamed from: r */
    public String f38103r = "{}";

    /* renamed from: s */
    public int f38104s;

    /* renamed from: t */
    public int f38105t;

    /* renamed from: u */
    public String f38106u = "";

    /* renamed from: v */
    public String f38107v = "";

    /* renamed from: w */
    public String f38108w = "";

    /* renamed from: x */
    public String f38109x = "";

    /* renamed from: x0 */
    public C58378j1 f38110x0;

    /* renamed from: y */
    public String f38111y = "";

    /* renamed from: y0 */
    public final C13445c f38112y0;

    /* renamed from: z */
    public int f38113z = -1;

    /* renamed from: rs1.s8$a */
    public static final class C13443a {
        /* renamed from: e */
        public static /* synthetic */ void m12791e(C13443a aVar, Context context, Intent intent, long j, String str, int i, int i2, boolean z, int i3, int i4, Object obj) {
            int i5 = i4;
            aVar.mo12872d(context, intent, (i5 & 4) != 0 ? 0 : j, (i5 & 8) != 0 ? null : str, (i5 & 16) != 0 ? 0 : i, (i5 & 32) != 0 ? 0 : i2, (i5 & 64) != 0 ? false : z, (i5 & 128) != 0 ? -1 : i3);
        }

        /* renamed from: a */
        public final String mo12869a(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append('-');
            sb.append(C31543z5.m39453c());
            String sb4 = sb.toString();
            String Y60 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_finder_all_clicktabid_blacklist, "100");
            Log.m105925i(C13442s8.f38062S0, "genClickTabContextId [%s] uiTabIndex[%s] blacklist[%s]", sb4, i != 1 ? i != 2 ? i != 3 ? i != 4 ? "unknown" : "2" : "0" : "3" : "1", Y60);
            try {
                C87412m.m108593f(Y60, "blacklist");
                for (String b : C112550d0.m153784T(Y60, new char[]{';'}, false, 0, 6, (Object) null)) {
                    if (C87412m.m108589b(b, String.valueOf(i))) {
                        return sb4;
                    }
                }
            } catch (Exception unused) {
            }
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_ALL_CLICK_TAB_CONTEXT_ID_STRING, sb4);
            return sb4;
        }

        /* renamed from: b */
        public final String mo12870b() {
            return C13442s8.f38061R0;
        }

        /* renamed from: c */
        public final void mo12871c(Context context, Intent intent) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(intent, "intent");
            m12791e(this, context, intent, 0, (String) null, 0, 0, false, 0, 252, (Object) null);
        }

        /* renamed from: d */
        public final void mo12872d(Context context, Intent intent, long j, String str, int i, int i2, boolean z, int i3) {
            boolean z2;
            int i4;
            Context context2;
            String str2;
            Context context3 = context;
            Intent intent2 = intent;
            long j2 = j;
            String str3 = str;
            int i5 = i;
            int i6 = i2;
            int i7 = i3;
            Class cls = C13442s8.class;
            C87412m.m108594g(context3, "context");
            C87412m.m108594g(intent2, "intent");
            if (context3 instanceof MMFragmentActivity) {
                C39818r rVar = C39818r.f106831a;
                AppCompatActivity appCompatActivity = (AppCompatActivity) context3;
                int i8 = ((C13442s8) rVar.mo62444c(appCompatActivity).mo75002a(cls)).f38096i;
                C58784w3.f168295a.getClass();
                if (!(i8 == 15 || i8 == 19 || i8 == 26 || i8 == 28 || i8 == 30 || i8 == 35 || i8 == 119 || i8 == 32 || i8 == 33)) {
                    switch (i8) {
                        case 22:
                        case 23:
                        case 24:
                            break;
                        default:
                            z2 = false;
                            break;
                    }
                }
                z2 = true;
                if (z2) {
                    intent2.putExtra("key_from_comment_scene", ((C13442s8) rVar.mo62444c(appCompatActivity).mo75002a(cls)).f38095h);
                } else {
                    intent2.putExtra("key_from_comment_scene", ((C13442s8) rVar.mo62444c(appCompatActivity).mo75002a(cls)).f38096i);
                }
                String str4 = ((C13442s8) rVar.mo62444c(appCompatActivity).mo75002a(cls)).f38098n;
                if (!(str4 == null || str4.length() == 0)) {
                    intent2.putExtra("key_context_id", str4);
                }
                String str5 = ((C13442s8) rVar.mo62444c(appCompatActivity).mo75002a(cls)).f38108w;
                if (!Util.isNullOrNil(str5)) {
                    intent2.putExtra("key_common_extra_info", str5);
                }
                String str6 = ((C13442s8) rVar.mo62444c(appCompatActivity).mo75002a(cls)).f38107v;
                if (!Util.isNullOrNil(str6)) {
                    intent2.putExtra("key_extra_info", str6);
                }
                String str7 = ((C13442s8) rVar.mo62444c(appCompatActivity).mo75002a(cls)).f38109x;
                if (!Util.isNullOrNil(str7)) {
                    intent2.putExtra("key_enter_source_info", str7);
                }
                if (z) {
                    int i9 = ((C13442s8) rVar.mo62444c(appCompatActivity).mo75002a(cls)).f38091d;
                    ((C13442s8) rVar.mo62444c(appCompatActivity).mo75002a(cls)).f38100p = mo12869a(i9);
                    String a = mo12869a(2);
                    intent2.putExtra("key_click_tab_context_id", a);
                    C13442s8 s8Var = (C13442s8) rVar.mo62444c(appCompatActivity).mo75002a(cls);
                    if (s8Var != null) {
                        C49712hj1 q3 = s8Var.mo12861q3();
                        q3.f134672f = a;
                        C7335d c = C86312j.m106911c(C58417y0.class);
                        C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                        i4 = i8;
                        int i15 = 2;
                        ((C58417y0) c).Zx0(i9, 2, q3, 0);
                        C58403t k3 = s8Var.mo12855k3(i9);
                        if (k3 != null && (k3 instanceof C58368h1)) {
                            i15 = 2;
                            ((C58368h1) k3).mo83137a2(C58403t.f167322q.mo83248b(C90364q0.m113147f(new C13604l("feedActionType", 2), new C13604l("toTab", 2), new C13604l("fromTab", Integer.valueOf(i9)))), true);
                        }
                        C2483o0.f12984a.mo2458h(i15, q3);
                    } else {
                        i4 = i8;
                    }
                } else {
                    i4 = i8;
                    intent2.putExtra("key_click_tab_context_id", ((C13442s8) rVar.mo62444c(appCompatActivity).mo75002a(cls)).f38100p);
                }
                if (j2 != 0) {
                    intent2.putExtra("key_click_feed_id", j2);
                } else {
                    long j3 = ((C13442s8) rVar.mo62444c(appCompatActivity).mo75002a(cls)).f38093f;
                    if (j3 != 0) {
                        intent2.putExtra("key_click_feed_id", j3);
                    }
                }
                if ((str3 == null || intent2.putExtra("key_click_feed_context_id", str3) == null) && (str2 = ((C13442s8) rVar.mo62444c(appCompatActivity).mo75002a(cls)).f38094g) != null) {
                    intent2.putExtra("key_click_feed_context_id", str2);
                }
                if (i5 != 0) {
                    intent2.putExtra("report_scene", i5);
                } else {
                    int i16 = ((C13442s8) rVar.mo62444c(appCompatActivity).mo75002a(cls)).f38105t;
                    if (i16 != 0) {
                        intent2.putExtra("report_scene", i16);
                    }
                }
                int i17 = i2;
                if (i17 != 0) {
                    intent2.putExtra("key_enter_profile_type", i17);
                } else {
                    int i18 = ((C13442s8) rVar.mo62444c(appCompatActivity).mo75002a(cls)).f38104s;
                    if (i18 != 0) {
                        intent2.putExtra("key_enter_profile_type", i18);
                    }
                }
                int i19 = i3;
                if (i19 != -1) {
                    intent2.putExtra("key_entrance_type", i19);
                } else {
                    int i25 = ((C13442s8) rVar.mo62444c(appCompatActivity).mo75002a(cls)).f38113z;
                    if (i25 != -1) {
                        intent2.putExtra("key_entrance_type", i25);
                    }
                }
                int intExtra = intent2.getIntExtra("key_entrance_type", -1);
                int intExtra2 = intent2.getIntExtra("key_to_comment_scene", 0);
                if (intExtra2 == 0 || intExtra <= -1) {
                    context2 = context;
                    String stringExtra = ((MMFragmentActivity) context2).getIntent().getStringExtra("key_jump_id");
                    if (!(stringExtra == null || stringExtra.length() == 0) && !intent2.hasExtra("key_jump_id")) {
                        intent2.putExtra("key_jump_id", stringExtra);
                    }
                    String str8 = C13442s8.f38062S0;
                    Log.m105924i(str8, "[initIntentParams] jumpId=" + stringExtra);
                } else {
                    String str9 = C13442s8.f38062S0;
                    Log.m105924i(str9, "[initIntentParams] commentScene=" + i4 + " toCommentScene=" + intExtra2 + " entranceType=" + intExtra);
                    context2 = context;
                    C58679a1.f167972a.mo83554a(context2, intent2, intExtra2, intExtra);
                }
                MMFragmentActivity mMFragmentActivity = (MMFragmentActivity) context2;
                long longExtra = mMFragmentActivity.getIntent().getLongExtra("key_ref_feed_id", 0);
                if (longExtra != 0 && !intent2.hasExtra("key_ref_feed_id")) {
                    intent2.putExtra("key_ref_feed_id", longExtra);
                }
                int intExtra3 = mMFragmentActivity.getIntent().getIntExtra("key_ref_comment_scene", 0);
                if (intExtra3 > 0 && !intent2.hasExtra("key_ref_comment_scene")) {
                    intent2.putExtra("key_ref_comment_scene", intExtra3);
                    return;
                }
                return;
            }
            Log.m105928w(C13442s8.f38062S0, "initIntentParams context is not MMFragmentActivity");
        }

        /* renamed from: f */
        public final C13442s8 mo12873f(Context context) {
            C87412m.m108594g(context, "context");
            if (context instanceof MMFragmentActivity) {
                return (C13442s8) C39818r.f106831a.mo62444c((AppCompatActivity) context).mo75002a(C13442s8.class);
            }
            return null;
        }
    }

    /* renamed from: rs1.s8$b */
    public static final class C13444b implements Runnable {

        /* renamed from: d */
        public static final C13444b f38114d = new C13444b();

        public final void run() {
            C55012e1.f154468d.mo76067k();
        }
    }

    /* renamed from: rs1.s8$c */
    public static final class C13445c extends MMHandler {

        /* renamed from: a */
        public final /* synthetic */ C13442s8 f38115a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13445c(C13442s8 s8Var, String str) {
            super(str);
            this.f38115a = s8Var;
        }

        public void handleMessage(Message message) {
            if (message != null) {
                C13442s8 s8Var = this.f38115a;
                int i = message.what;
                int i2 = C13442s8.f38063T0;
                if (i == i2) {
                    C13442s8.m12754c3(s8Var);
                    sendEmptyMessageDelayed(i2, C13442s8.f38065V0);
                } else if (i == C13442s8.f38064U0) {
                    C13442s8.m12754c3(s8Var);
                    removeCallbacksAndMessages((Object) null);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13442s8(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        f38060Q0.getClass();
        this.f38112y0 = new C13445c(this, f38061R0);
    }

    /* renamed from: c3 */
    public static final void m12754c3(C13442s8 s8Var) {
        C58353a0 a0Var;
        if (s8Var.mo12843J3()) {
            C58403t tVar = s8Var.f38076K;
            if (tVar != null) {
                tVar.mo8558M1();
            }
            C58368h1 h1Var = s8Var.f38080P;
            if (h1Var != null) {
                h1Var.mo8558M1();
            }
            C7422c0 c0Var = s8Var.f38084T;
            if (c0Var != null) {
                c0Var.mo8558M1();
            }
        } else if (s8Var.mo12846M3()) {
            C58368h1 h1Var2 = s8Var.f38069D;
            if (h1Var2 != null) {
                h1Var2.mo8558M1();
            }
        } else if (s8Var.mo12847N3()) {
            C58398q1 q1Var = s8Var.f38071F;
            if (q1Var != null) {
                q1Var.mo8558M1();
            }
        } else {
            if (s8Var.f38092e == 5) {
                C7459y1 y1Var = s8Var.f38072G;
                if (y1Var != null) {
                    y1Var.mo8558M1();
                }
            } else if (s8Var.mo12844K3() && (a0Var = s8Var.f38086V) != null) {
                a0Var.mo8558M1();
            }
        }
    }

    /* renamed from: A3 */
    public C7322a mo12835A3(int i) {
        return mo12843J3() ? i == -1 ? mo12857m3(this.f38091d) : mo12857m3(i) : this.f38067B;
    }

    /* renamed from: B3 */
    public void mo12836B3(String str) {
        this.f38102q = str;
    }

    /* renamed from: C3 */
    public void mo12837C3(String str, String str2) {
        C87412m.m108594g(str, "key");
        C87412m.m108594g(str2, "value");
        try {
            JSONObject jSONObject = new JSONObject(C112551y.m153816p(this.f38103r, ";", ",", false, 4, (Object) null));
            jSONObject.put(str, str2);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "jsonObject.toString()");
            this.f38103r = C112551y.m153814n(jSONObject2, ",", ";", false);
        } catch (Exception e) {
            Log.m105924i(f38062S0, String.valueOf(e.getMessage()));
        }
    }

    /* renamed from: D3 */
    public List<C48978cb0> mo12838D3() {
        String str;
        C58403t k3 = mo12855k3(-1);
        LinkedList linkedList = new LinkedList();
        if (k3 instanceof C58368h1) {
            C58368h1 h1Var = (C58368h1) k3;
            for (Map.Entry next : h1Var.f167165A.entrySet()) {
                C48978cb0 cb02 = new C48978cb0();
                cb02.f131607d = ((C58378j1) next.getValue()).f167241a;
                FinderItem finderItem = ((C58378j1) next.getValue()).f167245c;
                if (finderItem == null || (str = finderItem.getUserName()) == null) {
                    str = "";
                }
                cb02.f131608e = str;
                cb02.f131609f = ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83281Cu(cb02.f131607d, h1Var.f167327h.f134675i);
                linkedList.add(cb02);
            }
        }
        return linkedList;
    }

    /* renamed from: E3 */
    public String mo12839E3() {
        return this.f38102q;
    }

    /* renamed from: F3 */
    public final String mo12840F3() {
        return this.f38111y;
    }

    /* renamed from: G3 */
    public final String mo12841G3() {
        return this.f38099o;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: dp1.q1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: dp1.h1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: dp1.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: dp1.k0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: dp1.p1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: dp1.q0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: dp1.q1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: dp1.q1} */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0018, code lost:
        r3 = r3.getStringExtra("key_jump_id");
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: I3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12842I3(int r11, int r12) {
        /*
            r10 = this;
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC> r0 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC.class
            java.lang.Class<dp1.y0> r1 = dp1.C58417y0.class
            java.lang.Class<ns3.d> r2 = ns3.C11266d.class
            androidx.appcompat.app.AppCompatActivity r3 = r10.getActivity()
            java.lang.String r4 = "activity"
            gy3.C87412m.m108594g(r3, r4)
            android.content.Intent r3 = r3.getIntent()
            r4 = 0
            java.lang.String r5 = ""
            if (r3 == 0) goto L_0x0029
            java.lang.String r6 = "key_jump_id"
            java.lang.String r3 = r3.getStringExtra(r6)
            if (r3 == 0) goto L_0x0029
            java.lang.String r6 = ","
            java.lang.String r7 = ";"
            java.lang.String r3 = z04.C112551y.m153814n(r3, r6, r7, r4)
            goto L_0x002a
        L_0x0029:
            r3 = r5
        L_0x002a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "[getJumpDataStr] "
            r6.append(r7)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "FinderJumpDataUtils"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            r10.f38111y = r3
            androidx.appcompat.app.AppCompatActivity r3 = r10.getActivity()
            android.content.Intent r3 = r3.getIntent()
            java.lang.String r6 = "key_from_comment_scene"
            int r3 = r3.getIntExtra(r6, r4)
            r10.f38095h = r3
            if (r11 != 0) goto L_0x0057
            r10.f38096i = r3
            goto L_0x0059
        L_0x0057:
            r10.f38096i = r11
        L_0x0059:
            r10.f38092e = r12
            androidx.appcompat.app.AppCompatActivity r12 = r10.getActivity()
            android.content.Intent r12 = r12.getIntent()
            java.lang.String r3 = "key_enter_scene"
            int r12 = r12.getIntExtra(r3, r4)
            androidx.appcompat.app.AppCompatActivity r3 = r10.getActivity()
            android.content.Intent r3 = r3.getIntent()
            java.lang.String r6 = "key_card_type"
            int r3 = r3.getIntExtra(r6, r4)
            androidx.appcompat.app.AppCompatActivity r6 = r10.getActivity()
            android.content.Intent r6 = r6.getIntent()
            java.lang.String r7 = "key_context_id"
            java.lang.String r6 = r6.getStringExtra(r7)
            r7 = 45
            if (r6 != 0) goto L_0x00b1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r12)
            r6.append(r7)
            r6.append(r3)
            r6.append(r7)
            r6.append(r11)
            r6.append(r7)
            di3.d r12 = di3.C86312j.m106911c(r1)
            dp1.y0 r12 = (dp1.C58417y0) r12
            java.lang.String r12 = r12.mo83357yP()
            r6.append(r12)
            java.lang.String r6 = r6.toString()
        L_0x00b1:
            r10.f38098n = r6
            java.lang.Class<h81.i> r12 = h81.C59774i.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            h81.i r12 = (h81.C59774i) r12
            java.lang.String r12 = r12.mo84751Wb()
            if (r12 != 0) goto L_0x00c2
            r12 = r5
        L_0x00c2:
            r10.f38099o = r12
            androidx.appcompat.app.AppCompatActivity r12 = r10.getActivity()
            android.content.Intent r12 = r12.getIntent()
            r8 = 0
            java.lang.String r3 = "key_click_feed_id"
            long r8 = r12.getLongExtra(r3, r8)
            r10.f38093f = r8
            androidx.appcompat.app.AppCompatActivity r12 = r10.getActivity()
            android.content.Intent r12 = r12.getIntent()
            java.lang.String r3 = "key_click_feed_context_id"
            java.lang.String r12 = r12.getStringExtra(r3)
            r10.f38094g = r12
            androidx.appcompat.app.AppCompatActivity r12 = r10.getActivity()
            android.content.Intent r12 = r12.getIntent()
            java.lang.String r3 = "key_enter_profile_type"
            int r12 = r12.getIntExtra(r3, r4)
            r10.f38104s = r12
            androidx.appcompat.app.AppCompatActivity r12 = r10.getActivity()
            android.content.Intent r12 = r12.getIntent()
            java.lang.String r3 = "report_scene"
            int r12 = r12.getIntExtra(r3, r4)
            r10.f38105t = r12
            androidx.appcompat.app.AppCompatActivity r12 = r10.getActivity()
            android.content.Intent r12 = r12.getIntent()
            r3 = -1
            java.lang.String r6 = "key_entrance_type"
            int r12 = r12.getIntExtra(r6, r3)
            r10.f38113z = r12
            boolean r12 = r10.mo12843J3()
            r3 = 1
            if (r12 == 0) goto L_0x014e
            bl3.r r11 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r12 = r10.getActivity()
            bl3.r$a r11 = r11.mo62444c(r12)
            androidx.lifecycle.i0 r11 = r11.mo75002a(r0)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC r11 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC) r11
            int r11 = r11.mo5128d3()
            r10.f38091d = r11
            di3.d r11 = di3.C86312j.m106911c(r1)
            dp1.y0 r11 = (dp1.C58417y0) r11
            int r12 = r10.f38091d
            int r11 = r11.mo83328dc(r12)
            r10.f38096i = r11
            rs1.s8$a r11 = f38060Q0
            int r12 = r10.f38091d
            java.lang.String r11 = r11.mo12869a(r12)
            r10.f38100p = r11
            goto L_0x0220
        L_0x014e:
            boolean r12 = r10.mo12845L3()
            if (r12 == 0) goto L_0x019c
            di3.d r11 = di3.C86312j.m106911c(r2)
            ns3.d r11 = (ns3.C11266d) r11
            androidx.fragment.app.Fragment r12 = r10.getFragment()
            int r11 = r11.Yg0(r12)
            r10.f38091d = r11
            di3.d r11 = di3.C86312j.m106911c(r2)
            ns3.d r11 = (ns3.C11266d) r11
            androidx.fragment.app.Fragment r12 = r10.getFragment()
            int r11 = r11.Nm0(r12)
            r10.f38096i = r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            di3.d r12 = di3.C86312j.m106911c(r2)
            ns3.d r12 = (ns3.C11266d) r12
            androidx.fragment.app.Fragment r1 = r10.getFragment()
            java.lang.String r12 = r12.J00(r1)
            r11.append(r12)
            r11.append(r7)
            long r1 = eb0.C31543z5.m39453c()
            r11.append(r1)
            java.lang.String r11 = r11.toString()
            r10.f38100p = r11
            goto L_0x0220
        L_0x019c:
            androidx.fragment.app.Fragment r12 = r10.getFragment()
            boolean r12 = r12 instanceof com.tencent.p014mm.plugin.finder.activity.fragment.FinderActivityFragment
            if (r12 == 0) goto L_0x01fd
            androidx.fragment.app.Fragment r12 = r10.getFragment()
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment"
            gy3.C87412m.m108592e(r12, r1)
            com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment r12 = (com.tencent.p014mm.plugin.finder.activity.fragment.FinderActivityFragment) r12
            int r12 = r12.f17334o
            int r12 = r12 + r3
            r10.f38091d = r12
            androidx.fragment.app.Fragment r12 = r10.getFragment()
            gy3.C87412m.m108592e(r12, r1)
            com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment r12 = (com.tencent.p014mm.plugin.finder.activity.fragment.FinderActivityFragment) r12
            int r12 = r12.mo2203R()
            r10.f38096i = r12
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>()
            androidx.fragment.app.Fragment r2 = r10.getFragment()
            gy3.C87412m.m108592e(r2, r1)
            com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment r2 = (com.tencent.p014mm.plugin.finder.activity.fragment.FinderActivityFragment) r2
            long r6 = r2.f12469q
            java.lang.String r2 = o40.C61926c.m72691p(r6)
            androidx.fragment.app.Fragment r6 = r10.getFragment()
            gy3.C87412m.m108592e(r6, r1)
            com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment r6 = (com.tencent.p014mm.plugin.finder.activity.fragment.FinderActivityFragment) r6
            java.lang.String r1 = r6.f12470r
            r12.put(r2, r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            java.lang.String r12 = r12.toString()
            java.lang.String r1 = "JSONObject().apply {\n   …\n            }.toString()"
            gy3.C87412m.m108593f(r12, r1)
            r10.f38097j = r12
            rs1.s8$a r12 = f38060Q0
            int r11 = r11 + 100
            java.lang.String r11 = r12.mo12869a(r11)
            r10.f38100p = r11
            goto L_0x0220
        L_0x01fd:
            androidx.appcompat.app.AppCompatActivity r12 = r10.getActivity()
            android.content.Intent r12 = r12.getIntent()
            java.lang.String r1 = "key_click_tab_context_id"
            java.lang.String r12 = r12.getStringExtra(r1)
            if (r12 != 0) goto L_0x020e
            r12 = r5
        L_0x020e:
            r10.f38100p = r12
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r12 == 0) goto L_0x0220
            rs1.s8$a r12 = f38060Q0
            int r11 = r11 + 100
            java.lang.String r11 = r12.mo12869a(r11)
            r10.f38100p = r11
        L_0x0220:
            androidx.appcompat.app.AppCompatActivity r11 = r10.getActivity()
            android.content.Intent r11 = r11.getIntent()
            java.lang.String r12 = "key_common_extra_info"
            java.lang.String r11 = r11.getStringExtra(r12)
            if (r11 != 0) goto L_0x0231
            r11 = r5
        L_0x0231:
            r10.f38108w = r11
            androidx.appcompat.app.AppCompatActivity r11 = r10.getActivity()
            android.content.Intent r11 = r11.getIntent()
            java.lang.String r12 = "key_extra_info"
            java.lang.String r11 = r11.getStringExtra(r12)
            if (r11 != 0) goto L_0x0244
            r11 = r5
        L_0x0244:
            r10.f38107v = r11
            dp1.t$b r11 = dp1.C58403t.f167322q
            androidx.appcompat.app.AppCompatActivity r12 = r10.getActivity()
            android.content.Intent r12 = r12.getIntent()
            java.lang.String r1 = "KEY_RINGTONE_REPORT_JSON"
            java.lang.String r12 = r12.getStringExtra(r1)
            if (r12 != 0) goto L_0x0259
            r12 = r5
        L_0x0259:
            r11.getClass()
            dp1.C58403t.f167324s = r12
            androidx.appcompat.app.AppCompatActivity r11 = r10.getActivity()
            android.content.Intent r11 = r11.getIntent()
            java.lang.String r12 = "key_enter_source_info"
            java.lang.String r11 = r11.getStringExtra(r12)
            if (r11 != 0) goto L_0x026f
            goto L_0x0270
        L_0x026f:
            r5 = r11
        L_0x0270:
            r10.f38109x = r5
            java.lang.String r11 = f38062S0
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "initActivityReporter reportType:"
            r12.append(r1)
            int r1 = r10.f38092e
            r12.append(r1)
            java.lang.String r1 = " commentScene:"
            r12.append(r1)
            int r1 = r10.f38096i
            r12.append(r1)
            java.lang.String r1 = " fromCommentScene:"
            r12.append(r1)
            int r1 = r10.f38095h
            r12.append(r1)
            java.lang.String r1 = " sessionId:"
            r12.append(r1)
            java.lang.String r1 = r10.f38099o
            r12.append(r1)
            java.lang.String r1 = " contextId:"
            r12.append(r1)
            java.lang.String r1 = r10.f38098n
            r12.append(r1)
            java.lang.String r1 = " clickTabContextId:"
            r12.append(r1)
            java.lang.String r1 = r10.f38100p
            r12.append(r1)
            java.lang.String r1 = " currentTabType:"
            r12.append(r1)
            int r1 = r10.f38091d
            r12.append(r1)
            java.lang.String r1 = " uxInfo:"
            r12.append(r1)
            java.lang.String r1 = r10.f38107v
            r12.append(r1)
            java.lang.String r1 = " commonExtraInfo:"
            r12.append(r1)
            java.lang.String r1 = r10.f38108w
            r12.append(r1)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)
            boolean r11 = r10.mo12843J3()
            java.lang.String r12 = "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity"
            if (r11 == 0) goto L_0x042d
            ef1.c r11 = new ef1.c
            java.lang.String r1 = f38061R0
            r11.<init>(r1)
            up1.f r2 = up1.C37521f.f99374d
            r2.getClass()
            pe1.c<java.lang.Integer> r2 = up1.C37521f.f99315W0
            java.lang.Object r5 = r2.mo60266n()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r6 = 2
            if (r5 == r3) goto L_0x0310
            java.lang.Object r5 = r2.mo60266n()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r5 != r6) goto L_0x030a
            goto L_0x0310
        L_0x030a:
            dp1.g1 r5 = new dp1.g1
            r5.<init>(r11)
            goto L_0x0315
        L_0x0310:
            dp1.h0 r5 = new dp1.h0
            r5.<init>(r11)
        L_0x0315:
            r10.f38075J = r5
            df1.a r5 = new df1.a
            r5.<init>(r11)
            r10.f38074I = r5
            java.lang.Object r5 = r2.mo60266n()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r7 = 3
            if (r5 == r3) goto L_0x0351
            java.lang.Object r2 = r2.mo60266n()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            if (r2 != r6) goto L_0x0338
            goto L_0x0351
        L_0x0338:
            dp1.h1 r2 = new dp1.h1
            androidx.appcompat.app.AppCompatActivity r5 = r10.getActivity()
            gy3.C87412m.m108592e(r5, r12)
            com.tencent.mm.ui.MMFragmentActivity r5 = (com.tencent.p014mm.p136ui.MMFragmentActivity) r5
            te3.hj1 r6 = r10.mo12853i3(r7)
            r2.<init>(r5, r6)
            r11.mo83450a(r2)
            r2.mo8581J1()
            goto L_0x0369
        L_0x0351:
            dp1.q1 r2 = new dp1.q1
            androidx.appcompat.app.AppCompatActivity r5 = r10.getActivity()
            gy3.C87412m.m108592e(r5, r12)
            com.tencent.mm.ui.MMFragmentActivity r5 = (com.tencent.p014mm.p136ui.MMFragmentActivity) r5
            te3.hj1 r6 = r10.mo12853i3(r7)
            r2.<init>(r5, r6)
            r11.mo83450a(r2)
            r2.mo8581J1()
        L_0x0369:
            r10.f38076K = r2
            df1.b r2 = new df1.b
            r2.<init>()
            r11.mo83450a(r2)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            r10.f38073H = r11
            ef1.c r11 = new ef1.c
            r11.<init>(r1)
            dp1.g1 r2 = new dp1.g1
            r2.<init>(r11)
            r10.f38079N = r2
            df1.a r2 = new df1.a
            r2.<init>(r11)
            r10.f38078M = r2
            java.lang.Class<lc3.b> r2 = lc3.C10485b.class
            k40.a r2 = f40.C86709a0.m107533q(r2)
            lc3.b r2 = (lc3.C10485b) r2
            pj.f r2 = r2.vh0()
            java.lang.String r5 = "FinderStatsReportControl"
            int r2 = r2.mo107404b(r5, r3)
            if (r2 != r3) goto L_0x039f
            r4 = 1
        L_0x039f:
            if (r4 == 0) goto L_0x03ba
            dp1.c0 r2 = new dp1.c0
            androidx.appcompat.app.AppCompatActivity r4 = r10.getActivity()
            gy3.C87412m.m108592e(r4, r12)
            com.tencent.mm.ui.MMFragmentActivity r4 = (com.tencent.p014mm.p136ui.MMFragmentActivity) r4
            te3.hj1 r3 = r10.mo12853i3(r3)
            r2.<init>(r4, r3)
            r11.mo83450a(r2)
            r2.mo8581J1()
            goto L_0x03d2
        L_0x03ba:
            dp1.h1 r2 = new dp1.h1
            androidx.appcompat.app.AppCompatActivity r4 = r10.getActivity()
            gy3.C87412m.m108592e(r4, r12)
            com.tencent.mm.ui.MMFragmentActivity r4 = (com.tencent.p014mm.p136ui.MMFragmentActivity) r4
            te3.hj1 r3 = r10.mo12853i3(r3)
            r2.<init>(r4, r3)
            r11.mo83450a(r2)
            r2.mo8581J1()
        L_0x03d2:
            r10.f38080P = r2
            df1.b r2 = new df1.b
            r2.<init>()
            r11.mo83450a(r2)
            r10.f38077L = r11
            ef1.c r11 = new ef1.c
            r11.<init>(r1)
            dp1.g1 r1 = new dp1.g1
            r1.<init>(r11)
            r10.f38083S = r1
            df1.a r1 = new df1.a
            r1.<init>(r11)
            r10.f38082R = r1
            dp1.c0 r1 = new dp1.c0
            androidx.appcompat.app.AppCompatActivity r2 = r10.getActivity()
            gy3.C87412m.m108592e(r2, r12)
            com.tencent.mm.ui.MMFragmentActivity r2 = (com.tencent.p014mm.p136ui.MMFragmentActivity) r2
            r12 = 4
            te3.hj1 r12 = r10.mo12853i3(r12)
            r1.<init>(r2, r12)
            r11.mo83450a(r1)
            r1.mo8581J1()
            r10.f38084T = r1
            df1.b r12 = new df1.b
            r12.<init>()
            r11.mo83450a(r12)
            r10.f38081Q = r11
            bl3.r r11 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r12 = r10.getActivity()
            bl3.r$a r11 = r11.mo62444c(r12)
            androidx.lifecycle.i0 r11 = r11.mo75002a(r0)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC r11 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC) r11
            java.util.concurrent.CopyOnWriteArraySet<com.tencent.mm.plugin.finder.view.v2> r11 = r11.f18653j
            r11.add(r10)
            goto L_0x05a4
        L_0x042d:
            boolean r11 = r10.mo12846M3()
            if (r11 == 0) goto L_0x046d
            ef1.c r11 = new ef1.c
            java.lang.String r0 = f38061R0
            r11.<init>(r0)
            df1.a r0 = new df1.a
            r0.<init>(r11)
            r10.f38067B = r0
            dp1.g1 r0 = new dp1.g1
            r0.<init>(r11)
            r10.f38068C = r0
            dp1.h1 r0 = new dp1.h1
            androidx.appcompat.app.AppCompatActivity r1 = r10.getActivity()
            gy3.C87412m.m108592e(r1, r12)
            com.tencent.mm.ui.MMFragmentActivity r1 = (com.tencent.p014mm.p136ui.MMFragmentActivity) r1
            te3.hj1 r12 = r10.mo12861q3()
            r0.<init>(r1, r12)
            r11.mo83450a(r0)
            r10.f38069D = r0
            df1.b r12 = new df1.b
            r12.<init>()
            r11.mo83450a(r12)
            rx3.b0 r12 = rx3.C13598b0.f38549a
            r10.f38066A = r11
            goto L_0x05a4
        L_0x046d:
            boolean r11 = r10.mo12847N3()
            if (r11 == 0) goto L_0x0551
            ef1.c r11 = new ef1.c
            java.lang.String r0 = f38061R0
            r11.<init>(r0)
            df1.a r0 = new df1.a
            r0.<init>(r11)
            r10.f38067B = r0
            dp1.h0 r0 = new dp1.h0
            r0.<init>(r11)
            r10.f38070E = r0
            androidx.fragment.app.Fragment r0 = r10.getFragment()
            boolean r1 = r0 instanceof com.tencent.p014mm.plugin.finder.activity.poi.fragment.FinderPoiTabFragment
            if (r1 == 0) goto L_0x04c3
            dp1.q0 r0 = new dp1.q0
            androidx.appcompat.app.AppCompatActivity r1 = r10.getActivity()
            gy3.C87412m.m108592e(r1, r12)
            com.tencent.mm.ui.MMFragmentActivity r1 = (com.tencent.p014mm.p136ui.MMFragmentActivity) r1
            te3.hj1 r12 = r10.mo12861q3()
            r0.<init>(r1, r12)
            androidx.fragment.app.Fragment r12 = r10.getFragment()
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.activity.poi.fragment.FinderPoiTabFragment"
            gy3.C87412m.m108592e(r12, r1)
            com.tencent.mm.plugin.finder.activity.poi.fragment.FinderPoiTabFragment r12 = (com.tencent.p014mm.plugin.finder.activity.poi.fragment.FinderPoiTabFragment) r12
            int r12 = r12.f17334o
            int r12 = r12 + r3
            r0.f25644w = r12
            androidx.fragment.app.Fragment r12 = r10.getFragment()
            gy3.C87412m.m108592e(r12, r1)
            com.tencent.mm.plugin.finder.activity.poi.fragment.FinderPoiTabFragment r12 = (com.tencent.p014mm.plugin.finder.activity.poi.fragment.FinderPoiTabFragment) r12
            te3.je3 r12 = r12.f12487u
            r0.f25645x = r12
            rx3.b0 r12 = rx3.C13598b0.f38549a
            goto L_0x0547
        L_0x04c3:
            boolean r1 = r0 instanceof com.tencent.p014mm.plugin.finder.activity.topic.fragment.FinderTopicTabFragment
            if (r1 == 0) goto L_0x04f5
            dp1.p1 r0 = new dp1.p1
            androidx.appcompat.app.AppCompatActivity r1 = r10.getActivity()
            gy3.C87412m.m108592e(r1, r12)
            com.tencent.mm.ui.MMFragmentActivity r1 = (com.tencent.p014mm.p136ui.MMFragmentActivity) r1
            te3.hj1 r12 = r10.mo12861q3()
            r0.<init>(r1, r12)
            androidx.fragment.app.Fragment r12 = r10.getFragment()
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.activity.topic.fragment.FinderTopicTabFragment"
            gy3.C87412m.m108592e(r12, r1)
            com.tencent.mm.plugin.finder.activity.topic.fragment.FinderTopicTabFragment r12 = (com.tencent.p014mm.plugin.finder.activity.topic.fragment.FinderTopicTabFragment) r12
            int r12 = r12.f17334o
            int r12 = r12 + r3
            r0.f25642x = r12
            androidx.fragment.app.Fragment r12 = r10.getFragment()
            gy3.C87412m.m108592e(r12, r1)
            com.tencent.mm.plugin.finder.activity.topic.fragment.FinderTopicTabFragment r12 = (com.tencent.p014mm.plugin.finder.activity.topic.fragment.FinderTopicTabFragment) r12
            rx3.b0 r12 = rx3.C13598b0.f38549a
            goto L_0x0547
        L_0x04f5:
            boolean r1 = r0 instanceof com.tencent.p014mm.plugin.finder.activity.music.fragment.FinderMusicTopicFragment
            if (r1 == 0) goto L_0x051e
            dp1.k0 r0 = new dp1.k0
            androidx.appcompat.app.AppCompatActivity r1 = r10.getActivity()
            gy3.C87412m.m108592e(r1, r12)
            com.tencent.mm.ui.MMFragmentActivity r1 = (com.tencent.p014mm.p136ui.MMFragmentActivity) r1
            te3.hj1 r12 = r10.mo12861q3()
            r0.<init>(r1, r12)
            androidx.fragment.app.Fragment r12 = r10.getFragment()
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.activity.music.fragment.FinderMusicTopicFragment"
            gy3.C87412m.m108592e(r12, r1)
            com.tencent.mm.plugin.finder.activity.music.fragment.FinderMusicTopicFragment r12 = (com.tencent.p014mm.plugin.finder.activity.music.fragment.FinderMusicTopicFragment) r12
            int r12 = r12.f17334o
            int r12 = r12 + r3
            r0.f25633w = r12
            rx3.b0 r12 = rx3.C13598b0.f38549a
            goto L_0x0547
        L_0x051e:
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.finder.activity.fragment.FinderActivityFragment
            if (r0 == 0) goto L_0x0535
            dp1.g r0 = new dp1.g
            androidx.appcompat.app.AppCompatActivity r1 = r10.getActivity()
            gy3.C87412m.m108592e(r1, r12)
            com.tencent.mm.ui.MMFragmentActivity r1 = (com.tencent.p014mm.p136ui.MMFragmentActivity) r1
            te3.hj1 r12 = r10.mo12861q3()
            r0.<init>(r1, r12)
            goto L_0x0547
        L_0x0535:
            dp1.q1 r0 = new dp1.q1
            androidx.appcompat.app.AppCompatActivity r1 = r10.getActivity()
            gy3.C87412m.m108592e(r1, r12)
            com.tencent.mm.ui.MMFragmentActivity r1 = (com.tencent.p014mm.p136ui.MMFragmentActivity) r1
            te3.hj1 r12 = r10.mo12861q3()
            r0.<init>(r1, r12)
        L_0x0547:
            r10.f38071F = r0
            r11.mo83450a(r0)
            rx3.b0 r12 = rx3.C13598b0.f38549a
            r10.f38066A = r11
            goto L_0x05a4
        L_0x0551:
            int r11 = r10.f38092e
            r0 = 5
            if (r11 != r0) goto L_0x0557
            r4 = 1
        L_0x0557:
            if (r4 == 0) goto L_0x0570
            dp1.y1 r11 = new dp1.y1
            androidx.appcompat.app.AppCompatActivity r12 = r10.getActivity()
            java.lang.String r0 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r12, r0)
            com.tencent.mm.ui.MMActivity r12 = (com.tencent.p014mm.p136ui.MMActivity) r12
            te3.hj1 r0 = r10.mo12861q3()
            r11.<init>(r12, r0)
            r10.f38072G = r11
            goto L_0x05a4
        L_0x0570:
            boolean r11 = r10.mo12844K3()
            if (r11 == 0) goto L_0x05a4
            ef1.c r11 = new ef1.c
            java.lang.String r0 = f38061R0
            r11.<init>(r0)
            df1.a r0 = new df1.a
            r0.<init>(r11)
            r10.f38067B = r0
            ef1.h r0 = new ef1.h
            r0.<init>(r11)
            r10.f38085U = r0
            dp1.a0 r0 = new dp1.a0
            androidx.appcompat.app.AppCompatActivity r1 = r10.getActivity()
            gy3.C87412m.m108592e(r1, r12)
            com.tencent.mm.ui.MMFragmentActivity r1 = (com.tencent.p014mm.p136ui.MMFragmentActivity) r1
            te3.hj1 r12 = r10.mo12861q3()
            r0.<init>(r1, r12)
            r11.mo83450a(r0)
            r10.f38086V = r0
            r10.f38066A = r11
        L_0x05a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13442s8.mo12842I3(int, int):void");
    }

    /* renamed from: J3 */
    public final boolean mo12843J3() {
        return this.f38092e == 1;
    }

    /* renamed from: K3 */
    public final boolean mo12844K3() {
        return this.f38092e == 6;
    }

    /* renamed from: L3 */
    public final boolean mo12845L3() {
        return ((C11266d) C86312j.m106911c(C11266d.class)).Bo0(getFragment());
    }

    /* renamed from: M3 */
    public final boolean mo12846M3() {
        return this.f38092e == 2;
    }

    /* renamed from: N3 */
    public final boolean mo12847N3() {
        return this.f38092e == 3;
    }

    /* renamed from: O3 */
    public final void mo12848O3(long j, String str) {
        String str2 = f38062S0;
        Log.m105924i(str2, "setEnterSourceInfo:" + j + "  finderUserName:" + str + '}');
        JSONObject jSONObject = new JSONObject();
        String xx02 = ((C58417y0) C86312j.m106911c(C58417y0.class)).xx0(j);
        this.f38093f = j;
        jSONObject.put("feedid", xx02);
        jSONObject.put("finderusername", str == null ? "" : str);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "enterSourceJson.toString()");
        this.f38109x = jSONObject2;
        C58368h1 h1Var = this.f38069D;
        C49712hj1 hj12 = null;
        C49712hj1 hj13 = h1Var != null ? h1Var.f167327h : null;
        if (hj13 != null) {
            hj13.f134682s = jSONObject2;
        }
        C58398q1 q1Var = this.f38071F;
        if (q1Var != null) {
            hj12 = q1Var.f167327h;
        }
        if (hj12 != null) {
            hj12.f134682s = jSONObject2;
        }
        getActivity().getIntent().putExtra("key_enter_source_info", this.f38109x);
        if (!Util.isNullOrNil(this.f38107v)) {
            C58403t.C58405b bVar = C58403t.f167322q;
            String str3 = this.f38098n;
            String str4 = this.f38107v;
            bVar.getClass();
            FinderJointBusinessWithContextIDStruct finderJointBusinessWithContextIDStruct = new FinderJointBusinessWithContextIDStruct();
            if (str3 == null) {
                str3 = "";
            }
            finderJointBusinessWithContextIDStruct.f9813d = finderJointBusinessWithContextIDStruct.mo86045b("contextid", str3, true);
            finderJointBusinessWithContextIDStruct.f9814e = finderJointBusinessWithContextIDStruct.mo86045b("ReportExtraInfo", str4 != null ? C112551y.m153814n(str4, ",", ";", false) : "", true);
            finderJointBusinessWithContextIDStruct.f9815f = finderJointBusinessWithContextIDStruct.mo86045b("EnterSourceFeedid", xx02, true);
            if (str == null) {
                str = "";
            }
            finderJointBusinessWithContextIDStruct.f9816g = finderJointBusinessWithContextIDStruct.mo86045b("EnterSourceUsername", str, true);
            finderJointBusinessWithContextIDStruct.mo86054n();
        }
    }

    /* renamed from: d3 */
    public final List<C58553c> mo12849d3() {
        if (mo12843J3()) {
            return C64197v.m75534c(this.f38073H, this.f38077L, this.f38081Q);
        }
        return C64197v.m75534c(this.f38066A);
    }

    /* renamed from: e3 */
    public final String mo12850e3() {
        return this.f38100p;
    }

    /* renamed from: f3 */
    public final int mo12851f3() {
        return this.f38096i;
    }

    /* renamed from: g3 */
    public final String mo12852g3() {
        return this.f38098n;
    }

    /* renamed from: i3 */
    public final C49712hj1 mo12853i3(int i) {
        C49712hj1 hj12 = new C49712hj1();
        hj12.f134677n = this.f38095h;
        hj12.f134670d = this.f38099o;
        hj12.f134671e = this.f38098n;
        hj12.f134672f = this.f38100p;
        hj12.f134676j = this.f38093f;
        hj12.f134673g = this.f38094g;
        hj12.f134675i = ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83328dc(i);
        hj12.f134680q = this.f38105t;
        hj12.f134678o = this.f38104s;
        hj12.f134679p = this.f38106u;
        String str = this.f38108w;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        hj12.f134687x = str;
        String str3 = this.f38107v;
        if (str3 == null) {
            str3 = str2;
        }
        hj12.f134681r = str3;
        String str4 = this.f38109x;
        if (str4 != null) {
            str2 = str4;
        }
        hj12.f134682s = str2;
        hj12.f134685v = this.f38097j;
        return hj12;
    }

    /* renamed from: j3 */
    public final C58556f mo12854j3(int i) {
        if (mo12843J3()) {
            return i == -1 ? mo12858n3(this.f38091d) : mo12858n3(i);
        }
        if (mo12846M3()) {
            return this.f38068C;
        }
        if (mo12847N3()) {
            return this.f38070E;
        }
        return null;
    }

    /* renamed from: k */
    public void mo5077k(int i, int i2, int i3, int i4) {
        int i5;
        C58403t k3;
        C7422c0 c0Var;
        Class cls = C58417y0.class;
        String str = f38062S0;
        Log.m105924i(str, "onFragmentChange " + i4);
        this.f38096i = ((C58417y0) C86312j.m106911c(cls)).mo83328dc(i4);
        this.f38091d = i4;
        if (i >= 0) {
            this.f38100p = f38060Q0.mo12869a(i4);
        }
        C49712hj1 i35 = mo12853i3(i4);
        if (i4 == 1) {
            C58368h1 h1Var = this.f38080P;
            if (h1Var != null) {
                h1Var.mo83246K1(i35);
            }
        } else if (i4 == 3) {
            C58403t tVar = this.f38076K;
            if (tVar != null) {
                tVar.mo83246K1(i35);
            }
        } else if (i4 == 4 && (c0Var = this.f38084T) != null) {
            c0Var.mo83246K1(i35);
        }
        if (this.f38088X) {
            Bundle bundle = ((FinderHomeUIC) C39818r.f106831a.mo62444c(getActivity()).mo75002a(FinderHomeUIC.class)).getActiveFragment().f17335p;
            i5 = bundle != null ? bundle.getInt("Source", 0) : 1;
        } else {
            this.f38088X = true;
            i5 = 6;
        }
        ((C58417y0) C86312j.m106911c(cls)).Zx0(i3, i4, i35, i5);
        if (i3 > 0 && (k3 = mo12855k3(i3)) != null && (k3 instanceof C58368h1)) {
            ((C58368h1) k3).mo83137a2(C58403t.f167322q.mo83248b(C90364q0.m113147f(new C13604l("feedActionType", 2), new C13604l("toTab", Integer.valueOf(i4)), new C13604l("fromTab", Integer.valueOf(i3)))), true);
        }
    }

    /* renamed from: k3 */
    public final C58403t mo12855k3(int i) {
        if (mo12843J3()) {
            return i == -1 ? mo12859o3(this.f38091d) : mo12859o3(i);
        }
        if (mo12846M3()) {
            return this.f38069D;
        }
        if (mo12847N3()) {
            return this.f38071F;
        }
        if (this.f38092e == 5) {
            return this.f38072G;
        }
        if (mo12844K3()) {
            return this.f38086V;
        }
        return null;
    }

    /* renamed from: l3 */
    public final C58553c mo12856l3(int i) {
        return i != 1 ? i != 3 ? i != 4 ? this.f38066A : this.f38081Q : this.f38073H : this.f38077L;
    }

    /* renamed from: m3 */
    public final C7322a mo12857m3(int i) {
        String str = f38062S0;
        Log.m105924i(str, "getHomeFeedEventSubscriber " + i);
        return i != 1 ? i != 3 ? i != 4 ? this.f38067B : this.f38082R : this.f38074I : this.f38078M;
    }

    /* renamed from: n3 */
    public final C58556f mo12858n3(int i) {
        String str = f38062S0;
        Log.m105924i(str, "getHomeFlowEventSubscriber " + i);
        return i != 1 ? i != 3 ? i != 4 ? this.f38068C : this.f38083S : this.f38075J : this.f38079N;
    }

    /* renamed from: o3 */
    public final C58403t mo12859o3(int i) {
        String str = f38062S0;
        Log.m105924i(str, "getHomeFlowReporter " + i);
        return i != 1 ? i != 3 ? i != 4 ? this.f38069D : this.f38084T : this.f38076K : this.f38080P;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 19999) {
            C49712hj1 i3 = mo12853i3(this.f38091d);
            C7335d c = C86312j.m106911c(C58417y0.class);
            C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
            ((C58417y0) c).Zx0(2, this.f38091d, i3, 0);
        }
    }

    public void onCreateAfter(Bundle bundle) {
        super.onCreateAfter(bundle);
        if (getActivity() instanceof FinderHomeUI) {
            C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
            String str = this.f38098n;
            if (str == null) {
                str = "";
            }
            y0Var.N40(str, "OnCreate");
            C58403t.C58405b bVar = C58403t.f167322q;
            C49712hj1 q3 = mo12861q3();
            String jSONObject = bVar.mo83249c(8, String.valueOf(getActivity().getIntent().getIntExtra("FROM_SCENE_KEY", 2))).toString();
            C87412m.m108593f(jSONObject, "FinderFeedFlowReporter.b…ORE_FRIEND)}\").toString()");
            C58403t.C58405b.m67757e(bVar, q3, 0, 8, jSONObject, 0, (C59838a) null, 48, (Object) null);
        }
        if (getActivity() instanceof FinderShareFeedRelUI) {
            C58403t.C58405b bVar2 = C58403t.f167322q;
            C49712hj1 q35 = mo12861q3();
            String jSONObject2 = bVar2.mo83249c(8, String.valueOf(getActivity().getIntent().getIntExtra("FROM_SCENE_KEY", 1))).toString();
            C87412m.m108593f(jSONObject2, "FinderFeedFlowReporter.b…ARE_DETAIL)}\").toString()");
            C58403t.C58405b.m67757e(bVar2, q35, 0, 8, jSONObject2, 0, (C59838a) null, 48, (Object) null);
        }
        C55012e1.f154468d.mo76066j();
        this.f38112y0.sendEmptyMessage(f38063T0);
    }

    public void onCreateBefore(Bundle bundle) {
        Class cls = C11266d.class;
        super.onCreateBefore(bundle);
        Fragment fragment = getFragment();
        MMFinderUI mMFinderUI = null;
        if (!(mo12845L3() || (getFragment() instanceof FinderActivityFragment) || (getFragment() instanceof FinderReportFragment) || (getFragment() instanceof FinderHomeTabFragment))) {
            fragment = null;
        }
        if (fragment != null) {
            Log.m105924i(f38062S0, "onCreateBefore fragment:" + getFragment());
            if (mo12845L3()) {
                mo12842I3(((C11266d) C86312j.m106911c(cls)).Nm0(getFragment()), ((C11266d) C86312j.m106911c(cls)).mo9182LB(getFragment()));
            } else if (getFragment() instanceof FinderActivityFragment) {
                mo12842I3(((FinderActivityFragment) fragment).mo2203R(), 3);
            } else if (getFragment() instanceof FinderReportFragment) {
                FinderReportFragment finderReportFragment = (FinderReportFragment) fragment;
                mo12842I3(finderReportFragment.mo3771S(), finderReportFragment.mo3772T());
            } else if (getFragment() instanceof FinderHomeTabFragment) {
                FinderHomeTabFragment finderHomeTabFragment = (FinderHomeTabFragment) fragment;
                if (finderHomeTabFragment.mo4179U() != 0) {
                    mo12842I3(finderHomeTabFragment.mo2203R(), finderHomeTabFragment.mo4179U());
                }
            }
        } else {
            Log.m105924i(f38062S0, "onCreateBefore activity:" + getActivity());
            AppCompatActivity activity = getActivity();
            if (getActivity() instanceof MMFinderUI) {
                mMFinderUI = activity;
            }
            if (mMFinderUI != null) {
                MMFinderUI mMFinderUI2 = mMFinderUI;
                mo12842I3(mMFinderUI2.mo2194I7(), mMFinderUI2.mo2937K7());
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C58403t k3 = mo12855k3(-1);
        C58378j1 j1Var = this.f38110x0;
        if (!(k3 == null || j1Var == null || !(k3 instanceof C58368h1))) {
            if (getActivity() instanceof FinderHomeUI) {
                ((C58368h1) k3).mo83136Z1(j1Var, C58403t.f167322q.mo83248b(C90363p0.m113143b(new C13604l("feedActionType", 5))), true);
            } else {
                ((C58368h1) k3).mo83136Z1(j1Var, C58403t.f167322q.mo83248b(C90363p0.m113143b(new C13604l("feedActionType", 58))), true);
            }
        }
        this.f38110x0 = null;
    }

    public void onFinished() {
        super.onFinished();
        C58403t k3 = mo12855k3(-1);
        C58378j1 j1Var = null;
        C58368h1 h1Var = k3 instanceof C58368h1 ? (C58368h1) k3 : null;
        if (h1Var != null) {
            j1Var = h1Var.f167172y;
        }
        this.f38110x0 = j1Var;
    }

    public void onPageScrollStateChanged(int i) {
        if (i == 0) {
            this.f38089Y = false;
        } else if (i == 1) {
            this.f38089Y = true;
        }
    }

    public void onPageScrolled(int i, float f, int i2) {
        if (this.f38089Y) {
            this.f38088X = false;
            this.f38089Y = false;
        }
    }

    public void onPause() {
        super.onPause();
        boolean z = true;
        if (mo12843J3()) {
            int i = this.f38091d;
            if (i == 1) {
                C7438g1 g1Var = this.f38079N;
                if (g1Var != null) {
                    g1Var.mo8584d();
                }
                C58368h1 h1Var = this.f38080P;
                if (h1Var != null) {
                    h1Var.mo8581J1();
                }
            } else if (i == 3) {
                C58556f fVar = this.f38075J;
                if (fVar != null) {
                    fVar.mo8584d();
                }
                C58403t tVar = this.f38076K;
                if (tVar != null) {
                    tVar.mo8581J1();
                }
            } else if (i == 4) {
                C7438g1 g1Var2 = this.f38083S;
                if (g1Var2 != null) {
                    g1Var2.mo8584d();
                }
                C7422c0 c0Var = this.f38084T;
                if (c0Var != null) {
                    c0Var.mo8581J1();
                }
            }
        } else if (mo12846M3()) {
            C7438g1 g1Var3 = this.f38068C;
            if (g1Var3 != null) {
                g1Var3.mo8584d();
            }
            C58368h1 h1Var2 = this.f38069D;
            if (h1Var2 != null) {
                h1Var2.mo8581J1();
            }
        } else if (mo12847N3()) {
            C7439h0 h0Var = this.f38070E;
            if (h0Var != null) {
                h0Var.mo8584d();
            }
            C58398q1 q1Var = this.f38071F;
            if (q1Var != null) {
                q1Var.mo8581J1();
            }
        } else {
            if (this.f38092e != 5) {
                z = false;
            }
            if (z) {
                C7459y1 y1Var = this.f38072G;
                if (y1Var != null) {
                    y1Var.f167332p = false;
                }
            } else if (mo12844K3()) {
                C7639h hVar = this.f38085U;
                if (hVar != null) {
                    MMHandlerThread.removeRunnable(hVar.f25944c);
                    BaseFinderFeed baseFinderFeed = hVar.f25945d;
                    if (baseFinderFeed != null) {
                        C7641j jVar = new C7641j(4);
                        jVar.f25948c = baseFinderFeed;
                        jVar.f25950e = hVar.f25943b;
                        jVar.f25949d = baseFinderFeed.getItemId();
                        hVar.f25943b = baseFinderFeed.getItemId();
                        hVar.mo8766a(jVar);
                    }
                    hVar.f25943b = -1;
                }
                C58353a0 a0Var = this.f38086V;
                if (a0Var != null) {
                    a0Var.mo8581J1();
                }
            }
        }
        for (WeakReference weakReference : this.f38101p0) {
            WxRecyclerAdapter wxRecyclerAdapter = (WxRecyclerAdapter) weakReference.get();
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.mo82614x6();
            }
        }
    }

    public void onPreDestroyed() {
        super.onPreDestroyed();
        Log.m105924i(f38062S0, "onPreDestroyed");
        if (getActivity() instanceof FinderHomeUI) {
            C58403t.C58405b.m67757e(C58403t.f167322q, mo12861q3(), 0, 9, "1", 0, (C59838a) null, 48, (Object) null);
            C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
            String str = this.f38098n;
            if (str == null) {
                str = "";
            }
            y0Var.N40(str, "Exit");
        }
        if (getActivity() instanceof FinderShareFeedRelUI) {
            C58403t.C58405b.m67757e(C58403t.f167322q, mo12861q3(), 0, 9, "1", 0, (C59838a) null, 48, (Object) null);
        }
        C58553c cVar = this.f38066A;
        if (cVar != null) {
            cVar.mo83452c();
        }
        C58553c cVar2 = this.f38073H;
        if (cVar2 != null) {
            cVar2.mo83452c();
        }
        C58553c cVar3 = this.f38077L;
        if (cVar3 != null) {
            cVar3.mo83452c();
        }
        C58553c cVar4 = this.f38081Q;
        if (cVar4 != null) {
            cVar4.mo83452c();
        }
        C7639h hVar = this.f38085U;
        if (hVar != null) {
            hVar.f25945d = null;
        }
        MMHandlerThread.postToMainThreadDelayed(C13444b.f38114d, 1000);
        this.f38112y0.removeCallbacksAndMessages((Object) null);
        this.f38112y0.sendEmptyMessage(f38064U0);
    }

    public void onResume() {
        super.onResume();
        boolean z = false;
        if (this.f38090Z) {
            this.f38090Z = false;
            return;
        }
        if (mo12843J3()) {
            C49712hj1 i3 = mo12853i3(this.f38091d);
            int i = this.f38091d;
            if (i == 1) {
                C58368h1 h1Var = this.f38080P;
                if (h1Var != null) {
                    h1Var.mo83246K1(i3);
                }
                C7438g1 g1Var = this.f38079N;
                if (g1Var != null) {
                    g1Var.mo83456e();
                }
                C58368h1 h1Var2 = this.f38080P;
                if (h1Var2 != null) {
                    h1Var2.mo83125L1();
                }
            } else if (i == 3) {
                C58403t tVar = this.f38076K;
                if (tVar != null) {
                    tVar.mo83246K1(i3);
                }
                C58556f fVar = this.f38075J;
                if (fVar != null) {
                    fVar.mo83456e();
                }
                C58403t tVar2 = this.f38076K;
                if (tVar2 != null) {
                    tVar2.mo83125L1();
                }
            } else if (i == 4) {
                C7422c0 c0Var = this.f38084T;
                if (c0Var != null) {
                    c0Var.mo83246K1(i3);
                }
                C7438g1 g1Var2 = this.f38083S;
                if (g1Var2 != null) {
                    g1Var2.mo83456e();
                }
                C7422c0 c0Var2 = this.f38084T;
                if (c0Var2 != null) {
                    c0Var2.mo83125L1();
                }
            }
            C2483o0.C2484a aVar = C2483o0.f12984a;
            aVar.mo2457g(1, mo12861q3(), this.f38091d, false);
            aVar.mo2456f(1, mo12861q3(), this.f38091d, false);
            aVar.mo2459i(1, mo12861q3(), this.f38091d, false);
            aVar.mo2458h(1, mo12861q3());
            aVar.mo2460j(1, mo12861q3(), "");
        } else if (mo12846M3()) {
            C7438g1 g1Var3 = this.f38068C;
            if (g1Var3 != null) {
                g1Var3.mo83456e();
            }
            C58368h1 h1Var3 = this.f38069D;
            if (h1Var3 != null) {
                h1Var3.mo83125L1();
            }
        } else if (mo12847N3()) {
            C7439h0 h0Var = this.f38070E;
            if (h0Var != null) {
                h0Var.mo83456e();
            }
            C58398q1 q1Var = this.f38071F;
            if (q1Var != null) {
                q1Var.f167332p = true;
            }
        } else {
            if (this.f38092e == 5) {
                z = true;
            }
            if (z) {
                C7459y1 y1Var = this.f38072G;
                if (y1Var != null) {
                    y1Var.f167332p = true;
                }
            } else if (mo12844K3()) {
                C7639h hVar = this.f38085U;
                if (hVar != null) {
                    MMHandlerThread.postToMainThreadDelayed(hVar.f25944c, 200);
                    BaseFinderFeed baseFinderFeed = hVar.f25945d;
                    if (baseFinderFeed != null) {
                        C7641j jVar = new C7641j(3);
                        jVar.f25948c = baseFinderFeed;
                        jVar.f25950e = hVar.f25943b;
                        jVar.f25949d = baseFinderFeed.getItemId();
                        hVar.f25943b = baseFinderFeed.getItemId();
                        hVar.mo8766a(jVar);
                    }
                }
                C58353a0 a0Var = this.f38086V;
                if (a0Var != null) {
                    a0Var.f167332p = true;
                }
            }
        }
        for (WeakReference weakReference : this.f38101p0) {
            WxRecyclerAdapter wxRecyclerAdapter = (WxRecyclerAdapter) weakReference.get();
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.mo82616y6();
            }
        }
    }

    public void onUserVisibleFocused() {
        super.onUserVisibleFocused();
        if (mo12847N3()) {
            C7439h0 h0Var = this.f38070E;
            if (h0Var != null) {
                h0Var.mo83456e();
            }
            C58398q1 q1Var = this.f38071F;
            if (q1Var != null) {
                q1Var.f167332p = true;
            }
        }
    }

    public void onUserVisibleUnFocused() {
        super.onUserVisibleUnFocused();
        if (mo12847N3()) {
            C7439h0 h0Var = this.f38070E;
            if (h0Var != null) {
                h0Var.mo8584d();
            }
            C58398q1 q1Var = this.f38071F;
            if (q1Var != null) {
                q1Var.mo8581J1();
            }
        }
    }

    /* renamed from: p3 */
    public void mo12860p3(Context context, Intent intent, long j, String str, int i, int i2, boolean z) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intent");
        C13443a.m12791e(f38060Q0, context, intent, j, str, i, i2, z, 0, 128, (Object) null);
    }

    /* renamed from: q3 */
    public C49712hj1 mo12861q3() {
        if (mo12843J3()) {
            return mo12853i3(((FinderHomeUIC) C39818r.f106831a.mo62444c(getActivity()).mo75002a(FinderHomeUIC.class)).mo5128d3());
        }
        C49712hj1 hj12 = new C49712hj1();
        hj12.f134677n = this.f38095h;
        hj12.f134675i = this.f38096i;
        hj12.f134670d = this.f38099o;
        hj12.f134671e = this.f38098n;
        hj12.f134672f = this.f38100p;
        hj12.f134676j = this.f38093f;
        hj12.f134673g = this.f38094g;
        hj12.f134680q = this.f38105t;
        hj12.f134678o = this.f38104s;
        hj12.f134679p = this.f38106u;
        String str = this.f38108w;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        hj12.f134687x = str;
        String str3 = this.f38107v;
        if (str3 == null) {
            str3 = str2;
        }
        hj12.f134681r = str3;
        String str4 = this.f38109x;
        if (str4 != null) {
            str2 = str4;
        }
        hj12.f134682s = str2;
        hj12.f134684u = this.f38091d;
        hj12.f134685v = this.f38097j;
        hj12.f134686w = this.f38111y;
        return hj12;
    }

    /* renamed from: r3 */
    public void mo12862r3(String str) {
        this.f38098n = str;
    }

    /* renamed from: s3 */
    public void mo12863s3(String str) {
        this.f38100p = str;
    }

    /* renamed from: t3 */
    public int mo12864t3() {
        return this.f38096i;
    }

    /* renamed from: u3 */
    public void mo12865u3(String str) {
        if (str == null || str.length() == 0) {
            this.f38103r = "{}";
        } else {
            this.f38103r = str;
        }
    }

    /* renamed from: v */
    public void mo5078v(boolean z, int i, FinderHomeTabFragment finderHomeTabFragment) {
        C87412m.m108594g(finderHomeTabFragment, "fragment");
        if (z) {
            C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11739f.class);
            C87412m.m108593f(a, "UICProvider.of(FinderCom…meTabStateVM::class.java)");
            C11739f fVar = (C11739f) a;
            boolean z2 = this.f38087W && fVar.mo11602e3() == finderHomeTabFragment.f17334o;
            int i2 = 2;
            if (!fVar.mo11603f3(finderHomeTabFragment.f17334o)) {
                i2 = 3;
            }
            C49712hj1 i3 = mo12853i3(finderHomeTabFragment.f17334o);
            int i4 = finderHomeTabFragment.f17334o;
            if (i4 == 1) {
                C7438g1 g1Var = this.f38079N;
                if (g1Var != null) {
                    g1Var.mo83456e();
                }
                C58368h1 h1Var = this.f38080P;
                if (h1Var != null) {
                    h1Var.mo83125L1();
                }
                C58556f fVar2 = this.f38075J;
                if (fVar2 != null) {
                    fVar2.mo8584d();
                }
                C58403t tVar = this.f38076K;
                if (tVar != null) {
                    tVar.mo8581J1();
                }
                C7438g1 g1Var2 = this.f38083S;
                if (g1Var2 != null) {
                    g1Var2.mo8584d();
                }
                C7422c0 c0Var = this.f38084T;
                if (c0Var != null) {
                    c0Var.mo8581J1();
                }
                C2483o0.f12984a.mo2457g(i2, i3, this.f38091d, z2);
            } else if (i4 == 3) {
                C58556f fVar3 = this.f38075J;
                if (fVar3 != null) {
                    fVar3.mo83456e();
                }
                C58403t tVar2 = this.f38076K;
                if (tVar2 != null) {
                    tVar2.mo83125L1();
                }
                C7438g1 g1Var3 = this.f38079N;
                if (g1Var3 != null) {
                    g1Var3.mo8584d();
                }
                C58368h1 h1Var2 = this.f38080P;
                if (h1Var2 != null) {
                    h1Var2.mo8581J1();
                }
                C7438g1 g1Var4 = this.f38083S;
                if (g1Var4 != null) {
                    g1Var4.mo8584d();
                }
                C7422c0 c0Var2 = this.f38084T;
                if (c0Var2 != null) {
                    c0Var2.mo8581J1();
                }
                C2483o0.f12984a.mo2456f(i2, i3, this.f38091d, z2);
            } else if (i4 == 4) {
                C7438g1 g1Var5 = this.f38083S;
                if (g1Var5 != null) {
                    g1Var5.mo83456e();
                }
                C7422c0 c0Var3 = this.f38084T;
                if (c0Var3 != null) {
                    c0Var3.mo83125L1();
                }
                C7438g1 g1Var6 = this.f38079N;
                if (g1Var6 != null) {
                    g1Var6.mo8584d();
                }
                C58368h1 h1Var3 = this.f38080P;
                if (h1Var3 != null) {
                    h1Var3.mo8581J1();
                }
                C58556f fVar4 = this.f38075J;
                if (fVar4 != null) {
                    fVar4.mo8584d();
                }
                C58403t tVar3 = this.f38076K;
                if (tVar3 != null) {
                    tVar3.mo8581J1();
                }
                C2483o0.f12984a.mo2459i(i2, i3, this.f38091d, z2);
            }
            this.f38087W = false;
        }
    }

    /* renamed from: v3 */
    public String mo12866v3() {
        return this.f38098n;
    }

    /* renamed from: y3 */
    public C58553c mo12867y3(int i) {
        return mo12843J3() ? i == -1 ? mo12856l3(this.f38091d) : mo12856l3(i) : this.f38066A;
    }

    /* renamed from: z3 */
    public String mo12868z3() {
        return this.f38103r;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13442s8(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
        f38060Q0.getClass();
        this.f38112y0 = new C13445c(this, f38061R0);
    }
}
