package qj1;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.sidebar.FinderLiveSideBar;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44242c;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44361u;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C6606x;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.Html5Info;
import com.tencent.p014mm.protocal.protobuf.NativeInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import dh1.C7329b;
import di3.C7335d;
import di3.C86312j;
import dk1.C58312g;
import e00.C7578x;
import fh1.C59018f2;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import ht1.C60216z4;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import l60.C99342a;
import l60.C99344b;
import nk1.C61779g;
import ok1.C62042e;
import org.json.JSONException;
import org.json.JSONObject;
import pe3.C89349b;
import pl1.C100810g0;
import pl1.C11984n0;
import pl1.C11990s0;
import qj1.C62966ri;
import rx3.C13598b0;
import sk1.C63956k;
import sk1.C63958m;
import te3.C64273c21;
import te3.C64822x51;
import tf0.C13883o1;
import up1.C27696y;
import zc1.C66785b;

/* renamed from: qj1.q8 */
public final class C62932q8 implements C62966ri {

    /* renamed from: d */
    public final Context f178568d;

    /* renamed from: e */
    public final C45795b f178569e;

    /* renamed from: f */
    public final C58124b f178570f;

    /* renamed from: g */
    public C32226l<? super C63956k, C13598b0> f178571g;

    /* renamed from: h */
    public C63956k f178572h;

    /* renamed from: i */
    public final String f178573i = "FinderLiveH5HalfBubble";

    /* renamed from: j */
    public final String f178574j = "PORTRAIT_ACTIONFinderLiveH5HalfBubble";

    /* renamed from: n */
    public final String f178575n = "PORTRAIT_ACTION_BUNDLE_OPEN_HALF_H5_INFO";

    /* renamed from: o */
    public ViewGroup f178576o;

    /* renamed from: p */
    public C6606x f178577p;

    /* renamed from: qj1.q8$a */
    public static final class C62933a implements C44242c {

        /* renamed from: a */
        public final /* synthetic */ C62932q8 f178578a;

        public C62933a(C62932q8 q8Var) {
            this.f178578a = q8Var;
        }

        /* renamed from: a */
        public boolean mo2024a(String str) {
            Log.m105924i(this.f178578a.f178573i, "onMenuClick");
            return false;
        }
    }

    /* renamed from: qj1.q8$b */
    public static final class C62934b implements DialogInterface.OnDismissListener {

        /* renamed from: d */
        public final /* synthetic */ C62932q8 f178579d;

        public C62934b(C62932q8 q8Var) {
            this.f178579d = q8Var;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            Log.m105924i(this.f178579d.f178573i, "dismiss half dialog");
            this.f178579d.f178577p = null;
        }
    }

    /* renamed from: qj1.q8$c */
    public static final class C62935c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62932q8 f178580d;

        /* renamed from: e */
        public final /* synthetic */ C63958m f178581e;

