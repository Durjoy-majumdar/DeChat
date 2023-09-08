package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import di3.C86312j;
import dk0.C7356b;
import p1081gi.C98124g;
import p663qo.C101213l;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.t6 */
public class C1878t6 extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "uploadToCommonCDN";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.t6$a */
    public static final class C1879a implements C80883e<Bundle, Bundle> {
        private C1879a() {
        }

        public void invoke(Object obj, C1256g gVar) {
            Bundle bundle = (Bundle) obj;
            int i = bundle.getInt("appType", 0);
            int i2 = bundle.getInt("fileType", 0);
            String string = bundle.getString("fileKey", "");
            String string2 = bundle.getString(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "");
            byte[] byteArray = TextUtils.isEmpty(bundle.getString("fileDataKey", "")) ? bundle.getByteArray("fileData") : C7356b.f25481a.mo8528a(bundle.getString("fileDataKey"), true);
            String string3 = bundle.getString("thumbFilePath", "");
            byte[] byteArray2 = TextUtils.isEmpty(bundle.getString("thumbFileDataKey", "")) ? bundle.getByteArray("thumbFileData") : C7356b.f25481a.mo8528a(bundle.getString("thumbFileDataKey"), true);
            boolean z = bundle.getBoolean("isStorageMode", true);
            bundle.getInt("snsUploadVersion", 1);
            C98124g gVar2 = new C98124g();
            gVar2.f287660d = "task_JsApiUploadToCommonCDN";
            gVar2.field_fileType = i2;
            gVar2.field_bzScene = 2;
            gVar2.field_appType = i;
            gVar2.field_mediaId = string;
            gVar2.field_fullpath = string2;
            gVar2.field_thumbpath = string3;
            gVar2.field_needStorage = z;
            if (byteArray != null) {
                gVar2.f287650G = byteArray;
            }
            if (byteArray2 != null) {
                gVar2.f287651H = byteArray2;
            }
            gVar2.f287662f = new C1853s6(this, gVar);
            if (!((C101213l) C86312j.m106911c(C101213l.class)).if0(gVar2)) {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("ret", 2);
                gVar.mo894a(bundle2);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: java.nio.ByteBuffer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1505u(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r24, org.json.JSONObject r25, int r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            r2 = r26
            r3 = r24
            com.tencent.mm.plugin.appbrand.i2 r3 = (com.tencent.p014mm.plugin.appbrand.C81925i2) r3
            java.lang.String r4 = "MicroMsg.JsApiUploadToCommonCDN"
            if (r1 != 0) goto L_0x001e
            java.lang.String r1 = "fail:data is null"
            java.lang.String r1 = r0.mo115109j(r1)
            r3.mo109647a(r2, r1)
            java.lang.String r1 = "data is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
            goto L_0x01f7
        L_0x001e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "JsApiUploadToCommonCDN data="
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            java.lang.String r5 = "appType"
            int r6 = r1.optInt(r5)
            java.lang.String r7 = "fileType"
            int r8 = r1.optInt(r7)
            java.lang.String r9 = "fileKey"
            java.lang.String r10 = r1.optString(r9)
            java.lang.String r11 = "filePath"
            java.lang.String r12 = r1.optString(r11)
            java.lang.String r13 = "fileData"
            java.lang.Object r14 = r1.opt(r13)
            boolean r15 = r14 instanceof java.lang.String
            r16 = 0
            if (r15 == 0) goto L_0x0061
            java.lang.String r14 = (java.lang.String) r14
            byte[] r14 = r14.getBytes()
            java.nio.ByteBuffer r14 = java.nio.ByteBuffer.wrap(r14)
            goto L_0x006a
        L_0x0061:
            boolean r15 = r14 instanceof java.nio.ByteBuffer
            if (r15 == 0) goto L_0x0068
            java.nio.ByteBuffer r14 = (java.nio.ByteBuffer) r14
            goto L_0x006a
        L_0x0068:
            r14 = r16
        L_0x006a:
            java.lang.String r15 = "thumbFilePath"
            r24 = r13
            java.lang.String r13 = r1.optString(r15)
            r17 = r15
            java.lang.String r15 = "thumbFileData"
            r18 = r11
            java.lang.Object r11 = r1.opt(r15)
            r19 = r15
            boolean r15 = r11 instanceof java.lang.String
            if (r15 == 0) goto L_0x0091
            java.lang.String r11 = (java.lang.String) r11
            byte[] r11 = r11.getBytes()
            java.nio.ByteBuffer r16 = java.nio.ByteBuffer.wrap(r11)
        L_0x008e:
            r11 = r16
            goto L_0x009a
        L_0x0091:
            boolean r15 = r11 instanceof java.nio.ByteBuffer
            if (r15 == 0) goto L_0x008e
            r16 = r11
            java.nio.ByteBuffer r16 = (java.nio.ByteBuffer) r16
            goto L_0x008e
        L_0x009a:
            java.lang.String r15 = "isStorageMode"
            r16 = r11
            boolean r11 = r1.optBoolean(r15)
            r20 = r11
            java.lang.String r11 = "snsUploadVersion"
            int r1 = r1.optInt(r11)
            boolean r21 = android.text.TextUtils.isEmpty(r12)
            if (r21 == 0) goto L_0x00c3
            if (r14 != 0) goto L_0x00c3
            java.lang.String r1 = "filePath and fileData invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r1)
            java.lang.String r1 = "fail:filePath and fileData invalid"
            java.lang.String r1 = r0.mo115109j(r1)
            r3.mo109647a(r2, r1)
            goto L_0x01f7
        L_0x00c3:
            boolean r21 = android.text.TextUtils.isEmpty(r12)
            java.lang.String r22 = ""
            if (r21 != 0) goto L_0x0108
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r21 = r3.getRuntime()
            r25 = r1
            com.tencent.mm.plugin.appbrand.appstorage.h0 r1 = r21.mo113034V()
            com.tencent.mm.vfs.m1 r1 = r1.getAbsoluteFile(r12)
            if (r1 != 0) goto L_0x00de
            r12 = r22
            goto L_0x00e3
        L_0x00de:
            java.lang.String r1 = r1.mo119971i()
            r12 = r1
        L_0x00e3:
            int r1 = r12.length()
            if (r1 != 0) goto L_0x010a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "get full file path fail: "
            r1.append(r5)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r1)
            java.lang.String r1 = "fail:get full file path fail"
            java.lang.String r1 = r0.mo115109j(r1)
            r3.mo109647a(r2, r1)
            goto L_0x01f7
        L_0x0108:
            r25 = r1
        L_0x010a:
            boolean r1 = android.text.TextUtils.isEmpty(r13)
            if (r1 != 0) goto L_0x014b
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r1 = r3.getRuntime()
            com.tencent.mm.plugin.appbrand.appstorage.h0 r1 = r1.mo113034V()
            com.tencent.mm.vfs.m1 r1 = r1.getAbsoluteFile(r13)
            if (r1 != 0) goto L_0x0121
            r13 = r22
            goto L_0x0126
        L_0x0121:
            java.lang.String r1 = r1.mo119971i()
            r13 = r1
        L_0x0126:
            int r1 = r13.length()
            if (r1 != 0) goto L_0x014b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "get full thumb file path fail: "
            r1.append(r5)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r1)
            java.lang.String r1 = "fail:get full thumb file path fail"
            java.lang.String r1 = r0.mo115109j(r1)
            r3.mo109647a(r2, r1)
            goto L_0x01f7
        L_0x014b:
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 == 0) goto L_0x0172
            java.util.Locale r1 = java.util.Locale.ENGLISH
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r10 = 0
            r4[r10] = r12
            r10 = 1
            long r21 = java.lang.System.currentTimeMillis()
            java.lang.Long r21 = java.lang.Long.valueOf(r21)
            r4[r10] = r21
            java.lang.String r10 = "%s%d"
            java.lang.String r1 = java.lang.String.format(r1, r10, r4)
            byte[] r1 = r1.getBytes()
            java.lang.String r10 = p823sg.C90193h.m112878f(r1)
        L_0x0172:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r1.putInt(r5, r6)
            r1.putInt(r7, r8)
            r1.putString(r9, r10)
            r4 = r18
            r1.putString(r4, r12)
            if (r14 == 0) goto L_0x01af
            int r4 = r14.remaining()
            byte[] r4 = new byte[r4]
            r14.get(r4)
            dk0.b r5 = dk0.C7356b.f25481a
            rx3.l r5 = r5.mo8529b(r4)
            A r6 = r5.f38555d
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x01aa
            B r4 = r5.f38556e
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "fileDataKey"
            r1.putString(r5, r4)
            goto L_0x01af
        L_0x01aa:
            r5 = r24
            r1.putByteArray(r5, r4)
        L_0x01af:
            r4 = r17
            r1.putString(r4, r13)
            if (r16 == 0) goto L_0x01e1
            int r4 = r16.remaining()
            byte[] r4 = new byte[r4]
            r5 = r16
            r5.get(r4)
            dk0.b r5 = dk0.C7356b.f25481a
            rx3.l r5 = r5.mo8529b(r4)
            A r6 = r5.f38555d
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x01dc
            B r4 = r5.f38556e
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "thumbFileDataKey"
            r1.putString(r5, r4)
            goto L_0x01e1
        L_0x01dc:
            r5 = r19
            r1.putByteArray(r5, r4)
        L_0x01e1:
            r4 = r20
            r1.putBoolean(r15, r4)
            r4 = r25
            r1.putInt(r11, r4)
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_MAIN
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsapi.t6$a> r5 = com.tencent.p014mm.plugin.appbrand.jsapi.C1878t6.C1879a.class
            com.tencent.mm.plugin.appbrand.jsapi.r6 r6 = new com.tencent.mm.plugin.appbrand.jsapi.r6
            r6.<init>(r0, r3, r2)
            com.tencent.p014mm.ipcinvoker.C80907o.m98781d(r4, r1, r5, r6)
        L_0x01f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.C1878t6.mo1505u(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject, int):void");
    }
}
