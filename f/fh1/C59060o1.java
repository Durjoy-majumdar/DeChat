package fh1;

import a14.C0000n0;
import android.graphics.Bitmap;
import cj1.C54741c;
import cl1.C54991o;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.Html5Info;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import di3.C86312j;
import e00.C58468e0;
import fy3.C32227p;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import jq3.C9493c;
import kotlin.ResultKt;
import rx3.C13598b0;
import rx3.C13604l;
import te3.C49056cw0;
import te3.C51663v9;
import te3.C64331dw0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.LivePromoteBannerController$checkSubTitleUpdate$1", mo125469f = "LivePromoteBannerController.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: fh1.o1 */
public final class C59060o1 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C59018f2 f168977d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59060o1(C59018f2 f2Var, C15601d<? super C59060o1> dVar) {
        super(2, dVar);
        this.f168977d = f2Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C59060o1(this.f168977d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C59060o1) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        String str;
        C64331dw0 dw02;
        C64331dw0 dw03;
        C64331dw0 dw04;
        LinkedList<C51663v9> linkedList;
        C64331dw0 dw05;
        Class cls = C54991o.class;
        ResultKt.throwOnFailure(obj);
        while (!((C54991o) this.f168977d.business(cls)).f154219K1.isEmpty()) {
            C59018f2 f2Var = this.f168977d;
            synchronized (f2Var.f168885u) {
                C49056cw0 poll = ((C54991o) f2Var.business(cls)).f154219K1.poll();
                if (poll != null) {
                    Iterator<C9493c> it = f2Var.f168889y.iterator();
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        i = -1;
                        if (!it.hasNext()) {
                            i3 = -1;
                            break;
                        }
                        C9493c next = it.next();
                        C54741c cVar = next instanceof C54741c ? (C54741c) next : null;
                        if (C87412m.m108589b((cVar == null || (dw05 = cVar.f153444h) == null) ? null : dw05.f182876d, poll.f131991d)) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 != -1 && f2Var.f168889y.size() > 0) {
                        C9493c cVar2 = f2Var.f168889y.get(i3);
                        C54741c cVar3 = cVar2 instanceof C54741c ? (C54741c) cVar2 : null;
                        if (((cVar3 == null || (dw04 = cVar3.f153444h) == null || (linkedList = dw04.f182889t) == null) ? 0 : linkedList.size()) != poll.f131992e.size()) {
                            if (cVar3 != null) {
                                cVar3.f153443g = 0;
                            }
                        }
                        if (poll.f131992e.size() > 0) {
                            C64331dw0 dw06 = cVar3 != null ? cVar3.f153444h : null;
                            if (dw06 != null) {
                                dw06.f182889t = poll.f131992e;
                            }
                        }
                        HashMap<String, Bitmap> hashMap = C59018f2.f168857P;
                        StringBuilder sb = new StringBuilder();
                        sb.append("version banner livemsg ");
                        sb.append((cVar3 == null || (dw03 = cVar3.f153444h) == null) ? null : new Integer(dw03.f182895z));
                        sb.append(" , wording: ");
                        FinderJumpInfo finderJumpInfo = poll.f131993f;
                        sb.append(finderJumpInfo != null ? finderJumpInfo.wording : null);
                        Log.m105924i("Finder.LivePromoteBannerController", sb.toString());
                        FinderJumpInfo finderJumpInfo2 = poll.f131993f;
                        if (finderJumpInfo2 != null) {
                            C54741c cVar4 = new C54741c(finderJumpInfo2);
                            Iterator<C9493c> it4 = f2Var.f168888x.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    break;
                                }
                                C9493c next2 = it4.next();
                                C54741c cVar5 = next2 instanceof C54741c ? (C54741c) next2 : null;
                                if (C87412m.m108589b((cVar5 == null || (dw02 = cVar5.f153444h) == null) ? null : dw02.f182876d, poll.f131991d)) {
                                    i = i2;
                                    break;
                                }
                                i2++;
                            }
                            f2Var.f168888x.set(i, cVar4);
                            C64331dw0 dw07 = cVar4.f153444h;
                            if (dw07 != null && dw07.f182875A) {
                                C13604l<String, String> lVar = f2Var.f168876N;
                                String str2 = lVar != null ? (String) lVar.f38555d : null;
                                String str3 = lVar != null ? (String) lVar.f38556e : null;
                                if (!(str2 == null || str3 == null)) {
                                    HashMap<String, Bitmap> hashMap2 = C59018f2.f168857P;
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("banner cacheInfo clear id: ");
                                    sb4.append(str3);
                                    sb4.append(" url ");
                                    sb4.append(str2);
                                    sb4.append(" , new info : id ");
                                    C64331dw0 dw08 = cVar4.f153444h;
                                    sb4.append(dw08 != null ? dw08.f182876d : null);
                                    sb4.append(" wording ");
                                    sb4.append(cVar4.f153440d.wording);
                                    sb4.append(" needPreload ");
                                    C64331dw0 dw09 = cVar4.f153444h;
                                    sb4.append(dw09 != null ? new Integer(dw09.f182877e) : null);
                                    Log.m105924i("Finder.LivePromoteBannerController", sb4.toString());
                                    ((C58468e0) C86312j.m106911c(C58468e0.class)).mo70773V3(str2);
                                    f2Var.f168875M.put(str3, new Long(0));
                                }
                                if (dw07.f182877e == 1) {
                                    Html5Info html5Info = cVar4.f153440d.html5_info;
                                    if (html5Info == null || (str = html5Info.url) == null) {
                                        str = "";
                                    }
                                    C59018f2.m68937n3(f2Var, str, dw07);
                                }
                            }
                            if (!C87412m.m108589b(cVar3 != null ? cVar3.f153440d : null, finderJumpInfo2)) {
                                f2Var.f168889y.set(i3, cVar4);
                                if (i3 == f2Var.f168884t % f2Var.f168889y.size()) {
                                    HashMap<String, Bitmap> hashMap3 = C59018f2.f168857P;
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append("notify index: ");
                                    sb5.append(i3);
                                    sb5.append(", wording: ");
                                    FinderJumpInfo finderJumpInfo3 = poll.f131993f;
                                    sb5.append(finderJumpInfo3 != null ? finderJumpInfo3.wording : null);
                                    Log.m105924i("Finder.LivePromoteBannerController", sb5.toString());
                                    WxRecyclerAdapter<C9493c> wxRecyclerAdapter = f2Var.f168879o;
                                    if (wxRecyclerAdapter != null) {
                                        wxRecyclerAdapter.notifyItemChanged(f2Var.f168884t, "bannerselected");
                                    }
                                }
                            }
                        }
                    }
                    C13598b0 b0Var = C13598b0.f38549a;
                }
            }
        }
        return C13598b0.f38549a;
    }
}
