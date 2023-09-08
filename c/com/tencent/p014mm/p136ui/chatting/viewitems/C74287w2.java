package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.text.TextUtils;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.plugin.msgquote.model.MsgQuoteItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C75569c4;
import eb0.C75592q0;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import hk3.C76227e;
import kg3.C76577a;
import nj3.C76912y0;
import w72.C22877b;
import zj3.C79368l;
import zj3.C79374o0;
import zj3.C79387w;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.w2 */
public class C74287w2 {

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.w2$a */
    public class C74288a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C67391b f218183d;

        /* renamed from: e */
        public final /* synthetic */ C72963f4 f218184e;

        /* renamed from: f */
        public final /* synthetic */ C72963f4 f218185f;

        /* renamed from: g */
        public final /* synthetic */ int f218186g;

        public C74288a(C67391b bVar, C72963f4 f4Var, C72963f4 f4Var2, int i) {
            this.f218183d = bVar;
            this.f218184e = f4Var;
            this.f218185f = f4Var2;
            this.f218186g = i;
        }

        public void run() {
            ((C79374o0) this.f218183d.f193278b.mo102812a(C79374o0.class)).mo102669h3(this.f218184e, this.f218185f, this.f218186g);
        }
    }

    /* renamed from: a */
    public static C72963f4 m88621a(C72963f4 f4Var, MsgQuoteItem msgQuoteItem) {
        if (f4Var == null) {
            Log.m105920e("MicroMsg.msgquote.QuoteMsgSourceClickLogic", "getFixQuoteMsgInfo,quotedMsg is null!");
            return null;
        }
        if (f4Var.getMsgId() == 0) {
            f4Var = new C72963f4();
            f4Var.setType(msgQuoteItem.f201543d);
            f4Var.mo108745Y2(msgQuoteItem.f201544e);
            f4Var.mo108749c3(msgQuoteItem.f201545f);
            f4Var.mo101012p4(msgQuoteItem.f201548i);
            f4Var.mo108732L2(msgQuoteItem.f201549j);
            if (Util.isEqual(msgQuoteItem.f201546g, C75592q0.m90789s())) {
                f4Var.mo108740T2(1);
            }
            if (msgQuoteItem.f201551o == 1) {
                f4Var.f212669H1 = 1;
            }
        }
        return f4Var;
    }

    /* renamed from: b */
    public static C72963f4 m88622b(C67391b bVar, long j, MsgQuoteItem msgQuoteItem, String str) {
        int indexOf;
        Class cls = C75700k0.class;
        if (msgQuoteItem == null) {
            Log.m105920e("MicroMsg.msgquote.QuoteMsgSourceClickLogic", "msgQuoteItem is null!");
            return null;
        }
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(j);
        Log.m105925i("MicroMsg.msgquote.QuoteMsgSourceClickLogic", "%s msgId:%s msgSvrId:%s MsgQuoteItem(type:%s svrid:%s content:%s)", str, Long.valueOf(j), Long.valueOf(b002.mo108774y2()), Integer.valueOf(msgQuoteItem.f201543d), Long.valueOf(msgQuoteItem.f201544e), Util.secPrint(msgQuoteItem.f201549j));
        if (Util.isNullOrNil(msgQuoteItem.f201545f)) {
            Log.m105920e("MicroMsg.msgquote.QuoteMsgSourceClickLogic", "msgQuoteItem.fromusr is null!(1)");
            String content = b002.getContent();
            if (bVar.mo91583x() && (indexOf = b002.getContent().indexOf(58)) != -1) {
                content = b002.getContent().substring(indexOf + 1);
            }
            msgQuoteItem = (content != null ? C68070l.C68072b.m80422u(content, b002.mo108775z2()) : null).f195641w2;
        }
        if (Util.isNullOrNil(msgQuoteItem.f201545f)) {
            Log.m105920e("MicroMsg.msgquote.QuoteMsgSourceClickLogic", "msgQuoteItem.fromusr is null!(2)");
            return null;
        }
        C72963f4 h302 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).h30(msgQuoteItem.f201545f, msgQuoteItem.f201544e);
        String r = bVar.mo91577r();
        if (TextUtils.isEmpty(r) || h302.getMsgId() != 0 || TextUtils.isEmpty(msgQuoteItem.f201548i)) {
            return h302;
        }
        long p = C75569c4.m90683p(msgQuoteItem.f201548i);
        if (p == -1 || p == 0) {
            return h302;
        }
        C72963f4 h303 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).h30(r, p);
        return h303.getMsgId() != 0 ? h303 : h302;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0379, code lost:
        r10 = r8;
        r9 = 1;
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x038b, code lost:
        r9 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x03b5, code lost:
        r10 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x06f8, code lost:
        r1 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0765, code lost:
        r0 = r1.f201543d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0769, code lost:
        if (r0 == 49) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x076e, code lost:
        if (r0 == 805306417) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0773, code lost:
        if (r0 == 822083633) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0778, code lost:
        if (r0 == 1090519089) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0149, code lost:
        r1 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x077a, code lost:
        w72.C22877b.m26854a(1, r1.f201544e, (long) r0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0205, code lost:
        r9 = r31;
        r10 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0335, code lost:
        if (com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74260f.m88531t0(r8, r13, r14, r12) == false) goto L_0x0379;
     */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0606  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0609  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0610  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m88623c(ck3.C67391b r26, com.tencent.p014mm.p136ui.chatting.viewitems.C74023i r27, android.view.View r28, long r29, com.tencent.p014mm.plugin.msgquote.model.MsgQuoteItem r31, boolean r32) {
        /*
            r13 = r26
            r14 = r27
            r15 = r28
            r0 = r29
            r12 = r31
            java.lang.Class<ht1.t1> r2 = ht1.C60200t1.class
            java.lang.Class<com.tencent.mm.ui.chatting.TextPreviewUI> r3 = com.tencent.p014mm.p136ui.chatting.TextPreviewUI.class
            r4 = 2
            r5 = 0
            r11 = 1
            if (r12 == 0) goto L_0x00cc
            int r6 = r12.f201551o
            if (r6 != r11) goto L_0x00cc
            java.lang.String r6 = r12.f201549j
            com.tencent.mm.message.l$b r6 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r6, r5)
            if (r6 == 0) goto L_0x00cc
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            long r1 = java.lang.System.currentTimeMillis()
            r7 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r7
            int r2 = (int) r1
            java.lang.Class<ex0.d> r1 = ex0.C45696d.class
            k40.a r1 = f40.C86709a0.m107533q(r1)
            ex0.d r1 = (ex0.C45696d) r1
            java.lang.String r3 = r6.f195586j
            r7 = 233(0xe9, float:3.27E-43)
            java.lang.String r1 = r1.mo70959F2(r3, r7, r7, r2)
            java.lang.String r2 = "rawUrl"
            r0.putExtra(r2, r1)
            java.lang.String r2 = r6.f195570f
            java.lang.String r3 = "webpageTitle"
            r0.putExtra(r3, r2)
            java.lang.String r2 = r13.f193285i
            java.lang.String r3 = "msgUsername"
            r0.putExtra(r3, r2)
            long r7 = r12.f201544e
            java.lang.String r2 = java.lang.String.valueOf(r7)
            java.lang.String r7 = "serverMsgID"
            r0.putExtra(r7, r2)
            int r2 = r12.f201543d
            java.lang.String r7 = "KMsgType"
            r0.putExtra(r7, r2)
            int r2 = r6.f195582i
            java.lang.String r7 = "KAppMsgType"
            r0.putExtra(r7, r2)
            java.lang.String r2 = r6.f195634v
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0081
            java.lang.String r2 = r6.f195634v
            java.lang.String r7 = "srcUsername"
            r0.putExtra(r7, r2)
            java.lang.String r2 = r6.f195638w
            java.lang.String r7 = "srcDisplayname"
            r0.putExtra(r7, r2)
        L_0x0081:
            java.lang.String r2 = "from_scence"
            r0.putExtra(r2, r4)
            java.lang.String r2 = "share_report_pre_msg_url"
            r0.putExtra(r2, r1)
            java.lang.String r1 = r6.f195570f
            java.lang.String r2 = "share_report_pre_msg_title"
            r0.putExtra(r2, r1)
            java.lang.String r1 = r6.f195574g
            java.lang.String r2 = "share_report_pre_msg_desc"
            r0.putExtra(r2, r1)
            java.lang.String r1 = r6.f195646y
            java.lang.String r2 = "share_report_pre_msg_icon_url"
            r0.putExtra(r2, r1)
            java.lang.String r1 = com.tencent.p014mm.p136ui.C74928u.C45093i.f122318j
            int r2 = r6.f195545Y
            r0.putExtra(r1, r2)
            java.lang.String r1 = "key_enable_teen_mode_check"
            r0.putExtra(r1, r11)
            java.lang.String r1 = r13.f193285i
            r0.putExtra(r3, r1)
            java.lang.String r1 = r26.mo91577r()
            int r1 = kb0.C76528a.m92004a(r1)
            java.lang.String r2 = "pay_chat_type"
            r0.putExtra(r2, r1)
            android.app.Activity r1 = r26.mo91565f()
            java.lang.String r2 = "webview"
            java.lang.String r3 = ".ui.tools.WebViewUI"
            ke3.C88144b.m109791i(r1, r2, r3, r0, r5)
            goto L_0x0784
        L_0x00cc:
            java.lang.String r6 = "handleQuoteMsgClick"
            com.tencent.mm.storage.f4 r6 = m88622b(r13, r0, r12, r6)
            java.lang.Class<f62.k0> r7 = f62.C75700k0.class
            k40.a r7 = f40.C86709a0.m107533q(r7)
            f62.k0 r7 = (f62.C75700k0) r7
            g62.l r7 = r7.mo96095LE()
            com.tencent.mm.storage.g4 r7 = (com.tencent.p014mm.storage.C72972g4) r7
            com.tencent.mm.storage.f4 r0 = r7.b00(r0)
            java.lang.String r1 = "MicroMsg.msgquote.QuoteMsgSourceClickLogic"
            if (r6 != 0) goto L_0x00ef
            java.lang.String r0 = "handleItemClickEvent,quotedMsg is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            goto L_0x0784
        L_0x00ef:
            long r7 = r6.getMsgId()
            r9 = 0
            r11 = 0
            int r17 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r17 != 0) goto L_0x0136
            android.content.Context r0 = r28.getContext()
            r2 = 2131823621(0x7f110c05, float:1.9280047E38)
            android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r0, (int) r2, (int) r11)
            r0.show()
            int r0 = r12.f201543d
            switch(r0) {
                case 49: goto L_0x0119;
                case 1048625: goto L_0x0119;
                case 419430449: goto L_0x0119;
                case 436207665: goto L_0x0119;
                case 754974769: goto L_0x0119;
                case 771751985: goto L_0x0119;
                case 805306417: goto L_0x0119;
                case 822083633: goto L_0x0119;
                case 855638065: goto L_0x0119;
                case 939524145: goto L_0x0119;
                case 973078577: goto L_0x0119;
                case 974127153: goto L_0x0119;
                case 975175729: goto L_0x0119;
                case 976224305: goto L_0x0119;
                case 1040187441: goto L_0x0119;
                case 1090519089: goto L_0x0119;
                default: goto L_0x010d;
            }
        L_0x010d:
            r2 = 5
            long r4 = r12.f201544e
            long r6 = (long) r0
            r8 = 0
            w72.C22877b.m26854a(r2, r4, r6, r8)
            goto L_0x0784
        L_0x0119:
            java.lang.String r0 = r12.f201549j
            com.tencent.mm.message.l$b r0 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r0, r5)
            if (r0 == 0) goto L_0x012f
            r2 = 5
            long r4 = r12.f201544e
            r6 = 49
            int r0 = r0.f195582i
            long r8 = (long) r0
            w72.C22877b.m26854a(r2, r4, r6, r8)
            goto L_0x0784
        L_0x012f:
            java.lang.String r0 = "appMsgContent is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)
            goto L_0x0784
        L_0x0136:
            com.tencent.mm.storage.f4 r8 = m88621a(r6, r12)
            int r6 = r12.f201543d
            java.lang.String r7 = "Chat_Msg_Id"
            java.lang.String r9 = "is_group_chat"
            java.lang.String r10 = "key_chat_text"
            java.lang.String r11 = "key_msg_type"
            java.lang.String r4 = ""
            switch(r6) {
                case 1: goto L_0x06fa;
                case 3: goto L_0x06e5;
                case 11: goto L_0x06fa;
                case 13: goto L_0x06e5;
                case 21: goto L_0x06fa;
                case 23: goto L_0x06e5;
                case 31: goto L_0x06fa;
                case 33: goto L_0x06e5;
                case 34: goto L_0x069d;
                case 36: goto L_0x06fa;
                case 39: goto L_0x06e5;
                case 42: goto L_0x066c;
                case 43: goto L_0x065f;
                case 44: goto L_0x065f;
                case 47: goto L_0x0624;
                case 48: goto L_0x0617;
                case 49: goto L_0x014c;
                case 62: goto L_0x065f;
                case 66: goto L_0x066c;
                case 1048625: goto L_0x014c;
                case 268435505: goto L_0x06e5;
                case 301989937: goto L_0x06fa;
                case 419430449: goto L_0x014c;
                case 436207665: goto L_0x014c;
                case 754974769: goto L_0x014c;
                case 771751985: goto L_0x014c;
                case 805306417: goto L_0x014c;
                case 822083633: goto L_0x014c;
                case 855638065: goto L_0x014c;
                case 939524145: goto L_0x014c;
                case 973078577: goto L_0x014c;
                case 974127153: goto L_0x014c;
                case 975175729: goto L_0x014c;
                case 976224305: goto L_0x014c;
                case 1090519089: goto L_0x014c;
                case 1107296305: goto L_0x06fa;
                case 1124073521: goto L_0x014c;
                default: goto L_0x0149;
            }
        L_0x0149:
            r1 = r12
            goto L_0x0765
        L_0x014c:
            int r6 = r8.getType()
            r5 = 1107296305(0x42000031, float:32.000187)
            if (r6 != r5) goto L_0x015a
            java.lang.String r5 = r8.mo108775z2()
            goto L_0x015e
        L_0x015a:
            java.lang.String r5 = r8.getContent()
        L_0x015e:
            r6 = 0
            com.tencent.mm.message.l$b r5 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r5, r6)
            if (r5 == 0) goto L_0x0149
            int r6 = r5.f195582i
            r21 = r5
            r5 = 3
            if (r6 == r5) goto L_0x05da
            r5 = 4
            if (r6 == r5) goto L_0x05c3
            r5 = 5
            if (r6 == r5) goto L_0x05ac
            r5 = 6
            if (r6 == r5) goto L_0x052f
            r5 = 50
            if (r6 == r5) goto L_0x0524
            r5 = 51
            if (r6 == r5) goto L_0x0494
            r2 = 87
            if (r6 == r2) goto L_0x047a
            r2 = 88
            if (r6 == r2) goto L_0x0446
            r2 = 2000(0x7d0, float:2.803E-42)
            if (r6 == r2) goto L_0x042c
            r2 = 2001(0x7d1, float:2.804E-42)
            if (r6 == r2) goto L_0x0412
            java.lang.String r2 = "ui"
            java.lang.String r5 = "v"
            switch(r6) {
                case 1: goto L_0x0405;
                case 19: goto L_0x038f;
                case 24: goto L_0x0382;
                case 33: goto L_0x0357;
                case 36: goto L_0x0338;
                case 44: goto L_0x0357;
                case 48: goto L_0x031b;
                case 53: goto L_0x02ad;
                case 57: goto L_0x02ad;
                case 60: goto L_0x028b;
                case 63: goto L_0x0283;
                case 65: goto L_0x020c;
                case 69: goto L_0x01ff;
                case 74: goto L_0x01f8;
                case 76: goto L_0x05da;
                case 82: goto L_0x01e6;
                case 94: goto L_0x01d1;
                case 98: goto L_0x01a4;
                case 2011: goto L_0x042c;
                default: goto L_0x0196;
            }
        L_0x0196:
            r9 = r12
            r10 = r21
            r11 = 1
            r12 = r8
            int r0 = r12.mo108769t2()
            if (r0 != r11) goto L_0x040c
            r0 = 1
            goto L_0x040d
        L_0x01a4:
            boolean r1 = r26.mo91583x()
            if (r1 == 0) goto L_0x01b0
            java.lang.String r0 = r0.mo108768t()
            r9 = r0
            goto L_0x01b1
        L_0x01b0:
            r9 = r4
        L_0x01b1:
            long r4 = r8.getMsgId()
            long r6 = r8.mo108774y2()
            java.lang.String r0 = r8.mo108768t()
            r10 = 1
            r11 = 0
            com.tencent.mm.ui.chatting.viewitems.e0$f r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C73958e0.f217061a
            r2 = r26
            r3 = r8
            r23 = r21
            r24 = r8
            r8 = r0
            r12 = r28
            r1.mo103037b(r2, r3, r4, r6, r8, r9, r10, r11, r12)
            r12 = r24
            goto L_0x0205
        L_0x01d1:
            r24 = r8
            r23 = r21
            com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFinderShopWindow$c r0 = com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemAppMsgFinderShopWindow.f165237a
            r12 = r24
            r14.mo103068y(r13, r12)
            gy3.C87412m.m108594g(r15, r5)
            gy3.C87412m.m108594g(r13, r2)
            r0.mo82197a(r15, r13, r12)
            goto L_0x0205
        L_0x01e6:
            r12 = r8
            r23 = r21
            com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFinderProduct$c r0 = com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemAppMsgFinderProduct.f165221a
            r14.mo103068y(r13, r12)
            gy3.C87412m.m108594g(r15, r5)
            gy3.C87412m.m108594g(r13, r2)
            r0.mo82180a(r15, r13, r12)
            goto L_0x0205
        L_0x01f8:
            r12 = r8
            r9 = r31
            r10 = r21
            goto L_0x0533
        L_0x01ff:
            r12 = r8
            r23 = r21
            com.tencent.p014mm.p136ui.chatting.viewitems.C44858d2.m49720b(r13, r12)
        L_0x0205:
            r9 = r31
            r10 = r23
            r11 = 1
            goto L_0x052c
        L_0x020c:
            r12 = r8
            r23 = r21
            java.lang.Class<ht1.a> r0 = ht1.C60150a.class
            r8 = r23
            com.tencent.mm.message.g r0 = r8.mo93555w(r0)     // Catch:{ Exception -> 0x026b }
            ht1.a r0 = (ht1.C60150a) r0     // Catch:{ Exception -> 0x026b }
            if (r0 == 0) goto L_0x027f
            te3.p81 r0 = r0.f171697b     // Catch:{ Exception -> 0x026b }
            if (r0 == 0) goto L_0x027f
            java.lang.String r2 = r14.mo103068y(r13, r12)     // Catch:{ Exception -> 0x026b }
            if (r2 != 0) goto L_0x022d
            com.tencent.mm.storage.z1 r2 = r26.mo91574o()     // Catch:{ Exception -> 0x026b }
            java.lang.String r2 = r2.getUsername()     // Catch:{ Exception -> 0x026b }
        L_0x022d:
            t91.C64208c.f181958h = r2     // Catch:{ Exception -> 0x026b }
            java.lang.Class<kq.h> r2 = p185kq.C10383h.class
            di3.d r2 = di3.C86312j.m106911c(r2)     // Catch:{ Exception -> 0x026b }
            kq.h r2 = (p185kq.C10383h) r2     // Catch:{ Exception -> 0x026b }
            com.tencent.mm.storage.z1 r3 = r26.mo91574o()     // Catch:{ Exception -> 0x026b }
            long r3 = r3.f108320R1     // Catch:{ Exception -> 0x026b }
            int r4 = (int) r3     // Catch:{ Exception -> 0x026b }
            long r3 = (long) r4     // Catch:{ Exception -> 0x026b }
            java.lang.String r2 = r2.mo10700XQ(r3)     // Catch:{ Exception -> 0x026b }
            t91.C64208c.f181959i = r2     // Catch:{ Exception -> 0x026b }
            java.lang.Class<ir.n> r2 = p565ir.C60606n.class
            di3.d r2 = di3.C86312j.m106911c(r2)     // Catch:{ Exception -> 0x026b }
            r16 = r2
            ir.n r16 = (p565ir.C60606n) r16     // Catch:{ Exception -> 0x026b }
            android.content.Context r17 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x026b }
            java.lang.String r2 = r0.f184779e     // Catch:{ Exception -> 0x026b }
            java.lang.String r3 = r0.f184781g     // Catch:{ Exception -> 0x026b }
            java.lang.String r4 = r0.f184789r     // Catch:{ Exception -> 0x026b }
            java.lang.String r5 = r0.f184780f     // Catch:{ Exception -> 0x026b }
            java.lang.String r0 = r0.f184778d     // Catch:{ Exception -> 0x026b }
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r0
            r16.z40(r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x026b }
            goto L_0x027f
        L_0x026b:
            r0 = move-exception
            goto L_0x0270
        L_0x026d:
            r0 = move-exception
            r8 = r23
        L_0x0270:
            r6 = 1
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.String r0 = r0.getMessage()
            r5 = 0
            r2[r5] = r0
            java.lang.String r0 = "jump to live fail: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r0, r2)
        L_0x027f:
            r9 = r31
            goto L_0x038c
        L_0x0283:
            r12 = r8
            r9 = r31
            r10 = r21
            r11 = 1
            goto L_0x044b
        L_0x028b:
            r12 = r8
            r8 = r21
            r5 = 0
            r6 = 1
            int r0 = r12.mo108769t2()
            if (r0 != r6) goto L_0x0298
            r11 = 1
            goto L_0x0299
        L_0x0298:
            r11 = 0
        L_0x0299:
            if (r11 == 0) goto L_0x02a4
            r4 = r31
            java.lang.String r0 = r4.f201546g
            com.tencent.p014mm.p136ui.chatting.viewitems.C57764i3.m66647o0(r15, r13, r12, r0)
            goto L_0x038b
        L_0x02a4:
            r4 = r31
            java.lang.String r0 = r4.f201546g
            com.tencent.p014mm.p136ui.chatting.viewitems.C57758h3.m66624o0(r15, r13, r12, r0)
            goto L_0x038b
        L_0x02ad:
            r4 = r12
            r5 = 0
            r6 = 1
            r12 = r8
            r8 = r21
            android.content.Intent r0 = new android.content.Intent
            android.app.Activity r1 = r26.mo91565f()
            r0.<init>(r1, r3)
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r0.addFlags(r1)
            java.lang.String r1 = r8.f195570f
            r0.putExtra(r10, r1)
            long r1 = r12.getMsgId()
            r0.putExtra(r7, r1)
            r0.putExtra(r11, r6)
            boolean r1 = r26.mo91583x()
            r0.putExtra(r9, r1)
            android.app.Activity r1 = r26.mo91565f()
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r0)
            java.lang.Object[] r17 = r2.mo10232b()
            java.lang.String r18 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$QuoteMsgSourceClickLogic"
            java.lang.String r19 = "handleItemClickOpenEvent"
            java.lang.String r20 = "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Landroid/view/View;JLcom/tencent/mm/plugin/msgquote/model/MsgQuoteItem;ZLcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$QuoteMsgSourceClickLogic$ClickOption;)V"
            java.lang.String r21 = "Undefined"
            java.lang.String r22 = "startActivity"
            java.lang.String r23 = "(Landroid/content/Intent;)V"
            r16 = r1
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r0 = r2.mo10231a(r5)
            android.content.Intent r0 = (android.content.Intent) r0
            r1.startActivity(r0)
            java.lang.String r17 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$QuoteMsgSourceClickLogic"
            java.lang.String r18 = "handleItemClickOpenEvent"
            java.lang.String r19 = "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Landroid/view/View;JLcom/tencent/mm/plugin/msgquote/model/MsgQuoteItem;ZLcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$QuoteMsgSourceClickLogic$ClickOption;)V"
            java.lang.String r20 = "Undefined"
            java.lang.String r21 = "startActivity"
            java.lang.String r22 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            android.app.Activity r0 = r26.mo91565f()
            nj3.C88990b.m111199h(r0)
            goto L_0x038b
        L_0x031b:
            r4 = r12
            r5 = 0
            r6 = 1
            r12 = r8
            r8 = r21
            int r0 = r12.mo108769t2()
            if (r0 != r6) goto L_0x0329
            r11 = 1
            goto L_0x032a
        L_0x0329:
            r11 = 0
        L_0x032a:
            if (r11 == 0) goto L_0x0331
            com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74261g.m88548t0(r8, r13, r14, r12)
            goto L_0x038b
        L_0x0331:
            boolean r0 = com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74260f.m88531t0(r8, r13, r14, r12)
            if (r0 != 0) goto L_0x038b
            goto L_0x0379
        L_0x0338:
            r4 = r12
            r5 = 0
            r6 = 1
            r12 = r8
            r8 = r21
            int r1 = r12.mo108769t2()
            if (r1 != r6) goto L_0x0346
            r11 = 1
            goto L_0x0347
        L_0x0346:
            r11 = 0
        L_0x0347:
            if (r11 == 0) goto L_0x0350
            com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74261g.m88552x0(r8, r13, r14, r12)
            com.tencent.p014mm.p136ui.chatting.component.C19729d.m21410g6(r13, r15, r0)
            goto L_0x038b
        L_0x0350:
            com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74260f.m88534w0(r8, r13, r14, r12)
            com.tencent.p014mm.p136ui.chatting.component.C19729d.m21410g6(r13, r15, r0)
            goto L_0x038b
        L_0x0357:
            r4 = r12
            r5 = 0
            r6 = 1
            r12 = r8
            r8 = r21
            int r1 = r12.mo108769t2()
            if (r1 != r6) goto L_0x0365
            r11 = 1
            goto L_0x0366
        L_0x0365:
            r11 = 0
        L_0x0366:
            if (r11 == 0) goto L_0x0373
            boolean r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74261g.m88547s0(r8, r13, r14, r12)
            if (r1 != 0) goto L_0x036f
            goto L_0x0379
        L_0x036f:
            com.tencent.p014mm.p136ui.chatting.component.C19729d.m21410g6(r13, r15, r0)
            goto L_0x038b
        L_0x0373:
            boolean r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74260f.m88530s0(r8, r13, r14, r12)
            if (r1 != 0) goto L_0x037e
        L_0x0379:
            r10 = r8
            r9 = 1
            r11 = 1
            goto L_0x05f1
        L_0x037e:
            com.tencent.p014mm.p136ui.chatting.component.C19729d.m21410g6(r13, r15, r0)
            goto L_0x038b
        L_0x0382:
            r4 = r12
            r5 = 0
            r6 = 1
            r12 = r8
            r8 = r21
            com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.m88500k(r8, r13, r12)
        L_0x038b:
            r9 = r4
        L_0x038c:
            r10 = 0
            r11 = 1
            goto L_0x03b5
        L_0x038f:
            r4 = r12
            r5 = 0
            r6 = 1
            r12 = r8
            r8 = r21
            int r0 = r12.mo108769t2()
            if (r0 != r6) goto L_0x039d
            r11 = 1
            goto L_0x039e
        L_0x039d:
            r11 = 0
        L_0x039e:
            if (r11 == 0) goto L_0x03b8
            r0 = 19
            java.lang.String r7 = r14.mo103068y(r13, r12)
            r1 = r28
            r2 = r26
            r3 = r12
            r9 = r4
            r4 = r0
            r10 = 0
            r5 = r7
            r11 = 1
            r6 = r27
            com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74261g.m88550v0(r1, r2, r3, r4, r5, r6)
        L_0x03b5:
            r10 = r8
            goto L_0x052c
        L_0x03b8:
            r9 = r4
            r10 = 0
            r11 = 1
            r4 = 19
            java.lang.String r0 = r12.getContent()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            if (r0 != 0) goto L_0x03c6
            goto L_0x03e1
        L_0x03c6:
            boolean r2 = r26.mo91583x()
            java.lang.String r3 = r12.getContent()
            int r5 = r12.mo108769t2()
            java.lang.String r2 = eb0.C75604z3.m90840l(r2, r3, r5)
            r3 = 0
            com.tencent.mm.message.l$b r2 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r2, r3)
            com.tencent.mm.message.o r0 = com.tencent.p014mm.message.C68075o.m80440a(r0)
            if (r2 != 0) goto L_0x03e3
        L_0x03e1:
            r5 = 0
            goto L_0x03f0
        L_0x03e3:
            int r0 = r0.f195664b
            if (r0 == 0) goto L_0x03eb
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r2.f195582i = r0
        L_0x03eb:
            boolean r0 = r1.booleanValue()
            r5 = r0
        L_0x03f0:
            java.lang.String r6 = r14.mo103097o(r13, r12)
            java.lang.String r7 = r14.mo103068y(r13, r12)
            r1 = r28
            r2 = r26
            r3 = r12
            r10 = r8
            r8 = r27
            com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74260f.m88532u0(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x052c
        L_0x0405:
            r9 = r12
            r10 = r21
            r11 = 1
            r12 = r8
            goto L_0x052c
        L_0x040c:
            r0 = 0
        L_0x040d:
            if (r0 != 0) goto L_0x052c
            r9 = 1
            goto L_0x05f1
        L_0x0412:
            r9 = r12
            r10 = r21
            r11 = 1
            r12 = r8
            int r0 = r12.mo108769t2()
            if (r0 != r11) goto L_0x041f
            r0 = 1
            goto L_0x0420
        L_0x041f:
            r0 = 0
        L_0x0420:
            if (r0 == 0) goto L_0x0427
            com.tencent.p014mm.p136ui.chatting.viewitems.C74090l0.C74093c.m88130o0(r13, r12)
            goto L_0x052c
        L_0x0427:
            com.tencent.p014mm.p136ui.chatting.viewitems.C74090l0.C74092b.m88119o0(r13, r12)
            goto L_0x052c
        L_0x042c:
            r9 = r12
            r10 = r21
            r11 = 1
            r12 = r8
            int r0 = r12.mo108769t2()
            if (r0 != r11) goto L_0x0439
            r0 = 1
            goto L_0x043a
        L_0x0439:
            r0 = 0
        L_0x043a:
            if (r0 == 0) goto L_0x0441
            com.tencent.p014mm.p136ui.chatting.viewitems.C57749f3.C57753c.m66612o0(r13, r12)
            goto L_0x052c
        L_0x0441:
            com.tencent.p014mm.p136ui.chatting.viewitems.C57749f3.C57752b.m66601o0(r13, r12)
            goto L_0x052c
        L_0x0446:
            r9 = r12
            r10 = r21
            r11 = 1
            r12 = r8
        L_0x044b:
            int r0 = r12.mo108769t2()
            if (r0 != r11) goto L_0x0453
            r0 = 1
            goto L_0x0454
        L_0x0453:
            r0 = 0
        L_0x0454:
            if (r0 == 0) goto L_0x0468
            java.lang.String r6 = r14.mo103068y(r13, r12)
            com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$d r1 = com.tencent.p014mm.p136ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed.f165161a
            r2 = r27
            r3 = r28
            r4 = r26
            r5 = r12
            r1.mo82126i(r2, r3, r4, r5, r6)
            goto L_0x052c
        L_0x0468:
            java.lang.String r6 = r14.mo103068y(r13, r12)
            com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$d r1 = com.tencent.p014mm.p136ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed.f165161a
            r2 = r27
            r3 = r28
            r4 = r26
            r5 = r12
            r1.mo82126i(r2, r3, r4, r5, r6)
            goto L_0x052c
        L_0x047a:
            r9 = r12
            r10 = r21
            r11 = 1
            r12 = r8
            java.lang.Class<vh0.b> r0 = vh0.C78415b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            vh0.b r0 = (vh0.C78415b) r0
            android.app.Activity r1 = r26.mo91565f()
            java.lang.String r2 = r9.f201545f
            java.lang.String r3 = r9.f201549j
            r0.mo94220DD(r1, r2, r3)
            goto L_0x052c
        L_0x0494:
            r9 = r12
            r10 = r21
            r11 = 1
            r12 = r8
            java.lang.Class<ht1.f> r0 = ht1.C60166f.class
            com.tencent.mm.message.g r0 = r10.mo93555w(r0)     // Catch:{ Exception -> 0x0514 }
            ht1.f r0 = (ht1.C60166f) r0     // Catch:{ Exception -> 0x0514 }
            android.content.Intent r3 = new android.content.Intent     // Catch:{ Exception -> 0x0514 }
            r3.<init>()     // Catch:{ Exception -> 0x0514 }
            java.lang.String r4 = r12.mo108768t()     // Catch:{ Exception -> 0x0514 }
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85820U5(r4)     // Catch:{ Exception -> 0x0514 }
            java.lang.String r5 = "report_scene"
            if (r4 == 0) goto L_0x04b7
            r4 = 2
            r3.putExtra(r5, r4)     // Catch:{ Exception -> 0x0514 }
            goto L_0x04ba
        L_0x04b7:
            r3.putExtra(r5, r11)     // Catch:{ Exception -> 0x0514 }
        L_0x04ba:
            java.lang.String r4 = "from_user"
            java.lang.String r5 = r12.mo108768t()     // Catch:{ Exception -> 0x0514 }
            r3.putExtra(r4, r5)     // Catch:{ Exception -> 0x0514 }
            java.lang.String r4 = "feed_object_id"
            te3.rk1 r5 = r0.f171710b     // Catch:{ Exception -> 0x0514 }
            java.lang.String r5 = r5.f185183d     // Catch:{ Exception -> 0x0514 }
            if (r5 == 0) goto L_0x04dc
            boolean r6 = r5.isEmpty()     // Catch:{ Exception -> 0x0514 }
            if (r6 == 0) goto L_0x04d2
            goto L_0x04dc
        L_0x04d2:
            java.math.BigInteger r6 = new java.math.BigInteger     // Catch:{ Exception -> 0x0514 }
            r6.<init>(r5)     // Catch:{ Exception -> 0x0514 }
            long r5 = r6.longValue()     // Catch:{ Exception -> 0x0514 }
            goto L_0x04de
        L_0x04dc:
            r5 = 0
        L_0x04de:
            r3.putExtra(r4, r5)     // Catch:{ Exception -> 0x0514 }
            java.lang.String r4 = "feed_object_nonceId"
            te3.rk1 r5 = r0.f171710b     // Catch:{ Exception -> 0x0514 }
            java.lang.String r5 = r5.f185191o     // Catch:{ Exception -> 0x0514 }
            r3.putExtra(r4, r5)     // Catch:{ Exception -> 0x0514 }
            java.lang.String r4 = "business_type"
            r5 = 0
            r3.putExtra(r4, r5)     // Catch:{ Exception -> 0x0514 }
            java.lang.String r4 = "finder_user_name"
            te3.rk1 r0 = r0.f171710b     // Catch:{ Exception -> 0x0514 }
            java.lang.String r0 = r0.f185184e     // Catch:{ Exception -> 0x0514 }
            r3.putExtra(r4, r0)     // Catch:{ Exception -> 0x0514 }
            di3.d r0 = di3.C86312j.m106911c(r2)     // Catch:{ Exception -> 0x0514 }
            ht1.t1 r0 = (ht1.C60200t1) r0     // Catch:{ Exception -> 0x0514 }
            r4 = 25
            r5 = 6
            r6 = 2
            r0.mo76842e7(r5, r6, r4, r3)     // Catch:{ Exception -> 0x0514 }
            di3.d r0 = di3.C86312j.m106911c(r2)     // Catch:{ Exception -> 0x0514 }
            ht1.t1 r0 = (ht1.C60200t1) r0     // Catch:{ Exception -> 0x0514 }
            android.app.Activity r2 = r26.mo91565f()     // Catch:{ Exception -> 0x0514 }
            r0.mo76864nr(r2, r3)     // Catch:{ Exception -> 0x0514 }
            goto L_0x052c
        L_0x0514:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.String r0 = r0.getMessage()
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "jump to finder feed fail: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r0, r2)
            goto L_0x052c
        L_0x0524:
            r9 = r12
            r10 = r21
            r11 = 1
            r12 = r8
            com.tencent.p014mm.p136ui.chatting.viewitems.C57791s1.m66742b(r13, r12)
        L_0x052c:
            r9 = 1
            goto L_0x05f0
        L_0x052f:
            r9 = r12
            r10 = r21
            r12 = r8
        L_0x0533:
            r8 = 1
            if (r32 != 0) goto L_0x0545
            android.app.Activity r0 = r26.mo91565f()
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r1 = r13.f193286j
            android.view.View r1 = r1.getContentView()
            nj3.C76912y0.m92771j(r0, r1)
            goto L_0x0784
        L_0x0545:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            android.app.Activity r1 = r26.mo91565f()
            java.lang.String r2 = "com.tencent.mm.ui.chatting.AppAttachDownloadUI"
            r0.setClassName(r1, r2)
            java.lang.String r1 = "scene"
            r2 = 2
            r0.putExtra(r1, r2)
            long r1 = r12.getMsgId()
            java.lang.String r3 = "app_msg_id"
            r0.putExtra(r3, r1)
            r0.putExtra(r11, r8)
            java.lang.String r1 = "msg_type"
            r0.putExtra(r1, r8)
            java.lang.String r1 = "key_quoted_msg"
            r0.putExtra(r1, r9)
            k20.a r11 = new k20.a
            r11.<init>()
            r11.mo10233c(r0)
            java.lang.Object[] r2 = r11.mo10232b()
            java.lang.String r3 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$QuoteMsgSourceClickLogic"
            java.lang.String r4 = "handleItemClickOpenEvent"
            java.lang.String r5 = "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Landroid/view/View;JLcom/tencent/mm/plugin/msgquote/model/MsgQuoteItem;ZLcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$QuoteMsgSourceClickLogic$ClickOption;)V"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r0 = "(Landroid/content/Intent;)V"
            r1 = r26
            r9 = 1
            r8 = r0
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 0
            java.lang.Object r0 = r11.mo10231a(r1)
            android.content.Intent r0 = (android.content.Intent) r0
            r13.mo91556Q(r0)
            java.lang.String r2 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$QuoteMsgSourceClickLogic"
            java.lang.String r3 = "handleItemClickOpenEvent"
            java.lang.String r4 = "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Landroid/view/View;JLcom/tencent/mm/plugin/msgquote/model/MsgQuoteItem;ZLcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$QuoteMsgSourceClickLogic$ClickOption;)V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r1 = r26
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x05f0
        L_0x05ac:
            r12 = r8
            r10 = r21
            r9 = 1
            int r0 = r12.mo108769t2()
            if (r0 != r9) goto L_0x05b8
            r11 = 1
            goto L_0x05b9
        L_0x05b8:
            r11 = 0
        L_0x05b9:
            if (r11 == 0) goto L_0x05bf
            com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74261g.m88553y0(r10, r15, r13, r14, r12)
            goto L_0x05f0
        L_0x05bf:
            com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74260f.m88535x0(r10, r15, r13, r14, r12)
            goto L_0x05f0
        L_0x05c3:
            r12 = r8
            r10 = r21
            r9 = 1
            int r0 = r12.mo108769t2()
            if (r0 != r9) goto L_0x05cf
            r11 = 1
            goto L_0x05d0
        L_0x05cf:
            r11 = 0
        L_0x05d0:
            if (r11 == 0) goto L_0x05d6
            com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74261g.m88551w0(r10, r13, r14, r12)
            goto L_0x05f0
        L_0x05d6:
            com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74260f.m88533v0(r10, r13, r14, r12)
            goto L_0x05f0
        L_0x05da:
            r12 = r8
            r10 = r21
            r9 = 1
            int r0 = r12.mo108769t2()
            if (r0 != r9) goto L_0x05e6
            r11 = 1
            goto L_0x05e7
        L_0x05e6:
            r11 = 0
        L_0x05e7:
            if (r11 == 0) goto L_0x05ed
            com.tencent.p014mm.p136ui.chatting.viewitems.C74310y2.m88646a(r14, r13, r12)
            goto L_0x05f0
        L_0x05ed:
            com.tencent.p014mm.p136ui.chatting.viewitems.C74310y2.m88646a(r14, r13, r12)
        L_0x05f0:
            r11 = 0
        L_0x05f1:
            r0 = 1
            r8 = r31
            long r2 = r8.f201544e
            r4 = 49
            int r6 = r10.f195582i
            long r6 = (long) r6
            w72.C22877b.m26854a(r0, r2, r4, r6)
            int r0 = r12.mo108769t2()
            if (r0 != r9) goto L_0x0606
            goto L_0x0607
        L_0x0606:
            r9 = 0
        L_0x0607:
            if (r9 == 0) goto L_0x0610
            if (r11 == 0) goto L_0x0784
            com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74261g.m88549u0(r10, r15, r13, r14, r12)
            goto L_0x0784
        L_0x0610:
            if (r11 == 0) goto L_0x0784
            com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74260f.m88535x0(r10, r15, r13, r14, r12)
            goto L_0x0784
        L_0x0617:
            r9 = 1
            r25 = r12
            r12 = r8
            r8 = r25
            com.tencent.mm.ui.chatting.viewitems.r6 r0 = new com.tencent.mm.ui.chatting.viewitems.r6
            r0.<init>(r13, r9, r12, r15)
            goto L_0x06f8
        L_0x0624:
            r9 = 1
            r25 = r12
            r12 = r8
            r8 = r25
            java.lang.String r0 = r8.f201545f
            java.lang.String r1 = r12.getContent()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "parserEmojiXml "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.emoji.EmojiMsgInfo"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r2)
            java.lang.String r2 = "msg"
            r3 = 0
            java.util.Map r2 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r1, r2, r3)
            com.tencent.mm.storage.s2 r0 = com.tencent.p014mm.storage.C96985s2.m124655b(r2, r0, r1, r4)
            if (r0 == 0) goto L_0x0658
            java.lang.String r0 = r0.f284163d
            r12.mo108739S2(r0)
        L_0x0658:
            com.tencent.mm.ui.chatting.viewitems.b6 r0 = new com.tencent.mm.ui.chatting.viewitems.b6
            r0.<init>(r13, r9, r12)
            goto L_0x06f8
        L_0x065f:
            r9 = 1
            r25 = r12
            r12 = r8
            r8 = r25
            com.tencent.mm.ui.chatting.viewitems.l7 r0 = new com.tencent.mm.ui.chatting.viewitems.l7
            r0.<init>(r13, r9, r12, r15)
            goto L_0x06f8
        L_0x066c:
            r9 = 1
            r25 = r12
            r12 = r8
            r8 = r25
            java.lang.Class<i21.h> r0 = i21.C98591h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            i21.h r0 = (i21.C98591h) r0
            java.lang.String r1 = r12.mo108768t()
            r0.Gr0(r1)
            java.lang.String r2 = r12.mo108768t()
            java.lang.String r3 = r12.getContent()
            boolean r4 = r26.mo91583x()
            int r0 = r12.mo108769t2()
            if (r0 != 0) goto L_0x0695
            r5 = 1
            goto L_0x0696
        L_0x0695:
            r5 = 0
        L_0x0696:
            r1 = r26
            r6 = r12
            com.tencent.p014mm.p136ui.chatting.viewitems.C74115m4.m88192b(r1, r2, r3, r4, r5, r6)
            goto L_0x06f8
        L_0x069d:
            r9 = 1
            r25 = r12
            r12 = r8
            r8 = r25
            java.lang.Class<zj3.l> r0 = zj3.C79368l.class
            com.tencent.mm.ui.chatting.manager.a r2 = r13.f193278b
            xi.d r0 = r2.mo102812a(r0)
            zj3.l r0 = (zj3.C79368l) r0
            int r0 = r0.mo108166A2(r12)
            r13.f193289m = r0
            java.lang.Object[] r2 = new java.lang.Object[r9]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "quotedMsgPosition:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r0, r2)
            com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate$c r0 = new com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate$c
            boolean r1 = r26.mo91583x()
            uj3.d r2 = new uj3.d
            int r4 = r13.f193289m
            r2.<init>(r4)
            r4 = 0
            r0.<init>(r12, r1, r2, r4)
            int r1 = r12.mo108769t2()
            if (r1 != r9) goto L_0x06da
            r11 = 1
            goto L_0x06db
        L_0x06da:
            r11 = 0
        L_0x06db:
            if (r11 == 0) goto L_0x06e1
            com.tencent.p014mm.p136ui.chatting.viewitems.C74177q7.C74186d.m88400o0(r15, r13, r12, r0, r8)
            goto L_0x06f8
        L_0x06e1:
            com.tencent.p014mm.p136ui.chatting.viewitems.C74177q7.C74180c.m88387o0(r15, r13, r12, r0, r8)
            goto L_0x06f8
        L_0x06e5:
            r25 = r12
            r12 = r8
            r8 = r25
            com.tencent.mm.ui.chatting.viewitems.o6$c r1 = new com.tencent.mm.ui.chatting.viewitems.o6$c
            r4 = 1
            r7 = 0
            r2 = r26
            r3 = r27
            r5 = r12
            r6 = r28
            r1.<init>(r2, r3, r4, r5, r6, r7)
        L_0x06f8:
            r1 = r8
            goto L_0x0765
        L_0x06fa:
            r1 = r12
            r2 = 0
            r4 = 1
            r12 = r8
            android.content.Intent r0 = new android.content.Intent
            android.app.Activity r5 = r26.mo91565f()
            r0.<init>(r5, r3)
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            r0.addFlags(r3)
            java.lang.String r3 = r1.f201549j
            r0.putExtra(r10, r3)
            if (r12 == 0) goto L_0x071a
            long r5 = r12.getMsgId()
            r0.putExtra(r7, r5)
        L_0x071a:
            r0.putExtra(r11, r4)
            boolean r3 = r26.mo91583x()
            r0.putExtra(r9, r3)
            android.app.Activity r3 = r26.mo91565f()
            k20.a r4 = new k20.a
            r4.<init>()
            r4.mo10233c(r0)
            java.lang.Object[] r15 = r4.mo10232b()
            java.lang.String r16 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$QuoteMsgSourceClickLogic"
            java.lang.String r17 = "handleItemClickOpenEvent"
            java.lang.String r18 = "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Landroid/view/View;JLcom/tencent/mm/plugin/msgquote/model/MsgQuoteItem;ZLcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$QuoteMsgSourceClickLogic$ClickOption;)V"
            java.lang.String r19 = "Undefined"
            java.lang.String r20 = "startActivity"
            java.lang.String r21 = "(Landroid/content/Intent;)V"
            r14 = r3
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r0 = r4.mo10231a(r2)
            android.content.Intent r0 = (android.content.Intent) r0
            r3.startActivity(r0)
            java.lang.String r15 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$QuoteMsgSourceClickLogic"
            java.lang.String r16 = "handleItemClickOpenEvent"
            java.lang.String r17 = "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Landroid/view/View;JLcom/tencent/mm/plugin/msgquote/model/MsgQuoteItem;ZLcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$QuoteMsgSourceClickLogic$ClickOption;)V"
            java.lang.String r18 = "Undefined"
            java.lang.String r19 = "startActivity"
            java.lang.String r20 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            android.app.Activity r0 = r26.mo91565f()
            nj3.C88990b.m111199h(r0)
        L_0x0765:
            int r0 = r1.f201543d
            r2 = 49
            if (r0 == r2) goto L_0x0784
            r2 = 805306417(0x30000031, float:4.65664E-10)
            if (r0 == r2) goto L_0x0784
            r2 = 822083633(0x31000031, float:1.862656E-9)
            if (r0 == r2) goto L_0x0784
            r2 = 1090519089(0x41000031, float:8.000047)
            if (r0 == r2) goto L_0x0784
            r3 = 1
            long r5 = r1.f201544e
            long r7 = (long) r0
            r9 = 0
            w72.C22877b.m26854a(r3, r5, r7, r9)
        L_0x0784:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74287w2.m88623c(ck3.b, com.tencent.mm.ui.chatting.viewitems.i, android.view.View, long, com.tencent.mm.plugin.msgquote.model.MsgQuoteItem, boolean):void");
    }

    /* renamed from: d */
    public static void m88624d(C67391b bVar, C74023i iVar, C72963f4 f4Var, View view, long j, MsgQuoteItem msgQuoteItem, boolean z) {
        C67391b bVar2 = bVar;
        MsgQuoteItem msgQuoteItem2 = msgQuoteItem;
        C72963f4 b = m88622b(bVar2, j, msgQuoteItem2, "handleQuoteMsgClick");
        if (b == null) {
            Log.m105920e("MicroMsg.msgquote.QuoteMsgSourceClickLogic", "handleItemClickToPositionEvent,quotedMsg is null!");
        } else if (b.getMsgId() == 0) {
            Log.m105924i("MicroMsg.msgquote.QuoteMsgSourceClickLogic", "handleItemClickToPositionEvent,show toast");
            int i = msgQuoteItem2.f201543d;
            switch (i) {
                case 49:
                case 1048625:
                case 419430449:
                case 436207665:
                case 754974769:
                case 771751985:
                case 805306417:
                case 822083633:
                case 855638065:
                case 939524145:
                case 973078577:
                case 974127153:
                case 975175729:
                case 976224305:
                case 1040187441:
                case 1090519089:
                    C68070l.C68072b u = C68070l.C68072b.m80422u(msgQuoteItem2.f201549j, (String) null);
                    if (u == null) {
                        Log.m105928w("MicroMsg.msgquote.QuoteMsgSourceClickLogic", "appMsgContent is null");
                        break;
                    } else {
                        C22877b.m26854a(6, msgQuoteItem2.f201544e, 49, (long) u.f195582i);
                        break;
                    }
                default:
                    C22877b.m26854a(6, msgQuoteItem2.f201544e, (long) i, 0);
                    break;
            }
            C76912y0.makeText(view.getContext(), (int) C0966R.string.bar, 0).show();
        } else {
            int positionForView = bVar.mo91570k().getPositionForView(view);
            C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_POSITION_AT_CHATRECORD_FIRST_IN_BOOLEAN, Boolean.TRUE);
            ((C79368l) bVar2.f193278b.mo102812a(C79368l.class)).mo108214y2(b.getMsgId(), false, true, true, C76577a.m92151b(bVar.mo91565f(), 120), true, C76227e.C76228a.ACTION_POSITION);
            ((C79387w) bVar2.f193278b.mo102812a(C79387w.class)).mo102195q4();
            new MMHandler().postDelayed(new C74288a(bVar2, b, f4Var, positionForView), 500);
            int i2 = msgQuoteItem2.f201543d;
            switch (i2) {
                case 49:
                case 1048625:
                case 419430449:
                case 436207665:
                case 754974769:
                case 771751985:
                case 805306417:
                case 822083633:
                case 855638065:
                case 939524145:
                case 973078577:
                case 974127153:
                case 975175729:
                case 976224305:
                case 1040187441:
                case 1090519089:
                    C68070l.C68072b u2 = C68070l.C68072b.m80422u(b.getContent(), (String) null);
                    if (u2 != null) {
                        int i3 = u2.f195582i;
                        if (i3 == 6 && !z) {
                            C76912y0.m92771j(bVar.mo91565f(), bVar2.f193286j.getContentView());
                            return;
                        } else {
                            C22877b.m26854a(3, msgQuoteItem2.f201544e, 49, (long) i3);
                            return;
                        }
                    } else {
                        return;
                    }
                default:
                    C22877b.m26854a(3, msgQuoteItem2.f201544e, (long) i2, 0);
                    return;
            }
        }
    }
}
