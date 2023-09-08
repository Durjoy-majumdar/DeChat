package com.tencent.p014mm.sdk.platformtools;

import android.widget.ListView;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.sdk.platformtools.SmoothScrollToPosition22 */
class SmoothScrollToPosition22 implements BackwardSupportUtil.SmoothScrollFactory.IScroll {
    private static final int SCROLL_UNIT = 10;
    private byte _hellAccFlag_;

    public void doScroll(ListView listView) {
        if (listView.getFirstVisiblePosition() > 10) {
            listView.setSelection(10);
        }
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(listView, aVar.mo10232b(), "com/tencent/mm/sdk/platformtools/SmoothScrollToPosition22", "doScroll", "(Landroid/widget/ListView;)V", "Undefined", "smoothScrollToPosition", "(I)V");
        listView.smoothScrollToPosition(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(listView, "com/tencent/mm/sdk/platformtools/SmoothScrollToPosition22", "doScroll", "(Landroid/widget/ListView;)V", "Undefined", "smoothScrollToPosition", "(I)V");
    }

    public void doScrollFromTop(ListView listView, int i) {
        listView.getFirstVisiblePosition();
        listView.setSelection(i);
    }

    public void doScroll(ListView listView, int i) {
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (firstVisiblePosition > i && firstVisiblePosition - i > 10) {
            listView.setSelection(i + 10);
        } else if (firstVisiblePosition < i && i - firstVisiblePosition > 10) {
            listView.setSelection(i - 10);
        }
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(listView, aVar.mo10232b(), "com/tencent/mm/sdk/platformtools/SmoothScrollToPosition22", "doScroll", "(Landroid/widget/ListView;I)V", "Undefined", "smoothScrollToPosition", "(I)V");
        listView.smoothScrollToPosition(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(listView, "com/tencent/mm/sdk/platformtools/SmoothScrollToPosition22", "doScroll", "(Landroid/widget/ListView;I)V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
