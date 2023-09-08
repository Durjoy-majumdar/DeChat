package wa3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import bb3.C92221d;
import com.tencent.p014mm.autogen.events.NotifyWNNoteOperationEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import pb1.C100734q;
import pb1.C100755z;
import te3.C101801kd0;
import te3.C101834rc0;
import ua3.C101994r;
import xa3.C102595k;
import xa3.C102597m;
import xa3.C102599o;
import xa3.C102607w;

/* renamed from: wa3.e */
public abstract class C102365e {

    /* renamed from: s */
    public static HashMap<String, JSONArray> f301465s = new HashMap<>();

    /* renamed from: t */
    public static boolean f301466t = false;

    /* renamed from: d */
    public C102597m f301467d = null;

    /* renamed from: e */
    public C100755z f301468e;

    /* renamed from: f */
    public HashMap<String, C102607w> f301469f = new HashMap<>();

    /* renamed from: g */
    public HashMap<String, String> f301470g = new HashMap<>();

    /* renamed from: h */
    public Map<String, C102599o> f301471h = new LinkedHashMap();

    /* renamed from: i */
    public C102366f f301472i = new C102366f();

    /* renamed from: j */
    public String f301473j = "WeNote_0";

    /* renamed from: n */
    public boolean f301474n = false;

    /* renamed from: o */
    public C101801kd0 f301475o = new C101801kd0();

    /* renamed from: p */
    public String f301476p = "";

    /* renamed from: q */
    public int f301477q = 0;

