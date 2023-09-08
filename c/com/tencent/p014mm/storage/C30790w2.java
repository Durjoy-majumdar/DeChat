package com.tencent.p014mm.storage;

import android.content.Context;
import bp3.C28361q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.emotion.SmileyInfo;
import com.tencent.p014mm.storage.emotion.SmileyPanelConfigInfo;
import di3.C86312j;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.HashMap;
import p490dl.C97489o;
import qe3.C89625d;
import wh3.C102449a0;
import wh3.C102450c;
import wh3.C102451g;
import wh3.C38129b;
import wh3.C38130d;
import wh3.C38131e;
import wh3.C38132f;
import wh3.C38134i;
import wh3.C38135j;
import wh3.C38136k;
import wh3.C38138m;
import wh3.C38140o;
import wh3.C38142q;
import wh3.C38143r;
import wh3.C38144s;
import wh3.C38145t;
import wh3.C38146u;
import wh3.C38147v;
import wh3.C38148w;
import wh3.C38149x;
import wh3.C38150y;
import z51.C39315g;

/* renamed from: com.tencent.mm.storage.w2 */
public class C30790w2 {

    /* renamed from: w */
    public static final C28361q<C30790w2> f82768w = new C30794d();

    /* renamed from: a */
    public final boolean[] f82769a = {false};

    /* renamed from: b */
    public final boolean[] f82770b = {false};

    /* renamed from: c */
    public C102451g f82771c;

    /* renamed from: d */
    public C102450c f82772d;

    /* renamed from: e */
    public C38132f f82773e;

    /* renamed from: f */
    public C38146u f82774f;

    /* renamed from: g */
    public C38148w f82775g;

    /* renamed from: h */
    public C38140o f82776h;

    /* renamed from: i */
    public C38142q f82777i;

    /* renamed from: j */
    public C38138m f82778j;

    /* renamed from: k */
    public C38144s f82779k;

    /* renamed from: l */
    public C38149x f82780l;

    /* renamed from: m */
    public C38150y f82781m;

    /* renamed from: n */
    public C38136k f82782n;

    /* renamed from: o */
    public C102449a0 f82783o;

    /* renamed from: p */
    public C38129b f82784p;

    /* renamed from: q */
    public C38134i f82785q;

    /* renamed from: r */
    public C38130d f82786r;

    /* renamed from: s */
    public C97489o f82787s;

    /* renamed from: t */
    public final MStorage.IOnStorageChange f82788t = new C30791a();

    /* renamed from: u */
    public final MStorage.IOnStorageChange f82789u = new C30792b(this);

    /* renamed from: v */
    public final MStorage.IOnStorageChange f82790v = new C30793c();

    /* renamed from: com.tencent.mm.storage.w2$a */
    public class C30791a implements MStorage.IOnStorageChange {
        public C30791a() {
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            if (!Util.isNullOrNil(str) && str.equals("event_update_group")) {
                Log.m105919d("MicroMsg.emoji.EmojiStorageMgr", "onNotifyChange event:%s", (String) mStorageEventData.obj);
                if (C86709a0.m107523b().mo121114l()) {
                    ((C39315g) C86312j.m106911c(C39315g.class)).mo58033Cd().mo57680g();
                } else {
                    return;
                }
            }
            if (Util.isNullOrNil(str)) {
                return;
            }
            if (str.equals("event_update_group") || str.equalsIgnoreCase("productID")) {
                Log.m105918d("MicroMsg.emoji.EmojiStorageMgr", "modify emoji gorup .");
                C28361q<C30790w2> qVar = C30790w2.f82768w;
                C30790w2.this.f82787s.mo136772n(true);
            }
        }
    }

    /* renamed from: com.tencent.mm.storage.w2$b */
    public class C30792b implements MStorage.IOnStorageChange {
        public C30792b(C30790w2 w2Var) {
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            if (C86709a0.m107522a()) {
                ((C39315g) C86312j.m106911c(C39315g.class)).mo58033Cd().mo57680g();
            }
        }
    }

    /* renamed from: com.tencent.mm.storage.w2$c */
    public class C30793c implements MStorage.IOnStorageChange {
        public C30793c() {
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            if (str != null && C86709a0.m107522a()) {
                C30790w2.this.f82787s.mo136769k(true);
                C30790w2.this.f82787s.mo136771m(true);
                C30790w2.this.f82787s.mo136770l(true);
            }
        }
    }

    /* renamed from: com.tencent.mm.storage.w2$d */
    public class C30794d extends C28361q<C30790w2> {
        public Object create() {
            return new C30790w2();
        }
    }

    static {
        new ArrayList();
        new HashMap();
    }

    public C30790w2() {
        Log.m105925i("MicroMsg.emoji.EmojiStorageMgr", "EmojiStorageMgr: %s", Util.getStack());
    }

