package com.tencent.p014mm.sdcard_migrate;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.CancellationSignal;
import android.os.IBinder;
import android.os.Looper;
import android.os.OperationCanceledException;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdcard_migrate.C115961h;
import com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateConfig;
import com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateMonitor;
import com.tencent.p014mm.sdcard_migrate.util.ExtStorageMigrateException;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C116299g2;
import j20.C117292a;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p918s2.C90116e;

/* renamed from: com.tencent.mm.sdcard_migrate.ExtStorageMigrateService */
public class ExtStorageMigrateService extends Service {

    /* renamed from: o */
    public static final /* synthetic */ int f347839o = 0;

    /* renamed from: d */
    public final C115938c f347840d = new C115938c((C115935a) null);

    /* renamed from: e */
    public final C115936b[] f347841e = {null};

    /* renamed from: f */
    public Thread f347842f = null;

    /* renamed from: g */
    public final MigrateResultCallback[] f347843g = {null};

    /* renamed from: h */
    public final boolean[] f347844h = {false};

    /* renamed from: i */
    public final PowerManager.WakeLock[] f347845i = {null};

    /* renamed from: j */
    public final boolean[] f347846j = {false};

    /* renamed from: n */
    public final C115961h.C115962a f347847n = new C115935a();

    /* renamed from: com.tencent.mm.sdcard_migrate.ExtStorageMigrateService$a */
    public class C115935a extends C115961h.C115962a {
        public C115935a() {
        }

        public boolean G90() {
            boolean z;
            C115936b bVar = ExtStorageMigrateService.this.f347841e[0];
            if (bVar == null) {
                return false;
            }
            synchronized (bVar.f347849d) {
                z = bVar.f347849d[0];
            }
            return z;
        }

        /* renamed from: dx */
        public void mo176510dx(ExtStorageMigrateConfig extStorageMigrateConfig) {
            ExtStorageMigrateService extStorageMigrateService = ExtStorageMigrateService.this;
            int i = ExtStorageMigrateService.f347839o;
            extStorageMigrateService.getClass();
            if (!ExtStorageMigrateRoutine.needsToDoMigrate(extStorageMigrateService)) {
                extStorageMigrateService.f347840d.mo176523d(1);
            } else if (extStorageMigrateService.mo176503f()) {
                extStorageMigrateService.f347840d.mo176524e(4, (Throwable) null);
            } else {
                String str = extStorageMigrateConfig.f347832d;
                if (str == null || !new File(str).canRead()) {
                    extStorageMigrateService.f347840d.mo176524e(7, (Throwable) null);
                } else if (extStorageMigrateConfig.f347833e == null) {
                    extStorageMigrateService.f347840d.mo176524e(8, (Throwable) null);
                } else {
                    CancellationSignal cancellationSignal = new CancellationSignal();
                    synchronized (extStorageMigrateService.f347841e) {
                        try {
                            extStorageMigrateService.f347841e[0] = new C115936b(extStorageMigrateConfig, cancellationSignal);
                            Thread thread = new Thread(extStorageMigrateService.f347841e[0], "ExtStg_Migrate");
                            extStorageMigrateService.f347842f = thread;
                            thread.start();
                        } catch (Throwable th) {
                            ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119342d("MicroMsg.ExtStorageMigrateService", th, "Exception occurred.", new Object[0]);
                            extStorageMigrateService.f347840d.mo176524e(5, th);
                        }
                    }
                }
            }
        }

        /* renamed from: uR */
        public void mo176511uR(MigrateResultCallback migrateResultCallback) {
            synchronized (ExtStorageMigrateService.this.f347843g) {
                try {
                    MigrateResultCallback migrateResultCallback2 = ExtStorageMigrateService.this.f347843g[0];
                    if (!(migrateResultCallback2 == null || migrateResultCallback2 == migrateResultCallback)) {
                        int callingPid = Binder.getCallingPid();
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            migrateResultCallback2.mo176468a(0, callingPid);
                        } else {
                            migrateResultCallback2.f347869d.post(new C115967l(migrateResultCallback2, 0, callingPid));
                        }
                    }
                    ExtStorageMigrateService.this.f347843g[0] = migrateResultCallback;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            if (G90()) {
                synchronized (ExtStorageMigrateService.this.f347841e) {
                    C115936b bVar = ExtStorageMigrateService.this.f347841e[0];
                    migrateResultCallback.mo176533o(bVar.f347855j, bVar.f347856n);
                }
            }
        }

        public void vh0() {
            ExtStorageMigrateService extStorageMigrateService = ExtStorageMigrateService.this;
            int i = ExtStorageMigrateService.f347839o;
            extStorageMigrateService.mo176502e();
        }
    }

    /* renamed from: com.tencent.mm.sdcard_migrate.ExtStorageMigrateService$b */
    public class C115936b implements Runnable {

        /* renamed from: d */
        public final boolean[] f347849d = {false};

        /* renamed from: e */
        public final CancellationSignal f347850e;

        /* renamed from: f */
        public final boolean f347851f;

        /* renamed from: g */
        public final Set<String> f347852g;

        /* renamed from: h */
        public final Set<String> f347853h;

        /* renamed from: i */
        public final Map<String, String> f347854i;

        /* renamed from: j */
        public String f347855j = null;

        /* renamed from: n */
        public String f347856n = null;

        /* renamed from: o */
        public float f347857o = 0.0f;

        /* renamed from: com.tencent.mm.sdcard_migrate.ExtStorageMigrateService$b$a */
        public class C115937a {

            /* renamed from: a */
            public final File f347859a;

            /* renamed from: b */
            public final float f347860b;

            public C115937a(C115936b bVar, File file, float f) {
                this.f347859a = file;
                this.f347860b = f;
            }
        }

