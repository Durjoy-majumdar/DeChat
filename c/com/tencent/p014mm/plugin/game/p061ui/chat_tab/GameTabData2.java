package com.tencent.p014mm.plugin.game.p061ui.chat_tab;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.game.model.LocalHalfScreen;
import com.tencent.p014mm.plugin.game.model.LocalJumpInfo;
import com.tencent.p014mm.plugin.game.model.LocalTabCornerSetting;
import com.tencent.p014mm.plugin.game.model.WeAppJumpInfo;
import com.tencent.p014mm.pluginsdk.model.C44594n1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import py1.C47546a5;
import py1.C47621l3;
import py1.C47637n5;
import py1.C47691v4;
import py1.C47697w4;
import py1.C47703x4;
import py1.C47709y4;
import py1.C47713z2;
import py1.C47715z4;

/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2 */
public class GameTabData2 implements Parcelable {
    public static final Parcelable.Creator<GameTabData2> CREATOR = new C42262a();

    /* renamed from: h */
    public static final String f114261h = ("{\n        \"TabList\": [\n            {\n                \"Key\": \"home\",\n                \"Title\": \"首页\",\n                \"IconUrl\": \"https://mmgame.qpic.cn/image/4f72b9a4850edcba7ff71688b17233b8224fcc357e2357c9c09f74efc5fbb32c\",\n                \"SelectedIconUrl\": \"https://mmgame.qpic.cn/image/783ef37d09913c102b1647db4eefdce9823ed1351b850fcaf30650eec844cf82\",\n                \"DarkModeIconUrl\": \"https://mmgame.qpic.cn/image/b18f15fb59987306a116b4c04929e10cfe08da24ba2d3467043ae3b0a68cc598\",\n                \"DarkModeSelectedIconUrl\": \"https://mmgame.qpic.cn/image/783ef37d09913c102b1647db4eefdce9823ed1351b850fcaf30650eec844cf82\",\n                \"Type\": 2,\n                \"JumpUrl\": \"https://" + WeChatHosts.domainString(C0966R.string.flk) + "/cgi-bin/h5/static/contentcenter/feeds.html?wechat_pkgid=contentcenter_feeds&abt=59&ssid=901\"\n            },\n            {\n                \"Key\": \"gameindex\",\n                \"Title\": \"游戏\",\n                \"IconUrl\": \"https://mmgame.qpic.cn/image/3379a7e14dacfc6c9eea1cc3bce1abc681634348b2d10cb741402f0a7afe1b99\",\n                \"SelectedIconUrl\": \"https://mmgame.qpic.cn/image/d517ee0b80e2025c8e84c4247275ff9b52e8729c661b49556dc20cfbf717ef5a\",\n                \"DarkModeIconUrl\": \"https://mmgame.qpic.cn/image/e257a6c0d7dd13a2ec717ec5d370871f8624fed7fcf8bd0c9d3a29dee6d01d97\",\n                \"DarkModeSelectedIconUrl\": \"https://mmgame.qpic.cn/image/d517ee0b80e2025c8e84c4247275ff9b52e8729c661b49556dc20cfbf717ef5a\",\n                \"Type\": 2,\n                \"JumpUrl\": \"https://" + WeChatHosts.domainString(C0966R.string.flk) + "/cgi-bin/h5/static/contentcenter/game.html?wechat_pkgid=contentcenter_game&ssid=901\"\n            },\n            {\n                \"Key\": \"community\",\n                \"Title\": \"游戏圈\",\n                \"IconUrl\": \"https://mmgame.qpic.cn/image/090cb63e719dd5dee494f493d4dc7c767293046c8c37c3d620f3c426a4292806\",\n                \"SelectedIconUrl\": \"https://mmgame.qpic.cn/image/d78d45d5a0ff85d3fa7ef3012301b21e899408c71c9039ed0b7f32884033e329\",\n                \"DarkModeIconUrl\": \"https://mmgame.qpic.cn/image/3eea6be7fecf862137602860126a710860466bcb39f19a51d89664147c71aa3d\",\n                \"DarkModeSelectedIconUrl\": \"https://mmgame.qpic.cn/image/d78d45d5a0ff85d3fa7ef3012301b21e899408c71c9039ed0b7f32884033e329\",\n                \"Type\": 2,\n                \"JumpUrl\": \"https://" + WeChatHosts.domainString(C0966R.string.flk) + "/cgi-bin/h5/static/appcenter/community.html?wechat_pkgid=appcenter_community&ssid=901\"\n            },\n            {\n                \"Key\": \"chat\",\n                \"Title\": \"消息\",\n                \"IconUrl\": \"https://mmgame.qpic.cn/image/70b7e084e27150c4e606618d72b3afd1c474039fead8dadabf5a3438159d3cd5\",\n                \"SelectedIconUrl\": \"https://mmgame.qpic.cn/image/52ed44d8619a56364c712245b5426e4aed54091754fc174503f9114fb98d3256\",\n                \"DarkModeIconUrl\": \"https://mmgame.qpic.cn/image/6c4e9abf2c66d9b10e7a8a446a7285c89d0e577a6183eb222708d0cb9fc33bf3\",\n                \"DarkModeSelectedIconUrl\": \"https://mmgame.qpic.cn/image/52ed44d8619a56364c712245b5426e4aed54091754fc174503f9114fb98d3256\",\n                \"Type\": 1\n            }\n        ],\n        \"DefaultTab\": {\n            \"Key\": \"home\"\n        }\n    }");

