package com.tencent.p014mm.plugin.appbrand.report.model;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.C84072q1;
import com.tencent.p014mm.plugin.appbrand.appcache.C81289m;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import org.json.JSONException;
import org.json.JSONObject;
import p1044ub.C90630c;
import p206nj.C117627q;
import p963fc.C86812g;
import wi0.C90973a0;

/* renamed from: com.tencent.mm.plugin.appbrand.report.model.e */
public final class C84141e {
    /* renamed from: a */
    public static void m103705a(C86812g gVar, JSONObject jSONObject) {
        try {
            if (C81289m.C81290a.m99663a(gVar.mo113036W().f239365g) && !TextUtils.isEmpty(gVar.mo113036W().f234808L)) {
                jSONObject.put("debugLaunchInfo", new JSONObject(gVar.mo113036W().f234808L));
            }
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.AppBrandPageVisitStatisticsHelper", "fillDebugLaunchInfo ex = %s", e);
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000a */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004d A[SYNTHETIC, Splitter:B:15:0x004d] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0014 A[Catch:{ JSONException -> 0x001b }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m103706b(p963fc.C86812g r7, org.json.JSONObject r8, boolean r9) {
        /*
            java.lang.String r0 = "scene"
            int r1 = r7.mo113208k1()     // Catch:{ JSONException -> 0x000a }
            r8.put(r0, r1)     // Catch:{ JSONException -> 0x000a }
        L_0x000a:
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r0 = r7.mo113036W()     // Catch:{ JSONException -> 0x001b }
            org.json.JSONObject r0 = r0.mo111301m()     // Catch:{ JSONException -> 0x001b }
            if (r0 == 0) goto L_0x001c
            java.lang.String r1 = "shareInfo"
            r8.put(r1, r0)     // Catch:{ JSONException -> 0x001b }
            goto L_0x001c
        L_0x001b:
        L_0x001c:
            cc.a r0 = r7.mo113042Z()
            com.tencent.mm.plugin.appbrand.report.model.j r0 = r0.getReporter()
            com.tencent.mm.plugin.appbrand.report.model.l r0 = r0.mo115894l()
            r1 = 0
            java.lang.String r2 = "fillEventOnAppEnterForeground"
            java.lang.String r3 = "MicroMsg.AppBrandPageVisitStatisticsHelper"
            java.lang.String r4 = "isEntrance"
            if (r9 == 0) goto L_0x004d
            m103709e(r7, r8)
            m103705a(r7, r8)
            m103707c(r7, r8)
            java.lang.String r7 = r7.mo113030T()     // Catch:{ Exception -> 0x0046 }
            boolean r7 = r0.mo116806i(r7)     // Catch:{ Exception -> 0x0046 }
            r8.put(r4, r7)     // Catch:{ Exception -> 0x0046 }
            goto L_0x004c
        L_0x0046:
            r7 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r7, r2, r8)
        L_0x004c:
            return
        L_0x004d:
            m103708d(r7, r8)     // Catch:{ Exception -> 0x008f }
            m103705a(r7, r8)     // Catch:{ Exception -> 0x008f }
            m103707c(r7, r8)     // Catch:{ Exception -> 0x008f }
            cc.a r9 = r7.mo113042Z()     // Catch:{ Exception -> 0x008f }
            com.tencent.mm.plugin.appbrand.report.model.j r9 = r9.getReporter()     // Catch:{ Exception -> 0x008f }
            com.tencent.mm.plugin.appbrand.report.model.l r9 = r9.mo115894l()     // Catch:{ Exception -> 0x008f }
            com.tencent.mm.plugin.appbrand.report.model.l$b r9 = r9.peek()     // Catch:{ Exception -> 0x008f }
            com.tencent.mm.plugin.appbrand.report.model.l$c r9 = r9.f245692d     // Catch:{ Exception -> 0x008f }
            java.lang.String r5 = "referpagepath"
            if (r9 != 0) goto L_0x006f
            r9 = 0
            goto L_0x0071
        L_0x006f:
            java.lang.String r9 = r9.f245693a     // Catch:{ Exception -> 0x008f }
        L_0x0071:
            r8.put(r5, r9)     // Catch:{ Exception -> 0x008f }
            java.lang.String r9 = "clickTimestamp"
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r5 = r7.mo113036W()     // Catch:{ Exception -> 0x008f }
            long r5 = r5.f234800D     // Catch:{ Exception -> 0x008f }
            r8.put(r9, r5)     // Catch:{ Exception -> 0x008f }
            cc.a r7 = r7.mo113042Z()     // Catch:{ Exception -> 0x008f }
            java.lang.String r7 = r7.getCurrentUrl()     // Catch:{ Exception -> 0x008f }
            boolean r7 = r0.mo116806i(r7)     // Catch:{ Exception -> 0x008f }
            r8.put(r4, r7)     // Catch:{ Exception -> 0x008f }
            goto L_0x0095
        L_0x008f:
            r7 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r7, r2, r8)
        L_0x0095:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.report.model.C84141e.m103706b(fc.g, org.json.JSONObject, boolean):void");
    }

    /* renamed from: c */
    public static void m103707c(C86812g gVar, JSONObject jSONObject) {
        try {
            jSONObject.put("isTransparentBackgroundSupport", gVar.mo113036W().mo111304q() == C90973a0.TRANSPARENT && !gVar.mo113216s1());
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.AppBrandPageVisitStatisticsHelper", "fillTransparentBackground ex = %s", e);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02ef A[FALL_THROUGH] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02d4  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m103708d(p963fc.C86812g r18, org.json.JSONObject r19) {
        /*
            r1 = r18
            r2 = r19
            com.tencent.mm.plugin.appbrand.appstorage.b0 r3 = com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0.OK
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r0 = r18.mo121253n1()
            int r0 = r0.f245533f
            java.lang.String r4 = "scene"
            r2.put(r4, r0)
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r0 = r18.mo121253n1()
            java.lang.String r0 = r0.f245534g
            java.lang.String r4 = "scene_note"
            r2.put(r4, r0)
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r0 = r18.mo113036W()
            java.lang.String r0 = r0.f234837q
            java.lang.String r4 = "sessionId"
            r2.put(r4, r0)
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r0 = r18.mo121253n1()
            int r0 = r0.f245535h
            java.lang.String r4 = "usedState"
            r2.put(r4, r0)
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r0 = r18.mo121253n1()
            int r0 = r0.f245531d
            java.lang.String r4 = "prescene"
            r2.put(r4, r0)
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r0 = r18.mo121253n1()
            java.lang.String r0 = r0.f245532e
            java.lang.String r4 = "prescene_note"
            r2.put(r4, r0)
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r0 = r18.mo113036W()
            java.lang.String r0 = r0.f234830Z
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x005f
            java.lang.String r4 = "chatroomUsername"
            r2.put(r4, r0)
        L_0x005f:
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r0 = r18.mo113036W()
            java.lang.String r0 = r0.f234836p0
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x0071
            java.lang.String r4 = "shortLink"
            r2.put(r4, r0)
        L_0x0071:
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r0 = r18.mo113036W()
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r0 = r0.f234834c1
            int r0 = r0.f245541q
            r4 = -1
            if (r0 == r4) goto L_0x0081
            java.lang.String r5 = "chatType"
            r2.put(r5, r0)
        L_0x0081:
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r0 = r18.mo113036W()
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r0 = r0.f234834c1
            int r0 = r0.f245542r
            if (r0 <= 0) goto L_0x0090
            java.lang.String r5 = "codeScene"
            r2.put(r5, r0)
        L_0x0090:
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r0 = r18.mo113036W()
            java.lang.String r0 = r0.f234807K
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r5 = ""
            java.lang.String r6 = "MicroMsg.AppBrandPageVisitStatisticsHelper"
            r7 = 2
            r8 = 1
            r9 = 3
            r10 = 0
            if (r0 != 0) goto L_0x0242
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r0 = r18.mo113036W()
            java.lang.String r0 = r0.f234807K
            r11 = 1173(0x495, float:1.644E-42)
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r12 = r18.mo121253n1()
            int r12 = r12.f245533f
            if (r11 != r12) goto L_0x01b2
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r11 == 0) goto L_0x00bc
            goto L_0x01b2
        L_0x00bc:
            iq0.a$a r11 = iq0.C87791a.f254157h
            iq0.a r11 = r11.mo122239a(r0)
            if (r11 != 0) goto L_0x00c6
            goto L_0x01b2
        L_0x00c6:
            java.lang.String r12 = r11.f254159e
            java.lang.String r12 = r12.trim()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "preProcessNativeExtraData4OpenMaterial, originMaterialPath: "
            r13.append(r14)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r13)
            java.lang.String r13 = "http://"
            boolean r13 = r12.startsWith(r13)
            if (r13 != 0) goto L_0x01b2
            java.lang.String r13 = "https://"
            boolean r13 = r12.startsWith(r13)
            if (r13 == 0) goto L_0x00f3
            goto L_0x01b2
        L_0x00f3:
            java.lang.String r11 = r11.f254158d
            java.lang.String r13 = "image"
            boolean r13 = r11.startsWith(r13)
            if (r13 != 0) goto L_0x010b
            java.lang.String r13 = "video"
            boolean r13 = r11.startsWith(r13)
            if (r13 != 0) goto L_0x010b
            java.lang.String r13 = s24.C90124b.m112769d(r12)
            goto L_0x010c
        L_0x010b:
            r13 = r5
        L_0x010c:
            java.lang.String r14 = s24.C90124b.m112768c(r12)
            com.tencent.mm.vfs.m1 r15 = new com.tencent.mm.vfs.m1
            r15.<init>((java.lang.String) r12)
            r16 = r5
            long r4 = r15.mo119980r()
            int r5 = (int) r4
            java.lang.Object[] r4 = new java.lang.Object[r9]
            r4[r10] = r13
            r4[r8] = r14
            java.lang.Integer r17 = java.lang.Integer.valueOf(r5)
            r4[r7] = r17
            java.lang.String r12 = "preProcessNativeExtraData4OpenMaterial, fileName: %s, fileExt: %s，fileSize: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r12, r4)
            js0.m r4 = new js0.m
            r4.<init>()
            com.tencent.mm.plugin.appbrand.appstorage.h0 r12 = r1.f238163z
            com.tencent.mm.plugin.appbrand.jsapi.file.d1 r12 = (com.tencent.p014mm.plugin.appbrand.jsapi.file.C82419d1) r12
            com.tencent.mm.plugin.appbrand.appstorage.b0 r12 = r12.createTempFileFrom(r15, r14, r10, r4)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "preProcessNativeExtraData4OpenMaterial, result: "
            r14.append(r15)
            r14.append(r12)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r14)
            if (r3 == r12) goto L_0x0153
            goto L_0x01b4
        L_0x0153:
            T r0 = r4.f29691a
            java.lang.String r0 = (java.lang.String) r0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r12 = "preProcessNativeExtraData4OpenMaterial, newMaterialPath: "
            r4.append(r12)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r4)
            java.lang.String r4 = "mimeType"
            java.lang.String r12 = "materialPath"
            gy3.C87412m.m108594g(r0, r12)
            java.lang.String r14 = "materialName"
            gy3.C87412m.m108594g(r13, r14)
            org.json.JSONObject r15 = new org.json.JSONObject     // Catch:{ Exception -> 0x0190 }
            r15.<init>()     // Catch:{ Exception -> 0x0190 }
            r15.put(r4, r11)     // Catch:{ Exception -> 0x0190 }
            r15.put(r12, r0)     // Catch:{ Exception -> 0x0190 }
            r15.put(r14, r13)     // Catch:{ Exception -> 0x0190 }
            java.lang.String r0 = "materialSize"
            r15.put(r0, r5)     // Catch:{ Exception -> 0x0190 }
            java.lang.String r0 = r15.toString()     // Catch:{ Exception -> 0x0190 }
            goto L_0x01ab
        L_0x0190:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "toJsonString fail since "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.String r4 = "MicroMsg.AppBrand.AppBrandOpenMaterialNativeExtraData"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            java.lang.String r0 = "{}"
        L_0x01ab:
            java.lang.String r4 = "try {\n            val js…     EMPTY_JSON\n        }"
            gy3.C87412m.m108593f(r0, r4)
            goto L_0x01b4
        L_0x01b2:
            r16 = r5
        L_0x01b4:
            r4 = r0
            wi0.a0 r0 = wi0.C90973a0.TRANSPARENT
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r5 = r18.mo113036W()
            wi0.a0 r5 = r5.mo111304q()
            if (r0 != r5) goto L_0x022c
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r0 = r18.mo113036W()
            com.tencent.luggage.sdk.config.AppBrandInitWindowConfig r0 = r0.f234828Y
            r5 = 0
            if (r0 != 0) goto L_0x01cc
            r0 = r5
            goto L_0x01ce
        L_0x01cc:
            java.lang.String r0 = r0.f234852g
        L_0x01ce:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x022c
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0221 }
            r0.<init>(r4)     // Catch:{ JSONException -> 0x0221 }
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r11 = r18.mo113036W()
            com.tencent.luggage.sdk.config.AppBrandInitWindowConfig r11 = r11.f234828Y
            if (r11 != 0) goto L_0x01e2
            goto L_0x01e4
        L_0x01e2:
            java.lang.String r5 = r11.f234852g
        L_0x01e4:
            java.lang.String r11 = s24.C90124b.m112768c(r5)
            js0.m r12 = new js0.m
            r12.<init>()
            com.tencent.mm.plugin.appbrand.appstorage.h0 r13 = r1.f238163z
            com.tencent.mm.plugin.appbrand.jsapi.file.d1 r13 = (com.tencent.p014mm.plugin.appbrand.jsapi.file.C82419d1) r13
            com.tencent.mm.vfs.m1 r14 = new com.tencent.mm.vfs.m1
            r14.<init>((java.lang.String) r5)
            com.tencent.mm.plugin.appbrand.appstorage.b0 r5 = r13.createTempFileFrom(r14, r11, r10, r12)
            if (r3 == r5) goto L_0x01fd
            goto L_0x022c
        L_0x01fd:
            T r3 = r12.f29691a
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r5 = "windowBackgroundImageFilePath"
            r0.put(r5, r3)     // Catch:{ JSONException -> 0x0215 }
            java.lang.String r3 = "isWindowTransparencyDisabledByCompatibilityIssues"
            boolean r5 = r18.mo113216s1()     // Catch:{ JSONException -> 0x0215 }
            r0.put(r3, r5)     // Catch:{ JSONException -> 0x0215 }
            java.lang.String r4 = r0.toString()
            goto L_0x022c
        L_0x0215:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r8]
            r3[r10] = r0
            java.lang.String r0 = "preProcessNativeExtraData4WindowBackgroundImage put extra fields get exception %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r0, r3)
            goto L_0x022c
        L_0x0221:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r8]
            r3[r10] = r0
            java.lang.String r0 = "preProcessNativeExtraData4WindowBackgroundImage parse nativeExtraDataStr get exception %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r0, r3)
        L_0x022c:
            java.lang.String r0 = "nativeExtraData"
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0239 }
            r3.<init>(r4)     // Catch:{ JSONException -> 0x0239 }
            r2.put(r0, r3)     // Catch:{ JSONException -> 0x0239 }
            r4 = r16
            goto L_0x0243
        L_0x0239:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r10]
            r4 = r16
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r4, r3)
            goto L_0x0243
        L_0x0242:
            r4 = r5
        L_0x0243:
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r0 = r18.mo113036W()
            android.os.PersistableBundle r0 = r0.f234809M
            if (r0 == 0) goto L_0x0268
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0268
            java.lang.String r0 = "transitExtraData"
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r3 = r18.mo113036W()     // Catch:{ JSONException -> 0x0262 }
            android.os.PersistableBundle r3 = r3.f234809M     // Catch:{ JSONException -> 0x0262 }
            org.json.JSONObject r3 = p225rc.C48016e.m53375a(r3)     // Catch:{ JSONException -> 0x0262 }
            r2.put(r0, r3)     // Catch:{ JSONException -> 0x0262 }
            goto L_0x0268
        L_0x0262:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r10]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r4, r3)
        L_0x0268:
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r0 = r18.mo113036W()
            int r0 = r0.f239365g
            boolean r0 = com.tencent.p014mm.plugin.appbrand.appcache.C81289m.C81290a.m99663a(r0)
            if (r0 == 0) goto L_0x0276
            r0 = 0
            goto L_0x027c
        L_0x0276:
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r0 = r18.mo113036W()
            int r0 = r0.f234802F
        L_0x027c:
            java.lang.String r3 = "appversion"
            r2.put(r3, r0)
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r0 = r18.mo113036W()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r0 = r0.f234815R0
            boolean r0 = r0.mo76931c()
            java.lang.String r3 = "halfPage"
            java.lang.String r4 = "embedded"
            java.lang.String r5 = "singlePage"
            java.lang.String r6 = "default"
            if (r0 == 0) goto L_0x02b2
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r0 = r18.mo113036W()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r0 = r0.f234815R0
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$e r0 = r0.f157932C
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$e r11 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55455e.EMBED
            if (r0 != r11) goto L_0x02a5
            r0 = r4
            r11 = -1
            goto L_0x02be
        L_0x02a5:
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r0 = r18.mo113036W()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r0 = r0.f234815R0
            int r0 = r0.f157944d
            r11 = -1
            if (r0 == r11) goto L_0x02bd
            r0 = r3
            goto L_0x02be
        L_0x02b2:
            r11 = -1
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r0 = r18.mo113036W()
            int r0 = r0.f234813Q0
            if (r0 != r8) goto L_0x02bd
            r0 = r5
            goto L_0x02be
        L_0x02bd:
            r0 = r6
        L_0x02be:
            java.lang.String r12 = "mode"
            r2.put(r12, r0)
            int r12 = r0.hashCode()
            switch(r12) {
                case -54180510: goto L_0x02e6;
                case 785848970: goto L_0x02dd;
                case 913503991: goto L_0x02d4;
                case 1544803905: goto L_0x02cb;
                default: goto L_0x02ca;
            }
        L_0x02ca:
            goto L_0x02ef
        L_0x02cb:
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x02d2
            goto L_0x02ef
        L_0x02d2:
            r4 = 3
            goto L_0x02f0
        L_0x02d4:
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x02db
            goto L_0x02ef
        L_0x02db:
            r4 = 2
            goto L_0x02f0
        L_0x02dd:
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x02e4
            goto L_0x02ef
        L_0x02e4:
            r4 = 1
            goto L_0x02f0
        L_0x02e6:
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x02ed
            goto L_0x02ef
        L_0x02ed:
            r4 = 0
            goto L_0x02f0
        L_0x02ef:
            r4 = -1
        L_0x02f0:
            java.lang.String r0 = "appearance"
            if (r4 == 0) goto L_0x0311
            if (r4 == r8) goto L_0x030d
            if (r4 == r7) goto L_0x02fb
            if (r4 == r9) goto L_0x0311
            goto L_0x0333
        L_0x02fb:
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r1 = r18.mo113036W()
            int r1 = r1.f234819T0
            if (r1 != 0) goto L_0x0307
            r2.put(r0, r6)
            goto L_0x0333
        L_0x0307:
            java.lang.String r1 = "banned"
            r2.put(r0, r1)
            goto L_0x0333
        L_0x030d:
            r2.put(r0, r6)
            goto L_0x0333
        L_0x0311:
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r3 = r18.mo113036W()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r3 = r3.f234815R0
            if (r3 == 0) goto L_0x0330
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r1 = r18.mo113036W()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r1 = r1.f234815R0
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$c r1 = r1.f157950j
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$c r3 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55453c.SINGLE_CLOSE
            if (r1 != r3) goto L_0x0326
            goto L_0x0327
        L_0x0326:
            r8 = 0
        L_0x0327:
            if (r8 != 0) goto L_0x032a
            goto L_0x0330
        L_0x032a:
            java.lang.String r1 = "nativeFunctionalized"
            r2.put(r0, r1)
            goto L_0x0333
        L_0x0330:
            r2.put(r0, r6)
        L_0x0333:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.report.model.C84141e.m103708d(fc.g, org.json.JSONObject):void");
    }

    /* renamed from: e */
    public static void m103709e(C86812g gVar, JSONObject jSONObject) {
        try {
            m103708d(gVar, jSONObject);
            jSONObject.put("referpagepath", m103711g(gVar.mo113036W().f234846y));
            jSONObject.put("clickTimestamp", gVar.mo113036W().f234800D);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrandPageVisitStatisticsHelper", "fillWxConfigLaunchInfo ex = %s", e);
        }
    }

    /* renamed from: f */
    public static Pair<Integer, String> m103710f(C90630c cVar) {
        String str;
        int ordinal = C83231l.m102143d(cVar.getAppId()).ordinal();
        int i = 3;
        int i2 = 7;
        String str2 = null;
        if (ordinal == 0) {
            if (cVar.f260370X0.mo116802d()) {
                i = 4;
            }
            i2 = i;
        } else if (ordinal != 1) {
            if (ordinal == 3) {
                i2 = 6;
            } else if (ordinal != 7) {
                Intent n = cVar.getRuntime().mo113042Z().getReporter().mo115896n();
                if (n != null) {
                    if (n.getComponent() == null) {
                        Log.m105921e("MicroMsg.AppBrandPageVisitStatisticsHelper", "onBackground, intent %s, get null cmp name", n);
                        str = "";
                    } else {
                        str = n.getComponent().getClassName();
                    }
                    if (str.contains("WebViewUI")) {
                        str2 = IntentUtil.getStringExtra(n, "appbrand_report_key_target_url");
                        i2 = 10;
                    } else {
                        str2 = Util.nullAs(IntentUtil.getStringExtra(n, "appbrand_report_key_target_activity"), str);
                        i2 = 8;
                    }
                }
            } else {
                i2 = 9;
                str2 = C84072q1.m103587b(cVar.getAppId()).f245460d + XVFSFile.PATH_SEPARATOR + C117627q.m165908a(Util.nullAsNil(C84072q1.m103587b(cVar.getAppId()).f245461e));
            }
        } else if (cVar.f260370X0.mo116802d()) {
            i2 = 5;
        }
        return Pair.create(Integer.valueOf(i2), str2);
    }

    /* renamed from: g */
    public static String m103711g(AppBrandLaunchReferrer appBrandLaunchReferrer) {
        if (appBrandLaunchReferrer == null) {
            return null;
        }
        int i = appBrandLaunchReferrer.f239396d;
        return (1 == i || 3 == i) ? appBrandLaunchReferrer.f239397e : 2 == i ? appBrandLaunchReferrer.f239401i : "";
    }
}
