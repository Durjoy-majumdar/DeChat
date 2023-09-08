package com.tencent.p014mm.plugin.fav.p047ui.detail;

import android.text.format.DateFormat;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75592q0;
import pb1.C100734q;
import pb1.C100755z;
import te3.C101835rd0;

/* renamed from: com.tencent.mm.plugin.fav.ui.detail.n */
public class C93575n {
    /* renamed from: a */
    public static void m118170a(MMActivity mMActivity, C100755z zVar) {
        String str;
        if (14 != zVar.field_type || Util.isNullOrNil(zVar.field_favProto.f298626q)) {
            C101835rd0 rd02 = zVar.field_favProto.f298616d;
            if (rd02 == null || Util.isNullOrNil(rd02.f299354o)) {
                str = C100734q.m131882x(zVar.field_fromUser);
            } else {
                String v = C100734q.m131878v(rd02.f299354o);
                if (C75592q0.m90789s().equals(rd02.f299348f)) {
                    String x = C100734q.m131882x(rd02.f299350h);
                    if (!Util.nullAs(x, "").equals(rd02.f299350h)) {
                        str = v + " - " + x;
                    }
                } else {
                    String x2 = C100734q.m131882x(rd02.f299348f);
                    if (!Util.nullAs(x2, "").equals(rd02.f299348f)) {
                        str = v + " - " + x2;
                    }
                }
                str = v;
            }
        } else {
            str = zVar.field_favProto.f298626q;
        }
        mMActivity.setMMSubTitle(String.format(mMActivity.getString(C0966R.string.cn_), new Object[]{str, DateFormat.format("yyyy/M/d", zVar.field_updateTime)}));
    }
}
