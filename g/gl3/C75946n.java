package gl3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.fts.p059ui.C93938f0;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import gl3.C75922b;
import he0.C76158j;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import p196ln.C76705f;
import p629ny.C76979h;

/* renamed from: gl3.n */
public class C75946n extends C75921a {

    /* renamed from: B */
    public CharSequence f222702B;

    /* renamed from: C */
    public int f222703C = 0;

    /* renamed from: D */
    public C75948b f222704D = new C75948b();

    /* renamed from: E */
    public C75947a f222705E = new C75947a(this);

    /* renamed from: gl3.n$a */
    public class C75947a implements C75922b.C75923a {

        /* renamed from: a */
        public ImageView f222706a;

        /* renamed from: b */
        public TextView f222707b;

        /* renamed from: c */
        public TextView f222708c;

        /* renamed from: d */
        public CheckBox f222709d;

        /* renamed from: e */
        public RelativeLayout f222710e;

        /* renamed from: f */
        public LinearLayout f222711f;

        /* renamed from: g */
        public View f222712g;

        public C75947a(C75946n nVar) {
        }
    }

    /* renamed from: gl3.n$b */
    public class C75948b implements C75922b.C75924b {
        public C75948b() {
        }

        /* renamed from: a */
        public void mo67029a(Context context, C75922b.C75923a aVar, C75922b bVar, boolean z, boolean z2) {
            C75946n nVar = (C75946n) bVar;
            C75947a aVar2 = (C75947a) aVar;
            aVar2.f222707b.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            C75946n nVar2 = C75946n.this;
            int i = nVar2.f222703C;
            if (i == 0 || nVar2.f222702B == null) {
                C93938f0.m118693a(nVar.f222601x, aVar2.f222707b);
                if (C72996z1.m85843n5(nVar.f222602y) || C72996z1.m85846q5(nVar.f222602y)) {
                    C86709a0.m107528h();
                    C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(nVar.f222602y);
                    ((C76158j) C86312j.m106911c(C76158j.class)).mo106359LW(context, aVar2.f222707b, nVar.f222601x, z1Var.mo73980x2(), z1Var.mo73976t2(), (int) aVar2.f222707b.getTextSize());
                }
                ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(aVar2.f222706a, nVar.f222602y);
                if (C45628s0.m50748M(nVar.f222602y)) {
                    Drawable drawable = context.getResources().getDrawable(C0966R.raw.open_im_main_logo);
                    drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                    aVar2.f222707b.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                } else {
                    aVar2.f222707b.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                }
                if (aVar2.f222712g != null) {
                    if (C72996z1.m85813P4(nVar.f222602y) || C72996z1.m85845p5(nVar.f222602y)) {
                        View view = aVar2.f222712g;
                        C9556a aVar3 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar3.mo10233c(0);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/ui/contact/item/ConversationDataItem$ConversationViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem$BaseContactViewHolder;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/ui/contact/item/ConversationDataItem$ConversationViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem$BaseContactViewHolder;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        View view3 = aVar2.f222712g;
                        C9556a aVar4 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar4.mo10233c(8);
                        C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/ui/contact/item/ConversationDataItem$ConversationViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem$BaseContactViewHolder;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                        C117292a.m165359e(view3, "com/tencent/mm/ui/contact/item/ConversationDataItem$ConversationViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem$BaseContactViewHolder;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                if (TextUtils.isEmpty(nVar.f222609f)) {
                    aVar2.f222708c.setVisibility(8);
                } else {
                    aVar2.f222708c.setVisibility(0);
                    aVar2.f222708c.setText(nVar.f222609f);
                }
                if (!C75946n.this.f222608e) {
                    aVar2.f222709d.setVisibility(8);
                } else if (C72996z1.m85813P4(nVar.f222602y) || C72996z1.m85845p5(nVar.f222602y)) {
                    aVar2.f222709d.setVisibility(4);
                } else {
                    if (z) {
                        aVar2.f222709d.setChecked(true);
                        aVar2.f222709d.setEnabled(false);
                        aVar2.f222709d.setBackgroundResource(C85875k4.m106211z() ? C0966R.raw.checkbox_selected_grey_dark : C0966R.raw.checkbox_selected_grey);
                    } else {
                        aVar2.f222709d.setChecked(z2);
                        aVar2.f222709d.setEnabled(true);
                    }
                    aVar2.f222709d.setVisibility(0);
                }
                if (C75946n.this.f222615l) {
                    aVar2.f222710e.setBackground((Drawable) null);
                }
                if (C75946n.this.f222616m) {
                    aVar2.f222711f.setBackgroundColor(context.getResources().getColor(C0966R.color.BW_97));
                } else {
                    aVar2.f222711f.setBackground((Drawable) null);
                }
            } else {
                aVar2.f222706a.setImageResource(i);
                aVar2.f222707b.setText(C75946n.this.f222702B);
            }
        }

        /* renamed from: b */
        public View mo67030b(Context context, ViewGroup viewGroup, View view) {
            View inflate = C76577a.m92147C(context) ? LayoutInflater.from(context).inflate(C0966R.C0971layout.bwf, viewGroup, false) : LayoutInflater.from(context).inflate(C0966R.C0971layout.bwe, viewGroup, false);
            C75947a aVar = C75946n.this.f222705E;
            aVar.f222706a = (ImageView) inflate.findViewById(C0966R.C0970id.a27);
            aVar.f222707b = (TextView) inflate.findViewById(C0966R.C0970id.kpm);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.c2h);
            aVar.f222708c = textView;
            textView.setVisibility(8);
            aVar.f222709d = (CheckBox) inflate.findViewById(C0966R.C0970id.j9g);
            aVar.f222710e = (RelativeLayout) inflate.findViewById(C0966R.C0970id.c8a);
            aVar.f222711f = (LinearLayout) inflate.findViewById(C0966R.C0970id.j_7);
            aVar.f222712g = inflate.findViewById(C0966R.C0970id.isy);
            aVar.f222706a.setImportantForAccessibility(2);
            inflate.setTag(aVar);
            return inflate;
        }

        /* renamed from: c */
        public boolean mo67031c(Context context, View view, C75922b bVar) {
            return false;
        }
    }

    public C75946n(int i) {
        super(4, i);
    }

    /* renamed from: a */
    public void mo67027a(Context context, C75922b.C75923a aVar) {
        if (this.f222703C != 0 && this.f222702B != null) {
            return;
        }
        if (this.f222600A == null) {
            this.f222601x = "";
            this.f222602y = "";
            return;
        }
        this.f222601x = ((C76979h) C86312j.m106911c(C76979h.class)).op0(context, ((C75339i) C86312j.m106911c(C75339i.class)).mo62520pi(this.f222600A), C76577a.m92157h(context, C0966R.dimen.f3927j7));
        this.f222602y = this.f222600A.getUsername();
    }

    /* renamed from: b */
    public C75922b.C75924b mo67028b() {
        return this.f222704D;
    }
}
