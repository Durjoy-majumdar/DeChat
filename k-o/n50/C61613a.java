package n50;

import b50.C54407c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.trtc.TRTCCloudDef;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Pattern;
import n50.C61620c;
import n50.C61623d;
import o40.C61926c;
import org.json.JSONObject;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C64197v;
import sx3.C77813z;
import ux3.C65486b;
import z40.C66733d;

/* renamed from: n50.a */
public final class C61613a {

    /* renamed from: a */
    public final int f175204a;

    /* renamed from: b */
    public final C61623d f175205b;

    /* renamed from: c */
    public String f175206c;

    /* renamed from: d */
    public int f175207d = 1;

    /* renamed from: e */
    public String f175208e;

    /* renamed from: n50.a$a */
    public static final class C61614a<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C65486b.m77169a(Integer.valueOf(((C61619b) t).f175228n), Integer.valueOf(((C61619b) t2).f175228n));
        }
    }

    /* renamed from: n50.a$b */
    public static final class C61615b<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C65486b.m77169a(Integer.valueOf(((C61619b) t).f175228n), Integer.valueOf(((C61619b) t2).f175228n));
        }
    }

    /* renamed from: n50.a$c */
    public static final class C61616c extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ LinkedList<TRTCCloudDef.TRTCMixUser> f175209d;

        /* renamed from: e */
        public final /* synthetic */ TRTCCloudDef.TRTCMixUser f175210e;

        /* renamed from: f */
        public final /* synthetic */ C61613a f175211f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61616c(LinkedList<TRTCCloudDef.TRTCMixUser> linkedList, TRTCCloudDef.TRTCMixUser tRTCMixUser, C61613a aVar) {
            super(1);
            this.f175209d = linkedList;
            this.f175210e = tRTCMixUser;
            this.f175211f = aVar;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            if (intValue >= 0 && intValue < this.f175209d.size()) {
                this.f175210e.f165818x = this.f175209d.get(intValue).f165818x;
                this.f175210e.f165819y = this.f175209d.get(intValue).f165819y;
                this.f175210e.width = this.f175209d.get(intValue).width;
                this.f175210e.height = this.f175209d.get(intValue).height;
                this.f175209d.get(intValue).userId = this.f175211f.f175208e;
                this.f175209d.get(intValue).zOrder = intValue + 1;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: n50.a$d */
    public static final class C61617d extends C87413o implements C32227p<TRTCCloudDef.TRTCMixUser, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ int f175212d;

        /* renamed from: e */
        public final /* synthetic */ int f175213e;

        /* renamed from: f */
        public final /* synthetic */ int f175214f;

        /* renamed from: g */
        public final /* synthetic */ int f175215g;

        /* renamed from: h */
        public final /* synthetic */ int f175216h;

        /* renamed from: i */
        public final /* synthetic */ int f175217i;

        /* renamed from: j */
        public final /* synthetic */ int f175218j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61617d(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
            super(2);
            this.f175212d = i;
            this.f175213e = i2;
            this.f175214f = i3;
            this.f175215g = i4;
            this.f175216h = i5;
            this.f175217i = i6;
            this.f175218j = i7;
        }

        public Object invoke(Object obj, Object obj2) {
            TRTCCloudDef.TRTCMixUser tRTCMixUser = (TRTCCloudDef.TRTCMixUser) obj;
            int intValue = ((Number) obj2).intValue();
            C87412m.m108594g(tRTCMixUser, "_mixUser");
            tRTCMixUser.zOrder = intValue + 2;
            int i = this.f175212d;
            int i2 = this.f175213e;
            tRTCMixUser.f165818x = ((i - i2) - this.f175214f) - this.f175215g;
            int i3 = this.f175216h;
            int i4 = this.f175217i;
            int i5 = this.f175218j;
            tRTCMixUser.f165819y = i3 + ((i4 + i5) * intValue);
            tRTCMixUser.width = i2;
            tRTCMixUser.height = i5;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: n50.a$e */
    public static final class C61618e extends C87413o implements C32226l<TRTCCloudDef.TRTCMixUser, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ int f175219d;

        /* renamed from: e */
        public final /* synthetic */ int f175220e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61618e(int i, int i2) {
            super(1);
            this.f175219d = i;
            this.f175220e = i2;
        }

        public Object invoke(Object obj) {
            TRTCCloudDef.TRTCMixUser tRTCMixUser = (TRTCCloudDef.TRTCMixUser) obj;
            C87412m.m108594g(tRTCMixUser, "_mixUser");
            tRTCMixUser.f165818x = 0;
            tRTCMixUser.f165819y = 0;
            tRTCMixUser.width = this.f175219d;
            tRTCMixUser.height = this.f175220e;
            tRTCMixUser.zOrder = 1;
            return C13598b0.f38549a;
        }
    }

    public C61613a(int i, C61623d dVar) {
        C87412m.m108594g(dVar, "trtcManager");
        this.f175204a = i;
        this.f175205b = dVar;
    }

    /* renamed from: a */
    public final void mo86543a() {
        ArrayList<C61619b> arrayList = C61620c.C61622b.f175234a.f175229a;
        if (arrayList == null) {
            Log.m105924i("FinderLiveMicCloudMixture", "micFocusGrabModeFillConfig remoteUserConfigList = null");
            return;
        }
        if (arrayList.size() > 1) {
            C77813z.m93909o(arrayList, new C61614a());
        }
        int i = C61620c.C61622b.f175234a.f175230b;
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = new HashMap();
        for (C61619b bVar : arrayList) {
            int i2 = bVar.f175228n;
            if (i2 <= 0 || i2 > 9 || i2 == i) {
                arrayList2.add(bVar);
            } else if (!hashMap.containsKey(Integer.valueOf(i2))) {
                hashMap.put(Integer.valueOf(bVar.f175228n), bVar);
            } else {
                arrayList2.add(bVar);
            }
        }
        int i3 = 0;
        for (int i4 = 1; i4 < 10; i4++) {
            if (!hashMap.containsKey(Integer.valueOf(i4)) && i4 != i) {
                int i5 = i3 + 1;
                C61619b bVar2 = (C61619b) C110818d0.m150917O(arrayList2, i3);
                if (bVar2 != null) {
                    bVar2.f175228n = i4;
                }
                i3 = i5;
            }
        }
        if (arrayList.size() > 1) {
            C77813z.m93909o(arrayList, new C61615b());
        }
    }

    /* renamed from: b */
    public final String mo86544b(int i, int i2) {
        return String.valueOf(((float) i) / ((float) i2));
    }

    /* renamed from: c */
    public final TRTCCloudDef.TRTCMixUser mo86545c(String str, C61619b bVar) {
        TRTCCloudDef.TRTCMixUser tRTCMixUser = new TRTCCloudDef.TRTCMixUser();
        bVar.f175226i = str;
        String str2 = bVar.f175221d;
        tRTCMixUser.userId = str2;
        tRTCMixUser.streamType = bVar.f175222e;
        tRTCMixUser.pureAudio = true;
        C61623d.C61626c h = this.f175205b.mo86565h(str2, 0);
        if (h != null) {
            tRTCMixUser.pureAudio = h.f175256c;
        }
        return tRTCMixUser;
    }

    /* renamed from: d */
    public final int mo86546d(TRTCCloudDef.TRTCMixUser tRTCMixUser) {
        int i;
        int i2;
        int i3;
        C61619b b = C61620c.C61622b.f175234a.mo86554b(tRTCMixUser.userId);
        boolean z = false;
        if (b != null) {
            if (b.f175225h <= this.f175204a) {
                Pattern pattern = C61926c.f176038a;
                i3 = 1;
            } else {
                Pattern pattern2 = C61926c.f176038a;
                i3 = 0;
            }
            i = b.f175227j ? i3 | 4 : i3 & -5;
        } else {
            i = 0;
        }
        C66733d dVar = C66733d.f191763a;
        String str = tRTCMixUser.userId;
        C87412m.m108593f(str, "mixUser.userId");
        boolean a = dVar.mo90764a(str);
        if (dVar.mo90765b()) {
            a = tRTCMixUser.pureAudio;
        }
        if (a) {
            Pattern pattern3 = C61926c.f176038a;
            i2 = i | 2;
        } else {
            Pattern pattern4 = C61926c.f176038a;
            i2 = i & -3;
        }
        int i4 = tRTCMixUser.roomId != null ? i2 | 8 : i2 & -9;
        String str2 = tRTCMixUser.userId;
        C87412m.m108593f(str2, "mixUser.userId");
        C54407c cVar = C66733d.f191764b;
        if (cVar != null) {
            z = cVar.Ke0(str2);
        }
        return z ? i4 | 16 : i4 & -17;
    }

    /* renamed from: e */
    public final JSONObject mo86547e(String str, int i, int i2, TRTCCloudDef.TRTCTranscodingConfig tRTCTranscodingConfig, TRTCCloudDef.TRTCMixUser tRTCMixUser) {
        T t;
        boolean z;
        String str2 = str;
        int i3 = i;
        TRTCCloudDef.TRTCTranscodingConfig tRTCTranscodingConfig2 = tRTCTranscodingConfig;
        TRTCCloudDef.TRTCMixUser tRTCMixUser2 = tRTCMixUser;
        C87412m.m108594g(str2, "selfRoomId");
        C87412m.m108594g(tRTCTranscodingConfig2, "config");
        C87412m.m108594g(tRTCMixUser2, "mixUser");
        ArrayList<C61619b> arrayList = C61620c.C61622b.f175234a.f175229a;
        if (arrayList == null) {
            Log.m105924i("FinderLiveMicCloudMixture", "micFocusGrabModeFillConfig remoteUserConfigList = null");
            return null;
        }
        mo86543a();
        int size = arrayList.size();
        Log.m105924i("FinderLiveMicCloudMixture", "micGrabModeFillConfig videoHeight: " + i2 + " videoWidth: " + i3 + " size: " + size + " list: " + arrayList);
        tRTCTranscodingConfig2.videoWidth = i3;
        float f = (float) i3;
        int i4 = (int) (f / 1.125f);
        tRTCTranscodingConfig2.videoHeight = i4;
        tRTCTranscodingConfig2.backgroundImage = "111302";
        LinkedList linkedList = new LinkedList();
        TRTCCloudDef.TRTCMixUser tRTCMixUser3 = new TRTCCloudDef.TRTCMixUser();
        tRTCMixUser3.zOrder = 1;
        tRTCMixUser3.f165818x = 0;
        tRTCMixUser3.f165819y = 0;
        tRTCMixUser3.width = (int) (((float) 2) * 0.25f * f);
        float f2 = (float) i4;
        tRTCMixUser3.height = (int) (((float) 4) * 0.25f * f2);
        linkedList.add(tRTCMixUser3);
        for (int i5 = 0; i5 < 8; i5++) {
            TRTCCloudDef.TRTCMixUser tRTCMixUser4 = new TRTCCloudDef.TRTCMixUser();
            tRTCMixUser4.zOrder = i5 + 2;
            tRTCMixUser4.f165818x = (int) (((((float) (i5 % 2)) * 0.25f) + 0.5f) * f);
            tRTCMixUser4.f165819y = (int) (((float) (i5 / 2)) * 0.25f * f2);
            tRTCMixUser4.width = (int) (0.25f * f);
            tRTCMixUser4.height = (int) (0.25f * f2);
            linkedList.add(tRTCMixUser4);
        }
        Iterator<T> it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C61619b) t).f175228n == 1) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C61619b bVar = (C61619b) t;
        C61616c cVar = new C61616c(linkedList, tRTCMixUser2, this);
        if (bVar == null) {
            cVar.invoke(0);
            C61620c cVar2 = C61620c.C61622b.f175234a;
            cVar2.f175230b = 1;
            cVar2.f175231c = size;
        } else {
            cVar.invoke(Integer.valueOf(C61620c.C61622b.f175234a.f175230b - 1));
        }
        Iterator<C61619b> it4 = arrayList.iterator();
        int i6 = 0;
        while (it4.hasNext()) {
            C61619b next = it4.next();
            int i7 = i6 + 1;
            if (i6 >= 0) {
                C61619b bVar2 = next;
                bVar2.f175226i = str2;
                TRTCCloudDef.TRTCMixUser tRTCMixUser5 = (TRTCCloudDef.TRTCMixUser) C110818d0.m150917O(linkedList, bVar2.f175228n - 1);
                if (tRTCMixUser5 != null) {
                    String str3 = bVar2.f175221d;
                    tRTCMixUser5.userId = str3;
                    tRTCMixUser5.streamType = bVar2.f175222e;
                    tRTCMixUser5.pureAudio = true;
                    C61623d.C61626c h = this.f175205b.mo86565h(str3, 0);
                    if (h != null) {
                        tRTCMixUser5.pureAudio = h.f175256c;
                    }
                    tRTCTranscodingConfig2.mixUsers.add(tRTCMixUser5);
                }
                i6 = i7;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        return mo86549g(tRTCTranscodingConfig2, linkedList);
    }

    /* renamed from: f */
    public final JSONObject mo86548f(String str, int i, int i2, TRTCCloudDef.TRTCTranscodingConfig tRTCTranscodingConfig, TRTCCloudDef.TRTCMixUser tRTCMixUser) {
        int i3;
        T t;
        boolean z;
        String str2 = str;
        int i4 = i;
        int i5 = i2;
        TRTCCloudDef.TRTCTranscodingConfig tRTCTranscodingConfig2 = tRTCTranscodingConfig;
        TRTCCloudDef.TRTCMixUser tRTCMixUser2 = tRTCMixUser;
        C87412m.m108594g(str2, "selfRoomId");
        C87412m.m108594g(tRTCTranscodingConfig2, "config");
        C87412m.m108594g(tRTCMixUser2, "mixUser");
        ArrayList<C61619b> arrayList = C61620c.C61622b.f175234a.f175229a;
        if (arrayList == null || arrayList.size() == 0) {
            Log.m105924i("FinderLiveMicCloudMixture", "micFocusGrabModeFillConfig remoteUserConfigList = null or size = 0");
            return null;
        }
        Log.m105924i("FinderLiveMicCloudMixture", "micFocusGrabModeFillConfig videostreams: " + this.f175205b.f175238d.size() + " videoHeight: " + i5 + " videoWidth: " + i4 + " curForceUserId: " + this.f175206c);
        tRTCTranscodingConfig2.videoWidth = i4;
        tRTCTranscodingConfig2.videoHeight = i5;
        tRTCTranscodingConfig2.backgroundImage = "37286";
        float f = (float) i5;
        int i6 = (int) (0.14285715f * f);
        int i7 = (int) (((float) i6) * 0.75f);
        int i8 = (i4 - ((int) (0.46153846f * f))) / 2;
        int i9 = (int) (((float) i4) * 0.038647342f);
        int i15 = (int) (0.20982143f * f);
        int i16 = (int) (f * 0.008928572f);
        Log.m105924i("FinderLiveMicCloudMixture", "micFocusGrabModeFillConfig offestMargin: " + i8 + " micHeight: " + i6 + " micWidth: " + i7 + " micRightMargin: " + i9 + " micTopMargin: " + i15 + " micMargin: " + i16 + " oriTop: 0.20982143");
        C61618e eVar = new C61618e(i4, i5);
        C61617d dVar = new C61617d(i, i7, i9, i8, i15, i16, i6);
        Iterator<T> it = arrayList.iterator();
        while (true) {
            i3 = 0;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C61619b) t).f175228n == 1) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C61619b bVar = (C61619b) t;
        C61620c cVar = C61620c.C61622b.f175234a;
        int i17 = cVar.f175230b;
        int i18 = cVar.f175231c;
        if (i18 > arrayList.size() && (i17 = i17 - (i18 - arrayList.size())) <= 2) {
            i17 = 2;
        }
        if (bVar == null) {
            eVar.invoke(tRTCMixUser2);
            i17 = 1;
        } else {
            TRTCCloudDef.TRTCMixUser c = mo86545c(str2, bVar);
            eVar.invoke(c);
            tRTCTranscodingConfig2.mixUsers.add(c);
            dVar.invoke(tRTCMixUser2, Integer.valueOf(i17 - 2));
        }
        for (C61619b bVar2 : arrayList) {
            if (!C87412m.m108589b(bVar != null ? bVar.f175221d : null, bVar2.f175221d)) {
                TRTCCloudDef.TRTCMixUser c2 = mo86545c(str2, bVar2);
                if (i3 == i17 - 2) {
                    i3++;
                }
                dVar.invoke(c2, Integer.valueOf(i3));
                i3++;
                tRTCTranscodingConfig2.mixUsers.add(c2);
            }
        }
        C61620c cVar2 = C61620c.C61622b.f175234a;
        int size = arrayList.size();
        cVar2.f175230b = i17;
        cVar2.f175231c = size;
        return this.f175205b.mo86567j(tRTCTranscodingConfig2, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0157 A[Catch:{ JSONException -> 0x01a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0171 A[Catch:{ JSONException -> 0x01a1 }] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject mo86549g(com.tencent.trtc.TRTCCloudDef.TRTCTranscodingConfig r18, java.util.List<? extends com.tencent.trtc.TRTCCloudDef.TRTCMixUser> r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            java.lang.String r3 = "FinderLiveMicCloudMixture"
            if (r1 != 0) goto L_0x000f
            java.lang.String r1 = "prepareAnchorInfoLinkMicJson return nil, config == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            return r2
        L_0x000f:
            if (r19 != 0) goto L_0x0017
            java.lang.String r1 = "prepareAnchorInfoLinkMicJson return nil, mixUserList == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            return r2
        L_0x0017:
            int r4 = r19.size()
            r5 = 1
            if (r4 > r5) goto L_0x0037
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "prepareAnchorInfoLinkMicJson return nil, mixUserList.size: "
            r1.append(r4)
            int r4 = r19.size()
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            return r2
        L_0x0037:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "prepareAnchorInfoLinkMicJson mixUserList.size: "
            r2.append(r4)
            int r4 = r19.size()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            java.util.Iterator r7 = r19.iterator()     // Catch:{ JSONException -> 0x01a1 }
            r9 = 0
        L_0x0063:
            boolean r10 = r7.hasNext()     // Catch:{ JSONException -> 0x01a1 }
            if (r10 == 0) goto L_0x0197
            java.lang.Object r10 = r7.next()     // Catch:{ JSONException -> 0x01a1 }
            com.tencent.trtc.TRTCCloudDef$TRTCMixUser r10 = (com.tencent.trtc.TRTCCloudDef.TRTCMixUser) r10     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r11 = r10.userId     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r12 = r0.f175208e     // Catch:{ JSONException -> 0x01a1 }
            boolean r11 = gy3.C87412m.m108589b(r11, r12)     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r12 = "i"
            java.lang.String r13 = "h"
            java.lang.String r14 = "w"
            java.lang.String r15 = "y"
            java.lang.String r5 = "x"
            if (r11 == 0) goto L_0x010b
            int r11 = r10.f165818x     // Catch:{ JSONException -> 0x01a1 }
            int r8 = r1.videoWidth     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r8 = r0.mo86544b(r11, r8)     // Catch:{ JSONException -> 0x01a1 }
            r2.putOpt(r5, r8)     // Catch:{ JSONException -> 0x01a1 }
            int r5 = r10.f165819y     // Catch:{ JSONException -> 0x01a1 }
            int r8 = r1.videoHeight     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r5 = r0.mo86544b(r5, r8)     // Catch:{ JSONException -> 0x01a1 }
            r2.putOpt(r15, r5)     // Catch:{ JSONException -> 0x01a1 }
            int r5 = r10.width     // Catch:{ JSONException -> 0x01a1 }
            int r8 = r1.videoWidth     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r5 = r0.mo86544b(r5, r8)     // Catch:{ JSONException -> 0x01a1 }
            r2.putOpt(r14, r5)     // Catch:{ JSONException -> 0x01a1 }
            int r5 = r10.height     // Catch:{ JSONException -> 0x01a1 }
            int r8 = r1.videoHeight     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r5 = r0.mo86544b(r5, r8)     // Catch:{ JSONException -> 0x01a1 }
            r2.putOpt(r13, r5)     // Catch:{ JSONException -> 0x01a1 }
            int r5 = r10.zOrder     // Catch:{ JSONException -> 0x01a1 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ JSONException -> 0x01a1 }
            r2.putOpt(r12, r5)     // Catch:{ JSONException -> 0x01a1 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x01a1 }
            r5.<init>()     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r8 = "prepareAnchorInfoLinkMicJson: add userInfo, zOrder: "
            r5.append(r8)     // Catch:{ JSONException -> 0x01a1 }
            int r8 = r10.zOrder     // Catch:{ JSONException -> 0x01a1 }
            r5.append(r8)     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r8 = " index: "
            r5.append(r8)     // Catch:{ JSONException -> 0x01a1 }
            r5.append(r9)     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r8 = ", info:"
            r5.append(r8)     // Catch:{ JSONException -> 0x01a1 }
            r5.append(r2)     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r5 = r5.toString()     // Catch:{ JSONException -> 0x01a1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r5 = "m"
            int r8 = r0.f175207d     // Catch:{ JSONException -> 0x01a1 }
            r10 = 3
            r11 = 2
            if (r8 == r11) goto L_0x00f2
            if (r8 == r10) goto L_0x00f0
            r11 = 4
            if (r8 == r11) goto L_0x00f3
            r10 = 0
            goto L_0x00f3
        L_0x00f0:
            r10 = 2
            goto L_0x00f3
        L_0x00f2:
            r10 = 1
        L_0x00f3:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)     // Catch:{ JSONException -> 0x01a1 }
            r2.putOpt(r5, r8)     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r5 = "a"
            int r8 = r1.videoWidth     // Catch:{ JSONException -> 0x01a1 }
            int r10 = r1.videoHeight     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r8 = r0.mo86544b(r8, r10)     // Catch:{ JSONException -> 0x01a1 }
            r2.putOpt(r5, r8)     // Catch:{ JSONException -> 0x01a1 }
            int r9 = r9 + 1
            goto L_0x0194
        L_0x010b:
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01a1 }
            r8.<init>()     // Catch:{ JSONException -> 0x01a1 }
            int r11 = r10.f165818x     // Catch:{ JSONException -> 0x01a1 }
            r16 = r7
            int r7 = r1.videoWidth     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r7 = r0.mo86544b(r11, r7)     // Catch:{ JSONException -> 0x01a1 }
            r8.putOpt(r5, r7)     // Catch:{ JSONException -> 0x01a1 }
            int r5 = r10.f165819y     // Catch:{ JSONException -> 0x01a1 }
            int r7 = r1.videoHeight     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r5 = r0.mo86544b(r5, r7)     // Catch:{ JSONException -> 0x01a1 }
            r8.putOpt(r15, r5)     // Catch:{ JSONException -> 0x01a1 }
            int r5 = r10.width     // Catch:{ JSONException -> 0x01a1 }
            int r7 = r1.videoWidth     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r5 = r0.mo86544b(r5, r7)     // Catch:{ JSONException -> 0x01a1 }
            r8.putOpt(r14, r5)     // Catch:{ JSONException -> 0x01a1 }
            int r5 = r10.height     // Catch:{ JSONException -> 0x01a1 }
            int r7 = r1.videoHeight     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r5 = r0.mo86544b(r5, r7)     // Catch:{ JSONException -> 0x01a1 }
            r8.putOpt(r13, r5)     // Catch:{ JSONException -> 0x01a1 }
            int r5 = r10.zOrder     // Catch:{ JSONException -> 0x01a1 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ JSONException -> 0x01a1 }
            r8.putOpt(r12, r5)     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r5 = r10.userId     // Catch:{ JSONException -> 0x01a1 }
            if (r5 == 0) goto L_0x0154
            int r5 = r5.length()     // Catch:{ JSONException -> 0x01a1 }
            if (r5 != 0) goto L_0x0152
            goto L_0x0154
        L_0x0152:
            r5 = 0
            goto L_0x0155
        L_0x0154:
            r5 = 1
        L_0x0155:
            if (r5 != 0) goto L_0x0171
            java.lang.String r5 = "uId"
            java.lang.String r7 = r10.userId     // Catch:{ JSONException -> 0x01a1 }
            r8.putOpt(r5, r7)     // Catch:{ JSONException -> 0x01a1 }
            int r5 = r0.mo86546d(r10)     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r7 = "us"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ JSONException -> 0x01a1 }
            r8.putOpt(r7, r5)     // Catch:{ JSONException -> 0x01a1 }
            r4.put(r8)     // Catch:{ JSONException -> 0x01a1 }
            goto L_0x0174
        L_0x0171:
            r6.put(r8)     // Catch:{ JSONException -> 0x01a1 }
        L_0x0174:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x01a1 }
            r5.<init>()     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r7 = "prepareAnchorInfoLinkMicJson: add userInfo, index: "
            r5.append(r7)     // Catch:{ JSONException -> 0x01a1 }
            r5.append(r9)     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r7 = ", userInfo:"
            r5.append(r7)     // Catch:{ JSONException -> 0x01a1 }
            r5.append(r8)     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r5 = r5.toString()     // Catch:{ JSONException -> 0x01a1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)     // Catch:{ JSONException -> 0x01a1 }
            int r9 = r9 + 1
            r7 = r16
        L_0x0194:
            r5 = 1
            goto L_0x0063
        L_0x0197:
            java.lang.String r1 = "gl"
            r2.putOpt(r1, r6)     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r1 = "list"
            r2.putOpt(r1, r4)     // Catch:{ JSONException -> 0x01a1 }
        L_0x01a1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n50.C61613a.mo86549g(com.tencent.trtc.TRTCCloudDef$TRTCTranscodingConfig, java.util.List):org.json.JSONObject");
    }
}
