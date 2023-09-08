package pf1;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.finder.feed.jumper.FinderWeAppHalfScreenScListener;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.lite.C56832d;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.Html5Info;
import com.tencent.p014mm.protocal.protobuf.MiniAppInfo;
import com.tencent.p014mm.protocal.protobuf.NativeInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares;
import di0.C86299o;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import ds1.C7515a;
import er1.C58684b;
import er1.C7865r3;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8477a0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import jq3.C60905o;
import ke3.C88144b;
import kr0.C88262c1;
import kr0.C88273g1;
import kr0.C88274h0;
import mf1.C10786a1;
import nj3.C76912y0;
import o40.C61926c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p244tt.C14088e;
import rs1.C13267i0;
import rs1.C13280j0;
import rs1.C13554z;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C110823p;
import te3.C49150di1;
import te3.C64488kb1;
import te3.C64586nn1;
import te3.C64719t23;
import te3.C64726td1;
import te3.C64793w23;
import te3.uc4;
import tf0.C13887q1;
import up1.C65415e0;
import wi0.C66117m;
import zc1.C66785b;

/* renamed from: pf1.d0 */
public final class C62262d0 {

    /* renamed from: a */
    public static final C62262d0 f176978a = new C62262d0();

    /* renamed from: b */
    public static ProgressDialog f176979b;

    /* renamed from: c */
    public static boolean f176980c;

    /* renamed from: d */
    public static Map<String, String> f176981d = new LinkedHashMap();

    /* renamed from: pf1.d0$a */
    public static final class C62263a implements C56832d.C56833a {

        /* renamed from: a */
        public final /* synthetic */ C60200t1.C60203c f176982a;

        public C62263a(C60200t1.C60203c cVar) {
            this.f176982a = cVar;
        }

        /* renamed from: a */
        public String mo80258a(String str, String str2) {
            return this.f176982a.mo85200a(str, str2);
        }

        /* renamed from: b */
        public boolean mo80259b(long j, String str, String str2, int i) {
            return this.f176982a.mo85201b(j, str, str2, i);
        }
    }

    /* renamed from: pf1.d0$b */
    public static final class C62264b implements C14088e.C14090b {

        /* renamed from: a */
        public final /* synthetic */ C8477a0 f176983a;

        /* renamed from: b */
        public final /* synthetic */ Context f176984b;

        /* renamed from: c */
        public final /* synthetic */ C11920q f176985c;

        /* renamed from: d */
        public final /* synthetic */ C60905o f176986d;

        /* renamed from: e */
        public final /* synthetic */ boolean f176987e;

        /* renamed from: f */
        public final /* synthetic */ String f176988f;

        /* renamed from: pf1.d0$b$a */
        public static final class C62265a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C8477a0 f176989d;

            /* renamed from: e */
            public final /* synthetic */ Context f176990e;

            /* renamed from: f */
            public final /* synthetic */ C11920q f176991f;

            /* renamed from: g */
            public final /* synthetic */ C60905o f176992g;

            /* renamed from: h */
            public final /* synthetic */ boolean f176993h;

            /* renamed from: i */
            public final /* synthetic */ String f176994i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C62265a(C8477a0 a0Var, Context context, C11920q qVar, C60905o oVar, boolean z, String str) {
                super(0);
                this.f176989d = a0Var;
                this.f176990e = context;
                this.f176991f = qVar;
                this.f176992g = oVar;
                this.f176993h = z;
                this.f176994i = str;
            }

            public Object invoke() {
                if (this.f176989d.f27482d) {
                    C62262d0.m73170n(C62262d0.f176978a, this.f176990e, this.f176991f, 0, false, this.f176992g, 0.0f, 44, (Object) null);
                } else if (this.f176993h) {
                    C62262d0.f176978a.mo87319j(this.f176990e, this.f176994i);
                }
                return C13598b0.f38549a;
            }
        }

        public C62264b(C8477a0 a0Var, Context context, C11920q qVar, C60905o oVar, boolean z, String str) {
            this.f176983a = a0Var;
            this.f176984b = context;
            this.f176985c = qVar;
            this.f176986d = oVar;
            this.f176987e = z;
            this.f176988f = str;
        }

        /* renamed from: a */
        public void mo1717a() {
            Log.m105924i("Finder.JumperUtils", "jumpLiteApp success");
        }

        /* renamed from: b */
        public void mo1718b() {
            Log.m105924i("Finder.JumperUtils", "jumpLiteApp fail");
            C61926c.m72668M(new C62265a(this.f176983a, this.f176984b, this.f176985c, this.f176986d, this.f176987e, this.f176988f));
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m73168c(C62262d0 d0Var, Context context, C11920q qVar, int i, C60905o oVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            oVar = null;
        }
        d0Var.mo87313b(context, qVar, i, oVar);
    }

