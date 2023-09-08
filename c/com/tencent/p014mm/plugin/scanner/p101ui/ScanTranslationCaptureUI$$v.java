package com.tencent.p014mm.plugin.scanner.p101ui;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.plugin.scanner.p101ui.ScanTranslationCaptureUI;

/* renamed from: com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI$$v */
public class ScanTranslationCaptureUI$$v extends BaseAdapter {

    /* renamed from: d */
    public Bitmap f273276d;

    /* renamed from: e */
    public final /* synthetic */ ScanTranslationCaptureUI f273277e;

    public ScanTranslationCaptureUI$$v(ScanTranslationCaptureUI scanTranslationCaptureUI, ScanTranslationCaptureUI.C1156751 r2) {
        this.f273277e = scanTranslationCaptureUI;
    }

    public int getCount() {
        return 1;
    }

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        MultiTouchImageView multiTouchImageView;
        if (view == null) {
            multiTouchImageView = new MultiTouchImageView(this.f273277e, 0, 0);
            multiTouchImageView.setLayoutParams(new Gallery.LayoutParams(-1, -1));
        } else {
            multiTouchImageView = (MultiTouchImageView) view;
        }
        Bitmap bitmap = this.f273276d;
        if (bitmap != null) {
            multiTouchImageView.setImageBitmap(bitmap);
            int width = this.f273276d.getWidth();
            int height = this.f273276d.getHeight();
            multiTouchImageView.f348280o = width;
            multiTouchImageView.f348281p = height;
            multiTouchImageView.mo26059d();
        }
        return multiTouchImageView;
    }
}
