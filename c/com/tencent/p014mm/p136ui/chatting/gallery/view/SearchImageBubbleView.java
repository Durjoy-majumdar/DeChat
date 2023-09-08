package com.tencent.p014mm.p136ui.chatting.gallery.view;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B#\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f¨\u0006\u0017"}, mo182094d2 = {"Lcom/tencent/mm/ui/chatting/gallery/view/SearchImageBubbleView;", "Landroid/widget/LinearLayout;", "Landroid/view/View;", "anchorView", "Lrx3/b0;", "setAnchorView", "", "text", "setBubbleText", "", "width", "setViewWidth", "Landroid/view/View$OnClickListener;", "onClickListener", "setBubbleClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.chatting.gallery.view.SearchImageBubbleView */
public final class SearchImageBubbleView extends LinearLayout {

    /* renamed from: d */
    public TextView f216444d;

    /* renamed from: e */
    public View f216445e;

    /* renamed from: f */
    public View f216446f;

    /* renamed from: g */
    public boolean f216447g;

    /* renamed from: h */
    public Point f216448h;

    /* renamed from: i */
    public Point f216449i;

    /* renamed from: j */
    public int f216450j;

    /* renamed from: n */
    public int f216451n;

    /* renamed from: o */
    public int f216452o;

    /* renamed from: p */
    public int f216453p;

