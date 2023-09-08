package com.tencent.p014mm.p136ui.base;

import android.content.Context;
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
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C85975v4;
import com.tencent.p014mm.p136ui.contact.ModRemarkNameUI;
import j20.C117292a;
import java.util.ArrayList;
import vl3.C102226d;

/* renamed from: com.tencent.mm.ui.base.MMClearEditText */
public class MMClearEditText extends EditText {

    /* renamed from: j */
    public static final /* synthetic */ int f214765j = 0;

    /* renamed from: d */
    public C57661e f214766d = null;

    /* renamed from: e */
    public C57660d f214767e;

    /* renamed from: f */
    public Drawable f214768f = C74933u4.m89768e(getContext(), C0966R.C0969drawable.c3u, getResources().getColor(C0966R.color.BW_0_Alpha_0_5));

    /* renamed from: g */
    public int f214769g = 0;

    /* renamed from: h */
    public View.OnFocusChangeListener f214770h = null;

    /* renamed from: i */
    public View.OnTouchListener f214771i = new C73162c();

    /* renamed from: com.tencent.mm.ui.base.MMClearEditText$d */
    public interface C57660d {
    }

    /* renamed from: com.tencent.mm.ui.base.MMClearEditText$e */
    public interface C57661e {
    }

    /* renamed from: com.tencent.mm.ui.base.MMClearEditText$a */
    public class C73160a implements TextWatcher {
        public C73160a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            MMClearEditText mMClearEditText = MMClearEditText.this;
            int i4 = MMClearEditText.f214765j;
            mMClearEditText.mo101649c();
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMClearEditText$b */
    public class C73161b implements View.OnFocusChangeListener {
        public C73161b() {
        }

        public void onFocusChange(View view, boolean z) {
            View.OnFocusChangeListener onFocusChangeListener = MMClearEditText.this.f214770h;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(view, z);
            }
            MMClearEditText.this.mo101649c();
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMClearEditText$c */
    public class C73162c implements View.OnTouchListener {
        public C73162c() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/MMClearEditText$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            MMClearEditText mMClearEditText = MMClearEditText.this;
            if (mMClearEditText.getCompoundDrawables()[2] == null) {
                C117292a.m165362h(false, this, "com/tencent/mm/ui/base/MMClearEditText$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            } else if (motionEvent.getAction() != 1) {
                C117292a.m165362h(false, this, "com/tencent/mm/ui/base/MMClearEditText$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            } else {
                if (motionEvent.getX() > ((float) ((mMClearEditText.getWidth() - mMClearEditText.getPaddingRight()) - MMClearEditText.this.f214768f.getIntrinsicWidth()))) {
                    MMClearEditText.this.mo101647a();
                }
                C117292a.m165362h(false, this, "com/tencent/mm/ui/base/MMClearEditText$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
        }
    }

    public MMClearEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo101648b(context);
    }

    /* renamed from: a */
    public void mo101647a() {
        setText("");
        mo101651e();
        C57661e eVar = this.f214766d;
        if (eVar != null) {
            ModRemarkNameUI modRemarkNameUI = ModRemarkNameUI.this;
            int i = ModRemarkNameUI.f218631V0;
            modRemarkNameUI.mo103396L7();
        }
    }

    /* renamed from: b */
    public final void mo101648b(Context context) {
        if (this.f214768f == null) {
            this.f214768f = C74933u4.m89768e(getContext(), C0966R.C0969drawable.c3u, getResources().getColor(C0966R.color.BW_0_Alpha_0_5));
        }
        Drawable drawable = this.f214768f;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f214768f.getIntrinsicHeight());
        C85975v4.m106304a("MicroMsg.MMClearEditText", "imgX width %d height %d", Integer.valueOf(this.f214768f.getIntrinsicWidth()), Integer.valueOf(this.f214768f.getIntrinsicHeight()));
        mo101649c();
        setHeight(this.f214768f.getIntrinsicHeight() + (getResources().getDimensionPixelSize(C0966R.dimen.f3928j9) * 5));
        setOnTouchListener(this.f214771i);
        addTextChangedListener(new C73160a());
        super.setOnFocusChangeListener(new C73161b());
    }

    /* renamed from: c */
    public final void mo101649c() {
        if (getText().toString().equals("") || !isFocused()) {
            mo101651e();
            return;
        }
        C57660d dVar = this.f214767e;
        if (dVar != null) {
            ((C57664c) dVar).mo82030a(true);
        }
        setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.f214768f, getCompoundDrawables()[3]);
    }

    /* renamed from: d */
    public void mo101650d(String str) {
        int selectionStart = getSelectionStart();
        setText(C102226d.m134696a(getContext(), str));
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

    /* renamed from: e */
    public final void mo101651e() {
        C57660d dVar = this.f214767e;
        if (dVar != null) {
            ((C57664c) dVar).mo82030a(false);
        }
        setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], (Drawable) null, getCompoundDrawables()[3]);
    }

    public View.OnTouchListener getDefaultOnTouchListener() {
        return this.f214771i;
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
            this.f214769g = 0;
            String obj = getText().toString();
            try {
                mo101650d(obj);
            } catch (IndexOutOfBoundsException unused) {
                C85975v4.m106305b("MicroMsg.MMClearEditText", "!!MMClearEditText Exception %d", Integer.valueOf(this.f214769g));
                if (this.f214769g < 3) {
                    this.f214769g++;
                    mo101650d(" " + obj);
                } else {
                    C85975v4.m106305b("MicroMsg.MMClearEditText", "!!MMClearEditText, IndexOutOfBoundsException cannot fix", new Object[0]);
                }
            }
        }
        return onTextContextMenuItem;
    }

    public void setClearBtnCallBcakListener(C57660d dVar) {
        this.f214767e = dVar;
    }

    public void setClearBtnListener(C57661e eVar) {
        this.f214766d = eVar;
    }

    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f214770h = onFocusChangeListener;
    }

    public MMClearEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo101648b(context);
    }
}
