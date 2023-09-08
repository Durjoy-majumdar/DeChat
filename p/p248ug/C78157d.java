package p248ug;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import te3.C77917dy3;

/* renamed from: ug.d */
public class C78157d {
    /* renamed from: a */
    public static void m94368a(Intent intent, C77917dy3 dy32, int i) {
        if (Util.isNullOrNil(dy32.f227201r)) {
            Log.m105924i("MicroMsg.BuildContactInfoIntent", "FinderUsername is empty");
        } else {
            Log.m105924i("MicroMsg.BuildContactInfoIntent", "FinderUsername is " + dy32.f227201r);
        }
        intent.putExtra("Contact_User", dy32.f227190d);
        intent.putExtra("Contact_Nick", dy32.f227191e);
        intent.putExtra("Contact_PyInitial", dy32.f227192f);
        intent.putExtra("Contact_QuanPin", dy32.f227193g);
        intent.putExtra("Contact_Sex", dy32.f227194h);
        intent.putExtra("Contact_Scene", i);
        intent.putExtra("Contact_KHideExpose", true);
        intent.putExtra("AntispamTicket", dy32.f227200q);
        intent.putExtra("key_add_contact_openim_appid", dy32.f227197n);
        intent.putExtra("key_add_contact_openim_finder_username", dy32.f227201r);
        intent.putExtra("key_add_contact_match_type", dy32.f227198o);
        intent.putExtra("key_add_contact_custom_detail_visible", dy32.f227199p.f130995d);
        intent.putExtra("key_add_contact_custom_detail", dy32.f227199p.f130996e);
        Log.m105925i("MicroMsg.BuildContactInfoIntent", "[tomys] anti, content: %s", dy32.f227200q);
    }
}
