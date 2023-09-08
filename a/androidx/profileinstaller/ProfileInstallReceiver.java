package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import androidx.profileinstaller.C113021b;
import java.io.File;
import p1062x3.e$$a;

public class ProfileInstallReceiver extends BroadcastReceiver {

    /* renamed from: androidx.profileinstaller.ProfileInstallReceiver$a */
    public class C113019a implements C113021b.C113023b {
        public C113019a() {
        }

        /* renamed from: a */
        public void mo165382a(int i, Object obj) {
            if (i == 6 || i == 7 || i == 8) {
                Throwable th = (Throwable) obj;
            }
            ProfileInstallReceiver.this.setResultCode(i);
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
                C113021b.m154639b(context, new e$$a(), new C113019a(), true);
            } else if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
                String string = intent.getExtras().getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    try {
                        C113021b.m154638a(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                        setResultCode(10);
                    } catch (PackageManager.NameNotFoundException unused) {
                        setResultCode(7);
                    }
                } else if ("DELETE_SKIP_FILE".equals(string)) {
                    new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                    setResultCode(11);
                }
            }
        }
    }
}
