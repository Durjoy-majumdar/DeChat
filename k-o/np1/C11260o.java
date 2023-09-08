package np1;

import android.content.Context;
import android.view.View;
import android.webkit.ValueCallback;
import cj1.C54804r0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di0.C86299o;
import fj1.C45795b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import oh1.C11423i;
import te3.C50019jp1;
import te3.C52128yk0;

/* renamed from: np1.o */
public final class C11260o implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C61817a f33196d;

    /* renamed from: e */
    public final /* synthetic */ C52128yk0 f33197e;

    public C11260o(C61817a aVar, C52128yk0 yk02) {
        this.f33196d = aVar;
        this.f33197e = yk02;
    }

    public final void onClick(View view) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal$onClickReplayOptionView$1$1$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C61817a aVar = this.f33196d;
        C45795b bVar = aVar.f175774g;
        Context context = aVar.f175772e.getContext();
        C87412m.m108593f(context, "root.context");
        C52128yk0 yk02 = this.f33197e;
        C87412m.m108594g(bVar, "<this>");
        C87412m.m108594g(yk02, "config");
        C50019jp1 jp12 = yk02.f145340e;
        String str3 = "";
        if (jp12 == null || (str = jp12.f136237d) == null) {
            str = str3;
        }
        if (!(jp12 == null || (str2 = jp12.f136238e) == null)) {
            str3 = str2;
        }
        C86299o oVar = new C86299o();
        oVar.f250930b = str;
        oVar.f250934f = str3;
        oVar.f250939k = 1205;
        oVar.f250937i = new C11423i(bVar);
        Log.m105924i("FlashSaleUtil", "open flash sale record with appId = " + str + ", path = " + str3);
        C54804r0.f153631a.mo75766h(context, bVar, oVar, false, (ValueCallback<String>) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal$onClickReplayOptionView$1$1$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
