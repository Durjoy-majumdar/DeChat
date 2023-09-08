package com.tencent.p014mm.p136ui.widget.picker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.picker.base.view.WheelView;
import java.util.Arrays;
import of0.C21793a;
import p385u2.C111105a;
import qf0.C22082c;
import qf0.C22083d;
import rf0.C22228b;
import rf0.C22232f;

/* renamed from: com.tencent.mm.ui.widget.picker.CustomOptionPickNew */
public class CustomOptionPickNew extends FrameLayout {

    /* renamed from: d */
    public String[] f56586d;

    /* renamed from: e */
    public C22228b<String> f56587e;

    /* renamed from: f */
    public Context f56588f;

    /* renamed from: g */
    public int f56589g;

    /* renamed from: h */
    public int f56590h;

    /* renamed from: com.tencent.mm.ui.widget.picker.CustomOptionPickNew$a */
    public class C19863a implements C22083d {
        public C19863a() {
        }

        /* renamed from: a */
        public void mo22631a(int i) {
            CustomOptionPickNew.this.f56589g = i;
        }
    }

    public CustomOptionPickNew(Context context) {
        super(new ContextThemeWrapper(context, C0966R.style.a4p));
        this.f56588f = context;
        this.f56587e = new C22228b<>(context);
        mo23695b();
    }

    /* renamed from: a */
    public String mo26472a() {
        this.f56587e.mo35385f();
        return this.f56586d[this.f56589g];
    }

    /* renamed from: b */
    public void mo23695b() {
        C21793a aVar = new C21793a(this.f56588f, new C19863a());
        aVar.f61766a.f62188e = this.f56590h;
        aVar.f61766a.f62195l = C111105a.m151500b(this.f56588f, C0966R.color.BW_0_Alpha_0_1);
        aVar.mo34201a(this.f56587e);
        setDividerHeight((float) this.f56588f.getResources().getDimensionPixelSize(C0966R.dimen.f4175v5));
        setItemHeight(this.f56588f.getResources().getDimensionPixelSize(C0966R.dimen.f3743cv));
        setDividerColor(C111105a.m151500b(this.f56588f, C0966R.color.BW_0_Alpha_0_1));
        C22232f fVar = this.f56587e.f62978p;
        fVar.f62987b.setPadding(0, this.f56588f.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), 0, this.f56588f.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp));
        WheelView wheelView = this.f56587e.f62978p.f62987b;
        wheelView.mo22032e(C111105a.m151500b(this.f56588f, C0966R.color.BW_0_Alpha_0_9));
        wheelView.f49141d = this.f56588f.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp);
        wheelView.invalidate();
        wheelView.setBackgroundColor(C111105a.m151500b(this.f56588f, C0966R.color.f2932f));
    }

    /* renamed from: c */
    public void mo26473c(int i) {
        this.f56587e.mo35384e().setCurrentItem(i);
    }

    public int getValue() {
        this.f56587e.mo35385f();
        return this.f56589g;
    }

    public WheelView getView() {
        return this.f56587e.mo35384e();
    }

    public void setDividerColor(int i) {
        this.f56587e.f62978p.f62987b.setDividerColor(i);
    }

    public void setDividerHeight(float f) {
        this.f56587e.f62978p.f62987b.setDividerHeight(f);
    }

    public void setItemHeight(int i) {
        this.f56587e.f62978p.getClass();
    }

    public void setOnValueChangedListener(C22082c cVar) {
        C22228b<String> bVar = this.f56587e;
        bVar.f226020g.f62187d = cVar;
        bVar.f62978p.f62989d = cVar;
    }

    public void setOptionsArray(String[] strArr) {
        this.f56586d = strArr;
        this.f56587e.mo35386g(Arrays.asList(strArr));
    }

    public void setValue(int i) {
        this.f56590h = i;
    }

    public CustomOptionPickNew(Context context, AttributeSet attributeSet) {
        super(new ContextThemeWrapper(context, C0966R.style.a4p), attributeSet);
        this.f56588f = context;
        this.f56587e = new C22228b<>(context);
        mo23695b();
    }

    public CustomOptionPickNew(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f56588f = context;
        this.f56587e = new C22228b<>(context);
        mo23695b();
    }
}