        public C115936b(ExtStorageMigrateConfig extStorageMigrateConfig, CancellationSignal cancellationSignal) {
            File file;
            this.f347850e = cancellationSignal;
            this.f347851f = extStorageMigrateConfig.f347834f;
            this.f347852g = new HashSet(64);
            this.f347853h = new HashSet(5);
            this.f347854i = new HashMap(5);
            this.f347855j = ExtStorageMigrateService.m163064a(extStorageMigrateConfig.f347832d);
            this.f347856n = ExtStorageMigrateService.m163064a(extStorageMigrateConfig.f347833e);
            if (extStorageMigrateConfig.f347834f) {
                ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119343e("MicroMsg.ExtStorageMigrateService", "[!] Force copy mode enabled, are we under test mode ??", new Object[0]);
            }
            String str = extStorageMigrateConfig.f347832d;
            Set<ExtStorageMigrateConfig.ExtraPathAction> set = extStorageMigrateConfig.f347835g;
            if (set != null) {
                for (Parcelable next : set) {
                    if (next instanceof ExtStorageMigrateConfig.ExtraPathAction.Ignore) {
                        ExtStorageMigrateConfig.ExtraPathAction.Ignore ignore = (ExtStorageMigrateConfig.ExtraPathAction.Ignore) next;
                        File file2 = new File(str, ignore.f347836d);
                        int i = ExtStorageMigrateService.f347839o;
                        try {
                            file = file2.getCanonicalFile();
                        } catch (Throwable th) {
                            ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119342d("MicroMsg.ExtStorageMigrateService", th, "[-] Fail to get canonical file for: %s", file2.getAbsolutePath());
                            file = file2.getAbsoluteFile();
                        }
                        this.f347853h.add(file.getAbsolutePath());
                        mo176517e(str, ignore.f347836d);
                    } else if (next instanceof ExtStorageMigrateConfig.ExtraPathAction.Remap) {
                        ExtStorageMigrateConfig.ExtraPathAction.Remap remap = (ExtStorageMigrateConfig.ExtraPathAction.Remap) next;
                        this.f347854i.put(mo176516d(remap.f347837d), remap.f347838e.startsWith("/") ? remap.f347838e : mo176516d(remap.f347838e));
                        mo176517e(str, remap.f347837d);
                    }
                }
                this.f347852g.add(str);
                ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119341c("MicroMsg.ExtStorageMigrateService", "[+] MigrateTask, mSrcDirPath: %s, mDestDirPath: %s, mRemappedRelPaths: %s", this.f347855j, this.f347856n, this.f347854i);
            }
            ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119341c("MicroMsg.ExtStorageMigrateService", "[+] MigrateTask, pass in config: %s", extStorageMigrateConfig);
        }

