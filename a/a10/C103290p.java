package a10;

import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;
import p172io.flutter.embedding.engine.dart.DartExecutor;
import p172io.flutter.plugin.common.BasicMessageChannel;
import p172io.flutter.plugin.common.StringCodec;

/* renamed from: a10.p */
public final class C103290p {

    /* renamed from: c */
    public static final C103291a f304558c = new C103291a((C8480h) null);

    /* renamed from: d */
    public static final HashMap<String, C103290p> f304559d = new HashMap<>();

    /* renamed from: a */
    public final BasicMessageChannel<String> f304560a;

    /* renamed from: b */
    public String f304561b = "";

    /* renamed from: a10.p$a */
    public static final class C103291a {
        public C103291a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C103290p mo143067a(String str) {
            C87412m.m108594g(str, "engineId");
            return C103290p.f304559d.get(str);
        }
    }

    public C103290p(DartExecutor dartExecutor) {
        C87412m.m108594g(dartExecutor, "dartExecutor");
        this.f304560a = new BasicMessageChannel<>(dartExecutor, "mmflutter/hybrid_nav_page_state", StringCodec.INSTANCE);
    }
}
