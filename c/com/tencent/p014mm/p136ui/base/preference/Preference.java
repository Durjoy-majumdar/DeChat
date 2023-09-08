package com.tencent.p014mm.p136ui.base.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import kg3.C76577a;
import t40.C77853a;

/* renamed from: com.tencent.mm.ui.base.preference.Preference */
public class Preference implements Comparable<Preference> {

    /* renamed from: A */
    public ImageView f121265A;

    /* renamed from: B */
    public int f121266B;

    /* renamed from: C */
    public boolean f121267C;

    /* renamed from: D */
    public boolean f121268D;

    /* renamed from: E */
    public boolean f121269E;

    /* renamed from: F */
    public boolean f121270F;

    /* renamed from: G */
    public int f121271G;

    /* renamed from: H */
    public int f121272H;

    /* renamed from: I */
    public boolean f121273I;

    /* renamed from: d */
    public final Context f121274d;

    /* renamed from: e */
    public C6763a f121275e;

    /* renamed from: f */
    public C44715b f121276f;

    /* renamed from: g */
    public C44716c f121277g;

    /* renamed from: h */
    public int f121278h;

    /* renamed from: i */
    public CharSequence f121279i;

    /* renamed from: j */
    public int f121280j;

    /* renamed from: n */
    public CharSequence f121281n;

    /* renamed from: o */
    public int f121282o;

    /* renamed from: p */
    public int f121283p;

    /* renamed from: q */
    public Drawable f121284q;

    /* renamed from: r */
    public String f121285r;

    /* renamed from: s */
    public Bundle f121286s;

    /* renamed from: t */
    public boolean f121287t;

    /* renamed from: u */
    public boolean f121288u;

    /* renamed from: v */
    public boolean f121289v;

    /* renamed from: w */
    public boolean f121290w;

    /* renamed from: x */
    public String f121291x;

    /* renamed from: y */
    public boolean f121292y;

    /* renamed from: z */
    public int f121293z;

    /* renamed from: com.tencent.mm.ui.base.preference.Preference$a */
    public interface C6763a {
        /* renamed from: a */
        boolean mo7744a(Preference preference, Object obj);
    }

    /* renamed from: com.tencent.mm.ui.base.preference.Preference$BaseSavedState */
    public static class BaseSavedState extends AbsSavedState {
        public static final Parcelable.Creator<BaseSavedState> CREATOR = new C19708a();

        /* renamed from: com.tencent.mm.ui.base.preference.Preference$BaseSavedState$a */
        public class C19708a implements Parcelable.Creator<BaseSavedState> {
            public Object createFromParcel(Parcel parcel) {
                return new BaseSavedState(parcel);
            }

