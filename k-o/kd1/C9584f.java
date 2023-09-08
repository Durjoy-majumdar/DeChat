package kd1;

import android.content.Intent;
import c30.C79923f;
import gy3.C87412m;
import org.json.JSONObject;
import zc1.C66785b;

/* renamed from: kd1.f */
public final class C9584f {

    /* renamed from: a */
    public static final C9584f f29822a = new C9584f();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d8, code lost:
        r14.put("TopicId", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00df, code lost:
        if (r7 == null) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e1, code lost:
        r5 = r7.f146007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e3, code lost:
        if (r5 != null) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e6, code lost:
        r2 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e7, code lost:
        r14.put("TopicName", r2);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m9265b(kd1.C9584f r16, android.content.Context r17, java.lang.String r18, int r19, int r20, int r21, te3.C52271zj0 r22, kd1.C9585g.C9586a r23, int r24, java.lang.Object r25) {
        /*
            r0 = r17
            r1 = r24 & 2
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000c
        L_0x000a:
            r1 = r18
        L_0x000c:
            r3 = r24 & 4
            r4 = 0
            if (r3 == 0) goto L_0x0013
            r3 = 0
            goto L_0x0015
        L_0x0013:
            r3 = r19
        L_0x0015:
            r5 = r24 & 8
            if (r5 == 0) goto L_0x001b
            r5 = 0
            goto L_0x001d
        L_0x001b:
            r5 = r20
        L_0x001d:
            r6 = r24 & 16
            if (r6 == 0) goto L_0x0024
            r6 = 59
            goto L_0x0026
        L_0x0024:
            r6 = r21
        L_0x0026:
            r7 = r24 & 32
            if (r7 == 0) goto L_0x002c
            r7 = 0
            goto L_0x002e
        L_0x002c:
            r7 = r22
        L_0x002e:
            r9 = r24 & 64
            if (r9 == 0) goto L_0x0034
            r9 = 0
            goto L_0x0036
        L_0x0034:
            r9 = r23
        L_0x0036:
            r16.getClass()
            java.lang.String r10 = "context"
            gy3.C87412m.m108594g(r0, r10)
            java.lang.String r10 = "eid"
            gy3.C87412m.m108594g(r1, r10)
            java.lang.Class<h81.i> r10 = h81.C59774i.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            h81.i r10 = (h81.C59774i) r10
            java.lang.String r10 = r10.mo84751Wb()
            bl3.r r11 = bl3.C39818r.f106831a
            bl3.r$a r12 = r11.mo62443b(r0)
            java.lang.Class<rs1.s8> r13 = rs1.C13442s8.class
            androidx.lifecycle.i0 r12 = r12.mo75002a(r13)
            rs1.s8 r12 = (rs1.C13442s8) r12
            java.lang.String r12 = r12.f38098n
            long r13 = eb0.C31543z5.m39451a()
            java.lang.String r13 = java.lang.String.valueOf(r13)
            org.json.JSONObject r14 = new org.json.JSONObject
            r14.<init>()
            r15 = 3
            if (r7 == 0) goto L_0x0077
            r19 = r9
            long r8 = r7.f146005d     // Catch:{ JSONException -> 0x0074 }
            goto L_0x007b
        L_0x0074:
            r0 = move-exception
            goto L_0x011c
        L_0x0077:
            r19 = r9
            r8 = 0
        L_0x007b:
            java.lang.String r8 = o40.C61926c.m72691p(r8)     // Catch:{ JSONException -> 0x0074 }
            int r9 = r1.hashCode()     // Catch:{ JSONException -> 0x0074 }
            switch(r9) {
                case -1387268524: goto L_0x00eb;
                case 177080114: goto L_0x00cf;
                case 313015585: goto L_0x00a9;
                case 845948712: goto L_0x0091;
                case 1935057288: goto L_0x0088;
                default: goto L_0x0086;
            }     // Catch:{ JSONException -> 0x0074 }
        L_0x0086:
            goto L_0x0125
        L_0x0088:
            java.lang.String r0 = "link_miniprogram"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x0074 }
            if (r0 == 0) goto L_0x0125
            goto L_0x00d8
        L_0x0091:
            java.lang.String r0 = "feed_jumpicon"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x0074 }
            if (r0 != 0) goto L_0x009b
            goto L_0x0125
        L_0x009b:
            java.lang.String r0 = "scene"
            r14.put(r0, r15)     // Catch:{ JSONException -> 0x0074 }
            java.lang.String r0 = "type"
            r14.put(r0, r4)     // Catch:{ JSONException -> 0x0074 }
            goto L_0x0125
        L_0x00a9:
            java.lang.String r2 = "link_editnote_avatar_profile"
            boolean r2 = r1.equals(r2)     // Catch:{ JSONException -> 0x0074 }
            if (r2 != 0) goto L_0x00b3
            goto L_0x0125
        L_0x00b3:
            java.lang.String r2 = "source"
            r7 = 2
            r14.put(r2, r7)     // Catch:{ JSONException -> 0x0074 }
            java.lang.String r2 = "seat_type"
            r14.put(r2, r5)     // Catch:{ JSONException -> 0x0074 }
            bl3.r$a r0 = r11.mo62443b(r0)     // Catch:{ JSONException -> 0x0074 }
            java.lang.Class<ce1.g> r2 = ce1.C0465g.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r2)     // Catch:{ JSONException -> 0x0074 }
            ce1.g r0 = (ce1.C0465g) r0     // Catch:{ JSONException -> 0x0074 }
            r0.f1131V = r14     // Catch:{ JSONException -> 0x0074 }
            goto L_0x0125
        L_0x00cf:
            java.lang.String r0 = "link_h5"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x0074 }
            if (r0 != 0) goto L_0x00d8
            goto L_0x0125
        L_0x00d8:
            java.lang.String r0 = "TopicId"
            r14.put(r0, r8)     // Catch:{ JSONException -> 0x0074 }
            java.lang.String r0 = "TopicName"
            if (r7 == 0) goto L_0x00e7
            java.lang.String r5 = r7.f146007f     // Catch:{ JSONException -> 0x0074 }
            if (r5 != 0) goto L_0x00e6
            goto L_0x00e7
        L_0x00e6:
            r2 = r5
        L_0x00e7:
            r14.put(r0, r2)     // Catch:{ JSONException -> 0x0074 }
            goto L_0x0125
        L_0x00eb:
            java.lang.String r0 = "join_activity_publish"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x0074 }
            if (r0 != 0) goto L_0x00f4
            goto L_0x0125
        L_0x00f4:
            java.lang.String r0 = "activityid"
            r14.put(r0, r8)     // Catch:{ JSONException -> 0x0074 }
            java.lang.String r0 = "join_activity_result"
            if (r19 == 0) goto L_0x0106
            r8 = r19
            int r2 = r8.f29824a     // Catch:{ JSONException -> 0x0074 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ JSONException -> 0x0074 }
            goto L_0x0109
        L_0x0106:
            r8 = r19
            r2 = 0
        L_0x0109:
            r14.put(r0, r2)     // Catch:{ JSONException -> 0x0074 }
            java.lang.String r0 = "intercept_type"
            if (r8 == 0) goto L_0x0117
            int r2 = r8.f29825b     // Catch:{ JSONException -> 0x0074 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)     // Catch:{ JSONException -> 0x0074 }
            goto L_0x0118
        L_0x0117:
            r8 = 0
        L_0x0118:
            r14.put(r0, r8)     // Catch:{ JSONException -> 0x0074 }
            goto L_0x0125
        L_0x011c:
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = "FinderActivityUtils"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
        L_0x0125:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "report21875 sessionId:"
            r0.append(r2)
            r0.append(r10)
            java.lang.String r2 = " contextId:"
            r0.append(r2)
            r0.append(r12)
            java.lang.String r2 = " commentScene:"
            r0.append(r2)
            r0.append(r6)
            java.lang.String r2 = " action:"
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = " eid:"
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = " udf_kv:"
            r0.append(r2)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FinderActivityReporter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 21875(0x5573, float:3.0653E-41)
            r5 = 7
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r4] = r10
            r7 = 1
            r5[r7] = r12
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 2
            r5[r7] = r6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5[r15] = r3
            r3 = 4
            r5[r3] = r13
            r3 = 5
            r5[r3] = r1
            r1 = 6
            java.lang.String r3 = r14.toString()
            java.lang.String r6 = "udfKv.toString()"
            gy3.C87412m.m108593f(r3, r6)
            java.lang.String r6 = ","
            java.lang.String r7 = ";"
            java.lang.String r3 = z04.C112551y.m153814n(r3, r6, r7, r4)
            r5[r1] = r3
            r0.mo160131h(r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kd1.C9584f.m9265b(kd1.f, android.content.Context, java.lang.String, int, int, int, te3.zj0, kd1.g$a, int, java.lang.Object):void");
    }

    /* renamed from: a */
    public final void mo10262a(Intent intent, long j, int i) {
        C87412m.m108594g(intent, "intent");
        try {
            String str = C66785b.f191882e.mo90662O5() + '-' + j;
            String stringExtra = intent.getStringExtra("key_udf_kv");
            JSONObject jSONObject = stringExtra != null ? new JSONObject(stringExtra) : new JSONObject();
            jSONObject.put("vst_id", str);
            jSONObject.put("activity_entry_type", i);
            intent.putExtra("key_udf_kv", jSONObject.toString());
            intent.putExtra("start_time", j);
            intent.putExtra("vst_id", str);
            intent.putExtra("activity_entry_type", i);
        } catch (C79923f unused) {
        }
    }
}
