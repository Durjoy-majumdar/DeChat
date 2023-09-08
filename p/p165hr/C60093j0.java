package p165hr;

import android.content.Intent;
import c30.C104289g;
import c30.C26827e;
import c30.C79923f;
import cl1.C54985m;
import cl1.C55004v1;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86301e;
import ei3.C86522b;
import java.util.LinkedList;
import p565ir.C33392p;
import te3.C64239aq2;
import te3.C64328dv0;
import te3.C64404gv0;

@C86522b
/* renamed from: hr.j0 */
public class C60093j0 extends C86301e implements C33392p {
    /* renamed from: Bf */
    public void mo59120Bf(Intent intent) {
        if (WeChatEnvironment.hasDebugger() || WeChatEnvironment.isMonkeyEnv()) {
            String stringExtra = intent.getStringExtra("stream_id");
            C64404gv0 gv02 = new C64404gv0();
            gv02.f183359f = stringExtra;
            ((C55004v1) FinderLiveService.f159376d.mo77630e(C55004v1.class)).f154439j.postValue(gv02);
            return;
        }
        Log.m105920e("MicroMsg.FinderLiveShellService", "Environment denied: not coolassist or monkey env");
    }

    public void No0(Intent intent) {
        if (WeChatEnvironment.hasDebugger() || WeChatEnvironment.isMonkeyEnv()) {
            try {
                C104289g gVar = new C104289g(intent.getStringExtra("info"));
                C64328dv0 dv02 = new C64328dv0();
                dv02.f182858d = gVar.optBoolean("can_display", false);
                dv02.f182860f = gVar.optDouble(TPReportKeys.Common.COMMON_NETWORK_SPEED);
                dv02.f182859e = gVar.optLong("resource_id");
                ((C54985m) FinderLiveService.f159376d.mo77630e(C54985m.class)).mo75951e3(dv02);
            } catch (C79923f unused) {
            }
        } else {
            Log.m105920e("MicroMsg.FinderLiveShellService", "Environment denied: not coolassist or monkey env");
        }
    }

    /* renamed from: wI */
    public void mo59122wI(Intent intent) {
        Class cls = C55004v1.class;
        if (WeChatEnvironment.hasDebugger() || WeChatEnvironment.isMonkeyEnv()) {
            try {
                C26827e eVar = new C26827e(intent.getStringExtra("stream_data"));
                LinkedList linkedList = new LinkedList();
                LinkedList<C64239aq2> linkedList2 = ((C55004v1) FinderLiveService.f159376d.mo77630e(cls)).f154438i;
                for (int i = 0; i < eVar.length(); i++) {
                    String optString = eVar.optJSONObject(i).optString("stream_id");
                    for (int i2 = 0; i2 < linkedList2.size(); i2++) {
                        if (linkedList2.get(i2).f182132e.equals(optString)) {
                            linkedList.add(linkedList2.get(i2));
                        }
                    }
                }
                ((C55004v1) FinderLiveService.f159376d.mo77630e(cls)).f154440n.postValue(linkedList);
            } catch (C79923f unused) {
            }
        } else {
            Log.m105920e("MicroMsg.FinderLiveShellService", "Environment denied: not coolassist or monkey env");
        }
    }
}
