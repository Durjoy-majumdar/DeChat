package cm1;

import android.content.Context;
import android.text.SpannableString;
import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import er1.C58739j4;
import gy3.C87412m;
import java.util.ArrayList;
import jq3.C9493c;
import p629ny.C76979h;
import te3.C50717oq2;
import tf0.C64916p1;
import tf1.C13914m;
import up1.C65426w0;

/* renamed from: cm1.u */
public class C55033u implements C9493c, C13914m {

    /* renamed from: d */
    public C65426w0 f154492d;

    /* renamed from: e */
    public boolean f154493e;

    /* renamed from: f */
    public boolean f154494f;

    /* renamed from: g */
    public final SpannableString f154495g;

    /* renamed from: h */
    public final SpannableString f154496h;

    /* renamed from: i */
    public boolean f154497i;

    /* renamed from: j */
    public boolean f154498j;

    /* renamed from: n */
    public boolean f154499n;

    /* renamed from: o */
    public long f154500o;

    /* renamed from: p */
    public boolean f154501p;

    /* renamed from: q */
    public boolean f154502q;

    /* renamed from: r */
    public int f154503r;

    /* renamed from: s */
    public boolean f154504s;

    /* renamed from: t */
    public ArrayList<C50717oq2> f154505t;

    /* renamed from: u */
    public String f154506u;

    /* renamed from: v */
    public FinderCommentInfo f154507v;

