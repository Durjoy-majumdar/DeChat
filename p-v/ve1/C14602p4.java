package ve1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0776t0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.MMRoundCornerImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
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
import pl1.C62345f;
import up1.C27696y;

/* renamed from: ve1.p4 */
public final class C14602p4 extends C60896i<C0776t0> {

    /* renamed from: e */
    public final String f40437e = "FinderLivePurchaseListConvert";

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.czu;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C0776t0 t0Var = (C0776t0) cVar;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(t0Var, "item");
        Log.m105924i(this.f40437e, "bind view ");
        View D = oVar.mo85812D(C0966R.C0970id.ndj);
        String str = t0Var.f1819d.f143505p;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        if (D != null) {
            C39818r rVar = C39818r.f106831a;
            ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11870V().mo85957c(new C11984n0(str, C27696y.THUMB_IMAGE), (MMRoundCornerImageView) D, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.TIMELINE));
        }
        C39818r rVar2 = C39818r.f106831a;
        C60979d<C100810g0> i25 = ((C11990s0) rVar2.mo62446e(cls2).mo62447c(cls)).mo11872i2();
        String str3 = t0Var.f1819d.f143498f;
        if (str3 == null) {
            str3 = str2;
        }
        C62345f fVar = new C62345f(str3, (C27696y) null, 2, (C8480h) null);
        View D2 = oVar.mo85812D(C0966R.C0970id.ndl);
        C87412m.m108593f(D2, "holder.getView<ImageView>(R.id.ec_source_head_img)");
        i25.mo85957c(fVar, (ImageView) D2, ((C11990s0) rVar2.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.ndo);
        String str4 = t0Var.f1819d.f143496d;
        if (str4 == null) {
            str4 = str2;
        }
        textView.setText(str4);
        View D3 = oVar.mo85812D(C0966R.C0970id.ndn);
        C87412m.m108593f(D3, "holder.getView<TextView>(R.id.ec_source_status)");
        TextView textView2 = (TextView) D3;
        String str5 = t0Var.f1819d.f143502j;
        if (str5 == null) {
            str5 = str2;
        }
        textView2.setText(str5);
        String str6 = t0Var.f1819d.f143503n;
        if (str6 == null) {
            str6 = str2;
        }
        if (str6.length() == 0) {
            ((TextView) oVar.mo85812D(C0966R.C0970id.ndk)).setVisibility(8);
            ((TextView) oVar.mo85812D(C0966R.C0970id.ndk)).setText(str2);
        } else {
            ((TextView) oVar.mo85812D(C0966R.C0970id.ndk)).setVisibility(0);
            ((TextView) oVar.mo85812D(C0966R.C0970id.ndk)).setText(str6);
        }
        String str7 = t0Var.f1819d.f143504o;
        if (str7 != null) {
            str2 = str7;
        }
        ((TextView) oVar.mo85812D(C0966R.C0970id.ndm)).setText(str2);
        View D4 = oVar.mo85812D(C0966R.C0970id.ndo);
        C87412m.m108593f(D4, "holder.getView(R.id.ec_source_user_nickname)");
        TextView textView3 = (TextView) D4;
        View D5 = oVar.mo85812D(C0966R.C0970id.ndn);
        C87412m.m108593f(D5, "holder.getView(R.id.ec_source_status)");
        textView3.getViewTreeObserver().addOnPreDrawListener(new C14586o4(textView3, this, (TextView) D5));
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        C85875k4.m106189j0(((TextView) oVar.mo85812D(C0966R.C0970id.ndo)).getPaint(), 0.8f);
    }
}
