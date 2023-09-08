package n92;

import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.autogen.mmdata.rpt.MultiTaskEduStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.MultiTaskItemActionStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.MultiTaskItemAddStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.MultiTaskItemPageBrowseStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.MultiTaskPageActionStruct;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import te3.C110961f13;
import te3.C110964i13;
import te3.C27675g13;
import te3.C49641h13;
import te3.C64336e13;

/* renamed from: n92.a */
public final class C117617a {

    /* renamed from: a */
    public static final C117617a f351848a = new C117617a();

    /* renamed from: b */
    public static final HashMap<String, Long> f351849b = new HashMap<>();

    /* renamed from: a */
    public final long mo182339a(int i) {
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 0;
        }
        if (i != 8) {
            return i != 22 ? -1 : 8;
        }
        return 6;
    }

    /* renamed from: b */
    public final void mo182340b(C110961f13 f132) {
        if (f132 != null) {
            MultiTaskEduStruct multiTaskEduStruct = new MultiTaskEduStruct();
            multiTaskEduStruct.f343756d = f132.f331967e;
            multiTaskEduStruct.f343757e = f132.f331968f;
            multiTaskEduStruct.f343758f = f132.f331969g;
            multiTaskEduStruct.f343759g = f132.f331970h;
            multiTaskEduStruct.mo86054n();
        }
    }

    /* renamed from: c */
    public final void mo182341c(MultiTaskInfo multiTaskInfo, String str, long j, long j2, String str2) {
        if (multiTaskInfo != null) {
            MultiTaskItemActionStruct multiTaskItemActionStruct = new MultiTaskItemActionStruct();
            multiTaskItemActionStruct.f343762f = multiTaskItemActionStruct.mo86045b("ItemId", multiTaskInfo.field_id, true);
            multiTaskItemActionStruct.f343761e = f351848a.mo182339a(multiTaskInfo.field_type);
            multiTaskItemActionStruct.f343760d = multiTaskItemActionStruct.mo86045b("ContextId", str, true);
            multiTaskItemActionStruct.f343763g = j;
            multiTaskItemActionStruct.f343764h = C31543z5.m39453c();
            multiTaskItemActionStruct.f343765i = j2;
            multiTaskItemActionStruct.f343766j = multiTaskItemActionStruct.mo86045b("ItemSubId", str2, true);
            String str3 = multiTaskInfo.field_id;
            C87412m.m108593f(str3, "it.field_id");
            HashMap<String, Long> hashMap = f351849b;
            Long valueOf = hashMap.containsKey(str3) ? hashMap.get(str3) : Long.valueOf(C31543z5.m39453c());
            multiTaskItemActionStruct.f343767k = valueOf != null ? valueOf.longValue() : C31543z5.m39453c();
            multiTaskItemActionStruct.f343768l = multiTaskInfo.field_createTime;
            multiTaskItemActionStruct.mo86054n();
        }
    }

    /* renamed from: d */
    public final void mo182342d(MultiTaskInfo multiTaskInfo, long j, long j2, String str, String str2) {
        if (multiTaskInfo != null) {
            MultiTaskItemAddStruct multiTaskItemAddStruct = new MultiTaskItemAddStruct();
            multiTaskItemAddStruct.f343769d = multiTaskItemAddStruct.mo86045b("ItemId", multiTaskInfo.field_id, true);
            multiTaskItemAddStruct.f343770e = f351848a.mo182339a(multiTaskInfo.field_type);
            multiTaskItemAddStruct.f343771f = j;
            multiTaskItemAddStruct.f343772g = j2;
            multiTaskItemAddStruct.f343773h = multiTaskItemAddStruct.mo86045b("ContextId", str, true);
            multiTaskItemAddStruct.f343774i = multiTaskItemAddStruct.mo86045b("ItemSubId", str2, true);
            multiTaskItemAddStruct.mo86054n();
        }
    }

    /* renamed from: e */
    public final void mo182343e(C110964i13 i132) {
        C27675g13 g132;
        if (i132 != null && (g132 = i132.f332064n) != null) {
            MultiTaskPageActionStruct multiTaskPageActionStruct = new MultiTaskPageActionStruct();
            multiTaskPageActionStruct.f343781e = multiTaskPageActionStruct.mo86045b("ContextId", i132.f332057d, true);
            multiTaskPageActionStruct.f343780d = g132.f76611d;
            multiTaskPageActionStruct.f343782f = g132.f76612e;
            multiTaskPageActionStruct.f343783g = g132.f76613f;
            multiTaskPageActionStruct.f343784h = g132.f76614g;
            multiTaskPageActionStruct.f343785i = g132.f76615h;
            multiTaskPageActionStruct.f343786j = g132.f76616i;
            multiTaskPageActionStruct.f343787k = g132.f76617j;
            multiTaskPageActionStruct.mo86054n();
        }
    }

    /* renamed from: f */
    public final void mo182344f(C110964i13 i132) {
        C64336e13 e132;
        if (i132 != null && (e132 = i132.f332062i) != null) {
            MultiTaskItemPageBrowseStruct multiTaskItemPageBrowseStruct = new MultiTaskItemPageBrowseStruct();
            multiTaskItemPageBrowseStruct.f343776e = multiTaskItemPageBrowseStruct.mo86045b("ItemId", i132.f332059f, true);
            multiTaskItemPageBrowseStruct.f343777f = f351848a.mo182339a(i132.f332060g);
            multiTaskItemPageBrowseStruct.f343775d = multiTaskItemPageBrowseStruct.mo86045b("ContextId", i132.f332057d, true);
            multiTaskItemPageBrowseStruct.f343778g = multiTaskItemPageBrowseStruct.mo86045b("ItemSubId", i132.f332061h, true);
            multiTaskItemPageBrowseStruct.f343779h = e132.f182919e;
            multiTaskItemPageBrowseStruct.mo86054n();
        }
    }

    /* renamed from: g */
    public final void mo182345g(int i, C49641h13 h132) {
        if (h132 == null) {
            return;
        }
        if (i == 1) {
            f351848a.mo182346h(10, h132.f134406d, h132.f134407e);
        } else if (i == 2) {
            f351848a.mo182346h(5, h132.f134406d, h132.f134407e);
        } else if (i == 3) {
            f351848a.mo182346h(20, h132.f134406d, h132.f134407e);
        } else if (i == 4) {
            f351848a.mo182346h(15, h132.f134406d, h132.f134407e);
        } else if (i == 5) {
            f351848a.mo182346h(0, h132.f134406d, h132.f134407e);
        } else if (i == 8) {
            f351848a.mo182346h(30, h132.f134406d, h132.f134407e);
        } else if (i == 22) {
            f351848a.mo182346h(25, h132.f134406d, h132.f134407e);
        }
    }

    /* renamed from: h */
    public final void mo182346h(int i, long j, boolean z) {
        Log.m105927v("MicroMsg.MultiTaskReportLogic", "reportIDKey: type=%d time=%d translucent=%b", Integer.valueOf(i), Long.valueOf(j), Boolean.valueOf(z));
        if (j <= 0 || j > 30000) {
            Log.m105926v("MicroMsg.MultiTaskReportLogic", "reportIDKey: error data");
        } else if (i == -1 || i == 0 || i == 5 || i == 10 || i == 15 || i == 20 || i == 25 || i == 30) {
            IDKey iDKey = new IDKey();
            iDKey.SetID(1627);
            iDKey.SetKey(i + 1);
            iDKey.SetValue(j);
            IDKey iDKey2 = new IDKey();
            iDKey2.SetID(1627);
            iDKey2.SetKey(i + 2);
            iDKey2.SetValue(1);
            ArrayList arrayList = new ArrayList();
            arrayList.add(iDKey);
            arrayList.add(iDKey2);
            if (!z) {
                IDKey iDKey3 = new IDKey();
                iDKey3.SetID(1627);
                iDKey3.SetKey(i + 3);
                iDKey3.SetValue(1);
                arrayList.add(iDKey3);
            }
            C115669n.INSTANCE.mo160124a(arrayList, false);
        }
    }
}
