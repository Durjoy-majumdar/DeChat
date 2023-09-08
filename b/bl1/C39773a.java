package bl1;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import sx3.C110818d0;
import te3.C49765hx0;
import tf1.C13914m;

/* renamed from: bl1.a */
public final class C39773a extends C39775b {

    /* renamed from: i */
    public String f106730i;

    /* renamed from: j */
    public final ArrayList<C49765hx0> f106731j = new ArrayList<>();

    /* renamed from: bl1.a$a */
    public static final class C39774a extends C87413o implements C32226l<C49765hx0, CharSequence> {

        /* renamed from: d */
        public static final C39774a f106732d = new C39774a();

        public C39774a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C49765hx0 hx02 = (C49765hx0) obj;
            C87412m.m108594g(hx02, LocaleUtil.ITALIAN);
            StringBuilder sb = new StringBuilder();
            sb.append("username:");
            FinderContact finderContact = hx02.f134919d;
            String str = null;
            sb.append(finderContact != null ? finderContact.username : null);
            sb.append(",nickname:");
            FinderContact finderContact2 = hx02.f134919d;
            if (finderContact2 != null) {
                str = finderContact2.nickname;
            }
            sb.append(str);
            sb.append("; ");
            return sb.toString();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C39773a(boolean r4, te3.C52013xs0 r5) {
        /*
            r3 = this;
            java.lang.String r0 = "source"
            gy3.C87412m.m108594g(r5, r0)
            r3.<init>(r4, r5)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3.f106731j = r4
            te3.zt0 r4 = new te3.zt0
            r4.<init>()
            pe3.b r5 = r5.f144906h
            r0 = 0
            if (r5 == 0) goto L_0x001f
            byte[] r5 = r5.mo123703f()
            goto L_0x0020
        L_0x001f:
            r5 = r0
        L_0x0020:
            java.lang.String r1 = ""
            if (r5 != 0) goto L_0x0025
            goto L_0x0035
        L_0x0025:
            r4.parseFrom(r5)     // Catch:{ Exception -> 0x0029 }
            goto L_0x0036
        L_0x0029:
            r4 = move-exception
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r2 = 0
            r5[r2] = r4
            java.lang.String r4 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r4, r1, r5)
        L_0x0035:
            r4 = r0
        L_0x0036:
            if (r4 == 0) goto L_0x0048
            java.lang.String r5 = r4.f146211d
            if (r5 != 0) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r1 = r5
        L_0x003e:
            r3.f106730i = r1
            java.util.ArrayList<te3.hx0> r5 = r3.f106731j
            java.util.LinkedList<te3.hx0> r4 = r4.f146212e
            r5.addAll(r4)
            goto L_0x004f
        L_0x0048:
            te3.zt0 r4 = new te3.zt0
            r4.<init>()
            r3.f106730i = r1
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bl1.C39773a.<init>(boolean, te3.xs0):void");
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        if (mVar instanceof C39773a) {
            return super.mo76f(mVar);
        }
        return -1;
    }

    public String getContent() {
        String str = this.f106730i;
        if (str != null) {
            return str;
        }
        C87412m.m108603p("msgContent");
        throw null;
    }

    /* renamed from: i */
    public String mo62406i() {
        StringBuilder sb = new StringBuilder();
        sb.append("AtBoxMsg, content:");
        String str = this.f106730i;
        if (str != null) {
            sb.append(str);
            sb.append(", contacts:");
            sb.append(C110818d0.m150921S(this.f106731j, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C39774a.f106732d, 31, (Object) null));
            sb.append(", ");
            sb.append(super.mo62406i());
            return sb.toString();
        }
        C87412m.m108603p("msgContent");
        throw null;
    }
}
