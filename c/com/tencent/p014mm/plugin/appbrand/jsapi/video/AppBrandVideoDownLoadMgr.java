package com.tencent.p014mm.plugin.appbrand.jsapi.video;

import a70.C112760b;
import android.net.Uri;
import com.tencent.p014mm.autogen.mmdata.rpt.AppBrandVideoPreLoadReportStruct;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.jsapi.C83051d;
import com.tencent.p014mm.sdk.platformtools.FilePathGenerator;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p1084mk.C117555c;
import p1084mk.C117556d;
import p1084mk.C99907a;
import p711uo.C102059b;
import ym0.C118987a;
import ym0.C91508e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoDownLoadMgr */
public class AppBrandVideoDownLoadMgr {

    /* renamed from: a */
    public static final String f345370a;

    /* renamed from: b */
    public static HashMap<String, String> f345371b = new HashMap<>();

    /* renamed from: c */
    public static final Map<String, C118987a> f345372c = new ConcurrentHashMap();

    /* renamed from: d */
    public static AppBrandVideoDownLoadMgr f345373d;

    /* renamed from: e */
    public static C117556d f345374e;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoDownLoadMgr$a */
    public class C115254a implements C117555c {
    }

    static {
        f345373d = null;
        f345374e = null;
        f345373d = new AppBrandVideoDownLoadMgr();
        String C = C112760b.m154195C();
        if (!C.endsWith("/")) {
            C = C + "/";
        }
        f345370a = C + "wagamefiles/";
        C99907a UN = ((C102059b) C86312j.m106911c(C102059b.class)).mo141398UN();
        StringBuilder sb = new StringBuilder();
        sb.append("XWalkLib SetFileDownloaderProxy:");
        sb.append(UN == null);
        Log.m105924i("WXFileDownloaderBridge", sb.toString());
        C117556d.f351698b = UN;
        C117556d dVar = new C117556d();
        f345374e = dVar;
        dVar.f351699a = new C115254a();
    }

    private String genAdFileExist(String str, C118987a aVar) {
        String str2;
        boolean z = false;
        if (Util.isNullOrNil(str) || Util.isNullOrNil(aVar.f356415a)) {
            Log.m105925i("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad genAdFileExist error source or videoUrl = %s", aVar.f356415a);
            return null;
        }
        String d = mo175024d(aVar.f356415a);
        if (Util.isNullOrNil(d)) {
            Log.m105925i("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad genAdFileExist error urlFileMd5 = %s or videoUrl = %s", d, aVar.f356415a);
            return null;
        }
        synchronized (f345371b) {
            str2 = f345371b.containsKey(d) ? f345371b.get(d) : null;
        }
        if (!Util.isNullOrNil(str2)) {
            return "downloading";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f345370a + str + "/");
        sb.append(d);
        sb.append(".gad");
        String sb4 = sb.toString();
        Uri n = C116299g2.m163858n(sb4);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        String q = C86013q1.m106456q(C116299g2.m163865u(n));
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (l.mo177810a()) {
            z = l.f348991a.mo119948x(l.f348992b);
        }
        if (!z || (!d.startsWith("unverify") && (q == null || !q.equalsIgnoreCase(d)))) {
            return null;
        }
        aVar.f356417c = 0;
        aVar.f356418d = AppBrandVideoPreLoadReportStruct.C114700a.DownLoaded;
        return sb4;
    }

    private String genAdFilePath(String str, C118987a aVar) {
        String str2;
        if (Util.isNullOrNil(str) || Util.isNullOrNil(aVar.f356415a)) {
            Log.m105925i("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad genAdFilePath error source or videoUrl = %s", aVar.f356415a);
            return null;
        }
        String d = mo175024d(aVar.f356415a);
        if (Util.isNullOrNil(d)) {
            Log.m105925i("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad genAdFilePath error urlFileMd5 = %s or videoUrl = %s", d, aVar.f356415a);
            return null;
        }
        synchronized (f345371b) {
            str2 = f345371b.containsKey(d) ? f345371b.get(d) : null;
        }
        if (!Util.isNullOrNil(str2)) {
            return null;
        }
        aVar.f356416b = Util.currentTicks();
        aVar.f356418d = AppBrandVideoPreLoadReportStruct.C114700a.DownLoading;
        StringBuilder sb = new StringBuilder();
        String str3 = f345370a + str + "/";
        FilePathGenerator.checkMkdir(str3);
        try {
            C86013q1.m106444e(str3 + FilePathGenerator.NO_MEDIA_FILENAME);
        } catch (Exception unused) {
        }
        sb.append(str3);
        sb.append(d);
        sb.append(".gad");
        String sb4 = sb.toString();
        synchronized (f345371b) {
            f345371b.put(d, sb4);
        }
        return sb4;
    }

