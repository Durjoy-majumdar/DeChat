package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.g3 */
public class C18200g3 implements AdapterView.OnItemLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ BizTimeLineNewMsgUI f50301d;

    public C18200g3(BizTimeLineNewMsgUI bizTimeLineNewMsgUI) {
        this.f50301d = bizTimeLineNewMsgUI;
    }

    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        BizTimeLineNewMsgUI bizTimeLineNewMsgUI = this.f50301d;
        bizTimeLineNewMsgUI.f50199t = bizTimeLineNewMsgUI.f50194o.getItem(i);
        this.f50301d.getClass();
        BizTimeLineNewMsgUI bizTimeLineNewMsgUI2 = this.f50301d;
        bizTimeLineNewMsgUI2.f50198s.mo108272g(view, i, j, bizTimeLineNewMsgUI2, bizTimeLineNewMsgUI2.f50202w, bizTimeLineNewMsgUI2.f50196q, bizTimeLineNewMsgUI2.f50197r);
        return true;
    }
}
