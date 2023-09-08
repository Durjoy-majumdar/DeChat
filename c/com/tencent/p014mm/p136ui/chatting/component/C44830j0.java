package com.tencent.p014mm.p136ui.chatting.component;

import android.text.TextUtils;
import ck3.C39969i;
import ck3.C67391b;
import com.tencent.p014mm.plugin.game.luggage.C41985r;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import p270xi.C91212b;
import sy0.C48502a;
import xy1.C15912f;
import xy1.C15913g;
import xy1.C53472h;
import xy1.C53475k;
import zj3.C79366k;

@C91212b(exportInterface = C79366k.class)
/* renamed from: com.tencent.mm.ui.chatting.component.j0 */
public class C44830j0 extends C73412a implements C79366k {

    /* renamed from: com.tencent.mm.ui.chatting.component.j0$a */
    public class C44831a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C39969i f121664d;

        public C44831a(C44830j0 j0Var, C39969i iVar) {
            this.f121664d = iVar;
        }

        public void run() {
            Class cls = C75700k0.class;
            ArrayList arrayList = (ArrayList) ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).Qx0(Collections.singletonList("gamelifemessage"));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C72963f4 f4Var = (C72963f4) it.next();
                Set<Long> set = C48502a.f129711g;
                if (!C48502a.f129711g.contains(Long.valueOf(f4Var.getMsgId()))) {
                    f4Var.mo100991d(5);
                    ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(f4Var.getMsgId(), f4Var);
                }
            }
            C39969i iVar = this.f121664d;
            Log.m105925i("GameLife.ChattingComponent", "sending msg size=%s talker=%s username=%s", Integer.valueOf(arrayList.size()), iVar.f107142b, iVar.f107141a);
        }
    }

    /* renamed from: a */
    public void mo70128a() {
        C67391b bVar = this.f215752d;
        bVar.f193286j.setMMTitle(bVar.mo91574o().mo62898f());
        String n = ((C53475k) C86312j.m106911c(C53475k.class)).mo59162n(this.f215752d.mo91577r());
        if (TextUtils.isEmpty(n)) {
            Log.m105920e("GameLife.ChattingComponent", "talker username get failed!");
            return;
        }
        C15912f X3 = ((C15913g) C86312j.m106911c(C15913g.class)).mo440X3(n);
        if (X3 == null) {
            Log.m105920e("GameLife.ChattingComponent", "talker contact get failed!");
        } else if (!TextUtils.isEmpty(X3.getTag()) && X3.mo422D0() == 1) {
            this.f215752d.f193286j.setMMSubTitle(X3.getTag());
        }
    }

    /* renamed from: g1 */
    public boolean mo70129g1() {
        return C72996z1.m85832c5(this.f215752d.mo91577r());
    }

    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r4v2, types: [js.b$a] */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v20 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0211  */
    /* renamed from: g5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo70046g5() {
        /*
            r16 = this;
            r0 = r16
            java.lang.Class<zj3.w> r1 = zj3.C79387w.class
            boolean r2 = r16.mo70129g1()
            if (r2 != 0) goto L_0x000b
            return
        L_0x000b:
            java.lang.Class<xy1.g> r2 = xy1.C15913g.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            xy1.g r2 = (xy1.C15913g) r2
            ck3.b r3 = r0.f215752d
            java.lang.String r3 = r3.mo91573n()
            xy1.f r2 = r2.mo440X3(r3)
            java.lang.String r3 = "GameLife.ChattingComponent"
            if (r2 != 0) goto L_0x0027
            java.lang.String r2 = "self contact get failed!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r2)
            goto L_0x005a
        L_0x0027:
            ck3.b r4 = r0.f215752d
            com.tencent.mm.ui.chatting.manager.a r4 = r4.f193278b
            xi.d r4 = r4.mo102812a(r1)
            zj3.w r4 = (zj3.C79387w) r4
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r4 = r4.mo102193k1()
            if (r4 != 0) goto L_0x0038
            goto L_0x005a
        L_0x0038:
            ck3.b r5 = r0.f215752d
            r6 = 2131299186(0x7f090b72, float:1.8216366E38)
            android.view.View r5 = r5.mo91562c(r6)
            com.tencent.mm.ui.widget.cedit.api.a r5 = (com.tencent.p014mm.p136ui.widget.cedit.api.C74974a) r5
            java.lang.Class<com.tencent.mm.plugin.websearch.l> r6 = com.tencent.p014mm.plugin.websearch.C96603l.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            com.tencent.mm.plugin.websearch.l r6 = (com.tencent.p014mm.plugin.websearch.C96603l) r6
            boolean r6 = r6.Kr0()
            r5.mo104239a(r6)
            com.tencent.mm.ui.chatting.component.h0 r6 = new com.tencent.mm.ui.chatting.component.h0
            r6.<init>(r0, r5, r2, r4)
            r5.addOnLayoutChangeListener(r6)
        L_0x005a:
            ck3.b r2 = r0.f215752d
            com.tencent.mm.ui.chatting.manager.a r2 = r2.f193278b
            xi.d r1 = r2.mo102812a(r1)
            zj3.w r1 = (zj3.C79387w) r1
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r1.mo102193k1()
            if (r1 != 0) goto L_0x006c
            goto L_0x026f
        L_0x006c:
            py1.m r2 = com.tencent.p014mm.plugin.game.commlib.C41853c.m45374h()
            r4 = 0
            r5 = 1
            if (r2 != 0) goto L_0x0076
            goto L_0x025f
        L_0x0076:
            java.lang.Class<xy1.k> r6 = xy1.C53475k.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            xy1.k r6 = (xy1.C53475k) r6
            ck3.b r7 = r0.f215752d
            java.lang.String r7 = r7.mo91577r()
            java.lang.String r6 = r6.mo59162n(r7)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 == 0) goto L_0x0090
            goto L_0x025f
        L_0x0090:
            java.util.ArrayList r7 = new java.util.ArrayList
            java.util.LinkedList<py1.i> r8 = r2.f127861d
            int r8 = r8.size()
            r7.<init>(r8)
            java.util.LinkedList<py1.i> r2 = r2.f127861d
            java.util.Iterator r2 = r2.iterator()
        L_0x00a1:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x025e
            java.lang.Object r8 = r2.next()
            py1.i r8 = (py1.C47596i) r8
            int r9 = r8.f127767g
            if (r9 != 0) goto L_0x00b2
            goto L_0x00a1
        L_0x00b2:
            com.tencent.mm.pluginsdk.ui.chat.h$a r9 = new com.tencent.mm.pluginsdk.ui.chat.h$a
            r9.<init>()
            java.lang.String r10 = r8.f127765e
            r9.f120961y1 = r10
            boolean r10 = r8.f127766f
            r9.f120962z1 = r10
            int r10 = r8.f127767g
            r11 = 2
            if (r10 != r5) goto L_0x00c6
            r12 = 1
            goto L_0x00c7
        L_0x00c6:
            r12 = 2
        L_0x00c7:
            r9.f120942A1 = r12
            r12 = 0
            if (r10 != r5) goto L_0x014f
            py1.m3 r13 = r8.f127768h
            if (r13 == 0) goto L_0x014f
            java.lang.String r10 = r13.f127870d
            r9.f120944C1 = r10
            java.lang.String r10 = r13.f127871e
            ck3.b r13 = r0.f215752d
            java.lang.String r13 = r13.mo91573n()
            if (r13 == 0) goto L_0x0142
            if (r6 != 0) goto L_0x00e1
            goto L_0x0142
        L_0x00e1:
            java.lang.Object[] r14 = new java.lang.Object[r11]
            java.lang.String r13 = p206nj.C117627q.m165908a(r13)
            r14[r12] = r13
            java.lang.String r13 = p206nj.C117627q.m165908a(r6)
            r14[r5] = r13
            java.lang.String r13 = "from_username=%s&to_username=%s"
            java.lang.String r13 = java.lang.String.format(r13, r14)
            boolean r14 = android.text.TextUtils.isEmpty(r10)
            java.lang.String r15 = "?"
            if (r14 == 0) goto L_0x010d
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r15)
            r10.append(r13)
            java.lang.String r10 = r10.toString()
            goto L_0x0142
        L_0x010d:
            boolean r14 = r10.contains(r15)
            if (r14 == 0) goto L_0x0136
            boolean r14 = r10.endsWith(r15)
            if (r14 == 0) goto L_0x0129
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r10)
            r14.append(r13)
            java.lang.String r10 = r14.toString()
            goto L_0x0142
        L_0x0129:
            java.lang.Object[] r14 = new java.lang.Object[r11]
            r14[r12] = r10
            r14[r5] = r13
            java.lang.String r10 = "%s&%s"
            java.lang.String r10 = java.lang.String.format(r10, r14)
            goto L_0x0142
        L_0x0136:
            java.lang.Object[] r14 = new java.lang.Object[r11]
            r14[r12] = r10
            r14[r5] = r13
            java.lang.String r10 = "%s?%s"
            java.lang.String r10 = java.lang.String.format(r10, r14)
        L_0x0142:
            r9.f120946E1 = r10
            py1.m3 r10 = r8.f127768h
            int r10 = r10.f127872f
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r9.f120947F1 = r10
            goto L_0x0196
        L_0x014f:
            if (r10 != r11) goto L_0x0196
            java.lang.String r10 = r8.f127769i
            ck3.b r13 = r0.f215752d
            java.lang.String r13 = r13.mo91573n()
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r14 != 0) goto L_0x017e
            if (r13 == 0) goto L_0x017e
            if (r6 != 0) goto L_0x0164
            goto L_0x017e
        L_0x0164:
            android.net.Uri r10 = android.net.Uri.parse(r10)
            android.net.Uri$Builder r10 = r10.buildUpon()
            java.lang.String r14 = "from_username"
            r10.appendQueryParameter(r14, r13)
            java.lang.String r13 = "to_username"
            r10.appendQueryParameter(r13, r6)
            android.net.Uri r10 = r10.build()
            java.lang.String r10 = r10.toString()
        L_0x017e:
            r9.f120948G1 = r10
            int r13 = r8.f127774q
            r9.f120959R1 = r13
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x0196
            int r10 = r9.f120959R1
            if (r10 != 0) goto L_0x018f
            goto L_0x0196
        L_0x018f:
            java.lang.Class<com.tencent.mm.plugin.game.luggage.t> r10 = com.tencent.p014mm.plugin.game.luggage.C41993t.class
            java.lang.String r13 = r9.f120948G1
            com.tencent.p014mm.plugin.game.luggage.C41985r.m45637e(r10, r13, r4)
        L_0x0196:
            java.util.LinkedList<py1.f0> r10 = r8.f127770j
            java.util.Iterator r10 = r10.iterator()
        L_0x019c:
            boolean r13 = r10.hasNext()
            r14 = 3
            if (r13 == 0) goto L_0x0216
            java.lang.Object r13 = r10.next()
            py1.f0 r13 = (py1.C47576f0) r13
            java.lang.String r15 = r13.f127683f
            if (r15 != 0) goto L_0x01ae
            goto L_0x019c
        L_0x01ae:
            com.tencent.mm.pluginsdk.ui.chat.h$b r4 = new com.tencent.mm.pluginsdk.ui.chat.h$b
            r4.<init>()
            java.lang.String r12 = r13.f127681d
            r4.f120963a = r12
            java.lang.String r12 = r13.f127682e
            r4.f120964b = r12
            int r12 = r15.hashCode()
            r13 = 3241(0xca9, float:4.542E-42)
            if (r12 == r13) goto L_0x01f4
            r13 = 115861276(0x6e7e71c, float:8.7232127E-35)
            if (r12 == r13) goto L_0x01e9
            r13 = 115861428(0x6e7e7b4, float:8.7233E-35)
            if (r12 == r13) goto L_0x01de
            r13 = 115861812(0x6e7e934, float:8.7235204E-35)
            if (r12 == r13) goto L_0x01d3
            goto L_0x01fc
        L_0x01d3:
            java.lang.String r12 = "zh_TW"
            boolean r12 = r15.equals(r12)
            if (r12 != 0) goto L_0x01dc
            goto L_0x01fc
        L_0x01dc:
            r12 = 3
            goto L_0x01ff
        L_0x01de:
            java.lang.String r12 = "zh_HK"
            boolean r12 = r15.equals(r12)
            if (r12 != 0) goto L_0x01e7
            goto L_0x01fc
        L_0x01e7:
            r12 = 2
            goto L_0x01ff
        L_0x01e9:
            java.lang.String r12 = "zh_CN"
            boolean r12 = r15.equals(r12)
            if (r12 != 0) goto L_0x01f2
            goto L_0x01fc
        L_0x01f2:
            r12 = 1
            goto L_0x01ff
        L_0x01f4:
            java.lang.String r12 = "en"
            boolean r12 = r15.equals(r12)
            if (r12 != 0) goto L_0x01fe
        L_0x01fc:
            r12 = -1
            goto L_0x01ff
        L_0x01fe:
            r12 = 0
        L_0x01ff:
            if (r12 == 0) goto L_0x0211
            if (r12 == r5) goto L_0x020e
            if (r12 == r11) goto L_0x020b
            if (r12 == r14) goto L_0x0208
            goto L_0x0213
        L_0x0208:
            r9.f120951J1 = r4
            goto L_0x0213
        L_0x020b:
            r9.f120950I1 = r4
            goto L_0x0213
        L_0x020e:
            r9.f120949H1 = r4
            goto L_0x0213
        L_0x0211:
            r9.f120952K1 = r4
        L_0x0213:
            r4 = 0
            r12 = 0
            goto L_0x019c
        L_0x0216:
            java.lang.String r4 = r8.f127771n
            r9.f120953L1 = r4
            java.lang.String r4 = r8.f127772o
            r9.f120954M1 = r4
            r4 = 56
            r9.f120956O1 = r4
            r9.f120955N1 = r4
            com.tencent.mm.ui.chatting.component.i0 r4 = new com.tencent.mm.ui.chatting.component.i0
            r4.<init>(r0, r8)
            r9.f120960S1 = r4
            r4 = 6
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r10 = r9.f120961y1
            r12 = 0
            r4[r12] = r10
            int r10 = r9.f120962z1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r4[r5] = r10
            java.lang.String r10 = r9.f120944C1
            r4[r11] = r10
            java.lang.String r10 = r9.f120948G1
            r4[r14] = r10
            r10 = 4
            com.tencent.mm.pluginsdk.ui.chat.h$b r11 = r9.f120949H1
            java.lang.String r11 = r11.f120963a
            r4[r10] = r11
            r10 = 5
            int r8 = r8.f127764d
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r4[r10] = r8
            java.lang.String r8 = "add AppPanel: enter_id[%s] red_dot[%d] appid[%s] url[%s] title[%s] type[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r4)
            r7.add(r9)
            r4 = 0
            goto L_0x00a1
        L_0x025e:
            r4 = r7
        L_0x025f:
            r1.setAppPanelUnCertainEnterArrayList(r4)
            android.widget.ImageButton r2 = r1.f211946v
            if (r2 == 0) goto L_0x026f
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x026f
            r1.mo100363M0(r5)
        L_0x026f:
            java.lang.Class<xy1.h> r1 = xy1.C53472h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            xy1.h r1 = (xy1.C53472h) r1
            ck3.b r2 = r0.f215752d
            java.lang.String r2 = r2.mo91577r()
            r1.mo70723K(r2)
            ck3.b r1 = r0.f215752d
            java.lang.String r1 = r1.mo91577r()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x029e
            ck3.b r1 = r0.f215752d
            ck3.i r1 = r1.mo91575p()
            zt3.t r2 = zt3.C119157j.f356862d
            com.tencent.mm.ui.chatting.component.j0$a r3 = new com.tencent.mm.ui.chatting.component.j0$a
            r3.<init>(r0, r1)
            zt3.j r2 = (zt3.C119157j) r2
            r2.mo183884o(r3)
        L_0x029e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.C44830j0.mo70046g5():void");
    }

    /* renamed from: u5 */
    public void mo26170u5() {
        if (mo70129g1()) {
            ((C53472h) C86312j.m106911c(C53472h.class)).mo70723K(this.f215752d.mo91577r());
            C41985r.m45634b();
        }
    }
}
