package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Context;
import android.text.SpannableString;
import android.util.Base64;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import gy3.C87412m;
import nj3.C76874e0;
import p629ny.C76979h;
import z04.C112550d0;
import z04.C119027c;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.c2 */
public final class C73940c2 {

    /* renamed from: a */
    public static final C73941a f217024a = new C73941a();

    /* renamed from: b */
    public static MMNeat7extView f217025b;

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.c2$a */
    public static final class C73941a extends C74023i.C74026c {
        /* renamed from: a */
        public final C73941a mo103017a(View view) {
            C87412m.m108594g(view, "convertView");
            super.create(view);
            C73940c2.f217025b = (MMNeat7extView) view.findViewById(C0966R.C0970id.b4b);
            View findViewById = view.findViewById(C0966R.C0970id.b46);
            C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.widget.CheckBox");
            this.checkBox = (CheckBox) findViewById;
            this.maskView = view.findViewById(C0966R.C0970id.b7h);
            return this;
        }

        /* renamed from: b */
        public final void mo103018b(C73941a aVar, C67391b bVar, C72963f4 f4Var, String str, C74023i iVar, boolean z) {
            C87412m.m108594g(aVar, "holder");
            C87412m.m108594g(bVar, "ui");
            C87412m.m108594g(f4Var, "msg");
            C87412m.m108594g(iVar, "chattingItem");
            String content = f4Var.getContent();
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
            if (u != null && u.f195582i == 91) {
                byte[] bytes = "wx91d27dbf599dff74".getBytes(C119027c.f356488a);
                C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                String encodeToString = Base64.encodeToString(bytes, 0);
                C87412m.m108593f(encodeToString, "encodeToString(appid.toByteArray(),Base64.DEFAULT)");
                String str2 = "[暂不支持此消息格式，请在 <a data-miniprogram-appid = \"" + C112550d0.m153780P(encodeToString, "\n") + "\" data-miniprogram-path = \" \" href = \"www.qq.com\">hello world</a>中查看]";
                MMNeat7extView mMNeat7extView = C73940c2.f217025b;
                C87412m.m108591d(mMNeat7extView);
                Context context = mMNeat7extView.getContext();
                MMNeat7extView mMNeat7extView2 = C73940c2.f217025b;
                C87412m.m108591d(mMNeat7extView2);
                SpannableString o802 = ((C76979h) C86312j.m106911c(C76979h.class)).o80(context, str2, (int) mMNeat7extView2.getTextSize(), 1, (Object) null, (String) null, true);
                MMNeat7extView mMNeat7extView3 = C73940c2.f217025b;
                C87412m.m108591d(mMNeat7extView3);
                mMNeat7extView3.mo104279b(o802);
                MMNeat7extView mMNeat7extView4 = C73940c2.f217025b;
                C87412m.m108591d(mMNeat7extView4);
                mMNeat7extView4.setClickable(true);
            }
        }

        public View getMainContainerView() {
            return C73940c2.f217025b;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.c2$b */
    public static final class C73942b extends C74023i {

        /* renamed from: v */
        public C67391b f217026v;

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6898rm);
            C73941a aVar = C73940c2.f217024a;
            aVar.mo103017a(n4Var);
            n4Var.setTag(aVar);
            return n4Var;
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return false;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            return true;
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            C87412m.m108591d(view);
            Object tag = view.getTag();
            C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
            int b = ((C74243t8) tag).mo103252b();
            C87412m.m108591d(e0Var);
            C67391b bVar = this.f217026v;
            C87412m.m108591d(bVar);
            e0Var.mo107136c(b, 100, 0, bVar.mo91572m().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
            return false;
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            return false;
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            this.f217026v = bVar;
            C73941a aVar = cVar instanceof C73941a ? (C73941a) cVar : null;
            if (aVar != null) {
                C87412m.m108591d(bVar);
                C87412m.m108591d(f4Var);
                C87412m.m108591d(str);
                aVar.mo103018b(aVar, bVar, f4Var, str, this, true);
            }
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return !z && i == 91;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.c2$c */
    public static final class C73943c extends C74023i {

        /* renamed from: v */
        public C67391b f217027v;

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6948t3);
            C73941a aVar = C73940c2.f217024a;
            aVar.mo103017a(n4Var);
            n4Var.setTag(aVar);
            return n4Var;
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return true;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            return false;
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            C87412m.m108591d(view);
            Object tag = view.getTag();
            C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
            int b = ((C74243t8) tag).mo103252b();
            C87412m.m108591d(e0Var);
            C67391b bVar = this.f217027v;
            C87412m.m108591d(bVar);
            e0Var.mo107136c(b, 100, 0, bVar.mo91572m().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
            return false;
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            return false;
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            this.f217027v = bVar;
            C73941a aVar = cVar instanceof C73941a ? (C73941a) cVar : null;
            if (aVar != null) {
                C87412m.m108591d(bVar);
                C87412m.m108591d(f4Var);
                C87412m.m108591d(str);
                aVar.mo103018b(aVar, bVar, f4Var, str, this, false);
            }
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return z && i == 91;
        }
    }
}
