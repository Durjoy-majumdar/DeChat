package cn1;

import cn1.C0810b0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import java.util.LinkedList;
import kotlin.Result;
import ob0.C89132b;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C50397mg0;
import te3.C51533ue1;
import te3.C64273c21;
import wx3.C15601d;

/* renamed from: cn1.h0 */
public final class C0840h0 extends C87413o implements C32226l<C89132b.C89134c<C50397mg0>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f1981d;

    /* renamed from: e */
    public final /* synthetic */ C15601d<C0810b0.C0811a> f1982e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0840h0(String str, C15601d<? super C0810b0.C0811a> dVar) {
        super(1);
        this.f1981d = str;
        this.f1982e = dVar;
    }

    public Object invoke(Object obj) {
        LinkedList<C51533ue1> linkedList;
        C51533ue1 ue12;
        C64273c21 c212;
        LinkedList<C51533ue1> linkedList2;
        C51533ue1 ue13;
        C64273c21 c213;
        LinkedList<C51533ue1> linkedList3;
        C51533ue1 ue14;
        C64273c21 c214;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        StringBuilder sb = new StringBuilder();
        sb.append("#requestAndRefreshActivityIcon errType:");
        Integer num = null;
        sb.append(cVar != null ? Integer.valueOf(cVar.f256793a) : null);
        sb.append(" errCode:");
        sb.append(cVar != null ? Integer.valueOf(cVar.f256794b) : null);
        sb.append(" feedId:");
        sb.append(this.f1981d);
        Log.m105924i("Finder.LivingConvert", sb.toString());
        int i = 0;
        if (cVar != null && cVar.f256793a == 0 && cVar.f256794b == 0) {
            C50397mg0 mg02 = (C50397mg0) cVar.f256796d;
            int i2 = (mg02 == null || (linkedList3 = mg02.f138011d) == null || (ue14 = (C51533ue1) C110818d0.m150917O(linkedList3, 0)) == null || (c214 = ue14.f142798e) == null) ? 0 : c214.f182403q;
            C50397mg0 mg03 = (C50397mg0) cVar.f256796d;
            boolean z = ((mg03 == null || (linkedList2 = mg03.f138011d) == null || (ue13 = (C51533ue1) C110818d0.m150917O(linkedList2, 0)) == null || (c213 = ue13.f142798e) == null) ? 1 : c213.f182394f) == 1;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("#requestAndRefreshActivityIcon participantCount=");
            sb4.append(i2);
            sb4.append(", liveStatus=");
            C50397mg0 mg04 = (C50397mg0) cVar.f256796d;
            sb4.append((mg04 == null || (linkedList = mg04.f138011d) == null || (ue12 = (C51533ue1) C110818d0.m150917O(linkedList, 0)) == null || (c212 = ue12.f142798e) == null) ? null : Integer.valueOf(c212.f182394f));
            sb4.append(" interval=");
            C50397mg0 mg05 = (C50397mg0) cVar.f256796d;
            if (mg05 != null) {
                num = Integer.valueOf(mg05.f138013f);
            }
            sb4.append(num);
            Log.m105924i("Finder.LivingConvert", sb4.toString());
            C15601d<C0810b0.C0811a> dVar = this.f1982e;
            C50397mg0 mg06 = (C50397mg0) cVar.f256796d;
            if (mg06 != null) {
                i = mg06.f138013f;
            }
            dVar.resumeWith(Result.m168114constructorimpl(new C0810b0.C0811a(true, i, i2, z)));
        } else {
            this.f1982e.resumeWith(Result.m168114constructorimpl(new C0810b0.C0811a(false, 0, 0, true)));
        }
        return C13598b0.f38549a;
    }
}
