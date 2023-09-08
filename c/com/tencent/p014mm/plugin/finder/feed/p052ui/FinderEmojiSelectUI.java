package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import java.util.Set;
import kotlin.Metadata;
import rs1.C63599o1;
import sx3.C22415w0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderEmojiSelectUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderEmojiSelectUI */
public final class FinderEmojiSelectUI extends MMFinderUI {

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderEmojiSelectUI$a */
    public static final class C2891a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderEmojiSelectUI f14267d;

        public C2891a(FinderEmojiSelectUI finderEmojiSelectUI) {
            this.f14267d = finderEmojiSelectUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f14267d.finish();
            return true;
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        return 129;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C22415w0.m26092a(C63599o1.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new C2891a(this));
        setMMTitle(getResources().getString(C0966R.string.ei9));
    }
}
