package ve1;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0747l;
import com.tencent.p014mm.C0966R;
import er1.C7878t0;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k60.C60979d;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import up1.C27696y;

/* renamed from: ve1.z7 */
public final class C14713z7 extends C60896i<C0747l> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.ap5;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C0747l lVar = (C0747l) cVar;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(lVar, "item");
        ImageView imageView = (ImageView) oVar.mo85812D(C0966R.C0970id.j8y);
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.f359149j92);
        TextView textView2 = (TextView) oVar.mo85812D(C0966R.C0970id.f359148j91);
        C39818r rVar = C39818r.f106831a;
        C60979d<C100810g0> f2 = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11871f2();
        String str = lVar.f1765d.f146010i;
        if (str == null) {
            str = "";
        }
        C11984n0 n0Var = new C11984n0(str, C27696y.RAW_IMAGE);
        C87412m.m108593f(imageView, "avatarView");
        f2.mo85957c(n0Var, imageView, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.TIMELINE));
        textView.setText(lVar.f1765d.f146007f);
        String string = oVar.f44854d.getResources().getString(C0966R.string.cyx, new Object[]{C7878t0.m8034c(2, lVar.f1765d.f146009h)});
        C87412m.m108593f(string, "holder.itemView.resource…ntInfo.participantCount))");
        textView2.setText(string);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
