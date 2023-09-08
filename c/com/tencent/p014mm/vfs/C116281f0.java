package com.tencent.p014mm.vfs;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.OperationCanceledException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.os.Process;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.FileSchemeResolver;
import com.tencent.p014mm.vfs.FileSystem;
import com.tencent.p014mm.vfs.NullFileSystem;
import com.tencent.p014mm.vfs.SchemeResolver;
import com.tencent.p014mm.vfs.WcfSchemeResolver;
import com.tencent.stubs.logger.Log;
import com.tencent.stubs.logger.LogPrinter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* renamed from: com.tencent.mm.vfs.f0 */
public final class C116281f0 implements Handler.Callback {

    /* renamed from: E */
    public static volatile Context f348951E = null;

    /* renamed from: F */
    public static volatile C116284d f348952F = null;

    /* renamed from: G */
    public static volatile boolean f348953G = true;

    /* renamed from: H */
    public static volatile int f348954H;

    /* renamed from: I */
    public static volatile C57868c f348955I;

    /* renamed from: A */
    public final BroadcastReceiver f348956A;

    /* renamed from: B */
    public volatile HashMap<String, Object> f348957B;

    /* renamed from: C */
    public volatile boolean f348958C;

    /* renamed from: D */
    public volatile BroadcastReceiver f348959D;

    /* renamed from: d */
    public final Context f348960d;

    /* renamed from: e */
    public final int f348961e;

    /* renamed from: f */
    public final Object f348962f = new Object();

    /* renamed from: g */
    public C116340x0 f348963g;

    /* renamed from: h */
    public int f348964h;

    /* renamed from: i */
    public C116288h f348965i;

    /* renamed from: j */
    public final Object f348966j = new Object();

    /* renamed from: n */
    public C116333v0 f348967n;

    /* renamed from: o */
    public C116333v0 f348968o;

    /* renamed from: p */
    public C116333v0 f348969p;

    /* renamed from: q */
    public final File f348970q;

    /* renamed from: r */
    public final HandlerThread f348971r;

    /* renamed from: s */
    public final C116285e f348972s;

    /* renamed from: t */
    public final Handler f348973t;

    /* renamed from: u */
    public Message[] f348974u;

    /* renamed from: v */
    public volatile long f348975v;

    /* renamed from: w */
    public volatile long f348976w;

    /* renamed from: x */
    public volatile boolean f348977x;

    /* renamed from: y */
    public volatile C116286f f348978y;

    /* renamed from: z */
    public final AtomicReference<C116287g> f348979z = new AtomicReference<>();

    /* renamed from: com.tencent.mm.vfs.f0$c */
    public interface C57868c {
    }

    /* renamed from: com.tencent.mm.vfs.f0$a */
    public class C116282a extends BroadcastReceiver {
        public C116282a() {
        }

        public void onReceive(Context context, Intent intent) {
            C116281f0.this.f348973t.sendEmptyMessage(3);
        }
    }

    /* renamed from: com.tencent.mm.vfs.f0$b */
    public final class C116283b {

        /* renamed from: a */
        public C116333v0 f348981a = new C116333v0();

        /* renamed from: b */
        public boolean f348982b = false;

        /* renamed from: c */
        public final boolean f348983c;

        public C116283b(boolean z) {
            this.f348983c = z;
        }

        /* renamed from: a */
        public void mo177801a() {
            mo177802b(C116281f0.this.f348958C);
        }

        /* renamed from: b */
        public void mo177802b(boolean z) {
            C116333v0 v0Var;
            C116333v0 v0Var2;
            Bundle bundle = null;
            if (this.f348983c) {
                v0Var = this.f348981a;
                v0Var2 = null;
            } else {
                v0Var2 = this.f348981a;
                v0Var = null;
            }
            C116281f0 f0Var = C116281f0.this;
            boolean z2 = this.f348982b;
            synchronized (f0Var.f348966j) {
                if (v0Var2 != null) {
                    try {
                        f0Var.f348968o.mo177827a(v0Var2);
                        if (z) {
                            bundle = f0Var.f348968o.mo177831g();
                        }
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
                if (v0Var != null) {
                    f0Var.f348967n.mo177827a(v0Var);
                }
                f0Var.mo177798k(z2);
            }
            if (bundle != null) {
                f0Var.mo177797j(bundle);
            }
            LogPrinter logPrinter = new LogPrinter(4, "VFS.FileSystemManager");
            if (v0Var2 != null) {
                Log.m106505i("VFS.FileSystemManager", "Patched layer [PUBLIC]");
                v0Var2.mo177828d(logPrinter);
            }
            if (v0Var != null) {
                Log.m106505i("VFS.FileSystemManager", "Patched layer [PRIVATE]");
                v0Var.mo177828d(logPrinter);
            }
            this.f348981a = new C116333v0();
        }

        /* renamed from: c */
        public C116283b mo177803c(String str, FileSystem fileSystem) {
            this.f348981a.f349106b.put(str, fileSystem == null ? null : new C116342y0(fileSystem));
            return this;
        }

        /* renamed from: d */
        public C116283b mo177804d(String str, FileSystem fileSystem) {
            this.f348981a.f349107c.put(str, fileSystem == null ? null : new C116342y0(fileSystem));
            return this;
        }

        /* renamed from: e */
        public C116283b mo177805e(String str, String str2) {
            String k = C116299g2.m163855k(str, true, false);
            ((TreeMap) this.f348981a.f349108d).put(new C116330v(k), str2);
            return this;
        }

        /* renamed from: f */
        public C116283b mo177806f(String str, String str2) {
            this.f348981a.f349109e.put(str, str2);
            this.f348982b = true;
            return this;
        }

        /* renamed from: g */
        public C116283b mo177807g(String str) {
            String k = C116299g2.m163855k(str, true, false);
            ((TreeMap) this.f348981a.f349108d).put(new C116330v(k), (Object) null);
            return this;
        }
    }

    /* renamed from: com.tencent.mm.vfs.f0$d */
    public interface C116284d {
    }

    /* renamed from: com.tencent.mm.vfs.f0$e */
    public final class C116285e extends BroadcastReceiver {

        /* renamed from: a */
        public boolean f348985a;

        /* renamed from: b */
        public boolean f348986b;

        /* renamed from: c */
        public CancellationSignal f348987c;

        public C116285e(C116278e0 e0Var) {
        }

        /* renamed from: a */
        public final void mo177808a() {
            Log.m106505i("VFS.FileSystemManager", "Idle status changed: charging = " + this.f348985a + ", interactive = " + this.f348986b);
            boolean z = this.f348985a;
            if (z && !this.f348986b && this.f348987c == null) {
                long j = C116281f0.this.f348975v;
                if (j >= 0) {
                    CancellationSignal cancellationSignal = new CancellationSignal();
                    this.f348987c = cancellationSignal;
                    Handler handler = C116281f0.this.f348973t;
                    handler.sendMessageDelayed(Message.obtain(handler, 2, cancellationSignal), j);
                    Log.m106505i("VFS.FileSystemManager", "System idle, trigger maintenance timer for " + (j / 1000) + " seconds.");
                }
            } else if ((!z || this.f348986b) && this.f348987c != null) {
                C116281f0.this.f348973t.removeMessages(2);
                this.f348987c.cancel();
                this.f348987c = null;
                Log.m106505i("VFS.FileSystemManager", "Exit idle state, maintenance cancelled.");
            }
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action != null) {
                char c = 65535;
                switch (action.hashCode()) {
                    case -2128145023:
                        if (action.equals("android.intent.action.SCREEN_OFF")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1886648615:
                        if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1454123155:
                        if (action.equals("android.intent.action.SCREEN_ON")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1019184907:
                        if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        this.f348986b = false;
                        break;
                    case 1:
                        this.f348985a = false;
                        break;
                    case 2:
                        this.f348986b = true;
                        break;
                    case 3:
                        this.f348985a = true;
                        break;
                }
                mo177808a();
            }
        }
    }

    /* renamed from: com.tencent.mm.vfs.f0$f */
    public interface C116286f {
        /* renamed from: a */
        boolean mo177782a(String str, FileSystem.C85995c cVar, CancellationSignal cancellationSignal);

        /* renamed from: b */
        void mo177783b(CancellationSignal cancellationSignal);

        /* renamed from: c */
        void mo177784c(boolean z, boolean z2, CancellationSignal cancellationSignal);
    }

    /* renamed from: com.tencent.mm.vfs.f0$g */
    public static final class C116287g {

        /* renamed from: a */
        public final int f348989a = Process.myTid();

        /* renamed from: b */
        public final long f348990b = System.nanoTime();
    }

    /* renamed from: com.tencent.mm.vfs.f0$h */
    public static final class C116288h {

        /* renamed from: a */
        public final FileSystem.C85995c f348991a;

        /* renamed from: b */
        public final String f348992b;

        /* renamed from: c */
        public final int f348993c;

        public C116288h(FileSystem.C85995c cVar, String str, int i, C116278e0 e0Var) {
            this.f348991a = cVar;
            this.f348992b = str;
            this.f348993c = i;
        }

        /* renamed from: a */
        public boolean mo177810a() {
            return this.f348991a != null;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C116288h)) {
                return false;
            }
            C116288h hVar = (C116288h) obj;
            return mo177810a() == hVar.mo177810a() && C116299g2.m163849e(this.f348991a, hVar.f348991a) && C116299g2.m163849e(this.f348992b, hVar.f348992b);
        }

        public int hashCode() {
            if (!mo177810a()) {
                return 0;
            }
            Object[] objArr = {this.f348991a, this.f348992b};
            Pattern pattern = C116299g2.f349012a;
            return Arrays.deepHashCode(objArr);
        }

        public String toString() {
            if (!mo177810a()) {
                return "[INVALID]";
            }
            return this.f348992b + " -> " + this.f348991a;
        }
    }

    /* renamed from: com.tencent.mm.vfs.f0$i */
    public static final class C116289i {

