package com.tencent.p014mm.p136ui.contact;

import com.tencent.p014mm.plugin.messenger.foundation.PluginMessengerFoundation;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.mm.ui.contact.q0 */
public class C57827q0 {
    /* renamed from: a */
    public static List<String> m66827a() {
        List<String> d = ((PluginMessengerFoundation) C86312j.m106911c(PluginMessengerFoundation.class)).mo96076P7().mo90701d(5, 2);
        Log.m105924i("MicroMsg.RecentForwardInfoStorage", "[query] list size=" + ((LinkedList) d).size());
        return d;
    }

    /* renamed from: b */
    public static List<String> m66829b() {
        List<String> d = ((PluginMessengerFoundation) C86312j.m106911c(PluginMessengerFoundation.class)).mo96076P7().mo90701d(5, 1);
        Log.m105924i("MicroMsg.RecentForwardInfoStorage", "[query] list size=" + ((LinkedList) d).size());
        return d;
    }

    /* renamed from: c */
    public static List<String> m66830c() {
        return ((PluginMessengerFoundation) C86312j.m106911c(PluginMessengerFoundation.class)).mo96076P7().mo90702e();
    }

    /* renamed from: a */
    public static void m66828a(String str) {
        if (!str.endsWith("@kefu.openim")) {
            ((PluginMessengerFoundation) C86312j.m106911c(PluginMessengerFoundation.class)).mo96076P7().mo90704g(str);
        }
    }
}
