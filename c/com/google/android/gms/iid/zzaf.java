package com.google.android.gms.iid;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Tasks;
import com.tencent.xweb.file.XVFSFile;
import java.io.IOException;
import java.security.KeyPair;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p1042u.C111055b;

public final class zzaf {
    private static int zzck = 0;
    private static final zzaj<Boolean> zzco = zzai.zzw().zzd("gcm_iid_use_messenger_ipc", true);
    private static String zzcp = null;
    private static boolean zzcq = false;
    private static int zzcr = 0;
    private static int zzcs = 0;
    private static BroadcastReceiver zzct = null;
    private PendingIntent zzad;
    private Messenger zzah;
    private Map<String, Object> zzcu = new C111055b();
    private Messenger zzcv;
    private MessengerCompat zzcw;
    private Context zzk;

    public zzaf(Context context) {
        this.zzk = context;
    }

    private static void zzd(Object obj, Object obj2) {
        if (obj instanceof ConditionVariable) {
            ((ConditionVariable) obj).open();
        }
        if (obj instanceof Messenger) {
            Messenger messenger = (Messenger) obj;
            Message obtain = Message.obtain();
            obtain.obj = obj2;
            try {
                messenger.send(obtain);
            } catch (RemoteException e) {
                new StringBuilder(String.valueOf(e).length() + 24);
            }
        }
    }

    private final void zzd(String str, Object obj) {
        synchronized (zzaf.class) {
            Object obj2 = this.zzcu.get(str);
            this.zzcu.put(str, obj);
            zzd(obj2, obj);
        }
    }

    private static boolean zzd(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            zzcp = applicationInfo.packageName;
            zzcs = applicationInfo.uid;
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    private static boolean zzd(PackageManager packageManager, String str, String str2) {
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", str) == 0) {
            return zzd(packageManager, str);
        }
        new StringBuilder(String.valueOf(str).length() + 56 + String.valueOf(str2).length());
        return false;
    }

    private final synchronized void zzg(Intent intent) {
        if (this.zzad == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            this.zzad = PendingIntent.getBroadcast(this.zzk, 0, intent2, 0);
        }
        intent.putExtra("app", this.zzad);
    }

