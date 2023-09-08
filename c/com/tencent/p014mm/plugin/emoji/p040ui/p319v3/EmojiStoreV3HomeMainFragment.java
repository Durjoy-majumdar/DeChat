package com.tencent.p014mm.plugin.emoji.p040ui.p319v3;

import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import kotlin.Metadata;
import q61.C101037a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeMainFragment;", "Lcom/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment;", "<init>", "()V", "plugin-emoji_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeMainFragment */
public final class EmojiStoreV3HomeMainFragment extends EmojiStoreV3HomeBaseFragment {

    /* renamed from: D */
    public boolean f269018D;

    /* renamed from: N */
    public int mo127888N() {
        return 6910;
    }

    /* renamed from: P */
    public boolean mo127890P() {
        return true;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ckd;
    }

    public void onCreate(Bundle bundle) {
        C101037a.f295825a = System.currentTimeMillis();
        super.onCreate(bundle);
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (!this.f269018D && z) {
            this.f269018D = true;
            C115669n.INSTANCE.mo160131h(12740, 4, "", "", "", 1, 1);
        }
    }
}
