package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.UpdateAppBrandNotifyMessageEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.util.LinkedList;
import nj3.C76912y0;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import te3.C49795i34;
import te3.s65;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.q */
public class C74171q implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ LinkedList f217719d;

    /* renamed from: e */
    public final /* synthetic */ C74103m f217720e;

    public C74171q(C74103m mVar, LinkedList linkedList) {
        this.f217720e = mVar;
        this.f217719d = linkedList;
    }

    /* renamed from: a */
    public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        Log.m105919d("MicroMsg.ChattingItemAppBrandNotifyMsg", "setReceiveOff errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        C74103m mVar = this.f217720e;
        mVar.getClass();
        MMHandlerThread.postToMainThread(new C74161p(mVar));
        if (i == 0 && i2 == 0) {
            if (((C49795i34) cVar.f127056b.f127083a) == null) {
                Log.m105920e("MicroMsg.ChattingItemAppBrandNotifyMsg", "setReceiveOff failed, response is null!");
            } else {
                for (int i3 = 0; i3 < this.f217719d.size(); i3++) {
                    s65 s65 = (s65) this.f217719d.get(i3);
                    if (s65 == null) {
                        Log.m105928w("MicroMsg.ChattingItemAppBrandNotifyMsg", "scene end, item is null");
                    } else {
                        UpdateAppBrandNotifyMessageEvent updateAppBrandNotifyMessageEvent = new UpdateAppBrandNotifyMessageEvent();
                        UpdateAppBrandNotifyMessageEvent.C67804a aVar = updateAppBrandNotifyMessageEvent.f193976d;
                        aVar.f193977a = s65.f141352d;
                        aVar.f193978b = s65.f141353e == 0;
                        updateAppBrandNotifyMessageEvent.publish();
                    }
                }
            }
            return 0;
        }
        C76912y0.makeText((Context) this.f217720e.f217504w.mo91565f(), (int) C0966R.string.hdg, 0).show();
        return 0;
    }
}
