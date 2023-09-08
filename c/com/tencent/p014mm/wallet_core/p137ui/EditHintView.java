package com.tencent.p014mm.wallet_core.p137ui;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tenpay.android.wechat.TenpaySecureEditText;
import eb0.C75592q0;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;
import qo3.C77398g;
import tb3.C77881d;
import yq3.C79144b;
import zq3.C79429a;

@Deprecated
/* renamed from: com.tencent.mm.wallet_core.ui.EditHintView */
public class EditHintView extends RelativeLayout implements View.OnFocusChangeListener {

    /* renamed from: A */
    public boolean f221141A;

    /* renamed from: B */
    public boolean f221142B;

    /* renamed from: C */
    public boolean f221143C;

    /* renamed from: D */
    public String f221144D;

    /* renamed from: E */
    public int f221145E;

    /* renamed from: F */
    public DatePickerDialog f221146F;

    /* renamed from: G */
    public int f221147G;

    /* renamed from: H */
    public int f221148H;

    /* renamed from: I */
    public View.OnClickListener f221149I;

    /* renamed from: J */
    public C77398g f221150J;

    /* renamed from: d */
    public View.OnFocusChangeListener f221151d;

    /* renamed from: e */
    public TextView f221152e;

    /* renamed from: f */
    public TextView f221153f;

    /* renamed from: g */
    public TenpaySecureEditText f221154g;

    /* renamed from: h */
    public ImageView f221155h;

    /* renamed from: i */
    public String f221156i;

    /* renamed from: j */
    public String f221157j;

    /* renamed from: n */
    public int f221158n;

    /* renamed from: o */
    public boolean f221159o;

    /* renamed from: p */
    public int f221160p;

    /* renamed from: q */
    public int f221161q;

    /* renamed from: r */
    public int f221162r;

    /* renamed from: s */
    public int f221163s;

    /* renamed from: t */
    public int f221164t;

    /* renamed from: u */
    public int f221165u;

    /* renamed from: v */
    public boolean f221166v;

    /* renamed from: w */
    public int f221167w;

    /* renamed from: x */
    public int f221168x;

    /* renamed from: y */
    public int f221169y;

    /* renamed from: z */
    public int f221170z;

    /* renamed from: com.tencent.mm.wallet_core.ui.EditHintView$a */
    public class C75161a extends NumberKeyListener {
        public C75161a(EditHintView editHintView) {
        }

        public char[] getAcceptedChars() {
            return new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'x', 'X'};
        }

