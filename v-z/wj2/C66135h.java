package wj2;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import d03.C58010a;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.LinkedList;
import nj2.C61767o;
import rx3.C13598b0;
import sx3.C110818d0;
import ve3.C52824a1;
import ve3.C65679e0;
import ve3.C65680f;
import ve3.C65681f0;
import ve3.C65682g;
import ve3.C65683h0;
import ve3.C65685n0;

/* renamed from: wj2.h */
public final class C66135h extends C66132f {

    /* renamed from: E */
    public static final C66136a f190107E = new C66136a((C8480h) null);

    /* renamed from: wj2.h$a */
    public static final class C66136a {
        public C66136a(C8480h hVar) {
        }

        /* renamed from: c */
        public static C66132f m77956c(C66136a aVar, long j, long j2, FinderObject finderObject, long j3, C65685n0 n0Var, String str, boolean z, int i, Object obj) {
            FinderObjectDesc finderObjectDesc;
            LinkedList<FinderMedia> linkedList;
            FinderMedia finderMedia;
            C58010a uQ;
            C65682g gVar;
            C52824a1 a1Var = null;
            if ((i & 16) != 0) {
                n0Var = null;
            }
            if ((i & 32) != 0) {
                str = null;
            }
            if ((i & 64) != 0) {
                z = false;
            }
            aVar.getClass();
            C66132f fVar = new C66132f();
            if (!(finderObject == null || (finderObjectDesc = finderObject.objectDesc) == null || (linkedList = finderObjectDesc.media) == null || (finderMedia = (FinderMedia) C110818d0.m150916N(linkedList)) == null || (uQ = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76884uQ(finderMedia, j3, false)) == null)) {
                uQ.f165948t += ".ring";
                fVar.f190081d = finderObject;
                fVar.f190080c = j2;
                fVar.f190079b = j;
                fVar.f190083f = n0Var;
                fVar.f190082e = str;
                fVar.f190084g = Math.min(MAlarmHandler.NEXT_FIRE_INTERVAL, j2 - j);
                fVar.f190078a = uQ;
                uQ.f165946r = "A0";
                String str2 = Util.nullAsNil(finderMedia.coverUrl) + Util.nullAsNil(finderMedia.cover_url_token);
                C87412m.m108594g(str2, "<set-?>");
                fVar.f190088k = str2;
                fVar.mo90182m(true);
                String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.emq);
                C87412m.m108593f(string, "getContext().resources.g…R.string.finder_resource)");
                fVar.f190085h = string;
                String string2 = MMApplicationContext.getContext().getResources().getString(C0966R.string.emr);
                C87412m.m108593f(string2, "getContext().resources.g…g.finder_resource_author)");
                fVar.f190087j = string2;
                String str3 = finderObject.nickname;
                if (str3 != null) {
                    fVar.f190087j = str3;
                }
                fVar.f190091n = z;
                fVar.f190092o = j3;
                String str4 = finderObject.objectNonceId;
                String str5 = "";
                if (str4 == null) {
                    str4 = str5;
                }
                fVar.f190093p = str4;
                if (!(n0Var == null || (gVar = n0Var.f189022f) == null)) {
                    String str6 = gVar.f189001n;
                    if (str6 == null) {
                        str6 = str5;
                    }
                    fVar.f190103z = str6;
                    String str7 = gVar.f189003p;
                    if (str7 == null) {
                        str7 = str5;
                    }
                    fVar.f190098u = str7;
                    String str8 = gVar.f189005r;
                    if (str8 != null) {
                        str5 = str8;
                    }
                    fVar.f190099v = str5;
                    fVar.f190100w = gVar.f189004q;
                    fVar.f190101x = gVar.f189000j;
                    C66135h.f190107E.mo90186a(gVar, fVar);
                }
                if (n0Var != null) {
                    a1Var = n0Var.f189026j;
                }
                fVar.f190095r = a1Var;
            }
            return fVar;
        }

        /* renamed from: h */
        public static /* synthetic */ C66132f m77957h(C66136a aVar, long j, long j2, C65685n0 n0Var, String str, int i, Object obj) {
            if ((i & 8) != 0) {
                str = null;
            }
            return aVar.mo90191g(j, j2, n0Var, str);
        }

        /* renamed from: a */
        public final void mo90186a(C65682g gVar, C66132f fVar) {
            C87412m.m108594g(gVar, "<this>");
            C87412m.m108594g(fVar, "receiver");
            String str = gVar.f188997g;
            C13598b0 b0Var = null;
            boolean z = false;
            if (str != null) {
                if (!(str.length() > 0)) {
                    str = null;
                }
                if (str != null) {
                    fVar.f190087j = str;
                    String string = MMApplicationContext.getContext().getString(C0966R.string.m5o, new Object[]{str});
                    C87412m.m108593f(string, "getContext().getString(R…tone_finder_resource, it)");
                    fVar.f190085h = string;
                    String string2 = MMApplicationContext.getContext().getString(C0966R.string.emq);
                    C87412m.m108593f(string2, "getContext().getString(R.string.finder_resource)");
                    fVar.f190086i = string2;
                    b0Var = C13598b0.f38549a;
                }
            }
            if (b0Var == null) {
                String string3 = MMApplicationContext.getContext().getString(C0966R.string.emr);
                C87412m.m108593f(string3, "getContext().getString(R…g.finder_resource_author)");
                fVar.f190087j = string3;
                String string4 = MMApplicationContext.getContext().getString(C0966R.string.emq);
                C87412m.m108593f(string4, "getContext().getString(R.string.finder_resource)");
                fVar.f190085h = string4;
                String string5 = MMApplicationContext.getContext().getString(C0966R.string.emq);
                C87412m.m108593f(string5, "getContext().getString(R.string.finder_resource)");
                fVar.f190086i = string5;
            }
            C65683h0 h0Var = gVar.f189010w;
            if (h0Var != null) {
                String str2 = h0Var.f189011d;
                String str3 = h0Var.f189012e;
                if (str2 != null && str3 != null) {
                    if (str2.length() > 0) {
                        if (str3.length() > 0) {
                            z = true;
                        }
                        if (z) {
                            fVar.mo90181l(str2 + " - " + str3);
                            fVar.f190086i = str2;
                            fVar.f190087j = str3;
                            fVar.f190102y = true;
                        }
                    }
                }
            }
        }

