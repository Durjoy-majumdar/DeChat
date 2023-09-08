package com.tencent.p014mm.plugin.nearby.p083ui;

import android.content.DialogInterface;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.nearby.ui.h */
public class C69932h implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ NearbyFriendsUI f201740d;

    public C69932h(NearbyFriendsUI nearbyFriendsUI) {
        this.f201740d = nearbyFriendsUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C86709a0.m107524d().mo123458d(this.f201740d.f201614i);
    }
}
