package ye2;

import com.tencent.p014mm.plugin.priority.model.c2c.img.C94293b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75604z3;
import ke2.C99129c;
import kj2.C117407d;
import me2.C10783a;
import pe2.C100786f;
import te3.C101831q8;

/* renamed from: ye2.b */
public class C102839b extends C102838a {

    /* renamed from: d */
    public C72963f4 f303577d;

    public C102839b(C72963f4 f4Var) {
        this.f303577d = f4Var;
    }

    /* renamed from: a */
    public String mo129622a() {
        return "Priority.onC2CImgReceiveTask";
    }

    /* renamed from: b */
    public final void mo142560b(C72963f4 f4Var, int i, int i2, double d, int i3) {
        int i4 = i;
        int i5 = i2;
        Class cls = C99129c.class;
        C99129c cVar = (C99129c) C86312j.m106911c(cls);
        cVar.requireAccountInitialized();
        if (cVar.f290668u != null) {
            C99129c cVar2 = (C99129c) C86312j.m106911c(cls);
            cVar2.requireAccountInitialized();
            cVar2.f290668u.getClass();
            C99129c cVar3 = (C99129c) C86312j.m106911c(cls);
            cVar3.requireAccountInitialized();
            if (!cVar3.f290661n.mo129629e(f4Var.getMsgId())) {
                C117407d dVar = C117407d.INSTANCE;
                dVar.idkeyStat(957, 0, 1, false);
                if (C10783a.m10759c(i4, 8)) {
                    dVar.idkeyStat(957, 1, 1, false);
                }
                if (C10783a.m10759c(i4, 4)) {
                    dVar.idkeyStat(957, 2, 1, false);
                }
                if (C10783a.m10759c(i4, 2)) {
                    dVar.idkeyStat(957, 3, 1, false);
                }
                if (C10783a.m10759c(i4, 16)) {
                    dVar.idkeyStat(957, 4, 1, false);
                }
                if (C10783a.m10759c(i4, 1)) {
                    dVar.idkeyStat(957, 5, 1, false);
                }
                if (C10783a.m10759c(i4, 32)) {
                    dVar.idkeyStat(957, 6, 1, false);
                }
                if (C10783a.m10759c(i4, 64)) {
                    dVar.idkeyStat(957, 7, 1, false);
                }
                if (C10783a.m10759c(i4, 128)) {
                    dVar.idkeyStat(957, 8, 1, false);
                }
                C101831q8 q8Var = new C101831q8();
                q8Var.f299197d = f4Var.getMsgId();
                q8Var.f299198e = f4Var.mo108768t();
                if (C72996z1.m85820U5(f4Var.mo108768t())) {
                    q8Var.f299199f = Util.nullAs(C75604z3.m90847s(f4Var.getContent()), "");
                } else {
                    q8Var.f299199f = f4Var.mo108768t();
                }
                q8Var.f299200g = 1;
                q8Var.f299201h = f4Var.getCreateTime();
                q8Var.f299202i = i4;
                q8Var.f299203j = i5;
                q8Var.f299204n = 0;
                q8Var.f299205o = f4Var.mo108774y2();
                q8Var.f299206p = 0;
                q8Var.f299208r = d;
                q8Var.f299209s = i3;
                C99129c cVar4 = (C99129c) C86312j.m106911c(cls);
                cVar4.requireAccountInitialized();
                C94293b bVar = cVar4.f290661n;
                bVar.f272422b.bindLong(1, q8Var.f299197d);
                bVar.f272422b.bindString(2, q8Var.f299198e);
                bVar.f272422b.bindString(3, q8Var.f299199f);
                bVar.f272422b.bindLong(4, (long) q8Var.f299200g);
                bVar.f272422b.bindLong(5, q8Var.f299201h);
                bVar.f272422b.bindLong(6, (long) q8Var.f299202i);
                bVar.f272422b.bindLong(7, (long) q8Var.f299203j);
                bVar.f272422b.bindLong(8, q8Var.f299204n);
                bVar.f272422b.bindLong(9, q8Var.f299205o);
                bVar.f272422b.bindLong(10, (long) q8Var.f299206p);
                bVar.f272422b.bindLong(11, q8Var.f299207q);
                bVar.f272422b.bindDouble(12, q8Var.f299208r);
                bVar.f272422b.bindLong(13, (long) q8Var.f299209s);
                bVar.f272422b.execute();
                Log.m105925i("MicroMsg.Priority.C2CMsgAutoDownloadImgLogic", "onImgReceive %d %s Insert Res %d %d %.2f %d", Long.valueOf(f4Var.getMsgId()), f4Var.mo108768t(), Integer.valueOf(i), Integer.valueOf(i2), Double.valueOf(d), Integer.valueOf(i3));
                C100786f.m131972c(3, q8Var.f299201h, i5, q8Var);
                if (C72996z1.m85820U5(f4Var.mo108768t())) {
                    C99129c cVar5 = (C99129c) C86312j.m106911c(cls);
                    cVar5.requireAccountInitialized();
                    cVar5.f290663p.mo140566l(q8Var.f299198e, "@all");
                }
                C99129c cVar6 = (C99129c) C86312j.m106911c(cls);
                cVar6.requireAccountInitialized();
                cVar6.f290663p.mo140566l(f4Var.mo108768t(), q8Var.f299199f);
                return;
            }
            Log.m105925i("MicroMsg.Priority.C2CMsgAutoDownloadImgLogic", "onImgReceive %d %s Update Status %d", Long.valueOf(f4Var.getMsgId()), f4Var.mo108768t(), Integer.valueOf(i2));
            C99129c cVar7 = (C99129c) C86312j.m106911c(cls);
            cVar7.requireAccountInitialized();
            cVar7.f290661n.mo129631g(f4Var.getMsgId(), i4, i5);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x022f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r20 = this;
            r7 = r20
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            java.lang.Class<ke2.c> r8 = ke2.C99129c.class
            com.tencent.mm.storage.f4 r1 = r7.f303577d
            long r1 = r1.getCreateTime()
            di3.d r3 = di3.C86312j.m106911c(r8)
            ke2.c r3 = (ke2.C99129c) r3
            r3.requireAccountInitialized()
            long r3 = r3.f290659i
            r5 = 0
            r6 = 1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            java.lang.String r10 = "MicroMsg.Priority.C2CImgReceiveTask"
            int r11 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r11 > 0) goto L_0x003e
            java.lang.Object[] r0 = new java.lang.Object[r6]
            com.tencent.mm.storage.f4 r1 = r7.f303577d
            long r1 = r1.getCreateTime()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            java.lang.String r3 = "yyyy-MM-dd HH:mm:ss"
            java.lang.String r1 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85111d(r3, r1)
            r0[r5] = r1
            java.lang.String r1 = "onC2CImgReceive time condition not support %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r0)
            return
        L_0x003e:
            di3.d r1 = di3.C86312j.m106911c(r8)
            ke2.c r1 = (ke2.C99129c) r1
            r1.requireAccountInitialized()
            com.tencent.mm.plugin.priority.model.c2c.img.b r1 = r1.f290661n
            com.tencent.mm.storage.f4 r2 = r7.f303577d
            long r2 = r2.getMsgId()
            boolean r1 = r1.mo129629e(r2)
            if (r1 == 0) goto L_0x0069
            java.lang.Object[] r0 = new java.lang.Object[r6]
            com.tencent.mm.storage.f4 r1 = r7.f303577d
            long r1 = r1.getMsgId()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0[r5] = r1
            java.lang.String r1 = "img already exist msg %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r0)
            return
        L_0x0069:
            com.tencent.mm.storage.f4 r1 = r7.f303577d
            java.lang.String r1 = r1.mo108768t()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85820U5(r1)
            if (r1 == 0) goto L_0x008d
            di3.d r1 = di3.C86312j.m106911c(r8)
            ke2.c r1 = (ke2.C99129c) r1
            r1.requireAccountInitialized()
            com.tencent.mm.plugin.priority.model.c2c.img.c r1 = r1.f290663p
            com.tencent.mm.storage.f4 r2 = r7.f303577d
            java.lang.String r2 = r2.mo108768t()
            java.lang.String r3 = "@all"
            double[] r1 = r1.mo140561d(r2, r3)
            goto L_0x00a8
        L_0x008d:
            di3.d r1 = di3.C86312j.m106911c(r8)
            ke2.c r1 = (ke2.C99129c) r1
            r1.requireAccountInitialized()
            com.tencent.mm.plugin.priority.model.c2c.img.c r1 = r1.f290663p
            com.tencent.mm.storage.f4 r2 = r7.f303577d
            java.lang.String r2 = r2.mo108768t()
            com.tencent.mm.storage.f4 r3 = r7.f303577d
            java.lang.String r3 = r3.mo108768t()
            double[] r1 = r1.mo140561d(r2, r3)
        L_0x00a8:
            r2 = r1[r5]
            r11 = r1[r6]
            double r2 = java.lang.Math.max(r2, r11)
            r4 = 2
            r11 = r1[r4]
            double r11 = java.lang.Math.max(r2, r11)
            com.tencent.mm.storage.f4 r1 = r7.f303577d
            java.lang.String r1 = r1.f230724G
            eb0.z3$$h r1 = eb0.C75604z3.m90851w(r1)
            if (r1 != 0) goto L_0x00c2
            goto L_0x00d1
        L_0x00c2:
            java.lang.String r1 = r1.f222112s
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 == 0) goto L_0x00cb
            goto L_0x00d3
        L_0x00cb:
            boolean r1 = xb0.C38471b.m41885a(r1)
            if (r1 == 0) goto L_0x00d3
        L_0x00d1:
            r1 = 0
            goto L_0x00d4
        L_0x00d3:
            r1 = 1
        L_0x00d4:
            if (r1 != 0) goto L_0x00d8
            r3 = 4
            goto L_0x00d9
        L_0x00d8:
            r3 = 0
        L_0x00d9:
            boolean r13 = xb0.C38471b.m41887c()
            r13 = r13 ^ r6
            if (r13 != 0) goto L_0x00e3
            r3 = r3 | 2
            r1 = 0
        L_0x00e3:
            boolean r13 = ne2.C34823a.m40472b()
            if (r13 != 0) goto L_0x00ec
            r3 = r3 | 16
            r1 = 0
        L_0x00ec:
            com.tencent.mm.storage.f4 r13 = r7.f303577d
            java.lang.String r13 = r13.mo108768t()
            boolean r13 = ne2.C34823a.m40473c(r13)
            if (r13 == 0) goto L_0x00fa
            r3 = r3 | 8
        L_0x00fa:
            di3.d r13 = di3.C86312j.m106911c(r0)
            h81.h r13 = (h81.C32735h) r13
            h81.h$c r14 = h81.C32735h.C32737c.clicfg_mmc2c_chat_img_auto_download_flag
            boolean r13 = r13.mo58784wf(r14, r5)
            java.lang.String r14 = "C2CImgReceiveTask Click Rate %.2f %d Start To Auto Download %d MsgId %d receiveCount %d"
            java.lang.String r15 = "C2CImgReceiveTask Click Rate %.2f %d Start To Auto Download %d MsgId %d"
            java.lang.String r4 = "C2CImgReceiveTask Click Rate %.2f %d Not To Auto Download %d MsgId %d"
            r5 = 3
            if (r13 != 0) goto L_0x022f
            di3.d r0 = di3.C86312j.m106911c(r8)
            ke2.c r0 = (ke2.C99129c) r0
            r0.getClass()
            r0 = 1050253722(0x3e99999a, float:0.3)
            r17 = r3
            double r2 = (double) r0
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x018f
            if (r1 == 0) goto L_0x015f
            r2 = r17 | 1
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Double r1 = java.lang.Double.valueOf(r11)
            r3 = 0
            r0[r3] = r1
            r0[r6] = r9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r3 = 2
            r0[r3] = r1
            com.tencent.mm.storage.f4 r1 = r7.f303577d
            long r3 = r1.getMsgId()
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r0[r5] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r15, r0)
            com.tencent.mm.storage.f4 r1 = r7.f303577d
            r3 = 1
            r6 = 1
            r0 = r20
            r4 = r11
            r0.mo142560b(r1, r2, r3, r4, r6)
            di3.d r0 = di3.C86312j.m106911c(r8)
            ke2.c r0 = (ke2.C99129c) r0
            com.tencent.mm.plugin.priority.model.c2c.img.C2CImgAutoDownloader r0 = r0.f290671x
            r0.mo129621d()
            goto L_0x03b0
        L_0x015f:
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Double r1 = java.lang.Double.valueOf(r11)
            r2 = 0
            r0[r2] = r1
            r0[r6] = r9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r2 = 2
            r0[r2] = r1
            com.tencent.mm.storage.f4 r1 = r7.f303577d
            long r1 = r1.getMsgId()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0[r5] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r4, r0)
            com.tencent.mm.storage.f4 r1 = r7.f303577d
            r3 = 1
            r6 = 1
            r0 = r20
            r2 = r17
            r4 = r11
            r0.mo142560b(r1, r2, r3, r4, r6)
            goto L_0x03b0
        L_0x018f:
            if (r1 == 0) goto L_0x01fd
            com.tencent.mm.storage.f4 r0 = r7.f303577d
            java.lang.String r0 = r0.mo108768t()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85820U5(r0)
            if (r0 != 0) goto L_0x01fd
            di3.d r0 = di3.C86312j.m106911c(r8)
            ke2.c r0 = (ke2.C99129c) r0
            r0.requireAccountInitialized()
            com.tencent.mm.plugin.priority.model.c2c.img.c r0 = r0.f290663p
            com.tencent.mm.storage.f4 r1 = r7.f303577d
            java.lang.String r1 = r1.mo108768t()
            com.tencent.mm.storage.f4 r2 = r7.f303577d
            java.lang.String r2 = r2.mo108768t()
            int r0 = r0.mo140562h(r1, r2)
            r1 = 2
            if (r0 >= r1) goto L_0x01fd
            r3 = r17
            r2 = r3 | 128(0x80, float:1.794E-43)
            r3 = 5
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Double r4 = java.lang.Double.valueOf(r11)
            r15 = 0
            r3[r15] = r4
            r3[r6] = r9
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r3[r1] = r4
            com.tencent.mm.storage.f4 r1 = r7.f303577d
            long r15 = r1.getMsgId()
            java.lang.Long r1 = java.lang.Long.valueOf(r15)
            r3[r5] = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 4
            r3[r1] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r14, r3)
            com.tencent.mm.storage.f4 r1 = r7.f303577d
            r3 = 1
            r6 = 1
            r0 = r20
            r4 = r11
            r0.mo142560b(r1, r2, r3, r4, r6)
            di3.d r0 = di3.C86312j.m106911c(r8)
            ke2.c r0 = (ke2.C99129c) r0
            com.tencent.mm.plugin.priority.model.c2c.img.C2CImgAutoDownloader r0 = r0.f290671x
            r0.mo129621d()
            return
        L_0x01fd:
            r3 = r17
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Double r1 = java.lang.Double.valueOf(r11)
            r2 = 0
            r0[r2] = r1
            r0[r6] = r9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r2 = 2
            r0[r2] = r1
            com.tencent.mm.storage.f4 r1 = r7.f303577d
            long r1 = r1.getMsgId()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0[r5] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r4, r0)
            r2 = r3 | 64
            com.tencent.mm.storage.f4 r1 = r7.f303577d
            r3 = 1
            r6 = 1
            r0 = r20
            r4 = r11
            r0.mo142560b(r1, r2, r3, r4, r6)
            goto L_0x03b0
        L_0x022f:
            di3.d r2 = di3.C86312j.m106911c(r8)
            ke2.c r2 = (ke2.C99129c) r2
            r2.requireAccountInitialized()
            re2.a r2 = r2.f290670w
            com.tencent.mm.storage.f4 r13 = r7.f303577d
            java.lang.String r13 = r13.mo108768t()
            r2.getClass()
            di3.d r2 = di3.C86312j.m106911c(r8)
            ke2.c r2 = (ke2.C99129c) r2
            r2.requireAccountInitialized()
            re2.b r2 = r2.f290666s
            te3.js r2 = r2.mo140859b(r13)
            di3.d r18 = di3.C86312j.m106911c(r0)
            r6 = r18
            h81.h r6 = (h81.C32735h) r6
            h81.h$c r5 = h81.C32735h.C32737c.clicfg_mmc2c_chat_img_auto_download_rank
            r19 = r14
            r14 = 10
            int r5 = r6.mo58779Qe(r5, r14)
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r6 = h81.C32735h.C32737c.clicfg_mmc2c_chat_img_auto_download_score
            r14 = 1092616192(0x41200000, float:10.0)
            float r0 = r0.mo58785xe(r6, r14)
            r6 = 3
            java.lang.Object[] r14 = new java.lang.Object[r6]
            r6 = 0
            r14[r6] = r13
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r13 = 1
            r14[r13] = r6
            java.lang.Float r6 = java.lang.Float.valueOf(r0)
            r13 = 2
            r14[r13] = r6
            java.lang.String r6 = "MicroMsg.Priority.C2CChatUsageLogic"
            java.lang.String r13 = "getAutoDownloadImgFlag %s %s %.2f"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r13, r14)
            if (r2 == 0) goto L_0x029c
            int r6 = r2.f298561j
            if (r6 > r5) goto L_0x029c
            double r5 = r2.f298560i
            double r13 = (double) r0
            int r0 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x029c
            r0 = 1
            goto L_0x029d
        L_0x029c:
            r0 = 0
        L_0x029d:
            if (r0 == 0) goto L_0x0310
            if (r1 == 0) goto L_0x02de
            r0 = 1
            r2 = r3 | 1
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Double r3 = java.lang.Double.valueOf(r11)
            r4 = 0
            r1[r4] = r3
            r1[r0] = r9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r3 = 2
            r1[r3] = r0
            com.tencent.mm.storage.f4 r0 = r7.f303577d
            long r3 = r0.getMsgId()
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r3 = 3
            r1[r3] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r15, r1)
            com.tencent.mm.storage.f4 r1 = r7.f303577d
            r3 = 1
            r6 = 1
            r0 = r20
            r4 = r11
            r0.mo142560b(r1, r2, r3, r4, r6)
            di3.d r0 = di3.C86312j.m106911c(r8)
            ke2.c r0 = (ke2.C99129c) r0
            com.tencent.mm.plugin.priority.model.c2c.img.C2CImgAutoDownloader r0 = r0.f290671x
            r0.mo129621d()
            goto L_0x03b0
        L_0x02de:
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Double r1 = java.lang.Double.valueOf(r11)
            r2 = 0
            r0[r2] = r1
            r1 = 1
            r0[r1] = r9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r2 = 2
            r0[r2] = r1
            com.tencent.mm.storage.f4 r1 = r7.f303577d
            long r1 = r1.getMsgId()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 3
            r0[r2] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r4, r0)
            com.tencent.mm.storage.f4 r1 = r7.f303577d
            r4 = 1
            r6 = 1
            r0 = r20
            r2 = r3
            r3 = r4
            r4 = r11
            r0.mo142560b(r1, r2, r3, r4, r6)
            goto L_0x03b0
        L_0x0310:
            if (r1 == 0) goto L_0x0380
            com.tencent.mm.storage.f4 r0 = r7.f303577d
            java.lang.String r0 = r0.mo108768t()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85820U5(r0)
            if (r0 != 0) goto L_0x0380
            di3.d r0 = di3.C86312j.m106911c(r8)
            ke2.c r0 = (ke2.C99129c) r0
            r0.requireAccountInitialized()
            com.tencent.mm.plugin.priority.model.c2c.img.c r0 = r0.f290663p
            com.tencent.mm.storage.f4 r1 = r7.f303577d
            java.lang.String r1 = r1.mo108768t()
            com.tencent.mm.storage.f4 r2 = r7.f303577d
            java.lang.String r2 = r2.mo108768t()
            int r0 = r0.mo140562h(r1, r2)
            r1 = 2
            if (r0 >= r1) goto L_0x0380
            r2 = r3 | 128(0x80, float:1.794E-43)
            r3 = 5
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Double r4 = java.lang.Double.valueOf(r11)
            r5 = 0
            r3[r5] = r4
            r4 = 1
            r3[r4] = r9
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r3[r1] = r4
            com.tencent.mm.storage.f4 r1 = r7.f303577d
            long r4 = r1.getMsgId()
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r4 = 3
            r3[r4] = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 4
            r3[r1] = r0
            r0 = r19
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r0, r3)
            com.tencent.mm.storage.f4 r1 = r7.f303577d
            r3 = 1
            r6 = 1
            r0 = r20
            r4 = r11
            r0.mo142560b(r1, r2, r3, r4, r6)
            di3.d r0 = di3.C86312j.m106911c(r8)
            ke2.c r0 = (ke2.C99129c) r0
            com.tencent.mm.plugin.priority.model.c2c.img.C2CImgAutoDownloader r0 = r0.f290671x
            r0.mo129621d()
            return
        L_0x0380:
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Double r1 = java.lang.Double.valueOf(r11)
            r2 = 0
            r0[r2] = r1
            r1 = 1
            r0[r1] = r9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r2 = 2
            r0[r2] = r1
            com.tencent.mm.storage.f4 r1 = r7.f303577d
            long r1 = r1.getMsgId()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 3
            r0[r2] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r4, r0)
            r2 = r3 | 512(0x200, float:7.175E-43)
            com.tencent.mm.storage.f4 r1 = r7.f303577d
            r3 = 1
            r6 = 1
            r0 = r20
            r4 = r11
            r0.mo142560b(r1, r2, r3, r4, r6)
        L_0x03b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ye2.C102839b.run():void");
    }
}
