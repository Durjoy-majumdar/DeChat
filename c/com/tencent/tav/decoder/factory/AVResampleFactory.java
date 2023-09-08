package com.tencent.tav.decoder.factory;

import com.tencent.tav.coremedia.IAVResample;
import com.tencent.tav.decoder.logger.Logger;
import com.tencent.tavkit.resample.TAVResample;

public class AVResampleFactory {
    private static final String TAG = "AVResampleFactory";
    private static AVResampleFactory instance;
    private boolean tavResampleEnable = false;

    public AVResampleFactory() {
        try {
            Class.forName("com.tencent.tavkit.resample.TAVResample");
            this.tavResampleEnable = true;
        } catch (ClassNotFoundException e) {
            Logger.m144649w(TAG, "newAVResample: " + e);
        }
    }

    public static synchronized AVResampleFactory getInstance() {
        AVResampleFactory aVResampleFactory;
        synchronized (AVResampleFactory.class) {
            if (instance == null) {
                instance = new AVResampleFactory();
            }
            aVResampleFactory = instance;
        }
        return aVResampleFactory;
    }

    public static synchronized void setInstance(AVResampleFactory aVResampleFactory) {
        synchronized (AVResampleFactory.class) {
            instance = aVResampleFactory;
        }
    }

    public boolean isResampleEnable() {
        return this.tavResampleEnable;
    }

    public IAVResample newAVResample(int i, int i2, int i3, int i4) {
        if (this.tavResampleEnable) {
            return new TAVResample(i, i2, i3, i4);
        }
        return null;
    }
}
