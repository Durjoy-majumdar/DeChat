package xd1;

import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.activity.poi.fragment.FinderPoiTabFragment;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import h81.C59774i;
import ht1.C98522w3;
import ob0.C11385n;
import od1.C11403f;
import p217oq.C11716d;
import p217oq.C11717f;
import rs1.C13442s8;
import te3.C48713ah1;
import te3.m74;
import u91.C22623c;

/* renamed from: xd1.q */
public final class C15669q extends C11403f<C48713ah1> implements C11385n {

    /* renamed from: A */
    public C98522w3.C8810a f42346A;

    /* renamed from: B */
    public FinderPoiTabFragment f42347B;

    /* renamed from: h4 */
    public long f42348h4;

    /* renamed from: i4 */
    public long f42349i4;

    /* renamed from: j4 */
    public String f42350j4;

    /* renamed from: k4 */
    public boolean f42351k4;

    /* renamed from: l4 */
    public String f42352l4 = "FinderPoiDrawer";

    /* renamed from: v */
    public boolean f42353v;

    /* renamed from: w */
    public boolean f42354w;

    /* renamed from: x */
    public boolean f42355x;

    /* renamed from: y */
    public boolean f42356y;

    /* renamed from: z */
    public m74 f42357z;

    /* renamed from: xd1.q$a */
    public static final class C15670a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C15669q f42358d;

        public C15670a(C15669q qVar) {
            this.f42358d = qVar;
        }

