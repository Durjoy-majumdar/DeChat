package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import p261wl.C15510f;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.j2 */
public final class C81274j2 {

    /* renamed from: a */
    public static ICommLibReader f238682a;

    /* renamed from: b */
    public static final Set<C81275a> f238683b = new CopyOnWriteArraySet();

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.j2$a */
    public interface C81275a {
        /* renamed from: o3 */
        void mo113563o3(ICommLibReader iCommLibReader);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.j2$b */
    public interface C81276b extends C15510f {
        /* renamed from: o3 */
        void mo56522o3(ICommLibReader iCommLibReader);
    }

    /* renamed from: a */
    public static ICommLibReader m99632a() {
        ICommLibReader iCommLibReader;
        synchronized (C81274j2.class) {
            iCommLibReader = f238682a;
        }
        Log.m105925i("MicroMsg.AppBrand.WxaCommLibPreloadSessionInMM", "getCurrentAcceptedCommLibReader [%s], stacktrace=%s", iCommLibReader, android.util.Log.getStackTraceString(new Throwable()));
        return iCommLibReader;
    }
}
