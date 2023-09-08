package com.tencent.p014mm.sdcard_migrate;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.app.C80589e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.PeriodRecorder;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kj2.C117407d;

/* renamed from: com.tencent.mm.sdcard_migrate.ExtStorageMigrateMonitor */
public final class ExtStorageMigrateMonitor {

    /* renamed from: a */
    public static final String f249771a = C80589e.f235762c;

    /* renamed from: b */
    public static final PeriodRecorder f249772b = new PeriodRecorder("ExtStorageMigrateMonitor", TimeUnit.DAYS.toMillis(1), true, true);

    /* renamed from: c */
    public static final boolean[] f249773c = {false};

    /* renamed from: d */
    public static final PendingOps f249774d = new PendingOps();

    /* renamed from: e */
    public static final C85725b f249775e = new C85724a();

    /* renamed from: com.tencent.mm.sdcard_migrate.ExtStorageMigrateMonitor$PendingOps */
    public static class PendingOps implements Parcelable {
        public static final Parcelable.Creator<PendingOps> CREATOR = new C85721a();

        /* renamed from: d */
        public final List<C85722b> f249776d = Collections.synchronizedList(new ArrayList(16));

        /* renamed from: e */
        public final List<C85723c> f249777e = Collections.synchronizedList(new ArrayList(32));

        /* renamed from: com.tencent.mm.sdcard_migrate.ExtStorageMigrateMonitor$PendingOps$a */
        public class C85721a implements Parcelable.Creator<PendingOps> {
            public Object createFromParcel(Parcel parcel) {
                int readInt = parcel.readInt();
                if (readInt == -33554431) {
                    PendingOps pendingOps = new PendingOps();
                    int readInt2 = parcel.readInt();
                    for (int i = 0; i < readInt2; i++) {
                        pendingOps.f249776d.add(new C85722b(parcel.readLong(), parcel.readLong(), parcel.readLong()));
                    }
                    int readInt3 = parcel.readInt();
                    for (int i2 = 0; i2 < readInt3; i2++) {
                        pendingOps.f249777e.add(new C85723c(parcel.readInt(), parcel.readString(), parcel.readString()));
                    }
                    return pendingOps;
                }
                throw new IllegalStateException("Version mismatch, expected: " + Integer.toHexString(-33554431) + ", got: " + Integer.toHexString(readInt));
            }

            public Object[] newArray(int i) {
                return new PendingOps[i];
            }
        }

        /* renamed from: com.tencent.mm.sdcard_migrate.ExtStorageMigrateMonitor$PendingOps$b */
        public static class C85722b {

            /* renamed from: a */
            public long f249778a;

            /* renamed from: b */
            public long f249779b;

            /* renamed from: c */
            public long f249780c;

            public C85722b(long j, long j2, long j3) {
                this.f249778a = j;
                this.f249779b = j2;
                this.f249780c = j3;
            }

            public String toString() {
                return "IDKeyOp {id:" + this.f249778a + ", key:" + this.f249779b + ", value:" + this.f249780c + "}";
            }
        }

        /* renamed from: com.tencent.mm.sdcard_migrate.ExtStorageMigrateMonitor$PendingOps$c */
        public static class C85723c {

            /* renamed from: a */
            public int f249781a;

            /* renamed from: b */
            public String f249782b;

            /* renamed from: c */
            public String f249783c;

            public C85723c(int i, String str, String str2) {
                this.f249781a = i;
                this.f249782b = str;
                this.f249783c = str2;
            }

            public String toString() {
                return "LogOp {level:" + this.f249781a + ", tag:" + this.f249782b + ", msg:" + this.f249783c + "}";
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(-33554431);
            parcel.writeInt(this.f249776d.size());
            for (C85722b next : this.f249776d) {
                parcel.writeLong(next.f249778a);
                parcel.writeLong(next.f249779b);
                parcel.writeLong(next.f249780c);
            }
            parcel.writeInt(this.f249777e.size());
            for (C85723c next2 : this.f249777e) {
                parcel.writeInt(next2.f249781a);
                parcel.writeString(next2.f249782b);
                parcel.writeString(next2.f249783c);
            }
        }
    }

    /* renamed from: com.tencent.mm.sdcard_migrate.ExtStorageMigrateMonitor$a */
    public class C85724a implements C85725b {
        /* renamed from: a */
        public final void mo119339a(int i, String str, Throwable th, String str2, Object... objArr) {
            String str3;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.ENGLISH);
            String str4 = "[@" + simpleDateFormat.format(new Date()) + "|" + ExtStorageMigrateMonitor.f249771a + "]";
            if (objArr == null || objArr.length == 0) {
                str3 = str4 + str2;
            } else {
                str3 = str4 + String.format(str2, objArr);
            }
            if (th != null) {
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                th.printStackTrace(printWriter);
                printWriter.flush();
                str3 = str3 + "\n" + stringWriter.toString();
                printWriter.close();
            }
            boolean[] zArr = ExtStorageMigrateMonitor.f249773c;
            synchronized (zArr) {
                if (zArr[0]) {
                    ExtStorageMigrateMonitor.m105902a(i, str, str3);
                } else if (i != 3) {
                    ExtStorageMigrateMonitor.f249774d.f249777e.add(new PendingOps.C85723c(i, str, str3));
                }
            }
        }

        /* renamed from: b */
        public void mo119340b(String str, String str2, Object... objArr) {
            Log.m105921e(str, str2, objArr);
            mo119339a(6, str, (Throwable) null, str2, objArr);
        }

