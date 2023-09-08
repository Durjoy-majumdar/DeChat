package lv1;

import com.tencent.p014mm.sdk.platformtools.MMHandler;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kv1.C61173o;

/* renamed from: lv1.k */
public class C76728k {

    /* renamed from: r */
    public static final AtomicInteger f224465r = new AtomicInteger(0);

    /* renamed from: a */
    public final int f224466a = f224465r.incrementAndGet();

    /* renamed from: b */
    public int f224467b = 0;

    /* renamed from: c */
    public String f224468c = null;

    /* renamed from: d */
    public String f224469d = null;

    /* renamed from: e */
    public String f224470e = null;

    /* renamed from: f */
    public String f224471f = null;

    /* renamed from: g */
    public int[] f224472g = null;

    /* renamed from: h */
    public int[] f224473h = null;

    /* renamed from: i */
    public int f224474i = Integer.MAX_VALUE;

    /* renamed from: j */
    public HashSet<String> f224475j = new HashSet<>();

    /* renamed from: k */
    public HashSet<String> f224476k = new HashSet<>();

    /* renamed from: l */
    public Comparator<C99681n> f224477l = null;

    /* renamed from: m */
    public C61173o f224478m = null;

    /* renamed from: n */
    public MMHandler f224479n = null;

    /* renamed from: o */
    public int f224480o = -1;

    /* renamed from: p */
    public boolean f224481p = false;

    /* renamed from: q */
    public List<String> f224482q = new ArrayList();

    /* renamed from: a */
    public static C76728k m92447a(String str, int[] iArr, int[] iArr2, int i, HashSet<String> hashSet, Comparator<C99681n> comparator, C61173o oVar, MMHandler mMHandler) {
        C76728k kVar = new C76728k();
        kVar.f224468c = str;
        kVar.f224469d = null;
        kVar.f224472g = iArr;
        kVar.f224473h = iArr2;
        kVar.f224474i = i;
        kVar.f224475j = hashSet;
        kVar.f224477l = comparator;
        kVar.f224478m = oVar;
        kVar.f224479n = mMHandler;
        return kVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f224466a == ((C76728k) obj).f224466a;
    }

    public String toString() {
        return String.format("{id: %d, query: %s}", new Object[]{Integer.valueOf(this.f224466a), this.f224468c});
    }
}
