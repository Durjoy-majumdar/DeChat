package gl3;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fts.p059ui.C68987c;
import com.tencent.p014mm.plugin.fts.p059ui.C93938f0;
import gl3.C75922b;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: gl3.p */
public class C75952p extends C75921a {

    /* renamed from: B */
    public CharSequence f222724B;

    /* renamed from: C */
    public C75922b.C75924b f222725C = new C75954b();

    /* renamed from: D */
    public C75922b.C75923a f222726D = new C75953a(this);

    /* renamed from: gl3.p$a */
    public class C75953a implements C75922b.C75923a {

        /* renamed from: a */
        public View f222727a;

        /* renamed from: b */
        public TextView f222728b;

        public C75953a(C75952p pVar) {
        }
    }

    /* renamed from: gl3.p$b */
    public class C75954b implements C75922b.C75924b {
        public C75954b() {
        }

        /* renamed from: a */
        public void mo67029a(Context context, C75922b.C75923a aVar, C75922b bVar, boolean z, boolean z2) {
            C75953a aVar2 = (C75953a) aVar;
            C93938f0.m118693a(((C75952p) bVar).f222724B, aVar2.f222728b);
            if (C75952p.this.f222605b == 0) {
                View view = aVar2.f222727a;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/ui/contact/item/CreateChatroomDataItem$CreateChatroomViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem$BaseContactViewHolder;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/ui/contact/item/CreateChatroomDataItem$CreateChatroomViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem$BaseContactViewHolder;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            View view3 = aVar2.f222727a;
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar4.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/ui/contact/item/CreateChatroomDataItem$CreateChatroomViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem$BaseContactViewHolder;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/ui/contact/item/CreateChatroomDataItem$CreateChatroomViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem$BaseContactViewHolder;Lcom/tencent/mm/ui/contact/item/BaseContactDataItem;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        /* renamed from: b */
        public View mo67030b(Context context, ViewGroup viewGroup, View view) {
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.bwg, viewGroup, false);
            C75953a aVar = (C75953a) C75952p.this.f222726D;
            aVar.f222728b = (TextView) inflate.findViewById(C0966R.C0970id.c2h);
            aVar.f222727a = inflate.findViewById(C0966R.C0970id.eup);
            inflate.setTag(aVar);
            return inflate;
        }

        /* renamed from: c */
        public boolean mo67031c(Context context, View view, C75922b bVar) {
            return false;
        }
    }

    public C75952p(int i) {
        super(5, i);
    }

    /* renamed from: a */
    public void mo67027a(Context context, C75922b.C75923a aVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (String str : this.f222603z.f292122c) {
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new ForegroundColorSpan(C68987c.f198231a), 0, str.length(), 33);
            spannableStringBuilder.append(spannableString);
            spannableStringBuilder.append("、");
        }
        this.f222724B = TextUtils.concat(new CharSequence[]{context.getString(C0966R.string.iij), spannableStringBuilder.subSequence(0, spannableStringBuilder.length() - 1), context.getString(C0966R.string.iij)});
    }

    /* renamed from: b */
    public C75922b.C75924b mo67028b() {
        return this.f222725C;
    }
}
