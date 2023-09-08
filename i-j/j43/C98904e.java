package j43;

import com.tencent.p014mm.autogen.events.VoipCSNotifyEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import java.io.IOException;
import k43.C108886d;
import k43.C108888g;
import te3.hu4;
import te3.ou4;

/* renamed from: j43.e */
public class C98904e extends IStaticListener<VoipCSNotifyEvent> {
    public boolean callback(IEvent iEvent) {
        VoipCSNotifyEvent voipCSNotifyEvent = (VoipCSNotifyEvent) iEvent;
        if ((voipCSNotifyEvent instanceof VoipCSNotifyEvent) && C86709a0.m107522a()) {
            C108888g xx02 = C108886d.xx0();
            byte[] bArr = voipCSNotifyEvent.f265257d.f265258a;
            xx02.getClass();
            if (!(bArr == null || bArr.length == 0)) {
                int length = bArr.length - 1;
                byte[] bArr2 = new byte[length];
                System.arraycopy(bArr, 1, bArr2, 0, length);
                hu4 hu4 = new hu4();
                try {
                    hu4.parseFrom(bArr2);
                    Log.m105924i("MicroMsg.voipcs.VoipCSService", "notify status = " + hu4.f298368h + ",notifySeq = " + xx02.f326112e);
                    ou4 ou4 = new ou4();
                    ou4.f139372d = hu4.f298364d;
                    ou4.f139373e = hu4.f298365e;
                    ou4.f139374f = hu4.f298366f;
                    ou4.f139376h = hu4.f298368h;
                    ou4.f139377i = hu4.f298369i;
                    ou4.f139378j = hu4.f298370j;
                    ou4.f139375g = hu4.f298367g;
                    xx02.mo160020a(ou4);
                } catch (IOException e) {
                    Log.m105921e("MicroMsg.voipcs.VoipCSService", "csNotify.parseFrom content error!", e);
                }
            }
        }
        return false;
    }
}
