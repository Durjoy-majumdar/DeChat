package p294b7;

import java.lang.reflect.Constructor;
import p299c7.C16861b;
import p330d7.C20440d;
import p332e7.C20522b;
import p333e8.C20549u;
import p336f7.C20668d;
import p336f7.C20672f;
import p341g7.C20795c;
import p345h7.C20894a;
import p345h7.C20896c;
import p345h7.C20914p;
import p345h7.C20920u;
import p347i7.C21054a;

/* renamed from: b7.c */
public final class C16739c implements C16744h {

    /* renamed from: a */
    public static final Constructor<? extends C16741e> f45246a;

    static {
        Constructor<? extends U> constructor;
        try {
            constructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(C16741e.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            constructor = null;
        }
        f45246a = constructor;
    }

    /* renamed from: a */
    public synchronized C16741e[] mo17740a() {
        C16741e[] eVarArr;
        Constructor<? extends C16741e> constructor = f45246a;
        eVarArr = new C16741e[(constructor == null ? 11 : 12)];
        eVarArr[0] = new C20440d(0);
        eVarArr[1] = new C20668d(0, (C20549u) null);
        eVarArr[2] = new C20672f(0);
        eVarArr[3] = new C20522b(0);
        eVarArr[4] = new C20896c();
        eVarArr[5] = new C20894a();
        eVarArr[6] = new C20920u(1, 0);
        eVarArr[7] = new C16861b();
        eVarArr[8] = new C20795c();
        eVarArr[9] = new C20914p();
        eVarArr[10] = new C21054a();
        if (constructor != null) {
            try {
                eVarArr[11] = (C16741e) constructor.newInstance(new Object[0]);
            } catch (Exception e) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
            }
        }
        return eVarArr;
    }
}
