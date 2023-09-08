package p490dl;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.emoji.sync.EmojiUpdateReceiver;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiGroupInfo;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import f40.C86709a0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import jg3.C98942a;
import te3.C101776f80;
import te3.C49978jd3;
import te3.C50892pz1;
import te3.C51794w70;
import wh3.C102451g;
import wh3.C38139n;

/* renamed from: dl.o */
public class C97489o {

    /* renamed from: o */
    public static C97489o f286128o;

    /* renamed from: a */
    public boolean f286129a = true;

    /* renamed from: b */
    public boolean f286130b = true;

    /* renamed from: c */
    public boolean f286131c = true;

    /* renamed from: d */
    public boolean f286132d = true;

    /* renamed from: e */
    public boolean f286133e = true;

    /* renamed from: f */
    public final String[] f286134f = {null};

    /* renamed from: g */
    public ArrayList<EmojiGroupInfo> f286135g = new ArrayList<>();

    /* renamed from: h */
    public ArrayList<C45411m> f286136h = new ArrayList<>();

    /* renamed from: i */
    public final ReentrantLock f286137i = new ReentrantLock();

    /* renamed from: j */
    public final LruCache<String, ArrayList<EmojiInfo>> f286138j = new C97490a(this, 20000);

    /* renamed from: k */
    public final HashMap<String, C49978jd3> f286139k = new HashMap<>();

    /* renamed from: l */
    public final C51794w70[] f286140l = {null};

    /* renamed from: m */
    public String f286141m;

    /* renamed from: n */
    public final boolean[] f286142n = {false};

    /* renamed from: dl.o$a */
    public class C97490a extends LruCache<String, ArrayList<EmojiInfo>> {
        public C97490a(C97489o oVar, int i) {
            super(i);
        }

        public int sizeOf(Object obj, Object obj2) {
            String str = (String) obj;
            ArrayList arrayList = (ArrayList) obj2;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }
    }

    /* renamed from: g */
    public static synchronized C97489o m125592g() {
        C97489o oVar;
        synchronized (C97489o.class) {
            if (f286128o == null) {
                f286128o = new C97489o();
            }
            f286128o.mo136767i();
            oVar = f286128o;
        }
        return oVar;
    }

    /* renamed from: a */
    public ArrayList<EmojiInfo> mo136760a() {
        ArrayList parcelableArrayList;
        Log.m105918d("MicroMsg.EmojiStorageCache", "onlySuccessEmoji:.");
        ArrayList<EmojiInfo> arrayList = this.f286138j.get("custom");
        if (arrayList == null || this.f286130b) {
            this.f286130b = false;
            Log.m105925i("MicroMsg.EmojiStorageCache", "getAllCustomEmoji: %s", false);
            if (C86709a0.m107531m().mo58407a().mo71804b()) {
                C102451g d = C30790w2.m39221h().mo57717d();
                arrayList = d != null ? (ArrayList) d.mo142036DN(true) : new ArrayList<>(2);
            } else {
                ArrayList<EmojiInfo> arrayList2 = new ArrayList<>();
                Bundle w = C98942a.m128786w(C98942a.m128787x(), "getAllCustomEmoji", (String) null, (Bundle) null);
                w.setClassLoader(EmojiInfo.class.getClassLoader());
                if (w.containsKey("key_data") && (parcelableArrayList = w.getParcelableArrayList("key_data")) != null) {
                    arrayList2.addAll(parcelableArrayList);
                    Log.m105925i("MicroMsg.EmojiStorageCache", "[getAllCustomEmojiExport] size:%s", Integer.valueOf(parcelableArrayList.size()));
                }
                arrayList = arrayList2;
            }
            this.f286138j.put("custom", arrayList);
        }
        return arrayList;
    }

