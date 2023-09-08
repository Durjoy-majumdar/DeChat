package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Intent;
import com.tencent.p014mm.p136ui.tools.C45059m0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.MMHandler;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$$f */
public class SnsOnlineVideoActivity$$f implements C45059m0.C45068i {

    /* renamed from: a */
    public final /* synthetic */ SnsOnlineVideoActivity f278427a;

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$$f$a */
    public class C95594a implements Runnable {
        public C95594a() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$15$1");
            Intent intent = new Intent();
            SnsOnlineVideoActivity snsOnlineVideoActivity = SnsOnlineVideoActivity$$f.this.f278427a;
            int i = SnsOnlineVideoActivity.f278370y0;
            SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            boolean z = snsOnlineVideoActivity.f278376F;
            SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            intent.putExtra("sns_update_preview_video_del", z);
            SnsOnlineVideoActivity$$f.this.f278427a.setResult(-1, intent);
            SnsOnlineVideoActivity snsOnlineVideoActivity2 = SnsOnlineVideoActivity$$f.this.f278427a;
            SnsMethodCalculate.markStartTimeMs("access$3002", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            snsOnlineVideoActivity2.f278384N = true;
            SnsMethodCalculate.markEndTimeMs("access$3002", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            SnsOnlineVideoActivity$$f.this.f278427a.finish();
            SnsOnlineVideoActivity$$f.this.f278427a.overridePendingTransition(0, 0);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$15$1");
        }
    }

    public SnsOnlineVideoActivity$$f(SnsOnlineVideoActivity snsOnlineVideoActivity) {
        this.f278427a = snsOnlineVideoActivity;
    }

    public void onAnimationEnd() {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$15");
        new MMHandler().post(new C95594a());
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$15");
    }

    public void onAnimationStart() {
        SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$15");
        SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$15");
    }
}
