package com.tencent.p014mm.plugin.webview.model;

import android.os.Bundle;
import com.tencent.p014mm.plugin.webview.stub.C6107m;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.webview.model.b2 */
public class C6026b2 {

    /* renamed from: c */
    public static C6026b2 f22273c = new C6026b2();

    /* renamed from: a */
    public C6107m f22274a = null;

    /* renamed from: b */
    public boolean f22275b;

    /* renamed from: a */
    public void mo6995a(int i) {
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Boolean.valueOf(this.f22274a == null);
        Log.m105925i("MicroMsg.WebViewVideoProxy", "set networkd state = %d, callbacker == null ? %b", objArr);
        if (this.f22274a != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("webview_video_proxy_net_state", i);
            try {
                this.f22274a.mo7031V5(5005, bundle);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.WebViewVideoProxy", "set network state failed : %s", e.getMessage());
            }
        }
    }
}
