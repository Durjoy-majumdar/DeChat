package eb0;

import android.app.Activity;
import android.content.Intent;
import android.util.LruCache;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.RegionCodeDecoder;
import di3.C86301e;
import ei3.C86522b;
import java.util.ArrayList;
import p248ug.C52558c;
import p248ug.C52574z;
import rb0.C47969h;
import rb0.C48009v0;
import sf0.C48374j0;
import te3.C50254lf;
import te3.C51043r10;
import te3.C77961kx3;
import te3.C77967mx3;
import ub0.C52509c;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: eb0.q */
public class C75591q extends C86301e implements C52574z {

    /* renamed from: d */
    public LruCache<String, C52509c> f222073d = new LruCache<>(3);

    /* renamed from: B0 */
    public void mo73528B0(Intent intent, C77967mx3 mx32, int i) {
        String g = C48374j0.m53718g(mx32.f227857d);
        intent.putExtra("Contact_User", g);
        intent.putExtra("Contact_Nick", C48374j0.m53718g(mx32.f227858e));
        intent.putExtra("Contact_PyInitial", C48374j0.m53718g(mx32.f227859f));
        intent.putExtra("Contact_QuanPin", C48374j0.m53718g(mx32.f227860g));
        intent.putExtra("Contact_Alias", mx32.f227870t);
        intent.putExtra("Contact_Sex", mx32.f227861h);
        intent.putExtra("Contact_VUser_Info", mx32.f227868r);
        intent.putExtra("Contact_VUser_Info_Flag", mx32.f227867q);
        intent.putExtra("Contact_KWeibo_flag", mx32.f227872v);
        intent.putExtra("Contact_KWeibo", mx32.f227869s);
        intent.putExtra("Contact_KWeiboNick", mx32.f227871u);
        intent.putExtra("Contact_Scene", i);
        intent.putExtra("Contact_KHideExpose", true);
        intent.putExtra("Contact_RegionCode", RegionCodeDecoder.m124564q(mx32.f227842A, mx32.f227863j, mx32.f227864n));
        intent.putExtra("Contact_Signature", mx32.f227865o);
        intent.putExtra("Contact_BrandList", mx32.f227843B);
        intent.putExtra("Contact_KSnsIFlag", mx32.f227876z.f130392d);
        intent.putExtra("Contact_KSnsBgId", mx32.f227876z.f130394f);
        intent.putExtra("Contact_KSnsBgUrl", mx32.f227876z.f130393e);
        intent.putExtra("Contact_BIZ_KF_WORKER_ID", mx32.f227851J);
        intent.putExtra("AntispamTicket", mx32.f227850I);
        intent.putExtra("Contact_BIZ_PopupInfoMsg", mx32.f227853L);
        intent.putExtra("Contact_Ext_Flag", mx32.f227856P);
        Log.m105925i("MicroMsg.BizInfoLogicImp", "[tomys] anti, content: %s", mx32.f227850I);
        C52558c cVar = new C52558c();
        cVar.field_username = g;
        cVar.field_brandList = mx32.f227843B;
        cVar.field_kfWorkerId = mx32.f227851J;
        C51043r10 r102 = mx32.f227844C;
        if (r102 != null) {
            cVar.field_brandFlag = r102.f140656d;
            cVar.field_brandInfo = r102.f140658f;
            cVar.field_extInfo = r102.f140657e;
            cVar.field_attrSyncVersion = null;
            cVar.field_brandIconURL = r102.f140659g;
        }
        if (!C48009v0.Fx0().replace(cVar)) {
            C48009v0.Fx0().insert(cVar);
        }
    }

