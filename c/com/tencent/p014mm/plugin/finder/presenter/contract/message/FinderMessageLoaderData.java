package com.tencent.p014mm.plugin.finder.presenter.contract.message;

import cm1.C39993q1;
import cm1.C55011a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import on1.C11507a;
import p749xh.C66276va;
import pe3.C89349b;
import sx3.C110818d0;
import sx3.C64175a0;
import sx3.C64197v;
import sx3.C77813z;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/message/FinderMessageLoaderData;", "Lon1/a;", "Lcm1/a;", "Companion", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageLoaderData */
public final class FinderMessageLoaderData extends C11507a<C55011a> {

    /* renamed from: k */
    public long f160598k;

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/message/FinderMessageLoaderData$Companion;", "", "()V", "TAG", "", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageLoaderData$Companion */
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderMessageLoaderData(List<? extends C55011a> list, boolean z) {
        super(list, false, (C89349b) null, z, 6, (C8480h) null);
        C87412m.m108594g(list, "feeds");
    }

    /* renamed from: b */
    public void mo11464b(List<C55011a> list) {
        int i;
        boolean z;
        List<C55011a> list2 = list;
        C87412m.m108594g(list2, "dataList");
        list.size();
        if (list.isEmpty()) {
            list2.addAll(this.f33959a);
            return;
        }
        if (C110818d0.m150925W(list) instanceof C39993q1) {
            C64175a0.m75515w(list);
        }
        Iterator<T> it = C110818d0.m150936h0(this.f33959a).iterator();
        while (true) {
            int i2 = -1;
            int i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            C55011a aVar = (C55011a) it.next();
            Iterator<C55011a> it4 = list.iterator();
            int i4 = 0;
            while (true) {
                if (!it4.hasNext()) {
                    i4 = -1;
                    break;
                }
                C66276va vaVar = it4.next().f154465d;
                long j = vaVar.field_id;
                C66276va vaVar2 = aVar.f154465d;
                if (j == vaVar2.field_id && vaVar.field_createTime == vaVar2.field_createTime) {
                    break;
                }
                i4++;
            }
            if (i4 == -1) {
                C66276va vaVar3 = aVar.f154465d;
                if (vaVar3.field_type == 10 && !Util.isNullOrNil(vaVar3.field_clientMsgId)) {
                    Iterator<C55011a> it5 = list.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            break;
                        } else if (C87412m.m108589b(it5.next().f154465d.field_clientMsgId, aVar.f154465d.field_clientMsgId)) {
                            i2 = i3;
                            break;
                        } else {
                            i3++;
                        }
                    }
                    if (i2 >= 0) {
                        list2.remove(i2);
                        Log.m105924i("Finder.MessageLoaderData", "remove same clientMsgId, " + aVar.f154465d.field_clientMsgId);
                    }
                }
                list2.add(aVar);
            } else {
                list2.set(i4, aVar);
            }
        }
        C77813z.m93909o(list2, FinderMessageLoaderData$sortMentionList$comparator$1.f160599d);
        Log.m105924i("Finder.MessageLoaderData", "increment size " + this.f33959a.size());
        if (!this.f33959a.isEmpty()) {
            long j2 = this.f160598k;
            if (j2 > 0) {
                ListIterator<C55011a> listIterator = list2.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i = -1;
                        break;
                    }
                    if (listIterator.previous().f154465d.field_id == j2) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        i = listIterator.nextIndex();
                        break;
                    }
                }
                Log.m105924i("Finder.MessageLoaderData", "unread index " + i + ", dataList size " + list.size());
                if (i != -1) {
                    if (i >= 0) {
                        int i5 = 0;
                        while (true) {
                            list2.get(i5).f154466e = false;
                            if (i5 == i) {
                                break;
                            }
                            i5++;
                        }
                    }
                    if (i != C64197v.m75536e(list)) {
                        list2.get(i).f154466e = true;
                    }
                }
            }
        }
    }
}