            public Object[] newArray(int i) {
                return new BaseSavedState[i];
            }
        }

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }
    }

    /* renamed from: com.tencent.mm.ui.base.preference.Preference$b */
    public interface C44715b {
        /* renamed from: a */
        boolean mo24588a(Preference preference);
    }

    /* renamed from: com.tencent.mm.ui.base.preference.Preference$c */
    public interface C44716c {
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this.f121278h = Integer.MAX_VALUE;
        this.f121283p = 0;
        this.f121287t = true;
        this.f121288u = true;
        this.f121290w = true;
        this.f121292y = true;
        this.f121293z = -1;
        this.f121265A = null;
        this.f121266B = 0;
        this.f121267C = false;
        this.f121268D = false;
        this.f121269E = false;
        this.f121270F = true;
        this.f121271G = C0966R.C0971layout.bcy;
        this.f121273I = false;
        this.f121274d = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77853a.f226877w, i, 0);
        for (int indexCount = obtainStyledAttributes.getIndexCount(); indexCount >= 0; indexCount--) {
            int index = obtainStyledAttributes.getIndex(indexCount);
            if (index == 4) {
                this.f121282o = obtainStyledAttributes.getResourceId(index, 0);
            } else if (index == 5) {
                this.f121283p = obtainStyledAttributes.getColor(index, 0);
            } else if (index == 6) {
                this.f121285r = obtainStyledAttributes.getString(index);
            } else if (index == 13) {
                this.f121280j = obtainStyledAttributes.getResourceId(index, 0);
                this.f121279i = obtainStyledAttributes.getString(index);
                int i2 = this.f121280j;
                if (i2 != 0) {
                    this.f121279i = context.getString(i2);
                }
            } else if (index == 12) {
                this.f121281n = obtainStyledAttributes.getString(index);
                int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                if (resourceId != 0) {
                    this.f121281n = context.getString(resourceId);
                }
            } else if (index == 8) {
                this.f121278h = obtainStyledAttributes.getInt(index, this.f121278h);
            } else if (index == 3) {
                obtainStyledAttributes.getString(index);
            } else if (index == 7) {
                this.f121271G = obtainStyledAttributes.getResourceId(index, this.f121271G);
            } else if (index == 14) {
                this.f121272H = obtainStyledAttributes.getResourceId(index, this.f121272H);
            } else if (index == 2) {
                this.f121287t = obtainStyledAttributes.getBoolean(index, true);
            } else if (index == 10) {
                this.f121288u = obtainStyledAttributes.getBoolean(index, true);
            } else if (index == 9) {
                this.f121290w = obtainStyledAttributes.getBoolean(index, this.f121290w);
            } else if (index == 1) {
                this.f121291x = obtainStyledAttributes.getString(index);
            } else if (index != 0 && index == 11) {
                this.f121270F = obtainStyledAttributes.getBoolean(index, this.f121270F);
            }
        }
        obtainStyledAttributes.recycle();
        getClass().getName().startsWith("android.preference");
    }

    /* renamed from: A */
    public void mo26273A(String str) {
        this.f121285r = str;
        if (this.f121289v && !(!TextUtils.isEmpty(str))) {
            if (this.f121285r != null) {
                this.f121289v = true;
                return;
            }
            throw new IllegalStateException("Preference does not have a key assigned.");
        }
    }

    /* renamed from: B */
    public void mo69920B(C6763a aVar) {
        this.f121275e = aVar;
    }

    /* renamed from: C */
    public void mo69921C(int i) {
        this.f121266B = i;
        ImageView imageView = this.f121265A;
        if (imageView != null) {
            imageView.setVisibility(i);
        }
    }

    /* renamed from: D */
    public void mo7740D(int i) {
        mo7741E(this.f121274d.getString(i));
    }

    /* renamed from: E */
    public void mo7741E(CharSequence charSequence) {
        if ((charSequence == null && this.f121281n != null) || (charSequence != null && !charSequence.equals(this.f121281n))) {
            this.f121281n = charSequence;
            mo69931v();
        }
    }

    /* renamed from: F */
    public void mo69922F(int i) {
        this.f121293z = i;
    }

    /* renamed from: G */
    public void mo69923G(int i) {
        mo69924H(this.f121274d.getString(i));
        this.f121280j = i;
    }

    /* renamed from: H */
    public void mo69924H(CharSequence charSequence) {
        if ((charSequence == null && this.f121279i != null) || (charSequence != null && !charSequence.equals(this.f121279i))) {
            this.f121280j = 0;
            this.f121279i = charSequence;
            mo69931v();
        }
    }

    /* renamed from: c */
    public Bundle mo69925c() {
        if (this.f121286s == null) {
            this.f121286s = new Bundle();
        }
        return this.f121286s;
    }

    public int compareTo(Object obj) {
        Preference preference = (Preference) obj;
        int i = this.f121278h;
        if (i != Integer.MAX_VALUE || (i == Integer.MAX_VALUE && preference.f121278h != Integer.MAX_VALUE)) {
            return i - preference.f121278h;
        }
        CharSequence charSequence = this.f121279i;
        if (charSequence == null) {
            return 1;
        }
        CharSequence charSequence2 = preference.f121279i;
        if (charSequence2 == null) {
            return -1;
        }
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int i2 = length < length2 ? length : length2;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i3 + 1;
            int i6 = i4 + 1;
            int lowerCase = Character.toLowerCase(charSequence.charAt(i3)) - Character.toLowerCase(charSequence2.charAt(i4));
            if (lowerCase != 0) {
                return lowerCase;
            }
            i3 = i5;
            i4 = i6;
        }
        return length - length2;
    }

    /* renamed from: p */
    public String mo69927p() {
        return this.f121285r;
    }

    /* renamed from: q */
    public int mo7748q() {
        return this.f121271G;
    }

    /* renamed from: r */
    public CharSequence mo5913r() {
        return this.f121281n;
    }

    /* renamed from: s */
    public CharSequence mo69928s() {
        return this.f121279i;
    }

    /* renamed from: t */
    public View mo2020t(View view, ViewGroup viewGroup) {
        if (view == null) {
            view = mo1087x(viewGroup);
        }
        mo1086w(view);
        return view;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence s = mo69928s();
        if (!TextUtils.isEmpty(s)) {
            sb.append(s);
            sb.append(' ');
        }
        CharSequence r = mo5913r();
        if (!TextUtils.isEmpty(r)) {
            sb.append(r);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    /* renamed from: u */
    public boolean mo69930u() {
        return this.f121287t && this.f121292y;
    }

    /* renamed from: v */
    public void mo69931v() {
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        View findViewById = view.findViewById(C0966R.C0970id.br8);
        int i = 0;
        if (findViewById != null) {
            findViewById.setMinimumHeight((int) (((float) this.f121274d.getResources().getDimensionPixelSize(C0966R.dimen.f3904ie)) * C76577a.m92175z(this.f121274d)));
            if (this.f121273I) {
                findViewById.setPadding(0, findViewById.getPaddingTop(), findViewById.getPaddingRight(), findViewById.getPaddingBottom());
            }
        }
        TextView textView = (TextView) view.findViewById(16908310);
        if (textView != null) {
            CharSequence s = mo69928s();
            if (s == null || !(s instanceof Spannable)) {
                textView.setMovementMethod((MovementMethod) null);
            } else {
                if (this.f121268D) {
                    textView.setClickable(true);
                }
                if (textView.isClickable()) {
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
            textView.setText(s);
        }
        TextView textView2 = (TextView) view.findViewById(16908304);
        if (textView2 != null) {
            if (!TextUtils.isEmpty(mo5913r())) {
                if (textView2.getVisibility() != 0) {
                    textView2.setVisibility(0);
                }
                if (this.f121267C) {
                    textView2.setMovementMethod(LinkMovementMethod.getInstance());
                    textView2.setClickable(true);
                    textView2.setText(mo5913r(), TextView.BufferType.SPANNABLE);
                } else {
                    textView2.setText(mo5913r());
                }
                int i2 = this.f121293z;
                if (i2 != -1) {
                    textView2.setTextColor(i2);
                }
                if (this.f121269E) {
                    textView2.setSingleLine();
                }
            } else if (textView2.getVisibility() != 8) {
                textView2.setVisibility(8);
            }
        }
        ImageView imageView = (ImageView) view.findViewById(16908294);
        if (imageView != null) {
            if (!(this.f121282o == 0 && this.f121284q == null)) {
                if (this.f121284q == null) {
                    this.f121284q = this.f121274d.getResources().getDrawable(this.f121282o);
                }
                Drawable drawable = this.f121284q;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    if (this.f121283p != 0) {
                        imageView.getDrawable().setColorFilter(this.f121283p, PorterDuff.Mode.SRC_ATOP);
                    }
                }
            }
            if (this.f121284q == null) {
                i = 8;
            }
            imageView.setVisibility(i);
        }
        ImageView imageView2 = (ImageView) view.findViewById(C0966R.C0970id.isy);
        this.f121265A = imageView2;
        if (imageView2 != null) {
            imageView2.setVisibility(this.f121266B);
        }
        if (this.f121270F) {
            mo69933z(view, mo69930u());
        }
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        LayoutInflater b = C85868k2.m106137b(this.f121274d);
        View inflate = b.inflate(this.f121271G, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(16908312);
        if (viewGroup2 != null) {
            int i = this.f121272H;
            if (i != 0) {
                b.inflate(i, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return inflate;
    }

    /* renamed from: y */
    public void mo69932y(boolean z) {
        if (this.f121287t != z) {
            this.f121287t = z;
            mo69931v();
        }
    }

    /* renamed from: z */
    public final void mo69933z(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                mo69933z(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842894);
    }

    public Preference(Context context) {
        this(context, (AttributeSet) null);
    }
}
