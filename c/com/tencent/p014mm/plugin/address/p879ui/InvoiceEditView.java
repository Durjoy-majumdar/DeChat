package com.tencent.p014mm.plugin.address.p879ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ch0.C67362c;
import ch0.C67363d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.address.ui.InvoiceEditView */
public class InvoiceEditView extends RelativeLayout implements View.OnFocusChangeListener {

    /* renamed from: A */
    public View.OnClickListener f196839A;

    /* renamed from: B */
    public String f196840B;

    /* renamed from: d */
    public boolean f196841d;

    /* renamed from: e */
    public C68522d f196842e;

    /* renamed from: f */
    public View.OnFocusChangeListener f196843f;

    /* renamed from: g */
    public TextView f196844g;

    /* renamed from: h */
    public EditText f196845h;

    /* renamed from: i */
    public ImageView f196846i;

    /* renamed from: j */
    public String f196847j;

    /* renamed from: n */
    public String f196848n;

    /* renamed from: o */
    public int f196849o;

    /* renamed from: p */
    public int f196850p;

    /* renamed from: q */
    public int f196851q;

    /* renamed from: r */
    public int f196852r;

    /* renamed from: s */
    public int f196853s;

    /* renamed from: t */
    public int f196854t;

    /* renamed from: u */
    public boolean f196855u;

    /* renamed from: v */
    public boolean f196856v;

    /* renamed from: w */
    public int f196857w;

    /* renamed from: x */
    public boolean f196858x;

    /* renamed from: y */
    public int f196859y;

    /* renamed from: z */
    public boolean f196860z;

