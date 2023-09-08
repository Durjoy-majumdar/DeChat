package p1204oa;

import android.view.ViewTreeObserver;
import com.tencent.liteapp.p877ui.WxaLiteAppBaseView;

/* renamed from: oa.b */
public class C117729b implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final /* synthetic */ WxaLiteAppBaseView f352059d;

    public C117729b(WxaLiteAppBaseView wxaLiteAppBaseView) {
        this.f352059d = wxaLiteAppBaseView;
    }

    public void onGlobalLayout() {
        this.f352059d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        WxaLiteAppBaseView wxaLiteAppBaseView = this.f352059d;
        int i = WxaLiteAppBaseView.f339324j;
        wxaLiteAppBaseView.mo169831a();
    }
}
