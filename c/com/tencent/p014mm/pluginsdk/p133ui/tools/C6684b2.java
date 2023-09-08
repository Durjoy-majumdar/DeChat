package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.b2 */
public class C6684b2 {

    /* renamed from: a */
    public static List<C6685a> f24046a = new ArrayList();

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.b2$a */
    public interface C6685a {
        /* renamed from: a */
        void mo6909a(Context context);

        /* renamed from: b */
        void mo6910b(Context context);

        /* renamed from: c */
        void mo6911c(Context context);

        String getName();
    }

    /* renamed from: a */
    public static void m6985a(C6685a aVar) {
        if (aVar != null) {
            Log.m105918d("MicroMsg.WebViewPluginCenter", "add, plugin name = " + aVar.getName());
            if (!((ArrayList) f24046a).contains(aVar)) {
                ((ArrayList) f24046a).add(aVar);
            }
        }
    }
}
