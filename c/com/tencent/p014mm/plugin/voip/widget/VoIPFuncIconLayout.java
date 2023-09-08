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

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/voip/widget/VoIPFuncIconLayout;", "Landroid/widget/FrameLayout;", "", "enable", "Lrx3/b0;", "setIconEnabled", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-voip_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.voip.widget.VoIPFuncIconLayout */
public final class VoIPFuncIconLayout extends FrameLayout {

    /* renamed from: d */
    public WeImageView f207517d;

    /* renamed from: e */
    public TextView f207518e;

    /* renamed from: f */
    public FrameLayout f207519f;

    /* renamed from: g */
    public String f207520g;

    /* renamed from: h */
    public int f207521h;

    /* renamed from: i */
    public int f207522i;

    /* renamed from: j */
    public View f207523j;

    /* renamed from: n */
    public float f207524n;

    /* renamed from: o */
    public int f207525o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoIPFuncIconLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attributeSet");
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.ccz, this);
        C87412m.m108593f(inflate, "from(context).inflate(R.…_func_icons_layout, this)");
        this.f207523j = inflate;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C76669d.f224356b);
        C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…ble.VoipControlIconStyle)");
        String string = obtainStyledAttributes.getString(5);
        this.f207520g = string == null ? "" : string;
        this.f207522i = obtainStyledAttributes.getResourceId(3, -1);
        this.f207521h = obtainStyledAttributes.getInteger(6, -1);
        this.f207524n = obtainStyledAttributes.getDimension(4, -1.0f);
        this.f207525o = obtainStyledAttributes.getResourceId(2, -1);
        obtainStyledAttributes.recycle();
        View findViewById = findViewById(C0966R.C0970id.f2a);
        C87412m.m108593f(findViewById, "findViewById(R.id.icon_iv)");
        WeImageView weImageView = (WeImageView) findViewById;
        this.f207517d = weImageView;
        int i = this.f207522i;
        if (i != -1) {
            weImageView.setImageDrawable(C74933u4.m89768e(context, i, -1));
            this.f207517d.setIconColor(-1);
        }
        View findViewById2 = findViewById(C0966R.C0970id.f2i);
        C87412m.m108593f(findViewById2, "findViewById(R.id.icon_name)");
        TextView textView = (TextView) findViewById2;
        this.f207518e = textView;
        textView.setText(this.f207520g);
        this.f207518e.setTextColor(this.f207521h);
        View findViewById3 = findViewById(C0966R.C0970id.f2e);
        C87412m.m108593f(findViewById3, "findViewById(R.id.icon_main)");
        FrameLayout frameLayout = (FrameLayout) findViewById3;
        this.f207519f = frameLayout;
        if (!(this.f207524n == -1.0f)) {
            frameLayout.setLayoutParams(new RelativeLayout.LayoutParams(C74942w4.m89784a(context, (int) this.f207524n), C74942w4.m89784a(context, (int) this.f207524n)));
        }
        if (this.f207525o != -1) {
            this.f207519f.setBackground(getResources().getDrawable(this.f207525o));
        }
    }

    public final void setIconEnabled(boolean z) {
        this.f207519f.setEnabled(z);
        if (z) {
            if (this.f207522i != -1) {
                this.f207517d.setImageDrawable(C74933u4.m89768e(getContext(), this.f207522i, -1));
                this.f207517d.setIconColor(-1);
            }
        } else if (this.f207522i != -1) {
            int b = C74933u4.m89765b(C74933u4.m89764a(-16777216, 50), -1);
            this.f207517d.setImageDrawable(C74933u4.m89768e(getContext(), this.f207522i, b));
            this.f207517d.setIconColor(b);
        }
    }
}
