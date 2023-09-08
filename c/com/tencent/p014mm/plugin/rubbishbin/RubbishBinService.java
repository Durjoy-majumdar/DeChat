package com.tencent.p014mm.plugin.rubbishbin;

import a70.C79471a;
import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import qk2.C63280b;
import qk2.C89697a;

/* renamed from: com.tencent.mm.plugin.rubbishbin.RubbishBinService */
public abstract class RubbishBinService extends Service implements Runnable {

    /* renamed from: d */
    public C63280b f248881d = null;

    /* renamed from: e */
    public Thread f248882e;

    /* renamed from: f */
    public IBinder f248883f = null;

    /* renamed from: g */
    public int f248884g = 1000;

    /* renamed from: h */
    public int f248885h = 0;

    /* renamed from: i */
    public int f248886i = 1;

    /* renamed from: j */
    public String f248887j = null;

    /* renamed from: com.tencent.mm.plugin.rubbishbin.RubbishBinService$a */
    public class C85408a extends C89697a {
        public C85408a() {
        }
    }

    /* renamed from: a */
    public abstract void mo118737a(String str);

    public IBinder onBind(Intent intent) {
        C85408a aVar = new C85408a();
        this.f248883f = aVar;
        return aVar;
    }

    public void onCreate() {
        super.onCreate();
        if (this.f248881d == null) {
            this.f248881d = new C63280b(this);
        }
        Thread.setDefaultUncaughtExceptionHandler(this.f248881d);
        this.f248882e = new Thread(this);
        JNIExceptionHandlerImpl.initJNIExceptionHandler(this, this.f248887j);
        JNIExceptionHandler.init();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            this.f248885h = intent.getIntExtra("exec_time", 0);
            this.f248884g = intent.getIntExtra("interval", -1);
            this.f248887j = intent.getStringExtra("exec_tag");
        }
        if (this.f248887j == null) {
            this.f248887j = "Default";
        }
        this.f248882e.setName("rubbish_executor");
        JNIExceptionHandler.INSTANCE.setReportExecutionTag(this.f248887j);
        int i3 = this.f248885h;
        if (i3 == -1 || i3 == 0) {
            this.f248886i = i3;
        } else {
            this.f248886i = 1;
        }
        if (this.f248884g == -1) {
            stopSelf();
            return super.onStartCommand(intent, i, i2);
        }
        if (!this.f248882e.isAlive()) {
            Thread thread = new Thread(this);
            this.f248882e = thread;
            thread.setName("rubbish_executor");
            this.f248882e.start();
        }
        return super.onStartCommand(intent, i, i2);
    }

    public void run() {
        SharedPreferences sharedPreferences = getSharedPreferences("system_config_prefs", 4);
        String format = new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime());
        sharedPreferences.edit().putInt("RubbishCount", this.f248885h).apply();
        sharedPreferences.edit().putString("RubbishTag", this.f248887j).apply();
        int i = sharedPreferences.getInt("RubbishCount", this.f248885h);
        this.f248885h = i;
        Log.m105925i("RubbishBinService", "[sunny]dt:%s,cnt:%d,t:%s", format, Integer.valueOf(i), this.f248887j);
        while (true) {
            if (this.f248886i != 0) {
                this.f248885h--;
                sharedPreferences.edit().putInt("RubbishCount", this.f248885h).apply();
                Log.m105924i("RubbishBinService", "e!");
                mo118737a(this.f248887j);
                C115669n.INSTANCE.mo160131h(17910, C79471a.f233015c, BuildInfo.CLIENT_VERSION, this.f248887j, 1, "", 0, 0, 0, Long.valueOf(System.nanoTime()));
                if (this.f248885h == 0 && this.f248886i != -1) {
                    break;
                }
                try {
                    Thread.sleep((long) this.f248884g);
                } catch (InterruptedException unused) {
                }
            } else {
                stopSelf();
                break;
            }
        }
        stopSelf();
    }
}