    public static String zzi(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string == null) {
                string = bundle.getString("unregistered");
            }
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("error");
            if (string2 != null) {
                throw new IOException(string2);
            }
            new StringBuilder(String.valueOf(bundle).length() + 29);
            new Throwable();
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    private final Bundle zzj(Bundle bundle) {
        Bundle zzk2 = zzk(bundle);
        if (zzk2 == null || !zzk2.containsKey("google.messenger")) {
            return zzk2;
        }
        Bundle zzk3 = zzk(bundle);
        if (zzk3 == null || !zzk3.containsKey("google.messenger")) {
            return zzk3;
        }
        return null;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    private final android.os.Bundle zzk(android.os.Bundle r9) {
        /*
            r8 = this;
            java.lang.Class<com.google.android.gms.iid.zzaf> r0 = com.google.android.gms.iid.zzaf.class
            android.os.ConditionVariable r1 = new android.os.ConditionVariable
            r1.<init>()
            java.lang.String r2 = zzv()
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Object> r3 = r8.zzcu     // Catch:{ all -> 0x018b }
            r3.put(r2, r1)     // Catch:{ all -> 0x018b }
            monitor-exit(r0)     // Catch:{ all -> 0x018b }
            android.os.Messenger r3 = r8.zzah
            if (r3 != 0) goto L_0x002b
            android.content.Context r3 = r8.zzk
            zzl(r3)
            android.os.Messenger r3 = new android.os.Messenger
            com.google.android.gms.iid.zzag r4 = new com.google.android.gms.iid.zzag
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            r4.<init>(r8, r5)
            r3.<init>(r4)
            r8.zzah = r3
        L_0x002b:
            java.lang.String r3 = zzcp
            if (r3 == 0) goto L_0x0183
            android.content.Intent r3 = new android.content.Intent
            boolean r4 = zzcq
            if (r4 == 0) goto L_0x0038
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            goto L_0x003a
        L_0x0038:
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
        L_0x003a:
            r3.<init>(r4)
            java.lang.String r4 = zzcp
            r3.setPackage(r4)
            r3.putExtras(r9)
            r8.zzg(r3)
            java.lang.String r9 = "kid"
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r4 = r4.length()
            int r4 = r4 + 5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "|ID|"
            r5.append(r4)
            r5.append(r2)
            java.lang.String r4 = "|"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.putExtra(r9, r4)
            java.lang.String r9 = "X-kid"
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r4 = r4.length()
            int r4 = r4 + 5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "|ID|"
            r5.append(r4)
            r5.append(r2)
            java.lang.String r4 = "|"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.putExtra(r9, r4)
            java.lang.String r9 = "com.google.android.gsf"
            java.lang.String r4 = zzcp
            boolean r9 = r9.equals(r4)
            java.lang.String r4 = "useGsf"
            java.lang.String r4 = r3.getStringExtra(r4)
            if (r4 == 0) goto L_0x00ac
            java.lang.String r9 = "1"
            boolean r9 = r9.equals(r4)
        L_0x00ac:
            java.lang.String r4 = "InstanceID"
            r5 = 3
            boolean r4 = android.util.Log.isLoggable(r4, r5)
            if (r4 == 0) goto L_0x00c8
            android.os.Bundle r4 = r3.getExtras()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r4 = r4.length()
            int r4 = r4 + 8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
        L_0x00c8:
            android.os.Messenger r4 = r8.zzcv
            if (r4 == 0) goto L_0x00e4
            java.lang.String r4 = "google.messenger"
            android.os.Messenger r6 = r8.zzah
            r3.putExtra(r4, r6)
            android.os.Message r4 = android.os.Message.obtain()
            r4.obj = r3
            android.os.Messenger r6 = r8.zzcv     // Catch:{ RemoteException -> 0x00df }
            r6.send(r4)     // Catch:{ RemoteException -> 0x00df }
            goto L_0x0149
        L_0x00df:
            java.lang.String r4 = "InstanceID"
            android.util.Log.isLoggable(r4, r5)
        L_0x00e4:
            if (r9 == 0) goto L_0x0117
            monitor-enter(r8)
            android.content.BroadcastReceiver r9 = zzct     // Catch:{ all -> 0x0114 }
            if (r9 != 0) goto L_0x0112
            com.google.android.gms.iid.zzah r9 = new com.google.android.gms.iid.zzah     // Catch:{ all -> 0x0114 }
            r9.<init>(r8)     // Catch:{ all -> 0x0114 }
            zzct = r9     // Catch:{ all -> 0x0114 }
            java.lang.String r9 = "InstanceID"
            boolean r9 = android.util.Log.isLoggable(r9, r5)     // Catch:{ all -> 0x0114 }
            android.content.IntentFilter r9 = new android.content.IntentFilter     // Catch:{ all -> 0x0114 }
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTRATION"
            r9.<init>(r4)     // Catch:{ all -> 0x0114 }
            android.content.Context r4 = r8.zzk     // Catch:{ all -> 0x0114 }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ all -> 0x0114 }
            r9.addCategory(r4)     // Catch:{ all -> 0x0114 }
            android.content.Context r4 = r8.zzk     // Catch:{ all -> 0x0114 }
            android.content.BroadcastReceiver r5 = zzct     // Catch:{ all -> 0x0114 }
            java.lang.String r6 = "com.google.android.c2dm.permission.SEND"
            r7 = 0
            r4.registerReceiver(r5, r9, r6, r7)     // Catch:{ all -> 0x0114 }
        L_0x0112:
            monitor-exit(r8)     // Catch:{ all -> 0x0114 }
            goto L_0x013e
        L_0x0114:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0114 }
            throw r9
        L_0x0117:
            java.lang.String r9 = "google.messenger"
            android.os.Messenger r4 = r8.zzah
            r3.putExtra(r9, r4)
            java.lang.String r9 = "messenger2"
            java.lang.String r4 = "1"
            r3.putExtra(r9, r4)
            com.google.android.gms.iid.MessengerCompat r9 = r8.zzcw
            if (r9 == 0) goto L_0x013a
            android.os.Message r9 = android.os.Message.obtain()
            r9.obj = r3
            com.google.android.gms.iid.MessengerCompat r4 = r8.zzcw     // Catch:{ RemoteException -> 0x0135 }
            r4.send(r9)     // Catch:{ RemoteException -> 0x0135 }
            goto L_0x0149
        L_0x0135:
            java.lang.String r9 = "InstanceID"
            android.util.Log.isLoggable(r9, r5)
        L_0x013a:
            boolean r9 = zzcq
            if (r9 == 0) goto L_0x0144
        L_0x013e:
            android.content.Context r9 = r8.zzk
            r9.sendBroadcast(r3)
            goto L_0x0149
        L_0x0144:
            android.content.Context r9 = r8.zzk
            r9.startService(r3)
        L_0x0149:
            r3 = 30000(0x7530, double:1.4822E-319)
            r1.block(r3)
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Object> r9 = r8.zzcu     // Catch:{ all -> 0x0180 }
            java.lang.Object r9 = r9.remove(r2)     // Catch:{ all -> 0x0180 }
            boolean r1 = r9 instanceof android.os.Bundle     // Catch:{ all -> 0x0180 }
            if (r1 == 0) goto L_0x015d
            android.os.Bundle r9 = (android.os.Bundle) r9     // Catch:{ all -> 0x0180 }
            monitor-exit(r0)     // Catch:{ all -> 0x0180 }
            return r9
        L_0x015d:
            boolean r1 = r9 instanceof java.lang.String     // Catch:{ all -> 0x0180 }
            if (r1 == 0) goto L_0x0169
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0180 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0180 }
            r1.<init>(r9)     // Catch:{ all -> 0x0180 }
            throw r1     // Catch:{ all -> 0x0180 }
        L_0x0169:
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0180 }
            int r9 = r9.length()     // Catch:{ all -> 0x0180 }
            int r9 = r9 + 12
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0180 }
            r1.<init>(r9)     // Catch:{ all -> 0x0180 }
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x0180 }
            java.lang.String r1 = "TIMEOUT"
            r9.<init>(r1)     // Catch:{ all -> 0x0180 }
            throw r9     // Catch:{ all -> 0x0180 }
        L_0x0180:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0180 }
            throw r9
        L_0x0183:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r0 = "MISSING_INSTANCEID_SERVICE"
            r9.<init>(r0)
            throw r9
        L_0x018b:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x018b }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.iid.zzaf.zzk(android.os.Bundle):android.os.Bundle");
    }

    public static boolean zzk(Context context) {
        if (zzcp != null) {
            zzl(context);
        }
        return zzcq;
    }

    public static String zzl(Context context) {
        boolean z;
        String str = zzcp;
        if (str != null) {
            return str;
        }
        zzcr = Process.myUid();
        PackageManager packageManager = context.getPackageManager();
        boolean z2 = true;
        if (!PlatformVersion.isAtLeastO()) {
            Iterator<ResolveInfo> it = packageManager.queryIntentServices(new Intent("com.google.android.c2dm.intent.REGISTER"), 0).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (zzd(packageManager, it.next().serviceInfo.packageName, "com.google.android.c2dm.intent.REGISTER")) {
                        zzcq = false;
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                return zzcp;
            }
        }
        Iterator<ResolveInfo> it4 = packageManager.queryBroadcastReceivers(new Intent("com.google.iid.TOKEN_REQUEST"), 0).iterator();
        while (true) {
            if (it4.hasNext()) {
                if (zzd(packageManager, it4.next().activityInfo.packageName, "com.google.iid.TOKEN_REQUEST")) {
                    zzcq = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (z2) {
            return zzcp;
        }
        if (zzd(packageManager, "com.google.android.gms")) {
            zzcq = PlatformVersion.isAtLeastO();
        } else if (PlatformVersion.isAtLeastLollipop() || !zzd(packageManager, "com.google.android.gsf")) {
            return null;
        } else {
            zzcq = false;
        }
        return zzcp;
    }

    private static int zzm(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(zzl(context), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    private static synchronized String zzv() {
        String num;
        synchronized (zzaf.class) {
            int i = zzck;
            zzck = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    public final Bundle zzd(Bundle bundle, KeyPair keyPair) {
        int zzm = zzm(this.zzk);
        bundle.putString("gmsv", Integer.toString(zzm));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", Integer.toString(InstanceID.zzg(this.zzk)));
        bundle.putString("app_ver_name", InstanceID.zzh(this.zzk));
        bundle.putString("cliv", "iid-12451000");
        bundle.putString("appid", InstanceID.zzd(keyPair));
        if (zzm < 12000000 || !zzco.get().booleanValue()) {
            return zzj(bundle);
        }
        try {
            return (Bundle) Tasks.await(new zzr(this.zzk).zzd(1, bundle));
        } catch (InterruptedException | ExecutionException e) {
            if (Log.isLoggable("InstanceID", 3)) {
                new StringBuilder(String.valueOf(e).length() + 22);
            }
            if (!(e.getCause() instanceof zzaa) || ((zzaa) e.getCause()).getErrorCode() != 4) {
                return null;
            }
            return zzj(bundle);
        }
    }

    public final void zze(Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(MessengerCompat.class.getClassLoader());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof MessengerCompat) {
                        this.zzcw = (MessengerCompat) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.zzcv = (Messenger) parcelableExtra;
                    }
                }
                zzh((Intent) message.obj);
            }
        }
    }

    public final void zzh(Intent intent) {
        String str;
        if (intent == null) {
            Log.isLoggable("InstanceID", 3);
            return;
        }
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(action) || "com.google.android.gms.iid.InstanceID".equals(action)) {
            String stringExtra = intent.getStringExtra("registration_id");
            if (stringExtra == null) {
                stringExtra = intent.getStringExtra("unregistered");
            }
            if (stringExtra == null) {
                String stringExtra2 = intent.getStringExtra("error");
                if (stringExtra2 == null) {
                    new StringBuilder(String.valueOf(intent.getExtras()).length() + 49);
                    return;
                }
                if (Log.isLoggable("InstanceID", 3) && stringExtra2.length() != 0) {
                    "Received InstanceID error ".concat(stringExtra2);
                }
                String str2 = null;
                if (stringExtra2.startsWith("|")) {
                    String[] split = stringExtra2.split("\\|");
                    if (!"ID".equals(split[1]) && stringExtra2.length() != 0) {
                        "Unexpected structured response ".concat(stringExtra2);
                    }
                    if (split.length > 2) {
                        String str3 = split[2];
                        str = split[3];
                        if (str.startsWith(XVFSFile.PATH_SEPARATOR)) {
                            str = str.substring(1);
                        }
                        str2 = str3;
                    } else {
                        str = "UNKNOWN";
                    }
                    stringExtra2 = str;
                    intent.putExtra("error", stringExtra2);
                }
                if (str2 == null) {
                    synchronized (zzaf.class) {
                        for (String next : this.zzcu.keySet()) {
                            Object obj = this.zzcu.get(next);
                            this.zzcu.put(next, stringExtra2);
                            zzd(obj, (Object) stringExtra2);
                        }
                    }
                    return;
                }
                zzd(str2, (Object) stringExtra2);
                return;
            }
            Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
            if (matcher.matches()) {
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                Bundle extras = intent.getExtras();
                extras.putString("registration_id", group2);
                zzd(group, (Object) extras);
            } else if (Log.isLoggable("InstanceID", 3) && stringExtra.length() != 0) {
                "Unexpected response string: ".concat(stringExtra);
            }
        } else if (Log.isLoggable("InstanceID", 3)) {
            String valueOf = String.valueOf(intent.getAction());
            if (valueOf.length() != 0) {
                "Unexpected response ".concat(valueOf);
            }
        }
    }
}
