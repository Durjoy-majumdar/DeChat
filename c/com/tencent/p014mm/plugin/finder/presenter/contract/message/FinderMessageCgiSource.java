package com.tencent.p014mm.plugin.finder.presenter.contract.message;

import cm1.C55011a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import je1.C60802k0;
import je1.C60806o3;
import kj2.C117407d;
import kotlin.Metadata;
import on1.C11507a;
import on1.C11509b;
import on1.C11545o;
import p749xh.C66276va;
import pe3.C89349b;
import sx3.C110818d0;
import sx3.C110823p;
import te3.C49335eu3;
import te3.C49686hc1;
import te3.C51274so0;
import te3.C64257bc1;
import wp1.C66169h;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/message/FinderMessageCgiSource;", "Lon1/b;", "Lcm1/a;", "Lje1/k0;", "Lte3/so0;", "Companion", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageCgiSource */
public final class FinderMessageCgiSource extends C11509b<C55011a, C60802k0, C51274so0> {

    /* renamed from: e */
    public final int f160588e;

    /* renamed from: f */
    public final int f160589f;

    /* renamed from: g */
    public final int[] f160590g;

    /* renamed from: h */
    public final String f160591h;

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/message/FinderMessageCgiSource$Companion;", "", "()V", "TAG", "", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageCgiSource$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    static {
        new Companion((C8480h) null);
    }

    public FinderMessageCgiSource(int i, int i2, int[] iArr, String str, int i3, C8480h hVar) {
        str = (i3 & 8) != 0 ? C66785b.f191882e.mo90662O5() : str;
        C87412m.m108594g(iArr, "messageTypes");
        C87412m.m108594g(str, "username");
        this.f160588e = i;
        this.f160589f = i2;
        this.f160590g = iArr;
        this.f160591h = str;
    }

    /* renamed from: d */
    public C11507a<C55011a> mo11471d(int i, int i2, String str) {
        C87412m.m108594g(str, OpenSDKTool4Assistant.EXTRA_ERROR_MSG);
        FinderMessageLoaderData finderMessageLoaderData = new FinderMessageLoaderData(new ArrayList(), false);
        finderMessageLoaderData.f33809g = i2;
        finderMessageLoaderData.f33808f = i;
        finderMessageLoaderData.f33810h = str;
        return finderMessageLoaderData;
    }

    /* renamed from: e */
    public C11507a mo11472e(C49335eu3 eu32) {
        C51274so0 so02 = (C51274so0) eu32;
        C87412m.m108594g(so02, "resp");
        LinkedList linkedList = new LinkedList();
        C49686hc1 hc12 = so02.f141644d;
        if (hc12 != null) {
            Log.m105924i("Finder.MessageCgiSource", "GetMentionList size " + hc12.f134566d.size());
            LinkedList<C64257bc1> linkedList2 = hc12.f134566d;
            C87412m.m108593f(linkedList2, "mentionList.mentions");
            linkedList2.isEmpty();
            LinkedList<C64257bc1> linkedList3 = hc12.f134566d;
            C87412m.m108593f(linkedList3, "mentionList.mentions");
            for (C64257bc1 bc12 : linkedList3) {
                C66169h.C66170a aVar = C66169h.f190180a;
                int i = this.f160588e;
                C87412m.m108593f(bc12, "mention");
                linkedList.add(aVar.mo90251j(i, bc12, this.f160591h));
            }
            LinkedList<C64257bc1> linkedList4 = hc12.f134566d;
            C87412m.m108593f(linkedList4, "mentionList.mentions");
            linkedList4.isEmpty();
            LinkedList<C64257bc1> linkedList5 = hc12.f134566d;
            C87412m.m108593f(linkedList5, "mentionList.mentions");
            for (C64257bc1 bc13 : linkedList5) {
                if (bc13.f182262f == 10 && !Util.isNullOrNil(bc13.f182249F)) {
                    Log.m105924i("Finder.MessageCgiSource", "MENTION_TYPE_FOLLOW_APPLICATION APPROVED, clean db, username:" + bc13.f182278y + ", clientMsgId:" + bc13.f182249F + " scene:" + this.f160588e);
                    C66169h.C66170a aVar2 = C66169h.f190180a;
                    String str = bc13.f182249F;
                    if (str == null) {
                        str = "";
                    }
                    aVar2.mo90249h(str, this.f160588e);
                }
            }
            if (!linkedList.isEmpty()) {
                C66169h.f190180a.mo90248g(linkedList, this.f160588e);
            }
            C89349b bVar = so02.f141645e;
            if (bVar != null) {
                C60806o3.f173187p.mo85731e(this.f160588e, this.f160589f, bVar.mo123703f(), C66785b.f191882e.mo90662O5());
            }
            if (bVar != null && bVar.f257327a.length == 0) {
                int i2 = this.f160588e;
                char c = i2 != 1 ? i2 != 2 ? (char) 0 : 1 : 2;
                if (c == 2) {
                    int i3 = this.f160589f;
                    if (i3 == 1) {
                        C117407d.INSTANCE.idkeyStat(1279, 50, 1, false);
                    } else if (i3 == 2) {
                        C117407d.INSTANCE.idkeyStat(1279, 51, 1, false);
                    }
                } else if (c == 1) {
                    C117407d.INSTANCE.idkeyStat(1279, 52, 1, false);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("lastBuf ");
            sb.append(bVar != null ? Integer.valueOf(bVar.f257327a.length) : "null");
            Log.m105924i("Finder.MessageCgiSource", sb.toString());
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : linkedList) {
            if (C110823p.m151008x(this.f160590g, ((C66276va) next).field_type)) {
                arrayList.add(next);
            }
        }
        C66276va vaVar = (C66276va) C110818d0.m150925W(arrayList);
        long j = vaVar != null ? vaVar.field_id : -1;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C55011a i4 = C66169h.f190180a.mo90250i((C66276va) it.next());
            if (i4 != null) {
                arrayList2.add(i4);
            }
        }
        Log.m105924i("Finder.MessageCgiSource", "load:" + arrayList2.size() + " unreadMentionId:" + j);
        FinderMessageLoaderData finderMessageLoaderData = new FinderMessageLoaderData(arrayList2, true);
        finderMessageLoaderData.f160598k = j;
        return finderMessageLoaderData;
    }

    /* renamed from: h */
    public C60625c mo11473h() {
        return new C60802k0(this.f160588e, this.f160589f, (String) null, 4, (C8480h) null);
    }

    public C11545o.C11546a getKey() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f160588e);
        sb.append('-');
        sb.append(this.f160589f);
        return new C11545o.C11546a(sb.toString());
    }
}
