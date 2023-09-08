package com.tencent.p014mm.p136ui.mmfb.sdk;

import android.os.Parcel;

/* renamed from: com.tencent.mm.ui.mmfb.sdk.WebLoginMethodHandler */
abstract class WebLoginMethodHandler extends LoginMethodHandler {
    public WebLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    public WebLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }
}
