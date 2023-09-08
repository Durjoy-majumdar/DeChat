package sd1;

import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderTopicFeedUI;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import it1.C60625c;
import java.util.ArrayList;
import java.util.LinkedList;
import je1.C9366q0;
import on1.C11507a;
import on1.C11509b;
import on1.C11545o;
import os1.C11755t;
import pe3.C89349b;
import sx3.C36907w;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C51270sn1;
import te3.C52002xp0;
import wp1.C15585f;

/* renamed from: sd1.a */
public final class C13652a extends C11509b<C0740i2, C9366q0, C52002xp0> {

    /* renamed from: e */
    public final int f38673e;

    /* renamed from: f */
    public final long f38674f;

    /* renamed from: g */
    public final Long f38675g;

    /* renamed from: h */
    public final String f38676h;

    /* renamed from: i */
    public final int f38677i;

    /* renamed from: j */
    public final C49712hj1 f38678j;

    /* renamed from: n */
    public final String f38679n;

    /* renamed from: o */
    public final String f38680o;

    /* renamed from: p */
    public final C11755t f38681p;

    public C13652a(int i, long j, Long l, String str, int i2, C89349b bVar, C49712hj1 hj12, String str2, String str3) {
        C87412m.m108594g(str3, "key");
        this.f38673e = i;
        this.f38674f = j;
        this.f38675g = l;
        this.f38676h = str;
        this.f38677i = i2;
        this.f38678j = hj12;
        this.f38679n = str2;
        this.f38680o = str3;
        C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11755t.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…cFeedCacheVM::class.java)");
        this.f38681p = (C11755t) a;
        this.f33817d = bVar;
    }

    /* renamed from: e */
    public C11507a mo11472e(C49335eu3 eu32) {
        C52002xp0 xp02 = (C52002xp0) eu32;
        C87412m.m108594g(xp02, "resp");
        boolean z = true;
        boolean z2 = this.f33817d == null;
        this.f33817d = xp02.f144786e;
        LinkedList<FinderObject> linkedList = xp02.f144785d;
        C87412m.m108593f(linkedList, "resp.`object`");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
        for (FinderObject finderObject : linkedList) {
            FinderItem.C56324a aVar = FinderItem.Companion;
            C87412m.m108593f(finderObject, "feed");
            FinderItem a = aVar.mo79056a(finderObject, 64);
            FinderTopicFeedUI.f14881D.put(Long.valueOf(a.getId()), a);
            arrayList.add(C15585f.f42211a.mo14348k(a));
        }
        Log.m105924i("Finder.ActivityCgiSource", "handleResp incrementList:" + arrayList);
        C89349b bVar = this.f33817d;
        if (bVar != null) {
            z = false;
        }
        C13653b bVar2 = new C13653b(arrayList, z, bVar);
        bVar2.f38682k = xp02.f144789h;
        bVar2.f33811i = xp02.f144787f;
        if (z2 && !Util.isNullOrNil(this.f38680o)) {
            C11755t tVar = this.f38681p;
            String str = this.f38680o;
            C51270sn1 sn12 = xp02.f144789h;
            tVar.getClass();
            C87412m.m108594g(str, "keyWord");
            C11755t.C11756a c3 = tVar.mo11627c3(str);
            c3.f34415b = arrayList;
            c3.f34416c = sn12;
        }
        return bVar2;
    }

    /* renamed from: h */
    public C60625c mo11473h() {
        return new C9366q0(this.f38673e, this.f38674f, this.f38675g, this.f38676h, this.f38677i, this.f33817d, this.f38678j, this.f38679n);
    }

    public C11545o.C11546a getKey() {
        return new C11545o.C11546a(String.valueOf(this.f38677i));
    }
}
