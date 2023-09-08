package ke2;

import android.database.Cursor;
import android.util.Pair;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.plugin.priority.model.c2c.img.C94292a;
import com.tencent.p014mm.plugin.priority.model.c2c.img.C94293b;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72684e;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.tav.coremedia.TimeUtil;
import di3.C86301e;
import di3.C86312j;
import eb0.C75604z3;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import i21.C98590g;
import i21.C98591h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kj2.C117407d;
import me2.C10783a;
import ne2.C34823a;
import p158gt.C98201k;
import p575jn.C98950b;
import p763ym.C53543s;
import pe2.C100786f;
import qg2.C101147j0;
import re2.C101371a;
import re2.C101373b;
import se2.C101589b;
import se2.C101590c;
import te2.C101744a;
import te2.C101745b;
import te2.C101750g;
import te3.C101826p8;
import te3.C101831q8;
import te3.C101834rc0;
import ye2.C102838a;
import ye2.C102839b;
import ye2.C102840c;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: ke2.e */
public class C99135e extends C86301e implements C98591h {

    /* renamed from: ke2.e$a */
    public class C99136a extends C102838a {

        /* renamed from: d */
        public String f290680d;

        /* renamed from: e */
        public long f290681e;

        /* renamed from: f */
        public boolean f290682f;

        /* renamed from: g */
        public boolean f290683g;

        /* renamed from: h */
        public boolean f290684h;

        public C99136a(C99135e eVar, boolean z, String str, long j, boolean z2, boolean z3) {
            this.f290684h = z;
            this.f290680d = str;
            this.f290681e = j;
            this.f290682f = z2;
            this.f290683g = z3;
        }

        /* renamed from: a */
        public String mo129622a() {
            return "Priority.onC2CFileDownloadedTask";
        }

