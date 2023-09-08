package com.tencent.p014mm.plugin.wallet_core.p125ui;

import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;
import p281yz.C79173v;
import pe3.C89349b;
import sf0.C48374j0;
import y43.C66501m;
import y43.C79030d0;
import y43.C79032f;
import y43.C79033l;
import y43.C79034n;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.l */
public class C72394l {

    /* renamed from: a */
    public C79033l f210614a = null;

    /* renamed from: b */
    public Map<String, C79030d0> f210615b = null;

    /* renamed from: c */
    public Map<String, C79034n> f210616c = null;

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.l$a */
    public static final class C72395a {

        /* renamed from: a */
        public C79034n f210617a;

        /* renamed from: b */
        public String f210618b;

        /* renamed from: c */
        public double f210619c;

        /* renamed from: d */
        public String f210620d;

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            if (this.f210617a != null) {
                stringBuffer.append("|faovrComposeId: " + this.f210617a.f232085d);
            }
            stringBuffer.append("|bankName: " + this.f210618b);
            stringBuffer.append("|bankFavorAmount: " + this.f210619c);
            stringBuffer.append("|bankType: " + this.f210620d);
            return stringBuffer.toString();
        }
    }

    public C72394l(C79033l lVar) {
        LinkedList<C79034n> linkedList;
        Assert.assertNotNull(lVar);
        this.f210614a = lVar;
        this.f210615b = new HashMap();
        LinkedList<C79030d0> linkedList2 = this.f210614a.f232072h;
        if (linkedList2 != null) {
            for (int i = 0; i < linkedList2.size(); i++) {
                C79030d0 d0Var = linkedList2.get(i);
                Map<String, C79030d0> map = this.f210615b;
                map.put(d0Var.f232049h + "", d0Var);
            }
        } else {
            Log.m105928w("MicroMsg.FavorLogicHelper", "func[initData] favorList null");
        }
        this.f210616c = new HashMap();
        C66501m mVar = this.f210614a.f232073i;
        if (mVar == null || (linkedList = mVar.f191301d) == null) {
            Log.m105928w("MicroMsg.FavorLogicHelper", "func[initData] favorComposeList null");
            return;
        }
        for (int i2 = 0; i2 < linkedList.size(); i2++) {
            C79034n nVar = linkedList.get(i2);
            this.f210616c.put(nVar.f232085d, nVar);
        }
    }

    /* renamed from: h */
    public static List<Bankcard> m84744h(int i, String str) {
        ArrayList<Bankcard> a = ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91319a(true);
        if (!(i != 0)) {
            return a;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < a.size(); i2++) {
            if (!Util.isNullOrNil(str) ? a.get(i2).field_bankcardType.equals(str) : !a.get(i2).field_bankcardType.equals("CFT")) {
                arrayList.add(a.get(i2));
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public static boolean m84745j(FavorPayInfo favorPayInfo, Bankcard bankcard) {
        String str;
        List<String> list;
        if (bankcard == null) {
            Log.m105928w("MicroMsg.FavorLogicHelper", "curBankcard null");
            return true;
        }
        if (favorPayInfo != null && !Util.isNullOrNil(favorPayInfo.f209524d)) {
            if ((favorPayInfo.f209525e != 0) && !Util.isNullOrNil(favorPayInfo.f209526f) && (list = favorPayInfo.f209529i) != null && list.contains(bankcard.field_bindSerial)) {
                return false;
            }
        }
        return (favorPayInfo.f209525e != 0) && ((!Util.isNullOrNil(favorPayInfo.f209526f) && (str = bankcard.field_bankcardType) != null && !str.equals(favorPayInfo.f209526f)) || (Util.isNullOrNil(favorPayInfo.f209526f) && bankcard.field_bankcardType.equals("CFT")));
    }

    /* renamed from: k */
    public static String[] m84746k(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        return str.split("-");
    }

    /* renamed from: a */
    public String mo99765a(String str) {
        ArrayList<Bankcard> a = ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91319a(true);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < a.size(); i++) {
            hashMap.put(a.get(i).field_bankcardType, 0);
        }
        String[] k = m84746k(str);
        if (k != null) {
            for (String str2 : k) {
                C79030d0 d0Var = (C79030d0) ((HashMap) this.f210615b).get(str2);
                if (d0Var != null) {
                    if (d0Var.f232056r != 0) {
                        if (hashMap.containsKey(d0Var.f232057s) || Util.isNullOrNil(d0Var.f232057s)) {
                            arrayList.add(str2);
                        }
                    }
                }
                arrayList.add(str2);
            }
        }
        if (arrayList.size() == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            sb.append(((String) arrayList.get(i2)) + "");
            if (i2 < arrayList.size() - 1) {
                sb.append("-");
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public Map<String, C72395a> mo99766b(String str, boolean z) {
        LinkedList<C79034n> linkedList;
        C72395a aVar;
        HashMap hashMap = new HashMap();
        C66501m mVar = this.f210614a.f232073i;
        if (mVar == null || (linkedList = mVar.f191301d) == null) {
            Log.m105928w("MicroMsg.FavorLogicHelper", "favorComposeList null or favorComposeList.favorComposeInfo null");
        } else {
            double d = 0.0d;
            if (((HashMap) this.f210616c).containsKey(str)) {
                d = ((C79034n) ((HashMap) this.f210616c).get(str)).f232086e;
            }
            for (int i = 0; i < linkedList.size(); i++) {
                C79034n nVar = linkedList.get(i);
                String str2 = null;
                if (str.equals("0") && !nVar.equals("0")) {
                    str2 = nVar.f232085d;
                } else if (nVar.f232085d.startsWith(str) && !str.equals(nVar.f232085d)) {
                    String str3 = nVar.f232085d;
                    str2 = str3.replace(str + "-", "");
                }
                String[] k = m84746k(str2);
                if (k != null && k.length > 0) {
                    C79030d0 d0Var = (C79030d0) ((HashMap) this.f210615b).get(k[0]);
                    if (d0Var != null) {
                        if ((d0Var.f232056r != 0) && !Util.isNullOrNil(d0Var.f232057s) && d0Var.f232060v.size() <= 0 && ((z || !d0Var.f232057s.equalsIgnoreCase("CFT")) && ((aVar = (C72395a) hashMap.get(d0Var.f232057s)) == null || nVar.f232086e > aVar.f210617a.f232086e))) {
                            C72395a aVar2 = new C72395a();
                            aVar2.f210617a = nVar;
                            aVar2.f210618b = d0Var.f232058t;
                            aVar2.f210619c = nVar.f232086e - d;
                            String str4 = d0Var.f232057s;
                            aVar2.f210620d = str4;
                            hashMap.put(str4, aVar2);
                        }
                    }
                }
            }
        }
        return hashMap;
    }

    /* renamed from: c */
    public String mo99767c(String str, boolean z) {
        String[] k = m84746k(str);
        if (k == null) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= k.length) {
                break;
            }
            Map<String, C79030d0> map = this.f210615b;
            C79030d0 d0Var = map.get(k[i] + "");
            if (d0Var != null) {
                if (d0Var.f232056r == 0) {
                    z2 = false;
                }
                if (!z2 || (Util.isNullOrNil(d0Var.f232057s) && !z)) {
                    sb.append(k[i]);
                    sb.append("-");
                }
            }
            i++;
        }
        return sb.length() == 0 ? "0" : sb.delete(sb.length() - 1, sb.length()).toString();
    }

    /* renamed from: d */
    public Map<String, C72395a> mo99768d(String str, boolean z) {
        LinkedList<C79034n> linkedList;
        int i;
        String str2 = str;
        HashMap hashMap = new HashMap();
        C66501m mVar = this.f210614a.f232073i;
        if (mVar == null || (linkedList = mVar.f191301d) == null) {
            Log.m105928w("MicroMsg.FavorLogicHelper", "favorComposeList null or favorComposeList.favorComposeInfo null");
        } else {
            double d = 0.0d;
            if (((HashMap) this.f210616c).containsKey(str2)) {
                d = ((C79034n) ((HashMap) this.f210616c).get(str2)).f232086e;
            }
            char c = 0;
            int i2 = 0;
            while (i2 < linkedList.size()) {
                C79034n nVar = linkedList.get(i2);
                String str3 = null;
                if (str2.equals("0") && !nVar.equals("0")) {
                    str3 = nVar.f232085d;
                } else if (nVar.f232085d.startsWith(str2) && !str2.equals(nVar.f232085d)) {
                    String str4 = nVar.f232085d;
                    str3 = str4.replace(str2 + "-", "");
                }
                String[] k = m84746k(str3);
                if (k != null && k.length > 0) {
                    C79030d0 d0Var = (C79030d0) ((HashMap) this.f210615b).get(k[c]);
                    if (d0Var != null) {
                        if ((d0Var.f232056r != 0) && d0Var.f232060v.size() > 0 && (z || !d0Var.f232057s.equalsIgnoreCase("CFT"))) {
                            Iterator<C89349b> it = d0Var.f232060v.iterator();
                            while (it.hasNext()) {
                                String b = C48374j0.m53713b(it.next());
                                C72395a aVar = (C72395a) hashMap.get(b);
                                if (aVar != null) {
                                    i = i2;
                                    if (nVar.f232086e <= aVar.f210617a.f232086e) {
                                        i2 = i;
                                    }
                                } else {
                                    i = i2;
                                }
                                C72395a aVar2 = new C72395a();
                                aVar2.f210617a = nVar;
                                aVar2.f210618b = d0Var.f232058t;
                                aVar2.f210619c = nVar.f232086e - d;
                                aVar2.f210620d = d0Var.f232057s;
                                hashMap.put(b, aVar2);
                                i2 = i;
                            }
                        }
                    }
                }
                i2++;
                c = 0;
            }
        }
        return hashMap;
    }

    /* renamed from: e */
    public C79034n mo99769e(String str, boolean z) {
        if (!"0".equals(str) && this.f210616c.containsKey(str)) {
            return this.f210616c.get(str);
        }
        for (String str2 : this.f210616c.keySet()) {
            C79034n nVar = this.f210616c.get(str2);
            LinkedList<C79032f> linkedList = nVar.f232088g;
            if (!(linkedList == null || linkedList.size() == 0)) {
                int size = nVar.f232088g.size();
                int i = 0;
                Iterator<C79032f> it = nVar.f232088g.iterator();
                while (it.hasNext()) {
                    C79032f next = it.next();
                    if (!this.f210615b.containsKey(next.f232065d)) {
                        break;
                    }
                    C79030d0 d0Var = this.f210615b.get(next.f232065d);
                    if (d0Var.f232057s.equals("") && d0Var.f232060v.size() == 0) {
                        if (!z || d0Var.f232056r == 0) {
                            i++;
                        }
                    }
                }
                if (i > 0 && i == size) {
                    return nVar;
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    public C79034n mo99770f(String str) {
        return this.f210616c.get(str);
    }

    /* renamed from: g */
    public FavorPayInfo mo99771g(String str) {
        FavorPayInfo favorPayInfo = new FavorPayInfo();
        if (((HashMap) this.f210616c).get(str) == null) {
            favorPayInfo.f209524d = "0";
            C79033l lVar = this.f210614a;
            if (lVar != null) {
                favorPayInfo.f209527g = lVar.f232071g;
            }
            favorPayInfo.f209525e = 0;
            return favorPayInfo;
        }
        favorPayInfo.f209524d = str;
        C79033l lVar2 = this.f210614a;
        if (lVar2 != null) {
            favorPayInfo.f209527g = lVar2.f232071g;
        }
        favorPayInfo.f209525e = 0;
        String[] k = m84746k(str);
        if (k == null) {
            return favorPayInfo;
        }
        int length = k.length - 1;
        while (true) {
            if (length < 0) {
                break;
            }
            C79030d0 d0Var = (C79030d0) ((HashMap) this.f210615b).get(k[length]);
            if (d0Var != null) {
                if (!(d0Var.f232056r != 0)) {
                    break;
                }
                favorPayInfo.f209525e = 1;
                LinkedList<C89349b> linkedList = d0Var.f232060v;
                if (linkedList != null && linkedList.size() > 0) {
                    favorPayInfo.f209529i = new LinkedList();
                    Iterator<C89349b> it = d0Var.f232060v.iterator();
                    while (it.hasNext()) {
                        favorPayInfo.f209529i.add(C48374j0.m53713b(it.next()));
                    }
                }
                if (!Util.isNullOrNil(d0Var.f232057s)) {
                    favorPayInfo.f209526f = d0Var.f232057s;
                    break;
                }
            }
            length--;
        }
        return favorPayInfo;
    }

    /* renamed from: i */
    public List<C79030d0> mo99772i() {
        ArrayList<Bankcard> a = ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91319a(true);
        HashMap hashMap = new HashMap();
        for (int i = 0; i < a.size(); i++) {
            hashMap.put(a.get(i).field_bankcardType, 0);
        }
        LinkedList linkedList = new LinkedList();
        LinkedList<C79030d0> linkedList2 = this.f210614a.f232072h;
        if (linkedList2 != null) {
            for (int i2 = 0; i2 < linkedList2.size(); i2++) {
                C79030d0 d0Var = linkedList2.get(i2);
                if (d0Var != null) {
                    if (d0Var.f232056r != 0) {
                        if (hashMap.containsKey(d0Var.f232057s) || Util.isNullOrNil(d0Var.f232057s)) {
                            linkedList.add(d0Var);
                        }
                    }
                }
                linkedList.add(d0Var);
            }
        }
        return linkedList;
    }
}
