package ez2;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import az2.C39674e;
import b03.C39693c0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import kg3.C76577a;
import nz2.C47313a;
import p196ln.C76705f;
import sz2.C13816a;
import yz2.C53673f2;

/* renamed from: ez2.b */
public final class C45722b extends C60896i<C13816a> {

    /* renamed from: e */
    public final C32224a<Integer> f123555e;

    public C45722b(C32224a<Integer> aVar) {
        this.f123555e = aVar;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.c9i;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        String str;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g((C13816a) cVar, "item");
        ImageView imageView = (ImageView) oVar.mo85812D(C0966R.C0970id.f1g);
        imageView.setImageResource(C0966R.raw.default_avatar);
        C47313a f0 = C39674e.f106452d.mo62248f0();
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.f359430kw3);
        int a = f0.mo72361a();
        String str2 = "";
        textView.setText(a != 1 ? a != 2 ? str2 : oVar.f173499A.getString(C0966R.string.f361455k13) : oVar.f173499A.getString(C0966R.string.f361456k14, new Object[]{Integer.valueOf(f0.f126986b)}));
        if (f0.f126986b > 0) {
            str2 = f0.f126987c;
        } else {
            C47313a.C47314a aVar = f0.f126985a;
            if (!(aVar == null || (str = aVar.f126988a) == null)) {
                str2 = str;
            }
        }
        ((C76705f) C86312j.m106911c(C76705f.class)).D20(imageView, str2, 0.1f);
        View view = oVar.f44854d;
        FrameLayout frameLayout = view instanceof FrameLayout ? (FrameLayout) view : null;
        if (frameLayout != null) {
            C39818r rVar = C39818r.f106831a;
            Context context = oVar.f173499A;
            C87412m.m108593f(context, "holder.context");
            ArrayList<Object> arrayList = ((C53673f2) rVar.mo62443b(context).mo75002a(C53673f2.class)).f150746d;
            if (arrayList.size() > 1 && (arrayList.get(0) instanceof C13816a)) {
                arrayList.get(1);
            }
            frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), C76577a.m92157h(oVar.f173499A, C0966R.dimen.f3736cp));
        }
        oVar.mo85812D(C0966R.C0970id.fjk).setOnClickListener(new C45721a(oVar, this));
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        View D = oVar.mo85812D(C0966R.C0970id.fjk);
        float b = (float) C76577a.m92151b(recyclerView.getContext(), 4);
        boolean z = false;
        boolean z2 = true & true;
        if (true && true) {
            z = true;
        }
        if (D != null) {
            D.setOutlineProvider(new C39693c0(z2, z, b));
        }
        if (D != null) {
            D.setClipToOutline(true);
        }
    }
}
