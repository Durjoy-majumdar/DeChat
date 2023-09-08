package h21;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.edittext.PasterEditText;
import com.tencent.p014mm.plugin.collect.p038ui.WalletCollectQrCodeUI;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import e21.C116673y0;
import e21.C75489r;
import te3.C48745ap;

/* renamed from: h21.d1 */
public class C117016d1 implements C75489r.C75490a {

    /* renamed from: a */
    public final /* synthetic */ C48745ap f350664a;

    /* renamed from: b */
    public final /* synthetic */ C116673y0.C116674b f350665b;

    /* renamed from: c */
    public final /* synthetic */ WalletCollectQrCodeUI f350666c;

    /* renamed from: h21.d1$a */
    public class C117017a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ PasterEditText f350667d;

        public C117017a(PasterEditText pasterEditText) {
            this.f350667d = pasterEditText;
        }

        public void run() {
            this.f350667d.requestFocus();
            ((InputMethodManager) C117016d1.this.f350666c.getContext().getSystemService("input_method")).showSoftInput(this.f350667d, 0);
        }
    }

    /* renamed from: h21.d1$b */
    public class C117018b implements Runnable {
        public C117018b() {
        }

        public void run() {
            C117016d1.this.f350666c.hideVKB();
            ((InputMethodManager) C117016d1.this.f350666c.getSystemService("input_method")).hideSoftInputFromWindow(C117016d1.this.f350666c.f345678I.getWindowToken(), 0);
        }
    }

    public C117016d1(WalletCollectQrCodeUI walletCollectQrCodeUI, C48745ap apVar, C116673y0.C116674b bVar) {
        this.f350666c = walletCollectQrCodeUI;
        this.f350664a = apVar;
        this.f350665b = bVar;
    }

    /* renamed from: a */
    public void mo105819a(View view, int i) {
        View view2 = this.f350666c.f345678I;
        if (view2 != null) {
            LinearLayout linearLayout = (LinearLayout) view2.findViewById(C0966R.C0970id.bhk);
            ((LinearLayout) this.f350666c.f345678I.findViewById(C0966R.C0970id.g58)).setVisibility(4);
            ((LinearLayout) this.f350666c.f345678I.findViewById(C0966R.C0970id.bhk)).setContentDescription(MMApplicationContext.getContext().getString(C0966R.string.m9p, new Object[]{((TextView) this.f350666c.f345678I.findViewById(C0966R.C0970id.gzh)).getText()}));
        }
        ((LinearLayout) view.findViewById(C0966R.C0970id.g58)).setVisibility(0);
        if (i == this.f350664a.f130703f.size()) {
            this.f350666c.f345684P = true;
            LinearLayout linearLayout2 = (LinearLayout) view.findViewById(C0966R.C0970id.f357733gk3);
            linearLayout2.setVisibility(0);
            PasterEditText pasterEditText = (PasterEditText) linearLayout2.findViewById(C0966R.C0970id.g59);
            pasterEditText.postDelayed(new C117017a(pasterEditText), 50);
            this.f350666c.f345677H.mo140656b(!Util.isNullOrNil(pasterEditText.getText().toString()));
            WalletCollectQrCodeUI walletCollectQrCodeUI = this.f350666c;
            if (!walletCollectQrCodeUI.f345683N) {
                walletCollectQrCodeUI.f345682M = walletCollectQrCodeUI.f345677H.f296384g.getMeasuredHeight();
            }
        } else {
            WalletCollectQrCodeUI walletCollectQrCodeUI2 = this.f350666c;
            walletCollectQrCodeUI2.f345684P = false;
            View view3 = walletCollectQrCodeUI2.f345678I;
            if (view3 != null) {
                LinearLayout linearLayout3 = (LinearLayout) view3.findViewById(C0966R.C0970id.f357733gk3);
                if (linearLayout3.getVisibility() == 0) {
                    linearLayout3.setVisibility(8);
                    linearLayout3.clearFocus();
                    linearLayout3.postDelayed(new C117018b(), 200);
                }
                ((LinearLayout) view.findViewById(C0966R.C0970id.bhk)).setContentDescription(MMApplicationContext.getContext().getString(C0966R.string.m9q, new Object[]{this.f350665b.f349845L}));
            }
            this.f350666c.f345677H.mo140656b(true);
            this.f350665b.f349845L = this.f350664a.f130703f.get(i).f134707d;
            WalletCollectQrCodeUI walletCollectQrCodeUI3 = this.f350666c;
            if (!walletCollectQrCodeUI3.f345683N) {
                walletCollectQrCodeUI3.f345681L = walletCollectQrCodeUI3.f345677H.f296384g.getMeasuredHeight();
            }
        }
        this.f350666c.f345678I = view;
    }
}