        public void run() {
            int i;
            Class cls = C99129c.class;
            C99129c cVar = (C99129c) C86312j.m106911c(cls);
            cVar.requireAccountInitialized();
            if (cVar.f290669v != null) {
                C99129c cVar2 = (C99129c) C86312j.m106911c(cls);
                cVar2.requireAccountInitialized();
                C101589b bVar = cVar2.f290669v;
                boolean z = this.f290684h;
                String str = this.f290680d;
                long j = this.f290681e;
                boolean z2 = this.f290682f;
                boolean z3 = this.f290683g;
                bVar.getClass();
                if (z2) {
                    C99129c cVar3 = (C99129c) C86312j.m106911c(cls);
                    cVar3.requireAccountInitialized();
                    C101826p8 b = cVar3.f290662o.mo141065b(str, j);
                    if (b == null) {
                        Log.m105925i("MicroMsg.Priority.C2CMsgAutoDownloadFileLogic", "sender file %s %s", str, Long.valueOf(j));
                        return;
                    }
                    int i2 = b.f299093j;
                    if (i2 == 1 || i2 == 2 || i2 == 4) {
                        if (!z) {
                            i = 5;
                        } else {
                            C101750g.C101751a e = C101750g.f297828a.mo141185e(((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).h30(b.f299088e, b.f299095o).f230724G);
                            long j2 = b.f299095o;
                            ((C98590g) C86312j.m106911c(C98590g.class)).bq0(4, j2, b.f299088e, C100786f.m131971b(b.f299099s), (long) e.f297830b, (long) e.f297831c, b.f299091h);
                            i = 3;
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        C100786f.m131973d(1, currentTimeMillis, i, b);
                        C99129c cVar4 = (C99129c) C86312j.m106911c(cls);
                        cVar4.requireAccountInitialized();
                        C101590c cVar5 = cVar4.f290662o;
                        String str2 = b.f299087d;
                        long j3 = b.f299095o;
                        cVar5.f297414g.bindLong(1, currentTimeMillis);
                        cVar5.f297414g.bindLong(2, (long) i);
                        cVar5.f297414g.bindString(3, str2);
                        cVar5.f297414g.bindLong(4, j3);
                        Log.m105925i("MicroMsg.Priority.C2CMsgAutoDownloadFileStorage", "updateStatusAndDownloadTime %s res %s %s %s %s", Integer.valueOf(cVar5.f297414g.executeUpdateDelete()), str2, Long.valueOf(j3), Long.valueOf(currentTimeMillis), Integer.valueOf(i));
                        return;
                    }
                    Log.m105925i("MicroMsg.Priority.C2CMsgAutoDownloadFileLogic", "already auto download msgid %s %s", str, Long.valueOf(j));
                } else if (z3) {
                    Log.m105925i("MicroMsg.Priority.C2CMsgAutoDownloadFileLogic", "updateStatus download cancel %s %s", str, Long.valueOf(j));
                    C99129c cVar6 = (C99129c) C86312j.m106911c(cls);
                    cVar6.requireAccountInitialized();
                    cVar6.f290662o.mo141068e(str, j, 1);
                } else {
                    Log.m105925i("MicroMsg.Priority.C2CMsgAutoDownloadFileLogic", "updateStatus download fail %s %s", str, Long.valueOf(j));
                    C99129c cVar7 = (C99129c) C86312j.m106911c(cls);
                    cVar7.requireAccountInitialized();
                    cVar7.f290662o.mo141068e(str, j, 4);
                }
            }
        }
    }

    /* renamed from: ke2.e$b */
    public class C99137b extends C102838a {

        /* renamed from: d */
        public String f290685d;

        /* renamed from: e */
        public long f290686e;

        /* renamed from: f */
        public boolean f290687f;

        public C99137b(C99135e eVar, String str, long j, boolean z) {
            this.f290685d = str;
            this.f290686e = j;
            this.f290687f = z;
        }

        /* renamed from: a */
        public String mo129622a() {
            return "Priority.C2CFileOpenTask";
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x00be  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00c5  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r26 = this;
                r0 = r26
                java.lang.Class<ke2.c> r1 = ke2.C99129c.class
                di3.d r2 = di3.C86312j.m106911c(r1)
                ke2.c r2 = (ke2.C99129c) r2
                r2.requireAccountInitialized()
                se2.b r2 = r2.f290669v
                if (r2 == 0) goto L_0x0160
                di3.d r2 = di3.C86312j.m106911c(r1)
                ke2.c r2 = (ke2.C99129c) r2
                r2.requireAccountInitialized()
                se2.b r2 = r2.f290669v
                java.lang.String r3 = r0.f290685d
                long r4 = r0.f290686e
                boolean r6 = r0.f290687f
                r2.getClass()
                di3.d r2 = di3.C86312j.m106911c(r1)
                ke2.c r2 = (ke2.C99129c) r2
                r2.requireAccountInitialized()
                se2.c r2 = r2.f290662o
                te3.p8 r2 = r2.mo141065b(r3, r4)
                di3.d r7 = di3.C86312j.m106911c(r1)
                ke2.c r7 = (ke2.C99129c) r7
                r7.requireAccountInitialized()
                se2.c r7 = r7.f290662o
                te3.p8 r7 = r7.mo141065b(r3, r4)
                java.lang.String r8 = "\\d+"
                boolean r8 = r3.matches(r8)
                r11 = 2
                r12 = 0
                r15 = 0
                if (r8 == 0) goto L_0x0083
                java.lang.Class<f62.k0> r8 = f62.C75700k0.class
                k40.a r8 = f40.C86709a0.m107533q(r8)
                f62.k0 r8 = (f62.C75700k0) r8
                g62.l r8 = r8.mo96095LE()
                long r9 = java.lang.Long.parseLong(r3)
                com.tencent.mm.storage.g4 r8 = (com.tencent.p014mm.storage.C72972g4) r8
                com.tencent.mm.storage.f4 r8 = r8.b00(r9)
                te2.g$b r9 = te2.C101750g.f297828a
                java.lang.String r10 = r8.mo108768t()
                int r9 = r9.mo141183c(r11, r10)
                if (r9 == 0) goto L_0x0083
                long r9 = r8.getMsgId()
                int r16 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
                if (r16 <= 0) goto L_0x0083
                int r9 = r8.mo108769t2()
                if (r9 != 0) goto L_0x0083
                pe2.C100786f.m131974e(r8)
                goto L_0x00ba
            L_0x0083:
                if (r7 == 0) goto L_0x00ba
                java.lang.Class<i21.g> r8 = i21.C98590g.class
                di3.d r8 = di3.C86312j.m106911c(r8)
                r16 = r8
                i21.g r16 = (i21.C98590g) r16
                long r8 = r7.f299095o
                java.lang.String r10 = r7.f299088e
                int r14 = r7.f299093j
                int r14 = pe2.C100786f.m131970a(r14)
                long r11 = (long) r14
                int r13 = r7.f299093j
                switch(r13) {
                    case 1: goto L_0x00a5;
                    case 2: goto L_0x00a7;
                    case 3: goto L_0x00a3;
                    case 4: goto L_0x00a1;
                    case 5: goto L_0x00a3;
                    case 6: goto L_0x00a3;
                    default: goto L_0x009f;
                }
            L_0x009f:
                r6 = 0
                goto L_0x00aa
            L_0x00a1:
                r6 = 4
                goto L_0x00aa
            L_0x00a3:
                r6 = 3
                goto L_0x00aa
            L_0x00a5:
                if (r6 == 0) goto L_0x00a9
            L_0x00a7:
                r6 = 2
                goto L_0x00aa
            L_0x00a9:
                r6 = 1
            L_0x00aa:
                long r13 = (long) r6
                long r6 = r7.f299091h
                r17 = r8
                r19 = r10
                r20 = r11
                r22 = r13
                r24 = r6
                r16.mo137960DO(r17, r19, r20, r22, r24)
            L_0x00ba:
                java.lang.String r6 = "MicroMsg.Priority.C2CMsgAutoDownloadFileLogic"
                if (r2 != 0) goto L_0x00c5
                java.lang.String r1 = "This File Sender is Me"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
                goto L_0x0160
            L_0x00c5:
                long r7 = r2.f299098r
                r9 = 0
                int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r11 <= 0) goto L_0x00e1
                r7 = 2
                java.lang.Object[] r1 = new java.lang.Object[r7]
                r1[r15] = r3
                java.lang.Long r2 = java.lang.Long.valueOf(r4)
                r3 = 1
                r1[r3] = r2
                java.lang.String r2 = "onFileOpen file already use %s %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r1)
                goto L_0x0160
            L_0x00e1:
                java.lang.String r6 = r2.f299088e
                boolean r6 = com.tencent.p014mm.storage.C72996z1.m85820U5(r6)
                if (r6 == 0) goto L_0x00fb
                di3.d r6 = di3.C86312j.m106911c(r1)
                ke2.c r6 = (ke2.C99129c) r6
                r6.requireAccountInitialized()
                se2.d r6 = r6.f290664q
                java.lang.String r7 = r2.f299088e
                java.lang.String r8 = "@all"
                r6.mo140567m(r7, r8)
            L_0x00fb:
                di3.d r6 = di3.C86312j.m106911c(r1)
                ke2.c r6 = (ke2.C99129c) r6
                r6.requireAccountInitialized()
                se2.d r6 = r6.f290664q
                java.lang.String r7 = r2.f299088e
                java.lang.String r8 = r2.f299089f
                r6.mo140567m(r7, r8)
                long r6 = java.lang.System.currentTimeMillis()
                r2.f299098r = r6
                di3.d r1 = di3.C86312j.m106911c(r1)
                ke2.c r1 = (ke2.C99129c) r1
                r1.requireAccountInitialized()
                se2.c r1 = r1.f290662o
                long r6 = r2.f299098r
                com.tencent.wcdb.database.SQLiteStatement r8 = r1.f297415h
                r9 = 1
                r8.bindLong(r9, r6)
                com.tencent.wcdb.database.SQLiteStatement r8 = r1.f297415h
                r10 = 2
                r8.bindString(r10, r3)
                com.tencent.wcdb.database.SQLiteStatement r8 = r1.f297415h
                r11 = 3
                r8.bindLong(r11, r4)
                com.tencent.wcdb.database.SQLiteStatement r1 = r1.f297415h
                int r1 = r1.executeUpdateDelete()
                r8 = 4
                java.lang.Object[] r8 = new java.lang.Object[r8]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r8[r15] = r1
                r8[r9] = r3
                java.lang.Long r1 = java.lang.Long.valueOf(r4)
                r8[r10] = r1
                java.lang.Long r1 = java.lang.Long.valueOf(r6)
                r8[r11] = r1
                java.lang.String r1 = "MicroMsg.Priority.C2CMsgAutoDownloadFileStorage"
                java.lang.String r3 = "updateOpenTime %s res %s %s %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r8)
                long r3 = java.lang.System.currentTimeMillis()
                int r1 = r2.f299093j
                pe2.C100786f.m131973d(r10, r3, r1, r2)
            L_0x0160:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ke2.C99135e.C99137b.run():void");
        }
    }

