package com.tencent.p014mm.pluginsdk.model.app;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86009m1;

/* renamed from: com.tencent.mm.pluginsdk.model.app.IPCInstallApp */
public class IPCInstallApp implements C80883e<IPCInstallAppParam, IPCBoolean> {
    public void invoke(Object obj, C1256g gVar) {
        IPCInstallAppParam iPCInstallAppParam = (IPCInstallAppParam) obj;
        Log.m105924i("MicroMsg.IPCInstallApp", "invoke()");
        int i = iPCInstallAppParam.f120796d;
        if (i == 1) {
            Context context = MMApplicationContext.getContext();
            String str = iPCInstallAppParam.f120797e;
            C44584v0 v0Var = new C44584v0(this, gVar);
            boolean z = iPCInstallAppParam.f120799g;
            Intent intent = new Intent("android.intent.action.VIEW");
            FileProviderHelper.setIntentDataAndType(context, intent, new C86009m1(str), "application/vnd.android.package-archive", false);
            intent.addFlags(268435456);
            C44563k0.m48978c(context, intent, v0Var, z);
        } else if (i == 2) {
            Context context2 = MMApplicationContext.getContext();
            Uri uri = iPCInstallAppParam.f120798f;
            C44585w0 w0Var = new C44585w0(this, gVar);
            boolean z2 = iPCInstallAppParam.f120799g;
            Intent intent2 = new Intent("android.intent.action.VIEW");
            FileProviderHelper.setIntentDataAndType(context2, intent2, uri, "application/vnd.android.package-archive", false);
            intent2.addFlags(268435456);
            C44563k0.m48978c(context2, intent2, w0Var, z2);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.model.app.IPCInstallApp$IPCInstallAppParam */
    public static final class IPCInstallAppParam implements Parcelable {
        public static final Parcelable.Creator<IPCInstallAppParam> CREATOR = new C44546a();

        /* renamed from: d */
        public int f120796d;

        /* renamed from: e */
        public String f120797e;

        /* renamed from: f */
        public Uri f120798f;

        /* renamed from: g */
        public boolean f120799g;

        /* renamed from: com.tencent.mm.pluginsdk.model.app.IPCInstallApp$IPCInstallAppParam$a */
        public class C44546a implements Parcelable.Creator<IPCInstallAppParam> {
            public Object createFromParcel(Parcel parcel) {
                return new IPCInstallAppParam(parcel);
            }

            public Object[] newArray(int i) {
                return new IPCInstallAppParam[i];
            }
        }

        public IPCInstallAppParam(int i, String str, Uri uri, boolean z) {
            this.f120796d = i;
            this.f120797e = str;
            this.f120798f = uri;
            this.f120799g = z;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f120796d);
            parcel.writeString(this.f120797e);
            parcel.writeParcelable(this.f120798f, i);
            parcel.writeByte(this.f120799g ? (byte) 1 : 0);
        }

        public IPCInstallAppParam(Parcel parcel) {
            this.f120796d = parcel.readInt();
            this.f120797e = parcel.readString();
            this.f120798f = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
            this.f120799g = parcel.readByte() != 0;
        }
    }
}
