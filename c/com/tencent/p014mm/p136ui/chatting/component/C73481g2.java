package com.tencent.p014mm.p136ui.chatting.component;

import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import ck3.C67391b;
import com.tencent.p014mm.autogen.events.GetChatRoomWrapEvent;
import com.tencent.p014mm.modelgetchatroommsg.C68109a;
import com.tencent.p014mm.modelgetchatroommsg.C68110b;
import com.tencent.p014mm.modelgetchatroommsg.C68111c;
import com.tencent.p014mm.p136ui.chatting.ChattingUIFragment;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72986n2;
import com.tencent.p014mm.storage.C72988o1;
import com.tencent.tav.coremedia.TimeUtil;
import eb0.C31543z5;
import f40.C86709a0;
import f62.C75700k0;
import g62.C75871e;
import g62.C75875l;
import hk3.C76227e;
import j20.C117292a;
import java.util.HashSet;
import k20.C60958c;
import k20.C9556a;
import lu3.C88654b;
import p270xi.C91212b;
import p788aj.C67053c;
import zj3.C79346d0;
import zj3.C79368l;
import zj3.C79384u0;
import zj3.C79389x;
import zt3.C119157j;

@C91212b(exportInterface = C79389x.class)
/* renamed from: com.tencent.mm.ui.chatting.component.g2 */
public class C73481g2 extends C73412a implements C79389x, MStorageEx.IOnStorageChange {

    /* renamed from: e */
    public C73486d f215895e;

    /* renamed from: f */
    public HashSet<String> f215896f = new HashSet<>();

    /* renamed from: g */
    public volatile C72963f4 f215897g;

    /* renamed from: h */
    public C79368l f215898h;

    /* renamed from: i */
    public Handler f215899i = new C73484c(Looper.getMainLooper());

    /* renamed from: com.tencent.mm.ui.chatting.component.g2$a */
    public class C73482a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f215900d;

        public C73482a(String str) {
            this.f215900d = str;
        }