        /* renamed from: a */
        public final void mo176513a() {
            String str;
            String str2;
            int i;
            String str3;
            File file;
            boolean z;
            File file2;
            BufferedInputStream bufferedInputStream;
            BufferedOutputStream bufferedOutputStream;
            ExtStorageMigrateMonitor.C85725b bVar;
            Object[] objArr;
            ExtStorageMigrateMonitor.C85724a aVar;
            if (!this.f347855j.equals(this.f347856n)) {
                File file3 = new File(this.f347855j);
                if (file3.exists()) {
                    if (file3.canRead()) {
                        ArrayList arrayList = new ArrayList(20);
                        ArrayList arrayList2 = new ArrayList(64);
                        arrayList.add(new C115937a(this, file3, 1.0f));
                        this.f347857o = 0.0f;
                        ExtStorageMigrateService.this.f347840d.mo176525f((int) 0.0f);
                        while (true) {
                            int i2 = 1;
                            if (arrayList.isEmpty()) {
                                break;
                            }
                            this.f347850e.throwIfCanceled();
                            C115937a aVar2 = (C115937a) arrayList.remove(0);
                            File file4 = aVar2.f347859a;
                            File file5 = new File(mo176514b(file4));
                            if (((HashSet) this.f347853h).contains(mo176518f(file4.getAbsolutePath()))) {
                                ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119343e("MicroMsg.ExtStorageMigrateService", "[!] Do not migrate %s since it was skipped manually.", file4.getAbsolutePath());
                            } else {
                                ExtStorageMigrateMonitor.C85725b bVar2 = ExtStorageMigrateMonitor.f249775e;
                                ((ExtStorageMigrateMonitor.C85724a) bVar2).mo119341c("MicroMsg.ExtStorageMigrateService", "[+] doMigrate, currSrcDir: %s, currDestDir: %s", file4.getAbsolutePath(), file5.getAbsolutePath());
                                if (!this.f347851f) {
                                    if (!((HashSet) this.f347852g).contains(mo176518f(file4.getAbsolutePath()))) {
                                        try {
                                            if (file4.renameTo(file5)) {
                                                Object[] objArr2 = {file4.getAbsolutePath(), file5.getAbsolutePath()};
                                                ExtStorageMigrateMonitor.C85724a aVar3 = (ExtStorageMigrateMonitor.C85724a) bVar2;
                                                aVar3.getClass();
                                                Log.m105919d("MicroMsg.ExtStorageMigrateService", "[*] Move %s to %s.", objArr2);
                                                str = "[*] Move %s to %s.";
                                                str2 = "[!] Do not migrate %s since it was skipped manually.";
                                                try {
                                                    aVar3.mo119339a(3, "MicroMsg.ExtStorageMigrateService", (Throwable) null, str, objArr2);
                                                    float f = this.f347857o + aVar2.f347860b;
                                                    this.f347857o = f;
                                                    ExtStorageMigrateService.this.f347840d.mo176525f((int) Math.floor((double) (f * 0.9f * 100.0f)));
                                                } catch (Throwable unused) {
                                                }
                                            }
                                        } catch (Throwable unused2) {
                                            str = "[*] Move %s to %s.";
                                            str2 = "[!] Do not migrate %s since it was skipped manually.";
                                        }
                                    }
                                }
                                str = "[*] Move %s to %s.";
                                str2 = "[!] Do not migrate %s since it was skipped manually.";
                                this.f347850e.throwIfCanceled();
                                arrayList2.add(file4);
                                File[] listFiles = file4.listFiles();
                                if (listFiles == null || listFiles.length == 0) {
                                    if (!file5.exists() && !file5.mkdirs()) {
                                        ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119340b("MicroMsg.ExtStorageMigrateService", "[-] Fail to create dest dir: %s", file5.getAbsolutePath());
                                    }
                                    float f2 = this.f347857o + aVar2.f347860b;
                                    this.f347857o = f2;
                                    ExtStorageMigrateService.this.f347840d.mo176525f((int) Math.floor((double) (f2 * 0.9f * 100.0f)));
                                } else {
                                    float length = aVar2.f347860b / ((float) listFiles.length);
                                    int length2 = listFiles.length;
                                    int i3 = 0;
                                    while (i3 < length2) {
                                        File file6 = listFiles[i3];
                                        this.f347850e.throwIfCanceled();
                                        if (file6.isDirectory()) {
                                            arrayList.add(new C115937a(this, file6, length));
                                            i = i3;
                                            str3 = str;
                                        } else {
                                            if (((HashSet) this.f347853h).contains(file6.getAbsolutePath())) {
                                                ExtStorageMigrateMonitor.C85725b bVar3 = ExtStorageMigrateMonitor.f249775e;
                                                Object[] objArr3 = new Object[i2];
                                                objArr3[0] = file6.getAbsolutePath();
                                                ((ExtStorageMigrateMonitor.C85724a) bVar3).mo119343e("MicroMsg.ExtStorageMigrateService", str2, objArr3);
                                            } else {
                                                File file7 = new File(mo176514b(file6));
                                                if (file6.getAbsolutePath().equals(file7.getAbsolutePath())) {
                                                    ExtStorageMigrateMonitor.C85725b bVar4 = ExtStorageMigrateMonitor.f249775e;
                                                    Object[] objArr4 = new Object[i2];
                                                    objArr4[0] = file6.getAbsolutePath();
                                                    ((ExtStorageMigrateMonitor.C85724a) bVar4).mo119343e("MicroMsg.ExtStorageMigrateService", "[!] Same source and destination: %s, skip migration.", objArr4);
                                                } else if (!file6.exists() || !file7.exists()) {
                                                    if (!this.f347851f) {
                                                        try {
                                                            this.f347850e.throwIfCanceled();
                                                            z = file6.renameTo(file7);
                                                            ExtStorageMigrateMonitor.C85725b bVar5 = ExtStorageMigrateMonitor.f249775e;
                                                            Object[] objArr5 = new Object[2];
                                                            objArr5[0] = file6.getAbsolutePath();
                                                            objArr5[i2] = file7.getAbsolutePath();
                                                            ExtStorageMigrateMonitor.C85724a aVar4 = (ExtStorageMigrateMonitor.C85724a) bVar5;
                                                            aVar4.getClass();
                                                            String str4 = str;
                                                            try {
                                                                Log.m105919d("MicroMsg.ExtStorageMigrateService", str4, objArr5);
                                                                str3 = str4;
                                                                file = file7;
                                                                file2 = file6;
                                                                i = i3;
                                                                try {
                                                                    aVar4.mo119339a(3, "MicroMsg.ExtStorageMigrateService", (Throwable) null, str3, objArr5);
                                                                } catch (Throwable unused3) {
                                                                }
                                                            } catch (Throwable unused4) {
                                                                str3 = str4;
                                                                file = file7;
                                                                file2 = file6;
                                                                i = i3;
                                                            }
                                                        } catch (Throwable unused5) {
                                                            file = file7;
                                                            file2 = file6;
                                                            i = i3;
                                                            str3 = str;
                                                        }
                                                    } else {
                                                        file = file7;
                                                        file2 = file6;
                                                        i = i3;
                                                        str3 = str;
                                                        z = false;
                                                    }
                                                    if (!z) {
                                                        if (!file.exists()) {
                                                            file.getParentFile().mkdirs();
                                                        }
                                                        BufferedOutputStream bufferedOutputStream2 = null;
                                                        try {
                                                            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file2));
                                                            try {
                                                                File file8 = file;
                                                                BufferedOutputStream bufferedOutputStream3 = new BufferedOutputStream(new FileOutputStream(file8));
                                                                try {
                                                                    byte[] bArr = new byte[4096];
                                                                    while (true) {
                                                                        int read = bufferedInputStream2.read(bArr);
                                                                        if (read <= 0) {
                                                                            break;
                                                                        }
                                                                        this.f347850e.throwIfCanceled();
                                                                        bufferedOutputStream3.write(bArr, 0, read);
                                                                    }
                                                                    bVar = ExtStorageMigrateMonitor.f249775e;
                                                                    objArr = new Object[]{file2.getAbsolutePath(), file8.getAbsolutePath()};
                                                                    aVar = (ExtStorageMigrateMonitor.C85724a) bVar;
                                                                    aVar.getClass();
                                                                    Log.m105919d("MicroMsg.ExtStorageMigrateService", "[*] Copy %s to %s then remove source.", objArr);
                                                                    bufferedOutputStream = bufferedOutputStream3;
                                                                    bufferedInputStream = bufferedInputStream2;
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    bufferedOutputStream = bufferedOutputStream3;
                                                                    bufferedInputStream = bufferedInputStream2;
                                                                    bufferedOutputStream2 = bufferedOutputStream;
                                                                    C116299g2.m163847c(bufferedOutputStream2);
                                                                    C116299g2.m163847c(bufferedInputStream);
                                                                    throw th;
                                                                }
                                                                try {
                                                                    aVar.mo119339a(3, "MicroMsg.ExtStorageMigrateService", (Throwable) null, "[*] Copy %s to %s then remove source.", objArr);
                                                                    C116299g2.m163847c(bufferedOutputStream);
                                                                    C116299g2.m163847c(bufferedInputStream);
                                                                    if (!file2.delete()) {
                                                                        ((ExtStorageMigrateMonitor.C85724a) bVar).mo119343e("MicroMsg.ExtStorageMigrateService", "[!] Fail to delete src file: %s", file2.getAbsolutePath());
                                                                    }
                                                                    float f3 = this.f347857o + length;
                                                                    this.f347857o = f3;
                                                                    ExtStorageMigrateService.this.f347840d.mo176525f((int) Math.floor((double) (f3 * 0.9f * 100.0f)));
                                                                } catch (Throwable th4) {
                                                                    th = th4;
                                                                    bufferedOutputStream2 = bufferedOutputStream;
                                                                    C116299g2.m163847c(bufferedOutputStream2);
                                                                    C116299g2.m163847c(bufferedInputStream);
                                                                    throw th;
                                                                }
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                                bufferedInputStream = bufferedInputStream2;
                                                                C116299g2.m163847c(bufferedOutputStream2);
                                                                C116299g2.m163847c(bufferedInputStream);
                                                                throw th;
                                                            }
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            bufferedInputStream = null;
                                                            C116299g2.m163847c(bufferedOutputStream2);
                                                            C116299g2.m163847c(bufferedInputStream);
                                                            throw th;
                                                        }
                                                    }
                                                    float f35 = this.f347857o + length;
                                                    this.f347857o = f35;
                                                    ExtStorageMigrateService.this.f347840d.mo176525f((int) Math.floor((double) (f35 * 0.9f * 100.0f)));
                                                } else {
                                                    ExtStorageMigrateMonitor.C85725b bVar6 = ExtStorageMigrateMonitor.f249775e;
                                                    Object[] objArr6 = new Object[2];
                                                    objArr6[0] = file6.getAbsolutePath();
                                                    objArr6[i2] = file7.getAbsolutePath();
                                                    ((ExtStorageMigrateMonitor.C85724a) bVar6).mo119343e("MicroMsg.ExtStorageMigrateService", "[!] Both source[%s] and dest[%s] file are exist, skip migrating.", objArr6);
                                                }
                                            }
                                            i = i3;
                                            str3 = str;
                                            float f352 = this.f347857o + length;
                                            this.f347857o = f352;
                                            ExtStorageMigrateService.this.f347840d.mo176525f((int) Math.floor((double) (f352 * 0.9f * 100.0f)));
                                        }
                                        i3 = i + 1;
                                        str = str3;
                                        i2 = 1;
                                    }
                                }
                            }
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            this.f347850e.throwIfCanceled();
                            File file9 = (File) arrayList2.get(size);
                            if (file9.exists() && !file9.delete()) {
                                ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119343e("MicroMsg.ExtStorageMigrateService", "[!] Fail to delete dir: %s", file9.getAbsolutePath());
                            }
                        }
                        arrayList2.clear();
                        if (Float.compare(this.f347857o, 1.0f) != 0) {
                            ExtStorageMigrateService.this.f347840d.mo176525f(100);
                            return;
                        }
                        return;
                    }
                    throw new IOException(file3.getAbsolutePath() + " cannot be read.");
                }
            }
        }

