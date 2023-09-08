package com.tencent.p014mm.plugin.address.p879ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.telephony.PhoneNumberUtils;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ch0.C67360a;
import ch0.C67361b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.address.ui.AddrEditView */
public class AddrEditView extends RelativeLayout implements View.OnFocusChangeListener {

    /* renamed from: A */
    public View.OnClickListener f196816A;

    /* renamed from: B */
    public String f196817B;

    /* renamed from: d */
    public C68517b f196818d;

    /* renamed from: e */
    public C68518c f196819e;

    /* renamed from: f */
    public View.OnFocusChangeListener f196820f;

    /* renamed from: g */
    public TextView f196821g;

    /* renamed from: h */
    public EditText f196822h;

    /* renamed from: i */
    public ImageView f196823i;

    /* renamed from: j */
    public String f196824j;

    /* renamed from: n */
    public String f196825n;

    /* renamed from: o */
    public int f196826o;

    /* renamed from: p */
    public int f196827p;

    /* renamed from: q */
    public int f196828q;

    /* renamed from: r */
    public int f196829r;

    /* renamed from: s */
    public int f196830s;

    /* renamed from: t */
    public int f196831t;

    /* renamed from: u */
    public boolean f196832u;

    /* renamed from: v */
    public int f196833v;

    /* renamed from: w */
    public boolean f196834w;

    /* renamed from: x */
    public int f196835x;

    /* renamed from: y */
    public int f196836y;

    /* renamed from: z */
    public boolean f196837z;

