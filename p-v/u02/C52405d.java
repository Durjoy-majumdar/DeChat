package u02;

import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.kinda.gen.UseCaseCallback;
import com.tencent.p014mm.plugin.honey_pay.p063ui.HoneyPayCardManagerUI;

/* renamed from: u02.d */
public class C52405d implements UseCaseCallback {

    /* renamed from: a */
    public final /* synthetic */ HoneyPayCardManagerUI f146481a;

    public C52405d(HoneyPayCardManagerUI honeyPayCardManagerUI) {
        this.f146481a = honeyPayCardManagerUI;
    }

    public void call(ITransmitKvData iTransmitKvData) {
        this.f146481a.finish();
    }
}
