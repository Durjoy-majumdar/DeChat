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
import com.tencent.p014mm.p136ui.chatting.C73774p2;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.pluginsdk.p133ui.emoji.ChattingEmojiView;
import com.tencent.p014mm.pluginsdk.p133ui.emoji.RTChattingEmojiView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72989o2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86312j;
import eb0.C75604z3;
import eb0.C97625j3;
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

/* renamed from: com.tencent.mm.ui.chatting.viewitems.g1 */
public class C73990g1 extends C74023i implements C73774p2 {

    /* renamed from: v */
    public C67391b f217114v;

    /* renamed from: w */
    public C73949d1 f217115w;

    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6935sn);
        C73975e1 e1Var = new C73975e1();
        e1Var.mo103040a(n4Var, false);
        n4Var.setTag(e1Var);
        return n4Var;
    }

    /* renamed from: R */
    public boolean mo26232R() {
        return true;
    }

    /* renamed from: X */
    public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
        return ((C79381s) bVar.f193278b.mo102812a(C79381s.class)).mo102174F0(menuItem, bVar, f4Var);
    }

    /* renamed from: Z */
    public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
        C72963f4 f4Var2 = f4Var;
        Class cls = C39315g.class;
        if (C97625j3.m125812b().mo105883I()) {
            int b = ((C74243t8) view.getTag()).mo103252b();
            C72989o2 o2Var = new C72989o2(f4Var.getContent());
            C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var.getContent(), f4Var.mo108775z2());
            if (u == null) {
                u = new C68070l.C68072b();
                u.f195610p = o2Var.f212821d;
            }
            if (!C77702q0.m93719b(u.f195610p) && !u.f195610p.equals("-1")) {
                EmojiInfo G = ((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo137999G(u.f195610p);
                if (G != null) {
                    int i = G.field_catalog;
                    IAutoDBItem.MAutoDBInfo mAutoDBInfo = EmojiInfo.f284123W1;
                    if (i != 81 && !G.mo62637I0()) {
                        e0Var.mo107136c(b, 104, 0, view.getContext().getString(C0966R.string.b_e), C0966R.raw.icons_filled_addsticker);
                    }
                    boolean e = ((C10432i) C86312j.m106911c(C10432i.class)).mo10750e();
                    String r = this.f217114v.mo91577r();
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
                        Log.m105924i("MicroMsg.ChattingItemAppMsgEmojiTo", "menu add similar emoji item.");
                        e0Var.mo107136c(b, 115, 0, view.getContext().getString(C0966R.string.b_h), C0966R.raw.icons_filled_othersticker);
                    }
                    C115669n.INSTANCE.mo160131h(12789, 0, G.getMd5(), 0, G.field_designerID, G.field_groupId, "", "", "", "", G.field_activityid);
                    if (G.mo62633C1()) {
                        e0Var.mo107136c(b, 113, 0, view.getContext().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
                    } else {
                        Log.m105924i("MicroMsg.ChattingItemAppMsgEmojiTo", "emoji file no exist. cannot save or resend.");
                    }
                    if (((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo137994B(G)) {
                        e0Var.mo107136c(b, 135, 0, view.getContext().getString(C0966R.string.b_4), C0966R.raw.icons_filled_makesticker);
                    }
                } else {
                    Log.m105925i("MicroMsg.ChattingItemAppMsgEmojiTo", "emoji is null. app content md5 is :%s", u.f195610p);
                }
            }
            if (f4Var.getStatus() == 5) {
                e0Var.mo107136c(b, 103, 0, view.getContext().getString(C0966R.string.f360269bb2), C0966R.raw.icons_filled_refresh);
            }
            if (!f4Var.mo100967F3() && f4Var.mo101022y3() && ((f4Var.getStatus() == 2 || f4Var2.f230728K == 1) && mo103083Q(f4Var2, this.f217114v) && mo103081O(f4Var.mo108768t()))) {
                e0Var.mo107136c(b, 123, 0, view.getContext().getString(C0966R.string.b_d), C0966R.raw.icons_filled_previous);
            }
            if (!this.f217114v.mo91584y()) {
                e0Var.mo107136c(b, 100, 0, view.getContext().getString(C0966R.string.b9z), C0966R.raw.icons_filled_delete);
            }
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
        return false;
    }

    /* renamed from: f */
    public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
        EmojiInfo emojiInfo;
        C68070l.C68072b bVar2;
        int i;
        C67391b bVar3 = bVar;
        C72963f4 f4Var2 = f4Var;
        Class cls = C79368l.class;
        Class cls2 = C39315g.class;
        this.f217114v = bVar3;
        ((C79371n) bVar3.f193278b.mo102812a(C79371n.class)).mo102406W4(f4Var2);
        C73975e1 e1Var = (C73975e1) cVar;
        if (f4Var2 != null) {
            String content = f4Var.getContent();
            C72989o2 o2Var = new C72989o2(f4Var.getContent());
            if (!o2Var.f212820c) {
                bVar2 = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
                emojiInfo = bVar2 != null ? ((C98602h) ((C39315g) C86312j.m106911c(cls2)).mo58035cm()).mo137999G(bVar2.f195610p) : null;
            } else {
                bVar2 = null;
                emojiInfo = null;
            }
            String str2 = o2Var.f212821d;
            if (str2 != null && !str2.equals("-1") && emojiInfo == null) {
                emojiInfo = ((C98602h) ((C39315g) C86312j.m106911c(cls2)).mo58035cm()).mo137999G(o2Var.f212821d);
            }
            if (emojiInfo == null || !emojiInfo.mo62633C1()) {
                i = 0;
                String v102 = ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).v10(f4Var.mo108765s2(), true);
                Bitmap e = C20828a.m22825b().mo32516e(v102);
                if (e == null || e.isRecycled()) {
                    e = BitmapUtil.decodeFile(v102, (BitmapFactory.Options) null);
                    C20828a.m22825b().mo32526o(v102, e);
                }
                mo103093i0(e1Var, false, true);
                e1Var.f217095e.setVisibility(0);
                e1Var.f217094d.setVisibility(8);
                e1Var.f217096f.setText(C77702q0.m93718a(bVar2 == null ? 0 : (long) bVar2.f195594l));
                e1Var.f217096f.setVisibility(0);
                e1Var.f217095e.setImageResource(C0966R.C0969drawable.emoji_download_btn);
                if (e == null || e.isRecycled()) {
                    e = BitmapUtil.transformDrawableToBitmap(this.f217114v.mo91572m().getDrawable(C0966R.C0969drawable.bdn));
                }
                e1Var.f217092b.setImageBitmap(e);
                if (bVar2 != null && !Util.isNullOrNil(bVar2.f195610p)) {
                    ((HashMap) C73975e1.f217091g).put(bVar2.f195610p, new WeakReference(e1Var));
                }
            } else {
                emojiInfo.f284125Q1 = f4Var.mo108768t();
                RTChattingEmojiView rTChattingEmojiView = e1Var.f217092b;
                long msgId = f4Var.getMsgId();
                boolean z = emojiInfo.mo62678k() && C67301m.m79638c(f4Var.getMsgId());
                rTChattingEmojiView.getClass();
                rTChattingEmojiView.mo135109b(emojiInfo, msgId, z, new C72989o2(""));
                ChattingEmojiView chattingEmojiView = e1Var.f217092b.f283658j;
                if (chattingEmojiView != null) {
                    chattingEmojiView.resume();
                }
                mo103093i0(e1Var, !(f4Var.getStatus() != 1), true);
                EmojiFileCheckerEvent emojiFileCheckerEvent = new EmojiFileCheckerEvent();
                emojiFileCheckerEvent.f107418d.f107419a = emojiInfo;
                emojiInfo.f284125Q1 = f4Var.mo108768t();
                emojiFileCheckerEvent.f107418d.getClass();
                emojiFileCheckerEvent.publish();
                i = 0;
            }
            if (C74023i.m87878T()) {
                if (f4Var.getStatus() != 2 || !mo103080N((C79368l) bVar3.f193278b.mo102812a(cls), f4Var.getMsgId())) {
                    ImageView imageView = e1Var.f217093c;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                } else {
                    ImageView imageView2 = e1Var.f217093c;
                    if (imageView2 != null) {
                        imageView2.setVisibility(i);
                    }
                }
            }
            e1Var.f217092b.setTag(new C74243t8(f4Var2, bVar.mo91583x(), e1Var, bVar.mo91573n()));
            RTChattingEmojiView rTChattingEmojiView2 = e1Var.f217092b;
            if (this.f217115w == null) {
                this.f217115w = new C73949d1(bVar3);
            }
            rTChattingEmojiView2.setOnClickListener(this.f217115w);
            e1Var.f217092b.setOnLongClickListener(mo103098p(bVar3));
            e1Var.f217092b.setOnTouchListener(((C79368l) bVar3.f193278b.mo102812a(cls)).mo108189Z4());
            mo103087e0(e1Var, f4Var, bVar.mo91573n(), bVar.mo91583x(), bVar, this);
        }
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        return z && i == 1048625;
    }
}
