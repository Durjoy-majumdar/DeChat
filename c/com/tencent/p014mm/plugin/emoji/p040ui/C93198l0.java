package com.tencent.p014mm.plugin.emoji.p040ui;

import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.storage.emotion.EmojiGroupInfo;
import f40.C86709a0;
import j61.C9283v;
import java.util.ArrayList;
import java.util.Iterator;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.emoji.ui.l0 */
public class C93198l0 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiSortFragment f268757d;

    public C93198l0(EmojiSortFragment emojiSortFragment) {
        this.f268757d = emojiSortFragment;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        if (!NetStatusUtil.isConnected(MMApplicationContext.getContext())) {
            EmojiSortFragment emojiSortFragment = this.f268757d;
            int i = EmojiSortFragment.f268539n;
            C76879j.m92754y(emojiSortFragment.getContext(), emojiSortFragment.getString(C0966R.string.f360371c80), "", emojiSortFragment.getString(C0966R.string.c7z), new C93204o0(emojiSortFragment));
            return true;
        }
        EmojiSortFragment emojiSortFragment2 = this.f268757d;
        emojiSortFragment2.f268544h = C76879j.m92723Q(emojiSortFragment2.getContext(), emojiSortFragment2.getString(C0966R.string.a3h), emojiSortFragment2.getString(C0966R.string.a4d), true, true, new C93200m0(emojiSortFragment2));
        ArrayList arrayList = new ArrayList();
        Iterator<EmojiGroupInfo> it = this.f268757d.f268542f.mo127605b().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().field_productID);
        }
        this.f268757d.f268543g = new C9283v(arrayList, 2);
        C86709a0.m107529k().f251779b.mo123460f(this.f268757d.f268543g);
        return true;
    }
}
