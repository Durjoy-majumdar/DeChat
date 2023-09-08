package com.tencent.p014mm.plugin.appbrand.appcache;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.plugin.appbrand.appcache.C81289m;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import fy3.C32224a;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import junit.framework.Assert;
import p749xh.C38537c0;
import te3.u45;
import u24.C90599h;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.h3 */
public final class C81258h3 implements C81289m, C81347q0<C29315z2> {

    /* renamed from: f */
    public static final String[] f238663f = {MAutoStorage.getCreateSQLs(C29315z2.f80042I, "AppBrandWxaPkgManifestRecord")};

    /* renamed from: d */
    public final ISQLiteDatabase f238664d;

    /* renamed from: e */
    public final C29221c f238665e;

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.h3$a */
    public class C29220a implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C29315z2 f79871d;

        public C29220a(C29315z2 z2Var) {
            this.f79871d = z2Var;
        }

        public Object invoke() {
            Class cls = C81295n0.class;
            C81258h3 h3Var = C81258h3.this;
            C29315z2 z2Var = this.f79871d;
            h3Var.getClass();
            boolean z = false;
            String format = String.format(Locale.ENGLISH, "select count(%s) from %s where %s=? and %s=? and %s=?", new Object[]{"appId", "AppBrandWxaPkgManifestRecord", "appId", "debugType", ProviderConstants.API_COLNAME_FEATURE_VERSION});
            ISQLiteDatabase iSQLiteDatabase = h3Var.f238664d;
            Cursor rawQuery = iSQLiteDatabase.rawQuery(format, new String[]{z2Var.field_appId, z2Var.field_debugType + "", z2Var.field_version + ""});
            if (rawQuery != null) {
                try {
                    if (rawQuery.moveToNext() && rawQuery.getInt(0) > 0) {
                        z = true;
                    }
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            if (z) {
                boolean update = C81258h3.this.f238665e.update(this.f79871d, C29315z2.f80041H);
                if (update && C86013q1.m106450k(this.f79871d.field_pkgPath)) {
                    ((C81295n0) C86312j.m106911c(cls)).mo56505yy(this.f79871d.field_pkgPath);
                }
                return Boolean.valueOf(update);
            }
            boolean insert = C81258h3.this.f238665e.insert(this.f79871d);
            if (insert && C86013q1.m106450k(this.f79871d.field_pkgPath)) {
                ((C81295n0) C86312j.m106911c(cls)).mo56505yy(this.f79871d.field_pkgPath);
            }
            return Boolean.valueOf(insert);
            throw th;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.h3$c */
    public static final class C29221c extends MAutoStorage<C29315z2> {
        public C29221c(ISQLiteDatabase iSQLiteDatabase) {
            super(iSQLiteDatabase, C29315z2.f80042I, "AppBrandWxaPkgManifestRecord", C38537c0.f101872s);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.h3$b */
    public enum C68580b {
        DESC,
        ASC
    }

    public C81258h3(ISQLiteDatabase iSQLiteDatabase) {
        this.f238664d = iSQLiteDatabase;
        this.f238665e = new C29221c(iSQLiteDatabase);
    }

    /* renamed from: A */
    public boolean mo113512A(String str, int i, int i2, List<WxaAttributes.WxaVersionModuleInfo> list) {
        WxaAttributes.WxaVersionModuleInfo wxaVersionModuleInfo;
        String str2;
        String str3 = str;
        if (Util.isNullOrNil(str) || Util.isNullOrNil((List) list)) {
            return false;
        }
        int i3 = !C81289m.C81290a.m99664b(i) ? 1 : i2;
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        for (WxaAttributes.WxaVersionModuleInfo next : list) {
            sb.append(',');
            sb.append(next.f239472d);
            sb.append("::");
            sb.append(next.f239473e);
        }
        sb.append('}');
        Log.m105925i("MicroMsg.AppBrandWxaPkgStorage", "updateModuleList, appId %s, type %d, version %d, list %s", str3, Integer.valueOf(i), Integer.valueOf(i3), sb.toString());
        for (WxaAttributes.WxaVersionModuleInfo next2 : list) {
            String str4 = null;
            String a = C81273j1.m99631a(next2.f239472d);
            if (Util.isNullOrNil((String) null)) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str3);
                if (Util.isNullOrNil(a)) {
                    str2 = "";
                } else {
                    str2 = '$' + a;
                }
                sb4.append(str2);
                str4 = sb4.toString();
            }
            String str5 = str4;
            if (C81289m.C81290a.m99664b(i)) {
                mo113527k(str5, i, i3, next2.f239473e, (String) null);
            } else {
                mo113526j(str5, i, (String) null, next2.f239473e, 0, 0);
            }
            String str6 = next2.f239478j;
            if (Util.isNullOrNil(next2.f239472d) || Util.isNullOrNil(str6)) {
                wxaVersionModuleInfo = next2;
            } else {
                wxaVersionModuleInfo = next2;
                mo113515D(str, next2.f239472d, i3, i, str6, 13);
            }
            mo113513B(str, i3, i, wxaVersionModuleInfo.f239472d, wxaVersionModuleInfo.f239479n);
        }
        return true;
    }

    /* renamed from: B */
    public void mo113513B(String str, int i, int i2, String str2, List<WxaAttributes.WxaWidgetInfo> list) {
        String str3;
        if (list != null && list.size() > 0) {
            for (WxaAttributes.WxaWidgetInfo next : list) {
                int i3 = next.f239482d;
                String str4 = next.f239483e;
                String str5 = null;
                String str6 = "";
                if (i3 == 0) {
                    str3 = str6;
                } else if (i3 != 6) {
                    str3 = ModulePkgInfo.MODULE_WITHOUT_PLUGIN_CODE;
                    if (i3 != 12) {
                        if (i3 != 13) {
                            str3 = ModulePkgInfo.MODULE_WITHOUT_MULTI_PLUGIN_CODE;
                            if (i3 != 22) {
                                if (i3 != 23) {
                                    str3 = C81273j1.m99631a(str2);
                                } else {
                                    str3 = C81273j1.m99631a(str2) + '$' + str3;
                                }
                            }
                        } else {
                            str3 = C81273j1.m99631a(str2) + '$' + str3;
                        }
                    }
                } else {
                    str3 = ModulePkgInfo.PLUGIN_CODE;
                }
                if (Util.isNullOrNil((String) null)) {
                    StringBuilder sb = new StringBuilder();
                    String str7 = str;
                    sb.append(str);
                    if (!Util.isNullOrNil(str3)) {
                        str6 = '$' + str3;
                    }
                    sb.append(str6);
                    str5 = sb.toString();
                } else {
                    String str8 = str;
                }
                String str9 = str5;
                Log.m105925i("MicroMsg.AppBrandWxaPkgStorage", "multiPkg updatePkgInfoList pkgInfoKey:%s,pkgType:%d,codeType:%d", str9, Integer.valueOf(i3), Integer.valueOf(i2));
                if (i2 == 0) {
                    mo113527k(str9, i2, i, str4, (String) null);
                } else {
                    mo113526j(str9, i2, "", str4, 0, 0);
                }
            }
        }
    }

    /* renamed from: C */
    public boolean mo113514C(String str, int i, int i2, String str2) {
        boolean z = false;
        if (Util.isNullOrNil(str)) {
            return false;
        }
        if (C81289m.C81290a.m99663a(i)) {
            i2 = 1;
        }
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("pkgPath", str2);
        if (this.f238664d.update("AppBrandWxaPkgManifestRecord", contentValues, String.format("%s=? and %s=? and %s=?", new Object[]{"appId", "debugType", ProviderConstants.API_COLNAME_FEATURE_VERSION}), new String[]{str, String.valueOf(i), String.valueOf(i2)}) > 0) {
            z = true;
        }
        if (z) {
            ((C81295n0) C86312j.m106911c(C81295n0.class)).mo56505yy(str2);
        }
        return z;
    }

    /* renamed from: D */
    public void mo113515D(String str, String str2, int i, int i2, String str3, int i3) {
        String str4;
        String str5 = str;
        int i4 = i3;
        if (Util.isNullOrNil(str3)) {
            Log.m105921e("MicroMsg.AppBrandWxaPkgStorage", "updateWithoutPluginCodeInfo withoutLibMd5 null appid:%s,modulename:%s!", str5, str2);
            return;
        }
        String str6 = null;
        String str7 = "";
        if (i4 == 0) {
            str4 = str7;
        } else if (i4 != 6) {
            str4 = ModulePkgInfo.MODULE_WITHOUT_PLUGIN_CODE;
            if (i4 != 12) {
                if (i4 != 13) {
                    str4 = ModulePkgInfo.MODULE_WITHOUT_MULTI_PLUGIN_CODE;
                    if (i4 != 22) {
                        if (i4 != 23) {
                            str4 = C81273j1.m99631a(str2);
                        } else {
                            str4 = C81273j1.m99631a(str2) + '$' + str4;
                        }
                    }
                } else {
                    str4 = C81273j1.m99631a(str2) + '$' + str4;
                }
            }
        } else {
            str4 = ModulePkgInfo.PLUGIN_CODE;
        }
        if (Util.isNullOrNil((String) null)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            if (!Util.isNullOrNil(str4)) {
                str7 = '$' + str4;
            }
            sb.append(str7);
            str6 = sb.toString();
        }
        String str8 = str6;
        if (i2 == 0) {
            mo113527k(str8, i2, i, str3, (String) null);
        } else {
            mo113526j(str8, i2, "", str3, 0, 0);
        }
    }

    /* renamed from: a */
    public boolean mo113517a(C29315z2 z2Var) {
        boolean z = !Util.isNullOrNil(z2Var.field_appId) && this.f238665e.delete(z2Var, C29315z2.f80041H);
        if (z) {
            ((C81295n0) C86312j.m106911c(C81295n0.class)).mo56503tJ(z2Var.field_pkgPath);
            mo113521e(z2Var.field_appId, z2Var.field_debugType, z2Var.field_version);
        }
        return z;
    }

    /* renamed from: b */
    public boolean mo113518b() {
        Locale locale = Locale.ENGLISH;
        String format = String.format(locale, "%s like ?", new Object[]{"appId"});
        String[] strArr = {"%$__PLUGINCODE__"};
        Cursor rawQuery = this.f238664d.rawQuery(String.format(locale, "select %s from %s where %s", new Object[]{"pkgPath", mo113531o(), format}), strArr, 2);
        if (rawQuery != null) {
            try {
                if (rawQuery.moveToFirst()) {
                    do {
                        String string = rawQuery.getString(0);
                        if (C86013q1.m106447h(string)) {
                            ((C81295n0) C86312j.m106911c(C81295n0.class)).mo56503tJ(string);
                        }
                    } while (rawQuery.moveToNext());
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return this.f238664d.delete(mo113531o(), format, strArr) > 0;
        throw th;
    }

    /* renamed from: c */
    public int mo113519c(String str, int i) {
        Throwable th;
        String str2 = str;
        int i2 = 0;
        if (Util.isNullOrNil(str)) {
            return 0;
        }
        Log.m105925i("MicroMsg.AppBrandWxaPkgStorage", "deleteAppPkg, appId %s, debugType %d", str2, Integer.valueOf(i));
        String a = C81288l3.m99661a(str, i);
        Cursor query = this.f238664d.query("AppBrandWxaPkgManifestRecord", new String[]{"pkgPath"}, a, (String[]) null, (String) null, (String) null, (String) null, 2);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    String string = query.getString(0);
                    if (C86013q1.m106447h(string)) {
                        ((C81295n0) C86312j.m106911c(C81295n0.class)).mo56503tJ(string);
                        i2 = 1;
                    }
                }
            } catch (Throwable th4) {
                th.addSuppressed(th4);
            }
        }
        if (query != null) {
            query.close();
        }
        this.f238664d.delete("AppBrandWxaPkgManifestRecord", a, (String[]) null);
        return i2 + mo113521e(str2, i, -1);
        throw th;
    }

    /* renamed from: d */
    public void mo113520d(String str, int i) {
        C29315z2 x = mo113516Kn(str, i, ProviderConstants.API_COLNAME_FEATURE_VERSION);
        if (x != null) {
            mo113517a(x);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0089 A[SYNTHETIC, Splitter:B:23:0x0089] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0096 A[Catch:{ all -> 0x008d, all -> 0x009a }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009e A[Catch:{ all -> 0x008d, all -> 0x009a }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo113521e(java.lang.String r16, int r17, int r18) {
        /*
            r15 = this;
            r1 = r15
            r2 = r18
            java.lang.String r3 = "deleteModuleList, appId %s, type %d, version %d, return count %d"
            java.lang.String r4 = "MicroMsg.AppBrandWxaPkgStorage"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = com.tencent.p014mm.plugin.appbrand.appcache.C81288l3.m99662b(r16, r17)
            r0.append(r5)
            java.lang.String r5 = " and "
            r0.append(r5)
            if (r2 <= 0) goto L_0x002d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "version="
            r5.append(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            goto L_0x002f
        L_0x002d:
            java.lang.String r5 = "1=1"
        L_0x002f:
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.util.Locale r5 = java.util.Locale.ENGLISH
            r6 = 3
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.String r8 = "pkgPath"
            r9 = 0
            r7[r9] = r8
            java.lang.String r8 = r15.mo113531o()
            r10 = 1
            r7[r10] = r8
            r8 = 2
            r7[r8] = r0
            java.lang.String r11 = "select %s from %s where %s"
            java.lang.String r5 = java.lang.String.format(r5, r11, r7)
            r7 = 4
            com.tencent.mm.sdk.storage.ISQLiteDatabase r11 = r1.f238664d     // Catch:{ all -> 0x00c1 }
            r12 = 0
            android.database.Cursor r5 = r11.rawQuery(r5, r12, r8)     // Catch:{ all -> 0x00c1 }
            if (r5 == 0) goto L_0x0093
            boolean r11 = r5.moveToFirst()     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0093
            r11 = 0
        L_0x0063:
            java.lang.String r13 = r5.getString(r9)     // Catch:{ all -> 0x0081 }
            boolean r14 = com.tencent.p014mm.vfs.C86013q1.m106447h(r13)     // Catch:{ all -> 0x0081 }
            if (r14 == 0) goto L_0x007a
            java.lang.Class<com.tencent.mm.plugin.appbrand.appcache.n0> r14 = com.tencent.p014mm.plugin.appbrand.appcache.C81295n0.class
            di3.d r14 = di3.C86312j.m106911c(r14)     // Catch:{ all -> 0x0081 }
            com.tencent.mm.plugin.appbrand.appcache.n0 r14 = (com.tencent.p014mm.plugin.appbrand.appcache.C81295n0) r14     // Catch:{ all -> 0x0081 }
            r14.mo56503tJ(r13)     // Catch:{ all -> 0x0081 }
            int r11 = r11 + 1
        L_0x007a:
            boolean r13 = r5.moveToNext()     // Catch:{ all -> 0x0081 }
            if (r13 != 0) goto L_0x0063
            goto L_0x0094
        L_0x0081:
            r0 = move-exception
            r12 = r0
            goto L_0x0087
        L_0x0084:
            r0 = move-exception
            r12 = r0
            r11 = 0
        L_0x0087:
            if (r5 == 0) goto L_0x0092
            r5.close()     // Catch:{ all -> 0x008d }
            goto L_0x0092
        L_0x008d:
            r0 = move-exception
            r5 = r0
            r12.addSuppressed(r5)     // Catch:{ all -> 0x009a }
        L_0x0092:
            throw r12     // Catch:{ all -> 0x009a }
        L_0x0093:
            r11 = 0
        L_0x0094:
            if (r5 == 0) goto L_0x009c
            r5.close()     // Catch:{ all -> 0x009a }
            goto L_0x009c
        L_0x009a:
            r0 = move-exception
            goto L_0x00c3
        L_0x009c:
            if (r11 <= 0) goto L_0x00a7
            com.tencent.mm.sdk.storage.ISQLiteDatabase r5 = r1.f238664d     // Catch:{ all -> 0x009a }
            java.lang.String r13 = r15.mo113531o()     // Catch:{ all -> 0x009a }
            r5.delete(r13, r0, r12)     // Catch:{ all -> 0x009a }
        L_0x00a7:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r9] = r16
            java.lang.Integer r5 = java.lang.Integer.valueOf(r17)
            r0[r10] = r5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r18)
            r0[r8] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r0[r6] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r3, r0)
            return r11
        L_0x00c1:
            r0 = move-exception
            r11 = 0
        L_0x00c3:
            java.lang.Object[] r5 = new java.lang.Object[r7]
            r5[r9] = r16
            java.lang.Integer r7 = java.lang.Integer.valueOf(r17)
            r5[r10] = r7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r18)
            r5[r8] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r5[r6] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r3, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.C81258h3.mo113521e(java.lang.String, int, int):int");
    }

    /* renamed from: f */
    public int mo113522f(String str, int i, int i2) {
        if (!C81289m.C81290a.m99664b(i)) {
            return 0;
        }
        Log.m105925i("MicroMsg.AppBrandWxaPkgStorage", "deleteModuleListBelowVersion appId[%s] versionType[%d] pkgVersion[%d]", str, Integer.valueOf(i), Integer.valueOf(i2));
        return this.f238664d.delete("AppBrandWxaPkgManifestRecord", C81288l3.m99662b(str, i) + " and " + ProviderConstants.API_COLNAME_FEATURE_VERSION + "<" + i2, (String[]) null);
    }

    /* renamed from: g */
    public int mo113523g(String str, int i, int i2) {
        if (!C81289m.C81290a.m99664b(i)) {
            return 0;
        }
        Log.m105925i("MicroMsg.AppBrandWxaPkgStorage", "deletePkgsBelowVersion, appId %s, versionType %d, pkgVersion %d", str, Integer.valueOf(i), Integer.valueOf(i2));
        return this.f238664d.delete("AppBrandWxaPkgManifestRecord", C81288l3.m99661a(str, i) + " and " + ProviderConstants.API_COLNAME_FEATURE_VERSION + "<" + i2, (String[]) null);
    }

    /* renamed from: h */
    public boolean mo113524h(String str) {
        Cursor query = this.f238664d.query("AppBrandWxaPkgManifestRecord", new String[]{"appId"}, String.format("%s=?", new Object[]{"pkgPath"}), new String[]{str}, (String) null, (String) null, (String) null, 2);
        if (query == null) {
            return false;
        }
        boolean moveToFirst = query.moveToFirst();
        query.close();
        return moveToFirst;
    }

    /* renamed from: i */
    public boolean mo113525i(u45 u45, PInt pInt) {
        if (u45.f259844f < 0 || Util.isNullOrNil(u45.f259842d) || Util.isNullOrNil(u45.f259843e)) {
            Log.m105921e("MicroMsg.AppBrandWxaPkgStorage", "flushLibPkgVersionInfo, invalid resp: version( %d ), url( %s ), md5( %s )", Integer.valueOf(u45.f259844f), u45.f259842d, u45.f259843e);
            return false;
        }
        if (u45.f259846h > 0) {
            int delete = this.f238664d.delete("AppBrandWxaPkgManifestRecord", String.format("%s=? and %s=? and %s>?", new Object[]{"appId", "debugType", ProviderConstants.API_COLNAME_FEATURE_VERSION}), new String[]{"@LibraryAppId", String.valueOf(0), String.valueOf(u45.f259844f)});
            Log.m105925i("MicroMsg.AppBrandWxaPkgStorage", "flushLibPkgVersionInfo, delete manifest.version > %d, ret = %d", Integer.valueOf(u45.f259844f), Integer.valueOf(delete));
            if (pInt != null) {
                pInt.value = delete;
            }
        }
        return mo113527k("@LibraryAppId", 0, u45.f259844f, u45.f259843e, u45.f259842d);
    }

    /* renamed from: j */
    public boolean mo113526j(String str, int i, String str2, String str3, long j, long j2) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.AppBrandWxaPkgStorage", "flushWxaDebugAppVersionInfo, null or nil appId");
            return false;
        }
        Log.m105925i("MicroMsg.AppBrandWxaPkgStorage", "flushWxaDebugAppVersionInfo, appId %s, type %d, url %s, md5 %s, lifespan[%d, %d]", str, Integer.valueOf(i), str2, str3, Long.valueOf(j), Long.valueOf(j2));
        if (i == 999) {
            str = "@LibraryAppId";
        }
        C29315z2 m = mo113533pl(str, 1, i, new String[0]);
        if (m == null) {
            C29315z2 z2Var = new C29315z2();
            z2Var.field_appId = str;
            z2Var.field_version = 1;
            z2Var.field_debugType = i;
            z2Var.field_downloadURL = str2;
            z2Var.field_versionMd5 = str3;
            z2Var.field_startTime = j;
            z2Var.field_endTime = j2;
            z2Var.field_createTime = Util.nowSecond();
            mo113534q(z2Var);
            return true;
        }
        boolean z = !Util.isNullOrNil(str3) && !Util.isNullOrNil(m.field_versionMd5) && !str3.equals(m.field_versionMd5);
        boolean z2 = !Util.nullAsNil(str2).equals(Util.nullAsNil(m.field_downloadURL));
        if (z) {
            m.field_downloadURL = str2;
            if (C86013q1.m106447h(m.field_pkgPath)) {
                ((C81295n0) C86312j.m106911c(C81295n0.class)).mo56503tJ(m.field_pkgPath);
            }
            m.field_pkgPath = null;
            m.field_createTime = Util.nowSecond();
            m.field_versionMd5 = str3;
            m.field_startTime = j;
            m.field_endTime = j2;
            m.field_createTime = Util.nowSecond();
            mo113544z(m);
            if (Util.isNullOrNil(str.split("$"))) {
                mo113521e(str, i, 1);
            }
            return true;
        }
        if (z2) {
            m.field_downloadURL = str2;
            m.field_startTime = j;
            m.field_endTime = j2;
            mo113544z(m);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d5  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo113527k(java.lang.String r18, int r19, int r20, java.lang.String r21, java.lang.String r22) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            boolean r6 = com.tencent.p014mm.plugin.appbrand.appcache.C81289m.C81290a.m99664b(r19)
            r7 = 0
            if (r6 != 0) goto L_0x002c
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r1 == 0) goto L_0x002b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "invalid pkgType "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            junit.framework.Assert.fail(r1)
        L_0x002b:
            return r7
        L_0x002c:
            r6 = 5
            java.lang.Object[] r8 = new java.lang.Object[r6]
            r8[r7] = r1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r19)
            r10 = 1
            r8[r10] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r20)
            r11 = 2
            r8[r11] = r9
            r9 = 3
            r8[r9] = r4
            r12 = 4
            r8[r12] = r5
            java.lang.String r13 = "MicroMsg.AppBrandWxaPkgStorage"
            java.lang.String r14 = "flushWxaPkgVersionInfo for release, appId %s, type %d, version %d, md5 %s, url %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r14, r8)
            java.lang.String r8 = "@LibraryAppId"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0066
            int r8 = com.tencent.p014mm.plugin.appbrand.appcache.C81352s2.f238828a
            if (r3 != r8) goto L_0x0066
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            r1[r7] = r2
            java.lang.String r2 = "flushWxaPkgVersionInfo, given version == local library version %d, skip"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r2, r1)
            return r7
        L_0x0066:
            java.lang.String[] r8 = new java.lang.String[r7]
            com.tencent.mm.plugin.appbrand.appcache.z2 r8 = r0.mo113533pl(r1, r3, r2, r8)
            r14 = 0
            if (r8 != 0) goto L_0x00a4
            com.tencent.mm.plugin.appbrand.appcache.z2 r8 = new com.tencent.mm.plugin.appbrand.appcache.z2
            r8.<init>()
            r8.field_appId = r1
            r8.field_version = r3
            r8.field_versionMd5 = r4
            r8.field_NewMd5 = r14
            r8.field_downloadURL = r5
            r8.field_debugType = r2
            boolean r2 = r0.mo113534q(r8)
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            r3[r7] = r4
            r3[r10] = r1
            int r1 = r8.field_version
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3[r11] = r1
            java.lang.String r1 = r8.field_downloadURL
            r3[r9] = r1
            java.lang.String r1 = r8.field_versionMd5
            r3[r12] = r1
            java.lang.String r1 = "flushWxaPkgVersionInfo, insert record %b, appId %s, version %d, url %s, md5 %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r1, r3)
            return r2
        L_0x00a4:
            java.lang.String r2 = r8.field_downloadURL
            java.lang.String r15 = r8.field_versionMd5
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r15)
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L_0x00bc
            r8.field_versionMd5 = r4
            r8.field_NewMd5 = r14
            r8.field_version = r3
            r8.field_downloadURL = r5
        L_0x00ba:
            r6 = 1
            goto L_0x00ce
        L_0x00bc:
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r22)
            if (r6 != 0) goto L_0x00cd
            java.lang.String r6 = r8.field_downloadURL
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x00cd
            r8.field_downloadURL = r5
            goto L_0x00ba
        L_0x00cd:
            r6 = 0
        L_0x00ce:
            if (r6 == 0) goto L_0x00d5
            boolean r8 = r0.mo113544z(r8)
            goto L_0x00d6
        L_0x00d5:
            r8 = 0
        L_0x00d6:
            r14 = 8
            java.lang.Object[] r14 = new java.lang.Object[r14]
            if (r6 == 0) goto L_0x00e1
            if (r8 == 0) goto L_0x00e1
            r16 = 1
            goto L_0x00e3
        L_0x00e1:
            r16 = 0
        L_0x00e3:
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r16)
            r14[r7] = r16
            r14[r10] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            r14[r11] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            r14[r9] = r1
            r14[r12] = r2
            r1 = 5
            r14[r1] = r5
            r1 = 6
            r14[r1] = r15
            r1 = 7
            r14[r1] = r4
            java.lang.String r1 = "flushWxaPkgVersionInfo, update record %b, appId %s, oldVersion %d, newVersion %d, oldURL %s, newURL %s, oldMd5 %s, newMd5 %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r1, r14)
            if (r6 == 0) goto L_0x010c
            if (r8 == 0) goto L_0x010c
            r7 = 1
        L_0x010c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.C81258h3.mo113527k(java.lang.String, int, int, java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: l */
    public int mo113528l(String str, int i) {
        C29315z2 x;
        if (Util.isNullOrNil(str) || !C81289m.C81290a.m99664b(i) || (x = mo113516Kn(str, i, ProviderConstants.API_COLNAME_FEATURE_VERSION)) == null) {
            return 0;
        }
        return x.field_version;
    }

    /* renamed from: m */
    public C29315z2 mo113533pl(String str, int i, int i2, String... strArr) {
        C81258h3 h3Var;
        int i3;
        String str2 = str;
        StringBuilder sb = new StringBuilder();
        String[] strArr2 = C29315z2.f80041H;
        for (int i4 = 0; i4 < 3; i4++) {
            sb.append(strArr2[i4]);
            sb.append("=? and ");
        }
        sb.append("1=1");
        if (C81289m.C81290a.m99663a(i2)) {
            i3 = 1;
            h3Var = this;
        } else {
            h3Var = this;
            i3 = i;
        }
        C29315z2 z2Var = null;
        Cursor query = h3Var.f238664d.query("AppBrandWxaPkgManifestRecord", Util.isNullOrNil(strArr) ? null : strArr, sb.toString(), new String[]{str2, String.valueOf(i3), String.valueOf(i2)}, (String) null, (String) null, (String) null, 2);
        if (query == null) {
            return null;
        }
        if (query.moveToFirst()) {
            C29315z2 z2Var2 = new C29315z2();
            z2Var2.convertFrom(query);
            z2Var2.field_appId = str2;
            if (i3 > 0) {
                z2Var2.field_version = i3;
            }
            z2Var = z2Var2;
        }
        query.close();
        return z2Var;
    }

    /* renamed from: n */
    public C29315z2 mo113530n(String str) {
        Cursor query = this.f238664d.query("AppBrandWxaPkgManifestRecord", (String[]) null, "pkgPath=?", new String[]{str}, (String) null, (String) null, (String) null, 2);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    C29315z2 z2Var = new C29315z2();
                    z2Var.convertFrom(query);
                    query.close();
                    return z2Var;
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        if (query == null) {
            return null;
        }
        query.close();
        return null;
        throw th;
    }

    /* renamed from: o */
    public String mo113531o() {
        return this.f238665e.getTableName();
    }

    /* renamed from: p */
    public boolean mo113532p(String str, int i) {
        Cursor query;
        if (Util.isNullOrNil(str) || i < 0 || (query = this.f238664d.query("AppBrandWxaPkgManifestRecord", new String[]{ProviderConstants.API_COLNAME_FEATURE_VERSION}, String.format(Locale.US, "%s=? and %s=?", new Object[]{"appId", "debugType"}), new String[]{str, String.valueOf(i)}, (String) null, (String) null, (String) null, 2)) == null) {
            return false;
        }
        boolean moveToFirst = query.moveToFirst();
        query.close();
        return moveToFirst;
    }

    /* renamed from: q */
    public boolean mo113534q(C29315z2 z2Var) {
        Log.m105925i("MicroMsg.AppBrandWxaPkgStorage", "insertManifest, appId %s, type %d, version %d", z2Var.field_appId, Integer.valueOf(z2Var.field_debugType), Integer.valueOf(z2Var.field_version));
        boolean insert = this.f238665e.insert(z2Var);
        if (insert && C86013q1.m106450k(z2Var.field_pkgPath)) {
            ((C81295n0) C86312j.m106911c(C81295n0.class)).mo56505yy(z2Var.field_pkgPath);
        }
        return insert;
    }

    /* renamed from: r */
    public boolean mo113535r(C29315z2 z2Var) {
        if (C81289m.C81290a.m99663a(z2Var.field_debugType)) {
            z2Var.field_version = 1;
        }
        return ((Boolean) mo113537s(new C29220a(z2Var))).booleanValue();
    }

    /* renamed from: r3 */
    public C38537c0 mo113536r3(String str, int i, String str2, String[] strArr) {
        return mo113516Kn(str, i, strArr);
    }

    /* renamed from: s */
    public final synchronized <T> T mo113537s(C32224a<T> aVar) {
        long beginTransaction = this.f238664d.beginTransaction(Thread.currentThread().getId());
        try {
        } finally {
            this.f238664d.endTransaction(beginTransaction);
        }
        return aVar.invoke();
    }

    /* renamed from: t */
    public List<C29315z2> mo113538t(String str, int i) {
        Cursor query;
        Throwable th;
        String str2 = str;
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        String format = String.format(Locale.ENGLISH, "%s like ? and %s=?", new Object[]{"appId", "debugType"});
        try {
            ISQLiteDatabase iSQLiteDatabase = this.f238664d;
            query = iSQLiteDatabase.query("AppBrandWxaPkgManifestRecord", (String[]) null, format, new String[]{str2 + "%%", String.valueOf(i)}, (String) null, (String) null, (String) null, 2);
            if (query != null) {
                if (!query.isClosed()) {
                    if (query.moveToFirst()) {
                        LinkedList linkedList = new LinkedList();
                        do {
                            C29315z2 z2Var = new C29315z2();
                            z2Var.convertFrom(query);
                            if (!z2Var.field_appId.endsWith(ModulePkgInfo.PLUGIN_CODE)) {
                                linkedList.add(z2Var);
                            }
                        } while (query.moveToNext());
                        query.close();
                        return linkedList;
                    }
                }
            }
            List<C29315z2> emptyList = Collections.emptyList();
            if (query != null) {
                query.close();
            }
            return emptyList;
        } catch (Throwable th4) {
            Log.m105921e("MicroMsg.AppBrandWxaPkgStorage", "selectAllIncludingModules_keyBy_appId_versionType(%s, %d), get exception:%s", str2, Integer.valueOf(i), th4);
            return Collections.emptyList();
        }
        throw th;
    }

    /* renamed from: u */
    public List<C29315z2> mo113539u(String str, int i, int i2) {
        Throwable th;
        String str2 = str;
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        int i3 = C81289m.C81290a.m99663a(i) ? 1 : i2;
        String format = String.format(Locale.ENGLISH, "%s like ? AND %s != ? AND %s=? ", new Object[]{"appId", "appId", "debugType"});
        String[] strArr = {str2 + "%%", str2 + '$' + ModulePkgInfo.PLUGIN_CODE, String.valueOf(i)};
        if (i3 > 0) {
            format = format + " AND version = " + i3;
        }
        Cursor query = this.f238664d.query("AppBrandWxaPkgManifestRecord", (String[]) null, format, strArr, (String) null, (String) null, (String) null, 2);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    LinkedList linkedList = new LinkedList();
                    do {
                        C29315z2 z2Var = new C29315z2();
                        z2Var.convertFrom(query);
                        if (C90599h.m113509b(z2Var.field_appId, str2) || C90599h.m113508a(z2Var.field_appId, ModulePkgInfo.MAIN_MODULE_NAME)) {
                            linkedList.addLast(z2Var);
                        }
                    } while (query.moveToNext());
                    query.close();
                    return linkedList;
                }
            } catch (Throwable th4) {
                th.addSuppressed(th4);
            }
        }
        if (query != null) {
            query.close();
        }
        return Collections.emptyList();
        throw th;
    }

    /* renamed from: v */
    public List<C29315z2> mo113540v(String str, int i) {
        Throwable th;
        String str2 = str;
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        String format = String.format(Locale.ENGLISH, "%s like ? AND %s != ? AND %s=? AND %s=?", new Object[]{"appId", "appId", "debugType", ProviderConstants.API_COLNAME_FEATURE_VERSION});
        Cursor query = this.f238664d.query("AppBrandWxaPkgManifestRecord", (String[]) null, format, new String[]{str2 + "%%", str2 + '$' + ModulePkgInfo.PLUGIN_CODE, String.valueOf(0), String.valueOf(i)}, (String) null, (String) null, (String) null, 2);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    LinkedList linkedList = new LinkedList();
                    do {
                        C29315z2 z2Var = new C29315z2();
                        z2Var.convertFrom(query);
                        linkedList.addLast(z2Var);
                    } while (query.moveToNext());
                    query.close();
                    return linkedList;
                }
            } catch (Throwable th4) {
                th.addSuppressed(th4);
            }
        }
        if (query != null) {
            query.close();
        }
        return Collections.emptyList();
        throw th;
    }

    /* renamed from: w */
    public List<C29315z2> mo113541w(String str, int i, C68580b bVar, String... strArr) {
        if (Util.isNullOrNil(str)) {
            return Collections.emptyList();
        }
        ISQLiteDatabase iSQLiteDatabase = this.f238664d;
        String format = String.format(Locale.US, "%s=? and %s=? ", new Object[]{"appId", "debugType"});
        String[] strArr2 = {str, String.valueOf(i)};
        Cursor query = iSQLiteDatabase.query("AppBrandWxaPkgManifestRecord", strArr, format, strArr2, (String) null, (String) null, "version " + bVar.name(), 2);
        if (query == null) {
            return Collections.emptyList();
        }
        if (!query.moveToFirst()) {
            query.close();
            return Collections.emptyList();
        }
        LinkedList linkedList = new LinkedList();
        do {
            C29315z2 z2Var = new C29315z2();
            z2Var.convertFrom(query);
            z2Var.field_appId = str;
            z2Var.field_debugType = i;
            linkedList.add(z2Var);
        } while (query.moveToNext());
        query.close();
        return linkedList;
    }

    /* renamed from: x */
    public C29315z2 mo113516Kn(String str, int i, String... strArr) {
        String format;
        String[] strArr2;
        String str2;
        C29315z2 z2Var = null;
        if (Util.isNullOrNil(str)) {
            return null;
        }
        if (C81289m.C81290a.m99664b(i)) {
            format = String.format(Locale.US, "%s=? and %s=?", new Object[]{"appId", "debugType"});
            strArr2 = new String[]{str, String.valueOf(i)};
            str2 = "version desc";
        } else if (C81289m.C81290a.m99663a(i)) {
            format = String.format(Locale.US, "%s=? and %s=? and %s=?", new Object[]{"appId", "debugType", ProviderConstants.API_COLNAME_FEATURE_VERSION});
            strArr2 = new String[]{str, String.valueOf(i), "1"};
            str2 = "createTime desc";
        } else {
            throw new RuntimeException("Illegal pkgType " + i);
        }
        Cursor query = this.f238664d.query("AppBrandWxaPkgManifestRecord", Util.isNullOrNil(strArr) ? null : strArr, format, strArr2, (String) null, (String) null, str2);
        if (query == null) {
            return null;
        }
        if (query.moveToFirst()) {
            z2Var = new C29315z2();
            z2Var.convertFrom(query);
            z2Var.field_appId = str;
            z2Var.field_debugType = i;
        }
        query.close();
        return z2Var;
    }

    /* renamed from: y */
    public int[] mo113543y(String str) {
        int[] iArr = null;
        if (!Util.isNullOrNil(str)) {
            int i = 0;
            if (C81289m.C81290a.m99664b(0)) {
                List<C29315z2> w = mo113541w(str, 0, C68580b.DESC, ProviderConstants.API_COLNAME_FEATURE_VERSION);
                if (!Util.isNullOrNil((List) w)) {
                    iArr = new int[w.size()];
                    for (C29315z2 z2Var : w) {
                        iArr[i] = z2Var.field_version;
                        i++;
                    }
                }
            } else if (BuildInfo.DEBUG) {
                Assert.fail("invalid release pkgType 0");
            }
        }
        return iArr;
    }

    /* renamed from: z */
    public boolean mo113544z(C29315z2 z2Var) {
        Log.m105925i("MicroMsg.AppBrandWxaPkgStorage", "updateManifest, appId %s, version %d, pkgType %d", z2Var.field_appId, Integer.valueOf(z2Var.field_version), Integer.valueOf(z2Var.field_debugType));
        if (TextUtils.isEmpty(z2Var.field_appId)) {
            return false;
        }
        if (C81289m.C81290a.m99663a(z2Var.field_debugType)) {
            z2Var.field_version = 1;
        }
        boolean updateNotify = this.f238665e.updateNotify(z2Var, true, C29315z2.f80041H);
        if (updateNotify && C86013q1.m106450k(z2Var.field_pkgPath)) {
            ((C81295n0) C86312j.m106911c(C81295n0.class)).mo56505yy(z2Var.field_pkgPath);
        }
        return updateNotify;
    }
}
