package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExtSimpleRecordEvent */
public final class ExtSimpleRecordEvent extends IEvent {

    /* renamed from: d */
    public C92502a f264788d = new C92502a();

    /* renamed from: e */
    public C92503b f264789e = new C92503b();

    /* renamed from: com.tencent.mm.autogen.events.ExtSimpleRecordEvent$a */
    public static final class C92502a {

        /* renamed from: a */
        public int f264790a;

        /* renamed from: b */
        public String f264791b;

        /* renamed from: c */
        public int f264792c;

        /* renamed from: d */
        public Runnable f264793d;
    }

    /* renamed from: com.tencent.mm.autogen.events.ExtSimpleRecordEvent$b */
    public static final class C92503b {

        /* renamed from: a */
        public boolean f264794a = false;
    }

    public ExtSimpleRecordEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExtSimpleRecordEvent)) {
            return false;
        }
        ExtSimpleRecordEvent extSimpleRecordEvent = (ExtSimpleRecordEvent) iEvent;
        C92502a aVar = extSimpleRecordEvent.f264788d;
        if (!C46238a.m51546a(Integer.valueOf(this.f264788d.f264790a), Integer.valueOf(aVar.f264790a)) || !C46238a.m51546a(this.f264788d.f264791b, aVar.f264791b) || !C46238a.m51546a(Integer.valueOf(this.f264788d.f264792c), Integer.valueOf(aVar.f264792c)) || !C46238a.m51546a(this.f264788d.f264793d, aVar.f264793d)) {
            return false;
        }
        C92503b bVar = extSimpleRecordEvent.f264789e;
        if (!C46238a.m51546a(Boolean.valueOf(this.f264789e.f264794a), Boolean.valueOf(bVar.f264794a))) {
            return false;
        }
        this.f264789e.getClass();
        bVar.getClass();
        return C46238a.m51546a(0, 0);
    }
}