    /* renamed from: ke2.e$c */
    public class C99138c extends C102838a {

        /* renamed from: d */
        public C72963f4 f290688d;

        public C99138c(C99135e eVar, C72963f4 f4Var) {
            this.f290688d = f4Var;
        }

        /* renamed from: a */
        public String mo129622a() {
            return "C2CFileReceiveTask";
        }

        public void run() {
            String str;
            String str2;
            int i;
            double[] dArr;
            Class cls;
            Iterator<C101834rc0> it;
            C72963f4 f4Var;
            Class cls2 = C99129c.class;
            long createTime = this.f290688d.getCreateTime();
            C99129c cVar = (C99129c) C86312j.m106911c(cls2);
            cVar.requireAccountInitialized();
            if (createTime <= cVar.f290659i) {
                Log.m105925i("MicroMsg.Priority.PriorityService", "onC2CFileReceive time condition not support %s", C72715f.m85111d(TimeUtil.YYYY2MM2DD_HH1MM1SS, this.f290688d.getCreateTime() / 1000));
                return;
            }
            C99129c cVar2 = (C99129c) C86312j.m106911c(cls2);
            cVar2.requireAccountInitialized();
            if (cVar2.f290669v != null) {
                C99129c cVar3 = (C99129c) C86312j.m106911c(cls2);
                cVar3.requireAccountInitialized();
                C101589b bVar = cVar3.f290669v;
                C72963f4 f4Var2 = this.f290688d;
                bVar.getClass();
                String t = f4Var2.mo108768t();
                if (!C72996z1.m85820U5(f4Var2.mo108768t()) || f4Var2.mo108769t2() != 0) {
                    str = t;
                    str2 = f4Var2.getContent();
                } else {
                    str2 = C75604z3.m90849u(f4Var2.getContent());
                    str = Util.nullAs(C75604z3.m90847s(f4Var2.getContent()), "");
                }
                C68070l.C68072b u = C68070l.C68072b.m80422u(str2, (String) null);
                if (u == null) {
                    Log.m105924i("MicroMsg.Priority.C2CMsgAutoDownloadFileLogic", "appMsgContent is null");
                    return;
                }
                if (!C72996z1.m85820U5(f4Var2.mo108768t()) || f4Var2.mo108769t2() != 0) {
                    C99129c cVar4 = (C99129c) C86312j.m106911c(cls2);
                    cVar4.requireAccountInitialized();
                    dArr = cVar4.f290664q.mo140561d(f4Var2.mo108768t(), f4Var2.mo108768t());
                    C99129c cVar5 = (C99129c) C86312j.m106911c(cls2);
                    cVar5.requireAccountInitialized();
                    i = cVar5.f290664q.mo140564j(f4Var2.mo108768t(), f4Var2.mo108768t());
                } else {
                    C99129c cVar6 = (C99129c) C86312j.m106911c(cls2);
                    cVar6.requireAccountInitialized();
                    dArr = cVar6.f290664q.mo140561d(f4Var2.mo108768t(), "@all");
                    C99129c cVar7 = (C99129c) C86312j.m106911c(cls2);
                    cVar7.requireAccountInitialized();
                    i = cVar7.f290664q.mo140564j(f4Var2.mo108768t(), "@all");
                }
                double max = Math.max(Math.max(dArr[0], dArr[1]), dArr[2]);
                int i2 = u.f195582i;
                String str3 = "insert auto download file %s %s %s %s %.2f";
                if (i2 == 6) {
                    String valueOf = String.valueOf(f4Var2.getMsgId());
                    C99129c cVar8 = (C99129c) C86312j.m106911c(cls2);
                    cVar8.requireAccountInitialized();
                    if (cVar8.f290662o.mo141067d(valueOf, f4Var2.mo108774y2())) {
                        Log.m105925i("MicroMsg.Priority.C2CMsgAutoDownloadFileLogic", "file already exist msg %s %s", Long.valueOf(f4Var2.getMsgId()), Long.valueOf(f4Var2.mo108774y2()));
                        return;
                    }
                    C101826p8 p8Var = new C101826p8();
                    p8Var.f299087d = valueOf;
                    p8Var.f299088e = f4Var2.mo108768t();
                    p8Var.f299089f = str;
                    p8Var.f299090g = 2;
                    p8Var.f299091h = f4Var2.getCreateTime();
                    p8Var.f299092i = i < 2 ? 1 : 0;
                    p8Var.f299093j = 1;
                    p8Var.f299094n = 0;
                    p8Var.f299095o = f4Var2.mo108774y2();
                    p8Var.f299096p = (long) u.f195594l;
                    p8Var.f299097q = u.f195602n;
                    p8Var.f299099s = max;
                    p8Var.f299100t = 1;
                    p8Var.f299101u = u.f195606o;
                    C72683d qq = ((C72684e) ((C53543s) C86312j.m106911c(C53543s.class)).mo74024KZ()).mo100154qq(u.f195606o);
                    if (qq != null) {
                        C86009m1 m1Var = new C86009m1(qq.field_fileFullPath);
                        if (m1Var.mo119967g() && m1Var.mo119980r() == qq.field_totalLen) {
                            p8Var.f299094n = System.currentTimeMillis();
                            p8Var.f299093j = 6;
                        }
                    }
                    Log.m105925i("MicroMsg.Priority.C2CMsgAutoDownloadFileLogic", str3, p8Var.f299088e, Util.getSizeMB(p8Var.f299096p), p8Var.f299097q, Integer.valueOf(p8Var.f299092i), Double.valueOf(p8Var.f299099s));
                    C99129c cVar9 = (C99129c) C86312j.m106911c(cls2);
                    cVar9.requireAccountInitialized();
                    cVar9.f290662o.mo141066c(p8Var);
                    if (C72996z1.m85820U5(p8Var.f299088e)) {
                        C99129c cVar10 = (C99129c) C86312j.m106911c(cls2);
                        cVar10.requireAccountInitialized();
                        cVar10.f290664q.mo140566l(p8Var.f299088e, "@all");
                    }
                    C99129c cVar11 = (C99129c) C86312j.m106911c(cls2);
                    cVar11.requireAccountInitialized();
                    cVar11.f290664q.mo140566l(p8Var.f299088e, p8Var.f299089f);
                    C100786f.m131973d(3, System.currentTimeMillis(), p8Var.f299093j, p8Var);
                    return;
                }
                String str4 = str3;
                if (i2 == 19) {
                    Iterator<C101834rc0> it4 = C101147j0.m132643x(u.f195571f0).f227155f.iterator();
                    while (it4.hasNext()) {
                        C101834rc0 next = it4.next();
                        if (next.f299258I == 8) {
                            String str5 = next.f299280T;
                            C99129c cVar12 = (C99129c) C86312j.m106911c(cls2);
                            cVar12.requireAccountInitialized();
                            cls = cls2;
                            if (cVar12.f290662o.mo141067d(str5, f4Var2.mo108774y2())) {
                                Log.m105925i("MicroMsg.Priority.C2CMsgAutoDownloadFileLogic", "file already exist msg %s %s", str5, Long.valueOf(f4Var2.mo108774y2()));
                                cls2 = cls;
                            } else {
                                C101826p8 p8Var2 = new C101826p8();
                                p8Var2.f299087d = str5;
                                p8Var2.f299088e = f4Var2.mo108768t();
                                p8Var2.f299089f = str;
                                p8Var2.f299090g = 3;
                                it = it4;
                                p8Var2.f299091h = f4Var2.getCreateTime();
                                p8Var2.f299092i = i < 2 ? 1 : 0;
                                p8Var2.f299093j = 1;
                                p8Var2.f299094n = 0;
                                p8Var2.f299095o = f4Var2.mo108774y2();
                                long j = next.f299276R;
                                p8Var2.f299096p = j;
                                p8Var2.f299097q = next.f299262K;
                                p8Var2.f299099s = max;
                                p8Var2.f299100t = 1;
                                p8Var2.f299101u = next.f299325s;
                                f4Var = f4Var2;
                                Log.m105925i("MicroMsg.Priority.C2CMsgAutoDownloadFileLogic", str4, p8Var2.f299088e, Util.getSizeMB(j), p8Var2.f299097q, Integer.valueOf(p8Var2.f299092i), Double.valueOf(p8Var2.f299099s));
                                C99129c cVar13 = (C99129c) C86312j.m106911c(cls);
                                cVar13.requireAccountInitialized();
                                cVar13.f290662o.mo141066c(p8Var2);
                                if (C72996z1.m85820U5(p8Var2.f299088e)) {
                                    C99129c cVar14 = (C99129c) C86312j.m106911c(cls);
                                    cVar14.requireAccountInitialized();
                                    cVar14.f290664q.mo140566l(p8Var2.f299088e, "@all");
                                }
                                C99129c cVar15 = (C99129c) C86312j.m106911c(cls);
                                cVar15.requireAccountInitialized();
                                cVar15.f290664q.mo140566l(p8Var2.f299088e, p8Var2.f299089f);
                                C100786f.m131973d(3, System.currentTimeMillis(), p8Var2.f299093j, p8Var2);
                            }
                        } else {
                            cls = cls2;
                            it = it4;
                            f4Var = f4Var2;
                        }
                        f4Var2 = f4Var;
                        it4 = it;
                        cls2 = cls;
                    }
                }
            }
        }
    }

