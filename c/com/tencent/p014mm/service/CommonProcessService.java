package com.tencent.p014mm.service;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.service.C116021b;
import eu3.C58834h;
import eu3.C97749e;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import jh3.C87963c;
import jh3.a$$a;
import jh3.a$$b;
import jh3.a$$c;
import jh3.a$$d;

/* renamed from: com.tencent.mm.service.CommonProcessService */
public class CommonProcessService extends Service {

    /* renamed from: g */
    public static ConcurrentHashMap<String, MMService> f347997g = new ConcurrentHashMap<>();

    /* renamed from: h */
    public static WeakReference<CommonProcessService> f347998h;

    /* renamed from: d */
    public Handler f347999d;

    /* renamed from: e */
    public Handler f348000e;

    /* renamed from: f */
    public C116021b.C116022a f348001f = new C116017a();

    /* renamed from: com.tencent.mm.service.CommonProcessService$a */
    public class C116017a extends C116021b.C116022a {
        public C116017a() {
        }

        /* renamed from: BE */
        public void mo176870BE(Intent intent) {
            if (intent != null) {
                CommonProcessService.m163135a(CommonProcessService.this, Boolean.valueOf(intent.getBooleanExtra("isTreadPool", false)), new a$$a(this, intent));
            } else {
                Log.m105924i(CommonProcessService.this.mo174289c(), "startService() intent == null");
            }
            C87963c.m109462a(7, 1, false);
        }

        /* renamed from: Ku */
        public void mo176871Ku(Intent intent) {
            if (intent != null) {
                CommonProcessService.m163135a(CommonProcessService.this, Boolean.valueOf(intent.getBooleanExtra("isTreadPool", false)), new a$$c(this, intent));
            } else {
                Log.m105924i(CommonProcessService.this.mo174289c(), "unbindService() intent == null");
            }
            C87963c.m109462a(53, 1, false);
        }

        /* renamed from: ND */
        public void mo176872ND(Intent intent, C116018a aVar) {
            if (intent != null) {
                CommonProcessService.m163135a(CommonProcessService.this, Boolean.valueOf(intent.getBooleanExtra("isTreadPool", false)), new a$$d(this, intent, aVar));
            } else {
                Log.m105924i(CommonProcessService.this.mo174289c(), "bindService() intent == null");
            }
            C87963c.m109462a(38, 1, false);
        }

        /* renamed from: Vr */
        public void mo176873Vr(Intent intent) {
            if (intent != null) {
                CommonProcessService.m163135a(CommonProcessService.this, Boolean.valueOf(intent.getBooleanExtra("isTreadPool", false)), new a$$b(this, intent));
            } else {
                Log.m105924i(CommonProcessService.this.mo174289c(), "stopService() intent == null");
            }
            C87963c.m109462a(23, 1, false);
        }
    }

    /* renamed from: a */
    public static void m163135a(CommonProcessService commonProcessService, Boolean bool, Runnable runnable) {
        commonProcessService.getClass();
        if (bool.booleanValue()) {
            commonProcessService.f348000e.post(runnable);
        } else {
            commonProcessService.f347999d.post(runnable);
        }
    }

    /* renamed from: b */
    public static MMService m163136b(CommonProcessService commonProcessService, String str) {
        commonProcessService.getClass();
        MMService mMService = f347997g.get(str);
        if (mMService != null) {
            return mMService;
        }
        MMService mMService2 = (MMService) Class.forName(str).newInstance();
        ConcurrentHashMap<String, MMService> concurrentHashMap = f347997g;
        mMService2.f249813e = concurrentHashMap;
        mMService2.f249814f = commonProcessService;
        concurrentHashMap.put(str, mMService2);
        return mMService2;
    }

    /* renamed from: c */
    public String mo174289c() {
        return "MicroMsg.MMProcessService";
    }

    public IBinder onBind(Intent intent) {
        Log.m105924i(mo174289c(), "onBind()");
        return this.f348001f;
    }

    public void onCreate() {
        Log.m105924i(mo174289c(), "onCreate()");
        System.currentTimeMillis();
        this.f347999d = new Handler();
        super.onCreate();
        f347998h = new WeakReference<>(this);
        int i = C58834h.f168432b;
        HandlerThread a = C97749e.m126093a("push-worker", 5);
        a.start();
        this.f348000e = new Handler(a.getLooper());
    }

    public void onDestroy() {
        Log.m105924i(mo174289c(), "onDestroy()");
        super.onDestroy();
    }

    public void onRebind(Intent intent) {
        Log.m105924i(mo174289c(), "onRebind()");
        super.onRebind(intent);
    }

    public void onStart(Intent intent, int i) {
        Log.m105924i(mo174289c(), "onStart()");
        super.onStart(intent, i);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        Log.m105924i(mo174289c(), "onStartCommand()");
        return 2;
    }

    public boolean onUnbind(Intent intent) {
        Log.m105924i(mo174289c(), "onUnbind()");
        return super.onUnbind(intent);
    }
}
