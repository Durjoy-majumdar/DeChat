package com.tencent.p014mm.plugin.scanner.model;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.scanner.model.a */
public class C94474a {

    /* renamed from: a */
    public int f273153a = 1;

    /* renamed from: b */
    public String f273154b;

    /* renamed from: c */
    public int f273155c;

    /* renamed from: d */
    public String f273156d;

    /* renamed from: e */
    public boolean f273157e;

    /* renamed from: f */
    public LinkedList<C94475a> f273158f = new LinkedList<>();

    /* renamed from: a */
    public static C94475a m119497a(Map<String, String> map, String str) {
        int i = Util.getInt(map.get(str + ".$type"), 0);
        C94475a aVar = new C94475a(i);
        aVar.f273159a = i;
        aVar.f273172n = Util.nullAsNil(map.get(str + ".statid"));
        aVar.f273160b = Util.nullAsNil(map.get(str + ".name"));
        aVar.f273161c = Util.nullAsNil(map.get(str + ".desc"));
        aVar.f273165g = Util.nullAsNil(map.get(str + ".digest"));
        aVar.f273166h = Util.getInt(map.get(str + ".showtype"), 0);
        aVar.f273167i = Util.nullAsNil(map.get(str + ".image"));
        aVar.f273178t = Util.nullAsNil(map.get(str + ".$key"));
        aVar.f273181w = Util.nullAsNil(map.get(str + ".iconurl"));
        if (i == 1) {
            aVar.f273162d = Util.nullAsNil(map.get(str + ".link"));
            return aVar;
        } else if (i == 2) {
            aVar.f273163e = Util.nullAsNil(map.get(str + ".username"));
            aVar.f273164f = Util.nullAsNil(map.get(str + ".nickname"));
            aVar.f273176r = Util.nullAsNil(map.get(str + ".strbeforefollow"));
            aVar.f273177s = Util.nullAsNil(map.get(str + ".strafterfollow"));
            return aVar;
        } else if (i == 3) {
            aVar.f273168j = Util.nullAsNil(map.get(str + ".thumburl"));
            aVar.f273162d = Util.nullAsNil(map.get(str + ".link"));
            return aVar;
        } else if (i == 4) {
            aVar.f273168j = Util.nullAsNil(map.get(str + ".thumburl"));
            aVar.f273163e = Util.nullAsNil(map.get(str + ".username"));
            aVar.f273164f = Util.nullAsNil(map.get(str + ".nickname"));
            return aVar;
        } else if (i == 5) {
            aVar.f273169k = Util.nullAsNil(map.get(str + ".wifiurl"));
            aVar.f273170l = Util.nullAsNil(map.get(str + ".wapurl"));
            aVar.f273171m = Util.nullAsNil(map.get(str + ".weburl"));
            if (!Util.isNullOrNil(aVar.f273169k) || !Util.isNullOrNil(aVar.f273170l) || !Util.isNullOrNil(aVar.f273171m)) {
                return aVar;
            }
            return null;
        } else if (i == 6) {
            return aVar;
        } else {
            if (i == 7) {
                aVar.f273168j = Util.nullAsNil(map.get(str + ".thumburl"));
                Util.nullAsNil(map.get(str + ".playurl"));
                return aVar;
            } else if (i == 9) {
                aVar.f273173o = Util.nullAsNil(map.get(str + ".productid"));
                return aVar;
            } else if (i == 8) {
                aVar.f273174p = Util.nullAsNil(map.get(str + ".cardext"));
                aVar.f273175q = Util.nullAsNil(map.get(str + ".cardid"));
                return aVar;
            } else if (i == 10) {
                aVar.f273173o = Util.nullAsNil(map.get(str + ".id"));
                return aVar;
            } else if (i == 12) {
                aVar.f273168j = Util.nullAsNil(map.get(str + ".image"));
                aVar.f273162d = Util.nullAsNil(map.get(str + ".link"));
                return aVar;
            } else if (i == 22) {
                aVar.f273179u = Util.nullAsNil(map.get(str + ".content"));
                aVar.f273162d = Util.nullAsNil(map.get(str + ".link"));
                aVar.f273164f = Util.nullAsNil(map.get(str + ".nickname"));
                aVar.f273168j = Util.nullAsNil(map.get(str + ".image"));
                return aVar;
            } else if (i == 21) {
                aVar.f273180v = Util.nullAsNil(map.get(str + ".referkey"));
                return aVar;
            } else {
                aVar.f273162d = Util.nullAsNil(map.get(str + ".link"));
                return aVar;
            }
        }
    }

