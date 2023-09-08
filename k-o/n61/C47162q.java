package n61;

import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.CustomViewPager;
import com.tencent.p014mm.plugin.emoji.p040ui.p319v3.EmojiStoreV3HomeUI;
import com.tencent.p014mm.plugin.emoji.p040ui.p319v3.EmojiStoreV3TabView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import sx3.C64197v;

/* renamed from: n61.q */
public final class C47162q implements TabLayout.C104470c {

    /* renamed from: a */
    public final /* synthetic */ EmojiStoreV3HomeUI f126698a;

    public C47162q(EmojiStoreV3HomeUI emojiStoreV3HomeUI) {
        this.f126698a = emojiStoreV3HomeUI;
    }

    /* renamed from: a */
    public void mo9213a(TabLayout.C55061f fVar) {
        EmojiStoreV3HomeUI emojiStoreV3HomeUI = this.f126698a;
        List<EmojiStoreV3HomeUI.C41075a> list = emojiStoreV3HomeUI.f110665p;
        if (list != null) {
            int i = 0;
            for (T next : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    EmojiStoreV3HomeUI.C41075a aVar = (EmojiStoreV3HomeUI.C41075a) next;
                    TabLayout.C55061f fVar2 = aVar.f110672b;
                    boolean z = true;
                    if (fVar2 == null || !fVar2.equals(fVar)) {
                        z = false;
                    }
                    if (z) {
                        Log.m105918d("MicroMsg.EmojiStoreV3HomeUI", "onTabUnselected , " + aVar.f110671a);
                        EmojiStoreV3TabView emojiStoreV3TabView = aVar.f110674d;
                        if (emojiStoreV3TabView != null) {
                            emojiStoreV3TabView.setTitleTextColor(emojiStoreV3HomeUI.getContext().getResources().getColor(C0966R.color.FG_1));
                        }
                        View view = aVar.f110675e;
                        if (view != null) {
                            view.setBackgroundColor(emojiStoreV3HomeUI.getContext().getResources().getColor(C0966R.color.ahf));
                        }
                        View view2 = aVar.f110675e;
                        if (view2 != null) {
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar2.mo10233c(4);
                            View view3 = view2;
                            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI$initTabLayout$2", "onTabUnselected", "(Lcom/google/android/material/tabs/TabLayout$Tab;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view3, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI$initTabLayout$2", "onTabUnselected", "(Lcom/google/android/material/tabs/TabLayout$Tab;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            return;
                        }
                        return;
                    }
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo9214b(TabLayout.C55061f fVar) {
        EmojiStoreV3HomeUI emojiStoreV3HomeUI = this.f126698a;
        List<EmojiStoreV3HomeUI.C41075a> list = emojiStoreV3HomeUI.f110665p;
        if (list != null) {
            int i = 0;
            for (T next : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    EmojiStoreV3HomeUI.C41075a aVar = (EmojiStoreV3HomeUI.C41075a) next;
                    TabLayout.C55061f fVar2 = aVar.f110672b;
                    if (fVar2 != null && fVar2.equals(fVar)) {
                        Log.m105918d("MicroMsg.EmojiStoreV3HomeUI", "onTabSelected , " + aVar.f110671a);
                        EmojiStoreV3TabView emojiStoreV3TabView = aVar.f110674d;
                        if (emojiStoreV3TabView != null) {
                            emojiStoreV3TabView.setTitleTextColor(emojiStoreV3HomeUI.getContext().getResources().getColor(C0966R.color.FG_0));
                        }
                        View view = aVar.f110675e;
                        if (view != null) {
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar2.mo10233c(0);
                            View view2 = view;
                            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI$initTabLayout$2", "onTabSelected", "(Lcom/google/android/material/tabs/TabLayout$Tab;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI$initTabLayout$2", "onTabSelected", "(Lcom/google/android/material/tabs/TabLayout$Tab;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        View view3 = aVar.f110675e;
                        if (view3 != null) {
                            view3.setBackgroundColor(emojiStoreV3HomeUI.getContext().getResources().getColor(C0966R.color.FG_0));
                        }
                        CustomViewPager customViewPager = emojiStoreV3HomeUI.f110664o;
                        if (customViewPager != null) {
                            customViewPager.setCurrentItem(i, true);
                            return;
                        }
                        return;
                    }
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo9215c(TabLayout.C55061f fVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("onTabReselected ");
        sb.append(fVar != null ? fVar.f154602c : null);
        Log.m105918d("MicroMsg.EmojiStoreV3HomeUI", sb.toString());
    }
}
