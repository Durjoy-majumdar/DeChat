package com.tencent.p014mm.modelgetchatroommsg;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C44667s4;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import f40.C86709a0;
import f62.C31934j0;
import f62.C75700k0;
import g62.C75875l;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C35136m;
import ob0.C47350c;
import ob0.C89144l0;
import ob0.l0$$e;
import sf0.C48374j0;
import te3.C50887px1;
import te3.C51026qx1;
import te3.C77949j3;
import zc2.C79318h;

/* renamed from: com.tencent.mm.modelgetchatroommsg.c */
public class C68111c implements l0$$e {

    /* renamed from: i */
    public static C79318h f195759i = new C79318h(true);

    /* renamed from: j */
    public static C68111c f195760j;

    /* renamed from: d */
    public C68113b f195761d;

    /* renamed from: e */
    public C117747y f195762e;

    /* renamed from: f */
    public ConcurrentLinkedDeque<C47350c> f195763f = new ConcurrentLinkedDeque<>();

    /* renamed from: g */
    public volatile boolean f195764g = false;

    /* renamed from: h */
    public C68114c f195765h = new C68112a(this);

    /* renamed from: com.tencent.mm.modelgetchatroommsg.c$a */
    public class C68112a implements C68114c {
        public C68112a(C68111c cVar) {
        }

        /* renamed from: a */
        public void mo93626a(int i, List<C72963f4> list) {
            Log.m105928w("MicroMsg.GetChatroomMsgFetcher", "[onFinish] ret:" + i + " addSize:" + list.size());
        }
    }

    /* renamed from: com.tencent.mm.modelgetchatroommsg.c$b */
    public interface C68113b {
    }

    /* renamed from: com.tencent.mm.modelgetchatroommsg.c$c */
    public interface C68114c {
        /* renamed from: a */
        void mo93626a(int i, List<C72963f4> list);
    }

    /* renamed from: e */
    public static C68111c m80513e() {
        if (f195760j == null) {
            synchronized (C68111c.class) {
                if (f195760j == null) {
                    f195760j = new C68111c();
                }
            }
        }
        return f195760j;
    }

