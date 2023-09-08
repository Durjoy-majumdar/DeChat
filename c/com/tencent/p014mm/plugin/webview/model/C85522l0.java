package com.tencent.p014mm.plugin.webview.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ea3.C7608b;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C48923bx3;
import te3.C90403ax3;

/* renamed from: com.tencent.mm.plugin.webview.model.l0 */
public class C85522l0 extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f249229d;

    /* renamed from: e */
    public C11385n f249230e;

    /* renamed from: f */
    public long f249231f;

    /* renamed from: g */
    public final LinkedList<String> f249232g;

    public C85522l0(int i, String str, String str2, String str3, LinkedList<String> linkedList, int i2, String str4, C89349b bVar, String str5, int i3, C89349b bVar2, Boolean bool, boolean z) {
        String str6 = str;
        String str7 = str3;
        LinkedList<String> linkedList2 = linkedList;
        C89349b bVar3 = bVar;
        String str8 = str5;
        this.f249231f = 0;
        LinkedList<String> linkedList3 = new LinkedList<>();
        this.f249232g = linkedList3;
        C47350c.C47352b bVar4 = new C47350c.C47352b();
        bVar4.f127066a = new C90403ax3();
        bVar4.f127067b = new C48923bx3();
        bVar4.f127068c = "/cgi-bin/mmbiz-bin/sdk_oauth_authorize_confirm";
        bVar4.f127069d = 1346;
        int i4 = 0;
        bVar4.f127070e = 0;
        bVar4.f127071f = 0;
        C47350c a = bVar4.mo72403a();
        this.f249229d = a;
        C90403ax3 ax32 = (C90403ax3) a.f127055a.f127080a;
        ax32.f259419d = i;
        ax32.f259421f = str6;
        ax32.f259420e = linkedList2;
        ax32.f259422g = str2;
        ax32.f259423h = str7;
        ax32.f259424i = i2;
        ax32.f259425j = str4;
        ax32.f259430r = bVar2;
        ax32.f259431s = bool.booleanValue();
        ax32.f259432t = z;
        this.f249231f = System.currentTimeMillis();
        ax32.f259427o = bVar3;
        if (linkedList2 != null) {
            linkedList3.addAll(linkedList2);
        }
        if (str8 != null) {
            ax32.f259428p = str8;
        }
        ax32.f259429q = i3;
        Object[] objArr = new Object[6];
        objArr[0] = str6;
        objArr[1] = str7;
        objArr[2] = Integer.valueOf(bVar3 != null ? bVar3.f257327a.length : i4);
        objArr[3] = str8 != null ? str8 : "";
        objArr[4] = Integer.valueOf(i3);
        objArr[5] = Boolean.valueOf(z);
        Log.m105925i("MicroMsg.NetSceneSDKOauthAuthorizeConfirm", "do sdk confirm appId=%s, packageName=%s, oauthContextBuffer size=%d, token=%s, authenticationResult=%d, isOption1=%b", objArr);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f249231f = System.currentTimeMillis();
        this.f249230e = nVar;
        return dispatch(gVar, this.f249229d, this);
    }

    public int getType() {
        return 1346;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        this.f249230e.onSceneEnd(i2, i3, str, this);
        C7608b.INSTANCE.mo8745b(4, (int) (System.currentTimeMillis() - this.f249231f), i3);
    }

    public C85522l0(int i, String str, String str2, String str3, LinkedList<String> linkedList, int i2, String str4, C89349b bVar, String str5, int i3, boolean z) {
        this(i, str, str2, str3, linkedList, i2, str4, bVar, str5, i3, (C89349b) null, Boolean.FALSE, z);
    }
}
