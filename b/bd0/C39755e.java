package bd0;

import com.google.android.gms.gcm.Task;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47349a0;
import p216op.C100370j;
import p375qh.C35873j;
import p823sg.C101611g;
import p823sg.C101614i;

/* renamed from: bd0.e */
public class C39755e implements C11385n {

    /* renamed from: f */
    public static final C101611g<Integer, C39756a> f106662f = new C101614i(5);

    /* renamed from: g */
    public static int f106663g = 0;

    /* renamed from: h */
    public static C39755e f106664h;

    /* renamed from: d */
    public boolean f106665d = false;

    /* renamed from: e */
    public int f106666e = 3;

    /* renamed from: bd0.e$a */
    public static class C39756a {

        /* renamed from: a */
        public String f106667a = "BeiJing;GuangZhou;ShangHai;";

        /* renamed from: b */
        public int f106668b = 0;

        /* renamed from: c */
        public int f106669c = 0;

        /* renamed from: d */
        public int f106670d = 2;

        /* renamed from: e */
        public int f106671e = 2;

        /* renamed from: f */
        public int f106672f = 2;

        /* renamed from: g */
        public int f106673g = Task.EXTRAS_LIMIT_BYTES;

        /* renamed from: h */
        public int f106674h = 10240000;

        /* renamed from: i */
        public int f106675i = 100;

        /* renamed from: j */
        public int f106676j = 100;

        /* renamed from: k */
        public int f106677k = 100;

        /* renamed from: l */
        public Random f106678l = new Random();

        /* renamed from: m */
        public List<String> f106679m = null;

