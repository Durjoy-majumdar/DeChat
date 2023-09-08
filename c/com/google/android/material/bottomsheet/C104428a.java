package com.google.android.material.bottomsheet;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.C103422m;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.tencent.p014mm.C0966R;
import p1108f3.C107453d;
import p849e3.C107166a;
import p849e3.C107207u;

/* renamed from: com.google.android.material.bottomsheet.a */
public class C104428a extends C103422m {

    /* renamed from: f */
    public BottomSheetBehavior<FrameLayout> f309249f;

    /* renamed from: g */
    public boolean f309250g;

    /* renamed from: h */
    public boolean f309251h;

    /* renamed from: i */
    public boolean f309252i;

    /* renamed from: j */
    public BottomSheetBehavior.C0912c f309253j;

    /* renamed from: com.google.android.material.bottomsheet.a$d */
    public class C0913d extends BottomSheetBehavior.C0912c {
        public C0913d() {
        }

        /* renamed from: a */
        public void mo837a(View view, float f) {
        }

        /* renamed from: b */
        public void mo838b(View view, int i) {
            if (i == 5) {
                C104428a.this.cancel();
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$a */
    public class C104429a implements View.OnClickListener {
        public C104429a() {
        }

        public void onClick(View view) {
            C104428a aVar = C104428a.this;
            if (aVar.f309250g && aVar.isShowing()) {
                C104428a aVar2 = C104428a.this;
                if (!aVar2.f309252i) {
                    TypedArray obtainStyledAttributes = aVar2.getContext().obtainStyledAttributes(new int[]{16843611});
                    aVar2.f309251h = obtainStyledAttributes.getBoolean(0, true);
                    obtainStyledAttributes.recycle();
                    aVar2.f309252i = true;
                }
                if (aVar2.f309251h) {
                    C104428a.this.cancel();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$b */
    public class C104430b extends C107166a {
        public C104430b() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, C107453d dVar) {
            super.onInitializeAccessibilityNodeInfo(view, dVar);
            if (C104428a.this.f309250g) {
                dVar.mo157839a(1048576);
                dVar.f321473a.setDismissable(true);
                return;
            }
            dVar.f321473a.setDismissable(false);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                C104428a aVar = C104428a.this;
                if (aVar.f309250g) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.performAccessibilityAction(view, i, bundle);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$c */
    public class C104431c implements View.OnTouchListener {
        public C104431c(C104428a aVar) {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C104428a(android.content.Context r4, int r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L_0x001b
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r2 = 2130968711(0x7f040087, float:1.7546083E38)
            boolean r1 = r1.resolveAttribute(r2, r5, r0)
            if (r1 == 0) goto L_0x0018
            int r5 = r5.resourceId
            goto L_0x001b
        L_0x0018:
            r5 = 2131887036(0x7f1203bc, float:1.9408668E38)
        L_0x001b:
            r3.<init>(r4, r5)
            r3.f309250g = r0
            r3.f309251h = r0
            com.google.android.material.bottomsheet.a$d r4 = new com.google.android.material.bottomsheet.a$d
            r4.<init>()
            r3.f309253j = r4
            r3.mo143460C(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.C104428a.<init>(android.content.Context, int):void");
    }

    /* renamed from: E */
    public final View mo146397E(int i, View view, ViewGroup.LayoutParams layoutParams) {
        FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), C0966R.C0971layout.f7125z1, (ViewGroup) null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) frameLayout.findViewById(C0966R.C0970id.btk);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        FrameLayout frameLayout2 = (FrameLayout) coordinatorLayout.findViewById(C0966R.C0970id.c2m);
        BottomSheetBehavior<FrameLayout> y = BottomSheetBehavior.m139527y(frameLayout2);
        this.f309249f = y;
        y.f309240z = this.f309253j;
        y.f309230p = this.f309250g;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(C0966R.C0970id.f359415kt1).setOnClickListener(new C104429a());
        C107207u.m145168i(frameLayout2, new C104430b());
        frameLayout2.setOnTouchListener(new C104431c(this));
        return frameLayout;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f309249f;
        if (bottomSheetBehavior != null && bottomSheetBehavior.f309232r == 5) {
            bottomSheetBehavior.mo146384B(4);
        }
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f309250g != z) {
            this.f309250g = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f309249f;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.f309230p = z;
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f309250g) {
            this.f309250g = true;
        }
        this.f309251h = z;
        this.f309252i = true;
    }

    public void setContentView(int i) {
        super.setContentView(mo146397E(i, (View) null, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view) {
        super.setContentView(mo146397E(0, view, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(mo146397E(0, view, layoutParams));
    }
}
