package com.tencent.p014mm.p136ui.chatting.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.base.MMPullDownView;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C57547m0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72917n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import hk3.C76227e;
import kg3.C76577a;
import wk3.C78606a;

/* renamed from: com.tencent.mm.ui.chatting.view.MMChattingListView */
public class MMChattingListView extends MMPullDownView implements MMPullDownView.C73177d, MMPullDownView.C73178e, MMPullDownView.C73179f, MMPullDownView.C73180h {

    /* renamed from: U0 */
    public static final /* synthetic */ int f216804U0 = 0;

    /* renamed from: Q0 */
    public int f216805Q0 = 400;

    /* renamed from: R0 */
    public boolean f216806R0 = false;

    /* renamed from: S0 */
    public Bundle f216807S0;

    /* renamed from: T */
    public C72917n0 f216808T;

    /* renamed from: T0 */
    public int f216809T0;

    /* renamed from: U */
    public C57547m0 f216810U;

    /* renamed from: V */
    public C78606a f216811V;

    /* renamed from: W */
    public Rect f216812W = new Rect();

    /* renamed from: p0 */
    public Paint f216813p0;

    /* renamed from: x0 */
    public boolean f216814x0;

    /* renamed from: y0 */
    public boolean f216815y0;

    /* renamed from: com.tencent.mm.ui.chatting.view.MMChattingListView$a */
    public class C73878a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ View f216816d;

