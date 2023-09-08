package com.tencent.p014mm.plugin.appbrand.launching;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.luggage.sdk.launching.C80247h;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction */
public abstract class AppBrandLaunchErrorAction implements Parcelable {
    public static final C83245a CREATOR = new C83245a();

    /* renamed from: f */
    public static final C80247h[] f243115f = {C80247h.HEADLESS, C80247h.PRE_RENDER};

    /* renamed from: d */
    public final String f243116d;

    /* renamed from: e */
    public final int f243117e;

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction$a */
    public static final class C83245a implements Parcelable.Creator<AppBrandLaunchErrorAction> {
        /* JADX WARNING: type inference failed for: r0v6, types: [com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorActionAlert] */
        /* JADX WARNING: type inference failed for: r0v7, types: [com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorActionBlockBackgroundLaunch] */
        /* JADX WARNING: Failed to insert additional move for type inference */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.tencent.p014mm.plugin.appbrand.launching.AppBrandLaunchErrorAction mo115481a(java.lang.String r9, int r10, com.tencent.p014mm.plugin.appbrand.launching.C83515w2 r11) {
            /*
                r8 = this;
                r0 = 0
                if (r11 == 0) goto L_0x004a
                te3.rm2 r1 = r11.field_launchAction
                if (r1 != 0) goto L_0x0008
                goto L_0x004a
            L_0x0008:
                int r2 = r1.f259816d
                r3 = 2
                if (r2 == r3) goto L_0x0024
                r11 = 3
                if (r2 == r11) goto L_0x001a
                r11 = 5
                if (r2 == r11) goto L_0x0014
                goto L_0x0046
            L_0x0014:
                com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorActionBlockBackgroundLaunch r0 = new com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorActionBlockBackgroundLaunch
                r0.<init>(r9, r10)
                goto L_0x0046
            L_0x001a:
                com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorActionAlert r0 = new com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorActionAlert
                java.lang.String r11 = r1.f259820h
                java.lang.String r1 = r1.f259819g
                r0.<init>(r9, r10, r11, r1)
                goto L_0x0046
            L_0x0024:
                android.content.Intent r7 = new android.content.Intent
                r7.<init>()
                te3.rm2 r11 = r11.field_launchAction
                java.lang.String r11 = r11.f259817e
                java.lang.String r0 = "rawUrl"
                r7.putExtra(r0, r11)
                r11 = 1
                java.lang.String r0 = "forceHideShare"
                r7.putExtra(r0, r11)
                com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorActionStartActivity r0 = new com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorActionStartActivity
                java.lang.String r5 = "webview"
                java.lang.String r6 = ".ui.tools.WebViewUI"
                r2 = r0
                r3 = r9
                r4 = r10
                r2.<init>(r3, r4, r5, r6, r7)
            L_0x0046:
                if (r0 == 0) goto L_0x004a
                java.util.Set<com.tencent.mm.plugin.appbrand.ui.banner.l> r9 = com.tencent.p014mm.plugin.appbrand.p026ui.banner.C68645f.f197194a
            L_0x004a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.launching.AppBrandLaunchErrorAction.C83245a.mo115481a(java.lang.String, int, com.tencent.mm.plugin.appbrand.launching.w2):com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction");
        }

        public Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            if (readString == null) {
                return null;
            }
            try {
                return (AppBrandLaunchErrorAction) Class.forName(readString).getDeclaredConstructor(new Class[]{Parcel.class}).newInstance(new Object[]{parcel});
            } catch (Exception unused) {
                return null;
            }
        }

        public Object[] newArray(int i) {
            return new AppBrandLaunchErrorAction[i];
        }
    }

    public AppBrandLaunchErrorAction(Parcel parcel) {
        this.f243116d = parcel.readString();
        this.f243117e = parcel.readInt();
    }

    /* renamed from: a */
    public abstract void mo115478a(Context context, String str);

    public final int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getClass().getName());
        parcel.writeString(this.f243116d);
        parcel.writeInt(this.f243117e);
    }

    public AppBrandLaunchErrorAction(String str, int i) {
        this.f243116d = str;
        this.f243117e = i;
    }
}
