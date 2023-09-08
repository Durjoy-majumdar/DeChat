package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.app.Activity;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import bp3.C67301m;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.RelatedEmoticonActionStruct;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.emoji.RTChattingEmojiView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72989o2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86312j;
import eb0.C97625j3;
import gy3.C87412m;
import h81.C32735h;
import i61.C98602h;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import ky2.C10432i;
import nj3.C76874e0;
import u61.C101964h;
import z51.C39315g;
import zg3.C79330c;
import zj3.C79368l;
import zj3.C79381s;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.y5 */
public class C74315y5 extends C74023i {

    /* renamed from: v */
    public C67391b f218308v;

    /* renamed from: w */
    public C73935b6 f218309w;

    /* renamed from: x */
    public C73926a6 f218310x;

    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6907rw);
        C73946c6 c6Var = new C73946c6();
        c6Var.mo103019a(n4Var, true);
        n4Var.setTag(c6Var);
        return n4Var;
    }

    /* renamed from: R */
    public boolean mo26232R() {
        return false;
    }

    /* renamed from: X */
    public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
        return ((C79381s) bVar.f193278b.mo102812a(C79381s.class)).mo102174F0(menuItem, bVar, f4Var);
    }

    /* renamed from: Z */
    public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
        String str;
        Class cls = C39315g.class;
        if (f4Var.mo100973L3() && C97625j3.m125812b().mo105883I()) {
            int b = ((C74243t8) view.getTag()).mo103252b();
            EmojiInfo G = ((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo137999G(f4Var.mo108765s2());
            if (G == null) {
                Log.m105929w("MicroMsg.emoji.ChattingItemEmojiFrom", "emoji is null. md5:%s", f4Var.mo108765s2());
                return true;
            }
            boolean e = ((C10432i) C86312j.m106911c(C10432i.class)).mo10750e();
            boolean C1 = G.mo62633C1();
            int i = G.field_catalog;
            IAutoDBItem.MAutoDBInfo mAutoDBInfo = EmojiInfo.f284123W1;
            if (i == 81 || G.mo62637I0() || G.field_groupId.equalsIgnoreCase("com.tencent.xin.emoticon.tuzki2")) {
                str = "com.tencent.xin.emoticon.tuzki2";
            } else if (C1) {
                str = "com.tencent.xin.emoticon.tuzki2";
                e0Var.mo107136c(b, 104, 0, view.getContext().getString(C0966R.string.b_e), C0966R.raw.icons_filled_addsticker);
            } else {
                str = "com.tencent.xin.emoticon.tuzki2";
                Log.m105924i("MicroMsg.emoji.ChattingItemEmojiFrom", "file do no exist. cant do add or resend.");
            }
            if (!G.mo62637I0()) {
                if (C1) {
                    e0Var.mo107136c(b, 113, 0, view.getContext().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
                } else {
                    Log.m105924i("MicroMsg.emoji.ChattingItemEmojiFrom", "file do no exist. cant do add or resend.");
                }
            }
            String r = this.f218308v.mo91577r();
            C87412m.m108594g(r, "chatId");
            C79330c.f232896a = System.currentTimeMillis();
            C79330c.f232897b = G;
            C79330c.f232898c = r;
            RelatedEmoticonActionStruct relatedEmoticonActionStruct = new RelatedEmoticonActionStruct();
            relatedEmoticonActionStruct.f265792d = C79330c.f232896a;
            relatedEmoticonActionStruct.f265793e = 1;
            relatedEmoticonActionStruct.mo126627u(G.field_groupId);
            relatedEmoticonActionStruct.mo126626t(G.getMd5());
            relatedEmoticonActionStruct.mo126625s(r);
            relatedEmoticonActionStruct.mo86054n();
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo175912v(1257, 1);
            boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_enable_similar_emoji, true);
            if (!e && !G.mo62678k() && (view.getContext() instanceof Activity) && view.getContext().getResources().getConfiguration().orientation == 1 && wf) {
                Log.m105924i("MicroMsg.emoji.ChattingItemEmojiFrom", "menu add similar emoji item.");
                e0Var.mo107136c(b, 115, 0, view.getContext().getString(C0966R.string.b_h), C0966R.raw.icons_filled_othersticker);
            }
            if (((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo137994B(G)) {
                e0Var.mo107136c(b, 135, 0, view.getContext().getString(C0966R.string.b_4), C0966R.raw.icons_filled_makesticker);
            }
            if (!e) {
                String str2 = G.field_groupId;
                if ((!Util.isNullOrNil(str2) && !Util.isEqual(str2, "capture")) && !G.mo62678k() && !G.field_groupId.equalsIgnoreCase(str)) {
                    e0Var.mo107136c(b, 128, 0, view.getContext().getString(C0966R.string.b_g), C0966R.raw.icons_filled_sticker_album);
                }
            }
            if (!this.f218308v.mo91584y()) {
                e0Var.mo107136c(b, 100, 0, view.getContext().getString(C0966R.string.b9z), C0966R.raw.icons_filled_delete);
            }
            nVar.mo160131h(12789, 0, G.getMd5(), 0, G.field_designerID, G.field_groupId, "", "", "", "", G.field_activityid);
        }
        return true;
    }

    /* renamed from: a0 */
    public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
        return false;
    }

    /* renamed from: f */
    public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
        C67391b bVar2;
        C67391b bVar3 = bVar;
        C72963f4 f4Var2 = f4Var;
        String str2 = str;
        Class cls = C39315g.class;
        if (f4Var2 == null) {
            Log.m105921e("MicroMsg.emoji.ChattingItemEmojiFrom", "msg is null for: %s", str2);
            return;
        }
        this.f218308v = bVar3;
        EmojiInfo G = ((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo137999G(f4Var.mo108765s2());
        C73946c6 c6Var = (C73946c6) cVar;
        if (G == null) {
            Object[] objArr = new Object[3];
            objArr[0] = f4Var.mo108765s2();
            objArr[1] = Boolean.valueOf(G == null);
            objArr[2] = Long.valueOf(f4Var.getMsgId());
            Log.m105925i("MicroMsg.emoji.ChattingItemEmojiFrom", "filling: db emoji %s, %s, msgId %s", objArr);
        }
        if (G != null) {
            G.f284125Q1 = f4Var.mo108768t();
            C72989o2 o2Var = new C72989o2(f4Var.getContent());
            C72989o2 o2Var2 = o2Var;
            c6Var.f217033b.mo135109b(G, f4Var.getMsgId(), G.mo62678k() && C67301m.m79638c(f4Var.getMsgId()), o2Var);
            if (G.mo62678k()) {
                C72989o2 o2Var3 = o2Var2;
                if (!o2Var3.f212820c) {
                    C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(f4Var.getMsgId());
                    o2Var3.f212820c = true;
                    f4Var2.mo108732L2(o2Var3.mo101198e());
                    if (b002.getType() != 10000) {
                        ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(f4Var.getMsgId(), f4Var2);
                    } else {
                        Log.m105924i("MicroMsg.emoji.ChattingItemEmojiFrom", "filling: emoji revoked!");
                    }
                }
            }
            if (C101964h.m134233o(G)) {
                View view = c6Var.f217036e;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemEmoji$ChattingItemEmojiFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemEmoji$ChattingItemEmojiFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view3 = c6Var.f217036e;
                if (this.f218310x == null) {
                    this.f218310x = new C73926a6(this.f218308v);
                }
                view3.setOnClickListener(this.f218310x);
            } else {
                View view4 = c6Var.f217036e;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view5 = view4;
                C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemEmoji$ChattingItemEmojiFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/ui/chatting/viewitems/ChattingItemEmoji$ChattingItemEmojiFrom", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        String str3 = "";
        if (G == null || !G.mo62678k()) {
            if (G != null) {
                str3 = Util.nullAs(((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo138012T(G.getMd5()), str3);
            }
        } else if (G.field_name.startsWith("jsb_j")) {
            str3 = this.f218308v.mo91565f().getString(C0966R.string.c6j);
        } else if (G.field_name.startsWith("jsb_s")) {
            str3 = this.f218308v.mo91565f().getString(C0966R.string.c6k);
        } else if (G.field_name.startsWith("jsb_b")) {
            str3 = this.f218308v.mo91565f().getString(C0966R.string.c6i);
        } else if (G.field_name.startsWith("dice")) {
            str3 = G.field_name.replace("dice_", str3).replace(".png", str3);
        }
        RTChattingEmojiView rTChattingEmojiView = c6Var.f217033b;
        rTChattingEmojiView.setContentDescription(this.f218308v.mo91565f().getString(C0966R.string.c_3) + str3);
        c6Var.f217033b.setTag(new C74243t8(f4Var2, bVar.mo91583x(), c6Var, str2));
        RTChattingEmojiView rTChattingEmojiView2 = c6Var.f217033b;
        if (this.f218309w == null) {
            bVar2 = bVar;
            this.f218309w = new C73935b6(bVar2);
        } else {
            bVar2 = bVar;
        }
        rTChattingEmojiView2.setOnClickListener(this.f218309w);
        c6Var.f217033b.setOnLongClickListener(mo103098p(bVar2));
        c6Var.f217033b.setOnTouchListener(((C79368l) bVar2.f193278b.mo102812a(C79368l.class)).mo108189Z4());
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        return !z && i == 47;
    }

    /* renamed from: n0 */
    public boolean mo103045n0(C67391b bVar) {
        return bVar.mo91583x();
    }
}
