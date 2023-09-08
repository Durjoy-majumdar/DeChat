package p1204oa;

import android.view.ViewTreeObserver;
import com.tencent.liteapp.p877ui.WxaLiteAppFragment;

/* renamed from: oa.c */
public class C117730c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final /* synthetic */ WxaLiteAppFragment f352060d;

    public C117730c(WxaLiteAppFragment wxaLiteAppFragment) {
        this.f352060d = wxaLiteAppFragment;
    }

    public void onGlobalLayout() {
        this.f352060d.f339342t.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        WxaLiteAppFragment wxaLiteAppFragment = this.f352060d;
        wxaLiteAppFragment.mo169860L(wxaLiteAppFragment.f339342t);
    }
}
