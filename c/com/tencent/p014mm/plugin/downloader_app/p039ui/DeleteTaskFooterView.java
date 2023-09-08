package com.tencent.p014mm.plugin.downloader_app.p039ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.downloader_app.model.C41008v;
import com.tencent.p014mm.plugin.downloader_app.model.v$$d;
import d51.C7171c;
import j51.C46400c;
import j51.C46401d;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.downloader_app.ui.DeleteTaskFooterView */
public class DeleteTaskFooterView extends LinearLayout implements C111847h {

    /* renamed from: o */
    public static final /* synthetic */ int f110418o = 0;

    /* renamed from: d */
    public LinearLayout f110419d;

    /* renamed from: e */
    public ImageView f110420e;

    /* renamed from: f */
    public LinearLayout f110421f;

    /* renamed from: g */
    public TextView f110422g;

    /* renamed from: h */
    public ImageView f110423h;

    /* renamed from: i */
    public boolean f110424i = true;

    /* renamed from: j */
    public boolean f110425j = false;

    /* renamed from: n */
    public v$$d f110426n = new C41019a();

    /* renamed from: com.tencent.mm.plugin.downloader_app.ui.DeleteTaskFooterView$a */
    public class C41019a implements v$$d {
        public C41019a() {
        }

        /* renamed from: a */
        public void mo64028a(boolean z) {
            DeleteTaskFooterView deleteTaskFooterView = DeleteTaskFooterView.this;
            if (z) {
                deleteTaskFooterView.f110421f.setClickable(true);
                C7171c.m7371a(deleteTaskFooterView.f110423h, "download_delete_enable");
                deleteTaskFooterView.f110422g.setTextColor(deleteTaskFooterView.getContext().getResources().getColor(C0966R.color.f2966ao));
                return;
            }
            deleteTaskFooterView.f110421f.setClickable(false);
            C7171c.m7371a(deleteTaskFooterView.f110423h, "download_delete_disable");
            deleteTaskFooterView.f110422g.setTextColor(deleteTaskFooterView.getContext().getResources().getColor(C0966R.color.FG_4));
        }
    }

    public DeleteTaskFooterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C41008v.f110377c.add(this.f110426n);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C41008v.f110377c.remove(this.f110426n);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f7123yz, this, true);
        this.f110419d = (LinearLayout) inflate.findViewById(C0966R.C0970id.b_a);
        this.f110420e = (ImageView) inflate.findViewById(C0966R.C0970id.b__);
        this.f110419d.setOnClickListener(new C46400c(this));
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0966R.C0970id.c1a);
        this.f110421f = linearLayout;
        linearLayout.setOnClickListener(new C46401d(this));
        this.f110421f.setClickable(false);
        this.f110422g = (TextView) inflate.findViewById(C0966R.C0970id.c16);
        this.f110423h = (ImageView) inflate.findViewById(C0966R.C0970id.c1c);
    }
}
