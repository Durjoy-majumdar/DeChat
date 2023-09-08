package x51;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.emoji.model.C93108e0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gc0.C20828a;
import gy3.C87412m;
import i61.C98601f;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import te3.C101754a80;
import te3.C101776f80;
import te3.C101824o80;
import u61.C101962d;
import u61.C101963g;
import w51.C102329a;
import w51.C102330b;

/* renamed from: x51.e */
public final class C102559e extends C102554b {

    /* renamed from: n */
    public final String f301978n = "MicroMsg.emoji.EmojiPreviewRelativeAdapter";

    /* renamed from: o */
    public boolean f301979o = true;

    /* renamed from: p */
    public boolean f301980p = true;

    /* renamed from: x51.e$a */
    public final class C102560a extends C102330b {
        public C102560a(Context context, View view) {
            super(context, view);
        }

        /* renamed from: b */
        public void mo141883b() {
            this.f301388h.setVisibility(8);
            this.f301397q.setVisibility(8);
            this.f301401u.setVisibility(8);
            View view = this.f301402v;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/adapter/data/EmojiPreviewRelativeAdapter$EmojiPreviewRelativeHolder", "fillingShowView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/emoji/adapter/data/EmojiPreviewRelativeAdapter$EmojiPreviewRelativeHolder", "fillingShowView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f301387g.setVisibility(0);
            this.f301389i.setVisibility(0);
            View view2 = this.f301399s;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/adapter/data/EmojiPreviewRelativeAdapter$EmojiPreviewRelativeHolder", "fillingShowView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/adapter/data/EmojiPreviewRelativeAdapter$EmojiPreviewRelativeHolder", "fillingShowView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f301398r.setVisibility(0);
            this.f301400t.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = this.f301387g.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                int h = C76577a.m92157h(this.f301379C, C0966R.dimen.f3755d6);
                layoutParams2.width = h;
                layoutParams2.height = h;
                this.f301387g.setPadding(0, 0, C76577a.m92157h(this.f301379C, C0966R.dimen.f3723cd), 0);
                this.f301387g.setLayoutParams(layoutParams2);
            }
            if (this.f301390j.getVisibility() != 0) {
                this.f301390j.setVisibility(0);
            }
            int h2 = C76577a.m92157h(this.f301379C, C0966R.dimen.f3736cp);
            ViewGroup.LayoutParams layoutParams3 = this.f301386f.getLayoutParams();
            FrameLayout.LayoutParams layoutParams4 = layoutParams3 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 != null) {
                layoutParams4.setMargins(h2, 0, 0, 0);
                this.f301386f.setLayoutParams(layoutParams4);
            }
            ViewGroup viewGroup = this.f301398r;
            if (!(viewGroup instanceof View)) {
                viewGroup = null;
            }
            ViewGroup.LayoutParams layoutParams5 = viewGroup != null ? viewGroup.getLayoutParams() : null;
            FrameLayout.LayoutParams layoutParams6 = layoutParams5 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams5 : null;
            if (layoutParams6 != null) {
                layoutParams6.setMargins(0, 0, 0, 0);
                viewGroup.setLayoutParams(layoutParams6);
            }
            ViewGroup.LayoutParams layoutParams7 = this.f301399s.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams8 = layoutParams7 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams7 : null;
            if (layoutParams8 != null) {
                layoutParams8.setMargins(0, 0, h2, 0);
                this.f301399s.setLayoutParams(layoutParams8);
            }
            View view3 = this.f301380D;
            ViewGroup viewGroup2 = view3 instanceof ViewGroup ? (ViewGroup) view3 : null;
            if (viewGroup2 != null) {
                ViewGroup.LayoutParams layoutParams9 = new ViewGroup.LayoutParams(-1, 1);
                View view4 = new View(this.f301379C);
                view4.setBackgroundColor(C76577a.m92153d(this.f301379C, C0966R.color.FG_3));
                view4.setLayoutParams(layoutParams9);
                viewGroup2.addView(view4, 0);
            }
            this.f301380D.setBackground(C101962d.f300168a.mo141484b(C76577a.m92153d(this.f301379C, C0966R.color.f3331aq), C76577a.m92153d(this.f301379C, C0966R.color.BW_0_Alpha_0_0_5), 0.0f, 0.0f, 0.0f, 0.0f));
            this.f301405y.setBackground((Drawable) null);
            this.f301386f.setBackground((Drawable) null);
        }

        /* renamed from: c */
        public int[] mo141884c() {
            return null;
        }

        /* renamed from: d */
        public int mo141885d() {
            return C76577a.m92157h(this.f301379C, C0966R.dimen.f3705bx);
        }

        /* renamed from: h */
        public boolean mo141889h() {
            return C102559e.this.f301979o;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102559e(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
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
        C87412m.m108594g(view, "convertView");
        Object tag = view.getTag();
        C102560a aVar = tag instanceof C102560a ? (C102560a) tag : null;
        C102562g g = getItem(i);
        if (!(aVar == null || g == null)) {
            g.f301990i = this.f301980p;
            C101754a80 a802 = g.f301984c;
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
            if (!z) {
                C101824o80 o802 = g.f301983b;
                if (o802 == null) {
                    Log.m105924i(this.f301978n, "EmotionSummary null");
                } else {
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
                    C101776f80 f802 = g.f301985d;
                    if (f802 == null || !C102561f.m135421a(f802.f298242n)) {
                        aVar.mo141892k(!Util.isNullOrNil(o802.f299013z) ? o802.f299013z : o802.f299011x);
                    } else {
                        aVar.mo141891j(g.f301985d.f298230F, true);
                    }
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
        C102560a aVar = new C102560a(context, view);
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
