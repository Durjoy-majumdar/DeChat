package p1061wj;

import a70.C79471a;
import android.os.ParcelFileDescriptor;
import com.tencent.nativecrash.NativeCrash;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;

/* renamed from: wj.a */
public class C91004a implements NativeCrash.CrashCallback {

    /* renamed from: a */
    public static ParcelFileDescriptor f261102a;

    /* renamed from: wj.a$b */
    public static class C91006b {

        /* renamed from: a */
        public static final /* synthetic */ int f261103a = 0;

        static {
            new C91004a((C91005a) null);
        }
    }

    public C91004a(C91005a aVar) {
        NativeCrash.init(new ParcelFileDescriptor[]{f261102a}, 1871, 0);
        NativeCrash.resetCustomInfo();
        NativeCrash.customInfo("Client Version: " + BuildInfo.CLIENT_VERSION);
        NativeCrash.customInfo("Base Version: " + C79471a.f233015c);
        NativeCrash.crashCallback(this);
    }

    public boolean onCrashDumped(int i, String str, String str2) {
        return false;
    }
}
