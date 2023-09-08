package ts1;

import com.tencent.p014mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM;
import fe1.C8013f;
import java.util.HashSet;

/* renamed from: ts1.e */
public final class C14081e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderTeenModeLimitVM f39489d;

    /* renamed from: e */
    public final /* synthetic */ boolean f39490e;

    public C14081e(FinderTeenModeLimitVM finderTeenModeLimitVM, boolean z) {
        this.f39489d = finderTeenModeLimitVM;
        this.f39490e = z;
    }

    public final void run() {
        HashSet<C8013f> hashSet = this.f39489d.f18820f;
        boolean z = this.f39490e;
        for (C8013f a : hashSet) {
            a.mo9102a(z);
        }
    }
}
