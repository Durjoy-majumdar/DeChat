package com.tencent.p014mm.plugin.downloader_app.p039ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.downloader_app.model.C40990e0;
import com.tencent.p014mm.sdk.platformtools.Util;
import j51.C46409i;
import j51.C46410j;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.downloader_app.ui.DownloadUpdateDescView */
public class DownloadUpdateDescView extends FrameLayout implements C111847h {

    /* renamed from: d */
    public TextView f110448d;

    /* renamed from: e */
    public TextView f110449e;

    /* renamed from: f */
    public C40990e0 f110450f;

    public DownloadUpdateDescView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f110448d = (TextView) findViewById(C0966R.C0970id.l0n);
        TextView textView = (TextView) findViewById(C0966R.C0970id.l0m);
        this.f110449e = textView;
        textView.setOnClickListener(new C46409i(this));
    }

    public void setData(C40990e0 e0Var) {
        this.f110450f = e0Var;
        if (!Util.isNullOrNil(e0Var.f110340k)) {
            setVisibility(0);
            this.f110448d.setMaxLines(2);
            this.f110449e.setVisibility(8);
            this.f110448d.setText(this.f110450f.f110340k);
            this.f110448d.post(new C46410j(this));
            return;
        }
        setVisibility(8);
    }
}
