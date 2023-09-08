package com.tencent.p014mm.p136ui.conversation.banner;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75595v3;
import eb0.C75598w3;
import eb0.C97625j3;
import gb0.C75896b;
import jl3.C9470d;
import mj3.C76772b;
import xd3.C78801a;

/* renamed from: com.tencent.mm.ui.conversation.banner.h */
public final class C74666h {

    /* renamed from: com.tencent.mm.ui.conversation.banner.h$a */
    public enum C74667a {
        MAIN_FRAME_BANNER,
        CHATTING_RECOMMEND_BANNER,
        CHATTING_SECURITY_BANNER_V2,
        NET_WARN_BANNER,
        OTHER_ONLINE_BANNER,
        STORAGE_PERMISSION_BANNER,
        FACEBOOK_BANNER,
        AD_BANNER,
        TRY_NEW_INIT_BANNER,
        MAIN_FRAME_AND_ABTEST_BANNER,
        CHATTING_MONITORED_HINT,
        CHATTING_FOLD_BANNER
    }

    /* renamed from: a */
    public static C78801a m89417a(Context context, C74667a aVar, Object[] objArr) {
        C78801a kVar;
        boolean z = false;
        switch (aVar.ordinal()) {
            case 0:
                C75595v3 d = C75598w3.m90816e().mo105952d();
                if (d != null) {
                    return new C74665a0(context, d);
                }
                return null;
            case 1:
                if (objArr == null || objArr.length != 2) {
                    return null;
                }
                Object obj = objArr[0];
                String obj2 = obj != null ? obj.toString() : null;
                Object obj3 = objArr[1];
                String obj4 = obj3 != null ? obj3.toString() : null;
                if (C97625j3.m125812b().mo105904s() == null) {
                    Log.m105928w("MicroMsg.BannerFactory", "recommend banner stg is null. this may be caused by account async init.");
                }
                if (C97625j3.m125812b().mo105904s() == null) {
                    return null;
                }
                if (C97625j3.m125812b().mo105904s().mo106160f(obj2) || C97625j3.m125812b().mo105904s().mo106160f(obj4)) {
                    return new C74669j(context, obj2, obj4);
                }
                return null;
            case 2:
                if (objArr != null && objArr.length == 3) {
                    Object obj5 = objArr[0];
                    String obj6 = obj5 != null ? obj5.toString() : null;
                    Object obj7 = objArr[1];
                    String obj8 = obj7 != null ? obj7.toString() : null;
                    Boolean bool = objArr[2];
                    if (bool != null && (bool instanceof Boolean)) {
                        z = bool.booleanValue();
                    }
                    if ((C97625j3.m125811a() && C97625j3.m125812b().mo105905t() != null && C97625j3.m125812b().mo105905t().mo106160f(obj6)) || C97625j3.m125812b().mo105905t().mo106160f(obj8)) {
                        kVar = new C74670k(context, obj6, obj8, z);
                        break;
                    } else {
                        return null;
                    }
                } else {
                    return null;
                }
                break;
            case 3:
                if (objArr != null && objArr.length == 3) {
                    Object obj9 = objArr[0];
                    String obj10 = obj9 != null ? obj9.toString() : null;
                    Object obj11 = objArr[1];
                    String obj12 = obj11 != null ? obj11.toString() : null;
                    Boolean bool2 = objArr[2];
                    if (bool2 != null && (bool2 instanceof Boolean)) {
                        z = bool2.booleanValue();
                    }
                    if ((C97625j3.m125811a() && C97625j3.m125812b().mo105905t() != null && C97625j3.m125812b().mo105905t().mo106160f(obj10)) || C97625j3.m125812b().mo105905t().mo106160f(obj12)) {
                        kVar = new C74672m(context, obj10, obj12, z);
                        break;
                    } else {
                        return null;
                    }
                } else {
                    return null;
                }
            case 4:
                return new C116083i0(context);
            case 5:
                return new C6954j0(context);
            case 7:
                return new C57828k0(context);
            case 8:
                return new C6957o(context);
            case 9:
                return new C97204d(context);
            case 11:
                return new C97197b0(context);
            case 12:
                return new C30849l0(context);
            case 13:
                return new C74673q(context);
            case 14:
                return new C76772b(context, (objArr == null || objArr.length <= 0) ? C75896b.C75898b.Main : objArr[0]);
            case 15:
                return new C9470d(context);
            default:
                return null;
        }
        return kVar;
    }
}
