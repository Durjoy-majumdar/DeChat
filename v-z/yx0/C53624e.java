package yx0;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.brandservice.api.TransferRequestInfo;
import com.tencent.p014mm.plugin.brandservice.api.TransferResultInfo;
import ex0.C45699g;
import te3.C52278zk2;

/* renamed from: yx0.e */
public final class C53624e implements C45699g {

    /* renamed from: a */
    public final /* synthetic */ C1256g<TransferResultInfo> f150665a;

    public C53624e(C1256g<TransferResultInfo> gVar) {
        this.f150665a = gVar;
    }

    /* renamed from: a */
    public boolean mo66580a(TransferRequestInfo transferRequestInfo) {
        return false;
    }

    /* renamed from: b */
    public void mo66581b(int i, String str, C52278zk2 zk22) {
        C1256g<TransferResultInfo> gVar = this.f150665a;
        if (gVar != null) {
            TransferResultInfo transferResultInfo = new TransferResultInfo();
            transferResultInfo.f109036d = i;
            transferResultInfo.f109037e = str;
            transferResultInfo.f109038f = zk22;
            gVar.mo894a(transferResultInfo);
        }
    }
}
