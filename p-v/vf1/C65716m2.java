package vf1;

import android.widget.TextView;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveDelManagerUI;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: vf1.m2 */
public final class C65716m2 extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveDelManagerUI f189072d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65716m2(FinderLiveDelManagerUI finderLiveDelManagerUI) {
        super(1);
        this.f189072d = finderLiveDelManagerUI;
    }

    public Object invoke(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            TextView textView = this.f189072d.f158988f;
            if (textView != null) {
                textView.setVisibility(0);
            }
        } else {
            TextView textView2 = this.f189072d.f158988f;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
        return C13598b0.f38549a;
    }
}
