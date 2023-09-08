package cw2;

import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.downloadservice.Downloads;
import gy3.C87412m;
import java.util.Iterator;
import java.util.List;
import o40.C61925b;
import sx3.C64197v;
import sx3.C77813z;

/* renamed from: cw2.c */
public final class C97383c {

    /* renamed from: a */
    public final String f285881a = "MicroMsg.GalleryMgr";

    /* renamed from: b */
    public final int f285882b = 314572800;

    /* renamed from: c */
    public final int f285883c = 100;

    /* renamed from: d */
    public boolean f285884d = true;

    /* renamed from: a */
    public static final void m125400a(C97383c cVar, String str, int i, int i2) {
        List<C86001b0> j;
        String str2;
        String str3;
        C61925b bVar;
        int i3;
        long j2;
        String str4;
        int i4;
        Iterator<T> it;
        String str5;
        Iterator<T> it4;
        int i5;
        int i6;
        C97383c cVar2 = cVar;
        String str6 = str;
        int i7 = i2;
        cVar.getClass();
        C61925b bVar2 = new C61925b("dumpCacheDir " + str6);
        String str7 = StoryCore.f281736t.mo134183a() + str6;
        Iterable<C86001b0> t = C86013q1.m106459t(str7, true);
        if (t != null && (j = C116299g2.m163854j(t)) != null) {
            if (j.size() > 1) {
                C77813z.m93909o(j, new C30928a());
            }
            long j3 = 0;
            for (C86001b0 b0Var : j) {
                j3 += b0Var != null ? b0Var.f250473c : 0;
            }
            long j4 = j3 > ((long) i) ? (long) (((double) j3) / 2.0d) : 0;
            int size = j.size();
            int i8 = size > i7 ? i7 - size : 0;
            Log.m105924i(cVar2.f285881a, "cleanCacheFiles cache " + str7 + "  sumSize:" + j3 + " targetSize:" + j4 + "  targetCount" + i8);
            Iterator<T> it5 = j.iterator();
            int i9 = 0;
            long j5 = 0;
            while (true) {
                str2 = " time: ";
                str3 = " filePath: ";
                bVar = bVar2;
                if (!it5.hasNext()) {
                    break;
                }
                T next = it5.next();
                int i15 = i9 + 1;
                if (i9 >= 0) {
                    C86001b0 b0Var2 = (C86001b0) next;
                    if (b0Var2 != null) {
                        it4 = it5;
                        if (cVar2.f285884d) {
                            C97391o oVar = C97391o.f285892a;
                            j2 = j3;
                            String str8 = b0Var2.f250472b;
                            C87412m.m108593f(str8, "fileEntry.name");
                            if (!oVar.mo136653f(str8)) {
                                long milliSecondsToNow = Util.milliSecondsToNow(b0Var2.f250475e);
                                C97387k.f285887a.mo136646a();
                                i3 = i8;
                                if (milliSecondsToNow <= ((long) Downloads.MAX_RETYR_AFTER)) {
                                    break;
                                }
                                Log.m105924i(cVar2.f285881a, "cleanCacheFiles1 " + i9 + str3 + b0Var2.f250472b + str2 + b0Var2.f250475e + " size: " + Util.getSizeKB(b0Var2.f250473c));
                                long j6 = b0Var2.f250473c;
                                j5 += j6;
                                j4 -= j6;
                                i6 = i3 + -1;
                                C86013q1.m106447h(b0Var2.f250471a);
                                it5 = it4;
                                bVar2 = bVar;
                                i9 = i15;
                                j3 = j2;
                            } else {
                                i5 = i8;
                            }
                        } else {
                            break;
                        }
                    } else {
                        it4 = it5;
                        i5 = i8;
                        j2 = j3;
                    }
                    i6 = i5;
                    it5 = it4;
                    bVar2 = bVar;
                    i9 = i15;
                    j3 = j2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            i3 = i8;
            j2 = j3;
            if (j4 > 0 || i3 > 0) {
                Iterator<T> it6 = j.iterator();
                int i16 = i3;
                int i17 = 0;
                while (it6.hasNext()) {
                    T next2 = it6.next();
                    int i18 = i17 + 1;
                    if (i17 >= 0) {
                        C86001b0 b0Var3 = (C86001b0) next2;
                        if (b0Var3 == null) {
                            it = it6;
                            str5 = str2;
                            str4 = str3;
                            i4 = i18;
                        } else if (!cVar2.f285884d) {
                            break;
                        } else {
                            String str9 = cVar2.f285881a;
                            it = it6;
                            StringBuilder sb = new StringBuilder();
                            i4 = i18;
                            sb.append("cleanCacheFiles2 ");
                            sb.append(i17);
                            sb.append(str3);
                            sb.append(b0Var3.f250472b);
                            sb.append(str2);
                            str5 = str2;
                            str4 = str3;
                            sb.append(b0Var3.f250475e);
                            sb.append(" size: ");
                            sb.append(Util.getSizeKB(b0Var3.f250473c));
                            Log.m105924i(str9, sb.toString());
                            C97391o oVar2 = C97391o.f285892a;
                            String str10 = b0Var3.f250472b;
                            C87412m.m108593f(str10, "fileEntry.name");
                            if (!oVar2.mo136653f(str10)) {
                                long j7 = b0Var3.f250473c;
                                j5 += j7;
                                j4 -= j7;
                                i16--;
                                C86013q1.m106447h(b0Var3.f250471a);
                                if (j4 <= 0 && i16 <= 0) {
                                    break;
                                }
                                it6 = it;
                                str3 = str4;
                                str2 = str5;
                                i17 = i4;
                            }
                        }
                        it6 = it;
                        str3 = str4;
                        str2 = str5;
                        i17 = i4;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
            }
            Log.m105924i(cVar2.f285881a, "cleanCacheFiles totalSize " + Util.getSizeKB(j2) + " newsize " + (j2 - j5) + " fileSize:" + j.size() + " cost:" + bVar);
        }
    }
}
