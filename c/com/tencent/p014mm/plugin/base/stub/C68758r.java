package com.tencent.p014mm.plugin.base.stub;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C86493v0;
import java.util.List;
import nj3.C76912y0;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import te3.C52198z10;

/* renamed from: com.tencent.mm.plugin.base.stub.r */
public class C68758r implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ C117747y f197510d;

    /* renamed from: e */
    public final /* synthetic */ WXEntryActivity f197511e;

    public C68758r(WXEntryActivity wXEntryActivity, C117747y yVar) {
        this.f197511e = wXEntryActivity;
        this.f197510d = yVar;
    }

    /* renamed from: a */
    public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        Log.m105924i("MicroMsg.WXEntryActivity", "callback() called with: errType = [" + i + "], errCode = [" + i2 + "], errMsg = [" + str + "], rr = [" + cVar + "], scene = [" + yVar + "]");
        if (this.f197511e.f197462v.get() != null && !this.f197511e.f197462v.get().isFinishing()) {
            this.f197511e.f197462v.get().mo94561O7();
            if (i == 0 && i2 == 0) {
                WXEntryActivity wXEntryActivity = this.f197511e.f197462v.get();
                C117747y yVar2 = this.f197510d;
                wXEntryActivity.getClass();
                C52198z10 z102 = (C52198z10) cVar.f127056b.f127083a;
                if (z102 != null && !Util.isNullOrNil((List) z102.f145629d)) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= z102.f145629d.size()) {
                            C86493v0.m107224d().mo120947c("kWXEntryActivity_data_center_session_id", true).mo120962i("kWXEntryActivity_data_center_wework_msg_list", z102.f145629d);
                            wXEntryActivity.mo94559M7(yVar2, (Bundle) null);
                            break;
                        } else if (z102.f145629d.get(i3).f131455g != 0) {
                            AppCompatActivity context = wXEntryActivity.getContext();
                            C76912y0.m92773l(context, "解析错误，type:" + z102.f145629d.get(i3).f131453e);
                            break;
                        } else {
                            i3++;
                        }
                    }
                } else {
                    wXEntryActivity.mo94568W7("");
                }
                return 0;
            }
            this.f197511e.f197462v.get().mo94564S7(i, i2, str);
        }
        return 0;
    }
}
