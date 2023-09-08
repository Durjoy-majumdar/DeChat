package bv0;

import com.tencent.p014mm.jni.utils.UtilsJni;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.pointers.PByteArray;
import com.tencent.p014mm.protocal.MMProtocalJni;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75592q0;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117746w;
import ob0.C117747y;
import p156gj.C87203t;
import qe3.C101125b1;
import qe3.C47819v;
import qe3.C62606u;
import qe3.C89625d;
import qe3.C89631w;
import te3.C64255b9;
import te3.C64844xz;
import yu0.C102910f;

/* renamed from: bv0.a */
public class C54591a extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f153083d;

    /* renamed from: e */
    public C114799u f153084e;

    /* renamed from: bv0.a$b */
    public static class C54592b extends C117746w {

        /* renamed from: a */
        public final C62606u f153085a = new C62606u();

        /* renamed from: b */
        public final C47819v f153086b = new C47819v();

        public int getOptions() {
            return 1;
        }

        public C89631w.C89634d getReqObjImp() {
            return this.f153085a;
        }

        public C89631w.C89636e getRespObj() {
            return this.f153086b;
        }

        public int getType() {
            return 1000;
        }

        public String getUri() {
            return "/cgi-bin/micromsg-bin/bakchatcreateqrcodeoffline";
        }
    }

    /* renamed from: bv0.a$a */
    public class C54593a implements C89631w.C89632a {

        /* renamed from: a */
        public final /* synthetic */ C62606u f153087a;

        /* renamed from: b */
        public final /* synthetic */ boolean f153088b;

        public C54593a(C54591a aVar, C62606u uVar, boolean z) {
            this.f153087a = uVar;
            this.f153088b = z;
        }

        /* renamed from: a */
        public boolean mo75491a(PByteArray pByteArray, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, int i2, boolean z, int i3, int i4) {
            byte[] bArr4;
            int i5;
            byte[] bArr5;
            long uin = (long) this.f153087a.getUin();
            if (CrashReportFactory.hasDebuger() && uin == 0) {
                uin = C89625d.f257840f;
            }
            C101125b1 rsaInfo = this.f153087a.getRsaInfo();
            if (i == 1000) {
                byte[] passKey = this.f153087a.getPassKey();
                if (!rsaInfo.mo140573f()) {
                    passKey = new byte[0];
                }
                if (!this.f153088b) {
                    C62606u uVar = this.f153087a;
                    byte[] bArr6 = uVar.f177801c;
                    uVar.setPassKey(bArr6);
                    bArr4 = bArr6;
                } else {
                    bArr4 = passKey;
                }
                if (Util.isNullOrNil(bArr4)) {
                    Log.m105921e("MicroMsg.BackupCreateQRCodeOfflineScene", "dksession jType %d session should not null", Integer.valueOf(i));
                    return false;
                }
                byte[] protoBuf = this.f153087a.toProtoBuf();
                int genSignature = (Util.isNullOrNil(bArr3) || Util.isNullOrNil(protoBuf)) ? 0 : MMProtocalJni.genSignature((int) uin, bArr3, protoBuf);
                if (!this.f153088b) {
                    byte[] AesGcmEncryptWithCompress = UtilsJni.AesGcmEncryptWithCompress(bArr4, protoBuf);
                    Log.m105918d("MicroMsg.BackupCreateQRCodeOfflineScene", "not single session , use aes gcm encrypt");
                    bArr5 = AesGcmEncryptWithCompress;
                    i5 = 13;
                } else {
                    bArr5 = protoBuf;
                    i5 = 0;
                }
                Log.m105925i("MicroMsg.BackupCreateQRCodeOfflineScene", "start to encode ,entype is %d", Integer.valueOf(i5));
                String deviceID = this.f153087a.getDeviceID();
                int i6 = (int) uin;
                this.f153087a.getClass();
                int i7 = rsaInfo.f296014c;
                byte[] bytes = rsaInfo.f296012a.getBytes();
                byte[] bytes2 = rsaInfo.f296013b.getBytes();
                String str = "MicroMsg.BackupCreateQRCodeOfflineScene";
                if (MMProtocalJni.pack(bArr5, pByteArray, bArr4, i5, bArr2, deviceID, i6, 1000, i7, bytes, bytes2, genSignature, i3, this.f153087a.getRouteInfo(), 0, 0, 0)) {
                    Log.m105919d(str, "reqToBuf using protobuf ok, len:%d, flag:%d", Integer.valueOf(pByteArray.value.length), Integer.valueOf(i3));
                    return true;
                }
            }
            return false;
        }
    }

    public C54591a(LinkedList<C64844xz> linkedList, String str, String str2) {
        C54592b bVar = new C54592b();
        this.f153084e = bVar;
        C62606u uVar = (C62606u) bVar.getReqObj();
        boolean isSingleSession = this.f153084e.isSingleSession();
        uVar.f177800b = C102910f.f303739h;
        uVar.f177799a.f182233d = linkedList.size();
        C64255b9 b9Var = uVar.f177799a;
        b9Var.f182234e = linkedList;
        b9Var.f182235f = C87203t.m108278n();
        uVar.f177799a.f182236g = C75592q0.m90789s();
        C64255b9 b9Var2 = uVar.f177799a;
        b9Var2.f182237h = 2;
        b9Var2.f182238i = 0;
        b9Var2.f182239j = str;
        b9Var2.f182240n = str2;
        uVar.setPassKey(uVar.f177800b);
        if (!isSingleSession) {
            uVar.f177801c = uVar.f177800b;
        }
        uVar.setReqPackControl(new C54593a(this, uVar, isSingleSession));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f153083d = nVar;
        return dispatch(gVar, this.f153084e, this);
    }

    public int getType() {
        return 1000;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.BackupCreateQRCodeOfflineScene", "err: %d, %d, %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            Log.m105925i("MicroMsg.BackupCreateQRCodeOfflineScene", "onGYNetEnd QRCodeUrl:%s", ((C47819v) uVar.getRespObj()).f128383a.f132191f);
            this.f153083d.onSceneEnd(i2, i3, str, this);
            return;
        }
        this.f153083d.onSceneEnd(i2, i3, str, this);
    }
}
