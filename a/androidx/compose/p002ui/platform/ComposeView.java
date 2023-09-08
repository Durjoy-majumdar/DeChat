package androidx.compose.p002ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import p175j0.C108494d2;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C108504h;
import p175j0.C24661b2;
import p175j0.C24665d;
import p175j0.C24715p;
import p175j0.C24724t1;
import p175j0.C33487v1;
import p175j0.C60690y0;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001b\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR*\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0014@RX\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, mo182094d2 = {"Landroidx/compose/ui/platform/ComposeView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "", "getAccessibilityClassName", "Lkotlin/Function0;", "Lrx3/b0;", "content", "setContent", "(Lfy3/p;)V", "", "<set-?>", "o", "Z", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "getShouldCreateCompositionOnAttachedToWindow$annotations", "()V", "shouldCreateCompositionOnAttachedToWindow", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
/* renamed from: androidx.compose.ui.platform.ComposeView */
public final class ComposeView extends AbstractComposeView {

    /* renamed from: n */
    public final C60690y0<C32227p<C108504h, Integer, C13598b0>> f306038n;

    /* renamed from: o */
    public boolean f306039o;

    /* renamed from: androidx.compose.ui.platform.ComposeView$a */
    public static final class C103603a extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ComposeView f306040d;

        /* renamed from: e */
        public final /* synthetic */ int f306041e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103603a(ComposeView composeView, int i) {
            super(2);
            this.f306040d = composeView;
            this.f306041e = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            this.f306040d.mo76628a((C108504h) obj, this.f306041e | 1);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (C8480h) null);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i, int i2, C8480h hVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    /* renamed from: a */
    public void mo76628a(C108504h hVar, int i) {
        C32228q<C24665d<?>, C24661b2, C24724t1, C13598b0> qVar = C24715p.f70494a;
        C108504h z = hVar.mo51623z(420213850);
        C32227p pVar = (C32227p) ((C108494d2) this.f306038n).getValue();
        if (pVar != null) {
            pVar.invoke(z, 0);
        }
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C103603a(this, i));
        }
    }

    public CharSequence getAccessibilityClassName() {
        Class<ComposeView> cls = ComposeView.class;
        return "androidx.compose.ui.platform.ComposeView";
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f306039o;
    }

    public final void setContent(C32227p<? super C108504h, ? super Integer, C13598b0> pVar) {
        C87412m.m108594g(pVar, "content");
        this.f306039o = true;
        ((C108494d2) this.f306038n).setValue(pVar);
        if (isAttachedToWindow()) {
            mo144593c();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f306038n = C108500f2.m146996c((Object) null, (C108497e2) null, 2, (Object) null);
    }
}
