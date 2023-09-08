package is2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import te3.C101789j00;
import te3.C101804kv2;

/* renamed from: is2.d */
public final class C98790d {
    /* renamed from: a */
    public static final List<C101804kv2> m128577a(TimeLineObject timeLineObject) {
        SnsMethodCalculate.markStartTimeMs("getMediaList", "com.tencent.mm.plugin.sns.model.withta.UtilsKt");
        C87412m.m108594g(timeLineObject, "<this>");
        C101789j00 j002 = timeLineObject.ContentObj;
        LinkedList<C101804kv2> linkedList = j002 != null ? j002.f298427h : null;
        C87412m.m108591d(linkedList);
        SnsMethodCalculate.markEndTimeMs("getMediaList", "com.tencent.mm.plugin.sns.model.withta.UtilsKt");
        return linkedList;
    }
}
