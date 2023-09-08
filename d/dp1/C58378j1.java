package dp1;

import android.util.LongSparseArray;
import cj1.C0539f6;
import cm1.C0740i2;
import com.google.android.gms.common.stats.LoggingConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.finder.feed.model.C2816v;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fe1.C58961d;
import gy3.C8480h;
import gy3.C87412m;
import he1.C59838a;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import jq3.C9508q;
import mr1.C61572r;
import o40.C61926c;
import rs1.C13426s1;
import te3.C49712hj1;
import te3.C64284cg;
import te3.C64441i93;
import te3.C64654qd;
import te3.db4;
import te3.op4;
import vp1.C65834e;

/* renamed from: dp1.j1 */
public final class C58378j1 {

    /* renamed from: j0 */
    public static final C58379a f167214j0 = new C58379a((C8480h) null);

    /* renamed from: A */
    public int f167215A;

    /* renamed from: B */
    public int f167216B;

    /* renamed from: C */
    public long f167217C;

    /* renamed from: D */
    public int f167218D;

    /* renamed from: E */
    public int f167219E;

    /* renamed from: F */
    public int f167220F;

    /* renamed from: G */
    public long f167221G;

    /* renamed from: H */
    public long f167222H;

    /* renamed from: I */
    public long f167223I;

    /* renamed from: J */
    public long f167224J;

    /* renamed from: K */
    public long f167225K;

    /* renamed from: L */
    public int f167226L;

    /* renamed from: M */
    public int f167227M;

    /* renamed from: N */
    public String f167228N;

    /* renamed from: O */
    public Vector<Integer> f167229O;

    /* renamed from: P */
    public int f167230P;

    /* renamed from: Q */
    public int f167231Q;

    /* renamed from: R */
    public String f167232R;

    /* renamed from: S */
    public int f167233S;

    /* renamed from: T */
    public int f167234T;

    /* renamed from: U */
    public String f167235U;

    /* renamed from: V */
    public C0740i2 f167236V;

    /* renamed from: W */
    public int f167237W;

    /* renamed from: X */
    public C59838a f167238X;

    /* renamed from: Y */
    public Vector<Integer> f167239Y;

    /* renamed from: Z */
    public int f167240Z;

    /* renamed from: a */
    public final long f167241a;

    /* renamed from: a0 */
    public long f167242a0;

    /* renamed from: b */
    public final long f167243b;

    /* renamed from: b0 */
    public long f167244b0;

    /* renamed from: c */
    public final FinderItem f167245c;

    /* renamed from: c0 */
    public long f167246c0;

    /* renamed from: d */
    public C9508q f167247d;

    /* renamed from: d0 */
    public int f167248d0;

    /* renamed from: e */
    public boolean f167249e;

    /* renamed from: e0 */
    public int f167250e0;

    /* renamed from: f */
    public C61572r f167251f;

    /* renamed from: f0 */
    public String f167252f0;

    /* renamed from: g */
    public long f167253g;

    /* renamed from: g0 */
    public int f167254g0;

    /* renamed from: h */
    public int f167255h;

    /* renamed from: h0 */
    public int f167256h0;

    /* renamed from: i */
    public long f167257i;

    /* renamed from: i0 */
    public int f167258i0;

    /* renamed from: j */
    public long[] f167259j;

    /* renamed from: k */
    public long[] f167260k;

    /* renamed from: l */
    public int[] f167261l;

    /* renamed from: m */
    public int[] f167262m;

    /* renamed from: n */
    public int f167263n;

    /* renamed from: o */
    public int f167264o;

    /* renamed from: p */
    public int f167265p;

    /* renamed from: q */
    public int f167266q;

    /* renamed from: r */
    public int f167267r;

    /* renamed from: s */
    public int f167268s;

    /* renamed from: t */
    public int f167269t;

    /* renamed from: u */
    public int f167270u;

    /* renamed from: v */
    public int f167271v;

    /* renamed from: w */
    public int f167272w;

    /* renamed from: x */
    public int f167273x;

    /* renamed from: y */
    public int f167274y;

    /* renamed from: z */
    public int f167275z;

    /* renamed from: dp1.j1$a */
    public static final class C58379a {
        public C58379a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo83211a(StringBuffer stringBuffer, String str, Integer num) {
            C87412m.m108594g(stringBuffer, "sb");
            C87412m.m108594g(str, "key");
            if (num == null || num.intValue() != 0) {
                stringBuffer.append(str + '=' + num + 10);
            }
        }

        /* renamed from: b */
        public final void mo83212b(StringBuffer stringBuffer, String str, Long l) {
            C87412m.m108594g(stringBuffer, "sb");
            C87412m.m108594g(str, "key");
            if (l == null || l.longValue() != 0) {
                stringBuffer.append(str + '=' + l + 10);
            }
        }

