package com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.launching.C29567d1;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.sdk.platformtools.Util;
import wq0.C91062d;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.JsApiNavigateToDevMiniProgram */
public final class JsApiNavigateToDevMiniProgram extends C82792a {
    private static final int CTRL_INDEX = 351;
    private static final String NAME = "navigateToDevMiniProgram";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.JsApiNavigateToDevMiniProgram$DevPkgInfo */
    public static final class DevPkgInfo implements Parcelable {
        public static final Parcelable.Creator<DevPkgInfo> CREATOR = new C82785a();

        /* renamed from: d */
        public String f242142d;

        /* renamed from: e */
        public String f242143e;

        /* renamed from: f */
        public String f242144f;

        /* renamed from: g */
        public String f242145g;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.JsApiNavigateToDevMiniProgram$DevPkgInfo$a */
        public class C82785a implements Parcelable.Creator<DevPkgInfo> {
            public Object createFromParcel(Parcel parcel) {
                return new DevPkgInfo(parcel);
            }

            public Object[] newArray(int i) {
                return new DevPkgInfo[i];
            }
        }

        public DevPkgInfo() {
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "DevPkgInfo{appId='" + this.f242142d + '\'' + ", downloadURL='" + this.f242143e + '\'' + ", checkSumMd5='" + this.f242144f + '\'' + ", extoptions='" + this.f242145g + '\'' + '}';
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f242142d);
            parcel.writeString(this.f242143e);
            parcel.writeString(this.f242144f);
            parcel.writeString(this.f242145g);
        }

        public DevPkgInfo(Parcel parcel) {
            this.f242142d = parcel.readString();
            this.f242143e = parcel.readString();
            this.f242144f = parcel.readString();
            this.f242145g = parcel.readString();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.JsApiNavigateToDevMiniProgram$a */
    public static final class C82786a implements C80916r<DevPkgInfo, IPCVoid> {
        public Object invoke(Object obj) {
            DevPkgInfo devPkgInfo = (DevPkgInfo) obj;
            ((C29567d1) C81161g2.Bx0(C29567d1.class)).mo56814Lo(devPkgInfo.f242142d, 1, devPkgInfo.f242145g);
            C81161g2.requireAccountInitializedOnDemand();
            if (C81161g2.f238471g.mo113526j(devPkgInfo.f242142d, 1, devPkgInfo.f242143e, devPkgInfo.f242144f, 0, 7200 + Util.nowSecond())) {
                AppBrandProcessesManager.m103869I().mo111407t(devPkgInfo.f242142d, 1);
            }
            return IPCVoid.f10316d;
        }
    }

    static {
        C91062d.m114234a(NAME);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0060, code lost:
        if (com.tencent.p014mm.ipcinvoker.C80907o.m98783f(com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName(), r4, com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.JsApiNavigateToDevMiniProgram.C82786a.class) != null) goto L_0x0073;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1505u(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r10, org.json.JSONObject r11, int r12) {
        /*
            r9 = this;
            r1 = r10
            com.tencent.mm.plugin.appbrand.g r1 = (com.tencent.p014mm.plugin.appbrand.C81879g) r1
            java.lang.String r10 = "appId"
            java.lang.String r2 = r11.optString(r10)
            java.lang.String r10 = "downloadURL"
            java.lang.String r10 = r11.optString(r10)
            java.lang.String r0 = "checkSumMd5"
            java.lang.String r0 = r11.optString(r0)
            java.lang.String r3 = "envVersion"
            java.lang.String r3 = r11.optString(r3)
            com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b r4 = com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82793b.DEVELOP
            com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b r3 = com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82793b.m101536a(r3, r4)
            java.lang.String r5 = "relativeURL"
            java.lang.String r5 = r11.optString(r5)
            java.lang.String r6 = "extoptions"
            java.lang.String r6 = r11.optString(r6)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r7 == 0) goto L_0x003f
            java.lang.String r10 = "fail:appID is empty"
            java.lang.String r10 = r9.mo115109j(r10)
            r1.mo109647a(r12, r10)
            goto L_0x00c0
        L_0x003f:
            r7 = 0
            if (r4 != r3) goto L_0x007f
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x007f
            com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.JsApiNavigateToDevMiniProgram$DevPkgInfo r4 = new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.JsApiNavigateToDevMiniProgram$DevPkgInfo
            r4.<init>()
            r4.f242142d = r2
            r4.f242143e = r10
            r4.f242144f = r0
            r4.f242145g = r6
            r10 = 1
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()     // Catch:{ Exception -> 0x0063 }
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.JsApiNavigateToDevMiniProgram$a> r6 = com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.JsApiNavigateToDevMiniProgram.C82786a.class
            android.os.Parcelable r0 = com.tencent.p014mm.ipcinvoker.C80907o.m98783f(r0, r4, r6)     // Catch:{ Exception -> 0x0063 }
            if (r0 == 0) goto L_0x0072
            goto L_0x0073
        L_0x0063:
            r0 = move-exception
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r7] = r4
            r6[r10] = r0
            java.lang.String r10 = "MicroMsg.AppBrand.JsApiNavigateToDevMiniProgram"
            java.lang.String r0 = "invoke IPCFlushDevPkg, parcel:%s, exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r0, r6)
        L_0x0072:
            r10 = 0
        L_0x0073:
            if (r10 != 0) goto L_0x007f
            java.lang.String r10 = "fail save packageInfo failed"
            java.lang.String r10 = r9.mo115109j(r10)
            r1.mo109647a(r12, r10)
            goto L_0x00c0
        L_0x007f:
            com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.c$a r10 = new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.c$a
            r10.<init>()
            java.lang.String r0 = "scene"
            int r0 = r11.optInt(r0, r7)
            r10.f242157a = r0
            java.lang.String r0 = "sceneNote"
            java.lang.String r0 = r11.optString(r0)
            r10.f242158b = r0
            java.lang.String r0 = "preScene"
            int r0 = r11.optInt(r0, r7)
            r10.f242159c = r0
            java.lang.String r0 = "preSceneNote"
            java.lang.String r0 = r11.optString(r0)
            r10.f242160d = r0
            java.lang.String r0 = "noRelaunchIfPathUnchanged"
            boolean r0 = r11.optBoolean(r0, r7)
            r10.f242165i = r0
            com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.r r0 = com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82819r.f242212b
            int r3 = r3.f242156d
            com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.i r8 = new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.i
            r8.<init>(r9, r1, r12)
            r7 = 0
            r4 = r5
            r5 = r10
            r6 = r11
            r0.mo115046b(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x00c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.JsApiNavigateToDevMiniProgram.mo1505u(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject, int):void");
    }

    /* renamed from: w */
    public C82794c mo114794w() {
        return C82819r.f242212b;
    }
}