        /* renamed from: b */
        public final String mo176514b(File file) {
            String d = mo176516d(file.getAbsolutePath().substring(this.f347855j.length()));
            if (d.startsWith("/")) {
                d = d.substring(1);
            }
            ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119341c("MicroMsg.ExtStorageMigrateService", "[+] getMigratedFilePath, relSrcPath: %s", d);
            String str = d;
            while (true) {
                if (TextUtils.isEmpty(str)) {
                    break;
                }
                String str2 = (String) ((HashMap) this.f347854i).get(str);
                ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119341c("MicroMsg.ExtStorageMigrateService", "[+] getMigratedFilePath, currRelSrcPath: %s, newRelPath: %s", str, str2);
                if (str2 == null) {
                    int lastIndexOf = str.lastIndexOf(47);
                    if (lastIndexOf < 0) {
                        break;
                    }
                    str = str.substring(0, lastIndexOf);
                } else {
                    d = str2 + d.substring(str.length());
                    break;
                }
            }
            if (d.startsWith("/")) {
                ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119341c("MicroMsg.ExtStorageMigrateService", "[+] getMigratedFilePath, result: %s", d);
                return d;
            }
            String str3 = this.f347856n + "/" + d;
            ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119341c("MicroMsg.ExtStorageMigrateService", "[+] getMigratedFilePath, result: %s", str3);
            return str3;
        }

        /* renamed from: c */
        public final void mo176515c(boolean z) {
            synchronized (this.f347849d) {
                this.f347849d[0] = z;
            }
        }

        /* renamed from: d */
        public final String mo176516d(String str) {
            if (str == null || str.isEmpty()) {
                return str;
            }
            String path = new File(str).getPath();
            return (path.endsWith("/") || path.endsWith("\\")) ? path.substring(0, path.length() - 1) : path;
        }