        public final void run() {
            this.f42358d.mo321j4(null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15669q(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: a */
    public final void mo14413a() {
        if (this.f42348h4 != 0) {
            if (this.f42351k4) {
                C11717f fVar = (C11717f) C86312j.m106911c(C11717f.class);
                String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
                String str = this.f42352l4;
                long currentTimeMillis = System.currentTimeMillis();
                long j = this.f42348h4;
                long j2 = currentTimeMillis - j;
                long currentTimeMillis2 = System.currentTimeMillis();
                String str2 = this.f42350j4;
                String str3 = ((C13442s8) C39818r.f106831a.mo62443b(getContext()).mo75002a(C13442s8.class)).mo12861q3().f134671e;
                if (str3 == null) {
                    str3 = "";
                }
                fVar.f50(new C22623c(Wb, str, j2, j, currentTimeMillis2, "", str2, 1, false, C11716d.f34294a, (String) null, str3, 1280, (C8480h) null));
            }
            this.f42348h4 = 0;
        }
    }

    /* renamed from: d4 */
    public int mo2227d4() {
        return C0966R.C0971layout.a8p;
    }

    /* renamed from: f */
    public final void mo14414f() {
        if (this.f42349i4 != 0) {
            C11717f fVar = (C11717f) C86312j.m106911c(C11717f.class);
            String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
            String str = this.f42352l4;
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.f42349i4;
            long j2 = currentTimeMillis - j;
            long currentTimeMillis2 = System.currentTimeMillis();
            String str2 = this.f42350j4;
            String str3 = ((C13442s8) C39818r.f106831a.mo62443b(getContext()).mo75002a(C13442s8.class)).mo12861q3().f134671e;
            if (str3 == null) {
                str3 = "";
            }
            fVar.f50(new C22623c(Wb, str, j2, j, currentTimeMillis2, "", str2, 0, false, C11716d.f34294a, (String) null, str3, 1280, (C8480h) null));
            this.f42349i4 = 0;
        }
    }

    /* renamed from: f4 */
    public void mo2228f4() {
        this.f42353v = getIntent().getBooleanExtra("key_drawer_mode", false);
        this.f42354w = getIntent().getBooleanExtra("key_drawer_allow_no_poiid", false);
        this.f42351k4 = getIntent().getBooleanExtra("key_poi_drawer_report_stay", false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r0 = (r0 = r0.f130516g).f145743d;
     */
    /* renamed from: k4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo322k4(java.lang.String r4, int r5, int r6) {
        /*
            r3 = this;
            java.lang.String r0 = "tabName"
            gy3.C87412m.m108594g(r4, r0)
            yd1.a r4 = yd1.C15962a.f42858a
            T r0 = r3.f33558t
            te3.ah1 r0 = (te3.C48713ah1) r0
            r1 = 0
            if (r0 == 0) goto L_0x001a
            te3.z74 r0 = r0.f130516g
            if (r0 == 0) goto L_0x001a
            te3.qe3 r0 = r0.f145743d
            if (r0 == 0) goto L_0x001a
            te3.je3 r0 = r0.f140264d
            goto L_0x001b
        L_0x001a:
            r0 = r1
        L_0x001b:
            java.lang.String r2 = "tabtype"
            org.json.JSONObject r4 = r4.mo14614a(r0, r5, r2)
            dp1.f2 r5 = dp1.C7435f2.f25626a
            rs1.s8$a r0 = rs1.C13442s8.f38060Q0
            androidx.appcompat.app.AppCompatActivity r2 = r3.getActivity()
            rs1.s8 r0 = r0.mo12873f(r2)
            if (r0 == 0) goto L_0x0034
            te3.hj1 r1 = r0.mo12861q3()
        L_0x0034:
            java.lang.String r0 = "poitab"
            r5.mo8577a(r1, r0, r6, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xd1.C15669q.mo322k4(java.lang.String, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0089  */
    /* renamed from: m4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo323m4() {
        /*
            r15 = this;
            boolean r0 = r15.f42353v
            if (r0 == 0) goto L_0x000d
            boolean r0 = r15.f42355x
            if (r0 == 0) goto L_0x000c
            boolean r0 = r15.f42356y
            if (r0 == 0) goto L_0x000d
        L_0x000c:
            return
        L_0x000d:
            java.lang.String r0 = "Finder.FinderTabUIC"
            java.lang.String r1 = "startLoad"
            ft3.C116895f.m164891c(r0, r1)
            r0 = 1
            r15.f42356y = r0
            te3.m74 r1 = new te3.m74
            r1.<init>()
            android.content.Intent r2 = r15.getIntent()
            java.lang.String r3 = "key_location"
            byte[] r2 = r2.getByteArrayExtra(r3)
            r3 = 0
            r4 = 0
            if (r2 != 0) goto L_0x002d
        L_0x002b:
            r7 = r4
            goto L_0x0040
        L_0x002d:
            r1.parseFrom(r2)     // Catch:{ Exception -> 0x0032 }
            r7 = r1
            goto L_0x0040
        L_0x0032:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r2[r3] = r1
            java.lang.String r1 = "safeParser"
            java.lang.String r5 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r1, r5, r2)
            goto L_0x002b
        L_0x0040:
            r15.f42357z = r7
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r2 = "key_from_type"
            java.io.Serializable r1 = r1.getSerializableExtra(r2)
            boolean r2 = r1 instanceof ht1.C98522w3.C8810a
            if (r2 == 0) goto L_0x0053
            ht1.w3$a r1 = (ht1.C98522w3.C8810a) r1
            goto L_0x0054
        L_0x0053:
            r1 = r4
        L_0x0054:
            r15.f42346A = r1
            boolean r1 = r15.f42353v
            if (r1 == 0) goto L_0x007d
            boolean r1 = r15.f42354w
            if (r1 != 0) goto L_0x007d
            if (r7 == 0) goto L_0x0063
            java.lang.String r1 = r7.f184224i
            goto L_0x0064
        L_0x0063:
            r1 = r4
        L_0x0064:
            if (r1 == 0) goto L_0x006e
            int r1 = r1.length()
            if (r1 != 0) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r0 = 0
        L_0x006e:
            if (r0 == 0) goto L_0x007d
            androidx.viewpager.widget.ViewPager r0 = r15.f162509g
            if (r0 == 0) goto L_0x007c
            xd1.q$a r1 = new xd1.q$a
            r1.<init>(r15)
            r0.post(r1)
        L_0x007c:
            return
        L_0x007d:
            android.content.Intent r0 = r15.getIntent()
            java.lang.String r1 = "key_from_scene"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L_0x0095
            android.content.Intent r0 = r15.getIntent()
            int r0 = r0.getIntExtra(r1, r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L_0x0095:
            r10 = r4
            ht1.w3$a r8 = r15.f42346A
            if (r7 == 0) goto L_0x00be
            if (r8 == 0) goto L_0x00be
            je1.e4 r0 = new je1.e4
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 48
            r14 = 0
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r0.f29085i = r3
            f40.g r1 = f40.C86709a0.m107529k()
            ob0.b0 r1 = r1.f251779b
            r1.mo123460f(r0)
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.f251779b
            r1 = 5225(0x1469, float:7.322E-42)
            r0.mo123455a(r1, r15)
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xd1.C15669q.mo323m4():void");
    }

    public void onDestroy() {
        super.onDestroy();
        mo14413a();
    }

    public void onPause() {
        super.onPause();
        mo14414f();
    }

    public void onResume() {
        super.onResume();
        if (this.f42348h4 != 0) {
            this.f42349i4 = System.currentTimeMillis();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        r3 = (r3 = r1.f130516g).f145743d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r19, int r20, java.lang.String r21, ob0.C117747y r22) {
        /*
            r18 = this;
            r6 = r18
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof je1.C9305e4
            if (r2 == 0) goto L_0x026a
            f40.g r2 = f40.C86709a0.m107529k()
            ob0.b0 r2 = r2.f251779b
            r3 = 5225(0x1469, float:7.322E-42)
            r2.mo123470p(r3, r6)
            if (r19 != 0) goto L_0x0265
            if (r0 != 0) goto L_0x0265
            r0 = r1
            je1.e4 r0 = (je1.C9305e4) r0
            ob0.c r0 = r0.f29083g
            ob0.c$d r0 = r0.f127056b
            pe3.a r0 = r0.f127083a
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderPoiStreamResponse"
            gy3.C87412m.m108592e(r0, r1)
            te3.ah1 r0 = (te3.C48713ah1) r0
            r6.f33558t = r0
            r6.mo321j4(r0)
            T r0 = r6.f33558t
            te3.ah1 r0 = (te3.C48713ah1) r0
            r7 = 0
            r8 = 0
            r9 = 1
            if (r0 == 0) goto L_0x0151
            te3.ch1 r0 = r0.f130523q
            if (r0 == 0) goto L_0x0151
            java.util.LinkedList<te3.bh1> r0 = r0.f131728d
            if (r0 == 0) goto L_0x0151
            od1.C11405h.C11406a.m11254b(r18)
            boolean r16 = od1.C11405h.C11406a.m11253a(r18)
            java.util.Iterator r17 = r0.iterator()
        L_0x004a:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x014e
            java.lang.Object r0 = r17.next()
            r5 = r0
            te3.bh1 r5 = (te3.C48856bh1) r5
            com.tencent.mm.plugin.finder.activity.poi.fragment.FinderPoiTabFragment r2 = new com.tencent.mm.plugin.finder.activity.poi.fragment.FinderPoiTabFragment
            r2.<init>()
            int r0 = r5.f131118d
            int r1 = r0 + -1
            r2.f17334o = r1
            java.lang.String r1 = r5.f131119e
            java.lang.String r4 = ""
            if (r1 != 0) goto L_0x0069
            r1 = r4
        L_0x0069:
            r2.f12470r = r1
            T r1 = r6.f33558t
            te3.ah1 r1 = (te3.C48713ah1) r1
            if (r1 == 0) goto L_0x007c
            te3.z74 r3 = r1.f130516g
            if (r3 == 0) goto L_0x007c
            te3.qe3 r3 = r3.f145743d
            if (r3 == 0) goto L_0x007c
            te3.je3 r3 = r3.f140264d
            goto L_0x007d
        L_0x007c:
            r3 = r7
        L_0x007d:
            r2.f12487u = r3
            com.tencent.mm.plugin.finder.activity.poi.fragment.FinderPoiTabFragment r3 = r6.f42347B
            if (r3 != 0) goto L_0x011c
            if (r1 == 0) goto L_0x008b
            int r3 = r1.f130524r
            if (r0 != r3) goto L_0x008b
            r0 = 1
            goto L_0x008c
        L_0x008b:
            r0 = 0
        L_0x008c:
            if (r0 == 0) goto L_0x011c
            r6.f42347B = r2
            if (r1 == 0) goto L_0x0095
            pe3.b r0 = r1.f130514e
            goto L_0x0096
        L_0x0095:
            r0 = r7
        L_0x0096:
            r2.f12485s = r0
            if (r1 == 0) goto L_0x011c
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r0 = r1.f130513d
            if (r0 == 0) goto L_0x011c
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r3 = sx3.C36907w.m41090l(r0, r3)
            r1.<init>(r3)
            java.util.Iterator r3 = r0.iterator()
        L_0x00ad:
            boolean r10 = r3.hasNext()
            r11 = 33040(0x8110, float:4.6299E-41)
            if (r10 == 0) goto L_0x00d1
            java.lang.Object r10 = r3.next()
            com.tencent.mm.protocal.protobuf.FinderObject r10 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r10
            com.tencent.mm.plugin.finder.storage.FinderItem$a r12 = com.tencent.p014mm.plugin.finder.storage.FinderItem.Companion
            java.lang.String r13 = "feed"
            gy3.C87412m.m108593f(r10, r13)
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = r12.mo79056a(r10, r11)
            wp1.f$a r11 = wp1.C15585f.f42211a
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r10 = r11.mo14348k(r10)
            r1.add(r10)
            goto L_0x00ad
        L_0x00d1:
            java.util.List r1 = sx3.C110818d0.m150900B0(r1)
            T r3 = r6.f33558t
            te3.ah1 r3 = (te3.C48713ah1) r3
            if (r3 == 0) goto L_0x00f7
            te3.yg1 r3 = r3.f130527u
            if (r3 == 0) goto L_0x00f7
            r10 = r1
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            int r12 = r10.size()
            int r13 = r3.f145274d
            if (r12 <= r13) goto L_0x00f7
            cm1.y1 r12 = new cm1.y1
            java.lang.String r3 = r3.f145275e
            if (r3 != 0) goto L_0x00f1
            r3 = r4
        L_0x00f1:
            r12.<init>(r3)
            r10.add(r13, r12)
        L_0x00f7:
            com.tencent.mm.plugin.finder.activity.poi.fragment.FinderPoiTabFragment r3 = r6.f42347B
            if (r3 != 0) goto L_0x00fc
            goto L_0x00fe
        L_0x00fc:
            r3.f12486t = r1
        L_0x00fe:
            bl3.r r3 = bl3.C39818r.f106831a
            android.app.Activity r10 = r18.getContext()
            bl3.r$a r3 = r3.mo62443b(r10)
            java.lang.Class<rs1.s8> r10 = rs1.C13442s8.class
            androidx.lifecycle.i0 r3 = r3.mo75002a(r10)
            rs1.s8 r3 = (rs1.C13442s8) r3
            te3.hj1 r3 = r3.mo12861q3()
            wp1.f$a r10 = wp1.C15585f.f42211a
            r10.mo14343f(r0, r11, r3)
            r10.mo14346i(r1, r11, r4, r9)
        L_0x011c:
            nd1.a r1 = new nd1.a
            r11 = -1
            java.lang.String r0 = r5.f131119e
            if (r0 != 0) goto L_0x0125
            r12 = r4
            goto L_0x0126
        L_0x0125:
            r12 = r0
        L_0x0126:
            int r14 = r5.f131118d
            r15 = 2
            r10 = r1
            r13 = r16
            r10.<init>(r11, r12, r13, r14, r15)
            r3 = 0
            r10 = 4
            r11 = 0
            r0 = r18
            r12 = r4
            r4 = r10
            r10 = r5
            r5 = r11
            com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTabUIC.m65395f3(r0, r1, r2, r3, r4, r5)
            java.lang.String r0 = r10.f131119e
            if (r0 != 0) goto L_0x0141
            r1 = r12
            goto L_0x0142
        L_0x0141:
            r1 = r0
        L_0x0142:
            int r2 = r10.f131118d
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r18
            od1.C11403f.m11231l4(r0, r1, r2, r3, r4, r5)
            goto L_0x004a
        L_0x014e:
            r18.mo80049Y3()
        L_0x0151:
            boolean r0 = r6.f42353v
            if (r0 == 0) goto L_0x026a
            te3.m74 r0 = r6.f42357z
            if (r0 == 0) goto L_0x0169
            java.lang.String r0 = r0.f184224i
            if (r0 == 0) goto L_0x0169
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0165
            r0 = 1
            goto L_0x0166
        L_0x0165:
            r0 = 0
        L_0x0166:
            if (r0 != 0) goto L_0x0169
            r8 = 1
        L_0x0169:
            if (r8 == 0) goto L_0x026a
            T r0 = r6.f33558t
            te3.ah1 r0 = (te3.C48713ah1) r0
            if (r0 == 0) goto L_0x026a
            te3.z74 r0 = r0.f130516g
            if (r0 == 0) goto L_0x026a
            te3.qe3 r0 = r0.f145743d
            if (r0 == 0) goto L_0x026a
            te3.je3 r0 = r0.f140264d
            if (r0 == 0) goto L_0x026a
            up1.v r9 = new up1.v
            r9.<init>()
            te3.m74 r1 = r6.f42357z
            if (r1 == 0) goto L_0x0189
            java.lang.String r1 = r1.f184224i
            goto L_0x018a
        L_0x0189:
            r1 = r7
        L_0x018a:
            r9.field_poiId = r1
            java.lang.String r1 = r0.f136057i
            r9.field_categoryTips = r1
            te3.se3 r0 = r0.f136054f
            r1 = 0
            if (r0 == 0) goto L_0x0198
            float r2 = r0.f141463e
            goto L_0x0199
        L_0x0198:
            r2 = 0
        L_0x0199:
            r9.field_latitude = r2
            if (r0 == 0) goto L_0x019f
            float r1 = r0.f141462d
        L_0x019f:
            r9.field_longitude = r1
            T r0 = r6.f33558t
            te3.ah1 r0 = (te3.C48713ah1) r0
            if (r0 == 0) goto L_0x01aa
            java.lang.String r1 = r0.f130518i
            goto L_0x01ab
        L_0x01aa:
            r1 = r7
        L_0x01ab:
            r9.field_noticeWording = r1
            if (r0 == 0) goto L_0x01be
            te3.z74 r1 = r0.f130516g
            if (r1 == 0) goto L_0x01be
            te3.qe3 r1 = r1.f145743d
            if (r1 == 0) goto L_0x01be
            te3.te3 r1 = r1.f140265e
            if (r1 == 0) goto L_0x01be
            java.lang.String r1 = r1.f142173j
            goto L_0x01bf
        L_0x01be:
            r1 = r7
        L_0x01bf:
            r9.field_phoneNumber = r1
            if (r0 == 0) goto L_0x01d2
            te3.z74 r1 = r0.f130516g
            if (r1 == 0) goto L_0x01d2
            te3.qe3 r1 = r1.f145743d
            if (r1 == 0) goto L_0x01d2
            te3.te3 r1 = r1.f140265e
            if (r1 == 0) goto L_0x01d2
            java.lang.String r1 = r1.f142181u
            goto L_0x01d3
        L_0x01d2:
            r1 = r7
        L_0x01d3:
            r9.field_priceTips = r1
            if (r0 == 0) goto L_0x01e6
            te3.z74 r0 = r0.f130516g
            if (r0 == 0) goto L_0x01e6
            te3.qe3 r0 = r0.f145743d
            if (r0 == 0) goto L_0x01e6
            te3.ke3 r0 = r0.f140271n
            if (r0 == 0) goto L_0x01e6
            java.lang.String r0 = r0.f136719d
            goto L_0x01e7
        L_0x01e6:
            r0 = r7
        L_0x01e7:
            r9.field_businessHour = r0
            ht1.w3$a r0 = r6.f42346A
            if (r0 == 0) goto L_0x01f1
            java.lang.String r7 = r0.name()
        L_0x01f1:
            r9.field_fromType = r7
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r0 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.FinderCommonFeatureService r0 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r0
            r0.getClass()
            f40.e r1 = f40.C86709a0.m107523b()
            r1.mo121108c()
            up1.w r1 = r0.f157780G
            if (r1 != 0) goto L_0x0212
            up1.w r1 = new up1.w
            zh3.f r2 = r0.mo76790Np()
            r1.<init>(r2)
        L_0x0212:
            r0.f157780G = r1
            java.lang.String r0 = r9.field_poiId
            java.lang.String r2 = "new.field_poiId"
            gy3.C87412m.m108593f(r0, r2)
            up1.v r0 = r1.mo13670jo(r0)
            java.lang.String r2 = "MicroMsg.SDK.BaseFinderMapPoiInfo"
            if (r0 == 0) goto L_0x0242
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r1.f39925d
            com.tencent.mm.sdk.storage.executor.UpdateExecutor r1 = new com.tencent.mm.sdk.storage.executor.UpdateExecutor
            com.tencent.mm.sdk.storage.observer.StorageObserverEvent r3 = new com.tencent.mm.sdk.storage.observer.StorageObserverEvent
            com.tencent.mm.sdk.storage.observer.StorageEventId r4 = com.tencent.p014mm.sdk.storage.observer.StorageEventId.getUPDATE()
            java.lang.String r5 = r9.field_poiId
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r3.<init>(r4, r5, r2)
            r3.setObj(r9)
            com.tencent.mm.sdk.storage.observer.StorageObserverOwner<xh.r3> r4 = p749xh.C38649r3.f103477D
            r1.<init>(r9, r3, r4, r2)
            r1.execute(r0)
            goto L_0x026a
        L_0x0242:
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r1.f39925d
            com.tencent.mm.sdk.storage.executor.InsertExecutor r1 = new com.tencent.mm.sdk.storage.executor.InsertExecutor
            r10 = 1
            com.tencent.mm.sdk.storage.observer.StorageObserverEvent r11 = new com.tencent.mm.sdk.storage.observer.StorageObserverEvent
            com.tencent.mm.sdk.storage.observer.StorageEventId r3 = com.tencent.p014mm.sdk.storage.observer.StorageEventId.getINSERT()
            java.lang.String r4 = r9.field_poiId
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r11.<init>(r3, r4, r2)
            r11.setObj(r9)
            com.tencent.mm.sdk.storage.observer.StorageObserverOwner<xh.r3> r12 = p749xh.C38649r3.f103477D
            java.lang.String r13 = "MicroMsg.SDK.BaseFinderMapPoiInfo"
            r8 = r1
            r8.<init>(r9, r10, r11, r12, r13)
            r1.execute(r0)
            goto L_0x026a
        L_0x0265:
            r1 = r21
            r6.mo11415h4(r0, r1)
        L_0x026a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xd1.C15669q.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
