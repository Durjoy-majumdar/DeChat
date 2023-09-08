package com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate;

import com.tencent.p014mm.pluginsdk.res.downloader.model.C115901i;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C115908t;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C115913v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import rd3.C48020a;

/* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.i */
public final class C115889i implements C115901i {
    /* renamed from: a */
    public final void mo176436a(C115913v vVar, boolean z) {
        C115908t tVar = C115908t.C115910b.f347790a;
        String str = vVar.field_urlKey;
        if (tVar.f347788e) {
            tVar.f347785b.mo119164b(str);
        }
        C48020a.m53384a(vVar.field_filePath);
        C48020a.m53384a(vVar.field_filePath + ".decompressed");
        C48020a.m53384a(vVar.field_filePath + ".decrypted");
        if (2 != vVar.field_status || z) {
            int i = vVar.field_maxRetryTimes;
            if (i <= 0 || vVar.field_retryTimes > 0) {
                vVar.field_retryTimes--;
                vVar.field_fileUpdated = true;
                tVar.mo176455g(vVar, true);
                C115891k.m163010a(vVar.field_reportId, 12);
                Log.m105924i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "post network task");
                C115883d h = C115883d.m162993h(vVar);
                h.f347705p = false;
                C115891k.m163014e(vVar.field_resType, vVar.field_subType, Util.getInt(vVar.field_fileVersion, 0), (int) vVar.field_reportId, 76);
                tVar.mo176449a(h);
                return;
            }
            Log.m105925i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "record_maxRetryTimes = %d, record_retryTimes = %d, retry times out, skip ", Integer.valueOf(i), Integer.valueOf(vVar.field_retryTimes));
            return;
        }
        Log.m105924i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "delete completed but invalid file, but forceDL = false, skip this downloading");
    }

    /* renamed from: b */
    public final boolean mo176437b(C115913v vVar) {
        return Util.nullAsNil(C86013q1.m106456q(vVar.field_filePath)).equals(vVar.field_md5);
    }

    /* renamed from: c */
    public final void mo176438c(C115913v vVar) {
        if (vVar.field_fileCompress || vVar.field_fileEncrypt) {
            Log.m105924i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "send query and decrypt request");
            CheckResUpdateHelper.m162971c().mo176401a(vVar);
            return;
        }
        CheckResUpdateHelper.m162971c().mo176407h(vVar.field_resType, vVar.field_subType, vVar.field_filePath, Util.getInt(vVar.field_fileVersion, 0), vVar.field_originalMd5);
    }
}
