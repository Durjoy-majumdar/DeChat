package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.net.Uri;
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
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import i21.C98591h;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import nj3.C76874e0;
import nj3.C76879j;
import p287zz.C79445i;
import p629ny.C76979h;
import zj3.C79368l;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.n0 */
public class C74126n0 {

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.n0$a */
    public static class C74127a extends C74023i.C74026c {

        /* renamed from: b */
        public CdnImageView f217606b;

        /* renamed from: c */
        public TextView f217607c;

        /* renamed from: d */
        public TextView f217608d;

        /* renamed from: e */
        public TextView f217609e;

        /* renamed from: f */
        public View f217610f;

        /* renamed from: g */
        public ImageView f217611g;

        /* renamed from: h */
        public ImageView f217612h;

        /* renamed from: i */
        public int f217613i = 0;

        /* renamed from: j */
        public int f217614j = 0;

        /* renamed from: a */
        public C74127a mo103192a(View view, boolean z) {
            super.create(view);
            this.timeTV = (TextView) this.convertView.findViewById(C0966R.C0970id.b8z);
            this.checkBox = (CheckBox) this.convertView.findViewById(C0966R.C0970id.b46);
            this.maskView = this.convertView.findViewById(C0966R.C0970id.b7h);
            this.userTV = (TextView) this.convertView.findViewById(C0966R.C0970id.b9_);
            this.f217606b = (CdnImageView) this.convertView.findViewById(C0966R.C0970id.f6119xu);
            this.f217607c = (TextView) this.convertView.findViewById(C0966R.C0970id.f6125y0);
            this.f217608d = (TextView) this.convertView.findViewById(C0966R.C0970id.f6117xs);
            this.f217609e = (TextView) this.convertView.findViewById(C0966R.C0970id.f6129y4);
            this.f217610f = this.convertView.findViewById(C0966R.C0970id.f6118xt);
            this.clickArea = this.convertView.findViewById(C0966R.C0970id.b47);
            this.f217611g = (ImageView) this.convertView.findViewById(C0966R.C0970id.n6j);
            this.f217612h = (ImageView) this.convertView.findViewById(C0966R.C0970id.n6k);
            this.f217613i = C74023i.m87886m(MMApplicationContext.getContext());
            this.f217614j = C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f3651a_);
            C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3651a_);
            return this;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.n0$b */
    public static class C74128b extends C74023i {

