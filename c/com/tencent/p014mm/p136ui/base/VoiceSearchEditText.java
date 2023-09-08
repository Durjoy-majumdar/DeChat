package com.tencent.p014mm.p136ui.base;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;

/* renamed from: com.tencent.mm.ui.base.VoiceSearchEditText */
public class VoiceSearchEditText extends EditText {

    /* renamed from: d */
    public final Drawable f318819d = getResources().getDrawable(C0966R.C0969drawable.b0d);

    /* renamed from: e */
    public final Drawable f318820e = getResources().getDrawable(C0966R.C0969drawable.aq8);

    /* renamed from: f */
    public View.OnClickListener f318821f;

    /* renamed from: g */
    public boolean f318822g = true;

    /* renamed from: h */
    public boolean f318823h = false;

    /* renamed from: i */
    public Context f318824i;

    /* renamed from: j */
    public boolean f318825j = false;

    /* renamed from: com.tencent.mm.ui.base.VoiceSearchEditText$a */
    public class C106658a implements View.OnTouchListener {
        public C106658a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/VoiceSearchEditText$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            VoiceSearchEditText voiceSearchEditText = VoiceSearchEditText.this;
            if (voiceSearchEditText.getCompoundDrawables()[2] == null) {
                C117292a.m165362h(false, this, "com/tencent/mm/ui/base/VoiceSearchEditText$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            } else if (motionEvent.getAction() != 1) {
                C117292a.m165362h(true, this, "com/tencent/mm/ui/base/VoiceSearchEditText$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return true;
            } else {
                VoiceSearchEditText voiceSearchEditText2 = VoiceSearchEditText.this;
                voiceSearchEditText2.f318825j = true;
                if (!voiceSearchEditText2.f318822g || !voiceSearchEditText2.f318823h || !voiceSearchEditText.getText().toString().equals("")) {
                    if (voiceSearchEditText.getText().toString().length() <= 0) {
                        View.OnClickListener onClickListener = VoiceSearchEditText.this.f318821f;
                        if (onClickListener != null) {
                            onClickListener.onClick((View) null);
                        }
                    } else if (motionEvent.getX() > ((float) (((voiceSearchEditText.getWidth() - voiceSearchEditText.getPaddingRight()) - VoiceSearchEditText.this.f318820e.getIntrinsicWidth()) - C76577a.m92151b(voiceSearchEditText.f318824i, 25)))) {
                        voiceSearchEditText.setText("");
                        VoiceSearchEditText.this.getClass();
                        VoiceSearchEditText.m144034a(VoiceSearchEditText.this);
                    } else if (!voiceSearchEditText.isFocused()) {
                        voiceSearchEditText.requestFocus();
                        if (VoiceSearchEditText.this.getContext() instanceof Activity) {
                            MMActivity.showVKB((Activity) VoiceSearchEditText.this.getContext());
                        }
                    }
                } else if (motionEvent.getX() <= ((float) (((voiceSearchEditText.getWidth() - voiceSearchEditText.getPaddingRight()) - VoiceSearchEditText.this.f318819d.getIntrinsicWidth()) - C76577a.m92151b(voiceSearchEditText.f318824i, 25)))) {
                    voiceSearchEditText.requestFocus();
                    if (VoiceSearchEditText.this.getContext() instanceof Activity) {
                        MMActivity.showVKB((Activity) VoiceSearchEditText.this.getContext());
                    }
                    View.OnClickListener onClickListener2 = VoiceSearchEditText.this.f318821f;
                    if (onClickListener2 != null) {
                        onClickListener2.onClick((View) null);
                    }
                } else if (VoiceSearchEditText.this.f318821f != null) {
                    Log.m105924i("MicroMsg.VoiceSearchEditText", "user clicked voice button");
                    if (VoiceSearchEditText.this.getContext() instanceof MMActivity) {
                        ((MMActivity) VoiceSearchEditText.this.getContext()).hideVKB(voiceSearchEditText);
                    }
                    VoiceSearchEditText voiceSearchEditText3 = VoiceSearchEditText.this;
                    voiceSearchEditText3.f318821f.onClick(voiceSearchEditText3);
                    C117292a.m165362h(true, this, "com/tencent/mm/ui/base/VoiceSearchEditText$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return true;
                }
                C117292a.m165362h(false, this, "com/tencent/mm/ui/base/VoiceSearchEditText$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.base.VoiceSearchEditText$b */
    public class C106659b implements TextWatcher {
        public C106659b() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            VoiceSearchEditText voiceSearchEditText = VoiceSearchEditText.this;
            voiceSearchEditText.f318825j = true;
            VoiceSearchEditText.m144034a(voiceSearchEditText);
        }
    }

    /* renamed from: com.tencent.mm.ui.base.VoiceSearchEditText$c */
    public class C106660c implements View.OnFocusChangeListener {
        public C106660c() {
        }

        public void onFocusChange(View view, boolean z) {
            Log.m105919d("MicroMsg.VoiceSearchEditText", "onFocusChange hasFocus = [%s], currentFocusState = [%s]", Boolean.valueOf(z), Boolean.valueOf(VoiceSearchEditText.this.f318825j));
            if (!z) {
                VoiceSearchEditText voiceSearchEditText = VoiceSearchEditText.this;
                if (voiceSearchEditText.f318825j) {
                    VoiceSearchEditText.m144034a(voiceSearchEditText);
                    VoiceSearchEditText.this.f318825j = false;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.base.VoiceSearchEditText$d */
    public interface C106661d {
        /* renamed from: a */
        void mo153602a();
    }

    public VoiceSearchEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo153593c(context);
    }

    /* renamed from: a */
    public static void m144034a(VoiceSearchEditText voiceSearchEditText) {
        voiceSearchEditText.getClass();
        Log.m105918d("MicroMsg.VoiceSearchEditText", "checkView");
        if (voiceSearchEditText.getText().toString().equals("") && voiceSearchEditText.f318823h) {
            voiceSearchEditText.f318822g = true;
            voiceSearchEditText.setCompoundDrawables((Drawable) null, voiceSearchEditText.getCompoundDrawables()[1], voiceSearchEditText.f318819d, voiceSearchEditText.getCompoundDrawables()[3]);
        } else if (voiceSearchEditText.getText().toString().length() > 0) {
            voiceSearchEditText.setCompoundDrawables((Drawable) null, voiceSearchEditText.getCompoundDrawables()[1], voiceSearchEditText.f318820e, voiceSearchEditText.getCompoundDrawables()[3]);
        } else {
            voiceSearchEditText.f318822g = false;
            voiceSearchEditText.setCompoundDrawables((Drawable) null, voiceSearchEditText.getCompoundDrawables()[1], (Drawable) null, voiceSearchEditText.getCompoundDrawables()[3]);
        }
    }

    /* renamed from: b */
    public final void mo153592b() {
        this.f318822g = true;
        if (this.f318823h) {
            setCompoundDrawables((Drawable) null, getCompoundDrawables()[1], this.f318819d, getCompoundDrawables()[3]);
        } else if (getText().toString().length() > 0) {
            setCompoundDrawables((Drawable) null, getCompoundDrawables()[1], this.f318820e, getCompoundDrawables()[3]);
        } else {
            setCompoundDrawables((Drawable) null, getCompoundDrawables()[1], (Drawable) null, getCompoundDrawables()[3]);
        }
    }

    /* renamed from: c */
    public final void mo153593c(Context context) {
        this.f318824i = context;
        this.f318823h = false;
        Drawable drawable = this.f318819d;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f318819d.getIntrinsicHeight());
        Drawable drawable2 = this.f318820e;
        drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.f318820e.getIntrinsicHeight());
        mo153592b();
        setOnTouchListener(new C106658a());
        addTextChangedListener(new C106659b());
        setOnFocusChangeListener(new C106660c());
        if (context instanceof Activity) {
            View currentFocus = ((Activity) context).getCurrentFocus();
            if (currentFocus == null || currentFocus != this) {
                this.f318825j = false;
            } else {
                this.f318825j = true;
            }
        }
        requestFocus();
    }

    public void setNeedIcon(boolean z) {
    }

    public void setOnContentClearListener(C106661d dVar) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f318821f = onClickListener;
        this.f318823h = true;
        mo153592b();
    }

    public VoiceSearchEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo153593c(context);
    }
}
