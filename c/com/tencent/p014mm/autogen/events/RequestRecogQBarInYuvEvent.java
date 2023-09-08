package com.tencent.p014mm.autogen.events;

import android.graphics.Rect;
import com.tencent.p014mm.plugin.facedetect.model.C93391x;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.RequestRecogQBarInYuvEvent */
public final class RequestRecogQBarInYuvEvent extends IEvent {

    /* renamed from: d */
    public C92556a f265068d = new C92556a();

    /* renamed from: com.tencent.mm.autogen.events.RequestRecogQBarInYuvEvent$a */
    public static final class C92556a {

        /* renamed from: a */
        public byte[] f265069a;

        /* renamed from: b */
        public int f265070b = -1;

        /* renamed from: c */
        public int f265071c = -1;

        /* renamed from: d */
        public Rect f265072d;

        /* renamed from: e */
        public int f265073e = 90;

        /* renamed from: f */
        public C93391x f265074f;
    }

    public RequestRecogQBarInYuvEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RequestRecogQBarInYuvEvent)) {
            return false;
        }
        C92556a aVar = ((RequestRecogQBarInYuvEvent) iEvent).f265068d;
        return C46238a.m51546a(this.f265068d.f265069a, aVar.f265069a) && C46238a.m51546a(Integer.valueOf(this.f265068d.f265070b), Integer.valueOf(aVar.f265070b)) && C46238a.m51546a(Integer.valueOf(this.f265068d.f265071c), Integer.valueOf(aVar.f265071c)) && C46238a.m51546a(this.f265068d.f265072d, aVar.f265072d) && C46238a.m51546a(Integer.valueOf(this.f265068d.f265073e), Integer.valueOf(aVar.f265073e)) && C46238a.m51546a(this.f265068d.f265074f, aVar.f265074f);
    }
}
