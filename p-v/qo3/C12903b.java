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

/* renamed from: qo3.b */
public class C12903b extends C103422m {

    /* renamed from: f */
    public Context f36888f;

    /* renamed from: g */
    public FrameLayout f36889g;

    /* renamed from: qo3.b$a */
    public class C12904a implements View.OnClickListener {
        public C12904a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/dialog/CustomSheetDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (C12903b.this.isShowing()) {
                C12903b.this.cancel();
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/dialog/CustomSheetDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12903b(Context context, int i) {
        super(context, i == 0 ? C0966R.style.f8426i2 : i);
        this.f36888f = context;
        mo143460C(1);
    }

    /* renamed from: E */
    public final void mo12436E() {
        int c = (!C75044y4.m89992d(this.f36888f) || Build.VERSION.SDK_INT >= 30) ? 0 : C75044y4.m89991c(this.f36888f);
        if (mo12437F()) {
            FrameLayout frameLayout = this.f36889g;
            if (frameLayout != null) {
                CoordinatorLayout.C103717e eVar = (CoordinatorLayout.C103717e) frameLayout.getLayoutParams();
                if (getWindow().getWindowManager().getDefaultDisplay().getRotation() == 1) {
                    eVar.setMargins(0, 0, c, 0);
                } else if (getWindow().getWindowManager().getDefaultDisplay().getRotation() == 3) {
                    eVar.setMargins(c, 0, 0, 0);
                }
                this.f36889g.setLayoutParams(eVar);
                return;
            }
            return;
        }
        FrameLayout frameLayout2 = this.f36889g;
        if (frameLayout2 != null) {
            CoordinatorLayout.C103717e eVar2 = (CoordinatorLayout.C103717e) frameLayout2.getLayoutParams();
            eVar2.setMargins(0, 0, 0, c);
            this.f36889g.setLayoutParams(eVar2);
        }
    }

    /* renamed from: F */
    public boolean mo12437F() {
        return this.f36888f.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: G */
    public boolean mo5042G() {
        TypedValue typedValue = new TypedValue();
        return getContext().getTheme().resolveAttribute(16843611, typedValue, true) && typedValue.data != 0;
    }

    /* renamed from: H */
    public final View mo12438H(int i, View view, ViewGroup.LayoutParams layoutParams) {
        Window window = getWindow();
        if (mo12437F()) {
            window.setGravity(5);
            window.setWindowAnimations(C0966R.style.f8722sr);
        } else {
            window.setGravity(80);
            window.setWindowAnimations(C0966R.style.f8364fu);
        }
        window.getDecorView().setPadding(0, 0, 0, 0);
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (mo12437F()) {
            attributes.width = -2;
            attributes.height = -1;
        } else {
            attributes.width = -1;
            attributes.height = -2;
        }
        window.setAttributes(attributes);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f36888f).inflate(C0966R.C0971layout.bbj, (ViewGroup) null);
        View findViewById = viewGroup.findViewById(C0966R.C0970id.f359415kt1);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, viewGroup, false);
        }
        if (mo12437F()) {
            this.f36889g = (FrameLayout) viewGroup.findViewById(C0966R.C0970id.gsp);
        } else {
            this.f36889g = (FrameLayout) viewGroup.findViewById(C0966R.C0970id.gsn);
        }
        mo12436E();
        this.f36889g.setVisibility(0);
        if (layoutParams == null) {
            this.f36889g.addView(view);
        } else {
            this.f36889g.addView(view, layoutParams);
        }
        if (mo5042G()) {
            findViewById.setOnClickListener(new C12904a());
        }
        return viewGroup;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo12436E();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setLayout(-1, -1);
    }

    public void setContentView(View view) {
        super.setContentView(mo12438H(0, view, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(mo12438H(0, view, layoutParams));
    }

    public void setContentView(int i) {
        super.setContentView(mo12438H(i, (View) null, (ViewGroup.LayoutParams) null));
    }
}