        public int getInputType() {
            return 1;
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.EditHintView$b */
    public class C75162b implements View.OnClickListener {
        public C75162b() {
        }

        public void onClick(View view) {
            int i;
            int i2;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/wallet_core/ui/EditHintView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (EditHintView.this.f221155h.getVisibility() == 0) {
                EditHintView editHintView = EditHintView.this;
                if (!editHintView.f221141A || Util.isNullOrNil(editHintView.getText())) {
                    EditHintView editHintView2 = EditHintView.this;
                    int i3 = editHintView2.f221164t;
                    if (i3 == 1) {
                        editHintView2.getClass();
                    } else {
                        if (i3 == 3) {
                            editHintView2.getContext();
                            i2 = C75592q0.m90763K() ? C0966R.C0971layout.cfz : C0966R.C0971layout.ceg;
                            editHintView2.getContext();
                            i = C75592q0.m90763K() ? C0966R.string.kor : C0966R.string.koo;
                        } else if (i3 == 4) {
                            editHintView2.getContext();
                            i2 = C75592q0.m90763K() ? C0966R.C0971layout.f7115yr : C0966R.C0971layout.f7114yq;
                            i = C0966R.string.bwr;
                        } else if (i3 == 9) {
                            i2 = C0966R.C0971layout.f360061cg0;
                            i = C0966R.string.kpr;
                        } else if (i3 != 10) {
                            i2 = -1;
                            i = -1;
                        } else {
                            i2 = C0966R.C0971layout.cfc;
                            i = C0966R.string.kpi;
                        }
                        if (i2 != -1) {
                            if (editHintView2.f221150J == null) {
                                Context context = editHintView2.getContext();
                                editHintView2.f221150J = C76879j.m92752w(context, editHintView2.getResources().getString(i), editHintView2.getResources().getString(C0966R.string.ktq), ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(i2, (ViewGroup) null), new C75215g(editHintView2));
                            }
                            editHintView2.f221150J.show();
                        }
                    }
                } else {
                    EditHintView.this.f221154g.ClearInput();
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/wallet_core/ui/EditHintView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.EditHintView$c */
    public interface C75163c {
        /* renamed from: a */
        void mo104930a();
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.EditHintView$d */
    public interface C75164d {
        void onInputValidChange(boolean z);
    }

    public EditHintView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f221156i = "";
        this.f221157j = "";
        this.f221158n = 1;
        this.f221159o = true;
        this.f221160p = -1;
        this.f221161q = 1;
        this.f221162r = 19;
        this.f221163s = -1;
        this.f221164t = -1;
        this.f221166v = false;
        this.f221167w = 1;
        this.f221168x = -1;
        this.f221169y = -1;
        this.f221170z = -1;
        this.f221141A = true;
        this.f221142B = true;
        this.f221143C = true;
        this.f221144D = null;
        this.f221145E = 0;
        this.f221146F = null;
        this.f221147G = 0;
        this.f221148H = 0;
        this.f221149I = new C75162b();
        this.f221150J = null;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77881d.f226907a, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(8, 0);
        if (resourceId != 0) {
            this.f221156i = context.getString(resourceId);
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(13, 0);
        if (resourceId2 != 0) {
            this.f221157j = context.getString(resourceId2);
        }
        this.f221158n = obtainStyledAttributes.getInteger(4, 1);
        this.f221141A = obtainStyledAttributes.getBoolean(7, true);
        this.f221162r = obtainStyledAttributes.getInt(0, 19);
        this.f221159o = obtainStyledAttributes.getBoolean(2, true);
        this.f221160p = obtainStyledAttributes.getInteger(11, -1);
        this.f221164t = obtainStyledAttributes.getInteger(6, 0);
        this.f221165u = obtainStyledAttributes.getInteger(5, 5);
        this.f221168x = obtainStyledAttributes.getColor(10, C0966R.color.a7f);
        this.f221169y = obtainStyledAttributes.getResourceId(1, -1);
        this.f221170z = obtainStyledAttributes.getResourceId(9, C0966R.C0969drawable.f4934rp);
        this.f221161q = obtainStyledAttributes.getInteger(12, 1);
        this.f221142B = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.a0_, this, true);
        this.f221154g = (TenpaySecureEditText) inflate.findViewById(C0966R.C0970id.ew8);
        this.f221152e = (TextView) inflate.findViewById(C0966R.C0970id.kms);
        this.f221153f = (TextView) inflate.findViewById(C0966R.C0970id.i0q);
        this.f221155h = (ImageView) inflate.findViewById(C0966R.C0970id.f6w);
        this.f221154g.setImeOptions(this.f221165u);
        switch (this.f221164t) {
            case 0:
            case 10:
                break;
            case 1:
                this.f221160p = 25;
                this.f221154g.setIsBankcardFormat(true);
                this.f221158n = 2;
                break;
            case 2:
            case 9:
                this.f221160p = 30;
                this.f221158n = 3;
                break;
            case 3:
                this.f221141A = false;
                this.f221154g.setIsValidThru(true);
                setOnClickListener(new C75201f(this));
                break;
            case 4:
                this.f221160p = 4;
                this.f221158n = 2;
                break;
            case 5:
                this.f221160p = 18;
                this.f221158n = 4;
                break;
            case 6:
                this.f221160p = 6;
                this.f221152e.setVisibility(8);
                this.f221158n = 2;
                break;
            case 7:
            case 17:
                this.f221160p = 6;
                this.f221152e.setVisibility(8);
                this.f221154g.setIsPasswordFormat(true, true);
                this.f221154g.setImeOptions(6);
                this.f221158n = 128;
                break;
            case 8:
                this.f221158n = 32;
                break;
            case 12:
                this.f221160p = 12;
                this.f221154g.setIsMoneyAmountFormat(true);
                break;
            case 13:
            case 16:
                this.f221154g.setIsSecurityAnswerFormat(true);
                break;
            case 14:
                this.f221160p = 3;
                this.f221152e.setVisibility(8);
                this.f221154g.setIsCvvPaymentFormat(true);
                this.f221154g.setImeOptions(6);
                this.f221158n = 128;
                break;
            case 15:
                this.f221160p = 4;
                this.f221152e.setVisibility(8);
                this.f221154g.setIsCvv4PaymentFormat(true);
                this.f221154g.setImeOptions(6);
                this.f221158n = 128;
                break;
            default:
                this.f221158n = 1;
                break;
        }
        mo104897b();
        this.f221154g.setSingleLine(this.f221142B);
        if (!this.f221142B) {
            this.f221154g.setMaxLines(1073741823);
        }
        this.f221155h.setOnClickListener(this.f221149I);
        this.f221154g.addTextChangedListener(new C75189a(this));
        this.f221154g.setOnFocusChangeListener(this);
        if (!Util.isNullOrNil(this.f221156i)) {
            this.f221154g.setHint(this.f221156i);
        }
        if (!Util.isNullOrNil(this.f221157j)) {
            this.f221152e.setText(this.f221157j);
        }
        this.f221154g.setGravity(this.f221162r);
        int i2 = this.f221158n;
        if (i2 == 2) {
            this.f221154g.setKeyListener(new C75191b(this));
        } else if (i2 == 4) {
            this.f221154g.setKeyListener(new C75195c(this));
        } else if (i2 == 128) {
            this.f221154g.setTransformationMethod(PasswordTransformationMethod.getInstance());
            this.f221154g.setKeyListener(new C75196d(this));
            this.f221154g.setRawInputType(18);
        } else if (i2 == 3) {
            this.f221154g.setKeyListener(new C75198e(this));
        } else {
            this.f221154g.setInputType(i2);
        }
        if (this.f221160p != -1) {
            this.f221154g.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f221160p)});
        }
        super.setEnabled(true);
        super.setClickable(true);
        if (!this.f221159o) {
            this.f221154g.setEnabled(false);
            this.f221154g.setTextColor(getResources().getColor(this.f221168x));
            this.f221154g.setFocusable(false);
            this.f221154g.setClickable(false);
            this.f221154g.setBackgroundResource(C0966R.C0969drawable.ayq);
            setBackgroundResource(C0966R.C0969drawable.bcr);
        }
        if (!this.f221141A) {
            this.f221166v = true;
            this.f221154g.setEnabled(false);
            this.f221154g.setTextColor(getResources().getColor(C0966R.color.a1f));
            this.f221154g.setFocusable(false);
            this.f221154g.setClickable(false);
            this.f221154g.setBackgroundResource(C0966R.C0969drawable.ayq);
            setBackgroundResource(C0966R.C0969drawable.f4855pa);
        } else {
            this.f221166v = false;
            this.f221154g.setBackgroundResource(this.f221170z);
            setBackgroundResource(C0966R.C0969drawable.ayq);
        }
        int i3 = this.f221169y;
        if (i3 > 0) {
            setBackgroundResource(i3);
        }
        TextView textView = this.f221152e;
        if (!(textView == null || this.f221163s == -1)) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = this.f221163s;
            this.f221152e.setLayoutParams(layoutParams);
        }
        if (C75592q0.m90763K()) {
            this.f221154g.setSecureEncrypt(new C79429a(getEncryptType()));
        }
    }

    private int getEncryptType() {
        int i = this.f221164t;
        if (i == 1) {
            return 50;
        }
        if (i == 4) {
            return 30;
        }
        if (i == 6) {
            return 60;
        }
        if (i == 7) {
            return 20;
        }
        switch (i) {
            case 13:
                return 40;
            case 14:
            case 15:
                return 30;
            case 16:
                return -20;
            case 17:
                return -10;
            default:
                return 0;
        }
    }

    private Rect getValidRectOfInfoIv() {
        Rect rect = new Rect();
        this.f221155h.getHitRect(rect);
        rect.left -= 50;
        rect.right += 50;
        rect.top -= 25;
        rect.bottom += 25;
        return rect;
    }

    private void setValStrForce(String str) {
        KeyListener keyListener = this.f221154g.getKeyListener();
        this.f221154g.setKeyListener((KeyListener) null);
        setEnabled(false);
        setClickable(false);
        setValStr(str);
        this.f221154g.setKeyListener(keyListener);
    }

    /* renamed from: a */
    public boolean mo104896a() {
        if (!this.f221141A && !this.f221159o) {
            return true;
        }
        int i = this.f221164t;
        if (i == 1) {
            return this.f221154g.isBankcardNum();
        }
        if (i == 12) {
            return this.f221154g.isMoneyAmount();
        }
        if (i != 17) {
            if (i == 4) {
                return this.f221154g.getInputLength() >= 1;
            }
            if (i == 5) {
                return this.f221154g.isAreaIDCardNum(this.f221167w);
            }
            if (i != 7) {
                return i != 8 ? i != 9 ? i != 14 ? i != 15 ? this.f221154g.getInputLength() >= this.f221161q : this.f221154g.getInputLength() == 4 : this.f221154g.getInputLength() == 3 : this.f221154g.isPhoneNum() : Util.isValidEmail(this.f221154g.getText().toString());
            }
        }
        return this.f221154g.getInputLength() == 6;
    }

    /* renamed from: b */
    public final void mo104897b() {
        int i = this.f221164t;
        if (i != 7 && i != 14 && i != 15) {
            if (!this.f221141A || Util.isNullOrNil(getText())) {
                int i2 = this.f221164t;
                if (i2 != 1) {
                    if (i2 == 3 || i2 == 4 || i2 == 9 || i2 == 10) {
                        this.f221155h.setVisibility(0);
                        this.f221155h.setImageResource(C0966R.C0969drawable.f357308bj3);
                        return;
                    }
                    this.f221155h.setVisibility(8);
                } else if (this.f221143C) {
                    this.f221155h.setVisibility(0);
                    this.f221155h.setImageResource(C0966R.raw.wallet_scan_camera);
                } else {
                    this.f221155h.setVisibility(8);
                }
            } else {
                this.f221155h.setVisibility(0);
                this.f221155h.setImageResource(C0966R.C0969drawable.abe);
            }
        }
    }

    public String get3DesEncrptData() {
        return this.f221154g.get3DesEncrptData();
    }

    public String getMD5Value() {
        return MD5Util.getMD5String(this.f221164t == 3 ? Util.nullAs(this.f221144D, "").replace("/", "") : this.f221154g.getText().toString());
    }

    public String getText() {
        switch (this.f221164t) {
            case 0:
            case 8:
            case 10:
                return Util.nullAs(this.f221154g.getText().toString(), "");
            case 1:
            case 13:
            case 16:
                TenpaySecureEditText tenpaySecureEditText = this.f221154g;
                C79144b.m95773a().mo109091f();
                return tenpaySecureEditText.getEncryptDataWithHash(false, true);
            case 2:
            case 9:
                return Util.nullAs(this.f221154g.getText().toString(), "");
            case 3:
                return Util.nullAs(this.f221144D, "").replace("/", "");
            case 4:
            case 14:
            case 15:
                return this.f221154g.get3DesEncrptData();
            case 5:
                return this.f221154g.get3DesEncrptData();
            case 6:
                return this.f221154g.get3DesVerifyCode();
            case 7:
                TenpaySecureEditText tenpaySecureEditText2 = this.f221154g;
                C79144b.m95773a().mo109091f();
                return tenpaySecureEditText2.getEncryptDataWithHash(true, true);
            default:
                return Util.nullAs(this.f221154g.getText().toString(), "");
        }
    }

    public void onFocusChange(View view, boolean z) {
        View.OnFocusChangeListener onFocusChangeListener = this.f221151d;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(this, z);
        }
        Log.m105918d("MicroMsg.EditHintView", "View:" + this.f221157j + ", editType:" + this.f221164t + " onFocusChange to " + z);
        if (!this.f221166v) {
            this.f221152e.setEnabled(false);
        } else {
            this.f221152e.setEnabled(true);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f221141A) {
            return !((this.f221155h.getVisibility() == 0) && getValidRectOfInfoIv().contains((int) motionEvent.getX(), (int) motionEvent.getY()));
        }
    }

