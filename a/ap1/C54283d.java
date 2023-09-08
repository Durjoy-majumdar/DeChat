package ap1;

import android.content.Context;
import android.util.AttributeSet;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import cp1.C57952m;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13604l;
import vo1.C65770a0;
import vo1.C65796h;

/* renamed from: ap1.d */
public abstract class C54283d extends C56032b {

    /* renamed from: d */
    public final String f152365d = "FinderLiveShoppingReplayRouter";

    /* renamed from: e */
    public C65796h f152366e;

    /* renamed from: f */
    public C54282c f152367f;

    /* renamed from: ap1.d$a */
    public static final class C54284a extends C87413o implements C32227p<Long, C57952m, C13604l<? extends C57952m, ? extends Boolean>> {

        /* renamed from: d */
        public static final C54284a f152368d = new C54284a();

        public C54284a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            return C65770a0.f189184r.mo89819a().mo89809j(((Number) obj).longValue(), (C57952m) obj2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54283d(Context context, Fragment fragment, AttributeSet attributeSet) {
        super(context, fragment, attributeSet);
        C87412m.m108594g(context, "context");
        MMActivity mMActivity = (MMActivity) context;
        this.f152366e = new C65796h(mMActivity, C54284a.f152368d);
        this.f152367f = new C54282c(mMActivity);
    }

    public abstract /* synthetic */ int getLiveRole();

    public final C65796h getShoppingReplayBaseUIC() {
        return this.f152366e;
    }

    public final C54282c getShoppingReplayDecorateUIC() {
        return this.f152367f;
    }

    public final String getTAG() {
        return this.f152365d;
    }

    public final void setShoppingReplayBaseUIC(C65796h hVar) {
        C87412m.m108594g(hVar, "<set-?>");
        this.f152366e = hVar;
    }

    public final void setShoppingReplayDecorateUIC(C54282c cVar) {
        C87412m.m108594g(cVar, "<set-?>");
        this.f152367f = cVar;
    }
}
