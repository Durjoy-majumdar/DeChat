package p429c.p790t.p791m.sapp.p792c;

import android.content.Context;
import com.tencent.map.geolocation.sapp.TencentLocation;
import com.tencent.map.geolocation.sapp.TencentLocationListener;
import com.tencent.map.geolocation.sapp.TencentLocationManager;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: c.t.m.sapp.c.n */
public class C113231n implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public static final String f338814a = TencentLocation.class.getPackage().getName();

    /* renamed from: b */
    public static C113231n f338815b = null;

    /* renamed from: c */
    public Context f338816c;

    /* renamed from: d */
    public Thread.UncaughtExceptionHandler f338817d;

    /* renamed from: e */
    public volatile boolean f338818e = false;

    /* renamed from: f */
    public CountDownLatch f338819f;

    /* renamed from: c.t.m.sapp.c.n$a */
    public class C113232a extends Thread {

        /* renamed from: a */
        public String f338820a;

        public C113232a(String str) {
            this.f338820a = str;
        }

        public void run() {
            C113223e.m154939a(C113231n.this.f338816c).mo165757a(this.f338820a);
            C113231n.this.f338819f.countDown();
        }
    }

    public C113231n(Context context) {
        this.f338816c = context;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        if (mo165781a(th) && this.f338816c != null) {
            String b = mo165782b(th);
            if (!b.contains("onLocationChanged") && !b.contains("onStatusUpdate")) {
                C113233r.m155020d(this.f338816c, "__bad_dex_info___sapp", C113233r.f338825d);
                C113233r.m155008b(this.f338816c, "__loc_sdk_run_duration___sapp", Long.valueOf(System.currentTimeMillis() - C113233r.f338826e));
                String str = "EXP:" + C113233r.f338825d + "," + b;
                if (str.contains("\n")) {
                    str = str.replaceAll("\n", "\\$");
                }
                this.f338819f = new CountDownLatch(1);
                new C113232a(str).start();
                try {
                    this.f338819f.await(3000, TimeUnit.MILLISECONDS);
                } catch (InterruptedException unused) {
                }
                TencentLocationManager.getInstance(this.f338816c).removeUpdates((TencentLocationListener) null);
                return;
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f338817d;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    /* renamed from: a */
    public static C113231n m154982a(Context context) {
        if (f338815b == null) {
            synchronized (C113231n.class) {
                if (f338815b == null) {
                    f338815b = new C113231n(context);
                }
            }
        }
        return f338815b;
    }

    /* renamed from: b */
    public final String mo165782b(Throwable th) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
                cause.printStackTrace(printWriter);
            }
            printWriter.close();
            stringBuffer.append(stringWriter.toString());
        } catch (Throwable unused) {
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public final boolean mo165781a(Throwable th) {
        if (th == null) {
            return false;
        }
        while (th != null) {
            for (StackTraceElement fileName : th.getStackTrace()) {
                if ("TLSAPP".equals(fileName.getFileName())) {
                    return true;
                }
            }
            th = th.getCause();
        }
        return false;
    }

    /* renamed from: a */
    public void mo165780a() {
        if (!this.f338818e) {
            this.f338817d = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(f338815b);
            this.f338818e = true;
        }
    }
}
