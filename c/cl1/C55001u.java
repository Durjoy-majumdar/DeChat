package cl1;

import com.tencent.p014mm.plugin.finder.live.infrastructure.livedata.LiveMutableData;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import d50.C58114h;
import di3.C86312j;
import fj1.C45795b;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import ls3.C61397g;
import o40.C61926c;
import p565ir.C60606n;
import pe3.C89349b;
import qt1.C63329b;
import rx3.C13604l;
import sk1.C63947a;
import te3.C51828wg0;
import te3.C64265bq2;
import te3.C64273c21;
import te3.C64323dq2;
import te3.C64337e61;
import te3.C64338e71;
import te3.C64359f71;
import te3.C64387g71;
import te3.C64634po2;
import te3.C64733to;
import te3.nr4;

/* renamed from: cl1.u */
public final class C55001u extends C39970c<C45795b> {

    /* renamed from: f */
    public final String f154412f = ("LiveCoreSlice@" + hashCode());

    /* renamed from: g */
    public C64634po2 f154413g;

    /* renamed from: h */
    public long f154414h;

    /* renamed from: i */
    public Integer f154415i;

    /* renamed from: j */
    public long f154416j;

    /* renamed from: n */
    public byte[] f154417n;

    /* renamed from: o */
    public LiveMutableData<Integer> f154418o = new LiveMutableData<>();

    /* renamed from: p */
    public C64265bq2 f154419p = new C64265bq2();

    /* renamed from: q */
    public C64273c21 f154420q;

    /* renamed from: r */
    public C58114h f154421r;

    /* renamed from: s */
    public FinderObjectDesc f154422s;

    /* renamed from: t */
    public String f154423t;

    /* renamed from: u */
    public String f154424u;

    /* renamed from: v */
    public String f154425v;

    /* renamed from: w */
    public String f154426w;

    /* renamed from: x */
    public HashMap<Integer, nr4> f154427x;

    /* renamed from: y */
    public boolean f154428y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55001u(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
        C64273c21 c212 = new C64273c21();
        c212.f182394f = 1;
        this.f154420q = c212;
        this.f154423t = "";
        this.f154424u = "";
        this.f154425v = "";
        this.f154426w = "";
        this.f154427x = new HashMap<>();
    }

    /* renamed from: F3 */
    public final void mo76032F3(C64323dq2 dq22) {
        if (dq22 != null) {
            HashMap<Integer, nr4> hashMap = this.f154427x;
            nr4 nr4 = new nr4();
            nr4.f184549d = dq22.f182804d;
            nr4.f184550e = dq22.f182806f;
            nr4.f184551f = dq22.f182807g;
            nr4.f184552g = dq22.f182814q;
            hashMap.put(1, nr4);
            HashMap<Integer, nr4> hashMap2 = this.f154427x;
            nr4 nr42 = dq22.f182820w;
            if (nr42 == null) {
                nr42 = new nr4();
            }
            hashMap2.put(1, nr42);
            HashMap<Integer, nr4> hashMap3 = this.f154427x;
            nr4 nr43 = dq22.f182821x;
            if (nr43 == null) {
                nr43 = new nr4();
            }
            hashMap3.put(2, nr43);
            HashMap<Integer, nr4> hashMap4 = this.f154427x;
            nr4 nr44 = dq22.f182822y;
            if (nr44 == null) {
                nr44 = new nr4();
            }
            hashMap4.put(3, nr44);
            HashMap<Integer, nr4> hashMap5 = this.f154427x;
            nr4 nr45 = dq22.f182803A;
            if (nr45 == null && (nr45 = this.f154427x.get(3)) == null) {
                nr45 = new nr4();
            }
            hashMap5.put(4, nr45);
            StringBuilder sb = new StringBuilder("------videoParams------\n");
            for (Map.Entry next : this.f154427x.entrySet()) {
                sb.append(((Number) next.getKey()).intValue() + ":[encResEnum:" + ((nr4) next.getValue()).f184549d + ", capFps:" + ((nr4) next.getValue()).f184550e + ", encBR:" + ((nr4) next.getValue()).f184551f + ", encBR_Min:" + ((nr4) next.getValue()).f184552g + "]\n");
            }
            sb.append("------videoParams------");
            Log.m105924i(this.f154412f, sb.toString());
        }
    }

