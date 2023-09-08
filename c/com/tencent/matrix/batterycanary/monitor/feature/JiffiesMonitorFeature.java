package com.tencent.matrix.batterycanary.monitor.feature;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.matrix.batterycanary.monitor.feature.C114433x13061b85;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.p014mm.feature.performance.q$$b;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p1177ce.C113310f;
import p1190de.C116608a;
import p329d3.C58104c;
import p723vf.C118672d;
import p723vf.C90779e;
import p761yd.C91441c;
import p961ee.C86507b;
import p965fe.C86853a;
import p981ie.C117159b;
import p981ie.C117164j;
import p981ie.C117178r;

public final class JiffiesMonitorFeature extends C116608a {

    /* renamed from: b */
    public final ThreadWatchDog f343057b = new ThreadWatchDog();

    /* renamed from: c */
    public final ThreadWatchDog f343058c = new ThreadWatchDog();

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$1 */
    class C1144281 implements Runnable {
    }

    public interface JiffiesListener {
        /* renamed from: c */
        void mo165848c(C114490k0.C114491a.C114494b.C114502c<? extends JiffiesSnapshot.ThreadJiffiesEntry> cVar);
    }

    public static class JiffiesSnapshot extends C114490k0.C114491a<JiffiesSnapshot> {

        /* renamed from: d */
        public int f343059d;

        /* renamed from: e */
        public boolean f343060e;

        /* renamed from: f */
        public String f343061f;

        /* renamed from: g */
        public C114490k0.C114491a.C114494b.C114497b<Long> f343062g;

        /* renamed from: h */
        public C114490k0.C114491a.C114494b.C114502c<ThreadJiffiesSnapshot> f343063h;

        /* renamed from: i */
        public C114490k0.C114491a.C114494b.C114497b<Integer> f343064i;

        /* renamed from: j */
        public C114490k0.C114491a.C114494b.C114502c<ThreadJiffiesSnapshot> f343065j;

        public static class ThreadJiffiesEntry extends C114490k0.C114491a.C114494b.C114497b<Long> {

            /* renamed from: b */
            public int f343066b;

            /* renamed from: c */
            public String f343067c;

            /* renamed from: d */
            public boolean f343068d;

            /* renamed from: e */
            public String f343069e;

            /* renamed from: f */
            public String f343070f;

            public ThreadJiffiesEntry(Long l) {
                super(l);
            }

            /* renamed from: a */
            public Number mo173614a(Number number) {
                return Long.valueOf(((Long) this.f343211a).longValue() - ((Long) number).longValue());
            }
        }

        @Deprecated
        public static class ThreadJiffiesSnapshot extends ThreadJiffiesEntry {
            public ThreadJiffiesSnapshot(Long l) {
                super(l);
            }

            /* renamed from: c */
            public static ThreadJiffiesSnapshot m160990c(ProcessInfo.ThreadInfo threadInfo) {
                try {
                    threadInfo.mo173617b();
                    ThreadJiffiesSnapshot threadJiffiesSnapshot = new ThreadJiffiesSnapshot(Long.valueOf(threadInfo.f343079e));
                    threadJiffiesSnapshot.f343067c = threadInfo.f343077c;
                    threadJiffiesSnapshot.f343069e = threadInfo.f343078d;
                    threadJiffiesSnapshot.f343066b = threadInfo.f343076b;
                    threadJiffiesSnapshot.f343068d = true;
                    return threadJiffiesSnapshot;
                } catch (IOException e) {
                    C118672d.m167354d("Matrix.battery.JiffiesMonitorFeature", e, "parseThreadJiffies fail", new Object[0]);
                    return null;
                }
            }
        }

        public /* synthetic */ JiffiesSnapshot(C1144281 r1) {
            this();
        }