    /* renamed from: g */
    public static void m73169g(C62262d0 d0Var, Context context, C86299o oVar, String str, BaseFinderFeed baseFinderFeed, C60905o oVar2, boolean z, int i, boolean z2, HalfScreenConfig.C55451a aVar, float f, boolean z3, int i2, Object obj) {
        RecyclerViewDrawerSquares.C45117c cVar;
        C62262d0 d0Var2 = d0Var;
        Context context2 = context;
        C86299o oVar3 = oVar;
        String str2 = str;
        C60905o oVar4 = oVar2;
        int i3 = i2;
        HalfScreenConfig.C55451a aVar2 = HalfScreenConfig.C55451a.POPUP;
        int i4 = (i3 & 64) != 0 ? 0 : i;
        boolean z4 = (i3 & 128) != 0 ? false : z2;
        HalfScreenConfig.C55451a aVar3 = (i3 & 256) != 0 ? aVar2 : aVar;
        float f2 = (i3 & 512) != 0 ? 0.0f : f;
        boolean z5 = (i3 & 1024) != 0 ? false : z3;
        d0Var.getClass();
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(oVar3, "weAppOpenBundle");
        C87412m.m108594g(str2, "activityClassName");
        C87412m.m108594g(aVar3, "animType");
        boolean z6 = !z;
        Log.m105924i("Finder.JumperUtils", "initMiniAppHalfConfig showNavigationBar:" + z6);
        if (f2 == 0.0f) {
            f2 = C7515a.f25777a.mo8637a(context2);
        }
        boolean z7 = 2 == i4;
        C7865r3 r3Var = C7865r3.f26468a;
        int a = r3Var.mo8968a();
        HalfScreenConfig halfScreenConfig = null;
        if (f2 == 0.0f) {
            f2 = C7515a.f25777a.mo8637a((Context) null);
        }
        oVar3.f250912A = new HalfScreenConfig(true, d0Var2.mo87318i(str2) ? ((C13887q1) C86312j.m106911c(C13887q1.class)).mo13301C7() : (int) (((float) a) * f2), aVar3, false, (HalfScreenConfig.BackgroundShapeConfig) null, false, (HalfScreenConfig.CloseWhenClickEmptyAreaConfig) null, z6 ? HalfScreenConfig.C55453c.SINGLE_CLOSE : HalfScreenConfig.C55453c.HIDE, false, z6, (WeAppHalfScreenStatusChangeListener) null, C110823p.m151009y(new Integer[]{36}, Integer.valueOf(i4)) ? HalfScreenConfig.C55456f.FAKE_NATIVE : HalfScreenConfig.C55456f.NORMAL, false, false, (C66117m) null, false, (HalfScreenConfig.ShareActionConfig) null, 0, 0, 0, !z7, false, false, (HalfScreenConfig.C55455e) null, false, (HalfScreenConfig.CustomSubjectInfo) null, (int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3745cw), d0Var2.mo87318i(str2) ? z4 : true, false, C110823p.m151009y(new Integer[]{2, 36}, Integer.valueOf(i4)) ? (r3Var.mo8968a() - C75044y4.m89994f(MMApplicationContext.getContext())) - ((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3758d_)) : -1, z7, false, z7, -1812990600, 0, (C8480h) null);
        if (oVar4 != null) {
            C39818r rVar = C39818r.f106831a;
            Context context3 = oVar4.f173499A;
            C87412m.m108593f(context3, "holder.context");
            C13554z zVar = (C13554z) rVar.mo62443b(context3).mo75002a(C13554z.class);
            Context context4 = oVar4.f173499A;
            C87412m.m108593f(context4, "holder.context");
            Fragment fragment = ((C10786a1) rVar.mo62443b(context4).mo75002a(C10786a1.class)).getFragment();
            zVar.getClass();
            cVar = zVar.mo12956c3(fragment, baseFinderFeed, oVar2, C13267i0.f37645d, C13280j0.f37696d);
        } else {
            cVar = null;
        }
        FinderWeAppHalfScreenScListener finderWeAppHalfScreenScListener = new FinderWeAppHalfScreenScListener(true, cVar);
        HalfScreenConfig.CloseWhenClickEmptyAreaConfig closeWhenClickEmptyAreaConfig = new HalfScreenConfig.CloseWhenClickEmptyAreaConfig(str2, aVar2);
        HalfScreenConfig.BackgroundShapeConfig backgroundShapeConfig = new HalfScreenConfig.BackgroundShapeConfig(MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3723cd), true, true, false, false, 24, (C8480h) null);
        HalfScreenConfig halfScreenConfig2 = oVar3.f250912A;
        if (halfScreenConfig2 != null) {
            HalfScreenConfig.C55452b f3 = halfScreenConfig2.mo76935f();
            f3.f157989a = true;
            f3.f157995g = true;
            f3.f157997i = backgroundShapeConfig;
            f3.f157998j = true;
            f3.f157996h = closeWhenClickEmptyAreaConfig;
            f3.f158000l = true;
            f3.f157984C = z5;
            f3.f158003o = finderWeAppHalfScreenScListener;
            halfScreenConfig = f3.mo76967a();
        }
        oVar3.f250912A = halfScreenConfig;
        oVar3.f250916E = new C62261c0();
        f176980c = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ac, code lost:
        if (r11.intValue() == 1) goto L_0x00ae;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x013e  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m73170n(pf1.C62262d0 r21, android.content.Context r22, pf1.C11920q r23, int r24, boolean r25, jq3.C60905o r26, float r27, int r28, java.lang.Object r29) {
        /*
            r14 = r22
            r0 = r23
            r1 = r28 & 4
            if (r1 == 0) goto L_0x000a
            r1 = 0
            goto L_0x000c
        L_0x000a:
            r1 = r24
        L_0x000c:
            r2 = r28 & 8
            if (r2 == 0) goto L_0x0012
            r2 = 0
            goto L_0x0014
        L_0x0012:
            r2 = r25
        L_0x0014:
            r3 = r28 & 16
            r16 = 0
            if (r3 == 0) goto L_0x001d
            r5 = r16
            goto L_0x001f
        L_0x001d:
            r5 = r26
        L_0x001f:
            r3 = r28 & 32
            if (r3 == 0) goto L_0x0026
            r3 = 0
            r10 = 0
            goto L_0x0028
        L_0x0026:
            r10 = r27
        L_0x0028:
            r21.getClass()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$a r3 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55451a.POPUP
            java.lang.String r4 = "context"
            gy3.C87412m.m108594g(r14, r4)
            java.lang.String r4 = "infoEx"
            gy3.C87412m.m108594g(r0, r4)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r4 = r0.f34827a
            com.tencent.mm.protocal.protobuf.MiniAppInfo r4 = r4.mini_app_info
            java.lang.String r13 = ""
            if (r4 == 0) goto L_0x0046
            java.lang.String r6 = r4.app_id
            if (r6 != 0) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            r12 = r6
            goto L_0x0047
        L_0x0046:
            r12 = r13
        L_0x0047:
            if (r4 == 0) goto L_0x004d
            java.lang.String r6 = r4.path
            if (r6 != 0) goto L_0x004e
        L_0x004d:
            r6 = r13
        L_0x004e:
            if (r4 == 0) goto L_0x0053
            java.lang.String r7 = r4.fetch_info_id
            goto L_0x0055
        L_0x0053:
            r7 = r16
        L_0x0055:
            if (r4 == 0) goto L_0x005a
            java.lang.String r8 = r4.request_id
            goto L_0x005c
        L_0x005a:
            r8 = r16
        L_0x005c:
            if (r4 == 0) goto L_0x0061
            java.lang.String r9 = r4.appusername
            goto L_0x0063
        L_0x0061:
            r9 = r16
        L_0x0063:
            if (r4 == 0) goto L_0x006e
            pe3.b r4 = r4.extra_data
            if (r4 == 0) goto L_0x006e
            java.lang.String r4 = r4.mo123705h()
            goto L_0x0070
        L_0x006e:
            r4 = r16
        L_0x0070:
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r11 = r0.f34827a
            com.tencent.mm.protocal.protobuf.MiniAppInfo r11 = r11.mini_app_info
            if (r11 == 0) goto L_0x007b
            java.lang.String r15 = r11.scene_note
            r21 = r13
            goto L_0x007f
        L_0x007b:
            r21 = r13
            r15 = r16
        L_0x007f:
            if (r11 == 0) goto L_0x0084
            boolean r13 = r11.hide_drag_bar
            goto L_0x0085
        L_0x0084:
            r13 = 1
        L_0x0085:
            r17 = 1
            r13 = r13 ^ 1
            if (r11 == 0) goto L_0x0092
            int r11 = r11.launch_animation_type
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L_0x0094
        L_0x0092:
            r11 = r16
        L_0x0094:
            if (r11 != 0) goto L_0x0097
            goto L_0x00a0
        L_0x0097:
            int r17 = r11.intValue()
            if (r17 != 0) goto L_0x00a0
            r25 = r3
            goto L_0x00ae
        L_0x00a0:
            if (r11 != 0) goto L_0x00a5
            r25 = r3
            goto L_0x00b0
        L_0x00a5:
            r25 = r3
            int r3 = r11.intValue()
            r14 = 1
            if (r3 != r14) goto L_0x00b0
        L_0x00ae:
            r3 = 1
            goto L_0x00b1
        L_0x00b0:
            r3 = 0
        L_0x00b1:
            r14 = 2
            if (r3 == 0) goto L_0x00b5
            goto L_0x00c2
        L_0x00b5:
            if (r11 != 0) goto L_0x00b8
            goto L_0x00c2
        L_0x00b8:
            int r3 = r11.intValue()
            if (r3 != r14) goto L_0x00c2
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$a r3 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55451a.SLIDE
            r11 = r3
            goto L_0x00c4
        L_0x00c2:
            r11 = r25
        L_0x00c4:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r14 = "[jumpMiniApp] isHalf="
            r3.append(r14)
            r3.append(r2)
            java.lang.String r14 = " appId="
            r3.append(r14)
            r3.append(r12)
            java.lang.String r14 = " path="
            r3.append(r14)
            r3.append(r6)
            java.lang.String r14 = " appUsername="
            r3.append(r14)
            r3.append(r9)
            java.lang.String r14 = " fetchInfoId="
            r3.append(r14)
            r3.append(r7)
            java.lang.String r7 = " requestId="
            r3.append(r7)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            java.lang.String r14 = "Finder.JumperUtils"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r3)
            int r3 = r12.length()
            if (r3 != 0) goto L_0x010a
            r3 = 1
            goto L_0x010b
        L_0x010a:
            r3 = 0
        L_0x010b:
            if (r3 == 0) goto L_0x011d
            if (r9 == 0) goto L_0x0118
            int r3 = r9.length()
            if (r3 != 0) goto L_0x0116
            goto L_0x0118
        L_0x0116:
            r3 = 0
            goto L_0x0119
        L_0x0118:
            r3 = 1
        L_0x0119:
            if (r3 == 0) goto L_0x011d
            goto L_0x0298
        L_0x011d:
            di0.o r3 = r0.f34837k
            if (r3 != 0) goto L_0x0126
            di0.o r3 = new di0.o
            r3.<init>()
        L_0x0126:
            r8 = r3
            r8.f250930b = r12
            r8.f250929a = r9
            r8.f250934f = r6
            pf1.d0 r3 = f176978a
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r6 = r0.f34827a
            r3.getClass()
            com.tencent.mm.protocal.protobuf.MiniAppInfo r7 = r6.mini_app_info
            if (r7 == 0) goto L_0x013b
            int r7 = r7.scene
            goto L_0x013c
        L_0x013b:
            r7 = 0
        L_0x013c:
            if (r1 != 0) goto L_0x0161
            if (r7 == 0) goto L_0x0142
            r1 = r7
            goto L_0x0161
        L_0x0142:
            int r1 = r6.business_type
            r9 = 1
            if (r1 == r9) goto L_0x015e
            r6 = 2
            if (r1 == r6) goto L_0x015b
            r6 = 7
            if (r1 == r6) goto L_0x0158
            r6 = 12
            if (r1 == r6) goto L_0x0155
            r1 = 111166(0x1b23e, float:1.55777E-40)
            goto L_0x0162
        L_0x0155:
            r1 = 1213(0x4bd, float:1.7E-42)
            goto L_0x0162
        L_0x0158:
            r1 = 1193(0x4a9, float:1.672E-42)
            goto L_0x0162
        L_0x015b:
            r1 = 1200(0x4b0, float:1.682E-42)
            goto L_0x0162
        L_0x015e:
            r1 = 1184(0x4a0, float:1.659E-42)
            goto L_0x0162
        L_0x0161:
            r9 = 1
        L_0x0162:
            r8.f250939k = r1
            java.lang.String r1 = r0.f34836j
            java.lang.String r6 = r0.f34833g
            if (r1 == 0) goto L_0x0173
            int r7 = r1.length()
            if (r7 != 0) goto L_0x0171
            goto L_0x0173
        L_0x0171:
            r7 = 0
            goto L_0x0174
        L_0x0173:
            r7 = 1
        L_0x0174:
            if (r7 != 0) goto L_0x0178
            r15 = r1
            goto L_0x01a3
        L_0x0178:
            if (r15 == 0) goto L_0x0183
            int r1 = r15.length()
            if (r1 != 0) goto L_0x0181
            goto L_0x0183
        L_0x0181:
            r1 = 0
            goto L_0x0184
        L_0x0183:
            r1 = 1
        L_0x0184:
            if (r1 != 0) goto L_0x0187
            goto L_0x01a3
        L_0x0187:
            java.lang.String r1 = "comment"
            boolean r1 = gy3.C87412m.m108589b(r1, r6)
            if (r1 == 0) goto L_0x0192
            r17 = 2
            goto L_0x019f
        L_0x0192:
            java.lang.String r1 = "TWO_FLOW"
            boolean r1 = gy3.C87412m.m108589b(r1, r6)
            if (r1 == 0) goto L_0x019d
            r17 = 4
            goto L_0x019f
        L_0x019d:
            r17 = 1
        L_0x019f:
            java.lang.String r15 = java.lang.String.valueOf(r17)
        L_0x01a3:
            r8.f250940l = r15
            pf1.e0 r1 = new pf1.e0
            r1.<init>(r4)
            r8.f250937i = r1
            java.lang.Class r1 = r22.getClass()
            java.lang.String r1 = r1.getName()
            boolean r1 = r3.mo87318i(r1)
            if (r1 == 0) goto L_0x01be
            wi0.a0 r1 = wi0.C90973a0.OPAQUE
            r8.f250913B = r1
        L_0x01be:
            up1.f r1 = up1.C37521f.f99374d
            r1.getClass()
            re1.a r1 = up1.C37521f.f99218K8
            java.lang.Object r1 = r1.mo60266n()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x01d3
            r1 = 2
            goto L_0x01d4
        L_0x01d3:
            r1 = 0
        L_0x01d4:
            r8.f250931c = r1
            if (r2 == 0) goto L_0x0210
            java.lang.Class r1 = r22.getClass()
            java.lang.String r4 = r1.getName()
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r6 = r0.f34830d
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = r0.f34827a
            com.tencent.mm.protocal.protobuf.MiniAppInfo r1 = r0.mini_app_info
            if (r1 == 0) goto L_0x01ec
            boolean r1 = r1.hide_default_bar
            r7 = r1
            goto L_0x01ed
        L_0x01ec:
            r7 = 0
        L_0x01ed:
            int r15 = r0.business_type
            r17 = 0
            r18 = 1024(0x400, float:1.435E-42)
            r19 = 0
            r0 = r3
            r1 = r22
            r2 = r8
            r3 = r4
            r4 = r6
            r6 = r7
            r7 = r15
            r15 = r8
            r8 = r13
            r13 = 1
            r9 = r11
            r11 = r17
            r20 = r12
            r12 = r18
            r17 = r15
            r15 = 1
            r13 = r19
            m73169g(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0215
        L_0x0210:
            r17 = r8
            r20 = r12
            r15 = 1
        L_0x0215:
            r0 = r22
            boolean r1 = r0 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r1 == 0) goto L_0x021f
            r16 = r0
            com.tencent.mm.ui.MMActivity r16 = (com.tencent.p014mm.p136ui.MMActivity) r16
        L_0x021f:
            if (r16 == 0) goto L_0x028b
            android.content.Intent r1 = r16.getIntent()
            java.lang.String r2 = "report_scene"
            r3 = 0
            int r1 = r1.getIntExtra(r2, r3)
            android.content.Intent r2 = r16.getIntent()
            java.lang.String r3 = "from_user"
            java.lang.String r2 = r2.getStringExtra(r3)
            android.content.Intent r3 = r16.getIntent()
            java.lang.String r4 = "key_from_user_name"
            java.lang.String r3 = r3.getStringExtra(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "scene :"
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = " fromUser:"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r5 = " fromUserName："
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r4)
            if (r1 == r15) goto L_0x027c
            r4 = 2
            if (r1 == r4) goto L_0x027c
            r3 = 3
            if (r1 == r3) goto L_0x026d
            goto L_0x028b
        L_0x026d:
            com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder r1 = com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder.f210858a
            com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$JsApiPayInfo r3 = new com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$JsApiPayInfo
            r4 = r21
            r3.<init>(r2, r4)
            r13 = r20
            r1.mo99898a(r13, r3)
            goto L_0x028b
        L_0x027c:
            r4 = r21
            r13 = r20
            com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder r1 = com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder.f210858a
            com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$JsApiPayInfo r5 = new com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$JsApiPayInfo
            r6 = 0
            r5.<init>(r2, r3, r6, r4)
            r1.mo99898a(r13, r5)
        L_0x028b:
            java.lang.Class<kr0.x0> r1 = kr0.C76630x0.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            kr0.x0 r1 = (kr0.C76630x0) r1
            r3 = r17
            r1.mo106898tv(r0, r3)
        L_0x0298:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pf1.C62262d0.m73170n(pf1.d0, android.content.Context, pf1.q, int, boolean, jq3.o, float, int, java.lang.Object):void");
    }

    /* renamed from: t */
    public static void m73171t(C62262d0 d0Var, Context context, C64726td1 td12, String str, C64793w23 w232, int i, Object obj) {
        String str2 = "";
        if ((i & 4) != 0) {
            str = str2;
        }
        if ((i & 8) != 0) {
            w232 = null;
        }
        d0Var.getClass();
        C87412m.m108594g(context, "context");
        C87412m.m108594g(td12, "musicInfo");
        C87412m.m108594g(str, "posterFinderNickName");
        C64719t23 t232 = new C64719t23();
        Intent intent = new Intent();
        intent.putExtra("key_mv_cover_url", td12.f185535e);
        intent.putExtra("key_mv_poster", str);
        boolean z = true;
        intent.putExtra("key_need_update_music_ball_url", true);
        intent.putExtra("key_mv_music_duration", td12.f185543p);
        t232.f185461f = td12.f185535e;
        t232.f185462g = str;
        t232.f185463h = td12.f185537g;
        String str3 = td12.f185538h;
        if (!(str3 == null || str3.length() == 0)) {
            z = false;
        }
        t232.f185464i = z ? td12.f185536f : td12.f185538h;
        t232.f185469q = td12.f185543p;
        t232.f185473u = td12.f185536f;
        t232.f185475w = td12.f185535e;
        t232.f185472t = t232.f185461f;
        t232.f185470r = td12.f185534d;
        t232.f185474v = td12.f185548u;
        t232.f185468p = td12.f185549v;
        t232.f185465j = td12.f185550w;
        Log.m105924i("Finder.JumperUtils", "jump to musicMvMainUI");
        C64488kb1 kb12 = new C64488kb1();
        String str4 = td12.f185534d;
        kb12.f183909i = str4;
        kb12.f183904d = td12.f185536f;
        kb12.f183905e = td12.f185537g;
        String str5 = td12.f185539i;
        kb12.f183906f = str5;
        kb12.f183908h = str5;
        kb12.f183911n = td12.f185538h;
        kb12.f183912o = td12.f185535e;
        kb12.f183918u = td12.f185543p;
        kb12.f183907g = td12.f185540j;
        C65415e0 e0Var = C65415e0.f188260a;
        if (str4 == null) {
            str4 = str2;
        }
        e0Var.mo89507e(kb12, str4, 13, t232);
        String str6 = t232.f185473u;
        if (str6 == null) {
            str6 = str2;
        }
        intent.putExtra("key_mv_song_name", str6);
        String str7 = t232.f185474v;
        if (str7 == null) {
            str7 = str2;
        }
        intent.putExtra("key_mv_song_lyric", str7);
        String str8 = t232.f185463h;
        if (str8 == null) {
            str8 = str2;
        }
        intent.putExtra("key_mv_singer_name", str8);
        String str9 = t232.f185464i;
        if (str9 == null) {
            str9 = str2;
        }
        intent.putExtra("key_mv_album_name", str9);
        String str10 = t232.f185466n;
        if (str10 == null) {
            str10 = str2;
        }
        intent.putExtra("key_mv_music_genre", str10);
        intent.putExtra("key_mv_issue_date", String.valueOf(t232.f185467o));
        String str11 = t232.f185475w;
        if (str11 == null) {
            str11 = str2;
        }
        intent.putExtra("key_mv_album_cover_url", str11);
        String str12 = t232.f185468p;
        if (str12 == null) {
            str12 = str2;
        }
        intent.putExtra("key_mv_identification", str12);
        String str13 = t232.f185465j;
        if (str13 != null) {
            str2 = str13;
        }
        intent.putExtra("key_mv_extra_info", str2);
        intent.putExtra("key_mv_music_duration", t232.f185469q);
        intent.putExtra("key_mv_music_operation_url", t232.f185471s);
        intent.putExtra("key_mv_song_mid", t232.f185470r);
        if (w232 != null) {
            intent.putExtra("key_mv_report_data", w232.toByteArray());
        }
        ((C58684b) C86312j.m106911c(C58684b.class)).jy0(context, intent);
    }

    /* renamed from: a */
    public final void mo87312a(Intent intent, C32226l<? super FinderJumpInfo, C13598b0> lVar) {
        C87412m.m108594g(lVar, "callback");
        byte[] byteArrayExtra = intent != null ? intent.getByteArrayExtra("KEY_JUMP_INFO") : null;
        if (byteArrayExtra != null) {
            FinderJumpInfo finderJumpInfo = new FinderJumpInfo();
            finderJumpInfo.parseFrom(byteArrayExtra);
            lVar.invoke(finderJumpInfo);
            return;
        }
        C55718s0 G5 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0().mo77227G5("FinderEntrance");
        if (G5 != null) {
            C64586nn1 o2 = G5.mo77308o2("FinderEntrance");
            FinderJumpInfo finderJumpInfo2 = G5.f158585F.f186539A;
            if (o2 != null && finderJumpInfo2 != null && finderJumpInfo2.jumpinfo_type == 3) {
                lVar.invoke(finderJumpInfo2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01d6 A[Catch:{ Exception -> 0x01f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x030a A[Catch:{ Exception -> 0x0314 }] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x030c A[Catch:{ Exception -> 0x0314 }] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x030f A[Catch:{ Exception -> 0x0314 }] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0466  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x04c4  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x04d2 A[Catch:{ Exception -> 0x04dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x04d4 A[Catch:{ Exception -> 0x04dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x04d7 A[Catch:{ Exception -> 0x04dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x051d  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0524  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x05b4 A[Catch:{ Exception -> 0x05c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x05b6 A[Catch:{ Exception -> 0x05c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x05b9 A[Catch:{ Exception -> 0x05c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x05bf  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x05d6 A[Catch:{ Exception -> 0x05e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x05d8 A[Catch:{ Exception -> 0x05e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x05db A[Catch:{ Exception -> 0x05e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x05e1  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x05f8 A[Catch:{ Exception -> 0x0605 }] */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x05fa A[Catch:{ Exception -> 0x0605 }] */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x05fd A[Catch:{ Exception -> 0x0605 }] */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0603  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x061a A[Catch:{ Exception -> 0x0624 }] */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x061c A[Catch:{ Exception -> 0x0624 }] */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x061f A[Catch:{ Exception -> 0x0624 }] */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x0680 A[Catch:{ Exception -> 0x068a }] */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0682 A[Catch:{ Exception -> 0x068a }] */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0685 A[Catch:{ Exception -> 0x068a }] */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x0709  */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x0710  */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x0719 A[Catch:{ Exception -> 0x0723 }] */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x071b A[Catch:{ Exception -> 0x0723 }] */
    /* JADX WARNING: Removed duplicated region for block: B:370:0x071e A[Catch:{ Exception -> 0x0723 }] */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x0748  */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x074d  */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x0770  */
    /* JADX WARNING: Removed duplicated region for block: B:402:0x07cf A[Catch:{ Exception -> 0x07dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x07d1 A[Catch:{ Exception -> 0x07dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x07d4 A[Catch:{ Exception -> 0x07dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x07da  */
    /* JADX WARNING: Removed duplicated region for block: B:415:0x07f3  */
    /* JADX WARNING: Removed duplicated region for block: B:416:0x07f5  */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x07f8 A[SYNTHETIC, Splitter:B:418:0x07f8] */
    /* JADX WARNING: Removed duplicated region for block: B:426:0x080c  */
    /* JADX WARNING: Removed duplicated region for block: B:448:0x08b0 A[Catch:{ Exception -> 0x08bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:449:0x08b2 A[Catch:{ Exception -> 0x08bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:451:0x08b5 A[Catch:{ Exception -> 0x08bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:453:0x08bb  */
    /* JADX WARNING: Removed duplicated region for block: B:461:0x08d0 A[Catch:{ Exception -> 0x08da }] */
    /* JADX WARNING: Removed duplicated region for block: B:462:0x08d2 A[Catch:{ Exception -> 0x08da }] */
    /* JADX WARNING: Removed duplicated region for block: B:464:0x08d5 A[Catch:{ Exception -> 0x08da }] */
    /* JADX WARNING: Removed duplicated region for block: B:469:0x08e8  */
    /* JADX WARNING: Removed duplicated region for block: B:519:0x0a13  */
    /* JADX WARNING: Removed duplicated region for block: B:522:0x0a2d  */
    /* JADX WARNING: Removed duplicated region for block: B:530:0x0a44  */
    /* JADX WARNING: Removed duplicated region for block: B:531:0x0a49  */
    /* JADX WARNING: Removed duplicated region for block: B:533:0x0a4c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:549:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010f A[SYNTHETIC, Splitter:B:56:0x010f] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01b7 A[ADDED_TO_REGION] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87313b(android.content.Context r32, pf1.C11920q r33, int r34, jq3.C60905o r35) {
        /*
            r31 = this;
            r10 = r31
            r9 = r32
            r3 = r33
            r6 = r34
            java.lang.Class<ht1.t1> r1 = ht1.C60200t1.class
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "infoEx"
            gy3.C87412m.m108594g(r3, r0)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = r3.f34827a
            int r0 = r0.jumpinfo_type
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "[dispatchJump] jumpinfo_type="
            r2.append(r4)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "Finder.JumperUtils"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            r2 = 1
            if (r0 == r2) goto L_0x0a6f
            r5 = 2
            if (r0 == r5) goto L_0x0a68
            r7 = 6
            r8 = 3
            r11 = 4
            r12 = 0
            if (r0 == r8) goto L_0x004b
            if (r0 == r11) goto L_0x0045
            if (r0 == r7) goto L_0x0040
            goto L_0x0a85
        L_0x0040:
            r10.mo87322m(r9, r3, r12, r12)
            goto L_0x0a85
        L_0x0045:
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = r3.f34827a
            com.tencent.mm.protocal.protobuf.SchemaInfo r0 = r0.schema_info
            goto L_0x0a85
        L_0x004b:
            java.lang.Class<er1.b> r13 = er1.C58684b.class
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = r3.f34827a
            com.tencent.mm.protocal.protobuf.NativeInfo r0 = r0.native_info
            if (r0 == 0) goto L_0x005b
            int r0 = r0.native_type
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r14 = r0
            goto L_0x005c
        L_0x005b:
            r14 = r12
        L_0x005c:
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = r3.f34827a
            java.lang.String r15 = r0.wording
            int r7 = r0.business_type
            com.tencent.mm.protocal.protobuf.NativeInfo r0 = r0.native_info
            java.lang.String r11 = ""
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = r0.necessary_params
            if (r0 != 0) goto L_0x006d
        L_0x006c:
            r0 = r11
        L_0x006d:
            boolean r8 = r10.mo87317h(r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r12 = "[jumpNative] isHalf="
            r5.append(r12)
            r5.append(r8)
            java.lang.String r12 = " type="
            r5.append(r12)
            r5.append(r14)
            java.lang.String r12 = " businessType="
            r5.append(r12)
            r5.append(r7)
            java.lang.String r12 = " wording="
            r5.append(r12)
            r5.append(r15)
            java.lang.String r12 = " necessaryParams="
            r5.append(r12)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00ab }
            r5.<init>(r0)     // Catch:{ JSONException -> 0x00ab }
            goto L_0x00b4
        L_0x00ab:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            r5 = 0
        L_0x00b4:
            if (r5 != 0) goto L_0x00bc
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r5 = r0
        L_0x00bc:
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = r3.f34830d
            r19 = 0
            if (r0 == 0) goto L_0x00c7
            long r21 = r0.getItemId()
            goto L_0x00c9
        L_0x00c7:
            r21 = r19
        L_0x00c9:
            java.lang.String r12 = "safeGetString"
            if (r14 != 0) goto L_0x00cf
            goto L_0x024e
        L_0x00cf:
            int r0 = r14.intValue()
            r2 = 1
            if (r0 != r2) goto L_0x024e
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r3.f34830d
            java.lang.String r3 = r3.f34840n
            java.lang.String r0 = "bypassData"
            gy3.C87412m.m108594g(r3, r0)
            java.lang.String r0 = "bizUsername"
            boolean r6 = r5.has(r0)     // Catch:{ Exception -> 0x00f8 }
            if (r6 != r2) goto L_0x00e9
            r2 = 1
            goto L_0x00ea
        L_0x00e9:
            r2 = 0
        L_0x00ea:
            if (r2 == 0) goto L_0x00f4
            java.lang.String r0 = r5.getString(r0)     // Catch:{ Exception -> 0x00f1 }
            goto L_0x00f5
        L_0x00f1:
            r0 = move-exception
            r2 = 1
            goto L_0x00f9
        L_0x00f4:
            r0 = 0
        L_0x00f5:
            r6 = r0
            r2 = 1
            goto L_0x0102
        L_0x00f8:
            r0 = move-exception
        L_0x00f9:
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r7 = 0
            r6[r7] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r12, r11, r6)
            r6 = 0
        L_0x0102:
            java.lang.String r0 = "nickname"
            boolean r7 = r5.has(r0)     // Catch:{ Exception -> 0x0117 }
            if (r7 != r2) goto L_0x010c
            r2 = 1
            goto L_0x010d
        L_0x010c:
            r2 = 0
        L_0x010d:
            if (r2 == 0) goto L_0x0120
            java.lang.String r0 = r5.getString(r0)     // Catch:{ Exception -> 0x0114 }
            goto L_0x0121
        L_0x0114:
            r0 = move-exception
            r2 = 1
            goto L_0x0118
        L_0x0117:
            r0 = move-exception
        L_0x0118:
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r2 = 0
            r5[r2] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r12, r11, r5)
        L_0x0120:
            r0 = 0
        L_0x0121:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "[jumpBizProfile] bizUsername="
            r2.append(r5)
            r2.append(r6)
            java.lang.String r5 = " nickname="
            r2.append(r5)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r5 = "Contact_User"
            r2.putExtra(r5, r6)
            java.lang.String r5 = "Contact_Nick"
            r2.putExtra(r5, r0)
            java.lang.String r0 = "force_get_contact"
            r5 = 1
            r2.putExtra(r0, r5)
            java.lang.String r0 = "key_use_new_contact_profile"
            r2.putExtra(r0, r5)
            r0 = 213(0xd5, float:2.98E-43)
            java.lang.String r6 = "Contact_Scene"
            r2.putExtra(r6, r0)
            java.lang.String r0 = "biz_profile_enter_from_finder"
            r2.putExtra(r0, r5)
            if (r1 == 0) goto L_0x016a
            long r6 = r1.getItemId()
            goto L_0x016c
        L_0x016a:
            r6 = r19
        L_0x016c:
            java.lang.String r0 = "finder_feed_id"
            r2.putExtra(r0, r6)
            java.lang.String r0 = "biz_profile_tab_type"
            r2.putExtra(r0, r5)
            if (r1 == 0) goto L_0x0187
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.mo3513o()
            if (r0 == 0) goto L_0x0187
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            if (r0 == 0) goto L_0x0187
            java.lang.String r0 = r0.sessionBuffer
            goto L_0x0188
        L_0x0187:
            r0 = 0
        L_0x0188:
            if (r0 == 0) goto L_0x0193
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0191
            goto L_0x0193
        L_0x0191:
            r0 = 0
            goto L_0x0194
        L_0x0193:
            r0 = 1
        L_0x0194:
            if (r0 == 0) goto L_0x01b7
            java.lang.Class<dp1.y0> r0 = dp1.C58417y0.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            dp1.y0 r0 = (dp1.C58417y0) r0
            if (r1 == 0) goto L_0x01a4
            long r19 = r1.getItemId()
        L_0x01a4:
            r5 = r19
            rs1.s8$a r1 = rs1.C13442s8.f38060Q0
            rs1.s8 r1 = r1.mo12873f(r9)
            if (r1 == 0) goto L_0x01b1
            int r1 = r1.f38096i
            goto L_0x01b2
        L_0x01b1:
            r1 = 0
        L_0x01b2:
            java.lang.String r11 = r0.mo83281Cu(r5, r1)
            goto L_0x01cb
        L_0x01b7:
            if (r1 == 0) goto L_0x01cb
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.mo3513o()
            if (r0 == 0) goto L_0x01cb
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            if (r0 == 0) goto L_0x01cb
            java.lang.String r0 = r0.sessionBuffer
            if (r0 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x01ca:
            r11 = r0
        L_0x01cb:
            java.lang.String r0 = "Contact_Scene_Note"
            r2.putExtra(r0, r11)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)     // Catch:{ Exception -> 0x01f8 }
            if (r0 != 0) goto L_0x020d
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x01f8 }
            r0.<init>()     // Catch:{ Exception -> 0x01f8 }
            java.lang.String r1 = "commentAdInfo"
            r0.put(r1, r3)     // Catch:{ Exception -> 0x01f8 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01f8 }
            java.lang.String r1 = "JSONObject().apply {\n   …             }.toString()"
            gy3.C87412m.m108593f(r0, r1)     // Catch:{ Exception -> 0x01f8 }
            java.lang.String r1 = ","
            java.lang.String r3 = ";"
            r5 = 0
            java.lang.String r0 = z04.C112551y.m153814n(r0, r1, r3, r5)     // Catch:{ Exception -> 0x01f8 }
            java.lang.String r1 = "Contact_Finder_Buffer"
            r2.putExtra(r1, r0)     // Catch:{ Exception -> 0x01f8 }
            goto L_0x020d
        L_0x01f8:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "jumpBizProfile build finder buffer failed, error="
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
        L_0x020d:
            if (r8 == 0) goto L_0x0244
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r0 = up1.C37521f.f99399f7
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto L_0x0244
            boolean r0 = r9 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r0 == 0) goto L_0x0a85
            bl3.r r0 = bl3.C39818r.f106831a
            r1 = r9
            androidx.appcompat.app.AppCompatActivity r1 = (androidx.appcompat.app.AppCompatActivity) r1
            bl3.r$a r0 = r0.mo62444c(r1)
            java.lang.Class<rs1.z0> r1 = rs1.C13559z0.class
            bl3.t r0 = r0.mo62449e(r1)
            rs1.z0 r0 = (rs1.C13559z0) r0
            if (r0 == 0) goto L_0x0a85
            r1 = r9
            com.tencent.mm.ui.MMActivity r1 = (com.tencent.p014mm.p136ui.MMActivity) r1
            r3 = 0
            r4 = 0
            r0.mo12957c3(r1, r2, r3, r4)
            goto L_0x0a85
        L_0x0244:
            r3 = 0
            java.lang.String r0 = "profile"
            java.lang.String r1 = ".ui.ContactInfoUI"
            ke3.C88144b.m109791i(r9, r0, r1, r2, r3)
            goto L_0x0a85
        L_0x024e:
            if (r14 != 0) goto L_0x0252
            r2 = 2
            goto L_0x02ab
        L_0x0252:
            int r0 = r14.intValue()
            r2 = 2
            if (r0 != r2) goto L_0x02ab
            java.lang.String r0 = "cardId"
            boolean r1 = r5.has(r0)     // Catch:{ Exception -> 0x026c }
            r2 = 1
            if (r1 != r2) goto L_0x0264
            r1 = 1
            goto L_0x0265
        L_0x0264:
            r1 = 0
        L_0x0265:
            if (r1 == 0) goto L_0x0276
            java.lang.String r0 = r5.getString(r0)     // Catch:{ Exception -> 0x026c }
            goto L_0x0277
        L_0x026c:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r12, r11, r1)
        L_0x0276:
            r0 = 0
        L_0x0277:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[jumpCoupon] cardId="
            r1.append(r2)
            r1.append(r0)
            r2 = 32
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<com.tencent.mm.ui.u$c> r2 = com.tencent.p014mm.p136ui.C74928u.C30866c.class
            r1.<init>(r9, r2)
            java.lang.String r2 = "key_card_id"
            r1.putExtra(r2, r0)
            java.lang.String r0 = "key_card_ext"
            r1.putExtra(r0, r11)
            java.lang.String r0 = "card"
            java.lang.String r2 = ".ui.CardDetailUI"
            r3 = 0
            ke3.C88144b.m109791i(r9, r0, r2, r1, r3)
            goto L_0x0a85
        L_0x02ab:
            if (r14 != 0) goto L_0x02ae
            goto L_0x02c2
        L_0x02ae:
            int r0 = r14.intValue()
            r2 = 3
            if (r0 != r2) goto L_0x02c2
            r1 = r31
            r2 = r32
            r3 = r21
            r6 = r34
            r1.mo87323o(r2, r3, r5, r6)
            goto L_0x0a85
        L_0x02c2:
            java.lang.String r2 = "key_topic_type"
            java.lang.String r10 = " byPassInfo="
            r18 = r7
            java.lang.String r7 = "key_by_pass_info"
            r21 = r1
            java.lang.String r1 = "by_pass_info"
            r22 = r15
            java.lang.String r15 = "key_entrance_type"
            if (r14 != 0) goto L_0x02d8
            r24 = r8
            goto L_0x0359
        L_0x02d8:
            int r0 = r14.intValue()
            r24 = r8
            r8 = 4
            if (r0 != r8) goto L_0x0359
            java.lang.String r0 = "topic"
            boolean r3 = r5.has(r0)     // Catch:{ Exception -> 0x02f9 }
            r8 = 1
            if (r3 != r8) goto L_0x02ed
            r3 = 1
            goto L_0x02ee
        L_0x02ed:
            r3 = 0
        L_0x02ee:
            if (r3 == 0) goto L_0x02f7
            java.lang.String r0 = r5.getString(r0)     // Catch:{ Exception -> 0x02f9 }
            r8 = r0
            r3 = 1
            goto L_0x0304
        L_0x02f7:
            r3 = 1
            goto L_0x0303
        L_0x02f9:
            r0 = move-exception
            r3 = 1
            java.lang.Object[] r8 = new java.lang.Object[r3]
            r14 = 0
            r8[r14] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r12, r11, r8)
        L_0x0303:
            r8 = 0
        L_0x0304:
            boolean r0 = r5.has(r1)     // Catch:{ Exception -> 0x0314 }
            if (r0 != r3) goto L_0x030c
            r0 = 1
            goto L_0x030d
        L_0x030c:
            r0 = 0
        L_0x030d:
            if (r0 == 0) goto L_0x031f
            java.lang.String r12 = r5.getString(r1)     // Catch:{ Exception -> 0x0314 }
            goto L_0x0320
        L_0x0314:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r23 = 0
            r3[r23] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r12, r11, r3)
        L_0x031f:
            r12 = 0
        L_0x0320:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[jumpTopic] topic="
            r0.append(r1)
            r0.append(r8)
            r0.append(r10)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r1 = 1
            r0.putExtra(r2, r1)
            r0.putExtra(r7, r12)
            java.lang.String r1 = "key_topic_title"
            r0.putExtra(r1, r8)
            r0.putExtra(r15, r6)
            di3.d r1 = di3.C86312j.m106911c(r13)
            er1.b r1 = (er1.C58684b) r1
            r1.F50(r9, r0)
            goto L_0x096e
        L_0x0359:
            r23 = 0
            if (r14 != 0) goto L_0x035f
            goto L_0x03e0
        L_0x035f:
            int r0 = r14.intValue()
            r8 = 6
            if (r0 != r8) goto L_0x03e0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[jumpSticker] necessaryParams="
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            java.lang.String r0 = "productId"
            boolean r1 = r5.has(r0)
            if (r1 == 0) goto L_0x096e
            java.lang.String r0 = r5.optString(r0)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI"
            r1.setClassName(r9, r2)
            java.lang.String r2 = "extra_id"
            r1.putExtra(r2, r0)
            r0 = 106(0x6a, float:1.49E-43)
            java.lang.String r2 = "preceding_scence"
            r1.putExtra(r2, r0)
            r0 = 36
            java.lang.String r2 = "download_entrance_scene"
            r1.putExtra(r2, r0)
            r1.putExtra(r15, r6)
            k20.a r0 = new k20.a
            r0.<init>()
            r0.mo10233c(r1)
            java.lang.Object[] r2 = r0.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/feed/jumper/JumperUtils"
            java.lang.String r4 = "jumpSticker"
            java.lang.String r5 = "(Landroid/content/Context;Lorg/json/JSONObject;I)V"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r1 = r32
            r10 = 0
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r0.mo10231a(r10)
            android.content.Intent r0 = (android.content.Intent) r0
            r9.startActivity(r0)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/feed/jumper/JumperUtils"
            java.lang.String r3 = "jumpSticker"
            java.lang.String r4 = "(Landroid/content/Context;Lorg/json/JSONObject;I)V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x096e
        L_0x03e0:
            r8 = 0
            r0 = 7
            if (r14 != 0) goto L_0x03e6
            goto L_0x046b
        L_0x03e6:
            int r8 = r14.intValue()
            if (r8 != r0) goto L_0x046b
            fe1.q r0 = r3.f34835i
            if (r0 == 0) goto L_0x03f6
            java.lang.String r0 = r0.getUsername()
            r1 = r0
            goto L_0x03f7
        L_0x03f6:
            r1 = r11
        L_0x03f7:
            java.lang.String r0 = "kf_url"
            boolean r2 = r5.has(r0)     // Catch:{ Exception -> 0x040a }
            r3 = 1
            if (r2 != r3) goto L_0x0402
            r2 = 1
            goto L_0x0403
        L_0x0402:
            r2 = 0
        L_0x0403:
            if (r2 == 0) goto L_0x0414
            java.lang.String r12 = r5.getString(r0)     // Catch:{ Exception -> 0x040a }
            goto L_0x0415
        L_0x040a:
            r0 = move-exception
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r12, r11, r2)
        L_0x0414:
            r12 = 0
        L_0x0415:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "[jumpWeComKF] kfUrl="
            r0.append(r2)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest r0 = new com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest
            r0.<init>()
            r0.f108515d = r9
            long r2 = java.lang.System.currentTimeMillis()
            r0.f108516e = r2
            r2 = 9
            r0.f108517f = r2
            te3.s3 r2 = new te3.s3
            r2.<init>()
            r2.f141285d = r12
            te3.i73 r3 = new te3.i73
            r3.<init>()
            int r4 = r0.f108517f
            r3.f135154d = r4
            r3.f135156f = r12
            r3.f135155e = r1
            r2.f141288g = r3
            r0.f108520i = r2
            int r1 = he0.C46025n.m51344a(r4)
            r0.f108519h = r1
            r8 = r24
            r0.f108521j = r8
            java.lang.Class<he0.i> r1 = he0.C59837i.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            he0.i r1 = (he0.C59837i) r1
            if (r1 == 0) goto L_0x096e
            r1.mo71855jT(r0)
            goto L_0x096e
        L_0x046b:
            java.lang.String r8 = "getService(ActivityRouter::class.java)"
            r16 = r2
            java.lang.String r2 = " eventName:"
            java.lang.String r9 = "eventTopicId :"
            r25 = r8
            java.lang.String r8 = "key_activity_name"
            r26 = r13
            java.lang.String r13 = "key_activity_id"
            java.lang.String r0 = "topic_id"
            if (r14 != 0) goto L_0x048c
            r28 = r14
            r27 = r25
            r25 = r10
            r10 = r9
            r9 = r15
            r15 = r32
            goto L_0x0574
        L_0x048c:
            r27 = r2
            int r2 = r14.intValue()
            r28 = r14
            r14 = 8
            if (r2 != r14) goto L_0x0568
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r3.f34830d
            if (r22 != 0) goto L_0x049e
            r3 = r11
            goto L_0x04a0
        L_0x049e:
            r3 = r22
        L_0x04a0:
            boolean r14 = r5.has(r0)     // Catch:{ Exception -> 0x04b5 }
            r29 = r9
            r9 = 1
            if (r14 != r9) goto L_0x04ab
            r9 = 1
            goto L_0x04ac
        L_0x04ab:
            r9 = 0
        L_0x04ac:
            if (r9 == 0) goto L_0x04c1
            java.lang.String r0 = r5.getString(r0)     // Catch:{ Exception -> 0x04b3 }
            goto L_0x04c2
        L_0x04b3:
            r0 = move-exception
            goto L_0x04b8
        L_0x04b5:
            r0 = move-exception
            r29 = r9
        L_0x04b8:
            r9 = 1
            java.lang.Object[] r14 = new java.lang.Object[r9]
            r9 = 0
            r14[r9] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r12, r11, r14)
        L_0x04c1:
            r0 = 0
        L_0x04c2:
            if (r0 == 0) goto L_0x04c8
            long r19 = o40.C61926c.m72671P(r0)
        L_0x04c8:
            r9 = r15
            r14 = r19
            boolean r0 = r5.has(r1)     // Catch:{ Exception -> 0x04dc }
            r6 = 1
            if (r0 != r6) goto L_0x04d4
            r0 = 1
            goto L_0x04d5
        L_0x04d4:
            r0 = 0
        L_0x04d5:
            if (r0 == 0) goto L_0x04e6
            java.lang.String r0 = r5.getString(r1)     // Catch:{ Exception -> 0x04dc }
            goto L_0x04e7
        L_0x04dc:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r1 = 0
            r5[r1] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r12, r11, r5)
        L_0x04e6:
            r0 = 0
        L_0x04e7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "[jumpEvent] eventTopicId="
            r1.append(r5)
            r1.append(r14)
            r1.append(r10)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r1.putExtra(r13, r14)
            r1.putExtra(r7, r0)
            r1.putExtra(r8, r3)
            if (r2 == 0) goto L_0x0524
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r2.mo3513o()
            if (r0 == 0) goto L_0x0524
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            if (r0 == 0) goto L_0x0524
            long r5 = r0.f164794id
            java.lang.Long r12 = java.lang.Long.valueOf(r5)
            goto L_0x0525
        L_0x0524:
            r12 = 0
        L_0x0525:
            java.lang.String r0 = "key_feed_ref_id"
            r1.putExtra(r0, r12)
            r6 = r34
            r1.putExtra(r9, r6)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2 = r29
            r0.append(r2)
            r0.append(r14)
            r2 = r27
            r0.append(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            kd1.f r0 = kd1.C9584f.f29822a
            long r2 = eb0.C31543z5.m39453c()
            r4 = 1
            r0.mo10262a(r1, r2, r4)
            di3.d r0 = di3.C86312j.m106911c(r26)
            r14 = r25
            gy3.C87412m.m108593f(r0, r14)
            er1.b r0 = (er1.C58684b) r0
            r15 = r32
            r2 = 0
            r0.vx0(r15, r1, r2)
            goto L_0x096e
        L_0x0568:
            r14 = r25
            r2 = r27
            r25 = r10
            r10 = r9
            r9 = r15
            r15 = r32
            r27 = r14
        L_0x0574:
            r14 = 11
            if (r28 != 0) goto L_0x057c
            r29 = r2
            goto L_0x063f
        L_0x057c:
            r29 = r2
            int r2 = r28.intValue()
            if (r2 != r14) goto L_0x063f
            te3.td1 r3 = new te3.td1
            r3.<init>()
            java.lang.String r0 = "doc_id"
            boolean r1 = r5.has(r0)     // Catch:{ Exception -> 0x059f }
            r2 = 1
            if (r1 != r2) goto L_0x0594
            r1 = 1
            goto L_0x0595
        L_0x0594:
            r1 = 0
        L_0x0595:
            if (r1 == 0) goto L_0x059d
            java.lang.String r0 = r5.getString(r0)     // Catch:{ Exception -> 0x059f }
            r1 = 1
            goto L_0x05aa
        L_0x059d:
            r1 = 1
            goto L_0x05a9
        L_0x059f:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r4 = 0
            r2[r4] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r12, r11, r2)
        L_0x05a9:
            r0 = 0
        L_0x05aa:
            r3.f185534d = r0
            java.lang.String r0 = "album_thumb_url"
            boolean r2 = r5.has(r0)     // Catch:{ Exception -> 0x05c1 }
            if (r2 != r1) goto L_0x05b6
            r1 = 1
            goto L_0x05b7
        L_0x05b6:
            r1 = 0
        L_0x05b7:
            if (r1 == 0) goto L_0x05bf
            java.lang.String r0 = r5.getString(r0)     // Catch:{ Exception -> 0x05c1 }
            r1 = 1
            goto L_0x05cc
        L_0x05bf:
            r1 = 1
            goto L_0x05cb
        L_0x05c1:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r4 = 0
            r2[r4] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r12, r11, r2)
        L_0x05cb:
            r0 = 0
        L_0x05cc:
            r3.f185535e = r0
            java.lang.String r0 = "name"
            boolean r2 = r5.has(r0)     // Catch:{ Exception -> 0x05e3 }
            if (r2 != r1) goto L_0x05d8
            r1 = 1
            goto L_0x05d9
        L_0x05d8:
            r1 = 0
        L_0x05d9:
            if (r1 == 0) goto L_0x05e1
            java.lang.String r0 = r5.getString(r0)     // Catch:{ Exception -> 0x05e3 }
            r1 = 1
            goto L_0x05ee
        L_0x05e1:
            r1 = 1
            goto L_0x05ed
        L_0x05e3:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r4 = 0
            r2[r4] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r12, r11, r2)
        L_0x05ed:
            r0 = 0
        L_0x05ee:
            r3.f185536f = r0
            java.lang.String r0 = "artist"
            boolean r2 = r5.has(r0)     // Catch:{ Exception -> 0x0605 }
            if (r2 != r1) goto L_0x05fa
            r1 = 1
            goto L_0x05fb
        L_0x05fa:
            r1 = 0
        L_0x05fb:
            if (r1 == 0) goto L_0x0603
            java.lang.String r0 = r5.getString(r0)     // Catch:{ Exception -> 0x0605 }
            r1 = 1
            goto L_0x0610
        L_0x0603:
            r1 = 1
            goto L_0x060f
        L_0x0605:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r4 = 0
            r2[r4] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r12, r11, r2)
        L_0x060f:
            r0 = 0
        L_0x0610:
            r3.f185537g = r0
            java.lang.String r0 = "media_streaming_url"
            boolean r2 = r5.has(r0)     // Catch:{ Exception -> 0x0624 }
            if (r2 != r1) goto L_0x061c
            r1 = 1
            goto L_0x061d
        L_0x061c:
            r1 = 0
        L_0x061d:
            if (r1 == 0) goto L_0x062e
            java.lang.String r12 = r5.getString(r0)     // Catch:{ Exception -> 0x0624 }
            goto L_0x062f
        L_0x0624:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r12, r11, r1)
        L_0x062e:
            r12 = 0
        L_0x062f:
            r3.f185539i = r12
            pf1.d0 r1 = f176978a
            r4 = 0
            r5 = 0
            r6 = 12
            r7 = 0
            r2 = r32
            m73171t(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x096e
        L_0x063f:
            java.lang.String r14 = "object_id"
            java.lang.String r2 = " nonceId="
            if (r28 != 0) goto L_0x0649
            r30 = r10
            goto L_0x06c8
        L_0x0649:
            r30 = r10
            int r10 = r28.intValue()
            r6 = 12
            if (r10 != r6) goto L_0x06c8
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            boolean r0 = r5.has(r14)     // Catch:{ Exception -> 0x066d }
            r3 = 1
            if (r0 != r3) goto L_0x0661
            r0 = 1
            goto L_0x0662
        L_0x0661:
            r0 = 0
        L_0x0662:
            if (r0 == 0) goto L_0x066b
            java.lang.String r0 = r5.getString(r14)     // Catch:{ Exception -> 0x066d }
            r6 = r0
            r3 = 1
            goto L_0x0678
        L_0x066b:
            r3 = 1
            goto L_0x0677
        L_0x066d:
            r0 = move-exception
            r3 = 1
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r7 = 0
            r6[r7] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r12, r11, r6)
        L_0x0677:
            r6 = 0
        L_0x0678:
            java.lang.String r0 = "object_nonce_id"
            boolean r7 = r5.has(r0)     // Catch:{ Exception -> 0x068a }
            if (r7 != r3) goto L_0x0682
            r3 = 1
            goto L_0x0683
        L_0x0682:
            r3 = 0
        L_0x0683:
            if (r3 == 0) goto L_0x0694
            java.lang.String r12 = r5.getString(r0)     // Catch:{ Exception -> 0x068a }
            goto L_0x0695
        L_0x068a:
            r0 = move-exception
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r5 = 0
            r3[r5] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r12, r11, r3)
        L_0x0694:
            r12 = 0
        L_0x0695:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "[jumpToFinderVideo] objectId="
            r0.append(r3)
            r0.append(r6)
            r0.append(r2)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            long r2 = o40.C61926c.m72671P(r6)
            java.lang.String r0 = "feed_object_id"
            r1.putExtra(r0, r2)
            java.lang.String r0 = "KEY_OBJECT_NONCE_ID"
            r1.putExtra(r0, r12)
            di3.d r0 = di3.C86312j.m106911c(r21)
            ht1.t1 r0 = (ht1.C60200t1) r0
            r0.mo76864nr(r15, r1)
            goto L_0x096e
        L_0x06c8:
            r6 = 13
            if (r28 != 0) goto L_0x06ce
            goto L_0x0796
        L_0x06ce:
            int r10 = r28.intValue()
            if (r10 != r6) goto L_0x0796
            r2 = 18
            r6 = r18
            if (r6 == r2) goto L_0x06e2
            r2 = 21
            if (r6 == r2) goto L_0x06e0
            r2 = 0
            goto L_0x06e3
        L_0x06e0:
            r2 = 2
            goto L_0x06e3
        L_0x06e2:
            r2 = 1
        L_0x06e3:
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r3.f34830d
            if (r22 != 0) goto L_0x06e9
            r6 = r11
            goto L_0x06eb
        L_0x06e9:
            r6 = r22
        L_0x06eb:
            boolean r10 = r5.has(r0)     // Catch:{ Exception -> 0x06fc }
            r14 = 1
            if (r10 != r14) goto L_0x06f4
            r10 = 1
            goto L_0x06f5
        L_0x06f4:
            r10 = 0
        L_0x06f5:
            if (r10 == 0) goto L_0x0706
            java.lang.String r0 = r5.getString(r0)     // Catch:{ Exception -> 0x06fc }
            goto L_0x0707
        L_0x06fc:
            r0 = move-exception
            r10 = 1
            java.lang.Object[] r14 = new java.lang.Object[r10]
            r10 = 0
            r14[r10] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r12, r11, r14)
        L_0x0706:
            r0 = 0
        L_0x0707:
            if (r0 == 0) goto L_0x0710
            long r16 = o40.C61926c.m72671P(r0)
            r14 = r16
            goto L_0x0712
        L_0x0710:
            r14 = r19
        L_0x0712:
            boolean r0 = r5.has(r1)     // Catch:{ Exception -> 0x0723 }
            r10 = 1
            if (r0 != r10) goto L_0x071b
            r0 = 1
            goto L_0x071c
        L_0x071b:
            r0 = 0
        L_0x071c:
            if (r0 == 0) goto L_0x072d
            java.lang.String r12 = r5.getString(r1)     // Catch:{ Exception -> 0x0723 }
            goto L_0x072e
        L_0x0723:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r5 = 0
            r1[r5] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r12, r11, r1)
        L_0x072d:
            r12 = 0
        L_0x072e:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r0.putExtra(r13, r14)
            r0.putExtra(r7, r12)
            r0.putExtra(r8, r6)
            r8 = r34
            r0.putExtra(r9, r8)
            java.lang.String r1 = "key_source_type"
            r0.putExtra(r1, r2)
            if (r3 == 0) goto L_0x074d
            long r1 = r3.getItemId()
            goto L_0x074f
        L_0x074d:
            r1 = r19
        L_0x074f:
            java.lang.String r5 = "key_feed_id"
            r0.putExtra(r5, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = r30
            r1.append(r2)
            r1.append(r14)
            r2 = r29
            r1.append(r2)
            r1.append(r6)
            java.lang.String r2 = " feedId:"
            r1.append(r2)
            if (r3 == 0) goto L_0x0774
            long r19 = r3.getItemId()
        L_0x0774:
            r2 = r19
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            di3.d r1 = di3.C86312j.m106911c(r26)
            r2 = r27
            gy3.C87412m.m108593f(r1, r2)
            er1.b r1 = (er1.C58684b) r1
            r4 = 0
            r5 = 4
            r6 = 0
            r2 = r32
            r3 = r0
            er1.C58684b.ly0(r1, r2, r3, r4, r5, r6)
            goto L_0x096e
        L_0x0796:
            r8 = r34
            r6 = 14
            if (r28 != 0) goto L_0x079e
            goto L_0x087b
        L_0x079e:
            int r10 = r28.intValue()
            if (r10 != r6) goto L_0x087b
            boolean r0 = r5.has(r14)     // Catch:{ Exception -> 0x07b8 }
            r1 = 1
            if (r0 != r1) goto L_0x07ad
            r0 = 1
            goto L_0x07ae
        L_0x07ad:
            r0 = 0
        L_0x07ae:
            if (r0 == 0) goto L_0x07b6
            java.lang.String r0 = r5.getString(r14)     // Catch:{ Exception -> 0x07b8 }
            r1 = 1
            goto L_0x07c3
        L_0x07b6:
            r1 = 1
            goto L_0x07c2
        L_0x07b8:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r6 = 0
            r3[r6] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r12, r11, r3)
        L_0x07c2:
            r0 = 0
        L_0x07c3:
            long r6 = o40.C61926c.m72671P(r0)
            java.lang.String r0 = "liveid"
            boolean r3 = r5.has(r0)     // Catch:{ Exception -> 0x07dc }
            if (r3 != r1) goto L_0x07d1
            r1 = 1
            goto L_0x07d2
        L_0x07d1:
            r1 = 0
        L_0x07d2:
            if (r1 == 0) goto L_0x07da
            java.lang.String r0 = r5.getString(r0)     // Catch:{ Exception -> 0x07dc }
            r1 = 1
            goto L_0x07e7
        L_0x07da:
            r1 = 1
            goto L_0x07e6
        L_0x07dc:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r10 = 0
            r3[r10] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r12, r11, r3)
        L_0x07e6:
            r0 = 0
        L_0x07e7:
            long r13 = o40.C61926c.m72671P(r0)
            java.lang.String r0 = "nonceid"
            boolean r3 = r5.has(r0)     // Catch:{ Exception -> 0x0800 }
            if (r3 != r1) goto L_0x07f5
            r1 = 1
            goto L_0x07f6
        L_0x07f5:
            r1 = 0
        L_0x07f6:
            if (r1 == 0) goto L_0x0809
            java.lang.String r0 = r5.getString(r0)     // Catch:{ Exception -> 0x07fd }
            goto L_0x080a
        L_0x07fd:
            r0 = move-exception
            r1 = 1
            goto L_0x0801
        L_0x0800:
            r0 = move-exception
        L_0x0801:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r1 = 0
            r3[r1] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r12, r11, r3)
        L_0x0809:
            r0 = 0
        L_0x080a:
            if (r0 != 0) goto L_0x080d
            r0 = r11
        L_0x080d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "[jumpToLive] objectId="
            r1.append(r3)
            r1.append(r6)
            java.lang.String r3 = " liveId="
            r1.append(r3)
            r1.append(r13)
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            r3.putExtra(r9, r8)
            te3.ap2 r4 = new te3.ap2
            r4.<init>()
            r4.f182124d = r6
            r4.f182125e = r13
            r4.f182126f = r0
            r4.f182127g = r11
            r4.f182128h = r11
            r4.f182129i = r11
            r1 = 0
            r4.f182130j = r1
            te3.c90 r6 = new te3.c90
            r6.<init>()
            r6.f182444d = r11
            r6.f182445e = r11
            r0 = -1
            r6.f182447g = r0
            r6.f182448h = r0
            r1 = 1
            r6.f182449i = r1
            java.lang.Class<ls3.f> r0 = ls3.C10649f.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            r1 = r0
            ls3.f r1 = (ls3.C10649f) r1
            di3.d r0 = di3.C86312j.m106911c(r21)
            ht1.t1 r0 = (ht1.C60200t1) r0
            ht1.z4 r0 = r0.mo76861l7()
            boolean r5 = r0.mo83771R5()
            r7 = 0
            r2 = r32
            r1.mo10916tP(r2, r3, r4, r5, r6, r7)
            goto L_0x096e
        L_0x087b:
            r2 = 15
            if (r28 != 0) goto L_0x0881
            goto L_0x0934
        L_0x0881:
            int r6 = r28.intValue()
            if (r6 != r2) goto L_0x0934
            boolean r2 = r5.has(r0)     // Catch:{ Exception -> 0x089b }
            r3 = 1
            if (r2 != r3) goto L_0x0890
            r2 = 1
            goto L_0x0891
        L_0x0890:
            r2 = 0
        L_0x0891:
            if (r2 == 0) goto L_0x0899
            java.lang.String r3 = r5.getString(r0)     // Catch:{ Exception -> 0x089b }
            r2 = 1
            goto L_0x08a6
        L_0x0899:
            r2 = 1
            goto L_0x08a5
        L_0x089b:
            r0 = move-exception
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r6 = 0
            r3[r6] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r12, r11, r3)
        L_0x08a5:
            r3 = 0
        L_0x08a6:
            long r13 = o40.C61926c.m72671P(r3)
            boolean r0 = r5.has(r1)     // Catch:{ Exception -> 0x08bd }
            if (r0 != r2) goto L_0x08b2
            r0 = 1
            goto L_0x08b3
        L_0x08b2:
            r0 = 0
        L_0x08b3:
            if (r0 == 0) goto L_0x08bb
            java.lang.String r3 = r5.getString(r1)     // Catch:{ Exception -> 0x08bd }
            r1 = 1
            goto L_0x08c8
        L_0x08bb:
            r1 = 1
            goto L_0x08c7
        L_0x08bd:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r12, r11, r2)
        L_0x08c7:
            r3 = 0
        L_0x08c8:
            java.lang.String r0 = "follow_id"
            boolean r2 = r5.has(r0)     // Catch:{ Exception -> 0x08da }
            if (r2 != r1) goto L_0x08d2
            r1 = 1
            goto L_0x08d3
        L_0x08d2:
            r1 = 0
        L_0x08d3:
            if (r1 == 0) goto L_0x08e4
            java.lang.String r12 = r5.getString(r0)     // Catch:{ Exception -> 0x08da }
            goto L_0x08e5
        L_0x08da:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r12, r11, r1)
        L_0x08e4:
            r12 = 0
        L_0x08e5:
            if (r12 != 0) goto L_0x08e8
            goto L_0x08e9
        L_0x08e8:
            r11 = r12
        L_0x08e9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[jumpToFollowTopic] topicId="
            r0.append(r1)
            r0.append(r13)
            r1 = r25
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " followId="
            r0.append(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r1 = r16
            r2 = 4
            r0.putExtra(r1, r2)
            r0.putExtra(r7, r3)
            java.lang.String r1 = "KEY_TOPIC_ID"
            r0.putExtra(r1, r13)
            r0.putExtra(r9, r8)
            java.lang.String r1 = "KEY_FOLLOW_ID"
            r0.putExtra(r1, r11)
            di3.d r1 = di3.C86312j.m106911c(r26)
            er1.b r1 = (er1.C58684b) r1
            r7 = r32
            r1.F50(r7, r0)
            goto L_0x096e
        L_0x0934:
            r7 = r32
            r0 = 16
            if (r28 != 0) goto L_0x093b
            goto L_0x0953
        L_0x093b:
            int r1 = r28.intValue()
            if (r1 != r0) goto L_0x0953
            java.lang.String r0 = r3.f34840n
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r5
            r5 = r34
            r6 = r24
            r7 = r0
            r1.mo87327s(r2, r3, r4, r5, r6, r7)
            goto L_0x096e
        L_0x0953:
            r0 = 17
            if (r28 != 0) goto L_0x0958
            goto L_0x0972
        L_0x0958:
            int r1 = r28.intValue()
            if (r1 != r0) goto L_0x0972
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r5
            r5 = r34
            r6 = r24
            r7 = r35
            r1.mo87325q(r2, r3, r4, r5, r6, r7)
        L_0x096e:
            r10 = r31
            goto L_0x0a85
        L_0x0972:
            r0 = 20
            if (r28 != 0) goto L_0x0977
            goto L_0x0984
        L_0x0977:
            int r1 = r28.intValue()
            if (r1 != r0) goto L_0x0984
            r10 = r31
            r10.mo87328u(r7, r5, r8)
            goto L_0x0a85
        L_0x0984:
            r10 = r31
            r0 = 25
            if (r28 != 0) goto L_0x098b
            goto L_0x09b2
        L_0x098b:
            int r1 = r28.intValue()
            if (r1 != r0) goto L_0x09b2
            java.lang.String r0 = "query"
            boolean r1 = r5.has(r0)     // Catch:{ Exception -> 0x09a3 }
            r2 = 1
            if (r1 != r2) goto L_0x099c
            r1 = 1
            goto L_0x099d
        L_0x099c:
            r1 = 0
        L_0x099d:
            if (r1 == 0) goto L_0x09ad
            r5.getString(r0)     // Catch:{ Exception -> 0x09a3 }
            goto L_0x09ad
        L_0x09a3:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r12, r11, r1)
        L_0x09ad:
            r10.mo87326r(r7, r3, r5)
            goto L_0x0a85
        L_0x09b2:
            r0 = 26
            if (r28 != 0) goto L_0x09b8
            goto L_0x0a85
        L_0x09b8:
            int r1 = r28.intValue()
            if (r1 != r0) goto L_0x0a85
            java.lang.String r0 = "contact_id"
            boolean r1 = r5.has(r0)     // Catch:{ Exception -> 0x09d1 }
            r2 = 1
            if (r1 != r2) goto L_0x09c9
            r2 = 1
            goto L_0x09ca
        L_0x09c9:
            r2 = 0
        L_0x09ca:
            if (r2 == 0) goto L_0x09db
            java.lang.String r3 = r5.getString(r0)     // Catch:{ Exception -> 0x09d1 }
            goto L_0x09dc
        L_0x09d1:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r12, r11, r1)
        L_0x09db:
            r3 = 0
        L_0x09dc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "jumpToWeComProfile contactId="
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            java.lang.Class<sv.p> r0 = p239sv.C77792p.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            sv.p r0 = (p239sv.C77792p) r0
            r1 = 5
            r2 = 0
            sv.j r0 = r0.mo107733UD(r3, r2, r1)
            r1 = 2131832193(0x7f112d81, float:1.9297433E38)
            java.lang.String r3 = r7.getString(r1)
            java.lang.String r1 = "context.getString(com.te…m.uikit.R.string.loading)"
            gy3.C87412m.m108593f(r3, r1)
            pf1.f0 r1 = new pf1.f0
            r1.<init>(r0)
            android.app.ProgressDialog r2 = f176979b
            if (r2 == 0) goto L_0x0a16
            r2.dismiss()
        L_0x0a16:
            r4 = 1
            r5 = 1
            pf1.n0 r6 = new pf1.n0
            r6.<init>(r1)
            java.lang.String r2 = ""
            r1 = r32
            qo3.i0 r1 = nj3.C76879j.m92723Q(r1, r2, r3, r4, r5, r6)
            f176979b = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L_0x0a40
            boolean r1 = r7 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r1 == 0) goto L_0x0a35
            r3 = r7
            com.tencent.mm.ui.MMActivity r3 = (com.tencent.p014mm.p136ui.MMActivity) r3
            goto L_0x0a36
        L_0x0a35:
            r3 = 0
        L_0x0a36:
            if (r3 == 0) goto L_0x0a40
            pf1.g0 r1 = new pf1.g0
            r1.<init>()
            r3.registerActivityLifecycleCallbacks(r1)
        L_0x0a40:
            boolean r1 = r7 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r1 == 0) goto L_0x0a49
            r3 = r7
            com.tencent.mm.ui.MMActivity r3 = (com.tencent.p014mm.p136ui.MMActivity) r3
            r13 = r3
            goto L_0x0a4a
        L_0x0a49:
            r13 = 0
        L_0x0a4a:
            if (r13 == 0) goto L_0x0a85
            com.tencent.mm.sdk.coroutines.LifecycleScope r1 = new com.tencent.mm.sdk.coroutines.LifecycleScope
            r14 = 0
            r15 = 4
            r3 = 0
            r16 = 0
            java.lang.String r12 = "jumpToWeComProfile"
            r11 = r1
            r11.<init>(r12, r13, r14, r15, r16)
            r2 = 0
            pf1.i0 r4 = new pf1.i0
            r5 = r24
            r6 = 0
            r4.<init>(r0, r5, r7, r6)
            r5 = 3
            r6 = 0
            a14.C53895h.m60466d(r1, r2, r3, r4, r5, r6)
            goto L_0x0a85
        L_0x0a68:
            r6 = r35
            r7 = r9
            r10.mo87320k(r7, r3, r6)
            goto L_0x0a85
        L_0x0a6f:
            r6 = r35
            r7 = r9
            boolean r5 = r10.mo87317h(r3)
            r4 = 0
            r0 = 0
            r8 = 36
            r9 = 0
            r1 = r31
            r2 = r32
            r3 = r33
            r7 = r0
            m73170n(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0a85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pf1.C62262d0.mo87313b(android.content.Context, pf1.q, int, jq3.o):void");
    }

    /* renamed from: d */
    public final int mo87314d(C11920q qVar) {
        uc4 uc4;
        T t;
        boolean z;
        if (qVar.f34827a.style.size() == 1) {
            LinkedList<uc4> linkedList = qVar.f34827a.style;
            C87412m.m108593f(linkedList, "infoEx.jumpInfo.style");
            uc4 = (uc4) C110818d0.m150916N(linkedList);
        } else {
            LinkedList<uc4> linkedList2 = qVar.f34827a.style;
            C87412m.m108593f(linkedList2, "infoEx.jumpInfo.style");
            Iterator<T> it = linkedList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                uc4 uc42 = (uc4) t;
                if (uc42.f142760f == qVar.f34841o && uc42.f142762h == qVar.f34842p) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            uc4 = (uc4) t;
        }
        if (uc4 != null) {
            return uc4.f142758d;
        }
        return 0;
    }

    /* renamed from: e */
    public final String mo87315e(Context context, FinderJumpInfo finderJumpInfo) {
        String str;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(finderJumpInfo, "info");
        String str2 = finderJumpInfo.recommend_reason;
        String str3 = null;
        if ((str2 == null || str2.length() == 0) && 6 == finderJumpInfo.business_type) {
            Resources resources = context.getResources();
            str2 = resources != null ? resources.getString(C0966R.string.dd5) : null;
        }
        String str4 = "";
        if (str2 == null || str2.length() == 0) {
            str2 = finderJumpInfo.wording;
            if (str2 == null) {
                str2 = str4;
            }
        } else {
            String str5 = finderJumpInfo.wording;
            if (!(str5 == null || str5.length() == 0)) {
                str2 = str2 + ": " + finderJumpInfo.wording;
            }
        }
        C87412m.m108593f(str2, "when {\n            recom…\"\n            }\n        }");
        int i = finderJumpInfo.business_type;
        if (21 != i && 18 != i) {
            return str2;
        }
        NativeInfo nativeInfo = finderJumpInfo.native_info;
        if (!(nativeInfo == null || (str = nativeInfo.necessary_params) == null)) {
            str4 = str;
        }
        try {
            JSONArray optJSONArray = new JSONObject(str4).optJSONArray("singers");
            if (optJSONArray == null) {
                return str2;
            }
            int length = optJSONArray.length();
            if (length == 1) {
                Resources resources2 = context.getResources();
                if (resources2 != null) {
                    str3 = resources2.getString(C0966R.string.h95, new Object[]{str2, optJSONArray.get(0)});
                }
                if (str3 == null) {
                    return str2;
                }
            } else if (length <= 1) {
                return str2;
            } else {
                Resources resources3 = context.getResources();
                if (resources3 != null) {
                    str3 = resources3.getString(C0966R.string.h8j, new Object[]{str2, optJSONArray.get(0), Integer.valueOf(length)});
                }
                if (str3 == null) {
                    return str2;
                }
            }
            return str3;
        } catch (JSONException e) {
            Log.m105920e("Finder.JumperUtils", e.getMessage());
            return str2;
        }
    }

    /* renamed from: f */
    public final int mo87316f(String str, boolean z) {
        boolean b = C87412m.m108589b(str, C66785b.f191882e.mo90662O5());
        if (b && !z) {
            return 33;
        }
        if (!b || !z) {
            return (b || z) ? 136 : 32;
        }
        return 137;
    }

    /* renamed from: h */
    public final boolean mo87317h(C11920q qVar) {
        C87412m.m108594g(qVar, "infoEx");
        int d = mo87314d(qVar);
        return d == 1 || d == 2;
    }

    /* renamed from: i */
    public final boolean mo87318i(String str) {
        return C110823p.m151009y(((C13887q1) C86312j.m106911c(C13887q1.class)).mo13334XI(), str);
    }

    /* renamed from: j */
    public final void mo87319j(Context context, String str) {
        Log.m105924i("Finder.JumperUtils", "jumpDefaultUrl: url = " + str);
        if (!(str == null || str.length() == 0)) {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", str);
            C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
    }

    /* renamed from: k */
    public final void mo87320k(Context context, C11920q qVar, C60905o oVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(qVar, "infoEx");
        Html5Info html5Info = qVar.f34827a.html5_info;
        mo87321l(context, qVar, html5Info != null ? html5Info.url : null, oVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        if ((r3 != null && r3.style == 1) != false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (r3.intValue() == 1) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87321l(android.content.Context r18, pf1.C11920q r19, java.lang.String r20, jq3.C60905o r21) {
        /*
            r17 = this;
            r0 = r18
            r2 = r19
            r1 = r20
            java.lang.String r3 = "context"
            gy3.C87412m.m108594g(r0, r3)
            java.lang.String r3 = "infoEx"
            gy3.C87412m.m108594g(r2, r3)
            java.lang.Integer r3 = r2.f34852z
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x001f
            int r3 = r3.intValue()
            r7 = r17
            if (r3 != r4) goto L_0x0037
            goto L_0x0039
        L_0x001f:
            r7 = r17
            boolean r3 = r7.mo87317h(r2)
            if (r3 != 0) goto L_0x0039
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r3 = r2.f34827a
            com.tencent.mm.protocal.protobuf.Html5Info r3 = r3.html5_info
            if (r3 == 0) goto L_0x0033
            int r3 = r3.style
            if (r3 != r4) goto L_0x0033
            r3 = 1
            goto L_0x0034
        L_0x0033:
            r3 = 0
        L_0x0034:
            if (r3 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r3 = 0
            goto L_0x003a
        L_0x0039:
            r3 = 1
        L_0x003a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "[jumpH5WithUrl] isHalf="
            r6.append(r8)
            r6.append(r3)
            java.lang.String r8 = " url="
            r6.append(r8)
            r6.append(r1)
            java.lang.String r8 = " extra="
            r6.append(r8)
            java.lang.String r8 = r2.f34839m
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.String r8 = "Finder.JumperUtils"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r6)
            if (r1 == 0) goto L_0x011e
            java.lang.String r6 = r2.f34839m
            if (r6 == 0) goto L_0x0071
            int r6 = r6.length()
            if (r6 != 0) goto L_0x006f
            goto L_0x0071
        L_0x006f:
            r6 = 0
            goto L_0x0072
        L_0x0071:
            r6 = 1
        L_0x0072:
            if (r6 == 0) goto L_0x0075
            goto L_0x008b
        L_0x0075:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            r1 = 38
            r6.append(r1)
            java.lang.String r1 = r2.f34839m
            r6.append(r1)
            java.lang.String r1 = r6.toString()
        L_0x008b:
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r6 = r2.f34827a
            int r8 = r6.business_type
            r9 = 2
            if (r8 != r9) goto L_0x0095
            r8 = 89
            goto L_0x0096
        L_0x0095:
            r8 = 0
        L_0x0096:
            com.tencent.mm.protocal.protobuf.Html5Info r6 = r6.html5_info
            r10 = 0
            if (r6 == 0) goto L_0x009e
            java.lang.String r6 = r6.webview_ext_info
            goto L_0x009f
        L_0x009e:
            r6 = r10
        L_0x009f:
            if (r3 == 0) goto L_0x0107
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r13 = r2.f34830d
            if (r13 == 0) goto L_0x00e2
            bl3.r r3 = bl3.C39818r.f106831a
            bl3.r$a r10 = r3.mo62443b(r0)
            java.lang.Class<rs1.z> r11 = rs1.C13554z.class
            androidx.lifecycle.i0 r10 = r10.mo75002a(r11)
            r11 = r10
            rs1.z r11 = (rs1.C13554z) r11
            bl3.r$a r3 = r3.mo62443b(r0)
            java.lang.Class<mf1.a1> r10 = mf1.C10786a1.class
            androidx.lifecycle.i0 r3 = r3.mo75002a(r10)
            mf1.a1 r3 = (mf1.C10786a1) r3
            androidx.fragment.app.Fragment r12 = r3.getFragment()
            r11.getClass()
            rs1.q0 r3 = new rs1.q0
            r3.<init>()
            if (r21 != 0) goto L_0x00d7
            java.lang.String r10 = "FinderAnimateVideoviewUIC"
            java.lang.String r11 = "startAnimateToTopAreaFromWebView return for null."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r11)
            goto L_0x00e3
        L_0x00d7:
            rs1.o0 r15 = rs1.C13344o0.f37842d
            rs1.p0 r16 = rs1.C13361p0.f37870d
            r14 = r21
            com.tencent.mm.view.drawer.RecyclerViewDrawerSquares$c r3 = r11.mo12956c3(r12, r13, r14, r15, r16)
            goto L_0x00e3
        L_0x00e2:
            r3 = r10
        L_0x00e3:
            ds1.a r10 = ds1.C7515a.f25777a
            float r13 = r10.mo8637a(r0)
            pf1.d0 r10 = f176978a
            int r10 = r10.mo87314d(r2)
            if (r10 == r9) goto L_0x00f3
            r14 = 1
            goto L_0x00f4
        L_0x00f3:
            r14 = 0
        L_0x00f4:
            zs1.l r4 = new zs1.l
            r12 = 0
            r15 = 1
            r16 = 0
            r11 = r4
            r11.<init>(r12, r13, r14, r15, r16)
            r0 = r18
            r2 = r19
            r5 = r8
            com.tencent.p014mm.plugin.finder.webview.C41637m.m44984a(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x011e
        L_0x0107:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "rawUrl"
            r2.putExtra(r3, r1)
            java.lang.String r1 = "geta8key_scene"
            r2.putExtra(r1, r8)
            java.lang.String r1 = "webview"
            java.lang.String r3 = ".ui.tools.WebViewUI"
            ke3.C88144b.m109791i(r0, r1, r3, r2, r10)
        L_0x011e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pf1.C62262d0.mo87321l(android.content.Context, pf1.q, java.lang.String, jq3.o):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d3, code lost:
        if ((r4.length() > 0) != false) goto L_0x00d5;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87322m(android.content.Context r19, pf1.C11920q r20, jq3.C60905o r21, ht1.C60200t1.C60203c r22) {
        /*
            r18 = this;
            r7 = r19
            r3 = r20
            r0 = r22
            java.lang.Class<tt.e> r1 = p244tt.C14088e.class
            java.lang.String r2 = "context"
            gy3.C87412m.m108594g(r7, r2)
            java.lang.String r2 = "infoEx"
            gy3.C87412m.m108594g(r3, r2)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r2 = r3.f34827a
            te3.ho2 r2 = r2.lite_app_info
            if (r2 == 0) goto L_0x001b
            java.lang.String r5 = r2.f183521d
            goto L_0x001c
        L_0x001b:
            r5 = 0
        L_0x001c:
            if (r2 == 0) goto L_0x0021
            java.lang.String r6 = r2.f183524g
            goto L_0x0022
        L_0x0021:
            r6 = 0
        L_0x0022:
            if (r2 == 0) goto L_0x0027
            int r8 = r2.f183525h
            goto L_0x0029
        L_0x0027:
            r8 = 100
        L_0x0029:
            double r8 = (double) r8
            r10 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r8 = r8 / r10
            r11 = 1
            if (r2 == 0) goto L_0x0037
            int r12 = r2.f183527j
            r13 = 2
            if (r12 != r13) goto L_0x0037
            r12 = 1
            goto L_0x0038
        L_0x0037:
            r12 = 0
        L_0x0038:
            if (r2 == 0) goto L_0x0040
            boolean r13 = r2.f183528n
            if (r13 != r11) goto L_0x0040
            r13 = 1
            goto L_0x0041
        L_0x0040:
            r13 = 0
        L_0x0041:
            r14 = 0
            if (r2 == 0) goto L_0x0047
            float r15 = r2.f183526i
            goto L_0x0048
        L_0x0047:
            r15 = 0
        L_0x0048:
            int r14 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r14 <= 0) goto L_0x0063
            android.content.res.Resources r8 = r19.getResources()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            int r8 = r8.heightPixels
            float r8 = (float) r8
            float r8 = r15 / r8
            r9 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r9 <= 0) goto L_0x0062
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L_0x0063
        L_0x0062:
            double r8 = (double) r8
        L_0x0063:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r4 = "jumpLiteApp: lite_app appId="
            r14.append(r4)
            r14.append(r5)
            java.lang.String r4 = ", heightPercent="
            r14.append(r4)
            r14.append(r8)
            java.lang.String r4 = ", isHalfScreen="
            r14.append(r4)
            r14.append(r12)
            java.lang.String r4 = ", isTransparent="
            r14.append(r4)
            r14.append(r13)
            java.lang.String r4 = ", halfHeight="
            r14.append(r4)
            r14.append(r15)
            java.lang.String r4 = r14.toString()
            java.lang.String r14 = "Finder.JumperUtils"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r4)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r4 = r3.f34827a
            com.tencent.mm.protocal.protobuf.MiniAppInfo r4 = r4.mini_app_info
            if (r6 == 0) goto L_0x00a8
            int r15 = r6.length()
            if (r15 != 0) goto L_0x00a6
            goto L_0x00a8
        L_0x00a6:
            r15 = 0
            goto L_0x00a9
        L_0x00a8:
            r15 = 1
        L_0x00a9:
            r15 = r15 ^ r11
            gy3.a0 r10 = new gy3.a0
            r10.<init>()
            java.lang.String r17 = ""
            if (r4 == 0) goto L_0x00d8
            java.lang.String r11 = r4.app_id
            if (r11 != 0) goto L_0x00b9
            r11 = r17
        L_0x00b9:
            java.lang.String r4 = r4.appusername
            if (r4 != 0) goto L_0x00bf
            r4 = r17
        L_0x00bf:
            int r11 = r11.length()
            if (r11 <= 0) goto L_0x00c7
            r11 = 1
            goto L_0x00c8
        L_0x00c7:
            r11 = 0
        L_0x00c8:
            if (r11 != 0) goto L_0x00d5
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x00d2
            r4 = 1
            goto L_0x00d3
        L_0x00d2:
            r4 = 0
        L_0x00d3:
            if (r4 == 0) goto L_0x00d8
        L_0x00d5:
            r4 = 1
            r10.f27482d = r4
        L_0x00d8:
            if (r5 == 0) goto L_0x00e3
            int r4 = r5.length()
            if (r4 != 0) goto L_0x00e1
            goto L_0x00e3
        L_0x00e1:
            r4 = 0
            goto L_0x00e4
        L_0x00e3:
            r4 = 1
        L_0x00e4:
            if (r4 != 0) goto L_0x00fa
            if (r15 != 0) goto L_0x00ec
            boolean r4 = r10.f27482d
            if (r4 == 0) goto L_0x00f8
        L_0x00ec:
            di3.d r4 = di3.C86312j.m106911c(r1)
            tt.e r4 = (p244tt.C14088e) r4
            boolean r4 = r4.mo13530uu(r5)
            if (r4 == 0) goto L_0x00fa
        L_0x00f8:
            r4 = 1
            goto L_0x00fb
        L_0x00fa:
            r4 = 0
        L_0x00fb:
            if (r4 == 0) goto L_0x01c3
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>()
            if (r2 == 0) goto L_0x0108
            java.lang.String r4 = r2.f183522e
            if (r4 != 0) goto L_0x010a
        L_0x0108:
            r4 = r17
        L_0x010a:
            if (r2 == 0) goto L_0x0110
            java.lang.String r2 = r2.f183523f
            if (r2 != 0) goto L_0x0112
        L_0x0110:
            r2 = r17
        L_0x0112:
            java.lang.String r7 = "appId"
            r11.putString(r7, r5)
            java.lang.String r7 = "path"
            r11.putString(r7, r4)
            java.lang.String r7 = "query"
            r11.putString(r7, r2)
            boolean r7 = r3.f34825C
            if (r7 != 0) goto L_0x012a
            if (r12 == 0) goto L_0x0128
            goto L_0x012a
        L_0x0128:
            r7 = 0
            goto L_0x012b
        L_0x012a:
            r7 = 1
        L_0x012b:
            java.lang.String r12 = "isHalfScreen"
            r11.putBoolean(r12, r7)
            java.lang.String r7 = "heightPercent"
            r11.putDouble(r7, r8)
            boolean r7 = r3.f34826D
            if (r7 != 0) goto L_0x013e
            if (r13 == 0) goto L_0x013c
            goto L_0x013e
        L_0x013c:
            r7 = 0
            goto L_0x013f
        L_0x013e:
            r7 = 1
        L_0x013f:
            java.lang.String r8 = "transparent"
            r11.putBoolean(r8, r7)
            r7 = 2130772182(0x7f0100d6, float:1.7147475E38)
            java.lang.String r8 = "nextAnimIn"
            r11.putInt(r8, r7)
            r7 = 2130772185(0x7f0100d9, float:1.7147481E38)
            java.lang.String r9 = "currentAnimOut"
            r11.putInt(r9, r7)
            int r7 = r3.f34838l
            r12 = 1
            if (r7 != r12) goto L_0x0166
            r7 = 2130772174(0x7f0100ce, float:1.7147459E38)
            r11.putInt(r8, r7)
            r7 = 2130772119(0x7f010097, float:1.7147347E38)
            r11.putInt(r9, r7)
        L_0x0166:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "jumpLiteApp: "
            r7.append(r8)
            r7.append(r5)
            java.lang.String r5 = ", path:"
            r7.append(r5)
            r7.append(r4)
            java.lang.String r4 = " query:"
            r7.append(r4)
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r2)
            if (r0 == 0) goto L_0x019b
            com.tencent.mm.plugin.lite.d r2 = new com.tencent.mm.plugin.lite.d
            r2.<init>()
            pf1.d0$a r4 = new pf1.d0$a
            r4.<init>(r0)
            r2.f162866c = r4
            r16 = r2
            goto L_0x019d
        L_0x019b:
            r16 = 0
        L_0x019d:
            di3.d r0 = di3.C86312j.m106911c(r1)
            r7 = r0
            tt.e r7 = (p244tt.C14088e) r7
            r8 = 1
            r9 = 0
            pf1.d0$b r12 = new pf1.d0$b
            r0 = r12
            r1 = r10
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = r7
            r1 = r19
            r2 = r11
            r3 = r8
            r4 = r9
            r5 = r16
            r6 = r12
            r0.gc0(r1, r2, r3, r4, r5, r6)
            r0 = r18
            goto L_0x01e4
        L_0x01c3:
            boolean r0 = r10.f27482d
            if (r0 == 0) goto L_0x01db
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 44
            r8 = 0
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r4
            r4 = r5
            r5 = r21
            m73170n(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x01e4
        L_0x01db:
            r0 = r18
            if (r15 == 0) goto L_0x01e4
            r1 = r19
            r0.mo87319j(r1, r6)
        L_0x01e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pf1.C62262d0.mo87322m(android.content.Context, pf1.q, jq3.o, ht1.t1$c):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a0 A[Catch:{ Exception -> 0x00aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00a2 A[Catch:{ Exception -> 0x00aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00a5 A[Catch:{ Exception -> 0x00aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00f7  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87323o(android.content.Context r14, long r15, org.json.JSONObject r17, int r18) {
        /*
            r13 = this;
            r1 = r14
            r2 = r17
            java.lang.String r3 = "safeGetInt"
            java.lang.String r4 = ""
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r14, r0)
            java.lang.String r0 = "necessaryParams"
            gy3.C87412m.m108594g(r2, r0)
            java.lang.String r0 = "object_hot_word"
            r5 = 0
            r6 = 0
            r7 = 1
            boolean r8 = r2.has(r0)     // Catch:{ Exception -> 0x0029 }
            if (r8 != r7) goto L_0x001e
            r8 = 1
            goto L_0x001f
        L_0x001e:
            r8 = 0
        L_0x001f:
            if (r8 == 0) goto L_0x0026
            org.json.JSONObject r0 = r2.getJSONObject(r0)     // Catch:{ Exception -> 0x0029 }
            goto L_0x0027
        L_0x0026:
            r0 = r5
        L_0x0027:
            r8 = r0
            goto L_0x0032
        L_0x0029:
            r0 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r8[r6] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r3, r4, r8)
            r8 = r5
        L_0x0032:
            java.lang.String r9 = "safeGetString"
            if (r8 == 0) goto L_0x0053
            java.lang.String r0 = "hotword_text"
            boolean r10 = r8.has(r0)     // Catch:{ Exception -> 0x004b }
            if (r10 != r7) goto L_0x0040
            r10 = 1
            goto L_0x0041
        L_0x0040:
            r10 = 0
        L_0x0041:
            if (r10 == 0) goto L_0x0048
            java.lang.String r0 = r8.getString(r0)     // Catch:{ Exception -> 0x004b }
            goto L_0x0049
        L_0x0048:
            r0 = r5
        L_0x0049:
            r10 = r0
            goto L_0x0054
        L_0x004b:
            r0 = move-exception
            java.lang.Object[] r10 = new java.lang.Object[r7]
            r10[r6] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r9, r4, r10)
        L_0x0053:
            r10 = r5
        L_0x0054:
            if (r8 == 0) goto L_0x0073
            java.lang.String r0 = "action_type"
            boolean r11 = r8.has(r0)     // Catch:{ Exception -> 0x0068 }
            if (r11 != r7) goto L_0x0060
            r11 = 1
            goto L_0x0061
        L_0x0060:
            r11 = 0
        L_0x0061:
            if (r11 == 0) goto L_0x0070
            int r0 = r8.getInt(r0)     // Catch:{ Exception -> 0x0068 }
            goto L_0x0071
        L_0x0068:
            r0 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[r7]
            r11[r6] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r3, r4, r11)
        L_0x0070:
            r0 = 0
        L_0x0071:
            r3 = r0
            goto L_0x0074
        L_0x0073:
            r3 = 0
        L_0x0074:
            if (r8 == 0) goto L_0x0097
            java.lang.String r0 = "session_buffer"
            boolean r11 = r8.has(r0)     // Catch:{ Exception -> 0x0089 }
            if (r11 != r7) goto L_0x0081
            r11 = 1
            goto L_0x0082
        L_0x0081:
            r11 = 0
        L_0x0082:
            if (r11 == 0) goto L_0x0091
            java.lang.String r0 = r8.getString(r0)     // Catch:{ Exception -> 0x0089 }
            goto L_0x0092
        L_0x0089:
            r0 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[r7]
            r11[r6] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r9, r4, r11)
        L_0x0091:
            r0 = r5
        L_0x0092:
            if (r0 != 0) goto L_0x0095
            goto L_0x0097
        L_0x0095:
            r11 = r0
            goto L_0x0098
        L_0x0097:
            r11 = r4
        L_0x0098:
            java.lang.String r0 = "obj_hotword_info_buff"
            boolean r12 = r2.has(r0)     // Catch:{ Exception -> 0x00aa }
            if (r12 != r7) goto L_0x00a2
            r12 = 1
            goto L_0x00a3
        L_0x00a2:
            r12 = 0
        L_0x00a3:
            if (r12 == 0) goto L_0x00b2
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x00aa }
            goto L_0x00b3
        L_0x00aa:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r2[r6] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r9, r4, r2)
        L_0x00b2:
            r0 = r5
        L_0x00b3:
            if (r0 != 0) goto L_0x00b6
            r0 = r4
        L_0x00b6:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r9 = "[jumpSearch] objectHotWord="
            r2.append(r9)
            r2.append(r8)
            java.lang.String r8 = " hotWordText="
            r2.append(r8)
            r2.append(r10)
            java.lang.String r8 = " actionType="
            r2.append(r8)
            r2.append(r3)
            java.lang.String r3 = " sessionBuffer="
            r2.append(r3)
            r2.append(r11)
            java.lang.String r3 = " objHotWordInfoBuff="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "Finder.JumperUtils"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r3 != 0) goto L_0x011d
            if (r10 != 0) goto L_0x00fa
            goto L_0x00fb
        L_0x00fa:
            r4 = r10
        L_0x00fb:
            java.lang.String r3 = "key_search_query"
            r2.putExtra(r3, r4)
            byte[] r3 = android.util.Base64.decode(r11, r6)
            java.lang.String r4 = "key_search_session_buffer"
            r2.putExtra(r4, r3)
            java.lang.String r3 = "key_search_is_from_feed_list"
            r2.putExtra(r3, r7)
            java.lang.String r3 = "key_search_feed_id"
            r8 = r15
            r2.putExtra(r3, r8)
            byte[] r0 = android.util.Base64.decode(r0, r6)
            java.lang.String r3 = "key_search_hot_word_buffer"
            r2.putExtra(r3, r0)
        L_0x011d:
            java.lang.String r0 = "key_entrance_type"
            r2.putExtra(r0, r7)
            r3 = r18
            r2.putExtra(r0, r3)
            java.lang.Class<er1.b> r0 = er1.C58684b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            er1.b r0 = (er1.C58684b) r0
            r0.Hx0(r14, r5, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pf1.C62262d0.mo87323o(android.content.Context, long, org.json.JSONObject, int):void");
    }

    /* renamed from: p */
    public final void mo87324p(Activity activity, BaseFinderFeed baseFinderFeed, int i) {
        Class cls = C58417y0.class;
        C87412m.m108594g(activity, "context");
        C87412m.m108594g(baseFinderFeed, "feed");
        C49150di1 di12 = baseFinderFeed.mo3513o().getFeedObject().finder_promotion_jumpinfo;
        if (di12 == null) {
            return;
        }
        if (di12.f132350f) {
            C76912y0.makeText((Context) activity, (CharSequence) di12.f132349e, 0).show();
            C58417y0 y0Var = (C58417y0) C86312j.m106911c(cls);
            long id = baseFinderFeed.mo3513o().getId();
            String str = di12.f132349e;
            if (str == null) {
                str = "";
            }
            y0Var.Sy0(activity, true, id, 2, str, i);
        } else if (baseFinderFeed.mo3513o().isNotShare() || baseFinderFeed.mo3513o().isPrivate()) {
            C76912y0.makeText((Context) activity, (CharSequence) activity.getResources().getString(C0966R.string.mog), 0).show();
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
            C58417y0.Ty0((C58417y0) c, activity, true, baseFinderFeed.mo3513o().getId(), 2, (String) null, i, 16, (Object) null);
        } else {
            FinderJumpInfo finderJumpInfo = di12.f132348d;
            if (finderJumpInfo != null) {
                m73168c(f176978a, activity, new C11920q(finderJumpInfo), 0, (C60905o) null, 12, (Object) null);
            }
            C7335d c2 = C86312j.m106911c(cls);
            C87412m.m108593f(c2, "getService(FinderReportLogic::class.java)");
            C58417y0.Ty0((C58417y0) c2, activity, true, baseFinderFeed.mo3513o().getId(), 1, (String) null, i, 16, (Object) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a6 A[Catch:{ Exception -> 0x00b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a8 A[Catch:{ Exception -> 0x00b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ab A[Catch:{ Exception -> 0x00b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c4 A[Catch:{ Exception -> 0x00cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c6 A[Catch:{ Exception -> 0x00cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c9 A[Catch:{ Exception -> 0x00cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00da  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87325q(android.content.Context r18, pf1.C11920q r19, org.json.JSONObject r20, int r21, boolean r22, jq3.C60905o r23) {
        /*
            r17 = this;
            r1 = r19
            r2 = r20
            r0 = r23
            java.lang.String r3 = "holder.context"
            java.lang.String r9 = "safeGetString"
            java.lang.String r10 = ""
            java.lang.String r4 = "context"
            r12 = r18
            gy3.C87412m.m108594g(r12, r4)
            java.lang.String r4 = "infoEx"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "necessaryParams"
            gy3.C87412m.m108594g(r2, r4)
            boolean r4 = vo2.C65833d.m77546a()
            java.lang.String r11 = "Finder.JumperUtils"
            r13 = 0
            if (r4 == 0) goto L_0x007c
            if (r0 == 0) goto L_0x0062
            bl3.r r4 = bl3.C39818r.f106831a     // Catch:{ all -> 0x0067 }
            android.content.Context r5 = r0.f173499A     // Catch:{ all -> 0x0067 }
            gy3.C87412m.m108593f(r5, r3)     // Catch:{ all -> 0x0067 }
            bl3.r$a r5 = r4.mo62443b(r5)     // Catch:{ all -> 0x0067 }
            java.lang.Class<rs1.z> r6 = rs1.C13554z.class
            androidx.lifecycle.i0 r5 = r5.mo75002a(r6)     // Catch:{ all -> 0x0067 }
            rs1.z r5 = (rs1.C13554z) r5     // Catch:{ all -> 0x0067 }
            android.content.Context r6 = r0.f173499A     // Catch:{ all -> 0x0067 }
            gy3.C87412m.m108593f(r6, r3)     // Catch:{ all -> 0x0067 }
            bl3.r$a r3 = r4.mo62443b(r6)     // Catch:{ all -> 0x0067 }
            java.lang.Class<mf1.a1> r4 = mf1.C10786a1.class
            androidx.lifecycle.i0 r3 = r3.mo75002a(r4)     // Catch:{ all -> 0x0067 }
            mf1.a1 r3 = (mf1.C10786a1) r3     // Catch:{ all -> 0x0067 }
            androidx.fragment.app.Fragment r4 = r3.getFragment()     // Catch:{ all -> 0x0067 }
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r6 = r1.f34830d     // Catch:{ all -> 0x0067 }
            r5.getClass()     // Catch:{ all -> 0x0067 }
            rs1.a0 r7 = rs1.C13103a0.f37311d     // Catch:{ all -> 0x0067 }
            rs1.b0 r8 = rs1.C13120b0.f37349d     // Catch:{ all -> 0x0067 }
            r3 = r5
            r5 = r6
            r6 = r23
            com.tencent.mm.view.drawer.RecyclerViewDrawerSquares$c r0 = r3.mo12956c3(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0067 }
            goto L_0x0063
        L_0x0062:
            r0 = r13
        L_0x0063:
            vo2.C65833d.m77548c(r0)     // Catch:{ all -> 0x0067 }
            goto L_0x007c
        L_0x0067:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "jumpToAdNative, exp="
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
        L_0x007c:
            java.lang.String r0 = "canvas_id"
            r3 = 0
            r4 = 1
            boolean r5 = r2.has(r0)     // Catch:{ Exception -> 0x0090 }
            if (r5 != r4) goto L_0x0088
            r5 = 1
            goto L_0x0089
        L_0x0088:
            r5 = 0
        L_0x0089:
            if (r5 == 0) goto L_0x0098
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x0090 }
            goto L_0x0099
        L_0x0090:
            r0 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r3] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r9, r10, r5)
        L_0x0098:
            r0 = r13
        L_0x0099:
            long r5 = o40.C61926c.m72671P(r0)
            java.lang.String r0 = "uxinfo"
            boolean r7 = r2.has(r0)     // Catch:{ Exception -> 0x00b3 }
            if (r7 != r4) goto L_0x00a8
            r7 = 1
            goto L_0x00a9
        L_0x00a8:
            r7 = 0
        L_0x00a9:
            if (r7 == 0) goto L_0x00b0
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x00b3 }
            goto L_0x00b1
        L_0x00b0:
            r0 = r13
        L_0x00b1:
            r15 = r0
            goto L_0x00bc
        L_0x00b3:
            r0 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r4]
            r7[r3] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r9, r10, r7)
            r15 = r13
        L_0x00bc:
            java.lang.String r0 = "canvas_dynamic_info"
            boolean r7 = r2.has(r0)     // Catch:{ Exception -> 0x00cf }
            if (r7 != r4) goto L_0x00c6
            r7 = 1
            goto L_0x00c7
        L_0x00c6:
            r7 = 0
        L_0x00c7:
            if (r7 == 0) goto L_0x00d7
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x00cf }
            r13 = r0
            goto L_0x00d7
        L_0x00cf:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r2[r3] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r9, r10, r2)
        L_0x00d7:
            if (r13 != 0) goto L_0x00da
            goto L_0x00db
        L_0x00da:
            r10 = r13
        L_0x00db:
            int r0 = r1.f34841o
            int r1 = r1.f34842p
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[jumpToAdNative] showPosition="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " showStyle="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = " canvasId="
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = " uxInfo="
            r2.append(r0)
            r2.append(r15)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            jr2.w r0 = new jr2.w
            r0.<init>()
            r1 = r22
            r0.f91062a = r1
            r0.f91065d = r10
            r1 = 30
            r0.f91063b = r1
            java.lang.Class<jr2.k> r1 = jr2.C9510k.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            r11 = r1
            jr2.k r11 = (jr2.C9510k) r11
            r12 = r18
            r13 = r5
            r16 = r0
            r11.Ad0(r12, r13, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pf1.C62262d0.mo87325q(android.content.Context, pf1.q, org.json.JSONObject, int, boolean, jq3.o):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a A[Catch:{ JSONException -> 0x007d }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ee  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87326r(android.content.Context r18, pf1.C11920q r19, org.json.JSONObject r20) {
        /*
            r17 = this;
            r1 = r18
            r2 = r20
            java.lang.String r3 = "Finder.JumperUtils"
            java.lang.String r4 = "params"
            java.lang.String r5 = "referer"
            java.lang.String r6 = "safeGetString"
            java.lang.String r7 = "query"
            java.lang.String r8 = ""
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "infoEx"
            r9 = r19
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "npJson"
            gy3.C87412m.m108594g(r2, r0)
            r10 = 0
            r11 = 1
            boolean r0 = r2.has(r7)     // Catch:{ Exception -> 0x0036 }
            if (r0 != r11) goto L_0x002b
            r0 = 1
            goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = r2.getString(r7)     // Catch:{ Exception -> 0x0036 }
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            r12 = r0
            goto L_0x003f
        L_0x0036:
            r0 = move-exception
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r10] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r6, r8, r12)
            r12 = 0
        L_0x003f:
            boolean r0 = r2.has(r4)     // Catch:{ Exception -> 0x004f }
            if (r0 != r11) goto L_0x0047
            r0 = 1
            goto L_0x0048
        L_0x0047:
            r0 = 0
        L_0x0048:
            if (r0 == 0) goto L_0x0057
            java.lang.String r0 = r2.getString(r4)     // Catch:{ Exception -> 0x004f }
            goto L_0x0058
        L_0x004f:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r11]     // Catch:{ JSONException -> 0x007d }
            r2[r10] = r0     // Catch:{ JSONException -> 0x007d }
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r6, r8, r2)     // Catch:{ JSONException -> 0x007d }
        L_0x0057:
            r0 = 0
        L_0x0058:
            if (r0 == 0) goto L_0x0085
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x007d }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x007d }
            boolean r0 = r2.has(r5)     // Catch:{ Exception -> 0x006f }
            if (r0 != r11) goto L_0x0067
            r0 = 1
            goto L_0x0068
        L_0x0067:
            r0 = 0
        L_0x0068:
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = r2.getString(r5)     // Catch:{ Exception -> 0x006f }
            goto L_0x0078
        L_0x006f:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r11]     // Catch:{ JSONException -> 0x007d }
            r2[r10] = r0     // Catch:{ JSONException -> 0x007d }
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r6, r8, r2)     // Catch:{ JSONException -> 0x007d }
        L_0x0077:
            r0 = 0
        L_0x0078:
            if (r0 != 0) goto L_0x007b
            goto L_0x0085
        L_0x007b:
            r8 = r0
            goto L_0x0085
        L_0x007d:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
        L_0x0085:
            java.lang.Class<c00.n> r0 = c00.C0405n.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            c00.n r0 = (c00.C0405n) r0
            android.content.Intent r2 = r0.O20()
            java.util.Map<java.lang.String, java.lang.String> r6 = f176981d
            java.lang.Object r6 = r6.get(r7)
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)
            java.lang.String r11 = p206nj.C117627q.m165908a(r11)
            boolean r6 = gy3.C87412m.m108589b(r6, r11)
            r11 = 14
            r13 = 1001(0x3e9, float:1.403E-42)
            java.lang.String r14 = "subSessionId"
            java.lang.String r15 = "sessionId"
            if (r6 == 0) goto L_0x00ee
            java.util.Map<java.lang.String, java.lang.String> r6 = f176981d
            java.lang.Object r6 = r6.get(r5)
            java.lang.String r16 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
            java.lang.String r9 = p206nj.C117627q.m165908a(r16)
            boolean r6 = gy3.C87412m.m108589b(r6, r9)
            if (r6 == 0) goto L_0x00ee
            java.util.Map<java.lang.String, java.lang.String> r6 = f176981d
            java.lang.Object r6 = r6.get(r15)
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x00ee
            java.util.Map<java.lang.String, java.lang.String> r4 = f176981d
            java.lang.Object r4 = r4.get(r15)
            java.lang.String r4 = (java.lang.String) r4
            r2.putExtra(r15, r4)
            java.util.Map<java.lang.String, java.lang.String> r4 = f176981d
            java.lang.Object r4 = r4.get(r15)
            java.lang.String r4 = (java.lang.String) r4
            r2.putExtra(r14, r4)
            java.util.Map<java.lang.String, java.lang.String> r4 = f176981d
            java.lang.String r0 = r0.mo277Vw(r4)
            goto L_0x0139
        L_0x00ee:
            java.util.Map r6 = r0.mo280hn(r13, r10, r11)
            java.lang.Class<vr.e> r9 = p255vr.C65873e.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            vr.e r9 = (p255vr.C65873e) r9
            r10 = 123(0x7b, float:1.72E-43)
            long r9 = r9.vk0(r10)
            gy3.C87412m.m108593f(r6, r4)
            java.lang.String r4 = java.lang.String.valueOf(r9)
            r6.put(r15, r4)
            java.lang.String r4 = java.lang.String.valueOf(r9)
            r6.put(r14, r4)
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)
            java.lang.String r4 = p206nj.C117627q.m165908a(r4)
            r6.put(r7, r4)
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
            java.lang.String r4 = p206nj.C117627q.m165908a(r4)
            r6.put(r5, r4)
            java.lang.String r4 = java.lang.String.valueOf(r9)
            r2.putExtra(r15, r4)
            java.lang.String r4 = java.lang.String.valueOf(r9)
            r2.putExtra(r14, r4)
            java.lang.String r0 = r0.mo277Vw(r6)
        L_0x0139:
            java.lang.String r4 = "ftsQuery"
            r2.putExtra(r4, r12)
            java.lang.String r4 = "ftsbizscene"
            r2.putExtra(r4, r13)
            java.lang.String r4 = "ftsType"
            r2.putExtra(r4, r11)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "comment search url:"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r4)
            java.lang.String r3 = "rawUrl"
            r2.putExtra(r3, r0)
            r3 = 0
            ke3.C88144b.m109806x(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pf1.C62262d0.mo87326r(android.content.Context, pf1.q, org.json.JSONObject):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a2 A[Catch:{ Exception -> 0x00c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01c9  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87327s(android.content.Context r29, pf1.C11920q r30, org.json.JSONObject r31, int r32, boolean r33, java.lang.String r34) {
        /*
            r28 = this;
            r13 = r29
            r1 = r30
            r0 = r31
            r2 = r34
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC> r14 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC.class
            java.lang.String r3 = "context"
            gy3.C87412m.m108594g(r13, r3)
            java.lang.String r3 = "infoEx"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.String r3 = "necessaryParams"
            gy3.C87412m.m108594g(r0, r3)
            java.lang.String r3 = "bypassData"
            gy3.C87412m.m108594g(r2, r3)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r15 = r1.f34830d
            if (r15 != 0) goto L_0x0023
            return
        L_0x0023:
            java.lang.String r3 = "username"
            r4 = 0
            r12 = 1
            r11 = 0
            boolean r5 = r0.has(r3)     // Catch:{ Exception -> 0x0039 }
            if (r5 != r12) goto L_0x0031
            r5 = 1
            goto L_0x0032
        L_0x0031:
            r5 = 0
        L_0x0032:
            if (r5 == 0) goto L_0x0045
            java.lang.String r4 = r0.getString(r3)     // Catch:{ Exception -> 0x0039 }
            goto L_0x0045
        L_0x0039:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r12]
            r3[r11] = r0
            java.lang.String r0 = "safeGetString"
            java.lang.String r5 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r0, r5, r3)
        L_0x0045:
            if (r33 == 0) goto L_0x005c
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r0 = up1.C37521f.f99399f7
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r12) goto L_0x005c
            r10 = 1
            goto L_0x005d
        L_0x005c:
            r10 = 0
        L_0x005d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "[jumpToUserProfile] userName="
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = " openHalf:"
            r0.append(r3)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.String r9 = "Finder.JumperUtils"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            android.content.Intent r8 = new android.content.Intent
            r8.<init>()
            r7 = r28
            int r0 = r7.mo87316f(r4, r10)
            java.lang.String r3 = "key_to_comment_scene"
            r8.putExtra(r3, r0)
            java.lang.String r0 = "finder_username"
            r8.putExtra(r0, r4)
            java.lang.String r0 = "KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE"
            r8.putExtra(r0, r12)
            java.lang.String r0 = "key_entrance_type"
            r6 = r32
            r8.putExtra(r0, r6)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r34)     // Catch:{ Exception -> 0x00c3 }
            if (r0 != 0) goto L_0x00d8
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x00c3 }
            r0.<init>()     // Catch:{ Exception -> 0x00c3 }
            java.lang.String r3 = "commentAdInfo"
            r0.put(r3, r2)     // Catch:{ Exception -> 0x00c3 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00c3 }
            java.lang.String r2 = "JSONObject().apply {\n   …             }.toString()"
            gy3.C87412m.m108593f(r0, r2)     // Catch:{ Exception -> 0x00c3 }
            java.lang.String r2 = ","
            java.lang.String r3 = ";"
            java.lang.String r0 = z04.C112551y.m153814n(r0, r2, r3, r11)     // Catch:{ Exception -> 0x00c3 }
            java.lang.String r2 = "key_extra_info"
            r8.putExtra(r2, r0)     // Catch:{ Exception -> 0x00c3 }
            goto L_0x00d8
        L_0x00c3:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "jumpProfile build finder buffer failed, error="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
        L_0x00d8:
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = r1.f34827a
            int r0 = r0.business_type
            r2 = 25
            if (r0 != r2) goto L_0x00e3
            r0 = 39
            goto L_0x00e4
        L_0x00e3:
            r0 = 0
        L_0x00e4:
            rs1.s8$a r4 = rs1.C13442s8.f38060Q0
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r1.f34830d
            r16 = 0
            if (r1 == 0) goto L_0x00f3
            long r1 = r1.getItemId()
            r18 = r1
            goto L_0x00f5
        L_0x00f3:
            r18 = r16
        L_0x00f5:
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 64
            r24 = 0
            r1 = r4
            r2 = r29
            r3 = r8
            r25 = r4
            r4 = r18
            r6 = r20
            r7 = r21
            r26 = r8
            r8 = r0
            r27 = r9
            r9 = r22
            r18 = r10
            r10 = r32
            r11 = r23
            r19 = r14
            r14 = 1
            r12 = r24
            rs1.C13442s8.C13443a.m12791e(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11, r12)
            if (r18 == 0) goto L_0x01c9
            r0 = r25
            rs1.s8 r0 = r0.mo12873f(r13)
            if (r0 == 0) goto L_0x012d
            int r11 = r0.f38096i
            goto L_0x012e
        L_0x012d:
            r11 = 0
        L_0x012e:
            if (r11 != r14) goto L_0x013a
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r15.mo3513o()
            te3.cg r0 = r0.getBizInfo()
            if (r0 == 0) goto L_0x0145
        L_0x013a:
            r0 = 8
            if (r11 == r0) goto L_0x0145
            r0 = 120(0x78, float:1.68E-43)
            if (r11 != r0) goto L_0x0143
            goto L_0x0145
        L_0x0143:
            r12 = 0
            goto L_0x0146
        L_0x0145:
            r12 = 1
        L_0x0146:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r15.mo3513o()
            java.lang.String r0 = r0.getUserName()
            bl3.r r1 = bl3.C39818r.f106831a
            bl3.r$a r2 = r1.mo62443b(r13)
            r3 = r19
            bl3.t r2 = r2.mo62449e(r3)
            if (r2 == 0) goto L_0x01b1
            zt3.t r2 = zt3.C119157j.f356862d
            pf1.a0 r4 = new pf1.a0
            r4.<init>(r0, r15)
            zt3.j r2 = (zt3.C119157j) r2
            r2.mo183875f(r4)
            long r4 = android.os.SystemClock.uptimeMillis()
            if (r12 == 0) goto L_0x016f
            goto L_0x0177
        L_0x016f:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r15.mo3513o()
            long r16 = r0.getId()
        L_0x0177:
            r6 = r16
            java.lang.String r0 = "finder_read_feed_id"
            r2 = r26
            r2.putExtra(r0, r6)
            bl3.r$a r0 = r1.mo62443b(r13)
            bl3.t r0 = r0.mo62449e(r3)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC r0 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC) r0
            r6 = 0
            if (r0 == 0) goto L_0x0190
            r0.mo5169e3(r2, r6)
        L_0x0190:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "profile updateData COST: "
            r0.append(r2)
            long r7 = android.os.SystemClock.uptimeMillis()
            long r7 = r7 - r4
            r0.append(r7)
            java.lang.String r2 = "ms"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r2 = r27
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x01b2
        L_0x01b1:
            r6 = 0
        L_0x01b2:
            bl3.r$a r0 = r1.mo62443b(r13)
            bl3.t r0 = r0.mo62449e(r3)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC r0 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC) r0
            if (r0 == 0) goto L_0x01d6
            as1.a r0 = r0.f18766f
            if (r0 == 0) goto L_0x01d6
            int r1 = r0.f18132i
            int r1 = -r1
            r0.mo4919k(r1, r6)
            goto L_0x01d6
        L_0x01c9:
            r2 = r26
            java.lang.Class<er1.b> r0 = er1.C58684b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            er1.b r0 = (er1.C58684b) r0
            r0.mo13272V1(r13, r2)
        L_0x01d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pf1.C62262d0.mo87327s(android.content.Context, pf1.q, org.json.JSONObject, int, boolean, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007b A[Catch:{ Exception -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007d A[Catch:{ Exception -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0080 A[Catch:{ Exception -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009b A[Catch:{ Exception -> 0x00a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d A[Catch:{ Exception -> 0x00a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a0 A[Catch:{ Exception -> 0x00a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00b9 A[Catch:{ Exception -> 0x00c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00bb A[Catch:{ Exception -> 0x00c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00be A[Catch:{ Exception -> 0x00c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00d9 A[Catch:{ Exception -> 0x00e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00db A[Catch:{ Exception -> 0x00e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00de A[Catch:{ Exception -> 0x00e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x016a  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87328u(android.content.Context r18, org.json.JSONObject r19, int r20) {
        /*
            r17 = this;
            r1 = r18
            r2 = r19
            java.lang.String r3 = "safeGetDouble"
            java.lang.String r4 = "safeGetString"
            java.lang.String r5 = ""
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "necessaryParams"
            gy3.C87412m.m108594g(r2, r0)
            java.lang.String r0 = "poi_name"
            r6 = 0
            r7 = 0
            r8 = 1
            boolean r9 = r2.has(r0)     // Catch:{ Exception -> 0x002c }
            if (r9 != r8) goto L_0x0021
            r9 = 1
            goto L_0x0022
        L_0x0021:
            r9 = 0
        L_0x0022:
            if (r9 == 0) goto L_0x0029
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x002c }
            goto L_0x002a
        L_0x0029:
            r0 = r6
        L_0x002a:
            r9 = r0
            goto L_0x0035
        L_0x002c:
            r0 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r8]
            r9[r7] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r4, r5, r9)
            r9 = r6
        L_0x0035:
            java.lang.String r0 = "country"
            boolean r10 = r2.has(r0)     // Catch:{ Exception -> 0x004a }
            if (r10 != r8) goto L_0x003f
            r10 = 1
            goto L_0x0040
        L_0x003f:
            r10 = 0
        L_0x0040:
            if (r10 == 0) goto L_0x0047
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x004a }
            goto L_0x0048
        L_0x0047:
            r0 = r6
        L_0x0048:
            r10 = r0
            goto L_0x0053
        L_0x004a:
            r0 = move-exception
            java.lang.Object[] r10 = new java.lang.Object[r8]
            r10[r7] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r4, r5, r10)
            r10 = r6
        L_0x0053:
            java.lang.String r0 = "city"
            boolean r11 = r2.has(r0)     // Catch:{ Exception -> 0x0065 }
            if (r11 != r8) goto L_0x005d
            r11 = 1
            goto L_0x005e
        L_0x005d:
            r11 = 0
        L_0x005e:
            if (r11 == 0) goto L_0x006d
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x0065 }
            goto L_0x006e
        L_0x0065:
            r0 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r7] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r4, r5, r11)
        L_0x006d:
            r0 = r6
        L_0x006e:
            if (r0 != 0) goto L_0x0072
            r11 = r5
            goto L_0x0073
        L_0x0072:
            r11 = r0
        L_0x0073:
            java.lang.String r0 = "address"
            boolean r12 = r2.has(r0)     // Catch:{ Exception -> 0x0085 }
            if (r12 != r8) goto L_0x007d
            r12 = 1
            goto L_0x007e
        L_0x007d:
            r12 = 0
        L_0x007e:
            if (r12 == 0) goto L_0x008d
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x0085 }
            goto L_0x008e
        L_0x0085:
            r0 = move-exception
            java.lang.Object[] r12 = new java.lang.Object[r8]
            r12[r7] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r4, r5, r12)
        L_0x008d:
            r0 = r6
        L_0x008e:
            if (r0 != 0) goto L_0x0092
            r12 = r5
            goto L_0x0093
        L_0x0092:
            r12 = r0
        L_0x0093:
            java.lang.String r0 = "poi"
            boolean r13 = r2.has(r0)     // Catch:{ Exception -> 0x00a6 }
            if (r13 != r8) goto L_0x009d
            r13 = 1
            goto L_0x009e
        L_0x009d:
            r13 = 0
        L_0x009e:
            if (r13 == 0) goto L_0x00ae
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x00a6 }
            r6 = r0
            goto L_0x00ae
        L_0x00a6:
            r0 = move-exception
            java.lang.Object[] r13 = new java.lang.Object[r8]
            r13[r7] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r4, r5, r13)
        L_0x00ae:
            if (r6 != 0) goto L_0x00b1
            r6 = r5
        L_0x00b1:
            java.lang.String r0 = "longitude"
            boolean r4 = r2.has(r0)     // Catch:{ Exception -> 0x00c7 }
            if (r4 != r8) goto L_0x00bb
            r4 = 1
            goto L_0x00bc
        L_0x00bb:
            r4 = 0
        L_0x00bc:
            if (r4 == 0) goto L_0x00c3
            double r15 = r2.getDouble(r0)     // Catch:{ Exception -> 0x00c7 }
            goto L_0x00c5
        L_0x00c3:
            r15 = 0
        L_0x00c5:
            r13 = r15
            goto L_0x00d1
        L_0x00c7:
            r0 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r8]
            r4[r7] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r3, r5, r4)
            r13 = 0
        L_0x00d1:
            java.lang.String r0 = "latitude"
            boolean r4 = r2.has(r0)     // Catch:{ Exception -> 0x00e8 }
            if (r4 != r8) goto L_0x00db
            r4 = 1
            goto L_0x00dc
        L_0x00db:
            r4 = 0
        L_0x00dc:
            if (r4 == 0) goto L_0x00e4
            double r2 = r2.getDouble(r0)     // Catch:{ Exception -> 0x00e8 }
            r15 = r2
            goto L_0x00e6
        L_0x00e4:
            r15 = 0
        L_0x00e6:
            r2 = r15
            goto L_0x00f2
        L_0x00e8:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r2[r7] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r3, r5, r2)
            r2 = 0
        L_0x00f2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "[jumpToPoi] poiName="
            r0.append(r4)
            r0.append(r9)
            java.lang.String r4 = " country="
            r0.append(r4)
            r0.append(r10)
            java.lang.String r4 = " city="
            r0.append(r4)
            r0.append(r11)
            java.lang.String r4 = " address="
            r0.append(r4)
            r0.append(r12)
            java.lang.String r4 = " longitude="
            r0.append(r4)
            r0.append(r13)
            java.lang.String r4 = " latitude="
            r0.append(r4)
            r0.append(r2)
            java.lang.String r4 = " poi="
            r0.append(r4)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "Finder.JumperUtils"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            te3.m74 r4 = new te3.m74
            r4.<init>()
            float r2 = (float) r2
            r4.f184220e = r2
            float r2 = (float) r13
            r4.f184219d = r2
            r4.f184224i = r6
            r4.f184221f = r11
            r4.f184234v = r10
            r4.f184223h = r12
            r4.f184222g = r9
            byte[] r2 = r4.toByteArray()
            java.lang.String r3 = "key_location"
            r0.putExtra(r3, r2)
            ht1.w3$a r2 = ht1.C98522w3.C8810a.FINDER_POI_FROM_TYPE_FINDER
            java.lang.String r3 = "key_from_type"
            r0.putExtra(r3, r2)
            rs1.s8$a r2 = rs1.C13442s8.f38060Q0
            rs1.s8 r2 = r2.mo12873f(r1)
            if (r2 == 0) goto L_0x0178
            int r3 = r2.f38096i
            java.lang.String r4 = "key_from_scene"
            r0.putExtra(r4, r3)
            java.lang.String r2 = r2.f38098n
            java.lang.String r3 = "key_context_id"
            r0.putExtra(r3, r2)
        L_0x0178:
            r2 = 3
            java.lang.String r3 = "key_entrance_type"
            r0.putExtra(r3, r2)
            java.lang.Class<er1.b> r2 = er1.C58684b.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            er1.b r2 = (er1.C58684b) r2
            r2.I00(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pf1.C62262d0.mo87328u(android.content.Context, org.json.JSONObject, int):void");
    }

    /* renamed from: v */
    public final void mo87329v(C11920q qVar) {
        String str;
        String str2;
        C87412m.m108594g(qVar, "jumpInfoEx");
        MiniAppInfo miniAppInfo = qVar.f34827a.mini_app_info;
        String str3 = "";
        if (miniAppInfo == null || (str = miniAppInfo.app_id) == null) {
            str = str3;
        }
        if (!(miniAppInfo == null || (str2 = miniAppInfo.appusername) == null)) {
            str3 = str2;
        }
        boolean z = true;
        if (str.length() == 0) {
            if (str3.length() != 0) {
                z = false;
            }
            if (z) {
                Log.m105924i("Finder.JumperUtils", "[preloadMiniApp] both appId and appUserName is empty");
                return;
            }
        }
        Log.m105924i("Finder.JumperUtils", "[preloadMiniApp] appId:" + str + " , appUserName:" + str3);
        ((C88262c1) C86312j.m106911c(C88262c1.class)).e60(str3, str, 11);
        ((C88274h0) C86312j.m106911c(C88274h0.class)).mo113299AC(C88273g1.FINDER_AD);
    }

    /* renamed from: w */
    public final void mo87330w(WeImageView weImageView, C11918p pVar) {
        int i = pVar.f34821d;
        if (i > 0) {
            weImageView.setImageResource(i);
        }
        if (pVar.f34822e > 0) {
            weImageView.setIconColor(weImageView.getContext().getResources().getColor(pVar.f34822e));
        }
    }
}
