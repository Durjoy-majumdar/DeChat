package lb3;

import android.database.Cursor;
import com.tencent.p014mm.plugin.wepkg.model.WepkgPreloadFile;
import com.tencent.p014mm.plugin.wepkg.utils.C44536d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.List;
import p749xh.C53329ba;
import zh3.C91753f;

/* renamed from: lb3.d */
public class C46842d extends MAutoStorage<C46841c> {

    /* renamed from: f */
    public static final String[] f125995f = {MAutoStorage.getCreateSQLs(C46841c.f125994N, "WepkgPreloadFiles")};

    /* renamed from: g */
    public static volatile C46842d f125996g = null;

    /* renamed from: d */
    public final boolean f125997d;

    /* renamed from: e */
    public final C91753f f125998e;

    public C46842d(C91753f fVar) {
        super(fVar, C46841c.f125994N, "WepkgPreloadFiles", C53329ba.f149011v);
        this.f125998e = fVar;
        boolean z = fVar != null;
        this.f125997d = z;
        if (!z) {
            Log.m105920e("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "storage can not work!!!");
        }
    }

    /* renamed from: Yt */
    public static C46842d m52134Yt() {
        if (!C86709a0.m107522a()) {
            return new C46842d((C91753f) null);
        }
        if (f125996g == null) {
            synchronized (C46842d.class) {
                if (f125996g == null || !f125996g.f125997d) {
                    f125996g = new C46842d(C86709a0.m107535s().f251811i);
                }
            }
        }
        return f125996g;
    }

    /* renamed from: Lo */
    public List<WepkgPreloadFile> mo72040Lo(String str) {
        if (!this.f125997d && Util.isNullOrNil(str)) {
            return null;
        }
        String format = String.format("select * from %s where %s=? and %s=0", new Object[]{"WepkgPreloadFiles", "pkgId", "completeDownload"});
        Cursor rawQuery = rawQuery(format, str);
        Log.m105925i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "getNeedDownloadPreLoadFileList queryStr:%s", format);
        if (rawQuery == null) {
            Log.m105924i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "cursor is null");
            return null;
        } else if (rawQuery.moveToFirst()) {
            ArrayList arrayList = new ArrayList();
            do {
                WepkgPreloadFile wepkgPreloadFile = new WepkgPreloadFile();
                C46841c cVar = new C46841c();
                cVar.convertFrom(rawQuery);
                wepkgPreloadFile.mo69263b(cVar);
                arrayList.add(wepkgPreloadFile);
            } while (rawQuery.moveToNext());
            rawQuery.close();
            Log.m105925i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "record list size:%s", Integer.valueOf(arrayList.size()));
            return arrayList;
        } else {
            rawQuery.close();
            Log.m105924i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "no record");
            return null;
        }
    }

    /* renamed from: Ow */
    public boolean mo72041Ow(String str, String str2, String str3, boolean z) {
        C46841c qq;
        if (!this.f125997d || Util.isNullOrNil(str) || Util.isNullOrNil(str2) || (qq = mo72043qq(str, str2)) == null) {
            return false;
        }
        qq.field_completeDownload = z;
        qq.field_filePath = str3;
        boolean update = super.update(qq, new String[0]);
        Log.m105925i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "updateDownloadCompleteState pkgid:%s, rid:%s, completeDownload:%s, filePath:%s, ret:%s", str, str2, Boolean.valueOf(z), str3, Boolean.valueOf(update));
        return update;
    }

    /* renamed from: jo */
    public boolean mo72042jo(String str) {
        if (!this.f125997d || Util.isNullOrNil(str)) {
            return false;
        }
        C46841c cVar = new C46841c();
        cVar.field_pkgId = str;
        boolean delete = super.delete(cVar, "pkgId");
        Log.m105925i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "deleteRecordByPkgid pkgid:%s, ret:%s", str, Boolean.valueOf(delete));
        return delete;
    }

    /* renamed from: qq */
    public C46841c mo72043qq(String str, String str2) {
        if (this.f125997d && !Util.isNullOrNil(str) && !Util.isNullOrNil(str2)) {
            String c = C44536d.m48917c(str, str2);
            Cursor rawQuery = rawQuery(String.format("select * from %s where %s=?", new Object[]{"WepkgPreloadFiles", "key"}), c);
            if (rawQuery.moveToFirst()) {
                C46841c cVar = new C46841c();
                cVar.convertFrom(rawQuery);
                rawQuery.close();
                Log.m105925i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "getRecordByRid exist record in DB, pkgid:%s, rid:%s, version:%s", cVar.field_pkgId, cVar.field_rid, cVar.field_version);
                return cVar;
            }
            Log.m105925i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "getRecordByRid pkgid:%s, rid:%s, no record in DB", str, str2);
            rawQuery.close();
        }
        return null;
    }
}
