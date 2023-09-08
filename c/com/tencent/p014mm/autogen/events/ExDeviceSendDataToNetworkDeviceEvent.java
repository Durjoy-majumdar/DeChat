package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import java.util.LinkedList;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceSendDataToNetworkDeviceEvent */
public final class ExDeviceSendDataToNetworkDeviceEvent extends IEvent {

    /* renamed from: d */
    public C92485a f264724d = new C92485a();

    /* renamed from: e */
    public C92486b f264725e = new C92486b();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceSendDataToNetworkDeviceEvent$a */
    public static final class C92485a {

        /* renamed from: a */
        public String f264726a;

        /* renamed from: b */
        public String f264727b;

        /* renamed from: c */
        public String f264728c;

        /* renamed from: d */
        public String f264729d;

        /* renamed from: e */
        public long f264730e;

        /* renamed from: f */
        public String f264731f;

        /* renamed from: g */
        public boolean f264732g;

        /* renamed from: h */
        public boolean f264733h;

        /* renamed from: i */
        public int f264734i;

        /* renamed from: j */
        public LinkedList f264735j;
    }

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceSendDataToNetworkDeviceEvent$b */
    public static final class C92486b {

        /* renamed from: a */
        public boolean f264736a;
    }

    public ExDeviceSendDataToNetworkDeviceEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceSendDataToNetworkDeviceEvent)) {
            return false;
        }
        ExDeviceSendDataToNetworkDeviceEvent exDeviceSendDataToNetworkDeviceEvent = (ExDeviceSendDataToNetworkDeviceEvent) iEvent;
        C92485a aVar = exDeviceSendDataToNetworkDeviceEvent.f264724d;
        if (!C46238a.m51546a(this.f264724d.f264726a, aVar.f264726a) || !C46238a.m51546a(this.f264724d.f264727b, aVar.f264727b) || !C46238a.m51546a(this.f264724d.f264728c, aVar.f264728c) || !C46238a.m51546a(this.f264724d.f264729d, aVar.f264729d) || !C46238a.m51546a(Long.valueOf(this.f264724d.f264730e), Long.valueOf(aVar.f264730e)) || !C46238a.m51546a(this.f264724d.f264731f, aVar.f264731f) || !C46238a.m51546a(Boolean.valueOf(this.f264724d.f264732g), Boolean.valueOf(aVar.f264732g)) || !C46238a.m51546a(Boolean.valueOf(this.f264724d.f264733h), Boolean.valueOf(aVar.f264733h)) || !C46238a.m51546a(Integer.valueOf(this.f264724d.f264734i), Integer.valueOf(aVar.f264734i))) {
            return false;
        }
        this.f264724d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null) || !C46238a.m51546a(this.f264724d.f264735j, aVar.f264735j)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f264725e.f264736a), Boolean.valueOf(exDeviceSendDataToNetworkDeviceEvent.f264725e.f264736a));
    }
}
