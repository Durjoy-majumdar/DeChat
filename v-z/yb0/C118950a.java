package yb0;

import android.os.Process;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import eb0.C31543z5;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import yb0.C118952c;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: yb0.a */
public final class C118950a {

    /* renamed from: a */
    public static boolean f356272a;

    /* renamed from: b */
    public static final C118952c f356273b = new C118952c();

    /* renamed from: c */
    public static boolean f356274c = true;

    /* renamed from: d */
    public static Future f356275d;

    /* renamed from: yb0.a$a */
    public static class C118951a implements Comparable<C118951a> {

        /* renamed from: d */
        public long f356276d = 0;

        /* renamed from: e */
        public long f356277e = 0;

        /* renamed from: f */
        public long f356278f = 0;

        /* renamed from: g */
        public int f356279g = 0;

        /* renamed from: h */
        public int f356280h = 0;

        /* renamed from: i */
        public int f356281i = 0;

        /* renamed from: j */
        public boolean f356282j = true;

        /* renamed from: n */
        public int f356283n = 0;

        /* renamed from: o */
        public boolean f356284o = false;

        public int compareTo(Object obj) {
            long j;
            C118951a aVar = (C118951a) obj;
            long j2 = this.f356276d;
            if (j2 != 0) {
                long j3 = aVar.f356276d;
                if (j3 != 0) {
                    j = j2 - j3;
                    return (int) j;
                }
            }
            j = this.f356277e - aVar.f356277e;
            return (int) j;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            int i = this.f356279g;
            if (i == 0) {
                sb.append(String.format("server time:%s,local start time:%s,local end time:%s,[mm] pid:%s,normal execute:%s", new Object[]{C118950a.m167705b(this.f356276d), C118950a.m167705b(this.f356277e), C118950a.m167705b(this.f356278f), Integer.valueOf(this.f356280h), Boolean.valueOf(this.f356282j)}));
            } else if (i == 1) {
                sb.append(String.format("server time:%s,local start time:%s,local end time:%s,[push] pid:%s,network:%s,normal execute:%s", new Object[]{C118950a.m167705b(this.f356276d), C118950a.m167705b(this.f356277e), C118950a.m167705b(this.f356278f), Integer.valueOf(this.f356280h), Integer.valueOf(this.f356281i), Boolean.valueOf(this.f356282j)}));
            } else if (i == 2) {
                sb.append(String.format("server time:%s,local start time:%s,local end time:%s,send broadcast type(push):%s", new Object[]{C118950a.m167705b(this.f356276d), C118950a.m167705b(this.f356277e), C118950a.m167705b(this.f356278f), Integer.valueOf(this.f356283n)}));
            } else if (i == 3) {
                sb.append(String.format("server time:%s,local start time:%s,local end time:%s,receive broadcast type(mm):%s", new Object[]{C118950a.m167705b(this.f356276d), C118950a.m167705b(this.f356277e), C118950a.m167705b(this.f356278f), Integer.valueOf(this.f356283n)}));
            } else if (i == 4) {
                Object[] objArr = new Object[8];
                objArr[0] = C118950a.m167705b(this.f356276d);
                objArr[1] = C118950a.m167705b(this.f356277e);
                objArr[2] = C118950a.m167705b(this.f356278f);
                objArr[3] = Integer.valueOf(this.f356280h);
                objArr[4] = C118950a.m167705b(0);
                objArr[5] = 0L;
                objArr[6] = 0L;
                objArr[7] = this.f356284o ? "foreground" : "background";
                sb.append(String.format("server time:%s,local start time:%s,local end time:%s,delayed msg pid:%s, msg server time:%s,interval time:%s, msg server id:%s, %s", objArr));
            }
            sb.append("\n");
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static void m167704a(int i, long j) {
        if (f356274c && !f356272a) {
            C118952c cVar = f356273b;
            C118952c.C118955c cVar2 = new C118952c.C118955c(C31543z5.m39451a(), System.currentTimeMillis(), i, j);
            C118952c.C118953a aVar = cVar.f356288f;
            if (((CopyOnWriteArrayList) aVar.f356299e).size() > 30000) {
                int i2 = 0;
                while (i2 < 100) {
                    try {
                        ((CopyOnWriteArrayList) aVar.f356299e).remove(0);
                        i2++;
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.ActiveDetector.ProcessDetector", "addSendInterProcessList %s", e.getMessage());
                    }
                }
            }
            ((CopyOnWriteArrayList) aVar.f356299e).add(cVar2);
        }
    }

    /* renamed from: b */
    public static String m167705b(long j) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date(j));
    }

    /* renamed from: c */
    public static void m167706c(List<C118951a> list, List<C118952c.C118954b> list2, boolean z) {
        C118951a aVar;
        if (list2 != null) {
            for (C118952c.C118954b bVar : list2) {
                if (bVar == null) {
                    aVar = null;
                } else {
                    aVar = new C118951a();
                    aVar.f356280h = 0;
                    aVar.f356276d = 0;
                    aVar.f356277e = 0;
                    aVar.f356278f = 0;
                    aVar.f356279g = 4;
                    aVar.f356284o = z;
                }
                if (aVar != null) {
                    list.add(aVar);
                }
            }
        }
    }

    /* renamed from: d */
    public static final void m167707d(boolean z) {
        Log.m105925i("MicroMsg.ActiveDetector", "onActive() active:%s", Boolean.valueOf(z));
        boolean z2 = !MMApplicationContext.getContext().getSharedPreferences("system_config_prefs", 4).getBoolean("msg_delay_close_detect", false);
        f356274c = z2;
        if (z2) {
            f356272a = z;
            if (z) {
                Log.m105925i("MicroMsg.ActiveDetector", "[oneliang]active, time%s, pid:%s", Long.valueOf(System.currentTimeMillis()), Integer.valueOf(Process.myPid()));
                Log.m105925i("MicroMsg.ActiveDetector", "active, interrupt end, time %s", Long.valueOf(System.currentTimeMillis()));
                Future future = f356275d;
                if (future != null) {
                    future.cancel(true);
                }
                f356275d = null;
                C118952c cVar = f356273b;
                cVar.f356294o = false;
                cVar.f356290h = 0;
                cVar.f356291i = 0;
                Log.m105925i("MicroMsg.ActiveDetector", "active, processDetector.clear end, time %s", Long.valueOf(System.currentTimeMillis()));
                C31543z5.m39451a();
                return;
            }
            Log.m105925i("MicroMsg.ActiveDetector", "[oneliang]unactive, time%s, pid:%s", Long.valueOf(System.currentTimeMillis()), Integer.valueOf(Process.myPid()));
            if (f356275d == null) {
                C119179t tVar = C119157j.f356862d;
                C118952c cVar2 = f356273b;
                f356275d = ((C119157j) tVar).mo183884o(cVar2);
                cVar2.f356294o = true;
            }
            C31543z5.m39451a();
        }
    }

    /* renamed from: e */
    public static C118951a m167708e(C118952c.C118956d dVar, int i) {
        if (dVar == null) {
            return null;
        }
        C118951a aVar = new C118951a();
        aVar.f356276d = dVar.f356323e;
        aVar.f356277e = dVar.f356324f;
        aVar.f356278f = dVar.f356325g;
        aVar.f356279g = i;
        aVar.f356280h = dVar.f356322d;
        aVar.f356282j = dVar.f356327i;
        if (i == 1) {
            aVar.f356281i = dVar.f356326h;
        }
        return aVar;
    }
}
