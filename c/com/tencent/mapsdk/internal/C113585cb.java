package com.tencent.mapsdk.internal;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.map.sdk.comps.offlinemap.OfflineItem;
import com.tencent.map.sdk.comps.offlinemap.OfflineItemController;
import com.tencent.map.sdk.comps.offlinemap.OfflineMapComponent;
import com.tencent.map.sdk.comps.offlinemap.OfflineMapSyncedListener;
import com.tencent.map.sdk.comps.offlinemap.OfflineStatusChangedListener;
import com.tencent.map.tools.Callback;
import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.JsonUtils;
import com.tencent.map.tools.net.NetManager;
import com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq;
import com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp;
import com.tencent.mapsdk.core.components.protocol.jce.conf.SCFileUpdateRsp;
import com.tencent.mapsdk.internal.C113577bz;
import com.tencent.mapsdk.internal.C113638du;
import com.tencent.mapsdk.internal.C113640dv;
import com.tencent.mapsdk.internal.C113642dw;
import com.tencent.mapsdk.internal.C113865kb;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: com.tencent.mapsdk.internal.cb */
public class C113585cb extends C113564bn implements OfflineMapComponent, C113577bz.C113581a {

    /* renamed from: a */
    public static final String f339938a = "key_offline_map_opened_cities";

    /* renamed from: b */
    public static final String f339939b = "key_offline_map_config_version";

    /* renamed from: c */
    public static final String f339940c = "key_offline_map_config_md5";

    /* renamed from: d */
    public static final String f339941d = "key_offline_map_config_url";

    /* renamed from: e */
    public static final String f339942e = "sdk_offline_city_ver.json";

    /* renamed from: f */
    public static final String f339943f = "offline_city_list.json";

    /* renamed from: g */
    private static final String f339944g = "key_offline_map_items_state";

    /* renamed from: h */
    private C113955mh f339945h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f339946i;

    /* renamed from: j */
    private List<OfflineItem> f339947j = new ArrayList();

    /* renamed from: k */
    private List<OfflineItem> f339948k = new ArrayList();

    /* renamed from: l */
    private Map<String, C113588a> f339949l = new HashMap();

    /* renamed from: m */
    private File f339950m;

    /* renamed from: n */
    private File f339951n;

    /* renamed from: o */
    private String f339952o;

    /* renamed from: p */
    private C113589cc f339953p;

    /* renamed from: q */
    private Map<C113584ca, C113577bz> f339954q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public volatile Callback<List<OfflineItem>> f339955r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public OfflineMapSyncedListener f339956s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public volatile boolean f339957t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f339958u;

    /* renamed from: com.tencent.mapsdk.internal.cb$a */
    public static class C113588a extends JsonComposer {

        /* renamed from: a */
        public String f339962a;

        /* renamed from: b */
        public int f339963b;

        /* renamed from: c */
        public boolean f339964c;

        private C113588a() {
        }
    }

    /* renamed from: h */
    public static /* synthetic */ boolean m156458h(C113585cb cbVar) {
        if (!cbVar.f339951n.exists()) {
            C113889km.m157550c(C0949kl.f2251u, "请求离线城市列表...");
            C113638du.C113639a downloadOfflineMapCityList = ((C113612cy) ((C113630dm) C113601cl.m156511a(C113630dm.class)).mo171932h()).downloadOfflineMapCityList(cbVar.f339952o);
            downloadOfflineMapCityList.charset = "utf-8";
            if (downloadOfflineMapCityList.available()) {
                C113889km.m157550c(C0949kl.f2251u, "离线城市列表下载成功");
                C113642dw.C113643a aVar = new C113642dw.C113643a(downloadOfflineMapCityList);
                if (aVar.available()) {
                    cbVar.m156444a(aVar.f340033a);
                    C113889km.m157550c(C0949kl.f2251u, "离线城市列表解析成功");
                }
            }
        } else {
            cbVar.m156444a(new String(C113884kf.m157503c(cbVar.f339951n)));
            C113889km.m157550c(C0949kl.f2251u, "离线城市列表使用缓存");
        }
        if (cbVar.f339947j == null) {
            return false;
        }
        C113889km.m157550c(C0949kl.f2251u, "获得离线城市列表成功！");
        return true;
    }