        /* renamed from: v */
        public C67391b f217615v;

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.cxo);
            C74127a aVar = new C74127a();
            aVar.mo103192a(n4Var, false);
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
            e0Var.mo107136c(((C74243t8) view.getTag()).mo103252b(), 100, 0, this.f217615v.mo91572m().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
            return false;
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            ((C98591h) C86312j.m106911c(C98591h.class)).Gr0(f4Var.mo108768t());
            String content = f4Var.getContent();
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
            if (u != null) {
                Log.m105924i("MicroMsg.ChattingItemAppMsgC2CHoneyPayFrom", "click honey pay");
                String queryParameter = Uri.parse(((C68061b) u.mo93555w(C68061b.class)).f195356c).getQueryParameter("cardNo");
                Intent intent = new Intent();
                intent.putExtra("key_is_payer", false);
                intent.putExtra("key_card_no", queryParameter);
                if (!WeChatBrands.Business.Entries.SessionPayment.checkAvailable(view.getContext())) {
                    return true;
                }
                C88144b.m109791i(bVar.mo91565f(), "honey_pay", ".ui.HoneyPayProxyUI", intent, (Bundle) null);
                C115669n.INSTANCE.mo160131h(15191, 0, 0, 0, 0, 0, 0, 1);
            }
            return true;
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            this.f217615v = bVar;
            String content = f4Var.getContent();
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
            C74127a aVar = (C74127a) cVar;
            if (u != null) {
                C68061b bVar2 = (C68061b) u.mo93555w(C68061b.class);
                C74126n0.m88227a(aVar, u, false);
                C74126n0.m88228b(bVar, f4Var, bVar2, aVar, u);
                C74126n0.m88229c(bVar, f4Var, bVar2, aVar, u);
                C74126n0.m88230d(bVar, f4Var, bVar2, aVar, u);
                C74126n0.m88231e(bVar, f4Var, bVar2, aVar, u);
                C74126n0.m88232f(bVar, f4Var, bVar2, aVar, u);
            }
            aVar.clickArea.setOnClickListener(mo103099u(bVar));
            aVar.clickArea.setOnLongClickListener(mo103098p(bVar));
            aVar.clickArea.setOnTouchListener(((C79368l) bVar.f193278b.mo102812a(C79368l.class)).mo108189Z4());
            aVar.clickArea.setTag(new C74243t8(f4Var, this.f217615v.mo91583x(), cVar, (String) null));
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return !z && i == 536870961;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.n0$c */
    public static class C74129c extends C74023i {

        /* renamed from: v */
        public C67391b f217616v;

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.n0$c$a */
        public class C74130a implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ String f217617d;

            /* renamed from: e */
            public final /* synthetic */ String f217618e;

            /* renamed from: f */
            public final /* synthetic */ String f217619f;

            /* renamed from: g */
            public final /* synthetic */ String f217620g;

            /* renamed from: h */
            public final /* synthetic */ String f217621h;

            /* renamed from: i */
            public final /* synthetic */ String f217622i;

            /* renamed from: j */
            public final /* synthetic */ String f217623j;

            /* renamed from: n */
            public final /* synthetic */ String f217624n;

            /* renamed from: o */
            public final /* synthetic */ C67391b f217625o;

            public C74130a(C74129c cVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, C67391b bVar) {
                this.f217617d = str;
                this.f217618e = str2;
                this.f217619f = str3;
                this.f217620g = str4;
                this.f217621h = str5;
                this.f217622i = str6;
                this.f217623j = str7;
                this.f217624n = str8;
                this.f217625o = bVar;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent();
                intent.putExtra("key_scene", 1);
                intent.putExtra("key_receiver", this.f217617d);
                intent.putExtra("key_receivertitle", this.f217618e);
                intent.putExtra("key_sendertitle", this.f217619f);
                intent.putExtra("key_sender_des", this.f217620g);
                intent.putExtra("key_receiver_des", this.f217621h);
                intent.putExtra("key_url", this.f217622i);
                intent.putExtra("key_templateid", this.f217623j);
                intent.putExtra("key_sceneid", this.f217624n);
                C88144b.m109791i(this.f217625o.mo91565f(), "wallet_index", ".ui.WalletSendC2CMsgUI", intent, (Bundle) null);
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.n0$c$b */
        public class C74131b implements DialogInterface.OnClickListener {
            public C74131b(C74129c cVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.cxr);
            C74127a aVar = new C74127a();
            aVar.mo103192a(n4Var, false);
            n4Var.setTag(aVar);
            return n4Var;
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return true;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            if (menuItem.getItemId() != 103) {
                return false;
            }
            String content = f4Var.getContent();
            C68070l.C68072b bVar2 = null;
            if (content != null) {
                bVar2 = C68070l.C68072b.m80422u(content, f4Var.mo108775z2());
            }
            if (bVar2 != null) {
                String t = f4Var.mo108768t();
                String str = bVar2.f195580h1;
                String str2 = bVar2.f195584i1;
                String str3 = bVar2.f195588j1;
                String str4 = bVar2.f195592k1;
                String str5 = bVar2.f195572f1;
                String str6 = bVar2.f195600m1;
                String str7 = bVar2.f195604n1;
                C76879j.m92707A(bVar.mo91565f(), bVar.mo91572m().getString(C0966R.string.f360268bb1), bVar.mo91572m().getString(C0966R.string.a2d), bVar.mo91572m().getString(C0966R.string.f360269bb2), bVar.mo91572m().getString(C0966R.string.f7926wf), new C74130a(this, t, str, str2, str3, str4, str5, str6, str7, bVar), new C74131b(this));
                return true;
            }
            return true;
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            e0Var.mo107136c(((C74243t8) view.getTag()).mo103252b(), 100, 0, this.f217616v.mo91572m().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
            return false;
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            ((C98591h) C86312j.m106911c(C98591h.class)).Gr0(f4Var.mo108768t());
            String content = f4Var.getContent();
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
            if (u != null) {
                Log.m105924i("MicroMsg.ChattingItemAppMsgC2CHoneyPayTo", "click honey pay");
                String queryParameter = Uri.parse(((C68061b) u.mo93555w(C68061b.class)).f195355b).getQueryParameter("cardNo");
                Intent intent = new Intent();
                intent.putExtra("key_is_payer", true);
                intent.putExtra("key_card_no", queryParameter);
                C88144b.m109791i(bVar.mo91565f(), "honey_pay", ".ui.HoneyPayProxyUI", intent, (Bundle) null);
            }
            return true;
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            this.f217616v = bVar;
            String content = f4Var.getContent();
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
            C74127a aVar = (C74127a) cVar;
            if (u != null) {
                C68061b bVar2 = (C68061b) u.mo93555w(C68061b.class);
                C74126n0.m88227a(aVar, u, true);
                C74126n0.m88228b(bVar, f4Var, bVar2, aVar, u);
                C74126n0.m88229c(bVar, f4Var, bVar2, aVar, u);
                C74126n0.m88230d(bVar, f4Var, bVar2, aVar, u);
                C74126n0.m88231e(bVar, f4Var, bVar2, aVar, u);
                C74126n0.m88232f(bVar, f4Var, bVar2, aVar, u);
            }
            aVar.clickArea.setOnClickListener(mo103099u(bVar));
            aVar.clickArea.setOnLongClickListener(mo103098p(bVar));
            aVar.clickArea.setOnTouchListener(((C79368l) bVar.f193278b.mo102812a(C79368l.class)).mo108189Z4());
            aVar.clickArea.setTag(new C74243t8(f4Var, this.f217616v.mo91583x(), cVar, (String) null));
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return z && i == 536870961;
        }
    }

    /* renamed from: a */
    public static void m88227a(C74127a aVar, C68070l.C68072b bVar, boolean z) {
        View view = aVar.clickArea;
        ImageView imageView = aVar.f217611g;
        ImageView imageView2 = aVar.f217612h;
        imageView.setVisibility(8);
        imageView2.setVisibility(8);
        if (bVar != null) {
            C68061b bVar2 = (C68061b) bVar.mo93555w(C68061b.class);
            String str = z ? bVar2.f195368o : bVar2.f195371r;
            if (!Util.isNullOrNil(str)) {
                Log.m105925i("MicroMsg.ChattingItemAppMsgC2CHoneyPay", "get background name: %s", str);
                int identifier = view.getResources().getIdentifier(str, "drawable", MMApplicationContext.getPackageName());
                if (identifier > 0) {
                    view.setBackgroundResource(identifier);
                    view.setPadding(0, 0, 0, 0);
                    aVar.resetChatBubbleWidth(view, aVar.f217613i);
                    return;
                }
            }
            String str2 = z ? (!C85875k4.m106211z() || Util.isNullOrNil(bVar2.f195370q)) ? bVar2.f195369p : bVar2.f195370q : (!C85875k4.m106211z() || Util.isNullOrNil(bVar2.f195373t)) ? bVar2.f195372s : bVar2.f195373t;
            if (!Util.isNullOrNil(str2)) {
                imageView.setVisibility(0);
                imageView2.setVisibility(0);
                if (z) {
                    view.setBackgroundResource(C0966R.C0969drawable.cjj);
                    imageView2.setImageResource(C0966R.C0969drawable.cic);
                } else {
                    view.setBackgroundResource(C0966R.C0969drawable.cjg);
                    imageView2.setImageResource(C0966R.C0969drawable.cib);
                }
                view.post(new C74109m0(str2, view, imageView, imageView2, str2, z));
            } else {
                imageView.setVisibility(8);
                imageView2.setVisibility(8);
                if (z) {
                    view.setBackgroundResource(C0966R.C0969drawable.c2csendermsgnodebg);
                } else {
                    view.setBackgroundResource(C0966R.C0969drawable.c2creceivermsgnodebg);
                }
            }
        }
        view.setPadding(0, 0, 0, 0);
        aVar.resetChatBubbleWidth(view, aVar.f217613i);
    }

    /* renamed from: b */
    public static void m88228b(C67391b bVar, C72963f4 f4Var, C68061b bVar2, C74127a aVar, C68070l.C68072b bVar3) {
        TextView textView = aVar.f217607c;
        if (textView != null) {
            textView.setTypeface(Typeface.defaultFromStyle(0));
            String str = f4Var.mo108769t2() == 1 ? bVar2.f195360g : bVar2.f195359f;
            if (Util.isNullOrNil(str)) {
                str = bVar3.f195574g;
                aVar.f217607c.setSingleLine(false);
                aVar.f217607c.setMaxLines(3);
            } else {
                aVar.f217607c.setSingleLine(true);
            }
            aVar.f217607c.setText(((C76979h) C86312j.m106911c(C76979h.class)).op0(bVar.mo91565f(), str, aVar.f217614j));
            aVar.f217607c.setTextSize(0, (float) aVar.f217614j);
            int mo = ((C79445i) C86312j.m106911c(C79445i.class)).mo109192mo(bVar2.f195361h, !Util.isNullOrNil(bVar2.f195375v) ? bVar2.f195375v : bVar2.f195374u);
            if (mo != -1) {
                aVar.f217607c.setTextColor(mo);
            } else {
                aVar.f217607c.setTextColor(bVar.mo91565f().getResources().getColor(C0966R.color.f2975b6));
            }
        }
    }

    /* renamed from: c */
    public static void m88229c(C67391b bVar, C72963f4 f4Var, C68061b bVar2, C74127a aVar, C68070l.C68072b bVar3) {
        TextView textView = aVar.f217608d;
        if (textView != null) {
            textView.setText(f4Var.mo108769t2() == 1 ? bVar2.f195364k : bVar2.f195365l);
            int mo = ((C79445i) C86312j.m106911c(C79445i.class)).mo109192mo(bVar2.f195366m, !Util.isNullOrNil(bVar2.f195377x) ? bVar2.f195377x : bVar2.f195376w);
            if (mo != -1) {
                aVar.f217608d.setTextColor(mo);
            } else {
                aVar.f217608d.setTextColor(bVar.mo91565f().getResources().getColor(C0966R.color.f2975b6));
            }
        }
    }

    /* renamed from: d */
    public static void m88230d(C67391b bVar, C72963f4 f4Var, C68061b bVar2, C74127a aVar, C68070l.C68072b bVar3) {
        TextView textView = aVar.f217609e;
        if (textView != null) {
            textView.setText(f4Var.mo108769t2() == 1 ? bVar2.f195362i : bVar2.f195363j);
            if (Util.isNullOrNil(bVar2.f195379z) || !bVar2.f195379z.equals("#888888")) {
                int mo = ((C79445i) C86312j.m106911c(C79445i.class)).mo109192mo(bVar2.f195379z, bVar2.f195378y);
                if (mo != -1) {
                    aVar.f217609e.setTextColor(mo);
                    aVar.f217609e.setAlpha(1.0f);
                    return;
                }
                aVar.f217609e.setTextColor(bVar.mo91565f().getResources().getColor(C0966R.color.f2975b6));
                aVar.f217609e.setAlpha(0.7f);
                return;
            }
            aVar.f217609e.setTextColor(bVar.mo91565f().getResources().getColor(C0966R.color.f2975b6));
            if (C85875k4.m106211z()) {
                aVar.f217609e.setAlpha(0.5f);
            } else {
                aVar.f217609e.setAlpha(0.8f);
            }
        }
    }

    /* renamed from: e */
    public static void m88231e(C67391b bVar, C72963f4 f4Var, C68061b bVar2, C74127a aVar, C68070l.C68072b bVar3) {
        CdnImageView cdnImageView = aVar.f217606b;
        if (cdnImageView != null) {
            cdnImageView.setImageBitmap((Bitmap) null);
            String str = (!C85875k4.m106211z() || Util.isNullOrNil(bVar2.f195358e)) ? !Util.isNullOrNil(bVar2.f195357d) ? bVar2.f195357d : "" : bVar2.f195358e;
            int b = C76577a.m92151b(bVar.mo91565f(), 40);
            cdnImageView.mo100288c(str, b, b, C0966R.raw.honey_pay_bank_logo);
        }
    }

    /* renamed from: f */
    public static void m88232f(C67391b bVar, C72963f4 f4Var, C68061b bVar2, C74127a aVar, C68070l.C68072b bVar3) {
        if (aVar.f217610f != null) {
            int mo = ((C79445i) C86312j.m106911c(C79445i.class)).mo109192mo(bVar2.f195353A, bVar2.f195354B);
            if (mo != -1) {
                aVar.f217610f.setBackgroundColor(mo);
                View view = aVar.f217610f;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(Float.valueOf(1.0f));
                View view2 = view;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2CHoneyPay", "setSeperateLineStyle", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/message/AppContentC2CNewPiece;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2CHoneyPay$AppMsgC2CHolder;Lcom/tencent/mm/message/AppMessage$Content;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2CHoneyPay", "setSeperateLineStyle", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/message/AppContentC2CNewPiece;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2CHoneyPay$AppMsgC2CHolder;Lcom/tencent/mm/message/AppMessage$Content;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                return;
            }
            aVar.f217610f.setBackgroundColor(bVar.mo91565f().getResources().getColor(C0966R.color.f2975b6));
            View view3 = aVar.f217610f;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(Float.valueOf(0.2f));
            View view4 = view3;
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2CHoneyPay", "setSeperateLineStyle", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/message/AppContentC2CNewPiece;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2CHoneyPay$AppMsgC2CHolder;Lcom/tencent/mm/message/AppMessage$Content;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
            C117292a.m165359e(view4, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2CHoneyPay", "setSeperateLineStyle", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/message/AppContentC2CNewPiece;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgC2CHoneyPay$AppMsgC2CHolder;Lcom/tencent/mm/message/AppMessage$Content;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    /* renamed from: g */
    public static Bitmap m88233g(Bitmap bitmap, int i, int i2, boolean z) {
        int ceil = (int) Math.ceil((double) (((float) bitmap.getWidth()) * (((float) i) / ((float) bitmap.getHeight()))));
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, ceil, i, true);
        int i3 = ceil - i2;
        if (i3 < 0) {
            i3 = 0;
        }
        return BitmapUtil.createChattingImage(BitmapUtil.getBitmapFromRectFixed(createScaledBitmap, new Rect(i3, 0, ceil, i), false), z ? C0966R.C0969drawable.cjf : C0966R.C0969drawable.cji);
    }
}
