package com.tencent.p014mm.view.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.x2c.X2CRecyclerView;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import iy3.C60641c;
import jq3.C60898l;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\"B\u001b\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fB#\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010 \u001a\u00020\n¢\u0006\u0004\b\u001e\u0010!J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006#"}, mo182094d2 = {"Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "Lcom/tencent/mm/view/x2c/X2CRecyclerView;", "", "Landroidx/recyclerview/widget/RecyclerView$e;", "adapter", "Lrx3/b0;", "setAdapter", "", "frozen", "setLayoutFrozen", "", "y1", "I", "getFlingSpeedFactor", "()I", "setFlingSpeedFactor", "(I)V", "flingSpeedFactor", "", "z1", "Ljava/lang/String;", "getSubTag", "()Ljava/lang/String;", "setSubTag", "(Ljava/lang/String;)V", "subTag", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "c", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.view.recyclerview.WxRecyclerView */
public class WxRecyclerView extends X2CRecyclerView {

    /* renamed from: B1 */
    public static final C57928c f165783B1 = new C57928c((C8480h) null);

    /* renamed from: C1 */
    public static final C13601g<Boolean> f165784C1 = C36568h.m40985a(C7087b.f24986d);

    /* renamed from: D1 */
    public static final C13601g<Boolean> f165785D1 = C36568h.m40985a(C7086a.f24985d);

    /* renamed from: A1 */
    public final C57929d f165786A1 = new C57929d();

    /* renamed from: y1 */
    public int f165787y1 = 100;

    /* renamed from: z1 */
    public String f165788z1 = "";

    /* renamed from: com.tencent.mm.view.recyclerview.WxRecyclerView$a */
    public static final class C7086a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C7086a f24985d = new C7086a();

        public C7086a() {
            super(0);
        }

        public Object invoke() {
            return Boolean.valueOf(Log.getLogLevel() <= 0);
        }
    }

    /* renamed from: com.tencent.mm.view.recyclerview.WxRecyclerView$b */
    public static final class C7087b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C7087b f24986d = new C7087b();

        public C7087b() {
            super(0);
        }

        public Object invoke() {
            boolean z = true;
            if (Log.getLogLevel() > 1 && !BuildInfo.DEBUG) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.view.recyclerview.WxRecyclerView$c */
    public static final class C57928c {
        public C57928c(C8480h hVar) {
        }

        /* renamed from: a */
        public final boolean mo82635a() {
            return ((Boolean) ((C36570n) WxRecyclerView.f165785D1).getValue()).booleanValue();
        }

        /* renamed from: b */
        public final boolean mo82636b() {
            return ((Boolean) ((C36570n) WxRecyclerView.f165784C1).getValue()).booleanValue();
        }
    }

    /* renamed from: com.tencent.mm.view.recyclerview.WxRecyclerView$d */
    public static final class C57929d extends RecyclerView.C16615g {
        /* renamed from: b */
        public void mo2556b() {
            C57928c cVar = WxRecyclerView.f165783B1;
            if (cVar.mo82636b()) {
                StringBuilder sb = new StringBuilder();
                sb.append("[notify onChanged] ");
                sb.append(cVar.mo82635a() ? Util.getStack() : "");
                Log.m105918d("MicroMsg.WxRecyclerView", sb.toString());
            }
        }

        /* renamed from: c */
        public void mo2557c(int i, int i2) {
            C57928c cVar = WxRecyclerView.f165783B1;
            if (cVar.mo82636b()) {
                StringBuilder sb = new StringBuilder();
                sb.append("[notify onItemRangeChanged] positionStart=");
                sb.append(i);
                sb.append(" itemCount=");
                sb.append(i2);
                sb.append(' ');
                sb.append(cVar.mo82635a() ? Util.getStack() : "");
                Log.m105918d("MicroMsg.WxRecyclerView", sb.toString());
            }
        }

        /* renamed from: d */
        public void mo2558d(int i, int i2, Object obj) {
            mo2557c(i, i2);
            C57928c cVar = WxRecyclerView.f165783B1;
            if (cVar.mo82636b()) {
                StringBuilder sb = new StringBuilder();
                sb.append("[notify onItemRangeChanged] positionStart=");
                sb.append(i);
                sb.append(" itemCount=");
                sb.append(i2);
                sb.append(" payload=");
                sb.append(obj);
                sb.append(' ');
                sb.append(cVar.mo82635a() ? Util.getStack() : "");
                Log.m105918d("MicroMsg.WxRecyclerView", sb.toString());
            }
        }

        /* renamed from: e */
        public void mo2559e(int i, int i2) {
            C57928c cVar = WxRecyclerView.f165783B1;
            if (cVar.mo82636b()) {
                StringBuilder sb = new StringBuilder();
                sb.append("[notify onItemRangeInserted] positionStart=");
                sb.append(i);
                sb.append(" itemCount=");
                sb.append(i2);
                sb.append(' ');
                sb.append(cVar.mo82635a() ? Util.getStack() : "");
                Log.m105918d("MicroMsg.WxRecyclerView", sb.toString());
            }
        }

        /* renamed from: f */
        public void mo17312f(int i, int i2, int i3) {
            C57928c cVar = WxRecyclerView.f165783B1;
            if (cVar.mo82636b()) {
                StringBuilder sb = new StringBuilder();
                sb.append("[notify onItemRangeMoved] fromPosition=");
                sb.append(i);
                sb.append(" toPosition=");
                sb.append(i2);
                sb.append(" itemCount=");
                sb.append(i3);
                sb.append(' ');
                sb.append(cVar.mo82635a() ? Util.getStack() : "");
                Log.m105918d("MicroMsg.WxRecyclerView", sb.toString());
            }
        }

        /* renamed from: g */
        public void mo2560g(int i, int i2) {
            C57928c cVar = WxRecyclerView.f165783B1;
            if (cVar.mo82636b()) {
                StringBuilder sb = new StringBuilder();
                sb.append("[notify onItemRangeRemoved] positionStart=");
                sb.append(i);
                sb.append(" itemCount=");
                sb.append(i2);
                sb.append(' ');
                sb.append(cVar.mo82635a() ? Util.getStack() : "");
                Log.m105918d("MicroMsg.WxRecyclerView", sb.toString());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WxRecyclerView(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: K0 */
    public boolean mo17025K0(int i, int i2) {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        boolean z = true;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            return super.mo17025K0(C60641c.m70921b(((float) (i * this.f165787y1)) / 100.0f), i2);
        }
        RecyclerView.LayoutManager layoutManager2 = getLayoutManager();
        if (layoutManager2 == null || !layoutManager2.canScrollVertically()) {
            z = false;
        }
        return z ? super.mo17025K0(i, C60641c.m70921b(((float) (i2 * this.f165787y1)) / 100.0f)) : super.mo17025K0(i, i2);
    }

    public boolean canScrollHorizontally(int i) {
        boolean canScrollHorizontally = super.canScrollHorizontally(i);
        if (f165783B1.mo82636b()) {
            Log.m105924i("MicroMsg.WxRecyclerView", "[canScrollHorizontally] direction=" + i + " result=" + canScrollHorizontally);
        }
        return canScrollHorizontally;
    }

    public boolean canScrollVertically(int i) {
        boolean canScrollVertically = super.canScrollVertically(i);
        if (f165783B1.mo82636b()) {
            Log.m105924i("MicroMsg.WxRecyclerView", "[canScrollVertically] direction=" + i + " result=" + canScrollVertically);
        }
        return canScrollVertically;
    }

    public final int getFlingSpeedFactor() {
        return this.f165787y1;
    }

    public final String getSubTag() {
        return this.f165788z1;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C57928c cVar = f165783B1;
        if (cVar.mo82636b()) {
            StringBuilder sb = new StringBuilder();
            sb.append("[onLayout] changed=");
            sb.append(z);
            sb.append(" [");
            sb.append(i);
            sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
            sb.append(i2);
            sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
            sb.append(i3);
            sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
            sb.append(i4);
            sb.append("] ");
            sb.append(cVar.mo82635a() ? Util.getStack() : "");
            Log.m105918d("MicroMsg.WxRecyclerView", sb.toString());
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        String str = this.f165788z1;
        if (!(str.length() > 0)) {
            str = null;
        }
        if (str != null) {
            Log.m105924i("MicroMsg.WxRecyclerView", this.f165788z1 + ", onMeasure");
        }
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C57928c cVar = f165783B1;
        if (cVar.mo82636b()) {
            StringBuilder sb = new StringBuilder();
            sb.append("[onViewAdded] child=");
            sb.append(view);
            sb.append(' ');
            sb.append(cVar.mo82635a() ? Util.getStack() : "");
            Log.m105918d("MicroMsg.WxRecyclerView", sb.toString());
        }
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        C57928c cVar = f165783B1;
        if (cVar.mo82636b()) {
            StringBuilder sb = new StringBuilder();
            sb.append("[onViewRemoved] child=");
            sb.append(view);
            sb.append(' ');
            sb.append(cVar.mo82635a() ? Util.getStack() : "");
            Log.m105918d("MicroMsg.WxRecyclerView", sb.toString());
        }
    }

    /* renamed from: r1 */
    public void mo17115r1(int i) {
        super.mo17115r1(i);
        if (f165783B1.mo82636b()) {
            Log.m105918d("MicroMsg.WxRecyclerView", "[scrollToPosition] position=" + i);
        }
    }

    public void requestLayout() {
        super.requestLayout();
        C57928c cVar = f165783B1;
        if (cVar.mo82636b()) {
            StringBuilder sb = new StringBuilder();
            sb.append("[requestLayout] ");
            sb.append(cVar.mo82635a() ? Util.getStack() : "");
            Log.m105918d("MicroMsg.WxRecyclerView", sb.toString());
        }
    }

    /* renamed from: s1 */
    public void mo17122s1(int i, int i2, Interpolator interpolator) {
        super.mo17122s1(i, i2, interpolator);
        C57928c cVar = f165783B1;
        if (cVar.mo82636b()) {
            StringBuilder sb = new StringBuilder();
            sb.append("[smoothScrollBy] dx=");
            sb.append(i);
            sb.append(" dy=");
            sb.append(i2);
            sb.append(" interpolator=");
            sb.append(interpolator);
            sb.append(' ');
            sb.append(cVar.mo82635a() ? Util.getStack() : "");
            Log.m105918d("MicroMsg.WxRecyclerView", sb.toString());
        }
    }

    public void scrollBy(int i, int i2) {
        super.scrollBy(i, i2);
        if (f165783B1.mo82636b()) {
            Log.m105918d("MicroMsg.WxRecyclerView", "[scrollBy] x=" + i + " y=" + i);
        }
    }

    public void scrollTo(int i, int i2) {
        if (f165783B1.mo82636b()) {
            Log.m105918d("MicroMsg.WxRecyclerView", "[scrollTo] x=" + i + " y=" + i);
        }
    }

    public void setAdapter(RecyclerView.C16613e<?> eVar) {
        super.setAdapter(eVar);
        if (eVar instanceof C60898l) {
            ((C60898l) eVar).f173480d = true;
        }
        if (eVar != null) {
            eVar.registerAdapterDataObserver(this.f165786A1);
        }
    }

    public final void setFlingSpeedFactor(int i) {
        this.f165787y1 = i;
    }

    public void setLayoutFrozen(boolean z) {
        super.setLayoutFrozen(z);
        C57928c cVar = f165783B1;
        if (cVar.mo82636b()) {
            StringBuilder sb = new StringBuilder();
            sb.append("[setLayoutFrozen] frozen=");
            sb.append(z);
            sb.append(' ');
            sb.append(cVar.mo82635a() ? Util.getStack() : "");
            Log.m105918d("MicroMsg.WxRecyclerView", sb.toString());
        }
    }

    public final void setSubTag(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f165788z1 = str;
    }

    /* renamed from: t1 */
    public void mo17149t1(int i) {
        super.mo17149t1(i);
        C57928c cVar = f165783B1;
        if (cVar.mo82636b()) {
            StringBuilder sb = new StringBuilder();
            sb.append("[smoothScrollToPosition] position=");
            sb.append(i);
            sb.append(' ');
            sb.append(cVar.mo82635a() ? Util.getStack() : "");
            Log.m105918d("MicroMsg.WxRecyclerView", sb.toString());
        }
    }

    /* renamed from: w1 */
    public void mo17155w1() {
        super.mo17155w1();
        C57928c cVar = f165783B1;
        if (cVar.mo82636b()) {
            StringBuilder sb = new StringBuilder();
            sb.append("[stopScroll] ");
            sb.append(cVar.mo82635a() ? Util.getStack() : "");
            Log.m105918d("MicroMsg.WxRecyclerView", sb.toString());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WxRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WxRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
