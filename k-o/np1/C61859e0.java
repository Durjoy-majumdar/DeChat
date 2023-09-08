package np1;

import android.view.MotionEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveFixClickIssueRecyclerView;
import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShoppingPanel;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gg1.C32444a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: np1.e0 */
public final class C61859e0 {

    /* renamed from: a */
    public final FinderLiveShoppingPanel f175885a;

    /* renamed from: b */
    public final FinderLiveFixClickIssueRecyclerView f175886b;

    /* renamed from: c */
    public final C13601g f175887c = C36568h.m40985a(C34995a.f93928d);

    /* renamed from: d */
    public boolean f175888d = true;

    /* renamed from: e */
    public final long f175889e = 600;

    /* renamed from: f */
    public long f175890f;

    /* renamed from: g */
    public LinearLayoutManager f175891g;

    /* renamed from: h */
    public boolean f175892h;

    /* renamed from: i */
    public long f175893i = 600;

    /* renamed from: j */
    public float f175894j;

    /* renamed from: k */
    public float f175895k;

    /* renamed from: np1.e0$a */
    public static final class C34995a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C34995a f93928d = new C34995a();

        public C34995a() {
            super(0);
        }

        public Object invoke() {
            return Boolean.valueOf(C32444a.f86107V0.mo60266n().intValue() == 0);
        }
    }

    public C61859e0(FinderLiveShoppingPanel finderLiveShoppingPanel, FinderLiveFixClickIssueRecyclerView finderLiveFixClickIssueRecyclerView) {
        C87412m.m108594g(finderLiveShoppingPanel, "container");
        C87412m.m108594g(finderLiveFixClickIssueRecyclerView, "linearLayoutRecyclerView");
        this.f175885a = finderLiveShoppingPanel;
        this.f175886b = finderLiveFixClickIssueRecyclerView;
    }

    /* renamed from: a */
    public static final void m72591a(C61859e0 e0Var, MotionEvent motionEvent) {
        if (!e0Var.f175892h) {
            boolean z = true;
            e0Var.f175892h = true;
            e0Var.f175894j = motionEvent.getY();
            e0Var.f175895k = 0.0f;
            e0Var.f175885a.mo78811h();
            FinderLiveShoppingPanel finderLiveShoppingPanel = e0Var.f175885a;
            boolean enableNestScrolled = finderLiveShoppingPanel.getEnableNestScrolled();
            LinearLayoutManager linearLayoutManager = e0Var.f175891g;
            if (linearLayoutManager != null) {
                if (linearLayoutManager.mo16957C() != 0) {
                    z = false;
                }
                if (z && !enableNestScrolled) {
                    long currentTimeMillis = System.currentTimeMillis() - e0Var.f175890f;
                    if (currentTimeMillis <= e0Var.f175889e) {
                        Log.m105924i("ShoppingPanelNestedScrollController", "enableNestedState enable but touchUpPassTime:" + currentTimeMillis + " too fast!");
                    }
                }
                Log.m105924i("ShoppingPanelNestedScrollController", "enableNestedState :" + z);
                finderLiveShoppingPanel.setEnableNestScrolled(z);
                e0Var.f175886b.setConsumedTouchEnvent(false);
            }
            z = false;
            Log.m105924i("ShoppingPanelNestedScrollController", "enableNestedState :" + z);
            finderLiveShoppingPanel.setEnableNestScrolled(z);
            e0Var.f175886b.setConsumedTouchEnvent(false);
        }
    }
}
