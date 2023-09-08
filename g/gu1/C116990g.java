package gu1;

import b10.C104004c;
import gy3.C87412m;
import hu1.C87595b;
import hu1.C87596c;
import ju1.C117364a;
import kx3.C88326a;
import lx3.C88663a;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.embedding.engine.plugins.PluginRegistry;
import p172io.flutter.plugins.connectivity.patched.PatchedConnectivityPlugin;
import p172io.flutter.plugins.pathprovider.PathProviderPlugin;
import tf0.C118487h1;
import tf0.C118488i1;
import tf0.C118489k1;
import tf0.C22540j1;
import tf0.C64910f1;
import tf0.C64913l1;
import tf0.C90453g1;

/* renamed from: gu1.g */
public final class C116990g {

    /* renamed from: a */
    public static final C116990g f350564a = new C116990g();

    /* renamed from: a */
    public final void mo180958a(PluginRegistry pluginRegistry) {
        C87412m.m108594g(pluginRegistry, "plugins");
        pluginRegistry.add((FlutterPlugin) new PathProviderPlugin());
        pluginRegistry.add((FlutterPlugin) new PatchedConnectivityPlugin());
        pluginRegistry.add((FlutterPlugin) new C87595b());
        pluginRegistry.add((FlutterPlugin) new C87596c());
        pluginRegistry.add((FlutterPlugin) new C90453g1());
        pluginRegistry.add((FlutterPlugin) new C118487h1());
        pluginRegistry.add((FlutterPlugin) new C117364a());
        pluginRegistry.add((FlutterPlugin) new C64910f1());
        pluginRegistry.add((FlutterPlugin) new C22540j1());
        pluginRegistry.add((FlutterPlugin) new C118489k1());
        pluginRegistry.add((FlutterPlugin) new C118488i1());
        pluginRegistry.add((FlutterPlugin) new C88663a());
        pluginRegistry.add((FlutterPlugin) new C88326a());
        pluginRegistry.add((FlutterPlugin) new C104004c());
        pluginRegistry.add((FlutterPlugin) new C64913l1());
    }
}
