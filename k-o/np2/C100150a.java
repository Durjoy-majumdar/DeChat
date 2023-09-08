package np2;

import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p104ad.remote.ipc.impl.IPCRemoteProxy;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.remoteservice.C96905d;
import com.tencent.p014mm.sdk.platformtools.Log;
import op2.C100371a;
import op2.C100372b;
import pp2.C62489a;
import qp2.C101232a;

/* renamed from: np2.a */
public class C100150a {

    /* renamed from: a */
    public C100371a f293326a;

    /* renamed from: b */
    public C100372b f293327b;

    /* renamed from: c */
    public C96905d f293328c;

    /* renamed from: a */
    public C62489a mo139438a() {
        SnsMethodCalculate.markStartTimeMs("build", "com.tencent.mm.plugin.sns.ad.remote.IPCRequestBuilder");
        try {
            C62489a b = mo139439b();
            SnsMethodCalculate.markEndTimeMs("build", "com.tencent.mm.plugin.sns.ad.remote.IPCRequestBuilder");
            return b;
        } catch (Throwable unused) {
            Log.m105920e("SnsAd.IPCRequestBuilder", "there is something invalid in build!");
            SnsMethodCalculate.markEndTimeMs("build", "com.tencent.mm.plugin.sns.ad.remote.IPCRequestBuilder");
            return null;
        }
    }

    /* renamed from: b */
    public final C62489a mo139439b() {
        C100372b bVar;
        SnsMethodCalculate.markStartTimeMs("buildInner", "com.tencent.mm.plugin.sns.ad.remote.IPCRequestBuilder");
        if (this.f293328c == null) {
            C96905d remoteServiceProxy = AdLandingPagesProxy.getInstance().getRemoteServiceProxy();
            this.f293328c = remoteServiceProxy;
            if (remoteServiceProxy == null) {
                Log.m105928w("SnsAd.IPCRequestBuilder", "the remote service proxy is null");
                SnsMethodCalculate.markEndTimeMs("buildInner", "com.tencent.mm.plugin.sns.ad.remote.IPCRequestBuilder");
                return null;
            }
        }
        C100371a aVar = this.f293326a;
        if (aVar == null || this.f293327b != null) {
            if (aVar == null && (bVar = this.f293327b) != null && (bVar instanceof C100371a)) {
                this.f293326a = (C100371a) bVar;
            }
        } else if (aVar instanceof C100372b) {
            this.f293327b = (C100372b) aVar;
        }
        C101232a aVar2 = new C101232a();
        C100371a aVar3 = this.f293326a;
        SnsMethodCalculate.markStartTimeMs("setClientCall", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        aVar2.f296418b = aVar3;
        SnsMethodCalculate.markEndTimeMs("setClientCall", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        C100372b bVar2 = this.f293327b;
        SnsMethodCalculate.markStartTimeMs("setServerCall", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        aVar2.f296417a = bVar2;
        SnsMethodCalculate.markEndTimeMs("setServerCall", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        IPCRemoteProxy iPCRemoteProxy = new IPCRemoteProxy(this.f293328c, aVar2);
        SnsMethodCalculate.markStartTimeMs("setRemoteProxy", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        aVar2.f296419c = iPCRemoteProxy;
        SnsMethodCalculate.markEndTimeMs("setRemoteProxy", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        SnsMethodCalculate.markEndTimeMs("buildInner", "com.tencent.mm.plugin.sns.ad.remote.IPCRequestBuilder");
        return aVar2;
    }

    /* renamed from: c */
    public C100150a mo139440c(C100371a aVar) {
        SnsMethodCalculate.markStartTimeMs("clientCall", "com.tencent.mm.plugin.sns.ad.remote.IPCRequestBuilder");
        this.f293326a = aVar;
        SnsMethodCalculate.markEndTimeMs("clientCall", "com.tencent.mm.plugin.sns.ad.remote.IPCRequestBuilder");
        return this;
    }

    /* renamed from: d */
    public C100150a mo139441d(C100372b bVar) {
        SnsMethodCalculate.markStartTimeMs("serverCall", "com.tencent.mm.plugin.sns.ad.remote.IPCRequestBuilder");
        this.f293327b = bVar;
        SnsMethodCalculate.markEndTimeMs("serverCall", "com.tencent.mm.plugin.sns.ad.remote.IPCRequestBuilder");
        return this;
    }
}
