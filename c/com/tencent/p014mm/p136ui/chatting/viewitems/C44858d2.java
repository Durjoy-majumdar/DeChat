package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.C73774p2;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74244u;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import eb0.C75604z3;
import gy1.C76074a;
import ke3.C88144b;
import nj3.C76874e0;
import p629ny.C76979h;
import uy1.C52645f;
import zj3.C79368l;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.d2 */
public class C44858d2 {

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.d2$a */
    public static class C44859a extends C74023i.C74026c {

        /* renamed from: b */
        public ImageView f121706b;

        /* renamed from: c */
        public TextView f121707c;

        /* renamed from: d */
        public TextView f121708d;

        /* renamed from: e */
        public TextView f121709e;

        /* renamed from: f */
        public ImageView f121710f;

        /* renamed from: a */
        public C44859a mo70161a(View view, boolean z) {
            super.create(view);
            this.f121706b = (ImageView) view.findViewById(C0966R.C0970id.ems);
            this.f121707c = (TextView) view.findViewById(C0966R.C0970id.emv);
            this.f121708d = (TextView) view.findViewById(C0966R.C0970id.emu);
            this.f121709e = (TextView) view.findViewById(C0966R.C0970id.emw);
            this.userTV = (TextView) view.findViewById(C0966R.C0970id.b9_);
            if (z) {
                this.uploadingPB = (ProgressBar) view.findViewById(C0966R.C0970id.f359466l14);
                this.f121710f = (ImageView) view.findViewById(C0966R.C0970id.b8x);
            }
            return this;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.d2$b */
    public static class C44860b extends C74023i {

        /* renamed from: v */
        public C67391b f121711v;

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6895rj);
            C44859a aVar = new C44859a();
            aVar.mo70161a(n4Var, false);
            n4Var.setTag(aVar);
            return n4Var;
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return false;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            if (menuItem.getItemId() != 111) {
                return false;
            }
            C74244u.C74247d.m88515e(bVar, f4Var, mo103068y(bVar, f4Var), -1, (C88144b.C76564c) null);
            return true;
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            e0Var.mo107136c(0, 111, 0, view.getContext().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
            return true;
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            C44858d2.m49720b(bVar, f4Var);
            return false;
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            Class cls = C76979h.class;
            this.f121711v = bVar;
            C44859a aVar = (C44859a) cVar;
            String content = f4Var.getContent();
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
            if (u != null) {
                C76074a aVar2 = (C76074a) u.mo93555w(C76074a.class);
                if (aVar2 != null) {
                    C44858d2.m49719a(aVar.f121706b, aVar2.f222931b);
                    aVar.f121707c.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(bVar.mo91565f(), aVar2.f222932c));
                    if (Util.isNullOrNil(aVar2.f222933d)) {
                        aVar.f121708d.setVisibility(8);
                    } else {
                        aVar.f121708d.setVisibility(0);
                        aVar.f121708d.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(bVar.mo91565f(), aVar2.f222933d));
                    }
                    if (Util.isNullOrNil(aVar2.f222934e)) {
                        aVar.f121709e.setText(bVar.mo91572m().getString(C0966R.string.fag));
                    } else {
                        aVar.f121709e.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(bVar.mo91565f(), aVar2.f222934e));
                    }
                }
                aVar.clickArea.setOnClickListener(mo103099u(bVar));
                aVar.clickArea.setOnLongClickListener(mo103098p(bVar));
                aVar.clickArea.setOnTouchListener(((C79368l) bVar.f193278b.mo102812a(C79368l.class)).mo108189Z4());
                aVar.clickArea.setTag(new C74243t8(f4Var, this.f121711v.mo91583x(), aVar, (String) null));
            }
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return !z && i == 939524145;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.d2$c */
    public static class C44861c extends C74023i implements C73774p2 {

