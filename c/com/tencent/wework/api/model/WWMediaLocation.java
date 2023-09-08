package com.tencent.wework.api.model;

import android.os.Bundle;
import com.tencent.wework.api.model.WWMediaMessage;

public class WWMediaLocation extends WWMediaMessage.WWMediaObject {

    /* renamed from: f */
    public String f285812f;

    /* renamed from: g */
    public double f285813g;

    /* renamed from: h */
    public double f285814h;

    /* renamed from: i */
    public double f285815i;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r0 = r3.f285812f;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo136616b() {
        /*
            r3 = this;
            boolean r0 = super.mo136616b()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.String r0 = r3.f285812f
            if (r0 == 0) goto L_0x001e
            int r0 = r0.length()
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = r3.f285812f
            int r0 = r0.length()
            r2 = 10240(0x2800, float:1.4349E-41)
            if (r0 > r2) goto L_0x001e
            r0 = 1
            return r0
        L_0x001e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wework.api.model.WWMediaLocation.mo136616b():boolean");
    }

    /* renamed from: f */
    public void mo136619f(Bundle bundle) {
        bundle.putString("_wwlocobject_address", this.f285812f);
        bundle.putDouble("_wwlocobject_longitude", this.f285813g);
        bundle.putDouble("_wwlocobject_latitude", this.f285814h);
        bundle.putDouble("_wwlocobject_zoom", this.f285815i);
        super.mo136619f(bundle);
    }
}
