package com.tencent.p014mm.recoveryv2;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import com.tencent.p014mm.recoveryv2.C85689j;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.tencent.mm.recoveryv2.d */
public interface C85672d {

    /* renamed from: com.tencent.mm.recoveryv2.d$a */
    public static class C85673a implements C85672d {

        /* renamed from: a */
        public final File f249638a;

        /* renamed from: b */
        public final Bundle f249639b = new Bundle();

        /* renamed from: c */
        public final AtomicBoolean f249640c = new AtomicBoolean();

        public C85673a(Context context, String str) {
            File file = new File(new File(context.getFilesDir().getParentFile(), "MicroMsg/recovery"), str);
            this.f249638a = new File(file, "fast_persist_data");
        }

        /* renamed from: a */
        public C85672d mo119240a() {
            try {
                C85689j.C85691b.m105833a(this.f249638a);
            } catch (Throwable th) {
                C85692k.m105839a("MicroMsg.recovery.fastPersist", "create persist dir fail", th);
            }
            this.f249640c.set(true);
            return this;
        }

        /* renamed from: b */
        public C85672d mo119241b() {
            mo119254g();
            return this;
        }

        /* renamed from: c */
        public /* bridge */ /* synthetic */ C85672d mo119242c() {
            mo119254g();
            return this;
        }

        /* renamed from: d */
        public final void mo119251d() {
            if (!this.f249640c.get()) {
                throw new IllegalStateException("Persis#load() has not yet been called");
            }
        }

        /* renamed from: e */
        public C85672d mo119252e(String str) {
            mo119251d();
            this.f249639b.remove(str);
            Pair<String, File> f = mo119253f(str);
            if (f != null) {
                C85689j.C85691b.m105836d((File) f.second);
            }
            return this;
        }

