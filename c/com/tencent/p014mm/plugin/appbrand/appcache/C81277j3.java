package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.plugin.appbrand.appcache.C81387x2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import gy3.C87412m;
import java.util.Arrays;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.j3 */
public final class C81277j3 {
    /* renamed from: a */
    public static final boolean m99635a(C81347q0<? extends C29222i> q0Var, C29222i iVar) {
        boolean z;
        C87412m.m108594g(q0Var, "<this>");
        C87412m.m108594g(iVar, "record");
        if (q0Var instanceof C81258h3) {
            return ((C81258h3) q0Var).mo113535r((C29315z2) iVar);
        }
        if (!(q0Var instanceof C81387x2)) {
            return false;
        }
        C81387x2 x2Var = (C81387x2) q0Var;
        C81227a3 a3Var = (C81227a3) iVar;
        Class cls = C81295n0.class;
        C81387x2.C81388a aVar = C81387x2.f238891f;
        if (!C81387x2.C81388a.m99823a(aVar, a3Var)) {
            Log.m105920e("Luggage.WxaPkgIndexedWithDescStorage", "insertOrUpdate(" + C81387x2.C81388a.m99824b(aVar, a3Var, false, 1, (Object) null) + ") invalid record");
            return false;
        }
        synchronized (x2Var) {
            try {
                ISQLiteDatabase iSQLiteDatabase = x2Var.f238893e;
                long beginTransaction = iSQLiteDatabase.beginTransaction(Thread.currentThread().getId());
                if (x2Var.mo113669jo(a3Var)) {
                    String[] strArr = C81227a3.f238598I;
                    z = x2Var.updateNotify(a3Var, true, (String[]) Arrays.copyOf(strArr, strArr.length));
                    if (z && C86013q1.m106450k(a3Var.field_pkgPath)) {
                        String str = a3Var.field_pkgPath;
                        C87412m.m108593f(str, "record.field_pkgPath");
                        ((C81295n0) C86312j.m106911c(cls)).mo56505yy(str);
                    }
                    Log.m105924i("Luggage.WxaPkgIndexedWithDescStorage", "updateNotify appid:" + a3Var.field_appId + ",newMd5:" + a3Var.field_NewMd5 + ", versionDesc:" + a3Var.field_versionDesc + ", update ret:" + z);
                } else {
                    z = x2Var.insertNotify(a3Var, true);
                    if (z && C86013q1.m106450k(a3Var.field_pkgPath)) {
                        String str2 = a3Var.field_pkgPath;
                        C87412m.m108593f(str2, "record.field_pkgPath");
                        ((C81295n0) C86312j.m106911c(cls)).mo56505yy(str2);
                    }
                    Log.m105924i("Luggage.WxaPkgIndexedWithDescStorage", "insertNotify appid:" + a3Var.field_appId + ",newMd5:" + a3Var.field_NewMd5 + ", versionDesc:" + a3Var.field_versionDesc + ", insert ret:" + z);
                }
                C13598b0 b0Var = C13598b0.f38549a;
                iSQLiteDatabase.endTransaction(beginTransaction);
            } catch (Exception e) {
                Log.m105920e("Luggage.WxaPkgIndexedWithDescStorage", "insertOrUpdate(" + C81387x2.C81388a.m99824b(C81387x2.f238891f, a3Var, false, 1, (Object) null) + "), exception:" + e);
                C13598b0 b0Var2 = C13598b0.f38549a;
                return false;
            }
        }
        return z;
    }

    /* renamed from: b */
    public static final boolean m99636b(C81347q0<? extends C29222i> q0Var, C29222i iVar) {
        boolean updateNotify;
        C87412m.m108594g(q0Var, "<this>");
        C87412m.m108594g(iVar, "record");
        if (q0Var instanceof C81258h3) {
            return ((C81258h3) q0Var).mo113544z((C29315z2) iVar);
        }
        if (!(q0Var instanceof C81387x2)) {
            return false;
        }
        C81387x2 x2Var = (C81387x2) q0Var;
        C81227a3 a3Var = (C81227a3) iVar;
        C81387x2.C81388a aVar = C81387x2.f238891f;
        if (!C81387x2.C81388a.m99823a(aVar, a3Var)) {
            Log.m105920e("Luggage.WxaPkgIndexedWithDescStorage", "update(" + C81387x2.C81388a.m99824b(aVar, a3Var, false, 1, (Object) null) + ") invalid record");
            return false;
        }
        synchronized (x2Var) {
            String[] strArr = C81227a3.f238598I;
            updateNotify = x2Var.updateNotify(a3Var, true, (String[]) Arrays.copyOf(strArr, strArr.length));
            if (updateNotify && C86013q1.m106450k(a3Var.field_pkgPath)) {
                String str = a3Var.field_pkgPath;
                C87412m.m108593f(str, "record.field_pkgPath");
                ((C81295n0) C86312j.m106911c(C81295n0.class)).mo56505yy(str);
            }
        }
        return updateNotify;
    }
}
