package com.tencent.p014mm.sdk.coroutines;

import a14.C0000n0;
import a14.C0002w;
import a14.C53872d1;
import a14.C53873d2;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import a14.C53935p1;
import a14.C53973z1;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.sdk.p134kt.CommonKt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.IXWebBroadcastListener;
import f14.C58901s;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import wx3.C15601d;
import wx3.C66212f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B%\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b(\u0010)J\b\u0010\u0004\u001a\u00020\u0003H\u0007J>\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ>\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\rR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8VX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, mo182094d2 = {"Lcom/tencent/mm/sdk/coroutines/LifecycleScope;", "La14/n0;", "Landroidx/lifecycle/r;", "Lrx3/b0;", "onDestroy", "La14/p0;", "start", "Lkotlin/Function2;", "Lwx3/d;", "", "block", "La14/z1;", "launchDefault", "(La14/p0;Lfy3/p;)La14/z1;", "launchMain", "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "", "threadCount", "I", "getThreadCount", "()I", "La14/w;", "parentJob", "La14/w;", "La14/p1;", "default$delegate", "Lrx3/g;", "getDefault", "()La14/p1;", "default", "Lwx3/f;", "getCoroutineContext", "()Lwx3/f;", "coroutineContext", "Landroidx/lifecycle/s;", "owner", "<init>", "(Ljava/lang/String;Landroidx/lifecycle/s;I)V", "Companion", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.coroutines.LifecycleScope */
public final class LifecycleScope implements C0000n0, C0124r {
    public static final Companion Companion = new Companion((C8480h) null);
    public static final String TAG = "MicroMsg.Mvvm.LifecycleScope";
    private final C13601g default$delegate;
    private final String name;
    private final C0002w parentJob;
    private final int threadCount;

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/sdk/coroutines/LifecycleScope$Companion;", "", "()V", "TAG", "", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.coroutines.LifecycleScope$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    public LifecycleScope(String str, C0125s sVar, int i) {
        C87412m.m108594g(str, "name");
        this.name = str;
        this.threadCount = i;
        if (sVar != null) {
            CommonKt.uiThread(new LifecycleScope$1$1(sVar, this));
        }
        this.parentJob = C53873d2.m60389a((C53973z1) null, 1, (Object) null);
        this.default$delegate = C36568h.m40985a(new LifecycleScope$default$2(this));
    }

    private final C53935p1 getDefault() {
        return (C53935p1) this.default$delegate.getValue();
    }

    public static /* synthetic */ C53973z1 launchDefault$default(LifecycleScope lifecycleScope, C53934p0 p0Var, C32227p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            p0Var = C53934p0.DEFAULT;
        }
        return lifecycleScope.launchDefault(p0Var, pVar);
    }

    public static /* synthetic */ C53973z1 launchMain$default(LifecycleScope lifecycleScope, C53934p0 p0Var, C32227p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            p0Var = C53934p0.DEFAULT;
        }
        return lifecycleScope.launchMain(p0Var, pVar);
    }

    public C66212f getCoroutineContext() {
        C53896h0 h0Var = C53872d1.f151117a;
        return C58901s.f168555a.plus(this.parentJob);
    }

    public final String getName() {
        return this.name;
    }

    public final int getThreadCount() {
        return this.threadCount;
    }

    public final C53973z1 launchDefault(C53934p0 p0Var, C32227p<? super C0000n0, ? super C15601d<? super C13598b0>, ? extends Object> pVar) {
        C87412m.m108594g(p0Var, IXWebBroadcastListener.STAGE_START);
        C87412m.m108594g(pVar, "block");
        return C53895h.m60465c(this, getDefault(), p0Var, pVar);
    }

    public final C53973z1 launchMain(C53934p0 p0Var, C32227p<? super C0000n0, ? super C15601d<? super C13598b0>, ? extends Object> pVar) {
        C87412m.m108594g(p0Var, IXWebBroadcastListener.STAGE_START);
        C87412m.m108594g(pVar, "block");
        C53896h0 h0Var = C53872d1.f151117a;
        return C53895h.m60465c(this, C58901s.f168555a, p0Var, pVar);
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public final void onDestroy() {
        Log.m105924i(TAG, "onDestroy");
        this.parentJob.mo74528b(new CancellationException("onDestroy"));
        getDefault().close();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LifecycleScope(String str, C0125s sVar, int i, int i2, C8480h hVar) {
        this(str, (i2 & 2) != 0 ? null : sVar, (i2 & 4) != 0 ? 1 : i);
    }
}
