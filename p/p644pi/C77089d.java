package p644pi;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.chatroom.p015ui.RoomAccessVerifyApplicationUI;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80995a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.ISqlColumn;
import com.tencent.p014mm.sdk.storage.sql.ISqlOrder;
import com.tencent.p014mm.sdk.storage.sql.MultiCondition;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.LinkedList;
import java.util.List;
import k20.C9556a;
import p195li.C46860d;
import p195li.C61288e;
import p684si.C36673b;
import p684si.C36676f;
import p684si.C77712d;
import p749xh.C78832y7;

@C86522b(onProcess = {C80625v0.MATCH_APPBRAND, C80625v0.MATCH_MM})
/* renamed from: pi.d */
public class C77089d extends C86301e implements C77088c {

    /* renamed from: d */
    public C77712d f225175d = null;

    /* renamed from: e */
    public C61288e f225176e = null;

    /* renamed from: f */
    public C36676f f225177f = null;

    /* renamed from: g */
    public volatile C46860d f225178g = null;

    /* renamed from: h */
    public C36673b f225179h = null;

    public void D70(Context context, String str, boolean z) {
        Intent intent = new Intent(context, RoomAccessVerifyApplicationUI.class);
        intent.putExtra("intent_chatroom_username", str);
        intent.putExtra("intent_from_chattingui", z);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/chatroom/plugin/PluginChatroomUI", "gotoRoomAccessVerifyApplicationUI", "(Landroid/content/Context;Ljava/lang/String;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/chatroom/plugin/PluginChatroomUI", "gotoRoomAccessVerifyApplicationUI", "(Landroid/content/Context;Ljava/lang/String;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0060, code lost:
        if ((r0.f195582i == 44) != false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Ew0(com.tencent.p014mm.storage.C72963f4 r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.mo108768t()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85807K5(r0)
            if (r0 == 0) goto L_0x00a4
            java.lang.String r0 = r10.getContent()
            r1 = 0
            com.tencent.mm.message.l$b r0 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r0, r1)
            java.lang.String r2 = "MicroMsg.roomtools.PluginChatroomUI"
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x0027
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r10 = r10.mo108768t()
            r0[r4] = r10
            java.lang.String r10 = "handleGroupToolByReceiverAppMsg(room:%s) content is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r10, r0)
            return
        L_0x0027:
            java.lang.String r5 = r10.mo108768t()
            si.e r5 = p203mi.C34572d0.m40392c(r5)
            if (r5 != 0) goto L_0x003f
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r10 = r10.mo108768t()
            r0[r4] = r10
            java.lang.String r10 = "handleGroupToolByReceiverAppMsg(room:%s) groupTools is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r10, r0)
            return
        L_0x003f:
            int r6 = r5.field_queryState
            if (r6 != 0) goto L_0x0051
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r10 = r10.mo108768t()
            r0[r4] = r10
            java.lang.String r10 = "handleGroupToolByReceiverAppMsg(room:%s) groupTools is COL_STATE_NEED_QUERY"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r10, r0)
            return
        L_0x0051:
            boolean r6 = kb0.C33860c.m40172a(r0)
            if (r6 != 0) goto L_0x0062
            int r0 = r0.f195582i
            r6 = 44
            if (r0 != r6) goto L_0x005f
            r0 = 1
            goto L_0x0060
        L_0x005f:
            r0 = 0
        L_0x0060:
            if (r0 == 0) goto L_0x0066
        L_0x0062:
            com.tencent.mm.chatroom.storage.GroupToolItem r1 = p203mi.C34572d0.m40391b(r10)
        L_0x0066:
            boolean r0 = p203mi.C34572d0.m40393d(r10)
            if (r0 == 0) goto L_0x0079
            com.tencent.mm.chatroom.storage.GroupToolItem r1 = new com.tencent.mm.chatroom.storage.GroupToolItem
            long r6 = r10.getCreateTime()
            java.lang.String r0 = "roomaa@app.origin"
            java.lang.String r8 = ""
            r1.<init>(r0, r8, r6)
        L_0x0079:
            if (r1 == 0) goto L_0x00a4
            r5.mo60796l2(r1)
            java.lang.Class<pi.d> r0 = p644pi.C77089d.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            pi.d r0 = (p644pi.C77089d) r0
            si.f r0 = r0.xx0()
            java.lang.String[] r1 = new java.lang.String[r4]
            boolean r0 = r0.update(r5, r1)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r10 = r10.mo108768t()
            r1[r4] = r10
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)
            r1[r3] = r10
            java.lang.String r10 = "handleGroupToolByReceiverAppMsg room:%s result:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r10, r1)
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p644pi.C77089d.Ew0(com.tencent.mm.storage.f4):void");
    }

    public int Yc0(String str, long j) {
        SingleTable singleTable = C78832y7.f231620o;
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        MultiCondition and = new MultiCondition(C78832y7.f231622q.equal(str)).and(C78832y7.f231625t.equal((Number) 0).and(C78832y7.f231624s.equal((Number) 0)));
        linkedList2.add(C78832y7.f231626u.orderDesc());
        List<C78832y7> multiQuery = C78832y7.f231620o.select((List<? extends ISqlColumn>) linkedList).where(and).orderBy((List<? extends ISqlOrder>) linkedList2).groupBy((List<? extends Column>) linkedList3).build().multiQuery(C86709a0.m107535s().f251811i, C78832y7.class);
        if (multiQuery.size() <= 0 || multiQuery.get(0).field_updateTime <= j) {
            return 0;
        }
        return multiQuery.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        r2 = ((com.tencent.p014mm.storage.C72972g4) ((f62.C75700k0) f40.C86709a0.m107533q(f62.C75700k0.class)).mo96095LE()).h30(r9.field_roomname, r9.mo107862m2());
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo107397j(di0.C86299o r8, p684si.C77711c r9) {
        /*
            r7 = this;
            if (r9 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.String r0 = r9.field_shareKey
            java.lang.String r1 = r9.field_shareName
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L_0x004f
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x004f
            long r2 = r9.mo107862m2()
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x004f
            java.lang.Class<f62.k0> r2 = f62.C75700k0.class
            k40.a r2 = f40.C86709a0.m107533q(r2)
            f62.k0 r2 = (f62.C75700k0) r2
            g62.l r2 = r2.mo96095LE()
            java.lang.String r3 = r9.field_roomname
            long r4 = r9.mo107862m2()
            com.tencent.mm.storage.g4 r2 = (com.tencent.p014mm.storage.C72972g4) r2
            com.tencent.mm.storage.f4 r2 = r2.h30(r3, r4)
            java.lang.String r3 = r2.getContent()
            if (r3 == 0) goto L_0x004f
            r4 = 1
            int r2 = r2.mo108769t2()
            java.lang.String r2 = eb0.C75604z3.m90840l(r4, r3, r2)
            r3 = 0
            com.tencent.mm.message.l$b r2 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r2, r3)
            if (r2 == 0) goto L_0x004f
            java.lang.String r0 = r2.f195593k2
            java.lang.String r1 = r9.field_roomname
        L_0x004f:
            r8.f250952x = r0
            r8.f250953y = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p644pi.C77089d.mo107397j(di0.o, si.c):void");
    }

    public void m80(String str) {
        RoomAccessVerifyApplicationUI.f194859h.mo93303a(str);
    }

    /* renamed from: ot */
    public void mo107396ot(C72963f4 f4Var) {
        String str;
        Class cls = C75700k0.class;
        if (C72996z1.m85807K5(f4Var.mo108768t())) {
            C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null);
            if (u == null) {
                Log.m105918d("MicroMsg.roomTodo.PluginChatroomUI", "content is null");
                return;
            }
            C80995a aVar = (C80995a) u.mo93555w(C80995a.class);
            if (Util.isNullOrNil(aVar.f237909r)) {
                str = "related_msgid_" + f4Var.mo108774y2();
            } else {
                str = aVar.f237909r;
            }
            if (((C77089d) C86312j.m106911c(C77089d.class)).wx0().mo107864Lo(f4Var.mo108768t(), str) == null) {
                Log.m105918d("MicroMsg.roomTodo.PluginChatroomUI", "groupTodo is null");
                return;
            }
            C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(f4Var.getMsgId());
            b002.mo108737Q2(str);
            ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(b002.getMsgId(), b002);
            Log.m105919d("MicroMsg.roomTodo.PluginChatroomUI", "update msgSvrid:%s msgId:%s", Long.valueOf(f4Var.mo108774y2()), Long.valueOf(b002.getMsgId()));
        }
    }

    public C36673b vx0() {
        C86709a0.m107523b().mo121108c();
        if (this.f225179h == null) {
            C86709a0.m107528h();
            this.f225179h = new C36673b(C86709a0.m107535s().f251811i);
        }
        return this.f225179h;
    }

    public C77712d wx0() {
        C86709a0.m107523b().mo121108c();
        if (this.f225175d == null) {
            C86709a0.m107528h();
            this.f225175d = new C77712d(C86709a0.m107535s().f251811i);
        }
        return this.f225175d;
    }

    public C36676f xx0() {
        C86709a0.m107523b().mo121108c();
        if (this.f225177f == null) {
            C86709a0.m107528h();
            this.f225177f = new C36676f(C86709a0.m107535s().f251811i);
        }
        return this.f225177f;
    }

    public C46860d yx0() {
        C86709a0.m107523b().mo121108c();
        if (this.f225178g == null) {
            synchronized (this) {
                if (this.f225178g == null) {
                    this.f225178g = new C46860d();
                }
            }
        }
        return this.f225178g;
    }

    public C61288e zx0() {
        C86709a0.m107523b().mo121108c();
        if (this.f225176e == null) {
            this.f225176e = new C61288e();
        }
        return this.f225176e;
    }
}
