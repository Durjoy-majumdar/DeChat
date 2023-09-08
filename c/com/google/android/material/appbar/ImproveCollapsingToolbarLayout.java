package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB%\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000f"}, mo182094d2 = {"Lcom/google/android/material/appbar/ImproveCollapsingToolbarLayout;", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "", "alpha", "Lrx3/b0;", "setScrimAlpha", "setCustomScrimAlpha", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public final class ImproveCollapsingToolbarLayout extends CollapsingToolbarLayout {
    public ImproveCollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean isLaidOut() {
        return false;
    }

    public final void setCustomScrimAlpha(int i) {
        super.setScrimAlpha(i);
    }

    public void setScrimAlpha(int i) {
    }

    public ImproveCollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
