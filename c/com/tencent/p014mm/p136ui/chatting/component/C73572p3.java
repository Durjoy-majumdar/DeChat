package com.tencent.p014mm.p136ui.chatting.component;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.chatroom.p015ui.SeeAccessVerifyInfoUI;
import com.tencent.p014mm.p136ui.tools.C45082x0;
import com.tencent.p014mm.roomsdk.model.factory.C72940a;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import j20.C117292a;
import java.util.LinkedList;
import k20.C9556a;
import n62.C11136a;
import nj3.C11184p0;
import o62.C11375e;
import p270xi.C91212b;
import p530fx.C45819c;
import qm2.C77369b;
import qo3.C77407n;
import xk3.C15806a;
import xk3.C15808b;
import xk3.C15810c;
import xk3.C15817f;
import zj3.C79348e;
import zj3.C79357g;
import zj3.C79367k0;

@C91212b(exportInterface = C79367k0.class)
/* renamed from: com.tencent.mm.ui.chatting.component.p3 */
public class C73572p3 extends C73412a implements C79367k0, C11375e.C11378c {

    /* renamed from: e */
    public C15806a f216076e;

    /* renamed from: f */
    public C15808b f216077f;

    /* renamed from: g */
    public C15817f f216078g;

    /* renamed from: h */
    public C11136a f216079h;

    /* renamed from: i */
    public C15810c f216080i;

    /* renamed from: j */
    public C77369b f216081j;

    /* renamed from: n */
    public C45082x0 f216082n;

    /* renamed from: com.tencent.mm.ui.chatting.component.p3$a */
    public class C73573a implements View.OnCreateContextMenuListener {
        public C73573a(C73572p3 p3Var) {
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            contextMenu.add(0, 0, 0, view.getContext().getString(C0966R.string.i6k));
            contextMenu.add(0, 1, 1, view.getContext().getString(C0966R.string.i6b));
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.p3$b */
    public class C73574b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ LinkedList f216083d;

        /* renamed from: e */
        public final /* synthetic */ String f216084e;

        /* renamed from: com.tencent.mm.ui.chatting.component.p3$b$a */
        public class C73575a implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C72940a f216086d;

            public C73575a(C73574b bVar, C72940a aVar) {
                this.f216086d = aVar;
            }

            public void onCancel(DialogInterface dialogInterface) {
                this.f216086d.cancel();
            }
        }

        public C73574b(LinkedList linkedList, String str) {
            this.f216083d = linkedList;
            this.f216084e = str;
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            int itemId = menuItem.getItemId();
            if (itemId == 0) {
                ((C79357g) C73572p3.this.f215752d.f193278b.mo102812a(C79357g.class)).mo102151U(-1, this.f216083d, 1, 0);
            } else if (itemId == 1) {
                C72940a i2 = ((C45819c) C86312j.m106911c(C45819c.class)).mo71192mK(C73572p3.this.f215752d.mo91574o().getUsername()).mo71498i(this.f216084e, C73572p3.this.f215752d.mo91574o().getUsername());
                i2.mo100867d(C73572p3.this.f215752d.mo91565f(), C73572p3.this.f215752d.mo91572m().getString(C0966R.string.a3h), C73572p3.this.f215752d.mo91572m().getString(C0966R.string.i6e), true, true, new C73575a(this, i2));
            }
        }
    }

    /* renamed from: I */
    public void mo11394I(View view, C11375e.C11377b bVar) {
        if (view != null && bVar != null) {
            LinkedList linkedList = new LinkedList();
            linkedList.add(bVar.f33503a);
            mo102563Z5(view, linkedList, bVar.f33504b);
        }
    }

    /* renamed from: O4 */
    public void mo26162O4() {
        this.f216078g = new C15817f(this);
        this.f216077f = new C15808b(this);
        this.f216076e = new C15806a(this);
        this.f216079h = new C11136a(this);
        this.f216080i = new C15810c(this);
        this.f216081j = new C77369b(this);
    }

