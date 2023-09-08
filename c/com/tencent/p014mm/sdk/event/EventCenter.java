package com.tencent.p014mm.sdk.event;

import android.content.Context;
import android.os.Looper;
import bp3.C79760s;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gp3.C87314a;
import gp3.C87315b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executor;
import junit.framework.Assert;
import lp3.C88643g;
import lu3.C88656g;
import mp3.C88819d;
import op3.C117882j;
import p261wl.C38166b;
import p261wl.C38174i;
import zt3.C119157j;

/* renamed from: com.tencent.mm.sdk.event.EventCenter */
public final class EventCenter {
    private static final String TAG = "MicroMsg.EventCenter";
    public static EventCenter instance = new EventCenter();
    private final HashMap<Integer, List<IListener>> listenersMap = new HashMap<>();
    private final HashMap<Integer, WxEventsCallbacks> mCallbacksMap = new HashMap<>();
    /* access modifiers changed from: private */
    public SilenceNoLooperScheduler mSilenceNoLooperScheduler = new SilenceNoLooperScheduler();

    /* renamed from: com.tencent.mm.sdk.event.EventCenter$SilenceNoLooperScheduler */
    public static class SilenceNoLooperScheduler extends C88819d {
        public void arrange(Runnable runnable) {
            runnable.run();
        }

        public void arrangeInterval(Runnable runnable, long j) {
            runnable.run();
        }

        public void cancel() {
        }

        public String getType() {
            return Thread.currentThread().toString();
        }
    }

    /* renamed from: com.tencent.mm.sdk.event.EventCenter$WxEventsCallbacks */
    public class WxEventsCallbacks extends C87314a<IListener> {
        public WxEventsCallbacks() {
            super((C88819d) EventCenter.this.mSilenceNoLooperScheduler);
        }

        public void invoke(C117882j jVar) {
            LinkedList<C87315b> queue = getQueue();
            IEvent iEvent = (IEvent) jVar.mo182596a(0);
            if (iEvent == null) {
                Log.m105920e(EventCenter.TAG, "event is null! fatal!");
                return;
            }
            if (!((Boolean) jVar.mo182596a(1)).booleanValue()) {
                if (iEvent.getOrder()) {
                    Collections.sort(queue, new Comparator<C87315b>() {
                        public int compare(C87315b bVar, C87315b bVar2) {
                            return ((IListener) bVar2.f253059e).getPriority() - ((IListener) bVar.f253059e).getPriority();
                        }
                    });
                }
                int size = queue.size();
                C87315b[] bVarArr = new C87315b[size];
                queue.toArray(bVarArr);
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    C87315b bVar = bVarArr[i];
                    IListener iListener = (IListener) bVar.f253059e;
                    try {
                        C79760s.m96908a(C79760s.m96910c(MMApplicationContext.getContext(), iListener.getClass().getName()) + ".callback()");
                        if (iListener.callback(iEvent) && iEvent.getOrder()) {
                            Log.m105929w(EventCenter.TAG, "event '%s' was consumed by listener '%s' so it will not be passed to other listeners.", iEvent, bVar.f253059e);
                            break;
                        }
                        i++;
                    } finally {
                        C79760s.m96909b();
                    }
                }
            }
            Runnable runnable = iEvent.callback;
            if (runnable != null) {
                runnable.run();
            }
        }

        public C87315b<IListener> add(IListener iListener) {
            return add(new C87315b(iListener, this));
        }

