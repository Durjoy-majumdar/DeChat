package ob0;

import com.tencent.p014mm.sdk.platformtools.Util;
import pe3.C47465a;
import qe3.C101125b1;
import qe3.C89631w;
import te3.C101820nt3;
import te3.C49335eu3;
import te3.r54;

/* renamed from: ob0.c */
public class C47350c extends C117746w {

    /* renamed from: a */
    public C47353c f127055a = null;

    /* renamed from: b */
    public C47354d f127056b = null;

    /* renamed from: c */
    public String f127057c;

    /* renamed from: d */
    public int f127058d;

    /* renamed from: e */
    public int f127059e = 0;

    /* renamed from: f */
    public int f127060f;

    /* renamed from: g */
    public boolean f127061g;

    /* renamed from: h */
    public boolean f127062h;

    /* renamed from: i */
    public int f127063i;

    /* renamed from: j */
    public int f127064j;

    /* renamed from: k */
    public byte[] f127065k;

    /* renamed from: ob0.c$b */
    public static class C47352b {

        /* renamed from: a */
        public C47465a f127066a;

        /* renamed from: b */
        public C47465a f127067b;

        /* renamed from: c */
        public String f127068c;

        /* renamed from: d */
        public int f127069d;

        /* renamed from: e */
        public int f127070e = 0;

        /* renamed from: f */
        public int f127071f = 0;

        /* renamed from: g */
        public boolean f127072g = true;

        /* renamed from: h */
        public int f127073h = 0;

        /* renamed from: i */
        public int f127074i = 0;

        /* renamed from: j */
        public boolean f127075j = false;

        /* renamed from: k */
        public int f127076k = 0;

        /* renamed from: l */
        public int f127077l = 0;

        /* renamed from: m */
        public boolean f127078m;

        /* renamed from: n */
        public byte[] f127079n = null;

        /* renamed from: a */
        public C47350c mo72403a() {
            int i;
            int i2;
            int i3;
            if (this.f127066a == null || this.f127067b == null || Util.isNullOrNil(this.f127068c) || (i = this.f127069d) <= 0 || (i2 = this.f127070e) == Integer.MIN_VALUE || (i3 = this.f127071f) == Integer.MIN_VALUE) {
                Object[] objArr = new Object[6];
                boolean z = true;
                objArr[0] = Boolean.valueOf(this.f127066a == null);
                objArr[1] = Boolean.valueOf(this.f127067b == null);
                objArr[2] = Boolean.valueOf(Util.isNullOrNil(this.f127068c));
                objArr[3] = Boolean.valueOf(this.f127069d <= 0);
                objArr[4] = Boolean.valueOf(this.f127070e == Integer.MIN_VALUE);
                if (this.f127071f != Integer.MIN_VALUE) {
                    z = false;
                }
                objArr[5] = Boolean.valueOf(z);
                throw new IllegalArgumentException(String.format("%s %s %s %s %s %s", objArr));
            }
            C47350c cVar = new C47350c(this.f127066a, this.f127067b, this.f127068c, i, i2, i3, this.f127072g, this.f127074i, this.f127073h, this.f127075j, this.f127076k, this.f127078m, (C47351a) null);
            int i4 = this.f127077l;
            if (i4 != 0) {
                cVar.f127064j = i4 | cVar.f127064j;
                cVar.f127065k = this.f127079n;
            }
            return cVar;
        }

        /* renamed from: b */
        public final void mo72404b(int i) {
            this.f127069d = i;
        }

        /* renamed from: c */
        public final void mo72405c(C47465a aVar) {
            this.f127066a = aVar;
        }

        /* renamed from: d */
        public final void mo72406d(int i) {
            this.f127070e = i;
        }

        /* renamed from: e */
        public final void mo72407e(C47465a aVar) {
            this.f127067b = aVar;
        }

        /* renamed from: f */
        public final void mo72408f(int i) {
            this.f127071f = i;
        }

        /* renamed from: g */
        public final void mo72409g(String str) {
            this.f127068c = str;
        }
    }

    /* renamed from: ob0.c$c */
    public static final class C47353c extends C89631w.C89634d implements C89631w.C89633b {

        /* renamed from: a */
        public C47465a f127080a;

        /* renamed from: b */
        public int f127081b;

        /* renamed from: c */
        public int f127082c;

        public C47353c(C47465a aVar, int i, int i2, boolean z, int i3) {
            this.f127080a = aVar;
            this.f127081b = i;
            this.f127082c = i2;
            setRouteInfo(i3);
        }

        public int getCmdId() {
            return this.f127082c;
        }

        public int getFuncId() {
            return this.f127081b;
        }

        public byte[] toProtoBuf() {
            C47465a aVar = this.f127080a;
            if (aVar instanceof C101820nt3) {
                ((C101820nt3) aVar).setBaseRequest(C89631w.m112065a(this));
            }
            return this.f127080a.toByteArray();
        }
    }

    /* renamed from: ob0.c$d */
    public static final class C47354d extends C89631w.C89636e implements C89631w.C89635c {

        /* renamed from: a */
        public C47465a f127083a;

        /* renamed from: b */
        public int f127084b;

        public C47354d(C47465a aVar, int i, boolean z) {
            this.f127083a = aVar;
            this.f127084b = i;
        }

        public int fromProtoBuf(byte[] bArr) {
            C47465a parseFrom = this.f127083a.parseFrom(bArr);
            this.f127083a = parseFrom;
            if (parseFrom instanceof r54) {
                return ((r54) parseFrom).getRet();
            }
            C89631w.m112066b(this, ((C49335eu3) parseFrom).getBaseResponse());
            return ((C49335eu3) this.f127083a).getBaseResponse().f135955d;
        }

        public int getCmdId() {
            return this.f127084b;
        }
    }

    public C47350c(C47465a aVar, C47465a aVar2, String str, int i, int i2, int i3, boolean z, int i4, int i5, boolean z2, int i6, boolean z3, C47351a aVar3) {
        boolean z4 = z;
        this.f127055a = new C47353c(aVar, i, i2, z4 && (aVar instanceof C101820nt3), i5);
        C47465a aVar4 = aVar2;
        this.f127056b = new C47354d(aVar2, i3, z4);
        this.f127057c = str;
        this.f127058d = i;
        this.f127060f = i4;
        this.f127061g = z2;
        this.f127063i = i6;
        this.f127064j = 0;
        this.f127065k = null;
        this.f127062h = z3;
    }

    /* renamed from: a */
    public final C47465a mo72394a() {
        return this.f127055a.f127080a;
    }

    /* renamed from: b */
    public final C47465a mo72395b() {
        return this.f127056b.f127083a;
    }

    public boolean getIsLongPolling() {
        return this.f127061g;
    }

    public int getLongPollingTimeout() {
        return this.f127063i;
    }

    public int getNewExtFlags() {
        return this.f127064j;
    }

    public int getOptions() {
        return this.f127059e;
    }

    public C89631w.C89634d getReqObjImp() {
        return this.f127055a;
    }

    public C89631w.C89636e getRespObj() {
        return this.f127056b;
    }

    public int getTimeOut() {
        return this.f127060f;
    }

    public byte[] getTransHeader() {
        return this.f127065k;
    }

    public final int getType() {
        return this.f127058d;
    }

    public final String getUri() {
        return this.f127057c;
    }

    public boolean keepAlive() {
        return this.f127062h;
    }

    public void setRsaInfo(C101125b1 b1Var) {
        this.f127055a.setRsaInfo(b1Var);
    }
}
