package com.tencent.p014mm.plugin.voip.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;
import l33.C76669d;

/* renamed from: com.tencent.mm.plugin.voip.widget.VoipBigIconButton */
public class VoipBigIconButton extends FrameLayout {

    /* renamed from: d */
    public ImageView f207526d;

    /* renamed from: e */
    public TextView f207527e;

    /* renamed from: f */
    public Drawable f207528f = null;

    /* renamed from: g */
    public Drawable f207529g = null;

    /* renamed from: h */
    public Drawable f207530h = null;

    /* renamed from: i */
    public Drawable f207531i = null;

    /* renamed from: j */
    public Context f207532j;

    /* renamed from: n */
    public View.OnTouchListener f207533n = new C71604a();

    /* renamed from: com.tencent.mm.plugin.voip.widget.VoipBigIconButton$a */
    public class C71604a implements View.OnTouchListener {
        public C71604a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/voip/widget/VoipBigIconButton$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            int action = motionEvent.getAction();
            if (action == 0) {
                VoipBigIconButton voipBigIconButton = VoipBigIconButton.this;
                voipBigIconButton.f207526d.setBackgroundDrawable(voipBigIconButton.f207529g);
                VoipBigIconButton voipBigIconButton2 = VoipBigIconButton.this;
                voipBigIconButton2.f207526d.setImageDrawable(voipBigIconButton2.f207531i);
                VoipBigIconButton voipBigIconButton3 = VoipBigIconButton.this;
                voipBigIconButton3.f207527e.setTextColor(voipBigIconButton3.f207532j.getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
            } else if (action == 1) {
                VoipBigIconButton voipBigIconButton4 = VoipBigIconButton.this;
                voipBigIconButton4.f207526d.setBackgroundDrawable(voipBigIconButton4.f207528f);
                VoipBigIconButton voipBigIconButton5 = VoipBigIconButton.this;
                voipBigIconButton5.f207526d.setImageDrawable(voipBigIconButton5.f207530h);
                VoipBigIconButton voipBigIconButton6 = VoipBigIconButton.this;
                voipBigIconButton6.f207527e.setTextColor(voipBigIconButton6.f207532j.getResources().getColor(C0966R.color.al_));
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/voip/widget/VoipBigIconButton$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* JADX INFO: finally extract failed */
    public VoipBigIconButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String str = null;
        this.f207532j = context;
        LayoutInflater.from(context).inflate(C0966R.C0971layout.b5f, this);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C76669d.f224355a, 0, 0);
        try {
            this.f207528f = obtainStyledAttributes.getDrawable(0);
            this.f207529g = obtainStyledAttributes.getDrawable(1);
            this.f207530h = obtainStyledAttributes.getDrawable(2);
            this.f207531i = obtainStyledAttributes.getDrawable(3);
            int resourceId = obtainStyledAttributes.getResourceId(4, -1);
            int resourceId2 = obtainStyledAttributes.getResourceId(4, 0);
            str = resourceId2 != 0 ? getContext().getString(resourceId2) : str;
            obtainStyledAttributes.recycle();
            Drawable drawable = this.f207529g;
            this.f207529g = drawable == null ? this.f207528f : drawable;
            Drawable drawable2 = this.f207531i;
            this.f207531i = drawable2 == null ? this.f207530h : drawable2;
            ImageView imageView = (ImageView) findViewById(C0966R.C0970id.a8w);
            this.f207526d = imageView;
            imageView.setBackgroundDrawable(this.f207528f);
            this.f207526d.setImageDrawable(this.f207530h);
            this.f207526d.setOnTouchListener(this.f207533n);
            this.f207526d.setContentDescription(str);
            TextView textView = (TextView) findViewById(C0966R.C0970id.a8x);
            this.f207527e = textView;
            if (resourceId != -1) {
                textView.setText(getContext().getString(resourceId));
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void setEnabled(boolean z) {
        this.f207526d.setEnabled(z);
        this.f207527e.setEnabled(z);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f207526d.setOnClickListener(onClickListener);
    }
}
