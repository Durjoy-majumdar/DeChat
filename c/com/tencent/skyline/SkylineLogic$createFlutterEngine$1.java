package com.tencent.skyline;

import gy3.C87412m;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.Metadata;
import p172io.flutter.embedding.engine.EngineDataReportListener;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/skyline/SkylineLogic$createFlutterEngine$1", "Lio/flutter/embedding/engine/EngineDataReportListener;", "", "json", "Lrx3/b0;", "onReportJSON", "skyline_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
public final class SkylineLogic$createFlutterEngine$1 implements EngineDataReportListener {
    public void onReportJSON(byte[] bArr) {
        C87412m.m108591d(bArr);
        Charset charset = StandardCharsets.UTF_8;
        C87412m.m108593f(charset, "UTF_8");
        C87412m.m108600m("onReportJSON: ", new String(bArr, charset));
    }
}
