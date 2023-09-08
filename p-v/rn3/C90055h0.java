package rn3;

import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.p136ui.transmit.SendAppMessageWrapperUI;
import com.tencent.p014mm.plugin.base.stub.C85083h;
import wd3.C65953v0;

/* renamed from: rn3.h0 */
public class C90055h0 implements C65953v0 {

    /* renamed from: a */
    public final /* synthetic */ WXMediaMessage f258707a;

    /* renamed from: b */
    public final /* synthetic */ SendAppMessageWrapperUI f258708b;

    public C90055h0(SendAppMessageWrapperUI sendAppMessageWrapperUI, WXMediaMessage wXMediaMessage) {
        this.f258708b = sendAppMessageWrapperUI;
        this.f258707a = wXMediaMessage;
    }

    /* renamed from: a */
    public void mo23a(boolean z, String str, int i) {
        if (z) {
            SendAppMessageWrapperUI sendAppMessageWrapperUI = this.f258708b;
            WXMediaMessage wXMediaMessage = this.f258707a;
            int i2 = SendAppMessageWrapperUI.f250361A;
            sendAppMessageWrapperUI.mo119868L7(wXMediaMessage, str, i);
            C85083h.m104927p(26);
            return;
        }
        SendAppMessageWrapperUI.m106274H7(this.f258708b);
    }
}
