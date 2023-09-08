package com.tencent.p014mm.plugin.appbrand.appcache;

import android.database.Cursor;
import com.tencent.luggage.sdk.processes.C80254f;
import com.tencent.luggage.sdk.processes.C80264l;
import com.tencent.p014mm.plugin.appbrand.AppBrandFileCleaner;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appusage.C81477d0;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import cy3.C58003b;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kr0.C33994g0;
import p749xh.C66261f3;
import rx3.C13598b0;
import sx3.C36907w;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.a0 */
public final class C81226a0 implements Runnable {

    /* renamed from: d */
    public final AtomicBoolean f238596d = new AtomicBoolean();

    public void run() {
        String str;
        long j;
        String str2;
        ArrayList arrayList;
        long j2;
        Iterator it;
        ArrayList arrayList2;
        ArrayList arrayList3;
        HashMap hashMap;
        long j3;
        String str3;
        Throwable th;
        long j4;
        Throwable th4;
        Class cls = C81477d0.class;
        this.f238596d.set(false);
        long currentTicks = Util.currentTicks();
        C81477d0 d0Var = (C81477d0) C81161g2.Bx0(cls);
        if (d0Var == null) {
            Log.m105920e("MicroMsg.AppBrand.AppBrandDataCleanupLogic", "prepare to run clean up logic, but storage is null");
            return;
        }
        Log.m105924i("MicroMsg.AppBrand.AppBrandDataCleanupLogic", "prepare to flush mess info column");
        d0Var.mo113783jo();
        HashMap hashMap2 = new HashMap();
        int i = AppBrandGlobalSystemConfig.m100099b().f239311o;
        Log.m105924i("MicroMsg.AppBrand.AppBrandDataCleanupLogic", "signle wxa file storage clean mb threshold: " + i);
        ArrayList arrayList4 = new ArrayList();
        String format = String.format(Locale.US, "select %s from %s where %s > %d", Arrays.copyOf(new Object[]{"appId", "AppBrandMessInfoRecord", "maxFileStorageSize", Integer.valueOf(i)}, 4));
        C87412m.m108593f(format, "format(locale, format, *args)");
        Cursor rawQuery = d0Var.rawQuery(format, new String[0]);
        if (rawQuery != null) {
            try {
                if (rawQuery.moveToFirst()) {
                    do {
                        arrayList4.add(rawQuery.getString(0));
                    } while (rawQuery.moveToNext());
                }
                C13598b0 b0Var = C13598b0.f38549a;
                C58003b.m67160a(rawQuery, (Throwable) null);
            } catch (Throwable th5) {
                Throwable th6 = th5;
                C58003b.m67160a(rawQuery, th4);
                throw th6;
            }
        }
        Log.m105924i("MicroMsg.AppBrand.AppBrandDataCleanupLogic", "prepare to calculate total file size");
        Iterator it4 = arrayList4.iterator();
        long j5 = 0;
        while (it4.hasNext()) {
            String str4 = (String) it4.next();
            AppBrandFileCleaner.C81062a aVar = AppBrandFileCleaner.f238096a;
            Boolean bool = Boolean.FALSE;
            C87412m.m108594g(str4, "appId");
            String i2 = C86709a0.m107523b().mo121111i();
            if (i2 == null || i2.length() == 0) {
                Log.m105920e("MicroMsg.AppBrandFileCleaner", "uin value is invaild");
                j4 = 0;
            } else {
                C87412m.m108593f(i2, "uin");
                j4 = aVar.mo112997a(i2, str4, bool);
            }
            hashMap2.put(str4, Long.valueOf(j4));
            j5 += j4;
        }
        int i3 = AppBrandGlobalSystemConfig.m100099b().f239312p;
        Log.m105924i("MicroMsg.AppBrand.AppBrandDataCleanupLogic", "global wxa file storage clean mb threshold: " + i3);
        long j6 = currentTicks;
        long j7 = (long) 1024;
        long j8 = ((long) i3) * j7 * j7;
        StringBuilder sb = new StringBuilder();
        sb.append("current total byte file size: ");
        sb.append(j5);
        sb.append(", global wxa file storage clean byte threshold: ");
        sb.append(j8);
        sb.append(", large than targetMaxStorageSize: ");
        int i4 = (j5 > j8 ? 1 : (j5 == j8 ? 0 : -1));
        sb.append(i4 >= 0);
        sb.append(", storage usage map size: ");
        sb.append(hashMap2.size());
        Log.m105924i("MicroMsg.AppBrand.AppBrandDataCleanupLogic", sb.toString());
        if (i4 < 0 || !(!hashMap2.isEmpty())) {
            str = LocaleUtil.MALAY;
        } else {
            long currentTicks2 = Util.currentTicks();
            long j9 = j5;
            long j15 = j8 / ((long) 2);
            Log.m105924i("MicroMsg.AppBrand.AppBrandDataCleanupLogic", "execute file clean");
            ArrayList arrayList5 = new ArrayList(hashMap2.size());
            for (Map.Entry key : hashMap2.entrySet()) {
                arrayList5.add((String) key.getKey());
            }
            String i5 = C86709a0.m107523b().mo121111i();
            if (i5 == null || i5.length() == 0) {
                Log.m105920e("MicroMsg.AppBrand.AppBrandDataCleanupLogic", "uin value is invaild");
            } else {
                C81477d0 d0Var2 = (C81477d0) C81161g2.Bx0(cls);
                if (d0Var2 == null) {
                    Log.m105920e("MicroMsg.AppBrand.AppBrandDataCleanupLogic", "prepare to execute file clean logic, but storage is null");
                } else {
                    ArrayList arrayList6 = new ArrayList();
                    StringBuilder sb4 = new StringBuilder();
                    for (Iterator it5 = arrayList5.iterator(); it5.hasNext(); it5 = it5) {
                        sb4.append("'");
                        sb4.append((String) it5.next());
                        sb4.append("',");
                    }
                    if (sb4.length() > 0) {
                        sb4.setLength(sb4.length() - 1);
                    }
                    Locale locale = Locale.US;
                    str2 = LocaleUtil.MALAY;
                    String format2 = String.format(locale, "select attributes.appId from %s as duplicate left join %s as attributes on duplicate.username = attributes.username where attributes.appId in (%s) order by duplicate.%s ASC", Arrays.copyOf(new Object[]{"AppBrandAppLaunchUsernameDuplicateRecord2", "WxaAttributesTable", sb4.toString(), C66261f3.COL_UPDATETIME}, 4));
                    C87412m.m108593f(format2, "format(locale, format, *args)");
                    Cursor rawQuery2 = d0Var2.rawQuery(format2, new String[0]);
                    if (rawQuery2 != null) {
                        try {
                            if (rawQuery2.moveToFirst()) {
                                do {
                                    arrayList6.add(rawQuery2.getString(0));
                                } while (rawQuery2.moveToNext());
                            }
                            C13598b0 b0Var2 = C13598b0.f38549a;
                            C58003b.m67160a(rawQuery2, (Throwable) null);
                        } catch (Throwable th7) {
                            Throwable th8 = th7;
                            C58003b.m67160a(rawQuery2, th);
                            throw th8;
                        }
                    }
                    Log.m105924i("MicroMsg.AppBrand.AppBrandDataCleanupLogic", "get app id list finished");
                    List<C80264l> a = AppBrandProcessesManager.f246131g.mo116962a().mo111386a();
                    ArrayList arrayList7 = new ArrayList(C36907w.m41090l(a, 10));
                    Iterator it6 = ((ArrayList) a).iterator();
                    while (it6.hasNext()) {
                        arrayList7.add(((C80264l) it6.next()).f234965a);
                    }
                    C33994g0.C33995a Xl = ((C33994g0) C86312j.m106911c(C33994g0.class)).mo56493Xl();
                    C87412m.m108593f(Xl, "getService(IAppBrandFile….appBrandFileCleanManager");
                    Xl.mo56495b(arrayList6);
                    Iterator it7 = arrayList6.iterator();
                    while (true) {
                        j = currentTicks2;
                        if (it7.hasNext()) {
                            String str5 = (String) it7.next();
                            if (!hashMap2.containsKey(str5)) {
                                Log.m105924i("MicroMsg.AppBrand.AppBrandDataCleanupLogic", "pre delete appId: " + str5 + ", but not found in info map");
                                currentTicks2 = j;
                            } else {
                                if (arrayList7.contains(str5)) {
                                    arrayList2 = arrayList7;
                                    StringBuilder sb5 = new StringBuilder();
                                    it = it7;
                                    sb5.append("kill mini program appId: ");
                                    sb5.append(str5);
                                    Log.m105924i("MicroMsg.AppBrand.AppBrandDataCleanupLogic", sb5.toString());
                                    C80254f.m97662v(AppBrandProcessesManager.f246131g.mo116962a(), str5, 0, false, 6, (Object) null);
                                } else {
                                    arrayList2 = arrayList7;
                                    it = it7;
                                }
                                AppBrandFileCleaner.C81062a aVar2 = AppBrandFileCleaner.f238096a;
                                C87412m.m108593f(i5, "uin");
                                AppBrandFileCleaner.C81062a.m99060c(aVar2, i5, str5, (Boolean) null, 4, (Object) null);
                                Xl.mo56494a(str5);
                                Long l = (Long) hashMap2.get(str5);
                                if (l != null) {
                                    long longValue = l.longValue();
                                    hashMap = hashMap2;
                                    str3 = i5;
                                    j3 = longValue;
                                    arrayList3 = arrayList5;
                                } else {
                                    hashMap = hashMap2;
                                    arrayList3 = arrayList5;
                                    str3 = i5;
                                    j3 = 0;
                                }
                                long j16 = j9 - j3;
                                String str6 = str3;
                                Log.m105918d("MicroMsg.AppBrand.AppBrandDataCleanupLogic", "appId: " + str5 + ", appId size: " + j3 + ", current size: " + j16 + ", limit size: " + j15);
                                if (j16 <= j15) {
                                    Log.m105924i("MicroMsg.AppBrand.AppBrandDataCleanupLogic", "file cleanup finish, size after clean: " + j16);
                                    Xl.release();
                                    break;
                                }
                                j9 = j16;
                                arrayList7 = arrayList2;
                                currentTicks2 = j;
                                it7 = it;
                                hashMap2 = hashMap;
                                arrayList5 = arrayList3;
                                i5 = str6;
                            }
                        } else {
                            HashMap hashMap3 = hashMap2;
                            ArrayList arrayList8 = arrayList5;
                            String str7 = i5;
                            if (j9 > j15) {
                                Log.m105924i("MicroMsg.AppBrand.AppBrandDataCleanupLogic", "clean appbrand which not in duplicate");
                                Iterator it8 = arrayList8.iterator();
                                while (true) {
                                    if (!it8.hasNext()) {
                                        break;
                                    }
                                    String str8 = (String) it8.next();
                                    if (!arrayList6.contains(str8)) {
                                        AppBrandFileCleaner.C81062a aVar3 = AppBrandFileCleaner.f238096a;
                                        String str9 = str7;
                                        C87412m.m108593f(str9, "uin");
                                        AppBrandFileCleaner.C81062a.m99060c(aVar3, str9, str8, (Boolean) null, 4, (Object) null);
                                        Xl.mo56494a(str8);
                                        HashMap hashMap4 = hashMap3;
                                        Long l2 = (Long) hashMap4.get(str8);
                                        if (l2 != null) {
                                            str7 = str9;
                                            arrayList = arrayList6;
                                            hashMap3 = hashMap4;
                                            j2 = l2.longValue();
                                        } else {
                                            str7 = str9;
                                            hashMap3 = hashMap4;
                                            arrayList = arrayList6;
                                            j2 = 0;
                                        }
                                        long j17 = j9 - j2;
                                        Iterator it9 = it8;
                                        Log.m105918d("MicroMsg.AppBrand.AppBrandDataCleanupLogic", "appId: " + str8 + ", appId size: " + j2 + ", current size: " + j17 + ", limit size: " + j15);
                                        if (j17 <= j15) {
                                            Log.m105924i("MicroMsg.AppBrand.AppBrandDataCleanupLogic", "appId not in duplicate cleanup finish, size after clean: " + j17);
                                            Xl.release();
                                            break;
                                        }
                                        j9 = j17;
                                        arrayList6 = arrayList;
                                        it8 = it9;
                                    }
                                }
                            }
                            Xl.release();
                        }
                    }
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("clean finish, cost: ");
                    sb6.append(Util.ticksToNow(j));
                    str = str2;
                    sb6.append(str);
                    Log.m105924i("MicroMsg.AppBrand.AppBrandDataCleanupLogic", sb6.toString());
                }
            }
            str2 = LocaleUtil.MALAY;
            j = currentTicks2;
            StringBuilder sb62 = new StringBuilder();
            sb62.append("clean finish, cost: ");
            sb62.append(Util.ticksToNow(j));
            str = str2;
            sb62.append(str);
            Log.m105924i("MicroMsg.AppBrand.AppBrandDataCleanupLogic", sb62.toString());
        }
        Log.m105924i("MicroMsg.AppBrand.AppBrandDataCleanupLogic", "run() cost " + Util.ticksToNow(j6) + str);
    }
}
