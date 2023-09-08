package com.tencent.tmassistantsdk.downloadclient;

import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant;
import com.tencent.tmassistantsdk.util.ParamPair;
import com.tencent.tmassistantsdk.util.TMLog;
import java.util.ArrayList;
import java.util.Iterator;
import mu3.C109639a;

public class TMAssistantDownloadSDKMessageThread extends MMHandler {
    private static TMAssistantDownloadSDKMessageThread mInstance = null;
    private static HandlerThread mMessagehandlerThread = null;
    private static final int postActionResult = 4;
    private static final int postSDKServiceInvalidMessage = 3;
    private static final int postTaskProgressChangedMessage = 2;
    private static final int postTaskStateChangedMessage = 1;

    private TMAssistantDownloadSDKMessageThread(C109639a aVar) {
        super(aVar);
    }

    public static synchronized TMAssistantDownloadSDKMessageThread getInstance() {
        TMAssistantDownloadSDKMessageThread tMAssistantDownloadSDKMessageThread;
        synchronized (TMAssistantDownloadSDKMessageThread.class) {
            if (mInstance == null) {
                mInstance = new TMAssistantDownloadSDKMessageThread(C109639a.m148950a("TMAssistantDownloadSDKMessageThread"));
            }
            tMAssistantDownloadSDKMessageThread = mInstance;
        }
        return tMAssistantDownloadSDKMessageThread;
    }

