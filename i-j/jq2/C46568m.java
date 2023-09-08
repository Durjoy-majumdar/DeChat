package jq2;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.PhotosContent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import kg3.C76577a;

/* renamed from: jq2.m */
public class C46568m {
    /* renamed from: a */
    public static ImageView m51894a(Context context, PhotosContent photosContent, int i, int i2) {
        FrameLayout.LayoutParams layoutParams;
        SnsMethodCalculate.markStartTimeMs("getWeAppIconView", "com.tencent.mm.plugin.sns.ad.timeline.helper.AddWeAppIconHelper");
        if (context == null || photosContent == null) {
            SnsMethodCalculate.markEndTimeMs("getWeAppIconView", "com.tencent.mm.plugin.sns.ad.timeline.helper.AddWeAppIconHelper");
            return null;
        }
        try {
            SnsMethodCalculate.markStartTimeMs("getEachImageViewLayoutParams", "com.tencent.mm.plugin.sns.ui.PhotosContent");
            View childAt = photosContent.getChildAt(i);
            if (childAt != null) {
                layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                SnsMethodCalculate.markEndTimeMs("getEachImageViewLayoutParams", "com.tencent.mm.plugin.sns.ui.PhotosContent");
            } else {
                SnsMethodCalculate.markEndTimeMs("getEachImageViewLayoutParams", "com.tencent.mm.plugin.sns.ui.PhotosContent");
                layoutParams = null;
            }
            if (layoutParams != null) {
                ImageView imageView = new ImageView(context);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
                layoutParams2.width = i2;
                layoutParams2.height = i2;
                imageView.setImageDrawable(C76577a.m92158i(context, C0966R.C0969drawable.boh));
                imageView.setLayoutParams(layoutParams2);
                SnsMethodCalculate.markEndTimeMs("getWeAppIconView", "com.tencent.mm.plugin.sns.ad.timeline.helper.AddWeAppIconHelper");
                return imageView;
            }
            Log.m105920e("AddWeAppIconHelper", "getEachImageViewLayoutParams is null");
            SnsMethodCalculate.markEndTimeMs("getWeAppIconView", "com.tencent.mm.plugin.sns.ad.timeline.helper.AddWeAppIconHelper");
            return null;
        } catch (Throwable th) {
            Log.m105920e("AddWeAppIconHelper", th.toString());
        }
    }
}
