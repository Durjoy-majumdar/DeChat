package com.tencent.p014mm.plugin.appbrand.utils;

import a70.C112760b;
import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.plugin.appbrand.page.C83762b1;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.FilePathGenerator;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.vfs.C86009m1;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p823sg.C90193h;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.y */
public class C84795y {

    /* renamed from: a */
    public static ConcurrentMap<String, Boolean> f247223a = new ConcurrentHashMap();

    /* renamed from: b */
    public static Map<String, List<C40572a>> f247224b = new HashMap();

    /* renamed from: c */
    public static final String f247225c;

    /* renamed from: com.tencent.mm.plugin.appbrand.utils.y$a */
    public interface C40572a {
        /* renamed from: a */
        void mo1966a(String str);
    }

    static {
        String C = C112760b.m154195C();
        if (!C.endsWith("/")) {
            C = C + "/";
        }
        String str = C + "wxacache/";
        f247225c = str;
        FilePathGenerator.checkMkdir(str);
    }

    /* renamed from: a */
    public static String m104475a(String str) {
        return String.format("%s%s", new Object[]{f247225c, !Util.isNullOrNil(str) ? C90193h.m112878f(str.getBytes()) : null});
    }

    /* renamed from: b */
    public static boolean m104476b(String str, String str2) {
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "isMd5Valid target nil, no check");
            return true;
        }
        String d = C90193h.m112876d(str2);
        Log.m105925i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "isMd5Valid file:%s target:%s", d, str);
        return str.equals(d);
    }

    /* renamed from: c */
    public static void m104477c(C82381f fVar, String str, String str2, C40572a aVar) {
        if (!Util.isNullOrNil(str) && aVar != null) {
            boolean z = false;
            if (str.startsWith("wxfile://")) {
                Log.m105925i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "handleWxfile, url:%s", str);
                if (fVar == null) {
                    Log.m105924i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "handleWxfile, component is null");
                } else {
                    C86009m1 absoluteFile = fVar.getFileSystem().getAbsoluteFile(str);
                    if (absoluteFile != null && absoluteFile.mo119967g()) {
                        String i = absoluteFile.mo119971i();
                        Log.m105925i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "handleWxfile, localPath:%s", i);
                        if (m104476b(str2, i)) {
                            aVar.mo1966a(i);
                            z = true;
                        }
                    }
                }
                if (!z) {
                    aVar.mo1966a((String) null);
                }
            } else if (str.startsWith(HttpWrapperBase.PROTOCAL_HTTP) || str.startsWith(HttpWrapperBase.PROTOCAL_HTTPS)) {
                Log.m105925i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "handleNetworkFile, url:%s", str);
                String a = m104475a(str);
                Log.m105925i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "handleNetworkFile, localPath:%s", a);
                MMHandlerThread.postToMainThread(new C40569v(str, aVar));
                ThreadPool.post(new C40570w(str, str2, a), "AppBrandLiveFileLoadHelperThread");
            } else {
                Log.m105925i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "handlePackageImage, url:%s", str);
                if (fVar == null) {
                    Log.m105924i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "handlePackageImage, component is null");
                } else if (!(fVar instanceof C82554k)) {
                    Log.m105924i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "handlePackageImage, can not get runtime from component");
                } else {
                    AppBrandRuntime runtime = ((C82554k) fVar).getRuntime();
                    if (runtime == null) {
                        Log.m105924i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "handlePackageImage, runtime is null");
                    } else {
                        String a2 = m104475a(str);
                        Log.m105925i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "handlePackageImage, localPath:%s", a2);
                        C86009m1 m1Var = new C86009m1(a2);
                        if (!m1Var.mo119967g()) {
                            Bitmap b = C83762b1.m102898b(runtime, str);
                            if (b == null || b.isRecycled()) {
                                Log.m105920e("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "handlePackageImage, no bitmap in the given url");
                            } else {
                                try {
                                    BitmapUtil.saveBitmapToImage(b, 100, Bitmap.CompressFormat.PNG, a2, true);
                                    if (!b.isRecycled()) {
                                        Log.m105925i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "bitmap recycle %s", b);
                                        b.recycle();
                                    }
                                } catch (IOException e) {
                                    Log.m105921e("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "handlePackageImage, fail to compress bitmap to file", e);
                                    if (!b.isRecycled()) {
                                        Log.m105925i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "bitmap recycle %s", b);
                                        b.recycle();
                                    }
                                } catch (Throwable th) {
                                    if (!b.isRecycled()) {
                                        Log.m105925i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "bitmap recycle %s", b);
                                        b.recycle();
                                    }
                                    throw th;
                                }
                            }
                        }
                        if (m104476b(str2, a2)) {
                            aVar.mo1966a(a2);
                            z = true;
                        } else {
                            Log.m105925i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "handlePackageImage, file exists but md5 not valid, deleted:%b", Boolean.valueOf(m1Var.mo119966f()));
                        }
                    }
                }
                if (!z) {
                    aVar.mo1966a((String) null);
                }
            }
        }
    }
}
