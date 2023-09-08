package p571j6;

import java.io.IOException;
import java.io.Serializable;
import java.io.StringWriter;

/* renamed from: j6.h */
public abstract class C87895h implements Serializable {
    static {
        C87895h hVar = C87884a.f254391a;
        C87895h hVar2 = C87884a.f254391a;
        C87895h hVar3 = C87884a.f254391a;
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f */
    public C87889e mo122341f() {
        throw new UnsupportedOperationException("Not an object: " + toString());
    }

    /* renamed from: h */
    public String mo122362h(C87897k kVar) {
        StringWriter stringWriter = new StringWriter();
        if (kVar != null) {
            try {
                C87899l lVar = new C87899l(stringWriter, 128);
                mo122334i(kVar.mo122371a(lVar));
                lVar.flush();
                return stringWriter.toString();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new NullPointerException("config is null");
        }
    }

    public int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public abstract void mo122334i(C87896i iVar);

    public String toString() {
        return mo122362h(C87897k.f254426a);
    }
}
