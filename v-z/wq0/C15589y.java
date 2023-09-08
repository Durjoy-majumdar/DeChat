package wq0;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import cy3.C86157m;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.io.StringReader;
import java.util.LinkedList;
import rx3.C13598b0;
import z04.C112550d0;

/* renamed from: wq0.y */
public final class C15589y {

    /* renamed from: a */
    public static final LinkedList<String> f42222a = new LinkedList<>();

    /* renamed from: wq0.y$a */
    public static final class C15590a extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public static final C15590a f42223d = new C15590a();

        public C15590a() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, LocaleUtil.ITALIAN);
            String obj2 = C112550d0.m153799i0(str).toString();
            if (obj2.length() > 0) {
                C15589y.f42222a.add(obj2);
            }
            return C13598b0.f38549a;
        }
    }

    static {
        C86157m.m106665a(new StringReader("requestPayment\nrequestPaymentToBank\nsendBizRedPacket\nrequestVirtualPayment\nopenOfflinePayView\nopenWCPayCardList\nrequestMallPayment\nopenWCPayLQTDetail\nopenWCPayLQTSave\nopenWCPayLQTDepositPlan\nopenWCPayLQTDepositPlanAdd\nsetCurrentPaySpeech\nloadPaySpeechDialectConfig\nopenWCPayOverseaPaymentReceive\nhandleWCPayOverseaWalletBuffer\nrequestH5Transaction\nrequestJointPayment\ngetWCPayOverseaPrepayRequest\nrequestVerifyUserIdentity\nopenSelectPayment\nrequestEntrustAuthorization\nrequestPayCardVerify\nrequestBizSplitBillPayment\nrequestQueryCashier\n\nsendRedPacket\nopenRedPacket\nopenWCCardHomePage\nopenWCCertHomePage\nhandleWCPayOverseaWalletBuffer\ngetWCPayOverseaPrepayRequest\nrequestMidasFriendPayment\nrequestFacetoFacePayment"), C15590a.f42223d);
    }
}