        /* renamed from: c */
        public final void mo83213c(db4 db4, String str) {
            C87412m.m108594g(db4, LoggingConstants.LOG_FILE_PREFIX);
            C87412m.m108594g(str, "tag");
            StringBuffer stringBuffer = new StringBuffer("[Stats]\n");
            C58379a aVar = C58378j1.f167214j0;
            aVar.mo83212b(stringBuffer, "feedId", Long.valueOf(db4.f182676d));
            if (BuildInfo.DEBUG) {
                stringBuffer.append("strfeedId=" + C61926c.m72691p(db4.f182676d) + 10);
                FinderItem e = C65834e.f189316a.mo89871e(db4.f182676d);
                if (e != null) {
                    stringBuffer.append("nick=" + e.getNickName() + ", desc=" + e.getDebugDescription() + 10);
                }
            }
            op4 op4 = db4.f182678f;
            Integer num = null;
            aVar.mo83211a(stringBuffer, "vidPlayLen", op4 != null ? Integer.valueOf(op4.f184687d) : null);
            op4 op42 = db4.f182678f;
            aVar.mo83211a(stringBuffer, "stayTime", op42 != null ? Integer.valueOf(op42.f184688e) : null);
            op4 op43 = db4.f182678f;
            aVar.mo83212b(stringBuffer, "stayTimeMs", op43 != null ? Long.valueOf(op43.f184689f) : null);
            op4 op44 = db4.f182678f;
            aVar.mo83212b(stringBuffer, "vidPlayTimeMs", op44 != null ? Long.valueOf(op44.f184690g) : null);
            op4 op45 = db4.f182678f;
            aVar.mo83212b(stringBuffer, "vidPlayingTimeMs", op45 != null ? Long.valueOf(op45.f184691h) : null);
            op4 op46 = db4.f182678f;
            aVar.mo83212b(stringBuffer, "exposeTimeMs", op46 != null ? Long.valueOf(op46.f184692i) : null);
            op4 op47 = db4.f182678f;
            aVar.mo83212b(stringBuffer, "startPlayTime", op47 != null ? Long.valueOf(op47.f184693j) : null);
            op4 op48 = db4.f182678f;
            aVar.mo83212b(stringBuffer, "endPlayTime", op48 != null ? Long.valueOf(op48.f184694n) : null);
            op4 op49 = db4.f182678f;
            aVar.mo83212b(stringBuffer, "lastPlayTime", op49 != null ? Long.valueOf(op49.f184695o) : null);
            op4 op410 = db4.f182678f;
            aVar.mo83212b(stringBuffer, "stopTimes", op410 != null ? Long.valueOf(op410.f184696p) : null);
            op4 op411 = db4.f182678f;
            aVar.mo83211a(stringBuffer, "autoPlay", op411 != null ? Integer.valueOf(op411.f184697q) : null);
            C64441i93 i932 = db4.f182679g;
            aVar.mo83211a(stringBuffer, FirebaseAnalytics.C113378a.SHARE, i932 != null ? Integer.valueOf(i932.f183656n) : null);
            C64441i93 i933 = db4.f182679g;
            aVar.mo83211a(stringBuffer, "forward_times", i933 != null ? Integer.valueOf(i933.f183653h) : null);
            C64441i93 i934 = db4.f182679g;
            aVar.mo83211a(stringBuffer, "feed_stay_time", i934 != null ? Integer.valueOf(i934.f183651f) : null);
            C64441i93 i935 = db4.f182679g;
            aVar.mo83211a(stringBuffer, "vid_replay_times", i935 != null ? Integer.valueOf(i935.f183652g) : null);
            C64441i93 i936 = db4.f182679g;
            aVar.mo83211a(stringBuffer, "max_vid_play_progress", i936 != null ? Integer.valueOf(i936.f183650e) : null);
            C64441i93 i937 = db4.f182679g;
            aVar.mo83211a(stringBuffer, "pageTurn", i937 != null ? Integer.valueOf(i937.f183649d) : null);
            C64441i93 i938 = db4.f182679g;
            aVar.mo83211a(stringBuffer, "clickComment", i938 != null ? Integer.valueOf(i938.f183654i) : null);
            C64441i93 i939 = db4.f182679g;
            aVar.mo83211a(stringBuffer, "clickHead", i939 != null ? Integer.valueOf(i939.f183655j) : null);
            C64441i93 i9310 = db4.f182679g;
            aVar.mo83211a(stringBuffer, "likeStatus", i9310 != null ? Integer.valueOf(i9310.f183658p) : null);
            C64441i93 i9311 = db4.f182679g;
            aVar.mo83211a(stringBuffer, "followStatus", i9311 != null ? Integer.valueOf(i9311.f183657o) : null);
            C64441i93 i9312 = db4.f182679g;
            aVar.mo83211a(stringBuffer, "favStatus", i9312 != null ? Integer.valueOf(i9312.f183660r) : null);
            C64441i93 i9313 = db4.f182679g;
            aVar.mo83211a(stringBuffer, "notInterestAction", i9313 != null ? Integer.valueOf(i9313.f183664v) : null);
            C64441i93 i9314 = db4.f182679g;
            aVar.mo83211a(stringBuffer, "fastSlip", i9314 != null ? Integer.valueOf(i9314.f183661s) : null);
            C64441i93 i9315 = db4.f182679g;
            aVar.mo83211a(stringBuffer, "sortId", i9315 != null ? Integer.valueOf(i9315.f183662t) : null);
            C64441i93 i9316 = db4.f182679g;
            aVar.mo83211a(stringBuffer, "maxVidPlayLen", i9316 != null ? Integer.valueOf(i9316.f183663u) : null);
            C64441i93 i9317 = db4.f182679g;
            aVar.mo83211a(stringBuffer, "clickTopicTimes", i9317 != null ? Integer.valueOf(i9317.f183665w) : null);
            C64441i93 i9318 = db4.f182679g;
            aVar.mo83211a(stringBuffer, "expandTextTimes", i9318 != null ? Integer.valueOf(i9318.f183666x) : null);
            C64441i93 i9319 = db4.f182679g;
            aVar.mo83211a(stringBuffer, "shareMomentTimes", i9319 != null ? Integer.valueOf(i9319.f183667y) : null);
            C64441i93 i9320 = db4.f182679g;
            aVar.mo83211a(stringBuffer, "clickPoiTimes", i9320 != null ? Integer.valueOf(i9320.f183668z) : null);
            C64441i93 i9321 = db4.f182679g;
            aVar.mo83211a(stringBuffer, "collapseTextTimes", i9321 != null ? Integer.valueOf(i9321.f183641A) : null);
            C64441i93 i9322 = db4.f182679g;
            aVar.mo83211a(stringBuffer, "commentLikeTimes", i9322 != null ? Integer.valueOf(i9322.f183642B) : null);
            C64441i93 i9323 = db4.f182679g;
            aVar.mo83211a(stringBuffer, "clickFeedMenu", i9323 != null ? Integer.valueOf(i9323.f183643C) : null);
            C64441i93 i9324 = db4.f182679g;
            aVar.mo83211a(stringBuffer, "complainTimes", i9324 != null ? Integer.valueOf(i9324.f183644D) : null);
            aVar.mo83212b(stringBuffer, "actionTimeMs", Long.valueOf(db4.f182682j));
            aVar.mo83211a(stringBuffer, "feedScene", Integer.valueOf(db4.f182683n));
            String str2 = db4.f182684o;
            if (str2 != null) {
                num = Integer.valueOf(str2.length());
            }
            aVar.mo83211a(stringBuffer, "sessionBuffer", num);
            Log.m105924i(str, stringBuffer.toString());
        }

