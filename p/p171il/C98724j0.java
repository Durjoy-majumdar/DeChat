package p171il;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import gc0.C20828a;
import gy3.C87412m;
import hc0.C20937c;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import p813fl.C97903f0;
import p813fl.C97906h;
import p813fl.C97927q0;
import te3.C49978jd3;

/* renamed from: il.j0 */
public final class C98724j0 extends C98748z<C97903f0> {

    /* renamed from: B */
    public final C97906h f289484B;

    /* renamed from: C */
    public final TextView f289485C;

    /* renamed from: D */
    public final View f289486D;

    /* renamed from: E */
    public final TextView f289487E;

    /* renamed from: F */
    public final ImageView f289488F;

    /* renamed from: G */
    public final View f289489G;

    /* renamed from: H */
    public final int f289490H;

    /* renamed from: il.j0$a */
    public static final class C98725a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C98724j0 f289491d;

        public C98725a(C98724j0 j0Var) {
            this.f289491d = j0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/emoji/panel/adapter/TitlePanelViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C98744t tVar = this.f289491d.f289540z;
            if (tVar != null) {
                Context context = view.getContext();
                C87412m.m108593f(context, "it.context");
                tVar.mo127711c(view, context, this.f289491d.mo17363j(), this.f289491d.f289539A);
            }
            C117292a.m165361g(this, "com/tencent/mm/emoji/panel/adapter/TitlePanelViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98724j0(View view, C98744t tVar, C97906h hVar) {
        super(view, tVar);
        C87412m.m108594g(view, "itemView");
        this.f289484B = hVar;
        View findViewById = view.findViewById(C0966R.C0970id.cgw);
        C87412m.m108593f(findViewById, "itemView.findViewById(R.…ji_panel_title_item_text)");
        this.f289485C = (TextView) findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.cgt);
        C87412m.m108593f(findViewById2, "itemView.findViewById(R.…nel_title_designer_group)");
        this.f289486D = findViewById2;
        View findViewById3 = view.findViewById(C0966R.C0970id.cgs);
        C87412m.m108593f(findViewById3, "itemView.findViewById(R.…oji_panel_title_designer)");
        this.f289487E = (TextView) findViewById3;
        View findViewById4 = view.findViewById(C0966R.C0970id.cgu);
        C87412m.m108593f(findViewById4, "itemView.findViewById(R.…anel_title_designer_icon)");
        this.f289488F = (ImageView) findViewById4;
        View findViewById5 = view.findViewById(C0966R.C0970id.cgv);
        C87412m.m108593f(findViewById5, "itemView.findViewById(R.…l_title_designer_red_dot)");
        this.f289489G = findViewById5;
        this.f289490H = C76577a.m92151b(view.getContext(), 12);
        view.setOnClickListener((View.OnClickListener) null);
        findViewById2.setOnClickListener(new C98725a(this));
    }

    /* renamed from: y */
    public void mo136856y(C97927q0 q0Var) {
        C97927q0 q0Var2 = q0Var;
        C87412m.m108594g(q0Var2, "item");
        this.f289539A = q0Var2;
        C97906h hVar = this.f289484B;
        if (hVar != null && hVar.f287216m) {
            View view = this.f44854d;
            view.setPadding(view.getPaddingLeft(), 0, this.f44854d.getPaddingRight(), this.f44854d.getPaddingBottom());
        } else {
            View view2 = this.f44854d;
            view2.setPadding(view2.getPaddingLeft(), this.f289490H, this.f44854d.getPaddingRight(), this.f44854d.getPaddingBottom());
        }
        C97903f0 f0Var = (C97903f0) this.f289539A;
        if (f0Var != null) {
            this.f289485C.setText(f0Var.f287197b.mo137251e());
            this.f289485C.setContentDescription(f0Var.f287197b.mo137251e());
            C49978jd3 jd32 = f0Var.f287198c;
            if (jd32 != null) {
                this.f289487E.setVisibility(0);
                this.f289487E.setText(jd32.f136020e);
                View view3 = this.f289486D;
                view3.setContentDescription(jd32.f136020e + this.f289486D.getContext().getString(C0966R.string.c4o));
                TextView textView = this.f289485C;
                textView.setContentDescription(this.f289485C.getContext().getString(C0966R.string.c7t) + f0Var.f287197b.mo137251e());
                this.f289488F.setVisibility(0);
                this.f289488F.setImageDrawable((Drawable) null);
                C20828a b = C20828a.m22825b();
                String str = jd32.f136021f;
                ImageView imageView = this.f289488F;
                C20937c.C20939b bVar = new C20937c.C20939b();
                bVar.f59345a = true;
                bVar.f59346b = true;
                bVar.f59364t = true;
                b.mo32519h(str, imageView, bVar.mo32666a());
                if (f0Var.f287199d) {
                    View view4 = this.f289489G;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view5 = view4;
                    C117292a.m165358d(view5, aVar.mo10232b(), "com/tencent/mm/emoji/panel/adapter/TitlePanelViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view5, "com/tencent/mm/emoji/panel/adapter/TitlePanelViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                View view6 = this.f289489G;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view7 = view6;
                C117292a.m165358d(view7, aVar2.mo10232b(), "com/tencent/mm/emoji/panel/adapter/TitlePanelViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "com/tencent/mm/emoji/panel/adapter/TitlePanelViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            this.f289488F.setImageDrawable((Drawable) null);
            this.f289488F.setVisibility(8);
            this.f289487E.setVisibility(8);
            View view8 = this.f289489G;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view9 = view8;
            C117292a.m165358d(view9, aVar3.mo10232b(), "com/tencent/mm/emoji/panel/adapter/TitlePanelViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view9, "com/tencent/mm/emoji/panel/adapter/TitlePanelViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