    /* renamed from: ke2.e$d */
    public class C99139d extends C102838a {

        /* renamed from: d */
        public long f290689d;

        /* renamed from: e */
        public boolean f290690e;

        /* renamed from: f */
        public boolean f290691f;

        public C99139d(C99135e eVar, long j, boolean z, boolean z2) {
            this.f290689d = j;
            this.f290690e = z;
            this.f290691f = z2;
        }

        /* renamed from: a */
        public String mo129622a() {
            return "Priority.onC2CImgDownloadedTask";
        }

        public void run() {
            int i;
            Class cls = C99129c.class;
            C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(this.f290689d);
            long createTime = b002.getCreateTime();
            C99129c cVar = (C99129c) C86312j.m106911c(cls);
            cVar.requireAccountInitialized();
            if (createTime <= cVar.f290659i) {
                Log.m105925i("MicroMsg.Priority.PriorityService", "onC2CImgDownloaded time condition not support %s", C72715f.m85111d(TimeUtil.YYYY2MM2DD_HH1MM1SS, b002.getCreateTime() / 1000));
                return;
            }
            C99129c cVar2 = (C99129c) C86312j.m106911c(cls);
            cVar2.requireAccountInitialized();
            if (cVar2.f290668u != null) {
                C99129c cVar3 = (C99129c) C86312j.m106911c(cls);
                cVar3.requireAccountInitialized();
                C94292a aVar = cVar3.f290668u;
                boolean z = this.f290690e;
                boolean z2 = this.f290691f;
                aVar.getClass();
                if (z) {
                    C99129c cVar4 = (C99129c) C86312j.m106911c(cls);
                    cVar4.requireAccountInitialized();
                    C101831q8 c = cVar4.f290661n.mo129627c(b002.getMsgId());
                    if (c == null) {
                        Log.m105925i("MicroMsg.Priority.C2CMsgAutoDownloadImgLogic", "sender img %d", Long.valueOf(b002.getMsgId()));
                    } else if (c.f299203j == 3) {
                        Log.m105925i("MicroMsg.Priority.C2CMsgAutoDownloadImgLogic", "already auto download msgid %d", Long.valueOf(b002.getMsgId()));
                    } else {
                        C117407d dVar = C117407d.INSTANCE;
                        dVar.idkeyStat(957, 20, 1, false);
                        long currentTimeMillis = System.currentTimeMillis();
                        C92836k NQ = ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).mo127168NQ(b002.mo108768t(), c.f299205o);
                        c.f299206p = NQ.f267377d;
                        C100786f.m131972c(1, currentTimeMillis, 0, c);
                        C101750g.C101753c f = C101750g.f297828a.mo141186f(b002.f230724G);
                        long j = c.f299205o;
                        String str = c.f299198e;
                        long j2 = j;
                        String str2 = str;
                        ((C98590g) C86312j.m106911c(C98590g.class)).bq0(1, j2, str2, C100786f.m131971b(c.f299208r), (long) f.f297833b, (long) f.f297834c, b002.getCreateTime());
                        C99129c cVar5 = (C99129c) C86312j.m106911c(cls);
                        cVar5.requireAccountInitialized();
                        C94293b bVar = cVar5.f290661n;
                        long j3 = c.f299197d;
                        int i2 = NQ.f267377d;
                        bVar.f272427g.bindLong(1, currentTimeMillis);
                        bVar.f272427g.bindLong(2, (long) 3);
                        bVar.f272427g.bindLong(3, (long) i2);
                        bVar.f272427g.bindLong(4, j3);
                        Log.m105925i("MicroMsg.Priority.C2CMsgAutoDownloadImgStorage", "updateStatusAndDownloadTime %d res %d %d %d", Integer.valueOf(bVar.f272427g.executeUpdateDelete()), Long.valueOf(j3), Long.valueOf(currentTimeMillis), 3);
                        if (C10783a.m10759c(c.f299202i, 1)) {
                            C117407d dVar2 = dVar;
                            i = 2;
                            dVar2.idkeyStat(957, 21, 1, false);
                            dVar2.idkeyStat(957, 22, (long) NQ.f267377d, false);
                        } else {
                            i = 2;
                        }
                        if (C10783a.m10759c(c.f299202i, 8)) {
                            C117407d dVar3 = dVar;
                            dVar3.idkeyStat(957, 23, 1, false);
                            dVar3.idkeyStat(957, 24, (long) NQ.f267377d, false);
                        }
                        if (C10783a.m10759c(c.f299202i, i) || C10783a.m10759c(c.f299202i, 4)) {
                            dVar.idkeyStat(957, 25, 1, false);
                            dVar.idkeyStat(957, 26, (long) NQ.f267377d, false);
                        }
                        if (C10783a.m10759c(c.f299202i, 16)) {
                            dVar.idkeyStat(957, 27, 1, false);
                            dVar.idkeyStat(957, 28, (long) NQ.f267377d, false);
                        }
                        if (C10783a.m10759c(c.f299202i, 32)) {
                            dVar.idkeyStat(957, 29, 1, false);
                            dVar.idkeyStat(957, 30, (long) NQ.f267377d, false);
                        }
                        if (C10783a.m10759c(c.f299202i, 64)) {
                            dVar.idkeyStat(957, 33, 1, false);
                            dVar.idkeyStat(957, 34, (long) NQ.f267377d, false);
                        }
                        if (C10783a.m10759c(c.f299202i, 128)) {
                            dVar.idkeyStat(957, 35, 1, false);
                            dVar.idkeyStat(957, 36, (long) NQ.f267377d, false);
                        }
                    }
                } else {
                    if (z2) {
                        Log.m105925i("MicroMsg.Priority.C2CMsgAutoDownloadImgLogic", "updateStatus download cancel %d", Long.valueOf(b002.getMsgId()));
                        C99129c cVar6 = (C99129c) C86312j.m106911c(cls);
                        cVar6.requireAccountInitialized();
                        cVar6.f290661n.mo129630f(b002.getMsgId(), 1);
                    } else {
                        Log.m105925i("MicroMsg.Priority.C2CMsgAutoDownloadImgLogic", "updateStatus download fail %d", Long.valueOf(b002.getMsgId()));
                        C99129c cVar7 = (C99129c) C86312j.m106911c(cls);
                        cVar7.requireAccountInitialized();
                        cVar7.f290661n.mo129630f(b002.getMsgId(), 4);
                    }
                    C117407d.INSTANCE.idkeyStat(957, 32, 1, false);
                }
            }
        }
    }

