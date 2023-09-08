package zp3;

import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.view.MediaBanner;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: zp3.z */
public final class C119121z extends C87413o implements C32224a<LinearLayout> {

    /* renamed from: d */
    public final /* synthetic */ MediaBanner<RecyclerView.C16631z> f356764d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119121z(MediaBanner<RecyclerView.C16631z> mediaBanner) {
        super(0);
        this.f356764d = mediaBanner;
    }

    public Object invoke() {
        if (this.f356764d.getStyle() == MediaBanner.C19882c.BOTTOM) {
            return new LinearLayout(this.f356764d.getContext());
        }
        return null;
    }
}
