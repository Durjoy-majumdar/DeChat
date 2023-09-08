package com.tencent.p014mm.openim.model;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, mo182094d2 = {"Lcom/tencent/mm/openim/model/OpenImKefuStartChattingResultReceiver;", "Landroid/os/ResultReceiver;", "a", "common-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.openim.model.OpenImKefuStartChattingResultReceiver */
public final class OpenImKefuStartChattingResultReceiver extends ResultReceiver {

    /* renamed from: d */
    public final C40388a f108530d;

    /* renamed from: com.tencent.mm.openim.model.OpenImKefuStartChattingResultReceiver$a */
    public interface C40388a {
        /* renamed from: a */
        void mo63102a(Bundle bundle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenImKefuStartChattingResultReceiver(Handler handler, C40388a aVar) {
        super(handler);
        C87412m.m108594g(handler, "handler");
        C87412m.m108594g(aVar, "callback");
        this.f108530d = aVar;
    }

    public void onReceiveResult(int i, Bundle bundle) {
        this.f108530d.mo63102a(bundle);
    }
}
