package cl1;

import a14.C53973z1;
import al1.C0083r;
import al1.C0084x;
import al1.C27914d;
import al1.C54125e;
import al1.C54130j;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import androidx.lifecycle.C54219z;
import bd1.C39759i;
import bd1.C54447c;
import c50.C54655b;
import cj1.C0556j5;
import cj1.C0581o5;
import cj1.C54741c;
import cj1.C54754f;
import cl1.C54985m;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.finder.live.infrastructure.livedata.LiveMutableData;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.xweb.file.XVFSFile;
import d14.C58052j1;
import d14.C58056k1;
import d14.C58087u0;
import d50.C58113g;
import d50.C58114h;
import di1.C58270b;
import di3.C86312j;
import e00.C58468e0;
import eb0.C75592q0;
import er1.C58739j4;
import f40.C86709a0;
import fe1.C58961d;
import fe1.C58969q;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32227p;
import gg1.C32444a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import i50.C60251a;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import jq3.C9493c;
import ks3.C10409j;
import nk1.C61788m;
import nk1.C61791o;
import o40.C61926c;
import o40.C61937h;
import p196ln.C76706g;
import p823sg.C101614i;
import rx3.C13598b0;
import rx3.C13604l;
import sk1.C63965x;
import sx3.C64197v;
import te3.C48770aw0;
import te3.C48814b61;
import te3.C48899bs1;
import te3.C49056cw0;
import te3.C49083d21;
import te3.C49098d51;
import te3.C49188dt1;
import te3.C49890is1;
import te3.C50222l61;
import te3.C50266li0;
import te3.C50326ly0;
import te3.C50681oh0;
import te3.C50718oq3;
import te3.C50868ps1;
import te3.C51215sa1;
import te3.C51349t61;
import te3.C51463ty0;
import te3.C51560uk2;
import te3.C51601uv;
import te3.C51613uy0;
import te3.C51660v81;
import te3.C51790w61;
import te3.C52153yq0;
import te3.C52294zq0;
import te3.C64247az0;
import te3.C64269bu0;
import te3.C64273c21;
import te3.C64311db1;
import te3.C64373fs0;
import te3.C64383g31;
import te3.C64510l21;
import te3.C64561mp1;
import te3.C64674r41;
import te3.C64698s41;
import te3.C64740tw0;
import te3.C64756up2;
import te3.C64760uw0;
import te3.C64789vy0;
import te3.C64848y91;
import tf0.C64918r1;
import zc1.C66785b;

/* renamed from: cl1.o */
public final class C54991o extends C39970c<C45795b> {

    /* renamed from: g4 */
    public static final C0675c f154177g4 = new C0675c((C8480h) null);

    /* renamed from: A */
    public boolean f154178A = true;

    /* renamed from: A1 */
    public C51463ty0 f154179A1;

    /* renamed from: A2 */
    public int f154180A2;

    /* renamed from: A3 */
    public int f154181A3;

    /* renamed from: B */
    public boolean f154182B;

    /* renamed from: B1 */
    public C64269bu0 f154183B1;

    /* renamed from: B2 */
    public int f154184B2;

    /* renamed from: B3 */
    public boolean f154185B3;

    /* renamed from: C */
    public boolean f154186C;

    /* renamed from: C1 */
    public long f154187C1;

    /* renamed from: C2 */
    public Rect f154188C2;

    /* renamed from: C3 */
    public final C58087u0<Boolean> f154189C3;

    /* renamed from: D */
    public boolean f154190D;

    /* renamed from: D1 */
    public long f154191D1;

    /* renamed from: D2 */
    public int f154192D2;

    /* renamed from: D3 */
    public boolean f154193D3;

    /* renamed from: E */
    public C58087u0<Boolean> f154194E;

    /* renamed from: E1 */
    public boolean f154195E1;

    /* renamed from: E2 */
    public int f154196E2;

    /* renamed from: E3 */
    public boolean f154197E3;

    /* renamed from: F */
    public boolean f154198F;

    /* renamed from: F1 */
    public String f154199F1;

    /* renamed from: F2 */
    public boolean f154200F2;

    /* renamed from: F3 */
    public boolean f154201F3;

    /* renamed from: G */
    public C48814b61 f154202G;

    /* renamed from: G1 */
    public String f154203G1;

    /* renamed from: G2 */
    public String f154204G2;

    /* renamed from: G3 */
    public boolean f154205G3;

    /* renamed from: H */
    public FinderJumpInfo f154206H;

    /* renamed from: H1 */
    public LinkedList<C54741c> f154207H1;

    /* renamed from: H2 */
    public int f154208H2;

    /* renamed from: H3 */
    public boolean f154209H3;

    /* renamed from: I */
    public int f154210I;

    /* renamed from: I1 */
    public ArrayList<C9493c> f154211I1;

    /* renamed from: I2 */
    public boolean f154212I2;

    /* renamed from: I3 */
    public final C58087u0<C13604l<Boolean, byte[]>> f154213I3;

    /* renamed from: J */
    public int f154214J;

    /* renamed from: J1 */
    public FinderJumpInfo f154215J1;

    /* renamed from: J2 */
    public List<String> f154216J2;

    /* renamed from: J3 */
    public C53973z1 f154217J3;

    /* renamed from: K */
    public int f154218K;

    /* renamed from: K1 */
    public final ConcurrentLinkedQueue<C49056cw0> f154219K1;

    /* renamed from: K2 */
    public List<String> f154220K2;

    /* renamed from: K3 */
    public final C58087u0<Boolean> f154221K3;

    /* renamed from: L */
    public int f154222L;

    /* renamed from: L1 */
    public boolean f154223L1;

    /* renamed from: L2 */
    public List<C0581o5> f154224L2;

    /* renamed from: L3 */
    public String f154225L3;

    /* renamed from: M */
    public final List<C50718oq3> f154226M;

    /* renamed from: M1 */
    public boolean f154227M1;

    /* renamed from: M2 */
    public C0084x f154228M2;

    /* renamed from: M3 */
    public C64561mp1 f154229M3;

    /* renamed from: N */
    public C64756up2 f154230N;

    /* renamed from: N1 */
    public C49890is1 f154231N1;

    /* renamed from: N2 */
    public C54754f f154232N2;

    /* renamed from: N3 */
    public int f154233N3;

    /* renamed from: O1 */
    public boolean f154234O1;

    /* renamed from: O2 */
    public int f154235O2;

    /* renamed from: O3 */
    public boolean f154236O3;

    /* renamed from: P */
    public LiveMutableData<C64756up2> f154237P;

    /* renamed from: P1 */
    public int f154238P1;

    /* renamed from: P2 */
    public boolean f154239P2;

    /* renamed from: P3 */
    public boolean f154240P3;

    /* renamed from: Q */
    public String f154241Q;

    /* renamed from: Q0 */
    public int f154242Q0;

    /* renamed from: Q1 */
    public boolean f154243Q1;

    /* renamed from: Q2 */
    public int f154244Q2;

    /* renamed from: Q3 */
    public int f154245Q3;

    /* renamed from: R */
    public List<C32224a<C13598b0>> f154246R;

    /* renamed from: R0 */
    public int f154247R0;

    /* renamed from: R1 */
    public boolean f154248R1;

    /* renamed from: R2 */
    public C54125e f154249R2;

    /* renamed from: R3 */
    public C49083d21 f154250R3;

    /* renamed from: S */
    public int f154251S;

    /* renamed from: S0 */
    public String f154252S0;

    /* renamed from: S1 */
    public boolean f154253S1;

    /* renamed from: S2 */
    public Bitmap f154254S2;

    /* renamed from: S3 */
    public boolean f154255S3;

    /* renamed from: T */
    public boolean f154256T;

    /* renamed from: T0 */
    public long f154257T0;

    /* renamed from: T1 */
    public long f154258T1;

    /* renamed from: T2 */
    public C58969q f154259T2;

    /* renamed from: T3 */
    public boolean f154260T3;

    /* renamed from: U */
    public FinderJumpInfo f154261U;

    /* renamed from: U0 */
    public ConcurrentHashMap<String, Boolean> f154262U0;

    /* renamed from: U1 */
    public LiveMutableData<C10409j> f154263U1;

    /* renamed from: U2 */
    public boolean f154264U2;

    /* renamed from: U3 */
    public boolean f154265U3;

    /* renamed from: V */
    public volatile boolean f154266V;

    /* renamed from: V0 */
    public ConcurrentHashMap<String, Boolean> f154267V0;

    /* renamed from: V1 */
    public boolean f154268V1;

    /* renamed from: V2 */
    public LinkedList<C50222l61> f154269V2;

    /* renamed from: V3 */
    public FinderJumpInfo f154270V3;

    /* renamed from: W */
    public long f154271W;

    /* renamed from: W0 */
    public C64698s41 f154272W0;

    /* renamed from: W1 */
    public boolean f154273W1;

    /* renamed from: W2 */
    public boolean f154274W2;

    /* renamed from: W3 */
    public C51215sa1 f154275W3;

    /* renamed from: X */
    public long f154276X;

    /* renamed from: X0 */
    public boolean f154277X0;

    /* renamed from: X1 */
    public final C0674a f154278X1;

    /* renamed from: X2 */
    public long f154279X2;

    /* renamed from: X3 */
    public boolean f154280X3;

    /* renamed from: Y */
    public boolean f154281Y;

    /* renamed from: Y0 */
    public C50681oh0 f154282Y0;

    /* renamed from: Y1 */
    public C54992b f154283Y1;

    /* renamed from: Y2 */
    public int f154284Y2;

    /* renamed from: Y3 */
    public boolean f154285Y3;

    /* renamed from: Z */
    public boolean f154286Z;

    /* renamed from: Z0 */
    public int f154287Z0;

    /* renamed from: Z1 */
    public Boolean f154288Z1;

    /* renamed from: Z2 */
    public int f154289Z2;

    /* renamed from: Z3 */
    public C54219z<Boolean> f154290Z3;

    /* renamed from: a1 */
    public int f154291a1;

    /* renamed from: a2 */
    public int f154292a2;

    /* renamed from: a3 */
    public C64510l21 f154293a3;

    /* renamed from: a4 */
    public C64789vy0 f154294a4;

    /* renamed from: b1 */
    public int f154295b1;

    /* renamed from: b2 */
    public boolean f154296b2;

    /* renamed from: b3 */
    public String f154297b3;

    /* renamed from: b4 */
    public C49188dt1 f154298b4;

    /* renamed from: c1 */
    public int f154299c1;

    /* renamed from: c2 */
    public boolean f154300c2;

    /* renamed from: c3 */
    public boolean f154301c3;

    /* renamed from: c4 */
    public C54219z<String> f154302c4;

    /* renamed from: d1 */
    public int f154303d1;

    /* renamed from: d2 */
    public int f154304d2;

    /* renamed from: d3 */
    public boolean f154305d3;

    /* renamed from: d4 */
    public String f154306d4;

    /* renamed from: e1 */
    public C58087u0<Integer> f154307e1;

    /* renamed from: e2 */
    public boolean f154308e2;

    /* renamed from: e3 */
    public String f154309e3;

    /* renamed from: e4 */
    public C58270b f154310e4;

    /* renamed from: f */
    public final String f154311f;

    /* renamed from: f1 */
    public boolean f154312f1;

    /* renamed from: f2 */
    public boolean f154313f2;

    /* renamed from: f3 */
    public int f154314f3;

    /* renamed from: f4 */
    public int f154315f4;

    /* renamed from: g */
    public C61788m f154316g = ((C64918r1) C86312j.m106911c(C64918r1.class)).jq0();

    /* renamed from: g1 */
    public boolean f154317g1;

    /* renamed from: g2 */
    public String f154318g2;

    /* renamed from: g3 */
    public int f154319g3;

    /* renamed from: h */
    public LinkedList<C48770aw0> f154320h;

    /* renamed from: h1 */
    public C27914d f154321h1;

    /* renamed from: h2 */
    public LinkedList<C64848y91> f154322h2;

    /* renamed from: h3 */
    public String f154323h3;

    /* renamed from: i */
    public int f154324i;

    /* renamed from: i1 */
    public long f154325i1;

    /* renamed from: i2 */
    public C64848y91 f154326i2;

    /* renamed from: i3 */
    public String f154327i3;

    /* renamed from: j */
    public C52294zq0 f154328j;

    /* renamed from: j1 */
    public String f154329j1;

    /* renamed from: j2 */
    public C101614i<Long, C0581o5> f154330j2;

    /* renamed from: j3 */
    public boolean f154331j3;

    /* renamed from: k1 */
    public int f154332k1;

    /* renamed from: k2 */
    public C64373fs0 f154333k2;

    /* renamed from: k3 */
    public boolean f154334k3;

    /* renamed from: l1 */
    public int f154335l1;

    /* renamed from: l2 */
    public int f154336l2;

    /* renamed from: l3 */
    public String f154337l3;

    /* renamed from: m1 */
    public int f154338m1;

    /* renamed from: m2 */
    public LinkedList<C64373fs0> f154339m2;

    /* renamed from: m3 */
    public C49098d51 f154340m3;

    /* renamed from: n */
    public FinderObject f154341n;

    /* renamed from: n1 */
    public String f154342n1;

    /* renamed from: n2 */
    public long f154343n2;

    /* renamed from: n3 */
    public C52153yq0 f154344n3;

    /* renamed from: o */
    public String f154345o = "";

    /* renamed from: o1 */
    public long f154346o1;

    /* renamed from: o2 */
    public String f154347o2;

    /* renamed from: o3 */
    public LinkedList<C51349t61> f154348o3;

    /* renamed from: p */
    public long f154349p;

    /* renamed from: p0 */
    public boolean f154350p0;

    /* renamed from: p1 */
    public int f154351p1;

    /* renamed from: p2 */
    public Integer f154352p2;

    /* renamed from: p3 */
    public LinkedList<C51349t61> f154353p3;

    /* renamed from: q */
    public int f154354q;

    /* renamed from: q1 */
    public boolean f154355q1;

    /* renamed from: q2 */
    public boolean f154356q2;

    /* renamed from: q3 */
    public String f154357q3;

    /* renamed from: r */
    public long f154358r;

    /* renamed from: r1 */
    public C101614i<String, Long> f154359r1;

    /* renamed from: r2 */
    public String f154360r2;

    /* renamed from: r3 */
    public HashMap<Long, String> f154361r3;

    /* renamed from: s */
    public boolean f154362s = true;

    /* renamed from: s1 */
    public C51613uy0 f154363s1;

    /* renamed from: s2 */
    public boolean f154364s2;

    /* renamed from: s3 */
    public String f154365s3;

    /* renamed from: t */
    public boolean f154366t = true;

    /* renamed from: t1 */
    public String f154367t1;

    /* renamed from: t2 */
    public C64311db1 f154368t2;

    /* renamed from: t3 */
    public int f154369t3;

    /* renamed from: u */
    public boolean f154370u = true;

