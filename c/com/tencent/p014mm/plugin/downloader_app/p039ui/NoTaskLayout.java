package com.tencent.p014mm.plugin.downloader_app.p039ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import d51.C7171c;
import u41.C52427g;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.downloader_app.ui.NoTaskLayout */
public class NoTaskLayout extends RelativeLayout implements C111847h {

    /* renamed from: d */
    public ImageView f110451d;

    /* renamed from: e */
    public BottomEntranceView f110452e;

    public NoTaskLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f110451d = (ImageView) findViewById(C0966R.C0970id.f5s);
        this.f110452e = (BottomEntranceView) findViewById(C0966R.C0970id.agp);
        C7171c.m7371a(this.f110451d, "download_non_task");
    }

    public void setData(C52427g gVar) {
        this.f110452e.setData(gVar);
    }
}
