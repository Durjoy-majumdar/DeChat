package th3;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.LinkedList;
import o40.C61926c;
import rx3.C13598b0;
import te3.C101814mn2;
import vh3.C102191c;

/* renamed from: th3.c */
public final class C101895c implements C102191c {

    /* renamed from: a */
    public final /* synthetic */ C101814mn2 f300050a;

    /* renamed from: th3.c$a */
    public static final class C101896a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ int f300051d;

        /* renamed from: e */
        public final /* synthetic */ C101814mn2 f300052e;

        /* renamed from: f */
        public final /* synthetic */ C101814mn2 f300053f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C101896a(int i, C101814mn2 mn22, C101814mn2 mn23) {
            super(0);
            this.f300051d = i;
            this.f300052e = mn22;
            this.f300053f = mn23;
        }

        public Object invoke() {
            int i = -1;
            C101893b.f300048g--;
            int i2 = this.f300051d;
            int i3 = 0;
            if (i2 == 2) {
                C101893b bVar = C101893b.f300042a;
                String str = this.f300052e.f298862d;
                C87412m.m108593f(str, "it.LensId");
                LinkedList<C101814mn2> linkedList = C101893b.f300047f.f138692d;
                C87412m.m108593f(linkedList, "historyList.lensInfoList");
                Iterator<C101814mn2> it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (C87412m.m108589b(it.next().f298862d, str)) {
                        i = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i >= 0) {
                    C101893b.f300047f.f138692d.remove(i);
                    bVar.mo141390b();
                }
            } else if (i2 == 0 && this.f300053f != null) {
                LinkedList<C101814mn2> linkedList2 = C101893b.f300047f.f138692d;
                C87412m.m108593f(linkedList2, "historyList.lensInfoList");
                C101814mn2 mn22 = this.f300053f;
                Iterator<C101814mn2> it4 = linkedList2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    } else if (C87412m.m108589b(it4.next().f298862d, mn22.f298862d)) {
                        i = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i > 0) {
                    C101814mn2 mn23 = this.f300053f;
                    C101814mn2 mn24 = C101893b.f300047f.f138692d.get(i);
                    C87412m.m108593f(mn24, "historyList.lensInfoList[index]");
                    C101814mn2 mn25 = mn24;
                    C87412m.m108594g(mn23, "from");
                    mn25.f298862d = mn23.f298862d;
                    mn25.f298866h = mn23.f298866h;
                    mn25.f298863e = mn23.f298863e;
                    mn25.f298864f = mn23.f298864f;
                    mn25.f298865g = mn23.f298865g;
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C101895c(C101814mn2 mn22) {
        this.f300050a = mn22;
    }

    /* renamed from: a */
    public void mo125818a(int i, C101814mn2 mn22) {
        C101893b bVar = C101893b.f300042a;
        Log.m105924i("MicroMsg.LensInfoUserCache", "onResult: " + this.f300050a.f298862d + ", " + i);
        C61926c.m72668M(new C101896a(i, this.f300050a, mn22));
    }
}
