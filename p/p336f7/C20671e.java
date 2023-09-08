package p336f7;

import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import p333e8.C20541m;
import p333e8.C20551y;

/* renamed from: f7.e */
public final class C20671e {

    /* renamed from: A */
    public static final int f58337A = C20551y.m22316f("sosn");

    /* renamed from: B */
    public static final int f58338B = C20551y.m22316f("tvsh");

    /* renamed from: C */
    public static final int f58339C = C20551y.m22316f("----");

    /* renamed from: D */
    public static final String[] f58340D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    /* renamed from: a */
    public static final int f58341a = C20551y.m22316f("nam");

    /* renamed from: b */
    public static final int f58342b = C20551y.m22316f("trk");

    /* renamed from: c */
    public static final int f58343c = C20551y.m22316f("cmt");

    /* renamed from: d */
    public static final int f58344d = C20551y.m22316f("day");

    /* renamed from: e */
    public static final int f58345e = C20551y.m22316f("ART");

    /* renamed from: f */
    public static final int f58346f = C20551y.m22316f("too");

    /* renamed from: g */
    public static final int f58347g = C20551y.m22316f("alb");

    /* renamed from: h */
    public static final int f58348h = C20551y.m22316f("com");

    /* renamed from: i */
    public static final int f58349i = C20551y.m22316f("wrt");

    /* renamed from: j */
    public static final int f58350j = C20551y.m22316f("lyr");

    /* renamed from: k */
    public static final int f58351k = C20551y.m22316f("gen");

    /* renamed from: l */
    public static final int f58352l = C20551y.m22316f("covr");

    /* renamed from: m */
    public static final int f58353m = C20551y.m22316f("gnre");

    /* renamed from: n */
    public static final int f58354n = C20551y.m22316f("grp");

    /* renamed from: o */
    public static final int f58355o = C20551y.m22316f("disk");

    /* renamed from: p */
    public static final int f58356p = C20551y.m22316f("trkn");

    /* renamed from: q */
    public static final int f58357q = C20551y.m22316f("tmpo");

    /* renamed from: r */
    public static final int f58358r = C20551y.m22316f("cpil");

    /* renamed from: s */
    public static final int f58359s = C20551y.m22316f("aART");

    /* renamed from: t */
    public static final int f58360t = C20551y.m22316f("sonm");

    /* renamed from: u */
    public static final int f58361u = C20551y.m22316f("soal");

    /* renamed from: v */
    public static final int f58362v = C20551y.m22316f("soar");

    /* renamed from: w */
    public static final int f58363w = C20551y.m22316f("soaa");

    /* renamed from: x */
    public static final int f58364x = C20551y.m22316f("soco");

    /* renamed from: y */
    public static final int f58365y = C20551y.m22316f("rtng");

    /* renamed from: z */
    public static final int f58366z = C20551y.m22316f("pgap");

    /* renamed from: a */
    public static TextInformationFrame m22600a(int i, String str, C20541m mVar) {
        int c = mVar.mo32092c();
        if (mVar.mo32092c() == C20659a.f58182F0 && c >= 22) {
            mVar.mo32114y(10);
            int s = mVar.mo32108s();
            if (s > 0) {
                String str2 = "" + s;
                int s2 = mVar.mo32108s();
                if (s2 > 0) {
                    str2 = str2 + "/" + s2;
                }
                return new TextInformationFrame(str, (String) null, str2);
            }
        }
        C20659a.m22573a(i);
        return null;
    }

    /* renamed from: b */
    public static Id3Frame m22601b(C20541m mVar, int i) {
        String str = null;
        String str2 = null;
        int i2 = -1;
        int i3 = -1;
        while (true) {
            int i4 = mVar.f57810b;
            if (i4 >= i) {
                break;
            }
            int c = mVar.mo32092c();
            int c2 = mVar.mo32092c();
            mVar.mo32114y(4);
            if (c2 == C20659a.f58178D0) {
                str = mVar.mo32100k(c - 12);
            } else if (c2 == C20659a.f58180E0) {
                str2 = mVar.mo32100k(c - 12);
            } else {
                if (c2 == C20659a.f58182F0) {
                    i2 = i4;
                    i3 = c;
                }
                mVar.mo32114y(c - 12);
            }
        }
        if (!"com.apple.iTunes".equals(str) || !"iTunSMPB".equals(str2) || i2 == -1) {
            return null;
        }
        mVar.mo32113x(i2);
        mVar.mo32114y(16);
        return new CommentFrame("und", str2, mVar.mo32100k(i3 - 16));
    }

    /* renamed from: c */
    public static TextInformationFrame m22602c(int i, String str, C20541m mVar) {
        int c = mVar.mo32092c();
        if (mVar.mo32092c() == C20659a.f58182F0) {
            mVar.mo32114y(8);
            return new TextInformationFrame(str, (String) null, mVar.mo32100k(c - 16));
        }
        C20659a.m22573a(i);
        return null;
    }

    /* renamed from: d */
    public static Id3Frame m22603d(int i, String str, C20541m mVar, boolean z, boolean z2) {
        int i2;
        mVar.mo32114y(4);
        if (mVar.mo32092c() == C20659a.f58182F0) {
            mVar.mo32114y(8);
            i2 = mVar.mo32103n();
        } else {
            i2 = -1;
        }
        if (z2) {
            i2 = Math.min(1, i2);
        }
        if (i2 >= 0) {
            return z ? new TextInformationFrame(str, (String) null, Integer.toString(i2)) : new CommentFrame("und", str, Integer.toString(i2));
        }
        C20659a.m22573a(i);
        return null;
    }
}
