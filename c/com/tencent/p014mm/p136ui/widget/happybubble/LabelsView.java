package com.tencent.p014mm.p136ui.widget.happybubble;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import t40.C77853a;

/* renamed from: com.tencent.mm.ui.widget.happybubble.LabelsView */
public class LabelsView extends ViewGroup implements View.OnClickListener {

    /* renamed from: A */
    public ArrayList<Object> f319594A = new ArrayList<>();

    /* renamed from: B */
    public ArrayList<Integer> f319595B = new ArrayList<>();

    /* renamed from: C */
    public ArrayList<Integer> f319596C = new ArrayList<>();

    /* renamed from: D */
    public C106817c f319597D;

    /* renamed from: d */
    public Context f319598d;

    /* renamed from: e */
    public ColorStateList f319599e;

    /* renamed from: f */
    public float f319600f;

    /* renamed from: g */
    public Drawable f319601g;

    /* renamed from: h */
    public int f319602h = -2;

    /* renamed from: i */
    public int f319603i = -2;

    /* renamed from: j */
    public int f319604j = 17;

    /* renamed from: n */
    public int f319605n;

    /* renamed from: o */
    public int f319606o;

    /* renamed from: p */
    public int f319607p;

    /* renamed from: q */
    public int f319608q;

    /* renamed from: r */
    public int f319609r;

    /* renamed from: s */
    public int f319610s;

    /* renamed from: t */
    public C106818f f319611t;

    /* renamed from: u */
    public int f319612u;

    /* renamed from: v */
    public int f319613v;

    /* renamed from: w */
    public int f319614w;

    /* renamed from: x */
    public boolean f319615x = false;

    /* renamed from: y */
    public int f319616y = 1;

    /* renamed from: z */
    public boolean f319617z;

    /* renamed from: com.tencent.mm.ui.widget.happybubble.LabelsView$d */
    public interface C45107d {
        /* renamed from: a */
        void mo70492a(TextView textView, Object obj, boolean z, int i);
    }

    /* renamed from: com.tencent.mm.ui.widget.happybubble.LabelsView$e */
    public interface C45108e {
        /* renamed from: a */
        boolean mo70493a(TextView textView, Object obj, boolean z, boolean z2, int i);
    }

    /* renamed from: com.tencent.mm.ui.widget.happybubble.LabelsView$a */
    public class C106815a implements C106816b<String> {
        public C106815a(LabelsView labelsView) {
        }

        /* renamed from: a */
        public CharSequence mo22831a(TextView textView, int i, Object obj) {
            return ((String) obj).trim();
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.happybubble.LabelsView$b */
    public interface C106816b<T> {
        /* renamed from: a */
        CharSequence mo22831a(TextView textView, int i, T t);
    }

    /* renamed from: com.tencent.mm.ui.widget.happybubble.LabelsView$c */
    public interface C106817c {
        /* renamed from: a */
        void mo22844a(TextView textView, Object obj, int i);
    }

    /* renamed from: com.tencent.mm.ui.widget.happybubble.LabelsView$f */
    public enum C106818f {
        NONE(1),
        SINGLE(2),
        SINGLE_IRREVOCABLY(3),
        MULTI(4);
        

        /* renamed from: d */
        public int f319623d;

        /* access modifiers changed from: public */
        C106818f(int i) {
            this.f319623d = i;
        }
    }

    public LabelsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f319598d = context;
        mo154514d(context, attributeSet);
        mo154538j();
    }

    /* renamed from: a */
    public void mo154511a() {
        C106818f fVar = this.f319611t;
        if (fVar == C106818f.SINGLE_IRREVOCABLY) {
            return;
        }
        if (fVar != C106818f.MULTI || this.f319596C.isEmpty()) {
            mo154515e();
            return;
        }
        int childCount = getChildCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < childCount; i++) {
            if (!this.f319596C.contains(Integer.valueOf(i))) {
                mo154536h((TextView) getChildAt(i), false);
                arrayList.add(Integer.valueOf(i));
            }
        }
        this.f319595B.removeAll(arrayList);
    }

