package f22;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import gy3.C87412m;
import java.util.regex.Pattern;
import jq3.C60905o;
import kg3.C76577a;
import lv1.C99672i;
import lv1.C99681n;
import p629ny.C76979h;
import z04.C112551y;
import zb2.C66777a;

/* renamed from: f22.a */
public final class C58909a extends C66777a<C58909a> {

    /* renamed from: d */
    public final int f168563d;

    /* renamed from: e */
    public final String f168564e = "MicroMsg.ContactDataItem";

    /* renamed from: f */
    public C99681n f168565f;

    /* renamed from: g */
    public String f168566g;

    /* renamed from: h */
    public CharSequence f168567h;

    /* renamed from: i */
    public CharSequence f168568i;

    /* renamed from: j */
    public String f168569j;

    /* renamed from: n */
    public C72996z1 f168570n;

    /* renamed from: o */
    public String f168571o;

    /* renamed from: p */
    public C99672i f168572p;

    /* renamed from: f22.a$a */
    public static final class C58910a extends C60905o {

        /* renamed from: G */
        public View f168573G;

        /* renamed from: H */
        public ImageView f168574H;

        /* renamed from: I */
        public TextView f168575I;

        /* renamed from: J */
        public TextView f168576J;

        /* renamed from: K */
        public CheckBox f168577K;

        /* renamed from: L */
        public ImageView f168578L;

        /* renamed from: M */
        public View f168579M;

        /* renamed from: N */
        public TextView f168580N;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58910a(View view) {
            super(view);
            C87412m.m108594g(view, "convertView");
            Context context = view.getContext();
            View findViewById = view.findViewById(C0966R.C0970id.a27);
            C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
            this.f168574H = (ImageView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.kpm);
            C87412m.m108592e(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            this.f168575I = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.c2h);
            C87412m.m108592e(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            this.f168576J = (TextView) findViewById3;
            this.f168573G = view.findViewById(C0966R.C0970id.brz);
            View findViewById4 = view.findViewById(C0966R.C0970id.j9g);
            C87412m.m108592e(findViewById4, "null cannot be cast to non-null type android.widget.CheckBox");
            this.f168577K = (CheckBox) findViewById4;
            this.f168578L = (ImageView) view.findViewById(C0966R.C0970id.bke);
            View findViewById5 = view.findViewById(C0966R.C0970id.f358885hn2);
            C87412m.m108592e(findViewById5, "null cannot be cast to non-null type android.widget.TextView");
            this.f168580N = (TextView) findViewById5;
            this.f168579M = view.findViewById(C0966R.C0970id.lxn);
            ImageView imageView = this.f168578L;
            if (imageView != null) {
                imageView.setImageDrawable(C74933u4.m89768e(context, C0966R.raw.sns_label_more_btn, context.getResources().getColor(C0966R.color.FG_4)));
            }
            ImageView imageView2 = this.f168578L;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            view.setTag(this);
        }
    }

    public C58909a(int i) {
        this.f168563d = i;
        Pattern.compile(",");
        int h = C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f3927j7);
        int h2 = C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f3881hq);
        TextPaint textPaint = new TextPaint();
        TextPaint textPaint2 = new TextPaint();
        textPaint.setTextSize((float) h);
        textPaint2.setTextSize((float) h2);
    }

    /* renamed from: Oa */
    public String mo344Oa() {
        C72996z1 z1Var = this.f168570n;
        return String.valueOf(z1Var != null ? z1Var.getUsername() : null);
    }

    /* renamed from: b */
    public final SpannableString mo84105b(Context context, String str, int i) {
        return ((C76979h) C86312j.m106911c(C76979h.class)).op0(context, str, i);
    }

    /* renamed from: c */
    public int mo75c() {
        return 2;
    }

    public Object clone() {
        return super.clone();
    }

    public int compareTo(Object obj) {
        C87412m.m108594g((C58909a) obj, "other");
        return 0;
    }

    /* renamed from: g5 */
    public boolean mo347g5(Object obj) {
        C58909a aVar = (C58909a) obj;
        C87412m.m108594g(aVar, "other");
        C72996z1 z1Var = this.f168570n;
        String username = z1Var != null ? z1Var.getUsername() : null;
        C72996z1 z1Var2 = aVar.f168570n;
        return C112551y.m153810j(username, z1Var2 != null ? z1Var2.getUsername() : null, false, 2, (Object) null);
    }
}
