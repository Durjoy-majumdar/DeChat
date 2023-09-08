package os2;

import android.database.Cursor;
import androidx.lifecycle.C54219z;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsCoverReportStruct;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import ct2.C97367b;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import jr2.C76438m;
import p166hy.C98564l0;
import p239sv.C77792p;
import p823sg.C101614i;
import re0.C36313j;
import z04.C112551y;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: os2.z */
public final class C100423z extends MAutoStorage<C100422y> implements C76438m, C98564l0 {

    /* renamed from: g */
    public static final C100424a f294196g = new C100424a((C8480h) null);

    /* renamed from: h */
    public static final String[] f294197h = {MAutoStorage.getCreateSQLs(C100422y.f294193Q, "SnsCover")};

    /* renamed from: d */
    public final ISQLiteDatabase f294198d;

    /* renamed from: e */
    public final C101614i<String, C100422y> f294199e = new C101614i<>(5);

    /* renamed from: f */
    public final C97367b f294200f = new C97367b();

    /* renamed from: os2.z$a */
    public static final class C100424a {
        public C100424a(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo139913a(String str) {
            SnsMethodCalculate.markStartTimeMs("getUserCoverPath", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage$Companion");
            C87412m.m108594g(str, "username");
            String e = C94938q1.m120518e(C94866e1.m120262YO(), str);
            C87412m.m108593f(e, "getMediaFilePath(SnsCore…etAccSnsPath(), username)");
            String str2 = e + str + "bg_";
            SnsMethodCalculate.markEndTimeMs("getUserCoverPath", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage$Companion");
            return str2;
        }
    }

    /* renamed from: os2.z$b */
    public static final class C100425b implements Runnable {

        /* renamed from: d */
        public final String[] f294201d;

        public C100425b(String... strArr) {
            C87412m.m108594g(strArr, "paths");
            this.f294201d = strArr;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage$SnsCoverClearTask");
            for (String str : this.f294201d) {
                C100424a aVar = C100423z.f294196g;
                SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage$Companion");
                SnsMethodCalculate.markStartTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
                SnsMethodCalculate.markEndTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
                SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage$Companion");
                Log.m105924i("MicroMsg.SnsCoverStorage", "delete path:" + str + " size:" + C86013q1.m106451l(str));
                C86013q1.m106447h(str);
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage$SnsCoverClearTask");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100423z(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C100422y.f294193Q, "SnsCover", (String[]) null);
        C87412m.m108594g(iSQLiteDatabase, "db");
        this.f294198d = iSQLiteDatabase;
        Log.m105924i("MicroMsg.SnsCoverStorage", "createSnsCoverStorage " + iSQLiteDatabase + "  " + Thread.currentThread().getId());
    }

    /* renamed from: D5 */
    public void mo137939D5(String str) {
        SnsMethodCalculate.markStartTimeMs("blockCover", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        C87412m.m108594g(str, "userName");
        Log.m105924i("MicroMsg.SnsCoverStorage", "blockCover:" + str);
        C100422y Yt = C94866e1.Ux0().mo139909Yt(str);
        Yt.field_type = 5;
        SnsMethodCalculate.markStartTimeMs("reportCoverBlock", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
        SnsCoverReportStruct snsCoverReportStruct = new SnsCoverReportStruct();
        snsCoverReportStruct.f265989f = snsCoverReportStruct.mo86045b("UserName", Yt.getUserName(), true);
        snsCoverReportStruct.f265987d = 5;
        String yVar = Yt.toString();
        C87412m.m108593f(yVar, "snsCover.toString()");
        snsCoverReportStruct.mo126629s(C112551y.m153814n(yVar, ",", ";", false));
        snsCoverReportStruct.mo86054n();
        SnsMethodCalculate.markEndTimeMs("reportCoverBlock", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
        SnsMethodCalculate.markStartTimeMs("updateCoverInfo$default", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        mo139910bD(Yt, true);
        SnsMethodCalculate.markEndTimeMs("updateCoverInfo$default", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        SnsMethodCalculate.markEndTimeMs("blockCover", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
    }

    /* renamed from: E0 */
    public boolean mo137940E0(String str, long j, FinderObject finderObject) {
        SnsMethodCalculate.markStartTimeMs("updateFinderInfoFromDetail", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        C87412m.m108594g(str, "userName");
        Log.m105924i("MicroMsg.SnsCoverStorage", "updateFinderInfoFromDetail :" + str);
        if ((finderObject != null ? finderObject.objectDesc : null) == null) {
            SnsMethodCalculate.markEndTimeMs("updateFinderInfoFromDetail", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            return false;
        }
        C100422y Yt = mo139909Yt(str);
        Long u = Yt.mo139906u();
        if (u != null && u.longValue() == j && Yt.field_success) {
            try {
                Yt.field_finderObject = finderObject.toByteArray();
                Yt.field_finderCheckTime = System.currentTimeMillis();
            } catch (Exception unused) {
            }
            boolean bD = mo139910bD(Yt, false);
            SnsMethodCalculate.markEndTimeMs("updateFinderInfoFromDetail", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            return bD;
        }
        SnsMethodCalculate.markEndTimeMs("updateFinderInfoFromDetail", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        return false;
    }

    /* renamed from: Lo */
    public final void mo139907Lo(C100422y yVar) {
        SnsMethodCalculate.markStartTimeMs("clearDBData", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        yVar.field_imageBgUrl = "";
        yVar.field_thumbUrl = "";
        yVar.field_videoBgUrl = "";
        C119179t tVar = C119157j.f356862d;
        C119157j jVar = (C119157j) tVar;
        jVar.mo183870a(new C100425b(yVar.field_localThumb, yVar.field_localImage, yVar.field_localVideo));
        yVar.field_localVideo = "";
        yVar.field_localImage = "";
        yVar.field_localThumb = "";
        mo139910bD(yVar, false);
        SnsMethodCalculate.markEndTimeMs("clearDBData", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
    }

    /* renamed from: Ow */
    public final boolean mo139908Ow(String str, String str2, String str3) {
        SnsMethodCalculate.markStartTimeMs("updateCoverImageInfoLocal", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        C87412m.m108594g(str, "userName");
        C87412m.m108594g(str2, "thumb");
        C87412m.m108594g(str3, "cover");
        Log.m105924i("MicroMsg.SnsCoverStorage", "updateCoverImageInfoLocal :" + str);
        C100422y Yt = mo139909Yt(str);
        Yt.field_userName = str;
        Yt.field_type = 1;
        mo139911jo(Yt);
        if (!C87412m.m108589b(str2, Yt.field_localThumb)) {
            C119179t tVar = C119157j.f356862d;
            C119157j jVar = (C119157j) tVar;
            jVar.mo183870a(new C100425b(Yt.field_localThumb));
            Yt.field_localThumb = str2;
        }
        if (!C87412m.m108589b(str3, Yt.field_localImage)) {
            C119179t tVar2 = C119157j.f356862d;
            C119157j jVar2 = (C119157j) tVar2;
            jVar2.mo183870a(new C100425b(Yt.field_localImage));
            Yt.field_localImage = str3;
        }
        boolean bD = mo139910bD(Yt, false);
        SnsMethodCalculate.markEndTimeMs("updateCoverImageInfoLocal", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        return bD;
    }

    /* renamed from: Yt */
    public final C100422y mo139909Yt(String str) {
        String str2 = str;
        SnsMethodCalculate.markStartTimeMs("getCoverInfo", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        C87412m.m108594g(str2, "userName");
        if (this.f294199e.get(str2) != null) {
            Object obj = this.f294199e.get(str2);
            C87412m.m108593f(obj, "coverLRUMap.getAndUptime(userName)");
            C100422y yVar = (C100422y) obj;
            SnsMethodCalculate.markEndTimeMs("getCoverInfo", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            return yVar;
        }
        StringBuilder sb = new StringBuilder();
        SnsMethodCalculate.markStartTimeMs("getSelectBegin", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        SnsMethodCalculate.markEndTimeMs("getSelectBegin", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        sb.append("select *, rowid from SnsCover");
        sb.append(" where userName=\"");
        sb.append(Util.escapeSqlValue(str));
        sb.append('\"');
        Cursor rawQuery = this.f294198d.rawQuery(sb.toString(), (String[]) null, 2);
        C100422y yVar2 = new C100422y();
        if (rawQuery.moveToFirst()) {
            yVar2.convertFrom(rawQuery);
            this.f294199e.put(str2, yVar2);
        } else {
            boolean z = true;
            if (C72996z1.m85843n5(str)) {
                C100398c0 Yt = C94866e1.Xx0().mo139782Yt(str2);
                if ((((C36313j) ((C77792p) C86312j.m106911c(C77792p.class)).T20()).mo60611Lo(str2) & 2) == 0) {
                    Log.m105920e("MicroMsg.SnsCoverStorage", "openIM bg flag false, do not show bg");
                    yVar2.field_type = 5;
                } else {
                    yVar2.field_type = 6;
                }
                yVar2.field_userName = str2;
                SnsMethodCalculate.markStartTimeMs("hasLike", "com.tencent.mm.plugin.sns.storage.SnsExt");
                if ((Yt.field_local_flag & 2) <= 0) {
                    z = false;
                }
                SnsMethodCalculate.markEndTimeMs("hasLike", "com.tencent.mm.plugin.sns.storage.SnsExt");
                yVar2.field_isLike = z;
                yVar2.field_snsBgId = Yt.field_snsBgId;
                yVar2.f294195P = Yt.field_bgId;
            } else {
                String a = f294196g.mo139913a(str2);
                C100398c0 Yt2 = C94866e1.Xx0().mo139782Yt(str2);
                yVar2.field_userName = str2;
                String str3 = "MicroMsg.SnsCoverStorage";
                long j = Yt2.field_snsBgId;
                yVar2.field_snsBgId = j;
                yVar2.field_type = j == 0 ? 0 : 1;
                yVar2.field_success = false;
                yVar2.field_thumbUrl = Yt2.field_bgUrl;
                SnsMethodCalculate.markStartTimeMs("hasLike", "com.tencent.mm.plugin.sns.storage.SnsExt");
                if ((Yt2.field_local_flag & 2) <= 0) {
                    z = false;
                }
                SnsMethodCalculate.markEndTimeMs("hasLike", "com.tencent.mm.plugin.sns.storage.SnsExt");
                yVar2.field_isLike = z;
                yVar2.f294194N = "data from extra db,maybe not friend";
                if (C86013q1.m106450k(a)) {
                    yVar2.field_localThumb = a;
                }
                Log.m105924i(str3, "snscover not value,load from ext info:" + Yt2.field_snsBgId);
                this.f294200f.mo136642e3(Yt2.field_snsBgId);
            }
        }
        rawQuery.close();
        SnsMethodCalculate.markEndTimeMs("getCoverInfo", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        return yVar2;
    }

    /* renamed from: bD */
    public final boolean mo139910bD(C100422y yVar, boolean z) {
        SnsMethodCalculate.markStartTimeMs("updateCoverInfo", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        Log.m105924i("MicroMsg.SnsCoverStorage", "updateCoverInfo:" + yVar + " post:" + z);
        if ((yVar != null ? yVar.field_userName : null) == null || C87412m.m108589b(yVar.field_userName, "")) {
            SnsMethodCalculate.markEndTimeMs("updateCoverInfo", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            return false;
        }
        boolean replace = super.replace(yVar);
        if (replace) {
            this.f294199e.put(yVar.field_userName, yVar);
        }
        if (z) {
            C97367b bVar = this.f294200f;
            bVar.getClass();
            SnsMethodCalculate.markStartTimeMs("getUserCover", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
            C54219z<C100422y> zVar = bVar.f285849e;
            SnsMethodCalculate.markEndTimeMs("getUserCover", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
            zVar.postValue(yVar);
        }
        SnsMethodCalculate.markEndTimeMs("updateCoverInfo", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        return replace;
    }

    /* renamed from: jo */
    public final void mo139911jo(C100422y yVar) {
        SnsMethodCalculate.markStartTimeMs("clearCoverResource", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        Log.m105924i("MicroMsg.SnsCoverStorage", "clearCoverResource");
        yVar.field_snsBgId = -1;
        yVar.field_imageBgUrl = "";
        yVar.field_thumbUrl = "";
        yVar.field_videoBgUrl = "";
        yVar.field_finderObject = null;
        yVar.field_success = false;
        yVar.field_isLike = false;
        SnsMethodCalculate.markEndTimeMs("clearCoverResource", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
    }

    /* renamed from: qq */
    public final boolean mo139912qq(String str, long j, String str2) {
        SnsMethodCalculate.markStartTimeMs("downloadBitmap", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        C87412m.m108594g(str, "userName");
        C87412m.m108594g(str2, "path");
        C100422y Yt = mo139909Yt(str);
        boolean z = true;
        boolean z2 = false;
        if (Yt.getType() == 1 || Yt.getType() == 6 || Yt.getType() == 0) {
            SnsMethodCalculate.markStartTimeMs("downloadPhoto", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            Log.m105924i("MicroMsg.SnsCoverStorage", "downloadPhoto user:" + str + " id:" + j + " path:" + str2 + " size:" + C86013q1.m106451l(str2));
            C100422y Yt2 = mo139909Yt(str);
            Long u = Yt2.mo139906u();
            if (u == null || u.longValue() != j) {
                z = false;
            }
            if (!z || !Yt2.field_success) {
                SnsMethodCalculate.markEndTimeMs("downloadPhoto", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            } else {
                Yt2.field_localImage = str2;
                z2 = mo139910bD(Yt2, false);
                SnsMethodCalculate.markEndTimeMs("downloadPhoto", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            }
        } else {
            SnsMethodCalculate.markStartTimeMs("downloadThumb", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            Log.m105924i("MicroMsg.SnsCoverStorage", "downloadThumb user:" + str + " id:" + j + " path:" + str2 + " size:" + C86013q1.m106451l(str2));
            C100422y Yt3 = mo139909Yt(str);
            Long u2 = Yt3.mo139906u();
            if (u2 == null || u2.longValue() != j) {
                z = false;
            }
            if (!z || !Yt3.field_success) {
                SnsMethodCalculate.markEndTimeMs("downloadThumb", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            } else {
                Yt3.field_localThumb = str2;
                z2 = mo139910bD(Yt3, false);
                SnsMethodCalculate.markEndTimeMs("downloadThumb", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            }
        }
        SnsMethodCalculate.markEndTimeMs("downloadBitmap", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        return z2;
    }
}
