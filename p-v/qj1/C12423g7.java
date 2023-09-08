package qj1;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import ig1.C8916d;
import j20.C117292a;
import java.util.LinkedHashMap;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import rx3.C13604l;

/* renamed from: qj1.g7 */
public final class C12423g7 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C12282d7 f35785d;

    /* renamed from: e */
    public final /* synthetic */ int f35786e;

    /* renamed from: f */
    public final /* synthetic */ boolean f35787f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12423g7(C12282d7 d7Var, int i, boolean z) {
        super(0);
        this.f35785d = d7Var;
        this.f35786e = i;
        this.f35787f = z;
    }

    public Object invoke() {
        String str = this.f35785d.f35417r;
        Log.m105928w(str, "getGiftListFromCgi resule,:" + this.f35786e + '!');
        View view = this.f35785d.f35427z;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin$getGiftListFromCgi$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPanelPlugin$getGiftListFromCgi$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f35787f) {
            C13604l<List<C8916d>, LinkedHashMap<String, List<String>>> e1 = this.f35785d.mo11986e1();
            this.f35785d.mo11997r1((List) e1.f38555d, (LinkedHashMap) e1.f38556e);
        } else {
            this.f35785d.f35423x.setVisibility(0);
            String str2 = this.f35785d.f35417r;
            Log.m105928w(str2, "getGiftListFromCgi fail,:" + this.f35786e + '!');
        }
        return C13598b0.f38549a;
    }
}
