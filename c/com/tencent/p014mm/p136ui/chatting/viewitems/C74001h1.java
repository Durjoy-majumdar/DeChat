package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ck3.C39969i;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent;
import com.tencent.p014mm.lan_cs.SmartServer;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C68075o;
import com.tencent.p014mm.modelstat.C68144a;
import com.tencent.p014mm.p136ui.MMImageView;
import com.tencent.p014mm.p136ui.chatting.C73745l4;
import com.tencent.p014mm.p136ui.chatting.C73764n3;
import com.tencent.p014mm.p136ui.chatting.C73774p2;
import com.tencent.p014mm.p136ui.chatting.C74343y0;
import com.tencent.p014mm.p136ui.chatting.component.C73521l0;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74244u;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.p136ui.widget.progress.RoundProgressBtn;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.pluginsdk.model.file.FileSmartServerMgr;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.p134kt.CommonKt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C75569c4;
import eb0.C75592q0;
import eb0.C75604z3;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C8480h;
import gy3.C87412m;
import i21.C98591h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import jd3.C76404b;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76874e0;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C47355o;
import p206nj.C76861g;
import p556hw.C76247e;
import p763ym.C79138l;
import qg2.C77335p;
import rb0.C47984k;
import rx3.C13598b0;
import u73.C90621r0;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.h1 */
public final class C74001h1 {

    /* renamed from: a */
    public static final C74013d f217129a = new C74013d((C8480h) null);

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.h1$a */
    public static final class C74002a extends C74023i.C74026c {

        /* renamed from: b */
        public MMImageView f217130b;

        /* renamed from: c */
        public LinearLayout f217131c;

        /* renamed from: d */
        public ImageView f217132d;

        /* renamed from: e */
        public TextView f217133e;

        /* renamed from: f */
        public ImageView f217134f;

        /* renamed from: g */
        public TextView f217135g;

        /* renamed from: h */
        public ImageView f217136h;

        /* renamed from: i */
        public ImageView f217137i;

        /* renamed from: j */
        public ImageView f217138j;

        /* renamed from: k */
        public LinearLayout f217139k;

        /* renamed from: l */
        public MMNeat7extView f217140l;

        /* renamed from: m */
        public TextView f217141m;

        /* renamed from: n */
        public TextView f217142n;

        /* renamed from: o */
        public RelativeLayout f217143o;

        /* renamed from: p */
        public RoundProgressBtn f217144p;

        /* renamed from: q */
        public ImageView f217145q;

        /* renamed from: r */
        public ImageView f217146r;

        /* renamed from: s */
        public LinearLayout f217147s;

        /* renamed from: t */
        public ProgressBar f217148t;

        /* renamed from: u */
        public int f217149u;

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.h1$a$a */
        public static final class C74003a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C72963f4 f217150d;

            public C74003a(C72963f4 f4Var) {
                this.f217150d = f4Var;
            }

