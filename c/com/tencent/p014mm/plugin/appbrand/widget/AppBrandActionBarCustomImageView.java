package com.tencent.p014mm.plugin.appbrand.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/widget/AppBrandActionBarCustomImageView;", "Landroid/widget/ImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "luggage-wxa-app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.widget.AppBrandActionBarCustomImageView */
public final class AppBrandActionBarCustomImageView extends ImageView {
    public AppBrandActionBarCustomImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            int action = motionEvent.getAction();
            if (action == 0) {
                setAlpha(0.5f);
            } else if (action == 1) {
                setAlpha(1.0f);
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
