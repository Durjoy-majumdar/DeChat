package com.tencent.p014mm.plugin.textstatus.third;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import kotlin.Metadata;
import qy2.C63349b0;
import rx3.C13598b0;
import uz2.C65489g0;
import uz2.C65492p;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/textstatus/third/TextStatusActionTask$jumpSetStatus$setStatusCallback$1", "Landroid/os/ResultReceiver;", "plugin-textstatus_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.textstatus.third.TextStatusActionTask$jumpSetStatus$setStatusCallback$1 */
public final class TextStatusActionTask$jumpSetStatus$setStatusCallback$1 extends ResultReceiver {

    /* renamed from: d */
    public final /* synthetic */ TextStatusActionTask f164585d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextStatusActionTask$jumpSetStatus$setStatusCallback$1(TextStatusActionTask textStatusActionTask) {
        super((Handler) null);
        this.f164585d = textStatusActionTask;
    }

    public void onReceiveResult(int i, Bundle bundle) {
        byte[] byteArray;
        super.onReceiveResult(i, bundle);
        int i2 = i == -1 ? 0 : 2;
        C63349b0 b0Var = this.f164585d.f206677e;
        if (b0Var != null) {
            C65489g0 g0Var = new C65489g0();
            g0Var.f188443d = 2;
            C65492p pVar = new C65492p();
            if (!(bundle == null || (byteArray = bundle.getByteArray("select_status_info")) == null)) {
                pVar.parseFrom(byteArray);
            }
            g0Var.f188444e = pVar;
            C13598b0 b0Var2 = C13598b0.f38549a;
            b0Var.onFinishAction(i2, "", g0Var);
        }
    }
}