        /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: f */
        public final android.util.Pair<java.lang.String, java.io.File> mo119253f(java.lang.String r12) {
            /*
                r11 = this;
                java.lang.String r0 = "__KEY__"
                java.lang.String r1 = "__VALUE__"
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.io.File r3 = r11.f249638a
                r4 = 0
                java.io.File[] r3 = r3.listFiles()     // Catch:{ all -> 0x0016 }
                if (r3 == 0) goto L_0x0013
                goto L_0x0018
            L_0x0013:
                java.io.File[] r3 = new java.io.File[r4]     // Catch:{ all -> 0x0016 }
                goto L_0x0018
            L_0x0016:
                java.io.File[] r3 = new java.io.File[r4]
            L_0x0018:
                int r5 = r3.length
                r6 = 0
            L_0x001a:
                if (r6 >= r5) goto L_0x00d6
                r7 = r3[r6]
                java.lang.String r8 = r7.getName()     // Catch:{ all -> 0x009d }
                java.lang.String r9 = ".FP"
                boolean r9 = r8.startsWith(r9)     // Catch:{ all -> 0x009d }
                if (r9 == 0) goto L_0x0089
                boolean r9 = r8.contains(r0)     // Catch:{ all -> 0x009d }
                if (r9 == 0) goto L_0x0089
                int r9 = r8.indexOf(r0)     // Catch:{ all -> 0x009d }
                int r9 = r9 + 7
                java.lang.String r8 = r8.substring(r9)     // Catch:{ all -> 0x009d }
                boolean r9 = r8.contains(r1)     // Catch:{ all -> 0x009d }
                if (r9 == 0) goto L_0x0086
                int r9 = r8.indexOf(r1)     // Catch:{ all -> 0x009d }
                java.lang.String r9 = r8.substring(r4, r9)     // Catch:{ all -> 0x009d }
                boolean r9 = r9.equals(r12)     // Catch:{ all -> 0x009d }
                if (r9 == 0) goto L_0x0072
                int r9 = r8.indexOf(r1)     // Catch:{ all -> 0x009d }
                int r9 = r9 + 9
                java.lang.String r8 = r8.substring(r9)     // Catch:{ all -> 0x009d }
                android.util.Pair r9 = new android.util.Pair     // Catch:{ all -> 0x009d }
                r9.<init>(r8, r7)     // Catch:{ all -> 0x009d }
                java.util.Iterator r12 = r2.iterator()
            L_0x0061:
                boolean r0 = r12.hasNext()
                if (r0 == 0) goto L_0x0071
                java.lang.Object r0 = r12.next()
                java.io.File r0 = (java.io.File) r0
                com.tencent.p014mm.recoveryv2.C85689j.C85691b.m105836d(r0)
                goto L_0x0061
            L_0x0071:
                return r9
            L_0x0072:
                java.util.Iterator r7 = r2.iterator()
            L_0x0076:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L_0x00bc
                java.lang.Object r8 = r7.next()
                java.io.File r8 = (java.io.File) r8
                com.tencent.p014mm.recoveryv2.C85689j.C85691b.m105836d(r8)
                goto L_0x0076
            L_0x0086:
                r2.add(r7)     // Catch:{ all -> 0x009d }
            L_0x0089:
                java.util.Iterator r7 = r2.iterator()
            L_0x008d:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L_0x00bc
                java.lang.Object r8 = r7.next()
                java.io.File r8 = (java.io.File) r8
                com.tencent.p014mm.recoveryv2.C85689j.C85691b.m105836d(r8)
                goto L_0x008d
            L_0x009d:
                r8 = move-exception
                java.lang.String r9 = "MicroMsg.recovery.fastPersist"
                java.lang.String r10 = "find persist file fail"
                com.tencent.p014mm.recoveryv2.C85692k.m105839a(r9, r10, r8)     // Catch:{ all -> 0x00c0 }
                r2.add(r7)     // Catch:{ all -> 0x00c0 }
                java.util.Iterator r7 = r2.iterator()
            L_0x00ac:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L_0x00bc
                java.lang.Object r8 = r7.next()
                java.io.File r8 = (java.io.File) r8
                com.tencent.p014mm.recoveryv2.C85689j.C85691b.m105836d(r8)
                goto L_0x00ac
            L_0x00bc:
                int r6 = r6 + 1
                goto L_0x001a
            L_0x00c0:
                r12 = move-exception
                java.util.Iterator r0 = r2.iterator()
            L_0x00c5:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x00d5
                java.lang.Object r1 = r0.next()
                java.io.File r1 = (java.io.File) r1
                com.tencent.p014mm.recoveryv2.C85689j.C85691b.m105836d(r1)
                goto L_0x00c5
            L_0x00d5:
                throw r12
            L_0x00d6:
                r12 = 0
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.recoveryv2.C85672d.C85673a.mo119253f(java.lang.String):android.util.Pair");
        }

        /* renamed from: g */
        public C85673a mo119254g() {
            mo119251d();
            for (String next : this.f249639b.keySet()) {
                Object obj = this.f249639b.get(next);
                if (obj != null) {
                    Pair<String, File> f = mo119253f(next);
                    if (f != null) {
                        C85689j.C85691b.m105836d((File) f.second);
                    }
                    try {
                        File file = this.f249638a;
                        C85689j.C85691b.m105834b(new File(file, ".FP__KEY__" + next + "__VALUE__" + obj));
                    } catch (Throwable th) {
                        C85692k.m105839a("MicroMsg.recovery.fastPersist", "create file pair store fail", th);
                    }
                }
            }
            return this;
        }

        public boolean getBoolean(String str, boolean z) {
            mo119251d();
            if (this.f249639b.containsKey(str)) {
                return this.f249639b.getBoolean(str);
            }
            Pair<String, File> f = mo119253f(str);
            if (f != null) {
                String str2 = (String) f.first;
                if (str2.equalsIgnoreCase("true") || str2.equalsIgnoreCase("false")) {
                    return Boolean.parseBoolean(str2);
                }
            }
            return z;
        }

        public int getInt(String str, int i) {
            return C85689j.m105832f(getLong(str, (long) i), i);
        }

        public long getLong(String str, long j) {
            mo119251d();
            if (this.f249639b.containsKey(str)) {
                return this.f249639b.getLong(str);
            }
            Pair<String, File> f = mo119253f(str);
            if (f != null) {
                String str2 = (String) f.first;
                if (C85689j.m105829c(str2)) {
                    try {
                        return Long.parseLong(str2);
                    } catch (Throwable unused) {
                    }
                }
            }
            return j;
        }

        public String getString(String str, String str2) {
            mo119251d();
            if (this.f249639b.containsKey(str)) {
                return this.f249639b.getString(str);
            }
            Pair<String, File> f = mo119253f(str);
            return f != null ? (String) f.first : str2;
        }

        public C85672d putBoolean(String str, boolean z) {
            this.f249639b.putBoolean(str, z);
            return this;
        }

        public C85672d putInt(String str, int i) {
            this.f249639b.putLong(str, (long) i);
            return this;
        }

        public C85672d putLong(String str, long j) {
            this.f249639b.putLong(str, j);
            return this;
        }

        public C85672d putString(String str, String str2) {
            this.f249639b.putString(str, str2);
            return this;
        }
    }

