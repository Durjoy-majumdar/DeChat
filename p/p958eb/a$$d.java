package p958eb;

import android.os.Looper;
import com.tencent.magicbrush.p941ui.MagicBrushView;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;
import li0.C88514d;
import li0.C88542m;
import p963fc.C86812g;

/* renamed from: eb.a$$d */
public class a$$d extends MagicBrushView.C80323d {

    /* renamed from: a */
    public final /* synthetic */ C86470a f251290a;

    public a$$d(C86470a aVar) {
        this.f251290a = aVar;
    }

    /* renamed from: d */
    public void mo111659d(Object obj) {
        C86812g j0 = this.f251290a.mo125523j0();
        if (j0 != null && j0.f238113K != null) {
            j0.f238113K.f255667a.f255692z.set(true);
            C88514d dVar = j0.f238113K.f255667a;
            dVar.getClass();
            LinkedList linkedList = new LinkedList(dVar.f255691y);
            ((LinkedBlockingQueue) dVar.f255691y).clear();
            while (!linkedList.isEmpty()) {
                C88542m mVar = (C88542m) linkedList.poll();
                MMHandler mMHandler = mVar.f255752g;
                if (mMHandler != null) {
                    mVar.f255752g.removeCallbacks(mVar.f255751f);
                    if (Looper.myLooper() == mMHandler.getLooper()) {
                        ((C88542m.C88543a) mVar.f255751f).run();
                    } else {
                        mVar.mo123009c(mVar.f255746a);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public void mo55505e(Object obj, boolean z) {
        C86812g j0 = this.f251290a.mo125523j0();
        if (j0 != null && j0.f238113K != null) {
            j0.f238113K.f255667a.f255692z.set(false);
        }
    }
}
