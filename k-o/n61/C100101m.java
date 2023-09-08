package n61;

import android.app.ProgressDialog;
import android.view.View;
import androidx.lifecycle.C0120a0;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.emoji.model.C93116n;
import com.tencent.p014mm.plugin.emoji.p040ui.p319v3.EmojiStoreV3HomeBaseFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p61.C100664m;
import sx3.C110818d0;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: n61.m */
public final class C100101m implements C0120a0<Integer> {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreV3HomeBaseFragment f293251d;

    public C100101m(EmojiStoreV3HomeBaseFragment emojiStoreV3HomeBaseFragment) {
        this.f293251d = emojiStoreV3HomeBaseFragment;
    }

    public void onChanged(Object obj) {
        ProgressDialog progressDialog;
        Integer num = (Integer) obj;
        String str = this.f293251d.f268992d;
        Log.m105918d(str, "handle repo event:" + num);
        int i = this.f293251d.mo127887M().f293239q;
        boolean z = false;
        if (num != null && num.intValue() == i) {
            C100664m L = this.f293251d.mo127886L();
            C93116n nVar = this.f293251d.mo127887M().f293230e;
            if (nVar == null) {
                L.getClass();
            } else {
                L.f294897r = nVar;
                L.f294889g.clear();
                L.f294889g.addAll(C110818d0.m150953y0(nVar.f268261a));
                L.f294892j.clear();
                L.notifyDataSetChanged();
            }
            EmojiStoreV3HomeBaseFragment emojiStoreV3HomeBaseFragment = this.f293251d;
            if (emojiStoreV3HomeBaseFragment.f269007v) {
                emojiStoreV3HomeBaseFragment.f269007v = false;
                C119179t tVar = C119157j.f356862d;
                C100100l lVar = new C100100l(emojiStoreV3HomeBaseFragment);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(lVar, 500, false);
                return;
            }
            return;
        }
        int i2 = this.f293251d.mo127887M().f293240r;
        if (num != null && num.intValue() == i2) {
            EmojiStoreV3HomeBaseFragment emojiStoreV3HomeBaseFragment2 = this.f293251d;
            ProgressDialog progressDialog2 = emojiStoreV3HomeBaseFragment2.f269000o;
            if (progressDialog2 != null && progressDialog2.isShowing()) {
                z = true;
            }
            if (z && (progressDialog = emojiStoreV3HomeBaseFragment2.f269000o) != null) {
                progressDialog.dismiss();
                return;
            }
            return;
        }
        int i3 = this.f293251d.mo127887M().f293243u;
        if (num != null && num.intValue() == i3) {
            EmojiStoreV3HomeBaseFragment emojiStoreV3HomeBaseFragment3 = this.f293251d;
            View view = emojiStoreV3HomeBaseFragment3.f269002q;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment", "showLoadingUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment", "showLoadingUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view2 = emojiStoreV3HomeBaseFragment3.f269003r;
            if (view2 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment", "showLoadingUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment", "showLoadingUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            RecyclerView recyclerView = emojiStoreV3HomeBaseFragment3.f268999n;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            Log.m105918d(emojiStoreV3HomeBaseFragment3.f268992d, "showLoadingUIState");
            return;
        }
        int i4 = this.f293251d.mo127887M().f293241s;
        if (num != null && num.intValue() == i4) {
            this.f293251d.mo127891Q();
            return;
        }
        int i5 = this.f293251d.mo127887M().f293242t;
        if (num != null && num.intValue() == i5) {
            this.f293251d.mo127891Q();
            return;
        }
        int i6 = this.f293251d.mo127887M().f293244v;
        if (num != null && num.intValue() == i6) {
            EmojiStoreV3HomeBaseFragment emojiStoreV3HomeBaseFragment4 = this.f293251d;
            View view4 = emojiStoreV3HomeBaseFragment4.f269002q;
            if (view4 != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(8);
                C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment", "showContentUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment", "showContentUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view5 = emojiStoreV3HomeBaseFragment4.f269003r;
            if (view5 != null) {
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar4.mo10233c(8);
                View view6 = view5;
                C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment", "showContentUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment", "showContentUIState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            RecyclerView recyclerView2 = emojiStoreV3HomeBaseFragment4.f268999n;
            if (recyclerView2 != null) {
                recyclerView2.setVisibility(0);
            }
        }
    }
}
