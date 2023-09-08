package d41;

import android.app.Activity;
import c41.C79932a;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import h81.C32735h;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import k31.C117373a;
import ma1.C117543a;
import o41.C117709a;
import sx3.C110823p;
import u24.C90599h;
import z04.C112550d0;

/* renamed from: d41.a */
public final class C116570a extends C79932a {

    /* renamed from: d */
    public static final C116570a f349583d = new C116570a();

    /* renamed from: e */
    public static int f349584e = 2;

    /* renamed from: f */
    public static List<String> f349585f;

    /* renamed from: g */
    public static final C117709a<Activity> f349586g = new C117709a<>();

    /* renamed from: h */
    public static final List<C116571a> f349587h = new ArrayList();

    /* renamed from: i */
    public static C116572b f349588i = new C116572b();

    /* renamed from: d41.a$a */
    public interface C116571a {
        /* renamed from: F */
        void mo175186F(long j);

        /* renamed from: G */
        void mo175188G(long j);
    }

    /* renamed from: d41.a$b */
    public static final class C116572b extends C114668z.C104589a {
        public void onAppBackground(String str) {
            if (C116570a.f349584e == 2 && C117373a.xx0().Ex0()) {
                Log.m105924i("Amoeba.AppEventMonitor", "[onAppBackground]");
                C116570a.f349583d.mo180552F(System.currentTimeMillis());
            }
        }

        public void onAppForeground(String str) {
            if (C116570a.f349584e == 2 && C117373a.xx0().Ex0()) {
                Log.m105924i("Amoeba.AppEventMonitor", "[onAppForeground]");
                C116570a.f349583d.mo180553G(System.currentTimeMillis());
            }
        }
    }

    /* renamed from: F */
    public final void mo180552F(long j) {
        Log.m105924i("Amoeba.AppEventMonitor", "[appOut] time : " + new SimpleDateFormat(TimeUtil.YYYY2MM2DD_HH1MM1SS).format(new Date(j)));
        Iterator it = ((ArrayList) f349587h).iterator();
        while (it.hasNext()) {
            ((C116571a) it.next()).mo175186F(j);
        }
    }

    /* renamed from: G */
    public final void mo180553G(long j) {
        Log.m105924i("Amoeba.AppEventMonitor", "[appIn] time : " + new SimpleDateFormat(TimeUtil.YYYY2MM2DD_HH1MM1SS).format(new Date(j)));
        Iterator it = ((ArrayList) f349587h).iterator();
        while (it.hasNext()) {
            ((C116571a) it.next()).mo175188G(j);
        }
    }

    /* renamed from: M */
    public final MultiProcessMMKV mo180554M() {
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("mmkv_key_app_event_monitor");
        C87412m.m108593f(mmkv, "getMMKV(MMKV_KEY_APP_EVENT_MONITOR)");
        return mmkv;
    }

    /* renamed from: N */
    public final boolean mo180555N(Activity activity) {
        if (activity == null) {
            return false;
        }
        if (f349585f == null) {
            f349585f = new ArrayList();
            String Y60 = C117543a.Cx0().Y60(C32735h.C32738b.clicfg_data_report_app_event_filter_activity, "WeChatSplashActivity");
            if (!C90599h.m113511d(Y60)) {
                C87412m.m108593f(Y60, "filterActivity");
                Object[] array = C112550d0.m153785U(Y60, new String[]{"|"}, false, 0, 6, (Object) null).toArray(new String[0]);
                C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                for (String add : (String[]) array) {
                    List<String> list = f349585f;
                    C87412m.m108591d(list);
                    list.add(add);
                }
            }
        }
        List<String> list2 = f349585f;
        C87412m.m108591d(list2);
        return list2.contains(activity.getClass().getSimpleName());
    }

    /* renamed from: k */
    public void mo32651k(String str, int i, long j) {
        if (f349584e == 1 && C117373a.xx0().Ex0()) {
            Log.m105924i("Amoeba.AppEventMonitor", "[onHellFrontToBack]");
            mo180552F(j);
        }
    }