    public void handleMessage(Message message) {
        super.handleMessage(message);
        int i = message.what;
        if (i == 1) {
            ParamPair paramPair = (ParamPair) message.obj;
            TMAssistantDownloadSDKClient tMAssistantDownloadSDKClient = (TMAssistantDownloadSDKClient) paramPair.mFirstParam;
            ITMAssistantDownloadSDKClientListener iTMAssistantDownloadSDKClientListener = (ITMAssistantDownloadSDKClientListener) paramPair.mSecondParam;
            Bundle data = message.getData();
            String string = data.getString("url");
            int i2 = data.getInt("state");
            int i3 = data.getInt(OpenSDKTool4Assistant.EXTRA_ERROR_CODE);
            String string2 = data.getString(OpenSDKTool4Assistant.EXTRA_ERROR_MSG);
            boolean z = data.getBoolean("hasChangeUrl");
            boolean z2 = data.getBoolean("autoRetry");
            if (iTMAssistantDownloadSDKClientListener != null) {
                iTMAssistantDownloadSDKClientListener.OnDownloadSDKTaskStateChanged(tMAssistantDownloadSDKClient, string, i2, i3, string2, z, z2);
            }
        } else if (i == 2) {
            ParamPair paramPair2 = (ParamPair) message.obj;
            TMAssistantDownloadSDKClient tMAssistantDownloadSDKClient2 = (TMAssistantDownloadSDKClient) paramPair2.mFirstParam;
            ITMAssistantDownloadSDKClientListener iTMAssistantDownloadSDKClientListener2 = (ITMAssistantDownloadSDKClientListener) paramPair2.mSecondParam;
            Bundle data2 = message.getData();
            String string3 = data2.getString("url");
            long j = data2.getLong("receiveDataLen");
            long j2 = data2.getLong("totalDataLen");
            if (iTMAssistantDownloadSDKClientListener2 != null) {
                iTMAssistantDownloadSDKClientListener2.OnDownloadSDKTaskProgressChanged(tMAssistantDownloadSDKClient2, string3, j, j2);
            }
        } else if (i == 3) {
            ParamPair paramPair3 = (ParamPair) message.obj;
            TMAssistantDownloadSDKClient tMAssistantDownloadSDKClient3 = (TMAssistantDownloadSDKClient) paramPair3.mFirstParam;
            ITMAssistantDownloadSDKClientListener iTMAssistantDownloadSDKClientListener3 = (ITMAssistantDownloadSDKClientListener) paramPair3.mSecondParam;
            if (iTMAssistantDownloadSDKClientListener3 != null) {
                iTMAssistantDownloadSDKClientListener3.OnDwonloadSDKServiceInvalid(tMAssistantDownloadSDKClient3);
            }
        } else if (i == 4) {
            ParamPair paramPair4 = (ParamPair) message.obj;
            byte[] bArr = (byte[]) paramPair4.mFirstParam;
            ArrayList arrayList = (ArrayList) paramPair4.mSecondParam;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    IAssistantOnActionListener iAssistantOnActionListener = (IAssistantOnActionListener) it.next();
                    if (iAssistantOnActionListener != null) {
                        iAssistantOnActionListener.onActionResult(bArr);
                    }
                }
            }
        }
    }

    public void postActionResult(byte[] bArr, ArrayList<IAssistantOnActionListener> arrayList) {
        if (bArr != null && arrayList != null) {
            Message obtainMessage = getInstance().obtainMessage();
            obtainMessage.what = 4;
            obtainMessage.obj = new ParamPair(bArr, arrayList);
            obtainMessage.sendToTarget();
        }
    }

    public void postSDKServiceInvalidMessage(TMAssistantDownloadSDKClient tMAssistantDownloadSDKClient, ITMAssistantDownloadSDKClientListener iTMAssistantDownloadSDKClientListener) {
        if (iTMAssistantDownloadSDKClientListener != null && tMAssistantDownloadSDKClient != null) {
            Message obtainMessage = getInstance().obtainMessage();
            obtainMessage.what = 3;
            obtainMessage.obj = new ParamPair(tMAssistantDownloadSDKClient, iTMAssistantDownloadSDKClientListener);
            obtainMessage.sendToTarget();
        }
    }

    public void postTaskProgressChangedMessage(TMAssistantDownloadSDKClient tMAssistantDownloadSDKClient, ITMAssistantDownloadSDKClientListener iTMAssistantDownloadSDKClientListener, String str, long j, long j2) {
        if (iTMAssistantDownloadSDKClientListener == null || tMAssistantDownloadSDKClient == null) {
            TMLog.m164114i("TMAssistantDownloadSDKMessageThread", "listenr:" + iTMAssistantDownloadSDKClientListener + " === sdkClient" + tMAssistantDownloadSDKClient);
            return;
        }
        Message obtainMessage = getInstance().obtainMessage();
        obtainMessage.what = 2;
        obtainMessage.obj = new ParamPair(tMAssistantDownloadSDKClient, iTMAssistantDownloadSDKClientListener);
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        bundle.putLong("receiveDataLen", j);
        bundle.putLong("totalDataLen", j2);
        obtainMessage.setData(bundle);
        obtainMessage.sendToTarget();
    }

    public void postTaskStateChangedMessage(TMAssistantDownloadSDKClient tMAssistantDownloadSDKClient, ITMAssistantDownloadSDKClientListener iTMAssistantDownloadSDKClientListener, String str, int i, int i2, String str2, boolean z, boolean z2) {
        if (iTMAssistantDownloadSDKClientListener != null && tMAssistantDownloadSDKClient != null) {
            Message obtainMessage = getInstance().obtainMessage();
            obtainMessage.what = 1;
            obtainMessage.obj = new ParamPair(tMAssistantDownloadSDKClient, iTMAssistantDownloadSDKClientListener);
            Bundle bundle = new Bundle();
            bundle.putString("url", str);
            bundle.putInt("state", i);
            bundle.putInt(OpenSDKTool4Assistant.EXTRA_ERROR_CODE, i2);
            bundle.putString(OpenSDKTool4Assistant.EXTRA_ERROR_MSG, str2);
            bundle.putBoolean("hasChangeUrl", z);
            bundle.putBoolean("autoRetry", z2);
            obtainMessage.setData(bundle);
            obtainMessage.sendToTarget();
        }
    }
}
