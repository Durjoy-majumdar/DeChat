package p665qq;

import com.tencent.p014mm.autogen.events.ExptChangeEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import qa1.C35817a;
import qa1.C35818b;
import zt3.C119157j;

/* renamed from: qq.c */
public class C36046c extends IStaticListener<ExptChangeEvent> {
    public boolean callback(IEvent iEvent) {
        ExptChangeEvent exptChangeEvent = (ExptChangeEvent) iEvent;
        if (C35818b.f95630b == null) {
            C35818b.f95630b = new C35818b();
        }
        C35818b bVar = C35818b.f95630b;
        bVar.getClass();
        ((C119157j) C119157j.f356862d).mo183875f(new C35817a(bVar));
        return false;
    }
}
