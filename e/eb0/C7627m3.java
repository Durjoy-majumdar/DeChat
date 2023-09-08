package eb0;

import android.content.SharedPreferences;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85798u1;
import kj2.C117407d;

/* renamed from: eb0.m3 */
public class C7627m3 {
    /* renamed from: a */
    public static SharedPreferences m7760a() {
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("auth_info_key_prefs", 4);
        if (!sharedPreferences.getBoolean("key_auth_info_prefs_created", false)) {
            C117407d dVar = C117407d.INSTANCE;
            dVar.idkeyStat(148, 12, 1, true);
            C85798u1 u1Var = new C85798u1(C72994y1.f212832a + "autoauth.cfg");
            if (u1Var.f249882c || u1Var.mo119660a(3) == null) {
                SharedPreferences sharedPreferences2 = MMApplicationContext.getContext().getSharedPreferences("auto_auth_key_prefs", 4);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                if (!Util.isNullOrNil(sharedPreferences2.getString("_auth_key", ""))) {
                    edit.putBoolean("key_auth_info_prefs_created", true);
                    edit.putInt("key_auth_update_version", sharedPreferences2.getInt("key_auth_update_version", 0));
                    edit.putInt("_auth_uin", sharedPreferences2.getInt("_auth_uin", 0));
                    edit.putString("_auth_key", sharedPreferences2.getString("_auth_key", ""));
                    edit.putString("server_id", MMApplicationContext.getContext().getSharedPreferences("server_id_prefs", 4).getString("server_id", ""));
                    Log.m105925i("MicroMsg.MMReqRespAuthComm", "summerauth auth_info_key_prefs not exit! use oldAAKsp now commit[%b] create[%b], ver[%d], uin[%d], aak[%s], sid[%s]", Boolean.valueOf(edit.commit()), Boolean.valueOf(sharedPreferences.getBoolean("key_auth_info_prefs_created", false)), Integer.valueOf(sharedPreferences.getInt("key_auth_update_version", 0)), Integer.valueOf(sharedPreferences.getInt("_auth_uin", 0)), sharedPreferences.getString("_auth_key", ""), sharedPreferences.getString("server_id", ""));
                } else {
                    Log.m105925i("MicroMsg.MMReqRespAuthComm", "summerauth auth_info_key_prefs not exit! neither autoauthcfg nor oldAAKsp existed just install! stack[%s]", Util.getStack());
                }
            } else {
                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                edit2.putBoolean("key_auth_info_prefs_created", true);
                edit2.putInt("key_auth_update_version", ((Integer) u1Var.mo119660a(1)).intValue());
                edit2.putInt("_auth_uin", ((Integer) u1Var.mo119660a(2)).intValue());
                edit2.putString("_auth_key", (String) u1Var.mo119660a(3));
                edit2.putString("server_id", (String) u1Var.mo119660a(4));
                Log.m105925i("MicroMsg.MMReqRespAuthComm", "summerauth auth_info_key_prefs not exit! use autoauthcfg now commit[%b] create[%b], ver[%d], uin[%d], aak[%s], sid[%s]", Boolean.valueOf(edit2.commit()), Boolean.valueOf(sharedPreferences.getBoolean("key_auth_info_prefs_created", false)), Integer.valueOf(sharedPreferences.getInt("key_auth_update_version", 0)), Integer.valueOf(sharedPreferences.getInt("_auth_uin", 0)), sharedPreferences.getString("_auth_key", ""), sharedPreferences.getString("server_id", ""));
                dVar.idkeyStat(148, 51, 1, true);
                return sharedPreferences;
            }
        }
        return sharedPreferences;
    }
}
