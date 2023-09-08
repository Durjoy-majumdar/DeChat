package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import q20.C89449a;

@C89449a
/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandUIDeclarePromptIPC */
public class AppBrandUIDeclarePromptIPC implements C80883e<IPCDeclarePromptCallbackParam, IPCVoid> {
    public void invoke(Object obj, C1256g gVar) {
        String[] split;
        IPCDeclarePromptCallbackParam iPCDeclarePromptCallbackParam = (IPCDeclarePromptCallbackParam) obj;
        if (iPCDeclarePromptCallbackParam == null) {
            Log.m105924i("MicroMsg.AppBrandUIDeclarePromptIPC", "data == null");
            if (gVar != null) {
                gVar.mo894a(new IPCVoid());
                return;
            }
            return;
        }
        boolean z = false;
        Log.m105925i("MicroMsg.AppBrandUIDeclarePromptIPC", "bizType:%s cancel:%s funcId:%s", Integer.valueOf(iPCDeclarePromptCallbackParam.f11896d), Boolean.valueOf(iPCDeclarePromptCallbackParam.f11897e), Util.nullAs(iPCDeclarePromptCallbackParam.f11898f, ""));
        int i = iPCDeclarePromptCallbackParam.f11896d;
        if (i == 1) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_JD_ENTRANCE_DECLARE_CLICK_BOOLEAN_SYNC, Boolean.TRUE);
        } else if (i == 2) {
            String str = iPCDeclarePromptCallbackParam.f11898f;
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_MALL_THIRD_PARTY_DISCLAIMER_STRING;
            if (!Util.isNullOrNil(str)) {
                C86709a0.m107528h();
                String str2 = (String) C86709a0.m107535s().mo121142i().mo119685f(aVar, (Object) null);
                if (!(Util.isNullOrNil(str2) || (split = str2.split(",")) == null || split.length == 0)) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= split.length) {
                            break;
                        } else if (split[i2].equals(str)) {
                            z = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (!z) {
                        str = str2 + "," + str;
                    } else {
                        str = str2;
                    }
                }
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(aVar, str);
            }
        }
        if (gVar != null) {
            gVar.mo894a(new IPCVoid());
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandUIDeclarePromptIPC$IPCDeclarePromptCallbackParam */
    public static final class IPCDeclarePromptCallbackParam implements Parcelable {
        public static final Parcelable.Creator<IPCDeclarePromptCallbackParam> CREATOR = new C1982a();

        /* renamed from: d */
        public int f11896d;

        /* renamed from: e */
        public boolean f11897e;

        /* renamed from: f */
        public String f11898f;

        /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandUIDeclarePromptIPC$IPCDeclarePromptCallbackParam$a */
        public class C1982a implements Parcelable.Creator<IPCDeclarePromptCallbackParam> {
            public Object createFromParcel(Parcel parcel) {
                return new IPCDeclarePromptCallbackParam(parcel);
            }

            public Object[] newArray(int i) {
                return new IPCDeclarePromptCallbackParam[i];
            }
        }

        public IPCDeclarePromptCallbackParam(int i, boolean z, String str) {
            this.f11896d = i;
            this.f11897e = z;
            this.f11898f = str;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f11896d);
            parcel.writeByte(this.f11897e ? (byte) 1 : 0);
            parcel.writeString(this.f11898f);
        }

        public IPCDeclarePromptCallbackParam(Parcel parcel) {
            this.f11896d = parcel.readInt();
            this.f11897e = parcel.readByte() != 0;
            this.f11898f = parcel.readString();
        }
    }
}
