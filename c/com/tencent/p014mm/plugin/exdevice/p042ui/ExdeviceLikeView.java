package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeView */
public class ExdeviceLikeView extends RelativeLayout {

    /* renamed from: d */
    public Context f111137d;

    /* renamed from: e */
    public int f111138e;

    /* renamed from: f */
    public C41269a f111139f;

    /* renamed from: g */
    public int f111140g;

    /* renamed from: h */
    public TextView f111141h;

    /* renamed from: i */
    public ImageView f111142i;

    /* renamed from: j */
    public ProgressBar f111143j;

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeView$a */
    public interface C41269a {
    }

    public ExdeviceLikeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f111140g = 2;
        this.f111137d = context;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.a4f, this, true);
        this.f111141h = (TextView) inflate.findViewById(C0966R.C0970id.cma);
        this.f111142i = (ImageView) inflate.findViewById(C0966R.C0970id.cm_);
        this.f111143j = (ProgressBar) inflate.findViewById(C0966R.C0970id.cmd);
        setOnClickListener(new C41375t(this));
    }

    public void setLikeNum(int i) {
        this.f111138e = i;
        String str = "" + this.f111138e;
        if (this.f111138e < 0) {
            Log.m105928w("MicroMsg.ExdeviceLikeView", "hy: like num is negative. set to 0");
            str = "0";
        } else if (i > 999) {
            Log.m105918d("MicroMsg.ExdeviceLikeView", "hy: like num exceeded the limit. put plus");
            str = "999+";
        }
        if (this.f111138e <= 0) {
            this.f111141h.setVisibility(8);
        } else {
            this.f111141h.setVisibility(0);
        }
        this.f111141h.setText(str);
    }

    public void setOnLikeViewClickListener(C41269a aVar) {
        this.f111139f = aVar;
    }

    public void setSelfLikeState(int i) {
        this.f111140g = i;
        if (i == 1) {
            this.f111143j.setVisibility(8);
            this.f111141h.setVisibility(0);
            this.f111142i.setVisibility(0);
            this.f111142i.setImageResource(C0966R.raw.device_rank_item_liked);
        } else if (i == 0) {
            this.f111143j.setVisibility(8);
            this.f111141h.setVisibility(0);
            this.f111142i.setVisibility(0);
            this.f111142i.setImageResource(C0966R.raw.device_rank_item_unliked);
        } else if (i == 2) {
            this.f111141h.setVisibility(8);
            this.f111143j.setVisibility(0);
            this.f111142i.setVisibility(8);
        } else {
            Log.m105928w("MicroMsg.ExdeviceLikeView", "hy: error state");
        }
    }

    public ExdeviceLikeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }
}
