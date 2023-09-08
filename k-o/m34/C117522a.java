package m34;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: m34.a */
public final class C117522a extends RuntimeException {

    /* renamed from: d */
    public final List<Throwable> f351641d;

    /* renamed from: e */
    public final String f351642e;

    /* renamed from: f */
    public Throwable f351643f;

    /* renamed from: m34.a$a */
    public static final class C117523a extends RuntimeException {
        public String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    /* renamed from: m34.a$b */
    public static abstract class C117524b {
        /* renamed from: a */
        public abstract Object mo182257a();

        /* renamed from: b */
        public abstract void mo182258b(Object obj);
    }

    /* renamed from: m34.a$c */
    public static final class C117525c extends C117524b {

        /* renamed from: a */
        public final PrintStream f351644a;

        public C117525c(PrintStream printStream) {
            this.f351644a = printStream;
        }

        /* renamed from: a */
        public Object mo182257a() {
            return this.f351644a;
        }

        /* renamed from: b */
        public void mo182258b(Object obj) {
            this.f351644a.println(obj);
        }
    }

    /* renamed from: m34.a$d */
    public static final class C117526d extends C117524b {

        /* renamed from: a */
        public final PrintWriter f351645a;

        public C117526d(PrintWriter printWriter) {
            this.f351645a = printWriter;
        }

        /* renamed from: a */
        public Object mo182257a() {
            return this.f351645a;
        }

        /* renamed from: b */
        public void mo182258b(Object obj) {
            this.f351645a.println(obj);
        }
    }

    public C117522a(Collection<? extends Throwable> collection) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            for (Throwable th : collection) {
                if (th instanceof C117522a) {
                    linkedHashSet.addAll(((C117522a) th).f351641d);
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException());
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException());
        }
        arrayList.addAll(linkedHashSet);
        List<Throwable> unmodifiableList = Collections.unmodifiableList(arrayList);
        this.f351641d = unmodifiableList;
        this.f351642e = unmodifiableList.size() + " exceptions occurred. ";
    }

    /* renamed from: a */
    public final void mo182249a(StringBuilder sb, Throwable th, String str) {
        sb.append(str);
        sb.append(th);
        sb.append(10);
        for (StackTraceElement append : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(append);
            sb.append(10);
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            mo182249a(sb, th.getCause(), "");
        }
    }

    /* renamed from: b */
    public final void mo182250b(C117524b bVar) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append(10);
        for (StackTraceElement append : getStackTrace()) {
            sb.append("\tat ");
            sb.append(append);
            sb.append(10);
        }
        int i = 1;
        for (Throwable a : this.f351641d) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            mo182249a(sb, a, "\t");
            i++;
        }
        synchronized (bVar.mo182257a()) {
            bVar.mo182258b(sb.toString());
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:10|(1:(1:13)(1:(2:14|(1:52)(1:(2:53|17)(1:18)))))(0)|19|(4:22|(2:24|55)(2:25|56)|54|20)|26|27|28|29|(1:49)(1:(2:32|50)(3:(2:33|(1:57)(1:(2:58|36)(1:37)))|38|51))) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0070 */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0016 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.Throwable getCause() {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.Throwable r0 = r8.f351643f     // Catch:{ all -> 0x008f }
            if (r0 != 0) goto L_0x008b
            m34.a$a r0 = new m34.a$a     // Catch:{ all -> 0x008f }
            r0.<init>()     // Catch:{ all -> 0x008f }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x008f }
            r1.<init>()     // Catch:{ all -> 0x008f }
            java.util.List<java.lang.Throwable> r2 = r8.f351641d     // Catch:{ all -> 0x008f }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x008f }
            r3 = r0
        L_0x0016:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x008f }
            if (r4 == 0) goto L_0x0089
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x008f }
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ all -> 0x008f }
            boolean r5 = r1.contains(r4)     // Catch:{ all -> 0x008f }
            if (r5 == 0) goto L_0x0029
            goto L_0x0016
        L_0x0029:
            r1.add(r4)     // Catch:{ all -> 0x008f }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x008f }
            r5.<init>()     // Catch:{ all -> 0x008f }
            java.lang.Throwable r6 = r4.getCause()     // Catch:{ all -> 0x008f }
            if (r6 == 0) goto L_0x004b
            if (r6 != r4) goto L_0x003a
            goto L_0x004b
        L_0x003a:
            r5.add(r6)     // Catch:{ all -> 0x008f }
            java.lang.Throwable r7 = r6.getCause()     // Catch:{ all -> 0x008f }
            if (r7 == 0) goto L_0x004b
            if (r7 != r6) goto L_0x0046
            goto L_0x004b
        L_0x0046:
            java.lang.Throwable r6 = r6.getCause()     // Catch:{ all -> 0x008f }
            goto L_0x003a
        L_0x004b:
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x008f }
        L_0x004f:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x008f }
            if (r6 == 0) goto L_0x006d
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x008f }
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x008f }
            boolean r7 = r1.contains(r6)     // Catch:{ all -> 0x008f }
            if (r7 == 0) goto L_0x0069
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ all -> 0x008f }
            java.lang.String r6 = "Duplicate found in causal chain so cropping to prevent loop ..."
            r4.<init>(r6)     // Catch:{ all -> 0x008f }
            goto L_0x004f
        L_0x0069:
            r1.add(r6)     // Catch:{ all -> 0x008f }
            goto L_0x004f
        L_0x006d:
            r3.initCause(r4)     // Catch:{ all -> 0x0070 }
        L_0x0070:
            java.lang.Throwable r4 = r3.getCause()     // Catch:{ all -> 0x008f }
            if (r4 == 0) goto L_0x0016
            if (r4 != r3) goto L_0x0079
            goto L_0x0016
        L_0x0079:
            java.lang.Throwable r3 = r4.getCause()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x0087
            if (r3 != r4) goto L_0x0082
            goto L_0x0087
        L_0x0082:
            java.lang.Throwable r4 = r4.getCause()     // Catch:{ all -> 0x008f }
            goto L_0x0079
        L_0x0087:
            r3 = r4
            goto L_0x0016
        L_0x0089:
            r8.f351643f = r0     // Catch:{ all -> 0x008f }
        L_0x008b:
            java.lang.Throwable r0 = r8.f351643f     // Catch:{ all -> 0x008f }
            monitor-exit(r8)
            return r0
        L_0x008f:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m34.C117522a.getCause():java.lang.Throwable");
    }

    public String getMessage() {
        return this.f351642e;
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public void printStackTrace(PrintStream printStream) {
        mo182250b(new C117525c(printStream));
    }

    public void printStackTrace(PrintWriter printWriter) {
        mo182250b(new C117526d(printWriter));
    }
}