        public C62935c(C62932q8 q8Var, C63958m mVar) {
            this.f178580d = q8Var;
            this.f178581e = mVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveH5HalfBubble$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String str = this.f178580d.f178573i;
            Log.m105924i(str, "close promote, url:" + this.f178581e.f181310y);
            C7329b.m7474c(C7329b.f25441a, this.f178580d.f178569e, 2, 8, this.f178581e.f181310y, 0, (String) null, 0, 112, (Object) null);
            FinderLiveService.f159376d.getClass();
            C56032b bVar = FinderLiveService.f159379g;
            if (bVar != null) {
                C58124b.C58125b bVar2 = C58124b.C58125b.FINDER_LIVE_PROMTE_DEL;
                Bundle bundle = new Bundle();
                C63958m mVar = this.f178581e;
                C64822x51 x512 = new C64822x51();
                x512.f186258h = mVar.f181291d;
                x512.f186254d = 8;
                x512.f186256f = new C89349b(mVar.f181304s.toByteArray());
                C13598b0 b0Var = C13598b0.f38549a;
                bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", x512.toByteArray());
                bVar.statusChange(bVar2, bundle);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveH5HalfBubble$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.q8$d */
    public static final class C62936d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62932q8 f178582d;

        /* renamed from: e */
        public final /* synthetic */ C63958m f178583e;

        public C62936d(C62932q8 q8Var, C63958m mVar) {
            this.f178582d = q8Var;
            this.f178583e = mVar;
        }

        /* JADX WARNING: type inference failed for: r12v18, types: [d60.b] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r12) {
            /*
                r11 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r12)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveH5HalfBubble$refreshView$2"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r11
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                qj1.q8 r12 = r11.f178582d
                fy3.l<? super sk1.k, rx3.b0> r12 = r12.f178571g
                if (r12 == 0) goto L_0x0026
                sk1.m r0 = r11.f178583e
                r12.invoke(r0)
            L_0x0026:
                dh1.b r1 = dh1.C7329b.f25441a
                qj1.q8 r12 = r11.f178582d
                fj1.b r2 = r12.f178569e
                r3 = 5
                r4 = 8
                sk1.m r12 = r11.f178583e
                java.lang.String r5 = r12.f181310y
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 112(0x70, float:1.57E-43)
                r10 = 0
                dh1.C7329b.m7474c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                qj1.q8 r12 = r11.f178582d
                fj1.b r12 = r12.f178569e
                java.lang.Class<cl1.o> r0 = cl1.C54991o.class
                androidx.lifecycle.i0 r12 = r12.mo71262a(r0)
                cl1.o r12 = (cl1.C54991o) r12
                boolean r12 = r12.mo75990Y3()
                r0 = 0
                if (r12 == 0) goto L_0x006e
                qj1.q8 r12 = r11.f178582d
                d60.b r12 = r12.f178570f
                boolean r1 = r12 instanceof com.tencent.p014mm.plugin.finder.live.view.C56032b
                if (r1 == 0) goto L_0x005a
                com.tencent.mm.plugin.finder.live.view.b r12 = (com.tencent.p014mm.plugin.finder.live.view.C56032b) r12
                goto L_0x005b
            L_0x005a:
                r12 = r0
            L_0x005b:
                if (r12 == 0) goto L_0x006e
                java.lang.Class<hq1.d> r1 = hq1.C60085d.class
                qj1.c r12 = r12.getPlugin(r1)
                hq1.d r12 = (hq1.C60085d) r12
                if (r12 == 0) goto L_0x006e
                hq1.e r12 = r12.f171450r
                if (r12 == 0) goto L_0x006e
                r12.mo84956b()
            L_0x006e:
                qj1.q8 r12 = r11.f178582d
                android.content.Context r12 = r12.f178568d
                android.content.res.Resources r12 = r12.getResources()
                android.content.res.Configuration r12 = r12.getConfiguration()
                int r12 = r12.orientation
                r1 = 2
                if (r12 != r1) goto L_0x00b4
                qj1.q8 r12 = r11.f178582d
                d60.b r12 = r12.f178570f
                boolean r1 = r12 instanceof com.tencent.p014mm.plugin.finder.live.view.C56032b
                if (r1 == 0) goto L_0x008a
                r0 = r12
                com.tencent.mm.plugin.finder.live.view.b r0 = (com.tencent.p014mm.plugin.finder.live.view.C56032b) r0
            L_0x008a:
                if (r0 == 0) goto L_0x00bd
                java.lang.Class<qj1.dd> r12 = qj1.C62712dd.class
                qj1.c r12 = r0.getPlugin(r12)
                qj1.dd r12 = (qj1.C62712dd) r12
                if (r12 == 0) goto L_0x00bd
                qj1.q8 r0 = r11.f178582d
                java.lang.String r0 = r0.f178574j
                android.os.Bundle r1 = new android.os.Bundle
                r1.<init>()
                qj1.q8 r2 = r11.f178582d
                sk1.m r3 = r11.f178583e
                java.lang.String r2 = r2.f178575n
                com.tencent.mm.protocal.protobuf.FinderJumpInfo r3 = r3.f181304s
                byte[] r3 = r3.toByteArray()
                r1.putByteArray(r2, r3)
                rx3.b0 r2 = rx3.C13598b0.f38549a
                r12.mo87694V0(r0, r1)
                goto L_0x00bd
            L_0x00b4:
                qj1.q8 r12 = r11.f178582d
                android.content.Context r0 = r12.f178568d
                sk1.m r1 = r11.f178583e
                r12.mo87870a(r0, r1)
            L_0x00bd:
                java.lang.String r12 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveH5HalfBubble$refreshView$2"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r11, r12, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qj1.C62932q8.C62936d.onClick(android.view.View):void");
        }
    }

    public C62932q8(Context context, C45795b bVar, C58124b bVar2, C32226l<? super C63956k, C13598b0> lVar, C63956k kVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "buContext");
        C87412m.m108594g(bVar2, "statusMonitor");
        this.f178568d = context;
        this.f178569e = bVar;
        this.f178570f = bVar2;
        this.f178571g = lVar;
        this.f178572h = kVar;
        View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.clc, (ViewGroup) null);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f178576o = (ViewGroup) inflate;
    }

    /* renamed from: A */
    public void mo12174A(Bundle bundle, long j) {
    }

    /* renamed from: C */
    public void mo12175C(Object obj) {
        C87412m.m108594g(obj, "data");
        if (obj instanceof C63958m) {
            C63958m mVar = (C63958m) obj;
            mo87871b(mVar);
            C7329b.m7474c(C7329b.f25441a, this.f178569e, 1, 8, mVar.f181310y, 0, (String) null, 0, 112, (Object) null);
        }
    }

    /* renamed from: F */
    public void mo12176F(C32224a<C13598b0> aVar) {
        C62966ri.C12652b.m12153b(this, aVar);
    }

    /* renamed from: J */
    public C63956k mo12177J() {
        return this.f178572h;
    }

    /* renamed from: Q */
    public void mo12178Q() {
    }

    /* renamed from: V */
    public int mo12179V() {
        return C0966R.C0970id.f358111dh0;
    }

    /* renamed from: a */
    public final void mo87870a(Context context, C63958m mVar) {
        String str;
        String str2;
        JSONObject jSONObject;
        Context context2 = context;
        C63958m mVar2 = mVar;
        Log.m105925i(this.f178573i, "bannerJumpImpl business_type:%d", Integer.valueOf(mVar2.f181304s.business_type));
        FinderJumpInfo finderJumpInfo = mVar2.f181304s;
        int i = finderJumpInfo.jumpinfo_type;
        if (i != 1) {
            String str3 = "";
            String str4 = null;
            if (i == 2) {
                Html5Info html5Info = finderJumpInfo.html5_info;
                String str5 = (html5Info == null || (str = html5Info.url) == null) ? str3 : str;
                Log.m105925i(this.f178573i, "jump half h5 url:%s", str5);
                if (mVar2.f181304s.html5_info == null || TextUtils.isEmpty(str5)) {
                    Log.m105920e(this.f178573i, "jumpToHalfScreenH5 html5_info is null or url is empty");
                    return;
                }
                Html5Info html5Info2 = mVar2.f181304s.html5_info;
                if (html5Info2 != null && html5Info2.style == 1) {
                    int i2 = html5Info2 != null ? html5Info2.height_percent : 0;
                    Log.m105924i(this.f178573i, "show HalfScreenWebView heightPercent:" + i2);
                    HashMap<String, Bitmap> hashMap = C59018f2.f168857P;
                    if (i2 < 50 || i2 > 90) {
                        i2 = 75;
                    }
                    float f = ((float) i2) / ((float) 100);
                    Log.m105924i(this.f178573i, "realScreenHeightPercent:" + f);
                    boolean z = mVar2.f181309x != 2;
                    Log.m105924i(this.f178573i, "canShowMenu:" + z);
                    C7335d c = C86312j.m106911c(C7578x.class);
                    C87412m.m108593f(c, "getService(\n            …creenService::class.java)");
                    C7578x xVar = (C7578x) c;
                    FinderLiveService finderLiveService = FinderLiveService.f159376d;
                    C54991o oVar = (C54991o) finderLiveService.mo77630e(C54991o.class);
                    if (oVar != null) {
                        str4 = oVar.f154345o;
                    }
                    if (C62042e.f176370a.mo87027N0()) {
                        str4 = C66785b.f191882e.mo90662O5();
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    if (str4 == null) {
                        str4 = str3;
                    }
                    jSONObject2.putOpt("finderId", str4);
                    C55001u uVar = (C55001u) finderLiveService.mo77630e(C55001u.class);
                    Object obj = str3;
                    if (uVar != null) {
                        C64273c21 c212 = uVar.f154420q;
                        obj = str3;
                        if (c212 != null) {
                            obj = Long.valueOf(c212.f182392d);
                        }
                    }
                    jSONObject2.putOpt("liveId", obj);
                    Log.m105925i(this.f178573i, "getBannerHalfParam:%s", jSONObject2.toString());
                    String jSONObject3 = jSONObject2.toString();
                    C87412m.m108593f(jSONObject3, "obj.toString()");
                    this.f178577p = C7578x.C7579a.m7714a(xVar, context, str5, (MMWebView) null, new C44361u(f, jSONObject3, false, z, 0, false, 0, false, false, 0, false, false, false, (String) null, false, 32756, (C8480h) null), 4, (Object) null);
                    context.getResources().getColor(C0966R.color.FG_0);
                    C6606x xVar2 = this.f178577p;
                    if (xVar2 != null) {
                        xVar2.show();
                    }
                    C6606x xVar3 = this.f178577p;
                    if (xVar3 != null) {
                        xVar3.mo7528g(new C62933a(this));
                    }
                    C6606x xVar4 = this.f178577p;
                    if (xVar4 != null) {
                        xVar4.setOnDismissListener(new C62934b(this));
                        return;
                    }
                    return;
                }
                Log.m105924i(this.f178573i, "show FullScreenWebView");
                Intent intent = new Intent();
                intent.putExtra("rawUrl", str5);
                intent.putExtra("convertActivityFromTranslucent", true);
                C88144b.m109791i(context2, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            } else if (i == 3) {
                NativeInfo nativeInfo = finderJumpInfo.native_info;
                Integer valueOf = nativeInfo != null ? Integer.valueOf(nativeInfo.native_type) : null;
                NativeInfo nativeInfo2 = mVar2.f181304s.native_info;
                if (nativeInfo2 == null || (str2 = nativeInfo2.necessary_params) == null) {
                    str2 = str3;
                }
                Log.m105925i(this.f178573i, "jump native necessary_params:%s", str2);
                try {
                    jSONObject = new JSONObject(str2);
                } catch (JSONException e) {
                    Log.printErrStackTrace(this.f178573i, e, str3, new Object[0]);
                    jSONObject = null;
                }
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                if (valueOf != null && valueOf.intValue() == 1) {
                    C61779g.f175628a.mo86698a(context2, jSONObject);
                } else if (valueOf != null && valueOf.intValue() == 2) {
                    C61779g.f175628a.mo86699b(context2, jSONObject);
                } else if (valueOf != null && valueOf.intValue() == 3) {
                    C87412m.m108594g(context2, "context");
                    ((C13883o1) C86312j.m106911c(C13883o1.class)).Wb0(context2, 0, jSONObject);
                } else if (valueOf != null && valueOf.intValue() == 4) {
                    C61779g.f175628a.mo86700c(context2, jSONObject);
                } else if (valueOf != null && valueOf.intValue() == 5) {
                    try {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject.put("action", "openFinderMultiMoreLive");
                        jSONObject4.put("extInfo", jSONObject);
                        C7335d c2 = C86312j.m106911c(C60200t1.class);
                        C87412m.m108593f(c2, "getService(IFinderCommon…atureService::class.java)");
                        C60200t1.C60201a.m70364b((C60200t1) c2, context, jSONObject4.toString(), (C60216z4.C8821a) null, 4, (Object) null);
                    } catch (Exception e2) {
                        Log.printErrStackTrace(this.f178573i, e2, "openFinderView", new Object[0]);
                    }
                } else if (valueOf != null && valueOf.intValue() == 9) {
                    C39622i0 a = C39818r.f106831a.mo62443b(context2).mo75002a(C58312g.class);
                    C87412m.m108593f(a, "UICProvider.of(context).…veSideBarUIC::class.java)");
                    C58312g gVar = (C58312g) a;
                    FinderLiveSideBar finderLiveSideBar = gVar.f166968f;
                    if (finderLiveSideBar != null) {
                        finderLiveSideBar.mo77741h(false, (C32224a<C13598b0>) null);
                    }
                    gVar.f166971i.mo83065c();
                }
            }
        } else {
            Log.m105920e(this.f178573i, "jump mini app not implement");
        }
    }

    /* renamed from: a0 */
    public int mo12180a0() {
        return C0966R.C0970id.m0d;
    }

    /* renamed from: b */
    public final void mo87871b(C63958m mVar) {
        ViewGroup viewGroup = this.f178576o;
        if (viewGroup != null) {
            TextView textView = (TextView) viewGroup.findViewById(C0966R.C0970id.m0h);
            C85875k4.m106189j0(textView.getPaint(), 0.8f);
            String str = mVar.f181305t;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            textView.setText(str);
            ViewGroup viewGroup2 = this.f178576o;
            if (viewGroup2 != null) {
                TextView textView2 = (TextView) viewGroup2.findViewById(C0966R.C0970id.m0e);
                String str3 = mVar.f181306u;
                if (str3 != null) {
                    str2 = str3;
                }
                textView2.setText(str2);
                ViewGroup viewGroup3 = this.f178576o;
                if (viewGroup3 != null) {
                    TextView textView3 = (TextView) viewGroup3.findViewById(C0966R.C0970id.m0f);
                    String str4 = mVar.f181308w;
                    if (str4 == null || str4.length() == 0) {
                        textView3.setVisibility(8);
                    } else {
                        textView3.setText(mVar.f181308w);
                        textView3.setVisibility(0);
                    }
                    ViewGroup viewGroup4 = this.f178576o;
                    if (viewGroup4 != null) {
                        View findViewById = viewGroup4.findViewById(C0966R.C0970id.f358111dh0);
                        C99344b<C100810g0, Bitmap> a = ((C11990s0) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C11990s0.class)).mo11871f2().mo85955a(new C11984n0(mVar.f181307v, C27696y.THUMB_IMAGE));
                        ViewGroup viewGroup5 = this.f178576o;
                        if (viewGroup5 != null) {
                            View findViewById2 = viewGroup5.findViewById(C0966R.C0970id.m0g);
                            C87412m.m108593f(findViewById2, "root.findViewById<ImageV…inder_live_h5_half_thumb)");
                            ((C99342a) a).mo85954d((ImageView) findViewById2);
                            if (C62042e.f176370a.mo87032P0(this.f178569e)) {
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(4);
                                View view = findViewById;
                                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveH5HalfBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteH5HalfItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveH5HalfBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteH5HalfItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            } else {
                                C9556a aVar2 = new C9556a();
                                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                                aVar2.mo10233c(0);
                                View view2 = findViewById;
                                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveH5HalfBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteH5HalfItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveH5HalfBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteH5HalfItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                findViewById.setOnClickListener(new C62935c(this, mVar));
                            }
                            ViewGroup viewGroup6 = this.f178576o;
                            if (viewGroup6 != null) {
                                viewGroup6.setOnClickListener(new C62936d(this, mVar));
                            } else {
                                C87412m.m108603p("root");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("root");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("root");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("root");
                    throw null;
                }
            } else {
                C87412m.m108603p("root");
                throw null;
            }
        } else {
            C87412m.m108603p("root");
            throw null;
        }
    }

    /* renamed from: e */
    public void mo12183e(Bundle bundle, Object obj, long j) {
        FinderJumpInfo finderJumpInfo = null;
        String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        if (string == null) {
            string = "";
        }
        if (C87412m.m108589b(string, this.f178574j)) {
            FinderJumpInfo finderJumpInfo2 = new FinderJumpInfo();
            Bundle bundle2 = obj instanceof Bundle ? (Bundle) obj : null;
            byte[] byteArray = bundle2 != null ? bundle2.getByteArray(this.f178575n) : null;
            if (byteArray != null) {
                try {
                    finderJumpInfo2.parseFrom(byteArray);
                    finderJumpInfo = finderJumpInfo2;
                } catch (Exception e) {
                    Log.printDebugStack("safeParser", "", e);
                }
            }
            if (finderJumpInfo != null) {
                mo87870a(this.f178568d, new C63958m(finderJumpInfo));
            }
        }
    }

    /* renamed from: f */
    public Rect mo12184f(View view) {
        return C62966ri.C12652b.m12152a(this, view);
    }

    public View getView() {
        ViewGroup viewGroup = this.f178576o;
        if (viewGroup != null) {
            return viewGroup;
        }
        C87412m.m108603p("root");
        throw null;
    }

    /* renamed from: k */
    public void mo12186k() {
        C62966ri.C12652b.m12154c(this);
    }

    public void onPause() {
    }

    public void onResume() {
    }

    /* renamed from: t */
    public void mo12189t(Object obj) {
        C87412m.m108594g(obj, "data");
        if (obj instanceof C63958m) {
            mo87871b((C63958m) obj);
        }
    }

    /* renamed from: w */
    public void mo12190w() {
    }
}
