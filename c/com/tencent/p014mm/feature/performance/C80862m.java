package com.tencent.p014mm.feature.performance;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Pair;
import bp3.C79760s;
import com.tencent.matrix.mallctl.MallCtl;
import com.tencent.p014mm.matrix.C80980b;
import com.tencent.p014mm.matrix.C80981c;
import com.tencent.p014mm.matrix.report.DynamicMatrixReportBroadcast;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import hm3.C32954b;
import i20.C21043a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p206nj.C76862i;
import p269xe.C91177a;
import p448ax.C28153b;
import p757xv.C91351p;
import p970gg.C87186a;

@C86522b(dependencies = {C28153b.class})
/* renamed from: com.tencent.mm.feature.performance.m */
public class C80862m extends C86301e implements C91351p {
    /* renamed from: iK */
    public boolean mo112621iK() {
        return C80981c.m98873c();
    }

    public void onCreate(Context context) {
        if (MMApplicationContext.isMainProcess()) {
            C79760s.m96908a("DynamicMatrixReportBroadcast.register");
            DynamicMatrixReportBroadcast dynamicMatrixReportBroadcast = DynamicMatrixReportBroadcast.f237878a;
            synchronized (DynamicMatrixReportBroadcast.class) {
                if (DynamicMatrixReportBroadcast.f237878a == null) {
                    DynamicMatrixReportBroadcast.f237878a = new DynamicMatrixReportBroadcast();
                    MMApplicationContext.getContext().registerReceiver(DynamicMatrixReportBroadcast.f237878a, new IntentFilter("action.matrix.deprecated-report"));
                }
            }
            C79760s.m96909b();
        }
        C79760s.m96908a("AmsInvokeListener.monitor()");
        Runnable runnable = C91177a.f261415a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Pair.create("requestLocationUpdates", "(Ljava/lang/String;JFLandroid/location/LocationListener;)V"));
        arrayList.add(Pair.create("requestLocationUpdates", "(Ljava/lang/String;JFLandroid/location/LocationListener;Landroid/os/Looper;)V"));
        arrayList.add(Pair.create("requestLocationUpdates", "(Ljava/lang/String;JFLandroid/app/PendingIntent;)V"));
        arrayList.add(Pair.create("requestLocationUpdates", "(JFLandroid/location/Criteria;Landroid/app/PendingIntent;)V"));
        arrayList.add(Pair.create("requestLocationUpdates", "(JFLandroid/location/Criteria;Landroid/location/LocationListener;Landroid/os/Looper;)V"));
        Map<String, List<Pair<String, String>>> map = C91177a.f261416b;
        ((HashMap) map).put("android/location/LocationManager", arrayList);
        C21043a.m23197h().mo32756j(map, C91177a.f261417c);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Pair.create("newWakeLock", "(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;"));
        arrayList2.add(Pair.create("acquire", "()V"));
        arrayList2.add(Pair.create("acquire", "(J)V"));
        arrayList2.add(Pair.create("release", "()V"));
        arrayList2.add(Pair.create("release", "(I)V"));
        Map<String, List<Pair<String, String>>> map2 = C91177a.f261419e;
        ((HashMap) map2).put("android/os/PowerManager$WakeLock", arrayList2);
        C21043a.m23197h().mo32756j(map2, C91177a.f261420f);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(Pair.create("set", "(IJLandroid/app/PendingIntent;)V"));
        arrayList3.add(Pair.create("setWindow", "(IJJLandroid/app/PendingIntent;)V"));
        arrayList3.add(Pair.create("setRepeating", "(IJJLandroid/app/PendingIntent;)V"));
        arrayList3.add(Pair.create("cancel", "(Landroid/app/PendingIntent;)V"));
        arrayList3.add(Pair.create("cancel", "(Landroid/app/AlarmManager$OnAlarmListener;)V"));
        Map<String, List<Pair<String, String>>> map3 = C91177a.f261421g;
        ((HashMap) map3).put("android/app/AlarmManager", arrayList3);
        C21043a.m23197h().mo32756j(map3, C91177a.f261422h);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(Pair.create("playSoundEffect", "(I)V"));
        arrayList4.add(Pair.create("playSoundEffect", "(IF)V"));
        arrayList4.add(Pair.create("startBluetoothSco", "()V"));
        arrayList4.add(Pair.create("stopBluetoothSco", "()V"));
        Map<String, List<Pair<String, String>>> map4 = C91177a.f261423i;
        ((HashMap) map4).put("android/media/AudioManager", arrayList4);
        C21043a.m23197h().mo32756j(map4, C91177a.f261424j);
        C79760s.m96909b();
        C79760s.m96908a("MatrixBoot.onBoot()");
        C80980b.m98870a((Application) MMApplicationContext.getContext(), C80981c.INSTANCE);
        C79760s.m96909b();
        C79760s.m96908a("BaseHalfScreenWarningHelper.init()");
        Context applicationContext = MMApplicationContext.getContext().getApplicationContext();
        C87412m.m108592e(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new C32954b());
        C79760s.m96909b();
        if (C87186a.f252847a == null) {
            C87186a.f252847a = new C80860a();
        }
        if (!BuildInfo.IS_ARM64 && Build.VERSION.SDK_INT >= 30 && C76862i.m92661a("xperf")) {
            if (MMApplicationContext.isMainProcess() || MMApplicationContext.isToolsProcess() || MMApplicationContext.isAppBrandProcess()) {
                Log.m105925i("MicroMsg.MatrixService", "origin retain = %s", Boolean.valueOf(MallCtl.m98069b(true)));
                Log.m105925i("MicroMsg.MatrixService", "now retain = %s", Boolean.valueOf(MallCtl.m98069b(true)));
            }
        }
    }
}
