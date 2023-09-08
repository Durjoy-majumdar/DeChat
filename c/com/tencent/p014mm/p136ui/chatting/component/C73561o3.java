package com.tencent.p014mm.p136ui.chatting.component;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsimple.C68139d0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import eb0.C97625j3;

/* renamed from: com.tencent.mm.ui.chatting.component.o3 */
public class C73561o3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C72963f4 f216061d;

    /* renamed from: e */
    public final /* synthetic */ View f216062e;

    /* renamed from: f */
    public final /* synthetic */ C73572p3 f216063f;

    /* renamed from: com.tencent.mm.ui.chatting.component.o3$a */
    public class C73562a implements Runnable {
        public C73562a() {
        }

        public void run() {
            C73561o3.this.f216062e.invalidate();
        }
    }

    public C73561o3(C73572p3 p3Var, C72963f4 f4Var, View view) {
        this.f216063f = p3Var;
        this.f216061d = f4Var;
        this.f216062e = view;
    }

    public void run() {
        Log.m105925i("MicroMsg.NewXmlSysMsgComponent", "[handleClickInvokeMessageSysText] is over time to delete invokeMsg:%s", Long.valueOf(this.f216061d.getMsgId()));
        C68139d0.m80543k1(this.f216063f.f215752d.mo91572m().getString(C0966R.string.bb8), "", this.f216061d, "");
        ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(this.f216061d.getMsgId(), this.f216061d);
        MMHandlerThread.postToMainThread(new C73562a());
    }
}
