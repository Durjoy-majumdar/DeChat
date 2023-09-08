package p007bo;

import com.google.protobuf.C23861l0;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.wechat.p326mm.biz.BizDynamicCardMrg;
import com.tencent.wechat.p326mm.biz.BizManager;
import com.tencent.wechat.p326mm.biz.BizProto;
import com.tencent.wechat.p326mm.biz.BizWechatNotifyDataChange;
import com.tencent.wechat.p326mm.biz.jni.BizAffBridge;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import gw0.C76073b;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;
import jw0.C21291d;
import p144dt.C31283c;
import qe3.C89625d;
import rx3.C13601g;
import rx3.C36568h;
import s90.C77627f;
import s90.C77629i;
import s90.C77630j;

/* renamed from: bo.m */
public final class C16813m {

    /* renamed from: a */
    public static final C16813m f45424a = new C16813m();

    /* renamed from: b */
    public static final C13601g f45425b = C36568h.m40985a(C16814a.f45431d);

    /* renamed from: c */
    public static final boolean f45426c = C0336e.f914a.mo376a();

    /* renamed from: d */
    public static boolean f45427d;

    /* renamed from: e */
    public static boolean f45428e;

    /* renamed from: f */
    public static boolean f45429f = true;

    /* renamed from: g */
    public static Boolean f45430g;

    /* renamed from: bo.m$a */
    public static final class C16814a extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C16814a f45431d = new C16814a();

        public C16814a() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getSingleMMKV("__flutter_biz_mmkv__");
        }
    }

    /* renamed from: a */
    public final BizProto.BizMsgInfo mo17855a(C19623o0 o0Var, boolean z) {
        C87412m.m108594g(o0Var, "info");
        BizProto.BizMsgInfo.Builder newBuilder = BizProto.BizMsgInfo.newBuilder();
        newBuilder.setUserName(o0Var.field_talker);
        newBuilder.setSvrId(o0Var.field_msgSvrId);
        newBuilder.setSvrTime(o0Var.field_createTime);
        newBuilder.setMsgStatus(o0Var.field_isValidExposed ? 2 : o0Var.field_isRead == 1 ? 1 : 0);
        newBuilder.setMsgViewType(0);
        newBuilder.setIsShowBigCover(o0Var.mo25763m2(1));
        newBuilder.setIsExpand(o0Var.field_isExpand);
        newBuilder.setHasRedDot(o0Var.field_hasShow != 1 && z);
        newBuilder.setIsNewMsg(z);
        newBuilder.setRankSessionId(o0Var.field_rankSessionId);
        BizProto.BizMsgItemContent.Builder newBuilder2 = BizProto.BizMsgItemContent.newBuilder();
        C77627f JZ = ((C76073b) C86312j.m106911c(C76073b.class)).mo94597JZ(o0Var.field_msgId, o0Var.field_content);
        C87412m.m108592e(JZ, "null cannot be cast to non-null type com.tencent.mm.message.BizMMReader");
        LinkedList<C77630j> linkedList = ((C77629i) JZ).f226295i;
        if (linkedList != null) {
            for (C77630j jVar : linkedList) {
                C87412m.m108593f(jVar, "item");
                BizProto.BizMsgItem.Builder newBuilder3 = BizProto.BizMsgItem.newBuilder();
                String str = jVar.f226325d;
                String str2 = "";
                if (str == null) {
                    str = str2;
                }
                newBuilder3.setTitle(str);
                String str3 = jVar.f226326e;
                if (str3 == null) {
                    str3 = str2;
                }
                newBuilder3.setUrl(str3);
                newBuilder3.setTime(jVar.f226329h);
                String str4 = jVar.f226330i;
                if (str4 == null) {
                    str4 = str2;
                }
                newBuilder3.setCover(str4);
                String str5 = jVar.f226312D;
                if (str5 == null) {
                    str5 = str2;
                }
                newBuilder3.setCover11(str5);
                String str6 = jVar.f226332n;
                if (str6 == null) {
                    str6 = str2;
                }
                newBuilder3.setDigest(str6);
                newBuilder3.setItemShowType(jVar.f226333o);
                newBuilder3.setPlayLength(jVar.f226335q);
                String str7 = jVar.f226344z;
                if (str7 == null) {
                    str7 = str2;
                }
                newBuilder3.setPlayUrl(str7);
                newBuilder3.setPicNum(jVar.f226311C);
                newBuilder3.setIsPaySubscribe(jVar.f226317I == 1);
                String str8 = jVar.f226315G;
                if (str8 != null) {
                    str2 = str8;
                }
                newBuilder3.setVid(str2);
                newBuilder3.setVideoWidth(jVar.f226313E);
                newBuilder3.setVideoHeight(jVar.f226314F);
                C23861l0 build = newBuilder3.build();
                C87412m.m108593f(build, "newBuilder().apply {\n   …oHeight\n        }.build()");
                newBuilder2.addItems((BizProto.BizMsgItem) build);
            }
        }
        newBuilder.setContent((BizProto.BizMsgItemContent) newBuilder2.build());
        C23861l0 build2 = newBuilder.build();
        C87412m.m108593f(build2, "newBuilder().apply {\n   …build()\n        }.build()");
        return (BizProto.BizMsgInfo) build2;
    }

    /* renamed from: b */
    public final BizDynamicCardMrg mo17856b() {
        mo17859e();
        BizDynamicCardMrg instance = BizDynamicCardMrg.getInstance();
        C87412m.m108593f(instance, "getInstance()");
        return instance;
    }

    /* renamed from: c */
    public final BizManager mo17857c() {
        mo17859e();
        BizManager instance = BizManager.getInstance();
        C87412m.m108593f(instance, "getInstance()");
        return instance;
    }

    /* renamed from: d */
    public final int mo17858d() {
        AtomicInteger atomicInteger = C21291d.f60148a;
        return C21291d.f60148a.incrementAndGet();
    }

    /* renamed from: e */
    public final synchronized void mo17859e() {
        if (!f45427d) {
            if (!C16801f.f45399a.mo17845e()) {
                Log.m105920e("MicroMsg.FlutterBizMsgBridge", "init but not use aff " + Util.getStack());
            }
            Log.m105924i("MicroMsg.FlutterBizMsgBridge", "init resetData= " + f45430g);
            C31283c cVar = (C31283c) C86312j.m106911c(C31283c.class);
            cVar.mo58050qo();
            cVar.mo58051ss(true);
            C16798c cVar2 = C16798c.f45395a;
            BizWechatNotifyDataChange.getInstance().setCallback(C16798c.f45397c);
            C0336e eVar = C0336e.f914a;
            BizDynamicCardMrg.getInstance().setCallback(new C79727d());
            String i = C86013q1.m106448i(VFSStrategy.m163776d("biz_persist"), false);
            String i2 = C86709a0.m107523b().mo121111i();
            BizAffBridge.INSTANCE.setCallBack(new C16796a());
            if (!C86013q1.m106450k(i)) {
                C86013q1.m106461v(i);
            }
            BizManager instance = BizManager.getInstance();
            int d = mo17858d();
            int i3 = C89625d.f257841g;
            boolean z = BuildInfo.DEBUG;
            Boolean bool = f45430g;
            instance.initAsync(d, i, i2, i3, false, z, bool != null ? bool.booleanValue() : false, f45426c);
            f45427d = true;
        }
    }
}
