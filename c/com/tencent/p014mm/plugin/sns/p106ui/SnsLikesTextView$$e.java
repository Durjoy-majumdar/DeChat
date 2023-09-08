package com.tencent.p014mm.plugin.sns.p106ui;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import go3.C76003c;
import java.lang.ref.WeakReference;
import kg3.C76577a;
import rq2.C63489a;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsLikesTextView$$e */
public class SnsLikesTextView$$e implements C63489a.C63493f {

    /* renamed from: a */
    public WeakReference<SnsLikesTextView> f116605a;

    /* renamed from: b */
    public int f116606b;

    public SnsLikesTextView$$e(SnsLikesTextView snsLikesTextView) {
        this.f116605a = new WeakReference<>(snsLikesTextView);
        this.f116606b = C76577a.m92151b(snsLikesTextView.getContext(), 16);
    }

    /* renamed from: a */
    public void mo67280a(Bitmap bitmap, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView$DownloadCallback");
        try {
            WeakReference<SnsLikesTextView> weakReference = this.f116605a;
            if (weakReference == null) {
                SnsMethodCalculate.markEndTimeMs("onDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView$DownloadCallback");
                return;
            }
            SnsLikesTextView snsLikesTextView = weakReference.get();
            if (snsLikesTextView == null) {
                SnsMethodCalculate.markEndTimeMs("onDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView$DownloadCallback");
                return;
            }
            Object tag = snsLikesTextView.f278254i.getTag(C0966R.C0970id.lww);
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
            String str = snsLikesTextView.f278265w;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
            if (tag instanceof String) {
                String str2 = (String) tag;
                if (!TextUtils.isEmpty(str) && str.equals(str2) && snsLikesTextView.f278255j != null) {
                    SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
                    Drawable drawable = snsLikesTextView.f278264v;
                    SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView");
                    if (z && bitmap != null) {
                        drawable = new BitmapDrawable(MMApplicationContext.getContext().getResources(), bitmap);
                        int i = this.f116606b;
                        drawable.setBounds(0, 0, i, i);
                    }
                    drawable.setColorFilter(snsLikesTextView.getResources().getColor(C0966R.color.f2958ae), PorterDuff.Mode.SRC_ATOP);
                    snsLikesTextView.f278255j.setSpan(new C76003c(drawable, 1), 0, 1, 33);
                    snsLikesTextView.f278254i.setText(snsLikesTextView.f278255j, TextView.BufferType.SPANNABLE);
                }
            }
            SnsMethodCalculate.markEndTimeMs("onDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView$DownloadCallback");
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.SnsLikesTextView", "onDownloadResult, exp=" + th.toString());
        }
    }
}
