package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.p133ui.ProfileItemView;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.profile.ui.ProfileNormalItemView */
public class ProfileNormalItemView extends ProfileItemView {

    /* renamed from: e */
    public String f20217e;

    /* renamed from: f */
    public CharSequence f20218f;

    /* renamed from: g */
    public View.OnClickListener f20219g;

    /* renamed from: h */
    public TextView f20220h;

    /* renamed from: i */
    public TextView f20221i;

    /* renamed from: j */
    public View f20222j;

    public ProfileNormalItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0966R.C0967a.f2316e);
        this.f20217e = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public void mo5918a() {
        this.f20220h = (TextView) findViewById(C0966R.C0970id.bpj);
        this.f20221i = (TextView) findViewById(C0966R.C0970id.bpi);
        this.f20222j = findViewById(C0966R.C0970id.isy);
    }

    /* renamed from: b */
    public boolean mo5919b() {
        this.f20220h.setText(this.f20217e);
        if (Util.isNullOrNil(this.f20218f)) {
            setVisibility(8);
            return false;
        }
        setVisibility(0);
        this.f20221i.setText(this.f20218f);
        setOnClickListener(this.f20219g);
        return true;
    }

    /* renamed from: c */
    public ProfileNormalItemView mo5920c(boolean z) {
        View view = this.f20222j;
        int i = z ? 0 : 8;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/ProfileNormalItemView", "setRightArrow", "(Z)Lcom/tencent/mm/plugin/profile/ui/ProfileNormalItemView;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/profile/ui/ProfileNormalItemView", "setRightArrow", "(Z)Lcom/tencent/mm/plugin/profile/ui/ProfileNormalItemView;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return this;
    }

    /* renamed from: d */
    public ProfileNormalItemView mo5921d(int i) {
        this.f20218f = getContext().getString(i);
        return this;
    }

    /* renamed from: e */
    public ProfileNormalItemView mo5922e(int i) {
        this.f20217e = getContext().getString(i);
        return this;
    }

    public int getLayout() {
        return C0966R.C0971layout.bom;
    }

    public ProfileNormalItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
