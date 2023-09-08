package u73;

import android.content.ComponentName;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: u73.x0 */
public class C52471x0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f146610d;

    /* renamed from: e */
    public final /* synthetic */ int f146611e;

    /* renamed from: f */
    public final /* synthetic */ boolean f146612f;

    /* renamed from: g */
    public final /* synthetic */ C52472y0 f146613g;

    public C52471x0(C52472y0 y0Var, String str, int i, boolean z) {
        this.f146613g = y0Var;
        this.f146610d = str;
        this.f146611e = i;
        this.f146612f = z;
    }

    public void run() {
        Log.m105924i("MicroMsg.WebSearch.WebSearchPreloadExport", "sending broadcast");
        C52472y0 y0Var = this.f146613g;
        String str = this.f146610d;
        int i = this.f146611e;
        boolean z = this.f146612f;
        y0Var.getClass();
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(MMApplicationContext.getContext(), "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
        intent.putExtra("tools_param_preload_url", str);
        intent.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_PRELOAD_SEARCH");
        intent.putExtra("tools_param_preload_search_biz", i);
        intent.putExtra("tools_param_preload_search_biz_need_reset", z);
        MMApplicationContext.getContext().sendBroadcast(intent);
    }
}
