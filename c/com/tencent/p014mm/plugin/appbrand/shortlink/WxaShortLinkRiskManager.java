package com.tencent.p014mm.plugin.appbrand.shortlink;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import di3.C86312j;
import dk0.C7356b;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import p1081gi.C98124g;
import p663qo.C101213l;
import p823sg.C77710q;
import q20.C89449a;

/* renamed from: com.tencent.mm.plugin.appbrand.shortlink.WxaShortLinkRiskManager */
public final class WxaShortLinkRiskManager {

    /* renamed from: a */
    public static final WxaShortLinkRiskManager f11879a = new WxaShortLinkRiskManager();

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/shortlink/WxaShortLinkRiskManager$a;", "Lcom/tencent/mm/ipcinvoker/d;", "Landroid/os/Bundle;", "Lcom/tencent/mm/plugin/appbrand/shortlink/WxaShortLinkRiskManager$UploadResult;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.appbrand.shortlink.WxaShortLinkRiskManager$a */
    public static final class C1969a implements C1255d<Bundle, UploadResult> {
        public void invoke(Object obj, C1256g gVar) {
            byte[] bArr;
            Bundle bundle = (Bundle) obj;
            if (bundle != null) {
                String string = bundle.getString("linkUrl");
                if (TextUtils.isEmpty(bundle.getString("data_mmkv_key", ""))) {
                    bArr = bundle.getByteArray("data");
                } else {
                    C7356b bVar = C7356b.f25481a;
                    String string2 = bundle.getString("data_mmkv_key");
                    C87412m.m108591d(string2);
                    bArr = bVar.mo8528a(string2, true);
                }
                C98124g gVar2 = new C98124g();
                gVar2.f287660d = "task_WxaMpShortLinkScreenshot";
                gVar2.field_fileType = 20304;
                gVar2.field_bzScene = 2;
                gVar2.field_appType = 302;
                gVar2.field_mediaId = new C77710q(C86709a0.m107523b().mo121110g()).longValue() + '_' + System.currentTimeMillis() + '_' + MD5Util.getMD5String(string);
                gVar2.f287650G = bArr;
                gVar2.field_needStorage = false;
                gVar2.f287662f = new C1970a(gVar);
                if (!((C101213l) C86312j.m106911c(C101213l.class)).if0(gVar2)) {
                    if (gVar != null) {
                        gVar.mo894a(new UploadResult(false, (String) null, 2, (C8480h) null));
                    }
                    Log.m105924i("MicroMsg.WxaShortLinkRiskManager", "cdn upload add task fail");
                }
            } else if (gVar != null) {
                gVar.mo894a(new UploadResult(false, (String) null, 2, (C8480h) null));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m1951a(com.tencent.p014mm.plugin.appbrand.shortlink.WxaShortLinkRiskManager r10, com.tencent.p014mm.plugin.appbrand.page.C83928t1 r11, java.lang.String r12, wx3.C15601d r13) {
        /*
            r10.getClass()
            boolean r0 = r13 instanceof or0.C11734p
            if (r0 == 0) goto L_0x0016
            r0 = r13
            or0.p r0 = (or0.C11734p) r0
            int r1 = r0.f34340h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f34340h = r1
            goto L_0x001b
        L_0x0016:
            or0.p r0 = new or0.p
            r0.<init>(r10, r13)
        L_0x001b:
            java.lang.Object r10 = r0.f34338f
            xx3.a r13 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r0.f34340h
            r2 = 1
            if (r1 == 0) goto L_0x003b
            if (r1 != r2) goto L_0x0033
            java.lang.Object r11 = r0.f34337e
            r12 = r11
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r11 = r0.f34336d
            com.tencent.mm.plugin.appbrand.page.t1 r11 = (com.tencent.p014mm.plugin.appbrand.page.C83928t1) r11
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0056
        L_0x0033:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003b:
            kotlin.ResultKt.throwOnFailure(r10)
            a14.h0 r10 = a14.C53872d1.f151117a
            a14.k2 r10 = f14.C58901s.f168555a
            or0.r r1 = new or0.r
            r3 = 0
            r1.<init>(r11, r3)
            r0.f34336d = r11
            r0.f34337e = r12
            r0.f34340h = r2
            java.lang.Object r10 = a14.C53895h.m60469g(r10, r1, r0)
            if (r10 != r13) goto L_0x0056
            goto L_0x0109
        L_0x0056:
            r3 = r10
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            java.lang.String r10 = "MicroMsg.WxaShortLinkRiskManager"
            if (r3 != 0) goto L_0x0082
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "uploadScreenshotToCdn screenshot null, appId:"
            r13.append(r0)
            java.lang.String r11 = r11.getAppId()
            r13.append(r11)
            java.lang.String r11 = ", shortLink:"
            r13.append(r11)
            r13.append(r12)
            java.lang.String r11 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r11)
            rx3.b0 r13 = rx3.C13598b0.f38549a
            goto L_0x0109
        L_0x0082:
            android.graphics.Matrix r8 = new android.graphics.Matrix
            r8.<init>()
            int r13 = r3.getWidth()
            float r13 = (float) r13
            r0 = 1144258560(0x44340000, float:720.0)
            float r13 = r0 / r13
            int r1 = r3.getWidth()
            float r1 = (float) r1
            float r0 = r0 / r1
            r8.setScale(r13, r0)
            r4 = 0
            r5 = 0
            int r6 = r3.getWidth()
            int r7 = r3.getHeight()
            r9 = 1
            android.graphics.Bitmap r13 = android.graphics.Bitmap.createBitmap(r3, r4, r5, r6, r7, r8, r9)
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
            r3 = 10
            r13.compress(r1, r3, r0)
            byte[] r13 = r0.toByteArray()
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r1 = 0
            int r2 = r13.length
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r2)
            r0[r1] = r3
            java.lang.String r1 = "data size %dBYTE"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            dk0.b r1 = dk0.C7356b.f25481a
            rx3.l r1 = r1.mo8529b(r13)
            A r2 = r1.f38555d
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x00ed
            B r13 = r1.f38556e
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r1 = "data_mmkv_key"
            r0.putString(r1, r13)
            java.lang.String r13 = "transfer data with mmkv"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r13)
            goto L_0x00f2
        L_0x00ed:
            java.lang.String r10 = "data"
            r0.putByteArray(r10, r13)
        L_0x00f2:
            java.lang.String r10 = "linkUrl"
            r0.putString(r10, r12)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r10 = r11.getRuntime()
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_MAIN
            java.lang.Class<com.tencent.mm.plugin.appbrand.shortlink.WxaShortLinkRiskManager$a> r1 = com.tencent.p014mm.plugin.appbrand.shortlink.WxaShortLinkRiskManager.C1969a.class
            or0.q r2 = new or0.q
            r2.<init>(r10, r11, r12)
            com.tencent.p014mm.ipcinvoker.C80907o.m98781d(r13, r0, r1, r2)
            rx3.b0 r13 = rx3.C13598b0.f38549a
        L_0x0109:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.shortlink.WxaShortLinkRiskManager.m1951a(com.tencent.mm.plugin.appbrand.shortlink.WxaShortLinkRiskManager, com.tencent.mm.plugin.appbrand.page.t1, java.lang.String, wx3.d):java.lang.Object");
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/shortlink/WxaShortLinkRiskManager$UploadResult;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.shortlink.WxaShortLinkRiskManager$UploadResult */
    public static final class UploadResult implements Parcelable {
        public static final Parcelable.Creator<UploadResult> CREATOR = new C1968a();

        /* renamed from: d */
        public final boolean f11880d;

        /* renamed from: e */
        public final String f11881e;

        /* renamed from: com.tencent.mm.plugin.appbrand.shortlink.WxaShortLinkRiskManager$UploadResult$a */
        public static final class C1968a implements Parcelable.Creator<UploadResult> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new UploadResult(parcel.readInt() != 0, parcel.readString());
            }

            public Object[] newArray(int i) {
                return new UploadResult[i];
            }
        }

        public UploadResult(boolean z, String str) {
            C87412m.m108594g(str, "fileUrl");
            this.f11880d = z;
            this.f11881e = str;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UploadResult)) {
                return false;
            }
            UploadResult uploadResult = (UploadResult) obj;
            return this.f11880d == uploadResult.f11880d && C87412m.m108589b(this.f11881e, uploadResult.f11881e);
        }

        public int hashCode() {
            boolean z = this.f11880d;
            if (z) {
                z = true;
            }
            return ((z ? 1 : 0) * true) + this.f11881e.hashCode();
        }

        public String toString() {
            return "UploadResult(ret=" + this.f11880d + ", fileUrl=" + this.f11881e + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeInt(this.f11880d ? 1 : 0);
            parcel.writeString(this.f11881e);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ UploadResult(boolean z, String str, int i, C8480h hVar) {
            this(z, (i & 2) != 0 ? "" : str);
        }
    }
}
