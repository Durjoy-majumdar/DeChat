package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Intent;
import android.graphics.Bitmap;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C92721n;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74244u;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.game.p061ui.GameRoundImageView;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72915l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import eb0.C75604z3;
import eb0.C86493v0;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.lang.ref.WeakReference;
import js0.C9515s;
import k20.C9556a;
import kg3.C76577a;
import lg3.C88494d;
import nj3.C76874e0;
import oz1.C77050b;
import p1081gi.C98121d;
import p158gt.C98201k;
import p244tt.C14088e;
import p270xi.C66282i;
import p270xi.C78839k;
import p763ym.C79138l;
import uj3.C78208e;
import zj3.C79368l;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.h2 */
public class C74015h2 {

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.h2$a */
    public static class C74016a extends C74023i.C74026c {

        /* renamed from: b */
        public MMNeat7extView f217180b;

        /* renamed from: c */
        public ImageView f217181c;

        /* renamed from: d */
        public ImageView f217182d;

        /* renamed from: e */
        public TextView f217183e;

        /* renamed from: f */
        public GameRoundImageView f217184f;

        /* renamed from: g */
        public LinearLayout f217185g;

        /* renamed from: h */
        public TextView f217186h;

        /* renamed from: i */
        public TextView f217187i;

        /* renamed from: j */
        public RelativeLayout f217188j;

        /* renamed from: k */
        public int f217189k = 0;

        /* renamed from: a */
        public C74016a mo103065a(View view, boolean z) {
            super.create(view);
            this.clickArea = this.convertView.findViewById(C0966R.C0970id.b47);
            this.userTV = (TextView) view.findViewById(C0966R.C0970id.b9_);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(C0966R.C0970id.ioq);
            this.f217181c = (ImageView) view.findViewById(C0966R.C0970id.ku_);
            this.f217182d = (ImageView) view.findViewById(C0966R.C0970id.kuc);
            this.f217180b = (MMNeat7extView) view.findViewById(C0966R.C0970id.kua);
            this.f217185g = (LinearLayout) view.findViewById(C0966R.C0970id.oee);
            this.f217183e = (TextView) view.findViewById(C0966R.C0970id.ku8);
            this.f217184f = (GameRoundImageView) view.findViewById(C0966R.C0970id.k0p);
            this.f217187i = (TextView) view.findViewById(C0966R.C0970id.ku9);
            this.f217186h = (TextView) view.findViewById(C0966R.C0970id.kub);
            this.f217188j = (RelativeLayout) view.findViewById(C0966R.C0970id.ior);
            this.f217189k = C74023i.m87885l(MMApplicationContext.getContext());
            this.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
            this.maskView = view.findViewById(C0966R.C0970id.b7h);
            return this;
        }

