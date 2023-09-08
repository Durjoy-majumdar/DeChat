package com.tencent.p014mm.plugin.appbrand.v8_snapshot;

import com.eclipsesource.mmv8.C80135V8;
import com.eclipsesource.mmv8.snapshot.ContextBootstrapParams;
import com.eclipsesource.mmv8.snapshot.CreateSnapshotParams;
import com.eclipsesource.mmv8.snapshot.CreateSnapshotResult;
import com.eclipsesource.mmv8.snapshot.SnapshotCreator;
import com.eclipsesource.mmv8.snapshot.SnapshotScriptInfo;
import com.tencent.p014mm.appbrand.p942v8.C80658e;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import java.util.List;
import sx3.C64197v;

/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.g0 */
public final class C84841g0 {

    /* renamed from: a */
    public static final C84841g0 f247320a = new C84841g0();

    /* renamed from: a */
    public final CreateSnapshotResult mo117578a(ICommLibReader iCommLibReader, WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo) {
        CreateSnapshotParams createSnapshotParams;
        String i;
        C87412m.m108594g(iCommLibReader, "commLibReader");
        C87412m.m108594g(wxaPkgV8SnapshotInfo, "snapshotInfo");
        Log.m105924i("MicroMsg.WxaCommLibV8SnapshotCreateLogic", "doCreateNodeOnlySnapshot, commLibReader: " + iCommLibReader);
        boolean z = C80658e.f236022a;
        C84880y yVar = C84880y.f247398b;
        yVar.getClass();
        yVar.f247399a.getClass();
        C86009m1 b = C84847k0.f247331a.mo117591b(wxaPkgV8SnapshotInfo);
        boolean z2 = true;
        if (b == null || (i = C86013q1.m106448i(b.mo119971i(), true)) == null) {
            Log.m105920e("MicroMsg.WxaCommLibCreateSnapshotParamsCreator", "WxaCommLibFeatureCreateSnapshotParamsCreator#createNodeOnly, snapshotDirPath is null");
            createSnapshotParams = null;
        } else {
            createSnapshotParams = new CreateSnapshotParams(false, (SnapshotScriptInfo) null, C64197v.m75534c(new ContextBootstrapParams.Builder().name(WxaPkgV8SnapshotInfo.f247265v.mo117563b(wxaPkgV8SnapshotInfo.f247272h)).setupNodeEnv(true).build()), (List<SnapshotScriptInfo>) null, C84831a0.f247292a, i);
        }
        if (createSnapshotParams == null) {
            return new CreateSnapshotResult.Failure(-203, "Create params failure");
        }
        C84868u0.f247366a.mo117620q(iCommLibReader, createSnapshotParams);
        yVar.f247399a.getClass();
        if ("".length() <= 0) {
            z2 = false;
        }
        if (z2) {
            yVar.f247399a.getClass();
            C80135V8.setFlags("");
        }
        CreateSnapshotResult create = SnapshotCreator.create(createSnapshotParams);
        Log.m105924i("MicroMsg.WxaCommLibV8SnapshotCreateLogic", "doCreateNodeOnlySnapshot, result: " + create);
        C87412m.m108593f(create, "result");
        return create;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01ee  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.eclipsesource.mmv8.snapshot.CreateSnapshotResult mo117579b(com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader r28, com.tencent.p014mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo r29, boolean r30) {
        /*
            r27 = this;
            r1 = r28
            r2 = r29
            r3 = r30
            java.lang.String r0 = "commLibReader"
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "snapshotInfo"
            gy3.C87412m.m108594g(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "doCreateSnapshot, commLibReader: "
            r0.append(r4)
            r0.append(r1)
            java.lang.String r4 = ", enableNodeSnapshot: "
            r0.append(r4)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "MicroMsg.WxaCommLibV8SnapshotCreateLogic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            boolean r0 = com.tencent.p014mm.appbrand.p942v8.C80658e.f236022a
            com.tencent.mm.plugin.appbrand.v8_snapshot.y r0 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84880y.f247398b
            r0.getClass()
            com.tencent.mm.plugin.appbrand.v8_snapshot.b0 r0 = r0.f247399a
            r0.getClass()
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            kr0.h1 r0 = new kr0.h1
            r0.<init>()
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            r0.mo114862a(r7)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.String r8 = "isSnapshoting"
            r9 = 0
            r7.put(r8, r0)     // Catch:{ Exception -> 0x0054 }
            goto L_0x0060
        L_0x0054:
            r0 = move-exception
            r8 = r0
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.String r10 = "MicroMsg.WASnapshotConfigProvider"
            java.lang.String r11 = "put with key(isSnapshoting)"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r8, r11, r0)
        L_0x0060:
            r6[r9] = r7
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r6, r5)
            java.lang.String r6 = "\n    globalThis.__wxConfig = %s;\n    "
            java.lang.String r0 = java.lang.String.format(r6, r0)
            java.lang.String r6 = "format(this, *args)"
            gy3.C87412m.m108593f(r0, r6)
            boolean r6 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84831a0.f247292a
            com.eclipsesource.mmv8.snapshot.SnapshotScriptInfo r12 = new com.eclipsesource.mmv8.snapshot.SnapshotScriptInfo
            java.lang.String r6 = "wxa_comm_lib_v8_snapshot_glue.js"
            r12.<init>(r6, r0)
            com.tencent.mm.plugin.appbrand.v8_snapshot.k0 r0 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84847k0.f247331a
            com.tencent.mm.vfs.m1 r0 = r0.mo117591b(r2)
            java.lang.String r6 = "MicroMsg.WxaCommLibCreateSnapshotParamsCreator"
            if (r0 == 0) goto L_0x01da
            java.lang.String r0 = r0.mo119971i()
            java.lang.String r16 = com.tencent.p014mm.vfs.C86013q1.m106448i(r0, r5)
            if (r16 == 0) goto L_0x01da
            java.lang.String r0 = "snapshotConfig"
            java.lang.String r0 = r1.Yk0(r0)
            if (r0 != 0) goto L_0x009f
            java.lang.String r0 = "WxaCommLibFeatureCreateSnapshotParamsCreator#create, snapshotConfig is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            goto L_0x013f
        L_0x009f:
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x017a }
            r7.<init>(r0)     // Catch:{ Exception -> 0x017a }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ Exception -> 0x017a }
            r13.<init>()     // Catch:{ Exception -> 0x017a }
            java.util.Iterator r0 = r7.keys()     // Catch:{ Exception -> 0x017a }
            java.lang.String r8 = "config.keys()"
            gy3.C87412m.m108593f(r0, r8)     // Catch:{ Exception -> 0x017a }
            r8 = 0
        L_0x00b3:
            boolean r10 = r0.hasNext()     // Catch:{ Exception -> 0x017a }
            if (r10 == 0) goto L_0x018c
            java.lang.Object r10 = r0.next()     // Catch:{ Exception -> 0x017a }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x017a }
            java.lang.String r11 = "name"
            gy3.C87412m.m108593f(r10, r11)     // Catch:{ Exception -> 0x017a }
            com.tencent.mm.plugin.appbrand.v8_snapshot.v0 r11 = r2.f247272h     // Catch:{ Exception -> 0x017a }
            java.lang.String r11 = r11.f247381d     // Catch:{ Exception -> 0x017a }
            boolean r11 = z04.C112551y.m153819s(r10, r11, r9)     // Catch:{ Exception -> 0x017a }
            if (r11 != 0) goto L_0x00cf
            goto L_0x00b3
        L_0x00cf:
            org.json.JSONArray r11 = r7.getJSONArray(r10)     // Catch:{ Exception -> 0x017a }
            int r14 = r11.length()     // Catch:{ Exception -> 0x017a }
            if (r14 > 0) goto L_0x00df
            java.lang.String r10 = "WxaCommLibFeatureCreateSnapshotParamsCreator#create, empty bootstraps is invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r10)     // Catch:{ Exception -> 0x017a }
            goto L_0x00b3
        L_0x00df:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ Exception -> 0x017a }
            r14.<init>()     // Catch:{ Exception -> 0x017a }
            int r15 = r11.length()     // Catch:{ Exception -> 0x017a }
        L_0x00e8:
            if (r9 >= r15) goto L_0x0143
            java.lang.String r5 = r11.getString(r9)     // Catch:{ Exception -> 0x017a }
            r24 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017a }
            r0.<init>()     // Catch:{ Exception -> 0x017a }
            r25 = r7
            java.lang.String r7 = "WxaCommLibFeatureCreateSnapshotParamsCreator#create, script: "
            r0.append(r7)     // Catch:{ Exception -> 0x017a }
            r0.append(r5)     // Catch:{ Exception -> 0x017a }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x017a }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r0)     // Catch:{ Exception -> 0x017a }
            android.content.res.AssetFileDescriptor r0 = r1.mo113382g(r5)     // Catch:{ Exception -> 0x017a }
            if (r0 == 0) goto L_0x013a
            java.lang.String r7 = "script"
            gy3.C87412m.m108593f(r5, r7)     // Catch:{ Exception -> 0x017a }
            android.os.ParcelFileDescriptor r7 = r0.getParcelFileDescriptor()     // Catch:{ Exception -> 0x017a }
            r26 = r11
            com.eclipsesource.mmv8.snapshot.SnapshotScriptInfo r11 = new com.eclipsesource.mmv8.snapshot.SnapshotScriptInfo     // Catch:{ Exception -> 0x017a }
            int r19 = r7.detachFd()     // Catch:{ Exception -> 0x017a }
            long r20 = r0.getStartOffset()     // Catch:{ Exception -> 0x017a }
            long r22 = r0.getLength()     // Catch:{ Exception -> 0x017a }
            r17 = r11
            r18 = r5
            r17.<init>(r18, r19, r20, r22)     // Catch:{ Exception -> 0x017a }
            r14.add(r11)     // Catch:{ Exception -> 0x017a }
            int r9 = r9 + 1
            r0 = r24
            r7 = r25
            r11 = r26
            r5 = 1
            goto L_0x00e8
        L_0x013a:
            java.lang.String r0 = "WxaCommLibFeatureCreateSnapshotParamsCreator#create, fd is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)     // Catch:{ Exception -> 0x017a }
        L_0x013f:
            r2 = 1
            r3 = 0
            goto L_0x01e1
        L_0x0143:
            r24 = r0
            r25 = r7
            com.eclipsesource.mmv8.snapshot.ContextBootstrapParams$Builder r0 = new com.eclipsesource.mmv8.snapshot.ContextBootstrapParams$Builder     // Catch:{ Exception -> 0x017a }
            r0.<init>()     // Catch:{ Exception -> 0x017a }
            com.eclipsesource.mmv8.snapshot.ContextBootstrapParams$Builder r0 = r0.name(r10)     // Catch:{ Exception -> 0x017a }
            java.util.Iterator r5 = r14.iterator()     // Catch:{ Exception -> 0x017a }
        L_0x0154:
            boolean r7 = r5.hasNext()     // Catch:{ Exception -> 0x017a }
            if (r7 == 0) goto L_0x0164
            java.lang.Object r7 = r5.next()     // Catch:{ Exception -> 0x017a }
            com.eclipsesource.mmv8.snapshot.SnapshotScriptInfo r7 = (com.eclipsesource.mmv8.snapshot.SnapshotScriptInfo) r7     // Catch:{ Exception -> 0x017a }
            r0.appendBootstrapScriptInfo(r7)     // Catch:{ Exception -> 0x017a }
            goto L_0x0154
        L_0x0164:
            if (r3 == 0) goto L_0x017d
            com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo$c r5 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo.f247265v     // Catch:{ Exception -> 0x017a }
            com.tencent.mm.plugin.appbrand.v8_snapshot.v0 r7 = r2.f247272h     // Catch:{ Exception -> 0x017a }
            java.lang.String r5 = r5.mo117563b(r7)     // Catch:{ Exception -> 0x017a }
            boolean r5 = gy3.C87412m.m108589b(r10, r5)     // Catch:{ Exception -> 0x017a }
            if (r5 == 0) goto L_0x017d
            r5 = 1
            r0.setupNodeEnv(r5)     // Catch:{ Exception -> 0x017a }
            r8 = 1
            goto L_0x017d
        L_0x017a:
            r0 = move-exception
            r2 = 1
            goto L_0x01b5
        L_0x017d:
            com.eclipsesource.mmv8.snapshot.ContextBootstrapParams r0 = r0.build()     // Catch:{ Exception -> 0x017a }
            r13.add(r0)     // Catch:{ Exception -> 0x017a }
            r0 = r24
            r7 = r25
            r5 = 1
            r9 = 0
            goto L_0x00b3
        L_0x018c:
            if (r3 == 0) goto L_0x01b7
            if (r8 != 0) goto L_0x01b7
            java.lang.String r0 = "WxaCommLibFeatureCreateSnapshotParamsCreator#create, node context not added, add it first"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)     // Catch:{ Exception -> 0x017a }
            com.eclipsesource.mmv8.snapshot.ContextBootstrapParams$Builder r0 = new com.eclipsesource.mmv8.snapshot.ContextBootstrapParams$Builder     // Catch:{ Exception -> 0x017a }
            r0.<init>()     // Catch:{ Exception -> 0x017a }
            com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo$c r2 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo.f247265v     // Catch:{ Exception -> 0x017a }
            com.tencent.mm.plugin.appbrand.v8_snapshot.v0 r3 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84872v0.NODE     // Catch:{ Exception -> 0x017a }
            java.lang.String r2 = r2.mo117563b(r3)     // Catch:{ Exception -> 0x017a }
            com.eclipsesource.mmv8.snapshot.ContextBootstrapParams$Builder r0 = r0.name(r2)     // Catch:{ Exception -> 0x017a }
            r2 = 1
            com.eclipsesource.mmv8.snapshot.ContextBootstrapParams$Builder r0 = r0.setupNodeEnv(r2)     // Catch:{ Exception -> 0x01b4 }
            com.eclipsesource.mmv8.snapshot.ContextBootstrapParams r0 = r0.build()     // Catch:{ Exception -> 0x01b4 }
            r3 = 0
            r13.add(r3, r0)     // Catch:{ Exception -> 0x01c4 }
            goto L_0x01b9
        L_0x01b4:
            r0 = move-exception
        L_0x01b5:
            r3 = 0
            goto L_0x01c5
        L_0x01b7:
            r2 = 1
            r3 = 0
        L_0x01b9:
            com.eclipsesource.mmv8.snapshot.CreateSnapshotParams r0 = new com.eclipsesource.mmv8.snapshot.CreateSnapshotParams     // Catch:{ Exception -> 0x01c4 }
            r11 = 1
            r14 = 0
            boolean r15 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84831a0.f247292a     // Catch:{ Exception -> 0x01c4 }
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x01c4 }
            goto L_0x01e2
        L_0x01c4:
            r0 = move-exception
        L_0x01c5:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "WxaCommLibFeatureCreateSnapshotParamsCreator#create, failure since "
            r5.append(r7)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            goto L_0x01e1
        L_0x01da:
            r2 = 1
            r3 = 0
            java.lang.String r0 = "WxaCommLibFeatureCreateSnapshotParamsCreator#create, snapshotDirPath is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
        L_0x01e1:
            r0 = 0
        L_0x01e2:
            if (r0 != 0) goto L_0x01ee
            com.eclipsesource.mmv8.snapshot.CreateSnapshotResult$Failure r0 = new com.eclipsesource.mmv8.snapshot.CreateSnapshotResult$Failure
            r1 = -203(0xffffffffffffff35, float:NaN)
            java.lang.String r2 = "Create params failure"
            r0.<init>(r1, r2)
            return r0
        L_0x01ee:
            com.tencent.mm.plugin.appbrand.v8_snapshot.u0 r5 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84868u0.f247366a
            r5.mo117620q(r1, r0)
            com.tencent.mm.plugin.appbrand.v8_snapshot.y r1 = com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84880y.f247398b
            com.tencent.mm.plugin.appbrand.v8_snapshot.b0 r5 = r1.f247399a
            r5.getClass()
            java.lang.String r5 = ""
            int r6 = r5.length()
            if (r6 <= 0) goto L_0x0203
            goto L_0x0204
        L_0x0203:
            r2 = 0
        L_0x0204:
            if (r2 == 0) goto L_0x020e
            com.tencent.mm.plugin.appbrand.v8_snapshot.b0 r1 = r1.f247399a
            r1.getClass()
            com.eclipsesource.mmv8.C80135V8.setFlags(r5)
        L_0x020e:
            com.eclipsesource.mmv8.snapshot.CreateSnapshotResult r0 = com.eclipsesource.mmv8.snapshot.SnapshotCreator.create(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "doCreateSnapshot, result: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            java.lang.String r1 = "result"
            gy3.C87412m.m108593f(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84841g0.mo117579b(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader, com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo, boolean):com.eclipsesource.mmv8.snapshot.CreateSnapshotResult");
    }
}
