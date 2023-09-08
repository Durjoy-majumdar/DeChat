package lq1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.uniComments.UniCommentFooter;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: lq1.z */
public final class C61377z implements View.OnLayoutChangeListener {

    /* renamed from: d */
    public final /* synthetic */ UniCommentFooter f174575d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C13598b0> f174576e;

    public C61377z(UniCommentFooter uniCommentFooter, C32224a<C13598b0> aVar) {
        this.f174575d = uniCommentFooter;
        this.f174576e = aVar;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f174575d.getSmileyPanel().removeOnLayoutChangeListener(this);
        this.f174576e.invoke();
    }
}
