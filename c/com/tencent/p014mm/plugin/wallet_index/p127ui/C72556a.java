package com.tencent.p014mm.plugin.wallet_index.p127ui;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75136r0;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import m63.C76748c;
import m63.C76749d;
import m63.C76750e;
import n63.C76835c;
import org.json.JSONException;
import te3.C77987qh2;

/* renamed from: com.tencent.mm.plugin.wallet_index.ui.a */
public class C72556a implements C72559b {

    /* renamed from: l */
    public static final String f211071l = MMApplicationContext.getApplicationId();

    /* renamed from: m */
    public static long f211072m = 0;

    /* renamed from: a */
    public C72561d f211073a = null;

    /* renamed from: b */
    public C72561d f211074b = null;

    /* renamed from: c */
    public C72560c f211075c;

    /* renamed from: d */
    public C72561d f211076d;

    /* renamed from: e */
    public C76748c f211077e;

    /* renamed from: f */
    public C76749d f211078f;

    /* renamed from: g */
    public String f211079g;

    /* renamed from: h */
    public String f211080h;

    /* renamed from: i */
    public String f211081i;

    /* renamed from: j */
    public String f211082j;

    /* renamed from: k */
    public BroadcastReceiver f211083k = new C72557a();

    /* renamed from: com.tencent.mm.plugin.wallet_index.ui.a$a */
    public class C72557a extends BroadcastReceiver {

        /* renamed from: com.tencent.mm.plugin.wallet_index.ui.a$a$a */
        public class C72558a {

            /* renamed from: a */
            public final /* synthetic */ boolean f211085a;

            public C72558a(boolean z) {
                this.f211085a = z;
            }

