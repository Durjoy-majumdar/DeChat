package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68063d;
import com.tencent.p014mm.message.C68064e;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.SemiXml;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86312j;
import eb0.C97625j3;
import i21.C98591h;
import java.util.Map;
import ke3.C88144b;
import kg3.C76577a;
import nj3.C76874e0;
import p1081gi.C98121d;
import p287zz.C79445i;
import zj3.C79368l;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.r0 */
public class C74192r0 extends C74023i {

    /* renamed from: v */
    public C67391b f217786v;

    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6883r5);
        C74172q0 q0Var = new C74172q0();
        q0Var.mo103214a(n4Var, false);
        n4Var.setTag(q0Var);
        return n4Var;
    }

    /* renamed from: R */
    public boolean mo26232R() {
        return false;
    }

    /* renamed from: X */
    public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
        menuItem.getItemId();
        return false;
    }

    /* renamed from: Z */
    public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
        e0Var.mo107136c(((C74243t8) view.getTag()).mo103252b(), 100, 0, this.f217786v.mo91572m().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
        return false;
    }

    /* renamed from: a0 */
    public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
        ((C98591h) C86312j.m106911c(C98591h.class)).Gr0(f4Var.mo108768t());
        String content = f4Var.getContent();
        if (content != null) {
            C68070l.C68072b u = C68070l.C68072b.m80422u(content, f4Var.mo108775z2());
            String str = Util.isNullOrNil(u.f195572f1) ? u.f195586j : u.f195572f1;
            if (!Util.isNullOrNil(u.f195608o1)) {
                Log.m105918d("MicroMsg.ChattingItemAppMsgC2CNewYearFrom", "onItemClick play egg emoj");
                C68063d dVar = (C68063d) u.mo93555w(C68063d.class);
                Intent intent = new Intent();
                intent.putExtra("key_native_url", u.f195608o1);
                intent.putExtra("key_username", bVar.mo91577r());
                intent.putExtra("key_image_id", u.f195620r1);
                intent.putExtra("key_image_aes_key", u.f195624s1);
                intent.putExtra("key_image_length", u.f195628t1);
                intent.putExtra("key_msgid", f4Var.getMsgId());
                intent.putExtra("key_msg_newyear_localreceivestatus", dVar.f195411c);
                EmojiInfo emojiInfo = dVar.f195410b;
                if (emojiInfo != null) {
                    intent.putExtra("key_emoji_md5", emojiInfo.field_md5);
                }
                C68064e eVar = (C68064e) u.mo93555w(C68064e.class);
                if (!Util.isNullOrNil(eVar.f195413c)) {
                    intent.putExtra("key_voice_url", eVar.f195412b);
                    intent.putExtra("key_voice_asekey", eVar.f195413c);
                    intent.putExtra("key_voice_length", eVar.f195414d);
                    intent.putExtra("key_voice_play_time", eVar.f195415e);
                }
                C88144b.m109791i(bVar.mo91565f(), "luckymoney", ".ui.LuckyMoneyNewYearReceiveUIV2", intent, (Bundle) null);
                u.f195612p1 = 1;
                f4Var.mo108732L2(C68070l.C68072b.m80420s(u, (String) null, (C98121d) null));
                if (f4Var.mo101020w3()) {
                    try {
                        String content2 = f4Var.getContent();
                        int indexOf = content2.indexOf("<msg>");
                        if (indexOf > 0 && indexOf < content2.length()) {
                            content2 = content2.substring(indexOf).trim();
                        }
                        Map<String, String> parseXml = XmlParser.parseXml(content2, "msg", (String) null);
                        if (parseXml != null && parseXml.size() > 0) {
                            f4Var.mo108746Z2(SemiXml.encode(parseXml));
                        }
                    } catch (Exception e) {
                        Log.m105920e("MicroMsg.ChattingItemAppMsgC2CNewYearFrom", e.getMessage());
                    }
                }
                ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(f4Var.getMsgId(), f4Var);
            } else if (!Util.isNullOrNil(str)) {
                ((C79445i) C86312j.m106911c(C79445i.class)).mo109196yg(u.f195616q1, Long.valueOf(f4Var.getMsgId()));
                Intent intent2 = new Intent();
                intent2.putExtra("rawUrl", str);
                C88144b.m109791i(bVar.mo91565f(), "webview", ".ui.tools.WebViewUI", intent2, (Bundle) null);
            }
        }
        return true;
    }

    /* renamed from: f */
    public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
        this.f217786v = bVar;
        String content = f4Var.getContent();
        C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
        C74172q0 q0Var = (C74172q0) cVar;
        C68063d dVar = (C68063d) u.mo93555w(C68063d.class);
        if (u.f195478D1 != 1) {
            if (dVar.f195411c == 0) {
                if (C85875k4.m106211z()) {
                    q0Var.f217724e.setBackgroundResource(C0966R.C0969drawable.cfz);
                } else {
                    q0Var.f217724e.setBackgroundResource(C0966R.C0969drawable.cfy);
                }
                q0Var.f217722c.setVisibility(8);
            } else {
                if (C85875k4.m106211z()) {
                    q0Var.f217724e.setBackgroundResource(C0966R.C0969drawable.cfx);
                    q0Var.f217722c.setTextColor(Color.parseColor("#7FFFE2B1"));
                } else {
                    q0Var.f217724e.setBackgroundResource(C0966R.C0969drawable.cfw);
                    q0Var.f217722c.setTextColor(Color.parseColor("#FFE2B1"));
                }
                q0Var.f217722c.setVisibility(0);
                int i = dVar.f195411c;
                if (i == 1) {
                    q0Var.f217722c.setText(MMApplicationContext.getContext().getString(C0966R.string.ghj));
                } else if (i == 2) {
                    q0Var.f217722c.setText(MMApplicationContext.getContext().getString(C0966R.string.ghl));
                }
            }
            q0Var.f217723d.setVisibility(8);
            ViewGroup.LayoutParams layoutParams = q0Var.f217724e.getLayoutParams();
            layoutParams.width = C76577a.m92151b(MMApplicationContext.getContext(), 131);
            q0Var.f217724e.setLayoutParams(layoutParams);
        } else if (dVar.f195411c == 0) {
            q0Var.f217723d.setBackgroundResource(C0966R.C0969drawable.c7n);
            q0Var.f217724e.setBackgroundResource(C0966R.C0969drawable.c7g);
            q0Var.f217722c.setVisibility(8);
        } else {
            q0Var.f217723d.setBackgroundResource(C0966R.C0969drawable.c7o);
            q0Var.f217724e.setBackgroundResource(C0966R.C0969drawable.c7f);
            q0Var.f217722c.setVisibility(0);
            int i2 = dVar.f195411c;
            if (i2 == 1) {
                q0Var.f217722c.setText(MMApplicationContext.getContext().getString(C0966R.string.ghj));
            } else if (i2 == 2) {
                q0Var.f217722c.setText(MMApplicationContext.getContext().getString(C0966R.string.ghl));
            }
        }
        cVar.clickArea.setOnClickListener(mo103099u(bVar));
        cVar.clickArea.setOnLongClickListener(mo103098p(bVar));
        cVar.clickArea.setOnTouchListener(((C79368l) bVar.f193278b.mo102812a(C79368l.class)).mo108189Z4());
        cVar.clickArea.setTag(new C74243t8(f4Var, this.f217786v.mo91583x(), cVar, (String) null));
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        return !z && i == 469762097;
    }
}
