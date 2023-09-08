package eb1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C89349b;
import tc2.C118418g;
import te3.C48737am2;
import te3.C49123dc0;
import te3.C49261ec0;
import te3.C49996ji3;
import te3.C51018qv3;
import te3.lx4;

/* renamed from: eb1.m */
public class C7630m extends C45633a implements C1311n {

    /* renamed from: d */
    public C11385n f25916d;

    /* renamed from: e */
    public C47350c f25917e;

    /* renamed from: f */
    public LinkedList<C48737am2> f25918f = null;

    /* renamed from: g */
    public C49996ji3 f25919g = null;

    /* renamed from: h */
    public String f25920h;

    /* renamed from: i */
    public String f25921i;

    /* renamed from: j */
    public String f25922j = null;

    /* renamed from: n */
    public String f25923n = null;

    /* renamed from: o */
    public String f25924o = null;

    /* renamed from: p */
    public float f25925p;

    /* renamed from: q */
    public int f25926q;

    /* renamed from: r */
    public String f25927r;

    /* renamed from: s */
    public float f25928s = 0.0f;

    /* renamed from: t */
    public String f25929t = "";

    /* renamed from: u */
    public String f25930u = "";

    /* renamed from: v */
    public C49996ji3 f25931v = null;

    /* renamed from: w */
    public String f25932w = "";

    public C7630m(String str, String str2, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49123dc0();
        bVar.f127067b = new C49261ec0();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/usrmsg/faceidentifyprepage";
        bVar.f127069d = 1147;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f25917e = a;
        C49123dc0 dc02 = (C49123dc0) a.f127055a.f127080a;
        dc02.f132226d = str;
        dc02.f132227e = str2;
        dc02.f132229g = i;
        try {
            lx4 lx4 = new lx4();
            C51018qv3 qv32 = new C51018qv3();
            qv32.mo73350k(C118418g.INSTANCE.mo175821hd());
            lx4.f354117f = qv32;
            dc02.f132230h = new C89349b(lx4.toByteArray());
        } catch (Throwable unused) {
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f25916d = nVar;
        return dispatch(gVar, this.f25917e, this);
    }

    public int getType() {
        return 1147;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneFaceGetConfirmPageInfo", "alvinluo errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C49261ec0 ec02 = (C49261ec0) ((C47350c) uVar).f127056b.f127083a;
        if (ec02 != null) {
            this.f25918f = ec02.f132843d;
            this.f25919g = ec02.f132844e;
            this.f25922j = ec02.f132846g;
            this.f25923n = ec02.f132847h;
            this.f25924o = ec02.f132848i;
            float f = ec02.f132849j;
            this.f25925p = f;
            this.f25926q = ec02.f132850n;
            this.f25927r = ec02.f132851o;
            this.f25920h = ec02.f132852p;
            this.f25921i = ec02.f132845f;
            this.f25928s = ec02.f132853q;
            this.f25929t = ec02.f132854r;
            this.f25930u = ec02.f132855s;
            this.f25932w = ec02.f132857u;
            this.f25931v = ec02.f132858v;
            Log.m105925i("MicroMsg.NetSceneFaceGetConfirmPageInfo", "Light threshold is %f check_alive_type:%d faceRatio:%f errorTip:%s identifyId:%s", Float.valueOf(f), Integer.valueOf(this.f25926q), Float.valueOf(this.f25928s), this.f25929t, this.f25930u);
            C11385n nVar = this.f25916d;
            if (nVar != null) {
                nVar.onSceneEnd(i2, i3, str, this);
            }
        }
    }

    public String toString() {
        return "NetSceneFaceGetConfirmPageInfo{callback=" + this.f25916d + ", rr=" + this.f25917e + ", mFaceConfirmInfoList=" + this.f25918f + ", mPromptButtonInfo=" + this.f25919g + ", bizHeadUrl='" + this.f25920h + '\'' + ", bizNickName='" + this.f25921i + '\'' + ", mHeaderPrompt='" + this.f25922j + '\'' + ", mFeedbackUrl='" + this.f25923n + '\'' + ", mComplainUrl='" + this.f25924o + '\'' + ", mLight_threshold=" + this.f25925p + ", check_alive_type=" + this.f25926q + ", business_tips='" + this.f25927r + '\'' + ", faceRatio=" + this.f25928s + ", errorTip='" + this.f25929t + '\'' + ", identifyId='" + this.f25930u + '\'' + '}';
    }
}
