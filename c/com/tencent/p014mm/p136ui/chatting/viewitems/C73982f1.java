package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import bp3.C67301m;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.EmojiFileCheckerEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.RelatedEmoticonActionStruct;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.emoji.RTChattingEmojiView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72989o2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86312j;
import eb0.C75569c4;
import gc0.C20828a;
import gy3.C87412m;
import h81.C32735h;
import i61.C98602h;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import ky2.C10432i;
import nj3.C76874e0;
import p158gt.C98201k;
import sf0.C77702q0;
import z51.C39315g;
import zg3.C79330c;
import zj3.C79368l;
import zj3.C79371n;
import zj3.C79381s;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.f1 */
public class C73982f1 extends C74023i {

    /* renamed from: v */
    public C67391b f217107v;

    /* renamed from: w */
    public C73949d1 f217108w;

    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6885r7);
        C73975e1 e1Var = new C73975e1();
        e1Var.mo103040a(n4Var, true);
        n4Var.setTag(e1Var);
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
        EmojiInfo G;
        Class cls = C39315g.class;
        int b = ((C74243t8) view.getTag()).mo103252b();
        C72989o2 o2Var = new C72989o2(f4Var.getContent());
        C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var.getContent(), f4Var.mo108775z2());
        if (u == null) {
            u = new C68070l.C68072b();
            u.f195610p = o2Var.f212821d;
        }
        if (!C77702q0.m93719b(u.f195610p) && !u.f195610p.equals("-1") && (G = ((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo137999G(u.f195610p)) != null) {
            int i = G.field_catalog;
            IAutoDBItem.MAutoDBInfo mAutoDBInfo = EmojiInfo.f284123W1;
            if (i != 81 && !G.mo62637I0()) {
                e0Var.mo107136c(b, 104, 0, view.getContext().getString(C0966R.string.b_e), C0966R.raw.icons_filled_addsticker);
            }
            boolean e = ((C10432i) C86312j.m106911c(C10432i.class)).mo10750e();
            String r = this.f217107v.mo91577r();
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
            C115669n.INSTANCE.mo175912v(1257, 1);
            boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_enable_similar_emoji, true);
            if (!e && (view.getContext() instanceof Activity) && view.getContext().getResources().getConfiguration().orientation == 1 && wf) {
                Log.m105924i("MicroMsg.ChattingItemAppMsgEmojiFrom", "menu add similar emoji item.");
                e0Var.mo107136c(b, 115, 0, view.getContext().getString(C0966R.string.b_h), C0966R.raw.icons_filled_othersticker);
            }
            C115669n.INSTANCE.mo160131h(12789, 0, G.getMd5(), 0, G.field_designerID, G.field_groupId, "", "", "", "", G.field_activityid);
            if (!G.mo62633C1() || C75569c4.m90687t(f4Var)) {
                Log.m105924i("MicroMsg.ChattingItemAppMsgEmojiFrom", "emoji file no exist. cannot save or resend.");
            } else {
                e0Var.mo107136c(b, 113, 0, view.getContext().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
            }
            if (((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo137994B(G)) {
                e0Var.mo107136c(b, 135, 0, view.getContext().getString(C0966R.string.b_4), C0966R.raw.icons_filled_makesticker);
            }
        }
        if (C75569c4.m90690w(f4Var)) {
            e0Var.clear();
        }
        if (!this.f217107v.mo91584y()) {
            e0Var.mo107136c(b, 100, 0, view.getContext().getString(C0966R.string.b9z), C0966R.raw.icons_filled_delete);
        }
        return true;
    }

    /* renamed from: a0 */
    public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
        return false;
    }

    /* renamed from: f */
    public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
        this.f217107v = bVar;
        ((C79371n) bVar.f193278b.mo102812a(C79371n.class)).mo102406W4(f4Var);
        C73975e1 e1Var = (C73975e1) cVar;
        String content = f4Var.getContent();
        C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
        EmojiInfo G = (u == null || u.f195610p == null) ? null : ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo137999G(u.f195610p);
        if (G == null || !G.mo62633C1()) {
            String v102 = ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).v10(f4Var.mo108765s2(), true);
            Bitmap e = C20828a.m22825b().mo32516e(v102);
            if (e == null || e.isRecycled()) {
                e = BitmapUtil.decodeFile(v102, (BitmapFactory.Options) null);
                C20828a.m22825b().mo32526o(v102, e);
            }
            e1Var.f217095e.setVisibility(0);
            e1Var.f217094d.setVisibility(8);
            e1Var.f217096f.setText(C77702q0.m93718a(u == null ? 0 : (long) u.f195594l));
            e1Var.f217096f.setVisibility(0);
            e1Var.f217095e.setImageResource(C0966R.C0969drawable.emoji_download_btn);
            if (u != null && !Util.isNullOrNil(u.f195610p)) {
                ((HashMap) C73975e1.f217091g).put(u.f195610p, new WeakReference(e1Var));
            }
            if (e == null || e.isRecycled()) {
                e = BitmapUtil.transformDrawableToBitmap(this.f217107v.mo91572m().getDrawable(C0966R.C0969drawable.bdn));
            }
            e1Var.f217092b.setImageBitmap(e);
        } else {
            G.f284125Q1 = f4Var.mo108768t();
            RTChattingEmojiView rTChattingEmojiView = e1Var.f217092b;
            long msgId = f4Var.getMsgId();
            boolean z = G.mo62678k() && C67301m.m79638c(f4Var.getMsgId());
            rTChattingEmojiView.getClass();
            rTChattingEmojiView.mo135109b(G, msgId, z, new C72989o2(""));
            e1Var.f217095e.setVisibility(8);
            e1Var.f217094d.setVisibility(8);
            e1Var.f217096f.setVisibility(8);
            e1Var.f217095e.setVisibility(8);
            if (u != null && !Util.isNullOrNil(u.f195610p)) {
                ((HashMap) C73975e1.f217091g).remove(u.f195610p);
            }
            EmojiFileCheckerEvent emojiFileCheckerEvent = new EmojiFileCheckerEvent();
            emojiFileCheckerEvent.f107418d.f107419a = G;
            G.f284125Q1 = f4Var.mo108768t();
            emojiFileCheckerEvent.f107418d.getClass();
            emojiFileCheckerEvent.publish();
        }
        e1Var.f217092b.setTag(new C74243t8(f4Var, bVar.mo91583x(), e1Var, str));
        RTChattingEmojiView rTChattingEmojiView2 = e1Var.f217092b;
        if (this.f217108w == null) {
            this.f217108w = new C73949d1(bVar);
        }
        rTChattingEmojiView2.setOnClickListener(this.f217108w);
        e1Var.f217092b.setOnLongClickListener(mo103098p(bVar));
        e1Var.f217092b.setOnTouchListener(((C79368l) bVar.f193278b.mo102812a(C79368l.class)).mo108189Z4());
        ImageView imageView = e1Var.f217095e;
        if (this.f217108w == null) {
            this.f217108w = new C73949d1(bVar);
        }
        imageView.setOnClickListener(this.f217108w);
        e1Var.f217095e.setOnLongClickListener(mo103098p(bVar));
        e1Var.f217095e.setTag(e1Var.f217092b.getTag());
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        return !z && i == 1048625;
    }

    /* renamed from: n0 */
    public boolean mo103045n0(C67391b bVar) {
        return bVar.mo91583x();
    }
}
