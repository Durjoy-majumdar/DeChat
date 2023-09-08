package pf2;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32226l;
import gc0.C20828a;
import gy3.C87412m;
import gy3.C87413o;
import hc0.C20937c;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kw0.C46746a;
import nf2.C47240a;
import rx3.C13598b0;
import te3.C49699hg;
import te3.C50117ke;
import te3.C50249le;

/* renamed from: pf2.o */
public final class C47490o extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C47491p f127400d;

    /* renamed from: e */
    public final /* synthetic */ C49699hg f127401e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47490o(C47491p pVar, C49699hg hgVar) {
        super(1);
        this.f127400d = pVar;
        this.f127401e = hgVar;
    }

    public Object invoke(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C47491p pVar = this.f127400d;
            C49699hg hgVar = this.f127401e;
            Log.m105924i(pVar.f127402A, "filling FeaturedMsgSinglePicViewHolder");
            View view = pVar.f127404C;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSinglePicViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/BizMessage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSinglePicViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/BizMessage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = pVar.f127405D;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSinglePicViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/BizMessage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSinglePicViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/BizMessage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C50249le leVar = hgVar.f134607i.f137969e.get(0);
            C50117ke keVar = hgVar.f134607i.f137968d;
            C47478f fVar = C47478f.f127353a;
            Context context = pVar.f127403B;
            TextView textView = pVar.f127406E;
            C87412m.m108593f(textView, "headerTimeStamp");
            fVar.mo72495c(context, textView, hgVar);
            Context context2 = pVar.f127403B;
            C47240a aVar3 = pVar.f127411z;
            View view5 = pVar.f44854d;
            C87412m.m108593f(view5, "itemView");
            C87412m.m108593f(leVar, "detailInfo");
            C87412m.m108593f(keVar, "baseInfo");
            fVar.mo72496d(context2, aVar3, view5, hgVar, leVar, keVar, pVar.mo17365l());
            pVar.f127408G.setText(leVar.f137336d);
            TextView textView2 = pVar.f127407F;
            if (Util.isNullOrNil(leVar.f137317A)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                pVar.f127407F.setText(leVar.f137317A);
            }
            if (leVar.f137324H > 1) {
                pVar.f127410I.setVisibility(0);
                pVar.f127410I.setText(String.valueOf(leVar.f137324H));
            } else {
                pVar.f127410I.setVisibility(8);
                pVar.f127410I.setText("");
            }
            pVar.f127409H.getLayoutParams().height = (int) (((double) (C46746a.f125826a.mo71973f(pVar.f127403B) - C76577a.m92151b(pVar.f127403B, 16))) * 0.5625d);
            String str = Util.isNullOrNil(leVar.f137328L) ? leVar.f137342j : leVar.f137328L;
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59361q = C0966R.C0969drawable.f4586h2;
            bVar.f59347c = true;
            C20828a.m22825b().mo32519h(str, pVar.f127409H, bVar.mo32666a());
        }
        return C13598b0.f38549a;
    }
}
