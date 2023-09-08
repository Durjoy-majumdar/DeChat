package lb3;

import android.database.Cursor;
import com.tencent.p014mm.plugin.wepkg.utils.C44536d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import f40.C86709a0;
import p749xh.C53331ca;
import zh3.C91753f;

/* renamed from: lb3.f */
public class C46844f extends MAutoStorage<C46843e> {

    /* renamed from: f */
    public static final String[] f126000f = {MAutoStorage.getCreateSQLs(C46843e.f125999X0, "WepkgVersion")};

    /* renamed from: g */
    public static volatile C46844f f126001g = null;

    /* renamed from: d */
    public final boolean f126002d;

    /* renamed from: e */
    public final C91753f f126003e;

    public C46844f(C91753f fVar) {
        super(fVar, C46843e.f125999X0, "WepkgVersion", C53331ca.f149086G);
        this.f126003e = fVar;
        boolean z = fVar != null;
        this.f126002d = z;
        if (!z) {
            Log.m105920e("MicroMsg.Wepkg.WepkgVersionStorage", "storage can not work!!!");
        }
    }

    /* renamed from: Ow */
    public static C46844f m52139Ow() {
        if (!C86709a0.m107522a()) {
            return new C46844f((C91753f) null);
        }
        if (f126001g == null) {
            synchronized (C46844f.class) {
                if (f126001g == null || !f126001g.f126002d) {
                    f126001g = new C46844f(C86709a0.m107535s().f251811i);
                }
            }
        }
        return f126001g;
    }

    /* renamed from: Lo */
    public boolean mo72044Lo(String str) {
        if (!this.f126002d || Util.isNullOrNil(str)) {
            return false;
        }
        C46843e eVar = new C46843e();
        eVar.field_pkgId = str;
        boolean delete = super.delete(eVar, new String[0]);
        Log.m105925i("MicroMsg.Wepkg.WepkgVersionStorage", "deleteRecordByPkgid pkgid:%s, ret:%s", str, Boolean.valueOf(delete));
        return delete;
    }

    /* renamed from: SE */
    public boolean mo72045SE(String str) {
        C46843e qq;
        if (!this.f126002d || (qq = mo72053qq(str)) == null) {
            return false;
        }
        Object obj = C44536d.f120770a;
        qq.field_nextCheckTime = Util.nowSecond() + qq.field_checkIntervalTime;
        boolean update = super.update(qq, new String[0]);
        Log.m105925i("MicroMsg.Wepkg.WepkgVersionStorage", "updateCheckTime pkgid:%s, ret:%s", str, Boolean.valueOf(update));
        return update;
    }

    /* renamed from: TE */
    public boolean mo72046TE(String str, boolean z, long j, long j2) {
        C46843e qq;
        if (!this.f126002d || (qq = mo72053qq(str)) == null) {
            return false;
        }
        qq.field_disableWvCache = z;
        qq.field_clearPkgTime = j;
        qq.field_nextCheckTime = (qq.field_nextCheckTime - qq.field_checkIntervalTime) + j2;
        qq.field_checkIntervalTime = j2;
        qq.field_disable = false;
        boolean update = super.update(qq, new String[0]);
        Log.m105925i("MicroMsg.Wepkg.WepkgVersionStorage", "updateConfigInfo pkgid:%s, disableWvCache:%s, clearPkgTime:%s, checkIntervalTime:%s, ret:%s", str, Boolean.valueOf(z), Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(update));
        return update;
    }

    /* renamed from: Yt */
    public C46843e mo72047Yt(String str) {
        if (this.f126002d && !Util.isNullOrNil(str)) {
            Cursor rawQuery = rawQuery(String.format("select * from %s where %s=? and %s=0", new Object[]{"WepkgVersion", "pkgId", "disable"}), str);
            if (rawQuery.moveToFirst()) {
                C46843e eVar = new C46843e();
                eVar.convertFrom(rawQuery);
                rawQuery.close();
                Log.m105925i("MicroMsg.Wepkg.WepkgVersionStorage", "getRecordByPkgidWithAble exist record in DB, pkgid:%s, version:%s, disableWvCache:%s, clearPkgTime:%s, checkIntervalTime:%s, domain:%s, bigPackageReady:%s, preloadFilesReady:%s, preloadFilesAtomic:%s, disable:%s", eVar.field_pkgId, eVar.field_version, Boolean.valueOf(eVar.field_disableWvCache), Long.valueOf(eVar.field_clearPkgTime), Long.valueOf(eVar.field_checkIntervalTime), eVar.field_domain, Boolean.valueOf(eVar.field_bigPackageReady), Boolean.valueOf(eVar.field_preloadFilesReady), Boolean.valueOf(eVar.field_preloadFilesAtomic), Boolean.valueOf(eVar.field_disable));
                Object obj = C44536d.f120770a;
                eVar.field_accessTime = Util.nowSecond();
                super.update(eVar, new String[0]);
                return eVar;
            }
            Log.m105925i("MicroMsg.Wepkg.WepkgVersionStorage", "getRecordByPkgidWithAble pkgid:%s, no record in DB", str);
            rawQuery.close();
        }
        return null;
    }

