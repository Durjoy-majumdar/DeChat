package vv1;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.observer.IMvvmObserver;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.IStateActionResult;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.xweb.WCWebUpdater;
import di3.C86312j;
import eb0.C31543z5;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import kv1.C99252h;
import kv1.C99254i;
import lv1.C99667f;
import lv1.C99672i;
import p255vr.C78469f;
import p278yh.C23310h;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C64197v;
import te3.C52241zb0;
import te3.pd4;
import u73.C101982p;
import uv1.C65479a;
import w00.C22831a;
import w00.C22832b;
import w00.C22833c;
import w00.C22835e;
import w00.C22836f;
import w00.C22837g;
import w00.C22838h;
import w00.C22839i;
import w00.C22841m;
import w00.C78505k;
import w00.C78506l;
import yb2.C15946a;

/* renamed from: vv1.i */
public final class C22798i extends C15946a {

    /* renamed from: d */
    public final String f65540d = "MicroMsg.FTS.FTSRelevantSearchFooterUIC";

    /* renamed from: e */
    public String f65541e = "";

    /* renamed from: f */
    public LinkedList<pd4> f65542f = new LinkedList<>();

    /* renamed from: g */
    public long f65543g;

    /* renamed from: h */
    public int f65544h = 10;

    /* renamed from: i */
    public String f65545i = "";

    /* renamed from: j */
    public boolean f65546j;

    /* renamed from: n */
    public C23310h f65547n;

    /* renamed from: o */
    public volatile boolean f65548o;

    /* renamed from: vv1.i$b */
    public static final class C22799b<E> implements IMvvmObserver {

        /* renamed from: d */
        public final /* synthetic */ C22798i f65549d;

        public C22799b(C22798i iVar) {
            this.f65549d = iVar;
        }

