package ln1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.LinkedList;
import je1.C46525m1;
import ob0.C117747y;
import te3.C22489al0;
import te3.C49712hj1;
import te3.C50561nl1;

/* renamed from: ln1.c */
public final class C61314c extends C46525m1 {
    public C61314c() {
        super(new LinkedList(), (C49712hj1) null);
    }

    /* renamed from: s */
    public LinkedList<C22489al0> mo71872s() {
        LinkedList<C22489al0> linkedList = new LinkedList<>();
        linkedList.addAll(C21445b.f60694a.mo33615d());
        return linkedList;
    }

    /* renamed from: t */
    public void mo332r(int i, int i2, String str, C50561nl1 nl12, C117747y yVar) {
        C87412m.m108594g(nl12, "resp");
        Log.m105924i("Finder.NearbyLiveCgiStatusReport", "onCgiEnd errType: " + i + " errCode: " + i2 + " errMsg: " + str);
    }
}
