package com.tencent.p014mm.plugin.appbrand.launching;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.plugin.appbrand.utils.C84737f0;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.f4 */
public final class C83322f4 extends IStaticListener<StartAppBrandUIFromOuterEvent> {
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02fe  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent r1 = (com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent) r1
            java.lang.Class<com.tencent.mm.plugin.appbrand.launching.d1> r2 = com.tencent.p014mm.plugin.appbrand.launching.C29567d1.class
            boolean r3 = f40.C86709a0.m107522a()
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0013
            r4 = 0
            goto L_0x042d
        L_0x0013:
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r3 = r1.f9522d
            java.lang.String r3 = r3.f9526a
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            java.lang.String r6 = "invalid username or appId"
            if (r3 == 0) goto L_0x0031
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r3 = r1.f9522d
            java.lang.String r3 = r3.f9533h
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x0031
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$b r1 = r1.f9523e
            r1.f9552a = r5
            r1.f9553b = r6
            goto L_0x042d
        L_0x0031:
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r3 = r1.f9522d
            int r7 = r3.f9528c
            r8 = 2
            if (r8 == r7) goto L_0x005f
            java.lang.String r3 = r3.f9533h
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x005f
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r3 = r1.f9522d
            com.tencent.mm.modelappbrand.LaunchParamsOptional r3 = r3.f9540o
            java.lang.String r3 = r3.f237920f
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x005f
            java.lang.Object r3 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r2)
            com.tencent.mm.plugin.appbrand.launching.d1 r3 = (com.tencent.p014mm.plugin.appbrand.launching.C29567d1) r3
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r7 = r1.f9522d
            java.lang.String r9 = r7.f9533h
            int r10 = r7.f9528c
            com.tencent.mm.modelappbrand.LaunchParamsOptional r7 = r7.f9540o
            java.lang.String r7 = r7.f237920f
            r3.mo56814Lo(r9, r10, r7)
        L_0x005f:
            com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel r3 = new com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel
            r3.<init>()
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r7 = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject
            r7.<init>()
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r9 = r1.f9522d
            int r10 = r9.f9529d
            r7.f245533f = r10
            java.lang.String r11 = r9.f9530e
            r7.f245534g = r11
            android.os.Bundle r9 = r9.f9545t
            int r9 = com.tencent.p014mm.plugin.appbrand.report.C68633w.m80874a(r10, r9)
            r7.f245531d = r9
            int r9 = r7.f245533f
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r10 = r1.f9522d
            android.os.Bundle r10 = r10.f9545t
            java.lang.String r9 = com.tencent.p014mm.plugin.appbrand.report.C68633w.m80875b(r9, r10)
            r7.f245532e = r9
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r9 = r1.f9522d
            int r10 = r9.f9529d
            r11 = 1037(0x40d, float:1.453E-42)
            if (r10 == r11) goto L_0x0096
            r11 = 1018(0x3fa, float:1.427E-42)
            if (r10 == r11) goto L_0x0096
            r7.f245536i = r10
            goto L_0x0098
        L_0x0096:
            r7.f245536i = r5
        L_0x0098:
            r11 = 1007(0x3ef, float:1.411E-42)
            if (r10 == r11) goto L_0x00ac
            r11 = 1008(0x3f0, float:1.413E-42)
            if (r10 == r11) goto L_0x00ac
            r11 = 1036(0x40c, float:1.452E-42)
            if (r10 == r11) goto L_0x00ac
            r11 = 1044(0x414, float:1.463E-42)
            if (r10 == r11) goto L_0x00ac
            r11 = 1096(0x448, float:1.536E-42)
            if (r10 != r11) goto L_0x00b0
        L_0x00ac:
            int r10 = r9.f9541p
            r7.f245541q = r10
        L_0x00b0:
            java.lang.String r9 = r9.f9547v
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            r10 = 6
            r11 = 5
            r12 = 0
            if (r9 != 0) goto L_0x00eb
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer r9 = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer
            r9.<init>()
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r13 = r1.f9522d
            java.lang.String r14 = r13.f9547v
            r9.f239401i = r14
            java.lang.String r14 = r13.f9546u
            r9.f239397e = r14
            java.lang.String r14 = r13.f9548w
            r9.f239399g = r14
            r9.f239396d = r8
            java.lang.String r13 = r13.f9550y
            r9.f239398f = r13
            android.os.PersistableBundle r13 = r3.f243744u
            if (r13 != 0) goto L_0x00df
            android.os.PersistableBundle r13 = new android.os.PersistableBundle
            r13.<init>()
            r3.f243744u = r13
        L_0x00df:
            android.os.PersistableBundle r13 = r3.f243744u
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r14 = r1.f9522d
            java.lang.String r14 = r14.f9549x
            java.lang.String r15 = "adUxInfo"
            r13.putString(r15, r14)
            goto L_0x011c
        L_0x00eb:
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r9 = r1.f9522d
            java.lang.String r9 = r9.f9551z
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x0103
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer r9 = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer
            r9.<init>()
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r13 = r1.f9522d
            java.lang.String r13 = r13.f9551z
            r9.f239400h = r13
            r9.f239396d = r10
            goto L_0x011c
        L_0x0103:
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r9 = r1.f9522d
            java.lang.String r9 = r9.f9525B
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x011b
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer r9 = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer
            r9.<init>()
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r13 = r1.f9522d
            java.lang.String r13 = r13.f9525B
            r9.f239397e = r13
            r9.f239396d = r11
            goto L_0x011c
        L_0x011b:
            r9 = r12
        L_0x011c:
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r13 = r1.f9522d
            r13.getClass()
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r13 = r1.f9522d
            java.lang.String r14 = r13.f9526a
            r3.f243730d = r14
            java.lang.String r13 = r13.f9533h
            r3.f243731e = r13
            boolean r13 = android.text.TextUtils.isEmpty(r14)
            if (r13 != 0) goto L_0x0133
            r3.f243731e = r12
        L_0x0133:
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r13 = r1.f9522d
            java.lang.String r14 = r13.f9527b
            r3.f243735i = r14
            int r13 = r13.f9528c
            r3.f243733g = r13
            boolean r14 = com.tencent.p014mm.plugin.appbrand.appcache.C81289m.C81290a.m99664b(r13)
            if (r14 != 0) goto L_0x014c
            boolean r13 = com.tencent.p014mm.plugin.appbrand.appcache.C81289m.C81290a.m99663a(r13)
            if (r13 == 0) goto L_0x014a
            goto L_0x014c
        L_0x014a:
            r13 = 0
            goto L_0x014d
        L_0x014c:
            r13 = 1
        L_0x014d:
            java.lang.String r14 = "MicroMsg.AppBrandLaunchFromOuterEventListener"
            if (r13 != 0) goto L_0x016e
            java.lang.Object[] r13 = new java.lang.Object[r8]
            int r15 = r3.f243733g
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r13[r5] = r15
            java.lang.Throwable r15 = new java.lang.Throwable
            r15.<init>()
            java.lang.String r15 = android.util.Log.getStackTraceString(r15)
            r13[r4] = r15
            java.lang.String r15 = "start with invalid versionType[%d], use 0 instead, stack=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r14, r15, r13)
            r3.f243733g = r5
        L_0x016e:
            r3.f243738o = r7
            r3.f243739p = r9
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r9 = r1.f9522d
            com.tencent.mm.modelappbrand.LaunchParamsOptional r13 = r9.f9540o
            r3.f243740q = r13
            java.lang.String r15 = r9.f9524A
            r3.f243743t = r15
            android.os.Parcelable r15 = r9.f9532g
            com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate r15 = (com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate) r15
            r3.f243745v = r15
            java.lang.String r15 = r9.f9542q
            r3.f243710B = r15
            int r15 = r9.f9535j
            r3.f243734h = r15
            if (r13 == 0) goto L_0x0192
            int r13 = r13.f237922h
            if (r13 == 0) goto L_0x0192
            r3.f243711C = r4
        L_0x0192:
            int r13 = r9.f9528c
            if (r13 == 0) goto L_0x0416
            if (r13 == r4) goto L_0x01a4
            if (r13 == r8) goto L_0x0416
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$b r1 = r1.f9523e
            r1.f9552a = r5
            java.lang.String r2 = "invalid openType"
            r1.f9553b = r2
            goto L_0x042d
        L_0x01a4:
            boolean r13 = r9.f9538m
            java.lang.String r15 = "local pkg not exists"
            if (r13 == 0) goto L_0x0313
            java.lang.String r2 = r9.f9526a
            java.lang.String r2 = com.tencent.p014mm.plugin.appbrand.config.C81661j.m100180e(r2)
            r9.f9533h = r2
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x01c0
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$b r2 = r1.f9523e
            r2.f9552a = r5
            r2.f9553b = r15
            goto L_0x0304
        L_0x01c0:
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
            com.tencent.mm.plugin.appbrand.appcache.h3 r2 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238471g
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r6 = r1.f9522d
            java.lang.String r7 = r6.f9533h
            int r6 = r6.f9528c
            com.tencent.mm.sdk.storage.ISQLiteDatabase r2 = r2.f238664d
            java.lang.String r9 = "pkgPath"
            java.lang.String[] r18 = new java.lang.String[]{r9}
            java.util.Locale r9 = java.util.Locale.US
            java.lang.Object[] r13 = new java.lang.Object[r8]
            java.lang.String r24 = "appId"
            r13[r5] = r24
            java.lang.String r25 = "debugType"
            r13[r4] = r25
            java.lang.String r12 = "%s=? and %s=?"
            java.lang.String r19 = java.lang.String.format(r9, r12, r13)
            java.lang.String[] r12 = new java.lang.String[r8]
            r12[r5] = r7
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r12[r4] = r6
            r21 = 0
            r22 = 0
            r23 = 0
            java.lang.String r17 = "AppBrandWxaPkgManifestRecord"
            r16 = r2
            r20 = r12
            android.database.Cursor r2 = r16.query(r17, r18, r19, r20, r21, r22, r23)
            if (r2 != 0) goto L_0x0204
            r6 = 0
            goto L_0x0213
        L_0x0204:
            boolean r6 = r2.moveToFirst()
            if (r6 == 0) goto L_0x020f
            java.lang.String r6 = r2.getString(r5)
            goto L_0x0210
        L_0x020f:
            r6 = 0
        L_0x0210:
            r2.close()
        L_0x0213:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r2 != 0) goto L_0x0232
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r6)
            if (r2 == 0) goto L_0x0232
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$b r2 = r1.f9523e
            r2.f9552a = r4
            r3.f243732f = r5
            com.tencent.mm.plugin.appbrand.launching.precondition.o r2 = com.tencent.p014mm.plugin.appbrand.launching.precondition.C83428o.f243800a
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r1 = r1.f9522d
            android.content.Context r1 = r1.f9531f
            com.tencent.mm.plugin.appbrand.launching.a r2 = (com.tencent.p014mm.plugin.appbrand.launching.C83285a) r2
            r2.mo115582b(r1, r3)
            goto L_0x042d
        L_0x0232:
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
            com.tencent.mm.plugin.appbrand.appcache.h3 r2 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238471g
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r6 = r1.f9522d
            java.lang.String r7 = r6.f9533h
            int r6 = r6.f9528c
            r2.getClass()
            boolean r12 = com.tencent.p014mm.plugin.appbrand.appcache.C81289m.C81290a.m99663a(r6)
            if (r12 == 0) goto L_0x0248
            r12 = 1
            goto L_0x024c
        L_0x0248:
            int r12 = r2.mo113528l(r7, r6)
        L_0x024c:
            java.lang.String r13 = "MicroMsg.AppBrandWxaPkgStorage"
            r11 = 3
            if (r12 >= 0) goto L_0x0267
            java.lang.Object[] r2 = new java.lang.Object[r11]
            r2[r5] = r7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2[r4] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
            r2[r8] = r6
            java.lang.String r6 = "hasModuleList, appId(%s), type(%s), version(%d), not records"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r6, r2)
            goto L_0x02d3
        L_0x0267:
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r5] = r24
            r10[r4] = r7
            r10[r8] = r25
            java.lang.Integer r17 = java.lang.Integer.valueOf(r6)
            r10[r11] = r17
            r17 = 4
            java.lang.String r18 = "version"
            r10[r17] = r18
            java.lang.Integer r17 = java.lang.Integer.valueOf(r12)
            r16 = 5
            r10[r16] = r17
            java.lang.String r11 = "where %s like '%s$%%' and %s=%d and %s=%d"
            java.lang.String r10 = java.lang.String.format(r9, r11, r10)
            java.lang.Object[] r11 = new java.lang.Object[r8]
            java.lang.String r16 = "AppBrandWxaPkgManifestRecord"
            r11[r5] = r16
            r11[r4] = r10
            java.lang.String r10 = "select count(*) from %s %s"
            java.lang.String r9 = java.lang.String.format(r9, r10, r11)
            com.tencent.mm.sdk.storage.ISQLiteDatabase r2 = r2.f238664d
            r10 = 0
            android.database.Cursor r2 = r2.rawQuery(r9, r10, r8)
            if (r2 == 0) goto L_0x02bd
            boolean r9 = r2.isClosed()
            if (r9 == 0) goto L_0x02aa
            goto L_0x02bd
        L_0x02aa:
            boolean r6 = r2.moveToFirst()
            if (r6 == 0) goto L_0x02b5
            int r6 = r2.getInt(r5)
            goto L_0x02b6
        L_0x02b5:
            r6 = 0
        L_0x02b6:
            r2.close()
            if (r6 <= 0) goto L_0x02d3
            r2 = 1
            goto L_0x02d4
        L_0x02bd:
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r5] = r7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2[r4] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
            r2[r8] = r6
            java.lang.String r6 = "hasModuleList, appId(%s), type(%s), version(%d), cursor nil"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r6, r2)
        L_0x02d3:
            r2 = 0
        L_0x02d4:
            if (r2 == 0) goto L_0x02fe
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$b r2 = r1.f9523e
            r2.f9552a = r4
            java.lang.Object[] r2 = new java.lang.Object[r8]
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r6 = r1.f9522d
            java.lang.String r7 = r6.f9533h
            r2[r5] = r7
            int r6 = r6.f9528c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2[r4] = r6
            java.lang.String r6 = "callback with appId(%s) type(%d), hasModuleList=true"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r6, r2)
            r3.f243732f = r5
            com.tencent.mm.plugin.appbrand.launching.precondition.o r2 = com.tencent.p014mm.plugin.appbrand.launching.precondition.C83428o.f243800a
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r1 = r1.f9522d
            android.content.Context r1 = r1.f9531f
            com.tencent.mm.plugin.appbrand.launching.a r2 = (com.tencent.p014mm.plugin.appbrand.launching.C83285a) r2
            r2.mo115582b(r1, r3)
            goto L_0x042d
        L_0x02fe:
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$b r2 = r1.f9523e
            r2.f9552a = r5
            r2.f9553b = r15
        L_0x0304:
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r1 = r1.f9522d
            boolean r2 = r1.f9539n
            if (r2 == 0) goto L_0x042d
            android.content.Context r2 = r1.f9531f
            int r1 = r1.f9528c
            r0.mo115613d(r2, r1)
            goto L_0x042d
        L_0x0313:
            java.lang.String r8 = r9.f9533h
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 == 0) goto L_0x0352
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r8 = r1.f9522d
            java.lang.String r9 = r8.f9526a
            java.lang.String r9 = com.tencent.p014mm.plugin.appbrand.config.C81661j.m100180e(r9)
            r8.f9533h = r9
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r8 = r1.f9522d
            java.lang.String r8 = r8.f9533h
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 == 0) goto L_0x0352
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r2 = r1.f9522d
            java.lang.String r2 = r2.f9547v
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x034a
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$b r2 = r1.f9523e
            r2.f9552a = r4
            com.tencent.mm.plugin.appbrand.launching.precondition.o r2 = com.tencent.p014mm.plugin.appbrand.launching.precondition.C83428o.f243800a
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r1 = r1.f9522d
            android.content.Context r1 = r1.f9531f
            com.tencent.mm.plugin.appbrand.launching.a r2 = (com.tencent.p014mm.plugin.appbrand.launching.C83285a) r2
            r2.mo115582b(r1, r3)
            goto L_0x042d
        L_0x034a:
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$b r1 = r1.f9523e
            r1.f9552a = r5
            r1.f9553b = r6
            goto L_0x042d
        L_0x0352:
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r6 = r1.f9522d
            java.lang.String r6 = r6.f9536k
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x03c3
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r6 = r1.f9522d
            java.lang.String r6 = r6.f9537l
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 == 0) goto L_0x0367
            goto L_0x03c3
        L_0x0367:
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
            com.tencent.mm.plugin.appbrand.appcache.h3 r16 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238471g
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r2 = r1.f9522d
            java.lang.String r6 = r2.f9533h
            int r8 = r2.f9528c
            java.lang.String r9 = r2.f9536k
            java.lang.String r2 = r2.f9537l
            r21 = 0
            r23 = 0
            r17 = r6
            r18 = r8
            r19 = r9
            r20 = r2
            boolean r2 = r16.mo113526j(r17, r18, r19, r20, r21, r23)
            if (r2 != 0) goto L_0x03a3
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
            com.tencent.mm.plugin.appbrand.appcache.h3 r2 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238471g
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r6 = r1.f9522d
            java.lang.String r8 = r6.f9533h
            int r6 = r6.f9528c
            boolean r2 = r2.mo113532p(r8, r6)
            if (r2 != 0) goto L_0x03b0
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$b r1 = r1.f9523e
            r1.f9552a = r5
            java.lang.String r2 = "install app failed"
            r1.f9553b = r2
            goto L_0x042d
        L_0x03a3:
            com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager r2 = com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager.m103869I()
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r5 = r1.f9522d
            java.lang.String r6 = r5.f9533h
            int r5 = r5.f9528c
            r2.mo111407t(r6, r5)
        L_0x03b0:
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r2 = r1.f9522d
            java.lang.String r5 = r2.f9536k
            r7.f245534g = r5
            r5 = -1
            r3.f243732f = r5
            com.tencent.mm.plugin.appbrand.launching.precondition.o r5 = com.tencent.p014mm.plugin.appbrand.launching.precondition.C83428o.f243800a
            android.content.Context r2 = r2.f9531f
            com.tencent.mm.plugin.appbrand.launching.a r5 = (com.tencent.p014mm.plugin.appbrand.launching.C83285a) r5
            r5.mo115582b(r2, r3)
            goto L_0x0429
        L_0x03c3:
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r6 = r1.f9522d
            java.lang.String r6 = r6.f9547v
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x040d
            java.lang.Object r2 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r2)
            com.tencent.mm.plugin.appbrand.launching.d1 r2 = (com.tencent.p014mm.plugin.appbrand.launching.C29567d1) r2
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r6 = r1.f9522d
            java.lang.String r7 = r6.f9533h
            int r6 = r6.f9528c
            java.lang.String r2 = r2.mo56815jo(r7, r6)
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x03fd
            r6 = 0
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r2 = r1.f9522d
            int r8 = r2.f9535j
            long r8 = (long) r8
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x03ef
            goto L_0x03fd
        L_0x03ef:
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$b r1 = r1.f9523e
            r1.f9552a = r5
            r1.f9553b = r15
            android.content.Context r1 = r2.f9531f
            int r2 = r2.f9528c
            r0.mo115613d(r1, r2)
            goto L_0x042d
        L_0x03fd:
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$b r2 = r1.f9523e
            r2.f9552a = r4
            com.tencent.mm.plugin.appbrand.launching.precondition.o r2 = com.tencent.p014mm.plugin.appbrand.launching.precondition.C83428o.f243800a
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r1 = r1.f9522d
            android.content.Context r1 = r1.f9531f
            com.tencent.mm.plugin.appbrand.launching.a r2 = (com.tencent.p014mm.plugin.appbrand.launching.C83285a) r2
            r2.mo115582b(r1, r3)
            goto L_0x042d
        L_0x040d:
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$b r1 = r1.f9523e
            r1.f9552a = r5
            java.lang.String r2 = "invalid downloadURL or checkSumMd5"
            r1.f9553b = r2
            goto L_0x042d
        L_0x0416:
            r5 = -1
            int r2 = r9.f9534i
            if (r2 > 0) goto L_0x041d
            r15 = -1
            goto L_0x041e
        L_0x041d:
            r15 = r2
        L_0x041e:
            r3.f243732f = r15
            com.tencent.mm.plugin.appbrand.launching.precondition.o r2 = com.tencent.p014mm.plugin.appbrand.launching.precondition.C83428o.f243800a
            android.content.Context r5 = r9.f9531f
            com.tencent.mm.plugin.appbrand.launching.a r2 = (com.tencent.p014mm.plugin.appbrand.launching.C83285a) r2
            r2.mo115582b(r5, r3)
        L_0x0429:
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$b r1 = r1.f9523e
            r1.f9552a = r4
        L_0x042d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.launching.C83322f4.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }

    /* renamed from: d */
    public final void mo115613d(Context context, int i) {
        C81956c.m100673a(context, i == 1 ? C84737f0.m104395b(C0966R.string.f7646mk, new Object[0]) : i == 2 ? C84737f0.m104395b(C0966R.string.f7764qx, new Object[0]) : null, C84737f0.m104395b(C0966R.string.a3h, new Object[0]), C84737f0.m104395b(C0966R.string.a18, new Object[0]), "", (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
    }
}