    /* renamed from: com.tencent.mm.plugin.address.ui.InvoiceEditView$a */
    public class C68519a implements View.OnClickListener {
        public C68519a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/address/ui/InvoiceEditView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (InvoiceEditView.this.f196846i.getVisibility() == 0) {
                InvoiceEditView invoiceEditView = InvoiceEditView.this;
                if (!invoiceEditView.f196855u || invoiceEditView.f196851q == 2 || Util.isNullOrNil(invoiceEditView.getText())) {
                    InvoiceEditView.this.getClass();
                } else {
                    InvoiceEditView.this.f196845h.setText("");
                    InvoiceEditView invoiceEditView2 = InvoiceEditView.this;
                    invoiceEditView2.mo94102d(invoiceEditView2.f196845h.isFocused());
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/address/ui/InvoiceEditView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.address.ui.InvoiceEditView$b */
    public interface C68520b {
        /* renamed from: a */
        void mo94122a();
    }

    /* renamed from: com.tencent.mm.plugin.address.ui.InvoiceEditView$c */
    public interface C68521c {
    }

    /* renamed from: com.tencent.mm.plugin.address.ui.InvoiceEditView$d */
    public interface C68522d {
    }

    public InvoiceEditView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f196841d = false;
        this.f196847j = "";
        this.f196848n = "";
        this.f196849o = 1;
        this.f196850p = 0;
        this.f196851q = -1;
        this.f196853s = -1;
        this.f196854t = -1;
        this.f196855u = true;
        this.f196856v = true;
        this.f196858x = false;
        this.f196859y = 100;
        this.f196860z = true;
        this.f196839A = new C68519a();
        this.f196840B = null;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0966R.C0967a.f2315d, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(7, 0);
        if (resourceId != 0) {
            this.f196847j = context.getString(resourceId);
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(13, 0);
        if (resourceId2 != 0) {
            this.f196848n = context.getString(resourceId2);
        }
        this.f196849o = obtainStyledAttributes.getInteger(3, 1);
        this.f196851q = obtainStyledAttributes.getInteger(5, 0);
        this.f196855u = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getInt(0, 19);
        this.f196852r = obtainStyledAttributes.getInteger(4, 5);
        this.f196853s = obtainStyledAttributes.getResourceId(1, C0966R.C0969drawable.ayq);
        this.f196857w = obtainStyledAttributes.getResourceId(10, -1);
        this.f196854t = obtainStyledAttributes.getResourceId(8, C0966R.C0969drawable.ayq);
        this.f196860z = obtainStyledAttributes.getBoolean(12, true);
        obtainStyledAttributes.recycle();
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.b1y, this, true);
        EditText editText = (EditText) inflate.findViewById(C0966R.C0970id.ew8);
        this.f196845h = editText;
        editText.setTextSize(0, (float) C76577a.m92157h(context, C0966R.dimen.f3927j7));
        this.f196844g = (TextView) inflate.findViewById(C0966R.C0970id.kms);
        ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.f6w);
        this.f196846i = imageView;
        imageView.setOnClickListener(this.f196839A);
        this.f196845h.setImeOptions(this.f196852r);
        this.f196845h.setInputType(this.f196849o);
        int i2 = this.f196849o;
        if (i2 == 2) {
            this.f196845h.setKeyListener(new C67362c(this));
        } else if (i2 == 3) {
            this.f196845h.setKeyListener(new C67363d(this));
        } else {
            this.f196845h.setInputType(i2);
        }
        mo94102d(this.f196845h.isFocused());
        this.f196845h.addTextChangedListener(new C68543b(this));
        this.f196845h.setOnFocusChangeListener(this);
        if (!Util.isNullOrNil(this.f196847j)) {
            this.f196845h.setHint(this.f196847j);
        }
        if (!Util.isNullOrNil(this.f196848n)) {
            this.f196844g.setText(this.f196848n);
        }
        Rect rect = new Rect();
        mo94099a(this.f196845h, rect);
        if (!this.f196855u) {
            this.f196845h.setEnabled(false);
            this.f196845h.setTextColor(getResources().getColor(C0966R.color.f3032cr));
            this.f196845h.setFocusable(false);
            this.f196845h.setClickable(false);
            this.f196845h.setBackgroundResource(C0966R.C0969drawable.ayq);
            if (this.f196856v) {
                setBackgroundResource(C0966R.C0969drawable.f4855pa);
            }
            setPadding(C76577a.m92151b(getContext(), 8), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        } else {
            this.f196858x = false;
            this.f196845h.setBackgroundResource(this.f196854t);
            setBackgroundResource(this.f196853s);
        }
        this.f196845h.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int i3 = this.f196857w;
        if (i3 != -1) {
            this.f196846i.setImageResource(i3);
        }
        if (!this.f196860z) {
            this.f196845h.setSingleLine(false);
        }
    }

    private Rect getValidRectOfInfoIv() {
        Rect rect = new Rect();
        this.f196846i.getHitRect(rect);
        rect.left -= 50;
        rect.right += 50;
        rect.top -= 25;
        rect.bottom += 25;
        return rect;
    }

    /* renamed from: a */
    public final void mo94099a(View view, Rect rect) {
        rect.left = view.getPaddingLeft();
        rect.right = view.getPaddingRight();
        rect.top = view.getPaddingTop();
        rect.bottom = view.getPaddingBottom();
    }

    /* renamed from: b */
    public boolean mo94100b() {
        String obj = this.f196845h.getText().toString();
        int i = this.f196851q;
        return i != 0 ? i != 1 ? i != 4 ? i != 5 ? obj.length() >= 0 && obj.length() <= this.f196859y : obj.length() <= 48 : obj.length() <= 100 : obj.length() == 0 || (obj.length() >= 0 && obj.length() <= this.f196859y) : obj.length() >= 0 && obj.length() <= this.f196859y;
    }

    /* renamed from: c */
    public boolean mo94101c() {
        return !getText().equals(Util.nullAsNil(this.f196840B));
    }

    /* renamed from: d */
    public final void mo94102d(boolean z) {
        if (!this.f196855u || Util.isNullOrNil(getText())) {
            int i = this.f196851q;
            if (!(i == 0 || i == 1)) {
                if (i == 2) {
                    this.f196846i.setVisibility(0);
                    this.f196846i.setContentDescription(getContext().getString(C0966R.string.f7426fy));
                    return;
                } else if (i == 3) {
                    this.f196846i.setVisibility(0);
                    this.f196846i.setContentDescription(getContext().getString(C0966R.string.f7474h8));
                    return;
                } else if (i != 4) {
                    this.f196846i.setVisibility(8);
                    return;
                }
            }
            this.f196846i.setVisibility(8);
            return;
        }
        this.f196846i.setImageResource(C0966R.C0969drawable.abe);
        this.f196846i.setContentDescription(getContext().getString(C0966R.string.bf9));
        int i2 = this.f196851q;
        if (!(i2 == 0 || i2 == 1)) {
            if (i2 == 2) {
                this.f196846i.setVisibility(0);
                this.f196846i.setContentDescription(getContext().getString(C0966R.string.f7426fy));
                return;
            } else if (i2 == 3) {
                this.f196846i.setVisibility(0);
                this.f196846i.setContentDescription(getContext().getString(C0966R.string.f7474h8));
                return;
            } else if (!(i2 == 4 || i2 == 5)) {
                this.f196846i.setVisibility(8);
                return;
            }
        }
        if (z) {
            this.f196846i.setVisibility(0);
        } else {
            this.f196846i.setVisibility(8);
        }
    }

    public String getText() {
        return this.f196845h.getText().toString();
    }

    public void onFocusChange(View view, boolean z) {
        View.OnFocusChangeListener onFocusChangeListener = this.f196843f;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(this, z);
        }
        Log.m105918d("MicroMsg.InvoiceEditView", "View:" + this.f196848n + ", editType:" + this.f196851q + " onFocusChange to " + z);
        C68522d dVar = this.f196842e;
        if (dVar != null) {
            ((AddInvoiceUI) dVar).mo94067H7();
        }
        if (!this.f196858x) {
            this.f196844g.setEnabled(false);
        } else {
            this.f196844g.setEnabled(true);
        }
        if (view == this.f196845h) {
            Rect rect = new Rect();
            mo94099a(this, rect);
            if (z) {
                setBackgroundResource(C0966R.C0969drawable.c4f);
            } else {
                setBackgroundResource(C0966R.C0969drawable.c4g);
            }
            setPadding(rect.left, rect.top, rect.right, rect.bottom);
        }
        mo94102d(z);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f196855u) {
            return !((this.f196846i.getVisibility() == 0) && getValidRectOfInfoIv().contains((int) motionEvent.getX(), (int) motionEvent.getY()));
        }
    }