            public final void run() {
                Class cls = C75700k0.class;
                C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(this.f217150d.getMsgId());
                b002.mo108734N2(2);
                ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(this.f217150d.getMsgId(), b002);
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.h1$a$b */
        public static final class C74004b implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C72963f4 f217151d;

            /* renamed from: e */
            public final /* synthetic */ C72683d f217152e;

            /* renamed from: f */
            public final /* synthetic */ C74002a f217153f;

            /* renamed from: g */
            public final /* synthetic */ String f217154g;

            /* renamed from: h */
            public final /* synthetic */ String f217155h;

            /* renamed from: i */
            public final /* synthetic */ C68070l.C68072b f217156i;

            public C74004b(C72963f4 f4Var, C72683d dVar, C74002a aVar, String str, String str2, C68070l.C68072b bVar) {
                this.f217151d = f4Var;
                this.f217152e = dVar;
                this.f217153f = aVar;
                this.f217154g = str;
                this.f217155h = str2;
                this.f217156i = bVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:33:0x00f2  */
            /* JADX WARNING: Removed duplicated region for block: B:34:0x00f4  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onClick(android.view.View r26) {
                /*
                    r25 = this;
                    r6 = r25
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    r1 = r26
                    r0.add(r1)
                    java.lang.Object[] r5 = r0.toArray()
                    r0.clear()
                    java.lang.String r0 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFile$AppMsgFileViewHolder$showIconArea$2$1"
                    java.lang.String r1 = "android/view/View$OnClickListener"
                    java.lang.String r2 = "onClick"
                    java.lang.String r3 = "(Landroid/view/View;)V"
                    r4 = r25
                    j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "progressPB(msgId:"
                    r0.append(r1)
                    com.tencent.mm.storage.f4 r1 = r6.f217151d
                    long r1 = r1.getMsgId()
                    r0.append(r1)
                    java.lang.String r1 = ") click, status:"
                    r0.append(r1)
                    com.tencent.mm.pluginsdk.model.app.d r1 = r6.f217152e
                    long r1 = r1.field_status
                    r0.append(r1)
                    java.lang.String r1 = ", progressPB:"
                    r0.append(r1)
                    com.tencent.mm.ui.chatting.viewitems.h1$a r1 = r6.f217153f
                    com.tencent.mm.ui.widget.progress.RoundProgressBtn r1 = r1.f217144p
                    if (r1 == 0) goto L_0x0053
                    int r1 = r1.getVisibility()
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    goto L_0x0054
                L_0x0053:
                    r1 = 0
                L_0x0054:
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    java.lang.String r1 = "MicroMsg.ChattingItemAppMsgFile"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                    com.tencent.mm.ui.chatting.viewitems.h1$a r0 = r6.f217153f
                    com.tencent.mm.ui.widget.progress.RoundProgressBtn r0 = r0.f217144p
                    r2 = 1
                    r3 = 0
                    if (r0 == 0) goto L_0x0070
                    int r0 = r0.getVisibility()
                    if (r0 != 0) goto L_0x0070
                    r0 = 1
                    goto L_0x0071
                L_0x0070:
                    r0 = 0
                L_0x0071:
                    java.lang.String r4 = "(Landroid/view/View;)V"
                    java.lang.String r5 = "onClick"
                    java.lang.String r7 = "android/view/View$OnClickListener"
                    java.lang.String r8 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFile$AppMsgFileViewHolder$showIconArea$2$1"
                    if (r0 != 0) goto L_0x007f
                    j20.C117292a.m165361g(r6, r8, r7, r5, r4)
                    return
                L_0x007f:
                    com.tencent.mm.storage.f4 r0 = r6.f217151d
                    int r9 = r0.f230742Z
                    r10 = 3
                    if (r9 == r10) goto L_0x0196
                    r11 = 4
                    if (r9 == r11) goto L_0x01ca
                    com.tencent.mm.pluginsdk.model.app.d r9 = r6.f217152e
                    long r12 = r9.field_status
                    r14 = 102(0x66, double:5.04E-322)
                    int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                    if (r9 != 0) goto L_0x009c
                    com.tencent.mm.ui.chatting.viewitems.h1$a r1 = r6.f217153f
                    java.lang.String r2 = r6.f217154g
                    com.tencent.p014mm.p136ui.chatting.viewitems.C74001h1.C74002a.m87825a(r1, r0, r2)
                    goto L_0x01ca
                L_0x009c:
                    long r12 = r0.getMsgId()
                    com.tencent.mm.storage.f4 r0 = r6.f217151d
                    java.lang.String r0 = r0.mo108768t()
                    java.lang.String r9 = r6.f217155h
                    com.tencent.p014mm.pluginsdk.model.app.C72695v.m85077s(r12, r0, r9)
                    jd3.b r0 = jd3.C76404b.f223715a
                    com.tencent.mm.storage.f4 r9 = r6.f217151d
                    r0.mo106627a(r9)
                    com.tencent.mm.ui.chatting.viewitems.h1$a r0 = r6.f217153f
                    com.tencent.mm.storage.f4 r9 = r6.f217151d
                    com.tencent.mm.message.l$b r12 = r6.f217156i
                    r13 = 15
                    r0.getClass()
                    int r0 = r12.f195582i
                    r14 = 6
                    if (r14 == r0) goto L_0x00c6
                    r15 = 74
                    if (r15 != r0) goto L_0x01ca
                L_0x00c6:
                    long r15 = r9.mo108774y2()
                    java.lang.Class<t90.b> r0 = t90.C77878b.class
                    com.tencent.mm.message.g r0 = r12.mo93555w(r0)
                    t90.b r0 = (t90.C77878b) r0
                    r17 = r15
                    if (r0 == 0) goto L_0x00e0
                    long r14 = r0.f226901b
                    r19 = 0
                    int r0 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
                    if (r0 == 0) goto L_0x00e0
                    r15 = r14
                    goto L_0x00e2
                L_0x00e0:
                    r15 = r17
                L_0x00e2:
                    r0 = 13
                    java.lang.Object[] r14 = new java.lang.Object[r0]
                    java.lang.String r0 = r12.f195500J
                    r14[r3] = r0
                    int r0 = r12.f195626t
                    r18 = 7
                    r19 = 5
                    if (r0 != r2) goto L_0x00f4
                    r0 = 7
                    goto L_0x00f5
                L_0x00f4:
                    r0 = 5
                L_0x00f5:
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    r14[r2] = r0
                    r0 = 2
                    int r3 = r12.f195594l
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    r14[r0] = r3
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
                    r14[r10] = r0
                    long r21 = eb0.C31543z5.m39453c()
                    long r23 = r9.getCreateTime()
                    long r21 = r21 - r23
                    r0 = 1000(0x3e8, float:1.401E-42)
                    long r2 = (long) r0
                    long r21 = r21 / r2
                    java.lang.Long r0 = java.lang.Long.valueOf(r21)
                    r14[r11] = r0
                    java.lang.String r0 = r12.f195602n
                    java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
                    java.lang.String r2 = "nullAsNil(appmsgContent.fileext)"
                    gy3.C87412m.m108593f(r0, r2)
                    java.lang.String r0 = r0.toLowerCase()
                    java.lang.String r2 = "this as java.lang.String).toLowerCase()"
                    gy3.C87412m.m108593f(r0, r2)
                    r14[r19] = r0
                    java.lang.String r0 = r9.mo108768t()
                    r2 = 6
                    r14[r2] = r0
                    r0 = 1
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
                    r14[r18] = r2
                    r0 = 8
                    java.lang.String r2 = ""
                    r14[r0] = r2
                    r0 = 9
                    java.lang.Long r2 = java.lang.Long.valueOf(r15)
                    r14[r0] = r2
                    r0 = 10
                    long r2 = r9.getCreateTime()
                    java.lang.Long r2 = java.lang.Long.valueOf(r2)
                    r14[r0] = r2
                    r0 = 11
                    long r2 = eb0.C31543z5.m39451a()
                    java.lang.Long r2 = java.lang.Long.valueOf(r2)
                    r14[r0] = r2
                    r0 = 12
                    r2 = 1
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                    r14[r0] = r3
                    r0 = 13
                    java.lang.Object[] r0 = java.util.Arrays.copyOf(r14, r0)
                    java.lang.String r3 = "%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s"
                    java.lang.String r0 = java.lang.String.format(r3, r0)
                    java.lang.String r3 = "format(format, *args)"
                    gy3.C87412m.m108593f(r0, r3)
                    java.lang.Object[] r2 = new java.lang.Object[r2]
                    r3 = 0
                    r2[r3] = r0
                    java.lang.String r3 = "reportKVStat 14665 %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r2)
                    com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                    r2 = 14665(0x3949, float:2.055E-41)
                    r1.kvStat(r2, r0)
                    goto L_0x01ca
                L_0x0196:
                    eb0.c r0 = eb0.C97625j3.m125812b()
                    g62.l r0 = r0.mo105911z()
                    com.tencent.mm.storage.f4 r1 = r6.f217151d
                    long r1 = r1.getMsgId()
                    com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
                    com.tencent.mm.storage.f4 r0 = r0.b00(r1)
                    r1 = 0
                    r0.mo108734N2(r1)
                    eb0.c r1 = eb0.C97625j3.m125812b()
                    g62.l r1 = r1.mo105911z()
                    com.tencent.mm.storage.f4 r2 = r6.f217151d
                    long r2 = r2.getMsgId()
                    com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
                    r1.xy0(r2, r0)
                    com.tencent.mm.ui.chatting.viewitems.h1$a r0 = r6.f217153f
                    com.tencent.mm.storage.f4 r1 = r6.f217151d
                    java.lang.String r2 = r6.f217154g
                    com.tencent.p014mm.p136ui.chatting.viewitems.C74001h1.C74002a.m87825a(r0, r1, r2)
                L_0x01ca:
                    j20.C117292a.m165361g(r6, r8, r7, r5, r4)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74001h1.C74002a.C74004b.onClick(android.view.View):void");
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.h1$a$c */
        public static final class C74005c implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C72963f4 f217157d;

            /* renamed from: e */
            public final /* synthetic */ C72683d f217158e;

            /* renamed from: f */
            public final /* synthetic */ C74002a f217159f;

            /* renamed from: g */
            public final /* synthetic */ String f217160g;

            /* renamed from: h */
            public final /* synthetic */ C68070l.C68072b f217161h;

            /* renamed from: i */
            public final /* synthetic */ C67391b f217162i;

            public C74005c(C72963f4 f4Var, C72683d dVar, C74002a aVar, String str, C68070l.C68072b bVar, C67391b bVar2) {
                this.f217157d = f4Var;
                this.f217158e = dVar;
                this.f217159f = aVar;
                this.f217160g = str;
                this.f217161h = bVar;
                this.f217162i = bVar2;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFile$AppMsgFileViewHolder$showIconArea$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                StringBuilder sb = new StringBuilder();
                sb.append("progressPB(msgId:");
                sb.append(this.f217157d.getMsgId());
                sb.append(") click, status:");
                sb.append(this.f217158e.field_status);
                sb.append(", progressPB:");
                RoundProgressBtn roundProgressBtn = this.f217159f.f217144p;
                C13598b0 b0Var = null;
                sb.append(roundProgressBtn != null ? Integer.valueOf(roundProgressBtn.getVisibility()) : null);
                Log.m105924i("MicroMsg.ChattingItemAppMsgFile", sb.toString());
                RoundProgressBtn roundProgressBtn2 = this.f217159f.f217144p;
                if (!(roundProgressBtn2 != null && roundProgressBtn2.getVisibility() == 0)) {
                    C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFile$AppMsgFileViewHolder$showIconArea$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                C72963f4 f4Var = this.f217157d;
                int i = f4Var.f230742Z;
                if (i != 100) {
                    if (i != 101) {
                        if (this.f217158e.field_status != 105) {
                            C72695v.m85078t(f4Var.getMsgId(), this.f217160g);
                            FileSmartServerMgr fileSmartServerMgr = FileSmartServerMgr.f211575a;
                            C72963f4 f4Var2 = this.f217157d;
                            if (f4Var2 != null) {
                                String d = fileSmartServerMgr.mo100180d(f4Var2);
                                int removeFileInfo = SmartServer.Java2C.removeFileInfo(d);
                                Log.m105924i("MicroMsg.FileSmartServerMgr", "removeFileInfo cgi:" + d + ' ' + removeFileInfo);
                                b0Var = C13598b0.f38549a;
                            }
                            if (b0Var == null) {
                                Log.m105920e("MicroMsg.FileSmartServerMgr", "removeFileInfo msgInfo is null");
                            }
                            C68070l.C68072b bVar = this.f217161h;
                            C72963f4 f4Var3 = this.f217157d;
                            if (f4Var3 != null) {
                                ((C119157j) C119157j.f356862d).mo183875f(new C97184i1(bVar, f4Var3, 2));
                            }
                        } else if (C31543z5.m39451a() - this.f217158e.field_createTime < 432000000) {
                            C72695v.m85079u(this.f217157d.getMsgId(), this.f217160g);
                            FileSmartServerMgr fileSmartServerMgr2 = FileSmartServerMgr.f211575a;
                            C72963f4 f4Var4 = this.f217157d;
                            C68070l.C68072b bVar2 = this.f217161h;
                            if (f4Var4 != null) {
                                ((C119157j) C119157j.f356862d).mo183875f(new C97184i1(bVar2, f4Var4, 4));
                            }
                        } else {
                            C72695v.m85056I(this.f217162i, this.f217157d, C0966R.string.a0o, this.f217161h);
                        }
                    }
                } else if (C31543z5.m39451a() - this.f217158e.field_createTime < 432000000) {
                    C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(this.f217157d.getMsgId());
                    b002.mo108734N2(0);
                    ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(this.f217157d.getMsgId(), b002);
                    long msgId = this.f217157d.getMsgId();
                    String str = this.f217160g;
                    C72683d Yt = C72709y1.vx0().mo100150Yt(msgId);
                    if (Yt == null) {
                        Log.m105920e("MicroMsg.AppMsgLogic", "ERR:" + C76861g.m92660c() + " getinfo failed: " + str);
                    } else if (Yt.field_status != 198) {
                        Log.m105920e("MicroMsg.AppMsgLogic", "ERR:" + C76861g.m92660c() + " get status failed: " + str + " status:" + Yt.field_status);
                    } else {
                        Yt.field_status = 101;
                        Yt.field_lastModifyTime = Util.nowSecond();
                        C72709y1.vx0().update(Yt, new String[0]);
                        C72709y1.zx0().mo100171d();
                    }
                    FileSmartServerMgr fileSmartServerMgr3 = FileSmartServerMgr.f211575a;
                    C68070l.C68072b bVar3 = this.f217161h;
                    C72963f4 f4Var5 = this.f217157d;
                    if (f4Var5 != null) {
                        ((C119157j) C119157j.f356862d).mo183875f(new C97184i1(bVar3, f4Var5, 4));
                    }
                } else {
                    C72695v.m85056I(this.f217162i, this.f217157d, C0966R.string.a0n, this.f217161h);
                }
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFile$AppMsgFileViewHolder$showIconArea$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.h1$a$d */
        public static final class C74006d implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f217163d;

            /* renamed from: e */
            public final /* synthetic */ int f217164e;

            /* renamed from: f */
            public final /* synthetic */ C74002a f217165f;

            /* renamed from: com.tencent.mm.ui.chatting.viewitems.h1$a$d$a */
            public static final class C74007a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ int f217166d;

                /* renamed from: e */
                public final /* synthetic */ int f217167e;

                /* renamed from: f */
                public final /* synthetic */ C74002a f217168f;

                public C74007a(int i, int i2, C74002a aVar) {
                    this.f217166d = i;
                    this.f217167e = i2;
                    this.f217168f = aVar;
                }

                public final void run() {
                    int i = this.f217166d;
                    if (i == -1 || i >= 100 || this.f217167e <= 0) {
                        RoundProgressBtn roundProgressBtn = this.f217168f.f217144p;
                        if (roundProgressBtn != null) {
                            roundProgressBtn.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    RoundProgressBtn roundProgressBtn2 = this.f217168f.f217144p;
                    if (roundProgressBtn2 != null) {
                        roundProgressBtn2.setVisibility(0);
                    }
                    RoundProgressBtn roundProgressBtn3 = this.f217168f.f217144p;
                    if (roundProgressBtn3 != null) {
                        roundProgressBtn3.setProgress(this.f217166d);
                    }
                }
            }

            public C74006d(String str, int i, C74002a aVar) {
                this.f217163d = str;
                this.f217164e = i;
                this.f217165f = aVar;
            }

            public final void run() {
                int m = C72695v.m85071m(this.f217163d);
                ((C119157j) C119157j.f356862d).mo183895z(new C74007a(m, this.f217164e, this.f217165f));
            }
        }

        /* renamed from: a */
        public static final void m87825a(C74002a aVar, C72963f4 f4Var, String str) {
            aVar.getClass();
            C72683d Yt = C72709y1.vx0().mo100150Yt(f4Var.getMsgId());
            if (Yt != null) {
                Yt.field_status = 101;
                Yt.field_lastModifyTime = Util.nowSecond();
                C72709y1.vx0().update(Yt, new String[0]);
                C97625j3.m125815e().mo123460f(new C77335p(f4Var.getMsgId(), str, (C47355o) null));
                C76404b.f223715a.mo106629c(f4Var, C68070l.C68072b.m80422u(f4Var.getContent(), (String) null));
            }
        }

        /* JADX WARNING: type inference failed for: r5v1, types: [android.view.View] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.tencent.p014mm.p136ui.chatting.viewitems.C74001h1.C74002a mo103053b(android.view.View r5, boolean r6) {
            /*
                r4 = this;
                java.lang.String r0 = "view"
                gy3.C87412m.m108594g(r5, r0)
                super.create(r5)
                r0 = 2131299150(0x7f090b4e, float:1.8216293E38)
                android.view.View r0 = r5.findViewById(r0)
                boolean r1 = r0 instanceof android.widget.LinearLayout
                r2 = 0
                if (r1 == 0) goto L_0x0018
                android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
                goto L_0x0019
            L_0x0018:
                r0 = r2
            L_0x0019:
                r4.f217131c = r0
                r0 = 2131299151(0x7f090b4f, float:1.8216295E38)
                android.view.View r0 = r5.findViewById(r0)
                boolean r1 = r0 instanceof android.widget.ImageView
                if (r1 == 0) goto L_0x0029
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                goto L_0x002a
            L_0x0029:
                r0 = r2
            L_0x002a:
                r4.f217132d = r0
                r0 = 2131299154(0x7f090b52, float:1.8216301E38)
                android.view.View r0 = r5.findViewById(r0)
                boolean r1 = r0 instanceof android.widget.TextView
                if (r1 == 0) goto L_0x003a
                android.widget.TextView r0 = (android.widget.TextView) r0
                goto L_0x003b
            L_0x003a:
                r0 = r2
            L_0x003b:
                r4.f217133e = r0
                r0 = 2131299152(0x7f090b50, float:1.8216297E38)
                android.view.View r0 = r5.findViewById(r0)
                boolean r1 = r0 instanceof android.widget.ImageView
                if (r1 == 0) goto L_0x004b
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                goto L_0x004c
            L_0x004b:
                r0 = r2
            L_0x004c:
                r4.f217134f = r0
                r0 = 2131299153(0x7f090b51, float:1.82163E38)
                android.view.View r0 = r5.findViewById(r0)
                boolean r1 = r0 instanceof android.widget.TextView
                if (r1 == 0) goto L_0x005c
                android.widget.TextView r0 = (android.widget.TextView) r0
                goto L_0x005d
            L_0x005c:
                r0 = r2
            L_0x005d:
                r4.f217135g = r0
                r0 = 2131299155(0x7f090b53, float:1.8216303E38)
                android.view.View r0 = r5.findViewById(r0)
                boolean r1 = r0 instanceof android.widget.ImageView
                if (r1 == 0) goto L_0x006d
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                goto L_0x006e
            L_0x006d:
                r0 = r2
            L_0x006e:
                r4.f217136h = r0
                r0 = 2131299157(0x7f090b55, float:1.8216307E38)
                android.view.View r0 = r5.findViewById(r0)
                boolean r1 = r0 instanceof com.tencent.p014mm.p136ui.MMImageView
                if (r1 == 0) goto L_0x007e
                com.tencent.mm.ui.MMImageView r0 = (com.tencent.p014mm.p136ui.MMImageView) r0
                goto L_0x007f
            L_0x007e:
                r0 = r2
            L_0x007f:
                r4.f217130b = r0
                r0 = 2131315985(0x7f094d11, float:1.8250439E38)
                android.view.View r1 = r5.findViewById(r0)
                boolean r3 = r1 instanceof android.widget.ProgressBar
                if (r3 == 0) goto L_0x008f
                android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
                goto L_0x0090
            L_0x008f:
                r1 = r2
            L_0x0090:
                r4.uploadingPB = r1
                r1 = 2131299421(0x7f090c5d, float:1.8216843E38)
                android.view.View r1 = r5.findViewById(r1)
                boolean r3 = r1 instanceof android.widget.ImageView
                if (r3 == 0) goto L_0x00a0
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                goto L_0x00a1
            L_0x00a0:
                r1 = r2
            L_0x00a1:
                r4.stateIV = r1
                r1 = 2131299436(0x7f090c6c, float:1.8216873E38)
                android.view.View r1 = r5.findViewById(r1)
                boolean r3 = r1 instanceof android.widget.TextView
                if (r3 == 0) goto L_0x00b1
                android.widget.TextView r1 = (android.widget.TextView) r1
                goto L_0x00b2
            L_0x00b1:
                r1 = r2
            L_0x00b2:
                r4.userTV = r1
                r1 = 2131299181(0x7f090b6d, float:1.8216356E38)
                android.view.View r1 = r5.findViewById(r1)
                boolean r3 = r1 instanceof android.widget.CheckBox
                if (r3 == 0) goto L_0x00c2
                android.widget.CheckBox r1 = (android.widget.CheckBox) r1
                goto L_0x00c3
            L_0x00c2:
                r1 = r2
            L_0x00c3:
                r4.checkBox = r1
                r1 = 2131299360(0x7f090c20, float:1.821672E38)
                android.view.View r1 = r5.findViewById(r1)
                r4.maskView = r1
                if (r6 != 0) goto L_0x00ef
                android.view.View r6 = r4.convertView
                r1 = 2131299423(0x7f090c5f, float:1.8216847E38)
                android.view.View r6 = r6.findViewById(r1)
                boolean r1 = r6 instanceof android.widget.ImageView
                if (r1 == 0) goto L_0x00df
                android.widget.ImageView r6 = (android.widget.ImageView) r6
            L_0x00df:
                android.view.View r6 = r4.convertView
                android.view.View r6 = r6.findViewById(r0)
                boolean r0 = r6 instanceof android.widget.ProgressBar
                if (r0 == 0) goto L_0x00ec
                android.widget.ProgressBar r6 = (android.widget.ProgressBar) r6
                goto L_0x00ed
            L_0x00ec:
                r6 = r2
            L_0x00ed:
                r4.uploadingPB = r6
            L_0x00ef:
                android.view.View r6 = r4.convertView
                r0 = 2131299424(0x7f090c60, float:1.821685E38)
                android.view.View r6 = r6.findViewById(r0)
                boolean r0 = r6 instanceof android.widget.ImageView
                if (r0 == 0) goto L_0x00ff
                android.widget.ImageView r6 = (android.widget.ImageView) r6
                goto L_0x0100
            L_0x00ff:
                r6 = r2
            L_0x0100:
                r4.f217137i = r6
                android.view.View r6 = r4.convertView
                r0 = 2131299192(0x7f090b78, float:1.8216378E38)
                android.view.View r6 = r6.findViewById(r0)
                boolean r0 = r6 instanceof android.widget.ImageView
                if (r0 == 0) goto L_0x0112
                android.widget.ImageView r6 = (android.widget.ImageView) r6
                goto L_0x0113
            L_0x0112:
                r6 = r2
            L_0x0113:
                r4.f217138j = r6
                r6 = 2131299182(0x7f090b6e, float:1.8216358E38)
                android.view.View r6 = r5.findViewById(r6)
                boolean r0 = r6 instanceof android.widget.FrameLayout
                if (r0 == 0) goto L_0x0123
                android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
                goto L_0x0124
            L_0x0123:
                r6 = r2
            L_0x0124:
                r4.clickArea = r6
                r6 = 2131299124(0x7f090b34, float:1.821624E38)
                android.view.View r6 = r5.findViewById(r6)
                boolean r0 = r6 instanceof android.widget.LinearLayout
                if (r0 == 0) goto L_0x0134
                android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
                goto L_0x0135
            L_0x0134:
                r6 = r2
            L_0x0135:
                r4.f217139k = r6
                r6 = 2131299159(0x7f090b57, float:1.8216312E38)
                android.view.View r6 = r5.findViewById(r6)
                boolean r0 = r6 instanceof com.tencent.p014mm.p136ui.widget.MMNeat7extView
                if (r0 == 0) goto L_0x0145
                com.tencent.mm.ui.widget.MMNeat7extView r6 = (com.tencent.p014mm.p136ui.widget.MMNeat7extView) r6
                goto L_0x0146
            L_0x0145:
                r6 = r2
            L_0x0146:
                r4.f217140l = r6
                r6 = 2131299127(0x7f090b37, float:1.8216247E38)
                android.view.View r6 = r5.findViewById(r6)
                boolean r0 = r6 instanceof android.widget.TextView
                if (r0 == 0) goto L_0x0156
                android.widget.TextView r6 = (android.widget.TextView) r6
                goto L_0x0157
            L_0x0156:
                r6 = r2
            L_0x0157:
                r4.f217141m = r6
                r6 = 2131299126(0x7f090b36, float:1.8216245E38)
                android.view.View r6 = r5.findViewById(r6)
                boolean r0 = r6 instanceof android.widget.TextView
                if (r0 == 0) goto L_0x0167
                android.widget.TextView r6 = (android.widget.TextView) r6
                goto L_0x0168
            L_0x0167:
                r6 = r2
            L_0x0168:
                r4.f217142n = r6
                r6 = 2131299156(0x7f090b54, float:1.8216305E38)
                android.view.View r6 = r5.findViewById(r6)
                boolean r0 = r6 instanceof android.widget.RelativeLayout
                if (r0 == 0) goto L_0x0178
                android.widget.RelativeLayout r6 = (android.widget.RelativeLayout) r6
                goto L_0x0179
            L_0x0178:
                r6 = r2
            L_0x0179:
                r4.f217143o = r6
                r6 = 2131299208(0x7f090b88, float:1.821641E38)
                android.view.View r6 = r5.findViewById(r6)
                boolean r0 = r6 instanceof com.tencent.p014mm.p136ui.widget.progress.RoundProgressBtn
                if (r0 == 0) goto L_0x0189
                com.tencent.mm.ui.widget.progress.RoundProgressBtn r6 = (com.tencent.p014mm.p136ui.widget.progress.RoundProgressBtn) r6
                goto L_0x018a
            L_0x0189:
                r6 = r2
            L_0x018a:
                r4.f217144p = r6
                android.view.View r6 = r4.convertView
                r0 = 2131299207(0x7f090b87, float:1.8216409E38)
                android.view.View r6 = r6.findViewById(r0)
                boolean r0 = r6 instanceof android.widget.ImageView
                if (r0 == 0) goto L_0x019c
                android.widget.ImageView r6 = (android.widget.ImageView) r6
                goto L_0x019d
            L_0x019c:
                r6 = r2
            L_0x019d:
                r4.f217145q = r6
                r6 = 2131299138(0x7f090b42, float:1.8216269E38)
                android.view.View r6 = r5.findViewById(r6)
                boolean r0 = r6 instanceof android.widget.ImageView
                if (r0 == 0) goto L_0x01ad
                android.widget.ImageView r6 = (android.widget.ImageView) r6
                goto L_0x01ae
            L_0x01ad:
                r6 = r2
            L_0x01ae:
                r4.f217146r = r6
                r6 = 2131297209(0x7f0903b9, float:1.8212356E38)
                android.view.View r6 = r5.findViewById(r6)
                boolean r0 = r6 instanceof android.widget.LinearLayout
                if (r0 == 0) goto L_0x01be
                android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
                goto L_0x01bf
            L_0x01be:
                r6 = r2
            L_0x01bf:
                r4.f217147s = r6
                r6 = 2131309546(0x7f0933ea, float:1.8237379E38)
                android.view.View r6 = r5.findViewById(r6)
                android.widget.ImageView r6 = (android.widget.ImageView) r6
                r6 = 2131311863(0x7f093cf7, float:1.8242078E38)
                android.view.View r5 = r5.findViewById(r6)
                boolean r6 = r5 instanceof android.widget.ProgressBar
                if (r6 == 0) goto L_0x01d8
                r2 = r5
                android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            L_0x01d8:
                r4.f217148t = r2
                android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                int r5 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.m87885l(r5)
                r4.f217149u = r5
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74001h1.C74002a.mo103053b(android.view.View, boolean):com.tencent.mm.ui.chatting.viewitems.h1$a");
        }

        /* JADX WARNING: Removed duplicated region for block: B:105:0x01a0  */
        /* JADX WARNING: Removed duplicated region for block: B:106:0x01bd  */
        /* JADX WARNING: Removed duplicated region for block: B:172:0x0294  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo103054c(ck3.C67391b r21, com.tencent.p014mm.message.C68070l.C68072b r22, com.tencent.p014mm.storage.C72963f4 r23, boolean r24, java.lang.String r25, java.lang.String r26) {
            /*
                r20 = this;
                r7 = r20
                r8 = r22
                r9 = r23
                r10 = r24
                java.lang.Class<wm.f> r11 = p262wm.C22923f.class
                java.lang.String r0 = "ui"
                r6 = r21
                gy3.C87412m.m108594g(r6, r0)
                java.lang.String r0 = "content"
                gy3.C87412m.m108594g(r8, r0)
                java.lang.String r0 = "msg"
                gy3.C87412m.m108594g(r9, r0)
                com.tencent.mm.ui.widget.progress.RoundProgressBtn r0 = r7.f217144p
                r12 = 8
                if (r0 != 0) goto L_0x0023
                goto L_0x0026
            L_0x0023:
                r0.setVisibility(r12)
            L_0x0026:
                android.widget.ImageView r0 = r7.f217146r
                if (r0 != 0) goto L_0x002b
                goto L_0x002e
            L_0x002b:
                r0.setVisibility(r12)
            L_0x002e:
                android.widget.TextView r0 = r7.f217142n
                if (r0 != 0) goto L_0x0033
                goto L_0x0036
            L_0x0033:
                r0.setVisibility(r12)
            L_0x0036:
                android.widget.ProgressBar r0 = r7.f217148t
                if (r0 != 0) goto L_0x003b
                goto L_0x003e
            L_0x003b:
                r0.setVisibility(r12)
            L_0x003e:
                int r0 = r8.f195582i
                r1 = 74
                java.lang.String r13 = "showIconArea msgId:"
                java.lang.String r14 = " fileStatus:"
                java.lang.String r15 = "MicroMsg.ChattingItemAppMsgFile"
                r2 = 2
                r3 = 1
                r5 = 0
                if (r0 != r1) goto L_0x00ab
                int r0 = r9.f230742Z
                if (r0 == r2) goto L_0x0071
                long r0 = eb0.C31543z5.m39451a()
                long r16 = r23.getCreateTime()
                long r0 = r0 - r16
                r16 = 432000000(0x19bfcc00, double:2.13436359E-315)
                int r4 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
                if (r4 <= 0) goto L_0x0071
                r9.mo108734N2(r2)
                zt3.t r0 = zt3.C119157j.f356862d
                com.tencent.mm.ui.chatting.viewitems.h1$a$a r1 = new com.tencent.mm.ui.chatting.viewitems.h1$a$a
                r1.<init>(r9)
                zt3.j r0 = (zt3.C119157j) r0
                r0.mo183875f(r1)
            L_0x0071:
                int r0 = r9.f230742Z
                if (r0 == r3) goto L_0x007c
                if (r0 == r2) goto L_0x007a
                r0 = 1
                r3 = 0
                goto L_0x0085
            L_0x007a:
                r0 = 1
                goto L_0x0085
            L_0x007c:
                android.widget.ProgressBar r0 = r7.f217148t
                if (r0 != 0) goto L_0x0081
                goto L_0x0084
            L_0x0081:
                r0.setVisibility(r5)
            L_0x0084:
                r0 = 0
            L_0x0085:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "showIconArea(UPLOADING) msgId:"
                r1.append(r2)
                long r5 = r23.getMsgId()
                r1.append(r5)
                r1.append(r14)
                int r2 = r9.f230742Z
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r1)
                r5 = r3
                r19 = r11
                r3 = r0
                goto L_0x02ec
            L_0x00ab:
                r1 = 6
                if (r0 != r1) goto L_0x02e7
                com.tencent.mm.pluginsdk.model.app.e r0 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.vx0()
                long r4 = r23.getMsgId()
                com.tencent.mm.pluginsdk.model.app.d r5 = r0.mo100150Yt(r4)
                if (r5 == 0) goto L_0x02e7
                int r0 = r9.f230741Y
                r17 = 101(0x65, double:5.0E-322)
                if (r0 != r3) goto L_0x01c2
                int r0 = r9.f230742Z
                r1 = 3
                if (r0 == r1) goto L_0x015c
                r1 = 4
                if (r0 == r1) goto L_0x0156
                java.lang.Class<hw.e> r0 = p556hw.C76247e.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                hw.e r0 = (p556hw.C76247e) r0
                long r2 = r23.getMsgId()
                boolean r0 = r0.mo106500S9(r2)
                if (r0 != 0) goto L_0x0152
                long r2 = r5.field_status
                int r0 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
                if (r0 != 0) goto L_0x0102
                android.widget.ImageView r0 = r7.f217146r
                if (r0 != 0) goto L_0x00e7
                goto L_0x00ea
            L_0x00e7:
                r0.setVisibility(r12)
            L_0x00ea:
                com.tencent.mm.ui.widget.progress.RoundProgressBtn r0 = r7.f217144p
                if (r0 == 0) goto L_0x00f2
                r1 = 1
                r0.setHasPause(r1)
            L_0x00f2:
                com.tencent.mm.ui.widget.progress.RoundProgressBtn r0 = r7.f217144p
                r6 = 0
                if (r0 != 0) goto L_0x00f8
                goto L_0x00fb
            L_0x00f8:
                r0.setVisibility(r6)
            L_0x00fb:
                r3 = 0
            L_0x00fc:
                r16 = 1
                r17 = 0
                goto L_0x019c
            L_0x0102:
                r6 = 0
                r16 = 102(0x66, double:5.04E-322)
                int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
                if (r0 != 0) goto L_0x012b
                com.tencent.mm.ui.widget.progress.RoundProgressBtn r0 = r7.f217144p
                if (r0 == 0) goto L_0x0110
                r0.setHasPause(r6)
            L_0x0110:
                com.tencent.mm.ui.widget.progress.RoundProgressBtn r0 = r7.f217144p
                if (r0 != 0) goto L_0x0115
                goto L_0x0118
            L_0x0115:
                r0.setVisibility(r6)
            L_0x0118:
                android.widget.ImageView r0 = r7.f217146r
                if (r0 != 0) goto L_0x011d
                goto L_0x0120
            L_0x011d:
                r0.setVisibility(r6)
            L_0x0120:
                android.widget.ImageView r0 = r7.f217146r
                if (r0 == 0) goto L_0x00fb
                r2 = 2131755077(0x7f100045, float:1.9141023E38)
                r0.setImageResource(r2)
                goto L_0x00fb
            L_0x012b:
                r17 = 198(0xc6, double:9.8E-322)
                int r0 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
                if (r0 != 0) goto L_0x0142
                com.tencent.mm.ui.widget.progress.RoundProgressBtn r0 = r7.f217144p
                if (r0 != 0) goto L_0x0136
                goto L_0x0139
            L_0x0136:
                r0.setVisibility(r12)
            L_0x0139:
                android.widget.ImageView r0 = r7.f217146r
                if (r0 != 0) goto L_0x013e
                goto L_0x0156
            L_0x013e:
                r0.setVisibility(r12)
                goto L_0x0156
            L_0x0142:
                com.tencent.mm.ui.widget.progress.RoundProgressBtn r0 = r7.f217144p
                if (r0 != 0) goto L_0x0147
                goto L_0x014a
            L_0x0147:
                r0.setVisibility(r12)
            L_0x014a:
                android.widget.ImageView r0 = r7.f217146r
                if (r0 != 0) goto L_0x014f
                goto L_0x0152
            L_0x014f:
                r0.setVisibility(r12)
            L_0x0152:
                r3 = 0
                r16 = 0
                goto L_0x0159
            L_0x0156:
                r3 = 0
                r16 = 1
            L_0x0159:
                r17 = 1
                goto L_0x019c
            L_0x015c:
                com.tencent.mm.ui.widget.progress.RoundProgressBtn r0 = r7.f217144p
                r3 = 0
                if (r0 == 0) goto L_0x0164
                r0.setHasPause(r3)
            L_0x0164:
                com.tencent.mm.ui.widget.progress.RoundProgressBtn r0 = r7.f217144p
                if (r0 != 0) goto L_0x0169
                goto L_0x016c
            L_0x0169:
                r0.setVisibility(r3)
            L_0x016c:
                android.widget.ImageView r0 = r7.f217146r
                if (r0 != 0) goto L_0x0171
                goto L_0x0174
            L_0x0171:
                r0.setVisibility(r3)
            L_0x0174:
                android.widget.ImageView r0 = r7.f217146r
                if (r0 == 0) goto L_0x017e
                r2 = 2131755077(0x7f100045, float:1.9141023E38)
                r0.setImageResource(r2)
            L_0x017e:
                android.widget.TextView r0 = r7.f217142n
                if (r0 != 0) goto L_0x0183
                goto L_0x0186
            L_0x0183:
                r0.setVisibility(r3)
            L_0x0186:
                android.widget.TextView r0 = r7.f217142n
                if (r0 != 0) goto L_0x018c
                goto L_0x00fc
            L_0x018c:
                android.app.Activity r2 = r21.mo91565f()
                r4 = 2131821589(0x7f110415, float:1.9275925E38)
                java.lang.String r2 = r2.getString(r4)
                r0.setText(r2)
                goto L_0x00fc
            L_0x019c:
                android.widget.RelativeLayout r6 = r7.f217143o
                if (r6 == 0) goto L_0x01bd
                com.tencent.mm.ui.chatting.viewitems.h1$a$b r4 = new com.tencent.mm.ui.chatting.viewitems.h1$a$b
                r0 = r4
                r1 = r23
                r2 = r5
                r18 = 0
                r3 = r20
                r12 = r4
                r4 = r25
                r19 = r11
                r11 = r5
                r5 = r26
                r8 = r6
                r6 = r22
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r8.setOnClickListener(r12)
                goto L_0x02aa
            L_0x01bd:
                r19 = r11
                r11 = r5
                goto L_0x02aa
            L_0x01c2:
                r19 = r11
                r11 = r5
                int r0 = r23.getStatus()
                if (r0 < r2) goto L_0x0248
                int r0 = r23.getStatus()
                r2 = 5
                if (r0 != r2) goto L_0x01d4
                goto L_0x0248
            L_0x01d4:
                int r0 = r9.f230742Z
                r2 = 100
                r3 = 2131755078(0x7f100046, float:1.9141025E38)
                if (r0 == r2) goto L_0x024d
                r2 = 101(0x65, float:1.42E-43)
                if (r0 == r2) goto L_0x0248
                long r4 = r11.field_status
                int r0 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
                if (r0 != 0) goto L_0x020b
                android.widget.ImageView r0 = r7.f217146r
                if (r0 != 0) goto L_0x01ec
                goto L_0x01f1
            L_0x01ec:
                r2 = 8
                r0.setVisibility(r2)
            L_0x01f1:
                com.tencent.mm.ui.widget.progress.RoundProgressBtn r0 = r7.f217144p
                r1 = 1
                if (r0 == 0) goto L_0x01f9
                r0.setHasPause(r1)
            L_0x01f9:
                com.tencent.mm.ui.widget.progress.RoundProgressBtn r0 = r7.f217144p
                r2 = 0
                if (r0 != 0) goto L_0x01ff
                goto L_0x0202
            L_0x01ff:
                r0.setVisibility(r2)
            L_0x0202:
                r8 = 8
                r12 = 0
            L_0x0205:
                r16 = 1
                r17 = 0
                goto L_0x0290
            L_0x020b:
                r1 = 1
                r2 = 0
                r16 = 105(0x69, double:5.2E-322)
                int r0 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
                if (r0 != 0) goto L_0x0232
                com.tencent.mm.ui.widget.progress.RoundProgressBtn r0 = r7.f217144p
                if (r0 == 0) goto L_0x021a
                r0.setHasPause(r2)
            L_0x021a:
                com.tencent.mm.ui.widget.progress.RoundProgressBtn r0 = r7.f217144p
                if (r0 != 0) goto L_0x021f
                goto L_0x0222
            L_0x021f:
                r0.setVisibility(r2)
            L_0x0222:
                android.widget.ImageView r0 = r7.f217146r
                if (r0 != 0) goto L_0x0227
                goto L_0x022a
            L_0x0227:
                r0.setVisibility(r2)
            L_0x022a:
                android.widget.ImageView r0 = r7.f217146r
                if (r0 == 0) goto L_0x0202
                r0.setImageResource(r3)
                goto L_0x0202
            L_0x0232:
                com.tencent.mm.ui.widget.progress.RoundProgressBtn r0 = r7.f217144p
                r8 = 8
                if (r0 != 0) goto L_0x0239
                goto L_0x023c
            L_0x0239:
                r0.setVisibility(r8)
            L_0x023c:
                android.widget.ImageView r0 = r7.f217146r
                if (r0 != 0) goto L_0x0241
                goto L_0x0244
            L_0x0241:
                r0.setVisibility(r8)
            L_0x0244:
                r12 = 0
                r16 = 0
                goto L_0x028e
            L_0x0248:
                r1 = 1
                r8 = 8
                r12 = 0
                goto L_0x028c
            L_0x024d:
                r1 = 1
                r8 = 8
                com.tencent.mm.ui.widget.progress.RoundProgressBtn r0 = r7.f217144p
                r12 = 0
                if (r0 == 0) goto L_0x0258
                r0.setHasPause(r12)
            L_0x0258:
                com.tencent.mm.ui.widget.progress.RoundProgressBtn r0 = r7.f217144p
                if (r0 != 0) goto L_0x025d
                goto L_0x0260
            L_0x025d:
                r0.setVisibility(r12)
            L_0x0260:
                android.widget.ImageView r0 = r7.f217146r
                if (r0 != 0) goto L_0x0265
                goto L_0x0268
            L_0x0265:
                r0.setVisibility(r12)
            L_0x0268:
                android.widget.ImageView r0 = r7.f217146r
                if (r0 == 0) goto L_0x026f
                r0.setImageResource(r3)
            L_0x026f:
                android.widget.TextView r0 = r7.f217142n
                if (r0 != 0) goto L_0x0274
                goto L_0x0277
            L_0x0274:
                r0.setVisibility(r12)
            L_0x0277:
                android.widget.TextView r0 = r7.f217142n
                if (r0 != 0) goto L_0x027c
                goto L_0x0205
            L_0x027c:
                android.app.Activity r2 = r21.mo91565f()
                r3 = 2131821591(0x7f110417, float:1.927593E38)
                java.lang.String r2 = r2.getString(r3)
                r0.setText(r2)
                goto L_0x0205
            L_0x028c:
                r16 = 1
            L_0x028e:
                r17 = 1
            L_0x0290:
                android.widget.RelativeLayout r5 = r7.f217143o
                if (r5 == 0) goto L_0x02aa
                com.tencent.mm.ui.chatting.viewitems.h1$a$c r4 = new com.tencent.mm.ui.chatting.viewitems.h1$a$c
                r0 = r4
                r1 = r23
                r2 = r11
                r3 = r20
                r8 = r4
                r4 = r26
                r12 = r5
                r5 = r22
                r6 = r21
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r12.setOnClickListener(r8)
            L_0x02aa:
                r5 = r16
                r3 = r17
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r13)
                long r1 = r23.getMsgId()
                r0.append(r1)
                java.lang.String r1 = " isFileSender:"
                r0.append(r1)
                int r1 = r9.f230741Y
                r0.append(r1)
                r0.append(r14)
                long r1 = r11.field_status
                r0.append(r1)
                java.lang.String r1 = ", hasMask:"
                r0.append(r1)
                r0.append(r5)
                r0.append(r14)
                int r1 = r9.f230742Z
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r0)
                goto L_0x02ec
            L_0x02e7:
                r19 = r11
                r1 = 1
                r3 = 1
                r5 = 0
            L_0x02ec:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r13)
                long r1 = r23.getMsgId()
                r0.append(r1)
                java.lang.String r1 = " hasMask:"
                r0.append(r1)
                r0.append(r5)
                java.lang.String r1 = " hasIcon:"
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = " isBitmapNull:"
                r0.append(r1)
                r0.append(r10)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r0)
                android.widget.ImageView r0 = r7.f217145q
                if (r0 != 0) goto L_0x031f
                goto L_0x0328
            L_0x031f:
                if (r5 == 0) goto L_0x0323
                r12 = 0
                goto L_0x0325
            L_0x0323:
                r12 = 8
            L_0x0325:
                r0.setVisibility(r12)
            L_0x0328:
                if (r10 == 0) goto L_0x03a4
                if (r3 == 0) goto L_0x0372
                r0 = r22
                java.lang.String r1 = r0.f195602n
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isImageExt(r1)
                if (r1 == 0) goto L_0x034b
                com.tencent.mm.ui.MMImageView r0 = r7.f217130b
                if (r0 == 0) goto L_0x03a4
                boolean r1 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
                if (r1 == 0) goto L_0x0344
                r1 = 2131755100(0x7f10005c, float:1.914107E38)
                goto L_0x0347
            L_0x0344:
                r1 = 2131755099(0x7f10005b, float:1.9141068E38)
            L_0x0347:
                r0.setImageResource(r1)
                goto L_0x03a4
            L_0x034b:
                java.lang.String r1 = r0.f195602n
                boolean r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74247d.m88514d(r1)
                if (r1 == 0) goto L_0x035e
                com.tencent.mm.ui.MMImageView r0 = r7.f217130b
                if (r0 == 0) goto L_0x03a4
                r1 = 2131755116(0x7f10006c, float:1.9141102E38)
                r0.setImageResource(r1)
                goto L_0x03a4
            L_0x035e:
                com.tencent.mm.ui.MMImageView r1 = r7.f217130b
                if (r1 == 0) goto L_0x03a4
                di3.d r2 = di3.C86312j.m106911c(r19)
                wm.f r2 = (p262wm.C22923f) r2
                java.lang.String r0 = r0.f195602n
                int r0 = r2.mo35897CW(r0)
                r1.setImageResource(r0)
                goto L_0x03a4
            L_0x0372:
                r0 = r22
                java.lang.String r1 = r0.f195602n
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isImageExt(r1)
                if (r1 == 0) goto L_0x0391
                com.tencent.mm.ui.MMImageView r0 = r7.f217130b
                if (r0 == 0) goto L_0x03a4
                boolean r1 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
                if (r1 == 0) goto L_0x038a
                r1 = 2131755108(0x7f100064, float:1.9141086E38)
                goto L_0x038d
            L_0x038a:
                r1 = 2131755107(0x7f100063, float:1.9141084E38)
            L_0x038d:
                r0.setImageResource(r1)
                goto L_0x03a4
            L_0x0391:
                com.tencent.mm.ui.MMImageView r1 = r7.f217130b
                if (r1 == 0) goto L_0x03a4
                di3.d r2 = di3.C86312j.m106911c(r19)
                wm.f r2 = (p262wm.C22923f) r2
                java.lang.String r0 = r0.f195602n
                int r0 = r2.qd0(r0)
                r1.setImageResource(r0)
            L_0x03a4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74001h1.C74002a.mo103054c(ck3.b, com.tencent.mm.message.l$b, com.tencent.mm.storage.f4, boolean, java.lang.String, java.lang.String):void");
        }

        /* renamed from: d */
        public final void mo103055d(C74002a aVar, String str, int i) {
            C87412m.m108594g(aVar, "holder");
            C119179t tVar = C119157j.f356862d;
            C74006d dVar = new C74006d(str, i, aVar);
            ((C119157j) tVar).mo183876g(dVar, "updateProgress_" + aVar.hashCode());
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.h1$b */
    public static class C74008b extends C74023i {

        /* renamed from: v */
        public C67391b f217169v;

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.h1$b$a */
        public static final class C44863a implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ String f121715d;

            /* renamed from: e */
            public final /* synthetic */ C67391b f121716e;

            public C44863a(String str, C67391b bVar) {
                this.f121715d = str;
                this.f121716e = bVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent();
                intent.putExtra("rawUrl", this.f121715d);
                intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
                intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
                C67391b bVar = this.f121716e;
                C87412m.m108591d(bVar);
                C88144b.m109791i(bVar.mo91565f(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                C115669n.INSTANCE.mo160131h(17509, 1, this.f121715d);
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.h1$b$b */
        public static final class C74009b implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C67391b f217170d;

            /* renamed from: e */
            public final /* synthetic */ C72963f4 f217171e;

            /* renamed from: f */
            public final /* synthetic */ C74008b f217172f;

            /* renamed from: g */
            public final /* synthetic */ String f217173g;

            public C74009b(C67391b bVar, C72963f4 f4Var, C74008b bVar2, String str) {
                this.f217170d = bVar;
                this.f217171e = f4Var;
                this.f217172f = bVar2;
                this.f217173g = str;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C67391b bVar = this.f217170d;
                C72963f4 f4Var = this.f217171e;
                C74244u.C74247d.m88515e(bVar, f4Var, this.f217172f.mo103068y(bVar, f4Var), -1, (C88144b.C76564c) null);
                C115669n.INSTANCE.mo160131h(17509, 2, this.f217173g);
            }
        }

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6886r8);
            C74002a aVar = new C74002a();
            aVar.mo103053b(n4Var, false);
            n4Var.setTag(aVar);
            return n4Var;
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return false;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            Map<String, String> parseXml;
            String content;
            C67391b bVar2 = bVar;
            C72963f4 f4Var2 = f4Var;
            if (f4Var2 == null) {
                return false;
            }
            C87412m.m108591d(menuItem);
            int itemId = menuItem.getItemId();
            if (itemId == 111) {
                String str = "";
                if (!C73764n3.m87369a(f4Var)) {
                    C87412m.m108591d(bVar);
                    C76879j.m92754y(bVar.mo91565f(), bVar.mo91565f().getString(C0966R.string.cm7), str, bVar.mo91565f().getString(C0966R.string.lkg), (DialogInterface.OnClickListener) null);
                    return false;
                }
                int i = C75569c4.f221998a;
                if (!Util.isNullOrNil(f4Var2.f230724G) && (parseXml = XmlParser.parseXml(f4Var2.f230724G, "msgsource", (String) null)) != null) {
                    String str2 = parseXml.get(".msgsource.sec_msg_node.share-tip-url");
                    if (!Util.isNullOrNil(str2)) {
                        str = str2;
                    }
                }
                if (Util.isNullOrNil(str)) {
                    C74244u.C74247d.m88515e(bVar2, f4Var2, mo103068y(bVar2, f4Var2), -1, (C88144b.C76564c) null);
                } else {
                    C115669n.INSTANCE.mo160131h(17509, 3, str);
                    C87412m.m108591d(bVar);
                    C76879j.m92740k(bVar.mo91565f(), C0966R.string.ii6, C0966R.string.ii7, C0966R.string.a45, C0966R.string.bb4, true, new C44863a(str, bVar2), new C74009b(bVar2, f4Var2, this, str));
                }
            } else if (!(itemId != 114 || (content = f4Var.getContent()) == null || C68070l.C68072b.m80422u(content, (String) null) == null)) {
                C87412m.m108591d(bVar);
                C73745l4.m87341b(f4Var2, C75604z3.m90840l(bVar.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()), bVar.mo91565f(), 256);
            }
            return false;
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            C72683d g;
            Class cls = C79138l.class;
            C87412m.m108594g(e0Var, "menu");
            C87412m.m108594g(view, "v");
            C87412m.m108594g(f4Var, "msg");
            Object tag = view.getTag();
            C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
            int b = ((C74243t8) tag).mo103252b();
            C67391b bVar = this.f217169v;
            C87412m.m108591d(bVar);
            int m = C72695v.m85071m(C75604z3.m90840l(bVar.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()));
            C67391b bVar2 = this.f217169v;
            C87412m.m108591d(bVar2);
            C68070l.C68072b u = C68070l.C68072b.m80422u(C75604z3.m90840l(bVar2.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()), (String) null);
            C44561j GW = ((C79138l) C86312j.m106911c(cls)).mo73990GW(u.f195562d, false);
            if (((C79138l) C86312j.m106911c(cls)).E10(GW) && !C74343y0.m88768l(f4Var) && u.f195582i == 6 && ((g = C72695v.m85065g(u.f195606o)) == null || !C73521l0.m86925b(f4Var, g.field_fileFullPath))) {
                C67391b bVar3 = this.f217169v;
                C87412m.m108591d(bVar3);
                e0Var.mo107136c(b, 111, 0, bVar3.mo91572m().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
            }
            int i = u.f195594l;
            if (i <= 0 || (i > 0 && m >= 100)) {
                boolean c = C47984k.m53329c();
                if (!Util.isImageExt(u.f195602n)) {
                    C67391b bVar4 = this.f217169v;
                    C87412m.m108591d(bVar4);
                    e0Var.mo107136c(b, 150, 0, bVar4.mo91572m().getString(C0966R.string.b_9), C0966R.raw.icons_filled_otherapp);
                }
                if (c) {
                    C67391b bVar5 = this.f217169v;
                    C87412m.m108591d(bVar5);
                    if (!bVar5.mo91584y()) {
                        e0Var.add(b, 114, 0, (CharSequence) view.getContext().getString(C0966R.string.b9w));
                    }
                }
            }
            C88144b.m109788f("favorite");
            if ((GW == null || !GW.mo69359k()) && u.f195582i != 74) {
                e0Var.mo107136c(b, 116, 0, view.getContext().getString(C0966R.string.f361137hk2), C0966R.raw.icons_filled_favorites);
            }
            ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new ExDeviceHaveBindNetworkDeviceEvent();
            exDeviceHaveBindNetworkDeviceEvent.f236178d.f236180a = f4Var.getMsgId();
            exDeviceHaveBindNetworkDeviceEvent.publish();
            if (exDeviceHaveBindNetworkDeviceEvent.f236179e.f236182a) {
                e0Var.mo107136c(b, 129, 0, view.getContext().getString(C0966R.string.b_8), C0966R.raw.icons_filled_open);
            }
            if (C75569c4.m90690w(f4Var)) {
                e0Var.clear();
            }
            C67391b bVar6 = this.f217169v;
            C87412m.m108591d(bVar6);
            if (bVar6.mo91584y()) {
                return true;
            }
            C67391b bVar7 = this.f217169v;
            C87412m.m108591d(bVar7);
            e0Var.mo107136c(b, 100, 0, bVar7.mo91572m().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
            return true;
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            C87412m.m108594g(f4Var, "msg");
            C68144a.m80547c(f4Var, C68144a.C68145a.Click);
            ((C98591h) C86312j.m106911c(C98591h.class)).Gr0(f4Var.mo108768t());
            String content = f4Var.getContent();
            if (content == null) {
                return false;
            }
            C87412m.m108591d(bVar);
            C68070l.C68072b u = C68070l.C68072b.m80422u(C75604z3.m90840l(bVar.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()), (String) null);
            C68075o a = C68075o.m80440a(content);
            if (u == null) {
                return false;
            }
            ((C76247e) C86312j.m106911c(C76247e.class)).mo106498Eq(f4Var.getMsgId());
            int i = a.f195664b;
            if (i != 0) {
                u.f195582i = i;
            }
            C44561j GW = ((C79138l) C86312j.m106911c(C79138l.class)).mo73990GW(u.f195562d, false);
            String o = mo103097o(bVar, f4Var);
            if (GW != null) {
                mo103094j(bVar, u, o, GW, f4Var.mo108774y2(), bVar.mo91577r());
            }
            if (!this.f217197d) {
                C76912y0.m92771j(bVar.mo91565f(), bVar.f193286j.getContentView());
                return true;
            }
            Intent intent = new Intent();
            intent.setClassName(bVar.mo91565f(), "com.tencent.mm.ui.chatting.AppAttachNewDownloadUI");
            intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 2);
            intent.putExtra("app_msg_id", f4Var.getMsgId());
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C67391b bVar2 = bVar;
            C117292a.m165358d(bVar2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFile$ChattingItemAppMsgFileFrom", "onItemClick", "(Landroid/view/View;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            bVar.mo91556Q((Intent) aVar.mo10231a(0));
            C117292a.m165359e(bVar2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFile$ChattingItemAppMsgFileFrom", "onItemClick", "(Landroid/view/View;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }

        /* renamed from: d */
        public C72963f4.C72966d<?> mo82118d(C72963f4 f4Var, Context context, C39969i iVar) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(iVar, "talkerInfo");
            return new C74014e(f4Var);
        }

        /* JADX WARNING: Removed duplicated region for block: B:123:0x023a  */
        /* JADX WARNING: Removed duplicated region for block: B:138:0x0264  */
        /* JADX WARNING: Removed duplicated region for block: B:139:0x0266  */
        /* JADX WARNING: Removed duplicated region for block: B:146:0x0275  */
        /* JADX WARNING: Removed duplicated region for block: B:149:0x0280  */
        /* JADX WARNING: Removed duplicated region for block: B:154:0x028e  */
        /* JADX WARNING: Removed duplicated region for block: B:173:0x02ed  */
        /* JADX WARNING: Removed duplicated region for block: B:179:0x0306  */
        /* JADX WARNING: Removed duplicated region for block: B:182:0x030f  */
        /* JADX WARNING: Removed duplicated region for block: B:185:0x0317  */
        /* JADX WARNING: Removed duplicated region for block: B:198:0x0339  */
        /* JADX WARNING: Removed duplicated region for block: B:201:0x0341  */
        /* JADX WARNING: Removed duplicated region for block: B:204:0x034a  */
        /* JADX WARNING: Removed duplicated region for block: B:207:0x0353  */
        /* JADX WARNING: Removed duplicated region for block: B:210:0x035b  */
        /* JADX WARNING: Removed duplicated region for block: B:213:0x0377  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x018a  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x018c  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x01a6  */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo26237f(com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74026c r19, ck3.C67391b r20, com.tencent.p014mm.storage.C72963f4 r21, java.lang.String r22) {
            /*
                r18 = this;
                r8 = r18
                r0 = r19
                r9 = r20
                r10 = r21
                java.lang.Class<ym.l> r1 = p763ym.C79138l.class
                java.lang.String r2 = "ui"
                gy3.C87412m.m108594g(r9, r2)
                java.lang.String r2 = "msg"
                gy3.C87412m.m108594g(r10, r2)
                java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFile.AppMsgFileViewHolder"
                gy3.C87412m.m108592e(r0, r2)
                r11 = r0
                com.tencent.mm.ui.chatting.viewitems.h1$a r11 = (com.tencent.p014mm.p136ui.chatting.viewitems.C74001h1.C74002a) r11
                r8.f217169v = r9
                java.lang.String r12 = r21.getContent()
                java.lang.Class<zj3.n> r0 = zj3.C79371n.class
                com.tencent.mm.ui.chatting.manager.a r2 = r9.f193278b
                xi.d r0 = r2.mo102812a(r0)
                zj3.n r0 = (zj3.C79371n) r0
                r0.mo102405C3(r10)
                r0.mo102409q3(r10)
                r0.mo102406W4(r10)
                r13 = 0
                if (r12 == 0) goto L_0x0043
                java.lang.String r0 = r21.mo108775z2()
                com.tencent.mm.message.l$b r0 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r12, r0)
                r14 = r0
                goto L_0x0044
            L_0x0043:
                r14 = r13
            L_0x0044:
                com.tencent.mm.ui.chatting.viewitems.t8 r15 = new com.tencent.mm.ui.chatting.viewitems.t8
                boolean r0 = r20.mo91583x()
                r15.<init>(r10, r0, r11, r13)
                if (r14 == 0) goto L_0x0389
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r11.f217140l
                if (r0 == 0) goto L_0x005a
                java.lang.String r2 = r14.mo93550m()
                r0.mo104279b(r2)
            L_0x005a:
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r11.f217140l
                if (r0 != 0) goto L_0x005f
                goto L_0x0066
            L_0x005f:
                java.lang.String r2 = r14.mo93550m()
                r0.setContentDescription(r2)
            L_0x0066:
                android.widget.TextView r0 = r11.f217141m
                if (r0 != 0) goto L_0x006b
                goto L_0x0072
            L_0x006b:
                java.lang.String r2 = r14.mo93548k()
                r0.setText(r2)
            L_0x0072:
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r11.f217140l
                if (r0 == 0) goto L_0x0088
                android.app.Activity r2 = r20.mo91565f()
                android.content.res.Resources r2 = r2.getResources()
                r3 = 2131099800(0x7f060098, float:1.7811963E38)
                int r2 = r2.getColor(r3)
                r0.setTextColor(r2)
            L_0x0088:
                android.widget.TextView r0 = r11.f217141m
                if (r0 == 0) goto L_0x009e
                android.app.Activity r2 = r20.mo91565f()
                android.content.res.Resources r2 = r2.getResources()
                r3 = 2131100897(0x7f0604e1, float:1.7814188E38)
                int r2 = r2.getColor(r3)
                r0.setTextColor(r2)
            L_0x009e:
                android.widget.LinearLayout r0 = r11.f217139k
                r2 = 2131231612(0x7f08037c, float:1.807931E38)
                if (r0 == 0) goto L_0x00a8
                r0.setBackgroundResource(r2)
            L_0x00a8:
                android.widget.LinearLayout r0 = r11.f217139k
                r6 = 0
                if (r0 == 0) goto L_0x00bf
                android.app.Activity r3 = r20.mo91565f()
                android.content.res.Resources r3 = r3.getResources()
                r4 = 2131165574(0x7f070186, float:1.7945369E38)
                int r3 = r3.getDimensionPixelSize(r4)
                r0.setPadding(r6, r3, r6, r6)
            L_0x00bf:
                com.tencent.mm.ui.MMImageView r0 = r11.f217130b
                if (r0 != 0) goto L_0x00c4
                goto L_0x00c7
            L_0x00c4:
                r0.setVisibility(r6)
            L_0x00c7:
                android.widget.RelativeLayout r0 = r11.f217143o
                if (r0 != 0) goto L_0x00cc
                goto L_0x00cf
            L_0x00cc:
                r0.setVisibility(r6)
            L_0x00cf:
                android.widget.TextView r0 = r11.f217141m
                if (r0 != 0) goto L_0x00d4
                goto L_0x00d7
            L_0x00d4:
                r0.setVisibility(r6)
            L_0x00d7:
                com.tencent.mm.ui.widget.progress.RoundProgressBtn r0 = r11.f217144p
                r7 = 8
                if (r0 != 0) goto L_0x00de
                goto L_0x00e1
            L_0x00de:
                r0.setVisibility(r7)
            L_0x00e1:
                android.widget.ImageView r0 = r11.f217137i
                if (r0 != 0) goto L_0x00e6
                goto L_0x00e9
            L_0x00e6:
                r0.setVisibility(r7)
            L_0x00e9:
                android.widget.ImageView r0 = r11.f217138j
                if (r0 != 0) goto L_0x00ee
                goto L_0x00f1
            L_0x00ee:
                r0.setVisibility(r7)
            L_0x00f1:
                android.widget.LinearLayout r0 = r11.f217139k
                if (r0 != 0) goto L_0x00f6
                goto L_0x00f9
            L_0x00f6:
                r0.setVisibility(r6)
            L_0x00f9:
                android.widget.ImageView r0 = r11.f217134f
                if (r0 != 0) goto L_0x00fe
                goto L_0x0101
            L_0x00fe:
                r0.setVisibility(r7)
            L_0x0101:
                android.widget.TextView r0 = r11.f217135g
                if (r0 != 0) goto L_0x0106
                goto L_0x0109
            L_0x0106:
                r0.setVisibility(r7)
            L_0x0109:
                android.view.View r0 = r11.clickArea
                int r3 = r11.f217149u
                r11.resetChatBubbleWidth(r0, r3)
                android.view.View r0 = r11.clickArea
                r0.setBackgroundResource(r2)
                di3.d r0 = di3.C86312j.m106911c(r1)
                ym.l r0 = (p763ym.C79138l) r0
                java.lang.String r2 = r14.f195562d
                int r3 = r14.f195480E
                com.tencent.mm.pluginsdk.model.app.j r0 = r0.mo74003UV(r2, r3)
                if (r0 == 0) goto L_0x0128
                r8.mo103095k(r9, r14, r10)
            L_0x0128:
                r5 = 1
                if (r0 == 0) goto L_0x0176
                java.lang.String r2 = r0.field_appName
                if (r2 == 0) goto L_0x0176
                int r3 = r2.length()
                int r3 = r3 - r5
                r4 = 0
                r16 = 0
            L_0x0137:
                if (r4 > r3) goto L_0x0163
                if (r16 != 0) goto L_0x013d
                r7 = r4
                goto L_0x013e
            L_0x013d:
                r7 = r3
            L_0x013e:
                char r7 = r2.charAt(r7)
                r13 = 32
                int r7 = gy3.C87412m.m108596i(r7, r13)
                if (r7 > 0) goto L_0x014c
                r7 = 1
                goto L_0x014d
            L_0x014c:
                r7 = 0
            L_0x014d:
                if (r16 != 0) goto L_0x015a
                if (r7 != 0) goto L_0x0157
                r7 = 8
                r13 = 0
                r16 = 1
                goto L_0x0137
            L_0x0157:
                int r4 = r4 + 1
                goto L_0x015f
            L_0x015a:
                if (r7 != 0) goto L_0x015d
                goto L_0x0163
            L_0x015d:
                int r3 = r3 + -1
            L_0x015f:
                r7 = 8
                r13 = 0
                goto L_0x0137
            L_0x0163:
                int r3 = r3 + r5
                java.lang.CharSequence r2 = r2.subSequence(r4, r3)
                java.lang.String r2 = r2.toString()
                int r2 = r2.length()
                if (r2 > 0) goto L_0x0173
                goto L_0x0176
            L_0x0173:
                java.lang.String r2 = r0.field_appName
                goto L_0x0178
            L_0x0176:
                java.lang.String r2 = r14.f195484F
            L_0x0178:
                int r3 = r14.f195582i
                r4 = 20
                if (r3 == r4) goto L_0x018c
                java.lang.String r3 = r14.f195562d
                java.lang.String r4 = "wxaf060266bfa9a35c"
                boolean r3 = gy3.C87412m.m108589b(r4, r3)
                if (r3 == 0) goto L_0x018a
                goto L_0x018c
            L_0x018a:
                r3 = 1
                goto L_0x0194
            L_0x018c:
                wc3.b0 r3 = wc3.C78535a0.m94863b()
                boolean r3 = r3.isShowShakeTV()
            L_0x0194:
                if (r3 == 0) goto L_0x023a
                java.lang.String r3 = r14.f195562d
                if (r3 == 0) goto L_0x023a
                int r3 = r3.length()
                if (r3 <= 0) goto L_0x023a
                boolean r3 = r8.mo103084W(r2)
                if (r3 == 0) goto L_0x023a
                di3.d r1 = di3.C86312j.m106911c(r1)
                ym.l r1 = (p763ym.C79138l) r1
                android.app.Activity r3 = r20.mo91565f()
                java.lang.String r1 = r1.mo74019xG(r3, r0, r2)
                int r2 = r14.f195582i
                r3 = 19
                if (r2 != r3) goto L_0x01d6
                android.widget.TextView r2 = r11.f217133e
                if (r2 != 0) goto L_0x01bf
                goto L_0x01de
            L_0x01bf:
                android.app.Activity r3 = r20.mo91565f()
                android.content.res.Resources r3 = r3.getResources()
                r4 = 2131833874(0x7f113412, float:1.9300842E38)
                java.lang.Object[] r7 = new java.lang.Object[r5]
                r7[r6] = r1
                java.lang.String r1 = r3.getString(r4, r7)
                r2.setText(r1)
                goto L_0x01de
            L_0x01d6:
                android.widget.TextView r2 = r11.f217133e
                if (r2 != 0) goto L_0x01db
                goto L_0x01de
            L_0x01db:
                r2.setText(r1)
            L_0x01de:
                android.widget.TextView r1 = r11.f217133e
                if (r1 != 0) goto L_0x01e3
                goto L_0x01e6
            L_0x01e3:
                r1.setVisibility(r6)
            L_0x01e6:
                android.widget.TextView r1 = r11.f217133e
                r13 = 0
                if (r1 == 0) goto L_0x01ee
                r1.setCompoundDrawables(r13, r13, r13, r13)
            L_0x01ee:
                android.widget.LinearLayout r1 = r11.f217131c
                if (r1 != 0) goto L_0x01f3
                goto L_0x01f6
            L_0x01f3:
                r1.setVisibility(r6)
            L_0x01f6:
                android.widget.ImageView r1 = r11.f217132d
                if (r1 != 0) goto L_0x01fb
                goto L_0x01fe
            L_0x01fb:
                r1.setVisibility(r6)
            L_0x01fe:
                if (r0 == 0) goto L_0x021f
                boolean r1 = r0.mo69359k()
                if (r1 == 0) goto L_0x021f
                android.widget.TextView r2 = r11.f217133e
                java.lang.String r7 = r0.field_packageName
                long r16 = r21.mo108774y2()
                r0 = r18
                r1 = r20
                r3 = r21
                r4 = r14
                r13 = 1
                r5 = r7
                r13 = 8
                r6 = r16
                r0.mo103074H(r1, r2, r3, r4, r5, r6)
                goto L_0x0228
            L_0x021f:
                r13 = 8
                android.widget.TextView r0 = r11.f217133e
                java.lang.String r1 = r14.f195562d
                r8.mo103076J(r9, r0, r1)
            L_0x0228:
                android.widget.ImageView r0 = r11.f217132d
                if (r0 == 0) goto L_0x0232
                r1 = 2131231699(0x7f0803d3, float:1.8079486E38)
                r0.setImageResource(r1)
            L_0x0232:
                android.widget.ImageView r0 = r11.f217132d
                java.lang.String r1 = r14.f195562d
                r8.mo103078L(r9, r0, r1)
                goto L_0x025c
            L_0x023a:
                r13 = 8
                com.tencent.mm.ui.chatting.viewitems.h1$d r0 = com.tencent.p014mm.p136ui.chatting.viewitems.C74001h1.f217129a
                boolean r0 = r0.mo103064a(r14, r11)
                if (r0 != 0) goto L_0x025c
                android.widget.LinearLayout r0 = r11.f217131c
                if (r0 != 0) goto L_0x0249
                goto L_0x024c
            L_0x0249:
                r0.setVisibility(r13)
            L_0x024c:
                android.widget.TextView r0 = r11.f217133e
                if (r0 != 0) goto L_0x0251
                goto L_0x0254
            L_0x0251:
                r0.setVisibility(r13)
            L_0x0254:
                android.widget.ImageView r0 = r11.f217132d
                if (r0 != 0) goto L_0x0259
                goto L_0x025c
            L_0x0259:
                r0.setVisibility(r13)
            L_0x025c:
                com.tencent.mm.message.l$b$a r0 = r14.f195554b
                if (r0 == 0) goto L_0x0266
                int r0 = r0.f195660g
                if (r0 == 0) goto L_0x0266
                r6 = 1
                goto L_0x0267
            L_0x0266:
                r6 = 0
            L_0x0267:
                if (r6 == 0) goto L_0x0271
                android.widget.LinearLayout r0 = r11.f217131c
                if (r0 != 0) goto L_0x026e
                goto L_0x0271
            L_0x026e:
                r0.setVisibility(r13)
            L_0x0271:
                android.widget.LinearLayout r0 = r11.f217131c
                if (r0 == 0) goto L_0x027b
                r1 = 2131234067(0x7f080d13, float:1.808429E38)
                r0.setBackgroundResource(r1)
            L_0x027b:
                com.tencent.mm.ui.MMImageView r0 = r11.f217130b
                if (r0 != 0) goto L_0x0280
                goto L_0x0284
            L_0x0280:
                r1 = 0
                r0.setVisibility(r1)
            L_0x0284:
                boolean r0 = r14.mo93553p()
                if (r0 != 0) goto L_0x02ed
                boolean r0 = r8.f217197d
                if (r0 == 0) goto L_0x02ed
                int r0 = r14.f195582i
                r1 = 33
                if (r0 == r1) goto L_0x02ca
                r1 = 36
                if (r0 == r1) goto L_0x02ca
                r1 = 44
                if (r0 == r1) goto L_0x02ca
                r1 = 48
                if (r0 == r1) goto L_0x02ca
                java.lang.String r0 = r21.mo108765s2()
                boolean r0 = com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74247d.m88512b(r0)
                if (r0 != 0) goto L_0x02ca
                java.lang.Class<gt.k> r0 = p158gt.C98201k.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                gt.k r0 = (p158gt.C98201k) r0
                gt.m r0 = r0.mo137277xi()
                java.lang.String r1 = r21.mo108765s2()
                android.app.Activity r2 = r20.mo91565f()
                float r2 = kg3.C76577a.m92156g(r2)
                com.tencent.mm.modelimage.m r0 = (com.tencent.p014mm.modelimage.C92839m) r0
                r3 = 0
                android.graphics.Bitmap r0 = r0.mo127188jo(r1, r2, r3)
                goto L_0x02cb
            L_0x02ca:
                r0 = 0
            L_0x02cb:
                if (r0 == 0) goto L_0x02ea
                boolean r1 = r0.isRecycled()
                if (r1 != 0) goto L_0x02ea
                android.app.Activity r1 = r20.mo91565f()
                r2 = 1
                int r1 = kg3.C76577a.m92151b(r1, r2)
                float r1 = (float) r1
                r3 = 0
                android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r0, r3, r1)
                com.tencent.mm.ui.MMImageView r1 = r11.f217130b
                if (r1 == 0) goto L_0x0300
                r1.setImageBitmap(r0)
                goto L_0x0300
            L_0x02ea:
                r2 = 1
                r4 = 1
                goto L_0x0301
            L_0x02ed:
                r2 = 1
                com.tencent.mm.ui.MMImageView r0 = r11.f217130b
                if (r0 == 0) goto L_0x0300
                android.content.res.Resources r1 = r20.mo91572m()
                r3 = 2131234285(0x7f080ded, float:1.8084731E38)
                android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeResource(r1, r3)
                r0.setImageBitmap(r1)
            L_0x0300:
                r4 = 0
            L_0x0301:
                android.widget.LinearLayout r0 = r11.f217147s
                if (r0 != 0) goto L_0x0306
                goto L_0x030a
            L_0x0306:
                r1 = 0
                r0.setVisibility(r1)
            L_0x030a:
                android.widget.ImageView r0 = r11.f217136h
                if (r0 != 0) goto L_0x030f
                goto L_0x0312
            L_0x030f:
                r0.setVisibility(r13)
            L_0x0312:
                java.lang.String r0 = r14.f195570f
                r1 = 2
                if (r0 == 0) goto L_0x0334
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x031f
                r6 = 1
                goto L_0x0320
            L_0x031f:
                r6 = 0
            L_0x0320:
                if (r6 == 0) goto L_0x0334
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r11.f217140l
                if (r0 != 0) goto L_0x0327
                goto L_0x032b
            L_0x0327:
                r2 = 0
                r0.setVisibility(r2)
            L_0x032b:
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r11.f217140l
                if (r0 != 0) goto L_0x0330
                goto L_0x033c
            L_0x0330:
                r0.setMaxLines(r1)
                goto L_0x033c
            L_0x0334:
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r11.f217140l
                if (r0 != 0) goto L_0x0339
                goto L_0x033c
            L_0x0339:
                r0.setVisibility(r13)
            L_0x033c:
                android.widget.TextView r0 = r11.f217141m
                if (r0 != 0) goto L_0x0341
                goto L_0x0345
            L_0x0341:
                r2 = 0
                r0.setVisibility(r2)
            L_0x0345:
                android.widget.ImageView r0 = r11.f217136h
                if (r0 != 0) goto L_0x034a
                goto L_0x034e
            L_0x034a:
                r2 = 4
                r0.setVisibility(r2)
            L_0x034e:
                android.widget.TextView r0 = r11.f217141m
                if (r0 != 0) goto L_0x0353
                goto L_0x0356
            L_0x0353:
                r0.setMaxLines(r1)
            L_0x0356:
                android.widget.TextView r0 = r11.f217141m
                if (r0 != 0) goto L_0x035b
                goto L_0x0365
            L_0x035b:
                int r1 = r14.f195594l
                long r1 = (long) r1
                java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.getSizeKB(r1)
                r0.setText(r1)
            L_0x0365:
                java.lang.Class<hw.e> r0 = p556hw.C76247e.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                hw.e r0 = (p556hw.C76247e) r0
                long r1 = r21.getMsgId()
                boolean r0 = r0.mo106500S9(r1)
                if (r0 != 0) goto L_0x037c
                int r0 = r14.f195594l
                r11.mo103055d(r11, r12, r0)
            L_0x037c:
                java.lang.String r5 = r14.f195606o
                java.lang.String r6 = r14.f195570f
                r0 = r11
                r1 = r20
                r2 = r14
                r3 = r21
                r0.mo103054c(r1, r2, r3, r4, r5, r6)
            L_0x0389:
                android.view.View r0 = r11.clickArea
                r0.setTag(r15)
                android.view.View r0 = r11.clickArea
                com.tencent.mm.ui.chatting.viewitems.i$f r1 = r8.mo103099u(r9)
                r0.setOnClickListener(r1)
                boolean r0 = r8.f217197d
                if (r0 == 0) goto L_0x03b7
                android.view.View r0 = r11.clickArea
                com.tencent.mm.ui.chatting.viewitems.i$e r1 = r8.mo103098p(r9)
                r0.setOnLongClickListener(r1)
                android.view.View r0 = r11.clickArea
                java.lang.Class<zj3.l> r1 = zj3.C79368l.class
                com.tencent.mm.ui.chatting.manager.a r2 = r9.f193278b
                xi.d r1 = r2.mo102812a(r1)
                zj3.l r1 = (zj3.C79368l) r1
                com.tencent.mm.ui.chatting.h2 r1 = r1.mo108189Z4()
                r0.setOnTouchListener(r1)
            L_0x03b7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74001h1.C74008b.mo26237f(com.tencent.mm.ui.chatting.viewitems.i$c, ck3.b, com.tencent.mm.storage.f4, java.lang.String):void");
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return !z && i == 1090519089;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.h1$c */
    public static class C74010c extends C74023i implements C73774p2 {

        /* renamed from: v */
        public C67391b f217174v;

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.h1$c$a */
        public static final class C74011a implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C72963f4 f217175d;

            /* renamed from: e */
            public final /* synthetic */ C67391b f217176e;

            public C74011a(C72963f4 f4Var, C67391b bVar) {
                this.f217175d = f4Var;
                this.f217176e = bVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C72963f4 f4Var = this.f217175d;
                C87412m.m108591d(f4Var);
                if (f4Var.mo101020w3()) {
                    C72695v.m85081w(this.f217175d);
                    this.f217176e.mo91541B(true);
                }
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.h1$c$b */
        public static final class C74012b implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public static final C74012b f217177d = new C74012b();

            public final void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6936so);
            C74002a aVar = new C74002a();
            aVar.mo103053b(n4Var, true);
            n4Var.setTag(aVar);
            return n4Var;
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return true;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            C68070l.C68072b u;
            String content;
            C87412m.m108594g(bVar, "ui");
            C87412m.m108594g(f4Var, "msg");
            C87412m.m108591d(menuItem);
            int itemId = menuItem.getItemId();
            if (itemId == 111) {
                if (f4Var.mo101020w3() && (u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null)) != null) {
                    int i = u.f195582i;
                    if (i == 40) {
                        C76879j.m92754y(bVar.mo91565f(), bVar.mo91565f().getString(C0966R.string.cm7), "", bVar.mo91565f().getString(C0966R.string.lkg), (DialogInterface.OnClickListener) null);
                        return false;
                    } else if (i == 33 && !WeChatBrands.Business.Entries.SessionAppbrand.checkAvailable(bVar.mo91565f())) {
                        return false;
                    }
                }
                C74244u.C74247d.m88515e(bVar, f4Var, mo103068y(bVar, f4Var), -1, (C88144b.C76564c) null);
            } else if (!(itemId != 114 || (content = f4Var.getContent()) == null || C68070l.C68072b.m80422u(content, (String) null) == null)) {
                C73745l4.m87341b(f4Var, C75604z3.m90840l(bVar.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()), bVar.mo91565f(), 256);
            }
            return false;
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            Class cls = C79138l.class;
            C87412m.m108594g(e0Var, "menu");
            C87412m.m108594g(view, "v");
            C87412m.m108594g(f4Var, "msg");
            Object tag = view.getTag();
            C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
            int b = ((C74243t8) tag).mo103252b();
            if (f4Var.getContent() == null) {
                return true;
            }
            C67391b bVar = this.f217174v;
            C87412m.m108591d(bVar);
            C68070l.C68072b u = C68070l.C68072b.m80422u(C75604z3.m90840l(bVar.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()), (String) null);
            if (u == null) {
                return true;
            }
            C44561j GW = ((C79138l) C86312j.m106911c(cls)).mo73990GW(u.f195562d, false);
            if (((C79138l) C86312j.m106911c(cls)).E10(GW) && !C74343y0.m88768l(f4Var) && f4Var.getStatus() != 1 && u.f195582i == 6) {
                C67391b bVar2 = this.f217174v;
                C87412m.m108591d(bVar2);
                e0Var.mo107136c(b, 111, 0, bVar2.mo91572m().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
            }
            if ((f4Var.mo101000j3() || f4Var.f230728K == 1) && mo103083Q(f4Var, this.f217174v) && mo103081O(f4Var.mo108768t())) {
                C67391b bVar3 = this.f217174v;
                C87412m.m108591d(bVar3);
                if (!bVar3.mo91580u()) {
                    e0Var.mo107136c(b, 123, 0, view.getContext().getString(C0966R.string.b_d), C0966R.raw.icons_filled_previous);
                }
            }
            boolean c = C47984k.m53329c();
            if (!Util.isImageExt(u.f195602n)) {
                C67391b bVar4 = this.f217174v;
                C87412m.m108591d(bVar4);
                e0Var.mo107136c(b, 150, 0, bVar4.mo91572m().getString(C0966R.string.b_9), C0966R.raw.icons_filled_otherapp);
            }
            if (c) {
                C67391b bVar5 = this.f217174v;
                C87412m.m108591d(bVar5);
                if (!bVar5.mo91584y()) {
                    e0Var.add(b, 114, 0, (CharSequence) view.getContext().getString(C0966R.string.b9w));
                }
            }
            C88144b.m109788f("favorite");
            if ((GW == null || !GW.mo69359k()) && u.f195582i != 74) {
                e0Var.mo107136c(b, 116, 0, view.getContext().getString(C0966R.string.f361137hk2), C0966R.raw.icons_filled_favorites);
            }
            ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new ExDeviceHaveBindNetworkDeviceEvent();
            exDeviceHaveBindNetworkDeviceEvent.f236178d.f236180a = f4Var.getMsgId();
            exDeviceHaveBindNetworkDeviceEvent.publish();
            if (exDeviceHaveBindNetworkDeviceEvent.f236179e.f236182a) {
                e0Var.mo107136c(b, 129, 0, view.getContext().getString(C0966R.string.b_8), C0966R.raw.icons_filled_open);
            }
            C67391b bVar6 = this.f217174v;
            C87412m.m108591d(bVar6);
            if (!bVar6.mo91584y()) {
                C67391b bVar7 = this.f217174v;
                C87412m.m108591d(bVar7);
                e0Var.mo107136c(b, 100, 0, bVar7.mo91572m().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
            }
            return true;
        }

        /* renamed from: a */
        public void mo70162a(View view, C67391b bVar, C72963f4 f4Var) {
            C87412m.m108591d(bVar);
            C76879j.m92707A(bVar.mo91565f(), bVar.mo91572m().getString(C0966R.string.f360268bb1), "", bVar.mo91572m().getString(C0966R.string.a2j), bVar.mo91572m().getString(C0966R.string.f7926wf), new C74011a(f4Var, bVar), C74012b.f217177d);
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            C68070l.C68072b u;
            C87412m.m108594g(f4Var, "msg");
            ((C98591h) C86312j.m106911c(C98591h.class)).Gr0(f4Var.mo108768t());
            String content = f4Var.getContent();
            if (content == null || (u = C68070l.C68072b.m80422u(content, (String) null)) == null) {
                return false;
            }
            C44561j appInfo = ((C79138l) C86312j.m106911c(C79138l.class)).getAppInfo(u.f195562d);
            if (appInfo != null && !Util.isNullOrNil(appInfo.field_appId)) {
                String s = C75592q0.m90789s();
                long y2 = f4Var.mo108774y2();
                C87412m.m108591d(bVar);
                mo103094j(bVar, u, s, appInfo, y2, bVar.mo91577r());
            }
            if (!C97625j3.m125812b().mo105883I()) {
                C87412m.m108591d(bVar);
                C76912y0.m92771j(bVar.mo91565f(), bVar.f193286j.getContentView());
                return true;
            } else if (Util.isImageExt(u.f195602n) && C74244u.C74261g.m88554z0(f4Var.getMsgId(), u.f195606o, bVar)) {
                return true;
            } else {
                Intent intent = new Intent();
                C87412m.m108591d(bVar);
                intent.setClassName(bVar.mo91565f(), "com.tencent.mm.ui.chatting.AppAttachNewDownloadUI");
                intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 2);
                intent.putExtra("app_msg_id", f4Var.getMsgId());
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C67391b bVar2 = bVar;
                C117292a.m165358d(bVar2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFile$ChattingItemAppMsgFileTo", "onItemClick", "(Landroid/view/View;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                bVar.mo91556Q((Intent) aVar.mo10231a(0));
                C117292a.m165359e(bVar2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFile$ChattingItemAppMsgFileTo", "onItemClick", "(Landroid/view/View;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return false;
            }
        }

        /* renamed from: d */
        public C72963f4.C72966d<?> mo82118d(C72963f4 f4Var, Context context, C39969i iVar) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(iVar, "talkerInfo");
            return new C74014e(f4Var);
        }

        /* JADX WARNING: Removed duplicated region for block: B:120:0x0238  */
        /* JADX WARNING: Removed duplicated region for block: B:133:0x025e  */
        /* JADX WARNING: Removed duplicated region for block: B:136:0x0269  */
        /* JADX WARNING: Removed duplicated region for block: B:139:0x0271  */
        /* JADX WARNING: Removed duplicated region for block: B:158:0x02cf  */
        /* JADX WARNING: Removed duplicated region for block: B:164:0x02e7  */
        /* JADX WARNING: Removed duplicated region for block: B:175:0x030a  */
        /* JADX WARNING: Removed duplicated region for block: B:178:0x0320  */
        /* JADX WARNING: Removed duplicated region for block: B:181:0x033c  */
        /* JADX WARNING: Removed duplicated region for block: B:182:0x0342  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x0188  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x018a  */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x01a4  */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo26237f(com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74026c r19, ck3.C67391b r20, com.tencent.p014mm.storage.C72963f4 r21, java.lang.String r22) {
            /*
                r18 = this;
                r8 = r18
                r0 = r19
                r9 = r20
                r10 = r21
                java.lang.Class<ym.l> r1 = p763ym.C79138l.class
                java.lang.Class<zj3.n> r2 = zj3.C79371n.class
                java.lang.String r3 = "ui"
                gy3.C87412m.m108594g(r9, r3)
                java.lang.String r3 = "msg"
                gy3.C87412m.m108594g(r10, r3)
                java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFile.AppMsgFileViewHolder"
                gy3.C87412m.m108592e(r0, r3)
                r11 = r0
                com.tencent.mm.ui.chatting.viewitems.h1$a r11 = (com.tencent.p014mm.p136ui.chatting.viewitems.C74001h1.C74002a) r11
                r8.f217174v = r9
                com.tencent.mm.ui.chatting.manager.a r0 = r9.f193278b
                xi.d r0 = r0.mo102812a(r2)
                zj3.n r0 = (zj3.C79371n) r0
                r0.mo102406W4(r10)
                java.lang.String r12 = r21.getContent()
                com.tencent.mm.ui.chatting.manager.a r0 = r9.f193278b
                xi.d r0 = r0.mo102812a(r2)
                zj3.n r0 = (zj3.C79371n) r0
                r0.mo102405C3(r10)
                r13 = 0
                if (r12 == 0) goto L_0x0048
                java.lang.String r0 = r21.mo108775z2()
                com.tencent.mm.message.l$b r0 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r12, r0)
                r14 = r0
                goto L_0x0049
            L_0x0048:
                r14 = r13
            L_0x0049:
                com.tencent.mm.ui.chatting.viewitems.t8 r15 = new com.tencent.mm.ui.chatting.viewitems.t8
                boolean r0 = r20.mo91583x()
                r15.<init>(r10, r0, r11, r13)
                if (r14 == 0) goto L_0x0350
                di3.d r0 = di3.C86312j.m106911c(r1)
                ym.l r0 = (p763ym.C79138l) r0
                java.lang.String r2 = r14.f195562d
                int r3 = r14.f195480E
                com.tencent.mm.pluginsdk.model.app.j r0 = r0.mo74003UV(r2, r3)
                com.tencent.mm.ui.widget.MMNeat7extView r2 = r11.f217140l
                if (r2 == 0) goto L_0x006d
                java.lang.String r3 = r14.mo93550m()
                r2.mo104279b(r3)
            L_0x006d:
                com.tencent.mm.ui.widget.MMNeat7extView r2 = r11.f217140l
                if (r2 != 0) goto L_0x0072
                goto L_0x0079
            L_0x0072:
                java.lang.String r3 = r14.mo93550m()
                r2.setContentDescription(r3)
            L_0x0079:
                android.widget.TextView r2 = r11.f217141m
                if (r2 != 0) goto L_0x007e
                goto L_0x0083
            L_0x007e:
                java.lang.String r3 = r14.f195574g
                r2.setText(r3)
            L_0x0083:
                com.tencent.mm.ui.widget.MMNeat7extView r2 = r11.f217140l
                if (r2 == 0) goto L_0x0099
                android.app.Activity r3 = r20.mo91565f()
                android.content.res.Resources r3 = r3.getResources()
                r4 = 2131099800(0x7f060098, float:1.7811963E38)
                int r3 = r3.getColor(r4)
                r2.setTextColor(r3)
            L_0x0099:
                android.widget.TextView r2 = r11.f217141m
                if (r2 == 0) goto L_0x00af
                android.app.Activity r3 = r20.mo91565f()
                android.content.res.Resources r3 = r3.getResources()
                r4 = 2131100897(0x7f0604e1, float:1.7814188E38)
                int r3 = r3.getColor(r4)
                r2.setTextColor(r3)
            L_0x00af:
                android.widget.LinearLayout r2 = r11.f217139k
                if (r2 == 0) goto L_0x00b9
                r3 = 2131231726(0x7f0803ee, float:1.8079541E38)
                r2.setBackgroundResource(r3)
            L_0x00b9:
                android.widget.LinearLayout r2 = r11.f217139k
                r6 = 0
                if (r2 == 0) goto L_0x00d0
                android.app.Activity r3 = r20.mo91565f()
                android.content.res.Resources r3 = r3.getResources()
                r4 = 2131165574(0x7f070186, float:1.7945369E38)
                int r3 = r3.getDimensionPixelSize(r4)
                r2.setPadding(r6, r3, r6, r6)
            L_0x00d0:
                com.tencent.mm.ui.MMImageView r2 = r11.f217130b
                if (r2 != 0) goto L_0x00d5
                goto L_0x00d8
            L_0x00d5:
                r2.setVisibility(r6)
            L_0x00d8:
                android.widget.RelativeLayout r2 = r11.f217143o
                if (r2 != 0) goto L_0x00dd
                goto L_0x00e0
            L_0x00dd:
                r2.setVisibility(r6)
            L_0x00e0:
                android.widget.TextView r2 = r11.f217141m
                if (r2 != 0) goto L_0x00e5
                goto L_0x00e8
            L_0x00e5:
                r2.setVisibility(r6)
            L_0x00e8:
                android.widget.ImageView r2 = r11.f217137i
                r7 = 8
                if (r2 != 0) goto L_0x00ef
                goto L_0x00f2
            L_0x00ef:
                r2.setVisibility(r7)
            L_0x00f2:
                android.widget.ImageView r2 = r11.f217138j
                if (r2 != 0) goto L_0x00f7
                goto L_0x00fa
            L_0x00f7:
                r2.setVisibility(r7)
            L_0x00fa:
                android.widget.ImageView r2 = r11.f217136h
                if (r2 != 0) goto L_0x00ff
                goto L_0x0102
            L_0x00ff:
                r2.setVisibility(r7)
            L_0x0102:
                android.widget.ImageView r2 = r11.f217134f
                if (r2 != 0) goto L_0x0107
                goto L_0x010a
            L_0x0107:
                r2.setVisibility(r7)
            L_0x010a:
                android.widget.TextView r2 = r11.f217135g
                if (r2 != 0) goto L_0x010f
                goto L_0x0112
            L_0x010f:
                r2.setVisibility(r7)
            L_0x0112:
                android.widget.LinearLayout r2 = r11.f217139k
                if (r2 != 0) goto L_0x0117
                goto L_0x011a
            L_0x0117:
                r2.setVisibility(r6)
            L_0x011a:
                android.view.View r2 = r11.clickArea
                int r3 = r11.f217149u
                r11.resetChatBubbleWidth(r2, r3)
                r5 = 1
                if (r0 == 0) goto L_0x0174
                java.lang.String r2 = r0.field_appName
                if (r2 == 0) goto L_0x0174
                java.lang.String r3 = "appInfo.field_appName"
                gy3.C87412m.m108593f(r2, r3)
                int r3 = r2.length()
                int r3 = r3 - r5
                r4 = 0
                r16 = 0
            L_0x0135:
                if (r4 > r3) goto L_0x0161
                if (r16 != 0) goto L_0x013b
                r7 = r4
                goto L_0x013c
            L_0x013b:
                r7 = r3
            L_0x013c:
                char r7 = r2.charAt(r7)
                r13 = 32
                int r7 = gy3.C87412m.m108596i(r7, r13)
                if (r7 > 0) goto L_0x014a
                r7 = 1
                goto L_0x014b
            L_0x014a:
                r7 = 0
            L_0x014b:
                if (r16 != 0) goto L_0x0158
                if (r7 != 0) goto L_0x0155
                r7 = 8
                r13 = 0
                r16 = 1
                goto L_0x0135
            L_0x0155:
                int r4 = r4 + 1
                goto L_0x015d
            L_0x0158:
                if (r7 != 0) goto L_0x015b
                goto L_0x0161
            L_0x015b:
                int r3 = r3 + -1
            L_0x015d:
                r7 = 8
                r13 = 0
                goto L_0x0135
            L_0x0161:
                int r3 = r3 + r5
                java.lang.CharSequence r2 = r2.subSequence(r4, r3)
                java.lang.String r2 = r2.toString()
                int r2 = r2.length()
                if (r2 > 0) goto L_0x0171
                goto L_0x0174
            L_0x0171:
                java.lang.String r2 = r0.field_appName
                goto L_0x0176
            L_0x0174:
                java.lang.String r2 = r14.f195484F
            L_0x0176:
                int r3 = r14.f195582i
                r4 = 20
                if (r3 == r4) goto L_0x018a
                java.lang.String r3 = r14.f195562d
                java.lang.String r4 = "wxaf060266bfa9a35c"
                boolean r3 = gy3.C87412m.m108589b(r4, r3)
                if (r3 == 0) goto L_0x0188
                goto L_0x018a
            L_0x0188:
                r3 = 1
                goto L_0x0192
            L_0x018a:
                wc3.b0 r3 = wc3.C78535a0.m94863b()
                boolean r3 = r3.isShowShakeTV()
            L_0x0192:
                if (r3 == 0) goto L_0x0238
                java.lang.String r3 = r14.f195562d
                if (r3 == 0) goto L_0x0238
                int r3 = r3.length()
                if (r3 <= 0) goto L_0x0238
                boolean r3 = r8.mo103084W(r2)
                if (r3 == 0) goto L_0x0238
                di3.d r1 = di3.C86312j.m106911c(r1)
                ym.l r1 = (p763ym.C79138l) r1
                android.app.Activity r3 = r20.mo91565f()
                java.lang.String r1 = r1.mo74019xG(r3, r0, r2)
                int r2 = r14.f195582i
                r3 = 19
                if (r2 != r3) goto L_0x01d4
                android.widget.TextView r2 = r11.f217133e
                if (r2 != 0) goto L_0x01bd
                goto L_0x01dc
            L_0x01bd:
                android.app.Activity r3 = r20.mo91565f()
                android.content.res.Resources r3 = r3.getResources()
                r4 = 2131833874(0x7f113412, float:1.9300842E38)
                java.lang.Object[] r7 = new java.lang.Object[r5]
                r7[r6] = r1
                java.lang.String r1 = r3.getString(r4, r7)
                r2.setText(r1)
                goto L_0x01dc
            L_0x01d4:
                android.widget.TextView r2 = r11.f217133e
                if (r2 != 0) goto L_0x01d9
                goto L_0x01dc
            L_0x01d9:
                r2.setText(r1)
            L_0x01dc:
                android.widget.LinearLayout r1 = r11.f217131c
                if (r1 != 0) goto L_0x01e1
                goto L_0x01e4
            L_0x01e1:
                r1.setVisibility(r6)
            L_0x01e4:
                android.widget.TextView r1 = r11.f217133e
                if (r1 != 0) goto L_0x01e9
                goto L_0x01ec
            L_0x01e9:
                r1.setVisibility(r6)
            L_0x01ec:
                android.widget.TextView r1 = r11.f217133e
                r13 = 0
                if (r1 == 0) goto L_0x01f4
                r1.setCompoundDrawables(r13, r13, r13, r13)
            L_0x01f4:
                android.widget.ImageView r1 = r11.f217132d
                if (r1 != 0) goto L_0x01f9
                goto L_0x01fc
            L_0x01f9:
                r1.setVisibility(r6)
            L_0x01fc:
                if (r0 == 0) goto L_0x021d
                boolean r1 = r0.mo69359k()
                if (r1 == 0) goto L_0x021d
                android.widget.TextView r2 = r11.f217133e
                java.lang.String r7 = r0.field_packageName
                long r16 = r21.mo108774y2()
                r0 = r18
                r1 = r20
                r3 = r21
                r4 = r14
                r13 = 1
                r5 = r7
                r13 = 8
                r6 = r16
                r0.mo103074H(r1, r2, r3, r4, r5, r6)
                goto L_0x0226
            L_0x021d:
                r13 = 8
                android.widget.TextView r0 = r11.f217133e
                java.lang.String r1 = r14.f195562d
                r8.mo103076J(r9, r0, r1)
            L_0x0226:
                android.widget.ImageView r0 = r11.f217132d
                if (r0 == 0) goto L_0x0230
                r1 = 2131231699(0x7f0803d3, float:1.8079486E38)
                r0.setImageResource(r1)
            L_0x0230:
                android.widget.ImageView r0 = r11.f217132d
                java.lang.String r1 = r14.f195562d
                r8.mo103078L(r9, r0, r1)
                goto L_0x025a
            L_0x0238:
                r13 = 8
                com.tencent.mm.ui.chatting.viewitems.h1$d r0 = com.tencent.p014mm.p136ui.chatting.viewitems.C74001h1.f217129a
                boolean r0 = r0.mo103064a(r14, r11)
                if (r0 != 0) goto L_0x025a
                android.widget.LinearLayout r0 = r11.f217131c
                if (r0 != 0) goto L_0x0247
                goto L_0x024a
            L_0x0247:
                r0.setVisibility(r13)
            L_0x024a:
                android.widget.TextView r0 = r11.f217133e
                if (r0 != 0) goto L_0x024f
                goto L_0x0252
            L_0x024f:
                r0.setVisibility(r13)
            L_0x0252:
                android.widget.ImageView r0 = r11.f217132d
                if (r0 != 0) goto L_0x0257
                goto L_0x025a
            L_0x0257:
                r0.setVisibility(r13)
            L_0x025a:
                android.widget.LinearLayout r0 = r11.f217131c
                if (r0 == 0) goto L_0x0264
                r1 = 2131234067(0x7f080d13, float:1.808429E38)
                r0.setBackgroundResource(r1)
            L_0x0264:
                com.tencent.mm.ui.MMImageView r0 = r11.f217130b
                if (r0 != 0) goto L_0x0269
                goto L_0x026d
            L_0x0269:
                r1 = 0
                r0.setVisibility(r1)
            L_0x026d:
                boolean r0 = r8.f217197d
                if (r0 == 0) goto L_0x02cf
                int r0 = r14.f195582i
                r1 = 33
                if (r0 == r1) goto L_0x02ad
                r1 = 36
                if (r0 == r1) goto L_0x02ad
                r1 = 44
                if (r0 == r1) goto L_0x02ad
                r1 = 48
                if (r0 == r1) goto L_0x02ad
                java.lang.String r0 = r21.mo108765s2()
                boolean r0 = com.tencent.p014mm.p136ui.chatting.viewitems.C74244u.C74247d.m88512b(r0)
                if (r0 != 0) goto L_0x02ad
                java.lang.Class<gt.k> r0 = p158gt.C98201k.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                gt.k r0 = (p158gt.C98201k) r0
                gt.m r0 = r0.mo137277xi()
                java.lang.String r1 = r21.mo108765s2()
                android.app.Activity r2 = r20.mo91565f()
                float r2 = kg3.C76577a.m92156g(r2)
                com.tencent.mm.modelimage.m r0 = (com.tencent.p014mm.modelimage.C92839m) r0
                r3 = 0
                android.graphics.Bitmap r0 = r0.mo127188jo(r1, r2, r3)
                goto L_0x02ae
            L_0x02ad:
                r0 = 0
            L_0x02ae:
                if (r0 == 0) goto L_0x02cd
                boolean r1 = r0.isRecycled()
                if (r1 != 0) goto L_0x02cd
                android.app.Activity r1 = r20.mo91565f()
                r2 = 1
                int r1 = kg3.C76577a.m92151b(r1, r2)
                float r1 = (float) r1
                r2 = 0
                android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r0, r2, r1)
                com.tencent.mm.ui.MMImageView r1 = r11.f217130b
                if (r1 == 0) goto L_0x02e1
                r1.setImageBitmap(r0)
                goto L_0x02e1
            L_0x02cd:
                r4 = 1
                goto L_0x02e2
            L_0x02cf:
                com.tencent.mm.ui.MMImageView r0 = r11.f217130b
                if (r0 == 0) goto L_0x02e1
                android.content.res.Resources r1 = r20.mo91572m()
                r2 = 2131234285(0x7f080ded, float:1.8084731E38)
                android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeResource(r1, r2)
                r0.setImageBitmap(r1)
            L_0x02e1:
                r4 = 0
            L_0x02e2:
                com.tencent.mm.ui.widget.MMNeat7extView r0 = r11.f217140l
                r7 = 2
                if (r0 == 0) goto L_0x0306
                java.lang.String r1 = r14.f195570f
                if (r1 == 0) goto L_0x0303
                java.lang.String r2 = "content.title"
                gy3.C87412m.m108593f(r1, r2)
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x02f8
                r6 = 1
                goto L_0x02f9
            L_0x02f8:
                r6 = 0
            L_0x02f9:
                if (r6 == 0) goto L_0x0303
                r1 = 0
                r0.setVisibility(r1)
                r0.setMaxLines(r7)
                goto L_0x0306
            L_0x0303:
                r0.setVisibility(r13)
            L_0x0306:
                android.widget.TextView r0 = r11.f217141m
                if (r0 == 0) goto L_0x031b
                r1 = 0
                r0.setVisibility(r1)
                r0.setMaxLines(r7)
                int r1 = r14.f195594l
                long r1 = (long) r1
                java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.getSizeKB(r1)
                r0.setText(r1)
            L_0x031b:
                android.widget.ImageView r0 = r11.f217136h
                if (r0 != 0) goto L_0x0320
                goto L_0x0324
            L_0x0320:
                r1 = 4
                r0.setVisibility(r1)
            L_0x0324:
                int r0 = r14.f195594l
                r11.mo103055d(r11, r12, r0)
                java.lang.String r5 = r14.f195606o
                java.lang.String r6 = r14.f195570f
                r0 = r11
                r1 = r20
                r2 = r14
                r3 = r21
                r0.mo103054c(r1, r2, r3, r4, r5, r6)
                boolean r0 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.m87878T()
                if (r0 == 0) goto L_0x0342
                r0 = 1
                r1 = 0
                r8.mo103093i0(r11, r1, r0)
                goto L_0x0350
            L_0x0342:
                r0 = 1
                r1 = 0
                int r2 = r21.getStatus()
                if (r2 >= r7) goto L_0x034c
                r6 = 1
                goto L_0x034d
            L_0x034c:
                r6 = 0
            L_0x034d:
                r8.mo103093i0(r11, r6, r0)
            L_0x0350:
                android.view.View r0 = r11.clickArea
                r0.setTag(r15)
                android.view.View r0 = r11.clickArea
                com.tencent.mm.ui.chatting.viewitems.i$f r1 = r8.mo103099u(r9)
                r0.setOnClickListener(r1)
                boolean r0 = r8.f217197d
                if (r0 == 0) goto L_0x037e
                android.view.View r0 = r11.clickArea
                com.tencent.mm.ui.chatting.viewitems.i$e r1 = r8.mo103098p(r9)
                r0.setOnLongClickListener(r1)
                android.view.View r0 = r11.clickArea
                java.lang.Class<zj3.l> r1 = zj3.C79368l.class
                com.tencent.mm.ui.chatting.manager.a r2 = r9.f193278b
                xi.d r1 = r2.mo102812a(r1)
                zj3.l r1 = (zj3.C79368l) r1
                com.tencent.mm.ui.chatting.h2 r1 = r1.mo108189Z4()
                r0.setOnTouchListener(r1)
            L_0x037e:
                java.lang.String r3 = r20.mo91573n()
                boolean r4 = r20.mo91583x()
                r0 = r18
                r1 = r11
                r2 = r21
                r5 = r20
                r6 = r18
                r0.mo103087e0(r1, r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74001h1.C74010c.mo26237f(com.tencent.mm.ui.chatting.viewitems.i$c, ck3.b, com.tencent.mm.storage.f4, java.lang.String):void");
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return z && i == 1090519089;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.h1$d */
    public static final class C74013d {
        public C74013d(C8480h hVar) {
        }

        /* renamed from: a */
        public final boolean mo103064a(C68070l.C68072b bVar, C74002a aVar) {
            C87412m.m108594g(bVar, "content");
            C87412m.m108594g(aVar, "holder");
            C90621r0 r0Var = (C90621r0) bVar.mo93555w(C90621r0.class);
            if (!(r0Var != null && !Util.isNullOrNil(r0Var.f260345b))) {
                return false;
            }
            LinearLayout linearLayout = aVar.f217131c;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            TextView textView = aVar.f217133e;
            if (textView != null) {
                textView.setVisibility(0);
            }
            TextView textView2 = aVar.f217133e;
            if (textView2 != null) {
                textView2.setText(C0966R.string.k3n);
            }
            ImageView imageView = aVar.f217132d;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            ImageView imageView2 = aVar.f217132d;
            if (imageView2 == null) {
                return true;
            }
            imageView2.setImageResource(C0966R.C0969drawable.cdj);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.h1$e */
    public static final class C74014e implements C72963f4.C72966d<C74014e> {

        /* renamed from: b */
        public final int f217178b;

        /* renamed from: c */
        public final C72683d f217179c;

        public C74014e(C72963f4 f4Var) {
            C72683d dVar = null;
            this.f217178b = C72695v.m85071m(f4Var != null ? f4Var.getContent() : null);
            this.f217179c = f4Var != null ? C72709y1.vx0().mo100150Yt(f4Var.getMsgId()) : dVar;
        }

        /* renamed from: a */
        public boolean mo82132a(Object obj) {
            C74014e eVar = (C74014e) obj;
            C87412m.m108594g(eVar, "other");
            if (this.f217178b != eVar.f217178b) {
                return false;
            }
            C72683d dVar = this.f217179c;
            return dVar != null && CommonKt.compareContentExt(dVar, eVar.f217179c);
        }
    }
}