        /* renamed from: d */
        public static C39756a m42546d() {
            Log.m105918d("upload", "parseFromFile");
            C100370j jVar = (C100370j) C86312j.m106911c(C100370j.class);
            String str = jVar.mo72329HT() + jVar.ic0(1, 9);
            int l = (int) C86013q1.m106451l(str);
            if (l == -1) {
                Log.m105920e("upload", "read file failed " + l + str);
                return null;
            }
            byte[] O = C86013q1.m106433O(str, 0, l);
            if (O == null) {
                Log.m105920e("upload", "read file failed " + l + str);
                return null;
            }
            String str2 = new String(O);
            if (Util.isNullOrNil(str2)) {
                return null;
            }
            int indexOf = str2.indexOf(60);
            if (indexOf > 0) {
                str2 = str2.substring(indexOf);
            }
            int hashCode = str2.hashCode();
            C39756a aVar = C39755e.f106662f.get(Integer.valueOf(hashCode));
            if (aVar != null) {
                return aVar;
            }
            Map<String, String> parseXml = XmlParser.parseXml(str2, "Config", (String) null);
            if (parseXml == null) {
                Log.m105920e("upload", "parse msg failed");
                return null;
            }
            try {
                C39756a aVar2 = new C39756a();
                int i = 0;
                while (true) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(".Config.Item");
                    Object obj = "";
                    sb.append(i == 0 ? obj : Integer.valueOf(i));
                    sb.append(".$key");
                    String str3 = parseXml.get(sb.toString());
                    Log.m105918d("upload", "key " + str3);
                    if (str3 == null) {
                        aVar2.mo62395b();
                        ((C101614i) C39755e.f106662f).mo139557c(Integer.valueOf(hashCode), aVar2);
                        return aVar2;
                    }
                    if (str3.equals("region")) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(".Config.Item");
                        if (i != 0) {
                            obj = Integer.valueOf(i);
                        }
                        sb4.append(obj);
                        String str4 = parseXml.get(sb4.toString());
                        aVar2.f106667a = str4;
                        if (str4 != null && str4.length() > 0) {
                            String[] split = aVar2.f106667a.split(";");
                            aVar2.f106679m = new ArrayList();
                            if (split != null && split.length > 0) {
                                for (int i2 = 0; i2 < split.length; i2++) {
                                    String str5 = split[i2];
                                    if (str5 != null && str5.length() > 0) {
                                        aVar2.f106679m.add(split[i2]);
                                    }
                                }
                            }
                        }
                    } else if (str3.equals("sex")) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(".Config.Item");
                        if (i != 0) {
                            obj = Integer.valueOf(i);
                        }
                        sb5.append(obj);
                        aVar2.f106668b = Util.getInt(parseXml.get(sb5.toString()), 0);
                    } else if (str3.equals(TPReportKeys.Common.COMMON_MEDIA_RATE)) {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(".Config.Item");
                        if (i != 0) {
                            obj = Integer.valueOf(i);
                        }
                        sb6.append(obj);
                        aVar2.f106669c = Util.getInt(parseXml.get(sb6.toString()), 0);
                    } else if (str3.equals("minsize")) {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(".Config.Item");
                        if (i != 0) {
                            obj = Integer.valueOf(i);
                        }
                        sb7.append(obj);
                        aVar2.f106673g = Util.getInt(parseXml.get(sb7.toString()), 0);
                    } else if (str3.equals("maxsize")) {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append(".Config.Item");
                        if (i != 0) {
                            obj = Integer.valueOf(i);
                        }
                        sb8.append(obj);
                        aVar2.f106674h = Util.getInt(parseXml.get(sb8.toString()), 0);
                    } else if (str3.equals("daycount_single")) {
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append(".Config.Item");
                        if (i != 0) {
                            obj = Integer.valueOf(i);
                        }
                        sb9.append(obj);
                        aVar2.f106675i = Util.getInt(parseXml.get(sb9.toString()), 0);
                    } else if (str3.equals("daycount_chatroom")) {
                        StringBuilder sb10 = new StringBuilder();
                        sb10.append(".Config.Item");
                        if (i != 0) {
                            obj = Integer.valueOf(i);
                        }
                        sb10.append(obj);
                        aVar2.f106676j = Util.getInt(parseXml.get(sb10.toString()), 0);
                    } else if (str3.equals("daycount_app")) {
                        StringBuilder sb11 = new StringBuilder();
                        sb11.append(".Config.Item");
                        if (i != 0) {
                            obj = Integer.valueOf(i);
                        }
                        sb11.append(obj);
                        aVar2.f106677k = Util.getInt(parseXml.get(sb11.toString()), 0);
                    } else if (str3.equals("rate_single")) {
                        StringBuilder sb12 = new StringBuilder();
                        sb12.append(".Config.Item");
                        if (i != 0) {
                            obj = Integer.valueOf(i);
                        }
                        sb12.append(obj);
                        aVar2.f106670d = Util.getInt(parseXml.get(sb12.toString()), 0);
                    } else if (str3.equals("rate_chatroom")) {
                        StringBuilder sb13 = new StringBuilder();
                        sb13.append(".Config.Item");
                        if (i != 0) {
                            obj = Integer.valueOf(i);
                        }
                        sb13.append(obj);
                        aVar2.f106671e = Util.getInt(parseXml.get(sb13.toString()), 0);
                    } else if (str3.equals("rate_app")) {
                        StringBuilder sb14 = new StringBuilder();
                        sb14.append(".Config.Item");
                        if (i != 0) {
                            obj = Integer.valueOf(i);
                        }
                        sb14.append(obj);
                        aVar2.f106672f = Util.getInt(parseXml.get(sb14.toString()), 0);
                    }
                    i++;
                }
            } catch (Exception e) {
                Log.m105921e("upload", "exception:%s", Util.stackTraceToString(e));
                return null;
            }
        }

        /* renamed from: a */
        public boolean mo62394a() {
            if (1 == C35873j.m40885a("EnableSpeexVoiceUpload", 0)) {
                return true;
            }
            int i = C39755e.f106663g;
            if ((i != 0 ? i != 1 ? i != 2 ? this.f106670d : this.f106672f : this.f106671e : this.f106670d) == 0 || !NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
                return false;
            }
            C86709a0.m107528h();
            int nullAs = Util.nullAs((Integer) C86709a0.m107535s().mo121142i().mo119684e(12290, (Object) null), 0);
            int i2 = this.f106668b;
            boolean z = i2 == 0 || i2 == nullAs;
            Log.m105918d("upload", "fitSex " + this.f106668b + " " + z + " " + this.f106668b);
            return z && mo62396c();
        }

        /* renamed from: b */
        public void mo62395b() {
            Log.m105918d("upload", "sex " + this.f106668b);
            Log.m105918d("upload", "rate_single " + this.f106670d);
            Log.m105918d("upload", "rate_chatroom " + this.f106671e);
            Log.m105918d("upload", "rate_app " + this.f106672f);
            Log.m105918d("upload", "rate " + this.f106669c);
            Log.m105918d("upload", "minsize " + this.f106673g);
            Log.m105918d("upload", "maxsize " + this.f106674h);
            Log.m105918d("upload", "daycount_single " + this.f106675i);
            Log.m105918d("upload", "daycount_chatroom " + this.f106676j);
            Log.m105918d("upload", "daycount_app " + this.f106677k);
            Log.m105918d("upload", "region " + this.f106667a);
        }

        /* renamed from: c */
        public boolean mo62396c() {
            List<String> list;
            String[] split;
            C72996z1 g = C75592q0.m90777g();
            StringBuilder sb = new StringBuilder();
            sb.append("  getRegionCode ");
            sb.append(g);
            Log.m105918d("upload", sb.toString() != null ? g.f149556y0 : "");
            String str = g.f149556y0;
            if (str != null && str.length() > 0 && (list = this.f106679m) != null && ((ArrayList) list).size() > 0 && (split = str.split("_")) != null && split.length > 0) {
                for (int i = 0; i < split.length; i++) {
                    String str2 = split[i];
                    if (str2 != null && str2.length() > 0) {
                        Iterator it = ((ArrayList) this.f106679m).iterator();
                        while (it.hasNext()) {
                            if (((String) it.next()).trim().toLowerCase().equals(split[i].trim().toLowerCase())) {
                                Log.m105918d("upload", "isInRegion");
                                return true;
                            }
                        }
                        continue;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    public static int m42545a(String str) {
        int i = 5;
        if (!(str == null || str.length() == 0)) {
            str.startsWith(MStorageEventData.EventType.SINGLE);
            if (str.startsWith("chatroom")) {
                i = 7;
            }
            if (str.startsWith("app")) {
                i = 8;
            }
            Log.m105918d("upload", "type " + i);
        }
        return i;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (!(yVar instanceof C47349a0) || ((C47349a0) yVar).mo72393j() != 9) {
            Log.m105918d("upload", "another scene");
        } else if (yVar.getType() == 159) {
            if (i == 0 && i2 == 0) {
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119676J(81944, Long.valueOf(Util.nowSecond()));
            } else {
                int i3 = this.f106666e - 1;
                this.f106666e = i3;
                if (i3 < 0) {
                    C86709a0.m107528h();
                    C86709a0.m107535s().mo121142i().mo119676J(81944, Long.valueOf(((Util.nowMilliSecond() - 86400000) + 3600000) / 1000));
                    this.f106666e = 3;
                }
            }
            this.f106665d = false;
            C86709a0.m107524d().mo123470p(159, this);
        }
    }
}
