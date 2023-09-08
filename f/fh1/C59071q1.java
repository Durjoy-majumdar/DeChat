package fh1;

import a14.C0000n0;
import android.graphics.Bitmap;
import android.text.TextUtils;
import cj1.C54741c;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RecyclerHorizontalViewPager;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import ig1.C33317c;
import ik1.C33341d;
import java.util.ArrayList;
import java.util.HashMap;
import jq3.C9493c;
import kotlin.ResultKt;
import p165hr.C60106t;
import rx3.C13598b0;
import rx3.C36570n;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.LivePromoteBannerController$doDislikeBanner$2$1$1", mo125469f = "LivePromoteBannerController.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: fh1.q1 */
public final class C59071q1 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C59018f2 f169007d;

    /* renamed from: e */
    public final /* synthetic */ C54741c f169008e;

    /* renamed from: f */
    public final /* synthetic */ String f169009f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59071q1(C59018f2 f2Var, C54741c cVar, String str, C15601d<? super C59071q1> dVar) {
        super(2, dVar);
        this.f169007d = f2Var;
        this.f169008e = cVar;
        this.f169009f = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C59071q1(this.f169007d, this.f169008e, this.f169009f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C59071q1) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        FinderJumpInfo finderJumpInfo;
        ResultKt.throwOnFailure(obj);
        HashMap<String, Bitmap> hashMap = C59018f2.f168857P;
        StringBuilder sb = new StringBuilder();
        sb.append("remove, currentTitle: ");
        C9493c cVar = this.f169007d.f168882r;
        String str = null;
        C54741c cVar2 = cVar instanceof C54741c ? (C54741c) cVar : null;
        if (!(cVar2 == null || (finderJumpInfo = cVar2.f153440d) == null)) {
            str = finderJumpInfo.wording;
        }
        sb.append(str);
        Log.m105924i("Finder.LivePromoteBannerController", sb.toString());
        C59018f2 f2Var = this.f169007d;
        C54741c cVar3 = this.f169008e;
        String str2 = this.f169009f;
        synchronized (f2Var.f168885u) {
            if (f2Var.f168889y.size() > 0) {
                ArrayList<C9493c> arrayList = f2Var.f168889y;
                if (C87412m.m108589b(cVar3, arrayList.get(f2Var.f168884t % arrayList.size()))) {
                    ArrayList<C9493c> arrayList2 = f2Var.f168889y;
                    arrayList2.remove(f2Var.f168884t % arrayList2.size());
                    Log.m105924i("Finder.LivePromoteBannerController", "after remove dataList size: " + f2Var.f168889y.size());
                    WxRecyclerAdapter<C9493c> wxRecyclerAdapter = f2Var.f168879o;
                    if (wxRecyclerAdapter != null) {
                        wxRecyclerAdapter.notifyItemRemoved(f2Var.f168884t);
                    }
                }
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
        C33341d dVar = (C33341d) ((C36570n) ((C60106t) C86312j.m106911c(C60106t.class)).f171521u).getValue();
        dVar.getClass();
        C87412m.m108594g(str2, "dislikeBannerId");
        if (!TextUtils.isEmpty(str2)) {
            synchronized (dVar) {
                C33317c cVar4 = new C33317c();
                cVar4.field_dislikeBannerId = str2;
                cVar4.field_timestamp = System.currentTimeMillis();
                boolean replace = dVar.replace(cVar4);
                Log.m105925i("Finder.FinderLiveDislikeBannerStorage", "recordDislikeBanner dislikeBannerId:%s ret:%b", str2, Boolean.valueOf(replace));
                if (replace && !dVar.f90381f.contains(str2)) {
                    dVar.f90381f.add(str2);
                }
            }
        }
        if (this.f169007d.f168889y.size() <= 0) {
            RecyclerHorizontalViewPager recyclerHorizontalViewPager = this.f169007d.f168878n;
            if (recyclerHorizontalViewPager != null) {
                recyclerHorizontalViewPager.setVisibility(8);
            }
            C59018f2 f2Var2 = this.f169007d;
            f2Var2.f168881q = true;
            RecyclerHorizontalViewPager recyclerHorizontalViewPager2 = f2Var2.f168878n;
            if (recyclerHorizontalViewPager2 != null) {
                recyclerHorizontalViewPager2.setFrozeTouch(false);
            }
            Log.m105924i("Finder.LivePromoteBannerController", "only one banner gone banner plugin");
        } else {
            this.f169007d.mo84250R3();
        }
        return C13598b0.f38549a;
    }
}
