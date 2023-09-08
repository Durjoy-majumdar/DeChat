package com.tencent.p014mm.p136ui.conversation;

import com.tencent.p014mm.p136ui.conversation.MainUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.conversation.u0 */
public class C74744u0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f219788d;

    /* renamed from: e */
    public final /* synthetic */ int f219789e;

    /* renamed from: f */
    public final /* synthetic */ MainUI.C74661j f219790f;

    public C74744u0(MainUI.C74661j jVar, int i, int i2) {
        this.f219790f = jVar;
        this.f219788d = i;
        this.f219789e = i2;
    }

    public void run() {
        int i = this.f219788d;
        int i2 = this.f219789e;
        if (i != i2) {
            MainUI.C74661j jVar = this.f219790f;
            if (jVar.f219501f == i2) {
                int firstVisiblePosition = MainUI.this.f219476o.getFirstVisiblePosition();
                int i3 = this.f219788d;
                if (i3 == firstVisiblePosition && Math.abs(this.f219789e - i3) > 2) {
                    MainUI.this.f219476o.setSelection(this.f219789e);
                } else if (Math.abs(firstVisiblePosition - this.f219789e) > 2) {
                    ConversationListView conversationListView = MainUI.this.f219476o;
                    int i4 = this.f219789e;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    aVar.mo10233c(Integer.valueOf(i4));
                    C117292a.m165358d(conversationListView, aVar.mo10232b(), "com/tencent/mm/ui/conversation/MainUI$3$1", "run", "()V", "Undefined", "smoothScrollToPositionFromTop", "(II)V");
                    conversationListView.smoothScrollToPositionFromTop(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                    C117292a.m165359e(conversationListView, "com/tencent/mm/ui/conversation/MainUI$3$1", "run", "()V", "Undefined", "smoothScrollToPositionFromTop", "(II)V");
                }
                Log.m105925i("MicroMsg.MainUI", "auto pos result:%d, %d, %d", Integer.valueOf(this.f219788d), Integer.valueOf(this.f219789e), Integer.valueOf(firstVisiblePosition));
            }
        }
    }
}
