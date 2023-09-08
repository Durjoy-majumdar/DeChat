package cc0;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Pair;
import com.tencent.map.geolocation.sapp.TencentLocation;
import com.tencent.map.geolocation.sapp.TencentLocationListener;
import com.tencent.map.geolocation.sapp.TencentLocationManager;
import com.tencent.map.geolocation.sapp.TencentLocationManagerOptions;
import com.tencent.map.geolocation.sapp.TencentLocationRequest;
import com.tencent.map.geolocation.sapp.internal.LocationLogCallback;
import com.tencent.map.geolocation.sapp.internal.TencentExtraKeys;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import eu3.C58834h;
import eu3.C97749e;
import f40.C86709a0;
import nd3.C88929c;
import p156gj.C87203t;

/* renamed from: cc0.i */
public class C113278i {

    /* renamed from: b */
    public static C113278i f338931b;

    /* renamed from: c */
    public static Context f338932c;

    /* renamed from: d */
    public static Boolean f338933d;

    /* renamed from: a */
    public MMHandler f338934a;

    /* renamed from: cc0.i$a */
    public class C113279a implements LocationLogCallback {
        public C113279a(C113278i iVar) {
        }

        public void onLog(int i, String str, String str2, Throwable th) {
            if (i == 2) {
                Log.m105927v("MicroMsg.SLocationManager", "tag:%s msg:%s", str, str2);
            } else if (i == 3) {
                Log.m105919d("MicroMsg.SLocationManager", "tag:%s msg:%s", str, str2);
            } else if (i == 4) {
                Log.m105925i("MicroMsg.SLocationManager", "tag:%s msg:%s", str, str2);
            } else if (i == 5) {
                Log.m105929w("MicroMsg.SLocationManager", "tag:%s msg:%s", str, str2);
            } else if (i == 6) {
                Object[] objArr = new Object[3];
                objArr[0] = str;
                objArr[1] = str2;
                objArr[2] = th != null ? th.getMessage() : "";
                Log.m105921e("MicroMsg.SLocationManager", "tag:%s msg:%s th:%s", objArr);
            }
        }
    }

    /* renamed from: cc0.i$b */
    public class C113280b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f338935d;

        /* renamed from: e */
        public final /* synthetic */ TencentLocationListener f338936e;

        /* renamed from: f */
        public final /* synthetic */ int f338937f;

        /* renamed from: g */
        public final /* synthetic */ Looper f338938g;

        public C113280b(Context context, TencentLocationListener tencentLocationListener, int i, Looper looper) {
            this.f338935d = context;
            this.f338936e = tencentLocationListener;
            this.f338937f = i;
            this.f338938g = looper;
        }

        public void run() {
            boolean z;
            if (!C88929c.m111021e(this.f338935d, "android.permission.ACCESS_FINE_LOCATION")) {
                Log.m105928w("MicroMsg.SLocationManager", "no location permission, just return.");
                this.f338936e.onLocationChanged((TencentLocation) null, -1, (String) null);
                return;
            }
            Log.m105919d("MicroMsg.SLocationManager", "requestLocationUpdate %s, isLoaded %b", Integer.valueOf(this.f338937f), Boolean.valueOf(TencentLocationManagerOptions.isLoadLibraryEnabled()));
            C115669n.INSTANCE.idkeyStat(584, 0, 1, true);
            TencentLocationManager.getInstance(C113278i.f338932c, new Pair(TencentLocationManager.TYPE_OAID, "")).setCoordinateType(this.f338937f);
            TencentLocationRequest create = TencentLocationRequest.create();
            C113278i.this.getClass();
            Boolean bool = C113278i.f338933d;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                Boolean valueOf = Boolean.valueOf(!"CN".equalsIgnoreCase(Util.nullAs((String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null), "CN")));
                C113278i.f338933d = valueOf;
                Log.m105925i("MicroMsg.SLocationManager", "isOverseasUser: %b", valueOf);
                z = C113278i.f338933d.booleanValue();
            }
            if (z) {
                create.setLocationDomainMode(1);
            } else {
                create.setLocationDomainMode(0);
            }
            create.setInterval(2000);
            create.setAndroidId(C87203t.m108266b());
            Log.m105925i("MicroMsg.SLocationManager", "requestCode %d", Integer.valueOf(TencentLocationManager.getInstance(C113278i.f338932c, new Pair(TencentLocationManager.TYPE_OAID, "")).requestLocationUpdates(create, this.f338936e, this.f338938g)));
        }
    }

    public C113278i() {
        int i = C58834h.f168432b;
        HandlerThread a = C97749e.m126093a("SLocationManager", 5);
        a.start();
        this.f338934a = new MMHandler(a.getLooper());
        TencentExtraKeys.setContext(MMApplicationContext.getContext());
        try {
            TencentExtraKeys.setTencentLogCallback(new C113279a(this));
        } catch (Exception e) {
            Log.printInfoStack("MicroMsg.SLocationManager", "", e);
        }
    }

    /* renamed from: a */
    public void mo165823a(TencentLocationListener tencentLocationListener, Context context, int i, Looper looper) {
        this.f338934a.post(new C113280b(context, tencentLocationListener, i, looper));
    }
}
