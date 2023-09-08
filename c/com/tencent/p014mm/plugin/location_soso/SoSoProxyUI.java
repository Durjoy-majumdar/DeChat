package com.tencent.p014mm.plugin.location_soso;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import bh3.C113177k;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tencentmap.mapsdk.map.MapActivity;
import di3.C86312j;
import nj3.C76879j;
import nj3.C88989a;
import p447aw.C103918d;
import y22.C118910b;
import y22.C118912d;

@C88989a(19)
/* renamed from: com.tencent.mm.plugin.location_soso.SoSoProxyUI */
public class SoSoProxyUI extends MapActivity implements C113177k.C113180d {
    public static final String TAG = "MicroMsg.SoSoProxyUI";
    private C118910b basemapUI;

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.basemapUI.mo129355a(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.basemapUI.mo129376b(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public Resources getResources() {
        return (getAssets() == null || MMApplicationContext.getResources() == null) ? super.getResources() : MMApplicationContext.getResources();
    }

    public Object getSystemService(String str) {
        Object systemService = super.getSystemService(str);
        return (getAssets() == null || !"layout_inflater".equals(str)) ? systemService : C85868k2.m106138c((LayoutInflater) systemService);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.basemapUI.mo129377c(i, i2, intent);
    }

    public void onBackPressed() {
        this.basemapUI.mo129356d();
    }

    public void onBusinessPermissionDenied(String str) {
        C118910b bVar = this.basemapUI;
        if (bVar instanceof C113177k.C113180d) {
            ((C113177k.C113180d) bVar).onBusinessPermissionDenied(str);
        }
    }

    public void onBusinessPermissionGranted(String str) {
        C118910b bVar = this.basemapUI;
        if (bVar instanceof C113177k.C113180d) {
            ((C113177k.C113180d) bVar).onBusinessPermissionGranted(str);
        }
    }

    public void onCreate(Bundle bundle) {
        Class cls = C118912d.class;
        Log.m105924i(TAG, "SoSoProxyUI onCreate");
        int intExtra = getIntent().getIntExtra("intent_map_key", -1);
        if (intExtra == 2) {
            requestWindowFeature(1);
        }
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        if (((C118912d) C86312j.m106911c(cls)) == null) {
            try {
                Object[] objArr = new Object[4];
                objArr[0] = Boolean.valueOf(CrashReportFactory.foreground);
                objArr[1] = Boolean.valueOf(bundle != null);
                objArr[2] = getClass().getSimpleName();
                objArr[3] = Integer.valueOf(hashCode());
                Log.m105921e(TAG, "summerasyncinit not init activity foreground[%b] savedInstanceState[%b], activity[%s, %d]", objArr);
                finish();
            } catch (Throwable th) {
                Log.printErrStackTrace(TAG, th, "summerasyncinit finish:", new Object[0]);
            }
            C115669n.INSTANCE.idkeyStat(598, 20, 1, false);
            return;
        }
        C118910b F90 = ((C118912d) C86312j.m106911c(cls)).F90(this, intExtra);
        this.basemapUI = F90;
        if (F90 == null) {
            finish();
        } else {
            F90.mo129378e(bundle);
        }
    }

    public void onDestroy() {
        C118910b bVar = this.basemapUI;
        if (bVar != null) {
            bVar.mo129379f();
        }
        super.onDestroy();
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 82 || keyEvent.getAction() != 1) {
            return super.onKeyUp(i, keyEvent);
        }
        this.basemapUI.mo129380g(i, keyEvent);
        return true;
    }

    public void onPause() {
        super.onPause();
        this.basemapUI.mo129381h();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i(TAG, "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i(TAG, "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i == 80 && iArr[0] != 0) {
            C76879j.m92709C(this, getString(C0966R.string.f361130hi2), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.auj), false, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                    ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(SoSoProxyUI.this);
                }
            }, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            });
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onResume() {
        super.onResume();
        this.basemapUI.mo129382i();
    }

    public void setContentView(View view) {
        super.setContentView(view);
        Log.m105919d(TAG, "setContentView1 %s", Util.getStack());
    }

    public void setContentView(int i) {
        super.setContentView(i);
        Log.m105919d(TAG, "setContentView2 %s", Util.getStack());
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        Log.m105919d(TAG, "setContentView3 %s", Util.getStack());
    }
}
