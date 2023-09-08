package cm1;

import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import bl3.C0317e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C7832m3;
import fy3.C32224a;
import fy3.C32227p;
import go3.C76003c;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import pe1.C35464c;
import te3.C48996cf1;
import te3.C49138df1;
import te3.C49839if1;
import up1.C37521f;
import wp1.C15587j;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66217g;
import y04.C15925h;
import y04.C66483g;
import z04.C112551y;
import z04.C66716g;
import z04.C66723k;

/* renamed from: cm1.t2 */
public final class C0777t2 extends C0317e {

    /* renamed from: d */
    public boolean f1820d;

    /* renamed from: e */
    public int f1821e;

    /* renamed from: f */
    public int f1822f;

    /* renamed from: g */
    public int f1823g;

    /* renamed from: h */
    public Context f1824h;

    /* renamed from: i */
    public C53973z1 f1825i;

    /* renamed from: cm1.t2$a */
    public static final class C0778a {

        /* renamed from: a */
        public final int f1826a;

        /* renamed from: b */
        public final int f1827b;

        /* renamed from: c */
        public final int f1828c;

        public C0778a(int i, int i2, int i3) {
            this.f1826a = i;
            this.f1827b = i2;
            this.f1828c = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0778a)) {
                return false;
            }
            C0778a aVar = (C0778a) obj;
            return this.f1826a == aVar.f1826a && this.f1827b == aVar.f1827b && this.f1828c == aVar.f1828c;
        }

        public int hashCode() {
            return (((this.f1826a * 31) + this.f1827b) * 31) + this.f1828c;
        }

        public String toString() {
            return "DynamicIconInfo(iconName=" + this.f1826a + ", iconNodeStartPos=" + this.f1827b + ", iconNodeEndPos=" + this.f1828c + ')';
        }
    }

    /* renamed from: cm1.t2$b */
    public interface C0779b {
        /* renamed from: a */
        void mo723a(List<? extends Drawable> list);
    }

    /* renamed from: cm1.t2$c */
    public static final class C0780c implements C7832m3.C7833a {

        /* renamed from: a */
        public final /* synthetic */ C0777t2 f1829a;

        /* renamed from: b */
        public final /* synthetic */ TextView f1830b;

        public C0780c(C0777t2 t2Var, TextView textView) {
            this.f1829a = t2Var;
            this.f1830b = textView;
        }

        /* renamed from: a */
        public void mo724a(boolean z, SpannableStringBuilder spannableStringBuilder) {
            Log.m105924i("Finder.SyncGetImageModel", "onGetDescText type match isNeedRefresh:" + z + ' ' + spannableStringBuilder + " pos:" + this.f1829a.f1823g + " hashCode:" + hashCode());
            if (z && spannableStringBuilder != null) {
                this.f1830b.setText(spannableStringBuilder);
            }
        }
    }

    /* renamed from: cm1.t2$d */
    public static final class C0781d extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C0781d f1831d = new C0781d();

        public C0781d() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return "setTextDesc fail";
        }
    }

    /* renamed from: c3 */
    public static final C49839if1 m720c3(C0777t2 t2Var, C49839if1 if12) {
        LinkedList<C49138df1> linkedList;
        t2Var.getClass();
        C37521f.f99374d.getClass();
        C35464c<Integer> cVar = C37521f.f99246O2;
        if (cVar.mo60266n().intValue() == 1) {
            if (if12 == null || (linkedList = if12.f135276v) == null) {
                return if12;
            }
            linkedList.clear();
            return if12;
        } else if (cVar.mo60266n().intValue() == 2) {
            return null;
        } else {
            return if12;
        }
    }

    /* renamed from: i3 */
    public static C53973z1 m721i3(C0777t2 t2Var, C66212f fVar, C53934p0 p0Var, C32227p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = C66217g.f190253d;
        }
        if ((i & 2) != 0) {
            p0Var = C53934p0.DEFAULT;
        }
        return C53895h.m60465c(t2Var.getMainScope(), fVar, p0Var, pVar);
    }

    /* renamed from: d3 */
    public final SpannableStringBuilder mo715d3(int i, Context context, CharSequence charSequence, List<C0778a> list, List<? extends Drawable> list2) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(charSequence, "dynamicDesc");
        StringBuilder sb = new StringBuilder(charSequence);
        sb.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb);
        if (!(list == null || list2 == null)) {
            int size = list2.size();
            for (int i2 = 0; i2 < size; i2++) {
                Drawable drawable = (Drawable) list2.get(i2);
                if (drawable == null) {
                    drawable = mo718g3(context, (C48996cf1) null, this.f1820d, this.f1821e, this.f1822f, false);
                }
                spannableStringBuilder.setSpan(new C76003c(drawable, 1), list.get(i2).f1827b, list.get(i2).f1828c + 1, 17);
            }
        }
        return spannableStringBuilder;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        r5 = r5.f135263f;
     */
    /* renamed from: e3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo716e3(te3.C49839if1 r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            r0 = 1
            java.lang.String r1 = ""
            if (r6 == r0) goto L_0x0032
            r2 = 2
            java.lang.String r3 = "$$"
            if (r6 == r2) goto L_0x0025
            r7 = 3
            if (r6 == r7) goto L_0x001e
            r7 = 5
            if (r6 == r7) goto L_0x0011
            goto L_0x0036
        L_0x0011:
            java.lang.String r5 = r5.f135263f
            if (r5 == 0) goto L_0x0036
            java.lang.String r6 = java.lang.String.valueOf(r8)
            java.lang.String r1 = z04.C112551y.m153814n(r5, r3, r6, r0)
            goto L_0x0036
        L_0x001e:
            java.lang.String r5 = r5.f135264g
            if (r5 != 0) goto L_0x0023
            goto L_0x0036
        L_0x0023:
            r1 = r5
            goto L_0x0036
        L_0x0025:
            java.lang.String r5 = r5.f135263f
            if (r5 == 0) goto L_0x0036
            java.lang.String r6 = java.lang.String.valueOf(r7)
            java.lang.String r1 = z04.C112551y.m153814n(r5, r3, r6, r0)
            goto L_0x0036
        L_0x0032:
            java.lang.String r5 = r5.f135262e
            if (r5 != 0) goto L_0x0023
        L_0x0036:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cm1.C0777t2.mo716e3(te3.if1, int, int, int):java.lang.String");
    }

    /* renamed from: f3 */
    public final Object mo717f3(C49839if1 if12, Context context, String str, C49839if1 if13, int i, int i2, int i3, C7832m3.C7833a aVar) {
        CharSequence charSequence;
        T t;
        boolean z;
        String str2 = str;
        C49839if1 if14 = if13;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        Iterator<C49138df1> it = if12.f135276v.iterator();
        while (it.hasNext()) {
            C49138df1 next = it.next();
            if (next.f132282d == i6) {
                int i7 = next.f132283e;
                if (i7 == 0) {
                    return mo716e3(if14, i6, i4, i5);
                }
                if (i7 == 1) {
                    Log.m105924i("Finder.SyncGetImageModel", "item.type:" + next.f132283e + "  ConstantsFinder.FinderObjectDynamicConfig.DynamicItemType.TEXT:1");
                    return String.valueOf(next.f132284f);
                } else if (i7 != 2) {
                    return mo716e3(if14, i6, i4, i5);
                } else {
                    Log.m105924i("Finder.SyncGetImageModel", "item.type:" + next.f132283e + "  ConstantsFinder.FinderObjectDynamicConfig.DynamicItemType.RICH_TEXT:2");
                    if (i6 == 5) {
                        i4 = i5;
                    }
                    String str3 = next.f132285g;
                    String n = str3 != null ? C112551y.m153814n(str3, "$$", String.valueOf(i4), true) : "";
                    int i8 = next.f132282d;
                    if (n instanceof SpannableString) {
                        charSequence = i8 == 2 ? new SpannableStringBuilder(str2).append(n) : new SpannableStringBuilder(str2).append(' ').append(n);
                        C87412m.m108593f(charSequence, "{\n            when (name…}\n            }\n        }");
                    } else if (i8 == 2) {
                        charSequence = str2 + n;
                    } else {
                        charSequence = str2 + ' ' + n;
                    }
                    CharSequence charSequence2 = charSequence;
                    C15925h b = C66723k.m78722b(new C66723k("<\\s*(?<name>\\w+)\\s*(?<attribute>\\w+)\\s*=\\s*(?<id>\\d+)\\s*/>"), charSequence2, 0, 2, (Object) null);
                    ArrayList arrayList = new ArrayList();
                    C66483g.C66484a aVar2 = new C66483g.C66484a((C66483g) b);
                    while (aVar2.hasNext()) {
                        C66716g gVar = (C66716g) aVar2.next();
                        Log.m105924i("Finder.SyncGetImageModel", gVar.getValue() + "  " + gVar.mo90753c());
                        if (gVar.mo90752b().size() == 4) {
                            arrayList.add(new C0778a(Integer.parseInt(gVar.mo90752b().get(3)), gVar.mo90753c().f175174d, gVar.mo90753c().f175175e));
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        int size = arrayList.size();
                        int i9 = 0;
                        while (i9 < size) {
                            int i15 = i9;
                            int i16 = size;
                            ArrayList arrayList4 = arrayList3;
                            arrayList2.add(mo718g3(context, (C48996cf1) null, false, 0, -1, true));
                            int i17 = ((C0778a) arrayList.get(i15)).f1826a;
                            Iterator<T> it4 = C15587j.f42217c.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    t = null;
                                    break;
                                }
                                t = it4.next();
                                if (((C48996cf1) t).f131693d == i17) {
                                    z = true;
                                    continue;
                                } else {
                                    z = false;
                                    continue;
                                }
                                if (z) {
                                    break;
                                }
                            }
                            C48996cf1 cf12 = (C48996cf1) t;
                            if (C85875k4.m106211z()) {
                                if (!(cf12 == null || (r0 = cf12.f131695f) == null)) {
                                    arrayList4.add(r0);
                                    i9 = i15 + 1;
                                    arrayList3 = arrayList4;
                                    size = i16;
                                }
                            } else if (!(cf12 == null || (r0 = cf12.f131694e) == null)) {
                                arrayList4.add(r0);
                                i9 = i15 + 1;
                                arrayList3 = arrayList4;
                                size = i16;
                            }
                            String str4 = "";
                            arrayList4.add(str4);
                            i9 = i15 + 1;
                            arrayList3 = arrayList4;
                            size = i16;
                        }
                        SpannableStringBuilder d3 = mo715d3(i2, context, charSequence2, arrayList, arrayList2);
                        C0317e.launch$default(this, (C66212f) null, (C53934p0) null, new C0801z2(arrayList3, this, context, new C0785u2(this, i2, context, charSequence2, arrayList, aVar), (C15601d<? super C0801z2>) null), 3, (Object) null);
                        return d3;
                    }
                    aVar.mo724a(false, (SpannableStringBuilder) null);
                    return mo715d3(i2, context, charSequence2, arrayList, (List<? extends Drawable>) null);
                }
            } else {
                C7832m3.C7833a aVar3 = aVar;
            }
        }
        return null;
    }

    /* renamed from: g3 */
    public final Drawable mo718g3(Context context, C48996cf1 cf12, boolean z, int i, int i2, boolean z2) {
        Drawable drawable;
        C87412m.m108594g(context, "context");
        if (z2) {
            drawable = new ColorDrawable(0);
        } else {
            int i3 = z ? C0966R.raw.icons_filled_fire : C0966R.raw.icons_outlined_fire;
            int i4 = this.f1821e;
            if (i4 == 0) {
                i4 = context.getResources().getColor(C0966R.color.BW_100_Alpha_0_8);
            }
            drawable = C74933u4.m89768e(context, i3, i4);
        }
        int i5 = this.f1822f;
        if (i5 == -1) {
            C7832m3.f26372a.getClass();
            i5 = C7832m3.f26378g;
        }
        drawable.setBounds(0, 0, i5, i5);
        return drawable;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* renamed from: j3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo719j3(android.widget.TextView r26, android.content.Context r27, java.lang.String r28, boolean r29, int r30, int r31, te3.C49839if1 r32, boolean r33, int r34, boolean r35) {
        /*
            r25 = this;
            r10 = r25
            r11 = r27
            r12 = r30
            r13 = r31
            r14 = r32
            r15 = r34
            r9 = 0
            if (r14 == 0) goto L_0x006a
            java.util.LinkedList<te3.df1> r0 = r14.f135276v
            if (r0 == 0) goto L_0x0018
            int r0 = r0.size()
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            if (r0 <= 0) goto L_0x0062
            cm1.t2$c r0 = new cm1.t2$c     // Catch:{ Exception -> 0x003b }
            r1 = r26
            r0.<init>(r10, r1)     // Catch:{ Exception -> 0x003b }
            r1 = r25
            r2 = r32
            r3 = r27
            r4 = r28
            r5 = r32
            r6 = r30
            r7 = r31
            r8 = r34
            r11 = 0
            r9 = r0
            java.lang.Object r0 = r1.mo717f3(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0039 }
            goto L_0x0067
        L_0x0039:
            r0 = move-exception
            goto L_0x003d
        L_0x003b:
            r0 = move-exception
            r11 = 0
        L_0x003d:
            java.lang.Object[] r1 = new java.lang.Object[r11]
            java.lang.String r2 = "Finder.SyncGetImageModel"
            java.lang.String r3 = "setTextDesc"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r1)
            ft1.a r16 = ft1.C59319a.f169618b
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            cm1.t2$d r22 = cm1.C0777t2.C0781d.f1831d
            r23 = 28
            r24 = 0
            java.lang.String r17 = "setTextDesc"
            o40.C11348f.C11349a.m11178b(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.String r0 = r10.mo716e3(r14, r15, r12, r13)
            goto L_0x0067
        L_0x0062:
            r11 = 0
            java.lang.String r0 = r10.mo716e3(r14, r15, r12, r13)
        L_0x0067:
            if (r0 != 0) goto L_0x019d
            goto L_0x006b
        L_0x006a:
            r11 = 0
        L_0x006b:
            r0 = 2131755982(0x7f1003ce, float:1.9142859E38)
            r1 = 2131165324(0x7f07008c, float:1.7944862E38)
            java.lang.String r2 = ""
            r3 = 1
            r4 = 2131099682(0x7f060022, float:1.7811724E38)
            r5 = 2131100935(0x7f060507, float:1.7814265E38)
            if (r15 == r3) goto L_0x015b
            r6 = 2
            java.lang.String r7 = "{\n                contex…          )\n            }"
            r8 = 2131829710(0x7f1123ce, float:1.9292397E38)
            if (r15 == r6) goto L_0x0101
            r6 = 3
            if (r15 == r6) goto L_0x00eb
            r6 = 5
            if (r15 == r6) goto L_0x008d
            goto L_0x019c
        L_0x008d:
            if (r29 != 0) goto L_0x00d7
            android.content.res.Resources r2 = r27.getResources()
            float r1 = r2.getDimension(r1)
            int r1 = (int) r1
            er1.w3 r2 = er1.C58784w3.f168295a
            java.lang.Integer r6 = r2.mo83917b0(r3, r3)
            if (r6 == 0) goto L_0x00a4
            int r0 = r6.intValue()
        L_0x00a4:
            r6 = 2131829716(0x7f1123d4, float:1.9292409E38)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r7 = java.lang.String.valueOf(r31)
            r3[r11] = r7
            r9 = r27
            java.lang.String r3 = r9.getString(r6, r3)
            java.lang.String r6 = "context.getString(R.stri…c, (incCount).toString())"
            gy3.C87412m.m108593f(r3, r6)
            r6 = 35
            if (r35 == 0) goto L_0x00c1
            r5 = 2131099682(0x7f060022, float:1.7811724E38)
        L_0x00c1:
            r28 = r2
            r29 = r27
            r30 = r3
            r31 = r6
            r32 = r0
            r33 = r5
            r34 = r1
            r35 = r1
            java.lang.CharSequence r0 = r28.mo83957q1(r29, r30, r31, r32, r33, r34, r35)
            goto L_0x019d
        L_0x00d7:
            r9 = r27
            r6 = 0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r1 = java.lang.String.valueOf(r30)
            r0[r6] = r1
            java.lang.String r0 = r9.getString(r8, r0)
            gy3.C87412m.m108593f(r0, r7)
            goto L_0x019d
        L_0x00eb:
            r9 = r27
            r6 = 0
            r0 = 2131826871(0x7f1118b7, float:1.9286639E38)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r6] = r2
            java.lang.String r0 = r9.getString(r0, r1)
            java.lang.String r1 = "{\n            context.ge…_count_tip, \"\")\n        }"
            gy3.C87412m.m108593f(r0, r1)
            goto L_0x019d
        L_0x0101:
            r9 = r27
            r6 = 0
            if (r29 != 0) goto L_0x014b
            android.content.res.Resources r2 = r27.getResources()
            float r1 = r2.getDimension(r1)
            int r1 = (int) r1
            er1.w3 r2 = er1.C58784w3.f168295a
            java.lang.Integer r7 = r2.mo83917b0(r3, r3)
            if (r7 == 0) goto L_0x011b
            int r0 = r7.intValue()
        L_0x011b:
            r7 = 2131829705(0x7f1123c9, float:1.9292387E38)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r8 = java.lang.String.valueOf(r30)
            r3[r6] = r8
            java.lang.String r3 = r9.getString(r7, r3)
            java.lang.String r6 = "context.getString(R.stri…_new, (count).toString())"
            gy3.C87412m.m108593f(r3, r6)
            r6 = 35
            if (r35 == 0) goto L_0x0136
            r5 = 2131099682(0x7f060022, float:1.7811724E38)
        L_0x0136:
            r28 = r2
            r29 = r27
            r30 = r3
            r31 = r6
            r32 = r0
            r33 = r5
            r34 = r1
            r35 = r1
            java.lang.CharSequence r0 = r28.mo83957q1(r29, r30, r31, r32, r33, r34, r35)
            goto L_0x019d
        L_0x014b:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r1 = java.lang.String.valueOf(r30)
            r0[r6] = r1
            java.lang.String r0 = r9.getString(r8, r0)
            gy3.C87412m.m108593f(r0, r7)
            goto L_0x019d
        L_0x015b:
            r9 = r27
            if (r29 != 0) goto L_0x019c
            android.content.res.Resources r2 = r27.getResources()
            float r1 = r2.getDimension(r1)
            int r1 = (int) r1
            er1.w3 r2 = er1.C58784w3.f168295a
            java.lang.Integer r3 = r2.mo83917b0(r3, r3)
            if (r3 == 0) goto L_0x0174
            int r0 = r3.intValue()
        L_0x0174:
            r3 = 2131829708(0x7f1123cc, float:1.9292393E38)
            java.lang.String r3 = r9.getString(r3)
            java.lang.String r6 = "context.getString(R.stri…name_recommend_desc2_new)"
            gy3.C87412m.m108593f(r3, r6)
            r6 = 35
            if (r35 == 0) goto L_0x0187
            r5 = 2131099682(0x7f060022, float:1.7811724E38)
        L_0x0187:
            r28 = r2
            r29 = r27
            r30 = r3
            r31 = r6
            r32 = r0
            r33 = r5
            r34 = r1
            r35 = r1
            java.lang.CharSequence r0 = r28.mo83957q1(r29, r30, r31, r32, r33, r34, r35)
            goto L_0x019d
        L_0x019c:
            r0 = r2
        L_0x019d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cm1.C0777t2.mo719j3(android.widget.TextView, android.content.Context, java.lang.String, boolean, int, int, te3.if1, boolean, int, boolean):java.lang.Object");
    }
}
