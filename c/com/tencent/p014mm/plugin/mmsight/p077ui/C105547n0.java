package com.tencent.p014mm.plugin.mmsight.p077ui;

import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f72.C97842b;
import p156gj.C107842p;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.n0 */
public class C105547n0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SightCaptureUI f313955d;

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.n0$a */
    public class C105548a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f313956d;

        public C105548a(String str) {
            this.f313956d = str;
        }

        public void run() {
            boolean z = true;
            Log.m105925i("MicroMsg.SightCaptureUI", "DEBUG showDebugInfo %s", this.f313956d);
            if (CaptureMMProxy.getInstance().getInt(C72994y1.C72995a.USERINFO_LOCAL_SIGHT_DEBUGINFO_INT_SYNC, 0) != 1) {
                z = false;
            }
            if (z) {
                TextView textView = (TextView) C105547n0.this.f313955d.findViewById(C0966R.C0970id.l5_);
                textView.setVisibility(0);
                textView.setText(this.f313956d);
            }
        }
    }

    public C105547n0(SightCaptureUI sightCaptureUI) {
        this.f313955d = sightCaptureUI;
    }

    public void run() {
        String j = C97842b.m126293j(this.f313955d.f313871j.getFilePath());
        if (!Util.isNullOrNil(j)) {
            MMHandlerThread.postToMainThread(new C105548a(((j + "\n" + String.format("FPS: %s", new Object[]{Float.valueOf(this.f313955d.f313871j.mo159602c())})) + "\n" + String.format("TIME_RECODER_2_PLAY: %s", new Object[]{Long.valueOf(C97842b.m126298o("TIME_RECODER_2_PLAY"))})) + "\n" + String.format("CPU: cur %s max:%s", new Object[]{C107842p.m146109b(), C107842p.m146110c()})));
        }
    }
}
