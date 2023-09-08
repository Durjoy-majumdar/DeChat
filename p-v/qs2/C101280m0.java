package qs2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: qs2.m0 */
public class C101280m0 extends C101255a0 {

    /* renamed from: A */
    public int f296661A = 0;

    /* renamed from: B */
    public boolean f296662B = true;

    /* renamed from: C */
    public boolean f296663C = false;

    /* renamed from: z */
    public LinkedList<C101290s> f296664z = new LinkedList<>();

    /* renamed from: a */
    public List<C101255a0> mo140732a() {
        SnsMethodCalculate.markStartTimeMs("getAllChildrenCompInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageGroupListInfo");
        ArrayList arrayList = new ArrayList(super.mo140732a());
        LinkedList<C101290s> linkedList = this.f296664z;
        if (linkedList != null) {
            Iterator<C101290s> it = linkedList.iterator();
            while (it.hasNext()) {
                LinkedList<C101255a0> linkedList2 = it.next().f296728z;
                if (linkedList2 != null) {
                    arrayList.addAll(linkedList2);
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("getAllChildrenCompInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageGroupListInfo");
        return arrayList;
    }
}
