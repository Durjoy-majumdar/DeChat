package com.tencent.tmassistantsdk.openSDK.param;

import android.text.TextUtils;
import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.openSDK.param.jce.IPCCmd;
import com.tencent.tmassistantsdk.openSDK.param.jce.IPCHead;
import com.tencent.tmassistantsdk.openSDK.param.jce.IPCRequest;
import com.tencent.tmassistantsdk.openSDK.param.jce.IPCResponse;
import com.tencent.tmassistantsdk.protocol.ProtocolPackage;
import com.tencent.tmassistantsdk.util.GlobalUtil;

public class IPCPackageTools {
    public static final String CHILD_NAME = ".jce.";
    public static final String CRYPT_KEY = "ji*9^&43U0X-~./(";
    private static final String TAG = "IPCPackageTools";
    public static int mReqId;

    public static IPCRequest buildIpcRequest(JceStruct jceStruct) {
        if (jceStruct == null) {
            return null;
        }
        IPCRequest iPCRequest = new IPCRequest();
        IPCHead iPCHead = new IPCHead();
        int i = mReqId;
        mReqId = i + 1;
        iPCHead.requestId = i;
        iPCHead.cmdId = getCmdId(jceStruct);
        iPCHead.hostPackageName = GlobalUtil.getAppPackageName(GlobalUtil.getInstance().getContext());
        iPCHead.hostVersionCode = String.valueOf(GlobalUtil.getAppVersionCode(GlobalUtil.getInstance().getContext()));
        iPCRequest.head = iPCHead;
        iPCRequest.body = jceStruct2ByteArray(jceStruct);
        return iPCRequest;
    }

    public static byte[] buildPostData(IPCRequest iPCRequest) {
        if (iPCRequest == null) {
            return null;
        }
        iPCRequest.body = ProtocolPackage.encrypt(iPCRequest.body, "ji*9^&43U0X-~./(".getBytes());
        return jceStruct2ByteArray(iPCRequest);
    }

    private static JceStruct createFromRequest(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (JceStruct) Class.forName((IPCPackageTools.class.getPackage().getName() + CHILD_NAME + str) + "Response").newInstance();
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

    public static int getCmdId(JceStruct jceStruct) {
        if (jceStruct == null) {
            return -1;
        }
        String simpleName = jceStruct.getClass().getSimpleName();
        return IPCCmd.convert(simpleName.substring(0, simpleName.length() - 7)).value();
    }

    public static byte[] jceStruct2ByteArray(JceStruct jceStruct) {
        return ProtocolPackage.jceStructToUTF8Byte(jceStruct);
    }

    public static JceStruct unpackBodyStruct(IPCResponse iPCResponse) {
        JceStruct createFromRequest = createFromRequest(IPCCmd.convert(iPCResponse.head.cmdId).toString());
        if (createFromRequest != null) {
            byte[] bArr = iPCResponse.body;
            if (bArr.length > 0) {
                try {
                    JceInputStream jceInputStream = new JceInputStream(bArr);
                    jceInputStream.setServerEncoding("utf-8");
                    createFromRequest.readFrom(jceInputStream);
                    return createFromRequest;
                } catch (Exception e) {
                    Log.printErrStackTrace(TAG, e, "", new Object[0]);
                }
            }
        }
        return null;
    }

    public static IPCResponse unpackPackage(byte[] bArr) {
        if (bArr != null && bArr.length >= 4) {
            IPCResponse iPCResponse = new IPCResponse();
            try {
                JceInputStream jceInputStream = new JceInputStream(bArr);
                jceInputStream.setServerEncoding("utf-8");
                iPCResponse.readFrom(jceInputStream);
                if (!TextUtils.isEmpty(iPCResponse.head.hostPackageName)) {
                    iPCResponse.body = ProtocolPackage.decrypt(iPCResponse.body, "ji*9^&43U0X-~./(".getBytes());
                }
                return iPCResponse;
            } catch (Exception e) {
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
            }
        }
        return null;
    }
}
