package ul2;

import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanCodeMaskView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: ul2.h */
public final class C111204h implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ ScanCodeMaskView f333024d;

    public C111204h(ScanCodeMaskView scanCodeMaskView) {
        this.f333024d = scanCodeMaskView;
    }

    public final boolean onTimerExpired() {
        ScanCodeMaskView scanCodeMaskView = this.f333024d;
        int i = ScanCodeMaskView.f315975Q0;
        scanCodeMaskView.getClass();
        Log.m105918d("MicroMsg.ScanCodeMaskView", "alvinluo runScaleAnimation");
        scanCodeMaskView.mo151721C(1);
        return true;
    }
}