        /* renamed from: b */
        public static JiffiesSnapshot m160986b(ProcessInfo processInfo, boolean z) {
            JiffiesSnapshot jiffiesSnapshot = new JiffiesSnapshot();
            jiffiesSnapshot.f343059d = processInfo.f343071a;
            jiffiesSnapshot.f343061f = processInfo.f343072b;
            int i = 0;
            long j = 0;
            if (z) {
                try {
                    processInfo.mo173615c();
                    j = processInfo.f343073c;
                } catch (IOException e) {
                    C118672d.m167354d("Matrix.battery.JiffiesMonitorFeature", e, "parseProcJiffies fail", new Object[0]);
                    jiffiesSnapshot.f343204c = false;
                    z = false;
                }
            }
            List<ITEM> emptyList = Collections.emptyList();
            if (processInfo.f343074d.size() > 0) {
                int size = processInfo.f343074d.size();
                ArrayList arrayList = new ArrayList(processInfo.f343074d.size());
                for (ProcessInfo.ThreadInfo c : processInfo.f343074d) {
                    ThreadJiffiesSnapshot c2 = ThreadJiffiesSnapshot.m160990c(c);
                    if (c2 != null) {
                        arrayList.add(c2);
                        if (!z) {
                            j += ((Long) c2.f343211a).longValue();
                        }
                    } else {
                        jiffiesSnapshot.f343204c = false;
                    }
                }
                i = size;
                emptyList = arrayList;
            }
            jiffiesSnapshot.f343062g = C114490k0.C114491a.C114494b.C114497b.m161112b(Long.valueOf(j));
            C114490k0.C114491a.C114494b.C114502c<ThreadJiffiesSnapshot> cVar = new C114490k0.C114491a.C114494b.C114502c<>();
            cVar.f343212a = emptyList;
            jiffiesSnapshot.f343063h = cVar;
            jiffiesSnapshot.f343064i = C114490k0.C114491a.C114494b.C114497b.m161112b(Integer.valueOf(i));
            return jiffiesSnapshot;
        }

