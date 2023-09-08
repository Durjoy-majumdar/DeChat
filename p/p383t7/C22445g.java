package p383t7;

import com.google.android.exoplayer2.Format;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import p290a8.C16439b;
import p290a8.C16448g;
import p386u7.C22600a;
import p386u7.C22604c;
import p389v7.C22716a;
import p393w7.C22875a;
import p397x7.C23032a;
import p402y7.C23254a;
import p405z7.C23460a;

/* renamed from: t7.g */
public interface C22445g {

    /* renamed from: a */
    public static final C22445g f63569a = new C22446a();

    /* renamed from: t7.g$a */
    public static class C22446a implements C22445g {
        /* renamed from: a */
        public C22443e mo35590a(Format format) {
            String str = format.f45777i;
            str.getClass();
            char c = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals(MimeTypes.APPLICATION_DVBSUBS)) {
                        c = 0;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals(MimeTypes.APPLICATION_MP4VTT)) {
                        c = 1;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c = 2;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals(MimeTypes.APPLICATION_TX3G)) {
                        c = 3;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals(MimeTypes.TEXT_SSA)) {
                        c = 4;
                        break;
                    }
                    break;
                case 930165504:
                    if (str.equals(MimeTypes.APPLICATION_MP4CEA608)) {
                        c = 5;
                        break;
                    }
                    break;
                case 1566015601:
                    if (str.equals(MimeTypes.APPLICATION_CEA608)) {
                        c = 6;
                        break;
                    }
                    break;
                case 1566016562:
                    if (str.equals(MimeTypes.APPLICATION_CEA708)) {
                        c = 7;
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals(MimeTypes.APPLICATION_SUBRIP)) {
                        c = 8;
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals(MimeTypes.APPLICATION_TTML)) {
                        c = 9;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return new C22716a(format.f45779n);
                case 1:
                    return new C16439b();
                case 2:
                    return new C16448g();
                case 3:
                    return new C23460a(format.f45779n);
                case 4:
                    return new C22875a(format.f45779n);
                case 5:
                case 6:
                    return new C22600a(format.f45777i, format.f45770F);
                case 7:
                    return new C22604c(format.f45770F);
                case 8:
                    return new C23032a();
                case 9:
                    return new C23254a();
                default:
                    throw new IllegalArgumentException("Attempted to create decoder for unsupported format");
            }
        }
    }
}
