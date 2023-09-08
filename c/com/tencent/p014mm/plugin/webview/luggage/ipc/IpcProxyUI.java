package com.tencent.p014mm.plugin.webview.luggage.ipc;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C80938z;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C88989a;
import p206nj.C11171e;
import y83.C53505a;
import y83.C53508d;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.webview.luggage.ipc.IpcProxyUI */
public class IpcProxyUI extends MMActivity {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.ipc.IpcProxyUI$a */
    public class C43598a implements C53505a {
        public C43598a() {
        }

        /* renamed from: a */
        public void mo41060a(Bundle bundle) {
            Intent intent = new Intent();
            intent.putExtra("input_data", bundle);
            intent.putExtra("event_type", true);
            IpcProxyUI.this.setResult(-1, intent);
            IpcProxyUI.this.finish();
        }

        public void onCallback(Bundle bundle) {
            Intent intent = new Intent();
            intent.putExtra("input_data", bundle);
            IpcProxyUI.this.setResult(-1, intent);
            IpcProxyUI.this.finish();
        }
    }

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.IpcProxyUI", "onCreate");
        if (C11171e.m11046c(21)) {
            getWindow().setStatusBarColor(0);
        }
        C53508d dVar = (C53508d) C80938z.m98814b(getIntent().getStringExtra("task_class_name"), C53508d.class);
        if (dVar != null) {
            dVar.mo41063a(this, getIntent().getBundleExtra("input_data"), new C43598a());
            return;
        }
        setResult(-1, new Intent());
        finish();
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i("MicroMsg.IpcProxyUI", "onDestroy");
    }

    public void setMMOrientation() {
        int intExtra = getIntent().getIntExtra("orientation", -1);
        if (intExtra != -1) {
            setRequestedOrientation(intExtra);
        }
    }
}
