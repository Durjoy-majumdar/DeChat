package com.tencent.p014mm.plugin.appbrand.appusage;

import android.os.Bundle;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appusage.C29378l0;
import com.tencent.p014mm.plugin.appbrand.appusage.C81516o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49335eu3;
import te3.C50385md2;
import te3.e55;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.q */
public class C81521q extends C55445n0 {

    /* renamed from: i */
    public final /* synthetic */ C81516o.C68588b f239128i;

    /* renamed from: j */
    public final /* synthetic */ int f239129j;

    /* renamed from: n */
    public final /* synthetic */ int f239130n;

    /* renamed from: o */
    public final /* synthetic */ boolean f239131o;

    /* renamed from: p */
    public final /* synthetic */ Bundle f239132p;

    /* renamed from: q */
    public final /* synthetic */ long f239133q;

    /* renamed from: r */
    public final /* synthetic */ C81516o f239134r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81521q(C81516o oVar, int i, int i2, int i3, int i4, int i5, C81516o.C68588b bVar, int i6, int i7, boolean z, Bundle bundle, long j) {
        super(i, i2, i3, i4, i5);
        this.f239134r = oVar;
        this.f239128i = bVar;
        this.f239129j = i6;
        this.f239130n = i7;
        this.f239131o = z;
        this.f239132p = bundle;
        this.f239133q = j;
    }

    /* renamed from: h */
    public void mo10094h(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        String str2;
        int i3 = i;
        int i4 = i2;
        String str3 = str;
        C50385md2 md22 = (C50385md2) eu32;
        if (C86709a0.m107522a()) {
            int i5 = 2;
            if (md22 == null) {
                str2 = "null";
            } else {
                Locale locale = Locale.US;
                Object[] objArr = new Object[3];
                LinkedList<e55> linkedList = md22.f137957e;
                int i6 = -1;
                objArr[0] = Integer.valueOf(linkedList == null ? -1 : linkedList.size());
                LinkedList<e55> linkedList2 = md22.f137958f;
                if (linkedList2 != null) {
                    i6 = linkedList2.size();
                }
                objArr[1] = Integer.valueOf(i6);
                objArr[2] = Integer.valueOf(md22.f137959g);
                str2 = String.format(locale, "%d %d %d", objArr);
            }
            Log.m105925i("MicroMsg.AppBrandHistoryLogic[collection]", "onCgiBack, errType %d, errCode %d, errMsg %s, resp %s", Integer.valueOf(i), Integer.valueOf(i2), str3, str2);
            if (md22 == null) {
                C81516o.C68588b bVar = this.f239128i;
                if (bVar != null) {
                    bVar.mo94253a(false, "cgi response is null");
                }
            } else if (i3 == 0 && i4 == 0) {
                if ((this.f239129j & 4) > 0) {
                    Set<Object> set = C81478e0.f239071d;
                    C85801v1 i7 = C86709a0.m107535s().mo121142i();
                    C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_APP_BRAND_ENTRANCE_HAS_SEEN_NEARBY_SHOWCASE_BOOLEAN_SYNC;
                    if (!i7.mo119686g(aVar, false) && (md22.f137959g & 8) > 0) {
                        C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.TRUE);
                    }
                }
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_APP_BRAND_HISTORY_HAS_MORE_BOOLEAN, Boolean.valueOf((md22.f137959g & 4) > 0));
                int i8 = md22.f137959g;
                int i9 = this.f239130n;
                if (C86709a0.m107522a()) {
                    C85801v1 i15 = C86709a0.m107535s().mo121142i();
                    C81508l.m100003e((i8 & 2) > 0, i9 != 4, "");
                    i15.mo119677K(C72994y1.C72995a.USERINFO_APP_BRAND_USAGE_RECORD_HAS_FAVORITE_BOOLEAN, Boolean.valueOf((i8 & 1) > 0));
                }
                if (!Util.isNullOrNil((List) md22.f137958f)) {
                    C81161g2.requireAccountInitializedOnDemand();
                    C29378l0 l0Var = C81161g2.f238473i;
                    LinkedList<e55> linkedList3 = md22.f137958f;
                    l0Var.getClass();
                    C29378l0.C29380b bVar2 = new C29378l0.C29380b();
                    LinkedList linkedList4 = new LinkedList();
                    LinkedList linkedList5 = new LinkedList();
                    long beginTransaction = l0Var.f80165e.beginTransaction(Thread.currentThread().getId());
                    Iterator<e55> it = linkedList3.iterator();
                    while (it.hasNext()) {
                        e55 next = it.next();
                        if (!Util.isNullOrNil(next.f132708d)) {
                            bVar2.field_brandId = next.f132708d;
                            bVar2.field_versionType = next.f132710f;
                            bVar2.field_scene = i5;
                            Iterator<e55> it4 = it;
                            if (!l0Var.f80164d.get(bVar2, new String[0])) {
                                bVar2.field_updateTime = (long) next.f132709e;
                                bVar2.field_usedInThirdPartyAppRecently = next.f132712h;
                                bVar2.field_thirdPartyAppUsingDesc = next.f132713i;
                                if (l0Var.mo56646kD(bVar2)) {
                                    linkedList4.add(String.valueOf(bVar2.field_recordId));
                                }
                            } else {
                                bVar2.field_updateTime = Math.max((long) next.f132709e, bVar2.field_updateTime);
                                bVar2.field_usedInThirdPartyAppRecently = next.f132712h;
                                bVar2.field_thirdPartyAppUsingDesc = next.f132713i;
                                if (l0Var.f80164d.update(bVar2, new String[0])) {
                                    linkedList5.add(String.valueOf(bVar2.field_recordId));
                                }
                            }
                            int i16 = i;
                            int i17 = i2;
                            String str4 = str;
                            it = it4;
                            i5 = 2;
                        }
                    }
                    l0Var.f80165e.endTransaction(beginTransaction);
                    if (!Util.isNullOrNil((List) linkedList4)) {
                        l0Var.doNotify(MStorageEventData.EventType.BATCH, 2, linkedList4);
                    }
                    if (!Util.isNullOrNil((List) linkedList5)) {
                        l0Var.doNotify(MStorageEventData.EventType.BATCH, 3, linkedList5);
                    }
                    if (!Util.isNullOrNil((List) md22.f137958f)) {
                        int i18 = md22.f137958f.getFirst().f132709e;
                        Iterator<e55> it5 = md22.f137958f.iterator();
                        while (it5.hasNext()) {
                            i18 = Math.min(i18, it5.next().f132709e);
                        }
                        if (!this.f239131o && i18 > 0) {
                            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_APP_BRAND_HISTORY_LIST_PAGING_LAST_SERVER_MIN_UPDATE_TIME_LONG, Long.valueOf((long) i18));
                        }
                    }
                    C81507k0.m99998a(this.f239130n, this.f239132p, md22.f137958f, new C81519p(this));
                } else {
                    C81516o.C68588b bVar3 = this.f239128i;
                    if (bVar3 != null) {
                        bVar3.mo94253a(true, "");
                    }
                }
                C81506j0.m99997b(this.f239130n, i, i2, str, (C47350c) yVar.getReqResp(), Long.valueOf(this.f239133q));
            } else {
                C81516o.C68588b bVar4 = this.f239128i;
                if (bVar4 != null) {
                    bVar4.mo94253a(false, "cgi errorType:" + i + " errorCode:" + i2 + " errMsg:" + str);
                }
            }
            this.f239134r.doNotify(MStorageEventData.EventType.BATCH, 3, Long.valueOf(this.f239133q));
        }
    }
}
