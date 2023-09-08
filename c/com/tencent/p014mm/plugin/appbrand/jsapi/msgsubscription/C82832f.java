package com.tencent.p014mm.plugin.appbrand.jsapi.msgsubscription;

import br0.C79774c;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.msgsubscription.SubscribeMsgRequestDialogUiData;
import com.tencent.p014mm.msgsubscription.SubscribeMsgRequestResult;
import com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem;
import com.tencent.p014mm.plugin.appbrand.jsapi.msgsubscription.GetSubscribeMsgListExecutor;
import com.tencent.p014mm.plugin.appbrand.jsapi.msgsubscription.JsApiRequestSubscribeMessage;
import gt0.C87362k;
import gt0.C87370k0;
import gt0.C87372l0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import p284zb.C91635f;
import p963fc.C86812g;
import sx3.C110818d0;
import zd0.C23466p;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.f */
public final class C82832f implements GetSubscribeMsgListExecutor.C17906b {

    /* renamed from: a */
    public final /* synthetic */ JsApiRequestSubscribeMessage.SubscribeMsgTask f242248a;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.f$a */
    public static final class C82833a implements C87372l0 {

        /* renamed from: a */
        public final /* synthetic */ JsApiRequestSubscribeMessage.SubscribeMsgTask f242249a;

        /* renamed from: b */
        public final /* synthetic */ C87372l0 f242250b;

        public C82833a(JsApiRequestSubscribeMessage.SubscribeMsgTask subscribeMsgTask, C87372l0 l0Var) {
            this.f242249a = subscribeMsgTask;
            this.f242250b = l0Var;
        }

        /* renamed from: a */
        public void mo22185a(C87370k0 k0Var) {
            C86812g H0;
            C87362k kVar;
            C91635f fVar = this.f242249a.f242236h;
            if (!(fVar == null || (H0 = fVar.getRuntime()) == null || (kVar = H0.f238157v) == null)) {
                kVar.mo121779c(this);
            }
            this.f242250b.mo22185a(k0Var);
        }
    }

    public C82832f(JsApiRequestSubscribeMessage.SubscribeMsgTask subscribeMsgTask) {
        this.f242248a = subscribeMsgTask;
    }

    /* renamed from: a */
    public void mo22175a(int i, int i2, String str, SubscribeMsgRequestResult subscribeMsgRequestResult) {
        C87412m.m108594g(str, "errMsg");
        this.f242248a.mo17818a(i, i2, str, subscribeMsgRequestResult);
    }

    /* renamed from: b */
    public void mo22176b(C87370k0 k0Var) {
        C86812g H0;
        C87362k kVar;
        C79774c cVar;
        C87412m.m108594g(k0Var, "dialog");
        C91635f fVar = this.f242248a.f242236h;
        boolean z = false;
        if (!(fVar == null || (cVar = fVar.f240292z) == null || !cVar.isLargeScreenWindow())) {
            z = true;
        }
        if (z) {
            C23466p pVar = k0Var instanceof C23466p ? (C23466p) k0Var : null;
            if (pVar != null) {
                pVar.mo36944g(1);
            }
        }
        C91635f fVar2 = this.f242248a.f242236h;
        if (fVar2 != null && (H0 = fVar2.getRuntime()) != null && (kVar = H0.f238157v) != null) {
            kVar.mo121778b(k0Var);
        }
    }

    /* renamed from: c */
    public void mo22177c(C87370k0 k0Var, C87372l0 l0Var) {
        C86812g H0;
        C87362k kVar;
        C86812g H02;
        C87362k kVar2;
        C87412m.m108594g(k0Var, "dialog");
        C87412m.m108594g(l0Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C91635f fVar = this.f242248a.f242236h;
        if (!(fVar == null || (H02 = fVar.getRuntime()) == null || (kVar2 = H02.f238157v) == null)) {
            kVar2.mo121780d(new C82833a(this.f242248a, l0Var));
        }
        C91635f fVar2 = this.f242248a.f242236h;
        if (fVar2 != null && (H0 = fVar2.getRuntime()) != null && (kVar = H0.f238157v) != null) {
            kVar.mo121777a(k0Var);
        }
    }

    /* renamed from: d */
    public void mo22178d(String str, List<SubscribeMsgTmpItem> list, SubscribeMsgRequestDialogUiData subscribeMsgRequestDialogUiData) {
        C87412m.m108594g(str, "username");
        C87412m.m108594g(list, "items");
        SubscribeMsgExecutor subscribeMsgExecutor = this.f242248a.f242240o;
        if (subscribeMsgExecutor != null) {
            List<T> B0 = C110818d0.m150900B0(list);
            ((ArrayList) subscribeMsgExecutor.f242246h).clear();
            ((ArrayList) subscribeMsgExecutor.f242246h).addAll(B0);
        }
        JsApiRequestSubscribeMessage.SubscribeMsgTask subscribeMsgTask = this.f242248a;
        SubscribeMsgExecutor subscribeMsgExecutor2 = subscribeMsgTask.f242240o;
        if (subscribeMsgExecutor2 != null) {
            SubscribeMsgRequestResult subscribeMsgRequestResult = subscribeMsgTask.f242235g;
            subscribeMsgExecutor2.f242245g = subscribeMsgRequestResult != null ? subscribeMsgRequestResult.f49010q : null;
        }
        if (subscribeMsgExecutor2 != null) {
            subscribeMsgExecutor2.f242243e = subscribeMsgRequestDialogUiData;
        }
        subscribeMsgTask.f242234f = 1;
        subscribeMsgTask.mo93654b();
    }
}