    /* renamed from: d */
    public C42263b f114262d;

    /* renamed from: e */
    public String f114263e;

    /* renamed from: f */
    public String f114264f;

    /* renamed from: g */
    public String f114265g;

    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2$a */
    public class C42262a implements Parcelable.Creator<GameTabData2> {
        public Object createFromParcel(Parcel parcel) {
            return new GameTabData2(parcel, (C42262a) null);
        }

        public Object[] newArray(int i) {
            return new GameTabData2[i];
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2$b */
    public class C42263b extends LinkedHashMap<String, TabItem> {
        public C42263b(GameTabData2 gameTabData2) {
        }

        /* renamed from: a */
        public TabItem put(String str, TabItem tabItem) {
            tabItem.f114284x = size() + 1;
            return (TabItem) super.put(str, tabItem);
        }
    }

    public GameTabData2() {
        this.f114262d = new C42263b(this);
    }

    /* renamed from: c */
    public static boolean m45938c(GameTabData2 gameTabData2, C47691v4 v4Var) {
        if (v4Var == null || Util.isNullOrNil((List) v4Var.f128089d)) {
            return false;
        }
        gameTabData2.f114264f = v4Var.f128091f;
        gameTabData2.f114265g = v4Var.f128092g;
        Iterator<C47546a5> it = v4Var.f128089d.iterator();
        while (it.hasNext()) {
            TabItem tabItem = new TabItem(it.next());
            if (!Util.isNullOrNil(tabItem.f114267d)) {
                gameTabData2.f114262d.put(tabItem.f114267d, tabItem);
            }
        }
        if (gameTabData2.f114262d.size() == 0) {
            return false;
        }
        C47703x4 x4Var = v4Var.f128090e;
        String str = "";
        String nullAsNil = x4Var != null ? Util.nullAsNil(x4Var.f128149d) : str;
        if (gameTabData2.f114262d.containsKey(nullAsNil)) {
            gameTabData2.f114263e = nullAsNil;
            return true;
        }
        try {
            str = (String) ((Map.Entry) gameTabData2.f114262d.entrySet().iterator().next()).getKey();
        } catch (Exception unused) {
        }
        gameTabData2.f114263e = str;
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:22|23|24|25|26|27|33) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0066 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m45939d(com.tencent.p014mm.plugin.game.p061ui.chat_tab.GameTabData2 r6, org.json.JSONObject r7) {
        /*
            r0 = 0
            java.lang.String r1 = "TabList"
            org.json.JSONArray r1 = r7.getJSONArray(r1)     // Catch:{ JSONException -> 0x006a }
            r2 = 0
        L_0x0008:
            int r3 = r1.length()     // Catch:{ JSONException -> 0x006a }
            if (r2 >= r3) goto L_0x002a
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2$TabItem r3 = new com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2$TabItem     // Catch:{ JSONException -> 0x006a }
            org.json.JSONObject r4 = r1.optJSONObject(r2)     // Catch:{ JSONException -> 0x006a }
            r3.<init>((org.json.JSONObject) r4)     // Catch:{ JSONException -> 0x006a }
            java.lang.String r4 = r3.f114267d     // Catch:{ JSONException -> 0x006a }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)     // Catch:{ JSONException -> 0x006a }
            if (r4 == 0) goto L_0x0020
            goto L_0x0027
        L_0x0020:
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2$b r4 = r6.f114262d     // Catch:{ JSONException -> 0x006a }
            java.lang.String r5 = r3.f114267d     // Catch:{ JSONException -> 0x006a }
            r4.put(r5, r3)     // Catch:{ JSONException -> 0x006a }
        L_0x0027:
            int r2 = r2 + 1
            goto L_0x0008
        L_0x002a:
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2$b r1 = r6.f114262d     // Catch:{ JSONException -> 0x006a }
            int r1 = r1.size()     // Catch:{ JSONException -> 0x006a }
            if (r1 == 0) goto L_0x006a
            java.lang.String r1 = "DefaultTab"
            org.json.JSONObject r7 = r7.optJSONObject(r1)     // Catch:{ JSONException -> 0x006a }
            java.lang.String r1 = ""
            if (r7 == 0) goto L_0x0043
            java.lang.String r2 = "Key"
            java.lang.String r7 = r7.optString(r2)     // Catch:{ JSONException -> 0x006a }
            goto L_0x0044
        L_0x0043:
            r7 = r1
        L_0x0044:
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2$b r2 = r6.f114262d     // Catch:{ JSONException -> 0x006a }
            boolean r2 = r2.containsKey(r7)     // Catch:{ JSONException -> 0x006a }
            if (r2 == 0) goto L_0x004f
            r6.f114263e = r7     // Catch:{ JSONException -> 0x006a }
            goto L_0x0068
        L_0x004f:
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2$b r7 = r6.f114262d     // Catch:{ JSONException -> 0x006a }
            java.util.Set r7 = r7.entrySet()     // Catch:{ Exception -> 0x0066 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ Exception -> 0x0066 }
            java.lang.Object r7 = r7.next()     // Catch:{ Exception -> 0x0066 }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ Exception -> 0x0066 }
            java.lang.Object r7 = r7.getKey()     // Catch:{ Exception -> 0x0066 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x0066 }
            r1 = r7
        L_0x0066:
            r6.f114263e = r1     // Catch:{ JSONException -> 0x006a }
        L_0x0068:
            r6 = 1
            return r6
        L_0x006a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.p061ui.chat_tab.GameTabData2.m45939d(com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2, org.json.JSONObject):boolean");
    }

    /* renamed from: a */
    public List<TabItem> mo66309a() {
        ArrayList arrayList = new ArrayList();
        C42263b bVar = this.f114262d;
        if (bVar != null) {
            arrayList.addAll(bVar.values());
        }
        return arrayList;
    }

    /* renamed from: b */
    public String mo66310b() {
        for (TabItem tabItem : this.f114262d.values()) {
            if (tabItem.f114277q == 1) {
                return tabItem.f114267d;
            }
        }
        return "";
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo66312e() {
        JSONArray jSONArray = new JSONArray();
        for (TabItem tabItem : this.f114262d.values()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("Key", tabItem.f114267d);
                jSONObject.put("Title", tabItem.f114268e);
                jSONObject.put("JumpUrl", tabItem.f114278r);
                if (Util.nullAsNil(this.f114263e).equalsIgnoreCase(tabItem.f114267d)) {
                    jSONObject.put("isDefaultTab", 1);
                } else {
                    jSONObject.put("isDefaultTab", 0);
                }
            } catch (JSONException unused) {
            }
            jSONArray.put(jSONObject);
        }
        return jSONArray.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f114262d.size());
        for (Map.Entry value : this.f114262d.entrySet()) {
            parcel.writeParcelable((Parcelable) value.getValue(), i);
        }
        parcel.writeString(this.f114263e);
        parcel.writeString(this.f114264f);
        parcel.writeString(this.f114265g);
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2$TabItemWeapp */
    public static class TabItemWeapp implements Parcelable {
        public static final Parcelable.Creator<TabItemWeapp> CREATOR = new C42261a();

        /* renamed from: d */
        public String f114290d;

        /* renamed from: e */
        public String f114291e;

        /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2$TabItemWeapp$a */
        public class C42261a implements Parcelable.Creator<TabItemWeapp> {
            public Object createFromParcel(Parcel parcel) {
                return new TabItemWeapp(parcel, (C42262a) null);
            }

            public Object[] newArray(int i) {
                return new TabItemWeapp[i];
            }
        }

        public TabItemWeapp(C47709y4 y4Var) {
            if (y4Var != null) {
                this.f114290d = y4Var.f128170d;
                this.f114291e = y4Var.f128171e;
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f114290d);
            parcel.writeString(this.f114291e);
        }

        public TabItemWeapp(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f114290d = jSONObject.optString("AppId");
                this.f114291e = jSONObject.optString("Path");
            }
        }

        public TabItemWeapp(Parcel parcel, C42262a aVar) {
            this.f114290d = parcel.readString();
            this.f114291e = parcel.readString();
        }
    }

    public GameTabData2(Parcel parcel, C42262a aVar) {
        int readInt = parcel.readInt();
        if (this.f114262d == null) {
            this.f114262d = new C42263b(this);
        }
        for (int i = 0; i < readInt; i++) {
            TabItem tabItem = (TabItem) parcel.readParcelable(TabItem.class.getClassLoader());
            if (tabItem != null) {
                this.f114262d.put(tabItem.f114267d, tabItem);
            }
        }
        this.f114263e = parcel.readString();
        this.f114264f = parcel.readString();
        this.f114265g = parcel.readString();
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2$TabItemReport */
    public static class TabItemReport implements Parcelable {
        public static final Parcelable.Creator<TabItemReport> CREATOR = new C42260a();

        /* renamed from: d */
        public int f114287d;

        /* renamed from: e */
        public int f114288e;

        /* renamed from: f */
        public String f114289f;

        /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2$TabItemReport$a */
        public class C42260a implements Parcelable.Creator<TabItemReport> {
            public Object createFromParcel(Parcel parcel) {
                return new TabItemReport(parcel, (C42262a) null);
            }

            public Object[] newArray(int i) {
                return new TabItemReport[i];
            }
        }

        public TabItemReport(C47715z4 z4Var) {
            if (z4Var != null) {
                this.f114287d = z4Var.f128187d;
                this.f114288e = z4Var.f128188e;
                this.f114289f = z4Var.f128189f;
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f114287d);
            parcel.writeInt(this.f114288e);
            parcel.writeString(this.f114289f);
        }

        public TabItemReport(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f114287d = jSONObject.optInt("AreaId");
                this.f114288e = jSONObject.optInt("PositionId");
                this.f114289f = jSONObject.optString("ExternInfo");
            }
        }

        public TabItemReport(Parcel parcel, C42262a aVar) {
            this.f114287d = parcel.readInt();
            this.f114288e = parcel.readInt();
            this.f114289f = parcel.readString();
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2$TabItem */
    public static class TabItem implements Parcelable {
        public static final Parcelable.Creator<TabItem> CREATOR = new C42259a();

        /* renamed from: A */
        public List<LocalTabCornerSetting> f114266A;

        /* renamed from: d */
        public String f114267d;

        /* renamed from: e */
        public String f114268e;

        /* renamed from: f */
        public String f114269f;

        /* renamed from: g */
        public String f114270g;

        /* renamed from: h */
        public String f114271h;

        /* renamed from: i */
        public String f114272i;

        /* renamed from: j */
        public String f114273j;

        /* renamed from: n */
        public String f114274n;

        /* renamed from: o */
        public String f114275o;

        /* renamed from: p */
        public String f114276p;

        /* renamed from: q */
        public int f114277q;

        /* renamed from: r */
        public String f114278r;

        /* renamed from: s */
        public TabItemWeapp f114279s;

        /* renamed from: t */
        public TabItemReport f114280t;

        /* renamed from: u */
        public boolean f114281u;

        /* renamed from: v */
        public int f114282v;

        /* renamed from: w */
        public String f114283w;

        /* renamed from: x */
        public int f114284x;

        /* renamed from: y */
        public int f114285y;

        /* renamed from: z */
        public boolean f114286z = false;

        /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2$TabItem$a */
        public class C42259a implements Parcelable.Creator<TabItem> {
            public Object createFromParcel(Parcel parcel) {
                return new TabItem(parcel, (C42262a) null);
            }

            public Object[] newArray(int i) {
                return new TabItem[i];
            }
        }

        public TabItem(C47546a5 a5Var) {
            LocalJumpInfo localJumpInfo;
            if (a5Var != null) {
                this.f114267d = a5Var.f127565d;
                this.f114268e = a5Var.f127566e;
                this.f114269f = a5Var.f127567f;
                this.f114270g = a5Var.f127568g;
                this.f114271h = a5Var.f127569h;
                this.f114272i = a5Var.f127570i;
                this.f114273j = a5Var.f127571j;
                this.f114274n = a5Var.f127572n;
                this.f114275o = a5Var.f127573o;
                this.f114276p = a5Var.f127574p;
                this.f114277q = a5Var.f127575q;
                this.f114278r = a5Var.f127576r;
                this.f114279s = new TabItemWeapp(a5Var.f127577s);
                this.f114280t = new TabItemReport(a5Var.f127578t);
                this.f114281u = a5Var.f127579u;
                this.f114282v = a5Var.f127580v;
                if (Util.isNullOrNil((List) a5Var.f127582x)) {
                    this.f114266A = null;
                } else {
                    this.f114266A = new ArrayList();
                    Iterator<C47697w4> it = a5Var.f127582x.iterator();
                    while (it.hasNext()) {
                        C47697w4 next = it.next();
                        List<LocalTabCornerSetting> list = this.f114266A;
                        C87412m.m108594g(next, "<this>");
                        String str = next.f128118d;
                        String str2 = next.f128124j;
                        String str3 = next.f128120f;
                        C47621l3 l3Var = next.f128123i;
                        if (l3Var != null) {
                            int i = l3Var.f127855d;
                            String str4 = l3Var.f127856e;
                            C47637n5 n5Var = l3Var.f127857f;
                            WeAppJumpInfo weAppJumpInfo = n5Var != null ? new WeAppJumpInfo(n5Var.f127893d, n5Var.f127894e) : null;
                            C47713z2 z2Var = l3Var.f127858g;
                            localJumpInfo = new LocalJumpInfo(i, str4, weAppJumpInfo, z2Var != null ? new LocalHalfScreen(z2Var.f128181d, z2Var.f128182e, z2Var.f128183f) : null);
                        } else {
                            localJumpInfo = null;
                        }
                        list.add(new LocalTabCornerSetting(str, str2, str3, localJumpInfo));
                    }
                }
                mo66314a();
            }
        }

        /* renamed from: a */
        public final void mo66314a() {
            int i = this.f114277q;
            if (i == 1) {
                Long valueOf = Long.valueOf(Util.nullAsNil((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_GAME_CHAT_ROOM_ENABLE_LONG, 0L)));
                Log.m105925i("MicroMsg.GameTabData2", "forceChatRoomEnable:%b", Boolean.valueOf(valueOf.longValue() != 0 && Math.abs(Util.secondsToNow(valueOf.longValue())) < 172800));
                this.f114283w = ChatRoomTabUI.class.getName();
                this.f114286z = true;
            } else if (i != 2) {
                this.f114283w = "";
            } else if (C44594n1.m49045a()) {
                this.f114283w = MMGameWebTabUI.class.getName();
            } else {
                this.f114283w = GameWebTabUI.class.getName();
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            LocalTabCornerSetting[] localTabCornerSettingArr;
            parcel.writeString(this.f114267d);
            parcel.writeString(this.f114268e);
            parcel.writeString(this.f114269f);
            parcel.writeString(this.f114270g);
            parcel.writeString(this.f114271h);
            parcel.writeString(this.f114272i);
            parcel.writeString(this.f114273j);
            parcel.writeString(this.f114274n);
            parcel.writeString(this.f114275o);
            parcel.writeString(this.f114276p);
            parcel.writeInt(this.f114277q);
            parcel.writeString(this.f114278r);
            parcel.writeParcelable(this.f114279s, i);
            parcel.writeParcelable(this.f114280t, i);
            parcel.writeByte(this.f114281u ? (byte) 1 : 0);
            parcel.writeInt(this.f114282v);
            parcel.writeString(this.f114283w);
            parcel.writeInt(this.f114284x);
            parcel.writeByte(this.f114286z ? (byte) 1 : 0);
            if (Build.VERSION.SDK_INT >= 29) {
                parcel.writeParcelableList(this.f114266A, i);
                return;
            }
            if (Util.isNullOrNil((List) this.f114266A)) {
                localTabCornerSettingArr = null;
            } else {
                localTabCornerSettingArr = new LocalTabCornerSetting[this.f114266A.size()];
                this.f114266A.toArray(localTabCornerSettingArr);
            }
            parcel.writeParcelableArray(localTabCornerSettingArr, i);
        }

        public TabItem(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f114267d = jSONObject.optString("Key");
                this.f114268e = jSONObject.optString("Title");
                this.f114273j = jSONObject.optString("IconUrl");
                this.f114274n = jSONObject.optString("SelectedIconUrl");
                this.f114275o = jSONObject.optString("DarkModeIconUrl");
                this.f114276p = jSONObject.optString("DarkModeSelectedIconUrl");
                this.f114277q = jSONObject.optInt("Type");
                this.f114278r = jSONObject.optString("JumpUrl");
                this.f114279s = new TabItemWeapp(jSONObject.optJSONObject("JumpWeapp"));
                this.f114280t = new TabItemReport(jSONObject.optJSONObject("Report"));
                this.f114281u = false;
                this.f114282v = 2;
                mo66314a();
            }
        }

        public TabItem(Parcel parcel, C42262a aVar) {
            this.f114267d = parcel.readString();
            this.f114268e = parcel.readString();
            this.f114269f = parcel.readString();
            this.f114270g = parcel.readString();
            this.f114271h = parcel.readString();
            this.f114272i = parcel.readString();
            this.f114273j = parcel.readString();
            this.f114274n = parcel.readString();
            this.f114275o = parcel.readString();
            this.f114276p = parcel.readString();
            this.f114277q = parcel.readInt();
            this.f114278r = parcel.readString();
            this.f114279s = (TabItemWeapp) parcel.readParcelable(TabItemWeapp.class.getClassLoader());
            this.f114280t = (TabItemReport) parcel.readParcelable(TabItemReport.class.getClassLoader());
            boolean z = true;
            this.f114281u = parcel.readByte() != 0;
            this.f114282v = parcel.readInt();
            this.f114283w = parcel.readString();
            this.f114284x = parcel.readInt();
            this.f114286z = parcel.readByte() == 0 ? false : z;
            ArrayList arrayList = new ArrayList();
            this.f114266A = arrayList;
            if (Build.VERSION.SDK_INT >= 29) {
                parcel.readParcelableList(arrayList, LocalTabCornerSetting.class.getClassLoader());
                return;
            }
            Parcelable[] readParcelableArray = parcel.readParcelableArray(LocalTabCornerSetting.class.getClassLoader());
            if (readParcelableArray != null && readParcelableArray.length > 0) {
                for (LocalTabCornerSetting add : (LocalTabCornerSetting[]) Arrays.copyOf(readParcelableArray, readParcelableArray.length, LocalTabCornerSetting[].class)) {
                    this.f114266A.add(add);
                }
            }
        }
    }
}
