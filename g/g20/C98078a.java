package g20;

import android.view.View;
import com.tencent.p014mm.graphics.p314ui.WxBaseImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import e20.C116637d;
import e20.C97588f;

/* renamed from: g20.a */
public class C98078a implements View.OnAttachStateChangeListener {

    /* renamed from: d */
    public final /* synthetic */ WxBaseImageView f287546d;

    public C98078a(WxBaseImageView wxBaseImageView) {
        this.f287546d = wxBaseImageView;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        C97588f.INSTANCE.mo136853a();
        WxBaseImageView wxBaseImageView = this.f287546d;
        int i = WxBaseImageView.f48884z;
        wxBaseImageView.getClass();
        C116637d dVar = C116637d.INSTANCE;
        if (dVar.f349740g) {
            dVar.mo180638b();
        }
        if (!wxBaseImageView.f48892n) {
            Log.m105924i("MicroMsg.WxBaseImageView", "alvinluo hasReportPerformance can't report");
        } else if (wxBaseImageView.f48901w) {
            Log.m105924i("MicroMsg.WxBaseImageView", "alvinluo hasReportPerformance and return");
        } else {
            if (wxBaseImageView.f48903y == null) {
                wxBaseImageView.f48903y = new MMHandler("WxBaseImageViewReport");
            }
            wxBaseImageView.f48903y.postToWorker(new C98079b(wxBaseImageView));
        }
    }
}