    public C55033u(C65426w0 w0Var) {
        SpannableString spannableString;
        SpannableString spannableString2;
        Class cls = C64916p1.class;
        Class cls2 = C76979h.class;
        C87412m.m108594g(w0Var, "commentObj");
        this.f154492d = w0Var;
        boolean z = false;
        this.f154493e = !Util.isNullOrNil(w0Var.getUsername()) && (C58739j4.f168176a.mo83694W(this.f154492d.getUsername()) || ((C64916p1) C86312j.m106911c(cls)).mo76657EE(this.f154492d.getUsername()));
        if (!Util.isNullOrNil(this.f154492d.mo89543y2()) && (C58739j4.f168176a.mo83694W(this.f154492d.mo89543y2()) || ((C64916p1) C86312j.m106911c(cls)).mo76657EE(this.f154492d.mo89543y2()))) {
            z = true;
        }
        this.f154494f = z;
        Context context = MMApplicationContext.getContext();
        if (this.f154494f) {
            spannableString = ((C76979h) C86312j.m106911c(cls2)).mo107057T1(context, C58739j4.m68250G(C58739j4.f168176a, this.f154492d.mo89543y2(), this.f154492d.mo89542x2(), false, 4, (Object) null));
            C87412m.m108593f(spannableString, "{\n            ServiceMan…replyNickname))\n        }");
        } else {
            spannableString = ((C76979h) C86312j.m106911c(cls2)).mo107057T1(context, this.f154492d.mo89542x2());
            C87412m.m108593f(spannableString, "{\n            ServiceMan….replyNickname)\n        }");
        }
        this.f154496h = spannableString;
        if (this.f154493e) {
            spannableString2 = ((C76979h) C86312j.m106911c(cls2)).mo107057T1(context, C58739j4.m68250G(C58739j4.f168176a, this.f154492d.getUsername(), this.f154492d.getNickname(), false, 4, (Object) null));
            C87412m.m108593f(spannableString2, "{\n            ServiceMan…tObj.nickname))\n        }");
        } else {
            spannableString2 = ((C76979h) C86312j.m106911c(cls2)).mo107057T1(context, this.f154492d.getNickname());
            C87412m.m108593f(spannableString2, "{\n            ServiceMan…ntObj.nickname)\n        }");
        }
        this.f154495g = spannableString2;
        this.f154497i = true;
        this.f154498j = true;
        this.f154500o = 1000;
        this.f154503r = this.f154492d.mo89534q2();
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x008f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.text.SpannableString mo76088a(android.content.Context r12, java.lang.String r13, fy3.C32226l<? super te3.C50717oq2, rx3.C13598b0> r14) {
        /*
            r11 = this;
            java.lang.Class<tf0.p1> r0 = tf0.C64916p1.class
            java.lang.Class<ny.h> r1 = p629ny.C76979h.class
            java.lang.String r2 = "context"
            gy3.C87412m.m108594g(r12, r2)
            java.lang.String r2 = "onKeywordClick"
            gy3.C87412m.m108594g(r14, r2)
            up1.w0 r2 = r11.f154492d
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r3 = r2.mo89532o2()
            java.lang.String r3 = r3.replaced_content
            if (r3 != 0) goto L_0x001a
            java.lang.String r3 = ""
        L_0x001a:
            int r3 = r3.length()
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x0024
            r3 = 1
            goto L_0x0025
        L_0x0024:
            r3 = 0
        L_0x0025:
            r6 = 0
            if (r3 != 0) goto L_0x00d5
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r3 = r2.mo89532o2()
            java.util.LinkedList<te3.wh0> r3 = r3.search_keyword_info
            if (r3 == 0) goto L_0x0039
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r3 = 0
            goto L_0x003a
        L_0x0039:
            r3 = 1
        L_0x003a:
            if (r3 == 0) goto L_0x003e
            goto L_0x00d5
        L_0x003e:
            monitor-enter(r11)
            java.lang.String r3 = r11.f154506u     // Catch:{ all -> 0x00d2 }
            java.util.ArrayList<te3.oq2> r7 = r11.f154505t     // Catch:{ all -> 0x00d2 }
            if (r3 == 0) goto L_0x0047
            if (r7 != 0) goto L_0x0081
        L_0x0047:
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r8 = r11.f154507v     // Catch:{ all -> 0x00d2 }
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r9 = r2.mo89532o2()     // Catch:{ all -> 0x00d2 }
            boolean r8 = gy3.C87412m.m108589b(r8, r9)     // Catch:{ all -> 0x00d2 }
            if (r8 != 0) goto L_0x0081
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x00d2 }
            r7.<init>()     // Catch:{ all -> 0x00d2 }
            di3.d r3 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x00d2 }
            tf0.p1 r3 = (tf0.C64916p1) r3     // Catch:{ all -> 0x00d2 }
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r8 = r2.mo89532o2()     // Catch:{ all -> 0x00d2 }
            java.lang.String r8 = r8.replaced_content     // Catch:{ all -> 0x00d2 }
            if (r8 != 0) goto L_0x0068
            java.lang.String r8 = ""
        L_0x0068:
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r9 = r2.mo89532o2()     // Catch:{ all -> 0x00d2 }
            java.util.LinkedList<te3.wh0> r9 = r9.search_keyword_info     // Catch:{ all -> 0x00d2 }
            java.lang.String r10 = "comment.commentInfo.search_keyword_info"
            gy3.C87412m.m108593f(r9, r10)     // Catch:{ all -> 0x00d2 }
            java.lang.String r3 = r3.L60(r8, r9, r7)     // Catch:{ all -> 0x00d2 }
            r11.f154506u = r3     // Catch:{ all -> 0x00d2 }
            r11.f154505t = r7     // Catch:{ all -> 0x00d2 }
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r8 = r2.mo89532o2()     // Catch:{ all -> 0x00d2 }
            r11.f154507v = r8     // Catch:{ all -> 0x00d2 }
        L_0x0081:
            if (r3 == 0) goto L_0x008c
            int r8 = r3.length()     // Catch:{ all -> 0x00d2 }
            if (r8 != 0) goto L_0x008a
            goto L_0x008c
        L_0x008a:
            r8 = 0
            goto L_0x008d
        L_0x008c:
            r8 = 1
        L_0x008d:
            if (r8 != 0) goto L_0x00aa
            if (r7 == 0) goto L_0x0097
            boolean r8 = r7.isEmpty()     // Catch:{ all -> 0x00d2 }
            if (r8 == 0) goto L_0x0098
        L_0x0097:
            r4 = 1
        L_0x0098:
            if (r4 != 0) goto L_0x00aa
            di3.d r12 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x00d2 }
            tf0.p1 r12 = (tf0.C64916p1) r12     // Catch:{ all -> 0x00d2 }
            if (r13 != 0) goto L_0x00a4
            java.lang.String r13 = ""
        L_0x00a4:
            android.text.SpannableString r12 = r12.mo76721tb(r13, r3, r7, r14)     // Catch:{ all -> 0x00d2 }
            monitor-exit(r11)
            return r12
        L_0x00aa:
            di3.d r14 = di3.C86312j.m106911c(r1)     // Catch:{ all -> 0x00d2 }
            ny.h r14 = (p629ny.C76979h) r14     // Catch:{ all -> 0x00d2 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d2 }
            r0.<init>()     // Catch:{ all -> 0x00d2 }
            if (r13 != 0) goto L_0x00b9
            java.lang.String r13 = ""
        L_0x00b9:
            r0.append(r13)     // Catch:{ all -> 0x00d2 }
            java.lang.String r13 = r2.getContent()     // Catch:{ all -> 0x00d2 }
            r0.append(r13)     // Catch:{ all -> 0x00d2 }
            java.lang.String r13 = r0.toString()     // Catch:{ all -> 0x00d2 }
            android.text.SpannableString r12 = r14.Te0(r12, r13, r6)     // Catch:{ all -> 0x00d2 }
            java.lang.String r13 = "getService(ISpannableSer…\") + comment.content, 0f)"
            gy3.C87412m.m108593f(r12, r13)     // Catch:{ all -> 0x00d2 }
            monitor-exit(r11)
            return r12
        L_0x00d2:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        L_0x00d5:
            di3.d r14 = di3.C86312j.m106911c(r1)
            ny.h r14 = (p629ny.C76979h) r14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r13 != 0) goto L_0x00e4
            java.lang.String r13 = ""
        L_0x00e4:
            r0.append(r13)
            java.lang.String r13 = r2.getContent()
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            android.text.SpannableString r12 = r14.Te0(r12, r13, r6)
            java.lang.String r13 = "getService(ISpannableSer…\") + comment.content, 0f)"
            gy3.C87412m.m108593f(r12, r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: cm1.C55033u.mo76088a(android.content.Context, java.lang.String, fy3.l):android.text.SpannableString");
    }

    /* renamed from: b */
    public final C65426w0 mo76089b() {
        return this.f154492d;
    }

    /* renamed from: c */
    public int mo75c() {
        return this.f154492d.field_actionInfo.f186500h == 0 ? 1 : 2;
    }

    /* renamed from: d */
    public final boolean mo76090d() {
        return this.f154497i;
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        return 0;
    }

    public long getItemId() {
        return this.f154492d.mo89531n2();
    }

    /* renamed from: i */
    public final SpannableString mo76091i() {
        return this.f154495g;
    }

    /* renamed from: j */
    public final ArrayList<C50717oq2> mo76092j() {
        return this.f154505t;
    }

    /* renamed from: k */
    public final SpannableString mo76093k() {
        return this.f154496h;
    }

    /* renamed from: l */
    public final boolean mo76094l() {
        return this.f154498j;
    }

    /* renamed from: m */
    public final boolean mo76095m() {
        return this.f154493e;
    }
}