    /* renamed from: c3 */
    public final void mo76033c3() {
        Class cls = C61397g.class;
        Class cls2 = C60606n.class;
        C64338e71 e712 = this.f154420q.f182388Z;
        C64387g71 g712 = null;
        C64359f71 f712 = e712 != null ? e712.f182933i : null;
        if (e712 != null) {
            g712 = e712.f182934j;
        }
        if (f712 != null && g712 != null) {
            if (((C61397g) C86312j.m106911c(cls)).mo83479QW(1, this.f154420q)) {
                C13604l<Boolean, C64733to> Iu = ((C61397g) C86312j.m106911c(cls)).mo83477Iu(1, this.f154420q, ((C60606n) C86312j.m106911c(cls2)).mo85051bg(this.f154420q.f182392d));
                if (!((Boolean) Iu.f38555d).booleanValue()) {
                    Log.m105924i(this.f154412f, "checkReplayTransitionPreload but not valid CdnTransInfo!");
                } else if (Iu.f38556e == null) {
                    Log.m105924i(this.f154412f, "checkReplayTransitionPreload but preload CdnTransInfo is null!");
                } else {
                    Log.m105924i(this.f154412f, "checkReplayTransitionPreload startPreloadTask!");
                    C64273c21 c212 = this.f154420q;
                    B b = Iu.f38556e;
                    C87412m.m108591d(b);
                    ((C60606n) C86312j.m106911c(cls2)).Gi0(c212, (C64733to) b);
                }
            } else if (f712.f183090i != 0) {
                Log.m105924i(this.f154412f, "checkReplayTransitionPreload but disable replay transition!");
                ((C60606n) C86312j.m106911c(cls2)).mo85021OV(1);
            } else {
                Log.m105924i(this.f154412f, "checkReplayTransitionPreload but have not replay transition!");
            }
        }
    }

    /* renamed from: d3 */
    public final byte[] mo76034d3() {
        return this.f154417n;
    }

    /* renamed from: e3 */
    public final C64273c21 mo76035e3() {
        return this.f154420q;
    }

    /* renamed from: f3 */
    public final String mo76036f3() {
        return this.f154423t;
    }

    /* renamed from: g3 */
    public final long mo76037g3() {
        return this.f154416j;
    }

