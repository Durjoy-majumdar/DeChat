package il1;

import af0.C16458b;
import android.graphics.Bitmap;
import bf0.C16794b;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveConfettiView;
import j60.C60777a;
import java.util.Random;

/* renamed from: il1.w1 */
public final class C60538w1 implements C16458b {

    /* renamed from: a */
    public final /* synthetic */ Bitmap f172555a;

    /* renamed from: b */
    public final /* synthetic */ FinderLiveConfettiView f172556b;

    public C60538w1(Bitmap bitmap, FinderLiveConfettiView finderLiveConfettiView) {
        this.f172555a = bitmap;
        this.f172556b = finderLiveConfettiView;
    }

    /* renamed from: a */
    public final C16794b mo14934a(Random random) {
        return new C60777a(this.f172555a, this.f172556b.f160073q);
    }
}
