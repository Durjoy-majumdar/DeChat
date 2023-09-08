package com.tencent.p014mm.plugin.account.p024ui;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import com.tencent.p014mm.hellhoundlib.activities.HellActivity;
import com.tencent.p014mm.p136ui.mmfb.sdk.C116102h;
import com.tencent.p014mm.p136ui.mmfb.sdk.C45033o;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C9556a;
import p1208q3.C118144a;
import p213oh.C11412b;
import p385u2.C111105a;

/* renamed from: com.tencent.mm.plugin.account.ui.CustomTabMainActivity */
public class CustomTabMainActivity extends HellActivity {

    /* renamed from: d */
    public boolean f344451d = true;

    /* renamed from: e */
    public BroadcastReceiver f344452e;

    /* renamed from: com.tencent.mm.plugin.account.ui.CustomTabMainActivity$a */
    public class C114915a extends BroadcastReceiver {
        public C114915a() {
        }

        public void onReceive(Context context, Intent intent) {
            Intent intent2 = new Intent(CustomTabMainActivity.this, CustomTabMainActivity.class);
            intent2.setAction(C116102h.f348433k);
            String str = C116102h.f348429g;
            intent2.putExtra(str, intent.getStringExtra(str));
            intent2.addFlags(603979776);
            CustomTabMainActivity customTabMainActivity = CustomTabMainActivity.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent2);
            CustomTabMainActivity customTabMainActivity2 = customTabMainActivity;
            C117292a.m165358d(customTabMainActivity2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/CustomTabMainActivity$1", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            customTabMainActivity.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(customTabMainActivity2, "com/tencent/mm/plugin/account/ui/CustomTabMainActivity$1", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: E7 */
    public final void mo174603E7(int i, Intent intent) {
        Bundle bundle;
        int i2 = C11412b.f33577a;
        Log.m105925i("MicroMsg.fb.CustomTabMainActivity", "sendResult = " + intent, (Object[]) null);
        C118144a.m166672a(this).mo182945d(this.f344452e);
        if (intent != null) {
            String stringExtra = intent.getStringExtra(C116102h.f348429g);
            Log.m105925i("MicroMsg.fb.CustomTabMainActivity", "sendResult, responseURL = " + stringExtra, (Object[]) null);
            if (stringExtra != null) {
                Uri parse = Uri.parse(stringExtra);
                bundle = C116102h.m163385e(parse.getQuery());
                bundle.putAll(C116102h.m163385e(parse.getFragment()));
            } else {
                bundle = new Bundle();
            }
            Intent a = C45033o.m49877a(getIntent(), bundle, (RuntimeException) null);
            if (a != null) {
                intent = a;
            }
            setResult(i, intent);
        } else {
            setResult(i, C45033o.m49877a(getIntent(), (Bundle) null, (RuntimeException) null));
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.fb.CustomTabMainActivity", "onCreate, getIntent().getAction() = " + getIntent().getAction(), (Object[]) null);
        if (CustomTabActivity.f344447e.equals(getIntent().getAction())) {
            setResult(0);
            finish();
        } else if (bundle == null) {
            String stringExtra = getIntent().getStringExtra(C116102h.f348430h);
            Bundle bundleExtra = getIntent().getBundleExtra(C116102h.f348431i);
            String stringExtra2 = getIntent().getStringExtra(C116102h.f348432j);
            if (bundleExtra == null) {
                bundleExtra = new Bundle();
            }
            Uri.Builder builder = new Uri.Builder();
            builder.scheme(C113600ck.f339986i);
            builder.authority("m.facebook.com");
            builder.path("v8.0/dialog/" + stringExtra);
            for (String next : bundleExtra.keySet()) {
                Object obj = bundleExtra.get(next);
                if (obj instanceof String) {
                    builder.appendQueryParameter(next, (String) obj);
                }
            }
            Uri build = builder.build();
            Intent intent = new Intent("android.intent.action.VIEW");
            Bundle bundle2 = new Bundle();
            bundle2.putBinder("android.support.customtabs.extra.SESSION", (IBinder) null);
            intent.putExtras(bundle2);
            intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
            intent.setPackage(stringExtra2);
            intent.addFlags(1073741824);
            try {
                intent.setData(build);
                Object obj2 = C111105a.f332697a;
                C111105a.C90592a.m113491b(this, intent, (Bundle) null);
                z = true;
            } catch (ActivityNotFoundException unused) {
                z = false;
            }
            this.f344451d = false;
            if (!z) {
                setResult(0, getIntent().putExtra(C116102h.f348434l, true));
                finish();
                return;
            }
            this.f344452e = new C114915a();
            C118144a.m166672a(this).mo182943b(this.f344452e, new IntentFilter(CustomTabActivity.f344447e));
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C118144a.m166672a(this).mo182945d(this.f344452e);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.fb.CustomTabMainActivity", "CustomTabMainActivity, intent.getAction() = " + intent.getAction(), (Object[]) null);
        if (C116102h.f348433k.equals(intent.getAction())) {
            C118144a.m166672a(this).mo182944c(new Intent(CustomTabActivity.f344448f));
            mo174603E7(-1, intent);
        } else if (CustomTabActivity.f344447e.equals(intent.getAction())) {
            mo174603E7(-1, intent);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f344451d) {
            mo174603E7(0, (Intent) null);
        }
        this.f344451d = true;
    }
}
