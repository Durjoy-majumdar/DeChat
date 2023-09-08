package pf2;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nf2.C47240a;
import rx3.C13598b0;
import sf0.C77702q0;
import te3.C49699hg;
import te3.C50117ke;
import te3.C50249le;

/* renamed from: pf2.q */
public final class C47492q extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C47493r f127412d;

    /* renamed from: e */
    public final /* synthetic */ C49699hg f127413e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47492q(C47493r rVar, C49699hg hgVar) {
        super(1);
        this.f127412d = rVar;
        this.f127413e = hgVar;
    }

    public Object invoke(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C47493r rVar = this.f127412d;
            C49699hg hgVar = this.f127413e;
            Log.m105924i(rVar.f127414A, "filling FeaturedMsgSingleTextViewHolder");
            View view = rVar.f127418E;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleTextViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/BizMessage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleTextViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/BizMessage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = rVar.f127419F;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleTextViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/BizMessage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleTextViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/BizMessage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C47478f fVar = C47478f.f127353a;
            Context context = rVar.f127415B;
            TextView textView = rVar.f127417D;
            C87412m.m108593f(textView, "headerTimeStamp");
            fVar.mo72495c(context, textView, hgVar);
            TextView textView2 = rVar.f127417D;
            textView2.setPadding(0, C76577a.m92151b(textView2.getContext(), 16), 0, C76577a.m92151b(textView2.getContext(), 12));
            if (hgVar.f134602d.f135740e == 1) {
                Log.m105924i(rVar.f127414A, "filling old text");
                rVar.mo72501y(hgVar.f134603e.f132935d.toString(), hgVar);
            } else {
                C50249le leVar = hgVar.f134607i.f137969e.get(0);
                C50117ke keVar = hgVar.f134607i.f137968d;
                Context context2 = rVar.f127415B;
                C47240a aVar3 = rVar.f127423z;
                View view5 = rVar.f44854d;
                C87412m.m108593f(view5, "itemView");
                C87412m.m108593f(leVar, "detailInfo");
                C87412m.m108593f(keVar, "baseInfo");
                fVar.mo72496d(context2, aVar3, view5, hgVar, leVar, keVar, rVar.mo17365l());
                if (C77702q0.m93719b(leVar.f137317A)) {
                    rVar.f127420G.setVisibility(8);
                } else {
                    rVar.f127420G.setVisibility(0);
                    rVar.f127420G.setText(leVar.f137317A);
                }
                rVar.mo72501y(leVar.f137336d.toString(), hgVar);
            }
        }
        return C13598b0.f38549a;
    }
}
