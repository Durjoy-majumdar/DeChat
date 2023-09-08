package mc3;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.WeChatCommonLibs;
import di3.C86301e;
import ei3.C86522b;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_SUPPORT})
/* renamed from: mc3.b */
public class C34544b extends C86301e {
    public void onCreate(Context context) {
        super.onCreate(context);
        WeChatCommonLibs.load();
    }
}
