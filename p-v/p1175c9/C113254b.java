package p1175c9;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import p1189d9.C116604b;

/* renamed from: c9.b */
public class C113254b implements C113253a {

    /* renamed from: b */
    public static volatile C113253a f338863b;

    /* renamed from: a */
    public final AppMeasurement f338864a;

    public C113254b(AppMeasurement appMeasurement) {
        Preconditions.checkNotNull(appMeasurement);
        this.f338864a = appMeasurement;
        new ConcurrentHashMap();
    }

    public static C113253a getInstance(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (f338863b == null) {
            synchronized (C113253a.class) {
                if (f338863b == null) {
                    f338863b = new C113254b(AppMeasurement.getInstance(context));
                }
            }
        }
        return f338863b;
    }

    public void logEvent(String str, String str2, Bundle bundle) {
        boolean z;
        String str3;
        if (bundle == null) {
            bundle = new Bundle();
        }
        boolean z2 = true;
        if (!(!C116604b.f349663b.contains(str))) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Origin not allowed : ".concat(valueOf);
                return;
            }
            return;
        }
        if (!C116604b.f349662a.contains(str2)) {
            Iterator<String> it = C116604b.f349664c.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (bundle.containsKey(it.next())) {
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
        }
        if (z) {
            if ("_cmp".equals(str2)) {
                if (!C116604b.f349663b.contains(str)) {
                    Iterator<String> it4 = C116604b.f349664c.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            if (bundle.containsKey(it4.next())) {
                                break;
                            }
                        } else {
                            str.getClass();
                            if (str.equals(AppMeasurement.FCM_ORIGIN)) {
                                str3 = "fcm_integration";
                            } else if (str.equals("fdl")) {
                                str3 = "fdl_integration";
                            }
                            bundle.putString("_cis", str3);
                        }
                    }
                }
                z2 = false;
            }
            if (z2) {
                this.f338864a.logEventInternal(str, str2, bundle);
            }
        }
    }

    public void setUserProperty(String str, String str2, Object obj) {
        boolean z = true;
        if (!(!C116604b.f349663b.contains(str))) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Origin not allowed : ".concat(valueOf);
                return;
            }
            return;
        }
        if (!C116604b.f349665d.contains(str2)) {
            Iterator<String> it = C116604b.f349666e.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (str2.matches(it.next())) {
                        break;
                    }
                } else {
                    break;
                }
            }
        } else {
            z = false;
        }
        if (!z) {
            String valueOf2 = String.valueOf(str2);
            if (valueOf2.length() != 0) {
                "User Property not allowed : ".concat(valueOf2);
            }
        } else if ((!str2.equals("_ce1") && !str2.equals("_ce2")) || str.equals(AppMeasurement.FCM_ORIGIN) || str.equals("frc")) {
            this.f338864a.setUserPropertyInternal(str, str2, obj);
        } else if (str2.length() != 0) {
            "User Property not allowed for this origin: ".concat(str2);
        }
    }
}
