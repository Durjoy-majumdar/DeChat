package com.tencent.p014mm.plugin.messenger;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import p196ln.C76705f;

/* renamed from: com.tencent.mm.plugin.messenger.SwitchContactDialogCustomView */
public class SwitchContactDialogCustomView extends LinearLayout {

    /* renamed from: d */
    public TextView f19985d = ((TextView) findViewById(C0966R.C0970id.knx));

    /* renamed from: e */
    public TextView f19986e = ((TextView) findViewById(C0966R.C0970id.br8));

    /* renamed from: f */
    public ImageView f19987f = ((ImageView) findViewById(C0966R.C0970id.hvs));

    /* renamed from: g */
    public TextView f19988g = ((TextView) findViewById(C0966R.C0970id.f357845c22));

    /* renamed from: h */
    public TextView f19989h = ((TextView) findViewById(C0966R.C0970id.k9g));

    public SwitchContactDialogCustomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(C0966R.C0971layout.f6370cz, this);
    }

    public void setContent(String str) {
        this.f19986e.setText(str);
    }

    public void setDesc(String str) {
        this.f19988g.setText(str);
    }

    public void setOnPhotoOnClick(View.OnClickListener onClickListener) {
        ImageView imageView = this.f19987f;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }

    public void setPhoto(String str) {
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(this.f19987f, str);
    }

    public void setSubDesc(String str) {
        this.f19989h.setText(str);
    }

    public void setTilte(String str) {
        this.f19985d.setText(str);
    }
}
