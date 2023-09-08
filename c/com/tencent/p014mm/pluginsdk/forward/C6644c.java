package com.tencent.p014mm.pluginsdk.forward;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.messenger.foundation.PluginMessengerFoundation;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import kotlin.Metadata;
import yh3.C66649b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Lcom/tencent/mm/ipcinvoker/type/IPCString;", "kotlin.jvm.PlatformType", "data", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<anonymous parameter 1>", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/ipcinvoker/type/IPCString;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.pluginsdk.forward.c */
final class C6644c<InputType, ResultType> implements C80883e {

    /* renamed from: d */
    public static final C6644c<InputType, ResultType> f23939d = new C6644c<>();

    public void invoke(Object obj, C1256g gVar) {
        C66649b P7;
        String str = ((IPCString) obj).f10315d;
        if (str == null) {
            Log.m105928w("MircoMsg.RecentForwardMenuHelper", "deleteInfoInForwardInfoStorage, username is null");
            return;
        }
        PluginMessengerFoundation pluginMessengerFoundation = (PluginMessengerFoundation) C86312j.m106911c(PluginMessengerFoundation.class);
        if (pluginMessengerFoundation != null && (P7 = pluginMessengerFoundation.mo96076P7()) != null) {
            P7.mo90698a(str);
        }
    }
}
