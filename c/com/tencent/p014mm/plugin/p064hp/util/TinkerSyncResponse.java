package com.tencent.p014mm.plugin.p064hp.util;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import com.tencent.xweb.internal.ConstValue;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import te3.C51364t93;
import te3.C52049y03;
import te3.C90439s93;
import te3.C90441u93;
import te3.C90448yt3;
import tw0.C90585h;

/* renamed from: com.tencent.mm.plugin.hp.util.TinkerSyncResponse */
public class TinkerSyncResponse implements C90585h, Parcelable {
    public static final Parcelable.Creator<TinkerSyncResponse> CREATOR = new C85241a();

    /* renamed from: A */
    public String f248335A;

    /* renamed from: B */
    public int f248336B;

    /* renamed from: C */
    public int f248337C;

    /* renamed from: d */
    public Integer f248338d;

    /* renamed from: e */
    public HashMap<Integer, LinkedList<C52049y03>> f248339e;

    /* renamed from: f */
    public Integer f248340f;

    /* renamed from: g */
    public Integer f248341g;

    /* renamed from: h */
    public String f248342h;

    /* renamed from: i */
    public String f248343i;

    /* renamed from: j */
    public String f248344j;

    /* renamed from: n */
    public int f248345n;

    /* renamed from: o */
    public String f248346o;

    /* renamed from: p */
    public String f248347p;

    /* renamed from: q */
    public int f248348q;

    /* renamed from: r */
    public String f248349r;

    /* renamed from: s */
    public String f248350s;

    /* renamed from: t */
    public String f248351t;

    /* renamed from: u */
    public String f248352u;

    /* renamed from: v */
    public boolean f248353v;

    /* renamed from: w */
    public long f248354w;

    /* renamed from: x */
    public boolean f248355x;

    /* renamed from: y */
    public boolean f248356y;

    /* renamed from: z */
    public boolean f248357z;

    /* renamed from: com.tencent.mm.plugin.hp.util.TinkerSyncResponse$a */
    public class C85241a implements Parcelable.Creator<TinkerSyncResponse> {
        public Object createFromParcel(Parcel parcel) {
            return new TinkerSyncResponse(parcel);
        }

        public Object[] newArray(int i) {
            return new TinkerSyncResponse[i];
        }
    }

