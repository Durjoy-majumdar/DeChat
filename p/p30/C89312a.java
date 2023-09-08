package p30;

import com.tencent.p014mm.kara.feature.feature.business.SnsVideoClickFeatureGroup;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import ds2.C86396e;
import f30.C86705b;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: p30.a */
public class C89312a implements C86396e {
    /* renamed from: a */
    public ArrayList<C86705b> mo123660a(ArrayList<SnsInfo> arrayList) {
        ArrayList<C86705b> arrayList2 = new ArrayList<>();
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<SnsInfo> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new SnsVideoClickFeatureGroup(it.next()));
            }
        }
        return arrayList2;
    }
}
