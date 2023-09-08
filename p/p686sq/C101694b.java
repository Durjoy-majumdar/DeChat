package p686sq;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import ia1.C98619b;
import ia1.C98620c;
import ia1.C98621f;
import ia1.C98624g;
import ia1.C98625h;
import java.util.ArrayList;
import o91.C100312d;
import p700tq.C64995b;

@C86522b
/* renamed from: sq.b */
public final class C101694b extends C86301e implements C64995b {
    public void Cv0(C98619b bVar) {
        C98624g gVar = C98624g.f289158a;
        if (bVar != null) {
            ArrayList<C98619b> arrayList = C98624g.f289159b;
            if (!arrayList.contains(bVar)) {
                arrayList.add(bVar);
            }
        }
    }

    /* renamed from: HW */
    public void mo89151HW(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "recycleView");
        C98625h a = C98625h.m128225a();
        a.getClass();
        recyclerView.mo17043c(a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0205 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0387 A[Catch:{ Exception -> 0x03cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x038f A[Catch:{ Exception -> 0x03cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0396 A[Catch:{ Exception -> 0x03cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x03a4 A[Catch:{ Exception -> 0x03cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x03a7 A[Catch:{ Exception -> 0x03cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x03aa A[Catch:{ Exception -> 0x03cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x03b3 A[Catch:{ Exception -> 0x03cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x03b8 A[Catch:{ Exception -> 0x03cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x03bd A[Catch:{ Exception -> 0x03cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x03c0 A[Catch:{ Exception -> 0x03cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x03c3 A[Catch:{ Exception -> 0x03cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x03ec A[Catch:{ Exception -> 0x045d }] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x03f1 A[Catch:{ Exception -> 0x045d }] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x03f4 A[Catch:{ Exception -> 0x045d }] */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x03f6 A[Catch:{ Exception -> 0x045d }] */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x049e  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x04af A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x04c5  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x012c A[Catch:{ Exception -> 0x019d }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0131 A[Catch:{ Exception -> 0x019d }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0134 A[Catch:{ Exception -> 0x019d }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0136 A[Catch:{ Exception -> 0x019d }] */
    /* renamed from: kT */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo89152kT(android.view.View r22, java.lang.Object r23, int r24, int r25) {
        /*
            r21 = this;
            r0 = r22
            r1 = r23
            boolean r2 = r0 instanceof android.widget.ListView
            r4 = -1
            r5 = 1
            java.lang.String r8 = "height"
            java.lang.String r9 = "y"
            java.lang.String r10 = "_getHellFeed, crash-2: "
            java.lang.String r11 = "_getHellFeed, crash: "
            java.lang.String r12 = "snsFeed.feed.feedId"
            java.lang.String r13 = "isShow"
            java.lang.String r14 = ""
            java.lang.String r15 = "HABBYGE-MALI.SnsFeedMonitor"
            if (r2 == 0) goto L_0x02a8
            boolean r2 = r1 instanceof android.widget.BaseAdapter
            if (r2 == 0) goto L_0x02a8
            ia1.g r2 = ia1.C98624g.f289158a
            r3 = r0
            android.widget.AbsListView r3 = (android.widget.AbsListView) r3
            android.widget.BaseAdapter r1 = (android.widget.BaseAdapter) r1
            if (r3 != 0) goto L_0x002c
            goto L_0x0551
        L_0x002c:
            int r0 = ia1.C98624g.f289164g
            if (r0 > 0) goto L_0x003f
            android.content.Context r0 = r3.getContext()
            boolean r7 = r0 instanceof androidx.appcompat.app.AppCompatActivity
            if (r7 == 0) goto L_0x003b
            androidx.appcompat.app.AppCompatActivity r0 = (androidx.appcompat.app.AppCompatActivity) r0
            goto L_0x003c
        L_0x003b:
            r0 = 0
        L_0x003c:
            r2.mo138055b(r0)
        L_0x003f:
            if (r24 < 0) goto L_0x0047
            if (r25 <= 0) goto L_0x0047
            ia1.C98624g.f289161d = r24
            ia1.C98624g.f289162e = r25
        L_0x0047:
            int r0 = ia1.C98624g.f289162e
            int r0 = r0 - r5
            r7 = r0
        L_0x004b:
            if (r4 >= r7) goto L_0x0551
            android.view.View r4 = r3.getChildAt(r7)
            if (r4 != 0) goto L_0x005c
            r6 = r1
            r17 = r2
            r18 = r7
            r5 = r12
            r4 = r13
            goto L_0x029d
        L_0x005c:
            int r0 = ia1.C98624g.f289161d
            android.widget.Adapter r16 = r3.getAdapter()
            android.widget.ListAdapter r16 = (android.widget.ListAdapter) r16
            if (r16 != 0) goto L_0x0067
            goto L_0x0082
        L_0x0067:
            int r5 = r0 + r7
            android.widget.Adapter r0 = r3.getAdapter()
            android.widget.ListAdapter r0 = (android.widget.ListAdapter) r0
            int r0 = r0.getCount()
            if (r5 < r0) goto L_0x0076
            goto L_0x0082
        L_0x0076:
            android.widget.Adapter r0 = r3.getAdapter()
            android.widget.ListAdapter r0 = (android.widget.ListAdapter) r0
            java.lang.Object r6 = r0.getItem(r5)
            if (r6 != 0) goto L_0x0091
        L_0x0082:
            r22 = r1
            r17 = r2
            r23 = r4
            r18 = r7
            r19 = r12
            r20 = r13
            r0 = 0
            goto L_0x0211
        L_0x0091:
            op3.b r0 = r2.mo138054a(r4)
            r17 = r2
            r2 = 0
            java.lang.Object r18 = r0.mo182596a(r2)
            r2 = r18
            java.lang.Integer r2 = (java.lang.Integer) r2
            r18 = r7
            r7 = 1
            java.lang.Object r0 = r0.mo182596a(r7)
            r7 = r0
            java.lang.Integer r7 = (java.lang.Integer) r7
            r22 = r1
            o91.f r1 = new o91.f
            r1.<init>()
            te3.e74 r0 = new te3.e74
            r0.<init>()
            r1.f293867a = r0
            java.lang.reflect.Method r0 = ia1.C98624g.f289170m     // Catch:{ Exception -> 0x010c }
            r23 = r4
            r19 = r12
            if (r0 == 0) goto L_0x00c8
            r4 = 0
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0108 }
            java.lang.Object r0 = r0.invoke(r6, r12)     // Catch:{ Exception -> 0x0108 }
            goto L_0x00c9
        L_0x00c8:
            r0 = 0
        L_0x00c9:
            te3.e74 r4 = r1.f293867a     // Catch:{ Exception -> 0x0108 }
            java.lang.reflect.Field r12 = ia1.C98624g.f289171n     // Catch:{ Exception -> 0x0108 }
            if (r12 == 0) goto L_0x00d6
            java.lang.Object r12 = r12.get(r0)     // Catch:{ Exception -> 0x0108 }
            r20 = r13
            goto L_0x00d9
        L_0x00d6:
            r20 = r13
            r12 = 0
        L_0x00d9:
            boolean r13 = r12 instanceof java.lang.String     // Catch:{ Exception -> 0x0106 }
            if (r13 == 0) goto L_0x00e0
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x0106 }
            goto L_0x00e1
        L_0x00e0:
            r12 = 0
        L_0x00e1:
            if (r12 != 0) goto L_0x00e4
            r12 = r14
        L_0x00e4:
            r4.f298179d = r12     // Catch:{ Exception -> 0x0106 }
            te3.e74 r4 = r1.f293867a     // Catch:{ Exception -> 0x0106 }
            java.lang.reflect.Field r12 = ia1.C98624g.f289172o     // Catch:{ Exception -> 0x0106 }
            if (r12 == 0) goto L_0x00f1
            java.lang.Object r0 = r12.get(r0)     // Catch:{ Exception -> 0x0106 }
            goto L_0x00f2
        L_0x00f1:
            r0 = 0
        L_0x00f2:
            boolean r12 = r0 instanceof java.lang.String     // Catch:{ Exception -> 0x0106 }
            if (r12 == 0) goto L_0x00f9
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0106 }
            goto L_0x00fa
        L_0x00f9:
            r0 = 0
        L_0x00fa:
            if (r0 != 0) goto L_0x00fd
            r0 = r14
        L_0x00fd:
            r4.f298197y = r0     // Catch:{ Exception -> 0x0106 }
            te3.e74 r0 = r1.f293867a     // Catch:{ Exception -> 0x0106 }
            java.lang.String r0 = r0.f298197y     // Catch:{ Exception -> 0x0106 }
            r1.f293875i = r0     // Catch:{ Exception -> 0x0106 }
            goto L_0x0128
        L_0x0106:
            r0 = move-exception
            goto L_0x0112
        L_0x0108:
            r0 = move-exception
        L_0x0109:
            r20 = r13
            goto L_0x0112
        L_0x010c:
            r0 = move-exception
            r23 = r4
            r19 = r12
            goto L_0x0109
        L_0x0112:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r11)
            java.lang.String r0 = r0.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
        L_0x0128:
            java.lang.reflect.Field r0 = ia1.C98624g.f289173p     // Catch:{ Exception -> 0x019d }
            if (r0 == 0) goto L_0x0131
            java.lang.Object r0 = r0.get(r6)     // Catch:{ Exception -> 0x019d }
            goto L_0x0132
        L_0x0131:
            r0 = 0
        L_0x0132:
            if (r0 != 0) goto L_0x0136
            goto L_0x01b4
        L_0x0136:
            java.lang.reflect.Method r4 = ia1.C98624g.f289174q     // Catch:{ Exception -> 0x019d }
            if (r4 == 0) goto L_0x0142
            r6 = 0
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x019d }
            java.lang.Object r0 = r4.invoke(r0, r12)     // Catch:{ Exception -> 0x019d }
            goto L_0x0143
        L_0x0142:
            r0 = 0
        L_0x0143:
            if (r0 != 0) goto L_0x0147
            goto L_0x01b4
        L_0x0147:
            java.lang.reflect.Field r4 = ia1.C98624g.f289175r     // Catch:{ Exception -> 0x019d }
            if (r4 == 0) goto L_0x0150
            java.lang.Object r0 = r4.get(r0)     // Catch:{ Exception -> 0x019d }
            goto L_0x0151
        L_0x0150:
            r0 = 0
        L_0x0151:
            if (r0 == 0) goto L_0x01b4
            java.lang.reflect.Field r4 = ia1.C98624g.f289176s     // Catch:{ Exception -> 0x019d }
            if (r4 == 0) goto L_0x015c
            java.lang.Object r4 = r4.get(r0)     // Catch:{ Exception -> 0x019d }
            goto L_0x015d
        L_0x015c:
            r4 = 0
        L_0x015d:
            boolean r6 = r4 instanceof java.lang.String     // Catch:{ Exception -> 0x019d }
            if (r6 == 0) goto L_0x0164
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x019d }
            goto L_0x0165
        L_0x0164:
            r4 = 0
        L_0x0165:
            if (r4 != 0) goto L_0x0168
            r4 = r14
        L_0x0168:
            r1.f293872f = r4     // Catch:{ Exception -> 0x019d }
            java.lang.reflect.Field r4 = ia1.C98624g.f289177t     // Catch:{ Exception -> 0x019d }
            if (r4 == 0) goto L_0x0173
            java.lang.Object r4 = r4.get(r0)     // Catch:{ Exception -> 0x019d }
            goto L_0x0174
        L_0x0173:
            r4 = 0
        L_0x0174:
            boolean r6 = r4 instanceof java.lang.String     // Catch:{ Exception -> 0x019d }
            if (r6 == 0) goto L_0x017b
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x019d }
            goto L_0x017c
        L_0x017b:
            r4 = 0
        L_0x017c:
            if (r4 != 0) goto L_0x0180
            r6 = r14
            goto L_0x0181
        L_0x0180:
            r6 = r4
        L_0x0181:
            r1.f293873g = r6     // Catch:{ Exception -> 0x019d }
            r1.f293869c = r6     // Catch:{ Exception -> 0x019d }
            java.lang.reflect.Field r6 = ia1.C98624g.f289178u     // Catch:{ Exception -> 0x019d }
            if (r6 == 0) goto L_0x018e
            java.lang.Object r0 = r6.get(r0)     // Catch:{ Exception -> 0x019d }
            goto L_0x018f
        L_0x018e:
            r0 = 0
        L_0x018f:
            boolean r6 = r0 instanceof java.lang.String     // Catch:{ Exception -> 0x019d }
            if (r6 == 0) goto L_0x0196
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x019d }
            goto L_0x0197
        L_0x0196:
            r0 = 0
        L_0x0197:
            r1.f293874h = r0     // Catch:{ Exception -> 0x019d }
            gy3.C87412m.m108589b(r4, r14)     // Catch:{ Exception -> 0x019d }
            goto L_0x01b4
        L_0x019d:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r10)
            java.lang.String r0 = r0.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
        L_0x01b4:
            te3.e74 r0 = r1.f293867a
            java.lang.String r0 = r0.f298179d
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x01ca
            te3.e74 r0 = r1.f293867a
            long r12 = r3.getItemIdAtPosition(r5)
            java.lang.String r4 = java.lang.String.valueOf(r12)
            r0.f298179d = r4
        L_0x01ca:
            te3.e74 r0 = r1.f293867a
            gy3.C87412m.m108593f(r2, r9)
            int r2 = r2.intValue()
            r0.f298180e = r2
            te3.e74 r0 = r1.f293867a
            gy3.C87412m.m108593f(r7, r8)
            int r2 = r7.intValue()
            r0.f298181f = r2
            te3.e74 r0 = r1.f293867a
            int r2 = ia1.C98624g.f289163f
            r0.f298182g = r2
            int r4 = ia1.C98624g.f289164g
            int r4 = r2 - r4
            r0.f298183h = r4
            int r6 = ia1.C98624g.f289165h
            r0.f298184i = r6
            int r7 = ia1.C98624g.f289166i
            if (r7 > 0) goto L_0x01f6
            r7 = 144(0x90, float:2.02E-43)
        L_0x01f6:
            r0.f298185j = r7
            r1.f293868b = r5
            int r6 = r6 + r7
            int r2 = r2 - r4
            int r4 = r0.f298180e
            int r0 = r0.f298181f
            int r0 = r0 + r4
            if (r4 < r2) goto L_0x0205
        L_0x0203:
            r0 = 0
            goto L_0x0209
        L_0x0205:
            if (r0 > r6) goto L_0x0208
            goto L_0x0203
        L_0x0208:
            r0 = 1
        L_0x0209:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            op3.b r0 = op3.C117882j.m166284c(r1, r0)
        L_0x0211:
            if (r0 != 0) goto L_0x021b
            r6 = r22
            r5 = r19
            r4 = r20
            goto L_0x029d
        L_0x021b:
            r1 = 0
            java.lang.Object r2 = r0.mo182596a(r1)
            o91.f r2 = (o91.C100313f) r2
            r1 = 1
            java.lang.Object r0 = r0.mo182596a(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r4 = r20
            gy3.C87412m.m108593f(r0, r4)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x026e
            java.util.HashMap<java.lang.String, o91.f> r0 = ia1.C98624g.f289160c
            te3.e74 r1 = r2.f293867a
            java.lang.String r1 = r1.f298179d
            boolean r1 = r0.containsKey(r1)
            if (r1 != 0) goto L_0x0269
            te3.e74 r1 = r2.f293867a
            java.lang.String r1 = r1.f298179d
            r5 = r19
            gy3.C87412m.m108593f(r1, r5)
            r0.put(r1, r2)
            java.util.ArrayList<ia1.b> r0 = ia1.C98624g.f289159b
            java.util.Iterator r0 = r0.iterator()
        L_0x0252:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0266
            java.lang.Object r1 = r0.next()
            ia1.b r1 = (ia1.C98619b) r1
            r6 = r22
            r7 = r23
            r1.mo74775b(r6, r2, r7)
            goto L_0x0252
        L_0x0266:
            r6 = r22
            goto L_0x029d
        L_0x0269:
            r6 = r22
            r5 = r19
            goto L_0x029d
        L_0x026e:
            r6 = r22
            r7 = r23
            r5 = r19
            java.util.HashMap<java.lang.String, o91.f> r0 = ia1.C98624g.f289160c
            te3.e74 r1 = r2.f293867a
            java.lang.String r1 = r1.f298179d
            boolean r1 = r0.containsKey(r1)
            if (r1 == 0) goto L_0x029d
            te3.e74 r1 = r2.f293867a
            java.lang.String r1 = r1.f298179d
            r0.remove(r1)
            java.util.ArrayList<ia1.b> r0 = ia1.C98624g.f289159b
            java.util.Iterator r0 = r0.iterator()
        L_0x028d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x029d
            java.lang.Object r1 = r0.next()
            ia1.b r1 = (ia1.C98619b) r1
            r1.mo74774a(r6, r2, r7)
            goto L_0x028d
        L_0x029d:
            int r7 = r18 + -1
            r13 = r4
            r12 = r5
            r1 = r6
            r2 = r17
            r4 = -1
            r5 = 1
            goto L_0x004b
        L_0x02a8:
            r5 = r12
            r4 = r13
            boolean r2 = r0 instanceof androidx.recyclerview.widget.RecyclerView
            if (r2 == 0) goto L_0x0551
            boolean r2 = r1 instanceof androidx.recyclerview.widget.RecyclerView.C16613e
            if (r2 == 0) goto L_0x0551
            ia1.g r2 = ia1.C98624g.f289158a
            r3 = r0
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            androidx.recyclerview.widget.RecyclerView$e r1 = (androidx.recyclerview.widget.RecyclerView.C16613e) r1
            if (r3 != 0) goto L_0x02bd
            goto L_0x0551
        L_0x02bd:
            int r0 = ia1.C98624g.f289164g
            if (r0 > 0) goto L_0x02d0
            android.content.Context r0 = r3.getContext()
            boolean r6 = r0 instanceof androidx.appcompat.app.AppCompatActivity
            if (r6 == 0) goto L_0x02cc
            androidx.appcompat.app.AppCompatActivity r0 = (androidx.appcompat.app.AppCompatActivity) r0
            goto L_0x02cd
        L_0x02cc:
            r0 = 0
        L_0x02cd:
            r2.mo138055b(r0)
        L_0x02d0:
            if (r24 < 0) goto L_0x02d8
            if (r25 <= 0) goto L_0x02d8
            ia1.C98624g.f289161d = r24
            ia1.C98624g.f289162e = r25
        L_0x02d8:
            int r0 = ia1.C98624g.f289162e
            r6 = 1
            int r0 = r0 - r6
            r6 = r0
            r7 = -1
        L_0x02de:
            if (r7 >= r6) goto L_0x0551
            android.view.View r12 = r3.getChildAt(r6)
            if (r12 != 0) goto L_0x02f2
            r23 = r1
            r17 = r2
            r22 = r3
            r19 = r5
            r18 = r6
            goto L_0x04bd
        L_0x02f2:
            int r0 = ia1.C98624g.f289161d
            androidx.recyclerview.widget.RecyclerView$e r13 = r3.getAdapter()
            java.lang.String r7 = "null cannot be cast to non-null type com.tencent.mm.plugin.mvvmlist.MvvmRecyclerAdapter<*>"
            gy3.C87412m.m108592e(r13, r7)
            zb2.m r13 = (zb2.C103009m) r13
            int r7 = r0 + r6
            int r0 = r13.getItemCount()
            if (r7 < r0) goto L_0x0309
            goto L_0x0315
        L_0x0309:
            com.tencent.mm.plugin.mvvmlist.MvvmList<T> r0 = r13.f303959G
            java.util.ArrayList<T> r0 = r0.f272353o
            java.lang.Object r0 = sx3.C110818d0.m150917O(r0, r7)
            zb2.d r0 = (zb2.C103001d) r0
            if (r0 != 0) goto L_0x0324
        L_0x0315:
            r23 = r1
            r17 = r2
            r22 = r3
            r19 = r5
            r18 = r6
            r24 = r12
            r0 = 0
            goto L_0x04bb
        L_0x0324:
            op3.b r13 = r2.mo138054a(r12)
            r17 = r2
            r2 = 0
            java.lang.Object r18 = r13.mo182596a(r2)
            r2 = r18
            java.lang.Integer r2 = (java.lang.Integer) r2
            r22 = r3
            r3 = 1
            java.lang.Object r13 = r13.mo182596a(r3)
            java.lang.Integer r13 = (java.lang.Integer) r13
            o91.f r3 = new o91.f
            r3.<init>()
            r18 = r6
            te3.e74 r6 = new te3.e74
            r6.<init>()
            r3.f293867a = r6
            java.lang.reflect.Field r6 = ia1.C98624g.f289168k     // Catch:{ Exception -> 0x0367 }
            if (r6 == 0) goto L_0x0353
            java.lang.Object r0 = r6.get(r0)     // Catch:{ Exception -> 0x0367 }
            goto L_0x0354
        L_0x0353:
            r0 = 0
        L_0x0354:
            java.lang.reflect.Method r6 = ia1.C98624g.f289169l     // Catch:{ Exception -> 0x0367 }
            r23 = r1
            r24 = r12
            if (r6 == 0) goto L_0x0382
            r1 = 0
            java.lang.Object[] r12 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0365 }
            java.lang.Object r0 = r6.invoke(r0, r12)     // Catch:{ Exception -> 0x0365 }
            r1 = r0
            goto L_0x0383
        L_0x0365:
            r0 = move-exception
            goto L_0x036c
        L_0x0367:
            r0 = move-exception
            r23 = r1
            r24 = r12
        L_0x036c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
        L_0x0382:
            r1 = 0
        L_0x0383:
            java.lang.reflect.Method r0 = ia1.C98624g.f289170m     // Catch:{ Exception -> 0x03cf }
            if (r0 == 0) goto L_0x038f
            r6 = 0
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x03cf }
            java.lang.Object r0 = r0.invoke(r1, r12)     // Catch:{ Exception -> 0x03cf }
            goto L_0x0390
        L_0x038f:
            r0 = 0
        L_0x0390:
            te3.e74 r6 = r3.f293867a     // Catch:{ Exception -> 0x03cf }
            java.lang.reflect.Field r12 = ia1.C98624g.f289171n     // Catch:{ Exception -> 0x03cf }
            if (r12 == 0) goto L_0x039d
            java.lang.Object r12 = r12.get(r0)     // Catch:{ Exception -> 0x03cf }
            r19 = r5
            goto L_0x03a0
        L_0x039d:
            r19 = r5
            r12 = 0
        L_0x03a0:
            boolean r5 = r12 instanceof java.lang.String     // Catch:{ Exception -> 0x03cd }
            if (r5 == 0) goto L_0x03a7
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x03cd }
            goto L_0x03a8
        L_0x03a7:
            r12 = 0
        L_0x03a8:
            if (r12 != 0) goto L_0x03ab
            r12 = r14
        L_0x03ab:
            r6.f298179d = r12     // Catch:{ Exception -> 0x03cd }
            te3.e74 r5 = r3.f293867a     // Catch:{ Exception -> 0x03cd }
            java.lang.reflect.Field r6 = ia1.C98624g.f289172o     // Catch:{ Exception -> 0x03cd }
            if (r6 == 0) goto L_0x03b8
            java.lang.Object r0 = r6.get(r0)     // Catch:{ Exception -> 0x03cd }
            goto L_0x03b9
        L_0x03b8:
            r0 = 0
        L_0x03b9:
            boolean r6 = r0 instanceof java.lang.String     // Catch:{ Exception -> 0x03cd }
            if (r6 == 0) goto L_0x03c0
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x03cd }
            goto L_0x03c1
        L_0x03c0:
            r0 = 0
        L_0x03c1:
            if (r0 != 0) goto L_0x03c4
            r0 = r14
        L_0x03c4:
            r5.f298197y = r0     // Catch:{ Exception -> 0x03cd }
            te3.e74 r0 = r3.f293867a     // Catch:{ Exception -> 0x03cd }
            java.lang.String r0 = r0.f298197y     // Catch:{ Exception -> 0x03cd }
            r3.f293875i = r0     // Catch:{ Exception -> 0x03cd }
            goto L_0x03e8
        L_0x03cd:
            r0 = move-exception
            goto L_0x03d2
        L_0x03cf:
            r0 = move-exception
            r19 = r5
        L_0x03d2:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r11)
            java.lang.String r0 = r0.getMessage()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
        L_0x03e8:
            java.lang.reflect.Field r0 = ia1.C98624g.f289173p     // Catch:{ Exception -> 0x045d }
            if (r0 == 0) goto L_0x03f1
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x045d }
            goto L_0x03f2
        L_0x03f1:
            r0 = 0
        L_0x03f2:
            if (r0 != 0) goto L_0x03f6
            goto L_0x0474
        L_0x03f6:
            java.lang.reflect.Method r1 = ia1.C98624g.f289174q     // Catch:{ Exception -> 0x045d }
            if (r1 == 0) goto L_0x0402
            r5 = 0
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x045d }
            java.lang.Object r0 = r1.invoke(r0, r6)     // Catch:{ Exception -> 0x045d }
            goto L_0x0403
        L_0x0402:
            r0 = 0
        L_0x0403:
            if (r0 != 0) goto L_0x0407
            goto L_0x0474
        L_0x0407:
            java.lang.reflect.Field r1 = ia1.C98624g.f289175r     // Catch:{ Exception -> 0x045d }
            if (r1 == 0) goto L_0x0410
            java.lang.Object r0 = r1.get(r0)     // Catch:{ Exception -> 0x045d }
            goto L_0x0411
        L_0x0410:
            r0 = 0
        L_0x0411:
            if (r0 == 0) goto L_0x0474
            java.lang.reflect.Field r1 = ia1.C98624g.f289176s     // Catch:{ Exception -> 0x045d }
            if (r1 == 0) goto L_0x041c
            java.lang.Object r1 = r1.get(r0)     // Catch:{ Exception -> 0x045d }
            goto L_0x041d
        L_0x041c:
            r1 = 0
        L_0x041d:
            boolean r5 = r1 instanceof java.lang.String     // Catch:{ Exception -> 0x045d }
            if (r5 == 0) goto L_0x0424
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x045d }
            goto L_0x0425
        L_0x0424:
            r1 = 0
        L_0x0425:
            if (r1 != 0) goto L_0x0428
            r1 = r14
        L_0x0428:
            r3.f293872f = r1     // Catch:{ Exception -> 0x045d }
            java.lang.reflect.Field r1 = ia1.C98624g.f289177t     // Catch:{ Exception -> 0x045d }
            if (r1 == 0) goto L_0x0433
            java.lang.Object r1 = r1.get(r0)     // Catch:{ Exception -> 0x045d }
            goto L_0x0434
        L_0x0433:
            r1 = 0
        L_0x0434:
            boolean r5 = r1 instanceof java.lang.String     // Catch:{ Exception -> 0x045d }
            if (r5 == 0) goto L_0x043b
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x045d }
            goto L_0x043c
        L_0x043b:
            r1 = 0
        L_0x043c:
            if (r1 != 0) goto L_0x0440
            r5 = r14
            goto L_0x0441
        L_0x0440:
            r5 = r1
        L_0x0441:
            r3.f293873g = r5     // Catch:{ Exception -> 0x045d }
            r3.f293869c = r5     // Catch:{ Exception -> 0x045d }
            java.lang.reflect.Field r5 = ia1.C98624g.f289178u     // Catch:{ Exception -> 0x045d }
            if (r5 == 0) goto L_0x044e
            java.lang.Object r0 = r5.get(r0)     // Catch:{ Exception -> 0x045d }
            goto L_0x044f
        L_0x044e:
            r0 = 0
        L_0x044f:
            boolean r5 = r0 instanceof java.lang.String     // Catch:{ Exception -> 0x045d }
            if (r5 == 0) goto L_0x0456
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x045d }
            goto L_0x0457
        L_0x0456:
            r0 = 0
        L_0x0457:
            r3.f293874h = r0     // Catch:{ Exception -> 0x045d }
            gy3.C87412m.m108589b(r1, r14)     // Catch:{ Exception -> 0x045d }
            goto L_0x0474
        L_0x045d:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
        L_0x0474:
            te3.e74 r0 = r3.f293867a
            gy3.C87412m.m108593f(r2, r9)
            int r1 = r2.intValue()
            r0.f298180e = r1
            te3.e74 r0 = r3.f293867a
            gy3.C87412m.m108593f(r13, r8)
            int r1 = r13.intValue()
            r0.f298181f = r1
            te3.e74 r0 = r3.f293867a
            int r1 = ia1.C98624g.f289163f
            r0.f298182g = r1
            int r2 = ia1.C98624g.f289164g
            int r2 = r1 - r2
            r0.f298183h = r2
            int r5 = ia1.C98624g.f289165h
            r0.f298184i = r5
            int r6 = ia1.C98624g.f289166i
            if (r6 > 0) goto L_0x04a0
            r6 = 144(0x90, float:2.02E-43)
        L_0x04a0:
            r0.f298185j = r6
            r3.f293868b = r7
            int r5 = r5 + r6
            int r1 = r1 - r2
            int r2 = r0.f298180e
            int r0 = r0.f298181f
            int r0 = r0 + r2
            if (r2 < r1) goto L_0x04af
        L_0x04ad:
            r2 = 0
            goto L_0x04b3
        L_0x04af:
            if (r0 > r5) goto L_0x04b2
            goto L_0x04ad
        L_0x04b2:
            r2 = 1
        L_0x04b3:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            op3.b r0 = op3.C117882j.m166284c(r3, r0)
        L_0x04bb:
            if (r0 != 0) goto L_0x04c5
        L_0x04bd:
            r7 = r23
            r6 = r19
            r1 = 0
            r3 = 1
            goto L_0x0545
        L_0x04c5:
            r1 = 0
            java.lang.Object r2 = r0.mo182596a(r1)
            o91.f r2 = (o91.C100313f) r2
            r3 = 1
            java.lang.Object r0 = r0.mo182596a(r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            gy3.C87412m.m108593f(r0, r4)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0516
            java.util.HashMap<java.lang.String, o91.f> r0 = ia1.C98624g.f289160c
            te3.e74 r5 = r2.f293867a
            java.lang.String r5 = r5.f298179d
            boolean r5 = r0.containsKey(r5)
            if (r5 != 0) goto L_0x0511
            te3.e74 r5 = r2.f293867a
            java.lang.String r5 = r5.f298179d
            r6 = r19
            gy3.C87412m.m108593f(r5, r6)
            r0.put(r5, r2)
            java.util.ArrayList<ia1.b> r0 = ia1.C98624g.f289159b
            java.util.Iterator r0 = r0.iterator()
        L_0x04fa:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x050e
            java.lang.Object r5 = r0.next()
            ia1.b r5 = (ia1.C98619b) r5
            r7 = r23
            r12 = r24
            r5.mo74775b(r7, r2, r12)
            goto L_0x04fa
        L_0x050e:
            r7 = r23
            goto L_0x0545
        L_0x0511:
            r7 = r23
            r6 = r19
            goto L_0x0545
        L_0x0516:
            r7 = r23
            r12 = r24
            r6 = r19
            java.util.HashMap<java.lang.String, o91.f> r0 = ia1.C98624g.f289160c
            te3.e74 r5 = r2.f293867a
            java.lang.String r5 = r5.f298179d
            boolean r5 = r0.containsKey(r5)
            if (r5 == 0) goto L_0x0545
            te3.e74 r5 = r2.f293867a
            java.lang.String r5 = r5.f298179d
            r0.remove(r5)
            java.util.ArrayList<ia1.b> r0 = ia1.C98624g.f289159b
            java.util.Iterator r0 = r0.iterator()
        L_0x0535:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0545
            java.lang.Object r5 = r0.next()
            ia1.b r5 = (ia1.C98619b) r5
            r5.mo74774a(r7, r2, r12)
            goto L_0x0535
        L_0x0545:
            int r0 = r18 + -1
            r3 = r22
            r5 = r6
            r1 = r7
            r2 = r17
            r7 = -1
            r6 = r0
            goto L_0x02de
        L_0x0551:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p686sq.C101694b.mo89152kT(android.view.View, java.lang.Object, int, int):void");
    }

    public void pn0(C98619b bVar) {
        C98624g gVar = C98624g.f289158a;
        C98624g.f289161d = -1;
        C98624g.f289162e = -1;
        C98624g.f289160c.clear();
        if (bVar != null) {
            C98624g.f289159b.remove(bVar);
        }
    }

    /* renamed from: w6 */
    public void mo89154w6() {
        C98620c cVar;
        C98621f fVar = C98625h.m128225a().f289182f;
        if (fVar != null && (cVar = fVar.f289150c) != null) {
            Log.m105924i("HABBYGE-MALI.SnsMonitor", "SnsMonitor, improveDataUICRefresh");
            C100312d dVar = C98625h.this.f289181e;
            if (dVar != null) {
                dVar.mo139592n(false);
            }
        }
    }
}
