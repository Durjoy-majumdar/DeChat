package com.tencent.p014mm.autogen.events;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.DealQBarStrEvent */
public final class DealQBarStrEvent extends IEvent {

    /* renamed from: d */
    public C92468a f264648d = new C92468a();

    /* renamed from: com.tencent.mm.autogen.events.DealQBarStrEvent$a */
    public static final class C92468a {

        /* renamed from: a */
        public String f264649a;

        /* renamed from: b */
        public Activity f264650b;

        /* renamed from: c */
        public int f264651c;

        /* renamed from: d */
        public int f264652d;

        /* renamed from: e */
        public int f264653e = 0;

        /* renamed from: f */
        public String f264654f;

        /* renamed from: g */
        public int f264655g = -1;

        /* renamed from: h */
        public String f264656h;

        /* renamed from: i */
        public int f264657i = -1;

        /* renamed from: j */
        public String f264658j;

        /* renamed from: k */
        public String f264659k;

        /* renamed from: l */
        public Bundle f264660l;

        /* renamed from: m */
        public String f264661m;
    }

    public DealQBarStrEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof DealQBarStrEvent)) {
            return false;
        }
        C92468a aVar = ((DealQBarStrEvent) iEvent).f264648d;
        return C46238a.m51546a(this.f264648d.f264649a, aVar.f264649a) && C46238a.m51546a(this.f264648d.f264650b, aVar.f264650b) && C46238a.m51546a(Integer.valueOf(this.f264648d.f264651c), Integer.valueOf(aVar.f264651c)) && C46238a.m51546a(Integer.valueOf(this.f264648d.f264652d), Integer.valueOf(aVar.f264652d)) && C46238a.m51546a(Integer.valueOf(this.f264648d.f264653e), Integer.valueOf(aVar.f264653e)) && C46238a.m51546a(this.f264648d.f264654f, aVar.f264654f) && C46238a.m51546a(Integer.valueOf(this.f264648d.f264655g), Integer.valueOf(aVar.f264655g)) && C46238a.m51546a(this.f264648d.f264656h, aVar.f264656h) && C46238a.m51546a(Integer.valueOf(this.f264648d.f264657i), Integer.valueOf(aVar.f264657i)) && C46238a.m51546a(this.f264648d.f264658j, aVar.f264658j) && C46238a.m51546a(this.f264648d.f264659k, aVar.f264659k) && C46238a.m51546a(this.f264648d.f264660l, aVar.f264660l) && C46238a.m51546a(this.f264648d.f264661m, aVar.f264661m);
    }
}
