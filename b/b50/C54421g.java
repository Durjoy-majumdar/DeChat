package b50;

import android.content.Context;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.live.core.core.trtc.sdkadapter.feature.WeixinAudioJitterBufferControllerFactory;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.rtmp.ITXLivePlayListener;
import com.tencent.rtmp.TXLivePlayConfig;
import d50.C58113g;
import e50.C116693a;
import f50.C58924d;
import gy3.C87412m;
import java.util.ArrayList;
import org.json.JSONObject;
import p50.C47428d;
import p50.C62195b;
import rx3.C13598b0;
import te3.C64890zp2;

/* renamed from: b50.g */
public final class C54421g {

    /* renamed from: a */
    public C58924d f152627a;

    /* renamed from: b */
    public C58113g f152628b;

    /* renamed from: c */
    public long f152629c;

    /* renamed from: d */
    public int f152630d;

    /* renamed from: e */
    public int f152631e = 0;

    /* renamed from: f */
    public int f152632f = 0;

    /* renamed from: g */
    public ArrayList<Long> f152633g = new ArrayList<>(100);

    /* renamed from: h */
    public long f152634h;

    /* renamed from: i */
    public long f152635i;

    /* renamed from: j */
    public long f152636j = (((long) 5) * 10000);

    /* renamed from: k */
    public int f152637k = 3;

    /* renamed from: l */
    public int f152638l;

    /* renamed from: m */
    public TXLivePlayConfig f152639m;

    /* renamed from: n */
    public int f152640n;

    /* renamed from: o */
    public int f152641o;

    /* renamed from: p */
    public C62195b f152642p;

    /* renamed from: q */
    public int f152643q;

    /* renamed from: r */
    public int f152644r;

    /* renamed from: s */
    public int f152645s;

    /* renamed from: t */
    public C47428d f152646t;

    /* renamed from: f */
    public static final void m61134f(C54421g gVar, C64890zp2 zp22, String str, int i, String str2) {
        C58924d dVar = gVar.f152627a;
        if (dVar != null) {
            dVar.stopPlay(false);
        }
        C58924d dVar2 = gVar.f152627a;
        if (dVar2 != null) {
            dVar2.mo84115f(str, 1, zp22);
        }
        gVar.f152631e = i;
        StringBuilder sb = new StringBuilder();
        sb.append("switchCdnStream ");
        sb.append(str2);
        sb.append(" startPlay done, liveId:");
        C58113g gVar2 = gVar.f152628b;
        sb.append(gVar2 != null ? Long.valueOf(gVar2.f166232b) : null);
        sb.append(',');
        sb.append(gVar.f152627a);
        sb.append(", url:");
        sb.append(str);
        Log.m105924i("MicroMsg.LiveCdnPlayerManager", sb.toString());
    }

