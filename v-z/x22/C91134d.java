package x22;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.location.model.LocationInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.xweb.WCWebUpdater;
import j20.C117292a;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import k20.C9556a;
import p781zt.C39449c;
import t22.C101715i;

/* renamed from: x22.d */
public class C91134d implements C39449c {

    /* renamed from: a */
    public Context f261352a;

    public C91134d(Context context) {
        this.f261352a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: a */
    public final Intent mo125194a(Context context, LocationInfo locationInfo, LocationInfo locationInfo2, boolean z) {
        Uri uri;
        String str;
        String str2;
        if (z || !locationInfo2.mo129348a()) {
            double[] a = C101715i.m133624a(new double[]{locationInfo.f271931f, locationInfo.f271930e});
            if (a.length < 2) {
                uri = Uri.parse(String.format("geo:%s,%s?z=%s", new Object[]{Double.valueOf(locationInfo.f271930e), Double.valueOf(locationInfo.f271931f), Integer.valueOf(locationInfo.f271932g)}));
            } else {
                uri = Uri.parse(String.format("geo:%s,%s?z=%s", new Object[]{Double.valueOf(a[1]), Double.valueOf(a[0]), Integer.valueOf(locationInfo.f271932g)}));
            }
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.setPackage("com.baidu.BaiduMap");
            return intent;
        }
        String c = mo125196c(context, locationInfo2);
        if (!Util.isNullOrNil(c)) {
            str = String.format("name:%s|latlng:%f,%f", new Object[]{c, Double.valueOf(locationInfo2.f271930e), Double.valueOf(locationInfo2.f271931f)});
        } else {
            str = String.format("%f,%f", new Object[]{Double.valueOf(locationInfo2.f271930e), Double.valueOf(locationInfo2.f271931f)});
        }
        String c2 = mo125196c(context, locationInfo);
        if (!Util.isNullOrNil(c2)) {
            str2 = String.format("name:%s|latlng:%f,%f", new Object[]{c2, Double.valueOf(locationInfo.f271930e), Double.valueOf(locationInfo.f271931f)});
        } else {
            str2 = String.format("%f,%f", new Object[]{Double.valueOf(locationInfo.f271930e), Double.valueOf(locationInfo.f271931f)});
        }
        String format = String.format("intent://map/direction?origin=%s&destination=%s&mode=recommend&coord_type=gcj02", new Object[]{str, str2});
        Log.m105918d("MicroMsg.MapHelper", "url " + format);
        try {
            String str3 = format + "&referer=tencent|weixin#Intent;scheme=bdapp;package=com.baidu.BaiduMap;end";
            Log.m105918d("MicroMsg.MapHelper", "all: " + str3);
            return Intent.getIntent(str3);
        } catch (URISyntaxException e) {
            Log.printErrStackTrace("MicroMsg.MapHelper", e, "", new Object[0]);
            return null;
        }
    }

    /* renamed from: b */
    public final Intent mo125195b(Context context, LocationInfo locationInfo, LocationInfo locationInfo2, boolean z, String str) {
        if (z || !locationInfo2.mo129348a()) {
            double[] a = C101715i.m133624a(new double[]{locationInfo.f271931f, locationInfo.f271930e});
            Intent intent = new Intent("android.intent.action.VIEW", a.length < 2 ? Uri.parse(String.format("geo:%s,%s?z=%s", new Object[]{Double.valueOf(locationInfo.f271930e), Double.valueOf(locationInfo.f271931f), Integer.valueOf(locationInfo.f271932g)})) : Uri.parse(String.format("geo:%s,%s?z=%s", new Object[]{Double.valueOf(a[1]), Double.valueOf(a[0]), Integer.valueOf(locationInfo.f271932g)})));
            intent.setPackage(str);
            return intent;
        }
        String format = String.format("wechatnav://type=nav&fromcoord=%f,%f&tocoord=%f,%f", new Object[]{Double.valueOf(locationInfo2.f271930e), Double.valueOf(locationInfo2.f271931f), Double.valueOf(locationInfo.f271930e), Double.valueOf(locationInfo.f271931f)});
        if (!Util.isNullOrNil(locationInfo2.f271933h) && (!Util.isNullOrNil(locationInfo.f271933h) || !Util.isNullOrNil(locationInfo.f271935j))) {
            StringBuilder sb = new StringBuilder();
            sb.append(format);
            Object[] objArr = new Object[2];
            objArr[0] = locationInfo2.f271933h;
            objArr[1] = !Util.isNullOrNil(locationInfo.f271935j) ? locationInfo.f271935j : locationInfo.f271933h;
            sb.append(String.format("&from=%s&to=%s", objArr));
            format = sb.toString();
        }
        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(format));
        intent2.setPackage(str);
        if (Util.isIntentAvailable(context, intent2, false)) {
            return intent2;
        }
        Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse("geo:" + locationInfo.f271930e + "," + locationInfo.f271931f));
        intent3.setPackage(str);
        return intent3;
    }

    /* renamed from: c */
    public final String mo125196c(Context context, LocationInfo locationInfo) {
        return (Util.isNullOrNil(locationInfo.f271935j) || locationInfo.f271935j.equals(context.getString(C0966R.string.gaw))) ? !Util.isNullOrNil(locationInfo.f271933h) ? locationInfo.f271933h : "" : locationInfo.f271935j;
    }

    /* renamed from: d */
    public final Intent mo125197d(Context context, LocationInfo locationInfo, LocationInfo locationInfo2, boolean z) {
        if (z || !locationInfo2.mo129348a()) {
            double[] a = C101715i.m133624a(new double[]{locationInfo.f271931f, locationInfo.f271930e});
            Intent intent = new Intent("android.intent.action.VIEW", a.length < 2 ? Uri.parse(String.format("geo:%s,%s?z=%s", new Object[]{Double.valueOf(locationInfo.f271930e), Double.valueOf(locationInfo.f271931f), Integer.valueOf(locationInfo.f271932g)})) : Uri.parse(String.format("geo:%s,%s?z=%s", new Object[]{Double.valueOf(a[1]), Double.valueOf(a[0]), Integer.valueOf(locationInfo.f271932g)})));
            intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
            return intent;
        }
        String str = Util.isNullOrNil(locationInfo.f271934i) ? "zh-cn" : locationInfo.f271934i;
        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(String.format("http://maps.google.com/maps?f=d&saddr=%f,%f&daddr=%f,%f&hl=" + str, new Object[]{Double.valueOf(locationInfo2.f271930e), Double.valueOf(locationInfo2.f271931f), Double.valueOf(locationInfo.f271930e), Double.valueOf(locationInfo.f271931f)})));
        intent2.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
        return intent2;
    }

    /* renamed from: e */
    public void mo125198e(LocationInfo locationInfo, LocationInfo locationInfo2, String str, boolean z) {
        PackageInfo c;
        LocationInfo locationInfo3 = locationInfo;
        LocationInfo locationInfo4 = locationInfo2;
        String str2 = str;
        if ("com.tencent.map".equals(str2)) {
            if (z) {
                C115669n.INSTANCE.mo160131h(11091, 4, 2);
            } else {
                C115669n.INSTANCE.mo160131h(11091, 4, 1);
            }
        } else if (z) {
            C115669n.INSTANCE.mo160131h(11091, 5, 2);
        } else {
            C115669n.INSTANCE.mo160131h(11091, 5, 1);
        }
        PackageManager packageManager = this.f261352a.getPackageManager();
        if ("com.google.android.apps.maps".equals(str2)) {
            Intent d = mo125197d(this.f261352a, locationInfo3, locationInfo4, false);
            if (!Util.isIntentAvailable(this.f261352a, d, false)) {
                d = mo125197d(this.f261352a, locationInfo3, locationInfo4, true);
            }
            C115669n.INSTANCE.mo160131h(10997, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, "", 0, 0);
            Context context = this.f261352a;
            C9556a aVar = new C9556a();
            aVar.mo10233c(d);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/location/ui/MapHelper", "startNavigationActivity", "(Lcom/tencent/mm/plugin/location/model/LocationInfo;Lcom/tencent/mm/plugin/location/model/LocationInfo;Ljava/lang/String;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/location/ui/MapHelper", "startNavigationActivity", "(Lcom/tencent/mm/plugin/location/model/LocationInfo;Lcom/tencent/mm/plugin/location/model/LocationInfo;Ljava/lang/String;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if ("com.baidu.BaiduMap".equals(str2)) {
            Intent a = mo125194a(this.f261352a, locationInfo3, locationInfo4, false);
            if (!Util.isIntentAvailable(this.f261352a, a, false)) {
                a = mo125194a(this.f261352a, locationInfo3, locationInfo4, true);
            }
            String charSequence = C101715i.m133626c(this.f261352a, "com.baidu.BaiduMap").applicationInfo.loadLabel(packageManager).toString();
            C115669n.INSTANCE.mo160131h(10997, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, charSequence, 0, 0);
            Context context3 = this.f261352a;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(a);
            Context context4 = context3;
            C117292a.m165358d(context4, aVar2.mo10232b(), "com/tencent/mm/plugin/location/ui/MapHelper", "startNavigationActivity", "(Lcom/tencent/mm/plugin/location/model/LocationInfo;Lcom/tencent/mm/plugin/location/model/LocationInfo;Ljava/lang/String;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context3.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(context4, "com/tencent/mm/plugin/location/ui/MapHelper", "startNavigationActivity", "(Lcom/tencent/mm/plugin/location/model/LocationInfo;Lcom/tencent/mm/plugin/location/model/LocationInfo;Ljava/lang/String;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if ("com.tencent.map".equals(str2)) {
            Intent f = mo125199f(this.f261352a, locationInfo3, locationInfo4, false);
            if (!Util.isIntentAvailable(this.f261352a, f, false)) {
                f = mo125199f(this.f261352a, locationInfo3, locationInfo4, true);
            }
            C115669n.INSTANCE.mo160131h(10997, "2", "", 0, 0);
            Context context5 = this.f261352a;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(f);
            Context context6 = context5;
            C117292a.m165358d(context6, aVar3.mo10232b(), "com/tencent/mm/plugin/location/ui/MapHelper", "startNavigationActivity", "(Lcom/tencent/mm/plugin/location/model/LocationInfo;Lcom/tencent/mm/plugin/location/model/LocationInfo;Ljava/lang/String;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context5.startActivity((Intent) aVar3.mo10231a(0));
            C117292a.m165359e(context6, "com/tencent/mm/plugin/location/ui/MapHelper", "startNavigationActivity", "(Lcom/tencent/mm/plugin/location/model/LocationInfo;Lcom/tencent/mm/plugin/location/model/LocationInfo;Ljava/lang/String;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if ("com.autonavi.minimap".equals(str2)) {
            PackageInfo c2 = C101715i.m133626c(this.f261352a, str2);
            if (c2 != null) {
                PackageInfo packageInfo = c2;
                Intent b = mo125195b(this.f261352a, locationInfo, locationInfo2, false, str);
                if (!Util.isIntentAvailable(this.f261352a, b, false)) {
                    b = mo125195b(this.f261352a, locationInfo, locationInfo2, true, str);
                }
                String charSequence2 = packageInfo.applicationInfo.loadLabel(packageManager).toString();
                C115669n.INSTANCE.mo160131h(10997, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, charSequence2, 0, 0);
                Context context7 = this.f261352a;
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(b);
                Context context8 = context7;
                C117292a.m165358d(context8, aVar4.mo10232b(), "com/tencent/mm/plugin/location/ui/MapHelper", "startNavigationActivity", "(Lcom/tencent/mm/plugin/location/model/LocationInfo;Lcom/tencent/mm/plugin/location/model/LocationInfo;Ljava/lang/String;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context7.startActivity((Intent) aVar4.mo10231a(0));
                C117292a.m165359e(context8, "com/tencent/mm/plugin/location/ui/MapHelper", "startNavigationActivity", "(Lcom/tencent/mm/plugin/location/model/LocationInfo;Lcom/tencent/mm/plugin/location/model/LocationInfo;Ljava/lang/String;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        } else if ("com.sogou.map.android.maps".equals(str2) && (c = C101715i.m133626c(this.f261352a, str2)) != null) {
            PackageInfo packageInfo2 = c;
            Intent g = mo125200g(this.f261352a, locationInfo, locationInfo2, false, str);
            if (!Util.isIntentAvailable(this.f261352a, g, false)) {
                g = mo125200g(this.f261352a, locationInfo, locationInfo2, true, str);
            }
            String charSequence3 = packageInfo2.applicationInfo.loadLabel(packageManager).toString();
            C115669n.INSTANCE.mo160131h(10997, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, charSequence3, 0, 0);
            Context context9 = this.f261352a;
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(g);
            Context context10 = context9;
            C117292a.m165358d(context10, aVar5.mo10232b(), "com/tencent/mm/plugin/location/ui/MapHelper", "startNavigationActivity", "(Lcom/tencent/mm/plugin/location/model/LocationInfo;Lcom/tencent/mm/plugin/location/model/LocationInfo;Ljava/lang/String;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context9.startActivity((Intent) aVar5.mo10231a(0));
            C117292a.m165359e(context10, "com/tencent/mm/plugin/location/ui/MapHelper", "startNavigationActivity", "(Lcom/tencent/mm/plugin/location/model/LocationInfo;Lcom/tencent/mm/plugin/location/model/LocationInfo;Ljava/lang/String;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: f */
    public final Intent mo125199f(Context context, LocationInfo locationInfo, LocationInfo locationInfo2, boolean z) {
        if (z || !locationInfo2.mo129348a()) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:" + locationInfo.f271930e + "," + locationInfo.f271931f + "?z=" + locationInfo.f271932g));
            intent.setPackage("com.tencent.map");
            return intent;
        }
        String str = locationInfo.f271938p;
        if (!Util.isNullOrNil(str) && locationInfo.f271938p.startsWith("qqmap_")) {
            str = locationInfo.f271938p.substring(6);
        }
        String format = String.format("qqmap://map/routeplan/type=drive&touid=%s&tocoord=%f,%f&from=%s&to=%s&referer=wx_client", new Object[]{str, Double.valueOf(locationInfo.f271930e), Double.valueOf(locationInfo.f271931f), URLEncoder.encode(mo125196c(context, locationInfo2)), URLEncoder.encode(mo125196c(context, locationInfo))});
        Log.m105919d("MicroMsg.MapHelper", "tencentluxian, url=%s", format);
        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(format));
        intent2.setPackage("com.tencent.map");
        if (Util.isIntentAvailable(context, intent2, false)) {
            return intent2;
        }
        Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse("geo:" + locationInfo.f271930e + "," + locationInfo.f271931f));
        intent3.setPackage("com.tencent.map");
        return intent3;
    }

    /* renamed from: g */
    public final Intent mo125200g(Context context, LocationInfo locationInfo, LocationInfo locationInfo2, boolean z, String str) {
        if (z || !locationInfo2.mo129348a()) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:" + locationInfo.f271930e + "," + locationInfo.f271931f + "?z=" + locationInfo.f271932g));
            intent.setPackage(str);
            return intent;
        }
        String format = String.format("wechatnav://type=nav&fromcoord=%f,%f&tocoord=%f,%f", new Object[]{Double.valueOf(locationInfo2.f271930e), Double.valueOf(locationInfo2.f271931f), Double.valueOf(locationInfo.f271930e), Double.valueOf(locationInfo.f271931f)});
        if (!Util.isNullOrNil(locationInfo2.f271933h) && !Util.isNullOrNil(locationInfo.f271933h)) {
            format = format + String.format("&from=%s&to=%s", new Object[]{locationInfo2.f271933h, locationInfo.f271933h});
        }
        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(format));
        intent2.setPackage(str);
        if (Util.isIntentAvailable(context, intent2, false)) {
            return intent2;
        }
        Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse("geo:" + locationInfo.f271930e + "," + locationInfo.f271931f));
        intent3.setPackage(str);
        return intent3;
    }
}
