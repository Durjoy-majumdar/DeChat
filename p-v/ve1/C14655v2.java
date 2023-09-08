package ve1;

import cm1.C0707a0;
import cm1.C0712b0;
import cm1.C0740i2;
import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import com.tencent.p014mm.plugin.finder.convert.FinderFeedLiveListConvert;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8779k1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import o40.C61926c;
import org.json.JSONArray;
import rx3.C13598b0;
import sk1.C63947a;
import sx3.C110818d0;
import te3.C49396f91;
import te3.C64273c21;

/* renamed from: ve1.v2 */
public final class C14655v2 implements C8779k1 {

    /* renamed from: a */
    public final /* synthetic */ FinderFeedLiveListConvert f40536a;

    /* renamed from: ve1.v2$a */
    public static final class C14656a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedLiveListConvert f40537d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList<C0712b0> f40538e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14656a(FinderFeedLiveListConvert finderFeedLiveListConvert, ArrayList<C0712b0> arrayList) {
            super(0);
            this.f40537d = finderFeedLiveListConvert;
            this.f40538e = arrayList;
        }

        public Object invoke() {
            String str;
            FinderObject finderObject;
            FinderContact finderContact;
            FinderFeedLiveListConvert finderFeedLiveListConvert = this.f40537d;
            ArrayList<C0712b0> arrayList = this.f40538e;
            C0707a0 a0Var = finderFeedLiveListConvert.f12806j;
            FeedUpdateEvent feedUpdateEvent = new FeedUpdateEvent();
            FeedUpdateEvent.C1041a aVar = feedUpdateEvent.f9173d;
            aVar.f9174a = a0Var.f1692f;
            int i = 1;
            aVar.f9177d = 1;
            C0712b0 b0Var = (C0712b0) C110818d0.m150916N(arrayList);
            if (!(b0Var == null || (finderObject = b0Var.f1709d) == null || (finderContact = finderObject.contact) == null)) {
                i = finderContact.liveStatus;
            }
            aVar.f9182i = i;
            FeedUpdateEvent.C1041a aVar2 = feedUpdateEvent.f9173d;
            if (arrayList.isEmpty()) {
                str = "";
            } else {
                JSONArray jSONArray = new JSONArray();
                for (C0712b0 b0Var2 : arrayList) {
                    if (b0Var2 instanceof C0712b0) {
                        FinderContact finderContact2 = b0Var2.f1709d.contact;
                        jSONArray.put(finderContact2 != null ? finderContact2.username : null);
                    }
                }
                str = jSONArray.toString();
                C87412m.m108593f(str, "array.toString()");
            }
            aVar2.f9181h = str;
            feedUpdateEvent.f9173d.f9175b = 9;
            feedUpdateEvent.publish();
            return C13598b0.f38549a;
        }
    }

    public C14655v2(FinderFeedLiveListConvert finderFeedLiveListConvert) {
        this.f40536a = finderFeedLiveListConvert;
    }

    /* renamed from: a */
    public void mo9621a(int i, int i2, String str, C49396f91 f912) {
        ArrayList<C0712b0> arrayList;
        C64273c21 c212;
        int i3 = i;
        int i4 = i2;
        C49396f91 f913 = f912;
        C87412m.m108594g(f913, "resp");
        FinderFeedLiveListConvert finderFeedLiveListConvert = this.f40536a;
        boolean z = false;
        finderFeedLiveListConvert.f12807n = false;
        if (i3 == 0 && i4 == 0) {
            String str2 = finderFeedLiveListConvert.f12804h;
            Log.m105924i(str2, "before merge live list:" + this.f40536a.f12806j);
            C0707a0 a0Var = this.f40536a.f12806j;
            a0Var.getClass();
            LinkedList<FinderObject> linkedList = f913.f133359d;
            Log.m105924i("FinderFeedLiveList", "merge remote list size:" + linkedList.size());
            a0Var.f1690d = f913.f133360e;
            a0Var.f1693g = f913.f133361f > 0;
            LinkedList linkedList2 = new LinkedList();
            for (FinderObject finderObject : linkedList) {
                Iterator<C0740i2> it = a0Var.f1691e.iterator();
                int i5 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i5 = -1;
                        break;
                    }
                    if (it.next().getItemId() == finderObject.f164794id) {
                        break;
                    }
                    i5++;
                }
                Iterator it4 = linkedList2.iterator();
                int i6 = 0;
                while (true) {
                    if (!it4.hasNext()) {
                        i6 = -1;
                        break;
                    }
                    if (((FinderObject) it4.next()).f164794id == finderObject.f164794id) {
                        break;
                    }
                    i6++;
                }
                if (i5 == -1 && i6 == -1 && C63947a.f181274a.mo88732r(finderObject)) {
                    linkedList2.add(finderObject);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("merge live list feed:");
                    sb.append((finderObject == null || (c212 = finderObject.liveInfo) == null) ? 0 : c212.f182392d);
                    sb.append(',');
                    sb.append(finderObject.nickname);
                    sb.append(" exist!");
                    Log.m105924i("FinderFeedLiveList", sb.toString());
                }
            }
            if (linkedList2.size() > 0) {
                arrayList = a0Var.mo685l(linkedList2);
                a0Var.f1691e.addAll(arrayList);
                a0Var.mo687n();
                a0Var.mo684k();
            } else {
                arrayList = null;
            }
            if (arrayList == null || arrayList.isEmpty()) {
                z = true;
            }
            if (!z) {
                C61926c.m72668M(new C14656a(this.f40536a, arrayList));
            }
            String str3 = this.f40536a.f12804h;
            Log.m105924i(str3, "after merge live list:" + this.f40536a.f12806j);
            return;
        }
        String str4 = finderFeedLiveListConvert.f12804h;
        Log.m105924i(str4, "[onCgiBack] errType=" + i3 + " errCode=" + i4 + " errMsg=" + str + '}');
    }
}
