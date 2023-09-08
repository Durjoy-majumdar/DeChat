package com.tencent.p014mm.plugin.sns.p106ui;

import android.app.Dialog;
import android.view.MotionEvent;
import android.view.View;
import as2.C92086h;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI;
import com.tencent.p014mm.plugin.sns.p106ui.SnsCommentFooter;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import cs2.C45199a;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.h4 */
public class C95806h4 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ SnsCommentFooter f279559d;

    public C95806h4(SnsCommentFooter snsCommentFooter) {
        this.f279559d = snsCommentFooter;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsCommentFooter$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$8");
        this.f279559d.setToSendTextColor(true);
        SnsCommentFooter snsCommentFooter = this.f279559d;
        SnsMethodCalculate.markStartTimeMs("access$1502", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        snsCommentFooter.getClass();
        SnsMethodCalculate.markEndTimeMs("access$1502", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        SnsCommentFooter.m122044e(this.f279559d);
        SnsCommentFooter.m122043d(this.f279559d).setImageResource(C0966R.raw.icons_outlined_emoji);
        SnsCommentFooter snsCommentFooter2 = this.f279559d;
        SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        SnsCommentFooter.C95534e eVar = snsCommentFooter2.f278047J;
        SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        if (eVar != null) {
            SnsCommentFooter snsCommentFooter3 = this.f279559d;
            SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            SnsCommentFooter.C95534e eVar2 = snsCommentFooter3.f278047J;
            SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            SnsCommentDetailUI.C9549828 r0 = (SnsCommentDetailUI.C9549828) eVar2;
            r0.getClass();
            SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$28");
            if (!C92086h.m115756c(r10.getLocalid())) {
                SnsCommentDetailUI snsCommentDetailUI = SnsCommentDetailUI.this;
                int i = SnsCommentDetailUI.f277824M1;
                SnsMethodCalculate.markStartTimeMs("access$4300", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                Dialog dialog = snsCommentDetailUI.f277855R0;
                SnsMethodCalculate.markEndTimeMs("access$4300", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                if (dialog != null) {
                    SnsCommentDetailUI snsCommentDetailUI2 = SnsCommentDetailUI.this;
                    SnsMethodCalculate.markStartTimeMs("access$4300", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    Dialog dialog2 = snsCommentDetailUI2.f277855R0;
                    SnsMethodCalculate.markEndTimeMs("access$4300", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                    if (dialog2.isShowing()) {
                        SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$28");
                    }
                }
                SnsCommentDetailUI snsCommentDetailUI3 = SnsCommentDetailUI.this;
                Dialog a = C45199a.m50003a(snsCommentDetailUI3.getContext(), SnsCommentDetailUI.this.f277840H1.mo132426b(0));
                SnsMethodCalculate.markStartTimeMs("access$4302", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                snsCommentDetailUI3.f277855R0 = a;
                SnsMethodCalculate.markEndTimeMs("access$4302", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$28");
            } else if (SnsCommentDetailUI.this.keyboardState() == 1 || SnsCommentDetailUI.m121977Z7(SnsCommentDetailUI.this).mo132700s()) {
                SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$28");
            } else {
                SnsCommentDetailUI.m121969R7(SnsCommentDetailUI.this);
                SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$28");
            }
        }
        SnsCommentFooter.m122049j(this.f279559d, 0);
        SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$8");
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/ui/SnsCommentFooter$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
