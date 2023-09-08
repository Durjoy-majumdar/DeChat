package ke1;

import bl3.C39818r;
import cm1.C0740i2;
import cm1.C55012e1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2487r;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2490t;
import com.tencent.p014mm.plugin.finder.feed.model.C2781d;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import do1.C58341h;
import er1.C58784w3;
import f40.C86709a0;
import ft1.C59319a;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import je1.C9342n1;
import je1.C9360p1;
import le1.C10497i;
import o40.C11348f;
import o40.C61926c;
import pe3.C89349b;
import sx3.C36907w;
import te3.C48736am1;
import te3.C64777vl1;
import wp1.C15585f;
import z04.C112551y;

/* renamed from: ke1.v */
public final class C9606v implements C9342n1.C9343a {

    /* renamed from: a */
    public final /* synthetic */ int f29885a;

    /* renamed from: b */
    public final /* synthetic */ C9342n1 f29886b;

    /* renamed from: c */
    public final /* synthetic */ C9610x f29887c;

    /* renamed from: d */
    public final /* synthetic */ boolean f29888d;

    /* renamed from: e */
    public final /* synthetic */ C9360p1.C9361a f29889e;

    /* renamed from: ke1.v$a */
    public static final class C9607a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C9342n1 f29890d;

        /* renamed from: e */
        public final /* synthetic */ int f29891e;

        /* renamed from: f */
        public final /* synthetic */ List<FinderObject> f29892f;

        /* renamed from: g */
        public final /* synthetic */ C9342n1.C9346d f29893g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9607a(C9342n1 n1Var, int i, List<? extends FinderObject> list, C9342n1.C9346d dVar) {
            super(0);
            this.f29890d = n1Var;
            this.f29891e = i;
            this.f29892f = list;
            this.f29893g = dVar;
        }

