package com.tencent.p014mm.sdk.platformtools;

import android.widget.ListView;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;

/* renamed from: com.tencent.mm.sdk.platformtools.SmoothScrollToPosition21below */
class SmoothScrollToPosition21below implements BackwardSupportUtil.SmoothScrollFactory.IScroll {
    public void doScroll(ListView listView) {
        listView.setSelection(0);
    }

    public void doScrollFromTop(ListView listView, int i) {
        listView.setSelectionFromTop(i, 0);
    }

    public void doScroll(ListView listView, int i) {
        listView.setSelection(i);
    }
}
