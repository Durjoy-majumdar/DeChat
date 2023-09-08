package com.tencent.p014mm.plugin.voip.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import gy3.C87412m;
import kotlin.Metadata;
import l33.C76669d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/plugin/voip/widget/VoIPControlIconLayout;", "Landroid/widget/FrameLayout;", "Landroid/view/View$OnClickListener;", "l", "Lrx3/b0;", "setOnClickListener", "", "isChecked", "setChecked", "enable", "setIconEnabled", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-voip_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.voip.widget.VoIPControlIconLayout */
public final class VoIPControlIconLayout extends FrameLayout {

    /* renamed from: d */
    public MMCheckBox f207503d;

    /* renamed from: e */
    public WeImageView f207504e;

    /* renamed from: f */
    public TextView f207505f;

    /* renamed from: g */
    public FrameLayout f207506g;

    /* renamed from: h */
    public final String f207507h;

    /* renamed from: i */
    public String f207508i;

    /* renamed from: j */
    public String f207509j;

    /* renamed from: n */
    public int f207510n;

    /* renamed from: o */
    public int f207511o;

    /* renamed from: p */
    public int f207512p;

    /* renamed from: q */
    public boolean f207513q;

    /* renamed from: r */
    public View f207514r;

    /* renamed from: s */
    public float f207515s;

    /* renamed from: t */
    public int f207516t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoIPControlIconLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attributeSet");
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.ccw, this);
        C87412m.m108593f(inflate, "from(context).inflate(R.…ntrol_icons_layout, this)");
        this.f207514r = inflate;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C76669d.f224356b);
        C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…ble.VoipControlIconStyle)");
        String string = obtainStyledAttributes.getString(5);
        this.f207507h = string;
        boolean z = true;
        String string2 = obtainStyledAttributes.getString(1);
        String str = "";
        this.f207508i = string2 == null ? str : string2;
        String string3 = obtainStyledAttributes.getString(10);
        this.f207509j = string3 != null ? string3 : str;
        this.f207511o = obtainStyledAttributes.getResourceId(0, -1);
        this.f207510n = obtainStyledAttributes.getInteger(6, -1);
        this.f207513q = obtainStyledAttributes.getBoolean(7, false);
        this.f207512p = obtainStyledAttributes.getResourceId(9, -1);
        this.f207515s = obtainStyledAttributes.getDimension(4, -1.0f);
        this.f207516t = obtainStyledAttributes.getResourceId(2, -1);
        obtainStyledAttributes.recycle();
        View findViewById = findViewById(C0966R.C0970id.f1m);
        C87412m.m108593f(findViewById, "findViewById(R.id.icon_checkbox)");
        this.f207503d = (MMCheckBox) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.f2a);
        C87412m.m108593f(findViewById2, "findViewById(R.id.icon_iv)");
        WeImageView weImageView = (WeImageView) findViewById2;
        this.f207504e = weImageView;
        int i = this.f207511o;
        if (i != -1) {
            if (this.f207513q) {
                weImageView.setImageDrawable(C74933u4.m89768e(context, i, -16777216));
                this.f207504e.setIconColor(-16777216);
            } else {
                weImageView.setImageDrawable(C74933u4.m89768e(context, i, -1));
                this.f207504e.setIconColor(-1);
            }
        }
        View findViewById3 = findViewById(C0966R.C0970id.f2i);
        C87412m.m108593f(findViewById3, "findViewById(R.id.icon_name)");
        TextView textView = (TextView) findViewById3;
        this.f207505f = textView;
        textView.setText(string);
        this.f207505f.setTextColor(this.f207510n);
        View findViewById4 = findViewById(C0966R.C0970id.f2e);
        C87412m.m108593f(findViewById4, "findViewById(R.id.icon_main)");
        FrameLayout frameLayout = (FrameLayout) findViewById4;
        this.f207506g = frameLayout;
        if (!(this.f207515s != -1.0f ? false : z)) {
            frameLayout.setLayoutParams(new RelativeLayout.LayoutParams(C74942w4.m89784a(context, (int) this.f207515s), C74942w4.m89784a(context, (int) this.f207515s)));
        }
        if (this.f207516t != -1) {
            this.f207506g.setBackground(getResources().getDrawable(this.f207516t));
        }
        if (string == null) {
            this.f207505f.setText(this.f207508i);
            setContentDescription(this.f207508i);
        }
    }

    /* renamed from: a */
    public final boolean mo98766a() {
        return this.f207503d.isChecked();
    }

    public final void setChecked(boolean z) {
        int i;
        this.f207503d.setChecked(z);
        this.f207506g.setSelected(z);
        int i2 = -1;
        if (this.f207511o != -1) {
            boolean a = mo98766a();
            if (!this.f207503d.isEnabled()) {
                i = C74933u4.m89765b(C74933u4.m89764a(-7829368, 50), -1);
            } else {
                if (a) {
                    i2 = -16777216;
                }
                i = i2;
            }
            this.f207504e.setImageDrawable(mo98766a() ? C74933u4.m89768e(getContext(), this.f207511o, i) : C74933u4.m89768e(getContext(), this.f207512p, i));
            this.f207504e.setIconColor(i);
        }
        if (this.f207507h == null) {
            this.f207505f.setText(mo98766a() ? this.f207508i : this.f207509j);
            setContentDescription(this.f207505f.getText());
        }
    }

    public final void setIconEnabled(boolean z) {
        int i;
        this.f207503d.setEnabled(z);
        this.f207506g.setEnabled(z);
        WeImageView weImageView = this.f207504e;
        boolean a = mo98766a();
        int i2 = -1;
        if (!z) {
            i = C74933u4.m89765b(C74933u4.m89764a(-7829368, 50), -1);
        } else {
            if (a) {
                i2 = -16777216;
            }
            i = i2;
        }
        weImageView.setIconColor(i);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f207503d.setOnClickListener(onClickListener);
    }
}
