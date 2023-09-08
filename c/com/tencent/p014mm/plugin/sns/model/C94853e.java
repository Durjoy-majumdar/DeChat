package com.tencent.p014mm.plugin.sns.model;

import a70.C112760b;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.Vibrator;
import android.text.TextUtils;
import android.util.SparseArray;
import com.tencent.p014mm.memory.C92714n;
import com.tencent.p014mm.modelstat.C29048w;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C94921o2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C96983o3;
import com.tencent.xweb.XWebFeature;
import com.tencent.xweb.file.XVFSFile;
import eb0.C31519v2;
import eb0.C31536y2;
import es2.C97696c;
import f40.C86709a0;
import gy3.C87412m;
import hd0.C98398h0;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import ks2.C99181f;
import ks2.C99191k;
import lc3.C10485b;
import lo2.C99556n;
import o40.C61926c;
import p1081gi.C98127h;
import p156gj.C87203t;
import p261wl.C15510f;
import p261wl.C38166b;
import te3.C101804kv2;
import vr2.C102236a0;
import vr2.C102247i;
import vr2.C102268v;
import vr2.C102269w;
import vr2.C37817q;
import vr2.C37819x;
import xb0.C102609h;

/* renamed from: com.tencent.mm.plugin.sns.model.e */
public class C94853e implements C97696c.C97699b {

    /* renamed from: a */
    public MMHandler f274814a = null;

    /* renamed from: b */
    public long f274815b = 0;

    /* renamed from: c */
    public int f274816c = 0;

    /* renamed from: d */
    public int f274817d = 2;

    /* renamed from: e */
    public LinkedList<C37819x> f274818e = new LinkedList<>();

    /* renamed from: f */
    public HashMap<String, Long> f274819f = new HashMap<>();

    /* renamed from: g */
    public final byte[] f274820g = new byte[0];

    /* renamed from: h */
    public HashMap<String, String> f274821h = new HashMap<>();

    /* renamed from: i */
    public boolean f274822i = true;

    /* renamed from: j */
    public final Set<C94861h> f274823j;

    /* renamed from: k */
    public Set<C94860g> f274824k;

    /* renamed from: l */
    public LinkedList<C102269w> f274825l;

    /* renamed from: m */
    public HashMap<String, Long> f274826m;

    /* renamed from: n */
    public Map<String, Long> f274827n;

    /* renamed from: o */
    public Map<String, C102247i> f274828o;

    /* renamed from: p */
    public ConcurrentHashMap<String, AtomicInteger> f274829p;

    /* renamed from: q */
    public ConcurrentHashMap<String, String> f274830q;

    /* renamed from: r */
    public ConcurrentHashMap<String, C94863j> f274831r;

    /* renamed from: s */
    public CopyOnWriteArrayList<String> f274832s;

    /* renamed from: com.tencent.mm.plugin.sns.model.e$a */
    public class C94854a implements C94861h {
        public C94854a(C94853e eVar) {
        }

        public void onImageFinish(String str, boolean z) {
            SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.model.DownloadManager$1");
            C38166b.m41755b(C94862i.class, new e$a$$b(str, z));
            SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.model.DownloadManager$1");
        }

        public void onSetbg() {
            SnsMethodCalculate.markStartTimeMs("onSetbg", "com.tencent.mm.plugin.sns.model.DownloadManager$1");
            C38166b.m41755b(C94862i.class, new e$a$$c());
            SnsMethodCalculate.markEndTimeMs("onSetbg", "com.tencent.mm.plugin.sns.model.DownloadManager$1");
        }

        public void onSightFinish(String str, boolean z) {
            SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.model.DownloadManager$1");
            C38166b.m41755b(C94862i.class, new e$a$$a(str, z));
            SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.model.DownloadManager$1");
        }

