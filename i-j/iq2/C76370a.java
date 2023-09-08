package iq2;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: iq2.a */
public class C76370a extends PopupWindow implements PopupWindow.OnDismissListener {

    /* renamed from: d */
    public PopupWindow.OnDismissListener f223651d;

    /* renamed from: e */
    public boolean f223652e;

    /* renamed from: f */
    public Context f223653f;

    public C76370a(Context context) {
        super(context);
        super.setOnDismissListener(this);
        this.f223653f = context;
    }

    /* renamed from: a */
    public void mo106601a(float f) {
        SnsMethodCalculate.markStartTimeMs("dimBehind", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackPopupWindow");
        try {
            View rootView = getContentView().getRootView();
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
            layoutParams.flags |= 2;
            layoutParams.dimAmount = f;
            ((WindowManager) this.f223653f.getSystemService("window")).updateViewLayout(rootView, layoutParams);
        } catch (Throwable unused) {
            Log.m105928w("FeedbackPopupWindow", "the window dim account is set failed!");
        }
        SnsMethodCalculate.markEndTimeMs("dimBehind", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackPopupWindow");
    }

    public void dismiss() {
        PopupWindow.OnDismissListener onDismissListener;
        SnsMethodCalculate.markStartTimeMs("dismiss", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackPopupWindow");
        try {
            super.dismiss();
        } catch (Throwable unused) {
            if (!this.f223652e && (onDismissListener = this.f223651d) != null) {
                onDismissListener.onDismiss();
            }
        }
        SnsMethodCalculate.markEndTimeMs("dismiss", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackPopupWindow");
    }

    public void onDismiss() {
        SnsMethodCalculate.markStartTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackPopupWindow");
        try {
            this.f223652e = true;
            PopupWindow.OnDismissListener onDismissListener = this.f223651d;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackPopupWindow");
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        SnsMethodCalculate.markStartTimeMs("setOnDismissListener", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackPopupWindow");
        this.f223651d = onDismissListener;
        SnsMethodCalculate.markEndTimeMs("setOnDismissListener", "com.tencent.mm.plugin.sns.ad.timeline.feedback.ui.FeedbackPopupWindow");
    }
}
