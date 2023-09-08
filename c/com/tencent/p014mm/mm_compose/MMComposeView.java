package com.tencent.p014mm.mm_compose;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import androidx.compose.p002ui.platform.AbstractComposeView;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import p175j0.C108494d2;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C108504h;
import p175j0.C33487v1;
import p175j0.C60690y0;
import rx3.C13598b0;
import z04.C112550d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R*\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078\u0014@RX\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, mo182094d2 = {"Lcom/tencent/mm/mm_compose/MMComposeView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Lkotlin/Function0;", "Lrx3/b0;", "content", "setContent", "(Lfy3/p;)V", "", "<set-?>", "o", "Z", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "getShouldCreateCompositionOnAttachedToWindow$annotations", "()V", "shouldCreateCompositionOnAttachedToWindow", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "compose-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.mm_compose.MMComposeView */
public final class MMComposeView extends AbstractComposeView {

    /* renamed from: n */
    public final C60690y0<C32227p<C108504h, Integer, C13598b0>> f157700n;

    /* renamed from: o */
    public boolean f157701o;

    /* renamed from: p */
    public final boolean f157702p;

    /* renamed from: q */
    public Canvas f157703q;

    /* renamed from: r */
    public int f157704r;

    /* renamed from: com.tencent.mm.mm_compose.MMComposeView$a */
    public static final class C55376a extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MMComposeView f157705d;

        /* renamed from: e */
        public final /* synthetic */ int f157706e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55376a(MMComposeView mMComposeView, int i) {
            super(2);
            this.f157705d = mMComposeView;
            this.f157706e = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            this.f157705d.mo76628a((C108504h) obj, this.f157706e | 1);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MMComposeView(Context context, AttributeSet attributeSet, int i, C8480h hVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    /* renamed from: a */
    public void mo76628a(C108504h hVar, int i) {
        C108504h z = hVar.mo51623z(-447956736);
        C32227p pVar = (C32227p) ((C108494d2) this.f157700n).getValue();
        if (pVar != null) {
            pVar.invoke(z, 0);
        }
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C55376a(this, i));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0083, code lost:
        if (r6 != null) goto L_0x0087;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatchDraw(android.graphics.Canvas r10) {
        /*
            r9 = this;
            java.lang.String r0 = "canvas"
            gy3.C87412m.m108594g(r10, r0)
            boolean r0 = r9.f157702p
            if (r0 == 0) goto L_0x008a
            android.graphics.Canvas r0 = r9.f157703q
            boolean r0 = gy3.C87412m.m108589b(r10, r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0015
            goto L_0x0087
        L_0x0015:
            int r0 = r9.f157704r
            r3 = 10
            if (r0 <= r3) goto L_0x001d
            goto L_0x0086
        L_0x001d:
            android.graphics.Canvas r3 = r9.f157703q
            java.lang.String r4 = "drawNoChildren"
            java.lang.String r5 = "Throwable().stackTrace"
            r6 = 0
            if (r3 != 0) goto L_0x004f
            int r0 = r0 + r1
            r9.f157704r = r0
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            gy3.C87412m.m108593f(r0, r5)
            int r3 = r0.length
            r5 = 0
        L_0x0037:
            if (r5 >= r3) goto L_0x004a
            r7 = r0[r5]
            java.lang.String r8 = r7.getMethodName()
            boolean r8 = gy3.C87412m.m108589b(r8, r4)
            if (r8 == 0) goto L_0x0047
            r6 = r7
            goto L_0x004a
        L_0x0047:
            int r5 = r5 + 1
            goto L_0x0037
        L_0x004a:
            if (r6 == 0) goto L_0x0086
            r9.f157703q = r10
            goto L_0x0087
        L_0x004f:
            boolean r0 = r10.isHardwareAccelerated()
            if (r0 == 0) goto L_0x0058
            r9.f157704r = r2
            goto L_0x0086
        L_0x0058:
            int r0 = r9.f157704r
            int r0 = r0 + r1
            r9.f157704r = r0
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            gy3.C87412m.m108593f(r0, r5)
            int r3 = r0.length
            r5 = 0
        L_0x006b:
            if (r5 >= r3) goto L_0x007d
            r7 = r0[r5]
            java.lang.String r8 = r7.getMethodName()
            boolean r8 = gy3.C87412m.m108589b(r8, r4)
            if (r8 == 0) goto L_0x007a
            goto L_0x007e
        L_0x007a:
            int r5 = r5 + 1
            goto L_0x006b
        L_0x007d:
            r7 = r6
        L_0x007e:
            if (r7 == 0) goto L_0x0083
            r9.f157703q = r10
            r6 = r7
        L_0x0083:
            if (r6 == 0) goto L_0x0086
            goto L_0x0087
        L_0x0086:
            r1 = 0
        L_0x0087:
            if (r1 == 0) goto L_0x008a
            return
        L_0x008a:
            super.dispatchDraw(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.mm_compose.MMComposeView.dispatchDraw(android.graphics.Canvas):void");
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f157701o;
    }

    public final void setContent(C32227p<? super C108504h, ? super Integer, C13598b0> pVar) {
        C87412m.m108594g(pVar, "content");
        this.f157701o = true;
        ((C108494d2) this.f157700n).setValue(pVar);
        if (isAttachedToWindow()) {
            mo144593c();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMComposeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, (C8480h) null);
        C87412m.m108594g(context, "context");
        this.f157700n = C108500f2.m146996c((Object) null, (C108497e2) null, 2, (Object) null);
        String str = Build.BRAND;
        C87412m.m108593f(str, "BRAND");
        this.f157702p = C112550d0.m153801u(str, "vivo", false);
    }
}
