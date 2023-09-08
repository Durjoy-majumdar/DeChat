package com.tencent.liteav.sdkcommon;

import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

/* renamed from: com.tencent.liteav.sdkcommon.g */
final class C17178g {

    /* renamed from: a */
    public final DisplayMetrics f46389a = new DisplayMetrics();

    /* renamed from: b */
    public final Context f46390b;

    /* renamed from: c */
    public WindowManager f46391c;

    /* renamed from: d */
    public WindowManager.LayoutParams f46392d;

    /* renamed from: e */
    public WindowManager.LayoutParams f46393e;

    /* renamed from: f */
    public View f46394f;

    /* renamed from: g */
    public View f46395g;

    /* renamed from: h */
    public TextView f46396h;

    /* renamed from: i */
    public TextView f46397i;

    /* renamed from: j */
    public Spinner f46398j;

    /* renamed from: k */
    public final ArrayAdapter<String> f46399k;

    /* renamed from: l */
    public ScrollView f46400l;

    /* renamed from: m */
    public boolean f46401m = false;

    /* renamed from: n */
    public String f46402n;

    /* renamed from: o */
    public final Rect f46403o = new Rect(0, 0, 0, 0);

    /* renamed from: p */
    public final C17179a f46404p;

    /* renamed from: q */
    private final int f46405q = 100;

    /* renamed from: r */
    private final int f46406r = -65536;

    /* renamed from: com.tencent.liteav.sdkcommon.g$a */
    public interface C17179a {
        /* renamed from: a */
        void mo19713a(int i);
    }

    /* renamed from: com.tencent.liteav.sdkcommon.g$b */
    public class C17180b implements View.OnTouchListener {

        /* renamed from: b */
        private int f46408b;

        /* renamed from: c */
        private int f46409c;

        private C17180b() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f46408b = (int) motionEvent.getRawX();
                this.f46409c = (int) motionEvent.getRawY();
            } else if (action == 2) {
                int rawX = (int) motionEvent.getRawX();
                int rawY = (int) motionEvent.getRawY();
                C17178g gVar = C17178g.this;
                WindowManager.LayoutParams layoutParams = gVar.f46392d;
                int i = layoutParams.x + (rawX - this.f46408b);
                layoutParams.x = i;
                int i2 = layoutParams.y + (rawY - this.f46409c);
                layoutParams.y = i2;
                this.f46408b = rawX;
                this.f46409c = rawY;
                if (i < 0) {
                    layoutParams.x = 0;
                }
                if (i2 < 0) {
                    layoutParams.y = 0;
                }
                int i3 = layoutParams.x;
                int i4 = gVar.f46403o.right;
                int i5 = i3 + i4;
                DisplayMetrics displayMetrics = gVar.f46389a;
                int i6 = displayMetrics.widthPixels;
                if (i5 > i6) {
                    layoutParams.width = i6 - i3;
                } else {
                    layoutParams.width = i4;
                }
                int i7 = layoutParams.y;
                int i8 = i7 + 100;
                int i9 = displayMetrics.heightPixels;
                if (i8 > i9) {
                    layoutParams.height = i9 - i7;
                } else {
                    layoutParams.height = 100;
                }
                gVar.f46391c.updateViewLayout(view, layoutParams);
                C17178g gVar2 = C17178g.this;
                WindowManager.LayoutParams layoutParams2 = gVar2.f46393e;
                WindowManager.LayoutParams layoutParams3 = gVar2.f46392d;
                int i15 = layoutParams3.x;
                layoutParams2.x = i15;
                int i16 = layoutParams3.y + layoutParams3.height;
                layoutParams2.y = i16;
                Rect rect = gVar2.f46403o;
                int i17 = rect.right;
                int i18 = i15 + i17;
                DisplayMetrics displayMetrics2 = gVar2.f46389a;
                int i19 = displayMetrics2.widthPixels;
                if (i18 > i19) {
                    layoutParams2.width = i19 - i15;
                } else {
                    layoutParams2.width = i17;
                }
                int i25 = rect.bottom;
                int i26 = i16 + i25;
                int i27 = displayMetrics2.heightPixels;
                if (i26 > i27) {
                    layoutParams2.height = i27 - i16;
                } else {
                    layoutParams2.height = i25;
                }
                gVar2.f46391c.updateViewLayout(gVar2.f46395g, layoutParams2);
            }
            view.performClick();
            return false;
        }

        public /* synthetic */ C17180b(C17178g gVar, byte b) {
            this();
        }
    }

    /* renamed from: com.tencent.liteav.sdkcommon.g$c */
    public class C17181c implements AdapterView.OnItemSelectedListener {
        private C17181c() {
        }

        public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (view != null) {
                ((TextView) view).setTextColor(-65536);
                C17178g gVar = C17178g.this;
                gVar.f46402n = gVar.f46399k.getItem(i);
                C17178g.this.f46404p.mo19713a(i);
            }
        }

        public final void onNothingSelected(AdapterView<?> adapterView) {
        }

        public /* synthetic */ C17181c(C17178g gVar, byte b) {
            this();
        }
    }

    public C17178g(Context context, C17179a aVar) {
        this.f46390b = context;
        this.f46404p = aVar;
        this.f46399k = new ArrayAdapter<>(context, 17367048);
    }

    /* renamed from: a */
    public final void mo19722a(String str) {
        TextView textView = this.f46397i;
        if (textView != null) {
            textView.setText(str);
        }
        ScrollView scrollView = this.f46400l;
        if (scrollView != null) {
            scrollView.fullScroll(130);
        }
    }

    /* renamed from: b */
    public final void mo19723b(String str) {
        TextView textView = this.f46396h;
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* renamed from: a */
    public final void mo19721a() {
        TextView textView;
        Spinner spinner = this.f46398j;
        if (spinner != null && (textView = (TextView) spinner.getChildAt(spinner.getSelectedItemPosition())) != null) {
            textView.setTextColor(-65536);
        }
    }

    /* renamed from: a */
    public final int mo19720a(int i) {
        return (int) ((((float) i) * this.f46390b.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
