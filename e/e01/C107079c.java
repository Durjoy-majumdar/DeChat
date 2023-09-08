package e01;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.telephony.TelephonyManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import p182kk.C61104a;
import rx3.C13598b0;

/* renamed from: e01.c */
public final class C107079c extends C87413o implements C32226l<byte[], C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Context f320520d;

    /* renamed from: e */
    public final /* synthetic */ C107075a f320521e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107079c(Context context, C107075a aVar) {
        super(1);
        this.f320520d = context;
        this.f320521e = aVar;
    }

    public Object invoke(Object obj) {
        byte[] bArr = (byte[]) obj;
        C87412m.m108594g(bArr, "pcmData");
        if (!C61104a.m71641A() && !C61104a.m71642B(this.f320520d, false) && !C61104a.m71644D()) {
            TelephonyManager telephonyManager = (TelephonyManager) this.f320520d.getSystemService("phone");
            boolean z = true;
            if (!(2 == telephonyManager.getCallState() || 1 == telephonyManager.getCallState())) {
                z = false;
            }
            if (!z) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                C87412m.m108593f(copyOf, "copyOf(this, newSize)");
                System.arraycopy(bArr, 0, copyOf, 0, bArr.length);
                Bundle bundle = new Bundle();
                bundle.putByte("data_type", (byte) 2);
                bundle.putByteArray("data_data", copyOf);
                MMHandler mMHandler = this.f320521e.f320504j;
                if (mMHandler != null) {
                    Message message = new Message();
                    message.setData(bundle);
                    mMHandler.sendMessage(message);
                }
                return C13598b0.f38549a;
            }
        }
        Log.m105920e("MicroMsg.ScreenCastManager", "current is in voip do not allow to send voice ");
        return C13598b0.f38549a;
    }
}
