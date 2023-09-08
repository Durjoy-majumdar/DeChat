package com.tencent.p014mm.plugin.gwallet;

import a02.C112700b;
import a02.C112708e;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Iterator;
import zz1.C119183a;

/* renamed from: com.tencent.mm.plugin.gwallet.GWalletQueryProvider */
public class GWalletQueryProvider extends ContentProvider {

    /* renamed from: n */
    public static final String[] f346146n = {"_id", "product_id", "full_price", "product_state", "price_currency", "price_amount"};

    /* renamed from: d */
    public C112700b f346147d = null;

    /* renamed from: e */
    public Context f346148e = null;

    /* renamed from: f */
    public boolean f346149f;

    /* renamed from: g */
    public boolean f346150g;

    /* renamed from: h */
    public ArrayList<String> f346151h;

    /* renamed from: i */
    public ArrayList<String> f346152i;

    /* renamed from: j */
    public int f346153j;

    /* renamed from: com.tencent.mm.plugin.gwallet.GWalletQueryProvider$a */
    public class C115453a implements C112700b.C112702b {

        /* renamed from: com.tencent.mm.plugin.gwallet.GWalletQueryProvider$a$a */
        public class C115454a implements MMHandlerThread.IWaitWorkThread {
            public C115454a() {
            }

            public boolean doInBackground() {
                GWalletQueryProvider gWalletQueryProvider = GWalletQueryProvider.this;
                C112700b bVar = gWalletQueryProvider.f346147d;
                if (bVar == null) {
                    return true;
                }
                ArrayList<String> arrayList = gWalletQueryProvider.f346152i;
                C119183a aVar = new C119183a(gWalletQueryProvider);
                bVar.mo164429c("query details");
                Intent intent = new Intent();
                if (arrayList == null || arrayList.size() == 0) {
                    Log.m105920e("MicroMsg.IabHelper", "query list is empty!");
                    C112708e eVar = new C112708e(5, "no query list or is empty");
                    intent.putExtra("RESPONSE_CODE", 5);
                    intent.putExtra("QUERY_DETAIL_INFO", new ArrayList());
                    aVar.mo183898a(eVar, intent);
                    return true;
                }
                try {
                    bVar.mo164432g("query detail list with the size is " + arrayList.size());
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
                    Bundle tx = bVar.f337419b.mo183340tx(3, bVar.f337418a.getPackageName(), "inapp", bundle);
                    int e = bVar.mo164431e(tx);
                    bVar.mo164432g("detail response: " + String.valueOf(e));
                    if (e != 0) {
                        bVar.mo164432g("cannot query details");
                        C112708e eVar2 = new C112708e(e, "cannot query details");
                        intent.putExtra("RESPONSE_CODE", e);
                        aVar.mo183898a(eVar2, intent);
                        return true;
                    }
                    C112708e eVar3 = new C112708e(e, "query list ok!");
                    bVar.mo164432g("result code : " + e);
                    intent.putExtra("RESPONSE_CODE", e);
                    intent.putExtra("RESPONSE_QUERY_DETAIL_INFO", tx.getStringArrayList("DETAILS_LIST"));
                    aVar.mo183898a(eVar3, intent);
                    Iterator<String> it = tx.getStringArrayList("DETAILS_LIST").iterator();
                    while (it.hasNext()) {
                        bVar.mo164432g(it.next());
                    }
                    return true;
                } catch (RemoteException e2) {
                    bVar.mo164433h("RemoteException while launching query details ");
                    Log.printErrStackTrace("MicroMsg.IabHelper", e2, "", new Object[0]);
                    C112708e eVar4 = new C112708e(-1001, "Remote exception while starting purchase flow");
                    intent.putExtra("RESPONSE_CODE", 6);
                    intent.putExtra("QUERY_DETAIL_INFO", new ArrayList());
                    aVar.mo183898a(eVar4, intent);
                    return true;
                }
            }

            public boolean onPostExecute() {
                C112700b bVar = GWalletQueryProvider.this.f346147d;
                if (bVar != null) {
                    bVar.mo164430d();
                }
                GWalletQueryProvider.this.f346147d = null;
                return true;
            }

            public String toString() {
                return super.toString() + "|onIabSetupFinished";
            }
        }

        public C115453a() {
        }

