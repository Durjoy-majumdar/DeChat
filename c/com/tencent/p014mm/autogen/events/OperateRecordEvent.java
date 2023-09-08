package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.OperateRecordEvent */
public final class OperateRecordEvent extends IEvent {

    /* renamed from: d */
    public C80732a f236248d = new C80732a();

    /* renamed from: com.tencent.mm.autogen.events.OperateRecordEvent$a */
    public static final class C80732a {

        /* renamed from: a */
        public int f236249a;

        /* renamed from: b */
        public int f236250b;

        /* renamed from: c */
        public String f236251c;

        /* renamed from: d */
        public String f236252d;

        /* renamed from: e */
        public int f236253e;

        /* renamed from: f */
        public byte[] f236254f;

        /* renamed from: g */
        public boolean f236255g;

        /* renamed from: h */
        public int f236256h;

        /* renamed from: i */
        public String f236257i;

        /* renamed from: j */
        public String f236258j;
    }

    public OperateRecordEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof OperateRecordEvent)) {
            return false;
        }
        C80732a aVar = ((OperateRecordEvent) iEvent).f236248d;
        if (!C46238a.m51546a(Integer.valueOf(this.f236248d.f236249a), Integer.valueOf(aVar.f236249a)) || !C46238a.m51546a(Integer.valueOf(this.f236248d.f236250b), Integer.valueOf(aVar.f236250b)) || !C46238a.m51546a(this.f236248d.f236251c, aVar.f236251c) || !C46238a.m51546a(this.f236248d.f236252d, aVar.f236252d) || !C46238a.m51546a(Integer.valueOf(this.f236248d.f236253e), Integer.valueOf(aVar.f236253e))) {
            return false;
        }
        this.f236248d.getClass();
        return C46238a.m51546a(0, 0) && C46238a.m51546a(this.f236248d.f236254f, aVar.f236254f) && C46238a.m51546a(Boolean.valueOf(this.f236248d.f236255g), Boolean.valueOf(aVar.f236255g)) && C46238a.m51546a(Integer.valueOf(this.f236248d.f236256h), Integer.valueOf(aVar.f236256h)) && C46238a.m51546a(this.f236248d.f236257i, aVar.f236257i) && C46238a.m51546a(this.f236248d.f236258j, aVar.f236258j);
    }
}
