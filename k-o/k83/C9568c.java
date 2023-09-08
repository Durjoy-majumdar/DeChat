package k83;

import android.database.Cursor;
import android.net.Uri;
import com.tencent.p014mm.plugin.game.commlib.util.C41872f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;

/* renamed from: k83.c */
public class C9568c extends MAutoStorage<C9565a> {

    /* renamed from: d */
    public static final String[] f29806d = {MAutoStorage.getCreateSQLs(C9565a.f29793B, "WebViewData")};

    public C9568c(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C9565a.f29793B, "WebViewData", (String[]) null);
    }

    /* renamed from: bD */
    public static String m9252bD() {
        return C41872f.m45394d() + "datastore/";
    }

    /* renamed from: Lo */
    public void mo10248Lo(String str, JSONArray jSONArray) {
        if (!Util.isNullOrNil(str) && jSONArray != null && jSONArray.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(mo10251Yt(str, jSONArray.optString(i)));
            }
            Iterator it = arrayList.iterator();
            long j = 0;
            long j2 = 0;
            while (it.hasNext()) {
                C9565a aVar = new C9565a();
                aVar.field_appIdKey = (String) it.next();
                super.get(aVar, new String[0]);
                if (!Util.isNullOrNil(aVar.field_localFile)) {
                    Uri n = C116299g2.m163858n(m9252bD() + aVar.field_localFile);
                    String path = n.getPath();
                    if (path != null) {
                        String k = C116299g2.m163855k(path, false, false);
                        if (!n.getPath().equals(k)) {
                            n = n.buildUpon().path(k).build();
                        }
                    }
                    C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                    Log.m105925i("MicroMsg.WebViewDataStorage", "clearData(), delete data file:%s, ret:%b", aVar.field_localFile, Boolean.valueOf(l.mo177810a() && l.f348991a.mo119933c(l.f348992b)));
                }
                Log.m105925i("MicroMsg.WebViewDataStorage", "clearData(), delete data appIdKey:%s, ret:%b", aVar.field_appIdKey, Boolean.valueOf(super.delete(aVar, new String[0])));
                j2 += aVar.field_size;
            }
            long Ow = mo10249Ow(str) - j2;
            Log.m105925i("MicroMsg.WebViewDataStorage", "clearData(), currSize:%d", Long.valueOf(Ow));
            if (Ow >= 0) {
                j = Ow;
            }
            mo10253kD(str, j);
        }
    }

    /* renamed from: Ow */
    public long mo10249Ow(String str) {
        String format = String.format("select %s from %s where %s=\"%s\"", new Object[]{"size", "WebViewData", "appIdKey", str + "_" + "###@@@@TOTAL@@@###SIZE####"});
        StringBuilder sb = new StringBuilder();
        sb.append("getAppIdSize: ");
        sb.append(format);
        Log.m105918d("MicroMsg.WebViewDataStorage", sb.toString());
        Cursor rawQuery = rawQuery(format, new String[0]);
        long j = 0;
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                j = rawQuery.getLong(0);
            }
            rawQuery.close();
        }
        Log.m105918d("MicroMsg.WebViewDataStorage", "getAppIdSize: " + j);
        return j;
    }

    /* renamed from: SE */
    public void mo10250SE(String str, String str2, String str3, String str4, long j, String str5) {
        C9565a aVar = new C9565a();
        aVar.field_appId = str;
        aVar.field_appIdKey = mo10251Yt(str, str2);
        aVar.field_value = str3;
        aVar.field_weight = str4;
        aVar.field_expireTime = j + (System.currentTimeMillis() / 1000);
        aVar.field_size = (long) (str2.getBytes().length + str3.getBytes().length);
        aVar.field_timeStamp = System.currentTimeMillis() / 1000;
        aVar.field_localFile = str5;
        boolean replace = replace(aVar);
        Log.m105918d("MicroMsg.WebViewDataStorage", "setData: " + replace);
    }

    /* renamed from: Yt */
    public final String mo10251Yt(String str, String str2) {
        return str + "_" + str2;
    }

    /* renamed from: jo */
    public void mo10252jo(String str) {
        Cursor rawQuery = rawQuery(String.format("select * from %s where %s=\"%s\"", new Object[]{"WebViewData", "appId", str}), new String[0]);
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                do {
                    C9565a aVar = new C9565a();
                    aVar.convertFrom(rawQuery);
                    if (!Util.isNullOrNil(aVar.field_localFile)) {
                        Uri n = C116299g2.m163858n(m9252bD() + aVar.field_localFile);
                        String path = n.getPath();
                        if (path != null) {
                            String k = C116299g2.m163855k(path, false, false);
                            if (!n.getPath().equals(k)) {
                                n = n.buildUpon().path(k).build();
                            }
                        }
                        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                        Log.m105925i("MicroMsg.WebViewDataStorage", "clearAllData(), delete data file:%s, ret:%b", aVar.field_localFile, Boolean.valueOf(l.mo177810a() && l.f348991a.mo119933c(l.f348992b)));
                    }
                    Log.m105925i("MicroMsg.WebViewDataStorage", "clearAllData(), delete data appIdKey:%s, ret:%b", aVar.field_appIdKey, Boolean.valueOf(super.delete(aVar, new String[0])));
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
        }
    }

    /* renamed from: kD */
    public void mo10253kD(String str, long j) {
        C9565a aVar = new C9565a();
        aVar.field_appId = str;
        aVar.field_appIdKey = str + "_" + "###@@@@TOTAL@@@###SIZE####";
        aVar.field_expireTime = MAlarmHandler.NEXT_FIRE_INTERVAL;
        aVar.field_size = j;
        Log.m105919d("MicroMsg.WebViewDataStorage", "setAppIdSize: %b, size: %d", Boolean.valueOf(replace(aVar)), Long.valueOf(j));
    }

    /* renamed from: qq */
    public long mo10254qq(String str, long j) {
        long j2;
        String format = String.format("select * from %s where appId='%s' order by weight,timeStamp", new Object[]{"WebViewData", str});
        Log.m105918d("MicroMsg.WebViewDataStorage", "deleteSize querySql: " + format);
        Cursor rawQuery = rawQuery(format, new String[0]);
        if (rawQuery == null) {
            return 0;
        }
        LinkedList<String> linkedList = new LinkedList<>();
        if (rawQuery.moveToFirst()) {
            j2 = j;
            do {
                String string = rawQuery.getString(1);
                long j3 = rawQuery.getLong(6);
                linkedList.add(string);
                j2 -= j3;
                if (!rawQuery.moveToNext()) {
                    break;
                }
            } while (j2 <= 0);
        } else {
            j2 = j;
        }
        rawQuery.close();
        for (String str2 : linkedList) {
            C9565a aVar = new C9565a();
            aVar.field_appIdKey = str2;
            super.get(aVar, new String[0]);
            if (!Util.isNullOrNil(aVar.field_localFile)) {
                Uri n = C116299g2.m163858n(m9252bD() + aVar.field_localFile);
                String path = n.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                Log.m105925i("MicroMsg.WebViewDataStorage", "deleteSize(), delete data file:%s, size:%d, ret:%b", aVar.field_localFile, Long.valueOf(aVar.field_size), Boolean.valueOf(l.mo177810a() && l.f348991a.mo119933c(l.f348992b)));
            }
            Log.m105925i("MicroMsg.WebViewDataStorage", "deleteSize(), delete data appIdKey:%s, size:%d, ret:%b", aVar.field_appIdKey, Long.valueOf(aVar.field_size), Boolean.valueOf(super.delete(aVar, new String[0])));
        }
        return j - j2;
    }
}
