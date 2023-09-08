package com.tencent.p014mm.plugin.finder.live.box;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53930o0;
import a14.C53973z1;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import f14.C58901s;
import f14.C7972g;
import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import wx3.C66212f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0004\u001b\u001c\u001d\u001eB\u001b\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017B#\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0016\u0010\u001aJ\"\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0004J\u000e\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/box/DammakuLayout;", "Landroid/widget/FrameLayout;", "", "VH", "Lcom/tencent/mm/plugin/finder/live/box/DammakuLayout$a;", "adapter", "Lrx3/b0;", "setAdapter", "getAdapter", "Lcom/tencent/mm/plugin/finder/live/box/DammakuLayout$c;", "parameter", "setAnimParam", "", "isInit", "Z", "()Z", "setInit", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "b", "c", "d", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.box.DammakuLayout */
public final class DammakuLayout extends FrameLayout {

    /* renamed from: d */
    public C3131b f15006d = new C3131b(this);

    /* renamed from: com.tencent.mm.plugin.finder.live.box.DammakuLayout$a */
    public static abstract class C3130a<VH, DATA> {
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.box.DammakuLayout$b */
    public static final class C3131b {

        /* renamed from: a */
        public C0000n0 f15007a = C53930o0.m60554a(C53872d1.f151119c);

        /* renamed from: b */
        public C0000n0 f15008b = C53930o0.m60554a(C58901s.f168555a);

        /* renamed from: c */
        public HashMap<Integer, C3133d> f15009c;

        /* renamed from: d */
        public LinkedHashMap<View, ValueAnimator> f15010d = new LinkedHashMap<>();

        /* renamed from: e */
        public C53973z1 f15011e;

        /* renamed from: f */
        public final Handler f15012f = new Handler(Looper.getMainLooper());

        public C3131b(ViewGroup viewGroup) {
            C87412m.m108594g(viewGroup, "parentView");
            new LinearInterpolator();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.box.DammakuLayout$c */
    public static final class C3132c {
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.box.DammakuLayout$d */
    public static final class C3133d {

        /* renamed from: a */
        public final int f15013a;

        /* renamed from: b */
        public final int f15014b;

        /* renamed from: c */
        public boolean f15015c;

        public C3133d(int i, int i2, boolean z, int i3, C8480h hVar) {
            z = (i3 & 4) != 0 ? false : z;
            this.f15013a = i;
            this.f15014b = i2;
            this.f15015c = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3133d)) {
                return false;
            }
            C3133d dVar = (C3133d) obj;
            return this.f15013a == dVar.f15013a && this.f15014b == dVar.f15014b && this.f15015c == dVar.f15015c;
        }

        public int hashCode() {
            int i = ((this.f15013a * 31) + this.f15014b) * 31;
            boolean z = this.f15015c;
            if (z) {
                z = true;
            }
            return i + (z ? 1 : 0);
        }

        public String toString() {
            return "RowStatus(top=" + this.f15013a + ", height=" + this.f15014b + ", isOccupy=" + this.f15015c + ')';
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DammakuLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    public final C3130a<?, ?> getAdapter() {
        C87412m.m108603p("adapter");
        throw null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C3131b bVar = this.f15006d;
        bVar.f15012f.post(new C3134a(bVar));
        Log.m105924i("DammakuLayout", "reset: cancel");
        C66212f coroutineContext = ((C7972g) bVar.f15007a).getCoroutineContext();
        int i = C53973z1.f151221b0;
        C53973z1.C0004b bVar2 = C53973z1.C0004b.f3d;
        C53973z1 z1Var = (C53973z1) coroutineContext.get(bVar2);
        bVar.f15011e = z1Var;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        C53973z1 z1Var2 = (C53973z1) ((C7972g) bVar.f15008b).getCoroutineContext().get(bVar2);
        if (z1Var2 != null) {
            C53973z1.C53974a.m60623a(z1Var2, (CancellationException) null, 1, (Object) null);
        }
        bVar.f15007a = C53930o0.m60554a(C53872d1.f151119c);
        bVar.f15008b = C53930o0.m60554a(C58901s.f168555a);
    }

    public final <VH> void setAdapter(C3130a<VH, ?> aVar) {
        C87412m.m108594g(aVar, "adapter");
        throw null;
    }

    public final void setAnimParam(C3132c cVar) {
        C87412m.m108594g(cVar, "parameter");
        C3131b bVar = this.f15006d;
        bVar.getClass();
        bVar.f15009c = new HashMap<>();
        int i = 0;
        while (i < 1) {
            HashMap<Integer, C3133d> hashMap = bVar.f15009c;
            if (hashMap != null) {
                hashMap.put(Integer.valueOf(i), new C3133d(0, 0, false, 4, (C8480h) null));
                i++;
            } else {
                C87412m.m108603p("rowInfoMap");
                throw null;
            }
        }
    }

    public final void setInit(boolean z) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DammakuLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
