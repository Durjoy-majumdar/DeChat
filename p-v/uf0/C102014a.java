package uf0;

/* renamed from: uf0.a */
public class C102014a {

    /* renamed from: e */
    public static final int f300375e = C102016c.m134342d("ftyp");

    /* renamed from: f */
    public static final int f300376f = C102016c.m134342d("moov");

    /* renamed from: g */
    public static final int f300377g = C102016c.m134342d("mvhd");

    /* renamed from: h */
    public static final int f300378h = C102016c.m134342d("trak");

    /* renamed from: i */
    public static final int f300379i = C102016c.m134342d("mdia");

    /* renamed from: j */
    public static final int f300380j = C102016c.m134342d("minf");

    /* renamed from: k */
    public static final int f300381k = C102016c.m134342d("stbl");

    /* renamed from: l */
    public static final int f300382l = C102016c.m134342d("edts");

    /* renamed from: m */
    public static final int f300383m = C102016c.m134342d("elst");

    /* renamed from: n */
    public static final int f300384n = C102016c.m134342d("mdhd");

    /* renamed from: o */
    public static final int f300385o = C102016c.m134342d("hdlr");

    /* renamed from: p */
    public static final int f300386p = C102016c.m134342d("stts");

    /* renamed from: q */
    public static final int f300387q = C102016c.m134342d("stss");

    /* renamed from: r */
    public static final int f300388r = C102016c.m134342d("stsc");

    /* renamed from: s */
    public static final int f300389s = C102016c.m134342d("stsz");

    /* renamed from: t */
    public static final int f300390t = C102016c.m134342d("stco");

    /* renamed from: u */
    public static final int f300391u = C102016c.m134342d("co64");

    /* renamed from: v */
    public static final int f300392v = C102016c.m134342d("udta");

    /* renamed from: a */
    public int f300393a;

    /* renamed from: b */
    public long f300394b;

    /* renamed from: c */
    public int f300395c;

    /* renamed from: d */
    public long f300396d;

    static {
        C102016c.m134342d("avc1");
        C102016c.m134342d("avc3");
        C102016c.m134342d("hvc1");
        C102016c.m134342d("hev1");
        C102016c.m134342d("s263");
        C102016c.m134342d("d263");
        C102016c.m134342d("mdat");
        C102016c.m134342d("mp4a");
        C102016c.m134342d("wave");
        C102016c.m134342d("ac-3");
        C102016c.m134342d("dac3");
        C102016c.m134342d("ec-3");
        C102016c.m134342d("dec3");
        C102016c.m134342d("dtsc");
        C102016c.m134342d("dtsh");
        C102016c.m134342d("dtsl");
        C102016c.m134342d("dtse");
        C102016c.m134342d("ddts");
        C102016c.m134342d("tfdt");
        C102016c.m134342d("tfhd");
        C102016c.m134342d("trex");
        C102016c.m134342d("trun");
        C102016c.m134342d("sidx");
        C102016c.m134342d("avcC");
        C102016c.m134342d("hvcC");
        C102016c.m134342d("esds");
        C102016c.m134342d("moof");
        C102016c.m134342d("traf");
        C102016c.m134342d("mvex");
        C102016c.m134342d("tkhd");
        C102016c.m134342d("stsd");
        C102016c.m134342d("pssh");
        C102016c.m134342d("sinf");
        C102016c.m134342d("schm");
        C102016c.m134342d("schi");
        C102016c.m134342d("tenc");
        C102016c.m134342d("encv");
        C102016c.m134342d("enca");
        C102016c.m134342d("frma");
        C102016c.m134342d("saiz");
        C102016c.m134342d("saio");
        C102016c.m134342d("uuid");
        C102016c.m134342d("senc");
        C102016c.m134342d("pasp");
        C102016c.m134342d("TTML");
        C102016c.m134342d("vmhd");
        C102016c.m134342d("mp4v");
        C102016c.m134342d("ctts");
        C102016c.m134342d("tx3g");
        C102016c.m134342d("wvtt");
        C102016c.m134342d("stpp");
        C102016c.m134342d("samr");
        C102016c.m134342d("sawb");
        C102016c.m134342d("meta");
        C102016c.m134342d("ilst");
        C102016c.m134342d("mean");
        C102016c.m134342d("name");
        C102016c.m134342d("data");
        C102016c.m134342d("----");
    }

    public C102014a(int i, long j, int i2, long j2) {
        this.f300393a = i;
        this.f300396d = j;
        this.f300395c = i2;
        this.f300394b = j2;
    }

    /* renamed from: a */
    public long mo141508a() {
        long j = this.f300394b;
        return j > 0 ? j : (long) this.f300393a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Atom{atomSize=");
        sb.append(this.f300393a);
        sb.append(", atomLargeSize=");
        sb.append(this.f300394b);
        sb.append(", type=");
        int i = this.f300395c;
        sb.append(new String(new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)}));
        sb.append(", beginPos=");
        sb.append(this.f300396d);
        sb.append('}');
        return sb.toString();
    }
}
