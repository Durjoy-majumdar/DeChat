package kf2;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.profile.C42599h;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19636w0;
import jf2.C33569a;

/* renamed from: kf2.f */
public class C46723f {
    /* renamed from: a */
    public static final void m52019a(String str, int i, int i2, long j, Intent intent) {
        Bundle bundleExtra;
        String str2 = str;
        Intent intent2 = intent;
        C33569a jo = C42599h.wx0().mo59508jo(str);
        String str3 = "";
        String str4 = jo != null ? jo.field_decryptUserName : str3;
        Log.m105919d("MicroMsg.Kv13307", "username:%s scene::%s optype:%d opscene:%d decryptUserName:%s, profileScene: %d, enterTimestamp: %s", str2, 3, Integer.valueOf(i), 4, str4, Integer.valueOf(i2), Long.valueOf(j));
        if (!(intent2 == null || (bundleExtra = intent2.getBundleExtra("Contact_Ext_Args")) == null)) {
            str3 = bundleExtra.getString("Contact_Ext_Args_Search_Click_Id", str3);
        }
        C115669n.INSTANCE.mo160131h(13307, str2, 3, Integer.valueOf(i), 4, str4, Integer.valueOf(C19636w0.f55626c), Integer.valueOf(i2), Long.valueOf(j), str3, Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: b */
    public static final void m52020b(String str, int i, long j, Intent intent) {
        m52021c(str, i, j, intent, 0);
    }

    /* renamed from: c */
    public static final void m52021c(String str, int i, long j, Intent intent, int i2) {
        Bundle bundleExtra;
        String str2 = str;
        Intent intent2 = intent;
        C33569a jo = C42599h.wx0().mo59508jo(str);
        String str3 = "";
        String str4 = jo != null ? jo.field_decryptUserName : str3;
        Log.m105919d("MicroMsg.Kv13307", "username:%s scene::%s optype:%d opscene:%d decryptUserName:%s, enterTimestamp: %d", str2, 3, Integer.valueOf(i), 4, str4, Long.valueOf(j));
        if (!(intent2 == null || (bundleExtra = intent2.getBundleExtra("Contact_Ext_Args")) == null)) {
            str3 = bundleExtra.getString("Contact_Ext_Args_Search_Click_Id", str3);
        }
        C115669n.INSTANCE.mo160131h(13307, str2, 3, Integer.valueOf(i), 4, str4, Integer.valueOf(C19636w0.f55626c), 0, Long.valueOf(j), str3, Long.valueOf(System.currentTimeMillis()));
    }
}
