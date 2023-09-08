package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj3.C61773u;
import nj3.C61774w;
import nj3.C76903v;
import wq3.C111847h;
import yo3.C79142a;

/* renamed from: com.tencent.mm.ui.base.MMFormVerifyCodeInputView */
public class MMFormVerifyCodeInputView extends LinearLayout implements C111847h {

    /* renamed from: d */
    public Context f214798d;

    /* renamed from: e */
    public TextView f214799e;

    /* renamed from: f */
    public MMClearEditText f214800f;

    /* renamed from: g */
    public TextView f214801g;

    /* renamed from: h */
    public Button f214802h;

    /* renamed from: i */
    public View f214803i;

    /* renamed from: j */
    public int f214804j;

    /* renamed from: n */
    public int f214805n;

    /* renamed from: o */
    public int f214806o;

    /* renamed from: p */
    public int f214807p;

    /* renamed from: q */
    public int f214808q;

    /* renamed from: r */
    public int f214809r;

    /* renamed from: s */
    public MTimerHandler f214810s;

    /* renamed from: t */
    public int[] f214811t;

    /* renamed from: u */
    public View.OnFocusChangeListener f214812u;

    /* renamed from: v */
    public View.OnClickListener f214813v;

    /* renamed from: com.tencent.mm.ui.base.MMFormVerifyCodeInputView$a */
    public class C73167a implements MTimerHandler.CallBack {
        public C73167a() {
        }

        public boolean onTimerExpired() {
            MMFormVerifyCodeInputView mMFormVerifyCodeInputView = MMFormVerifyCodeInputView.this;
            mMFormVerifyCodeInputView.f214809r--;
            mMFormVerifyCodeInputView.f214801g.setText(mMFormVerifyCodeInputView.getContext().getString(C0966R.string.gtz, new Object[]{Integer.valueOf(MMFormVerifyCodeInputView.this.f214809r)}));
            MMFormVerifyCodeInputView mMFormVerifyCodeInputView2 = MMFormVerifyCodeInputView.this;
            if (mMFormVerifyCodeInputView2.f214809r == 0) {
                mMFormVerifyCodeInputView2.f214810s.stopTimer();
                MMFormVerifyCodeInputView mMFormVerifyCodeInputView3 = MMFormVerifyCodeInputView.this;
                mMFormVerifyCodeInputView3.f214809r = mMFormVerifyCodeInputView3.f214808q;
                mMFormVerifyCodeInputView3.f214802h.setVisibility(0);
                MMFormVerifyCodeInputView.this.f214801g.setVisibility(8);
            }
            return true;
        }
    }