        public void onChanged(Object obj) {
            UIStateCenter stateCenter;
            UIStateCenter stateCenter2;
            String str;
            String str2;
            C89349b bVar;
            LinearLayout a;
            C65479a aVar = (C65479a) obj;
            C87412m.m108594g(aVar, "state");
            C22798i iVar = this.f65549d;
            IStateAction action = aVar.getAction();
            if (action != null && (action instanceof C78505k)) {
                IStateActionResult result = ((C78505k) action).getResult();
                if (result != null && (result instanceof C78506l)) {
                    C78506l lVar = (C78506l) result;
                    C23310h hVar = iVar.f65547n;
                    if (hVar != null) {
                        hVar.mo36791a().removeAllViews();
                        C23310h hVar2 = iVar.f65547n;
                        LinearLayout b = hVar2 != null ? hVar2.mo36792b() : null;
                        if (b != null) {
                            b.setVisibility(8);
                        }
                    }
                    iVar.f65548o = false;
                    iVar.f65542f = new LinkedList<>();
                    iVar.f65544h = 10;
                    iVar.f65545i = "";
                }
                IStateAction action2 = aVar.getAction();
                if (action2 != null && (action2 instanceof C22841m)) {
                    C22841m mVar = (C22841m) action2;
                    C23310h hVar3 = iVar.f65547n;
                    LinearLayout b2 = hVar3 != null ? hVar3.mo36792b() : null;
                    if (b2 != null) {
                        b2.setVisibility(8);
                    }
                    C23310h hVar4 = iVar.f65547n;
                    if (!(hVar4 == null || (a = hVar4.mo36791a()) == null)) {
                        a.removeAllViews();
                    }
                }
            }
            C22798i iVar2 = this.f65549d;
            IStateAction action3 = aVar.getAction();
            if (action3 != null && (action3 instanceof C22833c)) {
                C22833c cVar = (C22833c) action3;
                synchronized (Boolean.valueOf(iVar2.f65548o)) {
                    iVar2.f65541e = cVar.f65646a;
                    iVar2.f65542f = cVar.f65649d;
                    iVar2.f65544h = cVar.f65653h;
                    iVar2.f65545i = cVar.f65652g;
                    if (iVar2.f65548o) {
                        C22798i.m26714g3(iVar2, cVar.f65646a, cVar.f65647b, cVar.f65649d, cVar.f65650e, cVar.f65652g);
                    }
                    C13598b0 b0Var = C13598b0.f38549a;
                }
            }
            C22798i iVar3 = this.f65549d;
            IStateAction action4 = aVar.getAction();
            if (action4 != null && (action4 instanceof C22831a)) {
                C22831a aVar2 = (C22831a) action4;
                iVar3.f65546j = aVar2.f65643e;
                if (iVar3.f65542f.isEmpty()) {
                    C22798i.m26714g3(iVar3, aVar2.f65639a, aVar2.f65640b, new LinkedList(), aVar2.f65641c, "");
                }
                synchronized (Boolean.valueOf(iVar3.f65548o)) {
                    if ((aVar2.f65641c || aVar2.f65642d) && C87412m.m108589b(aVar2.f65639a, iVar3.f65541e) && (!iVar3.f65542f.isEmpty())) {
                        C22798i.m26714g3(iVar3, aVar2.f65639a, aVar2.f65640b, iVar3.f65542f, true, iVar3.f65545i);
                    }
                    iVar3.f65548o = true;
                    C13598b0 b0Var2 = C13598b0.f38549a;
                }
            }
            C22798i iVar4 = this.f65549d;
            IStateAction action5 = aVar.getAction();
            int i = 2;
            if (action5 != null && (action5 instanceof C22835e)) {
                C22835e eVar = (C22835e) action5;
                C52241zb0 zb02 = eVar.f65658c;
                pd4 pd4 = zb02.f145785d;
                if (!(pd4 != null && pd4.f139714h == 3)) {
                    int i2 = eVar.f65660e;
                    int i3 = i2 == 23 ? 7 : i2 == 29 ? 17 : 69;
                    String str3 = eVar.f65656a;
                    iVar4.getClass();
                    C87412m.m108594g(str3, SearchIntents.EXTRA_QUERY);
                    String str4 = iVar4.f65540d;
                    StringBuilder sb = new StringBuilder();
                    sb.append("startRelevantSearch query:");
                    sb.append(str3);
                    sb.append(" url:");
                    pd4 pd42 = zb02.f145785d;
                    if (pd42 == null || (str = pd42.f139710d) == null) {
                        str = "";
                    }
                    sb.append(str);
                    Log.m105924i(str4, sb.toString());
                    pd4 pd43 = zb02.f145785d;
                    if (!Util.isNullOrNil(pd43 != null ? pd43.f139710d : null) && C31543z5.m39453c() - iVar4.f65543g > 1000) {
                        iVar4.f65543g = C31543z5.m39453c();
                        HashMap hashMap = new HashMap();
                        hashMap.put("prefixSug", str3);
                        Object[] objArr = new Object[4];
                        objArr[0] = Integer.valueOf(i3);
                        objArr[1] = Long.valueOf(zb02.f145787f);
                        pd4 pd44 = zb02.f145785d;
                        objArr[2] = pd44 != null ? pd44.f139711e : null;
                        objArr[3] = Long.valueOf(zb02.f145787f);
                        String format = String.format("%s:%s:%s:%s", Arrays.copyOf(objArr, 4));
                        C87412m.m108593f(format, "format(format, *args)");
                        hashMap.put("parentSearchID", format);
                        hashMap.put("sceneActionType", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN);
                        String valueOf = String.valueOf(C99252h.f291030c);
                        hashMap.put("clickType", i3 == 17 ? "17" : "7");
                        C101982p pVar = (C101982p) C86312j.m106911c(C101982p.class);
                        AppCompatActivity activity = iVar4.getActivity();
                        pd4 pd45 = zb02.f145785d;
                        pVar.mo6880nv(activity, 3, (pd45 == null || (str2 = pd45.f139710d) == null) ? "" : str2, valueOf, true, hashMap, true, -1);
                    }
                } else if (!(pd4 == null || (bVar = pd4.f139715i) == null)) {
                    String h = bVar.mo123705h();
                    String str5 = eVar.f65656a;
                    iVar4.getClass();
                    C87412m.m108594g(str5, SearchIntents.EXTRA_QUERY);
                    String str6 = iVar4.f65540d;
                    Log.m105924i(str6, "startSearchItemDetailPageUrl query:" + str5 + " url:" + h);
                    if (C31543z5.m39453c() - iVar4.f65543g > 1000) {
                        iVar4.f65543g = C31543z5.m39453c();
                        Intent intent = new Intent();
                        intent.putExtra("rawUrl", h);
                        intent.putExtra("key_init_url", h);
                        intent.putExtra("key_search_query", str5);
                        C88144b.m109808z(MMApplicationContext.getContext(), intent);
                    }
                }
            }
            C22798i iVar5 = this.f65549d;
            IStateAction action6 = aVar.getAction();
            if (action6 == null || !(action6 instanceof C22837g)) {
                C22798i iVar6 = this.f65549d;
                IStateAction action7 = aVar.getAction();
                if (action7 != null && (action7 instanceof C22836f)) {
                    C22836f fVar = (C22836f) action7;
                    String str7 = fVar.f65661a;
                    long j = fVar.f65662b;
                    C23310h hVar5 = iVar6.f65547n;
                    if (hVar5 != null && hVar5.mo36792b().getVisibility() == 0) {
                        LinkedList linkedList = new LinkedList();
                        int j2 = C76577a.m92159j(iVar6.getActivity());
                        int childCount = hVar5.mo36791a().getChildCount();
                        int i4 = 0;
                        while (i4 < childCount) {
                            View childAt = hVar5.mo36791a().getChildAt(i4);
                            C87412m.m108593f(childAt, "parentUIBinding.relevantItemLayout.getChildAt(i)");
                            int[] iArr = new int[i];
                            childAt.getLocationOnScreen(iArr);
                            int measuredHeight = childAt.getMeasuredHeight() + iArr[1];
                            Object tag = childAt.getTag();
                            C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FTSRelatedSugItem");
                            C52241zb0 zb03 = (C52241zb0) tag;
                            if (1 <= measuredHeight && measuredHeight <= j2) {
                                linkedList.add(zb03);
                            }
                            i4++;
                            i = 2;
                        }
                        BaseMvvmActivity d3 = iVar6.mo14598d3();
                        if (!(d3 == null || (stateCenter2 = d3.getStateCenter()) == null)) {
                            stateCenter2.dispatch(new C22838h(str7, j, C31543z5.m39453c(), linkedList));
                        }
                    }
                }
                C22798i iVar7 = this.f65549d;
                IStateAction action8 = aVar.getAction();
                if (action8 != null && (action8 instanceof C22832b)) {
                    C22832b bVar2 = (C22832b) action8;
                    if (C87412m.m108589b(bVar2.f65644a, iVar7.f65541e) && iVar7.f65542f.size() > 0) {
                        C52241zb0 zb04 = new C52241zb0();
                        zb04.f145787f = bVar2.f65645b;
                        zb04.f145786e = 0;
                        zb04.f145785d = iVar7.f65542f.get(0);
                        BaseMvvmActivity d35 = iVar7.mo14598d3();
                        if (d35 != null && (stateCenter = d35.getStateCenter()) != null) {
                            stateCenter.dispatch(new C22835e(iVar7.f65541e, bVar2.f65645b, -1, zb04, 0, 29));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            C22837g gVar = (C22837g) action6;
            iVar5.getClass();
            C87412m.m108594g((Object) null, SearchIntents.EXTRA_QUERY);
            throw null;
        }
    }

    /* renamed from: vv1.i$a */
    public static final class C22800a extends C87413o implements C32226l<C65479a, C13598b0> {

        /* renamed from: d */
        public static final C22800a f65550d = new C22800a();

        public C22800a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C65479a aVar = (C65479a) obj;
            C87412m.m108594g(aVar, "state");
            IStateAction action = aVar.getAction();
            if (action != null && (action instanceof C78505k)) {
                C78505k kVar = (C78505k) action;
                kVar.setResult(new C78506l(((C78469f) C86312j.m106911c(C78469f.class)).le0(kVar.f229954a)));
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22798i(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: g3 */
    public static final void m26714g3(C22798i iVar, String str, long j, LinkedList linkedList, boolean z, String str2) {
        UIStateCenter stateCenter;
        CharSequence charSequence;
        String str3;
        C22798i iVar2 = iVar;
        String str4 = str;
        long j2 = j;
        C23310h hVar = iVar2.f65547n;
        if (hVar != null) {
            if (!Util.isNullOrNil(str2)) {
                if (hVar.f67014c == null) {
                    hVar.f67014c = (TextView) hVar.f67012a.findViewById(C0966R.C0970id.oi9);
                }
                hVar.f67014c.setText(str2);
            }
            hVar.mo36791a().removeAllViews();
            int i = 8;
            LinearLayout linearLayout = null;
            if (!z) {
                C23310h hVar2 = iVar2.f65547n;
                if (hVar2 != null) {
                    linearLayout = hVar2.mo36792b();
                }
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                    return;
                }
                return;
            }
            C23310h hVar3 = iVar2.f65547n;
            LinearLayout b = hVar3 != null ? hVar3.mo36792b() : null;
            boolean z2 = false;
            if (b != null) {
                b.setVisibility(0);
            }
            LinkedList linkedList2 = new LinkedList();
            int i2 = 0;
            for (Object next : linkedList) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    pd4 pd4 = (pd4) next;
                    if (!iVar2.f65546j || i2 < iVar2.f65544h) {
                        C52241zb0 zb02 = new C52241zb0();
                        zb02.f145787f = j2;
                        zb02.f145786e = i2;
                        zb02.f145785d = pd4;
                        linkedList2.add(zb02);
                    }
                    i2 = i3;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            if (linkedList2.isEmpty()) {
                C52241zb0 zb03 = new C52241zb0();
                zb03.f145787f = j2;
                zb03.f145786e = 0;
                pd4 pd42 = new pd4();
                pd42.f139710d = str4;
                pd42.f139711e = "LocalRelevantQuery";
                pd42.f139714h = 1;
                zb03.f145785d = pd42;
                linkedList2.add(zb03);
            }
            int i4 = 0;
            for (Object next2 : linkedList2) {
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    C52241zb0 zb04 = (C52241zb0) next2;
                    View inflate = LayoutInflater.from(iVar.getActivity()).inflate(C0966R.C0971layout.d9y, hVar.mo36791a(), z2);
                    pd4 pd43 = zb04.f145785d;
                    if (!Util.isNullOrNil(pd43 != null ? pd43.f139718o : null)) {
                        pd4 pd44 = zb04.f145785d;
                        charSequence = C99254i.m129310g(pd44 != null ? pd44.f139718o : null);
                    } else {
                        pd4 pd45 = zb04.f145785d;
                        if (pd45 == null || (str3 = pd45.f139710d) == null) {
                            str3 = "";
                        }
                        charSequence = C99254i.m129308e(C99667f.m130091d(str3, C99672i.m130094a(str4, z2), z2, z2)).f292107a;
                    }
                    ((TextView) inflate.findViewById(C0966R.C0970id.oi4)).setText(charSequence);
                    if (i4 == linkedList.size() - 1) {
                        View findViewById = inflate.findViewById(C0966R.C0970id.ohr);
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(Integer.valueOf(i));
                        View view = findViewById;
                        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC", "buildRelevantFooter", "(Ljava/lang/String;JLjava/util/LinkedList;ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((Integer) aVar.mo10231a(z2)).intValue());
                        C117292a.m165359e(view, "com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC", "buildRelevantFooter", "(Ljava/lang/String;JLjava/util/LinkedList;ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        View findViewById2 = inflate.findViewById(C0966R.C0970id.ohr);
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(Integer.valueOf(z2 ? 1 : 0));
                        View view2 = findViewById2;
                        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC", "buildRelevantFooter", "(Ljava/lang/String;JLjava/util/LinkedList;ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById2.setVisibility(((Integer) aVar2.mo10231a(z2)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC", "buildRelevantFooter", "(Ljava/lang/String;JLjava/util/LinkedList;ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    View view3 = inflate;
                    C22797h hVar4 = r0;
                    C22797h hVar5 = new C22797h(iVar, str, j, zb04, i4);
                    view3.setOnClickListener(hVar4);
                    view3.setTag(zb04);
                    hVar.mo36791a().addView(view3);
                    i4 = i5;
                    i = 8;
                    z2 = false;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            BaseMvvmActivity d3 = iVar.mo14598d3();
            if (d3 != null && (stateCenter = d3.getStateCenter()) != null) {
                stateCenter.dispatch(new C22839i(str4, j2, linkedList));
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        UIStateCenter e3 = mo14599e3();
        if (e3 != null) {
            e3.process((C0125s) getActivity(), C22800a.f65550d);
        }
        UIStateCenter e35 = mo14599e3();
        if (e35 != null) {
            e35.observe((C0125s) getActivity(), new C22799b(this));
        }
    }
}