            /* renamed from: a */
            public void mo99969a(C76835c cVar, C76749d dVar) {
                C76835c cVar2;
                Log.m105918d("MicroMsg.GoogleWallet", "Query inventory finished.");
                if (cVar.mo107104c() || dVar == null) {
                    Log.m105928w("MicroMsg.GoogleWallet", "Failed to query inventory: " + cVar);
                    return;
                }
                Log.m105918d("MicroMsg.GoogleWallet", "Query inventory was successful.");
                C72556a aVar = C72556a.this;
                aVar.f211078f = dVar;
                C72560c cVar3 = aVar.f211075c;
                ArrayList arrayList = new ArrayList(((HashMap) dVar.f224518a).keySet());
                ((ArrayList) cVar3.f211097k).clear();
                ((ArrayList) cVar3.f211097k).addAll(arrayList);
                ArrayList arrayList2 = new ArrayList(((HashMap) dVar.f224518a).values());
                if (arrayList2.size() > 0) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        C76750e eVar = (C76750e) it.next();
                        Log.m105924i("MicroMsg.GoogleWallet", "do NetSceneVerifyPurchase. productId:" + eVar.f224521c + ",billNo:" + eVar.f224522d);
                        C86709a0.m107528h();
                        C86709a0.m107529k().f251779b.mo123460f(C72556a.this.f211075c.mo99970a(eVar, true));
                    }
                    return;
                }
                Log.m105918d("MicroMsg.GoogleWallet", "purchases is null. consume null ");
                if (!this.f211085a) {
                    Log.m105918d("MicroMsg.GoogleWallet", "unknown_purchase");
                    cVar2 = C76835c.m92624a(5);
                } else {
                    Log.m105918d("MicroMsg.GoogleWallet", "result ok");
                    cVar2 = C76835c.m92624a(0);
                }
                C72561d dVar2 = C72556a.this.f211076d;
                if (dVar2 != null) {
                    dVar2.mo99950a(cVar2, (C76750e) null);
                }
            }
        }

        public C72557a() {
        }

        public void onReceive(Context context, Intent intent) {
            int i;
            Intent intent2 = intent;
            String action = intent.getAction();
            C76749d dVar = null;
            if ("com.tencent.mm.gwallet.ACTION_PAY_RESPONSE".equals(action)) {
                C72556a aVar = C72556a.this;
                C76748c cVar = aVar.f211077e;
                C72561d dVar2 = aVar.f211073a;
                cVar.getClass();
                int intExtra = intent2.getIntExtra("RESPONSE_CODE", 0);
                String stringExtra = intent2.getStringExtra("INAPP_PURCHASE_DATA");
                String stringExtra2 = intent2.getStringExtra("INAPP_DATA_SIGNATURE");
                if (intExtra == 0) {
                    cVar.mo107014b("Successful resultcode from purchase activity.");
                    cVar.mo107014b("Purchase data: " + stringExtra);
                    cVar.mo107014b("Data signature: " + stringExtra2);
                    cVar.mo107014b("Extras: " + intent.getExtras());
                    if (stringExtra == null || stringExtra2 == null) {
                        cVar.mo107015c("BUG: either purchaseData or dataSignature is null.");
                        C76835c a = C76835c.m92624a(5);
                        if (dVar2 != null) {
                            dVar2.mo99950a(a, (C76750e) null);
                        }
                    } else {
                        try {
                            C76750e eVar = new C76750e("inapp", stringExtra, stringExtra2);
                            String str = eVar.f224521c;
                            cVar.mo107014b("Purchase signature successfully verified.");
                            if (dVar2 != null) {
                                dVar2.mo99950a(C76835c.m92624a(0), eVar);
                            }
                            dVar = new C76749d(str, eVar);
                        } catch (JSONException e) {
                            cVar.mo107015c("Failed to parse purchase data.");
                            Log.printErrStackTrace("MicroMsg.IabResolver", e, "", new Object[0]);
                            C76835c a2 = C76835c.m92624a(5);
                            if (dVar2 != null) {
                                dVar2.mo99950a(a2, (C76750e) null);
                            }
                        }
                    }
                } else {
                    cVar.mo107015c("Purchase failed. Response: " + intExtra);
                    C76835c a3 = C76835c.m92624a(intExtra);
                    if (dVar2 != null) {
                        dVar2.mo99950a(a3, (C76750e) null);
                    }
                }
                aVar.f211078f = dVar;
            } else if ("com.tencent.mm.gwallet.ACTION_QUERY_RESPONSE".equals(action)) {
                boolean booleanExtra = intent2.getBooleanExtra("is_direct", true);
                C76748c cVar2 = C72556a.this.f211077e;
                C72558a aVar2 = new C72558a(booleanExtra);
                cVar2.getClass();
                C76749d dVar3 = new C76749d();
                int a4 = cVar2.mo107013a(intent2);
                cVar2.mo107014b("Owned items response: " + String.valueOf(a4));
                if (a4 != 0) {
                    aVar2.mo99969a(C76835c.m92624a(a4), (C76749d) null);
                } else if (!intent2.hasExtra("INAPP_PURCHASE_ITEM_LIST") || !intent2.hasExtra("INAPP_PURCHASE_DATA_LIST") || !intent2.hasExtra("INAPP_DATA_SIGNATURE_LIST")) {
                    cVar2.mo107015c("Bundle returned from getPurchases() doesn't contain required fields.");
                    aVar2.mo99969a(C76835c.m92624a(5), (C76749d) null);
                } else {
                    ArrayList<String> stringArrayListExtra = intent2.getStringArrayListExtra("INAPP_PURCHASE_ITEM_LIST");
                    ArrayList<String> stringArrayListExtra2 = intent2.getStringArrayListExtra("INAPP_PURCHASE_DATA_LIST");
                    ArrayList<String> stringArrayListExtra3 = intent2.getStringArrayListExtra("INAPP_DATA_SIGNATURE_LIST");
                    int i2 = 0;
                    while (i2 < stringArrayListExtra2.size()) {
                        try {
                            String str2 = stringArrayListExtra2.get(i2);
                            StringBuilder sb = new StringBuilder();
                            ArrayList<String> arrayList = stringArrayListExtra3;
                            sb.append("Sku is owned: ");
                            sb.append(stringArrayListExtra.get(i2));
                            cVar2.mo107014b(sb.toString());
                            C76750e eVar2 = new C76750e("inapp", str2, stringArrayListExtra3.get(i2));
                            if (TextUtils.isEmpty(eVar2.f224523e)) {
                                Log.m105928w("MicroMsg.IabResolver", "In-app billing warning: BUG: empty/null token!");
                                cVar2.mo107014b("Purchase data: " + str2);
                            }
                            ((HashMap) dVar3.f224518a).put(eVar2.f224521c, eVar2);
                            i2++;
                            stringArrayListExtra3 = arrayList;
                        } catch (JSONException e2) {
                            e = e2;
                            i = 0;
                        }
                    }
                    i = 0;
                    try {
                        aVar2.mo99969a(C76835c.m92624a(0), dVar3);
                    } catch (JSONException e3) {
                        e = e3;
                        Log.printErrStackTrace("MicroMsg.IabResolver", e, "", new Object[i]);
                        aVar2.mo99969a(C76835c.m92624a(5), dVar3);
                    }
                }
            }
        }
    }

    public C72556a(Activity activity, C72560c cVar, C72561d dVar) {
        this.f211076d = dVar;
        f211072m = 0;
        this.f211075c = cVar;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.tencent.mm.gwallet.ACTION_QUERY_RESPONSE");
        intentFilter.addAction("com.tencent.mm.gwallet.ACTION_PAY_RESPONSE");
        activity.registerReceiver(this.f211083k, intentFilter);
        this.f211077e = new C76748c();
    }

    /* renamed from: a */
    public int mo99961a() {
        return 3;
    }

    /* renamed from: b */
    public void mo99962b(MMActivity mMActivity) {
        try {
            mMActivity.unregisterReceiver(this.f211083k);
        } catch (IllegalArgumentException e) {
            Log.m105920e("MicroMsg.GoogleWallet", e.toString());
        }
        if (!Util.isTopActivity(mMActivity)) {
            Log.m105918d("MicroMsg.GoogleWallet", "close front UI.");
            Intent intent = new Intent("com.tencent.mm.gwallet.ACTION_CONSUME_REQUEST");
            intent.setPackage(f211071l);
            mMActivity.sendBroadcast(intent);
        }
        Log.m105918d("MicroMsg.GoogleWallet", "Destroying helper.");
    }

    /* renamed from: c */
    public boolean mo99963c(MMActivity mMActivity, int i, int i2, Intent intent) {
        if (i == 10001) {
            Log.m105925i("MicroMsg.GoogleWallet", "purchase flow!result_code: %d", Integer.valueOf(i2));
            if (intent != null) {
                int intExtra = intent.getIntExtra("RESPONSE_CODE", 0);
                if (intExtra == 3 || intExtra == 105) {
                    C75136r0.m90121c(this.f211082j, this.f211081i, this.f211079g, intExtra, "");
                    mo99967g(mMActivity, intExtra);
                    return true;
                } else if (intExtra == 100000001) {
                    mo99967g(mMActivity, intExtra);
                    return true;
                }
            } else {
                mo99967g(mMActivity, 1);
                return true;
            }
        }
        C76748c cVar = this.f211077e;
        C72561d dVar = this.f211074b;
        String str = this.f211082j;
        String str2 = this.f211081i;
        String str3 = this.f211079g;
        int a = cVar.mo107013a(intent);
        cVar.mo107014b("Owned items response: " + String.valueOf(a));
        C76835c a2 = C76835c.m92624a(a);
        C75136r0.m90121c(str, str2, str3, a, a2.f224658b);
        if (dVar != null) {
            dVar.mo99950a(a2, (C76750e) null);
        }
        return true;
    }

    /* renamed from: d */
    public void mo99964d(MMActivity mMActivity, ArrayList<String> arrayList, C72561d dVar, boolean z) {
        this.f211074b = dVar;
        Log.m105918d("MicroMsg.GoogleWallet", "consumePurchase. consume...");
        C76749d dVar2 = this.f211078f;
        dVar2.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            C76750e eVar = (C76750e) ((HashMap) dVar2.f224518a).get(str);
            if (eVar != null) {
                arrayList2.add(eVar.f224523e);
            }
        }
        if (arrayList2.size() > 0) {
            Intent intent = new Intent("com.tencent.mm.gwallet.ACTION_CONSUME_REQUEST");
            intent.setPackage(f211071l);
            intent.putStringArrayListExtra("tokens", arrayList2);
            intent.putExtra("IS_FAILED_CONSUME", z);
            mMActivity.sendBroadcast(intent);
            return;
        }
        C76835c a = C76835c.m92624a(0);
        C72561d dVar3 = this.f211074b;
        if (dVar3 != null) {
            dVar3.mo99950a(a, (C76750e) null);
        }
    }

    /* renamed from: e */
    public void mo99965e(MMActivity mMActivity, boolean z) {
        Log.m105918d("MicroMsg.GoogleWallet", "restorePurchase. Querying inventory.");
        Log.m105918d("MicroMsg.GoogleWallet", "is direct? " + z);
        Intent intent = new Intent("com.tencent.mm.gwallet.ACTION_QUERY_REQUEST");
        intent.setPackage(f211071l);
        intent.putExtra("is_direct", z);
        mMActivity.startActivityForResult(intent, 10001);
    }

    /* renamed from: f */
    public int mo99966f(MMActivity mMActivity, C72561d dVar) {
        this.f211073a = dVar;
        C77987qh2 qh22 = this.f211075c.f211090d;
        this.f211081i = qh22.f228126d;
        this.f211079g = qh22.f228127e;
        this.f211080h = qh22.f228128f;
        Intent intent = new Intent("com.tencent.mm.gwallet.ACTION_PAY_REQUEST");
        intent.setPackage(f211071l);
        intent.putExtra("product_id", this.f211081i);
        String str = this.f211075c.f211090d.f228129g;
        this.f211082j = str;
        String str2 = this.f211079g;
        String str3 = this.f211080h;
        if (Util.isNullOrNil(str)) {
            str = "";
        }
        if (Util.isNullOrNil(str2)) {
            str2 = "";
        }
        if (Util.isNullOrNil(str3)) {
            str3 = "";
        }
        intent.putExtra("developer_pay_load", str + "[#]" + str2 + "[#]" + str3);
        if (!mMActivity.getPackageManager().queryIntentActivities(intent, 65536).isEmpty()) {
            f211072m = Util.nowMilliSecond();
            Log.m105924i("MicroMsg.GoogleWallet", "GWallet Found!");
            mMActivity.startActivityForResult(intent, 10001);
        } else {
            Log.m105924i("MicroMsg.GoogleWallet", "Try to downloading GWallet Moudle!");
            C76835c a = C76835c.m92624a(3);
            C72561d dVar2 = this.f211073a;
            if (dVar2 != null) {
                dVar2.mo99950a(a, (C76750e) null);
            }
        }
        return 10001;
    }

    /* renamed from: g */
    public final void mo99967g(MMActivity mMActivity, int i) {
        C76835c a = C76835c.m92624a(i);
        Intent intent = new Intent();
        intent.putExtra("key_err_code", a.f224657a);
        intent.putExtra("key_err_msg", a.f224658b);
        intent.putExtra("key_launch_ts", f211072m);
        mMActivity.setResult(-1, intent);
        mMActivity.finish();
    }
}
