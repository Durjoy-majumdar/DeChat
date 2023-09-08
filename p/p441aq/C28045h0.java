package p441aq;

import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.storage.C30790w2;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import java.util.ArrayList;
import p008bq.C28399y0;
import p490dl.C97489o;
import wh3.C102451g;

@C86522b
/* renamed from: aq.h0 */
public class C28045h0 extends C86301e implements C28399y0 {
    /* renamed from: bY */
    public ArrayList<? extends IEmojiInfo> mo55758bY() {
        C97489o g = C97489o.m125592g();
        ArrayList<? extends IEmojiInfo> arrayList = g.f286138j.get("download_custom");
        if (arrayList != null && !g.f286129a) {
            return arrayList;
        }
        g.f286129a = false;
        if (C86709a0.m107531m().mo58407a().mo71804b()) {
            C102451g d = C30790w2.m39221h().mo57717d();
            d.getClass();
            ArrayList<? extends IEmojiInfo> arrayList2 = new ArrayList<>();
            arrayList2.addAll(d.mo142034CP(81, true));
            g.f286138j.put("download_custom", arrayList2);
            return arrayList2;
        }
        throw new UnsupportedOperationException("need get from main process");
    }
}
