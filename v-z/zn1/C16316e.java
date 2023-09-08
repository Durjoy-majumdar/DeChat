package zn1;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: zn1.e */
public final class C16316e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C16322k f43623d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16316e(C16322k kVar) {
        super(0);
        this.f43623d = kVar;
    }

    public Object invoke() {
        int i;
        RecyclerView.LayoutManager layoutManager = this.f43623d.mo14808j().getRecyclerView().getLayoutManager();
        FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof FinderLinearLayoutManager ? (FinderLinearLayoutManager) layoutManager : null;
        if (finderLinearLayoutManager != null) {
            C16322k kVar = this.f43623d;
            int D = finderLinearLayoutManager.mo16958D();
            ArrayList<C16340u> arrayList = kVar.f43629d.f43643b.f43693a;
            synchronized (arrayList) {
                Iterator<C16340u> it = arrayList.iterator();
                i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else if (it.next().f43691d) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            Log.m105924i("Finder.FinderPlayListDrawerBuilder", "checkPlayingHolder index: " + i + ", size:" + kVar.f43629d.f43643b.f43693a.size());
            if (i >= 3) {
                if (i > D) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(i));
                    C117292a.m165358d(finderLinearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder$checkPlayingHolder$1", "invoke", "()V", "Undefined", "scrollToPosition", "(I)V");
                    finderLinearLayoutManager.scrollToPosition(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(finderLinearLayoutManager, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder$checkPlayingHolder$1", "invoke", "()V", "Undefined", "scrollToPosition", "(I)V");
                } else {
                    kVar.mo14808j().getRecyclerView().smoothScrollBy(0, (int) kVar.mo14803b().getResources().getDimension(C0966R.dimen.f3741k_));
                }
            }
        }
        return C13598b0.f38549a;
    }
}
