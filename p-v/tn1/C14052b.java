package tn1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C50085k60;
import te3.C50221l60;

/* renamed from: tn1.b */
public final class C14052b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C14056f f39417d;

    /* renamed from: e */
    public final /* synthetic */ C89132b.C89134c<C50085k60> f39418e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14052b(C14056f fVar, C89132b.C89134c<C50085k60> cVar) {
        super(0);
        this.f39417d = fVar;
        this.f39418e = cVar;
    }

    public Object invoke() {
        LinkedList<C50221l60> linkedList;
        LinkedList<C50221l60> linkedList2;
        C14056f fVar = this.f39417d;
        Integer num = null;
        fVar.f39429g = null;
        int size = fVar.f39430h.size();
        C89132b.C89134c<C50085k60> cVar = this.f39418e;
        int i = cVar.f256793a;
        if (i == 0 && cVar.f256794b == 0) {
            C14056f fVar2 = this.f39417d;
            int i2 = 0;
            Iterator<C14051a> it = fVar2.f39430h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                } else if (C87412m.m108589b(it.next().f39399d.f137208r, fVar2.f39425c)) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 < 0) {
                i2 = this.f39417d.f39430h.size();
            }
            ArrayList<C14051a> arrayList = this.f39417d.f39430h;
            arrayList.subList(i2, arrayList.size()).clear();
            String str = this.f39417d.f39428f;
            StringBuilder sb = new StringBuilder();
            sb.append("updateOrderId, from:");
            sb.append(this.f39417d.f39425c);
            sb.append(", to:");
            String str2 = ((C50085k60) this.f39418e.f256796d).f136582g;
            if (str2 == null) {
                str2 = "";
            }
            sb.append(str2);
            Log.m105924i(str, sb.toString());
            String str3 = this.f39417d.f39428f;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("result size:");
            C50085k60 k602 = (C50085k60) this.f39418e.f256796d;
            if (!(k602 == null || (linkedList2 = k602.f136579d) == null)) {
                num = Integer.valueOf(linkedList2.size());
            }
            sb4.append(num);
            Log.m105924i(str3, sb4.toString());
            C14056f fVar3 = this.f39417d;
            String str4 = ((C50085k60) this.f39418e.f256796d).f136582g;
            if (str4 == null) {
                str4 = "";
            }
            fVar3.getClass();
            fVar3.f39425c = str4;
            C50085k60 k603 = (C50085k60) this.f39418e.f256796d;
            if (!(k603 == null || (linkedList = k603.f136579d) == null)) {
                C14056f fVar4 = this.f39417d;
                for (C50221l60 l602 : linkedList) {
                    if (l602 != null) {
                        ArrayList<C14051a> arrayList2 = fVar4.f39430h;
                        String str5 = l602.f137207q;
                        if (str5 == null) {
                            str5 = "";
                        }
                        arrayList2.add(new C14051a(l602, str5));
                    }
                }
            }
            this.f39417d.f39427e.mo237D(Integer.valueOf(this.f39418e.f256793a), Integer.valueOf(this.f39418e.f256794b), this.f39418e.f256796d, Integer.valueOf(size), Integer.valueOf(this.f39417d.f39430h.size()));
        } else {
            this.f39417d.f39427e.mo237D(Integer.valueOf(i), Integer.valueOf(this.f39418e.f256794b), this.f39418e.f256796d, Integer.valueOf(size), Integer.valueOf(size));
        }
        return C13598b0.f38549a;
    }
}
