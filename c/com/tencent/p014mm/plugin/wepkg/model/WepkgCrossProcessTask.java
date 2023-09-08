package com.tencent.p014mm.plugin.wepkg.model;

import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.wearable.WearableStatusCodes;
import com.tencent.p014mm.plugin.game.commlib.C41853c;
import com.tencent.p014mm.plugin.wepkg.utils.C44536d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.ArrayList;
import java.util.List;
import lb3.C46839a;
import lb3.C46840b;
import lb3.C46841c;
import lb3.C46842d;
import lb3.C46843e;
import lb3.C46844f;

/* renamed from: com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask */
public class WepkgCrossProcessTask extends BaseWepkgProcessTask {
    public static final Parcelable.Creator<WepkgCrossProcessTask> CREATOR = new C44483a();

    /* renamed from: h */
    public int f120618h;

    /* renamed from: i */
    public WepkgVersion f120619i;

    /* renamed from: j */
    public List<WepkgVersion> f120620j;

    /* renamed from: n */
    public WePkgDiffInfo f120621n;

    /* renamed from: o */
    public WepkgPreloadFile f120622o;

    /* renamed from: p */
    public List<WepkgPreloadFile> f120623p;

    /* renamed from: q */
    public String f120624q;

    /* renamed from: r */
    public Runnable f120625r;

    /* renamed from: com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask$a */
    public class C44483a implements Parcelable.Creator<WepkgCrossProcessTask> {
        public Object createFromParcel(Parcel parcel) {
            return new WepkgCrossProcessTask(parcel, (C44483a) null);
        }

        public Object[] newArray(int i) {
            return new WepkgCrossProcessTask[i];
        }
    }

    public WepkgCrossProcessTask() {
        this.f120618h = -1;
        this.f120619i = new WepkgVersion();
        this.f120620j = new ArrayList();
        this.f120621n = new WePkgDiffInfo();
        this.f120622o = new WepkgPreloadFile();
        this.f120623p = new ArrayList();
    }

