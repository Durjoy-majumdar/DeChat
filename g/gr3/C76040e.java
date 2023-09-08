package gr3;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tenpay.android.wechat.TenpaySecureEditText;
import nj3.C76879j;

/* renamed from: gr3.e */
public class C76040e {

    /* renamed from: gr3.e$a */
    public class C76041a implements DialogInterface.OnClickListener {
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: a */
    public static void m91344a(TenpaySecureEditText tenpaySecureEditText, int i, boolean z) {
        if (tenpaySecureEditText == null) {
            Log.m105920e("MicroMsg.FormatViewUtil", "hy: param error: no edit text view");
        } else if (i == 1) {
            tenpaySecureEditText.setIsPasswordFormat(true, z);
        } else if (i == 2) {
            tenpaySecureEditText.setIsSecurityAnswerFormat(true);
        } else if (i == 3) {
            tenpaySecureEditText.setIsCvvPaymentFormat(true);
        } else if (i == 4) {
            tenpaySecureEditText.setIsCvv4PaymentFormat(true);
        } else if (i == 5) {
            tenpaySecureEditText.setIsValidThru(true);
        } else if (i == 6) {
            tenpaySecureEditText.setIsBankcardFormat(true);
        } else if (i == 7) {
            tenpaySecureEditText.setIsMoneyAmountFormat(true);
        } else if (i == 8) {
            tenpaySecureEditText.setIsIdCardTailFormat(true);
        } else {
            tenpaySecureEditText.setIsCvv4PaymentFormat(false);
        }
    }

    /* renamed from: b */
    public static void m91345b(MMActivity mMActivity, int i, int i2) {
        if (i != -1) {
            mMActivity.addDialog(C76879j.m92752w(mMActivity, mMActivity.getResources().getString(i2), mMActivity.getResources().getString(C0966R.string.ktq), ((LayoutInflater) mMActivity.getSystemService("layout_inflater")).inflate(i, (ViewGroup) null), new C76041a()));
        }
    }
}
