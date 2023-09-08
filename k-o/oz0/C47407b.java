package oz0;

import android.content.Context;
import android.database.Cursor;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.storage.C72994y1;
import d62.C75339i;
import di3.C86312j;
import dz0.C20483c;
import f40.C86709a0;
import hz0.C46141c;
import hz0.C46153l0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import pz0.C47721j;
import pz0.C47722k;
import pz0.C47723l;
import pz0.C47724o;
import pz0.C47725q;
import wz0.C53268s;

/* renamed from: oz0.b */
public class C47407b {

    /* renamed from: b */
    public static boolean f127188b;

    /* renamed from: c */
    public static boolean f127189c;

    /* renamed from: a */
    public Context f127190a;

    /* renamed from: oz0.b$a */
    public class C47408a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f127191d;

        /* renamed from: e */
        public final /* synthetic */ MMHandler f127192e;

        /* renamed from: oz0.b$a$a */
        public class C47409a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ ArrayList f127193d;

            public C47409a(ArrayList arrayList) {
                this.f127193d = arrayList;
            }

            public void run() {
                Map map = (Map) C46153l0.yx0().mo71382a("key_share_user_info_map");
                if (map == null) {
                    map = new HashMap();
                }
                map.put(C47408a.this.f127191d, this.f127193d);
                C46153l0.yx0().mo71383b("key_share_user_info_map", map);
            }
        }

        public C47408a(String str, MMHandler mMHandler) {
            this.f127191d = str;
            this.f127192e = mMHandler;
        }

        public void run() {
            Log.m105924i("MicroMsg.ShareCardDataMgr", "begin to getShareUserInfo()");
            C47721j Lx0 = C46153l0.Lx0();
            String str = this.f127191d;
            Lx0.getClass();
            Log.m105924i("MicroMsg.ShareCardInfoStorage", "getShareUserInfo()");
            StringBuilder sb = new StringBuilder();
            sb.append(" where ( status=0) ");
            sb.append(" AND (card_tp_id = '" + str + "' )");
            sb.append(" order by share_time desc ");
            ArrayList arrayList = null;
            Cursor rawQuery = Lx0.f128213d.rawQuery("select * from ShareCardInfo" + sb.toString(), (String[]) null, 2);
            if (rawQuery == null) {
                Log.m105924i("MicroMsg.ShareCardInfoStorage", "getShareUserInfo(), cursor == null");
            } else {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                while (rawQuery.moveToNext()) {
                    ShareCardInfo shareCardInfo = new ShareCardInfo();
                    shareCardInfo.convertFrom(rawQuery);
                    if (!arrayList3.contains(shareCardInfo.field_from_username)) {
                        C47725q qVar = new C47725q();
                        qVar.f128230b = shareCardInfo.field_card_tp_id;
                        qVar.f128229a = shareCardInfo.field_from_username;
                        ArrayList<String> arrayList4 = new ArrayList<>();
                        qVar.f128232d = arrayList4;
                        arrayList4.add(shareCardInfo.field_card_id);
                        qVar.f128231c = 1;
                        arrayList2.add(qVar);
                        arrayList3.add(shareCardInfo.field_from_username);
                    } else {
                        C47725q qVar2 = null;
                        int i = 0;
                        while (true) {
                            if (i >= arrayList2.size()) {
                                i = 0;
                                break;
                            }
                            qVar2 = (C47725q) arrayList2.get(i);
                            String str2 = shareCardInfo.field_from_username;
                            if (str2 != null && str2.equals(qVar2.f128229a)) {
                                break;
                            }
                            i++;
                        }
                        if (qVar2 != null) {
                            qVar2.f128232d.add(0, shareCardInfo.field_card_id);
                            qVar2.f128231c++;
                            arrayList2.set(i, qVar2);
                        }
                    }
                }
                rawQuery.close();
                arrayList = arrayList2;
            }
            Log.m105924i("MicroMsg.ShareCardDataMgr", "end to getShareUserInfo(), 1");
            if (arrayList == null || arrayList.size() == 0) {
                Log.m105920e("MicroMsg.ShareCardDataMgr", "getShareUserInfo(), share_user_list is null");
                return;
            }
            if (arrayList.get(0) != null) {
                ((C47725q) arrayList.get(0)).f128233e = true;
            }
            Log.m105924i("MicroMsg.ShareCardDataMgr", "end to getShareUserInfo(), 2");
            this.f127192e.post(new C47409a(arrayList));
        }
    }

    public C47407b(Context context) {
        this.f127190a = context;
        f127189c = false;
    }

    /* renamed from: a */
    public static boolean m52739a(int i) {
        ArrayList arrayList;
        Integer num = (Integer) C46153l0.yx0().mo71382a("key_share_card_show_type");
        if (num == null || num.intValue() == 0) {
            return false;
        }
        if (i != 0) {
            return (i != 10 || (arrayList = (ArrayList) C46153l0.yx0().mo71382a("key_share_card_local_city_ids")) == null || arrayList.size() == 0) ? false : true;
        }
        ArrayList arrayList2 = (ArrayList) C46153l0.yx0().mo71382a("key_share_card_other_city_ids");
        return (arrayList2 == null || arrayList2.size() == 0) ? false : true;
    }

    /* renamed from: b */
    public static boolean m52740b() {
        ArrayList arrayList = (ArrayList) C46153l0.yx0().mo71382a("key_share_card_local_city_ids");
        return arrayList != null && arrayList.size() > 0;
    }

    /* renamed from: c */
    public static boolean m52741c() {
        ArrayList arrayList = (ArrayList) C46153l0.yx0().mo71382a("key_share_card_other_city_ids");
        return arrayList != null && arrayList.size() > 0;
    }

    /* renamed from: d */
    public static int m52742d(String str) {
        Integer num;
        Map map = (Map) C46153l0.yx0().mo71382a("key_share_card_count_map");
        if (map == null || (num = (Integer) map.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: e */
    public static ArrayList<String> m52743e(int i) {
        if (i == 1) {
            ArrayList<String> arrayList = (ArrayList) C46153l0.yx0().mo71382a("key_share_card_local_city_ids");
            if (arrayList != null && arrayList.size() != 0) {
                return arrayList;
            }
            Log.m105920e("MicroMsg.ShareCardDataMgr", "getCardIds() ids == null || ids.size() == 0 for showType == " + i);
            return m52744f(i);
        } else if (i != 2) {
            return null;
        } else {
            ArrayList<String> arrayList2 = (ArrayList) C46153l0.yx0().mo71382a("key_share_card_other_city_ids");
            if (arrayList2 != null && arrayList2.size() != 0) {
                return arrayList2;
            }
            Log.m105920e("MicroMsg.ShareCardDataMgr", "getCardIds() ids == null || ids.size() == 0 for showType == " + i);
            return m52744f(i);
        }
    }

    /* renamed from: f */
    public static ArrayList<String> m52744f(int i) {
        C47722k kVar = (C47722k) C46153l0.yx0().mo71382a("key_share_card_layout_data");
        if (kVar == null) {
            Log.m105920e("MicroMsg.ShareCardDataMgr", "getCardIdsByType() data == null for showType = " + i);
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        if (i == 1) {
            LinkedList<C47723l> linkedList = kVar.f128214a;
            if (linkedList != null && linkedList.size() > 0) {
                while (i2 < kVar.f128214a.size()) {
                    C47723l lVar = kVar.f128214a.get(i2);
                    if (!arrayList2.contains(lVar.f128224b)) {
                        String Yt = C46153l0.Lx0().mo72541Yt(lVar.f128224b);
                        if (!TextUtils.isEmpty(Yt) && !arrayList.contains(Yt)) {
                            arrayList.add(Yt);
                        } else if (!arrayList.contains(lVar.f128223a)) {
                            arrayList.add(lVar.f128223a);
                        }
                        arrayList2.add(lVar.f128224b);
                    }
                    i2++;
                }
                C46153l0.yx0().mo71383b("key_share_card_local_city_ids", arrayList);
            }
            return arrayList;
        } else if (i != 2) {
            return null;
        } else {
            LinkedList<C47723l> linkedList2 = kVar.f128215b;
            if (linkedList2 != null && linkedList2.size() > 0) {
                while (i2 < kVar.f128215b.size()) {
                    C47723l lVar2 = kVar.f128215b.get(i2);
                    if (!arrayList2.contains(lVar2.f128224b)) {
                        String Yt2 = C46153l0.Lx0().mo72541Yt(lVar2.f128224b);
                        if (!TextUtils.isEmpty(Yt2) && !arrayList.contains(Yt2)) {
                            arrayList.add(Yt2);
                        } else if (!arrayList.contains(lVar2.f128223a)) {
                            arrayList.add(lVar2.f128223a);
                        }
                        arrayList2.add(lVar2.f128224b);
                    }
                    i2++;
                }
                C46153l0.yx0().mo71383b("key_share_card_other_city_ids", arrayList);
            }
            return arrayList;
        }
    }

    /* renamed from: h */
    public static ArrayList<C47725q> m52745h(String str) {
        Map map = (Map) C46153l0.yx0().mo71382a("key_share_user_info_map");
        if (map == null) {
            map = new HashMap();
        }
        ArrayList<C47725q> arrayList = (ArrayList) map.get(str);
        return arrayList == null ? new ArrayList<>() : arrayList;
    }

    /* renamed from: i */
    public static String m52746i(Context context, ArrayList<String> arrayList, int i) {
        Class cls = C75339i.class;
        if (arrayList == null || arrayList.size() == 0) {
            Log.m105920e("MicroMsg.ShareCardDataMgr", "getShareUserName， username_list == null || username_list.size() == 0");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < arrayList.size() && i2 < 2) {
            if (i2 != 0) {
                sb.append("、");
            }
            String Si = ((C75339i) C86312j.m106911c(cls)).mo62515Si(arrayList.get(i2));
            String displayName = ((C75339i) C86312j.m106911c(cls)).getDisplayName(arrayList.get(i2));
            if (!TextUtils.isEmpty(Si)) {
                sb.append(Si);
            } else {
                sb.append(displayName);
            }
            i2++;
        }
        if (context == null) {
            Log.m105920e("MicroMsg.ShareCardDataMgr", "context == null");
            return "";
        } else if (arrayList.size() == 1 || arrayList.size() == 2) {
            return context.getString(C0966R.string.b1b, new Object[]{sb.toString()});
        } else {
            return context.getString(C0966R.string.b0t, new Object[]{sb.toString(), Integer.valueOf(arrayList.size())});
        }
    }

    /* renamed from: m */
    public static boolean m52747m(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        ArrayList arrayList = (ArrayList) C46153l0.yx0().mo71382a("key_share_card_other_city_top_info_list");
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C47724o oVar = (C47724o) it.next();
            if (oVar != null && str.equals(oVar.f128227a) && oVar.f128228b == 1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public static void m52748p(Context context, C20483c cVar) {
        Log.m105924i("MicroMsg.ShareCardDataMgr", "updateShareCardData()");
        Log.m105924i("MicroMsg.ShareCardDataMgr", "card id:" + cVar.getCardId() + " cardtpid:" + cVar.mo23270R0());
        String cardId = cVar.getCardId();
        String R0 = cVar.mo23270R0();
        if (f127188b) {
            Log.m105924i("MicroMsg.ShareCardDataMgr", "is isUpdating data, don't do updateCardIdsListByCardId");
        } else {
            Log.m105924i("MicroMsg.ShareCardDataMgr", "do updateCardIdsListByCardId");
            f127188b = true;
            ArrayList<String> e = m52743e(1);
            if (e != null && e.contains(cardId)) {
                e.remove(cardId);
                String bD = C46153l0.Lx0().mo72542bD(cardId, R0);
                if (!TextUtils.isEmpty(bD)) {
                    e.add(bD);
                }
                C46153l0.yx0().mo71383b("key_share_card_local_city_ids", e);
            }
            ArrayList<String> e2 = m52743e(2);
            if (e2 != null && e2.contains(cardId)) {
                e2.remove(cardId);
                String bD2 = C46153l0.Lx0().mo72542bD(cardId, R0);
                if (!TextUtils.isEmpty(bD2)) {
                    e2.add(bD2);
                }
                C46153l0.yx0().mo71383b("key_share_card_other_city_ids", e2);
            }
            f127188b = false;
        }
        if (context != null) {
            String R02 = cVar.mo23270R0();
            Log.m105924i("MicroMsg.ShareCardDataMgr", "updateCardCountbyCardTpId() card_tp_id:" + R02);
            Map map = (Map) C46153l0.yx0().mo71382a("key_share_card_count_map");
            if (map == null) {
                map = new HashMap();
            }
            Map map2 = (Map) C46153l0.yx0().mo71382a("key_share_card_username_map");
            if (map2 == null) {
                map2 = new HashMap();
            }
            int qq = C46153l0.Lx0().mo72545qq(R02);
            map.put(R02, Integer.valueOf(qq));
            map2.put(R02, m52746i(context, C46153l0.Lx0().mo72539Ow(R02, 99), qq));
            C46153l0.yx0().mo71383b("key_share_card_count_map", map);
            C46153l0.yx0().mo71383b("key_share_card_username_map", map2);
        }
        String cardId2 = cVar.getCardId();
        String R03 = cVar.mo23270R0();
        String e3 = cVar.mo23280e();
        Map map3 = (Map) C46153l0.yx0().mo71382a("key_share_user_info_map");
        if (map3 == null) {
            map3 = new HashMap();
        }
        ArrayList arrayList = (ArrayList) map3.get(R03);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        for (int i = 0; i < arrayList.size(); i++) {
            C47725q qVar = (C47725q) arrayList.get(i);
            if (e3 != null && e3.equals(qVar.f128229a)) {
                qVar.f128233e = false;
                qVar.f128231c--;
                qVar.f128232d.remove(cardId2);
                arrayList.set(i, qVar);
            }
        }
        map3.put(R03, arrayList);
        C46153l0.yx0().mo71383b("key_share_user_info_map", map3);
        m52749r(cVar.mo23270R0());
    }

    /* renamed from: r */
    public static void m52749r(String str) {
        Log.m105924i("MicroMsg.ShareCardDataMgr", "updateShareUserInfo()");
        if (TextUtils.isEmpty(str)) {
            Log.m105920e("MicroMsg.ShareCardDataMgr", "updateShareUserInfo(), card_tp_id is empty");
        } else {
            ThreadPool.post(new C47408a(str, new MMHandler(Looper.getMainLooper())), "updateShareUserInfo_thread");
        }
    }

    /* renamed from: g */
    public int mo72437g() {
        C46141c Gx0 = C46153l0.Gx0();
        Gx0.getClass();
        Cursor rawQuery = Gx0.f124344d.rawQuery("select count(*) from UserCardInfo where (status=0 OR status=5) AND card_type=10", (String[]) null, 2);
        int i = 0;
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                i = rawQuery.getInt(0);
            }
            rawQuery.close();
        }
        return i;
    }

    /* renamed from: j */
    public void mo72438j() {
        if (((C47722k) C46153l0.yx0().mo71382a("key_share_card_layout_data")) == null) {
            Log.m105920e("MicroMsg.ShareCardDataMgr", "initShareCardLayoutData, data cache is empty!, load data from db!");
            String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_SHARECARD_LAYOUT_JSON_STRING_SYNC, "");
            if (TextUtils.isEmpty(str)) {
                Log.m105920e("MicroMsg.ShareCardDataMgr", "initShareCardLayoutData, json is empty");
                return;
            }
            C47722k b = C53268s.m59709b(str);
            if (b != null) {
                Log.m105924i("MicroMsg.ShareCardDataMgr", "load share card layout data success!");
                C46153l0.yx0().mo71383b("key_share_card_layout_data", b);
                mo72441n(b, true);
                return;
            }
            Log.m105920e("MicroMsg.ShareCardDataMgr", "load share card layout data fail!");
            return;
        }
        Log.m105924i("MicroMsg.ShareCardDataMgr", "the share card layout cache is valid!");
    }

    /* renamed from: k */
    public boolean mo72439k() {
        C47722k kVar = (C47722k) C46153l0.yx0().mo71382a("key_share_card_layout_data");
        if (kVar == null) {
            return true;
        }
        return kVar.f128217d;
    }

    /* renamed from: l */
    public boolean mo72440l() {
        C47722k kVar = (C47722k) C46153l0.yx0().mo71382a("key_share_card_layout_data");
        if (kVar == null) {
            return true;
        }
        return kVar.f128218e;
    }

    /* renamed from: n */
    public final void mo72441n(C47722k kVar, boolean z) {
        String str;
        C47722k kVar2 = kVar;
        if (kVar2 == null) {
            Log.m105920e("MicroMsg.ShareCardDataMgr", "don't parserShareCardListData, data is null");
            return;
        }
        Log.m105924i("MicroMsg.ShareCardDataMgr", "parserShareCardListData()");
        String str2 = "key_share_card_annoucement_map";
        Map map = (Map) C46153l0.yx0().mo71382a(str2);
        if (map == null) {
            map = new HashMap();
        }
        String str3 = "key_share_card_count_map";
        Map map2 = (Map) C46153l0.yx0().mo71382a(str3);
        if (map2 == null) {
            map2 = new HashMap();
        }
        String str4 = "key_share_card_username_map";
        Map map3 = (Map) C46153l0.yx0().mo71382a(str4);
        if (map3 == null) {
            map3 = new HashMap();
        }
        String str5 = "key_share_card_local_city_ids";
        ArrayList arrayList = (ArrayList) C46153l0.yx0().mo71382a(str5);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        String str6 = "key_share_card_other_city_ids";
        ArrayList arrayList2 = (ArrayList) C46153l0.yx0().mo71382a(str6);
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        ArrayList arrayList3 = (ArrayList) C46153l0.yx0().mo71382a("key_share_card_other_city_top_info_list");
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
        }
        if (z) {
            arrayList.clear();
            arrayList2.clear();
            arrayList3.clear();
        }
        ArrayList arrayList4 = new ArrayList();
        LinkedList<C47723l> linkedList = kVar2.f128214a;
        String str7 = "key_share_card_other_city_top_info_list";
        if (linkedList != null && linkedList.size() > 0) {
            int i = 0;
            while (i < kVar2.f128214a.size()) {
                C47723l lVar = kVar2.f128214a.get(i);
                String str8 = str6;
                if (!TextUtils.isEmpty(lVar.f128225c)) {
                    str = str5;
                    map.put(lVar.f128224b, lVar.f128225c);
                } else {
                    str = str5;
                }
                int qq = C46153l0.Lx0().mo72545qq(lVar.f128224b);
                String str9 = str4;
                map2.put(lVar.f128224b, Integer.valueOf(qq));
                String str10 = str3;
                String str11 = str2;
                map3.put(lVar.f128224b, m52746i(this.f127190a, C46153l0.Lx0().mo72539Ow(lVar.f128224b, 99), qq));
                if (!arrayList4.contains(lVar.f128224b)) {
                    String Yt = C46153l0.Lx0().mo72541Yt(lVar.f128224b);
                    if (!TextUtils.isEmpty(Yt) && !arrayList.contains(Yt)) {
                        arrayList.add(Yt);
                    } else if (!arrayList.contains(lVar.f128223a)) {
                        arrayList.add(lVar.f128223a);
                    }
                    arrayList4.add(lVar.f128224b);
                    C47724o oVar = new C47724o();
                    oVar.f128227a = lVar.f128224b;
                    oVar.f128228b = lVar.f128226d;
                    arrayList3.add(oVar);
                }
                i++;
                str6 = str8;
                str5 = str;
                str4 = str9;
                str3 = str10;
                str2 = str11;
            }
        }
        String str12 = str2;
        String str13 = str3;
        String str14 = str4;
        String str15 = str5;
        String str16 = str6;
        arrayList4.clear();
        LinkedList<C47723l> linkedList2 = kVar2.f128215b;
        if (linkedList2 != null && linkedList2.size() > 0) {
            for (int i2 = 0; i2 < kVar2.f128215b.size(); i2++) {
                C47723l lVar2 = kVar2.f128215b.get(i2);
                if (!TextUtils.isEmpty(lVar2.f128225c)) {
                    map.put(lVar2.f128224b, lVar2.f128225c);
                }
                int qq4 = C46153l0.Lx0().mo72545qq(lVar2.f128224b);
                map2.put(lVar2.f128224b, Integer.valueOf(qq4));
                map3.put(lVar2.f128224b, m52746i(this.f127190a, C46153l0.Lx0().mo72539Ow(lVar2.f128224b, 99), qq4));
                if (!arrayList4.contains(lVar2.f128224b)) {
                    String Yt2 = C46153l0.Lx0().mo72541Yt(lVar2.f128224b);
                    if (!TextUtils.isEmpty(Yt2) && !arrayList2.contains(Yt2)) {
                        arrayList2.add(Yt2);
                    } else if (!arrayList2.contains(lVar2.f128223a)) {
                        arrayList2.add(lVar2.f128223a);
                    }
                    arrayList4.add(lVar2.f128224b);
                    C47724o oVar2 = new C47724o();
                    oVar2.f128227a = lVar2.f128224b;
                    oVar2.f128228b = lVar2.f128226d;
                    arrayList3.add(oVar2);
                }
            }
        }
        C46153l0.yx0().mo71383b(str12, map);
        C46153l0.yx0().mo71383b(str13, map2);
        C46153l0.yx0().mo71383b(str14, map3);
        C46153l0.yx0().mo71383b("key_share_card_local_city", kVar2.f128216c);
        C46153l0.yx0().mo71383b(str15, arrayList);
        C46153l0.yx0().mo71383b(str16, arrayList2);
        C46153l0.yx0().mo71383b(str7, arrayList3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0075, code lost:
        r9 = r1.f128214a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0165 A[ADDED_TO_REGION] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72442o(pz0.C47722k r20, pz0.C47722k r21, boolean r22) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            java.lang.String r2 = "MicroMsg.ShareCardDataMgr"
            if (r0 != 0) goto L_0x0010
            if (r1 != 0) goto L_0x0010
            java.lang.String r0 = "don't updateCategoryType(), newData == null && oldData == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            return
        L_0x0010:
            if (r0 == 0) goto L_0x002a
            java.util.LinkedList<pz0.l> r3 = r0.f128215b
            if (r3 != 0) goto L_0x002a
            java.util.LinkedList<pz0.l> r3 = r0.f128214a
            if (r3 != 0) goto L_0x002a
            if (r1 == 0) goto L_0x002a
            java.util.LinkedList<pz0.l> r3 = r1.f128215b
            if (r3 != 0) goto L_0x002a
            java.util.LinkedList<pz0.l> r3 = r1.f128214a
            if (r3 != 0) goto L_0x002a
            java.lang.String r0 = "don't updateCategoryType(), newData.local_city_list == null && oldData.local_city_list == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            return
        L_0x002a:
            java.lang.String r3 = "updateCategoryType()"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            gz0.f r3 = hz0.C46153l0.yx0()
            java.lang.String r4 = "key_share_card_local_city_category_info_list"
            java.lang.Object r3 = r3.mo71382a(r4)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            if (r3 != 0) goto L_0x0043
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x0043:
            gz0.f r5 = hz0.C46153l0.yx0()
            java.lang.String r6 = "key_share_card_other_city_category_info_list"
            java.lang.Object r5 = r5.mo71382a(r6)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            if (r5 != 0) goto L_0x0056
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x0056:
            r7 = 10
            r8 = 0
            if (r22 == 0) goto L_0x0073
            pz0.j r9 = hz0.C46153l0.Lx0()
            r10 = 0
            r9.mo72544kD(r10, r7)
            r3.clear()
            pz0.j r9 = hz0.C46153l0.Lx0()
            r9.mo72544kD(r10, r8)
            r5.clear()
            r9 = 0
        L_0x0071:
            r10 = 0
            goto L_0x0099
        L_0x0073:
            if (r1 == 0) goto L_0x0086
            java.util.LinkedList<pz0.l> r9 = r1.f128214a
            if (r9 == 0) goto L_0x0086
            int r9 = r9.size()
            if (r9 < 0) goto L_0x0086
            java.util.LinkedList<pz0.l> r9 = r1.f128214a
            int r9 = r9.size()
            goto L_0x0087
        L_0x0086:
            r9 = 0
        L_0x0087:
            if (r1 == 0) goto L_0x0071
            java.util.LinkedList<pz0.l> r10 = r1.f128215b
            if (r10 == 0) goto L_0x0071
            int r10 = r10.size()
            if (r10 < 0) goto L_0x0071
            java.util.LinkedList<pz0.l> r10 = r1.f128215b
            int r10 = r10.size()
        L_0x0099:
            long r11 = java.lang.System.currentTimeMillis()
            f40.o r13 = f40.C86709a0.m107535s()
            zh3.f r13 = r13.f251811i
            java.lang.Thread r14 = java.lang.Thread.currentThread()
            long r14 = r14.getId()
            long r13 = r13.beginTransaction(r14)
            if (r0 == 0) goto L_0x0106
            java.util.LinkedList<pz0.l> r15 = r0.f128214a
            if (r15 == 0) goto L_0x0106
            int r15 = r15.size()
            if (r15 <= 0) goto L_0x0106
            r15 = 0
        L_0x00bc:
            java.util.LinkedList<pz0.l> r8 = r0.f128214a
            int r8 = r8.size()
            if (r15 >= r8) goto L_0x00f4
            java.util.LinkedList<pz0.l> r8 = r0.f128214a
            java.lang.Object r8 = r8.get(r15)
            pz0.l r8 = (pz0.C47723l) r8
            pz0.j r7 = hz0.C46153l0.Lx0()
            r16 = r2
            java.lang.String r2 = r8.f128224b
            r17 = r11
            int r11 = r15 + r9
            r12 = 10
            r7.mo72540SE(r2, r12, r11)
            pz0.h r2 = new pz0.h
            r2.<init>()
            java.lang.String r7 = r8.f128224b
            r2.f128210a = r7
            r2.f128211b = r11
            r3.add(r2)
            int r15 = r15 + 1
            r2 = r16
            r11 = r17
            r7 = 10
            goto L_0x00bc
        L_0x00f4:
            r16 = r2
            r17 = r11
            if (r22 != 0) goto L_0x0116
            if (r1 == 0) goto L_0x0116
            java.util.LinkedList<pz0.l> r2 = r1.f128214a
            if (r2 == 0) goto L_0x0116
            java.util.LinkedList<pz0.l> r7 = r0.f128214a
            r7.addAll(r2)
            goto L_0x0116
        L_0x0106:
            r16 = r2
            r17 = r11
            if (r0 == 0) goto L_0x0116
            if (r22 != 0) goto L_0x0116
            if (r1 == 0) goto L_0x0116
            java.util.LinkedList<pz0.l> r2 = r1.f128214a
            if (r2 == 0) goto L_0x0116
            r0.f128214a = r2
        L_0x0116:
            gz0.f r2 = hz0.C46153l0.yx0()
            r2.mo71383b(r4, r3)
            if (r0 == 0) goto L_0x0165
            java.util.LinkedList<pz0.l> r2 = r0.f128215b
            if (r2 == 0) goto L_0x0165
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x0165
            r2 = 0
        L_0x012a:
            java.util.LinkedList<pz0.l> r3 = r0.f128215b
            int r3 = r3.size()
            if (r2 >= r3) goto L_0x0157
            java.util.LinkedList<pz0.l> r3 = r0.f128215b
            java.lang.Object r3 = r3.get(r2)
            pz0.l r3 = (pz0.C47723l) r3
            pz0.j r4 = hz0.C46153l0.Lx0()
            java.lang.String r7 = r3.f128224b
            int r8 = r2 + r10
            r9 = 0
            r4.mo72540SE(r7, r9, r8)
            pz0.h r4 = new pz0.h
            r4.<init>()
            java.lang.String r3 = r3.f128224b
            r4.f128210a = r3
            r4.f128211b = r8
            r5.add(r4)
            int r2 = r2 + 1
            goto L_0x012a
        L_0x0157:
            if (r22 != 0) goto L_0x0171
            if (r1 == 0) goto L_0x0171
            java.util.LinkedList<pz0.l> r1 = r1.f128215b
            if (r1 == 0) goto L_0x0171
            java.util.LinkedList<pz0.l> r0 = r0.f128215b
            r0.addAll(r1)
            goto L_0x0171
        L_0x0165:
            if (r0 == 0) goto L_0x0171
            if (r22 != 0) goto L_0x0171
            if (r1 == 0) goto L_0x0171
            java.util.LinkedList<pz0.l> r1 = r1.f128215b
            if (r1 == 0) goto L_0x0171
            r0.f128215b = r1
        L_0x0171:
            gz0.f r0 = hz0.C46153l0.yx0()
            r0.mo71383b(r6, r5)
            f40.o r0 = f40.C86709a0.m107535s()
            zh3.f r0 = r0.f251811i
            r0.endTransaction(r13)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r17
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "updateCategoryType  >> updateCategoryInfo use time %s"
            r2 = r16
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oz0.C47407b.mo72442o(pz0.k, pz0.k, boolean):void");
    }

    /* renamed from: q */
    public void mo72443q(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            Log.m105920e("MicroMsg.ShareCardDataMgr", "updateGetShareLayoutData json is empty");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C47722k b = C53268s.m59709b(str);
        C47722k kVar = (C47722k) C46153l0.yx0().mo71382a("key_share_card_layout_data");
        if (b == null) {
            Log.m105920e("MicroMsg.ShareCardDataMgr", "updateGetShareLayoutData data == null");
            mo72442o(b, kVar, z);
            C46153l0.yx0().mo71383b("key_share_card_layout_data", b);
            return;
        }
        if (z) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_CARD_SHARECARD_LAYOUT_JSON_STRING_SYNC, str);
        }
        mo72441n(b, z);
        mo72442o(b, kVar, z);
        C46153l0.yx0().mo71383b("key_share_card_layout_data", b);
        int i = 0;
        LinkedList<C47723l> linkedList = b.f128214a;
        if (linkedList != null && linkedList.size() > 0) {
            i = b.f128214a.size();
        }
        LinkedList<C47723l> linkedList2 = b.f128215b;
        if (linkedList2 != null && linkedList2.size() > 0) {
            i += b.f128215b.size();
        }
        if (i > 0) {
            int currentTimeMillis2 = (int) (System.currentTimeMillis() - currentTimeMillis);
            ArrayList arrayList = new ArrayList();
            IDKey iDKey = new IDKey();
            iDKey.SetID(281);
            iDKey.SetKey(10);
            iDKey.SetValue(1);
            IDKey iDKey2 = new IDKey();
            iDKey2.SetID(281);
            iDKey2.SetKey(11);
            iDKey2.SetValue((long) currentTimeMillis2);
            IDKey iDKey3 = new IDKey();
            iDKey3.SetID(281);
            iDKey3.SetKey(12);
            iDKey3.SetValue((long) i);
            IDKey iDKey4 = new IDKey();
            iDKey4.SetID(281);
            iDKey4.SetKey(14);
            iDKey4.SetValue((long) (currentTimeMillis2 / i));
            arrayList.add(iDKey);
            arrayList.add(iDKey2);
            arrayList.add(iDKey3);
            arrayList.add(iDKey4);
            C115669n.INSTANCE.mo160124a(arrayList, true);
        }
    }
}
