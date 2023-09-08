package ui2;

import android.widget.Filter;
import android.widget.FrameLayout;
import android.widget.ListView;
import com.tencent.p014mm.plugin.remittance.bankcard.p096ui.BankRemitBankcardInputUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import kg3.C76577a;

/* renamed from: ui2.b */
public class C78168b implements Filter.FilterListener {

    /* renamed from: d */
    public final /* synthetic */ BankRemitBankcardInputUI f229017d;

    public C78168b(BankRemitBankcardInputUI bankRemitBankcardInputUI) {
        this.f229017d = bankRemitBankcardInputUI;
    }

    public void onFilterComplete(int i) {
        Log.m105925i("MicroMsg.BankRemitBankcardInputUI", "filter complete: %d", Integer.valueOf(i));
        ListView listView = this.f229017d.f203736p;
        if (listView == null) {
            return;
        }
        if (i > 0) {
            if (i == 1) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) listView.getLayoutParams();
                layoutParams.height = C76577a.m92151b(this.f229017d.getContext(), 68);
                this.f229017d.f203736p.setLayoutParams(layoutParams);
            } else {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) listView.getLayoutParams();
                layoutParams2.height = C76577a.m92151b(this.f229017d.getContext(), 136);
                this.f229017d.f203736p.setLayoutParams(layoutParams2);
            }
            this.f229017d.f203736p.setVisibility(0);
        } else if (i <= 0 && listView.getVisibility() == 0) {
            this.f229017d.f203736p.setVisibility(8);
        }
    }
}
