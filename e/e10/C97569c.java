package e10;

import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import h10.C98298a;
import h10.C98301b;
import h10.C98304c;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.embedding.engine.plugins.PluginRegistry;

@C86522b
/* renamed from: e10.c */
public final class C97569c extends C86301e implements C97570e {
    /* renamed from: u */
    public void mo136835u(FlutterEngine flutterEngine) {
        C87412m.m108594g(flutterEngine, "engine");
        PluginRegistry plugins = flutterEngine.getPlugins();
        plugins.add((FlutterPlugin) new C98298a());
        plugins.add((FlutterPlugin) new C98301b());
        plugins.add((FlutterPlugin) new C98304c());
    }
}
