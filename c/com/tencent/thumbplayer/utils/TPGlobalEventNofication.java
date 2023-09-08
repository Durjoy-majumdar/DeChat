package com.tencent.thumbplayer.utils;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class TPGlobalEventNofication {
    public static final int EVENT_ID_APP_ENTER_BACKGROUND = 100001;
    public static final int EVENT_ID_APP_ENTER_FOREGROUND = 100002;
    public static final int EVENT_ID_UPC_CHANGED = 100003;
    private static final String TAG = "TPGlobalEventNofication";
    private static CopyOnWriteArrayList<OnGlobalEventChangeListener> mListeners = new CopyOnWriteArrayList<>();

    public interface OnGlobalEventChangeListener {
        void onEvent(int i, int i2, int i3, Object obj);
    }

    public static synchronized void addEventListener(OnGlobalEventChangeListener onGlobalEventChangeListener) {
        synchronized (TPGlobalEventNofication.class) {
            CopyOnWriteArrayList<OnGlobalEventChangeListener> copyOnWriteArrayList = mListeners;
            if (copyOnWriteArrayList != null && !copyOnWriteArrayList.contains(onGlobalEventChangeListener)) {
                mListeners.add(onGlobalEventChangeListener);
                TPLogUtil.m21897i(TAG, "add onNetStatus change listener: " + onGlobalEventChangeListener + ", mListeners: " + mListeners.size());
            }
        }
    }

    public static synchronized void postGlobalEvent(int i, int i2, int i3, Object obj) {
        synchronized (TPGlobalEventNofication.class) {
            Iterator<OnGlobalEventChangeListener> it = mListeners.iterator();
            while (it.hasNext()) {
                it.next().onEvent(i, i2, i3, obj);
            }
        }
    }

    public static synchronized void removeEventListener(OnGlobalEventChangeListener onGlobalEventChangeListener) {
        synchronized (TPGlobalEventNofication.class) {
            CopyOnWriteArrayList<OnGlobalEventChangeListener> copyOnWriteArrayList = mListeners;
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.remove(onGlobalEventChangeListener);
                TPLogUtil.m21897i(TAG, "remove netStatusChangeListener, listener: " + onGlobalEventChangeListener + ", mListeners: " + mListeners.size());
            }
        }
    }
}
