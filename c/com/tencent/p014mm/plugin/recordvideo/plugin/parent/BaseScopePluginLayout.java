package com.tencent.p014mm.plugin.recordvideo.plugin.parent;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53884f2;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53959v2;
import a14.C53973z1;
import android.content.Context;
import android.util.AttributeSet;
import com.tencent.xweb.IXWebBroadcastListener;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.Metadata;
import lh2.C109344g0;
import qh2.C101198e;
import wx3.C66212f;
import wx3.C66217g;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00038\u0004X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/BaseScopePluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/BasePluginLayout;", "Lqh2/e;", "La14/n0;", "h", "La14/n0;", "getScope", "()La14/n0;", "scope", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.BaseScopePluginLayout */
public abstract class BaseScopePluginLayout extends BasePluginLayout implements C101198e {

    /* renamed from: i */
    public static final /* synthetic */ int f272974i = 0;

    /* renamed from: h */
    public final C0000n0 f272975h = C53930o0.m60554a(((C53884f2) C53959v2.m60598a((C53973z1) null, 1, (Object) null)).plus(C53872d1.f151119c));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseScopePluginLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: m */
    public static C53973z1 m119451m(BaseScopePluginLayout baseScopePluginLayout, C66212f fVar, C53934p0 p0Var, C32227p pVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                fVar = C66217g.f190253d;
            }
            if ((i & 2) != 0) {
                p0Var = C53934p0.DEFAULT;
            }
            baseScopePluginLayout.getClass();
            C87412m.m108594g(fVar, "context");
            C87412m.m108594g(p0Var, IXWebBroadcastListener.STAGE_START);
            C87412m.m108594g(pVar, "block");
            return C53895h.m60465c(baseScopePluginLayout.f272975h, fVar, p0Var, pVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launch");
    }

    /* renamed from: f */
    public void mo129834f(C109344g0 g0Var) {
        C87412m.m108594g(g0Var, "plugin");
    }

    public final C0000n0 getScope() {
        return this.f272975h;
    }

    public void release() {
        super.release();
        C0000n0 n0Var = this.f272975h;
        C53930o0.m60557d(n0Var, this + " release.", (Throwable) null, 2, (Object) null);
    }
}