    public void onMeasure(int i, int i2) {
        int i3 = this.f221164t;
        if (i3 == 7 || i3 == 17 || i3 == 14 || i3 == 15) {
            setMeasuredDimension(View.getDefaultSize(BackwardSupportUtil.BitmapFactory.fromDPToPix(getContext(), 960.0f), i), View.getDefaultSize(BackwardSupportUtil.BitmapFactory.fromDPToPix(getContext(), 720.0f), i2));
            int measuredWidth = getMeasuredWidth();
            int i4 = this.f221164t;
            int i5 = (i4 == 7 || i4 == 17) ? measuredWidth / 6 : i4 == 14 ? measuredWidth / 3 : measuredWidth / 4;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
            setMeasuredDimension(View.getDefaultSize(measuredWidth, makeMeasureSpec), View.getDefaultSize(i5, makeMeasureSpec2));
            i2 = makeMeasureSpec2;
            i = makeMeasureSpec;
        }
        super.onMeasure(i, i2);
    }

    public void set3DesValStr(String str) {
        if (this.f221164t != 1) {
            this.f221154g.setText(str);
            TenpaySecureEditText tenpaySecureEditText = this.f221154g;
            tenpaySecureEditText.setSelection(tenpaySecureEditText.getText().length());
        } else if (Util.isNullOrNil(str) || str.length() > 5) {
            this.f221154g.set3DesEncrptData(str);
            TenpaySecureEditText tenpaySecureEditText2 = this.f221154g;
            tenpaySecureEditText2.setSelection(tenpaySecureEditText2.getText().length());
        } else {
            this.f221154g.setSelection(0);
            this.f221154g.set3DesEncrptData(str);
            this.f221160p = 24 - str.length();
            this.f221154g.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f221160p)});
        }
    }

    public void setClickable(boolean z) {
        super.setClickable(z);
        this.f221159o = z;
        if (!z) {
            this.f221154g.setEnabled(false);
            if (!this.f221141A) {
                this.f221154g.setTextColor(getResources().getColor(C0966R.color.a1a));
            } else {
                this.f221154g.setTextColor(getResources().getColor(this.f221168x));
            }
            this.f221154g.setFocusable(false);
            this.f221154g.setClickable(false);
            return;
        }
        this.f221154g.setEnabled(true);
        if (!this.f221141A) {
            this.f221154g.setTextColor(getResources().getColor(C0966R.color.a1f));
        } else {
            this.f221154g.setTextColor(getResources().getColor(this.f221168x));
        }
        this.f221154g.setFocusable(true);
        this.f221154g.setClickable(true);
    }

    public void setEditBG(int i) {
        TenpaySecureEditText tenpaySecureEditText = this.f221154g;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setBackgroundResource(i);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        this.f221154g.setEllipsize(truncateAt);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f221141A = z;
        this.f221155h.setEnabled(true);
    }

    public void setEncryptType(int i) {
        if (C75592q0.m90763K()) {
            this.f221154g.setSecureEncrypt(new C79429a(i));
        }
    }

    public void setHintStr(String str) {
        this.f221154g.setHint(str);
    }

    public void setIdentifyCardType(int i) {
        this.f221167w = i;
        if (i == 1) {
            this.f221154g.setKeyListener(new C75161a(this));
        } else {
            this.f221154g.setInputType(1);
        }
    }

    public void setImeOptions(int i) {
        this.f221154g.setImeOptions(i);
    }

    public void setInfoIvVisible(int i) {
        this.f221155h.setVisibility(i);
    }

    public void setMaxLen(int i) {
        if (i != -1) {
            this.f221160p = i;
            this.f221154g.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }

    public void setOnEditorActionListener(TextView.OnEditorActionListener onEditorActionListener) {
        this.f221154g.setOnEditorActionListener(onEditorActionListener);
    }

    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        super.setOnFocusChangeListener(onFocusChangeListener);
        this.f221151d = onFocusChangeListener;
    }

    public void setOnInfoListener(C75163c cVar) {
    }

    public void setOnInputValidChangeListener(C75164d dVar) {
    }

    public void setPreFilledStr(String str) {
        if (!Util.isNullOrNil(str)) {
            this.f221153f.setText(str);
            this.f221153f.setVisibility(0);
            return;
        }
        this.f221153f.setText("");
        this.f221153f.setVisibility(8);
    }

    public void setPreText(String str) {
        KeyListener keyListener = this.f221154g.getKeyListener();
        this.f221154g.setInputType(1);
        this.f221154g.setKeyListener((KeyListener) null);
        setValStr(str);
        this.f221154g.setKeyListener(keyListener);
        this.f221145E = 4;
    }

    public void setShowScanCamera(boolean z) {
        this.f221143C = z;
        mo104897b();
    }

    public void setTipStr(String str) {
        this.f221152e.setText(str);
    }

    public void setTipTextColor(int i) {
        TextView textView = this.f221152e;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setTipWidth(int i) {
        this.f221163s = BackwardSupportUtil.BitmapFactory.fromDPToPix(getContext(), ((float) i) * 1.0f);
        TextView textView = this.f221152e;
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = this.f221163s;
            this.f221152e.setLayoutParams(layoutParams);
        }
    }

    public void setValStr(String str) {
        if (this.f221164t != 1) {
            this.f221154g.setText(str);
            TenpaySecureEditText tenpaySecureEditText = this.f221154g;
            tenpaySecureEditText.setSelection(tenpaySecureEditText.getText().length());
        } else if (Util.isNullOrNil(str) || str.length() > 5) {
            this.f221154g.setText(str);
            TenpaySecureEditText tenpaySecureEditText2 = this.f221154g;
            tenpaySecureEditText2.setSelection(tenpaySecureEditText2.getText().length());
        } else {
            this.f221154g.setSelection(0);
            this.f221154g.setBankcardTailNum(str);
            this.f221160p = 24 - str.length();
            this.f221154g.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f221160p)});
        }
    }

    public EditHintView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