    /* renamed from: a */
    public String mo175021a(String str) {
        C118987a aVar = new C118987a();
        aVar.f356415a = str;
        aVar.f356419e = null;
        String genAdFileExist = genAdFileExist("gamead", aVar);
        if (Util.isNullOrNil(genAdFileExist) || genAdFileExist.equalsIgnoreCase("downloading")) {
            return null;
        }
        return genAdFileExist;
    }

    /* renamed from: b */
    public int mo175022b(String str, C91508e eVar) {
        int i = -1;
        if (str == null || Util.isNullOrNil(str) || eVar == null) {
            Log.m105924i("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad genPreLoad illegal url or preLoadCallback");
            return -1;
        }
        C118987a aVar = new C118987a();
        aVar.f356415a = str;
        aVar.f356419e = eVar;
        Log.m105925i("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad genPreLoad  videoUrl = %s, preLoadVideoStat = %s", str, str);
        String genAdFileExist = genAdFileExist("gamead", aVar);
        if (Util.isNullOrNil(genAdFileExist)) {
            String genAdFilePath = genAdFilePath("gamead", aVar);
            if (Util.isNullOrNil(genAdFilePath)) {
                return -4;
            }
            C117556d dVar = f345374e;
            String str2 = aVar.f356415a;
            dVar.getClass();
            C99907a aVar2 = C117556d.f351698b;
            if (aVar2 != null) {
                i = aVar2.mo137573a(str2, genAdFilePath, 0, dVar);
            }
            Log.m105925i("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad downloadVideo path=%s, ret=%d", genAdFilePath, Integer.valueOf(i));
            if (i != 0) {
                return -3;
            }
            ((ConcurrentHashMap) f345372c).put(aVar.f356415a, aVar);
        } else if (genAdFileExist.equalsIgnoreCase("downloading")) {
            return -2;
        } else {
            ((ConcurrentHashMap) f345372c).put(aVar.f356415a, aVar);
            mo175023c(aVar.f356415a, true);
            ((C83051d.C83052a) aVar.f356419e).mo115306a(aVar.f356415a, genAdFileExist);
        }
        return 0;
    }

    /* renamed from: c */
    public final void mo175023c(String str, boolean z) {
        if (!Util.isNullOrNil(str)) {
            String d = mo175024d(str);
            synchronized (f345371b) {
                if (f345371b.containsKey(d)) {
                    f345371b.remove(d);
                }
            }
            C118987a aVar = (C118987a) ((ConcurrentHashMap) f345372c).get(str);
            if (aVar != null) {
                if (aVar.f356415a.equalsIgnoreCase(str)) {
                    long j = aVar.f356416b;
                    if (j > 0) {
                        aVar.f356417c = Util.ticksToNow(j);
                    }
                }
                if (z) {
                    aVar.f356418d = AppBrandVideoPreLoadReportStruct.C114700a.DownLoaded;
                } else {
                    aVar.f356418d = AppBrandVideoPreLoadReportStruct.C114700a.DownLoadFail;
                }
            }
        }
    }

    /* renamed from: d */
    public final String mo175024d(String str) {
        try {
            Uri parse = Uri.parse(str);
            if (parse.getHost().equalsIgnoreCase("wxsnsdy.wxs.qq.com")) {
                return parse.getQueryParameter("m");
            }
            return "unverify" + MD5Util.getMD5String(str);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", e, "leonlad:getUrlFileMd5 failed videoUrl:%s", str);
            return null;
        }
    }
}
