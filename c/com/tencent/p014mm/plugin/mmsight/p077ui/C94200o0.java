package com.tencent.p014mm.plugin.mmsight.p077ui;

import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.o0 */
public class C94200o0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f272144d;

    /* renamed from: e */
    public final /* synthetic */ SightCaptureUI f272145e;

    public C94200o0(SightCaptureUI sightCaptureUI, String str) {
        this.f272145e = sightCaptureUI;
        this.f272144d = str;
    }

    public void run() {
        boolean z = true;
        Log.m105925i("MicroMsg.SightCaptureUI", "DEBUG showCameraInfoImpl: %s", this.f272144d);
        if (CaptureMMProxy.getInstance().getInt(C72994y1.C72995a.USERINFO_LOCAL_SIGHT_DEBUGINFO_INT_SYNC, 0) != 1) {
            z = false;
        }
        if (z) {
            TextView textView = (TextView) this.f272145e.findViewById(C0966R.C0970id.l5_);
            textView.setVisibility(0);
            textView.setText(this.f272144d);
        }
    }
}
