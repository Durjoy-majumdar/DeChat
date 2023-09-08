package com.tencent.p014mm.autogen.events;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import java.util.Set;

/* renamed from: com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent */
public final class RecogQBarOfImageFileEvent extends IEvent {

    /* renamed from: d */
    public C40158a f107731d = new C40158a();

    /* renamed from: com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent$a */
    public static final class C40158a {

        /* renamed from: a */
        public long f107732a;

        /* renamed from: b */
        public String f107733b;

        /* renamed from: c */
        public Bitmap f107734c;

        /* renamed from: d */
        public Set f107735d;

        /* renamed from: e */
        public boolean f107736e;

        /* renamed from: f */
        public int f107737f;
    }

    public RecogQBarOfImageFileEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RecogQBarOfImageFileEvent)) {
            return false;
        }
        C40158a aVar = ((RecogQBarOfImageFileEvent) iEvent).f107731d;
        return C46238a.m51546a(Long.valueOf(this.f107731d.f107732a), Long.valueOf(aVar.f107732a)) && C46238a.m51546a(this.f107731d.f107733b, aVar.f107733b) && C46238a.m51546a(this.f107731d.f107734c, aVar.f107734c) && C46238a.m51546a(this.f107731d.f107735d, aVar.f107735d) && C46238a.m51546a(Boolean.valueOf(this.f107731d.f107736e), Boolean.valueOf(aVar.f107736e)) && C46238a.m51546a(Integer.valueOf(this.f107731d.f107737f), Integer.valueOf(aVar.f107737f));
    }
}
