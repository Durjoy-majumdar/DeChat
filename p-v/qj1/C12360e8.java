package qj1;

import a14.C53934p0;
import ak1.C0076j0;
import ak1.C54067f0;
import ak1.C54116w;
import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0120a0;
import bl3.C39818r;
import cj1.C0639y1;
import cl1.C0657g1;
import cl1.C0700z;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveGiftSendBtn;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.xweb.WCWebUpdater;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import dj1.C58291w0;
import eb0.C31543z5;
import er1.C58739j4;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import gg1.C32444a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60172g4;
import ig1.C8916d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import je1.C46523h2;
import ks3.C10409j;
import m53.C10757d;
import nj3.C76912y0;
import nk1.C11198f;
import nk1.C11207i;
import nk1.C61788m;
import o40.C61926c;
import ok1.C62042e;
import org.json.JSONObject;
import pe3.C89349b;
import qj1.C12666si;
import qo3.C77398g;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C64186f0;
import sx3.C64197v;
import te3.C48770aw0;
import te3.C49712hj1;
import te3.C49765hx0;
import te3.C50037ju0;
import te3.C50643o71;
import te3.C50792p71;
import te3.C50923q71;
import te3.C51548uh3;
import te3.C51600uu3;
import te3.C51769w11;
import te3.C52013xs0;
import up1.C37521f;
import wx3.C15601d;
import wx3.C66212f;
import zc1.C66785b;

/* renamed from: qj1.e8 */
public final class C12360e8 extends C62660c {

    /* renamed from: T */
    public static final C12365c f35587T = new C12365c((C8480h) null);

    /* renamed from: A */
    public final Map<String, Integer> f35588A;

    /* renamed from: B */
    public final Map<String, Boolean> f35589B;

    /* renamed from: C */
    public C11198f.C11199a f35590C;

    /* renamed from: D */
    public FinderLiveGiftSendBtn f35591D;

    /* renamed from: E */
    public C11198f f35592E;

    /* renamed from: F */
    public C12371d f35593F;

    /* renamed from: G */
    public C10757d f35594G;

    /* renamed from: H */
    public String f35595H;

    /* renamed from: I */
    public boolean f35596I;

    /* renamed from: J */
    public String f35597J;

    /* renamed from: K */
    public C77398g f35598K;

    /* renamed from: L */
    public volatile boolean f35599L;

    /* renamed from: M */
    public boolean f35600M;

    /* renamed from: N */
    public boolean f35601N;

    /* renamed from: P */
    public int f35602P;

    /* renamed from: Q */
    public C0657g1.C0660c f35603Q;

    /* renamed from: R */
    public int f35604R;

    /* renamed from: S */
    public C12666si f35605S;

    /* renamed from: p */
    public final C58124b f35606p;

    /* renamed from: q */
    public final Object f35607q;

    /* renamed from: r */
    public String f35608r;

    /* renamed from: s */
    public String f35609s;

    /* renamed from: t */
    public String f35610t;

    /* renamed from: u */
    public C0700z.C0701a f35611u;

    /* renamed from: v */
    public boolean f35612v;

    /* renamed from: w */
    public boolean f35613w;

    /* renamed from: x */
    public boolean f35614x;

    /* renamed from: y */
    public LinkedList<C51548uh3> f35615y;

    /* renamed from: z */
    public LinkedList<Long> f35616z = new LinkedList<>();

    /* renamed from: qj1.e8$a */
    public static final class C12361a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f35617d;

        public C12361a(ViewGroup viewGroup) {
            this.f35617d = viewGroup;
        }

