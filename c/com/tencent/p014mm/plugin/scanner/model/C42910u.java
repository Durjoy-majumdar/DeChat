package com.tencent.p014mm.plugin.scanner.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.scanner.C5177x;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$d;
import te3.C51107rh;
import te3.C51242sh;
import te3.C51694vh;

/* renamed from: com.tencent.mm.plugin.scanner.model.u */
public class C42910u extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f116187d;

    /* renamed from: e */
    public C47350c f116188e;

    /* renamed from: f */
    public int f116189f;

    /* renamed from: g */
    public boolean f116190g = false;

    public C42910u(int i, String str, int i2, int i3, int i4, C51694vh vhVar) {
        int i5;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51107rh();
        bVar.f127067b = new C51242sh();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/usrmsg/bizscanbarcode";
        bVar.f127069d = 1061;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f116188e = a;
        C51107rh rhVar = (C51107rh) a.f127055a.f127080a;
        rhVar.f140912d = i;
        rhVar.f140913e = str;
        if (!(i4 == 1 || i4 == 2)) {
            if (i4 == 3) {
                i5 = 2;
            } else if (i4 == 4) {
                i5 = 3;
            } else if (i4 != 5) {
                i5 = 0;
            }
            rhVar.f140914f = i5;
            rhVar.f140915g = i3;
            rhVar.f140916h = vhVar;
            this.f116189f = i2;
            Log.m105919d("MicroMsg.scanner.NetSceneScanBarcode", "NetSceneScanBarcode, codeType: %s, barcode: %s, codeVersion: %s, mode: %d, entryScene: %d, scene: %d", Integer.valueOf(i), str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(rhVar.f140914f));
        }
        i5 = 1;
        rhVar.f140914f = i5;
        rhVar.f140915g = i3;
        rhVar.f140916h = vhVar;
        this.f116189f = i2;
        Log.m105919d("MicroMsg.scanner.NetSceneScanBarcode", "NetSceneScanBarcode, codeType: %s, barcode: %s, codeVersion: %s, mode: %d, entryScene: %d, scene: %d", Integer.valueOf(i), str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(rhVar.f140914f));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f116187d = nVar;
        return dispatch(gVar, this.f116188e, this);
    }

    public int getType() {
        return 1061;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.scanner.NetSceneScanBarcode", "onGYNetEnd errtype:" + i2 + " errcode:" + i3 + " errMsg:" + str);
        this.f116187d.onSceneEnd(i2, i3, str, this);
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        String str;
        C51107rh rhVar = (C51107rh) ((C47350c) uVar).f127055a.f127080a;
        if (rhVar.f140912d >= 0 && (str = rhVar.f140913e) != null && str.length() > 0) {
            return y$$d.EOk;
        }
        Log.m105920e("MicroMsg.scanner.NetSceneScanBarcode", "securityVerificationChecked failed, Type = " + rhVar.f140912d + ", Barcode = %s" + rhVar.f140913e);
        return y$$d.EFailed;
    }

    public C42910u(String str, String str2, int i, int i2, int i3, C51694vh vhVar) {
        int i4;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51107rh();
        bVar.f127067b = new C51242sh();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/usrmsg/bizscanbarcode";
        bVar.f127069d = 1061;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f116188e = a;
        C51107rh rhVar = (C51107rh) a.f127055a.f127080a;
        int a2 = C5177x.m5204a(str);
        rhVar.f140912d = a2;
        rhVar.f140913e = str2;
        if (!(i3 == 1 || i3 == 2)) {
            if (i3 == 3) {
                i4 = 2;
            } else if (i3 == 4) {
                i4 = 3;
            } else if (i3 != 5) {
                i4 = 0;
            }
            rhVar.f140914f = i4;
            rhVar.f140915g = i2;
            rhVar.f140916h = vhVar;
            this.f116189f = i;
            Log.m105919d("MicroMsg.scanner.NetSceneScanBarcode", "NetSceneScanBarcode, codeType: %s, barcode: %s, codeName: %s, codeVersion: %s, mode: %d, entryScene: %d, scene: %d", Integer.valueOf(a2), str2, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(rhVar.f140914f));
        }
        i4 = 1;
        rhVar.f140914f = i4;
        rhVar.f140915g = i2;
        rhVar.f140916h = vhVar;
        this.f116189f = i;
        Log.m105919d("MicroMsg.scanner.NetSceneScanBarcode", "NetSceneScanBarcode, codeType: %s, barcode: %s, codeName: %s, codeVersion: %s, mode: %d, entryScene: %d, scene: %d", Integer.valueOf(a2), str2, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(rhVar.f140914f));
    }
}
