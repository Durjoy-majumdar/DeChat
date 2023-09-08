package io0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.vfs.C86009m1;
import gy3.C87412m;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

/* renamed from: io0.f */
public final class C33370f {

    /* renamed from: a */
    public static final C33370f f90435a = new C33370f();

    /* renamed from: a */
    public final boolean mo59107a(C86009m1 m1Var) {
        C87412m.m108594g(m1Var, "cacheFile");
        if (m1Var.mo119977o()) {
            Log.m105918d("MicroMsg.AppBrand.AppBrandResCacheChecker", "validateDir, cacheDir: " + m1Var);
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("AppBrandResCacheMeta");
            String str = "metaData_dir_" + m1Var.mo119971i();
            Log.m105918d("MicroMsg.AppBrand.AppBrandResCacheChecker", "getDirMeta, key: " + str);
            C33376l lVar = null;
            String string = mmkv.getString(str, (String) null);
            if (string == null || string.length() == 0) {
                Log.m105928w("MicroMsg.AppBrand.AppBrandResCacheChecker", "validateDir, metaDataStr is empty");
            } else {
                try {
                    lVar = C33376l.f90443c.mo59115a(new JSONObject(string));
                } catch (Exception e) {
                    Log.m105918d("MicroMsg.AppBrand.AppBrandResCacheChecker", "validateDir, get metaData fail since " + e);
                }
                if (lVar == null) {
                    Log.m105928w("MicroMsg.AppBrand.AppBrandResCacheChecker", "validateDir, metaData is null");
                } else {
                    C86009m1 l = m1Var.mo119974l();
                    C87412m.m108591d(l);
                    if (mo59109c(lVar, l)) {
                        return true;
                    }
                    Log.m105928w("MicroMsg.AppBrand.AppBrandResCacheChecker", "validateDir, validateMeta fail");
                }
            }
        } else {
            MultiProcessMMKV mmkv2 = MultiProcessMMKV.getMMKV("AppBrandResCacheMeta");
            String str2 = "metaData_file_" + m1Var.mo119971i();
            Log.m105918d("MicroMsg.AppBrand.AppBrandResCacheChecker", "getFileLastModified, key: " + str2);
            long j = mmkv2.getLong(str2, -1);
            long q = m1Var.mo119979q();
            Log.m105918d("MicroMsg.AppBrand.AppBrandResCacheChecker", "validateFile, cacheFile: " + m1Var + ", savedLastModified: " + j + ", realLastModified: " + q);
            if (j == q) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo59108b(C86009m1 m1Var) {
        C87412m.m108594g(m1Var, "cacheFile");
        if (m1Var.mo119977o()) {
            Log.m105918d("MicroMsg.AppBrand.AppBrandResCacheChecker", "recordDir, cacheDir: " + m1Var);
            String str = null;
            C33374k kVar = m1Var.mo119977o() ? new C33374k(m1Var) : null;
            if (kVar == null) {
                Log.m105928w("MicroMsg.AppBrand.AppBrandResCacheChecker", "recordDir, metaData is null");
            } else {
                JSONObject a = kVar.mo59113a();
                if (a != null) {
                    str = a.toString();
                }
                if (str == null || str.length() == 0) {
                    Log.m105928w("MicroMsg.AppBrand.AppBrandResCacheChecker", "recordDir, metaDataStr is empty");
                } else {
                    MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("AppBrandResCacheMeta");
                    String str2 = "metaData_dir_" + m1Var.mo119971i();
                    Log.m105918d("MicroMsg.AppBrand.AppBrandResCacheChecker", "saveDirMeta, key: " + str2);
                    mmkv.putString(str2, str);
                    return true;
                }
            }
            return false;
        }
        MultiProcessMMKV mmkv2 = MultiProcessMMKV.getMMKV("AppBrandResCacheMeta");
        String str3 = "metaData_file_" + m1Var.mo119971i();
        long q = m1Var.mo119979q();
        Log.m105918d("MicroMsg.AppBrand.AppBrandResCacheChecker", "saveFileLastModified, key: " + str3 + ", lastModified: " + q);
        mmkv2.putLong(str3, q);
        return true;
    }

    /* renamed from: c */
    public final boolean mo59109c(C33376l lVar, C86009m1 m1Var) {
        C86009m1 m1Var2 = new C86009m1(m1Var, lVar.f90444a);
        Log.m105918d("MicroMsg.AppBrand.AppBrandResCacheChecker", "validateMeta, unzipFile: " + m1Var2);
        if (!(lVar instanceof C33374k)) {
            return m1Var2.mo119967g() && m1Var2.mo119978p() && lVar.f90445b == m1Var2.mo119979q();
        }
        List<C33376l> list = ((C33374k) lVar).f90442d;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (C33376l c : list) {
            if (!f90435a.mo59109c(c, m1Var2)) {
                return false;
            }
        }
        return true;
    }
}
