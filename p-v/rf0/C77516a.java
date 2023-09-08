package rf0;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;
import pf0.C21966a;

/* renamed from: rf0.a */
public class C77516a {

    /* renamed from: d */
    public Context f226017d;

    /* renamed from: e */
    public ViewGroup f226018e;

    /* renamed from: f */
    public ViewGroup f226019f;

    /* renamed from: g */
    public C21966a f226020g;

    /* renamed from: h */
    public boolean f226021h;

    /* renamed from: i */
    public Animation f226022i;

    /* renamed from: j */
    public Animation f226023j;

    /* renamed from: n */
    public View.OnKeyListener f226024n = new C77518b();

    /* renamed from: o */
    public final View.OnTouchListener f226025o = new C77519c();

    /* renamed from: rf0.a$a */
    public class C77517a implements Animation.AnimationListener {
        public C77517a() {
        }

        public void onAnimationEnd(Animation animation) {
            C77516a.this.f226020g.getClass();
            throw null;
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: rf0.a$b */
    public class C77518b implements View.OnKeyListener {
        public C77518b() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(keyEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/picker/view/BasePickerView$3", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
            if (i == 4 && keyEvent.getAction() == 0) {
                C77516a aVar = C77516a.this;
                if (!aVar.mo35383d() && aVar.f226019f.getParent() != null) {
                    C77516a.this.mo107668a();
                    C117292a.m165362h(true, this, "com/tencent/mm/picker/view/BasePickerView$3", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                    return true;
                }
            }
            C117292a.m165362h(false, this, "com/tencent/mm/picker/view/BasePickerView$3", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return false;
        }
    }

    /* renamed from: rf0.a$c */
    public class C77519c implements View.OnTouchListener {
        public C77519c() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/picker/view/BasePickerView$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (motionEvent.getAction() == 0) {
                C77516a.this.mo107668a();
            }
            C117292a.m165362h(false, this, "com/tencent/mm/picker/view/BasePickerView$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    public C77516a(Context context) {
        this.f226017d = context;
    }

    /* renamed from: a */
    public void mo107668a() {
        if (!mo35383d() && !this.f226021h) {
            this.f226022i.setAnimationListener(new C77517a());
            this.f226018e.startAnimation(this.f226022i);
            this.f226021h = true;
        }
    }

    /* renamed from: b */
    public void mo107669b() {
        this.f226023j = AnimationUtils.loadAnimation(this.f226017d, C0966R.C0968anim.f2452au);
        this.f226022i = AnimationUtils.loadAnimation(this.f226017d, C0966R.C0968anim.f2453av);
    }

    /* renamed from: c */
    public void mo107670c() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        LayoutInflater from = LayoutInflater.from(this.f226017d);
        this.f226020g.getClass();
        ViewGroup viewGroup = null;
        ViewGroup viewGroup2 = (ViewGroup) from.inflate(C0966R.C0971layout.f359845b41, (ViewGroup) null, false);
        this.f226019f = viewGroup2;
        viewGroup2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f226020g.getClass();
        ViewGroup viewGroup3 = (ViewGroup) this.f226019f.findViewById(C0966R.C0970id.brm);
        this.f226018e = viewGroup3;
        viewGroup3.setLayoutParams(layoutParams);
        if (!mo35383d()) {
            viewGroup = this.f226019f;
        }
        viewGroup.setFocusable(true);
        viewGroup.setFocusableInTouchMode(true);
        viewGroup.setOnKeyListener(this.f226024n);
    }

    /* renamed from: d */
    public boolean mo35383d() {
        throw null;
    }
}
