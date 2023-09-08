package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.nativefinder.list;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19641z0;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import jp3.C9486a;
import kotlin.Metadata;
import nf3.C34829d;
import zt3.C119157j;
import zt3.C119179t;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\u000b¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/timeline/item/nativefinder/list/BizNativeFinderRecyclerView;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "Ljp3/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-brandservice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.nativefinder.list.BizNativeFinderRecyclerView */
public final class BizNativeFinderRecyclerView extends WxRecyclerView implements C9486a {

    /* renamed from: I1 */
    public static final /* synthetic */ int f267713I1 = 0;

    /* renamed from: E1 */
    public final String f267714E1;

    /* renamed from: F1 */
    public int f267715F1;

    /* renamed from: G1 */
    public int f267716G1;

    /* renamed from: H1 */
    public int f267717H1;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.nativefinder.list.BizNativeFinderRecyclerView$a */
    public static final class C92952a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ BizNativeFinderRecyclerView f267718d;

        public C92952a(BizNativeFinderRecyclerView bizNativeFinderRecyclerView) {
            this.f267718d = bizNativeFinderRecyclerView;
        }

        public final void run() {
            BizNativeFinderRecyclerView bizNativeFinderRecyclerView = this.f267718d;
            if (bizNativeFinderRecyclerView.f44787x) {
                try {
                    int i = BizNativeFinderRecyclerView.f267713I1;
                    bizNativeFinderRecyclerView.onDetachedFromWindow();
                    Log.m105924i(this.f267718d.f267714E1, "dead onDestroy but has not called onDetachedFromWindow!");
                    C19641z0.f55645a.mo25867j(160);
                } catch (Exception e) {
                    C19641z0.f55645a.mo25867j(161);
                    Log.m105921e(this.f267718d.f267714E1, "dead onDetachedFromWindow ex %s", e.getMessage());
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BizNativeFinderRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f267714E1 = "MicroMsg.BizNativeFinderRecyclerView";
        if (getContext() instanceof MMFragmentActivity) {
            Context context2 = getContext();
            C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
            ((MMFragmentActivity) context2).keep(this);
        }
        this.f267717H1 = ((C32735h) C86312j.m106911c(C32735h.class)).mo58782dM(new C34829d()) == 1 ? 0 : 15;
    }

    public void dead() {
        Log.m105918d(this.f267714E1, "dead");
        C119179t tVar = C119157j.f356862d;
        C92952a aVar = new C92952a(this);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(aVar, 3000, false);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f267717H1 == 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        boolean z = true;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.f267715F1 = (int) motionEvent.getX();
            this.f267716G1 = (int) motionEvent.getY();
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (valueOf != null && valueOf.intValue() == 2) {
            int abs = Math.abs(((int) motionEvent.getX()) - this.f267715F1);
            ViewParent parent = getParent();
            if ((((double) 180) * Math.atan2((double) abs, (double) Math.abs(((int) motionEvent.getY()) - this.f267716G1))) / 3.141592653589793d < ((double) this.f267717H1)) {
                z = false;
            }
            parent.requestDisallowInterceptTouchEvent(z);
        } else if ((valueOf == null || valueOf.intValue() != 1) && valueOf != null) {
            int intValue = valueOf.intValue();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BizNativeFinderRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
