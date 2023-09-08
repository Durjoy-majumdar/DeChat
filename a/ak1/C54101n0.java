package ak1;

import com.tencent.p014mm.autogen.mmdata.rpt.FinderLivePlayErrorStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.thumbplayer.adapter.player.thumbplayer.TPDrmCapability;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import er1.C58739j4;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import o40.C61926c;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110823p;
import sx3.C110826x0;

/* renamed from: ak1.n0 */
public final class C54101n0 {

    /* renamed from: a */
    public static final C54101n0 f151856a = new C54101n0();

    /* renamed from: b */
    public static final C13601g f151857b = C36568h.m40985a(C54107f.f151868d);

    /* renamed from: c */
    public static final Set<Integer> f151858c = C110826x0.m151017e(Integer.valueOf(TXLiveConstants.PLAY_ERR_NET_DISCONNECT), Integer.valueOf(TXLiveConstants.PLAY_ERR_GET_RTMP_ACC_URL_FAIL), Integer.valueOf(TXLiveConstants.PLAY_ERR_FILE_NOT_FOUND), -2304, Integer.valueOf(TXLiveConstants.PLAY_ERR_HLS_KEY), Integer.valueOf(TXLiveConstants.PLAY_ERR_GET_PLAYINFO_FAIL), Integer.valueOf(TXLiveConstants.PLAY_ERR_STREAM_SWITCH_FAIL));

    /* renamed from: d */
    public static final Set<Integer> f151859d = C110826x0.m151017e(2101, 2102, Integer.valueOf(TXLiveConstants.PLAY_WARNING_RECONNECT), Integer.valueOf(TXLiveConstants.PLAY_WARNING_RECV_DATA_LAG), 2105, 2106, Integer.valueOf(TXLiveConstants.PLAY_WARNING_VIDEO_DISCONTINUITY), 2108, 3001, 3002, 3003, 3005);

    /* renamed from: e */
    public static final C13601g f151860e = C36568h.m40985a(C54105d.f151866d);

    /* renamed from: f */
    public static final C13601g f151861f = C36568h.m40985a(C54106e.f151867d);

    /* renamed from: g */
    public static final C13601g f151862g = C36568h.m40985a(C54104c.f151865d);

    /* renamed from: ak1.n0$a */
    public interface C54102a {

        /* renamed from: a */
        public static final /* synthetic */ int f151863a = 0;
    }

    /* renamed from: ak1.n0$b */
    public static final class C54103b<K, V> extends LinkedHashMap<K, V> {

        /* renamed from: d */
        public final int f151864d;

        public C54103b(int i) {
            this.f151864d = i;
        }

        public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
            return super.entrySet();
        }

        public final /* bridge */ Set<K> keySet() {
            return super.keySet();
        }

        public boolean removeEldestEntry(Map.Entry<K, V> entry) {
            return super.size() > this.f151864d;
        }

        public final /* bridge */ int size() {
            return super.size();
        }