    public void onActivityStarted(Activity activity) {
        boolean z;
        Activity activity2 = activity;
        C87412m.m108594g(activity2, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (!mo180555N(activity)) {
            StringBuilder sb = new StringBuilder();
            sb.append("[onActivityStarted] activity : ");
            sb.append(activity.getClass().getSimpleName());
            sb.append(", mStartedActivities : ");
            C117709a<Activity> aVar = f349586g;
            sb.append(aVar.size());
            Log.m105924i("Amoeba.AppEventMonitor", sb.toString());
            long currentTimeMillis = System.currentTimeMillis();
            aVar.add(activity2);
            String str = "";
            String string = mo180554M().getString("mmkv_key_op_app_inout_time", str);
            String str2 = string == null ? str : string;
            boolean z2 = true;
            if (str2.length() == 0) {
                z = true;
            } else {
                Object[] array = C112550d0.m153785U(str2, new String[]{";"}, false, 0, 6, (Object) null).toArray(new String[0]);
                C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                z = C112550d0.m153803w((CharSequence) C110823p.m150989O(array), ",", false, 2, (Object) null);
            }
            if (MMApplicationContext.isMainProcess()) {
                String string2 = mo180554M().getString("mmkv_key_op_app_inout_time", str);
                String str3 = string2 == null ? str : string2;
                mo180554M().putString("mmkv_key_op_app_inout_time", str);
                if (!C90599h.m113511d(str3)) {
                    try {
                        Object[] array2 = C112550d0.m153785U(str3, new String[]{";"}, false, 0, 6, (Object) null).toArray(new String[0]);
                        C87412m.m108592e(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        for (String str4 : (String[]) array2) {
                            if (!C90599h.m113511d(str4)) {
                                Object[] array3 = C112550d0.m153785U(str4, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]);
                                C87412m.m108592e(array3, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                                String[] strArr = (String[]) array3;
                                if (!(strArr.length == 0)) {
                                    long parseLong = Long.parseLong(strArr[0]);
                                    if (f349584e == 0 && C117373a.xx0().Ex0()) {
                                        mo180552F(parseLong);
                                    }
                                }
                                if (strArr.length > 1) {
                                    long parseLong2 = Long.parseLong(strArr[1]);
                                    if (f349584e == 0 && C117373a.xx0().Ex0()) {
                                        mo180553G(parseLong2);
                                    }
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            if (MMApplicationContext.isMainProcess()) {
                if (f349586g.size() == 1 && ((!mo180554M().getBoolean("mmkv_key_is_op_sa", false) || !z) && f349584e == 0 && C117373a.xx0().Ex0())) {
                    mo180553G(currentTimeMillis);
                }
            } else if (f349586g.size() == 1 && !mo180554M().getBoolean("mmkv_key_is_mp_sa", false) && !MMApplicationContext.isMainProcess()) {
                String string3 = mo180554M().getString("mmkv_key_op_app_inout_time", str);
                if (string3 != null) {
                    str = string3;
                }
                mo180554M().putString("mmkv_key_op_app_inout_time", str + ',' + currentTimeMillis);
            }
            if (!MMApplicationContext.isMainProcess()) {
                mo180554M().putBoolean("mmkv_key_is_op_sa", f349586g.size() > 0);
            } else {
                mo180554M().putBoolean("mmkv_key_is_op_sa", false);
            }
            if (MMApplicationContext.isMainProcess()) {
                MultiProcessMMKV M = mo180554M();
                if (f349586g.size() <= 0) {
                    z2 = false;
                }
                M.putBoolean("mmkv_key_is_mp_sa", z2);
            }
        }
    }

    public void onActivityStopped(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (!mo180555N(activity)) {
            StringBuilder sb = new StringBuilder();
            sb.append("[onActivityStopped] activity : ");
            sb.append(activity.getClass().getSimpleName());
            sb.append(", mStartedActivities : ");
            C117709a<Activity> aVar = f349586g;
            sb.append(aVar.size());
            Log.m105924i("Amoeba.AppEventMonitor", sb.toString());
            long currentTimeMillis = System.currentTimeMillis();
            aVar.mo182402h(activity);
            boolean z = false;
            if (MMApplicationContext.isMainProcess()) {
                if (aVar.size() == 0 && !mo180554M().getBoolean("mmkv_key_is_op_sa", false) && f349584e == 0 && C117373a.xx0().Ex0()) {
                    mo180552F(currentTimeMillis);
                }
            } else if (aVar.size() == 0 && !mo180554M().getBoolean("mmkv_key_is_mp_sa", false) && !MMApplicationContext.isMainProcess()) {
                String str = "";
                String string = mo180554M().getString("mmkv_key_op_app_inout_time", str);
                if (string != null) {
                    str = string;
                }
                MultiProcessMMKV M = mo180554M();
                M.putString("mmkv_key_op_app_inout_time", str + ';' + currentTimeMillis);
            }
            if (MMApplicationContext.isMainProcess()) {
                MultiProcessMMKV M2 = mo180554M();
                if (aVar.size() > 0) {
                    z = true;
                }
                M2.putBoolean("mmkv_key_is_mp_sa", z);
            }
        }
    }

    /* renamed from: s */
    public void mo32657s(String str, int i, long j) {
        if (f349584e == 1 && C117373a.xx0().Ex0()) {
            Log.m105924i("Amoeba.AppEventMonitor", "[onHellBackToFront]");
            mo180553G(j);
        }
    }
}
