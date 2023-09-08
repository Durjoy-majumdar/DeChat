package kd1;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.jsapi.profile.C40475h;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import dp1.C58417y0;
import er1.C58684b;
import gy3.C8480h;
import gy3.C87412m;
import jq3.C60905o;
import o40.C61926c;
import pf1.C11920q;
import pf1.C62262d0;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C52271zj0;

/* renamed from: kd1.g */
public final class C9585g {

    /* renamed from: a */
    public static final C9585g f29823a = new C9585g();

    /* renamed from: kd1.g$a */
    public static final class C9586a {

        /* renamed from: a */
        public int f29824a;

        /* renamed from: b */
        public int f29825b;

        public C9586a() {
            this(0, 0, 3, (C8480h) null);
        }

        public C9586a(int i, int i2, int i3, C8480h hVar) {
            i = (i3 & 1) != 0 ? 2 : i;
            i2 = (i3 & 2) != 0 ? 0 : i2;
            this.f29824a = i;
            this.f29825b = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9586a)) {
                return false;
            }
            C9586a aVar = (C9586a) obj;
            return this.f29824a == aVar.f29824a && this.f29825b == aVar.f29825b;
        }

        public int hashCode() {
            return (this.f29824a * 31) + this.f29825b;
        }

        public String toString() {
            return "JoinResult(joinActivityResult=" + this.f29824a + ", interceptType=" + this.f29825b + ')';
        }
    }

    /* renamed from: b */
    public static void m9267b(C9585g gVar, Context context, long j, C52271zj0 zj02, String str, int i, Object obj) {
        C13598b0 b0Var;
        String str2;
        Context context2 = context;
        C52271zj0 zj03 = zj02;
        String str3 = (i & 8) != 0 ? "feed_jumpicon" : str;
        gVar.getClass();
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str3, "eid");
        if (zj03 != null) {
            FinderJumpInfo finderJumpInfo = zj03.f146020v;
            C49712hj1 hj12 = null;
            if (finderJumpInfo != null) {
                f29823a.mo10263a(context, j, zj02, finderJumpInfo, str3);
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                StringBuilder sb = new StringBuilder();
                FinderContact finderContact = zj03.f146006e;
                if (finderContact == null || (str2 = finderContact.username) == null) {
                    str2 = "";
                }
                sb.append(str2);
                sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
                sb.append(Util.getUuidRandom());
                String sb4 = sb.toString();
                C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
                String str4 = zj03.f146014p;
                if (str4 == null) {
                    str4 = "";
                }
                C13442s8 f = C13442s8.f38060Q0.mo12873f(context);
                if (f != null) {
                    hj12 = f.mo12861q3();
                }
                y0Var.Ey0(str4, 2, hj12, C61926c.m72691p(j));
                C58684b bVar = (C58684b) C86312j.m106911c(C58684b.class);
                String str5 = zj03.f146014p;
                String str6 = str5 == null ? "" : str5;
                String str7 = zj03.f146015q;
                String str8 = str7 == null ? "" : str7;
                Context context3 = context;
                bVar.mo13270U5(context3, str6, str8, C40475h.CTRL_INDEX, sb4);
                C9584f.m9265b(C9584f.f29822a, context3, "link_miniprogram", 1, 0, 0, zj02, (C9586a) null, 88, (Object) null);
            }
        }
    }

    /* renamed from: a */
    public final void mo10263a(Context context, long j, C52271zj0 zj02, FinderJumpInfo finderJumpInfo, String str) {
        String str2;
        String str3;
        FinderContact finderContact;
        Context context2 = context;
        C52271zj0 zj03 = zj02;
        FinderJumpInfo finderJumpInfo2 = finderJumpInfo;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(finderJumpInfo2, "jumpInfo");
        C87412m.m108594g(str, "eid");
        if (finderJumpInfo2.jumpinfo_type == 1) {
            StringBuilder sb = new StringBuilder();
            String str4 = "";
            if (zj03 == null || (finderContact = zj03.f146006e) == null || (str2 = finderContact.username) == null) {
                str2 = str4;
            }
            sb.append(str2);
            sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
            sb.append(Util.getUuidRandom());
            String sb4 = sb.toString();
            C13442s8 f = C13442s8.f38060Q0.mo12873f(context);
            C49712hj1 q3 = f != null ? f.mo12861q3() : null;
            C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
            if (!(zj03 == null || (str3 = zj03.f146014p) == null)) {
                str4 = str3;
            }
            y0Var.Ey0(str4, 2, q3, C61926c.m72691p(j));
            C11920q qVar = new C11920q(finderJumpInfo2);
            qVar.f34836j = sb4;
            C62262d0.m73170n(C62262d0.f176978a, context, qVar, C40475h.CTRL_INDEX, false, (C60905o) null, 0.0f, 56, (Object) null);
        } else {
            C62262d0.m73168c(C62262d0.f176978a, context, new C11920q(finderJumpInfo2), 0, (C60905o) null, 12, (Object) null);
        }
        C9584f.m9265b(C9584f.f29822a, context, str, 1, 0, 0, zj02, (C9586a) null, 88, (Object) null);
    }
}
