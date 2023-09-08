package p918s2;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import j20.C117292a;
import java.util.Arrays;
import k20.C60958c;
import k20.C9556a;
import p385u2.C111105a;

/* renamed from: s2.a */
public class C90111a extends C111105a {

    /* renamed from: c */
    public static final /* synthetic */ int f258766c = 0;

    /* renamed from: s2.a$a */
    public class C90112a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String[] f258767d;

        /* renamed from: e */
        public final /* synthetic */ Activity f258768e;

        /* renamed from: f */
        public final /* synthetic */ int f258769f;

        public C90112a(String[] strArr, Activity activity, int i) {
            this.f258767d = strArr;
            this.f258768e = activity;
            this.f258769f = i;
        }

        public void run() {
            int[] iArr = new int[this.f258767d.length];
            PackageManager packageManager = this.f258768e.getPackageManager();
            String packageName = this.f258768e.getPackageName();
            int length = this.f258767d.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.f258767d[i], packageName);
            }
            ((C90113b) this.f258768e).onRequestPermissionsResult(this.f258769f, this.f258767d, iArr);
        }
    }

    /* renamed from: s2.a$b */
    public interface C90113b {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* renamed from: s2.a$c */
    public interface C90114c {
        void validateRequestPermissionsRequestCode(int i);
    }

    /* renamed from: e */
    public static void m112741e(Activity activity, String[] strArr, int i) {
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            if (!TextUtils.isEmpty(strArr[i2])) {
                i2++;
            } else {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof C90114c) {
                ((C90114c) activity).validateRequestPermissionsRequestCode(i);
            }
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            aVar.mo10233c(strArr);
            C117292a.m165358d(activity, aVar.mo10232b(), "androidx/core/app/ActivityCompat", "requestPermissions", "(Landroid/app/Activity;[Ljava/lang/String;I)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
            activity.requestPermissions((String[]) aVar.mo10231a(0), ((Integer) aVar.mo10231a(1)).intValue());
            C117292a.m165359e(activity, "androidx/core/app/ActivityCompat", "requestPermissions", "(Landroid/app/Activity;[Ljava/lang/String;I)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
        } else if (activity instanceof C90113b) {
            new Handler(Looper.getMainLooper()).post(new C90112a(strArr, activity, i));
        }
    }

    /* renamed from: f */
    public static boolean m112742f(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }
}