    /* renamed from: b_ */
    public final void mo171784b_() {
        super.mo171784b_();
        for (Map.Entry next : this.f339954q.entrySet()) {
            C113577bz bzVar = (C113577bz) next.getValue();
            if (bzVar != null) {
                bzVar.f339909b = null;
                bzVar.f339908a = null;
            }
            next.setValue((Object) null);
        }
        this.f339954q.clear();
        this.f339955r = null;
        this.f339956s = null;
    }

    public OfflineItemController getOfflineItemController(OfflineItem offlineItem, OfflineStatusChangedListener offlineStatusChangedListener) {
        if (!this.f339946i) {
            return null;
        }
        return m156442a(offlineItem, offlineStatusChangedListener);
    }

    public synchronized List<OfflineItem> getOfflineItemList() {
        for (OfflineItem next : this.f339947j) {
            C113588a aVar = this.f339949l.get(next.getPinyin());
            if (aVar != null) {
                next.setPercentage(aVar.f339963b);
                next.setUpgrade(aVar.f339964c);
            }
        }
        return this.f339948k;
    }

    public boolean isOfflineMapEnable() {
        return this.f339946i;
    }

    public void syncLatestData(OfflineMapSyncedListener offlineMapSyncedListener) {
        this.f339956s = offlineMapSyncedListener;
        if (!this.f339957t) {
            m156447c(mo171785c_());
        }
    }

    /* renamed from: c */
    private void m156447c(final C113565bo boVar) {
        String b = this.f339945h.mo172399b(f339938a, "");
        if (this.f339946i || !TextUtils.isEmpty(b)) {
            C113792gv gvVar = boVar.f339861d;
            if (gvVar != null) {
                gvVar.mo172169p().mo172153a();
            }
            if (!this.f339957t) {
                this.f339957t = true;
                C113865kb.m157396a(new C113865kb.C113879g<Object>() {
                    public final Object call() {
                        boolean unused = C113585cb.this.f339958u = false;
                        if (!C113585cb.this.f339946i) {
                            C113585cb.m156443a(C113585cb.this, boVar);
                            return null;
                        }
                        C113585cb cbVar = C113585cb.this;
                        boolean unused2 = cbVar.f339958u = cbVar.m156452e();
                        C113585cb cbVar2 = C113585cb.this;
                        boolean unused3 = cbVar2.f339958u = C113585cb.m156458h(cbVar2);
                        return null;
                    }
                }).mo172280a(null, new C113865kb.C113868a<Object>() {
                    public final void callback(Object obj) {
                        if (C113585cb.this.f339955r != null) {
                            C113585cb.this.f339955r.callback(C113585cb.this.getOfflineItemList());
                            Callback unused = C113585cb.this.f339955r = null;
                        }
                        boolean unused2 = C113585cb.this.f339957t = false;
                        if (C113585cb.this.f339956s != null) {
                            C113585cb.this.f339956s.onSynced(C113585cb.this.f339958u);
                        }
                    }
                });
            }
        }
    }

