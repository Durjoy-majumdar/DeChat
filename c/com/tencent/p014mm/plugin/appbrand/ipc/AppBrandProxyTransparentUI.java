package com.tencent.p014mm.plugin.appbrand.ipc;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C88989a;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUI */
public class AppBrandProxyTransparentUI extends MMActivity {

    /* renamed from: com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUI$a */
    public class C115242a implements AppBrandProxyTransparentUIProcessTask.C17865c {

        /* renamed from: a */
        public final /* synthetic */ AppBrandProxyTransparentUIProcessTask f345339a;

        /* renamed from: b */
        public final /* synthetic */ String f345340b;

        public C115242a(AppBrandProxyTransparentUIProcessTask appBrandProxyTransparentUIProcessTask, String str) {
            this.f345339a = appBrandProxyTransparentUIProcessTask;
            this.f345340b = str;
        }

        /* renamed from: a */
        public void mo175005a() {
            Log.m105924i("MicroMsg.AppBrandProxyTransparentUI", "onResult");
            Intent intent = new Intent();
            intent.putExtra("task_object", this.f345339a);
            intent.putExtra("task_id", this.f345340b);
            AppBrandProxyTransparentUI.this.setResult(-1, intent);
            AppBrandProxyTransparentUI.this.finish();
        }
    }

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.AppBrandProxyTransparentUI", "onCreate");
        C85875k4.m106177d0(getWindow());
        try {
            getIntent().getExtras().setClassLoader(Class.forName(getIntent().getStringExtra("task_class_name")).getClassLoader());
        } catch (ClassNotFoundException unused) {
            Log.m105920e("MicroMsg.AppBrandProxyTransparentUI", "ClassNotFoundException");
            setResult(1);
            finish();
        }
        AppBrandProxyTransparentUIProcessTask appBrandProxyTransparentUIProcessTask = (AppBrandProxyTransparentUIProcessTask) getIntent().getParcelableExtra("task_object");
        String stringExtra = getIntent().getStringExtra("task_id");
        if (appBrandProxyTransparentUIProcessTask != null) {
            appBrandProxyTransparentUIProcessTask.mo1571d(this, new C115242a(appBrandProxyTransparentUIProcessTask, stringExtra));
            return;
        }
        setResult(1);
        finish();
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i("MicroMsg.AppBrandProxyTransparentUI", "onDestroy");
    }

    public void setMMOrientation() {
        int intExtra = getIntent().getIntExtra("orientation", -1);
        if (intExtra != -1) {
            setRequestedOrientation(intExtra);
        }
    }
}