    /* renamed from: i */
    public void mo1552i() {
        Runnable runnable = this.f120625r;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: j */
    public void mo1553j() {
        C46843e qq;
        String str;
        Cursor rawQuery;
        char c;
        int i;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        boolean z3;
        ArrayList arrayList2;
        boolean z4;
        boolean z5;
        int i2 = this.f120618h;
        if (i2 == 1001) {
            this.f120608f = true;
        } else if (i2 != 1002) {
            switch (i2) {
                case 2002:
                    WepkgVersion wepkgVersion = this.f120619i;
                    if (wepkgVersion != null && !Util.isNullOrNil(wepkgVersion.f120651d)) {
                        C46844f Ow = C46844f.m52139Ow();
                        WepkgVersion wepkgVersion2 = this.f120619i;
                        wepkgVersion2.getClass();
                        C46843e eVar = new C46843e();
                        eVar.field_pkgId = wepkgVersion2.f120651d;
                        eVar.field_appId = wepkgVersion2.f120652e;
                        eVar.field_version = wepkgVersion2.f120653f;
                        eVar.field_pkgPath = wepkgVersion2.f120654g;
                        eVar.field_disableWvCache = wepkgVersion2.f120655h;
                        eVar.field_clearPkgTime = wepkgVersion2.f120656i;
                        eVar.field_checkIntervalTime = wepkgVersion2.f120657j;
                        eVar.field_packMethod = wepkgVersion2.f120658n;
                        eVar.field_domain = wepkgVersion2.f120659o;
                        eVar.field_md5 = wepkgVersion2.f120660p;
                        eVar.field_downloadUrl = wepkgVersion2.f120661q;
                        eVar.field_pkgSize = wepkgVersion2.f120662r;
                        eVar.field_downloadNetType = wepkgVersion2.f120663s;
                        eVar.field_nextCheckTime = wepkgVersion2.f120664t;
                        eVar.field_createTime = wepkgVersion2.f120665u;
                        eVar.field_charset = wepkgVersion2.f120666v;
                        eVar.field_bigPackageReady = wepkgVersion2.f120667w;
                        eVar.field_preloadFilesReady = wepkgVersion2.f120668x;
                        eVar.field_preloadFilesAtomic = wepkgVersion2.f120669y;
                        eVar.field_totalDownloadCount = wepkgVersion2.f120670z;
                        eVar.field_downloadTriggerType = wepkgVersion2.f120650A;
                        WePkgDiffInfo wePkgDiffInfo = this.f120621n;
                        if (Ow.f126002d && !Util.isNullOrNil(eVar.field_pkgId)) {
                            if (wePkgDiffInfo != null && !Util.isNullOrNil(wePkgDiffInfo.f120614h) && (qq = C46844f.m52139Ow().mo72053qq(eVar.field_pkgId)) != null && C86013q1.m106450k(qq.field_pkgPath)) {
                                wePkgDiffInfo.f120610d = qq.field_pkgId;
                                wePkgDiffInfo.f120611e = qq.field_version;
                                wePkgDiffInfo.f120612f = qq.field_pkgPath;
                                C46840b.m52131Lo().mo72038c(wePkgDiffInfo.f120610d);
                                C46840b Lo = C46840b.m52131Lo();
                                C46839a aVar = new C46839a();
                                aVar.field_pkgId = wePkgDiffInfo.f120610d;
                                aVar.field_oldVersion = wePkgDiffInfo.f120611e;
                                aVar.field_oldPath = wePkgDiffInfo.f120612f;
                                aVar.field_version = wePkgDiffInfo.f120613g;
                                aVar.field_downloadUrl = wePkgDiffInfo.f120614h;
                                aVar.field_md5 = wePkgDiffInfo.f120615i;
                                aVar.field_pkgSize = wePkgDiffInfo.f120616j;
                                aVar.field_downloadNetType = wePkgDiffInfo.f120617n;
                                Lo.insert(aVar);
                                Log.m105924i("MicroMsg.Wepkg.WepkgVersionStorage", "insertDiffPkg");
                            }
                            C46844f.m52139Ow().mo72044Lo(eVar.field_pkgId);
                            C46842d.m52134Yt().mo72042jo(eVar.field_pkgId);
                            Object obj = C44536d.f120770a;
                            eVar.field_nextCheckTime = Util.nowSecond() + eVar.field_checkIntervalTime;
                            eVar.field_createTime = Util.nowSecond();
                            eVar.field_accessTime = Util.nowSecond();
                            Log.m105925i("MicroMsg.Wepkg.WepkgVersionStorage", "insertPkgVersion pkgid:%s, version:%s, ret:%s", eVar.field_pkgId, eVar.field_version, Boolean.valueOf(Ow.insert(eVar)));
                        }
                        if (!Util.isNullOrNil((List) this.f120623p)) {
                            for (WepkgPreloadFile next : this.f120623p) {
                                if (next != null) {
                                    C46842d Yt = C46842d.m52134Yt();
                                    C46841c cVar = new C46841c();
                                    cVar.field_key = next.f120638d;
                                    String str2 = next.f120639e;
                                    cVar.field_pkgId = str2;
                                    cVar.field_version = next.f120640f;
                                    cVar.field_filePath = next.f120641g;
                                    String str3 = next.f120642h;
                                    cVar.field_rid = str3;
                                    cVar.field_mimeType = next.f120643i;
                                    cVar.field_md5 = next.f120644j;
                                    cVar.field_downloadUrl = next.f120645n;
                                    cVar.field_size = next.f120646o;
                                    cVar.field_downloadNetType = next.f120647p;
                                    cVar.field_completeDownload = next.f120648q;
                                    cVar.field_createTime = next.f120649r;
                                    if (Yt.f125997d) {
                                        if (Yt.mo72043qq(str2, str3) == null) {
                                            Object obj2 = C44536d.f120770a;
                                            cVar.field_createTime = Util.nowSecond();
                                            Log.m105925i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "insertPreloadFile pkgid:%s, version:%s, rid:%s, ret:%s", cVar.field_pkgId, cVar.field_version, cVar.field_rid, Boolean.valueOf(Yt.insert(cVar)));
                                        } else {
                                            Log.m105925i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "relacePreloadFile pkgid:%s, version:%s, rid:%s, ret:%s", cVar.field_pkgId, cVar.field_version, cVar.field_rid, Boolean.valueOf(Yt.replace(cVar)));
                                        }
                                    }
                                }
                            }
                        }
                        this.f120608f = true;
                        break;
                    }
                case 2003:
                    String str4 = null;
                    if (this.f120619i != null) {
                        C46844f Ow2 = C46844f.m52139Ow();
                        if (Ow2.f126002d) {
                            Cursor rawQuery2 = Ow2.rawQuery(String.format("select * from %s where %s=0 and %s=1 and %s<1 and %s<?", new Object[]{"WepkgVersion", "bigPackageReady", "preloadFilesAtomic", "autoDownloadCount", "packageDownloadCount"}), String.valueOf(3));
                            if (rawQuery2 != null) {
                                if (rawQuery2.moveToFirst()) {
                                    int count = rawQuery2.getCount();
                                    rawQuery2.move(count > 1 ? Util.getIntRandom(count - 1, 0) : 0);
                                    C46843e eVar2 = new C46843e();
                                    eVar2.convertFrom(rawQuery2);
                                    rawQuery2.close();
                                    Ow2.mo72050jo(eVar2.field_pkgId);
                                    Log.m105925i("MicroMsg.Wepkg.WepkgVersionStorage", "randomNeedDownloadPkgid exist record in DB, pkgid:%s, version:%s, bigPackageReady:false, preloadFilesAtomic:true", eVar2.field_pkgId, eVar2.field_version);
                                    str4 = eVar2.field_pkgId;
                                } else {
                                    rawQuery2.close();
                                    Cursor rawQuery3 = Ow2.rawQuery(String.format("select * from %s where %s=0 and %s<1 and %s<?", new Object[]{"WepkgVersion", "bigPackageReady", "autoDownloadCount", "packageDownloadCount"}), String.valueOf(3));
                                    if (rawQuery3 != null) {
                                        if (rawQuery3.moveToFirst()) {
                                            int count2 = rawQuery3.getCount();
                                            rawQuery3.move(count2 > 1 ? Util.getIntRandom(count2 - 1, 0) : 0);
                                            C46843e eVar3 = new C46843e();
                                            eVar3.convertFrom(rawQuery3);
                                            rawQuery3.close();
                                            Ow2.mo72050jo(eVar3.field_pkgId);
                                            Log.m105925i("MicroMsg.Wepkg.WepkgVersionStorage", "randomNeedDownloadPkgid exist record in DB, pkgid:%s, version:%s, bigPackageReady:false, preloadFilesAtomic:false", eVar3.field_pkgId, eVar3.field_version);
                                            str4 = eVar3.field_pkgId;
                                        } else {
                                            rawQuery3.close();
                                            Log.m105924i("MicroMsg.Wepkg.WepkgVersionStorage", "randomNeedDownloadPkgid no download record in DB");
                                        }
                                    }
                                }
                            }
                            str4 = null;
                        }
                        if (Util.isNullOrNil(str4)) {
                            C46842d Yt2 = C46842d.m52134Yt();
                            if (Yt2.f125997d && (rawQuery = Yt2.rawQuery(String.format("select * from %s where %s=0 and %s<1 and %s<?", new Object[]{"WepkgPreloadFiles", "completeDownload", "autoDownloadCount", "fileDownloadCount"}), String.valueOf(3))) != null) {
                                if (rawQuery.moveToFirst()) {
                                    int count3 = rawQuery.getCount();
                                    rawQuery.move(count3 > 1 ? Util.getIntRandom(count3 - 1, 0) : 0);
                                    C46841c cVar2 = new C46841c();
                                    cVar2.convertFrom(rawQuery);
                                    rawQuery.close();
                                    String str5 = cVar2.field_pkgId;
                                    String str6 = cVar2.field_rid;
                                    if (!Yt2.f125997d || Util.isNullOrNil(str5)) {
                                        c = 0;
                                    } else if (Util.isNullOrNil(str6)) {
                                        i = 3;
                                        c = 0;
                                        Object[] objArr = new Object[i];
                                        objArr[c] = cVar2.field_pkgId;
                                        objArr[1] = cVar2.field_version;
                                        objArr[2] = cVar2.field_rid;
                                        Log.m105925i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "randomNeedDownloadPkgid exist record in DB, pkgid:%s, version:%s, rid:%s", objArr);
                                        str = cVar2.field_pkgId;
                                        str4 = str;
                                    } else {
                                        c = 0;
                                        Log.m105925i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "WepkgPreloadFilesRecord addAutoDownloadCount ret:%s", Boolean.valueOf(Yt2.execSQL("WepkgPreloadFiles", String.format("update %s set %s=%s+1 where %s='%s' and %s='%s'", new Object[]{"WepkgPreloadFiles", "autoDownloadCount", "autoDownloadCount", "pkgId", str5, "rid", str6}))));
                                    }
                                    i = 3;
                                    Object[] objArr2 = new Object[i];
                                    objArr2[c] = cVar2.field_pkgId;
                                    objArr2[1] = cVar2.field_version;
                                    objArr2[2] = cVar2.field_rid;
                                    Log.m105925i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "randomNeedDownloadPkgid exist record in DB, pkgid:%s, version:%s, rid:%s", objArr2);
                                    str = cVar2.field_pkgId;
                                    str4 = str;
                                } else {
                                    rawQuery.close();
                                    Log.m105924i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "randomNeedDownloadPkgid no download record in DB");
                                }
                            }
                            str = null;
                            str4 = str;
                        }
                        if (Util.isNullOrNil(str4)) {
                            C46844f Ow3 = C46844f.m52139Ow();
                            if (Ow3.f126002d) {
                                Log.m105925i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgVersionRecord resetAutoDownloadCount ret:%s", Boolean.valueOf(Ow3.execSQL("WepkgVersion", String.format("update %s set %s=0", new Object[]{"WepkgVersion", "autoDownloadCount"}))));
                                Log.m105925i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgPreloadFilesRecord resetAutoDownloadCount ret:%s", Boolean.valueOf(Ow3.execSQL("WepkgPreloadFiles", String.format("update %s set %s=0", new Object[]{"WepkgPreloadFiles", "autoDownloadCount"}))));
                            }
                        }
                        this.f120619i.f120651d = str4;
                        break;
                    }
                    break;
                case 2004:
                    if (this.f120619i != null) {
                        this.f120608f = C46844f.m52139Ow().mo72048bD(this.f120619i.f120651d);
                        break;
                    }
                    break;
                case 2005:
                    C46844f Ow4 = C46844f.m52139Ow();
                    if (Ow4.f126002d) {
                        String format = String.format("select * from %s where %s < ? - %s", new Object[]{"WepkgVersion", "accessTime", "clearPkgTime"});
                        Object obj3 = C44536d.f120770a;
                        Cursor rawQuery4 = Ow4.rawQuery(format, String.valueOf(Util.nowSecond()));
                        Log.m105925i("MicroMsg.Wepkg.WepkgVersionStorage", "getNeedCleanRecords queryStr:%s", format);
                        if (rawQuery4 == null) {
                            Log.m105924i("MicroMsg.Wepkg.WepkgVersionStorage", "cursor is null");
                        } else if (rawQuery4.moveToFirst()) {
                            ArrayList arrayList3 = new ArrayList();
                            do {
                                WepkgVersion wepkgVersion3 = new WepkgVersion();
                                C46843e eVar4 = new C46843e();
                                eVar4.convertFrom(rawQuery4);
                                wepkgVersion3.mo69269b(eVar4);
                                arrayList3.add(wepkgVersion3);
                            } while (rawQuery4.moveToNext());
                            rawQuery4.close();
                            Log.m105925i("MicroMsg.Wepkg.WepkgVersionStorage", "record list size:%s", Integer.valueOf(arrayList3.size()));
                            arrayList = arrayList3;
                            this.f120620j = arrayList;
                            this.f120608f = true;
                            break;
                        } else {
                            rawQuery4.close();
                            Log.m105924i("MicroMsg.Wepkg.WepkgVersionStorage", "no record");
                        }
                    }
                    arrayList = null;
                    this.f120620j = arrayList;
                    this.f120608f = true;
                case 2006:
                    if (this.f120619i != null) {
                        C46844f Ow5 = C46844f.m52139Ow();
                        String str7 = this.f120619i.f120651d;
                        if (!Ow5.f126002d || Util.isNullOrNil(str7)) {
                            z = false;
                        } else {
                            Log.m105925i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgVersionRecord addTotalDownloadCount ret:%s", Boolean.valueOf(Ow5.execSQL("WepkgVersion", String.format("update %s set %s=%s+1 where %s='%s'", new Object[]{"WepkgVersion", "totalDownloadCount", "totalDownloadCount", "pkgId", str7}))));
                            z = true;
                        }
                        this.f120608f = z;
                        break;
                    }
                    break;
                default:
                    switch (i2) {
                        case 3001:
                            if (this.f120619i != null) {
                                C46843e qq4 = C46844f.m52139Ow().mo72053qq(this.f120619i.f120651d);
                                if (qq4 == null) {
                                    this.f120619i = null;
                                    break;
                                } else {
                                    this.f120619i.mo69269b(qq4);
                                    this.f120608f = true;
                                    break;
                                }
                            }
                            break;
                        case 3002:
                            if (this.f120619i != null) {
                                C46843e Yt3 = C46844f.m52139Ow().mo72047Yt(this.f120619i.f120651d);
                                if (Yt3 == null) {
                                    this.f120619i = null;
                                    break;
                                } else {
                                    this.f120619i.mo69269b(Yt3);
                                    this.f120608f = true;
                                    break;
                                }
                            }
                            break;
                        case 3003:
                            if (this.f120619i != null) {
                                this.f120608f = C46844f.m52139Ow().mo72045SE(this.f120619i.f120651d);
                                break;
                            }
                            break;
                        case 3004:
                            if (this.f120619i != null) {
                                C46844f Ow6 = C46844f.m52139Ow();
                                WepkgVersion wepkgVersion4 = this.f120619i;
                                this.f120608f = Ow6.mo72046TE(wepkgVersion4.f120651d, wepkgVersion4.f120655h, wepkgVersion4.f120656i, wepkgVersion4.f120657j);
                                break;
                            }
                            break;
                        case 3005:
                            if (this.f120619i != null) {
                                C46844f Ow7 = C46844f.m52139Ow();
                                WepkgVersion wepkgVersion5 = this.f120619i;
                                this.f120608f = Ow7.mo72051kD(wepkgVersion5.f120651d, wepkgVersion5.f120654g, wepkgVersion5.f120667w);
                                break;
                            }
                            break;
                        case AuthApiStatusCodes.AUTH_APP_CERT_ERROR /*3006*/:
                            if (this.f120619i != null) {
                                C46844f Ow8 = C46844f.m52139Ow();
                                WepkgVersion wepkgVersion6 = this.f120619i;
                                this.f120608f = Ow8.mo72052mI(wepkgVersion6.f120651d, wepkgVersion6.f120668x);
                                break;
                            }
                            break;
                        case 3007:
                            if (this.f120619i != null) {
                                this.f120608f = C46844f.m52139Ow().mo72049bF(this.f120619i.f120651d);
                                break;
                            }
                            break;
                        case 3008:
                            if (this.f120619i != null) {
                                C46844f Ow9 = C46844f.m52139Ow();
                                String str8 = this.f120619i.f120651d;
                                if (!Ow9.f126002d || Util.isNullOrNil(str8)) {
                                    z2 = false;
                                } else {
                                    Log.m105925i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgVersionRecord addPackageDownloadCount ret:%s", Boolean.valueOf(Ow9.execSQL("WepkgVersion", String.format("update %s set %s=%s+1 where %s='%s'", new Object[]{"WepkgVersion", "packageDownloadCount", "packageDownloadCount", "pkgId", str8}))));
                                    z2 = true;
                                }
                                this.f120608f = z2;
                                break;
                            }
                            break;
                        case 3009:
                            if (this.f120619i != null) {
                                C46844f Ow10 = C46844f.m52139Ow();
                                String str9 = this.f120619i.f120651d;
                                if (!Ow10.f126002d || Util.isNullOrNil(str9)) {
                                    z3 = false;
                                } else {
                                    Log.m105925i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgVersionRecord resetPackageDownloadCount ret:%s", Boolean.valueOf(Ow10.execSQL("WepkgVersion", String.format("update %s set %s=0 where %s='%s'", new Object[]{"WepkgVersion", "packageDownloadCount", "pkgId", str9}))));
                                    z3 = true;
                                }
                                this.f120608f = z3;
                                break;
                            }
                            break;
                        default:
                            switch (i2) {
                                case 4001:
                                    WepkgVersion wepkgVersion7 = this.f120619i;
                                    if (wepkgVersion7 != null && !Util.isNullOrNil(wepkgVersion7.f120651d)) {
                                        try {
                                            this.f120623p = C46842d.m52134Yt().mo72040Lo(this.f120619i.f120651d);
                                        } catch (Exception unused) {
                                        }
                                        this.f120608f = true;
                                        break;
                                    }
                                case 4002:
                                    if (this.f120622o != null) {
                                        C46842d Yt4 = C46842d.m52134Yt();
                                        WepkgPreloadFile wepkgPreloadFile = this.f120622o;
                                        this.f120608f = Yt4.mo72041Ow(wepkgPreloadFile.f120639e, wepkgPreloadFile.f120642h, wepkgPreloadFile.f120641g, wepkgPreloadFile.f120648q);
                                        break;
                                    }
                                    break;
                                case WearableStatusCodes.DATA_ITEM_TOO_LARGE /*4003*/:
                                    if (this.f120619i != null) {
                                        C46842d Yt5 = C46842d.m52134Yt();
                                        String str10 = this.f120619i.f120651d;
                                        if (Yt5.f125997d && !Util.isNullOrNil(str10)) {
                                            String format2 = String.format("select * from %s where %s=?", new Object[]{"WepkgPreloadFiles", "pkgId"});
                                            Cursor rawQuery5 = Yt5.rawQuery(format2, str10);
                                            Log.m105925i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "getPreLoadFileList queryStr:%s", format2);
                                            if (rawQuery5 == null) {
                                                Log.m105924i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "cursor is null");
                                            } else if (rawQuery5.moveToFirst()) {
                                                ArrayList arrayList4 = new ArrayList();
                                                do {
                                                    WepkgPreloadFile wepkgPreloadFile2 = new WepkgPreloadFile();
                                                    C46841c cVar3 = new C46841c();
                                                    cVar3.convertFrom(rawQuery5);
                                                    wepkgPreloadFile2.mo69263b(cVar3);
                                                    arrayList4.add(wepkgPreloadFile2);
                                                } while (rawQuery5.moveToNext());
                                                rawQuery5.close();
                                                Log.m105925i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "record list size:%s", Integer.valueOf(arrayList4.size()));
                                                arrayList2 = arrayList4;
                                                this.f120623p = arrayList2;
                                                this.f120608f = true;
                                                break;
                                            } else {
                                                rawQuery5.close();
                                                Log.m105924i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "no record");
                                            }
                                        }
                                        arrayList2 = null;
                                        this.f120623p = arrayList2;
                                        this.f120608f = true;
                                    }
                                    break;
                                case WearableStatusCodes.INVALID_TARGET_NODE /*4004*/:
                                    if (this.f120622o != null) {
                                        C46842d Yt6 = C46842d.m52134Yt();
                                        WepkgPreloadFile wepkgPreloadFile3 = this.f120622o;
                                        C46841c qq5 = Yt6.mo72043qq(wepkgPreloadFile3.f120639e, wepkgPreloadFile3.f120642h);
                                        if (qq5 == null) {
                                            this.f120622o = null;
                                            break;
                                        } else {
                                            this.f120622o.mo69263b(qq5);
                                            this.f120608f = true;
                                            break;
                                        }
                                    }
                                    break;
                                case WearableStatusCodes.ASSET_UNAVAILABLE /*4005*/:
                                    if (this.f120622o != null) {
                                        C46842d Yt7 = C46842d.m52134Yt();
                                        WepkgPreloadFile wepkgPreloadFile4 = this.f120622o;
                                        String str11 = wepkgPreloadFile4.f120639e;
                                        String str12 = wepkgPreloadFile4.f120642h;
                                        if (!Yt7.f125997d || Util.isNullOrNil(str11) || Util.isNullOrNil(str12)) {
                                            z4 = false;
                                        } else {
                                            Log.m105925i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "WepkgPreloadFilesRecord addFileDownloadCount ret:%s", Boolean.valueOf(Yt7.execSQL("WepkgPreloadFiles", String.format("update %s set %s=%s+1 where %s='%s' and %s='%s'", new Object[]{"WepkgPreloadFiles", "fileDownloadCount", "fileDownloadCount", "pkgId", str11, "rid", str12}))));
                                            z4 = true;
                                        }
                                        this.f120608f = z4;
                                        break;
                                    }
                                    break;
                                case WearableStatusCodes.DUPLICATE_CAPABILITY /*4006*/:
                                    if (this.f120622o != null) {
                                        C46842d Yt8 = C46842d.m52134Yt();
                                        String str13 = this.f120622o.f120639e;
                                        if (!Yt8.f125997d || Util.isNullOrNil(str13)) {
                                            z5 = false;
                                        } else {
                                            Log.m105925i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "WepkgPreloadFilesRecord resetFileDownloadCount ret:%s", Boolean.valueOf(Yt8.execSQL("WepkgPreloadFiles", String.format("update %s set %s=0 where %s='%s'", new Object[]{"WepkgPreloadFiles", "fileDownloadCount", "pkgId", str13}))));
                                            z5 = true;
                                        }
                                        this.f120608f = z5;
                                        break;
                                    }
                                    break;
                            }
                            break;
                    }
            }
        } else {
            this.f120608f = C41853c.m45367a();
        }
        mo114394b();
    }

    /* renamed from: q */
    public void mo69252q(Parcel parcel) {
        this.f120618h = parcel.readInt();
        this.f120619i = (WepkgVersion) parcel.readParcelable(WepkgVersion.class.getClassLoader());
        if (this.f120620j == null) {
            this.f120620j = new ArrayList();
        }
        parcel.readList(this.f120620j, WepkgVersion.class.getClassLoader());
        this.f120622o = (WepkgPreloadFile) parcel.readParcelable(WepkgPreloadFile.class.getClassLoader());
        if (this.f120623p == null) {
            this.f120623p = new ArrayList();
        }
        parcel.readList(this.f120623p, WepkgPreloadFile.class.getClassLoader());
        this.f120624q = parcel.readString();
    }

    /* renamed from: t */
    public void mo69253t(Parcel parcel, int i) {
        parcel.writeInt(this.f120618h);
        parcel.writeParcelable(this.f120619i, i);
        if (this.f120620j == null) {
            this.f120620j = new ArrayList();
        }
        parcel.writeList(this.f120620j);
        parcel.writeParcelable(this.f120622o, i);
        if (this.f120623p == null) {
            this.f120623p = new ArrayList();
        }
        parcel.writeList(this.f120623p);
        parcel.writeString(this.f120624q);
    }

    public WepkgCrossProcessTask(Parcel parcel, C44483a aVar) {
        mo1551g(parcel);
    }
}