    /* renamed from: a */
    public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        LinkedList linkedList;
        C50887px1 px12;
        C51026qx1 qx12;
        C47350c cVar2 = cVar;
        Class cls = C75700k0.class;
        Log.m105925i("MicroMsg.GetChatroomMsgFetcher", "[callback] errType:%d errCode:%d errMsg:%s]", Integer.valueOf(i), Integer.valueOf(i2), str);
        this.f195762e = null;
        try {
            linkedList = new LinkedList();
            if (yVar.getType() != 805) {
                mo93625h(cVar2, -1, linkedList);
                C47350c poll = this.f195763f.poll();
                if (poll != null) {
                    Log.m105925i("MicroMsg.GetChatroomMsgFetcher", "do next next... %s", Integer.valueOf(this.f195763f.size()));
                    this.f195764g = true;
                    this.f195762e = C89144l0.m111430f(poll, this, true, (C9487b) null);
                } else {
                    this.f195764g = false;
                }
                return 0;
            } else if (i == 0 && i2 == 0 && cVar2 != null) {
                px12 = (C50887px1) cVar2.f127055a.f127080a;
                qx12 = (C51026qx1) cVar2.f127056b.f127083a;
                if (qx12 != null) {
                    LinkedList<C77949j3> linkedList2 = qx12.f140597e;
                    if (linkedList2 != null) {
                        if (linkedList2.size() <= 0) {
                            Log.m105929w("MicroMsg.GetChatroomMsgFetcher", "[callback] fetch size is 0! [%s:%s] isUpFlag:%s ChatroomId:%s", Integer.valueOf(px12.f140040e), Integer.valueOf(px12.f140044i), Integer.valueOf(px12.f140042g), C48374j0.m53718g(px12.f140039d));
                            mo93625h(cVar2, 0, linkedList);
                            C47350c poll2 = this.f195763f.poll();
                            if (poll2 != null) {
                                Log.m105925i("MicroMsg.GetChatroomMsgFetcher", "do next next... %s", Integer.valueOf(this.f195763f.size()));
                                this.f195764g = true;
                                this.f195762e = C89144l0.m111430f(poll2, this, true, (C9487b) null);
                            } else {
                                this.f195764g = false;
                            }
                            return 0;
                        }
                        C31934j0 j0Var = (C31934j0) C86312j.m106911c(C31934j0.class);
                        C75875l LE = ((C75700k0) C86709a0.m107533q(cls)).mo96095LE();
                        ((C72972g4) LE).qy0("MicroMsg.GetChatroomMsgFetcher" + hashCode());
                        Iterator<C35136m.C35137a> it = mo93624g(qx12.f140597e, px12.f140042g == 1, C48374j0.m53718g(px12.f140039d)).iterator();
                        while (it.hasNext()) {
                            C35136m.C35137a next = it.next();
                            C35136m.C35139b nn = j0Var.mo57256nn(next, f195759i);
                            if (nn != null) {
                                C72963f4 f4Var = nn.f94255a;
                                if (f4Var == null) {
                                    Log.m105920e("MicroMsg.GetChatroomMsgFetcher", "ddMsgReturn.msg == null！may be revoke msg");
                                } else {
                                    linkedList.add(f4Var);
                                }
                            } else {
                                linkedList.add(mo93623f(next.f94242a, next));
                                Log.m105925i("MicroMsg.GetChatroomMsgFetcher", "addMsgReturn == null! addMsgInfo addMsg type:%s", Integer.valueOf(next.f94242a.f227630g));
                            }
                        }
                        C75875l LE2 = ((C75700k0) C86709a0.m107533q(cls)).mo96095LE();
                        ((C72972g4) LE2).wy0("MicroMsg.GetChatroomMsgFetcher" + hashCode());
                        String g = C48374j0.m53718g(px12.f140039d);
                        Log.m105924i("MicroMsg.GetChatroomMsgFetcher", "[callback] chatroomId:" + g + " AddMsgList size:" + qx12.f140597e.size());
                        mo93625h(cVar2, 0, linkedList);
                        C47350c poll3 = this.f195763f.poll();
                        if (poll3 != null) {
                            Log.m105925i("MicroMsg.GetChatroomMsgFetcher", "do next next... %s", Integer.valueOf(this.f195763f.size()));
                            this.f195764g = true;
                            this.f195762e = C89144l0.m111430f(poll3, this, true, (C9487b) null);
                        } else {
                            this.f195764g = false;
                        }
                        return 0;
                    }
                }
                mo93625h(cVar2, -1, linkedList);
                Object[] objArr = new Object[2];
                objArr[0] = Boolean.valueOf(qx12 == null);
                objArr[1] = Boolean.valueOf(qx12.f140597e == null);
                Log.m105921e("MicroMsg.GetChatroomMsgFetcher", "[callback] resp == null? %b resp.AddMsgList == null? %b", objArr);
                C47350c poll4 = this.f195763f.poll();
                if (poll4 != null) {
                    Log.m105925i("MicroMsg.GetChatroomMsgFetcher", "do next next... %s", Integer.valueOf(this.f195763f.size()));
                    this.f195764g = true;
                    this.f195762e = C89144l0.m111430f(poll4, this, true, (C9487b) null);
                    return 0;
                }
                this.f195764g = false;
                return 0;
            } else {
                mo93625h(cVar2, -1, linkedList);
                C47350c poll5 = this.f195763f.poll();
                if (poll5 != null) {
                    Log.m105925i("MicroMsg.GetChatroomMsgFetcher", "do next next... %s", Integer.valueOf(this.f195763f.size()));
                    this.f195764g = true;
                    this.f195762e = C89144l0.m111430f(poll5, this, true, (C9487b) null);
                    return 0;
                }
                this.f195764g = false;
                return 0;
            }
        } catch (Throwable th) {
            C47350c poll6 = this.f195763f.poll();
            if (poll6 != null) {
                Log.m105925i("MicroMsg.GetChatroomMsgFetcher", "do next next... %s", Integer.valueOf(this.f195763f.size()));
                this.f195764g = true;
                this.f195762e = C89144l0.m111430f(poll6, this, true, (C9487b) null);
            } else {
                this.f195764g = false;
            }
            throw th;
        }
    }

    /* renamed from: b */
    public void mo93620b() {
        Log.m105924i("MicroMsg.GetChatroomMsgFetcher", "[cancel]...");
        this.f195764g = false;
        this.f195763f.clear();
        C117747y yVar = this.f195762e;
        if (yVar != null) {
            C89144l0.m111426b(yVar);
            mo93625h((C47350c) null, -1, new LinkedList());
        }
        this.f195765h = null;
    }

    /* renamed from: c */
    public void mo93621c(String str) {
        if (((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96101cU().mo101205k(str)) {
            Log.m105925i("MicroMsg.GetChatroomMsgFetcher", "[clearConversationDeliverCount] username:%s", str);
            C50887px1 px12 = new C50887px1();
            px12.f140039d = C48374j0.m53720i(str);
            px12.f140040e = 0;
            px12.f140044i = 0;
            px12.f140041f = 0;
            px12.f140042g = 0;
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = px12;
            bVar.f127067b = new C51026qx1();
            bVar.f127068c = "/cgi-bin/micromsg-bin/getcrmsg";
            bVar.f127069d = 805;
            bVar.f127070e = 0;
            bVar.f127071f = 0;
            C89144l0.m111429e(bVar.mo72403a(), (l0$$e) null, false);
        }
    }

    /* renamed from: d */
    public void mo93622d(String str, long j, long j2, int i, C68114c cVar) {
        Log.m105924i("MicroMsg.GetChatroomMsgFetcher", "[fetch] chatroomId:" + str + " msgSeq:" + j + " filterSeq:" + j2 + " upDownFlag:" + i + " isRunning=" + this.f195764g);
        this.f195765h = cVar;
        C50887px1 px12 = new C50887px1();
        px12.f140039d = C48374j0.m53720i(str);
        px12.f140040e = (int) j;
        px12.f140044i = (int) j2;
        px12.f140041f = 18;
        px12.f140042g = i;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = px12;
        bVar.f127067b = new C51026qx1();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getcrmsg";
        bVar.f127069d = 805;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        if (this.f195764g) {
            this.f195763f.add(bVar.mo72403a());
            return;
        }
        this.f195764g = true;
        this.f195762e = C89144l0.m111430f(bVar.mo72403a(), this, true, (C9487b) null);
    }

    /* renamed from: f */
    public final C72963f4 mo93623f(C77949j3 j3Var, C35136m.C35137a aVar) {
        C72963f4 f4Var = new C72963f4();
        f4Var.mo108745Y2(j3Var.f227638r);
        f4Var.mo108733M2(aVar.f94247f);
        f4Var.mo108744X2((long) j3Var.f227639s);
        String g = C48374j0.m53718g(j3Var.f227628e);
        String g2 = C48374j0.m53718g(j3Var.f227629f);
        if (((C44667s4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).V50()).mo69822qq(g) || ((String) C86709a0.m107535s().mo121142i().mo119684e(2, "")).equals(g)) {
            f4Var.mo108740T2(1);
            f4Var.mo108749c3(g2);
            f4Var.mo100991d(j3Var.f227632i);
        } else {
            f4Var.mo108740T2(0);
            f4Var.mo108749c3(g);
            int i = j3Var.f227632i;
            if (i <= 3) {
                i = 3;
            }
            f4Var.mo100991d(i);
        }
        if (j3Var.f227630g == 10000) {
            f4Var.mo100991d(4);
        }
        f4Var.mo108735O2(2);
        return f4Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0122  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.LinkedList<ob0.C35136m.C35137a> mo93624g(java.util.List<te3.C77949j3> r23, boolean r24, java.lang.String r25) {
        /*
            r22 = this;
            r0 = r25
            java.lang.Class<f62.k0> r1 = f62.C75700k0.class
            k40.a r2 = f40.C86709a0.m107533q(r1)
            f62.k0 r2 = (f62.C75700k0) r2
            g62.f r2 = r2.mo96093DX()
            com.tencent.mm.storage.n2 r2 = (com.tencent.p014mm.storage.C72986n2) r2
            long r2 = r2.mo101184jo(r0)
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            java.util.Iterator r5 = r23.iterator()
            r6 = 0
            r8 = r6
        L_0x0020:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x0145
            java.lang.Object r10 = r5.next()
            r12 = r10
            te3.j3 r12 = (te3.C77949j3) r12
            int r10 = r12.f227635o
            long r10 = (long) r10
            r13 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r13
            int r16 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r16 != 0) goto L_0x00eb
            k40.a r16 = f40.C86709a0.m107533q(r1)
            f62.k0 r16 = (f62.C75700k0) r16
            g62.l r16 = r16.mo96095LE()
            te3.rv3 r6 = r12.f227628e
            java.lang.String r6 = sf0.C48374j0.m53718g(r6)
            int r7 = r12.f227639s
            long r13 = (long) r7
            r7 = r16
            com.tencent.mm.storage.g4 r7 = (com.tencent.p014mm.storage.C72972g4) r7
            r7.getClass()
            boolean r16 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r16 == 0) goto L_0x005f
            r20 = r1
            r21 = r5
            r7 = 2
            r15 = 0
            goto L_0x00d2
        L_0x005f:
            com.tencent.mm.storage.f4 r15 = new com.tencent.mm.storage.f4
            r15.<init>()
            r20 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r21 = r5
            java.lang.String r5 = "select * from "
            r1.append(r5)
            java.lang.String r5 = r7.hy0(r6)
            r1.append(r5)
            java.lang.String r5 = " where"
            r1.append(r5)
            java.lang.String r5 = r7.iy0(r6)
            r1.append(r5)
            java.lang.String r5 = "AND "
            r1.append(r5)
            java.lang.String r5 = "msgSeq"
            r1.append(r5)
            java.lang.String r6 = "<"
            r1.append(r6)
            r1.append(r13)
            java.lang.String r6 = " order by "
            r1.append(r6)
            r1.append(r5)
            java.lang.String r5 = " DESC limit 1"
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            zh3.f r5 = r7.f212775p
            r6 = 0
            r7 = 2
            android.database.Cursor r5 = r5.rawQuery(r1, r6, r7)
            boolean r6 = r5.moveToFirst()
            if (r6 == 0) goto L_0x00b9
            r15.convertFrom(r5)
        L_0x00b9:
            r5.close()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "[getBeforeSeqLastMsg] sql: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            java.lang.String r5 = "MicroMsg.MsgInfoStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r1)
        L_0x00d2:
            long r5 = r15.getCreateTime()
            r13 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r13
            int r1 = r12.f227635o
            r18 = r8
            long r7 = (long) r1
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x00f1
            long r5 = r15.getCreateTime()
            r7 = 1
            long r10 = r5 + r7
            goto L_0x00f3
        L_0x00eb:
            r20 = r1
            r21 = r5
            r18 = r8
        L_0x00f1:
            r7 = 1
        L_0x00f3:
            r5 = r10
            long r9 = r18 / r13
            long r13 = r5 / r13
            int r1 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r1 != 0) goto L_0x010c
            long r8 = r18 + r7
            ob0.m$a r1 = new ob0.m$a
            r13 = 1
            r14 = 0
            r11 = r1
            r7 = 2
            r15 = r24
            r16 = r8
            r11.<init>(r12, r13, r14, r15, r16)
            goto L_0x011a
        L_0x010c:
            r7 = 2
            ob0.m$a r1 = new ob0.m$a
            r13 = 1
            r14 = 0
            r11 = r1
            r15 = r24
            r16 = r5
            r11.<init>(r12, r13, r14, r15, r16)
            r8 = r5
        L_0x011a:
            int r5 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r5 >= 0) goto L_0x0122
            r4.add(r1)
            goto L_0x013d
        L_0x0122:
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r5 = 0
            r1[r5] = r0
            r5 = 1
            java.lang.Long r6 = java.lang.Long.valueOf(r2)
            r1[r5] = r6
            java.lang.Long r5 = java.lang.Long.valueOf(r8)
            r1[r7] = r5
            java.lang.String r5 = "MicroMsg.GetChatroomMsgFetcher"
            java.lang.String r6 = "this conversation[%s] has delete before! lastDeleteCreateTime:%s curTime:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r6, r1)
        L_0x013d:
            r1 = r20
            r5 = r21
            r6 = 0
            goto L_0x0020
        L_0x0145:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelgetchatroommsg.C68111c.mo93624g(java.util.List, boolean, java.lang.String):java.util.LinkedList");
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0230  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo93625h(ob0.C47350c r40, int r41, java.util.LinkedList<com.tencent.p014mm.storage.C72963f4> r42) {
        /*
            r39 = this;
            r0 = r39
            r1 = r40
            r2 = r41
            r3 = r42
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "[requestCallback] ret:"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "MicroMsg.GetChatroomMsgFetcher"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r4)
            r4 = 0
            if (r1 != 0) goto L_0x0037
            kj2.d r5 = kj2.C117407d.INSTANCE
            r6 = 403(0x193, double:1.99E-321)
            r8 = 41
            r10 = 1
            r12 = 0
            r5.idkeyStat(r6, r8, r10, r12)
            com.tencent.mm.modelgetchatroommsg.c$c r1 = r0.f195765h
            if (r1 == 0) goto L_0x0036
            r1.mo93626a(r2, r3)
            r0.f195765h = r4
        L_0x0036:
            return
        L_0x0037:
            ob0.c$c r5 = r1.f127055a
            pe3.a r5 = r5.f127080a
            te3.px1 r5 = (te3.C50887px1) r5
            ob0.c$d r1 = r1.f127056b
            pe3.a r1 = r1.f127083a
            te3.qx1 r1 = (te3.C51026qx1) r1
            com.tencent.mm.modelgetchatroommsg.c$b r6 = r0.f195761d
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L_0x0520
            if (r2 < 0) goto L_0x0520
            te3.rv3 r9 = r5.f140039d
            java.lang.String r9 = sf0.C48374j0.m53718g(r9)
            int r10 = r5.f140042g
            if (r10 != r8) goto L_0x0057
            r10 = 1
            goto L_0x0058
        L_0x0057:
            r10 = 0
        L_0x0058:
            int r11 = r5.f140044i
            long r11 = (long) r11
            int r13 = r5.f140040e
            long r13 = (long) r13
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 <= 0) goto L_0x0067
            r37 = r11
            r11 = r13
            r13 = r37
        L_0x0067:
            aj.c r15 = new aj.c
            r15.<init>()
            r15.f192601d = r11
            r15.f192602e = r13
            int r1 = r1.f140596d
            if (r1 != 0) goto L_0x0076
            r1 = 1
            goto L_0x0077
        L_0x0076:
            r1 = 0
        L_0x0077:
            com.tencent.mm.modelgetchatroommsg.GetChatroomMsgReceiver r6 = (com.tencent.p014mm.modelgetchatroommsg.GetChatroomMsgReceiver) r6
            r6.getClass()
            java.lang.Class<f62.k0> r11 = f62.C75700k0.class
            int r12 = r42.size()
            java.lang.String r13 = "MicroMsg.GetChatroomMsgReceiver"
            if (r12 <= 0) goto L_0x0401
            if (r1 == 0) goto L_0x008a
            goto L_0x0401
        L_0x008a:
            r1 = 2
            java.lang.Object[] r12 = new java.lang.Object[r1]
            int r14 = r42.size()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r12[r7] = r14
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r12[r8] = r10
            java.lang.String r10 = "[onFetched] insert msg count[%s] isFetchUp:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r10, r12)
            k40.a r10 = f40.C86709a0.m107533q(r11)
            f62.k0 r10 = (f62.C75700k0) r10
            g62.e r10 = r10.mo96101cU()
            k40.a r11 = f40.C86709a0.m107533q(r11)
            f62.k0 r11 = (f62.C75700k0) r11
            g62.e r11 = r11.mo96101cU()
            aj.d r12 = r11.mo101212r(r9)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "\nchatroomId:"
            r14.append(r15)
            r14.append(r9)
            java.lang.Object r15 = r42.getFirst()
            com.tencent.mm.storage.f4 r15 = (com.tencent.p014mm.storage.C72963f4) r15
            r16 = r5
            long r4 = r15.mo108772w2()
            java.lang.Object r15 = r42.getLast()
            com.tencent.mm.storage.f4 r15 = (com.tencent.p014mm.storage.C72963f4) r15
            long r7 = r15.mo108772w2()
            java.lang.Object r15 = r42.getFirst()
            com.tencent.mm.storage.f4 r15 = (com.tencent.p014mm.storage.C72963f4) r15
            long r1 = r15.getCreateTime()
            java.lang.Object r15 = r42.getLast()
            com.tencent.mm.storage.f4 r15 = (com.tencent.p014mm.storage.C72963f4) r15
            r19 = r12
            r18 = r13
            long r12 = r15.getCreateTime()
            java.lang.String r15 = "\ngetFirst:"
            r14.append(r15)
            r14.append(r4)
            java.lang.String r15 = " getLast:"
            r14.append(r15)
            r14.append(r7)
            java.lang.String r15 = " getFirstCreateTime:"
            r14.append(r15)
            r14.append(r1)
            java.lang.String r15 = " getLastCreateTime:"
            r14.append(r15)
            r14.append(r12)
            java.lang.String r15 = "\nblock "
            r14.append(r15)
            aj.c r15 = new aj.c
            r15.<init>()
            long r20 = r11.mo101210p(r9)
            r22 = 1
            r24 = r12
            long r12 = r20 + r22
            r15.f192601d = r12
            long r12 = r11.mo101211q(r9)
            long r12 = r12 + r22
            r15.f192603f = r12
            long r12 = r11.mo101200B(r9)
            r15.f192602e = r12
            long r11 = r11.mo101214t(r9)
            r15.f192604g = r11
            long r11 = r15.f192602e
            r13 = r9
            r20 = r10
            long r9 = r15.f192601d
            long r9 = r11 - r9
            r26 = 0
            int r21 = (r9 > r26 ? 1 : (r9 == r26 ? 0 : -1))
            if (r21 < 0) goto L_0x015a
            r9 = r19
            java.util.LinkedList<aj.c> r10 = r9.f192605d
            r10.add(r15)
            r19 = r13
            r12 = r18
            goto L_0x0178
        L_0x015a:
            r9 = r19
            r10 = 2
            r19 = r13
            java.lang.Object[] r13 = new java.lang.Object[r10]
            java.lang.Long r10 = java.lang.Long.valueOf(r11)
            r11 = 0
            r13[r11] = r10
            long r10 = r15.f192601d
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r11 = 1
            r13[r11] = r10
            java.lang.String r10 = "[createBlocks] lastSeq[%s]<firstSeq[%s]"
            r12 = r18
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r12, r10, r13)
        L_0x0178:
            java.util.LinkedList r10 = new java.util.LinkedList
            r10.<init>()
            java.util.LinkedList<aj.c> r9 = r9.f192605d
            java.util.Iterator r9 = r9.iterator()
        L_0x0183:
            boolean r11 = r9.hasNext()
            java.lang.String r13 = "] | "
            java.lang.String r15 = "]["
            java.lang.String r3 = "["
            java.lang.String r0 = ":"
            if (r11 == 0) goto L_0x0245
            java.lang.Object r11 = r9.next()
            aj.c r11 = (p788aj.C67053c) r11
            r18 = r6
            r28 = r7
            long r6 = r11.f192601d
            r21 = r9
            long r8 = r11.f192602e
            r30 = r1
            long r1 = r11.f192603f
            r32 = r4
            long r4 = r11.f192604g
            r14.append(r3)
            r14.append(r6)
            r14.append(r0)
            r14.append(r8)
            r14.append(r15)
            r14.append(r1)
            r14.append(r0)
            r14.append(r4)
            r14.append(r13)
            int r0 = (r6 > r32 ? 1 : (r6 == r32 ? 0 : -1))
            if (r0 > 0) goto L_0x01ef
            int r0 = (r32 > r8 ? 1 : (r32 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x01ef
            aj.c r0 = new aj.c
            r0.<init>()
            r34 = r14
            long r13 = r11.f192601d
            r0.f192601d = r13
            r36 = r11
            r35 = r12
            long r11 = r32 - r22
            r0.f192602e = r11
            r0.f192603f = r1
            long r1 = r30 - r22
            r0.f192604g = r1
            long r11 = r11 - r13
            int r1 = (r11 > r26 ? 1 : (r11 == r26 ? 0 : -1))
            if (r1 < 0) goto L_0x01f5
            r10.add(r0)
            r0 = 1
            goto L_0x01f6
        L_0x01ef:
            r36 = r11
            r35 = r12
            r34 = r14
        L_0x01f5:
            r0 = 0
        L_0x01f6:
            int r1 = (r6 > r28 ? 1 : (r6 == r28 ? 0 : -1))
            if (r1 > 0) goto L_0x0219
            int r1 = (r28 > r8 ? 1 : (r28 == r8 ? 0 : -1))
            if (r1 > 0) goto L_0x0219
            aj.c r1 = new aj.c
            r1.<init>()
            long r2 = r28 + r22
            r1.f192601d = r2
            r1.f192602e = r8
            long r12 = r24 + r22
            r1.f192603f = r12
            r1.f192604g = r4
            long r2 = r8 - r2
            int r4 = (r2 > r26 ? 1 : (r2 == r26 ? 0 : -1))
            if (r4 < 0) goto L_0x0219
            r10.add(r1)
            r0 = 1
        L_0x0219:
            if (r0 != 0) goto L_0x0230
            int r0 = (r32 > r8 ? 1 : (r32 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x0223
            int r0 = (r28 > r6 ? 1 : (r28 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0230
        L_0x0223:
            r11 = r36
            r10.add(r11)
            java.lang.String r0 = "[createBlocks] add raw block!"
            r2 = r35
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x0232
        L_0x0230:
            r2 = r35
        L_0x0232:
            r0 = r39
            r3 = r42
            r12 = r2
            r6 = r18
            r9 = r21
            r7 = r28
            r1 = r30
            r4 = r32
            r14 = r34
            goto L_0x0183
        L_0x0245:
            r18 = r6
            r2 = r12
            r34 = r14
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.Iterator r4 = r10.iterator()
        L_0x0253:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0283
            java.lang.Object r5 = r4.next()
            aj.c r5 = (p788aj.C67053c) r5
            r1.append(r3)
            long r6 = r5.f192601d
            r1.append(r6)
            r1.append(r0)
            long r6 = r5.f192602e
            r1.append(r6)
            r1.append(r15)
            long r6 = r5.f192603f
            r1.append(r6)
            r1.append(r0)
            long r5 = r5.f192604g
            r1.append(r5)
            r1.append(r13)
            goto L_0x0253
        L_0x0283:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "[createBlocks] "
            r0.append(r3)
            java.lang.String r3 = r34.toString()
            r0.append(r3)
            java.lang.String r3 = "\nnew blockList:"
            r0.append(r3)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            r0 = r19
            r1 = r20
            aj.d r3 = r1.mo101212r(r0)
            if (r3 != 0) goto L_0x02b6
            aj.d r3 = new aj.d
            r3.<init>()
        L_0x02b6:
            java.util.LinkedList<aj.c> r4 = r3.f192605d
            r4.clear()
            java.util.LinkedList<aj.c> r4 = r3.f192605d
            r4.addAll(r10)
            boolean r4 = r1.mo101207m(r0, r3)
            java.lang.Object r5 = r42.getLast()
            com.tencent.mm.storage.f4 r5 = (com.tencent.p014mm.storage.C72963f4) r5
            long r5 = r5.mo108772w2()
            java.lang.Object r7 = r42.getLast()
            com.tencent.mm.storage.f4 r7 = (com.tencent.p014mm.storage.C72963f4) r7
            long r7 = r7.getCreateTime()
            long r9 = r1.mo101210p(r0)
            long r11 = r1.mo101211q(r0)
            r13 = 6
            java.lang.Object[] r13 = new java.lang.Object[r13]
            java.util.LinkedList<aj.c> r3 = r3.f192605d
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r14 = 0
            r13[r14] = r3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)
            r4 = 1
            r13[r4] = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r4 = 2
            r13[r4] = r3
            r3 = 3
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            r13[r3] = r4
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            r4 = 4
            r13[r4] = r3
            r3 = 5
            java.lang.Long r4 = java.lang.Long.valueOf(r11)
            r13[r3] = r4
            java.lang.String r3 = "[onFetched] blockList size:%s ret:%s GetSeq:[last %s:old %s] GetLocalCreateTime:[last %s:old %s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r13)
            int r3 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x0323
            r1.mo101206l(r0, r5)
            r1.mo101215u(r0, r7)
            goto L_0x0339
        L_0x0323:
            r1 = 2
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            r4 = 0
            r3[r4] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r4 = 1
            r3[r4] = r1
            java.lang.String r1 = "oldGetSeq>=lastGetSeq [%s:%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r1, r3)
        L_0x0339:
            java.util.HashMap r1 = new java.util.HashMap
            r6 = r18
            java.util.Map<java.lang.Long, com.tencent.mm.storage.s3> r3 = r6.f195753e
            r1.<init>(r3)
            int r3 = r1.size()
            if (r3 == 0) goto L_0x03fe
            boolean r3 = sf0.C77702q0.m93719b(r0)
            if (r3 == 0) goto L_0x0350
            goto L_0x03fe
        L_0x0350:
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
            if (r1 == 0) goto L_0x03fe
        L_0x035a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x03fe
            java.lang.Object r3 = r1.next()
            com.tencent.mm.storage.s3 r3 = (com.tencent.p014mm.storage.C30776s3) r3
            if (r3 == 0) goto L_0x035a
            java.lang.String r4 = r3.field_fromUserName
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x035a
            eb0.c r4 = eb0.C97625j3.m125812b()
            g62.l r4 = r4.mo105911z()
            long r5 = r3.field_originSvrId
            com.tencent.mm.storage.g4 r4 = (com.tencent.p014mm.storage.C72972g4) r4
            com.tencent.mm.storage.f4 r4 = r4.h30(r0, r5)
            long r5 = r4.getMsgId()
            int r7 = (r5 > r26 ? 1 : (r5 == r26 ? 0 : -1))
            if (r7 == 0) goto L_0x035a
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]
            long r7 = r4.getMsgId()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r8 = 0
            r6[r8] = r7
            long r9 = r4.mo108774y2()
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            r7 = 1
            r6[r7] = r4
            java.lang.String r4 = "summerbadcr dealSysCmdMsg msg id[%d], originsvrid[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r6)
            te3.j3 r4 = new te3.j3
            r4.<init>()
            long r6 = r3.field_newMsgId
            r4.f227638r = r6
            java.lang.String r6 = r3.field_fromUserName
            te3.rv3 r6 = sf0.C48374j0.m53720i(r6)
            r4.f227628e = r6
            java.lang.String r6 = r3.field_toUserName
            te3.rv3 r6 = sf0.C48374j0.m53720i(r6)
            r4.f227629f = r6
            long r6 = r3.field_createTime
            int r7 = (int) r6
            r4.f227635o = r7
            java.lang.String r6 = r3.field_content
            te3.rv3 r6 = sf0.C48374j0.m53720i(r6)
            r4.f227631h = r6
            java.lang.String r6 = r3.field_msgSource
            r4.f227636p = r6
            int r6 = r3.field_msgSeq
            r4.f227639s = r6
            int r3 = r3.field_flag
            r6 = 10002(0x2712, float:1.4016E-41)
            r4.f227630g = r6
            eb0.v5 r6 = eb0.C97625j3.m125819i()
            ob0.m$a r7 = new ob0.m$a
            r9 = r3 & 2
            if (r9 == 0) goto L_0x03e7
            r11 = 1
            goto L_0x03e8
        L_0x03e7:
            r11 = 0
        L_0x03e8:
            r9 = r3 & 1
            if (r9 == 0) goto L_0x03ee
            r9 = 1
            goto L_0x03ef
        L_0x03ee:
            r9 = 0
        L_0x03ef:
            r3 = r3 & 4
            if (r3 == 0) goto L_0x03f5
            r3 = 1
            goto L_0x03f6
        L_0x03f5:
            r3 = 0
        L_0x03f6:
            r7.<init>(r4, r11, r9, r3)
            r6.mo56403Fg(r7)
            goto L_0x035a
        L_0x03fe:
            r8 = 0
            goto L_0x0522
        L_0x0401:
            r16 = r5
            r0 = r9
            r2 = r13
            r8 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "[onFetched] fetchList.size() == 0! removeBlock! isBlockAll:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r1)
            long r3 = r15.f192601d
            long r5 = r15.f192602e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r7 = "[removeBlock] firstMsgSeq:"
            r1.append(r7)
            r1.append(r3)
            java.lang.String r9 = " lastMsgSeq:"
            r1.append(r9)
            r1.append(r5)
            java.lang.String r10 = " chatroomId:"
            r1.append(r10)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            k40.a r1 = f40.C86709a0.m107533q(r11)
            f62.k0 r1 = (f62.C75700k0) r1
            g62.e r1 = r1.mo96101cU()
            com.tencent.mm.storage.o1 r11 = r1.mo101216v(r0)
            java.lang.String r12 = " ret:"
            if (r11 == 0) goto L_0x04da
            aj.d r13 = r11.field_seqBlockInfo
            if (r13 == 0) goto L_0x04da
            java.util.LinkedList r13 = new java.util.LinkedList
            r13.<init>()
            aj.d r14 = r11.field_seqBlockInfo
            java.util.LinkedList<aj.c> r14 = r14.f192605d
            java.util.Iterator r14 = r14.iterator()
        L_0x0465:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x0487
            java.lang.Object r15 = r14.next()
            aj.c r15 = (p788aj.C67053c) r15
            r17 = r9
            long r8 = r15.f192601d
            int r18 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r18 != 0) goto L_0x0483
            long r8 = r15.f192602e
            int r18 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r18 != 0) goto L_0x0483
            r13.add(r15)
            goto L_0x0489
        L_0x0483:
            r9 = r17
            r8 = 0
            goto L_0x0465
        L_0x0487:
            r17 = r9
        L_0x0489:
            aj.d r8 = r11.field_seqBlockInfo
            java.util.LinkedList<aj.c> r8 = r8.f192605d
            r8.removeAll(r13)
            long r8 = r1.mo101203E(r11)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r7)
            r14.append(r3)
            r15 = r17
            r14.append(r15)
            r14.append(r5)
            r14.append(r10)
            r14.append(r0)
            r14.append(r12)
            r14.append(r8)
            java.lang.String r8 = " remove list:"
            r14.append(r8)
            int r8 = r13.size()
            r14.append(r8)
            java.lang.String r8 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r8)
            int r8 = r13.size()
            if (r8 <= 0) goto L_0x04db
            kj2.d r17 = kj2.C117407d.INSTANCE
            r18 = 403(0x193, double:1.99E-321)
            r20 = 78
            r22 = 1
            r24 = 0
            r17.idkeyStat(r18, r20, r22, r24)
            goto L_0x04db
        L_0x04da:
            r15 = r9
        L_0x04db:
            long r8 = r11.field_lastPushSeq
            r11.field_lastLocalSeq = r8
            long r8 = r11.field_lastPushCreateTime
            r11.field_lastLocalCreateTime = r8
            long r8 = r1.mo101203E(r11)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            r1.append(r3)
            r1.append(r15)
            r1.append(r5)
            r1.append(r10)
            r1.append(r0)
            r1.append(r12)
            r1.append(r8)
            java.lang.String r0 = " lastPushSeq:"
            r1.append(r0)
            long r3 = r11.field_lastPushSeq
            r1.append(r3)
            java.lang.String r0 = " field_lastPushCreateTime:"
            r1.append(r0)
            long r3 = r11.field_lastPushCreateTime
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x0522
        L_0x0520:
            r16 = r5
        L_0x0522:
            r0 = r39
            com.tencent.mm.modelgetchatroommsg.c$c r1 = r0.f195765h
            r2 = r41
            r3 = r42
            if (r1 == 0) goto L_0x0532
            r1.mo93626a(r2, r3)
            r1 = 0
            r0.f195765h = r1
        L_0x0532:
            mk3.d r1 = mk3.C76776d.f224575g
            r5 = r16
            int r4 = r5.f140042g
            if (r4 != 0) goto L_0x053c
            r11 = 1
            goto L_0x053d
        L_0x053c:
            r11 = 0
        L_0x053d:
            if (r2 < 0) goto L_0x0541
            r7 = 1
            goto L_0x0542
        L_0x0541:
            r7 = 0
        L_0x0542:
            te3.rv3 r4 = r5.f140039d
            java.lang.String r4 = sf0.C48374j0.m53718g(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "[recordFetch] isDown:"
            r5.append(r6)
            r5.append(r11)
            java.lang.String r6 = " isSuccess:"
            r5.append(r6)
            r5.append(r7)
            java.lang.String r6 = " chatroomid:"
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "MicroMsg.GetChatroomReporter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            if (r11 == 0) goto L_0x0577
            int r4 = r1.f224579d
            r5 = 1
            int r4 = r4 + r5
            r1.f224579d = r4
            goto L_0x057d
        L_0x0577:
            r5 = 1
            int r4 = r1.f224580e
            int r4 = r4 + r5
            r1.f224580e = r4
        L_0x057d:
            int r4 = r1.f224576a
            int r4 = r4 + r5
            r1.f224576a = r4
            if (r7 != 0) goto L_0x058a
            int r4 = r1.f224577b
            int r4 = r4 + r5
            r1.f224577b = r4
            goto L_0x058f
        L_0x058a:
            int r4 = r1.f224578c
            int r4 = r4 + r5
            r1.f224578c = r4
        L_0x058f:
            if (r2 < 0) goto L_0x059a
            int r2 = r42.size()
            int r3 = r1.f224581f
            int r3 = r3 + r2
            r1.f224581f = r3
        L_0x059a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelgetchatroommsg.C68111c.mo93625h(ob0.c, int, java.util.LinkedList):void");
    }
}
