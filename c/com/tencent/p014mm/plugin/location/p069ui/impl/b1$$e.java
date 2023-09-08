package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import nj3.C11182m0;
import nj3.C76874e0;
import nj3.C76875f0;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.b1$$e */
public final /* synthetic */ class b1$$e implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C94163b1 f272000d;

    /* renamed from: e */
    public final /* synthetic */ boolean f272001e;

    public /* synthetic */ b1$$e(C94163b1 b1Var, boolean z) {
        this.f272000d = b1Var;
        this.f272001e = z;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        C76874e0 e0Var2 = e0Var;
        C94163b1 b1Var = this.f272000d;
        boolean z = this.f272001e;
        e0Var.mo107150j(1, b1Var.f271948d.getString(C0966R.string.f360098a33), C0966R.raw.icons_filled_share, MMApplicationContext.getColor(C0966R.color.f2939n), b1Var.f271983F);
        int i = b1Var.f271950f;
        if (i != 1) {
            if (i != 2) {
                if (i != 7) {
                    switch (i) {
                        case 10:
                            e0Var2.mo107146h(8, b1Var.f271948d.getString(C0966R.string.f361137hk2), C0966R.raw.bottomsheet_icon_fav, 0);
                            break;
                        case 11:
                            break;
                        case 12:
                        case 13:
                            break;
                    }
                }
                if (z) {
                    String str = b1Var.f271951g.f271938p;
                    if (str != null && str.startsWith("UgcPoiEx_")) {
                        e0Var.clear();
                        ((C76875f0) e0Var.mo107150j(1, b1Var.f271948d.getString(C0966R.string.nbt), C0966R.raw.icons_filled_share, MMApplicationContext.getColor(C0966R.color.f2939n), true)).f224720o = TextUtils.TruncateAt.END;
                        ((C76875f0) e0Var2.mo107151k(8, b1Var.f271948d.getString(C0966R.string.nbr), C0966R.raw.bottomsheet_icon_fav, true)).f224720o = TextUtils.TruncateAt.END;
                    } else {
                        e0Var.mo107150j(8, b1Var.f271948d.getString(C0966R.string.f361137hk2), C0966R.raw.bottomsheet_icon_fav, 0, b1Var.f271983F);
                    }
                }
            }
            if (!z) {
                b1Var.mo129371D(e0Var2);
            }
        } else {
            e0Var2.mo107146h(3, b1Var.f271948d.getString(C0966R.string.f361137hk2), C0966R.raw.bottomsheet_icon_fav, 0);
        }
        ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new ExDeviceHaveBindNetworkDeviceEvent();
        exDeviceHaveBindNetworkDeviceEvent.f236178d.f236180a = b1Var.f271994y;
        exDeviceHaveBindNetworkDeviceEvent.publish();
        if (exDeviceHaveBindNetworkDeviceEvent.f236179e.f236182a) {
            e0Var2.mo107146h(6, b1Var.f271948d.getString(C0966R.string.c1e), C0966R.raw.icons_filled_colorful_other_device, 0);
        }
    }
}
