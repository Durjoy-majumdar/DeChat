package com.tencent.p014mm.pluginsdk.res.downloader.model;

import android.util.SparseArray;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C115908t;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C85640q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.List;

/* renamed from: com.tencent.mm.pluginsdk.res.downloader.model.m */
public final class C115905m implements C85630d {

    /* renamed from: a */
    public final MMHandler f347781a;

    /* renamed from: b */
    public final SparseArray<List<C115899e>> f347782b = new SparseArray<>();

    /* renamed from: c */
    public final Object f347783c = new Object();

    public C115905m(MMHandler mMHandler) {
        this.f347781a = mMHandler;
    }

    /* renamed from: a */
    public void mo113644a(String str, int i, int i2) {
        Log.m105925i("MicroMsg.ResDownloader.NetworkEventDispatcher", "dispatchRetry, urlKey = %s, max = %d, count = %d", str, Integer.valueOf(i), Integer.valueOf(i2));
        C115908t tVar = C115908t.C115910b.f347790a;
        C115913v e = tVar.mo176453e(str);
        if (e != null) {
            e.field_maxRetryTimes = i;
            e.field_retryTimes = i2;
            tVar.mo176455g(e, true);
        }
    }

    /* renamed from: b */
    public void mo113645b(String str, long j) {
        C115908t tVar = C115908t.C115910b.f347790a;
        C115913v e = tVar.mo176453e(str);
        if (e != null) {
            e.field_contentLength = j;
            tVar.mo176455g(e, true);
        }
    }

    /* renamed from: c */
    public void mo113646c(C85631f fVar, C85639p pVar) {
        Log.m105924i("MicroMsg.ResDownloader.NetworkEventDispatcher", "dispatchResponse, response = " + pVar);
        int i = pVar.f249598g;
        if (i == 2) {
            C115908t tVar = C115908t.C115910b.f347790a;
            C115913v e = tVar.mo176453e(pVar.f249592a);
            if (e != null) {
                e.field_status = 2;
                tVar.mo176455g(e, true);
            }
            Log.m105918d("MicroMsg.ResDownloader.NetworkEventDispatcher", "dispatchComplete, groupId = " + fVar.getGroupId());
            List<C115899e> d = mo176446d(fVar.getGroupId());
            if (Util.isNullOrNil((List) d)) {
                Log.m105918d("MicroMsg.ResDownloader.NetworkEventDispatcher", "dispatchComplete, listeners.size = null");
                return;
            }
            Log.m105918d("MicroMsg.ResDownloader.NetworkEventDispatcher", "dispatchComplete, listeners.size = " + d.size());
            this.f347781a.post(new C115903k(this, d, pVar, ((C85640q.C85641a) fVar).mo119192f()));
        } else if (i == 3) {
            C115908t tVar2 = C115908t.C115910b.f347790a;
            C115913v e2 = tVar2.mo176453e(pVar.f249592a);
            if (e2 != null) {
                e2.field_status = 3;
                tVar2.mo176455g(e2, true);
            }
            List<C115899e> d2 = mo176446d(fVar.getGroupId());
            if (!Util.isNullOrNil((List) d2)) {
                this.f347781a.post(new C115902j(this, d2, pVar, ((C85640q.C85641a) fVar).mo119192f()));
            }
        } else if (i == 4) {
            C115908t tVar3 = C115908t.C115910b.f347790a;
            C115913v e3 = tVar3.mo176453e(pVar.f249592a);
            if (e3 != null) {
                e3.field_status = 4;
                tVar3.mo176455g(e3, true);
            }
            List<C115899e> d3 = mo176446d(fVar.getGroupId());
            if (!Util.isNullOrNil((List) d3)) {
                this.f347781a.post(new C115904l(this, d3, pVar, ((C85640q.C85641a) fVar).mo119192f()));
            }
        }
    }

    /* renamed from: d */
    public final List<C115899e> mo176446d(String str) {
        List<C115899e> list;
        int hashCode = str.hashCode();
        synchronized (this.f347783c) {
            list = this.f347782b.get(hashCode);
        }
        return list;
    }
}
