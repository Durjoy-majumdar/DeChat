package p61;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.emoji.p040ui.p319v3.EmojiStoreV3SingleProductRecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kg3.C76577a;
import n61.C100090f;
import rx3.C13598b0;
import te3.C101754a80;
import u61.C101962d;
import zp3.C79406f;
import zt3.C119157j;

/* renamed from: p61.u */
public final class C100679u extends C100657j<C100651h0> {

    /* renamed from: B */
    public final Context f294978B;

    /* renamed from: C */
    public final C100668o f294979C;

    /* renamed from: D */
    public final String f294980D = "MicroMsg.EmojiStoreV3SingleProductAlbumHolder";

    /* renamed from: E */
    public final TextView f294981E;

    /* renamed from: F */
    public final EmojiStoreV3SingleProductRecyclerView f294982F;

    /* renamed from: G */
    public final GridLayoutManager f294983G;

    /* renamed from: H */
    public final C100674s f294984H;

    /* renamed from: I */
    public boolean f294985I;

    /* renamed from: J */
    public final Drawable f294986J;

    /* renamed from: p61.u$a */
    public static final class C100680a extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<List<C100659j0>> f294987d;

        /* renamed from: e */
        public final /* synthetic */ C100684y f294988e;

        /* renamed from: f */
        public final /* synthetic */ C100679u f294989f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100680a(C8479f0<List<C100659j0>> f0Var, C100684y yVar, C100679u uVar) {
            super(1);
            this.f294987d = f0Var;
            this.f294988e = yVar;
            this.f294989f = uVar;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            T t = this.f294987d.f27484d;
            C100679u uVar = this.f294989f;
            C100684y yVar = this.f294988e;
            List list = (List) t;
            if ((!list.isEmpty()) && uVar.f294984H.f294957e.size() > intValue) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(list.subList(0, intValue));
                String str = uVar.f294980D;
                StringBuilder sb = new StringBuilder();
                sb.append("setId:");
                C101754a80 a802 = ((C100651h0) yVar).f294865b;
                sb.append(a802 != null ? Integer.valueOf(a802.f297841g) : null);
                sb.append(", spanCount changed, new spanCount:");
                sb.append(intValue);
                sb.append(", adapter try change data");
                Log.m105924i(str, sb.toString());
                ((C119157j) C119157j.f356862d).mo183895z(new C100678t(uVar, arrayList));
            }
            ((C100651h0) this.f294988e).f294866c = intValue;
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100679u(Context context, View view, C100640a0 a0Var, C100668o oVar) {
        super(view, a0Var);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(view, "itemView");
        C87412m.m108594g(oVar, "itemSizeResolver");
        this.f294978B = context;
        this.f294979C = oVar;
        View findViewById = view.findViewById(C0966R.C0970id.f359220m72);
        C87412m.m108593f(findViewById, "itemView.findViewById(R.…product_album_item_title)");
        this.f294981E = (TextView) findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.f359218m70);
        C87412m.m108593f(findViewById2, "itemView.findViewById(R.…_product_album_item_more)");
        ImageView imageView = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(C0966R.C0970id.f359219m71);
        C87412m.m108593f(findViewById3, "itemView.findViewById(R.…le_product_album_item_rv)");
        this.f294982F = (EmojiStoreV3SingleProductRecyclerView) findViewById3;
        this.f294983G = new GridLayoutManager(context, oVar.f294934c);
        this.f294984H = new C100674s(context, new ArrayList());
        this.f294985I = true;
        int d = C76577a.m92153d(context, C0966R.color.BW_100);
        int d2 = C76577a.m92153d(context, C0966R.color.BW_0_Alpha_0_0_5);
        float a = (float) C79406f.m96347a(context, 8.0f);
        this.f294986J = C101962d.f300168a.mo141484b(d, d2, a, a, a, a);
    }

    /* renamed from: y */
    public void mo140091y(C100684y yVar, List<Object> list) {
        C87412m.m108594g(yVar, "item");
        C87412m.m108594g(list, "payloads");
        super.mo140091y(yVar, list);
        this.f44854d.setBackground(this.f294986J);
        String str = null;
        C100651h0 h0Var = yVar instanceof C100651h0 ? (C100651h0) yVar : null;
        C8479f0 f0Var = new C8479f0();
        T t = h0Var != null ? h0Var.f294864a : null;
        f0Var.f27484d = t;
        if (t != null && !((List) t).isEmpty() && h0Var != null) {
            TextView textView = this.f294981E;
            C101754a80 a802 = h0Var.f294865b;
            if (a802 != null) {
                str = a802.f297839e;
            }
            textView.setText(str);
            C85875k4.m106191k0(this.f294981E.getPaint());
            this.f294984H.f294957e.clear();
            if (this.f294985I) {
                this.f294985I = false;
                Resources resources = this.f294978B.getResources();
                this.f294982F.setSizeResolver(this.f294979C);
                this.f294982F.mo17085h0(new C100090f((int) resources.getDimension(C0966R.dimen.f3736cp), 0, 0, this.f294979C));
                this.f294982F.setAdapter(this.f294984H);
                this.f294984H.f294959g = this.f294875z;
                this.f294982F.setLayoutManager(this.f294983G);
                this.f294982F.setOnSizeChangedCallback(new C100680a(f0Var, yVar, this));
            }
            this.f294984H.f294957e.addAll((Collection) f0Var.f27484d);
            this.f294984H.notifyItemRangeChanged(0, ((List) f0Var.f27484d).size());
            ((C100651h0) yVar).f294866c = this.f294979C.f294934c;
        }
    }
}
