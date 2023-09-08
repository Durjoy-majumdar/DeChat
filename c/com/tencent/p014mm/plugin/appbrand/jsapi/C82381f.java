package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.content.Context;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import fu3.C116901a;
import gt0.C87375o0;
import li0.C88508b;
import p224ra.C12964b;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.f */
public interface C82381f {

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.f$a */
    public interface C82382a {
        /* renamed from: b */
        boolean mo114784b(String str, C40482o oVar);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.f$b */
    public interface C82383b {
        /* renamed from: a */
        void mo114785a(String str);

        void proceed();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.f$c */
    public interface C82384c {
        /* renamed from: a */
        void mo114217a(C82870p pVar, String str, String str2, int i, String str3);

        /* renamed from: b */
        void mo114218b(int i, String str);

        /* renamed from: c */
        void mo114219c(C82919r2 r2Var, C40482o oVar, C82383b bVar);

        /* renamed from: d */
        boolean mo114220d(C82870p pVar, String str, String str2, int i, C82383b bVar);
    }

    /* renamed from: a */
    void mo109647a(int i, String str);

    /* renamed from: b */
    boolean mo109648b(String str, C40482o oVar);

    /* renamed from: d */
    void mo109650d(String str, String str2);

    /* renamed from: e */
    void mo109651e(String str, String str2, int[] iArr);

    /* renamed from: f */
    void mo109652f(String str, String str2, int i);

    String getAppId();

    C88508b getAppState();

    C116901a getAsyncHandler();

    int getComponentId();

    Context getContext();

    C87375o0 getDialogContainer();

    C81415h0 getFileSystem();

    C82384c getInterceptor();

    C83165i getJsRuntime();

    C0125s getLifecycleOwner();

    /* renamed from: h */
    <T extends C82835n> T mo109666h(Class<T> cls);

    boolean isRunning();

    /* renamed from: l */
    <T extends C12964b> T mo109668l(Class<T> cls);

    /* renamed from: n */
    void mo109669n(C82919r2 r2Var, int[] iArr);

    /* renamed from: o */
    void mo109670o(Runnable runnable, long j);

    /* renamed from: p */
    <T extends C1727m> T mo109671p(Class<T> cls);

    /* renamed from: s */
    boolean mo109672s(C82835n nVar);

    /* renamed from: t */
    void mo109673t(Runnable runnable);

    /* renamed from: v */
    C82870p mo109675v(String str);

    /* renamed from: w */
    void mo109676w(C82919r2 r2Var);
}
