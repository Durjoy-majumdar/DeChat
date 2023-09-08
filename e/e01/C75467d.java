package e01;

import android.os.Bundle;
import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import fy3.C32226l;
import gy3.C87412m;
import h01.C107987b;
import i01.C76253c;
import rx3.C13598b0;

/* renamed from: e01.d */
public final class C75467d implements MMHandler.Callback {

    /* renamed from: d */
    public final /* synthetic */ C107075a f221780d;

    public C75467d(C107075a aVar) {
        this.f221780d = aVar;
    }

    public final boolean handleMessage(Message message) {
        C76253c cVar = C76253c.REMOTE_SERVICE_REMOVED;
        C87412m.m108594g(message, LocaleUtil.ITALIAN);
        Bundle data = message.getData();
        if (data != null) {
            C107075a aVar = this.f221780d;
            byte b = data.getByte("data_type");
            byte[] byteArray = data.getByteArray("data_data");
            boolean z = false;
            Integer num = null;
            if (!(byteArray != null)) {
                byteArray = null;
            }
            if (byteArray != null) {
                if (b == 1) {
                    Log.m105924i("MicroMsg.ScreenCastManager", "onVideoFrame Ready");
                    C107987b bVar = aVar.f320511q;
                    if (bVar != null) {
                        Integer valueOf = Integer.valueOf(bVar.mo158377b(b, byteArray, (byte) 0));
                        if (valueOf.intValue() != 0) {
                            z = true;
                        }
                        if (z) {
                            num = valueOf;
                        }
                        if (num != null) {
                            num.intValue();
                            aVar.f320512r = cVar;
                            C32226l<? super C76253c, C13598b0> lVar = aVar.f320513s;
                            if (lVar != null) {
                                lVar.invoke(cVar);
                            }
                        }
                    }
                } else if (b == 2) {
                    Log.m105924i("MicroMsg.ScreenCastManager", "onAudioFrame Ready");
                    C107987b bVar2 = aVar.f320511q;
                    if (bVar2 != null) {
                        Integer valueOf2 = Integer.valueOf(bVar2.mo158377b(b, byteArray, (byte) 0));
                        if (valueOf2.intValue() != 0) {
                            z = true;
                        }
                        if (z) {
                            num = valueOf2;
                        }
                        if (num != null) {
                            num.intValue();
                            aVar.f320512r = cVar;
                            C32226l<? super C76253c, C13598b0> lVar2 = aVar.f320513s;
                            if (lVar2 != null) {
                                lVar2.invoke(cVar);
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
