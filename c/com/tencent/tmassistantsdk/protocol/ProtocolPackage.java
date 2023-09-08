package com.tencent.tmassistantsdk.protocol;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.protocol.jce.ReportLogRequest;
import com.tencent.tmassistantsdk.protocol.jce.ReqHead;
import com.tencent.tmassistantsdk.protocol.jce.Request;
import com.tencent.tmassistantsdk.protocol.jce.Response;
import com.tencent.tmassistantsdk.protocol.jce.RspHead;
import com.tencent.tmassistantsdk.protocol.jce.Terminal;
import com.tencent.tmassistantsdk.util.Cryptor;
import com.tencent.tmassistantsdk.util.GlobalUtil;
import java.util.List;

public class ProtocolPackage {
    public static final String CRYPT_KEY = "ji*9^&43U0X-~./(";
    public static final byte FLAG_CRYPT = 2;
    public static final byte FLAG_ZIP = 1;
    public static final String ServerEncoding = "utf-8";
    private static final String TAG = "ProtocolPackage";
    public static final int ZIP_TRIGGER = 256;

    public static byte[] buildPostData(Request request) {
        if (request == null) {
            return null;
        }
        request.head.encryptWithPack = 0;
        byte[] bArr = request.body;
        if (bArr.length > 256) {
            request.body = ZipUtils.zip(bArr);
            ReqHead reqHead = request.head;
            reqHead.encryptWithPack = (byte) (reqHead.encryptWithPack | 1);
        }
        request.body = encrypt(request.body, "ji*9^&43U0X-~./(".getBytes());
        ReqHead reqHead2 = request.head;
        reqHead2.encryptWithPack = (byte) (reqHead2.encryptWithPack | 2);
        return jceStructToUTF8Byte(request);
    }

    public static JceStruct buildReportRequest(byte b, List<byte[]> list, String str, int i, String str2) {
        ReportLogRequest reportLogRequest = new ReportLogRequest();
        reportLogRequest.logType = b;
        reportLogRequest.logData = formatLogData(list);
        reportLogRequest.hostAppPackageName = str;
        reportLogRequest.hostAppVersion = i;
        reportLogRequest.hostUserId = str2;
        return reportLogRequest;
    }

    public static Request buildRequest(JceStruct jceStruct) {
        if (jceStruct == null) {
            return null;
        }
        Request request = new Request();
        request.head = getReqHead(jceStruct);
        request.body = jceStructToUTF8Byte(jceStruct);
        return request;
    }

    public static JceStruct bytes2JceObj(byte[] bArr, Class<? extends JceStruct> cls) {
        if (bArr == null) {
            return null;
        }
        try {
            JceInputStream jceInputStream = new JceInputStream(bArr);
            jceInputStream.setServerEncoding("utf-8");
            JceStruct jceStruct = (JceStruct) cls.newInstance();
            jceStruct.readFrom(jceInputStream);
            return jceStruct;
        } catch (Exception unused) {
            return null;
        }
    }

    private static JceStruct createFromRequest(JceStruct jceStruct) {
        if (jceStruct == null) {
            return null;
        }
        String name = jceStruct.getClass().getName();
        try {
            return (JceStruct) Class.forName(name.substring(0, name.length() - 7) + "Response").newInstance();
        } catch (ClassNotFoundException e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            return null;
        } catch (IllegalAccessException e2) {
            Log.printErrStackTrace(TAG, e2, "", new Object[0]);
            return null;
        } catch (InstantiationException e3) {
            Log.printErrStackTrace(TAG, e3, "", new Object[0]);
            return null;
        }
    }

    public static byte[] decrypt(byte[] bArr, byte[] bArr2) {
        return new Cryptor().decrypt(bArr, bArr2);
    }

