package com.tencent.p014mm.xeffect.effect;

import gy3.C8480h;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\nJ\t\u0010\u0003\u001a\u00020\u0002H J\u0011\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H J\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H J\u0011\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H ¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/xeffect/effect/EffectProfileData;", "", "", "nGetCreatePAGFile", "", "ptr", "nGetCreatePAGSurface", "nGetRenderPAG", "Lrx3/b0;", "nReset", "a", "renderlib_release"}, mo182095k = 1, mo182096mv = {1, 4, 0})
/* renamed from: com.tencent.mm.xeffect.effect.EffectProfileData */
public final class EffectProfileData {

    /* renamed from: a */
    public final long f285781a;

    /* renamed from: com.tencent.mm.xeffect.effect.EffectProfileData$a */
    public static final class C97342a {

        /* renamed from: a */
        public int f285782a;

        /* renamed from: b */
        public int f285783b;

        /* renamed from: c */
        public long f285784c;

        public C97342a() {
            this(0, 0, 0, 7, (C8480h) null);
        }

        public C97342a(int i, int i2, long j, int i3, C8480h hVar) {
            i = (i3 & 1) != 0 ? 0 : i;
            i2 = (i3 & 2) != 0 ? 0 : i2;
            j = (i3 & 4) != 0 ? 0 : j;
            this.f285782a = i;
            this.f285783b = i2;
            this.f285784c = j;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C97342a) {
                    C97342a aVar = (C97342a) obj;
                    if (this.f285782a == aVar.f285782a) {
                        if (this.f285783b == aVar.f285783b) {
                            if (this.f285784c == aVar.f285784c) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            long j = this.f285784c;
            return (((this.f285782a * 31) + this.f285783b) * 31) + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            return "ProfileRecorder(startCount=" + this.f285782a + ", successCount=" + this.f285783b + ", costAvg=" + this.f285784c + ")";
        }
    }

    public EffectProfileData(long j) {
        this.f285781a = j;
    }

    private final native long[] nGetCreatePAGFile();

    private final native long[] nGetCreatePAGSurface(long j);

    private final native long[] nGetRenderPAG(long j);

    private final native void nReset(long j);

    /* renamed from: a */
    public final C97342a mo136475a(long[] jArr) {
        C97342a aVar = new C97342a(0, 0, 0, 7, (C8480h) null);
        if (jArr.length >= 3) {
            aVar.f285782a = (int) jArr[0];
            aVar.f285783b = (int) jArr[1];
            aVar.f285784c = jArr[2];
        }
        return aVar;
    }

    /* renamed from: b */
    public final C97342a mo136476b() {
        return this.f285781a == 0 ? new C97342a(0, 0, 0, 7, (C8480h) null) : mo136475a(nGetCreatePAGFile());
    }

    /* renamed from: c */
    public final C97342a mo136477c() {
        long j = this.f285781a;
        return j == 0 ? new C97342a(0, 0, 0, 7, (C8480h) null) : mo136475a(nGetRenderPAG(j));
    }
}
