package wz0;

import a22.C67001a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import b22.C28250a;
import b22.C28251b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SendMsgEvent;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.card.model.CardInfo;
import com.tencent.p014mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.C85801v1;
import d62.C75339i;
import di3.C86312j;
import dz0.C20483c;
import eb0.C45628s0;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import fz0.C98061b;
import hz0.C21034b;
import hz0.C46153l0;
import hz0.C76251l;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import nj3.C76879j;
import org.json.JSONObject;
import oz0.C47407b;
import p755xs.C102720b;
import p910lj.C76701a;
import pz0.C47721j;
import pz0.C47722k;
import pz0.C47723l;
import te3.C22498fy;
import te3.C22534xo;
import te3.n44;

/* renamed from: wz0.n */
public class C22945n {

    /* renamed from: a */
    public static SimpleDateFormat f65914a;

    /* renamed from: A */
    public static boolean m26988A() {
        Integer num = (Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_IS_SHARE_CARD_ENTRANCE_OPEN_INT_SYNC, (Object) null);
        return num != null && num.intValue() == 1;
    }

    /* renamed from: B */
    public static boolean m26989B(int i) {
        return i == 0 || i == 20 || i == 30 || i == 10 || i == 11;
    }

    /* renamed from: C */
    public static boolean m26990C(C22498fy fyVar, String str) {
        boolean z;
        if ((fyVar.f63888h & 8) > 0) {
            Log.m105924i("MicroMsg.CardUtil", "shouldShowWarning show the warning!");
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Log.m105924i("MicroMsg.CardUtil", "ShowWarning not support show the warning!");
            return false;
        } else if (m27019s(str, fyVar.f63884d)) {
            Log.m105924i("MicroMsg.CardUtil", "ShowWarning has show the warning!");
            return false;
        } else {
            Log.m105924i("MicroMsg.CardUtil", "ShowWarning has not show the warning!");
            return true;
        }
    }

    /* renamed from: D */
    public static String m26991D(Context context, float f) {
        if (f <= 0.0f) {
            return "";
        }
        if (f > 0.0f && f < 1000.0f) {
            return context.getString(C0966R.string.awx, new Object[]{"" + ((int) f)});
        } else if (f < 1000.0f) {
            return "";
        } else {
            return context.getString(C0966R.string.aww, new Object[]{"" + new DecimalFormat("0.00").format((double) (f / 1000.0f))});
        }
    }

    /* renamed from: E */
    public static boolean m26992E(ShareCardInfo shareCardInfo) {
        ArrayList<String> e;
        int i = 0;
        if (shareCardInfo == null) {
            Log.m105920e("MicroMsg.CardUtil", "processShareCardObject fail, card is null");
            return false;
        }
        C47721j Lx0 = C46153l0.Lx0();
        ShareCardInfo jo = Lx0.mo72543jo("" + shareCardInfo.field_card_id);
        if (jo == null) {
            boolean insert = C46153l0.Lx0().insert(shareCardInfo);
            Log.m105919d("MicroMsg.CardUtil", "processShareCardObject, insertRet = %b", Boolean.valueOf(insert));
            if (!insert) {
                Log.m105920e("MicroMsg.CardUtil", "processShareCardObject, insert fail");
            } else {
                String str = shareCardInfo.field_card_id;
                String str2 = shareCardInfo.field_card_tp_id;
                Log.m105924i("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId card_id:" + str + ", card_tp_id:" + str2);
                ArrayList<String> e2 = C47407b.m52743e(1);
                if ((e2 == null || !e2.contains(str)) && ((e = C47407b.m52743e(2)) == null || !e.contains(str))) {
                    C47722k kVar = (C47722k) C46153l0.yx0().mo71382a("key_share_card_layout_data");
                    if (kVar == null) {
                        Log.m105920e("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId data == null");
                    } else {
                        int qq = C46153l0.Lx0().mo72545qq(str2);
                        int d = C47407b.m52742d(str2);
                        Log.m105920e("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId realCount:" + qq + " cacheCount:" + d);
                        LinkedList<C47723l> linkedList = kVar.f128214a;
                        if (linkedList != null && linkedList.size() > 0 && (d <= 0 || qq == 1)) {
                            while (true) {
                                if (i >= kVar.f128214a.size()) {
                                    break;
                                }
                                C47723l lVar = kVar.f128214a.get(i);
                                if (str2 != null && str2.contains(lVar.f128224b)) {
                                    e2.add(str);
                                    C46153l0.yx0().mo71383b("key_share_card_local_city_ids", e2);
                                    Log.m105924i("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId add for local ids, card id is " + str);
                                    break;
                                }
                                i++;
                            }
                        } else {
                            Log.m105924i("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId, not add for local_ids");
                        }
                        if (e == null || (d > 0 && qq != 1)) {
                            Log.m105924i("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId, not add for other_ids");
                        } else {
                            e.add(str);
                            C46153l0.yx0().mo71383b("key_share_card_other_city_ids", e);
                            Log.m105924i("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId add for other ids, card id is " + str);
                        }
                    }
                }
            }
            return insert;
        }
        shareCardInfo.field_categoryType = jo.field_categoryType;
        shareCardInfo.field_itemIndex = jo.field_itemIndex;
        boolean update = C46153l0.Lx0().update(shareCardInfo, new String[0]);
        Log.m105919d("MicroMsg.CardUtil", "processShareCardObject, updateRet = %b", Boolean.valueOf(update));
        return update;
    }