    public MMFormVerifyCodeInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f214804j = -1;
        this.f214805n = -1;
        this.f214806o = -1;
        this.f214807p = -1;
        this.f214808q = 60;
        this.f214809r = 60;
        this.f214812u = null;
        this.f214813v = null;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C79142a.f232405d, i, 0);
        this.f214805n = obtainStyledAttributes.getResourceId(1, -1);
        this.f214804j = obtainStyledAttributes.getResourceId(3, -1);
        this.f214806o = obtainStyledAttributes.getResourceId(0, -1);
        this.f214807p = obtainStyledAttributes.getResourceId(2, this.f214807p);
        obtainStyledAttributes.recycle();
        View.inflate(context, this.f214807p, this);
        this.f214798d = context;
    }

    /* renamed from: a */
    public void mo101692a(TextWatcher textWatcher) {
        MMClearEditText mMClearEditText;
        if (textWatcher == null || (mMClearEditText = this.f214800f) == null) {
            Log.m105929w("MicroMsg.MMFormVerifyCodeInputView", "watcher : %s, contentET : %s", textWatcher, this.f214800f);
            return;
        }
        mMClearEditText.addTextChangedListener(textWatcher);
    }

    /* renamed from: b */
    public void mo101693b() {
        this.f214802h.setVisibility(8);
        this.f214801g.setVisibility(0);
        this.f214801g.setText(getContext().getString(C0966R.string.gtz, new Object[]{Integer.valueOf(this.f214808q)}));
        MTimerHandler mTimerHandler = this.f214810s;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
            this.f214810s.startTimer(1000);
        } else if (getContext() != null) {
            MTimerHandler mTimerHandler2 = new MTimerHandler(getContext().getMainLooper(), (MTimerHandler.CallBack) new C73167a(), true);
            this.f214810s = mTimerHandler2;
            mTimerHandler2.startTimer(1000);
        } else {
            MTimerHandler mTimerHandler3 = this.f214810s;
            if (mTimerHandler3 != null) {
                mTimerHandler3.stopTimer();
            }
        }
    }

    /* renamed from: c */
    public void mo101694c() {
        MTimerHandler mTimerHandler = this.f214810s;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        this.f214800f.setText("");
        this.f214801g.setVisibility(8);
        this.f214809r = this.f214808q;
        this.f214802h.setVisibility(0);
    }

    public EditText getContentEditText() {
        return this.f214800f;
    }

    public Editable getText() {
        MMClearEditText mMClearEditText = this.f214800f;
        if (mMClearEditText != null) {
            return mMClearEditText.getText();
        }
        Log.m105920e("MicroMsg.MMFormVerifyCodeInputView", "contentET is null!");
        return null;
    }

    public TextView getTitleTextView() {
        return this.f214799e;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f214799e = (TextView) findViewById(C0966R.C0970id.knx);
        this.f214800f = (MMClearEditText) findViewById(C0966R.C0970id.cd7);
        View findViewById = findViewById(C0966R.C0970id.bdh);
        this.f214803i = findViewById;
        findViewById.setOnClickListener(new C61773u(this));
        if (C76577a.m92147C(getContext())) {
            View findViewById2 = findViewById(C0966R.C0970id.kls);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = findViewById2;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/base/MMFormVerifyCodeInputView", "prepareContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/base/MMFormVerifyCodeInputView", "prepareContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById3 = findViewById(C0966R.C0970id.jbz);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view2 = findViewById3;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/ui/base/MMFormVerifyCodeInputView", "prepareContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/base/MMFormVerifyCodeInputView", "prepareContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById4 = findViewById(C0966R.C0970id.fhm);
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            View view3 = findViewById4;
            C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/ui/base/MMFormVerifyCodeInputView", "prepareContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/ui/base/MMFormVerifyCodeInputView", "prepareContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f214801g = (TextView) findViewById(C0966R.C0970id.fho);
            this.f214802h = (Button) findViewById(C0966R.C0970id.fhn);
        } else {
            this.f214801g = (TextView) findViewById(C0966R.C0970id.kls);
            this.f214802h = (Button) findViewById(C0966R.C0970id.jbz);
        }
        this.f214802h.setVisibility(0);
        TextView textView = this.f214799e;
        if (textView == null || this.f214800f == null || this.f214801g == null || this.f214802h == null) {
            Log.m105929w("MicroMsg.MMFormVerifyCodeInputView", "titleTV : %s, contentET : %s, timerTv: %s, sendSmsBtn: %s", textView, this.f214800f, this.f214801g, this.f214802h);
        } else {
            int i = this.f214804j;
            if (i != -1) {
                textView.setText(i);
            }
            int i2 = this.f214805n;
            if (i2 != -1) {
                this.f214800f.setHint(i2);
            }
            int i3 = this.f214806o;
            if (i3 != -1) {
                this.f214802h.setText(i3);
            }
        }
        MMClearEditText mMClearEditText = this.f214800f;
        if (mMClearEditText != null) {
            mMClearEditText.setOnFocusChangeListener(new C76903v(this));
            this.f214800f.setClearBtnCallBcakListener(new C57664c(this));
        }
        Button button = this.f214802h;
        if (button != null) {
            button.setOnClickListener(new C61774w(this));
        }
    }

    public void setFocusListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f214812u = onFocusChangeListener;
    }

    public void setHint(String str) {
        MMClearEditText mMClearEditText = this.f214800f;
        if (mMClearEditText != null) {
            mMClearEditText.setHint(str);
        } else {
            Log.m105920e("MicroMsg.MMFormVerifyCodeInputView", "contentET is null!");
        }
    }

    public void setImeOption(int i) {
        MMClearEditText mMClearEditText = this.f214800f;
        if (mMClearEditText != null) {
            mMClearEditText.setImeOptions(i);
        } else {
            Log.m105920e("MicroMsg.MMFormVerifyCodeInputView", "contentET is null!");
        }
    }

    public void setInputType(int i) {
        MMClearEditText mMClearEditText = this.f214800f;
        if (mMClearEditText != null) {
            mMClearEditText.setInputType(i);
        } else {
            Log.m105920e("MicroMsg.MMFormVerifyCodeInputView", "contentET is null!");
        }
    }

    public void setSendSmsBtnClickListener(View.OnClickListener onClickListener) {
        this.f214813v = onClickListener;
    }

    public void setSmsBtnText(int i) {
        Button button = this.f214802h;
        if (button != null) {
            button.setText(i);
        } else {
            Log.m105920e("MicroMsg.MMFormVerifyCodeInputView", "sendSmsBtn is null!");
        }
    }

    public void setText(String str) {
        MMClearEditText mMClearEditText = this.f214800f;
        if (mMClearEditText != null) {
            mMClearEditText.setText(str);
        } else {
            Log.m105920e("MicroMsg.MMFormVerifyCodeInputView", "contentET is null!");
        }
    }

    public void setTitle(String str) {
        TextView textView = this.f214799e;
        if (textView != null) {
            textView.setText(str);
        } else {
            Log.m105920e("MicroMsg.MMFormVerifyCodeInputView", "titleTV is null!");
        }
    }

    public void setHint(int i) {
        MMClearEditText mMClearEditText = this.f214800f;
        if (mMClearEditText != null) {
            mMClearEditText.setHint(i);
        } else {
            Log.m105920e("MicroMsg.MMFormVerifyCodeInputView", "contentET is null!");
        }
    }

    public void setSmsBtnText(String str) {
        Button button = this.f214802h;
        if (button != null) {
            button.setText(str);
        } else {
            Log.m105920e("MicroMsg.MMFormVerifyCodeInputView", "sendSmsBtn is null!");
        }
    }

    public void setTitle(int i) {
        TextView textView = this.f214799e;
        if (textView != null) {
            textView.setText(i);
        } else {
            Log.m105920e("MicroMsg.MMFormVerifyCodeInputView", "titleTV is null!");
        }
    }

    public MMFormVerifyCodeInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }
}
