package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68061b;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import eb0.C75569c4;
import eb0.C97625j3;
import f12.C7970a;
import gc0.C20828a;
import hc0.C20937c;
import i21.C98591h;
import ke3.C88144b;
import kg3.C76577a;
import nj3.C76874e0;
import p629ny.C76979h;
import zj3.C79368l;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.p0 */
public class C74162p0 {

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.p0$a */
    public static class C74163a extends C74023i.C74026c {

        /* renamed from: b */
        public ImageView f217691b;

        /* renamed from: c */
        public TextView f217692c;

        /* renamed from: d */
        public TextView f217693d;

        /* renamed from: e */
        public TextView f217694e;

        /* renamed from: f */
        public int f217695f = 0;

        /* renamed from: g */
        public int f217696g = 0;

        /* renamed from: a */
        public C74163a mo103211a(View view, boolean z) {
            super.create(view);
            this.timeTV = (TextView) this.convertView.findViewById(C0966R.C0970id.b8z);
            this.checkBox = (CheckBox) this.convertView.findViewById(C0966R.C0970id.b46);
            this.maskView = this.convertView.findViewById(C0966R.C0970id.b7h);
            this.userTV = (TextView) this.convertView.findViewById(C0966R.C0970id.b9_);
            this.f217691b = (ImageView) this.convertView.findViewById(C0966R.C0970id.f6119xu);
            this.f217692c = (TextView) this.convertView.findViewById(C0966R.C0970id.f6125y0);
            this.f217693d = (TextView) this.convertView.findViewById(C0966R.C0970id.f6117xs);
            this.f217694e = (TextView) this.convertView.findViewById(C0966R.C0970id.f6129y4);
            this.clickArea = this.convertView.findViewById(C0966R.C0970id.b47);
            this.f217695f = C74023i.m87886m(MMApplicationContext.getContext());
            this.f217696g = C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f3651a_);
            C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3651a_);
            return this;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.p0$b */
    public static class C74164b extends C74023i {

