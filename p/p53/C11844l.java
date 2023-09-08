package p53;

import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54219z;
import com.tencent.p014mm.network.C114766b;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet.wecoin.model.WecoinEncashKVData;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import gy3.C8480h;
import gy3.C87412m;
import hp3.C87581a;
import jp3.C9487b;
import n53.C11120c;
import ob0.C89132b;
import pe3.C89349b;
import r53.C12951a;
import r53.C12953c;
import rx3.C13598b0;
import te3.C48858bh3;
import te3.C49335eu3;
import te3.C50182ku3;
import te3.C51209s80;
import te3.C51506u80;
import te3.g45;
import te3.h35;
import zt3.C119157j;

/* renamed from: p53.l */
public final class C11844l extends C39622i0 {

    /* renamed from: d */
    public final int f34632d;

    /* renamed from: e */
    public final C54219z<g45> f34633e = new C54219z<>();

    /* renamed from: f */
    public final C54219z<C11828a> f34634f = new C54219z<>();

    /* renamed from: g */
    public final C54219z<C51506u80> f34635g = new C54219z<>();

    /* renamed from: h */
    public final C54219z<C48858bh3> f34636h = new C54219z<>();

    /* renamed from: i */
    public final C54219z<Boolean> f34637i = new C54219z<>();

    /* renamed from: j */
    public long f34638j;

    /* renamed from: n */
    public C89349b f34639n;

    /* renamed from: o */
    public String f34640o;

    /* renamed from: p */
    public WecoinEncashKVData f34641p;

    /* renamed from: q */
    public final C54219z<h35> f34642q = new C54219z<>();

    /* renamed from: p53.l$a */
    public static final class C11845a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C11844l f34643a;

        /* renamed from: b */
        public final /* synthetic */ String f34644b;

        /* renamed from: c */
        public final /* synthetic */ String f34645c;

        /* renamed from: d */
        public final /* synthetic */ int f34646d;

        /* renamed from: e */
        public final /* synthetic */ C9487b<?> f34647e;

        public C11845a(C11844l lVar, String str, String str2, int i, C9487b<?> bVar) {
            this.f34643a = lVar;
            this.f34644b = str;
            this.f34645c = str2;
            this.f34646d = i;
            this.f34647e = bVar;
        }

