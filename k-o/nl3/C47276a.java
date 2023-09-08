package nl3;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.appcompat.app.C103422m;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103766u;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: nl3.a */
public abstract class C47276a extends C103422m implements C0125s {

    /* renamed from: p */
    public static final C47277a f126899p = new C47277a();

    /* renamed from: q */
    public static C47276a f126900q;

    /* renamed from: r */
    public static boolean f126901r;

    /* renamed from: f */
    public final Context f126902f;

    /* renamed from: g */
    public View f126903g;

    /* renamed from: h */
    public View f126904h;

    /* renamed from: i */
    public View f126905i;

    /* renamed from: j */
    public View f126906j;

    /* renamed from: n */
    public final C13601g f126907n;

    /* renamed from: o */
    public DialogInterface.OnDismissListener f126908o;

    /* renamed from: nl3.a$b */
    public static final class C11219b implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ C47276a f33076d;

        public C11219b(C47276a aVar) {
            this.f33076d = aVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/dialog/HalfScreenDialog$initContentView$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            this.f33076d.mo68877K();
            C117292a.m165362h(true, this, "com/tencent/mm/ui/dialog/HalfScreenDialog$initContentView$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    /* renamed from: nl3.a$a */
    public static final class C47277a {
    }

    /* renamed from: nl3.a$c */
    public static final class C47278c implements DialogInterface.OnDismissListener {

        /* renamed from: d */
        public final /* synthetic */ C47276a f126909d;

        public C47278c(C47276a aVar) {
            this.f126909d = aVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f126909d.mo68876J();
        }
    }

    /* renamed from: nl3.a$d */
    public static final class C47279d extends C87413o implements C32224a<C103766u> {

        /* renamed from: d */
        public final /* synthetic */ C47276a f126910d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47279d(C47276a aVar) {
            super(0);
            this.f126910d = aVar;
        }

        public Object invoke() {
            return new C103766u(this.f126910d);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47276a(Context context) {
        super(context, C0966R.style.f8493kl);
        C87412m.m108594g(context, "selfContext");
        this.f126902f = context;
        C13601g a = C36568h.m40985a(new C47279d(this));
        this.f126907n = a;
        ((C103766u) ((C36570n) a).getValue()).mo145136d(C39623j.C39626c.INITIALIZED);
    }

    /* renamed from: I */
    public static final boolean m52573I() {
        C47277a aVar = f126899p;
        aVar.getClass();
        if (f126901r != C85875k4.m106211z()) {
            try {
                C47276a aVar2 = f126900q;
                if (aVar2 != null) {
                    aVar2.dismiss();
                }
            } catch (Exception unused) {
            }
            f126900q = null;
            return false;
        }
        C47276a aVar3 = f126900q;
        if (aVar3 == null) {
            return false;
        }
        if (aVar3.isShowing()) {
            return true;
        }
        aVar.getClass();
        f126900q = null;
        return false;
    }

    /* renamed from: E */
    public final void mo72306E() {
        if (this.f126905i != null) {
            int i = 0;
            if (Build.VERSION.SDK_INT < 30 && C75044y4.m89992d(this.f126902f)) {
                if (!(getContext().getResources().getConfiguration().orientation == 2)) {
                    i = C75044y4.m89991c(this.f126902f);
                }
            }
            View view = this.f126905i;
            RelativeLayout.LayoutParams layoutParams = null;
            ViewGroup.LayoutParams layoutParams2 = view != null ? view.getLayoutParams() : null;
            if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                layoutParams = (RelativeLayout.LayoutParams) layoutParams2;
            }
            if (layoutParams != null) {
                layoutParams.bottomMargin = i;
            }
            View view2 = this.f126905i;
            if (view2 != null) {
                view2.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: F */
    public int mo23875F() {
        return C76577a.m92151b(getContext(), 130);
    }

    /* renamed from: G */
    public abstract View mo6265G();

    /* JADX WARNING: type inference failed for: r1v2, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6266H() {
        /*
            r5 = this;
            android.view.Window r0 = r5.getWindow()
            r1 = -1
            if (r0 == 0) goto L_0x000a
            r0.setLayout(r1, r1)
        L_0x000a:
            android.view.Window r0 = r5.getWindow()
            if (r0 == 0) goto L_0x0015
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            r0.addFlags(r2)
        L_0x0015:
            android.view.Window r0 = r5.getWindow()
            if (r0 == 0) goto L_0x0020
            r2 = 1056964608(0x3f000000, float:0.5)
            r0.setDimAmount(r2)
        L_0x0020:
            android.view.Window r0 = r5.getWindow()
            if (r0 == 0) goto L_0x002c
            r2 = 2131886334(0x7f1200fe, float:1.9407244E38)
            r0.setWindowAnimations(r2)
        L_0x002c:
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r2 = 2131495950(0x7f0c0c0e, float:1.8615451E38)
            r3 = 0
            r4 = 0
            android.view.View r0 = r0.inflate(r2, r4, r3)
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r2.<init>(r1, r1)
            r5.setContentView(r0, r2)
            r5.f126903g = r0
            r2 = 2131301605(0x7f0914e5, float:1.8221273E38)
            if (r0 == 0) goto L_0x0051
            android.view.View r0 = r0.findViewById(r2)
            goto L_0x0052
        L_0x0051:
            r0 = r4
        L_0x0052:
            r5.f126904h = r0
            if (r0 == 0) goto L_0x006a
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 == 0) goto L_0x006a
            int r3 = r5.mo23875F()
            r0.height = r3
            android.view.View r3 = r5.f126904h
            if (r3 != 0) goto L_0x0067
            goto L_0x006a
        L_0x0067:
            r3.setLayoutParams(r0)
        L_0x006a:
            android.view.View r0 = r5.f126904h
            if (r0 == 0) goto L_0x0076
            nl3.a$b r3 = new nl3.a$b
            r3.<init>(r5)
            r0.setOnTouchListener(r3)
        L_0x0076:
            android.view.View r0 = r5.f126903g
            if (r0 == 0) goto L_0x0082
            r3 = 2131300426(0x7f09104a, float:1.8218881E38)
            android.view.View r0 = r0.findViewById(r3)
            goto L_0x0083
        L_0x0082:
            r0 = r4
        L_0x0083:
            r5.f126906j = r0
            android.view.View r0 = r5.mo6265G()
            r5.f126905i = r0
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            r0.<init>(r1, r1)
            r1 = 3
            r0.addRule(r1, r2)
            android.view.View r1 = r5.f126903g
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x009d
            r4 = r1
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
        L_0x009d:
            if (r4 == 0) goto L_0x00a4
            android.view.View r1 = r5.f126905i
            r4.addView(r1, r0)
        L_0x00a4:
            r0 = 1
            r5.setCancelable(r0)
            nl3.a$c r0 = new nl3.a$c
            r0.<init>(r5)
            super.setOnDismissListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nl3.C47276a.mo6266H():void");
    }

    /* renamed from: J */
    public void mo68876J() {
        ((C103766u) ((C36570n) this.f126907n).getValue()).mo145136d(C39623j.C39626c.DESTROYED);
        DialogInterface.OnDismissListener onDismissListener = this.f126908o;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(this);
        }
        f126900q = null;
    }

    /* renamed from: K */
    public void mo68877K() {
        cancel();
    }

    public C39623j getLifecycle() {
        return (C103766u) ((C36570n) this.f126907n).getValue();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo72306E();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C103766u) ((C36570n) this.f126907n).getValue()).mo145136d(C39623j.C39626c.CREATED);
        mo6266H();
    }

    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.f126908o = onDismissListener;
    }

    public void show() {
        super.show();
        f126901r = C85875k4.m106211z();
        ((C103766u) ((C36570n) this.f126907n).getValue()).mo145136d(C39623j.C39626c.RESUMED);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
    }
}
