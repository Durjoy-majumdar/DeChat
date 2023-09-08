package com.tencent.p014mm.modelsimple;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75592q0;
import f40.C86709a0;
import junit.framework.Assert;
import ob0.C11385n;
import ob0.C117747y;
import p154fy.C8217g;
import qe3.C47820w0;
import te3.C51035qz3;

/* renamed from: com.tencent.mm.modelsimple.e0 */
public class C40357e0 extends C117747y implements C1311n, C8217g {

    /* renamed from: d */
    public C11385n f108453d;

    /* renamed from: e */
    public final C114799u f108454e;

    public C40357e0(int i, String str, String str2) {
        C40362l lVar = new C40362l();
        this.f108454e = lVar;
        C47820w0 w0Var = (C47820w0) lVar.getReqObj();
        w0Var.f128384a.f140624d = C75592q0.m90789s();
        C51035qz3 qz32 = w0Var.f128384a;
        StringBuilder sb = new StringBuilder();
        sb.append(i == 0 ? 64 : i);
        sb.append(";");
        sb.append(str == null ? "" : str);
        qz32.f140625e = sb.toString();
        Log.m105918d("MicroMsg.NetSceneSendCard", "content:" + w0Var.f128384a.f140625e);
        Assert.assertTrue("empty sendcard", true);
        w0Var.f128384a.f140626f = 64;
        if (str2 != null && str2.length() > 0) {
            w0Var.f128384a.f140628h = str2;
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f108453d = nVar;
        return dispatch(gVar, this.f108454e, this);
    }

    public int getType() {
        return 26;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        updateDispatchId(i);
        this.f108453d.onSceneEnd(i2, i3, uVar.getRespObj().getErrMsg(), this);
    }

    public C40357e0(String str) {
        C40362l lVar = new C40362l();
        this.f108454e = lVar;
        C47820w0 w0Var = (C47820w0) lVar.getReqObj();
        w0Var.f128384a.f140624d = C75592q0.m90789s();
        w0Var.f128384a.f140625e = str;
        Log.m105918d("MicroMsg.NetSceneSendCard", "content:" + str);
        w0Var.f128384a.f140627g = Util.nullAsNil((Integer) C86709a0.m107535s().mo121142i().mo119683d(66561));
        Assert.assertTrue("empty sendcard", true);
        w0Var.f128384a.f140626f = 128;
    }

    public C40357e0(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        C40362l lVar = new C40362l();
        this.f108454e = lVar;
        C47820w0 w0Var = (C47820w0) lVar.getReqObj();
        w0Var.f128384a.f140624d = C75592q0.m90789s();
        w0Var.f128384a.f140625e = str;
        Log.m105918d("MicroMsg.NetSceneSendCard", "content:" + str);
        w0Var.f128384a.f140627g = Util.nullAsNil((Integer) C86709a0.m107535s().mo121142i().mo119683d(66561));
        boolean z5 = false;
        boolean z6 = z | false | (z2 ? (char) 2 : 0) | (z3 ? (char) 4 : 0) | (z4 ? (char) 8 : 0);
        Assert.assertTrue("empty sendcard", z6 ? true : z5);
        w0Var.f128384a.f140626f = z6 ? 1 : 0;
    }
}
