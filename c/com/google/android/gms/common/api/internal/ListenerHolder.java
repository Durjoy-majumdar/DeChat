package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.internal.Preconditions;

public final class ListenerHolder<L> {
    private final zza zzlh;
    private volatile L zzli;
    private final ListenerKey<L> zzlj;

    public static final class ListenerKey<L> {
        private final L zzli;
        private final String zzll;

        public ListenerKey(L l, String str) {
            this.zzli = l;
            this.zzll = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListenerKey)) {
                return false;
            }
            ListenerKey listenerKey = (ListenerKey) obj;
            return this.zzli == listenerKey.zzli && this.zzll.equals(listenerKey.zzll);
        }

        public final int hashCode() {
            return (System.identityHashCode(this.zzli) * 31) + this.zzll.hashCode();
        }
    }

    public interface Notifier<L> {
        void notifyListener(L l);

        void onNotifyListenerFailed();
    }

    public final class zza extends Handler {
        public zza(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            boolean z = true;
            if (message.what != 1) {
                z = false;
            }
            Preconditions.checkArgument(z);
            ListenerHolder.this.notifyListenerInternal((Notifier) message.obj);
        }
    }

    public ListenerHolder(Looper looper, L l, String str) {
        this.zzlh = new zza(looper);
        this.zzli = Preconditions.checkNotNull(l, "Listener must not be null");
        this.zzlj = new ListenerKey<>(l, Preconditions.checkNotEmpty(str));
    }

    public final void clear() {
        this.zzli = null;
    }

    public final ListenerKey<L> getListenerKey() {
        return this.zzlj;
    }

    public final boolean hasListener() {
        return this.zzli != null;
    }

    public final void notifyListener(Notifier<? super L> notifier) {
        Preconditions.checkNotNull(notifier, "Notifier must not be null");
        this.zzlh.sendMessage(this.zzlh.obtainMessage(1, notifier));
    }

    public final void notifyListenerInternal(Notifier<? super L> notifier) {
        L l = this.zzli;
        if (l == null) {
            notifier.onNotifyListenerFailed();
            return;
        }
        try {
            notifier.notifyListener(l);
        } catch (RuntimeException e) {
            notifier.onNotifyListenerFailed();
            throw e;
        }
    }
}
