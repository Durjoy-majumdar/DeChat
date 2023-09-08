package rb2;

import a14.C0000n0;
import a14.C53930o0;
import a14.C53973z1;
import android.graphics.Bitmap;
import c14.C54618d;
import c14.C54622f;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import p1042u.C111058g;
import sp3.C36777d;
import u23.C65003a;
import u23.C65005i;

/* renamed from: rb2.a */
public final class C63380a {

    /* renamed from: a */
    public final C65005i f179780a;

    /* renamed from: b */
    public final HashMap<C65003a, C63381a> f179781b = new HashMap<>();

    /* renamed from: c */
    public final C0000n0 f179782c = C53930o0.m60555b();

    /* renamed from: d */
    public final C63383c f179783d = new C63383c(this);

    /* renamed from: rb2.a$a */
    public static final class C63381a {

        /* renamed from: a */
        public volatile C36777d f179784a;

        /* renamed from: b */
        public final Set<Long> f179785b;

        /* renamed from: c */
        public final Set<Long> f179786c;

        /* renamed from: d */
        public final Set<Long> f179787d;

        /* renamed from: e */
        public final C54622f<Long> f179788e;

        /* renamed from: f */
        public C53973z1 f179789f;

        public C63381a() {
            this((C36777d) null, (Set) null, (Set) null, (Set) null, (C54622f) null, (C53973z1) null, 63, (C8480h) null);
        }

        public C63381a(C36777d dVar, Set<Long> set, Set<Long> set2, Set<Long> set3, C54622f<Long> fVar, C53973z1 z1Var, int i, C8480h hVar) {
            dVar = (i & 1) != 0 ? null : dVar;
            set = (i & 2) != 0 ? new HashSet<>() : set;
            set2 = (i & 4) != 0 ? new HashSet<>() : set2;
            set3 = (i & 8) != 0 ? new HashSet<>() : set3;
            fVar = (i & 16) != 0 ? new C54618d<>(10) : fVar;
            z1Var = (i & 32) != 0 ? null : z1Var;
            C87412m.m108594g(set, "pending");
            C87412m.m108594g(set2, "requesting");
            C87412m.m108594g(set3, "readyTimes");
            C87412m.m108594g(fVar, "channel");
            this.f179784a = dVar;
            this.f179785b = set;
            this.f179786c = set2;
            this.f179787d = set3;
            this.f179788e = fVar;
            this.f179789f = z1Var;
        }
    }

    /* renamed from: rb2.a$b */
    public static final class C63382b {

        /* renamed from: a */
        public final C65003a f179790a;

        /* renamed from: b */
        public final long f179791b;

        public C63382b(C65003a aVar, long j) {
            C87412m.m108594g(aVar, FFmpegMetadataRetriever.METADATA_KEY_TRACK);
            this.f179790a = aVar;
            this.f179791b = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C63382b)) {
                return false;
            }
            C63382b bVar = (C63382b) obj;
            return C87412m.m108589b(this.f179790a, bVar.f179790a) && this.f179791b == bVar.f179791b;
        }

        public int hashCode() {
            long j = this.f179791b;
            return (this.f179790a.hashCode() * 31) + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            return "Key(track=" + this.f179790a + ", time=" + this.f179791b + ')';
        }
    }

    /* renamed from: rb2.a$c */
    public static final class C63383c extends C111058g<C63382b, Bitmap> {

        /* renamed from: a */
        public final /* synthetic */ C63380a f179792a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63383c(C63380a aVar) {
            super(100);
            this.f179792a = aVar;
        }

        public void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
            C63382b bVar = (C63382b) obj;
            Bitmap bitmap = (Bitmap) obj2;
            C87412m.m108594g(bVar, "key");
            C87412m.m108594g(bitmap, "oldValue");
            super.entryRemoved(z, bVar, bitmap, (Bitmap) obj3);
            if (z) {
                this.f179792a.mo88287a(bVar.f179790a).f179787d.remove(Long.valueOf(bVar.f179791b));
            }
        }
    }

    public C63380a(C65005i iVar) {
        C87412m.m108594g(iVar, "thumbFetcherFactory");
        this.f179780a = iVar;
    }

    /* renamed from: a */
    public final C63381a mo88287a(C65003a aVar) {
        HashMap<C65003a, C63381a> hashMap = this.f179781b;
        C63381a aVar2 = hashMap.get(aVar);
        if (aVar2 == null) {
            aVar2 = new C63381a((C36777d) null, (Set) null, (Set) null, (Set) null, (C54622f) null, (C53973z1) null, 63, (C8480h) null);
            hashMap.put(aVar, aVar2);
        }
        return aVar2;
    }
}
