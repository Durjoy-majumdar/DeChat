package com.tencent.p014mm.plugin.appbrand.launching;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.luggage.sdk.config.LaunchWxaAppInfoParcelized;
import com.tencent.p014mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle;
import com.tencent.p014mm.plugin.appbrand.permission.appidABTest.AppRuntimeAppidABTestPermissionBundle;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify */
public interface ILaunchWxaAppInfoNotify {

    /* renamed from: m0 */
    public static final ILaunchWxaAppInfoNotify f243337m0 = new C83273a();

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify$AppidABTestIpcWrapper */
    public static class AppidABTestIpcWrapper implements Parcelable {
        public static final Parcelable.Creator<AppidABTestIpcWrapper> CREATOR = new C83270a();

        /* renamed from: d */
        public String f243338d;

        /* renamed from: e */
        public int f243339e;

        /* renamed from: f */
        public HashMap<String, AppRuntimeAppidABTestPermissionBundle> f243340f;

        /* renamed from: com.tencent.mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify$AppidABTestIpcWrapper$a */
        public class C83270a implements Parcelable.Creator<AppidABTestIpcWrapper> {
            public Object createFromParcel(Parcel parcel) {
                return new AppidABTestIpcWrapper(parcel);
            }

            public Object[] newArray(int i) {
                return new AppidABTestIpcWrapper[i];
            }
        }

        public AppidABTestIpcWrapper() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f243338d);
            parcel.writeInt(this.f243339e);
            parcel.writeMap(this.f243340f);
        }

        public AppidABTestIpcWrapper(Parcel parcel) {
            this.f243338d = parcel.readString();
            this.f243339e = parcel.readInt();
            this.f243340f = parcel.readHashMap(AppRuntimeApiPermissionBundle.class.getClassLoader());
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify$LaunchInfoIpcWrapper */
    public static class LaunchInfoIpcWrapper implements Parcelable {
        public static final Parcelable.Creator<LaunchInfoIpcWrapper> CREATOR = new C83271a();

        /* renamed from: d */
        public String f243341d;

        /* renamed from: e */
        public int f243342e;

        /* renamed from: f */
        public LaunchWxaAppInfoParcelized f243343f;

        /* renamed from: com.tencent.mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify$LaunchInfoIpcWrapper$a */
        public class C83271a implements Parcelable.Creator<LaunchInfoIpcWrapper> {
            public Object createFromParcel(Parcel parcel) {
                return new LaunchInfoIpcWrapper(parcel);
            }

            public Object[] newArray(int i) {
                return new LaunchInfoIpcWrapper[i];
            }
        }

        public LaunchInfoIpcWrapper() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f243341d);
            parcel.writeInt(this.f243342e);
            parcel.writeParcelable(this.f243343f, i);
        }

        public LaunchInfoIpcWrapper(Parcel parcel) {
            this.f243341d = parcel.readString();
            this.f243342e = parcel.readInt();
            this.f243343f = (LaunchWxaAppInfoParcelized) parcel.readParcelable(LaunchWxaAppInfoParcelized.class.getClassLoader());
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify$PluginIpcWrapper */
    public static class PluginIpcWrapper implements Parcelable {
        public static final Parcelable.Creator<PluginIpcWrapper> CREATOR = new C83272a();

        /* renamed from: d */
        public String f243344d;

        /* renamed from: e */
        public int f243345e;

        /* renamed from: f */
        public HashMap<String, AppRuntimeApiPermissionBundle> f243346f;

        /* renamed from: com.tencent.mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify$PluginIpcWrapper$a */
        public class C83272a implements Parcelable.Creator<PluginIpcWrapper> {
            public Object createFromParcel(Parcel parcel) {
                return new PluginIpcWrapper(parcel);
            }

            public Object[] newArray(int i) {
                return new PluginIpcWrapper[i];
            }
        }

        public PluginIpcWrapper() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f243344d);
            parcel.writeInt(this.f243345e);
            parcel.writeMap(this.f243346f);
        }

        public PluginIpcWrapper(Parcel parcel) {
            this.f243344d = parcel.readString();
            this.f243345e = parcel.readInt();
            this.f243346f = parcel.readHashMap(AppRuntimeApiPermissionBundle.class.getClassLoader());
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify$a */
    public class C83273a implements ILaunchWxaAppInfoNotify {
        /* renamed from: a */
        public final String mo115555a(C83515w2 w2Var) {
            if (w2Var == null) {
                return "NULL";
            }
            try {
                return String.format(Locale.US, "bytes[%d]", new Object[]{Integer.valueOf(w2Var.field_jsapiInfo.f130770d.f257327a.length)});
            } catch (Exception e) {
                return String.format(Locale.US, "Exception[%s]", new Object[]{e});
            }
        }
    }
}
