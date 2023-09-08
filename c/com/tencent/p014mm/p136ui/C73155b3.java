package com.tencent.p014mm.p136ui;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.tencent.p014mm.p136ui.C74755f3;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import di3.C86312j;
import eb0.C97625j3;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import l20.C21388a;
import lc3.C10485b;
import p327ct.C30914c;
import p645pj.C77093f;

/* renamed from: com.tencent.mm.ui.b3 */
public class C73155b3 {

    /* renamed from: h */
    public static C73155b3 f214719h;

    /* renamed from: a */
    public int f214720a = 0;

    /* renamed from: b */
    public SparseIntArray f214721b = new SparseIntArray();

    /* renamed from: c */
    public SparseArray<C74755f3.C74759d> f214722c = new SparseArray<>();

    /* renamed from: d */
    public ArrayList<Integer> f214723d = new ArrayList<>();

    /* renamed from: e */
    public SparseArray<C74755f3.C74760e> f214724e = new SparseArray<>();

    /* renamed from: f */
    public long f214725f = 0;

    /* renamed from: g */
    public boolean f214726g = false;

    /* renamed from: a */
    public void mo101597a(boolean z) {
        try {
            mo101598b(z);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.PlusMenaDataManager", e, "", new Object[0]);
        }
        this.f214724e.clear();
        this.f214720a = 0;
        int i = 0;
        for (int i2 = 0; i2 < this.f214723d.size(); i2++) {
            int intValue = this.f214723d.get(i2).intValue();
            C74755f3.C74759d dVar = this.f214722c.get(intValue);
            C74755f3.C74761f f = C74755f3.m89494f(intValue);
            if (f != null) {
                C74755f3.C74760e eVar = new C74755f3.C74760e(f);
                this.f214724e.put(i, eVar);
                int i3 = this.f214721b.get(intValue);
                if ((dVar.f219827b == 1 && i3 != dVar.f219828c) || (intValue == 20 && ((C21388a) ((C30914c) C86312j.m106911c(C30914c.class)).mo17862sM()).mo33494b(262159, 266248))) {
                    eVar.f219830a = true;
                    this.f214720a++;
                }
                i++;
            }
        }
        Log.m105925i("MicroMsg.PlusMenaDataManager", "dynaMenuOrder.size() %s menuDataMap.size() %s", Integer.valueOf(this.f214723d.size()), Integer.valueOf(this.f214724e.size()));
        if (this.f214723d.size() != 0 && ChannelUtil.isCrowdTestVersion()) {
            this.f214724e.put(i, new C74755f3.C74760e(C74755f3.m89494f(2147483645)));
        }
    }

    /* renamed from: b */
    public final void mo101598b(boolean z) {
        ArrayList arrayList;
        if (!z) {
            if (!(this.f214722c.size() == 0 || System.currentTimeMillis() - this.f214725f > 3600000)) {
                return;
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        C77093f vh02 = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0();
        synchronized (vh02) {
            if (!vh02.f225188b) {
                Log.m105920e("MicroMsg.DynamicConfig", "DynamicConfig hadnot load");
                vh02.mo107407e();
            }
            arrayList = new ArrayList();
            if (!Util.isNullOrNil("TopRightMenu\\d*")) {
                for (String next : vh02.f225187a.keySet()) {
                    if (next.matches("TopRightMenu\\d*")) {
                        arrayList.add(vh02.f225187a.get(next));
                    }
                }
            }
            Log.m105919d("MicroMsg.DynamicConfig", "searchValues, entry:%s, size:%d", "TopRightMenu\\d*", Integer.valueOf(arrayList.size()));
        }
        Log.m105925i("MicroMsg.PlusMenaDataManager", "dynaConfigs size %d", Integer.valueOf(arrayList.size()));
        synchronized (this) {
            this.f214722c.clear();
            this.f214723d.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Map<String, String> parseXml = XmlParser.parseXml((String) it.next(), "Menu", (String) null);
                if (parseXml != null) {
                    if (parseXml.size() != 0) {
                        int safeParseInt = Util.safeParseInt(parseXml.get(".Menu.$id"));
                        int safeParseInt2 = Util.safeParseInt(parseXml.get(".Menu.$shownew"));
                        int safeParseInt3 = Util.safeParseInt(parseXml.get(".Menu.$seq"));
                        int safeParseInt4 = Util.safeParseInt(parseXml.get(".Menu.$order"));
                        this.f214722c.put(safeParseInt, new C74755f3.C74759d(safeParseInt, safeParseInt2, safeParseInt3, safeParseInt4));
                        int i = 0;
                        while (true) {
                            if (i >= this.f214723d.size()) {
                                break;
                            } else if (this.f214722c.get(this.f214723d.get(i).intValue()).f219829d > safeParseInt4) {
                                break;
                            } else {
                                i++;
                            }
                        }
                        this.f214723d.add(i, Integer.valueOf(safeParseInt));
                    }
                }
            }
            Log.m105925i("MicroMsg.PlusMenaDataManager", "dynaMenuOrder size %d", Integer.valueOf(this.f214723d.size()));
            if (this.f214723d.size() == 0) {
                mo101599c();
            }
        }
        if (this.f214722c.size() != 0) {
            this.f214721b.clear();
            String str = (String) C97625j3.m125812b().mo105906u().mo119684e(299010, (Object) null);
            if (!Util.isNullOrNil(str)) {
                String[] split = str.split("\\|");
                if (split.length > 0) {
                    Pattern compile = Pattern.compile("\\:");
                    for (String split2 : split) {
                        String[] split3 = compile.split(split2);
                        if (split3.length == 2) {
                            this.f214721b.put(Util.safeParseInt(split3[0]), Util.safeParseInt(split3[1]));
                        }
                    }
                }
            }
            this.f214726g = true;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        this.f214725f = currentTimeMillis2;
        Log.m105919d("MicroMsg.PlusMenaDataManager", " plus menu load data spent time : %s", Long.valueOf(currentTimeMillis2 - currentTimeMillis));
    }

    /* renamed from: c */
    public final void mo101599c() {
        this.f214722c.clear();
        this.f214723d.clear();
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("TopRightMenus");
        if (!Util.isNullOrNil(c)) {
            Map<String, String> parseXml = XmlParser.parseXml(c, "TopRightMenus", (String) null);
            if (parseXml == null) {
                Log.m105920e("MicroMsg.PlusMenaDataManager", "TopRightMenus is not right");
                return;
            }
            int i = 0;
            while (i < 100) {
                StringBuilder sb = new StringBuilder();
                sb.append(".TopRightMenus.Menu");
                sb.append(i == 0 ? "" : Integer.valueOf(i));
                String sb4 = sb.toString();
                String str = parseXml.get(sb4 + ".$id");
                if (str != null && !Util.isNullOrNil(str)) {
                    String str2 = parseXml.get(sb4 + ".$shownew");
                    String str3 = parseXml.get(sb4 + ".$seq");
                    Log.m105919d("MicroMsg.PlusMenaDataManager", "got plus panel configs : %s %s %s", str, str2, str3);
                    this.f214722c.put(Util.safeParseInt(str), new C74755f3.C74759d(Util.safeParseInt(str), Util.safeParseInt(str2), Util.safeParseInt(str3), 0));
                    this.f214723d.add(Integer.valueOf(Util.safeParseInt(str)));
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