        public void run() {
            long currentTimeMillis = System.currentTimeMillis();
            C73481g2.this.f215897g = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).Ex0(this.f215900d);
            if (C73481g2.this.f215897g != null) {
                Log.m105925i("MicroMsg.GetChatroomComponent", "[onChattingInit] cost:%sms talker:%s createTime:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), this.f215900d, Long.valueOf(C73481g2.this.f215897g.getCreateTime()));
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.g2$b */
    public class C73483b implements Runnable {
        public C73483b() {
        }

        public void run() {
            Bundle bundle = new Bundle();
            bundle.putLong("MSG_ID", C73481g2.this.f215897g.getMsgId());
            ((ChattingUIFragment) C73481g2.this.f215752d.f193288l).f215289B.mo102933j(true, bundle);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.g2$c */
    public class C73484c extends Handler {

        /* renamed from: com.tencent.mm.ui.chatting.component.g2$c$a */
        public class C73485a implements Runnable {
            public C73485a() {
            }

            public void run() {
                C73481g2.this.f215752d.mo91558S();
                ((C79346d0) C73481g2.this.f215752d.f193278b.mo102812a(C79346d0.class)).mo102655v5();
            }
        }

        public C73484c(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            C73481g2.this.f215752d.mo91558S();
            int i = message.what;
            if (i == 1) {
                C79384u0 u0Var = (C79384u0) C73481g2.this.f215752d.f193278b.mo102812a(C79384u0.class);
                boolean z = u0Var.mo102510i2() || u0Var.mo102509Y();
                ((ChattingUIFragment) C73481g2.this.f215752d.f193288l).f215289B.setIsBottomShowAll(false);
                ((ChattingUIFragment) C73481g2.this.f215752d.f193288l).f215289B.setBottomViewVisible(true);
                if (z) {
                    ((ChattingUIFragment) C73481g2.this.f215752d.f193288l).f215289B.mo101739c(true);
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("load_bottom", true);
                    ((ChattingUIFragment) C73481g2.this.f215752d.f193288l).mo102082m0(bundle);
                }
                Log.m105925i("MicroMsg.GetChatroomComponent", "[CheckGetChatroomTask$handleMessage] load bottom! isFromSearch:%s talker:%s", Boolean.valueOf(z), C73481g2.this.f215752d.mo91577r());
            } else if (i == 2) {
                ((ChattingUIFragment) C73481g2.this.f215752d.f193288l).f215289B.setIsBottomShowAll(true);
                ((ChattingUIFragment) C73481g2.this.f215752d.f193288l).f215289B.setBottomViewVisible(true);
                C73481g2.this.f215899i.postDelayed(new C73485a(), 300);
                Log.m105925i("MicroMsg.GetChatroomComponent", "[CheckGetChatroomTask$handleMessage] unLoad bottom! talker:%s", C73481g2.this.f215752d.mo91577r());
            } else if (i == 4) {
                ((ChattingUIFragment) C73481g2.this.f215752d.f193288l).f215289B.setIsBottomShowAll(false);
                ((ChattingUIFragment) C73481g2.this.f215752d.f193288l).f215289B.setBottomViewVisible(true);
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("load_bottom", true);
                ((ChattingUIFragment) C73481g2.this.f215752d.f193288l).mo102082m0(bundle2);
                Log.m105925i("MicroMsg.GetChatroomComponent", "[CheckGetChatroomTask$handleMessage] unLoad bottom and reset! talker:%s", C73481g2.this.f215752d.mo91577r());
            } else if (i == 8) {
                Log.m105924i("MicroMsg.GetChatroomComponent", "[CheckGetChatroomTask$handleMessage] reset presenter");
                C73481g2.this.f215752d.f193286j.mo102038h0();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.g2$d */
    public class C73486d extends C88654b {

        /* renamed from: e */
        public String f215905e;

        public C73486d(String str, C73482a aVar) {
            this.f215905e = str;
        }

        /* renamed from: c */
        public final void mo102449c(C75875l lVar, long j, long j2) {
            Class cls = C75700k0.class;
            long a = C31543z5.m39451a() - 259200000;
            String d = C72715f.m85111d(TimeUtil.YYYY2MM2DD_HH1MM1SS, a / 1000);
            String str = this.f215905e;
            C72972g4 g4Var = (C72972g4) lVar;
            g4Var.getClass();
            Log.m105919d("MicroMsg.MsgInfoStorage", "get up inc create time, talker %s, fromCreateTime %d, targetIncCount %d", str, Long.valueOf(a), 1);
            C72963f4 f4Var = new C72963f4();
            String str2 = "SELECT * FROM " + g4Var.hy0(str) + " WHERE" + g4Var.iy0(str) + "AND " + "createTime" + " < " + a + " AND " + "isSend" + " = " + 0 + " ORDER BY " + "createTime" + " DESC  LIMIT " + 1;
            Log.m105919d("MicroMsg.MsgInfoStorage", "get up inc msg create time sql: %s", str2);
            Cursor rawQuery = g4Var.f212775p.rawQuery(str2, (String[]) null);
            if (rawQuery == null) {
                Log.m105928w("MicroMsg.MsgInfoStorage", "get inc msg create time error, cursor is null");
            } else if (rawQuery.moveToLast()) {
                f4Var.convertFrom(rawQuery);
                rawQuery.close();
            } else {
                rawQuery.close();
                Log.m105928w("MicroMsg.MsgInfoStorage", "get result fail");
            }
            if (f4Var.getMsgId() == 0) {
                Log.m105928w("MicroMsg.GetChatroomComponent", "[handleFoundGetChatroom] getUpIncReceivedMsg is null!");
                long jo = ((C72986n2) ((C75700k0) C86709a0.m107533q(cls)).mo96093DX()).mo101184jo(this.f215905e);
                long Lo = ((C72986n2) ((C75700k0) C86709a0.m107533q(cls)).mo96093DX()).mo101180Lo(this.f215905e);
                f4Var.mo108733M2(jo);
                f4Var.mo108744X2(Lo);
            }
            Log.m105925i("MicroMsg.GetChatroomComponent", "[handleFoundGetChatroom] talker:%s seq:[%s:%s] time:[%s:%s] fromTimeFormat:%s recMsgTimeFormat:%s", this.f215905e, Long.valueOf(j), Long.valueOf(f4Var.mo108772w2()), Long.valueOf(j2), Long.valueOf(f4Var.getCreateTime()), d, C72715f.m85111d(TimeUtil.YYYY2MM2DD_HH1MM1SS, f4Var.getCreateTime() / 1000));
            GetChatRoomWrapEvent getChatRoomWrapEvent = new GetChatRoomWrapEvent();
            GetChatRoomWrapEvent.C67707a aVar = getChatRoomWrapEvent.f193640d;
            aVar.f193641a = this.f215905e;
            aVar.f193644d = f4Var.mo108772w2();
            getChatRoomWrapEvent.f193640d.f193645e = f4Var.getCreateTime();
            GetChatRoomWrapEvent.C67707a aVar2 = getChatRoomWrapEvent.f193640d;
            aVar2.f193642b = j;
            aVar2.f193643c = j2;
            getChatRoomWrapEvent.publish();
        }

        /* renamed from: d */
        public final boolean mo102450d() {
            C72988o1 v = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96101cU().mo101216v(this.f215905e);
            long j = v.field_lastLocalSeq;
            long j2 = v.field_lastPushSeq;
            Log.m105924i("MicroMsg.GetChatroomComponent", "[isNeedLoadBottom] lastPushSeq:" + j2 + " lastLocalSeq:" + j);
            return j != j2;
        }

        public String getKey() {
            return "CheckGetChatroomTask";
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x00e2 A[Catch:{ all -> 0x0180 }] */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0121 A[Catch:{ all -> 0x0180 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r21 = this;
                r7 = r21
                java.lang.String r0 = " and msgSeq != 0 and flag & 2 != 0"
                java.lang.String r8 = "[CheckGetChatroomTask$run] cost:%sms"
                java.lang.String r9 = "MicroMsg.GetChatroomComponent"
                long r10 = java.lang.System.currentTimeMillis()
                r13 = 1
                eb0.c r1 = eb0.C97625j3.m125812b()     // Catch:{ all -> 0x0180 }
                com.tencent.mm.storage.v3 r1 = r1.mo105908w()     // Catch:{ all -> 0x0180 }
                java.lang.String r2 = r7.f215905e     // Catch:{ all -> 0x0180 }
                com.tencent.mm.storage.i2 r1 = (com.tencent.p014mm.storage.C44660i2) r1     // Catch:{ all -> 0x0180 }
                com.tencent.mm.storage.h2 r1 = r1.mo69771j(r2)     // Catch:{ all -> 0x0180 }
                java.lang.Class<f62.k0> r2 = f62.C75700k0.class
                k40.a r2 = f40.C86709a0.m107533q(r2)     // Catch:{ all -> 0x0180 }
                f62.k0 r2 = (f62.C75700k0) r2     // Catch:{ all -> 0x0180 }
                g62.l r2 = r2.mo96095LE()     // Catch:{ all -> 0x0180 }
                r3 = 2
                if (r1 == 0) goto L_0x014c
                if (r2 != 0) goto L_0x0030
                goto L_0x014c
            L_0x0030:
                long r14 = r1.mo108833z2()     // Catch:{ all -> 0x0180 }
                long r5 = r1.mo108821o2()     // Catch:{ all -> 0x0180 }
                com.tencent.mm.ui.chatting.component.g2 r4 = com.tencent.p014mm.p136ui.chatting.component.C73481g2.this     // Catch:{ all -> 0x0180 }
                java.lang.String r12 = r7.f215905e     // Catch:{ all -> 0x0180 }
                boolean r4 = r4.mo102443k(r12)     // Catch:{ all -> 0x0180 }
                if (r4 == 0) goto L_0x005a
                boolean r0 = r21.mo102450d()     // Catch:{ all -> 0x0180 }
                if (r0 == 0) goto L_0x0050
                com.tencent.mm.ui.chatting.component.g2 r0 = com.tencent.p014mm.p136ui.chatting.component.C73481g2.this     // Catch:{ all -> 0x0180 }
                android.os.Handler r0 = r0.f215899i     // Catch:{ all -> 0x0180 }
                r0.sendEmptyMessage(r13)     // Catch:{ all -> 0x0180 }
                goto L_0x0057
            L_0x0050:
                com.tencent.mm.ui.chatting.component.g2 r0 = com.tencent.p014mm.p136ui.chatting.component.C73481g2.this     // Catch:{ all -> 0x0180 }
                android.os.Handler r0 = r0.f215899i     // Catch:{ all -> 0x0180 }
                r0.sendEmptyMessage(r3)     // Catch:{ all -> 0x0180 }
            L_0x0057:
                r1 = 1
                goto L_0x0138
            L_0x005a:
                r4 = 67108864(0x4000000, float:1.5046328E-36)
                boolean r12 = r1.mo108372k3(r4)     // Catch:{ all -> 0x0180 }
                if (r12 == 0) goto L_0x0087
                java.lang.String r0 = "has check! %s"
                java.lang.Object[] r1 = new java.lang.Object[r13]     // Catch:{ all -> 0x0180 }
                java.lang.String r2 = r7.f215905e     // Catch:{ all -> 0x0180 }
                r4 = 0
                r1[r4] = r2     // Catch:{ all -> 0x0180 }
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r9, r0, r1)     // Catch:{ all -> 0x0180 }
                com.tencent.mm.ui.chatting.component.g2 r0 = com.tencent.p014mm.p136ui.chatting.component.C73481g2.this     // Catch:{ all -> 0x0180 }
                android.os.Handler r0 = r0.f215899i     // Catch:{ all -> 0x0180 }
                r0.sendEmptyMessage(r3)     // Catch:{ all -> 0x0180 }
                java.lang.Object[] r0 = new java.lang.Object[r13]
                long r1 = java.lang.System.currentTimeMillis()
                long r1 = r1 - r10
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r2 = 0
                r0[r2] = r1
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r8, r0)
                return
            L_0x0087:
                r1.mo108371j3(r4)     // Catch:{ all -> 0x0180 }
                eb0.c r4 = eb0.C97625j3.m125812b()     // Catch:{ all -> 0x0180 }
                com.tencent.mm.storage.v3 r4 = r4.mo105908w()     // Catch:{ all -> 0x0180 }
                java.lang.String r12 = r7.f215905e     // Catch:{ all -> 0x0180 }
                com.tencent.mm.storage.i2 r4 = (com.tencent.p014mm.storage.C44660i2) r4     // Catch:{ all -> 0x0180 }
                r4.mo69773k0(r1, r12)     // Catch:{ all -> 0x0180 }
                long r17 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0180 }
                java.lang.String r4 = r7.f215905e     // Catch:{ all -> 0x0180 }
                r12 = r2
                com.tencent.mm.storage.g4 r12 = (com.tencent.p014mm.storage.C72972g4) r12     // Catch:{ all -> 0x0180 }
                com.tencent.mm.storage.f4 r4 = r12.Fx0(r4, r0)     // Catch:{ all -> 0x0180 }
                java.lang.String r3 = "seq:%s getLastMsg cost:%sms filter:%s"
                r13 = 3
                java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch:{ all -> 0x0180 }
                long r19 = r4.mo108772w2()     // Catch:{ all -> 0x0180 }
                java.lang.Long r19 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x0180 }
                r16 = 0
                r13[r16] = r19     // Catch:{ all -> 0x0180 }
                long r19 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0180 }
                long r19 = r19 - r17
                java.lang.Long r17 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x0180 }
                r18 = 1
                r13[r18] = r17     // Catch:{ all -> 0x0180 }
                r17 = 2
                r13[r17] = r0     // Catch:{ all -> 0x0180 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r3, r13)     // Catch:{ all -> 0x0180 }
                long r3 = r4.getMsgId()     // Catch:{ all -> 0x0180 }
                r17 = 0
                int r0 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
                if (r0 > 0) goto L_0x00df
                int r0 = r1.mo108785F2()     // Catch:{ all -> 0x0180 }
                if (r0 <= 0) goto L_0x00dd
                goto L_0x00df
            L_0x00dd:
                r0 = 0
                goto L_0x00e0
            L_0x00df:
                r0 = 1
            L_0x00e0:
                if (r0 == 0) goto L_0x0121
                java.lang.String r0 = r7.f215905e     // Catch:{ all -> 0x0180 }
                com.tencent.mm.storage.f4 r0 = r12.Mx0(r0)     // Catch:{ all -> 0x0180 }
                r1 = r21
                r3 = r14
                r1.mo102449c(r2, r3, r5)     // Catch:{ all -> 0x0180 }
                com.tencent.mm.ui.chatting.component.g2 r1 = com.tencent.p014mm.p136ui.chatting.component.C73481g2.this     // Catch:{ all -> 0x0180 }
                android.os.Handler r1 = r1.f215899i     // Catch:{ all -> 0x0180 }
                r2 = 8
                r1.sendEmptyMessage(r2)     // Catch:{ all -> 0x0180 }
                if (r0 == 0) goto L_0x010a
                long r0 = r0.mo108772w2()     // Catch:{ all -> 0x0180 }
                int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
                if (r2 == 0) goto L_0x010a
                com.tencent.mm.ui.chatting.component.g2 r0 = com.tencent.p014mm.p136ui.chatting.component.C73481g2.this     // Catch:{ all -> 0x0180 }
                android.os.Handler r0 = r0.f215899i     // Catch:{ all -> 0x0180 }
                r1 = 1
                r0.sendEmptyMessage(r1)     // Catch:{ all -> 0x014a }
                goto L_0x0112
            L_0x010a:
                com.tencent.mm.ui.chatting.component.g2 r0 = com.tencent.p014mm.p136ui.chatting.component.C73481g2.this     // Catch:{ all -> 0x0180 }
                android.os.Handler r0 = r0.f215899i     // Catch:{ all -> 0x0180 }
                r1 = 4
                r0.sendEmptyMessage(r1)     // Catch:{ all -> 0x0180 }
            L_0x0112:
                java.lang.String r0 = "[CheckGetChatroomTask$run] found get chatroom![%s]"
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x014a }
                java.lang.String r1 = r7.f215905e     // Catch:{ all -> 0x0180 }
                r3 = 0
                r2[r3] = r1     // Catch:{ all -> 0x0180 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r0, r2)     // Catch:{ all -> 0x0180 }
                goto L_0x0057
            L_0x0121:
                java.lang.String r0 = "[CheckGetChatroomTask$run] not found get chatroom![%s]"
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x014a }
                java.lang.String r1 = r7.f215905e     // Catch:{ all -> 0x0180 }
                r3 = 0
                r2[r3] = r1     // Catch:{ all -> 0x0180 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r0, r2)     // Catch:{ all -> 0x0180 }
                com.tencent.mm.ui.chatting.component.g2 r0 = com.tencent.p014mm.p136ui.chatting.component.C73481g2.this     // Catch:{ all -> 0x0180 }
                android.os.Handler r0 = r0.f215899i     // Catch:{ all -> 0x0180 }
                r1 = 2
                r0.sendEmptyMessage(r1)     // Catch:{ all -> 0x0180 }
                goto L_0x0057
            L_0x0138:
                java.lang.Object[] r0 = new java.lang.Object[r1]
                long r1 = java.lang.System.currentTimeMillis()
                long r1 = r1 - r10
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r2 = 0
                r0[r2] = r1
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r8, r0)
                return
            L_0x014a:
                r0 = move-exception
                goto L_0x0182
            L_0x014c:
                java.lang.String r0 = "[CheckGetChatroomTask$run] null == conv?%s talker:%s"
                r2 = 2
                java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x0180 }
                if (r1 != 0) goto L_0x0155
                r1 = 1
                goto L_0x0156
            L_0x0155:
                r1 = 0
            L_0x0156:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0180 }
                r2 = 0
                r3[r2] = r1     // Catch:{ all -> 0x0180 }
                java.lang.String r1 = r7.f215905e     // Catch:{ all -> 0x0180 }
                r2 = 1
                r3[r2] = r1     // Catch:{ all -> 0x0180 }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r0, r3)     // Catch:{ all -> 0x0180 }
                com.tencent.mm.ui.chatting.component.g2 r0 = com.tencent.p014mm.p136ui.chatting.component.C73481g2.this     // Catch:{ all -> 0x0180 }
                android.os.Handler r0 = r0.f215899i     // Catch:{ all -> 0x0180 }
                r1 = 2
                r0.sendEmptyMessage(r1)     // Catch:{ all -> 0x0180 }
                r1 = 1
                java.lang.Object[] r0 = new java.lang.Object[r1]
                long r1 = java.lang.System.currentTimeMillis()
                long r1 = r1 - r10
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r2 = 0
                r0[r2] = r1
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r8, r0)
                return
            L_0x0180:
                r0 = move-exception
                r1 = 1
            L_0x0182:
                java.lang.Object[] r1 = new java.lang.Object[r1]
                long r2 = java.lang.System.currentTimeMillis()
                long r2 = r2 - r10
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r3 = 0
                r1[r3] = r2
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r8, r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.C73481g2.C73486d.run():void");
        }
    }

    /* renamed from: O4 */
    public void mo26162O4() {
        if (this.f215752d.mo91583x()) {
            long currentTimeMillis = System.currentTimeMillis();
            ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96101cU().add((MStorageEx.IOnStorageChange) this, C86709a0.m107525e().getLooper());
            C73486d dVar = new C73486d(this.f215752d.mo91577r(), (C73482a) null);
            this.f215895e = dVar;
            ((C119157j) C119157j.f356862d).mo183875f(dVar);
            Log.m105925i("MicroMsg.GetChatroomComponent", "[onChattingEnterAnimStart] cost:%sms talker:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), this.f215752d.mo91577r());
        }
    }

    /* renamed from: e */
    public void mo70065e() {
        if (this.f215752d.mo91583x()) {
            C86709a0.m107525e().postToWorker(new C73482a(this.f215752d.mo91577r()));
        }
    }

    /* renamed from: k */
    public boolean mo102443k(String str) {
        return ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96101cU().mo101205k(str);
    }

    /* renamed from: l2 */
    public void mo70047l2() {
        super.mo70047l2();
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96101cU().remove(this);
        C68111c.m80513e().mo93620b();
        this.f215899i.removeCallbacksAndMessages((Object) null);
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        C75871e.C75872a aVar = (C75871e.C75872a) obj;
        String str = aVar.f222518b;
        boolean z = aVar.f222519c;
        if (str.equals(this.f215752d.mo91577r())) {
            Log.m105925i("MicroMsg.GetChatroomComponent", "[onNotifyChange] talker:%s id:%s isInsertForWrap:%s", this.f215752d.mo91577r(), Integer.valueOf(aVar.f222517a), Boolean.valueOf(aVar.f222519c));
            if (i == 4 && !z) {
                Log.m105924i("MicroMsg.GetChatroomComponent", "[onNotifyChange] resetDataPresenter! username:" + str);
                this.f215899i.sendEmptyMessage(8);
            }
            if (z) {
                return;
            }
            if (i == 2 || i == 4) {
                C72988o1 v = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96101cU().mo101216v(this.f215752d.mo91577r());
                C68111c.m80513e().mo93622d(this.f215752d.mo91577r(), 1 + v.field_lastLocalSeq, v.field_lastPushSeq, 0, (C68111c.C68114c) null);
            }
        }
    }

    /* renamed from: p0 */
    public void mo102444p0() {
        int i;
        Class cls = C79368l.class;
        Class cls2 = C79346d0.class;
        Class cls3 = C75700k0.class;
        boolean z = false;
        if (this.f215897g == null) {
            Log.m105921e("MicroMsg.GetChatroomComponent", "[goBackToHistory] null == mLastSeqMsg! talker:%s", this.f215752d.mo91577r());
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C67053c s = ((C75700k0) C86709a0.m107533q(cls3)).mo96101cU().mo101213s(this.f215752d.mo91577r(), this.f215897g.getCreateTime(), false);
        Object[] objArr = new Object[3];
        objArr[0] = Util.secPrint(this.f215897g.getContent());
        objArr[1] = Boolean.valueOf(s == null);
        objArr[2] = Long.valueOf(this.f215897g.getCreateTime());
        Log.m105925i("MicroMsg.GetChatroomComponent", "[goBackToHistory] msgInfo content:%s null == seqBlock?:%s time:%s", objArr);
        if (s == null) {
            if (this.f215898h == null) {
                this.f215898h = (C79368l) this.f215752d.f193278b.mo102812a(cls);
            }
            int v0 = ((C79346d0) this.f215752d.f193278b.mo102812a(cls2)).mo102654v0();
            if (this.f215898h.getCount() >= v0) {
                C79368l lVar = this.f215898h;
                C72963f4 item = lVar.getItem(lVar.getCount() - 1);
                if (item == null) {
                    Log.m105928w("MicroMsg.GetChatroomComponent", "[findPosition] msg is null");
                } else {
                    long ky02 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls3)).mo96095LE()).ky0(this.f215752d.mo91577r(), item.getCreateTime(), v0);
                    i = this.f215898h.getCount() - 1;
                    while (true) {
                        if (i >= 0) {
                            C72963f4 item2 = this.f215898h.getItem(i);
                            if (item2 != null && item2.getCreateTime() == ky02) {
                                break;
                            }
                            i--;
                        } else {
                            break;
                        }
                    }
                    Log.m105925i("MicroMsg.GetChatroomComponent", "[goBackToHistory] findPosition:%s", Integer.valueOf(i));
                    C67391b bVar = this.f215752d;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(i));
                    C67391b bVar2 = bVar;
                    C117292a.m165358d(bVar2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/component/GetChatroomComponent", "goBackToHistory", "()V", "Undefined", "scrollToPosition", "(I)V");
                    bVar.mo91544E(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(bVar2, "com/tencent/mm/ui/chatting/component/GetChatroomComponent", "goBackToHistory", "()V", "Undefined", "scrollToPosition", "(I)V");
                    ((C79368l) this.f215752d.f193278b.mo102812a(cls)).mo108185T3(i);
                }
            } else {
                Bundle bundle = new Bundle();
                bundle.putInt("MSG_POSITION_UNREAD_COUNT", v0);
                this.f215752d.f193286j.mo102030Y().mo108594d(C76227e.C76228a.ACTION_POSITION, true, bundle);
            }
            i = 0;
            Log.m105925i("MicroMsg.GetChatroomComponent", "[goBackToHistory] findPosition:%s", Integer.valueOf(i));
            C67391b bVar3 = this.f215752d;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(Integer.valueOf(i));
            C67391b bVar22 = bVar3;
            C117292a.m165358d(bVar22, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/component/GetChatroomComponent", "goBackToHistory", "()V", "Undefined", "scrollToPosition", "(I)V");
            bVar3.mo91544E(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(bVar22, "com/tencent/mm/ui/chatting/component/GetChatroomComponent", "goBackToHistory", "()V", "Undefined", "scrollToPosition", "(I)V");
            ((C79368l) this.f215752d.f193278b.mo102812a(cls)).mo108185T3(i);
        } else {
            C67391b bVar4 = this.f215752d;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(0);
            C67391b bVar5 = bVar4;
            C117292a.m165358d(bVar5, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/component/GetChatroomComponent", "goBackToHistory", "()V", "Undefined", "scrollToPosition", "(I)V");
            bVar4.mo91544E(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(bVar5, "com/tencent/mm/ui/chatting/component/GetChatroomComponent", "goBackToHistory", "()V", "Undefined", "scrollToPosition", "(I)V");
            this.f215752d.mo91570k().postDelayed(new C73483b(), 166);
        }
        ((C79346d0) this.f215752d.f193278b.mo102812a(cls2)).mo102652f();
        Object[] objArr2 = new Object[2];
        objArr2[0] = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
        if (s == null) {
            z = true;
        }
        objArr2[1] = Boolean.valueOf(z);
        Log.m105925i("MicroMsg.GetChatroomComponent", "[goBackToHistory] cost:%s null == seqBlock?:%s", objArr2);
    }

    /* renamed from: u5 */
    public void mo26170u5() {
        if (this.f215752d.mo91583x()) {
            this.f215895e.mo97819a();
            ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96101cU().remove(this);
            if (!this.f215896f.contains(this.f215752d.mo91577r())) {
                if (C68110b.f195758a == null) {
                    synchronized (C68110b.class) {
                        if (C68110b.f195758a == null) {
                            C68110b.f195758a = new C68110b();
                        }
                    }
                }
                C68110b bVar = C68110b.f195758a;
                String r = this.f215752d.mo91577r();
                bVar.getClass();
                ThreadPool.post(new C68109a(bVar, r), "checkDirtyBlock");
                this.f215896f.add(this.f215752d.mo91577r());
            }
            C68111c.m80513e().mo93620b();
            this.f215899i.removeCallbacksAndMessages((Object) null);
        }
    }
}
