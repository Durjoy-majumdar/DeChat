package p571j6;

import java.io.IOException;

/* renamed from: j6.a */
public final class C87884a {

    /* renamed from: a */
    public static final C87895h f254391a = new C87887c("null");

    /* renamed from: b */
    public static final C87895h f254392b = new C87887c("true");

    /* renamed from: c */
    public static final C87895h f254393c = new C87887c("false");

    /* renamed from: a */
    public static C87895h m109365a(String str) {
        if (str != null) {
            try {
                C87893f fVar = new C87893f(str);
                fVar.mo122354d();
                fVar.mo122360j();
                C87895h i = fVar.mo122359i();
                fVar.mo122360j();
                if (fVar.f254413h == -1) {
                    return i;
                }
                throw fVar.mo122352b("Unexpected character");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new NullPointerException("string is null");
        }
    }
}