        public final /* bridge */ Collection<V> values() {
            return super.values();
        }
    }

    /* renamed from: ak1.n0$c */
    public static final class C54104c extends C87413o implements C32224a<C54103b<Long, Integer>> {

        /* renamed from: d */
        public static final C54104c f151865d = new C54104c();

        public C54104c() {
            super(0);
        }

        public Object invoke() {
            return new C54103b(1);
        }
    }

    /* renamed from: ak1.n0$d */
    public static final class C54105d extends C87413o implements C32224a<C54103b<Long, Integer>> {

        /* renamed from: d */
        public static final C54105d f151866d = new C54105d();

        public C54105d() {
            super(0);
        }

        public Object invoke() {
            return new C54103b(1);
        }
    }

    /* renamed from: ak1.n0$e */
    public static final class C54106e extends C87413o implements C32224a<C54103b<Long, Integer>> {

        /* renamed from: d */
        public static final C54106e f151867d = new C54106e();

        public C54106e() {
            super(0);
        }

        public Object invoke() {
            return new C54103b(2);
        }
    }

    /* renamed from: ak1.n0$f */
    public static final class C54107f extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C54107f f151868d = new C54107f();

        public C54107f() {
            super(0);
        }

        public Object invoke() {
            TPDrmCapability.init(MMApplicationContext.getContext());
            int[] dRMCapabilities = TPDrmCapability.getDRMCapabilities();
            C87412m.m108593f(dRMCapabilities, "drmCapability");
            return Boolean.valueOf(C110823p.m151008x(dRMCapabilities, 0));
        }
    }

    /* renamed from: a */
    public final void mo74794a(long j, String str, int i) {
        C87412m.m108594g(str, "nickname");
        StringBuilder sb = new StringBuilder();
        int i2 = C54102a.f151863a;
        sb.append("onDisconnect");
        sb.append('_');
        sb.append(i);
        mo74798e(sb.toString(), j, str);
        C54109o0.f151877a.mo74841b(false, j, str, i);
    }

    /* renamed from: b */
    public final void mo74795b(long j, String str, int i) {
        C87412m.m108594g(str, "nickname");
        if (C58739j4.f168176a.mo83692U()) {
            Log.m105924i("LiveVisitorPlayReporter", "firstFrameCallback source:" + i + ", liveRoom size:" + ((HashMap) ((C36570n) f151860e).getValue()).size() + ",nearby size:" + ((HashMap) ((C36570n) f151861f).getValue()).size() + ",liveFeed size:" + ((HashMap) ((C36570n) f151862g).getValue()).size() + '!');
        }
        mo74798e("onFirstFrame" + '_' + i, j, str);
        C54109o0.f151877a.mo74841b(true, j, str, i);
        mo74797d(j, i, 2);
    }

    /* renamed from: c */
    public final int mo74796c(long j, int i) {
        Integer num = -1;
        if (i == 1) {
            Integer num2 = (Integer) ((HashMap) ((C36570n) f151860e).getValue()).get(Long.valueOf(j));
            if (num2 != null) {
                num = num2;
            }
            return num.intValue();
        } else if (i == 2) {
            Integer num3 = (Integer) ((HashMap) ((C36570n) f151861f).getValue()).get(Long.valueOf(j));
            if (num3 != null) {
                num = num3;
            }
            return num.intValue();
        } else if (i != 3) {
            return -1;
        } else {
            Integer num4 = (Integer) ((HashMap) ((C36570n) f151862g).getValue()).get(Long.valueOf(j));
            if (num4 != null) {
                num = num4;
            }
            return num.intValue();
        }
    }

    /* renamed from: d */
    public final void mo74797d(long j, int i, int i2) {
        if (i == 1) {
            ((HashMap) ((C36570n) f151860e).getValue()).put(Long.valueOf(j), Integer.valueOf(i2));
        } else if (i == 2) {
            ((HashMap) ((C36570n) f151861f).getValue()).put(Long.valueOf(j), Integer.valueOf(i2));
        } else if (i == 3) {
            ((HashMap) ((C36570n) f151862g).getValue()).put(Long.valueOf(j), Integer.valueOf(i2));
        }
        if (C58739j4.f168176a.mo83692U()) {
            Log.m105924i("LiveVisitorPlayReporter", "recordStage liveRoom size:" + ((HashMap) ((C36570n) f151860e).getValue()).size() + ",nearby size:" + ((HashMap) ((C36570n) f151861f).getValue()).size() + ",liveFeed size:" + ((HashMap) ((C36570n) f151862g).getValue()).size() + '!');
        }
    }

    /* renamed from: e */
    public final void mo74798e(String str, long j, String str2) {
        C87412m.m108594g(str, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        C87412m.m108594g(str2, "nickname");
        FinderLivePlayErrorStruct finderLivePlayErrorStruct = new FinderLivePlayErrorStruct();
        finderLivePlayErrorStruct.f155585i = 4;
        finderLivePlayErrorStruct.f155580d = finderLivePlayErrorStruct.mo86045b(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, str, true);
        finderLivePlayErrorStruct.f155581e = 0;
        finderLivePlayErrorStruct.f155583g = finderLivePlayErrorStruct.mo86045b("liveId", C61926c.m72691p(j), true);
        finderLivePlayErrorStruct.f155584h = finderLivePlayErrorStruct.mo86045b("nickname", str2, true);
        finderLivePlayErrorStruct.mo86054n();
    }

    /* renamed from: f */
    public final void mo74799f(String str, long j, String str2) {
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(str2, "nickname");
        StringBuilder sb = new StringBuilder();
        int i = C54102a.f151863a;
        sb.append("disPreloadLive");
        sb.append('_');
        sb.append(str);
        mo74798e(sb.toString(), j, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002b, code lost:
        r9 = r9.getString(com.tencent.rtmp.TXLiveConstants.EVT_DESCRIPTION);
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo74800g(int r8, android.os.Bundle r9, long r10, java.lang.String r12, int r13) {
        /*
            r7 = this;
            java.lang.String r0 = "nickname"
            gy3.C87412m.m108594g(r12, r0)
            int r1 = r7.mo74796c(r10, r13)
            java.util.Set<java.lang.Integer> r2 = f151858c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L_0x0021
            java.util.Set<java.lang.Integer> r3 = f151859d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x00be
        L_0x0021:
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r3 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getNetType((android.content.Context) r3)
            if (r9 == 0) goto L_0x003d
            java.lang.String r4 = "EVT_MSG"
            java.lang.String r9 = r9.getString(r4)
            if (r9 == 0) goto L_0x003d
            r4 = 0
            java.lang.String r5 = ","
            java.lang.String r6 = ";"
            java.lang.String r9 = z04.C112551y.m153814n(r9, r5, r6, r4)
            goto L_0x003e
        L_0x003d:
            r9 = 0
        L_0x003e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r9)
            java.lang.String r9 = ";netType:"
            r4.append(r9)
            r4.append(r3)
            java.lang.String r9 = r4.toString()
            r3 = 95
            java.lang.String r4 = "_stage"
            if (r2 == 0) goto L_0x0073
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "onPlayError"
            r2.append(r5)
            r2.append(r4)
            r2.append(r1)
            r2.append(r3)
            r2.append(r13)
            java.lang.String r13 = r2.toString()
            goto L_0x008d
        L_0x0073:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "onPlayWarning"
            r2.append(r5)
            r2.append(r4)
            r2.append(r1)
            r2.append(r3)
            r2.append(r13)
            java.lang.String r13 = r2.toString()
        L_0x008d:
            com.tencent.mm.autogen.mmdata.rpt.FinderLivePlayErrorStruct r1 = new com.tencent.mm.autogen.mmdata.rpt.FinderLivePlayErrorStruct
            r1.<init>()
            r2 = 4
            r1.f155585i = r2
            java.lang.String r2 = "scene"
            r3 = 1
            java.lang.String r13 = r1.mo86045b(r2, r13, r3)
            r1.f155580d = r13
            r1.f155581e = r8
            java.lang.String r8 = "errMsg"
            java.lang.String r8 = r1.mo86045b(r8, r9, r3)
            r1.f155582f = r8
            java.lang.String r8 = o40.C61926c.m72691p(r10)
            java.lang.String r9 = "liveId"
            java.lang.String r8 = r1.mo86045b(r9, r8, r3)
            r1.f155583g = r8
            java.lang.String r8 = r1.mo86045b(r0, r12, r3)
            r1.f155584h = r8
            r1.mo86054n()
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ak1.C54101n0.mo74800g(int, android.os.Bundle, long, java.lang.String, int):void");
    }

    /* renamed from: h */
    public final void mo74801h(String str, long j, String str2, int i) {
        C87412m.m108594g(str, "msg");
        C87412m.m108594g(str2, "nickname");
        mo74797d(j, i, 1);
        StringBuilder sb = new StringBuilder(str + ";netType:" + NetStatusUtil.getNetType(MMApplicationContext.getContext()));
        if (((Boolean) ((C36570n) f151857b).getValue()).booleanValue()) {
            sb.append(";supportWidevine");
        }
        FinderLivePlayErrorStruct finderLivePlayErrorStruct = new FinderLivePlayErrorStruct();
        finderLivePlayErrorStruct.f155585i = 4;
        finderLivePlayErrorStruct.f155580d = finderLivePlayErrorStruct.mo86045b(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "pluginStartPlay" + '_' + i, true);
        finderLivePlayErrorStruct.f155581e = 0;
        finderLivePlayErrorStruct.f155582f = finderLivePlayErrorStruct.mo86045b("errMsg", sb.toString(), true);
        finderLivePlayErrorStruct.f155583g = finderLivePlayErrorStruct.mo86045b("liveId", C61926c.m72691p(j), true);
        finderLivePlayErrorStruct.f155584h = finderLivePlayErrorStruct.mo86045b("nickname", str2, true);
        finderLivePlayErrorStruct.mo86054n();
    }
}
