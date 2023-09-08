package tn1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C50221l60;
import te3.C50638o60;

/* renamed from: tn1.g */
public final class C52356g extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C52360k f146331d;

    /* renamed from: e */
    public final /* synthetic */ C89132b.C89134c<C50638o60> f146332e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52356g(C52360k kVar, C89132b.C89134c<C50638o60> cVar) {
        super(0);
        this.f146331d = kVar;
        this.f146332e = cVar;
    }

    public Object invoke() {
        LinkedList<C50221l60> linkedList;
        LinkedList<C50221l60> linkedList2;
        C52360k kVar = this.f146331d;
        Integer num = null;
        kVar.f146343g = null;
        int size = kVar.f146344h.size();
        C89132b.C89134c<C50638o60> cVar = this.f146332e;
        int i = cVar.f256793a;
        if (i == 0 && cVar.f256794b == 0) {
            String str = this.f146331d.f146342f;
            StringBuilder sb = new StringBuilder();
            sb.append("updateLastOffset, from:");
            sb.append(this.f146331d.f146338b);
            sb.append(", to:");
            C50638o60 o602 = (C50638o60) this.f146332e.f256796d;
            sb.append(o602 != null ? o602.f138978g : this.f146331d.f146338b);
            Log.m105924i(str, sb.toString());
            String str2 = this.f146331d.f146342f;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("result size:");
            C50638o60 o603 = (C50638o60) this.f146332e.f256796d;
            if (!(o603 == null || (linkedList2 = o603.f138975d) == null)) {
                num = Integer.valueOf(linkedList2.size());
            }
            sb4.append(num);
            Log.m105924i(str2, sb4.toString());
            C52360k kVar2 = this.f146331d;
            C50638o60 o604 = (C50638o60) this.f146332e.f256796d;
            kVar2.f146338b = o604 != null ? o604.f138978g : kVar2.f146338b;
            if (!(o604 == null || (linkedList = o604.f138975d) == null)) {
                for (C50221l60 l602 : linkedList) {
                    if (l602 != null) {
                        ArrayList<C14051a> arrayList = kVar2.f146344h;
                        String str3 = l602.f137207q;
                        if (str3 == null) {
                            str3 = "";
                        }
                        arrayList.add(new C14051a(l602, str3));
                    }
                }
            }
            this.f146331d.f146340d.mo237D(Integer.valueOf(this.f146332e.f256793a), Integer.valueOf(this.f146332e.f256794b), this.f146332e.f256796d, Integer.valueOf(size), Integer.valueOf(this.f146331d.f146344h.size()));
        } else {
            this.f146331d.f146340d.mo237D(Integer.valueOf(i), Integer.valueOf(this.f146332e.f256794b), this.f146332e.f256796d, Integer.valueOf(size), Integer.valueOf(size));
        }
        return C13598b0.f38549a;
    }
}
