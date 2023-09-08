package p1206p4;

import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.work.C113038a;
import androidx.work.C113041b;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p1014o4.C117693m;
import p1014o4.C117705u;
import p1160w4.C118739a;
import p1167z8.C112608f;
import p1169a5.C112757a;
import p1221x4.C118827b;
import p1221x4.C118828c;
import p1221x4.C118844n;
import p1221x4.C118847o;
import p1221x4.C118849p;
import p1221x4.C118850q;
import p1221x4.C118860s;
import p1222y4.C118922g;
import p1223z3.C119046i;
import p283z4.C119060c;
import p452b4.C113140c;

/* renamed from: p4.n */
public class C117982n implements Runnable {

    /* renamed from: z */
    public static final String f352619z = C117693m.m165967e("WorkerWrapper");

    /* renamed from: d */
    public Context f352620d;

    /* renamed from: e */
    public String f352621e;

    /* renamed from: f */
    public List<C117973e> f352622f;

    /* renamed from: g */
    public WorkerParameters.C113037a f352623g;

    /* renamed from: h */
    public C118847o f352624h;

    /* renamed from: i */
    public ListenableWorker f352625i;

    /* renamed from: j */
    public C112757a f352626j;

    /* renamed from: n */
    public ListenableWorker.C113032a f352627n = new ListenableWorker.C113032a.C113033a();

    /* renamed from: o */
    public C113038a f352628o;

    /* renamed from: p */
    public C118739a f352629p;

    /* renamed from: q */
    public WorkDatabase f352630q;

    /* renamed from: r */
    public C118849p f352631r;

    /* renamed from: s */
    public C118827b f352632s;

    /* renamed from: t */
    public C118860s f352633t;

    /* renamed from: u */
    public List<String> f352634u;

    /* renamed from: v */
    public String f352635v;

    /* renamed from: w */
    public C119060c<Boolean> f352636w = new C119060c<>();

    /* renamed from: x */
    public C112608f<ListenableWorker.C113032a> f352637x = null;

    /* renamed from: y */
    public volatile boolean f352638y;

    /* renamed from: p4.n$a */
    public static class C117983a {

        /* renamed from: a */
        public Context f352639a;

        /* renamed from: b */
        public C118739a f352640b;

        /* renamed from: c */
        public C112757a f352641c;

        /* renamed from: d */
        public C113038a f352642d;

        /* renamed from: e */
        public WorkDatabase f352643e;

        /* renamed from: f */
        public String f352644f;

        /* renamed from: g */
        public List<C117973e> f352645g;

        /* renamed from: h */
        public WorkerParameters.C113037a f352646h = new WorkerParameters.C113037a();

        public C117983a(Context context, C113038a aVar, C112757a aVar2, C118739a aVar3, WorkDatabase workDatabase, String str) {
            this.f352639a = context.getApplicationContext();
            this.f352641c = aVar2;
            this.f352640b = aVar3;
            this.f352642d = aVar;
            this.f352643e = workDatabase;
            this.f352644f = str;
        }
    }

    public C117982n(C117983a aVar) {
        this.f352620d = aVar.f352639a;
        this.f352626j = aVar.f352641c;
        this.f352629p = aVar.f352640b;
        this.f352621e = aVar.f352644f;
        this.f352622f = aVar.f352645g;
        this.f352623g = aVar.f352646h;
        this.f352625i = null;
        this.f352628o = aVar.f352642d;
        WorkDatabase workDatabase = aVar.f352643e;
        this.f352630q = workDatabase;
        this.f352631r = workDatabase.mo165532n();
        this.f352632s = this.f352630q.mo165527i();
        this.f352633t = this.f352630q.mo165533o();
    }

