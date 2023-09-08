package yo2;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.ArrayMap;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.IXWebBroadcastListener;
import di3.C86312j;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Map;
import nd3.C88930e;
import p447aw.C103918d;
import rq2.C101428n;

/* renamed from: yo2.a */
public final class C102889a implements AdLandingPagesProxy.C94830p, C88930e {

    /* renamed from: a */
    public Reference<Context> f303699a;

    /* renamed from: b */
    public C102892c f303700b;

    /* renamed from: c */
    public MMHandler f303701c;

    /* renamed from: d */
    public volatile boolean f303702d;

    /* renamed from: e */
    public String f303703e;

    /* renamed from: f */
    public Runnable f303704f = new C102890a();

    /* renamed from: yo2.a$a */
    public class C102890a implements Runnable {
        public C102890a() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester$1");
            try {
                C102889a aVar = C102889a.this;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
                aVar.getClass();
                SnsMethodCalculate.markStartTimeMs("doCallbackForTimeout", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
                aVar.mo142609d(3, "get_location:timeout", 0.0d, 0.0d, 0.0d, 0.0d);
                SnsMethodCalculate.markEndTimeMs("doCallbackForTimeout", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
            } catch (Throwable unused) {
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester$1");
        }
    }

    /* renamed from: yo2.a$b */
    public class C102891b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f303706d;

        /* renamed from: e */
        public final /* synthetic */ String f303707e;

        /* renamed from: f */
        public final /* synthetic */ double f303708f;

        /* renamed from: g */
        public final /* synthetic */ double f303709g;

        /* renamed from: h */
        public final /* synthetic */ double f303710h;

        /* renamed from: i */
        public final /* synthetic */ double f303711i;

        public C102891b(int i, String str, double d, double d2, double d3, double d4) {
            this.f303706d = i;
            this.f303707e = str;
            this.f303708f = d;
            this.f303709g = d2;
            this.f303710h = d3;
            this.f303711i = d4;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester$2");
            try {
                C102889a aVar = C102889a.this;
                int i = this.f303706d;
                String str = this.f303707e;
                double d = this.f303708f;
                double d2 = this.f303709g;
                double d3 = this.f303710h;
                double d4 = this.f303711i;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
                aVar.mo142608c(i, str, d, d2, d3, d4);
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
            } catch (Throwable unused) {
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester$2");
        }
    }

    /* renamed from: yo2.a$c */
    public interface C102892c {
        /* renamed from: a */
        void mo124866a(Map<String, Object> map);
    }

    public C102889a(Context context, C102892c cVar) {
        this.f303699a = new WeakReference(context);
        this.f303701c = new MMHandler(Looper.getMainLooper());
        this.f303700b = cVar;
    }

    /* renamed from: a */
    public void mo10855a(Object obj) {
        Object obj2 = obj;
        SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
        if (obj2 instanceof Bundle) {
            try {
                Bundle bundle = (Bundle) obj2;
                bundle.setClassLoader(C102889a.class.getClassLoader());
                boolean z = IntentUtil.getBoolean(bundle, "result", false);
                double a = C101428n.m133107a(bundle, "latitude", 0.0d);
                double a2 = C101428n.m133107a(bundle, "longitude", 0.0d);
                double a3 = C101428n.m133107a(bundle, "accuracy", 0.0d);
                mo142609d(z ? 0 : 2, z ? "get_location:ok" : "get_location:failed", a, a2, C101428n.m133107a(bundle, TPReportKeys.Common.COMMON_NETWORK_SPEED, 0.0d), a3);
            } catch (Throwable unused) {
            }
        }
        SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
    }

    /* renamed from: b */
    public void mo10856b(int i, int i2, Object obj) {
        SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
        SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
    }

    /* renamed from: c */
    public final void mo142608c(int i, String str, double d, double d2, double d3, double d4) {
        SnsMethodCalculate.markStartTimeMs("doCallback", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("the doCallback is called, latitude = ");
            double d5 = d;
            sb.append(d);
            Log.m105918d("GeoClientRequester", sb.toString());
            if (!this.f303702d) {
                this.f303702d = true;
                if (this.f303700b != null) {
                    ArrayMap arrayMap = new ArrayMap();
                    arrayMap.put("ret", Integer.valueOf(i));
                    String str2 = str;
                    arrayMap.put("err_msg", str);
                    if (i == 0) {
                        arrayMap.put("latitude", Double.valueOf(d));
                        arrayMap.put("longitude", Double.valueOf(d2));
                        arrayMap.put(TPReportKeys.Common.COMMON_NETWORK_SPEED, Double.valueOf(d3));
                        arrayMap.put("accuracy", Double.valueOf(d4));
                    }
                    this.f303700b.mo124866a(arrayMap);
                }
                this.f303701c.removeCallbacks(this.f303704f);
            }
        } catch (Throwable unused) {
            Log.m105920e("GeoClientRequester", "the do Callback has something wrong");
        }
        SnsMethodCalculate.markEndTimeMs("doCallback", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
    }

    /* renamed from: d */
    public final void mo142609d(int i, String str, double d, double d2, double d3, double d4) {
        SnsMethodCalculate.markStartTimeMs("doCallbackInUIThread", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
        if (Looper.getMainLooper() == Looper.myLooper()) {
            mo142608c(i, str, d, d2, d3, d4);
        } else {
            MMHandler mMHandler = this.f303701c;
            C102891b bVar = r4;
            C102891b bVar2 = new C102891b(i, str, d, d2, d3, d4);
            mMHandler.post(bVar);
        }
        SnsMethodCalculate.markEndTimeMs("doCallbackInUIThread", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
    }

    /* renamed from: e */
    public final boolean mo142610e() {
        Class cls = C103918d.class;
        SnsMethodCalculate.markStartTimeMs("requestPermission", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
        Context context = this.f303699a.get();
        if (context == null) {
            SnsMethodCalculate.markEndTimeMs("requestPermission", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
            return false;
        } else if (!((C103918d) C86312j.m106911c(cls)).Lb0(context, "android.permission.ACCESS_FINE_LOCATION")) {
            ((C103918d) C86312j.m106911c(cls)).M70(1, this, new String[]{"android.permission.ACCESS_FINE_LOCATION"});
            SnsMethodCalculate.markEndTimeMs("requestPermission", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
            return false;
        } else {
            SnsMethodCalculate.markEndTimeMs("requestPermission", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
            return true;
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        SnsMethodCalculate.markStartTimeMs("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
        boolean z = true;
        if (i == 1) {
            if (iArr != null) {
                try {
                    int length = iArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (iArr[i2] != 0) {
                            z = false;
                            break;
                        } else {
                            i2++;
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            if (z) {
                String str = this.f303703e;
                SnsMethodCalculate.markStartTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
                if (str == null) {
                    str = "";
                }
                AdLandingPagesProxy.getInstance().geoLocation(str, this);
                SnsMethodCalculate.markEndTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
            } else {
                SnsMethodCalculate.markStartTimeMs("doCallbackWithoutPermission", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
                mo142609d(1, "get_location:no_permission", 0.0d, 0.0d, 0.0d, 0.0d);
                SnsMethodCalculate.markEndTimeMs("doCallbackWithoutPermission", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
            }
        }
        SnsMethodCalculate.markEndTimeMs("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
    }
}
