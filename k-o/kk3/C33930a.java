package kk3;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsimple.C68139d0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72972g4;
import eb0.C97625j3;

/* renamed from: kk3.a */
public class C33930a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C33931b f91636d;

    public C33930a(C33931b bVar) {
        this.f91636d = bVar;
    }

    public void run() {
        this.f91636d.f97419b.setType(10002);
        C68139d0.m80543k1(MMApplicationContext.getContext().getString(C0966R.string.bb8), "", this.f91636d.f97419b, "");
        ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(this.f91636d.f97419b.getMsgId(), this.f91636d.f97419b);
        Log.m105925i("MicroMsg.InvokeMessageNewXmlMsg", "checkExpired:%s", Long.valueOf(this.f91636d.f97419b.getMsgId()));
    }
}
