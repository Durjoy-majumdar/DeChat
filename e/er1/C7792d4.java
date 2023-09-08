package er1;

import android.view.View;
import android.view.ViewParent;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import java.lang.ref.WeakReference;
import jq3.C9508q;

/* renamed from: er1.d4 */
public final class C7792d4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C9508q f26296d;

    /* renamed from: e */
    public final /* synthetic */ ViewParent f26297e;

    public C7792d4(C9508q qVar, ViewParent viewParent) {
        this.f26296d = qVar;
        this.f26297e = viewParent;
    }

    public final void run() {
        WxRecyclerAdapter wxRecyclerAdapter;
        this.f26296d.f29686g = ((View) this.f26297e).getTop();
        C9508q qVar = this.f26296d;
        if ((qVar.f29685f - qVar.f29684e) - qVar.f29683d > qVar.f29686g) {
            if (!qVar.f29687h) {
                qVar.f29687h = true;
                WeakReference<WxRecyclerAdapter<?>> weakReference = qVar.f29690k;
                if (weakReference != null && (wxRecyclerAdapter = weakReference.get()) != null) {
                    wxRecyclerAdapter.mo82616y6();
                }
            }
        } else if (qVar.f29687h) {
            qVar.f29687h = false;
            qVar.f29688i = true;
        }
    }
}
