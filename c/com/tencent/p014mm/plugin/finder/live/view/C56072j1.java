package com.tencent.p014mm.plugin.finder.live.view;

import android.app.Activity;
import android.os.Looper;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d92.C45293c;
import di3.C86312j;
import fj1.C45795b;
import fy3.C32224a;
import gg1.C32444a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import java.util.LinkedList;
import o40.C61926c;
import rx3.C13601g;
import rx3.C36568h;
import te3.C64273c21;
import te3.C64459j13;
import te3.C64766v41;
import tf0.C64916p1;

/* renamed from: com.tencent.mm.plugin.finder.live.view.j1 */
public final class C56072j1 {

    /* renamed from: d */
    public static final C13601g<Long> f159901d = C36568h.m40985a(C29970a.f81139d);

    /* renamed from: a */
    public C56069i1 f159902a;

    /* renamed from: b */
    public HashMap<Long, C64766v41> f159903b = new HashMap<>();

    /* renamed from: c */
    public final C13601g f159904c = C36568h.m40985a(new C56073b(this));

    /* renamed from: com.tencent.mm.plugin.finder.live.view.j1$a */
    public static final class C29970a extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public static final C29970a f81139d = new C29970a();

        public C29970a() {
            super(0);
        }

        public Object invoke() {
            return Long.valueOf(((long) C32444a.f86149h.mo60266n().intValue()) * 1000);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.j1$b */
    public static final class C56073b extends C87413o implements C32224a<MMHandler> {

        /* renamed from: d */
        public final /* synthetic */ C56072j1 f159905d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56073b(C56072j1 j1Var) {
            super(0);
            this.f159905d = j1Var;
        }

        public Object invoke() {
            MMHandler mMHandler = new MMHandler(Looper.getMainLooper(), (MMHandler.Callback) new C56088l1(this.f159905d));
            mMHandler.setLogging(false);
            return mMHandler;
        }
    }

    public C56072j1(Activity activity, byte[] bArr) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C64766v41 v412 = new C64766v41();
        if (bArr != null) {
            try {
                v412.parseFrom(bArr);
                mo78156a(v412);
            } catch (Throwable th) {
                Log.m105921e("FinderLiveMultiTaskManager", "initMultiTaskData", th);
            }
        }
        String str = v412.f185828d;
        C56069i1 i1Var = new C56069i1(activity, new C45293c(activity));
        this.f159902a = i1Var;
        i1Var.mo35809D(21, str == null ? ((C64916p1) C86312j.m106911c(C64916p1.class)).mo76729yP() : str);
    }

    /* renamed from: a */
    public final void mo78156a(C64766v41 v412) {
        String str;
        if (v412.f185837p.isEmpty()) {
            long j = v412.f185829e;
            if (j != 0) {
                this.f159903b.put(Long.valueOf(j), v412);
                return;
            }
            return;
        }
        LinkedList<FinderObject> linkedList = v412.f185837p;
        C87412m.m108593f(linkedList, "originData.allHistoryFinderObjectList");
        for (FinderObject finderObject : linkedList) {
            C64273c21 c212 = finderObject.liveInfo;
            if (c212 != null) {
                HashMap<Long, C64766v41> hashMap = this.f159903b;
                Long valueOf = Long.valueOf(c212.f182392d);
                C64766v41 v413 = new C64766v41();
                v413.f185828d = C61926c.m72691p(c212.f182392d);
                v413.f185829e = c212.f182392d;
                v413.f185830f = finderObject.objectNonceId;
                v413.f185831g = finderObject.f164794id;
                String str2 = finderObject.username;
                String str3 = "";
                if (str2 == null) {
                    str2 = str3;
                }
                v413.f185832h = str2;
                FinderObjectDesc finderObjectDesc = finderObject.objectDesc;
                if (!(finderObjectDesc == null || (str = finderObjectDesc.description) == null)) {
                    str3 = str;
                }
                v413.f185833i = str3;
                v413.f185834j = finderObject.sessionBuffer;
                v413.f185835n = finderObject;
                hashMap.put(valueOf, v413);
            }
        }
    }

    /* renamed from: b */
    public final void mo78157b() {
        MultiTaskInfo multiTaskInfo;
        String str;
        Class cls = C55001u.class;
        C45795b.C32059a aVar = C45795b.f123697j;
        C45795b bVar = C45795b.f123698n;
        if (bVar != null) {
            C54991o oVar = (C54991o) bVar.mo71262a(C54991o.class);
            C64766v41 v412 = this.f159903b.get(Long.valueOf(((C55001u) oVar.business(cls)).f154420q.f182392d));
            if (v412 != null && (multiTaskInfo = this.f159902a.f326418a) != null) {
                FinderObject finderObject = oVar.f154341n;
                FinderAuthInfo finderAuthInfo = null;
                FinderContact finderContact = finderObject != null ? finderObject.contact : null;
                String p = C61926c.m72691p(((C55001u) oVar.business(cls)).f154420q.f182392d);
                multiTaskInfo.field_id = p;
                v412.f185828d = p;
                C64459j13 m2 = multiTaskInfo.mo80305m2();
                if (finderContact == null || (str = finderContact.headUrl) == null) {
                    str = "";
                }
                m2.f183756i = str;
                multiTaskInfo.field_data = v412.toByteArray();
                if (finderContact != null) {
                    multiTaskInfo.mo80305m2().f183751d = finderContact.nickname;
                    FinderAuthInfo finderAuthInfo2 = finderContact.authInfo;
                    if (finderAuthInfo2 != null) {
                        if (finderAuthInfo2.authIconType > 0) {
                            finderAuthInfo = finderAuthInfo2;
                        }
                        if (finderAuthInfo != null) {
                            multiTaskInfo.mo80305m2().f183757j = finderAuthInfo.authIconType;
                            multiTaskInfo.mo80305m2().f183753f = finderAuthInfo.authIconUrl;
                        }
                    }
                }
            }
        }
    }

    public C56072j1(Activity activity, C56072j1 j1Var) {
        C64766v41 v412;
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(j1Var, "manager");
        this.f159903b = j1Var.f159903b;
        this.f159902a = new C56069i1(activity, new C45293c(activity));
        C45795b.C32059a aVar = C45795b.f123697j;
        C45795b bVar = C45795b.f123698n;
        String str = null;
        if (!(bVar == null || (v412 = this.f159903b.get(Long.valueOf(((C55001u) ((C54991o) bVar.mo71262a(C54991o.class)).business(C55001u.class)).f154420q.f182392d))) == null)) {
            str = v412.f185828d;
        }
        this.f159902a.mo35809D(21, str == null ? ((C64916p1) C86312j.m106911c(C64916p1.class)).mo76729yP() : str);
    }
}