        /* renamed from: v */
        public C67391b f121712v;

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6945t0);
            C44859a aVar = new C44859a();
            aVar.mo70161a(n4Var, true);
            n4Var.setTag(aVar);
            return n4Var;
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return true;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            if (menuItem.getItemId() != 111) {
                return false;
            }
            C74244u.C74247d.m88515e(bVar, f4Var, mo103068y(bVar, f4Var), -1, (C88144b.C76564c) null);
            return true;
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            int b = ((C74243t8) view.getTag()).mo103252b();
            if (f4Var != null) {
                if ((f4Var.getStatus() == 2 || f4Var.f230728K == 1) && mo103083Q(f4Var, this.f121712v) && mo103081O(f4Var.mo108768t()) && !this.f121712v.mo91580u()) {
                    e0Var.mo107136c(b, 123, 0, view.getContext().getString(C0966R.string.b_d), C0966R.raw.icons_filled_previous);
                }
                e0Var.mo107136c(b, 111, 0, view.getContext().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
            }
            return true;
        }

        /* renamed from: a */
        public void mo70162a(View view, C67391b bVar, C72963f4 f4Var) {
            if (f4Var.mo101020w3()) {
                C72695v.m85081w(f4Var);
                C75604z3.m90834f(f4Var.getMsgId());
                bVar.mo91541B(true);
            }
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            C44858d2.m49720b(bVar, f4Var);
            return false;
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            Class cls = C79368l.class;
            Class cls2 = C76979h.class;
            this.f121712v = bVar;
            C44859a aVar = (C44859a) cVar;
            String content = f4Var.getContent();
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
            boolean z = false;
            if (u != null) {
                C76074a aVar2 = (C76074a) u.mo93555w(C76074a.class);
                if (aVar2 != null) {
                    C44858d2.m49719a(aVar.f121706b, aVar2.f222931b);
                    aVar.f121707c.setText(((C76979h) C86312j.m106911c(cls2)).mo107057T1(bVar.mo91565f(), aVar2.f222932c));
                    if (Util.isNullOrNil(aVar2.f222933d)) {
                        aVar.f121708d.setVisibility(8);
                    } else {
                        aVar.f121708d.setVisibility(0);
                        aVar.f121708d.setText(((C76979h) C86312j.m106911c(cls2)).mo107057T1(bVar.mo91565f(), aVar2.f222933d));
                    }
                    if (Util.isNullOrNil(aVar2.f222934e)) {
                        aVar.f121709e.setText(bVar.mo91572m().getString(C0966R.string.fag));
                    } else {
                        aVar.f121709e.setText(((C76979h) C86312j.m106911c(cls2)).mo107057T1(bVar.mo91565f(), aVar2.f222934e));
                    }
                }
                aVar.clickArea.setOnClickListener(mo103099u(bVar));
                aVar.clickArea.setOnLongClickListener(mo103098p(bVar));
                aVar.clickArea.setOnTouchListener(((C79368l) bVar.f193278b.mo102812a(cls)).mo108189Z4());
                aVar.clickArea.setTag(new C74243t8(f4Var, this.f121712v.mo91583x(), aVar, (String) null));
            }
            if (C74023i.m87878T()) {
                mo103093i0(aVar, false, true);
                if (f4Var.getStatus() != 2 || !mo103080N((C79368l) bVar.f193278b.mo102812a(cls), f4Var.getMsgId())) {
                    ImageView imageView = aVar.f121710f;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                } else {
                    ImageView imageView2 = aVar.f121710f;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                    }
                }
            } else {
                ImageView imageView3 = aVar.f121710f;
                if (imageView3 != null) {
                    imageView3.setVisibility(8);
                }
                if (f4Var.getStatus() < 2) {
                    z = true;
                }
                mo103093i0(aVar, z, true);
            }
            mo103087e0(aVar, f4Var, bVar.mo91573n(), bVar.mo91583x(), bVar, this);
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return z && i == 939524145;
        }
    }

    /* renamed from: a */
    public static void m49719a(ImageView imageView, String str) {
        if (imageView != null) {
            C52645f.C52650d.C52651a aVar = new C52645f.C52650d.C52651a();
            aVar.f147020a = true;
            aVar.f147021b = true;
            aVar.f147026g = 0.1f;
            C52645f.m59023a().mo73595e(imageView, str, aVar.mo73598a(), (C52645f.C52652e) null);
        }
    }

    /* renamed from: b */
    public static void m49720b(C67391b bVar, C72963f4 f4Var) {
        C76074a aVar;
        String content = f4Var.getContent();
        C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
        if (u != null && (aVar = (C76074a) u.mo93555w(C76074a.class)) != null && !Util.isNullOrNil(aVar.f222935f)) {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", aVar.f222935f);
            C88144b.m109791i(bVar.mo91565f(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
    }
}
