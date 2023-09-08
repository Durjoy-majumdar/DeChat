package np1;

import android.view.MotionEvent;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: np1.f0 */
public final class C61861f0 extends C87413o implements C32226l<MotionEvent, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C61859e0 f175897d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61861f0(C61859e0 e0Var) {
        super(1);
        this.f175897d = e0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r1 != 3) goto L_0x010b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r8) {
        /*
            r7 = this;
            android.view.MotionEvent r8 = (android.view.MotionEvent) r8
            np1.e0 r0 = r7.f175897d
            r0.getClass()
            if (r8 != 0) goto L_0x000b
            goto L_0x010b
        L_0x000b:
            int r1 = r8.getAction()
            if (r1 == 0) goto L_0x0108
            java.lang.String r2 = "FinderLiveFixClickIssueRecyclerView"
            r3 = 1
            if (r1 == r3) goto L_0x00ab
            r4 = 2
            if (r1 == r4) goto L_0x001e
            r8 = 3
            if (r1 == r8) goto L_0x00ab
            goto L_0x010b
        L_0x001e:
            np1.C61859e0.m72591a(r0, r8)
            boolean r1 = r0.f175888d
            if (r1 != 0) goto L_0x0027
            goto L_0x010b
        L_0x0027:
            androidx.recyclerview.widget.LinearLayoutManager r1 = r0.f175891g
            if (r1 == 0) goto L_0x010b
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPanel r4 = r0.f175885a
            boolean r4 = r4.getEnableNestScrolled()
            if (r4 != 0) goto L_0x010b
            int r1 = r1.mo17004z()
            if (r1 != 0) goto L_0x010b
            ok1.e r1 = ok1.C62042e.f176370a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "tryToOverScrollRv event.y:"
            r4.append(r5)
            float r5 = r8.getY()
            r4.append(r5)
            java.lang.String r5 = ",rvStartPosY:"
            r4.append(r5)
            float r5 = r0.f175894j
            r4.append(r5)
            java.lang.String r5 = ",event.y - rvStartPosY:"
            r4.append(r5)
            float r5 = r8.getY()
            float r6 = r0.f175894j
            float r5 = r5 - r6
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "ShoppingPanelNestedScrollController"
            r1.mo86998D1(r5, r4)
            float r4 = r8.getY()
            float r5 = r0.f175894j
            float r4 = r4 - r5
            float r5 = r0.f175895k
            float r6 = (float) r3
            float r5 = r5 + r6
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x010b
            float r8 = r8.getY()
            float r4 = r0.f175894j
            float r8 = r8 - r4
            r0.f175895k = r8
            com.tencent.mm.plugin.finder.live.widget.FinderLiveFixClickIssueRecyclerView r8 = r0.f175886b
            r8.setConsumedTouchEnvent(r3)
            com.tencent.mm.plugin.finder.live.widget.FinderLiveFixClickIssueRecyclerView r8 = r0.f175886b
            float r0 = r0.f175895k
            r8.getClass()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "moveY "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r1.mo86998D1(r2, r3)
            r8.setTranslationY(r0)
            goto L_0x010b
        L_0x00ab:
            long r4 = java.lang.System.currentTimeMillis()
            r0.f175890f = r4
            com.tencent.mm.plugin.finder.live.widget.FinderLiveFixClickIssueRecyclerView r8 = r0.f175886b
            r8.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "resetTranslationY translationY:"
            r1.append(r4)
            float r4 = r8.getTranslationY()
            r1.append(r4)
            r4 = 33
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            float r1 = r8.getTranslationY()
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x00f8
            r8.f160076A1 = r3
            android.view.ViewPropertyAnimator r1 = r8.animate()
            r3 = 150(0x96, double:7.4E-322)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r3)
            android.view.ViewPropertyAnimator r1 = r1.translationY(r2)
            il1.o4 r2 = new il1.o4
            r2.<init>(r8)
            android.view.ViewPropertyAnimator r8 = r1.setListener(r2)
            r8.start()
        L_0x00f8:
            com.tencent.mm.plugin.finder.live.widget.FinderLiveFixClickIssueRecyclerView r8 = r0.f175886b
            r1 = 0
            r8.setConsumedTouchEnvent(r1)
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPanel r8 = r0.f175885a
            long r2 = r0.f175893i
            r8.mo78807g(r2)
            r0.f175892h = r1
            goto L_0x010b
        L_0x0108:
            np1.C61859e0.m72591a(r0, r8)
        L_0x010b:
            rx3.b0 r8 = rx3.C13598b0.f38549a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: np1.C61861f0.invoke(java.lang.Object):java.lang.Object");
    }
}
