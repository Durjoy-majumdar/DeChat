package sk1;

import al1.C54127h;
import al1.C54130j;
import cj1.C0581o5;
import cl1.C54991o;
import cl1.C55001u;
import cm1.C0740i2;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import eb0.C31543z5;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import o40.C61926c;
import p565ir.C60606n;
import p749xh.C66261f3;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C64197v;
import te3.C48742ao0;
import te3.C48770aw0;
import te3.C49030co0;
import te3.C49765hx0;
import te3.C50209l31;
import te3.C50347m31;
import te3.C50555nj3;
import te3.C50996qq1;
import te3.C51020qw0;
import te3.C51358t81;
import te3.C51559uk1;
import te3.C51745vv0;
import te3.C51946xa1;
import te3.C52013xs0;
import te3.C64265bq2;
import te3.C64273c21;
import te3.C64321dp2;
import te3.C64337e61;
import te3.C64338e71;
import te3.C64359f71;
import te3.C64370fp1;
import te3.C64387g71;
import te3.C64390ga1;
import te3.C64639pw0;
import te3.C64674r41;
import te3.C64704s81;
import te3.C64733to;

/* renamed from: sk1.a */
public final class C63947a {

    /* renamed from: a */
    public static final C63947a f181274a = new C63947a();

    /* renamed from: h */
    public static String m75194h(C63947a aVar, C64273c21 c212, String str, boolean z, int i, Object obj) {
        String str2;
        String str3;
        C64338e71 e712;
        C64338e71 e713;
        if ((i & 1) != 0) {
            str = "";
        }
        boolean z2 = false;
        if ((i & 2) != 0) {
            z = false;
        }
        aVar.getClass();
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        String str4 = null;
        if (z) {
            if (c212 != null) {
                str4 = c212.f182364J;
            }
            if (str4 == null) {
                return "";
            }
        } else {
            if (c212 == null || (e713 = c212.f182388Z) == null || (str2 = e713.f182938q) == null) {
                str2 = "";
            }
            if (c212 == null || (e712 = c212.f182388Z) == null || (str3 = e712.f182939r) == null) {
                str3 = "";
            }
            if (str2.length() > 0) {
                if (str3.length() > 0) {
                    z2 = true;
                }
                if (z2) {
                    Log.m105924i("MicroMsg.DataUtil", str + " encode player url:" + str2);
                    return str2;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" normal player url:");
            if (c212 != null) {
                str4 = c212.f182364J;
            }
            sb.append(str4);
            Log.m105924i("MicroMsg.DataUtil", sb.toString());
            if (c212 == null || (str4 = c212.f182364J) == null) {
                return "";
            }
        }
        return str4;
    }

    /* renamed from: a */
    public final boolean mo88716a(C64273c21 c212, String str) {
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        Long l = null;
        C64321dp2 fy = ((C60606n) C86312j.m106911c(C60606n.class)).mo85058fy(c212 != null ? c212.f182392d : 0, c212 != null ? c212.f182362H : null);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" chargeLiveCanPlay feed:");
        if (c212 != null) {
            l = Long.valueOf(c212.f182392d);
        }
        sb.append(l);
        sb.append(" freeTimeInfo:");
        sb.append(mo88731q(fy));
        Log.m105924i("MicroMsg.DataUtil", sb.toString());
        return (fy.f182792e > 0 && !fy.f182796i) || fy.f182795h;
    }

