package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.LocationUtil;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.g */
public class C18742g implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ExdeviceConnectWifiUI f52453d;

    public C18742g(ExdeviceConnectWifiUI exdeviceConnectWifiUI) {
        this.f52453d = exdeviceConnectWifiUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        LocationUtil.jumpToOpenGps(this.f52453d);
    }
}
