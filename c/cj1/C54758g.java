package cj1;

import android.content.Context;
import androidx.lifecycle.C54219z;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import er1.C58739j4;
import er1.C58747l4;
import ft1.C59319a;
import fy3.C32224a;
import gg1.C32444a;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import o40.C11348f;
import sx3.C36907w;
import sx3.C64197v;
import te3.C50708oo0;
import te3.t94;

/* renamed from: cj1.g */
public final class C54758g {

    /* renamed from: c */
    public static final C54759a f153477c = new C54759a((C8480h) null);

    /* renamed from: a */
    public C54219z<Integer> f153478a = new C54219z<>(-1);

    /* renamed from: b */
    public ArrayList<C54785k6> f153479b = new ArrayList<>();

    /* renamed from: cj1.g$a */
    public static final class C54759a {
        public C54759a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo75662a(ArrayList<C54785k6> arrayList, String str, boolean z) {
            String str2;
            C87412m.m108594g(arrayList, "list");
            C87412m.m108594g(str, "tag");
            StringBuilder sb = new StringBuilder(str + XVFSFile.PATH_SEPARATOR_CHAR);
            int i = 0;
            for (T next : arrayList) {
                int i2 = i + 1;
                if (i >= 0) {
                    C54785k6 k6Var = (C54785k6) next;
                    sb.append("[第" + i + "首:");
                    if (z) {
                        str2 = k6Var.f153566a + ", " + k6Var.f153567b + ']';
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(k6Var);
                        sb4.append(']');
                        str2 = sb4.toString();
                    }
                    sb.append(str2);
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            Log.m105924i("FinderLiveAnchorMusicData", sb.toString());
        }
    }

    public C54758g() {
        C32444a aVar = C32444a.f86121a;
        C32444a.f86048E.mo60266n().intValue();
    }

    /* renamed from: a */
    public final C54785k6 mo75658a() {
        Integer value = this.f153478a.getValue();
        if (value == null) {
            value = -1;
        }
        int intValue = value.intValue();
        if (intValue < 0 || intValue >= this.f153479b.size()) {
            return null;
        }
        return this.f153479b.get(intValue);
    }

    /* renamed from: b */
    public final String mo75659b(int i, LinkedList<String> linkedList, Context context) {
        C87412m.m108594g(linkedList, "nameList");
        C87412m.m108594g(context, "context");
        boolean z = false;
        String str = "";
        int i2 = 0;
        for (T next : linkedList) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                str = str + ((String) next);
                if (i2 < linkedList.size() - 1) {
                    str = str + 12289;
                }
                i2 = i3;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        if (str.length() == 0) {
            z = true;
        }
        if (z) {
            return str;
        }
        if (i <= 3) {
            return str + " 想听";
        }
        return str + "…等" + i + "人想听";
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ee A[Catch:{ Exception -> 0x019c }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo75660c(java.util.ArrayList<cj1.C54785k6> r24, java.lang.String r25, fy3.C32226l<? super cj1.C54785k6, rx3.C13598b0> r26) {
        /*
            r23 = this;
            r1 = r23
            r0 = r24
            r3 = r25
            r14 = r26
            java.lang.String r15 = ",playItem:"
            java.lang.String r13 = ", curPlayPos:"
            java.lang.String r12 = "FinderLiveAnchorMusicData"
            java.lang.String r2 = "songList"
            gy3.C87412m.m108594g(r0, r2)
            cj1.k6 r2 = r23.mo75658a()     // Catch:{ Exception -> 0x019c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x019c }
            r4.<init>()     // Catch:{ Exception -> 0x019c }
            java.lang.String r5 = "before replaceAnchorMusicSingSongData replaceAnchorMusicSingSongData songList size:"
            r4.append(r5)     // Catch:{ Exception -> 0x019c }
            int r5 = r24.size()     // Catch:{ Exception -> 0x019c }
            r4.append(r5)     // Catch:{ Exception -> 0x019c }
            r4.append(r13)     // Catch:{ Exception -> 0x019c }
            androidx.lifecycle.z<java.lang.Integer> r5 = r1.f153478a     // Catch:{ Exception -> 0x019c }
            r4.append(r5)     // Catch:{ Exception -> 0x019c }
            r4.append(r15)     // Catch:{ Exception -> 0x019c }
            r4.append(r2)     // Catch:{ Exception -> 0x019c }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x019c }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r4)     // Catch:{ Exception -> 0x019c }
            java.util.Iterator r4 = r24.iterator()     // Catch:{ Exception -> 0x019c }
        L_0x0042:
            boolean r5 = r4.hasNext()     // Catch:{ Exception -> 0x019c }
            r11 = 1
            if (r5 == 0) goto L_0x008f
            java.lang.Object r5 = r4.next()     // Catch:{ Exception -> 0x019c }
            cj1.k6 r5 = (cj1.C54785k6) r5     // Catch:{ Exception -> 0x019c }
            r5.f153570e = r11     // Catch:{ Exception -> 0x019c }
            java.util.ArrayList<cj1.k6> r7 = r1.f153479b     // Catch:{ Exception -> 0x019c }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ Exception -> 0x019c }
        L_0x0057:
            boolean r8 = r7.hasNext()     // Catch:{ Exception -> 0x019c }
            if (r8 == 0) goto L_0x0042
            java.lang.Object r8 = r7.next()     // Catch:{ Exception -> 0x019c }
            cj1.k6 r8 = (cj1.C54785k6) r8     // Catch:{ Exception -> 0x019c }
            java.lang.String r9 = r8.f153566a     // Catch:{ Exception -> 0x019c }
            java.lang.String r10 = r5.f153566a     // Catch:{ Exception -> 0x019c }
            boolean r9 = gy3.C87412m.m108589b(r9, r10)     // Catch:{ Exception -> 0x019c }
            if (r9 == 0) goto L_0x0057
            java.lang.String r9 = r8.f153566a     // Catch:{ Exception -> 0x019c }
            int r9 = r9.length()     // Catch:{ Exception -> 0x019c }
            if (r9 <= 0) goto L_0x0077
            r9 = 1
            goto L_0x0078
        L_0x0077:
            r9 = 0
        L_0x0078:
            if (r9 == 0) goto L_0x0057
            boolean r9 = r8.f153570e     // Catch:{ Exception -> 0x019c }
            r5.f153570e = r9     // Catch:{ Exception -> 0x019c }
            long r9 = r8.f153567b     // Catch:{ Exception -> 0x019c }
            r5.f153567b = r9     // Catch:{ Exception -> 0x019c }
            int r9 = r8.f153568c     // Catch:{ Exception -> 0x019c }
            r5.f153568c = r9     // Catch:{ Exception -> 0x019c }
            boolean r9 = r8.f153569d     // Catch:{ Exception -> 0x019c }
            r5.f153569d = r9     // Catch:{ Exception -> 0x019c }
            java.lang.String r8 = r8.f153573h     // Catch:{ Exception -> 0x019c }
            r5.f153573h = r8     // Catch:{ Exception -> 0x019c }
            goto L_0x0057
        L_0x008f:
            java.util.ArrayList<cj1.k6> r4 = r1.f153479b     // Catch:{ Exception -> 0x019c }
            r4.clear()     // Catch:{ Exception -> 0x019c }
            java.util.ArrayList<cj1.k6> r4 = r1.f153479b     // Catch:{ Exception -> 0x019c }
            r4.addAll(r0)     // Catch:{ Exception -> 0x019c }
            if (r2 == 0) goto L_0x0166
            java.util.ArrayList<cj1.k6> r4 = r1.f153479b     // Catch:{ Exception -> 0x019c }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x019c }
            r10 = -1
            r5 = -1
            r7 = 0
        L_0x00a4:
            boolean r8 = r4.hasNext()     // Catch:{ Exception -> 0x019c }
            if (r8 == 0) goto L_0x00d6
            java.lang.Object r8 = r4.next()     // Catch:{ Exception -> 0x019c }
            int r9 = r7 + 1
            if (r7 < 0) goto L_0x00d1
            cj1.k6 r8 = (cj1.C54785k6) r8     // Catch:{ Exception -> 0x019c }
            java.lang.String r6 = r8.f153566a     // Catch:{ Exception -> 0x019c }
            java.lang.String r11 = r2.f153566a     // Catch:{ Exception -> 0x019c }
            boolean r11 = gy3.C87412m.m108589b(r6, r11)     // Catch:{ Exception -> 0x019c }
            if (r11 == 0) goto L_0x00ce
            int r6 = r6.length()     // Catch:{ Exception -> 0x019c }
            if (r6 != 0) goto L_0x00c6
            r6 = 1
            goto L_0x00c7
        L_0x00c6:
            r6 = 0
        L_0x00c7:
            if (r6 != 0) goto L_0x00ce
            int r5 = r2.f153568c     // Catch:{ Exception -> 0x019c }
            r8.f153568c = r5     // Catch:{ Exception -> 0x019c }
            r5 = r7
        L_0x00ce:
            r7 = r9
            r11 = 1
            goto L_0x00a4
        L_0x00d1:
            sx3.C64197v.m75542k()     // Catch:{ Exception -> 0x019c }
            r0 = 0
            throw r0     // Catch:{ Exception -> 0x019c }
        L_0x00d6:
            if (r5 == r10) goto L_0x00f4
            java.lang.String r4 = r2.f153566a     // Catch:{ Exception -> 0x019c }
            boolean r4 = gy3.C87412m.m108589b(r3, r4)     // Catch:{ Exception -> 0x019c }
            if (r4 != 0) goto L_0x00ef
            if (r3 == 0) goto L_0x00eb
            int r4 = r25.length()     // Catch:{ Exception -> 0x019c }
            if (r4 != 0) goto L_0x00e9
            goto L_0x00eb
        L_0x00e9:
            r6 = 0
            goto L_0x00ec
        L_0x00eb:
            r6 = 1
        L_0x00ec:
            if (r6 != 0) goto L_0x00ef
            goto L_0x00f4
        L_0x00ef:
            r22 = r12
            r0 = r13
            goto L_0x0157
        L_0x00f4:
            java.lang.String r4 = r2.f153566a     // Catch:{ Exception -> 0x019c }
            boolean r4 = gy3.C87412m.m108589b(r3, r4)     // Catch:{ Exception -> 0x019c }
            if (r4 != 0) goto L_0x014f
            java.util.ArrayList<cj1.k6> r2 = r1.f153479b     // Catch:{ Exception -> 0x019c }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x019c }
        L_0x0102:
            boolean r4 = r2.hasNext()     // Catch:{ Exception -> 0x019c }
            if (r4 == 0) goto L_0x0119
            java.lang.Object r4 = r2.next()     // Catch:{ Exception -> 0x019c }
            cj1.k6 r4 = (cj1.C54785k6) r4     // Catch:{ Exception -> 0x019c }
            int r5 = r4.f153568c     // Catch:{ Exception -> 0x019c }
            r6 = 4
            if (r5 != r6) goto L_0x0102
            if (r14 == 0) goto L_0x0102
            r14.invoke(r4)     // Catch:{ Exception -> 0x019c }
            goto L_0x0102
        L_0x0119:
            if (r3 == 0) goto L_0x0148
            if (r14 == 0) goto L_0x0148
            cj1.k6 r11 = new cj1.k6     // Catch:{ Exception -> 0x019c }
            r4 = 0
            r6 = 4
            r7 = 0
            r8 = 0
            r9 = 0
            r16 = 0
            r17 = 0
            r18 = 248(0xf8, float:3.48E-43)
            r19 = 0
            r2 = r11
            r3 = r25
            r20 = -1
            r10 = r16
            r21 = r11
            r11 = r17
            r22 = r12
            r12 = r18
            r0 = r13
            r13 = r19
            r2.<init>(r3, r4, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x019c }
            r2 = r21
            r14.invoke(r2)     // Catch:{ Exception -> 0x019c }
            goto L_0x014d
        L_0x0148:
            r22 = r12
            r0 = r13
            r20 = -1
        L_0x014d:
            r10 = -1
            goto L_0x0158
        L_0x014f:
            r22 = r12
            r0 = r13
            if (r14 == 0) goto L_0x0157
            r14.invoke(r2)     // Catch:{ Exception -> 0x019c }
        L_0x0157:
            r10 = r5
        L_0x0158:
            androidx.lifecycle.z<java.lang.Integer> r2 = r1.f153478a     // Catch:{ Exception -> 0x019c }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x019c }
            r2.postValue(r3)     // Catch:{ Exception -> 0x019c }
            cj1.k6 r2 = r23.mo75658a()     // Catch:{ Exception -> 0x019c }
            goto L_0x0169
        L_0x0166:
            r22 = r12
            r0 = r13
        L_0x0169:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x019c }
            r3.<init>()     // Catch:{ Exception -> 0x019c }
            java.lang.String r4 = "after replaceAnchorMusicSingSongData songList size:"
            r3.append(r4)     // Catch:{ Exception -> 0x019c }
            int r4 = r24.size()     // Catch:{ Exception -> 0x019c }
            r3.append(r4)     // Catch:{ Exception -> 0x019c }
            r3.append(r0)     // Catch:{ Exception -> 0x019c }
            androidx.lifecycle.z<java.lang.Integer> r0 = r1.f153478a     // Catch:{ Exception -> 0x019c }
            r3.append(r0)     // Catch:{ Exception -> 0x019c }
            r3.append(r15)     // Catch:{ Exception -> 0x019c }
            r3.append(r2)     // Catch:{ Exception -> 0x019c }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x019c }
            r2 = r22
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)     // Catch:{ Exception -> 0x019c }
            cj1.g$a r0 = f153477c     // Catch:{ Exception -> 0x019c }
            java.util.ArrayList<cj1.k6> r2 = r1.f153479b     // Catch:{ Exception -> 0x019c }
            java.lang.String r3 = "replaceAnchorMusicSingSongData"
            r4 = 1
            r0.mo75662a(r2, r3, r4)     // Catch:{ Exception -> 0x019c }
            goto L_0x01a4
        L_0x019c:
            r0 = move-exception
            er1.j4 r2 = er1.C58739j4.f168176a
            java.lang.String r3 = "FinderLiveAnchorMusicData,replaceAnchorMusicData:"
            r2.mo83712h0(r0, r3)
        L_0x01a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cj1.C54758g.mo75660c(java.util.ArrayList, java.lang.String, fy3.l):void");
    }

    /* renamed from: d */
    public final void mo75661d(C50708oo0 oo02, Context context) {
        ArrayList arrayList;
        int i;
        C50708oo0 oo03 = oo02;
        Context context2 = context;
        C87412m.m108594g(oo03, "resp");
        C87412m.m108594g(context2, "context");
        try {
            LinkedList<t94> linkedList = oo03.f139275d;
            if (linkedList != null) {
                arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
                for (t94 t94 : linkedList) {
                    String str = t94.f142057d;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = str;
                    long j = t94.f142058e;
                    int i2 = t94.f142060g;
                    LinkedList<String> linkedList2 = t94.f142059f;
                    C87412m.m108593f(linkedList2, "it.request_member_names");
                    String b = mo75659b(i2, linkedList2, context2);
                    C54785k6 k6Var = r7;
                    C54785k6 k6Var2 = new C54785k6(str2, j, 3, false, false, false, false, b, 120, (C8480h) null);
                    arrayList.add(k6Var);
                }
            } else {
                arrayList = null;
            }
            String str3 = oo03.f139276e;
            this.f153479b.clear();
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (true) {
                    i = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    C54785k6 k6Var3 = (C54785k6) it.next();
                    if (C87412m.m108589b(k6Var3.f153566a, str3)) {
                        if (k6Var3.f153566a.length() == 0) {
                            i = 1;
                        }
                        if (i == 0) {
                            k6Var3.f153568c = 4;
                        }
                    }
                }
                ArrayList<C54785k6> arrayList2 = this.f153479b;
                C58739j4.f168176a.getClass();
                Collections.sort(arrayList, new C58747l4());
                arrayList2.addAll(arrayList);
                for (T next : this.f153479b) {
                    int i3 = i + 1;
                    if (i >= 0) {
                        if (C87412m.m108589b(((C54785k6) next).f153566a, str3)) {
                            this.f153478a.postValue(Integer.valueOf(i));
                        }
                        i = i3;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("updateMusicInfo curSong:");
            sb.append(str3);
            sb.append(", curPlayPos:");
            sb.append(this.f153478a.getValue());
            sb.append(", size:");
            ArrayList<C54785k6> arrayList3 = this.f153479b;
            sb.append(arrayList3 != null ? Integer.valueOf(arrayList3.size()) : null);
            Log.m105924i("FinderLiveAnchorMusicData", sb.toString());
            f153477c.mo75662a(this.f153479b, "updateMusicInfo", true);
        } catch (Exception e) {
            C11348f.C11349a.m11178b(C59319a.f169618b, "updateMusicInfo", false, (C11348f.C11352b) null, false, false, (C32224a) null, 60, (Object) null);
            C58739j4.f168176a.mo83712h0(e, "FinderLiveAnchorMusicData updateMusicInfo");
        }
    }
}
