package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import p1035sf.C90183c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderFeedBubbleTipsLayout;", "Lcom/tencent/mm/plugin/finder/view/SimpleTouchableLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout */
public final class FinderFeedBubbleTipsLayout extends SimpleTouchableLayout {

    /* renamed from: p */
    public final int[] f17731p = new int[2];

    /* renamed from: q */
    public final int[] f17732q = new int[2];

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFeedBubbleTipsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }

    /* renamed from: a */
    public final <T extends View> T mo4509a(int i) {
        T findViewById = findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        return null;
    }

    /* renamed from: b */
    public final void mo4510b(View view, View view2, boolean z) {
        if (view != null) {
            if (!(view.getVisibility() == 0)) {
                view = null;
            }
            if (view != null && view2 != null) {
                view2.getLocationInWindow(this.f17731p);
                getLocationInWindow(this.f17732q);
                int[] iArr = this.f17731p;
                int i = iArr[1] - this.f17732q[1];
                int measuredWidth = iArr[0] + (view2.getMeasuredWidth() / 2);
                int measuredWidth2 = measuredWidth - (view.getMeasuredWidth() / 2);
                int measuredWidth3 = measuredWidth + (view.getMeasuredWidth() / 2);
                if (i <= 0) {
                    return;
                }
                if (z) {
                    view.layout(measuredWidth2, i - view.getHeight(), measuredWidth3, i);
                } else {
                    view.layout(view.getLeft(), i - view.getHeight(), view.getRight(), i);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r3 != null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0056, code lost:
        if ((r7.getVisibility() == 0) != false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0087, code lost:
        if ((r0.getVisibility() == 0) != false) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            r2 = this;
            super.onLayout(r3, r4, r5, r6, r7)
            r3 = 2131311484(0x7f093b7c, float:1.824131E38)
            android.view.View r3 = r2.mo4509a(r3)
            r4 = 0
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L_0x0028
            r7 = 2131311489(0x7f093b81, float:1.824132E38)
            android.view.View r7 = r2.mo4509a(r7)
            if (r7 == 0) goto L_0x0020
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L_0x0020
            r7 = 1
            goto L_0x0021
        L_0x0020:
            r7 = 0
        L_0x0021:
            if (r7 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r3 = r5
        L_0x0025:
            if (r3 == 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r3 = r5
        L_0x0029:
            if (r3 != 0) goto L_0x0044
            r7 = 2131297502(0x7f0904de, float:1.821295E38)
            android.view.View r7 = r2.mo4509a(r7)
            if (r7 == 0) goto L_0x0044
            int r0 = r7.getVisibility()
            if (r0 != 0) goto L_0x003c
            r0 = 1
            goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            if (r0 == 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r7 = r5
        L_0x0041:
            if (r7 == 0) goto L_0x0044
            r3 = r7
        L_0x0044:
            r7 = 2131306193(0x7f0926d1, float:1.8230578E38)
            android.view.View r7 = r2.mo4509a(r7)
            if (r7 == 0) goto L_0x0059
            int r0 = r7.getVisibility()
            if (r0 != 0) goto L_0x0055
            r0 = 1
            goto L_0x0056
        L_0x0055:
            r0 = 0
        L_0x0056:
            if (r0 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r7 = r5
        L_0x005a:
            r0 = 2131304754(0x7f092132, float:1.822766E38)
            android.view.View r0 = r2.mo4509a(r0)
            r2.mo4510b(r0, r3, r6)
            r0 = 2131304598(0x7f092096, float:1.8227343E38)
            android.view.View r0 = r2.mo4509a(r0)
            r2.mo4510b(r0, r3, r6)
            r3 = 2131304519(0x7f092047, float:1.8227183E38)
            android.view.View r3 = r2.mo4509a(r3)
            r0 = 2131313436(0x7f09431c, float:1.8245269E38)
            android.view.View r0 = r2.mo4509a(r0)
            if (r0 == 0) goto L_0x008a
            int r1 = r0.getVisibility()
            if (r1 != 0) goto L_0x0086
            r1 = 1
            goto L_0x0087
        L_0x0086:
            r1 = 0
        L_0x0087:
            if (r1 == 0) goto L_0x008a
            goto L_0x008b
        L_0x008a:
            r0 = r5
        L_0x008b:
            r2.mo4510b(r3, r0, r6)
            r3 = 2131306192(0x7f0926d0, float:1.8230576E38)
            android.view.View r3 = r2.mo4509a(r3)
            if (r3 == 0) goto L_0x00e8
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L_0x009f
            r0 = 1
            goto L_0x00a0
        L_0x009f:
            r0 = 0
        L_0x00a0:
            if (r0 == 0) goto L_0x00a3
            r5 = r3
        L_0x00a3:
            if (r5 == 0) goto L_0x00e8
            if (r7 == 0) goto L_0x00e8
            int[] r3 = r2.f17731p
            r7.getLocationInWindow(r3)
            int[] r3 = r2.f17732q
            r2.getLocationInWindow(r3)
            int[] r3 = r2.f17731p
            r0 = r3[r6]
            int[] r0 = r2.f17732q
            r0 = r0[r6]
            r3 = r3[r4]
            int r4 = r7.getMeasuredWidth()
            int r4 = r4 / 2
            int r3 = r3 + r4
            int[] r4 = r2.f17731p
            r4 = r4[r6]
            int r6 = r7.getMeasuredHeight()
            int r6 = r6 / 2
            int r4 = r4 + r6
            int r6 = r5.getMeasuredWidth()
            int r6 = r6 / 2
            int r3 = r3 - r6
            int r6 = r5.getMeasuredWidth()
            int r6 = r6 + r3
            int r7 = r5.getMeasuredHeight()
            int r7 = r7 / 2
            int r4 = r4 - r7
            int r7 = r5.getMeasuredHeight()
            int r7 = r7 + r4
            r5.layout(r3, r4, r6, r7)
        L_0x00e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.FinderFeedBubbleTipsLayout.onLayout(boolean, int, int, int, int):void");
    }

    public void onViewRemoved(View view) {
        C87412m.m108594g(view, "child");
        super.onViewRemoved(view);
        if (Looper.getMainLooper().getThread().getId() != Thread.currentThread().getId()) {
            Log.m105920e("Finder.FeedBubbleTipsLayout", "[onViewRemoved] in other thread. child=" + view + ' ' + C90183c.m112856d() + ' ');
        } else if (isInLayout()) {
            Log.m105920e("Finder.FeedBubbleTipsLayout", "[onViewRemoved] isInLayout child=" + view + ' ' + C90183c.m112856d() + ' ');
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFeedBubbleTipsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }
}