        public Object call(Object obj) {
            C50182ku3 ku32;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            C12951a.m12391a(this.f34643a.f34637i, Boolean.FALSE);
            Log.m105924i("MicroMsg.WeCoinEncashViewModel", "encashIncome errorType: " + cVar.f256793a + ", errorCode: " + cVar.f256794b + ", errorMsg: " + cVar.f256795c);
            if (C12953c.m12397f(cVar)) {
                this.f34643a.mo11728d3(7, 3, cVar.f256794b, cVar.f256795c);
                C115669n.INSTANCE.mo175911u(1581, 98);
                int i = cVar.f256794b;
                if (i == 10001) {
                    T t = cVar.f256796d;
                    C51209s80 s802 = (C51209s80) t;
                    if (!(s802 == null || (ku32 = s802.f141372f) == null)) {
                        C11844l lVar = this.f34643a;
                        String str = this.f34644b;
                        String str2 = this.f34645c;
                        int i2 = this.f34646d;
                        C9487b<?> bVar = this.f34647e;
                        C87412m.m108593f(t, "cgiBack.resp");
                        C12953c.m12402k("MicroMsg.WeCoinEncashViewModel", t);
                        ((C119157j) C119157j.f356862d).mo183878i(new C11843k(lVar, str, str2, i2, bVar), (long) ku32.f137050d);
                    }
                }
                this.f34643a.f34634f.postValue(new C11828a(cVar.f256793a, i, cVar.f256795c, cVar.f256796d));
            } else {
                T t2 = cVar.f256796d;
                if (t2 == null) {
                    C115669n.INSTANCE.mo175911u(1581, 98);
                    this.f34643a.f34634f.postValue(new C11828a(3, -1, "", (C49335eu3) null, 8, (C8480h) null));
                    this.f34643a.mo11728d3(7, 3, -1, "callback resp is null");
                } else {
                    C51209s80 s803 = (C51209s80) t2;
                    C11844l lVar2 = this.f34643a;
                    lVar2.mo11728d3(7, 3, 0, "");
                    C115669n.INSTANCE.mo175911u(1581, 97);
                    C12953c.m12402k("MicroMsg.WeCoinEncashViewModel", s803);
                    lVar2.f34635g.postValue(s803.f141370d);
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C11844l(byte[] bArr, int i) {
        this.f34632d = i;
        h35 h35 = new h35();
        if (bArr != null) {
            try {
                h35.parseFrom(bArr);
            } catch (Exception e) {
                Log.printDebugStack("safeParser", "", e);
            }
            this.f34642q.postValue(h35);
        }
        h35 = null;
        this.f34642q.postValue(h35);
    }

    /* renamed from: c3 */
    public final void mo11727c3(String str, String str2, int i, C9487b<?> bVar) {
        C9487b<?> bVar2 = bVar;
        C87412m.m108594g(str, XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
        C87412m.m108594g(bVar2, "keeper");
        C12951a.m12391a(this.f34637i, Boolean.TRUE);
        mo11728d3(7, 1, 0, "");
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175911u(1581, 96);
        C89349b bVar3 = this.f34639n;
        if (bVar3 == null) {
            Log.m105924i("MicroMsg.WeCoinEncashViewModel", "mCtxBuff is null!");
            C12951a.m12391a(this.f34637i, Boolean.FALSE);
            this.f34634f.postValue(new C11828a(3, -1, "", (C49335eu3) null, 8, (C8480h) null));
            nVar.mo175911u(1581, 98);
            mo11728d3(7, 3, -1, "mCtxBuff is null");
            return;
        }
        byte[] d = C114766b.f344135e.mo174419d(bVar3 != null ? bVar3.f257327a : null);
        if (d == null) {
            Log.m105924i("MicroMsg.WeCoinEncashViewModel", "signedByte is null!");
            C12951a.m12391a(this.f34637i, Boolean.FALSE);
            this.f34634f.postValue(new C11828a(3, 4, "", (C49335eu3) null, 8, (C8480h) null));
            mo11728d3(7, 3, 4, "sign data failed");
            nVar.mo175911u(1581, 98);
            nVar.mo175911u(1581, 100);
            return;
        }
        C89349b bVar4 = this.f34639n;
        C87412m.m108591d(bVar4);
        new C11120c(str, bVar4, new C89349b(d, 0, d.length), str2, i).mo9225i().mo123062e(new C11845a(this, str, str2, i, bVar)).mo11397F(bVar2);
    }

    /* renamed from: d3 */
    public final void mo11728d3(int i, int i2, int i3, String str) {
        String str2;
        WecoinEncashKVData wecoinEncashKVData = this.f34641p;
        if (wecoinEncashKVData == null || (str2 = wecoinEncashKVData.f21838e) == null) {
            str2 = "";
        }
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr = new Object[7];
        objArr[0] = Integer.valueOf(wecoinEncashKVData != null ? wecoinEncashKVData.f21837d : 1);
        objArr[1] = str2;
        objArr[2] = this.f34640o;
        objArr[3] = Integer.valueOf(i);
        objArr[4] = Integer.valueOf(i2);
        objArr[5] = Integer.valueOf(i3);
        objArr[6] = str;
        nVar.mo160131h(22129, objArr);
    }

    /* renamed from: e3 */
    public final void mo11729e3(int i) {
        WecoinEncashKVData wecoinEncashKVData = this.f34641p;
        if (wecoinEncashKVData != null) {
            int i2 = wecoinEncashKVData.f21837d;
            String str = wecoinEncashKVData.f21838e;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            String str3 = wecoinEncashKVData.f21839f;
            if (str3 != null) {
                str2 = str3;
            }
            C115669n.INSTANCE.mo160131h(21655, Integer.valueOf(i2), str, Integer.valueOf(i), str2);
        }
    }
}
