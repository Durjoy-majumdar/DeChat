package com.tencent.p014mm.plugin.address.p879ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ch0.C67365f;
import ch0.C67366g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.address.ui.InvoiceQrcodeTextView */
public class InvoiceQrcodeTextView extends RelativeLayout implements View.OnFocusChangeListener {

    /* renamed from: d */
    public View.OnFocusChangeListener f196884d;

    /* renamed from: e */
    public TextView f196885e;

    /* renamed from: f */
    public TextView f196886f;

    /* renamed from: g */
    public ImageView f196887g;

    /* renamed from: h */
    public String f196888h;

    /* renamed from: i */
    public String f196889i;

    /* renamed from: j */
    public int f196890j;

    /* renamed from: n */
    public int f196891n;

    /* renamed from: o */
    public boolean f196892o;

    /* renamed from: p */
    public int f196893p;

    /* renamed from: q */
    public boolean f196894q;

    /* renamed from: r */
    public boolean f196895r;

    /* renamed from: s */
    public int f196896s;

    /* renamed from: t */
    public int f196897t;

    /* renamed from: u */
    public View.OnClickListener f196898u;

    /* renamed from: com.tencent.mm.plugin.address.ui.InvoiceQrcodeTextView$a */
    public class C68531a implements View.OnClickListener {
        public C68531a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/address/ui/InvoiceQrcodeTextView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (InvoiceQrcodeTextView.this.f196887g.getVisibility() == 0) {
                InvoiceQrcodeTextView invoiceQrcodeTextView = InvoiceQrcodeTextView.this;
                if (!invoiceQrcodeTextView.f196892o || invoiceQrcodeTextView.f196890j == 2 || Util.isNullOrNil(invoiceQrcodeTextView.getText())) {
                    InvoiceQrcodeTextView.this.getClass();
                } else {
                    InvoiceQrcodeTextView.this.f196886f.setText("");
                    InvoiceQrcodeTextView invoiceQrcodeTextView2 = InvoiceQrcodeTextView.this;
                    invoiceQrcodeTextView2.mo94136c(invoiceQrcodeTextView2.f196886f.isFocused());
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/address/ui/InvoiceQrcodeTextView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.address.ui.InvoiceQrcodeTextView$b */
    public interface C68532b {
        /* renamed from: a */
        void mo94156a();
    }

    /* renamed from: com.tencent.mm.plugin.address.ui.InvoiceQrcodeTextView$c */
    public interface C68533c {
    }

    /* renamed from: com.tencent.mm.plugin.address.ui.InvoiceQrcodeTextView$d */
    public interface C68534d {
        void onInputValidChange(boolean z);
    }

    public InvoiceQrcodeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f196888h = "";
        this.f196889i = "";
        this.f196890j = -1;
        this.f196892o = true;
        this.f196894q = false;
        this.f196895r = true;
        this.f196898u = new C68531a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0966R.C0967a.f2315d, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(7, 0);
        if (resourceId != 0) {
            this.f196888h = context.getString(resourceId);
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(13, 0);
        if (resourceId2 != 0) {
            this.f196889i = context.getString(resourceId2);
        }
        obtainStyledAttributes.getInteger(3, 1);
        this.f196890j = obtainStyledAttributes.getInteger(5, 0);
        this.f196892o = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getInt(0, 19);
        this.f196891n = obtainStyledAttributes.getInteger(4, 5);
        obtainStyledAttributes.getResourceId(1, C0966R.C0969drawable.ayq);
        this.f196893p = obtainStyledAttributes.getResourceId(10, -1);
        obtainStyledAttributes.getResourceId(8, C0966R.C0969drawable.ayq);
        this.f196895r = obtainStyledAttributes.getBoolean(12, true);
        obtainStyledAttributes.recycle();
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.f359834b21, this, true);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.ew8);
        this.f196886f = textView;
        textView.setTextSize(0, (float) C76577a.m92157h(context, C0966R.dimen.f3927j7));
        this.f196885e = (TextView) inflate.findViewById(C0966R.C0970id.kms);
        ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.f6w);
        this.f196887g = imageView;
        imageView.setOnClickListener(this.f196898u);
        this.f196886f.setImeOptions(this.f196891n);
        if (!Util.isNullOrNil(this.f196888h)) {
            this.f196886f.setHint(this.f196888h);
        }
        if (!Util.isNullOrNil(this.f196889i)) {
            this.f196885e.setText(this.f196889i);
        }
        Rect rect = new Rect();
        mo94134a(this.f196886f, rect);
        this.f196886f.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        setPadding(C76577a.m92151b(getContext(), 8), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        int i2 = this.f196893p;
        if (i2 != -1) {
            this.f196887g.setImageResource(i2);
        }
        if (!this.f196895r) {
            this.f196886f.setSingleLine(false);
        }
        this.f196886f.setOnTouchListener(new C67365f(this));
        this.f196886f.setOnLongClickListener(new C67366g(this));
    }

    private Rect getValidRectOfInfoIv() {
        Rect rect = new Rect();
        this.f196887g.getHitRect(rect);
        rect.left -= 50;
        rect.right += 50;
        rect.top -= 25;
        rect.bottom += 25;
        return rect;
    }

