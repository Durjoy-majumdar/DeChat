package com.google.android.gms.wearable.internal;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wearable.MessageApi;
import com.google.android.gms.wearable.MessageClient;
import p329d3.C20434g;

public final class zzez extends MessageClient {
    private final MessageApi zzei = new zzeu();

    public zzez(Activity activity, GoogleApi.Settings settings) {
        super(activity, settings);
    }

    public zzez(Context context, GoogleApi.Settings settings) {
        super(context, settings);
    }

    private final Task<Void> zza(MessageClient.OnMessageReceivedListener onMessageReceivedListener, IntentFilter[] intentFilterArr) {
        ListenerHolder createListenerHolder = ListenerHolders.createListenerHolder(onMessageReceivedListener, getLooper(), "MessageListener");
        return doRegisterEventListener(new zzfc(onMessageReceivedListener, intentFilterArr, createListenerHolder), new zzfd(onMessageReceivedListener, createListenerHolder.getListenerKey()));
    }

    public final Task<Void> addListener(MessageClient.OnMessageReceivedListener onMessageReceivedListener) {
        return zza(onMessageReceivedListener, new IntentFilter[]{zzgj.zzc("com.google.android.gms.wearable.MESSAGE_RECEIVED")});
    }

    public final Task<Void> addListener(MessageClient.OnMessageReceivedListener onMessageReceivedListener, Uri uri, int i) {
        C20434g.m22020d(uri, "uri must not be null");
        Preconditions.checkArgument(i == 0 || i == 1, "invalid filter type");
        return zza(onMessageReceivedListener, new IntentFilter[]{zzgj.zza("com.google.android.gms.wearable.MESSAGE_RECEIVED", uri, i)});
    }

    public final Task<Boolean> removeListener(MessageClient.OnMessageReceivedListener onMessageReceivedListener) {
        return doUnregisterEventListener(ListenerHolders.createListenerHolder(onMessageReceivedListener, getLooper(), "MessageListener").getListenerKey());
    }

    public final Task<Integer> sendMessage(String str, String str2, byte[] bArr) {
        return PendingResultUtil.toTask(this.zzei.sendMessage(asGoogleApiClient(), str, str2, bArr), zzfa.zzbx);
    }
}
