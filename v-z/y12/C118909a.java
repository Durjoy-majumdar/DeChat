package y12;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.kidswatch.p066ui.reg.KidsWatchRegGetInfoUI;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.PhoneFormater;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import java.io.IOException;
import java.util.TimeZone;
import ob0.C117747y;
import p550hn.C108250b;
import p550hn.C108251c;
import tc2.C118418g;
import te3.C118437hq3;
import te3.C51018qv3;
import te3.lx4;

/* renamed from: y12.a */
public final class C118909a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ KidsWatchRegGetInfoUI f356188d;

    /* renamed from: e */
    public final /* synthetic */ String f356189e;

    public C118909a(KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI, String str) {
        this.f356188d = kidsWatchRegGetInfoUI;
        this.f356189e = str;
    }

    public final void run() {
        int i;
        Bitmap bitmap;
        String str;
        KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI = this.f356188d;
        String str2 = this.f356189e;
        int i2 = KidsWatchRegGetInfoUI.f346177t;
        kidsWatchRegGetInfoUI.getClass();
        C86709a0.m107524d().mo123455a(145, kidsWatchRegGetInfoUI);
        String obj = kidsWatchRegGetInfoUI.mo175401H7().f354996l.getText().toString();
        int length = obj.length() - 1;
        int i3 = 0;
        boolean z = false;
        while (i3 <= length) {
            boolean z2 = C87412m.m108596i(obj.charAt(!z ? i3 : length), 32) <= 0;
            if (!z) {
                if (!z2) {
                    z = true;
                } else {
                    i3++;
                }
            } else if (!z2) {
                break;
            } else {
                length--;
            }
        }
        String pureNumber = PhoneFormater.pureNumber(obj.subSequence(i3, length + 1).toString());
        String str3 = kidsWatchRegGetInfoUI.f346180f;
        if (str3 == null || kidsWatchRegGetInfoUI.f346181g == null || C87412m.m108589b(pureNumber, str3) || !C87412m.m108589b(pureNumber, kidsWatchRegGetInfoUI.f346181g)) {
            String str4 = kidsWatchRegGetInfoUI.f346180f;
            i = (str4 == null || (str = kidsWatchRegGetInfoUI.f346181g) == null || C87412m.m108589b(str, str4) || C87412m.m108589b(pureNumber, kidsWatchRegGetInfoUI.f346181g)) ? 0 : 2;
        } else {
            i = 1;
        }
        Log.m105924i("MicroMsg.KidsWatchRegGetInfoUI", "checkMobileStateFun, adJust:" + i + ", opCode:22, " + kidsWatchRegGetInfoUI.f346183i);
        C108251c w102 = ((C108250b) C86312j.m106911c(C108250b.class)).w10(str2, 22, "", 0, "");
        w102.mo91364O(kidsWatchRegGetInfoUI.f346183i);
        w102.mo91370g0(i);
        C118418g gVar = C118418g.INSTANCE;
        if (gVar.An0("ie_reg")) {
            gVar.mo175826kl("ie_reg");
        }
        C118437hq3 hq32 = new C118437hq3();
        hq32.f354039d = kidsWatchRegGetInfoUI.mo175401H7().f354997m.getText().toString();
        if (kidsWatchRegGetInfoUI.f346185n && (bitmap = kidsWatchRegGetInfoUI.f346186o) != null && !bitmap.isRecycled()) {
            hq32.f354041f = MD5Util.getMD5String(BitmapUtil.Bitmap2Bytes(kidsWatchRegGetInfoUI.f346186o));
        }
        hq32.f354042g = str2;
        hq32.f354043h = Util.getTimeZoneOffset();
        String id = TimeZone.getDefault().getID();
        hq32.f354044i = id;
        Log.m105925i("MicroMsg.KidsWatchRegGetInfoUI", "%s,%s", hq32.f354043h, id);
        lx4 lx4 = new lx4();
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(gVar.vu0("ie_reg"));
        lx4.f354115d = qv32;
        C51018qv3 qv33 = new C51018qv3();
        qv33.mo73350k(gVar.bw0("ce_reg"));
        lx4.f354116e = qv33;
        C51018qv3 qv34 = new C51018qv3();
        qv34.mo73350k(gVar.mo175803Va(16));
        lx4.f354117f = qv34;
        C51018qv3 qv35 = new C51018qv3();
        qv35.mo73350k(gVar.b90());
        lx4.f354121j = qv35;
        try {
            C51018qv3 qv36 = new C51018qv3();
            qv36.mo73350k(hq32.toByteArray());
            lx4.f354118g = qv36;
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.KidsWatchRegGetInfoUI", e, "convert to byte error ! %s", e.getMessage());
        }
        w102.mo91365T(lx4);
        String str5 = kidsWatchRegGetInfoUI.f346178d;
        if (str5 != null) {
            w102.mo91369f0(str5);
            C86709a0.m107524d().mo123460f((C117747y) w102);
            String obj2 = kidsWatchRegGetInfoUI.mo175401H7().f354996l.getText().toString();
            int length2 = obj2.length() - 1;
            int i4 = 0;
            boolean z3 = false;
            while (i4 <= length2) {
                boolean z4 = C87412m.m108596i(obj2.charAt(!z3 ? i4 : length2), 32) <= 0;
                if (!z3) {
                    if (!z4) {
                        z3 = true;
                    } else {
                        i4++;
                    }
                } else if (!z4) {
                    break;
                } else {
                    length2--;
                }
            }
            kidsWatchRegGetInfoUI.f346180f = PhoneFormater.pureNumber(obj2.subSequence(i4, length2 + 1).toString());
            kidsWatchRegGetInfoUI.f346183i++;
            return;
        }
        C87412m.m108603p("loginUrl");
        throw null;
    }
}
