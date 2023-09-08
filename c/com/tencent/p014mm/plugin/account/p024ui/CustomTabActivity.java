package com.tencent.p014mm.plugin.account.p024ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.tencent.p014mm.hellhoundlib.activities.HellActivity;
import com.tencent.p014mm.p136ui.mmfb.sdk.C116102h;
import com.tencent.p014mm.sdk.platformtools.Log;
import p1208q3.C118144a;

/* renamed from: com.tencent.mm.plugin.account.ui.CustomTabActivity */
public class CustomTabActivity extends HellActivity {

    /* renamed from: e */
    public static final String f344447e = C116102h.f348435m;

    /* renamed from: f */
    public static final String f344448f = "CustomTabActivity.action_destroy";

    /* renamed from: d */
    public BroadcastReceiver f344449d;

    /* renamed from: com.tencent.mm.plugin.account.ui.CustomTabActivity$a */
    public class C114914a extends BroadcastReceiver {
        public C114914a() {
        }

        public void onReceive(Context context, Intent intent) {
            Intent intent2 = new Intent(C116102h.f348435m);
            intent2.putExtra(C116102h.f348429g, CustomTabActivity.this.getIntent().getDataString());
            C118144a.m166672a(CustomTabActivity.this).mo182944c(intent2);
            CustomTabActivity.this.finish();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Log.m105924i("MicroMsg.fb.CustomTabActivity", "CustomTabActivity, onActivityResult， resultCode = " + i2);
        if (i2 == 0) {
            Intent intent2 = new Intent(f344447e);
            intent2.putExtra(C116102h.f348429g, getIntent().getDataString());
            C118144a.m166672a(this).mo182944c(intent2);
            this.f344449d = new C114914a();
            C118144a.m166672a(this).mo182943b(this.f344449d, new IntentFilter(f344448f));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, CustomTabMainActivity.class);
        intent.setAction(f344447e);
        intent.putExtra(C116102h.f348429g, getIntent().getDataString());
        startActivityForResult(intent, 2);
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.fb.CustomTabActivity", "CustomTabActivity, onDestroy.");
        C118144a.m166672a(this).mo182945d(this.f344449d);
        super.onDestroy();
    }
}