        public C73878a(View view) {
            this.f216816d = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f216816d.getGlobalVisibleRect(MMChattingListView.this.f216812W);
            MMChattingListView.this.f216812W.top = this.f216816d.getTop();
            MMChattingListView.this.f216812W.bottom = this.f216816d.getBottom();
            MMChattingListView.this.f216813p0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue("alpha")).floatValue() * 255.0f));
            MMChattingListView.this.f216808T.postInvalidate();
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.view.MMChattingListView$b */
    public class C73879b extends AnimatorListenerAdapter {
        public C73879b() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            MMChattingListView.this.f216812W.setEmpty();
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.view.MMChattingListView$c */
    public class C73880c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ View f216819d;

        public C73880c(View view) {
            this.f216819d = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f216819d.getGlobalVisibleRect(MMChattingListView.this.f216812W);
            MMChattingListView.this.f216812W.top = this.f216819d.getTop();
            MMChattingListView.this.f216812W.bottom = this.f216819d.getBottom();
            MMChattingListView.this.f216813p0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue("alpha")).floatValue() * 255.0f));
            MMChattingListView.this.f216808T.postInvalidate();
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.view.MMChattingListView$d */
    public class C73881d extends AnimatorListenerAdapter {
        public C73881d() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            MMChattingListView.this.f216812W.setEmpty();
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            MMChattingListView.this.f216815y0 = true;
        }
    }

    public MMChattingListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo102932i(context);
    }

    /* renamed from: h */
    public static void m87563h(MMChattingListView mMChattingListView, Canvas canvas) {
        if (!mMChattingListView.f216812W.isEmpty()) {
            Rect rect = new Rect();
            mMChattingListView.f216808T.getLocalVisibleRect(rect);
            Rect rect2 = new Rect(rect);
            Rect rect3 = new Rect(rect);
            if (!mMChattingListView.f216815y0) {
                Rect rect4 = mMChattingListView.f216812W;
                rect2.bottom = rect4.top;
                rect3.top = rect4.bottom;
                canvas.drawRect(rect2, mMChattingListView.f216813p0);
                canvas.drawRect(rect3, mMChattingListView.f216813p0);
            } else {
                if (mMChattingListView.f216814x0) {
                    rect2.top = mMChattingListView.f216812W.top + C76577a.m92151b(mMChattingListView.f214887y, 35);
                } else {
                    rect2.top = mMChattingListView.f216812W.top;
                }
                rect2.bottom = mMChattingListView.f216812W.bottom + C76577a.m92151b(mMChattingListView.f214887y, 1);
                canvas.drawRect(rect2, mMChattingListView.f216813p0);
            }
            Log.m105919d("MicroMsg.MMChattingListView", "[onDrawForeground] drawingRect:%s mHighLightItemRect:%s newStyle:%b showTimeTv:%b topRect:%s", rect, mMChattingListView.f216812W, Boolean.valueOf(mMChattingListView.f216815y0), Boolean.valueOf(mMChattingListView.f216814x0), rect2);
        }
    }

    /* renamed from: C7 */
    public boolean mo64409C7() {
        this.f216809T0 = getCurCount();
        Log.m105924i("MicroMsg.MMChattingListView", "[onBottomLoadData] mPreCount:" + this.f216809T0);
        C78606a aVar = this.f216811V;
        if (aVar != null) {
            aVar.mo108594d(C76227e.C76228a.ACTION_BOTTOM, false, this.f216807S0);
            this.f216807S0 = null;
            this.f216806R0 = false;
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo96020a() {
        Bundle bundle;
        this.f216809T0 = getCurCount();
        Log.m105924i("MicroMsg.MMChattingListView", "[onTopLoadData] mPreCount:" + this.f216809T0 + " isForceTopLoadDataForPosition:" + this.f216806R0);
        if (this.f216811V != null) {
            if (this.f216806R0 && (bundle = this.f216807S0) != null) {
                bundle.putInt("SCENE", 2);
            }
            this.f216811V.mo108594d(this.f216806R0 ? C76227e.C76228a.ACTION_POSITION : C76227e.C76228a.ACTION_TOP, false, this.f216807S0);
        }
        this.f216807S0 = null;
        this.f216806R0 = false;
        return false;
    }

    /* renamed from: b0 */
    public boolean mo64386b0() {
        View childAt = getListView().getChildAt(getListView().getFirstVisiblePosition());
        return childAt != null && childAt.getTop() == 0;
    }

    /* renamed from: e */
    public void mo101743e(boolean z, int i) {
        Log.m105924i("MicroMsg.MMChattingListView", "[forceTopLoadData] start:" + z + " isForceTopLoadDataForPosition:" + this.f216806R0);
        if (!this.f216806R0) {
            super.mo101743e(z, i);
        }
    }

    public C57547m0 getBaseAdapter() {
        return this.f216810U;
    }

    public int getBottomSpace() {
        int height = this.f216808T.getHeight() - this.f216808T.getPaddingBottom();
        if (this.f216808T.getChildCount() <= 0) {
            return height;
        }
        View childAt = getListView().getChildAt(getListView().getChildCount() - 1);
        if (childAt == null || this.f216808T.getLastVisiblePosition() != this.f216808T.mo81303l().getCount() - 1) {
            return 0;
        }
        return height - childAt.getBottom();
    }

    public int getCurCount() {
        C57547m0 m0Var = this.f216810U;
        if (m0Var == null) {
            return 0;
        }
        return m0Var.getCount();
    }

    public C72917n0 getListView() {
        return this.f216808T;
    }

    public int getPreCount() {
        return this.f216809T0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.tencent.mm.ui.chatting.view.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: com.tencent.mm.pluginsdk.ui.tools.ScrollControlRecyclerView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: com.tencent.mm.ui.chatting.view.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.tencent.mm.ui.chatting.view.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.tencent.mm.ui.chatting.view.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: com.tencent.mm.ui.chatting.view.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: com.tencent.mm.ui.chatting.view.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: com.tencent.mm.ui.chatting.view.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: com.tencent.mm.ui.chatting.view.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: com.tencent.mm.ui.chatting.view.g} */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0083, code lost:
        r0.mo108226a(100, r1);
        r1 = r1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo102932i(android.content.Context r11) {
        /*
            r10 = this;
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r10.f216813p0 = r0
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.setColor(r1)
            uj3.b$e r0 = uj3.C78190b.f229093y0
            int r1 = uj3.C78190b.f229091Q0
            r2 = 0
            r3 = 1
            if (r1 < r3) goto L_0x0016
            r1 = 1
            goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            r4[r2] = r5
            java.lang.String r5 = "MicroMsg.MMChattingListView"
            java.lang.String r6 = "initChattingListView isToRv:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r4)
            r4 = 6
            r5 = 2
            r6 = 0
            if (r1 == 0) goto L_0x0099
            android.content.Context r1 = r10.f214887y
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r7 = 2131493794(0x7f0c03a2, float:1.8611078E38)
            android.view.View r1 = r1.inflate(r7, r6)
            com.tencent.mm.pluginsdk.ui.tools.ScrollControlRecyclerView r1 = (com.tencent.p014mm.pluginsdk.p133ui.tools.ScrollControlRecyclerView) r1
            com.tencent.mm.ui.chatting.view.f r7 = new com.tencent.mm.ui.chatting.view.f
            r7.<init>(r10)
            r1.setOnDrawListener(r7)
            r1.setItemAnimator(r6)
            r1.setLayoutAnimation(r6)
            com.tencent.mm.ui.chatting.layoutmanager.ChattingLinearLayoutManager r7 = new com.tencent.mm.ui.chatting.layoutmanager.ChattingLinearLayoutManager
            android.content.Context r8 = r10.getContext()
            r7.<init>(r8)
            r1.setLayoutManager(r7)
            int r7 = uj3.C78190b.f229091Q0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "initRecyclerPool: "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "MicroMsg.ChattingDataAdapterV2"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
            if (r7 >= r5) goto L_0x006f
            goto L_0x00a0
        L_0x006f:
            if (r7 == r5) goto L_0x0093
            r8 = 3
            r9 = 5
            if (r7 == r8) goto L_0x008f
            r8 = 4
            if (r7 == r8) goto L_0x0089
            if (r7 == r9) goto L_0x0083
            if (r7 == r4) goto L_0x007d
            goto L_0x00a0
        L_0x007d:
            r7 = 200(0xc8, float:2.8E-43)
            r0.mo108226a(r7, r1)
            goto L_0x00a0
        L_0x0083:
            r7 = 100
            r0.mo108226a(r7, r1)
            goto L_0x00a0
        L_0x0089:
            r7 = 50
            r0.mo108226a(r7, r1)
            goto L_0x00a0
        L_0x008f:
            r0.mo108227b(r9, r1)
            goto L_0x00a0
        L_0x0093:
            r7 = 10
            r0.mo108227b(r7, r1)
            goto L_0x00a0
        L_0x0099:
            com.tencent.mm.ui.chatting.view.g r1 = new com.tencent.mm.ui.chatting.view.g
            android.content.Context r0 = r10.f214887y
            r1.<init>(r10, r0)
        L_0x00a0:
            r10.f216808T = r1
            r1.setBackgroundDrawable(r6)
            com.tencent.mm.pluginsdk.ui.tools.n0 r0 = r10.f216808T
            r1 = 2131234025(0x7f080ce9, float:1.8084204E38)
            r0.setSelector(r1)
            com.tencent.mm.pluginsdk.ui.tools.n0 r0 = r10.f216808T
            r0.setCacheColorHint(r2)
            com.tencent.mm.pluginsdk.ui.tools.n0 r0 = r10.f216808T
            r0.setDivider(r6)
            com.tencent.mm.pluginsdk.ui.tools.n0 r0 = r10.f216808T
            int r11 = kg3.C76577a.m92151b(r11, r4)
            r0.setPadding(r2, r2, r2, r11)
            com.tencent.mm.pluginsdk.ui.tools.n0 r11 = r10.f216808T
            r11.setClipToPadding(r2)
            com.tencent.mm.pluginsdk.ui.tools.n0 r11 = r10.f216808T
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r11.setScrollBarStyle(r0)
            com.tencent.mm.pluginsdk.ui.tools.n0 r11 = r10.f216808T
            r0 = 2131299349(0x7f090c15, float:1.8216697E38)
            r11.setId(r0)
            r10.setOverScrollMode(r5)
            com.tencent.mm.pluginsdk.ui.tools.n0 r11 = r10.f216808T
            android.view.ViewGroup r11 = r11.mo81289D()
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -1
            r0.<init>(r1, r1)
            r10.addView(r11, r0)
            r10.setCanOverScrool(r2)
            r10.mo101741d(r2)
            r10.mo101739c(r2)
            r10.setTopViewVisible(r3)
            r10.setOnBottomLoadDataListener(r10)
            r10.setOnTopLoadDataListener(r10)
            r10.setAtBottomCallBack(r10)
            r10.setAtTopCallBack(r10)
            r10.setIsBottomShowAll(r3)
            r10.setIsTopShowAll(r2)
            r10.setBottomViewVisible(r3)
            r10.setNestedOverScrollEnabled(r3)
            r10.f216815y0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.view.MMChattingListView.mo102932i(android.content.Context):void");
    }

    /* renamed from: j */
    public void mo102933j(boolean z, Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        sb.append("[lockTopLoadDataForPosition] start:");
        sb.append(z);
        sb.append(" sourceArgs:");
        sb.append(bundle == null ? "null" : bundle);
        Log.m105924i("MicroMsg.MMChattingListView", sb.toString());
        this.f216806R0 = z;
        this.f216807S0 = bundle;
        mo101741d(z);
    }

    /* renamed from: q0 */
    public boolean mo64384q0() {
        View childAt = getListView().getChildAt(getListView().getChildCount() - 1);
        if (childAt == null) {
            return true;
        }
        return childAt.getBottom() <= getListView().getHeight() - getListView().getPaddingBottom() && getListView().getLastVisiblePosition() == getListView().mo81303l().getCount() - 1;
    }

    public void setAdapter(C57547m0 m0Var) {
        this.f216810U = m0Var;
        getListView().mo81290E(this.f216810U);
    }

    public void setHighLightChild(int i) {
        int max = Math.max(0, i);
        C72917n0 n0Var = this.f216808T;
        if (n0Var == null) {
            Log.m105921e("MicroMsg.MMChattingListView", "null == listView index:%s", Integer.valueOf(max));
            return;
        }
        View childAt = n0Var.getChildAt(max);
        if (childAt == null) {
            Log.m105921e("MicroMsg.MMChattingListView", "null == view index:%s", Integer.valueOf(max));
            return;
        }
        if (childAt.getBottom() - childAt.getTop() <= 0) {
            C72917n0 n0Var2 = this.f216808T;
            childAt = n0Var2.getChildAt(n0Var2.getHeaderViewsCount() + max);
        }
        if (childAt == null) {
            Log.m105921e("MicroMsg.MMChattingListView", "null == view index:%s", Integer.valueOf(max + this.f216808T.getHeaderViewsCount()));
            return;
        }
        Log.m105925i("MicroMsg.MMChattingListView", "[setHighLightChild] index:%s view rect:%s headerCount:%s", Integer.valueOf(max), new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()), Integer.valueOf(this.f216808T.getHeaderViewsCount()));
        ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("alpha", new float[]{0.0f, 0.85f, 0.85f, 0.85f, 0.85f, 0.85f, 0.0f})});
        ofPropertyValuesHolder.addUpdateListener(new C73878a(childAt));
        ofPropertyValuesHolder.addListener(new C73879b());
        ofPropertyValuesHolder.setDuration(1600);
        ofPropertyValuesHolder.start();
    }

    public void setHighLightChildNew(int i) {
        this.f216815y0 = true;
        if (C85875k4.m106211z()) {
            this.f216813p0.setColor(getResources().getColor(C0966R.color.f2975b6));
        } else {
            this.f216813p0.setColor(getResources().getColor(C0966R.color.f3131gg));
        }
        Log.m105924i("MicroMsg.MMChattingListView", "[newStyle] setfalse" + this.f216815y0);
        int max = Math.max(0, i);
        C72917n0 n0Var = this.f216808T;
        if (n0Var == null) {
            Log.m105921e("MicroMsg.MMChattingListView", "null == listView index:%s", Integer.valueOf(max));
            return;
        }
        View B = n0Var.mo81288B(max);
        if (B == null) {
            Log.m105921e("MicroMsg.MMChattingListView", "null == view index:%s", Integer.valueOf(max));
        } else if (B == null) {
            Log.m105921e("MicroMsg.MMChattingListView", "null == view index:%s", Integer.valueOf(max + this.f216808T.getHeaderViewsCount()));
        } else {
            Log.m105925i("MicroMsg.MMChattingListView", "[setHighLightChild] index:%s view rect:%s headerCount:%s", Integer.valueOf(max), new Rect(B.getLeft(), B.getTop(), B.getRight(), B.getBottom()), Integer.valueOf(this.f216808T.getHeaderViewsCount()));
            ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{C85875k4.m106211z() ? PropertyValuesHolder.ofFloat("alpha", new float[]{0.0f, 0.08f, 0.08f, 0.08f, 0.08f, 0.08f, 0.0f}) : PropertyValuesHolder.ofFloat("alpha", new float[]{0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.0f})});
            TextView textView = (TextView) B.findViewById(C0966R.C0970id.b8z);
            if (textView == null || textView.getVisibility() != 0) {
                this.f216814x0 = false;
            } else {
                this.f216814x0 = true;
            }
            B.clearAnimation();
            ofPropertyValuesHolder.addUpdateListener(new C73880c(B));
            ofPropertyValuesHolder.addListener(new C73881d());
            ofPropertyValuesHolder.setDuration(1150);
            ofPropertyValuesHolder.start();
        }
    }

    public void setLoadExecutor(C78606a aVar) {
        this.f216811V = aVar;
    }

    public MMChattingListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo102932i(context);
    }
}
