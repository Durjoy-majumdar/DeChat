package com.facebook.soloader;

import android.content.Context;
import android.os.StrictMode;
import java.io.Closeable;
import java.io.DataInput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.facebook.soloader.r */
public abstract class C80173r extends C80150e {

    /* renamed from: c */
    public final Context f234699c;

    /* renamed from: d */
    public String f234700d;

    /* renamed from: e */
    public final Map<String, Object> f234701e = new HashMap();

    /* renamed from: com.facebook.soloader.r$a */
    public class C80174a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ File f234702d;

        /* renamed from: e */
        public final /* synthetic */ byte[] f234703e;

        /* renamed from: f */
        public final /* synthetic */ C80176c f234704f;

        /* renamed from: g */
        public final /* synthetic */ File f234705g;

        /* renamed from: h */
        public final /* synthetic */ C80164k f234706h;

        public C80174a(File file, byte[] bArr, C80176c cVar, File file2, C80164k kVar) {
            this.f234702d = file;
            this.f234703e = bArr;
            this.f234704f = cVar;
            this.f234705g = file2;
            this.f234706h = kVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0071, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            r2.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x007a, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x007d, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0086, code lost:
            throw r2;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                java.lang.String r0 = "rw"
                java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ all -> 0x006d }
                java.io.File r2 = r6.f234702d     // Catch:{ all -> 0x006d }
                r1.<init>(r2, r0)     // Catch:{ all -> 0x006d }
                byte[] r2 = r6.f234703e     // Catch:{ all -> 0x007b }
                r1.write(r2)     // Catch:{ all -> 0x007b }
                long r2 = r1.getFilePointer()     // Catch:{ all -> 0x007b }
                r1.setLength(r2)     // Catch:{ all -> 0x007b }
                r1.close()     // Catch:{ all -> 0x006d }
                java.io.File r1 = new java.io.File     // Catch:{ all -> 0x006d }
                com.facebook.soloader.r r2 = com.facebook.soloader.C80173r.this     // Catch:{ all -> 0x006d }
                java.io.File r2 = r2.f234655a     // Catch:{ all -> 0x006d }
                java.lang.String r3 = "dso_manifest"
                r1.<init>(r2, r3)     // Catch:{ all -> 0x006d }
                java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ all -> 0x006d }
                r2.<init>(r1, r0)     // Catch:{ all -> 0x006d }
                com.facebook.soloader.r$c r0 = r6.f234704f     // Catch:{ all -> 0x006f }
                r0.getClass()     // Catch:{ all -> 0x006f }
                r1 = 1
                r2.writeByte(r1)     // Catch:{ all -> 0x006f }
                com.facebook.soloader.r$b[] r3 = r0.f234710a     // Catch:{ all -> 0x006f }
                int r3 = r3.length     // Catch:{ all -> 0x006f }
                r2.writeInt(r3)     // Catch:{ all -> 0x006f }
                r3 = 0
            L_0x0039:
                com.facebook.soloader.r$b[] r4 = r0.f234710a     // Catch:{ all -> 0x006f }
                int r5 = r4.length     // Catch:{ all -> 0x006f }
                if (r3 >= r5) goto L_0x0051
                r4 = r4[r3]     // Catch:{ all -> 0x006f }
                java.lang.String r4 = r4.f234708d     // Catch:{ all -> 0x006f }
                r2.writeUTF(r4)     // Catch:{ all -> 0x006f }
                com.facebook.soloader.r$b[] r4 = r0.f234710a     // Catch:{ all -> 0x006f }
                r4 = r4[r3]     // Catch:{ all -> 0x006f }
                java.lang.String r4 = r4.f234709e     // Catch:{ all -> 0x006f }
                r2.writeUTF(r4)     // Catch:{ all -> 0x006f }
                int r3 = r3 + 1
                goto L_0x0039
            L_0x0051:
                r2.close()     // Catch:{ all -> 0x006d }
                com.facebook.soloader.r r0 = com.facebook.soloader.C80173r.this     // Catch:{ all -> 0x006d }
                java.io.File r0 = r0.f234655a     // Catch:{ all -> 0x006d }
                com.facebook.soloader.SysUtil.m97441b(r0)     // Catch:{ all -> 0x006d }
                java.io.File r0 = r6.f234705g     // Catch:{ all -> 0x006d }
                com.facebook.soloader.C80173r.m97490n(r0, r1)     // Catch:{ all -> 0x006d }
                com.facebook.soloader.r r0 = com.facebook.soloader.C80173r.this     // Catch:{ IOException -> 0x0094 }
                java.io.File r0 = r0.f234655a     // Catch:{ IOException -> 0x0094 }
                java.util.Objects.toString(r0)     // Catch:{ IOException -> 0x0094 }
                com.facebook.soloader.k r0 = r6.f234706h     // Catch:{ IOException -> 0x0094 }
                r0.close()     // Catch:{ IOException -> 0x0094 }
                return
            L_0x006d:
                r0 = move-exception
                goto L_0x0087
            L_0x006f:
                r0 = move-exception
                throw r0     // Catch:{ all -> 0x0071 }
            L_0x0071:
                r1 = move-exception
                r2.close()     // Catch:{ all -> 0x0076 }
                goto L_0x007a
            L_0x0076:
                r2 = move-exception
                r0.addSuppressed(r2)     // Catch:{ all -> 0x006d }
            L_0x007a:
                throw r1     // Catch:{ all -> 0x006d }
            L_0x007b:
                r0 = move-exception
                throw r0     // Catch:{ all -> 0x007d }
            L_0x007d:
                r2 = move-exception
                r1.close()     // Catch:{ all -> 0x0082 }
                goto L_0x0086
            L_0x0082:
                r1 = move-exception
                r0.addSuppressed(r1)     // Catch:{ all -> 0x006d }
            L_0x0086:
                throw r2     // Catch:{ all -> 0x006d }
            L_0x0087:
                com.facebook.soloader.r r1 = com.facebook.soloader.C80173r.this     // Catch:{ IOException -> 0x0094 }
                java.io.File r1 = r1.f234655a     // Catch:{ IOException -> 0x0094 }
                java.util.Objects.toString(r1)     // Catch:{ IOException -> 0x0094 }
                com.facebook.soloader.k r1 = r6.f234706h     // Catch:{ IOException -> 0x0094 }
                r1.close()     // Catch:{ IOException -> 0x0094 }
                throw r0     // Catch:{ IOException -> 0x0094 }
            L_0x0094:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C80173r.C80174a.run():void");
        }
    }

    /* renamed from: com.facebook.soloader.r$b */
    public static class C80175b {

        /* renamed from: d */
        public final String f234708d;

        /* renamed from: e */
        public final String f234709e;

        public C80175b(String str, String str2) {
            this.f234708d = str;
            this.f234709e = str2;
        }
    }

    /* renamed from: com.facebook.soloader.r$c */
    public static final class C80176c {

        /* renamed from: a */
        public final C80175b[] f234710a;

        public C80176c(C80175b[] bVarArr) {
            this.f234710a = bVarArr;
        }

        /* renamed from: a */
        public static final C80176c m97501a(DataInput dataInput) {
            if (dataInput.readByte() == 1) {
                int readInt = dataInput.readInt();
                if (readInt >= 0) {
                    C80175b[] bVarArr = new C80175b[readInt];
                    for (int i = 0; i < readInt; i++) {
                        bVarArr[i] = new C80175b(dataInput.readUTF(), dataInput.readUTF());
                    }
                    return new C80176c(bVarArr);
                }
                throw new RuntimeException("illegal number of shared libraries");
            }
            throw new RuntimeException("wrong dso manifest version");
        }
    }

    /* renamed from: com.facebook.soloader.r$d */
    public interface C80177d extends Closeable {
    }

    /* renamed from: com.facebook.soloader.r$e */
    public static abstract class C80178e implements Closeable {
        /* renamed from: a */
        public abstract boolean mo110977a();

        /* renamed from: b */
        public abstract C80177d mo110978b();

        public void close() {
        }
    }

    /* renamed from: com.facebook.soloader.r$f */
    public static class C80179f implements C80177d {

        /* renamed from: d */
        public final C80175b f234711d;

        /* renamed from: e */
        public final InputStream f234712e;

        public C80179f(C80175b bVar, InputStream inputStream) {
            this.f234711d = bVar;
            this.f234712e = inputStream;
        }

        public void close() {
            this.f234712e.close();
        }
    }

    /* renamed from: com.facebook.soloader.r$g */
    public static abstract class C80180g implements Closeable {
        /* renamed from: a */
        public abstract C80176c mo110975a();

        /* renamed from: b */
        public abstract C80178e mo110976b();

        public void close() {
        }
    }

    public C80173r(Context context, String str) {
        super(m97489j(context, str), 1);
        this.f234699c = context;
    }

    /* renamed from: j */
    public static File m97489j(Context context, String str) {
        return new File(context.getApplicationInfo().dataDir + "/" + str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        r3.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        r4 = move-exception;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m97490n(java.io.File r3, byte r4) {
        /*
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "rw"
            r0.<init>(r3, r1)
            r1 = 0
            r0.seek(r1)     // Catch:{ all -> 0x0022 }
            r0.write(r4)     // Catch:{ all -> 0x0022 }
            long r3 = r0.getFilePointer()     // Catch:{ all -> 0x0022 }
            r0.setLength(r3)     // Catch:{ all -> 0x0022 }
            java.io.FileDescriptor r3 = r0.getFD()     // Catch:{ all -> 0x0022 }
            r3.sync()     // Catch:{ all -> 0x0022 }
            r0.close()
            return
        L_0x0022:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r4 = move-exception
            r0.close()     // Catch:{ all -> 0x0029 }
            goto L_0x002d
        L_0x0029:
            r0 = move-exception
            r3.addSuppressed(r0)
        L_0x002d:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C80173r.m97490n(java.io.File, byte):void");
    }

    /* renamed from: a */
    public int mo110960a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        int d;
        synchronized (mo110989i(str)) {
            d = mo110965d(str, i, this.f234655a, threadPolicy);
        }
        return d;
    }

    /* renamed from: b */
    public void mo110961b(int i) {
        File file = this.f234655a;
        if (file.mkdirs() || file.isDirectory()) {
            C80164k kVar = new C80164k(new File(this.f234655a, "dso_lock"));
            try {
                Objects.toString(this.f234655a);
                if (mo110990l(kVar, i, mo110957h())) {
                    kVar = null;
                } else {
                    Objects.toString(this.f234655a);
                }
                if (kVar == null) {
                    Objects.toString(this.f234655a);
                }
            } finally {
                Objects.toString(this.f234655a);
                kVar.close();
            }
        } else {
            throw new IOException("cannot mkdir: " + file);
        }
    }

    /* renamed from: e */
    public final void mo110986e(C80175b[] bVarArr) {
        String[] list = this.f234655a.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals("dso_state") && !str.equals("dso_lock") && !str.equals("dso_deps") && !str.equals("dso_manifest")) {
                    boolean z = false;
                    int i = 0;
                    while (!z && i < bVarArr.length) {
                        if (bVarArr[i].f234708d.equals(str)) {
                            z = true;
                        }
                        i++;
                    }
                    if (!z) {
                        File file = new File(this.f234655a, str);
                        file.toString();
                        SysUtil.m97440a(file);
                    }
                }
            }
            return;
        }
        throw new IOException("unable to list directory " + this.f234655a);
    }

    /* renamed from: f */
    public final void mo110987f(C80177d dVar, byte[] bArr) {
        boolean writable;
        String str = ((C80179f) dVar).f234711d.f234708d;
        try {
            if (this.f234655a.setWritable(true)) {
                mo110988g(dVar, bArr);
                if (writable) {
                    return;
                }
                return;
            }
            throw new IOException("cannot make directory writable for us: " + this.f234655a);
        } finally {
            if (!this.f234655a.setWritable(false)) {
                this.f234655a.getCanonicalPath();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r1.toString();
        com.facebook.soloader.SysUtil.m97440a(r1);
        r4 = new java.io.RandomAccessFile(r1, "rw");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002a */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo110988g(com.facebook.soloader.C80173r.C80177d r9, byte[] r10) {
        /*
            r8 = this;
            java.lang.String r0 = "rw"
            java.io.File r1 = new java.io.File
            java.io.File r2 = r8.f234655a
            r3 = r9
            com.facebook.soloader.r$f r3 = (com.facebook.soloader.C80173r.C80179f) r3
            com.facebook.soloader.r$b r3 = r3.f234711d
            java.lang.String r3 = r3.f234708d
            r1.<init>(r2, r3)
            r2 = 0
            r3 = 0
            boolean r4 = r1.exists()     // Catch:{ IOException -> 0x0098 }
            r5 = 1
            if (r4 == 0) goto L_0x0023
            boolean r4 = r1.setWritable(r5)     // Catch:{ IOException -> 0x0098 }
            if (r4 != 0) goto L_0x0023
            r1.toString()     // Catch:{ IOException -> 0x0098 }
        L_0x0023:
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x002a }
            r4.<init>(r1, r0)     // Catch:{ IOException -> 0x002a }
        L_0x0028:
            r2 = r4
            goto L_0x0036
        L_0x002a:
            r1.toString()     // Catch:{ IOException -> 0x0098 }
            com.facebook.soloader.SysUtil.m97440a(r1)     // Catch:{ IOException -> 0x0098 }
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0098 }
            r4.<init>(r1, r0)     // Catch:{ IOException -> 0x0098 }
            goto L_0x0028
        L_0x0036:
            r0 = r9
            com.facebook.soloader.r$f r0 = (com.facebook.soloader.C80173r.C80179f) r0     // Catch:{ IOException -> 0x0098 }
            java.io.InputStream r0 = r0.f234712e     // Catch:{ IOException -> 0x0098 }
            int r0 = r0.available()     // Catch:{ IOException -> 0x0098 }
            if (r0 <= r5) goto L_0x0049
            java.io.FileDescriptor r4 = r2.getFD()     // Catch:{ IOException -> 0x0098 }
            long r6 = (long) r0     // Catch:{ IOException -> 0x0098 }
            com.facebook.soloader.SysUtil.LollipopSysdeps.fallocateIfSupported(r4, r6)     // Catch:{ IOException -> 0x0098 }
        L_0x0049:
            com.facebook.soloader.r$f r9 = (com.facebook.soloader.C80173r.C80179f) r9     // Catch:{ IOException -> 0x0098 }
            java.io.InputStream r9 = r9.f234712e     // Catch:{ IOException -> 0x0098 }
            r0 = 0
        L_0x004e:
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r0 >= r4) goto L_0x0065
            int r6 = r10.length     // Catch:{ IOException -> 0x0098 }
            int r4 = r4 - r0
            int r4 = java.lang.Math.min(r6, r4)     // Catch:{ IOException -> 0x0098 }
            int r4 = r9.read(r10, r3, r4)     // Catch:{ IOException -> 0x0098 }
            r6 = -1
            if (r4 == r6) goto L_0x0065
            r2.write(r10, r3, r4)     // Catch:{ IOException -> 0x0098 }
            int r0 = r0 + r4
            goto L_0x004e
        L_0x0065:
            long r9 = r2.getFilePointer()     // Catch:{ IOException -> 0x0098 }
            r2.setLength(r9)     // Catch:{ IOException -> 0x0098 }
            boolean r9 = r1.setExecutable(r5, r3)     // Catch:{ IOException -> 0x0098 }
            if (r9 == 0) goto L_0x007f
            boolean r9 = r1.setWritable(r3)
            if (r9 != 0) goto L_0x007b
            r1.toString()
        L_0x007b:
            r2.close()
            return
        L_0x007f:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ IOException -> 0x0098 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0098 }
            r10.<init>()     // Catch:{ IOException -> 0x0098 }
            java.lang.String r0 = "cannot make file executable: "
            r10.append(r0)     // Catch:{ IOException -> 0x0098 }
            r10.append(r1)     // Catch:{ IOException -> 0x0098 }
            java.lang.String r10 = r10.toString()     // Catch:{ IOException -> 0x0098 }
            r9.<init>(r10)     // Catch:{ IOException -> 0x0098 }
            throw r9     // Catch:{ IOException -> 0x0098 }
        L_0x0096:
            r9 = move-exception
            goto L_0x009d
        L_0x0098:
            r9 = move-exception
            com.facebook.soloader.SysUtil.m97440a(r1)     // Catch:{ all -> 0x0096 }
            throw r9     // Catch:{ all -> 0x0096 }
        L_0x009d:
            boolean r10 = r1.setWritable(r3)
            if (r10 != 0) goto L_0x00a6
            r1.toString()
        L_0x00a6:
            if (r2 == 0) goto L_0x00ab
            r2.close()
        L_0x00ab:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C80173r.mo110988g(com.facebook.soloader.r$d, byte[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        if (r1 != null) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        r0.addSuppressed(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        throw r2;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo110957h() {
        /*
            r5 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            com.facebook.soloader.r$g r1 = r5.mo110958k()
            com.facebook.soloader.r$c r2 = r1.mo110975a()     // Catch:{ all -> 0x0036 }
            com.facebook.soloader.r$b[] r2 = r2.f234710a     // Catch:{ all -> 0x0036 }
            r3 = 1
            r0.writeByte(r3)     // Catch:{ all -> 0x0036 }
            int r3 = r2.length     // Catch:{ all -> 0x0036 }
            r0.writeInt(r3)     // Catch:{ all -> 0x0036 }
            r3 = 0
        L_0x0017:
            int r4 = r2.length     // Catch:{ all -> 0x0036 }
            if (r3 >= r4) goto L_0x002b
            r4 = r2[r3]     // Catch:{ all -> 0x0036 }
            java.lang.String r4 = r4.f234708d     // Catch:{ all -> 0x0036 }
            r0.writeString(r4)     // Catch:{ all -> 0x0036 }
            r4 = r2[r3]     // Catch:{ all -> 0x0036 }
            java.lang.String r4 = r4.f234709e     // Catch:{ all -> 0x0036 }
            r0.writeString(r4)     // Catch:{ all -> 0x0036 }
            int r3 = r3 + 1
            goto L_0x0017
        L_0x002b:
            r1.close()
            byte[] r1 = r0.marshall()
            r0.recycle()
            return r1
        L_0x0036:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r2 = move-exception
            if (r1 == 0) goto L_0x0043
            r1.close()     // Catch:{ all -> 0x003f }
            goto L_0x0043
        L_0x003f:
            r1 = move-exception
            r0.addSuppressed(r1)
        L_0x0043:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C80173r.mo110957h():byte[]");
    }

    /* renamed from: i */
    public final Object mo110989i(String str) {
        Object obj;
        synchronized (this.f234701e) {
            obj = ((HashMap) this.f234701e).get(str);
            if (obj == null) {
                obj = new Object();
                ((HashMap) this.f234701e).put(str, obj);
            }
        }
        return obj;
    }

    /* renamed from: k */
    public abstract C80180g mo110958k();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        r11.addSuppressed(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        throw r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b2, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b3, code lost:
        if (r0 != null) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00b9, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r11.addSuppressed(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00bd, code lost:
        throw r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00c0, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00c5, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00c6, code lost:
        r11.addSuppressed(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00c9, code lost:
        throw r12;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0078 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0079  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo110990l(com.facebook.soloader.C80164k r11, int r12, byte[] r13) {
        /*
            r10 = this;
            java.io.File r5 = new java.io.File
            java.io.File r0 = r10.f234655a
            java.lang.String r1 = "dso_state"
            r5.<init>(r0, r1)
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "rw"
            r0.<init>(r5, r1)
            r7 = 1
            r2 = 0
            byte r3 = r0.readByte()     // Catch:{ EOFException -> 0x001e, all -> 0x0020 }
            if (r3 == r7) goto L_0x002c
            java.io.File r3 = r10.f234655a     // Catch:{ EOFException -> 0x001e, all -> 0x0020 }
            java.util.Objects.toString(r3)     // Catch:{ EOFException -> 0x001e, all -> 0x0020 }
        L_0x001e:
            r3 = 0
            goto L_0x002c
        L_0x0020:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x0022 }
        L_0x0022:
            r12 = move-exception
            r0.close()     // Catch:{ all -> 0x0027 }
            goto L_0x002b
        L_0x0027:
            r13 = move-exception
            r11.addSuppressed(r13)
        L_0x002b:
            throw r12
        L_0x002c:
            r0.close()
            java.io.File r4 = new java.io.File
            java.io.File r0 = r10.f234655a
            java.lang.String r6 = "dso_deps"
            r4.<init>(r0, r6)
            r0 = 0
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile
            r6.<init>(r4, r1)
            long r8 = r6.length()     // Catch:{ all -> 0x00be }
            int r1 = (int) r8     // Catch:{ all -> 0x00be }
            byte[] r8 = new byte[r1]     // Catch:{ all -> 0x00be }
            int r9 = r6.read(r8)     // Catch:{ all -> 0x00be }
            if (r9 == r1) goto L_0x004c
            r3 = 0
        L_0x004c:
            boolean r1 = java.util.Arrays.equals(r8, r13)     // Catch:{ all -> 0x00be }
            r1 = r1 ^ r7
            if (r1 == 0) goto L_0x0054
            r3 = 0
        L_0x0054:
            if (r3 == 0) goto L_0x005d
            r1 = r12 & 2
            if (r1 == 0) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            r8 = r0
            goto L_0x0073
        L_0x005d:
            m97490n(r5, r2)     // Catch:{ all -> 0x00be }
            com.facebook.soloader.r$g r0 = r10.mo110958k()     // Catch:{ all -> 0x00be }
            com.facebook.soloader.r$c r1 = r0.mo110975a()     // Catch:{ all -> 0x00b0 }
            com.facebook.soloader.r$e r8 = r0.mo110976b()     // Catch:{ all -> 0x00b0 }
            r10.mo110991m(r3, r1, r8)     // Catch:{ all -> 0x00ac }
            r0.close()     // Catch:{ all -> 0x00be }
            r8 = r1
        L_0x0073:
            r6.close()
            if (r8 != 0) goto L_0x0079
            return r2
        L_0x0079:
            com.facebook.soloader.r$a r9 = new com.facebook.soloader.r$a
            r0 = r9
            r1 = r10
            r2 = r4
            r3 = r13
            r4 = r8
            r6 = r11
            r0.<init>(r2, r3, r4, r5, r6)
            r11 = r12 & 1
            if (r11 == 0) goto L_0x00a8
            java.lang.Thread r11 = new java.lang.Thread
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "SoSync:"
            r12.append(r13)
            java.io.File r13 = r10.f234655a
            java.lang.String r13 = r13.getName()
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r9, r12)
            r11.start()
            goto L_0x00ab
        L_0x00a8:
            r9.run()
        L_0x00ab:
            return r7
        L_0x00ac:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x00ae }
        L_0x00ae:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r12 = move-exception
            if (r0 == 0) goto L_0x00bd
            r0.close()     // Catch:{ all -> 0x00b9 }
            goto L_0x00bd
        L_0x00b9:
            r13 = move-exception
            r11.addSuppressed(r13)     // Catch:{ all -> 0x00be }
        L_0x00bd:
            throw r12     // Catch:{ all -> 0x00be }
        L_0x00be:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            r12 = move-exception
            r6.close()     // Catch:{ all -> 0x00c5 }
            goto L_0x00c9
        L_0x00c5:
            r13 = move-exception
            r11.addSuppressed(r13)
        L_0x00c9:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C80173r.mo110990l(com.facebook.soloader.k, int, byte[]):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008e, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008f, code lost:
        if (r3 != null) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        ((com.facebook.soloader.C80173r.C80179f) r3).close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0097, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r9.addSuppressed(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009b, code lost:
        throw r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a1, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a6, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a7, code lost:
        r9.addSuppressed(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00aa, code lost:
        throw r10;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037 A[Catch:{ all -> 0x0097, all -> 0x00a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020 A[SYNTHETIC] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo110991m(byte r9, com.facebook.soloader.C80173r.C80176c r10, com.facebook.soloader.C80173r.C80178e r11) {
        /*
            r8 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r8.f234655a
            java.lang.String r2 = "dso_manifest"
            r0.<init>(r1, r2)
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile
            java.lang.String r2 = "rw"
            r1.<init>(r0, r2)
            r0 = 1
            if (r9 != r0) goto L_0x001c
            com.facebook.soloader.r$c r9 = com.facebook.soloader.C80173r.C80176c.m97501a(r1)     // Catch:{ Exception -> 0x001c }
            goto L_0x001d
        L_0x0019:
            r9 = move-exception
            goto L_0x00a0
        L_0x001c:
            r9 = 0
        L_0x001d:
            r2 = 0
            if (r9 != 0) goto L_0x0027
            com.facebook.soloader.r$c r9 = new com.facebook.soloader.r$c     // Catch:{ all -> 0x0019 }
            com.facebook.soloader.r$b[] r3 = new com.facebook.soloader.C80173r.C80175b[r2]     // Catch:{ all -> 0x0019 }
            r9.<init>(r3)     // Catch:{ all -> 0x0019 }
        L_0x0027:
            com.facebook.soloader.r$b[] r10 = r10.f234710a     // Catch:{ all -> 0x0019 }
            r8.mo110986e(r10)     // Catch:{ all -> 0x0019 }
            r10 = 32768(0x8000, float:4.5918E-41)
            byte[] r10 = new byte[r10]     // Catch:{ all -> 0x0019 }
        L_0x0031:
            boolean r3 = r11.mo110977a()     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x009c
            com.facebook.soloader.r$d r3 = r11.mo110978b()     // Catch:{ all -> 0x0019 }
            r4 = 1
            r5 = 0
        L_0x003d:
            if (r4 == 0) goto L_0x006c
            com.facebook.soloader.r$b[] r6 = r9.f234710a     // Catch:{ all -> 0x008c }
            int r7 = r6.length     // Catch:{ all -> 0x008c }
            if (r5 >= r7) goto L_0x006c
            r7 = r3
            com.facebook.soloader.r$f r7 = (com.facebook.soloader.C80173r.C80179f) r7     // Catch:{ all -> 0x008c }
            com.facebook.soloader.r$b r7 = r7.f234711d     // Catch:{ all -> 0x008c }
            java.lang.String r7 = r7.f234708d     // Catch:{ all -> 0x008c }
            r6 = r6[r5]     // Catch:{ all -> 0x008c }
            java.lang.String r6 = r6.f234708d     // Catch:{ all -> 0x008c }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x008c }
            if (r6 == 0) goto L_0x0069
            com.facebook.soloader.r$b[] r6 = r9.f234710a     // Catch:{ all -> 0x008c }
            r6 = r6[r5]     // Catch:{ all -> 0x008c }
            java.lang.String r6 = r6.f234709e     // Catch:{ all -> 0x008c }
            r7 = r3
            com.facebook.soloader.r$f r7 = (com.facebook.soloader.C80173r.C80179f) r7     // Catch:{ all -> 0x008c }
            com.facebook.soloader.r$b r7 = r7.f234711d     // Catch:{ all -> 0x008c }
            java.lang.String r7 = r7.f234709e     // Catch:{ all -> 0x008c }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x008c }
            if (r6 == 0) goto L_0x0069
            r4 = 0
        L_0x0069:
            int r5 = r5 + 1
            goto L_0x003d
        L_0x006c:
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x008c }
            java.io.File r6 = r8.f234655a     // Catch:{ all -> 0x008c }
            r7 = r3
            com.facebook.soloader.r$f r7 = (com.facebook.soloader.C80173r.C80179f) r7     // Catch:{ all -> 0x008c }
            com.facebook.soloader.r$b r7 = r7.f234711d     // Catch:{ all -> 0x008c }
            java.lang.String r7 = r7.f234708d     // Catch:{ all -> 0x008c }
            r5.<init>(r6, r7)     // Catch:{ all -> 0x008c }
            boolean r5 = r5.exists()     // Catch:{ all -> 0x008c }
            if (r5 != 0) goto L_0x0081
            r4 = 1
        L_0x0081:
            if (r4 == 0) goto L_0x0086
            r8.mo110987f(r3, r10)     // Catch:{ all -> 0x008c }
        L_0x0086:
            com.facebook.soloader.r$f r3 = (com.facebook.soloader.C80173r.C80179f) r3     // Catch:{ all -> 0x0019 }
            r3.close()     // Catch:{ all -> 0x0019 }
            goto L_0x0031
        L_0x008c:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x008e }
        L_0x008e:
            r10 = move-exception
            if (r3 == 0) goto L_0x009b
            com.facebook.soloader.r$f r3 = (com.facebook.soloader.C80173r.C80179f) r3     // Catch:{ all -> 0x0097 }
            r3.close()     // Catch:{ all -> 0x0097 }
            goto L_0x009b
        L_0x0097:
            r11 = move-exception
            r9.addSuppressed(r11)     // Catch:{ all -> 0x0019 }
        L_0x009b:
            throw r10     // Catch:{ all -> 0x0019 }
        L_0x009c:
            r1.close()
            return
        L_0x00a0:
            throw r9     // Catch:{ all -> 0x00a1 }
        L_0x00a1:
            r10 = move-exception
            r1.close()     // Catch:{ all -> 0x00a6 }
            goto L_0x00aa
        L_0x00a6:
            r11 = move-exception
            r9.addSuppressed(r11)
        L_0x00aa:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C80173r.mo110991m(byte, com.facebook.soloader.r$c, com.facebook.soloader.r$e):void");
    }
}