        /* renamed from: a */
        public C114490k0.C114491a.C114492a mo111825a(C114490k0.C114491a aVar) {
            return new C114490k0.C114491a.C114492a<JiffiesSnapshot>(this, (JiffiesSnapshot) aVar, this) {
                /* renamed from: a */
                public C114490k0.C114491a mo173612a() {
                    boolean z;
                    boolean z2;
                    JiffiesSnapshot jiffiesSnapshot = new JiffiesSnapshot((C1144281) null);
                    JiffiesSnapshot jiffiesSnapshot2 = (JiffiesSnapshot) this.f343206b;
                    jiffiesSnapshot.f343059d = jiffiesSnapshot2.f343059d;
                    jiffiesSnapshot.f343060e = jiffiesSnapshot2.f343060e;
                    jiffiesSnapshot.f343061f = jiffiesSnapshot2.f343061f;
                    jiffiesSnapshot.f343062g = C114507l0.m161121a(((JiffiesSnapshot) this.f343205a).f343062g, jiffiesSnapshot2.f343062g);
                    jiffiesSnapshot.f343064i = C114507l0.m161121a(((JiffiesSnapshot) this.f343205a).f343064i, ((JiffiesSnapshot) this.f343206b).f343064i);
                    jiffiesSnapshot.f343063h = C114490k0.C114491a.C114494b.C114502c.m161119b();
                    if (((JiffiesSnapshot) this.f343206b).f343063h.f343212a.size() > 0) {
                        ArrayList arrayList = new ArrayList();
                        for (ITEM item : ((JiffiesSnapshot) this.f343206b).f343063h.f343212a) {
                            long longValue = ((Long) item.f343211a).longValue();
                            Iterator<ITEM> it = ((JiffiesSnapshot) this.f343205a).f343063h.f343212a.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z2 = true;
                                    break;
                                }
                                ThreadJiffiesSnapshot threadJiffiesSnapshot = (ThreadJiffiesSnapshot) it.next();
                                if (threadJiffiesSnapshot.f343067c.equals(item.f343067c) && threadJiffiesSnapshot.f343066b == item.f343066b) {
                                    longValue = ((Long) C114507l0.m161121a(threadJiffiesSnapshot, item).f343211a).longValue();
                                    z2 = false;
                                    break;
                                }
                            }
                            if (longValue > 0) {
                                ThreadJiffiesSnapshot threadJiffiesSnapshot2 = new ThreadJiffiesSnapshot(Long.valueOf(longValue));
                                threadJiffiesSnapshot2.f343066b = item.f343066b;
                                threadJiffiesSnapshot2.f343067c = item.f343067c;
                                threadJiffiesSnapshot2.f343069e = item.f343069e;
                                threadJiffiesSnapshot2.f343068d = z2;
                                arrayList.add(threadJiffiesSnapshot2);
                            }
                        }
                        if (arrayList.size() > 0) {
                            Collections.sort(arrayList, new Comparator<ThreadJiffiesSnapshot>(this) {
                                public int compare(Object obj, Object obj2) {
                                    int i = ((((Long) ((ThreadJiffiesSnapshot) obj).f343211a).longValue() - ((Long) ((ThreadJiffiesSnapshot) obj2).f343211a).longValue()) > 0 ? 1 : ((((Long) ((ThreadJiffiesSnapshot) obj).f343211a).longValue() - ((Long) ((ThreadJiffiesSnapshot) obj2).f343211a).longValue()) == 0 ? 0 : -1));
                                    if (i == 0) {
                                        return 0;
                                    }
                                    return i > 0 ? -1 : 1;
                                }
                            });
                            C114490k0.C114491a.C114494b.C114502c<ThreadJiffiesSnapshot> cVar = new C114490k0.C114491a.C114494b.C114502c<>();
                            cVar.f343212a = arrayList;
                            jiffiesSnapshot.f343063h = cVar;
                        }
                    }
                    if (((JiffiesSnapshot) this.f343205a).f343063h.f343212a.size() > 0) {
                        List<ITEM> emptyList = Collections.emptyList();
                        for (ITEM item2 : ((JiffiesSnapshot) this.f343205a).f343063h.f343212a) {
                            Iterator<ITEM> it4 = jiffiesSnapshot.f343063h.f343212a.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    if (((ThreadJiffiesSnapshot) it4.next()).f343066b == item2.f343066b) {
                                        z = false;
                                        break;
                                    }
                                } else {
                                    z = true;
                                    break;
                                }
                            }
                            if (z) {
                                if (emptyList.isEmpty()) {
                                    emptyList = new ArrayList<>();
                                }
                                emptyList.add(item2);
                            }
                        }
                        if (!emptyList.isEmpty()) {
                            C114490k0.C114491a.C114494b.C114502c<ThreadJiffiesSnapshot> cVar2 = new C114490k0.C114491a.C114494b.C114502c<>();
                            cVar2.f343212a = emptyList;
                            jiffiesSnapshot.f343065j = cVar2;
                        }
                    }
                    return jiffiesSnapshot;
                }
            };
        }

        private JiffiesSnapshot() {
            this.f343060e = false;
            this.f343065j = C114490k0.C114491a.C114494b.C114502c.m161119b();
        }
    }

    public static class ProcessInfo {

        /* renamed from: a */
        public int f343071a;

        /* renamed from: b */
        public String f343072b;

        /* renamed from: c */
        public long f343073c;

        /* renamed from: d */
        public List<ThreadInfo> f343074d = Collections.emptyList();

        public static class ThreadInfo {

            /* renamed from: a */
            public int f343075a;

            /* renamed from: b */
            public int f343076b;

            /* renamed from: c */
            public String f343077c;

            /* renamed from: d */
            public String f343078d;

            /* renamed from: e */
            public long f343079e;

            /* renamed from: a */
            public static List m160994a(int i) {
                File file = new File("/proc/" + i + "/task/");
                try {
                    if (file.isDirectory()) {
                        File[] listFiles = file.listFiles();
                        if (listFiles == null) {
                            return Collections.emptyList();
                        }
                        ArrayList arrayList = new ArrayList(listFiles.length);
                        for (File file2 : listFiles) {
                            if (file2.isDirectory()) {
                                try {
                                    int parseInt = Integer.parseInt(file2.getName());
                                    ThreadInfo threadInfo = new ThreadInfo();
                                    threadInfo.f343075a = i;
                                    threadInfo.f343076b = parseInt;
                                    arrayList.add(threadInfo);
                                } catch (Exception e) {
                                    C118672d.m167354d("Matrix.battery.JiffiesMonitorFeature", e, "parse thread error: " + file2.getName(), new Object[0]);
                                }
                            }
                        }
                        return arrayList;
                    }
                } catch (Exception e2) {
                    C118672d.m167354d("Matrix.battery.JiffiesMonitorFeature", e2, "list thread dir error", new Object[0]);
                }
                return Collections.emptyList();
            }

            /* renamed from: b */
            public void mo173617b() {
                C117178r.C117182d c = C117178r.m165260c(this.f343075a, this.f343076b);
                if (c == null || TextUtils.isEmpty(c.f351050a)) {
                    throw new IOException("parse fail: " + C117159b.m165200a("/proc/" + this.f343075a + "/task/" + this.f343076b + "/stat"));
                }
                this.f343077c = c.f351050a;
                this.f343078d = c.f351051b;
                this.f343079e = c.mo181109a();
            }

            public String toString() {
                return "thread:" + this.f343077c + "(" + this.f343076b + ") " + this.f343079e;
            }
        }

        /* renamed from: a */
        public static ProcessInfo m160991a() {
            ProcessInfo processInfo = new ProcessInfo();
            processInfo.f343071a = Process.myPid();
            processInfo.f343072b = C91441c.m114729c() ? C90779e.m113846a(C91441c.m114730d().f262168b) : "default";
            processInfo.f343074d = ThreadInfo.m160994a(processInfo.f343071a);
            SystemClock.uptimeMillis();
            System.currentTimeMillis();
            return processInfo;
        }

        /* renamed from: b */
        public static ProcessInfo m160992b(int i) {
            if (i == Process.myPid()) {
                return m160991a();
            }
            ProcessInfo processInfo = new ProcessInfo();
            processInfo.f343071a = i;
            processInfo.f343072b = C91441c.m114729c() ? C90779e.m113846a(C91441c.m114730d().f262168b) : "default";
            processInfo.f343074d = ThreadInfo.m160994a(processInfo.f343071a);
            SystemClock.uptimeMillis();
            System.currentTimeMillis();
            return processInfo;
        }

        /* renamed from: c */
        public void mo173615c() {
            int i = this.f343071a;
            ThreadLocal<byte[]> threadLocal = C117178r.f351047a;
            C117178r.C117182d d = C117178r.m165261d("/proc/" + i + "/stat");
            if (d != null) {
                this.f343072b = d.f351050a;
                this.f343073c = d.mo181109a();
                return;
            }
            throw new IOException("parse fail: " + C117159b.m165200a("/proc/" + this.f343071a + "/stat"));
        }

        public String toString() {
            return "process:" + this.f343072b + "(" + this.f343071a + ") thread size:" + this.f343074d.size();
        }
    }

    public class ThreadWatchDog implements Runnable {

        /* renamed from: d */
        public long f343080d;

        /* renamed from: e */
        public final List<ProcessInfo.ThreadInfo> f343081e = new ArrayList();

        /* renamed from: f */
        public Handler f343082f;

        public ThreadWatchDog() {
        }

        /* renamed from: a */
        public void mo173619a() {
            synchronized (this.f343081e) {
                C118672d.m167353c("Matrix.battery.JiffiesMonitorFeature", "ThreadWatchDog start watching, count = " + ((ArrayList) this.f343081e).size(), new Object[0]);
                if (!((ArrayList) this.f343081e).isEmpty()) {
                    HandlerThread handlerThread = new HandlerThread("matrix_watchdog");
                    handlerThread.start();
                    Handler handler = new Handler(handlerThread.getLooper());
                    this.f343082f = handler;
                    long j = 0 + 300000;
                    this.f343080d = j;
                    handler.postDelayed(this, j);
                }
            }
        }

        /* renamed from: b */
        public void mo173620b(int i, int i2) {
            synchronized (this.f343081e) {
                Iterator it = ((ArrayList) this.f343081e).iterator();
                while (it.hasNext()) {
                    ProcessInfo.ThreadInfo threadInfo = (ProcessInfo.ThreadInfo) it.next();
                    if (threadInfo.f343075a == i && threadInfo.f343076b == i2) {
                        return;
                    }
                }
                List<ProcessInfo.ThreadInfo> list = this.f343081e;
                ProcessInfo.ThreadInfo threadInfo2 = new ProcessInfo.ThreadInfo();
                threadInfo2.f343075a = i;
                threadInfo2.f343076b = i2;
                ((ArrayList) list).add(threadInfo2);
            }
        }

        public void run() {
            C118672d.m167353c("Matrix.battery.JiffiesMonitorFeature", "threadWatchDog start, size = " + ((ArrayList) this.f343081e).size() + ", delayMillis = " + this.f343080d, new Object[0]);
            ArrayList arrayList = new ArrayList();
            synchronized (this.f343081e) {
                Iterator it = ((ArrayList) this.f343081e).iterator();
                while (it.hasNext()) {
                    JiffiesSnapshot.ThreadJiffiesSnapshot c = JiffiesSnapshot.ThreadJiffiesSnapshot.m160990c((ProcessInfo.ThreadInfo) it.next());
                    if (c != null) {
                        c.f343068d = false;
                        arrayList.add(c);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                C114490k0.C114491a.C114494b.C114502c cVar = new C114490k0.C114491a.C114494b.C114502c();
                cVar.f343212a = arrayList;
                JiffiesMonitorFeature.this.f349668a.f339057d.f339031b.mo165848c(cVar);
            }
            synchronized (this.f343081e) {
                long j = this.f343080d;
                if (j <= 300000) {
                    Handler handler = this.f343082f;
                    if (handler != null) {
                        this.f343080d = j + 300000;
                        handler.postDelayed(this, 300000);
                    }
                } else if (j <= 600000) {
                    Handler handler2 = this.f343082f;
                    if (handler2 != null) {
                        this.f343080d = j + 600000;
                        handler2.postDelayed(this, 600000);
                    }
                } else {
                    synchronized (this.f343081e) {
                        ((ArrayList) this.f343081e).clear();
                    }
                }
            }
        }
    }

    public static class UidJiffiesSnapshot extends C114490k0.C114491a<UidJiffiesSnapshot> {

        /* renamed from: d */
        public C114490k0.C114491a.C114494b.C114497b<Long> f343084d = C114490k0.C114491a.C114494b.C114497b.m161112b(0L);

        /* renamed from: e */
        public List<JiffiesSnapshot> f343085e = Collections.emptyList();

        /* renamed from: f */
        public List<C114490k0.C114491a.C114492a<JiffiesSnapshot>> f343086f = Collections.emptyList();

        /* renamed from: a */
        public C114490k0.C114491a.C114492a mo111825a(C114490k0.C114491a aVar) {
            return new C114490k0.C114491a.C114492a<UidJiffiesSnapshot>(this, (UidJiffiesSnapshot) aVar, this) {
                /* renamed from: a */
                public C114490k0.C114491a mo173612a() {
                    JiffiesSnapshot jiffiesSnapshot;
                    UidJiffiesSnapshot uidJiffiesSnapshot = new UidJiffiesSnapshot();
                    uidJiffiesSnapshot.f343084d = C114507l0.m161121a(((UidJiffiesSnapshot) this.f343205a).f343084d, ((UidJiffiesSnapshot) this.f343206b).f343084d);
                    if (((UidJiffiesSnapshot) this.f343206b).f343085e.size() > 0) {
                        uidJiffiesSnapshot.f343086f = new ArrayList();
                        for (JiffiesSnapshot next : ((UidJiffiesSnapshot) this.f343206b).f343085e) {
                            Iterator<JiffiesSnapshot> it = ((UidJiffiesSnapshot) this.f343205a).f343085e.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    jiffiesSnapshot = null;
                                    break;
                                }
                                jiffiesSnapshot = it.next();
                                if (jiffiesSnapshot.f343059d == next.f343059d) {
                                    break;
                                }
                            }
                            if (jiffiesSnapshot == null) {
                                next.f343060e = true;
                                jiffiesSnapshot = new JiffiesSnapshot((C1144281) null);
                                jiffiesSnapshot.f343059d = next.f343059d;
                                jiffiesSnapshot.f343061f = next.f343061f;
                                jiffiesSnapshot.f343062g = C114490k0.C114491a.C114494b.C114497b.m161112b(0L);
                                jiffiesSnapshot.f343063h = C114490k0.C114491a.C114494b.C114502c.m161119b();
                                jiffiesSnapshot.f343064i = C114490k0.C114491a.C114494b.C114497b.m161112b(0);
                            }
                            boolean z = next.f343060e;
                            uidJiffiesSnapshot.f343086f.add(new C114490k0.C114491a.C114492a<JiffiesSnapshot>(next, jiffiesSnapshot, next) {
                                /* renamed from: a */
                                public C114490k0.C114491a mo173612a() {
                                    boolean z;
                                    boolean z2;
                                    JiffiesSnapshot jiffiesSnapshot = new JiffiesSnapshot((C1144281) null);
                                    JiffiesSnapshot jiffiesSnapshot2 = (JiffiesSnapshot) this.f343206b;
                                    jiffiesSnapshot.f343059d = jiffiesSnapshot2.f343059d;
                                    jiffiesSnapshot.f343060e = jiffiesSnapshot2.f343060e;
                                    jiffiesSnapshot.f343061f = jiffiesSnapshot2.f343061f;
                                    jiffiesSnapshot.f343062g = C114507l0.m161121a(((JiffiesSnapshot) this.f343205a).f343062g, jiffiesSnapshot2.f343062g);
                                    jiffiesSnapshot.f343064i = C114507l0.m161121a(((JiffiesSnapshot) this.f343205a).f343064i, ((JiffiesSnapshot) this.f343206b).f343064i);
                                    jiffiesSnapshot.f343063h = C114490k0.C114491a.C114494b.C114502c.m161119b();
                                    if (((JiffiesSnapshot) this.f343206b).f343063h.f343212a.size() > 0) {
                                        ArrayList arrayList = new ArrayList();
                                        for (ITEM item : ((JiffiesSnapshot) this.f343206b).f343063h.f343212a) {
                                            long longValue = ((Long) item.f343211a).longValue();
                                            Iterator<ITEM> it = ((JiffiesSnapshot) this.f343205a).f343063h.f343212a.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    z2 = true;
                                                    break;
                                                }
                                                ThreadJiffiesSnapshot threadJiffiesSnapshot = (ThreadJiffiesSnapshot) it.next();
                                                if (threadJiffiesSnapshot.f343067c.equals(item.f343067c) && threadJiffiesSnapshot.f343066b == item.f343066b) {
                                                    longValue = ((Long) C114507l0.m161121a(threadJiffiesSnapshot, item).f343211a).longValue();
                                                    z2 = false;
                                                    break;
                                                }
                                            }
                                            if (longValue > 0) {
                                                ThreadJiffiesSnapshot threadJiffiesSnapshot2 = new ThreadJiffiesSnapshot(Long.valueOf(longValue));
                                                threadJiffiesSnapshot2.f343066b = item.f343066b;
                                                threadJiffiesSnapshot2.f343067c = item.f343067c;
                                                threadJiffiesSnapshot2.f343069e = item.f343069e;
                                                threadJiffiesSnapshot2.f343068d = z2;
                                                arrayList.add(threadJiffiesSnapshot2);
                                            }
                                        }
                                        if (arrayList.size() > 0) {
                                            Collections.sort(arrayList, new Comparator<ThreadJiffiesSnapshot>(this) {
                                                public int compare(Object obj, Object obj2) {
                                                    int i = ((((Long) ((ThreadJiffiesSnapshot) obj).f343211a).longValue() - ((Long) ((ThreadJiffiesSnapshot) obj2).f343211a).longValue()) > 0 ? 1 : ((((Long) ((ThreadJiffiesSnapshot) obj).f343211a).longValue() - ((Long) ((ThreadJiffiesSnapshot) obj2).f343211a).longValue()) == 0 ? 0 : -1));
                                                    if (i == 0) {
                                                        return 0;
                                                    }
                                                    return i > 0 ? -1 : 1;
                                                }
                                            });
                                            C114490k0.C114491a.C114494b.C114502c<ThreadJiffiesSnapshot> cVar = new C114490k0.C114491a.C114494b.C114502c<>();
                                            cVar.f343212a = arrayList;
                                            jiffiesSnapshot.f343063h = cVar;
                                        }
                                    }
                                    if (((JiffiesSnapshot) this.f343205a).f343063h.f343212a.size() > 0) {
                                        List<ITEM> emptyList = Collections.emptyList();
                                        for (ITEM item2 : ((JiffiesSnapshot) this.f343205a).f343063h.f343212a) {
                                            Iterator<ITEM> it4 = jiffiesSnapshot.f343063h.f343212a.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    if (((ThreadJiffiesSnapshot) it4.next()).f343066b == item2.f343066b) {
                                                        z = false;
                                                        break;
                                                    }
                                                } else {
                                                    z = true;
                                                    break;
                                                }
                                            }
                                            if (z) {
                                                if (emptyList.isEmpty()) {
                                                    emptyList = new ArrayList<>();
                                                }
                                                emptyList.add(item2);
                                            }
                                        }
                                        if (!emptyList.isEmpty()) {
                                            C114490k0.C114491a.C114494b.C114502c<ThreadJiffiesSnapshot> cVar2 = new C114490k0.C114491a.C114494b.C114502c<>();
                                            cVar2.f343212a = emptyList;
                                            jiffiesSnapshot.f343065j = cVar2;
                                        }
                                    }
                                    return jiffiesSnapshot;
                                }
                            });
                        }
                        Collections.sort(uidJiffiesSnapshot.f343086f, new Comparator<C114490k0.C114491a.C114492a<JiffiesSnapshot>>(this) {
                            public int compare(Object obj, Object obj2) {
                                int i = ((((Long) ((JiffiesSnapshot) ((C114490k0.C114491a.C114492a) obj).f343207c).f343062g.f343211a).longValue() - ((Long) ((JiffiesSnapshot) ((C114490k0.C114491a.C114492a) obj2).f343207c).f343062g.f343211a).longValue()) > 0 ? 1 : ((((Long) ((JiffiesSnapshot) ((C114490k0.C114491a.C114492a) obj).f343207c).f343062g.f343211a).longValue() - ((Long) ((JiffiesSnapshot) ((C114490k0.C114491a.C114492a) obj2).f343207c).f343062g.f343211a).longValue()) == 0 ? 0 : -1));
                                if (i == 0) {
                                    return 0;
                                }
                                return i > 0 ? -1 : 1;
                            }
                        });
                    }
                    return uidJiffiesSnapshot;
                }
            };
        }
    }

    /* renamed from: a */
    public void mo173597a(boolean z) {
        super.mo173597a(z);
        if (z) {
            this.f343057b.mo173619a();
            ThreadWatchDog threadWatchDog = this.f343058c;
            synchronized (threadWatchDog.f343081e) {
                Handler handler = threadWatchDog.f343082f;
                if (handler != null) {
                    handler.removeCallbacks(threadWatchDog);
                    threadWatchDog.f343082f.getLooper().quit();
                    threadWatchDog.f343082f = null;
                }
            }
            return;
        }
        this.f343058c.mo173619a();
        ThreadWatchDog threadWatchDog2 = this.f343057b;
        synchronized (threadWatchDog2.f343081e) {
            Handler handler2 = threadWatchDog2.f343082f;
            if (handler2 != null) {
                handler2.removeCallbacks(threadWatchDog2);
                threadWatchDog2.f343082f.getLooper().quit();
                threadWatchDog2.f343082f = null;
            }
        }
    }

    /* renamed from: b */
    public void mo111817b() {
        super.mo111817b();
        this.f349668a.f339057d.getClass();
    }

    /* renamed from: d */
    public int mo111818d() {
        return Integer.MAX_VALUE;
    }

    /* renamed from: g */
    public String mo111820g() {
        return "Matrix.battery.JiffiesMonitorFeature";
    }

    /* renamed from: i */
    public UidJiffiesSnapshot mo173610i() {
        C114433x13061b85 jiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies;
        Context a = this.f349668a.mo165879a();
        C113310f fVar = this.f349668a.f339057d;
        UidJiffiesSnapshot uidJiffiesSnapshot = new UidJiffiesSnapshot();
        List<C58104c<Integer, String>> l = C86507b.m107281l(a);
        ArrayList arrayList = (ArrayList) l;
        uidJiffiesSnapshot.f343085e = new ArrayList(arrayList.size());
        C118672d.m167353c("Matrix.battery.JiffiesMonitorFeature", "currProcList: " + l, new Object[0]);
        Iterator it = arrayList.iterator();
        long j = 0;
        while (it.hasNext()) {
            C58104c cVar = (C58104c) it.next();
            int intValue = ((Integer) cVar.f166179a).intValue();
            String valueOf = String.valueOf(cVar.f166180b);
            if (C117178r.m165258a(intValue)) {
                C118672d.m167353c("Matrix.battery.JiffiesMonitorFeature", "proc: " + intValue, new Object[0]);
                JiffiesSnapshot b = JiffiesSnapshot.m160986b(ProcessInfo.m160992b(intValue), fVar.f339045p);
                b.f343061f = C86853a.m107857d(valueOf);
                j += ((Long) b.f343062g.f343211a).longValue();
                uidJiffiesSnapshot.f343085e.add(b);
            } else {
                C117164j<C58104c<Integer, String>, C114433x13061b85> jVar = fVar.f339027B;
                if (jVar == null || (jiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies = (C114433x13061b85) ((q$$b) jVar).apply(cVar)) == null) {
                    C118672d.m167353c("Matrix.battery.JiffiesMonitorFeature", "skip: " + intValue, new Object[0]);
                } else {
                    C118672d.m167353c("Matrix.battery.JiffiesMonitorFeature", "ipc: " + intValue, new Object[0]);
                    JiffiesSnapshot jiffiesSnapshot = new JiffiesSnapshot((C1144281) null);
                    jiffiesSnapshot.f343059d = jiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies.f343087d;
                    jiffiesSnapshot.f343061f = jiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies.f343088e;
                    jiffiesSnapshot.f343062g = C114490k0.C114491a.C114494b.C114497b.m161112b(Long.valueOf(jiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies.f343089f));
                    ArrayList arrayList2 = Collections.emptyList();
                    if (!jiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies.f343091h.isEmpty()) {
                        ArrayList arrayList3 = new ArrayList(jiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies.f343091h.size());
                        for (C114433x13061b85.IpcThreadJiffies next : jiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies.f343091h) {
                            JiffiesSnapshot.ThreadJiffiesSnapshot threadJiffiesSnapshot = new JiffiesSnapshot.ThreadJiffiesSnapshot(Long.valueOf(next.f343095g));
                            threadJiffiesSnapshot.f343067c = next.f343093e;
                            threadJiffiesSnapshot.f343069e = next.f343094f;
                            threadJiffiesSnapshot.f343066b = next.f343092d;
                            threadJiffiesSnapshot.f343068d = true;
                            arrayList3.add(threadJiffiesSnapshot);
                        }
                        arrayList2 = arrayList3;
                    }
                    C114490k0.C114491a.C114494b.C114502c<JiffiesSnapshot.ThreadJiffiesSnapshot> cVar2 = new C114490k0.C114491a.C114494b.C114502c<>();
                    cVar2.f343212a = arrayList2;
                    jiffiesSnapshot.f343063h = cVar2;
                    jiffiesSnapshot.f343064i = C114490k0.C114491a.C114494b.C114497b.m161112b(Integer.valueOf(arrayList2.size()));
                    jiffiesSnapshot.f343061f = C86853a.m107857d(valueOf);
                    j += ((Long) jiffiesSnapshot.f343062g.f343211a).longValue();
                    uidJiffiesSnapshot.f343085e.add(jiffiesSnapshot);
                }
            }
        }
        uidJiffiesSnapshot.f343084d = C114490k0.C114491a.C114494b.C114497b.m161112b(Long.valueOf(j));
        return uidJiffiesSnapshot;
    }

    /* renamed from: j */
    public void mo173611j(boolean z, int i, int i2) {
        if (z) {
            this.f343057b.mo173620b(i, i2);
        } else {
            this.f343058c.mo173620b(i, i2);
        }
    }
}
