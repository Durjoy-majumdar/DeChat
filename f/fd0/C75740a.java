package fd0;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72956b4;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72985m3;
import com.tencent.p014mm.storage.C72991u4;
import eb0.C97625j3;
import java.util.ArrayList;

/* renamed from: fd0.a */
public class C75740a {
    /* renamed from: a */
    public static ArrayList<String> m91003a(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        Cursor ko02 = ((C72972g4) C97625j3.m125812b().mo105911z()).ko0(str);
        if (!(ko02 == null || ko02.getCount() == 0)) {
            if (ko02.moveToFirst()) {
                int i = 0;
                while (!ko02.isAfterLast()) {
                    C72963f4 f4Var = new C72963f4();
                    f4Var.convertFrom(ko02);
                    ko02.moveToNext();
                    if (f4Var.mo100993e4()) {
                        arrayList.add(f4Var.getContent());
                    } else {
                        arrayList.add("");
                    }
                    i++;
                    if (i == 10) {
                        break;
                    }
                }
            }
            ko02.close();
        }
        return arrayList;
    }

    /* renamed from: b */
    public static ArrayList<String> m91004b(int i, String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        C72985m3[] kD = C75743h.wx0().mo101192kD(str, 10);
        if (kD != null) {
            for (C72985m3 m3Var : kD) {
                if (m3Var.field_type == 1) {
                    arrayList.add(Util.nullAsNil(C72963f4.C72971h.m85668v(m3Var.field_msgContent).f212742f));
                }
            }
        }
        Log.m105919d("MicroMsg.ExposeDataLogic", "getFMessageContent,scene:%d", Integer.valueOf(i));
        return arrayList;
    }

    /* renamed from: c */
    public static ArrayList<String> m91005c(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        C72956b4[] Ow = C75743h.xx0().mo100932Ow(str, 10);
        if (Ow != null) {
            for (C72956b4 b4Var : Ow) {
                arrayList.add(b4Var.field_sayhicontent);
            }
        }
        Log.m105918d("MicroMsg.ExposeDataLogic", "get lbs sayhi msg content");
        return arrayList;
    }

    /* renamed from: d */
    public static ArrayList<String> m91006d(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        C72991u4[] qq = C75743h.yx0().mo101226qq(str, 10);
        if (qq != null) {
            for (C72991u4 u4Var : qq) {
                arrayList.add(u4Var.field_sayhicontent);
            }
        }
        Log.m105918d("MicroMsg.ExposeDataLogic", "get shake sayhi msg content");
        return arrayList;
    }
}
