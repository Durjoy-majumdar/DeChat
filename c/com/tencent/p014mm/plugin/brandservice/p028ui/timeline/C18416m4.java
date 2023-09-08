package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import com.tencent.p014mm.plugin.bizui.widget.StoryListView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.BizTimeLineHotView;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.m4 */
public class C18416m4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BizTimeLineUI f51096d;

    public C18416m4(BizTimeLineUI bizTimeLineUI) {
        this.f51096d = bizTimeLineUI;
    }

    public void run() {
        StoryListView storyListView;
        BizTimeLineHotView bizTimeLineHotView;
        if (!this.f51096d.isFinishing() && (storyListView = this.f51096d.f50235f) != null && storyListView.getFirstVisiblePosition() == 0 && (bizTimeLineHotView = this.f51096d.f50245r) != null) {
            bizTimeLineHotView.mo23033e();
        }
    }
}
