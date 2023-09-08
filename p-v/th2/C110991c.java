package th2;

import android.util.Pair;
import com.tencent.p014mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct;
import com.tencent.p014mm.plugin.recordvideo.jumper.MediaEditReportInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import sx3.C110818d0;
import sx3.C36907w;
import z04.C112551y;

/* renamed from: th2.c */
public final class C110991c {

    /* renamed from: a */
    public MultiMediaEditInfoStruct f332424a = new MultiMediaEditInfoStruct();

    public C110991c() {
        mo162665a();
    }

    /* renamed from: a */
    public final void mo162665a() {
        MultiMediaEditInfoStruct multiMediaEditInfoStruct = new MultiMediaEditInfoStruct();
        this.f332424a = multiMediaEditInfoStruct;
        multiMediaEditInfoStruct.f310220j = multiMediaEditInfoStruct.mo86045b("isSlowMotion", "", true);
        MultiMediaEditInfoStruct multiMediaEditInfoStruct2 = this.f332424a;
        multiMediaEditInfoStruct2.f310216f = multiMediaEditInfoStruct2.mo86045b("ExtraInfo", "", true);
    }

    /* renamed from: b */
    public final void mo162666b(List<? extends MediaEditReportInfo.EditItem> list, boolean z) {
        List<? extends MediaEditReportInfo.EditItem> list2 = list;
        C87412m.m108594g(list2, "editList");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list2, 10));
        for (MediaEditReportInfo.EditItem editItem : list) {
            arrayList.add(Integer.valueOf(editItem.isBeauty ? 1 : 0));
        }
        String S = C110818d0.m150921S(arrayList, "#", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null);
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(list2, 10));
        for (MediaEditReportInfo.EditItem editItem2 : list) {
            arrayList2.add(Integer.valueOf(z ? 0 : Util.videoMsToSec(editItem2.targetDuration)));
        }
        String S2 = C110818d0.m150921S(arrayList2, "#", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null);
        ArrayList arrayList3 = new ArrayList(C36907w.m41090l(list2, 10));
        for (MediaEditReportInfo.EditItem editItem3 : list) {
            arrayList3.add(Integer.valueOf(z ? 0 : Util.videoMsToSec(editItem3.originDuration)));
        }
        String S3 = C110818d0.m150921S(arrayList3, "#", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null);
        ArrayList arrayList4 = new ArrayList(C36907w.m41090l(list2, 10));
        for (MediaEditReportInfo.EditItem editItem4 : list) {
            arrayList4.add(Integer.valueOf(editItem4.dragCount));
        }
        String S4 = C110818d0.m150921S(arrayList4, "#", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null);
        ArrayList arrayList5 = new ArrayList(C36907w.m41090l(list2, 10));
        for (MediaEditReportInfo.EditItem editItem5 : list) {
            arrayList5.add(Integer.valueOf(editItem5.scaleCount));
        }
        String S5 = C110818d0.m150921S(arrayList5, "#", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null);
        ArrayList arrayList6 = new ArrayList(C36907w.m41090l(list2, 10));
        for (MediaEditReportInfo.EditItem editItem6 : list) {
            arrayList6.add(Integer.valueOf(editItem6.clickEditCount));
        }
        String S6 = C110818d0.m150921S(arrayList6, "#", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null);
        ArrayList arrayList7 = new ArrayList(C36907w.m41090l(list2, 10));
        for (MediaEditReportInfo.EditItem editItem7 : list) {
            arrayList7.add(Integer.valueOf(editItem7.durationCutCount));
        }
        String S7 = C110818d0.m150921S(arrayList7, "#", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null);
        ArrayList arrayList8 = new ArrayList(C36907w.m41090l(list2, 10));
        for (MediaEditReportInfo.EditItem editItem8 : list) {
            arrayList8.add(Integer.valueOf(editItem8.durationScrollCount));
        }
        String S8 = C110818d0.m150921S(arrayList8, "#", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null);
        ArrayList arrayList9 = new ArrayList(C36907w.m41090l(list2, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            int i = 1;
            if (!it.hasNext()) {
                break;
            }
            MediaEditReportInfo.EditItem editItem9 = (MediaEditReportInfo.EditItem) it.next();
            String str = S;
            ArrayList arrayList10 = arrayList9;
            if (editItem9.targetDuration >= editItem9.originDuration) {
                i = 0;
            }
            ArrayList arrayList11 = arrayList10;
            arrayList11.add(Integer.valueOf(i));
            arrayList9 = arrayList11;
            S = str;
        }
        String str2 = S;
        ArrayList arrayList12 = arrayList9;
        String S9 = C110818d0.m150921S(arrayList9, "#", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null);
        ArrayList arrayList13 = new ArrayList(C36907w.m41090l(list2, 10));
        for (MediaEditReportInfo.EditItem editItem10 : list) {
            arrayList13.add(Integer.valueOf(editItem10.type));
        }
        String S10 = C110818d0.m150921S(arrayList13, "#", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null);
        MultiMediaEditInfoStruct multiMediaEditInfoStruct = this.f332424a;
        multiMediaEditInfoStruct.f310217g = multiMediaEditInfoStruct.mo86045b("isBeauty", str2, true);
        MultiMediaEditInfoStruct multiMediaEditInfoStruct2 = this.f332424a;
        multiMediaEditInfoStruct2.f310218h = multiMediaEditInfoStruct2.mo86045b("targetDuration", S2, true);
        MultiMediaEditInfoStruct multiMediaEditInfoStruct3 = this.f332424a;
        multiMediaEditInfoStruct3.f310219i = multiMediaEditInfoStruct3.mo86045b("originDuration", S3, true);
        MultiMediaEditInfoStruct multiMediaEditInfoStruct4 = this.f332424a;
        multiMediaEditInfoStruct4.f310221k = multiMediaEditInfoStruct4.mo86045b("dragCount", S4, true);
        MultiMediaEditInfoStruct multiMediaEditInfoStruct5 = this.f332424a;
        multiMediaEditInfoStruct5.f310222l = multiMediaEditInfoStruct5.mo86045b("scaleCount", S5, true);
        MultiMediaEditInfoStruct multiMediaEditInfoStruct6 = this.f332424a;
        multiMediaEditInfoStruct6.f310223m = multiMediaEditInfoStruct6.mo86045b("clickEditCount", S6, true);
        MultiMediaEditInfoStruct multiMediaEditInfoStruct7 = this.f332424a;
        multiMediaEditInfoStruct7.f310224n = multiMediaEditInfoStruct7.mo86045b("durationCutCount", S7, true);
        MultiMediaEditInfoStruct multiMediaEditInfoStruct8 = this.f332424a;
        multiMediaEditInfoStruct8.f310225o = multiMediaEditInfoStruct8.mo86045b("durationScrollCount", S8, true);
        MultiMediaEditInfoStruct multiMediaEditInfoStruct9 = this.f332424a;
        multiMediaEditInfoStruct9.f310226p = multiMediaEditInfoStruct9.mo86045b("isDurationCut", S9, true);
        MultiMediaEditInfoStruct multiMediaEditInfoStruct10 = this.f332424a;
        multiMediaEditInfoStruct10.f310231u = multiMediaEditInfoStruct10.mo86045b("VideoType", S10, true);
        this.f332424a.f310213D = 101;
    }

    /* renamed from: c */
    public final void mo162667c(boolean z, HashMap<String, Pair<Integer, Long>> hashMap) {
        C87412m.m108594g(hashMap, "labelMap");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("count", hashMap.size());
        StringBuffer stringBuffer = new StringBuffer();
        Collection<Pair<Integer, Long>> values = hashMap.values();
        C87412m.m108593f(values, "labelMap.values");
        for (Pair pair : values) {
            StringBuilder sb = new StringBuilder();
            sb.append(pair.first);
            sb.append('#');
            stringBuffer.append(sb.toString());
        }
        jSONObject.put("labelList", stringBuffer);
        jSONObject.put("enable", z ? 1 : 0);
        MultiMediaEditInfoStruct multiMediaEditInfoStruct = this.f332424a;
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "json.toString()");
        multiMediaEditInfoStruct.f310210A = multiMediaEditInfoStruct.mo86045b("FilterInfo", C112551y.m153814n(jSONObject2, ",", ";", false), true);
        Log.m105924i("MicroMsg.MultiMediaEditReport", "filterInfo:" + this.f332424a.f310210A);
    }
}
