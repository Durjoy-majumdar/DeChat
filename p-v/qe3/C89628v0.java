package qe3;

import com.tencent.p014mm.jni.utils.UtilsJni;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C85796t4;
import ob0.C117746w;
import p156gj.C87203t;
import qe3.C89631w;
import tc2.C118418g;
import te3.C51018qv3;
import te3.C51208s8;
import te3.C90434r8;
import te3.lx4;

/* renamed from: qe3.v0 */
public class C89628v0 extends C117746w {

    /* renamed from: a */
    public final C89629a f257850a;

    /* renamed from: b */
    public final C89630b f257851b = new C89630b();

    /* renamed from: c */
    public final int f257852c;

    /* renamed from: d */
    public final String f257853d;

    /* renamed from: qe3.v0$a */
    public static class C89629a extends C89631w.C89634d implements C89631w.C89633b {

        /* renamed from: a */
        public C90434r8 f257854a = new C90434r8();

        /* renamed from: b */
        public int f257855b;

        /* renamed from: c */
        public byte[] f257856c;

        public int getFuncId() {
            return this.f257855b;
        }

        public boolean isAxAuth() {
            return true;
        }

        public byte[] toProtoBuf() {
            this.f257854a.setBaseRequest(C89631w.m112065a(this));
            this.f257854a.f259780f = C87203t.m108270f(true);
            C90434r8 r8Var = this.f257854a;
            C118418g gVar = C118418g.INSTANCE;
            r8Var.f259781g = gVar.mo175810Zb(0);
            this.f257854a.f259782h = Util.getSourceeMd5(MMApplicationContext.getContext());
            C90434r8 r8Var2 = this.f257854a;
            r8Var2.f259783i = C89625d.f257838d;
            r8Var2.f259784j = C85796t4.m105983jo();
            this.f257854a.f259785n = LocaleUtil.getApplicationLanguage();
            C90434r8 r8Var3 = this.f257854a;
            r8Var3.f259786o = "" + Util.getTimeZoneOffset();
            this.f257854a.f259787p = ChannelUtil.channelId;
            try {
                byte[] hd = gVar.mo175821hd();
                Object[] objArr = new Object[1];
                objArr[0] = Integer.valueOf(hd != null ? hd.length : -1);
                Log.m105919d("MicroMsg.MMReqRespAxAuth", "[debug] ccd set on axauth, len: %s", objArr);
                lx4 lx4 = new lx4();
                C51018qv3 qv32 = new C51018qv3();
                qv32.mo73350k(hd);
                lx4.f354117f = qv32;
                C51018qv3 qv33 = new C51018qv3();
                qv33.mo73350k(gVar.b90());
                lx4.f354121j = qv33;
                Log.m105919d("MicroMsg.MMReqRespAxAuth", "[debug] devtok on axauth, len: %s", Integer.valueOf(qv33.f140572d));
                C90434r8 r8Var4 = this.f257854a;
                C51018qv3 qv34 = new C51018qv3();
                qv34.mo73350k(lx4.toByteArray());
                r8Var4.f259788q = qv34;
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.MMReqRespAxAuth", th, "cc throws exception.", new Object[0]);
            }
            C90434r8 r8Var5 = this.f257854a;
            long CreateAxEcdhCryptoEngine = UtilsJni.CreateAxEcdhCryptoEngine(r8Var5.f259778d, this.f257856c, r8Var5.f259779e.f140574f.f257327a);
            setEcdhEngine(CreateAxEcdhCryptoEngine);
            return UtilsJni.AxEcdhEncrypt(CreateAxEcdhCryptoEngine, this.f257854a.toByteArray());
        }
    }

    /* renamed from: qe3.v0$b */
    public static class C89630b extends C89631w.C89636e implements C89631w.C89635c {

        /* renamed from: a */
        public C51208s8 f257857a = new C51208s8();

        public int fromProtoBuf(byte[] bArr) {
            C51208s8 s8Var = (C51208s8) new C51208s8().parseFrom(bArr);
            this.f257857a = s8Var;
            C89631w.m112066b(this, s8Var.getBaseResponse());
            return this.f257857a.getBaseResponse().f135955d;
        }
    }

    public C89628v0(int i, String str, int i2, C51018qv3 qv32, byte[] bArr) {
        C89629a aVar = new C89629a();
        this.f257850a = aVar;
        this.f257852c = i;
        this.f257853d = str;
        aVar.f257855b = i;
        aVar.f257856c = bArr;
        C90434r8 r8Var = aVar.f257854a;
        r8Var.f259778d = i2;
        r8Var.f259779e = qv32;
    }

    public int getOptions() {
        return 1;
    }

    public C89631w.C89634d getReqObjImp() {
        return this.f257850a;
    }

    public C89631w.C89636e getRespObj() {
        return this.f257851b;
    }

    public int getType() {
        return this.f257852c;
    }

    public String getUri() {
        return this.f257853d;
    }
}