        /* renamed from: b */
        public final C66132f mo90187b() {
            C66132f fVar = new C66132f();
            C58010a aVar = new C58010a("voip_default_sound", C61767o.f175575a.mo86686c(C61767o.f175579e), "", 0, 0);
            fVar.mo90181l(MMApplicationContext.getContext().getResources().getText(C0966R.string.i4w).toString());
            fVar.f190079b = 0;
            fVar.f190080c = 4400;
            fVar.f190084g = 4400;
            aVar.f165933e = true;
            fVar.f190078a = aVar;
            C52824a1 a1Var = new C52824a1();
            a1Var.f147574d = "phonering.HE";
            fVar.f190095r = a1Var;
            return fVar;
        }

        /* renamed from: d */
        public final C66132f mo90188d(long j, long j2, C65682g gVar, FinderObject finderObject) {
            FinderObjectDesc finderObjectDesc;
            LinkedList<FinderMedia> linkedList;
            FinderMedia finderMedia;
            C58010a uQ;
            FinderContact finderContact;
            C87412m.m108594g(gVar, "detail");
            C65680f fVar = gVar.f188994d;
            String str = null;
            if (fVar != null) {
                long j3 = fVar.f188983d;
                String str2 = fVar.f188984e;
                if (str2 != null) {
                    C66132f fVar2 = new C66132f();
                    fVar2.f190079b = j;
                    fVar2.f190080c = j2;
                    mo90186a(gVar, fVar2);
                    fVar2.f190092o = j3;
                    fVar2.f190093p = str2;
                    String str3 = gVar.f189001n;
                    String str4 = "";
                    if (str3 == null) {
                        str3 = str4;
                    }
                    fVar2.f190103z = str3;
                    if (!(finderObject == null || (finderContact = finderObject.contact) == null)) {
                        str = finderContact.headUrl;
                    }
                    if (str == null) {
                        str = str4;
                    }
                    fVar2.f190097t = str;
                    String str5 = gVar.f189003p;
                    if (str5 == null) {
                        str5 = str4;
                    }
                    fVar2.f190098u = str5;
                    String str6 = gVar.f189005r;
                    if (str6 == null) {
                        str6 = str4;
                    }
                    fVar2.f190099v = str6;
                    fVar2.f190100w = gVar.f189004q;
                    fVar2.f190101x = gVar.f189000j;
                    C58010a aVar = fVar2.f190078a;
                    if (aVar != null) {
                        aVar.f165946r = "A0";
                    }
                    fVar2.mo90182m(true);
                    String str7 = gVar.f188997g;
                    if (str7 != null) {
                        String str8 = fVar2.f190087j + " · " + str7;
                        C87412m.m108594g(str8, "<set-?>");
                        fVar2.f190087j = str8;
                    }
                    String str9 = gVar.f188996f;
                    if (str9 != null) {
                        str4 = str9;
                    }
                    fVar2.f190088k = str4;
                    if (!(finderObject == null || (finderObjectDesc = finderObject.objectDesc) == null || (linkedList = finderObjectDesc.media) == null || (finderMedia = (FinderMedia) C110818d0.m150916N(linkedList)) == null || (uQ = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76884uQ(finderMedia, j3, false)) == null)) {
                        uQ.f165948t += ".ring";
                        uQ.f165946r = "A0";
                        fVar2.f190078a = uQ;
                        fVar2.f190081d = finderObject;
                    }
                    return fVar2;
                }
            }
            return null;
        }

