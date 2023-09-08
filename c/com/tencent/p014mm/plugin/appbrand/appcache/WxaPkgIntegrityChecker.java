package com.tencent.p014mm.plugin.appbrand.appcache;

import android.text.TextUtils;
import android.util.Pair;
import com.tencent.p014mm.plugin.appbrand.appcache.C81352s2;
import com.tencent.p014mm.plugin.appbrand.appstorage.MD5JNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di0.C86296l;
import di3.C86312j;
import h81.C32735h;
import java.io.IOException;
import java.io.InputStream;
import p206nj.C88957l;
import p823sg.C90193h;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker */
public enum WxaPkgIntegrityChecker {
    ;

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker$a */
    public enum C81220a {
        APP_READY,
        APP_MANIFEST_NULL,
        PKG_EXPIRED,
        APP_BROKEN,
        ENV_ERR,
        APP_NEED_MOVE,
        APP_LOCAL_EXIST
    }

    /* access modifiers changed from: public */
    static {
        C88957l.m111079o("appbrandcommon", WxaPkgWrappingInfo.class.getClassLoader());
    }

    /* renamed from: a */
    public static Pair<C81220a, WxaPkgWrappingInfo> m99518a(boolean z, boolean z2) {
        C81258h3 uv;
        WxaPkgWrappingInfo wxaPkgWrappingInfo;
        C81220a aVar = C81220a.APP_READY;
        if (z && (!z2 || C81352s2.f238830c != C81352s2.C81353a.DEVELOP)) {
            C86296l lVar = (C86296l) C86312j.m106911c(C86296l.class);
            if (lVar == null || (uv = lVar.mo113349uv()) == null) {
                int i = C81352s2.f238828a;
                WxaPkgWrappingInfo wxaPkgWrappingInfo2 = new WxaPkgWrappingInfo();
                wxaPkgWrappingInfo2.pkgVersion = C81352s2.f238828a;
                wxaPkgWrappingInfo2.f238587f = true;
                return Pair.create(aVar, wxaPkgWrappingInfo2);
            }
            int l = uv.mo113528l("@LibraryAppId", 0);
            if (l < 0 || C81352s2.f238828a >= l) {
                int i2 = C81352s2.f238828a;
                Log.m105925i("MicroMsg.AppBrandWxaPkgIntegrityChecker", "use local library version = %d | query appId = %s, debugType = %d, pkgVersion = %d", Integer.valueOf(i2), "@LibraryAppId", 0, Integer.valueOf(l));
                wxaPkgWrappingInfo = new WxaPkgWrappingInfo();
                wxaPkgWrappingInfo.pkgVersion = i2;
                wxaPkgWrappingInfo.f238587f = true;
            } else {
                wxaPkgWrappingInfo = null;
            }
            if (wxaPkgWrappingInfo != null) {
                Log.m105925i("MicroMsg.AppBrandWxaPkgIntegrityChecker", "checkLibrary, dbMax %d, local %d, use local", Integer.valueOf(l), Integer.valueOf(C81352s2.f238828a));
                return Pair.create(aVar, wxaPkgWrappingInfo);
            }
        }
        Pair<C81220a, WxaPkgWrappingInfo> b = m99519b("@LibraryAppId", z ? 0 : 999, -1, (String) null);
        Log.m105925i("MicroMsg.AppBrandWxaPkgIntegrityChecker", "checkLibrary, release %b, skipLocalDevPack %b, localPackMode %s, checkRecordResult %s", Boolean.valueOf(z), Boolean.valueOf(z2), C81352s2.f238830c, b.first);
        return b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x017c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker.C81220a, com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgWrappingInfo> m99519b(java.lang.String r21, int r22, int r23, java.lang.String r24) {
        /*
            r1 = r21
            r2 = r22
            r3 = r23
            r0 = r24
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker$a r4 = com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker.C81220a.APP_BROKEN
            java.lang.String r5 = "MicroMsg.AppBrandWxaPkgIntegrityChecker"
            boolean r6 = f40.C86709a0.m107522a()
            if (r6 == 0) goto L_0x001c
            com.tencent.mm.plugin.appbrand.app.g2 r6 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.vx0()
            r6.getClass()
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
        L_0x001c:
            r7 = 0
            r8 = 3
            r9 = 2
            r10 = 1
            r11 = 0
            java.lang.Class<di0.l> r12 = di0.C86296l.class
            di3.d r12 = di3.C86312j.m106911c(r12)     // Catch:{ NullPointerException -> 0x0235 }
            di0.l r12 = (di0.C86296l) r12     // Catch:{ NullPointerException -> 0x0235 }
            com.tencent.mm.plugin.appbrand.appcache.q0 r12 = r12.rq0(r1, r2, r3, r0)     // Catch:{ NullPointerException -> 0x0235 }
            java.lang.String r13 = "pkgPath"
            java.lang.String r14 = "versionMd5"
            java.lang.String r15 = "NewMd5"
            java.lang.String r16 = "version"
            java.lang.String r17 = "createTime"
            java.lang.String r18 = "startTime"
            java.lang.String r19 = "endTime"
            java.lang.String r20 = "checksum"
            java.lang.String[] r13 = new java.lang.String[]{r13, r14, r15, r16, r17, r18, r19, r20}
            boolean r14 = com.tencent.p014mm.plugin.appbrand.appcache.C81289m.C81290a.m99664b(r22)
            if (r14 == 0) goto L_0x0054
            if (r3 <= 0) goto L_0x0054
            xh.c0 r0 = r12.mo113533pl(r1, r3, r2, r13)
            com.tencent.mm.plugin.appbrand.appcache.i r0 = (com.tencent.p014mm.plugin.appbrand.appcache.C29222i) r0
            goto L_0x0067
        L_0x0054:
            boolean r14 = android.text.TextUtils.isEmpty(r24)
            if (r14 != 0) goto L_0x0061
            xh.c0 r0 = r12.mo113536r3(r1, r2, r0, r13)
            com.tencent.mm.plugin.appbrand.appcache.i r0 = (com.tencent.p014mm.plugin.appbrand.appcache.C29222i) r0
            goto L_0x0067
        L_0x0061:
            xh.c0 r0 = r12.mo113516Kn(r1, r2, r13)
            com.tencent.mm.plugin.appbrand.appcache.i r0 = (com.tencent.p014mm.plugin.appbrand.appcache.C29222i) r0
        L_0x0067:
            if (r0 != 0) goto L_0x0085
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r11] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            r0[r10] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)
            r0[r9] = r1
            java.lang.String r1 = "get null record, appId = %s, debugType = %d, version = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r1, r0)
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker$a r0 = com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker.C81220a.APP_MANIFEST_NULL
            android.util.Pair r0 = android.util.Pair.create(r0, r7)
            return r0
        L_0x0085:
            r12 = 999(0x3e7, float:1.4E-42)
            r13 = 0
            if (r2 != r12) goto L_0x00b7
            java.lang.Object[] r12 = new java.lang.Object[r9]
            long r8 = r0.field_startTime
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r12[r11] = r8
            long r8 = r0.field_endTime
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r12[r10] = r8
            java.lang.String r8 = "checkPkg for dev_lib, time_scope[%d, %d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r8, r12)
            long r8 = r0.field_endTime
            int r12 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r12 <= 0) goto L_0x00b7
            long r17 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            int r12 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r12 > 0) goto L_0x00b7
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker$a r0 = com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker.C81220a.PKG_EXPIRED
            android.util.Pair r0 = android.util.Pair.create(r0, r7)
            return r0
        L_0x00b7:
            java.lang.String r8 = r0.field_pkgPath
            if (r3 >= 0) goto L_0x00be
            int r9 = r0.field_version
            goto L_0x00bf
        L_0x00be:
            r9 = r3
        L_0x00bf:
            long r10 = r0.field_createTime
            boolean r18 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r18 != 0) goto L_0x01dc
            boolean r18 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)
            if (r18 != 0) goto L_0x00cf
            goto L_0x01dc
        L_0x00cf:
            long r6 = r0.field_checksum
            int r20 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r20 == 0) goto L_0x012f
            boolean r6 = com.tencent.p014mm.plugin.appbrand.appcache.C81293m3.m99677c()
            if (r6 == 0) goto L_0x012f
            java.lang.String r6 = r0.field_NewMd5
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x00f7
            java.lang.String r6 = r0.field_versionMd5
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x00f7
            java.lang.String r6 = r0.field_NewMd5
            java.lang.String r7 = r0.field_versionMd5
            boolean r6 = u24.C90599h.m113509b(r6, r7)
            if (r6 == 0) goto L_0x00f7
            r6 = 1
            goto L_0x00f8
        L_0x00f7:
            r6 = 0
        L_0x00f8:
            if (r6 == 0) goto L_0x012f
            long r6 = js0.C9513g.m9208a(r8)
            long r13 = r0.field_checksum
            int r20 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r20 != 0) goto L_0x010b
            java.lang.String r0 = r0.field_versionMd5
            r6 = r0
            r0 = 1
            r7 = 2
            r12 = 1
            goto L_0x012c
        L_0x010b:
            r13 = 4
            java.lang.Object[] r14 = new java.lang.Object[r13]
            r12 = 0
            r14[r12] = r8
            r13 = 1
            r14[r13] = r1
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r7 = 2
            r14[r7] = r6
            long r12 = r0.field_checksum
            java.lang.Long r0 = java.lang.Long.valueOf(r12)
            r6 = 3
            r14[r6] = r0
            java.lang.String r0 = "checksum not match, pkgPath = %s, appId = %s, localChecksum = %d, manifestChecksum = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r0, r14)
            r0 = 0
            r6 = 0
            r12 = 0
        L_0x012c:
            r7 = r0
            r0 = r12
            goto L_0x0174
        L_0x012f:
            r7 = 2
            java.lang.String[] r6 = new java.lang.String[r7]
            java.lang.String r12 = r0.field_versionMd5
            r13 = 0
            r6[r13] = r12
            java.lang.String r0 = r0.field_NewMd5
            r13 = 1
            r6[r13] = r0
            java.lang.String r0 = m99520c(r8)
            r13 = 0
        L_0x0141:
            if (r13 >= r7) goto L_0x0157
            r7 = r6[r13]
            boolean r14 = android.text.TextUtils.isEmpty(r7)
            if (r14 != 0) goto L_0x0153
            boolean r14 = r7.equals(r0)
            if (r14 == 0) goto L_0x0153
            r0 = 1
            goto L_0x0159
        L_0x0153:
            int r13 = r13 + 1
            r7 = 2
            goto L_0x0141
        L_0x0157:
            r0 = 0
            r7 = 0
        L_0x0159:
            if (r0 != 0) goto L_0x0172
            r13 = 3
            java.lang.Object[] r14 = new java.lang.Object[r13]
            r12 = 0
            r14[r12] = r1
            java.lang.String r13 = ","
            java.lang.String r6 = u24.C90599h.m113515h(r6, r13)
            r13 = 1
            r14[r13] = r6
            r6 = 2
            r14[r6] = r7
            java.lang.String r6 = "checkPkg, appId[%s] checksumMd5List[%s] != file.md5[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r6, r14)
        L_0x0172:
            r6 = r7
            r7 = 0
        L_0x0174:
            if (r0 != 0) goto L_0x017c
            r13 = 0
            android.util.Pair r0 = android.util.Pair.create(r4, r13)
            return r0
        L_0x017c:
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r0 = new com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo
            r0.<init>()
            r0.pkgVersion = r9
            r0.f238586e = r10
            r0.pkgPath = r8
            r4 = 0
            r0.f238587f = r4
            r0.f238585d = r2
            r0.md5 = r6
            r6 = 6
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r4] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            r2 = 1
            r6[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)
            r2 = 2
            r6[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r2 = 3
            r6[r2] = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            r2 = 4
            r6[r2] = r1
            r1 = 5
            r6[r1] = r0
            java.lang.String r1 = "check ok, params: appId = %s, debugType = %d, version = %d, pkgVersion = %d, checkByCRC32 = %b, return %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r1, r6)
            f40.o r1 = f40.C86709a0.m107535s()
            java.lang.String r1 = r1.f251807e
            boolean r1 = r8.startsWith(r1)
            if (r1 == 0) goto L_0x01d5
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r8
            java.lang.String r2 = "check ok, but pkg path is deprecated, path: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r1)
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker$a r1 = com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker.C81220a.APP_NEED_MOVE
            android.util.Pair r0 = android.util.Pair.create(r1, r0)
            return r0
        L_0x01d5:
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker$a r1 = com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker.C81220a.APP_READY
            android.util.Pair r0 = android.util.Pair.create(r1, r0)
            return r0
        L_0x01dc:
            r3 = 0
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r3] = r8
            r3 = 1
            r6[r3] = r1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r22)
            r7 = 2
            r6[r7] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r8 = 3
            r6[r8] = r3
            java.lang.String r3 = "file not exists, pkgPath = %s, appId = %s, debugType = %d, version = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r3, r6)
            com.tencent.mm.pointers.PString r3 = new com.tencent.mm.pointers.PString
            r3.<init>()
            java.lang.String[] r6 = new java.lang.String[r7]
            java.lang.String r7 = r0.field_versionMd5
            r8 = 0
            r6[r8] = r7
            java.lang.String r0 = r0.field_NewMd5
            r7 = 1
            r6[r7] = r0
            java.lang.String r0 = com.tencent.p014mm.plugin.appbrand.launching.C83396o0.m102338c(r1, r9, r6, r3)
            if (r0 == 0) goto L_0x022f
            java.lang.String r1 = "find wxapkg in public pkg storage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r1 = new com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo
            r1.<init>()
            r1.pkgVersion = r9
            r1.f238586e = r10
            r1.pkgPath = r0
            r4 = 0
            r1.f238587f = r4
            r1.f238585d = r2
            java.lang.String r0 = r3.value
            r1.md5 = r0
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker$a r0 = com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker.C81220a.APP_LOCAL_EXIST
            android.util.Pair r0 = android.util.Pair.create(r0, r1)
            return r0
        L_0x022f:
            r1 = 0
            android.util.Pair r0 = android.util.Pair.create(r4, r1)
            return r0
        L_0x0235:
            r0 = move-exception
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r6 = 0
            r4[r6] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            r2 = 1
            r4[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)
            r2 = 2
            r4[r2] = r1
            r1 = 3
            r4[r1] = r0
            java.lang.String r0 = "get null storage, appId = %s, debugType = %d, version = %d, npe = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r0, r4)
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker$a r0 = com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker.C81220a.ENV_ERR
            r1 = 0
            android.util.Pair r0 = android.util.Pair.create(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker.m99519b(java.lang.String, int, int, java.lang.String):android.util.Pair");
    }

    /* renamed from: c */
    public static String m99520c(String str) {
        InputStream D;
        Throwable th;
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C86009m1 m1Var = new C86009m1(str);
        long currentTicks = Util.currentTicks();
        boolean openMD5JNICheck = openMD5JNICheck();
        boolean openMD5JNINewImplCheck = openMD5JNINewImplCheck();
        try {
            if (!m1Var.mo119967g() || m1Var.mo119977o()) {
                Log.m105921e("MicroMsg.AppBrandWxaPkgIntegrityChecker", "[getFileMD5] fileName[%s] invalid", m1Var.getName());
                Log.m105925i("MicroMsg.AppBrandWxaPkgIntegrityChecker", "[getFileMD5] fileName[%s] length[%.2fKB] cost[%dms] openJNI[%b] openJNINewImpl[%b]", m1Var.getName(), Float.valueOf(((float) m1Var.mo119980r()) / 1024.0f), Long.valueOf(Util.currentTicks() - currentTicks), Boolean.valueOf(openMD5JNICheck), Boolean.valueOf(openMD5JNINewImplCheck));
            } else {
                if (openMD5JNICheck) {
                    str2 = checkFileMD5JNI(m1Var, openMD5JNINewImplCheck);
                    Log.m105925i("MicroMsg.AppBrandWxaPkgIntegrityChecker", "[getFileMD5] fileName[%s] length[%.2fKB] cost[%dms] openJNI[%b] openJNINewImpl[%b]", m1Var.getName(), Float.valueOf(((float) m1Var.mo119980r()) / 1024.0f), Long.valueOf(Util.currentTicks() - currentTicks), Boolean.valueOf(openMD5JNICheck), Boolean.valueOf(openMD5JNINewImplCheck));
                }
                try {
                    D = C86013q1.m106422D(m1Var);
                    String b = C90193h.m112874b(D, 16384);
                    if (D != null) {
                        D.close();
                    }
                    str2 = b;
                } catch (IOException e) {
                    Log.m105921e("MicroMsg.AppBrandWxaPkgIntegrityChecker", "checkFileMD5Legacy IOException = %s", e);
                } catch (Throwable th4) {
                    th.addSuppressed(th4);
                }
                Log.m105925i("MicroMsg.AppBrandWxaPkgIntegrityChecker", "[getFileMD5] fileName[%s] length[%.2fKB] cost[%dms] openJNI[%b] openJNINewImpl[%b]", m1Var.getName(), Float.valueOf(((float) m1Var.mo119980r()) / 1024.0f), Long.valueOf(Util.currentTicks() - currentTicks), Boolean.valueOf(openMD5JNICheck), Boolean.valueOf(openMD5JNINewImplCheck));
            }
        } catch (IOException e2) {
            Log.m105921e("MicroMsg.AppBrandWxaPkgIntegrityChecker", "[getFileMD5] JNI exception = %s", e2);
            openMD5JNICheck = false;
        } catch (Throwable th5) {
            Log.m105925i("MicroMsg.AppBrandWxaPkgIntegrityChecker", "[getFileMD5] fileName[%s] length[%.2fKB] cost[%dms] openJNI[%b] openJNINewImpl[%b]", m1Var.getName(), Float.valueOf(((float) m1Var.mo119980r()) / 1024.0f), Long.valueOf(Util.currentTicks() - currentTicks), Boolean.valueOf(openMD5JNICheck), Boolean.valueOf(openMD5JNINewImplCheck));
            throw th5;
        }
        return str2;
        throw th;
    }

    private static String checkFileMD5JNI(C86009m1 m1Var, boolean z) {
        MD5JNILoadGuard.ensureNativeLibrariesLoaded();
        String[] strArr = new String[1];
        int mD5String = z ? MD5JNI.getMD5String(C86013q1.m106448i(m1Var.mo119971i(), false), strArr) : MD5JNI.getMD5StringLegacy(C86013q1.m106448i(m1Var.mo119971i(), false), strArr);
        if (mD5String == 0) {
            String str = strArr[0];
            if (str != null) {
                return str;
            }
            throw new IOException("MD5JNI ret=null");
        }
        throw new IOException("MD5JNI ret=" + mD5String);
    }

    private static boolean openMD5JNICheck() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_android_appbrand_wxapkg_md5_check_use_jni_openssl, true);
    }

    private static boolean openMD5JNINewImplCheck() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_appbrand_wxapkg_md5_check_use_jni_new_impl, 1) == 1;
    }
}
