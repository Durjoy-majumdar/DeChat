package a02;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import p1216u5.C118586a;

/* renamed from: a02.b */
public class C112700b {

    /* renamed from: a */
    public Context f337418a;

    /* renamed from: b */
    public C118586a f337419b;

    /* renamed from: c */
    public ServiceConnection f337420c;

    /* renamed from: d */
    public boolean f337421d = false;

    /* renamed from: e */
    public int f337422e;

    /* renamed from: f */
    public C112703c f337423f;

    /* renamed from: g */
    public String f337424g;

    /* renamed from: a02.b$a */
    public class C112701a implements ServiceConnection {

        /* renamed from: d */
        public final /* synthetic */ C112702b f337425d;

        public C112701a(C112702b bVar) {
            this.f337425d = bVar;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C118586a aVar;
            C112700b.this.mo164432g("Billing service connected.");
            C112700b bVar = C112700b.this;
            int i = C118586a.C118587a.f354878d;
            if (iBinder == null) {
                aVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                aVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C118586a)) ? new C118586a.C118587a.C118588a(iBinder) : (C118586a) queryLocalInterface;
            }
            bVar.f337419b = aVar;
            String packageName = C112700b.this.f337418a.getPackageName();
            try {
                C112700b.this.mo164432g("Checking for in-app billing 3 support.");
                int Xq = C112700b.this.f337419b.mo183337Xq(3, packageName, "inapp");
                if (Xq != 0) {
                    C112702b bVar2 = this.f337425d;
                    if (bVar2 != null) {
                        bVar2.mo164437a(new C112708e(Xq, "Error checking for billing v3 support."));
                    }
                    C112700b.this.getClass();
                    return;
                }
                C112700b bVar3 = C112700b.this;
                bVar3.mo164432g("In-app billing version 3 supported for " + packageName);
                int Xq2 = C112700b.this.f337419b.mo183337Xq(3, packageName, "subs");
                if (Xq2 == 0) {
                    C112700b.this.mo164432g("Subscriptions AVAILABLE.");
                    C112700b.this.getClass();
                } else {
                    C112700b bVar4 = C112700b.this;
                    bVar4.mo164432g("Subscriptions NOT AVAILABLE. Response: " + Xq2);
                }
                C112700b.this.f337421d = true;
                C112702b bVar5 = this.f337425d;
                if (bVar5 != null) {
                    bVar5.mo164437a(new C112708e(0, "Setup successful."));
                }
            } catch (RemoteException e) {
                C112702b bVar6 = this.f337425d;
                if (bVar6 != null) {
                    bVar6.mo164437a(new C112708e(-1001, "RemoteException while setting up in-app billing."));
                }
                Log.printErrStackTrace("MicroMsg.IabHelper", e, "", new Object[0]);
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C112700b.this.mo164432g("Billing service disconnected.");
            C112700b.this.f337419b = null;
        }
    }

    /* renamed from: a02.b$b */
    public interface C112702b {
        /* renamed from: a */
        void mo164437a(C112708e eVar);
    }

    /* renamed from: a02.b$c */
    public interface C112703c {
        /* renamed from: a */
        void mo164438a(C112708e eVar, Intent intent);
    }

    public C112700b(Context context) {
        this.f337418a = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r5.equals("") != false) goto L_0x000f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m154101a(a02.C112700b r4, java.lang.String r5) {
        /*
            java.lang.String r0 = "consume"
            r4.mo164429c(r0)
            if (r5 == 0) goto L_0x000f
            java.lang.String r0 = ""
            boolean r0 = r5.equals(r0)     // Catch:{ RemoteException -> 0x0077 }
            if (r0 == 0) goto L_0x0028
        L_0x000f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x0077 }
            r0.<init>()     // Catch:{ RemoteException -> 0x0077 }
            java.lang.String r1 = "Can't consume "
            r0.append(r1)     // Catch:{ RemoteException -> 0x0077 }
            r0.append(r5)     // Catch:{ RemoteException -> 0x0077 }
            java.lang.String r1 = ". No token."
            r0.append(r1)     // Catch:{ RemoteException -> 0x0077 }
            java.lang.String r0 = r0.toString()     // Catch:{ RemoteException -> 0x0077 }
            r4.mo164433h(r0)     // Catch:{ RemoteException -> 0x0077 }
        L_0x0028:
            u5.a r0 = r4.f337419b     // Catch:{ RemoteException -> 0x0077 }
            r1 = 3
            android.content.Context r2 = r4.f337418a     // Catch:{ RemoteException -> 0x0077 }
            java.lang.String r2 = r2.getPackageName()     // Catch:{ RemoteException -> 0x0077 }
            int r0 = r0.mo183338ks(r1, r2, r5)     // Catch:{ RemoteException -> 0x0077 }
            if (r0 != 0) goto L_0x004c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x0077 }
            r0.<init>()     // Catch:{ RemoteException -> 0x0077 }
            java.lang.String r1 = "Successfully consumed token: "
            r0.append(r1)     // Catch:{ RemoteException -> 0x0077 }
            r0.append(r5)     // Catch:{ RemoteException -> 0x0077 }
            java.lang.String r0 = r0.toString()     // Catch:{ RemoteException -> 0x0077 }
            r4.mo164432g(r0)     // Catch:{ RemoteException -> 0x0077 }
            return
        L_0x004c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x0077 }
            r1.<init>()     // Catch:{ RemoteException -> 0x0077 }
            java.lang.String r2 = "Error consuming consuming token "
            r1.append(r2)     // Catch:{ RemoteException -> 0x0077 }
            r1.append(r5)     // Catch:{ RemoteException -> 0x0077 }
            java.lang.String r1 = r1.toString()     // Catch:{ RemoteException -> 0x0077 }
            r4.mo164432g(r1)     // Catch:{ RemoteException -> 0x0077 }
            a02.a r4 = new a02.a     // Catch:{ RemoteException -> 0x0077 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x0077 }
            r1.<init>()     // Catch:{ RemoteException -> 0x0077 }
            java.lang.String r2 = "Error consuming token "
            r1.append(r2)     // Catch:{ RemoteException -> 0x0077 }
            r1.append(r5)     // Catch:{ RemoteException -> 0x0077 }
            java.lang.String r1 = r1.toString()     // Catch:{ RemoteException -> 0x0077 }
            r4.<init>(r0, r1)     // Catch:{ RemoteException -> 0x0077 }
            throw r4     // Catch:{ RemoteException -> 0x0077 }
        L_0x0077:
            r4 = move-exception
            a02.a r0 = new a02.a
            r1 = -1001(0xfffffffffffffc17, float:NaN)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Remote exception while consuming. token: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r0.<init>(r1, r5, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a02.C112700b.m154101a(a02.b, java.lang.String):void");
    }

    /* renamed from: b */
    public static int m154102b(C112700b bVar, Intent intent, String str) {
        bVar.getClass();
        bVar.mo164432g("Querying owned items, item type: " + str);
        bVar.mo164432g("Package name: " + bVar.f337418a.getPackageName());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        String str2 = null;
        do {
            bVar.mo164432g("Calling getPurchases with continuation token: " + str2);
            Bundle r502 = bVar.f337419b.r50(3, bVar.f337418a.getPackageName(), str, str2);
            int e = bVar.mo164431e(r502);
            bVar.mo164432g("Owned items response: " + String.valueOf(e));
            if (e != 0) {
                bVar.mo164432g("getPurchases() failed: " + e);
                return e;
            } else if (!r502.containsKey("INAPP_PURCHASE_ITEM_LIST") || !r502.containsKey("INAPP_PURCHASE_DATA_LIST") || !r502.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                bVar.mo164433h("Bundle returned from getPurchases() doesn't contain required fields.");
                return -1002;
            } else {
                arrayList.addAll(r502.getStringArrayList("INAPP_PURCHASE_ITEM_LIST"));
                arrayList2.addAll(r502.getStringArrayList("INAPP_PURCHASE_DATA_LIST"));
                arrayList3.addAll(r502.getStringArrayList("INAPP_DATA_SIGNATURE_LIST"));
                str2 = r502.getString("INAPP_CONTINUATION_TOKEN");
                bVar.mo164432g("Continuation token: " + str2);
            }
        } while (!TextUtils.isEmpty(str2));
        intent.putStringArrayListExtra("INAPP_PURCHASE_ITEM_LIST", arrayList);
        intent.putStringArrayListExtra("INAPP_PURCHASE_DATA_LIST", arrayList2);
        intent.putStringArrayListExtra("INAPP_DATA_SIGNATURE_LIST", arrayList3);
        return 0;
    }

    /* renamed from: f */
    public static String m154103f(int i) {
        String[] split = "0:OK/1:User Canceled/2:Unknown/3:Billing Unavailable/4:Item unavailable/5:Developer Error/6:Error/7:Item Already Owned/8:Item not owned".split("/");
        String[] split2 = "0:OK/-1001:Remote exception during initialization/-1002:Bad response received/-1003:Purchase signature verification failed/-1004:Send intent failed/-1005:User cancelled/-1006:Unknown purchase response/-1007:Missing token/-1008:Unknown error/-1009:Subscriptions not available/-1010:Invalid consumption attempt".split("/");
        if (i <= -1000) {
            int i2 = -1000 - i;
            if (i2 >= 0 && i2 < split2.length) {
                return split2[i2];
            }
            return String.valueOf(i) + ":Unknown IAB Helper Error";
        } else if (i >= 0 && i < split.length) {
            return split[i];
        } else {
            return String.valueOf(i) + ":Unknown";
        }
    }

    /* renamed from: c */
    public final void mo164429c(String str) {
        if (!this.f337421d) {
            Log.m105920e("MicroMsg.IabHelper", "Illegal state for operation (" + str + "): IAB helper is not set up.");
            throw new IllegalStateException("IAB helper is not set up. Can't perform operation: " + str);
        }
    }

    /* renamed from: d */
    public void mo164430d() {
        mo164432g("Disposing.");
        this.f337421d = false;
        if (this.f337420c != null) {
            mo164432g("Unbinding from service.");
            try {
                Context context = this.f337418a;
                if (context != null) {
                    context.unbindService(this.f337420c);
                }
            } catch (IllegalArgumentException e) {
                Log.m105920e("MicroMsg.IabHelper", e.toString());
            }
            this.f337420c = null;
            this.f337419b = null;
        }
    }

    /* renamed from: e */
    public final int mo164431e(Bundle bundle) {
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            mo164432g("Bundle with null response code, assuming OK (known issue)");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            if (obj instanceof Long) {
                return (int) ((Long) obj).longValue();
            }
            mo164433h("Unexpected type for bundle response code.");
            mo164433h(obj.getClass().getName());
            throw new RuntimeException("Unexpected type for bundle response code: " + obj.getClass().getName());
        }
    }

    /* renamed from: g */
    public final void mo164432g(String str) {
        Log.m105918d("MicroMsg.IabHelper", str);
    }

    /* renamed from: h */
    public final void mo164433h(String str) {
        Log.m105920e("MicroMsg.IabHelper", "In-app billing error: " + str);
    }

    /* renamed from: i */
    public void mo164434i(C112702b bVar) {
        if (!this.f337421d) {
            mo164432g("Starting in-app billing setup.");
            this.f337420c = new C112701a(bVar);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            Context context = this.f337418a;
            if (context != null && context.getPackageManager() != null && this.f337418a.getPackageManager().queryIntentServices(intent, 0) != null && !this.f337418a.getPackageManager().queryIntentServices(intent, 0).isEmpty()) {
                this.f337418a.bindService(intent, this.f337420c, 1);
            } else if (bVar != null) {
                bVar.mo164437a(new C112708e(-2001, "Google play not installed!"));
            }
        } else {
            throw new IllegalStateException("IAB helper is already set up.");
        }
    }
}
