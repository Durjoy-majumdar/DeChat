package bd3;

import com.tencent.p014mm.autogen.events.MStorageNotifyEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;

/* renamed from: bd3.a */
public abstract class C39760a implements MStorage.IOnStorageChange {

    /* renamed from: d */
    public int f106705d = 0;

    /* renamed from: a */
    public abstract IEvent mo62400a(String str);

    /* renamed from: b */
    public abstract MStorage mo62401b();

    /* renamed from: c */
    public void mo62402c() {
        MStorage b;
        if (this.f106705d == 0 && (b = mo62401b()) != null) {
            b.add(this);
        }
        this.f106705d++;
    }

    /* renamed from: d */
    public void mo62403d() {
        MStorage b;
        int i = this.f106705d;
        if (i != 0) {
            int i2 = i - 1;
            this.f106705d = i2;
            if (i2 == 0 && (b = mo62401b()) != null) {
                b.remove(this);
            }
        }
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        MStorageNotifyEvent mStorageNotifyEvent = new MStorageNotifyEvent();
        mStorageNotifyEvent.f107633d.f107634a = mo62400a(str);
        mStorageNotifyEvent.publish();
    }
}
