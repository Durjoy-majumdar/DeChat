package cs0;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: cs0.d */
public final class C45158d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C45181m f122443d;

    /* renamed from: e */
    public final /* synthetic */ LinearLayoutManager f122444e;

    public C45158d(C45181m mVar, LinearLayoutManager linearLayoutManager) {
        this.f122443d = mVar;
        this.f122444e = linearLayoutManager;
    }

    public final void run() {
        C45181m mVar = this.f122443d;
        boolean z = true;
        if (this.f122444e.mo16958D() < this.f122443d.getItemCount() - 1) {
            z = false;
        }
        mVar.getClass();
        Log.m105924i("MicroMsg.AppBrandUserInfoRevokePage", "configManageArea, fixAtScreenBottom: " + z);
        C45179k kVar = mVar.f122488e;
        if (kVar == null) {
            Log.m105924i("MicroMsg.AppBrandUserInfoRevokePage", "configManageArea, curUsageInfo is null");
            return;
        }
        mVar.f122490g = Boolean.valueOf(z);
        mVar.notifyItemChanged(kVar.f122485a - 1);
    }
}
