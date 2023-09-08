package p284zb;

import android.content.res.AssetFileDescriptor;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: zb.d$$k */
public class d$$k extends d$$o {

    /* renamed from: k */
    public String f262565k;

    /* renamed from: l */
    public boolean f262566l;

    /* renamed from: m */
    public final /* synthetic */ Runnable f262567m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d$$k(C91633d dVar, String str, AssetFileDescriptor assetFileDescriptor, C91635f fVar, C91633d dVar2, boolean z, Runnable runnable) {
        super(str, assetFileDescriptor, fVar, dVar2, z, (d$$h) null);
        this.f262567m = runnable;
    }

    /* renamed from: a */
    public void mo117481a(C80669j.C80676g gVar) {
        super.mo117481a(gVar);
        if (!this.f262566l || !"Abort for empty source".equals(this.f262565k)) {
            super.mo114825b(this.f262565k);
        } else {
            this.f262567m.run();
        }
    }

    /* renamed from: b */
    public void mo114825b(String str) {
        Log.m105921e("Luggage.AppBrandMiniProgramServiceLogicImp", "execInternalInitScript with fd, onFailure:%s", str);
        this.f262565k = str;
        this.f262566l = true;
    }
}
