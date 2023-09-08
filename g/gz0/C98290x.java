package gz0;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.tencent.p014mm.autogen.events.ShareCouponCardEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import fz0.C98061b;
import hz0.C21035d;
import hz0.C76251l;
import p755xs.C102720b;
import wz0.C22944i;

/* renamed from: gz0.x */
public class C98290x extends IStaticListener<ShareCouponCardEvent> {
    public boolean callback(IEvent iEvent) {
        ShareCouponCardEvent shareCouponCardEvent = (ShareCouponCardEvent) iEvent;
        if (!(shareCouponCardEvent instanceof ShareCouponCardEvent)) {
            return false;
        }
        ShareCouponCardEvent.C92562a aVar = shareCouponCardEvent.f265099d;
        String str = aVar.f265100a;
        long j = aVar.f265101b;
        String str2 = aVar.f265102c;
        C21035d d = C22944i.m26987d(str);
        if (d == null) {
            Log.m105920e("ShareCardEventListener", "item == null");
            return false;
        } else if (TextUtils.isEmpty(str)) {
            Log.m105920e("ShareCardEventListener", "cardAppMsg is empty");
            return false;
        } else {
            C68070l.C68072b u = C68070l.C68072b.m80422u(((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(j).getContent(), (String) null);
            if (u == null) {
                return false;
            }
            u.f195525R0 = C22944i.m26986c(d);
            u.f195522Q0 = str;
            u.f195528S0 = d.f59514g;
            u.f195531T0 = d.f59511d;
            Bitmap N6 = ((C102720b) C86312j.m106911c(C102720b.class)).mo142104N6(new C76251l(u.f195646y));
            ((C98061b) C86312j.m106911c(C98061b.class)).mo106013JX(u, u.f195562d, d.f59514g, str2, N6 != null ? BitmapUtil.Bitmap2Bytes(N6) : null);
            return true;
        }
    }
}
