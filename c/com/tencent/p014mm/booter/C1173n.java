package com.tencent.p014mm.booter;

import android.text.TextUtils;
import com.tencent.p014mm.modelsimple.C68143w;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import eb0.C75592q0;
import eb0.C97625j3;
import f40.C86709a0;
import f40.C86718e;

/* renamed from: com.tencent.mm.booter.n */
public class C1173n {
    /* renamed from: a */
    public static void m1323a() {
        if (C97625j3.m125811a() && !C86718e.m107551r()) {
            long nowSecond = Util.nowSecond();
            C85801v1 u = C97625j3.m125812b().mo105906u();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_SELFINFO_GETPROFILE_TIME_LONG;
            long nullAs = Util.nullAs((Long) u.mo119685f(aVar, (Object) null), 0);
            C86709a0.m107523b().getClass();
            C86709a0.m107528h();
            String I = C86709a0.m107535s().mo121142i().mo119675I(C72994y1.C72995a.USERINFO_ACCOUNT_SALT_STRING_SYNC, (String) null);
            int i = (nullAs > nowSecond ? 1 : (nullAs == nowSecond ? 0 : -1));
            if (i < 0 || Util.isNullOrNil(I)) {
                C97625j3.m125812b().mo105906u().mo119677K(aVar, Long.valueOf(nowSecond + 604800));
                String s = C75592q0.m90789s();
                if (!TextUtils.isEmpty(s)) {
                    C97625j3.m125815e().mo123460f(new C68143w(s));
                }
                Object[] objArr = new Object[2];
                objArr[0] = Boolean.valueOf(i < 0);
                objArr[1] = Boolean.valueOf(Util.isNullOrNil(I));
                Log.m105925i("MicroMsg.PostTaskGetProfile", "expire: %b or salt is empty:%b", objArr);
            }
        }
    }
}
