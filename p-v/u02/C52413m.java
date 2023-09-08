package u02;

import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.kinda.gen.UseCaseCallback;
import com.tencent.p014mm.plugin.honey_pay.p063ui.HoneyPayProxyUI;

/* renamed from: u02.m */
public class C52413m implements UseCaseCallback {

    /* renamed from: a */
    public final /* synthetic */ HoneyPayProxyUI f146495a;

    public C52413m(HoneyPayProxyUI honeyPayProxyUI) {
        this.f146495a = honeyPayProxyUI;
    }

    public void call(ITransmitKvData iTransmitKvData) {
        this.f146495a.finish();
    }
}
