package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.C103458j;
import androidx.appcompat.widget.C103533f0;
import com.tencent.p014mm.C0966R;
import java.util.WeakHashMap;
import p433g.C107593a;
import p849e3.C107168a0;
import p849e3.C107207u;

public class ListMenuItemView extends LinearLayout implements C103458j.C103459a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: d */
    public C103452g f305154d;

    /* renamed from: e */
    public ImageView f305155e;

    /* renamed from: f */
    public RadioButton f305156f;

    /* renamed from: g */
    public TextView f305157g;

    /* renamed from: h */
    public CheckBox f305158h;

    /* renamed from: i */
    public TextView f305159i;

    /* renamed from: j */
    public ImageView f305160j;

    /* renamed from: n */
    public ImageView f305161n;

    /* renamed from: o */
    public LinearLayout f305162o;

    /* renamed from: p */
    public Drawable f305163p;

    /* renamed from: q */
    public int f305164q;

    /* renamed from: r */
    public Context f305165r;

    /* renamed from: s */
    public boolean f305166s;

    /* renamed from: t */
    public Drawable f305167t;

    /* renamed from: u */
    public boolean f305168u;

    /* renamed from: v */
    public LayoutInflater f305169v;

    /* renamed from: w */
    public boolean f305170w;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0966R.attr.f2861ty);
    }

    private LayoutInflater getInflater() {
        if (this.f305169v == null) {
            this.f305169v = LayoutInflater.from(getContext());
        }
        return this.f305169v;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f305160j;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f305161n;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f305161n.getLayoutParams();
            rect.top += this.f305161n.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        if (r11 == false) goto L_0x005f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012b  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo143501d(androidx.appcompat.view.menu.C103452g r10, int r11) {
        /*
            r9 = this;
            r9.f305154d = r10
            boolean r11 = r10.isVisible()
            r0 = 8
            r1 = 0
            if (r11 == 0) goto L_0x000d
            r11 = 0
            goto L_0x000f
        L_0x000d:
            r11 = 8
        L_0x000f:
            r9.setVisibility(r11)
            java.lang.CharSequence r11 = r10.f305271h
            r9.setTitle(r11)
            boolean r11 = r10.isCheckable()
            r9.setCheckable(r11)
            androidx.appcompat.view.menu.e r11 = r10.f305280t
            boolean r11 = r11.mo143610o()
            r2 = 1
            if (r11 == 0) goto L_0x0038
            androidx.appcompat.view.menu.e r11 = r10.f305280t
            boolean r11 = r11.mo143609n()
            if (r11 == 0) goto L_0x0032
            char r11 = r10.f305276p
            goto L_0x0034
        L_0x0032:
            char r11 = r10.f305274n
        L_0x0034:
            if (r11 == 0) goto L_0x0038
            r11 = 1
            goto L_0x0039
        L_0x0038:
            r11 = 0
        L_0x0039:
            androidx.appcompat.view.menu.e r3 = r10.f305280t
            r3.mo143609n()
            if (r11 == 0) goto L_0x005f
            androidx.appcompat.view.menu.g r11 = r9.f305154d
            androidx.appcompat.view.menu.e r3 = r11.f305280t
            boolean r3 = r3.mo143610o()
            if (r3 == 0) goto L_0x005b
            androidx.appcompat.view.menu.e r3 = r11.f305280t
            boolean r3 = r3.mo143609n()
            if (r3 == 0) goto L_0x0055
            char r11 = r11.f305276p
            goto L_0x0057
        L_0x0055:
            char r11 = r11.f305274n
        L_0x0057:
            if (r11 == 0) goto L_0x005b
            r11 = 1
            goto L_0x005c
        L_0x005b:
            r11 = 0
        L_0x005c:
            if (r11 == 0) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            r1 = 8
        L_0x0061:
            if (r1 != 0) goto L_0x0123
            android.widget.TextView r11 = r9.f305159i
            androidx.appcompat.view.menu.g r3 = r9.f305154d
            androidx.appcompat.view.menu.e r4 = r3.f305280t
            boolean r4 = r4.mo143609n()
            if (r4 == 0) goto L_0x0072
            char r4 = r3.f305276p
            goto L_0x0074
        L_0x0072:
            char r4 = r3.f305274n
        L_0x0074:
            if (r4 != 0) goto L_0x007a
            java.lang.String r0 = ""
            goto L_0x0120
        L_0x007a:
            androidx.appcompat.view.menu.e r5 = r3.f305280t
            android.content.Context r5 = r5.f305235d
            android.content.res.Resources r5 = r5.getResources()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            androidx.appcompat.view.menu.e r7 = r3.f305280t
            android.content.Context r7 = r7.f305235d
            android.view.ViewConfiguration r7 = android.view.ViewConfiguration.get(r7)
            boolean r7 = r7.hasPermanentMenuKey()
            if (r7 == 0) goto L_0x009f
            r7 = 2131820660(0x7f110074, float:1.9274041E38)
            java.lang.String r7 = r5.getString(r7)
            r6.append(r7)
        L_0x009f:
            androidx.appcompat.view.menu.e r7 = r3.f305280t
            boolean r7 = r7.mo143609n()
            if (r7 == 0) goto L_0x00aa
            int r3 = r3.f305277q
            goto L_0x00ac
        L_0x00aa:
            int r3 = r3.f305275o
        L_0x00ac:
            r7 = 65536(0x10000, float:9.18355E-41)
            r8 = 2131820656(0x7f110070, float:1.9274033E38)
            java.lang.String r8 = r5.getString(r8)
            androidx.appcompat.view.menu.C103452g.m137351c(r6, r3, r7, r8)
            r7 = 4096(0x1000, float:5.74E-42)
            r8 = 2131820652(0x7f11006c, float:1.9274025E38)
            java.lang.String r8 = r5.getString(r8)
            androidx.appcompat.view.menu.C103452g.m137351c(r6, r3, r7, r8)
            r7 = 2
            r8 = 2131820651(0x7f11006b, float:1.9274023E38)
            java.lang.String r8 = r5.getString(r8)
            androidx.appcompat.view.menu.C103452g.m137351c(r6, r3, r7, r8)
            r7 = 2131820657(0x7f110071, float:1.9274035E38)
            java.lang.String r7 = r5.getString(r7)
            androidx.appcompat.view.menu.C103452g.m137351c(r6, r3, r2, r7)
            r2 = 4
            r7 = 2131820659(0x7f110073, float:1.927404E38)
            java.lang.String r7 = r5.getString(r7)
            androidx.appcompat.view.menu.C103452g.m137351c(r6, r3, r2, r7)
            r2 = 2131820655(0x7f11006f, float:1.9274031E38)
            java.lang.String r2 = r5.getString(r2)
            androidx.appcompat.view.menu.C103452g.m137351c(r6, r3, r0, r2)
            if (r4 == r0) goto L_0x0112
            r0 = 10
            if (r4 == r0) goto L_0x0107
            r0 = 32
            if (r4 == r0) goto L_0x00fc
            r6.append(r4)
            goto L_0x011c
        L_0x00fc:
            r0 = 2131820658(0x7f110072, float:1.9274037E38)
            java.lang.String r0 = r5.getString(r0)
            r6.append(r0)
            goto L_0x011c
        L_0x0107:
            r0 = 2131820654(0x7f11006e, float:1.927403E38)
            java.lang.String r0 = r5.getString(r0)
            r6.append(r0)
            goto L_0x011c
        L_0x0112:
            r0 = 2131820653(0x7f11006d, float:1.9274027E38)
            java.lang.String r0 = r5.getString(r0)
            r6.append(r0)
        L_0x011c:
            java.lang.String r0 = r6.toString()
        L_0x0120:
            r11.setText(r0)
        L_0x0123:
            android.widget.TextView r11 = r9.f305159i
            int r11 = r11.getVisibility()
            if (r11 == r1) goto L_0x0130
            android.widget.TextView r11 = r9.f305159i
            r11.setVisibility(r1)
        L_0x0130:
            android.graphics.drawable.Drawable r11 = r10.getIcon()
            r9.setIcon(r11)
            boolean r11 = r10.isEnabled()
            r9.setEnabled(r11)
            boolean r11 = r10.hasSubMenu()
            r9.setSubMenuArrowVisible(r11)
            java.lang.CharSequence r10 = r10.f305283w
            r9.setContentDescription(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.mo143501d(androidx.appcompat.view.menu.g, int):void");
    }

    public C103452g getItemData() {
        return this.f305154d;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        Drawable drawable = this.f305163p;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        C107207u.C107208b.m145189q(this, drawable);
        TextView textView = (TextView) findViewById(C0966R.C0970id.knx);
        this.f305157g = textView;
        int i = this.f305164q;
        if (i != -1) {
            textView.setTextAppearance(this.f305165r, i);
        }
        this.f305159i = (TextView) findViewById(C0966R.C0970id.jjr);
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.k9u);
        this.f305160j = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f305167t);
        }
        this.f305161n = (ImageView) findViewById(C0966R.C0970id.erd);
        this.f305162o = (LinearLayout) findViewById(C0966R.C0970id.br8);
    }

    public void onMeasure(int i, int i2) {
        if (this.f305155e != null && this.f305166s) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f305155e.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        View view;
        CompoundButton compoundButton;
        if (z || this.f305156f != null || this.f305158h != null) {
            if ((this.f305154d.f305261D & 4) != 0) {
                if (this.f305156f == null) {
                    RadioButton radioButton = (RadioButton) getInflater().inflate(C0966R.C0971layout.f6286ao, this, false);
                    this.f305156f = radioButton;
                    LinearLayout linearLayout = this.f305162o;
                    if (linearLayout != null) {
                        linearLayout.addView(radioButton, -1);
                    } else {
                        addView(radioButton, -1);
                    }
                }
                compoundButton = this.f305156f;
                view = this.f305158h;
            } else {
                if (this.f305158h == null) {
                    CheckBox checkBox = (CheckBox) getInflater().inflate(C0966R.C0971layout.f6283al, this, false);
                    this.f305158h = checkBox;
                    LinearLayout linearLayout2 = this.f305162o;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(checkBox, -1);
                    } else {
                        addView(checkBox, -1);
                    }
                }
                compoundButton = this.f305158h;
                view = this.f305156f;
            }
            if (z) {
                compoundButton.setChecked(this.f305154d.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox2 = this.f305158h;
            if (checkBox2 != null) {
                checkBox2.setVisibility(8);
            }
            RadioButton radioButton2 = this.f305156f;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.f305154d.f305261D & 4) != 0) {
            if (this.f305156f == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(C0966R.C0971layout.f6286ao, this, false);
                this.f305156f = radioButton;
                LinearLayout linearLayout = this.f305162o;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f305156f;
        } else {
            if (this.f305158h == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(C0966R.C0971layout.f6283al, this, false);
                this.f305158h = checkBox;
                LinearLayout linearLayout2 = this.f305162o;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f305158h;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f305170w = z;
        this.f305166s = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f305161n;
        if (imageView != null) {
            imageView.setVisibility((this.f305168u || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f305154d.f305280t.getClass();
        boolean z = this.f305170w;
        if (z || this.f305166s) {
            ImageView imageView = this.f305155e;
            if (imageView != null || drawable != null || this.f305166s) {
                if (imageView == null) {
                    ImageView imageView2 = (ImageView) getInflater().inflate(C0966R.C0971layout.f6284am, this, false);
                    this.f305155e = imageView2;
                    LinearLayout linearLayout = this.f305162o;
                    if (linearLayout != null) {
                        linearLayout.addView(imageView2, 0);
                    } else {
                        addView(imageView2, 0);
                    }
                }
                if (drawable != null || this.f305166s) {
                    ImageView imageView3 = this.f305155e;
                    if (!z) {
                        drawable = null;
                    }
                    imageView3.setImageDrawable(drawable);
                    if (this.f305155e.getVisibility() != 0) {
                        this.f305155e.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f305155e.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f305157g.setText(charSequence);
            if (this.f305157g.getVisibility() != 0) {
                this.f305157g.setVisibility(0);
            }
        } else if (this.f305157g.getVisibility() != 8) {
            this.f305157g.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C103533f0 l = C103533f0.m137562l(getContext(), attributeSet, C107593a.f321922v, i, 0);
        this.f305163p = l.mo144336e(5);
        this.f305164q = l.mo144340i(1, -1);
        this.f305166s = l.mo144332a(7, false);
        this.f305165r = context;
        this.f305167t = l.mo144336e(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, C0966R.attr.f2789ke, 0);
        this.f305168u = obtainStyledAttributes.hasValue(0);
        l.mo144343m();
        obtainStyledAttributes.recycle();
    }
}