    /* JADX WARNING: type inference failed for: r3v14, types: [com.tencent.rtmp.TXLivePlayer] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0072  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m61135g(b50.C54421g r7, te3.C64890zp2 r8, java.lang.String r9, java.lang.String r10, int r11) {
        /*
            r0 = 1
            r1 = 0
            java.lang.String r2 = "MicroMsg.LiveCdnPlayerManager"
            r3 = 0
            if (r8 == 0) goto L_0x00b6
            int r4 = r8.f186798S
            if (r4 <= 0) goto L_0x00b6
            java.lang.String r4 = r8.f186799T
            if (r4 == 0) goto L_0x0018
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            r4 = 0
            goto L_0x0019
        L_0x0018:
            r4 = 1
        L_0x0019:
            if (r4 == 0) goto L_0x001d
            goto L_0x00b6
        L_0x001d:
            w50.b r4 = w50.C65928b.f189533a
            if (r9 != 0) goto L_0x0023
            java.lang.String r9 = ""
        L_0x0023:
            java.lang.String r4 = "openid=reqtoken_"
            boolean r9 = z04.C112550d0.m153801u(r9, r4, r1)
            if (r9 == 0) goto L_0x0039
            java.lang.String r9 = "url"
            gy3.C87412m.m108594g(r10, r9)
            boolean r9 = z04.C112550d0.m153801u(r10, r4, r1)
            if (r9 != 0) goto L_0x0039
            r9 = 1
            goto L_0x003a
        L_0x0039:
            r9 = 0
        L_0x003a:
            com.tencent.mm.sdk.platformtools.LruCache<java.lang.Integer, d50.b$a> r4 = d50.C58108b.f166185a
            f50.d r4 = r7.f152627a
            if (r4 == 0) goto L_0x0045
            com.tencent.rtmp.TXLivePlayer r4 = r4.getPlayer()
            goto L_0x0046
        L_0x0045:
            r4 = r3
        L_0x0046:
            if (r4 == 0) goto L_0x004d
            int r4 = r4.hashCode()
            goto L_0x004e
        L_0x004d:
            r4 = 0
        L_0x004e:
            com.tencent.mm.sdk.platformtools.LruCache<java.lang.Integer, d50.b$a> r5 = d50.C58108b.f166185a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r5.get(r4)
            d50.b$a r4 = (d50.C58108b.C58109a) r4
            if (r4 == 0) goto L_0x0062
            boolean r4 = r4.f166187b
            if (r4 != r0) goto L_0x0062
            r4 = 1
            goto L_0x0063
        L_0x0062:
            r4 = 0
        L_0x0063:
            f50.d r6 = r7.f152627a
            if (r6 == 0) goto L_0x006b
            com.tencent.rtmp.TXLivePlayer r3 = r6.getPlayer()
        L_0x006b:
            if (r3 == 0) goto L_0x0072
            int r3 = r3.hashCode()
            goto L_0x0073
        L_0x0072:
            r3 = 0
        L_0x0073:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r5.get(r3)
            d50.b$a r3 = (d50.C58108b.C58109a) r3
            if (r3 == 0) goto L_0x0084
            boolean r3 = r3.f166189d
            if (r3 != r0) goto L_0x0084
            goto L_0x0085
        L_0x0084:
            r0 = 0
        L_0x0085:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "switchCdnStream try to re decrpyt player,forceReDecrypt:"
            r1.append(r3)
            r1.append(r9)
            java.lang.String r3 = ", playerHaveDecrypted:"
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = ",playerHavePlay:"
            r1.append(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            if (r9 != 0) goto L_0x00b0
            if (r4 != 0) goto L_0x00b5
            if (r0 != 0) goto L_0x00b5
        L_0x00b0:
            java.lang.String r9 = "(tryToReDecrypt)"
            m61134f(r7, r8, r10, r11, r9)
        L_0x00b5:
            return
        L_0x00b6:
            r7.getClass()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "switchCdnStream don't need to re decrpyt player, mode:"
            r7.append(r9)
            if (r8 == 0) goto L_0x00cd
            int r9 = r8.f186798S
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L_0x00ce
        L_0x00cd:
            r9 = r3
        L_0x00ce:
            r7.append(r9)
            java.lang.String r9 = ", key is null:"
            r7.append(r9)
            if (r8 == 0) goto L_0x00da
            java.lang.String r3 = r8.f186799T
        L_0x00da:
            if (r3 == 0) goto L_0x00e4
            int r8 = r3.length()
            if (r8 != 0) goto L_0x00e3
            goto L_0x00e4
        L_0x00e3:
            r0 = 0
        L_0x00e4:
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b50.C54421g.m61135g(b50.g, te3.zp2, java.lang.String, java.lang.String, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.mo82870c(r2.f152631e);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo75227a() {
        /*
            r2 = this;
            d50.g r0 = r2.f152628b
            if (r0 == 0) goto L_0x000c
            int r1 = r2.f152631e
            java.lang.String r0 = r0.mo82870c(r1)
            if (r0 != 0) goto L_0x000e
        L_0x000c:
            java.lang.String r0 = ""
        L_0x000e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b50.C54421g.mo75227a():java.lang.String");
    }

    /* renamed from: b */
    public final String mo75228b() {
        C58113g gVar = this.f152628b;
        if (gVar != null) {
            int i = gVar.f166239i;
            Log.m105925i("MicroMsg.LiveCdnPlayerManager", "play fail! try backup url, quality change: %d --> %d, switchCnt:%d", Integer.valueOf(this.f152631e), Integer.valueOf(i), Integer.valueOf(this.f152630d));
            C58113g gVar2 = this.f152628b;
            String c = gVar2 != null ? gVar2.mo82870c(i) : null;
            if (c != null) {
                return c;
            }
        }
        Log.m105924i("MicroMsg.LiveCdnPlayerManager", "play fail! backup is null");
        return "";
    }

