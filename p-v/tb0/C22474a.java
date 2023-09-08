package tb0;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.tencent.p014mm.msgsubscription.SubscribeMsgRequestResult;
import com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem;
import com.tencent.p014mm.msgsubscription.presenter.SubscribeMsgSettingData;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kj2.C117407d;
import rd0.C22222c;
import rd0.C22226d;
import rd0.C48018e;
import rx3.C13604l;
import sx3.C110818d0;
import vd0.C22735a;
import vd0.C22736b;
import wd0.C22894a;
import zd0.C119100f;
import zd0.C119102m;

/* renamed from: tb0.a */
public final class C22474a extends C22735a {

    /* renamed from: b */
    public boolean f63643b;

    /* renamed from: c */
    public C22222c f63644c = C48018e.f128802a.mo72802a("name_biz");

    /* renamed from: d */
    public SubscribeMsgRequestResult f63645d;

    /* renamed from: e */
    public HashMap<String, SubscribeMsgTmpItem> f63646e = new HashMap<>();

    /* renamed from: f */
    public boolean f63647f = true;

    /* renamed from: g */
    public String f63648g = "";

    /* renamed from: h */
    public C22894a.C22896c f63649h = new C22894a.C22896c();

    /* renamed from: i */
    public Activity f63650i;

    /* renamed from: j */
    public C22476b f63651j = new C22476b(this);

    /* renamed from: tb0.a$a */
    public static final class C22475a implements C119100f.C119101a {

        /* renamed from: a */
        public final /* synthetic */ C22474a f63652a;

        public C22475a(C22474a aVar) {
            this.f63652a = aVar;
        }

        /* renamed from: a */
        public void mo35620a(SubscribeMsgTmpItem subscribeMsgTmpItem, boolean z) {
            C87412m.m108594g(subscribeMsgTmpItem, "item");
            C22474a aVar = this.f63652a;
            aVar.getClass();
            SubscribeMsgRequestResult subscribeMsgRequestResult = aVar.f63645d;
            C87412m.m108591d(subscribeMsgRequestResult);
            Iterator<SubscribeMsgTmpItem> it = subscribeMsgRequestResult.f49004h.iterator();
            while (it.hasNext()) {
                SubscribeMsgTmpItem next = it.next();
                if (TextUtils.equals(subscribeMsgTmpItem.f49021f, next.f49021f)) {
                    next.f49025j = z ? 1 : 0;
                    subscribeMsgTmpItem.f49025j = z;
                    return;
                }
            }
        }

        /* renamed from: b */
        public boolean mo35621b(SubscribeMsgTmpItem subscribeMsgTmpItem) {
            C87412m.m108594g(subscribeMsgTmpItem, "item");
            this.f63652a.getClass();
            return subscribeMsgTmpItem.f49025j == 1;
        }
    }

    /* renamed from: tb0.a$b */
    public static final class C22476b implements C22226d {

        /* renamed from: a */
        public final /* synthetic */ C22474a f63653a;

        public C22476b(C22474a aVar) {
            this.f63653a = aVar;
        }

        /* renamed from: a */
        public void mo26257a(String str, SubscribeMsgRequestResult subscribeMsgRequestResult) {
            C87412m.m108594g(str, "bizUsername");
            C87412m.m108594g(subscribeMsgRequestResult, "result");
            Log.m105924i("MicroMsg.BizSubscribeMsgSettingPagePresenter", "alvinluo updateSubscribeMsgListAsync onSuccess");
            C22474a aVar = this.f63653a;
            ArrayList<SubscribeMsgTmpItem> arrayList = subscribeMsgRequestResult.f49004h;
            aVar.getClass();
            if (arrayList != null) {
                for (SubscribeMsgTmpItem subscribeMsgTmpItem : arrayList) {
                    SubscribeMsgTmpItem subscribeMsgTmpItem2 = aVar.f63646e.get(subscribeMsgTmpItem.f49021f);
                    if (subscribeMsgTmpItem2 != null) {
                        subscribeMsgTmpItem2.f49025j = subscribeMsgTmpItem.f49025j;
                    }
                }
            }
        }

