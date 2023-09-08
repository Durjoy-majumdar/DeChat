package np0;

import android.os.Bundle;
import d62.C7240a;
import d62.C7241k;
import java.lang.ref.WeakReference;
import java.util.Map;
import wd3.C53155r0;

/* renamed from: np0.u */
public class C76951u implements C7241k.C7244c {

    /* renamed from: np0.u$a */
    public class C76952a extends C7240a {

        /* renamed from: e */
        public final /* synthetic */ String f224871e;

        /* renamed from: f */
        public final /* synthetic */ String f224872f;

        /* renamed from: g */
        public final /* synthetic */ String f224873g;

        /* renamed from: h */
        public final /* synthetic */ String f224874h;

        /* renamed from: i */
        public final /* synthetic */ WeakReference f224875i;

        /* renamed from: j */
        public final /* synthetic */ int f224876j;

        /* renamed from: n */
        public final /* synthetic */ long f224877n;

        /* renamed from: o */
        public final /* synthetic */ String f224878o;

        /* renamed from: p */
        public final /* synthetic */ int f224879p;

        /* renamed from: q */
        public final /* synthetic */ Map f224880q;

        /* renamed from: r */
        public final /* synthetic */ Bundle f224881r;

        /* renamed from: s */
        public final /* synthetic */ WeakReference f224882s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76952a(C76951u uVar, int i, C53155r0 r0Var, String str, String str2, String str3, String str4, WeakReference weakReference, int i2, long j, String str5, int i3, Map map, Bundle bundle, WeakReference weakReference2) {
            super(i, r0Var);
            this.f224871e = str;
            this.f224872f = str2;
            this.f224873g = str3;
            this.f224874h = str4;
            this.f224875i = weakReference;
            this.f224876j = i2;
            this.f224877n = j;
            this.f224878o = str5;
            this.f224879p = i3;
            this.f224880q = map;
            this.f224881r = bundle;
            this.f224882s = weakReference2;
            int i4 = i;
            C53155r0 r0Var2 = r0Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0085, code lost:
            r0 = android.util.Base64.decode(r12.f224873g, 2);
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo1118a(android.view.View r13) {
            /*
                r12 = this;
                r0 = 4
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = r12.f224871e
                r2 = 0
                r0[r2] = r1
                java.lang.String r1 = r12.f224872f
                r2 = 1
                r0[r2] = r1
                java.lang.String r1 = r12.f224873g
                r2 = 2
                r0[r2] = r1
                java.lang.String r1 = r12.f224874h
                r3 = 3
                r0[r3] = r1
                java.lang.String r1 = "MicroMsg.WxaSysTemplateMsgHandler"
                java.lang.String r3 = "On Span clicked(title : %s, username : %s, path : %s, talker : %s)"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r0)
                java.lang.ref.WeakReference r0 = r12.f224875i
                java.lang.Object r0 = r0.get()
                android.content.Context r0 = (android.content.Context) r0
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                int r1 = r12.f224876j
                java.lang.String r3 = "stat_scene"
                r0.putInt(r3, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "msg_"
                r1.append(r3)
                long r3 = r12.f224877n
                java.lang.String r3 = java.lang.Long.toString(r3)
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                java.lang.String r3 = "stat_msg_id"
                r0.putString(r3, r1)
                java.lang.String r1 = r12.f224874h
                java.lang.String r3 = "stat_chat_talker_username"
                r0.putString(r3, r1)
                java.lang.String r1 = r12.f224878o
                java.lang.String r3 = "stat_send_msg_user"
                r0.putString(r3, r1)
                com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r11 = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject
                r11.<init>()
                r1 = 1088(0x440, float:1.525E-42)
                r11.f245533f = r1
                java.lang.String r3 = ""
                r11.f245534g = r3
                int r1 = com.tencent.p014mm.plugin.appbrand.report.C68633w.m80874a(r1, r0)
                r11.f245531d = r1
                int r1 = r11.f245533f
                java.lang.String r0 = com.tencent.p014mm.plugin.appbrand.report.C68633w.m80875b(r1, r0)
                r11.f245532e = r0
                java.lang.String r0 = r12.f224873g
                if (r0 == 0) goto L_0x0094
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x0094
                java.lang.String r0 = r12.f224873g
                byte[] r0 = android.util.Base64.decode(r0, r2)
                if (r0 == 0) goto L_0x0094
                java.lang.String r1 = new java.lang.String
                r1.<init>(r0)
                r10 = r1
                goto L_0x0095
            L_0x0094:
                r10 = r3
            L_0x0095:
                java.lang.Class<kr0.x0> r0 = kr0.C76630x0.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                r4 = r0
                kr0.x0 r4 = (kr0.C76630x0) r4
                android.content.Context r5 = r13.getContext()
                java.lang.String r6 = r12.f224872f
                r7 = 0
                int r8 = r12.f224879p
                r9 = 0
                r4.Ko0(r5, r6, r7, r8, r9, r10, r11)
                java.lang.Class<d62.k> r13 = d62.C7241k.class
                di3.d r13 = di3.C86312j.m106911c(r13)
                r0 = r13
                d62.k r0 = (d62.C7241k) r0
                java.util.Map r2 = r12.f224880q
                android.os.Bundle r3 = r12.f224881r
                java.lang.ref.WeakReference r4 = r12.f224875i
                java.lang.ref.WeakReference r5 = r12.f224882s
                java.lang.String r1 = "link_view_wxapp"
                r0.h80(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: np0.C76951u.C76952a.mo1118a(android.view.View):void");
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0163: MOVE  (r0v14 int) = (r28v0 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* renamed from: G4 */
    public java.lang.CharSequence mo8417G4(java.util.Map<java.lang.String, java.lang.String> r31, java.lang.String r32, android.os.Bundle r33, java.lang.ref.WeakReference<android.content.Context> r34, java.lang.ref.WeakReference<com.tencent.neattextview.textview.view.NeatTextView> r35) {
        /*
            r30 = this;
            r14 = r31
            r0 = r32
            r15 = r33
            boolean r1 = f40.C86709a0.m107522a()
            r2 = 0
            if (r1 != 0) goto L_0x000e
            return r2
        L_0x000e:
            java.lang.String r13 = "MicroMsg.WxaSysTemplateMsgHandler"
            if (r14 == 0) goto L_0x01a3
            boolean r1 = r31.isEmpty()
            if (r1 == 0) goto L_0x001a
            goto L_0x01a3
        L_0x001a:
            java.lang.Object r1 = r34.get()
            r17 = r1
            android.content.Context r17 = (android.content.Context) r17
            if (r17 != 0) goto L_0x002a
            java.lang.String r0 = "context is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r0)
            return r2
        L_0x002a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r3 = ".title"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r14.get(r1)
            r12 = r1
            java.lang.String r12 = (java.lang.String) r12
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r3 = ".username"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r14.get(r1)
            r18 = r1
            java.lang.String r18 = (java.lang.String) r18
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r3 = ".type"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r14.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r10 = 0
            int r16 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r10)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r3 = ".wxaapp_type"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r14.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r11 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r10)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r3 = ".path"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r14.get(r1)
            r19 = r1
            java.lang.String r19 = (java.lang.String) r19
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ".forbids"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.Object r0 = r14.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r10)
            r9 = 1
            if (r0 != r9) goto L_0x00cc
            r20 = 1
            goto L_0x00ce
        L_0x00cc:
            r20 = 0
        L_0x00ce:
            java.lang.String r0 = ""
            if (r15 == 0) goto L_0x00db
            java.lang.String r1 = "conv_talker_username"
            java.lang.String r1 = r15.getString(r1)
            r21 = r1
            goto L_0x00dd
        L_0x00db:
            r21 = r0
        L_0x00dd:
            if (r15 == 0) goto L_0x00e8
            java.lang.String r1 = "scene"
            int r1 = r15.getInt(r1)
            r22 = r1
            goto L_0x00ea
        L_0x00e8:
            r22 = 0
        L_0x00ea:
            if (r15 == 0) goto L_0x00f3
            java.lang.String r1 = "msg_sever_id"
            long r3 = r15.getLong(r1)
            goto L_0x00f5
        L_0x00f3:
            r3 = 0
        L_0x00f5:
            r23 = r3
            if (r15 == 0) goto L_0x0100
            java.lang.String r0 = "send_msg_username"
            java.lang.String r0 = r15.getString(r0)
        L_0x0100:
            r25 = r0
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r0 == 0) goto L_0x010e
            java.lang.String r0 = "link title is null or nil"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r0)
            return r2
        L_0x010e:
            android.text.SpannableString r8 = new android.text.SpannableString
            r8.<init>(r12)
            np0.u$a r7 = new np0.u$a
            r0 = r7
            r2 = 1
            r3 = 0
            r1 = r30
            r4 = r12
            r5 = r18
            r6 = r19
            r26 = r7
            r7 = r21
            r27 = r8
            r8 = r34
            r9 = r22
            r28 = r11
            r10 = r23
            r22 = r12
            r12 = r25
            r29 = r13
            r13 = r16
            r14 = r31
            r15 = r33
            r16 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16)
            int r0 = r22.length()
            r1 = 17
            r3 = r26
            r2 = r27
            r4 = 0
            r2.setSpan(r3, r4, r0, r1)
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r4] = r22
            r1 = 1
            r0[r1] = r18
            r3 = 2
            r0[r3] = r19
            r5 = 3
            r0[r5] = r21
            java.lang.String r5 = "handleTemplate(title : %s, username : %s, path : %s, talker : %s)"
            r6 = r29
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r5, r0)
            if (r20 != 0) goto L_0x01a2
            r0 = r28
            if (r0 != r3) goto L_0x0168
            goto L_0x01a2
        L_0x0168:
            r5 = 2131757004(0x7f1007cc, float:1.9144932E38)
            if (r0 == r1) goto L_0x016e
            goto L_0x0171
        L_0x016e:
            r5 = 2131757006(0x7f1007ce, float:1.9144936E38)
        L_0x0171:
            android.content.res.Resources r0 = r17.getResources()
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r5)
            r5 = 16
            int r6 = js0.C76448t.m91870a(r5)
            int r5 = js0.C76448t.m91870a(r5)
            r0.setBounds(r4, r4, r6, r5)
            au0.b r5 = new au0.b
            r5.<init>(r0, r1)
            android.text.SpannableString r0 = new android.text.SpannableString
            java.lang.String r6 = "@ "
            r0.<init>(r6)
            r6 = 33
            r0.setSpan(r5, r4, r1, r6)
            java.lang.CharSequence[] r3 = new java.lang.CharSequence[r3]
            r3[r4] = r0
            r3[r1] = r2
            java.lang.CharSequence r0 = android.text.TextUtils.concat(r3)
            return r0
        L_0x01a2:
            return r2
        L_0x01a3:
            r6 = r13
            java.lang.String r0 = "values map is null or nil"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: np0.C76951u.mo8417G4(java.util.Map, java.lang.String, android.os.Bundle, java.lang.ref.WeakReference, java.lang.ref.WeakReference):java.lang.CharSequence");
    }
}
