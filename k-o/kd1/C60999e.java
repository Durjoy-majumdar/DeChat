package kd1;

import android.content.Intent;
import android.os.Parcel;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;
import ft3.C45807d;
import gy3.C87412m;

/* renamed from: kd1.e */
public final class C60999e {

    /* renamed from: a */
    public static final C60999e f173723a = new C60999e();

    /* renamed from: a */
    public final boolean mo85970a(Long l, int i) {
        C85801v1 i2 = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_OPEN_UPLOAD_DRAFT_STRING_SYNC;
        String obj = i2.mo119685f(aVar, "").toString();
        if (!Util.isNullOrNil(obj)) {
            try {
                byte[] b = C45807d.m51085b(obj);
                Parcel obtain = Parcel.obtain();
                C87412m.m108593f(obtain, "obtain()");
                obtain.unmarshall(b, 0, b.length);
                obtain.setDataPosition(0);
                Intent intent = (Intent) Intent.CREATOR.createFromParcel(obtain);
                if (intent.hasExtra("key_topic_id")) {
                    if (i != 9) {
                        return true;
                    }
                    long longExtra = intent.getLongExtra("key_topic_id", 0);
                    if (l != null) {
                        if (longExtra == l.longValue()) {
                            return true;
                        }
                    }
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, "");
                }
            } catch (Exception e) {
                Log.m105920e("Finder.ActivityRouter", "goDraft() " + e);
            }
        }
        return false;
    }
}
