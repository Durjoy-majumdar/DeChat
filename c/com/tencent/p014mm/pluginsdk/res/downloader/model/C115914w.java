package com.tencent.p014mm.pluginsdk.res.downloader.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.storage.C72994y1;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import p749xh.C118881x7;
import p823sg.C90193h;
import zh3.C91753f;

/* renamed from: com.tencent.mm.pluginsdk.res.downloader.model.w */
public class C115914w extends MAutoStorage<C115913v> {

    /* renamed from: e */
    public static final String[] f347795e = {MAutoStorage.getCreateSQLs(C115913v.f347794p1, "ResDownloaderRecordTable")};

    /* renamed from: f */
    public static final String f347796f = (C72994y1.f212832a + C90193h.m112878f(String.format(Locale.ENGLISH, "mm%d", new Object[]{Integer.MIN_VALUE}).getBytes()) + "/");

    /* renamed from: g */
    public static final HashMap<Integer, C91753f.C66827b> f347797g;

    /* renamed from: d */
    public final C91753f f347798d;

    /* renamed from: com.tencent.mm.pluginsdk.res.downloader.model.w$a */
    public class C115915a implements C91753f.C66827b {
        /* renamed from: a */
        public String[] mo6410a() {
            return C115914w.f347795e;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.res.downloader.model.w$b */
    public static abstract class C115916b {
    }

    static {
        HashMap<Integer, C91753f.C66827b> hashMap = new HashMap<>();
        f347797g = hashMap;
        hashMap.put(-1009758133, new C115915a());
        for (C115900h S5 : C115912u.m163042a()) {
            S5.mo176411S5();
        }
    }

    public C115914w(C91753f fVar) {
        super(fVar, C115913v.f347794p1, "ResDownloaderRecordTable", (String[]) null);
        new HashMap();
        this.f347798d = fVar;
        for (C115900h S5 : C115912u.m163042a()) {
            S5.mo176411S5();
        }
    }

    /* renamed from: Lo */
    public final C115913v mo176458Lo(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.ResDownloaderStorage", "query with null or nil urlKey, return null");
            return null;
        }
        C115913v vVar = new C115913v();
        vVar.field_urlKey_hashcode = str.hashCode();
        try {
            if (super.get(vVar, "urlKey_hashcode")) {
                return vVar;
            }
            return null;
        } catch (SQLiteDatabaseCorruptException | com.tencent.wcdb.database.SQLiteDatabaseCorruptException e) {
            Object[] objArr = new Object[4];
            boolean z = false;
            objArr[0] = str;
            C91753f fVar = this.f347798d;
            if (fVar == null || !fVar.mo125628r()) {
                z = true;
            }
            objArr[1] = Boolean.valueOf(z);
            objArr[2] = Boolean.valueOf(new File(f347796f + "EnResDown.db").exists());
            objArr[3] = e;
            Log.m105921e("MicroMsg.ResDownloaderStorage", "query with urlKey[%s], db.isClose[%s], dbFile.exists[%b], e=%s", objArr);
            return null;
        }
    }

    /* renamed from: Yt */
    public final boolean mo176459Yt(C115913v vVar) {
        if (Util.isNullOrNil(vVar.field_urlKey)) {
            return false;
        }
        vVar.field_urlKey_hashcode = vVar.field_urlKey.hashCode();
        return super.update(vVar, "urlKey_hashcode");
    }

    /* renamed from: c */
    public final boolean mo176460c(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.ResDownloaderStorage", "delete with null or nil urlKey, return false");
            return false;
        }
        C115913v vVar = new C115913v();
        vVar.field_urlKey_hashcode = str.hashCode();
        return super.delete(vVar, "urlKey_hashcode");
    }

    /* renamed from: jo */
    public final boolean insert(C115913v vVar) {
        if (Util.isNullOrNil(vVar.field_urlKey)) {
            return false;
        }
        vVar.field_urlKey_hashcode = vVar.field_urlKey.hashCode();
        return super.insert(vVar);
    }

    /* renamed from: qq */
    public final List<C118881x7> mo176462qq(String str) {
        Cursor query;
        try {
            query = this.f347798d.query("ResDownloaderRecordTable", (String[]) null, String.format(Locale.ENGLISH, "%s like ?", new Object[]{"urlKey"}), new String[]{str}, (String) null, (String) null, (String) null);
            if (query != null) {
                if (!query.isClosed()) {
                    if (query.moveToFirst()) {
                        LinkedList linkedList = new LinkedList();
                        do {
                            C115913v vVar = new C115913v();
                            vVar.convertFrom(query);
                            linkedList.add(vVar);
                        } while (query.moveToNext());
                        query.close();
                        return linkedList;
                    }
                }
            }
            List<C118881x7> emptyList = Collections.emptyList();
            if (query != null) {
                query.close();
            }
            return emptyList;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.ResDownloaderStorage", "queryForKeyLike with clause(%s), get exception:%s", str, e);
            return Collections.emptyList();
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
