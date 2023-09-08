package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import eb0.C97627k3;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FlutterMethodCallEvent */
public final class FlutterMethodCallEvent extends IEvent {

    /* renamed from: d */
    public C92519a f264872d = new C92519a();

    /* renamed from: com.tencent.mm.autogen.events.FlutterMethodCallEvent$a */
    public static final class C92519a {

        /* renamed from: a */
        public boolean f264873a;

        /* renamed from: b */
        public C97627k3 f264874b;

        /* renamed from: c */
        public String f264875c;
    }

    public FlutterMethodCallEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FlutterMethodCallEvent)) {
            return false;
        }
        C92519a aVar = ((FlutterMethodCallEvent) iEvent).f264872d;
        if (!C46238a.m51546a(Boolean.valueOf(this.f264872d.f264873a), Boolean.valueOf(aVar.f264873a)) || !C46238a.m51546a(this.f264872d.f264874b, aVar.f264874b) || !C46238a.m51546a(this.f264872d.f264875c, aVar.f264875c)) {
            return false;
        }
        this.f264872d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f264872d.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
