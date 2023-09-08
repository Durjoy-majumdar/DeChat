package com.tencent.p014mm.plugin.appbrand.appcache;

import a70.C112760b;
import android.database.Cursor;
import android.os.StatFs;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppPackageCheckActionStruct;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.j0 */
public class C81272j0 {
    /* renamed from: a */
    public static int m99629a() {
        HashSet hashSet = new HashSet();
        C81161g2.requireAccountInitializedOnDemand();
        Cursor rawQuery = C81161g2.f238476o.rawQuery("select distinct appId from AppBrandWxaPkgManifestRecord where  ( appId not like '%%$%%' or appId like " + String.format(Locale.US, "'%%$%s'", new Object[]{ModulePkgInfo.MAIN_MODULE_NAME}) + " )  and  ( " + "pkgPath" + " is not null  and " + "pkgPath" + " != ''  ) ", (String[]) null, 2);
        if (rawQuery != null && !rawQuery.isClosed()) {
            if (rawQuery.moveToFirst()) {
                do {
                    String string = rawQuery.getString(0);
                    int indexOf = string.indexOf(36);
                    if (indexOf > 0) {
                        string = string.substring(0, indexOf);
                    }
                    hashSet.add(string);
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
        }
        C81161g2.requireAccountInitializedOnDemand();
        Cursor rawQuery2 = C81161g2.f238476o.rawQuery("select distinct appId from PredownloadEncryptPkgInfo where pkgPath is not null  and pkgPath != '' ", (String[]) null, 2);
        if (rawQuery2 != null && !rawQuery2.isClosed()) {
            if (rawQuery2.moveToFirst()) {
                hashSet.add(rawQuery2.getString(0));
            }
            do {
            } while (rawQuery2.moveToNext());
            rawQuery2.close();
        }
        return hashSet.size();
    }

    /* renamed from: b */
    public static void m99630b() {
        C81161g2.requireAccountInitializedOnDemand();
        if (C81161g2.f238476o == null) {
            Log.m105920e("MicroMsg.AppBrand.IPkgCleanupLogic.Report", "reportStorageUsage, db not ready");
            return;
        }
        try {
            WeAppPackageCheckActionStruct weAppPackageCheckActionStruct = new WeAppPackageCheckActionStruct();
            StatFs statFs = new StatFs(C81355t2.m99776b());
            StatFs statFs2 = new StatFs(C81355t2.m99777c());
            long blockCountLong = statFs.getBlockCountLong() + statFs2.getBlockCountLong();
            long c = C81412d0.m99869c(new C86009m1(C81355t2.m99776b())) + C81412d0.m99869c(new C86009m1(C81355t2.m99777c()));
            weAppPackageCheckActionStruct.f236608d = c;
            weAppPackageCheckActionStruct.f236609e = Math.round((((double) (c / (statFs.getBlockSizeLong() + statFs2.getBlockSizeLong()))) / ((double) blockCountLong)) * 100.0d);
            StatFs statFs3 = new StatFs(C112760b.m154225d());
            weAppPackageCheckActionStruct.f236610f = Math.round((((double) statFs3.getAvailableBlocksLong()) / ((double) statFs3.getBlockCountLong())) * 100.0d);
            weAppPackageCheckActionStruct.f236611g = 1;
            weAppPackageCheckActionStruct.f236612h = (long) m99629a();
            Log.m105925i("MicroMsg.AppBrand.IPkgCleanupLogic.Report", "reportStorageUsage %s", weAppPackageCheckActionStruct.mo1006q());
            weAppPackageCheckActionStruct.mo86054n();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrand.IPkgCleanupLogic.Report", "reportStorageUsage get exception:%s", e);
        }
    }
}
