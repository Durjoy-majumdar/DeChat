package dp1;

import android.media.AudioManager;
import android.text.TextUtils;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderExtClinkExposeStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderFlowExposeStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderItemExposeStruct;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C30783v3;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.i2$$g;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import df1.C58259c;
import di3.C86312j;
import eb0.C31543z5;
import ef1.C58553c;
import ef1.C58555d;
import ef1.C7637b;
import er1.C58739j4;
import er1.C58771q3;
import er1.C58784w3;
import f40.C86709a0;
import f62.C27051f0;
import f62.C75700k0;
import fy3.C32224a;
import g62.C75875l;
import gp3.C87315b;
import gy3.C87412m;
import gy3.C87413o;
import he1.C59838a;
import it1.C60625c;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import jq3.C9508q;
import mr1.C61572r;
import o40.C61926c;
import org.json.JSONObject;
import p500dy.C97560f;
import p707tz.C37315g;
import rs1.C13442s8;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C64197v;
import te3.C49277ef1;
import te3.C49712hj1;
import te3.C64292cp1;
import te3.C64472jk0;
import te3.C64726td1;
import te3.C64770ve1;
import te3.db4;
import vq1.C65866w;
import z04.C112551y;
import zc1.C66785b;

/* renamed from: dp1.t */
public abstract class C58403t extends C58555d {

    /* renamed from: q */
    public static final C58405b f167322q = new C58405b();

    /* renamed from: r */
    public static final String f167323r = "Finder.FinderFeedFlowReporter";

    /* renamed from: s */
    public static String f167324s = "";

    /* renamed from: t */
    public static int f167325t;

    /* renamed from: g */
    public final MMFragmentActivity f167326g;

    /* renamed from: h */
    public C49712hj1 f167327h;

    /* renamed from: i */
    public C27051f0 f167328i;

    /* renamed from: j */
    public final C58406c f167329j;

    /* renamed from: n */
    public final long f167330n = 1277;

    /* renamed from: o */
    public final C61572r f167331o;

    /* renamed from: p */
    public boolean f167332p;

    /* renamed from: dp1.t$a */
    public static final class C58404a implements C27051f0 {

        /* renamed from: d */
        public final /* synthetic */ C58403t f167333d;

        public C58404a(C58403t tVar) {
            this.f167333d = tVar;
        }

        /* renamed from: V4 */
        public void mo54204V4(C72963f4 f4Var, C75875l.C45886e eVar, boolean[] zArr) {
        }

        /* renamed from: a2 */
        public void mo54205a2(C72963f4 f4Var, C72976h2 h2Var, boolean z, C75875l.C45886e eVar) {
            this.f167333d.mo83124E1(f4Var, h2Var, z, eVar);
        }

        /* renamed from: k3 */
        public void mo54206k3(C72963f4 f4Var, C72976h2 h2Var, boolean z, C75875l.C45886e eVar) {
        }
    }

    /* renamed from: dp1.t$b */
    public static final class C58405b {
        /* renamed from: e */
        public static /* synthetic */ void m67757e(C58405b bVar, C49712hj1 hj12, long j, int i, String str, long j2, C59838a aVar, int i2, Object obj) {
            bVar.mo83250d(hj12, j, i, str, (i2 & 16) != 0 ? C31543z5.m39453c() : j2, (i2 & 32) != 0 ? null : aVar);
        }

        /* renamed from: a */
        public final String mo83247a(String str) {
            JSONObject jSONObject;
            try {
                if (TextUtils.isEmpty(C58403t.f167324s)) {
                    return str;
                }
                if (str != null) {
                    if (str.length() > 0) {
                        jSONObject = new JSONObject(str);
                        jSONObject.put("bell_info", C58403t.f167324s);
                        return jSONObject.toString();
                    }
                }
                jSONObject = new JSONObject();
                jSONObject.put("bell_info", C58403t.f167324s);
                return jSONObject.toString();
            } catch (Exception unused) {
                return str;
            }
        }

        /* renamed from: b */
        public final String mo83248b(Map<String, ? extends Object> map) {
            C87412m.m108594g(map, "maps");
            return C58739j4.f168176a.mo83702c(map);
        }

