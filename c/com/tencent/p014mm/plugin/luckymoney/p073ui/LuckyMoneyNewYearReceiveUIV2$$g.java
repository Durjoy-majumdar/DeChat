package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.widget.ImageView;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import di3.C86312j;
import p008bq.C39833l0;
import p008bq.C67303a1;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2$$g */
public class LuckyMoneyNewYearReceiveUIV2$$g implements C39833l0.C39834a {

    /* renamed from: a */
    public final /* synthetic */ LuckyMoneyNewYearReceiveUIV2 f200181a;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2$$g$a */
    public class C69433a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ IEmojiInfo f200182d;

        /* renamed from: e */
        public final /* synthetic */ boolean f200183e;

        public C69433a(IEmojiInfo iEmojiInfo, boolean z) {
            this.f200182d = iEmojiInfo;
            this.f200183e = z;
        }

        public void run() {
            IEmojiInfo iEmojiInfo;
            if (this.f200182d != null && (iEmojiInfo = LuckyMoneyNewYearReceiveUIV2$$g.this.f200181a.f200117N) != null && iEmojiInfo.getMd5().equals(this.f200182d.getMd5())) {
                if (this.f200183e) {
                    Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "somethings success.");
                    LuckyMoneyNewYearReceiveUIV2$$g.this.f200181a.f200117N = ((C67303a1) C86312j.m106911c(C67303a1.class)).mo55768r2(LuckyMoneyNewYearReceiveUIV2$$g.this.f200181a.f200117N.getMd5());
                    LuckyMoneyNewYearReceiveUIV2$$g.this.f200181a.f200167v.setVisibility(8);
                    LuckyMoneyNewYearReceiveUIV2$$g.this.f200181a.f200110G.setVisibility(0);
                    LuckyMoneyNewYearReceiveUIV2$$g.this.f200181a.f200110G.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2 = LuckyMoneyNewYearReceiveUIV2$$g.this.f200181a;
                    luckyMoneyNewYearReceiveUIV2.f200110G.setEmojiInfo(luckyMoneyNewYearReceiveUIV2.f200117N);
                    return;
                }
                Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "somethings error.");
                LuckyMoneyNewYearReceiveUIV2$$g.this.f200181a.f200167v.setVisibility(8);
                LuckyMoneyNewYearReceiveUIV2$$g.this.f200181a.f200169x.setVisibility(0);
            }
        }
    }

    public LuckyMoneyNewYearReceiveUIV2$$g(LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2) {
        this.f200181a = luckyMoneyNewYearReceiveUIV2;
    }

    /* renamed from: a */
    public void mo62471a(boolean z, IEmojiInfo iEmojiInfo) {
        MMHandlerThread.postToMainThread(new C69433a(iEmojiInfo, z));
    }
}
