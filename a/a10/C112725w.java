package a10;

import gy3.C87412m;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.embedding.engine.dart.DartExecutor;
import p172io.flutter.plugin.common.BasicMessageChannel;
import p172io.flutter.plugin.common.StringCodec;

/* renamed from: a10.w */
public final class C112725w {

    /* renamed from: a */
    public final String f337500a;

    /* renamed from: b */
    public final FlutterEngine f337501b;

    /* renamed from: c */
    public long f337502c;

    /* renamed from: d */
    public long f337503d;

    public C112725w(String str, FlutterEngine flutterEngine) {
        C87412m.m108594g(str, "engineKey");
        C87412m.m108594g(flutterEngine, "engine");
        this.f337500a = str;
        this.f337501b = flutterEngine;
        DartExecutor dartExecutor = flutterEngine.getDartExecutor();
        C87412m.m108593f(dartExecutor, "engine.dartExecutor");
        new BasicMessageChannel(dartExecutor, "mmflutter/app_foreground_state", StringCodec.INSTANCE);
    }
}