        public void remove(IListener iListener) {
            remove(new C87315b(iListener, this));
        }
    }

    private EventCenter() {
    }

    private List<IStaticListener> queryStaticListenerByEvent(Class<? extends IEvent> cls) {
        ArrayList arrayList = new ArrayList(32);
        Context context = MMApplicationContext.getContext();
        C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(IStaticListener.class);
        C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
        while (bVar.hasNext()) {
            C38174i iVar = (C38174i) bVar.next();
            if (C38166b.m41758e(context, iVar) && iVar.hasKey(cls)) {
                arrayList.add((IStaticListener) iVar.get());
            }
        }
        return arrayList;
    }

    private void trigger(List<? extends IListener> list, IEvent iEvent) {
        if (iEvent.getOrder()) {
            Collections.sort(list, new Comparator<IListener>() {
                public int compare(IListener iListener, IListener iListener2) {
                    return iListener2.getPriority() - iListener.getPriority();
                }
            });
        }
        if (list != null) {
            Iterator<? extends IListener> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                IListener iListener = (IListener) it.next();
                if (iListener.callback(iEvent) && iEvent.getOrder()) {
                    Log.m105929w(TAG, "event '%s' was consumed by listener '%s' so it will not be passed to other listeners.", iEvent, iListener);
                    break;
                }
            }
        }
        Runnable runnable = iEvent.callback;
        if (runnable != null) {
            runnable.run();
        }
    }

    public C87315b<IListener> add(IListener iListener) {
        C87315b<IListener> add;
        synchronized (this) {
            Assert.assertNotNull("EventPoolImpl.add", iListener);
            Log.m105927v(TAG, "addListener %s(%d)", iListener, Integer.valueOf(iListener.__getEventID()));
            WxEventsCallbacks wxEventsCallbacks = this.mCallbacksMap.get(Integer.valueOf(iListener.__getEventID()));
            if (wxEventsCallbacks == null) {
                HashMap<Integer, WxEventsCallbacks> hashMap = this.mCallbacksMap;
                Integer valueOf = Integer.valueOf(iListener.__getEventID());
                WxEventsCallbacks wxEventsCallbacks2 = new WxEventsCallbacks();
                hashMap.put(valueOf, wxEventsCallbacks2);
                wxEventsCallbacks = wxEventsCallbacks2;
            }
            add = wxEventsCallbacks.add(iListener);
        }
        return add;
    }

    public void asyncPublish(IEvent iEvent, String str) {
        Log.m105927v(TAG, "publish %s(%d)", iEvent, Integer.valueOf(iEvent.__getEventID()));
        ((C119157j) C119157j.f356862d).mo183876g(new EventCenter$$b(this, iEvent), str);
    }

    public synchronized boolean hadListened(IListener iListener) {
        Assert.assertNotNull("EventPoolImpl.hadListened", iListener);
        List list = this.listenersMap.get(Integer.valueOf(iListener.__getEventID()));
        if (list != null && !list.isEmpty() && list.contains(iListener)) {
            return true;
        }
        WxEventsCallbacks wxEventsCallbacks = this.mCallbacksMap.get(Integer.valueOf(iListener.__getEventID()));
        return wxEventsCallbacks != null && wxEventsCallbacks.size() > 0 && wxEventsCallbacks.contains(iListener);
    }

    public synchronized boolean hasListener(Class<? extends IEvent> cls) {
        Assert.assertNotNull("EventPoolImpl.hasListener", cls);
        List list = this.listenersMap.get(Integer.valueOf(cls.getName().hashCode()));
        if (list != null && list.size() > 0) {
            return true;
        }
        WxEventsCallbacks wxEventsCallbacks = this.mCallbacksMap.get(Integer.valueOf(cls.getName().hashCode()));
        if (wxEventsCallbacks != null && wxEventsCallbacks.size() > 0) {
            return true;
        }
        for (C38174i hasKey : ((C38166b.C38167a) C38166b.m41759f(IStaticListener.class)).all()) {
            if (hasKey.hasKey(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: publish */
    public boolean lambda$asyncPublish$1(IEvent iEvent) {
        WxEventsCallbacks wxEventsCallbacks;
        Runnable runnable;
        Assert.assertNotNull("EventPoolImpl.publish", iEvent);
        boolean z = false;
        Log.m105927v(TAG, "publish %s(%d)", iEvent, Integer.valueOf(iEvent.__getEventID()));
        List<IStaticListener> queryStaticListenerByEvent = queryStaticListenerByEvent(iEvent.getClass());
        boolean z2 = !queryStaticListenerByEvent.isEmpty();
        synchronized (this) {
            int __getEventID = iEvent.__getEventID();
            List list = this.listenersMap.get(Integer.valueOf(__getEventID));
            if (list != null) {
                new ArrayList(list);
                z2 = true;
            }
            wxEventsCallbacks = this.mCallbacksMap.get(Integer.valueOf(__getEventID));
            if (wxEventsCallbacks != null) {
                z2 = true;
            }
            if (!z2) {
                Log.m105929w(TAG, "No listener for this event %s(%d), Stack: %s.", iEvent, Integer.valueOf(__getEventID), "");
            }
        }
        if (!queryStaticListenerByEvent.isEmpty()) {
            Collections.sort(queryStaticListenerByEvent, new Comparator<IStaticListener>() {
                public int compare(IStaticListener iStaticListener, IStaticListener iStaticListener2) {
                    return iStaticListener2.getPriority() - iStaticListener.getPriority();
                }
            });
            Iterator<IStaticListener> it = queryStaticListenerByEvent.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                IStaticListener next = it.next();
                try {
                    C79760s.m96908a("[static] " + C79760s.m96910c(MMApplicationContext.getContext(), next.getClass().getName()) + ".callback()");
                    if (next.callback(iEvent) && iEvent.getOrder()) {
                        Log.m105929w(TAG, "event '%s' was consumed by listener '%s' so it will not be passed to other listeners.", iEvent, queryStaticListenerByEvent);
                        z = true;
                        break;
                    }
                } finally {
                    C79760s.m96909b();
                }
            }
        }
        if (wxEventsCallbacks != null) {
            wxEventsCallbacks.invoke(C88643g.m110554l(iEvent, Boolean.valueOf(z)));
        } else if (!queryStaticListenerByEvent.isEmpty() && (runnable = iEvent.callback) != null) {
            runnable.run();
        }
        return z2;
    }

    public void asyncPublish(IEvent iEvent, Looper looper) {
        Assert.assertNotNull("EventPoolImpl.asyncPublish event", iEvent);
        Assert.assertNotNull("EventPoolImpl.asyncPublish looper", looper);
        Log.m105927v(TAG, "publish %s(%d)", iEvent, Integer.valueOf(iEvent.__getEventID()));
        new MMHandler(looper).post(new EventCenter$$a(this, iEvent));
    }

    public void asyncPublish(final IEvent iEvent, Executor executor) {
        Assert.assertNotNull("EventPoolImpl.asyncPublish event", iEvent);
        Assert.assertNotNull("EventPoolImpl.asyncPublish executor", executor);
        Log.m105927v(TAG, "publish %s(%d)", iEvent, Integer.valueOf(iEvent.__getEventID()));
        executor.execute(new C88656g() {
            public String getKey() {
                return iEvent.getClass().getName();
            }

            public void run() {
                EventCenter.this.lambda$asyncPublish$1(iEvent);
            }
        });
    }
}