    /* renamed from: ke2.e$e */
    public class C99140e extends C102838a {

        /* renamed from: d */
        public C72963f4 f290692d;

        /* renamed from: e */
        public boolean f290693e;

        public C99140e(C99135e eVar, C72963f4 f4Var, boolean z) {
            this.f290692d = f4Var;
            this.f290693e = z;
        }

        /* renamed from: a */
        public String mo129622a() {
            return "Priority.onC2CImgOpenTask";
        }

        public void run() {
            int i;
            Class cls = C99129c.class;
            long createTime = this.f290692d.getCreateTime();
            C99129c cVar = (C99129c) C86312j.m106911c(cls);
            cVar.requireAccountInitialized();
            int i2 = 1;
            if (createTime <= cVar.f290659i) {
                Log.m105925i("MicroMsg.Priority.PriorityService", "onC2CImgOpen time condition not support %s", C72715f.m85111d(TimeUtil.YYYY2MM2DD_HH1MM1SS, this.f290692d.getCreateTime() / 1000));
                return;
            }
            C99129c cVar2 = (C99129c) C86312j.m106911c(cls);
            cVar2.requireAccountInitialized();
            if (cVar2.f290668u != null) {
                C99129c cVar3 = (C99129c) C86312j.m106911c(cls);
                cVar3.requireAccountInitialized();
                C94292a aVar = cVar3.f290668u;
                C72963f4 f4Var = this.f290692d;
                boolean z = this.f290693e;
                aVar.getClass();
                C117407d dVar = C117407d.INSTANCE;
                dVar.idkeyStat(957, 10, 1, false);
                C99129c cVar4 = (C99129c) C86312j.m106911c(cls);
                cVar4.requireAccountInitialized();
                C101831q8 c = cVar4.f290661n.mo129627c(f4Var.getMsgId());
                if (f4Var.mo108769t2() != 1) {
                    C100786f.m131975f(f4Var, z);
                    if (c == null) {
                        Log.m105924i("MicroMsg.Priority.C2CMsgAutoDownloadImgLogic", "This Image Sender is Me");
                        dVar.idkeyStat(957, 13, 1, false);
                    } else if (c.f299207q > 0) {
                        Log.m105925i("MicroMsg.Priority.C2CMsgAutoDownloadImgLogic", "onImgOpen img already use %d", Long.valueOf(f4Var.getMsgId()));
                    } else {
                        c.f299207q = System.currentTimeMillis();
                        C99129c cVar5 = (C99129c) C86312j.m106911c(cls);
                        cVar5.requireAccountInitialized();
                        C94293b bVar = cVar5.f290661n;
                        long msgId = f4Var.getMsgId();
                        long j = c.f299207q;
                        bVar.f272428h.bindLong(1, j);
                        bVar.f272428h.bindLong(2, msgId);
                        Log.m105925i("MicroMsg.Priority.C2CMsgAutoDownloadImgStorage", "updateOpenTime %d res %d %d", Integer.valueOf(bVar.f272428h.executeUpdateDelete()), Long.valueOf(msgId), Long.valueOf(j));
                        if (C72996z1.m85820U5(f4Var.mo108768t())) {
                            C99129c cVar6 = (C99129c) C86312j.m106911c(cls);
                            cVar6.requireAccountInitialized();
                            cVar6.f290663p.mo140567m(c.f299198e, "@all");
                        }
                        C99129c cVar7 = (C99129c) C86312j.m106911c(cls);
                        cVar7.requireAccountInitialized();
                        cVar7.f290663p.mo140567m(c.f299198e, c.f299199f);
                        int i3 = c.f299203j;
                        if (i3 == 3) {
                            i = 2;
                            dVar.idkeyStat(957, 14, 1, false);
                        } else {
                            i = 2;
                            if (i3 == 2) {
                                dVar.idkeyStat(957, 16, 1, false);
                                i2 = 3;
                            } else if (i3 == 4) {
                                dVar.idkeyStat(957, 17, 1, false);
                                i2 = 4;
                            } else if (i3 == 5) {
                                dVar.idkeyStat(957, 18, 1, false);
                                i2 = 5;
                            } else {
                                dVar.idkeyStat(957, 15, 1, false);
                                i2 = 2;
                            }
                        }
                        C100786f.m131972c(i, c.f299207q, i2, c);
                    }
                }
            }
        }
    }

