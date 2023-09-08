package er1;

import cl1.C54991o;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import sx3.C110818d0;
import te3.C48924by0;
import te3.C50718oq3;

/* renamed from: er1.e1 */
public final class C45681e1 {

    /* renamed from: a */
    public static final C45681e1 f123485a = new C45681e1();

    /* renamed from: er1.e1$a */
    public static final class C45682a extends C87413o implements C32226l<C50718oq3, CharSequence> {

        /* renamed from: d */
        public static final C45682a f123486d = new C45682a();

        public C45682a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C50718oq3 oq32 = (C50718oq3) obj;
            StringBuilder sb = new StringBuilder();
            C87412m.m108593f(oq32, LocaleUtil.ITALIAN);
            sb.append("related_event_type:" + oq32.f139317d + ", related_event_id:" + oq32.f139318e);
            sb.append(',');
            return sb.toString();
        }
    }

    /* renamed from: a */
    public final void mo71179a(C54991o oVar, String str, C48924by0 by02) {
        C87412m.m108594g(oVar, "<this>");
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(by02, "event_info");
        oVar.f154210I = by02.f131380d;
        oVar.f154214J = by02.f131382f;
        oVar.f154218K = by02.f131381e;
        oVar.mo75962H4(by02.f131383g);
        ((ArrayList) oVar.f154226M).clear();
        List<C50718oq3> list = oVar.f154226M;
        LinkedList<C50718oq3> linkedList = by02.f131384h;
        C87412m.m108593f(linkedList, "event_info.related_events");
        ((ArrayList) list).addAll(linkedList);
        StringBuilder sb = new StringBuilder();
        sb.append("setEventInfo ");
        sb.append(str);
        sb.append(", id:");
        sb.append(by02.f131380d);
        sb.append(", event_status:");
        sb.append(by02.f131382f);
        sb.append(", participant_identity:");
        sb.append(by02.f131381e);
        sb.append(", stream_status:");
        sb.append(by02.f131383g);
        sb.append("related_events:");
        LinkedList<C50718oq3> linkedList2 = by02.f131384h;
        C87412m.m108593f(linkedList2, "event_info.related_events");
        sb.append(C110818d0.m150921S(linkedList2, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C45682a.f123486d, 31, (Object) null));
        Log.m105924i("Finder.OlympicsLiveRoomUtil", sb.toString());
    }
}
