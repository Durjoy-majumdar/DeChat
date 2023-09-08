package com.tencent.p014mm.pluginsdk.p133ui;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.smiley.C96963p0;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;

/* renamed from: com.tencent.mm.pluginsdk.ui.MMPhoneNumberEditText */
public class MMPhoneNumberEditText extends EditText {

    /* renamed from: j */
    public static final /* synthetic */ int f211592j = 0;

    /* renamed from: d */
    public Drawable f211593d;

    /* renamed from: e */
    public C72723d f211594e;

    /* renamed from: f */
    public boolean f211595f;

    /* renamed from: g */
    public boolean f211596g = false;

    /* renamed from: h */
    public int f211597h = 0;

    /* renamed from: i */
    public View.OnFocusChangeListener f211598i = null;

    /* renamed from: com.tencent.mm.pluginsdk.ui.MMPhoneNumberEditText$a */
    public class C72720a implements View.OnTouchListener {
        public C72720a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/MMPhoneNumberEditText$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            MMPhoneNumberEditText mMPhoneNumberEditText = MMPhoneNumberEditText.this;
            if (mMPhoneNumberEditText.getCompoundDrawables()[2] == null) {
                C117292a.m165362h(false, this, "com/tencent/mm/pluginsdk/ui/MMPhoneNumberEditText$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
            if (motionEvent.getAction() == 1 && motionEvent.getX() > ((float) ((mMPhoneNumberEditText.getWidth() - mMPhoneNumberEditText.getPaddingRight()) - MMPhoneNumberEditText.this.f211593d.getIntrinsicWidth()))) {
                if (mMPhoneNumberEditText.isFocused()) {
                    mMPhoneNumberEditText.setText("");
                    mMPhoneNumberEditText.setCompoundDrawablesWithIntrinsicBounds(mMPhoneNumberEditText.getCompoundDrawables()[0], mMPhoneNumberEditText.getCompoundDrawables()[1], (Drawable) null, mMPhoneNumberEditText.getCompoundDrawables()[3]);
                } else {
                    C72723d dVar = MMPhoneNumberEditText.this.f211594e;
                    if (dVar != null) {
                        ProfileEditPhoneNumberView profileEditPhoneNumberView = (ProfileEditPhoneNumberView) dVar;
                        if (mMPhoneNumberEditText.f211595f) {
                            C76879j.m92739j(profileEditPhoneNumberView.getContext(), C0966R.string.fjv, 0, C0966R.string.fju, C0966R.string.fjt, new C72744b(profileEditPhoneNumberView, mMPhoneNumberEditText), (DialogInterface.OnClickListener) null);
                        } else {
                            mMPhoneNumberEditText.setText("");
                            profileEditPhoneNumberView.mo100276d();
                        }
                    }
                }
            }
            C117292a.m165362h(false, this, "com/tencent/mm/pluginsdk/ui/MMPhoneNumberEditText$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.MMPhoneNumberEditText$b */
    public class C72721b implements TextWatcher {
        public C72721b() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (Util.isNullOrNil(charSequence.toString())) {
                MMPhoneNumberEditText.this.f211596g = true;
            } else {
                MMPhoneNumberEditText.this.f211596g = false;
            }
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            MMPhoneNumberEditText mMPhoneNumberEditText = MMPhoneNumberEditText.this;
            int i4 = MMPhoneNumberEditText.f211592j;
            mMPhoneNumberEditText.mo100229b();
            if (charSequence.toString().equals("")) {
                MMPhoneNumberEditText mMPhoneNumberEditText2 = MMPhoneNumberEditText.this;
                if (!mMPhoneNumberEditText2.f211596g) {
                    if (mMPhoneNumberEditText2.f211594e != null && mMPhoneNumberEditText2.isFocused()) {
                        ProfileEditPhoneNumberView profileEditPhoneNumberView = (ProfileEditPhoneNumberView) MMPhoneNumberEditText.this.f211594e;
                        if (profileEditPhoneNumberView.f211634h.getChildCount() - 1 != 1) {
                            profileEditPhoneNumberView.mo100276d();
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            if (!charSequence.toString().equals("")) {
                MMPhoneNumberEditText mMPhoneNumberEditText3 = MMPhoneNumberEditText.this;
                if (mMPhoneNumberEditText3.f211596g) {
                    if (mMPhoneNumberEditText3.f211594e != null && mMPhoneNumberEditText3.isFocused()) {
                        ((ProfileEditPhoneNumberView) MMPhoneNumberEditText.this.f211594e).mo100276d();
                        return;
                    }
                    return;
                }
            }
            MMPhoneNumberEditText mMPhoneNumberEditText4 = MMPhoneNumberEditText.this;
            if (mMPhoneNumberEditText4.f211594e != null && mMPhoneNumberEditText4.isFocused()) {
                ((ProfileEditPhoneNumberView) MMPhoneNumberEditText.this.f211594e).mo100276d();
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.MMPhoneNumberEditText$c */
    public class C72722c implements View.OnFocusChangeListener {
        public C72722c() {
        }

        public void onFocusChange(View view, boolean z) {
            View.OnFocusChangeListener onFocusChangeListener = MMPhoneNumberEditText.this.f211598i;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(view, z);
            }
            MMPhoneNumberEditText.this.mo100229b();
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.MMPhoneNumberEditText$d */
    public interface C72723d {
    }

    public MMPhoneNumberEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo100228a();
    }

    /* renamed from: a */
    public final void mo100228a() {
        Drawable b = C74942w4.m89785b(getContext(), C0966R.attr.f2816m1);
        this.f211593d = b;
        b.setBounds(0, 0, b.getIntrinsicWidth(), this.f211593d.getIntrinsicHeight());
        Log.m105919d("MicroMsg.MMClearEditText", "imgX width %d height %d", Integer.valueOf(this.f211593d.getIntrinsicWidth()), Integer.valueOf(this.f211593d.getIntrinsicHeight()));
        mo100229b();
        setHeight(this.f211593d.getIntrinsicHeight() + (getResources().getDimensionPixelSize(C0966R.dimen.f3928j9) * 5));
        clearFocus();
        setOnTouchListener(new C72720a());
        addTextChangedListener(new C72721b());
        super.setOnFocusChangeListener(new C72722c());
    }

    /* renamed from: b */
    public final void mo100229b() {
        if (getText().toString().equals("")) {
            setCompoundDrawablesWithIntrinsicBounds(getCompoundDrawables()[0], getCompoundDrawables()[1], (Drawable) null, getCompoundDrawables()[3]);
        } else {
            setCompoundDrawablesWithIntrinsicBounds(getCompoundDrawables()[0], getCompoundDrawables()[1], this.f211593d, getCompoundDrawables()[3]);
        }
    }

    /* renamed from: c */
    public void mo100230c(String str) {
        int selectionStart = getSelectionStart();
        setText(C96963p0.wx0().mo83004M(getContext(), str));
        int length = getText().length() - str.length();
        if (length > 0) {
            int i = selectionStart + length;
            if (i <= getText().length()) {
                setSelection(i);
                return;
            }
            return;
        }
        setSelection(selectionStart);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof TextView.SavedState)) {
            super.onRestoreInstanceState(parcelable);
        } else {
            super.onRestoreInstanceState(View.BaseSavedState.EMPTY_STATE);
        }
    }

    public boolean onTextContextMenuItem(int i) {
        boolean onTextContextMenuItem = super.onTextContextMenuItem(i);
        if (i == 16908322) {
            this.f211597h = 0;
            String obj = getText().toString();
            try {
                mo100230c(obj);
            } catch (IndexOutOfBoundsException unused) {
                Log.m105921e("MicroMsg.MMClearEditText", "!!MMClearEditText Exception %d", Integer.valueOf(this.f211597h));
                if (this.f211597h < 3) {
                    this.f211597h++;
                    mo100230c(" " + obj);
                } else {
                    Log.m105920e("MicroMsg.MMClearEditText", "!!MMClearEditText, IndexOutOfBoundsException cannot fix");
                }
            }
        }
        return onTextContextMenuItem;
    }

    public void setCallback(C72723d dVar) {
        this.f211594e = dVar;
    }

    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f211598i = onFocusChangeListener;
    }

    public MMPhoneNumberEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo100228a();
    }
}
