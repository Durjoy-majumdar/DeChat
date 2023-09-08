package tg3;

import android.util.Base64;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
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

/* renamed from: tg3.t */
public final class C90493t {

    /* renamed from: a */
    public final Integer f260080a;

    /* renamed from: b */
    public HashMap<Integer, LinkedList<C52049y03>> f260081b = new HashMap<>();

    /* renamed from: c */
    public final Integer f260082c;

    /* renamed from: d */
    public final Integer f260083d;

    /* renamed from: e */
    public final String f260084e;

    /* renamed from: f */
    public final String f260085f;

    /* renamed from: g */
    public final String f260086g;

    /* renamed from: h */
    public final int f260087h;

    /* renamed from: i */
    public String f260088i;

    /* renamed from: j */
    public String f260089j;

    /* renamed from: k */
    public int f260090k;

    /* renamed from: l */
    public String f260091l;

    /* renamed from: m */
    public String f260092m;

    /* renamed from: n */
    public boolean f260093n = true;

    /* renamed from: o */
    public boolean f260094o = true;

    /* renamed from: p */
    public boolean f260095p = true;

    public C90493t(C90441u93 u932) {
        if (u932 == null) {
            this.f260080a = 1;
            this.f260084e = "";
            this.f260085f = "";
            this.f260082c = -1;
            this.f260083d = -1;
            this.f260086g = "";
            this.f260087h = 0;
            this.f260088i = "";
            this.f260089j = "";
            this.f260090k = 0;
            this.f260091l = "";
            this.f260092m = "";
            return;
        }
        C90448yt3 yt32 = u932.f259857i;
        if (yt32 != null) {
            this.f260085f = yt32.f259943d;
            this.f260084e = yt32.f259945f;
            this.f260087h = yt32.f259950n;
        } else {
            this.f260085f = "";
            this.f260084e = "";
            this.f260087h = 0;
        }
        this.f260080a = Integer.valueOf(u932.f259853e);
        this.f260083d = Integer.valueOf(u932.f259856h);
        LinkedList<C51364t93> linkedList = u932.f259854f;
        if (linkedList != null && !linkedList.isEmpty()) {
            int size = u932.f259854f.size();
            for (int i = 0; i < size; i++) {
                C51364t93 t932 = u932.f259854f.get(i);
                LinkedList<C52049y03> linkedList2 = t932.f142056e;
                if (linkedList2 != null && !linkedList2.isEmpty()) {
                    this.f260081b.put(Integer.valueOf(t932.f142055d), t932.f142056e);
                }
            }
        }
        this.f260082c = Integer.valueOf(u932.f259855g);
        this.f260086g = u932.f259852d;
        LinkedList<C90439s93> linkedList3 = u932.f259859n;
        if (linkedList3 == null || linkedList3.isEmpty()) {
            this.f260088i = "";
            this.f260089j = "";
            this.f260090k = 0;
            this.f260091l = "";
            this.f260092m = "";
            return;
        }
        Iterator<C90439s93> it = u932.f259859n.iterator();
        while (it.hasNext()) {
            C90439s93 next = it.next();
            if (next != null && !Util.isNullOrNil(next.f259833d)) {
                if (next.f259833d.equalsIgnoreCase("newApkMd5")) {
                    this.f260088i = next.f259834e;
                } else if (next.f259833d.equalsIgnoreCase("oldApkMd5")) {
                    this.f260089j = next.f259834e;
                } else if (next.f259833d.equalsIgnoreCase(AssistantStore.DownloadInfos.DownloadInfoColumns.VERSIONCODE)) {
                    this.f260090k = Util.safeParseInt(next.f259834e);
                } else if (next.f259833d.equalsIgnoreCase(ConstValue.INIT_CONFIG_KEY_CLIENT_VERSION)) {
                    this.f260091l = next.f259834e;
                } else if (next.f259833d.equalsIgnoreCase("alphaTitle")) {
                    String str = next.f259834e;
                    if (!Util.isNullOrNil(str)) {
                        new String(Base64.decode(str, 0));
                    }
                } else if (next.f259833d.equalsIgnoreCase("alphaContent")) {
                    String str2 = next.f259834e;
                    if (!Util.isNullOrNil(str2)) {
                        new String(Base64.decode(str2, 0));
                    }
                } else if (next.f259833d.equalsIgnoreCase("alphaUrl")) {
                    this.f260092m = next.f259834e;
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nupdater, packageType:");
        sb.append(this.f260082c);
        sb.append("\nresponseState:");
        sb.append(this.f260080a);
        sb.append("\ncdnUrl:");
        sb.append(this.f260084e);
        sb.append("\nfileMd5:");
        sb.append(this.f260085f);
        sb.append("\nnetworkType:");
        sb.append(this.f260083d);
        sb.append("\npatchId:");
        sb.append(this.f260086g);
        sb.append("\nisShowNotification:");
        sb.append(this.f260093n);
        sb.append("\nisShowDialog:");
        sb.append(this.f260095p);
        sb.append("\nisShowRedot:");
        sb.append(this.f260094o);
        sb.append("\nnewApkMd5:");
        sb.append(this.f260088i);
        sb.append("\noldApkMd5:");
        sb.append(this.f260089j);
        sb.append("\nclientVersion:");
        sb.append(this.f260091l);
        sb.append("\ngetClientVersionCode:");
        Object[] objArr = new Object[2];
        String str = this.f260091l;
        if (str == null) {
            str = "";
        }
        int i = 0;
        objArr[0] = str;
        objArr[1] = BuildInfo.CLIENT_VERSION;
        Log.m105925i("Tinker.TinkerSyncResponse", "clientVersion %s currentVersion %s", objArr);
        if (!Util.isNullOrNil(this.f260091l)) {
            try {
                i = Integer.decode(this.f260091l).intValue();
            } catch (Exception e) {
                Log.printErrStackTrace("Tinker.TinkerSyncResponse", e, "getClientVersionCode", new Object[0]);
            }
        }
        sb.append(i);
        return sb.toString();
    }
}