    /* renamed from: ke2.e$f */
    public class C99141f extends C102838a {

        /* renamed from: d */
        public C72963f4 f290694d;

        /* renamed from: e */
        public WeakReference<Runnable> f290695e;

        public C99141f(C99135e eVar, C72963f4 f4Var, WeakReference<Runnable> weakReference) {
            this.f290694d = f4Var;
            this.f290695e = weakReference;
        }

        /* renamed from: a */
        public String mo129622a() {
            return "Priority.onC2CImgScrollTask";
        }

        public void run() {
            Class cls = C99129c.class;
            long createTime = this.f290694d.getCreateTime();
            C99129c cVar = (C99129c) C86312j.m106911c(cls);
            cVar.requireAccountInitialized();
            if (createTime <= cVar.f290659i) {
                Log.m105925i("MicroMsg.Priority.PriorityService", "onC2CImgScroll time condition not support %s", C72715f.m85111d(TimeUtil.YYYY2MM2DD_HH1MM1SS, this.f290694d.getCreateTime() / 1000));
                return;
            }
            Log.m105925i("MicroMsg.Priority.PriorityService", "C2CImgScrollTask Start To Auto Download %d MsgId %d", 32, Long.valueOf(this.f290694d.getMsgId()));
            if (this.f290695e.get() != null) {
                C99129c cVar2 = (C99129c) C86312j.m106911c(cls);
                cVar2.requireAccountInitialized();
                C101831q8 c = cVar2.f290661n.mo129627c(this.f290694d.getMsgId());
                if (c != null && c.f299203j == 1) {
                    C100786f.m131977h(c, this.f290694d);
                }
                this.f290695e.get().run();
            }
            C99129c cVar3 = (C99129c) C86312j.m106911c(cls);
            cVar3.requireAccountInitialized();
            C94292a aVar = cVar3.f290668u;
            C72963f4 f4Var = this.f290694d;
            aVar.getClass();
            C99129c cVar4 = (C99129c) C86312j.m106911c(cls);
            cVar4.requireAccountInitialized();
            C101831q8 c2 = cVar4.f290661n.mo129627c(f4Var.getMsgId());
            if (c2 == null) {
                Log.m105924i("MicroMsg.Priority.C2CMsgAutoDownloadImgLogic", "This Image Sender is Me");
            } else if (c2.f299203j == 1) {
                C99129c cVar5 = (C99129c) C86312j.m106911c(cls);
                cVar5.requireAccountInitialized();
                cVar5.f290661n.mo129631g(f4Var.getMsgId(), 32, 2);
            }
        }
    }

