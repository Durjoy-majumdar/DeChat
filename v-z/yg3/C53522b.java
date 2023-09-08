package yg3;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.p136ui.C85978w1;
import gy3.C87412m;
import ke3.C88144b;

/* renamed from: yg3.b */
public final class C53522b implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ IEmojiInfo f150488d;

    /* renamed from: e */
    public final /* synthetic */ Context f150489e;

    public C53522b(IEmojiInfo iEmojiInfo, Context context) {
        this.f150488d = iEmojiInfo;
        this.f150489e = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent();
        intent.putExtra("extra_id", this.f150488d.getGroupId());
        intent.putExtra("preceding_scence", 20);
        Context context = this.f150489e;
        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMContextThemeWrapper");
        C88144b.m109791i(((C85978w1) context).getBaseContext(), "emoji", ".ui.EmojiStoreDetailUI", intent, (Bundle) null);
        dialogInterface.cancel();
    }
}