    /* renamed from: a */
    public final void mo94134a(View view, Rect rect) {
        rect.left = view.getPaddingLeft();
        rect.right = view.getPaddingRight();
        rect.top = view.getPaddingTop();
        rect.bottom = view.getPaddingBottom();
    }

    /* renamed from: b */
    public void mo94135b() {
        setBackgroundResource(0);
        this.f196885e.setTextColor(getResources().getColor(C0966R.color.f3563xt));
        this.f196886f.setTextColor(getResources().getColor(C0966R.color.a7f));
        this.f196886f.setInputType(0);
        this.f196886f.clearFocus();
        this.f196886f.setSingleLine(false);
        ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f196886f.getWindowToken(), 0);
    }

    /* renamed from: c */
    public final void mo94136c(boolean z) {
        if (!this.f196892o || Util.isNullOrNil(getText())) {
            int i = this.f196890j;
            if (!(i == 0 || i == 1)) {
                if (i == 2) {
                    this.f196887g.setVisibility(0);
                    this.f196887g.setContentDescription(getContext().getString(C0966R.string.f7426fy));
                    return;
                } else if (i == 3) {
                    this.f196887g.setVisibility(0);
                    this.f196887g.setContentDescription(getContext().getString(C0966R.string.f7474h8));
                    return;
                } else if (i != 4) {
                    this.f196887g.setVisibility(8);
                    return;
                }
            }
            this.f196887g.setVisibility(8);
            return;
        }
        this.f196887g.setImageResource(C0966R.C0969drawable.abe);
        this.f196887g.setContentDescription(getContext().getString(C0966R.string.bf9));
        int i2 = this.f196890j;
        if (!(i2 == 0 || i2 == 1)) {
            if (i2 == 2) {
                this.f196887g.setVisibility(0);
                this.f196887g.setContentDescription(getContext().getString(C0966R.string.f7426fy));
                return;
            } else if (i2 == 3) {
                this.f196887g.setVisibility(0);
                this.f196887g.setContentDescription(getContext().getString(C0966R.string.f7474h8));
                return;
            } else if (!(i2 == 4 || i2 == 5)) {
                this.f196887g.setVisibility(8);
                return;
            }
        }
        if (z) {
            this.f196887g.setVisibility(0);
        } else {
            this.f196887g.setVisibility(8);
        }
    }

    public String getText() {
        return this.f196886f.getText().toString();
    }

    public void onFocusChange(View view, boolean z) {
        View.OnFocusChangeListener onFocusChangeListener = this.f196884d;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(this, z);
        }
        Log.m105918d("MicroMsg.InvoiceEditView", "View:" + this.f196889i + ", editType:" + this.f196890j + " onFocusChange to " + z);
        if (!this.f196894q) {
            this.f196885e.setEnabled(false);
        } else {
            this.f196885e.setEnabled(true);
        }
        if (view == this.f196886f) {
            Rect rect = new Rect();
            mo94134a(this, rect);
            if (z) {
                setBackgroundResource(C0966R.C0969drawable.c4f);
            } else {
                setBackgroundResource(C0966R.C0969drawable.c4g);
            }
            setPadding(rect.left, rect.top, rect.right, rect.bottom);
        }
        mo94136c(z);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f196892o) {
            return !((this.f196887g.getVisibility() == 0) && getValidRectOfInfoIv().contains((int) motionEvent.getX(), (int) motionEvent.getY()));
        }
    }

    public void setBankNumberValStr(String str) {
        if (this.f196890j == 5) {
            String replace = str.replace(" ", "");
            if (replace.length() >= 4) {
                StringBuilder sb = new StringBuilder();
                int i = 0;
                while (i < replace.length() / 4) {
                    int i2 = i * 4;
                    i++;
                    sb.append(replace.substring(i2, i * 4));
                    sb.append(" ");
                }
                sb.append(replace.substring((replace.length() / 4) * 4, replace.length()));
                str = sb.toString();
            }
        }
        this.f196886f.setText(str);
    }

    public void setEditBG(int i) {
        if (this.f196886f != null) {
            Rect rect = new Rect();
            mo94134a(this.f196886f, rect);
            this.f196886f.setBackgroundResource(i);
            this.f196886f.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        this.f196886f.setEllipsize(truncateAt);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f196892o = z;
        this.f196887g.setEnabled(true);
    }

    public void setHintStr(String str) {
        this.f196886f.setHint(str);
    }

    public void setImeOptions(int i) {
        this.f196886f.setImeOptions(i);
    }

    public void setInfoIvOnClickListener(C68532b bVar) {
    }

    public void setInfoIvVisible(int i) {
        this.f196887g.setVisibility(i);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }

    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        super.setOnFocusChangeListener(onFocusChangeListener);
        this.f196884d = onFocusChangeListener;
    }

    public void setOnInputInvoiceTypeChangeListener(C68533c cVar) {
    }

    public void setOnInputValidChangeListener(C68534d dVar) {
    }

    public void setTipStr(String str) {
        this.f196885e.setText(str);
    }

    public void setTipTextColor(int i) {
        TextView textView = this.f196885e;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setValStr(String str) {
        this.f196886f.setText(str);
    }

    public InvoiceQrcodeTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
