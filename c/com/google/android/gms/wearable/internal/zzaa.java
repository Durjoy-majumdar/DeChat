package com.google.android.gms.wearable.internal;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wearable.CapabilityApi;
import com.google.android.gms.wearable.CapabilityClient;
import com.google.android.gms.wearable.CapabilityInfo;
import java.util.Map;

public final class zzaa extends CapabilityClient {
    private final CapabilityApi zzbw = new zzo();

    public zzaa(Activity activity, GoogleApi.Settings settings) {
        super(activity, settings);
    }

    public zzaa(Context context, GoogleApi.Settings settings) {
        super(context, settings);
    }

    private final Task<Void> zza(ListenerHolder<CapabilityClient.OnCapabilityChangedListener> listenerHolder, CapabilityClient.OnCapabilityChangedListener onCapabilityChangedListener, IntentFilter[] intentFilterArr) {
        return doRegisterEventListener(new zzaf(onCapabilityChangedListener, intentFilterArr, listenerHolder), new zzag(onCapabilityChangedListener, listenerHolder.getListenerKey()));
    }

    public final Task<Void> addListener(CapabilityClient.OnCapabilityChangedListener onCapabilityChangedListener, Uri uri, int i) {
        Asserts.checkNotNull(onCapabilityChangedListener, "listener must not be null");
        Asserts.checkNotNull(uri, "uri must not be null");
        Preconditions.checkArgument(i == 0 || i == 1, "invalid filter type");
        return zza(ListenerHolders.createListenerHolder(onCapabilityChangedListener, getLooper(), "CapabilityListener"), onCapabilityChangedListener, new IntentFilter[]{zzgj.zza("com.google.android.gms.wearable.CAPABILITY_CHANGED", uri, i)});
    }

    public final Task<Void> addListener(CapabilityClient.OnCapabilityChangedListener onCapabilityChangedListener, String str) {
        Asserts.checkNotNull(onCapabilityChangedListener, "listener must not be null");
        Asserts.checkNotNull(str, "capability must not be null");
        IntentFilter zzc = zzgj.zzc("com.google.android.gms.wearable.CAPABILITY_CHANGED");
        if (!str.startsWith("/")) {
            str = str.length() != 0 ? "/".concat(str) : new String("/");
        }
        zzc.addDataPath(str, 0);
        IntentFilter[] intentFilterArr = {zzc};
        Looper looper = getLooper();
        String valueOf = String.valueOf(str);
        return zza(ListenerHolders.createListenerHolder(onCapabilityChangedListener, looper, valueOf.length() != 0 ? "CapabilityListener:".concat(valueOf) : new String("CapabilityListener:")), new zzae(onCapabilityChangedListener, str), intentFilterArr);
    }

    public final Task<Void> addLocalCapability(String str) {
        Asserts.checkNotNull(str, "capability must not be null");
        return PendingResultUtil.toVoidTask(this.zzbw.addLocalCapability(asGoogleApiClient(), str));
    }

    public final Task<Map<String, CapabilityInfo>> getAllCapabilities(int i) {
        return PendingResultUtil.toTask(this.zzbw.getAllCapabilities(asGoogleApiClient(), i), zzac.zzbx);
    }

    public final Task<CapabilityInfo> getCapability(String str, int i) {
        Asserts.checkNotNull(str, "capability must not be null");
        return PendingResultUtil.toTask(this.zzbw.getCapability(asGoogleApiClient(), str, i), zzab.zzbx);
    }

    public final Task<Boolean> removeListener(CapabilityClient.OnCapabilityChangedListener onCapabilityChangedListener) {
        Asserts.checkNotNull(onCapabilityChangedListener, "listener must not be null");
        return doUnregisterEventListener(ListenerHolders.createListenerHolder(onCapabilityChangedListener, getLooper(), "CapabilityListener").getListenerKey());
    }

    public final Task<Boolean> removeListener(CapabilityClient.OnCapabilityChangedListener onCapabilityChangedListener, String str) {
        Asserts.checkNotNull(onCapabilityChangedListener, "listener must not be null");
        Asserts.checkNotNull(str, "capability must not be null");
        if (!str.startsWith("/")) {
            str = str.length() != 0 ? "/".concat(str) : new String("/");
        }
        Looper looper = getLooper();
        String valueOf = String.valueOf(str);
        return doUnregisterEventListener(ListenerHolders.createListenerHolder(onCapabilityChangedListener, looper, valueOf.length() != 0 ? "CapabilityListener:".concat(valueOf) : new String("CapabilityListener:")).getListenerKey());
    }

    public final Task<Void> removeLocalCapability(String str) {
        Asserts.checkNotNull(str, "capability must not be null");
        return PendingResultUtil.toVoidTask(this.zzbw.removeLocalCapability(asGoogleApiClient(), str));
    }
}
