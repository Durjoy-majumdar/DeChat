package qe3;

import android.text.TextUtils;
import com.tencent.p014mm.network.C114766b;
import com.tencent.p014mm.pointers.PByteArray;
import com.tencent.p014mm.protocal.MMProtocalJni;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C85796t4;
import f40.C86709a0;
import f40.C86718e;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import p156gj.C87200o;
import p156gj.C87203t;
import sf0.C90188n0;
import tc2.C118418g;
import te3.C118458pu2;
import te3.C49569gj3;
import te3.C51018qv3;
import te3.C64306d60;
import te3.C64666qu2;
import te3.C64691ru2;
import te3.ay4;
import te3.lx4;

/* renamed from: qe3.q */
public class C118188q extends C118191s {

    /* renamed from: b */
    public C64666qu2 f353310b = new C64666qu2();

    /* renamed from: c */
    public boolean f353311c = false;

    /* renamed from: a */
    public String mo182987a() {
        return C101127f.f296015a ? "/cgi-bin/micromsg-bin/secmanualauth" : "/cgi-bin/micromsg-bin/manualauth";
    }

    public int getFuncId() {
        return C101127f.f296015a ? 252 : 701;
    }

    public byte[] toProtoBuf() {
        int i;
        int i2;
        C86718e.f251747w = "";
        int sceneStatus = getSceneStatus();
        if (sceneStatus == 16) {
            i = 1;
        } else if (this.f353311c) {
            i = 3;
        } else {
            C86709a0.m107528h();
            i = C86709a0.m107535s().f251803a.mo119662c(46, 0);
        }
        Log.m105919d("MicroMsg.ManualReq", "summerstatus[%d] clientUpgrade[%d]", Integer.valueOf(sceneStatus), Integer.valueOf(i));
        if (10002 == C90188n0.f258950r && C90188n0.f258951s > 0) {
            C90188n0.f258951s = 0;
            C101125b1.m132539g("", "", 0);
        }
        setRsaInfo(C101125b1.m132538d());
        C118458pu2 pu22 = this.f353310b.f185081e;
        pu22.setBaseRequest(C89631w.m112065a(this));
        pu22.f354251e = C87203t.m108270f(true);
        C118418g gVar = C118418g.INSTANCE;
        pu22.f354252f = gVar.mo175810Zb(i);
        pu22.f354253g = 0;
        pu22.f354254h = C86718e.m107547e();
        pu22.f354255i = Util.getSourceeMd5(MMApplicationContext.getContext());
        pu22.f354256j = C89625d.f257838d;
        pu22.f354257n = C85796t4.m105983jo();
        pu22.f354258o = LocaleUtil.getApplicationLanguage();
        pu22.f354259p = "" + Util.getTimeZoneOffset();
        pu22.f354260q = ChannelUtil.channelId;
        if (10012 == C90188n0.f258950r && (i2 = C90188n0.f258951s) > 0) {
            pu22.f354260q = i2;
        }
        pu22.f354262s = C89625d.f257836b;
        pu22.f354263t = C89625d.f257837c;
        pu22.f354264u = C87200o.f252872e;
        pu22.f354265v = C87203t.m108277m();
        pu22.f354248C = MMApplicationContext.getApplicationId();
        C86709a0.m107528h();
        String str = (String) C86709a0.m107535s().f251803a.mo119660a(18);
        Log.m105919d("MicroMsg.ManualReq", "summerauth ksid:%s authreq flag:%d", str, Integer.valueOf(pu22.f354250d.f353910i));
        ay4 ay4 = pu22.f354250d.f353906e;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(Util.decodeHexString(str));
        ay4.f297893g = qv32;
        try {
            byte[] hd = gVar.mo175821hd();
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf(hd != null ? hd.length : -1);
            Log.m105919d("MicroMsg.ManualReq", "[debug] ccd set on manual auth, len: %s", objArr);
            lx4 lx4 = new lx4();
            int i3 = pu22.f354269z;
            if (2 == i3 || 1 == i3 || i3 == 0) {
                if (gVar.An0("ie_login_id")) {
                    gVar.mo175826kl("ie_login_id");
                }
                C51018qv3 qv33 = new C51018qv3();
                qv33.mo73350k(gVar.vu0("ie_login_id"));
                lx4.f354115d = qv33;
                Log.m105919d("MicroMsg.ManualReq", "[debug] wcstf set on manual auth, len: %s", Integer.valueOf(qv33.f140572d));
                C51018qv3 qv34 = new C51018qv3();
                qv34.mo73350k(gVar.bw0("ce_login_id"));
                lx4.f354116e = qv34;
                Log.m105919d("MicroMsg.ManualReq", "[debug] wcste set on manual auth, len: %s", Integer.valueOf(qv34.f140572d));
                String gF = gVar.mo175819gF("ce_login_id");
                if (gF != null) {
                    C51018qv3 qv35 = new C51018qv3();
                    qv35.mo73350k(gF.getBytes());
                    lx4.f354122n = qv35;
                }
            }
            C51018qv3 qv36 = new C51018qv3();
            qv36.mo73350k(gVar.b90());
            lx4.f354121j = qv36;
            Log.m105919d("MicroMsg.ManualReq", "[debug] devtok on manual auth, len: %s", Integer.valueOf(qv36.f140572d));
            C51018qv3 qv37 = new C51018qv3();
            qv37.mo73350k(hd);
            lx4.f354117f = qv37;
            C51018qv3 qv38 = new C51018qv3();
            qv38.mo73350k(lx4.toByteArray());
            pu22.f354247B = qv38;
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.ManualReq", th, "cc throws exception.", new Object[0]);
        }
        C64691ru2 ru22 = this.f353310b.f185080d;
        C51018qv3 qv39 = new C51018qv3();
        qv39.mo73350k(Util.getUuidRandom());
        ru22.f185295d = qv39;
        C64306d60 d602 = new C64306d60();
        d602.f182634d = 713;
        PByteArray pByteArray = new PByteArray();
        PByteArray pByteArray2 = new PByteArray();
        int generateECKey = MMProtocalJni.generateECKey(d602.f182634d, pByteArray, pByteArray2);
        byte[] bArr = pByteArray.value;
        byte[] bArr2 = pByteArray2.value;
        this.f353314a = bArr2 != null ? bArr2 : new byte[0];
        pu22.f354249D = new C49569gj3();
        String a = C114766b.f344135e.mo174416a();
        if (!TextUtils.isEmpty(a)) {
            C49569gj3 gj32 = pu22.f354249D;
            C114766b bVar = C114766b.f344135e;
            bVar.mo174417b();
            gj32.f134078d = bVar.f344136a.f134078d;
            C49569gj3 gj33 = pu22.f354249D;
            C51018qv3 qv310 = new C51018qv3();
            qv310.mo73350k(a.getBytes(StandardCharsets.ISO_8859_1));
            gj33.f134079e = qv310;
            Log.m105924i("MicroMsg.ManualReq", "manualauth add public key , length " + a.length());
        } else {
            C49569gj3 gj34 = pu22.f354249D;
            gj34.f134078d = 0;
            C51018qv3 qv311 = new C51018qv3();
            qv311.mo73350k(new byte[0]);
            gj34.f134079e = qv311;
            Log.m105920e("MicroMsg.ManualReq", "get sign key failed");
        }
        C114766b.C114767a aVar = new C114766b.C114767a();
        aVar.f344141b = C114766b.f344135e.mo174416a();
        C114766b bVar2 = C114766b.f344135e;
        bVar2.mo174417b();
        aVar.f344140a = bVar2.f344137b;
        setCGiVerifyKey(aVar);
        Object[] objArr2 = new Object[6];
        objArr2[0] = Integer.valueOf(d602.f182634d);
        objArr2[1] = Integer.valueOf(generateECKey);
        objArr2[2] = Integer.valueOf(bArr == null ? -1 : bArr.length);
        objArr2[3] = Integer.valueOf(bArr2 == null ? -1 : bArr2.length);
        objArr2[4] = Util.dumpHex(bArr);
        objArr2[5] = Util.dumpHex(bArr2);
        Log.m105919d("MicroMsg.ManualReq", "summerecdh nid:%d ret:%d, pub len: %d, pri len:%d, pub:%s, pri:%s", objArr2);
        C51018qv3 qv312 = new C51018qv3();
        qv312.mo73350k(bArr);
        d602.f182635e = qv312;
        ru22.f185296e = d602;
        Log.m105925i("MicroMsg.ManualReq", "summerauth manual IMEI:%s SoftType:%s ClientSeqID:%s Signature:%s DeviceName:%s DeviceType:%s Language:%s TimeZone:%s chan[%d,%d,%d] DeviceBrand:%s DeviceModel:%s OSType:%s RealCountry:%s AndroidPackageName:%s", pu22.f354251e, pu22.f354252f, pu22.f354254h, pu22.f354255i, pu22.f354256j, pu22.f354257n, pu22.f354258o, pu22.f354259p, Integer.valueOf(pu22.f354260q), Integer.valueOf(ChannelUtil.channelId), Integer.valueOf(ChannelUtil.historyChannelId), pu22.f354262s, pu22.f354263t, pu22.f354264u, pu22.f354265v, pu22.f354248C);
        try {
            return this.f353310b.toByteArray();
        } catch (IOException e) {
            Log.m105921e("MicroMsg.ManualReq", "summerauth toProtoBuf :%s", Util.stackTraceToString(e));
            return null;
        }
    }
}