    /* renamed from: u1 */
    public int f154371u1;

    /* renamed from: u2 */
    public C64383g31 f154372u2;

    /* renamed from: u3 */
    public String f154373u3;

    /* renamed from: v */
    public String f154374v;

    /* renamed from: v1 */
    public boolean f154375v1;

    /* renamed from: v2 */
    public C0083r f154376v2;

    /* renamed from: v3 */
    public String f154377v3;

    /* renamed from: w */
    public boolean f154378w;

    /* renamed from: w1 */
    public C64247az0 f154379w1;

    /* renamed from: w2 */
    public List<C64674r41> f154380w2;

    /* renamed from: w3 */
    public String f154381w3;

    /* renamed from: x */
    public boolean f154382x;

    /* renamed from: x0 */
    public boolean f154383x0;

    /* renamed from: x1 */
    public boolean f154384x1;

    /* renamed from: x2 */
    public List<C51790w61> f154385x2;

    /* renamed from: x3 */
    public long f154386x3;

    /* renamed from: y */
    public boolean f154387y;

    /* renamed from: y0 */
    public int f154388y0;

    /* renamed from: y1 */
    public boolean f154389y1;

    /* renamed from: y2 */
    public List<C51660v81> f154390y2;

    /* renamed from: y3 */
    public boolean f154391y3;

    /* renamed from: z */
    public boolean f154392z = true;

    /* renamed from: z1 */
    public boolean f154393z1;

    /* renamed from: z2 */
    public ArrayList<String> f154394z2;

    /* renamed from: z3 */
    public C13604l<Integer, Integer> f154395z3;

    /* renamed from: cl1.o$a */
    public static final class C0674a {

        /* renamed from: a */
        public boolean f1585a;

        /* renamed from: b */
        public final List<C51601uv> f1586b;

        /* renamed from: c */
        public String f1587c;

        /* renamed from: d */
        public int f1588d;

        /* renamed from: e */
        public int f1589e;

        public C0674a() {
            this(false, (List) null, (String) null, 0, 0, 31, (C8480h) null);
        }