    /* renamed from: bD */
    public boolean mo72048bD(String str) {
        if (!this.f126002d || Util.isNullOrNil(str)) {
            return false;
        }
        C46843e qq = mo72053qq(str);
        if (qq == null) {
            return true;
        }
        qq.field_disable = true;
        boolean update = super.update(qq, new String[0]);
        Log.m105925i("MicroMsg.Wepkg.WepkgVersionStorage", "setWepkgDisable pkgid:%s, ret:%s", str, Boolean.valueOf(update));
        return update;
    }

    /* renamed from: bF */
    public boolean mo72049bF(String str) {
        C46843e qq;
        if (!this.f126002d || Util.isNullOrNil(str) || (qq = mo72053qq(str)) == null) {
            return false;
        }
        qq.field_createTime = 0;
        boolean update = super.update(qq, new String[0]);
        Log.m105925i("MicroMsg.Wepkg.WepkgVersionStorage", "updateCreateTimeToZero pkgid:%s, ret:%s", str, Boolean.valueOf(update));
        return update;
    }

    /* renamed from: jo */
    public final boolean mo72050jo(String str) {
        if (!this.f126002d || Util.isNullOrNil(str)) {
            return false;
        }
        Log.m105925i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgVersionRecord addAutoDownloadCount ret:%s", Boolean.valueOf(execSQL("WepkgVersion", String.format("update %s set %s=%s+1 where %s='%s'", new Object[]{"WepkgVersion", "autoDownloadCount", "autoDownloadCount", "pkgId", str}))));
        return true;
    }

    /* renamed from: kD */
    public boolean mo72051kD(String str, String str2, boolean z) {
        C46843e qq;
        if (!this.f126002d || Util.isNullOrNil(str) || (qq = mo72053qq(str)) == null) {
            return false;
        }
        qq.field_bigPackageReady = z;
        qq.field_pkgPath = str2;
        boolean update = super.update(qq, new String[0]);
        Log.m105925i("MicroMsg.Wepkg.WepkgVersionStorage", "updateBigPackageReady pkgid:%s, pkgPath:%s, bigPackageReady:%b, ret:%s", str, str2, Boolean.valueOf(z), Boolean.valueOf(update));
        return update;
    }

    /* renamed from: mI */
    public boolean mo72052mI(String str, boolean z) {
        C46843e qq;
        if (!this.f126002d || Util.isNullOrNil(str) || (qq = mo72053qq(str)) == null) {
            return false;
        }
        qq.field_preloadFilesReady = z;
        boolean update = super.update(qq, new String[0]);
        Log.m105925i("MicroMsg.Wepkg.WepkgVersionStorage", "updatePreloadFilesReady pkgid:%s, preloadFilesReady:%b, ret:%s", str, Boolean.valueOf(z), Boolean.valueOf(update));
        return update;
    }

    /* renamed from: qq */
    public C46843e mo72053qq(String str) {
        if (this.f126002d && !Util.isNullOrNil(str)) {
            Cursor rawQuery = rawQuery(String.format("select * from %s where %s=?", new Object[]{"WepkgVersion", "pkgId"}), str);
            if (rawQuery.moveToFirst()) {
                C46843e eVar = new C46843e();
                eVar.convertFrom(rawQuery);
                rawQuery.close();
                Log.m105925i("MicroMsg.Wepkg.WepkgVersionStorage", "getRecordByPkgid exist record in DB, pkgid:%s, version:%s", eVar.field_pkgId, eVar.field_version);
                return eVar;
            }
            Log.m105925i("MicroMsg.Wepkg.WepkgVersionStorage", "getRecordByPkgid pkgid:%s, no record in DB", str);
            rawQuery.close();
        }
        return null;
    }
}
