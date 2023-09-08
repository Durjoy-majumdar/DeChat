package com.tencent.p014mm.p136ui.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import pl3.C100823c;
import vl3.C102226d;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\b\u0016\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 B\u001d\b\u0016\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001f\u0010!J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u0018\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\""}, mo182094d2 = {"Lcom/tencent/mm/ui/widget/MMClearEditText;", "Lcom/tencent/mm/ui/widget/MMEditText;", "Landroid/view/View$OnFocusChangeListener;", "l", "Lrx3/b0;", "setOnFocusChangeListener", "Landroid/view/View$OnTouchListener;", "getDefaultOnTouchListener", "", "E", "Z", "getMEnableRestoreState", "()Z", "setMEnableRestoreState", "(Z)V", "mEnableRestoreState", "Landroid/graphics/drawable/Drawable;", "kotlin.jvm.PlatformType", "F", "Landroid/graphics/drawable/Drawable;", "getImgX", "()Landroid/graphics/drawable/Drawable;", "setImgX", "(Landroid/graphics/drawable/Drawable;)V", "imgX", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.widget.MMClearEditText */
public final class MMClearEditText extends MMEditText {

    /* renamed from: I */
    public static final /* synthetic */ int f220343I = 0;

    /* renamed from: E */
    public boolean f220344E;

    /* renamed from: F */
    public Drawable f220345F = C74942w4.m89785b(getContext(), C0966R.attr.f2816m1);

    /* renamed from: G */
    public View.OnFocusChangeListener f220346G;

    /* renamed from: H */
    public final View.OnTouchListener f220347H = new C74947c(this);

    /* renamed from: com.tencent.mm.ui.widget.MMClearEditText$a */
    public static final class C74945a implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ MMClearEditText f220348d;

        public C74945a(MMClearEditText mMClearEditText) {
            this.f220348d = mMClearEditText;
        }

        public void afterTextChanged(Editable editable) {
            C87412m.m108594g(editable, "arg0");
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C87412m.m108594g(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C87412m.m108594g(charSequence, "s");
            MMClearEditText mMClearEditText = this.f220348d;
            int i4 = MMClearEditText.f220343I;
            mMClearEditText.mo104216t();
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.MMClearEditText$b */
    public static final class C74946b implements View.OnFocusChangeListener {

        /* renamed from: d */
        public final /* synthetic */ MMClearEditText f220349d;

        public C74946b(MMClearEditText mMClearEditText) {
            this.f220349d = mMClearEditText;
        }

        public final void onFocusChange(View view, boolean z) {
            View.OnFocusChangeListener onFocusChangeListener = this.f220349d.f220346G;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(view, z);
            }
            this.f220349d.mo104216t();
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.MMClearEditText$c */
    public static final class C74947c implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ MMClearEditText f220350d;

        public C74947c(MMClearEditText mMClearEditText) {
            this.f220350d = mMClearEditText;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/MMClearEditText$mOnTouchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            MMClearEditText mMClearEditText = this.f220350d;
            if (mMClearEditText.getCompoundDrawables()[2] == null) {
                C117292a.m165362h(false, this, "com/tencent/mm/ui/widget/MMClearEditText$mOnTouchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            } else if (motionEvent.getAction() != 1) {
                C117292a.m165362h(false, this, "com/tencent/mm/ui/widget/MMClearEditText$mOnTouchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            } else {
                if (motionEvent.getX() > ((float) ((mMClearEditText.getWidth() - mMClearEditText.getPaddingRight()) - this.f220350d.getImgX().getIntrinsicWidth()))) {
                    mMClearEditText.setText("");
                    MMClearEditText mMClearEditText2 = this.f220350d;
                    mMClearEditText2.setCompoundDrawables(mMClearEditText2.getCompoundDrawables()[0], mMClearEditText2.getCompoundDrawables()[1], (Drawable) null, mMClearEditText2.getCompoundDrawables()[3]);
                }
                C117292a.m165362h(false, this, "com/tencent/mm/ui/widget/MMClearEditText$mOnTouchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
        }
    }

    public MMClearEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m89794s();
    }

    /* renamed from: s */
    private final void m89794s() {
        if (this.f220345F == null) {
            this.f220345F = C74942w4.m89785b(getContext(), C0966R.attr.f2816m1);
        }
        Drawable drawable = this.f220345F;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f220345F.getIntrinsicHeight());
        Log.m105925i("MicroMsg.MMClearEditText", "imgX width %d height %d", Integer.valueOf(this.f220345F.getIntrinsicWidth()), Integer.valueOf(this.f220345F.getIntrinsicHeight()));
        mo104216t();
        setHeight(this.f220345F.getIntrinsicHeight() + (getResources().getDimensionPixelSize(C0966R.dimen.f3928j9) * 5));
        setOnTouchListener(this.f220347H);
        addTextChangedListener(new C74945a(this));
        super.setOnFocusChangeListener(new C74946b(this));
        C100823c.f295336a.mo140272a(this, 1);
    }

    public final View.OnTouchListener getDefaultOnTouchListener() {
        return this.f220347H;
    }

    public final Drawable getImgX() {
        return this.f220345F;
    }

    public final boolean getMEnableRestoreState() {
        return this.f220344E;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof TextView.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        if (!this.f220344E) {
            parcelable = View.BaseSavedState.EMPTY_STATE;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* renamed from: q */
    public void mo104212q(String str) {
        C87412m.m108594g(str, "srcString");
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

    public final void setImgX(Drawable drawable) {
        this.f220345F = drawable;
    }

    public final void setMEnableRestoreState(boolean z) {
        this.f220344E = z;
    }

    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f220346G = onFocusChangeListener;
    }

    /* renamed from: t */
    public final void mo104216t() {
        if (C112551y.m153811k(getText().toString()) || !isFocused()) {
            setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], (Drawable) null, getCompoundDrawables()[3]);
        } else {
            setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.f220345F, getCompoundDrawables()[3]);
        }
    }

    public MMClearEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m89794s();
    }
}
