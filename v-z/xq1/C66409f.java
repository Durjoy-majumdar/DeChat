package xq1;

import ar1.C54320d;
import br1.C54545a;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage;
import com.tencent.p014mm.plugin.finder.upload.postlogic.finderstage.FinderUploadStage;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import wq1.C66174c;
import xq1.C66411h;

/* renamed from: xq1.f */
public abstract class C66409f<T extends C66411h> implements C66410g {

    /* renamed from: a */
    public final HashMap<String, HashMap<C66408e, T>> f191155a = new HashMap<>();

    /* renamed from: a */
    public void mo75420a(String str, C66408e eVar, C66408e eVar2) {
        FinderFeedReportObject finderFeedReportObject;
        C87412m.m108594g(str, "taskId");
        C87412m.m108594g(eVar, "from");
        C87412m.m108594g(eVar2, "to");
        long c = C31543z5.m39453c();
        HashMap<String, HashMap<C66408e, T>> hashMap = this.f191155a;
        HashMap<C66408e, T> hashMap2 = hashMap.get(str);
        if (hashMap2 == null) {
            hashMap2 = new HashMap<>();
            hashMap.put(str, hashMap2);
        }
        Map map = hashMap2;
        Object obj = map.get(eVar);
        if (obj == null) {
            obj = new C66411h();
            map.put(eVar, obj);
        }
        C66411h hVar = (C66411h) obj;
        hVar.f191157b = c;
        if (!(eVar2 instanceof C66413j)) {
            boolean z = eVar2 instanceof C66412i;
        }
        long j = c - hVar.f191156a;
        Log.m105924i(((C54545a) this).f152906b, "stageFinish, stage:" + C66174c.f190185a.mo90268c(eVar) + ", enterTime:" + hVar.f191156a + ", exitTime:" + hVar.f191157b);
        FinderItem finderItem = eVar instanceof C54320d ? ((C54320d) eVar).f152454h : eVar instanceof FinderMediaProcessStage ? ((FinderMediaProcessStage) eVar).f161540h : eVar instanceof FinderUploadStage ? ((FinderUploadStage) eVar).f161596h : null;
        if (!(finderItem == null || (finderFeedReportObject = finderItem.field_reportObject) == null)) {
            int i = (int) j;
            finderFeedReportObject.postTaskCost += i;
            if (eVar instanceof FinderMediaProcessStage) {
                finderFeedReportObject.mediaProcessCost += i;
            }
            if (eVar instanceof FinderUploadStage) {
                finderFeedReportObject.uploadCost += i;
            }
        }
        HashMap<String, HashMap<C66408e, T>> hashMap3 = this.f191155a;
        HashMap<C66408e, T> hashMap4 = hashMap3.get(str);
        if (hashMap4 == null) {
            hashMap4 = new HashMap<>();
            hashMap3.put(str, hashMap4);
        }
        Map map2 = hashMap4;
        Object obj2 = map2.get(eVar2);
        if (obj2 == null) {
            obj2 = new C66411h();
            map2.put(eVar2, obj2);
        }
        ((C66411h) obj2).f191156a = c;
    }

    /* renamed from: b */
    public void mo75421b(String str, C66408e eVar) {
        C87412m.m108594g(str, "taskId");
        C87412m.m108594g(eVar, "beginStage");
        this.f191155a.remove(str);
        HashMap<String, HashMap<C66408e, T>> hashMap = this.f191155a;
        HashMap<C66408e, T> hashMap2 = hashMap.get(str);
        if (hashMap2 == null) {
            hashMap2 = new HashMap<>();
            hashMap.put(str, hashMap2);
        }
        Map map = hashMap2;
        Object obj = map.get(eVar);
        if (obj == null) {
            obj = new C66411h();
            map.put(eVar, obj);
        }
        ((C66411h) obj).f191156a = C31543z5.m39453c();
    }

    /* renamed from: c */
    public void mo75422c(String str, C66408e eVar) {
        C87412m.m108594g(str, "taskId");
        C87412m.m108594g(eVar, "endStage");
        HashMap<String, HashMap<C66408e, T>> hashMap = this.f191155a;
        HashMap<C66408e, T> hashMap2 = hashMap.get(str);
        if (hashMap2 == null) {
            hashMap2 = new HashMap<>();
            hashMap.put(str, hashMap2);
        }
        Map map = hashMap2;
        Object obj = map.get(eVar);
        if (obj == null) {
            obj = new C66411h();
            map.put(eVar, obj);
        }
        ((C66411h) obj).f191157b = C31543z5.m39453c();
    }
}