    /* renamed from: ke2.e$g */
    public class C99142g extends C102838a {

        /* renamed from: d */
        public String f290696d;

        /* renamed from: e */
        public int f290697e;

        public C99142g(C99135e eVar, String str, int i) {
            this.f290696d = str;
            this.f290697e = i;
        }

        /* renamed from: a */
        public String mo129622a() {
            return "Priority.C2CMsgConsumeTask";
        }

        public void run() {
            Class cls = C99129c.class;
            C99129c cVar = (C99129c) C86312j.m106911c(cls);
            cVar.requireAccountInitialized();
            if (cVar.f290670w != null) {
                C99129c cVar2 = (C99129c) C86312j.m106911c(cls);
                cVar2.requireAccountInitialized();
                C101371a aVar = cVar2.f290670w;
                String str = this.f290696d;
                int i = this.f290697e;
                aVar.getClass();
                C99129c cVar3 = (C99129c) C86312j.m106911c(cls);
                cVar3.requireAccountInitialized();
                cVar3.f290667t.mo140229a(new C101371a.C101372a(aVar, str, 2, i));
            }
        }
    }

    /* renamed from: Ez */
    public void mo137965Ez(long j, boolean z, boolean z2) {
        Class cls = C99129c.class;
        if (C86709a0.m107522a()) {
            C99129c cVar = (C99129c) C86312j.m106911c(cls);
            cVar.requireAccountInitialized();
            if (cVar.f290667t != null) {
                C99129c cVar2 = (C99129c) C86312j.m106911c(cls);
                cVar2.requireAccountInitialized();
                cVar2.f290667t.mo140229a(new C99139d(this, j, z, z2));
            }
        }
    }

    public void Fn0(String str, long j, boolean z) {
        Class cls = C99129c.class;
        if (!C86709a0.m107522a()) {
            return;
        }
        if (str.matches("\\d+")) {
            C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(Long.parseLong(str));
            if (b002.getMsgId() != 0 && b002.mo108769t2() == 0) {
                if (C101750g.f297828a.mo141183c(4, b002.mo108768t()) == 0) {
                    C99129c cVar = (C99129c) C86312j.m106911c(cls);
                    cVar.requireAccountInitialized();
                    if (cVar.f290667t != null) {
                        C99129c cVar2 = (C99129c) C86312j.m106911c(cls);
                        cVar2.requireAccountInitialized();
                        cVar2.f290667t.mo140229a(new C99137b(this, str, j, z));
                        return;
                    }
                    return;
                }
                ((C99129c) C86312j.m106911c(cls)).Bx0().getClass();
                C99129c cVar3 = (C99129c) C86312j.m106911c(cls);
                cVar3.requireAccountInitialized();
                cVar3.f290673z.mo142288e3(b002.mo108774y2() + "_4");
                C100786f.m131974e(b002);
                Log.m105924i("MicroMsg.C2CPreDownloadPLC", "c2c pre download: file msg open, msgId:" + b002.getMsgId());
                return;
            }
            return;
        }
        C99129c cVar4 = (C99129c) C86312j.m106911c(cls);
        cVar4.requireAccountInitialized();
        if (cVar4.f290667t != null) {
            C99129c cVar5 = (C99129c) C86312j.m106911c(cls);
            cVar5.requireAccountInitialized();
            cVar5.f290667t.mo140229a(new C99137b(this, str, j, z));
        }
    }

    /* renamed from: Gh */
    public void mo137967Gh(C72963f4 f4Var, boolean z) {
        Class cls = C99129c.class;
        if (!C86709a0.m107522a()) {
            return;
        }
        if (C101750g.f297828a.mo141183c(1, f4Var.mo108768t()) == 0) {
            C99129c cVar = (C99129c) C86312j.m106911c(cls);
            cVar.requireAccountInitialized();
            if (cVar.f290667t != null) {
                C99129c cVar2 = (C99129c) C86312j.m106911c(cls);
                cVar2.requireAccountInitialized();
                cVar2.f290667t.mo140229a(new C99140e(this, f4Var, z));
            }
        } else if (f4Var.getMsgId() > 0 && f4Var.mo108769t2() == 0) {
            ((C99129c) C86312j.m106911c(cls)).Bx0().getClass();
            ((C119157j) C119157j.f356862d).mo183875f(new C101744a(f4Var, z));
        }
    }

    public void Gr0(String str) {
        rt0(str, 1);
    }

    /* renamed from: Iq */
    public List<Pair<String, String>> mo137969Iq(long j) {
        C99129c cVar = (C99129c) C86312j.m106911c(C99129c.class);
        cVar.requireAccountInitialized();
        return cVar.f290664q.mo140563i(j);
    }

    /* renamed from: Rf */
    public List<Pair<String, String>> mo137970Rf(long j) {
        new C102840c().run();
        C99129c cVar = (C99129c) C86312j.m106911c(C99129c.class);
        cVar.requireAccountInitialized();
        C101373b bVar = cVar.f290666s;
        bVar.getClass();
        Cursor h = bVar.f296950a.mo140226h(String.format("SELECT chat, openrmf, staytimedev, sendmsgrmf, consumemsgrmf, totallsp, rank FROM %s ORDER BY totallsp DESC;", new Object[]{"C2CChatUsageResult"}), (String[]) null);
        ArrayList arrayList = new ArrayList();
        while (h.moveToNext()) {
            try {
                arrayList.add(new Pair(h.getString(0), String.format("open %.2f stay: %.2f send: %.2f consume: %.2f\ntotal: %.2f rank: %d", new Object[]{Double.valueOf(h.getDouble(1)), Double.valueOf(h.getDouble(2)), Double.valueOf(h.getDouble(3)), Double.valueOf(h.getDouble(4)), Double.valueOf(h.getDouble(5)), Integer.valueOf(h.getInt(6))})));
            } catch (Throwable th) {
                if (h != null) {
                    h.close();
                }
                throw th;
            }
        }
        h.close();
        return arrayList;
    }

