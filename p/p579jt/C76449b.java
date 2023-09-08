package p579jt;

import com.tencent.p014mm.autogen.events.SendImageMsgEvent;
import com.tencent.p014mm.modelimage.C68129u;
import com.tencent.p014mm.modelimage.C68136w;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.modelimage.C92837k0;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86013q1;

/* renamed from: jt.b */
public class C76449b extends IStaticListener<SendImageMsgEvent> {
    public boolean callback(IEvent iEvent) {
        C72963f4 f4Var = ((SendImageMsgEvent) iEvent).f193926d.f193927a;
        C68129u Ax0 = C92837k0.Ax0();
        Ax0.getClass();
        C92836k vP = C92837k0.Bx0().mo127200vP(f4Var.mo108768t(), f4Var.getMsgId());
        vP.f267389p = 0;
        vP.f267363F = true;
        C92837k0.Bx0().Dx0(Long.valueOf(vP.f267374a), vP);
        boolean p = vP.mo127145p();
        String TY = C92837k0.Bx0().mo127174TY(vP.f267378e, "", "", true);
        if (TY == null || TY.equals("") || !C86013q1.m106450k(TY)) {
            Log.m105920e("MicroMsg.ImgService", "sendMsgImage: filePath is null or empty");
        } else {
            MMHandlerThread.postToMainThread(new C68136w(Ax0, vP, p ? 1 : 0));
        }
        return false;
    }
}
