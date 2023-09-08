package com.tencent.p014mm.plugin.recharge.p093ui.form;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.telephony.PhoneNumberUtils;
import android.text.InputFilter;
import android.text.method.KeyListener;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.p133ui.wallet.WalletIconImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import junit.framework.Assert;
import kg2.C76575b;
import lg2.C76672a;
import lg2.C76673b;
import lg2.C76674c;
import lg2.C76682k;
import lg2.C76683l;
import lg2.C76684m;
import lg2.C76685n;
import tb3.C77881d;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.recharge.ui.form.MallFormView */
public final class MallFormView extends LinearLayout implements View.OnFocusChangeListener, C111847h {

    /* renamed from: A */
    public int f203621A;

    /* renamed from: B */
    public String f203622B;

    /* renamed from: C */
    public int f203623C;

    /* renamed from: D */
    public int f203624D;

    /* renamed from: E */
    public int f203625E;

    /* renamed from: F */
    public boolean f203626F;

    /* renamed from: G */
    public boolean f203627G;

    /* renamed from: H */
    public boolean f203628H;

    /* renamed from: I */
    public int f203629I;

    /* renamed from: J */
    public int f203630J;

    /* renamed from: K */
    public int f203631K;

    /* renamed from: L */
    public boolean f203632L;

    /* renamed from: d */
    public TextView f203633d;

    /* renamed from: e */
    public TextView f203634e;

    /* renamed from: f */
    public EditText f203635f;

    /* renamed from: g */
    public WalletIconImageView f203636g;

    /* renamed from: h */
    public TextView f203637h;

    /* renamed from: i */
    public C70461b f203638i;

    /* renamed from: j */
    public View.OnFocusChangeListener f203639j;

    /* renamed from: n */
    public View.OnClickListener f203640n;

    /* renamed from: o */
    public C76673b f203641o;

    /* renamed from: p */
    public int f203642p;

    /* renamed from: q */
    public String f203643q;

    /* renamed from: r */
    public int f203644r;

    /* renamed from: s */
    public String f203645s;

    /* renamed from: t */
    public int f203646t;

    /* renamed from: u */
    public int f203647u;

    /* renamed from: v */
    public int f203648v;

    /* renamed from: w */
    public String f203649w;

    /* renamed from: x */
    public int f203650x;

    /* renamed from: y */
    public String f203651y;

    /* renamed from: z */
    public int f203652z;

    /* renamed from: com.tencent.mm.plugin.recharge.ui.form.MallFormView$a */
    public class C70460a implements View.OnClickListener {
        public C70460a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recharge/ui/form/MallFormView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            EditText editText = MallFormView.this.f203635f;
            if (editText != null) {
                editText.setText("");
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/recharge/ui/form/MallFormView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.recharge.ui.form.MallFormView$b */
    public interface C70461b {
    }

    public MallFormView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f203633d = null;
        this.f203634e = null;
        this.f203635f = null;
        this.f203636g = null;
        this.f203637h = null;
        this.f203638i = null;
        this.f203639j = null;
        this.f203640n = null;
        this.f203641o = null;
        this.f203642p = -1;
        this.f203643q = "";
        boolean z = false;
        this.f203644r = 0;
        this.f203645s = "";
        this.f203646t = 8;
        this.f203647u = -1;
        this.f203648v = 4;
        this.f203649w = "";
        this.f203650x = 8;
        this.f203651y = "";
        this.f203652z = 19;
        this.f203621A = C0966R.color.a7f;
        this.f203622B = "";
        this.f203623C = Integer.MAX_VALUE;
        this.f203624D = 1;
        this.f203625E = C0966R.C0969drawable.ags;
        this.f203626F = true;
        this.f203627G = false;
        this.f203628H = true;
        this.f203629I = 1;
        this.f203630J = 5;
        this.f203631K = C0966R.color.a1i;
        this.f203632L = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77881d.f226910d, i, 0);
        this.f203642p = obtainStyledAttributes.getResourceId(17, this.f203642p);
        int resourceId = obtainStyledAttributes.getResourceId(23, 0);
        if (resourceId != 0) {
            this.f203643q = context.getString(resourceId);
        }
        this.f203647u = obtainStyledAttributes.getResourceId(14, this.f203647u);
        int resourceId2 = obtainStyledAttributes.getResourceId(21, 0);
        if (resourceId2 != 0) {
            this.f203649w = context.getString(resourceId2);
        }
        this.f203648v = obtainStyledAttributes.getInteger(15, this.f203648v);
        this.f203644r = obtainStyledAttributes.getInteger(25, this.f203644r);
        this.f203650x = obtainStyledAttributes.getInteger(22, this.f203650x);
        this.f203646t = obtainStyledAttributes.getInteger(20, this.f203646t);
        int resourceId3 = obtainStyledAttributes.getResourceId(18, 0);
        if (resourceId3 != 0) {
            this.f203645s = context.getString(resourceId3);
        }
        int resourceId4 = obtainStyledAttributes.getResourceId(8, 0);
        if (resourceId4 != 0) {
            this.f203651y = context.getString(resourceId4);
        }
        this.f203652z = obtainStyledAttributes.getInteger(7, this.f203652z);
        this.f203621A = obtainStyledAttributes.getColor(13, this.f203621A);
        int resourceId5 = obtainStyledAttributes.getResourceId(12, 0);
        if (resourceId5 != 0) {
            this.f203622B = context.getString(resourceId5);
        }
        this.f203623C = obtainStyledAttributes.getInteger(10, this.f203623C);
        this.f203624D = obtainStyledAttributes.getInteger(11, this.f203624D);
        this.f203625E = obtainStyledAttributes.getResourceId(2, this.f203625E);
        this.f203626F = obtainStyledAttributes.getBoolean(4, this.f203626F);
        this.f203627G = obtainStyledAttributes.getBoolean(3, this.f203627G);
        this.f203628H = obtainStyledAttributes.getBoolean(4, this.f203628H);
        this.f203629I = obtainStyledAttributes.getInteger(0, this.f203629I);
        this.f203630J = obtainStyledAttributes.getInteger(1, this.f203630J);
        this.f203631K = obtainStyledAttributes.getInteger(9, this.f203631K);
        obtainStyledAttributes.recycle();
        Assert.assertTrue(this.f203642p > 0 ? true : z);
        setOrientation(1);
        View.inflate(context, this.f203642p, this);
        this.f203633d = (TextView) findViewById(C0966R.C0970id.gnz);
        this.f203634e = (TextView) findViewById(C0966R.C0970id.gmf);
        this.f203635f = (EditText) findViewById(C0966R.C0970id.gli);
        this.f203636g = (WalletIconImageView) findViewById(C0966R.C0970id.glu);
        this.f203637h = (TextView) findViewById(C0966R.C0970id.gny);
    }

