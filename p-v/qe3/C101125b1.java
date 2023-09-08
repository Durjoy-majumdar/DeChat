package qe3;

import android.content.SharedPreferences;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.util.WXWebReporter;
import kj2.C117407d;

/* renamed from: qe3.b1 */
public class C101125b1 {

    /* renamed from: a */
    public String f296012a;

    /* renamed from: b */
    public String f296013b;

    /* renamed from: c */
    public int f296014c;

    public C101125b1(String str, String str2, int i) {
        this.f296012a = str;
        this.f296013b = str2;
        this.f296014c = i;
    }

    /* renamed from: a */
    public static C101125b1 m132537a() {
        Log.m105919d("MicroMsg.RsaInfo", "summercert default base keye[%s], keyn[%s], ver[%d]", "010001", "ADA9" + "_" + "ADA9E573417691226521F9FF1B3732DF83EDA19BA60870A357E430135298469E68EF31E9E2109CA5E0CA661F769FCB2FE33A3021B9A790D5DFCA6720A439BEF69E138FAB1B05475228FD33BB11D07321A6DB4DB2689CA850C483630855DB7EDDD8B4505349DA863677E3EB78A46B5912FAE11BDE92BE9D98E3E2F2A47E03777E8795A51D67D7CC4B86EDEBD3D8968AAC51A58FFDBAA068750E4771BD364911B22420F96F8B0D7730455CC8CE1933B406C38675A9540E51C11C9872F692E2EC693448913781D1A8DD61A1FCC97B8B078CA06DDE9EBC35A1A22A697831879588F52BD6A108E1EE6519C518EDC887F65587D7F769C22E81131940085E6FAED67FCF".substring(507, 511), Integer.valueOf(WXWebReporter.WXWEB_IDKEY_SWITCH_WEBCORE_BY_USERTYPE));
        return new C101125b1("010001", "ADA9E573417691226521F9FF1B3732DF83EDA19BA60870A357E430135298469E68EF31E9E2109CA5E0CA661F769FCB2FE33A3021B9A790D5DFCA6720A439BEF69E138FAB1B05475228FD33BB11D07321A6DB4DB2689CA850C483630855DB7EDDD8B4505349DA863677E3EB78A46B5912FAE11BDE92BE9D98E3E2F2A47E03777E8795A51D67D7CC4B86EDEBD3D8968AAC51A58FFDBAA068750E4771BD364911B22420F96F8B0D7730455CC8CE1933B406C38675A9540E51C11C9872F692E2EC693448913781D1A8DD61A1FCC97B8B078CA06DDE9EBC35A1A22A697831879588F52BD6A108E1EE6519C518EDC887F65587D7F769C22E81131940085E6FAED67FCF", WXWebReporter.WXWEB_IDKEY_SWITCH_WEBCORE_BY_USERTYPE);
    }

    /* renamed from: d */
    public static C101125b1 m132538d() {
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("rsa_public_key_prefs", 4);
        C101125b1 b1Var = new C101125b1(sharedPreferences.getString("keye", ""), sharedPreferences.getString("keyn", ""), sharedPreferences.getInt(ProviderConstants.API_COLNAME_FEATURE_VERSION, 0));
        int i = sharedPreferences.getInt("client_version", 0);
        if (!b1Var.mo140573f()) {
            if (i > 637665843) {
                return b1Var;
            }
            boolean commit = sharedPreferences.edit().clear().commit();
            C117407d.INSTANCE.idkeyStat(148, 38, 1, false);
            Log.m105925i("MicroMsg.RsaInfo", "summercert clear old rsa lastClientVer[%d] nowVer[%d], commit[%b]", Integer.valueOf(i), Integer.valueOf(C89625d.f257841g), Boolean.valueOf(commit));
        }
        C117407d.INSTANCE.idkeyStat(148, 39, 1, false);
        Log.m105919d("MicroMsg.RsaInfo", "summercert default req keye[%s], keyn[%s], ver[%d]", "010001", "9357" + "_" + "9357B6A18EE981DDA2C3CBBF39F5D308FC21656F30CF2EE7D75F6E9CB12928B972364B1AC57E2FB1F4ECC113A4060B9E97EEEF868FBD2623DDEFF77C3A048507F65DF9200CE4B2321E8D39B414C0663A8A10F6278543D28B2939BC8BD5CC7BE9A95F868C4F3C4F758C6A78ADD98BDE33D56E58377B10DD7F225426B5B27F4038302BE2DCA9332B8EC57B5E29C90B7A7DE6417D7378CB1D8B51E68BE1E99B2EB5EB49E613DCFF3FAED6F8C4875F6425F1AF6AEF3358403E4B0A92E456E1D5BE84999907A1246F2BECE05683959614312026492BDC302F82F38AD2EE99FDDB8675736274989B2389E95E80F8B597E69FD6A2CCB279226A578465EF9D50D29AE5ED".substring(507, 511), 200);
        return new C101125b1("010001", "9357B6A18EE981DDA2C3CBBF39F5D308FC21656F30CF2EE7D75F6E9CB12928B972364B1AC57E2FB1F4ECC113A4060B9E97EEEF868FBD2623DDEFF77C3A048507F65DF9200CE4B2321E8D39B414C0663A8A10F6278543D28B2939BC8BD5CC7BE9A95F868C4F3C4F758C6A78ADD98BDE33D56E58377B10DD7F225426B5B27F4038302BE2DCA9332B8EC57B5E29C90B7A7DE6417D7378CB1D8B51E68BE1E99B2EB5EB49E613DCFF3FAED6F8C4875F6425F1AF6AEF3358403E4B0A92E456E1D5BE84999907A1246F2BECE05683959614312026492BDC302F82F38AD2EE99FDDB8675736274989B2389E95E80F8B597E69FD6A2CCB279226A578465EF9D50D29AE5ED", 200);
    }

    /* renamed from: g */
    public static void m132539g(String str, String str2, int i) {
        Log.m105919d("MicroMsg.RsaInfo", "summercert dkcert saveRsaInfo ver:%d keye:%s keyn:%s  ", Integer.valueOf(i), str, str2);
        SharedPreferences.Editor edit = MMApplicationContext.getContext().getSharedPreferences("rsa_public_key_prefs", 4).edit();
        edit.putString("keye", str);
        edit.putString("keyn", str2);
        edit.putInt(ProviderConstants.API_COLNAME_FEATURE_VERSION, i);
        edit.putInt("client_version", C89625d.f257841g);
        edit.commit();
    }

    /* renamed from: b */
    public String mo140570b() {
        return this.f296012a;
    }

    /* renamed from: c */
    public String mo140571c() {
        return this.f296013b;
    }

    /* renamed from: e */
    public int mo140572e() {
        return this.f296014c;
    }

    /* renamed from: f */
    public boolean mo140573f() {
        return this.f296014c == 0 || Util.isNullOrNil(this.f296012a) || Util.isNullOrNil(this.f296013b);
    }
}
