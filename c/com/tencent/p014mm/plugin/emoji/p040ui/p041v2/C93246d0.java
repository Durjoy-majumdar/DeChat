package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.emoji.model.EmojiLogic;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gc0.C20828a;
import i61.C98601f;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import kg3.C76577a;
import p207nl.C89008j;
import p441aq.C92054g;
import te3.C101800k70;
import u61.C101964h;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.d0 */
public class C93246d0 extends BaseAdapter {

    /* renamed from: d */
    public int f268951d;

    /* renamed from: e */
    public Context f268952e;

    /* renamed from: f */
    public List<C101800k70> f268953f;

    /* renamed from: g */
    public int f268954g;

    /* renamed from: h */
    public int f268955h;

    /* renamed from: i */
    public int f268956i;

    /* renamed from: j */
    public LinearLayout.LayoutParams f268957j;

    /* renamed from: n */
    public LinearLayout.LayoutParams f268958n;

    /* renamed from: o */
    public C93248b f268959o;

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.d0$a */
    public class C93247a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f268960d;

        public C93247a(PaddingImageView paddingImageView, int i) {
            this.f268960d = i;
        }

        public void onClick(View view) {
            C93246d0 d0Var;
            C101800k70 a;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/v2/PreViewListGridAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C93248b bVar = C93246d0.this.f268959o;
            if (bVar != null) {
                int i = this.f268960d;
                EmojiStoreV2SingleProductUI$$g emojiStoreV2SingleProductUI$$g = (EmojiStoreV2SingleProductUI$$g) bVar;
                EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI = emojiStoreV2SingleProductUI$$g.f268930a;
                if (!(emojiStoreV2SingleProductUI.f268919u == null || (d0Var = emojiStoreV2SingleProductUI.f268921w) == null || (a = d0Var.getItem(i)) == null)) {
                    try {
                        EmojiStoreV2SingleProductUI.m117711H7(emojiStoreV2SingleProductUI$$g.f268930a, a);
                        C115669n.INSTANCE.mo160131h(12787, Integer.valueOf(emojiStoreV2SingleProductUI$$g.f268930a.f268917s), 0, a.f298586d, Long.valueOf(emojiStoreV2SingleProductUI$$g.f268930a.f268918t), a.f298589g, a.f298592j, 29);
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.emoji.EmojiStoreV2SingleProductUI", e, "single product click error", new Object[0]);
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/v2/PreViewListGridAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.d0$b */
    public interface C93248b {
    }

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v2.d0$c */
    public class C93249c {

        /* renamed from: a */
        public LinearLayout f268962a;

        public C93249c(C93246d0 d0Var) {
        }
    }

    public C93246d0(Context context, int i) {
        this.f268951d = i;
        this.f268952e = context;
        this.f268955h = C76577a.m92145A(context);
        int dimensionPixelSize = this.f268952e.getResources().getDimensionPixelSize(C0966R.dimen.a3r);
        this.f268954g = dimensionPixelSize;
        int i2 = this.f268955h;
        int i3 = this.f268951d;
        this.f268956i = (int) (((float) (i2 - (dimensionPixelSize * i3))) / (((float) i3) + 1.0f));
    }

    /* renamed from: a */
    public C101800k70 getItem(int i) {
        List<C101800k70> list;
        if (i >= 0) {
            List<C101800k70> list2 = this.f268953f;
            if (i < (list2 == null ? 0 : list2.size()) && (list = this.f268953f) != null) {
                return list.get(i);
            }
        }
        return null;
    }

    public int getCount() {
        List<C101800k70> list = this.f268953f;
        if (list == null) {
            return 0;
        }
        return (int) Math.ceil((double) (((float) list.size()) / ((float) this.f268951d)));
    }

    public long getItemId(int i) {
        return (long) i;
    }

    /* JADX WARNING: type inference failed for: r6v4, types: [android.view.View$OnClickListener, android.graphics.drawable.Drawable] */
    public View getView(int i, View view, ViewGroup viewGroup) {
        C93249c cVar;
        View view2;
        Object obj;
        Object obj2 = null;
        if (view == null || view.getTag() == null) {
            view2 = C85868k2.m106137b(this.f268952e).inflate(C0966R.C0971layout.a35, (ViewGroup) null);
            cVar = new C93249c(this);
            LinearLayout linearLayout = (LinearLayout) view2.findViewById(C0966R.C0970id.fa6);
            cVar.f268962a = linearLayout;
            linearLayout.setPadding(0, this.f268956i, 0, 0);
            view2.setTag(cVar);
            for (int i2 = 0; i2 < this.f268951d; i2++) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                this.f268958n = layoutParams;
                layoutParams.leftMargin = this.f268956i;
                int i3 = this.f268954g;
                this.f268957j = new LinearLayout.LayoutParams(i3, i3);
                PaddingImageView paddingImageView = new PaddingImageView(this.f268952e);
                LinearLayout.LayoutParams layoutParams2 = this.f268957j;
                paddingImageView.addView(paddingImageView.f268947d, layoutParams2);
                paddingImageView.addView(paddingImageView.f268948e, layoutParams2);
                cVar.f268962a.addView(paddingImageView, i2, this.f268958n);
            }
        } else {
            cVar = (C93249c) view.getTag();
            view2 = view;
        }
        int i4 = 0;
        while (true) {
            int i5 = this.f268951d;
            if (i4 >= i5) {
                return view2;
            }
            int i6 = (i5 * i) + i4;
            PaddingImageView paddingImageView2 = (PaddingImageView) cVar.f268962a.getChildAt(i4);
            List<C101800k70> list = this.f268953f;
            if (i6 <= (list == null ? 0 : list.size()) - 1) {
                C101800k70 a = getItem(i6);
                if (a != null) {
                    if (!Util.isNullOrNil(a.f298588f)) {
                        C20828a.m22825b().mo32519h(a.f298588f, paddingImageView2.getImageView(), C98601f.m128136a(a.f298588f, C89008j.f256613a.mo123386e(a.f298586d), this.f268954g, new Object[0]));
                        paddingImageView2.setImportantForAccessibility(1);
                        paddingImageView2.setContentDescription(MMApplicationContext.getString(C0966R.string.c5v));
                    } else if (!Util.isNullOrNil(a.f298587e)) {
                        ((C92054g) C86312j.m106911c(C92054g.class)).mo62466Nr().mo32519h(a.f298587e, paddingImageView2.getImageView(), C98601f.m128136a(a.f298587e, EmojiLogic.m117486q(C101964h.m134224f(), "", a.f298586d), this.f268954g, new Object[0]));
                        paddingImageView2.setImportantForAccessibility(1);
                        paddingImageView2.setContentDescription(MMApplicationContext.getString(C0966R.string.c5v));
                    } else {
                        paddingImageView2.setImportantForAccessibility(4);
                        Log.m105928w("MicroMsg.emoji.PreViewListGridAdapter", "this emoji has no thumb url and url. download faild");
                    }
                    paddingImageView2.setClickable(true);
                    paddingImageView2.getImageViewFG().setBackgroundResource(C0966R.C0969drawable.emoji_grid_item_seq_fg);
                    paddingImageView2.setOnClickListener(new C93247a(paddingImageView2, i6));
                    obj = null;
                } else {
                    obj = null;
                    paddingImageView2.getImageViewFG().setBackgroundDrawable((Drawable) null);
                    C20828a.m22825b().mo32518g("", paddingImageView2.getImageView());
                    Log.m105928w("MicroMsg.emoji.PreViewListGridAdapter", "item is null");
                    paddingImageView2.setClickable(false);
                    paddingImageView2.setOnClickListener((View.OnClickListener) null);
                }
            } else {
                ? r6 = obj2;
                paddingImageView2.getImageViewFG().setBackgroundDrawable(r6);
                C20828a.m22825b().mo32518g("", paddingImageView2.getImageView());
                paddingImageView2.setClickable(false);
                paddingImageView2.setOnClickListener(r6);
                paddingImageView2.setImportantForAccessibility(4);
                obj = r6;
            }
            i4++;
            obj2 = obj;
        }
    }
}
