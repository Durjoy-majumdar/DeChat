package com.tencent.p014mm.plugin.webwx.p129ui;

import android.app.Dialog;
import android.view.View;
import com.tencent.p014mm.autogen.events.UpdateExtDeviceEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C97625j3;
import fa3.C8003e;
import j20.C117292a;
import java.util.ArrayList;
import p214om.C11502f;

/* renamed from: com.tencent.mm.plugin.webwx.ui.l */
public class C6628l implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Dialog f23910d;

    public C6628l(WebWXPopupUnlockUI webWXPopupUnlockUI, Dialog dialog) {
        this.f23910d = dialog;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webwx/ui/WebWXPopupUnlockUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C97625j3.m125815e().mo123460f(new C8003e(2, 1));
        Log.m105918d("MicroMsg.WebWxPopUnlockUI", "doScene netSceneExtDeviceControl : UNLOCK");
        ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93138CZ(1);
        Log.m105918d("MicroMsg.WebWxPopUnlockUI", "trigger netSceneSync notify");
        this.f23910d.dismiss();
        new UpdateExtDeviceEvent().publish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/webwx/ui/WebWXPopupUnlockUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
