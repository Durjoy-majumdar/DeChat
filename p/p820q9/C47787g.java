package p820q9;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant;

/* renamed from: q9.g */
public final class C47787g {

    /* renamed from: a */
    public C47783c f128324a;

    /* renamed from: b */
    public Handler f128325b = new C47788h(this);

    /* renamed from: a */
    public final void mo72565a(int i) {
        Message obtainMessage = this.f128325b.obtainMessage(100);
        Bundle bundle = new Bundle();
        bundle.putInt(OpenSDKTool4Assistant.EXTRA_ERROR_CODE, i);
        obtainMessage.setData(bundle);
        this.f128325b.sendMessage(obtainMessage);
    }
}