    public void e20(C72963f4 f4Var) {
        Class cls = C99129c.class;
        if (f4Var != null && f4Var.getMsgId() > 0 && f4Var.mo108769t2() == 0 && ((C99129c) C86312j.m106911c(cls)).Bx0() != null) {
            ((C99129c) C86312j.m106911c(cls)).Bx0().getClass();
            C99129c cVar = (C99129c) C86312j.m106911c(cls);
            cVar.requireAccountInitialized();
            cVar.f290673z.mo142288e3(f4Var.mo108774y2() + "_3");
            C99129c cVar2 = (C99129c) C86312j.m106911c(cls);
            cVar2.requireAccountInitialized();
            cVar2.f290655A.mo129636e(f4Var.getMsgId(), 3, f4Var.mo108774y2());
            Log.m105924i("MicroMsg.C2CPreDownloadPLC", "c2c pre download: video msg open, msgId:" + f4Var.getMsgId());
        }
    }

    /* renamed from: lk */
    public void mo137972lk(C72963f4 f4Var) {
        Class cls = C99129c.class;
        if (C86709a0.m107522a()) {
            C99129c cVar = (C99129c) C86312j.m106911c(cls);
            cVar.requireAccountInitialized();
            if (cVar.f290667t != null) {
                C99129c cVar2 = (C99129c) C86312j.m106911c(cls);
                cVar2.requireAccountInitialized();
                cVar2.f290667t.mo140229a(new C102839b(f4Var));
            }
        }
    }

    /* renamed from: qz */
    public void mo137973qz(C72963f4 f4Var, Runnable runnable) {
        Class cls = C99129c.class;
        if (!C86709a0.m107522a()) {
            return;
        }
        if (C101750g.f297828a.mo141183c(1, f4Var.mo108768t()) == 0) {
            boolean a = C34823a.m40471a();
            C99129c cVar = (C99129c) C86312j.m106911c(cls);
            cVar.requireAccountInitialized();
            if (cVar.f290667t == null) {
                return;
            }
            if (f4Var.f230734R == 1 || (a && ((C98950b) C86312j.m106911c(C98950b.class)).mo59099GX(f4Var))) {
                C99129c cVar2 = (C99129c) C86312j.m106911c(cls);
                cVar2.requireAccountInitialized();
                cVar2.f290667t.mo140229a(new C99141f(this, f4Var, new WeakReference(runnable)));
            }
        } else if (((C99129c) C86312j.m106911c(cls)).Bx0() != null) {
            ((C99129c) C86312j.m106911c(cls)).Bx0().getClass();
            ((C119157j) C119157j.f356862d).mo183875f(new C101745b(f4Var));
        }
    }

    public void rt0(String str, int i) {
        Class cls = C99129c.class;
        if (C86709a0.m107522a()) {
            C99129c cVar = (C99129c) C86312j.m106911c(cls);
            cVar.requireAccountInitialized();
            if (cVar.f290667t != null) {
                C99129c cVar2 = (C99129c) C86312j.m106911c(cls);
                cVar2.requireAccountInitialized();
                cVar2.f290667t.mo140229a(new C99142g(this, str, i));
            }
        }
    }

    /* renamed from: se */
    public void mo137975se(boolean z, String str, long j, boolean z2, boolean z3) {
        Class cls = C99129c.class;
        if (C86709a0.m107522a()) {
            String str2 = str;
            if (str.matches("\\d+")) {
                if (C101750g.f297828a.mo141183c(4, ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(Long.parseLong(str)).mo108768t()) == 0) {
                    C99129c cVar = (C99129c) C86312j.m106911c(cls);
                    cVar.requireAccountInitialized();
                    if (cVar.f290667t != null) {
                        C99129c cVar2 = (C99129c) C86312j.m106911c(cls);
                        cVar2.requireAccountInitialized();
                        cVar2.f290667t.mo140229a(new C99136a(this, z, str, j, z2, z3));
                    }
                } else if (!z && z2 && ((C99129c) C86312j.m106911c(cls)).Bx0() != null) {
                    ((C99129c) C86312j.m106911c(cls)).Bx0().mo141174g3(String.format("%s_%s", new Object[]{Long.valueOf(j), 4}));
                }
            } else {
                C99129c cVar3 = (C99129c) C86312j.m106911c(cls);
                cVar3.requireAccountInitialized();
                if (cVar3.f290667t != null) {
                    C99129c cVar4 = (C99129c) C86312j.m106911c(cls);
                    cVar4.requireAccountInitialized();
                    cVar4.f290667t.mo140229a(new C99136a(this, z, str, j, z2, z3));
                }
            }
        }
    }

    /* renamed from: tH */
    public void mo137976tH(C72963f4 f4Var) {
        Class cls = C99129c.class;
        if (C86709a0.m107522a()) {
            C99129c cVar = (C99129c) C86312j.m106911c(cls);
            cVar.requireAccountInitialized();
            if (cVar.f290667t != null) {
                C99129c cVar2 = (C99129c) C86312j.m106911c(cls);
                cVar2.requireAccountInitialized();
                cVar2.f290667t.mo140229a(new C99138c(this, f4Var));
            }
        }
    }

    /* renamed from: wH */
    public List<Pair<String, String>> mo137977wH(long j) {
        C99129c cVar = (C99129c) C86312j.m106911c(C99129c.class);
        cVar.requireAccountInitialized();
        return cVar.f290663p.mo140563i(j);
    }
}
