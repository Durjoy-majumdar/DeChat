package om3;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.fts.p059ui.C93938f0;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import p196ln.C76705f;
import p196ln.C76707h;
import p278yh.C79116m;
import rx3.C13598b0;
import z04.C112551y;

/* renamed from: om3.a */
public final class C77019a extends C60896i<C77020b> {
    /* renamed from: c */
    public int mo43c() {
        return C76577a.m92147C(MMApplicationContext.getContext()) ? C0966R.C0971layout.bjn : C0966R.C0971layout.bjm;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C60905o oVar2 = oVar;
        C77020b bVar = (C77020b) cVar;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(bVar, "item");
        View view = oVar2.f44854d;
        C79116m mVar = new C79116m(view);
        String str = bVar.f225007f;
        C13598b0 b0Var = null;
        if (!(!C112551y.m153811k(str))) {
            str = null;
        }
        if (str != null) {
            C76705f fVar = (C76705f) C86312j.m106911c(C76705f.class);
            if (mVar.f232324f == null) {
                mVar.f232324f = (ImageView) view.findViewById(C0966R.C0970id.a27);
            }
            fVar.D20(mVar.f232324f, str, 0.1f);
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            if (mVar.f232324f == null) {
                mVar.f232324f = (ImageView) view.findViewById(C0966R.C0970id.a27);
            }
            mVar.f232324f.setImageBitmap(((C76707h) C86312j.m106911c(C76707h.class)).Vw0());
        }
        if (bVar.f225012n) {
            mVar.mo109060b().setVisibility(0);
            if (mVar.f232327i == null) {
                mVar.f232327i = (TextView) view.findViewById(C0966R.C0970id.evf);
            }
            mVar.f232327i.setText(bVar.f225013o);
        } else {
            mVar.mo109060b().setVisibility(8);
        }
        if (bVar.f225014p != 0) {
            mVar.mo109060b().setBackgroundColor(bVar.f225014p);
            if (mVar.f232327i == null) {
                mVar.f232327i = (TextView) view.findViewById(C0966R.C0970id.evf);
            }
            mVar.f232327i.setBackgroundColor(bVar.f225014p);
        }
        if (bVar.f225018t) {
            if (bVar.f225016r) {
                mVar.mo109061c().setChecked(true);
                mVar.mo109061c().setEnabled(false);
                mVar.mo109061c().setBackgroundResource(C85875k4.m106211z() ? C0966R.raw.checkbox_selected_grey_dark : C0966R.raw.checkbox_selected_grey);
            } else {
                mVar.mo109061c().setChecked(bVar.f225017s);
                mVar.mo109061c().setEnabled(true);
                mVar.mo109061c().setBackgroundResource(C0966R.C0969drawable.ag6);
            }
            mVar.mo109061c().setVisibility(0);
        } else {
            mVar.mo109061c().setVisibility(8);
        }
        if (bVar.f225020v && mVar.mo109061c().getVisibility() == 0) {
            mVar.mo109061c().setVisibility(4);
        }
        if (mVar.f232329k == null) {
            mVar.f232329k = (WeImageView) view.findViewById(C0966R.C0970id.isy);
        }
        mVar.f232329k.setVisibility(bVar.f225021w ? 0 : 8);
        if (bVar.f225015q) {
            if (C85875k4.m106211z()) {
                mVar.mo109059a().setBackgroundResource(C0966R.color.a1j);
            } else {
                mVar.mo109059a().setBackgroundResource(C0966R.color.a1i);
            }
            View a = mVar.mo109059a();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = a;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/mvvm/item/SelectContactItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/mvvm/item/SelectContactListItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            a.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/mvvm/item/SelectContactItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/mvvm/item/SelectContactListItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View a2 = mVar.mo109059a();
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view3 = a2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/ui/mvvm/item/SelectContactItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/mvvm/item/SelectContactListItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            a2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/ui/mvvm/item/SelectContactItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/mvvm/item/SelectContactListItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        bVar.f225009h.mo105662d(mVar, oVar, bVar, i, i2, z, list);
        CharSequence charSequence = bVar.f225008g;
        if (mVar.f232323e == null) {
            mVar.f232323e = (TextView) view.findViewById(C0966R.C0970id.hg4);
        }
        C93938f0.m118693a(charSequence, mVar.f232323e);
        CharSequence charSequence2 = bVar.f225010i;
        if (mVar.f232320b == null) {
            mVar.f232320b = (TextView) view.findViewById(C0966R.C0970id.f358886hn3);
        }
        C93938f0.m118693a(charSequence2, mVar.f232320b);
        CharSequence charSequence3 = bVar.f225011j;
        if (mVar.f232321c == null) {
            mVar.f232321c = (TextView) view.findViewById(C0966R.C0970id.c2h);
        }
        C93938f0.m118693a(charSequence3, mVar.f232321c);
    }
}