        /* renamed from: v */
        public C67391b f217697v;

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6882r4);
            C74163a aVar = new C74163a();
            aVar.mo103211a(n4Var, false);
            n4Var.setTag(aVar);
            return n4Var;
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return false;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            return menuItem.getItemId() == 100;
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            e0Var.mo107136c(((C74243t8) view.getTag()).mo103252b(), 100, 0, this.f217697v.mo91572m().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
            return false;
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            ((C98591h) C86312j.m106911c(C98591h.class)).Gr0(f4Var.mo108768t());
            String content = f4Var.getContent();
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
            if (u == null) {
                return true;
            }
            String str = Util.isNullOrNil(u.f195572f1) ? u.f195586j : u.f195572f1;
            if (Util.isNullOrNil(str)) {
                return true;
            }
            Intent intent = new Intent();
            intent.putExtra("rawUrl", str);
            C88144b.m109791i(bVar.mo91565f(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            return true;
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            this.f217697v = bVar;
            C74163a aVar = (C74163a) cVar;
            String content = f4Var.getContent();
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
            if (u != null) {
                C74162p0.m88331a(cVar.clickArea, u, "MicroMsg.ChattingItemAppMsgC2CNewFrom", false, aVar);
                aVar.f217692c.setTypeface(Typeface.defaultFromStyle(0));
                bVar.mo91565f().getResources().getDimensionPixelSize(C0966R.dimen.f3956le);
                bVar.mo91565f().getResources().getDimensionPixelSize(C0966R.dimen.f4249xl);
                aVar.clickArea.setPadding(0, 0, 0, 0);
                aVar.resetChatBubbleWidth(aVar.clickArea, aVar.f217695f);
                C68061b bVar2 = (C68061b) u.mo93555w(C68061b.class);
                String str2 = f4Var.mo108769t2() == 1 ? bVar2.f195360g : bVar2.f195359f;
                if (Util.isNullOrNil(str2)) {
                    str2 = u.f195574g;
                    aVar.f217692c.setSingleLine(false);
                    aVar.f217692c.setMaxLines(3);
                } else {
                    aVar.f217692c.setSingleLine(true);
                }
                aVar.f217692c.setText(((C76979h) C86312j.m106911c(C76979h.class)).op0(bVar.mo91565f(), str2, aVar.f217696g));
                aVar.f217692c.setTextSize(0, (float) aVar.f217696g);
                if (C85875k4.m106211z()) {
                    long j = Util.getLong(bVar2.f195374u, -1);
                    if (j >= 0) {
                        aVar.f217692c.setTextColor((int) j);
                    }
                } else {
                    long j2 = Util.getLong(bVar2.f195361h, -1);
                    if (j2 >= 0) {
                        aVar.f217692c.setTextColor((int) j2);
                    }
                }
                aVar.f217693d.setText(f4Var.mo108769t2() == 1 ? bVar2.f195364k : bVar2.f195365l);
                if (C85875k4.m106211z()) {
                    long j3 = Util.getLong(bVar2.f195376w, -1);
                    if (j3 >= 0) {
                        aVar.f217693d.setTextColor((int) j3);
                    }
                } else {
                    long j4 = Util.getLong(bVar2.f195366m, -1);
                    if (j4 >= 0) {
                        aVar.f217693d.setTextColor((int) j4);
                    }
                }
                aVar.f217694e.setText(f4Var.mo108769t2() == 1 ? bVar2.f195362i : bVar2.f195363j);
                aVar.f217691b.setImageBitmap((Bitmap) null);
                if (!Util.isNullOrNil(bVar2.f195357d)) {
                    if (bVar2.f195357d.startsWith("http")) {
                        C20937c.C20939b bVar3 = new C20937c.C20939b();
                        C97625j3.m125812b().getClass();
                        bVar3.f59351g = C7970a.m8128b();
                        bVar3.f59346b = true;
                        bVar3.f59363s = true;
                        C20828a.m22825b().mo32519h(bVar2.f195357d, aVar.f217691b, bVar3.mo32666a());
                    } else {
                        int identifier = MMApplicationContext.getResources().getIdentifier(bVar2.f195357d, "drawable", MMApplicationContext.getPackageName());
                        if (identifier > 0) {
                            aVar.f217691b.setImageResource(identifier);
                        }
                    }
                }
            }
            cVar.clickArea.setOnClickListener(mo103099u(bVar));
            cVar.clickArea.setOnLongClickListener(mo103098p(bVar));
            cVar.clickArea.setOnTouchListener(((C79368l) bVar.f193278b.mo102812a(C79368l.class)).mo108189Z4());
            cVar.clickArea.setTag(new C74243t8(f4Var, this.f217697v.mo91583x(), cVar, (String) null));
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return !z && i == 536936497;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.p0$c */
    public static class C74165c extends C74023i {

        /* renamed from: v */
        public C67391b f217698v;

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6933sl);
            C74163a aVar = new C74163a();
            aVar.mo103211a(n4Var, false);
            n4Var.setTag(aVar);
            return n4Var;
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return true;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            menuItem.getItemId();
            return false;
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            int b = ((C74243t8) view.getTag()).mo103252b();
            if (C75569c4.m90690w(f4Var)) {
                e0Var.clear();
            }
            e0Var.mo107136c(b, 100, 0, this.f217698v.mo91572m().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
            return false;
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            ((C98591h) C86312j.m106911c(C98591h.class)).Gr0(f4Var.mo108768t());
            String content = f4Var.getContent();
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
            if (u == null) {
                return true;
            }
            String str = Util.isNullOrNil(u.f195572f1) ? u.f195586j : u.f195572f1;
            if (Util.isNullOrNil(str)) {
                return true;
            }
            Intent intent = new Intent();
            intent.putExtra("rawUrl", str);
            C88144b.m109791i(bVar.mo91565f(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            return true;
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            this.f217698v = bVar;
            C74163a aVar = (C74163a) cVar;
            String content = f4Var.getContent();
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
            if (u != null) {
                C74162p0.m88331a(cVar.clickArea, u, "MicroMsg.ChattingItemAppMsgC2CNewTo", true, aVar);
                aVar.f217692c.setTypeface(Typeface.defaultFromStyle(0));
                bVar.mo91565f().getResources().getDimensionPixelSize(C0966R.dimen.f3956le);
                bVar.mo91565f().getResources().getDimensionPixelSize(C0966R.dimen.f4249xl);
                aVar.clickArea.setPadding(0, 0, 0, 0);
                aVar.resetChatBubbleWidth(aVar.clickArea, aVar.f217695f);
                C68061b bVar2 = (C68061b) u.mo93555w(C68061b.class);
                String str2 = f4Var.mo108769t2() == 1 ? bVar2.f195360g : bVar2.f195359f;
                if (Util.isNullOrNil(str2)) {
                    str2 = u.f195574g;
                    aVar.f217692c.setSingleLine(false);
                    aVar.f217692c.setMaxLines(3);
                } else {
                    aVar.f217692c.setSingleLine(true);
                }
                aVar.f217692c.setText(((C76979h) C86312j.m106911c(C76979h.class)).op0(bVar.mo91565f(), str2, aVar.f217696g));
                aVar.f217692c.setTextSize(0, (float) aVar.f217696g);
                if (C85875k4.m106211z()) {
                    long j = Util.getLong(bVar2.f195374u, -1);
                    if (j >= 0) {
                        aVar.f217692c.setTextColor((int) j);
                    }
                } else {
                    long j2 = Util.getLong(bVar2.f195361h, -1);
                    if (j2 >= 0) {
                        aVar.f217692c.setTextColor((int) j2);
                    }
                }
                aVar.f217693d.setText(f4Var.mo108769t2() == 1 ? bVar2.f195364k : bVar2.f195365l);
                if (C85875k4.m106211z()) {
                    long j3 = Util.getLong(bVar2.f195376w, -1);
                    if (j3 >= 0) {
                        aVar.f217693d.setTextColor((int) j3);
                    }
                } else {
                    long j4 = Util.getLong(bVar2.f195366m, -1);
                    if (j4 >= 0) {
                        aVar.f217693d.setTextColor((int) j4);
                    }
                }
                aVar.f217694e.setText(f4Var.mo108769t2() == 1 ? bVar2.f195362i : bVar2.f195363j);
                aVar.f217691b.setImageBitmap((Bitmap) null);
                if (!Util.isNullOrNil(bVar2.f195357d)) {
                    if (bVar2.f195357d.startsWith("http")) {
                        C20937c.C20939b bVar3 = new C20937c.C20939b();
                        C97625j3.m125812b().getClass();
                        bVar3.f59351g = C7970a.m8128b();
                        bVar3.f59346b = true;
                        bVar3.f59363s = true;
                        C20828a.m22825b().mo32519h(bVar2.f195357d, aVar.f217691b, bVar3.mo32666a());
                    } else {
                        int identifier = MMApplicationContext.getResources().getIdentifier(bVar2.f195357d, "drawable", MMApplicationContext.getPackageName());
                        if (identifier > 0) {
                            aVar.f217691b.setImageResource(identifier);
                        }
                    }
                }
            }
            cVar.clickArea.setOnClickListener(mo103099u(bVar));
            cVar.clickArea.setOnLongClickListener(mo103098p(bVar));
            cVar.clickArea.setOnTouchListener(((C79368l) bVar.f193278b.mo102812a(C79368l.class)).mo108189Z4());
            cVar.clickArea.setTag(new C74243t8(f4Var, this.f217698v.mo91583x(), cVar, (String) null));
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return z && i == 536936497;
        }
    }

    /* renamed from: a */
    public static void m88331a(View view, C68070l.C68072b bVar, String str, boolean z, C74163a aVar) {
        if (bVar != null) {
            C68061b bVar2 = (C68061b) bVar.mo93555w(C68061b.class);
            String str2 = z ? bVar2.f195368o : bVar2.f195371r;
            if (!Util.isNullOrNil(str2)) {
                Log.m105925i(str, "get background name: %s", str2);
                int identifier = view.getResources().getIdentifier(str2, "drawable", MMApplicationContext.getPackageName());
                if (identifier > 0) {
                    view.setBackgroundResource(identifier);
                    return;
                }
            }
            String str3 = z ? bVar2.f195369p : bVar2.f195372s;
            if (!Util.isNullOrNil(str3)) {
                ((C119157j) C119157j.f356862d).mo183868B(new C74146o0(str, str3, aVar, z, view));
            }
        }
    }

    /* renamed from: b */
    public static Bitmap m88332b(String str, Bitmap bitmap, int i, int i2, boolean z) {
        Log.m105919d(str, "th: %s, tw: %s", Integer.valueOf(i), Integer.valueOf(i2));
        return BitmapUtil.createChattingImage(BitmapUtil.getCenterCropBitmap(bitmap, i2, i, false), z ? C0966R.C0969drawable.be_ : C0966R.C0969drawable.byc);
    }
}
