package pf2;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.neattextview.textview.layout.NeatLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import nf2.C47240a;
import p629ny.C76979h;
import te3.C49699hg;
import yr3.C79150a;

/* renamed from: pf2.r */
public final class C47493r extends RecyclerView.C16631z {

    /* renamed from: A */
    public final String f127414A = "FeaturedMsgSingleTextViewHolder";

    /* renamed from: B */
    public final Context f127415B;

    /* renamed from: C */
    public final int f127416C;

    /* renamed from: D */
    public final TextView f127417D;

    /* renamed from: E */
    public final View f127418E;

    /* renamed from: F */
    public final View f127419F;

    /* renamed from: G */
    public final TextView f127420G;

    /* renamed from: H */
    public final MMNeat7extView f127421H;

    /* renamed from: I */
    public final TextView f127422I;

    /* renamed from: z */
    public final C47240a f127423z;

    /* renamed from: pf2.r$a */
    public static final class C47494a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C49699hg f127424d;

        /* renamed from: e */
        public final /* synthetic */ C47493r f127425e;

        public C47494a(C49699hg hgVar, C47493r rVar) {
            this.f127424d = hgVar;
            this.f127425e = rVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleTextViewHolder$fillingText$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C49699hg hgVar = this.f127424d;
            if (!hgVar.f134608j) {
                hgVar.f134608j = true;
                this.f127425e.f127421H.setMaxLines(Integer.MAX_VALUE);
                this.f127425e.f127422I.setText(C0966R.string.f360192ap3);
            } else {
                hgVar.f134608j = false;
                C47493r rVar = this.f127425e;
                rVar.f127421H.setMaxLines(rVar.f127416C - 1);
                this.f127425e.f127422I.setText(C0966R.string.ap4);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleTextViewHolder$fillingText$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47493r(C47240a aVar, View view) {
        super(view);
        C87412m.m108594g(aVar, "adapter");
        C87412m.m108594g(view, "itemView");
        this.f127423z = aVar;
        this.f127415B = aVar.f126805d;
        this.f127416C = 4;
        this.f127417D = (TextView) view.findViewById(C0966R.C0970id.iks);
        this.f127418E = view.findViewById(C0966R.C0970id.hmb);
        this.f127419F = view.findViewById(C0966R.C0970id.ikt);
        this.f127420G = (TextView) view.findViewById(C0966R.C0970id.ikv);
        this.f127421H = (MMNeat7extView) view.findViewById(C0966R.C0970id.aek);
        this.f127422I = (TextView) view.findViewById(C0966R.C0970id.ael);
    }

    /* renamed from: y */
    public final void mo72501y(String str, C49699hg hgVar) {
        SpannableString qu = ((C76979h) C86312j.m106911c(C76979h.class)).mo107081qu(this.f127421H.getContext(), str, (int) this.f127421H.getTextSize());
        this.f127421H.setMaxLines(Integer.MAX_VALUE);
        this.f127421H.mo104279b(qu);
        this.f127421H.setSpacingAdd(C76577a.m92151b(this.f127415B, 5));
        C79150a i = this.f127421H.mo154990i(C76577a.m92145A(this.f127415B) - C76577a.m92151b(this.f127415B, 72), Integer.MAX_VALUE);
        int i2 = i != null ? ((NeatLayout) i).f319992L : 0;
        int i3 = this.f127416C;
        if (i2 > i3) {
            this.f127421H.setMaxLines(i3 - 1);
            this.f127422I.setVisibility(0);
            this.f127422I.setText(C0966R.string.ap4);
            this.f127422I.setOnClickListener(new C47494a(hgVar, this));
        } else {
            this.f127421H.setMaxLines(Integer.MAX_VALUE);
            this.f127422I.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = this.f127421H.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        if (i2 <= 3) {
            layoutParams2.gravity = 17;
        } else {
            layoutParams2.gravity = 19;
        }
        this.f127421H.setLayoutParams(layoutParams2);
    }
}
