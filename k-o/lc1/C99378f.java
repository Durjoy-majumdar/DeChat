package lc1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.fav.p047ui.C55660h0;
import com.tencent.p014mm.plugin.fav.p047ui.FavoriteImageServer;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.LinkedList;
import kg3.C76577a;
import p629ny.C76979h;
import pb1.C100755z;
import pl1.C11978e0;
import te3.C101801kd0;
import te3.C101811md0;
import te3.C64628pk1;
import te3.C64682rk1;

/* renamed from: lc1.f */
public final class C99378f extends C99373c {

    /* renamed from: lc1.f$a */
    public final class C99379a extends c$$e {

        /* renamed from: k */
        public TextView f291404k;

        /* renamed from: l */
        public TextView f291405l;

        /* renamed from: m */
        public ImageView f291406m;

        /* renamed from: n */
        public ImageView f291407n;

        /* renamed from: o */
        public ImageView f291408o;

        public C99379a(C99378f fVar) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99378f(FavoriteImageServer favoriteImageServer) {
        super(favoriteImageServer);
        C87412m.m108594g(favoriteImageServer, "imageServer");
        C76577a.m92157h(favoriteImageServer.f269877a, C0966R.dimen.f3802ev);
    }

    /* renamed from: b */
    public View mo138840b(View view, ViewGroup viewGroup, C100755z zVar) {
        C99379a aVar;
        View view2;
        C101801kd0 kd02;
        C64682rk1 rk12;
        Class cls = C76979h.class;
        Context context = viewGroup != null ? viewGroup.getContext() : null;
        if (view == null) {
            aVar = new C99379a(this);
            view2 = View.inflate(context, C0966R.C0971layout.a6t, (ViewGroup) null);
            mo138843a(view2, aVar, zVar);
            View findViewById = view2.findViewById(C0966R.C0970id.f357987cw0);
            C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
            aVar.f291406m = (ImageView) findViewById;
            View findViewById2 = view2.findViewById(C0966R.C0970id.cw6);
            C87412m.m108592e(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            aVar.f291404k = (TextView) findViewById2;
            View findViewById3 = view2.findViewById(C0966R.C0970id.f357988cw1);
            C87412m.m108592e(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            aVar.f291405l = (TextView) findViewById3;
            View findViewById4 = view2.findViewById(C0966R.C0970id.f358082da1);
            C87412m.m108592e(findViewById4, "null cannot be cast to non-null type android.widget.ImageView");
            aVar.f291407n = (ImageView) findViewById4;
            View findViewById5 = view2.findViewById(C0966R.C0970id.mpz);
            C87412m.m108592e(findViewById5, "null cannot be cast to non-null type android.widget.ImageView");
            aVar.f291408o = (ImageView) findViewById5;
        } else {
            Object tag = view.getTag();
            C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.fav.ui.listitem.FavFinderListItem.FavFinderHolder");
            C99379a aVar2 = (C99379a) tag;
            view2 = view;
            aVar = aVar2;
        }
        aVar.f291388b.setImageResource(C0966R.raw.icons_outlined_finder_icon);
        aVar.f291388b.setIconColor(C76577a.m92153d(context, C0966R.color.FG_2));
        aVar.f291388b.setVisibility(0);
        mo138844d(aVar, zVar);
        C99373c.m129677g(aVar.f291406m, zVar);
        TextView textView = aVar.f291404k;
        if (textView != null) {
            textView.setText("");
        }
        TextView textView2 = aVar.f291405l;
        if (textView2 != null) {
            textView2.setText("");
        }
        if (!(zVar == null || (kd02 = zVar.field_favProto) == null || (rk12 = kd02.f298614M) == null)) {
            String str = rk12.f185198v;
            String str2 = str == null || str.length() == 0 ? rk12.f185185f : rk12.f185198v;
            TextView textView3 = aVar.f291389c;
            if (textView3 != null) {
                C87412m.m108591d(context);
                textView3.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(context, str2));
            }
            if (rk12.f185188i != 1) {
                String str3 = rk12.f185187h;
                if (str3 == null || str3.length() == 0) {
                    TextView textView4 = aVar.f291405l;
                    if (textView4 != null) {
                        textView4.setText(context.getResources().getString(C0966R.string.fqi, new Object[]{str2}));
                    }
                } else {
                    TextView textView5 = aVar.f291405l;
                    if (textView5 != null) {
                        textView5.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(context, rk12.f185187h));
                    }
                }
            }
            ImageView imageView = aVar.f291408o;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            int i = rk12.f185188i;
            if (i == 2) {
                ImageView imageView2 = aVar.f291407n;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
                ImageView imageView3 = aVar.f291407n;
                if (imageView3 != null) {
                    imageView3.setImageDrawable(C74933u4.m89768e(context, C0966R.raw.icons_filled_album, C76577a.m92153d(context, C0966R.color.f2975b6)));
                }
            } else if (i != 4) {
                ImageView imageView4 = aVar.f291407n;
                if (imageView4 != null) {
                    imageView4.setVisibility(8);
                }
            } else {
                ImageView imageView5 = aVar.f291408o;
                if (imageView5 != null) {
                    imageView5.setVisibility(0);
                }
            }
            LinkedList<C64628pk1> linkedList = rk12.f185190n;
            if (linkedList != null && !linkedList.isEmpty()) {
                C7335d c = C86312j.m106911c(C60200t1.class);
                C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
                String str4 = rk12.f185190n.get(0).f184828f;
                ImageView imageView6 = aVar.f291406m;
                C87412m.m108591d(imageView6);
                C60200t1.C60201a.m70370h((C60200t1) c, str4, imageView6, (C11978e0.C11979a) null, 4, (Object) null);
            }
        }
        return view2;
    }

    /* renamed from: c */
    public void mo138841c(View view, C101811md0 md02) {
        C101801kd0 kd02;
        C64682rk1 rk12;
        Object obj = null;
        if (WeChatBrands.Business.Entries.SessionChannels.checkAvailable(view != null ? view.getContext() : null)) {
            if (view != null) {
                obj = view.getTag();
            }
            C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.fav.ui.listitem.FavFinderListItem.FavFinderHolder");
            C100755z zVar = ((C99379a) obj).f291387a;
            if (zVar != null && (kd02 = zVar.field_favProto) != null && (rk12 = kd02.f298614M) != null) {
                C55660h0 h0Var = C55660h0.f158397a;
                Context context = view.getContext();
                C87412m.m108593f(context, "view.context");
                h0Var.mo77166a(context, rk12);
            }
        }
    }
}