        /* renamed from: e */
        public final void mo176517e(String str, String str2) {
            String f = mo176518f(str);
            File file = new File(f, str2);
            do {
                this.f347852g.add(mo176518f(file.getAbsolutePath()));
                file = file.getParentFile();
                if (file == null || f.equals(file.getAbsolutePath())) {
                }
                this.f347852g.add(mo176518f(file.getAbsolutePath()));
                file = file.getParentFile();
                return;
            } while (f.equals(file.getAbsolutePath()));
        }

        /* renamed from: f */
        public final String mo176518f(String str) {
            return (str == null || str.isEmpty()) ? str : (str.endsWith("/") || str.endsWith("\\")) ? str.substring(0, str.length() - 1) : str;
        }

        public void run() {
            try {
                ExtStorageMigrateService.m163065b(ExtStorageMigrateService.this);
                mo176515c(true);
                ExtStorageMigrateService.this.f347840d.mo176526g(this.f347855j, this.f347856n);
                mo176513a();
                C85730f.m105912b(this.f347855j, true);
                ExtStorageMigrateService.this.f347840d.mo176527h();
            } catch (OperationCanceledException e) {
                ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119342d("MicroMsg.ExtStorageMigrateService", e, "[-] Operation cancelled.", new Object[0]);
                ExtStorageMigrateService extStorageMigrateService = ExtStorageMigrateService.this;
                int i = ExtStorageMigrateService.f347839o;
                synchronized (extStorageMigrateService.f347846j) {
                    if (extStorageMigrateService.f347846j[0]) {
                        ExtStorageMigrateService extStorageMigrateService2 = ExtStorageMigrateService.this;
                        synchronized (extStorageMigrateService2.f347846j) {
                            extStorageMigrateService2.f347846j[0] = false;
                            ExtStorageMigrateService.this.f347840d.mo176523d(3);
                        }
                    } else {
                        ExtStorageMigrateService.this.f347840d.mo176524e(6, (Throwable) null);
                    }
                }
            } catch (Throwable th) {
                mo176515c(false);
                ExtStorageMigrateMonitor.m105903b();
                ExtStorageMigrateService extStorageMigrateService3 = ExtStorageMigrateService.this;
                int i2 = ExtStorageMigrateService.f347839o;
                extStorageMigrateService3.mo176504g();
                ExtStorageMigrateService.this.mo176502e();
                throw th;
            }
            mo176515c(false);
            ExtStorageMigrateMonitor.m105903b();
            ExtStorageMigrateService.this.mo176504g();
            ExtStorageMigrateService.this.mo176502e();
        }
    }

    /* renamed from: com.tencent.mm.sdcard_migrate.ExtStorageMigrateService$c */
    public final class C115938c {

        /* renamed from: a */
        public final C90116e.C90121c[] f347861a = {null};

        /* renamed from: b */
        public final int[] f347862b = {-1};

        public C115938c(C115935a aVar) {
        }

        /* renamed from: a */
        public final C90116e.C90119a mo176520a() {
            Intent intent = new Intent(ExtStorageMigrateService.this, ExtStorageMigrateService.class);
            intent.setAction(ExtStorageMigrateRoutine.SERVICE_ACTION_CANCEL_MIGRATE);
            C90116e.C90119a.C90120a aVar = new C90116e.C90119a.C90120a(C0966R.C0969drawable.c9m, ExtStorageMigrateService.m163066c(C0966R.string.auj), PendingIntent.getService(ExtStorageMigrateService.this, ExtStorageMigrateRoutine.PENDING_INTENT_REQUEST_CANCEL_MIGRATION, intent, 268435456));
            aVar.f258785d = false;
            return aVar.mo124376a();
        }

        /* renamed from: b */
        public final PendingIntent mo176521b(boolean z) {
            Intent intent = new Intent(ExtStorageMigrateService.this, ExtStorageMigrateAuxActivity.class);
            intent.setAction(ExtStorageMigrateRoutine.AUXUI_ACTION_DO_MIGRATE_ROUTINE);
            intent.putExtra(ExtStorageMigrateRoutine.AUXUI_PARAM_IS_MIGRAION_END, z);
            intent.addFlags(268435456);
            return PendingIntent.getActivity(ExtStorageMigrateService.this, ExtStorageMigrateRoutine.PENDING_INTENT_REQUEST_LAUNCH_QUESTIONNAIRE, intent, 268435456);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:8|9|(3:11|(2:12|(2:14|(2:28|16))(2:27|17))|(1:19))|20|21|22|23) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0063 */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p918s2.C90116e.C90121c mo176522c(boolean r7) {
            /*
                r6 = this;
                s2.e$c[] r0 = r6.f347861a
                monitor-enter(r0)
                s2.e$c[] r1 = r6.f347861a     // Catch:{ all -> 0x008a }
                r2 = 0
                r1 = r1[r2]     // Catch:{ all -> 0x008a }
                if (r1 == 0) goto L_0x000e
                if (r7 != 0) goto L_0x000e
                monitor-exit(r0)     // Catch:{ all -> 0x008a }
                return r1
            L_0x000e:
                int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0063 }
                r1 = 26
                if (r7 < r1) goto L_0x0063
                com.tencent.mm.sdcard_migrate.ExtStorageMigrateService r7 = com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateService.this     // Catch:{ all -> 0x0063 }
                java.lang.String r1 = "notification"
                java.lang.Object r7 = r7.getSystemService(r1)     // Catch:{ all -> 0x0063 }
                android.app.NotificationManager r7 = (android.app.NotificationManager) r7     // Catch:{ all -> 0x0063 }
                java.util.List r1 = r7.getNotificationChannels()     // Catch:{ all -> 0x0063 }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0063 }
            L_0x0026:
                boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0063 }
                if (r3 == 0) goto L_0x0040
                java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0063 }
                android.app.NotificationChannel r3 = (android.app.NotificationChannel) r3     // Catch:{ all -> 0x0063 }
                java.lang.String r4 = "reminder_channel_id"
                java.lang.String r3 = r3.getId()     // Catch:{ all -> 0x0063 }
                boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x0063 }
                if (r3 == 0) goto L_0x0026
                r1 = 1
                goto L_0x0041
            L_0x0040:
                r1 = 0
            L_0x0041:
                if (r1 != 0) goto L_0x0063
                android.app.NotificationChannel r1 = new android.app.NotificationChannel     // Catch:{ all -> 0x0063 }
                java.lang.String r3 = "reminder_channel_id"
                com.tencent.mm.sdcard_migrate.ExtStorageMigrateService r4 = com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateService.this     // Catch:{ all -> 0x0063 }
                r5 = 2131833707(0x7f11336b, float:1.9300504E38)
                java.lang.String r4 = r4.getString(r5)     // Catch:{ all -> 0x0063 }
                r5 = 2
                r1.<init>(r3, r4, r5)     // Catch:{ all -> 0x0063 }
                com.tencent.mm.sdcard_migrate.ExtStorageMigrateService r3 = com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateService.this     // Catch:{ all -> 0x0063 }
                r4 = 2131833706(0x7f11336a, float:1.9300502E38)
                java.lang.String r3 = r3.getString(r4)     // Catch:{ all -> 0x0063 }
                r1.setDescription(r3)     // Catch:{ all -> 0x0063 }
                r7.createNotificationChannel(r1)     // Catch:{ all -> 0x0063 }
            L_0x0063:
                s2.e$c r7 = new s2.e$c     // Catch:{ all -> 0x008a }
                com.tencent.mm.sdcard_migrate.ExtStorageMigrateService r1 = com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateService.this     // Catch:{ all -> 0x008a }
                android.content.Context r1 = r1.getApplicationContext()     // Catch:{ all -> 0x008a }
                java.lang.String r3 = "reminder_channel_id"
                r7.<init>(r1, r3)     // Catch:{ all -> 0x008a }
                r1 = 2131821604(0x7f110424, float:1.9275956E38)
                java.lang.String r1 = com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateService.m163066c(r1)     // Catch:{ all -> 0x008a }
                r7.mo124383h(r1)     // Catch:{ all -> 0x008a }
                r1 = 2131233736(0x7f080bc8, float:1.8083618E38)
                android.app.Notification r3 = r7.f258814z     // Catch:{ all -> 0x008a }
                r3.icon = r1     // Catch:{ all -> 0x008a }
                r7.mo124380e(r2)     // Catch:{ all -> 0x008a }
                s2.e$c[] r1 = r6.f347861a     // Catch:{ all -> 0x008a }
                r1[r2] = r7     // Catch:{ all -> 0x008a }
                monitor-exit(r0)     // Catch:{ all -> 0x008a }
                return r7
            L_0x008a:
                r7 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x008a }
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateService.C115938c.mo176522c(boolean):s2.e$c");
        }

        /* renamed from: d */
        public void mo176523d(int i) {
            C90116e.C90121c c = mo176522c(true);
            c.f258814z.when = System.currentTimeMillis();
            c.mo124382g(ExtStorageMigrateService.m163066c(C0966R.string.cha));
            c.mo124386k(0, 0, false);
            c.mo124384i(16, true);
            c.f258795g = mo176521b(true);
            c.mo124384i(2, false);
            ExtStorageMigrateService.m163067d(ExtStorageMigrateService.this, c.mo124378b());
            synchronized (ExtStorageMigrateService.this.f347843g) {
                MigrateResultCallback migrateResultCallback = ExtStorageMigrateService.this.f347843g[0];
                if (migrateResultCallback != null) {
                    try {
                        if (migrateResultCallback.asBinder().isBinderAlive()) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                migrateResultCallback.mo176469c(i);
                            } else {
                                migrateResultCallback.f347869d.post(new C115964i(migrateResultCallback, i));
                            }
                        }
                    } catch (Throwable th) {
                        ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119342d("MicroMsg.MigrateResultCallbackHelper", th, "[-] Exception occurred.", new Object[0]);
                    }
                }
            }
        }

        /* renamed from: e */
        public void mo176524e(int i, Throwable th) {
            C90116e.C90121c c = mo176522c(true);
            c.f258814z.when = System.currentTimeMillis();
            c.mo124382g(i == 6 ? ExtStorageMigrateService.m163066c(C0966R.string.chd) : ExtStorageMigrateService.m163066c(C0966R.string.chb));
            c.mo124386k(0, 0, false);
            c.mo124384i(16, true);
            c.f258795g = mo176521b(true);
            c.mo124384i(2, false);
            ExtStorageMigrateService.m163067d(ExtStorageMigrateService.this, c.mo124378b());
            synchronized (ExtStorageMigrateService.this.f347843g) {
                MigrateResultCallback migrateResultCallback = ExtStorageMigrateService.this.f347843g[0];
                if (migrateResultCallback != null) {
                    try {
                        if (migrateResultCallback.asBinder().isBinderAlive()) {
                            migrateResultCallback.mo176532m(i, new ExtStorageMigrateException(th));
                        }
                    } catch (Throwable th4) {
                        ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119342d("MicroMsg.MigrateResultCallbackHelper", th4, "[-] Exception occurred.", new Object[0]);
                    }
                }
            }
        }

        /* renamed from: f */
        public void mo176525f(int i) {
            synchronized (this.f347862b) {
                int i2 = this.f347862b[0];
                if (i2 == -1 || (i != i2 && i % 10 == 0)) {
                    C90116e.C90121c c = mo176522c(false);
                    c.mo124382g(ExtStorageMigrateService.m163066c(C0966R.string.chf));
                    c.mo124384i(2, true);
                    c.mo124386k(100, i, false);
                    ((NotificationManager) ExtStorageMigrateService.this.getSystemService("notification")).notify(ExtStorageMigrateRoutine.NOTIFICATION_TASK_ID, c.mo124378b());
                }
                this.f347862b[0] = i;
            }
            synchronized (ExtStorageMigrateService.this.f347843g) {
                MigrateResultCallback migrateResultCallback = ExtStorageMigrateService.this.f347843g[0];
                if (migrateResultCallback != null) {
                    try {
                        if (migrateResultCallback.asBinder().isBinderAlive()) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                migrateResultCallback.mo176471f(i);
                            } else {
                                migrateResultCallback.f347869d.post(new C115965j(migrateResultCallback, i));
                            }
                        }
                    } catch (Throwable th) {
                        ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119342d("MicroMsg.MigrateResultCallbackHelper", th, "[-] Exception occurred.", new Object[0]);
                    }
                }
            }
        }

        /* renamed from: g */
        public void mo176526g(String str, String str2) {
            C90116e.C90121c c = mo176522c(true);
            c.mo124382g(ExtStorageMigrateService.m163066c(C0966R.string.chf));
            c.mo124386k(100, 0, false);
            c.mo124384i(2, true);
            c.f258790b.add(mo176520a());
            c.f258795g = mo176521b(false);
            ((NotificationManager) ExtStorageMigrateService.this.getSystemService("notification")).notify(ExtStorageMigrateRoutine.NOTIFICATION_TASK_ID, c.mo124378b());
            synchronized (ExtStorageMigrateService.this.f347843g) {
                MigrateResultCallback migrateResultCallback = ExtStorageMigrateService.this.f347843g[0];
                if (migrateResultCallback != null) {
                    try {
                        if (migrateResultCallback.asBinder().isBinderAlive()) {
                            migrateResultCallback.mo176533o(str, str2);
                        }
                    } catch (Throwable th) {
                        ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119342d("MicroMsg.MigrateResultCallbackHelper", th, "[-] Exception occurred.", new Object[0]);
                    }
                }
            }
        }

        /* renamed from: h */
        public void mo176527h() {
            C90116e.C90121c c = mo176522c(true);
            c.f258814z.when = System.currentTimeMillis();
            c.mo124382g(ExtStorageMigrateService.m163066c(C0966R.string.chj));
            c.mo124386k(0, 0, false);
            c.mo124384i(16, true);
            c.f258795g = mo176521b(true);
            c.mo124384i(2, false);
            ExtStorageMigrateService.m163067d(ExtStorageMigrateService.this, c.mo124378b());
            synchronized (ExtStorageMigrateService.this.f347843g) {
                MigrateResultCallback migrateResultCallback = ExtStorageMigrateService.this.f347843g[0];
                if (migrateResultCallback != null) {
                    try {
                        if (migrateResultCallback.asBinder().isBinderAlive()) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                migrateResultCallback.mo176473j();
                            } else {
                                migrateResultCallback.f347869d.post(new C115966k(migrateResultCallback));
                            }
                        }
                    } catch (Throwable th) {
                        ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119342d("MicroMsg.MigrateResultCallbackHelper", th, "[-] Exception occurred.", new Object[0]);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static String m163064a(String str) {
        try {
            return new File(str).getCanonicalPath();
        } catch (Throwable th) {
            Object[] objArr = {str};
            ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119342d("MicroMsg.ExtStorageMigrateService", th, "[-] Fail to get canonical path for: %s", objArr);
            return new File(str).getAbsolutePath();
        }
    }

    /* renamed from: b */
    public static void m163065b(ExtStorageMigrateService extStorageMigrateService) {
        synchronized (extStorageMigrateService.f347845i) {
            if (extStorageMigrateService.f347845i[0] == null) {
                extStorageMigrateService.f347845i[0] = ((PowerManager) extStorageMigrateService.getSystemService("power")).newWakeLock(1, "wx:extstg_migrate");
                extStorageMigrateService.f347845i[0].setReferenceCounted(false);
            }
            if (!extStorageMigrateService.f347845i[0].isHeld()) {
                PowerManager.WakeLock wakeLock = extStorageMigrateService.f347845i[0];
                C117292a.m165357c(wakeLock, "com/tencent/mm/sdcard_migrate/ExtStorageMigrateService", "acquireWakeLock", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                wakeLock.acquire();
                C117292a.m165359e(wakeLock, "com/tencent/mm/sdcard_migrate/ExtStorageMigrateService", "acquireWakeLock", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119341c("MicroMsg.ExtStorageMigrateService", "[+] WakeLock acquired.", new Object[0]);
            } else {
                ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119343e("MicroMsg.ExtStorageMigrateService", "[!] Duplicated wakelock acquire.", new Object[0]);
            }
        }
    }

    /* renamed from: c */
    public static String m163066c(int i) {
        return MMApplicationContext.getResources().getString(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: int} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m163067d(com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateService r4, android.app.Notification r5) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 1
            r3 = 24
            if (r0 < r3) goto L_0x000f
            if (r5 == 0) goto L_0x000b
            r2 = 2
        L_0x000b:
            r4.stopForeground(r2)
            goto L_0x0016
        L_0x000f:
            if (r5 != 0) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            r4.stopForeground(r2)
        L_0x0016:
            java.lang.String r0 = "notification"
            java.lang.Object r0 = r4.getSystemService(r0)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            r2 = 1027(0x403, float:1.439E-42)
            if (r5 == 0) goto L_0x0026
            r0.notify(r2, r5)
            goto L_0x0029
        L_0x0026:
            r0.cancel(r2)
        L_0x0029:
            boolean[] r5 = r4.f347844h
            monitor-enter(r5)
            boolean[] r4 = r4.f347844h     // Catch:{ all -> 0x0032 }
            r4[r1] = r1     // Catch:{ all -> 0x0032 }
            monitor-exit(r5)     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0032 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateService.m163067d(com.tencent.mm.sdcard_migrate.ExtStorageMigrateService, android.app.Notification):void");
    }

    /* renamed from: e */
    public final void mo176502e() {
        ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119341c("MicroMsg.ExtStorageMigrateService", "[+] expectedStopSelf called.", new Object[0]);
        synchronized (this.f347846j) {
            this.f347846j[0] = true;
        }
        stopSelf();
    }

    /* renamed from: f */
    public final boolean mo176503f() {
        boolean z;
        boolean z2;
        synchronized (this.f347841e) {
            z = false;
            C115936b bVar = this.f347841e[0];
            if (bVar != null) {
                synchronized (bVar.f347849d) {
                    z2 = bVar.f347849d[0];
                }
                if (z2) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: g */
    public final void mo176504g() {
        synchronized (this.f347845i) {
            PowerManager.WakeLock wakeLock = this.f347845i[0];
            if (wakeLock != null && wakeLock.isHeld()) {
                PowerManager.WakeLock wakeLock2 = this.f347845i[0];
                C117292a.m165357c(wakeLock2, "com/tencent/mm/sdcard_migrate/ExtStorageMigrateService", "releaseWakeLock", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                wakeLock2.release();
                C117292a.m165359e(wakeLock2, "com/tencent/mm/sdcard_migrate/ExtStorageMigrateService", "releaseWakeLock", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                this.f347845i[0] = null;
                ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119341c("MicroMsg.ExtStorageMigrateService", "[+] WakeLock released.", new Object[0]);
            }
        }
    }

    public IBinder onBind(Intent intent) {
        C115961h.C115962a aVar = this.f347847n;
        aVar.getClass();
        return aVar;
    }

    public void onCreate() {
        super.onCreate();
        synchronized (this.f347841e) {
            this.f347841e[0] = null;
            this.f347842f = null;
        }
        synchronized (this.f347843g) {
            this.f347843g[0] = null;
        }
        synchronized (this.f347844h) {
            this.f347844h[0] = false;
        }
    }

    public void onDestroy() {
        boolean z;
        boolean z2;
        boolean[] zArr;
        boolean z3;
        ((ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e).mo119341c("MicroMsg.ExtStorageMigrateService", "[+] OnDestroy called.", new Object[0]);
        synchronized (this.f347841e) {
            try {
                if (mo176503f()) {
                    this.f347841e[0].f347850e.cancel();
                    try {
                        this.f347842f.join();
                    } catch (InterruptedException unused) {
                    }
                } else {
                    synchronized (this.f347844h) {
                        z2 = this.f347844h[0];
                    }
                    if (z2) {
                        synchronized (this.f347846j) {
                            zArr = this.f347846j;
                            z3 = zArr[0];
                        }
                        if (z3) {
                            synchronized (zArr) {
                                this.f347846j[0] = false;
                            }
                            this.f347840d.mo176523d(2);
                        } else {
                            this.f347840d.mo176524e(6, (Throwable) null);
                        }
                    }
                }
                this.f347841e[0] = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f347844h) {
            z = this.f347844h[0];
        }
        if (z) {
            stopForeground(true);
        }
        mo176504g();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        boolean z;
        ExtStorageMigrateMonitor.C85724a aVar = (ExtStorageMigrateMonitor.C85724a) ExtStorageMigrateMonitor.f249775e;
        aVar.mo119341c("MicroMsg.ExtStorageMigrateService", "[+] OnStartCommand called, intent: %s", intent);
        if (intent == null) {
            aVar.mo119340b("MicroMsg.ExtStorageMigrateService", "[-] intent is null, skip rest logic.", new Object[0]);
            mo176502e();
        } else {
            String action = intent.getAction();
            if (action == null) {
                aVar.mo119340b("MicroMsg.ExtStorageMigrateService", "[-] action is null, skip rest logic.", new Object[0]);
                mo176502e();
            } else if (ExtStorageMigrateRoutine.SERVICE_ACTION_STARTUP.equals(action)) {
                C115938c cVar = this.f347840d;
                ExtStorageMigrateService extStorageMigrateService = ExtStorageMigrateService.this;
                synchronized (extStorageMigrateService.f347844h) {
                    z = extStorageMigrateService.f347844h[0];
                }
                if (z || ExtStorageMigrateService.this.mo176503f()) {
                    aVar.mo119343e("MicroMsg.ExtStorageMigrateService", "[!] Already on foreground or migrating logic, skip startup steps.", new Object[0]);
                } else {
                    C90116e.C90121c c = cVar.mo176522c(true);
                    c.f258814z.when = System.currentTimeMillis();
                    c.mo124382g(m163066c(C0966R.string.chi));
                    c.mo124386k(0, 0, true);
                    c.mo124384i(2, true);
                    c.f258790b.add(cVar.mo176520a());
                    c.f258795g = cVar.mo176521b(false);
                    ExtStorageMigrateService extStorageMigrateService2 = ExtStorageMigrateService.this;
                    extStorageMigrateService2.startForeground(ExtStorageMigrateRoutine.NOTIFICATION_TASK_ID, c.mo124378b());
                    synchronized (extStorageMigrateService2.f347844h) {
                        extStorageMigrateService2.f347844h[0] = true;
                    }
                }
            } else if (ExtStorageMigrateRoutine.SERVICE_ACTION_CANCEL_MIGRATE.equals(action)) {
                mo176502e();
            } else {
                aVar.mo119340b("MicroMsg.ExtStorageMigrateService", "[-] Unknown action: %s", action);
            }
        }
        return 2;
    }
}