    /* renamed from: d */
    private List<OfflineItem> m156450d() {
        List<OfflineItem> list;
        ArrayList arrayList = new ArrayList();
        String[] split = this.f339945h.mo172399b(f339938a, "").split(",");
        if (!(split.length == 0 || (list = this.f339947j) == null)) {
            for (OfflineItem next : list) {
                if (Arrays.binarySearch(split, next.getPinyin()) >= 0) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public boolean m156452e() {
        C113565bo c_ = mo171785c_();
        if (c_ == null) {
            return false;
        }
        int b = this.f339945h.mo172397b(f339939b);
        String a = this.f339945h.mo172391a(f339940c);
        C113889km.m157550c(C0949kl.f2251u, "检查离线配置更新, 当前v:" + b + "|md5:" + a + "obj:" + this);
        ArrayList arrayList = new ArrayList();
        FileUpdateReq fileUpdateReq = new FileUpdateReq(f339942e, b, a);
        arrayList.add(fileUpdateReq);
        String i = C113798hb.m157092i();
        String d = C113798hb.m157085d();
        String l = C113798hb.m157095l();
        String g = C113798hb.m157090g();
        String b2 = c_.mo171810w().mo171817b();
        String b3 = c_.mo171810w().mo171817b();
        String z = c_.mo171813z();
        String y = c_.mo171812y();
        String str = f339942e;
        String str2 = g;
        FileUpdateReq fileUpdateReq2 = fileUpdateReq;
        C113640dv.C113641a<SCFileUpdateRsp> checkUpdate = ((C113612cy) ((C113630dm) C113601cl.m156511a(C113630dm.class)).mo171932h()).checkUpdate(i, d, l, str2, b2, arrayList, b3, z, "", y, "");
        C113889km.m157550c(C0949kl.f2251u, "离线配置请求更新结束：" + checkUpdate.toHumanString());
        if (checkUpdate.available()) {
            FileUpdateRsp fileUpdateRsp = ((SCFileUpdateRsp) checkUpdate.f340031a).vItems.get(0);
            String a2 = this.f339950m.exists() ? C113903kv.m157738a(this.f339950m) : null;
            if (!this.f339950m.exists() || (fileUpdateRsp != null && str.equals(fileUpdateRsp.sName) && fileUpdateRsp.iVersion != fileUpdateReq2.iVersion && !TextUtils.isEmpty(fileUpdateRsp.sUpdateUrl) && fileUpdateRsp.iFileSize != 0 && fileUpdateRsp.iFileUpdated != 0 && !TextUtils.isEmpty(fileUpdateRsp.sMd5) && !fileUpdateRsp.sMd5.equals(a2))) {
                String str3 = fileUpdateRsp.sUpdateUrl;
                String str4 = fileUpdateRsp.sMd5;
                int i2 = fileUpdateRsp.iVersion;
                if (fileUpdateRsp.iFileUpdated == 0 && !this.f339950m.exists()) {
                    str3 = this.f339945h.mo172399b(f339941d, "");
                    str4 = this.f339945h.mo172399b(f339940c, "");
                    i2 = this.f339945h.mo172398b(f339939b, 0);
                }
                if (TextUtils.isEmpty(str3)) {
                    C113889km.m157553d(C0949kl.f2251u, "离线配置文件的请求链接为空！");
                    return false;
                } else if (NetManager.getInstance().builder().url(str3).downloadTo(this.f339950m).available()) {
                    if (C113903kv.m157738a(this.f339950m).equals(str4)) {
                        C113889km.m157550c(C0949kl.f2251u, "离线配置文件下载成功");
                        this.f339945h.mo172393a(f339939b, i2);
                        this.f339945h.mo172395a(f339940c, str4);
                        this.f339945h.mo172395a(f339941d, str3);
                    } else {
                        C113889km.m157550c(C0949kl.f2251u, "离线配置文件MD5校验失败");
                        C113884kf.m157500b(this.f339950m);
                    }
                }
            } else {
                C113889km.m157550c(C0949kl.f2251u, "跳过更新");
            }
        } else {
            C113889km.m157550c(C0949kl.f2251u, "离线地图配置请求错误：" + checkUpdate.toHumanString());
        }
        if (this.f339950m.exists()) {
            try {
                Object nextValue = new JSONTokener(new String(C113884kf.m157503c(this.f339950m))).nextValue();
                if (nextValue instanceof JSONObject) {
                    this.f339953p = (C113589cc) JsonUtils.parseToModel((JSONObject) nextValue, C113589cc.class, new Object[0]);
                    C113889km.m157550c(C0949kl.f2251u, "创建离线配置文件对象数据：" + this.f339953p);
                }
            } catch (JSONException unused) {
            }
        } else {
            C113889km.m157553d(C0949kl.f2251u, "离线配置文件不存在！");
        }
        if (this.f339953p == null) {
            return false;
        }
        C113889km.m157550c(C0949kl.f2251u, "获得离线配置成功！");
        return true;
    }

    /* renamed from: f */
    private boolean m156454f() {
        if (!this.f339951n.exists()) {
            C113889km.m157550c(C0949kl.f2251u, "请求离线城市列表...");
            C113638du.C113639a downloadOfflineMapCityList = ((C113612cy) ((C113630dm) C113601cl.m156511a(C113630dm.class)).mo171932h()).downloadOfflineMapCityList(this.f339952o);
            downloadOfflineMapCityList.charset = "utf-8";
            if (downloadOfflineMapCityList.available()) {
                C113889km.m157550c(C0949kl.f2251u, "离线城市列表下载成功");
                C113642dw.C113643a aVar = new C113642dw.C113643a(downloadOfflineMapCityList);
                if (aVar.available()) {
                    m156444a(aVar.f340033a);
                    C113889km.m157550c(C0949kl.f2251u, "离线城市列表解析成功");
                }
            }
        } else {
            m156444a(new String(C113884kf.m157503c(this.f339951n)));
            C113889km.m157550c(C0949kl.f2251u, "离线城市列表使用缓存");
        }
        if (this.f339947j == null) {
            return false;
        }
        C113889km.m157550c(C0949kl.f2251u, "获得离线城市列表成功！");
        return true;
    }

    /* renamed from: g */
    private void m156456g() {
        C113589cc ccVar = this.f339953p;
        if (ccVar != null && ccVar.f339969e != null && !this.f339947j.isEmpty()) {
            C113889km.m157550c(C0949kl.f2251u, "添加item的数据状态");
            Set<String> keySet = this.f339949l.keySet();
            for (OfflineItem next : this.f339947j) {
                Iterator<C113584ca> it = this.f339953p.f339969e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C113584ca next2 = it.next();
                    if (next.getPinyin().equals(next2.f339935c)) {
                        next.setSize((long) next2.f339936d);
                        Iterator<String> it4 = keySet.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            if (next.getPinyin().equals(it4.next())) {
                                C113577bz a = m156442a(next, (OfflineStatusChangedListener) null);
                                if (a != null) {
                                    next.setUpgrade(a.checkInvalidate());
                                }
                            }
                        }
                    }
                }
            }
            C113889km.m157550c(C0949kl.f2251u, "添加item的数据状态完成！！");
        }
    }

    /* renamed from: b */
    public final void mo171783b(C113565bo boVar) {
        super.mo171783b(boVar);
        if (this.f339957t) {
            this.f339955r = null;
            this.f339957t = false;
        }
        if (!this.f339949l.isEmpty()) {
            String collectionToJson = JsonUtils.collectionToJson(this.f339949l.values());
            C113889km.m157550c(C0949kl.f2251u, "保存持久化状态, json：".concat(String.valueOf(collectionToJson)));
            this.f339945h.mo172395a(f339944g, collectionToJson);
        }
    }

    /* renamed from: a */
    public final void mo171779a(Context context) {
        super.mo171779a(context);
        C113959ml a = C113959ml.m157965a(context, (TencentMapOptions) null);
        C113886kg.m157518a(a.f340852e);
        this.f339952o = a.f340852e;
        this.f339950m = new File(this.f339952o, f339942e);
        this.f339951n = new File(this.f339952o, f339943f);
        this.f339954q = new HashMap();
    }

    public void getOfflineItemList(Callback<List<OfflineItem>> callback) {
        this.f339955r = callback;
        if (!this.f339957t) {
            m156447c(mo171785c_());
        }
    }

    /* renamed from: d */
    private void m156451d(C113565bo boVar) {
        List<OfflineItem> list;
        ArrayList arrayList = new ArrayList();
        String[] split = this.f339945h.mo172399b(f339938a, "").split(",");
        if (!(split.length == 0 || (list = this.f339947j) == null)) {
            for (OfflineItem next : list) {
                if (Arrays.binarySearch(split, next.getPinyin()) >= 0) {
                    arrayList.add(next);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C113577bz a = m156442a((OfflineItem) it.next(), (OfflineStatusChangedListener) null);
            if (a != null) {
                a.mo171877b(boVar);
            }
        }
    }

    /* renamed from: b */
    public final void mo171882b(OfflineItem offlineItem, boolean z) {
        if (offlineItem != null) {
            String pinyin = offlineItem.getPinyin();
            C113588a aVar = this.f339949l.get(pinyin);
            if (aVar == null) {
                aVar = new C113588a();
                this.f339949l.put(pinyin, aVar);
            }
            aVar.f339962a = pinyin;
            aVar.f339964c = z;
            offlineItem.setUpgrade(z);
        }
    }

    /* renamed from: a */
    public final void mo171780a(C113565bo boVar) {
        super.mo171780a(boVar);
        this.f339946i = boVar.f339858a.isOfflineMapEnable();
        C113955mh a = C113957mj.m157958a(mo171782b(), boVar.mo171810w().f339870c);
        this.f339945h = a;
        String b = a.mo172399b(f339944g, "");
        C113889km.m157550c(C0949kl.f2251u, "获取持久化状态, json：".concat(String.valueOf(b)));
        if (!TextUtils.isEmpty(b)) {
            try {
                for (C113588a next : JsonUtils.parseToList(new JSONArray(b), C113588a.class, new Object[0])) {
                    this.f339949l.put(next.f339962a, next);
                }
            } catch (JSONException unused) {
            }
        }
        m156447c(boVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c3, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m156444a(java.lang.String r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x00c4 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r5)
            return
        L_0x0009:
            org.json.JSONTokener r0 = new org.json.JSONTokener     // Catch:{ all -> 0x00c4 }
            r0.<init>(r6)     // Catch:{ all -> 0x00c4 }
            java.lang.Object r6 = r0.nextValue()     // Catch:{ all -> 0x00c4 }
            boolean r0 = r6 instanceof org.json.JSONArray     // Catch:{ all -> 0x00c4 }
            if (r0 == 0) goto L_0x00c2
            org.json.JSONArray r6 = (org.json.JSONArray) r6     // Catch:{ all -> 0x00c4 }
            java.lang.Class<com.tencent.mapsdk.internal.by> r0 = com.tencent.mapsdk.internal.C113576by.class
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00c4 }
            java.util.List r6 = com.tencent.map.tools.json.JsonUtils.parseToList(r6, r0, r1)     // Catch:{ all -> 0x00c4 }
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x00c4 }
            if (r0 != 0) goto L_0x00c2
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x00c4 }
            r0.<init>()     // Catch:{ all -> 0x00c4 }
            r5.f339947j = r0     // Catch:{ all -> 0x00c4 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x00c4 }
            r0.<init>()     // Catch:{ all -> 0x00c4 }
            r5.f339948k = r0     // Catch:{ all -> 0x00c4 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x00c4 }
        L_0x0039:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x00c4 }
            if (r0 == 0) goto L_0x00bf
            java.lang.Object r0 = r6.next()     // Catch:{ all -> 0x00c4 }
            com.tencent.mapsdk.internal.by r0 = (com.tencent.mapsdk.internal.C113576by) r0     // Catch:{ all -> 0x00c4 }
            java.lang.String r1 = r0.f339906b     // Catch:{ all -> 0x00c4 }
            java.lang.String r2 = "china"
            boolean r1 = r1.startsWith(r2)     // Catch:{ all -> 0x00c4 }
            if (r1 == 0) goto L_0x0069
            com.tencent.map.sdk.comps.offlinemap.OfflineNation r1 = new com.tencent.map.sdk.comps.offlinemap.OfflineNation     // Catch:{ all -> 0x00c4 }
            r1.<init>()     // Catch:{ all -> 0x00c4 }
            java.lang.String r2 = r0.f339905a     // Catch:{ all -> 0x00c4 }
            r1.setName(r2)     // Catch:{ all -> 0x00c4 }
            java.lang.String r0 = r0.f339906b     // Catch:{ all -> 0x00c4 }
            r1.setPinyin(r0)     // Catch:{ all -> 0x00c4 }
            java.util.List<com.tencent.map.sdk.comps.offlinemap.OfflineItem> r0 = r5.f339948k     // Catch:{ all -> 0x00c4 }
            r0.add(r1)     // Catch:{ all -> 0x00c4 }
            java.util.List<com.tencent.map.sdk.comps.offlinemap.OfflineItem> r0 = r5.f339947j     // Catch:{ all -> 0x00c4 }
            r0.add(r1)     // Catch:{ all -> 0x00c4 }
            goto L_0x0039
        L_0x0069:
            java.util.List<com.tencent.mapsdk.internal.by> r1 = r0.f339907c     // Catch:{ all -> 0x00c4 }
            if (r1 == 0) goto L_0x00ae
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00c4 }
            if (r1 != 0) goto L_0x00ae
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00c4 }
            r1.<init>()     // Catch:{ all -> 0x00c4 }
            com.tencent.map.sdk.comps.offlinemap.OfflineProvince r2 = new com.tencent.map.sdk.comps.offlinemap.OfflineProvince     // Catch:{ all -> 0x00c4 }
            r2.<init>()     // Catch:{ all -> 0x00c4 }
            java.lang.String r3 = r0.f339905a     // Catch:{ all -> 0x00c4 }
            r2.setName(r3)     // Catch:{ all -> 0x00c4 }
            java.lang.String r3 = r0.f339906b     // Catch:{ all -> 0x00c4 }
            r2.setPinyin(r3)     // Catch:{ all -> 0x00c4 }
            r2.setCities(r1)     // Catch:{ all -> 0x00c4 }
            java.util.List<com.tencent.map.sdk.comps.offlinemap.OfflineItem> r3 = r5.f339948k     // Catch:{ all -> 0x00c4 }
            r3.add(r2)     // Catch:{ all -> 0x00c4 }
            java.util.List<com.tencent.mapsdk.internal.by> r0 = r0.f339907c     // Catch:{ all -> 0x00c4 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00c4 }
        L_0x0095:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x00c4 }
            if (r3 == 0) goto L_0x0039
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x00c4 }
            com.tencent.mapsdk.internal.by r3 = (com.tencent.mapsdk.internal.C113576by) r3     // Catch:{ all -> 0x00c4 }
            com.tencent.map.sdk.comps.offlinemap.OfflineCity r3 = r3.mo171875a((com.tencent.map.sdk.comps.offlinemap.OfflineProvince) r2)     // Catch:{ all -> 0x00c4 }
            java.util.List<com.tencent.map.sdk.comps.offlinemap.OfflineItem> r4 = r5.f339947j     // Catch:{ all -> 0x00c4 }
            r4.add(r3)     // Catch:{ all -> 0x00c4 }
            r1.add(r3)     // Catch:{ all -> 0x00c4 }
            goto L_0x0095
        L_0x00ae:
            r1 = 0
            com.tencent.map.sdk.comps.offlinemap.OfflineCity r0 = r0.mo171875a((com.tencent.map.sdk.comps.offlinemap.OfflineProvince) r1)     // Catch:{ all -> 0x00c4 }
            java.util.List<com.tencent.map.sdk.comps.offlinemap.OfflineItem> r1 = r5.f339948k     // Catch:{ all -> 0x00c4 }
            r1.add(r0)     // Catch:{ all -> 0x00c4 }
            java.util.List<com.tencent.map.sdk.comps.offlinemap.OfflineItem> r1 = r5.f339947j     // Catch:{ all -> 0x00c4 }
            r1.add(r0)     // Catch:{ all -> 0x00c4 }
            goto L_0x0039
        L_0x00bf:
            r5.m156456g()     // Catch:{ all -> 0x00c4 }
        L_0x00c2:
            monitor-exit(r5)
            return
        L_0x00c4:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113585cb.m156444a(java.lang.String):void");
    }

    /* renamed from: a */
    private C113577bz m156442a(OfflineItem offlineItem, OfflineStatusChangedListener offlineStatusChangedListener) {
        List<OfflineItem> list;
        C113565bo c_ = mo171785c_();
        if (offlineItem == null || (list = this.f339947j) == null || this.f339953p == null || c_ == null) {
            C113889km.m157553d(C0949kl.f2251u, "无效配置 config:" + this.f339953p + "|item:" + offlineItem);
            return null;
        }
        boolean z = false;
        Iterator<OfflineItem> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next() == offlineItem) {
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z) {
            C113584ca a = this.f339953p.mo171907a(offlineItem);
            if (a != null) {
                C113577bz bzVar = this.f339954q.get(a);
                if (bzVar == null) {
                    C113577bz bzVar2 = new C113577bz(c_, this.f339952o, offlineItem, a, this.f339945h, offlineStatusChangedListener);
                    this.f339954q.put(a, bzVar2);
                    bzVar = bzVar2;
                }
                bzVar.f339908a = offlineStatusChangedListener;
                bzVar.f339909b = this;
                C113889km.m157550c(C0949kl.f2251u, "获得离线城市[" + offlineItem.getName() + "]的配置成功！");
                return bzVar;
            }
        } else {
            C113889km.m157553d(C0949kl.f2251u, "无效城市：".concat(String.valueOf(offlineItem)));
        }
        return null;
    }

    /* renamed from: a */
    public final void mo171881a(OfflineItem offlineItem, boolean z) {
        String b = this.f339945h.mo172399b(f339938a, "");
        C113889km.m157550c(C0949kl.f2251u, "当前开启城市IDS：".concat(String.valueOf(b)));
        String[] split = b.split(",");
        int binarySearch = Arrays.binarySearch(split, offlineItem.getPinyin());
        if (z) {
            if (binarySearch < 0) {
                String str = b + offlineItem.getPinyin() + ",";
                C113889km.m157550c(C0949kl.f2251u, "新增开启城市IDS：".concat(String.valueOf(str)));
                this.f339945h.mo172395a(f339938a, str);
            }
        } else if (binarySearch >= 0) {
            StringBuilder sb = new StringBuilder();
            for (String str2 : split) {
                if (!str2.equals(offlineItem.getPinyin())) {
                    sb.append(str2);
                    sb.append(",");
                }
            }
            String sb4 = sb.toString();
            C113889km.m157550c(C0949kl.f2251u, "剩余开启城市IDS：".concat(String.valueOf(sb4)));
            this.f339945h.mo172395a(f339938a, sb4);
        }
    }

    /* renamed from: a */
    public final void mo171880a(OfflineItem offlineItem, int i) {
        if (offlineItem != null) {
            String pinyin = offlineItem.getPinyin();
            C113588a aVar = this.f339949l.get(pinyin);
            if (aVar == null) {
                aVar = new C113588a();
                this.f339949l.put(pinyin, aVar);
            }
            aVar.f339962a = pinyin;
            aVar.f339963b = i;
            offlineItem.setPercentage(i);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m156443a(C113585cb cbVar, C113565bo boVar) {
        List<OfflineItem> list;
        ArrayList arrayList = new ArrayList();
        String[] split = cbVar.f339945h.mo172399b(f339938a, "").split(",");
        if (!(split.length == 0 || (list = cbVar.f339947j) == null)) {
            for (OfflineItem next : list) {
                if (Arrays.binarySearch(split, next.getPinyin()) >= 0) {
                    arrayList.add(next);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C113577bz a = cbVar.m156442a((OfflineItem) it.next(), (OfflineStatusChangedListener) null);
            if (a != null) {
                a.mo171877b(boVar);
            }
        }
    }
}
