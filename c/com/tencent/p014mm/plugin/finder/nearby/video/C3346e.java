package com.tencent.p014mm.plugin.finder.nearby.video;

import bl3.C39818r;
import cm1.C55012e1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.feed.model.C2781d;
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
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import je1.C9342n1;
import je1.C9360p1;
import le1.C10497i;
import pe3.C89349b;
import sx3.C36907w;
import te3.C64777vl1;
import wp1.C15585f;

/* renamed from: com.tencent.mm.plugin.finder.nearby.video.e */
public final class C3346e implements C9342n1.C9343a {

    /* renamed from: a */
    public final /* synthetic */ int f15785a;

    /* renamed from: b */
    public final /* synthetic */ C3347f f15786b;

    /* renamed from: c */
    public final /* synthetic */ boolean f15787c;

    /* renamed from: d */
    public final /* synthetic */ C9360p1.C9361a f15788d;

    public C3346e(int i, C3347f fVar, boolean z, C9360p1.C9361a aVar) {
        this.f15785a = i;
        this.f15786b = fVar;
        this.f15787c = z;
        this.f15788d = aVar;
    }

    /* renamed from: a */
    public void mo3675a(int i, int i2, String str, C9342n1.C9346d dVar, List<? extends C10497i> list) {
        boolean z;
        int i3 = i;
        int i4 = i2;
        String str2 = str;
        C9342n1.C9346d dVar2 = dVar;
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_TIMELINE_FOOTER_WORDING_STRING_SYNC;
        C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_FINDER_TIMELINE_HEADER_WORDING_STRING_SYNC;
        C87412m.m108594g(dVar2, "resp");
        C87412m.m108594g(list, "interceptors");
        if (i3 == 0 && i4 == 0) {
            if (this.f15785a == 0) {
                Log.m105924i("Finder.NearbyVideoFeedFetcher", "tabType=" + this.f15786b.f15789g + " headWording=" + dVar2.f146071f + " endWording=" + dVar2.f146072g + " prefetch_last_feed_count=" + dVar2.f146076n + " continueFlag:" + dVar2.f29204G);
                C86709a0.m107535s().mo121142i().mo119677K(aVar2, dVar2.f146071f);
                C86709a0.m107535s().mo121142i().mo119677K(aVar, dVar2.f146072g);
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_TIMELINE_PRELOAD_NUM_INT_SYNC, Integer.valueOf(dVar2.f146076n));
            }
            if (dVar2.f146085w != null) {
                C85801v1 i5 = C86709a0.m107535s().mo121142i();
                C72994y1.C72995a aVar3 = C72994y1.C72995a.USERINFO_FINDER_TIMELINE_PRELOAD_REFRESH_CONFIG_STRING_SYNC;
                C64777vl1 vl12 = dVar2.f146085w;
                i5.mo119677K(aVar3, Util.encodeHexString(vl12 != null ? vl12.toByteArray() : null));
                FinderStreamTabPreloadCore finderStreamTabPreloadCore = (FinderStreamTabPreloadCore) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(FinderStreamTabPreloadCore.class);
                int i6 = this.f15786b.f15789g;
                C64777vl1 g3 = finderStreamTabPreloadCore.mo78458g3();
                for (C58341h o : finderStreamTabPreloadCore.f160333e) {
                    o.mo83084o(i6, g3);
                }
            }
            String string = MMApplicationContext.getResources().getString(C0966R.string.es7);
            C87412m.m108593f(string, "getResources().getString…eline_history_header_tip)");
            Object f = C86709a0.m107535s().mo121142i().mo119685f(aVar2, string);
            C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.String");
            String str3 = (String) f;
            String string2 = MMApplicationContext.getResources().getString(C0966R.string.es6);
            C87412m.m108593f(string2, "getResources().getString…eline_history_footer_tip)");
            Object f2 = C86709a0.m107535s().mo121142i().mo119685f(aVar, string2);
            C87412m.m108592e(f2, "null cannot be cast to non-null type kotlin.String");
            String str4 = (String) f2;
            LinkedList<FinderObject> linkedList = dVar2.f146069d;
            C87412m.m108593f(linkedList, "resp.`object`");
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = linkedList.iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                FinderObject finderObject = (FinderObject) next;
                C58784w3 w3Var = C58784w3.f168295a;
                C87412m.m108593f(finderObject, LocaleUtil.ITALIAN);
                w3Var.getClass();
                FinderObjectDesc finderObjectDesc = finderObject.objectDesc;
                int i7 = finderObjectDesc != null ? finderObjectDesc.mediaType : 0;
                if (i7 == 2 || i7 == 4 || i7 == 9) {
                    z = true;
                } else {
                    String str5 = C58784w3.f168296b;
                    Log.m105928w(str5, "" + " isAcceptVideoObj return for invalid mediaType:" + i7);
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            if (arrayList.size() < dVar2.f146069d.size()) {
                Log.m105920e("Finder.NearbyVideoFeedFetcher", "[onCgiBack] has filter some feed. valid=" + arrayList.size() + " raw=" + dVar2.f146069d.size());
            }
            boolean z2 = dVar2.f146074i > 0;
            List<FinderItem> f3 = C15585f.f42211a.mo14343f(arrayList, C58784w3.f168295a.mo83887M1(this.f15786b.f15789g), this.f15786b.f15790h);
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(f3, 10));
            Iterator it4 = ((ArrayList) f3).iterator();
            while (it4.hasNext()) {
                arrayList2.add(C15585f.f42211a.mo14348k((FinderItem) it4.next()));
            }
            LinkedList linkedList2 = new LinkedList(arrayList2);
            C2781d dVar3 = new C2781d(linkedList2, i3, i4, str2);
            dVar3.f13967d = this.f15786b.f15789g;
            dVar3.f13975l = dVar2.f29205H;
            dVar3.f13974k = dVar2.f29206I;
            dVar3.f13971h = dVar2.f29204G;
            dVar3.f13969f = arrayList;
            dVar3.f13973j = dVar2.f29208K;
            dVar3.f13977n = dVar2.f146070e;
            dVar3.f13976m = dVar2.f146082t;
            dVar3.f13970g = dVar2.f146073h;
            if (dVar2.f146074i != 0) {
                z = true;
            }
            dVar3.f13972i = z;
            dVar3.f13978o = dVar2.f146086x;
            if (this.f15785a != 2) {
                C15585f.f42211a.mo14346i(linkedList2, C58784w3.f168295a.mo83887M1(this.f15786b.f15789g), "", z2);
            }
            int i8 = this.f15785a;
            if (i8 == 0 || i8 == 1) {
                C55012e1.f154468d.mo76065i(this.f15786b.f15789g, arrayList);
            }
            if (this.f15787c) {
                C85801v1 i9 = C86709a0.m107535s().mo121142i();
                C72994y1.C72995a a0 = C58784w3.f168295a.mo83914a0(this.f15786b.f15789g);
                C89349b bVar = dVar2.f146070e;
                i9.mo119677K(a0, bVar == null ? null : Util.encodeHexString(bVar.mo123703f()));
            }
            this.f15786b.f15792j = dVar2.f29208K;
            this.f15788d.mo2805a(dVar3, this.f15785a);
            return;
        }
        C2781d dVar4 = new C2781d(new LinkedList(), i3, i4, str2);
        dVar4.f13967d = this.f15786b.f15789g;
        int i15 = this.f15785a;
        dVar4.f13971h = 1;
        dVar4.f13973j = dVar2.f29208K;
        dVar4.f13977n = dVar2.f146070e;
        this.f15788d.mo2805a(dVar4, i15);
    }
}