        /* renamed from: d */
        public final db4 mo83214d(C58378j1 j1Var, C49712hj1 hj12) {
            String str;
            String str2;
            C0539f6 f6Var;
            long longValue;
            C64441i93 i932;
            C58378j1 j1Var2 = j1Var;
            C49712hj1 hj13 = hj12;
            C87412m.m108594g(j1Var2, "record");
            C87412m.m108594g(hj13, "contextObj");
            db4 db4 = new db4();
            FinderItem finderItem = j1Var2.f167245c;
            int i = 0;
            if (finderItem != null && !finderItem.isUrlValid()) {
                Log.m105924i("Finder.FinderSingleFeedRecord", "[trans2Stats] is invalid stats feedId=" + C61926c.m72691p(j1Var2.f167241a));
                return db4;
            }
            BitSet bitSet = new BitSet(64);
            db4.f182676d = j1Var2.f167241a;
            FinderItem finderItem2 = j1Var2.f167245c;
            if (finderItem2 == null || (str = finderItem2.getObjectNonceId()) == null) {
                str = "";
            }
            db4.f182680h = str;
            db4.f182677e = new C64654qd();
            db4.f182678f = new op4();
            db4.f182679g = new C64441i93();
            FinderItem finderItem3 = j1Var2.f167245c;
            if (finderItem3 == null || (str2 = finderItem3.field_username) == null) {
                str2 = "";
            }
            db4.f182681i = str2;
            db4.f182682j = j1Var2.f167253g;
            C2816v vVar = C2816v.f14072a;
            String str3 = null;
            String str4 = finderItem3 != null ? finderItem3.field_username : null;
            if (str4 == null) {
                str4 = "";
            }
            ConcurrentHashMap<String, C0539f6> concurrentHashMap = C2816v.f14074c;
            synchronized (concurrentHashMap) {
                f6Var = concurrentHashMap.get(str4);
            }
            if (f6Var != null) {
                db4.f182673B = true;
                db4.f182674C = j1Var2.f167257i - j1Var2.f167243b;
                FinderObject finderObject = f6Var.f1307a;
                db4.f182675D = finderObject != null ? finderObject.f164794id : 0;
                Log.m105924i("Finder.FinderSingleFeedRecord", "trans2State live feed, tips: " + db4.f182673B + ", remain time: " + (db4.f182674C / ((long) 1000)) + ", id: " + db4.f182675D);
            } else {
                db4.f182673B = false;
            }
            if (hj13.f134675i == 20) {
                ConcurrentSkipListSet<Long> concurrentSkipListSet = C13426s1.f38005t;
                db4.f182683n = C13426s1.f38005t.contains(Long.valueOf(db4.f182676d)) ? 2 : 1;
            }
            db4.f182684o = ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83281Cu(j1Var2.f167241a, hj13.f134675i);
            C65834e eVar = C65834e.f189316a;
            int i2 = hj13.f134675i;
            long j = j1Var2.f167241a;
            eVar.getClass();
            HashMap<Integer, LongSparseArray<Long>> hashMap = C65834e.f189318c;
            synchronized (hashMap) {
                Integer valueOf = Integer.valueOf(i2);
                LongSparseArray<Long> longSparseArray = hashMap.get(valueOf);
                if (longSparseArray == null) {
                    longSparseArray = new LongSparseArray<>();
                    hashMap.put(valueOf, longSparseArray);
                }
                Long l = (Long) longSparseArray.get(j);
                longValue = l == null ? 0 : l.longValue();
            }
            db4.f182687r = longValue;
            db4.f182692w = j1Var2.f167243b;
            int i3 = j1Var2.f167265p;
            for (int i4 = 0; i4 < i3; i4++) {
                bitSet.set(i4, true);
            }
            int i5 = j1Var2.f167267r;
            if (i5 < 5) {
                bitSet.set(9, true);
            } else if (i5 < 10) {
                bitSet.set(10, true);
            } else if (i5 < 20) {
                bitSet.set(11, true);
            } else if (i5 < 30) {
                bitSet.set(12, true);
            } else if (i5 < 40) {
                bitSet.set(13, true);
            } else if (i5 < 50) {
                bitSet.set(14, true);
            } else if (i5 < 60) {
                bitSet.set(15, true);
            } else if (i5 < 70) {
                bitSet.set(16, true);
            } else if (i5 < 80) {
                bitSet.set(17, true);
            } else if (i5 < 90) {
                bitSet.set(18, true);
            } else if (i5 < 100) {
                bitSet.set(19, true);
            } else {
                bitSet.set(20, true);
            }
            float f = ((float) j1Var2.f167225K) / 1000.0f;
            if (f < 0.5f) {
                bitSet.set(21, true);
            } else if (f < 1.0f) {
                bitSet.set(22, true);
            } else if (f < 2.0f) {
                bitSet.set(23, true);
            } else if (f < 3.0f) {
                bitSet.set(24, true);
            } else if (f < 5.0f) {
                bitSet.set(25, true);
            } else if (f < 10.0f) {
                bitSet.set(26, true);
            } else if (f < 20.0f) {
                bitSet.set(27, true);
            } else if (f < 30.0f) {
                bitSet.set(28, true);
            } else if (f < 40.0f) {
                bitSet.set(29, true);
            } else if (f < 50.0f) {
                bitSet.set(30, true);
            } else {
                bitSet.set(31, true);
            }
            int i6 = 0;
            for (int i7 : j1Var2.f167262m) {
                if (i7 > i6) {
                    i6 = i7;
                }
            }
            if (i6 == 0) {
                bitSet.set(32, true);
            } else if (i6 == 1) {
                bitSet.set(33, true);
            } else if (i6 == 2) {
                bitSet.set(34, true);
            } else if (i6 == 3) {
                bitSet.set(35, true);
            } else if (i6 == 4) {
                bitSet.set(36, true);
            } else if (i6 != 5) {
                bitSet.set(38, true);
            } else {
                bitSet.set(37, true);
            }
            long j2 = bitSet.toLongArray()[0];
            C64654qd qdVar = db4.f182677e;
            if (qdVar != null) {
                qdVar.f184997d = j2;
            }
            op4 op4 = db4.f182678f;
            if (op4 != null) {
                op4.f184688e = (int) f;
            }
            if (op4 != null) {
                op4.f184687d = j1Var2.f167234T;
            }
            if (op4 != null) {
                op4.f184689f = j1Var2.f167225K;
            }
            if (op4 != null) {
                op4.f184690g = j1Var2.f167223I;
            }
            if (op4 != null) {
                op4.f184691h = j1Var2.f167221G;
            }
            if (op4 != null) {
                op4.f184692i = j1Var2.f167225K;
                op4.f184693j = j1Var2.f167243b;
                op4.f184694n = j1Var2.f167257i;
                op4.f184695o = j1Var2.f167217C;
                op4.f184696p = (long) j1Var2.f167216B;
                op4.f184697q = 1;
            }
            C64441i93 i933 = db4.f182679g;
            if (i933 != null) {
                i933.f183651f = (int) f;
            }
            if (i933 != null) {
                i933.f183652g = i6;
            }
            if (i933 != null) {
                i933.f183650e = j1Var2.f167267r;
            }
            long[] jArr = j1Var2.f167259j;
            int length = jArr.length;
            int i8 = 0;
            int i9 = 0;
            while (i8 < length) {
                int i15 = i9 + 1;
                if (jArr[i8] > 0 && (i932 = db4.f182679g) != null) {
                    i932.f183649d = i9;
                }
                i8++;
                i9 = i15;
            }
            C64441i93 i934 = db4.f182679g;
            if (i934 != null) {
                i934.f183653h = j1Var2.f167268s;
            }
            if (i934 != null) {
                i934.f183656n = j1Var2.f167268s > 0 ? 1 : 0;
            }
            if (i934 != null) {
                i934.f183654i = j1Var2.f167269t;
            }
            if (i934 != null) {
                i934.f183655j = j1Var2.f167270u;
            }
            if (i934 != null) {
                i934.f183664v = j1Var2.f167220F;
            }
            if (i934 != null) {
                i934.f183662t = j1Var2.f167255h;
            }
            if (i934 != null) {
                i934.f183665w = j1Var2.f167274y;
            }
            if (i934 != null) {
                i934.f183666x = j1Var2.f167272w;
            }
            if (i934 != null) {
                i934.f183667y = j1Var2.f167273x;
            }
            if (i934 != null) {
                i934.f183668z = j1Var2.f167274y;
            }
            if (i934 != null) {
                i934.f183641A = j1Var2.f167275z;
            }
            if (i934 != null) {
                i934.f183642B = j1Var2.f167215A;
            }
            if (i934 != null) {
                i934.f183643C = j1Var2.f167218D;
            }
            if (i934 != null) {
                i934.f183644D = j1Var2.f167219E;
            }
            if (i934 != null) {
                i934.f183646F = j1Var2.f167227M;
            }
            if (i934 != null) {
                i934.f183647G = j1Var2.f167267r;
            }
            if (i934 != null) {
                i934.f183648H = j1Var2.f167237W;
            }
            Vector<Integer> vector = j1Var2.f167239Y;
            synchronized (vector) {
                for (Integer intValue : vector) {
                    db4.f182672A.add(Long.valueOf((long) intValue.intValue()));
                }
            }
            FinderItem finderItem4 = j1Var2.f167245c;
            if (finderItem4 != null) {
                C64441i93 i935 = db4.f182679g;
                if (i935 != null) {
                    i935.f183658p = finderItem4.getLikeFlag() != 0 ? 1 : 0;
                }
                C64441i93 i936 = db4.f182679g;
                if (i936 != null) {
                    C58961d.C58963b bVar = C58961d.f168673a;
                    String userName = finderItem4.getUserName();
                    C64284cg bizInfo = finderItem4.getBizInfo();
                    if (bizInfo != null) {
                        str3 = bizInfo.f182468d;
                    }
                    i936.f183657o = C58961d.C58963b.m68836h(bVar, userName, str3, false, false, 12, (Object) null) ? 1 : 0;
                }
                C64441i93 i937 = db4.f182679g;
                if (i937 != null) {
                    if (finderItem4.getFavFlag() == 1) {
                        i = 1;
                    }
                    i937.f183660r = i;
                }
            }
            C64441i93 i938 = db4.f182679g;
            if (i938 != null) {
                i938.f183663u = j1Var2.f167266q;
            }
            return db4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0018, code lost:
        r2 = r5.getMediaList();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C58378j1(long r1, long r3, com.tencent.p014mm.plugin.finder.storage.FinderItem r5, jq3.C9508q r6, boolean r7, mr1.C61572r r8) {
        /*
            r0 = this;
            r0.<init>()
            r0.f167241a = r1
            r0.f167243b = r3
            r0.f167245c = r5
            r0.f167247d = r6
            r0.f167249e = r7
            r0.f167251f = r8
            long r1 = eb0.C31543z5.m39453c()
            r0.f167253g = r1
            r1 = 0
            if (r5 == 0) goto L_0x0023
            java.util.LinkedList r2 = r5.getMediaList()
            if (r2 == 0) goto L_0x0023
            int r2 = r2.size()
            goto L_0x0024
        L_0x0023:
            r2 = 0
        L_0x0024:
            r3 = 9
            int r2 = java.lang.Math.max(r2, r3)
            long[] r4 = new long[r2]
            r5 = 0
        L_0x002d:
            r6 = 0
            if (r5 >= r2) goto L_0x0036
            r4[r5] = r6
            int r5 = r5 + 1
            goto L_0x002d
        L_0x0036:
            r0.f167259j = r4
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r0.f167245c
            if (r2 == 0) goto L_0x0047
            java.util.LinkedList r2 = r2.getMediaList()
            if (r2 == 0) goto L_0x0047
            int r2 = r2.size()
            goto L_0x0048
        L_0x0047:
            r2 = 0
        L_0x0048:
            int r2 = java.lang.Math.max(r2, r3)
            long[] r4 = new long[r2]
            r5 = 0
        L_0x004f:
            if (r5 >= r2) goto L_0x0056
            r4[r5] = r6
            int r5 = r5 + 1
            goto L_0x004f
        L_0x0056:
            r0.f167260k = r4
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r0.f167245c
            if (r2 == 0) goto L_0x0067
            java.util.LinkedList r2 = r2.getMediaList()
            if (r2 == 0) goto L_0x0067
            int r2 = r2.size()
            goto L_0x0068
        L_0x0067:
            r2 = 0
        L_0x0068:
            int r2 = java.lang.Math.max(r2, r3)
            int[] r4 = new int[r2]
            r5 = 0
        L_0x006f:
            if (r5 >= r2) goto L_0x0076
            r4[r5] = r1
            int r5 = r5 + 1
            goto L_0x006f
        L_0x0076:
            r0.f167261l = r4
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r0.f167245c
            if (r2 == 0) goto L_0x0087
            java.util.LinkedList r2 = r2.getMediaList()
            if (r2 == 0) goto L_0x0087
            int r2 = r2.size()
            goto L_0x0088
        L_0x0087:
            r2 = 0
        L_0x0088:
            int r2 = java.lang.Math.max(r2, r3)
            int[] r3 = new int[r2]
            r4 = 0
        L_0x008f:
            if (r4 >= r2) goto L_0x0096
            r3[r4] = r1
            int r4 = r4 + 1
            goto L_0x008f
        L_0x0096:
            r0.f167262m = r3
            r2 = 1
            r0.f167265p = r2
            java.lang.String r2 = ""
            r0.f167228N = r2
            java.util.Vector r3 = new java.util.Vector
            r3.<init>()
            r0.f167229O = r3
            r0.f167232R = r2
            r0.f167235U = r2
            java.util.Vector r3 = new java.util.Vector
            r3.<init>()
            r0.f167239Y = r3
            r0.f167252f0 = r2
            long[] r2 = r0.f167259j
            long r3 = r0.f167243b
            r2[r1] = r3
            mr1.r r1 = r0.f167251f
            if (r1 == 0) goto L_0x00f1
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, mr1.r$a> r1 = r1.f174999d
            if (r1 == 0) goto L_0x00f1
            long r2 = r0.f167241a
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r1 = r1.get(r2)
            mr1.r$a r1 = (mr1.C61572r.C61573a) r1
            if (r1 == 0) goto L_0x00f1
            long r2 = r0.f167243b
            r0.f167224J = r2
            boolean r1 = r1.f175051l0
            if (r1 == 0) goto L_0x00d9
            r0.f167222H = r2
        L_0x00d9:
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r2 = "audio"
            java.lang.Object r1 = r1.getSystemService(r2)
            java.lang.String r2 = "null cannot be cast to non-null type android.media.AudioManager"
            gy3.C87412m.m108592e(r1, r2)
            android.media.AudioManager r1 = (android.media.AudioManager) r1
            r2 = 3
            int r1 = r1.getStreamVolume(r2)
            r0.f167230P = r1
        L_0x00f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dp1.C58378j1.<init>(long, long, com.tencent.mm.plugin.finder.storage.FinderItem, jq3.q, boolean, mr1.r):void");
    }

    /* renamed from: I */
    public static /* synthetic */ void m67639I(C58378j1 j1Var, C61572r rVar, int i, Object obj) {
        if ((i & 1) != 0) {
            rVar = null;
        }
        j1Var.mo83151H(rVar);
    }

    /* renamed from: A */
    public final long mo83144A() {
        return this.f167224J;
    }

    /* renamed from: B */
    public final long mo83145B() {
        return this.f167221G;
    }

    /* renamed from: C */
    public final long mo83146C() {
        return this.f167222H;
    }

    /* renamed from: D */
    public final int mo83147D() {
        return this.f167268s;
    }

    /* renamed from: E */
    public final long mo83148E() {
        return this.f167243b;
    }

    /* renamed from: F */
    public final int mo83149F() {
        return this.f167258i0;
    }

    /* renamed from: G */
    public final long[] mo83150G() {
        return this.f167260k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        r0 = (te3.C64689rq2) sx3.C110818d0.m150916N((r0 = r0.getMediaList()));
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo83151H(mr1.C61572r r12) {
        /*
            r11 = this;
            long r0 = r11.f167257i
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x000e
            long r0 = eb0.C31543z5.m39453c()
            r11.f167257i = r0
        L_0x000e:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r11.f167245c
            r1 = 0
            if (r0 == 0) goto L_0x0024
            java.util.LinkedList r0 = r0.getMediaList()
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = sx3.C110818d0.m150916N(r0)
            te3.rq2 r0 = (te3.C64689rq2) r0
            if (r0 == 0) goto L_0x0024
            int r0 = r0.f185269g
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            r11.f167234T = r0
            long r4 = r11.f167257i
            long r6 = r11.f167243b
            long r4 = r4 - r6
            r11.f167225K = r4
            if (r12 == 0) goto L_0x0191
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, mr1.r$a> r12 = r12.f174999d
            if (r12 == 0) goto L_0x0191
            long r4 = r11.f167241a
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            java.lang.Object r12 = r12.get(r0)
            mr1.r$a r12 = (mr1.C61572r.C61573a) r12
            if (r12 == 0) goto L_0x0191
            long r4 = r11.f167224J
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0050
            long r6 = r11.f167223I
            long r8 = r11.f167257i
            long r8 = r8 - r4
            long r6 = r6 + r8
            r11.f167223I = r6
        L_0x0050:
            long r4 = r11.f167222H
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x005e
            long r2 = r11.f167221G
            long r6 = r11.f167257i
            long r6 = r6 - r4
            long r2 = r2 + r6
            r11.f167221G = r2
        L_0x005e:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r2 = "audio"
            java.lang.Object r0 = r0.getSystemService(r2)
            java.lang.String r2 = "null cannot be cast to non-null type android.media.AudioManager"
            gy3.C87412m.m108592e(r0, r2)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            r2 = 3
            int r0 = r0.getStreamVolume(r2)
            r11.f167231Q = r0
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r3 = "audio"
            java.lang.Object r0 = r0.getSystemService(r3)
            java.lang.String r3 = "null cannot be cast to non-null type android.media.AudioManager"
            gy3.C87412m.m108592e(r0, r3)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            int r0 = r0.getStreamMaxVolume(r2)
            int r2 = r11.f167230P
            int r3 = r11.f167231Q
            if (r2 == r3) goto L_0x0093
            r2 = 1
            goto L_0x0094
        L_0x0093:
            r2 = 0
        L_0x0094:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r4 = r11.f167230P
            int r4 = r4 * 100
            int r4 = r4 / r0
            r3.append(r4)
            r4 = 35
            r3.append(r4)
            int r5 = r11.f167231Q
            int r5 = r5 * 100
            int r5 = r5 / r0
            r3.append(r5)
            r3.append(r4)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            r11.f167232R = r0
            java.lang.Class<dp1.y0> r0 = dp1.C58417y0.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            dp1.y0 r0 = (dp1.C58417y0) r0
            int r0 = r0.mo83336jw()
            r11.f167233S = r0
            java.util.Vector<java.lang.Integer> r0 = r11.f167229O
            monitor-enter(r0)
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x018e }
        L_0x00cf:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x018e }
            if (r3 == 0) goto L_0x00f2
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x018e }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x018e }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x018e }
            r5.<init>()     // Catch:{ all -> 0x018e }
            java.lang.String r6 = r11.f167228N     // Catch:{ all -> 0x018e }
            r5.append(r6)     // Catch:{ all -> 0x018e }
            r5.append(r3)     // Catch:{ all -> 0x018e }
            r5.append(r4)     // Catch:{ all -> 0x018e }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x018e }
            r11.f167228N = r3     // Catch:{ all -> 0x018e }
            goto L_0x00cf
        L_0x00f2:
            monitor-exit(r0)
            wp1.g r0 = wp1.C66167g.f190173a
            java.lang.String r2 = r12.f175032c
            r3 = 2
            r4 = 0
            cm1.f1 r0 = wp1.C66167g.m78055d(r0, r2, r1, r3, r4)
            java.lang.String r0 = r0.field_fileFormat
            if (r0 != 0) goto L_0x0103
            java.lang.String r0 = ""
        L_0x0103:
            pl1.u0 r2 = r12.f175040g
            if (r2 == 0) goto L_0x012c
            java.lang.Class<dy.f> r3 = p500dy.C97560f.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            dy.f r3 = (p500dy.C97560f) r3
            pl1.r0 r2 = (pl1.C62367r0) r2
            java.lang.String r2 = r2.getPath()
            com.tencent.mm.plugin.sight.base.a r2 = r3.Z40(r2)
            if (r2 == 0) goto L_0x0126
            int r1 = r2.f273444b
            int r3 = r2.f273449g
            int r2 = r2.f273447e
            r10 = r2
            r2 = r1
            r1 = r3
            r3 = r10
            goto L_0x0128
        L_0x0126:
            r2 = 0
            r3 = 0
        L_0x0128:
            r10 = r2
            r2 = r1
            r1 = r10
            goto L_0x012e
        L_0x012c:
            r2 = 0
            r3 = 0
        L_0x012e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r12.f175047j0
            r4.append(r5)
            r5 = 59
            r4.append(r5)
            r4.append(r1)
            r4.append(r5)
            r4.append(r0)
            r4.append(r5)
            r4.append(r2)
            r4.append(r5)
            r4.append(r3)
            r4.append(r5)
            float r0 = r12.f175055n0
            r4.append(r0)
            r4.append(r5)
            float r0 = r12.f175057o0
            r4.append(r0)
            r4.append(r5)
            java.lang.String r0 = r4.toString()
            r11.f167235U = r0
            int r0 = r12.f175072w
            r11.f167240Z = r0
            long r2 = r12.f175018Q
            r11.f167242a0 = r2
            long r2 = r12.f175007F
            r11.f167244b0 = r2
            long r2 = r12.f175050l
            r11.f167246c0 = r2
            int r0 = r12.f175056o
            r11.f167248d0 = r0
            int r0 = r12.f175058p
            r11.f167250e0 = r0
            java.lang.String r0 = r12.f175041g0
            r11.f167252f0 = r0
            int r12 = r12.f175002A
            r11.f167254g0 = r12
            r11.f167256h0 = r1
            goto L_0x0191
        L_0x018e:
            r12 = move-exception
            monitor-exit(r0)
            throw r12
        L_0x0191:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dp1.C58378j1.mo83151H(mr1.r):void");
    }

    /* renamed from: J */
    public final void mo83152J(C59838a aVar) {
        this.f167238X = aVar;
    }

    /* renamed from: K */
    public final void mo83153K(int i) {
        this.f167270u = i;
    }

    /* renamed from: L */
    public final void mo83154L(int i) {
        this.f167269t = i;
    }

    /* renamed from: M */
    public final void mo83155M(int i) {
        this.f167272w = i;
    }

    /* renamed from: N */
    public final void mo83156N(int i) {
        this.f167271v = i;
    }

    /* renamed from: O */
    public final void mo83157O(int i) {
        this.f167218D = i;
    }

    /* renamed from: P */
    public final void mo83158P(int i) {
        this.f167274y = i;
    }

    /* renamed from: Q */
    public final void mo83159Q(int i) {
        this.f167273x = i;
    }

    /* renamed from: R */
    public final void mo83160R(int i) {
        this.f167275z = i;
    }

    /* renamed from: S */
    public final void mo83161S(int i) {
        this.f167215A = i;
    }

    /* renamed from: T */
    public final void mo83162T(int i) {
        this.f167219E = i;
    }

    /* renamed from: U */
    public final void mo83163U(int i) {
        this.f167255h = i;
    }

    /* renamed from: V */
    public final void mo83164V(int i) {
        this.f167263n = i;
    }

    /* renamed from: W */
    public final void mo83165W(long j) {
        this.f167217C = j;
    }

    /* renamed from: X */
    public final void mo83166X(int i) {
        this.f167237W = i;
    }

    /* renamed from: Y */
    public final void mo83167Y(int i) {
        this.f167265p = i;
    }

    /* renamed from: Z */
    public final void mo83168Z(int i) {
        this.f167266q = i;
    }

    /* renamed from: a */
    public final C58378j1 mo83169a() {
        C58378j1 j1Var = new C58378j1(this.f167241a, this.f167243b, this.f167245c, this.f167247d, this.f167249e, this.f167251f);
        j1Var.f167253g = this.f167253g;
        j1Var.f167255h = this.f167255h;
        j1Var.f167257i = this.f167257i;
        j1Var.f167259j = this.f167259j;
        j1Var.f167260k = this.f167260k;
        j1Var.f167261l = this.f167261l;
        j1Var.f167262m = this.f167262m;
        j1Var.f167263n = this.f167263n;
        j1Var.f167264o = this.f167264o;
        j1Var.f167265p = this.f167265p;
        j1Var.f167266q = this.f167266q;
        j1Var.f167267r = this.f167267r;
        j1Var.f167268s = this.f167268s;
        j1Var.f167269t = this.f167269t;
        j1Var.f167270u = this.f167270u;
        j1Var.f167271v = this.f167271v;
        j1Var.f167272w = this.f167272w;
        j1Var.f167273x = this.f167273x;
        j1Var.f167274y = this.f167274y;
        j1Var.f167275z = this.f167275z;
        j1Var.f167215A = this.f167215A;
        j1Var.f167216B = this.f167216B;
        j1Var.f167218D = this.f167218D;
        j1Var.f167219E = this.f167219E;
        j1Var.f167220F = this.f167220F;
        j1Var.f167221G = this.f167221G;
        j1Var.f167222H = this.f167222H;
        j1Var.f167223I = this.f167223I;
        j1Var.f167224J = this.f167224J;
        j1Var.f167225K = this.f167225K;
        j1Var.f167226L = this.f167226L;
        j1Var.f167227M = this.f167227M;
        j1Var.f167228N = this.f167228N;
        j1Var.f167229O = this.f167229O;
        j1Var.f167230P = this.f167230P;
        j1Var.f167231Q = this.f167231Q;
        j1Var.f167232R = this.f167232R;
        j1Var.f167233S = this.f167233S;
        j1Var.f167234T = this.f167234T;
        j1Var.f167237W = this.f167237W;
        j1Var.f167239Y = this.f167239Y;
        j1Var.f167258i0 = this.f167258i0;
        return j1Var;
    }

    /* renamed from: a0 */
    public final void mo83170a0(int i) {
        this.f167267r = i;
    }

    /* renamed from: b */
    public final C59838a mo83171b() {
        return this.f167238X;
    }

    /* renamed from: b0 */
    public final void mo83172b0(int i) {
        this.f167264o = i;
    }

    /* renamed from: c */
    public final long[] mo83173c() {
        return this.f167259j;
    }

    /* renamed from: c0 */
    public final void mo83174c0(int i) {
        this.f167220F = i;
    }

    /* renamed from: d */
    public final int mo83175d() {
        return this.f167270u;
    }

    /* renamed from: d0 */
    public final void mo83176d0(int i) {
        this.f167226L = i;
    }

    /* renamed from: e */
    public final int mo83177e() {
        return this.f167269t;
    }

    /* renamed from: e0 */
    public final void mo83178e0(int i) {
        this.f167216B = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58378j1)) {
            return false;
        }
        C58378j1 j1Var = (C58378j1) obj;
        return this.f167241a == j1Var.f167241a && this.f167243b == j1Var.f167243b && C87412m.m108589b(this.f167245c, j1Var.f167245c) && C87412m.m108589b(this.f167247d, j1Var.f167247d) && this.f167249e == j1Var.f167249e && C87412m.m108589b(this.f167251f, j1Var.f167251f);
    }

    /* renamed from: f */
    public final int mo83180f() {
        return this.f167272w;
    }

    /* renamed from: f0 */
    public final void mo83181f0(long j) {
        this.f167223I = j;
    }

    /* renamed from: g */
    public final int mo83182g() {
        return this.f167271v;
    }

    /* renamed from: g0 */
    public final void mo83183g0(long j) {
        this.f167224J = j;
    }

    /* renamed from: h */
    public final int mo83184h() {
        return this.f167218D;
    }

    /* renamed from: h0 */
    public final void mo83185h0(long j) {
        this.f167221G = j;
    }

    public int hashCode() {
        long j = this.f167241a;
        long j2 = this.f167243b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        FinderItem finderItem = this.f167245c;
        int i2 = 0;
        int hashCode = (i + (finderItem == null ? 0 : finderItem.hashCode())) * 31;
        C9508q qVar = this.f167247d;
        int hashCode2 = (hashCode + (qVar == null ? 0 : qVar.hashCode())) * 31;
        boolean z = this.f167249e;
        if (z) {
            z = true;
        }
        int i3 = (hashCode2 + (z ? 1 : 0)) * 31;
        C61572r rVar = this.f167251f;
        if (rVar != null) {
            i2 = rVar.hashCode();
        }
        return i3 + i2;
    }

    /* renamed from: i */
    public final int mo83187i() {
        return this.f167274y;
    }

    /* renamed from: i0 */
    public final void mo83188i0(long j) {
        this.f167222H = j;
    }

    /* renamed from: j */
    public final int mo83189j() {
        return this.f167273x;
    }

    /* renamed from: j0 */
    public final void mo83190j0(C0740i2 i2Var) {
        this.f167236V = i2Var;
    }

    /* renamed from: k */
    public final int mo83191k() {
        return this.f167275z;
    }

    /* renamed from: k0 */
    public final void mo83192k0(int i) {
        this.f167227M = i;
    }

    /* renamed from: l */
    public final int mo83193l() {
        return this.f167215A;
    }

    /* renamed from: l0 */
    public final void mo83194l0(int i) {
        this.f167268s = i;
    }

    /* renamed from: m */
    public final int mo83195m() {
        return this.f167219E;
    }

    /* renamed from: m0 */
    public final void mo83196m0(int i) {
        this.f167258i0 = i;
    }

    /* renamed from: n */
    public final FinderItem mo83197n() {
        return this.f167245c;
    }

    /* renamed from: o */
    public final long mo83198o() {
        return this.f167241a;
    }

    /* renamed from: p */
    public final int mo83199p() {
        return this.f167263n;
    }

    /* renamed from: q */
    public final long mo83200q() {
        return this.f167217C;
    }

    /* renamed from: r */
    public final int mo83201r() {
        return this.f167265p;
    }

    /* renamed from: s */
    public final int mo83202s() {
        return this.f167266q;
    }

    /* renamed from: t */
    public final int mo83203t() {
        return this.f167267r;
    }

    public String toString() {
        return "FinderSingleFeedRecord(feedId=" + this.f167241a + ", startTime=" + this.f167243b + ", feed=" + this.f167245c + ", showInfo=" + this.f167247d + ", isCenterFeed=" + this.f167249e + ", videoPlayReporter=" + this.f167251f + ')';
    }

    /* renamed from: u */
    public final int mo83205u() {
        return this.f167264o;
    }

    /* renamed from: v */
    public final int mo83206v() {
        return this.f167220F;
    }

    /* renamed from: w */
    public final int[] mo83207w() {
        return this.f167261l;
    }

    /* renamed from: x */
    public final int[] mo83208x() {
        return this.f167262m;
    }

    /* renamed from: y */
    public final int mo83209y() {
        return this.f167216B;
    }

    /* renamed from: z */
    public final Vector<Integer> mo83210z() {
        return this.f167229O;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C58378j1(long j, long j2, FinderItem finderItem, C9508q qVar, boolean z, C61572r rVar, int i, C8480h hVar) {
        this(j, j2, finderItem, (i & 8) != 0 ? null : qVar, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : rVar);
    }
}
