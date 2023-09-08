package com.tencent.p014mm.plugin.location.p069ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MMImageButton;

/* renamed from: com.tencent.mm.plugin.location.ui.ShareHeader */
public class ShareHeader extends LinearLayout {

    /* renamed from: d */
    public Context f19881d;

    /* renamed from: e */
    public ViewGroup f19882e;

    /* renamed from: f */
    public MMImageButton f19883f;

    /* renamed from: g */
    public MMImageButton f19884g;

    /* renamed from: h */
    public TextView f19885h;

    public ShareHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19881d = context;
        mo5711a();
    }

    /* renamed from: a */
    public final void mo5711a() {
        View inflate = View.inflate(this.f19881d, C0966R.C0971layout.byy, this);
        this.f19882e = (ViewGroup) inflate.findViewById(C0966R.C0970id.eug);
        this.f19883f = (MMImageButton) inflate.findViewById(C0966R.C0970id.f359395kp0);
        this.f19884g = (MMImageButton) inflate.findViewById(C0966R.C0970id.kpa);
        this.f19885h = (TextView) inflate.findViewById(C0966R.C0970id.knx);
    }

    public ViewGroup getHeaderBar() {
        return this.f19882e;
    }

    public void setOnLeftClickListener(View.OnClickListener onClickListener) {
        this.f19883f.setOnClickListener(onClickListener);
    }

    public void setOnRightClickListener(View.OnClickListener onClickListener) {
        this.f19884g.setOnClickListener(onClickListener);
    }

    public void setTitle(String str) {
        this.f19885h.setText(str);
    }

    public void setTitleColor(int i) {
        this.f19885h.setTextColor(i);
    }

    public ShareHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19881d = context;
        mo5711a();
    }
}
