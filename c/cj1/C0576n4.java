package cj1;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import gy3.C8480h;
import java.util.concurrent.ConcurrentHashMap;
import te3.C64809wp2;

/* renamed from: cj1.n4 */
public final class C0576n4 {

    /* renamed from: b */
    public static final C0577a f1379b = new C0577a((C8480h) null);

    /* renamed from: c */
    public static final ConcurrentHashMap<String, C0576n4> f1380c = new ConcurrentHashMap<>();

    /* renamed from: a */
    public C64809wp2 f1381a;

    /* renamed from: cj1.n4$a */
    public static final class C0577a {
        public C0577a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C0576n4 mo598a(Intent intent) {
            if (intent == null) {
                return null;
            }
            String stringExtra = intent.getStringExtra("KEY_PARAMS_CONFIG_SCROLL_SQAURE_KEY");
            if (stringExtra == null) {
                stringExtra = "";
            }
            C0577a aVar = C0576n4.f1379b;
            Log.printInfoStack("Finder.FinderLiveScrollSquareBundle", "getFromIntent " + intent.hashCode() + ", key:" + stringExtra, new Object[0]);
            return C0576n4.f1380c.get(stringExtra);
        }

        /* renamed from: b */
        public final void mo599b(Intent intent, C0576n4 n4Var) {
            if (intent != null && n4Var != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(C31543z5.m39453c());
                sb.append('_');
                sb.append(n4Var.hashCode());
                String sb4 = sb.toString();
                C0576n4.f1380c.put(sb4, n4Var);
                intent.putExtra("KEY_PARAMS_CONFIG_SCROLL_SQAURE_KEY", sb4);
                Log.printInfoStack("Finder.FinderLiveScrollSquareBundle", "saveToIntent " + intent.hashCode() + ", " + n4Var.hashCode() + ", key:" + sb4, new Object[0]);
            }
        }

        /* renamed from: c */
        public final void mo600c(Intent intent) {
            C0576n4 n4Var = new C0576n4();
            C64809wp2 wp22 = new C64809wp2();
            wp22.f186152d = true;
            wp22.f186153e = true;
            n4Var.f1381a = wp22;
            mo599b(intent, n4Var);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("isDisableScrollSquare: ");
        C64809wp2 wp22 = this.f1381a;
        Boolean bool = null;
        sb.append(wp22 != null ? Boolean.valueOf(wp22.f186152d) : null);
        sb.append(" isDisableLaunchScrollSquare: ");
        C64809wp2 wp23 = this.f1381a;
        sb.append(wp23 != null ? Boolean.valueOf(wp23.f186153e) : null);
        sb.append(" isDisableFluentExit: ");
        C64809wp2 wp24 = this.f1381a;
        if (wp24 != null) {
            bool = Boolean.valueOf(wp24.f186154f);
        }
        sb.append(bool);
        return sb.toString();
    }
}
