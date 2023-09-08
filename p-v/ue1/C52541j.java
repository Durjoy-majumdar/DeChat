package ue1;

import com.tencent.p014mm.chatting.BasePrivateMsgConvListFragment;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import di3.C86312j;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import sx3.C110818d0;
import up1.C52593j;

/* renamed from: ue1.j */
public final class C52541j implements BasePrivateMsgConvListFragment.C40274b<C52528f> {

    /* renamed from: a */
    public final String f146749a;

    /* renamed from: b */
    public final int f146750b;

    /* renamed from: c */
    public final int f146751c;

    public C52541j(String str, int i, int i2) {
        C87412m.m108594g(str, "finderDefaultUsername");
        this.f146749a = str;
        this.f146750b = i;
        this.f146751c = i2;
    }

    /* renamed from: L4 */
    public MAutoStorage<C52528f> mo62834L4() {
        return ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).mo76776L4();
    }

    /* renamed from: M4 */
    public List<C52528f> mo62835M4(int i) {
        return ((C52593j) mo62834L4()).mo73550Yt(this.f146749a, i, 60, C110818d0.m150952x0(mo73486a()), this.f146751c);
    }

    /* renamed from: N4 */
    public List<C52528f> mo62836N4() {
        return ((C52593j) mo62834L4()).mo73550Yt(this.f146749a, 0, 15, C110818d0.m150952x0(mo73486a()), this.f146751c);
    }

    /* renamed from: a */
    public final ArrayList<Integer> mo73486a() {
        ArrayList<Integer> arrayList = new ArrayList<>(2);
        if (this.f146751c == 2) {
            int i = this.f146750b;
            if (i == 1) {
                arrayList.add(2);
                if (((C52593j) mo62834L4()).mo73548Lo(this.f146751c, this.f146749a) > 0) {
                    arrayList.add(100);
                }
            } else if (i == 2) {
                arrayList.add(1);
            } else if (i == 3) {
                arrayList.add(3);
            }
        } else {
            int i2 = this.f146750b;
            if (i2 == 1) {
                arrayList.add(2);
                arrayList.add(200);
            } else if (i2 != 3) {
                arrayList.add(1);
            } else {
                arrayList.add(3);
            }
        }
        return arrayList;
    }
}
