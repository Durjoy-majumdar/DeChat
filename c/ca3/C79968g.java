package ca3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import p975hd.C87478c;

/* renamed from: ca3.g */
public class C79968g implements C87478c {

    /* renamed from: a */
    public C87478c.C87479a f234239a;

    /* renamed from: a */
    public void mo110144a(C87478c.C87479a aVar) {
        this.f234239a = aVar;
    }

    /* renamed from: b */
    public void mo110145b(int i, int i2) {
        Log.m105925i("MicroMsg.AppBrand.SameLayer.AppBrandVideoErrorHandler", "onVideoError(%d, %d)", Integer.valueOf(i), Integer.valueOf(i2));
        C87478c.C87479a aVar = this.f234239a;
        if (aVar != null) {
            String str = "MEDIA_ERR_SRC_NOT_SUPPORTED";
            if (i == -1024) {
                str = "VIDEO_ERROR";
            } else if (!(i == -1010 || i == -1007)) {
                str = (i != -1004 ? NetStatusUtil.isConnected(MMApplicationContext.getContext()) : NetStatusUtil.isConnected(MMApplicationContext.getContext())) ? "MEDIA_ERR_DECODE" : "MEDIA_ERR_NETWORK";
            }
            aVar.mo18001a(str, i, i2);
        }
    }
}
