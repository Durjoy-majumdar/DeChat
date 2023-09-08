package dr1;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.webkit.ValueCallback;
import androidx.appcompat.app.AppCompatActivity;
import bt1.C0378f;
import c30.C104289g;
import cm1.C55018j0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.view.FinderJumperView;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.MiniAppInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import er1.C7885u1;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C87412m;
import h81.C59774i;
import ht1.C60172g4;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import jq3.C60905o;
import l31.C61212e;
import lc3.C10485b;
import mf1.C10884z;
import p256vw.C15016h;
import p645pj.C77093f;
import pf1.C11920q;
import q31.C118148a;
import qo3.C77407n;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C49696hf1;
import te3.C49712hj1;
import te3.uc4;
import tf0.C64916p1;
import up1.C37521f;
import wp1.C15587j;

/* renamed from: dr1.i */
public final class C7483i implements C7478d0 {

    /* renamed from: a */
    public final AppCompatActivity f25700a;

    /* renamed from: b */
    public final FinderJumperView f25701b;

    /* renamed from: c */
    public FinderJumpInfo f25702c;

    /* renamed from: d */
    public String f25703d;

    /* renamed from: e */
    public C15016h f25704e;

    /* renamed from: f */
    public int f25705f = -1;

    /* renamed from: g */
    public int f25706g = -1;

    /* renamed from: h */
    public View f25707h;

    /* renamed from: i */
    public C10884z f25708i;

    /* renamed from: j */
    public List<? extends FinderJumpInfo> f25709j;

    /* renamed from: k */
    public C32226l<? super Boolean, C13598b0> f25710k;

    /* renamed from: l */
    public final ValueCallback<String> f25711l = new C7485b(this);

    /* renamed from: dr1.i$a */
    public static final class C7484a implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ C49712hj1 f25712a;