        /* renamed from: c */
        public void mo119341c(String str, String str2, Object... objArr) {
            Log.m105925i(str, str2, objArr);
            mo119339a(4, str, (Throwable) null, str2, objArr);
        }

        /* renamed from: d */
        public void mo119342d(String str, Throwable th, String str2, Object... objArr) {
            Log.printErrStackTrace(str, th, str2, objArr);
            mo119339a(6, str, th, str2, objArr);
        }

        /* renamed from: e */
        public void mo119343e(String str, String str2, Object... objArr) {
            Log.m105929w(str, str2, objArr);
            mo119339a(5, str, (Throwable) null, str2, objArr);
        }
    }

    /* renamed from: com.tencent.mm.sdcard_migrate.ExtStorageMigrateMonitor$b */
    public interface C85725b {
    }

    /* renamed from: a */
    public static void m105902a(int i, String str, String str2) {
        if (i == 2) {
            Log.m105926v(str, str2);
        } else if (i == 3) {
            Log.m105918d(str, str2);
        } else if (i == 4) {
            Log.m105924i(str, str2);
        } else if (i == 5) {
            Log.m105928w(str, str2);
        } else if (i == 6) {
            Log.m105920e(str, str2);
        }
    }

    /* renamed from: b */
    public static void m105903b() {
        Parcel parcel;
        try {
            PendingOps pendingOps = new PendingOps();
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("mmkv_extstg_mon_pending_ops");
            PendingOps d = m105905d();
            if (d != null) {
                pendingOps.f249776d.addAll(d.f249776d);
                pendingOps.f249777e.addAll(d.f249777e);
            }
            List<PendingOps.C85722b> list = pendingOps.f249776d;
            PendingOps pendingOps2 = f249774d;
            list.addAll(pendingOps2.f249776d);
            pendingOps.f249777e.addAll(pendingOps2.f249777e);
            parcel = null;
            parcel = Parcel.obtain();
            pendingOps.writeToParcel(parcel, 0);
            mmkv.encode("mmkv_key_pendingops", parcel.marshall());
            parcel.recycle();
            pendingOps2.f249776d.clear();
            pendingOps2.f249777e.clear();
        } catch (Throwable th) {
            ((C85724a) f249775e).mo119342d("MicroMsg.ExtStorageMigrateMonitor", th, "[-] Fail to flush to persist storage.", new Object[0]);
        }
    }

    /* renamed from: c */
    public static void m105904c(long j, long j2, long j3) {
        PeriodRecorder periodRecorder = f249772b;
        if (periodRecorder.isExpired("idkey_" + j + "_" + j2)) {
            boolean[] zArr = f249773c;
            synchronized (zArr) {
                if (zArr[0]) {
                    C117407d.INSTANCE.idkeyStat(j, j2, j3, true);
                } else {
                    f249774d.f249776d.add(new PendingOps.C85722b(j, j2, j3));
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d A[Catch:{ all -> 0x0027, all -> 0x0032 }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateMonitor.PendingOps m105905d() {
        /*
            r0 = 0
            r1 = 0
            java.lang.String r2 = "mmkv_extstg_mon_pending_ops"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r2)     // Catch:{ all -> 0x0032 }
            java.lang.String r3 = "mmkv_key_pendingops"
            byte[] r2 = r2.decodeBytes(r3)     // Catch:{ all -> 0x0032 }
            if (r2 == 0) goto L_0x0031
            android.os.Parcel r3 = android.os.Parcel.obtain()     // Catch:{ all -> 0x0029 }
            int r4 = r2.length     // Catch:{ all -> 0x0027 }
            r3.unmarshall(r2, r1, r4)     // Catch:{ all -> 0x0027 }
            r3.setDataPosition(r1)     // Catch:{ all -> 0x0027 }
            android.os.Parcelable$Creator<com.tencent.mm.sdcard_migrate.ExtStorageMigrateMonitor$PendingOps> r2 = com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateMonitor.PendingOps.CREATOR     // Catch:{ all -> 0x0027 }
            java.lang.Object r2 = r2.createFromParcel(r3)     // Catch:{ all -> 0x0027 }
            com.tencent.mm.sdcard_migrate.ExtStorageMigrateMonitor$PendingOps r2 = (com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateMonitor.PendingOps) r2     // Catch:{ all -> 0x0027 }
            r3.recycle()     // Catch:{ all -> 0x0032 }
            return r2
        L_0x0027:
            r2 = move-exception
            goto L_0x002b
        L_0x0029:
            r2 = move-exception
            r3 = r0
        L_0x002b:
            if (r3 == 0) goto L_0x0030
            r3.recycle()     // Catch:{ all -> 0x0032 }
        L_0x0030:
            throw r2     // Catch:{ all -> 0x0032 }
        L_0x0031:
            return r0
        L_0x0032:
            r2 = move-exception
            com.tencent.mm.sdcard_migrate.ExtStorageMigrateMonitor$b r3 = f249775e
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.tencent.mm.sdcard_migrate.ExtStorageMigrateMonitor$a r3 = (com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateMonitor.C85724a) r3
            java.lang.String r4 = "MicroMsg.ExtStorageMigrateMonitor"
            java.lang.String r5 = "[-] Fail to load from persist storage."
            r3.mo119342d(r4, r2, r5, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateMonitor.m105905d():com.tencent.mm.sdcard_migrate.ExtStorageMigrateMonitor$PendingOps");
    }
}
