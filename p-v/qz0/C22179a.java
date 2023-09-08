package qz0;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.card.sharecard.p317ui.CardConsumeSuccessUI;

/* renamed from: qz0.a */
public class C22179a implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CardConsumeSuccessUI f62706d;

    public C22179a(CardConsumeSuccessUI cardConsumeSuccessUI) {
        this.f62706d = cardConsumeSuccessUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        CardConsumeSuccessUI cardConsumeSuccessUI = this.f62706d;
        int i2 = CardConsumeSuccessUI.f51637F;
        cardConsumeSuccessUI.mo23316J7(0);
        this.f62706d.finish();
    }
}
