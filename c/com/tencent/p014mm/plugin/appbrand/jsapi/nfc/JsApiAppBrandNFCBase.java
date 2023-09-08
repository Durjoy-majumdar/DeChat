package com.tencent.p014mm.plugin.appbrand.jsapi.nfc;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import xl0.C91283d;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.nfc.JsApiAppBrandNFCBase */
public abstract class JsApiAppBrandNFCBase extends C82268c {

    /* renamed from: g */
    public C82847a f242267g = null;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.nfc.JsApiAppBrandNFCBase$a */
    public interface C82847a {
        /* renamed from: a */
        void mo115071a(int i, String str);
    }

    /* renamed from: w */
    public final void mo115068w(C82847a aVar, boolean z) {
        this.f242267g = aVar;
        new CheckIsSupportHCETask(this, z).mo114395c();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.nfc.JsApiAppBrandNFCBase$CheckIsSupportHCETask */
    public static class CheckIsSupportHCETask extends MainProcessTask {
        public static final Parcelable.Creator<CheckIsSupportHCETask> CREATOR = new C82846a();

        /* renamed from: f */
        public JsApiAppBrandNFCBase f242268f;

        /* renamed from: g */
        public int f242269g;

        /* renamed from: h */
        public String f242270h;

        /* renamed from: i */
        public boolean f242271i;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.nfc.JsApiAppBrandNFCBase$CheckIsSupportHCETask$a */
        public class C82846a implements Parcelable.Creator<CheckIsSupportHCETask> {
            public Object createFromParcel(Parcel parcel) {
                return new CheckIsSupportHCETask(parcel);
            }

            public Object[] newArray(int i) {
                return new CheckIsSupportHCETask[0];
            }
        }

        public CheckIsSupportHCETask(JsApiAppBrandNFCBase jsApiAppBrandNFCBase, boolean z) {
            this.f242268f = jsApiAppBrandNFCBase;
            this.f242271i = z;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f242269g = parcel.readInt();
            this.f242270h = parcel.readString();
            boolean z = true;
            if (1 != parcel.readInt()) {
                z = false;
            }
            this.f242271i = z;
        }

        /* renamed from: i */
        public void mo1552i() {
            mo114397h();
            JsApiAppBrandNFCBase jsApiAppBrandNFCBase = this.f242268f;
            if (jsApiAppBrandNFCBase != null) {
                int i = this.f242269g;
                String str = this.f242270h;
                jsApiAppBrandNFCBase.getClass();
                Log.m105925i("MicroMsg.JsApiAppBrandNFCBase", "alvinluo checkIsSupport resultCallback errCode: %d, errMsg: %s", Integer.valueOf(i), str);
                if (i == 0) {
                    C82847a aVar = jsApiAppBrandNFCBase.f242267g;
                    if (aVar != null) {
                        aVar.mo115071a(i, str);
                        return;
                    }
                    return;
                }
                if (Util.isNullOrNil(str)) {
                    str = "unknown error";
                }
                C82847a aVar2 = jsApiAppBrandNFCBase.f242267g;
                if (aVar2 != null) {
                    aVar2.mo115071a(i, str);
                }
            }
        }

        /* renamed from: j */
        public void mo1553j() {
            if (!C91283d.m114511a()) {
                this.f242269g = 13000;
                this.f242270h = "not support NFC";
            } else if (!MMApplicationContext.getContext().getPackageManager().hasSystemFeature("android.hardware.nfc.hce")) {
                this.f242269g = 13002;
                this.f242270h = "not support HCE";
            } else if (!this.f242271i || C91283d.m114512b()) {
                this.f242269g = 0;
                this.f242270h = "support HCE and system NFC switch is opened";
            } else {
                this.f242269g = 13001;
                this.f242270h = "system NFC switch not opened";
            }
            mo114394b();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f242269g);
            parcel.writeString(this.f242270h);
            parcel.writeInt(this.f242271i ? 1 : 0);
        }

        public CheckIsSupportHCETask(Parcel parcel) {
            this.f242268f = null;
            mo1551g(parcel);
        }
    }
}