    public TinkerSyncResponse(C90441u93 u932) {
        String str;
        String str2;
        this.f248339e = new HashMap<>();
        this.f248353v = true;
        this.f248354w = 0;
        this.f248355x = true;
        this.f248356y = true;
        this.f248357z = true;
        if (u932 == null) {
            this.f248338d = 1;
            this.f248342h = "";
            this.f248343i = "";
            this.f248340f = -1;
            this.f248341g = -1;
            this.f248344j = "";
            this.f248345n = 0;
            this.f248346o = "";
            this.f248347p = "";
            this.f248348q = 0;
            this.f248349r = "";
            this.f248350s = "";
            this.f248351t = "";
            this.f248352u = "";
            return;
        }
        C90448yt3 yt32 = u932.f259857i;
        if (yt32 != null) {
            this.f248343i = yt32.f259943d;
            this.f248342h = yt32.f259945f;
            this.f248345n = yt32.f259950n;
        } else {
            this.f248343i = "";
            this.f248342h = "";
            this.f248345n = 0;
        }
        this.f248338d = Integer.valueOf(u932.f259853e);
        this.f248341g = Integer.valueOf(u932.f259856h);
        LinkedList<C51364t93> linkedList = u932.f259854f;
        if (linkedList != null && !linkedList.isEmpty()) {
            int size = u932.f259854f.size();
            for (int i = 0; i < size; i++) {
                C51364t93 t932 = u932.f259854f.get(i);
                LinkedList<C52049y03> linkedList2 = t932.f142056e;
                if (linkedList2 != null && !linkedList2.isEmpty()) {
                    this.f248339e.put(Integer.valueOf(t932.f142055d), t932.f142056e);
                }
            }
        }
        this.f248340f = Integer.valueOf(u932.f259855g);
        this.f248344j = u932.f259852d;
        LinkedList<C90439s93> linkedList3 = u932.f259859n;
        if (linkedList3 == null || linkedList3.isEmpty()) {
            this.f248346o = "";
            this.f248347p = "";
            this.f248348q = 0;
            this.f248349r = "";
            this.f248350s = "";
            this.f248351t = "";
            this.f248352u = "";
            this.f248356y = true;
            this.f248357z = false;
            this.f248355x = true;
            this.f248337C = 1;
            this.f248336B = 6;
            return;
        }
        Iterator<C90439s93> it = u932.f259859n.iterator();
        while (it.hasNext()) {
            C90439s93 next = it.next();
            if (next != null && !Util.isNullOrNil(next.f259833d)) {
                if (next.f259833d.equalsIgnoreCase("newApkMd5")) {
                    this.f248346o = next.f259834e;
                } else if (next.f259833d.equalsIgnoreCase("oldApkMd5")) {
                    this.f248347p = next.f259834e;
                } else if (next.f259833d.equalsIgnoreCase(AssistantStore.DownloadInfos.DownloadInfoColumns.VERSIONCODE)) {
                    this.f248348q = Util.safeParseInt(next.f259834e);
                } else if (next.f259833d.equalsIgnoreCase(ConstValue.INIT_CONFIG_KEY_CLIENT_VERSION)) {
                    this.f248349r = next.f259834e;
                } else if (next.f259833d.equalsIgnoreCase("alphaTitle")) {
                    String str3 = next.f259834e;
                    if (!Util.isNullOrNil(str3)) {
                        str2 = new String(Base64.decode(str3, 0));
                    } else {
                        str2 = "";
                    }
                    this.f248350s = str2;
                } else if (next.f259833d.equalsIgnoreCase("alphaContent")) {
                    String str4 = next.f259834e;
                    if (!Util.isNullOrNil(str4)) {
                        str = new String(Base64.decode(str4, 0));
                    } else {
                        str = "";
                    }
                    this.f248351t = str;
                } else if (next.f259833d.equalsIgnoreCase("alphaUrl")) {
                    this.f248352u = next.f259834e;
                } else if (next.f259833d.equalsIgnoreCase("isShowNotification")) {
                    this.f248355x = Util.safeParseInt(next.f259834e, 1) == 1;
                } else if (next.f259833d.equalsIgnoreCase("isShowRedot")) {
                    this.f248356y = Util.safeParseInt(next.f259834e, 1) == 1;
                } else if (next.f259833d.equalsIgnoreCase("isShowDialog")) {
                    this.f248357z = Util.safeParseInt(next.f259834e, 0) == 1;
                } else if (next.f259833d.equalsIgnoreCase("showDialogMaxTimes")) {
                    this.f248337C = Util.safeParseInt(next.f259834e, 1);
                } else if (next.f259833d.equalsIgnoreCase("showDialogIntervalTime")) {
                    this.f248336B = Util.safeParseInt(next.f259834e, 6);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo118342a() {
        if (this.f248338d.intValue() > 4 || this.f248338d.intValue() < 1) {
            Log.m105921e("Tinker.TinkerSyncResponse", "responseState: %d must between %d and %d", this.f248338d, 1, 4);
            C115669n.INSTANCE.idkeyStat(614, 24, 1, false);
            return false;
        }
        if (mo118345d()) {
            if (TextUtils.isEmpty(this.f248344j)) {
                Log.m105920e("Tinker.TinkerSyncResponse", "sync response patchId should not be null");
                C115669n.INSTANCE.idkeyStat(614, 25, 1, false);
                return false;
            } else if (TextUtils.isEmpty(this.f248342h)) {
                Log.m105920e("Tinker.TinkerSyncResponse", "sync response cdnUrl should not be null");
                C115669n.INSTANCE.idkeyStat(614, 26, 1, false);
                return false;
            } else if (TextUtils.isEmpty(this.f248343i)) {
                Log.m105920e("Tinker.TinkerSyncResponse", "sync response fileMd5 should not be null");
                C115669n.INSTANCE.idkeyStat(614, 27, 1, false);
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo118343b() {
        return this.f248338d.intValue() == 3;
    }

    /* renamed from: c */
    public void mo118344c(boolean z) {
        this.f248353v = z;
    }

    /* renamed from: d */
    public boolean mo118345d() {
        return this.f248338d.intValue() == 2 || this.f248338d.intValue() == 4;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo118347e() {
        return this.f248346o;
    }

    /* renamed from: f */
    public boolean mo118348f() {
        Object[] objArr = new Object[2];
        String str = this.f248349r;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        objArr[1] = BuildInfo.CLIENT_VERSION;
        Log.m105925i("Tinker.TinkerSyncResponse", "clientVersion %s currentVersion %s", objArr);
        if (!Util.isNullOrNil(this.f248349r)) {
            try {
                return (Integer.decode(this.f248349r).intValue() & -256) < (Integer.decode(BuildInfo.CLIENT_VERSION).intValue() & -256);
            } catch (Exception e) {
                Log.printErrStackTrace("Tinker.TinkerSyncResponse", e, "isLowerClientVersion", new Object[0]);
            }
        }
        return false;
    }

    /* renamed from: g */
    public void mo118349g(String str) {
        this.f248346o = str;
    }

    public String getClientVersion() {
        return this.f248349r;
    }

    /* renamed from: h */
    public void mo118351h(boolean z) {
        this.f248353v = z;
    }

    /* renamed from: i */
    public String mo118352i() {
        HashMap<Integer, LinkedList<C52049y03>> hashMap = this.f248339e;
        return hashMap != null && !hashMap.isEmpty() && this.f248339e.containsKey(4) ? mo118355o(this.f248339e, 4) : "";
    }

    /* renamed from: j */
    public int mo118353j() {
        return this.f248340f.intValue();
    }

    /* renamed from: m */
    public int mo118354m() {
        Object[] objArr = new Object[2];
        String str = this.f248349r;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        objArr[1] = BuildInfo.CLIENT_VERSION;
        Log.m105925i("Tinker.TinkerSyncResponse", "clientVersion %s currentVersion %s", objArr);
        if (!Util.isNullOrNil(this.f248349r)) {
            try {
                return Integer.decode(this.f248349r).intValue();
            } catch (Exception e) {
                Log.printErrStackTrace("Tinker.TinkerSyncResponse", e, "getClientVersionCode", new Object[0]);
            }
        }
        return 0;
    }

    /* renamed from: o */
    public final String mo118355o(HashMap<Integer, LinkedList<C52049y03>> hashMap, int i) {
        LinkedList linkedList;
        String str = "";
        if (hashMap != null && !hashMap.isEmpty() && (linkedList = hashMap.get(Integer.valueOf(i))) != null && !linkedList.isEmpty()) {
            int size = linkedList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C52049y03 y032 = (C52049y03) linkedList.get(i2);
                if (y032.f145065d.equalsIgnoreCase("default")) {
                    str = new String(Base64.decode(y032.f145066e, 0));
                } else if (y032.f145065d.equalsIgnoreCase(LocaleUtil.getApplicationLanguage())) {
                    return new String(Base64.decode(y032.f145066e, 0));
                }
            }
        }
        return str;
    }

    /* renamed from: p */
    public boolean mo118356p() {
        Context context = MMApplicationContext.getContext();
        if (!NetStatusUtil.isConnected(context)) {
            return false;
        }
        if (this.f248341g.intValue() != 1 && this.f248341g.intValue() == 3) {
            return NetStatusUtil.isWifi(context);
        }
        return true;
    }

    public String toString() {
        return "\nutils packageType:" + this.f248340f + "\nisAuto:" + this.f248353v + "\nresponseState:" + this.f248338d + "\ncdnUrl:" + this.f248342h + "\nfileMd5:" + this.f248343i + "\nnetworkType:" + this.f248341g + "\npatchId:" + this.f248344j + "\nisShowNotification:" + this.f248355x + "\nisShowDialog:" + this.f248357z + "\nisShowRedot:" + this.f248356y + "\nnewApkMd5:" + this.f248346o + "\noldApkMd5:" + this.f248347p + "\nclientVersion:" + this.f248349r + "\ngetClientVersionCode:" + mo118354m();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f248338d);
        parcel.writeSerializable(this.f248339e);
        parcel.writeValue(this.f248340f);
        parcel.writeValue(this.f248341g);
        parcel.writeString(this.f248342h);
        parcel.writeString(this.f248343i);
        parcel.writeString(this.f248344j);
        parcel.writeInt(this.f248345n);
        parcel.writeString(this.f248346o);
        parcel.writeString(this.f248347p);
        parcel.writeInt(this.f248348q);
        parcel.writeString(this.f248349r);
        parcel.writeString(this.f248350s);
        parcel.writeString(this.f248351t);
        parcel.writeString(this.f248352u);
        parcel.writeByte(this.f248353v ? (byte) 1 : 0);
        parcel.writeLong(this.f248354w);
        parcel.writeByte(this.f248355x ? (byte) 1 : 0);
        parcel.writeByte(this.f248356y ? (byte) 1 : 0);
        parcel.writeByte(this.f248357z ? (byte) 1 : 0);
        parcel.writeString(this.f248335A);
        parcel.writeInt(this.f248336B);
        parcel.writeInt(this.f248337C);
    }

    public TinkerSyncResponse(Parcel parcel) {
        Class<Integer> cls = Integer.class;
        this.f248339e = new HashMap<>();
        boolean z = true;
        this.f248353v = true;
        this.f248354w = 0;
        this.f248355x = true;
        this.f248356y = true;
        this.f248357z = true;
        this.f248338d = (Integer) parcel.readValue(cls.getClassLoader());
        this.f248339e = (HashMap) parcel.readSerializable();
        this.f248340f = (Integer) parcel.readValue(cls.getClassLoader());
        this.f248341g = (Integer) parcel.readValue(cls.getClassLoader());
        this.f248342h = parcel.readString();
        this.f248343i = parcel.readString();
        this.f248344j = parcel.readString();
        this.f248345n = parcel.readInt();
        this.f248346o = parcel.readString();
        this.f248347p = parcel.readString();
        this.f248348q = parcel.readInt();
        this.f248349r = parcel.readString();
        this.f248350s = parcel.readString();
        this.f248351t = parcel.readString();
        this.f248352u = parcel.readString();
        this.f248353v = parcel.readByte() != 0;
        this.f248354w = parcel.readLong();
        this.f248355x = parcel.readByte() != 0;
        this.f248356y = parcel.readByte() != 0;
        this.f248357z = parcel.readByte() == 0 ? false : z;
        this.f248335A = parcel.readString();
        this.f248336B = parcel.readInt();
        this.f248337C = parcel.readInt();
    }
}
