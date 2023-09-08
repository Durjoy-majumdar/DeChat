package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.model.C94945s2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32226l;
import gy3.C24565l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.sns.ui.h0 */
public final class C95798h0 extends C95969j0 {

    /* renamed from: p */
    public final int f279550p = 43;

    /* renamed from: com.tencent.mm.plugin.sns.ui.h0$a */
    public /* synthetic */ class C95799a extends C24565l implements C32226l<String, C94945s2> {
        public C95799a(Object obj) {
            super(1, obj, C94945s2.class, "setObjTitle", "setObjTitle(Ljava/lang/String;)Lcom/tencent/mm/plugin/sns/model/UploadPackHelper;", 0);
        }

        public Object invoke(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.Festival2021Widget$onPrepareCommitPack$1$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.Festival2021Widget$onPrepareCommitPack$1$1");
            C94945s2 s2Var = (C94945s2) this.receiver;
            s2Var.mo131267x((String) obj);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.Festival2021Widget$onPrepareCommitPack$1$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.Festival2021Widget$onPrepareCommitPack$1$1");
            return s2Var;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.h0$b */
    public /* synthetic */ class C95800b extends C24565l implements C32226l<String, C94945s2> {
        public C95800b(Object obj) {
            super(1, obj, C94945s2.class, "setObjUrl", "setObjUrl(Ljava/lang/String;)Lcom/tencent/mm/plugin/sns/model/UploadPackHelper;", 0);
        }

        public Object invoke(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.Festival2021Widget$onPrepareCommitPack$1$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.Festival2021Widget$onPrepareCommitPack$1$2");
            C94945s2 s2Var = (C94945s2) this.receiver;
            s2Var.mo131268y((String) obj);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.Festival2021Widget$onPrepareCommitPack$1$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.Festival2021Widget$onPrepareCommitPack$1$2");
            return s2Var;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.h0$c */
    public static final class C95801c extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C94945s2 f279551d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95801c(C94945s2 s2Var) {
            super(1);
            this.f279551d = s2Var;
        }

        public Object invoke(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.Festival2021Widget$onPrepareCommitPack$1$3");
            String str = (String) obj;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.Festival2021Widget$onPrepareCommitPack$1$3");
            C87412m.m108594g(str, "imgUrl");
            this.f279551d.mo131245b(str, "", "", -1, -1);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.Festival2021Widget$onPrepareCommitPack$1$3");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.Festival2021Widget$onPrepareCommitPack$1$3");
            return b0Var;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95798h0(MMActivity mMActivity) {
        super(mMActivity);
        C87412m.m108594g(mMActivity, "context");
    }

    /* renamed from: k */
    public int mo133250k() {
        SnsMethodCalculate.markStartTimeMs("getSnsType", "com.tencent.mm.plugin.sns.ui.Festival2021Widget");
        int i = this.f279550p;
        SnsMethodCalculate.markEndTimeMs("getSnsType", "com.tencent.mm.plugin.sns.ui.Festival2021Widget");
        return i;
    }

    /* renamed from: l */
    public void mo133251l(MMActivity mMActivity, C94945s2 s2Var) {
        SnsMethodCalculate.markStartTimeMs("onPrepareCommitPack", "com.tencent.mm.plugin.sns.ui.Festival2021Widget");
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(s2Var, "packHelper");
        Intent intent = mMActivity.getIntent();
        C87412m.m108593f(intent, "");
        C95799a aVar = new C95799a(s2Var);
        SnsMethodCalculate.markStartTimeMs("safeGet", "com.tencent.mm.plugin.sns.ui.Festival2021Widget");
        mo133252m(intent, "Ksnsupload_title", new C30467i0(aVar));
        SnsMethodCalculate.markEndTimeMs("safeGet", "com.tencent.mm.plugin.sns.ui.Festival2021Widget");
        C95800b bVar = new C95800b(s2Var);
        SnsMethodCalculate.markStartTimeMs("safeGet", "com.tencent.mm.plugin.sns.ui.Festival2021Widget");
        mo133252m(intent, "Ksnsupload_link", new C30467i0(bVar));
        SnsMethodCalculate.markEndTimeMs("safeGet", "com.tencent.mm.plugin.sns.ui.Festival2021Widget");
        mo133252m(intent, "Ksnsupload_imgurl", new C95801c(s2Var));
        super.mo133251l(mMActivity, s2Var);
        SnsMethodCalculate.markEndTimeMs("onPrepareCommitPack", "com.tencent.mm.plugin.sns.ui.Festival2021Widget");
    }

    /* renamed from: m */
    public final String mo133252m(Intent intent, String str, C32226l<? super String, C13598b0> lVar) {
        SnsMethodCalculate.markStartTimeMs("safeGet", "com.tencent.mm.plugin.sns.ui.Festival2021Widget");
        String stringExtra = intent.getStringExtra(str);
        String str2 = null;
        if (stringExtra != null) {
            if (!(!C112551y.m153811k(stringExtra))) {
                stringExtra = null;
            }
            if (stringExtra != null) {
                lVar.invoke(stringExtra);
                str2 = stringExtra;
            }
        }
        SnsMethodCalculate.markEndTimeMs("safeGet", "com.tencent.mm.plugin.sns.ui.Festival2021Widget");
        return str2;
    }
}
