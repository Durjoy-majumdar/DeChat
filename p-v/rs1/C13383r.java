package rs1;

import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wcdb.FileUtils;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import lf1.C10500a;
import o40.C61926c;
import org.json.JSONObject;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64197v;
import te3.C50124kf1;
import te3.C51384te1;

/* renamed from: rs1.r */
public final class C13383r {

    /* renamed from: d */
    public static final C13385b f37907d = new C13385b((C8480h) null);

    /* renamed from: e */
    public static final List<Integer> f37908e = C64197v.m75537f(18, 20);

    /* renamed from: f */
    public static final C13601g<C13383r> f37909f = C36568h.m40985a(C13384a.f37913d);

    /* renamed from: a */
    public final ConcurrentHashMap<C13387d, C13386c> f37910a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public C13386c f37911b;

    /* renamed from: c */
    public final Set<Long> f37912c = new LinkedHashSet();

    /* renamed from: rs1.r$a */
    public static final class C13384a extends C87413o implements C32224a<C13383r> {

        /* renamed from: d */
        public static final C13384a f37913d = new C13384a();

        public C13384a() {
            super(0);
        }

        public Object invoke() {
            return new C13383r();
        }
    }

    /* renamed from: rs1.r$b */
    public static final class C13385b {
        public C13385b(C8480h hVar) {
        }

        /* renamed from: a */
        public final C13383r mo12791a() {
            return (C13383r) ((C36570n) C13383r.f37909f).getValue();
        }
    }

    /* renamed from: rs1.r$c */
    public static final class C13386c {

        /* renamed from: a */
        public final FinderObject f37914a;

        /* renamed from: b */
        public final int f37915b;

        /* renamed from: c */
        public final int f37916c;

        /* renamed from: d */
        public final boolean f37917d;

        /* renamed from: e */
        public final String f37918e;

        /* renamed from: f */
        public int f37919f;

        /* renamed from: g */
        public long f37920g;

        /* renamed from: h */
        public long f37921h;

        /* renamed from: i */
        public long f37922i;

        /* renamed from: j */
        public long f37923j;

        /* renamed from: k */
        public int f37924k;

        public C13386c(FinderObject finderObject, int i, int i2, boolean z, String str, int i3, long j, long j2, long j3, long j4, int i4, C8480h hVar) {
            FinderObject finderObject2 = finderObject;
            String str2 = str;
            int i5 = i4;
            long j5 = 0;
            long j6 = (i5 & 64) != 0 ? 0 : j;
            long j7 = (i5 & 128) != 0 ? 0 : j2;
            long j8 = (i5 & 256) != 0 ? 0 : j3;
            j5 = (i5 & 512) == 0 ? j4 : j5;
            C87412m.m108594g(finderObject, "feed");
            C87412m.m108594g(str2, "sessionId");
            this.f37914a = finderObject2;
            this.f37915b = i;
            this.f37916c = i2;
            this.f37917d = z;
            this.f37918e = str2;
            this.f37919f = i3;
            this.f37920g = j6;
            this.f37921h = j7;
            this.f37922i = j8;
            this.f37923j = j5;
        }

