package com.tencent.p014mm.plugin.facedetect.model;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.autogen.events.RequestStartFaceManageEvent;
import com.tencent.p014mm.plugin.facedetect.p045ui.SettingsFacePrintManagerUI;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.facedetect.model.t */
public class C68887t extends IStaticListener<RequestStartFaceManageEvent> {
    public boolean callback(IEvent iEvent) {
        RequestStartFaceManageEvent requestStartFaceManageEvent = (RequestStartFaceManageEvent) iEvent;
        boolean z = false;
        if (requestStartFaceManageEvent == null) {
            Log.m105920e("MicroMsg.FaceStartManageListener", "hy: event is null");
            return false;
        }
        Context context = requestStartFaceManageEvent.f193913d.f193915a;
        RequestStartFaceManageEvent.C67780b bVar = requestStartFaceManageEvent.f193914e;
        C105227i iVar = C105227i.INSTANCE;
        Log.m105924i("MicroMsg.FaceDetectManager", "hy: start face manage process");
        if (context == null) {
            Log.m105920e("MicroMsg.FaceDetectManager", "hy: context is null. abort");
        } else if (!iVar.mo149595b(true)) {
            Log.m105928w("MicroMsg.FaceDetectManager", "hy: not support face detect. abort");
        } else {
            Intent intent = new Intent(context, SettingsFacePrintManagerUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/facedetect/model/FaceDetectManager", "startFaceManageProcess", "(Landroid/content/Context;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/facedetect/model/FaceDetectManager", "startFaceManageProcess", "(Landroid/content/Context;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            z = true;
        }
        bVar.f193916a = z;
        return true;
    }
}
