package com.tencent.p014mm.sdk.event;

import androidx.lifecycle.C0124r;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.platformtools.ListenerInstanceMonitor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.plugin.PluginLifecycleRegistry;
import gp3.C87315b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import zt3.C119157j;

/* renamed from: com.tencent.mm.sdk.event.IListener */
public abstract class IListener<T extends IEvent> implements C0124r {
    public int __eventId;
    private final C0125s lifecycleOwner;
    private C87315b<IListener> mCallbackProperty;
    private final int priority;

    public IListener(C0125s sVar) {
        this(sVar, 0);
    }

    private void internalDead() {
        C87315b<IListener> bVar = this.mCallbackProperty;
        if (bVar != null) {
            ListenerInstanceMonitor.markInstanceUnregistered((IListener) bVar.f253059e);
            this.mCallbackProperty.dead();
            this.mCallbackProperty = null;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$alive$0() {
        if (this.lifecycleOwner.getLifecycle().getCurrentState() != C39623j.C39626c.DESTROYED) {
            this.lifecycleOwner.getLifecycle().addObserver(this);
        } else {
            onLifecycleDestroy();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$dead$1() {
        this.lifecycleOwner.getLifecycle().removeObserver(this);
    }

    public int __getEventID() {
        if (this.__eventId == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            Type genericSuperclass = getClass().getGenericSuperclass();
            if (!(genericSuperclass instanceof ParameterizedType)) {
                genericSuperclass = getClass().getSuperclass().getGenericSuperclass();
            }
            Type type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
            this.__eventId = ((Class) type).getName().hashCode();
            Log.m105927v("IListener", "genEventID, %s<%s>, useTime:%d", getClass().getName(), type, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
        return this.__eventId;
    }

    public synchronized void alive() {
        if (this.mCallbackProperty == null) {
            ListenerInstanceMonitor.markInstanceRegistered(this);
            this.mCallbackProperty = EventCenter.instance.add(this);
        }
        if (!(this.lifecycleOwner.getLifecycle() instanceof PluginLifecycleRegistry)) {
            ((C119157j) C119157j.f356862d).mo183895z(new IListener$$a(this));
        } else if (this.lifecycleOwner.getLifecycle().getCurrentState() != C39623j.C39626c.DESTROYED) {
            this.lifecycleOwner.getLifecycle().addObserver(this);
        } else {
            onLifecycleDestroy();
        }
    }

    public abstract boolean callback(T t);

    public synchronized void dead() {
        internalDead();
        if (this.lifecycleOwner.getLifecycle() instanceof PluginLifecycleRegistry) {
            this.lifecycleOwner.getLifecycle().removeObserver(this);
        } else {
            ((C119157j) C119157j.f356862d).mo183895z(new IListener$$b(this));
        }
    }

    /* access modifiers changed from: package-private */
    public int getPriority() {
        return this.priority;
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public void onLifecycleDestroy() {
        internalDead();
    }

    public IListener(C0125s sVar, int i) {
        this.__eventId = 0;
        this.lifecycleOwner = sVar;
        this.priority = i;
    }
}
