package y60;

import com.tencent.p014mm.vfs.C86013q1;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: y60.a */
public final class C102802a implements Closeable {

    /* renamed from: d */
    public InputStream f303499d = null;

    /* renamed from: e */
    public byte[] f303500e = null;

    /* renamed from: f */
    public C102810d f303501f;

    /* renamed from: g */
    public C102809c f303502g;

    /* renamed from: h */
    public Object f303503h;

    /* renamed from: y60.a$a */
    public static class C102803a implements C102809c, C102810d {

        /* renamed from: a */
        public String f303504a;

        /* renamed from: b */
        public InputStream f303505b = null;

        public C102803a(String str) {
            this.f303504a = str;
        }

        /* renamed from: a */
        public byte[] mo142544a() {
            byte[] bArr = null;
            try {
                InputStream E = C86013q1.m106423E(this.f303504a);
                this.f303505b = E;
                bArr = new byte[E.available()];
                this.f303505b.read(bArr);
                return bArr;
            } catch (Exception unused) {
                return bArr;
            }
        }

        /* renamed from: b */
        public InputStream mo142545b() {
            try {
                InputStream E = C86013q1.m106423E(this.f303504a);
                this.f303505b = E;
                return E;
            } catch (FileNotFoundException unused) {
                return null;
            }
        }

        public void close() {
            InputStream inputStream = this.f303505b;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: y60.a$b */
    public static class C102804b implements C102809c {

        /* renamed from: a */
        public byte[] f303506a;

        public C102804b(byte[] bArr) {
            this.f303506a = bArr;
        }

        /* renamed from: a */
        public byte[] mo142544a() {
            return this.f303506a;
        }

        public void close() {
        }
    }

    /* renamed from: y60.a$c */
    public static class C102805c implements C102809c {

        /* renamed from: a */
        public InputStream f303507a;

        public C102805c(InputStream inputStream) {
            this.f303507a = inputStream;
        }

        /* renamed from: a */
        public byte[] mo142544a() {
            try {
                return new byte[this.f303507a.available()];
            } catch (Exception unused) {
                return null;
            }
        }

        public void close() {
            InputStream inputStream = this.f303507a;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: y60.a$d */
    public static class C102806d implements C102810d {

        /* renamed from: a */
        public byte[] f303508a;

        /* renamed from: b */
        public InputStream f303509b = null;

        public C102806d(byte[] bArr) {
            this.f303508a = bArr;
        }

        /* renamed from: b */
        public InputStream mo142545b() {
            if (this.f303509b == null) {
                this.f303509b = new ByteArrayInputStream(this.f303508a);
            }
            return this.f303509b;
        }

        public void close() {
            InputStream inputStream = this.f303509b;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: y60.a$e */
    public static class C102807e implements C102810d {

        /* renamed from: a */
        public InputStream f303510a;

        public C102807e(InputStream inputStream) {
            this.f303510a = inputStream;
        }

        /* renamed from: b */
        public InputStream mo142545b() {
            return this.f303510a;
        }

        public void close() {
            InputStream inputStream = this.f303510a;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
            }
        }
    }

    public C102802a(C102810d dVar, C102809c cVar, Object obj) {
        this.f303501f = dVar;
        this.f303502g = cVar;
        this.f303503h = obj;
    }

    /* renamed from: b */
    public static C102802a m135853b(String str, Object obj) {
        C102803a aVar = new C102803a(str);
        return new C102802a(aVar, aVar, obj);
    }

    /* renamed from: a */
    public InputStream mo142542a() {
        InputStream inputStream = this.f303499d;
        if (inputStream != null) {
            return inputStream;
        }
        C102810d dVar = this.f303501f;
        if (dVar == null) {
            return null;
        }
        InputStream b = dVar.mo142545b();
        this.f303499d = b;
        return b;
    }

    public void close() {
        C102810d dVar = this.f303501f;
        if (dVar != null) {
            dVar.close();
            this.f303501f = null;
        }
        C102809c cVar = this.f303502g;
        if (cVar != null) {
            cVar.close();
        }
    }
}
