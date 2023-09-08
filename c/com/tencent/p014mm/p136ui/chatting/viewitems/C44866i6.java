package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.widget.TextView;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.i6 */
public class C44866i6 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TextView f121720d;

    /* renamed from: e */
    public final /* synthetic */ String f121721e;

    public C44866i6(TextView textView, String str) {
        this.f121720d = textView;
        this.f121721e = str;
    }

    public void run() {
        if (this.f121720d.getPaint().measureText(this.f121721e) > ((float) ((this.f121720d.getMeasuredWidth() - this.f121720d.getPaddingLeft()) - this.f121720d.getPaddingRight()))) {
            this.f121720d.setMinLines(2);
        } else {
            this.f121720d.setMinLines(0);
        }
    }
}