        /* renamed from: e */
        public final C66132f mo90189e(C65682g gVar, C65685n0 n0Var) {
            String str;
            C87412m.m108594g(gVar, "detail");
            C87412m.m108594g(n0Var, "info");
            C65680f fVar = gVar.f188994d;
            if (fVar == null) {
                return mo90187b();
            }
            long j = fVar.f188983d;
            if (fVar == null || (str = fVar.f188984e) == null) {
                return mo90187b();
            }
            C66132f fVar2 = new C66132f();
            mo90186a(gVar, fVar2);
            fVar2.f190092o = j;
            fVar2.f190093p = str;
            String str2 = gVar.f189001n;
            String str3 = "";
            if (str2 == null) {
                str2 = str3;
            }
            fVar2.f190103z = str2;
            String str4 = gVar.f189003p;
            if (str4 == null) {
                str4 = str3;
            }
            fVar2.f190098u = str4;
            String str5 = gVar.f189005r;
            if (str5 == null) {
                str5 = str3;
            }
            fVar2.f190099v = str5;
            fVar2.f190100w = gVar.f189004q;
            fVar2.f190101x = gVar.f189000j;
            C58010a aVar = fVar2.f190078a;
            if (aVar != null) {
                aVar.f165946r = "A0";
            }
            fVar2.mo90182m(true);
            fVar2.f190095r = n0Var.f189026j;
            String str6 = gVar.f188996f;
            if (str6 != null) {
                str3 = str6;
            }
            fVar2.f190088k = str3;
            return fVar2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:101:0x011b A[Catch:{ Exception -> 0x0120 }] */
        /* JADX WARNING: Removed duplicated region for block: B:107:0x012b A[Catch:{ Exception -> 0x036f }] */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x0136 A[Catch:{ Exception -> 0x0140 }] */
        /* JADX WARNING: Removed duplicated region for block: B:113:0x0138 A[Catch:{ Exception -> 0x0140 }] */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x013b A[Catch:{ Exception -> 0x0140 }] */
        /* JADX WARNING: Removed duplicated region for block: B:121:0x014b A[Catch:{ Exception -> 0x036f }] */
        /* JADX WARNING: Removed duplicated region for block: B:126:0x0156 A[Catch:{ Exception -> 0x0160 }] */
        /* JADX WARNING: Removed duplicated region for block: B:127:0x0158 A[Catch:{ Exception -> 0x0160 }] */
        /* JADX WARNING: Removed duplicated region for block: B:129:0x015b A[Catch:{ Exception -> 0x0160 }] */
        /* JADX WARNING: Removed duplicated region for block: B:135:0x016b A[Catch:{ Exception -> 0x036f }] */
        /* JADX WARNING: Removed duplicated region for block: B:140:0x0179 A[Catch:{ Exception -> 0x0183 }] */
        /* JADX WARNING: Removed duplicated region for block: B:141:0x017b A[Catch:{ Exception -> 0x0183 }] */
        /* JADX WARNING: Removed duplicated region for block: B:143:0x017e A[Catch:{ Exception -> 0x0183 }] */
        /* JADX WARNING: Removed duplicated region for block: B:152:0x019a A[Catch:{ Exception -> 0x01a6 }] */
        /* JADX WARNING: Removed duplicated region for block: B:153:0x019c A[Catch:{ Exception -> 0x01a6 }] */
        /* JADX WARNING: Removed duplicated region for block: B:155:0x019f A[Catch:{ Exception -> 0x01a6 }] */
        /* JADX WARNING: Removed duplicated region for block: B:164:0x01b9 A[Catch:{ Exception -> 0x01c3 }] */
        /* JADX WARNING: Removed duplicated region for block: B:165:0x01bb A[Catch:{ Exception -> 0x01c3 }] */
        /* JADX WARNING: Removed duplicated region for block: B:167:0x01be A[Catch:{ Exception -> 0x01c3 }] */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0042 A[Catch:{ Exception -> 0x036f }] */
        /* JADX WARNING: Removed duplicated region for block: B:173:0x01ce A[Catch:{ Exception -> 0x036f }] */
        /* JADX WARNING: Removed duplicated region for block: B:178:0x01da A[Catch:{ Exception -> 0x01e6 }] */
        /* JADX WARNING: Removed duplicated region for block: B:179:0x01dc A[Catch:{ Exception -> 0x01e6 }] */
        /* JADX WARNING: Removed duplicated region for block: B:181:0x01df A[Catch:{ Exception -> 0x01e6 }] */
        /* JADX WARNING: Removed duplicated region for block: B:190:0x01ff A[Catch:{ Exception -> 0x0209 }] */
        /* JADX WARNING: Removed duplicated region for block: B:191:0x0201 A[Catch:{ Exception -> 0x0209 }] */
        /* JADX WARNING: Removed duplicated region for block: B:193:0x0204 A[Catch:{ Exception -> 0x0209 }] */
        /* JADX WARNING: Removed duplicated region for block: B:202:0x0221 A[Catch:{ Exception -> 0x022d }] */
        /* JADX WARNING: Removed duplicated region for block: B:203:0x0223 A[Catch:{ Exception -> 0x022d }] */
        /* JADX WARNING: Removed duplicated region for block: B:205:0x0226 A[Catch:{ Exception -> 0x022d }] */
        /* JADX WARNING: Removed duplicated region for block: B:214:0x0240 A[Catch:{ Exception -> 0x024a }] */
        /* JADX WARNING: Removed duplicated region for block: B:215:0x0242 A[Catch:{ Exception -> 0x024a }] */
        /* JADX WARNING: Removed duplicated region for block: B:217:0x0245 A[Catch:{ Exception -> 0x024a }] */
        /* JADX WARNING: Removed duplicated region for block: B:225:0x025c A[Catch:{ Exception -> 0x0266 }] */
        /* JADX WARNING: Removed duplicated region for block: B:226:0x025e A[Catch:{ Exception -> 0x0266 }] */
        /* JADX WARNING: Removed duplicated region for block: B:228:0x0261 A[Catch:{ Exception -> 0x0266 }] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0054 A[Catch:{ Exception -> 0x0060 }] */
        /* JADX WARNING: Removed duplicated region for block: B:234:0x0271 A[Catch:{ Exception -> 0x036f }] */
        /* JADX WARNING: Removed duplicated region for block: B:239:0x027c A[Catch:{ Exception -> 0x0286 }] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0056 A[Catch:{ Exception -> 0x0060 }] */
        /* JADX WARNING: Removed duplicated region for block: B:240:0x027e A[Catch:{ Exception -> 0x0286 }] */
        /* JADX WARNING: Removed duplicated region for block: B:242:0x0281 A[Catch:{ Exception -> 0x0286 }] */
        /* JADX WARNING: Removed duplicated region for block: B:248:0x0291 A[Catch:{ Exception -> 0x036f }] */
        /* JADX WARNING: Removed duplicated region for block: B:253:0x029c A[Catch:{ Exception -> 0x02a6 }] */
        /* JADX WARNING: Removed duplicated region for block: B:254:0x029e A[Catch:{ Exception -> 0x02a6 }] */
        /* JADX WARNING: Removed duplicated region for block: B:256:0x02a1 A[Catch:{ Exception -> 0x02a6 }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0059 A[Catch:{ Exception -> 0x0060 }] */
        /* JADX WARNING: Removed duplicated region for block: B:262:0x02b1 A[Catch:{ Exception -> 0x036f }] */
        /* JADX WARNING: Removed duplicated region for block: B:267:0x02bc A[Catch:{ Exception -> 0x02c8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:268:0x02be A[Catch:{ Exception -> 0x02c8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:270:0x02c1 A[Catch:{ Exception -> 0x02c8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:279:0x02db A[Catch:{ Exception -> 0x02e7 }] */
        /* JADX WARNING: Removed duplicated region for block: B:280:0x02dd A[Catch:{ Exception -> 0x02e7 }] */
        /* JADX WARNING: Removed duplicated region for block: B:282:0x02e0 A[Catch:{ Exception -> 0x02e7 }] */
        /* JADX WARNING: Removed duplicated region for block: B:291:0x02fb A[Catch:{ Exception -> 0x0305 }] */
        /* JADX WARNING: Removed duplicated region for block: B:292:0x02fd A[Catch:{ Exception -> 0x0305 }] */
        /* JADX WARNING: Removed duplicated region for block: B:294:0x0300 A[Catch:{ Exception -> 0x0305 }] */
        /* JADX WARNING: Removed duplicated region for block: B:300:0x0310 A[Catch:{ Exception -> 0x036f }] */
        /* JADX WARNING: Removed duplicated region for block: B:305:0x031c A[Catch:{ Exception -> 0x0326 }] */
        /* JADX WARNING: Removed duplicated region for block: B:306:0x031e A[Catch:{ Exception -> 0x0326 }] */
        /* JADX WARNING: Removed duplicated region for block: B:308:0x0321 A[Catch:{ Exception -> 0x0326 }] */
        /* JADX WARNING: Removed duplicated region for block: B:314:0x0331 A[Catch:{ Exception -> 0x036f }] */
        /* JADX WARNING: Removed duplicated region for block: B:319:0x033c A[Catch:{ Exception -> 0x0346 }] */
        /* JADX WARNING: Removed duplicated region for block: B:320:0x033e A[Catch:{ Exception -> 0x0346 }] */
        /* JADX WARNING: Removed duplicated region for block: B:322:0x0341 A[Catch:{ Exception -> 0x0346 }] */
        /* JADX WARNING: Removed duplicated region for block: B:327:0x0350 A[Catch:{ Exception -> 0x036f }] */
        /* JADX WARNING: Removed duplicated region for block: B:332:0x035b A[Catch:{ Exception -> 0x0365 }] */
        /* JADX WARNING: Removed duplicated region for block: B:333:0x035d A[Catch:{ Exception -> 0x0365 }] */
        /* JADX WARNING: Removed duplicated region for block: B:335:0x0360 A[Catch:{ Exception -> 0x0365 }] */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0074 A[Catch:{ Exception -> 0x0080 }] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0076 A[Catch:{ Exception -> 0x0080 }] */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0079 A[Catch:{ Exception -> 0x0080 }] */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0094 A[Catch:{ Exception -> 0x00a0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x0096 A[Catch:{ Exception -> 0x00a0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x0099 A[Catch:{ Exception -> 0x00a0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x00b4 A[Catch:{ Exception -> 0x00c0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x00b6 A[Catch:{ Exception -> 0x00c0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x00b9 A[Catch:{ Exception -> 0x00c0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x00d4 A[Catch:{ Exception -> 0x00de }] */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x00d6 A[Catch:{ Exception -> 0x00de }] */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x00d9 A[Catch:{ Exception -> 0x00de }] */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x00e9 A[Catch:{ Exception -> 0x036f }] */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x00f5 A[Catch:{ Exception -> 0x00ff }] */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x00f7 A[Catch:{ Exception -> 0x00ff }] */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x00fa A[Catch:{ Exception -> 0x00ff }] */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x010a A[Catch:{ Exception -> 0x036f }] */
        /* JADX WARNING: Removed duplicated region for block: B:98:0x0116 A[Catch:{ Exception -> 0x0120 }] */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x0118 A[Catch:{ Exception -> 0x0120 }] */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final wj2.C66132f mo90190f(java.lang.String r14) {
            /*
                r13 = this;
                java.lang.String r0 = "safeGetBoolean"
                java.lang.String r1 = "safeGetInt"
                java.lang.String r2 = "safeGetString"
                java.lang.String r3 = ""
                java.lang.String r4 = "json"
                gy3.C87412m.m108594g(r14, r4)
                wj2.f r4 = new wj2.f
                r4.<init>()
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x036f }
                r5.<init>(r14)     // Catch:{ Exception -> 0x036f }
                wj2.f$a r14 = wj2.C66132f.f190074D     // Catch:{ Exception -> 0x036f }
                d03.a r6 = new d03.a     // Catch:{ Exception -> 0x036f }
                r6.<init>()     // Catch:{ Exception -> 0x036f }
                java.lang.String r7 = "mInfo"
                r8 = 0
                r9 = 0
                r10 = 1
                boolean r11 = r5.has(r7)     // Catch:{ Exception -> 0x0037 }
                if (r11 != r10) goto L_0x002f
                r11 = 1
                goto L_0x0030
            L_0x002f:
                r11 = 0
            L_0x0030:
                if (r11 == 0) goto L_0x003f
                java.lang.String r7 = r5.getString(r7)     // Catch:{ Exception -> 0x0037 }
                goto L_0x0040
            L_0x0037:
                r7 = move-exception
                java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x036f }
                r11[r9] = r7     // Catch:{ Exception -> 0x036f }
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r3, r11)     // Catch:{ Exception -> 0x036f }
            L_0x003f:
                r7 = r8
            L_0x0040:
                if (r7 != 0) goto L_0x0043
                r7 = r3
            L_0x0043:
                d03.a r14 = r14.mo90184a(r6, r7)     // Catch:{ Exception -> 0x036f }
                r4.f190078a = r14     // Catch:{ Exception -> 0x036f }
                java.lang.String r14 = "mStartTime"
                r6 = 0
                boolean r11 = r5.has(r14)     // Catch:{ Exception -> 0x0060 }
                if (r11 != r10) goto L_0x0056
                r11 = 1
                goto L_0x0057
            L_0x0056:
                r11 = 0
            L_0x0057:
                if (r11 == 0) goto L_0x005e
                long r11 = r5.getLong(r14)     // Catch:{ Exception -> 0x0060 }
                goto L_0x0069
            L_0x005e:
                r11 = r6
                goto L_0x0069
            L_0x0060:
                r14 = move-exception
                java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x036f }
                r11[r9] = r14     // Catch:{ Exception -> 0x036f }
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r1, r3, r11)     // Catch:{ Exception -> 0x036f }
                goto L_0x005e
            L_0x0069:
                r4.f190079b = r11     // Catch:{ Exception -> 0x036f }
                java.lang.String r14 = "mEndTime"
                boolean r11 = r5.has(r14)     // Catch:{ Exception -> 0x0080 }
                if (r11 != r10) goto L_0x0076
                r11 = 1
                goto L_0x0077
            L_0x0076:
                r11 = 0
            L_0x0077:
                if (r11 == 0) goto L_0x007e
                long r11 = r5.getLong(r14)     // Catch:{ Exception -> 0x0080 }
                goto L_0x0089
            L_0x007e:
                r11 = r6
                goto L_0x0089
            L_0x0080:
                r14 = move-exception
                java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x036f }
                r11[r9] = r14     // Catch:{ Exception -> 0x036f }
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r1, r3, r11)     // Catch:{ Exception -> 0x036f }
                goto L_0x007e
            L_0x0089:
                r4.f190080c = r11     // Catch:{ Exception -> 0x036f }
                java.lang.String r14 = "mHashCode"
                boolean r11 = r5.has(r14)     // Catch:{ Exception -> 0x00a0 }
                if (r11 != r10) goto L_0x0096
                r11 = 1
                goto L_0x0097
            L_0x0096:
                r11 = 0
            L_0x0097:
                if (r11 == 0) goto L_0x009e
                java.lang.String r14 = r5.getString(r14)     // Catch:{ Exception -> 0x00a0 }
                goto L_0x00a9
            L_0x009e:
                r14 = r8
                goto L_0x00a9
            L_0x00a0:
                r14 = move-exception
                java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x036f }
                r11[r9] = r14     // Catch:{ Exception -> 0x036f }
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r3, r11)     // Catch:{ Exception -> 0x036f }
                goto L_0x009e
            L_0x00a9:
                r4.f190082e = r14     // Catch:{ Exception -> 0x036f }
                java.lang.String r14 = "mDuration"
                boolean r11 = r5.has(r14)     // Catch:{ Exception -> 0x00c0 }
                if (r11 != r10) goto L_0x00b6
                r11 = 1
                goto L_0x00b7
            L_0x00b6:
                r11 = 0
            L_0x00b7:
                if (r11 == 0) goto L_0x00be
                long r11 = r5.getLong(r14)     // Catch:{ Exception -> 0x00c0 }
                goto L_0x00c9
            L_0x00be:
                r11 = r6
                goto L_0x00c9
            L_0x00c0:
                r14 = move-exception
                java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x036f }
                r11[r9] = r14     // Catch:{ Exception -> 0x036f }
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r1, r3, r11)     // Catch:{ Exception -> 0x036f }
                goto L_0x00be
            L_0x00c9:
                r4.f190084g = r11     // Catch:{ Exception -> 0x036f }
                java.lang.String r14 = "mShortSongName"
                boolean r11 = r5.has(r14)     // Catch:{ Exception -> 0x00de }
                if (r11 != r10) goto L_0x00d6
                r11 = 1
                goto L_0x00d7
            L_0x00d6:
                r11 = 0
            L_0x00d7:
                if (r11 == 0) goto L_0x00e6
                java.lang.String r14 = r5.getString(r14)     // Catch:{ Exception -> 0x00de }
                goto L_0x00e7
            L_0x00de:
                r14 = move-exception
                java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x036f }
                r11[r9] = r14     // Catch:{ Exception -> 0x036f }
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r3, r11)     // Catch:{ Exception -> 0x036f }
            L_0x00e6:
                r14 = r8
            L_0x00e7:
                if (r14 != 0) goto L_0x00ea
                r14 = r3
            L_0x00ea:
                r4.f190086i = r14     // Catch:{ Exception -> 0x036f }
                java.lang.String r14 = "mSongName"
                boolean r11 = r5.has(r14)     // Catch:{ Exception -> 0x00ff }
                if (r11 != r10) goto L_0x00f7
                r11 = 1
                goto L_0x00f8
            L_0x00f7:
                r11 = 0
            L_0x00f8:
                if (r11 == 0) goto L_0x0107
                java.lang.String r14 = r5.getString(r14)     // Catch:{ Exception -> 0x00ff }
                goto L_0x0108
            L_0x00ff:
                r14 = move-exception
                java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x036f }
                r11[r9] = r14     // Catch:{ Exception -> 0x036f }
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r3, r11)     // Catch:{ Exception -> 0x036f }
            L_0x0107:
                r14 = r8
            L_0x0108:
                if (r14 != 0) goto L_0x010b
                r14 = r3
            L_0x010b:
                r4.f190085h = r14     // Catch:{ Exception -> 0x036f }
                java.lang.String r14 = "mSingerName"
                boolean r11 = r5.has(r14)     // Catch:{ Exception -> 0x0120 }
                if (r11 != r10) goto L_0x0118
                r11 = 1
                goto L_0x0119
            L_0x0118:
                r11 = 0
            L_0x0119:
                if (r11 == 0) goto L_0x0128
                java.lang.String r14 = r5.getString(r14)     // Catch:{ Exception -> 0x0120 }
                goto L_0x0129
            L_0x0120:
                r14 = move-exception
                java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x036f }
                r11[r9] = r14     // Catch:{ Exception -> 0x036f }
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r3, r11)     // Catch:{ Exception -> 0x036f }
            L_0x0128:
                r14 = r8
            L_0x0129:
                if (r14 != 0) goto L_0x012c
                r14 = r3
            L_0x012c:
                r4.f190087j = r14     // Catch:{ Exception -> 0x036f }
                java.lang.String r14 = "cover"
                boolean r11 = r5.has(r14)     // Catch:{ Exception -> 0x0140 }
                if (r11 != r10) goto L_0x0138
                r11 = 1
                goto L_0x0139
            L_0x0138:
                r11 = 0
            L_0x0139:
                if (r11 == 0) goto L_0x0148
                java.lang.String r14 = r5.getString(r14)     // Catch:{ Exception -> 0x0140 }
                goto L_0x0149
            L_0x0140:
                r14 = move-exception
                java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x036f }
                r11[r9] = r14     // Catch:{ Exception -> 0x036f }
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r3, r11)     // Catch:{ Exception -> 0x036f }
            L_0x0148:
                r14 = r8
            L_0x0149:
                if (r14 != 0) goto L_0x014c
                r14 = r3
            L_0x014c:
                r4.f190088k = r14     // Catch:{ Exception -> 0x036f }
                java.lang.String r14 = "channelId"
                boolean r11 = r5.has(r14)     // Catch:{ Exception -> 0x0160 }
                if (r11 != r10) goto L_0x0158
                r11 = 1
                goto L_0x0159
            L_0x0158:
                r11 = 0
            L_0x0159:
                if (r11 == 0) goto L_0x0168
                java.lang.String r14 = r5.getString(r14)     // Catch:{ Exception -> 0x0160 }
                goto L_0x0169
            L_0x0160:
                r14 = move-exception
                java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x036f }
                r11[r9] = r14     // Catch:{ Exception -> 0x036f }
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r3, r11)     // Catch:{ Exception -> 0x036f }
            L_0x0168:
                r14 = r8
            L_0x0169:
                if (r14 != 0) goto L_0x016c
                r14 = r3
            L_0x016c:
                r4.f190089l = r14     // Catch:{ Exception -> 0x036f }
                wj2.e$a r14 = wj2.C53183e.f148370d     // Catch:{ Exception -> 0x036f }
                java.lang.String r11 = "ringtoneSource"
                boolean r12 = r5.has(r11)     // Catch:{ Exception -> 0x0183 }
                if (r12 != r10) goto L_0x017b
                r12 = 1
                goto L_0x017c
            L_0x017b:
                r12 = 0
            L_0x017c:
                if (r12 == 0) goto L_0x018b
                int r11 = r5.getInt(r11)     // Catch:{ Exception -> 0x0183 }
                goto L_0x018c
            L_0x0183:
                r11 = move-exception
                java.lang.Object[] r12 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x036f }
                r12[r9] = r11     // Catch:{ Exception -> 0x036f }
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r1, r3, r12)     // Catch:{ Exception -> 0x036f }
            L_0x018b:
                r11 = 0
            L_0x018c:
                wj2.e r14 = r14.mo73863a(r11)     // Catch:{ Exception -> 0x036f }
                r4.f190090m = r14     // Catch:{ Exception -> 0x036f }
                java.lang.String r14 = "finderObjectId"
                boolean r11 = r5.has(r14)     // Catch:{ Exception -> 0x01a6 }
                if (r11 != r10) goto L_0x019c
                r11 = 1
                goto L_0x019d
            L_0x019c:
                r11 = 0
            L_0x019d:
                if (r11 == 0) goto L_0x01a4
                long r11 = r5.getLong(r14)     // Catch:{ Exception -> 0x01a6 }
                goto L_0x01af
            L_0x01a4:
                r11 = r6
                goto L_0x01af
            L_0x01a6:
                r14 = move-exception
                java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x036f }
                r11[r9] = r14     // Catch:{ Exception -> 0x036f }
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r1, r3, r11)     // Catch:{ Exception -> 0x036f }
                goto L_0x01a4
            L_0x01af:
                r4.f190092o = r11     // Catch:{ Exception -> 0x036f }
                java.lang.String r14 = "finderNonceId"
                boolean r11 = r5.has(r14)     // Catch:{ Exception -> 0x01c3 }
                if (r11 != r10) goto L_0x01bb
                r11 = 1
                goto L_0x01bc
            L_0x01bb:
                r11 = 0
            L_0x01bc:
                if (r11 == 0) goto L_0x01cb
                java.lang.String r14 = r5.getString(r14)     // Catch:{ Exception -> 0x01c3 }
                goto L_0x01cc
            L_0x01c3:
                r14 = move-exception
                java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x036f }
                r11[r9] = r14     // Catch:{ Exception -> 0x036f }
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r3, r11)     // Catch:{ Exception -> 0x036f }
            L_0x01cb:
                r14 = r8
            L_0x01cc:
                if (r14 != 0) goto L_0x01cf
                r14 = r3
            L_0x01cf:
                r4.f190093p = r14     // Catch:{ Exception -> 0x036f }
                java.lang.String r14 = "musicSid"
                boolean r11 = r5.has(r14)     // Catch:{ Exception -> 0x01e6 }
                if (r11 != r10) goto L_0x01dc
                r11 = 1
                goto L_0x01dd
            L_0x01dc:
                r11 = 0
            L_0x01dd:
                if (r11 == 0) goto L_0x01e4
                int r14 = r5.getInt(r14)     // Catch:{ Exception -> 0x01e6 }
                goto L_0x01ef
            L_0x01e4:
                r14 = 0
                goto L_0x01ef
            L_0x01e6:
                r14 = move-exception
                java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x036f }
                r11[r9] = r14     // Catch:{ Exception -> 0x036f }
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r1, r3, r11)     // Catch:{ Exception -> 0x036f }
                goto L_0x01e4
            L_0x01ef:
                r4.f190094q = r14     // Catch:{ Exception -> 0x036f }
                ve3.a1 r14 = new ve3.a1     // Catch:{ Exception -> 0x036f }
                r14.<init>()     // Catch:{ Exception -> 0x036f }
                java.lang.String r11 = "mVibrateInfo"
                boolean r12 = r5.has(r11)     // Catch:{ Exception -> 0x0209 }
                if (r12 != r10) goto L_0x0201
                r12 = 1
                goto L_0x0202
            L_0x0201:
                r12 = 0
            L_0x0202:
                if (r12 == 0) goto L_0x0211
                java.lang.String r11 = r5.getString(r11)     // Catch:{ Exception -> 0x0209 }
                goto L_0x0212
            L_0x0209:
                r11 = move-exception
                java.lang.Object[] r12 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x036f }
                r12[r9] = r11     // Catch:{ Exception -> 0x036f }
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r3, r12)     // Catch:{ Exception -> 0x036f }
            L_0x0211:
                r11 = r8
            L_0x0212:
                r14.f147574d = r11     // Catch:{ Exception -> 0x036f }
                rx3.b0 r11 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x036f }
                r4.f190095r = r14     // Catch:{ Exception -> 0x036f }
                java.lang.String r14 = "unAvailable"
                boolean r11 = r5.has(r14)     // Catch:{ Exception -> 0x022d }
                if (r11 != r10) goto L_0x0223
                r11 = 1
                goto L_0x0224
            L_0x0223:
                r11 = 0
            L_0x0224:
                if (r11 == 0) goto L_0x022b
                boolean r14 = r5.getBoolean(r14)     // Catch:{ Exception -> 0x022d }
                goto L_0x0236
            L_0x022b:
                r14 = 0
                goto L_0x0236
            L_0x022d:
                r14 = move-exception
                java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x036f }
                r11[r9] = r14     // Catch:{ Exception -> 0x036f }
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r0, r3, r11)     // Catch:{ Exception -> 0x036f }
                goto L_0x022b
            L_0x0236:
                r4.f190091n = r14     // Catch:{ Exception -> 0x036f }
                java.lang.String r14 = "createTime"
                boolean r11 = r5.has(r14)     // Catch:{ Exception -> 0x024a }
                if (r11 != r10) goto L_0x0242
                r11 = 1
                goto L_0x0243
            L_0x0242:
                r11 = 0
            L_0x0243:
                if (r11 == 0) goto L_0x0252
                long r6 = r5.getLong(r14)     // Catch:{ Exception -> 0x024a }
                goto L_0x0252
            L_0x024a:
                r14 = move-exception
                java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x036f }
                r11[r9] = r14     // Catch:{ Exception -> 0x036f }
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r1, r3, r11)     // Catch:{ Exception -> 0x036f }
            L_0x0252:
                r4.f190096s = r6     // Catch:{ Exception -> 0x036f }
                java.lang.String r14 = "finderAuthorHeadUrl"
                boolean r6 = r5.has(r14)     // Catch:{ Exception -> 0x0266 }
                if (r6 != r10) goto L_0x025e
                r6 = 1
                goto L_0x025f
            L_0x025e:
                r6 = 0
            L_0x025f:
                if (r6 == 0) goto L_0x026e
                java.lang.String r14 = r5.getString(r14)     // Catch:{ Exception -> 0x0266 }
                goto L_0x026f
            L_0x0266:
                r14 = move-exception
                java.lang.Object[] r6 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x036f }
                r6[r9] = r14     // Catch:{ Exception -> 0x036f }
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r3, r6)     // Catch:{ Exception -> 0x036f }
            L_0x026e:
                r14 = r8
            L_0x026f:
                if (r14 != 0) goto L_0x0272
                r14 = r3
            L_0x0272:
                r4.f190097t = r14     // Catch:{ Exception -> 0x036f }
                java.lang.String r14 = "finderAuthIconUrl"
                boolean r6 = r5.has(r14)     // Catch:{ Exception -> 0x0286 }
                if (r6 != r10) goto L_0x027e
                r6 = 1
                goto L_0x027f
            L_0x027e:
                r6 = 0
            L_0x027f:
                if (r6 == 0) goto L_0x028e
                java.lang.String r14 = r5.getString(r14)     // Catch:{ Exception -> 0x0286 }
                goto L_0x028f
            L_0x0286:
                r14 = move-exception
                java.lang.Object[] r6 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x036f }
                r6[r9] = r14     // Catch:{ Exception -> 0x036f }
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r3, r6)     // Catch:{ Exception -> 0x036f }
            L_0x028e:
                r14 = r8
            L_0x028f:
                if (r14 != 0) goto L_0x0292
                r14 = r3
            L_0x0292:
                r4.f190098u = r14     // Catch:{ Exception -> 0x036f }
                java.lang.String r14 = "finderAuthProfession"
                boolean r6 = r5.has(r14)     // Catch:{ Exception -> 0x02a6 }
                if (r6 != r10) goto L_0x029e
                r6 = 1
                goto L_0x029f
            L_0x029e:
                r6 = 0
            L_0x029f:
                if (r6 == 0) goto L_0x02ae
                java.lang.String r14 = r5.getString(r14)     // Catch:{ Exception -> 0x02a6 }
                goto L_0x02af
            L_0x02a6:
                r14 = move-exception
                java.lang.Object[] r6 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x036f }
                r6[r9] = r14     // Catch:{ Exception -> 0x036f }
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r3, r6)     // Catch:{ Exception -> 0x036f }
            L_0x02ae:
                r14 = r8
            L_0x02af:
                if (r14 != 0) goto L_0x02b2
                r14 = r3
            L_0x02b2:
                r4.f190099v = r14     // Catch:{ Exception -> 0x036f }
                java.lang.String r14 = "finderAuthProfessionType"
                boolean r6 = r5.has(r14)     // Catch:{ Exception -> 0x02c8 }
                if (r6 != r10) goto L_0x02be
                r6 = 1
                goto L_0x02bf
            L_0x02be:
                r6 = 0
            L_0x02bf:
                if (r6 == 0) goto L_0x02c6
                int r14 = r5.getInt(r14)     // Catch:{ Exception -> 0x02c8 }
                goto L_0x02d1
            L_0x02c6:
                r14 = 0
                goto L_0x02d1
            L_0x02c8:
                r14 = move-exception
                java.lang.Object[] r6 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x036f }
                r6[r9] = r14     // Catch:{ Exception -> 0x036f }
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r1, r3, r6)     // Catch:{ Exception -> 0x036f }
                goto L_0x02c6
            L_0x02d1:
                r4.f190100w = r14     // Catch:{ Exception -> 0x036f }
                java.lang.String r14 = "authProfessionType"
                boolean r6 = r5.has(r14)     // Catch:{ Exception -> 0x02e7 }
                if (r6 != r10) goto L_0x02dd
                r6 = 1
                goto L_0x02de
            L_0x02dd:
                r6 = 0
            L_0x02de:
                if (r6 == 0) goto L_0x02e5
                int r14 = r5.getInt(r14)     // Catch:{ Exception -> 0x02e7 }
                goto L_0x02f0
            L_0x02e5:
                r14 = 0
                goto L_0x02f0
            L_0x02e7:
                r14 = move-exception
                java.lang.Object[] r6 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x036f }
                r6[r9] = r14     // Catch:{ Exception -> 0x036f }
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r1, r3, r6)     // Catch:{ Exception -> 0x036f }
                goto L_0x02e5
            L_0x02f0:
                r4.f190101x = r14     // Catch:{ Exception -> 0x036f }
                java.lang.String r14 = "singerFinderUserName"
                boolean r1 = r5.has(r14)     // Catch:{ Exception -> 0x0305 }
                if (r1 != r10) goto L_0x02fd
                r1 = 1
                goto L_0x02fe
            L_0x02fd:
                r1 = 0
            L_0x02fe:
                if (r1 == 0) goto L_0x030d
                java.lang.String r14 = r5.getString(r14)     // Catch:{ Exception -> 0x0305 }
                goto L_0x030e
            L_0x0305:
                r14 = move-exception
                java.lang.Object[] r1 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x036f }
                r1[r9] = r14     // Catch:{ Exception -> 0x036f }
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r3, r1)     // Catch:{ Exception -> 0x036f }
            L_0x030d:
                r14 = r8
            L_0x030e:
                if (r14 != 0) goto L_0x0311
                r14 = r3
            L_0x0311:
                r4.f190075A = r14     // Catch:{ Exception -> 0x036f }
                java.lang.String r14 = "singerBaikeURL"
                boolean r1 = r5.has(r14)     // Catch:{ Exception -> 0x0326 }
                if (r1 != r10) goto L_0x031e
                r1 = 1
                goto L_0x031f
            L_0x031e:
                r1 = 0
            L_0x031f:
                if (r1 == 0) goto L_0x032e
                java.lang.String r14 = r5.getString(r14)     // Catch:{ Exception -> 0x0326 }
                goto L_0x032f
            L_0x0326:
                r14 = move-exception
                java.lang.Object[] r1 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x036f }
                r1[r9] = r14     // Catch:{ Exception -> 0x036f }
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r3, r1)     // Catch:{ Exception -> 0x036f }
            L_0x032e:
                r14 = r8
            L_0x032f:
                if (r14 != 0) goto L_0x0332
                r14 = r3
            L_0x0332:
                r4.f190076B = r14     // Catch:{ Exception -> 0x036f }
                java.lang.String r14 = "finderUserName"
                boolean r1 = r5.has(r14)     // Catch:{ Exception -> 0x0346 }
                if (r1 != r10) goto L_0x033e
                r1 = 1
                goto L_0x033f
            L_0x033e:
                r1 = 0
            L_0x033f:
                if (r1 == 0) goto L_0x034e
                java.lang.String r8 = r5.getString(r14)     // Catch:{ Exception -> 0x0346 }
                goto L_0x034e
            L_0x0346:
                r14 = move-exception
                java.lang.Object[] r1 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x036f }
                r1[r9] = r14     // Catch:{ Exception -> 0x036f }
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r3, r1)     // Catch:{ Exception -> 0x036f }
            L_0x034e:
                if (r8 != 0) goto L_0x0351
                r8 = r3
            L_0x0351:
                r4.f190103z = r8     // Catch:{ Exception -> 0x036f }
                java.lang.String r14 = "hasBgm"
                boolean r1 = r5.has(r14)     // Catch:{ Exception -> 0x0365 }
                if (r1 != r10) goto L_0x035d
                r1 = 1
                goto L_0x035e
            L_0x035d:
                r1 = 0
            L_0x035e:
                if (r1 == 0) goto L_0x036d
                boolean r9 = r5.getBoolean(r14)     // Catch:{ Exception -> 0x0365 }
                goto L_0x036d
            L_0x0365:
                r14 = move-exception
                java.lang.Object[] r1 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x036f }
                r1[r9] = r14     // Catch:{ Exception -> 0x036f }
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r0, r3, r1)     // Catch:{ Exception -> 0x036f }
            L_0x036d:
                r4.f190102y = r9     // Catch:{ Exception -> 0x036f }
            L_0x036f:
                rx3.b0 r14 = rx3.C13598b0.f38549a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: wj2.C66135h.C66136a.mo90190f(java.lang.String):wj2.f");
        }

        /* renamed from: g */
        public final C66132f mo90191g(long j, long j2, C65685n0 n0Var, String str) {
            C65679e0 e0Var;
            String str2;
            LinkedList<String> linkedList;
            C65685n0 n0Var2 = n0Var;
            C87412m.m108594g(n0Var2, "rawDetail");
            C65681f0 f0Var = n0Var2.f189021e;
            String str3 = null;
            if (f0Var == null || (e0Var = f0Var.f188985d) == null) {
                return null;
            }
            int i = e0Var.f188982d;
            String str4 = "music_ringtone_" + i;
            String d = C61767o.f175575a.mo86687d(i, str4);
            C66132f fVar = new C66132f();
            fVar.f190078a = new C58010a(str4, d, f0Var.f188989h, 0, 0);
            fVar.f190079b = j;
            C65681f0 f0Var2 = n0Var2.f189021e;
            String str5 = f0Var2 != null ? f0Var2.f188988g : null;
            String str6 = "";
            if (str5 == null) {
                str5 = str6;
            }
            fVar.f190088k = str5;
            fVar.f190083f = n0Var2;
            fVar.f190080c = j2;
            fVar.f190082e = str;
            fVar.f190084g = f0Var.f188990i;
            C65681f0 f0Var3 = n0Var2.f189021e;
            if (f0Var3 == null || (linkedList = f0Var3.f188987f) == null || (str2 = (String) C110818d0.m150916N(linkedList)) == null) {
                str2 = str6;
            }
            fVar.f190087j = str2;
            C65681f0 f0Var4 = n0Var2.f189021e;
            if (f0Var4 != null) {
                str3 = f0Var4.f188986e;
            }
            if (str3 != null) {
                str6 = str3;
            }
            fVar.f190085h = str6;
            fVar.f190086i = str6;
            fVar.f190094q = i;
            fVar.f190095r = n0Var2.f189026j;
            return fVar;
        }
    }
}
