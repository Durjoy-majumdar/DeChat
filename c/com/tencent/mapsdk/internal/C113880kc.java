package com.tencent.mapsdk.internal;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/* renamed from: com.tencent.mapsdk.internal.kc */
public final class C113880kc {

    /* renamed from: com.tencent.mapsdk.internal.kc$a */
    public static class C113881a {

        /* renamed from: a */
        public Toast f340689a;

        /* renamed from: b */
        private int f340690b;

        /* renamed from: c */
        private int f340691c;

        /* renamed from: d */
        private int f340692d;

        /* renamed from: e */
        private String f340693e;

        /* renamed from: f */
        private String f340694f;

        /* renamed from: g */
        private TextView f340695g;

        /* renamed from: h */
        private TextView f340696h;

        /* renamed from: i */
        private TextView f340697i;

        /* renamed from: j */
        private Context f340698j;

        public C113881a(Context context) {
            this.f340698j = context;
        }

        /* renamed from: b */
        private C113881a m157451b(String str) {
            return mo172289a(str, 8388611);
        }

        /* renamed from: c */
        private void m157452c() {
            Toast toast = this.f340689a;
            if (toast != null) {
                toast.cancel();
            }
        }

        /* renamed from: b */
        public final boolean mo172291b() {
            Toast toast = this.f340689a;
            if (toast == null) {
                return false;
            }
            toast.show();
            return true;
        }

        /* renamed from: a */
        public final C113881a mo172288a(Context context, View view, int i) {
            Toast toast = new Toast(context);
            this.f340689a = toast;
            toast.setView(view);
            this.f340689a.setDuration(i);
            this.f340690b = this.f340689a.getGravity();
            return this;
        }

        /* renamed from: a */
        public final ViewGroup mo172286a(Context context, String str, String str2) {
            this.f340693e = str;
            this.f340694f = str2;
            LinearLayout linearLayout = new LinearLayout(context);
            int a = C40003jy.m42819a(context, 5);
            int a2 = C40003jy.m42819a(context, 10);
            linearLayout.setPadding(a2, a, a2, a);
            linearLayout.setBackgroundColor(-12303292);
            linearLayout.setOrientation(1);
            if (!TextUtils.isEmpty(str)) {
                this.f340696h = new TextView(context);
                int a3 = C40003jy.m42819a(context, 5);
                this.f340696h.setPadding(a3, a3, a3, a3);
                this.f340696h.setText(str);
                this.f340696h.setTextColor(-1);
                this.f340696h.setTextSize(2, 18.0f);
                linearLayout.addView(this.f340696h, new ViewGroup.MarginLayoutParams(-1, -2));
            }
            if (!TextUtils.isEmpty(str2)) {
                TextView textView = new TextView(context);
                this.f340697i = textView;
                textView.setId(16908299);
                this.f340697i.setText(str2);
                this.f340697i.setTextColor(-1);
                this.f340697i.setTextSize(2, 16.0f);
                int a4 = C40003jy.m42819a(context, 5);
                this.f340697i.setPadding(a4, a4, a4, a4);
                linearLayout.addView(this.f340697i, new ViewGroup.MarginLayoutParams(-1, -2));
            }
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(21);
            TextView textView2 = new TextView(context);
            int a5 = C40003jy.m42819a(context, 5);
            int a6 = C40003jy.m42819a(context, 10);
            textView2.setTextColor(-1);
            textView2.setBackgroundColor(-16776961);
            textView2.setPadding(a6, a5, a6, a5);
            textView2.setVisibility(8);
            this.f340695g = textView2;
            linearLayout2.addView(textView2, new ViewGroup.MarginLayoutParams(-2, -2));
            linearLayout.addView(linearLayout2, new ViewGroup.MarginLayoutParams(-1, -2));
            return linearLayout;
        }

        /* renamed from: a */
        public final C113881a mo172287a() {
            try {
                Object a = C113800hd.m157129a((Object) this.f340689a, "mTN");
                if (a != null) {
                    Object a2 = C113800hd.m157129a(a, "mParams");
                    if (a2 instanceof WindowManager.LayoutParams) {
                        ((WindowManager.LayoutParams) a2).flags = 136;
                    }
                }
            } catch (Exception unused) {
            }
            return this;
        }

        /* renamed from: a */
        public final C113881a mo172290a(String str, View.OnClickListener onClickListener) {
            if (!(this.f340695g == null || TextUtils.isEmpty(str) || onClickListener == null)) {
                this.f340695g.setText(str);
                this.f340695g.setOnClickListener(onClickListener);
                this.f340695g.setVisibility(0);
            }
            return this;
        }

        /* renamed from: a */
        private C113881a m157450a(String str) {
            TextView textView;
            this.f340693e = str;
            if (!(str == null || (textView = this.f340696h) == null)) {
                textView.setText(str);
            }
            return this;
        }

        /* renamed from: a */
        public final C113881a mo172289a(String str, int i) {
            TextView textView;
            this.f340694f = str;
            if (!(str == null || (textView = this.f340697i) == null)) {
                textView.setText(str);
                this.f340697i.setGravity(i);
            }
            return this;
        }

        /* renamed from: a */
        private C113881a m157447a(int i) {
            this.f340690b = i;
            Toast toast = this.f340689a;
            if (toast != null) {
                toast.setGravity(i, this.f340691c, this.f340692d);
            }
            return this;
        }

        /* renamed from: a */
        private C113881a m157448a(int i, int i2) {
            this.f340691c = i;
            this.f340692d = i2;
            Toast toast = this.f340689a;
            if (toast != null) {
                toast.setGravity(this.f340690b, i, i2);
            }
            return this;
        }
    }

    /* renamed from: a */
    public static C113881a m157444a(Context context, String str, String str2, int i) {
        if (context == null) {
            return null;
        }
        C113881a aVar = new C113881a(context);
        return aVar.mo172288a(context, (View) aVar.mo172286a(context, str, str2), i);
    }

    /* renamed from: b */
    private static C113881a m157445b(Context context, String str) {
        return m157444a(context, (String) null, str, 0);
    }

    /* renamed from: a */
    private static C113881a m157442a(Context context) {
        return m157444a(context, (String) null, " ", 0);
    }

    /* renamed from: a */
    private static C113881a m157443a(Context context, String str) {
        return m157444a(context, (String) null, str, 0);
    }
}
