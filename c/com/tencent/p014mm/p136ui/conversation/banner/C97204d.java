package com.tencent.p014mm.p136ui.conversation.banner;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import eb0.C97625j3;
import f40.C86709a0;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import xd3.C78802b;

/* renamed from: com.tencent.mm.ui.conversation.banner.d */
public class C97204d extends C78802b {

    /* renamed from: h */
    public C97207e f285223h;

    /* renamed from: i */
    public C97211g f285224i;

    /* renamed from: j */
    public View f285225j = null;

    /* renamed from: n */
    public C97205a f285226n;

    /* renamed from: com.tencent.mm.ui.conversation.banner.d$a */
    public interface C97205a {
    }

    public C97204d(Context context) {
        super(context);
        View view = this.f230569f;
        if (view != null) {
            this.f285225j = view.findViewById(C0966R.C0970id.f5647kr);
            C97211g gVar = new C97211g();
            this.f285224i = gVar;
            gVar.f285230a = this.f285225j;
            gVar.f285231b = (Button) this.f230569f.findViewById(C0966R.C0970id.f5533hm);
            this.f285224i.f285231b.setOnClickListener(new C97195a(this));
            this.f285225j.setOnClickListener(new C97196b(this));
        }
    }

    /* renamed from: a */
    public void mo7968a() {
        if (C86709a0.m107523b().mo121114l()) {
            C97625j3.m125812b().mo105906u().remove(this.f285223h);
        }
    }

