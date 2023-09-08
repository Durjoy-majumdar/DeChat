package dh0;

import android.content.Intent;
import bh0.C113174b;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: dh0.a */
public class C7328a {
    /* renamed from: a */
    public static Intent m7472a(C113174b bVar) {
        if (bVar == null) {
            Log.m105920e("MicroMsg.AddrUtil", "addressObj == null");
            return null;
        }
        Intent intent = new Intent();
        intent.putExtra("nationalCode", bVar.f338623p);
        intent.putExtra("userName", bVar.f338621n);
        intent.putExtra("telNumber", bVar.f338622o);
        intent.putExtra("addressPostalCode", bVar.f338619i);
        intent.putExtra("proviceFirstStageName", bVar.f338616f);
        intent.putExtra("addressCitySecondStageName", bVar.f338617g);
        intent.putExtra("addressCountiesThirdStageName", bVar.f338618h);
        intent.putExtra("addressCountiesFourStageName", bVar.f338624q);
        intent.putExtra("addressDetailInfo", bVar.f338620j);
        return intent;
    }
}
