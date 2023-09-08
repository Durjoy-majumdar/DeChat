package i81;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import gy3.C8480h;
import java.util.HashMap;
import java.util.List;

/* renamed from: i81.g */
public final class C87679g {

    /* renamed from: a */
    public static final C87680a f253958a = new C87680a((C8480h) null);

    /* renamed from: b */
    public static final HashMap<String, List<Pair<String, String>>> f253959b = new HashMap<>();

    /* renamed from: c */
    public static final HashMap<String, List<Pair<String, String>>> f253960c = new HashMap<>();

    /* renamed from: d */
    public static final HashMap<String, List<Pair<String, String>>> f253961d = new HashMap<>();

    /* renamed from: e */
    public static final HashMap<String, List<Pair<String, String>>> f253962e = new HashMap<>();

    /* renamed from: i81.g$a */
    public static final class C87680a {
        public C87680a(C8480h hVar) {
        }

        /* renamed from: a */
        public static final boolean m109073a(C87680a aVar, Context context) {
            aVar.getClass();
            return Build.VERSION.SDK_INT < 29 || context.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0;
        }

        /* renamed from: b */
        public static final boolean m109074b(C87680a aVar, Context context) {
            aVar.getClass();
            return context.checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") == 0;
        }
    }
}