        /* renamed from: a */
        public final JSONObject mo12792a() {
            String str;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("feedId", C61926c.m72691p(this.f37914a.f164794id));
            jSONObject.put("commentScene", String.valueOf(this.f37915b));
            jSONObject.put("tabType", String.valueOf(this.f37916c));
            jSONObject.put("fromPreload", String.valueOf(this.f37917d));
            jSONObject.put("sessionId", String.valueOf(this.f37918e));
            int i = this.f37919f;
            if (i == 0) {
                str = "None";
            } else if (i == 1) {
                str = "Dispatched";
            } else if (i == 2) {
                str = "Consumed";
            } else if (i == 3) {
                str = "Focused";
            } else if (i != 4) {
                str = "Unknown#" + i;
            } else {
                str = "UnFocused";
            }
            jSONObject.put("status", str);
            jSONObject.put("dispatchTime", String.valueOf(this.f37920g));
            jSONObject.put("consumeTime", String.valueOf(this.f37921h));
            jSONObject.put("focusTime", String.valueOf(this.f37922i));
            jSONObject.put("unFocusTime", String.valueOf(this.f37923j));
            return jSONObject;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C13386c)) {
                return false;
            }
            C13386c cVar = (C13386c) obj;
            return cVar.f37914a.f164794id == this.f37914a.f164794id && cVar.f37915b == this.f37915b && cVar.f37916c == this.f37916c && C87412m.m108589b(cVar.f37918e, this.f37918e) && cVar.f37917d == this.f37917d;
        }

        public int hashCode() {
            return (((((((int) this.f37914a.f164794id) * 31) + this.f37915b) * 31) + this.f37916c) * 31) + (this.f37917d ? 1231 : 1237);
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[FeedDispatchInfo](feedId=");
            sb.append(C61926c.m72691p(this.f37914a.f164794id));
            sb.append(", commentScene=");
            sb.append(this.f37915b);
            sb.append(", tabType=");
            sb.append(this.f37916c);
            sb.append(", fromPreload=");
            sb.append(this.f37917d);
            sb.append(", sessionId=");
            sb.append(this.f37918e);
            sb.append(", status=");
            int i = this.f37919f;
            if (i == 0) {
                str = "None";
            } else if (i == 1) {
                str = "Dispatched";
            } else if (i == 2) {
                str = "Consumed";
            } else if (i == 3) {
                str = "Focused";
            } else if (i != 4) {
                str = "Unknown#" + i;
            } else {
                str = "UnFocused";
            }
            sb.append(str);
            sb.append(", dispatchTime=");
            sb.append(this.f37920g);
            sb.append(", consumeTime=");
            sb.append(this.f37921h);
            sb.append(", focusTime=");
            sb.append(this.f37922i);
            sb.append(", unfocusTime=");
            sb.append(this.f37923j);
            return sb.toString();
        }
    }

    /* renamed from: rs1.r$d */
    public static final class C13387d {

        /* renamed from: a */
        public final long f37925a;

        /* renamed from: b */
        public final int f37926b;

        public C13387d(long j, int i) {
            this.f37925a = j;
            this.f37926b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C13387d)) {
                return false;
            }
            C13387d dVar = (C13387d) obj;
            return dVar.f37925a == this.f37925a && dVar.f37926b == this.f37926b;
        }

        public int hashCode() {
            return (((int) this.f37925a) * 31) + this.f37926b;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0076, code lost:
        r3 = r3.f136749h;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12789a(int r22, java.lang.String r23) {
        /*
            r21 = this;
            r0 = r21
            java.util.HashMap r1 = new java.util.HashMap
            java.util.concurrent.ConcurrentHashMap<rs1.r$d, rs1.r$c> r2 = r0.f37910a
            r1.<init>(r2)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0011:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00c1
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            rs1.r$d r3 = (rs1.C13383r.C13387d) r3
            int r3 = r3.f37926b
            r15 = r22
            if (r3 != r15) goto L_0x0011
            java.lang.Object r3 = r2.getValue()
            rs1.r$c r3 = (rs1.C13383r.C13386c) r3
            int r4 = r3.f37919f
            r5 = 2
            if (r4 >= r5) goto L_0x0011
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "onFeedLoaderConsumeEnd unconsumed feed: "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r5 = ", source: "
            r4.append(r5)
            r14 = r23
            r4.append(r14)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "Finder.AdTraceMgr"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            org.json.JSONObject r5 = r3.mo12792a()
            java.lang.String r6 = "dispatchFeed"
            r4.put(r6, r5)
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r7 = "checkTime"
            r4.put(r7, r5)
            lf1.a r5 = lf1.C10500a.f31736a
            r6 = 5
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.f37914a
            long r7 = r3.f164794id
            te3.kf1 r3 = r3.object_extend
            if (r3 == 0) goto L_0x007d
            te3.te1 r3 = r3.f136749h
            if (r3 == 0) goto L_0x007d
            long r9 = r3.f142157e
            goto L_0x007f
        L_0x007d:
            r9 = 0
        L_0x007f:
            r11 = 0
            r13 = 0
            r3 = 0
            r16 = 0
            java.lang.String r12 = r4.toString()
            java.lang.String r4 = "jsonObj.toString()"
            gy3.C87412m.m108593f(r12, r4)
            r17 = 448(0x1c0, float:6.28E-43)
            r18 = 0
            java.lang.String r19 = "unconsume"
            r4 = r5
            r5 = r6
            r6 = r7
            r8 = r22
            r20 = r12
            r12 = r19
            r14 = r3
            r15 = r16
            r16 = r20
            lf1.C10500a.m10435a(r4, r5, r6, r8, r9, r11, r12, r13, r14, r15, r16, r17, r18)
            java.util.Set<java.lang.Long> r3 = r0.f37912c
            java.lang.Object r4 = r2.getKey()
            rs1.r$d r4 = (rs1.C13383r.C13387d) r4
            long r4 = r4.f37925a
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3.remove(r4)
            java.util.concurrent.ConcurrentHashMap<rs1.r$d, rs1.r$c> r3 = r0.f37910a
            java.lang.Object r2 = r2.getKey()
            r3.remove(r2)
            goto L_0x0011
        L_0x00c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13383r.mo12789a(int, java.lang.String):void");
    }

    /* renamed from: b */
    public final void mo12790b(C13386c cVar) {
        C51384te1 te12;
        C13386c cVar2 = cVar;
        C87412m.m108594g(cVar2, "dispatchInfo");
        if (f37908e.contains(Integer.valueOf(cVar2.f37915b))) {
            Log.m105924i("Finder.AdTraceMgr", "onStreamCgiBack " + cVar2);
            C13387d dVar = new C13387d(cVar2.f37914a.f164794id, cVar2.f37915b);
            C13386c cVar3 = this.f37910a.get(dVar);
            if (cVar3 != null) {
                if (cVar3.f37919f < 2) {
                    Log.m105924i("Finder.AdTraceMgr", "onStreamCgiBack prev=" + cVar3 + " new=" + cVar2);
                }
                this.f37912c.remove(Long.valueOf(cVar3.f37914a.f164794id));
            }
            C13386c cVar4 = this.f37911b;
            long j = 0;
            long j2 = cVar4 != null ? cVar4.f37920g : 0;
            if (cVar4 != null && cVar2.f37920g - j2 < FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
                Log.m105924i("Finder.AdTraceMgr", "onStreamCgiBack dispatch time too similar, lastDispatch=" + this.f37911b + " nowDispatch=" + cVar2);
                C13386c cVar5 = this.f37911b;
                C87412m.m108591d(cVar5);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("new", cVar.mo12792a());
                jSONObject.put("old", cVar5.mo12792a());
                C10500a aVar = C10500a.f31736a;
                FinderObject finderObject = cVar2.f37914a;
                long j3 = finderObject.f164794id;
                int i = cVar2.f37915b;
                C50124kf1 kf12 = finderObject.object_extend;
                if (!(kf12 == null || (te12 = kf12.f136749h) == null)) {
                    j = te12.f142157e;
                }
                String jSONObject2 = jSONObject.toString();
                C87412m.m108593f(jSONObject2, "jsonObj.toString()");
                C10500a.m10435a(aVar, 5, j3, i, j, false, "multidispatch", 0, 0, false, jSONObject2, FileUtils.S_IRWXU, (Object) null);
            }
            this.f37910a.put(dVar, cVar2);
            this.f37911b = cVar2;
        }
    }
}
