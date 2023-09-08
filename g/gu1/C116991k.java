package gu1;

import com.tencent.p014mm.plugin.flutter.base.CachedFlutterEngines;
import p172io.flutter.embedding.engine.FlutterEngine;

/* renamed from: gu1.k */
public final class C116991k implements FlutterEngine.EngineLifecycleListener {

    /* renamed from: a */
    public final /* synthetic */ String f350565a;

    public C116991k(String str) {
        this.f350565a = str;
    }

    public void onEngineWillDestroy() {
        CachedFlutterEngines.m162296b(CachedFlutterEngines.f346097a, this.f350565a);
    }

    public void onPreEngineRestart() {
    }
}