        public Object invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("tabType=");
            sb.append(this.f29890d.f29180d);
            sb.append(" pullType=");
            sb.append(this.f29891e);
            sb.append(" valid=");
            sb.append(this.f29892f.size());
            sb.append(" raw=");
            sb.append(this.f29893g.f146069d.size());
            sb.append(' ');
            StringBuilder sb4 = new StringBuilder();
            sb4.append("invalidFeed=");
            LinkedList<FinderObject> linkedList = this.f29893g.f146069d;
            C87412m.m108593f(linkedList, "resp.`object`");
            ArrayList arrayList = new ArrayList();
            for (T next : linkedList) {
                FinderObject finderObject = (FinderObject) next;
                C58784w3 w3Var = C58784w3.f168295a;
                C87412m.m108593f(finderObject, LocaleUtil.ITALIAN);
                if (!w3Var.mo83866E0(finderObject)) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                FinderObject finderObject2 = (FinderObject) it.next();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(C61926c.m72691p(finderObject2.f164794id));
                sb5.append('#');
                FinderObjectDesc finderObjectDesc = finderObject2.objectDesc;
                sb5.append(finderObjectDesc != null ? Integer.valueOf(finderObjectDesc.mediaType) : null);
                arrayList2.add(sb5.toString());
            }
            sb4.append(arrayList2);
            sb.append(C112551y.m153816p(sb4.toString(), ",", ";", false, 4, (Object) null));
            return sb.toString();
        }
    }

    public C9606v(int i, C9342n1 n1Var, C9610x xVar, boolean z, C9360p1.C9361a aVar) {
        this.f29885a = i;
        this.f29886b = n1Var;
        this.f29887c = xVar;
        this.f29888d = z;
        this.f29889e = aVar;
    }

    /* renamed from: a */
    public void mo3675a(int i, int i2, String str, C9342n1.C9346d dVar, List<? extends C10497i> list) {
        BaseFinderFeed baseFinderFeed;
        int i3 = i;
        int i4 = i2;
        String str2 = str;
        C9342n1.C9346d dVar2 = dVar;
        C87412m.m108594g(dVar2, "resp");
        C87412m.m108594g(list, "interceptors");
        if (i3 == 0 && i4 == 0) {
            if (this.f29885a == 0) {
                C58784w3.f168295a.mo83861C1(dVar2, this.f29886b.f29180d, this.f29887c.f29923u);
            }
            if (dVar2.f146085w != null) {
                C85801v1 i5 = C86709a0.m107535s().mo121142i();
                C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_TIMELINE_PRELOAD_REFRESH_CONFIG_STRING_SYNC;
                C64777vl1 vl12 = dVar2.f146085w;
                i5.mo119677K(aVar, Util.encodeHexString(vl12 != null ? vl12.toByteArray() : null));
                FinderStreamTabPreloadCore finderStreamTabPreloadCore = (FinderStreamTabPreloadCore) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(FinderStreamTabPreloadCore.class);
                int i6 = this.f29886b.f29180d;
                C64777vl1 g3 = finderStreamTabPreloadCore.mo78458g3();
                for (C58341h o : finderStreamTabPreloadCore.f160333e) {
                    o.mo83084o(i6, g3);
                }
            }
            C9603s sVar = this.f29887c.f29914i;
            if (sVar != null) {
                sVar.f29868a = null;
            }
            String string = MMApplicationContext.getResources().getString(C0966R.string.es7);
            C87412m.m108593f(string, "getResources()\n         …eline_history_header_tip)");
            Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_TIMELINE_HEADER_WORDING_STRING_SYNC, string);
            C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.String");
            String str3 = (String) f;
            String string2 = MMApplicationContext.getResources().getString(C0966R.string.es6);
            C87412m.m108593f(string2, "getResources()\n         …eline_history_footer_tip)");
            Object f2 = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_TIMELINE_FOOTER_WORDING_STRING_SYNC, string2);
            C87412m.m108592e(f2, "null cannot be cast to non-null type kotlin.String");
            String str4 = (String) f2;
            LinkedList<FinderObject> linkedList = dVar2.f146069d;
            C87412m.m108593f(linkedList, "resp.`object`");
            ArrayList arrayList = new ArrayList();
            for (T next : linkedList) {
                FinderObject finderObject = (FinderObject) next;
                C58784w3 w3Var = C58784w3.f168295a;
                C87412m.m108593f(finderObject, LocaleUtil.ITALIAN);
                if (w3Var.mo83866E0(finderObject)) {
                    arrayList.add(next);
                }
            }
            if (arrayList.size() < dVar2.f146069d.size()) {
                Log.m105920e(this.f29887c.f29923u, "[onCgiBack] has filter some feed. valid=" + arrayList.size() + " raw=" + dVar2.f146069d.size());
                C11348f.C11349a.m11177a(C59319a.f169618b, "finderStreamReturnInvalidFeed", true, (C11348f.C11352b) null, false, false, new C9607a(this.f29886b, this.f29885a, arrayList, dVar2), 28, (Object) null);
            }
            boolean z = dVar2.f146074i > 0;
            List<FinderItem> f3 = C15585f.f42211a.mo14343f(arrayList, C58784w3.f168295a.mo83887M1(this.f29886b.f29180d), this.f29887c.f29913h);
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(f3, 10));
            Iterator it = ((ArrayList) f3).iterator();
            while (it.hasNext()) {
                arrayList2.add(C15585f.f42211a.mo14348k((FinderItem) it.next()));
            }
            LinkedList linkedList2 = new LinkedList(arrayList2);
            C2781d dVar3 = new C2781d(linkedList2, i3, i4, str2);
            dVar3.f13967d = this.f29886b.f29180d;
            dVar3.f13975l = Math.min(dVar2.f29205H, arrayList.size());
            Math.min(dVar2.f29207J, arrayList.size());
            dVar3.f13974k = dVar2.f29206I;
            dVar3.f13971h = dVar2.f29204G;
            dVar3.f13969f = arrayList;
            dVar3.f13973j = dVar2.f29208K;
            boolean z2 = this.f29887c.f29918p;
            dVar3.f13977n = dVar2.f146070e;
            dVar3.f13976m = dVar2.f146082t;
            dVar3.f13970g = dVar2.f146073h;
            dVar3.f13972i = dVar2.f146074i != 0;
            dVar3.f13978o = dVar2.f146086x;
            dVar3.f13979p = dVar2;
            C9610x xVar = this.f29887c;
            xVar.getClass();
            Iterator<T> it4 = list.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                C10497i iVar = (C10497i) it4.next();
                if (iVar.mo10787b(dVar3, xVar.f29912g)) {
                    Log.m105928w(xVar.f29923u, "[onCgiBack] before Interceptor is interrupted by " + iVar);
                    break;
                }
            }
            if (!(this.f29885a == 2 || this.f29887c.f29917o == 1)) {
                C15585f.f42211a.mo14346i(linkedList2, C58784w3.f168295a.mo83887M1(this.f29886b.f29180d), "", z);
            }
            C9610x xVar2 = this.f29887c;
            xVar2.getClass();
            Iterator<T> it5 = list.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                C10497i iVar2 = (C10497i) it5.next();
                if (iVar2.mo10786a(dVar3, xVar2.f29912g)) {
                    Log.m105928w(xVar2.f29923u, "[onCgiBack] after Interceptor is interrupted by " + iVar2);
                    break;
                }
            }
            int i7 = this.f29885a;
            if (i7 == 0 || i7 == 1) {
                C55012e1.f154468d.mo76065i(this.f29886b.f29180d, arrayList);
            }
            if (this.f29888d) {
                C85801v1 i8 = C86709a0.m107535s().mo121142i();
                C72994y1.C72995a a0 = C58784w3.f168295a.mo83914a0(this.f29886b.f29180d);
                C89349b bVar = dVar2.f146070e;
                i8.mo119677K(a0, bVar == null ? null : Util.encodeHexString(bVar.mo123703f()));
            }
            this.f29887c.f29918p = dVar2.f29208K;
            this.f29889e.mo2805a(dVar3, this.f29885a);
            int i9 = this.f29885a;
            if (i9 == 0 || i9 == 1 || i9 == 4) {
                C2490t.f13006a.getClass();
                C48736am1 am12 = dVar.mo10088b().f145364J;
                if (am12 == null || am12.f130635j == 0) {
                    Iterator it6 = linkedList2.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            baseFinderFeed = null;
                            break;
                        }
                        C0740i2 i2Var = (C0740i2) it6.next();
                        if (i2Var instanceof BaseFinderFeed) {
                            baseFinderFeed = (BaseFinderFeed) i2Var;
                            continue;
                        } else {
                            baseFinderFeed = null;
                            continue;
                        }
                        if (baseFinderFeed != null) {
                            break;
                        }
                    }
                    if (!(baseFinderFeed == null || dVar.mo10088b().f145380r == 0)) {
                        C11348f.C11349a.m11178b(C59319a.f169618b, "finderCgiBackWrongRedDotFeed", dVar.mo10088b().f145380r == baseFinderFeed.mo3513o().getFeedObject().f164794id, (C11348f.C11352b) null, false, false, new C2487r(dVar2, baseFinderFeed), 28, (Object) null);
                    }
                }
            }
        } else {
            C2781d dVar4 = new C2781d(new LinkedList(), i3, i4, str2);
            dVar4.f13967d = this.f29886b.f29180d;
            int i15 = this.f29885a;
            dVar4.f13971h = 1;
            dVar4.f13973j = dVar2.f29208K;
            dVar4.f13977n = dVar2.f146070e;
            this.f29889e.mo2805a(dVar4, i15);
        }
        C9603s sVar2 = this.f29887c.f29914i;
        if (sVar2 != null) {
            sVar2.f29869b = null;
        }
        if (sVar2 != null) {
            sVar2.f29875h = false;
        }
    }
}
