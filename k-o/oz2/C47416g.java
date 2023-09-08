package oz2;

import ac2.C39534d;
import ac2.C53996a;
import ac2.C53998c;
import android.content.Context;
import az2.C39674e;
import c14.C54637q;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import d14.C45252f;
import d14.C58057l;
import gy3.C8480h;
import gy3.C87412m;
import if0.C46238a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import p773yy.C66710j;
import rz2.C48200b;
import rz2.C48201c;
import su0.C13781a;
import sz2.C48518b;
import ux3.C65486b;
import uz2.C52676d1;
import uz2.C52678e0;
import vz2.C78501d;

/* renamed from: oz2.g */
public final class C47416g extends C53996a<C48518b> {

    /* renamed from: g */
    public static final C47417a f127202g = new C47417a((C8480h) null);

    /* renamed from: d */
    public final Context f127203d;

    /* renamed from: e */
    public final int f127204e;

    /* renamed from: f */
    public final long f127205f;

    /* renamed from: oz2.g$a */
    public static final class C47417a {

        /* renamed from: oz2.g$a$a */
        public static final class C47418a<T> implements Comparator {
            public final int compare(T t, T t2) {
                return C65486b.m77169a(Integer.valueOf(((C48201c) t2).field_CreateTime), Integer.valueOf(((C48201c) t).field_CreateTime));
            }
        }