    /* renamed from: i3 */
    public final String mo76038i3() {
        return "objectId:" + C61926c.m72691p(this.f154416j) + " nicknameOption:" + this.f154425v + " liveInfo:" + this.f154420q.f182392d + ' ' + this.f154420q.f182414z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0030  */
    /* renamed from: j3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo76039j3(te3.C64265bq2 r8, te3.C64273c21 r9, pe3.C89349b r10) {
        /*
            r7 = this;
            java.lang.Class<cl1.u> r0 = cl1.C55001u.class
            java.lang.String r1 = "respLiveSdkInfo"
            gy3.C87412m.m108594g(r8, r1)
            te3.cq2 r1 = new te3.cq2
            r1.<init>()
            pe3.b r2 = r8.f182318j
            byte[] r2 = r2.f257327a
            java.lang.String r3 = ""
            r4 = 0
            if (r2 != 0) goto L_0x0017
        L_0x0015:
            r1 = r4
            goto L_0x0028
        L_0x0017:
            r1.parseFrom(r2)     // Catch:{ Exception -> 0x001b }
            goto L_0x0028
        L_0x001b:
            r1 = move-exception
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r5 = 0
            r2[r5] = r1
            java.lang.String r1 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r1, r3, r2)
            goto L_0x0015
        L_0x0028:
            androidx.lifecycle.i0 r2 = r7.business(r0)
            cl1.u r2 = (cl1.C55001u) r2
            if (r1 == 0) goto L_0x0033
            te3.dq2 r1 = r1.f182554d
            goto L_0x0034
        L_0x0033:
            r1 = r4
        L_0x0034:
            r2.mo76032F3(r1)
            androidx.lifecycle.i0 r1 = r7.business(r0)
            cl1.u r1 = (cl1.C55001u) r1
            r1.f154419p = r8
            androidx.lifecycle.i0 r8 = r7.business(r0)
            cl1.u r8 = (cl1.C55001u) r8
            if (r9 != 0) goto L_0x004d
            te3.c21 r1 = new te3.c21
            r1.<init>()
            goto L_0x004e
        L_0x004d:
            r1 = r9
        L_0x004e:
            r8.mo76042m3(r1)
            if (r9 == 0) goto L_0x008e
            androidx.lifecycle.i0 r8 = r7.business(r0)
            cl1.u r8 = (cl1.C55001u) r8
            te3.po2 r8 = r8.f154413g
            if (r8 != 0) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            r8.f184867e = r9
        L_0x0060:
            java.lang.String r8 = r7.f154412f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = "checkattachParams processJoinLiveResponse "
            r9.append(r1)
            androidx.lifecycle.i0 r1 = r7.business(r0)
            cl1.u r1 = (cl1.C55001u) r1
            te3.po2 r1 = r1.f154413g
            if (r1 == 0) goto L_0x0083
            te3.c21 r1 = r1.f184867e
            if (r1 == 0) goto L_0x0083
            int r1 = r1.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0084
        L_0x0083:
            r1 = r4
        L_0x0084:
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
        L_0x008e:
            androidx.lifecycle.i0 r8 = r7.business(r0)
            cl1.u r8 = (cl1.C55001u) r8
            androidx.lifecycle.i0 r9 = r7.business(r0)
            cl1.u r9 = (cl1.C55001u) r9
            te3.c21 r9 = r9.f154420q
            long r1 = r9.f182392d
            r5 = 0
            int r9 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x00a6
            r9 = r3
            goto L_0x00c8
        L_0x00a6:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            androidx.lifecycle.i0 r1 = r7.business(r0)
            cl1.u r1 = (cl1.C55001u) r1
            te3.c21 r1 = r1.f154420q
            long r1 = r1.f182392d
            r9.append(r1)
            r1 = 95
            r9.append(r1)
            long r1 = java.lang.System.currentTimeMillis()
            r9.append(r1)
            java.lang.String r9 = r9.toString()
        L_0x00c8:
            r8.mo76044o3(r9)
            androidx.lifecycle.i0 r8 = r7.business(r0)
            cl1.u r8 = (cl1.C55001u) r8
            te3.c21 r8 = r8.f154420q
            int r8 = r8.f182396h
            if (r8 > 0) goto L_0x00e5
            androidx.lifecycle.i0 r8 = r7.business(r0)
            cl1.u r8 = (cl1.C55001u) r8
            te3.c21 r8 = r8.f154420q
            int r9 = eb0.C31543z5.m39455e()
            r8.f182396h = r9
        L_0x00e5:
            androidx.lifecycle.i0 r8 = r7.business(r0)
            cl1.u r8 = (cl1.C55001u) r8
            if (r10 == 0) goto L_0x00ef
            byte[] r4 = r10.f257327a
        L_0x00ef:
            r8.mo76041l3(r4)
            er1.j4 r8 = er1.C58739j4.f168176a
            boolean r8 = r8.mo83692U()
            if (r8 == 0) goto L_0x012b
            java.lang.String r8 = r7.f154412f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "join live liveCookies "
            r9.append(r10)
            androidx.lifecycle.i0 r10 = r7.business(r0)
            cl1.u r10 = (cl1.C55001u) r10
            byte[] r10 = r10.f154417n
            if (r10 != 0) goto L_0x011c
            java.nio.charset.Charset r10 = z04.C119027c.f356488a
            byte[] r10 = r3.getBytes(r10)
            java.lang.String r0 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r10, r0)
        L_0x011c:
            r0 = 2
            java.lang.String r10 = android.util.Base64.encodeToString(r10, r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
        L_0x012b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cl1.C55001u.mo76039j3(te3.bq2, te3.c21, pe3.b):void");
    }

    /* renamed from: k3 */
    public final void mo76040k3(FinderObjectDesc finderObjectDesc) {
        this.f154422s = finderObjectDesc;
    }

    /* renamed from: l3 */
    public final void mo76041l3(byte[] bArr) {
        Boolean bool;
        this.f154417n = bArr;
        Log.m105924i(this.f154412f, "liveCookies has change");
        StringBuilder sb = new StringBuilder();
        sb.append("cookie is Empty: ");
        if (bArr != null) {
            bool = Boolean.valueOf(bArr.length == 0);
        } else {
            bool = null;
        }
        sb.append(bool);
        sb.append(", ");
        sb.append(this);
        Log.m105924i("ken_debug", sb.toString());
        Log.printInfoStack("ken_debug", "", new Object[0]);
    }

    /* renamed from: m3 */
    public final void mo76042m3(C64273c21 c212) {
        C89349b bVar;
        Class cls = C0668l.class;
        C87412m.m108594g(c212, "value");
        this.f154420q = c212;
        String str = this.f154412f;
        StringBuilder sb = new StringBuilder();
        sb.append("#liveInfo set (");
        sb.append(c212.hashCode());
        sb.append(")liveId:");
        sb.append(c212.f182392d);
        sb.append(", liveStatus:");
        sb.append(c212.f182394f);
        sb.append(" live_flag=");
        sb.append(c212.f182374S);
        sb.append(" purchase_info.charge_flag=");
        C64337e61 e612 = c212.f182363I;
        C89349b bVar2 = null;
        sb.append(e612 != null ? Integer.valueOf(e612.f182920d) : null);
        sb.append(" purchase_info.payment_buff.size=");
        C64337e61 e613 = c212.f182363I;
        sb.append((e613 == null || (bVar = e613.f182926j) == null) ? null : Integer.valueOf(bVar.f257327a.length));
        sb.append(" biz_info.username=");
        C51828wg0 wg02 = c212.f182380V;
        sb.append(wg02 != null ? wg02.f144033e : null);
        sb.append(" liveInfo=");
        sb.append(C63947a.f181274a.mo88736v(c212));
        Log.m105924i(str, sb.toString());
        this.f154418o.postValue(Integer.valueOf(c212.f182374S));
        if (C61926c.m72696u(c212.f182374S, 64)) {
            C0654b bVar3 = (C0654b) business(C0654b.class);
            C51828wg0 wg03 = c212.f182380V;
            bVar3.mo624d3(true, wg03 != null ? wg03.f144033e : null, wg03 != null ? wg03.f144032d : null, wg03 != null ? wg03.f144034f : 0);
        }
        C0668l lVar = (C0668l) business(cls);
        C64337e61 e614 = c212.f182363I;
        if (e614 != null) {
            bVar2 = e614.f182926j;
        }
        lVar.f1574g = bVar2;
        ((C0668l) business(cls)).mo634k3("liveCoreSlice", c212.f182362H);
    }

    /* renamed from: n3 */
    public final void mo76043n3(C58114h hVar) {
        this.f154421r = hVar;
        C63329b bVar = C63329b.f179694a;
        String str = this.f154412f;
        bVar.mo88233d(str, "set liveRoomModel " + hVar);
    }

    /* renamed from: o3 */
    public final void mo76044o3(String str) {
        C87412m.m108594g(str, "value");
        String str2 = this.f154412f;
        Log.m105924i(str2, "write uniqueId to:" + str);
        this.f154426w = str;
    }

    public void onCleared() {
        super.onCleared();
        Log.m105924i(this.f154412f, "coreSlice Clear");
        this.f154414h = 0;
        this.f154416j = 0;
        mo76042m3(new C64273c21());
        this.f154419p = new C64265bq2();
        mo76041l3((byte[]) null);
        mo76043n3((C58114h) null);
        this.f154422s = null;
        this.f154423t = "";
        this.f154425v = "";
        mo76044o3("");
        this.f154427x.clear();
        this.f154428y = false;
    }
}