    /* renamed from: F */
    public static void m26993F(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            Log.m105925i("MicroMsg.CardUtil", "bitmap recycle %s", bitmap);
            bitmap.recycle();
        }
    }

    /* renamed from: G */
    public static void m26994G(C20483c cVar, String str, String str2, int i, boolean z, boolean z2) {
        Class cls = C98061b.class;
        Bitmap N6 = ((C102720b) C86312j.m106911c(C102720b.class)).mo142104N6(new C76251l(cVar.mo23264L0().f64137e));
        byte[] Bitmap2Bytes = N6 != null ? BitmapUtil.Bitmap2Bytes(N6) : null;
        if (!z) {
            ((C98061b) C86312j.m106911c(cls)).mo106014y0(C22944i.m26985b(cVar, str2, i), cVar.mo23264L0().f64138f, cVar.mo23264L0().f64142j, str, (String) null, Bitmap2Bytes, z2);
        } else {
            ((C98061b) C86312j.m106911c(cls)).mo106013JX(C22944i.m26985b(cVar, str2, i), cVar.mo23264L0().f64138f, cVar.mo23264L0().f64142j, str, Bitmap2Bytes);
        }
    }

    /* renamed from: H */
    public static void m26995H(String str, String str2) {
        if (!Util.isNullOrNil(str)) {
            SendMsgEvent sendMsgEvent = new SendMsgEvent();
            SendMsgEvent.C1132a aVar = sendMsgEvent.f9496d;
            aVar.f9497a = str2;
            aVar.f9498b = str;
            aVar.f9499c = C45628s0.m50810y(str2);
            sendMsgEvent.f9496d.f9500d = 0;
            sendMsgEvent.publish();
        }
    }

    /* renamed from: I */
    public static void m26996I(ImageView imageView, String str) {
        Class cls = C102720b.class;
        ((C102720b) C86312j.m106911c(cls)).Lu0(new C78743m(str, imageView, false));
        Bitmap N6 = ((C102720b) C86312j.m106911c(cls)).mo142104N6(new C76251l(str));
        if (N6 != null) {
            imageView.setImageBitmap(N6);
        }
    }

    /* renamed from: J */
    public static void m26997J() {
        Integer num = (Integer) C86709a0.m107535s().mo121142i().mo119684e(282883, (Object) null);
        if (num == null || num.intValue() != 1) {
            Log.m105924i("MicroMsg.CardUtil", "open card entrance");
            C86709a0.m107535s().mo121142i().mo119676J(282883, 1);
            return;
        }
        Log.m105924i("MicroMsg.CardUtil", "card entrance is open");
    }

    /* renamed from: K */
    public static void m26998K() {
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_CARD_IS_SHARE_CARD_ENTRANCE_OPEN_INT_SYNC;
        Integer num = (Integer) i.mo119685f(aVar, 0);
        if (num == null || num.intValue() != 1) {
            Log.m105924i("MicroMsg.CardUtil", "open share card entrance");
            C86709a0.m107535s().mo121142i().mo119677K(aVar, 1);
            return;
        }
        Log.m105924i("MicroMsg.CardUtil", "share card entrance is open");
    }

    /* renamed from: L */
    public static void m26999L(String str, String str2) {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_CARD_SHOW_WARNING_CARD_IDS_STRING_SYNC;
        if (TextUtils.isEmpty(str)) {
            Log.m105920e("MicroMsg.CardUtil", "setShowWarningFlag card_id or title is empty!");
            return;
        }
        Log.m105924i("MicroMsg.CardUtil", "setShowWarningFlag()");
        String str3 = (String) C86709a0.m107535s().mo121142i().mo119685f(aVar, "");
        if (TextUtils.isEmpty(str3)) {
            Log.m105920e("MicroMsg.CardUtil", "hasShowTheWarning cardIdListStr list is empty!");
        } else {
            String[] split = str3.split(",");
            if (split == null || split.length == 0) {
                Log.m105920e("MicroMsg.CardUtil", "hasShowTheWarning cardIds is empty!");
                str3 = str;
            }
            boolean z = false;
            for (String equals : split) {
                if (str.equals(equals)) {
                    z = true;
                }
            }
            if (!z) {
                str = str3 + "," + str;
            } else {
                str = str3;
            }
        }
        C86709a0.m107535s().mo121142i().mo119677K(aVar, str);
    }

    /* renamed from: M */
    public static boolean m27000M(C20483c cVar) {
        boolean update;
        if (cVar instanceof CardInfo) {
            update = C46153l0.Gx0().update((CardInfo) cVar, new String[0]);
            if (!update) {
                Log.m105921e("MicroMsg.CardUtil", "update mCardInfo fail, cardId = %s", cVar.getCardId());
            }
        } else if (!(cVar instanceof ShareCardInfo)) {
            return false;
        } else {
            update = C46153l0.Lx0().update((ShareCardInfo) cVar, new String[0]);
            if (!update) {
                Log.m105921e("MicroMsg.CardUtil", "update mCardInfo fail, cardId = %s", cVar.getCardId());
            }
        }
        return update;
    }

    /* renamed from: a */
    public static int m27001a(int i, int i2) {
        return i2 <= 0 ? i : C74933u4.m89764a(i, i2);
    }

    /* renamed from: b */
    public static int m27002b(String str, int i) {
        return m27001a(Color.parseColor(str), i);
    }

    /* renamed from: c */
    public static List<C21034b> m27003c(List<C22534xo> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C22534xo xoVar = list.get(i);
            C21034b bVar = new C21034b();
            bVar.f64746d = xoVar.f64746d;
            bVar.f64747e = xoVar.f64747e;
            bVar.f64748f = xoVar.f64748f;
            bVar.f64749g = xoVar.f64749g;
            bVar.f64750h = xoVar.f64750h;
            bVar.f59502u = false;
            bVar.f64751i = xoVar.f64751i;
            bVar.f64752j = xoVar.f64752j;
            bVar.f64753n = xoVar.f64753n;
            bVar.f64754o = xoVar.f64754o;
            bVar.f64755p = xoVar.f64755p;
            bVar.f64756q = xoVar.f64756q;
            bVar.f64757r = xoVar.f64757r;
            bVar.f64758s = xoVar.f64758s;
            bVar.f59501t = 1;
            arrayList.add(bVar);
        }
        return arrayList;
    }

    /* renamed from: d */
    public static int m27004d(String str) {
        int rgb = Color.rgb(66, 66, 66);
        if (str == null || str.length() < 7 || !str.startsWith("#")) {
            Log.m105920e("MicroMsg.CardUtil", "string format error");
            return rgb;
        }
        try {
            String upperCase = str.substring(1).toUpperCase();
            return Color.argb(255, Integer.parseInt(upperCase.substring(0, 2), 16), Integer.parseInt(upperCase.substring(2, 4), 16), Integer.parseInt(upperCase.substring(4, 6), 16));
        } catch (Exception e) {
            Log.m105920e("MicroMsg.CardUtil", e.toString());
            return rgb;
        }
    }

    /* renamed from: e */
    public static int m27005e(String str, int i) {
        int rgb = Color.rgb(66, 66, 66);
        if (str == null || str.length() < 7 || !str.startsWith("#")) {
            Log.m105920e("MicroMsg.CardUtil", "string format error");
            return rgb;
        }
        try {
            String upperCase = str.substring(1).toUpperCase();
            return Color.argb(i, Integer.parseInt(upperCase.substring(0, 2), 16), Integer.parseInt(upperCase.substring(2, 4), 16), Integer.parseInt(upperCase.substring(4, 6), 16));
        } catch (Exception e) {
            Log.m105920e("MicroMsg.CardUtil", e.toString());
            return rgb;
        }
    }

    /* renamed from: f */
    public static String m27006f(long j) {
        long j2 = j * 1000;
        new GregorianCalendar().setTimeInMillis(j2);
        if (f65914a == null) {
            f65914a = new SimpleDateFormat("yyyy.MM.dd");
        }
        return f65914a.format(new Date(j2));
    }

    /* renamed from: g */
    public static String m27007g(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("EnterScene", i);
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: h */
    public static ArrayList<String> m27008h(List<String> list) {
        if (list == null || list.isEmpty()) {
            Log.m105920e("MicroMsg.CardUtil", "getContactIdsFromLabels labels is empty!");
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (String f : list) {
            String f2 = ((C67001a) C28250a.m38138a()).mo90968f(f);
            if (!TextUtils.isEmpty(f2)) {
                arrayList.add(f2);
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public static ArrayList<String> m27009i(List<String> list) {
        if (list == null || list.isEmpty()) {
            Log.m105920e("MicroMsg.CardUtil", "getContactNamesFromLabels labels is empty!");
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        HashSet hashSet = new HashSet();
        for (String f : list) {
            C28251b a = C28250a.m38138a();
            C67001a aVar = (C67001a) a;
            List k = aVar.mo90973k(((C67001a) C28250a.m38138a()).mo90968f(f));
            if (k == null || k.size() == 0) {
                Log.m105920e("MicroMsg.CardUtil", "getContactNamesFromLabels, namelist get bu label is null");
            } else {
                hashSet.addAll(k);
            }
        }
        arrayList.addAll(hashSet);
        return arrayList;
    }

    /* renamed from: j */
    public static String m27010j(String str) {
        List<String> asList = Arrays.asList(str.split(","));
        LinkedList linkedList = new LinkedList();
        if (!(!C86709a0.m107522a() || asList == null || asList.size() == 0)) {
            for (String str2 : asList) {
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str2);
                if (!(z1Var == null || ((int) z1Var.f108320R1) == 0)) {
                    str2 = z1Var.mo62898f();
                }
                linkedList.add(str2);
            }
        }
        return Util.listToString(linkedList, ",");
    }

    /* renamed from: k */
    public static String m27011k(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        float f = C46153l0.Jx0().f124036e;
        float f2 = C46153l0.Jx0().f124035d;
        if (f == -1000.0f || f2 == -85.0f) {
            Log.m105920e("MicroMsg.CardUtil", "getRedirectUrl() location info is empty!");
            return str;
        } else if ((j & 16) <= 0) {
            return str;
        } else {
            String replace = str.replace("#", ("&longitude=" + f + "&latitude=" + f2) + "#");
            Log.m105924i("MicroMsg.CardUtil", "getRedirectUrl originalUrl:" + str);
            Log.m105924i("MicroMsg.CardUtil", "getRedirectUrl afterwardsUrl:" + replace);
            return replace;
        }
    }

    /* renamed from: l */
    public static ShapeDrawable m27012l(Context context, int i, int i2) {
        float f = (float) i2;
        float[] fArr = {f, f, f, f, f, f, f, f};
        float dimensionPixelSize = (float) context.getResources().getDimensionPixelSize(C0966R.dimen.f3928j9);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, new RectF(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize), fArr));
        Paint paint = shapeDrawable.getPaint();
        paint.setColor(i);
        paint.setStrokeWidth(dimensionPixelSize);
        return shapeDrawable;
    }

    /* renamed from: m */
    public static ShapeDrawable m27013m(Context context, int i) {
        return m27014n(context, i, context.getResources().getDimensionPixelOffset(C0966R.dimen.f4210w9));
    }

    /* renamed from: n */
    public static ShapeDrawable m27014n(Context context, int i, int i2) {
        float f = (float) i2;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(i);
        return shapeDrawable;
    }

    /* renamed from: o */
    public static n44 m27015o(int i, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        Log.m105924i("MicroMsg.CardUtil", "getShareTag()");
        n44 n44 = new n44();
        if (i == 2) {
            if (arrayList != null && arrayList.size() > 0) {
                n44.f184433d.addAll(arrayList);
            }
            if (arrayList2 != null && arrayList2.size() > 0) {
                ArrayList arrayList3 = new ArrayList();
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    String str = arrayList2.get(i2);
                    if (!TextUtils.isEmpty(str) && m27025y(str)) {
                        arrayList3.add(Integer.valueOf(Util.getInt(str, 0)));
                    }
                }
                n44.f184435f.addAll(arrayList3);
            }
        } else if (i == 3) {
            if (arrayList != null && arrayList.size() > 0) {
                n44.f184434e.addAll(arrayList);
            }
            if (arrayList2 != null && arrayList2.size() > 0) {
                ArrayList arrayList4 = new ArrayList();
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    String str2 = arrayList2.get(i3);
                    if (!TextUtils.isEmpty(str2) && m27025y(str2)) {
                        arrayList4.add(Integer.valueOf(Util.getInt(str2, 0)));
                    }
                }
                n44.f184436g.addAll(arrayList4);
            }
        }
        return n44;
    }

    /* renamed from: p */
    public static String m27016p(String str) {
        Class cls = C75339i.class;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String Si = ((C75339i) C86312j.m106911c(cls)).mo62515Si(str);
        String displayName = ((C75339i) C86312j.m106911c(cls)).getDisplayName(str);
        return !TextUtils.isEmpty(Si) ? Si : !TextUtils.isEmpty(displayName) ? displayName : str;
    }

    /* renamed from: q */
    public static void m27017q(Context context, String str) {
        if (Util.isNullOrNil(str)) {
            str = context.getString(C0966R.string.b2c);
        }
        C76879j.m92712F(context, str, "", false);
    }

    /* renamed from: r */
    public static void m27018r(Context context, String str) {
        if (!Util.isNullOrNil(str)) {
            C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) str, 1).show();
        } else {
            C76879j.m92712F(context, context.getString(C0966R.string.b2c), "", false);
        }
    }

    /* renamed from: s */
    public static boolean m27019s(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            Log.m105920e("MicroMsg.CardUtil", "hasShowTheWarning card_id or title is empty!");
            return true;
        }
        Log.m105924i("MicroMsg.CardUtil", "hasShowWarning()");
        String str3 = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_SHOW_WARNING_CARD_IDS_STRING_SYNC, "");
        if (TextUtils.isEmpty(str3)) {
            Log.m105920e("MicroMsg.CardUtil", "hasShowTheWarning cardIdListStr list is empty!");
            return false;
        }
        String[] split = str3.split(",");
        if (split == null || split.length == 0) {
            Log.m105920e("MicroMsg.CardUtil", "hasShowTheWarning cardIds is empty!");
            return false;
        }
        for (String equals : split) {
            if (str.equals(equals)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: t */
    public static boolean m27020t() {
        Integer num = (Integer) C86709a0.m107535s().mo121142i().mo119684e(282883, (Object) null);
        return num != null && num.intValue() == 1;
    }

    /* renamed from: u */
    public static boolean m27021u(int i) {
        return i == 0 || i == 1 || i == 2 || i == 9 || i == 12 || i == 17 || i == 21;
    }

    /* renamed from: v */
    public static boolean m27022v(int i) {
        return i == 3 || i == 4 || i == 5 || i == 15;
    }

    /* renamed from: w */
    public static boolean m27023w(int i) {
        return i == 7 || i == 8 || i == 16 || i == 26;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r1 = r1.getActiveNetworkInfo();
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m27024x(android.content.Context r1) {
        /*
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r0 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            if (r1 == 0) goto L_0x0024
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()
            if (r1 == 0) goto L_0x0024
            boolean r0 = r1.isConnected()
            if (r0 == 0) goto L_0x0024
            android.net.NetworkInfo$State r1 = r1.getState()
            android.net.NetworkInfo$State r0 = android.net.NetworkInfo.State.CONNECTED
            if (r1 != r0) goto L_0x0024
            r1 = 1
            return r1
        L_0x0024:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wz0.C22945n.m27024x(android.content.Context):boolean");
    }

    /* renamed from: y */
    public static boolean m27025y(String str) {
        return Pattern.compile("[0-9]*").matcher(str).matches();
    }

    /* renamed from: z */
    public static int m27026z(String str) {
        return (TextUtils.isEmpty(str) || str.equals(C75592q0.m90789s())) ? 0 : 1;
    }
}
