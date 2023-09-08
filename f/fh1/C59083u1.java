package fh1;

import al1.C54127h;
import android.graphics.Bitmap;
import cj1.C54741c;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fe1.C58961d;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import je1.C46526n3;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import sx3.C110818d0;
import sx3.C36907w;
import te3.C49876io0;
import vp1.C65834e;

/* renamed from: fh1.u1 */
public final class C59083u1 implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ C54741c f169041d;

    /* renamed from: e */
    public final /* synthetic */ ArrayList<C54741c> f169042e;

    /* renamed from: fh1.u1$a */
    public static final class C59084a extends C87413o implements C32226l<C54127h, CharSequence> {

        /* renamed from: d */
        public static final C59084a f169043d = new C59084a();

        public C59084a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C54127h hVar = (C54127h) obj;
            C87412m.m108594g(hVar, LocaleUtil.ITALIAN);
            return String.valueOf(hVar.f151977d.f157064e);
        }
    }

    /* renamed from: fh1.u1$b */
    public static final class C59085b extends C87413o implements C32226l<C54127h, CharSequence> {

        /* renamed from: d */
        public static final C59085b f169044d = new C59085b();

        public C59085b() {
            super(1);
        }

        public Object invoke(Object obj) {
            C54127h hVar = (C54127h) obj;
            C87412m.m108594g(hVar, LocaleUtil.ITALIAN);
            return String.valueOf(hVar.f151977d.f157064e);
        }
    }

    public C59083u1(C54741c cVar, ArrayList<C54741c> arrayList) {
        this.f169041d = cVar;
        this.f169042e = arrayList;
    }

    public final void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3 = i;
        int i4 = i2;
        C117747y yVar2 = yVar;
        Integer num = null;
        if (i3 == 0 && i4 == 0 && (yVar2 instanceof C46526n3)) {
            C46526n3 n3Var = (C46526n3) yVar2;
            if (n3Var.mo71875n1().size() > 0) {
                LinkedList<FinderObject> n1 = n3Var.mo71875n1();
                ArrayList arrayList = new ArrayList(C36907w.m41090l(n1, 10));
                for (FinderObject finderObject : n1) {
                    C58961d.C58963b.m68837m(C58961d.f168673a, finderObject.contact, false, 2, (Object) null);
                    C65834e.f189316a.mo89878l(FinderItem.Companion.mo79056a(finderObject, 16384), C65834e.C65836b.f189330j);
                    arrayList.add(new C54127h(finderObject));
                }
                HashMap<String, Bitmap> hashMap = C59018f2.f168857P;
                Log.m105924i("Finder.LivePromoteBannerController", "appenddata before " + C110818d0.m150921S(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C59084a.f169043d, 31, (Object) null));
                C54741c cVar = this.f169041d;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C54127h hVar = (C54127h) it.next();
                    Iterator<C54127h> it4 = cVar.f153441e.iterator();
                    int i5 = 0;
                    while (true) {
                        if (!it4.hasNext()) {
                            i5 = -1;
                            break;
                        }
                        if (it4.next().f151977d.f157064e == hVar.f151977d.f157064e) {
                            break;
                        }
                        i5++;
                    }
                    if (i5 == -1) {
                        cVar.f153441e.add(hVar);
                    }
                }
                HashMap<String, Bitmap> hashMap2 = C59018f2.f168857P;
                Log.m105924i("Finder.LivePromoteBannerController", "appenddata after " + C110818d0.m150921S(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C59085b.f169044d, 31, (Object) null));
                C54741c cVar2 = this.f169041d;
                C47350c cVar3 = n3Var.f125336g;
                if (cVar3 != null) {
                    C47465a aVar = cVar3.f127056b.f127083a;
                    C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveRelatedListResponse");
                    cVar2.f153442f = ((C49876io0) aVar).f135530e;
                    C54741c cVar4 = this.f169041d;
                    n3Var.mo71874I0();
                    cVar4.getClass();
                    return;
                }
                C87412m.m108603p("rr");
                throw null;
            }
        }
        HashMap<String, Bitmap> hashMap3 = C59018f2.f168857P;
        StringBuilder sb = new StringBuilder();
        sb.append("invalid because cgi failed. ");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(", ");
        boolean z = yVar2 instanceof C46526n3;
        sb.append(z);
        sb.append(", ");
        C46526n3 n3Var2 = z ? (C46526n3) yVar2 : null;
        if (n3Var2 != null) {
            num = Integer.valueOf(n3Var2.mo71875n1().size());
        }
        sb.append(num);
        Log.m105924i("Finder.LivePromoteBannerController", sb.toString());
        this.f169042e.add(this.f169041d);
    }
}
