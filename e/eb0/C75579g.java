package eb0;

import com.tencent.p014mm.app.C80610p1;
import com.tencent.p014mm.autogen.events.BroadcastEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f62.C31922b1;
import f62.C31943p0;
import java.io.ByteArrayOutputStream;
import java.security.MessageDigest;
import java.util.LinkedHashMap;
import java.util.Map;
import jm2.C117361f;

/* renamed from: eb0.g */
public class C75579g implements C31922b1 {

    /* renamed from: f */
    public static C31463c f222031f;

    /* renamed from: d */
    public long f222032d = -1;

    /* renamed from: e */
    public final LinkedHashMap<String, C31464d> f222033e;

    /* renamed from: eb0.g$b */
    public class C31462b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Map f84187d;

        public C31462b(C75579g gVar, Map map) {
            this.f84187d = map;
        }

        public void run() {
            C117361f fVar = C117361f.INSTANCE;
            int i = Util.getInt((String) this.f84187d.get(".sysmsg.ClientCheckGetExtInfo.ReportContext"), 0);
            if (Util.getInt((String) this.f84187d.get(".sysmsg.ClientCheckGetExtInfo.Basic"), 0) != 0) {
                fVar.mo182033dk(i, 0);
            } else {
                fVar.mo182033dk(i, 1008);
            }
        }
    }

    /* renamed from: eb0.g$c */
    public interface C31463c {
    }

    /* renamed from: eb0.g$d */
    public interface C31464d extends C31943p0 {
        /* renamed from: a */
        boolean mo58188a();
    }

    /* renamed from: eb0.g$a */
    public class C75580a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f222034d;

        public C75580a(C75579g gVar, String str) {
            this.f222034d = str;
        }

        public void run() {
            C31463c cVar = C75579g.f222031f;
            if (cVar != null) {
                String str = this.f222034d;
                ((C80610p1) cVar).getClass();
                Log.m105925i("MicroMsg.WorkerProfile", "summerdiz onReMoveNoticeId:%s", str);
                BroadcastEvent broadcastEvent = new BroadcastEvent();
                BroadcastEvent.C80706a aVar = broadcastEvent.f343529d;
                aVar.f236156a = 1;
                aVar.f236157b = str;
                broadcastEvent.publish();
            }
        }
    }

    public C75579g() {
        LinkedHashMap<String, C31464d> linkedHashMap = new LinkedHashMap<>();
        this.f222033e = linkedHashMap;
        linkedHashMap.put("qy_revoke_msg", new C31489m());
    }

    /* renamed from: D */
    public static String m90707D(Object... objArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            for (String str : objArr) {
                if (str instanceof String) {
                    byteArrayOutputStream.write(str.getBytes());
                } else if (str instanceof Integer) {
                    int intValue = ((Integer) str).intValue();
                    for (int i = 0; i < 4; i++) {
                        byteArrayOutputStream.write(intValue & 255);
                        intValue >>= 8;
                    }
                } else if (str instanceof Long) {
                    long longValue = ((Long) str).longValue();
                    for (int i2 = 0; i2 < 8; i2++) {
                        byteArrayOutputStream.write((int) (255 & longValue));
                        longValue >>= 8;
                    }
                } else {
                    int i3 = 1;
                    if (str instanceof Boolean) {
                        if (!((Boolean) str).booleanValue()) {
                            i3 = 0;
                        }
                        byteArrayOutputStream.write(i3);
                    } else {
                        Log.m105921e("MicroMsg.BigBallSysCmdMsgConsumer", "Invalid object class: %s", str);
                        return "";
                    }
                }
            }
            return Util.encodeHexString(MessageDigest.getInstance("MD5").digest(byteArrayOutputStream.toByteArray()));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BigBallSysCmdMsgConsumer", e, "", new Object[0]);
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0083 A[SYNTHETIC, Splitter:B:42:0x0083] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008a A[SYNTHETIC, Splitter:B:46:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0091 A[SYNTHETIC, Splitter:B:52:0x0091] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0098 A[SYNTHETIC, Splitter:B:56:0x0098] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m90708d(java.lang.String r9, long r10, long r12) {
        /*
            java.lang.String r0 = ""
            r1 = 0
            r2 = 0
            java.lang.String r3 = "@"
            boolean r3 = r9.startsWith(r3)     // Catch:{ Exception -> 0x0078, all -> 0x0075 }
            if (r3 == 0) goto L_0x0029
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0078, all -> 0x0075 }
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()     // Catch:{ Exception -> 0x0078, all -> 0x0075 }
            java.lang.String r3 = r3.sourceDir     // Catch:{ Exception -> 0x0078, all -> 0x0075 }
            java.util.zip.ZipFile r4 = new java.util.zip.ZipFile     // Catch:{ Exception -> 0x0078, all -> 0x0075 }
            r4.<init>(r3)     // Catch:{ Exception -> 0x0078, all -> 0x0075 }
            r3 = 1
            java.lang.String r9 = r9.substring(r3)     // Catch:{ Exception -> 0x0073 }
            java.util.zip.ZipEntry r9 = r4.getEntry(r9)     // Catch:{ Exception -> 0x0073 }
            java.io.InputStream r9 = r4.getInputStream(r9)     // Catch:{ Exception -> 0x0073 }
            goto L_0x002e
        L_0x0029:
            java.io.InputStream r9 = com.tencent.p014mm.vfs.C86013q1.m106423E(r9)     // Catch:{ Exception -> 0x0078, all -> 0x0075 }
            r4 = r1
        L_0x002e:
            r1 = r9
        L_0x002f:
            r5 = 0
            int r9 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r9 <= 0) goto L_0x003b
            long r5 = r1.skip(r10)     // Catch:{ Exception -> 0x0073 }
            long r10 = r10 - r5
            goto L_0x002f
        L_0x003b:
            java.lang.String r9 = "MD5"
            java.security.MessageDigest r9 = java.security.MessageDigest.getInstance(r9)     // Catch:{ Exception -> 0x0073 }
            r10 = 2048(0x800, float:2.87E-42)
            byte[] r10 = new byte[r10]     // Catch:{ Exception -> 0x0073 }
        L_0x0045:
            int r11 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r11 <= 0) goto L_0x005e
            r7 = 2048(0x800, double:1.0118E-320)
            long r7 = java.lang.Math.min(r7, r12)     // Catch:{ Exception -> 0x0073 }
            int r11 = (int) r7     // Catch:{ Exception -> 0x0073 }
            int r11 = r1.read(r10, r2, r11)     // Catch:{ Exception -> 0x0073 }
            r3 = -1
            if (r11 != r3) goto L_0x0058
            goto L_0x005e
        L_0x0058:
            r9.update(r10, r2, r11)     // Catch:{ Exception -> 0x0073 }
            long r7 = (long) r11     // Catch:{ Exception -> 0x0073 }
            long r12 = r12 - r7
            goto L_0x0045
        L_0x005e:
            byte[] r9 = r9.digest()     // Catch:{ Exception -> 0x0073 }
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.encodeHexString(r9)     // Catch:{ Exception -> 0x0073 }
            if (r1 == 0) goto L_0x006d
            r1.close()     // Catch:{ IOException -> 0x006c }
            goto L_0x006d
        L_0x006c:
        L_0x006d:
            if (r4 == 0) goto L_0x0072
            r4.close()     // Catch:{ IOException -> 0x0072 }
        L_0x0072:
            return r9
        L_0x0073:
            r9 = move-exception
            goto L_0x007a
        L_0x0075:
            r9 = move-exception
            r4 = r1
            goto L_0x008f
        L_0x0078:
            r9 = move-exception
            r4 = r1
        L_0x007a:
            java.lang.String r10 = "MicroMsg.BigBallSysCmdMsgConsumer"
            java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch:{ all -> 0x008e }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r9, r0, r11)     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x0088
            r1.close()     // Catch:{ IOException -> 0x0087 }
            goto L_0x0088
        L_0x0087:
        L_0x0088:
            if (r4 == 0) goto L_0x008d
            r4.close()     // Catch:{ IOException -> 0x008d }
        L_0x008d:
            return r0
        L_0x008e:
            r9 = move-exception
        L_0x008f:
            if (r1 == 0) goto L_0x0096
            r1.close()     // Catch:{ IOException -> 0x0095 }
            goto L_0x0096
        L_0x0095:
        L_0x0096:
            if (r4 == 0) goto L_0x009b
            r4.close()     // Catch:{ IOException -> 0x009b }
        L_0x009b:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: eb0.C75579g.m90708d(java.lang.String, long, long):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0046 A[SYNTHETIC, Splitter:B:29:0x0046] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x004c A[SYNTHETIC, Splitter:B:34:0x004c] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m90709q(java.lang.String r6) {
        /*
            java.lang.String r0 = "@"
            boolean r0 = r6.startsWith(r0)
            if (r0 == 0) goto L_0x0050
            r0 = 0
            r1 = -1
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ IOException -> 0x0039 }
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()     // Catch:{ IOException -> 0x0039 }
            java.lang.String r3 = r3.sourceDir     // Catch:{ IOException -> 0x0039 }
            java.util.zip.ZipFile r4 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x0039 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x0039 }
            r0 = 1
            java.lang.String r6 = r6.substring(r0)     // Catch:{ IOException -> 0x0034, all -> 0x0031 }
            java.util.zip.ZipEntry r6 = r4.getEntry(r6)     // Catch:{ IOException -> 0x0034, all -> 0x0031 }
            if (r6 != 0) goto L_0x0029
            r4.close()     // Catch:{ IOException -> 0x0028 }
        L_0x0028:
            return r1
        L_0x0029:
            long r0 = r6.getSize()     // Catch:{ IOException -> 0x0034, all -> 0x0031 }
            r4.close()     // Catch:{ IOException -> 0x0030 }
        L_0x0030:
            return r0
        L_0x0031:
            r6 = move-exception
            r0 = r4
            goto L_0x004a
        L_0x0034:
            r6 = move-exception
            r0 = r4
            goto L_0x003a
        L_0x0037:
            r6 = move-exception
            goto L_0x004a
        L_0x0039:
            r6 = move-exception
        L_0x003a:
            java.lang.String r3 = "MicroMsg.BigBallSysCmdMsgConsumer"
            java.lang.String r4 = ""
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0037 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r6, r4, r5)     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0049
            r0.close()     // Catch:{ IOException -> 0x0049 }
        L_0x0049:
            return r1
        L_0x004a:
            if (r0 == 0) goto L_0x004f
            r0.close()     // Catch:{ IOException -> 0x004f }
        L_0x004f:
            throw r6
        L_0x0050:
            long r0 = com.tencent.p014mm.vfs.C86013q1.m106451l(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: eb0.C75579g.m90709q(java.lang.String):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x01fc  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo105916B(java.lang.String r23, long r24, ob0.C35136m.C35137a r26, java.lang.String r27, java.lang.String r28, java.lang.String r29) {
        /*
            r22 = this;
            r0 = r23
            r2 = r24
            r1 = r26
            r4 = r27
            r5 = r29
            java.lang.Class<pc0.b0> r6 = pc0.C77064b0.class
            java.lang.Class<vd2.d> r7 = vd2.C78384d.class
            java.lang.Class<f62.k0> r8 = f62.C75700k0.class
            r9 = 3
            java.lang.Object[] r10 = new java.lang.Object[r9]
            java.lang.Long r11 = java.lang.Long.valueOf(r24)
            r12 = 0
            r10[r12] = r11
            r11 = 1
            r10[r11] = r0
            boolean r13 = r1.f94243b
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r14 = 2
            r10[r14] = r13
            java.lang.String r13 = "MicroMsg.BigBallSysCmdMsgConsumer"
            java.lang.String r15 = "doRevokeMsg xmlSrvMsgId=%d talker=%s isGet=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r15, r10)
            k40.a r10 = f40.C86709a0.m107533q(r8)
            f62.k0 r10 = (f62.C75700k0) r10
            g62.l r10 = r10.mo96095LE()
            com.tencent.mm.storage.g4 r10 = (com.tencent.p014mm.storage.C72972g4) r10
            com.tencent.mm.storage.f4 r10 = r10.h30(r0, r2)
            com.tencent.mm.storage.f4 r13 = com.tencent.p014mm.storage.C72963f4.m85593l3(r10)
            eb0.c r15 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r15 = r15.mo105908w()
            com.tencent.mm.storage.i2 r15 = (com.tencent.p014mm.storage.C44660i2) r15
            com.tencent.mm.storage.h2 r15 = r15.mo69771j(r0)
            boolean r9 = r1.f94243b
            r16 = 0
            if (r9 == 0) goto L_0x0180
            te3.j3 r9 = r1.f94242a
            te3.rv3 r14 = r9.f227631h
            java.lang.String r14 = sf0.C48374j0.m53718g(r14)
            com.tencent.mm.storage.s3 r12 = new com.tencent.mm.storage.s3
            r12.<init>()
            r12.field_originSvrId = r2
            long r19 = r10.getMsgId()
            int r21 = (r19 > r16 ? 1 : (r19 == r16 ? 0 : -1))
            if (r21 != 0) goto L_0x00c3
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.Long r2 = java.lang.Long.valueOf(r24)
            r3 = 0
            r0[r3] = r2
            java.lang.String r2 = "summerbadcr get a revoke but msg id is 0 originSvrId[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r0)
            r12.field_content = r14
            int r0 = r9.f227635o
            long r2 = (long) r0
            r12.field_createTime = r2
            int r0 = eb0.C75604z3.m90845q(r26)
            r12.field_flag = r0
            te3.rv3 r0 = r9.f227628e
            java.lang.String r0 = sf0.C48374j0.m53718g(r0)
            r12.field_fromUserName = r0
            te3.rv3 r0 = r9.f227629f
            java.lang.String r0 = sf0.C48374j0.m53718g(r0)
            r12.field_toUserName = r0
            long r0 = r9.f227638r
            r12.field_newMsgId = r0
            di3.d r0 = di3.C86312j.m106911c(r6)
            pc0.b0 r0 = (pc0.C77064b0) r0
            g62.t r0 = r0.mo107372mC()
            boolean r0 = r0.insert(r12)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9 = 0
            r1[r9] = r0
            long r2 = r12.systemRowid
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1[r11] = r0
            java.lang.String r0 = "summerbadcr insert ret[%b], systemRowid[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r1)
            return
        L_0x00c3:
            r9 = 0
            java.lang.Object[] r14 = new java.lang.Object[r11]
            java.lang.Long r18 = java.lang.Long.valueOf(r24)
            r14[r9] = r18
            java.lang.String r11 = "summerbadcr get a revoke and has done delete info, originSvrId[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r11, r14)
            di3.d r6 = di3.C86312j.m106911c(r6)
            pc0.b0 r6 = (pc0.C77064b0) r6
            g62.t r6 = r6.mo107372mC()
            java.lang.String[] r11 = new java.lang.String[r9]
            r9 = 1
            r6.delete(r12, r9, r11)
            if (r15 == 0) goto L_0x0180
            te3.j3 r6 = r1.f94242a
            if (r6 == 0) goto L_0x0180
            long r11 = r15.mo108833z2()
            te3.j3 r6 = r1.f94242a
            int r6 = r6.f227639s
            r9 = r13
            long r13 = (long) r6
            int r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r6 != 0) goto L_0x0181
            r6 = 2
            java.lang.Object[] r11 = new java.lang.Object[r6]
            long r12 = r15.mo108833z2()
            java.lang.Long r6 = java.lang.Long.valueOf(r12)
            r12 = 0
            r11[r12] = r6
            long r12 = r15.mo108827t2()
            java.lang.Long r6 = java.lang.Long.valueOf(r12)
            r12 = 1
            r11[r12] = r6
            java.lang.String r6 = "summerbadcr get a revoke and fix fault lastseq[%s], firstUnDeliverSeq[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r11)
            eb0.c r6 = eb0.C97625j3.m125812b()
            g62.l r6 = r6.mo105911z()
            java.lang.String r11 = r15.getUsername()
            com.tencent.mm.storage.g4 r6 = (com.tencent.p014mm.storage.C72972g4) r6
            com.tencent.mm.storage.f4 r6 = r6.Mx0(r11)
            if (r6 == 0) goto L_0x0181
            long r11 = r6.mo108772w2()
            r15.mo108804Z2(r11)
            eb0.c r11 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r11 = r11.mo105908w()
            java.lang.String r12 = r15.getUsername()
            com.tencent.mm.storage.i2 r11 = (com.tencent.p014mm.storage.C44660i2) r11
            r13 = 1
            int r11 = r11.mo69775m0(r15, r12, r13, r13)
            r12 = 5
            java.lang.Object[] r12 = new java.lang.Object[r12]
            long r19 = r6.mo108774y2()
            java.lang.Long r14 = java.lang.Long.valueOf(r19)
            r18 = 0
            r12[r18] = r14
            long r19 = r6.mo108772w2()
            java.lang.Long r6 = java.lang.Long.valueOf(r19)
            r12[r13] = r6
            long r13 = r15.mo108833z2()
            java.lang.Long r6 = java.lang.Long.valueOf(r13)
            r13 = 2
            r12[r13] = r6
            long r13 = r15.mo108827t2()
            java.lang.Long r6 = java.lang.Long.valueOf(r13)
            r13 = 3
            r12[r13] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            r11 = 4
            r12[r11] = r6
            java.lang.String r6 = "summerbadcr get a revoke and fix fault by [%s, %s] lastseq[%s], firstUnDeliverSeq[%s], update[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r12)
            goto L_0x0181
        L_0x0180:
            r9 = r13
        L_0x0181:
            long r11 = r10.getMsgId()
            int r6 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r6 != 0) goto L_0x01b3
            java.lang.Class<com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation> r6 = com.tencent.p014mm.plugin.messenger.foundation.PluginMessengerFoundation.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation r6 = (com.tencent.p014mm.plugin.messenger.foundation.PluginMessengerFoundation) r6
            xh3.b r6 = r6.vx0()
            xh3.a r6 = r6.mo61736Lo(r2)
            if (r6 == 0) goto L_0x01b3
            long r11 = r6.field_msgSvrId
            int r13 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r13 == 0) goto L_0x01b3
            k40.a r8 = f40.C86709a0.m107533q(r8)
            f62.k0 r8 = (f62.C75700k0) r8
            g62.l r8 = r8.mo96095LE()
            long r10 = r6.field_msgSvrId
            com.tencent.mm.storage.g4 r8 = (com.tencent.p014mm.storage.C72972g4) r8
            com.tencent.mm.storage.f4 r10 = r8.h30(r0, r10)
        L_0x01b3:
            long r11 = r10.getMsgId()
            int r6 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r6 != 0) goto L_0x01fc
            java.lang.Class<ud2.h> r1 = ud2.C78150h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ud2.h r1 = (ud2.C78150h) r1
            te3.jb3 r1 = r1.yx0(r2)
            if (r1 == 0) goto L_0x01d3
            di3.d r1 = di3.C86312j.m106911c(r7)
            vd2.d r1 = (vd2.C78384d) r1
            r1.mo108122NC(r0, r2)
            return
        L_0x01d3:
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Long r1 = java.lang.Long.valueOf(r24)
            r4 = 0
            r0[r4] = r1
            java.lang.String r1 = "summerbadcr get a revoke newxml, but original msg has not been found, originSvrId[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r1, r0)
            eb0.c r0 = eb0.C97625j3.m125812b()
            g62.l r0 = r0.mo105911z()
            r1 = 0
            r4 = 0
            r6 = 0
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            com.tencent.mm.storage.m2 r0 = r0.f212776q
            r2 = r24
            r0.mo101176a(r1, r2, r4, r6)
            r5 = r22
            goto L_0x02f1
        L_0x01fc:
            int r5 = r10.getType()
            r6 = 922746929(0x37000031, float:7.629439E-6)
            if (r5 != r6) goto L_0x020f
            di3.d r1 = di3.C86312j.m106911c(r7)
            vd2.d r1 = (vd2.C78384d) r1
            r1.mo108122NC(r0, r2)
            return
        L_0x020f:
            int r0 = r10.f230723F
            r5 = 4
            r0 = r0 & r5
            if (r0 == r5) goto L_0x023c
            r10.mo108732L2(r4)
            r10.f230762x0 = r4
            r0 = 1
            r10.f230755r = r0
            java.lang.String r0 = ""
            r10.mo108746Z2(r0)
            r0 = 268445456(0x10002710, float:2.5273642E-29)
            r10.setType(r0)
            eb0.C75604z3.m90842n(r10, r1)
            eb0.c r0 = eb0.C97625j3.m125812b()
            g62.l r0 = r0.mo105911z()
            long r5 = r10.getMsgId()
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            r0.xy0(r5, r10)
        L_0x023c:
            com.tencent.mm.autogen.events.RevokeMsgEvent r0 = new com.tencent.mm.autogen.events.RevokeMsgEvent
            r0.<init>()
            com.tencent.mm.autogen.events.RevokeMsgEvent$a r1 = r0.f78943d
            long r5 = r10.getMsgId()
            r1.f78944a = r5
            com.tencent.mm.autogen.events.RevokeMsgEvent$a r1 = r0.f78943d
            r1.f78945b = r4
            r1.f78946c = r10
            r4 = r9
            r1.f78947d = r4
            r1.f78948e = r2
            r5 = r28
            r1.f78949f = r5
            r0.publish()
            if (r4 != 0) goto L_0x0260
            r5 = r22
            goto L_0x026e
        L_0x0260:
            com.tencent.mm.sdk.platformtools.MMHandlerThread r0 = f40.C86709a0.m107525e()
            eb0.h r1 = new eb0.h
            r5 = r22
            r1.<init>(r5, r4)
            r0.postToWorker(r1)
        L_0x026e:
            java.lang.Class<u72.c> r0 = u72.C78135c.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            u72.c r0 = (u72.C78135c) r0
            r0.fv0(r2)
            if (r15 == 0) goto L_0x02df
            int r0 = r15.mo108786G2()
            if (r0 <= 0) goto L_0x02df
            eb0.c r0 = eb0.C97625j3.m125812b()
            g62.l r0 = r0.mo105911z()
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            int r0 = r0.cy0(r10)
            int r1 = r15.mo108786G2()
            if (r1 < r0) goto L_0x02df
            int r0 = r15.mo108786G2()
            r1 = 1
            int r0 = r0 - r1
            r15.mo108812g3(r0)
            int r0 = r15.mo108818l2()
            if (r0 <= 0) goto L_0x02ce
            java.lang.String r0 = eb0.C75592q0.m90789s()
            boolean r0 = r10.mo100966E3(r0)
            if (r0 != 0) goto L_0x02c5
            boolean r0 = r10.mo100964D3()
            if (r0 == 0) goto L_0x02b5
            goto L_0x02c5
        L_0x02b5:
            boolean r0 = r10.mo100971J3()
            if (r0 == 0) goto L_0x02ce
            int r0 = r15.mo108818l2()
            int r0 = r0 + -4096
            r15.mo108789J2(r0)
            goto L_0x02ce
        L_0x02c5:
            int r0 = r15.mo108818l2()
            r1 = 1
            int r0 = r0 - r1
            r15.mo108789J2(r0)
        L_0x02ce:
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r0 = r0.mo105908w()
            java.lang.String r1 = r15.getUsername()
            com.tencent.mm.storage.i2 r0 = (com.tencent.p014mm.storage.C44660i2) r0
            r0.mo69773k0(r15, r1)
        L_0x02df:
            boolean r0 = p203mi.C34572d0.m40390a(r4)
            if (r0 == 0) goto L_0x02f1
            com.tencent.mm.autogen.events.NotifyGroupToolsResetEvent r0 = new com.tencent.mm.autogen.events.NotifyGroupToolsResetEvent
            r0.<init>()
            com.tencent.mm.autogen.events.NotifyGroupToolsResetEvent$a r1 = r0.f78880d
            r1.f78881a = r4
            r0.publish()
        L_0x02f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: eb0.C75579g.mo105916B(java.lang.String, long, ob0.m$a, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0648  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x07ae  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0202  */
    /* renamed from: X5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ob0.C35136m.C35139b mo10269X5(java.lang.String r36, java.util.Map<java.lang.String, java.lang.String> r37, ob0.C35136m.C35137a r38) {
        /*
            r35 = this;
            r9 = r35
            r1 = r36
            r2 = r37
            r5 = r38
            tc2.g r3 = tc2.C118418g.INSTANCE
            java.lang.Class<lc3.b> r4 = lc3.C10485b.class
            te3.j3 r6 = r5.f94242a
            te3.rv3 r0 = r6.f227631h
            java.lang.String r7 = sf0.C48374j0.m53718g(r0)
            r10 = 1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            r12 = 0
            java.lang.String r13 = "MicroMsg.BigBallSysCmdMsgConsumer"
            if (r1 == 0) goto L_0x0041
            java.util.LinkedHashMap<java.lang.String, eb0.g$d> r0 = r9.f222033e
            java.lang.Object r0 = r0.get(r1)
            eb0.g$d r0 = (eb0.C75579g.C31464d) r0
            if (r0 == 0) goto L_0x0041
            ob0.m$b r14 = r0.mo58199X5(r1, r2, r5)     // Catch:{ all -> 0x0035 }
            boolean r0 = r0.mo58188a()     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0042
            return r14
        L_0x0033:
            r0 = move-exception
            goto L_0x0037
        L_0x0035:
            r0 = move-exception
            r14 = 0
        L_0x0037:
            java.lang.Object[] r15 = new java.lang.Object[r10]
            r15[r12] = r1
            java.lang.String r11 = "consumeNewXml dispatch handle subType [%s] error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r0, r11, r15)
            goto L_0x0042
        L_0x0041:
            r14 = 0
        L_0x0042:
            if (r1 == 0) goto L_0x0069
            java.lang.String r0 = "addcontact"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            java.lang.String r0 = ".sysmsg.addcontact.content"
            java.lang.Object r0 = r2.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            te3.rv3 r0 = sf0.C48374j0.m53720i(r0)
            r6.f227631h = r0
            r6.f227630g = r10
            ob0.m r0 = ob0.C35136m.C35140d.m40570a(r8)
            if (r0 != 0) goto L_0x0064
            r14 = 0
            goto L_0x0069
        L_0x0064:
            ob0.m$b r0 = r0.mo56403Fg(r5)
            r14 = r0
        L_0x0069:
            java.lang.String r11 = ""
            r15 = 2
            if (r1 == 0) goto L_0x00c6
            java.lang.String r0 = "dynacfg"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00c6
            k40.a r0 = f40.C86709a0.m107533q(r4)
            lc3.b r0 = (lc3.C10485b) r0
            pj.f r0 = r0.vh0()
            r0.mo107409g(r7, r2, r12)
            k40.a r0 = f40.C86709a0.m107533q(r4)
            lc3.b r0 = (lc3.C10485b) r0
            pj.d r0 = r0.g50()
            int r0 = r0.mo72515h()
            if (r0 != r15) goto L_0x009a
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r15 = 10879(0x2a7f, float:1.5245E-41)
            r0.kvStat(r15, r11)
        L_0x009a:
            k40.a r0 = f40.C86709a0.m107533q(r4)
            lc3.b r0 = (lc3.C10485b) r0
            pj.f r0 = r0.vh0()
            java.lang.String r15 = "MuteRoomDisable"
            java.lang.String r0 = r0.mo107405c(r15)
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r12)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r12 = "Mute_Room_Disable:"
            r15.append(r12)
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r15.append(r0)
            java.lang.String r0 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r13, r0)
        L_0x00c6:
            if (r1 == 0) goto L_0x00dd
            java.lang.String r0 = "dynacfg_split"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00dd
            k40.a r0 = f40.C86709a0.m107533q(r4)
            lc3.b r0 = (lc3.C10485b) r0
            pj.f r0 = r0.vh0()
            r0.mo107409g(r7, r2, r10)
        L_0x00dd:
            if (r1 == 0) goto L_0x0202
            java.lang.String r0 = "banner"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0202
            java.lang.String r0 = ".sysmsg.mainframebanner.$type"
            java.lang.Object r0 = r2.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r15 = ".sysmsg.mainframebanner.showtype"
            java.lang.Object r15 = r2.get(r15)
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r12 = ".sysmsg.mainframebanner.data"
            java.lang.Object r12 = r2.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            if (r0 == 0) goto L_0x0134
            int r18 = r0.length()
            if (r18 <= 0) goto L_0x0134
            eb0.w3 r10 = eb0.C75598w3.m90816e()     // Catch:{ Exception -> 0x0127 }
            r19 = r14
            eb0.v3 r14 = new eb0.v3     // Catch:{ Exception -> 0x0123 }
            r20 = r3
            r3 = 0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r3)     // Catch:{ Exception -> 0x0121 }
            int r15 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r15, (int) r3)     // Catch:{ Exception -> 0x0121 }
            r14.<init>(r0, r15, r12)     // Catch:{ Exception -> 0x0121 }
            r10.mo105954g(r14)     // Catch:{ Exception -> 0x0121 }
            goto L_0x0138
        L_0x0121:
            r0 = move-exception
            goto L_0x012c
        L_0x0123:
            r0 = move-exception
            r20 = r3
            goto L_0x012c
        L_0x0127:
            r0 = move-exception
            r20 = r3
            r19 = r14
        L_0x012c:
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            goto L_0x0138
        L_0x0134:
            r20 = r3
            r19 = r14
        L_0x0138:
            java.lang.String r0 = ".sysmsg.friendrecommand.fromuser"
            java.lang.Object r0 = r2.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r3 = ".sysmsg.friendrecommand.touser"
            java.lang.Object r3 = r2.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r0 == 0) goto L_0x0162
            if (r3 == 0) goto L_0x0162
            eb0.c r0 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x015a }
            gb0.c r0 = r0.mo105904s()     // Catch:{ Exception -> 0x015a }
            r10 = 0
            r12 = 1
            r0.mo106161g(r3, r12, r10)     // Catch:{ Exception -> 0x015a }
            goto L_0x0162
        L_0x015a:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
        L_0x0162:
            java.lang.String r0 = ".sysmsg.banner.securitybanner.chatname"
            java.lang.Object r0 = r2.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r3 = ".sysmsg.banner.securitybanner.wording"
            java.lang.Object r3 = r2.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r10 = ".sysmsg.banner.securitybanner.linkname"
            java.lang.Object r10 = r2.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r12 = ".sysmsg.banner.securitybanner.linksrc"
            java.lang.Object r12 = r2.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r14 = ".sysmsg.banner.securitybanner.showtype"
            java.lang.Object r14 = r2.get(r14)
            java.lang.String r14 = (java.lang.String) r14
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r15 != 0) goto L_0x01f0
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r15 != 0) goto L_0x01f0
            java.lang.String r15 = "1"
            boolean r15 = r14.equals(r15)     // Catch:{ Exception -> 0x01d3 }
            if (r15 != 0) goto L_0x01a9
            java.lang.String r15 = "2"
            boolean r15 = r14.equals(r15)     // Catch:{ Exception -> 0x01d3 }
            if (r15 == 0) goto L_0x01a7
            goto L_0x01a9
        L_0x01a7:
            r15 = 0
            goto L_0x01aa
        L_0x01a9:
            r15 = 1
        L_0x01aa:
            eb0.c r21 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x01d3 }
            r22 = r4
            gb0.d r4 = r21.mo105905t()     // Catch:{ Exception -> 0x01cd }
            r21 = r8
            r23 = r11
            r8 = 4
            java.lang.String[] r11 = new java.lang.String[r8]     // Catch:{ Exception -> 0x01cb }
            r8 = 0
            r11[r8] = r3     // Catch:{ Exception -> 0x01cb }
            r3 = 1
            r11[r3] = r10     // Catch:{ Exception -> 0x01cb }
            r3 = 2
            r11[r3] = r12     // Catch:{ Exception -> 0x01cb }
            r3 = 3
            r11[r3] = r14     // Catch:{ Exception -> 0x01cb }
            r4.mo106161g(r0, r15, r11)     // Catch:{ Exception -> 0x01cb }
            goto L_0x01f6
        L_0x01cb:
            r0 = move-exception
            goto L_0x01d7
        L_0x01cd:
            r0 = move-exception
        L_0x01ce:
            r21 = r8
            r23 = r11
            goto L_0x01d7
        L_0x01d3:
            r0 = move-exception
            r22 = r4
            goto L_0x01ce
        L_0x01d7:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "[oneliang]"
            r3.append(r4)
            java.lang.String r0 = r0.toString()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            goto L_0x01f6
        L_0x01f0:
            r22 = r4
            r21 = r8
            r23 = r11
        L_0x01f6:
            eb0.c r0 = eb0.C97625j3.m125812b()
            gb0.b r0 = r0.mo105903r()
            r0.mo106166e(r2)
            goto L_0x020c
        L_0x0202:
            r20 = r3
            r22 = r4
            r21 = r8
            r23 = r11
            r19 = r14
        L_0x020c:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r36)
            if (r0 != 0) goto L_0x021f
            java.lang.String r0 = "midinfo"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x021f
            java.lang.String r0 = "midinfo has been deprecated, bye bye!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
        L_0x021f:
            r3 = 0
            if (r1 == 0) goto L_0x028e
            java.lang.String r0 = "revokemsg"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x028e
            java.lang.String r0 = "mm hit MM_DATA_SYSCMD_NEWXML_SUBTYPE_REVOKE"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            java.lang.String r0 = ".sysmsg.revokemsg.session"
            java.lang.Object r0 = r2.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = ".sysmsg.revokemsg.newmsgid"
            java.lang.Object r1 = r2.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r6 = ".sysmsg.revokemsg.replacemsg"
            java.lang.Object r6 = r2.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = ".sysmsg.revokemsg.announcement_id"
            java.lang.Object r2 = r2.get(r7)
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r8 = 0
            r2[r8] = r1
            r8 = 1
            r2[r8] = r6
            r8 = 2
            r2[r8] = r7
            java.lang.String r8 = "ashutest::[oneliang][xml parse] ,msgId:%s, replaceMsg:%s, announcementId"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r8, r2)
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r1, r3)     // Catch:{ Exception -> 0x0275 }
            java.lang.String r8 = "MicroMsg.BigBallSysCmdMsgConsumer"
            r1 = r35
            r2 = r0
            r3 = r10
            r5 = r38
            r1.mo105916B(r2, r3, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0272 }
            goto L_0x028c
        L_0x0272:
            r0 = move-exception
            r3 = r10
            goto L_0x0276
        L_0x0275:
            r0 = move-exception
        L_0x0276:
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Long r2 = java.lang.Long.valueOf(r3)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = r0.toString()
            r3 = 1
            r1[r3] = r2
            java.lang.String r2 = "[oneliang][revokeMsg] msgId:%d,error:%s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r0, r2, r1)
        L_0x028c:
            r1 = 0
            return r1
        L_0x028e:
            r8 = 6
            r10 = -1
            if (r1 == 0) goto L_0x0433
            java.lang.String r0 = "clouddelmsg"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0433
            java.lang.String r0 = "mm hit MM_DATA_SYSCMD_NEWXML_CLOUD_DEL_MSG"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            java.lang.String r0 = ".sysmsg.clouddelmsg.delcommand"
            java.lang.Object r0 = r2.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = ".sysmsg.clouddelmsg.msgid"
            java.lang.Object r1 = r2.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r6 = ".sysmsg.clouddelmsg.fromuser"
            java.lang.Object r2 = r2.get(r6)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r6 = "<msg>"
            int r6 = r7.indexOf(r6)
            java.lang.String r11 = "</msg>"
            int r11 = r7.indexOf(r11)
            if (r6 == r10) goto L_0x02d9
            if (r11 != r10) goto L_0x02c8
            goto L_0x02d9
        L_0x02c8:
            int r11 = r11 + r8
            java.lang.String r6 = r7.substring(r6, r11)
            java.lang.String r7 = "msg"
            r8 = 0
            java.util.Map r6 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r6, r7, r8)
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.SemiXml.encode(r6)
            goto L_0x02db
        L_0x02d9:
            r11 = r23
        L_0x02db:
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r7 = 0
            r6[r7] = r0
            r7 = 1
            r6[r7] = r1
            r7 = 2
            r6[r7] = r2
            r7 = 3
            r6[r7] = r11
            java.lang.String r7 = "[hakon][clouddelmsg], delcommand:%s, msgid:%s, fromuser:%s, sysmsgcontent:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r7, r6)
            eb0.c r6 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x041e }
            g62.l r6 = r6.mo105911z()     // Catch:{ Exception -> 0x041e }
            com.tencent.mm.storage.g4 r6 = (com.tencent.p014mm.storage.C72972g4) r6     // Catch:{ Exception -> 0x041e }
            java.util.LinkedList r2 = r6.mo101091TY(r2, r1)     // Catch:{ Exception -> 0x041e }
            if (r2 == 0) goto L_0x0417
            int r6 = r2.size()     // Catch:{ Exception -> 0x041e }
            if (r6 > 0) goto L_0x0307
            goto L_0x0417
        L_0x0307:
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x041e }
        L_0x030b:
            boolean r6 = r2.hasNext()     // Catch:{ Exception -> 0x041e }
            if (r6 == 0) goto L_0x0431
            java.lang.Object r6 = r2.next()     // Catch:{ Exception -> 0x041e }
            com.tencent.mm.storage.f4 r6 = (com.tencent.p014mm.storage.C72963f4) r6     // Catch:{ Exception -> 0x041e }
            if (r6 != 0) goto L_0x031f
            java.lang.String r6 = "[hakon][clouddelmsg], msgInfo == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r6)     // Catch:{ Exception -> 0x041e }
            goto L_0x030b
        L_0x031f:
            long r7 = r6.mo108774y2()     // Catch:{ Exception -> 0x041e }
            int r10 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r10 >= 0) goto L_0x0346
            java.lang.String r7 = "[hakon][clouddelmsg], invalid msgInfo.msgId = %s, srvId = %s"
            r8 = 2
            java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x041e }
            long r14 = r6.getMsgId()     // Catch:{ Exception -> 0x041e }
            java.lang.Long r8 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x041e }
            r12 = 0
            r10[r12] = r8     // Catch:{ Exception -> 0x041e }
            long r14 = r6.mo108774y2()     // Catch:{ Exception -> 0x041e }
            java.lang.Long r6 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x041e }
            r8 = 1
            r10[r8] = r6     // Catch:{ Exception -> 0x041e }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r7, r10)     // Catch:{ Exception -> 0x041e }
            goto L_0x030b
        L_0x0346:
            java.lang.String r7 = "[hakon][clouddelmsg], msgInfo.msgId = %s, srvId = %s"
            r8 = 2
            java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x041e }
            long r14 = r6.getMsgId()     // Catch:{ Exception -> 0x041e }
            java.lang.Long r8 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x041e }
            r12 = 0
            r10[r12] = r8     // Catch:{ Exception -> 0x041e }
            long r14 = r6.mo108774y2()     // Catch:{ Exception -> 0x041e }
            java.lang.Long r8 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x041e }
            r12 = 1
            r10[r12] = r8     // Catch:{ Exception -> 0x041e }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r7, r10)     // Catch:{ Exception -> 0x041e }
            com.tencent.mm.storage.f4 r7 = com.tencent.p014mm.storage.C72963f4.m85593l3(r6)     // Catch:{ Exception -> 0x041e }
            r8 = 0
            int r10 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r8)     // Catch:{ Exception -> 0x041e }
            if (r10 != r12) goto L_0x0385
            eb0.c r8 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x041e }
            g62.l r8 = r8.mo105911z()     // Catch:{ Exception -> 0x041e }
            java.lang.String r10 = r6.mo108768t()     // Catch:{ Exception -> 0x041e }
            long r14 = r6.mo108774y2()     // Catch:{ Exception -> 0x041e }
            com.tencent.mm.storage.g4 r8 = (com.tencent.p014mm.storage.C72972g4) r8     // Catch:{ Exception -> 0x041e }
            r8.mo101087SE(r10, r14)     // Catch:{ Exception -> 0x041e }
            goto L_0x03ed
        L_0x0385:
            r8 = 2
            if (r10 != r8) goto L_0x03ed
            boolean r8 = r6.mo100967F3()     // Catch:{ Exception -> 0x041e }
            if (r8 == 0) goto L_0x03ed
            r6.mo108732L2(r11)     // Catch:{ Exception -> 0x041e }
            eb0.C75604z3.m90842n(r6, r5)     // Catch:{ Exception -> 0x041e }
            eb0.c r8 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x041e }
            g62.l r8 = r8.mo105911z()     // Catch:{ Exception -> 0x041e }
            long r14 = r6.mo108774y2()     // Catch:{ Exception -> 0x041e }
            com.tencent.mm.storage.g4 r8 = (com.tencent.p014mm.storage.C72972g4) r8     // Catch:{ Exception -> 0x041e }
            r8.yy0(r14, r6)     // Catch:{ Exception -> 0x041e }
            eb0.c r8 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x041e }
            com.tencent.mm.storage.v3 r8 = r8.mo105908w()     // Catch:{ Exception -> 0x041e }
            java.lang.String r10 = r6.mo108768t()     // Catch:{ Exception -> 0x041e }
            com.tencent.mm.storage.i2 r8 = (com.tencent.p014mm.storage.C44660i2) r8     // Catch:{ Exception -> 0x041e }
            com.tencent.mm.storage.h2 r8 = r8.mo69771j(r10)     // Catch:{ Exception -> 0x041e }
            if (r8 == 0) goto L_0x03ed
            int r10 = r8.mo108786G2()     // Catch:{ Exception -> 0x041e }
            if (r10 <= 0) goto L_0x03ed
            eb0.c r10 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x041e }
            g62.l r10 = r10.mo105911z()     // Catch:{ Exception -> 0x041e }
            com.tencent.mm.storage.g4 r10 = (com.tencent.p014mm.storage.C72972g4) r10     // Catch:{ Exception -> 0x041e }
            int r10 = r10.cy0(r6)     // Catch:{ Exception -> 0x041e }
            int r12 = r8.mo108786G2()     // Catch:{ Exception -> 0x041e }
            if (r12 < r10) goto L_0x03ed
            int r10 = r8.mo108786G2()     // Catch:{ Exception -> 0x041e }
            r12 = 1
            int r10 = r10 - r12
            r8.mo108812g3(r10)     // Catch:{ Exception -> 0x041e }
            eb0.c r10 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x041e }
            com.tencent.mm.storage.v3 r10 = r10.mo105908w()     // Catch:{ Exception -> 0x041e }
            java.lang.String r12 = r8.getUsername()     // Catch:{ Exception -> 0x041e }
            com.tencent.mm.storage.i2 r10 = (com.tencent.p014mm.storage.C44660i2) r10     // Catch:{ Exception -> 0x041e }
            r10.mo69773k0(r8, r12)     // Catch:{ Exception -> 0x041e }
        L_0x03ed:
            com.tencent.mm.autogen.events.RevokeMsgEvent r8 = new com.tencent.mm.autogen.events.RevokeMsgEvent     // Catch:{ Exception -> 0x041e }
            r8.<init>()     // Catch:{ Exception -> 0x041e }
            com.tencent.mm.autogen.events.RevokeMsgEvent$a r10 = r8.f78943d     // Catch:{ Exception -> 0x041e }
            long r14 = r6.getMsgId()     // Catch:{ Exception -> 0x041e }
            r10.f78944a = r14     // Catch:{ Exception -> 0x041e }
            com.tencent.mm.autogen.events.RevokeMsgEvent$a r10 = r8.f78943d     // Catch:{ Exception -> 0x041e }
            r10.f78945b = r11     // Catch:{ Exception -> 0x041e }
            r10.f78946c = r6     // Catch:{ Exception -> 0x041e }
            r8.publish()     // Catch:{ Exception -> 0x041e }
            boolean r6 = p203mi.C34572d0.m40390a(r7)     // Catch:{ Exception -> 0x041e }
            if (r6 == 0) goto L_0x030b
            com.tencent.mm.autogen.events.NotifyGroupToolsResetEvent r6 = new com.tencent.mm.autogen.events.NotifyGroupToolsResetEvent     // Catch:{ Exception -> 0x041e }
            r6.<init>()     // Catch:{ Exception -> 0x041e }
            com.tencent.mm.autogen.events.NotifyGroupToolsResetEvent$a r8 = r6.f78880d     // Catch:{ Exception -> 0x041e }
            r8.f78881a = r7     // Catch:{ Exception -> 0x041e }
            r6.publish()     // Catch:{ Exception -> 0x041e }
            goto L_0x030b
        L_0x0417:
            java.lang.String r0 = "get null by getByBizClientMsgId"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)     // Catch:{ Exception -> 0x041e }
            r1 = 0
            return r1
        L_0x041e:
            r0 = move-exception
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            java.lang.String r1 = r0.toString()
            r3 = 1
            r2[r3] = r1
            java.lang.String r1 = "[hakon][clouddelmsg], BizClientMsgId:%s,error:%s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r0, r1, r2)
        L_0x0431:
            r1 = 0
            return r1
        L_0x0433:
            if (r1 == 0) goto L_0x0452
            java.lang.String r0 = "updatepackage"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0452
            r0 = -1879048175(0xffffffff90000011, float:-2.52436E-29)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            ob0.m r0 = ob0.C35136m.C35140d.m40570a(r0)
            if (r0 != 0) goto L_0x044d
            r0 = 0
            goto L_0x0454
        L_0x044d:
            ob0.m$b r0 = r0.mo56403Fg(r5)
            goto L_0x0454
        L_0x0452:
            r0 = r19
        L_0x0454:
            if (r1 == 0) goto L_0x0471
            java.lang.String r11 = "deletepackage"
            boolean r11 = r1.equals(r11)
            if (r11 == 0) goto L_0x0471
            r0 = -1879048174(0xffffffff90000012, float:-2.5243603E-29)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            ob0.m r0 = ob0.C35136m.C35140d.m40570a(r0)
            if (r0 != 0) goto L_0x046d
            r0 = 0
            goto L_0x0471
        L_0x046d:
            ob0.m$b r0 = r0.mo56403Fg(r5)
        L_0x0471:
            if (r1 == 0) goto L_0x04df
            java.lang.String r11 = "delchatroommember"
            boolean r11 = r1.equals(r11)
            if (r11 == 0) goto L_0x04df
            te3.rv3 r11 = r6.f227628e
            java.lang.String r11 = sf0.C48374j0.m53718g(r11)
            eb0.c r12 = eb0.C97625j3.m125812b()
            g62.l r12 = r12.mo105911z()
            long r14 = r6.f227638r
            com.tencent.mm.storage.g4 r12 = (com.tencent.p014mm.storage.C72972g4) r12
            com.tencent.mm.storage.f4 r12 = r12.h30(r11, r14)
            long r14 = r12.getMsgId()
            int r19 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r19 <= 0) goto L_0x049b
            r14 = 1
            goto L_0x049c
        L_0x049b:
            r14 = 0
        L_0x049c:
            long r3 = r6.f227638r
            r12.mo108745Y2(r3)
            boolean r3 = r5.f94243b
            if (r3 == 0) goto L_0x04a9
            boolean r3 = r5.f94245d
            if (r3 != 0) goto L_0x04b3
        L_0x04a9:
            int r3 = r6.f227635o
            long r3 = (long) r3
            long r3 = eb0.C75604z3.m90841m(r11, r3)
            r12.mo108733M2(r3)
        L_0x04b3:
            r3 = 10002(0x2712, float:1.4016E-41)
            r12.setType(r3)
            r12.mo108732L2(r7)
            r3 = 0
            r12.mo108740T2(r3)
            r12.mo108749c3(r11)
            java.lang.String r3 = r6.f227636p
            r12.mo101012p4(r3)
            eb0.C75604z3.m90842n(r12, r5)
            if (r14 != 0) goto L_0x04d0
            eb0.C75604z3.m90852x(r12)
            goto L_0x04df
        L_0x04d0:
            eb0.c r3 = eb0.C97625j3.m125812b()
            g62.l r3 = r3.mo105911z()
            long r14 = r6.f227638r
            com.tencent.mm.storage.g4 r3 = (com.tencent.p014mm.storage.C72972g4) r3
            r3.yy0(r14, r12)
        L_0x04df:
            if (r1 == 0) goto L_0x050e
            java.lang.String r3 = "WakenPush"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x050e
            long r3 = r9.f222032d
            long r11 = r6.f227638r
            int r14 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r14 == 0) goto L_0x050e
            r9.f222032d = r11
            java.lang.String r0 = "dzmonster[subType wakenpush]"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            eb0.g6 r0 = new eb0.g6
            r0.<init>(r2)
            r0.mo105918a()
            com.tencent.mm.plugin.report.service.n r26 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r27 = 405(0x195, double:2.0E-321)
            r29 = 31
            r31 = 1
            r33 = 1
            r26.idkeyStat(r27, r29, r31, r33)
            r0 = 0
        L_0x050e:
            java.lang.String r3 = ","
            java.lang.String r4 = ";"
            if (r1 == 0) goto L_0x0635
            java.lang.String r11 = "DisasterNotice"
            boolean r11 = r1.equals(r11)
            if (r11 == 0) goto L_0x0635
            java.lang.String r0 = ".sysmsg.NoticeId"
            java.lang.Object r0 = r2.get(r0)
            r11 = r0
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r0 = ".sysmsg.Content"
            java.lang.Object r0 = r2.get(r0)
            r12 = r0
            java.lang.String r12 = (java.lang.String) r12
            r14 = 2
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r14 = 0
            r0[r14] = r11
            r14 = 1
            r0[r14] = r12
            java.lang.String r14 = "disaster noticeID:%s, content:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r14, r0)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r14 = "disaster_pref"
            r15 = 4
            android.content.SharedPreferences r14 = r0.getSharedPreferences(r14, r15)
            java.lang.String r15 = "disaster_noticeid_list_key"
            r8 = r23
            java.lang.String r10 = r14.getString(r15, r8)
            boolean r0 = r10.contains(r11)
            if (r0 != 0) goto L_0x0604
            r26 = r7
            java.lang.String[] r7 = r10.split(r4)
            if (r7 == 0) goto L_0x05c8
            int r0 = r7.length
            r27 = r8
            r8 = 10
            if (r0 <= r8) goto L_0x05c5
            int r8 = r7.length
            r1 = r27
            r2 = 0
        L_0x0568:
            if (r2 >= r8) goto L_0x05c2
            r0 = r7[r2]
            java.lang.String[] r0 = r0.split(r3)
            r28 = r7
            r17 = 0
            r7 = r0[r17]     // Catch:{ Exception -> 0x05ab }
            r29 = r6
            r5 = 0
            long r24 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r7, r5)     // Catch:{ Exception -> 0x05a9 }
            long r24 = com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r24)     // Catch:{ Exception -> 0x05a9 }
            r30 = 1296000(0x13c680, double:6.40309E-318)
            int r7 = (r24 > r30 ? 1 : (r24 == r30 ? 0 : -1))
            if (r7 >= 0) goto L_0x05b9
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x05a9 }
            r7.<init>()     // Catch:{ Exception -> 0x05a9 }
            r7.append(r1)     // Catch:{ Exception -> 0x05a9 }
            r17 = 0
            r5 = r0[r17]     // Catch:{ Exception -> 0x05a9 }
            r7.append(r5)     // Catch:{ Exception -> 0x05a9 }
            r7.append(r3)     // Catch:{ Exception -> 0x05a9 }
            r5 = 1
            r0 = r0[r5]     // Catch:{ Exception -> 0x05a9 }
            r7.append(r0)     // Catch:{ Exception -> 0x05a9 }
            r7.append(r4)     // Catch:{ Exception -> 0x05a9 }
            java.lang.String r1 = r7.toString()     // Catch:{ Exception -> 0x05a9 }
            goto L_0x05b9
        L_0x05a9:
            r0 = move-exception
            goto L_0x05ae
        L_0x05ab:
            r0 = move-exception
            r29 = r6
        L_0x05ae:
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r5 = 0
            r6[r5] = r0
            java.lang.String r0 = "MM_DATA_SYSCMD_NEWXML_DISASTER_NOTICE parseLong error:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r0, r6)
        L_0x05b9:
            int r2 = r2 + 1
            r5 = r38
            r7 = r28
            r6 = r29
            goto L_0x0568
        L_0x05c2:
            r29 = r6
            goto L_0x05cd
        L_0x05c5:
            r29 = r6
            goto L_0x05cc
        L_0x05c8:
            r29 = r6
            r27 = r8
        L_0x05cc:
            r1 = r10
        L_0x05cd:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            r0.append(r1)
            r0.append(r3)
            r0.append(r11)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r1 = 0
            r2[r1] = r10
            r1 = 1
            r2[r1] = r0
            java.lang.String r1 = "update noticeIdList %s -> %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r1, r2)
            android.content.SharedPreferences$Editor r1 = r14.edit()
            android.content.SharedPreferences$Editor r0 = r1.putString(r15, r0)
            r0.commit()
            goto L_0x060a
        L_0x0604:
            r29 = r6
            r26 = r7
            r27 = r8
        L_0x060a:
            com.tencent.mm.sdk.platformtools.MMHandler r0 = new com.tencent.mm.sdk.platformtools.MMHandler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>((android.os.Looper) r1)
            eb0.g$a r1 = new eb0.g$a
            r1.<init>(r9, r11)
            r0.post(r1)
            te3.rv3 r0 = sf0.C48374j0.m53720i(r12)
            r1 = r29
            r1.f227631h = r0
            r2 = 1
            r1.f227630g = r2
            ob0.m r0 = ob0.C35136m.C35140d.m40570a(r21)
            if (r0 != 0) goto L_0x062e
            r10 = 0
            goto L_0x063b
        L_0x062e:
            r2 = r38
            ob0.m$b r0 = r0.mo56403Fg(r2)
            goto L_0x063a
        L_0x0635:
            r1 = r6
            r26 = r7
            r27 = r23
        L_0x063a:
            r10 = r0
        L_0x063b:
            r2 = 5
            r5 = r36
            if (r5 == 0) goto L_0x07ae
            java.lang.String r0 = "EmotionKv"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x07ae
            java.lang.String r0 = ".sysmsg.EmotionKv.K"
            r6 = r37
            java.lang.Object r0 = r6.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = ".sysmsg.EmotionKv.I"
            java.lang.Object r1 = r6.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r0 != 0) goto L_0x065f
            r29 = r27
            goto L_0x0661
        L_0x065f:
            r29 = r0
        L_0x0661:
            r3 = 3
            java.lang.Object[] r0 = new java.lang.Object[r3]
            int r3 = r29.length()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r0[r4] = r3
            r3 = 1
            r0[r3] = r29
            r3 = 2
            r0[r3] = r1
            java.lang.String r3 = "summercck emotionkv pcKeyStr len:%d, content[%s] pcId[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r3, r0)
            qe3.b1 r0 = qe3.C101125b1.m132538d()
            java.lang.String r0 = r0.mo140570b()
            byte[] r3 = r0.getBytes()
            qe3.b1 r0 = qe3.C101125b1.m132538d()
            java.lang.String r0 = r0.mo140571c()
            byte[] r4 = r0.getBytes()
            ob0.b0 r0 = eb0.C97625j3.m125815e()     // Catch:{ Exception -> 0x06a4 }
            com.tencent.mm.network.g r0 = r0.mo123464j()     // Catch:{ Exception -> 0x06a4 }
            com.tencent.mm.network.e r0 = r0.mo55443A3()     // Catch:{ Exception -> 0x06a4 }
            byte[] r0 = r0.mo55415D()     // Catch:{ Exception -> 0x06a4 }
            goto L_0x06b5
        L_0x06a4:
            r0 = move-exception
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r5 = 0
            r6[r5] = r0
            java.lang.String r0 = "DISASTER_NOTICE :%s "
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r0, r6)
            r0 = 0
        L_0x06b5:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r0)
            if (r5 == 0) goto L_0x06c2
            java.lang.String r0 = "DISASTER_NOTICE  ecdh  is null ."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            r5 = 0
            return r5
        L_0x06c2:
            r5 = 0
            byte[] r6 = qe3.C101127f.m132549b()
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r6)
            if (r7 == 0) goto L_0x06d3
            java.lang.String r0 = "DISASTER_NOTICE  newECDH  is null ."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            return r5
        L_0x06d3:
            com.tencent.mm.pointers.PByteArray r5 = new com.tencent.mm.pointers.PByteArray
            r5.<init>()
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r29)
            if (r7 != 0) goto L_0x070d
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r4)
            if (r7 != 0) goto L_0x070d
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r3)
            if (r7 != 0) goto L_0x070d
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r0)
            if (r7 != 0) goto L_0x070d
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r6)
            if (r7 == 0) goto L_0x06f7
            goto L_0x070d
        L_0x06f7:
            eb0.c r2 = eb0.C97625j3.m125812b()
            int r28 = r2.mo105881G()
            r30 = r3
            r31 = r4
            r32 = r0
            r33 = r6
            r34 = r5
            com.tencent.p014mm.protocal.MMProtocalJni.genClientCheckKVRes(r28, r29, r30, r31, r32, r33, r34)
            goto L_0x0750
        L_0x070d:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r7 = r29.length()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 0
            r2[r8] = r7
            if (r4 != 0) goto L_0x071e
            r4 = -1
            goto L_0x071f
        L_0x071e:
            int r4 = r4.length
        L_0x071f:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7 = 1
            r2[r7] = r4
            if (r3 != 0) goto L_0x072a
            r3 = -1
            goto L_0x072b
        L_0x072a:
            int r3 = r3.length
        L_0x072b:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 2
            r2[r4] = r3
            if (r0 != 0) goto L_0x0736
            r0 = -1
            goto L_0x0737
        L_0x0736:
            int r0 = r0.length
        L_0x0737:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 3
            r2[r3] = r0
            if (r6 != 0) goto L_0x0742
            r0 = -1
            goto L_0x0743
        L_0x0742:
            int r0 = r6.length
        L_0x0743:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 4
            r2[r3] = r0
            java.lang.String r0 = "summercck emotionkv param len err pcKeylen:%d, keynlen:%d, keyelen:%d, ecdhlen:%d newECDH:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r13, r0, r2)
        L_0x0750:
            byte[] r0 = r5.value
            te3.wl2 r2 = new te3.wl2
            r2.<init>()
            byte[] r3 = r5.value
            if (r3 == 0) goto L_0x0763
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3)
            r2.f144123d = r4
            goto L_0x0767
        L_0x0763:
            r7 = r27
            r2.f144123d = r7
        L_0x0767:
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            if (r0 != 0) goto L_0x076e
            r10 = -1
            goto L_0x076f
        L_0x076e:
            int r10 = r0.length
        L_0x076f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r4 = 0
            r3[r4] = r0
            java.lang.String r0 = r2.f144123d
            int r0 = r0.length()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4 = 1
            r3[r4] = r0
            java.lang.String r0 = r2.f144123d
            byte[] r0 = r0.getBytes()
            java.lang.String r0 = p823sg.C90193h.m112878f(r0)
            r4 = 2
            r3[r4] = r0
            java.lang.String r0 = "summercck emotionkv res len:%d val len:%d, content[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r0, r3)
            r2.f144124e = r1
            eb0.c r0 = eb0.C97625j3.m125812b()
            g62.m r0 = r0.mo105876B()
            g62.n r1 = new g62.n
            r3 = 59
            r1.<init>(r3, r2)
            tc0.p r0 = (tc0.C77885p) r0
            r0.mo107993q(r1)
            goto L_0x0a0a
        L_0x07ae:
            r6 = r37
            r7 = r27
            if (r5 == 0) goto L_0x096a
            java.lang.String r8 = "globalalert"
            boolean r8 = r5.equals(r8)
            if (r8 == 0) goto L_0x096a
            java.lang.String r1 = ".sysmsg.uuid"
            java.lang.Object r1 = r6.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = ".sysmsg.id"
            java.lang.Object r3 = r6.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r4 = -1
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r4)
            java.lang.String r5 = ".sysmsg.important"
            java.lang.Object r5 = r6.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r4)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r4 != 0) goto L_0x0949
            if (r3 < 0) goto L_0x0949
            if (r5 >= 0) goto L_0x07e9
            goto L_0x0949
        L_0x07e9:
            java.lang.String r4 = ".sysmsg.title"
            java.lang.Object r4 = r6.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r7 = ".sysmsg.msg"
            java.lang.Object r7 = r6.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r8 == 0) goto L_0x0816
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r8 == 0) goto L_0x0816
            r8 = 2
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r1 = 0
            r0[r1] = r4
            r1 = 1
            r0[r1] = r7
            java.lang.String r1 = "summeralert title[%s], msg[%s] is illegal ret"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r1, r0)
            goto L_0x0a0a
        L_0x0816:
            java.lang.String r8 = ".sysmsg.btnlist.btn.$title"
            java.lang.Object r8 = r6.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r10 = ".sysmsg.btnlist.btn.$id"
            java.lang.Object r10 = r6.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            r11 = -1
            int r10 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r10, (int) r11)
            java.lang.String r12 = ".sysmsg.btnlist.btn.$actiontype"
            java.lang.Object r12 = r6.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            int r12 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r12, (int) r11)
            java.lang.String r11 = ".sysmsg.btnlist.btn"
            java.lang.Object r11 = r6.get(r11)
            java.lang.String r11 = (java.lang.String) r11
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r14 != 0) goto L_0x092c
            if (r10 < 0) goto L_0x092c
            if (r12 >= 0) goto L_0x084b
            goto L_0x092c
        L_0x084b:
            java.lang.String r14 = ".sysmsg.btnlist.btn1.$title"
            java.lang.Object r14 = r6.get(r14)
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r15 = ".sysmsg.btnlist.btn1.$id"
            java.lang.Object r15 = r6.get(r15)
            java.lang.String r15 = (java.lang.String) r15
            r2 = -1
            int r15 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r15, (int) r2)
            java.lang.String r0 = ".sysmsg.btnlist.btn1.$actiontype"
            java.lang.Object r0 = r6.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r2)
            java.lang.String r2 = ".sysmsg.btnlist.btn1"
            java.lang.Object r2 = r6.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            boolean r20 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r20 != 0) goto L_0x0883
            if (r15 < 0) goto L_0x0883
            if (r0 >= 0) goto L_0x087f
            goto L_0x0883
        L_0x087f:
            r36 = r5
            r5 = 1
            goto L_0x08a2
        L_0x0883:
            r36 = r5
            r9 = 3
            java.lang.Object[] r5 = new java.lang.Object[r9]
            r9 = 0
            r5[r9] = r8
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r18 = 1
            r5[r18] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
            r16 = 2
            r5[r16] = r9
            java.lang.String r9 = "summeralert sec btn btnStr[%s], btnId[%d] btnActionType[%d] is illegal only one btn"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r9, r5)
            r5 = 0
        L_0x08a2:
            com.tencent.mm.autogen.events.GlobalAlertEvent r9 = new com.tencent.mm.autogen.events.GlobalAlertEvent
            r9.<init>()
            r24 = r13
            se3.b r13 = new se3.b
            r13.<init>()
            r20 = r1
            com.tencent.mm.autogen.events.GlobalAlertEvent$a r1 = r9.f193674d
            r1.f193675a = r13
            r13.f226455d = r3
            r13.f226456e = r4
            r13.f226457f = r7
            java.lang.String r1 = ".sysmsg.btnlist.$autoSelectBtnIdx"
            java.lang.Object r1 = r6.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r6 = -1
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r6)
            r13.f226459h = r1
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r13.f226458g = r1
            se3.a r1 = new se3.a
            r1.<init>()
            r1.f226451d = r10
            r1.f226452e = r12
            r1.f226453f = r8
            r1.f226454g = r11
            java.util.LinkedList<se3.a> r6 = r13.f226458g
            r6.add(r1)
            if (r5 == 0) goto L_0x08f6
            se3.a r1 = new se3.a
            r1.<init>()
            r1.f226451d = r15
            r1.f226452e = r0
            r1.f226453f = r14
            r1.f226454g = r2
            java.util.LinkedList<se3.a> r0 = r13.f226458g
            r0.add(r1)
        L_0x08f6:
            boolean r0 = r9.publish()
            r1 = 7
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r20
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r3 = 1
            r1[r3] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r36)
            r3 = 2
            r1[r3] = r2
            r2 = 3
            r1[r2] = r4
            r2 = 4
            r1[r2] = r7
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
            r3 = 5
            r1[r3] = r2
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2 = 6
            r1[r2] = r0
            java.lang.String r0 = "summeralert uuid[%s], id[%d], important[%d], title[%s], msg[%s], twoBtn[%b], publish[%b]"
            r9 = r24
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r0, r1)
            r1 = 0
            return r1
        L_0x092c:
            r9 = r13
            r1 = 0
            r2 = 3
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r4 = 0
            r0[r4] = r8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r5 = 1
            r0[r5] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            r6 = 2
            r0[r6] = r2
            java.lang.String r2 = "summeralert first btn btnStr[%s], btnId[%d] btnActionType[%d] is illegal ret"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r2, r0)
            return r1
        L_0x0949:
            r20 = r1
            r36 = r5
            r9 = r13
            r1 = 0
            r2 = 3
            r4 = 0
            r5 = 1
            r6 = 2
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r20
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r0[r5] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r36)
            r0[r6] = r2
            java.lang.String r2 = "summeralert uuid[%s], id[%d], important[%d] is illegal ret"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r2, r0)
            return r1
        L_0x096a:
            r9 = r13
            r2 = -1
            if (r5 == 0) goto L_0x0c1b
            java.lang.String r0 = "yybsigcheck"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0c1b
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r28 = 322(0x142, double:1.59E-321)
            r30 = 14
            r32 = 1
            r34 = 0
            r27 = r0
            r27.idkeyStat(r28, r30, r32, r34)
            long r7 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = ".sysmsg.yybsigcheck.yybsig.nocheckmarket"
            java.lang.Object r1 = r6.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r5 = ".sysmsg.yybsigcheck.yybsig.wording"
            java.lang.Object r5 = r6.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r10 = ".sysmsg.yybsigcheck.yybsig.url"
            java.lang.Object r6 = r6.get(r10)
            java.lang.String r6 = (java.lang.String) r6
            r10 = 3
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r12 = 0
            r11[r12] = r1
            r13 = 1
            r11[r13] = r5
            r14 = 2
            r11[r14] = r6
            java.lang.String r15 = "summertoken newxml nocheckmarket[%s], wording[%s], url[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r15, r11)
            java.lang.Object[] r11 = new java.lang.Object[r14]
            r15 = 4014(0xfae, float:5.625E-42)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r11[r12] = r15
            java.lang.Object[] r15 = new java.lang.Object[r10]
            r15[r12] = r1
            r15[r13] = r5
            r15[r14] = r6
            java.lang.String r10 = "%s|%s|%s"
            java.lang.String r12 = java.lang.String.format(r10, r15)
            r11[r13] = r12
            r12 = 11098(0x2b5a, float:1.5552E-41)
            r0.mo160131h(r12, r11)
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r11 == 0) goto L_0x0a0d
            java.lang.String r1 = "summertoken newxml nocheckmarket is nil and return"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r1)
            r28 = 322(0x142, double:1.59E-321)
            r30 = 15
            r32 = 1
            r34 = 0
            r27 = r0
            r27.idkeyStat(r28, r30, r32, r34)
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 4015(0xfaf, float:5.626E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r4] = r5
            r11 = 1
            r1[r11] = r6
            java.lang.String r3 = "%s|%s"
            java.lang.String r1 = java.lang.String.format(r3, r1)
            r2[r11] = r1
            r0.mo160131h(r12, r2)
        L_0x0a0a:
            r1 = 0
            goto L_0x0c8a
        L_0x0a0d:
            r11 = 1
            java.lang.String[] r4 = r1.split(r4)
            java.lang.Object[] r13 = new java.lang.Object[r11]
            if (r4 != 0) goto L_0x0a18
            r11 = -1
            goto L_0x0a19
        L_0x0a18:
            int r11 = r4.length
        L_0x0a19:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r14 = 0
            r13[r14] = r11
            java.lang.String r11 = "summertoken newxml infoStrs len is %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r11, r13)
            if (r4 == 0) goto L_0x0bf8
            int r11 = r4.length
            if (r11 != 0) goto L_0x0a2d
            goto L_0x0bf8
        L_0x0a2d:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r13 = 0
        L_0x0a33:
            int r0 = r4.length
            if (r13 >= r0) goto L_0x0ae6
            r14 = r4[r13]
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r0 == 0) goto L_0x0a52
            r15 = 1
            java.lang.Object[] r0 = new java.lang.Object[r15]
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            r2 = 0
            r0[r2] = r14
            java.lang.String r14 = "summertoken newxml infoStr is nil index:%d, continue"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r14, r0)
            r24 = r3
            goto L_0x0add
        L_0x0a52:
            r2 = 0
            r15 = 1
            java.lang.String[] r0 = r14.split(r3)
            java.lang.Object[] r12 = new java.lang.Object[r15]
            if (r0 != 0) goto L_0x0a5e
            r15 = -1
            goto L_0x0a5f
        L_0x0a5e:
            int r15 = r0.length
        L_0x0a5f:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r12[r2] = r15
            java.lang.String r15 = "summertoken newxml fields len is %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r15, r12)
            if (r0 == 0) goto L_0x0acb
            int r12 = r0.length
            r15 = 3
            if (r12 == r15) goto L_0x0a72
            goto L_0x0acb
        L_0x0a72:
            sf0.r0$c r12 = new sf0.r0$c     // Catch:{ Exception -> 0x0a8d }
            r15 = r0[r2]     // Catch:{ Exception -> 0x0a8d }
            r17 = 1
            r2 = r0[r17]     // Catch:{ Exception -> 0x0a8d }
            r24 = r3
            r3 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r3)     // Catch:{ Exception -> 0x0a8b }
            r3 = 2
            r0 = r0[r3]     // Catch:{ Exception -> 0x0a8b }
            r12.<init>(r15, r2, r0)     // Catch:{ Exception -> 0x0a8b }
            r11.add(r12)     // Catch:{ Exception -> 0x0a8b }
            goto L_0x0add
        L_0x0a8b:
            r0 = move-exception
            goto L_0x0a90
        L_0x0a8d:
            r0 = move-exception
            r24 = r3
        L_0x0a90:
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r12 = 0
            r3[r12] = r2
            java.lang.String r0 = r0.getMessage()
            r2 = 1
            r3[r2] = r0
            java.lang.String r0 = "summertoken newxml parse info index:%d, e:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r9, r0, r3)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r26 = 322(0x142, double:1.59E-321)
            r28 = 17
            r30 = 1
            r32 = 0
            r25 = r0
            r25.idkeyStat(r26, r28, r30, r32)
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r2 = 4017(0xfb1, float:5.629E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12 = 0
            r3[r12] = r2
            r2 = 1
            r3[r2] = r14
            r14 = 11098(0x2b5a, float:1.5552E-41)
            r0.mo160131h(r14, r3)
            goto L_0x0add
        L_0x0acb:
            r24 = r3
            r2 = 1
            r12 = 0
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r0[r12] = r2
            java.lang.String r2 = "summertoken newxml fields len is invalid index:%d, continue"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r2, r0)
        L_0x0add:
            int r13 = r13 + 1
            r3 = r24
            r2 = -1
            r12 = 11098(0x2b5a, float:1.5552E-41)
            goto L_0x0a33
        L_0x0ae6:
            int r0 = r11.size()
            if (r0 != 0) goto L_0x0b24
            java.lang.String r0 = "summertoken newxml marketList size is 0 and return"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r20 = 322(0x142, double:1.59E-321)
            r22 = 18
            r24 = 1
            r26 = 0
            r19 = r0
            r19.idkeyStat(r20, r22, r24, r26)
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 4018(0xfb2, float:5.63E-42)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7 = 0
            r3[r7] = r4
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r7] = r1
            r1 = 1
            r4[r1] = r5
            r4[r2] = r6
            java.lang.String r2 = java.lang.String.format(r10, r4)
            r3[r1] = r2
            r1 = 11098(0x2b5a, float:1.5552E-41)
            r0.mo160131h(r1, r3)
            goto L_0x0a0a
        L_0x0b24:
            k40.a r0 = f40.C86709a0.m107533q(r22)
            lc3.b r0 = (lc3.C10485b) r0
            pj.f r0 = r0.vh0()
            java.lang.String r2 = "YYBVerifyMarketUseSystemApi"
            java.lang.String r0 = r0.mo107405c(r2)
            r2 = 0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r2)
            if (r0 == 0) goto L_0x0b3d
            r0 = 1
            goto L_0x0b3e
        L_0x0b3d:
            r0 = 0
        L_0x0b3e:
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r3 = sf0.C77704r0.m93721a(r3, r11, r0)
            r4 = 4
            java.lang.Object[] r12 = new java.lang.Object[r4]
            int r4 = r11.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r12[r2] = r4
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2 = 1
            r12[r2] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r2 = 2
            r12[r2] = r0
            long r13 = java.lang.System.currentTimeMillis()
            long r13 = r13 - r7
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            r2 = 3
            r12[r2] = r0
            java.lang.String r0 = "summertoken newxml marketList size[%d], usesSystemApi[%b], containLowerMarket[%b], take[%d]ms"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r0, r12)
            r0 = 46
            if (r3 != 0) goto L_0x0bbe
            com.tencent.mm.storage.u1 r2 = eb0.C97625j3.m125818h()
            r3 = 4
            r2.mo119666g(r0, r3)
            com.tencent.mm.autogen.events.KickOfflineEvent r0 = new com.tencent.mm.autogen.events.KickOfflineEvent
            r0.<init>()
            com.tencent.mm.autogen.events.KickOfflineEvent$a r2 = r0.f78847d
            r2.f78848a = r5
            r2.f78849b = r6
            r0.publish()
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r20 = 322(0x142, double:1.59E-321)
            r22 = 20
            r24 = 1
            r26 = 1
            r19 = r0
            r19.idkeyStat(r20, r22, r24, r26)
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 4020(0xfb4, float:5.633E-42)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7 = 0
            r3[r7] = r4
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r7] = r1
            r1 = 1
            r4[r1] = r5
            r4[r2] = r6
            java.lang.String r2 = java.lang.String.format(r10, r4)
            r3[r1] = r2
            r1 = 11098(0x2b5a, float:1.5552E-41)
            r0.mo160131h(r1, r3)
            goto L_0x0bf6
        L_0x0bbe:
            r7 = 0
            com.tencent.mm.storage.u1 r2 = eb0.C97625j3.m125818h()
            r2.mo119666g(r0, r7)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r20 = 322(0x142, double:1.59E-321)
            r22 = 19
            r24 = 1
            r26 = 1
            r19 = r0
            r19.idkeyStat(r20, r22, r24, r26)
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 4019(0xfb3, float:5.632E-42)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7 = 0
            r3[r7] = r4
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r7] = r1
            r1 = 1
            r4[r1] = r5
            r4[r2] = r6
            java.lang.String r2 = java.lang.String.format(r10, r4)
            r3[r1] = r2
            r1 = 11098(0x2b5a, float:1.5552E-41)
            r0.mo160131h(r1, r3)
        L_0x0bf6:
            r1 = 0
            return r1
        L_0x0bf8:
            r28 = 322(0x142, double:1.59E-321)
            r30 = 16
            r32 = 1
            r34 = 0
            r27 = r0
            r27.idkeyStat(r28, r30, r32, r34)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 4016(0xfb0, float:5.628E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            r3 = 1
            r2[r3] = r1
            r1 = 11098(0x2b5a, float:1.5552E-41)
            r0.mo160131h(r1, r2)
            goto L_0x0a0a
        L_0x0c1b:
            java.lang.String r0 = ".sysmsg.brand_username"
            java.lang.String r2 = ".sysmsg.chat_id"
            if (r5 == 0) goto L_0x0d05
            java.lang.String r3 = "qy_status_notify"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0d05
            java.lang.Object r1 = r6.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = ".sysmsg.last_create_time"
            java.lang.Object r2 = r6.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r6.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            long r2 = sb0.C48340e.m53667h(r1)
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0c54
            r4 = 1
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "qy_status_notify bizLocalId == -1,%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r1, r0)
            goto L_0x0a0a
        L_0x0c54:
            sb0.b r1 = rb0.C48009v0.Dx0()
            sb0.a r1 = r1.mo73024Yt(r2)
            int r1 = r1.field_newUnReadCount
            sb0.b r4 = rb0.C48009v0.Dx0()
            r4.mo73019DN(r2)
            sb0.d r4 = rb0.C48009v0.Ax0()
            sb0.c r2 = r4.mo73042a0(r2)
            eb0.c r3 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r3 = r3.mo105908w()
            com.tencent.mm.storage.i2 r3 = (com.tencent.p014mm.storage.C44660i2) r3
            com.tencent.mm.storage.h2 r3 = r3.mo69771j(r0)
            if (r3 != 0) goto L_0x0c8b
            r4 = 1
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r5 = 0
            r1[r5] = r0
            java.lang.String r0 = "qy_status_notify cvs == null:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r9, r0, r1)
            goto L_0x0a0a
        L_0x0c8a:
            return r1
        L_0x0c8b:
            r4 = 1
            r5 = 0
            boolean r2 = r2.mo73033l2(r4)
            if (r2 == 0) goto L_0x0cca
            int r2 = r3.mo108788I2()
            if (r2 > r1) goto L_0x0cb3
            r3.mo108817i3(r5)
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r1 = r1.mo105908w()
            com.tencent.mm.storage.i2 r1 = (com.tencent.p014mm.storage.C44660i2) r1
            r1.mo69773k0(r3, r0)
            eb0.u2 r1 = eb0.C97625j3.m125816f()
            com.tencent.mm.booter.notification.MMNotification r1 = (com.tencent.p014mm.booter.notification.MMNotification) r1
            r1.mo93211h(r0)
            goto L_0x0cc8
        L_0x0cb3:
            int r2 = r3.mo108788I2()
            int r2 = r2 - r1
            r3.mo108817i3(r2)
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r1 = r1.mo105908w()
            com.tencent.mm.storage.i2 r1 = (com.tencent.p014mm.storage.C44660i2) r1
            r1.mo69773k0(r3, r0)
        L_0x0cc8:
            r1 = 0
            return r1
        L_0x0cca:
            int r2 = r3.mo108786G2()
            if (r2 > r1) goto L_0x0ce7
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r1 = r1.mo105908w()
            com.tencent.mm.storage.i2 r1 = (com.tencent.p014mm.storage.C44660i2) r1
            r1.mo69778p0(r0)
            eb0.u2 r1 = eb0.C97625j3.m125816f()
            com.tencent.mm.booter.notification.MMNotification r1 = (com.tencent.p014mm.booter.notification.MMNotification) r1
            r1.mo93211h(r0)
            goto L_0x0d03
        L_0x0ce7:
            r2 = 0
            r3.mo108789J2(r2)
            r3.mo108816h3(r2)
            int r2 = r3.mo108786G2()
            int r2 = r2 - r1
            r3.mo108812g3(r2)
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r1 = r1.mo105908w()
            com.tencent.mm.storage.i2 r1 = (com.tencent.p014mm.storage.C44660i2) r1
            r1.mo69773k0(r3, r0)
        L_0x0d03:
            r1 = 0
            return r1
        L_0x0d05:
            if (r5 == 0) goto L_0x0d26
            java.lang.String r3 = "qy_chat_update"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0d26
            java.lang.Object r2 = r6.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = ".sysmsg.ver"
            java.lang.Object r3 = r6.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r6.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            sb0.C48340e.m53677r(r0, r2, r3)
        L_0x0d26:
            if (r5 == 0) goto L_0x0da7
            java.lang.String r0 = "bindmobiletip"
            boolean r2 = r5.equals(r0)
            if (r2 == 0) goto L_0x0da7
            java.lang.String r1 = ".sysmsg.bindmobiletip.forcebind"
            java.lang.Object r1 = r6.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r2 = 0
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r2)
            java.lang.String r3 = ".sysmsg.bindmobiletip.deviceid"
            java.lang.Object r3 = r6.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r3)
            java.lang.String r4 = ".sysmsg.bindmobiletip.wording"
            java.lang.Object r4 = r6.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r4)
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r5[r2] = r6
            r6 = 1
            r5[r6] = r4
            java.lang.String r6 = "bindmobiletip onNewXmlReceived, forceBind:%d,woridingStr[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r6, r5)
            ft3.g r5 = ft3.C8206g.f27135a
            java.lang.String r6 = p156gj.C87203t.m108272h()
            boolean r0 = r5.mo9260a(r3, r6, r0, r2)
            if (r0 == 0) goto L_0x0da5
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_BIND_MOBILE_XML_TIP_BOOLEAN
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r0.mo119677K(r2, r3)
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_BIND_MOBILE_XML_FORCE_BIND_BOOLEAN
            r3 = 1
            if (r1 != r3) goto L_0x0d90
            r10 = 1
            goto L_0x0d91
        L_0x0d90:
            r10 = 0
        L_0x0d91:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)
            r0.mo119677K(r2, r1)
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_BIND_MOBILE_XML_WORDING_STRING
            r0.mo119677K(r1, r4)
        L_0x0da5:
            r1 = 0
            return r1
        L_0x0da7:
            if (r5 == 0) goto L_0x0df1
            java.lang.String r0 = "BindPhoneGuidance"
            boolean r2 = r0.equals(r5)
            if (r2 == 0) goto L_0x0df1
            java.lang.String r1 = ".sysmsg.BindPhoneGuidance.deviceid"
            java.lang.Object r1 = r6.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = ".sysmsg.BindPhoneGuidance.forceShow=no"
            java.lang.Object r2 = r6.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            eb0.c r3 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r3 = r3.mo105906u()
            r4 = 6
            java.lang.Object r3 = r3.mo119684e(r4, r7)
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x0ddf
            java.lang.String r3 = "yes"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0def
        L_0x0ddf:
            ft3.g r2 = ft3.C8206g.f27135a
            java.lang.String r3 = p156gj.C87203t.m108272h()
            r4 = 0
            boolean r0 = r2.mo9260a(r1, r3, r0, r4)
            if (r0 == 0) goto L_0x0def
            com.tencent.p014mm.plugin.account.bind.p021ui.BindMobilePolicyUI.m161791V7(r26)
        L_0x0def:
            r1 = 0
            return r1
        L_0x0df1:
            if (r5 == 0) goto L_0x0eb6
            java.lang.String r0 = "ClientCheckConsistency"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0eb6
            te3.e63 r0 = new te3.e63
            r0.<init>()
            java.lang.String r2 = ".sysmsg.ClientCheckConsistency.clientcheck.fullpathfilename"
            java.lang.Object r2 = r6.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r0.f227203d = r2
            java.lang.String r2 = ".sysmsg.ClientCheckConsistency.clientcheck.fileoffset"
            java.lang.Object r2 = r6.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r3 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r3)
            r0.f227204e = r2
            java.lang.String r2 = ".sysmsg.ClientCheckConsistency.clientcheck.checkbuffersize"
            java.lang.Object r2 = r6.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r3)
            r0.f227205f = r2
            java.lang.String r2 = ".sysmsg.ClientCheckConsistency.clientcheck.seq"
            java.lang.Object r2 = r6.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r3)
            r0.f227206g = r2
            java.lang.String r2 = r0.f227203d
            int r3 = r0.f227204e
            long r3 = (long) r3
            int r8 = r0.f227205f
            long r11 = (long) r8
            java.lang.String r2 = m90708d(r2, r3, r11)
            r0.f227207h = r2
            java.lang.String r2 = r0.f227203d
            long r2 = m90709q(r2)
            int r3 = (int) r2
            r0.f227208i = r3
            boolean r2 = r20.d10()
            r0.f227209j = r2
            int r2 = p156gj.C87198e0.m108253a()
            r0.f227210n = r2
            r2 = 8
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = r0.f227203d
            r4 = 0
            r2[r4] = r3
            int r3 = r0.f227204e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 1
            r2[r4] = r3
            int r3 = r0.f227205f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 2
            r2[r4] = r3
            int r3 = r0.f227206g
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 3
            r2[r4] = r3
            java.lang.String r3 = r0.f227207h
            r4 = 4
            r2[r4] = r3
            int r3 = r0.f227208i
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 5
            r2[r4] = r3
            int r3 = r0.f227209j
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 6
            r2[r4] = r3
            int r3 = r0.f227210n
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 7
            r2[r4] = r3
            java.lang.String r2 = m90707D(r2)
            r0.f227211o = r2
            eb0.c r2 = eb0.C97625j3.m125812b()
            g62.m r2 = r2.mo105876B()
            g62.n r3 = new g62.n
            r4 = 61
            r3.<init>(r4, r0)
            tc0.p r2 = (tc0.C77885p) r2
            r2.mo107993q(r3)
        L_0x0eb6:
            if (r5 == 0) goto L_0x0f25
            java.lang.String r0 = "ClientCheckHook"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0f25
            te3.g63 r0 = new te3.g63
            r0.<init>()
            java.lang.String r2 = ".sysmsg.ClientCheckHook.clientcheck.seq"
            java.lang.Object r2 = r6.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r3 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r3)
            r0.f183276d = r2
            r2 = r20
            java.lang.String r4 = r2.te0(r3)
            r0.f183277e = r4
            boolean r4 = r2.d10()
            r0.f183278f = r4
            int r4 = p156gj.C87198e0.m108253a()
            r0.f183279g = r4
            r4 = 4
            java.lang.Object[] r8 = new java.lang.Object[r4]
            int r4 = r0.f183276d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r8[r3] = r4
            java.lang.String r3 = r0.f183277e
            r4 = 1
            r8[r4] = r3
            int r3 = r0.f183278f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 2
            r8[r4] = r3
            int r3 = r0.f183279g
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 3
            r8[r4] = r3
            java.lang.String r3 = m90707D(r8)
            r0.f183280h = r3
            eb0.c r3 = eb0.C97625j3.m125812b()
            g62.m r3 = r3.mo105876B()
            g62.n r4 = new g62.n
            r8 = 62
            r4.<init>(r8, r0)
            tc0.p r3 = (tc0.C77885p) r3
            r3.mo107993q(r4)
            goto L_0x0f27
        L_0x0f25:
            r2 = r20
        L_0x0f27:
            if (r5 == 0) goto L_0x0f93
            java.lang.String r0 = "ClientCheckGetAppList"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0f93
            te3.f63 r0 = new te3.f63
            r0.<init>()
            java.lang.String r3 = ".sysmsg.ClientCheckGetAppList.clientcheck.seq"
            java.lang.Object r3 = r6.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r4 = 0
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r4)
            r0.f183080d = r3
            java.lang.String r3 = r2.mo175795FF()
            r0.f183081e = r3
            boolean r3 = r2.d10()
            r0.f183082f = r3
            int r3 = p156gj.C87198e0.m108253a()
            r0.f183083g = r3
            r3 = 4
            java.lang.Object[] r8 = new java.lang.Object[r3]
            int r3 = r0.f183080d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r8[r4] = r3
            java.lang.String r3 = r0.f183081e
            r4 = 1
            r8[r4] = r3
            int r3 = r0.f183082f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 2
            r8[r4] = r3
            int r3 = r0.f183083g
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 3
            r8[r4] = r3
            java.lang.String r3 = m90707D(r8)
            r0.f183084h = r3
            eb0.c r3 = eb0.C97625j3.m125812b()
            g62.m r3 = r3.mo105876B()
            g62.n r4 = new g62.n
            r8 = 63
            r4.<init>(r8, r0)
            tc0.p r3 = (tc0.C77885p) r3
            r3.mo107993q(r4)
        L_0x0f93:
            if (r5 == 0) goto L_0x0fab
            java.lang.String r0 = "ClientCheckGetExtInfo"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0fab
            eb0.g$b r0 = new eb0.g$b
            r3 = r35
            r0.<init>(r3, r6)
            java.lang.String r4 = "syscmd_rpt_cc"
            com.tencent.p014mm.sdk.thread.ThreadPool.postAtFront(r0, r4)
            goto L_0x0fad
        L_0x0fab:
            r3 = r35
        L_0x0fad:
            if (r5 == 0) goto L_0x0fe7
            java.lang.String r0 = "ClientCheckSensorCollect"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0fe7
            java.lang.String r0 = ".sysmsg.ClientCheckSensorCollect.SensorScene"
            java.lang.Object r0 = r6.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r4 = 0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r4)
            java.lang.String r4 = ".sysmsg.ClientCheckSensorCollect.BehaviorID"
            java.lang.Object r4 = r6.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r8 != 0) goto L_0x0fe5
            java.lang.String r8 = r4.trim()
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 == 0) goto L_0x0fdd
            goto L_0x0fe5
        L_0x0fdd:
            java.lang.String r4 = r4.trim()
            r2.mo175799SP(r4, r0)
            goto L_0x0fe7
        L_0x0fe5:
            r1 = 0
            return r1
        L_0x0fe7:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r36)
            if (r0 != 0) goto L_0x100e
            java.lang.String r0 = "functionmsg"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x100e
            java.lang.String r0 = "subtype functionmsg"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r0)
            java.lang.Class<ug.n0> r0 = p248ug.C37461n0.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ug.n0 r0 = (p248ug.C37461n0) r0
            ug.i0 r0 = r0.mo61109lG()
            rl.a r0 = (p676rl.C36332a) r0
            java.lang.String r2 = "newSync"
            r0.mo60622c(r1, r6, r2)
        L_0x100e:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r36)
            if (r0 != 0) goto L_0x10a3
            java.lang.String r0 = "paymsg"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x10a3
            java.lang.String r0 = ".sysmsg.paymsg.PayMsgType"
            java.lang.Object r0 = r6.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r2 = 0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r2)
            java.lang.String r2 = ".sysmsg.paymsg.appmsgcontent"
            java.lang.Object r2 = r6.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r4 = ".sysmsg.paymsg.fromusername"
            java.lang.Object r4 = r6.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = ".sysmsg.paymsg.tousername"
            java.lang.Object r5 = r6.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r8 = ".sysmsg.paymsg.paymsgid"
            java.lang.Object r6 = r6.get(r8)
            java.lang.String r6 = (java.lang.String) r6
            r8 = 6
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            r12 = 0
            r8[r12] = r11
            long r11 = r1.f227638r
            java.lang.Long r1 = java.lang.Long.valueOf(r11)
            r11 = 1
            r8[r11] = r1
            r1 = 2
            r8[r1] = r4
            r1 = 3
            r8[r1] = r5
            r1 = 4
            r8[r1] = r6
            r1 = 5
            r8[r1] = r2
            java.lang.String r1 = "payMsg, payMsgType: %s, MsgId: %s, fromUsername: %s, toUsername: %s, paymsgid: %s, appMsgContentEncode: %s, "
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r1, r8)
            java.lang.String r1 = "UTF-8"
            java.lang.String r1 = java.net.URLDecoder.decode(r2, r1)     // Catch:{ Exception -> 0x108e }
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)     // Catch:{ Exception -> 0x108e }
            if (r2 != 0) goto L_0x10a3
            com.tencent.mm.autogen.events.ReceiveAANewXmlEvent r2 = new com.tencent.mm.autogen.events.ReceiveAANewXmlEvent     // Catch:{ Exception -> 0x108e }
            r2.<init>()     // Catch:{ Exception -> 0x108e }
            com.tencent.mm.autogen.events.ReceiveAANewXmlEvent$a r8 = r2.f78902d     // Catch:{ Exception -> 0x108e }
            r8.f78903a = r0     // Catch:{ Exception -> 0x108e }
            r8.f78904b = r1     // Catch:{ Exception -> 0x108e }
            r8.f78905c = r4     // Catch:{ Exception -> 0x108e }
            r8.f78906d = r5     // Catch:{ Exception -> 0x108e }
            r8.f78907e = r6     // Catch:{ Exception -> 0x108e }
            r2.publish()     // Catch:{ Exception -> 0x108e }
            goto L_0x10a3
        L_0x108e:
            r0 = move-exception
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r0, r7, r2)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r0 = r0.getMessage()
            r2[r1] = r0
            java.lang.String r0 = "pay msg, parse failed: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r0, r2)
        L_0x10a3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: eb0.C75579g.mo10269X5(java.lang.String, java.util.Map, ob0.m$a):ob0.m$b");
    }
}
