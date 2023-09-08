package eb0;

import android.content.SharedPreferences;
import com.tencent.p014mm.p136ui.conversation.banner.C74673q;
import com.tencent.p014mm.sdk.platformtools.Log;
import fb0.C31999k;
import java.util.ArrayList;
import java.util.List;

/* renamed from: eb0.w3 */
public class C75598w3 {

    /* renamed from: b */
    public static C75598w3 f222084b;

    /* renamed from: a */
    public C75600b f222085a;

    /* renamed from: eb0.w3$a */
    public enum C75599a {
        NO_INIT,
        SET_MOBILE,
        SUCC,
        SUCC_UNLOAD
    }

    /* renamed from: eb0.w3$b */
    public interface C75600b {
    }

    /* renamed from: e */
    public static C75598w3 m90816e() {
        synchronized (C75598w3.class) {
            if (f222084b == null) {
                f222084b = new C75598w3();
            }
        }
        return f222084b;
    }

    /* renamed from: a */
    public C75599a mo105949a() {
        C75599a aVar = C75599a.NO_INIT;
        try {
            String str = (String) C97625j3.m125812b().mo105906u().mo119684e(4097, "");
            String str2 = (String) C97625j3.m125812b().mo105906u().mo119684e(6, "");
            boolean z = (C75592q0.m90787q() & 131072) == 0;
            Log.m105918d("MicorMsg.MainFrameBannerStorage", "isUpload " + z + " stat " + C75592q0.m90787q());
            if (str == null || str.length() <= 0) {
                str = null;
            }
            if (str2 == null || str2.length() <= 0) {
                str2 = null;
            }
            return (str == null && str2 == null) ? aVar : (str == null || str2 != null) ? z ? C75599a.SUCC : C75599a.SUCC_UNLOAD : C75599a.SET_MOBILE;
        } catch (Exception unused) {
            return aVar;
        }
    }

    /* renamed from: b */
    public void mo105950b(int i, int i2) {
        SharedPreferences H = C97625j3.m125812b().mo105882H("banner");
        if (H != null) {
            SharedPreferences.Editor edit = H.edit();
            if (i2 == 1) {
                edit.remove("CurrentType").remove("CurrentShowType").remove("CurrentData").commit();
            } else if (i2 == 2) {
                edit.remove("CurrentType").remove("CurrentShowType").remove("CurrentData").commit();
                ArrayList arrayList = (ArrayList) mo105951c("HistoryInfo");
                if (!arrayList.contains(Integer.valueOf(i))) {
                    arrayList.add(Integer.valueOf(i));
                }
                mo105953f("HistoryInfo", arrayList);
            } else if (i2 == 3 && i == 3) {
                edit.remove("CurrentType").remove("CurrentShowType").remove("CurrentData").commit();
            }
            C75600b bVar = this.f222085a;
            if (bVar != null) {
                ((C74673q.C74674a) bVar).mo103832a();
            }
        }
    }

    /* renamed from: c */
    public final List<Integer> mo105951c(String str) {
        SharedPreferences H = C97625j3.m125812b().mo105882H("banner");
        if (H == null) {
            return null;
        }
        int i = H.getInt(str + "ArraySize", 0);
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(Integer.valueOf(H.getInt(str + i2, 0)));
        }
        return arrayList;
    }

    /* renamed from: d */
    public C75595v3 mo105952d() {
        C75599a aVar = C75599a.SUCC;
        SharedPreferences H = C97625j3.m125812b().mo105882H("banner");
        if (H == null) {
            return null;
        }
        int i = H.getInt("CurrentType", -1);
        int i2 = H.getInt("CurrentShowType", -1);
        String string = H.getString("CurrentData", "");
        if (i != -1) {
            if (i == 1) {
                C75599a a = mo105949a();
                if (a == aVar || a == C75599a.SUCC_UNLOAD || C31999k.vx0().mo137179a()) {
                    if (C31999k.vx0().mo137179a()) {
                        Log.m105924i("MicorMsg.MainFrameBannerStorage", "has abtest case. ignore bind bind contacts banner.");
                    } else {
                        Log.m105924i("MicorMsg.MainFrameBannerStorage", "already Bind the Mobile");
                    }
                }
            } else if (i != 2) {
                if (i == 3) {
                    Log.m105924i("MicorMsg.MainFrameBannerStorage", "avatar already existed");
                    return null;
                } else if (i == 11 || i == 10000 || i == 57005) {
                    return null;
                }
            } else if (mo105949a() == aVar || C31999k.vx0().mo137179a()) {
                if (C31999k.vx0().mo137179a()) {
                    Log.m105924i("MicorMsg.MainFrameBannerStorage", "has abtest case. ignore bind upload contacts banner.");
                } else {
                    Log.m105924i("MicorMsg.MainFrameBannerStorage", "already upload the contacts");
                }
                return null;
            }
            return new C75595v3(i, i2, string);
        }
        return null;
    }

    /* renamed from: f */
    public final boolean mo105953f(String str, List<Integer> list) {
        SharedPreferences H = C97625j3.m125812b().mo105882H("banner");
        if (H == null) {
            return false;
        }
        SharedPreferences.Editor edit = H.edit();
        edit.putInt(str + "ArraySize", list.size());
        for (int i = 0; i < list.size(); i++) {
            edit.putInt(str + i, list.get(i).intValue());
        }
        return edit.commit();
    }

    /* renamed from: g */
    public boolean mo105954g(C75595v3 v3Var) {
        SharedPreferences H;
        if (v3Var == null) {
            return false;
        }
        int i = v3Var.f222081a;
        if (i == 10000) {
            SharedPreferences H2 = C97625j3.m125812b().mo105882H("banner");
            if (H2 != null) {
                boolean commit = H2.edit().clear().commit();
            }
            C75600b bVar = this.f222085a;
            if (bVar != null) {
                ((C74673q.C74674a) bVar).mo103832a();
            }
            return true;
        } else if (i == 57005 || (H = C97625j3.m125812b().mo105882H("banner")) == null) {
            return false;
        } else {
            SharedPreferences.Editor edit = H.edit();
            C75595v3 d = mo105952d();
            boolean contains = true ^ ((ArrayList) mo105951c("HistoryInfo")).contains(Integer.valueOf(v3Var.f222081a));
            if (d != null && d.f222082b == 2) {
                ArrayList arrayList = (ArrayList) mo105951c("HistoryInfo");
                if (!arrayList.contains(Integer.valueOf(d.f222081a))) {
                    arrayList.add(Integer.valueOf(d.f222081a));
                }
                mo105953f("HistoryInfo", arrayList);
            }
            if (contains) {
                edit.putInt("CurrentType", v3Var.f222081a).putInt("CurrentShowType", v3Var.f222082b).putString("CurrentData", v3Var.f222083c).commit();
            }
            C75600b bVar2 = this.f222085a;
            if (bVar2 != null) {
                ((C74673q.C74674a) bVar2).mo103832a();
            }
            return contains;
        }
    }
}
