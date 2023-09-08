package com.tencent.wework.api.model;

import android.os.Bundle;

public class WWMediaBufferMessage extends WWMediaMessage {

    /* renamed from: f */
    public byte[] f285802f = null;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r0 = r2.f285802f;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo136616b() {
        /*
            r2 = this;
            boolean r0 = super.mo136616b()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            byte[] r0 = r2.f285802f
            if (r0 == 0) goto L_0x0012
            int r0 = r0.length
            if (r0 != 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r0 = 1
            return r0
        L_0x0012:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wework.api.model.WWMediaBufferMessage.mo136616b():boolean");
    }

    /* renamed from: f */
    public void mo136619f(Bundle bundle) {
        bundle.putByteArray("_wwmergedconvobject_buffer", this.f285802f);
        super.mo136619f(bundle);
    }
}
