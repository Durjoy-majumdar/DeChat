package com.tencent.p014mm.plugin.record.p094ui.viewWrappers;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.plugin.C67651f;
import com.tencent.p014mm.plugin.record.p094ui.C57166n;
import com.tencent.p014mm.plugin.record.p094ui.TranslateHelper;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import nj3.C76891l0;
import nj3.C76912y0;
import p629ny.C76979h;
import qg2.C62617u0;
import sg2.C101617b;
import te3.xj4;
import uo3.C78253a;
import yk3.C79135b;

/* renamed from: com.tencent.mm.plugin.record.ui.viewWrappers.g */
public class C94390g implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ TranslateHelper f272826d;

    /* renamed from: e */
    public final /* synthetic */ boolean f272827e;

    /* renamed from: f */
    public final /* synthetic */ C62617u0 f272828f;

    /* renamed from: g */
    public final /* synthetic */ C101617b f272829g;

    /* renamed from: h */
    public final /* synthetic */ int f272830h;

    /* renamed from: i */
    public final /* synthetic */ C94388f f272831i;

    /* renamed from: com.tencent.mm.plugin.record.ui.viewWrappers.g$a */
    public class C94391a implements C76891l0 {

        /* renamed from: a */
        public final /* synthetic */ Resources f272832a;

        public C94391a(Resources resources) {
            this.f272832a = resources;
        }

        /* renamed from: a */
        public void mo71744a(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            e0Var.mo107136c(0, 0, 0, C94390g.this.f272831i.f272820a.getString(C0966R.string.f7936wt), C0966R.raw.icons_filled_copy);
            if (C67651f.m79887a()) {
                C94390g gVar = C94390g.this;
                if (gVar.f272826d != null) {
                    if (!gVar.f272827e) {
                        e0Var.mo107136c(0, 2, 0, gVar.f272831i.f272820a.getString(C0966R.string.b_k), C0966R.raw.icons_filled_eyes_off);
                        e0Var.mo107136c(0, 3, 0, C94390g.this.f272831i.f272820a.getString(C0966R.string.ml5), C0966R.raw.icons_filled_feedback_error);
                    } else if (gVar.f272828f.f177823e != 2) {
                        e0Var.mo107136c(0, 1, 0, gVar.f272831i.f272820a.getString(C0966R.string.b_m), C0966R.raw.icons_filled_translate);
                    }
                    C94390g gVar2 = C94390g.this;
                    C94388f fVar = gVar2.f272831i;
                    C79135b.m95725a(fVar.f272820a, fVar.f272824e, e0Var, this.f272832a, gVar2.f272829g.f297464a.f299301f, fVar.f272823d, 2);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.record.ui.viewWrappers.g$b */
    public class C94392b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ TextView f272834d;

        /* renamed from: e */
        public final /* synthetic */ Resources f272835e;

        public C94392b(TextView textView, Resources resources) {
            this.f272834d = textView;
            this.f272835e = resources;
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            int itemId = menuItem.getItemId();
            if (itemId == 0) {
                ClipboardHelper.setText(this.f272834d.getText());
                Context context = C94390g.this.f272831i.f272820a;
                C76879j.m92729W(context, context.getString(C0966R.string.f7938wv));
            } else if (itemId != 1) {
                if (itemId == 2) {
                    C94390g gVar = C94390g.this;
                    TranslateHelper translateHelper = gVar.f272826d;
                    C62617u0 a = translateHelper.mo129732a(gVar.f272830h);
                    if (a.f177823e == 2) {
                        a.f177823e = 0;
                        translateHelper.f272691b.notifyDataSetChanged();
                    }
                } else if (itemId == 3) {
                    C94390g gVar2 = C94390g.this;
                    TranslateHelper translateHelper2 = gVar2.f272826d;
                    int i2 = gVar2.f272830h;
                    if (i2 < translateHelper2.f272692c.f272698a.size()) {
                        Context context2 = translateHelper2.f272690a;
                        C76912y0.m92773l(context2, context2.getResources().getString(C0966R.string.ml6));
                        C62617u0 a2 = translateHelper2.mo129732a(i2);
                        String str = translateHelper2.f272692c.f272698a.get(i2).f299301f;
                        String str2 = a2.f177824f;
                        xj4 xj4 = new xj4();
                        xj4.f144712d = str;
                        xj4.f144714f = str2;
                        xj4.f144714f = LocaleUtil.getCurrentLanguage(translateHelper2.f272690a);
                        xj4.mo73361b().mo9225i().mo123062e(new C57166n(translateHelper2));
                    }
                } else if (itemId == 101) {
                    C94390g gVar3 = C94390g.this;
                    C94388f fVar = gVar3.f272831i;
                    C79135b.m95726b(fVar.f272820a, this.f272835e, gVar3.f272829g.f297464a.f299301f, fVar.f272823d, 2, true);
                }
            } else if (WeChatBrands.Business.Entries.ContextTranslate.checkAvailable(this.f272834d.getContext())) {
                C94390g gVar4 = C94390g.this;
                gVar4.f272826d.mo129734c(gVar4.f272830h, !gVar4.f272827e);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.record.ui.viewWrappers.g$c */
    public class C94393c implements PopupWindow.OnDismissListener {

        /* renamed from: d */
        public final /* synthetic */ TextView f272837d;

        public C94393c(TextView textView) {
            this.f272837d = textView;
        }

        public void onDismiss() {
            TextView textView = this.f272837d;
            C94390g gVar = C94390g.this;
            textView.setText(gVar.f272827e ? gVar.f272829g.f297464a.f299301f : gVar.f272828f.f177824f);
            C94390g gVar2 = C94390g.this;
            C94388f fVar = gVar2.f272831i;
            C101617b bVar = gVar2.f272829g;
            fVar.getClass();
            int i = bVar.f297468e;
            ((C76979h) C86312j.m106911c(C76979h.class)).mo107084wk(this.f272837d, 1, i == 1 ? 6 : i == 0 ? 4 : 0);
        }
    }

    public C94390g(C94388f fVar, TranslateHelper translateHelper, boolean z, C62617u0 u0Var, C101617b bVar, int i) {
        this.f272831i = fVar;
        this.f272826d = translateHelper;
        this.f272827e = z;
        this.f272828f = u0Var;
        this.f272829g = bVar;
        this.f272830h = i;
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/record/ui/viewWrappers/TextViewWrapper$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        TextView textView = (TextView) view;
        SpannableString spannableString = new SpannableString(textView.getText());
        spannableString.setSpan(new BackgroundColorSpan(this.f272831i.f272820a.getResources().getColor(C0966R.color.FG_3)), 0, textView.getText().length(), 33);
        textView.setText(spannableString);
        Resources resources = textView.getResources();
        C94388f fVar = this.f272831i;
        fVar.f272824e = new C78253a(fVar.f272820a, textView);
        C78253a aVar = this.f272831i.f272824e;
        aVar.f229257z = true;
        aVar.f229253v = new C94391a(resources);
        aVar.f229251t = new C94392b(textView, resources);
        aVar.f229227C = new C94393c(textView);
        if (view.getTag(C0966R.C0970id.f359414kt0) instanceof int[]) {
            int[] iArr = (int[]) view.getTag(C0966R.C0970id.f359414kt0);
            this.f272831i.f272824e.mo71743n(iArr[0], iArr[1]);
        } else {
            C94388f fVar2 = this.f272831i;
            fVar2.f272824e.mo71743n(fVar2.f272821b, fVar2.f272822c);
        }
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/record/ui/viewWrappers/TextViewWrapper$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
