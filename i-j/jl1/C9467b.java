package jl1;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k60.C60979d;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import sx3.C110818d0;
import te3.C50477n10;
import te3.C50767p11;
import up1.C27696y;

/* renamed from: jl1.b */
public final class C9467b extends C60896i<C9468c> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.csw;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        String str;
        String str2;
        C9468c cVar2 = (C9468c) cVar;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(cVar2, "item");
        ImageView imageView = (ImageView) oVar.mo85812D(C0966R.C0970id.msn);
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.msm);
        TextView textView2 = (TextView) oVar.mo85812D(C0966R.C0970id.msi);
        T t = null;
        if (cVar2.f29539e == null) {
            LinkedList<C50767p11> linkedList = cVar2.f29538d.f133738h;
            C87412m.m108593f(linkedList, "gift.gifts");
            t = (C50767p11) C110818d0.m150916N(linkedList);
        } else {
            LinkedList<C50767p11> linkedList2 = cVar2.f29538d.f133738h;
            if (linkedList2 != null) {
                Iterator<T> it = linkedList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (C87412m.m108589b(((C50767p11) next).f139507d, cVar2.f29539e.f138322e)) {
                        t = next;
                        break;
                    }
                }
                t = (C50767p11) t;
            }
        }
        C39818r rVar = C39818r.f106831a;
        C60979d<C100810g0> f2 = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11871f2();
        String str3 = "";
        if (t == null || (str = t.f139509f) == null) {
            str = str3;
        }
        C11984n0 n0Var = new C11984n0(str, C27696y.THUMB_IMAGE);
        C87412m.m108593f(imageView, "thumbIv");
        f2.mo85957c(n0Var, imageView, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.DARK_TIMELINE));
        String str4 = cVar2.f29538d.f133735e;
        if (str4 == null) {
            str4 = str3;
        }
        textView.setText(str4);
        boolean z2 = false;
        if ((cVar2.f29538d.f133737g & 2) > 0) {
            C50477n10 n102 = cVar2.f29539e;
            if (!(n102 == null || (str2 = n102.f138323f) == null)) {
                str3 = str2;
            }
            if (str3.length() == 0) {
                z2 = true;
            }
            if (z2) {
                str3 = oVar.f173499A.getString(C0966R.string.mae);
                C87412m.m108593f(str3, "holder.context.getString…ustom_gifts_default_desc)");
            }
            textView2.setText(str3);
            return;
        }
        textView2.setText(str3);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
