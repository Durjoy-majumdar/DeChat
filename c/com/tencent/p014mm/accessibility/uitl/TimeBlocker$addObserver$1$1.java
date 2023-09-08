package com.tencent.p014mm.accessibility.uitl;

import androidx.lifecycle.C0125s;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.sdk.platformtools.Log;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "run", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.uitl.TimeBlocker$addObserver$1$1 */
public final class TimeBlocker$addObserver$1$1 implements Runnable {
    public final /* synthetic */ TimeBlocker$addObserver$1$observer$1 $observer;
    public final /* synthetic */ C0125s $owner;

    public TimeBlocker$addObserver$1$1(C0125s sVar, TimeBlocker$addObserver$1$observer$1 timeBlocker$addObserver$1$observer$1) {
        this.$owner = sVar;
        this.$observer = timeBlocker$addObserver$1$observer$1;
    }

    public final void run() {
        Log.m105924i("MicroMsg.Acc.TimeBlocker", "addObserver in uiAtFront:" + this.$owner + ' ' + this.$owner.getLifecycle().getCurrentState().name());
        C39623j lifecycle = this.$owner.getLifecycle();
        TimeBlocker$addObserver$1$observer$1 timeBlocker$addObserver$1$observer$1 = this.$observer;
        C0125s sVar = this.$owner;
        if (lifecycle.getCurrentState() != C39623j.C39626c.DESTROYED) {
            lifecycle.addObserver(timeBlocker$addObserver$1$observer$1);
            return;
        }
        Log.m105924i("MicroMsg.Acc.TimeBlocker", "addObserver in uiAtFront but destroy " + sVar);
        TimeBlocker.ownerMap.remove(Integer.valueOf(sVar.hashCode()));
    }
}
