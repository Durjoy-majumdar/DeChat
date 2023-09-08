package com.tencent.p014mm.autogen.events;

import android.content.Context;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.autogen.events.LaunchAAEvent */
public final class LaunchAAEvent extends IEvent {

    /* renamed from: d */
    public C67723a f193713d = new C67723a();

    /* renamed from: e */
    public C67724b f193714e = new C67724b();

    /* renamed from: com.tencent.mm.autogen.events.LaunchAAEvent$a */
    public static final class C67723a {

        /* renamed from: a */
        public Context f193715a;

        /* renamed from: b */
        public ArrayList f193716b;

        /* renamed from: c */
        public String f193717c;
    }

    /* renamed from: com.tencent.mm.autogen.events.LaunchAAEvent$b */
    public static final class C67724b {
    }

    public LaunchAAEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof LaunchAAEvent)) {
            return false;
        }
        LaunchAAEvent launchAAEvent = (LaunchAAEvent) iEvent;
        C67723a aVar = launchAAEvent.f193713d;
        if (!C46238a.m51546a(this.f193713d.f193715a, aVar.f193715a) || !C46238a.m51546a(this.f193713d.f193716b, aVar.f193716b) || !C46238a.m51546a(this.f193713d.f193717c, aVar.f193717c)) {
            return false;
        }
        C67724b bVar = launchAAEvent.f193714e;
        this.f193714e.getClass();
        Boolean bool = Boolean.FALSE;
        bVar.getClass();
        return C46238a.m51546a(bool, bool);
    }
}
