package fm1;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32230s;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import o40.C61926c;
import rx3.C13598b0;
import te3.C51942x91;

/* renamed from: fm1.i */
public final class C8158i extends C87413o implements C32230s<String, String, String, LinkedList<C51942x91>, Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C8139f f27033d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8158i(C8139f fVar) {
        super(5);
        this.f27033d = fVar;
    }

    /* renamed from: D */
    public Object mo237D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        String str = (String) obj2;
        String str2 = (String) obj3;
        LinkedList linkedList = (LinkedList) obj4;
        boolean booleanValue = ((Boolean) obj5).booleanValue();
        C87412m.m108594g((String) obj, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108594g(str, "videoTabName");
        C87412m.m108594g(str2, "liveTabName");
        C87412m.m108594g(linkedList, "tabList");
        Log.m105924i("NearbyActionBarUIC", "fetchTabsInfo videoTabName:" + str + " liveTabName:" + str2 + " tabList:" + linkedList + " isHideTabs:" + booleanValue);
        C61926c.m72668M(new C8157h(this.f27033d, str, str2));
        return C13598b0.f38549a;
    }
}
