package x93;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.appcompat.app.C103422m;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: x93.h */
public class C15629h extends C103422m {

    /* renamed from: f */
    public Context f42255f;

    /* renamed from: x93.h$a */
    public class C15630a implements View.OnClickListener {
        public C15630a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/game/menu/GameSheetDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (C15629h.this.isShowing()) {
                C15629h.this.cancel();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/game/menu/GameSheetDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15629h(Context context, int i) {
        super(context, i == 0 ? C0966R.style.f8487kb : i);
        mo143460C(1);
        this.f42255f = context;
    }

    /* renamed from: E */
    public final View mo14375E(int i, View view, ViewGroup.LayoutParams layoutParams) {
        Window window = getWindow();
        DisplayMetrics displayMetrics = this.f42255f.getResources().getDisplayMetrics();
        boolean z = false;
        if (displayMetrics.widthPixels > displayMetrics.heightPixels) {
            window.setGravity(5);
            window.setWindowAnimations(C0966R.style.f8722sr);
        } else {
            window.setGravity(80);
            window.setWindowAnimations(C0966R.style.f8364fu);
        }
        window.getDecorView().setPadding(0, 0, 0, 0);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        window.setAttributes(attributes);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f42255f).inflate(C0966R.C0971layout.ax8, (ViewGroup) null);
        View findViewById = viewGroup.findViewById(C0966R.C0970id.f359415kt1);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, viewGroup, false);
        }
        DisplayMetrics displayMetrics2 = this.f42255f.getResources().getDisplayMetrics();
        FrameLayout frameLayout = displayMetrics2.widthPixels > displayMetrics2.heightPixels ? (FrameLayout) viewGroup.findViewById(C0966R.C0970id.gsp) : (FrameLayout) viewGroup.findViewById(C0966R.C0970id.gsn);
        frameLayout.setVisibility(0);
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(16843611, typedValue, true) && typedValue.data != 0) {
            z = true;
        }
        if (z) {
            findViewById.setOnClickListener(new C15630a());
        }
        return viewGroup;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setLayout(-1, -1);
    }

    public void setContentView(int i) {
        super.setContentView(mo14375E(i, (View) null, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view) {
        super.setContentView(mo14375E(0, view, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(mo14375E(0, view, layoutParams));
    }
}
