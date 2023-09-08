package com.tencent.p014mm.p136ui.conversation;

import aj3.C103374a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.conversation.C74720p;
import com.tencent.p014mm.plugin.taskbar.p110ui.C71323d;
import com.tencent.p014mm.plugin.taskbar.p110ui.C71331l;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.conversation.j0 */
public final class C74694j0 implements C103374a.C67055a {

    /* renamed from: a */
    public final /* synthetic */ int f219593a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup.LayoutParams f219594b;

    /* renamed from: c */
    public final /* synthetic */ C74720p.C74733m f219595c;

    /* renamed from: d */
    public final /* synthetic */ int f219596d;

    /* renamed from: e */
    public final /* synthetic */ float f219597e;

    /* renamed from: f */
    public final /* synthetic */ FolderHelper f219598f;

    public C74694j0(int i, ViewGroup.LayoutParams layoutParams, C74720p.C74733m mVar, int i2, float f, FolderHelper folderHelper) {
        this.f219593a = i;
        this.f219594b = layoutParams;
        this.f219595c = mVar;
        this.f219596d = i2;
        this.f219597e = f;
        this.f219598f = folderHelper;
    }

    /* renamed from: a */
    public final void mo91065a(float f) {
        int i = this.f219593a;
        this.f219594b.height = (int) (((float) i) + (((float) (0 - i)) * f));
        View view = this.f219595c.f219763r;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f - f));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/conversation/FolderHelper$performItemCollapse$2", "onUpdate", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view2, "com/tencent/mm/ui/conversation/FolderHelper$performItemCollapse$2", "onUpdate", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f219595c.f219762q.setLayoutParams(this.f219594b);
        C74720p.C74733m mVar = this.f219595c;
        mVar.f219760o = this.f219594b.height;
        mVar.f219762q.requestLayout();
        int i2 = this.f219596d;
        float f2 = ((float) i2) + (f * (this.f219597e - ((float) i2)));
        ConversationListView conversationListView = this.f219598f.f219407f;
        if (conversationListView != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) conversationListView.f219343U.getLayoutParams();
            boolean z = f2 < 0.0f;
            int i3 = layoutParams.height;
            Log.m105918d("MicroMsg.ConversationListView", "[updateEmptyFooter] isRealFull:" + z + " old height:" + i3 + " extraHeight:" + f2);
            View findViewById = conversationListView.getRootView().findViewById(C0966R.C0970id.f358508fj3);
            if (findViewById != null) {
                Log.m105919d("MicroMsg.ConversationListView", "[updateEmptyFooter] tabView Height: %d", Integer.valueOf(findViewById.getHeight()));
            }
            int dimension = (int) conversationListView.getResources().getDimension(C0966R.dimen.f3925j5);
            int height = findViewById != null ? findViewById.getHeight() : 0;
            if (height <= 0) {
                height = conversationListView.f219366y;
            }
            Log.m105919d("MicroMsg.ConversationListView", "[updateEmptyFooter] tabHeight: %d", Integer.valueOf(height));
            if (z) {
                layoutParams.height = height;
            } else {
                float f3 = (float) height;
                if (f2 < f3) {
                    f2 = f3;
                }
                layoutParams.height = (int) f2;
            }
            if (i3 != layoutParams.height) {
                Log.m105919d("MicroMsg.ConversationListView", "[updateEmptyFooter] isHeaderOpen: %b", Boolean.valueOf(conversationListView.mo103725k()));
                if ((!z || Math.abs(f2) <= ((float) (height + dimension))) && !conversationListView.mo103725k()) {
                    Log.m105918d("MicroMsg.ConversationListView", "[updateEmptyFooter] setSelection");
                    C71323d dVar = conversationListView.f219352j;
                    if (dVar != null) {
                        ((C71331l) dVar).mo98257d(true);
                    }
                }
                conversationListView.f219343U.requestLayout();
            }
        }
    }
}
