package qe3;

import com.tencent.p014mm.jni.utils.UtilsJni;
import com.tencent.p014mm.pointers.PByteArray;
import com.tencent.p014mm.protocal.MMProtocalJni;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C100321i0;
import qe3.C89631w;
import te3.C51018qv3;
import te3.C51937x80;
import te3.C64690ru;
import te3.C64768v80;
import te3.C64796w80;

/* renamed from: qe3.d0 */
public class C62603d0 extends C89631w.C89634d implements C89631w.C89633b {

    /* renamed from: a */
    public final C64796w80 f177796a;

    /* renamed from: qe3.d0$a */
    public class C62604a implements C89631w.C89632a {

        /* renamed from: a */
        public final /* synthetic */ C89631w.C89634d f177797a;

        public C62604a(C62603d0 d0Var, C89631w.C89634d dVar) {
            this.f177797a = dVar;
        }

        /* renamed from: a */
        public boolean mo75491a(PByteArray pByteArray, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, int i2, boolean z, int i3, int i4) {
            int i5 = i;
            C89631w.C89634d dVar = this.f177797a;
            C89631w.C89633b bVar = (C89631w.C89633b) dVar;
            long uin = (long) dVar.getUin();
            if (CrashReportFactory.hasDebuger() && uin == 0) {
                uin = C89625d.f257840f;
            }
            C101125b1 rsaInfo = this.f177797a.getRsaInfo();
            if (i5 == 722) {
                Log.m105920e("MicroMsg.MMEncryptCheckResUpdate", "MMEncryptCheckResUpdate reqToBuf rsaReqData");
                C64796w80 w802 = ((C62603d0) this.f177797a).f177796a;
                byte[][] e = C100321i0.m131149e(uin, w802.f186063d, w802.f186064e);
                if (e == null) {
                    return false;
                }
                byte[] bArr4 = e[0];
                byte[] bArr5 = e[1];
                if (MMProtocalJni.packHybrid(pByteArray, bArr2, this.f177797a.getDeviceID(), (int) uin, bVar.getFuncId(), rsaInfo.f296014c, bArr4, bArr5, rsaInfo.f296012a.getBytes(), rsaInfo.f296013b.getBytes(), this.f177797a.getPassKey(), i3, ((C62603d0) this.f177797a).getRouteInfo(), 0)) {
                    Log.m105919d("MicroMsg.MMEncryptCheckResUpdate", "IRemoteReqDelegate reqToBuf packHybrid using protobuf ok, len:%d, flag:%d", Integer.valueOf(pByteArray.value.length), Integer.valueOf(i3));
                    return true;
                }
            } else if (i5 == 784) {
                Log.m105925i("MicroMsg.MMEncryptCheckResUpdate", "summerauths rsaInfo[%s] EcdhMgr.USE_ECDH[%s] engine[%s]", Integer.valueOf(rsaInfo.f296014c), Boolean.valueOf(C101127f.f296015a), Long.valueOf(((C89631w.C89633b) this.f177797a).getECDHEngine()));
                ((C89631w.C89633b) this.f177797a).getFuncId();
                PByteArray pByteArray2 = new PByteArray();
                byte[] protoBuf = ((C89631w.C89633b) this.f177797a).toProtoBuf();
                if (protoBuf == null) {
                    Log.m105922f("MicroMsg.MMEncryptCheckResUpdate", "protobuf is null");
                    return false;
                }
                long c = C101127f.m132550c((byte[]) null);
                this.f177797a.setEcdhEngine(c);
                byte[] HybridEcdhEncrypt = UtilsJni.HybridEcdhEncrypt(c, protoBuf);
                boolean packHybridEcdh = MMProtocalJni.packHybridEcdh(pByteArray2, bArr2, this.f177797a.getDeviceID(), (int) uin, bVar.getFuncId(), C101127f.m132548a(), HybridEcdhEncrypt, i3, bVar.getRouteInfo(), 0, 12);
                Log.m105919d("MicroMsg.MMEncryptCheckResUpdate", "summerauths MMFunc_SecMMEncryptCheckResUpdate reqToBuf packHybridEcdh using protobuf ok, jType:%d, cert:%d len:%d, flag:%d ret:%s", Integer.valueOf(i), Integer.valueOf(C101127f.m132548a()), Integer.valueOf(pByteArray2.value.length), Integer.valueOf(i3), Boolean.valueOf(packHybridEcdh));
                return packHybridEcdh;
            }
            return false;
        }
    }

    public C62603d0() {
        C64796w80 w802 = new C64796w80();
        this.f177796a = w802;
        setUin(0);
        C64768v80 v802 = new C64768v80();
        w802.f186064e = v802;
        v802.f185852d = new C64690ru();
        w802.f186063d = new C51937x80();
    }

    public int getFuncId() {
        return C101127f.f296015a ? 784 : 722;
    }

    public byte[] toProtoBuf() {
        setRsaInfo(C101125b1.m132538d());
        this.f177796a.f186064e.setBaseRequest(C89631w.m112065a(this));
        C51937x80 x802 = this.f177796a.f186063d;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(Util.getUuidRandom());
        x802.f144516d = qv32;
        setPassKey(this.f177796a.f186063d.f144516d.f140574f.mo123703f());
        setReqPackControl(new C62604a(this, this));
        return this.f177796a.toByteArray();
    }
}