    /* renamed from: q */
    public int f216454q;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SearchImageBubbleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0086  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo102787a() {
        /*
            r10 = this;
            r0 = 0
            r10.setVisibility(r0)
            android.view.ViewGroup$LayoutParams r1 = r10.getLayoutParams()
            if (r1 == 0) goto L_0x0014
            boolean r2 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L_0x0014
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r1 = r1.rightMargin
            r10.f216454q = r1
        L_0x0014:
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            android.graphics.Point r2 = r10.f216449i
            r1[r0] = r2
            r2 = 1
            android.graphics.Point r3 = r10.f216448h
            r1[r2] = r3
            int r2 = r10.f216451n
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 2
            r1[r3] = r2
            r2 = 3
            int r4 = r10.f216450j
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r2] = r4
            r2 = 4
            int r4 = r10.f216454q
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r2] = r4
            java.lang.String r2 = "MicroMsg.SearchImageBubbleView"
            java.lang.String r4 = "alvinluo showByPosition anchorViewPosition: %s, anchorViewSize: %s, bubbleWidth: %d, viewWidth: %d, bubbleRightMargin: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r2, r4, r1)
            android.widget.TextView r1 = r10.f216444d
            r2 = 0
            if (r1 == 0) goto L_0x00b7
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            if (r1 == 0) goto L_0x0088
            boolean r4 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r4 == 0) goto L_0x0088
            android.graphics.Point r4 = r10.f216449i
            int r4 = r4.x
            android.graphics.Point r5 = r10.f216448h
            int r5 = r5.x
            int r5 = r5 / r3
            int r4 = r4 + r5
            int r5 = r10.f216451n
            int r6 = r10.f216452o
            if (r5 > r6) goto L_0x0064
            int r5 = r5 / r3
        L_0x0062:
            int r4 = r4 - r5
            goto L_0x0080
        L_0x0064:
            int r7 = r4 + r5
            int r6 = r6 / r3
            int r7 = r7 - r6
            int r6 = r10.f216450j
            int r8 = r10.f216454q
            int r9 = r6 - r8
            if (r7 <= r9) goto L_0x007e
            int r4 = r6 - r5
            int r4 = r4 - r8
            float r5 = (float) r6
            r6 = 1077936128(0x40400000, float:3.0)
            float r5 = r5 / r6
            float r4 = (float) r4
            float r4 = java.lang.Math.max(r5, r4)
            int r4 = (int) r4
            goto L_0x0080
        L_0x007e:
            int r5 = r5 / r3
            goto L_0x0062
        L_0x0080:
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r5 = r1.leftMargin
            if (r5 == r4) goto L_0x0088
            r1.leftMargin = r4
        L_0x0088:
            android.view.View r1 = r10.f216445e
            if (r1 == 0) goto L_0x00b1
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            if (r1 == 0) goto L_0x00b0
            boolean r2 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L_0x00b0
            android.graphics.Point r2 = r10.f216449i
            int r2 = r2.x
            android.graphics.Point r4 = r10.f216448h
            int r4 = r4.x
            int r4 = r4 / r3
            int r2 = r2 + r4
            int r4 = r10.f216453p
            int r4 = r4 / r3
            int r2 = r2 - r4
            int r0 = java.lang.Math.max(r0, r2)
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r2 = r1.leftMargin
            if (r2 == r0) goto L_0x00b0
            r1.leftMargin = r0
        L_0x00b0:
            return
        L_0x00b1:
            java.lang.String r0 = "bubbleTriangle"
            gy3.C87412m.m108603p(r0)
            throw r2
        L_0x00b7:
            java.lang.String r0 = "bubbleTextView"
            gy3.C87412m.m108603p(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.view.SearchImageBubbleView.mo102787a():void");
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View view = this.f216446f;
        if (view != null) {
            Point point = this.f216449i;
            C87412m.m108591d(view);
            point.x = (int) view.getX();
            Point point2 = this.f216449i;
            View view2 = this.f216446f;
            C87412m.m108591d(view2);
            point2.y = (int) view2.getY();
            Object[] objArr = new Object[3];
            objArr[0] = this.f216449i;
            TextView textView = this.f216444d;
            if (textView != null) {
                objArr[1] = Integer.valueOf(textView.getMeasuredWidth());
                objArr[2] = Integer.valueOf(getMeasuredWidth());
                Log.m105927v("MicroMsg.SearchImageBubbleView", "alvinluo onMeasure anchorViewPos: %s, %d, %d", objArr);
                if (this.f216449i.x > 0) {
                    TextView textView2 = this.f216444d;
                    if (textView2 == null) {
                        C87412m.m108603p("bubbleTextView");
                        throw null;
                    } else if (textView2.getMeasuredWidth() >= 0 && getMeasuredWidth() > 0) {
                        this.f216450j = getMeasuredWidth();
                        Log.m105927v("MicroMsg.SearchImageBubbleView", "alvinluo showIfNeed pendingShow: %b", Boolean.valueOf(this.f216447g));
                        if (this.f216447g) {
                            this.f216447g = false;
                            mo102787a();
                        }
                    }
                }
            } else {
                C87412m.m108603p("bubbleTextView");
                throw null;
            }
        }
    }

    public final void setAnchorView(View view) {
        this.f216446f = view;
    }

    public final void setBubbleClickListener(View.OnClickListener onClickListener) {
        TextView textView = this.f216444d;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        } else {
            C87412m.m108603p("bubbleTextView");
            throw null;
        }
    }

    public final void setBubbleText(String str) {
        C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
        TextView textView = this.f216444d;
        if (textView != null) {
            textView.setText(str);
        } else {
            C87412m.m108603p("bubbleTextView");
            throw null;
        }
    }

    public final void setViewWidth(int i) {
        this.f216450j = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchImageBubbleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f216447g = true;
        this.f216448h = new Point(0, 0);
        this.f216449i = new Point(0, 0);
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.b0b, this, true);
        View findViewById = inflate.findViewById(C0966R.C0970id.j5w);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.s…h_image_bubble_container)");
        ViewGroup viewGroup = (ViewGroup) findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.j5x);
        C87412m.m108593f(findViewById2, "view.findViewById(R.id.search_image_bubble_tips)");
        this.f216444d = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.amn);
        C87412m.m108593f(findViewById3, "view.findViewById(R.id.bubble_triangle)");
        this.f216445e = findViewById3;
        this.f216453p = getResources().getDimensionPixelSize(C0966R.dimen.f4271y9);
        this.f216452o = getResources().getDimensionPixelSize(C0966R.dimen.f4269y6);
    }
}
