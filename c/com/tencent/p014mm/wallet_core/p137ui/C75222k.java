package com.tencent.p014mm.wallet_core.p137ui;

import android.view.View;
import com.tencent.p014mm.autogen.events.DoOfflineShowCodeEventEvent;
import com.tencent.p014mm.p136ui.base.MMVerticalTextView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.wallet_core.ui.k */
public class C75222k extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ View f221335g;

    /* renamed from: h */
    public final /* synthetic */ MMVerticalTextView f221336h;

    /* renamed from: i */
    public final /* synthetic */ C75218i f221337i;

    public C75222k(C75218i iVar, View view, MMVerticalTextView mMVerticalTextView) {
        this.f221337i = iVar;
        this.f221335g = view;
        this.f221336h = mMVerticalTextView;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        Log.m105918d("MicroMsg.OfflinePopupWindow", "on click know");
        this.f221337i.f221330n.setVisibility(8);
        DoOfflineShowCodeEventEvent doOfflineShowCodeEventEvent = new DoOfflineShowCodeEventEvent();
        doOfflineShowCodeEventEvent.f193545d.f193546a = 1;
        doOfflineShowCodeEventEvent.publish();
        this.f221335g.setImportantForAccessibility(0);
        this.f221336h.sendAccessibilityEvent(8);
    }
}
