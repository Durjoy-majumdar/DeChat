package p290a8;

import java.util.ArrayList;
import java.util.Collections;
import p290a8.C16442e;
import p333e8.C20541m;
import p333e8.C20551y;
import p383t7.C22440b;
import p383t7.C22442d;
import p383t7.C22444f;

/* renamed from: a8.b */
public final class C16439b extends C22440b {

    /* renamed from: o */
    public static final int f43861o = C20551y.m22316f("payl");

    /* renamed from: p */
    public static final int f43862p = C20551y.m22316f("sttg");

    /* renamed from: q */
    public static final int f43863q = C20551y.m22316f("vttc");

    /* renamed from: m */
    public final C20541m f43864m = new C20541m();

    /* renamed from: n */
    public final C16442e.C16443b f43865n = new C16442e.C16443b();

    public C16439b() {
        super("Mp4WebvttDecoder");
    }

    /* renamed from: f */
    public C22442d mo14895f(byte[] bArr, int i, boolean z) {
        this.f43864m.mo32111v(bArr, i);
        ArrayList arrayList = new ArrayList();
        while (true) {
            C20541m mVar = this.f43864m;
            int i2 = mVar.f57811c - mVar.f57810b;
            if (i2 <= 0) {
                return new C16440c(arrayList);
            }
            if (i2 >= 8) {
                int c = mVar.mo32092c();
                if (this.f43864m.mo32092c() == f43863q) {
                    C20541m mVar2 = this.f43864m;
                    C16442e.C16443b bVar = this.f43865n;
                    int i3 = c - 8;
                    bVar.mo14901b();
                    while (i3 > 0) {
                        if (i3 >= 8) {
                            int c2 = mVar2.mo32092c();
                            int c3 = mVar2.mo32092c();
                            int i4 = c2 - 8;
                            String str = new String(mVar2.f57809a, mVar2.f57810b, i4);
                            mVar2.mo32114y(i4);
                            i3 = (i3 - 8) - i4;
                            if (c3 == f43862p) {
                                C16445f.m15274c(str, bVar);
                            } else if (c3 == f43861o) {
                                C16445f.m15275d((String) null, str.trim(), bVar, Collections.emptyList());
                            }
                        } else {
                            throw new C22444f("Incomplete vtt cue box header found.");
                        }
                    }
                    arrayList.add(bVar.mo14900a());
                } else {
                    this.f43864m.mo32114y(c - 8);
                }
            } else {
                throw new C22444f("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
    }
}
