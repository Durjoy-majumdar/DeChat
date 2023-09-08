package com.tencent.p014mm.plugin.downloader.model;

import android.database.Cursor;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.plugin.downloader.api.C29841c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import f40.C86718e;
import java.util.LinkedList;
import p749xh.C53352w2;
import z41.C53736a;
import z41.C53737b;

/* renamed from: com.tencent.mm.plugin.downloader.model.j */
public class C40933j {
    /* renamed from: a */
    public static long m44312a(C53736a aVar) {
        C53737b f;
        if (aVar == null || (f = m44317f()) == null) {
            return -1;
        }
        m44320i(aVar.field_appId);
        m44321j(aVar.field_downloadUrl);
        m44320i(aVar.field_rawAppId);
        aVar.field_updateTime = System.currentTimeMillis();
        boolean insert = f.insert(aVar);
        Log.m105924i("MicroMsg.FileDownloadInfoDBHelper", "insert downloadinfo: " + aVar.field_downloadId + ", ret=" + insert);
        return aVar.field_downloadId;
    }

    /* renamed from: b */
    public static LinkedList<C53736a> m44313b() {
        C53737b f = m44317f();
        if (f == null) {
            return null;
        }
        Log.m105924i("MicroMsg.FileDownloadInfoStorage", "getAllTasks, sql = select * from FileDownloadInfo");
        Cursor rawQuery = f.rawQuery("select * from FileDownloadInfo", new String[0]);
        LinkedList<C53736a> linkedList = new LinkedList<>();
        if (rawQuery != null) {
            while (rawQuery.moveToNext()) {
                C53736a aVar = new C53736a();
                aVar.convertFrom(rawQuery);
                linkedList.add(aVar);
            }
            rawQuery.close();
        }
        return linkedList;
    }

    /* renamed from: c */
    public static C53736a m44314c(long j) {
        C53737b f = m44317f();
        if (f == null) {
            return null;
        }
        return f.mo74326Yt(j);
    }

    /* renamed from: d */
    public static C53736a m44315d(String str) {
        C53737b f = m44317f();
        if (f == null) {
            return null;
        }
        return f.mo74328qq(str);
    }

    /* renamed from: e */
    public static C53736a m44316e(String str) {
        C53737b f = m44317f();
        C53736a aVar = null;
        if (f == null) {
            return null;
        }
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.FileDownloadInfoStorage", "Null or nil url");
        } else {
            Cursor rawQuery = f.rawQuery("select * from FileDownloadInfo where downloadUrl=?", str);
            if (rawQuery != null) {
                if (rawQuery.moveToFirst()) {
                    aVar = new C53736a();
                    aVar.convertFrom(rawQuery);
                }
                rawQuery.close();
            }
        }
        return aVar;
    }

    /* renamed from: f */
    public static C53737b m44317f() {
        Class cls = C29841c.class;
        if (C86709a0.m107523b().mo121114l()) {
            C86709a0.m107523b();
            if (!C86718e.m107551r()) {
                if (C86312j.m106911c(cls) != null) {
                    return (C53737b) ((C29841c) C86312j.m106911c(cls)).mo56945gI();
                }
                Log.m105920e("MicroMsg.FileDownloadInfoDBHelper", "service not ready");
                return null;
            }
        }
        Log.m105920e("MicroMsg.FileDownloadInfoDBHelper", "no user login");
        return null;
    }

    /* renamed from: g */
    public static boolean m44318g(String str) {
        C53737b f = m44317f();
        if (f == null) {
            return false;
        }
        Cursor rawQuery = f.rawQuery(String.format("select count(*) from %s where %s=\"%s\"", new Object[]{"FileDownloadInfo", "downloadUrl", str}), new String[0]);
        if (rawQuery == null || !rawQuery.moveToFirst()) {
            return false;
        }
        int i = rawQuery.getInt(0);
        rawQuery.close();
        return i > 1;
    }

    /* renamed from: h */
    public static boolean m44319h(long j) {
        Log.m105925i("MicroMsg.FileDownloadInfoDBHelper", "removeDownloadInfo id: [%s]", Long.valueOf(j));
        C53737b f = m44317f();
        if (f == null) {
            return false;
        }
        C53736a aVar = new C53736a();
        aVar.field_downloadId = j;
        return f.delete(aVar, new String[0]);
    }

    /* renamed from: i */
    public static boolean m44320i(String str) {
        Log.m105925i("MicroMsg.FileDownloadInfoDBHelper", "removeDownloadInfoByAppIdIfExist id: [%s]", str);
        C53737b f = m44317f();
        if (f == null) {
            return false;
        }
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.FileDownloadInfoStorage", "deledonloadinfo failed, appId is null");
            return false;
        }
        return f.execSQL("FileDownloadInfo", "delete from FileDownloadInfo where appId=\"" + str + "\" or " + "rawAppId" + "=\"" + str + FastJsonResponse.QUOTE);
    }

    /* renamed from: j */
    public static boolean m44321j(String str) {
        boolean z = true;
        Log.m105925i("MicroMsg.FileDownloadInfoDBHelper", "removeDownloadInfoByURLIfExist url: [%s]", str);
        C53737b f = m44317f();
        if (f == null) {
            return false;
        }
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.FileDownloadInfoStorage", "deledonloadinfo failed, url is null");
            return false;
        }
        if (f.delete("FileDownloadInfo", "downloadUrl=?", new String[]{str}) <= 0) {
            z = false;
        }
        return z;
    }

    /* renamed from: k */
    public static long m44322k(C53352w2 w2Var) {
        C53737b f;
        if (w2Var == null || (f = m44317f()) == null) {
            return -1;
        }
        w2Var.field_updateTime = System.currentTimeMillis();
        Log.m105925i("MicroMsg.FileDownloadInfoDBHelper", "Update Downloadinfo, ID: %d, ret: %b, Status: %d", Long.valueOf(w2Var.field_downloadId), Boolean.valueOf(f.update(w2Var, new String[0])), Integer.valueOf(w2Var.field_status));
        return w2Var.field_downloadId;
    }

    /* renamed from: l */
    public static boolean m44323l(String str, int i) {
        C53737b f = m44317f();
        if (f == null) {
            return false;
        }
        String format = String.format("update %s set %s=%d where %s=\"%s\"", new Object[]{"FileDownloadInfo", "status", Integer.valueOf(i), "downloadUrl", str});
        boolean execSQL = f.execSQL("FileDownloadInfo", format);
        Log.m105925i("MicroMsg.FileDownloadInfoStorage", "updateDownloadState, sql : %s\ndownloadUrl : %s, status : %d, ret : %s", format, str, Integer.valueOf(i), Boolean.valueOf(execSQL));
        return execSQL;
    }
}
