package com.tencent.thumbplayer.event;

import com.tencent.thumbplayer.event.TPPlayerEventInfo;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class TPPlayerEventPublisher {
    private static final String TAG = "TPPlayerEventPublisher";
    private CopyOnWriteArrayList<WeakReference<ITPEventReceiver>> mReceiverList = new CopyOnWriteArrayList<>();

    private void doRemoveReceiver(ITPEventReceiver iTPEventReceiver) {
        Iterator<WeakReference<ITPEventReceiver>> it = this.mReceiverList.iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().get() == iTPEventReceiver) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            this.mReceiverList.remove(i);
        }
    }

    public void addEventReceiver(ITPEventReceiver iTPEventReceiver) {
        CopyOnWriteArrayList<WeakReference<ITPEventReceiver>> copyOnWriteArrayList;
        if (iTPEventReceiver != null && (copyOnWriteArrayList = this.mReceiverList) != null && !copyOnWriteArrayList.contains(iTPEventReceiver)) {
            this.mReceiverList.add(new WeakReference(iTPEventReceiver));
        }
    }

    public int getReceiverSize() {
        CopyOnWriteArrayList<WeakReference<ITPEventReceiver>> copyOnWriteArrayList = this.mReceiverList;
        if (copyOnWriteArrayList == null) {
            return 0;
        }
        return copyOnWriteArrayList.size();
    }

    public void publishEvent(TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        CopyOnWriteArrayList<WeakReference<ITPEventReceiver>> copyOnWriteArrayList = this.mReceiverList;
        if (copyOnWriteArrayList != null) {
            Iterator<WeakReference<ITPEventReceiver>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ITPEventReceiver iTPEventReceiver = (ITPEventReceiver) it.next().get();
                if (iTPEventReceiver != null) {
                    iTPEventReceiver.onEvent(baseEventInfo);
                }
            }
        }
    }

    public void release() {
        CopyOnWriteArrayList<WeakReference<ITPEventReceiver>> copyOnWriteArrayList = this.mReceiverList;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
        }
    }

    public void removeEventReceiver(ITPEventReceiver iTPEventReceiver) {
        if (iTPEventReceiver != null && this.mReceiverList != null) {
            doRemoveReceiver(iTPEventReceiver);
        }
    }
}
