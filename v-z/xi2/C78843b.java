package xi2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.remittance.mobile.cgi.NetSceneMobileRemitGetRecvInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import ke3.C88144b;
import te3.C64600o30;
import te3.gj4;

/* renamed from: xi2.b */
public class C78843b {

    /* renamed from: a */
    public static int f231662a;

    /* renamed from: a */
    public static void m95367a(Context context, gj4 gj4) {
        ArrayList arrayList;
        Log.m105924i("MicroMsg.mobileRemit.MobileRemitHelper", "goMobileRemitUI()");
        Intent intent = new Intent();
        intent.putExtra("key_rcvr_openid", gj4.f227465h);
        intent.putExtra("key_rcvr_token", gj4.f227466i);
        intent.putExtra("key_wx_name", gj4.f227467j);
        intent.putExtra("key_real_name", gj4.f227468n);
        intent.putExtra("key_phone", gj4.f227469o);
        intent.putExtra("key_img_url", gj4.f227470p);
        intent.putExtra("key_amount_remind_bit", gj4.f227471q);
        LinkedList<C64600o30> linkedList = gj4.f227472r;
        int i = NetSceneMobileRemitGetRecvInfo.f115989w;
        if (linkedList == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            Iterator<C64600o30> it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList.add(new NetSceneMobileRemitGetRecvInfo.DelayOptionParcel(it.next()));
            }
        }
        intent.putExtra("key_delay_options", arrayList);
        intent.putExtra("key_check_name_wording", gj4.f227473s);
        intent.putExtra("key_check_name_mask", gj4.f227474t);
        intent.putExtra("key_get_rcvr_ext", gj4.f227475u);
        intent.putExtra("key_timestamp_ms", gj4.f227476v);
        C88144b.m109791i(context, "remittance", ".mobile.ui.MobileRemittanceUI", intent, (Bundle) null);
    }
}
