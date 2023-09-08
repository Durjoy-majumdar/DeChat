package p336f7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p333e8.C20541m;
import p333e8.C20551y;

/* renamed from: f7.a */
public abstract class C20659a {

    /* renamed from: A */
    public static final int f58171A = C20551y.m22316f("trun");

    /* renamed from: A0 */
    public static final int f58172A0 = C20551y.m22316f("udta");

    /* renamed from: B */
    public static final int f58173B = C20551y.m22316f("sidx");

    /* renamed from: B0 */
    public static final int f58174B0 = C20551y.m22316f("meta");

    /* renamed from: C */
    public static final int f58175C = C20551y.m22316f("moov");

    /* renamed from: C0 */
    public static final int f58176C0 = C20551y.m22316f("ilst");

    /* renamed from: D */
    public static final int f58177D = C20551y.m22316f("mvhd");

    /* renamed from: D0 */
    public static final int f58178D0 = C20551y.m22316f("mean");

    /* renamed from: E */
    public static final int f58179E = C20551y.m22316f("trak");

    /* renamed from: E0 */
    public static final int f58180E0 = C20551y.m22316f("name");

    /* renamed from: F */
    public static final int f58181F = C20551y.m22316f("mdia");

    /* renamed from: F0 */
    public static final int f58182F0 = C20551y.m22316f("data");

    /* renamed from: G */
    public static final int f58183G = C20551y.m22316f("minf");

    /* renamed from: G0 */
    public static final int f58184G0 = C20551y.m22316f("emsg");

    /* renamed from: H */
    public static final int f58185H = C20551y.m22316f("stbl");

    /* renamed from: H0 */
    public static final int f58186H0 = C20551y.m22316f("st3d");

    /* renamed from: I */
    public static final int f58187I = C20551y.m22316f("avcC");

    /* renamed from: I0 */
    public static final int f58188I0 = C20551y.m22316f("sv3d");

    /* renamed from: J */
    public static final int f58189J = C20551y.m22316f("hvcC");

    /* renamed from: J0 */
    public static final int f58190J0 = C20551y.m22316f("proj");

    /* renamed from: K */
    public static final int f58191K = C20551y.m22316f("esds");

    /* renamed from: K0 */
    public static final int f58192K0 = C20551y.m22316f("vp08");

    /* renamed from: L */
    public static final int f58193L = C20551y.m22316f("moof");

    /* renamed from: L0 */
    public static final int f58194L0 = C20551y.m22316f("vp09");

    /* renamed from: M */
    public static final int f58195M = C20551y.m22316f("traf");

    /* renamed from: M0 */
    public static final int f58196M0 = C20551y.m22316f("vpcC");

    /* renamed from: N */
    public static final int f58197N = C20551y.m22316f("mvex");

    /* renamed from: N0 */
    public static final int f58198N0 = C20551y.m22316f("camm");

    /* renamed from: O */
    public static final int f58199O = C20551y.m22316f("mehd");

    /* renamed from: O0 */
    public static final int f58200O0 = C20551y.m22316f("alac");

    /* renamed from: P */
    public static final int f58201P = C20551y.m22316f("tkhd");

    /* renamed from: Q */
    public static final int f58202Q = C20551y.m22316f("edts");

    /* renamed from: R */
    public static final int f58203R = C20551y.m22316f("elst");

    /* renamed from: S */
    public static final int f58204S = C20551y.m22316f("mdhd");

    /* renamed from: T */
    public static final int f58205T = C20551y.m22316f("hdlr");

    /* renamed from: U */
    public static final int f58206U = C20551y.m22316f("stsd");

    /* renamed from: V */
    public static final int f58207V = C20551y.m22316f("pssh");

    /* renamed from: W */
    public static final int f58208W = C20551y.m22316f("sinf");

    /* renamed from: X */
    public static final int f58209X = C20551y.m22316f("schm");

    /* renamed from: Y */
    public static final int f58210Y = C20551y.m22316f("schi");

    /* renamed from: Z */
    public static final int f58211Z = C20551y.m22316f("tenc");

    /* renamed from: a0 */
    public static final int f58212a0 = C20551y.m22316f("encv");

    /* renamed from: b */
    public static final int f58213b = C20551y.m22316f("ftyp");

    /* renamed from: b0 */
    public static final int f58214b0 = C20551y.m22316f("enca");

    /* renamed from: c */
    public static final int f58215c = C20551y.m22316f("avc1");

    /* renamed from: c0 */
    public static final int f58216c0 = C20551y.m22316f("frma");

    /* renamed from: d */
    public static final int f58217d = C20551y.m22316f("avc3");

    /* renamed from: d0 */
    public static final int f58218d0 = C20551y.m22316f("saiz");

    /* renamed from: e */
    public static final int f58219e = C20551y.m22316f("hvc1");

    /* renamed from: e0 */
    public static final int f58220e0 = C20551y.m22316f("saio");

    /* renamed from: f */
    public static final int f58221f = C20551y.m22316f("hev1");

    /* renamed from: f0 */
    public static final int f58222f0 = C20551y.m22316f("sbgp");

    /* renamed from: g */
    public static final int f58223g = C20551y.m22316f("s263");

    /* renamed from: g0 */
    public static final int f58224g0 = C20551y.m22316f("sgpd");

    /* renamed from: h */
    public static final int f58225h = C20551y.m22316f("d263");

    /* renamed from: h0 */
    public static final int f58226h0 = C20551y.m22316f("uuid");

