package gr1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: gr1.w1 */
public final class C59683w1 extends C87413o implements C32224a<View> {

    /* renamed from: d */
    public final /* synthetic */ FinderVideoLayout f170505d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59683w1(FinderVideoLayout finderVideoLayout) {
        super(0);
        this.f170505d = finderVideoLayout;
    }

    public Object invoke() {
        View findViewById = this.f170505d.findViewById(C0966R.C0970id.is4);
        findViewById.setOnClickListener(new C59678v1(this.f170505d));
        return findViewById;
    }
}
