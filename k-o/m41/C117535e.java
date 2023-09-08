package m41;

import java.util.ArrayList;
import java.util.List;
import u24.C90599h;

/* renamed from: m41.e */
public class C117535e {
    /* renamed from: a */
    public static List<Integer> m165790a(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add(1);
        }
        if ((i & 2) != 0) {
            arrayList.add(2);
        }
        if ((i & 4) != 0) {
            arrayList.add(4);
        }
        if ((i & 8) != 0) {
            arrayList.add(8);
        }
        if ((i & 16) != 0) {
            arrayList.add(16);
        }
        return arrayList;
    }

    /* renamed from: b */
    public static List<Integer> m165791b(int i) {
        if ((i & 1) != 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 2) != 0) {
            arrayList.add(2);
        }
        if ((i & 4) != 0) {
            arrayList.add(4);
        }
        if ((i & 8) != 0) {
            arrayList.add(8);
        }
        if ((i & 16) != 0) {
            arrayList.add(16);
        }
        if ((i & 32) != 0) {
            arrayList.add(32);
        }
        if ((i & 64) != 0) {
            arrayList.add(64);
        }
        if ((i & 128) != 0) {
            arrayList.add(128);
        }
        return arrayList;
    }

    /* renamed from: c */
    public static List<Integer> m165792c(int i) {
        if ((i & 1) != 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 16) != 0) {
            arrayList.add(16);
        }
        if ((i & 32) != 0) {
            arrayList.add(32);
        }
        if ((i & 64) != 0) {
            arrayList.add(64);
        }
        if ((i & 128) != 0) {
            arrayList.add(128);
        }
        if ((i & 2) != 0) {
            arrayList.add(2);
        }
        return arrayList;
    }

    /* renamed from: d */
    public static List<Integer> m165793d(int i) {
        if ((i & 1) != 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 2) != 0) {
            arrayList.add(2);
        }
        if ((i & 4) != 0) {
            arrayList.add(4);
        }
        if ((i & 8) != 0) {
            arrayList.add(8);
        }
        if ((i & 16) != 0) {
            arrayList.add(16);
        }
        if ((i & 32) != 0) {
            arrayList.add(32);
        }
        if ((i & 64) != 0) {
            arrayList.add(64);
        }
        if ((i & 128) != 0) {
            arrayList.add(128);
        }
        return arrayList;
    }

    /* renamed from: e */
    public static int m165794e(String str) {
        if (C90599h.m113509b(str, "video_play")) {
            return 1;
        }
        if (C90599h.m113509b(str, "video_pause")) {
            return 2;
        }
        if (C90599h.m113509b(str, "video_stop")) {
            return 4;
        }
        if (C90599h.m113509b(str, "cgi_req")) {
            return 8;
        }
        return C90599h.m113509b(str, "cgi_resp") ? 16 : 0;
    }

    /* renamed from: f */
    public static int m165795f(String str) {
        if (C90599h.m113509b(str, "page_in")) {
            return 6;
        }
        if (C90599h.m113509b(str, "page_out")) {
            return 10;
        }
        if (C90599h.m113509b(str, "session_in")) {
            return 18;
        }
        if (C90599h.m113509b(str, "session_out")) {
            return 34;
        }
        if (C90599h.m113509b(str, "biz_in")) {
            return 66;
        }
        return C90599h.m113509b(str, "biz_out") ? 130 : 0;
    }

    /* renamed from: g */
    public static int m165796g(String str) {
        if (C90599h.m113509b(str, "view_clk")) {
            return 14;
        }
        if (C90599h.m113509b(str, "view_exp")) {
            return 50;
        }
        return C90599h.m113509b(str, "view_unexp") ? 194 : 0;
    }

    /* renamed from: h */
    public static boolean m165797h(String str, int i) {
        if (C90599h.m113511d(str)) {
            return true;
        }
        return (!C90599h.m113509b(str, "video_play") && !C90599h.m113509b(str, "video_pause") && !C90599h.m113509b(str, "video_stop") && !C90599h.m113509b(str, "cgi_req") && !C90599h.m113509b(str, "cgi_resp")) || (m165794e(str) & i) == 0;
    }

    /* renamed from: i */
    public static boolean m165798i(String str, int i) {
        if (C90599h.m113511d(str)) {
            return true;
        }
        if ((C90599h.m113509b(str, "view_clk") || C90599h.m113509b(str, "view_exp") || C90599h.m113509b(str, "view_unexp")) && (i & 1) == 0) {
            return (i & 2) == 0 && (m165796g(str) & i) == 0;
        }
        return true;
    }
}
