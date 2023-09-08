package pf2;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.plugin.profile.p088ui.tab.msg.holder.FeaturedMsgCompoundViewHolder$fillingMain$mLinearLayoutManager$1;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import rx3.C13598b0;
import sx3.C64197v;
import te3.C49699hg;
import te3.C50117ke;
import te3.C50249le;

/* renamed from: pf2.g */
public final class C47482g extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C47483h f127368d;

    /* renamed from: e */
    public final /* synthetic */ C49699hg f127369e;

    /* renamed from: f */
    public final /* synthetic */ int f127370f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47482g(C47483h hVar, C49699hg hgVar, int i) {
        super(1);
        this.f127368d = hVar;
        this.f127369e = hgVar;
        this.f127370f = i;
    }

    public Object invoke(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C47483h hVar = this.f127368d;
            C49699hg hgVar = this.f127369e;
            int i = this.f127370f;
            View view = hVar.f127374D;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgCompoundViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/BizMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgCompoundViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/BizMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = hVar.f127375E;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgCompoundViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/BizMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgCompoundViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/BizMessage;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C47478f fVar = C47478f.f127353a;
            Context context = hVar.f127371A;
            TextView textView = hVar.f127372B;
            C87412m.m108593f(textView, "headerTimeStamp");
            fVar.mo72495c(context, textView, hgVar);
            if (hgVar.f134607i.f137969e.size() > 0) {
                int i2 = hgVar.f134607i.f137969e.get(0).f137345p;
                if (i2 == 0 || i2 == 7) {
                    TextView textView2 = hVar.f127372B;
                    textView2.setPadding(0, C76577a.m92151b(textView2.getContext(), 16), 0, C76577a.m92151b(textView2.getContext(), 12));
                } else {
                    TextView textView3 = hVar.f127372B;
                    textView3.setPadding(0, C76577a.m92151b(textView3.getContext(), 12), 0, C76577a.m92151b(textView3.getContext(), 12));
                }
            }
            C50117ke keVar = hgVar.f134607i.f137968d;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            LinkedList<C50249le> linkedList = hgVar.f134607i.f137969e;
            C87412m.m108593f(linkedList, "bizMessage.AppMsg.DetailInfo");
            int i3 = 0;
            for (T next : linkedList) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    C50249le leVar = (C50249le) next;
                    int i5 = leVar.f137345p;
                    C47472c cVar = new C47472c((i3 == 0 && i5 == 5) ? C47502z.LargeVideo : (i3 == 0 && i5 == 8) ? C47502z.LargePic : (i3 == 0 && i5 == 19) ? C47502z.LargeLive : i5 == 5 ? C47502z.SmallVideo : i5 == 8 ? C47502z.SmallPic : i5 == 7 ? C47502z.SmallVoice : i5 == 19 ? C47502z.SmallLive : C47502z.SmallArticle, leVar);
                    cVar.f127337c = hgVar;
                    arrayList.add(cVar);
                    i3 = i4;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            if (arrayList.size() <= 3 || hgVar.f134607i.f137968d.f136680i || hgVar.f134609n != 0) {
                arrayList2.addAll(arrayList);
            } else {
                arrayList2.addAll(arrayList.subList(0, 3));
                C47472c cVar2 = new C47472c(C47502z.Collapse, new C50249le());
                cVar2.f127337c = hgVar;
                arrayList2.add(cVar2);
            }
            FeaturedMsgCompoundViewHolder$fillingMain$mLinearLayoutManager$1 featuredMsgCompoundViewHolder$fillingMain$mLinearLayoutManager$1 = new FeaturedMsgCompoundViewHolder$fillingMain$mLinearLayoutManager$1(hVar.f127371A);
            featuredMsgCompoundViewHolder$fillingMain$mLinearLayoutManager$1.mo16974W(1);
            hVar.f127373C.setLayoutManager(featuredMsgCompoundViewHolder$fillingMain$mLinearLayoutManager$1);
            hVar.f127373C.setNestedScrollingEnabled(false);
            C87412m.m108593f(keVar, "baseInfo");
            hVar.f127373C.setAdapter(new C47468b(keVar, arrayList2, hVar.f127376z, i));
        }
        return C13598b0.f38549a;
    }
}
