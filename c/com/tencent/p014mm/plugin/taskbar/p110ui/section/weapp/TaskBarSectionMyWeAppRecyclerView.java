package com.tencent.p014mm.plugin.taskbar.p110ui.section.weapp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.appbrand.widget.desktop.C68685a;
import com.tencent.p014mm.plugin.appbrand.widget.desktop.C68691e;
import com.tencent.p014mm.plugin.taskbar.p110ui.section.weapp.TaskBarSectionWeAppRecyclerView;

/* renamed from: com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionMyWeAppRecyclerView */
public class TaskBarSectionMyWeAppRecyclerView extends TaskBarSectionWeAppRecyclerView {
    public TaskBarSectionMyWeAppRecyclerView(Context context) {
        super(context);
    }

    /* renamed from: B1 */
    public void mo98285B1(RecyclerView.C16631z zVar, View view, C68691e.C68692a aVar, int i) {
        TaskBarSectionWeAppRecyclerView.C71348e eVar = this.f206642G1;
        if (eVar != null) {
            eVar.mo98228k(zVar, view, aVar, i, true);
        }
    }

    /* renamed from: C1 */
    public void mo98286C1(int i, boolean z, boolean z2) {
    }

    /* renamed from: D1 */
    public void mo98287D1(float f, float f2) {
    }

    /* renamed from: E1 */
    public void mo98288E1() {
        TaskBarSectionWeAppRecyclerView.C71348e eVar = this.f206642G1;
        if (eVar != null) {
            eVar.mo98223f();
        }
    }

    /* renamed from: F1 */
    public void mo98289F1(C68685a aVar) {
        TaskBarSectionWeAppRecyclerView.C71348e eVar = this.f206642G1;
        if (eVar != null) {
            eVar.mo98220c(getDataList().get(aVar.mo17363j()), true);
        }
    }

    /* renamed from: x1 */
    public void mo98290x1(int i, C68691e.C68692a aVar) {
        this.f206642G1.mo98221d(aVar, i);
    }

    public TaskBarSectionMyWeAppRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TaskBarSectionMyWeAppRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
