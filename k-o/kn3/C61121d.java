package kn3;

import android.app.Activity;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tipsbar.ChatTipsBarGroup;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import js3.C60921b;
import ln3.C61316d;
import ls3.C10649f;
import ls3.C34356e;
import mn3.C61504d;
import nj3.C11184p0;
import o40.C61926c;
import p151er.C58676k;
import p565ir.C60604l;
import p565ir.C60606n;
import p744wt.C66191d;
import te3.C64238ap2;
import te3.C64279c90;
import z04.C112551y;

/* renamed from: kn3.d */
public final class C61121d extends C61118a<C61316d> {

    /* renamed from: e */
    public final C67391b f174017e;

    /* renamed from: f */
    public final ChatTipsBarGroup.C74825d f174018f;

    /* renamed from: g */
    public final String f174019g = "Finder.FinderLiveTipsBarConvert";

    /* renamed from: kn3.d$a */
    public static final class C61122a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f174020d;

        /* renamed from: e */
        public final /* synthetic */ int f174021e;

        /* renamed from: f */
        public final /* synthetic */ long f174022f;

        /* renamed from: g */
        public final /* synthetic */ long f174023g;

        /* renamed from: h */
        public final /* synthetic */ String f174024h;

        /* renamed from: i */
        public final /* synthetic */ C61121d f174025i;

        /* renamed from: j */
        public final /* synthetic */ int f174026j;

        public C61122a(String str, int i, long j, long j2, String str2, C61121d dVar, int i2) {
            this.f174020d = str;
            this.f174021e = i;
            this.f174022f = j;
            this.f174023g = j2;
            this.f174024h = str2;
            this.f174025i = dVar;
            this.f174026j = i2;
        }

