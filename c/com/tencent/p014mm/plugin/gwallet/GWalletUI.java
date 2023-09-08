package com.tencent.p014mm.plugin.gwallet;

import a02.C112700b;
import a02.C112704c;
import a02.C112706d;
import a02.C112708e;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.RemoteException;
import com.tencent.p014mm.hellhoundlib.activities.HellActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import java.util.ArrayList;
import zz1.C119184b;

/* renamed from: com.tencent.mm.plugin.gwallet.GWalletUI */
public class GWalletUI extends HellActivity {

    /* renamed from: f */
    public static final /* synthetic */ int f346156f = 0;

    /* renamed from: d */
    public C112700b f346157d = null;

    /* renamed from: e */
    public BroadcastReceiver f346158e = new C115456b();

    /* renamed from: com.tencent.mm.plugin.gwallet.GWalletUI$a */
    public class C115455a implements C112700b.C112702b {
        public C115455a() {
        }

        /* renamed from: a */
        public void mo164437a(C112708e eVar) {
            Log.m105918d("MicroMsg.GWalletUI", "Setup finished.");
            if (!(eVar.f337440a == 0)) {
                Log.m105920e("MicroMsg.GWalletUI", "Problem setting up in-app billing: " + eVar);
                Intent intent = new Intent();
                intent.putExtra("RESPONSE_CODE", eVar.mo164443a());
                GWalletUI.m162309E7(GWalletUI.this, -1, intent);
            } else if ("com.tencent.mm.gwallet.ACTION_PAY_REQUEST".equals(GWalletUI.this.getIntent().getAction())) {
                GWalletUI gWalletUI = GWalletUI.this;
                int i = GWalletUI.f346156f;
                Intent intent2 = gWalletUI.getIntent();
                String stringExtra = intent2.getStringExtra("product_id");
                String stringExtra2 = intent2.getStringExtra("developer_pay_load");
                C112700b bVar = gWalletUI.f346157d;
                C119184b bVar2 = new C119184b(gWalletUI);
                bVar.mo164429c("launchPurchaseFlow");
                try {
                    bVar.mo164432g("Constructing buy intent for " + stringExtra + ", item type: " + "inapp" + ", extraData: " + stringExtra2);
                    Bundle Wp0 = bVar.f337419b.Wp0(3, bVar.f337418a.getPackageName(), stringExtra, "inapp", stringExtra2);
                    int e = bVar.mo164431e(Wp0);
                    if (e != 0) {
                        bVar2.mo164438a(new C112708e(e, "Unable to buy item"), (Intent) null);
                        return;
                    }
                    bVar.mo164432g("Launching buy intent for " + stringExtra + ". Request code: " + 10001);
                    bVar.f337422e = 10001;
                    bVar.f337423f = bVar2;
                    bVar.f337424g = "inapp";
                    IntentSender intentSender = ((PendingIntent) Wp0.getParcelable("BUY_INTENT")).getIntentSender();
                    Intent intent3 = new Intent();
                    Integer num = 0;
                    int intValue = num.intValue();
                    Integer num2 = 0;
                    int intValue2 = num2.intValue();
                    Integer num3 = 0;
                    gWalletUI.startIntentSenderForResult(intentSender, 10001, intent3, intValue, intValue2, num3.intValue());
                } catch (IntentSender.SendIntentException e2) {
                    bVar.mo164433h("SendIntentException while launching purchase flow for sku " + stringExtra);
                    Log.printErrStackTrace("MicroMsg.IabHelper", e2, "", new Object[0]);
                    bVar2.mo164438a(new C112708e(-1004, "Failed to send intent."), (Intent) null);
                } catch (RemoteException e3) {
                    bVar.mo164433h("RemoteException while launching purchase flow for sku " + stringExtra);
                    Log.printErrStackTrace("MicroMsg.IabHelper", e3, "", new Object[0]);
                    bVar2.mo164438a(new C112708e(-1001, "Remote exception while starting purchase flow"), (Intent) null);
                }
            } else {
                GWalletUI gWalletUI2 = GWalletUI.this;
                gWalletUI2.mo175392F7(gWalletUI2.getIntent().getBooleanExtra("is_direct", true));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.gwallet.GWalletUI$b */
    public class C115456b extends BroadcastReceiver {
        public C115456b() {
        }

        public void onReceive(Context context, Intent intent) {
            if ("com.tencent.mm.gwallet.ACTION_CONSUME_REQUEST".equals(intent.getAction())) {
                ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("tokens");
                boolean booleanExtra = intent.getBooleanExtra("IS_FAILED_CONSUME", false);
                if (stringArrayListExtra == null || stringArrayListExtra.size() == 0) {
                    GWalletUI.m162309E7(GWalletUI.this, 0, (Intent) null);
                    return;
                }
                C112700b bVar = GWalletUI.this.f346157d;
                C115458a aVar = new C115458a(this, booleanExtra);
                bVar.getClass();
                ThreadPool.post(new C112704c(bVar, stringArrayListExtra, aVar, new MMHandler()), "IabHelper_consumeAsync");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.gwallet.GWalletUI$c */
    public class C115457c implements C112700b.C112703c {

        /* renamed from: a */
        public final /* synthetic */ boolean f346161a;

        public C115457c(boolean z) {
            this.f346161a = z;
        }

        /* renamed from: a */
        public void mo164438a(C112708e eVar, Intent intent) {
            Log.m105918d("MicroMsg.GWalletUI", "Query inventory finished. data : " + intent);
            if (intent == null) {
                intent = new Intent("com.tencent.mm.gwallet.ACTION_QUERY_RESPONSE");
                intent.putExtra("RESPONSE_CODE", eVar.mo164443a());
            } else {
                intent.setAction("com.tencent.mm.gwallet.ACTION_QUERY_RESPONSE");
            }
            if (!this.f346161a) {
                intent.putExtra("is_direct", false);
            }
            GWalletUI.this.sendBroadcast(intent);
        }
    }

    /* renamed from: E7 */
    public static void m162309E7(GWalletUI gWalletUI, int i, Intent intent) {
        gWalletUI.getClass();
        Log.m105918d("MicroMsg.GWalletUI", "Finish GWallet. setResult:" + i);
        gWalletUI.setResult(i, intent);
        gWalletUI.finish();
    }

    /* renamed from: F7 */
    public void mo175392F7(boolean z) {
        C112700b bVar = this.f346157d;
        C115457c cVar = new C115457c(z);
        bVar.getClass();
        MMHandler mMHandler = new MMHandler();
        bVar.mo164429c("queryInventory");
        ThreadPool.post(new C112706d(bVar, "inapp", mMHandler, cVar), "IabHelper_queryInventoryAsync");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C112700b bVar = this.f346157d;
        int i3 = 0;
        if (i == bVar.f337422e) {
            bVar.mo164429c("handleActivityResult");
            if (intent == null) {
                bVar.mo164433h("Null data in IAB activity result.");
                C112708e eVar = new C112708e(-1002, "Null data in IAB result");
                C112700b.C112703c cVar = bVar.f337423f;
                if (cVar != null) {
                    cVar.mo164438a(eVar, (Intent) null);
                    return;
                }
                return;
            }
            Object obj = intent.getExtras().get("RESPONSE_CODE");
            if (obj == null) {
                bVar.mo164433h("Intent with no response code, assuming OK (known issue)");
            } else if (obj instanceof Integer) {
                i3 = ((Integer) obj).intValue();
            } else if (obj instanceof Long) {
                i3 = (int) ((Long) obj).longValue();
            } else {
                bVar.mo164433h("Unexpected type for intent response code.");
                bVar.mo164433h(obj.getClass().getName());
                throw new RuntimeException("Unexpected type for intent response code: " + obj.getClass().getName());
            }
            String stringExtra = intent.getStringExtra("INAPP_PURCHASE_DATA");
            String stringExtra2 = intent.getStringExtra("INAPP_DATA_SIGNATURE");
            bVar.mo164432g("Purchase data: " + stringExtra);
            bVar.mo164432g("Data signature: " + stringExtra2);
            bVar.mo164432g("Extras: " + intent.getExtras());
            bVar.mo164432g("Expected item type: " + bVar.f337424g);
            C112708e eVar2 = new C112708e(i3, "Null data in IAB result");
            C112700b.C112703c cVar2 = bVar.f337423f;
            if (cVar2 != null) {
                cVar2.mo164438a(eVar2, intent);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        Log.m105918d("MicroMsg.GWalletUI", "Creating IAB helper.");
        this.f346157d = new C112700b(this);
        Log.m105918d("MicroMsg.GWalletUI", "Starting setup.");
        this.f346157d.mo164434i(new C115455a());
    }

    public void onDestroy() {
        Log.m105918d("MicroMsg.GWalletUI", "Destroying helper.");
        C112700b bVar = this.f346157d;
        if (bVar != null) {
            bVar.mo164430d();
        }
        this.f346157d = null;
        super.onDestroy();
    }

    public void onNewIntent(Intent intent) {
        if ("com.tencent.mm.gwallet.ACTION_QUERY_REQUEST".equals(intent.getAction())) {
            mo175392F7(intent.getBooleanExtra("is_direct", true));
        }
        super.onNewIntent(intent);
    }

    public void onStart() {
        super.onStart();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.tencent.mm.gwallet.ACTION_CONSUME_REQUEST");
        registerReceiver(this.f346158e, intentFilter);
    }

    public void onStop() {
        super.onStop();
        unregisterReceiver(this.f346158e);
    }
}
