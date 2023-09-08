package p979ia;

import android.content.Context;
import gy3.C87412m;
import java.util.HashSet;
import java.util.List;
import p1201na.C117618a;
import p1201na.C117619b;
import p172io.flutter.embedding.engine.FlutterShellArgs;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import tw3.C118552d;

/* renamed from: ia.b */
public final class C117147b {

    /* renamed from: a */
    public static C117148a f350980a;

    /* renamed from: b */
    public static Context f350981b;

    /* renamed from: c */
    public static String f350982c;

    /* renamed from: ia.b$a */
    public static final class C117148a {

        /* renamed from: a */
        public final Context f350983a;

        /* renamed from: b */
        public final String f350984b;

        /* renamed from: c */
        public FlutterShellArgs f350985c = new FlutterShellArgs(new String[0]);

        /* renamed from: d */
        public C118552d f350986d;

        /* renamed from: e */
        public HashSet<FlutterPlugin> f350987e;

        /* renamed from: f */
        public boolean f350988f;

        /* renamed from: g */
        public List<String> f350989g;

        public C117148a(Context context, String str) {
            C87412m.m108594g(context, "appContext");
            C87412m.m108594g(str, "dartEntryPoint");
            new C117618a();
            new C117619b();
            C118552d g = C118552d.m167207g();
            C87412m.m108593f(g, "getInstance()");
            this.f350986d = g;
            this.f350987e = new HashSet<>();
            this.f350983a = context;
            this.f350984b = str;
        }
    }
}