        public C7484a(C49712hj1 hj12) {
            this.f25712a = hj12;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            C13604l[] lVarArr = new C13604l[4];
            C49712hj1 hj12 = this.f25712a;
            Integer num = null;
            lVarArr[0] = new C13604l("behaviour_session_id", hj12 != null ? hj12.f134670d : null);
            lVarArr[1] = new C13604l("finder_context_id", hj12 != null ? hj12.f134671e : null);
            lVarArr[2] = new C13604l("finder_tab_context_id", hj12 != null ? hj12.f134672f : null);
            if (hj12 != null) {
                num = Integer.valueOf(hj12.f134675i);
            }
            lVarArr[3] = new C13604l("comment_scene", num);
            return C90364q0.m113147f(lVarArr);
        }
    }

    /* renamed from: dr1.i$b */
    public static final class C7485b<T> implements ValueCallback {

        /* renamed from: a */
        public final /* synthetic */ C7483i f25713a;

        public C7485b(C7483i iVar) {
            this.f25713a = iVar;
        }

        public void onReceiveValue(Object obj) {
            String str = (String) obj;
            Log.m105924i("Finder.FinderChooseProductWidget", "onReceiveValue value" + str);
            try {
                C104289g k = new C104289g(str).getJSONObject("commodity");
                C104289g k2 = k.getJSONObject("fullPage");
                String string = k2.getString("appid");
                String string2 = k2.getString("path");
                String string3 = k.getString("productId");
                String optString = k.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
                MiniAppInfo miniAppInfo = new MiniAppInfo();
                miniAppInfo.app_id = string;
                miniAppInfo.path = string2;
                miniAppInfo.fetch_info_id = string3;
                C104289g gVar = new C104289g();
                gVar.put("product_id", string3);
                C7483i iVar = this.f25713a;
                FinderJumpInfo finderJumpInfo = new FinderJumpInfo();
                C7483i iVar2 = this.f25713a;
                finderJumpInfo.jumpinfo_type = 1;
                finderJumpInfo.business_type = 1;
                C49696hf1 hf12 = C15587j.f42220f.f136094g;
                finderJumpInfo.icon_url = hf12 != null ? hf12.f134595e : null;
                finderJumpInfo.wording = optString;
                finderJumpInfo.recommend_reason = iVar2.f25700a.getString(C0966R.string.e8j);
                finderJumpInfo.mini_app_info = miniAppInfo;
                finderJumpInfo.ext_info = gVar.toString();
                finderJumpInfo.source = 1;
                LinkedList<uc4> linkedList = finderJumpInfo.style;
                uc4 uc4 = new uc4();
                uc4.f142760f = 5;
                uc4.f142761g = true;
                uc4.f142762h = 2;
                uc4.f142763i = true;
                uc4.f142758d = 1;
                uc4.f142759e = true;
                linkedList.add(uc4);
                LinkedList<uc4> linkedList2 = finderJumpInfo.style;
                uc4 uc42 = new uc4();
                uc42.f142760f = 6;
                uc42.f142761g = true;
                uc42.f142762h = 2;
                uc42.f142763i = true;
                uc42.f142758d = 1;
                uc42.f142759e = true;
                linkedList2.add(uc42);
                iVar.f25702c = finderJumpInfo;
                Intent intent = this.f25713a.f25700a.getIntent();
                FinderJumpInfo finderJumpInfo2 = this.f25713a.f25702c;
                intent.putExtra("JUMP_INFO", finderJumpInfo2 != null ? finderJumpInfo2.toByteArray() : null);
                this.f25713a.f25703d = optString;
            } catch (Throwable th) {
                Log.printErrStackTrace("Finder.FinderChooseProductWidget", th, "", new Object[0]);
                this.f25713a.f25702c = null;
            }
            C7483i iVar3 = this.f25713a;
            iVar3.f25709j = null;
            iVar3.mo8624g(iVar3.f25702c);
            this.f25713a.mo8626i(false, true);
        }
    }

    /* renamed from: dr1.i$c */
    public static final class C7486c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C7483i f25714d;

        public C7486c(C7483i iVar) {
            this.f25714d = iVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/upload/postui/FinderChooseProductWidget$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f25714d.mo8626i(true, false);
            C7483i iVar = this.f25714d;
            if (iVar.f25702c != null) {
                AppCompatActivity appCompatActivity = iVar.f25700a;
                C7475c cVar = new C7475c(iVar, appCompatActivity);
                C7483i iVar2 = this.f25714d;
                iVar2.getClass();
                C0378f.C0380b bVar = new C0378f.C0380b(new C7479e(iVar2), new C7480f(iVar2), new C7481g(iVar2));
                C7483i iVar3 = this.f25714d;
                iVar3.getClass();
                C7477d dVar = new C7477d(iVar3);
                C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                C77407n nVar = new C77407n((Context) appCompatActivity, 1, true);
                nVar.f225771i = cVar;
                nVar.f225782p = bVar;
                nVar.f225795v = dVar;
                nVar.mo107573q();
            } else {
                iVar.mo8622e();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/upload/postui/FinderChooseProductWidget$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C7483i(AppCompatActivity appCompatActivity, FinderJumperView finderJumperView) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(finderJumperView, "chooseView");
        this.f25700a = appCompatActivity;
        this.f25701b = finderJumperView;
    }

    /* renamed from: c */
    public static final void m7616c(C7483i iVar) {
        FinderJumpInfo finderJumpInfo;
        View view = iVar.f25707h;
        if (view != null && (finderJumpInfo = iVar.f25702c) != null) {
            C60905o oVar = new C60905o(view);
            C11920q qVar = new C11920q(finderJumpInfo);
            if (iVar.f25708i == null) {
                iVar.f25708i = new C10884z();
            }
            C10884z zVar = iVar.f25708i;
            if (zVar != null) {
                zVar.mo11020b(new C55018j0(new FinderItem()), oVar, view, qVar, "");
            }
        }
    }

    /* renamed from: a */
    public void mo8615a(List<? extends FinderJumpInfo> list) {
        boolean z;
        Log.m105924i("Finder.FinderChooseProductWidget", "onCreate :" + this);
        FinderJumperView finderJumperView = this.f25701b;
        String string = this.f25700a.getString(C0966R.string.e8j);
        C87412m.m108593f(string, "activity.getString(com.t…nder_live_shopping_title)");
        finderJumperView.setDefaultTitle(string);
        this.f25701b.setDefaultIconId(C0966R.raw.icons_outlined_shop);
        this.f25701b.setFilledIconId(C0966R.raw.icons_filled_shop);
        this.f25709j = list;
        T t = null;
        boolean z2 = true;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (((FinderJumpInfo) next).business_type == 1) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    t = next;
                    break;
                }
            }
            t = (FinderJumpInfo) t;
        }
        mo8624g(t);
        this.f25701b.setOnClickListener(new C7486c(this));
        if (this.f25701b.getVisibility() == 0) {
            if (list == null) {
                z2 = false;
            }
            mo8626i(false, z2);
        }
        mo8623f(this.f25701b.getTipsTv(), "product_title_too_long_tips", -1);
    }

    /* renamed from: b */
    public List<FinderJumpInfo> mo8616b() {
        List<? extends FinderJumpInfo> list = this.f25709j;
        if (list != null) {
            return list;
        }
        FinderJumpInfo finderJumpInfo = this.f25702c;
        if (finderJumpInfo == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(finderJumpInfo);
        return arrayList;
    }

    /* renamed from: d */
    public final boolean mo8621d(String str) {
        C37521f.f99374d.getClass();
        if (C37521f.f99499r1.mo60266n().intValue() != 1) {
            return false;
        }
        return (str != null ? str.length() : 0) > 15;
    }

    /* renamed from: e */
    public final void mo8622e() {
        C77093f vh02 = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0();
        String c = vh02.mo107405c("FinderMiniAppShopAppId");
        if (c == null) {
            c = "wx2bff878c51bab23b";
        }
        String str = c;
        String c2 = vh02.mo107405c("FinderMiniAppShopAppId");
        if (c2 == null) {
            c2 = "/pages/commodityToAdd/index.html?from=post";
        }
        C7885u1.m8051a(C7885u1.f26507a, this.f25700a, str, c2, 0, this.f25711l, 8, (Object) null);
    }

    /* renamed from: f */
    public final void mo8623f(View view, String str, int i) {
        C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
        eVar.o30(view, str);
        if (i != -1) {
            eVar.mo86175pO(view, i, 25496);
        }
        C60172g4 gr02 = ((C64916p1) C86312j.m106911c(C64916p1.class)).gr0(this.f25700a);
        eVar.E60(view, new C7484a(gr02 != null ? gr02.mo12861q3() : null));
    }

    /* renamed from: g */
    public final void mo8624g(FinderJumpInfo finderJumpInfo) {
        Log.m105924i("Finder.FinderChooseProductWidget", "refresh :" + this);
        this.f25702c = finderJumpInfo;
        if (finderJumpInfo == null) {
            this.f25701b.mo4599b();
        } else {
            MiniAppInfo miniAppInfo = finderJumpInfo.mini_app_info;
            if (finderJumpInfo.jumpinfo_type == 1 && finderJumpInfo.business_type == 1 && miniAppInfo != null) {
                FinderJumperView finderJumperView = this.f25701b;
                String str = finderJumpInfo.wording;
                if (str == null) {
                    str = "";
                }
                finderJumperView.mo4600c(str, true);
                mo8625h(this.f25703d);
                this.f25701b.setVisibility(0);
                C32226l<? super Boolean, C13598b0> lVar = this.f25710k;
                if (lVar != null) {
                    lVar.invoke(Boolean.TRUE);
                    return;
                }
                return;
            }
        }
        this.f25701b.setVisibility(8);
        C32226l<? super Boolean, C13598b0> lVar2 = this.f25710k;
        if (lVar2 != null) {
            lVar2.invoke(Boolean.FALSE);
        }
    }

    /* renamed from: h */
    public final void mo8625h(String str) {
        if (mo8621d(str)) {
            FinderJumperView finderJumperView = this.f25701b;
            Resources resources = this.f25700a.getResources();
            finderJumperView.mo4598a(resources != null ? resources.getString(C0966R.string.nb8) : null);
            ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("view_exp", this.f25701b.getTipsTv(), (Map<String, Object>) null, 25496);
            return;
        }
        FinderJumperView finderJumperView2 = this.f25701b;
        int i = FinderJumperView.f17821n;
        finderJumperView2.mo4598a((String) null);
    }

    /* renamed from: i */
    public final void mo8626i(boolean z, boolean z2) {
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        String stringExtra = this.f25700a.getIntent().getStringExtra("key_context_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        C115669n.INSTANCE.mo160131h(21875, Wb, stringExtra, 74, Integer.valueOf(z ? 1 : 0), String.valueOf(System.currentTimeMillis()), "post_good_icon", z2 ? "{\"if_have_good\":1}" : "{\"if_have_good\":2}");
    }
}