        public C47417a(C8480h hVar) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x002e, code lost:
            r1 = az2.C39674e.f106452d.mo62253n0(su0.C13781a.m13082a());
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List<sz2.C48518b> mo72449a(android.content.Context r11) {
            /*
                r10 = this;
                java.lang.String r0 = "context"
                gy3.C87412m.m108594g(r11, r0)
                bl3.r r0 = bl3.C39818r.f106831a
                bl3.r$a r11 = r0.mo62443b(r11)
                java.lang.Class<yz2.f2> r0 = yz2.C53673f2.class
                androidx.lifecycle.i0 r11 = r11.mo75002a(r0)
                java.lang.String r0 = "UICProvider.of(context).…pPageDataUIC::class.java)"
                gy3.C87412m.m108593f(r11, r0)
                yz2.f2 r11 = (yz2.C53673f2) r11
                java.util.ArrayList<java.lang.Object> r0 = r11.f150746d
                r0.clear()
                java.util.LinkedList r0 = new java.util.LinkedList
                r0.<init>()
                b03.c r1 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
                boolean r1 = r1.mo62279I()
                r2 = 0
                if (r1 == 0) goto L_0x002e
                goto L_0x003f
            L_0x002e:
                az2.e r1 = az2.C39674e.f106452d
                java.lang.String r3 = su0.C13781a.m13082a()
                rz2.c r1 = r1.mo62253n0(r3)
                if (r1 == 0) goto L_0x003f
                java.lang.String r1 = rz2.C48200b.m53529b(r1)
                goto L_0x0040
            L_0x003f:
                r1 = r2
            L_0x0040:
                az2.e r3 = az2.C39674e.f106452d
                java.lang.String r4 = su0.C13781a.m13082a()
                rz2.c r4 = r3.mo62253n0(r4)
                java.text.SimpleDateFormat r5 = qy2.C77448f0.f225876a
                rz2.h r5 = r3.mo62255t0()
                r6 = 1
                r7 = 0
                if (r4 == 0) goto L_0x0059
                uz2.e0 r4 = p773yy.C66710j.C53637a.m60171a(r4, r7, r6, r2)
                goto L_0x005a
            L_0x0059:
                r4 = r2
            L_0x005a:
                java.lang.String[] r6 = new java.lang.String[r6]
                java.lang.String r8 = su0.C13781a.m13082a()
                java.lang.String r9 = "username()"
                gy3.C87412m.m108593f(r8, r9)
                r6[r7] = r8
                java.util.ArrayList r6 = sx3.C64197v.m75534c(r6)
                java.util.List r4 = r5.mo72967bD(r4, r6)
                oz2.g$a$a r5 = new oz2.g$a$a
                r5.<init>()
                java.util.List r4 = sx3.C110818d0.m150943o0(r4, r5)
                java.lang.String r5 = su0.C13781a.m13082a()
                rz2.c r5 = r3.mo62253n0(r5)
                if (r5 == 0) goto L_0x0093
                java.lang.String r5 = rz2.C48200b.m53529b(r5)
                if (r5 == 0) goto L_0x0093
                rz2.h$b r6 = new rz2.h$b
                java.util.List r4 = sx3.C110818d0.m150900B0(r4)
                r6.<init>(r5, r4)
                goto L_0x0094
            L_0x0093:
                r6 = r2
            L_0x0094:
                b03.c r4 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
                boolean r4 = r4.mo62279I()
                if (r4 != 0) goto L_0x00a3
                if (r6 == 0) goto L_0x00a3
                r0.add(r7, r6)
            L_0x00a3:
                b03.c r4 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
                boolean r4 = r4.mo62279I()
                if (r4 == 0) goto L_0x00ba
                rz2.h r1 = r3.mo62255t0()
                java.lang.String r3 = su0.C13781a.m13082a()
                java.util.List r1 = r1.mo72964SE(r2, r3)
                goto L_0x00c6
            L_0x00ba:
                rz2.h r2 = r3.mo62255t0()
                java.lang.String r3 = su0.C13781a.m13082a()
                java.util.List r1 = r2.mo72964SE(r1, r3)
            L_0x00c6:
                r0.addAll(r1)
                java.util.Iterator r0 = r0.iterator()
            L_0x00cd:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0121
                java.lang.Object r1 = r0.next()
                rz2.h$b r1 = (rz2.C48206h.C48208b) r1
                java.util.List<rz2.c> r2 = r1.f129193b
                int r2 = r2.size()
                if (r2 > 0) goto L_0x00e3
                r2 = 0
                goto L_0x00f3
            L_0x00e3:
                java.util.List<rz2.c> r2 = r1.f129193b
                java.lang.Object r2 = r2.get(r7)
                rz2.c r2 = (rz2.C48201c) r2
                b03.c r3 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
                boolean r2 = r3.mo62314z(r2)
            L_0x00f3:
                if (r2 == 0) goto L_0x00cd
                java.util.LinkedList r2 = new java.util.LinkedList
                r2.<init>()
                java.util.List<rz2.c> r3 = r1.f129193b
                java.util.Iterator r3 = r3.iterator()
            L_0x0100:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L_0x0114
                java.lang.Object r4 = r3.next()
                rz2.c r4 = (rz2.C48201c) r4
                rz2.c r4 = r4.mo72943l2()
                r2.add(r4)
                goto L_0x0100
            L_0x0114:
                r1.f129193b = r2
                java.util.ArrayList<java.lang.Object> r2 = r11.f150746d
                sz2.b r3 = new sz2.b
                r3.<init>(r1)
                r2.add(r3)
                goto L_0x00cd
            L_0x0121:
                java.util.LinkedList r0 = new java.util.LinkedList
                r0.<init>()
                java.util.ArrayList<java.lang.Object> r11 = r11.f150746d
                java.util.Iterator r11 = r11.iterator()
            L_0x012c:
                boolean r1 = r11.hasNext()
                if (r1 == 0) goto L_0x0141
                java.lang.Object r1 = r11.next()
                java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.model.topic.SameTopicFriendsItem"
                gy3.C87412m.m108592e(r1, r2)
                sz2.b r1 = (sz2.C48518b) r1
                r0.add(r1)
                goto L_0x012c
            L_0x0141:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: oz2.C47416g.C47417a.mo72449a(android.content.Context):java.util.List");
        }
    }

    public C47416g(Context context, String str, int i, long j) {
        C87412m.m108594g(context, "context");
        this.f127203d = context;
        this.f127204e = i;
        this.f127205f = j;
    }

    /* renamed from: b */
    public C45252f<C39534d<C48518b>> mo70650e(LifecycleScope lifecycleScope, C53998c<C48518b> cVar) {
        String str;
        String str2;
        String str3;
        C53998c<C48518b> cVar2 = cVar;
        C87412m.m108594g(lifecycleScope, "scope");
        C87412m.m108594g(cVar2, "request");
        C39534d dVar = new C39534d(cVar2);
        C54637q qVar = new C54637q();
        List<C48518b> a = f127202g.mo72449a(this.f127203d);
        for (C48518b bVar : a) {
            ArrayList<T> arrayList = dVar.f106151b;
            C87412m.m108592e(bVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.model.topic.SameTopicFriendsItem");
            arrayList.add(bVar);
        }
        qVar.mo75539t(dVar);
        StringBuilder sb = new StringBuilder();
        Iterator<C48518b> it = a.iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            str = null;
            boolean z2 = true;
            if (!it.hasNext()) {
                break;
            }
            int i2 = i + 1;
            C48518b next = it.next();
            if (i != 0) {
                sb.append(";");
            }
            if (next.f129772d.f129193b.size() > 0) {
                C48201c cVar3 = next.f129772d.f129193b.get(0);
                if (cVar3.field_IconID.equals("userdefine")) {
                    str3 = C66710j.C53637a.m60171a(cVar3, false, 1, (Object) null).f147092i;
                    if (!(str3 == null || str3.length() == 0)) {
                        z2 = false;
                    }
                    if (!z2) {
                        C87412m.m108593f(str3, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                        Pattern compile = Pattern.compile("[#;]");
                        C87412m.m108593f(compile, "compile(pattern)");
                        str3 = compile.matcher(str3).replaceAll(" ");
                        C87412m.m108593f(str3, "nativePattern.matcher(in…).replaceAll(replacement)");
                    }
                } else {
                    str3 = cVar3.field_IconID;
                }
                sb.append(str3);
                sb.append("#");
                sb.append(next.f129772d.f129193b.size());
            }
            i = i2;
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "sb.toString()");
        JSONArray jSONArray = new JSONArray();
        for (C48518b bVar2 : a) {
            C52678e0 a2 = C66710j.C53637a.m60171a(bVar2.f129772d.f129193b.get(z ? 1 : 0), z, 1, str);
            C48201c n0 = C39674e.f106452d.mo62253n0(C13781a.m13082a());
            if (!C87412m.m108589b(C48200b.m53529b(bVar2.f129772d.f129193b.get(z)), n0 != null ? C48200b.m53529b(n0) : str)) {
                HashMap hashMap = new HashMap();
                for (C48201c cVar4 : bVar2.f129772d.f129193b) {
                    String str4 = cVar4.field_IconID;
                    if (hashMap.containsKey(str4)) {
                        Integer num = (Integer) hashMap.get(str4);
                        C87412m.m108593f(str4, "iconId");
                        hashMap.put(str4, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                    } else {
                        C87412m.m108593f(str4, "iconId");
                        hashMap.put(str4, 1);
                    }
                }
                HashSet hashSet = new HashSet();
                int i3 = 0;
                for (Map.Entry entry : hashMap.entrySet()) {
                    if (((Number) entry.getValue()).intValue() >= i3) {
                        i3 = ((Number) entry.getValue()).intValue();
                        hashSet.add(entry.getKey());
                    }
                }
                if (hashSet.size() != 1) {
                    Iterator<T> it4 = bVar2.f129772d.f129193b.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            str2 = C48200b.m53528a(bVar2.f129772d.f129193b.get(0));
                            break;
                        }
                        C48201c cVar5 = (C48201c) it4.next();
                        if (hashSet.contains(cVar5.field_IconID)) {
                            str2 = cVar5.field_IconID;
                            break;
                        }
                    }
                } else {
                    Iterator it5 = hashSet.iterator();
                    C87412m.m108593f(it5, "maxCountIconIdSet.iterator()");
                    str2 = it5.hasNext() ? (String) it5.next() : C48200b.m53528a(bVar2.f129772d.f129193b.get(0));
                }
            } else {
                str2 = n0.field_IconID;
            }
            JSONObject jSONObject = new JSONObject();
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "iconid", str2, false);
            C52676d1 j = IStatusIconHelperKt.m39109a().mo62298j(str2);
            aVar.mo71655d(jSONObject, "icontype", Integer.valueOf(j != null ? j.f147084g : 0), false);
            aVar.mo71655d(jSONObject, "uv", Integer.valueOf(bVar2.f129772d.f129193b.size()), false);
            aVar.mo71655d(jSONObject, "customtitle", IStatusIconHelperKt.m39109a().mo62301m(a2), false);
            jSONArray.put(jSONObject);
            z = false;
            str = null;
        }
        C78501d dVar2 = C78501d.f229945a;
        int i4 = this.f127204e;
        long j2 = this.f127205f;
        String jSONArray2 = jSONArray.toString();
        C87412m.m108593f(jSONArray2, "jsonArray.toString()");
        Pattern compile2 = Pattern.compile(",");
        C87412m.m108593f(compile2, "compile(pattern)");
        String replaceAll = compile2.matcher(jSONArray2).replaceAll(";");
        C87412m.m108593f(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        C78501d.m94807i(dVar2, 1, (String) null, 0, (String) null, sb4, (String) null, i4, 0, j2, (String) null, (Integer) null, replaceAll, 1710, (Object) null);
        return new C58057l(qVar);
    }
}
