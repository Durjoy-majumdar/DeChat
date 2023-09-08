package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.MotionEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import de3.C107029o;
import de3.C75355a0;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.k3 */
public final class C74082k3 extends C74023i.C74026c {

    /* renamed from: b */
    public MMNeat7extView f217403b;

    /* renamed from: c */
    public TextView f217404c;

    /* renamed from: d */
    public TextView f217405d;

    /* renamed from: e */
    public C74083a f217406e;

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.k3$a */
    public static class C74083a extends C107029o {

        /* renamed from: j */
        public View.OnTouchListener f217407j;

        public C74083a(NeatTextView neatTextView, View.OnTouchListener onTouchListener) {
            super(neatTextView, onTouchListener);
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            View.OnTouchListener onTouchListener = this.f217407j;
            if (onTouchListener != null) {
                onTouchListener.onTouch(view, motionEvent);
            }
            return super.onTouch(view, motionEvent);
        }
    }

    /* renamed from: a */
    public C74082k3 mo103154a(View view, boolean z) {
        super.create(view);
        this.f217403b = (MMNeat7extView) view.findViewById(C0966R.C0970id.b4b);
        this.uploadingPB = (ProgressBar) view.findViewById(C0966R.C0970id.f359466l14);
        ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.b8v);
        this.f217404c = (TextView) view.findViewById(C0966R.C0970id.b3g);
        this.f217405d = (TextView) view.findViewById(C0966R.C0970id.b2v);
        this.userTV = (TextView) view.findViewById(C0966R.C0970id.b9_);
        this.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
        this.maskView = view.findViewById(C0966R.C0970id.b7h);
        this.f217406e = new C74083a(this.f217403b, new C75355a0(this.f217403b.getContext()));
        return this;
    }

    public View getMainContainerView() {
        return this.f217403b;
    }
}
