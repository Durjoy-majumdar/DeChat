package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import as3.C103900s0;
import com.tencent.p014mm.plugin.multitalk.model.MultiTalkManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p1102pb.talkroom.sdk.MultiTalkGroup;
import com.tencent.p1102pb.talkroom.sdk.MultiTalkGroupMember;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import te3.C64407gz;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.d */
public class C105608d {

    /* renamed from: a */
    public MultiTalkManager f314075a = null;

    /* renamed from: b */
    public Map<String, Long> f314076b = new ConcurrentHashMap();

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.d$a */
    public class C105609a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ List f314077d;

        public C105609a(List list) {
            this.f314077d = list;
        }

        public void run() {
            if (C105608d.this.f314075a != null) {
                Log.m105925i("MicroMsg.Multitalk.ILink2MtCallBack", "onVideoGroupMemberChange:%s", this.f314077d);
                C105608d.this.f314075a.mo150635L(this.f314077d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.d$b */
    public class C105610b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f314079d;

        /* renamed from: e */
        public final /* synthetic */ String f314080e;

        /* renamed from: f */
        public final /* synthetic */ byte[] f314081f;

        public C105610b(int i, String str, byte[] bArr) {
            this.f314079d = i;
            this.f314080e = str;
            this.f314081f = bArr;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: as3.b0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: java.lang.String} */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
            r0 = -100;
            r1 = r1;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                com.tencent.mm.plugin.multitalk.ilinkservice.d r0 = com.tencent.p014mm.plugin.multitalk.ilinkservice.C105608d.this
                com.tencent.mm.plugin.multitalk.model.MultiTalkManager r0 = r0.f314075a
                if (r0 == 0) goto L_0x0073
                int r0 = r5.f314079d
                java.lang.String r1 = r5.f314080e
                r2 = 2
                if (r0 == r2) goto L_0x0051
                r3 = 3
                if (r0 == r3) goto L_0x004e
                r3 = 4
                if (r0 == r3) goto L_0x004b
                r4 = 5
                if (r0 == r4) goto L_0x0048
                r4 = 15
                if (r0 == r4) goto L_0x0045
                r4 = 16
                if (r0 == r4) goto L_0x0042
                switch(r0) {
                    case 8: goto L_0x003f;
                    case 9: goto L_0x003c;
                    case 10: goto L_0x0039;
                    case 11: goto L_0x0022;
                    default: goto L_0x0021;
                }
            L_0x0021:
                goto L_0x0053
            L_0x0022:
                r0 = -1300(0xfffffffffffffaec, float:NaN)
                byte[] r4 = r5.f314081f
                if (r4 == 0) goto L_0x0053
                int r4 = r4.length
                if (r4 != r3) goto L_0x0053
                as3.b0 r1 = new as3.b0
                r1.<init>()
                byte[] r3 = r5.f314081f
                int r3 = com.tencent.p014mm.sdk.platformtools.Util.byteArrayToInt(r3)
                r1.f306872p = r3
                goto L_0x0053
            L_0x0039:
                r0 = -1100(0xfffffffffffffbb4, float:NaN)
                goto L_0x0053
            L_0x003c:
                r0 = -1000(0xfffffffffffffc18, float:NaN)
                goto L_0x0053
            L_0x003f:
                r0 = -600(0xfffffffffffffda8, float:NaN)
                goto L_0x0053
            L_0x0042:
                r0 = -100
                goto L_0x0053
            L_0x0045:
                r0 = -301(0xfffffffffffffed3, float:NaN)
                goto L_0x0053
            L_0x0048:
                r0 = -300(0xfffffffffffffed4, float:NaN)
                goto L_0x0053
            L_0x004b:
                r0 = -500(0xfffffffffffffe0c, float:NaN)
                goto L_0x0053
            L_0x004e:
                r0 = -400(0xfffffffffffffe70, float:NaN)
                goto L_0x0053
            L_0x0051:
                r0 = -200(0xffffffffffffff38, float:NaN)
            L_0x0053:
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
                r2[r3] = r4
                r3 = 1
                int r4 = r5.f314079d
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r2[r3] = r4
                java.lang.String r3 = "MicroMsg.Multitalk.ILink2MtCallBack"
                java.lang.String r4 = "onErr errorcode:%d, errType:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r2)
                com.tencent.mm.plugin.multitalk.ilinkservice.d r2 = com.tencent.p014mm.plugin.multitalk.ilinkservice.C105608d.this
                com.tencent.mm.plugin.multitalk.model.MultiTalkManager r2 = r2.f314075a
                r2.mo150631H(r0, r1)
            L_0x0073:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.ilinkservice.C105608d.C105610b.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.d$c */
    public class C105611c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C105689s f314083d;

        public C105611c(C105689s sVar) {
            this.f314083d = sVar;
        }

        public void run() {
            if (C105608d.this.f314075a != null) {
                Log.m105924i("MicroMsg.Multitalk.ILink2MtCallBack", "onEnterMultiTalk");
                C105608d.this.f314075a.mo150630G(C105608d.this.mo150488a(this.f314083d));
            }
        }
    }

    public C105608d(MultiTalkManager multiTalkManager) {
        this.f314075a = multiTalkManager;
    }

    /* renamed from: a */
    public final MultiTalkGroup mo150488a(C105689s sVar) {
        MultiTalkGroup multiTalkGroup = new MultiTalkGroup();
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append(str);
        sb.append(sVar.f314254b);
        multiTalkGroup.f320043e = sb.toString();
        String str2 = sVar.f314256d;
        multiTalkGroup.f320044f = str2;
        String str3 = sVar.f314258f;
        if (str3 != null) {
            str = str3;
        }
        multiTalkGroup.f320046h = str;
        multiTalkGroup.f320042d = str2;
        ArrayList<C105683r> arrayList = sVar.f314257e;
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<C105683r> it = arrayList.iterator();
            while (it.hasNext()) {
                C105683r next = it.next();
                MultiTalkGroupMember multiTalkGroupMember = new MultiTalkGroupMember();
                multiTalkGroupMember.f320048d = next.f314239c;
                multiTalkGroupMember.f320049e = next.f314240d;
                multiTalkGroupMember.f320051g = 0;
                multiTalkGroupMember.f320050f = 20;
                int i = next.f314241e;
                if (i == 1) {
                    multiTalkGroupMember.f320050f = 10;
                }
                if (i == 2 || i == 3) {
                    multiTalkGroupMember.f320050f = 1;
                }
                multiTalkGroupMember.f320052h = (int) 0;
                multiTalkGroup.f320047i.add(multiTalkGroupMember);
            }
        }
        return multiTalkGroup;
    }

    /* renamed from: b */
    public void mo150489b(C105689s sVar) {
        MMHandlerThread.postToMainThread(new C105611c(sVar));
    }

    /* renamed from: c */
    public void mo150490c(int i, String str, byte[] bArr) {
        MMHandlerThread.postToMainThread(new C105610b(i, str, bArr));
    }

    /* JADX WARNING: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c3 A[Catch:{ Exception -> 0x036f }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0109 A[Catch:{ Exception -> 0x036f }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0132 A[Catch:{ Exception -> 0x036f }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0133 A[Catch:{ Exception -> 0x036f }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x018d A[Catch:{ Exception -> 0x036f }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0282 A[Catch:{ Exception -> 0x036f }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo150491d(te3.gs4 r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = 3
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = r0.f331980d
            r5 = 0
            r3[r5] = r4
            int r4 = r0.f331985i
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6 = 1
            r3[r6] = r4
            long r7 = r0.f331984h
            java.lang.Long r4 = java.lang.Long.valueOf(r7)
            r7 = 2
            r3[r7] = r4
            java.lang.String r4 = "MicroMsg.Multitalk.ILink2MtCallBack"
            java.lang.String r8 = "onMultiTalkBannerChange:%s, status:%d, banner seq:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r8, r3)
            java.lang.String r3 = r0.f331980d
            boolean r8 = android.text.TextUtils.isEmpty(r3)
            if (r8 == 0) goto L_0x002e
            return
        L_0x002e:
            f40.o r8 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x036f }
            com.tencent.mm.storage.v1 r8 = r8.mo121142i()     // Catch:{ Exception -> 0x036f }
            r9 = 0
            java.lang.Object r8 = r8.mo119684e(r7, r9)     // Catch:{ Exception -> 0x036f }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x036f }
            if (r8 != 0) goto L_0x0045
            java.lang.String r0 = "userName is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)     // Catch:{ Exception -> 0x036f }
            return
        L_0x0045:
            java.lang.String r9 = r0.f331986j     // Catch:{ Exception -> 0x036f }
            s82.a r10 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.yx0()     // Catch:{ Exception -> 0x036f }
            dd0.f r10 = r10.mo107807jo(r3)     // Catch:{ Exception -> 0x036f }
            if (r10 == 0) goto L_0x0053
            r11 = 1
            goto L_0x0054
        L_0x0053:
            r11 = 0
        L_0x0054:
            int r12 = r0.f331985i     // Catch:{ Exception -> 0x036f }
            if (r12 == 0) goto L_0x0083
            if (r10 == 0) goto L_0x0083
            long r13 = r10.field_ilinkRoomId     // Catch:{ Exception -> 0x036f }
            r15 = 0
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 == 0) goto L_0x0083
            r16 = r8
            long r7 = r0.f331981e     // Catch:{ Exception -> 0x036f }
            int r17 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r17 == 0) goto L_0x0085
            java.lang.String r0 = "Ignore a banner msg that roomid not mathced wxgroupid %s roomid %d cached roomid %d"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x036f }
            r2[r5] = r3     // Catch:{ Exception -> 0x036f }
            java.lang.Long r3 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x036f }
            r2[r6] = r3     // Catch:{ Exception -> 0x036f }
            long r5 = r10.field_ilinkRoomId     // Catch:{ Exception -> 0x036f }
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x036f }
            r5 = 2
            r2[r5] = r3     // Catch:{ Exception -> 0x036f }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r0, r2)     // Catch:{ Exception -> 0x036f }
            return
        L_0x0083:
            r16 = r8
        L_0x0085:
            r7 = 2
            if (r12 != r7) goto L_0x00a5
            if (r11 != 0) goto L_0x00a5
            java.lang.String r7 = "Ignore a banner msg change without banner wxgroupid %s roomid %d seq %d"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x036f }
            r2[r5] = r3     // Catch:{ Exception -> 0x036f }
            long r8 = r0.f331981e     // Catch:{ Exception -> 0x036f }
            java.lang.Long r3 = java.lang.Long.valueOf(r8)     // Catch:{ Exception -> 0x036f }
            r2[r6] = r3     // Catch:{ Exception -> 0x036f }
            long r5 = r0.f331984h     // Catch:{ Exception -> 0x036f }
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x036f }
            r3 = 2
            r2[r3] = r0     // Catch:{ Exception -> 0x036f }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r7, r2)     // Catch:{ Exception -> 0x036f }
            return
        L_0x00a5:
            java.util.Map<java.lang.String, java.lang.Long> r7 = r1.f314076b     // Catch:{ Exception -> 0x036f }
            java.util.concurrent.ConcurrentHashMap r7 = (java.util.concurrent.ConcurrentHashMap) r7     // Catch:{ Exception -> 0x036f }
            boolean r7 = r7.containsKey(r3)     // Catch:{ Exception -> 0x036f }
            if (r7 == 0) goto L_0x0109
            long r7 = r0.f331984h     // Catch:{ Exception -> 0x036f }
            java.util.Map<java.lang.String, java.lang.Long> r10 = r1.f314076b     // Catch:{ Exception -> 0x036f }
            java.util.concurrent.ConcurrentHashMap r10 = (java.util.concurrent.ConcurrentHashMap) r10     // Catch:{ Exception -> 0x036f }
            java.lang.Object r10 = r10.get(r3)     // Catch:{ Exception -> 0x036f }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ Exception -> 0x036f }
            long r12 = r10.longValue()     // Catch:{ Exception -> 0x036f }
            int r10 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r10 >= 0) goto L_0x0109
            int r7 = r0.f331985i     // Catch:{ Exception -> 0x036f }
            r8 = 2
            if (r7 != r8) goto L_0x00ee
            java.lang.String r7 = "Ignore a banner msg that expired wxgroupid %s roomid %d seq %d cached seq %d"
            r8 = 4
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x036f }
            r8[r5] = r3     // Catch:{ Exception -> 0x036f }
            long r9 = r0.f331981e     // Catch:{ Exception -> 0x036f }
            java.lang.Long r5 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x036f }
            r8[r6] = r5     // Catch:{ Exception -> 0x036f }
            long r5 = r0.f331984h     // Catch:{ Exception -> 0x036f }
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x036f }
            r5 = 2
            r8[r5] = r0     // Catch:{ Exception -> 0x036f }
            java.util.Map<java.lang.String, java.lang.Long> r0 = r1.f314076b     // Catch:{ Exception -> 0x036f }
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch:{ Exception -> 0x036f }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ Exception -> 0x036f }
            r8[r2] = r0     // Catch:{ Exception -> 0x036f }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r7, r8)     // Catch:{ Exception -> 0x036f }
            return
        L_0x00ee:
            if (r7 != r6) goto L_0x0116
            java.util.Map<java.lang.String, java.lang.Long> r2 = r1.f314076b     // Catch:{ Exception -> 0x036f }
            if (r2 == 0) goto L_0x0116
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2     // Catch:{ Exception -> 0x036f }
            int r2 = r2.size()     // Catch:{ Exception -> 0x036f }
            if (r2 <= 0) goto L_0x0116
            java.util.Map<java.lang.String, java.lang.Long> r2 = r1.f314076b     // Catch:{ Exception -> 0x036f }
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2     // Catch:{ Exception -> 0x036f }
            r2.remove(r3)     // Catch:{ Exception -> 0x036f }
            java.lang.String r2 = "remove bannerMsgTimeMap success at begin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)     // Catch:{ Exception -> 0x036f }
            goto L_0x0116
        L_0x0109:
            java.util.Map<java.lang.String, java.lang.Long> r2 = r1.f314076b     // Catch:{ Exception -> 0x036f }
            long r7 = r0.f331984h     // Catch:{ Exception -> 0x036f }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x036f }
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2     // Catch:{ Exception -> 0x036f }
            r2.put(r3, r7)     // Catch:{ Exception -> 0x036f }
        L_0x0116:
            int r2 = r0.f331985i     // Catch:{ Exception -> 0x036f }
            if (r2 == 0) goto L_0x0123
            java.util.LinkedList<te3.ft4> r2 = r0.f331983g     // Catch:{ Exception -> 0x036f }
            int r2 = r2.size()     // Catch:{ Exception -> 0x036f }
            r7 = 2
            if (r2 >= r7) goto L_0x019b
        L_0x0123:
            if (r11 != r6) goto L_0x019b
            java.lang.String r0 = "get WxVoiceBannerEnd,dismiss bar!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)     // Catch:{ Exception -> 0x036f }
            com.tencent.mm.plugin.multitalk.model.e0 r0 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.Bx0()     // Catch:{ Exception -> 0x036f }
            java.util.LinkedList<java.lang.String> r0 = r0.f314601g     // Catch:{ Exception -> 0x036f }
            if (r0 != 0) goto L_0x0133
            goto L_0x0137
        L_0x0133:
            boolean r5 = r0.contains(r3)     // Catch:{ Exception -> 0x036f }
        L_0x0137:
            if (r5 != 0) goto L_0x015a
            com.tencent.mm.plugin.multitalk.model.e0 r0 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.Bx0()     // Catch:{ Exception -> 0x036f }
            java.util.LinkedList r0 = r0.xx0()     // Catch:{ Exception -> 0x036f }
            boolean r0 = r0.contains(r3)     // Catch:{ Exception -> 0x036f }
            if (r0 == 0) goto L_0x015a
            com.tencent.mm.plugin.multitalk.model.e0 r0 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.Bx0()     // Catch:{ Exception -> 0x036f }
            r8 = r16
            boolean r0 = r0.Bu0(r3, r8)     // Catch:{ Exception -> 0x036f }
            if (r0 == 0) goto L_0x015a
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r0 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()     // Catch:{ Exception -> 0x036f }
            r0.mo150666i(r3)     // Catch:{ Exception -> 0x036f }
        L_0x015a:
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r0 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()     // Catch:{ Exception -> 0x036f }
            r0.mo150668k(r3)     // Catch:{ Exception -> 0x036f }
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r0 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()     // Catch:{ Exception -> 0x036f }
            r0.mo150637N(r3)     // Catch:{ Exception -> 0x036f }
            com.tencent.mm.plugin.multitalk.model.e0 r0 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.Bx0()     // Catch:{ Exception -> 0x036f }
            r0.mo96147oW(r3)     // Catch:{ Exception -> 0x036f }
            com.tencent.mm.plugin.multitalk.model.e0 r0 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.Bx0()     // Catch:{ Exception -> 0x036f }
            r0.yx0(r3)     // Catch:{ Exception -> 0x036f }
            com.tencent.mm.plugin.multitalk.model.e0 r0 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.Bx0()     // Catch:{ Exception -> 0x036f }
            java.util.LinkedList r0 = r0.xx0()     // Catch:{ Exception -> 0x036f }
            r0.remove(r3)     // Catch:{ Exception -> 0x036f }
            java.util.Map<java.lang.String, java.lang.Long> r0 = r1.f314076b     // Catch:{ Exception -> 0x036f }
            if (r0 == 0) goto L_0x0388
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch:{ Exception -> 0x036f }
            int r0 = r0.size()     // Catch:{ Exception -> 0x036f }
            if (r0 <= 0) goto L_0x0388
            java.util.Map<java.lang.String, java.lang.Long> r0 = r1.f314076b     // Catch:{ Exception -> 0x036f }
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch:{ Exception -> 0x036f }
            r0.remove(r3)     // Catch:{ Exception -> 0x036f }
            java.lang.String r0 = "remove bannerMsgTimeMap success at end"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)     // Catch:{ Exception -> 0x036f }
            goto L_0x0388
        L_0x019b:
            r8 = r16
            int r2 = r0.f331985i     // Catch:{ Exception -> 0x036f }
            java.lang.String r7 = ","
            java.lang.String r10 = "Somebody invite me! username[%s]"
            java.lang.String r12 = "memberUserNames :"
            java.lang.String r13 = ""
            if (r2 != r6) goto L_0x0282
            java.lang.String r2 = "The count of banner member is %d, groupid[%s]"
            r14 = 2
            java.lang.Object[] r14 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x036f }
            java.util.LinkedList<te3.ft4> r15 = r0.f331983g     // Catch:{ Exception -> 0x036f }
            int r15 = r15.size()     // Catch:{ Exception -> 0x036f }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ Exception -> 0x036f }
            r14[r5] = r15     // Catch:{ Exception -> 0x036f }
            r14[r6] = r3     // Catch:{ Exception -> 0x036f }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r14)     // Catch:{ Exception -> 0x036f }
            java.util.LinkedList<te3.ft4> r2 = r0.f331983g     // Catch:{ Exception -> 0x036f }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x036f }
            r14 = r13
            r15 = 0
        L_0x01c7:
            boolean r16 = r2.hasNext()     // Catch:{ Exception -> 0x036f }
            if (r16 == 0) goto L_0x0203
            java.lang.Object r16 = r2.next()     // Catch:{ Exception -> 0x036f }
            r5 = r16
            te3.ft4 r5 = (te3.ft4) r5     // Catch:{ Exception -> 0x036f }
            te3.et4 r6 = r5.f133679d     // Catch:{ Exception -> 0x036f }
            java.lang.String r6 = r6.f133116d     // Catch:{ Exception -> 0x036f }
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x036f }
            if (r6 != 0) goto L_0x01f6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x036f }
            r6.<init>()     // Catch:{ Exception -> 0x036f }
            r6.append(r14)     // Catch:{ Exception -> 0x036f }
            te3.et4 r5 = r5.f133679d     // Catch:{ Exception -> 0x036f }
            java.lang.String r5 = r5.f133116d     // Catch:{ Exception -> 0x036f }
            r6.append(r5)     // Catch:{ Exception -> 0x036f }
            r6.append(r7)     // Catch:{ Exception -> 0x036f }
            java.lang.String r14 = r6.toString()     // Catch:{ Exception -> 0x036f }
            goto L_0x0200
        L_0x01f6:
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x036f }
            r5 = 0
            r6[r5] = r13     // Catch:{ Exception -> 0x036f }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r10, r6)     // Catch:{ Exception -> 0x036f }
            r15 = 1
        L_0x0200:
            r5 = 0
            r6 = 1
            goto L_0x01c7
        L_0x0203:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x036f }
            r2.<init>()     // Catch:{ Exception -> 0x036f }
            r2.append(r12)     // Catch:{ Exception -> 0x036f }
            r2.append(r14)     // Catch:{ Exception -> 0x036f }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x036f }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)     // Catch:{ Exception -> 0x036f }
            if (r15 != 0) goto L_0x022a
            com.tencent.mm.plugin.multitalk.model.e0 r2 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.Bx0()     // Catch:{ Exception -> 0x036f }
            r2.yx0(r3)     // Catch:{ Exception -> 0x036f }
            com.tencent.mm.plugin.multitalk.model.e0 r2 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.Bx0()     // Catch:{ Exception -> 0x036f }
            java.util.LinkedList r2 = r2.xx0()     // Catch:{ Exception -> 0x036f }
            r2.remove(r3)     // Catch:{ Exception -> 0x036f }
            goto L_0x0235
        L_0x022a:
            com.tencent.mm.plugin.multitalk.model.e0 r2 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.Bx0()     // Catch:{ Exception -> 0x036f }
            java.util.LinkedList r2 = r2.xx0()     // Catch:{ Exception -> 0x036f }
            r2.contains(r3)     // Catch:{ Exception -> 0x036f }
        L_0x0235:
            if (r11 != 0) goto L_0x0259
            boolean r2 = r8.equals(r9)     // Catch:{ Exception -> 0x036f }
            if (r2 == 0) goto L_0x0246
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r2 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()     // Catch:{ Exception -> 0x036f }
            r5 = 0
            r2.mo150669l(r3, r9, r5, r5)     // Catch:{ Exception -> 0x036f }
            goto L_0x0259
        L_0x0246:
            r5 = 0
            if (r15 == 0) goto L_0x0251
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r2 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()     // Catch:{ Exception -> 0x036f }
            r2.mo150669l(r3, r9, r5, r5)     // Catch:{ Exception -> 0x036f }
            goto L_0x0259
        L_0x0251:
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r2 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()     // Catch:{ Exception -> 0x036f }
            r6 = 1
            r2.mo150669l(r3, r9, r6, r5)     // Catch:{ Exception -> 0x036f }
        L_0x0259:
            com.tencent.mm.plugin.multitalk.model.e0 r2 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.Bx0()     // Catch:{ Exception -> 0x036f }
            r2.Dx0(r3, r0)     // Catch:{ Exception -> 0x036f }
            com.tencent.mm.plugin.multitalk.model.w r0 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.xx0()     // Catch:{ Exception -> 0x036f }
            ds3.d r0 = r0.f314798d     // Catch:{ Exception -> 0x036f }
            f40.o r2 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x036f }
            com.tencent.mm.storage.u1 r2 = r2.f251803a     // Catch:{ Exception -> 0x036f }
            r3 = 1
            java.lang.Object r2 = r2.mo119660a(r3)     // Catch:{ Exception -> 0x036f }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Exception -> 0x036f }
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Integer) r2)     // Catch:{ Exception -> 0x036f }
            java.lang.String r3 = eb0.C75592q0.m90789s()     // Catch:{ Exception -> 0x036f }
            nw3.e r0 = (nw3.C109779e) r0     // Catch:{ Exception -> 0x036f }
            r0.mo161040k(r2, r3)     // Catch:{ Exception -> 0x036f }
            goto L_0x0388
        L_0x0282:
            r5 = 2
            if (r2 != r5) goto L_0x0388
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x036f }
            r2.<init>()     // Catch:{ Exception -> 0x036f }
            java.lang.String r5 = "WxVoiceBannerMemChange!2,member size : "
            r2.append(r5)     // Catch:{ Exception -> 0x036f }
            java.util.LinkedList<te3.ft4> r5 = r0.f331983g     // Catch:{ Exception -> 0x036f }
            int r5 = r5.size()     // Catch:{ Exception -> 0x036f }
            r2.append(r5)     // Catch:{ Exception -> 0x036f }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x036f }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)     // Catch:{ Exception -> 0x036f }
            java.util.LinkedList<te3.ft4> r2 = r0.f331983g     // Catch:{ Exception -> 0x036f }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x036f }
            r6 = r13
            r5 = 0
        L_0x02a7:
            boolean r9 = r2.hasNext()     // Catch:{ Exception -> 0x036f }
            if (r9 == 0) goto L_0x02e0
            java.lang.Object r9 = r2.next()     // Catch:{ Exception -> 0x036f }
            te3.ft4 r9 = (te3.ft4) r9     // Catch:{ Exception -> 0x036f }
            te3.et4 r11 = r9.f133679d     // Catch:{ Exception -> 0x036f }
            java.lang.String r11 = r11.f133116d     // Catch:{ Exception -> 0x036f }
            boolean r11 = r11.equals(r8)     // Catch:{ Exception -> 0x036f }
            if (r11 != 0) goto L_0x02d5
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x036f }
            r11.<init>()     // Catch:{ Exception -> 0x036f }
            r11.append(r6)     // Catch:{ Exception -> 0x036f }
            te3.et4 r6 = r9.f133679d     // Catch:{ Exception -> 0x036f }
            java.lang.String r6 = r6.f133116d     // Catch:{ Exception -> 0x036f }
            r11.append(r6)     // Catch:{ Exception -> 0x036f }
            r11.append(r7)     // Catch:{ Exception -> 0x036f }
            java.lang.String r6 = r11.toString()     // Catch:{ Exception -> 0x036f }
            r11 = 0
            goto L_0x02a7
        L_0x02d5:
            r5 = 1
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x036f }
            r11 = 0
            r9[r11] = r13     // Catch:{ Exception -> 0x036f }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r10, r9)     // Catch:{ Exception -> 0x036f }
            r5 = 1
            goto L_0x02a7
        L_0x02e0:
            r11 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x036f }
            r2.<init>()     // Catch:{ Exception -> 0x036f }
            r2.append(r12)     // Catch:{ Exception -> 0x036f }
            r2.append(r6)     // Catch:{ Exception -> 0x036f }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x036f }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)     // Catch:{ Exception -> 0x036f }
            if (r5 != 0) goto L_0x0337
            com.tencent.mm.plugin.multitalk.model.e0 r2 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.Bx0()     // Catch:{ Exception -> 0x036f }
            java.util.LinkedList<java.lang.String> r2 = r2.f314601g     // Catch:{ Exception -> 0x036f }
            if (r2 != 0) goto L_0x02ff
            r5 = 0
            goto L_0x0303
        L_0x02ff:
            boolean r5 = r2.contains(r3)     // Catch:{ Exception -> 0x036f }
        L_0x0303:
            if (r5 != 0) goto L_0x0324
            com.tencent.mm.plugin.multitalk.model.e0 r2 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.Bx0()     // Catch:{ Exception -> 0x036f }
            java.util.LinkedList r2 = r2.xx0()     // Catch:{ Exception -> 0x036f }
            boolean r2 = r2.contains(r3)     // Catch:{ Exception -> 0x036f }
            if (r2 == 0) goto L_0x0324
            com.tencent.mm.plugin.multitalk.model.e0 r2 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.Bx0()     // Catch:{ Exception -> 0x036f }
            boolean r2 = r2.Bu0(r3, r8)     // Catch:{ Exception -> 0x036f }
            if (r2 == 0) goto L_0x0324
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r2 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()     // Catch:{ Exception -> 0x036f }
            r2.mo150666i(r3)     // Catch:{ Exception -> 0x036f }
        L_0x0324:
            com.tencent.mm.plugin.multitalk.model.e0 r2 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.Bx0()     // Catch:{ Exception -> 0x036f }
            r2.yx0(r3)     // Catch:{ Exception -> 0x036f }
            com.tencent.mm.plugin.multitalk.model.e0 r2 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.Bx0()     // Catch:{ Exception -> 0x036f }
            java.util.LinkedList r2 = r2.xx0()     // Catch:{ Exception -> 0x036f }
            r2.remove(r3)     // Catch:{ Exception -> 0x036f }
            goto L_0x0342
        L_0x0337:
            com.tencent.mm.plugin.multitalk.model.e0 r2 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.Bx0()     // Catch:{ Exception -> 0x036f }
            java.util.LinkedList r2 = r2.xx0()     // Catch:{ Exception -> 0x036f }
            r2.contains(r3)     // Catch:{ Exception -> 0x036f }
        L_0x0342:
            com.tencent.mm.plugin.multitalk.model.w r2 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.xx0()     // Catch:{ Exception -> 0x036f }
            ds3.d r2 = r2.f314798d     // Catch:{ Exception -> 0x036f }
            f40.o r5 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x036f }
            com.tencent.mm.storage.u1 r5 = r5.f251803a     // Catch:{ Exception -> 0x036f }
            r6 = 1
            java.lang.Object r5 = r5.mo119660a(r6)     // Catch:{ Exception -> 0x036f }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ Exception -> 0x036f }
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Integer) r5)     // Catch:{ Exception -> 0x036f }
            java.lang.String r6 = eb0.C75592q0.m90789s()     // Catch:{ Exception -> 0x036f }
            nw3.e r2 = (nw3.C109779e) r2     // Catch:{ Exception -> 0x036f }
            r2.mo161040k(r5, r6)     // Catch:{ Exception -> 0x036f }
            java.lang.String r2 = "WxVoiceBannerMemChange setWxUinAndUsrName:"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)     // Catch:{ Exception -> 0x036f }
            com.tencent.mm.plugin.multitalk.model.e0 r2 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.Bx0()     // Catch:{ Exception -> 0x036f }
            r2.Fx0(r3, r0)     // Catch:{ Exception -> 0x036f }
            goto L_0x0388
        L_0x036f:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "parse  bannerinfo  failure! xml"
            r2.append(r3)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
        L_0x0388:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.ilinkservice.C105608d.mo150491d(te3.gs4):void");
    }

    /* renamed from: e */
    public void mo150492e(C105689s sVar, LinkedList<C64407gz> linkedList) {
        if (this.f314075a != null) {
            ArrayList arrayList = new ArrayList();
            if (linkedList != null && linkedList.size() > 0) {
                Iterator<C64407gz> it = linkedList.iterator();
                while (it.hasNext()) {
                    C64407gz next = it.next();
                    String c = sVar.mo150551c(next.f183378d);
                    if (c == null) {
                        Log.m105925i("MicroMsg.Multitalk.ILink2MtCallBack", "onVideoGroupMemberChange: mid:%d NOT exist!!!", Integer.valueOf(next.f183378d));
                    } else {
                        C103900s0 s0Var = new C103900s0();
                        int i = next.f183378d;
                        s0Var.f307155b = i;
                        s0Var.f307157d = i;
                        s0Var.f307158e = 1;
                        int i2 = next.f183379e;
                        if ((i2 & 2) != 0) {
                            s0Var.f307158e = 3;
                        }
                        s0Var.f307156c = c;
                        s0Var.f307159f = 100;
                        if ((i2 & 4) != 0) {
                            s0Var.f307159f = 101;
                        } else if ((i2 & 8) != 0) {
                            s0Var.f307159f = 102;
                        } else {
                            s0Var.f307159f = 104;
                        }
                        arrayList.add(s0Var);
                        sVar.mo150554f(next.f183378d, s0Var.f307159f);
                    }
                }
            }
            MMHandlerThread.postToMainThread(new C105609a(arrayList));
        }
    }
}
