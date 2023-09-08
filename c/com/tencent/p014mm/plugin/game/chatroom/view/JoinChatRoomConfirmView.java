package com.tencent.p014mm.plugin.game.chatroom.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.game.autogen.chatroom.RestrictRule;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.JoinChatRoomConfirmView */
public class JoinChatRoomConfirmView extends LinearLayout {

    /* renamed from: d */
    public Context f112577d;

    /* renamed from: e */
    public long f112578e;

    /* renamed from: f */
    public long f112579f;

    /* renamed from: g */
    public TextView f112580g;

    /* renamed from: h */
    public LinearLayout f112581h;

    /* renamed from: i */
    public TextView f112582i;

    /* renamed from: j */
    public ImageView f112583j;

    /* renamed from: n */
    public TextView f112584n;

    /* renamed from: com.tencent.mm.plugin.game.chatroom.view.JoinChatRoomConfirmView$a */
    public class C41777a implements Runnable {

        /* renamed from: d */
        public View f112585d;

        /* renamed from: e */
        public View f112586e;

        public C41777a(View view, View view2) {
            this.f112585d = view;
            this.f112586e = view2;
        }

        public void run() {
            JoinChatRoomConfirmView.this.f112581h.removeAllViews();
            View view = this.f112585d;
            int measuredWidth = view != null ? view.getMeasuredWidth() : 0;
            View view2 = this.f112586e;
            if (measuredWidth + (view2 != null ? view2.getMeasuredWidth() : 0) > JoinChatRoomConfirmView.this.f112581h.getMeasuredWidth()) {
                JoinChatRoomConfirmView.this.f112581h.setOrientation(1);
            } else {
                JoinChatRoomConfirmView.this.f112581h.setOrientation(0);
            }
            View view3 = this.f112585d;
            if (view3 != null) {
                JoinChatRoomConfirmView.this.f112581h.addView(view3);
            }
            View view4 = this.f112586e;
            if (view4 != null) {
                JoinChatRoomConfirmView.this.f112581h.addView(view4);
            }
        }
    }

    public JoinChatRoomConfirmView(Context context) {
        super(context);
        mo65560a();
    }

    /* renamed from: a */
    public final void mo65560a() {
        Context context = getContext();
        this.f112577d = context;
        LayoutInflater.from(context).inflate(C0966R.C0971layout.b2w, this, true);
        this.f112580g = (TextView) findViewById(C0966R.C0970id.fe9);
        this.f112581h = (LinearLayout) findViewById(C0966R.C0970id.fe7);
        this.f112582i = (TextView) findViewById(C0966R.C0970id.fdw);
        this.f112583j = (ImageView) findViewById(C0966R.C0970id.fed);
        this.f112584n = (TextView) findViewById(C0966R.C0970id.fdy);
    }

    /* renamed from: b */
    public final View mo65561b(RestrictRule restrictRule) {
        View inflate = LayoutInflater.from(this.f112577d).inflate(C0966R.C0971layout.f6818pd, this, false);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.fe_);
        ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.fe8);
        textView.setText(restrictRule.rule_desc);
        float p = C76577a.m92165p(getContext());
        imageView.getLayoutParams().height = (int) (((float) imageView.getLayoutParams().height) * p);
        imageView.getLayoutParams().width = (int) (((float) imageView.getLayoutParams().width) * p);
        imageView.requestLayout();
        if (restrictRule.can_pass) {
            textView.setTextColor(this.f112577d.getResources().getColor(C0966R.color.f2973b4));
            imageView.setImageResource(C0966R.raw.chat_room_rule_pass_dark);
        } else {
            textView.setTextColor(this.f112577d.getResources().getColor(C0966R.color.BW_100_Alpha_0_5));
            imageView.setImageResource(C0966R.raw.chat_room_rule_reject_dark);
        }
        inflate.measure(0, 0);
        return inflate;
    }

    public JoinChatRoomConfirmView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo65560a();
    }

    public JoinChatRoomConfirmView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo65560a();
    }
}
