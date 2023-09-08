package com.tencent.p014mm.plugin.voip.model;

import android.net.Uri;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/voip/model/VoipModelResMgr$checkResUpdateCacheFileEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/CheckResUpdateCacheFileEvent;", "plugin-voip_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.voip.model.VoipModelResMgr$checkResUpdateCacheFileEventListener$1 */
public final class VoipModelResMgr$checkResUpdateCacheFileEventListener$1 extends IListener<CheckResUpdateCacheFileEvent> {
    public VoipModelResMgr$checkResUpdateCacheFileEventListener$1(C40008f fVar) {
        super(fVar);
    }

    public boolean callback(IEvent iEvent) {
        CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = (CheckResUpdateCacheFileEvent) iEvent;
        C87412m.m108594g(checkResUpdateCacheFileEvent, "event");
        CheckResUpdateCacheFileEvent.C28720a aVar = checkResUpdateCacheFileEvent.f78743d;
        int i = aVar.f78744a;
        boolean z = aVar.f78748e;
        boolean z2 = false;
        if (i != 112 || !z) {
            return false;
        }
        int i2 = aVar.f78745b;
        Uri n = C116299g2.m163858n(aVar.f78746c);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b)) {
            C86009m1 m1Var = new C86009m1(VoipModelResMgr.f207456c);
            if (!m1Var.mo119967g()) {
                try {
                    m1Var.mo119987x();
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.VoipModelResMgr", e, "create modepathdir failed:%s", m1Var);
                }
            }
            String str = checkResUpdateCacheFileEvent.f78743d.f78746c;
            switch (i2) {
                case 1:
                    String str2 = VoipModelResMgr.f207456c + "/rnnoise_16k.bin";
                    Log.m105924i("MicroMsg.VoipModelResMgr", "activePath: " + str + " modelfile: " + str2);
                    if (C86013q1.m106443d(str, str2, false) > 0) {
                        z2 = true;
                    }
                    Log.m105924i("MicroMsg.VoipModelResMgr", "copyFile resulsts: " + z2);
                    C86013q1.m106442c(str, str2);
                    break;
                case 2:
                    String str3 = VoipModelResMgr.f207456c + "/rnnoise_48k.bin";
                    Log.m105924i("MicroMsg.VoipModelResMgr", "cachePath: " + str + " modelfile: " + str3);
                    if (C86013q1.m106443d(str, str3, false) > 0) {
                        z2 = true;
                    }
                    Log.m105924i("MicroMsg.VoipModelResMgr", "copyFile resulsts: " + z2);
                    C86013q1.m106442c(str, str3);
                    break;
                case 3:
                    String str4 = VoipModelResMgr.f207456c + "/cldnn_ns_16k.bin";
                    Log.m105924i("MicroMsg.VoipModelResMgr", "activePath: " + str + " cldnn_modelfile: " + str4);
                    if (C86013q1.m106443d(str, str4, false) > 0) {
                        z2 = true;
                    }
                    Log.m105924i("MicroMsg.VoipModelResMgr", "copyFile resulsts: " + z2);
                    C86013q1.m106442c(str, str4);
                    break;
                case 4:
                    String str5 = VoipModelResMgr.f207456c + "/cldnn_ns_48k.bin";
                    Log.m105924i("MicroMsg.VoipModelResMgr", "cachePath: " + str + " cldnn_modelfile: " + str5);
                    if (C86013q1.m106443d(str, str5, false) > 0) {
                        z2 = true;
                    }
                    Log.m105924i("MicroMsg.VoipModelResMgr", "copyFile resulsts: " + z2);
                    C86013q1.m106442c(str, str5);
                    break;
                case 5:
                    String str6 = VoipModelResMgr.f207456c + "/fsnet_16k.bin";
                    Log.m105924i("MicroMsg.VoipModelResMgr", "activePath: " + str + " fsnet_modelfile: " + str6);
                    if (C86013q1.m106443d(str, str6, false) > 0) {
                        z2 = true;
                    }
                    Log.m105924i("MicroMsg.VoipModelResMgr", "copyFile resulsts: " + z2);
                    C86013q1.m106442c(str, str6);
                    break;
                case 6:
                    String str7 = VoipModelResMgr.f207456c + "/fsnet_48k.bin";
                    Log.m105924i("MicroMsg.VoipModelResMgr", "cachePath: " + str + " fsnet_modelfile: " + str7);
                    if (C86013q1.m106443d(str, str7, false) > 0) {
                        z2 = true;
                    }
                    Log.m105924i("MicroMsg.VoipModelResMgr", "copyFile resulsts: " + z2);
                    C86013q1.m106442c(str, str7);
                    break;
                case 7:
                    String str8 = VoipModelResMgr.f207456c + "/rnnhowlsup_16k.bin";
                    Log.m105924i("MicroMsg.VoipModelResMgr", "cachePath: " + str + " fsnet_modelfile: " + str8);
                    if (C86013q1.m106443d(str, str8, false) > 0) {
                        z2 = true;
                    }
                    Log.m105924i("MicroMsg.VoipModelResMgr", "copyFile resulsts: " + z2);
                    C86013q1.m106442c(str, str8);
                    break;
            }
        } else {
            Log.m105921e("MicroMsg.VoipModelResMgr", "file not exits :%s", checkResUpdateCacheFileEvent.f78743d.f78746c);
        }
        return true;
    }
}