        public C0674a(boolean z, List<C51601uv> list, String str, int i, int i2, int i3, C8480h hVar) {
            z = (i3 & 1) != 0 ? false : z;
            if ((i3 & 2) != 0) {
                list = Collections.synchronizedList(new LinkedList());
                C87412m.m108593f(list, "synchronizedList(LinkedList<CheerIconInfo>())");
            }
            str = (i3 & 4) != 0 ? null : str;
            i = (i3 & 8) != 0 ? 0 : i;
            i2 = (i3 & 16) != 0 ? 0 : i2;
            C87412m.m108594g(list, "cheerIconInfos");
            this.f1585a = z;
            this.f1586b = list;
            this.f1587c = str;
            this.f1588d = i;
            this.f1589e = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0674a)) {
                return false;
            }
            C0674a aVar = (C0674a) obj;
            return this.f1585a == aVar.f1585a && C87412m.m108589b(this.f1586b, aVar.f1586b) && C87412m.m108589b(this.f1587c, aVar.f1587c) && this.f1588d == aVar.f1588d && this.f1589e == aVar.f1589e;
        }

        public int hashCode() {
            boolean z = this.f1585a;
            if (z) {
                z = true;
            }
            int hashCode = (((z ? 1 : 0) * true) + this.f1586b.hashCode()) * 31;
            String str = this.f1587c;
            return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f1588d) * 31) + this.f1589e;
        }

        public String toString() {
            return "CheerInfo(hasChanged=" + this.f1585a + ", cheerIconInfos=" + this.f1586b + ", cheerIconUrl=" + this.f1587c + ", enable=" + this.f1588d + ", cheerType=" + this.f1589e + ')';
        }
    }

    /* renamed from: cl1.o$c */
    public static final class C0675c {
        public C0675c(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo642a(List<? extends C48770aw0> list) {
            if (list == null || list.isEmpty()) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            for (C48770aw0 h : list) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append('[');
                sb4.append(C61937h.m72709h(h));
                sb4.append(']');
                sb.append(sb4.toString());
            }
            String sb5 = sb.toString();
            C87412m.m108593f(sb5, "badgeList.toString()");
            return sb5;
        }

        /* renamed from: b */
        public final void mo643b(List<? extends C48770aw0> list, String str) {
            C87412m.m108594g(str, "prefix");
            Log.m105924i("BadgeInfoList", str + XVFSFile.PATH_SEPARATOR_CHAR + mo642a(list));
        }
    }

    /* renamed from: cl1.o$d */
    public static final class C0676d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C54991o f1590d;

        /* renamed from: e */
        public final /* synthetic */ C64510l21 f1591e;

        /* renamed from: f */
        public final /* synthetic */ boolean f1592f;

        /* renamed from: g */
        public final /* synthetic */ C32227p<Boolean, Integer, C13598b0> f1593g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0676d(C54991o oVar, C64510l21 l212, boolean z, C32227p<? super Boolean, ? super Integer, C13598b0> pVar) {
            super(0);
            this.f1590d = oVar;
            this.f1591e = l212;
            this.f1592f = z;
            this.f1593g = pVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:44:0x014e, code lost:
            if (r14.f1590d.f154301c3 != false) goto L_0x0150;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x01a4, code lost:
            if (r3.f154301c3 != false) goto L_0x01a6;
         */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x01af  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r14 = this;
                java.lang.Class<cl1.z0> r0 = cl1.C0702z0.class
                java.lang.Class<cl1.o> r1 = cl1.C54991o.class
                er1.j4 r2 = er1.C58739j4.f168176a
                boolean r2 = r2.mo83692U()
                java.lang.String r3 = ", fromJoinLive:"
                java.lang.String r4 = ",lastAnchorPauseState:"
                r5 = 44
                r6 = 0
                if (r2 == 0) goto L_0x0068
                cl1.o r2 = r14.f1590d
                java.lang.String r2 = r2.f154311f
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "updateLayerShowInfoDebug firstAnchorPauseMsg info:"
                r7.append(r8)
                te3.l21 r8 = r14.f1591e
                if (r8 == 0) goto L_0x002d
                int r8 = r8.f184023d
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                goto L_0x002e
            L_0x002d:
                r8 = r6
            L_0x002e:
                r7.append(r8)
                r7.append(r5)
                te3.l21 r8 = r14.f1591e
                if (r8 == 0) goto L_0x003f
                int r8 = r8.f184025f
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                goto L_0x0040
            L_0x003f:
                r8 = r6
            L_0x0040:
                r7.append(r8)
                r7.append(r4)
                cl1.o r8 = r14.f1590d
                int r8 = r8.f154289Z2
                r7.append(r8)
                r7.append(r3)
                boolean r8 = r14.f1592f
                r7.append(r8)
                java.lang.String r8 = ", pauseWording:"
                r7.append(r8)
                te3.l21 r8 = r14.f1591e
                java.lang.String r8 = r8.f184026g
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r7)
            L_0x0068:
                te3.l21 r2 = r14.f1591e
                int r2 = r2.f184023d
                boolean r7 = r14.f1592f
                if (r7 != 0) goto L_0x0076
                cl1.o r7 = r14.f1590d
                int r7 = r7.f154289Z2
                if (r7 == r2) goto L_0x00bf
            L_0x0076:
                cl1.o r7 = r14.f1590d
                java.lang.String r7 = r7.f154311f
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "updateLayerShowInfo firstAnchorPauseMsg info:"
                r8.append(r9)
                te3.l21 r9 = r14.f1591e
                if (r9 == 0) goto L_0x0090
                int r9 = r9.f184023d
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                goto L_0x0091
            L_0x0090:
                r9 = r6
            L_0x0091:
                r8.append(r9)
                r8.append(r5)
                te3.l21 r5 = r14.f1591e
                if (r5 == 0) goto L_0x00a2
                int r5 = r5.f184025f
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                goto L_0x00a3
            L_0x00a2:
                r5 = r6
            L_0x00a3:
                r8.append(r5)
                r8.append(r4)
                cl1.o r4 = r14.f1590d
                int r4 = r4.f154289Z2
                r8.append(r4)
                r8.append(r3)
                boolean r3 = r14.f1592f
                r8.append(r3)
                java.lang.String r3 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r3)
            L_0x00bf:
                cl1.o r3 = r14.f1590d
                int r4 = r3.f154289Z2
                if (r2 != r4) goto L_0x00d1
                te3.l21 r0 = r14.f1591e
                int r1 = r0.f184025f
                r3.f154284Y2 = r1
                java.lang.String r0 = r0.f184026g
                r3.f154297b3 = r0
                goto L_0x0204
            L_0x00d1:
                r4 = 10001(0x2711, float:1.4014E-41)
                java.lang.String r5 = "liveData"
                r7 = 0
                r9 = 2
                r10 = 0
                r11 = 1
                if (r2 == 0) goto L_0x0181
                if (r2 == r11) goto L_0x016b
                if (r2 == r9) goto L_0x00e2
                goto L_0x01f2
            L_0x00e2:
                te3.l21 r9 = r14.f1591e
                int r12 = r9.f184025f
                if (r12 < 0) goto L_0x00ea
                r3.f154284Y2 = r12
            L_0x00ea:
                java.lang.String r9 = r9.f184026g
                r3.f154297b3 = r9
                fy3.p<java.lang.Boolean, java.lang.Integer, rx3.b0> r9 = r14.f1593g
                java.lang.Boolean r12 = java.lang.Boolean.TRUE
                int r3 = r3.f154284Y2
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r9.invoke(r12, r3)
                android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r3 = r3.getResources()
                r9 = 2131828435(0x7f111ed3, float:1.928981E38)
                java.lang.String r3 = r3.getString(r9)
                java.lang.String r9 = "getContext().resources.g…_live_pause_comment_tips)"
                gy3.C87412m.m108593f(r3, r9)
                cl1.o r9 = r14.f1590d
                fj1.b r9 = r9.f107146d
                gy3.C87412m.m108594g(r9, r5)
                te3.r41 r5 = new te3.r41
                r5.<init>()
                r5.f185127g = r4
                r5.f185126f = r3
                cj1.j5 r3 = new cj1.j5
                r3.<init>(r5)
                androidx.lifecycle.i0 r1 = r9.mo71262a(r1)
                cl1.o r1 = (cl1.C54991o) r1
                androidx.lifecycle.i0 r0 = r1.business(r0)
                cl1.z0 r0 = (cl1.C0702z0) r0
                java.util.List<cj1.o5> r0 = r0.f1672f
                r0.add(r3)
                y50.k r0 = y50.C53496k.f150436a
                r0.mo74169b()
                c50.b r0 = c50.C54655b.f153178f1
                if (r0 == 0) goto L_0x0140
                r0 = 1
                goto L_0x0141
            L_0x0140:
                r0 = 0
            L_0x0141:
                if (r0 != 0) goto L_0x0150
                i50.a r0 = i50.C60251a.f171781k1
                if (r0 == 0) goto L_0x0148
                r10 = 1
            L_0x0148:
                if (r10 == 0) goto L_0x01f2
                cl1.o r0 = r14.f1590d
                boolean r0 = r0.f154301c3
                if (r0 == 0) goto L_0x01f2
            L_0x0150:
                cl1.o r0 = r14.f1590d
                int r0 = r0.f154284Y2
                if (r0 < 0) goto L_0x01f2
                long r0 = android.os.SystemClock.elapsedRealtime()
                cl1.o r3 = r14.f1590d
                int r4 = r3.f154284Y2
                int r4 = r4 * 1000
                long r4 = (long) r4
                long r0 = r0 - r4
                int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                if (r4 <= 0) goto L_0x01f2
                r3.mo76017o4(r0)
                goto L_0x01f2
            L_0x016b:
                te3.l21 r0 = r14.f1591e
                int r0 = r0.f184025f
                if (r0 < 0) goto L_0x0173
                r3.f154284Y2 = r0
            L_0x0173:
                fy3.p<java.lang.Boolean, java.lang.Integer, rx3.b0> r0 = r14.f1593g
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                int r3 = r3.f154284Y2
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0.invoke(r1, r3)
                goto L_0x01f2
            L_0x0181:
                fy3.p<java.lang.Boolean, java.lang.Integer, rx3.b0> r12 = r14.f1593g
                java.lang.Boolean r13 = java.lang.Boolean.FALSE
                int r3 = r3.f154284Y2
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r12.invoke(r13, r3)
                cl1.o r3 = r14.f1590d
                r3.f154284Y2 = r10
                c50.b r12 = c50.C54655b.f153178f1
                if (r12 == 0) goto L_0x0198
                r12 = 1
                goto L_0x0199
            L_0x0198:
                r12 = 0
            L_0x0199:
                if (r12 != 0) goto L_0x01a6
                i50.a r12 = i50.C60251a.f171781k1
                if (r12 == 0) goto L_0x01a0
                r10 = 1
            L_0x01a0:
                if (r10 == 0) goto L_0x01a9
                boolean r10 = r3.f154301c3
                if (r10 == 0) goto L_0x01a9
            L_0x01a6:
                r3.mo76017o4(r7)
            L_0x01a9:
                cl1.o r3 = r14.f1590d
                int r3 = r3.f154289Z2
                if (r3 != r9) goto L_0x01ee
                android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r3 = r3.getResources()
                r7 = 2131828440(0x7f111ed8, float:1.928982E38)
                java.lang.String r3 = r3.getString(r7)
                java.lang.String r7 = "getContext().resources.g…se_recovery_comment_tips)"
                gy3.C87412m.m108593f(r3, r7)
                cl1.o r7 = r14.f1590d
                fj1.b r7 = r7.f107146d
                gy3.C87412m.m108594g(r7, r5)
                te3.r41 r5 = new te3.r41
                r5.<init>()
                r5.f185127g = r4
                r5.f185126f = r3
                cj1.j5 r3 = new cj1.j5
                r3.<init>(r5)
                androidx.lifecycle.i0 r1 = r7.mo71262a(r1)
                cl1.o r1 = (cl1.C54991o) r1
                androidx.lifecycle.i0 r0 = r1.business(r0)
                cl1.z0 r0 = (cl1.C0702z0) r0
                java.util.List<cj1.o5> r0 = r0.f1672f
                r0.add(r3)
                y50.k r0 = y50.C53496k.f150436a
                r0.mo74169b()
            L_0x01ee:
                cl1.o r0 = r14.f1590d
                r0.f154297b3 = r6
            L_0x01f2:
                cl1.o r0 = r14.f1590d
                r0.f154289Z2 = r2
                te3.l21 r1 = r0.f154293a3
                if (r1 == 0) goto L_0x0204
                r0.f154293a3 = r6
                java.lang.String r0 = r0.f154311f
                java.lang.String r1 = "updateLayerShowInfo clear cacheLayerInfo!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            L_0x0204:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: cl1.C54991o.C0676d.invoke():java.lang.Object");
        }
    }

    /* renamed from: cl1.o$b */
    public static final class C54992b {

        /* renamed from: a */
        public String f154396a;

        /* renamed from: b */
        public int f154397b;

        public C54992b(String str, int i) {
            this.f154396a = str;
            this.f154397b = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C54992b)) {
                return false;
            }
            C54992b bVar = (C54992b) obj;
            return C87412m.m108589b(this.f154396a, bVar.f154396a) && this.f154397b == bVar.f154397b;
        }

        public int hashCode() {
            String str = this.f154396a;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.f154397b;
        }

        public String toString() {
            return "CheerInfoVersion[id = " + this.f154396a + ", version = " + this.f154397b + ']';
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54991o(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
        String str = "LiveCommonSlice@" + hashCode();
        this.f154311f = str;
        Boolean bool = Boolean.FALSE;
        this.f154194E = C58056k1.m67214a(bool);
        this.f154222L = -1;
        this.f154226M = new ArrayList();
        this.f154237P = new LiveMutableData<>();
        this.f154246R = new ArrayList();
        this.f154350p0 = true;
        this.f154388y0 = -1;
        this.f154262U0 = new ConcurrentHashMap<>();
        this.f154267V0 = new ConcurrentHashMap<>();
        this.f154307e1 = C58056k1.m67214a(0);
        this.f154312f1 = true;
        this.f154317g1 = true;
        this.f154321h1 = new C27914d((String) null, (Bundle) null, (Object) null);
        this.f154342n1 = "";
        this.f154351p1 = -1;
        this.f154359r1 = new C101614i<>(100);
        this.f154367t1 = "";
        this.f154187C1 = -1;
        this.f154191D1 = -1;
        this.f154199F1 = "";
        this.f154203G1 = "";
        this.f154207H1 = new LinkedList<>();
        this.f154211I1 = new ArrayList<>();
        this.f154219K1 = new ConcurrentLinkedQueue<>();
        this.f154227M1 = true;
        this.f154238P1 = -1;
        this.f154253S1 = true;
        this.f154263U1 = new LiveMutableData<>();
        this.f154278X1 = new C0674a(false, (List) null, (String) null, 0, 0, 31, (C8480h) null);
        this.f154304d2 = 2;
        this.f154308e2 = true;
        this.f154313f2 = true;
        this.f154318g2 = "";
        this.f154330j2 = new C101614i<>(1000);
        this.f154333k2 = new C64373fs0();
        this.f154336l2 = 4;
        this.f154339m2 = new LinkedList<>();
        this.f154343n2 = Long.MIN_VALUE;
        this.f154372u2 = new C64383g31();
        this.f154376v2 = new C0083r((LinkedList) null, (String) null, 3, (C8480h) null);
        this.f154380w2 = Collections.synchronizedList(new ArrayList());
        this.f154385x2 = Collections.synchronizedList(new ArrayList());
        List<C51660v81> synchronizedList = Collections.synchronizedList(new ArrayList());
        C87412m.m108593f(synchronizedList, "synchronizedList(ArrayLi…veShortcutWordingInfo>())");
        this.f154390y2 = synchronizedList;
        new ArrayList();
        this.f154394z2 = new ArrayList<>();
        this.f154188C2 = new Rect(0, 0, C75044y4.m89990b(MMApplicationContext.getContext()).x, C75044y4.m89990b(MMApplicationContext.getContext()).y);
        this.f154204G2 = "";
        this.f154212I2 = C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_FINDER_LIVE_HAS_GET_REWARD_BOOLEAN_SYNC, false);
        this.f154216J2 = Collections.synchronizedList(new ArrayList());
        this.f154220K2 = Collections.synchronizedList(new ArrayList());
        this.f154224L2 = Collections.synchronizedList(new ArrayList());
        this.f154232N2 = new C54754f();
        C32444a aVar = C32444a.f86121a;
        this.f154235O2 = C32444a.f86052F.mo60266n().intValue();
        this.f154244Q2 = -1;
        this.f154249R2 = new C54125e((String) null, (String) null, (String) null, 7, (C8480h) null);
        this.f154269V2 = new LinkedList<>();
        this.f154323h3 = "";
        this.f154327i3 = "";
        this.f154348o3 = new LinkedList<>();
        this.f154353p3 = new LinkedList<>();
        this.f154361r3 = new HashMap<>();
        this.f154373u3 = "";
        this.f154395z3 = new C13604l<>(0, 0);
        this.f154189C3 = C58056k1.m67214a(Boolean.TRUE);
        this.f154213I3 = C58056k1.m67214a(new C13604l(bool, null));
        this.f154221K3 = C58056k1.m67214a(bool);
        this.f154290Z3 = new C54219z<>(bool);
        this.f154302c4 = new C54219z<>("");
        this.f154310e4 = new C58270b();
        Log.m105924i(str, "LiveBuContext init " + C58739j4.f168176a.mo83708f0());
    }

    /* renamed from: C4 */
    public final void mo75955C4(int i) {
        if (i != this.f154287Z0) {
            String str = this.f154311f;
            Log.m105924i(str, "liveMode " + i);
        }
        this.f154287Z0 = i;
    }

    /* renamed from: D4 */
    public final void mo75956D4(boolean z) {
        this.f154274W2 = z;
    }

    /* renamed from: E4 */
    public final void mo75957E4(boolean z) {
        String str = this.f154311f;
        Log.printInfoStack(str, "passEmptyOpenId set " + z, new Object[0]);
        this.f154384x1 = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* renamed from: F3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final te3.C49747hs1 mo75958F3() {
        /*
            r5 = this;
            zc1.b r0 = zc1.C66785b.f191882e
            bd1.e r0 = r0.mo90673n0()
            te3.sq2 r0 = r0.mo62398d()
            te3.is1 r0 = r0.f141686r
            r1 = 0
            if (r0 == 0) goto L_0x0014
            byte[] r0 = r0.toByteArray()
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.encodeHexString(r0)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 != 0) goto L_0x005a
            te3.is1 r2 = new te3.is1
            r2.<init>()
            byte[] r0 = com.tencent.p014mm.sdk.platformtools.Util.decodeHexString(r0)
            if (r0 != 0) goto L_0x002c
        L_0x002a:
            r2 = r1
            goto L_0x003f
        L_0x002c:
            r2.parseFrom(r0)     // Catch:{ Exception -> 0x0030 }
            goto L_0x003f
        L_0x0030:
            r0 = move-exception
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "safeParser"
            java.lang.String r3 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r0, r3, r2)
            goto L_0x002a
        L_0x003f:
            if (r2 == 0) goto L_0x005b
            nk1.o r0 = nk1.C61791o.f175673a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r5.f154311f
            r3.append(r4)
            java.lang.String r4 = "_getcur"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.mo86721c(r2, r3)
            goto L_0x005b
        L_0x005a:
            r2 = r1
        L_0x005b:
            if (r2 == 0) goto L_0x0060
            java.lang.String r0 = r2.f135635f
            goto L_0x0061
        L_0x0060:
            r0 = r1
        L_0x0061:
            if (r0 == 0) goto L_0x0085
            if (r2 == 0) goto L_0x0085
            java.util.LinkedList<te3.hs1> r2 = r2.f135633d
            if (r2 == 0) goto L_0x0085
            java.util.Iterator r2 = r2.iterator()
        L_0x006d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0083
            java.lang.Object r3 = r2.next()
            r4 = r3
            te3.hs1 r4 = (te3.C49747hs1) r4
            java.lang.String r4 = r4.f134839d
            boolean r4 = gy3.C87412m.m108589b(r4, r0)
            if (r4 == 0) goto L_0x006d
            r1 = r3
        L_0x0083:
            te3.hs1 r1 = (te3.C49747hs1) r1
        L_0x0085:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cl1.C54991o.mo75958F3():te3.hs1");
    }

    /* renamed from: F4 */
    public final void mo75959F4(C48814b61 b612) {
        String str = this.f154311f;
        StringBuilder sb = new StringBuilder();
        sb.append("FinderLivePromotionEntrance set, value miniapp:");
        FinderJumpInfo finderJumpInfo = null;
        boolean z = true;
        sb.append((b612 != null ? b612.f130979d : null) != null);
        sb.append(", liteapp:");
        if (b612 != null) {
            finderJumpInfo = b612.f130980e;
        }
        if (finderJumpInfo == null) {
            z = false;
        }
        sb.append(z);
        Log.m105924i(str, sb.toString());
        this.f154202G = b612;
    }

    /* renamed from: G3 */
    public final boolean mo75960G3() {
        return this.f154244Q2 == 1;
    }

    /* renamed from: G4 */
    public final void mo75961G4(String str) {
        C87412m.m108594g(str, "value");
        C0740i2 i2Var = ((C54979h1) business(C54979h1.class)).f154147v;
        if (!(i2Var instanceof C63965x)) {
            i2Var = null;
        }
        if (i2Var != null) {
            ((C63965x) i2Var).f181346s.f183193x = str;
        }
        this.f154318g2 = str;
    }

    /* renamed from: H4 */
    public final void mo75962H4(int i) {
        if (this.f154222L != i) {
            for (C32224a invoke : this.f154246R) {
                invoke.invoke();
            }
        }
        String str = this.f154311f;
        Log.m105924i(str, "olympics set stream_status:" + i);
        this.f154222L = i;
    }

    /* renamed from: I3 */
    public final boolean mo75963I3() {
        return this.f154238P1 == 1;
    }

    /* renamed from: I4 */
    public final void mo75964I4(long j) {
        String str = this.f154311f;
        Log.m105924i(str, "join live time:" + j);
        this.f154346o1 = j;
    }

    /* renamed from: J3 */
    public final boolean mo75965J3() {
        LinkedList<String> linkedList = this.f154376v2.f513a;
        return !(linkedList == null || linkedList.isEmpty());
    }

    /* renamed from: J4 */
    public final boolean mo75966J4() {
        return this.f154332k1 == 1;
    }

    /* renamed from: K3 */
    public final C50868ps1 mo75967K3() {
        C48899bs1 bs12;
        LinkedList<C51560uk2> linkedList;
        T t;
        boolean z;
        C51613uy0 uy02 = this.f154363s1;
        if (uy02 == null || (bs12 = uy02.f143180d) == null || (linkedList = bs12.f131284d) == null) {
            return null;
        }
        Iterator<T> it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C51560uk2) t).f142914e == 7) {
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
        C51560uk2 uk22 = (C51560uk2) t;
        if (uk22 != null) {
            return uk22.f142915f;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:196:0x0680  */
    /* renamed from: K4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo75968K4(te3.C50710oo2 r32, int r33) {
        /*
            r31 = this;
            r1 = r31
            r0 = r32
            r2 = r33
            java.lang.Class<cl1.d0> r3 = cl1.C54963d0.class
            java.lang.Class<cl1.o> r4 = cl1.C54991o.class
            java.lang.Class<cl1.h1> r5 = cl1.C54979h1.class
            java.lang.Class<cl1.z0> r6 = cl1.C0702z0.class
            java.lang.String r7 = "anchorStatus"
            gy3.C87412m.m108594g(r0, r7)
            long r7 = r0.f139284e
            java.lang.String r9 = r1.f154311f
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "updateAnchorStatus mode:"
            r10.append(r11)
            r10.append(r2)
            java.lang.String r11 = ", anchorStatusFlag:"
            r10.append(r11)
            int r11 = (int) r7
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            androidx.lifecycle.i0 r9 = r1.business(r3)
            cl1.d0 r9 = (cl1.C54963d0) r9
            r12 = 2
            r13 = 1
            if (r2 == r12) goto L_0x0041
            r14 = 1
            goto L_0x0042
        L_0x0041:
            r14 = 0
        L_0x0042:
            te3.ww2 r15 = r0.f139286g
            androidx.lifecycle.i0 r16 = r9.business(r3)
            r12 = r16
            cl1.d0 r12 = (cl1.C54963d0) r12
            boolean r12 = r12.f154080w
            r16 = 0
            if (r12 == 0) goto L_0x01ff
            androidx.lifecycle.i0 r12 = r9.business(r3)
            cl1.d0 r12 = (cl1.C54963d0) r12
            boolean r12 = r12.f154081x
            if (r12 == 0) goto L_0x01ff
            r12 = 64
            boolean r12 = o40.C61926c.m72696u(r11, r12)
            androidx.lifecycle.i0 r17 = r9.business(r3)
            r10 = r17
            cl1.d0 r10 = (cl1.C54963d0) r10
            int r10 = r10.f154079v
            if (r10 != r13) goto L_0x0070
            r10 = 1
            goto L_0x0071
        L_0x0070:
            r10 = 0
        L_0x0071:
            if (r12 == r10) goto L_0x01eb
            androidx.lifecycle.i0 r10 = r9.business(r3)
            cl1.d0 r10 = (cl1.C54963d0) r10
            int r10 = r10.f154079v
            r13 = -1
            if (r10 == r13) goto L_0x01eb
            if (r14 == 0) goto L_0x01eb
            fj1.b r10 = r9.f107146d
            if (r10 == 0) goto L_0x01eb
            te3.r41 r13 = new te3.r41
            r13.<init>()
            r0 = 10001(0x2711, float:1.4014E-41)
            r13.f185127g = r0
            androidx.lifecycle.i0 r0 = r10.mo71262a(r3)
            cl1.d0 r0 = (cl1.C54963d0) r0
            boolean r0 = r0.mo75902I3()
            if (r0 != 0) goto L_0x00b4
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r18 = r5
            r5 = 2131827701(0x7f111bf5, float:1.9288322E38)
            java.lang.String r0 = r0.getString(r5)
            r19 = r7
            r22 = r11
            r21 = r14
            r30 = r15
            goto L_0x01be
        L_0x00b4:
            r18 = r5
            java.lang.Class<tf0.r1> r0 = tf0.C64918r1.class
            di3.d r5 = di3.C86312j.m106911c(r0)
            tf0.r1 r5 = (tf0.C64918r1) r5
            boolean r5 = r5.mo89039GD()
            if (r5 != 0) goto L_0x019e
            java.util.List<al1.j> r5 = r9.f154074q
            java.lang.String r2 = "audienceLinkMicUserList"
            gy3.C87412m.m108593f(r5, r2)
            monitor-enter(r5)
            java.util.Iterator r2 = r5.iterator()     // Catch:{ all -> 0x019b }
        L_0x00d0:
            boolean r19 = r2.hasNext()     // Catch:{ all -> 0x019b }
            if (r19 == 0) goto L_0x00fa
            java.lang.Object r19 = r2.next()     // Catch:{ all -> 0x019b }
            r20 = r2
            r2 = r19
            al1.j r2 = (al1.C54130j) r2     // Catch:{ all -> 0x019b }
            java.lang.String r2 = r2.f151997a     // Catch:{ all -> 0x019b }
            androidx.lifecycle.i0 r21 = r9.business(r4)     // Catch:{ all -> 0x019b }
            cl1.o r21 = (cl1.C54991o) r21     // Catch:{ all -> 0x019b }
            r22 = r11
            java.lang.String r11 = r21.mo76015n4()     // Catch:{ all -> 0x019b }
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r2, (java.lang.String) r11)     // Catch:{ all -> 0x019b }
            if (r2 == 0) goto L_0x00f5
            goto L_0x00fe
        L_0x00f5:
            r2 = r20
            r11 = r22
            goto L_0x00d0
        L_0x00fa:
            r22 = r11
            r19 = r16
        L_0x00fe:
            monitor-exit(r5)
            r2 = r19
            al1.j r2 = (al1.C54130j) r2
            if (r2 == 0) goto L_0x0182
            y50.f r5 = new y50.f
            java.lang.Class<cl1.u> r11 = cl1.C55001u.class
            androidx.lifecycle.i0 r11 = r9.business(r11)
            cl1.u r11 = (cl1.C55001u) r11
            te3.c21 r11 = r11.f154420q
            r19 = r7
            long r7 = r11.f182392d
            java.lang.String r11 = r2.f151999c
            java.lang.String r1 = r2.f152002f
            r21 = r14
            java.lang.String r14 = r2.f151997a
            r30 = r15
            int r15 = r2.f152001e
            r23 = r5
            r24 = r7
            r26 = r11
            r27 = r1
            r28 = r14
            r29 = r15
            r23.<init>(r24, r26, r27, r28, r29)
            r9.mo75916X3(r5)
            java.util.List<al1.j> r1 = r9.f154076s
            java.lang.String r5 = "linkMicUserInfoList"
            gy3.C87412m.m108593f(r1, r5)
            cl1.e0 r5 = new cl1.e0
            r5.<init>(r9)
            o40.C61926c.m72700y(r1, r5)
            java.lang.String r1 = r2.f151997a
            androidx.lifecycle.i0 r5 = r9.business(r4)
            cl1.o r5 = (cl1.C54991o) r5
            java.lang.String r5 = r5.mo76015n4()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r1, (java.lang.String) r5)
            if (r1 == 0) goto L_0x0157
            r1 = 0
            r9.f154078u = r1
        L_0x0157:
            java.lang.String r1 = "MMFinder.LiveLinkMicSlice"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "checkCloseMic, [sdkUserId:"
            r5.append(r7)
            java.lang.String r7 = r2.f151997a
            r5.append(r7)
            java.lang.String r7 = "] , closeUser:"
            r5.append(r7)
            r5.append(r2)
            java.lang.String r2 = ", linkMicState:"
            r5.append(r2)
            int r2 = r9.f154078u
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            goto L_0x0188
        L_0x0182:
            r19 = r7
            r21 = r14
            r30 = r15
        L_0x0188:
            di3.d r1 = di3.C86312j.m106911c(r0)
            tf0.r1 r1 = (tf0.C64918r1) r1
            r1.mo89065rc()
            di3.d r0 = di3.C86312j.m106911c(r0)
            tf0.r1 r0 = (tf0.C64918r1) r0
            r0.mo89069zq()
            goto L_0x01af
        L_0x019b:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x019e:
            r19 = r7
            r22 = r11
            r21 = r14
            r30 = r15
            di3.d r0 = di3.C86312j.m106911c(r0)
            tf0.r1 r0 = (tf0.C64918r1) r0
            r0.nh0()
        L_0x01af:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131827699(0x7f111bf3, float:1.9288318E38)
            java.lang.String r0 = r0.getString(r1)
        L_0x01be:
            r13.f185126f = r0
            cj1.j5 r0 = new cj1.j5
            r0.<init>(r13)
            androidx.lifecycle.i0 r1 = r10.mo71262a(r6)
            cl1.z0 r1 = (cl1.C0702z0) r1
            java.util.List<cj1.o5> r1 = r1.f1672f
            r1.add(r0)
            java.lang.String r1 = "MMFinder.LiveLinkMicSlice"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "appendLinkMicTip:"
            r2.append(r5)
            te3.r41 r0 = r0.f1344a
            java.lang.String r0 = r0.f185126f
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            goto L_0x01f5
        L_0x01eb:
            r18 = r5
            r19 = r7
            r22 = r11
            r21 = r14
            r30 = r15
        L_0x01f5:
            androidx.lifecycle.i0 r0 = r9.business(r3)
            cl1.d0 r0 = (cl1.C54963d0) r0
            r0.f154079v = r12
            r1 = 0
            goto L_0x0212
        L_0x01ff:
            r18 = r5
            r19 = r7
            r22 = r11
            r21 = r14
            r30 = r15
            androidx.lifecycle.i0 r0 = r9.business(r3)
            cl1.d0 r0 = (cl1.C54963d0) r0
            r1 = 0
            r0.f154079v = r1
        L_0x0212:
            r7 = 0
            if (r30 == 0) goto L_0x021b
            r0 = r30
            long r10 = r0.f144323d
            goto L_0x021e
        L_0x021b:
            r0 = r30
            r10 = r7
        L_0x021e:
            te3.ww2 r2 = r9.f154048B
            long r12 = r2.f144323d
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 == 0) goto L_0x0305
            r2.f144323d = r10
            androidx.lifecycle.i0 r2 = r9.business(r4)
            cl1.o r2 = (cl1.C54991o) r2
            boolean r2 = r2.mo75991Z3()
            if (r2 != 0) goto L_0x0305
            if (r21 == 0) goto L_0x0305
            fj1.b r2 = r9.f107146d
            if (r2 == 0) goto L_0x0305
            androidx.lifecycle.i0 r5 = r2.mo71262a(r3)
            cl1.d0 r5 = (cl1.C54963d0) r5
            te3.ww2 r5 = r5.f154048B
            if (r5 == 0) goto L_0x0247
            long r10 = r5.f144323d
            goto L_0x0248
        L_0x0247:
            r10 = r7
        L_0x0248:
            int r5 = (int) r10
            r10 = 2
            boolean r5 = o40.C61926c.m72696u(r5, r10)
            if (r5 == 0) goto L_0x0260
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r7 = 2131828066(0x7f111d62, float:1.9289062E38)
            java.lang.String r5 = r5.getString(r7)
            goto L_0x02b9
        L_0x0260:
            androidx.lifecycle.i0 r5 = r2.mo71262a(r3)
            cl1.d0 r5 = (cl1.C54963d0) r5
            te3.ww2 r5 = r5.f154048B
            if (r5 == 0) goto L_0x026d
            long r10 = r5.f144323d
            goto L_0x026e
        L_0x026d:
            r10 = r7
        L_0x026e:
            int r5 = (int) r10
            r10 = 1
            boolean r5 = o40.C61926c.m72696u(r5, r10)
            if (r5 == 0) goto L_0x0286
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r7 = 2131828067(0x7f111d63, float:1.9289064E38)
            java.lang.String r5 = r5.getString(r7)
            goto L_0x02b9
        L_0x0286:
            androidx.lifecycle.i0 r5 = r2.mo71262a(r3)
            cl1.d0 r5 = (cl1.C54963d0) r5
            te3.ww2 r5 = r5.f154048B
            if (r5 == 0) goto L_0x0292
            long r7 = r5.f144323d
        L_0x0292:
            int r5 = (int) r7
            r7 = 4
            boolean r5 = o40.C61926c.m72696u(r5, r7)
            if (r5 == 0) goto L_0x02aa
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r7 = 2131828065(0x7f111d61, float:1.928906E38)
            java.lang.String r5 = r5.getString(r7)
            goto L_0x02b9
        L_0x02aa:
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r7 = 2131828064(0x7f111d60, float:1.9289058E38)
            java.lang.String r5 = r5.getString(r7)
        L_0x02b9:
            java.lang.String r7 = "when {\n                L…          }\n            }"
            gy3.C87412m.m108593f(r5, r7)
            int r7 = r5.length()
            if (r7 != 0) goto L_0x02c7
            r7 = 1
            goto L_0x02c8
        L_0x02c7:
            r7 = 0
        L_0x02c8:
            if (r7 != 0) goto L_0x02ef
            java.lang.String r7 = r9.f154054H
            boolean r7 = gy3.C87412m.m108589b(r7, r5)
            if (r7 != 0) goto L_0x02ef
            te3.r41 r7 = new te3.r41
            r7.<init>()
            r8 = 10001(0x2711, float:1.4014E-41)
            r7.f185127g = r8
            r7.f185126f = r5
            cj1.j5 r8 = new cj1.j5
            r8.<init>(r7)
            r9.f154054H = r5
            androidx.lifecycle.i0 r2 = r2.mo71262a(r6)
            cl1.z0 r2 = (cl1.C0702z0) r2
            java.util.List<cj1.o5> r2 = r2.f1672f
            r2.add(r8)
        L_0x02ef:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "appendMicSettingTip:"
            r2.append(r7)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "MMFinder.LiveLinkMicSlice"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
        L_0x0305:
            java.lang.String r2 = "MMFinder.LiveLinkMicSlice"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "updateLiveMsg anchorStatusFlag:"
            r5.append(r7)
            r7 = r19
            r5.append(r7)
            java.lang.String r9 = " micSetting:"
            r5.append(r9)
            if (r0 == 0) goto L_0x0325
            long r9 = r0.f144323d
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            goto L_0x0327
        L_0x0325:
            r0 = r16
        L_0x0327:
            r5.append(r0)
            java.lang.String r0 = ",needAppendTips:"
            r5.append(r0)
            r13 = r21
            r5.append(r13)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            java.lang.Class<cl1.t0> r0 = cl1.C39981t0.class
            r2 = r31
            androidx.lifecycle.i0 r0 = r2.business(r0)
            cl1.t0 r0 = (cl1.C39981t0) r0
            androidx.lifecycle.i0 r5 = r0.business(r4)
            cl1.o r5 = (cl1.C54991o) r5
            boolean r5 = r5.f154268V1
            java.lang.String r9 = "LiveMicIntercomSlice"
            if (r5 == 0) goto L_0x03d3
            r5 = 16384(0x4000, float:2.2959E-41)
            r10 = r22
            boolean r5 = o40.C61926c.m72696u(r10, r5)
            di1.c<java.lang.Boolean> r11 = r0.f107198j
            java.lang.Object r11 = r11.getValue()
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            boolean r11 = gy3.C87412m.m108589b(r11, r12)
            if (r5 == r11) goto L_0x03c9
            fj1.b r11 = r0.f107146d
            if (r11 == 0) goto L_0x03c9
            te3.r41 r13 = new te3.r41
            r13.<init>()
            r14 = 10001(0x2711, float:1.4014E-41)
            r13.f185127g = r14
            di1.c<java.lang.Boolean> r14 = r0.f107198j
            java.lang.Object r14 = r14.getValue()
            boolean r12 = gy3.C87412m.m108589b(r14, r12)
            if (r12 == 0) goto L_0x0390
            android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r12 = r12.getResources()
            r14 = 2131827709(0x7f111bfd, float:1.9288338E38)
            java.lang.String r12 = r12.getString(r14)
            goto L_0x039f
        L_0x0390:
            android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r12 = r12.getResources()
            r14 = 2131827711(0x7f111bff, float:1.9288342E38)
            java.lang.String r12 = r12.getString(r14)
        L_0x039f:
            r13.f185126f = r12
            cj1.j5 r12 = new cj1.j5
            r12.<init>(r13)
            androidx.lifecycle.i0 r11 = r11.mo71262a(r6)
            cl1.z0 r11 = (cl1.C0702z0) r11
            java.util.List<cj1.o5> r11 = r11.f1672f
            r11.add(r12)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "appendLinkMicTip:"
            r11.append(r13)
            te3.r41 r12 = r12.f1344a
            java.lang.String r12 = r12.f185126f
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r11)
        L_0x03c9:
            di1.c<java.lang.Boolean> r11 = r0.f107198j
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r11.postValue(r5)
            goto L_0x03dc
        L_0x03d3:
            r10 = r22
            di1.c<java.lang.Boolean> r5 = r0.f107198j
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r5.postValue(r11)
        L_0x03dc:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r11 = "updateLiveMsg anchorStatusFlag:"
            r5.append(r11)
            r5.append(r7)
            java.lang.String r11 = " enableMicIntercomSwitch: "
            r5.append(r11)
            androidx.lifecycle.i0 r0 = r0.business(r4)
            cl1.o r0 = (cl1.C54991o) r0
            boolean r0 = r0.f154268V1
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            r0 = 512(0x200, float:7.175E-43)
            boolean r0 = o40.C61926c.m72696u(r10, r0)
            r5 = 1
            r0 = r0 ^ r5
            boolean r5 = r2.f154178A
            if (r0 == r5) goto L_0x0456
            r5 = r33
            r9 = 2
            if (r5 == r9) goto L_0x0458
            androidx.lifecycle.i0 r9 = r2.business(r6)
            cl1.z0 r9 = (cl1.C0702z0) r9
            if (r0 == 0) goto L_0x0426
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r11 = r11.getResources()
            r12 = 2131827646(0x7f111bbe, float:1.928821E38)
            goto L_0x0431
        L_0x0426:
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r11 = r11.getResources()
            r12 = 2131827645(0x7f111bbd, float:1.9288208E38)
        L_0x0431:
            java.lang.String r11 = r11.getString(r12)
            java.lang.String r12 = "if (liveRoomLike) MMAppl…live_like_anchor_disable)"
            gy3.C87412m.m108593f(r11, r12)
            te3.r41 r12 = new te3.r41
            r12.<init>()
            r12.f185126f = r11
            r11 = 10001(0x2711, float:1.4014E-41)
            r12.f185127g = r11
            cj1.j5 r11 = new cj1.j5
            r11.<init>(r12)
            androidx.lifecycle.i0 r9 = r9.business(r6)
            cl1.z0 r9 = (cl1.C0702z0) r9
            java.util.List<cj1.o5> r9 = r9.f1672f
            r9.add(r11)
            goto L_0x0458
        L_0x0456:
            r5 = r33
        L_0x0458:
            r2.f154178A = r0
            r0 = 8192(0x2000, float:1.14794E-41)
            boolean r0 = o40.C61926c.m72696u(r10, r0)
            boolean r9 = r2.f154382x
            if (r0 == r9) goto L_0x04ae
            r9 = 2
            if (r5 == r9) goto L_0x04ae
            androidx.lifecycle.i0 r9 = r2.business(r6)
            cl1.z0 r9 = (cl1.C0702z0) r9
            if (r0 == 0) goto L_0x047f
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r11 = r11.getResources()
            r12 = 2131827037(0x7f11195d, float:1.9286975E38)
            java.lang.String r11 = r11.getString(r12)
            goto L_0x048e
        L_0x047f:
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r11 = r11.getResources()
            r12 = 2131827036(0x7f11195c, float:1.9286973E38)
            java.lang.String r11 = r11.getString(r12)
        L_0x048e:
            java.lang.String r12 = "if (isAnonymous)\n       …disable\n                )"
            gy3.C87412m.m108593f(r11, r12)
            te3.r41 r12 = new te3.r41
            r12.<init>()
            r12.f185126f = r11
            r11 = 10001(0x2711, float:1.4014E-41)
            r12.f185127g = r11
            cj1.j5 r11 = new cj1.j5
            r11.<init>(r12)
            androidx.lifecycle.i0 r9 = r9.business(r6)
            cl1.z0 r9 = (cl1.C0702z0) r9
            java.util.List<cj1.o5> r9 = r9.f1672f
            r9.add(r11)
        L_0x04ae:
            r2.f154382x = r0
            r0 = 8
            boolean r0 = o40.C61926c.m72696u(r10, r0)
            r9 = 1
            r0 = r0 ^ r9
            r2.f154370u = r0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            r2.f154288Z1 = r9
            boolean r9 = r2.f154370u
            if (r0 == r9) goto L_0x0520
            r9 = 2
            if (r5 == r9) goto L_0x0520
            androidx.lifecycle.i0 r9 = r2.business(r6)
            cl1.z0 r9 = (cl1.C0702z0) r9
            if (r0 == 0) goto L_0x04db
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r11 = 2131827215(0x7f111a0f, float:1.9287336E38)
            goto L_0x04e6
        L_0x04db:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r11 = 2131827214(0x7f111a0e, float:1.9287334E38)
        L_0x04e6:
            java.lang.String r0 = r0.getString(r11)
            java.lang.String r11 = "if (liveRoomComment) MMA…e_comment_anchor_disable)"
            gy3.C87412m.m108593f(r0, r11)
            te3.r41 r11 = new te3.r41
            r11.<init>()
            te3.hx0 r12 = new te3.hx0
            r12.<init>()
            com.tencent.mm.protocal.protobuf.FinderContact r13 = new com.tencent.mm.protocal.protobuf.FinderContact
            r13.<init>()
            java.lang.String r14 = ""
            r13.username = r14
            r13.nickname = r14
            r13.headUrl = r14
            r12.f134919d = r13
            r11.f185132o = r12
            r11.f185126f = r0
            r0 = 10006(0x2716, float:1.4021E-41)
            r11.f185127g = r0
            cj1.j5 r0 = new cj1.j5
            r0.<init>(r11)
            androidx.lifecycle.i0 r9 = r9.business(r6)
            cl1.z0 r9 = (cl1.C0702z0) r9
            java.util.List<cj1.o5> r9 = r9.f1672f
            r9.add(r0)
        L_0x0520:
            r0 = 32
            boolean r0 = o40.C61926c.m72696u(r10, r0)
            r2.f154281Y = r0
            r0 = 16
            boolean r0 = o40.C61926c.m72696u(r10, r0)
            r9 = r18
            androidx.lifecycle.i0 r11 = r2.business(r9)
            cl1.h1 r11 = (cl1.C54979h1) r11
            r11.mo75935F3(r0)
            r11 = 32768(0x8000, float:4.5918E-41)
            boolean r11 = o40.C61926c.m72696u(r10, r11)
            java.lang.Class<cl1.o1> r12 = cl1.C54994o1.class
            androidx.lifecycle.i0 r12 = r2.business(r12)
            cl1.o1 r12 = (cl1.C54994o1) r12
            androidx.lifecycle.z<java.lang.Boolean> r12 = r12.f154402i
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r12.postValue(r11)
            r2.mo75988W3(r7)
            r11 = 256(0x100, float:3.59E-43)
            boolean r11 = o40.C61926c.m72696u(r10, r11)
            boolean r12 = r31.mo75960G3()
            if (r11 == r12) goto L_0x05cc
            int r12 = r2.f154244Q2
            r13 = -1
            if (r12 == r13) goto L_0x05cc
            r12 = 2
            if (r5 == r12) goto L_0x05cc
            fj1.b r12 = r2.f107146d
            if (r12 == 0) goto L_0x05cc
            te3.r41 r13 = new te3.r41
            r13.<init>()
            r14 = 10001(0x2711, float:1.4014E-41)
            r13.f185127g = r14
            androidx.lifecycle.i0 r14 = r12.mo71262a(r4)
            cl1.o r14 = (cl1.C54991o) r14
            boolean r14 = r14.mo75960G3()
            if (r14 != 0) goto L_0x0591
            android.content.Context r14 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r14 = r14.getResources()
            r15 = 2131827112(0x7f1119a8, float:1.9287127E38)
            java.lang.String r14 = r14.getString(r15)
            goto L_0x05a0
        L_0x0591:
            android.content.Context r14 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r14 = r14.getResources()
            r15 = 2131827114(0x7f1119aa, float:1.9287131E38)
            java.lang.String r14 = r14.getString(r15)
        L_0x05a0:
            r13.f185126f = r14
            cj1.j5 r14 = new cj1.j5
            r14.<init>(r13)
            androidx.lifecycle.i0 r6 = r12.mo71262a(r6)
            cl1.z0 r6 = (cl1.C0702z0) r6
            java.util.List<cj1.o5> r6 = r6.f1672f
            r6.add(r14)
            java.lang.String r6 = r2.f154311f
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "appendAudioModeTip:"
            r12.append(r13)
            te3.r41 r13 = r14.f1344a
            java.lang.String r13 = r13.f185126f
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r12)
        L_0x05cc:
            r2.mo76020r4(r11)
            r6 = r32
            te3.wr1 r6 = r6.f139285f
            if (r6 == 0) goto L_0x0670
            int r11 = r6.f144237d
            int r12 = r2.f154371u1
            te3.ps1 r6 = r6.f144238e
            if (r6 == 0) goto L_0x05e4
            int r6 = r6.f139936e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x05e6
        L_0x05e4:
            r6 = r16
        L_0x05e6:
            te3.az0 r13 = r2.f154379w1
            if (r13 == 0) goto L_0x05f5
            te3.yr1 r13 = r13.f182184n
            if (r13 == 0) goto L_0x05f5
            int r13 = r13.f186594r
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            goto L_0x05f7
        L_0x05f5:
            r13 = r16
        L_0x05f7:
            if (r6 == 0) goto L_0x0614
            int r14 = r6.intValue()
            te3.ps1 r15 = r31.mo75967K3()
            if (r15 != 0) goto L_0x0604
            goto L_0x0606
        L_0x0604:
            r15.f139936e = r14
        L_0x0606:
            te3.az0 r15 = r2.f154379w1
            if (r15 == 0) goto L_0x060d
            te3.yr1 r15 = r15.f182184n
            goto L_0x060f
        L_0x060d:
            r15 = r16
        L_0x060f:
            if (r15 != 0) goto L_0x0612
            goto L_0x0614
        L_0x0612:
            r15.f186594r = r14
        L_0x0614:
            java.lang.String r14 = r2.f154311f
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r1 = "change gameteam mode,from:"
            r15.append(r1)
            r15.append(r12)
            java.lang.String r1 = ", to:"
            r15.append(r1)
            r15.append(r11)
            java.lang.String r1 = " oldPayment:"
            r15.append(r1)
            r15.append(r13)
            java.lang.String r1 = " newPayment:"
            r15.append(r1)
            r15.append(r6)
            java.lang.String r1 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r1)
            if (r12 == r11) goto L_0x0669
            te3.uy0 r1 = r2.f154363s1
            if (r1 != 0) goto L_0x0649
            goto L_0x064b
        L_0x0649:
            r1.f143181e = r11
        L_0x064b:
            r2.f154371u1 = r11
            r1 = 1
            r2.f154389y1 = r1
            if (r12 == r1) goto L_0x0656
            if (r12 == 0) goto L_0x0656
            r6 = 1
            goto L_0x0657
        L_0x0656:
            r6 = 0
        L_0x0657:
            if (r11 == r1) goto L_0x065d
            if (r11 == 0) goto L_0x065d
            r1 = 1
            goto L_0x065e
        L_0x065d:
            r1 = 0
        L_0x065e:
            if (r6 == r1) goto L_0x0670
            r1 = 2
            if (r5 == r1) goto L_0x0670
            fj1.b r1 = r2.f107146d
            r2.mo75994c3(r1)
            goto L_0x0670
        L_0x0669:
            r1 = 7
            if (r11 != r1) goto L_0x0670
            r1 = 1
            r2.f154389y1 = r1
            goto L_0x0671
        L_0x0670:
            r1 = 1
        L_0x0671:
            androidx.lifecycle.i0 r5 = r2.business(r9)
            cl1.h1 r5 = (cl1.C54979h1) r5
            r6 = 262144(0x40000, float:3.67342E-40)
            boolean r6 = o40.C61926c.m72696u(r10, r6)
            r6 = r6 ^ r1
            if (r6 != 0) goto L_0x0687
            p40.a<cm1.i2> r1 = r5.f154141p
            java.util.List<E> r1 = r1.f127225a
            r1.clear()
        L_0x0687:
            r5.f154142q = r6
            androidx.lifecycle.i0 r1 = r2.business(r9)
            cl1.h1 r1 = (cl1.C54979h1) r1
            r5 = 524288(0x80000, float:7.34684E-40)
            boolean r5 = o40.C61926c.m72696u(r10, r5)
            r6 = 1
            r5 = r5 ^ r6
            r1.f154143r = r5
            r2.f154354q = r10
            java.lang.String r1 = r2.f154311f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "updateLiveMsg anchorStatusFlag:"
            r5.append(r6)
            r5.append(r7)
            java.lang.String r6 = ",enableLiveRoomComment:"
            r5.append(r6)
            boolean r6 = r2.f154370u
            r5.append(r6)
            java.lang.String r6 = ",liveBreakRule:"
            r5.append(r6)
            boolean r6 = r2.f154281Y
            r5.append(r6)
            java.lang.String r6 = ",shoppingAvailableStatus:"
            r5.append(r6)
            r5.append(r0)
            java.lang.String r0 = ", shoppingAvailable:"
            r5.append(r0)
            androidx.lifecycle.i0 r0 = r2.business(r9)
            cl1.h1 r0 = (cl1.C54979h1) r0
            boolean r0 = r0.f154137i
            r5.append(r0)
            java.lang.String r0 = ", enableLinkMic:"
            r5.append(r0)
            androidx.lifecycle.i0 r0 = r2.business(r3)
            cl1.d0 r0 = (cl1.C54963d0) r0
            boolean r0 = r0.mo75902I3()
            r5.append(r0)
            java.lang.String r0 = ", enableGift:"
            r5.append(r0)
            boolean r0 = r31.mo75963I3()
            r5.append(r0)
            java.lang.String r0 = ",audioModeSwitch:"
            r5.append(r0)
            boolean r0 = r2.f154264U2
            r5.append(r0)
            java.lang.String r0 = " enableAudioMode:"
            r5.append(r0)
            int r0 = r2.f154244Q2
            r5.append(r0)
            java.lang.String r0 = "retentionAvailable："
            r5.append(r0)
            androidx.lifecycle.i0 r0 = r2.business(r9)
            cl1.h1 r0 = (cl1.C54979h1) r0
            boolean r0 = r0.f154142q
            r5.append(r0)
            java.lang.String r0 = " + productListAvailable："
            r5.append(r0)
            androidx.lifecycle.i0 r0 = r2.business(r9)
            cl1.h1 r0 = (cl1.C54979h1) r0
            boolean r0 = r0.f154143r
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            nk1.o r0 = nk1.C61791o.f175673a
            java.lang.String r1 = "updateAnchorStatus"
            androidx.lifecycle.i0 r3 = r2.business(r4)
            cl1.o r3 = (cl1.C54991o) r3
            int r3 = r3.f154354q
            r0.mo86722d(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cl1.C54991o.mo75968K4(te3.oo2, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: com.tencent.mm.protocal.protobuf.FinderMedia} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.tencent.mm.protocal.protobuf.FinderMedia} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: com.tencent.mm.protocal.protobuf.FinderMedia} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: com.tencent.mm.protocal.protobuf.FinderMedia} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: com.tencent.mm.protocal.protobuf.FinderMedia} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: com.tencent.mm.protocal.protobuf.FinderMedia} */
    /* JADX WARNING: type inference failed for: r5v5, types: [java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r3 = r0.liveInfo;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: L3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo75969L3() {
        /*
            r6 = this;
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r6.f154341n
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0010
            te3.c21 r3 = r0.liveInfo
            if (r3 == 0) goto L_0x0010
            int r3 = r3.f182410x
            if (r3 != r1) goto L_0x0010
            r3 = 1
            goto L_0x0011
        L_0x0010:
            r3 = 0
        L_0x0011:
            java.lang.String r4 = ""
            r5 = 0
            if (r3 == 0) goto L_0x0027
            if (r0 == 0) goto L_0x0022
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            if (r0 == 0) goto L_0x0022
            te3.px0 r0 = r0.liveDesc
            if (r0 == 0) goto L_0x0022
            java.lang.String r5 = r0.f184911d
        L_0x0022:
            if (r5 != 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r4 = r5
        L_0x0026:
            return r4
        L_0x0027:
            java.lang.String r0 = r6.f154342n1
            if (r0 == 0) goto L_0x0033
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0032
            goto L_0x0033
        L_0x0032:
            r1 = 0
        L_0x0033:
            if (r1 != 0) goto L_0x0058
            er1.j4 r0 = er1.C58739j4.f168176a
            boolean r0 = r0.mo83692U()
            if (r0 == 0) goto L_0x0055
            java.lang.String r0 = r6.f154311f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "liveCoverUrl field:"
            r1.append(r2)
            java.lang.String r2 = r6.f154342n1
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
        L_0x0055:
            java.lang.String r0 = r6.f154342n1
            return r0
        L_0x0058:
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r6.f154341n
            if (r0 == 0) goto L_0x006b
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            if (r0 == 0) goto L_0x006b
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r0 = r0.media
            if (r0 == 0) goto L_0x006b
            java.lang.Object r0 = sx3.C110818d0.m150916N(r0)
            r5 = r0
            com.tencent.mm.protocal.protobuf.FinderMedia r5 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r5
        L_0x006b:
            if (r5 == 0) goto L_0x0085
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.thumbUrl
            r0.append(r1)
            java.lang.String r1 = r5.thumb_url_token
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L_0x0085:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: cl1.C54991o.mo75969L3():java.lang.String");
    }

    /* renamed from: L4 */
    public final void mo75970L4(C64760uw0 uw02) {
        LinkedList<C64740tw0> linkedList = null;
        int i = 0;
        mo75972M4(uw02 != null ? uw02.f185795d : null, uw02 != null ? uw02.f185796e : null, uw02 != null ? uw02.f185797f : 0);
        C54985m mVar = (C54985m) this.f107146d.mo71262a(C54985m.class);
        LinkedList<C51601uv> linkedList2 = uw02 != null ? uw02.f185795d : null;
        String str = uw02 != null ? uw02.f185796e : null;
        if (uw02 != null) {
            i = uw02.f185797f;
        }
        C54985m.C0671b bVar = new C54985m.C0671b(linkedList2, str, i);
        if (uw02 != null) {
            linkedList = uw02.f185798g;
        }
        mVar.mo75950d3(bVar, linkedList);
    }

    /* renamed from: M3 */
    public final int mo75971M3() {
        boolean z = false;
        if (C54655b.f153178f1 != null) {
            return 1;
        }
        if (C60251a.f171781k1 != null) {
            z = true;
        }
        if (z) {
            return 1;
        }
        return ((C54991o) business(C54991o.class)).f154190D ? 3 : 2;
    }

    /* renamed from: M4 */
    public final void mo75972M4(LinkedList<C51601uv> linkedList, String str, int i) {
        String str2 = this.f154311f;
        Log.m105924i(str2, "updateCheerInfos. cheerInfos:" + linkedList + " iconBtnUrl:" + str + " enable:" + i);
        StringBuffer stringBuffer = new StringBuffer(String.valueOf(this.f154278X1.f1588d));
        List<C51601uv> list = this.f154278X1.f1586b;
        synchronized (list) {
            for (C51601uv uvVar : list) {
                stringBuffer.append(uvVar.f143152d);
                stringBuffer.append(uvVar.f143153e);
            }
        }
        StringBuffer stringBuffer2 = new StringBuffer(String.valueOf(i));
        if (linkedList != null) {
            synchronized (linkedList) {
                for (C51601uv uvVar2 : linkedList) {
                    stringBuffer2.append(uvVar2.f143152d);
                    stringBuffer2.append(uvVar2.f143153e);
                }
            }
        }
        boolean z = false;
        if (!Util.isEqual((Object) stringBuffer, (Object) stringBuffer2)) {
            if (i == 0) {
                Log.m105924i(this.f154311f, "updateCheerInfos. disable custom cheer info");
                this.f154278X1.f1586b.clear();
            } else {
                String str3 = this.f154311f;
                Log.m105924i(str3, "updateCheerInfos. new cheerInfo:" + linkedList);
                this.f154278X1.f1586b.clear();
                if (linkedList == null || linkedList.isEmpty()) {
                    z = true;
                }
                if (!z) {
                    this.f154278X1.f1586b.addAll(linkedList);
                }
            }
            this.f154278X1.f1585a = true;
        } else {
            this.f154278X1.f1585a = false;
            Log.m105924i(this.f154311f, "updateCheerInfos. skip by no differences");
        }
        C0674a aVar = this.f154278X1;
        aVar.f1587c = str;
        aVar.f1588d = i;
    }

    /* renamed from: N3 */
    public final C64756up2 mo75973N3() {
        C64756up2 up22 = this.f154230N;
        if (up22 != null) {
            return up22;
        }
        C58969q b = C58961d.f168673a.mo84155b(this.f154345o);
        if (b != null) {
            return b.field_liveRoomImg;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if ((i50.C60251a.f171781k1 != null) != false) goto L_0x0014;
     */
    /* renamed from: N4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo75974N4() {
        /*
            r7 = this;
            c50.b r0 = c50.C54655b.f153178f1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0008
            r0 = 1
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            if (r0 != 0) goto L_0x0014
            i50.a r0 = i50.C60251a.f171781k1
            if (r0 == 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 == 0) goto L_0x0015
        L_0x0014:
            r1 = 1
        L_0x0015:
            if (r1 != 0) goto L_0x00b6
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r7.f154341n
            if (r0 == 0) goto L_0x00b6
            java.lang.String r1 = r7.f154311f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "updateFinderObjectThemeDesc id: "
            r3.append(r4)
            long r4 = r0.f164794id
            r3.append(r4)
            java.lang.String r4 = " value: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            vp1.e r1 = vp1.C65834e.f189316a
            long r3 = r0.f164794id
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo89871e(r3)
            if (r1 == 0) goto L_0x008e
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r1.getFinderObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r3 = r3.objectDesc
            r4 = 0
            if (r3 != 0) goto L_0x0050
            goto L_0x005a
        L_0x0050:
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r5 = r0.objectDesc
            if (r5 == 0) goto L_0x0057
            java.lang.String r5 = r5.description
            goto L_0x0058
        L_0x0057:
            r5 = r4
        L_0x0058:
            r3.description = r5
        L_0x005a:
            if (r3 == 0) goto L_0x005f
            te3.px0 r3 = r3.liveDesc
            goto L_0x0060
        L_0x005f:
            r3 = r4
        L_0x0060:
            if (r3 != 0) goto L_0x0063
            goto L_0x0075
        L_0x0063:
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r7.f154341n
            if (r5 == 0) goto L_0x0072
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r5 = r5.objectDesc
            if (r5 == 0) goto L_0x0072
            te3.px0 r5 = r5.liveDesc
            if (r5 == 0) goto L_0x0072
            java.lang.String r5 = r5.f184911d
            goto L_0x0073
        L_0x0072:
            r5 = r4
        L_0x0073:
            r3.f184911d = r5
        L_0x0075:
            java.lang.Class<ny.h> r3 = p629ny.C76979h.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            ny.h r3 = (p629ny.C76979h) r3
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r6 = r0.objectDesc
            if (r6 == 0) goto L_0x0087
            java.lang.String r4 = r6.description
        L_0x0087:
            android.text.SpannableString r3 = r3.mo107057T1(r5, r4)
            r1.setDescriptionSpan(r3)
        L_0x008e:
            com.tencent.mm.autogen.events.FeedUpdateEvent r1 = new com.tencent.mm.autogen.events.FeedUpdateEvent
            r1.<init>()
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r3 = r1.f9173d
            long r4 = r0.f164794id
            r3.f9174a = r4
            r0 = 29
            r3.f9175b = r0
            r1.publish()
            d14.u0<java.lang.Integer> r0 = r7.f154307e1
            d14.j1 r0 = (d14.C58052j1) r0
            java.lang.Object r1 = r0.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r1 = r1 + r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.setValue(r1)
        L_0x00b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cl1.C54991o.mo75974N4():void");
    }

    /* renamed from: O3 */
    public final Bitmap mo75975O3() {
        return this.f154254S2;
    }

    /* renamed from: O4 */
    public final void mo75976O4(long j) {
        Class cls = C54963d0.class;
        String str = this.f154311f;
        Log.m105924i(str, "updateFuncEnableAnchor switchFlag:" + j);
        int i = (int) j;
        ((C54963d0) business(cls)).f154080w = C61926c.m72696u(i, 4);
        this.f154243Q1 = C61791o.f175673a.mo86720b(j);
        C50681oh0 oh02 = ((C54991o) business(C54991o.class)).f154282Y0;
        boolean z = true;
        boolean z2 = oh02 != null ? oh02.f139178d : true;
        boolean u = C61926c.m72696u(i, 16384);
        String str2 = this.f154311f;
        Log.m105924i(str2, "isWishEnable isBlueAccount " + z2 + " isWishFlagEnable: " + u);
        if (!u || !z2) {
            z = false;
        }
        this.f154234O1 = z;
        this.f154268V1 = C61926c.m72696u(i, 8192);
        this.f154264U2 = C61926c.m72696u(i, 8);
        ((C54963d0) business(cls)).f154050D = C61926c.m72696u(i, 64);
        this.f154392z = C61926c.m72696u(i, 256);
        this.f154378w = C61926c.m72696u(i, 4096);
        C61926c.m72696u(i, 128);
    }

    /* renamed from: P3 */
    public final String mo75977P3() {
        Log.m105924i("preferredShowNickname", "preferredShowNickname = " + this.f154347o2);
        return this.f154347o2;
    }

    /* renamed from: P4 */
    public final void mo75978P4(C64510l21 l212, boolean z, C32227p<? super Boolean, ? super Integer, C13598b0> pVar) {
        C87412m.m108594g(l212, "info");
        C87412m.m108594g(pVar, "callback");
        C61926c.m72668M(new C0676d(this, l212, z, pVar));
    }

    /* renamed from: Q3 */
    public final int mo75979Q3() {
        int i = this.f154292a2;
        return i > 0 ? i : ((C55001u) business(C55001u.class)).f154420q.f182356B;
    }

    /* renamed from: Q4 */
    public final void mo75980Q4(String str) {
        Class cls = C54991o.class;
        C87412m.m108594g(str, "desc");
        ((C54991o) business(cls)).f154252S0 = str;
        FinderObject finderObject = ((C54991o) business(cls)).f154341n;
        FinderObjectDesc finderObjectDesc = finderObject != null ? finderObject.objectDesc : null;
        if (finderObjectDesc != null) {
            finderObjectDesc.description = str;
        }
        mo75974N4();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0017, code lost:
        r2 = r2.f166250a;
     */
    /* renamed from: R3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo75981R3() {
        /*
            r4 = this;
            java.lang.Class<cl1.u> r0 = cl1.C55001u.class
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "appId:"
            r1.append(r2)
            androidx.lifecycle.i0 r2 = r4.business(r0)
            cl1.u r2 = (cl1.C55001u) r2
            d50.h r2 = r2.f154421r
            r3 = 0
            if (r2 == 0) goto L_0x0022
            com.tencent.trtc.TRTCCloudDef$TRTCParams r2 = r2.f166250a
            if (r2 == 0) goto L_0x0022
            int r2 = r2.sdkAppId
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0023
        L_0x0022:
            r2 = r3
        L_0x0023:
            r1.append(r2)
            java.lang.String r2 = "\nroomId:"
            r1.append(r2)
            androidx.lifecycle.i0 r0 = r4.business(r0)
            cl1.u r0 = (cl1.C55001u) r0
            d50.h r0 = r0.f154421r
            if (r0 == 0) goto L_0x003f
            com.tencent.trtc.TRTCCloudDef$TRTCParams r0 = r0.f166250a
            if (r0 == 0) goto L_0x003f
            int r0 = r0.roomId
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L_0x003f:
            r1.append(r3)
            r0 = 10
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cl1.C54991o.mo75981R3():java.lang.String");
    }

    /* renamed from: R4 */
    public final void mo75982R4(long j) {
        C66785b bVar = C66785b.f191882e;
        C54447c cVar = new C54447c(bVar.mo90662O5());
        C50266li0 li02 = cVar.field_liveInfo;
        if (li02 != null) {
            li02.f137430d = j;
        }
        bVar.mo90672m1(cVar, C39759i.LIVE_UPDATE_ANCHOR_STATUS);
    }

    /* renamed from: S4 */
    public final void mo75983S4(long j) {
        C66785b bVar = C66785b.f191882e;
        C54447c cVar = new C54447c(bVar.mo90662O5());
        C50266li0 li02 = cVar.field_liveInfo;
        if (li02 != null) {
            li02.f137431e = (int) j;
        }
        bVar.mo90672m1(cVar, C39759i.LIVE_UPDATE_ANCHOR_STATUS);
        this.f154256T = C61926c.m72696u((int) j, 16);
    }

    /* renamed from: T3 */
    public final int mo75984T3() {
        return this.f154291a1;
    }

    /* renamed from: T4 */
    public final boolean mo75985T4() {
        String str = this.f154311f;
        Log.m105924i(str, "validVideoSize videoWidth:" + this.f154335l1 + ",videoHeight:" + this.f154338m1);
        return this.f154335l1 > 0 && this.f154338m1 > 0;
    }

    /* renamed from: U3 */
    public final C64373fs0 mo75986U3() {
        T t;
        boolean z;
        Integer num = this.f154352p2;
        if (num != null) {
            int intValue = num.intValue();
            String str = this.f154311f;
            Log.m105924i(str, "[getVisitorRole] replaceRoleType = " + intValue);
            Iterator<T> it = this.f154339m2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((C64373fs0) t).f183215f == intValue) {
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
            C64373fs0 fs02 = (C64373fs0) t;
            if (fs02 == null) {
                fs02 = this.f154333k2;
            }
            if (fs02 != null) {
                return fs02;
            }
        }
        return this.f154333k2;
    }

    /* renamed from: V3 */
    public final String mo75987V3() {
        Class cls = C54979h1.class;
        Class cls2 = C55001u.class;
        StringBuilder sb = new StringBuilder();
        sb.append("liveId:");
        sb.append(((C55001u) business(cls2)).f154420q.f182392d);
        sb.append(",objectId:");
        sb.append(((C55001u) business(cls2)).mo76038i3());
        sb.append(", ");
        sb.append(C61926c.m72691p(((C55001u) business(cls2)).f154416j));
        sb.append(",uiState:");
        sb.append(this.f154291a1);
        sb.append(",liveState:");
        sb.append(this.f154295b1);
        sb.append(",bindShop:");
        sb.append("bindShop = " + ((C54979h1) business(cls)).f154134f);
        sb.append(",shoppingAvailable:");
        sb.append(((C54979h1) business(cls)).f154137i);
        sb.append(",qosReport:");
        sb.append(this.f154296b2);
        sb.append(",qosContrl:");
        sb.append(this.f154300c2);
        sb.append(",qosInterval:");
        sb.append(this.f154304d2);
        sb.append(",curRoleType:");
        sb.append(mo75986U3().f183215f);
        return sb.toString();
    }

    /* renamed from: W3 */
    public final void mo75988W3(long j) {
        if (!this.f154243Q1 || !this.f154253S1) {
            this.f154238P1 = 0;
            return;
        }
        boolean u = C61926c.m72696u((int) j, 128);
        if (!(u == mo75963I3() || this.f154238P1 == -1)) {
            C45795b bVar = this.f107146d;
            if (bVar != null) {
                C64674r41 r412 = new C64674r41();
                r412.f185127g = 10001;
                r412.f185126f = !((C54991o) bVar.mo71262a(C54991o.class)).mo75963I3() ? MMApplicationContext.getContext().getResources().getString(C0966R.string.dok) : MMApplicationContext.getContext().getResources().getString(C0966R.string.doc);
                C0556j5 j5Var = new C0556j5(r412);
                ((C0702z0) bVar.mo71262a(C0702z0.class)).f1672f.add(j5Var);
                String str = this.f154311f;
                Log.m105924i(str, "appendGiftTip:" + j5Var.f1344a.f185126f);
            }
            this.f154316g.mo86713i();
        }
        this.f154238P1 = u ? 1 : 0;
    }

    /* renamed from: X3 */
    public final void mo75989X3() {
        boolean z;
        T t;
        String str;
        boolean z2;
        LinkedList<C64373fs0> a = C61791o.f175673a.mo86719a();
        int i = C66785b.f191882e.mo90673n0().f131584h;
        Iterator<T> it = a.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C64373fs0) t).f183215f == i) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                break;
            }
        }
        C64373fs0 fs02 = (C64373fs0) t;
        if (fs02 == null) {
            mo75986U3().f183215f = 4;
            mo75986U3().f183213d = C75592q0.m90783m();
            C64373fs0 U3 = mo75986U3();
            C68097n Lo = ((C68098o) ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg()).mo93607Lo(C75592q0.m90789s());
            if (Lo == null || (str = Lo.mo93597f()) == null) {
                str = "";
            }
            U3.f183214e = str;
        } else {
            this.f154333k2 = fs02;
            this.f154339m2 = a;
            this.f154336l2 = i;
            this.f154343n2 = C66785b.f191882e.mo90673n0().f131585i;
        }
        String str2 = this.f154311f;
        StringBuilder sb = new StringBuilder();
        sb.append("initVisitorRoleInfo local visitorRoleList:");
        StringBuilder sb4 = new StringBuilder("[printVisitorRoleInfo]" + "initVisitorRoleInfo" + ":curVisitorRoleType:" + i + ";visitorRoleModifyTime:" + 0 + ';');
        synchronized (a) {
            int i2 = 0;
            for (T next : a) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append('[');
                    sb5.append(i2);
                    sb5.append(XVFSFile.PATH_SEPARATOR_CHAR);
                    sb5.append(C61937h.m72709h((C64373fs0) next));
                    sb5.append(']');
                    sb4.append(sb5.toString());
                    i2 = i3;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
        String sb6 = sb4.toString();
        C87412m.m108593f(sb6, "msg.toString()");
        sb.append(sb6);
        sb.append(",local VisitorRoleType:");
        sb.append(i);
        sb.append(", local visitor role is empty:");
        if (fs02 != null) {
            z = false;
        }
        sb.append(z);
        sb.append(",visitor Role:");
        sb.append(C61937h.m72709h(mo75986U3()));
        Log.m105924i(str2, sb.toString());
    }

    /* renamed from: Y3 */
    public final boolean mo75990Y3() {
        return this.f154229M3 != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r0 = r0.f166251b;
     */
    /* renamed from: Z3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo75991Z3() {
        /*
            r2 = this;
            java.lang.Class<cl1.u> r0 = cl1.C55001u.class
            androidx.lifecycle.i0 r0 = r2.business(r0)
            cl1.u r0 = (cl1.C55001u) r0
            d50.h r0 = r0.f154421r
            if (r0 == 0) goto L_0x0013
            d50.g r0 = r0.f166251b
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = r0.f166234d
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            java.lang.String r1 = r2.mo76015n4()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r0, (java.lang.String) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cl1.C54991o.mo75991Z3():boolean");
    }

    /* renamed from: a4 */
    public final boolean mo75992a4() {
        boolean T4 = mo75985T4();
        String str = this.f154311f;
        Log.m105924i(str, "isLandscapeVideo validVideoSize:" + T4);
        return T4 && this.f154335l1 >= this.f154338m1;
    }

    /* renamed from: b4 */
    public final boolean mo75993b4() {
        String str = this.f154311f;
        Log.m105924i(str, "isLinkMicVideo videoWidth:" + this.f154335l1 + ",videoHeight:" + this.f154338m1);
        try {
            if (this.f154335l1 <= 0 || this.f154338m1 <= 0) {
                return false;
            }
            float floatValue = new BigDecimal(((double) this.f154335l1) / ((double) this.f154338m1)).setScale(1, 4).floatValue();
            if (!(floatValue == 1.1f)) {
                if (!(floatValue == 1.0f)) {
                    return (floatValue > 1.2f ? 1 : (floatValue == 1.2f ? 0 : -1)) == 0;
                }
            }
        } catch (Exception e) {
            String str2 = this.f154311f;
            Log.m105928w(str2, "ex:" + e.getMessage());
            return false;
        }
    }

    /* renamed from: c3 */
    public final void mo75994c3(C45795b bVar) {
        String str;
        Class cls = C55001u.class;
        String str2 = this.f154311f;
        Log.m105924i(str2, "appendGameTeamModeTip:" + this.f154371u1);
        if (this.f154371u1 != 0 && bVar != null) {
            C64674r41 r412 = new C64674r41();
            r412.f185127g = 10001;
            boolean z = false;
            if (this.f154371u1 == 1) {
                if (((C55001u) business(cls)).f154420q.f182405s == 5) {
                    z = true;
                }
                str = z ? MMApplicationContext.getContext().getResources().getString(C0966R.string.dbp) : MMApplicationContext.getContext().getResources().getString(C0966R.string.dbo);
            } else {
                if (((C55001u) business(cls)).f154420q.f182405s == 5) {
                    z = true;
                }
                str = z ? MMApplicationContext.getContext().getResources().getString(C0966R.string.dbr) : MMApplicationContext.getContext().getResources().getString(C0966R.string.dbq);
            }
            r412.f185126f = str;
            ((C0702z0) bVar.mo71262a(C0702z0.class)).f1672f.add(new C0556j5(r412));
        }
    }

    /* renamed from: c4 */
    public final boolean mo75995c4() {
        return this.f154295b1 == 4;
    }

    /* renamed from: d3 */
    public final int mo75996d3() {
        C58113g gVar;
        C58114h hVar = ((C55001u) business(C55001u.class)).f154421r;
        if (hVar == null || (gVar = hVar.f166251b) == null) {
            return 1;
        }
        return gVar.f166233c;
    }

    /* renamed from: d4 */
    public final boolean mo75997d4() {
        return this.f154295b1 == 3;
    }

    /* renamed from: e3 */
    public final boolean mo75998e3() {
        return this.f154387y || this.f154382x;
    }

    /* renamed from: e4 */
    public final boolean mo75999e4() {
        return this.f154295b1 == 2;
    }

    /* renamed from: f3 */
    public final void mo76000f3(String str, int i) {
        C87412m.m108594g(str, "tag");
        boolean u = C61926c.m72696u(i, 8192);
        ((C58052j1) this.f154189C3).setValue(Boolean.valueOf(u));
        String str2 = this.f154311f;
        Log.m105924i(str2, str + ", checkFollowBtn canShowFollowBtn:" + u);
    }

    /* renamed from: f4 */
    public final boolean mo76001f4() {
        boolean z;
        LinkedList<C48770aw0> linkedList = this.f154320h;
        T t = null;
        if (linkedList != null) {
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (((C48770aw0) next).f130789d == 10) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    t = next;
                    break;
                }
            }
            t = (C48770aw0) t;
        }
        return !(t != null) && ((Boolean) ((C58052j1) this.f154194E).getValue()).booleanValue();
    }

    /* renamed from: g3 */
    public final void mo76002g3(String str, int i) {
        C87412m.m108594g(str, "tag");
        this.f154387y = C61926c.m72696u(i, TPMediaCodecProfileLevel.HEVCHighTierLevel62);
        String str2 = this.f154311f;
        Log.m105924i(str2, str + ", checkMaskNickname flag:" + i + ", isVisitorNickNameShowMask:" + this.f154387y);
    }

    /* renamed from: g4 */
    public final boolean mo76003g4() {
        Class cls = C54963d0.class;
        if (((C54963d0) business(cls)).f154073p != null) {
            return true;
        }
        List<C54130j> list = ((C54963d0) business(cls)).f154074q;
        C87412m.m108593f(list, "business(LiveLinkMicSlic…).audienceLinkMicUserList");
        return list.isEmpty() ^ true;
    }

    /* renamed from: h4 */
    public final boolean mo76004h4() {
        return this.f154287Z0 == 1;
    }

    /* renamed from: i3 */
    public final void mo76005i3(String str, int i) {
        C87412m.m108594g(str, "tag");
        this.f154205G3 = C61926c.m72696u(i, 512);
        this.f154193D3 = C61926c.m72696u(i, 64);
        this.f154197E3 = C61926c.m72696u(i, 128);
        this.f154201F3 = C61926c.m72696u(i, 256);
        String str2 = this.f154311f;
        Log.m105924i(str2, str + ", checkHeatValueShow flag:" + i + ", canShowMemberList:" + this.f154193D3 + ", canShowMemberHeatValue:" + this.f154197E3 + ", canShowTotalRewardTitle:" + this.f154201F3 + " canSetFocusMicLayout: " + this.f154205G3);
    }

    /* renamed from: j3 */
    public final void mo76006j3(int i) {
        boolean u = C61926c.m72696u(i, 4096);
        String str = this.f154311f;
        Log.m105924i(str, "canShowPlayTogetherEntracne: " + u);
        this.f154290Z3.postValue(Boolean.valueOf(u));
    }

    /* renamed from: j4 */
    public final boolean mo76007j4() {
        C32444a aVar = C32444a.f86121a;
        return (C32444a.f86081M1.mo60266n().intValue() == 1) && this.f154181A3 == 1;
    }

    /* renamed from: k3 */
    public final C54754f mo76008k3() {
        return this.f154232N2;
    }

    /* renamed from: k4 */
    public final void mo76009k4(C54130j jVar) {
        T t;
        Class cls = C54963d0.class;
        if (jVar != null) {
            List<C54130j> list = ((C54963d0) business(cls)).f154074q;
            C87412m.m108593f(list, "business(LiveLinkMicSlic…).audienceLinkMicUserList");
            synchronized (list) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (Util.isEqual(jVar.f151997a, ((C54130j) t).f151997a)) {
                        break;
                    }
                }
            }
            if (t == null) {
                ((C54963d0) business(cls)).f154074q.add(jVar);
                String str = this.f154311f;
                Log.m105924i(str, "safeAddAudienceMicUser: " + jVar + ", size:" + ((C54963d0) business(cls)).f154074q.size() + ' ' + C58739j4.f168176a.mo83708f0());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* renamed from: l3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo76010l3(java.lang.String r5) {
        /*
            r4 = this;
            te3.up2 r0 = r4.mo75973N3()
            r1 = 1
            if (r0 == 0) goto L_0x001e
            int r2 = r0.f185784f
            if (r2 == 0) goto L_0x0017
            if (r2 == r1) goto L_0x000e
            goto L_0x001e
        L_0x000e:
            te3.c60 r0 = r0.f185783e
            if (r0 == 0) goto L_0x0015
            java.lang.String r0 = r0.f182416e
            goto L_0x001f
        L_0x0015:
            r0 = 0
            goto L_0x001f
        L_0x0017:
            java.lang.String r0 = r0.f185782d
            if (r0 != 0) goto L_0x001f
            java.lang.String r0 = ""
            goto L_0x001f
        L_0x001e:
            r0 = r5
        L_0x001f:
            if (r0 == 0) goto L_0x0029
            int r2 = r0.length()
            if (r2 != 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r1 = 0
        L_0x0029:
            if (r1 == 0) goto L_0x004a
            java.lang.String r1 = r4.f154311f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getAnchorStaticCoverUrl cur: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " defaultCoverUrl: "
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            goto L_0x004b
        L_0x004a:
            r5 = r0
        L_0x004b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: cl1.C54991o.mo76010l3(java.lang.String):java.lang.String");
    }

    /* renamed from: l4 */
    public final int mo76011l4() {
        TRTCCloudDef.TRTCParams tRTCParams;
        C58114h hVar = ((C55001u) business(C55001u.class)).f154421r;
        if (hVar == null || (tRTCParams = hVar.f166250a) == null) {
            return 0;
        }
        return tRTCParams.sdkAppId;
    }

    /* renamed from: m3 */
    public final String mo76012m3() {
        return this.f154345o;
    }

    /* renamed from: m4 */
    public final int mo76013m4() {
        TRTCCloudDef.TRTCParams tRTCParams;
        C58114h hVar = ((C55001u) business(C55001u.class)).f154421r;
        if (hVar == null || (tRTCParams = hVar.f166250a) == null) {
            return 0;
        }
        return tRTCParams.roomId;
    }

    /* renamed from: n3 */
    public final int mo76014n3() {
        String str = this.f154311f;
        Log.m105924i(str, "[getCacheVisitorRoleType] replaceRoleType = " + this.f154352p2);
        Integer num = this.f154352p2;
        return num != null ? num.intValue() : this.f154336l2;
    }

    /* renamed from: n4 */
    public final String mo76015n4() {
        TRTCCloudDef.TRTCParams tRTCParams;
        C58114h hVar = ((C55001u) business(C55001u.class)).f154421r;
        if (hVar == null || (tRTCParams = hVar.f166250a) == null) {
            return null;
        }
        return tRTCParams.userId;
    }

    /* renamed from: o3 */
    public final LinkedList<C48770aw0> mo76016o3() {
        boolean z;
        LinkedList<C48770aw0> linkedList = this.f154320h;
        T t = null;
        if (linkedList != null) {
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (((C48770aw0) next).f130789d == 5) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    t = next;
                    break;
                }
            }
            t = (C48770aw0) t;
        }
        if (t == null || C87412m.m108589b(t.f130793h, MMApplicationContext.getContext().getResources().getString(C0966R.string.mnx))) {
            return this.f154320h;
        }
        LinkedList<C48770aw0> linkedList2 = new LinkedList<>();
        linkedList2.add(t);
        return linkedList2;
    }

    /* renamed from: o4 */
    public final void mo76017o4(long j) {
        String str = this.f154311f;
        Log.m105924i(str, "setAnchorPauseStartTime:" + j);
        this.f154279X2 = j;
    }

    public void onCleared() {
        super.onCleared();
        Log.m105924i(this.f154311f, "reset22");
        C53973z1 z1Var = this.f154217J3;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f154356q2 = false;
        this.f154265U3 = false;
        this.f154241Q = null;
        this.f154217J3 = null;
        this.f154347o2 = null;
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_VISITOR_HARDCODE_ROLE_INT_SYNC, 0);
        this.f154352p2 = null;
        this.f154209H3 = false;
        this.f154230N = null;
        mo76018p4((LinkedList<C48770aw0>) null);
        this.f154227M1 = true;
        this.f154316g.clear();
        this.f154305d3 = false;
        this.f154328j = null;
        mo76026x4((FinderObject) null);
        this.f154251S = 0;
        this.f154256T = false;
        this.f154345o = "";
        this.f154349p = 0;
        this.f154354q = 0;
        this.f154358r = 0;
        this.f154362s = true;
        this.f154366t = true;
        this.f154370u = true;
        this.f154378w = false;
        this.f154382x = false;
        this.f154387y = false;
        this.f154392z = true;
        this.f154178A = true;
        this.f154182B = false;
        mo76027y4(false);
        this.f154271W = 0;
        this.f154281Y = false;
        this.f154286Z = false;
        this.f154350p0 = true;
        this.f154383x0 = false;
        C58087u0<Boolean> u0Var = this.f154194E;
        Boolean bool = Boolean.FALSE;
        ((C58052j1) u0Var).setValue(bool);
        this.f154198F = false;
        this.f154388y0 = -1;
        this.f154242Q0 = 0;
        this.f154247R0 = 0;
        this.f154252S0 = null;
        this.f154262U0.clear();
        this.f154267V0.clear();
        C61926c.m72668M(new C54997r(this));
        this.f154210I = 0;
        ((ArrayList) this.f154246R).clear();
        mo75962H4(-1);
        ((ArrayList) this.f154226M).clear();
        this.f154291a1 = 0;
        this.f154295b1 = 0;
        this.f154299c1 = 0;
        this.f154303d1 = 0;
        this.f154321h1 = new C27914d((String) null, (Bundle) null, (Object) null);
        this.f154325i1 = 0;
        this.f154329j1 = null;
        this.f154332k1 = 0;
        this.f154335l1 = 0;
        this.f154338m1 = 0;
        this.f154257T0 = 0;
        this.f154342n1 = "";
        mo75964I4(0);
        mo76025w4(-1);
        mo76021s4(false);
        this.f154363s1 = null;
        this.f154371u1 = 0;
        this.f154367t1 = "";
        this.f154375v1 = false;
        mo76024u4((C64247az0) null);
        mo75957E4(false);
        this.f154389y1 = false;
        this.f154179A1 = null;
        this.f154183B1 = null;
        this.f154187C1 = 0;
        this.f154191D1 = 0;
        this.f154195E1 = false;
        this.f154231N1 = null;
        this.f154199F1 = "";
        this.f154203G1 = "";
        this.f154207H1.clear();
        this.f154211I1.clear();
        this.f154215J1 = null;
        this.f154219K1.clear();
        this.f154238P1 = -1;
        Log.m105924i(this.f154311f, "set enableGift:false");
        this.f154243Q1 = false;
        this.f154234O1 = false;
        Log.m105924i(this.f154311f, "set enableVisitorGiftSwitch:false");
        this.f154248R1 = false;
        this.f154253S1 = true;
        mo76019q4(0);
        this.f154288Z1 = null;
        this.f154268V1 = false;
        this.f154273W1 = false;
        this.f154296b2 = false;
        this.f154300c2 = false;
        this.f154304d2 = 2;
        mo75961G4("");
        this.f154308e2 = true;
        this.f154313f2 = true;
        this.f154322h2 = null;
        this.f154326i2 = null;
        this.f154333k2 = new C64373fs0();
        this.f154339m2.clear();
        this.f154336l2 = 4;
        this.f154343n2 = Long.MIN_VALUE;
        this.f154364s2 = false;
        this.f154360r2 = null;
        this.f154372u2 = new C64383g31();
        this.f154380w2.clear();
        this.f154385x2.clear();
        this.f154376v2 = new C0083r((LinkedList) null, (String) null, 3, (C8480h) null);
        this.f154390y2.clear();
        this.f154180A2 = 0;
        this.f154184B2 = 0;
        this.f154330j2.clear();
        this.f154359r1.clear();
        this.f154368t2 = null;
        this.f154192D2 = 0;
        this.f154196E2 = 0;
        this.f154212I2 = false;
        this.f154216J2.clear();
        this.f154220K2.clear();
        this.f154224L2.clear();
        this.f154232N2 = new C54754f();
        this.f154315f4 = 0;
        this.f154275W3 = null;
        this.f154280X3 = false;
        this.f154285Y3 = false;
        this.f154302c4.postValue("");
        this.f154290Z3.postValue(bool);
        this.f154294a4 = null;
        this.f154306d4 = "";
        this.f154239P2 = false;
        mo76020r4(-1);
        this.f154249R2 = new C54125e((String) null, (String) null, (String) null, 7, (C8480h) null);
        this.f154254S2 = null;
        this.f154259T2 = null;
        this.f154264U2 = false;
        this.f154188C2.set(0, 0, C75044y4.m89990b(MMApplicationContext.getContext()).x, C75044y4.m89990b(MMApplicationContext.getContext()).y);
        this.f154200F2 = false;
        this.f154228M2 = null;
        this.f154274W2 = false;
        mo76017o4(0);
        this.f154284Y2 = 0;
        this.f154289Z2 = 0;
        this.f154293a3 = null;
        this.f154297b3 = null;
        this.f154301c3 = false;
        this.f154309e3 = null;
        this.f154314f3 = 0;
        this.f154319g3 = 0;
        this.f154323h3 = "";
        this.f154327i3 = "";
        this.f154334k3 = false;
        this.f154331j3 = false;
        this.f154337l3 = null;
        this.f154340m3 = null;
        this.f154348o3.clear();
        this.f154353p3.clear();
        this.f154361r3.clear();
        this.f154357q3 = null;
        this.f154269V2.clear();
        this.f154365s3 = null;
        this.f154386x3 = 0;
        C0674a aVar = this.f154278X1;
        aVar.f1585a = false;
        aVar.f1586b.clear();
        aVar.f1587c = null;
        aVar.f1588d = 0;
        aVar.f1589e = 0;
        this.f154391y3 = false;
        this.f154395z3 = new C13604l<>(0, 0);
        this.f154181A3 = 0;
        C58468e0 e0Var = (C58468e0) C86312j.m106911c(C58468e0.class);
        if (e0Var != null) {
            e0Var.mo70773V3(this.f154373u3);
        }
        this.f154283Y1 = null;
        this.f154261U = null;
    }

    /* renamed from: p4 */
    public final void mo76018p4(LinkedList<C48770aw0> linkedList) {
        int i;
        String str;
        T t;
        boolean z;
        int i2 = 0;
        if (linkedList != null) {
            Iterator<T> it = linkedList.iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((C48770aw0) t).f130789d == 4) {
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
            C48770aw0 aw02 = (C48770aw0) t;
            if (aw02 != null) {
                String str2 = aw02.f130793h;
                if (str2 == null) {
                    C50326ly0 ly02 = ((C0696x) business(C0696x.class)).f1644g;
                    if (ly02 != null) {
                        str = ly02.f137706d;
                    }
                } else {
                    str = str2;
                }
                aw02.f130793h = str;
            }
        }
        C32444a aVar = C32444a.f86121a;
        if (C32444a.f86169m.mo60266n().intValue() == 1 && linkedList != null) {
            for (C48770aw0 aw03 : linkedList) {
                if (aw03.f130789d == 2) {
                    aw03.f130791f = 70;
                }
            }
        }
        LinkedList<C48770aw0> linkedList2 = this.f154320h;
        if (linkedList != null) {
            try {
                i = linkedList.size();
            } catch (Exception e) {
                C58739j4.f168176a.mo83712h0(e, "printNewBadgeList");
            }
        } else {
            i = 0;
        }
        if (i != (linkedList2 != null ? linkedList2.size() : 0)) {
            f154177g4.mo643b(linkedList, "printNewBadgeList");
        } else if (linkedList != null && linkedList2 != null) {
            while (true) {
                if (i2 >= i) {
                    break;
                } else if (linkedList.get(i2).f130789d != linkedList2.get(i2).f130789d) {
                    break;
                } else if (linkedList.get(i2).f130791f != linkedList2.get(i2).f130791f) {
                    break;
                } else {
                    i2++;
                }
            }
            f154177g4.mo643b(linkedList, "printNewBadgeList");
        }
        this.f154320h = linkedList;
    }

    /* renamed from: q4 */
    public final void mo76019q4(long j) {
        String str = this.f154311f;
        Log.m105924i(str, "set curBalance:" + j);
        this.f154258T1 = j;
    }

    /* renamed from: r4 */
    public final void mo76020r4(int i) {
        if (i != this.f154244Q2) {
            String str = this.f154311f;
            Log.m105924i(str, "[commentHeightChange] enableAudioModeFlag change to:" + i);
            ((C0702z0) business(C0702z0.class)).f1686w.postValue(null);
        }
        this.f154244Q2 = i;
    }

    /* renamed from: s4 */
    public final void mo76021s4(boolean z) {
        String str = this.f154311f;
        Log.m105924i(str, "[LiveOrientation] forceChangeOrientation set " + z);
        this.f154355q1 = z;
    }

    /* renamed from: t4 */
    public final void mo76022t4(boolean z) {
        String str = this.f154311f;
        StringBuilder sb = new StringBuilder();
        sb.append("haveJoinLive:");
        sb.append(z);
        sb.append(",liveId:");
        C64273c21 c212 = ((C55001u) business(C55001u.class)).f154420q;
        sb.append(c212 != null ? Long.valueOf(c212.f182392d) : null);
        Log.m105924i(str, sb.toString());
        this.f154186C = z;
    }

    public String toString() {
        return mo75987V3();
    }

    /* renamed from: u4 */
    public final void mo76024u4(C64247az0 az02) {
        this.f154393z1 = az02 != null && az02.f182177d == 3;
        String str = this.f154311f;
        StringBuilder sb = new StringBuilder();
        sb.append("update lastGameTeamInfo ");
        sb.append(C61937h.m72709h(az02 == null ? "" : az02));
        Log.m105924i(str, sb.toString());
        this.f154379w1 = az02;
    }

    /* renamed from: w4 */
    public final void mo76025w4(int i) {
        String str = this.f154311f;
        Log.m105924i(str, "lastRotationFromSensor: " + i);
        this.f154351p1 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r3 = r11.liveInfo;
     */
    /* renamed from: x4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo76026x4(com.tencent.p014mm.protocal.protobuf.FinderObject r11) {
        /*
            r10 = this;
            r10.f154341n = r11
            java.lang.String r0 = r10.f154311f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "#liveFinderObject set liveInfo.live_flag="
            r1.append(r2)
            r2 = 0
            if (r11 == 0) goto L_0x001c
            te3.c21 r3 = r11.liveInfo
            if (r3 == 0) goto L_0x001c
            int r3 = r3.f182374S
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x001d
        L_0x001c:
            r3 = r2
        L_0x001d:
            r1.append(r3)
            java.lang.String r3 = " liveInfo.biz_info.username="
            r1.append(r3)
            if (r11 == 0) goto L_0x0032
            te3.c21 r3 = r11.liveInfo
            if (r3 == 0) goto L_0x0032
            te3.wg0 r3 = r3.f182380V
            if (r3 == 0) goto L_0x0032
            java.lang.String r3 = r3.f144033e
            goto L_0x0033
        L_0x0032:
            r3 = r2
        L_0x0033:
            r1.append(r3)
            r3 = 32
            r1.append(r3)
            sk1.a r4 = sk1.C63947a.f181274a
            if (r11 == 0) goto L_0x0046
            te3.c21 r3 = r11.liveInfo
            if (r3 == 0) goto L_0x0046
            te3.e61 r3 = r3.f182363I
            goto L_0x0047
        L_0x0046:
            r3 = r2
        L_0x0047:
            java.lang.String r3 = r4.mo88725k(r3)
            r1.append(r3)
            java.lang.String r3 = ",objectId="
            r1.append(r3)
            if (r11 == 0) goto L_0x0058
            long r5 = r11.f164794id
            goto L_0x005a
        L_0x0058:
            r5 = 0
        L_0x005a:
            java.lang.String r3 = o40.C61926c.m72691p(r5)
            r1.append(r3)
            java.lang.String r3 = ", nonceId="
            r1.append(r3)
            if (r11 == 0) goto L_0x006b
            java.lang.String r3 = r11.objectNonceId
            goto L_0x006c
        L_0x006b:
            r3 = r2
        L_0x006c:
            r1.append(r3)
            java.lang.String r3 = ", liveId="
            r1.append(r3)
            if (r11 == 0) goto L_0x0081
            te3.c21 r3 = r11.liveInfo
            if (r3 == 0) goto L_0x0081
            long r5 = r3.f182392d
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            goto L_0x0082
        L_0x0081:
            r3 = r2
        L_0x0082:
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            r0 = 0
            if (r11 == 0) goto L_0x0096
            te3.c21 r1 = r11.liveInfo
            if (r1 == 0) goto L_0x0096
            int r1 = r1.f182374S
            goto L_0x0097
        L_0x0096:
            r1 = 0
        L_0x0097:
            r3 = 64
            boolean r1 = o40.C61926c.m72696u(r1, r3)
            r3 = 1
            if (r1 == 0) goto L_0x00d5
            java.lang.Class<cl1.b> r1 = cl1.C0654b.class
            androidx.lifecycle.i0 r1 = r10.business(r1)
            cl1.b r1 = (cl1.C0654b) r1
            if (r11 == 0) goto L_0x00b5
            te3.c21 r5 = r11.liveInfo
            if (r5 == 0) goto L_0x00b5
            te3.wg0 r5 = r5.f182380V
            if (r5 == 0) goto L_0x00b5
            java.lang.String r5 = r5.f144033e
            goto L_0x00b6
        L_0x00b5:
            r5 = r2
        L_0x00b6:
            if (r11 == 0) goto L_0x00c3
            te3.c21 r6 = r11.liveInfo
            if (r6 == 0) goto L_0x00c3
            te3.wg0 r6 = r6.f182380V
            if (r6 == 0) goto L_0x00c3
            java.lang.String r6 = r6.f144032d
            goto L_0x00c4
        L_0x00c3:
            r6 = r2
        L_0x00c4:
            if (r11 == 0) goto L_0x00d1
            te3.c21 r7 = r11.liveInfo
            if (r7 == 0) goto L_0x00d1
            te3.wg0 r7 = r7.f182380V
            if (r7 == 0) goto L_0x00d1
            int r7 = r7.f144034f
            goto L_0x00d2
        L_0x00d1:
            r7 = 0
        L_0x00d2:
            r1.mo624d3(r3, r5, r6, r7)
        L_0x00d5:
            if (r11 == 0) goto L_0x00e8
            te3.c21 r5 = r11.liveInfo
            if (r5 == 0) goto L_0x00e8
            java.lang.String r11 = r10.f154311f
            java.lang.String r6 = java.lang.String.valueOf(r11)
            r7 = 0
            r8 = 2
            r9 = 0
            java.lang.String r2 = sk1.C63947a.m75194h(r4, r5, r6, r7, r8, r9)
        L_0x00e8:
            if (r2 == 0) goto L_0x00f0
            int r11 = r2.length()
            if (r11 != 0) goto L_0x00f1
        L_0x00f0:
            r0 = 1
        L_0x00f1:
            if (r0 == 0) goto L_0x00f6
            r10.mo75974N4()
        L_0x00f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cl1.C54991o.mo76026x4(com.tencent.mm.protocal.protobuf.FinderObject):void");
    }

    /* renamed from: y4 */
    public final void mo76027y4(boolean z) {
        String str = this.f154311f;
        StringBuilder sb = new StringBuilder();
        sb.append("liveFinish:");
        sb.append(this.f154266V);
        sb.append(",value:");
        sb.append(z);
        sb.append(",liveId:");
        C64273c21 c212 = ((C55001u) business(C55001u.class)).f154420q;
        sb.append(c212 != null ? Long.valueOf(c212.f182392d) : null);
        Log.m105924i(str, sb.toString());
        this.f154266V = z;
    }

    /* renamed from: z4 */
    public final void mo76028z4(boolean z) {
        if (this.f154312f1 != z) {
            Log.printInfoStack(this.f154311f, "liveMsgSwitch", new Object[0]);
        }
        this.f154312f1 = z;
    }
}
