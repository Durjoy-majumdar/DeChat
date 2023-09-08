package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.content.DialogInterface;
import android.util.Pair;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.autogen.events.RecordOperationEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import ht1.C60166f;
import ht1.C60200t1;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import nm2.C76933e;
import s90.C77632o;
import se3.C77685c;
import te3.C64682rk1;

/* renamed from: com.tencent.mm.ui.chatting.b1 */
public class C73313b1 {

    /* renamed from: a */
    public static C73320g f215414a = new C73320g();

    /* renamed from: com.tencent.mm.ui.chatting.b1$a */
    public class C73314a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ List f215415d;

        /* renamed from: e */
        public final /* synthetic */ C77632o f215416e;

        /* renamed from: f */
        public final /* synthetic */ Context f215417f;

        /* renamed from: g */
        public final /* synthetic */ boolean f215418g;

        /* renamed from: h */
        public final /* synthetic */ String f215419h;

        /* renamed from: i */
        public final /* synthetic */ int f215420i;

        public C73314a(List list, C77632o oVar, Context context, boolean z, String str, int i) {
            this.f215415d = list;
            this.f215416e = oVar;
            this.f215417f = context;
            this.f215418g = z;
            this.f215419h = str;
            this.f215420i = i;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C77632o oVar;
            List list = this.f215415d;
            boolean z = true;
            if (list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C72963f4 f4Var = (C72963f4) it.next();
                    if (!C74343y0.m88768l(f4Var)) {
                        if (!f4Var.mo100995g4() && !C74343y0.m88747F(f4Var) && !C74343y0.m88742A(f4Var) && !C74343y0.m88773q(f4Var) && !C74343y0.m88746E(f4Var) && f4Var.getType() != -1879048186 && !C74343y0.m88776t(f4Var) && !C74343y0.m88771o(f4Var) && !C74343y0.m88770n(f4Var) && !C74343y0.m88768l(f4Var) && !C74343y0.m88767k(f4Var) && f4Var.getType() != 977272881 && f4Var.getType() != 318767153 && f4Var.getType() != 788529201 && f4Var.getType() != 1076887601 && f4Var.getType() != 889192497 && f4Var.getType() != 922746929) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } else {
                Log.m105928w("MicroMsg.ChattingEditModeLogic", "check contain only invalid send to friend msg error, select item empty");
            }
            if (z) {
                Log.m105928w("MicroMsg.ChattingEditModeRetransmitMsg", "only contain invalid msg, exit long click mode");
                C77632o oVar2 = this.f215416e;
                if (oVar2 != null) {
                    oVar2.mo22502r7(C77632o.C77633a.trans);
                    if (this.f215416e.mo22498e0()) {
                        C76933e.m92785a().mo107269c();
                    }
                }
            } else if (!C73313b1.m86455a(this.f215417f, this.f215415d, this.f215418g, this.f215419h, this.f215420i, this.f215416e) && (oVar = this.f215416e) != null && oVar.mo22498e0()) {
                C76933e.m92785a().mo107269c();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.b1$b */
    public class C73315b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C77632o f215421d;

        public C73315b(C77632o oVar) {
            this.f215421d = oVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C77632o oVar = this.f215421d;
            if (oVar != null && oVar.mo22498e0()) {
                C76933e.m92785a().mo107269c();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.b1$c */
    public class C73316c implements DialogInterface.OnClickListener {
        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.b1$d */
    public class C73317d implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C77632o f215422d;

        public C73317d(C77632o oVar) {
            this.f215422d = oVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C77632o oVar = this.f215422d;
            if (oVar != null) {
                oVar.mo22500m6(C77632o.C77633a.trans);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.b1$e */
    public class C73318e implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C77632o f215423d;

        public C73318e(C77632o oVar) {
            this.f215423d = oVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C77632o oVar = this.f215423d;
            if (oVar != null) {
                oVar.mo22500m6(C77632o.C77633a.trans);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.b1$f */
    public class C73319f implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C77632o f215424d;

        public C73319f(C77632o oVar) {
            this.f215424d = oVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C77632o oVar = this.f215424d;
            if (oVar != null) {
                oVar.mo22500m6(C77632o.C77633a.trans);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.b1$g */
    public static class C73320g {

        /* renamed from: a */
        public List<C72963f4> f215425a;

        /* renamed from: b */
        public boolean f215426b;

        /* renamed from: c */
        public WeakReference<C77632o> f215427c;

        /* renamed from: d */
        public String f215428d;

        /* renamed from: e */
        public DoFavoriteEvent f215429e;

        /* renamed from: f */
        public C77685c f215430f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03bd, code lost:
        if (r12.f267374a <= 0) goto L_0x03c2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0530  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0597  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x05a0  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x05aa  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m86455a(android.content.Context r19, java.util.List<com.tencent.p014mm.storage.C72963f4> r20, boolean r21, java.lang.String r22, int r23, s90.C77632o r24) {
        /*
            r9 = r19
            r1 = r21
            r2 = r22
            r3 = r23
            r10 = r24
            java.lang.Class<rz.u> r4 = p682rz.C101491u.class
            java.lang.Class<gw0.b> r5 = gw0.C76073b.class
            java.lang.Class<gt.k> r6 = p158gt.C98201k.class
            boolean r0 = com.tencent.p014mm.p136ui.chatting.C74343y0.m88779w(r20)
            r7 = 2131820552(0x7f110008, float:1.9273822E38)
            java.lang.String r8 = ""
            r11 = 0
            if (r0 == 0) goto L_0x0030
            r0 = 2131824449(0x7f110f41, float:1.9281726E38)
            java.lang.String r0 = r9.getString(r0)
            java.lang.String r1 = r9.getString(r7)
            com.tencent.mm.ui.chatting.b1$d r2 = new com.tencent.mm.ui.chatting.b1$d
            r2.<init>(r10)
            nj3.C76879j.m92754y(r9, r0, r8, r1, r2)
            return r11
        L_0x0030:
            if (r20 == 0) goto L_0x0094
            boolean r0 = r20.isEmpty()
            if (r0 == 0) goto L_0x0039
            goto L_0x0094
        L_0x0039:
            java.util.Iterator r0 = r20.iterator()
        L_0x003d:
            boolean r13 = r0.hasNext()
            if (r13 == 0) goto L_0x0094
            java.lang.Object r13 = r0.next()
            com.tencent.mm.storage.f4 r13 = (com.tencent.p014mm.storage.C72963f4) r13
            boolean r14 = r13.mo101016t3()
            if (r14 != 0) goto L_0x0050
            goto L_0x003d
        L_0x0050:
            java.lang.Class<mh0.d> r14 = mh0.C99864d.class
            di3.d r14 = di3.C86312j.m106911c(r14)
            i40.e r14 = (i40.C98598e) r14
            java.lang.Class<ro.b> r15 = p1086ro.C101415b.class
            i40.b r14 = i40.C98597b.m128130c3(r14, r15)
            ro.b r14 = (p1086ro.C101415b) r14
            java.lang.String r15 = r13.getContent()
            if (r15 != 0) goto L_0x0068
            r7 = 0
            goto L_0x008c
        L_0x0068:
            ig.a r15 = new ig.a
            r15.<init>()
            java.lang.String r12 = r13.getContent()
            java.lang.String r7 = "msgInfo.content"
            gy3.C87412m.m108593f(r12, r7)
            r15.mo141099d(r12)
            ig.g r7 = new ig.g
            r7.<init>()
            java.lang.String r12 = r15.f289309p
            r7.mo141099d(r12)
            java.lang.String r12 = r15.f289309p
            r7.mo141099d(r12)
            boolean r7 = r14.mo140925i3(r7, r13)
        L_0x008c:
            if (r7 == 0) goto L_0x0090
            r0 = 1
            goto L_0x0095
        L_0x0090:
            r7 = 2131820552(0x7f110008, float:1.9273822E38)
            goto L_0x003d
        L_0x0094:
            r0 = 0
        L_0x0095:
            r7 = 3
            r12 = 0
            if (r0 == 0) goto L_0x00ab
            if (r3 != r7) goto L_0x00ab
            r0 = 2131824451(0x7f110f43, float:1.928173E38)
            java.lang.String r0 = r9.getString(r0)
            com.tencent.mm.ui.chatting.b1$e r1 = new com.tencent.mm.ui.chatting.b1$e
            r1.<init>(r10)
            nj3.C76879j.m92750u(r9, r0, r8, r1, r12)
            return r11
        L_0x00ab:
            boolean r0 = com.tencent.p014mm.p136ui.chatting.C74343y0.m88778v(r20)
            if (r0 == 0) goto L_0x00c8
            r0 = 2131824448(0x7f110f40, float:1.9281724E38)
            java.lang.String r0 = r9.getString(r0)
            r1 = 2131820552(0x7f110008, float:1.9273822E38)
            java.lang.String r1 = r9.getString(r1)
            com.tencent.mm.ui.chatting.b1$f r2 = new com.tencent.mm.ui.chatting.b1$f
            r2.<init>(r10)
            nj3.C76879j.m92754y(r9, r0, r8, r1, r2)
            return r11
        L_0x00c8:
            com.tencent.mm.ui.chatting.b1$g r13 = f215414a
            java.util.LinkedList r14 = new java.util.LinkedList
            r14.<init>()
            java.util.Iterator r15 = r20.iterator()
        L_0x00d3:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x01ff
            java.lang.Object r0 = r15.next()
            com.tencent.mm.storage.f4 r0 = (com.tencent.p014mm.storage.C72963f4) r0
            boolean r16 = eb0.C75569c4.m90690w(r0)
            if (r16 == 0) goto L_0x01ef
            com.tencent.mm.storage.f4 r11 = new com.tencent.mm.storage.f4
            r11.<init>()
            int r12 = r0.getType()
            r11.setType(r12)
            r12 = r8
            long r7 = r0.getCreateTime()
            r11.mo108733M2(r7)
            java.lang.String r7 = r0.mo101010p2()
            r11.mo108736P2(r7)
            java.lang.String r7 = r0.mo108768t()
            r11.mo108749c3(r7)
            java.lang.String r0 = r0.mo100965E2()
            r11.mo108753g3(r0)
            int r0 = r11.getType()
            r7 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r7
            r7 = 1
            if (r0 == r7) goto L_0x0163
            r7 = 3
            if (r0 == r7) goto L_0x0154
            r7 = 43
            if (r0 == r7) goto L_0x0145
            r7 = 49
            r8 = 2131821715(0x7f110493, float:1.927618E38)
            if (r0 == r7) goto L_0x0139
            r7 = 536936497(0x20010031, float:1.0926788E-19)
            if (r0 == r7) goto L_0x012d
            goto L_0x016d
        L_0x012d:
            java.lang.String r0 = r9.getString(r8)
            r11.mo108732L2(r0)
            r7 = 1
            r11.setType(r7)
            goto L_0x016d
        L_0x0139:
            r7 = 1
            java.lang.String r0 = r9.getString(r8)
            r11.mo108732L2(r0)
            r11.setType(r7)
            goto L_0x016d
        L_0x0145:
            r7 = 1
            r0 = 2131821728(0x7f1104a0, float:1.9276207E38)
            java.lang.String r0 = r9.getString(r0)
            r11.mo108732L2(r0)
            r11.setType(r7)
            goto L_0x016d
        L_0x0154:
            r7 = 1
            r0 = 2131821636(0x7f110444, float:1.927602E38)
            java.lang.String r0 = r9.getString(r0)
            r11.mo108732L2(r0)
            r11.setType(r7)
            goto L_0x016d
        L_0x0163:
            r0 = 2131821702(0x7f110486, float:1.9276155E38)
            java.lang.String r0 = r9.getString(r0)
            r11.mo108732L2(r0)
        L_0x016d:
            java.lang.String r7 = "MicroMsg.MsgSourceHelper"
            java.lang.String r0 = r11.f230724G
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x01e9
            java.lang.String r0 = r11.f230724G
            java.lang.String r8 = "msgsource"
            r17 = r12
            r12 = 0
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r0, r8, r12)
            if (r0 == 0) goto L_0x01eb
            java.lang.String r8 = ".msgsource.sec_msg_node.sfn"
            java.lang.Object r0 = r0.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            r8 = 1
            if (r0 != r8) goto L_0x01eb
            java.lang.String r0 = r11.f230724G     // Catch:{ Exception -> 0x01dd }
            java.lang.String r8 = "<sec_msg_node"
            int r8 = r0.indexOf(r8)     // Catch:{ Exception -> 0x01dd }
            java.lang.String r12 = r11.f230724G     // Catch:{ Exception -> 0x01dd }
            r18 = r15
            java.lang.String r15 = "</sec_msg_node"
            int r12 = r12.indexOf(r15)     // Catch:{ Exception -> 0x01db }
            r15 = 12
            int r12 = r12 + r15
            r15 = 2
            int r12 = r12 + r15
            java.lang.String r0 = r0.substring(r8, r12)     // Catch:{ Exception -> 0x01db }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)     // Catch:{ Exception -> 0x01db }
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x01db }
            if (r8 != 0) goto L_0x01ed
            java.lang.String r8 = "<sfn"
            int r8 = r0.indexOf(r8)     // Catch:{ Exception -> 0x01db }
            java.lang.String r12 = "</sfn"
            int r12 = r0.indexOf(r12)     // Catch:{ Exception -> 0x01db }
            r15 = 3
            int r12 = r12 + r15
            r15 = 2
            int r12 = r12 + r15
            java.lang.String r8 = r0.substring(r8, r12)     // Catch:{ Exception -> 0x01db }
            java.lang.String r12 = r11.f230724G     // Catch:{ Exception -> 0x01db }
            java.lang.String r15 = "<sfn>0<sfn/>"
            java.lang.String r8 = r0.replace(r8, r15)     // Catch:{ Exception -> 0x01db }
            java.lang.String r0 = r12.replace(r0, r8)     // Catch:{ Exception -> 0x01db }
            r11.mo101012p4(r0)     // Catch:{ Exception -> 0x01db }
            goto L_0x01ed
        L_0x01db:
            r0 = move-exception
            goto L_0x01e0
        L_0x01dd:
            r0 = move-exception
            r18 = r15
        L_0x01e0:
            r8 = 0
            java.lang.Object[] r12 = new java.lang.Object[r8]
            java.lang.String r8 = "resetShareForbidden msg exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r8, r12)
            goto L_0x01ed
        L_0x01e9:
            r17 = r12
        L_0x01eb:
            r18 = r15
        L_0x01ed:
            r0 = r11
            goto L_0x01f3
        L_0x01ef:
            r17 = r8
            r18 = r15
        L_0x01f3:
            r14.add(r0)
            r8 = r17
            r15 = r18
            r7 = 3
            r11 = 0
            r12 = 0
            goto L_0x00d3
        L_0x01ff:
            r17 = r8
            r13.f215425a = r14
            com.tencent.mm.ui.chatting.b1$g r0 = f215414a
            r0.f215426b = r1
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference
            r7.<init>(r10)
            r0.f215427c = r7
            r0.f215428d = r2
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.tencent.mm.ui.transmit.MsgRetransmitUI> r7 = com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI.class
            r0.<init>(r9, r7)
            if (r10 == 0) goto L_0x0225
            boolean r7 = r24.mo22498e0()
            if (r7 == 0) goto L_0x0225
            java.lang.String r7 = "Retr_MsgFromMoreSelectRetransmit"
            r8 = 1
            r0.putExtra(r7, r8)
        L_0x0225:
            int r7 = r14.size()
            r8 = 19
            if (r7 <= 0) goto L_0x0279
            r7 = 0
            java.lang.Object r11 = r14.get(r7)
            com.tencent.mm.storage.f4 r11 = (com.tencent.p014mm.storage.C72963f4) r11
            boolean r11 = r11.mo100967F3()
            if (r11 == 0) goto L_0x0279
            di3.d r11 = di3.C86312j.m106911c(r5)
            gw0.b r11 = (gw0.C76073b) r11
            java.lang.Object r12 = r14.get(r7)
            com.tencent.mm.storage.f4 r12 = (com.tencent.p014mm.storage.C72963f4) r12
            long r12 = r12.getMsgId()
            java.lang.Object r15 = r14.get(r7)
            com.tencent.mm.storage.f4 r15 = (com.tencent.p014mm.storage.C72963f4) r15
            java.lang.String r7 = r15.getContent()
            s90.f r7 = r11.mo94597JZ(r12, r7)
            java.util.LinkedList<s90.j> r11 = r7.f226295i
            int r11 = r11.size()
            r12 = 1
            if (r11 <= r12) goto L_0x0279
            java.util.LinkedList<s90.j> r7 = r7.f226295i
            java.util.Iterator r7 = r7.iterator()
        L_0x0267:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L_0x0279
            java.lang.Object r11 = r7.next()
            s90.j r11 = (s90.C77630j) r11
            int r11 = r11.f226333o
            if (r11 != r8) goto L_0x0267
            r7 = 1
            goto L_0x027a
        L_0x0279:
            r7 = 0
        L_0x027a:
            r11 = 1
            java.lang.Object[] r12 = new java.lang.Object[r11]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r23)
            r13 = 0
            r12[r13] = r11
            java.lang.String r11 = "MicroMsg.ChattingEditModeRetransmitMsg"
            java.lang.String r13 = "doJob: forwardScene:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r13, r12)
            java.lang.String r11 = "Retr_From_Chatting_Forward_Scene"
            r0.putExtra(r11, r3)
            int r3 = r14.size()
            java.lang.String r11 = "Retr_Multi_Msg_List_from"
            java.lang.String r13 = "Retr_Msg_Type"
            r15 = 1
            if (r3 != r15) goto L_0x05c4
            if (r7 != 0) goto L_0x05c4
            r3 = 0
            java.lang.Object r7 = r14.get(r3)
            com.tencent.mm.storage.f4 r7 = (com.tencent.p014mm.storage.C72963f4) r7
            boolean r3 = r7.mo101020w3()
            if (r3 != 0) goto L_0x02b6
            boolean r3 = r7.mo100967F3()
            if (r3 == 0) goto L_0x02b1
            goto L_0x02b6
        L_0x02b1:
            r15 = r13
            r14 = r17
            goto L_0x0346
        L_0x02b6:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r14 = r17
            r3.append(r14)
            r15 = r13
            long r12 = r7.mo108774y2()
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = eb0.C86493v0.m107223a(r3)
            eb0.v0 r12 = eb0.C86493v0.m107224d()
            r13 = 1
            eb0.v0$c r12 = r12.mo120947c(r3, r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r8 = "msg_"
            r13.append(r8)
            long r8 = r7.mo108774y2()
            r13.append(r8)
            java.lang.String r8 = r13.toString()
            java.lang.String r9 = "prePublishId"
            r12.mo120962i(r9, r8)
            r8 = 0
            java.lang.String r9 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.m87890t(r7, r1, r8)
            java.lang.String r13 = "preUsername"
            r12.mo120962i(r13, r9)
            java.lang.String r9 = r7.mo108768t()
            java.lang.String r13 = "preChatName"
            r12.mo120962i(r13, r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            java.lang.String r8 = "preMsgIndex"
            r12.mo120962i(r8, r9)
            r8 = 1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            java.lang.String r13 = "sendAppMsgScene"
            r12.mo120962i(r13, r9)
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            java.lang.String r13 = "moreRetrAction"
            r12.mo120962i(r13, r9)
            java.lang.String r9 = "fromScene"
            if (r1 == 0) goto L_0x032d
            r13 = 2
            java.lang.Integer r8 = java.lang.Integer.valueOf(r13)
            r12.mo120962i(r9, r8)
            goto L_0x0334
        L_0x032d:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            r12.mo120962i(r9, r13)
        L_0x0334:
            java.lang.Class<jr2.r> r8 = jr2.C76442r.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            jr2.r r8 = (jr2.C76442r) r8
            java.lang.String r9 = "adExtStr"
            r8.mo106656pL(r9, r12, r7)
            java.lang.String r8 = "reportSessionId"
            r0.putExtra(r8, r3)
        L_0x0346:
            java.lang.String r3 = r7.getContent()
            boolean r8 = r7.mo100982U3()
            r9 = 23
            r12 = 4
            if (r8 == 0) goto L_0x0358
            r1 = 9
        L_0x0355:
            r6 = 2
            goto L_0x0591
        L_0x0358:
            boolean r8 = r7.mo100973L3()
            java.lang.String r13 = "Retr_File_Name"
            if (r8 == 0) goto L_0x0369
            r1 = 5
            java.lang.String r4 = r7.mo108765s2()
            r0.putExtra(r13, r4)
            goto L_0x0355
        L_0x0369:
            boolean r8 = r7.mo100975N3()
            if (r8 != 0) goto L_0x058e
            boolean r8 = r7.mo100981T3()
            if (r8 == 0) goto L_0x0377
            goto L_0x058e
        L_0x0377:
            boolean r8 = r7.mo100993e4()
            if (r8 == 0) goto L_0x038b
            if (r1 == 0) goto L_0x0389
            int r1 = r7.mo108769t2()
            if (r1 != 0) goto L_0x0389
            java.lang.String r3 = eb0.C75604z3.m90849u(r3)
        L_0x0389:
            r1 = 4
            goto L_0x0355
        L_0x038b:
            boolean r8 = r7.mo100979R3()
            if (r8 == 0) goto L_0x042c
            long r4 = r7.getMsgId()
            r8 = 0
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 <= 0) goto L_0x03b4
            di3.d r1 = di3.C86312j.m106911c(r6)
            gt.k r1 = (p158gt.C98201k) r1
            gt.m r1 = r1.mo137277xi()
            java.lang.String r4 = r7.mo108768t()
            long r8 = r7.getMsgId()
            com.tencent.mm.modelimage.m r1 = (com.tencent.p014mm.modelimage.C92839m) r1
            com.tencent.mm.modelimage.k r12 = r1.mo127200vP(r4, r8)
            goto L_0x03b5
        L_0x03b4:
            r12 = 0
        L_0x03b5:
            if (r12 == 0) goto L_0x03c0
            long r4 = r12.f267374a
            r8 = 0
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 > 0) goto L_0x03e2
            goto L_0x03c2
        L_0x03c0:
            r8 = 0
        L_0x03c2:
            long r4 = r7.mo108774y2()
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 <= 0) goto L_0x03e2
            di3.d r1 = di3.C86312j.m106911c(r6)
            gt.k r1 = (p158gt.C98201k) r1
            gt.m r1 = r1.mo137277xi()
            java.lang.String r4 = r7.mo108768t()
            long r8 = r7.mo108774y2()
            com.tencent.mm.modelimage.m r1 = (com.tencent.p014mm.modelimage.C92839m) r1
            com.tencent.mm.modelimage.k r12 = r1.mo127168NQ(r4, r8)
        L_0x03e2:
            int r1 = r12.f267376c
            int r4 = r12.f267377d
            if (r1 < r4) goto L_0x0408
            if (r4 == 0) goto L_0x0408
            di3.d r1 = di3.C86312j.m106911c(r6)
            gt.k r1 = (p158gt.C98201k) r1
            gt.m r1 = r1.mo137277xi()
            java.lang.Class<gt.l> r4 = p158gt.C76053l.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            gt.l r4 = (p158gt.C76053l) r4
            java.lang.String r4 = r4.mo106262y8(r12)
            com.tencent.mm.modelimage.m r1 = (com.tencent.p014mm.modelimage.C92839m) r1
            r5 = 1
            java.lang.String r1 = r1.mo127174TY(r4, r14, r14, r5)
            goto L_0x041d
        L_0x0408:
            di3.d r1 = di3.C86312j.m106911c(r6)
            gt.k r1 = (p158gt.C98201k) r1
            gt.m r1 = r1.mo137277xi()
            java.lang.String r4 = r7.mo108765s2()
            com.tencent.mm.modelimage.m r1 = (com.tencent.p014mm.modelimage.C92839m) r1
            r5 = 1
            java.lang.String r1 = r1.v10(r4, r5)
        L_0x041d:
            r0.putExtra(r13, r1)
            java.lang.String r1 = com.tencent.p014mm.modelimage.C1300x.m1391b(r7)
            java.lang.String r4 = "img_source_url"
            r0.putExtra(r4, r1)
            r1 = 0
            goto L_0x0355
        L_0x042c:
            boolean r6 = r7.mo100989b4()
            java.lang.String r8 = "Retr_length"
            if (r6 == 0) goto L_0x0454
            di3.d r1 = di3.C86312j.m106911c(r4)
            rz.u r1 = (p682rz.C101491u) r1
            java.lang.String r4 = r7.mo108765s2()
            hd0.n0 r1 = r1.mo140806Zd(r4)
            if (r1 == 0) goto L_0x0449
            int r1 = r1.f288566m
            r0.putExtra(r8, r1)
        L_0x0449:
            r1 = 11
            java.lang.String r4 = r7.mo108765s2()
            r0.putExtra(r13, r4)
            goto L_0x0355
        L_0x0454:
            boolean r6 = r7.mo100994f4()
            if (r6 == 0) goto L_0x0477
            di3.d r1 = di3.C86312j.m106911c(r4)
            rz.u r1 = (p682rz.C101491u) r1
            java.lang.String r4 = r7.mo108765s2()
            hd0.n0 r1 = r1.mo140806Zd(r4)
            if (r1 == 0) goto L_0x046f
            int r1 = r1.f288566m
            r0.putExtra(r8, r1)
        L_0x046f:
            java.lang.String r1 = r7.mo108765s2()
            r0.putExtra(r13, r1)
            goto L_0x047d
        L_0x0477:
            boolean r4 = r7.mo100983V3()
            if (r4 == 0) goto L_0x0480
        L_0x047d:
            r1 = 1
            goto L_0x0355
        L_0x0480:
            boolean r4 = r7.mo101020w3()
            if (r4 == 0) goto L_0x058a
            r4 = 0
            com.tencent.mm.message.l$b r6 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r3, r4)
            r4 = 10
            if (r6 == 0) goto L_0x049a
            r8 = 71
            int r13 = r6.f195582i
            if (r8 != r13) goto L_0x049a
            r4 = 26
        L_0x0497:
            r6 = 2
            goto L_0x052a
        L_0x049a:
            if (r6 == 0) goto L_0x04a5
            r8 = 73
            int r13 = r6.f195582i
            if (r8 != r13) goto L_0x04a5
            r4 = 22
            goto L_0x0497
        L_0x04a5:
            if (r6 == 0) goto L_0x04b0
            r8 = 51
            int r13 = r6.f195582i
            if (r8 != r13) goto L_0x04b0
            r4 = 18
            goto L_0x0497
        L_0x04b0:
            if (r6 == 0) goto L_0x04b9
            int r8 = r6.f195582i
            r13 = 19
            if (r13 != r8) goto L_0x04b9
        L_0x04b8:
            goto L_0x0497
        L_0x04b9:
            if (r6 == 0) goto L_0x04c2
            r8 = 24
            int r13 = r6.f195582i
            if (r8 != r13) goto L_0x04c2
            goto L_0x04b8
        L_0x04c2:
            if (r6 == 0) goto L_0x04cd
            r4 = 16
            int r8 = r6.f195582i
            if (r4 != r8) goto L_0x04cd
            r4 = 14
            goto L_0x0497
        L_0x04cd:
            if (r6 == 0) goto L_0x04d8
            r4 = 63
            int r8 = r6.f195582i
            if (r4 != r8) goto L_0x04d8
            r4 = 23
            goto L_0x0497
        L_0x04d8:
            if (r6 == 0) goto L_0x04e3
            r4 = 88
            int r8 = r6.f195582i
            if (r4 != r8) goto L_0x04e3
            r4 = 31
            goto L_0x0497
        L_0x04e3:
            if (r6 == 0) goto L_0x04ee
            r4 = 82
            int r8 = r6.f195582i
            if (r4 != r8) goto L_0x04ee
            r4 = 30
            goto L_0x0497
        L_0x04ee:
            if (r6 == 0) goto L_0x04f9
            r4 = 94
            int r8 = r6.f195582i
            if (r4 != r8) goto L_0x04f9
            r4 = 33
            goto L_0x0497
        L_0x04f9:
            if (r6 == 0) goto L_0x0504
            r4 = 98
            int r8 = r6.f195582i
            if (r4 != r8) goto L_0x0504
            r4 = 34
            goto L_0x0497
        L_0x0504:
            if (r6 == 0) goto L_0x0528
            r4 = 75
            int r8 = r6.f195582i
            if (r4 != r8) goto L_0x0528
            java.util.Map<java.lang.String, java.lang.String> r4 = r6.f195491G2
            int r6 = r6.f195479D2
            int r4 = ht1.C60167f1.m70144b(r4, r6)
            r6 = 2
            if (r4 == r6) goto L_0x0525
            r8 = 3
            if (r4 == r8) goto L_0x0522
            if (r4 == r12) goto L_0x051f
            r4 = 12
            goto L_0x052a
        L_0x051f:
            r4 = 32
            goto L_0x052a
        L_0x0522:
            r4 = 27
            goto L_0x052a
        L_0x0525:
            r4 = 28
            goto L_0x052a
        L_0x0528:
            r6 = 2
            r4 = 2
        L_0x052a:
            boolean r8 = r7.mo100967F3()
            if (r8 == 0) goto L_0x0588
            java.lang.String r8 = "is_group_chat"
            r0.putExtra(r8, r1)
            di3.d r1 = di3.C86312j.m106911c(r5)
            gw0.b r1 = (gw0.C76073b) r1
            long r12 = r7.getMsgId()
            java.lang.String r5 = r7.getContent()
            s90.f r1 = r1.mo94597JZ(r12, r5)
            java.util.LinkedList<s90.j> r5 = r1.f226295i
            if (r5 == 0) goto L_0x0588
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x0588
            java.util.LinkedList<s90.j> r1 = r1.f226295i
            java.lang.Object r1 = r1.getFirst()
            s90.j r1 = (s90.C77630j) r1
            int r1 = r1.f226333o
            r5 = 19
            if (r1 != r5) goto L_0x0588
            sj3.p r1 = sj3.C63941p.f181254a
            java.lang.String r5 = r7.getContent()
            r8 = 0
            s90.h r5 = r1.mo88706d(r5, r8)
            java.lang.String r8 = r5.f180629g
            java.lang.String r5 = r5.f180628f
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.mo88705c(r8, r5)
            if (r1 == 0) goto L_0x0588
            java.lang.Class<ht1.m4> r3 = ht1.C60186m4.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            ht1.m4 r3 = (ht1.C60186m4) r3
            com.tencent.mm.message.l$b r1 = r3.mo85186PP(r1)
            r3 = 0
            java.lang.String r3 = com.tencent.p014mm.message.C68070l.C68072b.m80420s(r1, r3, r3)
            r1 = 23
            goto L_0x0591
        L_0x0588:
            r1 = r4
            goto L_0x0591
        L_0x058a:
            r6 = 2
            r1 = 12
            goto L_0x0591
        L_0x058e:
            r6 = 2
            r1 = 8
        L_0x0591:
            boolean r4 = r7.mo100967F3()
            if (r4 == 0) goto L_0x0598
            r6 = 1
        L_0x0598:
            if (r10 == 0) goto L_0x05aa
            boolean r4 = r24.mo22503s0()
            if (r4 != 0) goto L_0x05aa
            r5 = r15
            r4 = 13
            r0.putExtra(r5, r4)
            r0.putExtra(r11, r2)
            goto L_0x05ae
        L_0x05aa:
            r5 = r15
            r0.putExtra(r5, r1)
        L_0x05ae:
            long r1 = r7.getMsgId()
            java.lang.String r4 = "Retr_Msg_Id"
            r0.putExtra(r4, r1)
            java.lang.String r1 = "Retr_Msg_content"
            r0.putExtra(r1, r3)
            java.lang.String r1 = "Edit_Mode_Sigle_Msg"
            r2 = 1
            r0.putExtra(r1, r2)
            r11 = r6
            goto L_0x0624
        L_0x05c4:
            r5 = r13
            r6 = 2
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = r14.size()
            r1.<init>(r3)
            java.util.Iterator r3 = r14.iterator()
        L_0x05d3:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x05eb
            java.lang.Object r4 = r3.next()
            com.tencent.mm.storage.f4 r4 = (com.tencent.p014mm.storage.C72963f4) r4
            long r7 = r4.getMsgId()
            java.lang.Long r4 = java.lang.Long.valueOf(r7)
            r1.add(r4)
            goto L_0x05d3
        L_0x05eb:
            java.lang.String r3 = "Retr_Msg_Id_List"
            r0.putExtra(r3, r1)
            if (r10 == 0) goto L_0x05fc
            boolean r1 = r24.mo22503s0()
            if (r1 != 0) goto L_0x05f9
            goto L_0x05fc
        L_0x05f9:
            r1 = 12
            goto L_0x0617
        L_0x05fc:
            boolean r1 = eb0.C45628s0.m50738C(r22)
            if (r1 == 0) goto L_0x0610
            java.lang.Class<rn.v> r1 = p227rn.C48053v.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            rn.v r1 = (p227rn.C48053v) r1
            boolean r1 = r1.mo72614OE(r2)
            if (r1 == 0) goto L_0x05f9
        L_0x0610:
            boolean r1 = eb0.C45628s0.m50751P(r22)
            if (r1 == 0) goto L_0x061b
            goto L_0x05f9
        L_0x0617:
            r0.putExtra(r5, r1)
            goto L_0x0623
        L_0x061b:
            r1 = 13
            r0.putExtra(r5, r1)
            r0.putExtra(r11, r2)
        L_0x0623:
            r11 = 2
        L_0x0624:
            java.lang.String r1 = "Retr_MsgFromScene"
            r0.putExtra(r1, r11)
            java.lang.String r1 = "Retr_show_success_tips"
            r2 = 1
            r0.putExtra(r1, r2)
            r1 = 17
            java.lang.String r2 = "scene_from"
            r0.putExtra(r2, r1)
            if (r10 == 0) goto L_0x063e
            boolean r1 = r24.mo22497N()
            if (r1 != 0) goto L_0x0680
        L_0x063e:
            k20.a r9 = new k20.a
            r9.<init>()
            r9.mo10233c(r0)
            java.lang.Object[] r2 = r9.mo10232b()
            java.lang.String r3 = "com/tencent/mm/ui/chatting/ChattingEditModeRetransmitMsg"
            java.lang.String r4 = "doJob"
            java.lang.String r5 = "(Landroid/content/Context;Ljava/util/List;ZLjava/lang/String;ILcom/tencent/mm/message/MsgJobCallback;)Z"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r1 = r19
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 0
            java.lang.Object r1 = r9.mo10231a(r1)
            android.content.Intent r1 = (android.content.Intent) r1
            r2 = r19
            r2.startActivity(r1)
            java.lang.String r3 = "com/tencent/mm/ui/chatting/ChattingEditModeRetransmitMsg"
            java.lang.String r4 = "doJob"
            java.lang.String r5 = "(Landroid/content/Context;Ljava/util/List;ZLjava/lang/String;ILcom/tencent/mm/message/MsgJobCallback;)Z"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r1 = r19
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
        L_0x0680:
            com.tencent.mm.ui.chatting.b1$g r1 = f215414a
            java.util.List<com.tencent.mm.storage.f4> r1 = r1.f215425a
            zt3.t r2 = zt3.C119157j.f356862d
            com.tencent.mm.ui.chatting.e1 r3 = new com.tencent.mm.ui.chatting.e1
            r3.<init>(r1)
            zt3.j r2 = (zt3.C119157j) r2
            java.lang.String r1 = "MicroMsg.ChattingEditModeSendToAppBrand$prepareAppBrandMsgToSend"
            r2.mo183876g(r3, r1)
            if (r10 == 0) goto L_0x06a1
            boolean r1 = r24.mo22497N()
            if (r1 == 0) goto L_0x06a1
            android.os.Bundle r0 = r0.getExtras()
            r10.mo22499g0(r0)
        L_0x06a1:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.C73313b1.m86455a(android.content.Context, java.util.List, boolean, java.lang.String, int, s90.o):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x023e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m86456b(android.content.Context r17, java.util.List<com.tencent.p014mm.storage.C72963f4> r18, boolean r19, java.lang.String r20, int r21, s90.C77632o r22) {
        /*
            r7 = r17
            r1 = r18
            r8 = r22
            com.tencent.mm.ui.chatting.b1$g r0 = f215414a
            r2 = 0
            r0.f215425a = r2
            r3 = 0
            r0.f215426b = r3
            r0.f215427c = r2
            r0.f215428d = r2
            r0.f215429e = r2
            r0.f215430f = r2
            java.lang.String r0 = "MicroMsg.ChattingEditModeRetransmitMsg"
            if (r7 != 0) goto L_0x0020
            java.lang.String r1 = "do retransmit fail, context is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            return r3
        L_0x0020:
            if (r1 == 0) goto L_0x0283
            boolean r4 = r18.isEmpty()
            if (r4 == 0) goto L_0x002a
            goto L_0x0283
        L_0x002a:
            r4 = 2131840199(0x7f114cc7, float:1.9313671E38)
            java.lang.String r5 = ""
            r9 = 1
            if (r8 == 0) goto L_0x007c
            boolean r6 = r22.mo22503s0()
            if (r6 != 0) goto L_0x007c
            long r10 = p645pj.C77092c.m93047i()
            com.tencent.mm.ui.chatting.t0 r6 = com.tencent.p014mm.p136ui.chatting.C73847t0.f216715a
            boolean r12 = r6.mo102884a(r1, r10)
            if (r12 == 0) goto L_0x005b
            r0 = 2131825934(0x7f11150e, float:1.9284738E38)
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.getSizeKB(r10)
            r1[r3] = r6
            java.lang.String r0 = r7.getString(r0, r1)
            java.lang.String r1 = r7.getString(r4)
            nj3.C76879j.m92754y(r7, r0, r5, r1, r2)
            return r3
        L_0x005b:
            long r10 = p645pj.C77092c.m93046h()
            boolean r6 = r6.mo102885b(r1, r10)
            if (r6 == 0) goto L_0x007c
            r0 = 2131825920(0x7f111500, float:1.928471E38)
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.getSizeKB(r10)
            r1[r3] = r6
            java.lang.String r0 = r7.getString(r0, r1)
            java.lang.String r1 = r7.getString(r4)
            nj3.C76879j.m92754y(r7, r0, r5, r1, r2)
            return r3
        L_0x007c:
            java.util.Iterator r6 = r18.iterator()
        L_0x0080:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L_0x00fb
            java.lang.Object r10 = r6.next()
            com.tencent.mm.storage.f4 r10 = (com.tencent.p014mm.storage.C72963f4) r10
            boolean r11 = com.tencent.p014mm.p136ui.chatting.C73764n3.m87369a(r10)
            if (r11 != 0) goto L_0x00a1
            r0 = 2131825584(0x7f1113b0, float:1.9284028E38)
            java.lang.String r0 = r7.getString(r0)
            java.lang.String r1 = r7.getString(r4)
            nj3.C76879j.m92754y(r7, r0, r5, r1, r2)
            return r3
        L_0x00a1:
            boolean r11 = com.tencent.p014mm.p136ui.chatting.C73764n3.m87370b(r10)
            if (r11 != 0) goto L_0x00b2
            r0 = 2131833837(0x7f1133ed, float:1.9300767E38)
            android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r7, (int) r0, (int) r3)
            r0.show()
            return r3
        L_0x00b2:
            if (r8 == 0) goto L_0x0080
            boolean r11 = r22.mo22503s0()
            if (r11 == 0) goto L_0x0080
            java.lang.Class<h81.h> r11 = h81.C32735h.class
            di3.d r11 = di3.C86312j.m106911c(r11)
            h81.h r11 = (h81.C32735h) r11
            h81.h$c r12 = h81.C32735h.C32737c.clicfg_forward_card
            int r11 = r11.mo58779Qe(r12, r3)
            if (r11 != r9) goto L_0x00cc
            r11 = 1
            goto L_0x00cd
        L_0x00cc:
            r11 = 0
        L_0x00cd:
            if (r11 == 0) goto L_0x00e4
            boolean r12 = com.tencent.p014mm.p136ui.chatting.C74343y0.m88774r(r10)
            if (r12 == 0) goto L_0x00e4
            r0 = 2131830412(0x7f11268c, float:1.929382E38)
            java.lang.String r0 = r7.getString(r0)
            java.lang.String r1 = r7.getString(r4)
            nj3.C76879j.m92754y(r7, r0, r5, r1, r2)
            return r3
        L_0x00e4:
            if (r11 == 0) goto L_0x0080
            boolean r10 = com.tencent.p014mm.p136ui.chatting.C74343y0.m88775s(r10)
            if (r10 == 0) goto L_0x0080
            r0 = 2131830413(0x7f11268d, float:1.9293823E38)
            java.lang.String r0 = r7.getString(r0)
            java.lang.String r1 = r7.getString(r4)
            nj3.C76879j.m92754y(r7, r0, r5, r1, r2)
            return r3
        L_0x00fb:
            r10 = r20
            boolean r4 = com.tencent.p014mm.p136ui.chatting.C74343y0.m88763g(r3, r1, r10, r8)
            if (r4 != 0) goto L_0x013c
            r0 = 2131831459(0x7f112aa3, float:1.9295944E38)
            java.lang.String r11 = r7.getString(r0)
            r0 = 2131821677(0x7f11046d, float:1.9276104E38)
            java.lang.String r12 = r7.getString(r0)
            r0 = 2131821426(0x7f110372, float:1.9275595E38)
            java.lang.String r13 = r7.getString(r0)
            com.tencent.mm.ui.chatting.b1$a r14 = new com.tencent.mm.ui.chatting.b1$a
            r0 = r14
            r1 = r18
            r2 = r22
            r3 = r17
            r4 = r19
            r5 = r20
            r6 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.tencent.mm.ui.chatting.b1$b r6 = new com.tencent.mm.ui.chatting.b1$b
            r6.<init>(r8)
            java.lang.String r2 = ""
            r0 = r17
            r1 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            nj3.C76879j.m92707A(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x027d
        L_0x013c:
            java.lang.Class<gt.k> r4 = p158gt.C98201k.class
            boolean r6 = r18.isEmpty()
            if (r6 == 0) goto L_0x014d
            java.lang.String r2 = "MicroMsg.ChattingEditModeLogic"
            java.lang.String r3 = "check contain invalid send to friend msg error, select item empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r3)
            goto L_0x0244
        L_0x014d:
            java.util.Iterator r6 = r18.iterator()
        L_0x0151:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto L_0x0244
            java.lang.Object r11 = r6.next()
            com.tencent.mm.storage.f4 r11 = (com.tencent.p014mm.storage.C72963f4) r11
            boolean r12 = r11.mo100972K3()
            if (r12 == 0) goto L_0x0164
            goto L_0x0151
        L_0x0164:
            boolean r12 = r11.mo100979R3()
            if (r12 == 0) goto L_0x01d8
            long r12 = r11.getMsgId()
            r14 = 0
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x018d
            di3.d r12 = di3.C86312j.m106911c(r4)
            gt.k r12 = (p158gt.C98201k) r12
            gt.m r12 = r12.mo137277xi()
            java.lang.String r13 = r11.mo108768t()
            long r2 = r11.getMsgId()
            com.tencent.mm.modelimage.m r12 = (com.tencent.p014mm.modelimage.C92839m) r12
            com.tencent.mm.modelimage.k r2 = r12.mo127200vP(r13, r2)
            goto L_0x018e
        L_0x018d:
            r2 = 0
        L_0x018e:
            if (r2 == 0) goto L_0x0196
            long r12 = r2.f267374a
            int r3 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r3 > 0) goto L_0x01b6
        L_0x0196:
            long r12 = r11.mo108774y2()
            int r3 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r3 <= 0) goto L_0x01b6
            di3.d r2 = di3.C86312j.m106911c(r4)
            gt.k r2 = (p158gt.C98201k) r2
            gt.m r2 = r2.mo137277xi()
            java.lang.String r3 = r11.mo108768t()
            long r12 = r11.mo108774y2()
            com.tencent.mm.modelimage.m r2 = (com.tencent.p014mm.modelimage.C92839m) r2
            com.tencent.mm.modelimage.k r2 = r2.mo127168NQ(r3, r12)
        L_0x01b6:
            if (r2 == 0) goto L_0x01d6
            di3.d r3 = di3.C86312j.m106911c(r4)
            gt.k r3 = (p158gt.C98201k) r3
            gt.m r3 = r3.mo137277xi()
            java.lang.Class<gt.l> r12 = p158gt.C76053l.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            gt.l r12 = (p158gt.C76053l) r12
            java.lang.String r2 = r12.mo106262y8(r2)
            com.tencent.mm.modelimage.m r3 = (com.tencent.p014mm.modelimage.C92839m) r3
            java.lang.String r2 = r3.mo127174TY(r2, r5, r5, r9)
            r3 = 0
            goto L_0x0220
        L_0x01d6:
            r3 = 0
            goto L_0x0201
        L_0x01d8:
            boolean r2 = r11.mo100989b4()
            if (r2 != 0) goto L_0x0209
            boolean r2 = r11.mo100994f4()
            if (r2 == 0) goto L_0x01e5
            goto L_0x0209
        L_0x01e5:
            boolean r2 = r11.mo101020w3()
            if (r2 == 0) goto L_0x0203
            java.lang.String r2 = r11.getContent()
            r3 = 0
            com.tencent.mm.message.l$b r2 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r2, r3)
            if (r2 == 0) goto L_0x0201
            java.lang.String r2 = r2.f195606o
            com.tencent.mm.pluginsdk.model.app.d r2 = com.tencent.p014mm.pluginsdk.model.app.C72695v.m85065g(r2)
            if (r2 == 0) goto L_0x0201
            java.lang.String r2 = r2.field_fileFullPath
            goto L_0x0220
        L_0x0201:
            r2 = r3
            goto L_0x0220
        L_0x0203:
            r3 = 0
            java.lang.String r2 = r11.mo108765s2()
            goto L_0x0220
        L_0x0209:
            r3 = 0
            java.lang.Class<rz.s> r2 = p682rz.C101488s.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            rz.s r2 = (p682rz.C101488s) r2
            rz.t r2 = r2.Kj0()
            java.lang.String r12 = r11.mo108765s2()
            hd0.o0 r2 = (hd0.C98410o0) r2
            java.lang.String r2 = r2.mo137728q(r12)
        L_0x0220:
            boolean r12 = r11.mo100979R3()
            if (r12 != 0) goto L_0x0238
            boolean r12 = r11.mo100994f4()
            if (r12 != 0) goto L_0x0238
            boolean r12 = r11.mo100989b4()
            if (r12 != 0) goto L_0x0238
            boolean r12 = com.tencent.p014mm.p136ui.chatting.C74343y0.m88782z(r11)
            if (r12 == 0) goto L_0x0242
        L_0x0238:
            boolean r2 = com.tencent.p014mm.p136ui.chatting.component.C73521l0.m86925b(r11, r2)
            if (r2 == 0) goto L_0x0242
            r2 = r3
            r3 = 0
            goto L_0x0151
        L_0x0242:
            r3 = 0
            goto L_0x0245
        L_0x0244:
            r3 = 1
        L_0x0245:
            if (r3 == 0) goto L_0x027e
            java.lang.String r2 = "slected msg is all expired or clean!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            if (r8 == 0) goto L_0x027d
            boolean r0 = r22.mo22503s0()
            if (r0 != 0) goto L_0x025a
            int r0 = r18.size()
            if (r0 != r9) goto L_0x0270
        L_0x025a:
            r0 = 2131825374(0x7f1112de, float:1.9283602E38)
            java.lang.String r0 = r7.getString(r0)
            r1 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r1 = r7.getString(r1)
            com.tencent.mm.ui.chatting.b1$c r2 = new com.tencent.mm.ui.chatting.b1$c
            r2.<init>()
            nj3.C76879j.m92749t(r7, r0, r1, r2)
        L_0x0270:
            boolean r0 = r22.mo22498e0()
            if (r0 == 0) goto L_0x027d
            nm2.e r0 = nm2.C76933e.m92785a()
            r0.mo107269c()
        L_0x027d:
            return r9
        L_0x027e:
            boolean r0 = m86455a(r17, r18, r19, r20, r21, r22)
            return r0
        L_0x0283:
            java.lang.String r1 = "do retransmit fail, select item empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.C73313b1.m86456b(android.content.Context, java.util.List, boolean, java.lang.String, int, s90.o):boolean");
    }

    /* renamed from: c */
    public static boolean m86457c(Context context, List<C72963f4> list, boolean z, String str, C77632o oVar) {
        return m86456b(context, list, z, str, 1, oVar);
    }

    /* renamed from: d */
    public static RecordOperationEvent m86458d(Context context) {
        RecordOperationEvent recordOperationEvent = new RecordOperationEvent();
        RecordOperationEvent.C92551a aVar = recordOperationEvent.f265027d;
        aVar.f265029a = 10;
        C73320g gVar = f215414a;
        aVar.f265040l = gVar.f215425a;
        aVar.f265042n = gVar.f215428d;
        aVar.f265041m = context;
        recordOperationEvent.publish();
        RecordOperationEvent.C92552b bVar = recordOperationEvent.f265028e;
        gVar.f215429e = bVar.f265053f;
        gVar.f215430f = bVar.f265054g;
        return recordOperationEvent;
    }

    /* renamed from: e */
    public static int m86459e() {
        List<C72963f4> list = f215414a.f215425a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: f */
    public static Pair<Long, Boolean> m86460f(Context context, String str, boolean z, String str2) {
        C73320g gVar;
        WeakReference<C77632o> weakReference;
        C60166f fVar;
        String str3;
        RecordOperationEvent recordOperationEvent = new RecordOperationEvent();
        RecordOperationEvent.C92551a aVar = recordOperationEvent.f265027d;
        int i = 5;
        aVar.f265029a = 5;
        C73320g gVar2 = f215414a;
        aVar.f265040l = gVar2.f215425a;
        aVar.f265033e = str;
        aVar.f265042n = gVar2.f215428d;
        aVar.f265041m = context;
        aVar.f265044p = gVar2.f215429e;
        aVar.f265045q = gVar2.f215430f;
        aVar.f265047s = str2;
        recordOperationEvent.publish();
        if (gVar2.f215425a != null) {
            C115669n.INSTANCE.mo160131h(10811, 8, Integer.valueOf(gVar2.f215425a.size()), Integer.valueOf(gVar2.f215425a.size() - C74343y0.m88761e(gVar2.f215425a)));
            LinkedList linkedList = new LinkedList();
            for (C72963f4 next : gVar2.f215425a) {
                long nowSecond = Util.nowSecond();
                C68070l.C68072b u = C68070l.C68072b.m80422u(Util.processXml(next.getContent()), (String) null);
                if (u != null && u.f195582i == i && !Util.isNullOrNil(u.f195586j)) {
                    int i2 = next.mo100967F3() ? 1 : 2;
                    try {
                        str3 = URLEncoder.encode(u.f195586j, "UTF-8");
                    } catch (UnsupportedEncodingException e) {
                        Log.printErrStackTrace("MicroMsg.ChattingEditModeRetransmitMsg", e, "", new Object[0]);
                        str3 = "";
                    }
                    i = 5;
                    Log.m105919d("MicroMsg.ChattingEditModeRetransmitMsg", "report(%s), url : %s, clickTimestamp : %d, scene : %d, actionType : %d, flag : %d", 13378, u.f195586j, Long.valueOf(nowSecond), Integer.valueOf(i2), 1, 1);
                    C115669n.INSTANCE.mo160131h(13378, str3, Long.valueOf(nowSecond), Integer.valueOf(i2), 1, 1);
                } else if (!(u == null || u.f195582i != 51 || (fVar = (C60166f) u.mo93555w(C60166f.class)) == null)) {
                    C64682rk1 rk12 = fVar.f171710b;
                    linkedList.add(new Pair(rk12.f185183d, rk12.f185191o));
                }
            }
            if (linkedList.size() > 0) {
                ((C60200t1) C86312j.m106911c(C60200t1.class)).Tr0(linkedList, false);
            }
        }
        if (!(!z || (weakReference = gVar.f215427c) == null || weakReference.get() == null)) {
            (gVar = f215414a).f215427c.get().mo22502r7(C77632o.C77633a.trans);
        }
        return new Pair<>(Long.valueOf(recordOperationEvent.f265028e.f265055h), Boolean.valueOf(recordOperationEvent.f265028e.f265056i));
    }
}
