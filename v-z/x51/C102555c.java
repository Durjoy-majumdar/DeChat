package x51;

import android.content.Context;
import com.tencent.p014mm.pluginsdk.model.C6653c1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C96984r2;
import di3.C86312j;
import eb0.C75592q0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import p179jw.C9531b;
import te3.C101824o80;
import x51.C102556d;
import x51.C102562g;

/* renamed from: x51.c */
public class C102555c {
    /* renamed from: a */
    public static void m135403a(ArrayList<C6653c1> arrayList, C102556d dVar) {
        if (C75592q0.m90796z() && dVar != null && arrayList != null && arrayList.size() > 0) {
            Iterator<C6653c1> it = arrayList.iterator();
            while (it.hasNext()) {
                C6653c1 next = it.next();
                if (next != null) {
                    boolean z = true;
                    Log.m105925i("MicroMsg.EmojiGoogleMarketTool", "endSeachGoogleMarket: %s", next);
                    C96984r2 k = dVar.mo142183k(next.f23970b);
                    int i = next.f23974f;
                    if (i == 10232) {
                        k.f284152g = next.f23971c;
                        k.f284150e = next.f23972d;
                        k.f284151f = new BigDecimal(next.f23973e).divide(new BigDecimal(1000000)).toString();
                        k.f284148c = 12;
                        int i2 = k.f284147b;
                        if (!(i2 == 7)) {
                            if (i2 != 6) {
                                z = false;
                            }
                            if (!z) {
                                k.mo135631a(4);
                            }
                        }
                    } else {
                        k.f284148c = 10;
                        k.f284149d = i;
                        int i3 = k.f284147b;
                        if (!(i3 == 7)) {
                            if (!(i3 == 6)) {
                                if (i3 != 3) {
                                    z = false;
                                }
                                if (!z) {
                                    k.mo135631a(10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static void m135404b(C102556d dVar, C9531b.C9532a aVar) {
        if (C75592q0.m90796z() && dVar != null) {
            ArrayList<C102562g> arrayList = dVar.f301972d;
            if ((arrayList == null ? 0 : arrayList.size()) > 0 && aVar != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator<C102562g> it = dVar.iterator();
                while (true) {
                    C102556d.C102558b bVar = (C102556d.C102558b) it;
                    if (!bVar.hasNext()) {
                        break;
                    }
                    C102562g gVar = (C102562g) bVar.next();
                    if (!(gVar == null || gVar.f301982a == C102562g.C102563a.cellset)) {
                        C101824o80 o802 = gVar.f301983b;
                        boolean e = C102561f.m135425e(o802);
                        boolean b = C102561f.m135422b(o802);
                        if (!e && !b) {
                            arrayList2.add(o802.f298994d);
                            dVar.mo142183k(o802.f298994d).f284148c = 11;
                        }
                    }
                }
                Context context = MMApplicationContext.getContext();
                if (arrayList2.size() > 0) {
                    ((C9531b) C86312j.m106911c(C9531b.class)).mo10037oy(context, (String[]) arrayList2.toArray(new String[arrayList2.size()]), aVar);
                }
            }
        }
    }
}