    public void setBankNumberValStr(String str) {
        if (this.f196851q == 5) {
            String replace = str.replace(" ", "");
            if (replace.length() >= 4) {
                StringBuilder sb = new StringBuilder();
                int i = 0;
                if (replace.length() % 4 == 0) {
                    while (i < (replace.length() / 4) - 1) {
                        int i2 = i * 4;
                        i++;
                        sb.append(replace.substring(i2, i * 4));
                        sb.append(" ");
                    }
                } else {
                    while (i < replace.length() / 4) {
                        int i3 = i * 4;
                        i++;
                        sb.append(replace.substring(i3, i * 4));
                        sb.append(" ");
                    }
                    sb.append(replace.substring((replace.length() / 4) * 4, replace.length()));
                    str = sb.toString();
                }
            }
        }
        this.f196845h.setText(str);
        EditText editText = this.f196845h;
        editText.setSelection(editText.getText().length());
    }

    public void setEditBG(int i) {
        if (this.f196845h != null) {
            Rect rect = new Rect();
            mo94099a(this.f196845h, rect);
            this.f196845h.setBackgroundResource(i);
            this.f196845h.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        this.f196845h.setEllipsize(truncateAt);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f196855u = z;
        this.f196846i.setEnabled(true);
    }

    public void setHintStr(String str) {
        this.f196845h.setHint(str);
    }

    public void setImeOptions(int i) {
        this.f196845h.setImeOptions(i);
    }

    public void setInfoIvOnClickListener(C68520b bVar) {
    }

    public void setInfoIvVisible(int i) {
        this.f196846i.setVisibility(i);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }

    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        super.setOnFocusChangeListener(onFocusChangeListener);
        this.f196843f = onFocusChangeListener;
    }

    public void setOnInputInvoiceTypeChangeListener(C68521c cVar) {
    }

    public void setOnInputValidChangeListener(C68522d dVar) {
        this.f196842e = dVar;
    }

    public void setTipStr(String str) {
        this.f196844g.setText(str);
    }

    public void setTipTextColor(int i) {
        TextView textView = this.f196844g;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setValStr(String str) {
        this.f196845h.setText(str);
        EditText editText = this.f196845h;
        editText.setSelection(editText.getText().length());
        this.f196840B = str;
    }

    public InvoiceEditView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
