package com.tencent.p014mm.plugin.remittance.mobile.p097ui;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.d */
public class C5056d implements RecyclerView.C16622o {

    /* renamed from: d */
    public final /* synthetic */ MobileRemitHistoryRecodUI f20409d;

    public C5056d(MobileRemitHistoryRecodUI mobileRemitHistoryRecodUI) {
        this.f20409d = mobileRemitHistoryRecodUI;
    }

    /* renamed from: c */
    public void mo126c(RecyclerView recyclerView, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitHistoryRecodUI$4", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", this, array);
        C117292a.m165361g(this, "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitHistoryRecodUI$4", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
    }

    /* renamed from: d */
    public void mo127d(boolean z) {
    }

    /* renamed from: e */
    public boolean mo6022e(RecyclerView recyclerView, MotionEvent motionEvent) {
        this.f20409d.f203852p[0] = (int) motionEvent.getRawX();
        this.f20409d.f203852p[1] = (int) motionEvent.getRawY();
        Log.m105919d("MicroMsg.mobileRemit.MobileRemitHistoryRecodUI", "onTouchEvent() (%s, %s)", Integer.valueOf(this.f20409d.f203852p[0]), Integer.valueOf(this.f20409d.f203852p[1]));
        return false;
    }
}
