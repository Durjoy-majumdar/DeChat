package qo3;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.appcompat.app.C103422m;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: qo3.l0 */
public class C12918l0 extends C103422m {

    /* renamed from: f */
    public Context f36912f;

    /* renamed from: g */
    public FrameLayout f36913g;

    /* renamed from: qo3.l0$a */
    public class C12919a implements View.OnClickListener {
        public C12919a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/dialog/NewBottomSheetDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (C12918l0.this.isShowing()) {
                C12918l0.this.cancel();
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/NewBottomSheetDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12918l0(Context context, int i) {
        super(context, i == 0 ? C0966R.style.f8426i2 : i);
        this.f36912f = context;
        mo143460C(1);
    }

    /* renamed from: E */
    public final void mo12452E() {
        if (this.f36913g != null && !mo12453F()) {
            int c = (!C75044y4.m89992d(this.f36912f) || Build.VERSION.SDK_INT >= 30) ? 0 : C75044y4.m89991c(this.f36912f);
            CoordinatorLayout.C103717e eVar = (CoordinatorLayout.C103717e) this.f36913g.getLayoutParams();
            eVar.setMargins(0, 0, 0, c);
            this.f36913g.setLayoutParams(eVar);
        }
    }

    /* renamed from: F */
    public final boolean mo12453F() {
        return this.f36912f.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: G */
    public final View mo12454G(int i, View view, ViewGroup.LayoutParams layoutParams) {
        Window window = getWindow();
        boolean z = true;
        if (mo12453F()) {
            window.setGravity(1);
            window.setWindowAnimations(C0966R.style.f8365fv);
        } else {
            window.setGravity(80);
            window.setWindowAnimations(C0966R.style.f8365fv);
        }
        boolean z2 = false;
        window.getDecorView().setPadding(0, 0, 0, 0);
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (mo12453F()) {
            attributes.width = -2;
            attributes.height = -2;
        } else {
            attributes.width = -1;
            attributes.height = -2;
        }
        window.setAttributes(attributes);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f36912f).inflate(C0966R.C0971layout.bkt, (ViewGroup) null);
        View findViewById = viewGroup.findViewById(C0966R.C0970id.f359415kt1);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, viewGroup, false);
        }
        if (mo12453F()) {
            this.f36913g = (FrameLayout) viewGroup.findViewById(C0966R.C0970id.gso);
        } else {
            this.f36913g = (FrameLayout) viewGroup.findViewById(C0966R.C0970id.gsn);
            mo12452E();
        }
        this.f36913g.setVisibility(0);
        if (layoutParams == null) {
            this.f36913g.addView(view);
        } else {
            this.f36913g.addView(view, layoutParams);
        }
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(16843611, typedValue, true)) {
            if (typedValue.data == 0) {
                z = false;
            }
            z2 = z;
        }
        if (z2) {
            findViewById.setOnClickListener(new C12919a());
        }
        return viewGroup;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo12452E();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setLayout(-1, -1);
    }

    public void setContentView(View view) {
        super.setContentView(mo12454G(0, view, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(mo12454G(0, view, layoutParams));
    }

    public void setContentView(int i) {
        super.setContentView(mo12454G(i, (View) null, (ViewGroup.LayoutParams) null));
    }
}
