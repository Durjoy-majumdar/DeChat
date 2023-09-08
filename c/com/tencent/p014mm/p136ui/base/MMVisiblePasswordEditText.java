package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.base.MMVisiblePasswordEditText */
public class MMVisiblePasswordEditText extends EditText {

    /* renamed from: d */
    public final Drawable f214978d = getResources().getDrawable(C0966R.raw.login_showpassword_icon);

    /* renamed from: e */
    public final Drawable f214979e = getResources().getDrawable(C0966R.raw.login_showpassword_icon_activa);

    /* renamed from: f */
    public boolean f214980f = false;

    /* renamed from: com.tencent.mm.ui.base.MMVisiblePasswordEditText$a */
    public class C73211a implements View.OnTouchListener {
        public C73211a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/MMVisiblePasswordEditText$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            MMVisiblePasswordEditText mMVisiblePasswordEditText = MMVisiblePasswordEditText.this;
            if (mMVisiblePasswordEditText.getCompoundDrawables()[2] == null) {
                C117292a.m165362h(false, this, "com/tencent/mm/ui/base/MMVisiblePasswordEditText$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            } else if (motionEvent.getAction() != 1) {
                C117292a.m165362h(false, this, "com/tencent/mm/ui/base/MMVisiblePasswordEditText$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            } else {
                if (motionEvent.getX() > ((float) ((mMVisiblePasswordEditText.getWidth() - mMVisiblePasswordEditText.getPaddingRight()) - MMVisiblePasswordEditText.this.f214978d.getIntrinsicWidth()))) {
                    MMVisiblePasswordEditText mMVisiblePasswordEditText2 = MMVisiblePasswordEditText.this;
                    mMVisiblePasswordEditText2.f214980f = !mMVisiblePasswordEditText2.f214980f;
                    mMVisiblePasswordEditText2.mo101871b();
                }
                C117292a.m165362h(false, this, "com/tencent/mm/ui/base/MMVisiblePasswordEditText$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
        }
    }

    public MMVisiblePasswordEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo101870a(context);
    }

    /* renamed from: a */
    public final void mo101870a(Context context) {
        Drawable drawable = this.f214978d;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f214978d.getIntrinsicHeight());
        Drawable drawable2 = this.f214979e;
        drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.f214979e.getIntrinsicHeight());
        Log.m105919d("MicroMsg.MMVisiblePasswordEditText", "closeEye width %d height %d", Integer.valueOf(this.f214978d.getIntrinsicWidth()), Integer.valueOf(this.f214978d.getIntrinsicHeight()));
        mo101871b();
        setHeight(this.f214978d.getIntrinsicHeight() + (getResources().getDimensionPixelSize(C0966R.dimen.f3928j9) * 5));
        setOnTouchListener(new C73211a());
    }

    /* renamed from: b */
    public final void mo101871b() {
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (this.f214980f) {
            setInputType(1);
            setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.f214979e, getCompoundDrawables()[3]);
        } else {
            setInputType(129);
            setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.f214978d, getCompoundDrawables()[3]);
        }
        setSelection(selectionStart, selectionEnd);
    }

    public MMVisiblePasswordEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo101870a(context);
    }
}
