package fh1;

import android.graphics.Bitmap;
import android.text.TextUtils;
import cj1.C54741c;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.JsApiCheckIsSupportFaceDetect;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.Html5Info;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.RecyclerHorizontalViewPager;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import ex0.C45700h;
import f40.C86709a0;
import gg1.C32444a;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import jq3.C9493c;
import te3.C64331dw0;
import wg1.C15346r1;

/* renamed from: fh1.x1 */
public final class C59088x1 implements RecyclerHorizontalViewPager.C57875a {

    /* renamed from: d */
    public final /* synthetic */ C59018f2 f169048d;

    /* renamed from: fh1.x1$a */
    public static final class C59089a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f169049d;

        /* renamed from: e */
        public final /* synthetic */ String f169050e;

        /* renamed from: f */
        public final /* synthetic */ C54741c f169051f;

        /* renamed from: g */
        public final /* synthetic */ C59018f2 f169052g;

        /* renamed from: h */
        public final /* synthetic */ C64331dw0 f169053h;

        public C59089a(int i, String str, C54741c cVar, C59018f2 f2Var, C64331dw0 dw02) {
            this.f169049d = i;
            this.f169050e = str;
            this.f169051f = cVar;
            this.f169052g = f2Var;
            this.f169053h = dw02;
        }

