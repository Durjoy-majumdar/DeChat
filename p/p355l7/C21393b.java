package p355l7;

import com.google.android.exoplayer2.Format;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import p360m7.C21485a;
import p365n7.C21605a;
import p369o7.C21786a;

/* renamed from: l7.b */
public interface C21393b {

    /* renamed from: a */
    public static final C21393b f60525a = new C21394a();

    /* renamed from: l7.b$a */
    public static class C21394a implements C21393b {
        /* renamed from: a */
        public boolean mo33522a(Format format) {
            String str = format.f45777i;
            return MimeTypes.APPLICATION_ID3.equals(str) || MimeTypes.APPLICATION_EMSG.equals(str) || MimeTypes.APPLICATION_SCTE35.equals(str);
        }

        /* renamed from: b */
        public C21392a mo33523b(Format format) {
            String str = format.f45777i;
            str.getClass();
            char c = 65535;
            switch (str.hashCode()) {
                case -1248341703:
                    if (str.equals(MimeTypes.APPLICATION_ID3)) {
                        c = 0;
                        break;
                    }
                    break;
                case 1154383568:
                    if (str.equals(MimeTypes.APPLICATION_EMSG)) {
                        c = 1;
                        break;
                    }
                    break;
                case 1652648887:
                    if (str.equals(MimeTypes.APPLICATION_SCTE35)) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return new C21605a((C21605a.C21606a) null);
                case 1:
                    return new C21485a();
                case 2:
                    return new C21786a();
                default:
                    throw new IllegalArgumentException("Attempted to create decoder for unsupported format");
            }
        }
    }

    /* renamed from: a */
    boolean mo33522a(Format format);

    /* renamed from: b */
    C21392a mo33523b(Format format);
}
