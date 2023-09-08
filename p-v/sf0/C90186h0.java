package sf0;

import android.app.Activity;
import android.content.SharedPreferences;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import kj2.C117407d;
import nj3.C76879j;
import p156gj.C87203t;
import p286zl.C39374m;
import p447aw.C103918d;

@Deprecated
/* renamed from: sf0.h0 */
public class C90186h0 implements C39374m {

    /* renamed from: a */
    public Runnable f258906a;

    /* renamed from: a */
    public void mo124429a(Activity activity, Runnable runnable) {
        boolean z = true;
        if (!MultiProcessMMKV.getDefault().getBoolean("had_show_permission_guild", true) && !((C103918d) C86312j.m106911c(C103918d.class)).Gd0(activity, "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_PHONE_STATE")) {
            C76879j.m92739j(activity, C0966R.string.hhy, C0966R.string.hif, C0966R.string.hhz, C0966R.string.f7926wf, new C90184f0(this, activity, runnable), new C90185g0(this));
            z = false;
        }
        if (z) {
            runnable.run();
        }
    }

    /* renamed from: b */
    public final void mo124430b(Activity activity, Runnable runnable) {
        boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(activity, "android.permission.READ_PHONE_STATE", 96, "", "");
        Log.m105925i("MicroMsg.PermissionCheckHelper", "check init, summerper checkPermission checkPhone[%b]", Boolean.valueOf(z1));
        if (!z1) {
            C117407d.INSTANCE.idkeyStat(462, 20, 1, true);
            this.f258906a = runnable;
            return;
        }
        C87203t.f252877b.mo121645a();
        C87203t.f252878c.mo121645a();
        C87203t.f252885j.mo121645a();
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: c */
    public boolean mo124431c(Activity activity, int i, String[] strArr, int[] iArr) {
        Activity activity2 = activity;
        int i2 = i;
        int[] iArr2 = iArr;
        if (iArr2 == null || iArr2.length <= 0) {
            Object[] objArr = new Object[4];
            objArr[0] = Integer.valueOf(iArr2 == null ? -1 : iArr2.length);
            objArr[1] = Integer.valueOf(i);
            objArr[2] = strArr;
            objArr[3] = Util.getStack();
            Log.m105929w("MicroMsg.PermissionCheckHelper", "onRequestPermissionsResult, grantResults length is:%d requestCode:%d, permissions:%s, stack:%s", objArr);
            return true;
        }
        Log.m105925i("MicroMsg.PermissionCheckHelper", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr2[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i2 != 32 && i2 != 96) {
            return false;
        }
        if (iArr2[0] != 0) {
            SharedPreferences sharedPreferences = activity2.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0);
            sharedPreferences.edit().putBoolean(i2 == 32 ? "SP_PERMISSION_HAD_REQUEST_PERMISSION_STORAGE_1" : "SP_PERMISSION_HAD_REQUEST_PERMISSION_PHONE", true).apply();
            sharedPreferences.edit().putInt("SP_PERMISSION_HAD_REQUEST_PERMISSION_UID", MMApplicationContext.getContext().getApplicationInfo().uid).apply();
        } else if (i2 == 32) {
            C117407d.INSTANCE.idkeyStat(462, 19, 1, true);
        } else if (i2 == 96) {
            C117407d.INSTANCE.idkeyStat(462, 21, 1, true);
            C87203t.f252877b.mo121645a();
            C87203t.f252878c.mo121645a();
            C87203t.f252885j.mo121645a();
        }
        if (i2 == 32) {
            mo124430b(activity2, this.f258906a);
        } else {
            Runnable runnable = this.f258906a;
            if (runnable != null) {
                runnable.run();
            }
        }
        return true;
    }
}
