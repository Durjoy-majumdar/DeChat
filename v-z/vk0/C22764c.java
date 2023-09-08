package vk0;

import com.tencent.p014mm.plugin.appbrand.jsapi.camera.AppBrandCameraView;
import com.tencent.p014mm.plugin.appbrand.utils.C84800z1;
import com.tencent.p014mm.plugin.mmsight.api.MMSightRecordView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.nio.ByteBuffer;

/* renamed from: vk0.c */
public class C22764c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C84800z1.C84801a f65475d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandCameraView f65476e;

    public C22764c(AppBrandCameraView appBrandCameraView, C84800z1.C84801a aVar) {
        this.f65476e = appBrandCameraView;
        this.f65475d = aVar;
    }

    public void run() {
        Log.m105925i("MicroMsg.AppBrandCameraView", "currentOrientationRecord %s, lateOrientationState: %s", this.f65475d.toString(), this.f65476e.f49279T.toString());
        if (Util.ticksToNow(this.f65476e.f49277R) >= 750 && this.f65476e.f49280U.get() && this.f65475d == this.f65476e.f49279T) {
            Log.m105924i("MicroMsg.AppBrandCameraView", "reopen camera");
            AppBrandCameraView appBrandCameraView = this.f65476e;
            MMSightRecordView mMSightRecordView = appBrandCameraView.f49265E;
            appBrandCameraView.release();
            this.f65476e.mo22088a();
            AppBrandCameraView appBrandCameraView2 = this.f65476e;
            C111546e eVar = appBrandCameraView2.f49274N;
            if (eVar != null) {
                MMSightRecordView mMSightRecordView2 = appBrandCameraView2.f49265E;
                Log.m105925i("MicroMsg.FrameDataCallbackHelper", "rebindRecordView, bufferId: %d", Integer.valueOf(eVar.f333968d));
                if (!eVar.f333967c) {
                    Log.m105924i("MicroMsg.FrameDataCallbackHelper", "needn't callback");
                } else if (eVar.f333968d == Integer.MIN_VALUE) {
                    Log.m105924i("MicroMsg.FrameDataCallbackHelper", "buffer id illegal");
                } else if (eVar.f333966b == null) {
                    Log.m105928w("MicroMsg.FrameDataCallbackHelper", "rebindRecordView mSharedBufferAddon null");
                } else {
                    if (mMSightRecordView != null) {
                        mMSightRecordView.mo24026a((ByteBuffer) null, (MMSightRecordView.C18936f) null);
                    }
                    if (mMSightRecordView2 != null) {
                        ByteBuffer S = eVar.f333966b.mo115398S(eVar.f333968d);
                        if (S != null) {
                            mMSightRecordView2.mo24026a(S, eVar);
                        } else {
                            Log.m105928w("MicroMsg.FrameDataCallbackHelper", "buffer is null");
                        }
                    }
                }
            }
        }
        this.f65476e.f49278S = false;
    }
}