    /* renamed from: b */
    public static LinkedList<C94474a> m119498b(Map<String, String> map, String str) {
        Map<String, String> map2 = map;
        LinkedList<C94474a> linkedList = new LinkedList<>();
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (i2 < 1000) {
            C94474a aVar = new C94474a();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(".actionlist");
            sb.append(i2 > 0 ? Integer.valueOf(i2) : "");
            String sb4 = sb.toString();
            if (!Util.isNullOrNil(map2.get(sb4 + ".$type"))) {
                aVar.f273153a = Util.getInt(map2.get(sb4 + ".$type"), i);
            }
            aVar.f273154b = Util.nullAsNil(map2.get(sb4 + ".$title"));
            Util.nullAsNil(map2.get(sb4 + ".$iconurl"));
            Util.getInt(map2.get(sb4 + ".$iconwidth"), 34);
            Util.getInt(map2.get(sb4 + ".$iconheight"), 34);
            aVar.f273156d = Util.nullAsNil(map2.get(sb4 + ".$referkey"));
            aVar.f273155c = Util.getInt(map2.get(sb4 + ".$listshowtype"), i);
            LinkedList<C94475a> linkedList2 = new LinkedList<>();
            int i3 = 0;
            boolean z2 = false;
            while (true) {
                if (i3 >= 1000) {
                    break;
                }
                StringBuilder sb5 = new StringBuilder();
                sb5.append(sb4);
                sb5.append(".action");
                sb5.append(i3 > 0 ? Integer.valueOf(i3) : "");
                String sb6 = sb5.toString();
                if (!Util.isNullOrNil(map2.get(sb6 + ".$type"))) {
                    C94475a a = m119497a(map2, sb6);
                    if (a != null) {
                        linkedList2.add(a);
                        if (!(!Util.isNullOrNil(a.f273178t))) {
                            z2 = true;
                        }
                    }
                    i3++;
                    z = false;
                } else if (z) {
                    return linkedList;
                } else {
                    aVar.f273158f = linkedList2;
                    z = true;
                }
            }
            aVar.f273157e = z2;
            linkedList.add(aVar);
            i2++;
            i = 0;
        }
        return linkedList;
    }

    /* renamed from: com.tencent.mm.plugin.scanner.model.a$a */
    public static class C94475a {

        /* renamed from: a */
        public int f273159a;

        /* renamed from: b */
        public String f273160b = "";

        /* renamed from: c */
        public String f273161c = "";

        /* renamed from: d */
        public String f273162d = "";

        /* renamed from: e */
        public String f273163e = "";

        /* renamed from: f */
        public String f273164f = "";

        /* renamed from: g */
        public String f273165g = "";

        /* renamed from: h */
        public int f273166h;

        /* renamed from: i */
        public String f273167i = "";

        /* renamed from: j */
        public String f273168j = "";

        /* renamed from: k */
        public String f273169k = "";

        /* renamed from: l */
        public String f273170l = "";

        /* renamed from: m */
        public String f273171m = "";

        /* renamed from: n */
        public String f273172n = "";

        /* renamed from: o */
        public String f273173o = "";

        /* renamed from: p */
        public String f273174p = "";

        /* renamed from: q */
        public String f273175q = "";

        /* renamed from: r */
        public String f273176r;

        /* renamed from: s */
        public String f273177s;

        /* renamed from: t */
        public String f273178t;

        /* renamed from: u */
        public String f273179u;

        /* renamed from: v */
        public String f273180v;

        /* renamed from: w */
        public String f273181w = "";

        public C94475a() {
        }

        public C94475a(int i) {
            this.f273159a = i;
        }
    }
}
