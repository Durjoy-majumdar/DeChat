package com.tencent.p014mm.plugin.downloader_app.p039ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.tencent.p014mm.C0966R;
import kg3.C76577a;
import p385u2.C111105a;

/* renamed from: com.tencent.mm.plugin.downloader_app.ui.DownloadStateView */
public class DownloadStateView extends AppCompatImageView {

    /* renamed from: f */
    public int f158312f;

    public DownloadStateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f158312f >= 0) {
            C76577a.m92151b(getContext(), 2);
            getWidth();
            getWidth();
            getWidth();
            getHeight();
            getWidth();
            C111105a.m151500b(getContext(), C0966R.color.BW_0_Alpha_0_1);
            throw null;
        }
    }

    public void setProgress(int i) {
        this.f158312f = i;
        postInvalidate();
    }

    public void setProgressColor(int i) {
    }
}
