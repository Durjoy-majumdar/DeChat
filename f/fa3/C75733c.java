package fa3;

import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C57597j4;
import com.tencent.p014mm.storage.C57599k4;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C97625j3;
import f40.C86709a0;
import hd0.C98408n0;
import hd0.C98410o0;
import java.io.IOException;
import java.util.HashMap;
import ob0.C11385n;
import ob0.C117747y;
import p682rz.C101488s;
import p682rz.C101489t;
import p682rz.C101491u;
import qg2.C77335p;

/* renamed from: fa3.c */
public class C75733c implements C101489t.C77595a, C11385n {

    /* renamed from: d */
    public C57597j4 f222332d = new C57597j4();

    /* renamed from: e */
    public HashMap<String, C72963f4> f222333e = new HashMap<>();

    /* renamed from: fa3.c$a */
    public class C75734a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f222334d;

        public C75734a(long j) {
            this.f222334d = j;
        }

        public void run() {
            C75733c cVar = C75733c.this;
            long j = this.f222334d;
            cVar.getClass();
            C57599k4 k4Var = new C57599k4();
            k4Var.f164917d = j;
            k4Var.f164919f = Util.nowSecond();
            cVar.f222332d.f164916d.add(k4Var);
            cVar.mo106059d();
            cVar.mo106057b();
        }
    }

    /* renamed from: fa3.c$b */
    public class C75735b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f222336d;

        public C75735b(long j) {
            this.f222336d = j;
        }

        public void run() {
            C75733c cVar = C75733c.this;
            long j = this.f222336d;
            for (int i = 0; i < cVar.f222332d.f164916d.size(); i++) {
                C57599k4 k4Var = cVar.f222332d.f164916d.get(i);
                if (k4Var.f164917d == j) {
                    cVar.f222332d.f164916d.remove(k4Var);
                    cVar.mo106059d();
                    return;
                }
            }
        }
    }

    /* renamed from: fa3.c$c */
    public class C75736c implements Runnable {
        public C75736c() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:90:0x030b  */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x0316  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r16 = this;
                r0 = r16
                fa3.c r1 = fa3.C75733c.this
                r2 = 0
                r3 = 0
            L_0x0006:
                com.tencent.mm.storage.j4 r4 = r1.f222332d
                java.util.LinkedList<com.tencent.mm.storage.k4> r4 = r4.f164916d
                int r4 = r4.size()
                if (r3 >= r4) goto L_0x0340
                com.tencent.mm.storage.j4 r4 = r1.f222332d
                java.util.LinkedList<com.tencent.mm.storage.k4> r4 = r4.f164916d
                java.lang.Object r4 = r4.get(r3)
                com.tencent.mm.storage.k4 r4 = (com.tencent.p014mm.storage.C57599k4) r4
                long r5 = r4.f164919f
                long r5 = com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r5)
                r7 = 259200(0x3f480, double:1.28062E-318)
                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r9 <= 0) goto L_0x0036
                com.tencent.mm.storage.j4 r2 = r1.f222332d
                java.util.LinkedList<com.tencent.mm.storage.k4> r2 = r2.f164916d
                r2.remove(r4)
                r1.mo106059d()
                r1.mo106057b()
                goto L_0x0340
            L_0x0036:
                long r5 = r4.f164918e
                r7 = 0
                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r9 == 0) goto L_0x004b
                long r5 = com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r5)
                r9 = 900(0x384, double:4.447E-321)
                int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r11 >= 0) goto L_0x004b
                int r3 = r3 + 1
                goto L_0x0006
            L_0x004b:
                eb0.c r3 = eb0.C97625j3.m125812b()
                g62.l r3 = r3.mo105911z()
                long r5 = r4.f164917d
                com.tencent.mm.storage.g4 r3 = (com.tencent.p014mm.storage.C72972g4) r3
                com.tencent.mm.storage.f4 r3 = r3.b00(r5)
                long r5 = r3.mo108774y2()
                java.lang.String r9 = "MicroMsg.MultiTerminalSyncMgr"
                r10 = 1
                int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r11 == 0) goto L_0x0323
                boolean r5 = r3.mo100972K3()
                if (r5 == 0) goto L_0x006e
                goto L_0x0323
            L_0x006e:
                java.lang.Class<rz.u> r5 = p682rz.C101491u.class
                java.lang.Class<gt.k> r6 = p158gt.C98201k.class
                r11 = 4
                java.lang.Object[] r11 = new java.lang.Object[r11]
                java.lang.String r12 = r3.mo108768t()
                r11[r2] = r12
                long r12 = r3.mo108774y2()
                java.lang.Long r12 = java.lang.Long.valueOf(r12)
                r11[r10] = r12
                long r12 = r3.getMsgId()
                java.lang.Long r12 = java.lang.Long.valueOf(r12)
                r13 = 2
                r11[r13] = r12
                java.lang.String r12 = r3.mo108765s2()
                r14 = 3
                r11[r14] = r12
                java.lang.String r12 = "statusNotify sendCommand DownloadFile user:%s, msgSvrId:%d, msgLocalId:%d, path:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r12, r11)
                boolean r11 = r3.mo100979R3()
                r12 = 1048576(0x100000, float:1.469368E-39)
                r15 = 26214400(0x1900000, float:5.2897246E-38)
                r13 = 0
                if (r11 == 0) goto L_0x0158
                di3.d r5 = di3.C86312j.m106911c(r6)
                gt.k r5 = (p158gt.C98201k) r5
                gt.m r5 = r5.mo137277xi()
                java.lang.String r7 = r3.mo108768t()
                long r10 = r3.mo108774y2()
                com.tencent.mm.modelimage.m r5 = (com.tencent.p014mm.modelimage.C92839m) r5
                com.tencent.mm.modelimage.k r5 = r5.mo127168NQ(r7, r10)
                java.lang.String r7 = r3.getContent()
                java.lang.String r8 = "msg"
                java.util.Map r7 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r7, r8, r13)
                if (r7 != 0) goto L_0x00ce
                r7 = 0
                goto L_0x00da
            L_0x00ce:
                java.lang.String r8 = ".msg.img.$length"
                java.lang.Object r7 = r7.get(r8)
                java.lang.String r7 = (java.lang.String) r7
                int r7 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r7, (int) r2)
            L_0x00da:
                boolean r8 = r5.mo127146q()
                if (r8 != 0) goto L_0x0307
                if (r7 == 0) goto L_0x0307
                if (r7 <= r15) goto L_0x00e6
                goto L_0x0307
            L_0x00e6:
                if (r7 <= r12) goto L_0x0103
                android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                boolean r8 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r8)
                if (r8 != 0) goto L_0x0103
                r8 = 1
                java.lang.Object[] r3 = new java.lang.Object[r8]
                java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
                r3[r2] = r5
                java.lang.String r2 = "autoDownload image too big, totalLen:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r2, r3)
            L_0x0100:
                r6 = 1
                goto L_0x02be
            L_0x0103:
                r8 = 1
                java.lang.Object[] r10 = new java.lang.Object[r8]
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r10[r2] = r7
                java.lang.String r2 = "autoDownload image, totalLen:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r2, r10)
                com.tencent.mm.modelcdntran.CdnTransportService r2 = com.tencent.p014mm.modelcdntran.C92779i0.Ex0()
                java.util.HashSet<java.lang.String> r2 = r2.f266896t
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "image_"
                r7.append(r8)
                long r8 = r3.getMsgId()
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r2.add(r7)
                di3.d r2 = di3.C86312j.m106911c(r6)
                gt.k r2 = (p158gt.C98201k) r2
                gt.j r2 = r2.Jp0()
                long r7 = r5.f267374a
                long r9 = r3.getMsgId()
                r11 = 0
                long r5 = r3.mo108774y2()
                java.lang.Long r12 = java.lang.Long.valueOf(r5)
                r13 = 2131231566(0x7f08034e, float:1.8079217E38)
                fa3.d r14 = new fa3.d
                r14.<init>(r1)
                r6 = r2
                com.tencent.mm.modelimage.e r6 = (com.tencent.p014mm.modelimage.C92822e) r6
                r6.mo127101c(r7, r9, r11, r12, r13, r14)
                goto L_0x0304
            L_0x0158:
                int r6 = r3.getType()
                r10 = 43
                if (r6 == r10) goto L_0x026e
                int r6 = r3.getType()
                r10 = 44
                if (r6 == r10) goto L_0x026e
                int r6 = r3.getType()
                r10 = 62
                if (r6 != r10) goto L_0x0172
                goto L_0x026e
            L_0x0172:
                boolean r5 = r3.mo101020w3()
                if (r5 == 0) goto L_0x025a
                java.lang.String r5 = r3.getContent()
                com.tencent.mm.message.l$b r5 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r5, r13)
                if (r5 == 0) goto L_0x0244
                int r6 = r5.f195582i
                r10 = 6
                if (r6 == r10) goto L_0x0189
                goto L_0x0244
            L_0x0189:
                int r5 = r5.f195594l
                long r5 = (long) r5
                long r10 = (long) r15
                int r15 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r15 <= 0) goto L_0x0193
                goto L_0x0307
            L_0x0193:
                long r10 = (long) r12
                int r12 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r12 <= 0) goto L_0x01b2
                android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                boolean r10 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r10)
                if (r10 != 0) goto L_0x01b2
                r10 = 1
                java.lang.Object[] r3 = new java.lang.Object[r10]
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                r3[r2] = r5
                java.lang.String r2 = "autoDownload attach too big, totalLen:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r2, r3)
                goto L_0x0100
            L_0x01b2:
                java.lang.String r10 = r3.getContent()
                com.tencent.mm.message.l$b r10 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r10, r13)
                java.lang.String r11 = "MicroMsg.AppMsgLogic"
                if (r10 != 0) goto L_0x01ce
                r12 = 1
                java.lang.Object[] r10 = new java.lang.Object[r12]
                java.lang.String r12 = r3.getContent()
                r10[r2] = r12
                java.lang.String r12 = "parse msgContent error, %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r12, r10)
                r11 = r13
                goto L_0x021c
            L_0x01ce:
                java.lang.String r12 = r10.f195606o
                boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
                if (r12 == 0) goto L_0x0205
                java.lang.String r12 = r10.f195500J
                boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
                if (r12 != 0) goto L_0x0205
                r12 = 1
                java.lang.Object[] r14 = new java.lang.Object[r12]
                java.lang.String r12 = r3.getContent()
                r14[r2] = r12
                java.lang.String r12 = "msgContent format error, %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r12, r14)
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = ""
                r11.append(r12)
                java.lang.String r12 = r10.f195500J
                int r12 = r12.hashCode()
                r11.append(r12)
                java.lang.String r11 = r11.toString()
                r10.f195606o = r11
            L_0x0205:
                java.lang.String r10 = r10.f195606o
                long r11 = r3.getMsgId()
                com.tencent.mm.pluginsdk.model.app.d r11 = com.tencent.p014mm.pluginsdk.model.app.C72695v.m85064f(r10, r11)
                if (r11 != 0) goto L_0x021c
                com.tencent.p014mm.pluginsdk.model.app.C72695v.m85057J(r10, r3)
                long r11 = r3.getMsgId()
                com.tencent.mm.pluginsdk.model.app.d r11 = com.tencent.p014mm.pluginsdk.model.app.C72695v.m85064f(r10, r11)
            L_0x021c:
                if (r11 != 0) goto L_0x0225
                java.lang.String r2 = "attachInfo is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
                goto L_0x0307
            L_0x0225:
                boolean r10 = r11.mo100146l2()
                if (r10 != 0) goto L_0x0307
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 != 0) goto L_0x0231
                goto L_0x0307
            L_0x0231:
                r7 = 1
                java.lang.Object[] r8 = new java.lang.Object[r7]
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                r8[r2] = r5
                java.lang.String r2 = "autoDownload attach, totalLen:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r2, r8)
                com.tencent.p014mm.pluginsdk.model.app.C72695v.m85062d(r3, r13)
                goto L_0x0304
            L_0x0244:
                r7 = 1
                java.lang.Object[] r3 = new java.lang.Object[r7]
                if (r5 != 0) goto L_0x024b
                r5 = 0
                goto L_0x024d
            L_0x024b:
                int r5 = r5.f195582i
            L_0x024d:
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r3[r2] = r5
                java.lang.String r2 = "appMsg not support, subType:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r2, r3)
                goto L_0x0307
            L_0x025a:
                r7 = 1
                java.lang.Object[] r5 = new java.lang.Object[r7]
                int r3 = r3.getType()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r5[r2] = r3
                java.lang.String r2 = "msgType not support:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r2, r5)
                goto L_0x0307
            L_0x026e:
                di3.d r6 = di3.C86312j.m106911c(r5)
                rz.u r6 = (p682rz.C101491u) r6
                java.lang.String r7 = r3.mo108765s2()
                hd0.n0 r6 = r6.mo140806Zd(r7)
                if (r6 != 0) goto L_0x0297
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r5 = "autoDownload failed cause video info not found! The path is "
                r2.append(r5)
                java.lang.String r3 = r3.mo108765s2()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r2)
                goto L_0x0307
            L_0x0297:
                int r7 = r6.f288559f
                int r6 = r6.f288562i
                r8 = 199(0xc7, float:2.79E-43)
                if (r6 == r8) goto L_0x0307
                if (r7 == 0) goto L_0x0307
                if (r7 <= r15) goto L_0x02a4
                goto L_0x0307
            L_0x02a4:
                if (r7 <= r12) goto L_0x02c1
                android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                boolean r6 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r6)
                if (r6 != 0) goto L_0x02c1
                r6 = 1
                java.lang.Object[] r3 = new java.lang.Object[r6]
                java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
                r3[r2] = r5
                java.lang.String r2 = "autoDownload video too big, totalLen:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r2, r3)
            L_0x02be:
                r2 = 1
                r13 = 3
                goto L_0x0309
            L_0x02c1:
                r6 = 1
                java.lang.Object[] r8 = new java.lang.Object[r6]
                java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
                r8[r2] = r6
                java.lang.String r2 = "autoDownload video, totalLen:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r2, r8)
                java.util.HashMap<java.lang.String, com.tencent.mm.storage.f4> r2 = r1.f222333e
                java.lang.String r6 = r3.mo108765s2()
                r2.put(r6, r3)
                di3.d r2 = di3.C86312j.m106911c(r5)
                rz.u r2 = (p682rz.C101491u) r2
                java.lang.String r5 = r3.mo108765s2()
                r2.M00(r5)
                com.tencent.mm.modelcdntran.CdnTransportService r2 = com.tencent.p014mm.modelcdntran.C92779i0.Ex0()
                java.util.HashSet<java.lang.String> r2 = r2.f266896t
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "video_"
                r5.append(r6)
                long r6 = r3.getMsgId()
                r5.append(r6)
                java.lang.String r3 = r5.toString()
                r2.add(r3)
            L_0x0304:
                r2 = 1
                r13 = 2
                goto L_0x0309
            L_0x0307:
                r2 = 1
                r13 = 1
            L_0x0309:
                if (r13 != r2) goto L_0x0316
                com.tencent.mm.storage.j4 r2 = r1.f222332d
                java.util.LinkedList<com.tencent.mm.storage.k4> r2 = r2.f164916d
                r2.remove(r4)
                r1.mo106059d()
                goto L_0x031f
            L_0x0316:
                long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
                r4.f164918e = r2
                r1.mo106059d()
            L_0x031f:
                r1.mo106057b()
                goto L_0x0340
            L_0x0323:
                r3 = 1
                java.lang.Object[] r3 = new java.lang.Object[r3]
                long r5 = r4.f164917d
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                r3[r2] = r5
                java.lang.String r2 = "msg not exit or cleaned, msgLocalId:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r2, r3)
                com.tencent.mm.storage.j4 r2 = r1.f222332d
                java.util.LinkedList<com.tencent.mm.storage.k4> r2 = r2.f164916d
                r2.remove(r4)
                r1.mo106059d()
                r1.mo106057b()
            L_0x0340:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: fa3.C75733c.C75736c.run():void");
        }
    }

    public C75733c() {
        StringBuilder sb = new StringBuilder();
        C86709a0.m107528h();
        sb.append(C86709a0.m107535s().f251807e);
        sb.append("syncmsgid.ini");
        byte[] O = C86013q1.m106433O(sb.toString(), 0, -1);
        if (!Util.isNullOrNil(O)) {
            try {
                this.f222332d.parseFrom(O);
            } catch (Exception unused) {
                Log.m105928w("MicroMsg.MultiTerminalSyncMgr", "task parse Error");
            }
        }
        ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137716b(this, Looper.getMainLooper());
        C86709a0.m107524d().mo123455a(221, this);
    }

    /* renamed from: a */
    public void mo106056a(long j) {
        if (!((Boolean) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_WEIXIN_MUL_TERMINAL_AUTOSYNC_BOOLEAN, Boolean.TRUE)).booleanValue()) {
            Log.m105924i("MicroMsg.MultiTerminalSyncMgr", "autoSyncState close");
        } else {
            new MMHandler(Looper.getMainLooper()).post(new C75734a(j));
        }
    }

    /* renamed from: b */
    public void mo106057b() {
        new MMHandler(Looper.getMainLooper()).post(new C75736c());
    }

    /* renamed from: c */
    public void mo106058c(long j) {
        new MMHandler(Looper.getMainLooper()).post(new C75735b(j));
    }

    /* renamed from: d */
    public final void mo106059d() {
        try {
            byte[] byteArray = this.f222332d.toByteArray();
            StringBuilder sb = new StringBuilder();
            C86709a0.m107528h();
            sb.append(C86709a0.m107535s().f251807e);
            sb.append("syncmsgid.ini");
            C86013q1.m106438T(sb.toString(), byteArray, 0, byteArray.length);
        } catch (IOException unused) {
            Log.m105928w("MicroMsg.MultiTerminalSyncMgr", "task to file Error");
        }
    }

    /* renamed from: d5 */
    public void mo102579d5(C101489t.C77595a.C77596a aVar) {
        C98408n0 Zd;
        C72963f4 f4Var = this.f222333e.get(aVar.f226215a);
        if (f4Var != null && (Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(f4Var.mo108765s2())) != null) {
            if (f4Var.mo100972K3() || Zd.f288562i == 199) {
                Log.m105925i("MicroMsg.MultiTerminalSyncMgr", "download video end: %d, status:%d", Long.valueOf(f4Var.getMsgId()), Integer.valueOf(Zd.f288562i));
                mo106058c(f4Var.getMsgId());
                this.f222333e.remove(f4Var.mo108765s2());
            } else if (f4Var.getStatus() == 198) {
                this.f222333e.remove(f4Var.mo108765s2());
            }
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (i == 0 && i2 == 0 && (yVar instanceof C77335p)) {
            long j = ((C77335p) yVar).f225469j;
            mo106058c(j);
            Log.m105925i("MicroMsg.MultiTerminalSyncMgr", "download attach end: %d", Long.valueOf(j));
        }
    }
}
