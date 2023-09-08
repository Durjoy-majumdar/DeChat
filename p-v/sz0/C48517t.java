package sz0;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.card.widget.MemberCardTopCropImageView;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import gy3.C87412m;

/* renamed from: sz0.t */
public final class C48517t extends RecyclerView.C16631z {

    /* renamed from: A */
    public int f129764A;

    /* renamed from: B */
    public CdnImageView f129765B;

    /* renamed from: C */
    public TextView f129766C;

    /* renamed from: D */
    public TextView f129767D;

    /* renamed from: E */
    public MemberCardTopCropImageView f129768E;

    /* renamed from: F */
    public LinearLayout f129769F;

    /* renamed from: G */
    public ImageView f129770G;

    /* renamed from: z */
    public int f129771z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48517t(View view, int i) {
        super(view);
        C87412m.m108594g(view, "itemView");
        if (i == 0) {
            View findViewById = view.findViewById(C0966R.C0970id.avm);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.id.card_list_header_text)");
            this.f129766C = (TextView) findViewById;
        } else if (i == 1) {
            View findViewById2 = view.findViewById(C0966R.C0970id.f357716be1);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.clni_icon_iv)");
            this.f129765B = (CdnImageView) findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.f357718be3);
            C87412m.m108593f(findViewById3, "itemView.findViewById(R.id.clni_title_tv)");
            this.f129766C = (TextView) findViewById3;
            C85875k4.m106189j0(mo73150C().getPaint(), 0.8f);
            View findViewById4 = view.findViewById(C0966R.C0970id.f357715be0);
            C87412m.m108593f(findViewById4, "itemView.findViewById(R.id.clni_desc_tv)");
            this.f129767D = (TextView) findViewById4;
            mo73149B().setUseSdcardCache(true);
        } else if (i == 2) {
            View findViewById5 = view.findViewById(C0966R.C0970id.bxh);
            C87412m.m108593f(findViewById5, "itemView.findViewById(R.id.ctci_logo_iv)");
            this.f129765B = (CdnImageView) findViewById5;
            View findViewById6 = view.findViewById(C0966R.C0970id.bxj);
            C87412m.m108593f(findViewById6, "itemView.findViewById(R.id.ctci_title_tv)");
            this.f129766C = (TextView) findViewById6;
            C85875k4.m106189j0(mo73150C().getPaint(), 0.8f);
            View findViewById7 = view.findViewById(C0966R.C0970id.bxg);
            C87412m.m108593f(findViewById7, "itemView.findViewById(R.id.ctci_desc_tv)");
            this.f129767D = (TextView) findViewById7;
            View findViewById8 = view.findViewById(C0966R.C0970id.bxe);
            C87412m.m108593f(findViewById8, "itemView.findViewById(R.id.ctci_bg_iv)");
            this.f129768E = (MemberCardTopCropImageView) findViewById8;
            View findViewById9 = view.findViewById(C0966R.C0970id.bxf);
            C87412m.m108593f(findViewById9, "itemView.findViewById(R.id.ctci_bg_shadow_iv)");
            this.f129770G = (ImageView) findViewById9;
            View findViewById10 = view.findViewById(C0966R.C0970id.bxi);
            C87412m.m108593f(findViewById10, "itemView.findViewById(R.….ctci_right_label_layout)");
            this.f129769F = (LinearLayout) findViewById10;
            mo73149B().setUseSdcardCache(true);
        } else if (i == 3) {
            View findViewById11 = view.findViewById(C0966R.C0970id.f357718be3);
            C87412m.m108593f(findViewById11, "itemView.findViewById(R.id.clni_title_tv)");
            this.f129766C = (TextView) findViewById11;
            C85875k4.m106189j0(mo73150C().getPaint(), 0.8f);
            View findViewById12 = view.findViewById(C0966R.C0970id.f357715be0);
            C87412m.m108593f(findViewById12, "itemView.findViewById(R.id.clni_desc_tv)");
            this.f129767D = (TextView) findViewById12;
        }
    }

    /* renamed from: B */
    public final CdnImageView mo73149B() {
        CdnImageView cdnImageView = this.f129765B;
        if (cdnImageView != null) {
            return cdnImageView;
        }
        C87412m.m108603p("logoIv");
        throw null;
    }

    /* renamed from: C */
    public final TextView mo73150C() {
        TextView textView = this.f129766C;
        if (textView != null) {
            return textView;
        }
        C87412m.m108603p("titleTv");
        throw null;
    }

    /* renamed from: y */
    public final MemberCardTopCropImageView mo73151y() {
        MemberCardTopCropImageView memberCardTopCropImageView = this.f129768E;
        if (memberCardTopCropImageView != null) {
            return memberCardTopCropImageView;
        }
        C87412m.m108603p("bgIv");
        throw null;
    }

    /* renamed from: z */
    public final TextView mo73152z() {
        TextView textView = this.f129767D;
        if (textView != null) {
            return textView;
        }
        C87412m.m108603p("descTv");
        throw null;
    }
}
