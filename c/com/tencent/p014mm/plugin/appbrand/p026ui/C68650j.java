package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.UpdateAppBrandNotifyMessageEvent;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import nj3.C76912y0;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import te3.C49795i34;
import te3.s65;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.j */
public class C68650j implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ CheckBoxPreference f197201d;

    /* renamed from: e */
    public final /* synthetic */ LinkedList f197202e;

    /* renamed from: f */
    public final /* synthetic */ String f197203f;

    /* renamed from: g */
    public final /* synthetic */ AppBrandAuthorizeUI f197204g;

    public C68650j(AppBrandAuthorizeUI appBrandAuthorizeUI, CheckBoxPreference checkBoxPreference, LinkedList linkedList, String str) {
        this.f197204g = appBrandAuthorizeUI;
        this.f197201d = checkBoxPreference;
        this.f197202e = linkedList;
        this.f197203f = str;
    }

    /* renamed from: a */
    public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        Log.m105919d("MicroMsg.AppBrandAuthorizeUI", "setReceiveOff errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i == 0 && i2 == 0) {
            if (((C49795i34) cVar.f127056b.f127083a) == null) {
                Log.m105920e("MicroMsg.AppBrandAuthorizeUI", "setReceiveOff failed, response is null!");
            }
            for (int i3 = 0; i3 < this.f197202e.size(); i3++) {
                s65 s65 = (s65) this.f197202e.get(i3);
                if (s65 == null) {
                    Log.m105928w("MicroMsg.AppBrandAuthorizeUI", "scene end, item is null");
                } else {
                    UpdateAppBrandNotifyMessageEvent updateAppBrandNotifyMessageEvent = new UpdateAppBrandNotifyMessageEvent();
                    UpdateAppBrandNotifyMessageEvent.C67804a aVar = updateAppBrandNotifyMessageEvent.f193976d;
                    aVar.f193977a = this.f197203f;
                    aVar.f193978b = s65.f141353e == 0;
                    updateAppBrandNotifyMessageEvent.publish();
                }
            }
            AppBrandAuthorizeUI.m18563J7(this.f197204g);
            return 0;
        }
        AppBrandAuthorizeUI.m18563J7(this.f197204g);
        AppBrandAuthorizeUI appBrandAuthorizeUI = this.f197204g;
        C76912y0.makeText((Context) appBrandAuthorizeUI, (CharSequence) appBrandAuthorizeUI.getString(C0966R.string.f360087a11), 1).show();
        CheckBoxPreference checkBoxPreference = this.f197201d;
        checkBoxPreference.mo6805K(!checkBoxPreference.mo6804J());
        return 0;
    }
}
