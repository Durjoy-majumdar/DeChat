package xb1;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import f40.C86709a0;
import pb1.C100730p0;
import pb1.C35442w;

/* renamed from: xb1.b */
public class C38479b extends MAutoStorage<C35442w> implements C100730p0 {

    /* renamed from: d */
    public ISQLiteDatabase f101472d;

    public C38479b(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C35442w.f94844p, "FavConfigInfo", (String[]) null);
        this.f101472d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public byte[] mo61693Lo() {
        C35442w jo = mo61694jo(8216);
        if (8216 != jo.field_configId) {
            Log.m105928w("MicroMsg.FavConfigStorage", "get sync key from fav db fail, try to load from mmdb");
            C86709a0.m107528h();
            if (((Boolean) C86709a0.m107535s().mo121142i().mo119684e(8224, Boolean.FALSE)).booleanValue()) {
                Log.m105928w("MicroMsg.FavConfigStorage", "get sync from mmdb fail, has trans");
            } else {
                C86709a0.m107528h();
                String nullAsNil = Util.nullAsNil((String) C86709a0.m107535s().mo121142i().mo119684e(8216, ""));
                Log.m105925i("MicroMsg.FavConfigStorage", "get sync key(%s) from mmdb, do update fav sync key", nullAsNil);
                byte[] decodeHexString = Util.decodeHexString(nullAsNil);
                mo61695qq(decodeHexString);
                Log.m105928w("MicroMsg.FavConfigStorage", "set fav sync key has trans");
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119676J(8224, Boolean.TRUE);
                return decodeHexString;
            }
        }
        Log.m105925i("MicroMsg.FavConfigStorage", "get sync key, id %d, value %s", Integer.valueOf(jo.field_configId), jo.field_value);
        return Util.decodeHexString(jo.field_value);
    }

    /* renamed from: jo */
    public final C35442w mo61694jo(int i) {
        C35442w wVar = new C35442w();
        String str = "select * from FavConfigInfo where configId = " + i;
        Log.m105919d("MicroMsg.FavConfigStorage", "get fav config sql %s", str);
        Cursor rawQuery = this.f101472d.rawQuery(str, (String[]) null, 2);
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                wVar.convertFrom(rawQuery);
            }
            rawQuery.close();
        }
        return wVar;
    }

    /* renamed from: qq */
    public void mo61695qq(byte[] bArr) {
        C35442w jo = mo61694jo(8216);
        if (8216 == jo.field_configId) {
            jo.field_value = Util.encodeHexString(bArr);
            Log.m105925i("MicroMsg.FavConfigStorage", "update sync key: %s, result %B", jo.field_value, Boolean.valueOf(update(jo, new String[0])));
            return;
        }
        jo.field_configId = 8216;
        jo.field_value = Util.encodeHexString(bArr);
        Log.m105925i("MicroMsg.FavConfigStorage", "insert sync key: %s, result %B", jo.field_value, Boolean.valueOf(insert(jo)));
    }
}
