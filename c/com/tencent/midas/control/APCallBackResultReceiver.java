package com.tencent.midas.control;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.tencent.midas.comm.APLog;

public class APCallBackResultReceiver extends ResultReceiver {
    private Receiver mReceiver;

    public interface Receiver {
        void onReceiveResult(int i, Bundle bundle);
    }

    public APCallBackResultReceiver(Handler handler) {
        super(handler);
    }

    public void onReceiveResult(int i, Bundle bundle) {
        APLog.m161214i("APCallBackResultReceiver", "onReceiveResult resultCode:" + i + " mReceiver:" + this.mReceiver);
        Receiver receiver = this.mReceiver;
        if (receiver != null) {
            receiver.onReceiveResult(i, bundle);
        }
    }

    public void setReceiver(Receiver receiver) {
        this.mReceiver = receiver;
    }
}
