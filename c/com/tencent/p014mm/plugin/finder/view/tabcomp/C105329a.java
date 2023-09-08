package com.tencent.p014mm.plugin.finder.view.tabcomp;

import com.tencent.p014mm.plugin.finder.view.tabcomp.FinderTabLayout;

/* renamed from: com.tencent.mm.plugin.finder.view.tabcomp.a */
public class C105329a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderTabLayout.C105325e f313041d;

    public C105329a(FinderTabLayout.C105325e eVar) {
        this.f313041d = eVar;
    }

    public void run() {
        int childCount = this.f313041d.getChildCount();
        if (childCount % 2 != 0) {
            int i = childCount / 2;
            int paddingStart = this.f313041d.getPaddingStart();
            int paddingEnd = this.f313041d.getPaddingEnd();
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                i2 += this.f313041d.getChildAt(i3).getWidth() + paddingStart;
            }
            int i4 = 0;
            for (int i5 = i + 1; i5 < childCount; i5++) {
                i4 += this.f313041d.getChildAt(i5).getWidth() + paddingEnd;
            }
            if (i2 > i4) {
                FinderTabLayout.C105325e.m141454a(this.f313041d, false, (paddingEnd + i2) - i4);
                return;
            }
            FinderTabLayout.C105325e.m141454a(this.f313041d, true, (paddingStart + i4) - i2);
        }
    }
}