        /* renamed from: a */
        public static final C116281f0 f348994a;

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
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        static {
            /*
                com.tencent.mm.vfs.f0 r1 = new com.tencent.mm.vfs.f0
                r1.<init>()
                f348994a = r1
                com.tencent.mm.vfs.f0$c r0 = com.tencent.p014mm.vfs.C116281f0.f348955I
                boolean r2 = com.tencent.p014mm.vfs.C116281f0.f348953G
                android.content.IntentFilter r3 = new android.content.IntentFilter
                r3.<init>()
                java.lang.String r4 = "android.intent.action.MEDIA_MOUNTED"
                r3.addAction(r4)
                java.lang.String r4 = "android.intent.action.MEDIA_EJECT"
                r3.addAction(r4)
                java.lang.String r4 = "android.intent.action.MEDIA_SHARED"
                r3.addAction(r4)
                android.content.Context r4 = r1.f348960d
                android.content.BroadcastReceiver r5 = r1.f348956A
                r4.registerReceiver(r5, r3)
                android.content.BroadcastReceiver r3 = r1.f348959D
                java.lang.String r4 = "VFS.FileSystemManager"
                r5 = 0
                if (r3 != 0) goto L_0x0074
                if (r2 == 0) goto L_0x0074
                com.tencent.mm.vfs.e0 r3 = new com.tencent.mm.vfs.e0
                r3.<init>(r1)
                r1.f348959D = r3
                android.content.Context r6 = r1.f348960d
                java.lang.String r6 = r6.getPackageName()
                android.content.Context r7 = r1.f348960d
                android.content.IntentFilter r8 = new android.content.IntentFilter
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r6)
                java.lang.String r6 = ".REFRESH_VFS"
                r9.append(r6)
                java.lang.String r6 = r9.toString()
                r8.<init>(r6)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                android.content.Context r9 = r1.f348960d
                java.lang.String r9 = r9.getPackageName()
                r6.append(r9)
                java.lang.String r9 = ".vfs.broadcast"
                r6.append(r9)
                java.lang.String r6 = r6.toString()
                r7.registerReceiver(r3, r8, r6, r5)
                java.lang.String r3 = "Broadcast receiving enabled."
                com.tencent.stubs.logger.Log.m106505i(r4, r3)
                goto L_0x0084
            L_0x0074:
                if (r3 == 0) goto L_0x0084
                if (r2 != 0) goto L_0x0084
                android.content.Context r6 = r1.f348960d
                r6.unregisterReceiver(r3)
                r1.f348959D = r5
                java.lang.String r3 = "Broadcast receiving disabled."
                com.tencent.stubs.logger.Log.m106505i(r4, r3)
            L_0x0084:
                java.io.File r3 = r1.f348970q
                r3.mkdir()
                r4 = 1
                if (r0 == 0) goto L_0x06d6
                com.tencent.mm.vfs.f0$b r6 = new com.tencent.mm.vfs.f0$b
                r6.<init>(r4)
                com.tencent.mm.vfs.y1 r0 = com.tencent.p014mm.vfs.C116343y1.f349133a
                java.util.Collection<com.tencent.mm.vfs.a1> r7 = pp3.C77233q5.f225343a
                java.lang.String r8 = "storages"
                gy3.C87412m.m108594g(r7, r8)
                com.tencent.mm.vfs.AssetsSchemeResolver$b r8 = com.tencent.p014mm.vfs.AssetsSchemeResolver.CREATOR
                com.tencent.mm.vfs.AssetsSchemeResolver r8 = com.tencent.p014mm.vfs.AssetsSchemeResolver.C116193b.f348716a
                java.lang.String r9 = "assets"
                if (r8 != 0) goto L_0x00a4
                r10 = r5
                goto L_0x00a9
            L_0x00a4:
                com.tencent.mm.vfs.y0 r10 = new com.tencent.mm.vfs.y0
                r10.<init>(r8)
            L_0x00a9:
                com.tencent.mm.vfs.v0 r8 = r6.f348981a
                java.util.Map<java.lang.String, com.tencent.mm.vfs.y0<com.tencent.mm.vfs.SchemeResolver, com.tencent.mm.vfs.SchemeResolver$a>> r8 = r8.f349105a
                r8.put(r9, r10)
                com.tencent.mm.vfs.ContentsSchemeResolver$b r8 = com.tencent.p014mm.vfs.ContentsSchemeResolver.CREATOR
                com.tencent.mm.vfs.y0<com.tencent.mm.vfs.SchemeResolver, com.tencent.mm.vfs.SchemeResolver$a> r8 = com.tencent.p014mm.vfs.ContentsSchemeResolver.C116203b.f348737a
                Base r8 = r8.f349131a
                com.tencent.mm.vfs.SchemeResolver r8 = (com.tencent.p014mm.vfs.SchemeResolver) r8
                java.lang.String r9 = "content"
                if (r8 != 0) goto L_0x00be
                r10 = r5
                goto L_0x00c3
            L_0x00be:
                com.tencent.mm.vfs.y0 r10 = new com.tencent.mm.vfs.y0
                r10.<init>(r8)
            L_0x00c3:
                com.tencent.mm.vfs.v0 r8 = r6.f348981a
                java.util.Map<java.lang.String, com.tencent.mm.vfs.y0<com.tencent.mm.vfs.SchemeResolver, com.tencent.mm.vfs.SchemeResolver$a>> r8 = r8.f349105a
                r8.put(r9, r10)
                com.tencent.mm.vfs.NativeFileSystem r8 = new com.tencent.mm.vfs.NativeFileSystem
                java.lang.String r9 = "${data}"
                r8.<init>((java.lang.String) r9)
                java.lang.String r10 = "data-root"
                r6.mo177803c(r10, r8)
                com.tencent.mm.vfs.ExpireFileSystem r8 = new com.tencent.mm.vfs.ExpireFileSystem
                com.tencent.mm.vfs.NativeFileSystem r11 = new com.tencent.mm.vfs.NativeFileSystem
                java.lang.String r12 = "${dataCache}/temp"
                r11.<init>((java.lang.String) r12)
                r13 = 3
                long r14 = com.tencent.p014mm.vfs.C75061i.C75062a.m90020a(r0, r13)
                r8.<init>(r11, r14)
                java.lang.String r11 = "temp"
                r6.mo177803c(r11, r8)
                com.tencent.mm.vfs.ExpireFileSystem r8 = new com.tencent.mm.vfs.ExpireFileSystem
                com.tencent.mm.vfs.NativeFileSystem r14 = new com.tencent.mm.vfs.NativeFileSystem
                java.lang.String r15 = "${extCache}/temp"
                r14.<init>((java.lang.String) r15)
                long r3 = com.tencent.p014mm.vfs.C75061i.C75062a.m90020a(r0, r13)
                r8.<init>(r14, r3)
                java.lang.String r3 = "extTemp"
                r6.mo177803c(r3, r8)
                r6.mo177805e(r9, r10)
                r6.mo177805e(r12, r11)
                r6.mo177805e(r15, r3)
                com.tencent.mm.vfs.NativeFileSystem r3 = new com.tencent.mm.vfs.NativeFileSystem
                java.lang.String r4 = "${extData}"
                r3.<init>((java.lang.String) r4)
                java.lang.String r8 = "ext-root"
                r6.mo177803c(r8, r3)
                r6.mo177805e(r4, r8)
                com.tencent.mm.vfs.DeleteBlockingFileSystem r3 = new com.tencent.mm.vfs.DeleteBlockingFileSystem
                com.tencent.mm.vfs.NativeFileSystem r4 = new com.tencent.mm.vfs.NativeFileSystem
                java.lang.String r8 = "${storage}"
                r4.<init>((java.lang.String) r8)
                r3.<init>(r4)
                java.lang.String r4 = "storage-root"
                r6.mo177803c(r4, r3)
                r6.mo177805e(r8, r4)
                java.lang.String r3 = "/sdcard"
                r6.mo177805e(r3, r4)
                com.tencent.mm.vfs.AccessControlFileSystem r3 = new com.tencent.mm.vfs.AccessControlFileSystem
                com.tencent.mm.vfs.NativeFileSystem r4 = new com.tencent.mm.vfs.NativeFileSystem
                java.lang.String r8 = "${data}/MicroMsg/${account}"
                r4.<init>((java.lang.String) r8)
                java.lang.String r11 = "${dbProtect}"
                r3.<init>(r4, r11)
                com.tencent.mm.vfs.j r4 = com.tencent.p014mm.vfs.C116303j.f349018a
                java.lang.String r11 = "DBProtect"
                r3.mo177573a(r11, r4)
                com.tencent.mm.vfs.NativeFileSystem r4 = new com.tencent.mm.vfs.NativeFileSystem
                r4.<init>((java.lang.String) r8)
                com.tencent.mm.vfs.DBFileMultiplexFileSystem r11 = new com.tencent.mm.vfs.DBFileMultiplexFileSystem
                r11.<init>((com.tencent.p014mm.vfs.FileSystem) r3, (com.tencent.p014mm.vfs.FileSystem) r4)
                java.lang.String r3 = "acc-root"
                r6.mo177803c(r3, r11)
                r6.mo177805e(r8, r3)
                boolean r3 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
                java.lang.String r4 = "${dataCache}"
                r8 = 0
                if (r3 != 0) goto L_0x016c
                boolean r3 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
                if (r3 != 0) goto L_0x016c
                boolean r3 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_BLUE
                if (r3 != 0) goto L_0x016c
                boolean r3 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
                if (r3 == 0) goto L_0x01d2
            L_0x016c:
                com.tencent.mm.vfs.WhiteListFileSystem r3 = new com.tencent.mm.vfs.WhiteListFileSystem
                com.tencent.mm.vfs.NativeFileSystem r11 = new com.tencent.mm.vfs.NativeFileSystem
                r11.<init>((java.lang.String) r9)
                java.lang.String[] r12 = com.tencent.p014mm.vfs.C116307k1.f349022a
                r3.<init>(r11, r12)
                r6.mo177803c(r10, r3)
                r6.mo177805e(r9, r10)
                com.tencent.mm.vfs.WhiteListFileSystem r3 = new com.tencent.mm.vfs.WhiteListFileSystem
                com.tencent.mm.vfs.NativeFileSystem r9 = new com.tencent.mm.vfs.NativeFileSystem
                r9.<init>((java.lang.String) r4)
                java.lang.String[] r10 = com.tencent.p014mm.vfs.C116307k1.f349023b
                r3.<init>(r9, r10)
                java.lang.String r9 = "data-cache"
                r6.mo177803c(r9, r3)
                r6.mo177805e(r4, r9)
                com.tencent.mm.vfs.WhiteListFileSystem r3 = new com.tencent.mm.vfs.WhiteListFileSystem
                com.tencent.mm.vfs.MigrationFileSystem r9 = new com.tencent.mm.vfs.MigrationFileSystem
                com.tencent.mm.vfs.NativeFileSystem r10 = new com.tencent.mm.vfs.NativeFileSystem
                java.lang.String r11 = "${extData}/MicroMsg"
                r10.<init>((java.lang.String) r11)
                r12 = 1
                java.lang.Object[] r14 = new java.lang.Object[r12]
                com.tencent.mm.vfs.NativeFileSystem r12 = new com.tencent.mm.vfs.NativeFileSystem
                java.lang.String r15 = "${storage}/tencent/MicroMsg"
                r12.<init>((java.lang.String) r15)
                r14[r8] = r12
                r9.<init>((boolean) r8, (boolean) r8, (com.tencent.p014mm.vfs.FileSystem) r10, (java.lang.Object[]) r14)
                java.lang.String[] r10 = com.tencent.p014mm.vfs.C116307k1.f349024c
                r3.<init>(r9, r10)
                java.lang.String r9 = "ext-mm"
                r6.mo177803c(r9, r3)
                r6.mo177805e(r11, r9)
                r6.mo177805e(r15, r9)
                com.tencent.mm.vfs.WhiteListFileSystem r3 = new com.tencent.mm.vfs.WhiteListFileSystem
                com.tencent.mm.vfs.NativeFileSystem r9 = new com.tencent.mm.vfs.NativeFileSystem
                java.lang.String r10 = "${extCache}"
                r9.<init>((java.lang.String) r10)
                java.lang.String[] r11 = com.tencent.p014mm.vfs.C116307k1.f349025d
                r3.<init>(r9, r11)
                java.lang.String r9 = "ext-cache"
                r6.mo177803c(r9, r3)
                r6.mo177805e(r10, r9)
            L_0x01d2:
                com.tencent.p014mm.vfs.VFSStrategy.m163781i(r6)
                boolean r3 = p206nj.C88955f.m111058b()
                r9 = 1
                com.tencent.p014mm.vfs.VFSStrategy.m163782j(r6, r3, r9)
                r3 = 64
                boolean[] r3 = new boolean[r3]
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                java.util.ArrayList r10 = new java.util.ArrayList
                r10.<init>()
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                java.util.Iterator r7 = r7.iterator()
            L_0x01f4:
                boolean r12 = r7.hasNext()
                java.lang.String r14 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
                if (r12 == 0) goto L_0x0541
                java.lang.Object r12 = r7.next()
                com.tencent.mm.vfs.a1 r12 = (com.tencent.p014mm.vfs.C75055a1) r12
                com.tencent.mm.vfs.d r13 = r12.f220818e
                int r5 = r13.f220839a
                int r8 = r12.f220816c
                r17 = r8 & 15
                r18 = r8 & 1
                if (r18 == 0) goto L_0x0211
                r18 = 1
                goto L_0x0213
            L_0x0211:
                r18 = 0
            L_0x0213:
                r8 = r8 & 1024(0x400, float:1.435E-42)
                if (r8 == 0) goto L_0x0219
                r8 = 1
                goto L_0x021a
            L_0x0219:
                r8 = 0
            L_0x021a:
                java.lang.String r15 = r12.f220814a
                r19 = r7
                java.lang.String r7 = r12.f220815b
                java.util.Map r7 = r13.mo104655b(r15, r7)
                java.util.Map<java.lang.String, java.lang.Object> r13 = r12.f220819f
                if (r13 != 0) goto L_0x022a
                if (r8 == 0) goto L_0x0246
            L_0x022a:
                java.util.HashMap r13 = new java.util.HashMap
                r13.<init>(r7)
                java.util.Map<java.lang.String, java.lang.Object> r7 = r12.f220819f
                if (r7 == 0) goto L_0x0236
                r13.putAll(r7)
            L_0x0236:
                r7 = 1040(0x410, float:1.457E-42)
                if (r8 == 0) goto L_0x0243
                java.lang.String r7 = java.lang.String.valueOf(r7)
                java.lang.String r8 = "logFlags"
                r13.put(r8, r7)
            L_0x0243:
                rx3.b0 r7 = rx3.C13598b0.f38549a
                r7 = r13
            L_0x0246:
                java.util.List<java.lang.String> r8 = r12.f220820g
                if (r8 != 0) goto L_0x02d6
                com.tencent.mm.vfs.d r8 = r12.f220818e
                fy3.l r8 = r8.mo104654a()
                if (r8 == 0) goto L_0x0254
                goto L_0x02d6
            L_0x0254:
                int r8 = r5 << 4
                r8 = r8 | r17
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = "tmpl-"
                r13.append(r14)
                r14 = 16
                z04.C66713a.m78712a(r14)
                java.lang.String r15 = java.lang.Integer.toString(r8, r14)
                java.lang.String r14 = "toString(this, checkRadix(radix))"
                gy3.C87412m.m108593f(r15, r14)
                r13.append(r15)
                java.lang.String r13 = r13.toString()
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                r20 = r1
                java.lang.String r1 = "clean-"
                r15.append(r1)
                r1 = 16
                z04.C66713a.m78712a(r1)
                r21 = r2
                java.lang.String r2 = java.lang.Integer.toString(r8, r1)
                gy3.C87412m.m108593f(r2, r14)
                r15.append(r2)
                java.lang.String r1 = r15.toString()
                boolean r2 = r3[r8]
                if (r2 != 0) goto L_0x02bd
                fy3.l<com.tencent.mm.vfs.FileSystem, com.tencent.mm.vfs.FileSystem>[] r2 = com.tencent.p014mm.vfs.C116291f2.f349003f
                r2 = r2[r5]
                com.tencent.mm.vfs.AbstractFileSystem[] r5 = com.tencent.p014mm.vfs.C116291f2.f348999b
                r5 = r5[r17]
                java.lang.Object r2 = r2.invoke(r5)
                com.tencent.mm.vfs.FileSystem r2 = (com.tencent.p014mm.vfs.FileSystem) r2
                r6.mo177803c(r13, r2)
                boolean r2 = com.tencent.p014mm.vfs.C116343y1.f349134b
                if (r2 == 0) goto L_0x02ba
                com.tencent.mm.vfs.FileSystem[] r2 = com.tencent.p014mm.vfs.C116291f2.f349000c
                r2 = r2[r17]
                if (r2 == 0) goto L_0x02ba
                r6.mo177803c(r1, r2)
            L_0x02ba:
                r2 = 1
                r3[r8] = r2
            L_0x02bd:
                com.tencent.mm.vfs.EnvOverrideFileSystem r2 = new com.tencent.mm.vfs.EnvOverrideFileSystem
                r2.<init>((java.lang.String) r13, (java.util.Map<java.lang.String, java.lang.Object>) r7)
                boolean r5 = com.tencent.p014mm.vfs.C116343y1.f349134b
                if (r5 == 0) goto L_0x0366
                com.tencent.mm.vfs.FileSystem[] r5 = com.tencent.p014mm.vfs.C116291f2.f349000c
                r5 = r5[r17]
                if (r5 == 0) goto L_0x0366
                com.tencent.mm.vfs.EnvOverrideFileSystem r5 = new com.tencent.mm.vfs.EnvOverrideFileSystem
                r5.<init>((java.lang.String) r1, (java.util.Map<java.lang.String, java.lang.Object>) r7)
                r9.add(r5)
                goto L_0x0366
            L_0x02d6:
                r20 = r1
                r21 = r2
                java.util.List<java.lang.String> r1 = r12.f220820g
                if (r1 == 0) goto L_0x034a
                int r1 = r1.size()
                r2 = 1
                if (r1 != r2) goto L_0x02f4
                com.tencent.mm.vfs.NativeFileSystem r1 = new com.tencent.mm.vfs.NativeFileSystem
                java.util.List<java.lang.String> r2 = r12.f220820g
                r8 = 0
                java.lang.Object r2 = r2.get(r8)
                java.lang.String r2 = (java.lang.String) r2
                r1.<init>((java.lang.String) r2)
                goto L_0x034e
            L_0x02f4:
                r8 = 0
                com.tencent.mm.vfs.NativeFileSystem r1 = new com.tencent.mm.vfs.NativeFileSystem
                java.util.List<java.lang.String> r2 = r12.f220820g
                java.lang.Object r2 = r2.get(r8)
                java.lang.String r2 = (java.lang.String) r2
                r1.<init>((java.lang.String) r2)
                java.util.List<java.lang.String> r2 = r12.f220820g
                int r8 = r2.size()
                r13 = 1
                java.util.List r2 = r2.subList(r13, r8)
                java.util.ArrayList r8 = new java.util.ArrayList
                r13 = 10
                int r13 = sx3.C36907w.m41090l(r2, r13)
                r8.<init>(r13)
                java.util.Iterator r2 = r2.iterator()
            L_0x031c:
                boolean r13 = r2.hasNext()
                if (r13 == 0) goto L_0x0331
                java.lang.Object r13 = r2.next()
                java.lang.String r13 = (java.lang.String) r13
                com.tencent.mm.vfs.NativeFileSystem r15 = new com.tencent.mm.vfs.NativeFileSystem
                r15.<init>((java.lang.String) r13)
                r8.add(r15)
                goto L_0x031c
            L_0x0331:
                r13 = 0
                com.tencent.mm.vfs.NativeFileSystem[] r2 = new com.tencent.p014mm.vfs.NativeFileSystem[r13]
                java.lang.Object[] r2 = r8.toArray(r2)
                gy3.C87412m.m108592e(r2, r14)
                com.tencent.mm.vfs.NativeFileSystem[] r2 = (com.tencent.p014mm.vfs.NativeFileSystem[]) r2
                int r8 = r2.length
                java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r8)
                com.tencent.mm.vfs.MigrationFileSystem r8 = new com.tencent.mm.vfs.MigrationFileSystem
                r14 = 1
                r8.<init>((boolean) r13, (boolean) r14, (com.tencent.p014mm.vfs.FileSystem) r1, (java.lang.Object[]) r2)
                r1 = r8
                goto L_0x034e
            L_0x034a:
                com.tencent.mm.vfs.AbstractFileSystem[] r1 = com.tencent.p014mm.vfs.C116291f2.f348999b
                r1 = r1[r17]
            L_0x034e:
                com.tencent.mm.vfs.d r2 = r12.f220818e
                fy3.l r2 = r2.mo104654a()
                if (r2 != 0) goto L_0x035a
                fy3.l<com.tencent.mm.vfs.FileSystem, com.tencent.mm.vfs.FileSystem>[] r2 = com.tencent.p014mm.vfs.C116291f2.f349003f
                r2 = r2[r5]
            L_0x035a:
                com.tencent.mm.vfs.EnvOverrideFileSystem r5 = new com.tencent.mm.vfs.EnvOverrideFileSystem
                java.lang.Object r1 = r2.invoke(r1)
                com.tencent.mm.vfs.FileSystem r1 = (com.tencent.p014mm.vfs.FileSystem) r1
                r5.<init>((com.tencent.p014mm.vfs.FileSystem) r1, (java.util.Map<java.lang.String, java.lang.Object>) r7)
                r2 = r5
            L_0x0366:
                int r1 = r12.f220816c
                r5 = 32
                boolean r1 = com.tencent.p014mm.vfs.C75061i.C75062a.m90022c(r0, r1, r5)
                if (r1 == 0) goto L_0x0376
                com.tencent.mm.vfs.RefCountedFileSystem r1 = new com.tencent.mm.vfs.RefCountedFileSystem
                r1.<init>((com.tencent.p014mm.vfs.FileSystem) r2)
                r2 = r1
            L_0x0376:
                fy3.l<com.tencent.mm.vfs.FileSystem, com.tencent.mm.vfs.FileSystem> r1 = r12.f220821h
                if (r1 == 0) goto L_0x0380
                java.lang.Object r2 = r1.invoke(r2)
                rx3.b0 r1 = rx3.C13598b0.f38549a
            L_0x0380:
                int r1 = r12.f220816c
                r5 = 16
                boolean r1 = com.tencent.p014mm.vfs.C75061i.C75062a.m90022c(r0, r1, r5)
                if (r1 == 0) goto L_0x038f
                java.lang.String r1 = r12.f220814a
                r11.add(r1)
            L_0x038f:
                boolean r1 = com.tencent.p014mm.vfs.C116343y1.f349134b
                if (r1 == 0) goto L_0x048f
                int r1 = r12.f220816c
                r5 = 128(0x80, float:1.794E-43)
                boolean r1 = com.tencent.p014mm.vfs.C75061i.C75062a.m90022c(r0, r1, r5)
                if (r1 == 0) goto L_0x03ac
                com.tencent.mm.vfs.w$a r1 = new com.tencent.mm.vfs.w$a
                r5 = r2
                com.tencent.mm.vfs.FileSystem r5 = (com.tencent.p014mm.vfs.FileSystem) r5
                java.lang.String r8 = "${accountOtherList}"
                java.lang.String r13 = "account|accountSalt|accountSd"
                r1.<init>(r5, r8, r13)
                r10.add(r1)
            L_0x03ac:
                java.lang.String[] r1 = com.tencent.p014mm.vfs.C75071z1.f220855a
                java.util.List<java.lang.String> r1 = r12.f220820g
                if (r1 == 0) goto L_0x03cc
                boolean r1 = r1.isEmpty()
                r5 = 1
                r1 = r1 ^ r5
                if (r1 == 0) goto L_0x03cc
                java.util.List<java.lang.String> r1 = r12.f220820g
                r5 = 0
                java.lang.Object r1 = r1.get(r5)
                java.lang.String r5 = "${data}/${dir}"
                boolean r1 = gy3.C87412m.m108589b(r1, r5)
                if (r1 == 0) goto L_0x03cc
                r1 = 2050(0x802, float:2.873E-42)
                goto L_0x03e6
            L_0x03cc:
                com.tencent.mm.vfs.y1 r1 = com.tencent.p014mm.vfs.C116343y1.f349133a
                int r5 = r12.f220816c
                r8 = 8
                boolean r5 = com.tencent.p014mm.vfs.C75061i.C75062a.m90022c(r1, r5, r8)
                if (r5 == 0) goto L_0x03da
                r1 = 1
                goto L_0x03e6
            L_0x03da:
                int r5 = r12.f220816c
                r8 = 4
                boolean r1 = com.tencent.p014mm.vfs.C75061i.C75062a.m90022c(r1, r5, r8)
                if (r1 == 0) goto L_0x03e5
                r1 = 3
                goto L_0x03e6
            L_0x03e5:
                r1 = 2
            L_0x03e6:
                int r5 = r12.f220816c
                r8 = 1
                r5 = r5 & r8
                if (r5 != 0) goto L_0x03ef
                r16 = 1
                goto L_0x03f1
            L_0x03ef:
                r16 = 0
            L_0x03f1:
                if (r16 == 0) goto L_0x03f5
                r1 = r1 | 4
            L_0x03f5:
                com.tencent.mm.vfs.StatisticsFileSystem r5 = new com.tencent.mm.vfs.StatisticsFileSystem
                com.tencent.mm.vfs.FileSystem r2 = (com.tencent.p014mm.vfs.FileSystem) r2
                r5.<init>(r2, r8)
                java.lang.String r2 = "target"
                java.lang.String r2 = com.tencent.p014mm.vfs.C116299g2.m163848d(r7, r2)
                r13 = 0
                if (r2 == 0) goto L_0x0413
                java.lang.Long r2 = z04.C66731x.m78732f(r2)
                if (r2 == 0) goto L_0x0413
                long r22 = r2.longValue()
                r26 = r22
                goto L_0x0415
            L_0x0413:
                r26 = r13
            L_0x0415:
                java.lang.String r2 = "expire"
                java.lang.String r2 = com.tencent.p014mm.vfs.C116299g2.m163848d(r7, r2)
                if (r2 == 0) goto L_0x042a
                java.lang.Long r2 = z04.C66731x.m78732f(r2)
                if (r2 == 0) goto L_0x042a
                long r7 = r2.longValue()
                r28 = r7
                goto L_0x042c
            L_0x042a:
                r28 = r13
            L_0x042c:
                java.util.List<java.lang.String> r2 = r12.f220820g
                if (r2 == 0) goto L_0x043a
                boolean r2 = r2.isEmpty()
                r7 = 1
                r2 = r2 ^ r7
                if (r2 != r7) goto L_0x043a
                r2 = 1
                goto L_0x043b
            L_0x043a:
                r2 = 0
            L_0x043b:
                if (r2 == 0) goto L_0x0459
                java.util.List<java.lang.String> r2 = r12.f220820g
                r7 = 0
                java.lang.Object r2 = r2.get(r7)
                r30 = r2
                java.lang.String r30 = (java.lang.String) r30
                java.lang.String r2 = r12.f220815b
                r33 = 0
                r34 = 4
                r35 = 0
                java.lang.String r31 = "${dir}"
                r32 = r2
                java.lang.String r2 = z04.C112551y.m153816p(r30, r31, r32, r33, r34, r35)
                goto L_0x046e
            L_0x0459:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String[] r7 = com.tencent.p014mm.vfs.C116291f2.f349001d
                r7 = r7[r17]
                r2.append(r7)
                java.lang.String r7 = r12.f220815b
                r2.append(r7)
                java.lang.String r2 = r2.toString()
            L_0x046e:
                r23 = r2
                java.lang.String r2 = r12.f220814a
                com.tencent.mm.vfs.o r7 = new com.tencent.mm.vfs.o
                com.tencent.mm.vfs.d r8 = r12.f220818e
                int r8 = r8.f220839a
                r13 = 1
                int r24 = r8 + 1
                r22 = r7
                r25 = r1
                r22.<init>(r23, r24, r25, r26, r28)
                r5.mo177573a(r2, r7)
                rx3.b0 r2 = rx3.C13598b0.f38549a
                java.lang.String r2 = r12.f220814a
                java.lang.String r7 = r12.f220815b
                com.tencent.p014mm.vfs.C116314o.m163921g(r2, r7, r1)
                r2 = r5
            L_0x048f:
                java.lang.String r1 = r12.f220814a
                com.tencent.mm.vfs.FileSystem r2 = (com.tencent.p014mm.vfs.FileSystem) r2
                r6.mo177803c(r1, r2)
                int r1 = r12.f220816c
                r2 = 512(0x200, float:7.175E-43)
                boolean r1 = com.tencent.p014mm.vfs.C75061i.C75062a.m90022c(r0, r1, r2)
                if (r1 == 0) goto L_0x04a3
                r1 = 65536(0x10000, float:9.18355E-41)
                goto L_0x04b1
            L_0x04a3:
                int r1 = r12.f220816c
                r2 = 256(0x100, float:3.59E-43)
                boolean r1 = com.tencent.p014mm.vfs.C75061i.C75062a.m90022c(r0, r1, r2)
                if (r1 == 0) goto L_0x04b0
                r1 = 4096(0x1000, float:5.74E-42)
                goto L_0x04b1
            L_0x04b0:
                r1 = 0
            L_0x04b1:
                com.tencent.mm.vfs.c0 r2 = com.tencent.p014mm.vfs.C116271c0.f348905a
                java.lang.String r2 = r12.f220814a
                int r5 = r12.f220817d
                r1 = r1 | r5
                java.lang.String r5 = "fsName"
                gy3.C87412m.m108594g(r2, r5)
                if (r18 == 0) goto L_0x04c2
                java.util.Map<java.lang.String, java.lang.Integer> r7 = com.tencent.p014mm.vfs.C116271c0.f348906b
                goto L_0x04c4
            L_0x04c2:
                java.util.Map<java.lang.String, java.lang.Integer> r7 = com.tencent.p014mm.vfs.C116271c0.f348907c
            L_0x04c4:
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r7.put(r2, r1)
                java.util.List<java.lang.String> r1 = r12.f220820g
                if (r1 == 0) goto L_0x04dd
                y04.h r1 = sx3.C110818d0.m150897A(r1)
                com.tencent.mm.vfs.w1 r2 = new com.tencent.mm.vfs.w1
                r2.<init>(r12)
                y04.h r1 = y04.C112354s.m153290m(r1, r2)
                goto L_0x04ee
            L_0x04dd:
                java.lang.String[][] r1 = com.tencent.p014mm.vfs.C116291f2.f349002e
                r1 = r1[r17]
                y04.h r1 = sx3.C110823p.m151006v(r1)
                com.tencent.mm.vfs.x1 r2 = new com.tencent.mm.vfs.x1
                r2.<init>(r12)
                y04.h r1 = y04.C112354s.m153290m(r1, r2)
            L_0x04ee:
                y04.v r1 = (y04.C66488v) r1
                y04.h<T> r2 = r1.f191269a
                java.util.Iterator r2 = r2.iterator()
                r7 = 0
            L_0x04f7:
                boolean r8 = r2.hasNext()
                if (r8 == 0) goto L_0x0528
                fy3.l<T, R> r8 = r1.f191270b
                java.lang.Object r13 = r2.next()
                java.lang.Object r8 = r8.invoke(r13)
                java.lang.String r8 = (java.lang.String) r8
                java.lang.String r13 = r12.f220814a
                r6.mo177805e(r8, r13)
                com.tencent.mm.vfs.c0 r13 = com.tencent.p014mm.vfs.C116271c0.f348905a
                java.lang.String r13 = r12.f220814a
                gy3.C87412m.m108594g(r13, r5)
                if (r18 == 0) goto L_0x051a
                java.util.List<rx3.l<java.lang.String, java.lang.String>> r14 = com.tencent.p014mm.vfs.C116271c0.f348908d
                goto L_0x051c
            L_0x051a:
                java.util.List<rx3.l<java.lang.String, java.lang.String>> r14 = com.tencent.p014mm.vfs.C116271c0.f348909e
            L_0x051c:
                rx3.l r15 = new rx3.l
                r15.<init>(r8, r13)
                r14.add(r15)
                if (r7 != 0) goto L_0x04f7
                r7 = r8
                goto L_0x04f7
            L_0x0528:
                if (r7 == 0) goto L_0x0536
                java.util.HashMap<java.lang.String, com.tencent.mm.vfs.x> r1 = com.tencent.p014mm.vfs.C116343y1.f349135c
                java.lang.String r2 = r12.f220814a
                com.tencent.mm.vfs.x r5 = new com.tencent.mm.vfs.x
                r5.<init>(r7)
                r1.put(r2, r5)
            L_0x0536:
                r7 = r19
                r1 = r20
                r2 = r21
                r5 = 0
                r8 = 0
                r13 = 3
                goto L_0x01f4
            L_0x0541:
                r20 = r1
                r21 = r2
                sx3.C77813z.m93908n(r11)
                r1 = 0
                java.lang.String[] r0 = new java.lang.String[r1]
                java.lang.Object[] r0 = r11.toArray(r0)
                gy3.C87412m.m108592e(r0, r14)
                java.lang.String[] r0 = (java.lang.String[]) r0
                com.tencent.p014mm.vfs.C116343y1.f349136d = r0
                boolean r0 = com.tencent.p014mm.vfs.C116343y1.f349134b
                if (r0 == 0) goto L_0x06d1
                com.tencent.mm.vfs.MigrationStatistics$MigrationStatisticsFileSystem r0 = new com.tencent.mm.vfs.MigrationStatistics$MigrationStatisticsFileSystem
                r1 = 0
                r0.<init>(r1)
                java.lang.String r2 = "@MigrationStatistics"
                r6.mo177804d(r2, r0)
                r0 = 6
                java.lang.String r2 = "appbrand"
                com.tencent.p014mm.vfs.C116314o.m163921g(r1, r2, r0)
                java.lang.String r2 = ""
                java.lang.String r3 = "VFS.CleanRubbish"
                r0 = 16
                java.lang.Object[] r5 = new java.lang.Object[r0]
                r7 = 0
            L_0x0574:
                if (r7 >= r0) goto L_0x0589
                com.tencent.mm.vfs.DeleteAllFileSystem r8 = new com.tencent.mm.vfs.DeleteAllFileSystem
                com.tencent.mm.vfs.NativeFileSystem r9 = new com.tencent.mm.vfs.NativeFileSystem
                java.lang.String[] r10 = com.tencent.p014mm.vfs.C116280f.f348950a
                r10 = r10[r7]
                r9.<init>((java.lang.String) r10)
                r8.<init>((com.tencent.p014mm.vfs.FileSystem) r9)
                r5[r7] = r8
                int r7 = r7 + 1
                goto L_0x0574
            L_0x0589:
                com.tencent.mm.vfs.MaintenanceGroup r0 = new com.tencent.mm.vfs.MaintenanceGroup
                r0.<init>((java.lang.Object[]) r5)
                java.lang.String r5 = "@CleanRubbish"
                r6.mo177804d(r5, r0)
                java.lang.String r0 = "[0-9a-f]{32}(temp[0-9]+)?"
                java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
                com.tencent.mm.vfs.NativeFileSystem r5 = new com.tencent.mm.vfs.NativeFileSystem     // Catch:{ Exception -> 0x061e }
                java.lang.String r7 = "${sdFrom}/MicroMsg"
                r5.<init>((java.lang.String) r7)     // Catch:{ Exception -> 0x061e }
                com.tencent.mm.vfs.f0 r7 = f348994a     // Catch:{ Exception -> 0x061e }
                java.util.Map r7 = r7.mo177791d()     // Catch:{ Exception -> 0x061e }
                com.tencent.mm.vfs.FileSystem$c r5 = r5.mo177578v(r7)     // Catch:{ Exception -> 0x061e }
                java.lang.Iterable r5 = r5.list(r2)     // Catch:{ Exception -> 0x061e }
                if (r5 != 0) goto L_0x05b4
                java.util.List r5 = java.util.Collections.emptyList()     // Catch:{ Exception -> 0x061e }
            L_0x05b4:
                java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ Exception -> 0x061e }
                r7.<init>()     // Catch:{ Exception -> 0x061e }
                java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x061e }
            L_0x05bd:
                boolean r8 = r5.hasNext()     // Catch:{ Exception -> 0x061e }
                if (r8 == 0) goto L_0x060d
                java.lang.Object r8 = r5.next()     // Catch:{ Exception -> 0x061e }
                com.tencent.mm.vfs.b0 r8 = (com.tencent.p014mm.vfs.C86001b0) r8     // Catch:{ Exception -> 0x061e }
                boolean r9 = r8.f250476f     // Catch:{ Exception -> 0x061e }
                if (r9 != 0) goto L_0x05ce
                goto L_0x05bd
            L_0x05ce:
                java.lang.String r9 = r8.f250472b     // Catch:{ Exception -> 0x061e }
                java.util.regex.Matcher r9 = r0.matcher(r9)     // Catch:{ Exception -> 0x061e }
                boolean r10 = r9.matches()     // Catch:{ Exception -> 0x061e }
                if (r10 != 0) goto L_0x05db
                goto L_0x05bd
            L_0x05db:
                r10 = 1
                java.lang.String r9 = r9.group(r10)     // Catch:{ Exception -> 0x061e }
                if (r9 == 0) goto L_0x05e8
                boolean r9 = r9.isEmpty()     // Catch:{ Exception -> 0x061e }
                if (r9 == 0) goto L_0x05ec
            L_0x05e8:
                boolean r9 = com.tencent.p014mm.vfs.VFSStrategy.f348873c     // Catch:{ Exception -> 0x061e }
                if (r9 == 0) goto L_0x05bd
            L_0x05ec:
                com.tencent.mm.vfs.DeleteAllFileSystem r9 = new com.tencent.mm.vfs.DeleteAllFileSystem     // Catch:{ Exception -> 0x061e }
                com.tencent.mm.vfs.NativeFileSystem r10 = new com.tencent.mm.vfs.NativeFileSystem     // Catch:{ Exception -> 0x061e }
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x061e }
                r11.<init>()     // Catch:{ Exception -> 0x061e }
                java.lang.String r12 = "${sdFrom}/MicroMsg/"
                r11.append(r12)     // Catch:{ Exception -> 0x061e }
                java.lang.String r8 = r8.f250472b     // Catch:{ Exception -> 0x061e }
                r11.append(r8)     // Catch:{ Exception -> 0x061e }
                java.lang.String r8 = r11.toString()     // Catch:{ Exception -> 0x061e }
                r10.<init>((java.lang.String) r8)     // Catch:{ Exception -> 0x061e }
                r9.<init>((com.tencent.p014mm.vfs.FileSystem) r10)     // Catch:{ Exception -> 0x061e }
                r7.add(r9)     // Catch:{ Exception -> 0x061e }
                goto L_0x05bd
            L_0x060d:
                boolean r0 = r7.isEmpty()     // Catch:{ Exception -> 0x061e }
                if (r0 != 0) goto L_0x0627
                java.lang.String r0 = "@CleanAbandon"
                com.tencent.mm.vfs.MaintenanceGroup r5 = new com.tencent.mm.vfs.MaintenanceGroup     // Catch:{ Exception -> 0x061e }
                r5.<init>((java.util.Collection<?>) r7)     // Catch:{ Exception -> 0x061e }
                r6.mo177804d(r0, r5)     // Catch:{ Exception -> 0x061e }
                goto L_0x0627
            L_0x061e:
                r0 = move-exception
                r5 = 0
                java.lang.Object[] r7 = new java.lang.Object[r5]
                java.lang.String r5 = "Failed installing wild account cleaner"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r5, r7)
            L_0x0627:
                java.lang.String r0 = "old_org\\.chromium\\.android_webview_[0-9]+"
                java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
                com.tencent.mm.vfs.NativeFileSystem r5 = new com.tencent.mm.vfs.NativeFileSystem     // Catch:{ Exception -> 0x069f }
                r5.<init>((java.lang.String) r4)     // Catch:{ Exception -> 0x069f }
                com.tencent.mm.vfs.f0 r7 = f348994a     // Catch:{ Exception -> 0x069f }
                java.util.Map r7 = r7.mo177791d()     // Catch:{ Exception -> 0x069f }
                com.tencent.mm.vfs.FileSystem$c r5 = r5.mo177578v(r7)     // Catch:{ Exception -> 0x069f }
                java.lang.Iterable r2 = r5.list(r2)     // Catch:{ Exception -> 0x069f }
                if (r2 != 0) goto L_0x0646
                java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ Exception -> 0x069f }
            L_0x0646:
                java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x069f }
                r5.<init>()     // Catch:{ Exception -> 0x069f }
                java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x069f }
            L_0x064f:
                boolean r7 = r2.hasNext()     // Catch:{ Exception -> 0x069f }
                if (r7 == 0) goto L_0x068e
                java.lang.Object r7 = r2.next()     // Catch:{ Exception -> 0x069f }
                com.tencent.mm.vfs.b0 r7 = (com.tencent.p014mm.vfs.C86001b0) r7     // Catch:{ Exception -> 0x069f }
                boolean r8 = r7.f250476f     // Catch:{ Exception -> 0x069f }
                if (r8 != 0) goto L_0x0660
                goto L_0x064f
            L_0x0660:
                java.lang.String r8 = r7.f250472b     // Catch:{ Exception -> 0x069f }
                java.util.regex.Matcher r8 = r0.matcher(r8)     // Catch:{ Exception -> 0x069f }
                boolean r8 = r8.matches()     // Catch:{ Exception -> 0x069f }
                if (r8 != 0) goto L_0x066d
                goto L_0x064f
            L_0x066d:
                com.tencent.mm.vfs.DeleteAllFileSystem r8 = new com.tencent.mm.vfs.DeleteAllFileSystem     // Catch:{ Exception -> 0x069f }
                com.tencent.mm.vfs.NativeFileSystem r9 = new com.tencent.mm.vfs.NativeFileSystem     // Catch:{ Exception -> 0x069f }
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x069f }
                r10.<init>()     // Catch:{ Exception -> 0x069f }
                java.lang.String r11 = "${dataCache}/"
                r10.append(r11)     // Catch:{ Exception -> 0x069f }
                java.lang.String r7 = r7.f250472b     // Catch:{ Exception -> 0x069f }
                r10.append(r7)     // Catch:{ Exception -> 0x069f }
                java.lang.String r7 = r10.toString()     // Catch:{ Exception -> 0x069f }
                r9.<init>((java.lang.String) r7)     // Catch:{ Exception -> 0x069f }
                r8.<init>((com.tencent.p014mm.vfs.FileSystem) r9)     // Catch:{ Exception -> 0x069f }
                r5.add(r8)     // Catch:{ Exception -> 0x069f }
                goto L_0x064f
            L_0x068e:
                boolean r0 = r5.isEmpty()     // Catch:{ Exception -> 0x069f }
                if (r0 != 0) goto L_0x06a8
                java.lang.String r0 = "@CleanOldWebViewCache"
                com.tencent.mm.vfs.MaintenanceGroup r2 = new com.tencent.mm.vfs.MaintenanceGroup     // Catch:{ Exception -> 0x069f }
                r2.<init>((java.util.Collection<?>) r5)     // Catch:{ Exception -> 0x069f }
                r6.mo177804d(r0, r2)     // Catch:{ Exception -> 0x069f }
                goto L_0x06a8
            L_0x069f:
                r0 = move-exception
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r5 = "Failed installing old WebView cache cleaner"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r5, r2)
            L_0x06a8:
                com.tencent.mm.vfs.QQMusicCacheCleanupFileSystem r0 = new com.tencent.mm.vfs.QQMusicCacheCleanupFileSystem
                com.tencent.mm.vfs.NativeFileSystem r2 = new com.tencent.mm.vfs.NativeFileSystem
                r2.<init>((java.lang.String) r4)
                r0.<init>((com.tencent.p014mm.vfs.FileSystem) r2)
                com.tencent.mm.vfs.QQMusicCacheCleanupFileSystem$b r2 = new com.tencent.mm.vfs.QQMusicCacheCleanupFileSystem$b
                r2.<init>()
                java.lang.String r3 = "@QQMusicCacheClean"
                r0.mo177573a(r3, r2)
                r6.mo177804d(r3, r0)
                com.tencent.mm.vfs.ApkCleanupFileSystem r0 = new com.tencent.mm.vfs.ApkCleanupFileSystem
                com.tencent.mm.vfs.NativeFileSystem r2 = new com.tencent.mm.vfs.NativeFileSystem
                java.lang.String r3 = "${sdTo}/MicroMsg"
                r2.<init>((java.lang.String) r3)
                r0.<init>((com.tencent.p014mm.vfs.FileSystem) r2)
                java.lang.String r2 = "@ApkClean"
                r6.mo177804d(r2, r0)
                goto L_0x06d2
            L_0x06d1:
                r1 = 0
            L_0x06d2:
                com.tencent.mm.vfs.v0 r0 = r6.f348981a
                r2 = r0
                goto L_0x06dc
            L_0x06d6:
                r20 = r1
                r21 = r2
                r1 = r5
                r2 = r1
            L_0x06dc:
                if (r21 == 0) goto L_0x06fc
                android.os.Bundle r0 = r20.mo177793g()     // Catch:{ d -> 0x06f2, all -> 0x06e9 }
                if (r0 == 0) goto L_0x06fc
                com.tencent.mm.vfs.v0 r5 = com.tencent.p014mm.vfs.C116333v0.m163940b(r0)     // Catch:{ d -> 0x06f2, all -> 0x06e9 }
                goto L_0x06fd
            L_0x06e9:
                r0 = move-exception
                java.lang.String r3 = "VFS.FileSystemManager"
                java.lang.String r4 = "Cannot load file systems from parcel."
                com.tencent.stubs.logger.Log.m106499e((java.lang.String) r3, (java.lang.Throwable) r0, (java.lang.String) r4)
                goto L_0x06fc
            L_0x06f2:
                r0 = move-exception
                java.lang.String r3 = "VFS.FileSystemManager"
                java.lang.String r0 = r0.getMessage()
                com.tencent.stubs.logger.Log.m106505i(r3, r0)
            L_0x06fc:
                r5 = r1
            L_0x06fd:
                r1 = r20
                java.lang.Object r3 = r1.f348966j
                monitor-enter(r3)
                if (r2 == 0) goto L_0x0709
                r1.f348967n = r2     // Catch:{ all -> 0x0707 }
                goto L_0x0709
            L_0x0707:
                r0 = move-exception
                goto L_0x0744
            L_0x0709:
                if (r5 == 0) goto L_0x070d
                r1.f348968o = r5     // Catch:{ all -> 0x0707 }
            L_0x070d:
                r4 = 1
                r1.mo177798k(r4)     // Catch:{ all -> 0x0707 }
                monitor-exit(r3)     // Catch:{ all -> 0x0707 }
                if (r2 == 0) goto L_0x0727
                java.lang.String r0 = "VFS.FileSystemManager"
                java.lang.String r3 = "Initialized private layer:"
                com.tencent.stubs.logger.Log.m106505i(r0, r3)
                com.tencent.stubs.logger.LogPrinter r0 = new com.tencent.stubs.logger.LogPrinter
                java.lang.String r3 = "VFS.FileSystemManager"
                r4 = 4
                r0.<init>(r4, r3)
                r2.mo177828d(r0)
                goto L_0x0728
            L_0x0727:
                r4 = 4
            L_0x0728:
                if (r5 == 0) goto L_0x073b
                java.lang.String r0 = "VFS.FileSystemManager"
                java.lang.String r2 = "Loaded public layer from bundle:"
                com.tencent.stubs.logger.Log.m106505i(r0, r2)
                com.tencent.stubs.logger.LogPrinter r0 = new com.tencent.stubs.logger.LogPrinter
                java.lang.String r2 = "VFS.FileSystemManager"
                r0.<init>(r4, r2)
                r5.mo177828d(r0)
            L_0x073b:
                android.os.Handler r0 = r1.f348973t
                r1 = 2147483647(0x7fffffff, float:NaN)
                r0.sendEmptyMessage(r1)
                return
            L_0x0744:
                monitor-exit(r3)     // Catch:{ all -> 0x0707 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.C116281f0.C116289i.<clinit>():void");
        }
    }

    public C116281f0() {
        Context context = f348951E;
        this.f348960d = context;
        this.f348961e = f348954H;
        if (context != null) {
            File parentFile = context.getFilesDir().getParentFile();
            this.f348970q = new File(parentFile == null ? context.getCacheDir() : parentFile, ".vfs");
            this.f348974u = new Message[3];
            HandlerThread handlerThread = new HandlerThread("VFS.Maintenance", 1);
            this.f348971r = handlerThread;
            handlerThread.start();
            this.f348973t = new Handler(handlerThread.getLooper(), this);
            this.f348972s = new C116285e((C116278e0) null);
            this.f348975v = -1;
            this.f348976w = MAlarmHandler.NEXT_FIRE_INTERVAL;
            this.f348958C = true;
            this.f348956A = new C116282a();
            this.f348957B = m163818f(context);
            C116333v0 v0Var = new C116333v0();
            Map<String, C116342y0<SchemeResolver, SchemeResolver.C116250a>> map = v0Var.f349105a;
            FileSchemeResolver.C116214b bVar = FileSchemeResolver.CREATOR;
            C116342y0<SchemeResolver, SchemeResolver.C116250a> y0Var = FileSchemeResolver.C116214b.f348758a;
            map.put((Object) null, y0Var);
            v0Var.f349105a.put("", y0Var);
            v0Var.f349105a.put("file", y0Var);
            Map<String, C116342y0<SchemeResolver, SchemeResolver.C116250a>> map2 = v0Var.f349105a;
            WcfSchemeResolver.C116262b bVar2 = WcfSchemeResolver.CREATOR;
            map2.put("wcf", WcfSchemeResolver.C116262b.f348891a);
            Map<String, C116342y0<FileSystem, FileSystem.C85995c>> map3 = v0Var.f349106b;
            Parcelable.Creator<NullFileSystem> creator = NullFileSystem.CREATOR;
            map3.put("null", NullFileSystem.C116231b.f348795a);
            v0Var.f349109e.put("data", context.getCacheDir().getParent());
            v0Var.f349109e.put("dataCache", context.getCacheDir().getPath());
            this.f348969p = v0Var;
            C116333v0.m163941c(v0Var.f349109e, this.f348957B);
            this.f348967n = new C116333v0();
            this.f348968o = new C116333v0();
            this.f348963g = new C116340x0(this.f348969p);
            this.f348964h = 0;
            this.f348965i = new C116288h((FileSystem.C85995c) null, (String) null, 0, (C116278e0) null);
            return;
        }
        throw new IllegalStateException("Call FileSystemManager.setContext(Context) before calling instance()");
    }

    /* renamed from: f */
    public static HashMap<String, Object> m163818f(Context context) {
        HashMap<String, Object> hashMap = new HashMap<>();
        File externalCacheDir = context.getExternalCacheDir();
        String str = null;
        hashMap.put("extData", externalCacheDir == null ? null : externalCacheDir.getParent());
        hashMap.put("extCache", externalCacheDir == null ? null : externalCacheDir.getPath());
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            str = externalStorageDirectory.getPath();
        }
        hashMap.put("storage", str);
        return hashMap;
    }