    /* renamed from: Y5 */
    public void mo102562Y5(String str, String str2, String str3, String str4, String str5, String str6, LinkedList<String> linkedList, LinkedList<String> linkedList2, LinkedList<String> linkedList3, LinkedList<String> linkedList4, LinkedList<String> linkedList5, C72963f4 f4Var) {
        Intent intent = new Intent(this.f215752d.mo91565f(), SeeAccessVerifyInfoUI.class);
        intent.putExtra("msgLocalId", f4Var.getMsgId());
        intent.putExtra("msgSvrId", f4Var.mo108774y2());
        intent.putExtra("invitertitle", this.f215752d.mo91572m().getString(C0966R.string.f7348dq, new Object[]{Integer.valueOf(linkedList.size())}));
        String str7 = str;
        intent.putExtra("inviterusername", str);
        intent.putExtra("chatroom", str5);
        String str8 = str2;
        intent.putExtra("inviterappid", str2);
        String str9 = str3;
        intent.putExtra("inviterdescid", str3);
        String str10 = str4;
        intent.putExtra("invitationreason", str4);
        intent.putExtra("ticket", str6);
        intent.putExtra("username", Util.listToString(linkedList, ","));
        intent.putExtra("nickname", Util.listToString(linkedList2, ","));
        intent.putExtra("descid", Util.listToString(linkedList3, ","));
        intent.putExtra("appid", Util.listToString(linkedList4, ","));
        intent.putExtra("headimgurl", Util.listToString(linkedList5, ","));
        C67391b bVar = this.f215752d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C67391b bVar2 = bVar;
        C117292a.m165358d(bVar2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/component/NewXmlSysMsgComponent", "dealApproveAddChatRoomMember", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedList;Ljava/util/LinkedList;Ljava/util/LinkedList;Ljava/util/LinkedList;Ljava/util/LinkedList;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        bVar.mo91556Q((Intent) aVar.mo10231a(0));
        C117292a.m165359e(bVar2, "com/tencent/mm/ui/chatting/component/NewXmlSysMsgComponent", "dealApproveAddChatRoomMember", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedList;Ljava/util/LinkedList;Ljava/util/LinkedList;Ljava/util/LinkedList;Ljava/util/LinkedList;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: Z5 */
    public final void mo102563Z5(View view, LinkedList<String> linkedList, String str) {
        if (this.f216082n == null) {
            this.f216082n = new C45082x0(this.f215752d.mo91565f());
        }
        this.f216082n.mo70436b(view, new C73573a(this), new C73574b(linkedList, str), (C77407n.C47880p) null);
    }

    /* renamed from: a6 */
    public final void mo102564a6(long j, LinkedList<String> linkedList, int i) {
        Class cls = C79348e.class;
        if (((C79348e) this.f215752d.f193278b.mo102812a(cls)).mo70071q1()) {
            ((C79348e) this.f215752d.f193278b.mo102812a(cls)).mo70054P3(linkedList, 1);
            return;
        }
        ((C79357g) this.f215752d.f193278b.mo102812a(C79357g.class)).mo102151U(j, linkedList, 1, i);
    }

    /* renamed from: t2 */
    public void mo11395t2(long j, LinkedList<String> linkedList, int i) {
        if (linkedList != null && linkedList.size() > 0) {
            mo102564a6(j, linkedList, i);
        }
    }

    /* renamed from: u5 */
    public void mo26170u5() {
        C15806a aVar = this.f216076e;
        if (aVar != null) {
            aVar.mo11240d();
            this.f216076e = null;
        }
        C15808b bVar = this.f216077f;
        if (bVar != null) {
            bVar.mo11240d();
            this.f216077f = null;
        }
        C15817f fVar = this.f216078g;
        if (fVar != null) {
            fVar.mo11240d();
            this.f216078g = null;
        }
        C11136a aVar2 = this.f216079h;
        if (aVar2 != null) {
            aVar2.mo11240d();
            this.f216079h = null;
        }
        C15810c cVar = this.f216080i;
        if (cVar != null) {
            cVar.mo11240d();
            this.f216080i = null;
        }
        C77369b bVar2 = this.f216081j;
        if (bVar2 != null) {
            bVar2.mo11240d();
            this.f216081j = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0248 A[SYNTHETIC, Splitter:B:75:0x0248] */
    /* renamed from: y5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo60786y5(android.view.View r16, com.tencent.p014mm.storage.C72963f4 r17, int r18, sc0.C36652a r19, int r20) {
        /*
            r15 = this;
            r14 = r15
            r0 = r16
            r1 = r19
            java.lang.Class<zj3.e> r2 = zj3.C79348e.class
            boolean r3 = r1 instanceof sc0.C36657d
            r4 = 0
            java.lang.String r5 = "MicroMsg.NewXmlSysMsgComponent"
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L_0x00b7
            sc0.d r1 = (sc0.C36657d) r1
            java.lang.String r3 = r1.f97423f
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r3)
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r7] = r3
            ck3.b r9 = r14.f215752d
            com.tencent.mm.ui.chatting.manager.a r9 = r9.f193278b
            xi.d r9 = r9.mo102812a(r2)
            zj3.e r9 = (zj3.C79348e) r9
            boolean r9 = r9.mo70071q1()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r8[r6] = r9
            java.lang.String r9 = "click delchatroommember link %s,isBizChat:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r9, r8)
            java.util.LinkedList<java.lang.String> r8 = r1.f97442l
            if (r8 != 0) goto L_0x0040
            java.lang.String r0 = "click members is null!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            return
        L_0x0040:
            ck3.b r8 = r14.f215752d
            com.tencent.mm.ui.chatting.manager.a r8 = r8.f193278b
            xi.d r2 = r8.mo102812a(r2)
            zj3.e r2 = (zj3.C79348e) r2
            boolean r2 = r2.mo70075s4()
            if (r2 != 0) goto L_0x005a
            ck3.b r2 = r14.f215752d
            boolean r2 = r2.mo91582w()
            if (r2 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r6 = 0
        L_0x005a:
            if (r6 != 0) goto L_0x0062
            java.lang.String r0 = "not group chat !!!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            return
        L_0x0062:
            java.lang.String r2 = "invite"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0073
            r2 = -1
            java.util.LinkedList<java.lang.String> r0 = r1.f97442l
            r15.mo102564a6(r2, r0, r7)
            goto L_0x033d
        L_0x0073:
            java.lang.String r2 = "qrcode"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0084
            java.util.LinkedList<java.lang.String> r2 = r1.f97442l
            java.lang.String r1 = r1.f97443m
            r15.mo102563Z5(r0, r2, r1)
            goto L_0x033d
        L_0x0084:
            java.lang.String r0 = "webview"
            boolean r2 = r3.equals(r0)
            if (r2 == 0) goto L_0x033d
            java.lang.String r2 = r1.f97444n
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x033d
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r1.f97444n
            java.lang.String r3 = "rawUrl"
            r2.putExtra(r3, r1)
            java.lang.String r1 = eb0.C75592q0.m90789s()
            java.lang.String r3 = "geta8key_username"
            r2.putExtra(r3, r1)
            ck3.b r1 = r14.f215752d
            android.app.Activity r1 = r1.mo91565f()
            java.lang.String r3 = "com.tencent.mm.plugin.webview.ui.tools.WebViewUI"
            ke3.C88144b.m109791i(r1, r0, r3, r2, r4)
            goto L_0x033d
        L_0x00b7:
            boolean r3 = r1 instanceof sc0.C36656c
            if (r3 == 0) goto L_0x00e4
            r0 = r1
            sc0.c r0 = (sc0.C36656c) r0
            if (r20 != 0) goto L_0x033d
            java.lang.String r2 = r0.f97438r
            java.lang.String r5 = r0.f97439s
            java.lang.String r6 = r0.f97432l
            java.lang.String r7 = r0.f97433m
            java.util.LinkedList<java.lang.String> r8 = r0.f97435o
            java.util.LinkedList<java.lang.String> r9 = r0.f97436p
            java.util.LinkedList<java.lang.String> r12 = r0.f97437q
            java.util.LinkedList r10 = new java.util.LinkedList
            r10.<init>()
            java.util.LinkedList r11 = new java.util.LinkedList
            r11.<init>()
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            r1 = r15
            r13 = r17
            r1.mo102562Y5(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x033d
        L_0x00e4:
            boolean r3 = r1 instanceof sc0.C36655b
            if (r3 == 0) goto L_0x010a
            r0 = r1
            sc0.b r0 = (sc0.C36655b) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.LinkedList<java.lang.String> r2 = r0.f97428l
            r1.addAll(r2)
            ck3.b r2 = r14.f215752d
            java.lang.Class<zj3.g> r3 = zj3.C79357g.class
            com.tencent.mm.ui.chatting.manager.a r2 = r2.f193278b
            xi.d r2 = r2.mo102812a(r3)
            zj3.g r2 = (zj3.C79357g) r2
            java.lang.String r0 = r0.f97431o
            r13 = r17
            r2.mo102149R2(r1, r0, r13)
            goto L_0x033d
        L_0x010a:
            r13 = r17
            boolean r3 = r1 instanceof kk3.C33931b
            if (r3 == 0) goto L_0x02ec
            kk3.b r1 = (kk3.C33931b) r1
            com.tencent.mm.storage.f4 r2 = r1.f97419b
            java.lang.String r3 = r1.f91638m
            int r8 = r1.f91637l
            long r9 = eb0.C31543z5.m39453c()
            long r11 = r1.f91639n
            long r9 = r9 - r11
            r11 = 300000(0x493e0, double:1.482197E-318)
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 < 0) goto L_0x015a
            java.lang.String r1 = "[handleClickInvokeMessageSysText] it's over time to copy invoke message!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r1)
            ck3.b r1 = r14.f215752d
            android.app.Activity r1 = r1.mo91565f()
            ck3.b r3 = r14.f215752d
            android.content.res.Resources r3 = r3.mo91572m()
            r4 = 2131831529(0x7f112ae9, float:1.9296086E38)
            java.lang.String r3 = r3.getString(r4)
            ck3.b r4 = r14.f215752d
            android.content.res.Resources r4 = r4.mo91572m()
            r5 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r4 = r4.getString(r5)
            nj3.C76879j.m92748s(r1, r3, r4)
            com.tencent.mm.ui.chatting.component.o3 r1 = new com.tencent.mm.ui.chatting.component.o3
            r1.<init>(r15, r2, r0)
            java.lang.String r0 = "deleteInvokeMsg"
            com.tencent.p014mm.sdk.thread.ThreadPool.post(r1, r0)
            goto L_0x033d
        L_0x015a:
            r0 = 822083633(0x31000031, float:1.862656E-9)
            java.lang.String r9 = ".msg.appmsg.title"
            java.lang.String r10 = "msg"
            if (r8 != r0) goto L_0x01a4
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x019b }
            byte[] r8 = android.util.Base64.decode(r3, r7)     // Catch:{ all -> 0x019b }
            r0.<init>(r8)     // Catch:{ all -> 0x019b }
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r0, r10, r4)     // Catch:{ all -> 0x019b }
            if (r0 == 0) goto L_0x01de
            java.lang.Object r8 = r0.get(r9)     // Catch:{ all -> 0x019b }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x019b }
            java.lang.String r3 = ".msg.appmsg.refermsg.svrid"
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0198 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0198 }
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r0)     // Catch:{ all -> 0x0198 }
            eb0.c r0 = eb0.C97625j3.m125812b()     // Catch:{ all -> 0x0198 }
            g62.l r0 = r0.mo105911z()     // Catch:{ all -> 0x0198 }
            java.lang.String r3 = r2.mo108768t()     // Catch:{ all -> 0x0198 }
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0     // Catch:{ all -> 0x0198 }
            com.tencent.mm.storage.f4 r0 = r0.h30(r3, r9)     // Catch:{ all -> 0x0198 }
            r3 = r0
            goto L_0x01e0
        L_0x0198:
            r0 = move-exception
            r3 = r8
            goto L_0x019c
        L_0x019b:
            r0 = move-exception
        L_0x019c:
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r9 = "parse quate sys err"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r9, r8)
            goto L_0x01de
        L_0x01a4:
            r0 = 805306417(0x30000031, float:4.65664E-10)
            if (r8 != r0) goto L_0x01c0
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r3, r10, r4)     // Catch:{ all -> 0x01b7 }
            if (r0 == 0) goto L_0x01de
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x01b7 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x01b7 }
            r3 = r0
            goto L_0x01de
        L_0x01b7:
            r0 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r9 = "parse err"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r9, r8)
            goto L_0x01de
        L_0x01c0:
            r0 = 1107296305(0x42000031, float:32.000187)
            if (r8 != r0) goto L_0x01de
            java.lang.Class<vh0.b> r0 = vh0.C78415b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            vh0.b r0 = (vh0.C78415b) r0
            ck3.b r1 = r14.f215752d
            android.app.Activity r1 = r1.mo91565f()
            ck3.b r2 = r14.f215752d
            java.lang.String r2 = r2.mo91577r()
            r0.mo94221az(r1, r2, r3, r6)
            goto L_0x033d
        L_0x01de:
            r8 = r3
            r3 = r4
        L_0x01e0:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r9 = 15037(0x3abd, float:2.1071E-41)
            java.lang.Object[] r10 = new java.lang.Object[r6]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            r10[r7] = r11
            r0.mo160131h(r9, r10)
            ck3.b r0 = r14.f215752d
            java.lang.Class<zj3.w> r9 = zj3.C79387w.class
            com.tencent.mm.ui.chatting.manager.a r0 = r0.f193278b
            xi.d r0 = r0.mo102812a(r9)
            r9 = r0
            zj3.w r9 = (zj3.C79387w) r9
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r9.mo102193k1()
            com.tencent.mm.pluginsdk.ui.chat.VoiceInputPanel r10 = r0.f211873g
            if (r10 == 0) goto L_0x020f
            boolean r10 = r10.isShown()
            if (r10 == 0) goto L_0x020f
            com.tencent.mm.pluginsdk.ui.chat.VoiceInputPanel r0 = r0.f211873g
            r0.mo25275e()
        L_0x020f:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r9.mo102193k1()
            r0.mo100503x0(r6)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r9.mo102193k1()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r9.mo102193k1()
            java.lang.String r10 = r10.getLastText()
            r6.append(r10)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            r0.setLastText(r6)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r6 = r9.mo102193k1()
            if (r2 == 0) goto L_0x02d3
            if (r6 != 0) goto L_0x023e
            goto L_0x02d3
        L_0x023e:
            java.lang.String r1 = r1.f91640o
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0248
            goto L_0x02d3
        L_0x0248:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0253 }
            byte[] r8 = android.util.Base64.decode(r1, r7)     // Catch:{ all -> 0x0253 }
            r0.<init>(r8)     // Catch:{ all -> 0x0253 }
            r1 = r0
            goto L_0x025b
        L_0x0253:
            r0 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r10 = "parse msgSourceStr err"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r10, r8)
        L_0x025b:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r0 != 0) goto L_0x02d3
            java.lang.String r0 = "msgsource"
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r1, r0, r4)
            if (r0 != 0) goto L_0x026a
            goto L_0x02d3
        L_0x026a:
            java.lang.String r1 = ".msgsource.atuserlist"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x02d3
            java.lang.String r1 = ","
            java.lang.String[] r0 = r0.split(r1)
            if (r0 == 0) goto L_0x02d3
            int r1 = r0.length
            if (r1 <= 0) goto L_0x02d3
            eb0.c r1 = eb0.C97625j3.m125812b()
            eb0.m2 r1 = r1.mo105902q()
            java.lang.String r5 = r2.mo108768t()
            com.tencent.mm.storage.n1 r1 = (com.tencent.p014mm.storage.C44662n1) r1
            com.tencent.mm.storage.m1 r1 = r1.mo69799Lo(r5)
            int r5 = r0.length
        L_0x0296:
            if (r7 >= r5) goto L_0x02d3
            r8 = r0[r7]
            boolean r10 = android.text.TextUtils.isEmpty(r8)
            if (r10 == 0) goto L_0x02a1
            goto L_0x02d0
        L_0x02a1:
            int r10 = com.tencent.p014mm.p136ui.chatting.AtSomeoneUI.f121496q
            if (r1 != 0) goto L_0x02a7
            r10 = r4
            goto L_0x02ab
        L_0x02a7:
            java.lang.String r10 = r1.mo69789q2(r8)
        L_0x02ab:
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r11 == 0) goto L_0x02c3
            eb0.c r11 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r11 = r11.mo105907v()
            com.tencent.mm.storage.z1 r11 = r11.mo69664N2(r8)
            if (r11 == 0) goto L_0x02c3
            java.lang.String r10 = r11.mo62909j3()
        L_0x02c3:
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L_0x02d0
            java.lang.String r11 = r2.mo108768t()
            r6.mo100443p(r11, r8, r10)
        L_0x02d0:
            int r7 = r7 + 1
            goto L_0x0296
        L_0x02d3:
            if (r3 == 0) goto L_0x02dc
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r9.mo102193k1()
            r0.mo100343C(r3)
        L_0x02dc:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r9.mo102193k1()
            boolean r0 = r0.f211917p1
            if (r0 != 0) goto L_0x033d
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r9.mo102193k1()
            r0.mo100377T0()
            goto L_0x033d
        L_0x02ec:
            boolean r0 = r1 instanceof eb0.C31494n4
            if (r0 == 0) goto L_0x02fe
            ck3.b r0 = r14.f215752d
            com.tencent.mm.ui.chatting.manager.a r0 = r0.f193278b
            xi.d r0 = r0.mo102812a(r2)
            zj3.e r0 = (zj3.C79348e) r0
            r0.mo70077t1()
            goto L_0x033d
        L_0x02fe:
            boolean r0 = r1 instanceof eb0.C31528x
            if (r0 == 0) goto L_0x0310
            ck3.b r0 = r14.f215752d
            com.tencent.mm.ui.chatting.manager.a r0 = r0.f193278b
            xi.d r0 = r0.mo102812a(r2)
            zj3.e r0 = (zj3.C79348e) r0
            r0.mo70064d4()
            goto L_0x033d
        L_0x0310:
            boolean r0 = r1 instanceof le0.C34232b
            if (r0 == 0) goto L_0x0336
            r0 = r1
            le0.b r0 = (le0.C34232b) r0
            if (r20 != 0) goto L_0x033d
            java.lang.String r2 = r0.f92303t
            java.lang.String r3 = r0.f92304u
            java.lang.String r4 = r0.f92305v
            java.lang.String r5 = r0.f92306w
            java.lang.String r6 = r0.f92295l
            java.lang.String r7 = r0.f92296m
            java.util.LinkedList<java.lang.String> r8 = r0.f92298o
            java.util.LinkedList<java.lang.String> r9 = r0.f92299p
            java.util.LinkedList<java.lang.String> r10 = r0.f92300q
            java.util.LinkedList<java.lang.String> r11 = r0.f92301r
            java.util.LinkedList<java.lang.String> r12 = r0.f92302s
            r1 = r15
            r13 = r17
            r1.mo102562Y5(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x033d
        L_0x0336:
            boolean r0 = r1 instanceof le0.C34233c
            if (r0 == 0) goto L_0x033d
            r0 = r1
            le0.c r0 = (le0.C34233c) r0
        L_0x033d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.C73572p3.mo60786y5(android.view.View, com.tencent.mm.storage.f4, int, sc0.a, int):void");
    }
}
