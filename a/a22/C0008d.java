package a22;

import com.tencent.p014mm.autogen.mmdata.rpt.ContactTagManagementReportStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.List;
import zt3.C119157j;

/* renamed from: a22.d */
public class C0008d {

    /* renamed from: a22.d$a */
    public class C0009a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f5d;

        /* renamed from: e */
        public final /* synthetic */ long f6e;

        /* renamed from: f */
        public final /* synthetic */ long f7f;

        /* renamed from: g */
        public final /* synthetic */ long f8g;

        /* renamed from: h */
        public final /* synthetic */ long f9h;

        public C0009a(long j, long j2, long j3, long j4, long j5) {
            this.f5d = j;
            this.f6e = j2;
            this.f7f = j3;
            this.f8g = j4;
            this.f9h = j5;
        }

        public void run() {
            ContactTagManagementReportStruct contactTagManagementReportStruct = new ContactTagManagementReportStruct();
            contactTagManagementReportStruct.f9649d = this.f5d;
            contactTagManagementReportStruct.f9650e = this.f6e;
            contactTagManagementReportStruct.f9651f = this.f7f;
            contactTagManagementReportStruct.f9652g = this.f8g;
            contactTagManagementReportStruct.f9653h = this.f9h;
            contactTagManagementReportStruct.mo86054n();
            Log.m105924i("MicroMsg.Label.LabelUtils", "24176 setSource = " + this.f5d + ",setAction = " + this.f6e + ",setOperate_label_cnt = " + this.f7f + ",setAdd_member_cnt = " + this.f8g + ",setRemove_member_cnt = " + this.f9h);
        }
    }

    /* renamed from: a */
    public static void m0a(long j, long j2, long j3, long j4, long j5) {
        ((C119157j) C119157j.f356862d).mo183875f(new C0009a(j, j2, j3, j4, j5));
    }

    /* renamed from: b */
    public static String m1b(String str, String str2) {
        Log.m105919d("MicroMsg.Label.LabelUtils", "original:%s,waitToAddLabel:%s", str, str2);
        if (Util.isNullOrNil(str2)) {
            return str;
        }
        if (Util.isNullOrNil(str)) {
            return str2 + "\u0000";
        }
        if (str.endsWith("\u0000")) {
            str = str.replace("\u0000", "");
        }
        ArrayList<String> stringsToList = Util.stringsToList(str.split(","));
        if (stringsToList == null || !stringsToList.contains(str2)) {
            return str + "," + str2 + "\u0000";
        }
        return str + "\u0000";
    }

    /* renamed from: c */
    public static String m2c(String str, String str2) {
        Log.m105919d("MicroMsg.Label.LabelUtils", "original:%s,waitToDelLabel:%s", str, str2);
        if (Util.isNullOrNil(str2)) {
            return str;
        }
        if (Util.isNullOrNil(str)) {
            return "";
        }
        if (str.endsWith("\u0000")) {
            str = str.replace("\u0000", "");
        }
        ArrayList<String> stringsToList = Util.stringsToList(str.split(","));
        if (!stringsToList.contains(str2)) {
            return str;
        }
        stringsToList.remove(str2);
        return m3d(stringsToList);
    }

    /* renamed from: d */
    public static String m3d(List<String> list) {
        StringBuilder sb = new StringBuilder();
        if (list != null && list.size() > 0) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append(list.get(i));
                if (i < size - 1) {
                    sb.append(",");
                }
            }
            sb.append("\u0000");
        }
        return sb.toString();
    }
}
