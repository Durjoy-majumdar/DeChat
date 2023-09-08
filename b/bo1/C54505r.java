package bo1;

import bl3.C0327w;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import er1.C58739j4;
import fe1.C58961d;
import gy3.C8480h;
import gy3.C87412m;
import hp3.C87581a;
import java.util.HashMap;
import je1.C46547x1;
import je1.C60798d2;
import ob0.C89132b;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C49946j51;
import te3.C50008jm0;
import up1.C37521f;
import up1.C65426w0;
import vp1.C65834e;

/* renamed from: bo1.r */
public final class C54505r extends C0327w<FinderCommonFeatureService> {

    /* renamed from: e */
    public final HashMap<String, Long> f152786e = new HashMap<>();

    /* renamed from: bo1.r$a */
    public interface C54506a {
        /* renamed from: a */
        void mo10406a(FinderItem finderItem, int i);
    }

    /* renamed from: bo1.r$b */
    public static final class C54507b<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C54505r f152787a;

        /* renamed from: b */
        public final /* synthetic */ long f152788b;

        /* renamed from: c */
        public final /* synthetic */ int f152789c;

        /* renamed from: d */
        public final /* synthetic */ long f152790d;

        /* renamed from: e */
        public final /* synthetic */ boolean f152791e;

        /* renamed from: f */
        public final /* synthetic */ int f152792f;

        /* renamed from: g */
        public final /* synthetic */ C54506a f152793g;

        public C54507b(C54505r rVar, long j, int i, long j2, boolean z, int i2, C54506a aVar) {
            this.f152787a = rVar;
            this.f152788b = j;
            this.f152789c = i;
            this.f152790d = j2;
            this.f152791e = z;
            this.f152792f = i2;
            this.f152793g = aVar;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            int i = cVar.f256793a;
            if (!(i == 0 && cVar.f256794b == 0) && !C58739j4.f168176a.mo83681J(i, cVar.f256794b)) {
                this.f152787a.mo75348j3(this.f152788b, this.f152789c, this.f152790d, this.f152791e, this.f152792f);
                C54505r rVar = this.f152787a;
                long j = this.f152788b;
                rVar.getClass();
                C65834e.f189316a.mo89875i(j);
                C54506a aVar = this.f152793g;
                if (aVar == null) {
                    return null;
                }
                aVar.mo10406a((FinderItem) null, cVar.f256794b);
                return C13598b0.f38549a;
            }
            FinderObject finderObject = ((C50008jm0) cVar.f256796d).f136184e;
            if (finderObject != null) {
                FinderContact finderContact = new FinderContact();
                FinderContact finderContact2 = finderObject.contact;
                finderContact.username = finderContact2 != null ? finderContact2.username : null;
                finderContact.nickname = finderContact2 != null ? finderContact2.nickname : null;
                finderContact.headUrl = finderContact2 != null ? finderContact2.headUrl : null;
                finderContact.authInfo = finderContact2 != null ? finderContact2.authInfo : null;
                finderContact.extInfo = finderContact2 != null ? finderContact2.extInfo : null;
                C58961d.C58963b.m68837m(C58961d.f168673a, finderContact, false, 2, (Object) null);
                FinderItem a = FinderItem.Companion.mo79056a(finderObject, 1);
                this.f152787a.mo75348j3(this.f152788b, this.f152789c, this.f152790d, this.f152791e, this.f152792f);
                C54506a aVar2 = this.f152793g;
                if (aVar2 == null) {
                    return null;
                }
                aVar2.mo10406a(a, cVar.f256794b);
                return C13598b0.f38549a;
            }
            this.f152787a.mo75348j3(this.f152788b, this.f152789c, this.f152790d, this.f152791e, this.f152792f);
            C54505r rVar2 = this.f152787a;
            long j2 = this.f152788b;
            rVar2.getClass();
            C65834e.f189316a.mo89875i(j2);
            C54506a aVar3 = this.f152793g;
            if (aVar3 == null) {
                return null;
            }
            aVar3.mo10406a((FinderItem) null, cVar.f256794b);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: c3 */
    public final boolean mo75342c3(long j, int i, int i2) {
        Long l;
        String d3 = mo75343d3(j, i, i2);
        boolean containsKey = this.f152786e.containsKey(d3);
        if (containsKey && (l = this.f152786e.get(d3)) != null) {
            long currentTimeMillis = System.currentTimeMillis() - l.longValue();
            if (l.longValue() <= 0 || currentTimeMillis >= 300000) {
                this.f152786e.remove(d3);
                return false;
            }
        }
        return containsKey;
    }

    /* renamed from: d3 */
    public final String mo75343d3(long j, int i, int i2) {
        String str = String.valueOf(j) + String.valueOf(i) + String.valueOf(i2);
        C87412m.m108593f(str, "StringBuilder().append(o…ne.toString()).toString()");
        return str;
    }

    /* renamed from: e3 */
    public final boolean mo75344e3() {
        C37521f.f99374d.getClass();
        return C37521f.f99348Z6.mo60266n().intValue() == 1;
    }

    /* renamed from: f3 */
    public final void mo75345f3(long j, String str, int i, C49712hj1 hj12, boolean z, String str2, C54506a aVar, int i2) {
        C87412m.m108594g(str, "nonceId");
        if (z) {
            String str3 = str;
            int i3 = i;
            new C60798d2(j, str2 == null ? "" : str2, str3, i3, hj12).mo9225i().mo123062e(new C54508s(this, j, str3, i3, z, hj12, aVar, i2));
            return;
        }
        mo75346g3(j, str, 0, "", i, z, hj12, aVar, i2);
    }

    /* renamed from: g3 */
    public final void mo75346g3(long j, String str, long j2, String str2, int i, boolean z, C49712hj1 hj12, C54506a aVar, int i2) {
        new C46547x1(j, str, i, 2, "", true, (C89349b) null, (C65426w0) null, 0, (String) null, false, false, "", hj12, i2, (C49946j51) null, false, 102336, (C8480h) null).mo9225i().mo123062e(new C54507b(this, j, i, j2, z, i2, aVar));
    }

    /* renamed from: i3 */
    public final void mo75347i3(long j, int i, int i2) {
        this.f152786e.put(mo75343d3(j, i, i2), Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: j3 */
    public final void mo75348j3(long j, int i, long j2, boolean z, int i2) {
        String d3 = z ? mo75343d3(j2, i, i2) : mo75343d3(j, i, i2);
        if (this.f152786e.containsKey(d3)) {
            this.f152786e.remove(d3);
        }
    }
}
