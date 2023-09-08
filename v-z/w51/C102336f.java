package w51;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.emoji.model.C93108e0;
import com.tencent.p014mm.sdk.platformtools.Util;
import gc0.C20828a;
import i61.C98601f;
import j20.C117292a;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import te3.C101754a80;
import te3.C101776f80;
import te3.C101824o80;
import u61.C101963g;
import x51.C102554b;
import x51.C102561f;
import x51.C102562g;

/* renamed from: w51.f */
public class C102336f extends C102554b {

    /* renamed from: n */
    public boolean f301419n = true;

    /* renamed from: o */
    public boolean f301420o = true;

    /* renamed from: p */
    public List<String> f301421p = new LinkedList();

    /* renamed from: w51.f$a */
    public class C102337a extends C102330b {
        public C102337a(Context context, View view) {
            super(context, view);
        }

        /* renamed from: b */
        public void mo141883b() {
            this.f301388h.setVisibility(8);
            this.f301393m.setVisibility(8);
            this.f301395o.setVisibility(8);
            this.f301397q.setVisibility(8);
            this.f301401u.setVisibility(8);
            View view = this.f301402v;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/adapter/EmojiStoreMainAdapter$EmojiMainHoler", "fillingShowView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/emoji/adapter/EmojiStoreMainAdapter$EmojiMainHoler", "fillingShowView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f301387g.setVisibility(0);
            this.f301389i.setVisibility(0);
            View view2 = this.f301399s;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/adapter/EmojiStoreMainAdapter$EmojiMainHoler", "fillingShowView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/adapter/EmojiStoreMainAdapter$EmojiMainHoler", "fillingShowView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f301398r.setVisibility(0);
            this.f301400t.setVisibility(0);
        }

        /* renamed from: c */
        public int[] mo141884c() {
            int h = C76577a.m92157h(this.f301379C, C0966R.dimen.a46);
            return new int[]{h, h};
        }

        /* renamed from: d */
        public int mo141885d() {
            return C76577a.m92157h(this.f301379C, C0966R.dimen.a45);
        }

        /* renamed from: h */
        public boolean mo141889h() {
            return C102336f.this.f301419n;
        }
    }

    public C102336f(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo141905a() {
        super.mo141905a();
    }

    /* renamed from: b */
    public int mo141896b() {
        return 0;
    }

    /* renamed from: f */
    public int mo141897f() {
        return 0;
    }

    /* renamed from: h */
    public View mo141898h(int i, View view, ViewGroup viewGroup) {
        boolean z;
        C101824o80 o802;
        C102337a aVar = (C102337a) view.getTag();
        C102562g g = getItem(i);
        if (!(aVar == null || g == null)) {
            g.f301990i = this.f301420o;
            C101754a80 a802 = g.f301984c;
            int i2 = 8;
            if (a802 == null) {
                aVar.mo141893l(0);
                z = false;
            } else {
                aVar.f301389i.setText(a802.f297839e);
                aVar.mo141892k(a802.f297845n);
                if (!Util.isNullOrNil(a802.f297844j)) {
                    C20828a b = C20828a.m22825b();
                    String str = a802.f297844j;
                    b.mo32519h(str, aVar.f301387g, C98601f.m128139d("", str));
                }
                if (!Util.isNullOrNil(a802.f297847p)) {
                    C20828a b2 = C20828a.m22825b();
                    String str2 = a802.f297847p;
                    b2.mo32519h(str2, aVar.f301388h, C98601f.m128139d("", str2));
                    aVar.mo141894m(0);
                } else {
                    aVar.mo141894m(8);
                }
                aVar.mo141893l(8);
                z = true;
            }
            if (!z && (o802 = g.f301983b) != null) {
                aVar.f301389i.setText(o802.f298996f);
                if (C101963g.m134218c(o802)) {
                    C20828a.m22825b().mo32518g("", aVar.f301387g);
                    aVar.f301387g.setImageResource(C0966R.C0969drawable.icon_002_cover);
                } else {
                    C20828a b3 = C20828a.m22825b();
                    String str3 = o802.f298995e;
                    b3.mo32519h(str3, aVar.f301387g, C98601f.m128139d(o802.f298994d, str3));
                }
                boolean c = C102561f.m135423c(o802.f299000j, 2);
                if (!TextUtils.isEmpty(o802.f299012y)) {
                    aVar.f301388h.setImageDrawable((Drawable) null);
                    aVar.f301388h.setVisibility(0);
                    C20828a b4 = C20828a.m22825b();
                    String str4 = o802.f299012y;
                    b4.mo32519h(str4, aVar.f301388h, C98601f.m128139d("", str4));
                } else if (c) {
                    aVar.mo141894m(0);
                    aVar.f301388h.setImageResource(C0966R.C0969drawable.bfp);
                } else {
                    aVar.mo141894m(8);
                }
                View view2 = aVar.f301391k;
                if (((LinkedList) this.f301421p).contains(o802.f298994d)) {
                    i2 = 0;
                }
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(Integer.valueOf(i2));
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/adapter/EmojiStoreMainAdapter", "getItemView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/emoji/adapter/EmojiStoreMainAdapter", "getItemView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C101776f80 f802 = g.f301985d;
                if (f802 == null || !C102561f.m135421a(f802.f298242n)) {
                    aVar.mo141892k(!Util.isNullOrNil(o802.f299013z) ? o802.f299013z : o802.f299011x);
                } else {
                    aVar.mo141891j(g.f301985d.f298230F, true);
                }
            }
        }
        return view;
    }

    /* renamed from: i */
    public int mo141899i() {
        return 0;
    }

    /* renamed from: j */
    public C102330b mo141900j(Context context, View view) {
        C102337a aVar = new C102337a(context, view);
        C93108e0.C93110b bVar = this.f301967f;
        View view2 = aVar.f301399s;
        if (view2 != null) {
            view2.setOnClickListener(new C102329a(aVar, bVar));
        }
        return aVar;
    }

    /* renamed from: n */
    public void mo141901n(int i) {
    }

    /* renamed from: o */
    public void mo141902o(int i) {
    }

    /* renamed from: p */
    public void mo141903p(int i) {
    }
}
