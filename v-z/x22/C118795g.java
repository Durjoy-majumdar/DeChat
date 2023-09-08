package x22;

import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.plugin.location.p069ui.impl.C115576t;
import com.tencent.p014mm.plugin.location.p069ui.impl.TrackPoint;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import t22.C118348h;
import te3.C118475vf3;
import te3.ep4;
import x22.C112028i;
import x22.C112033j;

/* renamed from: x22.g */
public class C118795g implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ C112028i f355425d;

    public C118795g(C112028i iVar) {
        this.f355425d = iVar;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C112033j.C112034a aVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/location/ui/ShareHeaderAvatarViewMgr$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        String str = (String) view.getTag();
        if (!Util.isNullOrNil(str)) {
            C115669n.INSTANCE.mo160131h(10997, "15", 0, 0, 0);
            C112028i.C112032c cVar = this.f355425d.f335363g;
            if (!(cVar == null || (aVar = ((C112033j) cVar).f335381k) == null)) {
                C115576t tVar = (C115576t) aVar;
                TrackPoint trackPoint = (TrackPoint) tVar.f346634a.f271953i.f271972f.getViewByItag(str);
                if (trackPoint != null) {
                    trackPoint.mo175555c();
                    tVar.f346634a.f271953i.f271972f.invalidate();
                    C118812s sVar = tVar.f346634a.f346463W;
                    sVar.getClass();
                    C118348h hVar = null;
                    if (!Util.isNullOrNil(str)) {
                        ep4 ep4 = sVar.f355463c;
                        if (ep4 == null || !str.equals(ep4.f353978d)) {
                            List<ep4> list = sVar.f355462b;
                            if (list != null && ((ArrayList) list).size() > 0) {
                                Iterator it = ((ArrayList) sVar.f355462b).iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    ep4 ep42 = (ep4) it.next();
                                    if (ep42.f353978d.equals(str)) {
                                        C118475vf3 vf32 = ep42.f353979e;
                                        hVar = new C118348h(vf32.f354501e, vf32.f354500d);
                                        break;
                                    }
                                }
                            }
                        } else {
                            C118475vf3 vf33 = sVar.f355463c.f353979e;
                            hVar = new C118348h(vf33.f354501e, vf33.f354500d);
                        }
                    }
                    if (hVar != null) {
                        tVar.f346634a.f271953i.f271972f.getIController().animateTo(hVar.f353701b, hVar.f353700a);
                    }
                }
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/location/ui/ShareHeaderAvatarViewMgr$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
