package jl2;

import com.tencent.p014mm.autogen.events.DecodeQRCodeInImageSyncEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.qbar.C19934c;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: jl2.d */
public class C98949d extends IStaticListener<DecodeQRCodeInImageSyncEvent> {
    public boolean callback(IEvent iEvent) {
        DecodeQRCodeInImageSyncEvent decodeQRCodeInImageSyncEvent = (DecodeQRCodeInImageSyncEvent) iEvent;
        if (Util.isNullOrNil(decodeQRCodeInImageSyncEvent.f264662d.f264664a)) {
            Log.m105920e("DECODE_QRCODE_IN_IMAGE_HANDLER", "[-] img path is null or empty.");
            decodeQRCodeInImageSyncEvent.f264663e.f264665a = null;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            String[][] strArr = {null};
            C19934c.f56868h.mo27315b(MMApplicationContext.getContext(), System.currentTimeMillis(), decodeQRCodeInImageSyncEvent.f264662d.f264664a, new C98948c(this, strArr, countDownLatch));
            try {
                countDownLatch.await(5, TimeUnit.SECONDS);
            } catch (Throwable th) {
                Log.printErrStackTrace("DECODE_QRCODE_IN_IMAGE_HANDLER", th, "[-] Timeout when wait for decoding.", new Object[0]);
                DecodeQRCodeInImageSyncEvent.C92470b bVar = decodeQRCodeInImageSyncEvent.f264663e;
                bVar.f264665a = new String[]{"<timeout>"};
                bVar.f264666b = true;
            }
            synchronized (strArr) {
                String[] strArr2 = strArr[0];
                if (strArr2 == null || strArr2.length <= 0) {
                    decodeQRCodeInImageSyncEvent.f264663e.f264665a = null;
                } else {
                    decodeQRCodeInImageSyncEvent.f264663e.f264665a = strArr2;
                }
            }
        }
        return false;
    }
}
