package p506ep;

import com.tencent.p014mm.modelstat.C29048w;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C115900h;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C115908t;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C115912u;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C115913v;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C85638o;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C85640q;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import eb0.C31519v2;
import eb0.C31536y2;
import ei3.C86522b;
import p523fp.C87030f;

@C86522b
/* renamed from: ep.f */
public class C116781f extends C86301e implements C87030f {
    /* renamed from: Q5 */
    public C85640q.C85641a mo121434Q5(C85638o oVar) {
        C115908t.C115910b.f347790a.getClass();
        Log.m105918d("MicroMsg.ResDownloaderCore", "getNetworkRequestHandler");
        int hashCode = oVar.mo119182d().hashCode();
        for (C115900h next : C115912u.m163042a()) {
            Log.m105925i("MicroMsg.ResDownloaderCore", "plugin = %s, groupId = %s", next.getClass().getSimpleName(), next.getGroupId());
            if (next.getGroupId().hashCode() == hashCode) {
                return next.mo176409Q5(oVar);
            }
        }
        return null;
    }

    /* renamed from: So */
    public void mo121435So(String str) {
        C115908t tVar = C115908t.C115910b.f347790a;
        C115913v e = tVar.mo176453e(str);
        if (e != null) {
            e.field_status = 1;
            tVar.mo176455g(e, true);
        }
    }

    public void ll0(int i, int i2) {
        C31536y2 y2Var;
        if ((i > 0 || i2 > 0) && (y2Var = C31519v2.f84271a) != null) {
            ((C29048w.C29055f) y2Var).mo56422a(i, i2, 0);
        }
    }
}
