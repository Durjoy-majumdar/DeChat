package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.VerticalScrollBar;
import com.tencent.p014mm.p136ui.base.sortview.BaseSortView;
import com.tencent.p014mm.p136ui.base.sortview.C44721b;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import fe1.C58969q;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import k60.C60979d;
import kotlin.Metadata;
import p629ny.C76979h;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import qj3.C47864f;
import up1.C27696y;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0010B\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderContactSortView;", "Lcom/tencent/mm/ui/base/sortview/BaseSortView;", "Lcom/tencent/mm/ui/base/VerticalScrollBar;", "getScrollBar", "Landroid/widget/ListView;", "getListView", "Landroid/view/View;", "getNoResultView", "Lcom/tencent/mm/ui/base/sortview/b$b;", "getItemViewCreator", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderContactSortView */
public final class FinderContactSortView extends BaseSortView {

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderContactSortView$a */
    public static final class C41561a {

        /* renamed from: a */
        public ImageView f111874a;

        /* renamed from: b */
        public TextView f111875b;

        /* renamed from: c */
        public TextView f111876c;

        /* renamed from: d */
        public View f111877d;
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderContactSortView$b */
    public static final class C41562b implements C44721b.C44723b {

        /* renamed from: a */
        public final /* synthetic */ FinderContactSortView f111878a;

        public C41562b(FinderContactSortView finderContactSortView) {
            this.f111878a = finderContactSortView;
        }

        /* renamed from: a */
        public final View mo63508a(C47864f fVar, View view, ViewGroup viewGroup, int i, int i2, boolean z, boolean z2) {
            C41561a aVar;
            Class cls = C11990s0.class;
            Class<C60200t1> cls2 = C60200t1.class;
            if (view == null) {
                view = View.inflate(this.f111878a.getContext(), C0966R.C0971layout.a9z, (ViewGroup) null);
                aVar = new C41561a();
                aVar.f111874a = (ImageView) view.findViewById(C0966R.C0970id.a27);
                aVar.f111875b = (TextView) view.findViewById(C0966R.C0970id.hg4);
                aVar.f111876c = (TextView) view.findViewById(C0966R.C0970id.ay5);
                aVar.f111877d = view.findViewById(C0966R.C0970id.fa7);
                view.setTag(aVar);
            } else {
                Object tag = view.getTag();
                C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.FinderContactSortView.ViewHolder");
                aVar = (C41561a) tag;
            }
            Object obj = fVar.f128466b;
            C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.api.LocalFinderContact");
            C58969q qVar = (C58969q) obj;
            C60979d<C100810g0> i25 = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11872i2();
            C62345f fVar2 = new C62345f(qVar.getAvatarUrl(), (C27696y) null, 2, (C8480h) null);
            ImageView imageView = aVar.f111874a;
            C87412m.m108591d(imageView);
            i25.mo85957c(fVar2, imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
            TextView textView = aVar.f111875b;
            if (textView != null) {
                textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(this.f111878a.getContext(), qVar.getNickname()));
            }
            if (!this.f111878a.f121306p || !z) {
                TextView textView2 = aVar.f111876c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
            } else {
                TextView textView3 = aVar.f111876c;
                if (textView3 != null) {
                    textView3.setText(fVar.f128465a);
                }
                TextView textView4 = aVar.f111876c;
                if (textView4 != null) {
                    textView4.setVisibility(0);
                }
            }
            if (this.f111878a.getMode() != 0 || !z2) {
                View view2 = aVar.f111877d;
                if (view2 != null) {
                    view2.setBackgroundResource(C0966R.C0969drawable.bcr);
                }
            } else {
                View view3 = aVar.f111877d;
                if (view3 != null) {
                    view3.setBackgroundResource(C0966R.C0969drawable.f4859pe);
                }
            }
            return view;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderContactSortView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        setOnItemClickListener(new C41597p1(this));
    }

    /* renamed from: b */
    public View mo63491b() {
        View inflate = View.inflate(getContext(), C0966R.C0971layout.a_1, this);
        C87412m.m108593f(inflate, "inflate(context, R.layou…_contact_sort_view, this)");
        return inflate;
    }

    /* renamed from: c */
    public boolean mo63492c(String str, C47864f fVar) {
        if (str == null) {
            return false;
        }
        String nullAsNil = Util.nullAsNil(fVar != null ? fVar.f128465a : null);
        C87412m.m108593f(nullAsNil, "nullAsNil(entity?.alpha)");
        return C112551y.m153819s(str, nullAsNil, false);
    }

    public C44721b.C44723b getItemViewCreator() {
        return new C41562b(this);
    }

    public ListView getListView() {
        View findViewById = findViewById(C0966R.C0970id.fpc);
        C87412m.m108593f(findViewById, "this.findViewById(R.id.list_view)");
        return (ListView) findViewById;
    }

    public View getNoResultView() {
        View findViewById = findViewById(C0966R.C0970id.hgp);
        C87412m.m108593f(findViewById, "this.findViewById(R.id.no_result)");
        return findViewById;
    }

    public VerticalScrollBar getScrollBar() {
        View findViewById = findViewById(C0966R.C0970id.jy6);
        C87412m.m108593f(findViewById, "this.findViewById(R.id.sort_bar)");
        return (VerticalScrollBar) findViewById;
    }
}