    /* renamed from: b */
    public ArrayList<EmojiInfo> mo136761b(boolean z) {
        ArrayList parcelableArrayList;
        Log.m105925i("MicroMsg.EmojiStorageCache", "getCaptureEmoji: needUpdateCaptureEmoji %s withFailed %s.", Boolean.valueOf(this.f286133e), Boolean.valueOf(z));
        ArrayList<EmojiInfo> arrayList = this.f286138j.get("capture");
        if (arrayList == null || this.f286133e) {
            this.f286133e = false;
            if (C86709a0.m107531m().mo58407a().mo71804b()) {
                C102451g d = C30790w2.m39221h().mo57717d();
                d.getClass();
                ArrayList<EmojiInfo> arrayList2 = new ArrayList<>();
                Cursor rawQuery = d.f301704d.rawQuery("select * from " + "EmojiInfo" + " where " + "groupId" + " = " + FastJsonResponse.QUOTE + "capture" + FastJsonResponse.QUOTE + " order by " + "idx" + " asc " + " , " + "captureEnterTime" + " desc ", (String[]) null);
                if (rawQuery != null) {
                    if (rawQuery.moveToFirst()) {
                        do {
                            EmojiInfo emojiInfo = new EmojiInfo();
                            emojiInfo.convertFrom(rawQuery);
                            arrayList2.add(emojiInfo);
                        } while (rawQuery.moveToNext());
                    }
                    rawQuery.close();
                }
                arrayList = arrayList2;
            } else {
                arrayList = new ArrayList<>();
                Bundle w = C98942a.m128786w(C98942a.m128787x(), "getCaptureEmoji", (String) null, (Bundle) null);
                w.setClassLoader(EmojiInfo.class.getClassLoader());
                if (w.containsKey("key_data") && (parcelableArrayList = w.getParcelableArrayList("key_data")) != null) {
                    arrayList.addAll(parcelableArrayList);
                    Log.m105925i("MicroMsg.EmojiStorageCache", "[getCaptureEmojiExport] size:%s", Integer.valueOf(parcelableArrayList.size()));
                }
            }
            Log.m105925i("MicroMsg.EmojiStorageCache", "getCaptureEmoji: %s size %s", Boolean.valueOf(this.f286133e), Integer.valueOf(arrayList.size()));
            this.f286138j.put("capture", arrayList);
        }
        if (z) {
            Log.m105919d("MicroMsg.EmojiStorageCache", "getCaptureEmoji list size: %s.", Integer.valueOf(arrayList.size()));
            return arrayList;
        }
        ArrayList<EmojiInfo> arrayList3 = new ArrayList<>();
        Iterator<EmojiInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            EmojiInfo next = it.next();
            if (next.mo62647T1() == IEmojiInfo.C40005a.STATUS_SUCCESS) {
                arrayList3.add(next);
            }
        }
        Log.m105919d("MicroMsg.EmojiStorageCache", "getCaptureEmoji result size: %s.", Integer.valueOf(arrayList3.size()));
        return arrayList3;
    }

    /* renamed from: c */
    public C49978jd3 mo136762c(String str) {
        C49978jd3 jd32;
        if (!this.f286139k.containsKey(str)) {
            byte[] bArr = null;
            if (C86709a0.m107531m().mo58407a().mo71804b()) {
                C38139n jo = C30790w2.m39221h().mo57719f().mo61538jo(str);
                if (jo != null) {
                    bArr = jo.field_content;
                }
            } else {
                Bundle w = C98942a.m128786w(C98942a.m128787x(), "getDesignerInfo", str, (Bundle) null);
                if (w.containsKey("buffer")) {
                    bArr = w.getByteArray("buffer");
                }
            }
            if (bArr != null) {
                C50892pz1 pz12 = new C50892pz1();
                try {
                    pz12.parseFrom(bArr);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.EmojiStorageCache", e, "", new Object[0]);
                }
                C101776f80 f802 = pz12.f140062d;
                if (!(f802 == null || (jd32 = f802.f298229E) == null)) {
                    this.f286139k.put(str, jd32);
                }
            }
        }
        return this.f286139k.get(str);
    }

    /* renamed from: d */
    public ArrayList<EmojiGroupInfo> mo136763d() {
        try {
            this.f286137i.lock();
            if (this.f286132d) {
                this.f286132d = false;
                if (C86709a0.m107531m().mo58407a().mo71804b()) {
                    this.f286135g = C30790w2.m39221h().mo57715b().mo142029mI();
                    this.f286136h = null;
                } else {
                    ArrayList<EmojiGroupInfo> e = mo136764e();
                    this.f286135g = new ArrayList<>();
                    this.f286136h = null;
                    Iterator<EmojiGroupInfo> it = e.iterator();
                    while (it.hasNext()) {
                        EmojiGroupInfo next = it.next();
                        if (next.field_sync == 2 || Util.isEqual(next.field_productID, String.valueOf(17))) {
                            this.f286135g.add(next);
                        }
                    }
                }
            }
            return this.f286135g;
        } finally {
            this.f286137i.unlock();
        }
    }

    /* renamed from: e */
    public final ArrayList<EmojiGroupInfo> mo136764e() {
        ArrayList parcelableArrayList;
        ArrayList<EmojiGroupInfo> arrayList = new ArrayList<>();
        Bundle w = C98942a.m128786w(C98942a.m128787x(), "getEmojiGroupInfoList", (String) null, (Bundle) null);
        w.setClassLoader(EmojiGroupInfo.class.getClassLoader());
        if (w.containsKey("data") && (parcelableArrayList = w.getParcelableArrayList("data")) != null) {
            arrayList.addAll(parcelableArrayList);
            Log.m105925i("MicroMsg.EmojiStorageCache", "[getEmojiGroupInfoListExport] size: %s", Integer.valueOf(parcelableArrayList.size()));
        }
        return arrayList;
    }

    /* renamed from: f */
    public ArrayList<EmojiInfo> mo136765f(String str) {
        ArrayList parcelableArrayList;
        if (this.f286131c) {
            this.f286138j.evictAll();
            this.f286131c = false;
        }
        ArrayList<EmojiInfo> arrayList = this.f286138j.get(str);
        if (arrayList == null) {
            if (C86709a0.m107531m().mo58407a().mo71804b()) {
                arrayList = (ArrayList) C30790w2.m39221h().mo57717d().mo142039NQ(str);
            } else {
                arrayList = new ArrayList<>();
                Uri x = C98942a.m128787x();
                Bundle w = C98942a.m128786w(x, "getEmojiListByGroupId", str + "", (Bundle) null);
                w.setClassLoader(EmojiInfo.class.getClassLoader());
                if (w.containsKey("data") && (parcelableArrayList = w.getParcelableArrayList("data")) != null) {
                    arrayList.addAll(parcelableArrayList);
                    Log.m105925i("MicroMsg.EmojiStorageCache", "[getEmojiListByGroupIdExport] size%s", Integer.valueOf(parcelableArrayList.size()));
                }
            }
            this.f286138j.put(str, arrayList);
        }
        return arrayList;
    }

    /* renamed from: h */
    public C51794w70 mo136766h() {
        C51794w70[] w70Arr = this.f286140l;
        if (w70Arr[0] == null) {
            synchronized (w70Arr) {
                if (this.f286140l[0] == null) {
                    C51794w70 w702 = new C51794w70();
                    if (MMApplicationContext.isMainProcess()) {
                        byte[] Lo = C30790w2.m39221h().mo57720g().mo61543Lo("cache_type_user_data");
                        if (!Util.isNullOrNil(Lo)) {
                            try {
                                w702.parseFrom(Lo);
                            } catch (IOException e) {
                                Log.printErrStackTrace("MicroMsg.EmojiStorageCache", e, "parse user data error", new Object[0]);
                            }
                        }
                    }
                    this.f286140l[0] = w702;
                }
            }
        }
        return this.f286140l[0];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo136767i() {
        /*
            r9 = this;
            boolean[] r0 = r9.f286142n
            r1 = 0
            boolean r2 = r0[r1]
            if (r2 != 0) goto L_0x008d
            monitor-enter(r0)
            boolean[] r2 = r9.f286142n     // Catch:{ all -> 0x008a }
            boolean r2 = r2[r1]     // Catch:{ all -> 0x008a }
            if (r2 != 0) goto L_0x0088
            boolean r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()     // Catch:{ all -> 0x008a }
            r3 = 1
            r4 = -29414086(0xfffffffffe3f2d3a, float:-6.3529344E37)
            if (r2 == 0) goto L_0x0044
            boolean r2 = f40.C86709a0.m107522a()     // Catch:{ all -> 0x008a }
            if (r2 != 0) goto L_0x002c
            java.lang.String r1 = "MicroMsg.EmojiStorageCache"
            java.lang.String r2 = "Not login, skip rest logic this time."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)     // Catch:{ all -> 0x008a }
            java.lang.String r1 = "smiley"
            r9.f286141m = r1     // Catch:{ all -> 0x008a }
            monitor-exit(r0)     // Catch:{ all -> 0x008a }
            return
        L_0x002c:
            f40.o r2 = f40.C86709a0.m107535s()     // Catch:{ all -> 0x008a }
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()     // Catch:{ all -> 0x008a }
            java.lang.String r5 = "smiley"
            java.lang.Object r2 = r2.mo119684e(r4, r5)     // Catch:{ all -> 0x008a }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x008a }
            r9.f286141m = r2     // Catch:{ all -> 0x008a }
            boolean[] r2 = r9.f286142n     // Catch:{ all -> 0x008a }
            r2[r1] = r3     // Catch:{ all -> 0x008a }
            goto L_0x0088
        L_0x0044:
            java.lang.String r2 = "smiley"
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x008a }
            r5.<init>()     // Catch:{ all -> 0x008a }
            java.lang.String r6 = "key"
            r5.putInt(r6, r4)     // Catch:{ all -> 0x008a }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x008a }
            r4.<init>()     // Catch:{ all -> 0x008a }
            java.lang.String r7 = "content://"
            r4.append(r7)     // Catch:{ all -> 0x008a }
            java.lang.String r7 = p248ug.C90660g.f260478a     // Catch:{ all -> 0x008a }
            r4.append(r7)     // Catch:{ all -> 0x008a }
            java.lang.String r7 = "/"
            r4.append(r7)     // Catch:{ all -> 0x008a }
            java.lang.String r8 = "userinfo"
            r4.append(r8)     // Catch:{ all -> 0x008a }
            r4.append(r7)     // Catch:{ all -> 0x008a }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x008a }
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ all -> 0x008a }
            java.lang.String r7 = "ConfigStorage.getString"
            r8 = 0
            android.os.Bundle r4 = jg3.C98942a.m128786w(r4, r7, r8, r5)     // Catch:{ all -> 0x008a }
            java.lang.String r2 = r4.getString(r6, r2)     // Catch:{ all -> 0x008a }
            r9.f286141m = r2     // Catch:{ all -> 0x008a }
            boolean[] r2 = r9.f286142n     // Catch:{ all -> 0x008a }
            r2[r1] = r3     // Catch:{ all -> 0x008a }
        L_0x0088:
            monitor-exit(r0)     // Catch:{ all -> 0x008a }
            goto L_0x008d
        L_0x008a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008a }
            throw r1
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p490dl.C97489o.mo136767i():void");
    }

    /* renamed from: j */
    public boolean mo136768j(IEmojiInfo iEmojiInfo) {
        synchronized (this.f286138j) {
            for (ArrayList<EmojiInfo> it : this.f286138j.values()) {
                Iterator it4 = it.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        if (((EmojiInfo) it4.next()).getMd5().equals(iEmojiInfo.getMd5())) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: k */
    public void mo136769k(boolean z) {
        this.f286130b = true;
        Log.m105925i("MicroMsg.EmojiStorageCache", "setNeedUpdateAllCustomEmoji %s", Boolean.valueOf(z));
        if (z) {
            Intent intent = new Intent();
            int i = EmojiUpdateReceiver.f266698a;
            intent.setAction("com.tencent.mm.Emoji_Update");
            intent.putExtra("type", "update_all_custom_emoji");
            MMApplicationContext.getContext().sendBroadcast(intent);
        }
    }

    /* renamed from: l */
    public void mo136770l(boolean z) {
        Log.m105924i("MicroMsg.EmojiStorageCache", "setNeedUpdateCaptureEmoji: ");
        this.f286133e = true;
        if (z) {
            int i = EmojiUpdateReceiver.f266698a;
            Intent intent = new Intent();
            intent.setAction("com.tencent.mm.Emoji_Update");
            intent.putExtra("type", "update_capture_emoji");
            MMApplicationContext.getContext().sendBroadcast(intent);
        }
    }

    /* renamed from: m */
    public void mo136771m(boolean z) {
        this.f286129a = true;
        Log.m105925i("MicroMsg.EmojiStorageCache", "setNeedUpdateAllCustomEmoji %s", Boolean.valueOf(z));
        if (z) {
            Intent intent = new Intent();
            int i = EmojiUpdateReceiver.f266698a;
            intent.setAction("com.tencent.mm.Emoji_Update");
            intent.putExtra("type", "update_download_custom_emoji");
            MMApplicationContext.getContext().sendBroadcast(intent);
        }
    }

    /* renamed from: n */
    public void mo136772n(boolean z) {
        this.f286132d = true;
        Log.m105925i("MicroMsg.EmojiStorageCache", "setNeedUpdateGroupInfo: %s", Boolean.valueOf(z));
        if (z) {
            Intent intent = new Intent();
            int i = EmojiUpdateReceiver.f266698a;
            intent.setAction("com.tencent.mm.Emoji_Update");
            intent.putExtra("type", "update_group_info");
            MMApplicationContext.getContext().sendBroadcast(intent);
        }
    }
}