        public final void run() {
            ViewGroup.LayoutParams layoutParams = this.f35617d.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += C75044y4.m89991c(this.f35617d.getContext());
        }
    }

    /* renamed from: qj1.e8$b */
    public static final class C12362b implements C11198f.C11199a {

        /* renamed from: a */
        public final /* synthetic */ C12360e8 f35618a;

        /* renamed from: b */
        public final /* synthetic */ ViewGroup f35619b;

        /* renamed from: qj1.e8$b$a */
        public /* synthetic */ class C12363a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f35620a;

            static {
                int[] iArr = new int[C11198f.C11201b.values().length];
                iArr[0] = 1;
                f35620a = iArr;
            }
        }

        /* renamed from: qj1.e8$b$b */
        public static final class C12364b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C12360e8 f35621d;

            /* renamed from: e */
            public final /* synthetic */ C11198f.C11201b f35622e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C12364b(C12360e8 e8Var, int i, C11198f.C11201b bVar) {
                super(0);
                this.f35621d = e8Var;
                this.f35622e = bVar;
            }

            public Object invoke() {
                C12360e8 e8Var = this.f35621d;
                C11198f.C11201b bVar = this.f35622e;
                e8Var.getClass();
                boolean z = false;
                C0639y1.f1510a.mo614f(e8Var.f35608r, false);
                if (e8Var.f35608r != null) {
                    Object obj = e8Var.f35607q;
                    if (obj instanceof Vibrator) {
                        ((Vibrator) obj).vibrate(50);
                    }
                    C61926c.m72698w(e8Var.f35591D.f15262j);
                    FinderLiveGiftSendBtn finderLiveGiftSendBtn = e8Var.f35591D;
                    if (bVar == C11198f.C11201b.LONG_CLICK) {
                        z = true;
                    }
                    finderLiveGiftSendBtn.mo3285b(z);
                }
                return C13598b0.f38549a;
            }
        }

        public C12362b(C12360e8 e8Var, ViewGroup viewGroup) {
            this.f35618a = e8Var;
            this.f35619b = viewGroup;
        }

        /* renamed from: a */
        public boolean mo11286a(View view, int i, int i2, C11198f.C11201b bVar, String str, boolean z, boolean z2) {
            int i3 = i2;
            C11198f.C11201b bVar2 = bVar;
            String str2 = str;
            boolean z3 = z;
            boolean z4 = z2;
            Class cls = C54991o.class;
            C87412m.m108594g(bVar2, "state");
            C87412m.m108594g(str2, "comboId");
            Log.m105924i("Finder.FinderLiveGiftSendPlugin", "batchCallback on " + bVar2 + ", clickCnt:" + i + ", diffCnt is " + i3 + ", comboId is " + str2 + ", needCheckBalance:" + z3 + ", networkEnable:" + this.f35618a.f35599L + " isFromPatchSend: " + z4);
            if (C12363a.f35620a[bVar.ordinal()] == 1) {
                C12360e8 e8Var = this.f35618a;
                if (e8Var.f35601N) {
                    C58124b bVar3 = e8Var.f35606p;
                    C58124b.C58125b bVar4 = C58124b.C58125b.FINDER_LIVE_MEMBERS_AUTO_REFRESH;
                    Bundle bundle = new Bundle();
                    bundle.putInt("PARAM_FINDER_LIVE_MEMBER_LIST_AUTOREFRESH_VALUE", e8Var.f35602P);
                    C13598b0 b0Var = C13598b0.f38549a;
                    bVar3.statusChange(bVar4, bundle);
                }
                C12360e8 e8Var2 = this.f35618a;
                e8Var2.getClass();
                C61926c.m72668M(new C12439h8(e8Var2));
                return true;
            }
            String str3 = this.f35618a.f35608r;
            C0639y1 y1Var = C0639y1.f1510a;
            y1Var.mo614f(str3, false);
            C8916d d = y1Var.mo612d(str3);
            if (str3 == null || d == null) {
                C12360e8 e8Var3 = this.f35618a;
                e8Var3.getClass();
                C61926c.m72668M(new C12500l8((String) null, e8Var3));
                this.f35618a.mo12053f1();
                return false;
            }
            if (z3) {
                int i4 = (int) d.field_price;
                long j = ((C54991o) this.f35618a.mo87696x0(cls)).f154258T1;
                int ceil = (j >= 0 || i4 <= 0) ? i3 : i3 - ((int) Math.ceil((((double) (-j)) * 1.0d) / ((double) i4)));
                if (!this.f35618a.mo12050b1(i4, false)) {
                    Log.m105924i("Finder.FinderLiveGiftSendPlugin", "batchCallback quota disable, safeDiffCnt - 1");
                    ceil--;
                }
                int i5 = ceil;
                Log.m105924i("Finder.FinderLiveGiftSendPlugin", "batchCallback price = " + i4 + ", realTimeBalance = " + j + ", safeDiffCnt = " + i5);
                if (i5 > 0) {
                    C12360e8.m11920e1(this.f35618a, str3, i5, str, false, false, 24, (Object) null);
                }
            } else {
                int i6 = z4 ? i3 : 1;
                int i7 = ((int) d.field_price) * i6;
                C11198f fVar = this.f35618a.f35592E;
                boolean z5 = fVar != null ? fVar.f33024m : true;
                Log.m105924i("Finder.FinderLiveGiftSendPlugin", "batchCallback quota batchCount: " + i6 + ", totalPrice: " + i7 + "  curBalance: " + ((C54991o) this.f35618a.mo87696x0(cls)).f154258T1 + "isCurrentSingleClickEnable: " + z5);
                if (z5) {
                    C12360e8.m11920e1(this.f35618a, str3, i2, str, false, z2, 8, (Object) null);
                }
            }
            return true;
        }

        /* renamed from: b */
        public void mo11287b(MotionEvent motionEvent) {
            C87412m.m108594g(motionEvent, "event");
            FinderLiveGiftSendBtn finderLiveGiftSendBtn = this.f35618a.f35591D;
            C61926c.m72667L(finderLiveGiftSendBtn.f15257e, finderLiveGiftSendBtn.f15262j);
        }

        /* renamed from: c */
        public boolean mo11288c(View view, int i, C11198f.C11201b bVar, String str, int i2, boolean z) {
            Class cls;
            boolean z2;
            C10409j jVar;
            Class cls2;
            C8916d dVar;
            Class<C55001u> cls3;
            int i3;
            Class<C55001u> cls4;
            boolean z3;
            Class cls5;
            int i4 = i;
            String str2 = str;
            int i5 = i2;
            boolean z4 = z;
            C54067f0.C54076o0 o0Var = C54067f0.C54076o0.LIVING_SING_SONG;
            Class cls6 = C54116w.class;
            Class<C55001u> cls7 = C55001u.class;
            Class cls8 = C54991o.class;
            C87412m.m108594g(bVar, "state");
            C87412m.m108594g(str2, "comboId");
            C8916d d = C0639y1.f1510a.mo612d(this.f35618a.f35608r);
            if (d != null) {
                int i6 = z4 ? i5 : 1;
                int i7 = ((int) d.field_price) * i6;
                long j = (long) i7;
                boolean z5 = ((C54991o) this.f35618a.mo87696x0(cls8)).f154258T1 >= j;
                C12360e8 e8Var = this.f35618a;
                if (!e8Var.f35614x) {
                    C54991o oVar = (C54991o) e8Var.mo87696x0(cls8);
                    cls3 = cls7;
                    dVar = d;
                    oVar.mo76019q4(oVar.f154258T1 - j);
                } else {
                    cls3 = cls7;
                    dVar = d;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("instantCallback batchCount: ");
                sb.append(i6);
                sb.append(" giftPrice: ");
                sb.append(i7);
                sb.append(" cur: ");
                sb.append(((C54991o) this.f35618a.mo87696x0(cls8)).f154258T1);
                sb.append(" diffCnt:");
                int i8 = i2;
                sb.append(i8);
                sb.append(", lastCnt: ");
                sb.append(this.f35618a.f35604R);
                sb.append(" haveEnoughBalanceToConsume:");
                sb.append(z5);
                sb.append(", clickCnt:");
                sb.append(i4);
                sb.append(", isFromPkg:");
                sb.append(this.f35618a.f35614x);
                Log.m105924i("Finder.FinderLiveGiftSendPlugin", sb.toString());
                String str3 = this.f35618a.f35609s;
                if (!(str3 == null || str3.length() == 0)) {
                    if (this.f35618a.f35612v) {
                        C7335d c = C86312j.m106911c(cls6);
                        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
                        C54116w wVar = (C54116w) c;
                        JSONObject jSONObject = new JSONObject();
                        C12360e8 e8Var2 = this.f35618a;
                        jSONObject.put("type", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN);
                        String str4 = e8Var2.f35609s;
                        if (str4 == null) {
                            str4 = "";
                        }
                        jSONObject.put("music_name", str4);
                        jSONObject.put("gift_id", e8Var2.f35608r);
                        jSONObject.put("gift_count", i8 - e8Var2.f35604R);
                        C13598b0 b0Var = C13598b0.f38549a;
                        cls4 = cls3;
                        i3 = i7;
                        z3 = true;
                        C54116w.Ex0(wVar, o0Var, jSONObject.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
                    } else {
                        cls4 = cls3;
                        i3 = i7;
                        z3 = true;
                        C7335d c2 = C86312j.m106911c(cls6);
                        C87412m.m108593f(c2, "getService(HellLiveVisitorReoprter::class.java)");
                        C54116w wVar2 = (C54116w) c2;
                        JSONObject jSONObject2 = new JSONObject();
                        C12360e8 e8Var3 = this.f35618a;
                        jSONObject2.put("type", "3");
                        String str5 = e8Var3.f35609s;
                        if (str5 == null) {
                            str5 = "";
                        }
                        jSONObject2.put("music_name", str5);
                        jSONObject2.put("gift_id", e8Var3.f35608r);
                        jSONObject2.put("gift_count", i8);
                        C13598b0 b0Var2 = C13598b0.f38549a;
                        C54116w.Ex0(wVar2, o0Var, jSONObject2.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
                        this.f35618a.f35612v = true;
                    }
                    this.f35618a.f35604R = i8;
                } else {
                    cls4 = cls3;
                    i3 = i7;
                    z3 = true;
                }
                C12360e8 e8Var4 = this.f35618a;
                if (e8Var4.f35614x) {
                    Long l = (Long) C110818d0.m150925W(e8Var4.f35616z);
                    z5 = (l != null ? l.longValue() : 0) >= ((long) i8);
                }
                if (z5) {
                    int i9 = i3;
                    if (this.f35618a.mo12050b1(i9, z3)) {
                        ((C0657g1) this.f35618a.mo87696x0(C0657g1.class)).f1555g += ((float) i9) / 10.0f;
                        C12360e8 e8Var5 = this.f35618a;
                        e8Var5.f35591D.setMCurGiftId(e8Var5.f35608r);
                        C12360e8 e8Var6 = this.f35618a;
                        String str6 = e8Var6.f35595H;
                        String str7 = e8Var6.f35608r;
                        if (str7 == null) {
                            str7 = "";
                        }
                        C12365c.C12366a c1 = e8Var6.mo12051c1(str6, str7, z4);
                        if (dVar.mo9724o2()) {
                            C12360e8 e8Var7 = this.f35618a;
                            e8Var7.f35610t = str2;
                            C12666si siVar = e8Var7.f35605S;
                            if (siVar != null) {
                                C50792p71 p712 = new C50792p71();
                                ViewGroup viewGroup = this.f35619b;
                                C12360e8 e8Var8 = this.f35618a;
                                C39818r rVar = C39818r.f106831a;
                                Context context = viewGroup.getContext();
                                C87412m.m108593f(context, "root.context");
                                p712.f139616d = C46523h2.f125330a.mo71860b(11809, ((C60172g4) rVar.mo62443b(context).mo62447c(C60172g4.class)).mo12861q3());
                                p712.f139617e = C66785b.f191882e.mo90662O5();
                                String str8 = e8Var8.f35595H;
                                p712.f139618f = str8;
                                if (str8.length() == 0) {
                                    p712.f139618f = ((C54991o) e8Var8.mo87696x0(cls8)).f154345o;
                                }
                                Class<C55001u> cls9 = cls4;
                                p712.f139619g = C89349b.m111674a(((C55001u) e8Var8.mo87696x0(cls9)).f154417n);
                                p712.f139620h = ((C55001u) e8Var8.mo87696x0(cls9)).f154416j;
                                p712.f139621i = ((C55001u) e8Var8.mo87696x0(cls9)).f154420q.f182392d;
                                p712.f139622j = e8Var8.f35608r;
                                p712.f139623n = z3 ? 1 : 0;
                                C8916d dVar2 = dVar;
                                p712.f139624o = (int) dVar2.field_price;
                                p712.f139625p = 0;
                                C13598b0 b0Var3 = C13598b0.f38549a;
                                String str9 = dVar2.field_rewardProductId;
                                Log.m105924i(siVar.f36268b, "onInstantClick req:" + p712.hashCode() + ", giftId:" + str9 + ", comboId:" + str2);
                                C12666si.C12667a aVar = new C12666si.C12667a(dVar2, (C50923q71) null);
                                synchronized (siVar) {
                                    siVar.f36269c.add(aVar);
                                    C12365c.C12366a aVar2 = c1;
                                    cls5 = cls8;
                                    siVar.f36271e.add(C11207i.m11072h(siVar.f36267a, (C66212f) null, (C53934p0) null, new C12686ti(p712, siVar, str9, aVar, str, aVar2, (C15601d<? super C12686ti>) null), 3, (Object) null));
                                }
                                cls = cls5;
                            } else {
                                cls = cls8;
                            }
                        } else {
                            cls = cls8;
                            C12360e8 e8Var9 = this.f35618a;
                            e8Var9.f35610t = str2;
                            C12360e8.f35587T.mo12056a(e8Var9.f35608r, i, str, i2, z, c1, (List<? extends C51769w11>) null);
                        }
                        C61926c.m72668M(new C12364b(this.f35618a, i4, bVar));
                        jVar = C10409j.success;
                        z2 = true;
                        ((C54991o) this.f35618a.mo87696x0(cls)).f154263U1.postValue(jVar);
                        return z2;
                    }
                    cls2 = cls8;
                    C12360e8 e8Var10 = this.f35618a;
                    String str10 = e8Var10.f35608r;
                    if (str10 == null) {
                        str10 = "";
                    }
                    e8Var10.f35603Q = new C0657g1.C0660c(str10, i, str, i2, z);
                    this.f35618a.mo12053f1();
                    jVar = C10409j.quotaIntercept;
                } else {
                    cls2 = cls8;
                    Log.m105924i("Finder.FinderLiveGiftSendPlugin", "instantCallback no haveEnoughBalanceToConsume cnt:" + i4 + ",curBalance:" + ((C54991o) this.f35618a.mo87696x0(cls2)).f154258T1 + ", diffCnt:" + i8 + ", price:" + i3);
                    this.f35618a.mo12053f1();
                    C12360e8 e8Var11 = this.f35618a;
                    if (e8Var11.f35614x) {
                        Log.m105924i("Finder.FinderLiveGiftSendPlugin", "[dealwithOnePkgGiftAllSend] curGiftId = " + e8Var11.f35608r);
                        C76912y0.m92769h(e8Var11.f166287d.getContext(), e8Var11.f166287d.getContext().getString(C0966R.string.n8k), C0966R.raw.icons_filled_error);
                        C0639y1.f1519j.remove(e8Var11.f35608r);
                        C0639y1.f1518i.remove(e8Var11.f35608r);
                        jVar = C10409j.pkgGiftEmpty;
                    } else {
                        C12360e8.m11919Z0(e8Var11, str2);
                        jVar = C10409j.noEnoughWecoin;
                    }
                }
            } else {
                cls2 = cls8;
                Log.m105924i("Finder.FinderLiveGiftSendPlugin", "instantCallback giftInfo empty,curBalance:" + ((C54991o) this.f35618a.mo87696x0(cls2)).f154258T1 + ", cnt:" + i4 + ",comboId:" + str2 + ", diffCnt:" + i5);
                jVar = C10409j.invaildGift;
            }
            z2 = false;
            ((C54991o) this.f35618a.mo87696x0(cls)).f154263U1.postValue(jVar);
            return z2;
        }
    }

    /* renamed from: qj1.e8$c */
    public static final class C12365c {

        /* renamed from: qj1.e8$c$a */
        public static final class C12366a {

            /* renamed from: a */
            public final C45795b f35623a;

            /* renamed from: b */
            public final String f35624b;

            /* renamed from: c */
            public final C50643o71 f35625c;

            public C12366a(C45795b bVar, String str, C50643o71 o712) {
                C87412m.m108594g(bVar, "buContext");
                C87412m.m108594g(str, "sendGiftTargetUserName");
                C87412m.m108594g(o712, "giftExtInfo");
                this.f35623a = bVar;
                this.f35624b = str;
                this.f35625c = o712;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C12366a)) {
                    return false;
                }
                C12366a aVar = (C12366a) obj;
                return C87412m.m108589b(this.f35623a, aVar.f35623a) && C87412m.m108589b(this.f35624b, aVar.f35624b) && C87412m.m108589b(this.f35625c, aVar.f35625c);
            }

            public int hashCode() {
                return (((this.f35623a.hashCode() * 31) + this.f35624b.hashCode()) * 31) + this.f35625c.hashCode();
            }

            public String toString() {
                return "LocalGiftMsgParams(buContext=" + this.f35623a + ", sendGiftTargetUserName=" + this.f35624b + ", giftExtInfo=" + this.f35625c + ')';
            }
        }

        /* renamed from: qj1.e8$c$b */
        public static final class C12367b extends C87413o implements C32226l<C51769w11, CharSequence> {

            /* renamed from: d */
            public static final C12367b f35626d = new C12367b();

            public C12367b() {
                super(1);
            }

            public Object invoke(Object obj) {
                C51769w11 w112 = (C51769w11) obj;
                C87412m.m108594g(w112, LocaleUtil.ITALIAN);
                StringBuilder sb = new StringBuilder();
                String str = w112.f143810d;
                if (str == null) {
                    str = "";
                }
                sb.append(str);
                sb.append(',');
                return sb.toString();
            }
        }

        public C12365c(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo12056a(String str, int i, String str2, int i2, boolean z, C12366a aVar, List<? extends C51769w11> list) {
            String str3;
            C50643o71 o712;
            String str4;
            LinkedList<C48770aw0> linkedList;
            int i3;
            String str5 = str;
            int i4 = i;
            String str6 = str2;
            int i5 = i2;
            boolean z2 = z;
            C12366a aVar2 = aVar;
            Class cls = C54991o.class;
            C87412m.m108594g(aVar2, "localGiftMsgParams");
            C45795b bVar = aVar2.f35623a;
            String str7 = aVar2.f35624b;
            C50643o71 o713 = aVar2.f35625c;
            Log.m105924i("Finder.FinderLiveGiftSendPlugin", "addLocalGiftMsg giftId: " + str5 + " diffCnt: " + i5 + " isFromPatchSend: " + z2 + " comboId: " + str6);
            if (list == null || !(!list.isEmpty())) {
                str4 = "Finder.FinderLiveGiftSendPlugin";
                o712 = o713;
                str3 = str7;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("addLocalGiftMsg random gift, animation id:");
                o712 = o713;
                str3 = str7;
                StringBuilder sb4 = sb;
                sb4.append(C110818d0.m150921S(list, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C12367b.f35626d, 31, (Object) null));
                String sb5 = sb4.toString();
                str4 = "Finder.FinderLiveGiftSendPlugin";
                Log.m105924i(str4, sb5);
            }
            C0639y1 y1Var = C0639y1.f1510a;
            boolean e = y1Var.mo613e(str5);
            C8916d d = y1Var.mo612d(str5);
            if (d != null) {
                C52013xs0 xs02 = new C52013xs0();
                C50037ju0 ju02 = new C50037ju0();
                ju02.f136329d = d.field_rewardProductId;
                C51600uu3 uu32 = new C51600uu3();
                uu32.f143147d = C89349b.m111674a(o712.toByteArray());
                uu32.f143148e = 0;
                ju02.f136337o = uu32;
                ju02.f136338p.addAll(list != null ? list : C64186f0.f181907d);
                xs02.f144906h = C89349b.m111674a(ju02.toByteArray());
                C49765hx0 hx02 = new C49765hx0();
                LinkedList<C48770aw0> linkedList2 = ((C54991o) bVar.mo71262a(cls)).f154320h;
                if (linkedList2 != null) {
                    ArrayList arrayList = new ArrayList();
                    for (T next : linkedList2) {
                        if (((C48770aw0) next).f130789d != 4) {
                            arrayList.add(next);
                        }
                    }
                    linkedList = new LinkedList<>(arrayList);
                } else {
                    linkedList = null;
                }
                hx02.f134930r = linkedList;
                C62042e eVar = C62042e.f176370a;
                hx02.f134919d = eVar.mo87050W(bVar);
                hx02.f134926n = eVar.mo87036R();
                xs02.f144914s = hx02;
                xs02.f144903e = 20009;
                C61788m.C11208b bVar2 = new C61788m.C11208b(xs02);
                bVar2.f33044h = str6;
                if (z2) {
                    bVar2.f33045i = 0;
                    bVar2.f33046j = i4;
                    i3 = 1;
                } else {
                    bVar2.f33045i = i4;
                    i3 = 1;
                    bVar2.f33046j = 1;
                }
                bVar2.f33041e = bVar2.f33045i > i3 ? e ? C61788m.C11209c.SELF_PRECIOUS_GIFT_COMBO : C61788m.C11209c.SELF_NORMAL_GIFT_COMBO : e ? C61788m.C11209c.SELF_PRECIOUS_GIFT_SOLO : C61788m.C11209c.SELF_NORMAL_GIFT_SOLO;
                String str8 = str3.length() == 0 ? ((C54991o) bVar.mo71262a(cls)).f154345o : str3;
                C87412m.m108594g(str8, "<set-?>");
                bVar2.f33051r = str8;
                Log.m105924i(str4, "addLocalGiftMsg local add GiftShowInfo:" + bVar2 + ",diffCnt:" + i5);
                ((C54991o) bVar.mo71262a(cls)).f154316g.mo86704b(bVar2);
                return;
            }
            Log.m105924i(str4, "addLocalGiftMsg giftInfo is null,giftId:" + str5 + ",cnt:" + i4 + ",comboId:" + str6 + ",diffCnt:" + i5);
        }
    }

    /* renamed from: qj1.e8$e */
    public static final class C12368e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12360e8 f35627d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12368e(C12360e8 e8Var) {
            super(0);
            this.f35627d = e8Var;
        }

        public Object invoke() {
            C12360e8 e8Var = this.f35627d;
            C11198f fVar = e8Var.f35592E;
            if (fVar != null) {
                fVar.mo11284d(e8Var.f35591D);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.e8$f */
    public static final class C12369f<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C12360e8 f35628d;

        public C12369f(C12360e8 e8Var) {
            this.f35628d = e8Var;
        }

        public void onChanged(Object obj) {
            C0657g1.C0661d dVar = (C0657g1.C0661d) obj;
            Log.m105924i("Finder.FinderLiveGiftSendPlugin", "receive restrictEvent: " + dVar + " quotaSendGiftData: " + this.f35628d.f35603Q);
            C12360e8 e8Var = this.f35628d;
            C0657g1.C0660c cVar = e8Var.f35603Q;
            if (cVar != null) {
                if (dVar instanceof C0657g1.C0659b) {
                    e8Var.mo12053f1();
                    return;
                }
                if (dVar instanceof C0657g1.C0662e ? true : dVar instanceof C0657g1.C0658a) {
                    C11198f fVar = e8Var.f35592E;
                    if (fVar != null) {
                        fVar.f33024m = true;
                    }
                    String str = cVar.f1563c;
                    e8Var.f35610t = str;
                    C12365c cVar2 = C12360e8.f35587T;
                    String str2 = cVar.f1561a;
                    int i = cVar.f1562b;
                    int i2 = cVar.f1564d;
                    boolean z = cVar.f1565e;
                    cVar2.mo12056a(str2, i, str, i2, z, e8Var.mo12051c1(e8Var.f35595H, str2, z), (List<? extends C51769w11>) null);
                    C12360e8.m11920e1(e8Var, cVar.f1561a, cVar.f1562b, cVar.f1563c, cVar.f1565e, false, 16, (Object) null);
                }
            }
        }
    }

    /* renamed from: qj1.e8$g */
    public static final class C12370g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12360e8 f35629d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12370g(C12360e8 e8Var) {
            super(0);
            this.f35629d = e8Var;
        }

        public Object invoke() {
            this.f35629d.mo3207l0();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.e8$d */
    public interface C12371d {

        /* renamed from: qj1.e8$d$a */
        public static final class C12372a {
            /* renamed from: a */
            public static /* synthetic */ void m11940a(C12371d dVar, boolean z, int i, C12373b bVar, String str, Long l, int i2, String str2, String str3, C58291w0 w0Var, int i3, Object obj) {
                int i4 = i3;
                if (obj == null) {
                    dVar.mo9974a(z, i, bVar, str, (i4 & 16) != 0 ? null : l, i2, str2, (i4 & 128) != 0 ? null : str3, (i4 & 256) != 0 ? null : w0Var);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendGiftCallback");
            }
        }

        /* renamed from: qj1.e8$d$b */
        public enum C12373b {
            OK,
            NETWORK,
            WECOIN
        }

        /* renamed from: a */
        void mo9974a(boolean z, int i, C12373b bVar, String str, Long l, int i2, String str2, String str3, C58291w0 w0Var);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12360e8(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f35606p = bVar;
        this.f35607q = viewGroup.getContext().getSystemService("vibrator");
        this.f35591D = (FinderLiveGiftSendBtn) viewGroup;
        this.f35595H = "";
        this.f35597J = "";
        boolean z = true;
        this.f35599L = true;
        this.f35600M = true;
        this.f35601N = true;
        viewGroup.post(new C12361a(viewGroup));
        this.f35590C = new C12362b(this, viewGroup);
        C32444a aVar = C32444a.f86121a;
        int intValue = C32444a.f86174n0.mo60266n().intValue();
        int intValue2 = C32444a.f86162k0.mo60266n().intValue() * 1000;
        this.f35602P = intValue2;
        this.f35600M = intValue == 0;
        this.f35601N = intValue2 < 0 ? false : z;
        Log.m105924i("Finder.FinderLiveGiftSendPlugin", "sendLocalGiftToMsgValue :" + intValue + ",memberListAutoRefreshValue:" + this.f35602P);
        this.f35588A = new HashMap();
        this.f35589B = new HashMap();
    }

    /* renamed from: Z0 */
    public static final void m11919Z0(C12360e8 e8Var, String str) {
        e8Var.getClass();
        C61926c.m72668M(new C12570o8(e8Var, str));
        if (e8Var.f35606p.getLiveRole() == 0) {
            ((C54116w) C86312j.m106911c(C54116w.class)).nv0(C0076j0.SEND_GIFT_MONEY_NOT_ENOUGH_DIALOG_EXPLORE, "", 0);
        }
    }

    /* renamed from: e1 */
    public static void m11920e1(C12360e8 e8Var, String str, int i, String str2, boolean z, boolean z2, int i2, Object obj) {
        C51548uh3 uh32;
        if ((i2 & 8) != 0) {
            z = true;
        }
        int i3 = 0;
        if ((i2 & 16) != 0) {
            z2 = false;
        }
        if (e8Var.f35593F == null) {
            e8Var.f35593F = new C12473j8(e8Var, str, z2, z);
        }
        C8916d d = C0639y1.f1510a.mo612d(str);
        if (d != null) {
            Log.m105920e("Finder.FinderLiveGiftSendPlugin", "sendGift giftInfo giftId:" + str + " diffCnt:" + i + ",comboId:" + str2 + ",sendGiftTargetUserName:" + e8Var.f35595H + " isFromPatchSend: " + z2);
            if (C58739j4.f168176a.mo83692U()) {
                C37521f.f99374d.getClass();
                if (C37521f.f99573z1.mo60266n().intValue() == 0) {
                    Log.m105924i("Finder.FinderLiveGiftSendPlugin", "sendGift mock");
                    return;
                }
            }
            C50643o71 d1 = e8Var.mo12052d1(str, z2);
            Log.m105924i("Finder.FinderLiveGiftSendPlugin", "sendGift, scene: " + d1.f138995d + " wishId: " + d1.f138996e + " giftId:" + str + " diffCnt:" + i + " price:" + d.field_price + ",comboId:" + str2 + ",sendGiftTargetUserName:" + e8Var.f35595H + ", isFromOneClick:" + e8Var.f35613w);
            C12485k8 k8Var = new C12485k8(str, e8Var, d, str2, d1);
            if (!e8Var.f35614x) {
                k8Var.invoke(Integer.valueOf(i), (Object) null, (Object) null);
            } else if (e8Var.f35615y == null) {
                Log.m105924i("Finder.FinderLiveGiftSendPlugin", "pkgGiftPatchInfoList is null, return");
            } else {
                int i4 = 0;
                while (i > 0) {
                    LinkedList<C51548uh3> linkedList = e8Var.f35615y;
                    if (i4 < (linkedList != null ? linkedList.size() : 0)) {
                        Log.m105924i("Finder.FinderLiveGiftSendPlugin", "[pkg-doPostGift] index = " + i4 + ", needToPostCnt = " + i + ", prefixSumArray = " + e8Var.f35616z);
                        if (e8Var.f35616z.size() == 0) {
                            Log.m105924i("Finder.FinderLiveGiftSendPlugin", "prefixSumArray is empty, return");
                            return;
                        }
                        LinkedList<Long> linkedList2 = e8Var.f35616z;
                        int size = linkedList2.size() - 1;
                        if (i4 <= size) {
                            size = i4;
                        }
                        Long l = linkedList2.get(size);
                        C87412m.m108593f(l, "prefixSumArrayOfPkgGiftP…tPatchInfoList.size - 1)]");
                        long longValue = l.longValue();
                        LinkedList<C51548uh3> linkedList3 = e8Var.f35615y;
                        if (linkedList3 == null || (uh32 = (C51548uh3) C110818d0.m150917O(linkedList3, i4)) == null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("pkgGiftPatchInfoList.get null, ");
                            LinkedList<C51548uh3> linkedList4 = e8Var.f35615y;
                            if (linkedList4 != null) {
                                i3 = linkedList4.size();
                            }
                            sb.append(i3);
                            Log.m105924i("Finder.FinderLiveGiftSendPlugin", sb.toString());
                            return;
                        }
                        int i5 = uh32.f142859f;
                        int e = C31543z5.m39455e();
                        boolean z3 = i5 - e < 0;
                        Log.m105924i("Finder.FinderLiveGiftSendPlugin", "expireTime = " + i5 + ", currentTime = " + e + ", isExpire = " + z3);
                        if (C58739j4.f168176a.mo83692U() && z3) {
                            C61926c.m72668M(new C12388f8(e8Var, uh32, i5));
                        }
                        long j = (long) i;
                        if (j <= longValue) {
                            long j2 = uh32.f142858e;
                            long j3 = longValue - j;
                            uh32.f142858e = j3;
                            long j4 = j2 - j3;
                            e8Var.mo12049a1("doPostGift-if");
                            Log.m105924i("Finder.FinderLiveGiftSendPlugin", "[pkg-doPostGift-if] postCnt:" + j4);
                            k8Var.invoke(Integer.valueOf((int) j4), uh32.f142860g, uh32.f142857d);
                            i = 0;
                        } else {
                            int i6 = (int) uh32.f142858e;
                            if (i6 != 0) {
                                uh32.f142858e = 0;
                                i -= i6;
                                e8Var.mo12049a1("doPostGift-else");
                                Log.m105924i("Finder.FinderLiveGiftSendPlugin", "[pkg-doPostGift-else] postCnt:" + i6);
                                k8Var.invoke(Integer.valueOf(i6), uh32.f142860g, uh32.f142857d);
                            } else if (i4 + 1 >= e8Var.f35616z.size()) {
                                Log.m105924i("Finder.FinderLiveGiftSendPlugin", "[pkg-doPostGift-else] batch isEmpty，return");
                                i = 0;
                            }
                            i4++;
                        }
                    } else {
                        return;
                    }
                }
            }
        } else {
            Log.m105920e("Finder.FinderLiveGiftSendPlugin", "sendGift giftInfo is empty, giftId:" + str + " diffCnt:" + i + ",comboId:" + str2 + ",sendGiftTargetUserName:" + e8Var.f35595H);
        }
    }

    /* renamed from: U0 */
    public void mo12048U0() {
        ((C0657g1) mo87696x0(C0657g1.class)).f1558j.observe(this, new C12369f(this));
    }

    /* renamed from: a1 */
    public final void mo12049a1(String str) {
        this.f35616z.clear();
        LinkedList<C51548uh3> linkedList = this.f35615y;
        if (linkedList != null) {
            int i = 0;
            for (T next : linkedList) {
                int i2 = i + 1;
                if (i >= 0) {
                    C51548uh3 uh32 = (C51548uh3) next;
                    if (i == 0) {
                        this.f35616z.add(Long.valueOf(uh32.f142858e));
                    } else {
                        Long l = this.f35616z.get(i - 1);
                        C87412m.m108593f(l, "prefixSumArrayOfPkgGiftPatchInfoList[prefixIndex]");
                        this.f35616z.add(Long.valueOf(l.longValue() + uh32.f142858e));
                    }
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
        Log.m105924i("Finder.FinderLiveGiftSendPlugin", str + " buildPrefixSumArray = " + this.f35616z);
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
        r3 = r3.f140743f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01e6  */
    /* renamed from: b1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo12050b1(int r19, boolean r20) {
        /*
            r18 = this;
            r0 = r18
            java.lang.Class<cl1.g1> r1 = cl1.C0657g1.class
            r2 = r19
            float r2 = (float) r2
            r3 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 / r3
            androidx.lifecycle.i0 r3 = r0.mo87696x0(r1)
            cl1.g1 r3 = (cl1.C0657g1) r3
            te3.r71 r3 = r3.f1556h
            if (r3 == 0) goto L_0x001b
            te3.yv0 r3 = r3.f140743f
            if (r3 == 0) goto L_0x001b
            long r6 = r3.f145533e
            goto L_0x001d
        L_0x001b:
            r6 = 0
        L_0x001d:
            androidx.lifecycle.i0 r3 = r0.mo87696x0(r1)
            cl1.g1 r3 = (cl1.C0657g1) r3
            float r3 = r3.f1555g
            androidx.lifecycle.i0 r8 = r0.mo87696x0(r1)
            cl1.g1 r8 = (cl1.C0657g1) r8
            te3.r71 r8 = r8.f1556h
            r9 = 10
            if (r8 == 0) goto L_0x005f
            java.util.LinkedList<te3.h43> r8 = r8.f140742e
            if (r8 == 0) goto L_0x005f
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = sx3.C36907w.m41090l(r8, r9)
            r11.<init>(r12)
            java.util.Iterator r8 = r8.iterator()
        L_0x0042:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L_0x0058
            java.lang.Object r12 = r8.next()
            te3.h43 r12 = (te3.C49658h43) r12
            long r12 = r12.f134442d
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r11.add(r12)
            goto L_0x0042
        L_0x0058:
            ux3.e r8 = ux3.C22667e.f65198d
            java.util.List r8 = sx3.C110818d0.m150943o0(r11, r8)
            goto L_0x0060
        L_0x005f:
            r8 = 0
        L_0x0060:
            if (r8 == 0) goto L_0x0082
            java.util.Iterator r8 = r8.iterator()
        L_0x0066:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x0082
            java.lang.Object r11 = r8.next()
            java.lang.Number r11 = (java.lang.Number) r11
            long r11 = r11.longValue()
            float r13 = r3 + r2
            float r14 = (float) r11
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 < 0) goto L_0x0066
            int r13 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r13 < 0) goto L_0x0066
            r6 = r11
        L_0x0082:
            androidx.lifecycle.i0 r3 = r0.mo87696x0(r1)
            cl1.g1 r3 = (cl1.C0657g1) r3
            float r3 = r3.f1555g
            androidx.lifecycle.i0 r8 = r0.mo87696x0(r1)
            cl1.g1 r8 = (cl1.C0657g1) r8
            er1.o5 r11 = er1.C7851o5.NORMAL_TYPE
            te3.r71 r12 = r8.f1556h
            if (r12 == 0) goto L_0x00bd
            java.util.LinkedList<te3.h43> r12 = r12.f140742e
            if (r12 == 0) goto L_0x00bd
            java.util.ArrayList r13 = new java.util.ArrayList
            int r9 = sx3.C36907w.m41090l(r12, r9)
            r13.<init>(r9)
            java.util.Iterator r9 = r12.iterator()
        L_0x00a7:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x00be
            java.lang.Object r12 = r9.next()
            te3.h43 r12 = (te3.C49658h43) r12
            long r14 = r12.f134442d
            java.lang.Long r12 = java.lang.Long.valueOf(r14)
            r13.add(r12)
            goto L_0x00a7
        L_0x00bd:
            r13 = 0
        L_0x00be:
            if (r13 == 0) goto L_0x00cd
            java.lang.Comparable r9 = sx3.C110818d0.m150927Y(r13)
            java.lang.Long r9 = (java.lang.Long) r9
            if (r9 == 0) goto L_0x00cd
            long r12 = r9.longValue()
            goto L_0x00d0
        L_0x00cd:
            r12 = 50000(0xc350, double:2.47033E-319)
        L_0x00d0:
            int r9 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r9 < 0) goto L_0x00d7
            er1.o5 r9 = er1.C7851o5.FACE_TYPE
            goto L_0x00d8
        L_0x00d7:
            r9 = r11
        L_0x00d8:
            if (r9 != r11) goto L_0x0142
            java.util.LinkedList r11 = new java.util.LinkedList
            r11.<init>()
            org.json.JSONArray r14 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0120 }
            f40.o r15 = f40.C86709a0.m107535s()     // Catch:{ JSONException -> 0x0120 }
            com.tencent.mm.storage.v1 r15 = r15.mo121142i()     // Catch:{ JSONException -> 0x0120 }
            com.tencent.mm.storage.y1$a r10 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_LIVE_QUOTA_CONSUME_SHOW_STRING_SYNC     // Catch:{ JSONException -> 0x0120 }
            java.lang.String r12 = ""
            java.lang.String r10 = r15.mo119675I(r10, r12)     // Catch:{ JSONException -> 0x0120 }
            r14.<init>(r10)     // Catch:{ JSONException -> 0x0120 }
            int r10 = r14.length()     // Catch:{ JSONException -> 0x0120 }
            r12 = 0
        L_0x00f9:
            if (r12 >= r10) goto L_0x0120
            org.json.JSONObject r15 = r14.optJSONObject(r12)     // Catch:{ JSONException -> 0x0120 }
            er1.n5 r4 = new er1.n5     // Catch:{ JSONException -> 0x0120 }
            java.lang.String r5 = "noticeAmount"
            r16 = r14
            long r13 = r15.optLong(r5)     // Catch:{ JSONException -> 0x0120 }
            java.lang.String r5 = "curTime"
            r17 = r1
            long r0 = r15.optLong(r5)     // Catch:{ JSONException -> 0x0122 }
            r4.<init>(r13, r0)     // Catch:{ JSONException -> 0x0122 }
            r11.add(r4)     // Catch:{ JSONException -> 0x0122 }
            int r12 = r12 + 1
            r0 = r18
            r14 = r16
            r1 = r17
            goto L_0x00f9
        L_0x0120:
            r17 = r1
        L_0x0122:
            java.util.Iterator r0 = r11.iterator()
        L_0x0126:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x015a
            java.lang.Object r1 = r0.next()
            er1.n5 r1 = (er1.C7846n5) r1
            long r4 = r1.f26420a
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x0126
            long r0 = r1.f26421b
            boolean r0 = android.text.format.DateUtils.isToday(r0)
            r1 = 1
            r0 = r0 ^ r1
            r1 = r0
            goto L_0x015d
        L_0x0142:
            r17 = r1
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_LIVE_QUOTA_CONSUME_FACE_VERIFY_TIME_LONG_SYNC
            r4 = 0
            long r0 = r0.mo119673G(r1, r4)
            boolean r0 = android.text.format.DateUtils.isToday(r0)
            if (r0 != 0) goto L_0x015c
        L_0x015a:
            r1 = 1
            goto L_0x015d
        L_0x015c:
            r1 = 0
        L_0x015d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "isNeedInterceptConsume curNoticeAmount: "
            r0.append(r4)
            r0.append(r6)
            java.lang.String r4 = " quotaType: "
            r0.append(r4)
            r0.append(r9)
            java.lang.String r4 = " canShowToast: "
            r0.append(r4)
            r0.append(r1)
            java.lang.String r4 = " switch: "
            r0.append(r4)
            te3.r71 r4 = r8.f1556h
            if (r4 == 0) goto L_0x018e
            te3.yv0 r4 = r4.f140743f
            if (r4 == 0) goto L_0x018e
            int r4 = r4.f145532d
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            goto L_0x018f
        L_0x018e:
            r10 = 0
        L_0x018f:
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "LiveRestrictConsumeSlice"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            te3.r71 r0 = r8.f1556h
            if (r0 == 0) goto L_0x01aa
            te3.yv0 r0 = r0.f140743f
            if (r0 == 0) goto L_0x01aa
            int r0 = r0.f145532d
            r4 = 1
            if (r0 != r4) goto L_0x01aa
            r0 = 1
            goto L_0x01ab
        L_0x01aa:
            r0 = 0
        L_0x01ab:
            if (r0 == 0) goto L_0x01b1
            if (r1 == 0) goto L_0x01b1
            r1 = 1
            goto L_0x01b2
        L_0x01b1:
            r1 = 0
        L_0x01b2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "checkCurrentConsumeQuotaEnable reachAmountQuota: "
            r0.append(r4)
            r0.append(r6)
            java.lang.String r4 = " currentConsumeCNY: "
            r0.append(r4)
            r0.append(r3)
            java.lang.String r4 = " giftPriceCNY: "
            r0.append(r4)
            r0.append(r2)
            java.lang.String r4 = " isNeedInterceptConsume: "
            r0.append(r4)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "Finder.FinderLiveGiftSendPlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            r4 = 0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0214
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x01ed
            r0 = 1
            goto L_0x01ee
        L_0x01ed:
            r0 = 0
        L_0x01ee:
            if (r0 != 0) goto L_0x0214
            if (r1 != 0) goto L_0x01f3
            goto L_0x0214
        L_0x01f3:
            float r3 = r3 + r2
            float r0 = (float) r6
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0210
            r0 = r18
            if (r20 == 0) goto L_0x020e
            r1 = r17
            androidx.lifecycle.i0 r1 = r0.mo87696x0(r1)
            cl1.g1 r1 = (cl1.C0657g1) r1
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<java.lang.Long> r1 = r1.f1554f
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            r1.postValue(r2)
        L_0x020e:
            r12 = 0
            goto L_0x0213
        L_0x0210:
            r0 = r18
            r12 = 1
        L_0x0213:
            return r12
        L_0x0214:
            r0 = r18
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C12360e8.mo12050b1(int, boolean):boolean");
    }

    /* renamed from: c1 */
    public final C12365c.C12366a mo12051c1(String str, String str2, boolean z) {
        C87412m.m108594g(str, "sendGiftTargetUserName");
        C87412m.m108594g(str2, "giftId");
        return new C12365c.C12366a(mo87684A0(), str, mo12052d1(str2, z));
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b7  */
    /* renamed from: d1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final te3.C50643o71 mo12052d1(java.lang.String r10, boolean r11) {
        /*
            r9 = this;
            java.lang.Class<cl1.z> r0 = cl1.C0700z.class
            java.lang.Class<cl1.u1> r1 = cl1.C0691u1.class
            te3.o71 r2 = new te3.o71
            r2.<init>()
            boolean r3 = r9.f35613w
            r4 = 0
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L_0x0012
            r3 = 3
            goto L_0x003d
        L_0x0012:
            java.lang.String r3 = r9.f35609s
            if (r3 == 0) goto L_0x001f
            int r3 = r3.length()
            if (r3 != 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            goto L_0x0020
        L_0x001f:
            r3 = 1
        L_0x0020:
            if (r3 != 0) goto L_0x0024
            r3 = 2
            goto L_0x003d
        L_0x0024:
            cl1.z$a r3 = r9.f35611u
            if (r3 == 0) goto L_0x002b
            java.lang.String r3 = r3.f1667e
            goto L_0x002c
        L_0x002b:
            r3 = r4
        L_0x002c:
            if (r3 == 0) goto L_0x0037
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r3 = 0
            goto L_0x0038
        L_0x0037:
            r3 = 1
        L_0x0038:
            if (r3 == 0) goto L_0x003c
            r3 = 0
            goto L_0x003d
        L_0x003c:
            r3 = 1
        L_0x003d:
            r2.f138995d = r3
            androidx.lifecycle.i0 r3 = r9.mo87696x0(r1)
            cl1.u1 r3 = (cl1.C0691u1) r3
            di1.c<te3.u71> r3 = r3.f1637f
            java.lang.Object r3 = r3.getValue()
            te3.u71 r3 = (te3.C51503u71) r3
            if (r3 == 0) goto L_0x0052
            java.lang.String r3 = r3.f142647j
            goto L_0x0053
        L_0x0052:
            r3 = r4
        L_0x0053:
            java.lang.String r7 = ""
            if (r3 != 0) goto L_0x0058
            r3 = r7
        L_0x0058:
            androidx.lifecycle.i0 r1 = r9.mo87696x0(r1)
            cl1.u1 r1 = (cl1.C0691u1) r1
            java.lang.String r8 = "giftId"
            gy3.C87412m.m108594g(r10, r8)
            di1.c<te3.u71> r1 = r1.f1637f
            java.lang.Object r1 = r1.getValue()
            te3.u71 r1 = (te3.C51503u71) r1
            if (r1 == 0) goto L_0x0098
            java.util.LinkedList<te3.tp2> r1 = r1.f142646i
            if (r1 == 0) goto L_0x0098
            boolean r8 = r1.isEmpty()
            if (r8 == 0) goto L_0x0078
            goto L_0x0098
        L_0x0078:
            java.util.Iterator r1 = r1.iterator()
        L_0x007c:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L_0x0098
            java.lang.Object r8 = r1.next()
            te3.tp2 r8 = (te3.C51428tp2) r8
            te3.p11 r8 = r8.f142318d
            if (r8 == 0) goto L_0x008f
            java.lang.String r8 = r8.f139507d
            goto L_0x0090
        L_0x008f:
            r8 = r4
        L_0x0090:
            boolean r8 = gy3.C87412m.m108589b(r8, r10)
            if (r8 == 0) goto L_0x007c
            r10 = 1
            goto L_0x0099
        L_0x0098:
            r10 = 0
        L_0x0099:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x00a4
            r4 = r3
        L_0x00a4:
            if (r4 != 0) goto L_0x00a7
            goto L_0x00a8
        L_0x00a7:
            r7 = r4
        L_0x00a8:
            r2.f138996e = r7
            java.lang.String r10 = r9.f35609s
            if (r10 == 0) goto L_0x00b4
            int r10 = r10.length()
            if (r10 != 0) goto L_0x00b5
        L_0x00b4:
            r5 = 1
        L_0x00b5:
            if (r5 != 0) goto L_0x00f5
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r1 = "sendGift, songName: "
            r10.append(r1)
            java.lang.String r1 = r9.f35609s
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            java.lang.String r1 = "Finder.FinderLiveGiftSendPlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r10)
            java.lang.String r10 = r9.f35609s
            r2.f138997f = r10
            androidx.lifecycle.i0 r10 = r9.mo87696x0(r0)
            cl1.z r10 = (cl1.C0700z) r10
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<java.lang.Boolean> r10 = r10.f1662n
            java.lang.Object r10 = r10.getValue()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r10 = gy3.C87412m.m108589b(r10, r1)
            if (r10 == 0) goto L_0x00f5
            androidx.lifecycle.i0 r10 = r9.mo87696x0(r0)
            cl1.z r10 = (cl1.C0700z) r10
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<java.lang.Boolean> r10 = r10.f1662n
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r10.postValue(r0)
        L_0x00f5:
            r2.f138998g = r11
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C12360e8.mo12052d1(java.lang.String, boolean):te3.o71");
    }

    /* renamed from: f1 */
    public final void mo12053f1() {
        C61926c.m72668M(new C12370g(this));
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: l0 */
    public boolean mo3207l0() {
        if (mo14483f0() != 0) {
            return false;
        }
        C61926c.m72668M(new C12439h8(this));
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* renamed from: n0 */
    public void mo12054n0(int i) {
        this.f35599L = NetStatusUtil.isConnected(MMApplicationContext.getContext());
        Log.m105924i("Finder.FinderLiveGiftSendPlugin", "networkChange " + i + ",networkEnable:" + this.f35599L);
        if (!this.f35599L) {
            C61926c.m72668M(new C12368e(this));
        }
    }

    /* renamed from: s0 */
    public void mo3209s0() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:86:0x0112  */
    /* renamed from: u0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3210u0(d60.C58124b.C58125b r6, android.os.Bundle r7) {
        /*
            r5 = this;
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            java.lang.String r1 = "status"
            gy3.C87412m.m108594g(r6, r1)
            int r6 = r6.ordinal()
            r1 = 7
            if (r6 == r1) goto L_0x017f
            r1 = 27
            if (r6 == r1) goto L_0x0177
            r1 = 118(0x76, float:1.65E-43)
            r2 = 0
            r3 = 1
            if (r6 == r1) goto L_0x0146
            r0 = 218(0xda, float:3.05E-43)
            if (r6 == r0) goto L_0x0133
            r0 = 75
            if (r6 == r0) goto L_0x0031
            r7 = 76
            if (r6 == r7) goto L_0x0027
            goto L_0x0182
        L_0x0027:
            qj1.h8 r6 = new qj1.h8
            r6.<init>(r5)
            o40.C61926c.m72668M(r6)
            goto L_0x0182
        L_0x0031:
            java.lang.String r6 = "PARAM_FINDER_LIVE_GIFT_ID"
            if (r7 == 0) goto L_0x003d
            boolean r0 = r7.containsKey(r6)
            if (r0 != r3) goto L_0x003d
            r0 = 1
            goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            r1 = 0
            if (r0 == 0) goto L_0x004b
            if (r7 == 0) goto L_0x0048
            java.lang.String r6 = r7.getString(r6)
            goto L_0x0049
        L_0x0048:
            r6 = r1
        L_0x0049:
            r5.f35608r = r6
        L_0x004b:
            r5.f35611u = r1
            java.lang.String r6 = "PARAM_FINDER_LIVE_SEND_GIFT_DATA"
            if (r7 == 0) goto L_0x0059
            boolean r0 = r7.containsKey(r6)
            if (r0 != r3) goto L_0x0059
            r0 = 1
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            if (r0 == 0) goto L_0x0068
            if (r7 == 0) goto L_0x0063
            java.io.Serializable r6 = r7.getSerializable(r6)
            goto L_0x0064
        L_0x0063:
            r6 = r1
        L_0x0064:
            cl1.z$a r6 = (cl1.C0700z.C0701a) r6
            r5.f35611u = r6
        L_0x0068:
            java.lang.String r6 = "PARAM_FINDER_LIVE_SEND_GIFT_TARGET_USER_NAME"
            if (r7 == 0) goto L_0x0074
            boolean r0 = r7.containsKey(r6)
            if (r0 != r3) goto L_0x0074
            r0 = 1
            goto L_0x0075
        L_0x0074:
            r0 = 0
        L_0x0075:
            if (r0 == 0) goto L_0x0081
            java.lang.String r6 = r7.getString(r6)
            if (r6 != 0) goto L_0x007f
            java.lang.String r6 = ""
        L_0x007f:
            r5.f35595H = r6
        L_0x0081:
            java.lang.String r6 = "PARAM_FINDER_LIVE_SING_SONG_NAME"
            if (r7 == 0) goto L_0x008d
            boolean r0 = r7.containsKey(r6)
            if (r0 != r3) goto L_0x008d
            r0 = 1
            goto L_0x008e
        L_0x008d:
            r0 = 0
        L_0x008e:
            if (r0 == 0) goto L_0x0097
            java.lang.String r6 = r7.getString(r6)
            r5.f35609s = r6
            goto L_0x0099
        L_0x0097:
            r5.f35609s = r1
        L_0x0099:
            if (r7 == 0) goto L_0x00a2
            java.lang.String r6 = "PARAM_FINDER_LIVE_GIFT_BATCH_SUM"
            int r6 = r7.getInt(r6, r3)
            goto L_0x00a3
        L_0x00a2:
            r6 = 1
        L_0x00a3:
            if (r7 == 0) goto L_0x00ac
            java.lang.String r0 = "PARAM_FINDER_LIVE_SHOW_SEND_BTN"
            boolean r0 = r7.getBoolean(r0, r3)
            goto L_0x00ad
        L_0x00ac:
            r0 = 1
        L_0x00ad:
            if (r7 == 0) goto L_0x00b6
            java.lang.String r4 = "PARAM_FINDER_LIVE_SEND_GIFT_FROM_ONECLICK"
            boolean r4 = r7.getBoolean(r4, r2)
            goto L_0x00b7
        L_0x00b6:
            r4 = 0
        L_0x00b7:
            r5.f35613w = r4
            if (r7 == 0) goto L_0x00c2
            java.lang.String r4 = "PARAM_FINDER_LIVE_GIFT_IS_PKG"
            boolean r7 = r7.getBoolean(r4, r2)
            goto L_0x00c3
        L_0x00c2:
            r7 = 0
        L_0x00c3:
            r5.f35614x = r7
            if (r7 == 0) goto L_0x0116
            java.lang.String r7 = r5.f35608r
            if (r7 == 0) goto L_0x00f2
            int r4 = r7.length()
            if (r4 != 0) goto L_0x00d3
            r4 = 1
            goto L_0x00d4
        L_0x00d3:
            r4 = 0
        L_0x00d4:
            r4 = r4 ^ r3
            if (r4 == 0) goto L_0x00d8
            r1 = r7
        L_0x00d8:
            if (r1 == 0) goto L_0x00f2
            java.util.Map<java.lang.String, java.util.LinkedList<te3.uh3>> r7 = cj1.C0639y1.f1518i
            java.lang.Object r7 = r7.get(r1)
            java.util.LinkedList r7 = (java.util.LinkedList) r7
            if (r7 == 0) goto L_0x00f2
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>(r7)
            r5.f35615y = r1
            java.lang.String r7 = "init"
            r5.mo12049a1(r7)
            r7 = 1
            goto L_0x0110
        L_0x00f2:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "[LIVE_EVENT_GIFT_SHOW_SEND_BTN] pkgGiftPatchInfoList is null,curGiftId = "
            r7.append(r1)
            java.lang.String r1 = r5.f35608r
            r7.append(r1)
            java.lang.String r1 = ", return"
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            java.lang.String r1 = "Finder.FinderLiveGiftSendPlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r7)
            r7 = 0
        L_0x0110:
            if (r7 != 0) goto L_0x0116
            r5.mo12053f1()
            return
        L_0x0116:
            cj1.y1 r7 = cj1.C0639y1.f1510a
            java.lang.String r1 = r5.f35608r
            ig1.d r7 = r7.mo612d(r1)
            if (r7 == 0) goto L_0x0124
            boolean r7 = r7.field_disableCombo
            r7 = r7 ^ r3
            goto L_0x0125
        L_0x0124:
            r7 = 1
        L_0x0125:
            if (r0 == 0) goto L_0x012a
            if (r7 == 0) goto L_0x012a
            r2 = 1
        L_0x012a:
            qj1.m8 r7 = new qj1.m8
            r7.<init>(r5, r6, r2)
            o40.C61926c.m72668M(r7)
            goto L_0x0182
        L_0x0133:
            if (r7 == 0) goto L_0x013e
            java.lang.String r6 = "isShow"
            boolean r6 = r7.getBoolean(r6)
            if (r6 != r3) goto L_0x013e
            r2 = 1
        L_0x013e:
            if (r2 == 0) goto L_0x0182
            r6 = 8
            r5.mo10792g(r6)
            goto L_0x0182
        L_0x0146:
            androidx.lifecycle.i0 r6 = r5.mo87696x0(r0)
            cl1.o r6 = (cl1.C54991o) r6
            boolean r6 = r6.mo75963I3()
            if (r6 != 0) goto L_0x0168
            boolean r6 = r5.f35596I
            if (r6 != 0) goto L_0x0168
            r5.f35596I = r3
            qj1.h8 r6 = new qj1.h8
            r6.<init>(r5)
            o40.C61926c.m72668M(r6)
            m53.d r6 = r5.f35594G
            if (r6 == 0) goto L_0x0182
            r6.mo11003b()
            goto L_0x0182
        L_0x0168:
            androidx.lifecycle.i0 r6 = r5.mo87696x0(r0)
            cl1.o r6 = (cl1.C54991o) r6
            boolean r6 = r6.mo75963I3()
            if (r6 == 0) goto L_0x0182
            r5.f35596I = r2
            goto L_0x0182
        L_0x0177:
            m53.d r6 = r5.f35594G
            if (r6 == 0) goto L_0x0182
            r6.mo11003b()
            goto L_0x0182
        L_0x017f:
            r5.mo12048U0()
        L_0x0182:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C12360e8.mo3210u0(d60.b$b, android.os.Bundle):void");
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        FinderLiveGiftSendBtn finderLiveGiftSendBtn = this.f35591D;
        if (finderLiveGiftSendBtn.f15259g.isPlaying()) {
            finderLiveGiftSendBtn.f15259g.stop();
        }
        C61926c.m72698w(finderLiveGiftSendBtn.f15262j);
        this.f35596I = false;
    }
}
