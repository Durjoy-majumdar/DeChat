package com.tencent.p014mm.plugin.appbrand.appusage;

import androidx.recyclerview.widget.C54258u;
import com.tencent.p014mm.plugin.appbrand.appusage.C40434o0;
import com.tencent.p014mm.plugin.appbrand.appusage.C81470c;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import te3.ra4;
import te3.sa4;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.d */
public final class C81476d implements C54258u {

    /* renamed from: a */
    public final /* synthetic */ PInt f239063a;

    /* renamed from: b */
    public final /* synthetic */ List<LocalUsageInfo> f239064b;

    /* renamed from: c */
    public final /* synthetic */ List<LocalUsageInfo> f239065c;

    /* renamed from: d */
    public final /* synthetic */ C81470c.C81471a f239066d;

    /* renamed from: e */
    public final /* synthetic */ C81470c f239067e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList<LocalUsageInfo> f239068f;

    public C81476d(PInt pInt, List<? extends LocalUsageInfo> list, List<? extends LocalUsageInfo> list2, C81470c.C81471a aVar, C81470c cVar, ArrayList<LocalUsageInfo> arrayList) {
        this.f239063a = pInt;
        this.f239064b = list;
        this.f239065c = list2;
        this.f239066d = aVar;
        this.f239067e = cVar;
        this.f239068f = arrayList;
    }

    /* renamed from: a */
    public void mo2860a(int i, int i2) {
        this.f239063a.value += i2;
        Log.m105924i("MicroMsg.AppBrandCollectionModifyQueue[collection]", "applyDiff, onRemoved position=" + i + " count=" + i2);
        int i3 = i2 + i + -1;
        if (i <= i3) {
            int i4 = i;
            while (true) {
                LocalUsageInfo remove = this.f239068f.remove(i);
                C81470c.C81471a aVar = this.f239066d;
                C81470c cVar = this.f239067e;
                LocalUsageInfo localUsageInfo = remove;
                if (aVar != null) {
                    C87412m.m108593f(localUsageInfo, "info");
                    aVar.mo113778b(localUsageInfo);
                }
                ra4 vx02 = C81470c.vx0(cVar, localUsageInfo);
                C87412m.m108591d(vx02);
                sa4 sa4 = new sa4();
                sa4.f185399d = vx02;
                sa4.f185403h = 2;
                sa4.f185400e = null;
                sa4.f185401f = null;
                cVar.xx0(sa4, C40434o0.C40435a.None);
                if (i4 != i3) {
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo2861b(int i, int i2) {
        LocalUsageInfo localUsageInfo;
        this.f239063a.value += i2;
        Log.m105924i("MicroMsg.AppBrandCollectionModifyQueue[collection]", "applyDiff, onInserted position=" + i + " count=" + i2 + "  oldList.size=" + this.f239064b.size() + "  newList.size=" + this.f239065c.size());
        int i3 = i2 + i;
        if (i3 == this.f239065c.size()) {
            localUsageInfo = null;
        } else {
            try {
                localUsageInfo = this.f239065c.get(i3);
            } catch (IndexOutOfBoundsException e) {
                Log.m105924i("MicroMsg.AppBrandCollectionModifyQueue[collection]", "print old list:" + this.f239064b.size());
                for (LocalUsageInfo localUsageInfo2 : this.f239064b) {
                    Log.m105924i("MicroMsg.AppBrandCollectionModifyQueue[collection]", localUsageInfo2.f239044h + XVFSFile.PATH_SEPARATOR_CHAR + localUsageInfo2.f239042f);
                }
                Log.m105924i("MicroMsg.AppBrandCollectionModifyQueue[collection]", "print new list:" + this.f239065c.size());
                for (LocalUsageInfo localUsageInfo3 : this.f239065c) {
                    Log.m105924i("MicroMsg.AppBrandCollectionModifyQueue[collection]", localUsageInfo3.f239044h + XVFSFile.PATH_SEPARATOR_CHAR + localUsageInfo3.f239042f);
                }
                throw e;
            }
        }
        int i4 = i3 - 1;
        if (i <= i4) {
            while (true) {
                LocalUsageInfo localUsageInfo4 = this.f239065c.get(i);
                LocalUsageInfo localUsageInfo5 = i == 0 ? null : this.f239065c.get(i - 1);
                C81470c.C81471a aVar = this.f239066d;
                if (aVar != null) {
                    aVar.mo113779c(localUsageInfo4);
                }
                C81470c cVar = this.f239067e;
                ra4 vx02 = C81470c.vx0(cVar, localUsageInfo4);
                C87412m.m108591d(vx02);
                ra4 vx03 = C81470c.vx0(this.f239067e, localUsageInfo5);
                ra4 vx04 = C81470c.vx0(this.f239067e, localUsageInfo);
                sa4 sa4 = new sa4();
                sa4.f185399d = vx02;
                sa4.f185403h = 1;
                sa4.f185400e = vx03;
                sa4.f185401f = vx04;
                cVar.xx0(sa4, C40434o0.C40435a.None);
                if (i != i4) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo2862c(int i, int i2, Object obj) {
    }

    /* renamed from: d */
    public void mo2863d(int i, int i2) {
        this.f239063a.value++;
        Log.m105924i("MicroMsg.AppBrandCollectionModifyQueue[collection]", "applyDiff, onMoved from " + i + " to " + i2);
        this.f239068f.add(i2, this.f239068f.remove(i));
        LocalUsageInfo localUsageInfo = this.f239068f.get(i2);
        C87412m.m108593f(localUsageInfo, "tempList[toPosition]");
        LocalUsageInfo localUsageInfo2 = localUsageInfo;
        LocalUsageInfo localUsageInfo3 = null;
        LocalUsageInfo localUsageInfo4 = i2 == 0 ? null : this.f239068f.get(i2 - 1);
        int i3 = i2 + 1;
        if (i3 != this.f239068f.size()) {
            localUsageInfo3 = this.f239068f.get(i3);
        }
        C81470c.C81471a aVar = this.f239066d;
        if (aVar != null) {
            aVar.mo113777a(localUsageInfo2, localUsageInfo4, localUsageInfo3);
        }
        C81470c cVar = this.f239067e;
        ra4 vx02 = C81470c.vx0(cVar, localUsageInfo2);
        C87412m.m108591d(vx02);
        ra4 vx03 = C81470c.vx0(this.f239067e, localUsageInfo4);
        ra4 vx04 = C81470c.vx0(this.f239067e, localUsageInfo3);
        boolean z = BuildInfo.DEBUG;
        sa4 sa4 = new sa4();
        sa4.f185399d = vx02;
        sa4.f185403h = 3;
        sa4.f185400e = vx03;
        sa4.f185401f = vx04;
        cVar.xx0(sa4, C40434o0.C40435a.None);
    }
}
