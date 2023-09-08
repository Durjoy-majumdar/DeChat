package com.tencent.live2.impl.p312a;

import android.os.Bundle;
import com.tencent.live2.V2TXLivePusherObserver;

/* renamed from: com.tencent.live2.impl.a.b */
public abstract class C17635b extends V2TXLivePusherObserver {
    public abstract void onEnterRoom(long j);

    public abstract void onExitRoom(int i);

    public abstract void onNetworkQuality(int i);

    public abstract void onPushEvent(int i, Bundle bundle);

    public abstract void onPushNetStatus(Bundle bundle);

    public abstract void onRemoteUserEnter(String str);

    public abstract void onRemoteUserExit(String str, int i);

    public abstract void onUserAudioAvailable(String str, boolean z);

    public abstract void onUserVideoAvailable(String str, int i, boolean z);
}
