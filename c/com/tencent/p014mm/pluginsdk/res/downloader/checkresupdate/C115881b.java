package com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate;

import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C115891k;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C115899e;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C115908t;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C115913v;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C85639p;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.concurrent.ConcurrentHashMap;
import qd3.C89599a;
import qd3.C89600c;

/* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.b */
public class C115881b implements C115899e {

    /* renamed from: a */
    public final /* synthetic */ CheckResUpdateHelper f347699a;

    /* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.b$a */
    public class C115882a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ CheckResUpdateCacheFileEvent f347700d;

        public C115882a(C115881b bVar, CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent) {
            this.f347700d = checkResUpdateCacheFileEvent;
        }

        public void run() {
            this.f347700d.publish();
        }
    }

    public C115881b(CheckResUpdateHelper checkResUpdateHelper) {
        this.f347699a = checkResUpdateHelper;
    }

    /* renamed from: a */
    public void mo176429a(String str, C85639p pVar) {
        C115908t tVar = C115908t.C115910b.f347790a;
        if (!(tVar.f347788e ? ((ConcurrentHashMap) tVar.f347785b.f249574b).containsKey(str) : false)) {
            C115890j.m163007a(str);
        }
    }

    /* renamed from: b */
    public void mo176430b(String str, C85639p pVar) {
        String str2 = str;
        Log.m105924i("MicroMsg.ResDownloader.CheckResUpdateHelper", "networkEventListener.onComplete, urlkey = " + str2);
        C115908t tVar = C115908t.C115910b.f347790a;
        C115913v e = tVar.mo176453e(str2);
        if (e != null) {
            C115891k.m163010a(e.field_reportId, 10);
            C115891k.m163010a(e.field_reportId, 15);
            C115891k.m163014e(e.field_resType, e.field_subType, Util.getInt(e.field_fileVersion, 0), (int) e.field_reportId, 77);
            if ((!e.field_fileCompress || e.field_fileEncrypt) && e.field_fileUpdated) {
                C115891k.m163012c(e.field_resType, e.field_subType, e.field_url, Util.getInt(e.field_fileVersion, 0), e.field_maxRetryTimes > e.field_retryTimes ? C115891k.C115892a.RETRY_SUCC : C115891k.C115892a.SUCC, true, Util.nullAsNil(e.field_groupId2).equals("NewXml"), false, e.field_sampleId);
            }
            if (e.field_fileCompress || e.field_fileEncrypt) {
                Log.m105924i("MicroMsg.ResDownloader.CheckResUpdateHelper", "networkEventListener, addDecryptRequest");
                this.f347699a.mo176401a(e);
                return;
            }
            CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = new CheckResUpdateCacheFileEvent();
            CheckResUpdateCacheFileEvent.C28720a aVar = checkResUpdateCacheFileEvent.f78743d;
            aVar.f78746c = e.field_filePath;
            aVar.f78749f = e.field_originalMd5;
            aVar.f78748e = e.field_fileUpdated;
            aVar.f78747d = Util.getInt(e.field_fileVersion, 0);
            CheckResUpdateCacheFileEvent.C28720a aVar2 = checkResUpdateCacheFileEvent.f78743d;
            aVar2.f78744a = e.field_resType;
            aVar2.f78745b = e.field_subType;
            tVar.f347787d.post(new C115882a(this, checkResUpdateCacheFileEvent));
            e.field_fileUpdated = false;
            tVar.mo176455g(e, true);
        }
    }

    /* renamed from: c */
    public void mo176431c(String str, C85639p pVar) {
        Exception exc;
        String str2 = str;
        C85639p pVar2 = pVar;
        boolean z = true;
        Log.m105925i("MicroMsg.ResDownloader.CheckResUpdateHelper", "networkEventListener.onFailed: %s", str2);
        C115890j.m163007a(str);
        C115913v e = C115908t.C115910b.f347790a.mo176453e(str2);
        if (e != null) {
            if (!(pVar2 == null || (exc = pVar2.f249599h) == null)) {
                if (exc instanceof C89599a) {
                    C115891k.m163010a(e.field_reportId, 7);
                } else if (exc instanceof C89600c) {
                    C115891k.m163010a(e.field_reportId, 16);
                }
                z = false;
            }
            if (z) {
                C115891k.m163010a(e.field_reportId, 11);
            }
            C115891k.m163010a(e.field_reportId, 44);
            C115891k.m163012c(e.field_resType, e.field_subType, e.field_url, Util.getInt(e.field_fileVersion, 0), C115891k.C115892a.FAIL, false, "NewXml".equalsIgnoreCase(e.field_groupId2), false, e.field_sampleId);
            C115891k.m163014e(e.field_resType, e.field_subType, Util.getInt(e.field_fileVersion, 0), (int) e.field_reportId, 78);
        }
    }

    public String getGroupId() {
        return "CheckResUpdate";
    }
}