        /* renamed from: a */
        public void mo164437a(C112708e eVar) {
            Log.m105918d("MicroMsg.GWalletQueryProvider", "Setup finished.");
            if (!(eVar.f337440a == 0)) {
                Log.m105920e("MicroMsg.GWalletQueryProvider", "Problem setting up in-app billing: " + eVar);
                GWalletQueryProvider gWalletQueryProvider = GWalletQueryProvider.this;
                gWalletQueryProvider.f346149f = false;
                C112700b bVar = gWalletQueryProvider.f346147d;
                if (bVar != null) {
                    bVar.mo164430d();
                }
                GWalletQueryProvider.this.f346147d = null;
                return;
            }
            C86709a0.m107525e().postAtFrontOfWorker(new C115454a());
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        Log.m105918d("MicroMsg.GWalletQueryProvider", "successfully loaded");
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01f5, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor query(android.net.Uri r18, java.lang.String[] r19, java.lang.String r20, java.lang.String[] r21, java.lang.String r22) {
        /*
            r17 = this;
            r1 = r17
            r0 = r21
            java.lang.Class<com.tencent.mm.plugin.gwallet.GWalletQueryProvider> r2 = com.tencent.p014mm.plugin.gwallet.GWalletQueryProvider.class
            monitor-enter(r2)
            java.lang.String r3 = "MicroMsg.GWalletQueryProvider"
            java.lang.String r4 = "Creating IAB helper."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r4)     // Catch:{ all -> 0x0205 }
            if (r0 == 0) goto L_0x01f6
            int r3 = r0.length     // Catch:{ all -> 0x0205 }
            if (r3 == 0) goto L_0x01f6
            android.content.Context r3 = r17.getContext()     // Catch:{ all -> 0x0205 }
            r1.f346148e = r3     // Catch:{ all -> 0x0205 }
            a02.b r4 = new a02.b     // Catch:{ all -> 0x0205 }
            r4.<init>(r3)     // Catch:{ all -> 0x0205 }
            r1.f346147d = r4     // Catch:{ all -> 0x0205 }
            r3 = 1
            r1.f346149f = r3     // Catch:{ all -> 0x0205 }
            r4 = 0
            r1.f346150g = r4     // Catch:{ all -> 0x0205 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0205 }
            r5.<init>()     // Catch:{ all -> 0x0205 }
            r1.f346152i = r5     // Catch:{ all -> 0x0205 }
            int r5 = r0.length     // Catch:{ all -> 0x0205 }
            r6 = 0
        L_0x002f:
            if (r6 >= r5) goto L_0x003b
            r7 = r0[r6]     // Catch:{ all -> 0x0205 }
            java.util.ArrayList<java.lang.String> r8 = r1.f346152i     // Catch:{ all -> 0x0205 }
            r8.add(r7)     // Catch:{ all -> 0x0205 }
            int r6 = r6 + 1
            goto L_0x002f
        L_0x003b:
            java.lang.String r0 = "MicroMsg.GWalletQueryProvider"
            java.lang.String r5 = "Starting setup."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r5)     // Catch:{ all -> 0x0205 }
            a02.b r0 = r1.f346147d     // Catch:{ all -> 0x0205 }
            com.tencent.mm.plugin.gwallet.GWalletQueryProvider$a r5 = new com.tencent.mm.plugin.gwallet.GWalletQueryProvider$a     // Catch:{ all -> 0x0205 }
            r5.<init>()     // Catch:{ all -> 0x0205 }
            r0.mo164434i(r5)     // Catch:{ all -> 0x0205 }
            r5 = 0
        L_0x004e:
            r7 = 30000(0x7530, double:1.4822E-319)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x006f
            boolean r7 = r1.f346149f     // Catch:{ all -> 0x0205 }
            if (r7 == 0) goto L_0x006f
            boolean r7 = r1.f346150g     // Catch:{ all -> 0x0205 }
            if (r7 != 0) goto L_0x006f
            r7 = 100
            java.lang.Thread.sleep(r7)     // Catch:{ InterruptedException -> 0x0063 }
            long r5 = r5 + r7
            goto L_0x004e
        L_0x0063:
            r0 = move-exception
            r7 = r0
            java.lang.String r0 = "MicroMsg.GWalletQueryProvider"
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0205 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r7)     // Catch:{ all -> 0x0205 }
            goto L_0x004e
        L_0x006f:
            boolean r5 = r1.f346149f     // Catch:{ all -> 0x0205 }
            r6 = 5
            r7 = 4
            r8 = 3
            r9 = 2
            r10 = 6
            if (r5 != 0) goto L_0x00bc
            java.lang.String r0 = "MicroMsg.GWalletQueryProvider"
            java.lang.String r5 = "unable to setup"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r5)     // Catch:{ all -> 0x0205 }
            android.database.MatrixCursor r0 = new android.database.MatrixCursor     // Catch:{ all -> 0x0205 }
            java.lang.String[] r5 = f346146n     // Catch:{ all -> 0x0205 }
            r0.<init>(r5)     // Catch:{ all -> 0x0205 }
            java.util.ArrayList<java.lang.String> r5 = r1.f346152i     // Catch:{ all -> 0x0205 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0205 }
        L_0x008c:
            boolean r11 = r5.hasNext()     // Catch:{ all -> 0x0205 }
            if (r11 == 0) goto L_0x00ba
            java.lang.Object r11 = r5.next()     // Catch:{ all -> 0x0205 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0205 }
            java.lang.Object[] r12 = new java.lang.Object[r10]     // Catch:{ all -> 0x0205 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0205 }
            r12[r4] = r13     // Catch:{ all -> 0x0205 }
            r12[r3] = r11     // Catch:{ all -> 0x0205 }
            java.lang.String r11 = ""
            r12[r9] = r11     // Catch:{ all -> 0x0205 }
            r11 = 10234(0x27fa, float:1.4341E-41)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0205 }
            r12[r8] = r11     // Catch:{ all -> 0x0205 }
            java.lang.String r11 = ""
            r12[r7] = r11     // Catch:{ all -> 0x0205 }
            java.lang.String r11 = ""
            r12[r6] = r11     // Catch:{ all -> 0x0205 }
            r0.addRow(r12)     // Catch:{ all -> 0x0205 }
            goto L_0x008c
        L_0x00ba:
            monitor-exit(r2)     // Catch:{ all -> 0x0205 }
            return r0
        L_0x00bc:
            if (r0 <= 0) goto L_0x0102
            java.lang.String r0 = "MicroMsg.GWalletQueryProvider"
            java.lang.String r5 = "time's out"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r5)     // Catch:{ all -> 0x0205 }
            android.database.MatrixCursor r0 = new android.database.MatrixCursor     // Catch:{ all -> 0x0205 }
            java.lang.String[] r5 = f346146n     // Catch:{ all -> 0x0205 }
            r0.<init>(r5)     // Catch:{ all -> 0x0205 }
            java.util.ArrayList<java.lang.String> r5 = r1.f346152i     // Catch:{ all -> 0x0205 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0205 }
        L_0x00d2:
            boolean r11 = r5.hasNext()     // Catch:{ all -> 0x0205 }
            if (r11 == 0) goto L_0x0100
            java.lang.Object r11 = r5.next()     // Catch:{ all -> 0x0205 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0205 }
            java.lang.Object[] r12 = new java.lang.Object[r10]     // Catch:{ all -> 0x0205 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0205 }
            r12[r4] = r13     // Catch:{ all -> 0x0205 }
            r12[r3] = r11     // Catch:{ all -> 0x0205 }
            java.lang.String r11 = ""
            r12[r9] = r11     // Catch:{ all -> 0x0205 }
            r11 = 10235(0x27fb, float:1.4342E-41)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0205 }
            r12[r8] = r11     // Catch:{ all -> 0x0205 }
            java.lang.String r11 = ""
            r12[r7] = r11     // Catch:{ all -> 0x0205 }
            java.lang.String r11 = ""
            r12[r6] = r11     // Catch:{ all -> 0x0205 }
            r0.addRow(r12)     // Catch:{ all -> 0x0205 }
            goto L_0x00d2
        L_0x0100:
            monitor-exit(r2)     // Catch:{ all -> 0x0205 }
            return r0
        L_0x0102:
            java.lang.String r0 = "MicroMsg.GWalletQueryProvider"
            java.lang.String r5 = "successfully queried!"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r5)     // Catch:{ all -> 0x0205 }
            android.database.MatrixCursor r5 = new android.database.MatrixCursor     // Catch:{ all -> 0x0205 }
            java.lang.String[] r0 = f346146n     // Catch:{ all -> 0x0205 }
            r5.<init>(r0)     // Catch:{ all -> 0x0205 }
            int r0 = r1.f346153j     // Catch:{ all -> 0x0205 }
            if (r0 != 0) goto L_0x01be
            java.util.ArrayList<java.lang.String> r0 = r1.f346151h     // Catch:{ all -> 0x0205 }
            if (r0 == 0) goto L_0x0184
            java.util.Iterator r11 = r0.iterator()     // Catch:{ all -> 0x0205 }
            r12 = 0
        L_0x011d:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0205 }
            if (r0 == 0) goto L_0x0185
            java.lang.Object r0 = r11.next()     // Catch:{ all -> 0x0205 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0205 }
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ all -> 0x0205 }
            if (r13 != 0) goto L_0x0181
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0177 }
            r13.<init>(r0)     // Catch:{ JSONException -> 0x0177 }
            java.lang.String r0 = "productId"
            java.lang.String r0 = r13.getString(r0)     // Catch:{ JSONException -> 0x0177 }
            java.lang.String r14 = "price"
            java.lang.String r14 = r13.getString(r14)     // Catch:{ JSONException -> 0x0177 }
            java.lang.String r15 = "price_currency_code"
            java.lang.String r15 = r13.getString(r15)     // Catch:{ JSONException -> 0x0177 }
            java.lang.String r6 = "price_amount_micros"
            java.lang.String r6 = r13.getString(r6)     // Catch:{ JSONException -> 0x0177 }
            r13 = 10232(0x27f8, float:1.4338E-41)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ JSONException -> 0x0177 }
            java.lang.Object[] r7 = new java.lang.Object[r10]     // Catch:{ JSONException -> 0x0177 }
            int r16 = r12 + 1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ JSONException -> 0x0173 }
            r7[r4] = r12     // Catch:{ JSONException -> 0x0173 }
            r7[r3] = r0     // Catch:{ JSONException -> 0x0173 }
            r7[r9] = r14     // Catch:{ JSONException -> 0x0173 }
            r7[r8] = r13     // Catch:{ JSONException -> 0x0173 }
            r12 = 4
            r7[r12] = r15     // Catch:{ JSONException -> 0x0173 }
            r12 = 5
            r7[r12] = r6     // Catch:{ JSONException -> 0x0173 }
            r5.addRow(r7)     // Catch:{ JSONException -> 0x0173 }
            java.util.ArrayList<java.lang.String> r6 = r1.f346152i     // Catch:{ JSONException -> 0x0173 }
            r6.remove(r0)     // Catch:{ JSONException -> 0x0173 }
            r12 = r16
            goto L_0x0181
        L_0x0173:
            r0 = move-exception
            r12 = r16
            goto L_0x0178
        L_0x0177:
            r0 = move-exception
        L_0x0178:
            java.lang.String r6 = "MicroMsg.GWalletQueryProvider"
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0205 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r0)     // Catch:{ all -> 0x0205 }
        L_0x0181:
            r6 = 5
            r7 = 4
            goto L_0x011d
        L_0x0184:
            r12 = 0
        L_0x0185:
            java.util.ArrayList<java.lang.String> r0 = r1.f346152i     // Catch:{ all -> 0x0205 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0205 }
        L_0x018b:
            boolean r6 = r0.hasNext()     // Catch:{ all -> 0x0205 }
            if (r6 == 0) goto L_0x01f4
            java.lang.Object r6 = r0.next()     // Catch:{ all -> 0x0205 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0205 }
            java.lang.Object[] r7 = new java.lang.Object[r10]     // Catch:{ all -> 0x0205 }
            int r11 = r12 + 1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0205 }
            r7[r4] = r12     // Catch:{ all -> 0x0205 }
            r7[r3] = r6     // Catch:{ all -> 0x0205 }
            java.lang.String r6 = ""
            r7[r9] = r6     // Catch:{ all -> 0x0205 }
            r6 = 10233(0x27f9, float:1.434E-41)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0205 }
            r7[r8] = r6     // Catch:{ all -> 0x0205 }
            java.lang.String r6 = ""
            r12 = 4
            r7[r12] = r6     // Catch:{ all -> 0x0205 }
            java.lang.String r6 = ""
            r12 = 5
            r7[r12] = r6     // Catch:{ all -> 0x0205 }
            r5.addRow(r7)     // Catch:{ all -> 0x0205 }
            r12 = r11
            goto L_0x018b
        L_0x01be:
            java.util.ArrayList<java.lang.String> r0 = r1.f346152i     // Catch:{ all -> 0x0205 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0205 }
        L_0x01c4:
            boolean r6 = r0.hasNext()     // Catch:{ all -> 0x0205 }
            if (r6 == 0) goto L_0x01f4
            java.lang.Object r6 = r0.next()     // Catch:{ all -> 0x0205 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0205 }
            java.lang.Object[] r7 = new java.lang.Object[r10]     // Catch:{ all -> 0x0205 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0205 }
            r7[r4] = r11     // Catch:{ all -> 0x0205 }
            r7[r3] = r6     // Catch:{ all -> 0x0205 }
            java.lang.String r6 = ""
            r7[r9] = r6     // Catch:{ all -> 0x0205 }
            r6 = 10236(0x27fc, float:1.4344E-41)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0205 }
            r7[r8] = r6     // Catch:{ all -> 0x0205 }
            java.lang.String r6 = ""
            r11 = 4
            r7[r11] = r6     // Catch:{ all -> 0x0205 }
            java.lang.String r6 = ""
            r12 = 5
            r7[r12] = r6     // Catch:{ all -> 0x0205 }
            r5.addRow(r7)     // Catch:{ all -> 0x0205 }
            goto L_0x01c4
        L_0x01f4:
            monitor-exit(r2)     // Catch:{ all -> 0x0205 }
            return r5
        L_0x01f6:
            java.lang.String r0 = "MicroMsg.GWalletQueryProvider"
            java.lang.String r3 = "no product id selected or size is 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r3)     // Catch:{ all -> 0x0205 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0205 }
            java.lang.String r3 = "no product id selected or size is 0"
            r0.<init>(r3)     // Catch:{ all -> 0x0205 }
            throw r0     // Catch:{ all -> 0x0205 }
        L_0x0205:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0205 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.gwallet.GWalletQueryProvider.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
