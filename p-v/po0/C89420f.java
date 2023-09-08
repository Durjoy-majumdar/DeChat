package po0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import p975hd.C87478c;

/* renamed from: po0.f */
public class C89420f implements C87478c {

    /* renamed from: a */
    public C87478c.C87479a f257443a;

    /* renamed from: a */
    public void mo110144a(C87478c.C87479a aVar) {
        this.f257443a = aVar;
    }

    /* renamed from: b */
    public void mo110145b(int i, int i2) {
        Log.m105925i("MicroMsg.SameLayer.AppBrandVideoErrorHandler", "onVideoError(%d, %d)", Integer.valueOf(i), Integer.valueOf(i2));
        C87478c.C87479a aVar = this.f257443a;
        if (aVar != null) {
            String str = "MEDIA_ERR_SRC_NOT_SUPPORTED";
            if (i == -1024) {
                str = "VIDEO_ERROR";
            } else if (i == -20000) {
                str = "MEDIA_ERR_DRM";
            } else if (!(i == -1010 || i == -1007)) {
                str = (i != -1004 ? NetStatusUtil.isConnected(MMApplicationContext.getContext()) : NetStatusUtil.isConnected(MMApplicationContext.getContext())) ? "MEDIA_ERR_DECODE" : "MEDIA_ERR_NETWORK";
            }
            aVar.mo18001a(str, i, i2);
        }
    }
}
