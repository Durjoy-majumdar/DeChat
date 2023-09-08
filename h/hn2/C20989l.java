package hn2;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import p274xx.C15907f;
import te3.C52238za0;
import xm2.C23109g;

/* renamed from: hn2.l */
public class C20989l implements C23109g {

    /* renamed from: a */
    public final /* synthetic */ C15907f.C15909b f59429a;

    public C20989l(C15907f.C15909b bVar) {
        this.f59429a = bVar;
    }

    /* renamed from: a */
    public void mo24594a(Context context, boolean z, C52238za0 za02) {
        if (za02 == null || !z) {
            Log.m105924i("MicroMsg.SafeSwitchTipDialog", "doSave. response = success");
            this.f59429a.mo6380a();
            return;
        }
        Log.m105924i("MicroMsg.SafeSwitchTipDialog", "doSave. response = fail");
        this.f59429a.onSuccess();
    }
}