    /* renamed from: com.tencent.mm.recoveryv2.d$b */
    public static class C85674b implements C85672d {

        /* renamed from: a */
        public final Context f249641a;

        /* renamed from: b */
        public final String f249642b;

        /* renamed from: c */
        public final Bundle f249643c = new Bundle();

        /* renamed from: d */
        public SharedPreferences f249644d;

        public C85674b(Context context, String str) {
            this.f249641a = context;
            this.f249642b = str;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ C85672d mo119240a() {
            mo119256e();
            return this;
        }

        /* renamed from: b */
        public C85672d mo119241b() {
            mo119255d();
            mo119257f().apply();
            return this;
        }

        /* renamed from: c */
        public C85672d mo119242c() {
            mo119255d();
            mo119257f().commit();
            return this;
        }

        /* renamed from: d */
        public final void mo119255d() {
            if (this.f249644d == null) {
                throw new IllegalStateException("Persis#load() has not yet been called");
            }
        }

        /* renamed from: e */
        public C85674b mo119256e() {
            this.f249644d = this.f249641a.getSharedPreferences(this.f249642b, 4);
            return this;
        }

        /* renamed from: f */
        public final SharedPreferences.Editor mo119257f() {
            SharedPreferences.Editor edit = this.f249644d.edit();
            for (String next : this.f249643c.keySet()) {
                Object obj = this.f249643c.get(next);
                if (obj != null) {
                    String obj2 = obj.toString();
                    if (C85689j.m105829c(obj2)) {
                        try {
                            edit.putLong(next, Long.parseLong(obj2));
                        } catch (Throwable unused) {
                        }
                    } else if (obj2.equalsIgnoreCase("true") || obj2.equalsIgnoreCase("false")) {
                        edit.putBoolean(next, Boolean.parseBoolean(obj2));
                    } else {
                        edit.putString(next, obj2);
                    }
                }
            }
            return edit;
        }

        /* renamed from: g */
        public C85674b mo119258g(String str, long j) {
            mo119255d();
            this.f249643c.putLong(str, j);
            return this;
        }

        public boolean getBoolean(String str, boolean z) {
            mo119255d();
            return this.f249643c.containsKey(str) ? this.f249643c.getBoolean(str) : this.f249644d.getBoolean(str, z);
        }

        public int getInt(String str, int i) {
            return C85689j.m105832f(getLong(str, (long) i), i);
        }

        public long getLong(String str, long j) {
            mo119255d();
            if (this.f249643c.containsKey(str)) {
                return this.f249643c.getLong(str);
            }
            SharedPreferences sharedPreferences = this.f249644d;
            if (!sharedPreferences.contains(str)) {
                return j;
            }
            try {
                return sharedPreferences.getLong(str, j);
            } catch (Throwable unused) {
                return j;
            }
        }

        public String getString(String str, String str2) {
            mo119255d();
            return this.f249643c.containsKey(str) ? this.f249643c.getString(str) : this.f249644d.getString(str, str2);
        }

        public C85672d putBoolean(String str, boolean z) {
            mo119255d();
            this.f249643c.putBoolean(str, z);
            return this;
        }

        public C85672d putInt(String str, int i) {
            mo119258g(str, (long) i);
            return this;
        }

        public /* bridge */ /* synthetic */ C85672d putLong(String str, long j) {
            mo119258g(str, j);
            return this;
        }

        public C85672d putString(String str, String str2) {
            mo119255d();
            this.f249643c.putString(str, str2);
            return this;
        }
    }

    /* renamed from: a */
    C85672d mo119240a();

    /* renamed from: b */
    C85672d mo119241b();

    /* renamed from: c */
    C85672d mo119242c();

    boolean getBoolean(String str, boolean z);

    int getInt(String str, int i);

    long getLong(String str, long j);

    String getString(String str, String str2);

    C85672d putBoolean(String str, boolean z);

    C85672d putInt(String str, int i);

    C85672d putLong(String str, long j);

    C85672d putString(String str, String str2);
}
