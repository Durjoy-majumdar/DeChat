package com.tencent.p014mm.p136ui.chatting.component;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import j20.C117292a;
import java.util.List;
import java.util.Map;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import jq3.C9500j;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, mo182094d2 = {"com/tencent/mm/ui/chatting/component/TranslateWhileWriteComponent$createChooseLanRecyclerView$1$1", "Ljq3/j;", "", "type", "Ljq3/i;", "Lcom/tencent/mm/ui/chatting/component/a3;", "getItemConvert", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.chatting.component.TranslateWhileWriteComponent$createChooseLanRecyclerView$1$1 */
public final class TranslateWhileWriteComponent$createChooseLanRecyclerView$1$1 implements C9500j {
    public final /* synthetic */ C73537m5 this$0;

    /* renamed from: com.tencent.mm.ui.chatting.component.TranslateWhileWriteComponent$createChooseLanRecyclerView$1$1$a */
    public static final class C73400a extends C60896i<C30816a3> {

        /* renamed from: e */
        public final /* synthetic */ C73537m5 f215711e;

        public C73400a(C73537m5 m5Var) {
            this.f215711e = m5Var;
        }

        /* renamed from: c */
        public int mo43c() {
            return C0966R.C0971layout.f6847q6;
        }

        /* renamed from: e */
        public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
            C30816a3 a3Var = (C30816a3) cVar;
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(a3Var, "item");
            ((TextView) oVar.mo85812D(C0966R.C0970id.knx)).setText(this.f215711e.f215752d.mo91565f().getString(a3Var.f82822e));
            View D = oVar.mo85812D(C0966R.C0970id.k0t);
            int i3 = a3Var.f82821d;
            C73537m5 m5Var = this.f215711e;
            Map<Integer, Integer> map = C73537m5.f216008G;
            int i4 = i3 == m5Var.mo102523a6() ? 0 : 8;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i4));
            View view = D;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/component/TranslateWhileWriteComponent$createChooseLanRecyclerView$1$1$getItemConvert$1", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/chatting/component/LangItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/chatting/component/TranslateWhileWriteComponent$createChooseLanRecyclerView$1$1$getItemConvert$1", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/chatting/component/LangItemData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            oVar.f44854d.setOnClickListener(new C73577p5(this.f215711e, a3Var));
        }

        /* renamed from: f */
        public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(oVar, "holder");
        }
    }

    public TranslateWhileWriteComponent$createChooseLanRecyclerView$1$1(C73537m5 m5Var) {
        this.this$0 = m5Var;
    }

    public C60896i<C30816a3> getItemConvert(int i) {
        return new C73400a(this.this$0);
    }
}