        /* renamed from: e */
        public void mo26258e(int i, int i2, String str) {
            C87412m.m108594g(str, "errMsg");
            Log.m105921e("MicroMsg.BizSubscribeMsgSettingPagePresenter", "alvinluo updateSubscribeMsgListAsync onError errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        }
    }

    /* renamed from: a */
    public void mo35609a(String str, C22736b.C22737a aVar) {
        C87412m.m108594g(str, "bizUsername");
        C87412m.m108594g(aVar, "l");
        Activity activity = this.f63650i;
        if (activity != null) {
            SubscribeMsgRequestResult subscribeMsgRequestResult = (SubscribeMsgRequestResult) activity.getIntent().getParcelableExtra("key_biz_data");
            this.f63645d = subscribeMsgRequestResult;
            this.f63648g = str;
            if (subscribeMsgRequestResult != null) {
                C87412m.m108591d(subscribeMsgRequestResult);
                this.f63643b = subscribeMsgRequestResult.f49008o;
                SubscribeMsgRequestResult subscribeMsgRequestResult2 = this.f63645d;
                C87412m.m108591d(subscribeMsgRequestResult2);
                mo35617i(subscribeMsgRequestResult2.f49004h);
                SubscribeMsgRequestResult subscribeMsgRequestResult3 = this.f63645d;
                C87412m.m108591d(subscribeMsgRequestResult3);
                aVar.mo35839b(new SubscribeMsgSettingData(subscribeMsgRequestResult3, false));
                mo35618j(this.f63645d);
                mo35619k(1);
                return;
            }
            Activity activity2 = this.f63650i;
            if (activity2 != null) {
                boolean booleanExtra = activity2.getIntent().getBooleanExtra("key_need_load_from_remote", false);
                Log.m105918d("MicroMsg.BizSubscribeMsgSettingPagePresenter", "alvinluo loadData need load from remote");
                if (booleanExtra) {
                    C22222c cVar = this.f63644c;
                    if (cVar != null) {
                        cVar.mo35376q(str, new C22477b(this, aVar));
                        return;
                    }
                    return;
                }
                aVar.mo35838a();
                return;
            }
            C87412m.m108603p(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            throw null;
        }
        C87412m.m108603p(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        throw null;
    }

    /* renamed from: b */
    public void mo35610b(boolean z) {
        this.f63643b = z;
    }

    /* renamed from: c */
    public C119100f<?> mo35611c(MMActivity mMActivity) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        return new C119102m(mMActivity, new C22475a(this));
    }

    /* renamed from: d */
    public void mo35612d(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f63650i = activity;
        this.f63649h.f65810c = System.currentTimeMillis();
        C22894a.C22896c cVar = this.f63649h;
        Intent intent = activity.getIntent();
        int i = 0;
        if (intent != null) {
            i = intent.getIntExtra("key_enter_scene", 0);
        }
        cVar.f65808a = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0062, code lost:
        if ((r4 != null && r4.f49008o == r6.f63643b) == false) goto L_0x0064;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo35613e(android.app.Activity r7) {
        /*
            r6 = this;
            java.lang.String r0 = "activity"
            gy3.C87412m.m108594g(r7, r0)
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]
            boolean r0 = r6.f63643b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1 = 0
            r7[r1] = r0
            com.tencent.mm.msgsubscription.SubscribeMsgRequestResult r0 = r6.f63645d
            r2 = 0
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.f49008o
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x001e
        L_0x001d:
            r0 = r2
        L_0x001e:
            r3 = 1
            r7[r3] = r0
            r0 = 2
            boolean r4 = r6.f63647f
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r7[r0] = r4
            java.lang.String r0 = "MicroMsg.BizSubscribeMsgSettingPagePresenter"
            java.lang.String r4 = "alvinluo onPause updateSubscribeMsgListAsync isSubscribeMsgOpened: %b, origin opened: %s, needUpdate: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r4, r7)
            com.tencent.mm.msgsubscription.SubscribeMsgRequestResult r7 = r6.f63645d
            if (r7 == 0) goto L_0x0038
            java.util.ArrayList<com.tencent.mm.msgsubscription.SubscribeMsgTmpItem> r4 = r7.f49004h
            goto L_0x0039
        L_0x0038:
            r4 = r2
        L_0x0039:
            if (r4 == 0) goto L_0x00a2
            boolean r4 = r6.f63647f
            if (r4 == 0) goto L_0x00a2
            java.util.HashMap<java.lang.String, com.tencent.mm.msgsubscription.SubscribeMsgTmpItem> r4 = r6.f63646e
            if (r7 == 0) goto L_0x0046
            java.util.ArrayList<com.tencent.mm.msgsubscription.SubscribeMsgTmpItem> r7 = r7.f49004h
            goto L_0x0047
        L_0x0046:
            r7 = r2
        L_0x0047:
            java.util.List r7 = r6.mo35616h(r4, r7)
            r4 = r7
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            boolean r4 = r4.isEmpty()
            r4 = r4 ^ r3
            if (r4 != 0) goto L_0x0064
            com.tencent.mm.msgsubscription.SubscribeMsgRequestResult r4 = r6.f63645d
            if (r4 == 0) goto L_0x0061
            boolean r4 = r4.f49008o
            boolean r5 = r6.f63643b
            if (r4 != r5) goto L_0x0061
            r4 = 1
            goto L_0x0062
        L_0x0061:
            r4 = 0
        L_0x0062:
            if (r4 != 0) goto L_0x0065
        L_0x0064:
            r1 = 1
        L_0x0065:
            if (r1 == 0) goto L_0x009d
            rd0.f r0 = new rd0.f
            r0.<init>()
            vd0.c r1 = r6.f65425a
            if (r1 == 0) goto L_0x0096
            java.lang.String r1 = r1.getUserName()
            java.lang.String r2 = "<set-?>"
            gy3.C87412m.m108594g(r1, r2)
            r0.f62967a = r1
            java.util.List<com.tencent.mm.msgsubscription.SubscribeMsgTmpItem> r1 = r0.f62969c
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.addAll(r7)
            boolean r7 = r6.f63643b
            r0.f62970d = r7
            tb0.a$b r7 = r6.f63651j
            r0.f62975i = r7
            r0.f62976j = r3
            r0.f62977k = r3
            rd0.c r7 = r6.f63644c
            if (r7 == 0) goto L_0x00a2
            r7.mo35370k(r0)
            goto L_0x00a2
        L_0x0096:
            java.lang.String r7 = "view"
            gy3.C87412m.m108603p(r7)
            throw r2
        L_0x009d:
            java.lang.String r7 = "alvinluo updatedList is empty and no need to update"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)
        L_0x00a2:
            java.util.HashMap<java.lang.String, com.tencent.mm.msgsubscription.SubscribeMsgTmpItem> r7 = r6.f63646e
            r7.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb0.C22474a.mo35613e(android.app.Activity):void");
    }

    /* renamed from: f */
    public void mo35614f(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f63647f = activity.getIntent().getBooleanExtra("key_need_update", true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0041  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo35615g(android.app.Activity r13) {
        /*
            r12 = this;
            java.lang.String r0 = "activity"
            gy3.C87412m.m108594g(r13, r0)
            boolean r0 = r12.f63647f
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0056
            java.lang.String r0 = "MicroMsg.BizSubscribeMsgSettingPagePresenter"
            java.lang.String r3 = "alvinluo onFinish not need update and pass data back"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r0, r3)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.util.HashMap<java.lang.String, com.tencent.mm.msgsubscription.SubscribeMsgTmpItem> r3 = r12.f63646e
            com.tencent.mm.msgsubscription.SubscribeMsgRequestResult r4 = r12.f63645d
            if (r4 == 0) goto L_0x0020
            java.util.ArrayList<com.tencent.mm.msgsubscription.SubscribeMsgTmpItem> r4 = r4.f49004h
            goto L_0x0021
        L_0x0020:
            r4 = 0
        L_0x0021:
            java.util.List r3 = r12.mo35616h(r3, r4)
            boolean r4 = r3.isEmpty()
            r4 = r4 ^ r1
            if (r4 != 0) goto L_0x003e
            com.tencent.mm.msgsubscription.SubscribeMsgRequestResult r4 = r12.f63645d
            if (r4 == 0) goto L_0x0038
            boolean r4 = r4.f49008o
            boolean r5 = r12.f63643b
            if (r4 != r5) goto L_0x0038
            r4 = 1
            goto L_0x0039
        L_0x0038:
            r4 = 0
        L_0x0039:
            if (r4 != 0) goto L_0x003c
            goto L_0x003e
        L_0x003c:
            r4 = 0
            goto L_0x003f
        L_0x003e:
            r4 = 1
        L_0x003f:
            if (r4 == 0) goto L_0x004d
            com.tencent.mm.msgsubscription.api.ISubscribeMsgService$Companion$SubscribeMsgListWrapper r5 = new com.tencent.mm.msgsubscription.api.ISubscribeMsgService$Companion$SubscribeMsgListWrapper
            boolean r6 = r12.f63643b
            r5.<init>(r3, r6)
            java.lang.String r3 = "key_biz_data"
            r0.putExtra(r3, r5)
        L_0x004d:
            java.lang.String r3 = "key_need_update"
            r0.putExtra(r3, r4)
            r3 = -1
            r13.setResult(r3, r0)
        L_0x0056:
            wd0.a$c r13 = r12.f63649h
            boolean r0 = r12.f63643b
            r13.f65811d = r0
            com.tencent.mm.msgsubscription.SubscribeMsgRequestResult r13 = r12.f63645d
            if (r13 == 0) goto L_0x0082
            java.util.ArrayList<com.tencent.mm.msgsubscription.SubscribeMsgTmpItem> r13 = r13.f49004h
            if (r13 == 0) goto L_0x0082
            java.util.Iterator r13 = r13.iterator()
        L_0x0068:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0082
            java.lang.Object r0 = r13.next()
            com.tencent.mm.msgsubscription.SubscribeMsgTmpItem r0 = (com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem) r0
            wd0.a$c r3 = r12.f63649h
            java.util.ArrayList<java.lang.Integer> r3 = r3.f65817j
            int r0 = r0.f49025j
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            goto L_0x0068
        L_0x0082:
            r13 = 2
            r12.mo35619k(r13)
            java.lang.String r0 = r12.f63648g
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0090
            r0 = 1
            goto L_0x0091
        L_0x0090:
            r0 = 0
        L_0x0091:
            if (r0 == 0) goto L_0x012d
            com.tencent.mm.msgsubscription.SubscribeMsgRequestResult r0 = r12.f63645d
            if (r0 == 0) goto L_0x012d
            wd0.a r3 = wd0.C22894a.f65798a
            java.lang.String r3 = r12.f63648g
            gy3.C87412m.m108591d(r0)
            boolean r0 = r0.f49008o
            com.tencent.mm.msgsubscription.SubscribeMsgRequestResult r4 = r12.f63645d
            gy3.C87412m.m108591d(r4)
            java.util.ArrayList<com.tencent.mm.msgsubscription.SubscribeMsgTmpItem> r4 = r4.f49004h
            java.lang.String r5 = "bizUsername"
            gy3.C87412m.m108594g(r3, r5)
            java.lang.String r5 = "subscribeMsgTmpItemList"
            gy3.C87412m.m108594g(r4, r5)
            r5 = 3
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r6[r2] = r3
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            r6[r1] = r7
            int r7 = r4.size()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r13] = r7
            java.lang.String r7 = "MicroMsg.SubscribeMsgReporter"
            java.lang.String r8 = "alvinluo reportSubscribeMsgListOfProfile bizUsername: %s, switchOpen: %b, size: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r6)
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x00d7:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x0109
            java.lang.Object r8 = r4.next()
            com.tencent.mm.msgsubscription.SubscribeMsgTmpItem r8 = (com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem) r8
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            java.lang.String r10 = r8.f49021f
            java.lang.String r11 = "scopeID"
            r9.put(r11, r10)
            java.lang.String r10 = r8.f49020e
            java.lang.String r11 = "scopeName"
            r9.put(r11, r10)
            int r8 = r8.f49025j
            if (r8 != r1) goto L_0x00fe
            r8 = 1
            goto L_0x00ff
        L_0x00fe:
            r8 = 0
        L_0x00ff:
            java.lang.String r10 = "selected"
            r9.put(r10, r8)
            r6.put(r9)
            goto L_0x00d7
        L_0x0109:
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.String r8 = r6.toString()
            r4[r2] = r8
            java.lang.String r8 = "alvinluo reportSubscribeMsgListOfProfile json: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r7, r8, r4)
            kj2.d r4 = kj2.C117407d.INSTANCE
            r7 = 17637(0x44e5, float:2.4715E-41)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5[r1] = r0
            java.lang.String r0 = r6.toString()
            r5[r13] = r0
            r4.mo160131h(r7, r5)
        L_0x012d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb0.C22474a.mo35615g(android.app.Activity):void");
    }

    /* renamed from: h */
    public final List<SubscribeMsgTmpItem> mo35616h(HashMap<String, SubscribeMsgTmpItem> hashMap, List<SubscribeMsgTmpItem> list) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (SubscribeMsgTmpItem subscribeMsgTmpItem : list) {
                SubscribeMsgTmpItem subscribeMsgTmpItem2 = hashMap.get(subscribeMsgTmpItem.f49021f);
                boolean z = true;
                if (subscribeMsgTmpItem2 == null || (str = subscribeMsgTmpItem2.f49021f) == null || !str.equals(subscribeMsgTmpItem.f49021f)) {
                    z = false;
                }
                if (!z) {
                    arrayList.add(subscribeMsgTmpItem);
                } else if (subscribeMsgTmpItem2.f49025j != subscribeMsgTmpItem.f49025j) {
                    arrayList.add(subscribeMsgTmpItem);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public final void mo35617i(List<SubscribeMsgTmpItem> list) {
        C22474a aVar = this;
        aVar.f63646e.clear();
        if (list != null) {
            for (SubscribeMsgTmpItem subscribeMsgTmpItem : list) {
                HashMap<String, SubscribeMsgTmpItem> hashMap = aVar.f63646e;
                String str = subscribeMsgTmpItem.f49021f;
                String str2 = subscribeMsgTmpItem.f49020e;
                int i = subscribeMsgTmpItem.f49022g;
                int i2 = subscribeMsgTmpItem.f49023h;
                ArrayList<C13604l<String, String>> arrayList = subscribeMsgTmpItem.f49024i;
                int i3 = subscribeMsgTmpItem.f49025j;
                boolean z = subscribeMsgTmpItem.f49026n;
                String str3 = subscribeMsgTmpItem.f49019d;
                C87412m.m108594g(str2, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                C87412m.m108594g(str, "templateId");
                C87412m.m108594g(arrayList, "keyWordList");
                C87412m.m108594g(str3, "sceneDesc");
                SubscribeMsgTmpItem subscribeMsgTmpItem2 = r4;
                SubscribeMsgTmpItem subscribeMsgTmpItem3 = new SubscribeMsgTmpItem(str2, str, i, i2, arrayList, i3, z, str3, "", false, -1, false, false, "", false, false);
                hashMap.put(str, subscribeMsgTmpItem2);
                aVar = this;
            }
        }
    }

    /* renamed from: j */
    public final void mo35618j(SubscribeMsgRequestResult subscribeMsgRequestResult) {
        if (subscribeMsgRequestResult != null) {
            C22894a.C22896c cVar = this.f63649h;
            String str = this.f63648g;
            cVar.getClass();
            C87412m.m108594g(str, "<set-?>");
            cVar.f65809b = str;
            C22894a.C22896c cVar2 = this.f63649h;
            cVar2.f65811d = subscribeMsgRequestResult.f49008o;
            cVar2.f65812e = subscribeMsgRequestResult.f49004h.size();
            for (SubscribeMsgTmpItem subscribeMsgTmpItem : subscribeMsgRequestResult.f49004h) {
                this.f63649h.f65813f.add(subscribeMsgTmpItem.f49021f);
                this.f63649h.f65814g.add(Integer.valueOf(subscribeMsgTmpItem.f49022g));
                this.f63649h.f65815h.add(subscribeMsgTmpItem.f49020e);
                this.f63649h.f65816i.add(Integer.valueOf(subscribeMsgTmpItem.f49025j));
            }
        }
    }

    /* renamed from: k */
    public final void mo35619k(int i) {
        C22894a.C22896c cVar = this.f63649h;
        C22894a aVar = C22894a.f65798a;
        C87412m.m108594g(cVar, "reportInfo");
        C117407d.INSTANCE.mo160131h(21814, cVar.f65809b, Long.valueOf(cVar.f65810c), Integer.valueOf(i), Long.valueOf(System.currentTimeMillis()), Integer.valueOf(cVar.f65811d ? 1 : 0), Integer.valueOf(cVar.f65812e), C110818d0.m150921S(cVar.f65813f, "#", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null), C110818d0.m150921S(cVar.f65816i, "#", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null), C110818d0.m150921S(cVar.f65815h, "#", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null), C110818d0.m150921S(cVar.f65814g, "#", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null), C110818d0.m150921S(cVar.f65817j, "#", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null), Integer.valueOf(cVar.f65808a));
    }
}
