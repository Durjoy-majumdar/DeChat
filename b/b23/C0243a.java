package b23;

import android.util.Size;
import com.tencent.tavkit.component.TAVExporter;
import com.tencent.tavkit.component.TAVPlayer;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: b23.a */
public final class C0243a {

    /* renamed from: a */
    public static Map<Integer, Size> f778a;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f778a = linkedHashMap;
        linkedHashMap.put(Integer.valueOf(TAVPlayer.VIDEO_PLAYER_WIDTH), new Size(TAVPlayer.VIDEO_PLAYER_WIDTH, 960));
        f778a.put(Integer.valueOf(TAVExporter.VIDEO_EXPORT_WIDTH), new Size(TAVExporter.VIDEO_EXPORT_WIDTH, 1280));
        f778a.put(1080, new Size(1080, 1920));
        f778a.put(960, new Size(960, TAVPlayer.VIDEO_PLAYER_WIDTH));
        f778a.put(1280, new Size(1280, TAVExporter.VIDEO_EXPORT_WIDTH));
        f778a.put(1920, new Size(1920, 1080));
    }
}
