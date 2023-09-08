package v24;

/* renamed from: v24.a */
public class C90742a {

    /* renamed from: d */
    public static volatile C90743b f260626d = C90743b.f260630o;

    /* renamed from: a */
    public final StringBuffer f260627a;

    /* renamed from: b */
    public final Object f260628b;

    /* renamed from: c */
    public final C90743b f260629c;

    public C90742a(Object obj, C90743b bVar) {
        bVar = bVar == null ? f260626d : bVar;
        StringBuffer stringBuffer = new StringBuffer(512);
        this.f260627a = stringBuffer;
        this.f260629c = bVar;
        this.f260628b = obj;
        if (obj != null) {
            if (bVar.f260634e) {
                C90743b.m113811d(obj);
                if (bVar.f260635f) {
                    stringBuffer.append(bVar.mo124877c(obj.getClass()));
                } else {
                    stringBuffer.append(obj.getClass().getName());
                }
            }
            if (bVar.f260636g) {
                C90743b.m113811d(obj);
                stringBuffer.append('@');
                stringBuffer.append(Integer.toHexString(System.identityHashCode(obj)));
            }
            stringBuffer.append(bVar.f260637h);
            if (bVar.f260639j) {
                stringBuffer.append(bVar.f260640n);
                return;
            }
            return;
        }
        bVar.getClass();
    }

    public String toString() {
        Object obj = this.f260628b;
        if (obj == null) {
            StringBuffer stringBuffer = this.f260627a;
            this.f260629c.getClass();
            stringBuffer.append("<null>");
        } else {
            C90743b bVar = this.f260629c;
            StringBuffer stringBuffer2 = this.f260627a;
            bVar.getClass();
            int length = stringBuffer2.length();
            int length2 = bVar.f260640n.length();
            if (length > 0 && length2 > 0 && length >= length2) {
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= length2) {
                        z = true;
                        break;
                    } else if (stringBuffer2.charAt((length - 1) - i) != bVar.f260640n.charAt((length2 - 1) - i)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (z) {
                    stringBuffer2.setLength(length - length2);
                }
            }
            stringBuffer2.append(bVar.f260638i);
            C90743b.m113812e(obj);
        }
        return this.f260627a.toString();
    }
}
