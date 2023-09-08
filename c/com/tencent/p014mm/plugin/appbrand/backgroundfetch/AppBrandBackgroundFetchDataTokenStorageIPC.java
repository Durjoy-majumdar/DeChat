package com.tencent.p014mm.plugin.appbrand.backgroundfetch;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;

@C86522b(dependencies = {PluginAppBrand.class}, onProcess = {C80625v0.MATCH_APPBRAND})
/* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataTokenStorageIPC */
public class AppBrandBackgroundFetchDataTokenStorageIPC extends C86301e implements C29445x {

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataTokenStorageIPC$WxappParams */
    public static class WxappParams implements Parcelable {
        public static final Parcelable.Creator<WxappParams> CREATOR = new C29416a();

        /* renamed from: d */
        public String f80236d;

        /* renamed from: e */
        public String f80237e;

        /* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataTokenStorageIPC$WxappParams$a */
        public class C29416a implements Parcelable.Creator<WxappParams> {
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
            parcel.writeString(this.f80236d);
            parcel.writeString(this.f80237e);
        }

        public WxappParams(String str, String str2) {
            this.f80236d = str;
            this.f80237e = str2;
        }

        public WxappParams(Parcel parcel) {
            this.f80236d = parcel.readString();
            this.f80237e = parcel.readString();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataTokenStorageIPC$a */
    public static class C29417a implements C80916r<IPCString, IPCBoolean> {
        private C29417a() {
        }

        public Object invoke(Object obj) {
            IPCString iPCString = (IPCString) obj;
            if (iPCString == null || Util.isNullOrNil(iPCString.f10315d)) {
                Log.m105928w("MicroMsg.AppBrand.AppBrandBackgroundFetchDataTokenStorageIPC", "DeleteCall:data or username is null");
                return new IPCBoolean(false);
            }
            try {
                return new IPCBoolean(((C29445x) C86312j.m106911c(C29445x.class)).mo56689c(iPCString.f10315d));
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrand.AppBrandBackgroundFetchDataTokenStorageIPC", "DeleteCall fail", e);
                return new IPCBoolean(false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataTokenStorageIPC$b */
    public static class C29418b implements C80916r<IPCString, AppBrandBackgroundFetchDataTokenParcel> {
        private C29418b() {
        }

        public Object invoke(Object obj) {
            IPCString iPCString = (IPCString) obj;
            if (iPCString == null || Util.isNullOrNil(iPCString.f10315d)) {
                Log.m105928w("MicroMsg.AppBrand.AppBrandBackgroundFetchDataTokenStorageIPC", "GetCall:data or username is null");
                return null;
            }
            try {
                return ((C29445x) C86312j.m106911c(C29445x.class)).get(iPCString.f10315d);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrand.AppBrandBackgroundFetchDataTokenStorageIPC", "GetCall fail", e);
                return null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataTokenStorageIPC$c */
    public static class C29419c implements C80916r<WxappParams, IPCBoolean> {
        private C29419c() {
        }

        public Object invoke(Object obj) {
            WxappParams wxappParams = (WxappParams) obj;
            if (wxappParams == null || Util.isNullOrNil(wxappParams.f80236d)) {
                Log.m105928w("MicroMsg.AppBrand.AppBrandBackgroundFetchDataTokenStorageIPC", "SetCall:data or username is null");
                return new IPCBoolean(false);
            }
            try {
                return new IPCBoolean(((C29445x) C86312j.m106911c(C29445x.class)).mo56688B9(wxappParams.f80236d, wxappParams.f80237e));
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrand.AppBrandBackgroundFetchDataTokenStorageIPC", "SetCall fail", e);
                return new IPCBoolean(false);
            }
        }
    }

    /* renamed from: B9 */
    public boolean mo56688B9(String str, String str2) {
        IPCBoolean iPCBoolean = (IPCBoolean) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, new WxappParams(str, str2), C29419c.class);
        return iPCBoolean != null && iPCBoolean.f10312d;
    }

    /* renamed from: c */
    public boolean mo56689c(String str) {
        IPCBoolean iPCBoolean = (IPCBoolean) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, new IPCString(str), C29417a.class);
        return iPCBoolean != null && iPCBoolean.f10312d;
    }

    public AppBrandBackgroundFetchDataTokenParcel get(String str) {
        return (AppBrandBackgroundFetchDataTokenParcel) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, new IPCString(str), C29418b.class);
    }
}
