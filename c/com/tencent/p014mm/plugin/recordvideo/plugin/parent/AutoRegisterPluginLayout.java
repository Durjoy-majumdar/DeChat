package com.tencent.p014mm.plugin.recordvideo.plugin.parent;

import a14.C0000n0;
import a14.C53930o0;
import android.content.Context;
import android.util.AttributeSet;
import f14.C7972g;
import gy3.C87412m;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import lh2.C109344g0;
import qh2.C101198e;
import wx3.C66212f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00048\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/AutoRegisterPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/BasePluginLayout;", "Lqh2/e;", "La14/n0;", "Lwx3/f;", "getCoroutineContext", "()Lwx3/f;", "coroutineContext", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.AutoRegisterPluginLayout */
public abstract class AutoRegisterPluginLayout extends BasePluginLayout implements C101198e, C0000n0 {

    /* renamed from: h */
    public final /* synthetic */ C0000n0 f272951h = C53930o0.m60555b();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoRegisterPluginLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: f */
    public void mo129834f(C109344g0 g0Var) {
        C87412m.m108594g(g0Var, "plugin");
        getPluginList().add(g0Var);
    }

    public C66212f getCoroutineContext() {
        return ((C7972g) this.f272951h).f26652d;
    }

    public void release() {
        super.release();
        C53930o0.m60556c(this, (CancellationException) null);
    }
}
