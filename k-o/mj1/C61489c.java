package mj1;

import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.multistream.FinderLiveMultiStreamViewLayout;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: mj1.c */
public final class C61489c extends C87413o implements C32224a<ImageView> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveMultiStreamViewLayout f174817d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61489c(FinderLiveMultiStreamViewLayout finderLiveMultiStreamViewLayout) {
        super(0);
        this.f174817d = finderLiveMultiStreamViewLayout;
    }

    public Object invoke() {
        return (ImageView) this.f174817d.findViewById(C0966R.C0970id.a8r);
    }
}