    /* renamed from: b */
    public final int mo154512b(float f) {
        return (int) TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
    }

    /* renamed from: c */
    public final void mo154513c() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((TextView) getChildAt(i)).setClickable((this.f319597D == null && this.f319611t == C106818f.NONE) ? false : true);
        }
    }

    /* renamed from: d */
    public final void mo154514d(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77853a.f226853H);
            int i = obtainStyledAttributes.getInt(16, 1);
            C106818f fVar = C106818f.NONE;
            if (i != 1) {
                if (i == 2) {
                    fVar = C106818f.SINGLE;
                } else if (i == 3) {
                    fVar = C106818f.SINGLE_IRREVOCABLY;
                } else if (i == 4) {
                    fVar = C106818f.MULTI;
                }
            }
            this.f319611t = fVar;
            this.f319612u = obtainStyledAttributes.getInteger(14, 0);
            this.f319613v = obtainStyledAttributes.getInteger(15, 0);
            this.f319614w = obtainStyledAttributes.getInteger(13, 0);
            this.f319617z = obtainStyledAttributes.getBoolean(0, false);
            this.f319604j = obtainStyledAttributes.getInt(2, this.f319604j);
            this.f319602h = obtainStyledAttributes.getLayoutDimension(11, this.f319602h);
            this.f319603i = obtainStyledAttributes.getLayoutDimension(4, this.f319603i);
            if (obtainStyledAttributes.hasValue(3)) {
                this.f319599e = obtainStyledAttributes.getColorStateList(3);
            } else {
                this.f319599e = ColorStateList.valueOf(-16777216);
            }
            this.f319600f = obtainStyledAttributes.getDimension(10, (float) ((int) TypedValue.applyDimension(2, 14.0f, getResources().getDisplayMetrics())));
            if (obtainStyledAttributes.hasValue(5)) {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
                this.f319608q = dimensionPixelOffset;
                this.f319607p = dimensionPixelOffset;
                this.f319606o = dimensionPixelOffset;
                this.f319605n = dimensionPixelOffset;
            } else {
                this.f319605n = obtainStyledAttributes.getDimensionPixelOffset(7, mo154512b(10.0f));
                this.f319606o = obtainStyledAttributes.getDimensionPixelOffset(9, mo154512b(5.0f));
                this.f319607p = obtainStyledAttributes.getDimensionPixelOffset(8, mo154512b(10.0f));
                this.f319608q = obtainStyledAttributes.getDimensionPixelOffset(6, mo154512b(5.0f));
            }
            this.f319610s = obtainStyledAttributes.getDimensionPixelOffset(12, mo154512b(5.0f));
            this.f319609r = obtainStyledAttributes.getDimensionPixelOffset(18, mo154512b(5.0f));
            if (obtainStyledAttributes.hasValue(1)) {
                int resourceId = obtainStyledAttributes.getResourceId(1, 0);
                if (resourceId != 0) {
                    this.f319601g = getResources().getDrawable(resourceId);
                } else {
                    this.f319601g = new ColorDrawable(obtainStyledAttributes.getColor(1, 0));
                }
            } else {
                this.f319601g = getResources().getDrawable(C0966R.C0969drawable.f4885q8);
            }
            this.f319615x = obtainStyledAttributes.getBoolean(17, false);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: e */
    public final void mo154515e() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            mo154536h((TextView) getChildAt(i), false);
        }
        this.f319595B.clear();
    }

    /* renamed from: f */
    public final int mo154516f(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            i2 = size;
        } else if (mode == Integer.MIN_VALUE) {
            i2 = Math.min(i2, size);
        }
        return View.resolveSizeAndState(Math.max(i2, getSuggestedMinimumWidth()), i, 0);
    }

    /* renamed from: g */
    public final boolean mo154517g(TextView textView) {
        return false;
    }

    public List<Integer> getCompulsorys() {
        return this.f319596C;
    }

    public int getLabelGravity() {
        return this.f319604j;
    }

    public ColorStateList getLabelTextColor() {
        return this.f319599e;
    }

    public float getLabelTextSize() {
        return this.f319600f;
    }

    public <T> List<T> getLabels() {
        return this.f319594A;
    }

    public int getLineCount() {
        return this.f319616y;
    }

    public int getLineMargin() {
        return this.f319610s;
    }

    public int getMaxLines() {
        return this.f319614w;
    }

    public int getMaxSelect() {
        return this.f319612u;
    }

    public int getMinSelect() {
        return this.f319613v;
    }

    public <T> List<T> getSelectLabelDatas() {
        ArrayList arrayList = new ArrayList();
        int size = this.f319595B.size();
        for (int i = 0; i < size; i++) {
            Object tag = getChildAt(this.f319595B.get(i).intValue()).getTag(C0966R.C0970id.f359346ke3);
            if (tag != null) {
                arrayList.add(tag);
            }
        }
        return arrayList;
    }

    public List<Integer> getSelectLabels() {
        return this.f319595B;
    }

    public C106818f getSelectType() {
        return this.f319611t;
    }

    public int getTextPaddingBottom() {
        return this.f319608q;
    }

    public int getTextPaddingLeft() {
        return this.f319605n;
    }

    public int getTextPaddingRight() {
        return this.f319607p;
    }

    public int getTextPaddingTop() {
        return this.f319606o;
    }

    public int getWordMargin() {
        return this.f319609r;
    }

    /* renamed from: h */
    public final void mo154536h(TextView textView, boolean z) {
        if (textView.isSelected() != z) {
            textView.setSelected(z);
            if (z) {
                this.f319595B.add((Integer) textView.getTag(C0966R.C0970id.ke6));
            } else {
                this.f319595B.remove((Integer) textView.getTag(C0966R.C0970id.ke6));
            }
        }
    }

    /* renamed from: i */
    public <T> void mo154537i(List<T> list, C106816b<T> bVar) {
        mo154515e();
        removeAllViews();
        this.f319594A.clear();
        if (list != null) {
            this.f319594A.addAll(list);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                T t = list.get(i);
                TextView textView = new TextView(this.f319598d);
                textView.setPadding(this.f319605n, this.f319606o, this.f319607p, this.f319608q);
                textView.setTextSize(0, this.f319600f);
                textView.setGravity(this.f319604j);
                textView.setTextColor(this.f319599e);
                textView.setBackgroundDrawable(this.f319601g.getConstantState().newDrawable());
                textView.setTag(C0966R.C0970id.f359346ke3, t);
                textView.setTag(C0966R.C0970id.ke6, Integer.valueOf(i));
                textView.setOnClickListener(this);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                addView(textView, this.f319602h, this.f319603i);
                textView.setText(bVar.mo22831a(textView, i, t));
            }
            mo154513c();
        }
        if (this.f319611t == C106818f.SINGLE_IRREVOCABLY) {
            setSelects(0);
        }
    }

    /* renamed from: j */
    public final void mo154538j() {
        if (isInEditMode()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("Label 1");
            arrayList.add("Label 2");
            arrayList.add("Label 3");
            arrayList.add("Label 4");
            arrayList.add("Label 5");
            arrayList.add("Label 6");
            arrayList.add("Label 7");
            setLabels(arrayList);
        }
    }

    public void onClick(View view) {
        int i;
        C106818f fVar = C106818f.SINGLE_IRREVOCABLY;
        C106818f fVar2 = C106818f.MULTI;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/happybubble/LabelsView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (!this.f319617z && this.f319611t != C106818f.NONE) {
                boolean z = true;
                if (textView.isSelected()) {
                    if (!((this.f319611t == fVar2 && this.f319596C.contains((Integer) textView.getTag(C0966R.C0970id.ke6))) || (this.f319611t == fVar2 && this.f319595B.size() <= this.f319613v)) && this.f319611t != fVar) {
                        z = false;
                    }
                    if (!z && !mo154517g(textView)) {
                        mo154536h(textView, false);
                    }
                } else {
                    C106818f fVar3 = this.f319611t;
                    if (fVar3 == C106818f.SINGLE || fVar3 == fVar) {
                        if (!mo154517g(textView)) {
                            mo154515e();
                            mo154536h(textView, true);
                        }
                    } else if (fVar3 == fVar2 && (((i = this.f319612u) <= 0 || i > this.f319595B.size()) && !mo154517g(textView))) {
                        mo154536h(textView, true);
                    }
                }
            }
            C106817c cVar = this.f319597D;
            if (cVar != null) {
                cVar.mo22844a(textView, textView.getTag(C0966R.C0970id.f359346ke3), ((Integer) textView.getTag(C0966R.C0970id.ke6)).intValue());
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/widget/happybubble/LabelsView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i5 = i3 - i;
        int childCount = getChildCount();
        int i6 = 1;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (!this.f319615x && i5 < childAt.getMeasuredWidth() + paddingLeft + getPaddingRight()) {
                i6++;
                int i9 = this.f319614w;
                if (i9 <= 0 || i6 <= i9) {
                    paddingLeft = getPaddingLeft();
                    paddingTop = paddingTop + this.f319610s + i7;
                    i7 = 0;
                } else {
                    return;
                }
            }
            childAt.layout(paddingLeft, paddingTop, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + paddingTop);
            paddingLeft = paddingLeft + childAt.getMeasuredWidth() + this.f319609r;
            i7 = Math.max(i7, childAt.getMeasuredHeight());
        }
    }

    public void onMeasure(int i, int i2) {
        if (this.f319615x) {
            int childCount = getChildCount();
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                measureChild(childAt, i, i2);
                i3 += childAt.getMeasuredWidth();
                if (i5 != childCount - 1) {
                    i3 += this.f319609r;
                }
                i4 = Math.max(i4, childAt.getMeasuredHeight());
            }
            setMeasuredDimension(mo154516f(i, i3 + getPaddingLeft() + getPaddingRight()), mo154516f(i2, i4 + getPaddingTop() + getPaddingBottom()));
            return;
        }
        int childCount2 = getChildCount();
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount2; i16++) {
            View childAt2 = getChildAt(i16);
            measureChild(childAt2, i, i2);
            if (childAt2.getMeasuredWidth() + i7 > size) {
                i6++;
                int i17 = this.f319614w;
                if (i17 > 0 && i6 > i17) {
                    break;
                }
                i9 = i9 + this.f319610s + i8;
                i15 = Math.max(i15, i7);
                i7 = 0;
                i8 = 0;
            }
            i7 += childAt2.getMeasuredWidth();
            i8 = Math.max(i8, childAt2.getMeasuredHeight());
            if (i16 != childCount2 - 1) {
                int i18 = this.f319609r + i7;
                if (i18 > size) {
                    i6++;
                    int i19 = this.f319614w;
                    if (i19 > 0 && i6 > i19) {
                        break;
                    }
                    i9 = i9 + this.f319610s + i8;
                    i15 = Math.max(i15, i7);
                    i7 = 0;
                    i8 = 0;
                } else {
                    i7 = i18;
                }
            }
        }
        this.f319616y = i6;
        setMeasuredDimension(mo154516f(i, Math.max(i15, i7) + getPaddingLeft() + getPaddingRight()), mo154516f(i2, i9 + i8 + getPaddingTop() + getPaddingBottom()));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("key_super_state"));
            ColorStateList colorStateList = (ColorStateList) bundle.getParcelable("key_text_color_state");
            if (colorStateList != null) {
                setLabelTextColor(colorStateList);
            }
            setLabelTextSize(bundle.getFloat("key_text_size_state", this.f319600f));
            this.f319602h = bundle.getInt("key_label_width_state", this.f319602h);
            this.f319603i = bundle.getInt("key_label_height_state", this.f319603i);
            setLabelGravity(bundle.getInt("key_label_gravity_state", this.f319604j));
            int[] intArray = bundle.getIntArray("key_padding_state");
            if (intArray != null && intArray.length == 4) {
                int i = intArray[0];
                int i2 = intArray[1];
                int i3 = intArray[2];
                int i4 = intArray[3];
                if (!(this.f319605n == i && this.f319606o == i2 && this.f319607p == i3 && this.f319608q == i4)) {
                    this.f319605n = i;
                    this.f319606o = i2;
                    this.f319607p = i3;
                    this.f319608q = i4;
                    int childCount = getChildCount();
                    for (int i5 = 0; i5 < childCount; i5++) {
                        ((TextView) getChildAt(i5)).setPadding(i, i2, i3, i4);
                    }
                }
            }
            setWordMargin(bundle.getInt("key_word_margin_state", this.f319609r));
            setLineMargin(bundle.getInt("key_line_margin_state", this.f319610s));
            int i6 = bundle.getInt("key_select_type_state", this.f319611t.f319623d);
            C106818f fVar = C106818f.NONE;
            if (i6 != 1) {
                if (i6 == 2) {
                    fVar = C106818f.SINGLE;
                } else if (i6 == 3) {
                    fVar = C106818f.SINGLE_IRREVOCABLY;
                } else if (i6 == 4) {
                    fVar = C106818f.MULTI;
                }
            }
            setSelectType(fVar);
            setMaxSelect(bundle.getInt("key_max_select_state", this.f319612u));
            setMinSelect(bundle.getInt("key_min_select_state", this.f319613v));
            setMaxLines(bundle.getInt("key_max_lines_state", this.f319614w));
            setIndicator(bundle.getBoolean("key_indicator_state", this.f319617z));
            setSingleLine(bundle.getBoolean("key_single_line_state", this.f319615x));
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("key_select_compulsory_state");
            if (integerArrayList != null && !integerArrayList.isEmpty()) {
                setCompulsorys((List<Integer>) integerArrayList);
            }
            ArrayList<Integer> integerArrayList2 = bundle.getIntegerArrayList("key_select_labels_state");
            if (integerArrayList2 != null && !integerArrayList2.isEmpty()) {
                int size = integerArrayList2.size();
                int[] iArr = new int[size];
                for (int i7 = 0; i7 < size; i7++) {
                    iArr[i7] = integerArrayList2.get(i7).intValue();
                }
                setSelects(iArr);
                return;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("key_super_state", super.onSaveInstanceState());
        ColorStateList colorStateList = this.f319599e;
        if (colorStateList != null) {
            bundle.putParcelable("key_text_color_state", colorStateList);
        }
        bundle.putFloat("key_text_size_state", this.f319600f);
        bundle.putInt("key_label_width_state", this.f319602h);
        bundle.putInt("key_label_height_state", this.f319603i);
        bundle.putInt("key_label_gravity_state", this.f319604j);
        bundle.putIntArray("key_padding_state", new int[]{this.f319605n, this.f319606o, this.f319607p, this.f319608q});
        bundle.putInt("key_word_margin_state", this.f319609r);
        bundle.putInt("key_line_margin_state", this.f319610s);
        bundle.putInt("key_select_type_state", this.f319611t.f319623d);
        bundle.putInt("key_max_select_state", this.f319612u);
        bundle.putInt("key_min_select_state", this.f319613v);
        bundle.putInt("key_max_lines_state", this.f319614w);
        bundle.putBoolean("key_indicator_state", this.f319617z);
        if (!this.f319595B.isEmpty()) {
            bundle.putIntegerArrayList("key_select_labels_state", this.f319595B);
        }
        if (!this.f319596C.isEmpty()) {
            bundle.putIntegerArrayList("key_select_compulsory_state", this.f319596C);
        }
        bundle.putBoolean("key_single_line_state", this.f319615x);
        return bundle;
    }

    public void setCompulsorys(List<Integer> list) {
        if (this.f319611t == C106818f.MULTI && list != null) {
            this.f319596C.clear();
            this.f319596C.addAll(list);
            mo154515e();
            setSelects(list);
        }
    }

    public void setIndicator(boolean z) {
        this.f319617z = z;
    }

    public void setLabelBackgroundColor(int i) {
        setLabelBackgroundDrawable(new ColorDrawable(i));
    }

    public void setLabelBackgroundDrawable(Drawable drawable) {
        this.f319601g = drawable;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((TextView) getChildAt(i)).setBackgroundDrawable(this.f319601g.getConstantState().newDrawable());
        }
    }

    public void setLabelBackgroundResource(int i) {
        setLabelBackgroundDrawable(getResources().getDrawable(i));
    }

    public void setLabelGravity(int i) {
        if (this.f319604j != i) {
            this.f319604j = i;
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                ((TextView) getChildAt(i2)).setGravity(i);
            }
        }
    }

    public void setLabelTextColor(int i) {
        setLabelTextColor(ColorStateList.valueOf(i));
    }

    public void setLabelTextSize(float f) {
        if (this.f319600f != f) {
            this.f319600f = f;
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ((TextView) getChildAt(i)).setTextSize(0, f);
            }
        }
    }

    public void setLabels(List<String> list) {
        mo154537i(list, new C106815a(this));
    }

    public void setLineMargin(int i) {
        if (this.f319610s != i) {
            this.f319610s = i;
            requestLayout();
        }
    }

    public void setMaxLines(int i) {
        if (this.f319614w != i) {
            this.f319614w = i;
            requestLayout();
        }
    }

    public void setMaxSelect(int i) {
        if (this.f319612u != i) {
            this.f319612u = i;
            if (this.f319611t == C106818f.MULTI) {
                mo154515e();
            }
        }
    }

    public void setMinSelect(int i) {
        this.f319613v = i;
    }

    public void setOnLabelClickListener(C106817c cVar) {
        this.f319597D = cVar;
        mo154513c();
    }

    public void setOnLabelSelectChangeListener(C45107d dVar) {
    }

    public void setOnSelectChangeIntercept(C45108e eVar) {
    }

    public void setSelectType(C106818f fVar) {
        if (this.f319611t != fVar) {
            this.f319611t = fVar;
            mo154515e();
            if (this.f319611t == C106818f.SINGLE_IRREVOCABLY) {
                setSelects(0);
            }
            if (this.f319611t != C106818f.MULTI) {
                this.f319596C.clear();
            }
            mo154513c();
        }
    }

    public void setSelects(List<Integer> list) {
        if (list != null) {
            int size = list.size();
            int[] iArr = new int[size];
            for (int i = 0; i < size; i++) {
                iArr[i] = list.get(i).intValue();
            }
            setSelects(iArr);
        }
    }

    public void setSingleLine(boolean z) {
        if (this.f319615x != z) {
            this.f319615x = z;
            requestLayout();
        }
    }

    public void setWordMargin(int i) {
        if (this.f319609r != i) {
            this.f319609r = i;
            requestLayout();
        }
    }

    public void setLabelTextColor(ColorStateList colorStateList) {
        this.f319599e = colorStateList;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((TextView) getChildAt(i)).setTextColor(this.f319599e);
        }
    }

    public void setSelects(int... iArr) {
        if (this.f319611t != C106818f.NONE) {
            ArrayList arrayList = new ArrayList();
            int childCount = getChildCount();
            C106818f fVar = this.f319611t;
            int i = (fVar == C106818f.SINGLE || fVar == C106818f.SINGLE_IRREVOCABLY) ? 1 : this.f319612u;
            for (int i2 : iArr) {
                if (i2 < childCount) {
                    TextView textView = (TextView) getChildAt(i2);
                    if (!arrayList.contains(textView)) {
                        mo154536h(textView, true);
                        arrayList.add(textView);
                    }
                    if (i > 0 && arrayList.size() == i) {
                        break;
                    }
                }
            }
            for (int i3 = 0; i3 < childCount; i3++) {
                TextView textView2 = (TextView) getChildAt(i3);
                if (!arrayList.contains(textView2)) {
                    mo154536h(textView2, false);
                }
            }
        }
    }

    public void setCompulsorys(int... iArr) {
        if (this.f319611t == C106818f.MULTI && iArr != null) {
            ArrayList arrayList = new ArrayList(iArr.length);
            for (int valueOf : iArr) {
                arrayList.add(Integer.valueOf(valueOf));
            }
            setCompulsorys((List<Integer>) arrayList);
        }
    }

    public LabelsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f319598d = context;
        mo154514d(context, attributeSet);
        mo154538j();
    }
}