    public static byte[] encrypt(byte[] bArr, byte[] bArr2) {
        return new Cryptor().encrypt(bArr, bArr2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0057 A[SYNTHETIC, Splitter:B:33:0x0057] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0063 A[SYNTHETIC, Splitter:B:38:0x0063] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0072 A[SYNTHETIC, Splitter:B:45:0x0072] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x007e A[SYNTHETIC, Splitter:B:50:0x007e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] formatLogData(java.util.List<byte[]> r8) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "ProtocolPackage"
            r2 = 0
            r3 = 0
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x004d, all -> 0x004a }
            r4.<init>()     // Catch:{ Exception -> 0x004d, all -> 0x004a }
            java.io.DataOutputStream r5 = new java.io.DataOutputStream     // Catch:{ Exception -> 0x0047, all -> 0x0043 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x0047, all -> 0x0043 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ Exception -> 0x0041 }
        L_0x0014:
            boolean r6 = r8.hasNext()     // Catch:{ Exception -> 0x0041 }
            if (r6 == 0) goto L_0x0028
            java.lang.Object r6 = r8.next()     // Catch:{ Exception -> 0x0041 }
            byte[] r6 = (byte[]) r6     // Catch:{ Exception -> 0x0041 }
            int r7 = r6.length     // Catch:{ Exception -> 0x0041 }
            r5.writeInt(r7)     // Catch:{ Exception -> 0x0041 }
            r5.write(r6)     // Catch:{ Exception -> 0x0041 }
            goto L_0x0014
        L_0x0028:
            byte[] r8 = r4.toByteArray()     // Catch:{ Exception -> 0x0041 }
            r4.close()     // Catch:{ IOException -> 0x0030 }
            goto L_0x0036
        L_0x0030:
            r2 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r0, r4)
        L_0x0036:
            r5.close()     // Catch:{ IOException -> 0x003a }
            goto L_0x0040
        L_0x003a:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r0, r3)
        L_0x0040:
            return r8
        L_0x0041:
            r8 = move-exception
            goto L_0x0050
        L_0x0043:
            r8 = move-exception
            r5 = r2
        L_0x0045:
            r2 = r4
            goto L_0x0070
        L_0x0047:
            r8 = move-exception
            r5 = r2
            goto L_0x0050
        L_0x004a:
            r8 = move-exception
            r5 = r2
            goto L_0x0070
        L_0x004d:
            r8 = move-exception
            r4 = r2
            r5 = r4
        L_0x0050:
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x006e }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r8, r0, r6)     // Catch:{ all -> 0x006e }
            if (r4 == 0) goto L_0x0061
            r4.close()     // Catch:{ IOException -> 0x005b }
            goto L_0x0061
        L_0x005b:
            r8 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r8, r0, r4)
        L_0x0061:
            if (r5 == 0) goto L_0x006d
            r5.close()     // Catch:{ IOException -> 0x0067 }
            goto L_0x006d
        L_0x0067:
            r8 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r8, r0, r3)
        L_0x006d:
            return r2
        L_0x006e:
            r8 = move-exception
            goto L_0x0045
        L_0x0070:
            if (r2 == 0) goto L_0x007c
            r2.close()     // Catch:{ IOException -> 0x0076 }
            goto L_0x007c
        L_0x0076:
            r2 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r0, r4)
        L_0x007c:
            if (r5 == 0) goto L_0x0088
            r5.close()     // Catch:{ IOException -> 0x0082 }
            goto L_0x0088
        L_0x0082:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r0, r3)
        L_0x0088:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.protocol.ProtocolPackage.formatLogData(java.util.List):byte[]");
    }

    public static ReqHead getReqHead(JceStruct jceStruct) {
        if (jceStruct == null) {
            return null;
        }
        ReqHead reqHead = new ReqHead();
        reqHead.requestId = GlobalUtil.getMemUUID();
        String simpleName = jceStruct.getClass().getSimpleName();
        reqHead.cmdId = GlobalUtil.getInstance().getJceCmdIdByClassName(simpleName.substring(0, simpleName.length() - 7));
        reqHead.qua = GlobalUtil.getInstance().mQUA;
        reqHead.phoneGuid = GlobalUtil.getInstance().getPhoneGuid();
        reqHead.terminal = new Terminal();
        reqHead.assistantAPILevel = GlobalUtil.getInstance().getQQDownloaderAPILevel();
        reqHead.assistantVersionCode = GlobalUtil.getInstance().getQQDownloaderVersionCode();
        return reqHead;
    }

    public static byte[] jceStructToUTF8Byte(JceStruct jceStruct) {
        if (jceStruct == null) {
            return null;
        }
        JceOutputStream jceOutputStream = new JceOutputStream();
        jceOutputStream.setServerEncoding("utf-8");
        jceStruct.writeTo(jceOutputStream);
        return jceOutputStream.toByteArray();
    }

    public static Response unpackPackage(byte[] bArr) {
        if (bArr != null && bArr.length >= 4) {
            Response response = new Response();
            try {
                JceInputStream jceInputStream = new JceInputStream(bArr);
                jceInputStream.setServerEncoding("utf-8");
                response.readFrom(jceInputStream);
                RspHead rspHead = response.head;
                if (rspHead.ret == 0) {
                    if ((rspHead.encryptWithPack & 2) == 2) {
                        response.body = decrypt(response.body, "ji*9^&43U0X-~./(".getBytes());
                    }
                    if ((response.head.encryptWithPack & 1) == 1) {
                        response.body = ZipUtils.unzip(response.body);
                    }
                    GlobalUtil.getInstance().setPhoneGuid(response.head.phoneGuid);
                }
                return response;
            } catch (Exception e) {
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
            }
        }
        return null;
    }

    public static JceStruct unpageageJceResponse(JceStruct jceStruct, byte[] bArr) {
        JceStruct createFromRequest;
        if (!(jceStruct == null || bArr == null || (createFromRequest = createFromRequest(jceStruct)) == null)) {
            try {
                JceInputStream jceInputStream = new JceInputStream(bArr);
                jceInputStream.setServerEncoding("utf-8");
                createFromRequest.readFrom(jceInputStream);
                return createFromRequest;
            } catch (Exception e) {
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
            }
        }
        return null;
    }
}