    /* renamed from: c */
    public final boolean mo75229c() {
        C58924d dVar = this.f152627a;
        if (dVar != null) {
            return dVar.isPlaying();
        }
        return false;
    }

    /* renamed from: d */
    public final void mo75230d(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("stopPlay liveId:");
        C58113g gVar = this.f152628b;
        sb.append(gVar != null ? Long.valueOf(gVar.f166232b) : null);
        sb.append(",player:");
        sb.append(this.f152627a);
        sb.append(',');
        Log.m105924i("MicroMsg.LiveCdnPlayerManager", sb.toString());
        if (BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.DEBUG) {
            Log.m105924i("MicroMsg.LiveCdnPlayerManager", "stopPlay stack:" + Util.getStack());
        }
        C58924d dVar = this.f152627a;
        if (dVar != null) {
            dVar.stopPlay(z);
        }
        C58924d dVar2 = this.f152627a;
        if (dVar2 != null) {
            dVar2.setPlayListener((ITXLivePlayListener) null);
        }
        this.f152627a = null;
        this.f152629c = 0;
        this.f152630d = 0;
        this.f152633g.clear();
        this.f152634h = 0;
        this.f152635i = 0;
        this.f152636j = 10000 * ((long) 5);
        this.f152645s = 0;
        C47428d dVar3 = this.f152646t;
        if (dVar3 != null) {
            dVar3.mo72453c();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:93:0x019e, code lost:
        if (z04.C112550d0.m153803w(r10, r11, false, 2, (java.lang.Object) null) != false) goto L_0x01a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo75231e(java.lang.String r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            d50.g r2 = r0.f152628b
            r3 = -1
            r4 = 0
            r5 = 0
            if (r2 == 0) goto L_0x0059
            java.util.HashMap<java.lang.Integer, d50.j> r2 = r2.f166241k
            java.util.Collection r2 = r2.values()
            java.lang.String r6 = "cdnUrlMap.values"
            gy3.C87412m.m108593f(r2, r6)
            java.util.Iterator r2 = r2.iterator()
            r6 = 0
        L_0x001b:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0039
            java.lang.Object r7 = r2.next()
            if (r6 < 0) goto L_0x0035
            d50.j r7 = (d50.C7170j) r7
            java.lang.String r7 = r7.f25142a
            boolean r7 = gy3.C87412m.m108589b(r7, r1)
            if (r7 == 0) goto L_0x0032
            goto L_0x003a
        L_0x0032:
            int r6 = r6 + 1
            goto L_0x001b
        L_0x0035:
            sx3.C64197v.m75542k()
            throw r4
        L_0x0039:
            r6 = -1
        L_0x003a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "indexOfUrl "
            r2.append(r7)
            r2.append(r1)
            java.lang.String r7 = ", index:"
            r2.append(r7)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            java.lang.String r7 = "LiveRoomInfo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            goto L_0x005a
        L_0x0059:
            r6 = 0
        L_0x005a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "switchCdnStream to "
            r2.append(r7)
            r2.append(r1)
            java.lang.String r7 = ", indexOfUrl:"
            r2.append(r7)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            java.lang.String r7 = "MicroMsg.LiveCdnPlayerManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            d50.g r2 = r0.f152628b
            if (r2 == 0) goto L_0x0084
            int r8 = r0.f152631e
            java.lang.String r2 = r2.mo82870c(r8)
            goto L_0x0085
        L_0x0084:
            r2 = r4
        L_0x0085:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r2, (java.lang.String) r1)
            r9 = 1
            if (r8 == 0) goto L_0x00c2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "switchCdnStream fail: curCdnUrl == cdnUrl,cdnUrl is empty:"
            r3.append(r8)
            if (r1 == 0) goto L_0x00a2
            int r8 = r18.length()
            if (r8 != 0) goto L_0x00a0
            goto L_0x00a2
        L_0x00a0:
            r8 = 0
            goto L_0x00a3
        L_0x00a2:
            r8 = 1
        L_0x00a3:
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r3)
            if (r1 == 0) goto L_0x00b5
            int r3 = r18.length()
            if (r3 != 0) goto L_0x00b6
        L_0x00b5:
            r5 = 1
        L_0x00b6:
            if (r5 != 0) goto L_0x00c1
            d50.g r3 = r0.f152628b
            if (r3 == 0) goto L_0x00be
            te3.zp2 r4 = r3.f166244n
        L_0x00be:
            m61135g(r0, r4, r2, r1, r6)
        L_0x00c1:
            return
        L_0x00c2:
            if (r1 == 0) goto L_0x00cd
            int r8 = r18.length()
            if (r8 != 0) goto L_0x00cb
            goto L_0x00cd
        L_0x00cb:
            r8 = 0
            goto L_0x00ce
        L_0x00cd:
            r8 = 1
        L_0x00ce:
            if (r8 == 0) goto L_0x00d7
            java.lang.String r1 = "switchCdnStream fail: cdnUrl is nullornil"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r1)
            return
        L_0x00d7:
            f50.d r8 = r0.f152627a
            if (r8 != 0) goto L_0x00e2
            java.lang.String r1 = "switchCdnStream fail: txLivePlayer == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r1)
            return
        L_0x00e2:
            if (r8 == 0) goto L_0x00ec
            boolean r8 = r8.isPlaying()
            if (r8 != r9) goto L_0x00ec
            r8 = 1
            goto L_0x00ed
        L_0x00ec:
            r8 = 0
        L_0x00ed:
            if (r8 == 0) goto L_0x01ff
            w50.b r8 = w50.C65928b.f189533a
            java.lang.String r10 = r8.mo89966e(r2)
            java.lang.String r8 = r8.mo89966e(r1)
            if (r10 == 0) goto L_0x0104
            int r11 = r10.length()
            if (r11 != 0) goto L_0x0102
            goto L_0x0104
        L_0x0102:
            r11 = 0
            goto L_0x0105
        L_0x0104:
            r11 = 1
        L_0x0105:
            if (r11 != 0) goto L_0x01ff
            if (r8 == 0) goto L_0x0112
            int r11 = r8.length()
            if (r11 != 0) goto L_0x0110
            goto L_0x0112
        L_0x0110:
            r11 = 0
            goto L_0x0113
        L_0x0112:
            r11 = 1
        L_0x0113:
            if (r11 != 0) goto L_0x01ff
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r8, (java.lang.String) r10)
            java.lang.String r12 = ", new:"
            if (r11 == 0) goto L_0x0144
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r9 = "1.switchCdnStream same streamid, skip switching! old:"
            r3.append(r9)
            r3.append(r10)
            r3.append(r12)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r3)
            d50.g r3 = r0.f152628b
            if (r3 == 0) goto L_0x013e
            te3.zp2 r3 = r3.f166244n
            goto L_0x013f
        L_0x013e:
            r3 = r4
        L_0x013f:
            m61135g(r0, r3, r2, r1, r6)
            goto L_0x0200
        L_0x0144:
            r2 = 2
            boolean r11 = z04.C112550d0.m153803w(r10, r8, r5, r2, r4)
            if (r11 != 0) goto L_0x016e
            boolean r11 = z04.C112550d0.m153803w(r8, r10, r5, r2, r4)
            if (r11 == 0) goto L_0x0152
            goto L_0x016e
        L_0x0152:
            r13 = 0
            r14 = 0
            r15 = 6
            r16 = 0
            java.lang.String r12 = "_"
            r11 = r8
            int r11 = z04.C112550d0.m153772H(r11, r12, r13, r14, r15, r16)
            if (r11 == r3) goto L_0x016b
            java.lang.String r11 = r8.substring(r5, r11)
            java.lang.String r12 = "this as java.lang.String…ing(startIndex, endIndex)"
            gy3.C87412m.m108593f(r11, r12)
            goto L_0x016c
        L_0x016b:
            r11 = r8
        L_0x016c:
            r12 = 0
            goto L_0x018a
        L_0x016e:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "2.switchCdnStream streamid substring,directly try switching! old:"
            r11.append(r13)
            r11.append(r10)
            r11.append(r12)
            r11.append(r8)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r11)
            r11 = r8
            r12 = 1
        L_0x018a:
            if (r12 != 0) goto L_0x01a0
            if (r11 == 0) goto L_0x0197
            int r12 = r11.length()
            if (r12 != 0) goto L_0x0195
            goto L_0x0197
        L_0x0195:
            r12 = 0
            goto L_0x0198
        L_0x0197:
            r12 = 1
        L_0x0198:
            if (r12 != 0) goto L_0x01ff
            boolean r2 = z04.C112550d0.m153803w(r10, r11, r5, r2, r4)
            if (r2 == 0) goto L_0x01ff
        L_0x01a0:
            f50.d r2 = r0.f152627a
            if (r2 == 0) goto L_0x01b3
            d50.g r11 = r0.f152628b
            if (r11 == 0) goto L_0x01ab
            te3.zp2 r11 = r11.f166244n
            goto L_0x01ac
        L_0x01ab:
            r11 = r4
        L_0x01ac:
            java.lang.String r11 = w50.C65928b.m77657c(r11, r1)
            r2.mo84124m(r11)
        L_0x01b3:
            f50.d r2 = r0.f152627a
            if (r2 == 0) goto L_0x01c0
            int r2 = r2.switchStream(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x01c1
        L_0x01c0:
            r2 = r4
        L_0x01c1:
            p50.b r11 = r0.f152642p
            if (r11 == 0) goto L_0x01ce
            if (r2 == 0) goto L_0x01cb
            int r3 = r2.intValue()
        L_0x01cb:
            r11.mo84227a(r1, r3)
        L_0x01ce:
            if (r2 != 0) goto L_0x01d1
            goto L_0x01d7
        L_0x01d1:
            int r3 = r2.intValue()
            if (r3 == 0) goto L_0x01d8
        L_0x01d7:
            r5 = 1
        L_0x01d8:
            r0.f152631e = r6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r9 = "3. switchCdnStream switchStream ret:"
            r3.append(r9)
            r3.append(r2)
            java.lang.String r2 = ", streamId change: "
            r3.append(r2)
            r3.append(r10)
            java.lang.String r2 = " --> "
            r3.append(r2)
            r3.append(r8)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            goto L_0x0200
        L_0x01ff:
            r5 = 1
        L_0x0200:
            if (r5 == 0) goto L_0x020d
            d50.g r2 = r0.f152628b
            if (r2 == 0) goto L_0x0208
            te3.zp2 r4 = r2.f166244n
        L_0x0208:
            java.lang.String r2 = ""
            m61134f(r0, r4, r1, r6, r2)
        L_0x020d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b50.C54421g.mo75231e(java.lang.String):void");
    }

    /* renamed from: h */
    public final void mo75232h(String str) {
        C87412m.m108594g(str, "url");
        Log.m105924i("MicroMsg.LiveCdnPlayerManager", "tryPlayBackupUrl: " + str);
        mo75231e(str);
        this.f152630d = this.f152630d + 1;
        this.f152638l = this.f152638l + 1;
    }

    /* renamed from: i */
    public final void mo75233i(int i, String str) {
        C87412m.m108594g(str, "url");
        if (!(str.length() == 0)) {
            C58924d dVar = this.f152627a;
            if (dVar != null) {
                dVar.stopPlay(false);
            }
            C58924d dVar2 = this.f152627a;
            Long l = null;
            if (dVar2 != null) {
                C58113g gVar = this.f152628b;
                dVar2.mo84115f(str, i, gVar != null ? gVar.f166244n : null);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("tryRestartPlay liveId:");
            C58113g gVar2 = this.f152628b;
            if (gVar2 != null) {
                l = Long.valueOf(gVar2.f166232b);
            }
            sb.append(l);
            sb.append(", player:");
            sb.append(this.f152627a);
            sb.append(", lastCdnQuality:");
            sb.append(this.f152631e);
            sb.append(", url:");
            sb.append(str);
            Log.m105924i("MicroMsg.LiveCdnPlayerManager", sb.toString());
            return;
        }
        Log.m105928w("MicroMsg.LiveCdnPlayerManager", "tryRestartPlay fail: url is nullornil");
    }

    /* renamed from: j */
    public final void mo75234j(C58113g gVar, boolean z, TXLivePlayConfig tXLivePlayConfig) {
        int i;
        C64890zp2 zp22;
        C64890zp2 zp23;
        C64890zp2 zp24;
        C64890zp2 zp25;
        C58113g gVar2 = gVar;
        boolean z2 = z;
        TXLivePlayConfig tXLivePlayConfig2 = tXLivePlayConfig;
        C87412m.m108594g(tXLivePlayConfig2, "config");
        if (gVar2 == null) {
            Log.m105924i("MicroMsg.LiveCdnPlayerManager", "updateLiveRoomInfo fail liveRoomInfo is null!");
            return;
        }
        if (!gVar.mo82869b() || z2) {
            Log.m105924i("MicroMsg.LiveCdnPlayerManager", "updateLiveRoomInfo isChargeLive:" + z2 + ", cdnCustomerSwitchCfg:" + gVar2.f166240j + " invalid");
            gVar2.f166240j = -1;
            i = gVar2.f166238h;
        } else {
            i = gVar2.mo82872e(gVar2.f166240j);
            Log.m105924i("MicroMsg.LiveCdnPlayerManager", "updateLiveRoomInfo isChargeLive:" + z2 + ", use cdnCustomerSwitchCfg:" + gVar2.f166240j + ",index:" + i);
        }
        this.f152641o = gVar2.f166239i;
        int size = gVar2.f166241k.size();
        if (i >= size) {
            Log.m105924i("MicroMsg.LiveCdnPlayerManager", "updateLiveRoomInfo fail,newCdnQuality:" + i + ", cdnUrlSize:" + size + '!');
            return;
        }
        String c = gVar2.mo82870c(i);
        if (c == null || c.length() == 0) {
            Log.m105928w("MicroMsg.LiveCdnPlayerManager", "updateLiveRoomInfo fail: newSwitchUrl is nullornil");
            return;
        }
        C58113g gVar3 = this.f152628b;
        String c2 = gVar3 != null ? gVar3.mo82870c(this.f152631e) : null;
        mo75231e(c);
        gVar2.f166246p = (long) this.f152643q;
        gVar2.f166247q = (long) this.f152644r;
        this.f152628b = gVar2;
        this.f152631e = i;
        if (BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.DEBUG) {
            Log.m105924i("MicroMsg.LiveCdnPlayerManager", "updateLiveRoomInfo oriSwitchUrl:" + c2 + " ,newSwitchUrl:" + c);
        }
        if (this.f152639m == null) {
            Log.m105924i("MicroMsg.LiveCdnPlayerManager", "updateLiveRoomInfo: mPlayConfig is null, use config:" + tXLivePlayConfig2);
            this.f152639m = tXLivePlayConfig2;
        }
        C58113g gVar4 = this.f152628b;
        int i2 = (gVar4 == null || (zp25 = gVar4.f166244n) == null) ? 0 : zp25.f186805Z;
        int i3 = (gVar4 == null || (zp24 = gVar4.f166244n) == null) ? 0 : zp24.f186816p0;
        float f = 0.0f;
        float f2 = ((gVar4 == null || (zp23 = gVar4.f166244n) == null) ? 0.0f : (float) zp23.f186825x0) / 100.0f;
        if (!(gVar4 == null || (zp22 = gVar4.f166244n) == null)) {
            f = (float) zp22.f186827y0;
        }
        float f3 = f / 100.0f;
        Log.m105924i("WaveJBM", "After JoinLive set wavejbm_flag=" + i2 + ",wavejbm_mode=" + i3 + ",wavejbm_min_speed_rate=" + f2 + ",wavejbm_max_speed_rate=" + f3);
        if (i2 == 0) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ProviderConstants.API_PATH, "setAudioJitterBufferFactory");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("controllerFactory", 0);
            C13598b0 b0Var = C13598b0.f38549a;
            jSONObject.put("params", jSONObject2);
            String jSONObject3 = jSONObject.toString();
            C87412m.m108593f(jSONObject3, "JSONObject().apply{\n    …\n            }.toString()");
            C58924d dVar = this.f152627a;
            if (dVar != null) {
                dVar.callExperimentalAPI(jSONObject3);
            }
            Log.m105924i("WaveJBM", "After JoinLive set using TrtcJBM");
        } else {
            if (WeixinAudioJitterBufferControllerFactory.f157119b == null) {
                WeixinAudioJitterBufferControllerFactory.f157119b = new WeixinAudioJitterBufferControllerFactory();
            }
            WeixinAudioJitterBufferControllerFactory weixinAudioJitterBufferControllerFactory = WeixinAudioJitterBufferControllerFactory.f157119b;
            String str = "WaveJBM";
            long a = weixinAudioJitterBufferControllerFactory.mo76386a();
            weixinAudioJitterBufferControllerFactory.mo76387b(i3, f2, f3);
            weixinAudioJitterBufferControllerFactory.mo76389d(1);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(ProviderConstants.API_PATH, "setAudioJitterBufferFactory");
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("controllerFactory", a);
            C13598b0 b0Var2 = C13598b0.f38549a;
            jSONObject4.put("params", jSONObject5);
            String jSONObject6 = jSONObject4.toString();
            C87412m.m108593f(jSONObject6, "JSONObject().apply{\n    …\n            }.toString()");
            C58924d dVar2 = this.f152627a;
            if (dVar2 != null) {
                dVar2.callExperimentalAPI(jSONObject6);
            }
            Log.m105924i(str, "After JoinLive set WaveJBM: factory=" + a + ",mode=" + i3 + ",min_speed_rate=" + f2 + ",max_speed_rate=" + f3);
        }
        mo75235k();
        if (C116693a.f349962W == null) {
            C116693a.f349962W = new C116693a();
        }
        C87412m.m108591d(C116693a.f349962W);
        if (C116693a.f349963X) {
            if (C116693a.f349962W == null) {
                C116693a.f349962W = new C116693a();
            }
            C116693a aVar = C116693a.f349962W;
            C87412m.m108591d(aVar);
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            C64890zp2 zp26 = gVar2.f166244n;
            int i4 = zp26 != null ? zp26.f186783C : 0;
            int i5 = zp26 != null ? zp26.f186784D : 0;
            int i6 = zp26 != null ? zp26.f186785E : 0;
            int i7 = zp26 != null ? zp26.f186786F : 0;
            int i8 = zp26 != null ? zp26.f186787G : 0;
            int i9 = zp26 != null ? zp26.f186788H : 0;
            int i15 = zp26 != null ? zp26.f186789I : 0;
            int i16 = zp26 != null ? zp26.f186790J : 0;
            String str2 = zp26 != null ? zp26.f186791K : null;
            String str3 = str2 == null ? "" : str2;
            String str4 = zp26 != null ? zp26.f186792L : null;
            String str5 = str4 == null ? "" : str4;
            String str6 = zp26 != null ? zp26.f186793M : null;
            aVar.mo180713g(context, i4, i5, i6, i7, i8, i9, i15, i16, str3, str5, str6 == null ? "" : str6, zp26 != null ? zp26.f186795P : 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r2 = r0.f166244n;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c8  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo75235k() {
        /*
            r8 = this;
            d50.g r0 = r8.f152628b
            r1 = 0
            if (r0 == 0) goto L_0x000c
            te3.zp2 r2 = r0.f166244n
            if (r2 == 0) goto L_0x000c
            int r2 = r2.f186823w
            goto L_0x000d
        L_0x000c:
            r2 = 0
        L_0x000d:
            java.lang.String r3 = ", maxCache:"
            java.lang.String r4 = ", minCache:"
            java.lang.String r5 = "MicroMsg.LiveCdnPlayerManager"
            if (r2 <= 0) goto L_0x0076
            if (r0 == 0) goto L_0x001e
            te3.zp2 r2 = r0.f166244n
            if (r2 == 0) goto L_0x001e
            int r2 = r2.f186824x
            goto L_0x001f
        L_0x001e:
            r2 = 0
        L_0x001f:
            if (r2 <= 0) goto L_0x0076
            r2 = 0
            if (r0 == 0) goto L_0x002f
            te3.zp2 r0 = r0.f166244n
            if (r0 == 0) goto L_0x002f
            int r0 = r0.f186823w
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0030
        L_0x002f:
            r0 = r2
        L_0x0030:
            gy3.C87412m.m108591d(r0)
            int r0 = r0.intValue()
            float r0 = (float) r0
            r6 = 1000(0x3e8, float:1.401E-42)
            float r6 = (float) r6
            float r0 = r0 / r6
            d50.g r7 = r8.f152628b
            if (r7 == 0) goto L_0x004a
            te3.zp2 r7 = r7.f166244n
            if (r7 == 0) goto L_0x004a
            int r2 = r7.f186824x
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x004a:
            gy3.C87412m.m108591d(r2)
            int r2 = r2.intValue()
            float r2 = (float) r2
            float r2 = r2 / r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "get cgi params type:"
            r6.append(r7)
            int r7 = r8.f152637k
            r6.append(r7)
            r6.append(r4)
            r6.append(r0)
            r6.append(r3)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            goto L_0x007a
        L_0x0076:
            r0 = 1065353216(0x3f800000, float:1.0)
            r2 = 1084227584(0x40a00000, float:5.0)
        L_0x007a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "updatePlayerConfig type:"
            r6.append(r7)
            int r7 = r8.f152637k
            r6.append(r7)
            r6.append(r4)
            r6.append(r0)
            r6.append(r3)
            r6.append(r2)
            java.lang.String r3 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            int r3 = r8.f152637k
            r4 = 1
            if (r3 != r4) goto L_0x00c8
            com.tencent.rtmp.TXLivePlayConfig r1 = r8.f152639m
            if (r1 == 0) goto L_0x00a9
            r1.setAutoAdjustCacheTime(r4)
        L_0x00a9:
            com.tencent.rtmp.TXLivePlayConfig r1 = r8.f152639m
            if (r1 == 0) goto L_0x00b0
            r1.setMaxAutoAdjustCacheTime(r0)
        L_0x00b0:
            com.tencent.rtmp.TXLivePlayConfig r1 = r8.f152639m
            if (r1 == 0) goto L_0x00b7
            r1.setMinAutoAdjustCacheTime(r0)
        L_0x00b7:
            com.tencent.rtmp.TXLivePlayConfig r1 = r8.f152639m
            if (r1 == 0) goto L_0x00be
            r1.setCacheTime(r0)
        L_0x00be:
            f50.d r0 = r8.f152627a
            if (r0 == 0) goto L_0x0119
            com.tencent.rtmp.TXLivePlayConfig r1 = r8.f152639m
            r0.setConfig(r1)
            goto L_0x0119
        L_0x00c8:
            r5 = 2
            if (r3 != r5) goto L_0x00f1
            com.tencent.rtmp.TXLivePlayConfig r3 = r8.f152639m
            if (r3 == 0) goto L_0x00d2
            r3.setAutoAdjustCacheTime(r1)
        L_0x00d2:
            com.tencent.rtmp.TXLivePlayConfig r1 = r8.f152639m
            if (r1 == 0) goto L_0x00d9
            r1.setMaxAutoAdjustCacheTime(r2)
        L_0x00d9:
            com.tencent.rtmp.TXLivePlayConfig r1 = r8.f152639m
            if (r1 == 0) goto L_0x00e0
            r1.setMinAutoAdjustCacheTime(r2)
        L_0x00e0:
            com.tencent.rtmp.TXLivePlayConfig r1 = r8.f152639m
            if (r1 == 0) goto L_0x00e7
            r1.setCacheTime(r0)
        L_0x00e7:
            f50.d r0 = r8.f152627a
            if (r0 == 0) goto L_0x0119
            com.tencent.rtmp.TXLivePlayConfig r1 = r8.f152639m
            r0.setConfig(r1)
            goto L_0x0119
        L_0x00f1:
            r1 = 3
            if (r3 != r1) goto L_0x0119
            com.tencent.rtmp.TXLivePlayConfig r1 = r8.f152639m
            if (r1 == 0) goto L_0x00fb
            r1.setAutoAdjustCacheTime(r4)
        L_0x00fb:
            com.tencent.rtmp.TXLivePlayConfig r1 = r8.f152639m
            if (r1 == 0) goto L_0x0102
            r1.setMaxAutoAdjustCacheTime(r2)
        L_0x0102:
            com.tencent.rtmp.TXLivePlayConfig r1 = r8.f152639m
            if (r1 == 0) goto L_0x0109
            r1.setMinAutoAdjustCacheTime(r0)
        L_0x0109:
            com.tencent.rtmp.TXLivePlayConfig r1 = r8.f152639m
            if (r1 == 0) goto L_0x0110
            r1.setCacheTime(r0)
        L_0x0110:
            f50.d r0 = r8.f152627a
            if (r0 == 0) goto L_0x0119
            com.tencent.rtmp.TXLivePlayConfig r1 = r8.f152639m
            r0.setConfig(r1)
        L_0x0119:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b50.C54421g.mo75235k():void");
    }
}
