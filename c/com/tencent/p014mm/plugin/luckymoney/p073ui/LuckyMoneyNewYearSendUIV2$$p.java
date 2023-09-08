package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelcdntran.C55384i;
import com.tencent.p014mm.plugin.luckymoney.model.C69218g1;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyVoiceLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import java.lang.ref.WeakReference;
import nj3.C76912y0;
import p1081gi.C98124g;
import p663qo.C77384i;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2$$p */
public class LuckyMoneyNewYearSendUIV2$$p implements LuckyMoneyVoiceLayout.C69548f {

    /* renamed from: a */
    public final /* synthetic */ LuckyMoneyNewYearSendUIV2 f200388a;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2$$p$a */
    public class C69451a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f200389d;

        /* renamed from: e */
        public final /* synthetic */ String f200390e;

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2$$p$a$a */
        public class C69452a implements Runnable {
            public C69452a() {
            }

            public void run() {
                C76912y0.m92769h(LuckyMoneyNewYearSendUIV2$$p.this.f200388a.getContext(), LuckyMoneyNewYearSendUIV2$$p.this.f200388a.getContext().getResources().getString(C0966R.string.nf6), C0966R.raw.voice_to_short);
            }
        }

        public C69451a(int i, String str) {
            this.f200389d = i;
            this.f200390e = str;
        }

        public void run() {
            LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = LuckyMoneyNewYearSendUIV2$$p.this.f200388a;
            boolean z = true;
            luckyMoneyNewYearSendUIV2.f200285J1 = 1;
            luckyMoneyNewYearSendUIV2.f200273D1 = 4;
            if (!luckyMoneyNewYearSendUIV2.f200294O1.stopped()) {
                LuckyMoneyNewYearSendUIV2$$p.this.f200388a.f200294O1.stopTimer();
            }
            int i = this.f200389d;
            if (i == 1 || i == 3) {
                C76912y0.m92773l(LuckyMoneyNewYearSendUIV2$$p.this.f200388a.getContext(), LuckyMoneyNewYearSendUIV2$$p.this.f200388a.getContext().getResources().getString(C0966R.string.ney));
            } else if (i == 2) {
                LuckyMoneyNewYearSendUIV2$$p.this.f200388a.f200330h.postDelayed(new C69452a(), 380);
            } else {
                LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV22 = LuckyMoneyNewYearSendUIV2$$p.this.f200388a;
                luckyMoneyNewYearSendUIV22.f200285J1 = 3;
                String str = this.f200390e;
                luckyMoneyNewYearSendUIV22.f200362x1 = str;
                C55384i iVar = luckyMoneyNewYearSendUIV22.f200293N1;
                String str2 = C69218g1.f199176a;
                C98124g gVar = new C98124g();
                gVar.f287660d = "task_uploadVoice";
                gVar.field_fileType = 15;
                gVar.field_fullpath = str;
                gVar.field_mediaId = "VoiceData" + str;
                gVar.field_totalLen = (int) C86013q1.m106451l(gVar.field_fullpath);
                gVar.field_chattype = 0;
                Log.m105925i("MicroMsg.LuckyMoneyNewYearLogic", "uploadVoiceFile %s %s %s", gVar.field_mediaId, gVar.field_fullpath, gVar.field_aesKey);
                if (((C77384i) C86312j.m106911c(C77384i.class)).mo107507vL(gVar, new WeakReference(iVar)) == null) {
                    z = false;
                }
                if (z) {
                    LuckyMoneyNewYearSendUIV2$$p.this.f200388a.f200273D1 = 2;
                } else {
                    Log.m105920e("MicroMsg.LuckyMoneyNewYearSendUIV2", "cdn upload fail");
                    LuckyMoneyNewYearSendUIV2$$p.this.f200388a.f200273D1 = 4;
                }
                LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV23 = LuckyMoneyNewYearSendUIV2$$p.this.f200388a;
                luckyMoneyNewYearSendUIV23.mo95673V7(13, luckyMoneyNewYearSendUIV23.f200290M.getUseTime());
            }
            LuckyMoneyNewYearSendUIV2$$p.this.f200388a.mo95681d8();
        }
    }

    public LuckyMoneyNewYearSendUIV2$$p(LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f200388a = luckyMoneyNewYearSendUIV2;
    }

    /* renamed from: a */
    public void mo95692a(int i, String str) {
        Log.m105925i("MicroMsg.LuckyMoneyNewYearSendUIV2", "onDetectStop ret:%s useTime:%s filePath:%s", Integer.valueOf(i), Long.valueOf(this.f200388a.f200290M.getUseTime()), str);
        View view = this.f200388a.f200330h;
        if (view != null) {
            view.post(new C69451a(i, str));
        }
    }
}