    /* renamed from: h */
    public static C30790w2 m39221h() {
        C30790w2 w2Var = f82768w.get();
        boolean[] zArr = w2Var.f82769a;
        if (!zArr[0]) {
            synchronized (zArr) {
                if (!w2Var.f82769a[0]) {
                    Log.m105924i("MicroMsg.emoji.EmojiStorageMgr", "initStorage: ");
                    boolean z = C86709a0.m107535s().f251811i != null && C86709a0.m107535s().f251811i.mo125628r();
                    if (!z) {
                        Log.m105929w("MicroMsg.emoji.EmojiStorageMgr", "initStorage: db close %s", C86709a0.m107535s().f251811i);
                    }
                    w2Var.f82771c = new C102451g(C86709a0.m107535s().f251811i);
                    w2Var.f82772d = new C102450c(C86709a0.m107535s().f251811i);
                    w2Var.f82773e = new C38132f(C86709a0.m107535s().f251811i, C38131e.f100768z, "EmojiInfoDesc", C38132f.f100770g);
                    w2Var.f82776h = new C38140o(C86709a0.m107535s().f251811i);
                    w2Var.f82777i = new C38142q(C86709a0.m107535s().f251811i);
                    w2Var.f82778j = new C38138m(C86709a0.m107535s().f251811i);
                    w2Var.f82774f = new C38146u(C86709a0.m107535s().f251811i, C38145t.f100793p, "GetEmotionListCache", (String[]) null);
                    w2Var.f82775g = new C38148w(C86709a0.m107535s().f251811i, C38147v.f100796p, "GetEmotionStoreRecListCache", (String[]) null);
                    w2Var.f82779k = new C38144s(C86709a0.m107535s().f251811i, C38143r.f100790z, "EmotionRewardTipInfo", (String[]) null);
                    w2Var.f82780l = new C38149x(C86709a0.m107535s().f251811i, SmileyInfo.f82660F, "SmileyInfo", (String[]) null);
                    w2Var.f82781m = new C38150y(C86709a0.m107535s().f251811i, SmileyPanelConfigInfo.f82661p, "SmileyPanelConfigInfo", (String[]) null);
                    w2Var.f82782n = new C38136k(C86709a0.m107535s().f251811i, C38135j.f100778p, "EmojiSuggestDescInfo", (String[]) null);
                    w2Var.f82783o = new C102449a0();
                    w2Var.f82784p = new C38129b(C86709a0.m107535s().f251811i);
                    w2Var.f82785q = new C38134i(C86709a0.m107535s().f251811i);
                    w2Var.f82786r = new C38130d(C86709a0.m107535s().f251811i);
                    w2Var.f82787s = C97489o.m125592g();
                    if (z) {
                        w2Var.f82769a[0] = true;
                    }
                }
            }
        }
        boolean[] zArr2 = w2Var.f82770b;
        if (!zArr2[0]) {
            synchronized (zArr2) {
                if (!w2Var.f82770b[0]) {
                    if (!C86709a0.m107522a()) {
                        Log.m105920e("MicroMsg.emoji.EmojiStorageMgr", "Not login, skip rest logic this time.");
                    } else {
                        Context context = MMApplicationContext.getContext();
                        if (context != null) {
                            boolean booleanValue = ((Boolean) C86709a0.m107535s().mo121142i().mo119684e(274480, Boolean.TRUE)).booleanValue();
                            Log.m105925i("MicroMsg.emoji.EmojiStorageMgr", "[oneliang]initCore,need init emoji:%s", String.valueOf(booleanValue));
                            if (booleanValue) {
                                w2Var.mo57717d().mo142045TY(context);
                                w2Var.mo57715b().mo142030mL(context);
                            }
                            C86709a0.m107535s().mo121142i().mo119676J(274480, Boolean.FALSE);
                        }
                        C85801v1 i = C86709a0.m107535s().mo121142i();
                        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_EMOJI_CUREENT_VERSION_INT;
                        if (((Integer) i.mo119685f(aVar, 0)).intValue() != C89625d.f257841g) {
                            long currentTimeMillis = System.currentTimeMillis();
                            w2Var.mo57715b().mo142026bO();
                            C86709a0.m107535s().mo121142i().mo119677K(aVar, Integer.valueOf(C89625d.f257841g));
                            Log.m105925i("MicroMsg.emoji.EmojiStorageMgr", "recoverCustomEmojiGroup use time:%d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                        }
                        C85801v1 i2 = C86709a0.m107535s().mo121142i();
                        C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_EMOJI_UPDATE_EMOJI_GROUP_COUNT_BOOLEAN;
                        if (((Boolean) i2.mo119685f(aVar2, Boolean.TRUE)).booleanValue()) {
                            long currentTimeMillis2 = System.currentTimeMillis();
                            C86709a0.m107535s().mo121142i().mo119677K(aVar2, Boolean.valueOf(!w2Var.mo57715b().mo142031nP()));
                            Log.m105925i("MicroMsg.emoji.EmojiStorageMgr", "updateEmojiGroupCount use time:%d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2));
                        }
                        w2Var.f82770b[0] = true;
                    }
                }
            }
        }
        return w2Var;
    }

    /* renamed from: a */
    public C38132f mo57714a() {
        C38132f fVar;
        synchronized (this.f82769a) {
            fVar = this.f82773e;
        }
        return fVar;
    }

    /* renamed from: b */
    public C102450c mo57715b() {
        C102450c cVar;
        synchronized (this.f82769a) {
            cVar = this.f82772d;
        }
        return cVar;
    }

    /* renamed from: c */
    public C38144s mo57716c() {
        C38144s sVar;
        synchronized (this.f82769a) {
            sVar = this.f82779k;
        }
        return sVar;
    }

    /* renamed from: d */
    public C102451g mo57717d() {
        C102451g gVar;
        synchronized (this.f82769a) {
            gVar = this.f82771c;
        }
        return gVar;
    }

    /* renamed from: e */
    public C38138m mo57718e() {
        C38138m mVar;
        synchronized (this.f82769a) {
            mVar = this.f82778j;
        }
        return mVar;
    }

    /* renamed from: f */
    public C38140o mo57719f() {
        C38140o oVar;
        synchronized (this.f82769a) {
            oVar = this.f82776h;
        }
        return oVar;
    }

    /* renamed from: g */
    public C38146u mo57720g() {
        C38146u uVar;
        synchronized (this.f82769a) {
            uVar = this.f82774f;
        }
        return uVar;
    }
}