    /* renamed from: b */
    public int mo7969b() {
        return C0966R.C0971layout.f6368cx;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f7, code lost:
        if (r4 == false) goto L_0x00fa;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7970e() {
        /*
            r13 = this;
            com.tencent.mm.ui.conversation.banner.e r0 = new com.tencent.mm.ui.conversation.banner.e
            java.lang.ref.WeakReference<android.content.Context> r1 = r13.f230570g
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            r0.<init>(r1)
            r13.f285223h = r0
            com.tencent.mm.ui.conversation.banner.c r0 = new com.tencent.mm.ui.conversation.banner.c
            r0.<init>(r13)
            r13.f285226n = r0
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r1 = r1.mo105906u()
            r2 = 8449(0x2101, float:1.184E-41)
            r3 = 0
            java.lang.Object r1 = r1.mo119684e(r2, r3)
            r2 = 0
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsInt(r1, r2)
            long r4 = (long) r1
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            long r6 = r6 - r4
            r1 = 1
            r8 = 0
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x0047
            r4 = 86400(0x15180, double:4.26873E-319)
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 < 0) goto L_0x0047
            sd3.C101583a.m133406a()
            goto L_0x0102
        L_0x0047:
            eb0.c r4 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r4 = r4.mo105906u()
            r5 = 8193(0x2001, float:1.1481E-41)
            java.lang.Object r4 = r4.mo119684e(r5, r3)
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r5 != 0) goto L_0x0102
            java.lang.String r5 = "id=\"setavatar\""
            boolean r5 = r4.contains(r5)
            if (r5 == 0) goto L_0x006a
            sd3.C101583a.m133406a()
            goto L_0x0102
        L_0x006a:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r5 == 0) goto L_0x0072
            goto L_0x00fa
        L_0x0072:
            java.util.ArrayList r0 = sd3.C101583a.m133409d(r0, r4)
            if (r0 == 0) goto L_0x00fa
            int r4 = r0.size()
            if (r4 == r1) goto L_0x0080
            goto L_0x00fa
        L_0x0080:
            java.lang.Object r0 = r0.get(r2)
            sd3.a r0 = (sd3.C101583a) r0
            java.util.Map<java.lang.String, java.lang.String> r4 = r0.f297397i
            if (r4 == 0) goto L_0x0092
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0092
            r4 = 1
            goto L_0x0093
        L_0x0092:
            r4 = 0
        L_0x0093:
            if (r4 == 0) goto L_0x00fa
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            java.lang.String r6 = r0.f297395g     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r7 = "yyyy-MM-dd-HH"
            if (r6 == 0) goto L_0x00b0
            java.text.SimpleDateFormat r6 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x00f5 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r10 = r0.f297395g     // Catch:{ Exception -> 0x00f5 }
            java.util.Date r6 = r6.parse(r10)     // Catch:{ Exception -> 0x00f5 }
            long r10 = r6.getTime()     // Catch:{ Exception -> 0x00f5 }
            goto L_0x00b5
        L_0x00b0:
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x00b5:
            java.lang.String r6 = r0.f297394f     // Catch:{ Exception -> 0x00f5 }
            if (r6 == 0) goto L_0x00c8
            java.text.SimpleDateFormat r6 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x00f5 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r7 = r0.f297394f     // Catch:{ Exception -> 0x00f5 }
            java.util.Date r6 = r6.parse(r7)     // Catch:{ Exception -> 0x00f5 }
            long r8 = r6.getTime()     // Catch:{ Exception -> 0x00f5 }
        L_0x00c8:
            java.lang.String r6 = "MicroMsg.PushMessage"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f5 }
            r7.<init>()     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r12 = "CHECKTIME : ["
            r7.append(r12)     // Catch:{ Exception -> 0x00f5 }
            r7.append(r8)     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r12 = ","
            r7.append(r12)     // Catch:{ Exception -> 0x00f5 }
            r7.append(r10)     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r12 = "]"
            r7.append(r12)     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x00f5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r7)     // Catch:{ Exception -> 0x00f5 }
            int r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x00f3
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x00f6
        L_0x00f3:
            r4 = 0
            goto L_0x00f7
        L_0x00f5:
        L_0x00f6:
            r4 = 1
        L_0x00f7:
            if (r4 == 0) goto L_0x00fa
            goto L_0x00fb
        L_0x00fa:
            r0 = r3
        L_0x00fb:
            if (r0 != 0) goto L_0x0101
            sd3.C101583a.m133406a()
            goto L_0x0102
        L_0x0101:
            r3 = r0
        L_0x0102:
            com.tencent.mm.ui.conversation.banner.e r0 = r13.f285223h
            r4 = 8
            if (r0 == 0) goto L_0x0143
            if (r3 != 0) goto L_0x010e
            r13.mo7975g(r4)
            goto L_0x0143
        L_0x010e:
            r0.f285228p = r3
            r0.mo1333o()
            com.tencent.mm.ui.conversation.banner.e r0 = r13.f285223h
            if (r0 == 0) goto L_0x0131
            int r0 = r0.getCount()
            if (r0 <= 0) goto L_0x0131
            com.tencent.mm.ui.conversation.banner.e r0 = r13.f285223h
            java.util.ArrayList<com.tencent.mm.ui.conversation.banner.f> r0 = r0.f285227o
            java.lang.Object r0 = r0.get(r2)
            com.tencent.mm.ui.conversation.banner.f r0 = (com.tencent.p014mm.p136ui.conversation.banner.C97210f) r0
            com.tencent.mm.ui.conversation.banner.g r3 = r13.f285224i
            int r0 = r0.mo136118a(r3)
            if (r0 != 0) goto L_0x0131
            r0 = 1
            goto L_0x0132
        L_0x0131:
            r0 = 0
        L_0x0132:
            if (r0 == 0) goto L_0x0140
            java.lang.String r0 = "MicroMsg.ADBanner"
            java.lang.String r3 = "refreshAndReturnIsVisible[true]"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            r13.mo7975g(r2)
            return r1
        L_0x0140:
            r13.mo7975g(r4)
        L_0x0143:
            r13.mo7975g(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.conversation.banner.C97204d.mo7970e():boolean");
    }

    /* renamed from: f */
    public void mo7971f() {
        this.f285223h = null;
    }

    /* renamed from: g */
    public void mo7975g(int i) {
        View view = this.f285225j;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/conversation/banner/ADBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/conversation/banner/ADBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
