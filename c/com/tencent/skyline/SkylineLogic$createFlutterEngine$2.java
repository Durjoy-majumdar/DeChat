package com.tencent.skyline;

import gy3.C87412m;
import java.util.HashMap;
import kotlin.Metadata;
import p172io.flutter.embedding.engine.FlutterEngine;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, mo182094d2 = {"com/tencent/skyline/SkylineLogic$createFlutterEngine$2", "Lio/flutter/embedding/engine/FlutterEngine$EngineLifecycleListener;", "Lrx3/b0;", "onPreEngineRestart", "onEngineWillDestroy", "skyline_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
public final class SkylineLogic$createFlutterEngine$2 implements FlutterEngine.EngineLifecycleListener {
    public final /* synthetic */ int $id;

    public SkylineLogic$createFlutterEngine$2(int i) {
        this.$id = i;
    }

    public void onEngineWillDestroy() {
        C87412m.m108600m("onEngineWillDestroy id:", Integer.valueOf(this.$id));
        HashMap access$getActiveEngines$p = SkylineLogic.activeEngines;
        C87412m.m108591d(access$getActiveEngines$p);
        FlutterEngineAddon flutterEngineAddon = (FlutterEngineAddon) access$getActiveEngines$p.remove(Integer.valueOf(this.$id));
        if (!SkylineLogic.INSTANCE.getSingleFlutterEngineGroup() && flutterEngineAddon != null) {
            SkylineConfig config = flutterEngineAddon.getConfig();
            if (config.getCreateRuntime()) {
                config.getRuntimePtr();
                SkylineLogic.flutterJNIs.remove(Long.valueOf(config.getRuntimePtr()));
            }
        }
    }

    public void onPreEngineRestart() {
    }
}
