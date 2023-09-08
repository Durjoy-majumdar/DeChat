package p1222y4;

import androidx.work.C113041b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import p1014o4.C117682c;
import p1014o4.C117693m;
import p1014o4.C117696p;
import p1206p4.C117970c;
import p1206p4.C117974f;
import p1206p4.C117975g;
import p1206p4.C117979k;
import p1221x4.C118847o;

/* renamed from: y4.e */
public class C118920e implements Runnable {

    /* renamed from: f */
    public static final String f356198f = C117693m.m165967e("EnqueueRunnable");

    /* renamed from: d */
    public final C117975g f356199d;

    /* renamed from: e */
    public final C117970c f356200e = new C117970c();

    public C118920e(C117975g gVar) {
        this.f356199d = gVar;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r0v30, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0225  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m167675a(p1206p4.C117975g r27) {
        /*
            r0 = r27
            java.util.List<p4.g> r1 = r0.f352595g
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0041
            java.util.Iterator r1 = r1.iterator()
            r4 = 0
        L_0x000d:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0042
            java.lang.Object r5 = r1.next()
            p4.g r5 = (p1206p4.C117975g) r5
            boolean r6 = r5.f352596h
            if (r6 != 0) goto L_0x0023
            boolean r5 = m167675a(r5)
            r4 = r4 | r5
            goto L_0x000d
        L_0x0023:
            o4.m r6 = p1014o4.C117693m.m165966c()
            java.lang.String r7 = f356198f
            java.lang.Object[] r8 = new java.lang.Object[r2]
            java.util.List<java.lang.String> r5 = r5.f352593e
            java.lang.String r9 = ", "
            java.lang.String r5 = android.text.TextUtils.join(r9, r5)
            r8[r3] = r5
            java.lang.String r5 = "Already enqueued work ids (%s)."
            java.lang.String r5 = java.lang.String.format(r5, r8)
            java.lang.Throwable[] r8 = new java.lang.Throwable[r3]
            r6.mo182392f(r7, r5, r8)
            goto L_0x000d
        L_0x0041:
            r4 = 0
        L_0x0042:
            java.util.Set r1 = p1206p4.C117975g.m166382b(r27)
            p4.k r5 = r0.f352589a
            java.util.List<? extends o4.w> r6 = r0.f352592d
            java.lang.String[] r7 = new java.lang.String[r3]
            java.lang.Object[] r1 = r1.toArray(r7)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.lang.String r7 = r0.f352590b
            o4.e r8 = r0.f352591c
            o4.u r9 = p1014o4.C117705u.ENQUEUED
            o4.e r10 = p1014o4.C117686e.APPEND_OR_REPLACE
            o4.u r11 = p1014o4.C117705u.SUCCEEDED
            o4.u r12 = p1014o4.C117705u.CANCELLED
            o4.u r13 = p1014o4.C117705u.FAILED
            long r14 = java.lang.System.currentTimeMillis()
            androidx.work.impl.WorkDatabase r3 = r5.f352606c
            if (r1 == 0) goto L_0x006d
            int r2 = r1.length
            if (r2 <= 0) goto L_0x006d
            r2 = 1
            goto L_0x006e
        L_0x006d:
            r2 = 0
        L_0x006e:
            if (r2 == 0) goto L_0x00c5
            r17 = r4
            int r4 = r1.length
            r0 = 0
            r18 = 0
            r19 = 0
            r20 = 1
        L_0x007a:
            if (r0 >= r4) goto L_0x00c2
            r21 = r4
            r4 = r1[r0]
            x4.p r22 = r3.mo165532n()
            r23 = r14
            r14 = r22
            x4.q r14 = (p1221x4.C118850q) r14
            x4.o r14 = r14.mo183560i(r4)
            if (r14 != 0) goto L_0x00a9
            o4.m r0 = p1014o4.C117693m.m165966c()
            java.lang.String r1 = f356198f
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r2 = 0
            r3[r2] = r4
            java.lang.String r4 = "Prerequisite %s doesn't exist; not enqueuing"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r2]
            r0.mo182390b(r1, r3, r4)
            goto L_0x0113
        L_0x00a9:
            o4.u r4 = r14.f355542b
            if (r4 != r11) goto L_0x00af
            r14 = 1
            goto L_0x00b0
        L_0x00af:
            r14 = 0
        L_0x00b0:
            r20 = r20 & r14
            if (r4 != r13) goto L_0x00b7
            r19 = 1
            goto L_0x00bb
        L_0x00b7:
            if (r4 != r12) goto L_0x00bb
            r18 = 1
        L_0x00bb:
            int r0 = r0 + 1
            r4 = r21
            r14 = r23
            goto L_0x007a
        L_0x00c2:
            r23 = r14
            goto L_0x00cf
        L_0x00c5:
            r17 = r4
            r23 = r14
            r18 = 0
            r19 = 0
            r20 = 1
        L_0x00cf:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r4 = 1
            r0 = r0 ^ r4
            if (r0 == 0) goto L_0x00db
            if (r2 != 0) goto L_0x00db
            r4 = 1
            goto L_0x00dc
        L_0x00db:
            r4 = 0
        L_0x00dc:
            if (r4 == 0) goto L_0x0215
            x4.p r4 = r3.mo165532n()
            x4.q r4 = (p1221x4.C118850q) r4
            java.util.List r4 = r4.mo183561j(r7)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            boolean r14 = r4.isEmpty()
            if (r14 != 0) goto L_0x0215
            o4.e r14 = p1014o4.C117686e.APPEND
            if (r8 == r14) goto L_0x0147
            if (r8 != r10) goto L_0x00f7
            goto L_0x0147
        L_0x00f7:
            o4.e r10 = p1014o4.C117686e.KEEP
            if (r8 != r10) goto L_0x0119
            java.util.Iterator r8 = r4.iterator()
        L_0x00ff:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x0119
            java.lang.Object r10 = r8.next()
            x4.o$a r10 = (p1221x4.C118847o.C118848a) r10
            o4.u r10 = r10.f355560b
            if (r10 == r9) goto L_0x0113
            o4.u r11 = p1014o4.C117705u.RUNNING
            if (r10 != r11) goto L_0x00ff
        L_0x0113:
            r1 = 1
            r3 = 0
        L_0x0115:
            r0 = r27
            goto L_0x038f
        L_0x0119:
            y4.c r8 = new y4.c
            r10 = 0
            r8.<init>(r5, r7, r10)
            r8.run()
            x4.p r8 = r3.mo165532n()
            java.util.Iterator r4 = r4.iterator()
        L_0x012a:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L_0x013f
            java.lang.Object r10 = r4.next()
            x4.o$a r10 = (p1221x4.C118847o.C118848a) r10
            java.lang.String r10 = r10.f355559a
            r11 = r8
            x4.q r11 = (p1221x4.C118850q) r11
            r11.mo183552a(r10)
            goto L_0x012a
        L_0x013f:
            r22 = r0
            r26 = r9
            r0 = 1
            r9 = 0
            goto L_0x021b
        L_0x0147:
            x4.b r2 = r3.mo165527i()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0154:
            boolean r15 = r4.hasNext()
            if (r15 == 0) goto L_0x01ce
            java.lang.Object r15 = r4.next()
            x4.o$a r15 = (p1221x4.C118847o.C118848a) r15
            r21 = r4
            java.lang.String r4 = r15.f355559a
            r22 = r0
            r0 = r2
            x4.c r0 = (p1221x4.C118828c) r0
            r0.getClass()
            r25 = r2
            java.lang.String r2 = "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?"
            r26 = r9
            r9 = 1
            z3.i r2 = p1223z3.C119046i.m167801c(r2, r9)
            if (r4 != 0) goto L_0x017d
            r2.bindNull(r9)
            goto L_0x0180
        L_0x017d:
            r2.bindString(r9, r4)
        L_0x0180:
            z3.g r4 = r0.f355523a
            r4.mo183702b()
            z3.g r0 = r0.f355523a
            r4 = 0
            r9 = 0
            android.database.Cursor r4 = p452b4.C113140c.m154797a(r0, r2, r9, r4)
            boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x01c6 }
            if (r0 == 0) goto L_0x019b
            int r0 = r4.getInt(r9)     // Catch:{ all -> 0x01c6 }
            if (r0 == 0) goto L_0x019b
            r0 = 1
            goto L_0x019c
        L_0x019b:
            r0 = 0
        L_0x019c:
            r4.close()
            r2.mo183710d()
            if (r0 != 0) goto L_0x01bd
            o4.u r0 = r15.f355560b
            if (r0 != r11) goto L_0x01aa
            r2 = 1
            goto L_0x01ab
        L_0x01aa:
            r2 = 0
        L_0x01ab:
            r2 = r20 & r2
            if (r0 != r13) goto L_0x01b2
            r19 = 1
            goto L_0x01b6
        L_0x01b2:
            if (r0 != r12) goto L_0x01b6
            r18 = 1
        L_0x01b6:
            java.lang.String r0 = r15.f355559a
            r14.add(r0)
            r20 = r2
        L_0x01bd:
            r4 = r21
            r0 = r22
            r2 = r25
            r9 = r26
            goto L_0x0154
        L_0x01c6:
            r0 = move-exception
            r4.close()
            r2.mo183710d()
            throw r0
        L_0x01ce:
            r22 = r0
            r26 = r9
            r9 = 0
            if (r8 != r10) goto L_0x0203
            if (r18 != 0) goto L_0x01d9
            if (r19 == 0) goto L_0x0203
        L_0x01d9:
            x4.p r0 = r3.mo165532n()
            x4.q r0 = (p1221x4.C118850q) r0
            java.util.List r2 = r0.mo183561j(r7)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x01e9:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x01fb
            java.lang.Object r4 = r2.next()
            x4.o$a r4 = (p1221x4.C118847o.C118848a) r4
            java.lang.String r4 = r4.f355559a
            r0.mo183552a(r4)
            goto L_0x01e9
        L_0x01fb:
            java.util.List r14 = java.util.Collections.emptyList()
            r2 = 0
            r19 = 0
            goto L_0x0205
        L_0x0203:
            r2 = r18
        L_0x0205:
            java.lang.Object[] r0 = r14.toArray(r1)
            r1 = r0
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r0 = r1.length
            r18 = r2
            if (r0 <= 0) goto L_0x0213
            r2 = 1
            goto L_0x021a
        L_0x0213:
            r2 = 0
            goto L_0x021a
        L_0x0215:
            r22 = r0
            r26 = r9
            r9 = 0
        L_0x021a:
            r0 = 0
        L_0x021b:
            java.util.Iterator r4 = r6.iterator()
        L_0x021f:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x038b
            java.lang.Object r6 = r4.next()
            o4.w r6 = (p1014o4.C100281w) r6
            x4.o r8 = r6.f293787b
            if (r2 == 0) goto L_0x0242
            if (r20 != 0) goto L_0x0242
            if (r19 == 0) goto L_0x0236
            r8.f355542b = r13
            goto L_0x023f
        L_0x0236:
            if (r18 == 0) goto L_0x023b
            r8.f355542b = r12
            goto L_0x023f
        L_0x023b:
            o4.u r10 = p1014o4.C117705u.BLOCKED
            r8.f355542b = r10
        L_0x023f:
            r10 = r23
            goto L_0x0253
        L_0x0242:
            boolean r10 = r8.mo183546c()
            if (r10 != 0) goto L_0x024d
            r10 = r23
            r8.f355554n = r10
            goto L_0x0253
        L_0x024d:
            r10 = r23
            r14 = 0
            r8.f355554n = r14
        L_0x0253:
            int r14 = android.os.Build.VERSION.SDK_INT
            r15 = 23
            if (r14 < r15) goto L_0x0261
            r15 = 25
            if (r14 > r15) goto L_0x0261
            m167676b(r8)
            goto L_0x0292
        L_0x0261:
            r15 = 22
            if (r14 > r15) goto L_0x0292
            java.lang.String r14 = "androidx.work.impl.background.gcm.GcmScheduler"
            java.lang.Class r14 = java.lang.Class.forName(r14)     // Catch:{ ClassNotFoundException -> 0x028b }
            java.util.List<p4.e> r15 = r5.f352608e     // Catch:{ ClassNotFoundException -> 0x028b }
            java.util.Iterator r15 = r15.iterator()     // Catch:{ ClassNotFoundException -> 0x028b }
        L_0x0271:
            boolean r16 = r15.hasNext()     // Catch:{ ClassNotFoundException -> 0x028b }
            if (r16 == 0) goto L_0x028c
            java.lang.Object r16 = r15.next()     // Catch:{ ClassNotFoundException -> 0x028b }
            p4.e r16 = (p1206p4.C117973e) r16     // Catch:{ ClassNotFoundException -> 0x028b }
            java.lang.Class r9 = r16.getClass()     // Catch:{ ClassNotFoundException -> 0x028b }
            boolean r9 = r14.isAssignableFrom(r9)     // Catch:{ ClassNotFoundException -> 0x028b }
            if (r9 == 0) goto L_0x0289
            r9 = 1
            goto L_0x028d
        L_0x0289:
            r9 = 0
            goto L_0x0271
        L_0x028b:
        L_0x028c:
            r9 = 0
        L_0x028d:
            if (r9 == 0) goto L_0x0292
            m167676b(r8)
        L_0x0292:
            o4.u r9 = r8.f355542b
            r14 = r26
            if (r9 != r14) goto L_0x0299
            r0 = 1
        L_0x0299:
            x4.p r9 = r3.mo165532n()
            x4.q r9 = (p1221x4.C118850q) r9
            z3.g r15 = r9.f355561a
            r15.mo183702b()
            z3.g r15 = r9.f355561a
            r15.mo183703c()
            z3.b<x4.o> r15 = r9.f355562b     // Catch:{ all -> 0x0384 }
            r15.mo183689e(r8)     // Catch:{ all -> 0x0384 }
            z3.g r8 = r9.f355561a     // Catch:{ all -> 0x0384 }
            r8.mo183706h()     // Catch:{ all -> 0x0384 }
            z3.g r8 = r9.f355561a
            r8.mo183704f()
            if (r2 == 0) goto L_0x02fc
            int r8 = r1.length
            r9 = 0
        L_0x02bc:
            if (r9 >= r8) goto L_0x02fc
            r15 = r1[r9]
            r16 = r0
            x4.a r0 = new x4.a
            r23 = r1
            java.util.UUID r1 = r6.f293786a
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r15)
            x4.b r1 = r3.mo165527i()
            x4.c r1 = (p1221x4.C118828c) r1
            z3.g r15 = r1.f355523a
            r15.mo183702b()
            z3.g r15 = r1.f355523a
            r15.mo183703c()
            z3.b<x4.a> r15 = r1.f355524b     // Catch:{ all -> 0x02f5 }
            r15.mo183689e(r0)     // Catch:{ all -> 0x02f5 }
            z3.g r0 = r1.f355523a     // Catch:{ all -> 0x02f5 }
            r0.mo183706h()     // Catch:{ all -> 0x02f5 }
            z3.g r0 = r1.f355523a
            r0.mo183704f()
            int r9 = r9 + 1
            r0 = r16
            r1 = r23
            goto L_0x02bc
        L_0x02f5:
            r0 = move-exception
            z3.g r1 = r1.f355523a
            r1.mo183704f()
            throw r0
        L_0x02fc:
            r16 = r0
            r23 = r1
            java.util.Set<java.lang.String> r0 = r6.f293788c
            java.util.Iterator r0 = r0.iterator()
        L_0x0306:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0344
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            x4.s r8 = r3.mo165533o()
            x4.r r9 = new x4.r
            java.util.UUID r15 = r6.f293786a
            java.lang.String r15 = r15.toString()
            r9.<init>(r1, r15)
            x4.t r8 = (p1221x4.C118861t) r8
            z3.g r1 = r8.f355572a
            r1.mo183702b()
            z3.g r1 = r8.f355572a
            r1.mo183703c()
            z3.b<x4.r> r1 = r8.f355573b     // Catch:{ all -> 0x033d }
            r1.mo183689e(r9)     // Catch:{ all -> 0x033d }
            z3.g r1 = r8.f355572a     // Catch:{ all -> 0x033d }
            r1.mo183706h()     // Catch:{ all -> 0x033d }
            z3.g r1 = r8.f355572a
            r1.mo183704f()
            goto L_0x0306
        L_0x033d:
            r0 = move-exception
            z3.g r1 = r8.f355572a
            r1.mo183704f()
            throw r0
        L_0x0344:
            if (r22 == 0) goto L_0x0379
            x4.k r0 = r3.mo165530l()
            x4.j r1 = new x4.j
            java.util.UUID r6 = r6.f293786a
            java.lang.String r6 = r6.toString()
            r1.<init>(r7, r6)
            r6 = r0
            x4.l r6 = (p1221x4.C118841l) r6
            z3.g r0 = r6.f355536a
            r0.mo183702b()
            z3.g r0 = r6.f355536a
            r0.mo183703c()
            z3.b<x4.j> r0 = r6.f355537b     // Catch:{ all -> 0x0372 }
            r0.mo183689e(r1)     // Catch:{ all -> 0x0372 }
            z3.g r0 = r6.f355536a     // Catch:{ all -> 0x0372 }
            r0.mo183706h()     // Catch:{ all -> 0x0372 }
            z3.g r0 = r6.f355536a
            r0.mo183704f()
            goto L_0x0379
        L_0x0372:
            r0 = move-exception
            z3.g r1 = r6.f355536a
            r1.mo183704f()
            throw r0
        L_0x0379:
            r26 = r14
            r0 = r16
            r1 = r23
            r9 = 0
            r23 = r10
            goto L_0x021f
        L_0x0384:
            r0 = move-exception
            z3.g r1 = r9.f355561a
            r1.mo183704f()
            throw r0
        L_0x038b:
            r1 = 1
            r3 = r0
            goto L_0x0115
        L_0x038f:
            r0.f352596h = r1
            r0 = r17 | r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1222y4.C118920e.m167675a(p4.g):boolean");
    }

    /* renamed from: b */
    public static void m167676b(C118847o oVar) {
        Class<ConstraintTrackingWorker> cls = ConstraintTrackingWorker.class;
        C117682c cVar = oVar.f355550j;
        String str = oVar.f355543c;
        if (str.equals(cls.getName())) {
            return;
        }
        if (cVar.f351998d || cVar.f351999e) {
            C113041b.C113042a aVar = new C113041b.C113042a();
            aVar.mo165526a(oVar.f355545e.f338353a);
            ((HashMap) aVar.f338354a).put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            oVar.f355543c = cls.getName();
            C113041b bVar = new C113041b((Map<String, ?>) aVar.f338354a);
            C113041b.m154668c(bVar);
            oVar.f355545e = bVar;
        }
    }

    public void run() {
        WorkDatabase workDatabase;
        try {
            C117975g gVar = this.f356199d;
            gVar.getClass();
            if (!C117975g.m166381a(gVar, new HashSet())) {
                workDatabase = this.f356199d.f352589a.f352606c;
                workDatabase.mo183703c();
                boolean a = m167675a(this.f356199d);
                workDatabase.mo183706h();
                workDatabase.mo183704f();
                if (a) {
                    C118922g.m167677a(this.f356199d.f352589a.f352604a, RescheduleReceiver.class, true);
                    C117979k kVar = this.f356199d.f352589a;
                    C117974f.m166380a(kVar.f352605b, kVar.f352606c, kVar.f352608e);
                }
                this.f356200e.mo182721a(C117696p.f352024a);
                return;
            }
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", new Object[]{this.f356199d}));
        } catch (Throwable th) {
            this.f356200e.mo182721a(new C117696p.C117698b.C117699a(th));
        }
    }
}
