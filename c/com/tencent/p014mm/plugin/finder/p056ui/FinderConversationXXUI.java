package com.tencent.p014mm.plugin.finder.p056ui;

import androidx.fragment.app.Fragment;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderConversationXXUI;", "Lcom/tencent/mm/plugin/finder/ui/FinderConversationParentUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderConversationXXUI */
public final class FinderConversationXXUI extends FinderConversationParentUI {
    /* renamed from: N7 */
    public Fragment mo4019N7() {
        return new FinderSayHiConvFragment();
    }

    /* renamed from: O7 */
    public String mo2965O7() {
        String string = getString(C0966R.string.d4l);
        C87412m.m108593f(string, "this.getString(R.string.…tion_hello_message_title)");
        return string;
    }
}