    /* renamed from: Hh */
    public boolean mo73529Hh(String str) {
        try {
            return C48009v0.Ex0().mo72749jo(str).field_hide_colleage_invite;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: Ht */
    public boolean mo73530Ht(String str) {
        return C48009v0.Fx0().mo72757SE(str).mo72809G1();
    }

    /* renamed from: Lg */
    public void mo73531Lg(Activity activity, String str) {
        C52509c cVar = this.f222073d.get(str);
        if (cVar == null) {
            cVar = new C52509c();
            this.f222073d.put(str, cVar);
        }
        cVar.mo73444b(activity);
    }

    /* renamed from: Oc */
    public String mo73532Oc(String str) {
        try {
            C47969h jo = C48009v0.Ex0().mo72749jo(str);
            C50254lf lfVar = new C50254lf();
            lfVar.parseFrom(jo.field_raw_attrs);
            return lfVar.f137371g;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: Qp */
    public ArrayList<String> mo73533Qp(String str) {
        try {
            return C48009v0.Fx0().mo72757SE(str).mo73500r2(false).mo73509b().f146821a;
        } catch (Exception unused) {
            return new ArrayList<>();
        }
    }

    public void Qp0(String str) {
        C52509c cVar = this.f222073d.get(str);
        if (cVar == null) {
            cVar = new C52509c();
            this.f222073d.put(str, cVar);
        }
        cVar.mo73443a(str);
    }

    /* renamed from: ek */
    public void mo73535ek(Intent intent, C77961kx3 kx32, int i) {
        String g = C48374j0.m53718g(kx32.f227763d);
        intent.putExtra("Contact_User", g);
        intent.putExtra("Contact_Nick", C48374j0.m53718g(kx32.f227764e));
        intent.putExtra("Contact_PyInitial", C48374j0.m53718g(kx32.f227765f));
        intent.putExtra("Contact_QuanPin", C48374j0.m53718g(kx32.f227766g));
        intent.putExtra("Contact_Alias", kx32.f227776t);
        intent.putExtra("Contact_Sex", kx32.f227767h);
        intent.putExtra("Contact_VUser_Info", kx32.f227774r);
        intent.putExtra("Contact_VUser_Info_Flag", kx32.f227773q);
        intent.putExtra("Contact_KWeibo_flag", kx32.f227778v);
        intent.putExtra("Contact_KWeibo", kx32.f227775s);
        intent.putExtra("Contact_KWeiboNick", kx32.f227777u);
        intent.putExtra("Contact_Scene", i);
        intent.putExtra("Contact_KHideExpose", true);
        intent.putExtra("Contact_RegionCode", RegionCodeDecoder.m124564q(kx32.f227756A, kx32.f227769j, kx32.f227770n));
        intent.putExtra("Contact_Signature", kx32.f227771o);
        intent.putExtra("Contact_BrandList", kx32.f227757B);
        intent.putExtra("Contact_KSnsIFlag", kx32.f227782z.f130392d);
        intent.putExtra("Contact_KSnsBgId", kx32.f227782z.f130394f);
        intent.putExtra("Contact_KSnsBgUrl", kx32.f227782z.f130393e);
        intent.putExtra("AntispamTicket", kx32.f227761F);
        Log.m105925i("MicroMsg.BizInfoLogicImp", "[tomys] anti, content: %s", kx32.f227761F);
        C52558c cVar = new C52558c();
        cVar.field_username = g;
        cVar.field_brandList = kx32.f227757B;
        C51043r10 r102 = kx32.f227758C;
        if (r102 != null) {
            cVar.field_brandFlag = r102.f140656d;
            cVar.field_brandInfo = r102.f140658f;
            cVar.field_extInfo = r102.f140657e;
            cVar.field_attrSyncVersion = null;
            cVar.field_brandIconURL = r102.f140659g;
        }
        if (!C48009v0.Fx0().replace(cVar)) {
            C48009v0.Fx0().insert(cVar);
        }
    }

    /* renamed from: zs */
    public String mo73536zs(String str) {
        try {
            C47969h jo = C48009v0.Ex0().mo72749jo(str);
            C50254lf lfVar = new C50254lf();
            lfVar.parseFrom(jo.field_raw_attrs);
            return lfVar.f137370f;
        } catch (Throwable unused) {
            return "";
        }
    }
}