        /* renamed from: b */
        public void mo103066b(C74016a aVar, C78208e eVar, C67391b bVar, C72963f4 f4Var, String str, C74023i iVar, boolean z) {
            int b;
            C74016a aVar2 = aVar;
            C67391b bVar2 = bVar;
            C72963f4 f4Var2 = f4Var;
            C74023i iVar2 = iVar;
            Class cls = C79138l.class;
            Class cls2 = C72915l.class;
            Class cls3 = C77050b.class;
            String content = f4Var.getContent();
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
            if (u == null) {
                Log.m105920e("MicroMsg.GameShareViewHolder", "null == content");
                return;
            }
            ((C77050b) C86312j.m106911c(cls3)).mo107307of(u, Long.valueOf(f4Var.mo108774y2()), 1);
            aVar2.resetChatBubbleWidth(aVar2.clickArea, aVar2.f217189k);
            String str2 = u.f195570f;
            if (str2 == null || str2.length() <= 0) {
                aVar2.f217180b.setVisibility(8);
            } else {
                aVar2.f217180b.setMaxLines(2);
                aVar2.f217180b.mo104279b(u.mo93550m());
                aVar2.f217180b.setVisibility(0);
            }
            C72915l lVar = (C72915l) u.mo93555w(cls2);
            String str3 = u.f195562d;
            if (str3 == null || str3.length() == 0) {
                aVar2.f217185g.setVisibility(8);
                aVar2.f217184f.setVisibility(8);
                aVar2.f217183e.setVisibility(8);
                aVar2.f217187i.setVisibility(8);
            } else {
                aVar2.f217185g.setVisibility(0);
                aVar2.f217184f.setImageResource(C0966R.C0969drawable.f4796n6);
                Bitmap ub = ((C79138l) C86312j.m106911c(cls)).mo74018ub(u.f195562d, 2, C76577a.m92156g(bVar.mo91565f()));
                if (ub != null && !ub.isRecycled()) {
                    aVar2.f217184f.setVisibility(0);
                    aVar2.f217184f.setImageBitmap(ub);
                }
                aVar2.f217183e.setVisibility(0);
                String str4 = u.f195484F;
                if (str4 == null) {
                    aVar2.f217183e.setText(((C79138l) C86312j.m106911c(cls)).mo74012l5(bVar.mo91565f(), u.f195562d));
                } else {
                    aVar2.f217183e.setText(str4);
                }
                if (lVar.f212517h == 0) {
                    Log.m105924i("MicroMsg.GameShareViewHolder", "johnjh begin expose");
                    Class cls4 = C75700k0.class;
                    C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls4)).mo96095LE()).b00(f4Var.getMsgId());
                    String content2 = b002.getContent();
                    C68070l.C68072b u2 = content2 != null ? C68070l.C68072b.m80422u(content2, b002.mo108775z2()) : null;
                    if (u2 != null) {
                        C72915l lVar2 = (C72915l) u2.mo93555w(cls2);
                        lVar2.f212517h = 1;
                        StringBuilder sb = new StringBuilder();
                        u2.mo93545f(lVar2);
                        lVar2.mo7616c(sb, u2, (String) null, (C98121d) null, 0, 0);
                        C74015h2.m87848a(sb, b002);
                        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls4)).mo96095LE()).xy0(f4Var.getMsgId(), b002);
                    }
                    if (Util.isNullOrNil(lVar.f212518i)) {
                        ((C77050b) C86312j.m106911c(cls3)).mo107304GM(lVar.f212514e, new C73991g2(f4Var2));
                    }
                } else {
                    Log.m105924i("MicroMsg.GameShareViewHolder", "johnjh isexposed");
                    if (!Util.isNullOrNil(lVar.f212518i)) {
                        aVar2.f217187i.setText(lVar.f212518i);
                        aVar2.f217187i.setVisibility(0);
                    }
                }
            }
            if (lVar.f212515f == 1) {
                aVar2.f217182d.setVisibility(0);
                String d = C92721n.m116876d(lVar.f212516g);
                aVar2.f217186h.setVisibility(0);
                aVar2.f217186h.setText(d);
            } else {
                aVar2.f217182d.setVisibility(8);
                aVar2.f217186h.setVisibility(8);
            }
            int h = ((C76577a.m92157h(bVar.mo91565f(), C0966R.dimen.f4284yo) - C76577a.m92151b(bVar.mo91565f(), 24)) * 9) / 16;
            if (C76577a.m92165p(bVar.mo91565f()) > 1.0f && aVar2.f217188j.getLayoutParams().height != (b = (int) ((((((float) aVar2.f217189k) / C88494d.f255615g) - (((float) C76577a.m92151b(bVar.mo91565f(), 29)) * C76577a.m92165p(bVar.mo91565f()))) * 9.0f) / 16.0f))) {
                aVar2.f217188j.getLayoutParams().height = b;
                aVar2.f217188j.requestLayout();
            }
            Bitmap jo = !C74244u.C74247d.m88512b(f4Var.mo108765s2()) ? ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).mo127188jo(f4Var.mo108765s2(), C76577a.m92156g(bVar.mo91565f()), false) : null;
            if (jo == null || jo.isRecycled()) {
                aVar2.f217181c.setImageResource(C0966R.color.f3237k_);
            } else {
                aVar2.f217181c.setImageBitmap(jo);
            }
            aVar2.clickArea.setTag(new C74243t8(f4Var2, bVar.mo91583x(), aVar2, (String) null));
            aVar2.clickArea.setOnClickListener(iVar2.mo103099u(bVar2));
            aVar2.clickArea.setOnLongClickListener(iVar2.mo103098p(bVar2));
            aVar2.clickArea.setOnTouchListener(((C79368l) bVar2.f193278b.mo102812a(C79368l.class)).mo108189Z4());
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.h2$b */
    public static class C74017b extends C74023i {

        /* renamed from: v */
        public C67391b f217190v;

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.d9_);
            C74016a aVar = new C74016a();
            aVar.mo103065a(n4Var, false);
            n4Var.setTag(aVar);
            return n4Var;
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return false;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            int itemId = menuItem.getItemId();
            if (itemId == 100) {
                return true;
            }
            if (itemId != 111) {
                return false;
            }
            Intent intent = new Intent(bVar.mo91565f(), MsgRetransmitUI.class);
            intent.putExtra("Retr_Msg_content", C75604z3.m90840l(bVar.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()));
            intent.putExtra("Retr_Msg_Type", 2);
            intent.putExtra("Retr_Msg_Id", f4Var.getMsgId());
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C67391b bVar2 = bVar;
            C117292a.m165358d(bVar2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGameShare$ChattingItemAppMsgGameShareFrom", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            bVar.mo91556Q((Intent) aVar.mo10231a(0));
            C117292a.m165359e(bVar2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGameShare$ChattingItemAppMsgGameShareFrom", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return false;
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            int b = ((C74243t8) view.getTag()).mo103252b();
            if (f4Var == null) {
                return true;
            }
            C76874e0 e0Var2 = e0Var;
            int i = b;
            e0Var2.mo107136c(i, 111, 0, this.f217190v.mo91572m().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
            e0Var2.mo107136c(i, 136, 0, this.f217190v.mo91572m().getString(C0966R.string.b_6), C0966R.raw.icons_filled_quote);
            return true;
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            String content = f4Var.getContent();
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
            C74015h2.m87850c(u, view, bVar, f4Var);
            ((C77050b) C86312j.m106911c(C77050b.class)).mo107307of(u, Long.valueOf(f4Var.mo108774y2()), 2);
            return false;
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            C74016a aVar = (C74016a) cVar;
            this.f217190v = bVar;
            aVar.mo103066b(aVar, cVar, bVar, f4Var, str, this, true);
            ((C14088e) C86312j.m106911c(C14088e.class)).mo13505KY();
            C74015h2.m87849b(bVar);
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return !z && i == 1140850737;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.h2$c */
    public static class C74018c extends C74023i {

        /* renamed from: v */
        public C67391b f217191v;

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.d9a);
            C74016a aVar = new C74016a();
            aVar.mo103065a(n4Var, true);
            n4Var.setTag(aVar);
            return n4Var;
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return true;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            int itemId = menuItem.getItemId();
            if (itemId == 100) {
                return true;
            }
            if (itemId != 111) {
                return false;
            }
            Intent intent = new Intent(bVar.mo91565f(), MsgRetransmitUI.class);
            intent.putExtra("Retr_Msg_content", C75604z3.m90840l(bVar.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()));
            intent.putExtra("Retr_Msg_Type", 2);
            intent.putExtra("Retr_Msg_Id", f4Var.getMsgId());
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C67391b bVar2 = bVar;
            C117292a.m165358d(bVar2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGameShare$ChattingItemAppMsgGameShareTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            bVar.mo91556Q((Intent) aVar.mo10231a(0));
            C117292a.m165359e(bVar2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGameShare$ChattingItemAppMsgGameShareTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return false;
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            int b = ((C74243t8) view.getTag()).mo103252b();
            if (f4Var != null) {
                e0Var.mo107136c(b, 111, 0, this.f217191v.mo91572m().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
                e0Var.mo107136c(b, 136, 0, this.f217191v.mo91572m().getString(C0966R.string.b_6), C0966R.raw.icons_filled_quote);
            }
            if ((f4Var.getStatus() == 2 || f4Var.f230728K == 1) && mo103083Q(f4Var, this.f217191v) && mo103081O(f4Var.mo108768t()) && !this.f217191v.mo91580u()) {
                e0Var.mo107136c(b, 123, 0, view.getContext().getString(C0966R.string.b_d), C0966R.raw.icons_filled_previous);
            }
            return true;
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            String content = f4Var.getContent();
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
            C74015h2.m87850c(u, view, bVar, f4Var);
            ((C77050b) C86312j.m106911c(C77050b.class)).mo107307of(u, Long.valueOf(f4Var.mo108774y2()), 2);
            return false;
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            C74016a aVar = (C74016a) cVar;
            this.f217191v = bVar;
            aVar.mo103066b(aVar, cVar, bVar, f4Var, str, this, false);
            ((C14088e) C86312j.m106911c(C14088e.class)).mo13505KY();
            C74015h2.m87849b(bVar);
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return z && i == 1140850737;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.h2$d */
    public static class C74019d {
        /* renamed from: a */
        public static String m87867a(Object obj) {
            String str = "GameShareCardMsg#" + C9515s.m9209a(obj);
            Log.m105924i("MicroMsg.ChattingItemAppMsgGameShare", "johnjh token: " + str);
            return str;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.h2$e */
    public static class C74020e implements C78839k {

        /* renamed from: d */
        public WeakReference<C67391b> f217192d;

        /* renamed from: F4 */
        public void mo26186F4() {
        }

        /* renamed from: G4 */
        public void mo26160G4() {
            Log.m105924i("MicroMsg.GameShareChattingLifecycleChangedListener", "johnjh onChattingPause, then release liteapp preload.");
            ((C14088e) C86312j.m106911c(C14088e.class)).mo13508Mv();
        }

        /* renamed from: O4 */
        public void mo26162O4() {
        }

        /* renamed from: e */
        public void mo70065e() {
        }

        /* renamed from: g5 */
        public void mo70046g5() {
        }

        /* renamed from: n2 */
        public void mo26199n2() {
        }

        /* renamed from: u5 */
        public void mo26170u5() {
            C67391b bVar;
            Log.m105924i("MicroMsg.GameShareChattingLifecycleChangedListener", "johnjh onChattingExitAnimStart");
            WeakReference<C67391b> weakReference = this.f217192d;
            if (weakReference != null && (bVar = weakReference.get()) != null) {
                C86493v0.m107224d().mo120948e(C74019d.m87867a(bVar));
                ((C66282i) bVar.f193278b.mo102812a(C66282i.class)).mo90406z0(this);
            }
        }
    }

    /* renamed from: a */
    public static C72963f4 m87848a(StringBuilder sb, C72963f4 f4Var) {
        StringBuilder sb4 = new StringBuilder(f4Var.getContent());
        int indexOf = sb4.indexOf("<gameshare>");
        int indexOf2 = sb4.indexOf("</gameshare>");
        if (indexOf >= 0 && indexOf2 >= indexOf) {
            sb4.replace(indexOf, indexOf2 + 12, sb.toString());
            f4Var.mo108732L2(sb4.toString());
        }
        return f4Var;
    }

    /* renamed from: b */
    public static void m87849b(C67391b bVar) {
        C86493v0.C86495c c = C86493v0.m107224d().mo120947c(C74019d.m87867a(bVar), true);
        C74020e eVar = (C74020e) c.mo120956c("gamesharecardlistener", null);
        if (eVar == null) {
            eVar = new C74020e();
            c.mo120962i("gamesharecardlistener", eVar);
        }
        eVar.f217192d = new WeakReference<>(bVar);
        Log.m105924i("MicroMsg.GameShareChattingLifecycleChangedListener", "john attach context");
        ((C66282i) bVar.f193278b.mo102812a(C66282i.class)).mo90405j4(eVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0217  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m87850c(com.tencent.p014mm.message.C68070l.C68072b r24, android.view.View r25, ck3.C67391b r26, com.tencent.p014mm.storage.C72963f4 r27) {
        /*
            r0 = r24
            java.lang.Class<tt.e> r1 = p244tt.C14088e.class
            java.lang.Class<com.tencent.mm.pluginsdk.ui.tools.l> r2 = com.tencent.p014mm.pluginsdk.p133ui.tools.C72915l.class
            com.tencent.mm.message.g r2 = r0.mo93555w(r2)
            com.tencent.mm.pluginsdk.ui.tools.l r2 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C72915l) r2
            java.lang.String r3 = r0.f195621r2
            java.lang.String r4 = r0.f195625s2
            java.lang.String r5 = r0.f195629t2
            java.lang.String r6 = r2.f212511b
            java.lang.Class<gt.k> r7 = p158gt.C98201k.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            gt.k r7 = (p158gt.C98201k) r7
            gt.m r7 = r7.mo137277xi()
            java.lang.String r8 = r27.mo108765s2()
            com.tencent.mm.modelimage.m r7 = (com.tencent.p014mm.modelimage.C92839m) r7
            r9 = 1
            java.lang.String r7 = r7.v10(r8, r9)
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            r10 = 0
            if (r8 == 0) goto L_0x0035
        L_0x0032:
            r9 = 0
            goto L_0x0290
        L_0x0035:
            di3.d r8 = di3.C86312j.m106911c(r1)
            tt.e r8 = (p244tt.C14088e) r8
            boolean r8 = r8.e00(r3)
            if (r8 != 0) goto L_0x0042
            goto L_0x0032
        L_0x0042:
            android.app.Activity r8 = r26.mo91565f()
            android.content.res.Resources r8 = r8.getResources()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            r11 = 2
            int[] r11 = new int[r11]
            r12 = 2131299133(0x7f090b3d, float:1.8216259E38)
            r13 = r25
            android.view.View r12 = r13.findViewById(r12)
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r12.getLocationOnScreen(r11)
            r13 = r11[r10]
            r14 = r11[r9]
            int r15 = r12.getWidth()
            int r12 = r12.getHeight()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r16 = r1
            java.lang.String r1 = "johnjh imageview location :"
            r9.append(r1)
            r1 = r11[r10]
            float r1 = (float) r1
            float r1 = r1 / r8
            r9.append(r1)
            java.lang.String r1 = ", "
            r9.append(r1)
            r1 = 1
            r11 = r11[r1]
            float r1 = (float) r11
            float r1 = r1 / r8
            r9.append(r1)
            java.lang.String r1 = r9.toString()
            java.lang.String r9 = "MicroMsg.ChattingItemAppMsgGameShare"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r11 = "johnjh width:"
            r1.append(r11)
            float r11 = (float) r15
            float r11 = r11 / r8
            r1.append(r11)
            java.lang.String r15 = ", height: "
            r1.append(r15)
            float r12 = (float) r12
            float r12 = r12 / r8
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r15 = "appId"
            r1.putString(r15, r3)
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            boolean r17 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)     // Catch:{ Exception -> 0x01d5 }
            if (r17 == 0) goto L_0x00d3
            org.json.JSONObject r17 = new org.json.JSONObject     // Catch:{ Exception -> 0x01d5 }
            r17.<init>()     // Catch:{ Exception -> 0x01d5 }
            r15 = r17
            goto L_0x00d8
        L_0x00d3:
            org.json.JSONObject r15 = new org.json.JSONObject     // Catch:{ Exception -> 0x01d5 }
            r15.<init>(r5)     // Catch:{ Exception -> 0x01d5 }
        L_0x00d8:
            boolean r17 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)     // Catch:{ Exception -> 0x01d5 }
            java.lang.String r10 = "liteAppBizData"
            if (r17 != 0) goto L_0x0118
            r3.put(r10, r6)     // Catch:{ Exception -> 0x01d5 }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ Exception -> 0x01d5 }
            r10.<init>(r6)     // Catch:{ Exception -> 0x01d5 }
            java.lang.String r6 = "wechat_pkgid"
            java.lang.String r6 = r10.getString(r6)     // Catch:{ Exception -> 0x01d5 }
            r17 = r5
            java.lang.String r5 = "parallel_preload"
            org.json.JSONObject r5 = r10.optJSONObject(r5)     // Catch:{ Exception -> 0x0111 }
            if (r5 == 0) goto L_0x0104
            r19 = r6
            java.lang.String r6 = "img_url_list"
            org.json.JSONArray r5 = r5.optJSONArray(r6)     // Catch:{ Exception -> 0x0102 }
            goto L_0x0107
        L_0x0102:
            r0 = move-exception
            goto L_0x0114
        L_0x0104:
            r19 = r6
            r5 = 0
        L_0x0107:
            java.lang.String r6 = "transition"
            java.lang.String r6 = r10.optString(r6)     // Catch:{ Exception -> 0x010f }
            goto L_0x0123
        L_0x010f:
            r0 = move-exception
            goto L_0x0115
        L_0x0111:
            r0 = move-exception
            r19 = r6
        L_0x0114:
            r5 = 0
        L_0x0115:
            r15 = 0
            goto L_0x01dc
        L_0x0118:
            r17 = r5
            java.lang.String r5 = ""
            r3.put(r10, r5)     // Catch:{ Exception -> 0x01d3 }
            r5 = 0
            r6 = 0
            r19 = 0
        L_0x0123:
            java.lang.String r10 = r2.f212514e     // Catch:{ Exception -> 0x01cb }
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)     // Catch:{ Exception -> 0x01cb }
            if (r10 != 0) goto L_0x013b
            java.lang.String r10 = "shareData"
            r25 = r5
            java.lang.String r5 = r2.f212514e     // Catch:{ Exception -> 0x0135 }
            r3.put(r10, r5)     // Catch:{ Exception -> 0x0135 }
            goto L_0x013d
        L_0x0135:
            r0 = move-exception
            goto L_0x0177
        L_0x0137:
            r0 = move-exception
            r25 = r5
            goto L_0x0177
        L_0x013b:
            r25 = r5
        L_0x013d:
            java.lang.String r5 = r2.f212518i     // Catch:{ Exception -> 0x01c8 }
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)     // Catch:{ Exception -> 0x01c8 }
            if (r5 != 0) goto L_0x014c
            java.lang.String r5 = "dynamicData"
            java.lang.String r10 = r2.f212518i     // Catch:{ Exception -> 0x0135 }
            r3.put(r5, r10)     // Catch:{ Exception -> 0x0135 }
        L_0x014c:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)     // Catch:{ Exception -> 0x01c8 }
            if (r5 != 0) goto L_0x0157
            java.lang.String r5 = "imgPath"
            r3.put(r5, r7)     // Catch:{ Exception -> 0x0135 }
        L_0x0157:
            java.lang.String r5 = r0.f195570f     // Catch:{ Exception -> 0x01c8 }
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)     // Catch:{ Exception -> 0x01c8 }
            if (r5 != 0) goto L_0x0167
            java.lang.String r5 = "title"
            java.lang.String r0 = r0.f195570f     // Catch:{ Exception -> 0x0135 }
            r3.put(r5, r0)     // Catch:{ Exception -> 0x0135 }
        L_0x0167:
            java.lang.String r0 = r2.f212513d     // Catch:{ Exception -> 0x01c8 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x01c8 }
            if (r0 != 0) goto L_0x017b
            java.lang.String r0 = "gameShareId"
            java.lang.String r5 = r2.f212513d     // Catch:{ Exception -> 0x0135 }
            r3.put(r0, r5)     // Catch:{ Exception -> 0x0135 }
            goto L_0x017b
        L_0x0177:
            r5 = r25
            r15 = r6
            goto L_0x01dc
        L_0x017b:
            java.lang.String r0 = "isVideo"
            int r5 = r2.f212515f     // Catch:{ Exception -> 0x01c8 }
            r3.put(r0, r5)     // Catch:{ Exception -> 0x01c8 }
            java.lang.String r0 = "duration"
            int r2 = r2.f212516g     // Catch:{ Exception -> 0x01c8 }
            r3.put(r0, r2)     // Catch:{ Exception -> 0x01c8 }
            java.lang.String r0 = "sceneId"
            r2 = 0
            r3.put(r0, r2)     // Catch:{ Exception -> 0x01c8 }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x01c8 }
            r0.<init>()     // Catch:{ Exception -> 0x01c8 }
            java.lang.String r2 = "x"
            float r5 = (float) r13
            float r5 = r5 / r8
            r7 = r6
            double r5 = (double) r5
            r0.put(r2, r5)     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r2 = "y"
            float r5 = (float) r14     // Catch:{ Exception -> 0x01c6 }
            float r5 = r5 / r8
            double r5 = (double) r5     // Catch:{ Exception -> 0x01c6 }
            r0.put(r2, r5)     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r2 = "width"
            double r5 = (double) r11     // Catch:{ Exception -> 0x01c6 }
            r0.put(r2, r5)     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r2 = "height"
            double r5 = (double) r12     // Catch:{ Exception -> 0x01c6 }
            r0.put(r2, r5)     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r2 = "tapRect"
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01c6 }
            r15.put(r2, r0)     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r5 = r15.toString()     // Catch:{ Exception -> 0x01c6 }
            r22 = r25
            r6 = r7
            goto L_0x01f9
        L_0x01c6:
            r0 = move-exception
            goto L_0x01cf
        L_0x01c8:
            r0 = move-exception
        L_0x01c9:
            r7 = r6
            goto L_0x01cf
        L_0x01cb:
            r0 = move-exception
            r25 = r5
            goto L_0x01c9
        L_0x01cf:
            r5 = r25
            r15 = r7
            goto L_0x01dc
        L_0x01d3:
            r0 = move-exception
            goto L_0x01d8
        L_0x01d5:
            r0 = move-exception
            r17 = r5
        L_0x01d8:
            r5 = 0
            r15 = 0
            r19 = 0
        L_0x01dc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "johnjh liteapp jsonObject : "
            r2.append(r6)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
            r22 = r5
            r6 = r15
            r5 = r17
        L_0x01f9:
            r0 = r19
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r2 != 0) goto L_0x0206
            java.lang.String r2 = "path"
            r1.putString(r2, r4)
        L_0x0206:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r2 != 0) goto L_0x0211
            java.lang.String r2 = "query"
            r1.putString(r2, r5)
        L_0x0211:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 != 0) goto L_0x021c
            java.lang.String r2 = "pkgId"
            r1.putString(r2, r0)
        L_0x021c:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r0 != 0) goto L_0x0245
            java.lang.String r0 = "fadeIn"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x022b
            goto L_0x0245
        L_0x022b:
            java.lang.String r0 = "modal"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0243
            r0 = 2130772171(0x7f0100cb, float:1.7147453E38)
            java.lang.String r2 = "nextAnimIn"
            r1.putInt(r2, r0)
            r0 = 2130772172(0x7f0100cc, float:1.7147455E38)
            java.lang.String r2 = "currentAnimOut"
            r1.putInt(r2, r0)
        L_0x0243:
            r2 = 1
            goto L_0x024c
        L_0x0245:
            java.lang.String r0 = "transparent"
            r2 = 1
            r1.putBoolean(r0, r2)
        L_0x024c:
            android.app.Activity r4 = r26.mo91565f()
            android.app.Activity r0 = r26.mo91565f()
            r5 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r5 = r0.getString(r5)
            android.app.Activity r0 = r26.mo91565f()
            r6 = 2131821739(0x7f1104ab, float:1.927623E38)
            java.lang.String r6 = r0.getString(r6)
            r7 = 1
            r8 = 1
            com.tencent.mm.ui.chatting.viewitems.e2 r9 = new com.tencent.mm.ui.chatting.viewitems.e2
            r9.<init>()
            qo3.i0 r0 = nj3.C76879j.m92723Q(r4, r5, r6, r7, r8, r9)
            di3.d r4 = di3.C86312j.m106911c(r16)
            r17 = r4
            tt.e r17 = (p244tt.C14088e) r17
            android.app.Activity r18 = r26.mo91565f()
            r20 = 0
            com.tencent.mm.ui.chatting.viewitems.f2 r4 = new com.tencent.mm.ui.chatting.viewitems.f2
            r5 = r26
            r4.<init>(r0, r5)
            r19 = r1
            r21 = r3
            r23 = r4
            r17.mo13525ke(r18, r19, r20, r21, r22, r23)
            r9 = 1
        L_0x0290:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74015h2.m87850c(com.tencent.mm.message.l$b, android.view.View, ck3.b, com.tencent.mm.storage.f4):boolean");
    }
}
