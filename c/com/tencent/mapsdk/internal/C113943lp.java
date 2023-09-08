package com.tencent.mapsdk.internal;

import com.tencent.map.tools.net.NetManager;
import com.tencent.map.tools.net.NetRequest;
import com.tencent.map.tools.net.NetResponse;
import java.io.Closeable;
import java.io.InputStream;

/* renamed from: com.tencent.mapsdk.internal.lp */
public class C113943lp extends C113932lh {

    /* renamed from: a */
    private NetResponse f340818a;

    /* renamed from: a */
    private static InputStream m157877a(InputStream inputStream) {
        return inputStream;
    }

    /* renamed from: a */
    public void mo172374a(NetRequest.NetRequestBuilder netRequestBuilder) {
    }

    /* renamed from: a */
    public void mo172375a(NetResponse netResponse) {
    }

    /* renamed from: b */
    public final void mo172353b() {
        super.mo172353b();
        NetResponse netResponse = this.f340818a;
        if (netResponse != null) {
            C113886kg.m157515a((Closeable) netResponse.getInputStream());
        }
    }

    /* renamed from: e */
    public InputStream mo172354e(String str) {
        NetRequest.NetRequestBuilder url = NetManager.getInstance().builder().url(str);
        mo172374a(url);
        NetResponse doStream = url.doStream();
        this.f340818a = doStream;
        if (doStream != null) {
            InputStream inputStream = doStream.getInputStream();
            mo172375a(this.f340818a);
            return inputStream;
        }
        mo172375a(new NetResponse(url.getNetRequest()));
        return null;
    }
}
