package com.tencent.p014mm.plugin.facedetect.model;

import au1.C0222b;
import com.tencent.p014mm.autogen.events.GetIsSupportFaceEvent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import h81.C32735h;

/* renamed from: com.tencent.mm.plugin.facedetect.model.n */
public class C2269n extends IStaticListener<GetIsSupportFaceEvent> {
    public boolean callback(IEvent iEvent) {
        GetIsSupportFaceEvent getIsSupportFaceEvent = (GetIsSupportFaceEvent) iEvent;
        boolean z = false;
        if (getIsSupportFaceEvent == null) {
            Log.m105920e("MicroMsg.FaceGetIsSupportListener", "hy: event is null");
            return false;
        }
        C105227i iVar = C105227i.INSTANCE;
        boolean hasSystemFeature = MMApplicationContext.getContext().getPackageManager().hasSystemFeature("android.hardware.camera.front");
        boolean c = C85191v.m105064c(true);
        if (!hasSystemFeature) {
            GetIsSupportFaceEvent.C1079a aVar = getIsSupportFaceEvent.f9294d;
            aVar.f9296b = 10001;
            aVar.f9297c = "No front camera";
            C0222b.m166e(10001, "No front camera");
        } else if (!c) {
            GetIsSupportFaceEvent.C1079a aVar2 = getIsSupportFaceEvent.f9294d;
            aVar2.f9296b = 10002;
            aVar2.f9297c = "No necessary model found";
            C0222b.m166e(10002, "No necessary model found");
        } else {
            if (!(!C85875k4.m106210y() || ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_face_flash_enable_pad, true))) {
                GetIsSupportFaceEvent.C1079a aVar3 = getIsSupportFaceEvent.f9294d;
                aVar3.f9296b = 10003;
                aVar3.f9297c = "Not support pad";
                C0222b.m166e(10004, "Not support pad");
            } else {
                getIsSupportFaceEvent.f9294d.f9297c = "ok";
                C0222b.m166e(0, "ok");
            }
        }
        GetIsSupportFaceEvent.C1079a aVar4 = getIsSupportFaceEvent.f9294d;
        aVar4.f9298d = 1;
        if (hasSystemFeature && c) {
            z = true;
        }
        aVar4.f9295a = z;
        return true;
    }
}
