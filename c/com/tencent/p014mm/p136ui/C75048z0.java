package com.tencent.p014mm.p136ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Environment;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import kj2.C117407d;
import nj3.C76879j;
import p156gj.C87203t;
import p447aw.C103918d;

/* renamed from: com.tencent.mm.ui.z0 */
public class C75048z0 {

    /* renamed from: a */
    public boolean f220803a = Environment.getExternalStorageDirectory().getAbsolutePath().toLowerCase().contains("appclone");

    /* renamed from: com.tencent.mm.ui.z0$a */
    public class C75049a implements Runnable {
        public C75049a() {
        }

        public void run() {
            C75048z0.this.getClass();
        }

        public String toString() {
            return super.toString() + "|onInitDelay";
        }
    }

    /* renamed from: com.tencent.mm.ui.z0$b */
    public class C75050b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f220805d;

        /* renamed from: e */
        public final /* synthetic */ Activity f220806e;

        public C75050b(C75048z0 z0Var, int i, Activity activity) {
            this.f220805d = i;
            this.f220806e = activity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = this.f220805d;
            if (i2 == 32) {
                C117407d.INSTANCE.idkeyStat(462, 3, 1, true);
            } else if (i2 == 96) {
                C117407d.INSTANCE.idkeyStat(462, 4, 1, true);
            } else {
                C117407d.INSTANCE.idkeyStat(462, 5, 1, true);
            }
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(this.f220806e);
            dialogInterface.dismiss();
            this.f220806e.finish();
        }
    }

    /* renamed from: com.tencent.mm.ui.z0$c */
    public class C75051c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f220807d;

        /* renamed from: e */
        public final /* synthetic */ Activity f220808e;

        public C75051c(C75048z0 z0Var, int i, Activity activity) {
            this.f220807d = i;
            this.f220808e = activity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = this.f220807d;
            if (i2 == 32) {
                C117407d.INSTANCE.idkeyStat(462, 6, 1, true);
            } else if (i2 == 96) {
                C117407d.INSTANCE.idkeyStat(462, 7, 1, true);
            } else {
                C117407d.INSTANCE.idkeyStat(462, 8, 1, true);
            }
            dialogInterface.dismiss();
            this.f220808e.finish();
        }
    }

    /* renamed from: com.tencent.mm.ui.z0$d */
    public class C75052d implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f220809d;

        /* renamed from: e */
        public final /* synthetic */ Activity f220810e;

        public C75052d(C75048z0 z0Var, int i, Activity activity) {
            this.f220809d = i;
            this.f220810e = activity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = this.f220809d;
            if (i2 == 33) {
                C117407d.INSTANCE.idkeyStat(462, 12, 1, true);
            } else if (i2 == 97) {
                C117407d.INSTANCE.idkeyStat(462, 13, 1, true);
            } else {
                C117407d.INSTANCE.idkeyStat(462, 14, 1, true);
            }
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(this.f220810e);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.ui.z0$e */
    public class C75053e implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f220811d;

        public C75053e(C75048z0 z0Var, int i) {
            this.f220811d = i;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = this.f220811d;
            if (i2 == 33) {
                C117407d.INSTANCE.idkeyStat(462, 15, 1, true);
            } else if (i2 == 97) {
                C117407d.INSTANCE.idkeyStat(462, 16, 1, true);
            } else {
                C117407d.INSTANCE.idkeyStat(462, 17, 1, true);
            }
            dialogInterface.dismiss();
        }
    }

    /* renamed from: a */
    public boolean mo104635a(Activity activity, int i, String[] strArr, int[] iArr) {
        Activity activity2 = activity;
        int i2 = i;
        int[] iArr2 = iArr;
        if (iArr2 == null || iArr2.length <= 0) {
            Object[] objArr = new Object[4];
            objArr[0] = Integer.valueOf(iArr2 == null ? -1 : iArr2.length);
            objArr[1] = Integer.valueOf(i);
            objArr[2] = strArr;
            objArr[3] = Util.getStack();
            Log.m105929w("MicroMsg.LauncherUI.LauncherUICheckPermissionHelper", "onRequestPermissionsResult, grantResults length is:%d requestCode:%d, permissions:%s, stack:%s", objArr);
            MMHandlerThread.postToMainThreadDelayed(new C75049a(), 500);
            return true;
        }
        Log.m105925i("MicroMsg.LauncherUI.LauncherUICheckPermissionHelper", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr2[0]), Long.valueOf(Thread.currentThread().getId()));
        int i3 = C0966R.string.hid;
        if (i2 != 32) {
            if (i2 != 33) {
                if (i2 != 64) {
                    if (i2 != 70) {
                        if (i2 != 96) {
                            if (i2 != 97) {
                                return false;
                            }
                        }
                    }
                }
            }
            if (i2 == 97) {
                i3 = C0966R.string.f361131hi3;
            } else if (i2 == 70) {
                i3 = C0966R.string.f361129hi0;
            }
            if (iArr2[0] != 0) {
                this.f220803a = false;
                C76879j.m92709C(activity, activity2.getString(i3), activity2.getString(C0966R.string.hif), activity2.getString(C0966R.string.fyd), activity2.getString(C0966R.string.auj), false, new C75052d(this, i2, activity2), new C75053e(this, i2));
            } else if (i2 == 33) {
                C117407d.INSTANCE.idkeyStat(462, 9, 1, true);
            } else if (i2 == 97) {
                C117407d.INSTANCE.idkeyStat(462, 10, 1, true);
            } else {
                C117407d.INSTANCE.idkeyStat(462, 11, 1, true);
            }
            return true;
        }
        int i4 = i2 == 96 ? C0966R.string.f361131hi3 : i2 == 64 ? C0966R.string.f361129hi0 : C0966R.string.hid;
        if (iArr2[0] != 0) {
            C76879j.m92709C(activity, activity2.getString(i4), activity2.getString(C0966R.string.hif), activity2.getString(C0966R.string.fyd), activity2.getString(C0966R.string.auj), false, new C75050b(this, i2, activity2), new C75051c(this, i2, activity2));
        } else if (i2 == 32) {
            C117407d.INSTANCE.idkeyStat(462, 0, 1, true);
        } else if (i2 == 96) {
            C117407d.INSTANCE.idkeyStat(462, 1, 1, true);
            C87203t.f252877b.mo121645a();
            C87203t.f252878c.mo121645a();
            C87203t.f252885j.mo121645a();
        } else {
            C117407d.INSTANCE.idkeyStat(462, 2, 1, true);
        }
        return true;
    }
}