    /* renamed from: a */
    public final void mo182740a(ListenableWorker.C113032a aVar) {
        if (aVar instanceof ListenableWorker.C113032a.C113035c) {
            C117693m.m165966c().mo182391d(f352619z, String.format("Worker result SUCCESS for %s", new Object[]{this.f352635v}), new Throwable[0]);
            if (this.f352624h.mo183546c()) {
                mo182744e();
                return;
            }
            this.f352630q.mo183703c();
            try {
                C118849p pVar = this.f352631r;
                ((C118850q) pVar).mo183567p(C117705u.SUCCEEDED, this.f352621e);
                C113041b bVar = ((ListenableWorker.C113032a.C113035c) this.f352627n).f338332a;
                ((C118850q) this.f352631r).mo183565n(this.f352621e, bVar);
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = ((ArrayList) ((C118828c) this.f352632s).mo183529a(this.f352621e)).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (((C118850q) this.f352631r).mo183557f(str) == C117705u.BLOCKED && ((C118828c) this.f352632s).mo183530b(str)) {
                        C117693m.m165966c().mo182391d(f352619z, String.format("Setting status to enqueued for %s", new Object[]{str}), new Throwable[0]);
                        C118849p pVar2 = this.f352631r;
                        ((C118850q) pVar2).mo183567p(C117705u.ENQUEUED, str);
                        ((C118850q) this.f352631r).mo183566o(str, currentTimeMillis);
                    }
                }
                this.f352630q.mo183706h();
            } finally {
                this.f352630q.mo183704f();
                mo182745f(false);
            }
        } else if (aVar instanceof ListenableWorker.C113032a.C113034b) {
            C117693m.m165966c().mo182391d(f352619z, String.format("Worker result RETRY for %s", new Object[]{this.f352635v}), new Throwable[0]);
            mo182743d();
        } else {
            C117693m.m165966c().mo182391d(f352619z, String.format("Worker result FAILURE for %s", new Object[]{this.f352635v}), new Throwable[0]);
            if (this.f352624h.mo183546c()) {
                mo182744e();
            } else {
                mo182747h();
            }
        }
    }

    /* renamed from: b */
    public final void mo182741b(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (((C118850q) this.f352631r).mo183557f(str2) != C117705u.CANCELLED) {
                C118849p pVar = this.f352631r;
                ((C118850q) pVar).mo183567p(C117705u.FAILED, str2);
            }
            linkedList.addAll(((C118828c) this.f352632s).mo183529a(str2));
        }
    }

    /* renamed from: c */
    public void mo182742c() {
        if (!mo182748i()) {
            this.f352630q.mo183703c();
            try {
                C117705u f = ((C118850q) this.f352631r).mo183557f(this.f352621e);
                ((C118844n) this.f352630q.mo165531m()).mo183542a(this.f352621e);
                if (f == null) {
                    mo182745f(false);
                } else if (f == C117705u.RUNNING) {
                    mo182740a(this.f352627n);
                } else if (!f.mo182396a()) {
                    mo182743d();
                }
                this.f352630q.mo183706h();
            } finally {
                this.f352630q.mo183704f();
            }
        }
        List<C117973e> list = this.f352622f;
        if (list != null) {
            for (C117973e a : list) {
                a.mo182730a(this.f352621e);
            }
            C117974f.m166380a(this.f352628o, this.f352630q, this.f352622f);
        }
    }

    /* renamed from: d */
    public final void mo182743d() {
        this.f352630q.mo183703c();
        try {
            C118849p pVar = this.f352631r;
            ((C118850q) pVar).mo183567p(C117705u.ENQUEUED, this.f352621e);
            ((C118850q) this.f352631r).mo183566o(this.f352621e, System.currentTimeMillis());
            ((C118850q) this.f352631r).mo183563l(this.f352621e, -1);
            this.f352630q.mo183706h();
        } finally {
            this.f352630q.mo183704f();
            mo182745f(true);
        }
    }

    /* renamed from: e */
    public final void mo182744e() {
        this.f352630q.mo183703c();
        try {
            ((C118850q) this.f352631r).mo183566o(this.f352621e, System.currentTimeMillis());
            C118849p pVar = this.f352631r;
            ((C118850q) pVar).mo183567p(C117705u.ENQUEUED, this.f352621e);
            ((C118850q) this.f352631r).mo183564m(this.f352621e);
            ((C118850q) this.f352631r).mo183563l(this.f352621e, -1);
            this.f352630q.mo183706h();
        } finally {
            this.f352630q.mo183704f();
            mo182745f(false);
        }
    }

    /* renamed from: f */
    public final void mo182745f(boolean z) {
        C119046i c;
        Cursor a;
        ListenableWorker listenableWorker;
        this.f352630q.mo183703c();
        try {
            C118850q qVar = (C118850q) this.f352630q.mo165532n();
            qVar.getClass();
            c = C119046i.m167801c("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
            qVar.f355561a.mo183702b();
            a = C113140c.m154797a(qVar.f355561a, c, false, (CancellationSignal) null);
            boolean z2 = a.moveToFirst() && a.getInt(0) != 0;
            a.close();
            c.mo183710d();
            if (!z2) {
                C118922g.m167677a(this.f352620d, RescheduleReceiver.class, false);
            }
            if (z) {
                ((C118850q) this.f352631r).mo183567p(C117705u.ENQUEUED, this.f352621e);
                ((C118850q) this.f352631r).mo183563l(this.f352621e, -1);
            }
            if (!(this.f352624h == null || (listenableWorker = this.f352625i) == null || !listenableWorker.mo165507b())) {
                C118739a aVar = this.f352629p;
                String str = this.f352621e;
                C117971d dVar = (C117971d) aVar;
                synchronized (dVar.f352583q) {
                    ((HashMap) dVar.f352578i).remove(str);
                    dVar.mo182726g();
                }
            }
            this.f352630q.mo183706h();
            this.f352630q.mo183704f();
            this.f352636w.mo183732i(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.f352630q.mo183704f();
            throw th;
        }
    }

    /* renamed from: g */
    public final void mo182746g() {
        C117705u f = ((C118850q) this.f352631r).mo183557f(this.f352621e);
        if (f == C117705u.RUNNING) {
            C117693m.m165966c().mo182389a(f352619z, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", new Object[]{this.f352621e}), new Throwable[0]);
            mo182745f(true);
            return;
        }
        C117693m.m165966c().mo182389a(f352619z, String.format("Status for %s is %s; not doing any work", new Object[]{this.f352621e, f}), new Throwable[0]);
        mo182745f(false);
    }

    /* renamed from: h */
    public void mo182747h() {
        this.f352630q.mo183703c();
        try {
            mo182741b(this.f352621e);
            C113041b bVar = ((ListenableWorker.C113032a.C113033a) this.f352627n).f338331a;
            ((C118850q) this.f352631r).mo183565n(this.f352621e, bVar);
            this.f352630q.mo183706h();
        } finally {
            this.f352630q.mo183704f();
            mo182745f(false);
        }
    }

    /* renamed from: i */
    public final boolean mo182748i() {
        if (!this.f352638y) {
            return false;
        }
        C117693m.m165966c().mo182389a(f352619z, String.format("Work interrupted for %s", new Object[]{this.f352635v}), new Throwable[0]);
        C117705u f = ((C118850q) this.f352631r).mo183557f(this.f352621e);
        if (f == null) {
            mo182745f(false);
        } else {
            mo182745f(!f.mo182396a());
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c3, code lost:
        if ((r0.f355542b == r2 && r0.f355551k > 0) != false) goto L_0x00c5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r18 = this;
            r1 = r18
            x4.s r0 = r1.f352633t
            java.lang.String r2 = r1.f352621e
            x4.t r0 = (p1221x4.C118861t) r0
            java.util.List r0 = r0.mo183568a(r2)
            r1.f352634u = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Work [ id="
            r2.<init>(r3)
            java.lang.String r3 = r1.f352621e
            r2.append(r3)
            java.lang.String r3 = ", tags={ "
            r2.append(r3)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
            r3 = 1
            r4 = 1
        L_0x0027:
            boolean r5 = r0.hasNext()
            r6 = 0
            if (r5 == 0) goto L_0x0041
            java.lang.Object r5 = r0.next()
            java.lang.String r5 = (java.lang.String) r5
            if (r4 == 0) goto L_0x0038
            r4 = 0
            goto L_0x003d
        L_0x0038:
            java.lang.String r6 = ", "
            r2.append(r6)
        L_0x003d:
            r2.append(r5)
            goto L_0x0027
        L_0x0041:
            java.lang.String r0 = " } ]"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.f352635v = r0
            o4.u r2 = p1014o4.C117705u.ENQUEUED
            boolean r0 = r18.mo182748i()
            if (r0 == 0) goto L_0x0056
            goto L_0x02ec
        L_0x0056:
            androidx.work.impl.WorkDatabase r0 = r1.f352630q
            r0.mo183703c()
            x4.p r0 = r1.f352631r     // Catch:{ all -> 0x02fc }
            java.lang.String r4 = r1.f352621e     // Catch:{ all -> 0x02fc }
            x4.q r0 = (p1221x4.C118850q) r0     // Catch:{ all -> 0x02fc }
            x4.o r0 = r0.mo183560i(r4)     // Catch:{ all -> 0x02fc }
            r1.f352624h = r0     // Catch:{ all -> 0x02fc }
            if (r0 != 0) goto L_0x008a
            o4.m r0 = p1014o4.C117693m.m165966c()     // Catch:{ all -> 0x02fc }
            java.lang.String r2 = f352619z     // Catch:{ all -> 0x02fc }
            java.lang.String r4 = "Didn't find WorkSpec for id %s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x02fc }
            java.lang.String r5 = r1.f352621e     // Catch:{ all -> 0x02fc }
            r3[r6] = r5     // Catch:{ all -> 0x02fc }
            java.lang.String r3 = java.lang.String.format(r4, r3)     // Catch:{ all -> 0x02fc }
            java.lang.Throwable[] r4 = new java.lang.Throwable[r6]     // Catch:{ all -> 0x02fc }
            r0.mo182390b(r2, r3, r4)     // Catch:{ all -> 0x02fc }
            r1.mo182745f(r6)     // Catch:{ all -> 0x02fc }
            androidx.work.impl.WorkDatabase r0 = r1.f352630q     // Catch:{ all -> 0x02fc }
            r0.mo183706h()     // Catch:{ all -> 0x02fc }
            goto L_0x0101
        L_0x008a:
            o4.u r4 = r0.f355542b     // Catch:{ all -> 0x02fc }
            if (r4 == r2) goto L_0x00b0
            r18.mo182746g()     // Catch:{ all -> 0x02fc }
            androidx.work.impl.WorkDatabase r0 = r1.f352630q     // Catch:{ all -> 0x02fc }
            r0.mo183706h()     // Catch:{ all -> 0x02fc }
            o4.m r0 = p1014o4.C117693m.m165966c()     // Catch:{ all -> 0x02fc }
            java.lang.String r2 = f352619z     // Catch:{ all -> 0x02fc }
            java.lang.String r4 = "%s is not in ENQUEUED state. Nothing more to do."
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x02fc }
            x4.o r5 = r1.f352624h     // Catch:{ all -> 0x02fc }
            java.lang.String r5 = r5.f355543c     // Catch:{ all -> 0x02fc }
            r3[r6] = r5     // Catch:{ all -> 0x02fc }
            java.lang.String r3 = java.lang.String.format(r4, r3)     // Catch:{ all -> 0x02fc }
            java.lang.Throwable[] r4 = new java.lang.Throwable[r6]     // Catch:{ all -> 0x02fc }
            r0.mo182389a(r2, r3, r4)     // Catch:{ all -> 0x02fc }
            goto L_0x0101
        L_0x00b0:
            boolean r0 = r0.mo183546c()     // Catch:{ all -> 0x02fc }
            if (r0 != 0) goto L_0x00c5
            x4.o r0 = r1.f352624h     // Catch:{ all -> 0x02fc }
            o4.u r4 = r0.f355542b     // Catch:{ all -> 0x02fc }
            if (r4 != r2) goto L_0x00c2
            int r0 = r0.f355551k     // Catch:{ all -> 0x02fc }
            if (r0 <= 0) goto L_0x00c2
            r0 = 1
            goto L_0x00c3
        L_0x00c2:
            r0 = 0
        L_0x00c3:
            if (r0 == 0) goto L_0x0108
        L_0x00c5:
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02fc }
            x4.o r0 = r1.f352624h     // Catch:{ all -> 0x02fc }
            long r7 = r0.f355554n     // Catch:{ all -> 0x02fc }
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x00d5
            r7 = 1
            goto L_0x00d6
        L_0x00d5:
            r7 = 0
        L_0x00d6:
            if (r7 != 0) goto L_0x0108
            long r7 = r0.mo183544a()     // Catch:{ all -> 0x02fc }
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0108
            o4.m r0 = p1014o4.C117693m.m165966c()     // Catch:{ all -> 0x02fc }
            java.lang.String r2 = f352619z     // Catch:{ all -> 0x02fc }
            java.lang.String r4 = "Delaying execution for %s because it is being executed before schedule."
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ all -> 0x02fc }
            x4.o r7 = r1.f352624h     // Catch:{ all -> 0x02fc }
            java.lang.String r7 = r7.f355543c     // Catch:{ all -> 0x02fc }
            r5[r6] = r7     // Catch:{ all -> 0x02fc }
            java.lang.String r4 = java.lang.String.format(r4, r5)     // Catch:{ all -> 0x02fc }
            java.lang.Throwable[] r5 = new java.lang.Throwable[r6]     // Catch:{ all -> 0x02fc }
            r0.mo182389a(r2, r4, r5)     // Catch:{ all -> 0x02fc }
            r1.mo182745f(r3)     // Catch:{ all -> 0x02fc }
            androidx.work.impl.WorkDatabase r0 = r1.f352630q     // Catch:{ all -> 0x02fc }
            r0.mo183706h()     // Catch:{ all -> 0x02fc }
        L_0x0101:
            androidx.work.impl.WorkDatabase r0 = r1.f352630q
            r0.mo183704f()
            goto L_0x02ec
        L_0x0108:
            androidx.work.impl.WorkDatabase r0 = r1.f352630q     // Catch:{ all -> 0x02fc }
            r0.mo183706h()     // Catch:{ all -> 0x02fc }
            androidx.work.impl.WorkDatabase r0 = r1.f352630q
            r0.mo183704f()
            x4.o r0 = r1.f352624h
            boolean r0 = r0.mo183546c()
            if (r0 == 0) goto L_0x0121
            x4.o r0 = r1.f352624h
            androidx.work.b r0 = r0.f355545e
        L_0x011e:
            r9 = r0
            goto L_0x01d3
        L_0x0121:
            androidx.work.a r0 = r1.f352628o
            o4.j r0 = r0.f338347d
            x4.o r4 = r1.f352624h
            java.lang.String r4 = r4.f355544d
            r0.getClass()
            java.lang.String r0 = p1014o4.C117688h.f352011a
            r5 = 0
            java.lang.Class r0 = java.lang.Class.forName(r4)     // Catch:{ Exception -> 0x013a }
            java.lang.Object r0 = r0.newInstance()     // Catch:{ Exception -> 0x013a }
            o4.h r0 = (p1014o4.C117688h) r0     // Catch:{ Exception -> 0x013a }
            goto L_0x015a
        L_0x013a:
            r0 = move-exception
            o4.m r7 = p1014o4.C117693m.m165966c()
            java.lang.String r8 = p1014o4.C117688h.f352011a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Trouble instantiating + "
            r9.append(r10)
            r9.append(r4)
            java.lang.String r4 = r9.toString()
            java.lang.Throwable[] r9 = new java.lang.Throwable[r3]
            r9[r6] = r0
            r7.mo182390b(r8, r4, r9)
            r0 = r5
        L_0x015a:
            if (r0 != 0) goto L_0x017a
            o4.m r0 = p1014o4.C117693m.m165966c()
            java.lang.String r2 = f352619z
            java.lang.Object[] r3 = new java.lang.Object[r3]
            x4.o r4 = r1.f352624h
            java.lang.String r4 = r4.f355544d
            r3[r6] = r4
            java.lang.String r4 = "Could not create Input Merger %s"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r6]
            r0.mo182390b(r2, r3, r4)
            r18.mo182747h()
            goto L_0x02ec
        L_0x017a:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            x4.o r7 = r1.f352624h
            androidx.work.b r7 = r7.f355545e
            r4.add(r7)
            x4.p r7 = r1.f352631r
            java.lang.String r8 = r1.f352621e
            x4.q r7 = (p1221x4.C118850q) r7
            r7.getClass()
            java.lang.String r9 = "SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)"
            z3.i r9 = p1223z3.C119046i.m167801c(r9, r3)
            if (r8 != 0) goto L_0x019b
            r9.bindNull(r3)
            goto L_0x019e
        L_0x019b:
            r9.bindString(r3, r8)
        L_0x019e:
            z3.g r8 = r7.f355561a
            r8.mo183702b()
            z3.g r7 = r7.f355561a
            android.database.Cursor r5 = p452b4.C113140c.m154797a(r7, r9, r6, r5)
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x02f4 }
            int r8 = r5.getCount()     // Catch:{ all -> 0x02f4 }
            r7.<init>(r8)     // Catch:{ all -> 0x02f4 }
        L_0x01b2:
            boolean r8 = r5.moveToNext()     // Catch:{ all -> 0x02f4 }
            if (r8 == 0) goto L_0x01c4
            byte[] r8 = r5.getBlob(r6)     // Catch:{ all -> 0x02f4 }
            androidx.work.b r8 = androidx.work.C113041b.m154667a(r8)     // Catch:{ all -> 0x02f4 }
            r7.add(r8)     // Catch:{ all -> 0x02f4 }
            goto L_0x01b2
        L_0x01c4:
            r5.close()
            r9.mo183710d()
            r4.addAll(r7)
            androidx.work.b r0 = r0.mo165502a(r4)
            goto L_0x011e
        L_0x01d3:
            androidx.work.WorkerParameters r0 = new androidx.work.WorkerParameters
            java.lang.String r4 = r1.f352621e
            java.util.UUID r8 = java.util.UUID.fromString(r4)
            java.util.List<java.lang.String> r10 = r1.f352634u
            androidx.work.WorkerParameters$a r11 = r1.f352623g
            x4.o r4 = r1.f352624h
            int r12 = r4.f355551k
            androidx.work.a r4 = r1.f352628o
            java.util.concurrent.Executor r13 = r4.f338344a
            a5.a r14 = r1.f352626j
            o4.y r15 = r4.f338346c
            y4.q r4 = new y4.q
            androidx.work.impl.WorkDatabase r5 = r1.f352630q
            a5.a r7 = r1.f352626j
            r4.<init>(r5, r7)
            y4.p r5 = new y4.p
            androidx.work.impl.WorkDatabase r7 = r1.f352630q
            w4.a r6 = r1.f352629p
            a5.a r3 = r1.f352626j
            r5.<init>(r7, r6, r3)
            r7 = r0
            r16 = r4
            r17 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            androidx.work.ListenableWorker r3 = r1.f352625i
            if (r3 != 0) goto L_0x021b
            androidx.work.a r3 = r1.f352628o
            o4.y r3 = r3.f338346c
            android.content.Context r4 = r1.f352620d
            x4.o r5 = r1.f352624h
            java.lang.String r5 = r5.f355543c
            androidx.work.ListenableWorker r3 = r3.mo182398a(r4, r5, r0)
            r1.f352625i = r3
        L_0x021b:
            androidx.work.ListenableWorker r3 = r1.f352625i
            if (r3 != 0) goto L_0x023f
            o4.m r0 = p1014o4.C117693m.m165966c()
            java.lang.String r2 = f352619z
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            x4.o r4 = r1.f352624h
            java.lang.String r4 = r4.f355543c
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = "Could not create Worker %s"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r5]
            r0.mo182390b(r2, r3, r4)
            r18.mo182747h()
            goto L_0x02ec
        L_0x023f:
            r5 = 0
            boolean r4 = r3.f338329g
            if (r4 == 0) goto L_0x0263
            o4.m r0 = p1014o4.C117693m.m165966c()
            java.lang.String r2 = f352619z
            r4 = 1
            java.lang.Object[] r3 = new java.lang.Object[r4]
            x4.o r4 = r1.f352624h
            java.lang.String r4 = r4.f355543c
            r3[r5] = r4
            java.lang.String r4 = "Received an already-used Worker %s; WorkerFactory should return new instances"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r5]
            r0.mo182390b(r2, r3, r4)
            r18.mo182747h()
            goto L_0x02ec
        L_0x0263:
            r4 = 1
            r3.f338329g = r4
            androidx.work.impl.WorkDatabase r3 = r1.f352630q
            r3.mo183703c()
            x4.p r3 = r1.f352631r     // Catch:{ all -> 0x02ed }
            java.lang.String r4 = r1.f352621e     // Catch:{ all -> 0x02ed }
            x4.q r3 = (p1221x4.C118850q) r3     // Catch:{ all -> 0x02ed }
            o4.u r3 = r3.mo183557f(r4)     // Catch:{ all -> 0x02ed }
            if (r3 != r2) goto L_0x0293
            x4.p r2 = r1.f352631r     // Catch:{ all -> 0x02ed }
            o4.u r3 = p1014o4.C117705u.RUNNING     // Catch:{ all -> 0x02ed }
            r4 = 1
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ all -> 0x02ed }
            java.lang.String r6 = r1.f352621e     // Catch:{ all -> 0x02ed }
            r7 = 0
            r5[r7] = r6     // Catch:{ all -> 0x02ed }
            x4.q r2 = (p1221x4.C118850q) r2     // Catch:{ all -> 0x02ed }
            r2.mo183567p(r3, r5)     // Catch:{ all -> 0x02ed }
            x4.p r2 = r1.f352631r     // Catch:{ all -> 0x02ed }
            java.lang.String r3 = r1.f352621e     // Catch:{ all -> 0x02ed }
            x4.q r2 = (p1221x4.C118850q) r2     // Catch:{ all -> 0x02ed }
            r2.mo183562k(r3)     // Catch:{ all -> 0x02ed }
            r3 = 1
            goto L_0x0295
        L_0x0293:
            r7 = 0
            r3 = 0
        L_0x0295:
            androidx.work.impl.WorkDatabase r2 = r1.f352630q     // Catch:{ all -> 0x02ed }
            r2.mo183706h()     // Catch:{ all -> 0x02ed }
            androidx.work.impl.WorkDatabase r2 = r1.f352630q
            r2.mo183704f()
            if (r3 == 0) goto L_0x02e9
            boolean r2 = r18.mo182748i()
            if (r2 == 0) goto L_0x02a8
            goto L_0x02ec
        L_0x02a8:
            z4.c r2 = new z4.c
            r2.<init>()
            y4.n r9 = new y4.n
            android.content.Context r4 = r1.f352620d
            x4.o r5 = r1.f352624h
            androidx.work.ListenableWorker r6 = r1.f352625i
            o4.g r7 = r0.f338341f
            a5.a r8 = r1.f352626j
            r3 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            a5.a r0 = r1.f352626j
            a5.b r0 = (p1169a5.C112758b) r0
            java.util.concurrent.Executor r0 = r0.f337644c
            a5.b$a r0 = (p1169a5.C112758b.C112759a) r0
            r0.execute(r9)
            z4.c<java.lang.Void> r0 = r9.f356220d
            p4.l r3 = new p4.l
            r3.<init>(r1, r0, r2)
            a5.a r4 = r1.f352626j
            a5.b r4 = (p1169a5.C112758b) r4
            java.util.concurrent.Executor r4 = r4.f337644c
            r0.addListener(r3, r4)
            java.lang.String r0 = r1.f352635v
            p4.m r3 = new p4.m
            r3.<init>(r1, r2, r0)
            a5.a r0 = r1.f352626j
            a5.b r0 = (p1169a5.C112758b) r0
            y4.j r0 = r0.f337642a
            r2.addListener(r3, r0)
            goto L_0x02ec
        L_0x02e9:
            r18.mo182746g()
        L_0x02ec:
            return
        L_0x02ed:
            r0 = move-exception
            androidx.work.impl.WorkDatabase r2 = r1.f352630q
            r2.mo183704f()
            throw r0
        L_0x02f4:
            r0 = move-exception
            r5.close()
            r9.mo183710d()
            throw r0
        L_0x02fc:
            r0 = move-exception
            androidx.work.impl.WorkDatabase r2 = r1.f352630q
            r2.mo183704f()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1206p4.C117982n.run():void");
    }
}
