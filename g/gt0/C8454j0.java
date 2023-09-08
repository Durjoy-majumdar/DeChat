package gt0;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.C103422m;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.qqmusic.mediaplayer.UnSupportMethodException;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: gt0.j0 */
public final class C8454j0 extends C103422m {

    /* renamed from: f */
    public int f27458f;

    /* renamed from: g */
    public int f27459g;

    /* renamed from: h */
    public final View f27460h;

    /* renamed from: i */
    public final FrameLayout f27461i;

    /* renamed from: j */
    public final BottomSheetBehavior<FrameLayout> f27462j;

    /* renamed from: n */
    public boolean f27463n;

    /* renamed from: gt0.j0$a */
    public static final class C8455a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C8454j0 f27464d;

        public C8455a(C8454j0 j0Var) {
            this.f27464d = j0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/dialog/HalfScreenDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            boolean z = this.f27464d.f27463n;
            Log.m105924i("MicroMsg.AppBrand.HalfScreenDialog", "onClick, isCanceledOnTouchOutside: " + z);
            if (z) {
                this.f27464d.dismiss();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/dialog/HalfScreenDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: gt0.j0$b */
    public static final class C8456b extends BottomSheetBehavior.C0912c {

        /* renamed from: a */
        public final /* synthetic */ C8454j0 f27465a;

        public C8456b(C8454j0 j0Var) {
            this.f27465a = j0Var;
        }

        /* renamed from: a */
        public void mo837a(View view, float f) {
            C87412m.m108594g(view, "bottomSheet");
        }

        /* renamed from: b */
        public void mo838b(View view, int i) {
            C87412m.m108594g(view, "bottomSheet");
            Log.m105924i("MicroMsg.AppBrand.HalfScreenDialog", "onStateChanged, newState: " + i);
            if (5 == i) {
                C8454j0.super.cancel();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8454j0(Context context) {
        super(context, C0966R.style.f8218n);
        C87412m.m108594g(context, "context");
        int i = context.getResources().getDisplayMetrics().heightPixels;
        float f = (float) i;
        this.f27458f = (int) (0.5f * f);
        this.f27459g = (int) (f * 1.0f);
        Log.m105924i("MicroMsg.AppBrand.HalfScreenDialog", "<init>, screenHeight: " + i + ", defaultPeekHeight: " + this.f27458f + ", defaultMaxHeight: " + this.f27459g);
        mo143460C(1);
        View inflate = getLayoutInflater().inflate(C0966R.C0971layout.f6416e_, (ViewGroup) null);
        inflate.setOnClickListener(new C8455a(this));
        View findViewById = inflate.findViewById(C0966R.C0970id.f357789bs0);
        C87412m.m108593f(findViewById, "contentView.findViewById…content_layout_container)");
        this.f27460h = findViewById;
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        layoutParams.height = this.f27459g;
        findViewById.setLayoutParams(layoutParams);
        super.setContentView(inflate);
        View findViewById2 = findViewById.findViewById(C0966R.C0970id.brz);
        C87412m.m108593f(findViewById2, "halfScreenViewContainer.…ById(R.id.content_layout)");
        FrameLayout frameLayout = (FrameLayout) findViewById2;
        this.f27461i = frameLayout;
        BottomSheetBehavior<FrameLayout> y = BottomSheetBehavior.m139527y(frameLayout);
        C87412m.m108593f(y, "from(halfScreenView)");
        this.f27462j = y;
        y.mo146383A(this.f27458f);
        y.mo146384B(5);
        y.f309240z = new C8456b(this);
    }

    public void cancel() {
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f27462j;
        if (5 != bottomSheetBehavior.f309232r) {
            bottomSheetBehavior.mo146384B(5);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.addFlags(67108864);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setWindowAnimations(C0966R.style.f8365fv);
        }
        if (2 == getContext().getResources().getConfiguration().orientation) {
            Window window3 = getWindow();
            if (window3 != null) {
                window3.setGravity(81);
            }
            DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
            int i = displayMetrics.heightPixels;
            int i2 = displayMetrics.widthPixels;
            if (i > i2) {
                i = i2;
            }
            Log.m105924i("MicroMsg.AppBrand.HalfScreenDialog", "adjustBounds, width: " + i);
            Window window4 = getWindow();
            if (window4 != null) {
                window4.setLayout(i, -1);
                return;
            }
            return;
        }
        Window window5 = getWindow();
        if (window5 != null) {
            window5.setGravity(80);
        }
        Window window6 = getWindow();
        if (window6 != null) {
            window6.setLayout(-1, -1);
        }
    }

    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f27462j;
        if (5 == bottomSheetBehavior.f309232r) {
            bottomSheetBehavior.mo146384B(4);
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        this.f27463n = z;
    }

    public void setContentView(int i) {
        getLayoutInflater().inflate(i, this.f27461i);
    }

    public void setContentView(View view) {
        C87412m.m108594g(view, "view");
        throw new UnSupportMethodException("Use setContentView(Int) instead.");
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C87412m.m108594g(view, "view");
        throw new UnSupportMethodException("Use setContentView(Int) instead.");
    }
}
