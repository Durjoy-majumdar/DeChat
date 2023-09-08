package z41;

import android.database.Cursor;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import java.util.LinkedList;
import java.util.List;
import p237sp.C36773u;
import p749xh.C53352w2;

/* renamed from: z41.b */
public class C53737b extends MAutoStorage<C53352w2> implements C36773u {

    /* renamed from: d */
    public static final String[] f150857d = {MAutoStorage.getCreateSQLs(C53736a.f150856D1, "FileDownloadInfo"), "CREATE INDEX IF NOT EXISTS filedownloadinfo_appId  on FileDownloadInfo  (  appId )", "CREATE INDEX IF NOT EXISTS filedownloadinfo_status  on FileDownloadInfo  (  status )"};

    public C53737b(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C53736a.f150856D1, "FileDownloadInfo", (String[]) null);
    }

    /* renamed from: Lo */
    public final String mo74325Lo(LinkedList<String> linkedList) {
        if (Util.isNullOrNil((List) linkedList)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (int i = 0; i < linkedList.size() - 2; i++) {
            sb.append(FastJsonResponse.QUOTE);
            sb.append(linkedList.get(i));
            sb.append(FastJsonResponse.QUOTE);
            sb.append(",");
        }
        sb.append(FastJsonResponse.QUOTE);
        sb.append(linkedList.get(linkedList.size() - 1));
        sb.append(FastJsonResponse.QUOTE);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: Yt */
    public C53736a mo74326Yt(long j) {
        C53736a aVar = null;
        if (j < 0) {
            Log.m105920e("MicroMsg.FileDownloadInfoStorage", "download id is not avaiable");
            return null;
        }
        Cursor rawQuery = rawQuery("select * from FileDownloadInfo where downloadId=" + j, new String[0]);
        if (rawQuery == null) {
            return null;
        }
        if (rawQuery.moveToFirst()) {
            aVar = new C53736a();
            aVar.convertFrom(rawQuery);
        }
        rawQuery.close();
        return aVar;
    }

    /* renamed from: jo */
    public boolean mo74327jo() {
        return execSQL("FileDownloadInfo", "delete from FileDownloadInfo");
    }

    /* renamed from: qq */
    public C53736a mo74328qq(String str) {
        C53736a aVar = null;
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.FileDownloadInfoStorage", "appId is null");
            return null;
        }
        Cursor rawQuery = rawQuery("select * from FileDownloadInfo where appId=\"" + str + "\" or " + "rawAppId" + "=\"" + str + FastJsonResponse.QUOTE, new String[0]);
        if (rawQuery == null) {
            return null;
        }
        if (rawQuery.moveToFirst()) {
            aVar = new C53736a();
            aVar.convertFrom(rawQuery);
        }
        rawQuery.close();
        return aVar;
    }
}
