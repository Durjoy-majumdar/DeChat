package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import p206nj.C11171e;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.DialNumberButton */
public class DialNumberButton extends RelativeLayout {

    /* renamed from: d */
    public TextView f313278d = ((TextView) findViewById(C0966R.C0970id.c5u));

    /* renamed from: e */
    public TextView f313279e = ((TextView) findViewById(C0966R.C0970id.c5v));

    public DialNumberButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f7138zg, this);
        if (C11171e.m11046c(16)) {
            this.f313278d.setTypeface(Typeface.create("sans-serif-light", 0));
            this.f313279e.setTypeface(Typeface.create("sans-serif-normal", 0));
        }
        setClipChildren(false);
        setClipToPadding(false);
    }

    public String getNumberText() {
        return this.f313278d.getText().toString();
    }

    public String getOtherText() {
        return this.f313279e.getText().toString();
    }

    public void setInTalkUIMode(boolean z) {
        if (z) {
            if ("#".equals(this.f313278d.getText()) || "*".equals(this.f313278d.getText())) {
                this.f313278d.setTextColor(getContext().getResources().getColor(C0966R.color.f3298mv));
            } else {
                this.f313278d.setTextColor(getContext().getResources().getColor(C0966R.color.f3300mx));
            }
            this.f313279e.setTextColor(getContext().getResources().getColor(C0966R.color.f3298mv));
            setBackgroundDrawable(getResources().getDrawable(C0966R.C0969drawable.f4894qg));
            return;
        }
        if ("#".equals(this.f313278d.getText()) || "*".equals(this.f313278d.getText())) {
            this.f313278d.setTextColor(getContext().getResources().getColor(C0966R.color.f3298mv));
        } else {
            this.f313278d.setTextColor(getContext().getResources().getColor(C0966R.color.f3299mw));
        }
        this.f313279e.setTextColor(getContext().getResources().getColor(C0966R.color.f3298mv));
        setBackgroundDrawable(getResources().getDrawable(C0966R.C0969drawable.f4895qh));
    }
}
