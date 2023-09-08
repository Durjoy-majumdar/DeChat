package wc3;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import kg3.C76577a;
import p206nj.C76860a;

/* renamed from: wc3.u */
public class C78538u {

    /* renamed from: wc3.u$c */
    public class C53149c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f148291d;

        /* renamed from: e */
        public final /* synthetic */ int f148292e;

        /* renamed from: f */
        public final /* synthetic */ View f148293f;

        public C53149c(AppCompatActivity appCompatActivity, int i, View view) {
            this.f148291d = appCompatActivity;
            this.f148292e = i;
            this.f148293f = view;
        }

        public void run() {
            this.f148291d.getWindow().getDecorView().setSystemUiVisibility(this.f148291d.getWindow().getDecorView().getSystemUiVisibility() | 256);
            Log.m105925i("MicroMsg.FullScreenHelper", "setFullScreenAfterSetContentView to contentView, height: %s", Integer.valueOf(this.f148292e));
            View view = this.f148293f;
            if (view != null) {
                view.setPadding(0, this.f148292e, 0, 0);
            }
        }
    }

    /* renamed from: wc3.u$a */
    public class C78539a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WeakReference f230024d;

        public C78539a(WeakReference weakReference) {
            this.f230024d = weakReference;
        }

        public void run() {
            MMActivity mMActivity = (MMActivity) this.f230024d.get();
            if (mMActivity != null && !mMActivity.isFinishing() && !mMActivity.isDestroyed()) {
                mMActivity.getWindow().getDecorView().setSystemUiVisibility(mMActivity.getWindow().getDecorView().getSystemUiVisibility() | 256);
                int c = C76860a.m92657c(mMActivity);
                Log.m105925i("MicroMsg.FullScreenHelper", "setFullScreenAfterSetContentView to bodyView, height: %d, %d", Integer.valueOf(c), Integer.valueOf(C76577a.m92151b(mMActivity, 2)));
                mMActivity.getBodyView().setPadding(0, c - C76577a.m92151b(mMActivity, 2), 0, 0);
            }
        }
    }

    /* renamed from: wc3.u$b */
    public class C78540b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MMFragmentActivity f230025d;

        /* renamed from: e */
        public final /* synthetic */ View f230026e;

        public C78540b(MMFragmentActivity mMFragmentActivity, View view) {
            this.f230025d = mMFragmentActivity;
            this.f230026e = view;
        }

        public void run() {
            this.f230025d.getWindow().getDecorView().setSystemUiVisibility(this.f230025d.getWindow().getDecorView().getSystemUiVisibility() | 256);
            int c = C76860a.m92657c(this.f230025d);
            Log.m105925i("MicroMsg.FullScreenHelper", "setFullScreenAfterSetContentView to contentView, height: %s", Integer.valueOf(c));
            View view = this.f230026e;
            if (view != null) {
                view.setPadding(0, c, 0, 0);
            }
        }
    }

    /* renamed from: a */
    public static int m94865a(Context context) {
        TypedValue typedValue = new TypedValue();
        int complexToDimensionPixelSize = context.getTheme().resolveAttribute(C0966R.attr.f2625a0, typedValue, true) ? TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()) : 0;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return complexToDimensionPixelSize <= 0 ? displayMetrics.widthPixels > displayMetrics.heightPixels ? context.getResources().getDimensionPixelSize(C0966R.dimen.f3678b8) : context.getResources().getDimensionPixelSize(C0966R.dimen.f3679b9) : complexToDimensionPixelSize;
    }

    /* renamed from: b */
    public static int m94866b(Context context) {
        int titleLocation = context instanceof MMActivity ? ((MMActivity) context).getTitleLocation() : 0;
        return titleLocation <= 0 ? context.getResources().getDimensionPixelSize(C0966R.dimen.f3679b9) : titleLocation;
    }

    /* renamed from: c */
    public static void m94867c(AppCompatActivity appCompatActivity, View view, int i) {
        if (appCompatActivity != null && appCompatActivity.getWindow() != null && appCompatActivity.getWindow().getDecorView() != null) {
            appCompatActivity.getWindow().getDecorView().post(new C53149c(appCompatActivity, i, view));
        }
    }

    /* renamed from: d */
    public static void m94868d(MMActivity mMActivity) {
        mMActivity.getWindow().getDecorView().post(new C78539a(new WeakReference(mMActivity)));
    }

    /* renamed from: e */
    public static void m94869e(MMFragmentActivity mMFragmentActivity, View view) {
        if (mMFragmentActivity != null && mMFragmentActivity.getWindow() != null && mMFragmentActivity.getWindow().getDecorView() != null) {
            mMFragmentActivity.getWindow().getDecorView().post(new C78540b(mMFragmentActivity, view));
        }
    }

    /* renamed from: f */
    public static void m94870f(Activity activity) {
        if (activity instanceof AppCompatActivity) {
            ((AppCompatActivity) activity).supportRequestWindowFeature(109);
        } else {
            activity.requestWindowFeature(9);
        }
    }
}
