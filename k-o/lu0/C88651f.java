package lu0;

import android.os.Handler;
import com.tencent.p014mm.plugin.appbrand.extendplugin.C81823b;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.utils.C29680s;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import in0.C87760d;
import kn0.C88242p;
import ns0.C89063a;
import ns0.C89064b;
import ns0.C89065c;
import p830xc.C91165a;
import po0.C89426l;
import ps0.C89437a;
import ps0.C89438b;
import sx3.C64197v;
import ym0.C91516n;

/* renamed from: lu0.f */
public class C88651f implements C89426l {

    /* renamed from: d */
    public static C88651f f255958d;

    /* renamed from: q */
    public C87760d mo123094q(C91165a aVar, Handler handler) {
        C82381f g;
        Class cls = C32735h.class;
        if (!(aVar instanceof C81823b) || (g = aVar.mo62544g()) == null || !C91516n.m114822a(g.getAppId())) {
            f$$a f__a = new f$$a();
            int d = C29680s.m38859d();
            if (-1 != d) {
                if (d == 3) {
                    Log.m105924i("MicroMsg.SameLayer.AppBrandXWebVideoStrategy", "createMediaPlayer, use SysMediaPlayer");
                    C87412m.m108594g(handler, "handler");
                    return new C89065c(C64197v.m75537f(new C89438b(handler), C89437a.f257482a));
                } else if (d == 4) {
                    Log.m105924i("MicroMsg.SameLayer.AppBrandXWebVideoStrategy", "createMediaPlayer, use ExoMediaPlayer");
                    f$$b f__b = new f$$b(handler);
                    f$$c f__c = new f$$c(handler);
                    C87412m.m108594g(handler, "handler");
                    return new C89065c(C64197v.m75537f(new C89064b(f__b, handler), new C89063a(f__c, handler)));
                } else if (d == 5) {
                    return f__a.mo123094q(aVar, handler);
                }
            }
            return f__a.mo123094q(aVar, handler);
        }
        int i = 15000;
        if (C86312j.m106911c(cls) != null) {
            i = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_android_xweb_video_weishi_loadcontrol_minbufferms, 15000);
            Log.m105925i("MicroMsg.SameLayer.AppBrandAVABTests", "getXWebVideoWeishiMinBufferMS, expt is %s", Integer.valueOf(i));
        }
        int i2 = 30000;
        if (C86312j.m106911c(cls) != null) {
            i2 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_android_xweb_video_weishi_loadcontrol_maxbufferms, 30000);
            Log.m105925i("MicroMsg.SameLayer.AppBrandAVABTests", "getXWebVideoWeishiMaxBufferMS, expt is %s", Integer.valueOf(i2));
        }
        int i3 = 2500;
        if (C86312j.m106911c(cls) != null) {
            i3 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_android_xweb_video_weishi_loadcontrol_bufferforplaybackms, 2500);
            Log.m105925i("MicroMsg.SameLayer.AppBrandAVABTests", "getXWebVideoWeishiBufferForPlaybackMS, expt is %s", Integer.valueOf(i3));
        }
        Log.m105925i("MicroMsg.SameLayer.AppBrandXWebVideoStrategy", "createMediaPlayer, weishi use weishi exo media player, minBufferMs:%s, maxBufferMs:%s, bufferForPlaybackMs:%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        return new C88242p(handler, i, i2, i3);
    }
}
