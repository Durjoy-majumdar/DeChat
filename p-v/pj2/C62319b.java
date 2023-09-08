package pj2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.widget.MMRoundCornerImageView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.gif.MMAnimateView;
import d62.C75339i;
import di3.C86312j;
import ek2.C58622h;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import kg3.C76577a;
import nj2.C61767o;
import nj2.C61768p;
import p196ln.C76705f;
import rj2.C63447a;
import wj2.C66132f;

/* renamed from: pj2.b */
public final class C62319b extends C60896i<C62318a> {

    /* renamed from: e */
    public C62320a f177146e;

    /* renamed from: pj2.b$a */
    public interface C62320a {
        /* renamed from: a */
        void mo80838a(C62318a aVar, C60905o oVar);
    }

    /* renamed from: pj2.b$b */
    public final class C62321b extends C60905o {

        /* renamed from: G */
        public final C58622h f177147G;

        /* renamed from: H */
        public final TextView f177148H;

        /* renamed from: I */
        public final MMRoundCornerImageView f177149I;

        /* renamed from: J */
        public final WeImageView f177150J;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62321b(C62319b bVar, View view) {
            super(view);
            C87412m.m108594g(view, "view");
            View findViewById = view.findViewById(C0966R.C0970id.iuv);
            C87412m.m108593f(findViewById, "view.findViewById(R.id.ringtone_play_iv)");
            this.f177147G = new C58622h((MMAnimateView) findViewById);
            View findViewById2 = view.findViewById(C0966R.C0970id.f357943cm0);
            C87412m.m108593f(findViewById2, "view.findViewById(R.id.e…lusive_ringtone_username)");
            this.f177148H = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.clz);
            C87412m.m108593f(findViewById3, "view.findViewById(R.id.exclusive_ringtone_user_iv)");
            this.f177149I = (MMRoundCornerImageView) findViewById3;
            View findViewById4 = view.findViewById(C0966R.C0970id.iur);
            C87412m.m108593f(findViewById4, "view.findViewById(R.id.ringtone_more_op_iv)");
            this.f177150J = (WeImageView) findViewById4;
        }
    }

    /* renamed from: b */
    public C60905o mo25318b(RecyclerView recyclerView, View view) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(view, "convertView");
        return new C62321b(this, view);
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.bxc;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C66132f d;
        Resources resources;
        Resources resources2;
        C62318a aVar = (C62318a) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(aVar, "exclusive");
        if (oVar instanceof C62321b) {
            boolean z2 = false;
            if (!(list == null || list.isEmpty())) {
                C62321b bVar = (C62321b) oVar;
                Object obj = list.get(0);
                Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                if (bool != null) {
                    z2 = bool.booleanValue();
                }
                mo87401j(bVar, z2, aVar);
                return;
            }
            C62321b bVar2 = (C62321b) oVar;
            String str = aVar.f177144d.f147588d;
            if (str != null) {
                ((C76705f) C86312j.m106911c(C76705f.class)).zv0(bVar2.f177149I, str);
                bVar2.f177148H.setText(((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(str));
                WeImageView weImageView = bVar2.f177150J;
                Context context = bVar2.f44854d.getContext();
                Context context2 = bVar2.f44854d.getContext();
                int i3 = -16777216;
                weImageView.setImageDrawable(C74933u4.m89768e(context, C0966R.raw.icons_filled_more, (context2 == null || (resources2 = context2.getResources()) == null) ? -16777216 : resources2.getColor(C0966R.color.FG_0)));
                WeImageView weImageView2 = bVar2.f177150J;
                Context context3 = bVar2.f44854d.getContext();
                if (!(context3 == null || (resources = context3.getResources()) == null)) {
                    i3 = resources.getColor(C0966R.color.FG_0);
                }
                weImageView2.setIconColor(i3);
                bVar2.f177150J.setOnClickListener(new C62322c(this, aVar, bVar2));
            }
            String str2 = aVar.f177144d.f147588d;
            if (!(str2 == null || ((d = C61768p.m72477d(str2)) == null && (d = C63447a.m74787a((long) str2.hashCode())) == null))) {
                TextView textView = (TextView) bVar2.f44854d.findViewById(C0966R.C0970id.cly);
                ImageView imageView = (ImageView) bVar2.f44854d.findViewById(C0966R.C0970id.iud);
                C58622h hVar = bVar2.f177147G;
                hVar.getClass();
                hVar.f167845d = d;
                int h = C76577a.m92157h(hVar.f167844c, d.mo90179j() ? C0966R.dimen.f3703bv : C0966R.dimen.f3979m2);
                hVar.f167842a.setPadding(h, h, h, h);
                int i4 = d.mo90179j() ? C0966R.raw.icons_filled_specialplay : C0966R.raw.icons_filled_ringing;
                hVar.f167843b = i4;
                MMAnimateView mMAnimateView = hVar.f167842a;
                Context context4 = hVar.f167844c;
                mMAnimateView.setImageDrawable(C74933u4.m89768e(context4, i4, context4.getResources().getColor(C0966R.color.FG_0)));
                if (d.f190091n) {
                    if (textView != null) {
                        textView.setText(C76577a.m92166q(bVar2.f44854d.getContext(), C0966R.string.i5_));
                    }
                    if (textView != null) {
                        textView.setTextColor(C76577a.m92153d(bVar2.f44854d.getContext(), C0966R.color.FG_4));
                    }
                    if (imageView != null) {
                        Context context5 = bVar2.f44854d.getContext();
                        C87412m.m108593f(context5, "holder.itemView.context");
                        int d2 = C76577a.m92153d(context5, C0966R.color.a_e);
                        Drawable mutate = C76577a.m92158i(context5, C0966R.raw.icons_filled_error).mutate();
                        C87412m.m108593f(mutate, "getDrawable(context, drawableRes).mutate()");
                        mutate.setColorFilter(new PorterDuffColorFilter(Color.argb(Color.alpha(d2), Color.red(d2), Color.green(d2), Color.blue(d2)), PorterDuff.Mode.SRC_ATOP));
                        mutate.setAlpha(Color.alpha(d2));
                        imageView.setImageDrawable(mutate);
                    }
                    bVar2.f177147G.mo83505a(false);
                } else {
                    if (d.mo90179j()) {
                        if (textView != null) {
                            textView.setText(d.f190085h);
                        }
                    } else if (textView != null) {
                        StringBuilder sb = new StringBuilder();
                        String str3 = d.f190085h;
                        String str4 = "";
                        if (str3 == null) {
                            str3 = str4;
                        }
                        sb.append(str3);
                        sb.append(" - ");
                        String str5 = d.f190087j;
                        if (str5 != null) {
                            str4 = str5;
                        }
                        sb.append(str4);
                        textView.setText(sb.toString());
                    }
                    if (textView != null) {
                        textView.setTextColor(C76577a.m92153d(bVar2.f44854d.getContext(), C0966R.color.FG_0));
                    }
                    if (imageView != null) {
                        Context context6 = bVar2.f44854d.getContext();
                        C87412m.m108593f(context6, "holder.itemView.context");
                        int d3 = C76577a.m92153d(context6, C0966R.color.FG_0);
                        Drawable mutate2 = C76577a.m92158i(context6, C0966R.raw.icons_filled_ringing).mutate();
                        C87412m.m108593f(mutate2, "getDrawable(context, drawableRes).mutate()");
                        mutate2.setColorFilter(new PorterDuffColorFilter(Color.argb(Color.alpha(d3), Color.red(d3), Color.green(d3), Color.blue(d3)), PorterDuff.Mode.SRC_ATOP));
                        mutate2.setAlpha(Color.alpha(d3));
                        imageView.setImageDrawable(mutate2);
                    }
                    bVar2.f177147G.mo83505a(true);
                }
            }
            mo87401j(bVar2, aVar.f177145e, aVar);
        }
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }

    /* renamed from: j */
    public final void mo87401j(C62321b bVar, boolean z, C62318a aVar) {
        aVar.getClass();
        if (z) {
            C58622h hVar = bVar.f177147G;
            if (!hVar.f167842a.mo129223q()) {
                C66132f fVar = hVar.f167845d;
                boolean z2 = false;
                if (fVar != null && !fVar.mo90179j()) {
                    z2 = true;
                }
                if (z2) {
                    hVar.f167842a.setImageFilePath(C61767o.m72469e(true));
                    hVar.f167842a.mo129236w();
                    return;
                }
                return;
            }
            return;
        }
        C58622h hVar2 = bVar.f177147G;
        MMAnimateView mMAnimateView = hVar2.f167842a;
        Context context = hVar2.f167844c;
        mMAnimateView.setImageDrawable(C74933u4.m89768e(context, hVar2.f167843b, context.getResources().getColor(C0966R.color.FG_0)));
    }
}