        public void onThumbFinish(String str) {
            SnsMethodCalculate.markStartTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.model.DownloadManager$1");
            C38166b.m41755b(C94862i.class, new e$a$$d(str));
            SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.model.DownloadManager$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.e$b */
    public class C94855b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C94861h f274833d;

        public C94855b(C94861h hVar) {
            this.f274833d = hVar;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.DownloadManager$2");
            C94853e eVar = C94853e.this;
            C94861h hVar = this.f274833d;
            eVar.getClass();
            SnsMethodCalculate.markStartTimeMs("addDownLoadEndListenerImpl", "com.tencent.mm.plugin.sns.model.DownloadManager");
            ((CopyOnWriteArraySet) eVar.f274823j).add(hVar);
            SnsMethodCalculate.markEndTimeMs("addDownLoadEndListenerImpl", "com.tencent.mm.plugin.sns.model.DownloadManager");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.DownloadManager$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.e$c */
    public class C94856c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C94861h f274835d;

        public C94856c(C94861h hVar) {
            this.f274835d = hVar;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.DownloadManager$3");
            C94853e eVar = C94853e.this;
            C94861h hVar = this.f274835d;
            eVar.getClass();
            SnsMethodCalculate.markStartTimeMs("removeDownLoadEndListenerImpl", "com.tencent.mm.plugin.sns.model.DownloadManager");
            ((CopyOnWriteArraySet) eVar.f274823j).remove(hVar);
            SnsMethodCalculate.markEndTimeMs("removeDownLoadEndListenerImpl", "com.tencent.mm.plugin.sns.model.DownloadManager");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.DownloadManager$3");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.e$d */
    public class C94857d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f274837d;

        /* renamed from: e */
        public final /* synthetic */ String f274838e;

        public C94857d(String str, String str2) {
            this.f274837d = str;
            this.f274838e = str2;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.DownloadManager$4");
            C94853e eVar = C94853e.this;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.model.DownloadManager");
            Set<C94860g> set = eVar.f274824k;
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.model.DownloadManager");
            if (set != null) {
                C94853e eVar2 = C94853e.this;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.model.DownloadManager");
                Set<C94860g> set2 = eVar2.f274824k;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.model.DownloadManager");
                Iterator it = ((HashSet) set2).iterator();
                while (it.hasNext()) {
                    C94860g gVar = (C94860g) it.next();
                    if (gVar != null) {
                        gVar.mo131007n7(this.f274837d, this.f274838e);
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.DownloadManager$4");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.e$e */
    public class C94858e implements Runnable {
        public C94858e() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.DownloadManager$5");
            C94853e.m120226a(C94853e.this);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.DownloadManager$5");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.e$f */
    public class C94859f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f274841d;

        public C94859f(String str) {
            this.f274841d = str;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.DownloadManager$6");
            C94853e eVar = C94853e.this;
            String str = this.f274841d;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.model.DownloadManager");
            eVar.getClass();
            SnsMethodCalculate.markStartTimeMs("onDownLoadFinish", "com.tencent.mm.plugin.sns.model.DownloadManager");
            Log.m105925i("MicroMsg.DownloadManager", "onDownLoadFinish by scene %s", str);
            C94843b1 Rx0 = C94866e1.Rx0();
            synchronized (Rx0) {
                SnsMethodCalculate.markStartTimeMs("removeDownLoadingS", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                ((HashMap) Rx0.f274778e).remove(str);
                SnsMethodCalculate.markEndTimeMs("removeDownLoadingS", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            }
            eVar.mo130994s(str, true);
            eVar.mo130974A();
            SnsMethodCalculate.markEndTimeMs("onDownLoadFinish", "com.tencent.mm.plugin.sns.model.DownloadManager");
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.model.DownloadManager");
            C94853e eVar2 = C94853e.this;
            String str2 = this.f274841d;
            eVar2.getClass();
            SnsMethodCalculate.markStartTimeMs("unLockDownLoad", "com.tencent.mm.plugin.sns.model.DownloadManager");
            eVar2.mo130976C(str2, -1, true);
            SnsMethodCalculate.markEndTimeMs("unLockDownLoad", "com.tencent.mm.plugin.sns.model.DownloadManager");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.DownloadManager$6");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.e$g */
    public interface C94860g {
        /* renamed from: n7 */
        void mo131007n7(String str, String str2);
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.e$h */
    public interface C94861h {
        void onImageFinish(String str, boolean z);

        void onSetbg();

        void onSightFinish(String str, boolean z);

        void onThumbFinish(String str);
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.e$i */
    public interface C94862i extends C15510f {
        void onImageFinish(String str, boolean z);

        void onSetbg();

        void onSightFinish(String str, boolean z);

        void onThumbFinish(String str);
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.e$j */
    public static class C94863j {

        /* renamed from: a */
        public final String f274843a;

        /* renamed from: b */
        public int f274844b;

        /* renamed from: c */
        public long f274845c;

        /* renamed from: d */
        public boolean f274846d;

        /* renamed from: e */
        public boolean f274847e;

        /* renamed from: f */
        public final byte[] f274848f = new byte[0];

        public C94863j(String str, int i) {
            this.f274843a = str;
            this.f274844b = i;
            this.f274845c = -1;
            this.f274846d = false;
            this.f274847e = false;
            Log.m105919d("MicroMsg.DownloadManager", "new reporter, snsId id: %s, picNum: %d, this: %s.", str, Integer.valueOf(i), this);
        }

        /* renamed from: a */
        public void mo131012a() {
            SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.model.DownloadManager$SingleImgDownloadByFeedReporter");
            if (this.f274847e) {
                long milliSecondsToNow = Util.milliSecondsToNow(this.f274845c);
                Log.m105919d("MicroMsg.DownloadManager", "single download, feed id: %s, startTime: %d, cost: %d, this: %s.", this.f274843a, Long.valueOf(this.f274845c), Long.valueOf(milliSecondsToNow), this);
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo175913w(1040, 0, milliSecondsToNow);
                nVar.mo175911u(XWebFeature.INTERFACE_SHOW_HIDE, 1);
            }
            SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.model.DownloadManager$SingleImgDownloadByFeedReporter");
        }

        /* renamed from: b */
        public void mo131013b(long j) {
            String str;
            String str2;
            SnsMethodCalculate.markStartTimeMs("setStartTime", "com.tencent.mm.plugin.sns.model.DownloadManager$SingleImgDownloadByFeedReporter");
            if (!this.f274846d) {
                synchronized (this.f274848f) {
                    try {
                        if (!this.f274846d) {
                            this.f274846d = true;
                            this.f274845c = j;
                            Log.m105919d("MicroMsg.DownloadManager", "set start time, snsId id: %s, time: %d, this: %s.", this.f274843a, Long.valueOf(j), this);
                        }
                    } finally {
                        str = "setStartTime";
                        str2 = "com.tencent.mm.plugin.sns.model.DownloadManager$SingleImgDownloadByFeedReporter";
                        SnsMethodCalculate.markEndTimeMs(str, str2);
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.e$k */
    public class C94864k implements MessageQueue.IdleHandler {
        public C94864k() {
        }

        public boolean queueIdle() {
            SnsMethodCalculate.markStartTimeMs("queueIdle", "com.tencent.mm.plugin.sns.model.DownloadManager$mmIdleHandler");
            Log.m105918d("MicroMsg.DownloadManager", "I run idleHandler ");
            C94853e eVar = C94853e.this;
            long nowSecond = Util.nowSecond();
            SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.model.DownloadManager");
            eVar.f274815b = nowSecond;
            SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.model.DownloadManager");
            boolean a = C94853e.m120226a(C94853e.this);
            SnsMethodCalculate.markEndTimeMs("queueIdle", "com.tencent.mm.plugin.sns.model.DownloadManager$mmIdleHandler");
            return a;
        }
    }

    public C94853e() {
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.f274823j = copyOnWriteArraySet;
        copyOnWriteArraySet.add(new C94854a(this));
        this.f274824k = new HashSet();
        this.f274825l = new LinkedList<>();
        this.f274826m = new HashMap<>();
        this.f274827n = new ConcurrentHashMap();
        this.f274828o = new HashMap();
        this.f274829p = new ConcurrentHashMap<>();
        this.f274830q = new ConcurrentHashMap<>();
        this.f274831r = new ConcurrentHashMap<>();
        this.f274832s = new CopyOnWriteArrayList<>();
        this.f274814a = C94866e1.ly0();
        mo130989n();
    }

    /* renamed from: a */
    public static boolean m120226a(C94853e eVar) {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.model.DownloadManager");
        eVar.getClass();
        SnsMethodCalculate.markStartTimeMs("pullFile", "com.tencent.mm.plugin.sns.model.DownloadManager");
        synchronized (eVar.f274820g) {
            try {
                LinkedList<C37819x> linkedList = eVar.f274818e;
                z = false;
                if (linkedList == null || linkedList.size() <= 0) {
                    SnsMethodCalculate.markEndTimeMs("pullFile", "com.tencent.mm.plugin.sns.model.DownloadManager");
                } else {
                    new C94883i2().mo119143f(eVar.f274818e.remove());
                    SnsMethodCalculate.markEndTimeMs("pullFile", "com.tencent.mm.plugin.sns.model.DownloadManager");
                    z = true;
                }
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("pullFile", "com.tencent.mm.plugin.sns.model.DownloadManager");
                    throw th;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.model.DownloadManager");
        return z;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: A */
    public void mo130974A() {
        /*
            r30 = this;
            r1 = r30
            java.lang.String r0 = "tryStartNetscene"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.DownloadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r2)
            java.lang.String r0 = "MicroMsg.DownloadManager"
            java.lang.String r2 = "[%s]do tryStartNetscene"
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = "[image-flow]"
            r6 = 0
            r4[r6] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r4)
            boolean r0 = r1.f274822i
            if (r0 != 0) goto L_0x0033
            java.lang.String r0 = "MicroMsg.DownloadManager"
            java.lang.String r2 = "[%s]tryStartNetscene isnot runing now"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "[image-flow]"
            r3[r6] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r2, r3)
            java.lang.String r0 = "tryStartNetscene"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.DownloadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            return
        L_0x0033:
            boolean r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.qy0()
            if (r0 == 0) goto L_0x0052
            r30.mo130989n()
            java.lang.String r0 = "MicroMsg.DownloadManager"
            java.lang.String r2 = "[%s]tryStartNetscene SnsCore not valid"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "[image-flow]"
            r3[r6] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r2, r3)
            java.lang.String r0 = "tryStartNetscene"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.DownloadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            return
        L_0x0052:
            java.lang.String r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.xx0()
            boolean r0 = vr2.C102236a0.m134751j0(r0)
            if (r0 != 0) goto L_0x0072
            java.lang.String r0 = "MicroMsg.DownloadManager"
            java.lang.String r2 = "[%s]tryStartNetscene not has sdcard"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "[image-flow]"
            r3[r6] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r2, r3)
            java.lang.String r0 = "tryStartNetscene"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.DownloadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            return
        L_0x0072:
            int r0 = r1.f274817d
            int r2 = sf0.C90188n0.f258937e
            if (r2 <= 0) goto L_0x0079
            r0 = r2
        L_0x0079:
            java.lang.String r2 = "MicroMsg.DownloadManager"
            java.lang.String r4 = "[%s]tryStartNetscene max downloadSize:%s"
            r5 = 2
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.String r8 = "[image-flow]"
            r7[r6] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r7[r3] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r7)
            byte[] r2 = r1.f274820g
            monitor-enter(r2)
            java.util.LinkedList<vr2.w> r4 = r1.f274825l     // Catch:{ all -> 0x062d }
            int r4 = r4.size()     // Catch:{ all -> 0x062d }
            r7 = 4
            r8 = 5
            r9 = 3
            if (r4 <= 0) goto L_0x065a
            com.tencent.mm.plugin.sns.model.b1 r4 = com.tencent.p014mm.plugin.sns.model.C94866e1.Rx0()     // Catch:{ all -> 0x062d }
            int r4 = r4.mo130953k()     // Catch:{ all -> 0x062d }
            java.util.Map<java.lang.String, java.lang.Long> r10 = r1.f274827n     // Catch:{ all -> 0x062d }
            java.util.concurrent.ConcurrentHashMap r10 = (java.util.concurrent.ConcurrentHashMap) r10     // Catch:{ all -> 0x062d }
            int r10 = r10.size()     // Catch:{ all -> 0x062d }
            int r4 = r4 + r10
            if (r4 > r0) goto L_0x065a
            java.lang.String r0 = "MicroMsg.DownloadManager"
            java.lang.String r4 = "[%s]tryStartNetscene size %s Tsize : %s listsize %s max_thread_downloading: %s, downLoadingT:%s, lists:%s"
            r10 = 7
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ all -> 0x062d }
            java.lang.String r12 = "[image-flow]"
            r11[r6] = r12     // Catch:{ all -> 0x062d }
            com.tencent.mm.plugin.sns.model.b1 r12 = com.tencent.p014mm.plugin.sns.model.C94866e1.Rx0()     // Catch:{ all -> 0x062d }
            int r12 = r12.mo130953k()     // Catch:{ all -> 0x062d }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x062d }
            r11[r3] = r12     // Catch:{ all -> 0x062d }
            java.util.Map<java.lang.String, java.lang.Long> r12 = r1.f274827n     // Catch:{ all -> 0x062d }
            java.util.concurrent.ConcurrentHashMap r12 = (java.util.concurrent.ConcurrentHashMap) r12     // Catch:{ all -> 0x062d }
            int r12 = r12.size()     // Catch:{ all -> 0x062d }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x062d }
            r11[r5] = r12     // Catch:{ all -> 0x062d }
            java.util.LinkedList<vr2.w> r12 = r1.f274825l     // Catch:{ all -> 0x062d }
            int r12 = r12.size()     // Catch:{ all -> 0x062d }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x062d }
            r11[r9] = r12     // Catch:{ all -> 0x062d }
            int r12 = r1.f274817d     // Catch:{ all -> 0x062d }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x062d }
            r11[r7] = r12     // Catch:{ all -> 0x062d }
            java.lang.String r12 = r30.mo130992q()     // Catch:{ all -> 0x062d }
            r11[r8] = r12     // Catch:{ all -> 0x062d }
            java.lang.String r12 = r30.mo130991p()     // Catch:{ all -> 0x062d }
            r13 = 6
            r11[r13] = r12     // Catch:{ all -> 0x062d }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r4, r11)     // Catch:{ all -> 0x062d }
            java.util.LinkedList<vr2.w> r0 = r1.f274825l     // Catch:{ all -> 0x062d }
            java.lang.Object r0 = r0.removeLast()     // Catch:{ all -> 0x062d }
            vr2.w r0 = (vr2.C102269w) r0     // Catch:{ all -> 0x062d }
            if (r0 != 0) goto L_0x010d
            monitor-exit(r2)     // Catch:{ all -> 0x062d }
            java.lang.String r0 = "tryStartNetscene"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.DownloadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            return
        L_0x010d:
            te3.kv2 r4 = r0.mo141836c()     // Catch:{ all -> 0x062d }
            java.lang.String r11 = "getRequestType"
            java.lang.String r12 = "com.tencent.mm.plugin.sns.data.SnsDownLoadElment"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r12)     // Catch:{ all -> 0x062d }
            int r14 = r0.f301204b     // Catch:{ all -> 0x062d }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)     // Catch:{ all -> 0x062d }
            java.lang.String r11 = "getKey"
            java.lang.String r12 = "com.tencent.mm.plugin.sns.data.SnsDownLoadElment"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r12)     // Catch:{ all -> 0x062d }
            java.lang.String r15 = r0.f301205c     // Catch:{ all -> 0x062d }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)     // Catch:{ all -> 0x062d }
            java.lang.String r11 = "getSpecPath"
            java.lang.String r12 = "com.tencent.mm.plugin.sns.data.SnsDownLoadElment"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r12)     // Catch:{ all -> 0x062d }
            java.lang.String r13 = r0.f301206d     // Catch:{ all -> 0x062d }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)     // Catch:{ all -> 0x062d }
            java.lang.String r11 = "getSpecFileName"
            java.lang.String r12 = "com.tencent.mm.plugin.sns.data.SnsDownLoadElment"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r12)     // Catch:{ all -> 0x062d }
            java.lang.String r10 = r0.f301207e     // Catch:{ all -> 0x062d }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)     // Catch:{ all -> 0x062d }
            java.lang.String r11 = "getSnsId"
            java.lang.String r12 = "com.tencent.mm.plugin.sns.data.SnsDownLoadElment"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r12)     // Catch:{ all -> 0x062d }
            java.lang.String r8 = r0.f301211i     // Catch:{ all -> 0x062d }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)     // Catch:{ all -> 0x062d }
            java.lang.String r11 = "getMediaObjs"
            java.lang.String r12 = "com.tencent.mm.plugin.sns.data.SnsDownLoadElment"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r12)     // Catch:{ all -> 0x062d }
            android.util.SparseArray<te3.kv2> r9 = r0.f301212j     // Catch:{ all -> 0x062d }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)     // Catch:{ all -> 0x062d }
            if (r4 == 0) goto L_0x015e
            java.lang.String r11 = r4.f298689d     // Catch:{ all -> 0x062d }
            goto L_0x0160
        L_0x015e:
            java.lang.String r11 = ""
        L_0x0160:
            java.util.Map<java.lang.String, vr2.i> r12 = r1.f274828o     // Catch:{ all -> 0x062d }
            java.util.HashMap r12 = (java.util.HashMap) r12     // Catch:{ all -> 0x062d }
            boolean r12 = r12.containsKey(r15)     // Catch:{ all -> 0x062d }
            if (r12 == 0) goto L_0x0630
            java.util.Map<java.lang.String, vr2.i> r12 = r1.f274828o     // Catch:{ all -> 0x062d }
            java.util.HashMap r12 = (java.util.HashMap) r12     // Catch:{ all -> 0x062d }
            java.lang.Object r12 = r12.get(r15)     // Catch:{ all -> 0x062d }
            if (r12 != 0) goto L_0x0176
            goto L_0x0630
        L_0x0176:
            java.lang.String r12 = "MicroMsg.DownloadManager"
            java.lang.String r5 = "[%s][media:%s]try start download requestType:%s, requestKey:%s"
            java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch:{ all -> 0x062d }
            java.lang.String r19 = "[image-flow]"
            r3[r6] = r19     // Catch:{ all -> 0x062d }
            r18 = 1
            r3[r18] = r11     // Catch:{ all -> 0x062d }
            java.lang.Integer r19 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x062d }
            r17 = 2
            r3[r17] = r19     // Catch:{ all -> 0x062d }
            r16 = 3
            r3[r16] = r15     // Catch:{ all -> 0x062d }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r5, r3)     // Catch:{ all -> 0x062d }
            java.util.Map<java.lang.String, vr2.i> r3 = r1.f274828o     // Catch:{ all -> 0x062d }
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch:{ all -> 0x062d }
            java.lang.Object r3 = r3.get(r15)     // Catch:{ all -> 0x062d }
            vr2.i r3 = (vr2.C102247i) r3     // Catch:{ all -> 0x062d }
            r3.getClass()     // Catch:{ all -> 0x062d }
            java.lang.String r5 = "getDecodeInfo"
            java.lang.String r12 = "com.tencent.mm.plugin.sns.data.DownloaderLockElment"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r12)     // Catch:{ all -> 0x062d }
            vr2.v r3 = r3.f301129a     // Catch:{ all -> 0x062d }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r12)     // Catch:{ all -> 0x062d }
            java.util.Map<java.lang.String, vr2.i> r5 = r1.f274828o     // Catch:{ all -> 0x062d }
            java.util.HashMap r5 = (java.util.HashMap) r5     // Catch:{ all -> 0x062d }
            java.lang.Object r5 = r5.get(r15)     // Catch:{ all -> 0x062d }
            vr2.i r5 = (vr2.C102247i) r5     // Catch:{ all -> 0x062d }
            r5.getClass()     // Catch:{ all -> 0x062d }
            java.lang.String r12 = "getDecodeElements"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.data.DownloaderLockElment"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r7)     // Catch:{ all -> 0x062d }
            android.util.SparseArray<vr2.v> r5 = r5.f301131c     // Catch:{ all -> 0x062d }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r7)     // Catch:{ all -> 0x062d }
            r12 = 1
            if (r14 != r12) goto L_0x01ce
            boolean r12 = r4.f298681N     // Catch:{ all -> 0x062d }
            if (r12 == 0) goto L_0x01ce
            r14 = 8
        L_0x01ce:
            r12 = 9
            r7 = 1
            if (r14 == r7) goto L_0x0213
            r7 = 5
            if (r14 == r7) goto L_0x0213
            r7 = 7
            if (r14 != r7) goto L_0x01da
            goto L_0x0213
        L_0x01da:
            r7 = 6
            if (r14 != r7) goto L_0x01e2
            java.lang.String r7 = r4.f298706x     // Catch:{ all -> 0x062d }
            int r6 = r4.f298693h     // Catch:{ all -> 0x062d }
            goto L_0x0210
        L_0x01e2:
            if (r14 != r12) goto L_0x020c
            r6 = 0
            java.lang.Object r7 = r9.valueAt(r6)     // Catch:{ all -> 0x062d }
            te3.kv2 r7 = (te3.C101804kv2) r7     // Catch:{ all -> 0x062d }
            java.lang.String r6 = r7.f298694i     // Catch:{ all -> 0x062d }
            int r12 = r7.f298695j     // Catch:{ all -> 0x062d }
            boolean r21 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)     // Catch:{ all -> 0x062d }
            if (r21 == 0) goto L_0x0203
            r21 = r6
            int r6 = r7.f298690e     // Catch:{ all -> 0x062d }
            r22 = r12
            r12 = 2
            if (r6 != r12) goto L_0x0207
            java.lang.String r6 = r7.f298692g     // Catch:{ all -> 0x062d }
            int r12 = r7.f298693h     // Catch:{ all -> 0x062d }
            goto L_0x0235
        L_0x0203:
            r21 = r6
            r22 = r12
        L_0x0207:
            r6 = r21
            r12 = r22
            goto L_0x0235
        L_0x020c:
            java.lang.String r7 = r4.f298692g     // Catch:{ all -> 0x062d }
            int r6 = r4.f298693h     // Catch:{ all -> 0x062d }
        L_0x0210:
            r12 = r7
            r7 = 0
            goto L_0x023e
        L_0x0213:
            java.lang.String r6 = r4.f298694i     // Catch:{ all -> 0x062d }
            r7 = 7
            if (r14 != r7) goto L_0x0222
            java.lang.String r7 = r4.f298669B     // Catch:{ all -> 0x062d }
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)     // Catch:{ all -> 0x062d }
            if (r7 != 0) goto L_0x0222
            java.lang.String r6 = r4.f298669B     // Catch:{ all -> 0x062d }
        L_0x0222:
            int r7 = r4.f298695j     // Catch:{ all -> 0x062d }
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)     // Catch:{ all -> 0x062d }
            if (r12 == 0) goto L_0x0237
            int r12 = r4.f298690e     // Catch:{ all -> 0x062d }
            r21 = r6
            r6 = 2
            if (r12 != r6) goto L_0x0239
            java.lang.String r6 = r4.f298692g     // Catch:{ all -> 0x062d }
            int r12 = r4.f298693h     // Catch:{ all -> 0x062d }
        L_0x0235:
            r7 = r12
            goto L_0x023b
        L_0x0237:
            r21 = r6
        L_0x0239:
            r6 = r21
        L_0x023b:
            r12 = r6
            r6 = r7
            r7 = 1
        L_0x023e:
            boolean r21 = r1.mo130988m(r12)     // Catch:{ all -> 0x062d }
            if (r21 != 0) goto L_0x0258
            java.util.Map<java.lang.String, vr2.i> r0 = r1.f274828o     // Catch:{ all -> 0x062d }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x062d }
            r0.remove(r15)     // Catch:{ all -> 0x062d }
            r1.mo131000y(r15)     // Catch:{ all -> 0x062d }
            monitor-exit(r2)     // Catch:{ all -> 0x062d }
            java.lang.String r0 = "tryStartNetscene"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.DownloadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            return
        L_0x0258:
            r21 = r7
            java.lang.String r7 = "MicroMsg.DownloadManager"
            r22 = r10
            java.lang.String r10 = "[%s][media:%s]select url type:%d"
            r24 = r3
            r23 = r13
            r13 = 3
            java.lang.Object[] r3 = new java.lang.Object[r13]     // Catch:{ all -> 0x062d }
            java.lang.String r13 = "[image-flow]"
            r20 = 0
            r3[r20] = r13     // Catch:{ all -> 0x062d }
            r13 = 1
            r3[r13] = r11     // Catch:{ all -> 0x062d }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x062d }
            r25 = r5
            r5 = 2
            r3[r5] = r13     // Catch:{ all -> 0x062d }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r10, r3)     // Catch:{ all -> 0x062d }
            if (r6 != r5) goto L_0x02dd
            com.tencent.mm.plugin.sns.model.b1 r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.Rx0()     // Catch:{ all -> 0x062d }
            monitor-enter(r3)     // Catch:{ all -> 0x062d }
            java.lang.String r0 = "isDownloading"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r5)     // Catch:{ all -> 0x02da }
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.f274778e     // Catch:{ all -> 0x02da }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x02da }
            boolean r0 = r0.containsKey(r15)     // Catch:{ all -> 0x02da }
            java.lang.String r5 = "isDownloading"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)     // Catch:{ all -> 0x02da }
            monitor-exit(r3)     // Catch:{ all -> 0x062d }
            if (r0 != 0) goto L_0x062b
            java.lang.String r0 = "MicroMsg.DownloadManager"
            java.lang.String r3 = "[%s][media:%s]try start download by NetSceneSnsDownload url:%s"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x062d }
            java.lang.String r6 = "[image-flow]"
            r7 = 0
            r5[r7] = r6     // Catch:{ all -> 0x062d }
            r6 = 1
            r5[r6] = r11     // Catch:{ all -> 0x062d }
            r6 = 2
            r5[r6] = r12     // Catch:{ all -> 0x062d }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r5)     // Catch:{ all -> 0x062d }
            f40.C86709a0.m107528h()     // Catch:{ all -> 0x062d }
            f40.g r0 = f40.C86709a0.m107529k()     // Catch:{ all -> 0x062d }
            ob0.b0 r0 = r0.f251779b     // Catch:{ all -> 0x062d }
            com.tencent.mm.plugin.sns.model.e0 r3 = new com.tencent.mm.plugin.sns.model.e0     // Catch:{ all -> 0x062d }
            java.lang.String r9 = r4.f298689d     // Catch:{ all -> 0x062d }
            int r11 = r4.f298690e     // Catch:{ all -> 0x062d }
            r5 = r21
            r7 = r3
            r8 = r4
            r10 = r12
            r12 = r5
            r13 = r14
            r14 = r15
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x062d }
            r0.mo123460f(r3)     // Catch:{ all -> 0x062d }
            com.tencent.mm.plugin.sns.model.b1 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Rx0()     // Catch:{ all -> 0x062d }
            r3 = 0
            r0.mo130948c(r15, r3)     // Catch:{ all -> 0x062d }
            goto L_0x062b
        L_0x02da:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x062d }
            throw r0     // Catch:{ all -> 0x062d }
        L_0x02dd:
            r5 = r21
            r3 = 1
            if (r6 == r3) goto L_0x02f1
            if (r6 != 0) goto L_0x02e5
            goto L_0x02f1
        L_0x02e5:
            java.util.Map<java.lang.String, vr2.i> r0 = r1.f274828o     // Catch:{ all -> 0x062d }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x062d }
            r0.remove(r15)     // Catch:{ all -> 0x062d }
            r1.mo131000y(r15)     // Catch:{ all -> 0x062d }
            goto L_0x062b
        L_0x02f1:
            if (r6 != 0) goto L_0x031a
            java.lang.String r3 = "MicroMsg.DownloadManager"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x062d }
            r7.<init>()     // Catch:{ all -> 0x062d }
            java.lang.String r10 = "others http: urlType"
            r7.append(r10)     // Catch:{ all -> 0x062d }
            r7.append(r6)     // Catch:{ all -> 0x062d }
            java.lang.String r6 = " -- url : "
            r7.append(r6)     // Catch:{ all -> 0x062d }
            r7.append(r12)     // Catch:{ all -> 0x062d }
            java.lang.String r6 = " isThumb :"
            r7.append(r6)     // Catch:{ all -> 0x062d }
            r7.append(r5)     // Catch:{ all -> 0x062d }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x062d }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r6)     // Catch:{ all -> 0x062d }
        L_0x031a:
            java.util.Map<java.lang.String, java.lang.Long> r3 = r1.f274827n     // Catch:{ all -> 0x062d }
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3     // Catch:{ all -> 0x062d }
            boolean r3 = r3.containsKey(r15)     // Catch:{ all -> 0x062d }
            if (r3 != 0) goto L_0x062b
            r3 = 9
            if (r14 != r3) goto L_0x0336
            java.lang.String r3 = "MicroMsg.DownloadManager"
            java.lang.String r6 = "batch download, snsId: %s."
            r7 = 1
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch:{ all -> 0x062d }
            r7 = 0
            r10[r7] = r8     // Catch:{ all -> 0x062d }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r10)     // Catch:{ all -> 0x062d }
            goto L_0x0357
        L_0x0336:
            java.lang.String r3 = "MicroMsg.DownloadManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x062d }
            r6.<init>()     // Catch:{ all -> 0x062d }
            java.lang.String r7 = "to downLoad cdn "
            r6.append(r7)     // Catch:{ all -> 0x062d }
            java.lang.String r7 = r4.f298689d     // Catch:{ all -> 0x062d }
            r6.append(r7)     // Catch:{ all -> 0x062d }
            java.lang.String r7 = "  "
            r6.append(r7)     // Catch:{ all -> 0x062d }
            r6.append(r12)     // Catch:{ all -> 0x062d }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x062d }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r6)     // Catch:{ all -> 0x062d }
        L_0x0357:
            if (r4 != 0) goto L_0x0361
            if (r9 == 0) goto L_0x03c9
            int r3 = r9.size()     // Catch:{ all -> 0x062d }
            if (r3 <= 0) goto L_0x03c9
        L_0x0361:
            r3 = 6
            if (r14 == r3) goto L_0x03c9
            r3 = 8
            if (r14 == r3) goto L_0x03c9
            java.util.HashMap<java.lang.String, java.lang.Long> r3 = r1.f274819f     // Catch:{ all -> 0x062d }
            boolean r3 = r3.containsKey(r15)     // Catch:{ all -> 0x062d }
            if (r3 == 0) goto L_0x03c9
            java.util.HashMap<java.lang.String, java.lang.Long> r3 = r1.f274819f     // Catch:{ all -> 0x062d }
            java.lang.Object r3 = r3.get(r15)     // Catch:{ all -> 0x062d }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ all -> 0x062d }
            long r6 = r3.longValue()     // Catch:{ all -> 0x062d }
            long r26 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x062d }
            long r26 = r26 - r6
            r28 = 300000(0x493e0, double:1.482197E-318)
            int r3 = (r26 > r28 ? 1 : (r26 == r28 ? 0 : -1))
            if (r3 >= 0) goto L_0x03c9
            java.util.Map<java.lang.String, vr2.i> r0 = r1.f274828o     // Catch:{ all -> 0x062d }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x062d }
            r0.remove(r15)     // Catch:{ all -> 0x062d }
            r1.mo131000y(r15)     // Catch:{ all -> 0x062d }
            java.lang.String r0 = "MicroMsg.DownloadManager"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x062d }
            r3.<init>()     // Catch:{ all -> 0x062d }
            java.lang.String r5 = "no need download. lastTime: "
            r3.append(r5)     // Catch:{ all -> 0x062d }
            r3.append(r6)     // Catch:{ all -> 0x062d }
            java.lang.String r5 = " url: "
            r3.append(r5)     // Catch:{ all -> 0x062d }
            r3.append(r12)     // Catch:{ all -> 0x062d }
            java.lang.String r5 = " id: "
            r3.append(r5)     // Catch:{ all -> 0x062d }
            if (r4 != 0) goto L_0x03b3
            goto L_0x03b5
        L_0x03b3:
            java.lang.String r8 = r4.f298689d     // Catch:{ all -> 0x062d }
        L_0x03b5:
            r3.append(r8)     // Catch:{ all -> 0x062d }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x062d }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)     // Catch:{ all -> 0x062d }
            monitor-exit(r2)     // Catch:{ all -> 0x062d }
            java.lang.String r0 = "tryStartNetscene"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.DownloadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            return
        L_0x03c9:
            java.util.Map<java.lang.String, java.lang.Long> r3 = r1.f274827n     // Catch:{ all -> 0x062d }
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()     // Catch:{ all -> 0x062d }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x062d }
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3     // Catch:{ all -> 0x062d }
            r3.put(r15, r6)     // Catch:{ all -> 0x062d }
            if (r4 == 0) goto L_0x041c
            java.lang.String r3 = "MicroMsg.DownloadManager"
            java.lang.String r6 = "[%s][media:%s]try start download with single media"
            r7 = 2
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch:{ all -> 0x062d }
            java.lang.String r7 = "[image-flow]"
            r13 = 0
            r10[r13] = r7     // Catch:{ all -> 0x062d }
            r7 = 1
            r10[r7] = r11     // Catch:{ all -> 0x062d }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r10)     // Catch:{ all -> 0x062d }
            java.lang.String r3 = r4.f298689d     // Catch:{ all -> 0x062d }
            java.util.LinkedList<vr2.w> r6 = r1.f274825l     // Catch:{ all -> 0x062d }
            int r6 = r6.size()     // Catch:{ all -> 0x062d }
            java.util.Map<java.lang.String, java.lang.Long> r7 = r1.f274827n     // Catch:{ all -> 0x062d }
            java.util.concurrent.ConcurrentHashMap r7 = (java.util.concurrent.ConcurrentHashMap) r7     // Catch:{ all -> 0x062d }
            int r7 = r7.size()     // Catch:{ all -> 0x062d }
            ks2.f r10 = ks2.C99181f.f290857a     // Catch:{ all -> 0x062d }
            java.lang.String r10 = "startDownload"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r13)     // Catch:{ all -> 0x062d }
            r21 = r12
            java.lang.String r12 = "mediaId"
            gy3.C87412m.m108594g(r3, r12)     // Catch:{ all -> 0x062d }
            ks2.v r12 = new ks2.v     // Catch:{ all -> 0x062d }
            r12.<init>(r3, r6, r7)     // Catch:{ all -> 0x062d }
            java.lang.String r3 = "SnsImageLoadReporter"
            o40.C61926c.m72661F(r3, r12)     // Catch:{ all -> 0x062d }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r13)     // Catch:{ all -> 0x062d }
            goto L_0x047b
        L_0x041c:
            r21 = r12
            if (r9 == 0) goto L_0x047b
            int r3 = r9.size()     // Catch:{ all -> 0x0626 }
            if (r3 <= 0) goto L_0x047b
            java.lang.String r3 = "MicroMsg.DownloadManager"
            java.lang.String r6 = "[%s][media:%s]try start download with media list"
            r7 = 2
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch:{ all -> 0x0626 }
            java.lang.String r7 = "[image-flow]"
            r12 = 0
            r10[r12] = r7     // Catch:{ all -> 0x0626 }
            r7 = 1
            r10[r7] = r11     // Catch:{ all -> 0x0626 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r10)     // Catch:{ all -> 0x0626 }
            r3 = 0
        L_0x0439:
            int r6 = r9.size()     // Catch:{ all -> 0x0626 }
            if (r3 >= r6) goto L_0x047b
            int r6 = r9.keyAt(r3)     // Catch:{ all -> 0x0626 }
            java.lang.Object r6 = r9.get(r6)     // Catch:{ all -> 0x0626 }
            te3.kv2 r6 = (te3.C101804kv2) r6     // Catch:{ all -> 0x0626 }
            java.lang.String r6 = r6.f298689d     // Catch:{ all -> 0x0626 }
            java.util.LinkedList<vr2.w> r7 = r1.f274825l     // Catch:{ all -> 0x0626 }
            int r7 = r7.size()     // Catch:{ all -> 0x0626 }
            java.util.Map<java.lang.String, java.lang.Long> r10 = r1.f274827n     // Catch:{ all -> 0x0626 }
            java.util.concurrent.ConcurrentHashMap r10 = (java.util.concurrent.ConcurrentHashMap) r10     // Catch:{ all -> 0x0626 }
            int r10 = r10.size()     // Catch:{ all -> 0x0626 }
            ks2.f r12 = ks2.C99181f.f290857a     // Catch:{ all -> 0x0626 }
            java.lang.String r12 = "startDownload"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r13)     // Catch:{ all -> 0x0626 }
            java.lang.String r1 = "mediaId"
            gy3.C87412m.m108594g(r6, r1)     // Catch:{ all -> 0x0626 }
            ks2.v r1 = new ks2.v     // Catch:{ all -> 0x0626 }
            r1.<init>(r6, r7, r10)     // Catch:{ all -> 0x0626 }
            java.lang.String r6 = "SnsImageLoadReporter"
            o40.C61926c.m72661F(r6, r1)     // Catch:{ all -> 0x0626 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)     // Catch:{ all -> 0x0626 }
            int r3 = r3 + 1
            r1 = r30
            goto L_0x0439
        L_0x047b:
            r1 = 0
            r3 = 2
            if (r14 == r3) goto L_0x0483
            r3 = 8
            if (r14 != r3) goto L_0x04b0
        L_0x0483:
            f40.C86709a0.m107528h()     // Catch:{ all -> 0x0626 }
            f40.o r3 = f40.C86709a0.m107535s()     // Catch:{ all -> 0x0626 }
            com.tencent.mm.storage.v1 r3 = r3.mo121142i()     // Catch:{ all -> 0x0626 }
            r6 = 68391(0x10b27, float:9.5836E-41)
            java.lang.Object r3 = r3.mo119684e(r6, r1)     // Catch:{ all -> 0x0626 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0626 }
            r7 = 0
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Integer) r3, (int) r7)     // Catch:{ all -> 0x0626 }
            f40.C86709a0.m107528h()     // Catch:{ all -> 0x0626 }
            f40.o r7 = f40.C86709a0.m107535s()     // Catch:{ all -> 0x0626 }
            com.tencent.mm.storage.v1 r7 = r7.mo121142i()     // Catch:{ all -> 0x0626 }
            r10 = 1
            int r3 = r3 + r10
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0626 }
            r7.mo119676J(r6, r3)     // Catch:{ all -> 0x0626 }
        L_0x04b0:
            r3 = 9
            if (r14 != r3) goto L_0x04c0
            es2.a r3 = new es2.a     // Catch:{ all -> 0x0626 }
            int r6 = r0.mo141837d()     // Catch:{ all -> 0x0626 }
            r7 = r25
            r3.<init>(r8, r9, r7, r6)     // Catch:{ all -> 0x0626 }
            goto L_0x04ce
        L_0x04c0:
            es2.a r3 = new es2.a     // Catch:{ all -> 0x0626 }
            java.lang.String r6 = r4.f298689d     // Catch:{ all -> 0x0626 }
            r3.<init>(r6)     // Catch:{ all -> 0x0626 }
            r3.f286537a = r4     // Catch:{ all -> 0x0626 }
            r6 = r24
            r3.mo136956h(r6)     // Catch:{ all -> 0x0626 }
        L_0x04ce:
            com.tencent.mm.storage.o3 r6 = r0.f301208f     // Catch:{ all -> 0x0626 }
            r3.f286548l = r6     // Catch:{ all -> 0x0626 }
            java.lang.String r6 = r0.mo141834a()     // Catch:{ all -> 0x0626 }
            r3.f286555s = r6     // Catch:{ all -> 0x0626 }
            java.lang.String r0 = r0.mo141835b()     // Catch:{ all -> 0x0626 }
            r3.f286556t = r0     // Catch:{ all -> 0x0626 }
            r0 = 4
            if (r14 != r0) goto L_0x04f0
            java.lang.String r0 = "setSight"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.model.download.DownloadItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r6)     // Catch:{ all -> 0x0626 }
            r7 = 1
            r3.f286541e = r7     // Catch:{ all -> 0x0626 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r6)     // Catch:{ all -> 0x0626 }
            goto L_0x04fe
        L_0x04f0:
            java.lang.String r0 = "setSight"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.model.download.DownloadItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r6)     // Catch:{ all -> 0x0626 }
            r7 = 0
            r3.f286541e = r7     // Catch:{ all -> 0x0626 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r6)     // Catch:{ all -> 0x0626 }
        L_0x04fe:
            java.lang.String r0 = "setThumb"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.model.download.DownloadItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r6)     // Catch:{ all -> 0x0626 }
            r3.f286540d = r5     // Catch:{ all -> 0x0626 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r6)     // Catch:{ all -> 0x0626 }
            r3.mo136957i(r14)     // Catch:{ all -> 0x0626 }
            r3.mo136958j(r15)     // Catch:{ all -> 0x0626 }
            java.lang.String r0 = "setUrl"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.model.download.DownloadItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r5)     // Catch:{ all -> 0x0626 }
            r6 = r21
            r3.f286539c = r6     // Catch:{ all -> 0x0626 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r5)     // Catch:{ all -> 0x0626 }
            r5 = r22
            r0 = r23
            r3.mo136959k(r0, r5)     // Catch:{ all -> 0x0626 }
            r0 = 1
            if (r14 == r0) goto L_0x05ff
            r0 = 5
            if (r14 == r0) goto L_0x05ff
            r0 = 7
            if (r14 == r0) goto L_0x05ff
            r0 = 9
            if (r14 != r0) goto L_0x0536
            goto L_0x05ff
        L_0x0536:
            r0 = 4
            if (r14 != r0) goto L_0x059f
            java.lang.String r0 = "MicroMsg.DownloadManager"
            java.lang.String r1 = "it can not download sight, may be something warn here."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)     // Catch:{ all -> 0x0626 }
            java.lang.String r0 = r4.f298689d     // Catch:{ all -> 0x0626 }
            if (r0 == 0) goto L_0x054f
            java.lang.String r1 = "adId_sight"
            boolean r0 = r0.startsWith(r1)     // Catch:{ all -> 0x0626 }
            if (r0 == 0) goto L_0x054f
            r0 = 1
            goto L_0x0550
        L_0x054f:
            r0 = 0
        L_0x0550:
            java.lang.String r1 = "MicroMsg.DownloadManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0626 }
            r5.<init>()     // Catch:{ all -> 0x0626 }
            java.lang.String r6 = "isAd="
            r5.append(r6)     // Catch:{ all -> 0x0626 }
            boolean r6 = r4.f298681N     // Catch:{ all -> 0x0626 }
            r5.append(r6)     // Catch:{ all -> 0x0626 }
            java.lang.String r6 = ", downloadByCDN="
            r5.append(r6)     // Catch:{ all -> 0x0626 }
            r6 = 1
            r5.append(r6)     // Catch:{ all -> 0x0626 }
            java.lang.String r6 = ", isAdLandingPageSight="
            r5.append(r6)     // Catch:{ all -> 0x0626 }
            r5.append(r0)     // Catch:{ all -> 0x0626 }
            java.lang.String r0 = ", mediaId="
            r5.append(r0)     // Catch:{ all -> 0x0626 }
            java.lang.String r0 = r4.f298689d     // Catch:{ all -> 0x0626 }
            r5.append(r0)     // Catch:{ all -> 0x0626 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0626 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)     // Catch:{ all -> 0x0626 }
            java.lang.String r0 = "MicroMsg.DownloadManager"
            java.lang.String r1 = "[%s][media:%s]SnsDownloadSight task create."
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0626 }
            java.lang.String r5 = "[image-flow]"
            r6 = 0
            r4[r6] = r5     // Catch:{ all -> 0x0626 }
            r5 = 1
            r4[r5] = r11     // Catch:{ all -> 0x0626 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r4)     // Catch:{ all -> 0x0626 }
            es2.i r1 = new es2.i     // Catch:{ all -> 0x0626 }
            r5 = r30
            r1.<init>(r5, r3)     // Catch:{ all -> 0x05c4 }
            goto L_0x0618
        L_0x059f:
            r0 = 2
            r5 = r30
            if (r14 == r0) goto L_0x05e7
            r0 = 8
            if (r14 == r0) goto L_0x05e7
            r0 = 3
            if (r14 != r0) goto L_0x05ac
            goto L_0x05e7
        L_0x05ac:
            r0 = 6
            if (r14 != r0) goto L_0x05c7
            java.lang.String r0 = r4.f298706x     // Catch:{ all -> 0x05c4 }
            java.lang.String r1 = "setUrl"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.model.download.DownloadItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r4)     // Catch:{ all -> 0x05c4 }
            r3.f286539c = r0     // Catch:{ all -> 0x05c4 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r4)     // Catch:{ all -> 0x05c4 }
            es2.d r1 = new es2.d     // Catch:{ all -> 0x05c4 }
            r1.<init>(r5, r3)     // Catch:{ all -> 0x05c4 }
            goto L_0x0618
        L_0x05c4:
            r0 = move-exception
            goto L_0x06a3
        L_0x05c7:
            r0 = 10
            if (r14 != r0) goto L_0x0618
            int r0 = r4.f298690e     // Catch:{ all -> 0x05c4 }
            r4 = 2
            if (r0 != r4) goto L_0x0618
            es2.e r1 = new es2.e     // Catch:{ all -> 0x05c4 }
            r1.<init>(r5, r3)     // Catch:{ all -> 0x05c4 }
            java.lang.String r0 = "MicroMsg.DownloadManager"
            java.lang.String r3 = "[%s][media:%s]SnsDownloadCommonMedia task create."
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x05c4 }
            java.lang.String r6 = "[image-flow]"
            r7 = 0
            r4[r7] = r6     // Catch:{ all -> 0x05c4 }
            r6 = 1
            r4[r6] = r11     // Catch:{ all -> 0x05c4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r4)     // Catch:{ all -> 0x05c4 }
            goto L_0x0618
        L_0x05e7:
            java.lang.String r0 = "MicroMsg.DownloadManager"
            java.lang.String r1 = "[%s][media:%s]SnsDownloadImage task create."
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x05c4 }
            java.lang.String r6 = "[image-flow]"
            r7 = 0
            r4[r7] = r6     // Catch:{ all -> 0x05c4 }
            r6 = 1
            r4[r6] = r11     // Catch:{ all -> 0x05c4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r4)     // Catch:{ all -> 0x05c4 }
            es2.g r1 = new es2.g     // Catch:{ all -> 0x05c4 }
            r1.<init>(r5, r3)     // Catch:{ all -> 0x05c4 }
            goto L_0x0618
        L_0x05ff:
            r5 = r30
            java.lang.String r0 = "MicroMsg.DownloadManager"
            java.lang.String r1 = "[%s][media:%s]SnsDownloadThumb task create."
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x05c4 }
            java.lang.String r6 = "[image-flow]"
            r7 = 0
            r4[r7] = r6     // Catch:{ all -> 0x05c4 }
            r6 = 1
            r4[r6] = r11     // Catch:{ all -> 0x05c4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r4)     // Catch:{ all -> 0x05c4 }
            es2.j r1 = new es2.j     // Catch:{ all -> 0x05c4 }
            r1.<init>(r5, r3)     // Catch:{ all -> 0x05c4 }
        L_0x0618:
            r1.mo136973j()     // Catch:{ all -> 0x05c4 }
            java.lang.String r0 = ""
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ all -> 0x05c4 }
            r1.mo119143f(r0)     // Catch:{ all -> 0x05c4 }
            goto L_0x0699
        L_0x0626:
            r0 = move-exception
            r5 = r30
            goto L_0x06a3
        L_0x062b:
            r5 = r1
            goto L_0x0699
        L_0x062d:
            r0 = move-exception
            r5 = r1
            goto L_0x06a3
        L_0x0630:
            r5 = r1
            java.util.Map<java.lang.String, vr2.i> r0 = r5.f274828o     // Catch:{ all -> 0x05c4 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x05c4 }
            r0.remove(r15)     // Catch:{ all -> 0x05c4 }
            r5.mo131000y(r15)     // Catch:{ all -> 0x05c4 }
            java.lang.String r0 = "MicroMsg.DownloadManager"
            java.lang.String r1 = "[%s][media:%s] tryStartNetscene not contain requestKey:%s return"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x05c4 }
            java.lang.String r4 = "[image-flow]"
            r6 = 0
            r3[r6] = r4     // Catch:{ all -> 0x05c4 }
            r4 = 1
            r3[r4] = r11     // Catch:{ all -> 0x05c4 }
            r4 = 2
            r3[r4] = r15     // Catch:{ all -> 0x05c4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r1, r3)     // Catch:{ all -> 0x05c4 }
            monitor-exit(r2)     // Catch:{ all -> 0x05c4 }
            java.lang.String r0 = "tryStartNetscene"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.DownloadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x065a:
            r5 = r1
            java.lang.String r1 = "MicroMsg.DownloadManager"
            java.lang.String r3 = "tryStartNetscene list is empty or reach max download size limit, max:%s, downloading.size:%d, downLoadingT.size:%s, downLoadingT:%s, list:%s"
            r4 = 5
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x05c4 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x05c4 }
            r6 = 0
            r4[r6] = r0     // Catch:{ all -> 0x05c4 }
            com.tencent.mm.plugin.sns.model.b1 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Rx0()     // Catch:{ all -> 0x05c4 }
            int r0 = r0.mo130953k()     // Catch:{ all -> 0x05c4 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x05c4 }
            r6 = 1
            r4[r6] = r0     // Catch:{ all -> 0x05c4 }
            java.util.Map<java.lang.String, java.lang.Long> r0 = r5.f274827n     // Catch:{ all -> 0x05c4 }
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch:{ all -> 0x05c4 }
            int r0 = r0.size()     // Catch:{ all -> 0x05c4 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x05c4 }
            r6 = 2
            r4[r6] = r0     // Catch:{ all -> 0x05c4 }
            java.lang.String r0 = r30.mo130992q()     // Catch:{ all -> 0x05c4 }
            r6 = 3
            r4[r6] = r0     // Catch:{ all -> 0x05c4 }
            java.lang.String r0 = r30.mo130991p()     // Catch:{ all -> 0x05c4 }
            r6 = 4
            r4[r6] = r0     // Catch:{ all -> 0x05c4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r4)     // Catch:{ all -> 0x05c4 }
        L_0x0699:
            monitor-exit(r2)     // Catch:{ all -> 0x05c4 }
            java.lang.String r0 = "tryStartNetscene"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.DownloadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x06a3:
            monitor-exit(r2)     // Catch:{ all -> 0x05c4 }
            java.lang.String r1 = "tryStartNetscene"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.DownloadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94853e.mo130974A():void");
    }

    /* renamed from: B */
    public void mo130975B(String str) {
        SnsMethodCalculate.markStartTimeMs("unFinishBySceneDown", "com.tencent.mm.plugin.sns.model.DownloadManager");
        C94866e1.ly0().post(new C94859f(str));
        SnsMethodCalculate.markEndTimeMs("unFinishBySceneDown", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }

    /* renamed from: C */
    public void mo130976C(String str, int i, boolean z) {
        SnsMethodCalculate.markStartTimeMs("unLockDownLoad", "com.tencent.mm.plugin.sns.model.DownloadManager");
        synchronized (this.f274820g) {
            try {
                Log.m105919d("MicroMsg.DownloadManager", "unLockDownLoad the thread id is %s %s %s.", Long.valueOf(Thread.currentThread().getId()), str, Boolean.valueOf(z));
                C102247i iVar = (C102247i) ((HashMap) this.f274828o).get(str);
                if (iVar != null) {
                    SnsMethodCalculate.markStartTimeMs("getRequestType", "com.tencent.mm.plugin.sns.data.DownloaderLockElment");
                    int i2 = iVar.f301130b;
                    SnsMethodCalculate.markEndTimeMs("getRequestType", "com.tencent.mm.plugin.sns.data.DownloaderLockElment");
                    if (9 == i2) {
                        SnsMethodCalculate.markStartTimeMs("getDecodeElements", "com.tencent.mm.plugin.sns.data.DownloaderLockElment");
                        SparseArray<C102268v> sparseArray = iVar.f301131c;
                        SnsMethodCalculate.markEndTimeMs("getDecodeElements", "com.tencent.mm.plugin.sns.data.DownloaderLockElment");
                        C102268v vVar = sparseArray.get(i);
                        if (vVar != null) {
                            C94866e1.Fx0().mo131109c(vVar, str);
                        }
                    } else {
                        SnsMethodCalculate.markStartTimeMs("getDecodeInfo", "com.tencent.mm.plugin.sns.data.DownloaderLockElment");
                        C102268v vVar2 = iVar.f301129a;
                        SnsMethodCalculate.markEndTimeMs("getDecodeInfo", "com.tencent.mm.plugin.sns.data.DownloaderLockElment");
                        if (vVar2 != null) {
                            C94866e1.Fx0().mo131109c(vVar2, str);
                        }
                    }
                }
                if (z) {
                    ((HashMap) this.f274828o).remove(str);
                    mo131000y(str);
                }
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("unLockDownLoad", "com.tencent.mm.plugin.sns.model.DownloadManager");
                    throw th;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("unLockDownLoad", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f4 A[Catch:{ all -> 0x0172 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0134 A[Catch:{ all -> 0x0172 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo130977b(java.lang.String r17, android.util.SparseArray<te3.C101804kv2> r18, android.util.SparseArray<vr2.C102268v> r19, com.tencent.p014mm.storage.C96983o3 r20, int r21, int r22) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r9 = r18
            r2 = r19
            java.lang.String r3 = "addBatchDownloadSns"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.model.DownloadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            int r3 = r18.size()
            r10 = 0
            r4 = 0
        L_0x0015:
            if (r4 >= r3) goto L_0x003d
            java.lang.Object r5 = r9.valueAt(r4)
            te3.kv2 r5 = (te3.C101804kv2) r5
            java.lang.String r6 = r5.f298689d
            com.tencent.p014mm.plugin.sns.model.C94921o2.m120484f(r6)
            java.lang.String r5 = r5.f298689d
            java.lang.String r6 = "setScene"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
            com.tencent.mm.plugin.sns.model.o2$b r5 = com.tencent.p014mm.plugin.sns.model.C94921o2.m120482b(r5)
            r8 = r22
            if (r5 == 0) goto L_0x0037
            long r11 = (long) r8
            r5.f275093g = r11
        L_0x0037:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
            int r4 = r4 + 1
            goto L_0x0015
        L_0x003d:
            java.lang.String r4 = com.tencent.p014mm.plugin.sns.model.C94866e1.xx0()
            boolean r4 = vr2.C102236a0.m134751j0(r4)
            r5 = 2
            r11 = 1
            if (r4 != 0) goto L_0x0066
            java.lang.String r0 = "MicroMsg.DownloadManager"
            java.lang.String r2 = "addBatchDownloadSns isHasSdcard is false accPath %s sdcard: %s."
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.lang.String r4 = com.tencent.p014mm.plugin.sns.model.C94866e1.xx0()
            r3[r10] = r4
            java.lang.String r4 = a70.C112760b.m154230f0()
            r3[r11] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r3)
            java.lang.String r0 = "addBatchDownloadSns"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.DownloadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            return
        L_0x0066:
            android.util.SparseArray r12 = new android.util.SparseArray
            r12.<init>()
            r4 = 0
        L_0x006c:
            if (r4 >= r3) goto L_0x0097
            int r6 = r9.keyAt(r4)
            java.lang.Object r7 = r9.get(r6)
            te3.kv2 r7 = (te3.C101804kv2) r7
            java.lang.String r8 = r7.f298689d
            java.lang.String r13 = "Locall_path"
            boolean r8 = r8.startsWith(r13)
            if (r8 != 0) goto L_0x0091
            java.lang.String r8 = r7.f298689d
            java.lang.String r13 = "pre_temp_sns_pic"
            boolean r8 = r8.startsWith(r13)
            if (r8 != 0) goto L_0x0091
            r12.put(r6, r7)
            goto L_0x0094
        L_0x0091:
            r2.remove(r6)
        L_0x0094:
            int r4 = r4 + 1
            goto L_0x006c
        L_0x0097:
            int r3 = r12.size()
            if (r3 > 0) goto L_0x00ac
            java.lang.String r0 = "MicroMsg.DownloadManager"
            java.lang.String r2 = "addBatchDownloadSns do not need download."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            java.lang.String r0 = "addBatchDownloadSns"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.DownloadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            return
        L_0x00ac:
            r3 = 9
            java.lang.String r6 = vr2.C102236a0.m134778x(r3, r0)
            byte[] r13 = r1.f274820g
            monitor-enter(r13)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.atomic.AtomicInteger> r4 = r1.f274829p     // Catch:{ all -> 0x0172 }
            boolean r4 = r4.containsKey(r6)     // Catch:{ all -> 0x0172 }
            if (r4 == 0) goto L_0x00e7
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.atomic.AtomicInteger> r4 = r1.f274829p     // Catch:{ all -> 0x0172 }
            java.lang.Object r4 = r4.get(r6)     // Catch:{ all -> 0x0172 }
            java.util.concurrent.atomic.AtomicInteger r4 = (java.util.concurrent.atomic.AtomicInteger) r4     // Catch:{ all -> 0x0172 }
            if (r4 == 0) goto L_0x00e7
            int r4 = r4.get()     // Catch:{ all -> 0x0172 }
            java.lang.String r7 = "MicroMsg.DownloadManager"
            java.lang.String r8 = "v: %s."
            java.lang.Object[] r14 = new java.lang.Object[r11]     // Catch:{ all -> 0x0172 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0172 }
            r14[r10] = r15     // Catch:{ all -> 0x0172 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r14)     // Catch:{ all -> 0x0172 }
            if (r4 <= 0) goto L_0x00e7
            java.lang.String r4 = "MicroMsg.DownloadManager"
            java.lang.String r7 = "skip this batch task."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r7)     // Catch:{ all -> 0x0172 }
            r4 = 0
            goto L_0x00e8
        L_0x00e7:
            r4 = 1
        L_0x00e8:
            if (r4 == 0) goto L_0x0134
            java.util.Map<java.lang.String, vr2.i> r7 = r1.f274828o     // Catch:{ all -> 0x0172 }
            java.util.HashMap r7 = (java.util.HashMap) r7     // Catch:{ all -> 0x0172 }
            boolean r7 = r7.containsKey(r6)     // Catch:{ all -> 0x0172 }
            if (r7 != 0) goto L_0x0134
            java.lang.String r4 = "MicroMsg.DownloadManager"
            java.lang.String r7 = "addBatchDownloadSns put lock & add list %s. lists:%s"
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0172 }
            r5[r10] = r0     // Catch:{ all -> 0x0172 }
            java.lang.String r8 = r16.mo130991p()     // Catch:{ all -> 0x0172 }
            r5[r11] = r8     // Catch:{ all -> 0x0172 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r7, r5)     // Catch:{ all -> 0x0172 }
            java.util.Map<java.lang.String, vr2.i> r4 = r1.f274828o     // Catch:{ all -> 0x0172 }
            vr2.i r5 = new vr2.i     // Catch:{ all -> 0x0172 }
            r5.<init>((android.util.SparseArray<vr2.C102268v>) r2, (int) r3)     // Catch:{ all -> 0x0172 }
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch:{ all -> 0x0172 }
            r4.put(r6, r5)     // Catch:{ all -> 0x0172 }
            java.util.LinkedList<vr2.w> r14 = r1.f274825l     // Catch:{ all -> 0x0172 }
            vr2.w r15 = new vr2.w     // Catch:{ all -> 0x0172 }
            r5 = 9
            r2 = r15
            r3 = r17
            r4 = r12
            r7 = r20
            r8 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0172 }
            r14.add(r15)     // Catch:{ all -> 0x0172 }
            java.util.HashMap<java.lang.String, java.lang.Long> r2 = r1.f274826m     // Catch:{ all -> 0x0172 }
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()     // Catch:{ all -> 0x0172 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0172 }
            r2.put(r0, r3)     // Catch:{ all -> 0x0172 }
            r0 = 1
            goto L_0x0176
        L_0x0134:
            if (r4 == 0) goto L_0x0175
            java.util.LinkedList<vr2.w> r0 = r1.f274825l     // Catch:{ all -> 0x0172 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0172 }
        L_0x013c:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0172 }
            if (r2 == 0) goto L_0x0175
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0172 }
            vr2.w r2 = (vr2.C102269w) r2     // Catch:{ all -> 0x0172 }
            r2.getClass()     // Catch:{ all -> 0x0172 }
            java.lang.String r3 = "getKey"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.data.SnsDownLoadElment"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)     // Catch:{ all -> 0x0172 }
            java.lang.String r5 = r2.f301205c     // Catch:{ all -> 0x0172 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)     // Catch:{ all -> 0x0172 }
            boolean r3 = r5.equals(r6)     // Catch:{ all -> 0x0172 }
            if (r3 == 0) goto L_0x013c
            java.util.LinkedList<vr2.w> r0 = r1.f274825l     // Catch:{ all -> 0x0172 }
            boolean r0 = r0.remove(r2)     // Catch:{ all -> 0x0172 }
            if (r0 == 0) goto L_0x016a
            java.util.LinkedList<vr2.w> r0 = r1.f274825l     // Catch:{ all -> 0x0172 }
            r0.addLast(r2)     // Catch:{ all -> 0x0172 }
        L_0x016a:
            java.lang.String r0 = "MicroMsg.DownloadManager"
            java.lang.String r2 = "addBatchDownloadSns update the download list."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ all -> 0x0172 }
            goto L_0x0175
        L_0x0172:
            r0 = move-exception
            goto L_0x0200
        L_0x0175:
            r0 = 0
        L_0x0176:
            monitor-exit(r13)     // Catch:{ all -> 0x0172 }
            if (r0 == 0) goto L_0x01c6
            r0 = 0
        L_0x017a:
            int r2 = r12.size()
            if (r0 >= r2) goto L_0x01c6
            int r2 = r9.keyAt(r0)
            java.lang.Object r2 = r9.get(r2)
            te3.kv2 r2 = (te3.C101804kv2) r2
            java.lang.String r3 = "MicroMsg.DownloadManager"
            java.lang.String r4 = "enqueue add batchDownload:%s"
            java.lang.Object[] r5 = new java.lang.Object[r11]
            java.lang.String r6 = r2.f298689d
            r5[r10] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r5)
            java.lang.String r2 = r2.f298689d
            java.util.LinkedList<vr2.w> r3 = r1.f274825l
            int r3 = r3.size()
            java.util.Map<java.lang.String, java.lang.Long> r4 = r1.f274827n
            java.util.concurrent.ConcurrentHashMap r4 = (java.util.concurrent.ConcurrentHashMap) r4
            int r4 = r4.size()
            ks2.f r5 = ks2.C99181f.f290857a
            java.lang.String r5 = "enqueueDownloadList"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            java.lang.String r7 = "mediaId"
            gy3.C87412m.m108594g(r2, r7)
            ks2.k r7 = new ks2.k
            r7.<init>(r2, r3, r4)
            java.lang.String r2 = "SnsImageLoadReporter"
            o40.C61926c.m72661F(r2, r7)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            int r0 = r0 + 1
            goto L_0x017a
        L_0x01c6:
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 == 0) goto L_0x01d9
            android.os.MessageQueue r0 = android.os.Looper.myQueue()
            com.tencent.mm.plugin.sns.model.e$k r2 = new com.tencent.mm.plugin.sns.model.e$k
            r2.<init>()
            r0.addIdleHandler(r2)
            goto L_0x01e0
        L_0x01d9:
            java.lang.String r0 = "MicroMsg.DownloadManager"
            java.lang.String r2 = "addBatchDownloadSns Looper.myLooper() == null."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r2)
        L_0x01e0:
            r16.mo130987l()
            r16.mo130986k()
            java.util.LinkedList<vr2.w> r0 = r1.f274825l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x01f8
            java.lang.String r0 = "MicroMsg.DownloadManager"
            java.lang.String r2 = "addBatchDownloadSns add success, tryStartNetscene."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r2)
            r16.mo130974A()
        L_0x01f8:
            java.lang.String r0 = "addBatchDownloadSns"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.DownloadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            return
        L_0x0200:
            monitor-exit(r13)     // Catch:{ all -> 0x0172 }
            java.lang.String r2 = "addBatchDownloadSns"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.model.DownloadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94853e.mo130977b(java.lang.String, android.util.SparseArray, android.util.SparseArray, com.tencent.mm.storage.o3, int, int):void");
    }

    /* renamed from: c */
    public void mo130978c(C94861h hVar) {
        SnsMethodCalculate.markStartTimeMs("addDownLoadEndListener", "com.tencent.mm.plugin.sns.model.DownloadManager");
        this.f274814a.post(new C94855b(hVar));
        SnsMethodCalculate.markEndTimeMs("addDownLoadEndListener", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }

    /* renamed from: d */
    public boolean mo130979d(C101804kv2 kv22, int i, C102268v vVar, C96983o3 o3Var) {
        SnsMethodCalculate.markStartTimeMs("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
        boolean e = mo130980e(kv22, i, vVar, o3Var, (String) null);
        SnsMethodCalculate.markEndTimeMs("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
        return e;
    }

    /* renamed from: e */
    public boolean mo130980e(C101804kv2 kv22, int i, C102268v vVar, C96983o3 o3Var, String str) {
        SnsMethodCalculate.markStartTimeMs("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
        SnsMethodCalculate.markStartTimeMs("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
        boolean f = mo130981f(kv22, i, vVar, o3Var, str, "", "", 0);
        SnsMethodCalculate.markEndTimeMs("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
        SnsMethodCalculate.markEndTimeMs("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
        return f;
    }

    /* renamed from: f */
    public boolean mo130981f(C101804kv2 kv22, int i, C102268v vVar, C96983o3 o3Var, String str, String str2, String str3, int i2) {
        C101804kv2 kv23 = kv22;
        SnsMethodCalculate.markStartTimeMs("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
        if (kv23 == null) {
            Log.m105920e("MicroMsg.DownloadManager", "unknow case media is null " + Util.getStack().toString());
            SnsMethodCalculate.markEndTimeMs("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
            return false;
        }
        synchronized (this.f274820g) {
            try {
                C94921o2.m120484f(kv23.f298689d);
                int i3 = (!o3Var.equals(C96983o3.f284131c) || i2 != 0) ? i2 : 2;
                String str4 = kv23.f298689d;
                SnsMethodCalculate.markStartTimeMs("setScene", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat");
                C94921o2.C94923b b = C94921o2.m120482b(str4);
                if (b != null) {
                    b.f275093g = (long) i3;
                }
                SnsMethodCalculate.markEndTimeMs("setScene", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat");
                mo130983h(kv22, i, vVar, o3Var, (String) null, (String) null, str, str2, str3);
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
                    throw th;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
        return true;
    }

    /* renamed from: g */
    public boolean mo130982g(C101804kv2 kv22, int i, C102268v vVar, C96983o3 o3Var, String str, String str2) {
        C101804kv2 kv23 = kv22;
        SnsMethodCalculate.markStartTimeMs("addDownLoadSnsAd", "com.tencent.mm.plugin.sns.model.DownloadManager");
        if (kv23 == null) {
            Log.m105920e("MicroMsg.DownloadManager", "unknow case media is null " + Util.getStack().toString());
            SnsMethodCalculate.markEndTimeMs("addDownLoadSnsAd", "com.tencent.mm.plugin.sns.model.DownloadManager");
            return false;
        }
        synchronized (this.f274820g) {
            try {
                C94921o2.m120484f(kv23.f298689d);
                SnsMethodCalculate.markStartTimeMs("addDownLoadSnsImpl", "com.tencent.mm.plugin.sns.model.DownloadManager");
                mo130983h(kv22, i, vVar, o3Var, str, str2, (String) null, "", "");
                SnsMethodCalculate.markEndTimeMs("addDownLoadSnsImpl", "com.tencent.mm.plugin.sns.model.DownloadManager");
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("addDownLoadSnsAd", "com.tencent.mm.plugin.sns.model.DownloadManager");
                    throw th;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("addDownLoadSnsAd", "com.tencent.mm.plugin.sns.model.DownloadManager");
        return true;
    }

    /* renamed from: h */
    public final boolean mo130983h(C101804kv2 kv22, int i, C102268v vVar, C96983o3 o3Var, String str, String str2, String str3, String str4, String str5) {
        byte[] bArr;
        int i2;
        C101804kv2 kv23 = kv22;
        int i3 = i;
        String str6 = str3;
        SnsMethodCalculate.markStartTimeMs("addDownLoadSnsImpl", "com.tencent.mm.plugin.sns.model.DownloadManager");
        Log.m105925i("MicroMsg.DownloadManager", "[%s][media:%s] run addDownLoadSnsImpl start", "[image-flow]", kv23.f298689d);
        if (!C102236a0.m134751j0(C94866e1.xx0())) {
            Log.m105921e("MicroMsg.DownloadManager", "[%s][media:%s] run addDownLoadSnsImpl isHasSdcard is false accpath %s sdcard: %s", "[image-flow]", kv23.f298689d, C94866e1.xx0(), C112760b.m154230f0());
            SnsMethodCalculate.markEndTimeMs("addDownLoadSnsImpl", "com.tencent.mm.plugin.sns.model.DownloadManager");
            return false;
        } else if (kv23.f298689d.startsWith("Locall_path") || kv23.f298689d.startsWith("pre_temp_sns_pic")) {
            Log.m105921e("MicroMsg.DownloadManager", "[%s][media:%s] is a local img not need download", "[image-flow]", kv23.f298689d);
            SnsMethodCalculate.markEndTimeMs("addDownLoadSnsImpl", "com.tencent.mm.plugin.sns.model.DownloadManager");
            return false;
        } else {
            String I = C102236a0.m134714I(i3, kv23.f298689d);
            byte[] bArr2 = this.f274820g;
            synchronized (bArr2) {
                try {
                    if (((HashMap) this.f274828o).containsKey(I)) {
                        bArr = bArr2;
                        Log.m105921e("MicroMsg.DownloadManager", "[%s][media:%s] run addDownLoadSnsImpl what are u doing?", "[image-flow]", kv23.f298689d);
                        Iterator<C102269w> it = this.f274825l.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C102269w next = it.next();
                            if (next.mo141836c() != null && next.mo141836c().f298689d.equals(kv23.f298689d)) {
                                SnsMethodCalculate.markStartTimeMs("getRequestType", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
                                int i4 = next.f301204b;
                                SnsMethodCalculate.markEndTimeMs("getRequestType", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
                                if (i4 == i3) {
                                    if (this.f274825l.remove(next)) {
                                        this.f274825l.addLast(next);
                                    }
                                    Log.m105926v("MicroMsg.DownloadManager", "update the download list.");
                                }
                            }
                        }
                    } else {
                        Log.m105925i("MicroMsg.DownloadManager", "[%s][media:%s] run addDownLoadSnsImpl add to net lists:%s", "[image-flow]", kv23.f298689d, mo130991p());
                        this.f274826m.put(kv23.f298689d, Long.valueOf(Util.currentTicks()));
                        ((HashMap) this.f274828o).put(I, new C102247i(vVar, i3));
                        C102269w wVar = r2;
                        bArr = bArr2;
                        String str7 = I;
                        try {
                            C102269w wVar2 = new C102269w(kv22, i, I, o3Var, str, str2, str4, str5);
                            this.f274825l.add(wVar);
                            String str8 = kv23.f298689d;
                            int size = this.f274825l.size();
                            int size2 = ((ConcurrentHashMap) this.f274827n).size();
                            C99181f fVar = C99181f.f290857a;
                            SnsMethodCalculate.markStartTimeMs("enqueueDownloadList", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                            C87412m.m108594g(str8, "mediaId");
                            C61926c.m72661F("SnsImageLoadReporter", new C99191k(str8, size, size2));
                            SnsMethodCalculate.markEndTimeMs("enqueueDownloadList", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                            if (!Util.isNullOrNil(str3)) {
                                String x = C102236a0.m134778x(9, str6);
                                Log.m105925i("MicroMsg.DownloadManager", "snsId: %s, mediaId: %s, batchKey: %s.", str6, kv23.f298689d, x);
                                if (this.f274829p.containsKey(x)) {
                                    AtomicInteger atomicInteger = this.f274829p.get(x);
                                    if (atomicInteger == null) {
                                        atomicInteger = new AtomicInteger(0);
                                    }
                                    i2 = atomicInteger.incrementAndGet();
                                } else {
                                    AtomicInteger atomicInteger2 = new AtomicInteger(0);
                                    int incrementAndGet = atomicInteger2.incrementAndGet();
                                    this.f274829p.put(x, atomicInteger2);
                                    i2 = incrementAndGet;
                                }
                                Log.m105925i("MicroMsg.DownloadManager", "res: %s.", Integer.valueOf(i2));
                                this.f274830q.put(str7, x);
                            }
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    break;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            }
                            SnsMethodCalculate.markEndTimeMs("addDownLoadSnsImpl", "com.tencent.mm.plugin.sns.model.DownloadManager");
                            throw th;
                        }
                    }
                    Log.m105925i("MicroMsg.DownloadManager", "tryStartNetscene size %s Tsize : %s, list:%s", Integer.valueOf(C94866e1.Rx0().mo130953k()), Integer.valueOf(((ConcurrentHashMap) this.f274827n).size()), mo130991p());
                    Log.m105927v("MicroMsg.DownloadManager", "lockwaitdownload %s memeryFiles.size() %s", Integer.valueOf(((HashMap) this.f274828o).size()), Integer.valueOf(this.f274818e.size()));
                    if (Looper.myLooper() != null) {
                        Looper.myQueue().addIdleHandler(new C94864k());
                    } else {
                        Log.m105928w("MicroMsg.DownloadManager", "Looper.myLooper() == null");
                    }
                    mo130987l();
                    mo130986k();
                    if (this.f274825l.size() > 0) {
                        mo130974A();
                    }
                    SnsMethodCalculate.markEndTimeMs("addDownLoadSnsImpl", "com.tencent.mm.plugin.sns.model.DownloadManager");
                    return true;
                } catch (Throwable th5) {
                    th = th5;
                    bArr = bArr2;
                    while (true) {
                        break;
                    }
                    SnsMethodCalculate.markEndTimeMs("addDownLoadSnsImpl", "com.tencent.mm.plugin.sns.model.DownloadManager");
                    throw th;
                }
            }
        }
    }

    /* renamed from: i */
    public void mo130984i(String str, String str2, String str3, int i, boolean z, int i2, C98127h.C98128a aVar) {
        SnsMethodCalculate.markStartTimeMs("addDownloadStreamVideoTask", "com.tencent.mm.plugin.sns.model.DownloadManager");
        C98127h hVar = new C98127h();
        hVar.f287660d = "task_DownloadManager";
        hVar.field_mediaId = str;
        hVar.f287705p0 = str2;
        hVar.f287689V = 1;
        hVar.field_fileType = 100;
        hVar.f287655L = 5;
        hVar.f287659Q = i;
        hVar.f287696Y0 = 3;
        hVar.field_fullpath = str3;
        hVar.f287704f1 = aVar;
        if (i == 1) {
            hVar.f287696Y0 = 10;
            SnsMethodCalculate.markStartTimeMs("checkAdDeviceSupportH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            if ((hVar.f287655L == 5) && !TextUtils.isEmpty(hVar.f287705p0)) {
                try {
                    if (hVar.f287705p0.contains("svpuseh265flag=1")) {
                        boolean UY = C102609h.m135510UY(6);
                        if (UY) {
                            hVar.field_requestVideoFormat = 2;
                        } else {
                            hVar.field_requestVideoFormat = 1;
                            C37817q.m41545a("dev_disable_hevc", C87203t.m108275k().toLowerCase(), 0, 0, "");
                        }
                        Log.m105924i("AdH265Helper", "checkAppendAdH265Flag, isDeviceSupportHevc=" + UY + ", requestVideoFormat=" + hVar.field_requestVideoFormat + ", url=" + hVar.f287705p0);
                        C99556n.m129943f(hVar.f287659Q, true, UY);
                    } else {
                        hVar.field_requestVideoFormat = 1;
                        Log.m105924i("AdH265Helper", "checkAppendAdH265Flag, url has no h265 flag, url=" + hVar.f287705p0);
                        C99556n.m129943f(hVar.f287659Q, false, false);
                    }
                } catch (Throwable th) {
                    hVar.field_requestVideoFormat = 1;
                    Log.m105920e("AdH265Helper", "checkAppendAdH265Flag, exp=" + th.toString());
                }
            }
            SnsMethodCalculate.markEndTimeMs("checkAdDeviceSupportH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            if (z) {
                hVar.f287689V = 2;
                hVar.field_preloadRatio = i2;
            }
        }
        C98398h0.xx0().mo126981e(hVar, false);
        synchronized (this.f274821h) {
            try {
                this.f274821h.put(str, str3);
            } catch (Throwable th4) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("addDownloadStreamVideoTask", "com.tencent.mm.plugin.sns.model.DownloadManager");
                    throw th4;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("addDownloadStreamVideoTask", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0031, code lost:
        if (r2.equals(r5) == false) goto L_0x0033;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo130985j(java.lang.String r7, com.tencent.p014mm.plugin.sns.model.C94853e.C94863j r8) {
        /*
            r6 = this;
            java.lang.String r0 = "addReporter"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.DownloadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r2 != 0) goto L_0x0038
            if (r8 == 0) goto L_0x0038
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.plugin.sns.model.e$j> r2 = r6.f274831r
            java.lang.Object r2 = r2.get(r7)
            com.tencent.mm.plugin.sns.model.e$j r2 = (com.tencent.p014mm.plugin.sns.model.C94853e.C94863j) r2
            if (r2 == 0) goto L_0x0033
            java.lang.String r3 = "access$400"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.model.DownloadManager$SingleImgDownloadByFeedReporter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            java.lang.String r2 = r2.f274843a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            java.lang.String r5 = r8.f274843a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x0038
        L_0x0033:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.plugin.sns.model.e$j> r2 = r6.f274831r
            r2.put(r7, r8)
        L_0x0038:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94853e.mo130985j(java.lang.String, com.tencent.mm.plugin.sns.model.e$j):void");
    }

    /* renamed from: k */
    public final void mo130986k() {
        SnsMethodCalculate.markStartTimeMs("checkDownloadingItem", "com.tencent.mm.plugin.sns.model.DownloadManager");
        LinkedList<String> linkedList = new LinkedList<>();
        synchronized (this.f274820g) {
            try {
                for (Map.Entry key : ((ConcurrentHashMap) this.f274827n).entrySet()) {
                    linkedList.add((String) key.getKey());
                }
                for (String str : linkedList) {
                    if (((ConcurrentHashMap) this.f274827n).containsKey(str) && Util.secondsToNow(((Long) ((ConcurrentHashMap) this.f274827n).get(str)).longValue()) * 1000 > 300000) {
                        Log.m105918d("MicroMsg.DownloadManager", "too long to download");
                        ((ConcurrentHashMap) this.f274827n).remove(str);
                        ((HashMap) this.f274828o).remove(str);
                        mo131000y(str);
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("checkDownloadingItem", "com.tencent.mm.plugin.sns.model.DownloadManager");
                    throw th;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("checkDownloadingItem", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }

    /* renamed from: l */
    public final void mo130987l() {
        SnsMethodCalculate.markStartTimeMs("checkIdleFile", "com.tencent.mm.plugin.sns.model.DownloadManager");
        SnsMethodCalculate.markStartTimeMs("expired", "com.tencent.mm.plugin.sns.model.DownloadManager");
        boolean z = Util.secondsToNow(this.f274815b) * 1000 > 300000;
        SnsMethodCalculate.markEndTimeMs("expired", "com.tencent.mm.plugin.sns.model.DownloadManager");
        if (z) {
            this.f274814a.postDelayed(new C94858e(), 500);
        }
        SnsMethodCalculate.markEndTimeMs("checkIdleFile", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }

    /* renamed from: m */
    public final boolean mo130988m(String str) {
        SnsMethodCalculate.markStartTimeMs("checkUrl", "com.tencent.mm.plugin.sns.model.DownloadManager");
        if (str == null || str.equals("")) {
            Log.m105918d("MicroMsg.DownloadManager", "url  " + str);
            SnsMethodCalculate.markEndTimeMs("checkUrl", "com.tencent.mm.plugin.sns.model.DownloadManager");
            return false;
        }
        SnsMethodCalculate.markEndTimeMs("checkUrl", "com.tencent.mm.plugin.sns.model.DownloadManager");
        return true;
    }

    /* renamed from: n */
    public void mo130989n() {
        SnsMethodCalculate.markStartTimeMs("cleanQueue", "com.tencent.mm.plugin.sns.model.DownloadManager");
        synchronized (this.f274820g) {
            try {
                this.f274825l.clear();
                this.f274828o.clear();
                this.f274827n.clear();
                this.f274818e.clear();
                this.f274819f.clear();
                this.f274829p.clear();
                this.f274830q.clear();
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("cleanQueue", "com.tencent.mm.plugin.sns.model.DownloadManager");
                    throw th;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("cleanQueue", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }

    /* renamed from: o */
    public void mo130990o() {
        SnsMethodCalculate.markStartTimeMs("cleanTask", "com.tencent.mm.plugin.sns.model.DownloadManager");
        synchronized (this.f274820g) {
            try {
                LinkedList linkedList = new LinkedList();
                Iterator<C102269w> it = this.f274825l.iterator();
                while (it.hasNext()) {
                    C102269w next = it.next();
                    next.getClass();
                    SnsMethodCalculate.markStartTimeMs("getRequestType", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
                    int i = next.f301204b;
                    SnsMethodCalculate.markEndTimeMs("getRequestType", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
                    if (i != 6) {
                        Map<String, C102247i> map = this.f274828o;
                        SnsMethodCalculate.markStartTimeMs("getKey", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
                        String str = next.f301205c;
                        SnsMethodCalculate.markEndTimeMs("getKey", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
                        ((HashMap) map).remove(str);
                        linkedList.add(next);
                    }
                }
                Iterator it4 = linkedList.iterator();
                while (it4.hasNext()) {
                    this.f274825l.remove((C102269w) it4.next());
                }
                this.f274829p.clear();
                this.f274830q.clear();
            } finally {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("cleanTask", "com.tencent.mm.plugin.sns.model.DownloadManager");
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("cleanTask", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }

    /* renamed from: p */
    public final String mo130991p() {
        SnsMethodCalculate.markStartTimeMs("dumpDownloadListsId", "com.tencent.mm.plugin.sns.model.DownloadManager");
        if (this.f274825l.size() > 0) {
            StringBuilder sb = new StringBuilder("");
            Iterator<C102269w> it = this.f274825l.iterator();
            while (it.hasNext()) {
                C102269w next = it.next();
                if (next != null) {
                    SnsMethodCalculate.markStartTimeMs("getMediaObjs", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
                    SparseArray<C101804kv2> sparseArray = next.f301212j;
                    SnsMethodCalculate.markEndTimeMs("getMediaObjs", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
                    if (sparseArray != null) {
                        SnsMethodCalculate.markStartTimeMs("getMediaObjs", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
                        SparseArray<C101804kv2> sparseArray2 = next.f301212j;
                        SnsMethodCalculate.markEndTimeMs("getMediaObjs", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
                        if (sparseArray2.size() > 0) {
                            SnsMethodCalculate.markStartTimeMs("getSnsId", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
                            String str = next.f301211i;
                            SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
                            sb.append(str);
                            sb.append(",");
                        }
                    }
                    if (next.mo141836c() != null) {
                        sb.append(next.mo141836c().f298689d);
                    }
                    sb.append(",");
                }
            }
            String sb4 = sb.toString();
            SnsMethodCalculate.markEndTimeMs("dumpDownloadListsId", "com.tencent.mm.plugin.sns.model.DownloadManager");
            return sb4;
        }
        SnsMethodCalculate.markEndTimeMs("dumpDownloadListsId", "com.tencent.mm.plugin.sns.model.DownloadManager");
        return "";
    }

    /* renamed from: q */
    public final String mo130992q() {
        SnsMethodCalculate.markStartTimeMs("dumpDownloadingListId", "com.tencent.mm.plugin.sns.model.DownloadManager");
        if (((ConcurrentHashMap) this.f274827n).size() > 0) {
            StringBuilder sb = new StringBuilder("");
            for (String str : ((ConcurrentHashMap) this.f274827n).keySet()) {
                if (!Util.isNullOrNil(str)) {
                    sb.append(str);
                    sb.append(",");
                }
            }
            String sb4 = sb.toString();
            SnsMethodCalculate.markEndTimeMs("dumpDownloadingListId", "com.tencent.mm.plugin.sns.model.DownloadManager");
            return sb4;
        }
        SnsMethodCalculate.markEndTimeMs("dumpDownloadingListId", "com.tencent.mm.plugin.sns.model.DownloadManager");
        return "";
    }

    /* renamed from: r */
    public boolean mo130993r() {
        SnsMethodCalculate.markStartTimeMs("isRun", "com.tencent.mm.plugin.sns.model.DownloadManager");
        boolean z = this.f274822i;
        SnsMethodCalculate.markEndTimeMs("isRun", "com.tencent.mm.plugin.sns.model.DownloadManager");
        return z;
    }

    /* renamed from: s */
    public final void mo130994s(String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("logDownloadCostTime", "com.tencent.mm.plugin.sns.model.DownloadManager");
        String[] split = str.split("-");
        String substring = (split == null || split.length != 2 || str.contains("sns_table_")) ? str.substring(2) : split[1].trim();
        if (this.f274826m.containsKey(substring)) {
            long ticksToNow = Util.ticksToNow(this.f274826m.get(substring).longValue());
            if (ticksToNow > 2000) {
                Log.m105925i("MicroMsg.DownloadManager", "mediaId:%s download cost:%sms too long!", substring, Long.valueOf(ticksToNow));
            } else {
                Log.m105925i("MicroMsg.DownloadManager", "mediaId:%s download cost:%sms", substring, Long.valueOf(ticksToNow));
            }
            if (z) {
                this.f274826m.remove(substring);
            }
        }
        SnsMethodCalculate.markEndTimeMs("logDownloadCostTime", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }

    /* renamed from: t */
    public void mo130995t(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("onProgress", "com.tencent.mm.plugin.sns.model.DownloadManager");
        C94866e1.ly0().post(new C94857d(str, str2));
        SnsMethodCalculate.markEndTimeMs("onProgress", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }

    /* renamed from: u */
    public void mo130996u(int i, C101804kv2 kv22, int i2, boolean z, String str, int i3, int i4, boolean z2) {
        int i5 = i;
        C101804kv2 kv23 = kv22;
        int i6 = i2;
        String str2 = str;
        boolean z3 = z2;
        SnsMethodCalculate.markStartTimeMs("onTaskFinish", "com.tencent.mm.plugin.sns.model.DownloadManager");
        String str3 = kv23 == null ? "" : kv23.f298689d;
        Log.m105925i("MicroMsg.DownloadManager", "[%s][media:%s]onTaskFinish state:%d, reqDownloadType:%d, isThumb:%b,requestKey:%s, totalSize:%d", "[image-flow]", str3, Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z), str2, Integer.valueOf(i3));
        if (!C94866e1.qy0()) {
            C86709a0.m107528h();
            if (C86709a0.m107523b().mo121114l()) {
                if (i5 != 2) {
                    this.f274816c += i3;
                }
                synchronized (this.f274820g) {
                    try {
                        if (this.f274816c > 512000 && this.f274825l.size() == 0) {
                            Log.m105919d("MicroMsg.DownloadManager", "netSizeAdd %s", Integer.valueOf(this.f274816c));
                            C31536y2 y2Var = C31519v2.f84271a;
                            if (y2Var != null) {
                                ((C29048w.C29055f) y2Var).mo56422a(this.f274816c, 0, 0);
                            }
                            this.f274816c = 0;
                        }
                        if (9 == i6) {
                            if ((i5 == 1 || i5 == 3) && z3) {
                                this.f274819f.put(str2, Long.valueOf(System.currentTimeMillis()));
                            }
                        } else if (i5 == 1 || i5 == 3) {
                            this.f274819f.put(str2, Long.valueOf(System.currentTimeMillis()));
                        }
                    } catch (Throwable th) {
                        while (true) {
                            SnsMethodCalculate.markEndTimeMs("onTaskFinish", "com.tencent.mm.plugin.sns.model.DownloadManager");
                            throw th;
                        }
                    }
                }
                if (!(i5 == 3 || i5 != 1 || i6 == 3 || kv23 == null)) {
                    C94901o Fx0 = C94866e1.Fx0();
                    Fx0.getClass();
                    SnsMethodCalculate.markStartTimeMs("updateCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    Log.m105918d("MicroMsg.LazyerImageLoader2", "updateCache " + kv23.f298689d);
                    C92714n l = Fx0.f274997c.get(C102236a0.m134780y(1, kv23.f298689d));
                    if (!C102236a0.m134742f(l)) {
                        SnsMethodCalculate.markEndTimeMs("updateCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    } else {
                        l.f266821g.decrementAndGet();
                        l.mo126923f();
                        Log.m105918d("MicroMsg.LazyerImageLoader2", "force update");
                        C94866e1.ky0().execute(new C94924p(Fx0, kv23));
                        SnsMethodCalculate.markEndTimeMs("updateCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    }
                }
                Log.m105925i("MicroMsg.DownloadManager", "[%s][media:%s]SnsImageLoadReporter callbackToUI", "[image-flow]", str3);
                if (kv23 != null) {
                    C99181f.m129206h(kv23.f298689d, this.f274825l.size(), ((ConcurrentHashMap) this.f274827n).size());
                }
                SnsMethodCalculate.markStartTimeMs("onDownLoadFinishByCdn", "com.tencent.mm.plugin.sns.model.DownloadManager");
                synchronized (this.f274820g) {
                    try {
                        Log.m105925i("MicroMsg.DownloadManager", "onDownLoadFinish by cdn %s, taskDone %s.", str2, Boolean.valueOf(z2));
                        mo130994s(str2, z3);
                        if (z3) {
                            ((ConcurrentHashMap) this.f274827n).remove(str2);
                        }
                    } catch (Throwable th4) {
                        while (true) {
                            SnsMethodCalculate.markEndTimeMs("onDownLoadFinishByCdn", "com.tencent.mm.plugin.sns.model.DownloadManager");
                            throw th4;
                        }
                    }
                }
                mo130974A();
                SnsMethodCalculate.markEndTimeMs("onDownLoadFinishByCdn", "com.tencent.mm.plugin.sns.model.DownloadManager");
                mo130976C(str2, i4, z3);
                SnsMethodCalculate.markStartTimeMs("onReport", "com.tencent.mm.plugin.sns.model.DownloadManager");
                synchronized (this.f274820g) {
                    if (kv23 != null) {
                        try {
                            C94863j x = mo130999x(kv23.f298689d);
                            if (x != null) {
                                SnsMethodCalculate.markStartTimeMs("isDownloadFinished", "com.tencent.mm.plugin.sns.model.DownloadManager$SingleImgDownloadByFeedReporter");
                                boolean z4 = x.f274847e;
                                SnsMethodCalculate.markEndTimeMs("isDownloadFinished", "com.tencent.mm.plugin.sns.model.DownloadManager$SingleImgDownloadByFeedReporter");
                                if (z4) {
                                    x.mo131012a();
                                }
                            }
                        } catch (Throwable th5) {
                            while (true) {
                                SnsMethodCalculate.markEndTimeMs("onReport", "com.tencent.mm.plugin.sns.model.DownloadManager");
                                throw th5;
                            }
                        }
                    }
                }
                SnsMethodCalculate.markEndTimeMs("onReport", "com.tencent.mm.plugin.sns.model.DownloadManager");
                Iterator it = ((CopyOnWriteArraySet) this.f274823j).iterator();
                while (it.hasNext()) {
                    C94861h hVar = (C94861h) it.next();
                    if (hVar != null) {
                        if (i5 == 2 || kv23 == null) {
                            if ((i6 == 2 || i6 == 8) && kv23 != null) {
                                Log.m105925i("MicroMsg.DownloadManager", "[%s][media:%s]listener onImageFinish[false] listener:%s", "[image-flow]", str3, hVar);
                                hVar.onImageFinish(kv23.f298689d, false);
                            } else if ((i6 == 4 || i6 == 6) && kv23 != null) {
                                Log.m105925i("MicroMsg.DownloadManager", "[%s][media:%s]listener onSightFinish[false] listener:%s", "[image-flow]", str3, hVar);
                                hVar.onSightFinish(kv23.f298689d, false);
                            } else if (i6 == 10 && kv23 != null && kv23.f298690e == 2) {
                                Log.m105925i("MicroMsg.DownloadManager", "[%s][media:%s]listener onImageFinish[false] listener:%s", "[image-flow]", str3, hVar);
                                hVar.onImageFinish(kv23.f298689d, false);
                            }
                        } else if (i6 == 3) {
                            hVar.onSetbg();
                        } else {
                            if (i6 != 1 && i6 != 9) {
                                if (!(i6 == 5 || i6 == 7)) {
                                    if (i6 == 2 || i6 == 8) {
                                        Log.m105925i("MicroMsg.DownloadManager", "[%s][media:%s]listener onImageFinish[true] listener:%s", "[image-flow]", str3, hVar);
                                        hVar.onImageFinish(kv23.f298689d, true);
                                    } else if (i6 == 4 || i6 == 6) {
                                        Log.m105925i("MicroMsg.DownloadManager", "[%s][media:%s]listener onSightFinish[true] listener:%s", "[image-flow]", str3, hVar);
                                        hVar.onSightFinish(kv23.f298689d, true);
                                    } else if (i6 == 10 && kv23.f298690e == 2) {
                                        Log.m105925i("MicroMsg.DownloadManager", "[%s][media:%s]listener onImageFinish[true] listener:%s", "[image-flow]", str3, hVar);
                                        hVar.onImageFinish(kv23.f298689d, true);
                                    }
                                }
                            }
                            Log.m105925i("MicroMsg.DownloadManager", "[%s][media:%s]listener onThumbFinish listener:%s", "[image-flow]", str3, hVar);
                            hVar.onThumbFinish(kv23.f298689d);
                        }
                    }
                }
                SnsMethodCalculate.markEndTimeMs("onTaskFinish", "com.tencent.mm.plugin.sns.model.DownloadManager");
                return;
            }
        }
        Log.m105921e("MicroMsg.DownloadManager", "[%s][media:%s]onTaskFinish account().hasInitialized", "[image-flow]", str3);
        mo130989n();
        SnsMethodCalculate.markEndTimeMs("onTaskFinish", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }

    /* renamed from: v */
    public void mo130997v(C94861h hVar) {
        SnsMethodCalculate.markStartTimeMs("removeDownLoadEndListener", "com.tencent.mm.plugin.sns.model.DownloadManager");
        this.f274814a.post(new C94856c(hVar));
        SnsMethodCalculate.markEndTimeMs("removeDownLoadEndListener", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }

    /* renamed from: w */
    public void mo130998w(String str, Object[] objArr) {
        SnsMethodCalculate.markStartTimeMs("removeDownloadStreamVideoTask", "com.tencent.mm.plugin.sns.model.DownloadManager");
        C98398h0.xx0().mo126983g(str, objArr);
        synchronized (this.f274821h) {
            try {
                this.f274821h.remove(str);
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("removeDownloadStreamVideoTask", "com.tencent.mm.plugin.sns.model.DownloadManager");
                    throw th;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("removeDownloadStreamVideoTask", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }

    /* renamed from: x */
    public C94863j mo130999x(String str) {
        SnsMethodCalculate.markStartTimeMs("removeReporter", "com.tencent.mm.plugin.sns.model.DownloadManager");
        if (!Util.isNullOrNil(str)) {
            C94863j remove = this.f274831r.remove(str);
            if (remove != null) {
                remove.getClass();
                SnsMethodCalculate.markStartTimeMs("decPicNum", "com.tencent.mm.plugin.sns.model.DownloadManager$SingleImgDownloadByFeedReporter");
                synchronized (remove.f274848f) {
                    try {
                        int i = remove.f274844b;
                        if (i > 0) {
                            remove.f274844b = i - 1;
                        }
                        if (remove.f274844b == 0) {
                            remove.f274847e = true;
                        }
                    } catch (Throwable th) {
                        while (true) {
                            SnsMethodCalculate.markEndTimeMs("decPicNum", "com.tencent.mm.plugin.sns.model.DownloadManager$SingleImgDownloadByFeedReporter");
                            throw th;
                        }
                    }
                }
                SnsMethodCalculate.markEndTimeMs("decPicNum", "com.tencent.mm.plugin.sns.model.DownloadManager$SingleImgDownloadByFeedReporter");
            }
            SnsMethodCalculate.markEndTimeMs("removeReporter", "com.tencent.mm.plugin.sns.model.DownloadManager");
            return remove;
        }
        SnsMethodCalculate.markEndTimeMs("removeReporter", "com.tencent.mm.plugin.sns.model.DownloadManager");
        return null;
    }

    /* renamed from: y */
    public final boolean mo131000y(String str) {
        SnsMethodCalculate.markStartTimeMs("removeRequestMap", "com.tencent.mm.plugin.sns.model.DownloadManager");
        boolean z = false;
        if (!Util.isNullOrNil(str) && this.f274830q.containsKey(str)) {
            String remove = this.f274830q.remove(str);
            if (!Util.isNullOrNil(remove)) {
                SnsMethodCalculate.markStartTimeMs("decBatchRetryRecordMap", "com.tencent.mm.plugin.sns.model.DownloadManager");
                if (this.f274829p.containsKey(remove)) {
                    AtomicInteger atomicInteger = this.f274829p.get(remove);
                    if (atomicInteger != null) {
                        int decrementAndGet = atomicInteger.decrementAndGet();
                        Log.m105925i("MicroMsg.DownloadManager", "unLockDownLoad, key: %s, v: %s.", remove, Integer.valueOf(decrementAndGet));
                        if (decrementAndGet == 0) {
                            this.f274829p.remove(remove);
                        }
                        SnsMethodCalculate.markEndTimeMs("decBatchRetryRecordMap", "com.tencent.mm.plugin.sns.model.DownloadManager");
                        z = true;
                        SnsMethodCalculate.markEndTimeMs("removeRequestMap", "com.tencent.mm.plugin.sns.model.DownloadManager");
                        return z;
                    }
                    Log.m105921e("MicroMsg.DownloadManager", "unLockDownLoad, key: %s, value is null.", remove);
                }
                SnsMethodCalculate.markEndTimeMs("decBatchRetryRecordMap", "com.tencent.mm.plugin.sns.model.DownloadManager");
                SnsMethodCalculate.markEndTimeMs("removeRequestMap", "com.tencent.mm.plugin.sns.model.DownloadManager");
                return z;
            }
        }
        SnsMethodCalculate.markEndTimeMs("removeRequestMap", "com.tencent.mm.plugin.sns.model.DownloadManager");
        return false;
    }

    /* renamed from: z */
    public void mo131001z(int i, boolean z) {
        Class cls = C10485b.class;
        SnsMethodCalculate.markStartTimeMs("setMaxThread", "com.tencent.mm.plugin.sns.model.DownloadManager");
        this.f274817d = i;
        try {
            String c = NetStatusUtil.isWifi(MMApplicationContext.getContext()) ? ((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("SnsImgDownloadConcurrentCountForWifi") : ((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("SnsImgDownloadConcurrentCountForNotWifi");
            if (Util.isNullOrNil(c) && CrashReportFactory.hasDebuger()) {
                c = "00:00-18:30-1-3;19:30-23:00-1-2;23:00-23:59-1-3;18:30-19:30-3-5;";
            }
            if (!Util.isNullOrNil(c)) {
                String[] split = new SimpleDateFormat("HH:mm").format(new Date()).split(XVFSFile.PATH_SEPARATOR);
                int safeParseInt = (Util.safeParseInt(split[0]) * 60) + Util.safeParseInt(split[1]);
                Vibrator vibrator = C102236a0.f301037a;
                SnsMethodCalculate.markStartTimeMs("getTimeZoneDis", "com.tencent.mm.plugin.sns.data.SnsUtil");
                SnsMethodCalculate.markEndTimeMs("getTimeZoneDis", "com.tencent.mm.plugin.sns.data.SnsUtil");
                int rawOffset = safeParseInt - ((((int) (((long) ((int) (((long) TimeZone.getDefault().getRawOffset()) / 60000))) / 60)) - 8) * 60);
                if (rawOffset < 0) {
                    rawOffset += 1440;
                } else if (rawOffset >= 1440) {
                    rawOffset -= 1440;
                }
                String[] split2 = c.split(";");
                for (int i2 = 0; i2 < split2.length; i2++) {
                    if (!Util.isNullOrNil(split2[i2])) {
                        String[] split3 = split2[i2].split("-");
                        if (split3 != null) {
                            if (split3.length >= 4) {
                                String[] split4 = split3[0].split(XVFSFile.PATH_SEPARATOR);
                                int safeParseInt2 = (Util.safeParseInt(split4[0]) * 60) + Util.safeParseInt(split4[1]);
                                String[] split5 = split3[1].split(XVFSFile.PATH_SEPARATOR);
                                int safeParseInt3 = (Util.safeParseInt(split5[0]) * 60) + Util.safeParseInt(split5[1]);
                                Log.m105925i("MicroMsg.DownloadManager", "setMaxThread i:%d [%d,%d] now:%d threadcnt:[%s,%s]", Integer.valueOf(i2), Integer.valueOf(safeParseInt2), Integer.valueOf(safeParseInt3), Integer.valueOf(rawOffset), split3[2], split3[3]);
                                if (rawOffset <= safeParseInt3 && rawOffset > safeParseInt2) {
                                    int safeParseInt4 = Util.safeParseInt(z ? split3[2] : split3[3]);
                                    if (safeParseInt4 > 0) {
                                        this.f274817d = safeParseInt4;
                                    }
                                }
                            }
                        }
                        Log.m105921e("MicroMsg.DownloadManager", "setMaxThread Err i%d :%s", Integer.valueOf(i2), c);
                    }
                }
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.DownloadManager", "setMaxThread :%s", Util.stackTraceToString(e));
        }
        Log.m105925i("MicroMsg.DownloadManager", "setMaxThread Res:%d ", Integer.valueOf(this.f274817d));
        SnsMethodCalculate.markEndTimeMs("setMaxThread", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }
}