    /* renamed from: i */
    public static final int f58227i = C20551y.m22316f("mdat");

    /* renamed from: i0 */
    public static final int f58228i0 = C20551y.m22316f("senc");

    /* renamed from: j */
    public static final int f58229j = C20551y.m22316f("mp4a");

    /* renamed from: j0 */
    public static final int f58230j0 = C20551y.m22316f("pasp");

    /* renamed from: k */
    public static final int f58231k = C20551y.m22316f(".mp3");

    /* renamed from: k0 */
    public static final int f58232k0 = C20551y.m22316f("TTML");

    /* renamed from: l */
    public static final int f58233l = C20551y.m22316f("wave");

    /* renamed from: l0 */
    public static final int f58234l0 = C20551y.m22316f("mp4v");

    /* renamed from: m */
    public static final int f58235m = C20551y.m22316f("lpcm");

    /* renamed from: m0 */
    public static final int f58236m0 = C20551y.m22316f("stts");

    /* renamed from: n */
    public static final int f58237n = C20551y.m22316f("sowt");

    /* renamed from: n0 */
    public static final int f58238n0 = C20551y.m22316f("stss");

    /* renamed from: o */
    public static final int f58239o = C20551y.m22316f("ac-3");

    /* renamed from: o0 */
    public static final int f58240o0 = C20551y.m22316f("ctts");

    /* renamed from: p */
    public static final int f58241p = C20551y.m22316f("dac3");

    /* renamed from: p0 */
    public static final int f58242p0 = C20551y.m22316f("stsc");

    /* renamed from: q */
    public static final int f58243q = C20551y.m22316f("ec-3");

    /* renamed from: q0 */
    public static final int f58244q0 = C20551y.m22316f("stsz");

    /* renamed from: r */
    public static final int f58245r = C20551y.m22316f("dec3");

    /* renamed from: r0 */
    public static final int f58246r0 = C20551y.m22316f("stz2");

    /* renamed from: s */
    public static final int f58247s = C20551y.m22316f("dtsc");

    /* renamed from: s0 */
    public static final int f58248s0 = C20551y.m22316f("stco");

    /* renamed from: t */
    public static final int f58249t = C20551y.m22316f("dtsh");

    /* renamed from: t0 */
    public static final int f58250t0 = C20551y.m22316f("co64");

    /* renamed from: u */
    public static final int f58251u = C20551y.m22316f("dtsl");

    /* renamed from: u0 */
    public static final int f58252u0 = C20551y.m22316f("tx3g");

    /* renamed from: v */
    public static final int f58253v = C20551y.m22316f("dtse");

    /* renamed from: v0 */
    public static final int f58254v0 = C20551y.m22316f("wvtt");

    /* renamed from: w */
    public static final int f58255w = C20551y.m22316f("ddts");

    /* renamed from: w0 */
    public static final int f58256w0 = C20551y.m22316f("stpp");

    /* renamed from: x */
    public static final int f58257x = C20551y.m22316f("tfdt");

    /* renamed from: x0 */
    public static final int f58258x0 = C20551y.m22316f("c608");

    /* renamed from: y */
    public static final int f58259y = C20551y.m22316f("tfhd");

    /* renamed from: y0 */
    public static final int f58260y0 = C20551y.m22316f("samr");

    /* renamed from: z */
    public static final int f58261z = C20551y.m22316f("trex");

    /* renamed from: z0 */
    public static final int f58262z0 = C20551y.m22316f("sawb");

    /* renamed from: a */
    public final int f58263a;

    /* renamed from: f7.a$a */
    public static final class C20660a extends C20659a {

        /* renamed from: P0 */
        public final long f58264P0;

        /* renamed from: Q0 */
        public final List<C20661b> f58265Q0 = new ArrayList();

        /* renamed from: R0 */
        public final List<C20660a> f58266R0 = new ArrayList();

        public C20660a(int i, long j) {
            super(i);
            this.f58264P0 = j;
        }

        /* renamed from: b */
        public C20660a mo32356b(int i) {
            int size = ((ArrayList) this.f58266R0).size();
            for (int i2 = 0; i2 < size; i2++) {
                C20660a aVar = (C20660a) ((ArrayList) this.f58266R0).get(i2);
                if (aVar.f58263a == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: c */
        public C20661b mo32357c(int i) {
            int size = ((ArrayList) this.f58265Q0).size();
            for (int i2 = 0; i2 < size; i2++) {
                C20661b bVar = (C20661b) ((ArrayList) this.f58265Q0).get(i2);
                if (bVar.f58263a == i) {
                    return bVar;
                }
            }
            return null;
        }

        public String toString() {
            return C20659a.m22573a(this.f58263a) + " leaves: " + Arrays.toString(((ArrayList) this.f58265Q0).toArray()) + " containers: " + Arrays.toString(((ArrayList) this.f58266R0).toArray());
        }
    }

    /* renamed from: f7.a$b */
    public static final class C20661b extends C20659a {

        /* renamed from: P0 */
        public final C20541m f58267P0;

        public C20661b(int i, C20541m mVar) {
            super(i);
            this.f58267P0 = mVar;
        }
    }

    static {
        C20551y.m22316f("vmhd");
    }

    public C20659a(int i) {
        this.f58263a = i;
    }

    /* renamed from: a */
    public static String m22573a(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public String toString() {
        return m22573a(this.f58263a);
    }
}
