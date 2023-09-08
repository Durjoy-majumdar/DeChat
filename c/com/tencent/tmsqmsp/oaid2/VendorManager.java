package com.tencent.tmsqmsp.oaid2;

import android.content.Context;
import android.os.Build;
import com.tencent.midas.data.APMidasPluginInfo;

public class VendorManager implements IVendorCallback {
    public IVendorCallback userCallback = null;
    public C116443b vendorInfo = null;

    /* renamed from: com.tencent.tmsqmsp.oaid2.VendorManager$a */
    public static /* synthetic */ class C24301a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f69786a;

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tencent.tmsqmsp.oaid2.d[] r0 = com.tencent.tmsqmsp.oaid2.C24302d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f69786a = r0
                com.tencent.tmsqmsp.oaid2.d r1 = com.tencent.tmsqmsp.oaid2.C24302d.XIAOMI     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f69786a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.tmsqmsp.oaid2.d r1 = com.tencent.tmsqmsp.oaid2.C24302d.BLACKSHARK     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f69786a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.tmsqmsp.oaid2.d r1 = com.tencent.tmsqmsp.oaid2.C24302d.VIVO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f69786a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tencent.tmsqmsp.oaid2.d r1 = com.tencent.tmsqmsp.oaid2.C24302d.HUA_WEI     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f69786a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tencent.tmsqmsp.oaid2.d r1 = com.tencent.tmsqmsp.oaid2.C24302d.OPPO     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f69786a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.tencent.tmsqmsp.oaid2.d r1 = com.tencent.tmsqmsp.oaid2.C24302d.ONEPLUS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f69786a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.tencent.tmsqmsp.oaid2.d r1 = com.tencent.tmsqmsp.oaid2.C24302d.MOTO     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f69786a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.tencent.tmsqmsp.oaid2.d r1 = com.tencent.tmsqmsp.oaid2.C24302d.LENOVO     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f69786a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.tencent.tmsqmsp.oaid2.d r1 = com.tencent.tmsqmsp.oaid2.C24302d.ASUS     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f69786a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.tencent.tmsqmsp.oaid2.d r1 = com.tencent.tmsqmsp.oaid2.C24302d.SAMSUNG     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f69786a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.tencent.tmsqmsp.oaid2.d r1 = com.tencent.tmsqmsp.oaid2.C24302d.MEIZU     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f69786a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.tencent.tmsqmsp.oaid2.d r1 = com.tencent.tmsqmsp.oaid2.C24302d.ALPS     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f69786a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.tencent.tmsqmsp.oaid2.d r1 = com.tencent.tmsqmsp.oaid2.C24302d.NUBIA     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f69786a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.tencent.tmsqmsp.oaid2.d r1 = com.tencent.tmsqmsp.oaid2.C24302d.ZTE     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f69786a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.tencent.tmsqmsp.oaid2.d r1 = com.tencent.tmsqmsp.oaid2.C24302d.FREEMEOS     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f69786a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.tencent.tmsqmsp.oaid2.d r1 = com.tencent.tmsqmsp.oaid2.C24302d.SSUIOS     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmsqmsp.oaid2.VendorManager.C24301a.<clinit>():void");
        }
    }

    public int getVendorInfo(Context context, IVendorCallback iVendorCallback) {
        this.userCallback = iVendorCallback;
        C24302d a = C24302d.m30435a(Build.MANUFACTURER);
        if (a == C24302d.UNSUPPORT) {
            onResult(false, "null", "null");
            return C116441a.f349355a;
        }
        switch (C24301a.f69786a[a.ordinal()]) {
            case 1:
            case 2:
                this.vendorInfo = new C116471n0();
                break;
            case 3:
                this.vendorInfo = new C86068m0();
                break;
            case 4:
                this.vendorInfo = new C116468l();
                break;
            case 5:
            case 6:
                this.vendorInfo = new C116450f0();
                break;
            case 7:
            case 8:
                this.vendorInfo = new C116472o();
                break;
            case 9:
                this.vendorInfo = new C116456h();
                break;
            case 10:
                this.vendorInfo = new C116467k0();
                break;
            case 11:
            case 12:
                this.vendorInfo = new C116442a0();
                break;
            case 13:
                this.vendorInfo = new C116444b0();
                break;
            case 14:
            case 15:
            case 16:
                this.vendorInfo = new C116483u();
                break;
        }
        if (this.vendorInfo == null) {
            onResult(false, "null", "null");
            return C116441a.f349356b;
        }
        C116445c.m164139b(APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        try {
            this.vendorInfo.mo120388a(context, this);
            if (!this.vendorInfo.mo120392k()) {
                try {
                    this.vendorInfo.mo120391j();
                } catch (Exception unused) {
                    onResult(false, "null", "null");
                    return C116441a.f349357c;
                }
            } else {
                C116445c.m164139b("sync");
                try {
                    onResult(this.vendorInfo.mo120390e(), this.vendorInfo.mo120389d(), this.vendorInfo.mo120387a());
                } catch (Exception unused2) {
                    onResult(false, "null", "null");
                }
            }
            return 0;
        } catch (Exception unused3) {
            onResult(false, "null", "null");
            return C116441a.f349357c;
        }
    }

    public void onResult(boolean z, String str, String str2) {
        C116445c.m164140c("vm onResult ".concat(String.valueOf(z)));
        IVendorCallback iVendorCallback = this.userCallback;
        if (iVendorCallback != null) {
            iVendorCallback.onResult(z, str, str2);
        }
        C116443b bVar = this.vendorInfo;
        if (bVar != null) {
            bVar.mo120393l();
        }
    }
}
