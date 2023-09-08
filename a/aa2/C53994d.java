package aa2;

import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import java.util.ArrayList;
import jq3.C9500j;
import v92.C65558a;

/* renamed from: aa2.d */
public final class C53994d extends WxRecyclerAdapter<C65558a> {

    /* renamed from: G */
    public final /* synthetic */ C112765c f151262G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53994d(C112765c cVar, C9500j jVar, ArrayList<C65558a> arrayList) {
        super(jVar, arrayList, true);
        this.f151262G = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        r0 = r0.getAdapter();
     */
    /* renamed from: z6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewAttachedToWindow(jq3.C60905o r5) {
        /*
            r4 = this;
            java.lang.String r0 = "holder"
            gy3.C87412m.m108594g(r5, r0)
            super.onViewAttachedToWindow(r5)
            aa2.c r0 = r4.f151262G
            r0.getClass()
            androidx.recyclerview.widget.RecyclerView r0 = r5.mo85811C()
            if (r0 == 0) goto L_0x001e
            androidx.recyclerview.widget.RecyclerView$e r0 = r0.getAdapter()
            if (r0 == 0) goto L_0x001e
            int r0 = r0.getItemCount()
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            r1 = 2
            r2 = 2131309660(0x7f09345c, float:1.823761E38)
            r3 = 2131306600(0x7f092868, float:1.8231404E38)
            if (r0 != r1) goto L_0x006d
            android.view.View r0 = r5.f44854d
            android.view.View r0 = r0.findViewById(r3)
            if (r0 == 0) goto L_0x00e8
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            int r1 = r1.width
            int r3 = com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC.f346677P
            if (r1 == r3) goto L_0x00e8
            int r1 = com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC.f346687W
            float r1 = (float) r1
            r0.setTranslationX(r1)
            int r1 = com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC.f346686V
            float r1 = (float) r1
            r0.setTranslationY(r1)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            int r3 = com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC.f346678Q
            r1.height = r3
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            int r3 = com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC.f346677P
            r1.width = r3
            android.view.View r1 = r5.f44854d
            android.view.View r1 = r1.findViewById(r2)
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout r1 = (com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout) r1
            if (r1 == 0) goto L_0x0068
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            int r2 = com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC.f346685U
            r1.height = r2
        L_0x0068:
            r0.requestLayout()
            goto L_0x00e8
        L_0x006d:
            r1 = 3
            if (r0 != r1) goto L_0x00ae
            android.view.View r0 = r5.f44854d
            android.view.View r0 = r0.findViewById(r3)
            if (r0 == 0) goto L_0x00e8
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            int r1 = r1.width
            int r3 = com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC.f346675M
            if (r1 == r3) goto L_0x00e8
            int r1 = com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC.f346688X
            float r1 = (float) r1
            r0.setTranslationY(r1)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            int r3 = com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC.f346676N
            r1.height = r3
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            int r3 = com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC.f346675M
            r1.width = r3
            android.view.View r1 = r5.f44854d
            android.view.View r1 = r1.findViewById(r2)
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout r1 = (com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout) r1
            if (r1 == 0) goto L_0x00aa
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            int r2 = com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC.f346682S
            r1.height = r2
        L_0x00aa:
            r0.requestLayout()
            goto L_0x00e8
        L_0x00ae:
            r1 = 4
            if (r0 < r1) goto L_0x00e8
            android.view.View r0 = r5.f44854d
            android.view.View r0 = r0.findViewById(r3)
            if (r0 == 0) goto L_0x00e8
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            int r1 = r1.width
            int r3 = com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC.f346675M
            if (r1 == r3) goto L_0x00e8
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            int r3 = com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC.f346676N
            r1.height = r3
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            int r3 = com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC.f346675M
            r1.width = r3
            android.view.View r1 = r5.f44854d
            android.view.View r1 = r1.findViewById(r2)
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout r1 = (com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout) r1
            if (r1 == 0) goto L_0x00e5
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            int r2 = com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC.f346682S
            r1.height = r2
        L_0x00e5:
            r0.requestLayout()
        L_0x00e8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onViewAttachedToWindow, posttion: "
            r0.append(r1)
            int r5 = r5.mo17364k()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "RecyclerViewAdapterEx"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: aa2.C53994d.onViewAttachedToWindow(jq3.o):void");
    }
}
