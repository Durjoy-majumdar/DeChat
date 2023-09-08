package com.tencent.p014mm.plugin.sns.p106ui;

import android.graphics.BitmapFactory;
import com.tencent.p014mm.app.C92461m;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import p823sg.C90193h;
import tc2.C118418g;
import te3.C101804kv2;

/* renamed from: com.tencent.mm.plugin.sns.ui.m0 */
public class C96063m0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FlipView f280480d;

    public C96063m0(FlipView flipView) {
        this.f280480d = flipView;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.FlipView$6");
        try {
            C101804kv2 cntMedia = this.f280480d.getCntMedia();
            SnsInfo SE = C94866e1.Yx0().mo139806SE(this.f280480d.getSnsId());
            if (SE == null) {
                Log.m105921e("MicroMsg.FlipView", "[-] Fail to get snsInfo. snsId:%s", Long.valueOf(this.f280480d.getSnsId()));
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.FlipView$6");
                return;
            }
            String m = C94901o.m120385m(cntMedia);
            if (m == null) {
                Log.m105921e("MicroMsg.FlipView", "[-] Fail to get path of media obj. snsLocalId:%s, snsId:%s, username:%s", SE.getLocalid(), SE.getSnsId(), SE.getUserName());
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.FlipView$6");
                return;
            }
            BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(m);
            if (imageOptions == null) {
                Log.m105921e("MicroMsg.FlipView", "[-] Fail to get bmp opts of media obj. snsLocalId:%s, snsId:%s, username:%s", SE.getLocalid(), SE.getSnsId(), SE.getUserName());
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.FlipView$6");
                return;
            }
            String[] WN = C118418g.INSTANCE.mo175804WN(m);
            String str = WN != null ? WN[0] : "";
            C92461m.C92464c cVar = new C92461m.C92464c(3, C92461m.C92463b.IMAGE, (C92461m.C92462a) null);
            cVar.f264626b = SE.getUserName();
            cVar.f264628d = SE.field_snsId;
            cVar.f264630f = cntMedia.f298692g;
            cVar.f264631g = imageOptions.outWidth;
            cVar.f264632h = imageOptions.outHeight;
            cVar.f264633i = cntMedia.f298694i;
            cVar.f264637m = C90193h.m112876d(m);
            cVar.f264638n = str;
            C92461m.m116308a(cVar);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.FlipView$6");
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.FlipView", th, "[-] Exception was thrown when report.", new Object[0]);
        }
    }
}