    /* renamed from: com.tencent.mm.plugin.address.ui.AddrEditView$a */
    public class C68516a implements View.OnClickListener {
        public C68516a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/address/ui/AddrEditView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (AddrEditView.this.f196823i.getVisibility() == 0) {
                AddrEditView addrEditView = AddrEditView.this;
                if (!addrEditView.f196832u || addrEditView.f196828q == 2 || Util.isNullOrNil(addrEditView.getText())) {
                    C68517b bVar = AddrEditView.this.f196818d;
                    if (bVar != null) {
                        bVar.mo94098a();
                    }
                } else {
                    AddrEditView.this.f196822h.setText("");
                    AddrEditView addrEditView2 = AddrEditView.this;
                    addrEditView2.mo94080f(addrEditView2.f196822h.isFocused());
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/address/ui/AddrEditView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.address.ui.AddrEditView$b */
    public interface C68517b {
        /* renamed from: a */
        void mo94098a();
    }

    /* renamed from: com.tencent.mm.plugin.address.ui.AddrEditView$c */
    public interface C68518c {
    }

    public AddrEditView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f196824j = "";
        this.f196825n = "";
        this.f196826o = 1;
        this.f196827p = 19;
        this.f196828q = -1;
        this.f196830s = -1;
        this.f196831t = -1;
        this.f196832u = true;
        this.f196834w = false;
        this.f196835x = 1;
        this.f196836y = 20;
        this.f196837z = true;
        this.f196816A = new C68516a();
        this.f196817B = null;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0966R.C0967a.f2312a, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(7, 0);
        if (resourceId != 0) {
            this.f196824j = context.getString(resourceId);
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(13, 0);
        if (resourceId2 != 0) {
            this.f196825n = context.getString(resourceId2);
        }
        this.f196826o = obtainStyledAttributes.getInteger(3, 1);
        this.f196828q = obtainStyledAttributes.getInteger(5, 0);
        this.f196832u = obtainStyledAttributes.getBoolean(6, true);
        this.f196827p = obtainStyledAttributes.getInt(0, 19);
        this.f196829r = obtainStyledAttributes.getInteger(4, 5);
        this.f196830s = obtainStyledAttributes.getResourceId(1, C0966R.C0969drawable.ayq);
        this.f196833v = obtainStyledAttributes.getResourceId(10, -1);
        this.f196831t = obtainStyledAttributes.getResourceId(8, C0966R.C0969drawable.ayq);
        this.f196837z = obtainStyledAttributes.getBoolean(12, true);
        obtainStyledAttributes.recycle();
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.f6361cq, this, true);
        EditText editText = (EditText) inflate.findViewById(C0966R.C0970id.ew8);
        this.f196822h = editText;
        editText.setTextSize(0, (float) C76577a.m92157h(context, C0966R.dimen.f3927j7));
        this.f196821g = (TextView) inflate.findViewById(C0966R.C0970id.kms);
        ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.f6w);
        this.f196823i = imageView;
        imageView.setOnClickListener(this.f196816A);
        this.f196822h.setImeOptions(this.f196829r);
        this.f196822h.setInputType(this.f196826o);
        int i2 = this.f196826o;
        if (i2 == 2) {
            this.f196822h.setKeyListener(new C67360a(this));
        } else if (i2 == 3) {
            this.f196822h.setKeyListener(new C67361b(this));
            this.f196822h.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f196836y)});
        } else {
            this.f196822h.setInputType(i2);
        }
        mo94080f(this.f196822h.isFocused());
        this.f196822h.addTextChangedListener(new C68542a(this));
        this.f196822h.setOnFocusChangeListener(this);
        if (!Util.isNullOrNil(this.f196824j)) {
            this.f196822h.setHint(this.f196824j);
        }
        if (!Util.isNullOrNil(this.f196825n)) {
            this.f196821g.setText(this.f196825n);
        }
        Rect rect = new Rect();
        mo94077c(this.f196822h, rect);
        if (!this.f196832u) {
            this.f196822h.setEnabled(false);
            this.f196822h.setFocusable(false);
            this.f196822h.setClickable(false);
            this.f196822h.setBackgroundResource(C0966R.C0969drawable.ayq);
            setBackgroundResource(C0966R.C0969drawable.agk);
            setPadding(C76577a.m92151b(getContext(), 8), getPaddingTop(), C76577a.m92151b(getContext(), 8), getPaddingBottom());
        } else {
            this.f196834w = false;
            this.f196822h.setBackgroundResource(this.f196831t);
            setBackgroundResource(this.f196830s);
        }
        this.f196822h.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        this.f196822h.setGravity(this.f196827p);
        int i3 = this.f196833v;
        if (i3 != -1) {
            this.f196823i.setImageDrawable(C74933u4.m89768e(context, i3, context.getResources().getColor(C0966R.color.FG_0)));
        }
        if (!this.f196837z) {
            this.f196822h.setSingleLine(false);
        }
    }

    /* renamed from: a */
    public static int m80772a(String str) {
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int i3 = i + 1;
            i2 = str.substring(i, i3).matches("[Α-￥]") ? i2 + 2 : i2 + 1;
            i = i3;
        }
        return i2;
    }

    private Rect getValidRectOfInfoIv() {
        Rect rect = new Rect();
        this.f196823i.getHitRect(rect);
        rect.left -= 50;
        rect.right += 50;
        rect.top -= 25;
        rect.bottom += 25;
        return rect;
    }

    /* renamed from: b */
    public void mo94076b() {
        this.f196822h.setHintTextColor(getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_3));
        this.f196822h.setTextColor(getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
        this.f196821g.setTextColor(getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
        if (this.f196833v != -1) {
            this.f196823i.setImageDrawable(C74933u4.m89768e(getContext(), this.f196833v, getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9)));
        }
    }

    /* renamed from: c */
    public final void mo94077c(View view, Rect rect) {
        rect.left = view.getPaddingLeft();
        rect.right = view.getPaddingRight();
        rect.top = view.getPaddingTop();
        rect.bottom = view.getPaddingBottom();
    }

    /* renamed from: d */
    public boolean mo94078d() {
        String obj = this.f196822h.getText().toString();
        int i = this.f196828q;
        if (i != 1) {
            if (i == 2) {
                return obj.length() >= this.f196835x && m80772a(obj) <= 32;
            }
            if (i != 3) {
                if (i == 4) {
                    return obj.length() <= this.f196836y;
                }
                if (i != 5) {
                    return obj.length() >= this.f196835x;
                }
            }
            return obj.length() >= this.f196835x && m80772a(obj) <= 128;
        } else if (obj.length() < this.f196835x || obj.length() > this.f196836y) {
            return false;
        } else {
            String replaceAll = obj.replaceAll("\\D", "");
            if (replaceAll.startsWith("86")) {
                replaceAll = replaceAll.substring(2);
            }
            return PhoneNumberUtils.isGlobalPhoneNumber(replaceAll);
        }
    }

    /* renamed from: e */
    public boolean mo94079e() {
        return !getText().equals(Util.nullAsNil(this.f196817B));
    }

    /* renamed from: f */
    public final void mo94080f(boolean z) {
        if (!this.f196832u || Util.isNullOrNil(getText())) {
            int i = this.f196828q;
            if (i == 0 || i == 1) {
                this.f196823i.setVisibility(8);
            } else if (i == 2) {
                this.f196823i.setVisibility(0);
                this.f196823i.setImageResource(C0966R.raw.icons_outlined_subscriptions);
                this.f196823i.setContentDescription(getContext().getString(C0966R.string.f7426fy));
            } else if (i != 3) {
                this.f196823i.setVisibility(8);
            } else {
                this.f196823i.setVisibility(0);
                this.f196823i.setImageResource(C0966R.raw.icons_outlined_location);
                this.f196823i.setContentDescription(getContext().getString(C0966R.string.f7474h8));
            }
        } else {
            this.f196823i.setImageDrawable(C74942w4.m89785b(getContext(), C0966R.attr.f2816m1));
            this.f196823i.setContentDescription(getContext().getString(C0966R.string.bf9));
            int i2 = this.f196828q;
            if (i2 == 0 || i2 == 1) {
                if (z) {
                    this.f196823i.setVisibility(0);
                } else {
                    this.f196823i.setVisibility(8);
                }
            } else if (i2 == 2) {
                this.f196823i.setVisibility(0);
                this.f196823i.setImageResource(C0966R.raw.icons_outlined_subscriptions);
                this.f196823i.setContentDescription(getContext().getString(C0966R.string.f7426fy));
            } else if (i2 != 3) {
                this.f196823i.setVisibility(8);
            } else {
                this.f196823i.setVisibility(0);
                this.f196823i.setImageResource(C0966R.raw.icons_outlined_location);
                this.f196823i.setContentDescription(getContext().getString(C0966R.string.f7474h8));
            }
        }
    }

    public String getText() {
        return this.f196822h.getText().toString();
    }

    public void onFocusChange(View view, boolean z) {
        View.OnFocusChangeListener onFocusChangeListener = this.f196820f;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(this, z);
        }
        Log.m105918d("MicroMsg.AddrEditView", "View:" + this.f196825n + ", editType:" + this.f196828q + " onFocusChange to " + z);
        C68518c cVar = this.f196819e;
        if (cVar != null) {
            ((WalletAddAddressUI) cVar).mo174965H7();
        }
        if (!this.f196834w) {
            this.f196821g.setEnabled(false);
        } else {
            this.f196821g.setEnabled(true);
        }
        if (view == this.f196822h) {
            Rect rect = new Rect();
            mo94077c(this, rect);
            if (z) {
                setBackgroundResource(C0966R.C0969drawable.c4f);
            } else {
                setBackgroundResource(C0966R.C0969drawable.c4g);
            }
            setPadding(rect.left, rect.top, rect.right, rect.bottom);
        }
        mo94080f(z);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f196832u) {
            return !((this.f196823i.getVisibility() == 0) && getValidRectOfInfoIv().contains((int) motionEvent.getX(), (int) motionEvent.getY()));
        }
    }

    public void setEditBG(int i) {
        if (this.f196822h != null) {
            Rect rect = new Rect();
            mo94077c(this.f196822h, rect);
            this.f196822h.setBackgroundResource(i);
            this.f196822h.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        this.f196822h.setEllipsize(truncateAt);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f196832u = z;
        this.f196823i.setEnabled(true);
    }

    public void setHintStr(String str) {
        this.f196822h.setHint(str);
    }

    public void setImeOptions(int i) {
        this.f196822h.setImeOptions(i);
    }

    public void setInfoIvOnClickListener(C68517b bVar) {
        this.f196818d = bVar;
    }

    public void setInfoIvVisible(int i) {
        this.f196823i.setVisibility(i);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }

    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        super.setOnFocusChangeListener(onFocusChangeListener);
        this.f196820f = onFocusChangeListener;
    }

    public void setOnInputValidChangeListener(C68518c cVar) {
        this.f196819e = cVar;
    }

    public void setTipStr(String str) {
        this.f196821g.setText(str);
    }

    public void setTipTextColor(int i) {
        TextView textView = this.f196821g;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setValStr(String str) {
        this.f196822h.setText(str);
        EditText editText = this.f196822h;
        editText.setSelection(editText.getText().length());
        this.f196817B = str;
    }

    public AddrEditView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