        /* renamed from: c */
        public final JSONObject mo83249c(int i, String... strArr) {
            C87412m.m108594g(strArr, "values");
            JSONObject jSONObject = new JSONObject();
            if (i == 4) {
                jSONObject.put("len", strArr[0]);
                jSONObject.put("idx_last", strArr[1]);
                jSONObject.put("idx_now", strArr[2]);
                jSONObject.put("is_video", strArr[3]);
                jSONObject.put("video_play_percent", strArr[4]);
                jSONObject.put("video_replay_count", strArr[5]);
                jSONObject.put("idx_type", strArr[6]);
            } else if (i == 8) {
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, strArr[0]);
            } else if (i == 10) {
                jSONObject.put("type", strArr[0]);
                jSONObject.put("username", strArr[1]);
            } else if (i == 13) {
                jSONObject.put("type", strArr[0]);
            } else if (i == 15) {
                jSONObject.put("type", strArr[0]);
            } else if (i == 16) {
                jSONObject.put("type", strArr[0]);
            }
            return jSONObject;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00e2, code lost:
            r14 = new os1.C35279a.C35280a(r10, r1);
         */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x0240  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x025b A[Catch:{ Exception -> 0x0269 }] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo83250d(te3.C49712hj1 r20, long r21, int r23, java.lang.String r24, long r25, he1.C59838a r27) {
            /*
                r19 = this;
                r0 = r20
                r1 = r21
                r3 = r23
                r4 = r24
                r5 = r25
                r7 = r27
                java.lang.Class<dp1.y0> r8 = dp1.C58417y0.class
                java.lang.String r9 = "contextObj"
                gy3.C87412m.m108594g(r0, r9)
                java.lang.String r9 = "actionValue"
                gy3.C87412m.m108594g(r4, r9)
                er1.w3 r9 = er1.C58784w3.f168295a
                r9.getClass()
                r9 = 1
                r11 = 2147483647(0x7fffffff, double:1.060997895E-314)
                int r13 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
                if (r13 > 0) goto L_0x002f
                r11 = -2147483648(0xffffffff80000000, double:NaN)
                int r13 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
                if (r13 >= 0) goto L_0x002d
                goto L_0x002f
            L_0x002d:
                r11 = 0
                goto L_0x0030
            L_0x002f:
                r11 = 1
            L_0x0030:
                if (r11 != 0) goto L_0x004e
                java.lang.String r0 = dp1.C58403t.f167323r
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "feedId:"
                r3.append(r4)
                r3.append(r1)
                java.lang.String r1 = " is loacl fake feed,not report 18054"
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                return
            L_0x004e:
                com.tencent.mm.autogen.mmdata.rpt.FinderFeedDataStruct r11 = new com.tencent.mm.autogen.mmdata.rpt.FinderFeedDataStruct
                r11.<init>()
                r12 = 2
                if (r3 != r12) goto L_0x00fc
                bl3.r r13 = bl3.C39818r.f106831a
                java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r14 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
                bl3.r$a r13 = r13.mo62446e(r14)
                java.lang.Class<os1.a> r14 = os1.C35279a.class
                androidx.lifecycle.i0 r13 = r13.mo75002a(r14)
                java.lang.String r14 = "UICProvider.of(FinderCom…18054CacheVM::class.java)"
                gy3.C87412m.m108593f(r13, r14)
                os1.a r13 = (os1.C35279a) r13
                int r14 = r0.f134675i
                boolean r15 = r13.f94529e
                if (r15 != 0) goto L_0x0081
                zt3.t r15 = zt3.C119157j.f356862d
                os1.b r12 = new os1.b
                r12.<init>(r13)
                zt3.j r15 = (zt3.C119157j) r15
                java.lang.String r10 = "Finder.18054CacheVM"
                r15.mo183876g(r12, r10)
                r13.f94529e = r9
            L_0x0081:
                java.util.concurrent.ConcurrentHashMap<java.lang.String, os1.a$a> r10 = r13.f94532h
                java.lang.String r12 = r13.mo60178c3(r14, r1)
                java.lang.Object r10 = r10.get(r12)
                os1.a$a r10 = (os1.C35279a.C35280a) r10
                if (r10 == 0) goto L_0x0092
                int r10 = r10.f94535f
                goto L_0x0093
            L_0x0092:
                r10 = 0
            L_0x0093:
                rx3.g r12 = r13.f94530f
                rx3.n r12 = (rx3.C36570n) r12
                java.lang.Object r12 = r12.getValue()
                java.lang.Number r12 = (java.lang.Number) r12
                int r12 = r12.intValue()
                if (r10 >= r12) goto L_0x00a5
                r10 = 1
                goto L_0x00a6
            L_0x00a5:
                r10 = 0
            L_0x00a6:
                if (r10 != 0) goto L_0x00d4
                java.lang.String r10 = dp1.C58403t.f167323r
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r14 = "this feed["
                r12.append(r14)
                java.lang.String r14 = o40.C61926c.m72691p(r21)
                r12.append(r14)
                java.lang.String r14 = "] over limit exposed count in scene["
                r12.append(r14)
                int r14 = r0.f134675i
                r12.append(r14)
                r14 = 93
                r12.append(r14)
                java.lang.String r12 = r12.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r12)
                r11.f155251x = r9
            L_0x00d4:
                int r10 = r0.f134675i
                java.util.concurrent.ConcurrentHashMap<java.lang.String, os1.a$a> r12 = r13.f94532h
                java.lang.String r13 = r13.mo60178c3(r10, r1)
                java.lang.Object r14 = r12.get(r13)
                if (r14 != 0) goto L_0x00ef
                os1.a$a r14 = new os1.a$a
                r14.<init>(r10, r1)
                java.lang.Object r10 = r12.putIfAbsent(r13, r14)
                if (r10 != 0) goto L_0x00ee
                goto L_0x00ef
            L_0x00ee:
                r14 = r10
            L_0x00ef:
                os1.a$a r14 = (os1.C35279a.C35280a) r14
                int r10 = r14.f94535f
                int r10 = r10 + r9
                r14.f94535f = r10
                long r12 = java.lang.System.nanoTime()
                r14.f94536g = r12
            L_0x00fc:
                java.lang.String r10 = o40.C61926c.m72691p(r21)
                java.lang.String r12 = "FeedID"
                java.lang.String r10 = r11.mo86045b(r12, r10, r9)
                r11.f155231d = r10
                int r10 = r0.f134675i
                long r12 = (long) r10
                r11.f155240m = r12
                r11.f155232e = r3
                java.lang.String r10 = ","
                java.lang.String r12 = ";"
                r13 = 0
                java.lang.String r4 = z04.C112551y.m153814n(r4, r10, r12, r13)
                java.lang.String r13 = "ActionValue"
                java.lang.String r4 = r11.mo86045b(r13, r4, r9)
                r11.f155233f = r4
                boolean r4 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
                if (r4 == 0) goto L_0x0126
                r4 = 0
                goto L_0x0128
            L_0x0126:
                r4 = 43
            L_0x0128:
                r11.f155234g = r4
                r11.f155235h = r5
                java.lang.String r4 = "ActionTimeStampMs"
                r11.mo86048e(r4, r5)
                java.lang.String r4 = r0.f134670d
                java.lang.String r5 = "sessionID"
                java.lang.String r4 = r11.mo86045b(r5, r4, r9)
                r11.f155236i = r4
                di3.d r4 = di3.C86312j.m106911c(r8)
                dp1.y0 r4 = (dp1.C58417y0) r4
                com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.Br0(r1)
                r5 = 0
                if (r4 == 0) goto L_0x0163
                int r13 = r4.getMediaType()
                r11.f155237j = r13
                java.util.LinkedList r4 = r4.getMediaList()
                java.lang.Object r4 = sx3.C110818d0.m150916N(r4)
                te3.rq2 r4 = (te3.C64689rq2) r4
                if (r4 == 0) goto L_0x0160
                int r4 = r4.f185269g
                long r13 = (long) r4
                goto L_0x0161
            L_0x0160:
                r13 = r5
            L_0x0161:
                r11.f155239l = r13
            L_0x0163:
                di3.d r4 = di3.C86312j.m106911c(r8)
                dp1.y0 r4 = (dp1.C58417y0) r4
                int r13 = r0.f134675i
                dp1.i2 r1 = r4.mo83349vP(r1, r13)
                if (r1 == 0) goto L_0x0174
                te3.we1 r1 = r1.f122975a
                goto L_0x0175
            L_0x0174:
                r1 = 0
            L_0x0175:
                java.lang.String r2 = ""
                if (r1 == 0) goto L_0x0183
                java.lang.String r4 = r1.f143985e
                if (r4 == 0) goto L_0x0183
                r13 = 0
                java.lang.String r4 = z04.C112551y.m153814n(r4, r10, r12, r13)
                goto L_0x0184
            L_0x0183:
                r4 = r2
            L_0x0184:
                r11.mo76252s(r4)
                je1.h2 r4 = je1.C46523h2.f125330a
                if (r1 == 0) goto L_0x018f
                java.lang.String r1 = r1.f143989i
                if (r1 != 0) goto L_0x0190
            L_0x018f:
                r1 = r2
            L_0x0190:
                java.lang.String r13 = r0.f134687x
                if (r13 != 0) goto L_0x0195
                r13 = r2
            L_0x0195:
                r14 = 0
                java.lang.String r1 = r4.mo71863e(r1, r13, r14)
                int r4 = r11.f155232e
                r13 = 2
                if (r4 != r13) goto L_0x01d2
                int r4 = r1.length()     // Catch:{ Exception -> 0x01d2 }
                if (r4 <= 0) goto L_0x01a7
                r4 = 1
                goto L_0x01a8
            L_0x01a7:
                r4 = 0
            L_0x01a8:
                if (r4 == 0) goto L_0x01b0
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x01d2 }
                r4.<init>(r1)     // Catch:{ Exception -> 0x01d2 }
                goto L_0x01b5
            L_0x01b0:
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x01d2 }
                r4.<init>()     // Catch:{ Exception -> 0x01d2 }
            L_0x01b5:
                org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ Exception -> 0x01d2 }
                r13.<init>()     // Catch:{ Exception -> 0x01d2 }
                java.lang.String r14 = "intab"
                int r15 = dp1.C58403t.f167325t     // Catch:{ Exception -> 0x01d2 }
                r13.put(r14, r15)     // Catch:{ Exception -> 0x01d2 }
                java.lang.String r14 = "video_pos_info"
                r4.put(r14, r13)     // Catch:{ Exception -> 0x01d2 }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x01d2 }
                java.lang.String r13 = "udfKvJsonObject.toString()"
                gy3.C87412m.m108593f(r4, r13)     // Catch:{ Exception -> 0x01d2 }
                r1 = r4
            L_0x01d2:
                r4 = 0
                java.lang.String r1 = z04.C112551y.m153814n(r1, r10, r12, r4)
                java.lang.String r4 = "client_udf_kv"
                java.lang.String r1 = r11.mo86045b(r4, r1, r9)
                r11.f155250w = r1
                long r13 = r0.f134676j
                java.lang.String r1 = o40.C61926c.m72691p(r13)
                java.lang.String r4 = "ClickFeedId"
                java.lang.String r1 = r11.mo86045b(r4, r1, r9)
                r11.f155241n = r1
                java.lang.String r1 = r0.f134673g
                if (r1 != 0) goto L_0x01f2
                r1 = r2
            L_0x01f2:
                java.lang.String r4 = "ClickFeedContextId"
                java.lang.String r1 = r11.mo86045b(r4, r1, r9)
                r11.f155242o = r1
                java.lang.String r1 = r0.f134672f
                java.lang.String r4 = "ClickTabContextId"
                java.lang.String r1 = r11.mo86045b(r4, r1, r9)
                r11.f155243p = r1
                java.lang.String r1 = r0.f134671e
                java.lang.String r4 = "ContextId"
                java.lang.String r1 = r11.mo86045b(r4, r1, r9)
                r11.f155244q = r1
                java.lang.String r1 = "ExtraInfo"
                r4 = 2
                if (r3 != r4) goto L_0x028a
                java.lang.String r3 = r0.f134681r
                r4 = r19
                java.lang.String r3 = r4.mo83247a(r3)
                if (r7 == 0) goto L_0x0273
                dp1.t$b r13 = dp1.C58403t.f167322q
                r13.getClass()
                if (r3 == 0) goto L_0x0235
                int r13 = r3.length()     // Catch:{ Exception -> 0x0267 }
                if (r13 <= 0) goto L_0x022c
                r13 = 1
                goto L_0x022d
            L_0x022c:
                r13 = 0
            L_0x022d:
                if (r13 == 0) goto L_0x0235
                org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ Exception -> 0x0267 }
                r13.<init>(r3)     // Catch:{ Exception -> 0x0267 }
                goto L_0x023a
            L_0x0235:
                org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ Exception -> 0x0267 }
                r13.<init>()     // Catch:{ Exception -> 0x0267 }
            L_0x023a:
                java.lang.String r14 = "bs_switch_on_time"
                boolean r15 = r7.f170844a     // Catch:{ Exception -> 0x0267 }
                if (r15 == 0) goto L_0x025b
                r16 = r10
                long r9 = r7.f170846c     // Catch:{ Exception -> 0x0269 }
                int r17 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                if (r17 <= 0) goto L_0x025d
                long r9 = r7.f170845b     // Catch:{ Exception -> 0x0269 }
                long r17 = eb0.C31543z5.m39453c()     // Catch:{ Exception -> 0x0269 }
                long r5 = r7.f170846c     // Catch:{ Exception -> 0x0269 }
                long r17 = r17 - r5
                long r9 = r9 + r17
                r7.f170845b = r9     // Catch:{ Exception -> 0x0269 }
                r5 = 0
                r7.f170846c = r5     // Catch:{ Exception -> 0x0269 }
                goto L_0x025d
            L_0x025b:
                r16 = r10
            L_0x025d:
                long r5 = r7.f170845b     // Catch:{ Exception -> 0x0269 }
                r13.put(r14, r5)     // Catch:{ Exception -> 0x0269 }
                java.lang.String r3 = r13.toString()     // Catch:{ Exception -> 0x0269 }
                goto L_0x0269
            L_0x0267:
                r16 = r10
            L_0x0269:
                r5 = 0
                r7.f170844a = r5
                r9 = 0
                r7.f170845b = r9
                r7.f170846c = r9
                goto L_0x0276
            L_0x0273:
                r16 = r10
                r5 = 0
            L_0x0276:
                if (r3 == 0) goto L_0x027f
                r6 = r16
                java.lang.String r3 = z04.C112551y.m153814n(r3, r6, r12, r5)
                goto L_0x0282
            L_0x027f:
                r6 = r16
                r3 = r2
            L_0x0282:
                r7 = 1
                java.lang.String r1 = r11.mo86045b(r1, r3, r7)
                r11.f155245r = r1
                goto L_0x029f
            L_0x028a:
                r4 = r19
                r6 = r10
                r5 = 0
                r7 = 1
                java.lang.String r3 = r0.f134681r
                if (r3 == 0) goto L_0x0298
                java.lang.String r3 = z04.C112551y.m153814n(r3, r6, r12, r5)
                goto L_0x0299
            L_0x0298:
                r3 = r2
            L_0x0299:
                java.lang.String r1 = r11.mo86045b(r1, r3, r7)
                r11.f155245r = r1
            L_0x029f:
                java.lang.String r1 = r0.f134682s
                if (r1 == 0) goto L_0x02a7
                java.lang.String r2 = z04.C112551y.m153814n(r1, r6, r12, r5)
            L_0x02a7:
                java.lang.String r1 = "enterSourceInfo"
                java.lang.String r1 = r11.mo86045b(r1, r2, r7)
                r11.f155246s = r1
                r1 = 1
                r11.f155248u = r1
                java.lang.String r0 = r0.f134686w
                java.lang.String r1 = "jump_id"
                java.lang.String r0 = r11.mo86045b(r1, r0, r7)
                r11.f155249v = r0
                r11.mo86055o()
                di3.d r0 = di3.C86312j.m106911c(r8)
                dp1.y0 r0 = (dp1.C58417y0) r0
                r0.Ec0(r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: dp1.C58403t.C58405b.mo83250d(te3.hj1, long, int, java.lang.String, long, he1.a):void");
        }

        /* renamed from: f */
        public final void mo83251f(C49712hj1 hj12, C58378j1 j1Var, int i) {
            String str;
            C49712hj1 hj13 = hj12;
            C58378j1 j1Var2 = j1Var;
            Class cls = C58417y0.class;
            C87412m.m108594g(hj13, "contextObj");
            C87412m.m108594g(j1Var2, "record");
            FinderItem finderItem = j1Var2.f167245c;
            if (finderItem != null) {
                FinderItemExposeStruct finderItemExposeStruct = new FinderItemExposeStruct();
                boolean z = true;
                finderItemExposeStruct.f155398d = finderItemExposeStruct.mo86045b("FeedId", C61926c.m72691p(finderItem.getId()), true);
                finderItemExposeStruct.f155399e = (long) finderItem.getMediaType();
                finderItemExposeStruct.f155400f = finderItemExposeStruct.mo86045b("SessionId", hj13.f134670d, true);
                finderItemExposeStruct.f155420z = (long) hj13.f134675i;
                finderItemExposeStruct.f155401g = j1Var2.f167253g;
                finderItemExposeStruct.f155402h = (long) finderItem.getLikeCount();
                finderItemExposeStruct.f155403i = (long) finderItem.getCommentCount();
                finderItemExposeStruct.f155404j = finderItemExposeStruct.mo86045b("topic", C112551y.m153814n(C58771q3.f168268a.mo83810a(finderItem), ",", ";", false), true);
                String str2 = finderItem.getFeedObject().recommendReason;
                String str3 = "";
                if (str2 == null) {
                    str2 = str3;
                }
                finderItemExposeStruct.f155405k = finderItemExposeStruct.mo86045b("recommendWording", C112551y.m153814n(str2, ",", ";", false), true);
                long j = 0;
                finderItemExposeStruct.f155406l = C87412m.m108589b(finderItem.getUserName(), C66785b.f191882e.mo90662O5()) ? 1 : 0;
                finderItemExposeStruct.f155407m = (long) finderItem.getCreateTime();
                if (finderItem.getLocation().f182662e > 0.0f && finderItem.getLocation().f182661d > 0.0f) {
                    finderItemExposeStruct.f155408n = 1;
                }
                finderItemExposeStruct.f155409o = (long) finderItem.getMediaList().size();
                if (finderItem.getMediaType() == 4 && finderItem.getMediaList().size() > 0) {
                    finderItemExposeStruct.f155410p = (long) finderItem.getMediaList().get(0).f185269g;
                }
                finderItemExposeStruct.f155411q = j1Var2.f167257i - j1Var2.f167243b;
                if (!BuildInfo.DEBUG) {
                    j = 5;
                }
                finderItemExposeStruct.f155412r = j;
                finderItemExposeStruct.f155413s = (long) finderItem.getFeedObject().recommendType;
                finderItemExposeStruct.f155414t = finderItemExposeStruct.mo86045b("FeedUsername", finderItem.getUserName(), true);
                finderItemExposeStruct.f155415u = (long) finderItem.getFeedObject().orgRecommendType;
                String str4 = finderItem.getFeedObject().warnWording;
                if (str4 == null) {
                    str4 = str3;
                }
                finderItemExposeStruct.f155416v = finderItemExposeStruct.mo86045b("NoticeWording", str4, true);
                finderItemExposeStruct.f155417w = (long) finderItem.getFeedObject().warnFlag;
                finderItemExposeStruct.f155418x = (long) i;
                String str5 = hj13.f134671e;
                if (str5 == null) {
                    str5 = str3;
                }
                finderItemExposeStruct.f155419y = finderItemExposeStruct.mo86045b("ContextId", str5, true);
                finderItemExposeStruct.f155384A = finderItemExposeStruct.mo86045b("ClickFeedId", C61926c.m72691p(hj13.f134676j), true);
                String str6 = hj13.f134673g;
                if (str6 == null) {
                    str6 = str3;
                }
                finderItemExposeStruct.f155385B = finderItemExposeStruct.mo86045b("ClickFeedContextId", str6, true);
                String str7 = hj13.f134672f;
                if (str7 == null) {
                    str7 = str3;
                }
                finderItemExposeStruct.f155386C = finderItemExposeStruct.mo86045b("ClickTabContextId", str7, true);
                finderItemExposeStruct.f155387D = (long) j1Var2.f167255h;
                finderItemExposeStruct.f155388E = C60625c.f172729q.mo85583a(hj13.f134675i);
                finderItemExposeStruct.f155389F = finderItemExposeStruct.mo86045b("SessionBuffer", ((C58417y0) C86312j.m106911c(cls)).mo83281Cu(finderItem.getId(), hj13.f134675i), true);
                LinkedList<FinderCommentInfo> e = C65866w.f189407h.mo89906e(finderItem.getFeedObject());
                finderItemExposeStruct.f155390G = (long) e.size();
                if (e.size() > 3) {
                    finderItemExposeStruct.f155391H = 3;
                } else {
                    finderItemExposeStruct.f155391H = (long) e.size();
                }
                finderItemExposeStruct.f155392I = finderItemExposeStruct.mo86045b("ExpoFriendLikeUserList", str3, true);
                int i2 = 0;
                for (T next : e) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        FinderCommentInfo finderCommentInfo = (FinderCommentInfo) next;
                        if (i2 <= 2) {
                            finderItemExposeStruct.f155392I = finderItemExposeStruct.mo86045b("ExpoFriendLikeUserList", finderItemExposeStruct.f155392I + finderCommentInfo.username + '|', true);
                        }
                        i2 = i3;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                finderItemExposeStruct.f155393J = (long) finderItem.getFeedObject().commentList.size();
                LinkedList<FinderCommentInfo> linkedList = finderItem.getFeedObject().commentList;
                C87412m.m108593f(linkedList, "it.feedObject.commentList");
                FinderCommentInfo finderCommentInfo2 = (FinderCommentInfo) C110818d0.m150916N(linkedList);
                if (!(finderCommentInfo2 == null || (str = finderCommentInfo2.username) == null)) {
                    str3 = str;
                }
                finderItemExposeStruct.f155394K = finderItemExposeStruct.mo86045b("ExpoCommentUser", str3, true);
                C58784w3.f168295a.getClass();
                if (finderItem.getFeedObject().incFriendLikeCount <= 0 || finderItem.getFeedObject().msgEventFlag != 1) {
                    z = false;
                }
                if (z) {
                    finderItemExposeStruct.f155395L = (long) finderItem.getFeedObject().incFriendLikeCount;
                }
                LinkedList<FinderCommentInfo> linkedList2 = finderItem.getFeedObject().commentList;
                C87412m.m108593f(linkedList2, "it.feedObject.commentList");
                ArrayList arrayList = new ArrayList();
                for (T next2 : linkedList2) {
                    if (((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).mo76747EE(((FinderCommentInfo) next2).username)) {
                        arrayList.add(next2);
                    }
                }
                finderItemExposeStruct.f155396M = (long) arrayList.size();
                finderItemExposeStruct.f155397N = (long) finderItem.getFeedObject().commentList.size();
                finderItemExposeStruct.mo86055o();
                ((C58417y0) C86312j.m106911c(cls)).Ec0(finderItemExposeStruct);
            }
        }

        /* renamed from: g */
        public final void mo83252g(C49712hj1 hj12, C58401r1 r1Var, JSONObject jSONObject, boolean z) {
            C13598b0 b0Var;
            FinderObject finderObject;
            FinderObject finderObject2;
            FinderObjectDesc finderObjectDesc;
            C64770ve1 ve12;
            long j;
            FinderObject finderObject3;
            FinderObjectDesc finderObjectDesc2;
            C49277ef1 ef12;
            long j2;
            long j3;
            C49712hj1 hj13 = hj12;
            C58401r1 r1Var2 = r1Var;
            Class cls = C58417y0.class;
            C87412m.m108594g(hj13, "contextObj");
            C87412m.m108594g(r1Var2, "record");
            JSONObject jSONObject2 = jSONObject == null ? new JSONObject() : jSONObject;
            FinderFlowExposeStruct finderFlowExposeStruct = new FinderFlowExposeStruct();
            finderFlowExposeStruct.f155283d = (long) hj13.f134675i;
            finderFlowExposeStruct.f155287h = finderFlowExposeStruct.mo86045b("Feedid", C61926c.m72691p(r1Var2.f167313a), true);
            finderFlowExposeStruct.f155284e = finderFlowExposeStruct.mo86045b("Sessionid", hj13.f134670d, true);
            finderFlowExposeStruct.f155285f = finderFlowExposeStruct.mo86045b("Contextid", hj13.f134671e, true);
            finderFlowExposeStruct.f155286g = finderFlowExposeStruct.mo86045b("ClickTabContextid", hj13.f134672f, true);
            long j4 = r1Var2.f167314b;
            finderFlowExposeStruct.f155292m = j4;
            long j5 = r1Var2.f167319g;
            finderFlowExposeStruct.f155293n = j5;
            finderFlowExposeStruct.f155291l = Math.max(j5 - j4, 0);
            FinderItem finderItem = r1Var2.f167315c;
            String str = "";
            if (finderItem != null) {
                finderFlowExposeStruct.f155294o = (long) finderItem.getLikeCount();
                String str2 = hj13.f134679p;
                finderFlowExposeStruct.f155295p = finderFlowExposeStruct.mo86045b("PageTag", str2 != null ? C112551y.m153814n(str2, ",", ";", false) : str, true);
                finderFlowExposeStruct.f155297r = (long) finderItem.getMediaType();
            }
            finderFlowExposeStruct.f155288i = (long) r1Var2.f167316d;
            finderFlowExposeStruct.f155290k = C60625c.f172729q.mo85583a(hj13.f134675i);
            JSONObject jSONObject3 = new JSONObject();
            try {
                C9508q qVar = r1Var2.f167317e;
                if (qVar != null) {
                    jSONObject3.put("x", qVar.f29680a + 1);
                    jSONObject3.put("width", qVar.f29681b);
                    jSONObject3.put("height", qVar.f29682c);
                }
            } catch (Exception unused) {
            }
            String jSONObject4 = jSONObject3.toString();
            C87412m.m108593f(jSONObject4, "jsonObj.toString()");
            finderFlowExposeStruct.f155289j = finderFlowExposeStruct.mo86045b("IndexInfo", C112551y.m153814n(jSONObject4, ",", ";", false), true);
            finderFlowExposeStruct.f155296q = finderFlowExposeStruct.mo86045b("SessionBuffer", ((C58417y0) C86312j.m106911c(cls)).mo83281Cu(r1Var2.f167313a, hj13.f134675i), true);
            long j6 = 1;
            if (hj13.f134675i == 15) {
                FinderItem finderItem2 = r1Var2.f167315c;
                if ((finderItem2 != null ? finderItem2.getFeedObject() : null) != null) {
                    int i = r1Var2.f167315c.getFeedObject().recommendReasonType;
                    if (i != 1) {
                        switch (i) {
                            case 9:
                                j3 = 6;
                                break;
                            case 10:
                                j2 = 2;
                                break;
                            case 11:
                                j3 = 3;
                                break;
                            case 12:
                                j3 = 5;
                                break;
                            case 13:
                                j3 = 4;
                                break;
                            default:
                                j2 = 0;
                                break;
                        }
                        j2 = j3;
                    } else {
                        j2 = 1;
                    }
                    finderFlowExposeStruct.f155298s = j2;
                    String str3 = r1Var2.f167315c.getFeedObject().recommendReason;
                    if (str3 == null) {
                        str3 = str;
                    }
                    finderFlowExposeStruct.f155299t = finderFlowExposeStruct.mo86045b("RecommendWording", str3, false);
                }
            }
            FinderItem finderItem3 = r1Var2.f167315c;
            if (!(finderItem3 == null || (finderObject3 = finderItem3.getFinderObject()) == null || (finderObjectDesc2 = finderObject3.objectDesc) == null || (ef12 = finderObjectDesc2.event) == null)) {
                finderFlowExposeStruct.f155302w = finderFlowExposeStruct.mo86045b("ActivityID", C61926c.m72691p(ef12.f132898d), true);
                finderFlowExposeStruct.f155303x = (long) hj13.f134684u;
                String str4 = hj13.f134685v;
                if (str4 != null) {
                    str = str4;
                }
                finderFlowExposeStruct.f155304y = finderFlowExposeStruct.mo86045b("ActivityInfo", str, true);
            }
            FinderItem finderItem4 = r1Var2.f167315c;
            if (finderItem4 == null || (finderObject2 = finderItem4.getFinderObject()) == null || (finderObjectDesc = finderObject2.objectDesc) == null || (ve12 = finderObjectDesc.feedBgmInfo) == null) {
                b0Var = null;
            } else {
                finderFlowExposeStruct.f155300u = finderFlowExposeStruct.mo86045b("GroupID", ve12.f185874e, true);
                C64726td1 td12 = ve12.f185873d;
                if (td12 != null) {
                    String str5 = td12.f185534d;
                    if (!(str5 == null || str5.length() == 0)) {
                        j = 2;
                        finderFlowExposeStruct.f155301v = j;
                        b0Var = C13598b0.f38549a;
                    }
                }
                j = 1;
                finderFlowExposeStruct.f155301v = j;
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                FinderItem finderItem5 = r1Var2.f167315c;
                finderFlowExposeStruct.f155300u = finderFlowExposeStruct.mo86045b("GroupID", C61926c.m72691p((finderItem5 == null || (finderObject = finderItem5.getFinderObject()) == null) ? 0 : finderObject.f164794id), true);
                FinderItem finderItem6 = r1Var2.f167315c;
                if (finderItem6 != null && finderItem6.getMediaType() == 4) {
                    finderFlowExposeStruct.f155301v = 1;
                }
            }
            finderFlowExposeStruct.f155305z = finderFlowExposeStruct.mo86045b("jump_id", hj13.f134686w, true);
            String jSONObject5 = jSONObject2.toString();
            C87412m.m108593f(jSONObject5, "kvJson.toString()");
            finderFlowExposeStruct.f155281A = finderFlowExposeStruct.mo86045b("udf_kv", C112551y.m153814n(jSONObject5, ",", ";", false), true);
            if (!z) {
                j6 = 0;
            }
            finderFlowExposeStruct.f155282B = j6;
            finderFlowExposeStruct.mo86055o();
            ((C58417y0) C86312j.m106911c(cls)).Ec0(finderFlowExposeStruct);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x004b, code lost:
            r0 = r0.getFoldedLayout();
         */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00b1  */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo83253h(te3.C49712hj1 r20, dp1.C58378j1 r21) {
            /*
                r19 = this;
                r0 = r20
                r1 = r21
                java.lang.String r2 = "contextObj"
                gy3.C87412m.m108594g(r0, r2)
                java.lang.String r2 = "record"
                gy3.C87412m.m108594g(r1, r2)
                com.tencent.mm.autogen.mmdata.rpt.FinderFoldFeedExposeStruct r2 = new com.tencent.mm.autogen.mmdata.rpt.FinderFoldFeedExposeStruct
                r2.<init>()
                java.lang.String r3 = r0.f134670d
                java.lang.String r4 = "Sessionid"
                r5 = 1
                java.lang.String r3 = r2.mo86045b(r4, r3, r5)
                r2.f155307e = r3
                java.lang.String r3 = r0.f134671e
                java.lang.String r4 = "Contextid"
                java.lang.String r3 = r2.mo86045b(r4, r3, r5)
                r2.f155308f = r3
                java.lang.String r3 = r0.f134672f
                java.lang.String r4 = "ClickTabContextid"
                java.lang.String r3 = r2.mo86045b(r4, r3, r5)
                r2.f155309g = r3
                int r0 = r0.f134675i
                long r3 = (long) r0
                r2.f155306d = r3
                long r3 = r1.f167241a
                java.lang.String r0 = o40.C61926c.m72691p(r3)
                java.lang.String r3 = "FeedId"
                java.lang.String r0 = r2.mo86045b(r3, r0, r5)
                r2.f155310h = r0
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f167245c
                r3 = 0
                if (r0 == 0) goto L_0x0055
                te3.bl0 r0 = r0.getFoldedLayout()
                if (r0 == 0) goto L_0x0055
                int r0 = r0.f131184g
                long r6 = (long) r0
                goto L_0x0056
            L_0x0055:
                r6 = r3
            L_0x0056:
                r2.f155312j = r6
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f167245c
                java.lang.String r6 = ""
                if (r0 == 0) goto L_0x0068
                te3.bl0 r0 = r0.getFoldedLayout()
                if (r0 == 0) goto L_0x0068
                java.lang.String r0 = r0.f131183f
                if (r0 != 0) goto L_0x0069
            L_0x0068:
                r0 = r6
            L_0x0069:
                java.lang.String r7 = "FlodUsername"
                java.lang.String r0 = r2.mo86045b(r7, r0, r5)
                r2.f155311i = r0
                java.lang.String r0 = "AllFlodFeedItems"
                java.lang.String r6 = r2.mo86045b(r0, r6, r5)
                r2.f155313k = r6
                long r6 = com.tencent.p014mm.plugin.finder.view.FinderFoldedScrollLayout.f17780j
                int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r8 == 0) goto L_0x0082
                r2.f155315m = r6
                goto L_0x0096
            L_0x0082:
                long r6 = com.tencent.p014mm.plugin.finder.view.FinderFoldedScrollLayout.f17781n
                int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r8 == 0) goto L_0x008b
                r2.f155314l = r6
                goto L_0x0096
            L_0x008b:
                long r6 = com.tencent.p014mm.plugin.finder.view.FinderFoldedScrollLayout.f17783p
                int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r8 == 0) goto L_0x0096
                long r6 = com.tencent.p014mm.plugin.finder.view.FinderFoldedScrollLayout.f17782o
                long r8 = com.tencent.p014mm.plugin.finder.view.FinderFoldedScrollLayout.f17783p
                goto L_0x0098
            L_0x0096:
                r6 = r3
                r8 = r6
            L_0x0098:
                com.tencent.mm.plugin.finder.storage.FinderItem r10 = r1.f167245c
                if (r10 == 0) goto L_0x01c4
                te3.bl0 r10 = r10.getFoldedLayout()
                if (r10 == 0) goto L_0x01c4
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r10 = r10.f131182e
                if (r10 == 0) goto L_0x01c4
                r11 = 0
                java.util.Iterator r10 = r10.iterator()
            L_0x00ab:
                boolean r12 = r10.hasNext()
                if (r12 == 0) goto L_0x01c4
                java.lang.Object r12 = r10.next()
                int r13 = r11 + 1
                r14 = 0
                if (r11 < 0) goto L_0x01c0
                com.tencent.mm.protocal.protobuf.FinderObject r12 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r12
                jq3.q r15 = r1.f167247d
                if (r15 == 0) goto L_0x00cd
                android.util.LongSparseArray<jq3.s> r15 = r15.f29689j
                if (r15 == 0) goto L_0x00cd
                long r3 = r12.f164794id
                java.lang.Object r3 = r15.get(r3)
                jq3.s r3 = (jq3.C33631s) r3
                goto L_0x00ce
            L_0x00cd:
                r3 = r14
            L_0x00ce:
                r15 = 59
                if (r3 == 0) goto L_0x0152
                jq3.c r14 = r3.f91020a
                long r16 = r14.getItemId()
                int r14 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
                if (r14 != 0) goto L_0x0119
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r5 = r2.f155313k
                r14.append(r5)
                jq3.c r5 = r3.f91020a
                long r17 = r5.getItemId()
                java.lang.String r5 = o40.C61926c.m72691p(r17)
                r14.append(r5)
                r14.append(r15)
                r14.append(r11)
                r14.append(r15)
                long r4 = r3.f91021b
                r14.append(r4)
                r14.append(r15)
                r14.append(r8)
                r3 = 35
                r14.append(r3)
                java.lang.String r3 = r14.toString()
                r4 = 1
                java.lang.String r3 = r2.mo86045b(r0, r3, r4)
                r2.f155313k = r3
                r5 = r13
                goto L_0x014f
            L_0x0119:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = r2.f155313k
                r4.append(r5)
                jq3.c r5 = r3.f91020a
                long r17 = r5.getItemId()
                java.lang.String r5 = o40.C61926c.m72691p(r17)
                r4.append(r5)
                r4.append(r15)
                r4.append(r11)
                r4.append(r15)
                r5 = r13
                long r13 = r3.f91021b
                r4.append(r13)
                java.lang.String r3 = ";0#"
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                r4 = 1
                java.lang.String r3 = r2.mo86045b(r0, r3, r4)
                r2.f155313k = r3
            L_0x014f:
                rx3.b0 r14 = rx3.C13598b0.f38549a
                goto L_0x0153
            L_0x0152:
                r5 = r13
            L_0x0153:
                if (r14 != 0) goto L_0x01b9
                dp1.t$b r3 = dp1.C58403t.f167322q
                long r3 = r12.f164794id
                int r13 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r13 != 0) goto L_0x018f
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = r2.f155313k
                r3.append(r4)
                long r12 = r12.f164794id
                java.lang.String r4 = o40.C61926c.m72691p(r12)
                r3.append(r4)
                r3.append(r15)
                r3.append(r11)
                java.lang.String r4 = ";0;"
                r3.append(r4)
                r3.append(r8)
                r4 = 35
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r4 = 1
                java.lang.String r3 = r2.mo86045b(r0, r3, r4)
                r2.f155313k = r3
                goto L_0x01b9
            L_0x018f:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = r2.f155313k
                r3.append(r4)
                long r12 = r12.f164794id
                java.lang.String r4 = o40.C61926c.m72691p(r12)
                r3.append(r4)
                r3.append(r15)
                r3.append(r11)
                java.lang.String r4 = ";0;0#"
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r4 = 1
                java.lang.String r3 = r2.mo86045b(r0, r3, r4)
                r2.f155313k = r3
                goto L_0x01ba
            L_0x01b9:
                r4 = 1
            L_0x01ba:
                r11 = r5
                r3 = 0
                r5 = 1
                goto L_0x00ab
            L_0x01c0:
                sx3.C64197v.m75542k()
                throw r14
            L_0x01c4:
                r0 = r3
                com.tencent.p014mm.plugin.finder.view.FinderFoldedScrollLayout.f17780j = r0
                com.tencent.p014mm.plugin.finder.view.FinderFoldedScrollLayout.f17783p = r0
                com.tencent.p014mm.plugin.finder.view.FinderFoldedScrollLayout.f17782o = r0
                com.tencent.p014mm.plugin.finder.view.FinderFoldedScrollLayout.f17781n = r0
                r2.mo86055o()
                java.lang.Class<dp1.y0> r0 = dp1.C58417y0.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                dp1.y0 r0 = (dp1.C58417y0) r0
                r0.Ec0(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: dp1.C58403t.C58405b.mo83253h(te3.hj1, dp1.j1):void");
        }

        /* renamed from: i */
        public final void mo83254i(C49712hj1 hj12, C58378j1 j1Var) {
            String str;
            C64472jk0 extReading;
            C87412m.m108594g(hj12, "contextObj");
            C87412m.m108594g(j1Var, "record");
            FinderItem finderItem = j1Var.f167245c;
            if (finderItem != null && finderItem.getShowExtendLink()) {
                FinderExtClinkExposeStruct finderExtClinkExposeStruct = new FinderExtClinkExposeStruct();
                finderExtClinkExposeStruct.f9796d = finderExtClinkExposeStruct.mo86045b("Feedid", C61926c.m72691p(j1Var.f167245c.field_id), true);
                finderExtClinkExposeStruct.f9797e = finderExtClinkExposeStruct.mo86045b("SessionId", hj12.f134670d, true);
                finderExtClinkExposeStruct.f9798f = finderExtClinkExposeStruct.mo86045b("Contextid", hj12.f134671e, true);
                FinderItem finderItem2 = j1Var.f167245c;
                if (finderItem2 == null || (extReading = finderItem2.getExtReading()) == null || (str = extReading.f183802d) == null) {
                    str = "";
                }
                finderExtClinkExposeStruct.f9799g = finderExtClinkExposeStruct.mo86045b("Url", str, true);
                finderExtClinkExposeStruct.f9800h = 1;
                finderExtClinkExposeStruct.f9801i = 1;
                finderExtClinkExposeStruct.f9803k = finderExtClinkExposeStruct.mo86045b("clicktabcontextid", hj12.f134672f, true);
                finderExtClinkExposeStruct.f9804l = (long) hj12.f134675i;
                C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
                FinderItem finderItem3 = j1Var.f167245c;
                finderExtClinkExposeStruct.f9805m = finderExtClinkExposeStruct.mo86045b("sessionBuffer", y0Var.mo83281Cu(finderItem3 != null ? finderItem3.getId() : 0, hj12.f134675i), true);
                finderExtClinkExposeStruct.mo86054n();
            }
        }
    }

    /* renamed from: dp1.t$c */
    public static final class C58406c {

        /* renamed from: a */
        public boolean f167334a;
    }

    /* renamed from: dp1.t$d */
    public static final class C58407d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58403t f167335d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58407d(C58403t tVar) {
            super(0);
            this.f167335d = tVar;
        }

        public Object invoke() {
            C58403t tVar = this.f167335d;
            Integer num = null;
            if (tVar.f167328i != null) {
                C30783v3 Ku = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku();
                C27051f0 f0Var = tVar.f167328i;
                i2$$g i2__g = ((C44660i2) Ku).f121079e;
                i2__g.getClass();
                i2__g.remove(new C87315b(f0Var, i2__g));
                tVar.f167328i = null;
            }
            C61572r rVar = this.f167335d.f167331o;
            rVar.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("onRelease(), size:");
            ConcurrentHashMap<Long, C61572r.C61573a> concurrentHashMap = rVar.f174999d;
            if (concurrentHashMap != null) {
                num = Integer.valueOf(concurrentHashMap.size());
            }
            sb.append(num);
            Log.m105924i("Finder.FinderVideoPlayReporter", sb.toString());
            ConcurrentHashMap<Long, C61572r.C61573a> concurrentHashMap2 = rVar.f174999d;
            if (concurrentHashMap2 != null) {
                for (Map.Entry<Long, C61572r.C61573a> value : concurrentHashMap2.entrySet()) {
                    C61572r.C61573a aVar = (C61572r.C61573a) value.getValue();
                    if (aVar != null) {
                        Object systemService = MMApplicationContext.getContext().getSystemService("audio");
                        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
                        aVar.f175031b0 = ((AudioManager) systemService).getStreamVolume(3);
                        C94554a Z40 = ((C97560f) C86312j.m106911c(C97560f.class)).Z40(aVar.f175038f);
                        if (Z40 != null) {
                            aVar.f175043h0 = Z40.f273444b;
                            aVar.f175045i0 = Z40.f273449g;
                        }
                        long c = C31543z5.m39453c();
                        if (aVar.f175052m == 0) {
                            aVar.f175052m = c - aVar.f175046j;
                            long j = aVar.f175004C;
                            if (j > 0) {
                                aVar.f175003B += c - j;
                                aVar.f175004C = 0;
                            }
                            long j2 = aVar.f175006E;
                            if (j2 > 0) {
                                aVar.f175005D += c - j2;
                                aVar.f175006E = 0;
                            }
                        }
                        long j3 = aVar.f175010I;
                        if (j3 > 0) {
                            aVar.f175011J += c - j3;
                            aVar.f175010I = 0;
                            C64292cp1 cp12 = new C64292cp1();
                            cp12.f182553f = (int) (c - aVar.f175010I);
                            cp12.f182552e = aVar.f175054n;
                            cp12.f182551d = 0;
                            aVar.f175026Y.add(cp12);
                        }
                        if (aVar.f175007F == 0 && aVar.f175076y && aVar.f175054n < 5) {
                            aVar.f175077z = 1;
                        }
                        Log.m105924i("Finder.FinderVideoPlayReporter", rVar.mo86502a("onRelease", aVar) + " playTime:" + aVar.f175052m + " pauseTotalTime:" + aVar.f175003B + " realPlayTime:" + aVar.f175005D + " playStatus:" + aVar.f175077z);
                        rVar.mo86506e(aVar);
                        rVar.mo86505d(aVar);
                    }
                }
            }
            rVar.f174999d = new ConcurrentHashMap<>();
            return C13598b0.f38549a;
        }
    }

    public C58403t(MMFragmentActivity mMFragmentActivity, C49712hj1 hj12) {
        C87412m.m108594g(mMFragmentActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(hj12, "contextObj");
        this.f167326g = mMFragmentActivity;
        this.f167327h = hj12;
        this.f167331o = new C61572r(hj12);
        ((C37315g) C86312j.m106911c(C37315g.class)).dd0(mMFragmentActivity);
        this.f167329j = new C58406c();
        this.f167328i = new C58404a(this);
        C30783v3 Ku = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku();
        ((C44660i2) Ku).f121079e.add(this.f167328i);
        this.f167332p = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:316:0x0925  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0928  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x0950  */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x0953  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x0958  */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x096f  */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x02b0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02de  */
    /* renamed from: B1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2331B1(ef1.C7637b r31) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            java.lang.String r2 = "event"
            gy3.C87412m.m108594g(r1, r2)
            te3.hj1 r2 = r0.f167327h
            int r2 = r2.f134675i
            if (r2 != 0) goto L_0x0017
            java.lang.String r1 = f167323r
            java.lang.String r2 = "[onEventHappen] invalid scene"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            return
        L_0x0017:
            boolean r2 = r1 instanceof df1.C58259c.C58260a
            if (r2 == 0) goto L_0x0aa8
            df1.c$a r1 = (df1.C58259c.C58260a) r1
            int r2 = r1.f166811b
            r3 = 1
            java.lang.String r5 = " realPlayTime:"
            java.lang.String r6 = "H264"
            java.lang.String r7 = "H266"
            java.lang.String r8 = "H265"
            java.lang.String r9 = "null cannot be cast to non-null type android.media.AudioManager"
            java.lang.String r10 = "audio"
            java.lang.String r11 = ""
            r12 = 2
            java.lang.String r14 = "Finder.FinderVideoPlayReporter"
            r16 = 1120403456(0x42c80000, float:100.0)
            r17 = -1
            r15 = 0
            r18 = r14
            r13 = 0
            switch(r2) {
                case 1: goto L_0x0a4f;
                case 2: goto L_0x0a27;
                case 3: goto L_0x09ee;
                case 4: goto L_0x07ae;
                case 5: goto L_0x0733;
                case 6: goto L_0x05aa;
                case 7: goto L_0x0558;
                case 8: goto L_0x052a;
                case 9: goto L_0x04e9;
                case 10: goto L_0x04cf;
                case 11: goto L_0x0479;
                case 12: goto L_0x03bf;
                case 13: goto L_0x039a;
                case 14: goto L_0x035f;
                case 15: goto L_0x025f;
                case 16: goto L_0x0236;
                case 17: goto L_0x021c;
                case 18: goto L_0x01e0;
                case 19: goto L_0x0192;
                case 20: goto L_0x00e3;
                case 21: goto L_0x0040;
                default: goto L_0x003e;
            }
        L_0x003e:
            goto L_0x0aa8
        L_0x0040:
            mr1.r r2 = r0.f167331o
            r2.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, mr1.r$a> r2 = r2.f174999d
            long r5 = r1.f166817h
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object r2 = r2.get(r5)
            mr1.r$a r2 = (mr1.C61572r.C61573a) r2
            if (r2 == 0) goto L_0x0aa8
            long r5 = r2.f175019R
            long r5 = r5 + r3
            r2.f175019R = r5
            float r7 = r2.f175020S
            long r3 = r5 - r3
            float r3 = (float) r3
            float r7 = r7 * r3
            int r4 = r1.f166832w
            float r8 = (float) r4
            float r7 = r7 + r8
            float r5 = (float) r5
            float r7 = r7 / r5
            r2.f175020S = r7
            float r6 = r2.f175021T
            float r6 = r6 * r3
            int r3 = r1.f166833x
            float r7 = (float) r3
            float r6 = r6 + r7
            float r6 = r6 / r5
            r2.f175021T = r6
            int r6 = r1.f166831v
            int r4 = r6 - r4
            if (r4 <= r12) goto L_0x0081
            int r4 = r2.f175022U
            r7 = 1
            int r4 = r4 + r7
            r2.f175022U = r4
            goto L_0x0082
        L_0x0081:
            r7 = 1
        L_0x0082:
            int r6 = r6 - r3
            if (r6 <= r12) goto L_0x008a
            int r3 = r2.f175023V
            int r3 = r3 + r7
            r2.f175023V = r3
        L_0x008a:
            int r3 = r2.f175022U
            float r3 = (float) r3
            float r3 = r3 / r5
            r2.f175024W = r3
            int r3 = r2.f175023V
            float r3 = (float) r3
            float r3 = r3 / r5
            r2.f175025X = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "videoFPS: "
            r3.append(r4)
            int r1 = r1.f166831v
            r3.append(r1)
            java.lang.String r1 = " staticSeconds: "
            r3.append(r1)
            long r4 = r2.f175019R
            r3.append(r4)
            java.lang.String r1 = " decodeFps: "
            r3.append(r1)
            float r1 = r2.f175020S
            r3.append(r1)
            java.lang.String r1 = " renderFps: "
            r3.append(r1)
            float r1 = r2.f175021T
            r3.append(r1)
            java.lang.String r1 = " playDecodeStuckCount: "
            r3.append(r1)
            int r1 = r2.f175022U
            r3.append(r1)
            java.lang.String r1 = " playRenderStuckCount: "
            r3.append(r1)
            int r1 = r2.f175023V
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2 = r18
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            goto L_0x0aa8
        L_0x00e3:
            r2 = r18
            mr1.r r3 = r0.f167331o
            r3.getClass()
            mr1.t r4 = r1.f166828s
            if (r4 == 0) goto L_0x00f1
            int r4 = r4.f175138b
            goto L_0x00f3
        L_0x00f1:
            int r4 = r3.f174998c
        L_0x00f3:
            r3.f174998c = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "onPlayerConfig enableRendererSharpen:"
            r4.append(r5)
            int r5 = r3.f174998c
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, mr1.r$a> r4 = r3.f174999d
            long r5 = r1.f166817h
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object r4 = r4.get(r5)
            mr1.r$a r4 = (mr1.C61572r.C61573a) r4
            if (r4 == 0) goto L_0x0aa8
            mr1.t r1 = r1.f166828s
            if (r1 == 0) goto L_0x0122
            int r5 = r1.f175137a
            goto L_0x0123
        L_0x0122:
            r5 = -1
        L_0x0123:
            r4.f175063r0 = r5
            if (r1 == 0) goto L_0x012a
            int r5 = r1.f175139c
            goto L_0x012b
        L_0x012a:
            r5 = -1
        L_0x012b:
            r4.f175065s0 = r5
            if (r1 == 0) goto L_0x0132
            int r5 = r1.f175140d
            goto L_0x0133
        L_0x0132:
            r5 = -1
        L_0x0133:
            r4.f175067t0 = r5
            if (r1 == 0) goto L_0x013a
            java.lang.String r13 = r1.f175142f
            goto L_0x013b
        L_0x013a:
            r13 = 0
        L_0x013b:
            if (r13 != 0) goto L_0x013f
            java.lang.String r13 = "0"
        L_0x013f:
            r4.f175069u0 = r13
            if (r1 == 0) goto L_0x0146
            int r1 = r1.f175141e
            goto L_0x0147
        L_0x0146:
            r1 = -1
        L_0x0147:
            r4.f175071v0 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "onPlayerConfig"
            java.lang.String r3 = r3.mo86502a(r5, r4)
            r1.append(r3)
            java.lang.String r3 = " mediaCodecInitDuration "
            r1.append(r3)
            int r3 = r4.f175071v0
            r1.append(r3)
            java.lang.String r3 = " enableMediaCodecReuse:"
            r1.append(r3)
            int r3 = r4.f175063r0
            r1.append(r3)
            java.lang.String r3 = " mediaCodecReuseEnabled:"
            r1.append(r3)
            int r3 = r4.f175065s0
            r1.append(r3)
            java.lang.String r3 = " mediaCodecReused:"
            r1.append(r3)
            int r3 = r4.f175067t0
            r1.append(r3)
            java.lang.String r3 = " mediaCodecErrorCode:"
            r1.append(r3)
            java.lang.String r3 = r4.f175069u0
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            goto L_0x0aa8
        L_0x0192:
            r2 = r18
            mr1.r r3 = r0.f167331o
            r3.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, mr1.r$a> r4 = r3.f174999d
            long r5 = r1.f166817h
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object r4 = r4.get(r5)
            mr1.r$a r4 = (mr1.C61572r.C61573a) r4
            if (r4 == 0) goto L_0x0aa8
            long r5 = r4.f175008G
            int r7 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r7 != 0) goto L_0x01bf
            long r5 = r1.f25941a
            long r7 = r4.f175046j
            long r5 = r5 - r7
            r4.f175008G = r5
            long r7 = r4.f175003B
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x01bf
            long r5 = r5 - r7
            r4.f175008G = r5
        L_0x01bf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "onFirstVideoFrameRendered"
            java.lang.String r3 = r3.mo86502a(r5, r4)
            r1.append(r3)
            java.lang.String r3 = " firstVideoFrameRendered:"
            r1.append(r3)
            long r3 = r4.f175008G
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            goto L_0x0aa8
        L_0x01e0:
            r2 = r18
            mr1.r r3 = r0.f167331o
            r3.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, mr1.r$a> r4 = r3.f174999d
            long r5 = r1.f166817h
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object r4 = r4.get(r5)
            mr1.r$a r4 = (mr1.C61572r.C61573a) r4
            if (r4 == 0) goto L_0x0aa8
            int r1 = r1.f166825p
            r4.f175059p0 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "onPlayError"
            java.lang.String r3 = r3.mo86502a(r5, r4)
            r1.append(r3)
            java.lang.String r3 = " playerErrCode:"
            r1.append(r3)
            int r3 = r4.f175059p0
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            goto L_0x0aa8
        L_0x021c:
            mr1.r r2 = r0.f167331o
            r2.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, mr1.r$a> r2 = r2.f174999d
            long r3 = r1.f166817h
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.Object r1 = r2.get(r1)
            mr1.r$a r1 = (mr1.C61572r.C61573a) r1
            if (r1 == 0) goto L_0x0aa8
            r3 = 1
            r1.f175039f0 = r3
            goto L_0x0aa8
        L_0x0236:
            r2 = r18
            r3 = 1
            mr1.r r4 = r0.f167331o
            r4.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, mr1.r$a> r5 = r4.f174999d
            long r6 = r1.f166817h
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            java.lang.Object r1 = r5.get(r1)
            mr1.r$a r1 = (mr1.C61572r.C61573a) r1
            if (r1 == 0) goto L_0x0aa8
            r1.f175017P = r3
            java.lang.String r3 = "onDownloadStart"
            java.lang.String r1 = r4.mo86502a(r3, r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            goto L_0x0aa8
        L_0x025f:
            r2 = r18
            mr1.r r3 = r0.f167331o
            r3.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, mr1.r$a> r4 = r3.f174999d
            long r5 = r1.f166817h
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object r4 = r4.get(r5)
            mr1.r$a r4 = (mr1.C61572r.C61573a) r4
            if (r4 == 0) goto L_0x02a5
            boolean r5 = r4.f175017P
            if (r5 == 0) goto L_0x02a5
            gi.h r5 = r1.f166823n
            if (r5 == 0) goto L_0x0288
            mr1.r$c r6 = r4.f175015N
            if (r6 != 0) goto L_0x0288
            mr1.r$c r5 = r3.mo86504c(r5)
            r4.f175015N = r5
        L_0x0288:
            gi.d r5 = r1.f166824o
            if (r5 == 0) goto L_0x0296
            mr1.r$b r6 = r4.f175016O
            if (r6 != 0) goto L_0x0296
            mr1.r$b r5 = r3.mo86503b(r5)
            r4.f175016O = r5
        L_0x0296:
            r4.f175017P = r15
            java.lang.String r5 = "onDownloadStop"
            java.lang.String r4 = r3.mo86502a(r5, r4)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
        L_0x02a5:
            java.util.concurrent.ConcurrentLinkedDeque<mr1.r$a> r4 = r3.f174997b
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x02b0:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x02e2
            java.lang.Object r6 = r4.next()
            r7 = r6
            mr1.r$a r7 = (mr1.C61572r.C61573a) r7
            long r8 = r7.f175030b
            long r10 = r1.f166817h
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x02db
            java.lang.String r7 = r7.f175032c
            pl1.u0 r8 = r1.f166814e
            if (r8 == 0) goto L_0x02d2
            pl1.r0 r8 = (pl1.C62367r0) r8
            java.lang.String r8 = r8.mo11841b()
            goto L_0x02d3
        L_0x02d2:
            r8 = 0
        L_0x02d3:
            boolean r7 = gy3.C87412m.m108589b(r7, r8)
            if (r7 == 0) goto L_0x02db
            r7 = 1
            goto L_0x02dc
        L_0x02db:
            r7 = 0
        L_0x02dc:
            if (r7 == 0) goto L_0x02b0
            r5.add(r6)
            goto L_0x02b0
        L_0x02e2:
            java.util.ArrayList r4 = new java.util.ArrayList
            r6 = 10
            int r6 = sx3.C36907w.m41090l(r5, r6)
            r4.<init>(r6)
            java.util.Iterator r5 = r5.iterator()
        L_0x02f1:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x031d
            java.lang.Object r6 = r5.next()
            mr1.r$a r6 = (mr1.C61572r.C61573a) r6
            gi.h r7 = r1.f166823n
            if (r7 == 0) goto L_0x030b
            mr1.r$c r8 = r6.f175015N
            if (r8 != 0) goto L_0x030b
            mr1.r$c r7 = r3.mo86504c(r7)
            r6.f175015N = r7
        L_0x030b:
            gi.d r7 = r1.f166824o
            if (r7 == 0) goto L_0x0319
            mr1.r$b r8 = r6.f175016O
            if (r8 != 0) goto L_0x0319
            mr1.r$b r7 = r3.mo86503b(r7)
            r6.f175016O = r7
        L_0x0319:
            r4.add(r6)
            goto L_0x02f1
        L_0x031d:
            java.util.concurrent.ConcurrentLinkedDeque<mr1.r$a> r1 = r3.f174997b
            r1.removeAll(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "lazyReportDataList "
            r1.append(r5)
            java.util.concurrent.ConcurrentLinkedDeque<mr1.r$a> r5 = r3.f174997b
            int r5 = r5.size()
            r1.append(r5)
            java.lang.String r5 = " reportList "
            r1.append(r5)
            int r5 = r4.size()
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            java.util.Iterator r1 = r4.iterator()
        L_0x034c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0aa8
            java.lang.Object r2 = r1.next()
            mr1.r$a r2 = (mr1.C61572r.C61573a) r2
            r3.mo86506e(r2)
            r3.mo86505d(r2)
            goto L_0x034c
        L_0x035f:
            r2 = r18
            mr1.r r3 = r0.f167331o
            r3.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, mr1.r$a> r4 = r3.f174999d
            long r5 = r1.f166817h
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object r4 = r4.get(r5)
            mr1.r$a r4 = (mr1.C61572r.C61573a) r4
            if (r4 == 0) goto L_0x0aa8
            long r5 = r1.f25941a
            long r7 = r4.f175046j
            long r5 = r5 - r7
            r4.f175060q = r5
            gi.d r1 = r1.f166824o
            if (r1 == 0) goto L_0x038b
            mr1.r$b r5 = r4.f175016O
            if (r5 != 0) goto L_0x038b
            mr1.r$b r1 = r3.mo86503b(r1)
            r4.f175016O = r1
        L_0x038b:
            java.lang.String r1 = "onDownloadFinish"
            java.lang.String r1 = r3.mo86502a(r1, r4)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            goto L_0x0aa8
        L_0x039a:
            mr1.r r2 = r0.f167331o
            r2.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, mr1.r$a> r2 = r2.f174999d
            long r3 = r1.f166817h
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r2 = r2.get(r3)
            mr1.r$a r2 = (mr1.C61572r.C61573a) r2
            if (r2 == 0) goto L_0x0aa8
            long r3 = r2.f175014M
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 != 0) goto L_0x0aa8
            int r3 = r1.f166815f
            int r1 = r1.f166816g
            int r3 = r3 + r1
            long r3 = (long) r3
            r2.f175014M = r3
            goto L_0x0aa8
        L_0x03bf:
            r2 = r18
            mr1.r r3 = r0.f167331o
            r3.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, mr1.r$a> r4 = r3.f174999d
            long r5 = r1.f166817h
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object r4 = r4.get(r5)
            mr1.r$a r4 = (mr1.C61572r.C61573a) r4
            if (r4 == 0) goto L_0x0aa8
            long r5 = r4.f175007F
            int r7 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r7 != 0) goto L_0x042e
            long r5 = r1.f25941a
            long r7 = r4.f175046j
            long r5 = r5 - r7
            r4.f175007F = r5
            long r7 = r4.f175003B
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x03ec
            long r5 = r5 - r7
            r4.f175007F = r5
        L_0x03ec:
            or1.a r5 = r3.f175000e
            long r6 = r4.f175007F
            r5.f176720d = r6
            long r8 = r5.f176718b
            long r8 = r8 + r6
            r5.f176718b = r8
            int r6 = r5.f176719c
            r7 = 1
            int r6 = r6 + r7
            r5.f176719c = r6
            float r7 = (float) r8
            r8 = 1065353216(0x3f800000, float:1.0)
            float r7 = r7 * r8
            float r6 = (float) r6
            float r7 = r7 / r6
            java.lang.String r6 = r5.f176717a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "count:"
            r8.append(r9)
            int r9 = r5.f176719c
            r8.append(r9)
            java.lang.String r9 = " current:"
            r8.append(r9)
            long r9 = r5.f176720d
            r8.append(r9)
            java.lang.String r5 = ",  average:"
            r8.append(r5)
            r8.append(r7)
            java.lang.String r5 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
        L_0x042e:
            long r5 = r4.f175050l
            int r7 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r7 != 0) goto L_0x0438
            long r5 = r1.f166827r
            r4.f175050l = r5
        L_0x0438:
            te3.rq2 r1 = r1.f166813d
            if (r1 == 0) goto L_0x0442
            com.tencent.mm.protocal.protobuf.FinderMediaReportObject r1 = r1.f185262W0
            if (r1 == 0) goto L_0x0442
            int r15 = r1.playDecoderType
        L_0x0442:
            r4.f175013L = r15
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "onFirstFrameUpdate"
            java.lang.String r3 = r3.mo86502a(r5, r4)
            r1.append(r3)
            java.lang.String r3 = " firstFrameTime:"
            r1.append(r3)
            long r5 = r4.f175007F
            r1.append(r5)
            java.lang.String r3 = " firstLoadTime:"
            r1.append(r3)
            long r5 = r4.f175050l
            r1.append(r5)
            java.lang.String r3 = " playDecoderType="
            r1.append(r3)
            int r3 = r4.f175013L
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            goto L_0x0aa8
        L_0x0479:
            r2 = r18
            mr1.r r3 = r0.f167331o
            r3.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, mr1.r$a> r4 = r3.f174999d
            long r6 = r1.f166817h
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.lang.Object r4 = r4.get(r6)
            mr1.r$a r4 = (mr1.C61572r.C61573a) r4
            if (r4 == 0) goto L_0x0aa8
            mr1.s r6 = r1.f166829t
            if (r6 == 0) goto L_0x0499
            mr1.s r6 = r6.mo86511a()
            goto L_0x049a
        L_0x0499:
            r6 = 0
        L_0x049a:
            r4.f175073w0 = r6
            r4.f175051l0 = r15
            long r6 = r1.f25941a
            r4.f175004C = r6
            long r8 = r4.f175006E
            int r1 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x04b0
            long r10 = r4.f175005D
            long r6 = r6 - r8
            long r10 = r10 + r6
            r4.f175005D = r10
            r4.f175006E = r13
        L_0x04b0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "onPause"
            java.lang.String r3 = r3.mo86502a(r6, r4)
            r1.append(r3)
            r1.append(r5)
            long r3 = r4.f175005D
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            goto L_0x0aa8
        L_0x04cf:
            mr1.r r2 = r0.f167331o
            r2.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, mr1.r$a> r2 = r2.f174999d
            long r3 = r1.f166817h
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.Object r1 = r2.get(r1)
            mr1.r$a r1 = (mr1.C61572r.C61573a) r1
            if (r1 == 0) goto L_0x0aa8
            r5 = 1
            r1.f175035d0 = r5
            goto L_0x0aa8
        L_0x04e9:
            r2 = r18
            r5 = 1
            mr1.r r6 = r0.f167331o
            r6.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, mr1.r$a> r7 = r6.f174999d
            long r8 = r1.f166817h
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.lang.Object r7 = r7.get(r8)
            mr1.r$a r7 = (mr1.C61572r.C61573a) r7
            if (r7 == 0) goto L_0x0aa8
            r7.f175076y = r5
            long r8 = r1.f25941a
            r7.f175010I = r8
            boolean r1 = r1.f166834y
            r7.f175037e0 = r1
            int r1 = r7.f175009H
            int r1 = r1 + r5
            r7.f175009H = r1
            long r8 = r7.f175007F
            int r1 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x051b
            long r8 = r7.f175018Q
            long r8 = r8 + r3
            r7.f175018Q = r8
        L_0x051b:
            java.lang.String r1 = "onWaiting"
            java.lang.String r1 = r6.mo86502a(r1, r7)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            goto L_0x0aa8
        L_0x052a:
            mr1.r r2 = r0.f167331o
            r2.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, mr1.r$a> r2 = r2.f174999d
            long r3 = r1.f166817h
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r2 = r2.get(r3)
            mr1.r$a r2 = (mr1.C61572r.C61573a) r2
            if (r2 == 0) goto L_0x0aa8
            er1.w3 r3 = er1.C58784w3.f168295a
            int r4 = r1.f166815f
            int r1 = r1.f166816g
            r3.getClass()
            if (r1 == 0) goto L_0x0550
            float r3 = (float) r4
            float r3 = r3 * r16
            float r1 = (float) r1
            float r3 = r3 / r1
            int r15 = (int) r3
        L_0x0550:
            int r1 = r2.f175062r
            if (r15 <= r1) goto L_0x0aa8
            r2.f175062r = r15
            goto L_0x0aa8
        L_0x0558:
            r2 = r18
            mr1.r r3 = r0.f167331o
            r3.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, mr1.r$a> r4 = r3.f174999d
            long r5 = r1.f166817h
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object r4 = r4.get(r5)
            mr1.r$a r4 = (mr1.C61572r.C61573a) r4
            if (r4 == 0) goto L_0x0aa8
            long r5 = r4.f175064s
            int r7 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r7 != 0) goto L_0x057f
            long r5 = r1.f25941a
            long r7 = r4.f175046j
            long r5 = r5 - r7
            long r7 = r4.f175003B
            long r5 = r5 - r7
            r4.f175064s = r5
        L_0x057f:
            int r5 = r1.f166815f
            int r1 = r1.f166816g
            int r5 = r5 + r1
            long r5 = (long) r5
            r4.f175066t = r5
            r4.f175076y = r15
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "onMoovReady"
            java.lang.String r3 = r3.mo86502a(r5, r4)
            r1.append(r3)
            java.lang.String r3 = " moovReadyTime:"
            r1.append(r3)
            long r3 = r4.f175064s
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            goto L_0x0aa8
        L_0x05aa:
            r2 = r18
            kj2.d r20 = kj2.C117407d.INSTANCE
            long r3 = r0.f167330n
            r23 = 3
            r25 = 1
            r27 = 0
            r21 = r3
            r20.idkeyStat(r21, r23, r25, r27)
            mr1.r r3 = r0.f167331o
            r3.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, mr1.r$a> r4 = r3.f174999d
            long r13 = r1.f166817h
            java.lang.Long r12 = java.lang.Long.valueOf(r13)
            java.lang.Object r4 = r4.get(r12)
            mr1.r$a r4 = (mr1.C61572r.C61573a) r4
            if (r4 == 0) goto L_0x0aa8
            long r12 = r4.f175030b
            r14 = r6
            r18 = r7
            long r6 = r1.f166817h
            int r16 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r16 != 0) goto L_0x0aa8
            java.lang.String r6 = r4.f175032c
            pl1.u0 r7 = r1.f166814e
            if (r7 == 0) goto L_0x05e8
            pl1.r0 r7 = (pl1.C62367r0) r7
            java.lang.String r7 = r7.mo11841b()
            goto L_0x05e9
        L_0x05e8:
            r7 = 0
        L_0x05e9:
            boolean r6 = gy3.C87412m.m108589b(r6, r7)
            if (r6 == 0) goto L_0x0aa8
            long r6 = r1.f25941a
            long r12 = r4.f175046j
            long r6 = r6 - r12
            r4.f175052m = r6
            mr1.s r6 = r1.f166829t
            if (r6 == 0) goto L_0x05ff
            mr1.s r13 = r6.mo86511a()
            goto L_0x0600
        L_0x05ff:
            r13 = 0
        L_0x0600:
            r4.f175073w0 = r13
            long r6 = r4.f175004C
            r12 = 0
            int r16 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r16 <= 0) goto L_0x061b
            long r12 = r4.f175003B
            r16 = r2
            r17 = r3
            long r2 = r1.f25941a
            long r2 = r2 - r6
            long r12 = r12 + r2
            r4.f175003B = r12
            r2 = 0
            r4.f175004C = r2
            goto L_0x0620
        L_0x061b:
            r16 = r2
            r17 = r3
            r2 = r12
        L_0x0620:
            long r6 = r4.f175006E
            int r12 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r12 <= 0) goto L_0x0632
            long r12 = r4.f175005D
            long r2 = r1.f25941a
            long r2 = r2 - r6
            long r12 = r12 + r2
            r4.f175005D = r12
            r2 = 0
            r4.f175006E = r2
        L_0x0632:
            long r6 = r4.f175010I
            int r12 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r12 <= 0) goto L_0x065c
            long r12 = r4.f175011J
            long r2 = r1.f25941a
            long r2 = r2 - r6
            long r12 = r12 + r2
            r4.f175011J = r12
            r2 = 0
            r4.f175010I = r2
            te3.cp1 r2 = new te3.cp1
            r2.<init>()
            long r6 = r1.f25941a
            long r12 = r4.f175010I
            long r6 = r6 - r12
            int r3 = (int) r6
            r2.f182553f = r3
            int r3 = r4.f175054n
            r2.f182552e = r3
            r2.f182551d = r15
            java.util.LinkedList<te3.cp1> r3 = r4.f175026Y
            r3.add(r2)
        L_0x065c:
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.Object r2 = r2.getSystemService(r10)
            gy3.C87412m.m108592e(r2, r9)
            android.media.AudioManager r2 = (android.media.AudioManager) r2
            r3 = 3
            int r2 = r2.getStreamVolume(r3)
            r4.f175031b0 = r2
            long r2 = r4.f175007F
            r6 = 0
            int r9 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x0684
            boolean r2 = r4.f175076y
            if (r2 == 0) goto L_0x0684
            int r2 = r4.f175054n
            r3 = 5
            if (r2 >= r3) goto L_0x0684
            r2 = 1
            r4.f175077z = r2
        L_0x0684:
            wp1.g r2 = wp1.C66167g.f190173a
            pl1.u0 r3 = r1.f166814e
            if (r3 == 0) goto L_0x0692
            pl1.r0 r3 = (pl1.C62367r0) r3
            java.lang.String r3 = r3.mo11841b()
            if (r3 != 0) goto L_0x0693
        L_0x0692:
            r3 = r11
        L_0x0693:
            cm1.f1 r2 = r2.mo90234c(r3, r15)
            java.lang.String r3 = r2.field_fileFormat
            if (r3 != 0) goto L_0x069c
            r3 = r11
        L_0x069c:
            r4.f175041g0 = r3
            int r2 = r2.field_videoCodecId
            r3 = 172(0xac, float:2.41E-43)
            if (r2 == r3) goto L_0x06ad
            r3 = 193(0xc1, float:2.7E-43)
            if (r2 == r3) goto L_0x06aa
            r6 = r14
            goto L_0x06ae
        L_0x06aa:
            r6 = r18
            goto L_0x06ae
        L_0x06ad:
            r6 = r8
        L_0x06ae:
            r4.f175049k0 = r6
            java.lang.Class<dy.f> r2 = p500dy.C97560f.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            dy.f r2 = (p500dy.C97560f) r2
            pl1.u0 r3 = r1.f166814e
            if (r3 == 0) goto L_0x06c6
            pl1.r0 r3 = (pl1.C62367r0) r3
            java.lang.String r3 = r3.getPath()
            if (r3 != 0) goto L_0x06c5
            goto L_0x06c6
        L_0x06c5:
            r11 = r3
        L_0x06c6:
            com.tencent.mm.plugin.sight.base.a r2 = r2.Z40(r11)
            if (r2 == 0) goto L_0x06d8
            int r3 = r2.f273444b
            r4.f175043h0 = r3
            int r3 = r2.f273449g
            r4.f175045i0 = r3
            int r2 = r2.f273447e
            r4.f175053m0 = r2
        L_0x06d8:
            boolean r2 = r4.f175017P
            if (r2 != 0) goto L_0x06e2
            r2 = r17
            r2.mo86506e(r4)
            goto L_0x06e9
        L_0x06e2:
            r2 = r17
            java.util.concurrent.ConcurrentLinkedDeque<mr1.r$a> r3 = r2.f174997b
            r3.add(r4)
        L_0x06e9:
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, mr1.r$a> r3 = r2.f174999d
            long r6 = r1.f166817h
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            r3.remove(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "onStopPlay"
            java.lang.String r2 = r2.mo86502a(r3, r4)
            r1.append(r2)
            java.lang.String r2 = " playTime:"
            r1.append(r2)
            long r2 = r4.f175052m
            r1.append(r2)
            java.lang.String r2 = " pauseTotalTime:"
            r1.append(r2)
            long r2 = r4.f175003B
            r1.append(r2)
            r1.append(r5)
            long r2 = r4.f175005D
            r1.append(r2)
            java.lang.String r2 = " playStatus:"
            r1.append(r2)
            int r2 = r4.f175077z
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = r16
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            goto L_0x0aa8
        L_0x0733:
            r2 = r18
            mr1.r r3 = r0.f167331o
            r3.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, mr1.r$a> r4 = r3.f174999d
            long r5 = r1.f166817h
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object r4 = r4.get(r5)
            mr1.r$a r4 = (mr1.C61572r.C61573a) r4
            if (r4 == 0) goto L_0x0aa8
            r4.f175076y = r15
            long r5 = r4.f175010I
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0aa8
            long r7 = r1.f25941a
            long r7 = r7 - r5
            long r5 = r4.f175011J
            long r5 = r5 + r7
            r4.f175011J = r5
            te3.cp1 r1 = new te3.cp1
            r1.<init>()
            int r5 = (int) r7
            r1.f182553f = r5
            int r5 = r4.f175054n
            r1.f182552e = r5
            boolean r5 = r4.f175037e0
            if (r5 == 0) goto L_0x0772
            r5 = 1
            r1.f182551d = r5
            r7 = 0
            goto L_0x0786
        L_0x0772:
            r5 = 1
            int r6 = r4.f175009H
            if (r6 != r5) goto L_0x0782
            long r5 = r4.f175018Q
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0784
            r1.f182551d = r12
            goto L_0x0786
        L_0x0782:
            r7 = 0
        L_0x0784:
            r1.f182551d = r15
        L_0x0786:
            java.util.LinkedList<te3.cp1> r5 = r4.f175026Y
            r5.add(r1)
            r4.f175010I = r7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "onWaitingEnd"
            java.lang.String r3 = r3.mo86502a(r5, r4)
            r1.append(r3)
            java.lang.String r3 = " totalWaitingTime:"
            r1.append(r3)
            long r3 = r4.f175011J
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            goto L_0x0aa8
        L_0x07ae:
            r14 = r6
            r2 = r18
            r18 = r7
            kj2.d r22 = kj2.C117407d.INSTANCE
            long r3 = r0.f167330n
            r25 = 0
            r27 = 1
            r29 = 0
            r23 = r3
            r22.idkeyStat(r23, r25, r27, r29)
            mr1.r r3 = r0.f167331o
            r3.getClass()
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r4 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            java.lang.Class<dp1.y0> r5 = dp1.C58417y0.class
            mr1.r$a r6 = new mr1.r$a
            r6.<init>()
            java.lang.Class<h81.i> r7 = h81.C59774i.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            h81.i r7 = (h81.C59774i) r7
            java.lang.String r7 = r7.mo84751Wb()
            if (r7 != 0) goto L_0x07df
            r7 = r11
        L_0x07df:
            r6.f175028a = r7
            long r12 = r1.f166817h
            r6.f175030b = r12
            pl1.u0 r12 = r1.f166814e
            if (r12 == 0) goto L_0x07f1
            pl1.r0 r12 = (pl1.C62367r0) r12
            java.lang.String r12 = r12.mo11841b()
            if (r12 != 0) goto L_0x07f2
        L_0x07f1:
            r12 = r11
        L_0x07f2:
            r6.f175032c = r12
            pl1.u0 r12 = r1.f166814e
            r6.f175040g = r12
            te3.rq2 r12 = r1.f166813d
            r6.f175042h = r12
            gr1.q2 r12 = r1.f166812c
            java.lang.String r13 = "-1"
            if (r12 == 0) goto L_0x080c
            com.tencent.mm.plugin.finder.storage.FeedData r12 = r12.f170496f
            if (r12 == 0) goto L_0x080c
            java.lang.String r12 = r12.getNickName()
            if (r12 != 0) goto L_0x080d
        L_0x080c:
            r12 = r13
        L_0x080d:
            r6.f175034d = r12
            gr1.q2 r12 = r1.f166812c
            if (r12 == 0) goto L_0x081f
            com.tencent.mm.plugin.finder.storage.FeedData r12 = r12.f170496f
            if (r12 == 0) goto L_0x081f
            java.lang.String r12 = r12.getDescription()
            if (r12 != 0) goto L_0x081e
            goto L_0x081f
        L_0x081e:
            r13 = r12
        L_0x081f:
            boolean r12 = android.text.TextUtils.isEmpty(r13)
            r7 = 4
            if (r12 == 0) goto L_0x0828
            r12 = r11
            goto L_0x083a
        L_0x0828:
            int r12 = r13.length()
            int r12 = java.lang.Math.min(r7, r12)
            java.lang.String r12 = r13.substring(r15, r12)
            java.lang.String r13 = "this as java.lang.String…ing(startIndex, endIndex)"
            gy3.C87412m.m108593f(r12, r13)
        L_0x083a:
            r6.f175036e = r12
            pl1.u0 r12 = r1.f166814e
            if (r12 == 0) goto L_0x0848
            pl1.r0 r12 = (pl1.C62367r0) r12
            java.lang.String r12 = r12.getPath()
            if (r12 != 0) goto L_0x0849
        L_0x0848:
            r12 = r11
        L_0x0849:
            r6.f175038f = r12
            long r12 = r1.f25941a
            r6.f175046j = r12
            int r12 = r1.f166820k
            r6.f175048k = r12
            r12 = 1
            r6.f175076y = r12
            int r12 = r1.f166826q
            r6.f175061q0 = r12
            r12 = 2
            int r12 = com.tencent.mars.cdn.CdnLogic.getRecentAverageSpeed(r12)
            r6.f175002A = r12
            android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.Object r10 = r12.getSystemService(r10)
            gy3.C87412m.m108592e(r10, r9)
            android.media.AudioManager r10 = (android.media.AudioManager) r10
            r9 = 3
            int r9 = r10.getStreamVolume(r9)
            r6.f175029a0 = r9
            wp1.g r9 = wp1.C66167g.f190173a
            pl1.u0 r10 = r1.f166814e
            if (r10 == 0) goto L_0x0883
            pl1.r0 r10 = (pl1.C62367r0) r10
            java.lang.String r10 = r10.mo11841b()
            if (r10 != 0) goto L_0x0884
        L_0x0883:
            r10 = r11
        L_0x0884:
            cm1.f1 r9 = r9.mo90234c(r10, r15)
            int r10 = r6.f175061q0
            if (r10 <= 0) goto L_0x0891
            r19 = 1
            int r10 = r10 + 1
            goto L_0x089c
        L_0x0891:
            r19 = 1
            int r10 = r9.mo76072m2()
            if (r10 <= 0) goto L_0x089b
            r10 = 1
            goto L_0x089c
        L_0x089b:
            r10 = 0
        L_0x089c:
            r6.f175056o = r10
            boolean r10 = r9.field_hasPlayed
            r10 = r10 ^ 1
            r6.f175072w = r10
            int r10 = r9.mo76072m2()
            r6.f175058p = r10
            java.lang.String r12 = r9.field_fileFormat
            if (r12 != 0) goto L_0x08af
            goto L_0x08b0
        L_0x08af:
            r11 = r12
        L_0x08b0:
            r6.f175041g0 = r11
            int r9 = r9.field_videoCodecId
            r11 = 172(0xac, float:2.41E-43)
            if (r9 == r11) goto L_0x08c0
            r11 = 193(0xc1, float:2.7E-43)
            if (r9 == r11) goto L_0x08bd
            goto L_0x08c1
        L_0x08bd:
            r14 = r18
            goto L_0x08c1
        L_0x08c0:
            r14 = r8
        L_0x08c1:
            r6.f175049k0 = r14
            r8 = 100
            if (r10 == r8) goto L_0x08c9
            r8 = 1
            goto L_0x08ca
        L_0x08c9:
            r8 = 0
        L_0x08ca:
            r6.f175076y = r8
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getNetTypeString(r8)
            java.lang.String r9 = "getNetTypeString(MMAppli…tionContext.getContext())"
            gy3.C87412m.m108593f(r8, r9)
            r6.f175068u = r8
            di3.d r8 = di3.C86312j.m106911c(r5)
            dp1.y0 r8 = (dp1.C58417y0) r8
            int r8 = r8.mo83336jw()
            long r8 = (long) r8
            r6.f175070v = r8
            te3.hj1 r8 = r3.f174996a
            boolean r8 = r8.f134683t
            if (r8 != 0) goto L_0x0906
            di3.d r5 = di3.C86312j.m106911c(r5)
            dp1.y0 r5 = (dp1.C58417y0) r5
            long r8 = r6.f175030b
            android.util.LongSparseArray<java.lang.Long> r5 = r5.f167353g
            java.lang.Object r5 = r5.get(r8)
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 != 0) goto L_0x0901
            goto L_0x0918
        L_0x0901:
            long r13 = r5.longValue()
            goto L_0x091f
        L_0x0906:
            di3.d r5 = di3.C86312j.m106911c(r5)
            dp1.y0 r5 = (dp1.C58417y0) r5
            long r8 = r6.f175030b
            android.util.LongSparseArray<java.lang.Long> r5 = r5.f167355i
            java.lang.Object r5 = r5.get(r8)
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 != 0) goto L_0x091b
        L_0x0918:
            r13 = 0
            goto L_0x091f
        L_0x091b:
            long r13 = r5.longValue()
        L_0x091f:
            r6.f175012K = r13
            boolean r5 = gr1.C59686x0.f170506a
            if (r5 == 0) goto L_0x0928
            java.lang.String r5 = "h266"
            goto L_0x093b
        L_0x0928:
            java.lang.Class<rz.q> r5 = p682rz.C36594q.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            rz.q r5 = (p682rz.C36594q) r5
            boolean r5 = r5.mo60733UY(r7)
            if (r5 == 0) goto L_0x0939
            java.lang.String r5 = "h265"
            goto L_0x093b
        L_0x0939:
            java.lang.String r5 = "h264"
        L_0x093b:
            r6.f175047j0 = r5
            di3.d r5 = di3.C86312j.m106911c(r4)
            com.tencent.mm.plugin.FinderCommonFeatureService r5 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r5
            co1.e r5 = r5.Hx0()
            long r7 = r5.f154557l
            r6.f175044i = r7
            te3.rq2 r5 = r1.f166813d
            r7 = 0
            if (r5 == 0) goto L_0x0953
            float r8 = r5.f185270h
            goto L_0x0954
        L_0x0953:
            r8 = 0
        L_0x0954:
            r6.f175055n0 = r8
            if (r5 == 0) goto L_0x095a
            float r7 = r5.f185271i
        L_0x095a:
            r6.f175057o0 = r7
            int r5 = r1.f166826q
            r6.f175061q0 = r5
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, mr1.r$a> r5 = r3.f174999d
            long r7 = r1.f166817h
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5.put(r7, r6)
            te3.rq2 r5 = r1.f166813d
            if (r5 == 0) goto L_0x09ac
            di3.d r4 = di3.C86312j.m106911c(r4)
            com.tencent.mm.plugin.FinderCommonFeatureService r4 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r4
            co1.e r4 = r4.Hx0()
            sg.i<java.lang.String, rx3.o<te3.yb1, java.lang.String, java.lang.Long>> r5 = r4.f154563r
            te3.rq2 r1 = r1.f166813d
            if (r1 == 0) goto L_0x0982
            java.lang.String r1 = r1.f185275p
            goto L_0x0983
        L_0x0982:
            r1 = 0
        L_0x0983:
            java.lang.Object r1 = r5.get(r1)
            rx3.o r1 = (rx3.C13605o) r1
            if (r1 == 0) goto L_0x09a2
            A r1 = r1.f38557d
            te3.yb1 r1 = (te3.C64850yb1) r1
            if (r1 == 0) goto L_0x09a2
            int r1 = r1.f186468f
            long r7 = (long) r1
            long r4 = r4.f154556k
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 < 0) goto L_0x099c
            r13 = 1
            goto L_0x099d
        L_0x099c:
            r13 = 0
        L_0x099d:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            goto L_0x09a3
        L_0x09a2:
            r13 = 0
        L_0x09a3:
            if (r13 == 0) goto L_0x09ac
            int r17 = r13.intValue()
            r1 = r17
            goto L_0x09ad
        L_0x09ac:
            r1 = -1
        L_0x09ad:
            r6.f175075x0 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "onStartPlay"
            java.lang.String r3 = r3.mo86502a(r4, r6)
            r1.append(r3)
            java.lang.String r3 = " firstplay:"
            r1.append(r3)
            int r3 = r6.f175072w
            r1.append(r3)
            java.lang.String r3 = " hitPreloadPercent:"
            r1.append(r3)
            int r3 = r6.f175058p
            r1.append(r3)
            java.lang.String r3 = " posterNickName:"
            r1.append(r3)
            java.lang.String r3 = r6.f175034d
            r1.append(r3)
            java.lang.String r3 = " mediaDesc:"
            r1.append(r3)
            java.lang.String r3 = r6.f175036e
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            goto L_0x0aa8
        L_0x09ee:
            mr1.r r2 = r0.f167331o
            r2.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, mr1.r$a> r2 = r2.f174999d
            long r3 = r1.f166817h
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r2 = r2.get(r3)
            mr1.r$a r2 = (mr1.C61572r.C61573a) r2
            if (r2 == 0) goto L_0x0aa8
            java.util.HashSet<java.lang.Integer> r3 = r2.f175027Z
            int r4 = r1.f166815f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            er1.w3 r3 = er1.C58784w3.f168295a
            int r4 = r1.f166815f
            int r1 = r1.f166816g
            r3.getClass()
            if (r1 == 0) goto L_0x0a1f
            float r3 = (float) r4
            float r3 = r3 * r16
            float r1 = (float) r1
            float r3 = r3 / r1
            int r15 = (int) r3
        L_0x0a1f:
            int r1 = r2.f175054n
            if (r15 <= r1) goto L_0x0aa8
            r2.f175054n = r15
            goto L_0x0aa8
        L_0x0a27:
            kj2.d r3 = kj2.C117407d.INSTANCE
            long r4 = r0.f167330n
            r6 = 2
            r8 = 1
            r10 = 0
            r3.idkeyStat(r4, r6, r8, r10)
            mr1.r r2 = r0.f167331o
            r2.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, mr1.r$a> r2 = r2.f174999d
            long r3 = r1.f166817h
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.Object r1 = r2.get(r1)
            mr1.r$a r1 = (mr1.C61572r.C61573a) r1
            if (r1 == 0) goto L_0x0aa8
            int r2 = r1.f175074x
            r3 = 1
            int r2 = r2 + r3
            r1.f175074x = r2
            goto L_0x0aa8
        L_0x0a4f:
            r2 = r18
            kj2.d r3 = kj2.C117407d.INSTANCE
            long r4 = r0.f167330n
            r6 = 1
            r8 = 1
            r10 = 0
            r3.idkeyStat(r4, r6, r8, r10)
            mr1.r r3 = r0.f167331o
            r3.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, mr1.r$a> r4 = r3.f174999d
            long r5 = r1.f166817h
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object r4 = r4.get(r5)
            mr1.r$a r4 = (mr1.C61572r.C61573a) r4
            if (r4 == 0) goto L_0x0aa8
            r5 = 1
            r4.f175051l0 = r5
            long r5 = r1.f25941a
            r4.f175006E = r5
            long r7 = r4.f175004C
            r9 = 0
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x0a89
            long r11 = r4.f175003B
            long r5 = r5 - r7
            long r11 = r11 + r5
            r4.f175003B = r11
            r4.f175004C = r9
        L_0x0a89:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "onResume"
            java.lang.String r3 = r3.mo86502a(r5, r4)
            r1.append(r3)
            java.lang.String r3 = " onResume:"
            r1.append(r3)
            long r3 = r4.f175003B
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
        L_0x0aa8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dp1.C58403t.mo2331B1(ef1.b):void");
    }

    /* renamed from: C1 */
    public void mo2332C1() {
        C13442s8.f38060Q0.getClass();
        C61926c.m72661F(C13442s8.f38061R0, new C58407d(this));
    }

    /* renamed from: E1 */
    public void mo83124E1(C72963f4 f4Var, C72976h2 h2Var, boolean z, C75875l.C45886e eVar) {
    }

    /* renamed from: F1 */
    public final MMFragmentActivity mo83242F1() {
        return this.f167326g;
    }

    /* renamed from: G1 */
    public final C49712hj1 mo83243G1() {
        return this.f167327h;
    }

    /* renamed from: H1 */
    public final C61572r mo83244H1() {
        return this.f167331o;
    }

    /* renamed from: I1 */
    public final boolean mo83245I1() {
        return this.f167332p;
    }

    /* renamed from: J1 */
    public void mo8581J1() {
        this.f167332p = false;
    }

    /* renamed from: K1 */
    public final void mo83246K1(C49712hj1 hj12) {
        C87412m.m108594g(hj12, "contextObj");
        this.f167327h = hj12;
        C61572r rVar = this.f167331o;
        rVar.getClass();
        rVar.f174996a = hj12;
    }

    /* renamed from: L1 */
    public void mo83125L1() {
        this.f167332p = true;
    }

    /* renamed from: M1 */
    public LinkedList<db4> mo8558M1() {
        return new LinkedList<>();
    }

    /* renamed from: z1 */
    public boolean mo2333z1(C58553c cVar, C7637b bVar) {
        C87412m.m108594g(cVar, "dispatcher");
        C87412m.m108594g(bVar, "event");
        return bVar instanceof C58259c.C58260a;
    }
}
