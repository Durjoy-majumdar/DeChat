package com.tencent.p014mm.plugin.flash.permission;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.facedetect.model.C85191v;
import com.tencent.p014mm.plugin.facedetectaction.p046ui.FaceActionUI;
import com.tencent.p014mm.plugin.flash.FaceFlashUI;
import com.tencent.p014mm.plugin.flash.action.C4380m;
import com.tencent.p014mm.plugin.flash.action.FaceFlashActionUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import h81.C32735h;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import nj3.C88989a;
import p182kk.C61104a;
import p447aw.C103918d;
import qo3.C77398g;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.flash.permission.FaceFlashPermissionUI */
public class FaceFlashPermissionUI extends MMActivity {

    /* renamed from: i */
    public static final /* synthetic */ int f19047i = 0;

    /* renamed from: d */
    public C77398g f19048d;

    /* renamed from: e */
    public boolean f19049e = false;

    /* renamed from: f */
    public boolean f19050f = false;

    /* renamed from: g */
    public boolean f19051g = false;

    /* renamed from: h */
    public boolean f19052h = false;

    /* renamed from: com.tencent.mm.plugin.flash.permission.FaceFlashPermissionUI$a */
    public class C4398a implements DialogInterface.OnClickListener {
        public C4398a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105925i("MicroMsg.FaceFlashManagerPermission", "[%s]Dialog audio click setting", Integer.valueOf(hashCode()));
            dialogInterface.dismiss();
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(FaceFlashPermissionUI.this.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.flash.permission.FaceFlashPermissionUI$b */
    public class C4399b implements DialogInterface.OnClickListener {
        public C4399b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            Log.m105925i("MicroMsg.FaceFlashManagerPermission", "[%s]Dialog audio click cancel", Integer.valueOf(hashCode()));
            FaceFlashPermissionUI faceFlashPermissionUI = FaceFlashPermissionUI.this;
            int i2 = FaceFlashPermissionUI.f19047i;
            faceFlashPermissionUI.setResult(1, faceFlashPermissionUI.mo5313J7(4, 90008, "fail"));
            FaceFlashPermissionUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.flash.permission.FaceFlashPermissionUI$c */
    public class C4400c implements DialogInterface.OnClickListener {
        public C4400c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105925i("MicroMsg.FaceFlashManagerPermission", "[%s]Dialog audio click setting ", Integer.valueOf(hashCode()));
            dialogInterface.dismiss();
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(FaceFlashPermissionUI.this.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.flash.permission.FaceFlashPermissionUI$d */
    public class C4401d implements DialogInterface.OnClickListener {
        public C4401d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            Log.m105925i("MicroMsg.FaceFlashManagerPermission", "[%s]Dialog audio click cancel", Integer.valueOf(hashCode()));
            FaceFlashPermissionUI faceFlashPermissionUI = FaceFlashPermissionUI.this;
            int i2 = FaceFlashPermissionUI.f19047i;
            faceFlashPermissionUI.setResult(1, faceFlashPermissionUI.mo5313J7(4, 90009, "fail"));
            FaceFlashPermissionUI.this.finish();
        }
    }

    /* renamed from: I7 */
    public static void m4573I7(Context context, Bundle bundle, int i) {
        Intent intent = new Intent(context, FaceFlashPermissionUI.class);
        intent.putExtras(bundle);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        aVar.mo10233c(intent);
        C117292a.m165364j((Activity) context, aVar.mo10232b(), "com/tencent/mm/plugin/flash/permission/FaceFlashPermissionUI", "jumpToActivity", "(Landroid/content/Context;Landroid/os/Bundle;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    /* renamed from: H7 */
    public final void mo5312H7() {
        boolean z;
        Log.m105925i("MicroMsg.FaceFlashManagerPermission", "[%d]gotoFaceFlashUI() hasStarted:%b", Integer.valueOf(hashCode()), Boolean.valueOf(this.f19050f));
        if (!this.f19050f) {
            if (!C85191v.m105062a(this)) {
                Log.m105924i("MicroMsg.FaceFlashManagerPermission", "no camera permission. check permission");
                return;
            }
            Log.m105924i("MicroMsg.FaceFlashManagerPermission", "check permission all success");
            boolean booleanExtra = getIntent().getBooleanExtra("face_permission_location_check", false);
            Log.m105925i("MicroMsg.FaceFlashManagerPermission", "needCheckLocation: [%s]，hasCheckLocation：[%s]", Boolean.valueOf(booleanExtra), Boolean.valueOf(this.f19051g));
            if (!booleanExtra || this.f19051g) {
                Log.m105924i("MicroMsg.FaceFlashManagerPermission", "do not needCheckLocation");
                z = false;
            } else {
                boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(this, "android.permission.ACCESS_FINE_LOCATION", 64, "", "");
                Log.m105925i("MicroMsg.FaceFlashManagerPermission", "locationPermission: [%s] ", Boolean.valueOf(z1));
                z = !z1;
            }
            if (!z) {
                boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_use_flash_action, false);
                boolean z2 = getIntent().getExtras().getBoolean("face_permission_check", false);
                Log.m105925i("MicroMsg.FaceFlashManagerPermission", "use new face action  %b openPlatformFlashPage:%b", Boolean.valueOf(wf), Boolean.valueOf(z2));
                if (z2) {
                    FaceFlashUI.m4535L7(this, getIntent().getExtras(), 1);
                } else if (wf) {
                    Bundle extras = getIntent().getExtras();
                    C4380m mVar = new C4380m(this);
                    if (!C61104a.m71652h(this, true, mVar) && !C61104a.m71670z(this, mVar) && !C61104a.m71666v(this, mVar) && !C61104a.m71650f(this, mVar) && !C61104a.m71655k(this, mVar)) {
                        Intent intent = new Intent(this, FaceFlashActionUI.class);
                        if (extras != null) {
                            intent.putExtras(extras);
                        }
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(1);
                        aVar.mo10233c(intent);
                        C117292a.m165364j(this, aVar.mo10232b(), "com/tencent/mm/plugin/flash/action/FaceFlashActionUI", "jumpToFaceFlashUI", "(Landroid/app/Activity;Landroid/os/Bundle;I)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                    }
                } else {
                    Intent intent2 = new Intent(this, FaceActionUI.class);
                    Bundle extras2 = getIntent().getExtras();
                    if (extras2 != null) {
                        intent2.putExtras(extras2);
                    }
                    startActivityForResult(intent2, 1);
                }
                this.f19050f = true;
            }
        }
    }

    /* renamed from: J7 */
    public final Intent mo5313J7(int i, int i2, String str) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putInt("err_type", i);
        bundle.putInt("err_code", i2);
        bundle.putString("err_msg", str);
        Log.m105925i("MicroMsg.FaceFlashManagerPermission", "face result errorType:%s errorCode:%s errorMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
        intent.putExtras(bundle);
        return intent;
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return -1;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105925i("MicroMsg.FaceFlashManagerPermission", "[%d]onActivityResult()", Integer.valueOf(hashCode()));
        super.onActivityResult(i, i2, intent);
        setResult(i2, intent);
        finish();
    }

    public void onCreate(Bundle bundle) {
        Log.m105925i("MicroMsg.FaceFlashManagerPermission", "[%d]onCreate()", Integer.valueOf(hashCode()));
        super.onCreate(bundle);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Log.m105925i("MicroMsg.FaceFlashManagerPermission", "[%d]onRequestPermissionsResult:%s", Integer.valueOf(hashCode()), Integer.valueOf(i));
        if (iArr == null || iArr.length <= 0) {
            Log.m105924i("MicroMsg.FaceFlashManagerPermission", "dont have any permission");
            setResult(1, mo5313J7(4, 90010, "fail"));
            finish();
        } else if (i != 16) {
            if (i != 18) {
                if (i == 64) {
                    if (iArr[0] == 0) {
                        Log.m105924i("MicroMsg.FaceFlashManagerPermission", "get location granted");
                    } else {
                        Log.m105924i("MicroMsg.FaceFlashManagerPermission", "do not get location granted");
                    }
                    this.f19051g = true;
                    mo5312H7();
                    return;
                } else if (i != 80) {
                    return;
                }
            }
            if (iArr[0] == 0) {
                this.f19049e = true;
                mo5312H7();
                return;
            }
            this.f19049e = false;
            this.f19048d = C76879j.m92709C(this, getString(C0966R.string.ck7), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.f7926wf), false, new C4400c(), new C4401d());
        } else if (iArr[0] == 0) {
            this.f19049e = true;
            mo5312H7();
        } else {
            this.f19049e = false;
            this.f19048d = C76879j.m92709C(this, getString(C0966R.string.ck6), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.f7926wf), false, new C4398a(), new C4399b());
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        Log.m105925i("MicroMsg.FaceFlashManagerPermission", "[%d]onRestoreInstanceState()", Integer.valueOf(hashCode()));
        this.f19052h = true;
        super.onRestoreInstanceState(bundle);
    }

    public void onResume() {
        super.onResume();
        Log.m105925i("MicroMsg.FaceFlashManagerPermission", "[%d]onResume()  restore:%b checkPermissionSuccess:%b", Integer.valueOf(hashCode()), Boolean.valueOf(this.f19052h), Boolean.valueOf(this.f19049e));
        if (!this.f19049e && !this.f19052h) {
            C77398g gVar = this.f19048d;
            if (gVar == null || !gVar.isShowing()) {
                Log.m105924i("MicroMsg.FaceFlashManagerPermission", "onResume goFaceFlash");
                mo5312H7();
            }
        }
    }
}
