package um0;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.trafficcard.ITencentSmartcardOpenService;
import org.json.JSONObject;
import p349j9.C21196a;
import zt3.C119157j;

/* renamed from: um0.a */
public abstract class C90704a extends C82268c<C82554k> {

    /* renamed from: h */
    public static String f260537h;

    /* renamed from: g */
    public String f260538g = null;

    /* renamed from: um0.a$a */
    public class C22651a implements ServiceConnection {

        /* renamed from: d */
        public Context f65138d;

        /* renamed from: e */
        public C82554k f65139e;

        /* renamed from: f */
        public int f65140f;

        /* renamed from: g */
        public boolean f65141g;

        /* renamed from: h */
        public JSONObject f65142h;

        /* renamed from: um0.a$a$a */
        public class C22652a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ IInterface f65144d;

            public C22652a(IInterface iInterface) {
                this.f65144d = iInterface;
            }

            public void run() {
                C22651a aVar = C22651a.this;
                C90704a.this.mo35773w(aVar.f65139e, aVar.f65140f, this.f65144d, aVar.f65142h);
                C22651a aVar2 = C22651a.this;
                aVar2.f65138d.unbindService(aVar2);
            }
        }

        public C22651a(Context context, C82554k kVar, int i, boolean z, JSONObject jSONObject) {
            this.f65138d = context;
            this.f65139e = kVar;
            this.f65140f = i;
            this.f65141g = z;
            this.f65142h = jSONObject;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IInterface iInterface = null;
            if (this.f65141g) {
                int i = C21196a.C21197a.f59967d;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.nfc.sdk.service.IHwTransitOpenService");
                    iInterface = (queryLocalInterface == null || !(queryLocalInterface instanceof C21196a)) ? new C21196a.C21197a.C21198a(iBinder) : (C21196a) queryLocalInterface;
                }
            } else if (!TextUtils.isEmpty(C90704a.f260537h)) {
                iInterface = ITencentSmartcardOpenService.Stub.asInterface(iBinder);
            }
            if (iInterface != null) {
                ((C119157j) C119157j.f356862d).mo183875f(new C22652a(iInterface));
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0102, code lost:
        if (r7.equals("Default") != false) goto L_0x0104;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01cd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01d0 A[LOOP:1: B:58:0x0195->B:76:0x01d0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x022e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02a0  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1505u(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r20, org.json.JSONObject r21, int r22) {
        /*
            r19 = this;
            r8 = r19
            r0 = r21
            r9 = r22
            r10 = r20
            com.tencent.mm.plugin.appbrand.jsapi.k r10 = (com.tencent.p014mm.plugin.appbrand.jsapi.C82554k) r10
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r1 = r10.getRuntime()
            android.app.Activity r11 = r1.mo113026R()
            java.lang.String r1 = r10.getAppId()
            r8.f260538g = r1
            java.lang.String r12 = "MicroMsg.AppBrandTrafficCardBaseJsApi"
            r13 = 2
            r14 = 1
            r15 = 0
            if (r11 != 0) goto L_0x0046
            um0.b r0 = um0.C22653b.f65159e
            int r0 = r0.f65181a
            java.lang.String r1 = "mmActivity is null."
            r8.mo124833x(r14, r0, r1)
            java.lang.String r0 = "fail:internal error invalid android context"
            java.lang.String r0 = r8.mo115109j(r0)
            r10.mo109647a(r9, r0)
            java.lang.Object[] r0 = new java.lang.Object[r13]
            java.lang.String r1 = r10.getAppId()
            r0[r15] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            r0[r14] = r1
            java.lang.String r1 = "mmActivity is null, invoke fail! with appId[%s] callbackId[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r1, r0)
            goto L_0x0309
        L_0x0046:
            java.lang.String r1 = "deviceType"
            java.lang.String r7 = r0.optString(r1)
            java.lang.String r1 = "deviceData"
            org.json.JSONObject r16 = r0.optJSONObject(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            java.lang.String r1 = "fail:"
            java.lang.String r2 = "errCode"
            r6 = 3
            if (r0 == 0) goto L_0x00a5
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            um0.b r3 = um0.C22653b.f65159e
            int r4 = r3.f65181a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r2, r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = r3.f65182b
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r0 = r8.mo115112m(r1, r0)
            r10.mo109647a(r9, r0)
            int r0 = r3.f65181a
            java.lang.String r1 = "deviceType is null."
            r8.mo124833x(r14, r0, r1)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r1 = r3.f65182b
            r0[r15] = r1
            java.lang.String r1 = r10.getAppId()
            r0[r14] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            r0[r13] = r1
            java.lang.String r1 = "deviceType is null, invoke fail: [%s] ! with appId[%s] callbackId[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r1, r0)
            goto L_0x0309
        L_0x00a5:
            java.lang.String r3 = android.os.Build.BRAND
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r15] = r7
            r0[r14] = r3
            java.lang.String r4 = "mini device type deviceType[%s], device brand[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r4, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            java.lang.String r4 = "Default"
            if (r0 != 0) goto L_0x0106
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r0 == 0) goto L_0x00c1
            goto L_0x0106
        L_0x00c1:
            java.lang.String r0 = r3.toLowerCase()
            r7.getClass()
            java.lang.String r5 = "HUAWEI"
            boolean r5 = r7.equals(r5)
            java.lang.String r6 = "honor"
            java.lang.String r13 = "huawei"
            if (r5 != 0) goto L_0x00d5
            goto L_0x00e2
        L_0x00d5:
            boolean r5 = r0.contains(r13)
            if (r5 != 0) goto L_0x0104
            boolean r5 = r0.contains(r6)
            if (r5 == 0) goto L_0x00e2
            goto L_0x0104
        L_0x00e2:
            java.lang.String r5 = r7.toLowerCase()
            boolean r13 = r0.contains(r13)
            if (r13 != 0) goto L_0x00f5
            boolean r6 = r0.contains(r6)
            if (r6 == 0) goto L_0x00f3
            goto L_0x00f5
        L_0x00f3:
            r6 = 0
            goto L_0x00f6
        L_0x00f5:
            r6 = 1
        L_0x00f6:
            if (r6 == 0) goto L_0x0106
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0104
            boolean r0 = r7.equals(r4)
            if (r0 == 0) goto L_0x0106
        L_0x0104:
            r13 = 1
            goto L_0x0107
        L_0x0106:
            r13 = 0
        L_0x0107:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            r17 = 0
            java.lang.String r6 = ""
            if (r0 != 0) goto L_0x0211
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r0 == 0) goto L_0x0119
            goto L_0x0211
        L_0x0119:
            java.lang.Object[] r0 = new java.lang.Object[r14]
            java.lang.String r5 = f260537h
            r0[r15] = r5
            java.lang.String r5 = "isOtherDevices, packageName: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r5, r0)
            java.lang.String r0 = f260537h
            if (r0 != 0) goto L_0x01ee
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r5 = h81.C32735h.C32737c.clicfg_nfc_card_support_config
            java.lang.String r0 = r0.Y60(r5, r6)
            java.lang.Object[] r5 = new java.lang.Object[r14]
            r5[r15] = r0
            java.lang.String r15 = "isOtherDevices, nfcCardCfg: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r15, r5)
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 == 0) goto L_0x0147
            goto L_0x0211
        L_0x0147:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x017a }
            r5.<init>(r0)     // Catch:{ Exception -> 0x017a }
            java.lang.String r0 = "isSupport"
            boolean r0 = r5.getBoolean(r0)     // Catch:{ Exception -> 0x017a }
            if (r0 == 0) goto L_0x0177
            java.lang.String r0 = "packageName"
            org.json.JSONArray r0 = r5.getJSONArray(r0)     // Catch:{ Exception -> 0x017a }
            if (r0 == 0) goto L_0x0177
            int r5 = r0.length()     // Catch:{ Exception -> 0x017a }
            if (r5 <= 0) goto L_0x0177
            int r5 = r0.length()     // Catch:{ Exception -> 0x017a }
            java.lang.String[] r15 = new java.lang.String[r5]     // Catch:{ Exception -> 0x017a }
            r14 = 0
        L_0x016a:
            if (r14 >= r5) goto L_0x018d
            java.lang.String r18 = r0.getString(r14)     // Catch:{ Exception -> 0x0175 }
            r15[r14] = r18     // Catch:{ Exception -> 0x0175 }
            int r14 = r14 + 1
            goto L_0x016a
        L_0x0175:
            r0 = move-exception
            goto L_0x017d
        L_0x0177:
            r15 = r17
            goto L_0x018d
        L_0x017a:
            r0 = move-exception
            r15 = r17
        L_0x017d:
            r5 = 1
            java.lang.Object[] r14 = new java.lang.Object[r5]
            java.lang.String r0 = r0.getMessage()
            r5 = 0
            r14[r5] = r0
            java.lang.String r0 = "parse nfc card config Exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r0, r14)
        L_0x018d:
            if (r15 != 0) goto L_0x0194
        L_0x018f:
            r21 = r6
            r18 = r11
            goto L_0x01d7
        L_0x0194:
            r5 = 0
        L_0x0195:
            int r0 = r15.length
            if (r5 >= r0) goto L_0x018f
            r0 = r15[r5]
            boolean r14 = android.text.TextUtils.isEmpty(r0)
            if (r14 == 0) goto L_0x01a5
            r21 = r6
            r18 = r11
            goto L_0x01c9
        L_0x01a5:
            android.content.pm.PackageManager r14 = r11.getPackageManager()     // Catch:{ Exception -> 0x01b5 }
            r21 = r6
            r6 = 0
            android.content.pm.PackageInfo r0 = r14.getPackageInfo(r0, r6)     // Catch:{ Exception -> 0x01b3 }
            r18 = r11
            goto L_0x01cb
        L_0x01b3:
            r0 = move-exception
            goto L_0x01b9
        L_0x01b5:
            r0 = move-exception
            r21 = r6
            r6 = 0
        L_0x01b9:
            r18 = r11
            r14 = 1
            java.lang.Object[] r11 = new java.lang.Object[r14]
            java.lang.String r0 = r0.getMessage()
            r11[r6] = r0
            java.lang.String r0 = "getPackageInfo exception: [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r0, r11)
        L_0x01c9:
            r0 = r17
        L_0x01cb:
            if (r0 == 0) goto L_0x01d0
            r0 = r15[r5]
            goto L_0x01d9
        L_0x01d0:
            int r5 = r5 + 1
            r6 = r21
            r11 = r18
            goto L_0x0195
        L_0x01d7:
            r0 = r17
        L_0x01d9:
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r5 = 0
            r6[r5] = r0
            java.lang.String r5 = "update OPPOPackage= %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r5, r6)
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L_0x01f2
            f260537h = r0
            goto L_0x01f2
        L_0x01ee:
            r21 = r6
            r18 = r11
        L_0x01f2:
            java.lang.String r0 = f260537h
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0215
            boolean r0 = r7.equals(r4)
            if (r0 == 0) goto L_0x0201
            goto L_0x020f
        L_0x0201:
            java.lang.String r0 = r3.toLowerCase()
            java.lang.String r3 = r7.toLowerCase()
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0215
        L_0x020f:
            r0 = 1
            goto L_0x0216
        L_0x0211:
            r21 = r6
            r18 = r11
        L_0x0215:
            r0 = 0
        L_0x0216:
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r13)
            r5 = 0
            r4[r5] = r3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            r5 = 1
            r4[r5] = r3
            java.lang.String r3 = "deviceType isHuaweiDevice: %s, isOtherDevice: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r3, r4)
            if (r13 != 0) goto L_0x027c
            if (r0 != 0) goto L_0x027c
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            um0.b r3 = um0.C22653b.f65159e
            int r4 = r3.f65181a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r2, r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = r3.f65182b
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r0 = r8.mo115112m(r1, r0)
            r10.mo109647a(r9, r0)
            int r0 = r3.f65181a
            java.lang.String r1 = "deviceType check invalid."
            r2 = 1
            r8.mo124833x(r2, r0, r1)
            r6 = 3
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r1 = r3.f65182b
            r3 = 0
            r0[r3] = r1
            java.lang.String r1 = r10.getAppId()
            r0[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            r2 = 2
            r0[r2] = r1
            java.lang.String r1 = "deviceType is invalid, invoke fail: [%s] ! with appId[%s] callbackId[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r1, r0)
            goto L_0x0309
        L_0x027c:
            r6 = 3
            um0.a$a r0 = new um0.a$a
            r1 = r0
            r2 = r19
            r3 = r18
            r4 = r10
            r5 = r22
            r11 = r21
            r14 = 3
            r6 = r13
            r15 = r7
            r7 = r16
            r1.<init>(r3, r4, r5, r6, r7)
            if (r13 == 0) goto L_0x02a0
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "com.huawei.nfc.action.TRANSIT_OPEN_SERVICE"
            r1.<init>(r2)
            java.lang.String r2 = "com.huawei.wallet"
            r1.setPackage(r2)
            goto L_0x02b7
        L_0x02a0:
            java.lang.String r1 = f260537h
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x02b5
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "com.tencent.mm.sdk.trafficcard.action.TRANSIT_OPEN_SERVICE"
            r1.<init>(r2)
            java.lang.String r2 = f260537h
            r1.setPackage(r2)
            goto L_0x02b7
        L_0x02b5:
            r1 = r17
        L_0x02b7:
            if (r1 != 0) goto L_0x02ba
            goto L_0x02d3
        L_0x02ba:
            r2 = r18
            r3 = 1
            boolean r0 = r2.bindService(r1, r0, r3)     // Catch:{ Exception -> 0x02c3 }
            r5 = r0
            goto L_0x02d4
        L_0x02c3:
            r0 = move-exception
            r1 = r0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r1 = r1.getMessage()
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "bind remote service exception [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r1, r0)
        L_0x02d3:
            r5 = 0
        L_0x02d4:
            if (r5 != 0) goto L_0x0301
            java.lang.String r0 = "fail:null system service"
            java.lang.String r0 = r8.mo115109j(r0)
            r10.mo109647a(r9, r0)
            um0.b r0 = um0.C22653b.f65159e
            int r0 = r0.f65181a
            java.lang.String r1 = "bind service failed."
            r2 = 1
            r8.mo124833x(r2, r0, r1)
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r1 = 0
            r0[r1] = r15
            java.lang.String r1 = r10.getAppId()
            r0[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            r2 = 2
            r0[r2] = r1
            java.lang.String r1 = "null system service, invoke fail! with deviceType[%s] appId[%s] callbackId[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r1, r0)
            goto L_0x0309
        L_0x0301:
            r2 = 1
            um0.b r0 = um0.C22653b.f65158d
            int r0 = r0.f65181a
            r8.mo124833x(r2, r0, r11)
        L_0x0309:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: um0.C90704a.mo1505u(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject, int):void");
    }

    /* renamed from: w */
    public abstract void mo35773w(C82554k kVar, int i, IInterface iInterface, JSONObject jSONObject);

    /* renamed from: x */
    public void mo124833x(int i, int i2, String str) {
        C115669n.INSTANCE.mo160131h(22506, this.f260538g, Integer.valueOf(i), Integer.valueOf(i2), str);
    }
}