    /* renamed from: b */
    public final String mo88717b(List<? extends FinderObject> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (T next : list) {
            int i2 = i + 1;
            if (i >= 0) {
                sb.append('[' + f181274a.mo88735u((FinderObject) next, i) + ']');
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "sb.toString()");
        return sb4;
    }

    /* renamed from: c */
    public final String mo88718c(C50996qq1 qq12) {
        String str;
        FinderContact finderContact;
        C87412m.m108594g(qq12, "item");
        StringBuilder sb = new StringBuilder();
        sb.append("[offset:");
        sb.append(qq12.f140454d);
        sb.append(",msgList:(");
        C48742ao0 ao02 = qq12.f140455e;
        LinkedList<C64674r41> linkedList = ao02 != null ? ao02.f130677e : null;
        int i = 0;
        String str2 = "";
        if (linkedList == null || linkedList.isEmpty()) {
            str = str2;
        } else {
            StringBuilder sb4 = new StringBuilder();
            int i2 = 0;
            for (T next : linkedList) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    C64674r41 r412 = (C64674r41) next;
                    sb4.append(i2 + ",type:" + r412.f185127g + ",sec:" + r412.f185138u + ",nickname:" + r412.f185124d + ",content:" + r412.f185126f + "; \n");
                    i2 = i3;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            str = sb4.toString();
            C87412m.m108593f(str, "result.toString()");
        }
        sb.append(str);
        sb.append("),appMsgList:(");
        C48742ao0 ao03 = qq12.f140455e;
        LinkedList<C52013xs0> linkedList2 = ao03 != null ? ao03.f130689t : null;
        if (linkedList2 != null && !linkedList2.isEmpty()) {
            StringBuilder sb5 = new StringBuilder();
            for (T next2 : linkedList2) {
                int i4 = i + 1;
                if (i >= 0) {
                    C52013xs0 xs02 = (C52013xs0) next2;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(i);
                    sb6.append(",type:");
                    sb6.append(xs02.f144903e);
                    sb6.append(",from user:");
                    C49765hx0 hx02 = xs02.f144914s;
                    sb6.append((hx02 == null || (finderContact = hx02.f134919d) == null) ? null : finderContact.nickname);
                    sb6.append("; ");
                    sb5.append(sb6.toString());
                    i = i4;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            str2 = sb5.toString();
            C87412m.m108593f(str2, "result.toString()");
        }
        sb.append(str2);
        sb.append(")]");
        return sb.toString();
    }

    /* renamed from: d */
    public final String mo88719d(List<? extends C50996qq1> list) {
        C87412m.m108594g(list, "msgList");
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (T next : list) {
            int i2 = i + 1;
            if (i >= 0) {
                sb.append('{' + i + ',' + f181274a.mo88718c((C50996qq1) next) + "}\n");
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "result.toString()");
        return sb4;
    }

    /* renamed from: e */
    public final String mo88720e(List<? extends C0581o5> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (T next : list) {
            int i2 = i + 1;
            if (i >= 0) {
                C0581o5 o5Var = (C0581o5) next;
                StringBuilder sb4 = new StringBuilder();
                sb4.append(i);
                sb4.append(',');
                sb4.append(o5Var.hashCode());
                sb4.append(",type:");
                sb4.append(o5Var.getType());
                sb4.append(",nickname:");
                sb4.append(o5Var.mo573g());
                sb4.append(",content:");
                sb4.append(o5Var.getContent());
                sb4.append(",badgeInfo:");
                C49765hx0 i3 = o5Var.mo579i();
                LinkedList<C48770aw0> linkedList = i3 != null ? i3.f134930r : null;
                StringBuilder sb5 = new StringBuilder();
                if (linkedList != null) {
                    int i4 = 0;
                    for (T next2 : linkedList) {
                        int i5 = i4 + 1;
                        if (i4 >= 0) {
                            C48770aw0 aw02 = (C48770aw0) next2;
                            sb5.append('[' + i4 + "],type:" + aw02.f130789d + ",level:" + aw02.f130791f + ",name:" + aw02.f130793h + ';');
                            i4 = i5;
                        } else {
                            C64197v.m75542k();
                            throw null;
                        }
                    }
                    continue;
                }
                String sb6 = sb5.toString();
                C87412m.m108593f(sb6, "sb.toString()");
                sb4.append(sb6);
                sb4.append("; \n");
                sb.append(sb4.toString());
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        String sb7 = sb.toString();
        C87412m.m108593f(sb7, "result.toString()");
        return sb7;
    }

    /* renamed from: f */
    public final String mo88721f(List<C54130j> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (T next : list) {
            int i2 = i + 1;
            if (i >= 0) {
                C54130j jVar = (C54130j) next;
                sb.append('[' + i + XVFSFile.PATH_SEPARATOR_CHAR + jVar.f151997a + ',' + jVar.f152001e + ',' + jVar.f152012p + ']');
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "sb.toString()");
        return sb4;
    }

    /* renamed from: g */
    public final String mo88722g(C49030co0 co02) {
        String str;
        C87412m.m108594g(co02, "msgInfo");
        StringBuilder sb = new StringBuilder();
        sb.append("interval_in_second:");
        sb.append(co02.f131865h);
        sb.append(",detail:");
        LinkedList<C50996qq1> linkedList = co02.f131861d;
        C87412m.m108593f(linkedList, "msgInfo.items");
        sb.append(mo88719d(linkedList));
        sb.append(",continue_flag:");
        sb.append(co02.f131864g);
        sb.append(",mic_info:");
        C50347m31 m312 = co02.f131862e;
        if ((m312 != null ? m312.f137806j : null) == null || m312.f137806j.isEmpty()) {
            str = "null";
        } else {
            StringBuilder sb4 = new StringBuilder();
            LinkedList<C50209l31> linkedList2 = m312.f137806j;
            if (linkedList2 != null) {
                int i = 0;
                for (T next : linkedList2) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        sb4.append('[' + i + ',' + ((C50209l31) next).f137147f + ']');
                        i = i2;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
            }
            str = sb4.toString();
            C87412m.m108593f(str, "result.toString()");
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: i */
    public final int mo88723i(C64390ga1 ga12, int i) {
        int e = C31543z5.m39455e();
        int i2 = 0;
        if (i != 1) {
            if (i == 2) {
                if (e != 0) {
                    int i3 = (ga12 != null ? ga12.f183298g : e) - e;
                    if (i3 >= 0) {
                        i2 = i3;
                    }
                } else if (ga12 != null) {
                    i2 = ga12.f183296e;
                }
            }
        } else if (ga12 != null) {
            i2 = ga12.f183296e;
        }
        Log.m105924i("FinderLiveUrlOption", "getTimeLimit type:" + i + ",result:" + i2 + ",info:" + mo88729o(ga12) + ",serverTime:" + e + '!');
        return i2;
    }

    /* renamed from: j */
    public final String mo88724j(C51020qw0 qw02) {
        C50555nj3 nj32;
        C51946xa1 xa12;
        StringBuilder sb = new StringBuilder();
        String str = null;
        sb.append(qw02 != null ? Integer.valueOf(qw02.f140580d) : null);
        sb.append(',');
        sb.append(qw02 != null ? Integer.valueOf(qw02.f140581e) : null);
        sb.append(",whiteList:");
        sb.append((qw02 == null || (xa12 = qw02.f140582f) == null) ? null : mo88730p(xa12));
        sb.append(",previewInfo:");
        if (!(qw02 == null || (nj32 = qw02.f140583g) == null)) {
            str = "type:" + Integer.valueOf(nj32.f138632d) + ",duration:" + Integer.valueOf(nj32.f138634f) + '-' + Integer.valueOf(nj32.f138633e);
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: k */
    public final String mo88725k(C64337e61 e612) {
        if (e612 == null) {
            return "PurchaseInfo:NULL!";
        }
        return "PurchaseInfo:[" + e612.f182920d + ',' + e612.f182921e + ',' + e612.f182922f + ',' + e612.f182923g + ',' + e612.f182924h + ",prompt_wording:" + e612.f182927n + ']';
    }

    /* renamed from: l */
    public final String mo88726l(C64338e71 e712) {
        if (e712 == null) {
            return "FinderLiveReplayInfo:NULL!";
        }
        return "FinderLiveReplayInfo:{" + e712.f182928d + ',' + e712.f182929e + ',' + e712.f182930f + ',' + e712.f182931g + ',' + mo88727m(e712.f182933i) + ',' + mo88728n(e712.f182934j) + '}';
    }

    /* renamed from: m */
    public final String mo88727m(C64359f71 f712) {
        String str;
        String str2;
        if (f712 == null) {
            return "NULL!";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        sb.append(f712.f183088g);
        sb.append(',');
        sb.append(f712.f183090i);
        sb.append(',');
        sb.append(f712.f183089h);
        sb.append(',');
        sb.append(f712.f183087f);
        sb.append(',');
        sb.append(f712.f183086e);
        sb.append(',');
        LinkedList<C64733to> linkedList = f712.f183085d;
        if (linkedList == null) {
            str = "CdnTransInfoList:NULL!";
        } else {
            StringBuilder sb4 = new StringBuilder("CdnTransInfoList:[");
            for (C64733to toVar : linkedList) {
                if (toVar == null) {
                    str2 = "CdnTransInfo:NULL!";
                } else {
                    str2 = '[' + toVar.f185627j + ',' + toVar.f185626i + ',' + toVar.f185622e + ',' + toVar.f185628n + ']';
                }
                sb4.append(str2);
            }
            sb4.append("]");
            str = sb4.toString();
            C87412m.m108593f(str, "{\n            val sb = S…  sb.toString()\n        }");
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: n */
    public final String mo88728n(C64387g71 g712) {
        if (g712 != null) {
            LinkedList<C64639pw0> linkedList = g712.f183281d;
            if (!(linkedList == null || linkedList.isEmpty())) {
                StringBuilder sb = new StringBuilder("FinderLiveReplayTransitionPreloadInfo:");
                LinkedList<C64639pw0> linkedList2 = g712.f183281d;
                C87412m.m108593f(linkedList2, "this.preload_infos");
                for (C64639pw0 pw02 : linkedList2) {
                    sb.append("{level:" + pw02.f184902d + ",tag:" + pw02.f184910o + ',' + pw02.f184909n + ',' + pw02.f184904f + XVFSFile.SEPARATOR_CHAR + pw02.f184905g + '(' + pw02.f184907i + XVFSFile.SEPARATOR_CHAR + pw02.f184908j + ")}");
                }
                String sb4 = sb.toString();
                C87412m.m108593f(sb4, "{\n            val sb = S…  sb.toString()\n        }");
                return sb4;
            }
        }
        return "FinderLiveReplayTransitionPreloadInfo:EMPTY!";
    }

    /* renamed from: o */
    public final String mo88729o(C64390ga1 ga12) {
        if (ga12 == null) {
            return "FinderLiveUrlOption:NULL!";
        }
        return "FinderLiveUrlOption:[" + ga12.f183296e + ',' + ga12.f183298g + ']';
    }

    /* renamed from: p */
    public final String mo88730p(C51946xa1 xa12) {
        String str;
        StringBuilder sb = new StringBuilder();
        LinkedList<C51745vv0> linkedList = null;
        sb.append(xa12 != null ? xa12.f144559f : null);
        sb.append("(room list:");
        sb.append(xa12 != null ? xa12.f144557d : null);
        sb.append(",user list:");
        sb.append(xa12 != null ? xa12.f144558e : null);
        sb.append(",audience list:");
        if (xa12 != null) {
            linkedList = xa12.f144560g;
        }
        if (linkedList == null || linkedList.isEmpty()) {
            str = "";
        } else {
            StringBuilder sb4 = new StringBuilder();
            for (C51745vv0 vv02 : linkedList) {
                sb4.append(vv02.f143710e + ';');
            }
            str = sb4.toString();
            C87412m.m108593f(str, "{\n                val sb….toString()\n            }");
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: q */
    public final String mo88731q(C64321dp2 dp22) {
        if (dp22 == null) {
            return "LiveFreeTimeInfo:NULL!";
        }
        return "LiveFreeTimeInfo:" + dp22.f182791d + ',' + dp22.f182792e + ',' + dp22.f182793f + ',' + dp22.f182794g + ',' + dp22.f182795h + ',' + dp22.f182796i + '!';
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = r10.liveInfo;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0080, code lost:
        if ((r7.length() > 0) != false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00b2, code lost:
        if ((r7.length() > 0) != false) goto L_0x00d5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo88732r(com.tencent.p014mm.protocal.protobuf.FinderObject r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L_0x000b
            te3.c21 r2 = r10.liveInfo
            if (r2 == 0) goto L_0x000b
            long r2 = r2.f182392d
            goto L_0x000c
        L_0x000b:
            r2 = r0
        L_0x000c:
            r4 = 1
            r5 = 0
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 == 0) goto L_0x00e1
            r0 = 0
            if (r10 == 0) goto L_0x001c
            te3.c21 r1 = r10.liveInfo
            if (r1 == 0) goto L_0x001c
            java.lang.String r1 = r1.f182395g
            goto L_0x001d
        L_0x001c:
            r1 = r0
        L_0x001d:
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x0022
            r1 = r2
        L_0x0022:
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x002a
            r1 = 1
            goto L_0x002b
        L_0x002a:
            r1 = 0
        L_0x002b:
            if (r1 != 0) goto L_0x00e2
            if (r10 == 0) goto L_0x00b5
            te3.c21 r1 = r10.liveInfo
            if (r1 == 0) goto L_0x00b5
            te3.bq2 r1 = r1.f182358D
            if (r1 == 0) goto L_0x00b5
            pe3.b r1 = r1.f182318j
            if (r1 == 0) goto L_0x00b5
            te3.cq2 r3 = new te3.cq2
            r3.<init>()
            byte[] r1 = r1.mo123703f()
            r3.parseFrom(r1)     // Catch:{ Exception -> 0x0048 }
            goto L_0x0053
        L_0x0048:
            r1 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r3[r5] = r1
            java.lang.String r1 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r1, r2, r3)
            r3 = r0
        L_0x0053:
            if (r3 == 0) goto L_0x00b5
            te3.zp2 r1 = r3.f182556f
            if (r1 == 0) goto L_0x00b5
            int r3 = r1.f186781A
            java.util.LinkedList<te3.to> r6 = r1.f186812j
            int r6 = r6.size()
            if (r3 < 0) goto L_0x0067
            if (r3 >= r6) goto L_0x0067
            r7 = 1
            goto L_0x0068
        L_0x0067:
            r7 = 0
        L_0x0068:
            if (r7 == 0) goto L_0x0083
            java.util.LinkedList<te3.to> r7 = r1.f186812j
            java.lang.Object r7 = r7.get(r3)
            te3.to r7 = (te3.C64733to) r7
            java.lang.String r7 = r7.f185622e
            if (r7 != 0) goto L_0x0077
            r7 = r2
        L_0x0077:
            int r8 = r7.length()
            if (r8 <= 0) goto L_0x007f
            r8 = 1
            goto L_0x0080
        L_0x007f:
            r8 = 0
        L_0x0080:
            if (r8 == 0) goto L_0x0084
            goto L_0x00d5
        L_0x0083:
            r7 = r2
        L_0x0084:
            int r8 = r7.length()
            if (r8 != 0) goto L_0x008c
            r8 = 1
            goto L_0x008d
        L_0x008c:
            r8 = 0
        L_0x008d:
            if (r8 == 0) goto L_0x00b6
            int r8 = r1.f186782B
            if (r8 < 0) goto L_0x0097
            if (r8 >= r6) goto L_0x0097
            r6 = 1
            goto L_0x0098
        L_0x0097:
            r6 = 0
        L_0x0098:
            if (r6 == 0) goto L_0x00b6
            java.util.LinkedList<te3.to> r1 = r1.f186812j
            java.lang.Object r1 = r1.get(r3)
            te3.to r1 = (te3.C64733to) r1
            java.lang.String r1 = r1.f185622e
            if (r1 != 0) goto L_0x00a8
            r7 = r2
            goto L_0x00a9
        L_0x00a8:
            r7 = r1
        L_0x00a9:
            int r1 = r7.length()
            if (r1 <= 0) goto L_0x00b1
            r1 = 1
            goto L_0x00b2
        L_0x00b1:
            r1 = 0
        L_0x00b2:
            if (r1 == 0) goto L_0x00b6
            goto L_0x00d5
        L_0x00b5:
            r7 = r2
        L_0x00b6:
            int r1 = r7.length()
            if (r1 != 0) goto L_0x00be
            r1 = 1
            goto L_0x00bf
        L_0x00be:
            r1 = 0
        L_0x00bf:
            if (r1 == 0) goto L_0x00d5
            java.lang.String r1 = "MicroMsg.DataUtil"
            java.lang.String r3 = "FinderObject.getSmallResolutionLiveUrl fail,get live stream instead!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r3)
            if (r10 == 0) goto L_0x00d0
            te3.c21 r10 = r10.liveInfo
            if (r10 == 0) goto L_0x00d0
            java.lang.String r0 = r10.f182395g
        L_0x00d0:
            if (r0 != 0) goto L_0x00d3
            goto L_0x00d4
        L_0x00d3:
            r2 = r0
        L_0x00d4:
            r7 = r2
        L_0x00d5:
            int r10 = r7.length()
            if (r10 <= 0) goto L_0x00dd
            r10 = 1
            goto L_0x00de
        L_0x00dd:
            r10 = 0
        L_0x00de:
            if (r10 == 0) goto L_0x00e1
            goto L_0x00e2
        L_0x00e1:
            r4 = 0
        L_0x00e2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: sk1.C63947a.mo88732r(com.tencent.mm.protocal.protobuf.FinderObject):boolean");
    }

    /* renamed from: s */
    public final boolean mo88733s(C64273c21 c212, String str) {
        Class cls = C60606n.class;
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        if (!((C60606n) C86312j.m106911c(cls)).mo85075nB(c212)) {
            return true;
        }
        Long l = null;
        C64321dp2 fy = ((C60606n) C86312j.m106911c(cls)).mo85058fy(c212 != null ? c212.f182392d : 0, c212 != null ? c212.f182362H : null);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" liveCanPlay feed:");
        if (c212 != null) {
            l = Long.valueOf(c212.f182392d);
        }
        sb.append(l);
        sb.append(" freeTimeInfo:");
        sb.append(mo88731q(fy));
        Log.m105924i("MicroMsg.DataUtil", sb.toString());
        return (fy.f182792e > 0 && !fy.f182796i) || fy.f182795h;
    }

    /* renamed from: t */
    public final void mo88734t(C54127h hVar, FinderObject finderObject, int i) {
        C13598b0 b0Var;
        Class cls = C54991o.class;
        Class cls2 = C55001u.class;
        C87412m.m108594g(hVar, "liveData");
        C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
        ((C54991o) hVar.f151978e.mo71262a(cls)).mo75955C4(i);
        ((C54991o) hVar.f151978e.mo71262a(cls)).mo76026x4(finderObject);
        C54991o oVar = (C54991o) hVar.f151978e.mo71262a(cls);
        String str = finderObject.username;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        oVar.f154345o = str;
        C64273c21 c212 = finderObject.liveInfo;
        if (c212 != null) {
            ((C55001u) hVar.f151978e.mo71262a(cls2)).mo76042m3(c212);
            ((C54991o) hVar.f151978e.mo71262a(cls)).f154230N = c212.f182383W0;
            C64265bq2 bq22 = c212.f182358D;
            if (bq22 != null) {
                ((C55001u) hVar.f151978e.mo71262a(cls2)).f154419p = bq22;
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                Log.m105920e("toFinderLiveReplayData", "parseFinderObject liveSdkInfo is null!");
            }
            C54991o oVar2 = (C54991o) hVar.f151978e.mo71262a(cls);
            C64338e71 e712 = c212.f182388Z;
            oVar2.f154332k1 = e712 != null ? e712.f182928d : ((C54991o) hVar.f151978e.mo71262a(cls)).f154332k1;
        }
        ((C55001u) hVar.f151978e.mo71262a(cls2)).f154416j = finderObject.f164794id;
        C55001u uVar = (C55001u) hVar.f151978e.mo71262a(cls2);
        String str3 = finderObject.objectNonceId;
        if (str3 == null) {
            str3 = str2;
        }
        uVar.f154423t = str3;
        C55001u uVar2 = (C55001u) hVar.f151978e.mo71262a(cls2);
        String str4 = finderObject.sessionBuffer;
        if (str4 == null) {
            str4 = str2;
        }
        uVar2.f154424u = str4;
        C55001u uVar3 = (C55001u) hVar.f151978e.mo71262a(cls2);
        String str5 = finderObject.nickname;
        if (str5 != null) {
            str2 = str5;
        }
        uVar3.f154425v = str2;
        ((C55001u) hVar.f151978e.mo71262a(cls2)).mo76044o3(String.valueOf(finderObject.hashCode()));
    }

    /* renamed from: u */
    public final String mo88735u(FinderObject finderObject, int i) {
        FinderObjectDesc finderObjectDesc;
        StringBuilder sb = new StringBuilder();
        sb.append(C61926c.m72691p(finderObject != null ? finderObject.f164794id : 0));
        sb.append(',');
        C64273c21 c212 = null;
        sb.append((finderObject == null || (finderObjectDesc = finderObject.objectDesc) == null) ? null : finderObjectDesc.description);
        sb.append(',');
        sb.append(finderObject != null ? finderObject.nickname : null);
        sb.append(',');
        if (finderObject != null) {
            c212 = finderObject.liveInfo;
        }
        sb.append(mo88736v(c212));
        sb.append(",pos:");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: v */
    public final String mo88736v(C64273c21 c212) {
        if (c212 == null) {
            return "LiveInfo:NULL!";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("liveId:");
        sb.append(C61926c.m72691p(c212.f182392d));
        sb.append(" live_status:");
        sb.append(c212.f182394f);
        sb.append(" replay_status:");
        sb.append(c212.f182366L);
        sb.append(" replay_url is empty:");
        String str = c212.f182364J;
        sb.append(str == null || str.length() == 0);
        sb.append(',');
        sb.append(mo88726l(c212.f182388Z));
        sb.append(", status_desc:");
        sb.append(c212.f182373R0);
        sb.append(',');
        sb.append(mo88725k(c212.f182363I));
        sb.append(',');
        sb.append(mo88729o(c212.f182362H));
        sb.append(';');
        return sb.toString();
    }

    /* renamed from: w */
    public final C0740i2 mo88737w(C51358t81 t812) {
        C87412m.m108594g(t812, "<this>");
        C89349b bVar = t812.f142031e;
        if (bVar == null) {
            return null;
        }
        int i = t812.f142030d;
        if (i == 0) {
            C64370fp1 fp12 = new C64370fp1();
            try {
                fp12.parseFrom(bVar.mo123703f());
            } catch (Exception e) {
                Log.printDebugStack("safeParser", "", e);
                fp12 = null;
            }
            if (fp12 != null) {
                return new C63965x(fp12);
            }
            return null;
        } else if (i == 1) {
            C64704s81 s812 = new C64704s81();
            try {
                s812.parseFrom(bVar.mo123703f());
            } catch (Exception e2) {
                Log.printDebugStack("safeParser", "", e2);
                s812 = null;
            }
            if (s812 != null) {
                return new C63964u(s812);
            }
            return null;
        } else if (i != 2) {
            return null;
        } else {
            C51559uk1 uk12 = new C51559uk1();
            try {
                uk12.parseFrom(bVar.mo123703f());
            } catch (Exception e3) {
                Log.printDebugStack("safeParser", "", e3);
                uk12 = null;
            }
            if (uk12 != null) {
                return new C13696v(uk12);
            }
            return null;
        }
    }
}
