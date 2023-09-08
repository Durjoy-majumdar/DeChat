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
import p156gj.C87203t;
import qe3.C89631w;
import sf0.C90188n0;
import tc2.C118418g;
import te3.C118442l8;
import te3.C49569gj3;
import te3.C51018qv3;
import te3.C64306d60;
import te3.C64572n8;
import te3.C64604o8;
import te3.ay4;

/* renamed from: qe3.n */
public class C118186n extends C89631w.C89634d implements C89631w.C89633b {

    /* renamed from: a */
    public C64572n8 f353307a = new C64572n8();

    /* renamed from: b */
    public String f353308b;

    public int getFuncId() {
        return 3941;
    }

    public byte[] toProtoBuf() {
        int i;
        C86718e.f251747w = "";
        int sceneStatus = getSceneStatus();
        if (sceneStatus == 12) {
            i = 1;
        } else {
            C86709a0.m107528h();
            i = C86709a0.m107535s().f251803a.mo119662c(46, 0);
        }
        Log.m105919d("MicroMsg.MMAuth", "summerstatus[%d] clientUpgrade[%d]", Integer.valueOf(sceneStatus), Integer.valueOf(i));
        setRsaInfo(C101125b1.m132538d());
        if (10002 == C90188n0.f258950r && C90188n0.f258951s > 0) {
            C90188n0.f258951s = 0;
            C101125b1.m132539g("", "", 0);
        }
        C118442l8 l8Var = this.f353307a.f184445e;
        l8Var.setBaseRequest(C89631w.m112065a(this));
        Log.m105925i("MicroMsg.MMAuth", "summerauth autoauth toProtoBuf uin[%d]", Integer.valueOf(getUin()));
        l8Var.f354100f = C87203t.m108270f(true);
        l8Var.f354101g = C118418g.INSTANCE.mo175810Zb(i);
        l8Var.f354102h = 0;
        l8Var.f354103i = C86718e.m107547e();
        l8Var.f354104j = Util.getSourceeMd5(MMApplicationContext.getContext());
        l8Var.f354105n = C89625d.f257838d;
        l8Var.f354106o = C85796t4.m105983jo();
        l8Var.f354107p = LocaleUtil.getApplicationLanguage();
        l8Var.f354108q = "" + Util.getTimeZoneOffset();
        l8Var.f354109r = ChannelUtil.channelId;
        l8Var.f354113v = MMApplicationContext.getApplicationId();
        C86709a0.m107528h();
        String str = (String) C86709a0.m107535s().f251803a.mo119660a(18);
        Log.m105919d("MicroMsg.MMAuth", "summerecdh ksid:%s, flag:%d", str, Integer.valueOf(l8Var.f354098d.f353910i));
        ay4 ay4 = l8Var.f354098d.f353906e;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(Util.decodeHexString(str));
        ay4.f297893g = qv32;
        l8Var.f354114w = new C49569gj3();
        String a = C114766b.f344135e.mo174416a();
        if (!TextUtils.isEmpty(a)) {
            C49569gj3 gj32 = l8Var.f354114w;
            C114766b bVar = C114766b.f344135e;
            bVar.mo174417b();
            gj32.f134078d = bVar.f344136a.f134078d;
            C49569gj3 gj33 = l8Var.f354114w;
            C51018qv3 qv33 = new C51018qv3();
            qv33.mo73350k(a.getBytes(StandardCharsets.ISO_8859_1));
            gj33.f134079e = qv33;
            Log.m105924i("MicroMsg.MMAuth", "disaster auth add public key , length " + a.length());
        } else {
            C49569gj3 gj34 = l8Var.f354114w;
            gj34.f134078d = 0;
            C51018qv3 qv34 = new C51018qv3();
            qv34.mo73350k(new byte[0]);
            gj34.f134079e = qv34;
            Log.m105920e("MicroMsg.MMAuth", "get sign key failed");
        }
        C114766b.C114767a aVar = new C114766b.C114767a();
        aVar.f344141b = C114766b.f344135e.mo174416a();
        C114766b bVar2 = C114766b.f344135e;
        bVar2.mo174417b();
        aVar.f344140a = bVar2.f344137b;
        setCGiVerifyKey(aVar);
        C64604o8 o8Var = this.f353307a.f184444d;
        C64306d60 d602 = new C64306d60();
        d602.f182634d = 713;
        PByteArray pByteArray = new PByteArray();
        PByteArray pByteArray2 = new PByteArray();
        int generateECKey = MMProtocalJni.generateECKey(d602.f182634d, pByteArray, pByteArray2);
        byte[] bArr = pByteArray.value;
        byte[] bArr2 = pByteArray2.value;
        Object[] objArr = new Object[6];
        objArr[0] = Integer.valueOf(d602.f182634d);
        objArr[1] = Integer.valueOf(generateECKey);
        int i2 = -1;
        objArr[2] = Integer.valueOf(bArr == null ? -1 : bArr.length);
        if (bArr2 != null) {
            i2 = bArr2.length;
        }
        objArr[3] = Integer.valueOf(i2);
        objArr[4] = Util.dumpHex(bArr);
        objArr[5] = Util.dumpHex(bArr2);
        Log.m105919d("MicroMsg.MMAuth", "summerecdh nid:%d ret:%d, pub len: %d, pri len:%d, pub:%s, pri:%s", objArr);
        C51018qv3 qv35 = new C51018qv3();
        qv35.mo73350k(bArr);
        d602.f182635e = qv35;
        o8Var.f184633e = d602;
        Log.m105925i("MicroMsg.MMAuth", "summerauth auto IMEI:%s SoftType:%s ClientSeqID:%s Signature:%s DeviceName:%s DeviceType:%s Language:%s TimeZone:%s AndroidPackageName:%s chan[%d,%d,%d]", l8Var.f354100f, l8Var.f354101g, l8Var.f354103i, l8Var.f354104j, l8Var.f354105n, l8Var.f354106o, l8Var.f354107p, l8Var.f354108q, l8Var.f354113v, Integer.valueOf(l8Var.f354109r), Integer.valueOf(ChannelUtil.channelId), Integer.valueOf(ChannelUtil.historyChannelId));
        try {
            return this.f353307a.toByteArray();
        } catch (IOException e) {
            Log.m105921e("MicroMsg.MMAuth", "summerauth toProtoBuf :%s", Util.stackTraceToString(e));
            return null;
        }
    }
}