    /* renamed from: a */
    public void mo97093a() {
        Log.m105919d("MicroMsg.WalletFormView", "shouldClearFocus: %s", Boolean.valueOf(this.f203632L));
        if (this.f203632L) {
            getContentEditText().clearFocus();
        } else {
            this.f203632L = true;
        }
    }

    /* renamed from: b */
    public final boolean mo97094b(View view, MotionEvent motionEvent) {
        if (view != null && view.getVisibility() == 0) {
            Rect rect = new Rect();
            view.getHitRect(rect);
            if (view == this.f203636g) {
                rect.left -= 50;
                rect.right += 50;
                rect.top -= 25;
                rect.bottom += 25;
            }
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo97095c() {
        EditText editText = this.f203635f;
        if (editText != null) {
            int length = editText.getText() == null ? 0 : this.f203635f.getText().length();
            if (length > this.f203623C || length < this.f203624D) {
                return false;
            }
            C76673b bVar = this.f203641o;
            if (bVar == null) {
                return true;
            }
            ((C76674c) bVar).getClass();
            return PhoneNumberUtils.isGlobalPhoneNumber(C76575b.m92141a(getText().toString()));
        }
        Log.m105920e("MicroMsg.WalletFormView", "hy: no content edit text. true as default");
        return true;
    }

    /* renamed from: d */
    public void mo97096d() {
        EditText editText;
        if (this.f203636g == null || Util.isNullOrNil(getText()) || (editText = this.f203635f) == null || !editText.isEnabled() || !this.f203635f.isClickable() || !this.f203635f.isFocusable() || !this.f203635f.isFocused()) {
            WalletIconImageView walletIconImageView = this.f203636g;
            if (walletIconImageView != null) {
                walletIconImageView.mo100854s();
            } else {
                Log.m105926v("MicroMsg.WalletFormView", "hy: no info iv");
            }
        } else {
            this.f203636g.setToClearState(new C70460a());
        }
    }

    public EditText getContentEditText() {
        return this.f203635f;
    }

    public C76672a getEventDelegate() {
        return null;
    }

    public WalletIconImageView getInfoIv() {
        return this.f203636g;
    }

    public int getInputLength() {
        EditText editText = this.f203635f;
        if (editText != null) {
            return editText.getText().length();
        }
        return 0;
    }

    public C70461b getInputValidChangeListener() {
        return this.f203638i;
    }

    public KeyListener getKeyListener() {
        EditText editText = this.f203635f;
        if (editText != null) {
            return editText.getKeyListener();
        }
        Log.m105928w("MicroMsg.WalletFormView", "hy: no content et");
        return null;
    }

    public C76673b getLogicDelegate() {
        return this.f203641o;
    }

    public int getMaxInputLength() {
        return this.f203623C;
    }

    public int getMinInputLength() {
        return this.f203624D;
    }

    public TextView getPrefilledTv() {
        return this.f203634e;
    }

    public String getText() {
        EditText editText = this.f203635f;
        if (editText != null) {
            String obj = editText.getText().toString();
            C76673b bVar = this.f203641o;
            if (bVar == null) {
                return obj;
            }
            bVar.getClass();
            ((C76674c) this.f203641o).getClass();
            return obj == null ? "" : obj.replaceAll(" ", "");
        }
        Log.m105920e("MicroMsg.WalletFormView", "hy: no content et. return nil");
        return "";
    }

    public TextView getTipsTv() {
        return this.f203637h;
    }

    public TextView getTitleTv() {
        return this.f203633d;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        if (getTitleTv() != null) {
            getTitleTv().setText(this.f203643q);
            getTitleTv().setVisibility(this.f203644r);
        }
        if (getPrefilledTv() != null) {
            getPrefilledTv().setText(this.f203645s);
            getPrefilledTv().setVisibility(this.f203646t);
        }
        if (getInfoIv() != null) {
            getInfoIv().setImageResource(this.f203647u);
            getInfoIv().setVisibility(this.f203648v);
        }
        if (getTipsTv() != null) {
            getTipsTv().setText(this.f203649w);
            getTipsTv().setVisibility(this.f203650x);
        }
        getContext();
        EditText editText = this.f203635f;
        if (editText != null) {
            editText.setHint(this.f203651y);
            this.f203635f.setGravity(this.f203652z);
            this.f203635f.setTextColor(this.f203621A);
            setText(this.f203622B);
            this.f203635f.setBackgroundResource(this.f203625E);
            this.f203635f.setEnabled(this.f203626F);
            this.f203635f.setFocusable(this.f203628H);
            this.f203635f.setClickable(this.f203627G);
            this.f203635f.setHintTextColor(this.f203631K);
            setImeOptions(this.f203630J);
            setInputType(this.f203629I);
            this.f203635f.addTextChangedListener(new C70462a(this));
            this.f203635f.setOnFocusChangeListener(this);
        }
        mo97096d();
        EditText editText2 = this.f203635f;
        if (editText2 != null) {
            int i = this.f203629I;
            if (i == 2) {
                editText2.setKeyListener(new C76682k(this));
            } else if (i == 4) {
                editText2.setKeyListener(new C76683l(this));
            } else if (i == 128) {
                editText2.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.f203635f.setKeyListener(new C76684m(this));
                this.f203635f.setRawInputType(18);
            } else if (i == 3) {
                editText2.setKeyListener(new C76685n(this));
            } else {
                editText2.setInputType(i);
            }
            if (this.f203623C != -1) {
                this.f203635f.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f203623C)});
            }
        }
    }

    public void onFocusChange(View view, boolean z) {
        View.OnFocusChangeListener onFocusChangeListener = this.f203639j;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(this, z);
        }
        if (!mo97095c()) {
            TextView textView = this.f203633d;
            if (textView != null) {
                textView.setEnabled(false);
            }
        } else {
            TextView textView2 = this.f203633d;
            if (textView2 != null) {
                textView2.setEnabled(true);
            }
        }
        mo97096d();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        EditText editText = this.f203635f;
        if (editText != null && mo97094b(editText, motionEvent) && !this.f203635f.isClickable()) {
            Log.m105918d("MicroMsg.WalletFormView", "hy: click on content but content is not clickable. whole view perform click");
            return true;
        } else if (!mo97094b(this.f203636g, motionEvent) || motionEvent.getAction() != 1) {
            return false;
        } else {
            Log.m105918d("MicroMsg.WalletFormView", "hy: click on info iv");
            this.f203636g.performClick();
            return true;
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setEventDelegate(C76672a aVar) {
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        EditText editText = this.f203635f;
        if (editText != null) {
            editText.setFilters(inputFilterArr);
        }
    }

    public void setHint(String str) {
        EditText editText = this.f203635f;
        if (editText != null) {
            editText.setHint(str);
        }
    }

    public void setImeOptions(int i) {
        EditText editText = this.f203635f;
        if (editText != null) {
            editText.setImeOptions(i);
        }
    }

    public void setInputType(int i) {
        EditText editText = this.f203635f;
        if (editText != null) {
            editText.setInputType(i);
        }
    }

    public void setKeyListener(KeyListener keyListener) {
        EditText editText = this.f203635f;
        if (editText != null) {
            editText.setKeyListener(keyListener);
        }
    }

    public void setLogicDelegate(C76673b bVar) {
        this.f203641o = bVar;
    }

    public void setMaxInputLength(int i) {
        this.f203623C = i;
    }

    public void setMinInputLength(int i) {
        this.f203624D = i;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }

    public void setOnEditorActionListener(TextView.OnEditorActionListener onEditorActionListener) {
        this.f203635f.setOnEditorActionListener(onEditorActionListener);
    }

    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f203639j = onFocusChangeListener;
    }

    public void setOnInfoIvClickListener(View.OnClickListener onClickListener) {
        this.f203640n = onClickListener;
        if (getInfoIv() != null) {
            getInfoIv().setOnClickListener(this.f203640n);
        }
    }

    public void setOnInputValidChangeListener(C70461b bVar) {
        this.f203638i = bVar;
    }

    public void setSelection(int i) {
        EditText editText = this.f203635f;
        if (editText != null) {
            editText.setSelection(i);
        }
    }

    public void setText(String str) {
        if (this.f203635f != null) {
            C76673b bVar = this.f203641o;
            if (bVar != null) {
                bVar.getClass();
            }
            this.f203635f.setText(str);
            this.f203635f.setSelection(getInputLength());
        }
    }

    public MallFormView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }
}