        public final void run() {
            if (this.f169049d == 1 && !TextUtils.isEmpty(this.f169050e) && C87412m.m108589b(this.f169051f, this.f169052g.f168882r)) {
                HashMap<String, Bitmap> hashMap = C59018f2.f168857P;
                Log.m105924i("Finder.LivePromoteBannerController", "need preload  webview");
                C59018f2.m68937n3(this.f169052g, this.f169050e, this.f169053h);
            }
        }
    }

    public C59088x1(C59018f2 f2Var) {
        this.f169048d = f2Var;
    }

    /* renamed from: a */
    public void mo23719a(int i, boolean z, boolean z2) {
        Html5Info html5Info;
        String str;
        C59018f2 f2Var;
        RecyclerHorizontalViewPager recyclerHorizontalViewPager;
        String str2;
        FinderJumpInfo finderJumpInfo;
        FinderJumpInfo finderJumpInfo2;
        C59018f2 f2Var2 = this.f169048d;
        if (f2Var2.f168884t != -1) {
            f2Var2.f168884t = i;
            HashMap<String, Bitmap> hashMap = C59018f2.f168857P;
            Log.m105924i("Finder.LivePromoteBannerController", "hand change index: " + this.f169048d.f168884t);
            if (this.f169048d.f168889y.size() > 0) {
                C59018f2 f2Var3 = this.f169048d;
                ArrayList<C9493c> arrayList = f2Var3.f168889y;
                f2Var3.f168882r = arrayList.get(f2Var3.f168884t % arrayList.size());
            }
        }
        C9493c cVar = this.f169048d.f168882r;
        String str3 = null;
        C54741c cVar2 = cVar instanceof C54741c ? (C54741c) cVar : null;
        HashMap<String, Bitmap> hashMap2 = C59018f2.f168857P;
        StringBuilder sb = new StringBuilder();
        sb.append("pagechange title :");
        sb.append((cVar2 == null || (finderJumpInfo2 = cVar2.f153440d) == null) ? null : finderJumpInfo2.wording);
        Log.m105924i("Finder.LivePromoteBannerController", sb.toString());
        C64331dw0 dw02 = cVar2 != null ? cVar2.f153444h : null;
        boolean z3 = false;
        int i2 = (cVar2 == null || (finderJumpInfo = cVar2.f153440d) == null) ? 0 : finderJumpInfo.ext_type;
        if (cVar2 != null) {
            this.f169048d.mo84241I3(cVar2);
            C115669n nVar = C115669n.INSTANCE;
            Object[] objArr = new Object[3];
            if (dw02 == null || (str2 = dw02.f182876d) == null) {
                str2 = "";
            }
            objArr[0] = str2;
            objArr[1] = 2;
            objArr[2] = Integer.valueOf(this.f169048d.mo84243K3(cVar2));
            nVar.mo160131h(27755, objArr);
            if (i2 == 1) {
                C15346r1 r1Var = C15346r1.f41686a;
                C64331dw0 dw03 = cVar2.f153444h;
                if (dw03 != null) {
                    str3 = dw03.f182876d;
                }
                r1Var.mo14181a(1, str3);
                int indexOf = this.f169048d.f168889y.indexOf(cVar2);
                Log.m105924i("Finder.LivePromoteBannerController", "gift add 2 del, index = " + indexOf);
                this.f169048d.f168865C.add(cVar2);
            } else {
                C59018f2 f2Var4 = this.f169048d;
                for (C54741c cVar3 : f2Var4.f168865C) {
                    int indexOf2 = f2Var4.f168889y.indexOf(cVar3);
                    if (indexOf2 >= 0 && indexOf2 < f2Var4.f168889y.size()) {
                        HashMap<String, Bitmap> hashMap3 = C59018f2.f168857P;
                        Log.m105924i("Finder.LivePromoteBannerController", "gift 2 del, index = " + indexOf2);
                        f2Var4.f168889y.remove(cVar3);
                        WxRecyclerAdapter<C9493c> wxRecyclerAdapter = f2Var4.f168879o;
                        if (wxRecyclerAdapter != null) {
                            wxRecyclerAdapter.notifyItemRemoved(indexOf2);
                        }
                    }
                }
                this.f169048d.f168865C.clear();
            }
            C59018f2 f2Var5 = this.f169048d;
            if (f2Var5.f168872J) {
                f2Var5.mo84250R3();
                this.f169048d.f168872J = false;
            }
            C59018f2 f2Var6 = this.f169048d;
            WxRecyclerAdapter<C9493c> wxRecyclerAdapter2 = f2Var6.f168879o;
            if (wxRecyclerAdapter2 != null) {
                int i3 = f2Var6.f168884t;
                HashMap<String, Bitmap> hashMap4 = C59018f2.f168857P;
                wxRecyclerAdapter2.notifyItemChanged(i3, "bannerselected");
            }
        }
        if (cVar2 != null && dw02 != null && (html5Info = cVar2.f153440d.html5_info) != null) {
            this.f169048d.getClass();
            if (html5Info.style == 1) {
                int i4 = dw02.f182877e;
                int i5 = dw02.f182891v;
                Html5Info html5Info2 = cVar2.f153440d.html5_info;
                if (html5Info2 == null || (str = html5Info2.url) == null) {
                    str = "";
                }
                if (C32444a.f86201u.mo60266n().intValue() != 2) {
                    if (i5 == 1) {
                        this.f169048d.getClass();
                        if (str.length() == 0) {
                            z3 = true;
                        }
                        if (z3) {
                            Log.m105924i("Finder.LivePromoteBannerController", "[preloadAdH5] fail, stack:" + Util.getStack());
                        } else {
                            Log.m105924i("Finder.LivePromoteBannerController", "[preloadAdH5] url:" + str);
                            C45700h.C45702b bVar = new C45700h.C45702b();
                            bVar.f123504a = str;
                            bVar.f123506c = JsApiCheckIsSupportFaceDetect.CTRL_INDEX;
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(bVar);
                            ((C45700h) C86709a0.m107533q(C45700h.class)).mo71031UP(arrayList2);
                        }
                    }
                    if (C32444a.f86201u.mo60266n().intValue() == 0 && (recyclerHorizontalViewPager = f2Var.f168878n) != null) {
                        recyclerHorizontalViewPager.postDelayed(new C59089a(i4, str, cVar2, (f2Var = this.f169048d), dw02), (long) dw02.f182892w);
                    }
                }
            }
        }
    }
}
