package com.tencent.p014mm.plugin.wallet_core.utils;

import android.util.Base64;
import com.tencent.kinda.gen.ITransmitKvData;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import ie3.C76324c;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.wallet_core.utils.o */
public final class C72502o {

    /* renamed from: a */
    public static final C72502o f210909a = new C72502o();

    /* renamed from: com.tencent.mm.plugin.wallet_core.utils.o$a */
    public enum C72503a {
        Continue(0),
        Exit(3);
        

        /* renamed from: d */
        public final int f210913d;

        /* access modifiers changed from: public */
        C72503a(int i) {
            this.f210913d = i;
        }
    }

    /* renamed from: a */
    public final Long mo99911a(String str, C32227p<? super C72503a, ? super Long, C13598b0> pVar) {
        C87412m.m108594g(str, "base64Data");
        boolean z = false;
        byte[] decode = Base64.decode(str, 0);
        C87412m.m108593f(decode, "decode(base64Data, Base64.DEFAULT)");
        if (decode.length == 0) {
            z = true;
        }
        if (z) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ITransmitKvData create = ITransmitKvData.create();
        create.putBinary("half_page_view_data", decode);
        create.putLong("usecase_platform_session", currentTimeMillis);
        C76324c cVar = (C76324c) C86312j.m106911c(C76324c.class);
        if (cVar != null) {
            cVar.startUseCase("complianceHalfPage", create, new C72504p(pVar));
        }
        return Long.valueOf(currentTimeMillis);
    }
}