    /* renamed from: m */
    public static void m163819m(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        f348951E = context;
    }

    /* renamed from: a */
    public C116328u0 mo177788a() {
        C116340x0 x0Var;
        synchronized (this.f348962f) {
            x0Var = this.f348963g;
        }
        return x0Var;
    }

    /* renamed from: b */
    public C116283b mo177789b() {
        return new C116283b(false);
    }

    /* renamed from: c */
    public void mo177790c(long j, long j2, boolean z) {
        long j3 = this.f348975v;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i >= 0 && j3 < 0) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
            this.f348960d.registerReceiver(this.f348972s, intentFilter);
            C116285e eVar = this.f348972s;
            Context context = this.f348960d;
            eVar.getClass();
            eVar.f348986b = ((PowerManager) context.getSystemService("power")).isScreenOn();
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                int intExtra = registerReceiver.getIntExtra("status", -1);
                eVar.f348985a = intExtra == 2 || intExtra == 5;
            }
            eVar.mo177808a();
        } else if (i < 0 && j3 >= 0) {
            this.f348960d.unregisterReceiver(this.f348972s);
            this.f348973t.removeMessages(2);
        }
        this.f348975v = j;
        this.f348976w = j2;
        this.f348977x = z;
    }

    /* renamed from: d */
    public Map<String, Object> mo177791d() {
        return ((C116340x0) mo177788a()).mo177846a();
    }

    /* renamed from: e */
    public Uri mo177792e(Uri uri) {
        C116340x0 x0Var;
        synchronized (this.f348962f) {
            x0Var = this.f348963g;
        }
        SchemeResolver.C116250a f = x0Var.mo177851f(uri.getScheme());
        if (f == null) {
            return null;
        }
        return f.mo177659c(x0Var, uri);
    }

    /* renamed from: g */
    public final Bundle mo177793g() {
        File file = new File(this.f348970q, "fs.bin");
        long length = file.length();
        if (length > 8388608 || length <= 8) {
            throw new IOException("Invalid parcel file size: " + length);
        }
        DataInputStream dataInputStream = null;
        Parcel obtain = Parcel.obtain();
        try {
            DataInputStream dataInputStream2 = new DataInputStream(new FileInputStream(file));
            try {
                int readInt = dataInputStream2.readInt();
                if (readInt == 5) {
                    int readInt2 = dataInputStream2.readInt();
                    if (readInt2 == this.f348961e) {
                        int i = ((int) length) - 8;
                        byte[] bArr = new byte[i];
                        int i2 = 0;
                        while (i2 < i) {
                            i2 += dataInputStream2.read(bArr, i2, i - i2);
                        }
                        obtain.unmarshall(bArr, 0, i2);
                        obtain.setDataPosition(0);
                        Bundle readBundle = obtain.readBundle(FileSystem.class.getClassLoader());
                        C116299g2.m163847c(dataInputStream2);
                        obtain.recycle();
                        return readBundle;
                    }
                    throw new C116299g2.C57869d(C116281f0.class, readInt2, this.f348961e);
                }
                throw new C116299g2.C57869d(C116281f0.class, readInt, 5);
            } catch (Throwable th) {
                th = th;
                dataInputStream = dataInputStream2;
                C116299g2.m163847c(dataInputStream);
                obtain.recycle();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            C116299g2.m163847c(dataInputStream);
            obtain.recycle();
            throw th;
        }
    }

    /* renamed from: h */
    public void mo177794h(CancellationSignal cancellationSignal) {
        C116340x0 x0Var;
        boolean z;
        boolean z2;
        C116286f fVar;
        boolean z3;
        synchronized (this.f348962f) {
            x0Var = this.f348963g;
        }
        AtomicReference<C116287g> atomicReference = this.f348979z;
        C116287g gVar = new C116287g();
        while (true) {
            z = true;
            if (!atomicReference.compareAndSet((Object) null, gVar)) {
                if (atomicReference.get() != null) {
                    z2 = false;
                    break;
                }
            } else {
                z2 = true;
                break;
            }
        }
        if (z2) {
            fVar = this.f348978y;
            if (fVar != null) {
                try {
                    fVar.mo177783b(cancellationSignal);
                    cancellationSignal.throwIfCanceled();
                } catch (RuntimeException e) {
                    if (e instanceof OperationCanceledException) {
                        Log.m106505i("VFS.FileSystemManager", "Maintenance cancelled.");
                        z3 = true;
                    } else {
                        Log.m106499e("VFS.FileSystemManager", (Throwable) e, "Maintenance failed.");
                        z3 = false;
                    }
                    throw e;
                } catch (Throwable th) {
                    th = th;
                }
            }
            for (String str : ((LinkedHashMap) x0Var.f349123a.f349105a).keySet()) {
                SchemeResolver.C116250a f = x0Var.mo177851f(str);
                Log.m106505i("VFS.FileSystemManager", "[Maintenance] " + str + " => " + f);
                cancellationSignal.throwIfCanceled();
                f.mo177749a(cancellationSignal);
            }
            for (String str2 : ((LinkedHashMap) x0Var.f349123a.f349106b).keySet()) {
                FileSystem.C85995c b = x0Var.mo177847b(str2);
                Log.m106505i("VFS.FileSystemManager", "[Maintenance] " + str2 + " => " + b);
                cancellationSignal.throwIfCanceled();
                if (fVar == null || fVar.mo177782a(str2, b, cancellationSignal)) {
                    b.mo119928a(cancellationSignal);
                }
            }
            for (String str3 : ((LinkedHashMap) x0Var.f349123a.f349107c).keySet()) {
                FileSystem.C85995c d = x0Var.mo177849d(str3);
                Log.m106505i("VFS.FileSystemManager", "[Maintenance] " + str3 + " => " + d);
                cancellationSignal.throwIfCanceled();
                if (fVar == null || fVar.mo177782a(str3, d, cancellationSignal)) {
                    d.mo119928a(cancellationSignal);
                }
            }
            C116299g2.m163864t("maintain");
            Log.m106505i("VFS.FileSystemManager", "Maintenance finished.");
            if (fVar != null) {
                try {
                    fVar.mo177784c(false, false, cancellationSignal);
                } catch (RuntimeException e2) {
                    if (!(e2 instanceof OperationCanceledException)) {
                        Log.m106499e("VFS.FileSystemManager", (Throwable) e2, "Maintenance end callback failed.");
                    }
                }
            }
            this.f348979z.set((Object) null);
            return;
        }
        Log.m106513w("VFS.FileSystemManager", "Another thread is running maintenance, skipped");
        throw new OperationCanceledException();
        if (fVar != null) {
            if (z3) {
                z = false;
            }
            try {
                fVar.mo177784c(z3, z, cancellationSignal);
            } catch (RuntimeException e3) {
                if (!(e3 instanceof OperationCanceledException)) {
                    Log.m106499e("VFS.FileSystemManager", (Throwable) e3, "Maintenance end callback failed.");
                }
            }
        }
        this.f348979z.set((Object) null);
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0122, code lost:
        if (r1.isHeld() != false) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0158, code lost:
        if (r1.isHeld() != false) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x015a, code lost:
        r5 = r1;
        j20.C117292a.m165357c(r5, "com/tencent/mm/vfs/FileSystemManager", "doMaintenance", "(Landroid/os/CancellationSignal;)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        r1.release();
        j20.C117292a.m165359e(r5, "com/tencent/mm/vfs/FileSystemManager", "doMaintenance", "(Landroid/os/CancellationSignal;)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r14) {
        /*
            r13 = this;
            android.os.Message[] r0 = r13.f348974u
            r1 = 0
            r2 = 3
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0030
            int r5 = r14.what
            if (r5 <= 0) goto L_0x0020
            if (r5 > r2) goto L_0x0020
            int r5 = r5 - r4
            r1 = r0[r5]
            if (r1 == 0) goto L_0x0016
            r1.recycle()
        L_0x0016:
            int r1 = r14.what
            int r1 = r1 - r4
            android.os.Message r14 = android.os.Message.obtain(r14)
            r0[r1] = r14
            goto L_0x002f
        L_0x0020:
            r13.f348974u = r1
            int r14 = r0.length
        L_0x0023:
            if (r3 >= r14) goto L_0x002f
            r1 = r0[r3]
            if (r1 == 0) goto L_0x002c
            r1.sendToTarget()
        L_0x002c:
            int r3 = r3 + 1
            goto L_0x0023
        L_0x002f:
            return r4
        L_0x0030:
            int r0 = r14.what
            r5 = 4
            if (r0 == r4) goto L_0x017d
            r6 = 2
            if (r0 == r6) goto L_0x006f
            if (r0 == r2) goto L_0x003b
            return r3
        L_0x003b:
            java.util.HashMap<java.lang.String, java.lang.Object> r14 = r13.f348957B
            android.content.Context r0 = r13.f348960d
            java.util.HashMap r0 = m163818f(r0)
            boolean r14 = r0.equals(r14)
            if (r14 != 0) goto L_0x006e
            r13.f348957B = r0
            java.lang.Object r14 = r13.f348966j
            monitor-enter(r14)
            com.tencent.mm.vfs.v0 r1 = r13.f348969p     // Catch:{ all -> 0x006b }
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f349109e     // Catch:{ all -> 0x006b }
            com.tencent.p014mm.vfs.C116333v0.m163941c(r1, r0)     // Catch:{ all -> 0x006b }
            r13.mo177798k(r4)     // Catch:{ all -> 0x006b }
            monitor-exit(r14)     // Catch:{ all -> 0x006b }
            java.lang.String r14 = "VFS.FileSystemManager"
            java.lang.String r1 = "Storage envVars from initial layer updated:"
            com.tencent.stubs.logger.Log.m106505i(r14, r1)
            com.tencent.stubs.logger.LogPrinter r14 = new com.tencent.stubs.logger.LogPrinter
            java.lang.String r1 = "VFS.FileSystemManager"
            r14.<init>(r5, r1)
            com.tencent.p014mm.vfs.C116333v0.m163942e(r14, r0)
            goto L_0x006e
        L_0x006b:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x006b }
            throw r0
        L_0x006e:
            return r4
        L_0x006f:
            java.lang.Object r14 = r14.obj
            android.os.CancellationSignal r14 = (android.os.CancellationSignal) r14
            long r7 = r13.f348976w
            java.lang.String r0 = "maintain"
            long r9 = com.tencent.p014mm.vfs.C116299g2.m163863s(r0)
            java.lang.String r0 = "VFS.FileSystemManager"
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x0096
            java.lang.Object[] r14 = new java.lang.Object[r6]
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            r14[r3] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            r14[r4] = r1
            java.lang.String r1 = "Maintenance interval not match, skip maintenance. %d / %d"
            com.tencent.stubs.logger.Log.m106506i((java.lang.String) r0, (java.lang.String) r1, (java.lang.Object[]) r14)
            goto L_0x017c
        L_0x0096:
            boolean r2 = r13.f348977x
            if (r2 == 0) goto L_0x00a7
            android.content.Context r2 = r13.f348960d
            java.lang.String r5 = "android.permission.WAKE_LOCK"
            int r2 = r2.checkCallingOrSelfPermission(r5)
            if (r2 != 0) goto L_0x00a6
            r2 = 1
            goto L_0x00a7
        L_0x00a6:
            r2 = 0
        L_0x00a7:
            if (r2 == 0) goto L_0x00b9
            android.content.Context r1 = r13.f348960d
            java.lang.String r5 = "power"
            java.lang.Object r1 = r1.getSystemService(r5)
            android.os.PowerManager r1 = (android.os.PowerManager) r1
            java.lang.String r5 = "VFS:Maintenance"
            android.os.PowerManager$WakeLock r1 = r1.newWakeLock(r4, r5)
        L_0x00b9:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0151, all -> 0x0125 }
            r5.<init>()     // Catch:{ Exception -> 0x0151, all -> 0x0125 }
            java.lang.String r6 = "Maintenance started. WakeLock: "
            r5.append(r6)     // Catch:{ Exception -> 0x0151, all -> 0x0125 }
            r5.append(r2)     // Catch:{ Exception -> 0x0151, all -> 0x0125 }
            java.lang.String r2 = r5.toString()     // Catch:{ Exception -> 0x0151, all -> 0x0125 }
            com.tencent.stubs.logger.Log.m106505i(r0, r2)     // Catch:{ Exception -> 0x0151, all -> 0x0125 }
            if (r1 == 0) goto L_0x0119
            r5 = 1200000(0x124f80, double:5.92879E-318)
            k20.a r0 = new k20.a     // Catch:{ Exception -> 0x0151, all -> 0x0125 }
            r0.<init>()     // Catch:{ Exception -> 0x0151, all -> 0x0125 }
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a     // Catch:{ Exception -> 0x0151, all -> 0x0125 }
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x0151, all -> 0x0125 }
            r0.mo10233c(r2)     // Catch:{ Exception -> 0x0151, all -> 0x0125 }
            java.lang.Object[] r6 = r0.mo10232b()     // Catch:{ Exception -> 0x0151, all -> 0x0125 }
            java.lang.String r7 = "com/tencent/mm/vfs/FileSystemManager"
            java.lang.String r8 = "doMaintenance"
            java.lang.String r9 = "(Landroid/os/CancellationSignal;)V"
            java.lang.String r10 = "android/os/PowerManager$WakeLock_EXEC_"
            java.lang.String r11 = "acquire"
            java.lang.String r12 = "(J)V"
            r5 = r1
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0151, all -> 0x0125 }
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a     // Catch:{ Exception -> 0x0151, all -> 0x0125 }
            r2.set(r0)     // Catch:{ Exception -> 0x0151, all -> 0x0125 }
            java.lang.Object r0 = r0.mo10231a(r3)     // Catch:{ Exception -> 0x0151, all -> 0x0125 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x0151, all -> 0x0125 }
            long r2 = r0.longValue()     // Catch:{ Exception -> 0x0151, all -> 0x0125 }
            k20.C60958c.m71441a()     // Catch:{ Exception -> 0x0151, all -> 0x0125 }
            r1.acquire(r2)     // Catch:{ Exception -> 0x0151, all -> 0x0125 }
            java.lang.String r6 = "com/tencent/mm/vfs/FileSystemManager"
            java.lang.String r7 = "doMaintenance"
            java.lang.String r8 = "(Landroid/os/CancellationSignal;)V"
            java.lang.String r9 = "android/os/PowerManager$WakeLock_EXEC_"
            java.lang.String r10 = "acquire"
            java.lang.String r11 = "(J)V"
            r5 = r1
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0151, all -> 0x0125 }
        L_0x0119:
            r13.mo177794h(r14)     // Catch:{ Exception -> 0x0151, all -> 0x0125 }
            if (r1 == 0) goto L_0x017c
            boolean r14 = r1.isHeld()
            if (r14 == 0) goto L_0x017c
            goto L_0x015a
        L_0x0125:
            r14 = move-exception
            if (r1 == 0) goto L_0x0150
            boolean r0 = r1.isHeld()
            if (r0 == 0) goto L_0x0150
            java.lang.String r6 = "com/tencent/mm/vfs/FileSystemManager"
            java.lang.String r7 = "doMaintenance"
            java.lang.String r8 = "(Landroid/os/CancellationSignal;)V"
            java.lang.String r9 = "android/os/PowerManager$WakeLock_EXEC_"
            java.lang.String r10 = "release"
            java.lang.String r11 = "()V"
            r5 = r1
            j20.C117292a.m165357c(r5, r6, r7, r8, r9, r10, r11)
            r1.release()
            java.lang.String r6 = "com/tencent/mm/vfs/FileSystemManager"
            java.lang.String r7 = "doMaintenance"
            java.lang.String r8 = "(Landroid/os/CancellationSignal;)V"
            java.lang.String r9 = "android/os/PowerManager$WakeLock_EXEC_"
            java.lang.String r10 = "release"
            java.lang.String r11 = "()V"
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
        L_0x0150:
            throw r14
        L_0x0151:
            if (r1 == 0) goto L_0x017c
            boolean r14 = r1.isHeld()
            if (r14 == 0) goto L_0x017c
        L_0x015a:
            java.lang.String r6 = "com/tencent/mm/vfs/FileSystemManager"
            java.lang.String r7 = "doMaintenance"
            java.lang.String r8 = "(Landroid/os/CancellationSignal;)V"
            java.lang.String r9 = "android/os/PowerManager$WakeLock_EXEC_"
            java.lang.String r10 = "release"
            java.lang.String r11 = "()V"
            r5 = r1
            j20.C117292a.m165357c(r5, r6, r7, r8, r9, r10, r11)
            r1.release()
            java.lang.String r6 = "com/tencent/mm/vfs/FileSystemManager"
            java.lang.String r7 = "doMaintenance"
            java.lang.String r8 = "(Landroid/os/CancellationSignal;)V"
            java.lang.String r9 = "android/os/PowerManager$WakeLock_EXEC_"
            java.lang.String r10 = "release"
            java.lang.String r11 = "()V"
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
        L_0x017c:
            return r4
        L_0x017d:
            java.lang.Object r14 = r14.obj
            android.content.Intent r14 = (android.content.Intent) r14
            java.lang.Class<com.tencent.mm.vfs.FileSystem> r0 = com.tencent.p014mm.vfs.FileSystem.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r14.setExtrasClassLoader(r0)
            java.lang.String r0 = "pid"
            int r0 = r14.getIntExtra(r0, r3)
            int r1 = android.os.Process.myPid()
            if (r0 != r1) goto L_0x019e
            java.lang.String r14 = "VFS.FileSystemManager"
            java.lang.String r0 = "Ignore filesystem change broadcast from the same process."
            com.tencent.stubs.logger.Log.m106509v(r14, r0)
            return r4
        L_0x019e:
            java.lang.String r0 = "fromFile"
            boolean r0 = r14.getBooleanExtra(r0, r3)
            java.lang.String r1 = "VFS.FileSystemManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Refresh file system from broadcast, fromFile: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.tencent.stubs.logger.Log.m106505i(r1, r2)
            if (r0 == 0) goto L_0x01c1
            android.os.Bundle r14 = r13.mo177793g()     // Catch:{ all -> 0x01e9 }
            goto L_0x01c5
        L_0x01c1:
            android.os.Bundle r14 = r14.getExtras()     // Catch:{ all -> 0x01e9 }
        L_0x01c5:
            if (r14 == 0) goto L_0x01f1
            com.tencent.mm.vfs.v0 r14 = com.tencent.p014mm.vfs.C116333v0.m163940b(r14)     // Catch:{ all -> 0x01e9 }
            java.lang.Object r0 = r13.f348966j     // Catch:{ all -> 0x01e9 }
            monitor-enter(r0)     // Catch:{ all -> 0x01e9 }
            r13.f348968o = r14     // Catch:{ all -> 0x01e6 }
            r13.mo177798k(r4)     // Catch:{ all -> 0x01e6 }
            monitor-exit(r0)     // Catch:{ all -> 0x01e6 }
            java.lang.String r0 = "VFS.FileSystemManager"
            java.lang.String r1 = "Loaded public layer from bundle:"
            com.tencent.stubs.logger.Log.m106505i(r0, r1)     // Catch:{ all -> 0x01e9 }
            com.tencent.stubs.logger.LogPrinter r0 = new com.tencent.stubs.logger.LogPrinter     // Catch:{ all -> 0x01e9 }
            java.lang.String r1 = "VFS.FileSystemManager"
            r0.<init>(r5, r1)     // Catch:{ all -> 0x01e9 }
            r14.mo177828d(r0)     // Catch:{ all -> 0x01e9 }
            goto L_0x01f1
        L_0x01e6:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01e6 }
            throw r14     // Catch:{ all -> 0x01e9 }
        L_0x01e9:
            r14 = move-exception
            java.lang.String r0 = "VFS.FileSystemManager"
            java.lang.String r1 = "Failed to refresh file system from broadcast."
            com.tencent.stubs.logger.Log.m106499e((java.lang.String) r0, (java.lang.Throwable) r14, (java.lang.String) r1)
        L_0x01f1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.C116281f0.handleMessage(android.os.Message):boolean");
    }

    /* renamed from: i */
    public long mo177796i() {
        C116287g gVar = this.f348979z.get();
        if (gVar == null || gVar.f348989a != Process.myTid()) {
            return Long.MIN_VALUE;
        }
        return gVar.f348990b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x009b  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo177797j(android.os.Bundle r8) {
        /*
            r7 = this;
            java.lang.String r0 = "VFS.FileSystemManager"
            android.os.Parcel r1 = android.os.Parcel.obtain()
            r1.writeBundle(r8)
            byte[] r2 = r1.marshall()
            r1.recycle()
            java.io.File r1 = new java.io.File
            java.io.File r3 = r7.f348970q
            java.lang.String r4 = "fs.bin.tmp"
            r1.<init>(r3, r4)
            java.io.File r3 = new java.io.File
            java.io.File r4 = r7.f348970q
            java.lang.String r5 = "fs.bin"
            r3.<init>(r4, r5)
            r4 = 0
            java.io.DataOutputStream r5 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x0055 }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0055 }
            r6.<init>(r1)     // Catch:{ IOException -> 0x0055 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x0055 }
            r4 = 5
            r5.writeInt(r4)     // Catch:{ IOException -> 0x004f, all -> 0x004b }
            int r4 = r7.f348961e     // Catch:{ IOException -> 0x004f, all -> 0x004b }
            r5.writeInt(r4)     // Catch:{ IOException -> 0x004f, all -> 0x004b }
            r5.write(r2)     // Catch:{ IOException -> 0x004f, all -> 0x004b }
            r5.close()     // Catch:{ IOException -> 0x004f, all -> 0x004b }
            java.lang.String r4 = r1.getPath()     // Catch:{ IOException -> 0x004f, all -> 0x004b }
            java.lang.String r3 = r3.getPath()     // Catch:{ IOException -> 0x004f, all -> 0x004b }
            com.tencent.p014mm.vfs.NativeFileSystem.C85997b.m106363a(r4, r3)     // Catch:{ IOException -> 0x004f, all -> 0x004b }
            com.tencent.p014mm.vfs.C116299g2.m163847c(r5)
            goto L_0x0074
        L_0x004b:
            r8 = move-exception
            r4 = r5
            goto L_0x00d0
        L_0x004f:
            r3 = move-exception
            r4 = r5
            goto L_0x0056
        L_0x0052:
            r8 = move-exception
            goto L_0x00d0
        L_0x0055:
            r3 = move-exception
        L_0x0056:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0052 }
            r5.<init>()     // Catch:{ all -> 0x0052 }
            java.lang.String r6 = "Cannot write parcel file: "
            r5.append(r6)     // Catch:{ all -> 0x0052 }
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x0052 }
            r5.append(r3)     // Catch:{ all -> 0x0052 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x0052 }
            com.tencent.stubs.logger.Log.m106497e(r0, r3)     // Catch:{ all -> 0x0052 }
            r1.delete()     // Catch:{ all -> 0x0052 }
            com.tencent.p014mm.vfs.C116299g2.m163847c(r4)
        L_0x0074:
            android.content.Context r1 = r7.f348960d
            java.lang.String r1 = r1.getPackageName()
            android.content.Intent r3 = new android.content.Intent
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = ".REFRESH_VFS"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r3.<init>(r1)
            int r1 = r2.length
            r4 = 131072(0x20000, float:1.83671E-40)
            java.lang.String r5 = "fromFile"
            if (r1 >= r4) goto L_0x009b
            r3.putExtras(r8)
            goto L_0x009f
        L_0x009b:
            r8 = 1
            r3.putExtra(r5, r8)
        L_0x009f:
            int r8 = android.os.Process.myPid()
            java.lang.String r1 = "pid"
            r3.putExtra(r1, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "Bundle published - size: "
            r8.append(r1)
            int r1 = r2.length
            r8.append(r1)
            java.lang.String r1 = ", fromFile: "
            r8.append(r1)
            r1 = 0
            boolean r1 = r3.getBooleanExtra(r5, r1)
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            com.tencent.stubs.logger.Log.m106505i(r0, r8)
            android.content.Context r8 = r7.f348960d
            r8.sendBroadcast(r3)
            return
        L_0x00d0:
            com.tencent.p014mm.vfs.C116299g2.m163847c(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.C116281f0.mo177797j(android.os.Bundle):void");
    }

    /* renamed from: k */
    public final void mo177798k(boolean z) {
        if (z) {
            this.f348969p = this.f348969p.mo177830f();
            this.f348968o = this.f348968o.mo177830f();
            this.f348967n = this.f348967n.mo177830f();
        }
        C116333v0 v0Var = new C116333v0(this.f348969p);
        v0Var.mo177827a(this.f348968o);
        v0Var.mo177827a(this.f348967n);
        C116340x0 x0Var = new C116340x0(v0Var);
        synchronized (this.f348962f) {
            this.f348963g = x0Var;
            int i = this.f348964h + 1;
            this.f348964h = i;
            this.f348965i = new C116288h((FileSystem.C85995c) null, (String) null, i, (C116278e0) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        r0 = r5.mo177851f(r4.getScheme());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r0 != null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        r4 = r0.mo177604b(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        if (r4 != null) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        return new com.tencent.p014mm.vfs.C116281f0.C116288h((com.tencent.p014mm.vfs.FileSystem.C85995c) r4.first, (java.lang.String) r4.second, r1, (com.tencent.p014mm.vfs.C116278e0) null);
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.vfs.C116281f0.C116288h mo177799l(android.net.Uri r4, com.tencent.p014mm.vfs.C116281f0.C116288h r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f348962f
            monitor-enter(r0)
            if (r5 == 0) goto L_0x000d
            int r1 = r5.f348993c     // Catch:{ all -> 0x0035 }
            int r2 = r3.f348964h     // Catch:{ all -> 0x0035 }
            if (r1 != r2) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r5
        L_0x000d:
            com.tencent.mm.vfs.x0 r5 = r3.f348963g     // Catch:{ all -> 0x0035 }
            int r1 = r3.f348964h     // Catch:{ all -> 0x0035 }
            com.tencent.mm.vfs.f0$h r2 = r3.f348965i     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            java.lang.String r0 = r4.getScheme()
            com.tencent.mm.vfs.SchemeResolver$a r0 = r5.mo177851f(r0)
            if (r0 != 0) goto L_0x001f
            return r2
        L_0x001f:
            android.util.Pair r4 = r0.mo177604b(r5, r4)
            if (r4 != 0) goto L_0x0026
            return r2
        L_0x0026:
            com.tencent.mm.vfs.f0$h r5 = new com.tencent.mm.vfs.f0$h
            java.lang.Object r0 = r4.first
            com.tencent.mm.vfs.FileSystem$c r0 = (com.tencent.p014mm.vfs.FileSystem.C85995c) r0
            java.lang.Object r4 = r4.second
            java.lang.String r4 = (java.lang.String) r4
            r2 = 0
            r5.<init>(r0, r4, r1, r2)
            return r5
        L_0x0035:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.C116281f0.mo177799l(android.net.Uri, com.tencent.mm.vfs.f0$h):com.tencent.mm.vfs.f0$h");
    }
}
