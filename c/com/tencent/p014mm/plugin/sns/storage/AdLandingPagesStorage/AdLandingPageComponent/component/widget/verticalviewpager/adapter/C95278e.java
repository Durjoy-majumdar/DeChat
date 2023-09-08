package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95295z;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.e */
public class C95278e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ContentFragment f276533d;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.e$a */
    public class C95279a implements ViewTreeObserver.OnPreDrawListener {
        public C95279a() {
        }

        public boolean onPreDraw() {
            SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$7$1");
            if (ContentFragment.C95273g.m121322a(ContentFragment.m121305M(C95278e.this.f276533d)).getHeight() > 0) {
                ContentFragment.C95273g.m121322a(ContentFragment.m121305M(C95278e.this.f276533d)).getViewTreeObserver().removeOnPreDrawListener(this);
                ContentFragment contentFragment = C95278e.this.f276533d;
                int height = ContentFragment.C95273g.m121322a(ContentFragment.m121305M(contentFragment)).getHeight();
                SnsMethodCalculate.markStartTimeMs("access$1602", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                contentFragment.f276487G = height;
                SnsMethodCalculate.markEndTimeMs("access$1602", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                ContentFragment contentFragment2 = C95278e.this.f276533d;
                SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                int i = contentFragment2.f276487G;
                SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                if (i < ContentFragment.m121306N(C95278e.this.f276533d)) {
                    ContentFragment contentFragment3 = C95278e.this.f276533d;
                    int N = ContentFragment.m121306N(contentFragment3);
                    SnsMethodCalculate.markStartTimeMs("access$1602", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                    contentFragment3.f276487G = N;
                    SnsMethodCalculate.markEndTimeMs("access$1602", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ContentFragment.m121305M(C95278e.this.f276533d).f276522b.getLayoutParams();
                ContentFragment contentFragment4 = C95278e.this.f276533d;
                SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                int i2 = contentFragment4.f276487G;
                SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                layoutParams.height = i2;
                ContentFragment.m121305M(C95278e.this.f276533d).f276522b.setLayoutParams(layoutParams);
                Log.m105924i("ContentFragment", "set bgIV height " + ContentFragment.C95273g.m121322a(ContentFragment.m121305M(C95278e.this.f276533d)).getHeight() + ", count " + ContentFragment.C95273g.m121322a(ContentFragment.m121305M(C95278e.this.f276533d)).getChildCount());
                for (int i3 = 0; i3 < ContentFragment.C95273g.m121322a(ContentFragment.m121305M(C95278e.this.f276533d)).getChildCount(); i3++) {
                    Object tag = ContentFragment.C95273g.m121322a(ContentFragment.m121305M(C95278e.this.f276533d)).getChildAt(i3).getTag();
                    if (tag instanceof C95295z) {
                        ((C95295z) tag).mo67235C();
                    }
                }
                ContentFragment.C95273g.m121322a(ContentFragment.m121305M(C95278e.this.f276533d)).removeAllViews();
                ContentFragment.C95273g.m121322a(ContentFragment.m121305M(C95278e.this.f276533d)).setVisibility(8);
            }
            SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$7$1");
            return true;
        }
    }

    public C95278e(ContentFragment contentFragment) {
        this.f276533d = contentFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0036, code lost:
        if (android.text.TextUtils.isEmpty(r2.f295426a) == false) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r10 = this;
            java.lang.String r0 = "run"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$7"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment r2 = r10.f276533d
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$g r2 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.m121305M(r2)
            if (r2 != 0) goto L_0x0014
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x0014:
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment r2 = r10.f276533d
            java.lang.String r3 = "access$700"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            ps2.l r2 = r2.f276482B
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            boolean r2 = r2.f295428c
            if (r2 != 0) goto L_0x0038
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment r2 = r10.f276533d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            ps2.l r2 = r2.f276482B
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            java.lang.String r2 = r2.f295426a
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x00f7
        L_0x0038:
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment r2 = r10.f276533d
            java.lang.String r3 = "access$1500"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            boolean r2 = r2.f276486F
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            if (r2 != 0) goto L_0x00f7
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment r2 = r10.f276533d
            java.lang.String r3 = "access$1502"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            r5 = 1
            r2.f276486F = r5
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment r2 = r10.f276533d
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$g r2 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.m121305M(r2)
            android.widget.LinearLayout r2 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.C95273g.m121322a(r2)
            r3 = 0
            r2.setVisibility(r3)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment r2 = r10.f276533d
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$g r2 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.m121305M(r2)
            android.widget.ImageView r2 = r2.f276522b
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_CROP
            r2.setScaleType(r4)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment r2 = r10.f276533d
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$g r2 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.m121305M(r2)
            android.widget.LinearLayout r2 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.C95273g.m121322a(r2)
            android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.e$a r4 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.e$a
            r4.<init>()
            r2.addOnPreDrawListener(r4)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment r2 = r10.f276533d
            ws2.a r2 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.m121304L(r2)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment r4 = r10.f276533d
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$g r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.m121305M(r4)
            android.widget.LinearLayout r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.C95273g.m121322a(r4)
            r2.getClass()
            java.lang.String r5 = "getPageHeight"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
        L_0x009e:
            ps2.l r7 = r2.f301781d
            java.util.LinkedList<qs2.a0> r7 = r7.f295429d
            int r7 = r7.size()
            if (r3 >= r7) goto L_0x00f4
            ps2.l r7 = r2.f301781d
            java.util.LinkedList<qs2.a0> r7 = r7.f295429d
            java.lang.Object r7 = r7.get(r3)
            qs2.a0 r7 = (qs2.C101255a0) r7
            android.content.Context r8 = r4.getContext()
            int r9 = r2.f301783f
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z r7 = com.tencent.p014mm.plugin.sns.p106ui.C96328z2.m123559a(r8, r7, r4, r9)
            android.view.View r8 = r7.mo131855p()
            android.view.ViewParent r8 = r8.getParent()
            if (r8 == 0) goto L_0x00e3
            android.view.View r8 = r7.mo131855p()
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.ViewGroup
            if (r8 == 0) goto L_0x00e3
            android.view.View r8 = r7.mo131855p()
            android.view.ViewParent r8 = r8.getParent()
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            android.view.View r9 = r7.mo131855p()
            r8.removeView(r9)
        L_0x00e3:
            android.view.View r8 = r7.mo131855p()
            r8.setTag(r7)
            android.view.View r7 = r7.mo131855p()
            r4.addView(r7)
            int r3 = r3 + 1
            goto L_0x009e
        L_0x00f4:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
        L_0x00f7:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.C95278e.run():void");
    }
}
