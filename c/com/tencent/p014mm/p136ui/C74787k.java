package com.tencent.p014mm.p136ui;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import nj3.C76912y0;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;

/* renamed from: com.tencent.mm.ui.k */
public class C74787k implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ LinkedList f219909d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandNotifySettingsUI f219910e;

    public C74787k(AppBrandNotifySettingsUI appBrandNotifySettingsUI, LinkedList linkedList) {
        this.f219910e = appBrandNotifySettingsUI;
        this.f219909d = linkedList;
    }

    /* renamed from: a */
    public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        Log.m105919d("MicroMsg.AppBrandNotifySettingsUI", "setReceiveOff errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i == 0 && i2 == 0) {
            AppBrandNotifySettingsUI.m85889H7(this.f219910e, this.f219909d);
            return 0;
        }
        C76912y0.makeText((Context) this.f219910e, (int) C0966R.string.hdg, 0).show();
        return 0;
    }
}
