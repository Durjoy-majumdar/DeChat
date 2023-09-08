package eb1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import ob0.C11385n;
import ob0.y$$c;
import ob0.y$$d;
import p663qo.C101210g;
import pe3.C89349b;
import sf0.C48374j0;
import te3.C101827pd;
import te3.C101852uv1;
import te3.C101859vv1;
import te3.C49510g33;
import te3.C51018qv3;

/* renamed from: eb1.x */
public class C97636x extends C45645r implements C116764b {

    /* renamed from: g */
    public final C114799u f286413g;

    /* renamed from: h */
    public long f286414h = -1;

    /* renamed from: i */
    public float f286415i = 0.5f;

    /* renamed from: j */
    public byte[] f286416j = null;

    /* renamed from: n */
    public byte[] f286417n = null;

    public C97636x(int i, int i2, String str, String str2, byte[] bArr) {
        C97632f fVar = new C97632f();
        this.f286413g = fVar;
        C101852uv1 uv12 = ((C97633g) fVar.getReqObj()).f286405a;
        uv12.f299638f = C45645r.f123433f;
        uv12.f299636d = 1;
        uv12.f299637e = i;
        uv12.f299640h = i2;
        uv12.f299641i = str;
        uv12.f299642j = str2;
        uv12.f299643n = C89349b.m111674a(bArr);
    }

    /* renamed from: G */
    public byte[] mo136896G() {
        return this.f286417n;
    }

    public int getType() {
        return 733;
    }

    /* renamed from: h0 */
    public float mo136897h0() {
        float f = this.f286415i;
        if (f <= 0.0f || f > 1.0f) {
            this.f286415i = 0.5f;
        }
        return this.f286415i;
    }

    /* renamed from: j1 */
    public int mo71157j1(C114770g gVar, C11385n nVar) {
        return dispatch(gVar, this.f286413g, this);
    }

    /* renamed from: k1 */
    public C49510g33 mo71158k1(C114799u uVar) {
        return ((C97634h) uVar.getRespObj()).f286406a.f299686f;
    }

    /* renamed from: l */
    public byte[] mo136898l() {
        return this.f286416j;
    }

    /* renamed from: l1 */
    public void mo71159l1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        byte[] bArr2;
        int i4;
        int i5;
        int i6 = i2;
        int i7 = i3;
        Log.m105918d("MicroMsg.NetSceneGetBioConfigRsa", "hy: onGYNetEnd  errType:" + i6 + " errCode:" + i7);
        if (i6 == 0 && i7 == 0) {
            C97634h hVar = (C97634h) uVar.getRespObj();
            C101859vv1 vv12 = hVar.f286406a;
            this.f286414h = vv12.f299684d;
            this.f286415i = vv12.f299689i;
            C89349b bVar = vv12.f299685e;
            if (bVar != null) {
                this.f286416j = bVar.f257327a;
            }
            C89349b bVar2 = vv12.f299688h;
            if (bVar2 != null) {
                this.f286417n = bVar2.f257327a;
            }
            C101827pd pdVar = vv12.f299687g;
            int i8 = 0;
            if (pdVar != null) {
                C51018qv3 qv32 = pdVar.f299144g;
                byte[] bArr3 = null;
                if (qv32 == null || (i5 = qv32.f140572d) <= 0) {
                    bArr2 = null;
                } else {
                    Log.m105925i("MicroMsg.NetSceneGetBioConfigRsa", "summersafecdn onGYNetEnd cdnrule:%d", Integer.valueOf(i5));
                    bArr2 = C48374j0.m53715d(hVar.f286406a.f299687g.f299144g);
                }
                C51018qv3 qv33 = hVar.f286406a.f299687g.f299145h;
                if (qv33 != null && (i4 = qv33.f140572d) > 0) {
                    Log.m105925i("MicroMsg.NetSceneGetBioConfigRsa", "summersafecdn onGYNetEnd safecdnrule:%d", Integer.valueOf(i4));
                    bArr3 = C48374j0.m53715d(hVar.f286406a.f299687g.f299145h);
                }
                C101210g gVar = (C101210g) C86312j.m106911c(C101210g.class);
                C101827pd pdVar2 = hVar.f286406a.f299687g;
                gVar.Pi0(pdVar2.f299141d, pdVar2.f299142e, pdVar2.f299143f, bArr2, bArr3, pdVar2.f299146i);
            }
            Object[] objArr = new Object[3];
            objArr[0] = Long.valueOf(this.f286414h);
            byte[] bArr4 = this.f286416j;
            if (bArr4 != null) {
                i8 = bArr4.length;
            }
            objArr[1] = Integer.valueOf(i8);
            objArr[2] = Float.valueOf(this.f286415i);
            Log.m105925i("MicroMsg.NetSceneGetBioConfigRsa", "hy: get bio config: bioId: %s, bioConfigSize: %d ratio:%s", objArr);
        }
        this.f123434e.onSceneEnd(i6, i7, str, this);
    }

    /* renamed from: m1 */
    public void mo71160m1(String str) {
        ((C97633g) this.f286413g.getReqObj()).f286405a.f299638f = str;
    }

    /* renamed from: r0 */
    public long mo136899r0() {
        return this.f286414h;
    }

    public int securityLimitCount() {
        return 3;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }

    public void setSecurityCheckError(y$$c y__c) {
    }
}
