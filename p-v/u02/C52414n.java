package u02;

import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.kinda.gen.UseCaseCallback;
import com.tencent.p014mm.plugin.honey_pay.p063ui.HoneyPayProxyUI;

/* renamed from: u02.n */
public class C52414n implements UseCaseCallback {

    /* renamed from: a */
    public final /* synthetic */ HoneyPayProxyUI f146496a;

    public C52414n(HoneyPayProxyUI honeyPayProxyUI) {
        this.f146496a = honeyPayProxyUI;
    }

    public void call(ITransmitKvData iTransmitKvData) {
        this.f146496a.finish();
    }
}
