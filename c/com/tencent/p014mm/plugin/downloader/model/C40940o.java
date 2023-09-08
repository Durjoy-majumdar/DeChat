package com.tencent.p014mm.plugin.downloader.model;

import android.database.Cursor;
import android.os.Environment;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.util.FrequentLimiter;
import di3.C86312j;
import e51.C45547h;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p206nj.C88955f;
import p749xh.C66261f3;
import v41.C52742a;
import v41.C52758q;
import z41.C53736a;
import z41.C53737b;

/* renamed from: com.tencent.mm.plugin.downloader.model.o */
public class C40940o {
    /* renamed from: a */
    public static boolean m44348a(long j) {
        long j2 = (long) (((float) j) * 1.3f);
        Log.m105919d("MicroMsg.FileDownloadUtil", "checkHasEnoughSpace, realSize = %d, needSize = %d", Long.valueOf(j), Long.valueOf(j2));
        return C88955f.m111059c(j2);
    }

    /* renamed from: b */
    public static C53736a m44349b(C40939n nVar) {
        C53736a aVar = new C53736a();
        String str = nVar.f110176a;
        aVar.field_downloadUrl = str;
        aVar.field_secondaryUrl = nVar.f110177b;
        aVar.field_fileSize = nVar.f110178c;
        aVar.field_downloadUrlHashCode = str.hashCode();
        aVar.field_fileName = nVar.f110179d;
        aVar.field_fileType = nVar.f110181f;
        aVar.field_md5 = nVar.f110180e;
        aVar.field_appId = nVar.f110182g;
        aVar.field_autoInstall = nVar.f110184i;
        aVar.field_showNotification = nVar.f110185j;
        aVar.field_packageName = nVar.f110183h;
        aVar.field_autoDownload = nVar.f110186k;
        int i = nVar.f110187l;
        aVar.field_scene = i;
        boolean z = nVar.f110189n;
        aVar.field_downloadInWifi = z;
        aVar.field_fromWeApp = nVar.f110190o;
        aVar.field_extInfo = nVar.f110192q;
        aVar.field_isSecondDownload = nVar.f110191p;
        aVar.field_fromDownloadApp = nVar.f110193r;
        aVar.field_reserveInWifi = z;
        aVar.field_downloadType = nVar.f110197v;
        aVar.field_uiarea = nVar.f110196u;
        aVar.field_noticeId = nVar.f110195t;
        aVar.field_ssid = nVar.f110194s;
        aVar.field_startScene = i;
        LinkedList<C52742a> linkedList = nVar.f110198w;
        if (!Util.isNullOrNil((List) linkedList)) {
            C52758q qVar = new C52758q();
            qVar.f147428d = linkedList;
            try {
                aVar.field_sectionMd5Byte = qVar.toByteArray();
            } catch (IOException unused) {
            }
        }
        aVar.field_rawAppId = nVar.f110199x;
        aVar.field_notificationTitle = nVar.f110174A;
        return aVar;
    }

    /* renamed from: c */
    public static boolean m44350c(long j) {
        LinkedList linkedList;
        if (m44348a(j)) {
            return true;
        }
        C53737b f = C40933j.m44317f();
        if (f == null) {
            linkedList = null;
        } else {
            String format = String.format("select * from %s where %s<%d order by %s desc", new Object[]{"FileDownloadInfo", C66261f3.COL_UPDATETIME, Long.valueOf(System.currentTimeMillis() - FrequentLimiter.WEEK_MILLS), C66261f3.COL_UPDATETIME});
            Log.m105924i("MicroMsg.FileDownloadInfoStorage", "getUpdateTimeBiggerThanTimeInterval, sql = " + format);
            Cursor rawQuery = f.rawQuery(format, new String[0]);
            LinkedList linkedList2 = new LinkedList();
            if (rawQuery != null) {
                while (rawQuery.moveToNext()) {
                    C53736a aVar = new C53736a();
                    aVar.convertFrom(rawQuery);
                    linkedList2.add(aVar);
                }
                rawQuery.close();
            }
            linkedList = linkedList2;
        }
        if (Util.isNullOrNil((List) linkedList)) {
            return false;
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            C53736a aVar2 = (C53736a) it.next();
            int i = aVar2.field_status;
            if (!(i == 3 || i == 6 || i == 1)) {
                Log.m105925i("MicroMsg.FileDownloadUtil", "delete appId : %s, path : %s", aVar2.field_appId, aVar2.field_filePath);
                C40933j.m44319h(aVar2.field_downloadId);
                C86013q1.m106447h(aVar2.field_filePath);
                ((C45547h) C86312j.m106911c(C45547h.class)).mo70793e1(aVar2.field_appId);
                long freeSpace = Environment.getExternalStorageDirectory().getFreeSpace();
                Log.m105919d("MicroMsg.FileDownloadUtil", "isSDCardHaveEnoughSpace, freeSpace = %d, needSize = %d", Long.valueOf(freeSpace), Long.valueOf(j));
                if (freeSpace >= j) {
                    return true;
                }
            }
        }
        return false;
    }
}