    /* renamed from: r */
    public ArrayList<C101834rc0> f301478r = new ArrayList<>();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v103, resolved type: xa3.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v104, resolved type: xa3.b} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v14 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r4v1, types: [boolean, int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0304  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo141939a(java.util.List<te3.C101834rc0> r23, boolean r24, int r25) {
        /*
            r22 = this;
            r1 = 3
            java.lang.Object[] r0 = new java.lang.Object[r1]
            int r2 = r23.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r0[r3] = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r24)
            r4 = 1
            r0[r4] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r25)
            r5 = 2
            r0[r5] = r2
            java.lang.String r2 = "MicroMsg.WNNoteBase"
            java.lang.String r6 = "dealWNNoteInfo dataList:%s isN:%s scene:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r6, r0)
            xa3.w r6 = new xa3.w
            r6.<init>()
            java.util.Iterator r7 = r23.iterator()
            r0 = 0
            r10 = r22
            r8 = r0
            r9 = r8
        L_0x0031:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0531
            java.lang.Object r0 = r7.next()
            r11 = r0
            te3.rc0 r11 = (te3.C101834rc0) r11
            xa3.o r12 = new xa3.o
            r12.<init>()
            java.lang.String r0 = r11.f299308i1
            r12.f302098o = r0
            int r0 = r11.f299258I
            java.lang.String r13 = "-1"
            if (r0 != r4) goto L_0x004f
            r12.f302098o = r13
        L_0x004f:
            java.lang.String r0 = r12.f302098o
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x007a
            java.lang.String r0 = "Note: DataItem.htmlid is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            java.lang.String r0 = r10.mo141942d(r11)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x0074
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r1 == 0) goto L_0x0074
            xa3.m r1 = r10.f301467d
            long r1 = r1.f302092c
            wa3.C102368h.m135077h(r1, r0)
            goto L_0x0079
        L_0x0074:
            java.util.ArrayList<te3.rc0> r0 = r10.f301478r
            r0.add(r11)
        L_0x0079:
            return
        L_0x007a:
            java.lang.String r0 = r12.f302098o
            java.lang.String r14 = "WeNoteHtmlFile"
            boolean r0 = r0.equals(r14)
            java.lang.String r14 = ""
            if (r0 == 0) goto L_0x00fa
            java.lang.String r0 = r10.mo141942d(r11)
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r13 != 0) goto L_0x00bd
            boolean r13 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r13 == 0) goto L_0x00bd
            java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106432N(r0)     // Catch:{ Exception -> 0x00b6 }
            r6.f302136a = r0     // Catch:{ Exception -> 0x00b6 }
            java.util.ArrayList r8 = gb3.C98095b.m126705b(r0)     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r9 = r6.f302136a     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r0 = "local html file exist,dataid: %s"
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r13 = r11.f299280T     // Catch:{ Exception -> 0x00b6 }
            r12[r3] = r13     // Catch:{ Exception -> 0x00b6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r12)     // Catch:{ Exception -> 0x00b6 }
            java.util.HashMap<java.lang.String, org.json.JSONArray> r0 = f301465s     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r12 = r6.f302136a     // Catch:{ Exception -> 0x00b6 }
            r0.containsKey(r12)     // Catch:{ Exception -> 0x00b6 }
            goto L_0x00d9
        L_0x00b6:
            r0 = move-exception
            java.lang.Object[] r12 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r14, r12)
            goto L_0x00d9
        L_0x00bd:
            java.util.ArrayList<te3.rc0> r0 = r10.f301478r
            r0.add(r11)
            r6.f302138c = r4
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r13 = r11.f299280T
            r0[r3] = r13
            java.lang.String r13 = "local html file not exist,download htmlfile,dataid: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r13, r0)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r10.f301470g
            java.lang.String r13 = r11.f299280T
            java.lang.String r12 = r12.f302098o
            r0.put(r13, r12)
        L_0x00d9:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r12 = r11.f299325s
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r0[r3] = r12
            java.lang.String r11 = r11.f299329u
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r0[r4] = r11
            java.lang.String r11 = "dealWNNoteInfo,WeNoteHtmlFile, cdnurl is null :%B, cdnkey is null : %B "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r11, r0)
            goto L_0x0031
        L_0x00fa:
            java.lang.String r0 = r12.f302098o
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L_0x0135
            java.lang.String r0 = r12.f302098o
            r15 = 7
            java.lang.String r0 = r0.substring(r15)
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r3)
            java.lang.String r1 = r10.f301473j
            java.lang.String r1 = r1.substring(r15)
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r3)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r3 = "WeNote_"
            r15.append(r3)
            if (r1 <= r0) goto L_0x0128
            java.lang.String r0 = java.lang.String.valueOf(r1)
            goto L_0x012c
        L_0x0128:
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L_0x012c:
            r15.append(r0)
            java.lang.String r0 = r15.toString()
            r10.f301473j = r0
        L_0x0135:
            java.lang.String r0 = r11.f299280T
            r12.f302070a = r0
            int r0 = r11.f299258I
            if (r0 == r4) goto L_0x04a6
            if (r0 == r5) goto L_0x042e
            r1 = 20
            r3 = 4
            r13 = 3
            if (r0 == r13) goto L_0x0373
            r13 = 6
            if (r0 == r3) goto L_0x0267
            if (r0 == r13) goto L_0x01c4
            r13 = 8
            if (r0 == r13) goto L_0x015c
            if (r0 == r1) goto L_0x0373
            r4 = r22
            r23 = r7
            r18 = r8
            r17 = r9
            r7 = r2
            r2 = r6
            goto L_0x0322
        L_0x015c:
            xa3.d r0 = new xa3.d
            r0.<init>()
            java.lang.String r1 = r12.f302098o
            r0.f302098o = r1
            r1 = 5
            r0.f302099p = r1
            java.lang.String r1 = r12.f302070a
            r0.f302070a = r1
            r0.f302097n = r11
            java.lang.String r1 = r10.mo141942d(r11)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r3 != 0) goto L_0x0183
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            if (r3 == 0) goto L_0x0183
            r0.f302100q = r4
            r0.f302101r = r1
            goto L_0x018f
        L_0x0183:
            r1 = 0
            r0.f302100q = r1
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r10.f301470g
            java.lang.String r3 = r11.f299280T
            java.lang.String r13 = r12.f302098o
            r1.put(r3, r13)
        L_0x018f:
            java.lang.String r1 = r11.f299297d
            r0.f302127s = r1
            java.lang.String r1 = r11.f299301f
            r0.f302128t = r1
            java.lang.String r3 = r11.f299262K
            r0.f302129u = r3
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x01aa
            long r13 = r11.f299276R
            float r1 = (float) r13
            java.lang.String r1 = wa3.C102368h.m135073d(r1)
            r0.f302128t = r1
        L_0x01aa:
            wa3.l$a r1 = r6.f302137b
            java.util.List<xa3.o> r1 = r1.f301503a
            r1.add(r0)
            java.util.Map<java.lang.String, xa3.o> r1 = r10.f301471h
            java.lang.String r3 = r12.f302098o
            r1.put(r3, r0)
            r4 = r22
            r23 = r7
            r18 = r8
            r17 = r9
            r7 = r2
            r2 = r6
            goto L_0x0523
        L_0x01c4:
            te3.sc0 r0 = r11.f299296c1
            te3.zc0 r0 = r0.f299406e
            if (r0 != 0) goto L_0x01ec
            te3.zc0 r0 = new te3.zc0
            r0.<init>()
            r0.mo141339v(r14)
            r0.mo141322E(r14)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "locItem is null, dataItemId:"
            r1.append(r3)
            java.lang.String r3 = r11.f299280T
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
        L_0x01ec:
            r15 = r6
            double r5 = r0.f299952f
            float r1 = (float) r5
            double r5 = r0.f299950d
            float r3 = (float) r5
            int r5 = r0.f299954h
            java.lang.String r6 = r0.f299956j
            java.lang.String r10 = r0.f299958o
            java.lang.String r13 = r0.f299960q
            boolean r4 = r0.f299944A
            r23 = r7
            java.lang.String r7 = r0.f299962s
            r16 = r15
            java.lang.String r15 = r0.f299964u
            r17 = r9
            java.lang.String r9 = r0.f299966w
            r18 = r8
            float r8 = r0.f299968y
            r19 = r2
            java.lang.String r2 = r0.f299946C
            java.lang.String r0 = r0.f299948E
            r20 = r14
            xa3.g r14 = new xa3.g
            r14.<init>()
            r21 = r0
            java.lang.String r0 = r12.f302098o
            r14.f302098o = r0
            r0 = r2
            r2 = 3
            r14.f302099p = r2
            java.lang.String r2 = r12.f302070a
            r14.f302070a = r2
            r14.f302097n = r11
            r2 = 1
            r14.f302100q = r2
            r14.f302118s = r10
            r14.f302122w = r6
            double r1 = (double) r1
            r14.f302119t = r1
            double r1 = (double) r3
            r14.f302120u = r1
            double r1 = (double) r5
            r14.f302121v = r1
            r14.f302123x = r13
            r14.f302124y = r4
            r14.f302125z = r7
            r14.f302113A = r15
            r14.f302114B = r9
            r14.f302115C = r8
            r14.f302116D = r0
            r0 = r21
            r14.f302117E = r0
            r1 = r20
            r14.f302101r = r1
            r2 = r16
            wa3.l$a r0 = r2.f302137b
            java.util.List<xa3.o> r0 = r0.f301503a
            r0.add(r14)
            r4 = r22
            java.util.Map<java.lang.String, xa3.o> r0 = r4.f301471h
            java.lang.String r1 = r12.f302098o
            r0.put(r1, r14)
            r10 = r4
            r7 = r19
            goto L_0x0523
        L_0x0267:
            r4 = r22
            r19 = r2
            r2 = r6
            r23 = r7
            r18 = r8
            r17 = r9
            r1 = r14
            if (r24 == 0) goto L_0x0320
            xa3.k r3 = new xa3.k
            r3.<init>()
            java.lang.String r0 = r12.f302098o
            r3.f302098o = r0
            r3.f302099p = r13
            java.lang.String r0 = r12.f302070a
            r3.f302070a = r0
            r3.f302097n = r11
            int r0 = r11.f299338y
            r3.f302085t = r0
            java.lang.String r0 = r10.mo141947i(r11)
            r3.f302084s = r0
            java.lang.String r5 = r10.mo141942d(r11)
            r3.f302101r = r5
            java.lang.String r0 = r3.f302084s
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x02f2
            java.lang.String r0 = r3.f302084s
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r0 != 0) goto L_0x02f2
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)
            if (r0 == 0) goto L_0x02d0
            android.graphics.Bitmap r0 = com.tencent.p014mm.plugin.fav.p047ui.C93693r.m118401b(r5)
            if (r0 == 0) goto L_0x02f2
            java.lang.String r6 = "add fav service: create thumbpath bitmap, saveBitmapToImage "
            r7 = r19
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)     // Catch:{ Exception -> 0x02c4 }
            r6 = 60
            android.graphics.Bitmap$CompressFormat r8 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x02c4 }
            java.lang.String r9 = r3.f302084s     // Catch:{ Exception -> 0x02c4 }
            r13 = 1
            ud3.C102000f.m134325a(r0, r6, r8, r9, r13)     // Catch:{ Exception -> 0x02c4 }
            goto L_0x02f4
        L_0x02c4:
            r0 = move-exception
            goto L_0x02c9
        L_0x02c6:
            r0 = move-exception
            r7 = r19
        L_0x02c9:
            r6 = 0
            java.lang.Object[] r8 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r1, r8)
            goto L_0x02f4
        L_0x02d0:
            r7 = r19
            java.lang.String r0 = r3.f302084s
            r10.mo141941c(r11, r0)
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r10.f301470g
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = r11.f299280T
            r1.append(r6)
            java.lang.String r6 = "_t"
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.String r6 = r12.f302098o
            r0.put(r1, r6)
            goto L_0x02f4
        L_0x02f2:
            r7 = r19
        L_0x02f4:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r0 != 0) goto L_0x0304
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)
            if (r0 == 0) goto L_0x0304
            r1 = 1
            r3.f302100q = r1
            goto L_0x0310
        L_0x0304:
            r1 = 0
            r3.f302100q = r1
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r10.f301470g
            java.lang.String r1 = r11.f299280T
            java.lang.String r5 = r12.f302098o
            r0.put(r1, r5)
        L_0x0310:
            wa3.l$a r0 = r2.f302137b
            java.util.List<xa3.o> r0 = r0.f301503a
            r0.add(r3)
            java.util.Map<java.lang.String, xa3.o> r0 = r10.f301471h
            java.lang.String r1 = r12.f302098o
            r0.put(r1, r3)
            goto L_0x0523
        L_0x0320:
            r7 = r19
        L_0x0322:
            if (r0 > 0) goto L_0x0326
            goto L_0x0523
        L_0x0326:
            xa3.j r0 = new xa3.j
            r0.<init>()
            java.lang.String r1 = r12.f302098o
            r0.f302098o = r1
            r1 = 0
            r0.f302099p = r1
            java.lang.String r1 = r12.f302070a
            r0.f302070a = r1
            r0.f302097n = r11
            java.lang.String r1 = r10.mo141942d(r11)
            r3 = 1
            r0.f302100q = r3
            r0.f302101r = r1
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2131825711(0x7f11142f, float:1.9284286E38)
            java.lang.String r1 = r1.getString(r3)
            r0.f302096t = r1
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2131825746(0x7f111452, float:1.9284357E38)
            java.lang.String r1 = r1.getString(r3)
            r0.f302095s = r1
            wa3.l$a r1 = r2.f302137b
            java.util.List<xa3.o> r1 = r1.f301503a
            r1.add(r0)
            java.util.Map<java.lang.String, xa3.o> r1 = r10.f301471h
            java.lang.String r3 = r12.f302098o
            r1.put(r3, r0)
            goto L_0x0523
        L_0x0373:
            r4 = r22
            r23 = r7
            r18 = r8
            r17 = r9
            r7 = r2
            r2 = r6
            if (r0 != r1) goto L_0x0390
            xa3.b r0 = new xa3.b
            r0.<init>()
            java.lang.String r1 = r11.f299325s
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0395
            r1 = 1
            r0.f302069A = r1
            goto L_0x0395
        L_0x0390:
            xa3.l r0 = new xa3.l
            r0.<init>()
        L_0x0395:
            java.lang.String r1 = r12.f302098o
            r0.f302098o = r1
            r0.f302099p = r3
            java.lang.String r1 = r12.f302070a
            r0.f302070a = r1
            r0.f302097n = r11
            java.lang.String r1 = r10.mo141942d(r11)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r3 != 0) goto L_0x03bf
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            if (r3 == 0) goto L_0x03bf
            r3 = 1
            r0.f302100q = r3
            int r3 = r11.f299338y
            long r5 = (long) r3
            float r3 = wa3.C102368h.m135075f(r5)
            int r3 = (int) r3
            r0.f302132u = r3
            goto L_0x03da
        L_0x03bf:
            java.util.ArrayList<te3.rc0> r3 = r10.f301478r
            r3.add(r11)
            r3 = 0
            r0.f302100q = r3
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r5 = 2131825825(0x7f1114a1, float:1.9284517E38)
            r3.getString(r5)
            java.util.HashMap<java.lang.String, java.lang.String> r3 = r10.f301470g
            java.lang.String r5 = r11.f299280T
            java.lang.String r6 = r12.f302098o
            r3.put(r5, r6)
        L_0x03da:
            r0.f302101r = r1
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r3 = r11.f299338y
            long r5 = (long) r3
            float r3 = wa3.C102368h.m135075f(r5)
            int r3 = (int) r3
            com.tencent.mm.autogen.events.FavoriteOperationEvent r5 = new com.tencent.mm.autogen.events.FavoriteOperationEvent
            r5.<init>()
            com.tencent.mm.autogen.events.FavoriteOperationEvent$a r6 = r5.f264833d
            r8 = 21
            r6.f264835a = r8
            r6.f264842h = r1
            r6.f264848n = r3
            r5.publish()
            com.tencent.mm.autogen.events.FavoriteOperationEvent$b r1 = r5.f264834e
            java.lang.String r1 = r1.f264857c
            r0.f302133v = r1
            int r1 = r11.f299338y
            r0.f302135x = r1
            com.tencent.mm.autogen.events.FavoriteOperationEvent r1 = new com.tencent.mm.autogen.events.FavoriteOperationEvent
            r1.<init>()
            com.tencent.mm.autogen.events.FavoriteOperationEvent$a r3 = r1.f264833d
            r5 = 17
            r3.f264835a = r5
            r3.f264840f = r11
            r1.publish()
            com.tencent.mm.autogen.events.FavoriteOperationEvent$b r1 = r1.f264834e
            int r1 = r1.f264855a
            r0.f302134w = r1
            java.lang.String r1 = r11.f299262K
            r0.f302130s = r1
            wa3.l$a r1 = r2.f302137b
            java.util.List<xa3.o> r1 = r1.f301503a
            r1.add(r0)
            java.util.Map<java.lang.String, xa3.o> r1 = r10.f301471h
            java.lang.String r3 = r12.f302098o
            r1.put(r3, r0)
            goto L_0x0523
        L_0x042e:
            r4 = r22
            r23 = r7
            r18 = r8
            r17 = r9
            r7 = r2
            r2 = r6
            xa3.f r0 = new xa3.f
            r0.<init>()
            java.lang.String r1 = r12.f302098o
            r0.f302098o = r1
            r1 = 2
            r0.f302099p = r1
            java.lang.String r1 = r12.f302070a
            r0.f302070a = r1
            r0.f302097n = r11
            java.lang.String r1 = r10.mo141942d(r11)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r3 == 0) goto L_0x0456
            goto L_0x0523
        L_0x0456:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r5 = "_bigthumb"
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = r10.mo141947i(r11)
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)
            if (r6 != 0) goto L_0x0474
            r10.mo141941c(r11, r5)
        L_0x0474:
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            if (r5 == 0) goto L_0x0481
            r5 = 1
            r0.f302100q = r5
            gb3.C98096c.m126708c(r1, r3)
            goto L_0x0492
        L_0x0481:
            java.util.ArrayList<te3.rc0> r5 = r10.f301478r
            r5.add(r11)
            r5 = 0
            r0.f302100q = r5
            java.util.HashMap<java.lang.String, java.lang.String> r5 = r10.f301470g
            java.lang.String r6 = r11.f299280T
            java.lang.String r8 = r12.f302098o
            r5.put(r6, r8)
        L_0x0492:
            r0.f302101r = r3
            r0.f302104s = r1
            wa3.l$a r1 = r2.f302137b
            java.util.List<xa3.o> r1 = r1.f301503a
            r1.add(r0)
            java.util.Map<java.lang.String, xa3.o> r1 = r10.f301471h
            java.lang.String r3 = r12.f302098o
            r1.put(r3, r0)
            goto L_0x0523
        L_0x04a6:
            r4 = r22
            r23 = r7
            r18 = r8
            r17 = r9
            r7 = r2
            r2 = r6
            java.lang.String r0 = r11.f299301f
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x04b9
            goto L_0x0523
        L_0x04b9:
            wa3.l$a r0 = r2.f302137b
            java.util.List<xa3.o> r0 = r0.f301503a
            int r0 = r0.size()
            r1 = 1
            if (r0 < r1) goto L_0x050f
            wa3.l$a r0 = r2.f302137b
            java.util.List<xa3.o> r0 = r0.f301503a
            int r3 = r0.size()
            int r3 = r3 - r1
            java.lang.Object r0 = r0.get(r3)
            if (r0 == 0) goto L_0x050f
            wa3.l$a r0 = r2.f302137b
            java.util.List<xa3.o> r0 = r0.f301503a
            int r3 = r0.size()
            int r3 = r3 - r1
            java.lang.Object r0 = r0.get(r3)
            xa3.o r0 = (xa3.C102599o) r0
            java.lang.String r0 = r0.f302098o
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x050f
            wa3.l$a r0 = r2.f302137b
            java.util.List<xa3.o> r0 = r0.f301503a
            int r3 = r0.size()
            int r3 = r3 - r1
            java.lang.Object r0 = r0.get(r3)
            xa3.t r0 = (xa3.C102604t) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r0.f302126s
            r1.append(r3)
            java.lang.String r3 = r11.f299301f
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.f302126s = r1
            goto L_0x0523
        L_0x050f:
            xa3.i r0 = new xa3.i
            r0.<init>()
            java.lang.String r1 = r12.f302098o
            r0.f302098o = r1
            java.lang.String r1 = r11.f299301f
            r0.f302126s = r1
            wa3.l$a r1 = r2.f302137b
            java.util.List<xa3.o> r1 = r1.f301503a
            r1.add(r0)
        L_0x0523:
            r6 = r2
            r2 = r7
            r9 = r17
            r8 = r18
            r1 = 3
            r3 = 0
            r4 = 1
            r5 = 2
            r7 = r23
            goto L_0x0031
        L_0x0531:
            r4 = r22
            r7 = r2
            r2 = r6
            r18 = r8
            r17 = r9
            if (r18 == 0) goto L_0x0553
            int r0 = r18.size()
            if (r0 <= 0) goto L_0x0553
            if (r24 == 0) goto L_0x0553
            wa3.l$a r0 = r2.f302137b
            java.util.List<xa3.o> r0 = r0.f301503a
            r9 = r17
            r8 = r18
            r1 = 1
            wa3.l$a r0 = wa3.C102372l.m135093a(r0, r9, r8, r1)
            r2.f302137b = r0
            goto L_0x0555
        L_0x0553:
            r9 = r17
        L_0x0555:
            xa3.m r0 = r10.f301467d
            long r5 = r0.f302093d
            r11 = -1
            int r1 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r1 != 0) goto L_0x058a
            java.util.HashMap<java.lang.String, xa3.w> r1 = r10.f301469f
            long r5 = r0.f302092c
            java.lang.String r0 = java.lang.Long.toString(r5)
            r1.put(r0, r2)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Log.isDebug()
            if (r0 == 0) goto L_0x05b2
            r1 = 3
            java.lang.Object[] r0 = new java.lang.Object[r1]
            xa3.m r1 = r10.f301467d
            long r5 = r1.f302092c
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r3 = 0
            r0[r3] = r1
            r1 = 1
            r0[r1] = r2
            r1 = 2
            r0[r1] = r9
            java.lang.String r1 = "dealWNNoteInfoFav favLocalId:%s wrapData:%s html:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r1, r0)
            goto L_0x05b2
        L_0x058a:
            java.util.HashMap<java.lang.String, xa3.w> r0 = r10.f301469f
            java.lang.String r1 = java.lang.Long.toString(r5)
            r0.put(r1, r2)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Log.isDebug()
            if (r0 == 0) goto L_0x05b2
            r1 = 3
            java.lang.Object[] r0 = new java.lang.Object[r1]
            xa3.m r1 = r10.f301467d
            long r5 = r1.f302093d
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r3 = 0
            r0[r3] = r1
            r1 = 1
            r0[r1] = r2
            r1 = 2
            r0[r1] = r9
            java.lang.String r1 = "dealWNNoteInfoMsg msgId::%s wrapData:%s html:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r1, r0)
        L_0x05b2:
            java.util.ArrayList<te3.rc0> r0 = r10.f301478r
            java.util.Iterator r0 = r0.iterator()
        L_0x05b8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x05c8
            java.lang.Object r1 = r0.next()
            te3.rc0 r1 = (te3.C101834rc0) r1
            r10.mo141940b(r1)
            goto L_0x05b8
        L_0x05c8:
            java.util.ArrayList<te3.rc0> r0 = r10.f301478r
            r0.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wa3.C102365e.mo141939a(java.util.List, boolean, int):void");
    }

    /* renamed from: b */
    public abstract void mo141940b(C101834rc0 rc02);

    /* renamed from: c */
    public abstract void mo141941c(C101834rc0 rc02, String str);

    /* renamed from: d */
    public abstract String mo141942d(C101834rc0 rc02);

    /* renamed from: e */
    public C101834rc0 mo141943e(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.WNNoteBase", "getFavDataItemByDataId, dataId is null");
            return null;
        }
        String str2 = this.f301470g.get(str);
        if (Util.isNullOrNil(str2)) {
            Log.m105921e("MicroMsg.WNNoteBase", "getFavDataItemByDataId, can not find editorId by dataId: %s", str);
            return null;
        }
        C102599o oVar = (C102599o) ((LinkedHashMap) this.f301471h).get(str2);
        if (oVar != null) {
            return oVar.f302097n;
        }
        Log.m105921e("MicroMsg.WNNoteBase", "getFavDataItemByDataId, can not find item by editorId: %s", str2);
        return null;
    }

    /* renamed from: f */
    public boolean mo141944f() {
        C92221d dVar = C101994r.f300318d;
        return dVar != null && dVar.f263954j;
    }

    /* renamed from: g */
    public abstract String mo141945g();

    /* renamed from: h */
    public String mo141946h() {
        return "";
    }

    /* renamed from: i */
    public abstract String mo141947i(C101834rc0 rc02);

    /* renamed from: j */
    public abstract void mo141948j(Context context, String str);

    /* renamed from: k */
    public abstract void mo141949k(Context context, String str);

    /* renamed from: l */
    public abstract void mo141950l(Context context, String str);

    /* renamed from: m */
    public abstract boolean mo141951m(Context context, String str);

    /* renamed from: n */
    public void mo141952n() {
        for (Map.Entry<String, C102607w> value : this.f301469f.entrySet()) {
            for (C102599o d : ((C102607w) value.getValue()).f302137b.f301503a) {
                d.mo142214d();
            }
        }
        for (Map.Entry value2 : ((LinkedHashMap) this.f301471h).entrySet()) {
            ((C102599o) value2.getValue()).mo142214d();
        }
    }

    /* renamed from: o */
    public void mo141953o(NotifyWNNoteOperationEvent notifyWNNoteOperationEvent) {
        NotifyWNNoteOperationEvent.C92535a aVar = notifyWNNoteOperationEvent.f264942d;
        if (aVar == null) {
            Log.m105920e("MicroMsg.WNNoteBase", "setWNNativeCallbackOnClick, opertionevent.data is null, retutn");
            return;
        }
        String str = aVar.f264945b;
        int i = aVar.f264944a;
        C102599o oVar = (C102599o) ((LinkedHashMap) this.f301471h).get(str);
        if (oVar == null) {
            Log.m105920e("MicroMsg.WNNoteBase", "setWNNativeCallbackOnClick, mEditorIdToDataItem.get(localEditorId) is null, retutn");
            return;
        }
        Log.m105925i("MicroMsg.WNNoteBase", "setWNNativeCallbackOnClick, mEditorIdToDataItem.get(localEditorId) is %d", Integer.valueOf(oVar.f302099p));
        int i2 = oVar.f302099p;
        if (i2 == 2) {
            mo141949k(notifyWNNoteOperationEvent.f264942d.f264947d, str);
        } else if (i2 == 3) {
            mo141950l(notifyWNNoteOperationEvent.f264942d.f264947d, str);
        } else if (i2 == 5) {
            mo141948j(notifyWNNoteOperationEvent.f264942d.f264947d, str);
        } else if (i2 == 6) {
            Context context = notifyWNNoteOperationEvent.f264942d.f264947d;
            C102595k kVar = (C102595k) ((LinkedHashMap) this.f301471h).get(str);
            if (!Util.isNullOrNil(kVar.f302101r)) {
                if (!C86013q1.m106450k(kVar.f302101r)) {
                    C101834rc0 e = mo141943e(kVar.f302070a);
                    if (e == null) {
                        Log.m105920e("MicroMsg.WNNoteBase", "goToVideoPlay, favData is null");
                        return;
                    }
                    mo141940b(e);
                }
                if (!mo141951m(context, str)) {
                    Intent intent = new Intent();
                    C100755z zVar = this.f301468e;
                    if (zVar == null) {
                        intent.putExtra("key_detail_info_id", 0);
                    } else {
                        intent.putExtra("key_detail_info_id", zVar.field_localId);
                    }
                    intent.putExtra("key_detail_fav_path", kVar.f302101r);
                    intent.putExtra("key_detail_fav_thumb_path", kVar.f302084s);
                    intent.putExtra("key_detail_fav_video_duration", kVar.f302085t);
                    intent.putExtra("key_detail_data_id", kVar.f302070a);
                    intent.putExtra("key_detail_statExtStr", "");
                    intent.putExtra("key_detail_fav_video_show_download_status", true);
                    C101834rc0 rc02 = kVar.f302097n;
                    if (rc02 != null) {
                        intent.putExtra("key_detail_msg_uuid", rc02.f299259I1);
                    }
                    C100734q.m131877u0(context, ".ui.detail.FavoriteVideoPlayUI", intent, 1, (Bundle) null);
                }
            }
        }
    }
}
