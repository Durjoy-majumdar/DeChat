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

/* renamed from: com.tencent.mm.plugin.voip.widget.VoipSmallIconButton */
public class VoipSmallIconButton extends FrameLayout {

    /* renamed from: d */
    public ImageView f207535d;

    /* renamed from: e */
    public TextView f207536e;

    /* renamed from: f */
    public Drawable f207537f = null;

    /* renamed from: g */
    public Drawable f207538g = null;

    /* renamed from: h */
    public Context f207539h;

    /* renamed from: i */
    public View.OnTouchListener f207540i = new C71605a();

    /* renamed from: com.tencent.mm.plugin.voip.widget.VoipSmallIconButton$a */
    public class C71605a implements View.OnTouchListener {
        public C71605a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/voip/widget/VoipSmallIconButton$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            int action = motionEvent.getAction();
            if (action == 0) {
                VoipSmallIconButton voipSmallIconButton = VoipSmallIconButton.this;
                voipSmallIconButton.f207535d.setImageDrawable(voipSmallIconButton.f207538g);
                VoipSmallIconButton voipSmallIconButton2 = VoipSmallIconButton.this;
                voipSmallIconButton2.f207536e.setTextColor(voipSmallIconButton2.f207539h.getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
            } else if (action == 1) {
                VoipSmallIconButton voipSmallIconButton3 = VoipSmallIconButton.this;
                voipSmallIconButton3.f207535d.setImageDrawable(voipSmallIconButton3.f207537f);
                VoipSmallIconButton voipSmallIconButton4 = VoipSmallIconButton.this;
                voipSmallIconButton4.f207536e.setTextColor(voipSmallIconButton4.f207539h.getResources().getColor(C0966R.color.al_));
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/voip/widget/VoipSmallIconButton$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* JADX INFO: finally extract failed */
    public VoipSmallIconButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f207539h = context;
        LayoutInflater.from(context).inflate(C0966R.C0971layout.b5p, this);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C76669d.f224355a, 0, 0);
        try {
            this.f207537f = obtainStyledAttributes.getDrawable(2);
            this.f207538g = obtainStyledAttributes.getDrawable(3);
            String string = obtainStyledAttributes.getString(4);
            int resourceId = obtainStyledAttributes.getResourceId(4, -1);
            obtainStyledAttributes.recycle();
            ImageView imageView = (ImageView) findViewById(C0966R.C0970id.jn9);
            this.f207535d = imageView;
            imageView.setImageDrawable(this.f207537f);
            this.f207535d.setOnTouchListener(this.f207540i);
            this.f207535d.setContentDescription(string);
            TextView textView = (TextView) findViewById(C0966R.C0970id.jn_);
            this.f207536e = textView;
            if (resourceId != -1) {
                textView.setText(getContext().getString(resourceId));
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void setEnabled(boolean z) {
        this.f207535d.setEnabled(z);
        this.f207536e.setEnabled(z);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f207535d.setOnClickListener(onClickListener);
    }
}
