package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import java.util.Set;
import kotlin.Metadata;
import sx3.C64187h0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderTimelineLbsLiveFriendsUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTimelineLbsLiveFriendsUI */
public final class FinderTimelineLbsLiveFriendsUI extends MMFinderUI {

    /* renamed from: o */
    public static final /* synthetic */ int f52477o = 0;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTimelineLbsLiveFriendsUI$a */
    public static final class C18752a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelineLbsLiveFriendsUI f52478d;

        public C18752a(FinderTimelineLbsLiveFriendsUI finderTimelineLbsLiveFriendsUI) {
            this.f52478d = finderTimelineLbsLiveFriendsUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f52478d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTimelineLbsLiveFriendsUI$b */
    public static final class C18753b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelineLbsLiveFriendsUI f52479d;

        public C18753b(FinderTimelineLbsLiveFriendsUI finderTimelineLbsLiveFriendsUI) {
            this.f52479d = finderTimelineLbsLiveFriendsUI;
        }

        public final void run() {
            FinderTimelineLbsLiveFriendsUI finderTimelineLbsLiveFriendsUI = this.f52479d;
            int i = FinderTimelineLbsLiveFriendsUI.f52477o;
            finderTimelineLbsLiveFriendsUI.getClass();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTimelineLbsLiveFriendsUI$c */
    public static final class C18754c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelineLbsLiveFriendsUI f52480d;

        public C18754c(FinderTimelineLbsLiveFriendsUI finderTimelineLbsLiveFriendsUI) {
            this.f52480d = finderTimelineLbsLiveFriendsUI;
        }

        public final void run() {
            FinderTimelineLbsLiveFriendsUI finderTimelineLbsLiveFriendsUI = this.f52480d;
            int i = FinderTimelineLbsLiveFriendsUI.f52477o;
            finderTimelineLbsLiveFriendsUI.getClass();
        }
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        return 3;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C64187h0.f181908d;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new C18752a(this));
        setTitleBarClickListener(new C18753b(this), new C18754c(this));
    }
}
