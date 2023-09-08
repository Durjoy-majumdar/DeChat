package yz2;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import j20.C117292a;
import java.util.HashMap;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: yz2.v2 */
public final class C16089v2 extends UIComponent {

    /* renamed from: d */
    public Map<String, Boolean> f43236d = new HashMap();

    /* renamed from: e */
    public RecyclerView f43237e;

    /* renamed from: f */
    public Integer f43238f;

    /* renamed from: g */
    public int f43239g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16089v2(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public static void m14974c3(C16089v2 v2Var, int i, int i2, Object obj) {
        Integer num = v2Var.f43238f;
        if (num != null) {
            int intValue = num.intValue();
            try {
                RecyclerView recyclerView = v2Var.f43237e;
                LinearLayoutManager linearLayoutManager = null;
                RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
                if (layoutManager instanceof LinearLayoutManager) {
                    linearLayoutManager = (LinearLayoutManager) layoutManager;
                }
                if (linearLayoutManager != null) {
                    int i3 = v2Var.f43239g;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(i3));
                    aVar.mo10233c(Integer.valueOf(intValue));
                    C117292a.m165358d(linearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusTopicSquareScrollUIC", "tryScroll", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    linearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                    C117292a.m165359e(linearLayoutManager, "com/tencent/mm/plugin/textstatus/ui/TextStatusTopicSquareScrollUIC", "tryScroll", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    C13598b0 b0Var = C13598b0.f38549a;
                }
            } catch (Throwable unused) {
                C13598b0 b0Var2 = C13598b0.f38549a;
            }
        }
    }

    public void onPause() {
        super.onPause();
        RecyclerView recyclerView = this.f43237e;
        LinearLayoutManager linearLayoutManager = null;
        RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        }
        if (linearLayoutManager != null) {
            int C = linearLayoutManager.mo16957C();
            View findViewByPosition = linearLayoutManager.findViewByPosition(C);
            int top = findViewByPosition != null ? findViewByPosition.getTop() : 0;
            this.f43238f = Integer.valueOf(C);
            this.f43239g = top;
        }
    }

    public void onResume() {
        super.onResume();
    }
}
