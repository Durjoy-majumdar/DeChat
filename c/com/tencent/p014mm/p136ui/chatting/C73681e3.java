package com.tencent.p014mm.p136ui.chatting;

import ck3.C67391b;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.opensdk.modelmsg.WXEmojiObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72837v1;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72989o2;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C75604z3;
import eb0.C97625j3;
import f40.C86709a0;
import i61.C98602h;
import java.io.InputStream;
import nj3.C76912y0;
import p008bq.C67309t0;
import p248ug.C78160t0;
import p763ym.C79140q;
import z51.C39315g;
import zj3.C79387w;

/* renamed from: com.tencent.mm.ui.chatting.e3 */
public class C73681e3 implements C72837v1 {

    /* renamed from: a */
    public C67391b f216332a;

    /* renamed from: b */
    public C72996z1 f216333b;

    /* renamed from: c */
    public String f216334c;

    /* renamed from: d */
    public int f216335d;

    public C73681e3(C67391b bVar, C72996z1 z1Var, String str) {
        this.f216332a = bVar;
        this.f216333b = z1Var;
        this.f216334c = str;
        C72996z1.m85811N4(str);
        C72996z1.m85848s5(this.f216334c);
        C72996z1.m85798E5(this.f216334c);
    }

    /* renamed from: X1 */
    public void mo65586X1(IEmojiInfo iEmojiInfo) {
        if (!C97625j3.m125812b().mo105883I()) {
            C76912y0.m92771j(this.f216332a.mo91565f(), this.f216332a.f193286j.getContentView());
        } else if (iEmojiInfo != null) {
            if (this.f216333b.getUsername().equals("medianote") && (C75592q0.m90787q() & 16384) == 0) {
                iEmojiInfo.mo62681l0(0);
                iEmojiInfo.mo62690r(3);
                ((C67309t0) C86312j.m106911c(C67309t0.class)).mo91192ko(iEmojiInfo);
                C72963f4 f4Var = new C72963f4();
                f4Var.setType(47);
                f4Var.mo108749c3("medianote");
                f4Var.mo108740T2(1);
                if (iEmojiInfo.mo62678k()) {
                    f4Var.mo108732L2(C72989o2.m85759f(C75592q0.m90789s(), 0, false, iEmojiInfo.getMd5(), false, ""));
                }
                f4Var.mo108739S2(iEmojiInfo.getMd5());
                f4Var.mo108733M2(C75604z3.m90843o(f4Var.mo108768t()));
                f4Var.mo100991d(2);
                ((C72972g4) C97625j3.m125812b().mo105911z()).my0(f4Var);
                return;
            }
            ((C79140q) C86312j.m106911c(C79140q.class)).Vf0();
            ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138011S(Util.isNullOrNil(this.f216334c) ? this.f216333b.getUsername() : this.f216334c, (EmojiInfo) iEmojiInfo, (C72963f4) null);
            this.f216332a.mo91541B(true);
        }
    }

    /* renamed from: a */
    public void mo65587a() {
    }

    /* renamed from: b */
    public void mo65588b(boolean z, int i) {
        ChatFooter k1 = ((C79387w) this.f216332a.f193278b.mo102812a(C79387w.class)).mo102193k1();
        if (z) {
            this.f216335d = k1.getCurrentScrollHeight();
            k1.mo100350F0(C78160t0.m94370a(this.f216332a.mo91565f()) + i, true, 0, 0);
            k1.f211932s1 = false;
            k1.setIgnoreScroll(Boolean.TRUE);
            return;
        }
        int i2 = this.f216335d;
        if (i2 > 0) {
            k1.mo100350F0(i2, true, 0, 0);
        } else {
            k1.mo100350F0(C78160t0.m94370a(this.f216332a.mo91565f()) + i, true, 0, 0);
        }
        k1.f211932s1 = true;
        k1.setIgnoreScroll(Boolean.FALSE);
    }

    /* renamed from: c */
    public void mo102724c(IEmojiInfo iEmojiInfo) {
        if (!C97625j3.m125812b().mo105883I()) {
            C76912y0.m92771j(this.f216332a.mo91565f(), this.f216332a.f193286j.getContentView());
        } else if (iEmojiInfo != null) {
            WXMediaMessage wXMediaMessage = new WXMediaMessage();
            StringBuilder sb = new StringBuilder();
            C97625j3.m125812b().getClass();
            StringBuilder sb4 = new StringBuilder();
            C86709a0.m107528h();
            sb4.append(C86709a0.m107535s().f251806d);
            sb4.append("emoji/");
            sb.append(sb4.toString());
            sb.append(iEmojiInfo.getMd5());
            String sb5 = sb.toString();
            if (C86013q1.m106450k(sb5 + "_thumb")) {
                wXMediaMessage.thumbData = C86013q1.m106433O(sb5 + "_thumb", 0, (int) C86013q1.m106451l(sb5 + "_thumb"));
            } else {
                InputStream inputStream = null;
                try {
                    inputStream = C86013q1.m106423E(sb5);
                    wXMediaMessage.setThumbImage(BackwardSupportUtil.BitmapFactory.decodeStream(inputStream, 1.0f));
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.ChattingSmileyPanelImpl", e, "", new Object[0]);
                    Log.m105920e("MicroMsg.ChattingSmileyPanelImpl", "sendAppMsgEmoji Fail cause there is no thumb");
                } catch (Throwable th) {
                    Util.qualityClose(inputStream);
                    throw th;
                }
                Util.qualityClose(inputStream);
            }
            wXMediaMessage.mediaObject = new WXEmojiObject(sb5);
            C72695v.m85049B(wXMediaMessage, iEmojiInfo.getAppid(), (String) null, this.f216334c, 1, iEmojiInfo.getMd5());
        }
    }
}