        public final void onClick(View view) {
            Class cls = C60604l.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/tipsbar/convert/FinderLiveTipsBarConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (C87412m.m108589b(this.f174020d, ((C58676k) C86312j.m106911c(C58676k.class)).mo83550O5())) {
                Intent intent = new Intent();
                intent.putExtra("KEY_PARAMS_SOURCE_TYPE", this.f174021e);
                ((C60606n) C86312j.m106911c(C60606n.class)).o90(intent, MMApplicationContext.getContext(), this.f174022f, Long.valueOf(this.f174023g), this.f174024h, "", "", "", "");
            } else {
                Intent intent2 = new Intent();
                intent2.putExtra("key_enter_live_param_is_from_chat_group", this.f174025i.f174017e.mo91583x());
                if (this.f174025i.f174017e.mo91583x()) {
                    String r = this.f174025i.f174017e.mo91577r();
                    boolean z = false;
                    if (r != null && C112551y.m153808h(r, "@chatroom", false, 2, (Object) null)) {
                        z = true;
                    }
                    if (z) {
                        String r2 = this.f174025i.f174017e.mo91577r();
                        if (r2 == null) {
                            r2 = "";
                        }
                        intent2.putExtra("KEY_ENTER_LIVE_PARAM_BOX_GROUP_ID", r2);
                        intent2.putExtra("KEY_ENTER_LIVE_PARAM_BOX_GROUP_TO_LIVEID", this.f174023g);
                    }
                }
                long nT = ((C66191d) C86312j.m106911c(C66191d.class)).mo61354nT();
                long j = this.f174022f;
                long j2 = this.f174023g;
                String str = this.f174020d;
                C87412m.m108593f(str, "anchorUsername");
                ((C60604l) C86312j.m106911c(cls)).mo84970fk(nT, j, j2, str, this.f174026j);
                String R1 = ((C60604l) C86312j.m106911c(cls)).mo84969R1(3, 28, 65);
                C64238ap2 ap22 = new C64238ap2();
                long j3 = this.f174022f;
                long j4 = this.f174023g;
                String str2 = this.f174024h;
                String str3 = this.f174020d;
                ap22.f182124d = j3;
                ap22.f182125e = j4;
                ap22.f182126f = str2;
                ap22.f182127g = str3;
                ap22.f182128h = "";
                ap22.f182129i = "";
                ap22.f182130j = null;
                C64279c90 c902 = new C64279c90();
                c902.f182444d = R1;
                c902.f182445e = "";
                c902.f182447g = -1;
                c902.f182448h = -1;
                c902.f182449i = 1;
                Activity f = this.f174025i.f174017e.mo91565f();
                C87412m.m108593f(f, "ui.context");
                ((C10649f) C86312j.m106911c(C10649f.class)).mo10916tP(f, intent2, ap22, ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76861l7().mo83771R5(), c902, (C10649f.C10650a) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/tipsbar/convert/FinderLiveTipsBarConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: kn3.d$b */
    public static final class C61123b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C61121d f174027d;

        /* renamed from: e */
        public final /* synthetic */ long f174028e;

        public C61123b(C61121d dVar, long j) {
            this.f174027d = dVar;
            this.f174028e = j;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (menuItem.getItemId() == 0) {
                String str = this.f174027d.f174019g;
                Log.m105924i(str, "click close finder live tipsbar, liveId:" + C61926c.m72691p(this.f174028e));
                C60921b XA = ((C34356e) C86312j.m106911c(C34356e.class)).mo58236XA();
                if (XA != null) {
                    XA.mo59087d(this.f174028e);
                }
            }
        }
    }

    public C61121d(C67391b bVar, ChatTipsBarGroup.C74825d dVar, C61504d dVar2) {
        C87412m.m108594g(bVar, "ui");
        C87412m.m108594g(dVar, "tipsBarContext");
        C87412m.m108594g(dVar2, "processor");
        this.f174017e = bVar;
        this.f174018f = dVar;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cz6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f1, code lost:
        r16 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0130, code lost:
        r16 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0133, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0133 A[ExcHandler: Exception (e java.lang.Exception), PHI: r3 
      PHI: (r3v36 java.lang.String) = (r3v37 java.lang.String), (r3v37 java.lang.String), (r3v42 java.lang.String) binds: [B:48:0x00f6, B:49:?, B:25:0x00b8] A[DONT_GENERATE, DONT_INLINE], Splitter:B:25:0x00b8] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x02e7  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r19, ln3.C61316d r20, int r21, int r22, boolean r23, java.util.List<java.lang.Object> r24) {
        /*
            r18 = this;
            r11 = r18
            r1 = r19
            r2 = r20
            java.lang.String r0 = "holder"
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "item"
            gy3.C87412m.m108594g(r2, r0)
            super.mo86076k(r19, r20, r21, r22, r23, r24)
            r0 = 2131304340(0x7f091f94, float:1.822682E38)
            android.view.View r0 = r1.mo85812D(r0)
            r3 = r0
            com.tencent.neattextview.textview.view.NeatTextView r3 = (com.tencent.neattextview.textview.view.NeatTextView) r3
            xh.o3 r0 = r2.f174434u
            java.lang.String r4 = r0.field_hostRoomId
            java.lang.String r5 = ""
            if (r4 != 0) goto L_0x0026
            r4 = r5
        L_0x0026:
            java.lang.String r0 = r0.field_anchorWxUsername
            if (r0 != 0) goto L_0x002c
            r6 = r5
            goto L_0x002d
        L_0x002c:
            r6 = r0
        L_0x002d:
            java.lang.Class<d62.i> r0 = d62.C75339i.class
            java.lang.String r7 = ",resutl:"
            java.lang.String r8 = "stop getChatDisplayName :chatRoomId:"
            java.lang.String r9 = "result"
            java.lang.Class<f62.k0> r10 = f62.C75700k0.class
            k40.a r10 = f40.C86709a0.m107533q(r10)
            f62.k0 r10 = (f62.C75700k0) r10
            com.tencent.mm.storage.u3 r10 = r10.mo96097Ni()
            com.tencent.mm.storage.z1 r10 = r10.get(r6)
            java.lang.String r12 = r10.getNickname()
            java.lang.String r13 = ",nickname:"
            java.lang.String r14 = ", "
            java.lang.String r15 = r11.f174019g
            r22 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r23 = r3
            java.lang.String r3 = "start getChatDisplayName :chatRoomId:"
            r5.append(r3)
            r5.append(r4)
            r5.append(r14)
            r5.append(r6)
            r5.append(r13)
            r5.append(r12)
            java.lang.String r3 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r3)
            di3.d r15 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x0139, all -> 0x0137 }
            d62.i r15 = (d62.C75339i) r15     // Catch:{ Exception -> 0x0139, all -> 0x0137 }
            java.lang.String r15 = r15.mo62515Si(r6)     // Catch:{ Exception -> 0x0139, all -> 0x0137 }
            java.lang.CharSequence r16 = qe0.C47802c.m53111a(r10, r15)     // Catch:{ Exception -> 0x0139, all -> 0x0137 }
            if (r16 == 0) goto L_0x008b
            java.lang.String r16 = r16.toString()     // Catch:{ Exception -> 0x0139, all -> 0x0137 }
            if (r16 != 0) goto L_0x008d
        L_0x008b:
            r16 = r22
        L_0x008d:
            int r17 = r16.length()     // Catch:{ Exception -> 0x0135 }
            if (r17 != 0) goto L_0x0096
            r17 = 1
            goto L_0x0098
        L_0x0096:
            r17 = 0
        L_0x0098:
            if (r17 == 0) goto L_0x00f4
            java.lang.Class<a11.c> r17 = a11.C39479c.class
            k40.a r17 = f40.C86709a0.m107533q(r17)     // Catch:{ Exception -> 0x0135 }
            a11.c r17 = (a11.C39479c) r17     // Catch:{ Exception -> 0x0135 }
            eb0.m2 r17 = r17.mo62084mr()     // Catch:{ Exception -> 0x0135 }
            r3 = r17
            com.tencent.mm.storage.n1 r3 = (com.tencent.p014mm.storage.C44662n1) r3     // Catch:{ Exception -> 0x0135 }
            com.tencent.mm.storage.m1 r3 = r3.mo69799Lo(r4)     // Catch:{ Exception -> 0x0135 }
            if (r3 == 0) goto L_0x00b6
            java.lang.String r3 = r3.mo69789q2(r6)     // Catch:{ Exception -> 0x0135 }
            if (r3 != 0) goto L_0x00b8
        L_0x00b6:
            r3 = r22
        L_0x00b8:
            int r16 = r3.length()     // Catch:{ Exception -> 0x0133, all -> 0x0175 }
            if (r16 != 0) goto L_0x00c1
            r16 = 1
            goto L_0x00c3
        L_0x00c1:
            r16 = 0
        L_0x00c3:
            if (r16 == 0) goto L_0x00df
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x0133, all -> 0x0175 }
            d62.i r0 = (d62.C75339i) r0     // Catch:{ Exception -> 0x0133, all -> 0x0175 }
            java.lang.String r0 = r0.getDisplayName(r6)     // Catch:{ Exception -> 0x0133, all -> 0x0175 }
            java.lang.CharSequence r0 = qe0.C47802c.m53111a(r10, r0)     // Catch:{ Exception -> 0x0133, all -> 0x0175 }
            if (r0 == 0) goto L_0x00db
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0133, all -> 0x0175 }
            if (r0 != 0) goto L_0x00dc
        L_0x00db:
            r0 = r12
        L_0x00dc:
            r16 = r0
            goto L_0x00e1
        L_0x00df:
            r16 = r3
        L_0x00e1:
            if (r16 == 0) goto L_0x00ec
            int r0 = r16.length()     // Catch:{ Exception -> 0x0135 }
            if (r0 != 0) goto L_0x00ea
            goto L_0x00ec
        L_0x00ea:
            r0 = 0
            goto L_0x00ed
        L_0x00ec:
            r0 = 1
        L_0x00ed:
            if (r0 == 0) goto L_0x00f4
            r3 = r12
            goto L_0x00f6
        L_0x00f1:
            r16 = r3
            goto L_0x013c
        L_0x00f4:
            r3 = r16
        L_0x00f6:
            java.lang.String r0 = r11.f174019g     // Catch:{ Exception -> 0x0133, all -> 0x0130 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0133, all -> 0x0130 }
            r5.<init>()     // Catch:{ Exception -> 0x0133, all -> 0x0130 }
            java.lang.String r1 = "getChatDisplayName :chatRoomId:"
            r5.append(r1)     // Catch:{ Exception -> 0x0133, all -> 0x0130 }
            r5.append(r4)     // Catch:{ Exception -> 0x0133, all -> 0x0130 }
            r5.append(r14)     // Catch:{ Exception -> 0x0133, all -> 0x0130 }
            r5.append(r6)     // Catch:{ Exception -> 0x0133, all -> 0x0130 }
            r5.append(r13)     // Catch:{ Exception -> 0x0133, all -> 0x0130 }
            r5.append(r12)     // Catch:{ Exception -> 0x0133, all -> 0x0130 }
            java.lang.String r1 = ",ct:"
            r5.append(r1)     // Catch:{ Exception -> 0x0133, all -> 0x0130 }
            r5.append(r10)     // Catch:{ Exception -> 0x0133, all -> 0x0130 }
            java.lang.String r1 = ",remark:"
            r5.append(r1)     // Catch:{ Exception -> 0x0133, all -> 0x0130 }
            r5.append(r15)     // Catch:{ Exception -> 0x0133, all -> 0x0130 }
            java.lang.String r1 = r5.toString()     // Catch:{ Exception -> 0x0133, all -> 0x0130 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ Exception -> 0x0133, all -> 0x0130 }
            java.lang.String r0 = r11.f174019g
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x017c
        L_0x0130:
            r16 = r3
            goto L_0x0173
        L_0x0133:
            r0 = move-exception
            goto L_0x00f1
        L_0x0135:
            r0 = move-exception
            goto L_0x013c
        L_0x0137:
            r3 = r12
            goto L_0x0175
        L_0x0139:
            r0 = move-exception
            r16 = r12
        L_0x013c:
            java.lang.Class<ht1.a5> r1 = ht1.C76243a5.class
            di3.d r1 = di3.C86312j.m106911c(r1)     // Catch:{ all -> 0x0173 }
            ht1.a5 r1 = (ht1.C76243a5) r1     // Catch:{ all -> 0x0173 }
            java.lang.String r3 = "getChatDisplayName"
            r1.mo13229Xd(r0, r3)     // Catch:{ all -> 0x0173 }
            java.lang.String r0 = r11.f174019g
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r1.append(r4)
            r1.append(r14)
            r1.append(r6)
            r1.append(r13)
            r1.append(r12)
            r1.append(r7)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            gy3.C87412m.m108593f(r12, r9)
            goto L_0x019f
        L_0x0173:
            r3 = r16
        L_0x0175:
            java.lang.String r0 = r11.f174019g
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L_0x017c:
            r1.append(r8)
            r1.append(r4)
            r1.append(r14)
            r1.append(r6)
            r1.append(r13)
            r1.append(r12)
            r1.append(r7)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            gy3.C87412m.m108593f(r3, r9)
            r12 = r3
        L_0x019f:
            xh.o3 r0 = r2.f174434u
            java.lang.String r0 = r0.field_anchorFinderNickname
            if (r0 != 0) goto L_0x01a7
            r0 = r22
        L_0x01a7:
            r1 = r19
            android.content.Context r3 = r1.f173499A
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r3 = r3.widthPixels
            float r3 = (float) r3
            android.content.Context r4 = r1.f173499A
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131165284(0x7f070064, float:1.794478E38)
            float r4 = r4.getDimension(r5)
            float r3 = r3 - r4
            android.content.Context r4 = r1.f173499A
            java.lang.String r5 = "holder.context"
            gy3.C87412m.m108593f(r4, r5)
            android.content.Context r5 = r1.f173499A
            r6 = 2131827207(0x7f111a07, float:1.928732E38)
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r7 = 0
            r8[r7] = r12
            java.lang.String r5 = r5.getString(r6, r8)
            java.lang.String r6 = "holder.context.getString…ar_title_empty, nickname)"
            gy3.C87412m.m108593f(r5, r6)
            r6 = 2131827206(0x7f111a06, float:1.9287318E38)
            java.lang.String r7 = "titleTv"
            r8 = r23
            gy3.C87412m.m108593f(r8, r7)
            int r3 = (int) r3
            java.lang.Class<ny.h> r7 = p629ny.C76979h.class
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "setTextDesc name:"
            r9.append(r10)
            r9.append(r0)
            java.lang.String r10 = ", wxNickname:"
            r9.append(r10)
            r9.append(r12)
            java.lang.String r10 = ", emptyDesc:"
            r9.append(r10)
            r9.append(r5)
            java.lang.String r10 = ", maxWidth:"
            r9.append(r10)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "SimpleUIComponent"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r9)
            r8.mo104279b(r5)
            r5 = 2147483647(0x7fffffff, float:NaN)
            yr3.a r9 = r8.mo154990i(r3, r5)
            yr3.c r9 = (yr3.C112481c) r9
            r10 = 0
            int r13 = r9.mo109129m0(r10)
            float r3 = (float) r3
            float r9 = r9.mo109134r0(r10)
            float r3 = r3 - r9
            r9 = 2
            if (r13 > 0) goto L_0x02ba
            r10 = 0
            int r10 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r10 > 0) goto L_0x023d
            goto L_0x02ba
        L_0x023d:
            r8.setMaxLines(r5)
            di3.d r10 = di3.C86312j.m106911c(r7)
            ny.h r10 = (p629ny.C76979h) r10
            android.text.SpannableString r10 = r10.mo107057T1(r4, r0)
            r8.mo104279b(r10)
            int r3 = (int) r3
            yr3.a r3 = r8.mo154990i(r3, r5)
            r5 = r3
            com.tencent.neattextview.textview.layout.NeatLayout r5 = (com.tencent.neattextview.textview.layout.NeatLayout) r5
            int r5 = r5.f319992L
            r10 = 1
            if (r5 <= r10) goto L_0x029d
            yr3.c r3 = (yr3.C112481c) r3
            int r3 = r3.mo109122b(r10)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r10 = r0.length()
            int r3 = java.lang.Math.min(r3, r10)
            r10 = 0
            java.lang.String r0 = r0.substring(r10, r3)
            java.lang.String r3 = "this as java.lang.String…ing(startIndex, endIndex)"
            gy3.C87412m.m108593f(r0, r3)
            r5.append(r0)
            r0 = 8230(0x2026, float:1.1533E-41)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            di3.d r3 = di3.C86312j.m106911c(r7)
            ny.h r3 = (p629ny.C76979h) r3
            java.lang.Object[] r5 = new java.lang.Object[r9]
            r5[r10] = r12
            r13 = 1
            r5[r13] = r0
            java.lang.String r0 = r4.getString(r6, r5)
            android.text.SpannableString r0 = r3.mo107057T1(r4, r0)
            r8.mo104279b(r0)
            goto L_0x02b6
        L_0x029d:
            r10 = 0
            r13 = 1
            di3.d r3 = di3.C86312j.m106911c(r7)
            ny.h r3 = (p629ny.C76979h) r3
            java.lang.Object[] r5 = new java.lang.Object[r9]
            r5[r10] = r12
            r5[r13] = r0
            java.lang.String r0 = r4.getString(r6, r5)
            android.text.SpannableString r0 = r3.mo107057T1(r4, r0)
            r8.mo104279b(r0)
        L_0x02b6:
            r8.setMaxLines(r13)
            goto L_0x02d3
        L_0x02ba:
            r13 = 1
            di3.d r3 = di3.C86312j.m106911c(r7)
            ny.h r3 = (p629ny.C76979h) r3
            java.lang.Object[] r5 = new java.lang.Object[r9]
            r7 = 0
            r5[r7] = r12
            r5[r13] = r0
            java.lang.String r0 = r4.getString(r6, r5)
            android.text.SpannableString r0 = r3.mo107057T1(r4, r0)
            r8.mo104279b(r0)
        L_0x02d3:
            r0 = 2131304339(0x7f091f93, float:1.8226818E38)
            android.view.View r0 = r1.mo85812D(r0)
            xh.o3 r1 = r2.f174434u
            long r12 = r1.field_liveId
            long r14 = r1.field_finderObjectId
            java.lang.String r2 = r1.field_finderNonceId
            if (r2 != 0) goto L_0x02e7
            r16 = r22
            goto L_0x02e9
        L_0x02e7:
            r16 = r2
        L_0x02e9:
            java.lang.String r10 = r1.field_anchorFinderUsername
            int r1 = r1.field_sourceType
            java.lang.Class<ir.l> r2 = p565ir.C60604l.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ir.l r2 = (p565ir.C60604l) r2
            java.lang.Class<wt.d> r3 = p744wt.C66191d.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            wt.d r3 = (p744wt.C66191d) r3
            long r3 = r3.Re0()
            java.lang.String r5 = "anchorUsername"
            gy3.C87412m.m108593f(r10, r5)
            r5 = r14
            r7 = r12
            r9 = r10
            r17 = r10
            r10 = r21
            r2.mo84970fk(r3, r5, r7, r9, r10)
            kn3.d$a r10 = new kn3.d$a
            r3 = r1
            r1 = r10
            r2 = r17
            r4 = r14
            r6 = r12
            r8 = r16
            r9 = r18
            r14 = r10
            r10 = r21
            r1.<init>(r2, r3, r4, r6, r8, r9, r10)
            r0.setOnClickListener(r14)
            com.tencent.mm.ui.tipsbar.ChatTipsBarGroup$d r1 = r11.f174018f
            kn3.d$b r2 = new kn3.d$b
            r2.<init>(r11, r12)
            r3 = r21
            r11.mo86075j(r0, r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kn3.C61121d.mo44e(jq3.o, ln3.d, int, int, boolean, java.util.List):void");
    }
}
