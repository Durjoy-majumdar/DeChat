package kr1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.finder.video.plugin.view.SubRecordFinishView;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.report.service.C115669n;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import lh2.C109344g0;
import qh2.C101198e;

/* renamed from: kr1.p */
public final class C61147p implements View.OnClickListener, C109344g0 {

    /* renamed from: d */
    public SubRecordFinishView f174083d;

    /* renamed from: e */
    public C101198e f174084e;

    public C61147p(SubRecordFinishView subRecordFinishView, C101198e eVar) {
        C87412m.m108594g(subRecordFinishView, "view");
        C87412m.m108594g(eVar, "status");
        this.f174083d = subRecordFinishView;
        this.f174084e = eVar;
        subRecordFinishView.setOnClickListener(this);
    }

    /* renamed from: e */
    public boolean mo78564e() {
        return false;
    }

    public String name() {
        return C61147p.class.getName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach() {
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/video/plugin/FinderSubRecordFinishPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long j = 0;
        if (true && true) {
            j = 1;
        }
        C115669n.INSTANCE.idkeyStat(1371, 190, j, false);
        C101198e.C62622a.m73576a(this.f174084e, C101198e.C101199b.SUB_RECORD_FINISH, (Bundle) null, 2, (Object) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/video/plugin/FinderSubRecordFinishPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onDetach() {
    }

    public void onPause() {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C109344g0.C61280a.m71860a(this, i, strArr, iArr);
    }

    public void onResume() {
    }

    public void release() {
    }

    public void reset() {
    }

    public void setVisibility(int i) {
        this.f174083d.setVisibility(i);
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}
