package com.tencent.p014mm.plugin.appbrand.backgroundfetch;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.ipcinvoker.type.IPCLong;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;

@C86522b(dependencies = {PluginAppBrand.class}, onProcess = {C80625v0.MATCH_APPBRAND})
/* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC */
public class AppBrandBackgroundFetchDataStorageIPC extends C86301e implements C29444w {

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC$WxappIdentity */
    public static class WxappIdentity implements Parcelable {
        public static final Parcelable.Creator<WxappIdentity> CREATOR = new C29407a();

        /* renamed from: d */
        public String f80223d;

        /* renamed from: e */
        public int f80224e;

        /* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC$WxappIdentity$a */
        public class C29407a implements Parcelable.Creator<WxappIdentity> {
            public Object createFromParcel(Parcel parcel) {
                return new WxappIdentity(parcel);
            }

            public Object[] newArray(int i) {
                return new WxappIdentity[i];
            }
        }

        public WxappIdentity() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f80223d);
            parcel.writeInt(this.f80224e);
        }

        public WxappIdentity(String str, int i) {
            this.f80223d = str;
            this.f80224e = i;
        }

        public WxappIdentity(Parcel parcel) {
            this.f80223d = parcel.readString();
            this.f80224e = parcel.readInt();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC$WxappIdentityWithAppId */
    public static class WxappIdentityWithAppId implements Parcelable {
        public static final Parcelable.Creator<WxappIdentityWithAppId> CREATOR = new C29408a();

        /* renamed from: d */
        public String f80225d;

        /* renamed from: e */
        public int f80226e;

        /* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC$WxappIdentityWithAppId$a */
        public class C29408a implements Parcelable.Creator<WxappIdentityWithAppId> {
            public Object createFromParcel(Parcel parcel) {
                return new WxappIdentityWithAppId(parcel);
            }

            public Object[] newArray(int i) {
                return new WxappIdentityWithAppId[i];
            }
        }

        public WxappIdentityWithAppId() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f80225d);
            parcel.writeInt(this.f80226e);
        }

        public WxappIdentityWithAppId(String str, int i) {
            this.f80225d = str;
            this.f80226e = i;
        }

        public WxappIdentityWithAppId(Parcel parcel) {
            this.f80225d = parcel.readString();
            this.f80226e = parcel.readInt();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC$WxappParams */
    public static class WxappParams implements Parcelable {
        public static final Parcelable.Creator<WxappParams> CREATOR = new C29409a();

        /* renamed from: d */
        public String f80227d;

        /* renamed from: e */
        public int f80228e;

        /* renamed from: f */
        public String f80229f;

        /* renamed from: g */
        public String f80230g;

        /* renamed from: h */
        public String f80231h;

        /* renamed from: i */
        public int f80232i;

        /* renamed from: j */
        public long f80233j;

        /* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC$WxappParams$a */
        public class C29409a implements Parcelable.Creator<WxappParams> {
            public Object createFromParcel(Parcel parcel) {
                return new WxappParams(parcel);
            }

            public Object[] newArray(int i) {
                return new WxappParams[i];
            }
        }

        public WxappParams() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f80227d);
            parcel.writeInt(this.f80228e);
            parcel.writeString(this.f80229f);
            parcel.writeString(this.f80230g);
            parcel.writeString(this.f80231h);
            parcel.writeInt(this.f80232i);
            parcel.writeLong(this.f80233j);
        }

        public WxappParams(String str, int i, String str2, String str3, String str4, int i2, long j) {
            this.f80227d = str;
            this.f80228e = i;
            this.f80229f = str2;
            this.f80230g = str3;
            this.f80231h = str4;
            this.f80232i = i2;
            this.f80233j = j;
        }

        public WxappParams(Parcel parcel) {
            this.f80227d = parcel.readString();
            this.f80228e = parcel.readInt();
            this.f80229f = parcel.readString();
            this.f80230g = parcel.readString();
            this.f80231h = parcel.readString();
            this.f80232i = parcel.readInt();
            this.f80233j = parcel.readLong();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC$a */
    public static class C29410a implements C80916r<WxappIdentity, IPCBoolean> {
        private C29410a() {
        }

        public Object invoke(Object obj) {
            WxappIdentity wxappIdentity = (WxappIdentity) obj;
            if (wxappIdentity == null || Util.isNullOrNil(wxappIdentity.f80223d)) {
                Log.m105928w("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageIPC", "DeleteCall:data or username is null");
                return new IPCBoolean(false);
            }
            try {
                return new IPCBoolean(((C29444w) C86312j.m106911c(C29444w.class)).mo56670W0(wxappIdentity.f80223d, wxappIdentity.f80224e));
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageIPC", "DeleteCall fail", e);
                return new IPCBoolean(false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC$b */
    public static class C29411b implements C80916r<WxappIdentityWithAppId, AppBrandBackgroundFetchDataParcel> {
        private C29411b() {
        }

        public Object invoke(Object obj) {
            WxappIdentityWithAppId wxappIdentityWithAppId = (WxappIdentityWithAppId) obj;
            if (wxappIdentityWithAppId == null || Util.isNullOrNil(wxappIdentityWithAppId.f80225d)) {
                Log.m105928w("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageIPC", "GetByAppIdCall:data or appid is null");
                return null;
            }
            try {
                return ((C29444w) C86312j.m106911c(C29444w.class)).ro0(wxappIdentityWithAppId.f80225d, wxappIdentityWithAppId.f80226e);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageIPC", "GetByAppIdCall fail", e);
                return null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC$c */
    public static class C29412c implements C80916r<WxappIdentity, AppBrandBackgroundFetchDataParcel> {
        private C29412c() {
        }

        public Object invoke(Object obj) {
            WxappIdentity wxappIdentity = (WxappIdentity) obj;
            if (wxappIdentity == null || Util.isNullOrNil(wxappIdentity.f80223d)) {
                Log.m105928w("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageIPC", "GetCall:data or username is null");
                return null;
            }
            try {
                return ((C29444w) C86312j.m106911c(C29444w.class)).mo56669QV(wxappIdentity.f80223d, wxappIdentity.f80224e);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageIPC", "GetCall fail", e);
                return null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC$d */
    public static class C29413d implements C80916r<WxappIdentity, IPCLong> {
        private C29413d() {
        }

        public Object invoke(Object obj) {
            WxappIdentity wxappIdentity = (WxappIdentity) obj;
            if (wxappIdentity == null || Util.isNullOrNil(wxappIdentity.f80223d)) {
                Log.m105928w("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageIPC", "GetUpdateTimeCall:data or username is null");
                return new IPCLong(0);
            }
            try {
                return new IPCLong(((C29444w) C86312j.m106911c(C29444w.class)).mo56667NV(wxappIdentity.f80223d, wxappIdentity.f80224e));
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageIPC", "GetUpdateTimeCall fail", e);
                return new IPCLong(0);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataStorageIPC$e */
    public static class C29414e implements C80916r<WxappParams, IPCBoolean> {
        private C29414e() {
        }

        public Object invoke(Object obj) {
            WxappParams wxappParams = (WxappParams) obj;
            if (wxappParams == null || Util.isNullOrNil(wxappParams.f80227d)) {
                Log.m105928w("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageIPC", "SetCall:data or username is null");
                return new IPCBoolean(false);
            }
            try {
                return new IPCBoolean(((C29444w) C86312j.m106911c(C29444w.class)).mo56668OF(wxappParams.f80227d, wxappParams.f80228e, wxappParams.f80229f, wxappParams.f80230g, wxappParams.f80231h, wxappParams.f80232i, wxappParams.f80233j));
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageIPC", "SetCall fail", e);
                return new IPCBoolean(false);
            }
        }
    }

    /* renamed from: NV */
    public long mo56667NV(String str, int i) {
        Log.m105918d("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageIPC", "AppBrandBackgroundFetchDataStorageIPC getUpdateTime");
        IPCLong iPCLong = (IPCLong) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, new WxappIdentity(str, i), C29413d.class);
        if (iPCLong != null) {
            return iPCLong.f10314d;
        }
        return 0;
    }

    /* renamed from: OF */
    public boolean mo56668OF(String str, int i, String str2, String str3, String str4, int i2, long j) {
        Log.m105918d("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageIPC", "AppBrandBackgroundFetchDataStorageIPC set");
        IPCBoolean iPCBoolean = (IPCBoolean) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, new WxappParams(str, i, str2, str3, str4, i2, j), C29414e.class);
        return iPCBoolean != null && iPCBoolean.f10312d;
    }

    /* renamed from: QV */
    public AppBrandBackgroundFetchDataParcel mo56669QV(String str, int i) {
        Log.m105918d("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageIPC", "AppBrandBackgroundFetchDataStorageIPC get");
        return (AppBrandBackgroundFetchDataParcel) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, new WxappIdentity(str, i), C29412c.class);
    }

    /* renamed from: W0 */
    public boolean mo56670W0(String str, int i) {
        Log.m105918d("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageIPC", "AppBrandBackgroundFetchDataStorageIPC delete");
        IPCBoolean iPCBoolean = (IPCBoolean) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, new WxappIdentity(str, i), C29410a.class);
        return iPCBoolean != null && iPCBoolean.f10312d;
    }

    public AppBrandBackgroundFetchDataParcel ro0(String str, int i) {
        Log.m105918d("MicroMsg.AppBrand.AppBrandBackgroundFetchDataStorageIPC", "AppBrandBackgroundFetchDataStorageIPC getByAppId");
        return (AppBrandBackgroundFetchDataParcel) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, new WxappIdentityWithAppId(str, i), C29411b.class);
    }
}
