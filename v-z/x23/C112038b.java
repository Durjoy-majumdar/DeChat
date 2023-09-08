package x23;

import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: x23.b */
public final class C112038b {
    /* renamed from: a */
    public static final String m152774a(RecordConfigProvider recordConfigProvider) {
        if (recordConfigProvider != null) {
            String string = recordConfigProvider.f272912M.getString("key_click_tab_context_id", "");
            Log.m105924i("MicroMsg.TimelineEditorModelParser", "getFinderClickTabContextId by parse:" + string);
            C87412m.m108593f(string, "ret");
            return string;
        }
        Log.m105924i("MicroMsg.TimelineEditorModelParser", "getFinderClickTabContextId by default:");
        return "";
    }

    /* renamed from: b */
    public static final String m152775b(RecordConfigProvider recordConfigProvider) {
        if (recordConfigProvider != null) {
            String string = recordConfigProvider.f272912M.getString("FINDER_CONTEXT_ID", "");
            Log.m105924i("MicroMsg.TimelineEditorModelParser", "getFinderContextId by parse:" + string);
            C87412m.m108593f(string, "ret");
            return string;
        }
        Log.m105924i("MicroMsg.TimelineEditorModelParser", "getFinderContextId by default:");
        return "";
    }

    /* renamed from: c */
    public static final String m152776c(RecordConfigProvider recordConfigProvider) {
        if (recordConfigProvider != null) {
            String string = recordConfigProvider.f272912M.getString("FINDER_SESSION_ID", "");
            Log.m105924i("MicroMsg.TimelineEditorModelParser", "getSessionId by parse:" + string);
            C87412m.m108593f(string, "ret");
            return string;
        }
        Log.m105924i("MicroMsg.TimelineEditorModelParser", "getSessionId by default:");
        return "";
    }
}
