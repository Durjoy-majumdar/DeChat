package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C45081s1;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import kg3.C76577a;
import xi3.C78844a;

/* renamed from: com.tencent.mm.ui.MMTabView */
public class MMTabView extends ViewGroup {

    /* renamed from: d */
    public TextView f121183d;

    /* renamed from: e */
    public ImageView f121184e;

    /* renamed from: f */
    public TextView f121185f;

    /* renamed from: g */
    public int f121186g;

    /* renamed from: h */
    public int f121187h = 0;

    /* renamed from: com.tencent.mm.ui.MMTabView$a */
    public class C44689a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f121188d;

        /* renamed from: e */
        public final /* synthetic */ int f121189e;

        public C44689a(String str, int i) {
            this.f121188d = str;
            this.f121189e = i;
        }

        public void run() {
            MMTabView.this.f121185f.setText(this.f121188d);
            MMTabView.this.f121185f.setBackgroundResource(this.f121189e);
            MMTabView.this.mo69873a();
        }
    }

    public MMTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo69874b();
    }

    /* renamed from: a */
    public void mo69873a() {
        Log.m105919d("MicroMsg.MMTabView", "jacks build : %d desc, unread: %s", Integer.valueOf(this.f121186g), getUnread());
        C78844a.C15689b.f42385a.mo108840e(this, getText(), getUnread(), this.f121186g);
    }

    /* renamed from: b */
    public final void mo69874b() {
        this.f121187h = getResources().getDimensionPixelSize(C0966R.dimen.f3963ll);
        String applicationLanguage = LocaleUtil.getApplicationLanguage();
        boolean isChineseAppLang = LocaleUtil.isChineseAppLang();
        boolean equalsIgnoreCase = applicationLanguage.equalsIgnoreCase("en");
        int p = isChineseAppLang ? (int) (C76577a.m92165p(getContext()) * ((float) C76577a.m92151b(getContext(), 2))) : 0;
        TextView textView = new TextView(getContext());
        this.f121183d = textView;
        textView.setSingleLine();
        this.f121183d.setEllipsize(TextUtils.TruncateAt.END);
        this.f121183d.setTextColor(getResources().getColorStateList(C0966R.color.akw));
        this.f121183d.setTextSize(0, (float) C76577a.m92157h(getContext(), C0966R.dimen.f3881hq));
        this.f121183d.setText("");
        if (isChineseAppLang) {
            TextView textView2 = this.f121183d;
            textView2.setTextSize(0, textView2.getTextSize() + ((float) p));
            this.f121183d.setTypeface((Typeface) null, 0);
        } else if (equalsIgnoreCase) {
            this.f121183d.setTypeface((Typeface) null, 1);
        }
        addView(this.f121183d);
        ImageView imageView = new ImageView(getContext());
        this.f121184e = imageView;
        imageView.setBackgroundResource(C0966R.C0969drawable.az5);
        this.f121184e.setVisibility(4);
        addView(this.f121184e);
        TextView textView3 = new TextView(getContext());
        this.f121185f = textView3;
        textView3.setTextColor(getResources().getColor(C0966R.color.al_));
        this.f121185f.setTextSize(1, 11.0f);
        this.f121185f.setBackgroundResource(C45081s1.m49932a(getContext()));
        this.f121185f.setTypeface(Typeface.DEFAULT_BOLD);
        this.f121185f.setGravity(17);
        this.f121185f.setVisibility(4);
        addView(this.f121185f);
        setBackgroundResource(C0966R.C0969drawable.bcs);
    }

    /* renamed from: c */
    public void mo69875c(String str, int i) {
        if (Util.isNullOrNil(str)) {
            this.f121185f.setVisibility(4);
            return;
        }
        this.f121185f.setVisibility(0);
        this.f121185f.post(new C44689a(str, i));
    }

    public String getText() {
        return this.f121183d.getText().toString();
    }

    public String getUnread() {
        return this.f121185f.getText().toString();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = (i5 - this.f121183d.getMeasuredWidth()) / 2;
        int measuredWidth2 = this.f121183d.getMeasuredWidth() + measuredWidth;
        int measuredHeight = (i6 - this.f121183d.getMeasuredHeight()) / 2;
        this.f121183d.layout(measuredWidth, measuredHeight, measuredWidth2, this.f121183d.getMeasuredHeight() + measuredHeight);
        int i7 = this.f121187h + measuredWidth2;
        int measuredHeight2 = (i6 - this.f121184e.getMeasuredHeight()) / 2;
        this.f121184e.layout(i7, measuredHeight2, this.f121184e.getMeasuredWidth() + i7, this.f121184e.getMeasuredHeight() + measuredHeight2);
        if (measuredWidth - this.f121187h < this.f121185f.getMeasuredWidth()) {
            int measuredWidth3 = i5 - this.f121185f.getMeasuredWidth();
            int measuredHeight3 = (i6 - this.f121185f.getMeasuredHeight()) / 2;
            this.f121185f.layout(measuredWidth3, measuredHeight3, this.f121185f.getMeasuredWidth() + measuredWidth3, this.f121185f.getMeasuredHeight() + measuredHeight3);
            return;
        }
        int i8 = measuredWidth2 + this.f121187h;
        int measuredHeight4 = (i6 - this.f121185f.getMeasuredHeight()) / 2;
        this.f121185f.layout(i8, measuredHeight4, this.f121185f.getMeasuredWidth() + i8, this.f121185f.getMeasuredHeight() + measuredHeight4);
    }

    public void onMeasure(int i, int i2) {
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom();
        int makeMeasureSpec = View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE ? View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f121183d.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec);
        this.f121184e.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec);
        this.f121185f.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec);
        setMeasuredDimension(size, size2);
    }

    public void setText(int i) {
        this.f121183d.setText(i);
    }

    public void setTextColor(int i) {
        this.f121183d.setTextColor(i);
    }

    public void setUnread(String str) {
        mo69875c(str, C45081s1.m49933b(getContext(), Integer.parseInt(str)));
    }

    public void setText(String str) {
        this.f121183d.setText(str);
    }

    public MMTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo69874b();
    }

    public MMTabView(Context context, int i) {
        super(context);
        mo69874b();
        this.f121186g = i;
        mo69873a();
    }
}
