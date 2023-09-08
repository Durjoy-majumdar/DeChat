package l30;

import android.database.Cursor;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d40.C31062a;
import d40.C86171b;
import d40.C86172c;
import java.util.ArrayList;
import java.util.Iterator;
import m30.C88691b;
import m30.C88693c;
import oa1.C117731d;
import p749xh.C91209n5;

/* renamed from: l30.c */
public class C88374c extends C88372a {

    /* renamed from: b */
    public static C88374c f255367b = new C88374c();

    /* renamed from: a */
    public boolean mo59472a() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        char c = 0;
        if (!(Util.getInt(C117731d.m166007c().mo182444f("clicfg_plugin_kara_prophet_collect_open", "1", false, true), 1) != 0)) {
            Log.m105924i("Kara.FullLinkDataCollector", "no working");
            return false;
        }
        if (C88691b.f256042a == null) {
            C88691b.m110635a();
        }
        C88693c cVar = C88691b.f256042a;
        cVar.getClass();
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = cVar.f256045d.rawQuery("select * from KeyNodeInfo where is_full_links_data_collector_finished=false and happen_time<=?", new String[]{String.valueOf(System.currentTimeMillis() - 86400000)});
        while (rawQuery.moveToNext()) {
            try {
                C91209n5 n5Var = new C91209n5();
                n5Var.convertFrom(rawQuery);
                arrayList.add(n5Var);
            } catch (Throwable th) {
                if (rawQuery != null) {
                    rawQuery.close();
                }
                throw th;
            }
        }
        rawQuery.close();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C91209n5 n5Var2 = (C91209n5) it.next();
            Object[] objArr = new Object[2];
            objArr[c] = n5Var2.field_type;
            objArr[1] = n5Var2.field_id;
            Log.m105925i("Kara.FullLinkDataCollector", "begin: %s %s", objArr);
            n5Var2.field_is_full_links_data_collector_finished = true;
            cVar.mo123138Lo(n5Var2);
            if (n5Var2.field_happen_time <= 0) {
                Log.m105924i("Kara.FullLinkDataCollector", "no happened");
            } else if (n5Var2.field_predict_time <= 0) {
                Log.m105924i("Kara.FullLinkDataCollector", "no predict");
            } else {
                C86171b bVar = new C86171b();
                bVar.f250696a = n5Var2.field_type;
                bVar.f250697b = ChannelUtil.isGPVersion() ^ true ? 1 : 0;
                double doubleValue = Double.valueOf((double) n5Var2.field_happen_time).doubleValue() / 1000.0d;
                if (doubleValue == 0.0d) {
                    str = "";
                } else {
                    Object[] objArr2 = new Object[1];
                    objArr2[c] = Double.valueOf(doubleValue);
                    str = String.format("%.4f", objArr2);
                }
                bVar.f250698c = str;
                double doubleValue2 = Double.valueOf((double) n5Var2.field_predict_time).doubleValue() / 1000.0d;
                int i = (doubleValue2 > 0.0d ? 1 : (doubleValue2 == 0.0d ? 0 : -1));
                if (i == 0) {
                    str2 = "";
                } else {
                    Object[] objArr3 = new Object[1];
                    objArr3[c] = Double.valueOf(doubleValue2);
                    str2 = String.format("%.4f", objArr3);
                }
                bVar.f250699d = str2;
                double doubleValue3 = Double.valueOf((double) n5Var2.field_prepare_time).doubleValue() / 1000.0d;
                if (doubleValue3 == 0.0d) {
                    str3 = "";
                } else {
                    Object[] objArr4 = new Object[1];
                    objArr4[c] = Double.valueOf(doubleValue3);
                    str3 = String.format("%.4f", objArr4);
                }
                bVar.f250700e = str3;
                double doubleValue4 = Double.valueOf((double) n5Var2.field_extract_time).doubleValue() / 1000.0d;
                if (doubleValue4 == 0.0d) {
                    str4 = "";
                } else {
                    Object[] objArr5 = new Object[1];
                    objArr5[c] = Double.valueOf(doubleValue4);
                    str4 = String.format("%.4f", objArr5);
                }
                bVar.f250701f = str4;
                double doubleValue5 = Double.valueOf((double) n5Var2.field_recall_time).doubleValue() / 1000.0d;
                if (doubleValue5 == 0.0d) {
                    str5 = "";
                } else {
                    Object[] objArr6 = new Object[1];
                    objArr6[c] = Double.valueOf(doubleValue5);
                    str5 = String.format("%.4f", objArr6);
                }
                bVar.f250702g = str5;
                float f = n5Var2.field_prediction;
                if (((double) f) == 0.0d) {
                    str6 = "";
                } else {
                    Object[] objArr7 = new Object[1];
                    objArr7[c] = Float.valueOf(f);
                    str6 = String.format("%.4f", objArr7);
                }
                bVar.f250703h = str6;
                bVar.f250704i = String.valueOf(n5Var2.field_positive);
                String str10 = n5Var2.field_desc;
                if (str10 == null) {
                    str10 = "";
                }
                bVar.f250705j = str10;
                double doubleValue6 = Double.valueOf((double) n5Var2.field_time_on_predict).doubleValue() / 1000.0d;
                if (doubleValue6 == 0.0d) {
                    str7 = "";
                } else {
                    Object[] objArr8 = new Object[1];
                    objArr8[c] = Double.valueOf(doubleValue6);
                    str7 = String.format("%.4f", objArr8);
                }
                bVar.f250706k = str7;
                String str11 = n5Var2.field_error_on_predict;
                if (str11 == null) {
                    str11 = "";
                }
                bVar.f250707l = str11;
                double doubleValue7 = Double.valueOf((double) n5Var2.field_time_on_extract).doubleValue() / 1000.0d;
                if (doubleValue7 == 0.0d) {
                    str8 = "";
                } else {
                    Object[] objArr9 = new Object[1];
                    objArr9[c] = Double.valueOf(doubleValue7);
                    str8 = String.format("%.4f", objArr9);
                }
                bVar.f250708m = str8;
                double doubleValue8 = Double.valueOf((double) n5Var2.field_time_on_extract_all_feature).doubleValue() / 1000.0d;
                if (doubleValue8 == 0.0d) {
                    str9 = "";
                } else {
                    Object[] objArr10 = new Object[1];
                    objArr10[c] = Double.valueOf(doubleValue8);
                    str9 = String.format("%.4f", objArr10);
                }
                bVar.f250711p = str9;
                String str12 = n5Var2.field_model_heaviest_features;
                if (str12 == null) {
                    str12 = "";
                }
                bVar.f250709n = str12;
                String str13 = n5Var2.field_model_null_features;
                if (str13 == null) {
                    str13 = "";
                }
                bVar.f250710o = str13;
                String str14 = n5Var2.field_error_on_extract_all_feature;
                if (str14 == null) {
                    str14 = "";
                }
                bVar.f250712q = str14;
                String str15 = n5Var2.field_all_heaviest_features;
                if (str15 == null) {
                    str15 = "";
                }
                bVar.f250713r = str15;
                String str16 = n5Var2.field_all_null_features;
                if (str16 == null) {
                    str16 = "";
                }
                bVar.f250714s = str16;
                bVar.f250715t = String.valueOf(n5Var2.field_version);
                String str17 = bVar.f250696a;
                if (Math.random() <= Util.getDouble(C117731d.m166007c().mo182444f("clicfg_android_kara_prophet_report", String.valueOf(1.0E-5d), true, true), 1.0E-5d) && Util.getDouble(C117731d.m166007c().mo182444f("clicfg_android_kara_prophet_report", String.valueOf(1.0E-5d), true, true), 1.0E-5d) >= 0.0d) {
                    Log.m105925i("Kara.KaraFullLinkDataReport", "report %s", bVar);
                    C115669n.INSTANCE.mo160131h(25581, bVar.f250696a, Integer.valueOf(bVar.f250697b), bVar.f250698c, bVar.f250699d, bVar.f250700e, bVar.f250701f, bVar.f250702g, bVar.f250703h, bVar.f250704i, bVar.f250705j, bVar.f250706k, bVar.f250707l, bVar.f250708m, bVar.f250709n, bVar.f250710o, bVar.f250711p, bVar.f250712q, bVar.f250713r, bVar.f250714s, 0, bVar.f250715t, "");
                    C31062a.m39295b(str17, 102);
                }
                if (bVar.f250696a.equals("MomentVideo") && i > 0) {
                    boolean z = n5Var2.field_recall_time > 0;
                    boolean z2 = n5Var2.field_positive == 1;
                    boolean z3 = n5Var2.field_predict_type == 1;
                    if (z && z2) {
                        C86172c.m106685a(z3 ? 248 : 255);
                    }
                    if (z && !z2) {
                        C86172c.m106685a(z3 ? 245 : 252);
                    }
                    if (!z && z2) {
                        C86172c.m106685a(z3 ? 247 : 254);
                    }
                    if (!z && !z2) {
                        C86172c.m106685a(z3 ? 246 : 253);
                    }
                    if (z2) {
                        C86172c.m106685a(z3 ? 244 : 251);
                    } else {
                        C86172c.m106685a(z3 ? 243 : 250);
                    }
                }
                Log.m105925i("Kara.FullLinkDataCollector", "finish: %s %s", n5Var2.field_type, n5Var2.field_id);
                c = 0;
            }
        }
        return true;
    }

    /* renamed from: b */
    public long mo59473b() {
        return 1800000;
    }

    /* renamed from: c */
    public String mo59474c() {
        return "ProphetCollector";
    }
}
