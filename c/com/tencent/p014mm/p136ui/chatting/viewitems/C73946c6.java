package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import android.view.ViewStub;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.pluginsdk.p133ui.emoji.RTChattingEmojiView;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.c6 */
public class C73946c6 extends C74023i.C74026c {

    /* renamed from: b */
    public RTChattingEmojiView f217033b;

    /* renamed from: c */
    public ImageView f217034c;

    /* renamed from: d */
    public ViewStub f217035d;

    /* renamed from: e */
    public View f217036e;

    /* renamed from: a */
    public C74023i.C74026c mo103019a(View view, boolean z) {
        super.create(view);
        this.timeTV = (TextView) view.findViewById(C0966R.C0970id.b8z);
        this.f217033b = (RTChattingEmojiView) view.findViewById(C0966R.C0970id.b4c);
        this.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
        this.maskView = view.findViewById(C0966R.C0970id.b7h);
        this.f217036e = view.findViewById(C0966R.C0970id.b4l);
        ((ImageView) view.findViewById(C0966R.C0970id.b4m)).setImageDrawable(C74933u4.m89768e(view.getContext(), C0966R.raw.emoticonstore_capture_icon, -1));
        if (z) {
            this.userTV = (TextView) view.findViewById(C0966R.C0970id.b9_);
        } else {
            this.uploadingPB = (ProgressBar) view.findViewById(C0966R.C0970id.f359466l14);
            this.userTV = (TextView) view.findViewById(C0966R.C0970id.b9_);
            this.stateIV = (ImageView) view.findViewById(C0966R.C0970id.b8v);
            this.f217034c = (ImageView) view.findViewById(C0966R.C0970id.b8x);
        }
        this.f217035d = (ViewStub) view.findViewById(C0966R.C0970id.b8d);
        return this;
    }

    public View getMainContainerView() {
        return this.f217033b;
    }
}
