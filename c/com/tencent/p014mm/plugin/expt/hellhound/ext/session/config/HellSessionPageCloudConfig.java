package com.tencent.p014mm.plugin.expt.hellhound.ext.session.config;

import android.text.TextUtils;
import ba1.C113153e;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.SessionPageConfigChangeEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import ea1.C58534i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import te3.C110971t14;
import te3.C110974w14;
import te3.C118438ja3;
import te3.C118464s14;
import te3.C50562nl2;
import te3.yr4;

/* renamed from: com.tencent.mm.plugin.expt.hellhound.ext.session.config.HellSessionPageCloudConfig */
public class HellSessionPageCloudConfig {

    /* renamed from: b */
    public static HellSessionPageCloudConfig f345916b;

    /* renamed from: a */
    public final IListener<SessionPageConfigChangeEvent> f345917a = new IListener<SessionPageConfigChangeEvent>(C40008f.f107254d) {
        {
            this.__eventId = -2053259629;
        }

        /* JADX WARNING: Removed duplicated region for block: B:119:0x036a  */
        /* JADX WARNING: Removed duplicated region for block: B:149:0x0196 A[EDGE_INSN: B:149:0x0196->B:64:0x0196 ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x018e A[LOOP:3: B:53:0x0172->B:63:0x018e, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x02b6 A[Catch:{ Exception -> 0x0342 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean callback(com.tencent.p014mm.sdk.event.IEvent r27) {
            /*
                r26 = this;
                r1 = r27
                com.tencent.mm.autogen.events.SessionPageConfigChangeEvent r1 = (com.tencent.p014mm.autogen.events.SessionPageConfigChangeEvent) r1
                r2 = 0
                if (r1 != 0) goto L_0x000a
            L_0x0007:
                r1 = 0
                goto L_0x03fb
            L_0x000a:
                r3 = 1
                java.lang.Object[] r0 = new java.lang.Object[r3]
                com.tencent.mm.autogen.events.SessionPageConfigChangeEvent$a r4 = r1.f343608d
                java.lang.String r4 = r4.f343610b
                r0[r2] = r4
                java.lang.String r4 = "HABBYGE-MALI.HellSessionPageCloudConfig"
                java.lang.String r5 = "mEvent callback json: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r0)
                r0 = 4
                java.lang.Object[] r5 = new java.lang.Object[r0]
                com.tencent.mm.autogen.events.SessionPageConfigChangeEvent$a r6 = r1.f343608d
                java.lang.Boolean r7 = r6.f343612d
                r5[r2] = r7
                java.lang.Boolean r7 = r6.f343613e
                r5[r3] = r7
                long r6 = r6.f343609a
                java.lang.Long r6 = java.lang.Long.valueOf(r6)
                r7 = 2
                r5[r7] = r6
                com.tencent.mm.autogen.events.SessionPageConfigChangeEvent$a r6 = r1.f343608d
                int r6 = r6.f343614f
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r8 = 3
                r5[r8] = r6
                java.lang.String r6 = "mEvent callback json: %b, %b, %s, %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r5)
                com.tencent.mm.autogen.events.SessionPageConfigChangeEvent$a r5 = r1.f343608d
                long r5 = r5.f343609a
                r9 = 0
                java.lang.String r11 = "-100"
                long r9 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r11, r9)
                java.lang.String r11 = "mkv_k_hellsionpgcldc"
                int r12 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r12 != 0) goto L_0x005d
                java.lang.String r0 = "mEvent: reset"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
                byte[] r0 = new byte[r2]
                f91.C116850b.m164834d(r11, r0)
                goto L_0x0007
            L_0x005d:
                te3.t14 r5 = ba1.C113153e.m154822a()
                if (r5 == 0) goto L_0x006a
                java.util.LinkedList<te3.w14> r6 = r5.f332264d
                int r6 = r6.size()
                goto L_0x006b
            L_0x006a:
                r6 = 0
            L_0x006b:
                com.tencent.mm.autogen.events.SessionPageConfigChangeEvent$a r9 = r1.f343608d
                java.lang.Boolean r9 = r9.f343612d
                boolean r9 = r9.booleanValue()
                java.lang.String r10 = "HellSessionPageCloudConfigDao writeBack"
                java.lang.String r12 = "HABBYGE-MALI.HellSessionPageCloudConfigDao"
                if (r9 == 0) goto L_0x00b9
                if (r6 <= 0) goto L_0x0007
                int r6 = r6 - r3
            L_0x007c:
                if (r6 < 0) goto L_0x0007
                java.util.LinkedList<te3.w14> r0 = r5.f332264d
                java.lang.Object r0 = r0.get(r6)
                te3.w14 r0 = (te3.C110974w14) r0
                if (r0 != 0) goto L_0x0089
                goto L_0x0093
            L_0x0089:
                long r7 = r0.f332315e
                com.tencent.mm.autogen.events.SessionPageConfigChangeEvent$a r0 = r1.f343608d
                long r13 = r0.f343609a
                int r0 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
                if (r0 == 0) goto L_0x0096
            L_0x0093:
                int r6 = r6 + -1
                goto L_0x007c
            L_0x0096:
                java.lang.Object[] r0 = new java.lang.Object[r3]
                java.lang.Long r1 = java.lang.Long.valueOf(r7)
                r0[r2] = r1
                java.lang.String r1 = "mEvent-del: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r0)
                java.util.LinkedList<te3.w14> r0 = r5.f332264d
                r0.remove(r6)
                byte[] r0 = r5.toByteArray()     // Catch:{ Exception -> 0x00b1 }
                f91.C116850b.m164834d(r11, r0)     // Catch:{ Exception -> 0x00b1 }
                goto L_0x0007
            L_0x00b1:
                r0 = move-exception
                java.lang.Object[] r1 = new java.lang.Object[r2]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r10, r1)
                goto L_0x0007
            L_0x00b9:
                com.tencent.mm.autogen.events.SessionPageConfigChangeEvent$a r9 = r1.f343608d
                java.lang.String r9 = r9.f343610b
                if (r9 == 0) goto L_0x0007
                boolean r9 = r9.isEmpty()
                if (r9 == 0) goto L_0x00c7
                goto L_0x0007
            L_0x00c7:
                r9 = r26
                com.tencent.mm.plugin.expt.hellhound.ext.session.config.HellSessionPageCloudConfig r13 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.HellSessionPageCloudConfig.this
                com.tencent.mm.autogen.events.SessionPageConfigChangeEvent$a r14 = r1.f343608d
                java.lang.String r15 = r14.f343610b
                long r8 = r14.f343609a
                java.util.List r0 = r14.f343611c
                java.lang.Boolean r14 = r14.f343613e
                boolean r14 = r14.booleanValue()
                com.tencent.mm.autogen.events.SessionPageConfigChangeEvent$a r2 = r1.f343608d
                int r2 = r2.f343614f
                r13.getClass()
                if (r15 != 0) goto L_0x00ee
                r21 = r1
                r23 = r5
                r18 = r10
                r20 = r11
                r19 = r12
                goto L_0x0365
            L_0x00ee:
                if (r2 != r7) goto L_0x0232
                java.lang.String r2 = ""
                r7 = r2
                r18 = r10
                r3 = 0
            L_0x00f6:
                int r10 = r15.length()
                if (r3 >= r10) goto L_0x01de
                char r10 = r15.charAt(r3)
                r19 = r12
                r12 = 94
                if (r10 == r12) goto L_0x011f
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r7)
                r12.append(r10)
                java.lang.String r7 = r12.toString()
                int r3 = r3 + 1
                r21 = r1
                r23 = r5
                r20 = r11
                goto L_0x01d4
            L_0x011f:
                int r10 = r3 + 1
                r20 = r11
                char r11 = r15.charAt(r10)
                if (r11 == r12) goto L_0x01bc
                int r11 = r3 + 3
                java.lang.String r10 = r15.substring(r10, r11)
                java.lang.String r12 = "this as java.lang.String…ing(startIndex, endIndex)"
                gy3.C87412m.m108593f(r10, r12)
                r21 = r1
                r23 = r5
                r1 = 0
                r22 = 0
            L_0x013c:
                r5 = 2
                if (r1 >= r5) goto L_0x015d
                int r22 = r22 * 64
                char r5 = r10.charAt(r1)
                r25 = r10
                r10 = 32
                if (r10 > r5) goto L_0x0151
                r10 = 96
                if (r5 >= r10) goto L_0x0151
                r10 = 1
                goto L_0x0152
            L_0x0151:
                r10 = 0
            L_0x0152:
                if (r10 == 0) goto L_0x015d
                int r5 = r5 + -32
                int r22 = r22 + r5
                int r1 = r1 + 1
                r10 = r25
                goto L_0x013c
            L_0x015d:
                char r1 = r15.charAt(r11)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r1)
                r5.append(r2)
                java.lang.String r1 = r5.toString()
                r5 = 0
                r10 = 0
            L_0x0172:
                r11 = 1
                if (r5 >= r11) goto L_0x0196
                int r10 = r10 * 64
                char r11 = r1.charAt(r5)
                r25 = r1
                r1 = 32
                if (r1 > r11) goto L_0x0188
                r1 = 96
                if (r11 >= r1) goto L_0x018a
                r24 = 1
                goto L_0x018c
            L_0x0188:
                r1 = 96
            L_0x018a:
                r24 = 0
            L_0x018c:
                if (r24 == 0) goto L_0x0196
                int r11 = r11 + -32
                int r10 = r10 + r11
                int r5 = r5 + 1
                r1 = r25
                goto L_0x0172
            L_0x0196:
                r1 = 5
                int r10 = r10 + r1
                gy3.C87412m.m108591d(r7)
                int r1 = r7.length()
                int r1 = r1 - r22
                int r1 = r1 - r10
                int r10 = r10 + r1
                java.lang.String r1 = r7.substring(r1, r10)
                gy3.C87412m.m108593f(r1, r12)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r7)
                r5.append(r1)
                java.lang.String r1 = r5.toString()
                int r3 = r3 + 4
                goto L_0x01d3
            L_0x01bc:
                r21 = r1
                r23 = r5
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r7)
                java.lang.String r5 = "^"
                r1.append(r5)
                java.lang.String r1 = r1.toString()
                int r3 = r3 + 2
            L_0x01d3:
                r7 = r1
            L_0x01d4:
                r12 = r19
                r11 = r20
                r1 = r21
                r5 = r23
                goto L_0x00f6
            L_0x01de:
                r21 = r1
                r23 = r5
                r20 = r11
                r19 = r12
                boolean r1 = android.text.TextUtils.isEmpty(r7)
                if (r1 == 0) goto L_0x01f8
                java.lang.String r1 = "parsePagePath decodeJson is NULL!!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
                r1 = 122(0x7a, double:6.03E-322)
                ea1.C58534i.m67953b(r1)
                goto L_0x01f9
            L_0x01f8:
                r15 = r7
            L_0x01f9:
                if (r0 == 0) goto L_0x022b
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x0202
                goto L_0x022b
            L_0x0202:
                java.util.Iterator r1 = r0.iterator()
            L_0x0206:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x023c
                java.lang.Object r2 = r1.next()
                boolean r3 = r2 instanceof te3.C50562nl2
                if (r3 != 0) goto L_0x0215
                goto L_0x0206
            L_0x0215:
                te3.nl2 r2 = (te3.C50562nl2) r2
                r3 = 2
                java.lang.Object[] r5 = new java.lang.Object[r3]
                java.lang.String r3 = r2.f138656e
                r7 = 0
                r5[r7] = r3
                java.lang.String r2 = r2.f138657f
                r3 = 1
                r5[r3] = r2
                java.lang.String r2 = "parsePagePath, kv: %s -> %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r5)
                goto L_0x0206
            L_0x022b:
                r3 = 1
                r1 = 123(0x7b, double:6.1E-322)
                ea1.C58534i.m67953b(r1)
                goto L_0x023d
            L_0x0232:
                r21 = r1
                r23 = r5
                r18 = r10
                r20 = r11
                r19 = r12
            L_0x023c:
                r3 = 1
            L_0x023d:
                java.lang.Object[] r1 = new java.lang.Object[r3]
                r2 = 0
                r1[r2] = r15
                java.lang.String r2 = "parsePagePath: decodeJson=%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r1)
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0354 }
                r1.<init>(r15)     // Catch:{ JSONException -> 0x0354 }
                te3.w14 r2 = new te3.w14     // Catch:{ Exception -> 0x0342 }
                r2.<init>()     // Catch:{ Exception -> 0x0342 }
                java.lang.String r3 = "sid"
                java.lang.String r3 = r1.optString(r3)     // Catch:{ Exception -> 0x0342 }
                r2.f332314d = r3     // Catch:{ Exception -> 0x0342 }
                r2.f332315e = r8     // Catch:{ Exception -> 0x0342 }
                java.lang.String r3 = "logId"
                java.lang.String r3 = r1.optString(r3)     // Catch:{ Exception -> 0x0342 }
                r2.f332317g = r3     // Catch:{ Exception -> 0x0342 }
                r2.f332318h = r14     // Catch:{ Exception -> 0x0342 }
                java.lang.String r3 = "type"
                r5 = 1
                int r3 = r1.optInt(r3, r5)     // Catch:{ Exception -> 0x0342 }
                r2.f332319i = r3     // Catch:{ Exception -> 0x0342 }
                java.lang.String r3 = "parsePagePath.parse: %s, %s, %s, %b, %d"
                r5 = 5
                java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0342 }
                java.lang.String r7 = r2.f332314d     // Catch:{ Exception -> 0x0342 }
                r8 = 0
                r5[r8] = r7     // Catch:{ Exception -> 0x0342 }
                long r7 = r2.f332315e     // Catch:{ Exception -> 0x0342 }
                java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x0342 }
                r8 = 1
                r5[r8] = r7     // Catch:{ Exception -> 0x0342 }
                java.lang.String r7 = r2.f332317g     // Catch:{ Exception -> 0x0342 }
                r8 = 2
                r5[r8] = r7     // Catch:{ Exception -> 0x0342 }
                boolean r7 = r2.f332318h     // Catch:{ Exception -> 0x0342 }
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ Exception -> 0x0342 }
                r8 = 3
                r5[r8] = r7     // Catch:{ Exception -> 0x0342 }
                int r7 = r2.f332319i     // Catch:{ Exception -> 0x0342 }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0342 }
                r8 = 4
                r5[r8] = r7     // Catch:{ Exception -> 0x0342 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r3, r5)     // Catch:{ Exception -> 0x0342 }
                java.lang.String r3 = "pagePathUnits"
                org.json.JSONArray r1 = r1.optJSONArray(r3)     // Catch:{ Exception -> 0x0342 }
                if (r1 == 0) goto L_0x0366
                int r3 = r1.length()     // Catch:{ Exception -> 0x0342 }
                if (r3 <= 0) goto L_0x0366
                java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x0342 }
                r5.<init>()     // Catch:{ Exception -> 0x0342 }
                r7 = 0
            L_0x02b4:
                if (r7 >= r3) goto L_0x033c
                org.json.JSONObject r8 = r1.optJSONObject(r7)     // Catch:{ Exception -> 0x0342 }
                if (r8 != 0) goto L_0x02c2
                r27 = r1
                r16 = r3
                goto L_0x0334
            L_0x02c2:
                te3.s14 r9 = new te3.s14     // Catch:{ Exception -> 0x0342 }
                r9.<init>()     // Catch:{ Exception -> 0x0342 }
                java.lang.String r10 = "pageName"
                java.lang.String r10 = r8.optString(r10)     // Catch:{ Exception -> 0x0342 }
                r9.f354328d = r10     // Catch:{ Exception -> 0x0342 }
                java.lang.String r10 = "businessParams"
                org.json.JSONArray r10 = r8.optJSONArray(r10)     // Catch:{ Exception -> 0x0342 }
                if (r10 == 0) goto L_0x032a
                int r11 = r10.length()     // Catch:{ Exception -> 0x0342 }
                if (r11 <= 0) goto L_0x032a
                java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ Exception -> 0x0342 }
                r12.<init>()     // Catch:{ Exception -> 0x0342 }
                r14 = 0
            L_0x02e4:
                if (r14 >= r11) goto L_0x0320
                org.json.JSONObject r15 = r10.optJSONObject(r14)     // Catch:{ Exception -> 0x0342 }
                if (r15 != 0) goto L_0x02f1
                r27 = r1
                r16 = r3
                goto L_0x0319
            L_0x02f1:
                r27 = r1
                te3.ja3 r1 = new te3.ja3     // Catch:{ Exception -> 0x0342 }
                r1.<init>()     // Catch:{ Exception -> 0x0342 }
                r16 = r3
                java.lang.String r3 = "className"
                java.lang.String r3 = r15.optString(r3)     // Catch:{ Exception -> 0x0342 }
                r1.f354059d = r3     // Catch:{ Exception -> 0x0342 }
                java.lang.String r3 = "dataPath"
                java.lang.String r3 = r15.optString(r3)     // Catch:{ Exception -> 0x0342 }
                r1.f354060e = r3     // Catch:{ Exception -> 0x0342 }
                java.lang.String r3 = "action"
                java.lang.String r3 = r15.optString(r3)     // Catch:{ Exception -> 0x0342 }
                r1.f354061f = r3     // Catch:{ Exception -> 0x0342 }
                r3 = 0
                r13.mo175242c(r1, r0, r3)     // Catch:{ Exception -> 0x0342 }
                r12.add(r1)     // Catch:{ Exception -> 0x0342 }
            L_0x0319:
                int r14 = r14 + 1
                r1 = r27
                r3 = r16
                goto L_0x02e4
            L_0x0320:
                r27 = r1
                r16 = r3
                java.util.LinkedList<te3.ja3> r1 = r9.f354329e     // Catch:{ Exception -> 0x0342 }
                r1.addAll(r12)     // Catch:{ Exception -> 0x0342 }
                goto L_0x032e
            L_0x032a:
                r27 = r1
                r16 = r3
            L_0x032e:
                r13.mo175243d(r8, r0, r9)     // Catch:{ Exception -> 0x0342 }
                r5.add(r9)     // Catch:{ Exception -> 0x0342 }
            L_0x0334:
                int r7 = r7 + 1
                r1 = r27
                r3 = r16
                goto L_0x02b4
            L_0x033c:
                java.util.LinkedList<te3.s14> r0 = r2.f332316f     // Catch:{ Exception -> 0x0342 }
                r0.addAll(r5)     // Catch:{ Exception -> 0x0342 }
                goto L_0x0366
            L_0x0342:
                r0 = move-exception
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                java.lang.String r3 = r0.getMessage()
                r5 = 0
                r2[r5] = r3
                java.lang.String r3 = "parsePagePath crash-2: %s"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r3, r2)
                goto L_0x0365
            L_0x0354:
                r0 = move-exception
                r1 = 1
                r5 = 0
                java.lang.Object[] r2 = new java.lang.Object[r1]
                java.lang.String r1 = r0.getMessage()
                r2[r5] = r1
                java.lang.String r1 = "parsePagePath crash-1: %s"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r1, r2)
            L_0x0365:
                r2 = 0
            L_0x0366:
                if (r2 != 0) goto L_0x036a
                goto L_0x0007
            L_0x036a:
                if (r6 > 0) goto L_0x0388
                te3.t14 r5 = new te3.t14
                r5.<init>()
                java.util.LinkedList<te3.w14> r0 = r5.f332264d
                r0.add(r2)
                r1 = 1
                java.lang.Object[] r0 = new java.lang.Object[r1]
                long r1 = r2.f332315e
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r2 = 0
                r0[r2] = r1
                java.lang.String r1 = "mEvent, add-1: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r0)
                goto L_0x03e1
            L_0x0388:
                r0 = 0
            L_0x0389:
                if (r0 >= r6) goto L_0x03c4
                r1 = r23
                java.util.LinkedList<te3.w14> r3 = r1.f332264d
                java.lang.Object r3 = r3.get(r0)
                te3.w14 r3 = (te3.C110974w14) r3
                if (r3 != 0) goto L_0x039a
                r3 = r21
                goto L_0x03a6
            L_0x039a:
                long r7 = r3.f332315e
                r3 = r21
                com.tencent.mm.autogen.events.SessionPageConfigChangeEvent$a r5 = r3.f343608d
                long r9 = r5.f343609a
                int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r5 == 0) goto L_0x03ad
            L_0x03a6:
                int r0 = r0 + 1
                r23 = r1
                r21 = r3
                goto L_0x0389
            L_0x03ad:
                r5 = 1
                java.lang.Object[] r3 = new java.lang.Object[r5]
                java.lang.Long r6 = java.lang.Long.valueOf(r7)
                r17 = 0
                r3[r17] = r6
                java.lang.String r6 = "mEvent, update: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r3)
                java.util.LinkedList<te3.w14> r3 = r1.f332264d
                r3.set(r0, r2)
                r0 = 1
                goto L_0x03ca
            L_0x03c4:
                r1 = r23
                r5 = 1
                r17 = 0
                r0 = 0
            L_0x03ca:
                if (r0 != 0) goto L_0x03e0
                java.lang.Object[] r0 = new java.lang.Object[r5]
                long r5 = r2.f332315e
                java.lang.Long r3 = java.lang.Long.valueOf(r5)
                r0[r17] = r3
                java.lang.String r3 = "mEvent, add-2: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r3, r0)
                java.util.LinkedList<te3.w14> r0 = r1.f332264d
                r0.add(r2)
            L_0x03e0:
                r5 = r1
            L_0x03e1:
                if (r5 != 0) goto L_0x03e5
                goto L_0x0007
            L_0x03e5:
                byte[] r0 = r5.toByteArray()     // Catch:{ Exception -> 0x03f0 }
                r1 = r20
                f91.C116850b.m164834d(r1, r0)     // Catch:{ Exception -> 0x03f0 }
                goto L_0x0007
            L_0x03f0:
                r0 = move-exception
                r1 = 0
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r3 = r18
                r4 = r19
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r3, r2)
            L_0x03fb:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.HellSessionPageCloudConfig.C1154081.callback(com.tencent.mm.sdk.event.IEvent):boolean");
        }
    };

    /* renamed from: a */
    public static HellSessionPageCloudConfig m162212a() {
        if (f345916b == null) {
            synchronized (HellSessionPageCloudConfig.class) {
                if (f345916b == null) {
                    f345916b = new HellSessionPageCloudConfig();
                }
            }
        }
        return f345916b;
    }

    /* renamed from: b */
    public C110974w14 mo175241b(long j) {
        C110971t14 a = C113153e.m154822a();
        if (a != null && !a.f332264d.isEmpty()) {
            Iterator<C110974w14> it = a.f332264d.iterator();
            while (it.hasNext()) {
                C110974w14 next = it.next();
                if (next != null && next.f332315e == j) {
                    return next;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public final void mo175242c(C118438ja3 ja32, List list, boolean z) {
        if (list != null && !list.isEmpty()) {
            for (Object next : list) {
                if (next instanceof C50562nl2) {
                    C50562nl2 nl22 = (C50562nl2) next;
                    if (ja32.f354059d.equals(nl22.f138656e)) {
                        String str = nl22.f138657f;
                        ja32.f354062g = str;
                        if (TextUtils.isEmpty(str)) {
                            C58534i.m67953b(124);
                        } else {
                            C58534i.m67953b(138);
                        }
                        Log.m105925i("HABBYGE-MALI.HellSessionPageCloudConfig", "paramPaoguard, classNameProguard: %s, %s, %b", nl22.f138656e, nl22.f138657f, Boolean.valueOf(z));
                    } else if (ja32.f354060e.equals(nl22.f138656e)) {
                        C50562nl2 nl23 = new C50562nl2();
                        ja32.f354063h = nl23;
                        nl23.f138655d = z ^ true ? 1 : 0;
                        String str2 = ja32.f354060e;
                        nl23.f138656e = str2;
                        nl23.f138657f = nl22.f138657f;
                        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(nl22.f138657f)) {
                            C58534i.m67953b(125);
                        } else {
                            C58534i.m67953b(139);
                        }
                        Log.m105925i("HABBYGE-MALI.HellSessionPageCloudConfig", "paramPaoguard, dataPathProguard: type=%s, key=%s, val=%s, isView=%b", Integer.valueOf(ja32.f354063h.f138655d), ja32.f354060e, nl22.f138657f, Boolean.valueOf(z));
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo175243d(JSONObject jSONObject, List list, C118464s14 s142) {
        int length;
        int length2;
        List list2 = list;
        JSONArray optJSONArray = jSONObject.optJSONArray("viewOp");
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            Log.m105925i("HABBYGE-MALI.HellSessionPageCloudConfig", "viewOp, viewOpArrayLength=%d", Integer.valueOf(length));
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject == null) {
                    C118464s14 s143 = s142;
                } else {
                    yr4 yr4 = new yr4();
                    yr4.f354608e = optJSONObject.optInt("type");
                    yr4.f354612i = optJSONObject.optString("viewId");
                    yr4.f354609f = optJSONObject.optString("class");
                    yr4.f354610g = optJSONObject.optInt("action");
                    int i2 = 2;
                    Log.m105925i("HABBYGE-MALI.HellSessionPageCloudConfig", "viewOp, class=%s, resName=%s, type=%d", yr4.f354609f, yr4.f354612i, Integer.valueOf(yr4.f354608e));
                    if (list2 != null && !list.isEmpty()) {
                        for (Object next : list) {
                            if (next instanceof C50562nl2) {
                                C50562nl2 nl22 = (C50562nl2) next;
                                Log.m105925i("HABBYGE-MALI.HellSessionPageCloudConfig", "viewOp, resName=%s, key=%s, val=%s", yr4.f354612i, nl22.f138656e, nl22.f138657f);
                                if (yr4.f354612i.equals(nl22.f138656e)) {
                                    boolean isEmpty = TextUtils.isEmpty(nl22.f138657f);
                                    yr4.f354607d = isEmpty ? yr4.f354612i : nl22.f138657f;
                                    if (isEmpty) {
                                        C58534i.m67953b(126);
                                    } else {
                                        C58534i.m67953b(136);
                                    }
                                } else if (yr4.f354609f.equals(nl22.f138656e)) {
                                    String str = nl22.f138657f;
                                    yr4.f354613j = str;
                                    if (TextUtils.isEmpty(str)) {
                                        C58534i.m67953b(127);
                                    } else {
                                        C58534i.m67953b(137);
                                    }
                                }
                            }
                        }
                    }
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("businessParams");
                    if (optJSONArray2 != null && (length2 = optJSONArray2.length()) > 0) {
                        Log.m105925i("HABBYGE-MALI.HellSessionPageCloudConfig", "viewOp, viewOpParamJArraySize=%d", Integer.valueOf(length2));
                        ArrayList arrayList = new ArrayList();
                        int i3 = 0;
                        while (i3 < length2) {
                            JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i3);
                            if (optJSONObject2 != null) {
                                C118438ja3 ja32 = new C118438ja3();
                                ja32.f354059d = optJSONObject2.optString("className");
                                ja32.f354060e = optJSONObject2.optString("dataPath");
                                mo175242c(ja32, list2, true);
                                Object[] objArr = new Object[i2];
                                objArr[0] = ja32.f354059d;
                                objArr[1] = ja32.f354060e;
                                Log.m105925i("HABBYGE-MALI.HellSessionPageCloudConfig", "viewOp, pageParam.className=%s, pageParam.dataPath=%s, ", objArr);
                                arrayList.add(ja32);
                            }
                            i3++;
                            i2 = 2;
                        }
                        yr4.f354611h.addAll(arrayList);
                        Log.m105925i("HABBYGE-MALI.HellSessionPageCloudConfig", "viewOp, viewOp.businessParams=%d", Integer.valueOf(yr4.f354611h.size()));
                    }
                    s142.f354330f.addLast(yr4);
                }
            }
        }
    }
}
