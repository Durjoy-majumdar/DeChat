package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.IDynamiteLoaderV2;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public final class DynamiteModule {
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzd();
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zze();
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzf();
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION_NO_FORCE_STAGING = new zzg();
    public static final VersionPolicy PREFER_LOCAL = new zzc();
    public static final VersionPolicy PREFER_REMOTE = new zzb();
    private static Boolean zzabr;
    private static IDynamiteLoader zzabs;
    private static IDynamiteLoaderV2 zzabt;
    private static String zzabu;
    private static final ThreadLocal<zza> zzabv = new ThreadLocal<>();
    private static final VersionPolicy.IVersions zzabw = new zza();
    private final Context zzabx;

    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class LoadingException extends Exception {
        private LoadingException(String str) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, zza zza) {
            this(str);
        }

        private LoadingException(String str, Throwable th) {
            super(str, th);
        }

        public /* synthetic */ LoadingException(String str, Throwable th, zza zza) {
            this(str, th);
        }
    }

    public interface VersionPolicy {

        public interface IVersions {
            int getLocalVersion(Context context, String str);

            int getRemoteVersion(Context context, String str, boolean z);
        }

        public static class SelectionResult {
            public int localVersion = 0;
            public int remoteVersion = 0;
            public int selection = 0;
        }

        SelectionResult selectModule(Context context, String str, IVersions iVersions);
    }

    public static class zza {
        public Cursor zzaby;

        private zza() {
        }

        public /* synthetic */ zza(zza zza) {
            this();
        }
    }

    public static class zzb implements VersionPolicy.IVersions {
        private final int zzabz;
        private final int zzaca = 0;

        public zzb(int i, int i2) {
            this.zzabz = i;
        }

        public final int getLocalVersion(Context context, String str) {
            return this.zzabz;
        }

        public final int getRemoteVersion(Context context, String str, boolean z) {
            return 0;
        }
    }

    private DynamiteModule(Context context) {
        this.zzabx = (Context) Preconditions.checkNotNull(context);
    }

    public static int getLocalVersion(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get((Object) null).equals(str)) {
                return declaredField2.getInt((Object) null);
            }
            new StringBuilder(String.valueOf(declaredField.get((Object) null)).length() + 51 + String.valueOf(str).length());
            return 0;
        } catch (ClassNotFoundException unused) {
            new StringBuilder(String.valueOf(str).length() + 45);
            return 0;
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                "Failed to load module descriptor class: ".concat(valueOf);
            }
            return 0;
        }
    }

    public static Uri getQueryUri(String str, boolean z) {
        String str2 = z ? ProviderConstants.API_PATH_FORCE_STAGING : ProviderConstants.API_PATH;
        StringBuilder sb = new StringBuilder(str2.length() + 42 + String.valueOf(str).length());
        sb.append("content://com.google.android.gms.chimera/");
        sb.append(str2);
        sb.append("/");
        sb.append(str);
        return Uri.parse(sb.toString());
    }

    public static int getRemoteVersion(Context context, String str) {
        return getRemoteVersion(context, str, false);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:22:0x0050=Splitter:B:22:0x0050, B:17:0x0035=Splitter:B:17:0x0035, B:34:0x0077=Splitter:B:34:0x0077} */
    public static int getRemoteVersion(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)
            java.lang.Boolean r1 = zzabr     // Catch:{ all -> 0x00c7 }
            if (r1 != 0) goto L_0x00a0
            android.content.Context r1 = r8.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x008c, IllegalAccessException -> 0x008a, NoSuchFieldException -> 0x0088 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x008c, IllegalAccessException -> 0x008a, NoSuchFieldException -> 0x0088 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r2 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r2 = r2.getName()     // Catch:{ ClassNotFoundException -> 0x008c, IllegalAccessException -> 0x008a, NoSuchFieldException -> 0x0088 }
            java.lang.Class r1 = r1.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x008c, IllegalAccessException -> 0x008a, NoSuchFieldException -> 0x0088 }
            java.lang.String r2 = "sClassLoader"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ ClassNotFoundException -> 0x008c, IllegalAccessException -> 0x008a, NoSuchFieldException -> 0x0088 }
            monitor-enter(r1)     // Catch:{ ClassNotFoundException -> 0x008c, IllegalAccessException -> 0x008a, NoSuchFieldException -> 0x0088 }
            r3 = 0
            java.lang.Object r4 = r2.get(r3)     // Catch:{ all -> 0x0085 }
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch:{ all -> 0x0085 }
            if (r4 == 0) goto L_0x0038
            java.lang.ClassLoader r2 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0085 }
            if (r4 != r2) goto L_0x0032
        L_0x002f:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0085 }
            goto L_0x0082
        L_0x0032:
            zza(r4)     // Catch:{ LoadingException -> 0x0035 }
        L_0x0035:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0085 }
            goto L_0x0082
        L_0x0038:
            java.lang.String r4 = "com.google.android.gms"
            android.content.Context r5 = r8.getApplicationContext()     // Catch:{ all -> 0x0085 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ all -> 0x0085 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0085 }
            if (r4 == 0) goto L_0x0050
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0085 }
            r2.set(r3, r4)     // Catch:{ all -> 0x0085 }
            goto L_0x002f
        L_0x0050:
            int r4 = zzb((android.content.Context) r8, (java.lang.String) r9, (boolean) r10)     // Catch:{ LoadingException -> 0x007a }
            java.lang.String r5 = zzabu     // Catch:{ LoadingException -> 0x007a }
            if (r5 == 0) goto L_0x0077
            boolean r5 = r5.isEmpty()     // Catch:{ LoadingException -> 0x007a }
            if (r5 == 0) goto L_0x005f
            goto L_0x0077
        L_0x005f:
            com.google.android.gms.dynamite.zzh r5 = new com.google.android.gms.dynamite.zzh     // Catch:{ LoadingException -> 0x007a }
            java.lang.String r6 = zzabu     // Catch:{ LoadingException -> 0x007a }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x007a }
            r5.<init>(r6, r7)     // Catch:{ LoadingException -> 0x007a }
            zza(r5)     // Catch:{ LoadingException -> 0x007a }
            r2.set(r3, r5)     // Catch:{ LoadingException -> 0x007a }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ LoadingException -> 0x007a }
            zzabr = r5     // Catch:{ LoadingException -> 0x007a }
            monitor-exit(r1)     // Catch:{ all -> 0x0085 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c7 }
            return r4
        L_0x0077:
            monitor-exit(r1)     // Catch:{ all -> 0x0085 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c7 }
            return r4
        L_0x007a:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0085 }
            r2.set(r3, r4)     // Catch:{ all -> 0x0085 }
            goto L_0x002f
        L_0x0082:
            monitor-exit(r1)     // Catch:{ all -> 0x0085 }
            r1 = r2
            goto L_0x009e
        L_0x0085:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0085 }
            throw r2     // Catch:{ ClassNotFoundException -> 0x008c, IllegalAccessException -> 0x008a, NoSuchFieldException -> 0x0088 }
        L_0x0088:
            r1 = move-exception
            goto L_0x008d
        L_0x008a:
            r1 = move-exception
            goto L_0x008d
        L_0x008c:
            r1 = move-exception
        L_0x008d:
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00c7 }
            int r1 = r1.length()     // Catch:{ all -> 0x00c7 }
            int r1 = r1 + 30
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c7 }
            r2.<init>(r1)     // Catch:{ all -> 0x00c7 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00c7 }
        L_0x009e:
            zzabr = r1     // Catch:{ all -> 0x00c7 }
        L_0x00a0:
            monitor-exit(r0)     // Catch:{ all -> 0x00c7 }
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L_0x00c2
            int r8 = zzb((android.content.Context) r8, (java.lang.String) r9, (boolean) r10)     // Catch:{ LoadingException -> 0x00ac }
            return r8
        L_0x00ac:
            r8 = move-exception
            java.lang.String r9 = "Failed to retrieve remote module version: "
            java.lang.String r8 = r8.getMessage()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r10 = r8.length()
            if (r10 == 0) goto L_0x00c0
            r9.concat(r8)
        L_0x00c0:
            r8 = 0
            return r8
        L_0x00c2:
            int r8 = zza((android.content.Context) r8, (java.lang.String) r9, (boolean) r10)
            return r8
        L_0x00c7:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c7 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.getRemoteVersion(android.content.Context, java.lang.String, boolean):int");
    }

    public static synchronized Boolean getUseV2ForTesting() {
        Boolean bool;
        synchronized (DynamiteModule.class) {
            bool = zzabr;
        }
        return bool;
    }

    public static DynamiteModule load(Context context, VersionPolicy versionPolicy, String str) {
        VersionPolicy.SelectionResult selectModule;
        ThreadLocal<zza> threadLocal = zzabv;
        zza zza2 = threadLocal.get();
        zza zza3 = new zza((zza) null);
        threadLocal.set(zza3);
        try {
            selectModule = versionPolicy.selectModule(context, str, zzabw);
            int i = selectModule.localVersion;
            new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str).length());
            int i2 = selectModule.selection;
            if (i2 == 0 || ((i2 == -1 && selectModule.localVersion == 0) || (i2 == 1 && selectModule.remoteVersion == 0))) {
                int i3 = selectModule.localVersion;
                int i4 = selectModule.remoteVersion;
                StringBuilder sb = new StringBuilder(91);
                sb.append("No acceptable module found. Local version is ");
                sb.append(i3);
                sb.append(" and remote version is ");
                sb.append(i4);
                sb.append(".");
                throw new LoadingException(sb.toString(), (zza) null);
            } else if (i2 == -1) {
                DynamiteModule zzd = zzd(context, str);
                Cursor cursor = zza3.zzaby;
                if (cursor != null) {
                    cursor.close();
                }
                threadLocal.set(zza2);
                return zzd;
            } else if (i2 == 1) {
                DynamiteModule zza4 = zza(context, str, selectModule.remoteVersion);
                Cursor cursor2 = zza3.zzaby;
                if (cursor2 != null) {
                    cursor2.close();
                }
                threadLocal.set(zza2);
                return zza4;
            } else {
                int i5 = selectModule.selection;
                StringBuilder sb4 = new StringBuilder(47);
                sb4.append("VersionPolicy returned invalid code:");
                sb4.append(i5);
                throw new LoadingException(sb4.toString(), (zza) null);
            }
        } catch (LoadingException e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                "Failed to load remote module: ".concat(valueOf);
            }
            int i6 = selectModule.localVersion;
            if (i6 == 0 || versionPolicy.selectModule(context, str, new zzb(i6, 0)).selection != -1) {
                throw new LoadingException("Remote load failed. No local fallback found.", e, (zza) null);
            }
            DynamiteModule zzd2 = zzd(context, str);
            Cursor cursor3 = zza3.zzaby;
            if (cursor3 != null) {
                cursor3.close();
            }
            zzabv.set(zza2);
            return zzd2;
        } catch (Throwable th) {
            Cursor cursor4 = zza3.zzaby;
            if (cursor4 != null) {
                cursor4.close();
            }
            zzabv.set(zza2);
            throw th;
        }
    }

    public static Cursor queryForDynamiteModule(Context context, String str, boolean z) {
        return context.getContentResolver().query(getQueryUri(str, z), (String[]) null, (String) null, (String[]) null, (String) null);
    }

    public static synchronized void resetInternalStateForTesting() {
        synchronized (DynamiteModule.class) {
            zzabs = null;
            zzabt = null;
            zzabu = null;
            zzabr = null;
            synchronized (DynamiteLoaderClassLoader.class) {
                DynamiteLoaderClassLoader.sClassLoader = null;
            }
        }
    }

    public static synchronized void setUseV2ForTesting(Boolean bool) {
        synchronized (DynamiteModule.class) {
            zzabr = bool;
        }
    }

    private static int zza(Context context, String str, boolean z) {
        IDynamiteLoader zzg = zzg(context);
        if (zzg == null) {
            return 0;
        }
        try {
            return zzg.getModuleVersion2(ObjectWrapper.wrap(context), str, z);
        } catch (RemoteException e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                "Failed to retrieve remote module version: ".concat(valueOf);
            }
            return 0;
        }
    }

    private static Context zza(Context context, String str, int i, Cursor cursor, IDynamiteLoaderV2 iDynamiteLoaderV2) {
        try {
            return (Context) ObjectWrapper.unwrap(iDynamiteLoaderV2.loadModule2(ObjectWrapper.wrap(context), str, i, ObjectWrapper.wrap(cursor)));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.toString());
            if (valueOf.length() == 0) {
                return null;
            }
            "Failed to load DynamiteLoader: ".concat(valueOf);
            return null;
        }
    }

    private static DynamiteModule zza(Context context, String str, int i) {
        Boolean bool;
        synchronized (DynamiteModule.class) {
            bool = zzabr;
        }
        if (bool != null) {
            return bool.booleanValue() ? zzc(context, str, i) : zzb(context, str, i);
        }
        throw new LoadingException("Failed to determine which loading route to use.", (zza) null);
    }

    private static void zza(ClassLoader classLoader) {
        try {
            zzabt = IDynamiteLoaderV2.Stub.asInterface((IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new LoadingException("Failed to instantiate dynamite loader", e, (zza) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int zzb(android.content.Context r2, java.lang.String r3, boolean r4) {
        /*
            r0 = 0
            android.database.Cursor r2 = queryForDynamiteModule(r2, r3, r4)     // Catch:{ Exception -> 0x0046, all -> 0x0044 }
            if (r2 == 0) goto L_0x003c
            boolean r3 = r2.moveToFirst()     // Catch:{ Exception -> 0x003a }
            if (r3 == 0) goto L_0x003c
            r3 = 0
            int r3 = r2.getInt(r3)     // Catch:{ Exception -> 0x003a }
            if (r3 <= 0) goto L_0x0033
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r4 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r4)     // Catch:{ Exception -> 0x003a }
            r1 = 2
            java.lang.String r1 = r2.getString(r1)     // Catch:{ all -> 0x0030 }
            zzabu = r1     // Catch:{ all -> 0x0030 }
            monitor-exit(r4)     // Catch:{ all -> 0x0030 }
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$zza> r4 = zzabv     // Catch:{ Exception -> 0x003a }
            java.lang.Object r4 = r4.get()     // Catch:{ Exception -> 0x003a }
            com.google.android.gms.dynamite.DynamiteModule$zza r4 = (com.google.android.gms.dynamite.DynamiteModule.zza) r4     // Catch:{ Exception -> 0x003a }
            if (r4 == 0) goto L_0x0033
            android.database.Cursor r1 = r4.zzaby     // Catch:{ Exception -> 0x003a }
            if (r1 != 0) goto L_0x0033
            r4.zzaby = r2     // Catch:{ Exception -> 0x003a }
            goto L_0x0034
        L_0x0030:
            r3 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0030 }
            throw r3     // Catch:{ Exception -> 0x003a }
        L_0x0033:
            r0 = r2
        L_0x0034:
            if (r0 == 0) goto L_0x0039
            r0.close()
        L_0x0039:
            return r3
        L_0x003a:
            r3 = move-exception
            goto L_0x0048
        L_0x003c:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r3 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x003a }
            java.lang.String r4 = "Failed to connect to dynamite module ContentResolver."
            r3.<init>((java.lang.String) r4, (com.google.android.gms.dynamite.zza) r0)     // Catch:{ Exception -> 0x003a }
            throw r3     // Catch:{ Exception -> 0x003a }
        L_0x0044:
            r3 = move-exception
            goto L_0x0057
        L_0x0046:
            r3 = move-exception
            r2 = r0
        L_0x0048:
            boolean r4 = r3 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException     // Catch:{ all -> 0x0055 }
            if (r4 == 0) goto L_0x004d
            throw r3     // Catch:{ all -> 0x0055 }
        L_0x004d:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r4 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x0055 }
            java.lang.String r1 = "V2 version check failed"
            r4.<init>(r1, r3, r0)     // Catch:{ all -> 0x0055 }
            throw r4     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r3 = move-exception
            r0 = r2
        L_0x0057:
            if (r0 == 0) goto L_0x005c
            r0.close()
        L_0x005c:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zzb(android.content.Context, java.lang.String, boolean):int");
    }

    private static DynamiteModule zzb(Context context, String str, int i) {
        new StringBuilder(String.valueOf(str).length() + 51);
        IDynamiteLoader zzg = zzg(context);
        if (zzg != null) {
            try {
                IObjectWrapper createModuleContext = zzg.createModuleContext(ObjectWrapper.wrap(context), str, i);
                if (ObjectWrapper.unwrap(createModuleContext) != null) {
                    return new DynamiteModule((Context) ObjectWrapper.unwrap(createModuleContext));
                }
                throw new LoadingException("Failed to load remote module.", (zza) null);
            } catch (RemoteException e) {
                throw new LoadingException("Failed to load remote module.", e, (zza) null);
            }
        } else {
            throw new LoadingException("Failed to create IDynamiteLoader.", (zza) null);
        }
    }

    private static DynamiteModule zzc(Context context, String str, int i) {
        IDynamiteLoaderV2 iDynamiteLoaderV2;
        new StringBuilder(String.valueOf(str).length() + 51);
        synchronized (DynamiteModule.class) {
            iDynamiteLoaderV2 = zzabt;
        }
        if (iDynamiteLoaderV2 != null) {
            zza zza2 = zzabv.get();
            if (zza2 == null || zza2.zzaby == null) {
                throw new LoadingException("No result cursor", (zza) null);
            }
            Context zza3 = zza(context.getApplicationContext(), str, i, zza2.zzaby, iDynamiteLoaderV2);
            if (zza3 != null) {
                return new DynamiteModule(zza3);
            }
            throw new LoadingException("Failed to get module context", (zza) null);
        }
        throw new LoadingException("DynamiteLoaderV2 was not cached.", (zza) null);
    }

    private static DynamiteModule zzd(Context context, String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "Selected local version of ".concat(valueOf);
        }
        return new DynamiteModule(context.getApplicationContext());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004c, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.dynamite.IDynamiteLoader zzg(android.content.Context r4) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)
            com.google.android.gms.dynamite.IDynamiteLoader r1 = zzabs     // Catch:{ all -> 0x004d }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            return r1
        L_0x0009:
            com.google.android.gms.common.GoogleApiAvailabilityLight r1 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()     // Catch:{ all -> 0x004d }
            int r1 = r1.isGooglePlayServicesAvailable(r4)     // Catch:{ all -> 0x004d }
            r2 = 0
            if (r1 == 0) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            return r2
        L_0x0016:
            java.lang.String r1 = "com.google.android.gms"
            r3 = 3
            android.content.Context r4 = r4.createPackageContext(r1, r3)     // Catch:{ Exception -> 0x0037 }
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ Exception -> 0x0037 }
            java.lang.String r1 = "com.google.android.gms.chimera.container.DynamiteLoaderImpl"
            java.lang.Class r4 = r4.loadClass(r1)     // Catch:{ Exception -> 0x0037 }
            java.lang.Object r4 = r4.newInstance()     // Catch:{ Exception -> 0x0037 }
            android.os.IBinder r4 = (android.os.IBinder) r4     // Catch:{ Exception -> 0x0037 }
            com.google.android.gms.dynamite.IDynamiteLoader r4 = com.google.android.gms.dynamite.IDynamiteLoader.Stub.asInterface(r4)     // Catch:{ Exception -> 0x0037 }
            if (r4 == 0) goto L_0x004b
            zzabs = r4     // Catch:{ Exception -> 0x0037 }
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            return r4
        L_0x0037:
            r4 = move-exception
            java.lang.String r1 = "Failed to load IDynamiteLoader from GmsCore: "
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x004d }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x004d }
            int r3 = r4.length()     // Catch:{ all -> 0x004d }
            if (r3 == 0) goto L_0x004b
            r1.concat(r4)     // Catch:{ all -> 0x004d }
        L_0x004b:
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            return r2
        L_0x004d:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zzg(android.content.Context):com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final Context getModuleContext() {
        return this.zzabx;
    }

    public final IBinder instantiate(String str) {
        try {
            return (IBinder) this.zzabx.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            String valueOf = String.valueOf(str);
            throw new LoadingException(valueOf.length() != 0 ? "Failed to instantiate module class: ".concat(valueOf) : new String("Failed to instantiate module class: "), e, (zza) null);
        }
    }
}
