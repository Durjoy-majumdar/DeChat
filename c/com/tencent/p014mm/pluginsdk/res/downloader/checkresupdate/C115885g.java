package com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate;

import android.database.Cursor;
import com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C85626l;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C115908t;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C115913v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.wcdb.CursorWindowAllocationException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import rd3.C48020a;
import zh3.C91753f;

/* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.g */
public final class C115885g {

    /* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.g$a */
    public static final class C115886a {
        /* renamed from: a */
        public static void m163001a(boolean z, boolean z2, C115913v vVar, C115888h hVar) {
            Log.m105925i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "sendIORequest, fileAppend = %b, fileUpdate = %b", Boolean.valueOf(z), Boolean.valueOf(z2));
            int i = vVar.field_maxRetryTimes;
            if (i <= 0 || vVar.field_retryTimes > 0 || z2) {
                vVar.field_reportId = hVar.f347710p;
                vVar.field_status = 0;
                if (z2) {
                    int i2 = hVar.f347764e;
                    vVar.field_maxRetryTimes = i2;
                    vVar.field_retryTimes = i2;
                    vVar.field_fileUpdated = true;
                    vVar.field_priority = hVar.f347770k;
                    long j = hVar.f347720z;
                    if (j > 0) {
                        vVar.field_fileSize = j;
                    }
                    vVar.field_filePath = C115890j.m163008b(hVar.f347761b);
                    C115908t.C115910b.f347790a.mo176455g(vVar, true);
                } else {
                    vVar.field_retryTimes--;
                    vVar.field_priority = hVar.f347770k;
                    C115908t.C115910b.f347790a.mo176455g(vVar, true);
                    C115891k.m163010a(vVar.field_reportId, 12);
                }
                C115908t tVar = C115908t.C115910b.f347790a;
                if (tVar.mo176451c(hVar.f347761b)) {
                    Log.m105925i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "urlKey = %s is already downloading", hVar.f347761b);
                    if (hVar.f347706A) {
                        C115891k.m163010a(hVar.f347710p, 9);
                        C115891k.m163010a(hVar.f347710p, 44);
                        return;
                    }
                    return;
                }
                Log.m105925i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "urlKey = %s, post network task", hVar.f347761b);
                if (z2 && !z) {
                    CheckResUpdateHelper.m162971c().mo176408i(vVar.field_resType, vVar.field_subType, 0, Util.nullAsNil(vVar.field_groupId2).equals("NewXml"));
                }
                C115883d h = C115883d.m162993h(vVar);
                h.f347705p = z;
                h.f347704o = hVar.f347719y;
                if (!z) {
                    C48020a.m53384a(h.mo119181c());
                    C48020a.m53384a(h.mo119181c() + ".decompressed");
                    C48020a.m53384a(h.mo119181c() + ".decrypted");
                }
                C115891k.m163014e(vVar.field_resType, vVar.field_subType, Util.getInt(vVar.field_fileVersion, 0), (int) vVar.field_reportId, 76);
                tVar.mo176449a(h);
                return;
            }
            Log.m105925i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "record_maxRetryTimes = %d, record_retryTimes = %d, retry times out, skip", Integer.valueOf(i), Integer.valueOf(vVar.field_retryTimes));
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.g$b */
    public static final class C115887b {
        /* renamed from: a */
        public static void m163002a(C115913v vVar, boolean z, boolean z2) {
            int i;
            C115913v vVar2 = vVar;
            if (vVar2 == null) {
                Log.m105924i("MicroMsg.ResDownloader.CheckResUpdate.DoDecryptLogic", "get null record, skip");
                return;
            }
            String str = vVar2.field_urlKey;
            String str2 = vVar2.field_filePath;
            String str3 = vVar2.field_md5;
            boolean z3 = vVar2.field_fileCompress;
            boolean z4 = vVar2.field_fileEncrypt;
            byte[] bArr = vVar2.field_eccSignature;
            int i2 = Util.getInt(vVar2.field_fileVersion, 0);
            int i3 = vVar2.field_keyVersion;
            String str4 = vVar2.field_encryptKey;
            boolean z5 = vVar2.field_deleted;
            Log.m105924i("MicroMsg.ResDownloader.CheckResUpdate.DoDecryptLogic", "queried info: deleted = " + z5 + ", filePath = " + str2 + ", md5 = " + str3 + ", originalMd5 = " + vVar2.field_originalMd5 + ", fileCompress = " + z3 + ", fileEncrypt = " + z4 + ", eccSignature = " + bArr + ", fileVersion = " + i2 + ", (encrypt key == empty) = " + Util.isNullOrNil(str4));
            Log.m105919d("MicroMsg.ResDownloader.CheckResUpdate.DoDecryptLogic", "queried encryptKey = %s", str4);
            int i4 = i2;
            if (!z4) {
                if (z) {
                    i = i3;
                    C115891k.m163010a(vVar2.field_reportId, 53);
                    C115891k.m163010a(vVar2.field_reportId, 45);
                } else {
                    i = i3;
                }
                if (!z3) {
                    Log.m105920e("MicroMsg.ResDownloader.CheckResUpdate.DoDecryptLogic", "file is not encrypted nor compressed, just return");
                    return;
                }
            } else {
                i = i3;
            }
            int i5 = i4;
            int i6 = i;
            if (i6 != i5 && z4) {
                Log.m105925i("MicroMsg.ResDownloader.CheckResUpdate.DoDecryptLogic", "file version(%d) != key version(%d), skip", Integer.valueOf(i5), Integer.valueOf(i6));
                if (i6 >= 0) {
                    C115891k.m163010a(vVar2.field_reportId, 52);
                    C115891k.m163010a(vVar2.field_reportId, 45);
                }
            } else if (z5) {
                Log.m105924i("MicroMsg.ResDownloader.CheckResUpdate.DoDecryptLogic", "this file should have been deleted, skip this decrypt-op");
                C115891k.m163010a(vVar2.field_reportId, 51);
                C115891k.m163010a(vVar2.field_reportId, 45);
            } else if (Util.isNullOrNil(str4) && z4) {
                Log.m105924i("MicroMsg.ResDownloader.CheckResUpdate.DoDecryptLogic", "encryptKey invalid, skip");
                C115891k.m163010a(vVar2.field_reportId, 54);
                C115891k.m163010a(vVar2.field_reportId, 45);
            } else if (Util.isNullOrNil(str3) || Util.isNullOrNil(str2)) {
                Log.m105925i("MicroMsg.ResDownloader.CheckResUpdate.DoDecryptLogic", "this decrypt-op is invalid, record.md5 = %s, record.filePath = %s", str3, str2);
            } else {
                C115908t tVar = C115908t.C115910b.f347790a;
                if (tVar.mo176451c(str)) {
                    Log.m105925i("MicroMsg.ResDownloader.CheckResUpdate.DoDecryptLogic", "request(%s) is downloading or queueing, hold this decrypt-op", str);
                } else if (!Util.nullAsNil(C86013q1.m106456q(str2)).equals(str3)) {
                    Log.m105924i("MicroMsg.ResDownloader.CheckResUpdate.DoDecryptLogic", "md5 not match, file spoiled, skip this decrypt-op");
                    vVar2.field_status = 3;
                    tVar.mo176455g(vVar2, true);
                    C115891k.m163010a(vVar2.field_reportId, 56);
                    C115891k.m163010a(vVar2.field_reportId, 45);
                } else if (!tVar.mo176451c(str)) {
                    Log.m105925i("MicroMsg.ResDownloader.CheckResUpdate.DoDecryptLogic", "request supposed to complete, send decrypt request %s", vVar2.field_urlKey);
                    CheckResUpdateHelper.m162971c().mo176408i(vVar2.field_resType, vVar2.field_subType, 1, Util.nullAsNil(vVar2.field_groupId2).equals("NewXml"));
                    if (z2) {
                        CheckResUpdateHelper c = CheckResUpdateHelper.m162971c();
                        c.getClass();
                        Log.m105925i("MicroMsg.ResDownloader.CheckResUpdateHelper", "performDecryptDirectly, urlkey %s", vVar2.field_urlKey);
                        c.f347646b.getClass();
                        new C85626l.C85627a(C115880a.m162988b(vVar)).run();
                        return;
                    }
                    CheckResUpdateHelper.m162971c().mo176401a(vVar2);
                }
            }
        }
    }

    /* renamed from: a */
    public static List<C115913v> m163000a(int i) {
        Cursor query;
        LinkedList linkedList;
        C115908t tVar = C115908t.C115910b.f347790a;
        C91753f fVar = !tVar.f347788e ? null : tVar.f347784a.f347798d;
        if (fVar == null) {
            return Collections.emptyList();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("urlKey");
        Locale locale = Locale.US;
        sb.append(String.format(locale, " like '%d.%%.data'", new Object[]{Integer.valueOf(i)}));
        sb.append(" and ");
        sb.append("groupId1");
        sb.append("=");
        sb.append(String.format(locale, "'%s'", new Object[]{"CheckResUpdate"}));
        try {
            query = fVar.query("ResDownloaderRecordTable", (String[]) null, sb.toString(), (String[]) null, (String) null, (String) null, (String) null, 2);
            if (query != null) {
                if (!query.isClosed()) {
                    if (query.moveToFirst()) {
                        LinkedList linkedList2 = new LinkedList();
                        do {
                            C115913v vVar = new C115913v();
                            vVar.convertFrom(query);
                            linkedList2.add(vVar);
                        } while (query.moveToNext());
                        linkedList = linkedList2;
                    } else {
                        linkedList = Collections.emptyList();
                    }
                    query.close();
                    return linkedList;
                }
            }
            List<C115913v> emptyList = Collections.emptyList();
            if (query != null) {
                query.close();
            }
            return emptyList;
        } catch (CursorWindowAllocationException e) {
            Log.m105921e("MicroMsg.CheckResUpdateRecordLogic", "queryAllWithType(%d) get exception:%s", Integer.valueOf(i), e);
            return Collections.emptyList();
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
