package p228rp;

import android.content.Context;
import c51.C39896e;
import com.tencent.p014mm.plugin.downloader.model.C40933j;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader.model.C40955x;
import com.tencent.p014mm.plugin.downloader.model.C40973y;
import com.tencent.p014mm.plugin.downloader.model.C40974z;
import com.tencent.p014mm.plugin.downloader_app.model.C40979a;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import di3.C86312j;
import e51.C45545g;
import ei3.C86522b;
import h81.C32735h;
import org.json.JSONObject;
import p237sp.C13747c0;
import v10.C52735e;
import z41.C53736a;

@C86522b
/* renamed from: rp.j0 */
public class C48070j0 extends C86301e implements C13747c0 {
    /* renamed from: em */
    public void mo13112em(Context context, long j, boolean z, boolean z2, C13747c0.C13748a aVar) {
        C40955x.m44390e(context, j, z, z2, aVar);
    }

    /* renamed from: hB */
    public void mo13113hB(Context context, long j, boolean z, C13747c0.C13748a aVar) {
        boolean m = C40935l.m44326g().mo63965m(j);
        C53736a c = C40933j.m44314c(j);
        if (c != null && !Util.isNullOrNil(c.field_appId)) {
            C39896e.m42675c(context, c.field_appId);
        }
        if (!m) {
            aVar.mo287a("fail", (JSONObject) null);
        } else if (NetStatusUtil.isWifi(context)) {
            aVar.mo287a((String) null, (JSONObject) null);
        } else if (c == null) {
            aVar.mo287a((String) null, (JSONObject) null);
        } else {
            boolean z2 = false;
            if (z && ((C52735e) C86312j.m106911c(C52735e.class)).mo61269fe(C32735h.C32737c.clicfg_download_game_ignore_network, false)) {
                z2 = true;
            }
            if (z2) {
                ((C45545g) C86312j.m106911c(C45545g.class)).nk0(context, c.field_appId, new C40973y(j, aVar), new C40974z(j, aVar, new JSONObject()));
                return;
            }
            aVar.mo287a((String) null, (JSONObject) null);
        }
    }

    /* renamed from: ky */
    public void mo13114ky(Context context, C40979a aVar, C13747c0.C13748a aVar2) {
        C40955x.m44387b(context, aVar, aVar2);
    }
}
