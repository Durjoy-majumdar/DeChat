package at1;

import a14.C53934p0;
import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import c14.C54625h;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import di3.C86301e;
import ei3.C86522b;
import fy3.C32226l;
import gy3.C8478d0;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import ht1.C8764e5;
import java.util.LinkedList;
import ob0.C89132b;
import org.json.JSONObject;
import rx3.C13598b0;
import te3.C48727ak1;
import te3.C50008jm0;
import wb2.C65946a;
import wx3.C15601d;

@C86522b
/* renamed from: at1.b */
public final class C0217b extends C86301e implements C8764e5 {

    /* renamed from: at1.b$a */
    public static final class C0218a extends C87413o implements C32226l<JSONObject, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ LinkedList<C48727ak1> f735d;

        /* renamed from: e */
        public final /* synthetic */ C8478d0 f736e;

        /* renamed from: f */
        public final /* synthetic */ int f737f;

        /* renamed from: g */
        public final /* synthetic */ C8479f0<C48727ak1> f738g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0218a(LinkedList<C48727ak1> linkedList, C8478d0 d0Var, int i, C8479f0<C48727ak1> f0Var) {
            super(1);
            this.f735d = linkedList;
            this.f736e = d0Var;
            this.f737f = i;
            this.f738g = f0Var;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0033 A[Catch:{ Exception -> 0x003d }] */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0035 A[Catch:{ Exception -> 0x003d }] */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0038 A[Catch:{ Exception -> 0x003d }] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x004e A[Catch:{ Exception -> 0x0058 }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0050 A[Catch:{ Exception -> 0x0058 }] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0053 A[Catch:{ Exception -> 0x0058 }] */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x006a A[Catch:{ Exception -> 0x0074 }] */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x006c A[Catch:{ Exception -> 0x0074 }] */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x006f A[Catch:{ Exception -> 0x0074 }] */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x0085 A[Catch:{ Exception -> 0x008f }] */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x0087 A[Catch:{ Exception -> 0x008f }] */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x008a A[Catch:{ Exception -> 0x008f }] */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x009f A[Catch:{ Exception -> 0x00a9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x00a1 A[Catch:{ Exception -> 0x00a9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x00a4 A[Catch:{ Exception -> 0x00a9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x00c4  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x00e7  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r12) {
            /*
                r11 = this;
                org.json.JSONObject r12 = (org.json.JSONObject) r12
                java.lang.String r0 = "safeGetString"
                java.lang.String r1 = ""
                java.lang.String r2 = "searchObj"
                gy3.C87412m.m108594g(r12, r2)
                java.lang.String r2 = "hotword_text"
                r3 = 0
                r4 = 1
                r5 = 0
                boolean r6 = r12.has(r2)     // Catch:{ Exception -> 0x0022 }
                if (r6 != r4) goto L_0x001a
                r6 = 1
                goto L_0x001b
            L_0x001a:
                r6 = 0
            L_0x001b:
                if (r6 == 0) goto L_0x002a
                java.lang.String r2 = r12.getString(r2)     // Catch:{ Exception -> 0x0022 }
                goto L_0x002b
            L_0x0022:
                r2 = move-exception
                java.lang.Object[] r6 = new java.lang.Object[r4]
                r6[r5] = r2
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r0, r1, r6)
            L_0x002a:
                r2 = r3
            L_0x002b:
                java.lang.String r6 = "link"
                boolean r7 = r12.has(r6)     // Catch:{ Exception -> 0x003d }
                if (r7 != r4) goto L_0x0035
                r7 = 1
                goto L_0x0036
            L_0x0035:
                r7 = 0
            L_0x0036:
                if (r7 == 0) goto L_0x0045
                java.lang.String r6 = r12.getString(r6)     // Catch:{ Exception -> 0x003d }
                goto L_0x0046
            L_0x003d:
                r6 = move-exception
                java.lang.Object[] r7 = new java.lang.Object[r4]
                r7[r5] = r6
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r0, r1, r7)
            L_0x0045:
                r6 = r3
            L_0x0046:
                java.lang.String r7 = "appid"
                boolean r8 = r12.has(r7)     // Catch:{ Exception -> 0x0058 }
                if (r8 != r4) goto L_0x0050
                r8 = 1
                goto L_0x0051
            L_0x0050:
                r8 = 0
            L_0x0051:
                if (r8 == 0) goto L_0x0060
                java.lang.String r7 = r12.getString(r7)     // Catch:{ Exception -> 0x0058 }
                goto L_0x0061
            L_0x0058:
                r7 = move-exception
                java.lang.Object[] r8 = new java.lang.Object[r4]
                r8[r5] = r7
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r0, r1, r8)
            L_0x0060:
                r7 = r3
            L_0x0061:
                java.lang.String r8 = "sessionBuffer"
                boolean r9 = r12.has(r8)     // Catch:{ Exception -> 0x0074 }
                if (r9 != r4) goto L_0x006c
                r9 = 1
                goto L_0x006d
            L_0x006c:
                r9 = 0
            L_0x006d:
                if (r9 == 0) goto L_0x007c
                java.lang.String r8 = r12.getString(r8)     // Catch:{ Exception -> 0x0074 }
                goto L_0x007d
            L_0x0074:
                r8 = move-exception
                java.lang.Object[] r9 = new java.lang.Object[r4]
                r9[r5] = r8
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r0, r1, r9)
            L_0x007c:
                r8 = r3
            L_0x007d:
                java.lang.String r9 = "reasonWording"
                boolean r10 = r12.has(r9)     // Catch:{ Exception -> 0x008f }
                if (r10 != r4) goto L_0x0087
                r10 = 1
                goto L_0x0088
            L_0x0087:
                r10 = 0
            L_0x0088:
                if (r10 == 0) goto L_0x0097
                java.lang.String r3 = r12.getString(r9)     // Catch:{ Exception -> 0x008f }
                goto L_0x0097
            L_0x008f:
                r9 = move-exception
                java.lang.Object[] r10 = new java.lang.Object[r4]
                r10[r5] = r9
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r0, r1, r10)
            L_0x0097:
                java.lang.String r0 = "action_type"
                boolean r9 = r12.has(r0)     // Catch:{ Exception -> 0x00a9 }
                if (r9 != r4) goto L_0x00a1
                r9 = 1
                goto L_0x00a2
            L_0x00a1:
                r9 = 0
            L_0x00a2:
                if (r9 == 0) goto L_0x00b4
                int r12 = r12.getInt(r0)     // Catch:{ Exception -> 0x00a9 }
                goto L_0x00b5
            L_0x00a9:
                r12 = move-exception
                java.lang.Object[] r0 = new java.lang.Object[r4]
                r0[r5] = r12
                java.lang.String r12 = "safeGetInt"
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r12, r1, r0)
            L_0x00b4:
                r12 = 0
            L_0x00b5:
                te3.ak1 r0 = new te3.ak1
                r0.<init>()
                r0.f130586d = r2
                r0.f130587e = r12
                r0.f130588f = r6
                r0.f130589g = r7
                if (r8 == 0) goto L_0x00d8
                pe3.b r12 = new pe3.b
                java.nio.charset.Charset r1 = z04.C119027c.f356488a
                byte[] r1 = r8.getBytes(r1)
                java.lang.String r2 = "this as java.lang.String).getBytes(charset)"
                gy3.C87412m.m108593f(r1, r2)
                int r2 = r1.length
                r12.<init>(r1, r5, r2)
                r0.f130590h = r12
            L_0x00d8:
                r0.f130591i = r3
                java.util.LinkedList<te3.ak1> r12 = r11.f735d
                r12.add(r0)
                gy3.d0 r12 = r11.f736e
                int r1 = r12.f27483d
                int r2 = r11.f737f
                if (r1 != r2) goto L_0x00eb
                gy3.f0<te3.ak1> r2 = r11.f738g
                r2.f27484d = r0
            L_0x00eb:
                int r1 = r1 + r4
                r12.f27483d = r1
                rx3.b0 r12 = rx3.C13598b0.f38549a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: at1.C0217b.C0218a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: at1.b$b */
    public static final class C0219b<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ Context f739a;

        /* renamed from: b */
        public final /* synthetic */ C54625h<String> f740b;

        /* renamed from: c */
        public final /* synthetic */ C0217b f741c;

        public C0219b(Context context, C54625h<String> hVar, C0217b bVar) {
            this.f739a = context;
            this.f740b = hVar;
            this.f741c = bVar;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            LifecycleScope c3 = ((C65946a) C39818r.f106831a.mo62444c((AppCompatActivity) this.f739a).mo75002a(C65946a.class)).mo89983c3();
            try {
                String str = ((C50008jm0) cVar.f256796d).f136194r;
                if (str == null) {
                    str = "";
                }
                return LifecycleScope.launchDefault$default(c3, (C53934p0) null, new C0220c(new JSONObject(str), this.f740b, (C15601d<? super C0220c>) null), 1, (Object) null);
            } catch (Throwable unused) {
                return LifecycleScope.launchDefault$default(c3, (C53934p0) null, new C0221d(this.f740b, this.f741c, (C15601d<? super C0221d>) null), 1, (Object) null);
            }
        }
    }

    /* renamed from: CR */
    public boolean mo242CR(Context context, JSONObject jSONObject) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(jSONObject, "json");
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c A[Catch:{ Exception -> 0x0067 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0080 A[SYNTHETIC, Splitter:B:40:0x0080] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008d A[Catch:{ Exception -> 0x0088 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a5 A[Catch:{ Exception -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a7 A[Catch:{ Exception -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00aa A[Catch:{ Exception -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e6  */
    /* renamed from: MD */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo243MD(android.content.Context r20, org.json.JSONObject r21) {
        /*
            r19 = this;
            r1 = r21
            java.lang.String r2 = "safeGetInt"
            java.lang.Class<dp1.y0> r3 = dp1.C58417y0.class
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r4 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            java.lang.String r5 = ""
            java.lang.String r0 = "context"
            r7 = r20
            gy3.C87412m.m108594g(r7, r0)
            java.lang.String r0 = "json"
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "tabtype"
            r6 = -1
            r13 = 0
            r14 = 1
            boolean r8 = r1.has(r0)     // Catch:{ Exception -> 0x0030 }
            if (r8 != r14) goto L_0x0025
            r8 = 1
            goto L_0x0026
        L_0x0025:
            r8 = 0
        L_0x0026:
            if (r8 == 0) goto L_0x002d
            int r0 = r1.getInt(r0)     // Catch:{ Exception -> 0x0030 }
            goto L_0x002e
        L_0x002d:
            r0 = -1
        L_0x002e:
            r8 = r0
            goto L_0x0039
        L_0x0030:
            r0 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r14]
            r8[r13] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r5, r8)
            r8 = -1
        L_0x0039:
            java.lang.String r0 = "finderstreamParams"
            boolean r9 = r1.has(r0)     // Catch:{ Exception -> 0x004e }
            if (r9 != r14) goto L_0x0043
            r9 = 1
            goto L_0x0044
        L_0x0043:
            r9 = 0
        L_0x0044:
            if (r9 == 0) goto L_0x004b
            org.json.JSONObject r0 = r1.getJSONObject(r0)     // Catch:{ Exception -> 0x004e }
            goto L_0x004c
        L_0x004b:
            r0 = 0
        L_0x004c:
            r2 = r0
            goto L_0x0057
        L_0x004e:
            r0 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r14]
            r9[r13] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r5, r9)
            r2 = 0
        L_0x0057:
            java.lang.String r0 = "targetFeedId"
            java.lang.String r9 = "safeGetString"
            if (r2 == 0) goto L_0x0069
            boolean r10 = r2.has(r0)     // Catch:{ Exception -> 0x0067 }
            if (r10 != r14) goto L_0x0069
            r10 = 1
            goto L_0x006a
        L_0x0067:
            r0 = move-exception
            goto L_0x0071
        L_0x0069:
            r10 = 0
        L_0x006a:
            if (r10 == 0) goto L_0x007a
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x0067 }
            goto L_0x007b
        L_0x0071:
            java.lang.Object[] r10 = new java.lang.Object[r14]
            r10[r13] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r9, r5, r10)
            r12 = 0
            goto L_0x007c
        L_0x007a:
            r0 = 0
        L_0x007b:
            r12 = r0
        L_0x007c:
            java.lang.String r0 = "h5ByPass"
            if (r2 == 0) goto L_0x008a
            boolean r10 = r2.has(r0)     // Catch:{ Exception -> 0x0088 }
            if (r10 != r14) goto L_0x008a
            r10 = 1
            goto L_0x008b
        L_0x0088:
            r0 = move-exception
            goto L_0x0092
        L_0x008a:
            r10 = 0
        L_0x008b:
            if (r10 == 0) goto L_0x009b
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x0088 }
            goto L_0x009c
        L_0x0092:
            java.lang.Object[] r2 = new java.lang.Object[r14]
            r2[r13] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r9, r5, r2)
            r2 = 0
            goto L_0x009d
        L_0x009b:
            r0 = 0
        L_0x009c:
            r2 = r0
        L_0x009d:
            java.lang.String r0 = "reportInfo"
            boolean r10 = r1.has(r0)     // Catch:{ Exception -> 0x00af }
            if (r10 != r14) goto L_0x00a7
            r10 = 1
            goto L_0x00a8
        L_0x00a7:
            r10 = 0
        L_0x00a8:
            if (r10 == 0) goto L_0x00b7
            java.lang.String r0 = r1.getString(r0)     // Catch:{ Exception -> 0x00af }
            goto L_0x00b8
        L_0x00af:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r14]
            r1[r13] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r9, r5, r1)
        L_0x00b7:
            r0 = 0
        L_0x00b8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r9 = "[enterFinderTimeline] tabType="
            r1.append(r9)
            r1.append(r8)
            java.lang.String r9 = " feedId="
            r1.append(r9)
            r1.append(r12)
            java.lang.String r9 = " h5ByPass="
            r1.append(r9)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r9 = "Finder.WebSearchService"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
            if (r8 != r6) goto L_0x00e6
            java.lang.String r0 = "[enterFinderTimeline] tabType is error!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
            return r13
        L_0x00e6:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            long r9 = o40.C61926c.m72671P(r12)
            java.lang.String r6 = "KEY_GUIDE_BAR_OBJ_ID"
            r1.putExtra(r6, r9)
            java.lang.String r6 = "KEY_BY_PASS_INFO"
            r1.putExtra(r6, r2)
            r2 = 30
            r11 = 4
            r10 = 3
            r9 = 2
            if (r8 == r14) goto L_0x013a
            if (r8 == r10) goto L_0x0120
            if (r8 == r11) goto L_0x0106
            r2 = r5
            goto L_0x0153
        L_0x0106:
            java.lang.String r6 = "KEY_FINDER_POST_FINISH_JUMP_HOT_TAB"
            r1.putExtra(r6, r14)
            di3.d r6 = di3.C86312j.m106911c(r4)
            com.tencent.mm.plugin.FinderCommonFeatureService r6 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r6
            di3.d r3 = di3.C86312j.m106911c(r3)
            dp1.y0 r3 = (dp1.C58417y0) r3
            int r3 = r3.mo83328dc(r11)
            java.lang.String r2 = r6.mo76802R1(r2, r9, r3)
            goto L_0x0153
        L_0x0120:
            java.lang.String r6 = "KEY_FINDER_POST_FINISH_JUMP_FOLLOW_TAB"
            r1.putExtra(r6, r14)
            di3.d r6 = di3.C86312j.m106911c(r4)
            com.tencent.mm.plugin.FinderCommonFeatureService r6 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r6
            di3.d r3 = di3.C86312j.m106911c(r3)
            dp1.y0 r3 = (dp1.C58417y0) r3
            int r3 = r3.mo83328dc(r10)
            java.lang.String r2 = r6.mo76802R1(r2, r9, r3)
            goto L_0x0153
        L_0x013a:
            java.lang.String r6 = "KEY_FINDER_POST_FINISH_JUMP_FRIEND_TAB"
            r1.putExtra(r6, r14)
            di3.d r6 = di3.C86312j.m106911c(r4)
            com.tencent.mm.plugin.FinderCommonFeatureService r6 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r6
            di3.d r3 = di3.C86312j.m106911c(r3)
            dp1.y0 r3 = (dp1.C58417y0) r3
            int r3 = r3.mo83328dc(r14)
            java.lang.String r2 = r6.mo76802R1(r2, r9, r3)
        L_0x0153:
            bl3.r r3 = bl3.C39818r.f106831a
            bl3.r$a r3 = r3.mo62446e(r4)
            java.lang.Class<os1.f> r6 = os1.C11739f.class
            androidx.lifecycle.i0 r3 = r3.mo75002a(r6)
            os1.f r3 = (os1.C11739f) r3
            os1.f$a r3 = r3.mo11600c3(r8)
            os1.f$c r6 = os1.C11739f.C11742c.HardRefresh
            r3.f34376i = r6
            r9 = 0
            r3.f34374g = r9
            java.lang.String r3 = "KEY_FINDER_IS_NEED_REFRESH_TAB"
            r1.putExtra(r3, r14)
            di3.d r3 = di3.C86312j.m106911c(r4)
            com.tencent.mm.plugin.FinderCommonFeatureService r3 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r3
            r3.mo76739CG(r2, r1)
            java.lang.String r3 = ";"
            java.lang.String r4 = ","
            if (r0 == 0) goto L_0x0186
            java.lang.String r6 = z04.C112551y.m153814n(r0, r4, r3, r13)
            goto L_0x0187
        L_0x0186:
            r6 = 0
        L_0x0187:
            java.lang.String r8 = "key_extra_info"
            r1.putExtra(r8, r6)
            java.lang.Class<er1.b> r6 = er1.C58684b.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            java.lang.String r8 = "getService(ActivityRouter::class.java)"
            gy3.C87412m.m108593f(r6, r8)
            er1.b r6 = (er1.C58684b) r6
            r9 = 4
            r10 = 0
            r17 = 8
            r18 = 0
            r7 = r20
            r8 = r1
            r1 = 2
            r16 = 3
            r15 = 4
            r11 = r17
            r17 = r12
            r12 = r18
            er1.C58684b.by0(r6, r7, r8, r9, r10, r11, r12)
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r7 = 21140(0x5294, float:2.9623E-41)
            java.lang.Object[] r8 = new java.lang.Object[r15]
            r8[r13] = r2
            if (r0 == 0) goto L_0x01be
            java.lang.String r15 = z04.C112551y.m153814n(r0, r4, r3, r13)
            goto L_0x01bf
        L_0x01be:
            r15 = 0
        L_0x01bf:
            r8[r14] = r15
            r8[r1] = r17
            r8[r16] = r5
            r6.mo160131h(r7, r8)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: at1.C0217b.mo243MD(android.content.Context, org.json.JSONObject):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0139 A[RETURN] */
    /* renamed from: Rt */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo244Rt(android.content.Context r19, org.json.JSONObject r20) {
        /*
            r18 = this;
            r13 = r19
            r1 = r20
            java.lang.String r2 = "safeGetString"
            java.lang.String r3 = "safeGetInt"
            java.lang.String r14 = ""
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r13, r0)
            java.lang.String r0 = "json"
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "selectIndex"
            r4 = -1
            r5 = 0
            r15 = 1
            boolean r6 = r1.has(r0)     // Catch:{ Exception -> 0x002f }
            if (r6 != r15) goto L_0x0024
            r6 = 1
            goto L_0x0025
        L_0x0024:
            r6 = 0
        L_0x0025:
            if (r6 == 0) goto L_0x002c
            int r0 = r1.getInt(r0)     // Catch:{ Exception -> 0x002f }
            goto L_0x002d
        L_0x002c:
            r0 = -1
        L_0x002d:
            r6 = r0
            goto L_0x0038
        L_0x002f:
            r0 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r15]
            r6[r5] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r3, r14, r6)
            r6 = -1
        L_0x0038:
            java.lang.String r0 = "scene"
            r12 = 0
            boolean r7 = r1.has(r0)     // Catch:{ Exception -> 0x004f }
            if (r7 != r15) goto L_0x0044
            r7 = 1
            goto L_0x0045
        L_0x0044:
            r7 = 0
        L_0x0045:
            if (r7 == 0) goto L_0x004c
            java.lang.String r0 = r1.getString(r0)     // Catch:{ Exception -> 0x004f }
            goto L_0x004d
        L_0x004c:
            r0 = r12
        L_0x004d:
            r7 = r0
            goto L_0x0058
        L_0x004f:
            r0 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r15]
            r7[r5] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r14, r7)
            r7 = r12
        L_0x0058:
            java.lang.String r0 = "reportInfo"
            boolean r8 = r1.has(r0)     // Catch:{ Exception -> 0x006d }
            if (r8 != r15) goto L_0x0062
            r8 = 1
            goto L_0x0063
        L_0x0062:
            r8 = 0
        L_0x0063:
            if (r8 == 0) goto L_0x006a
            java.lang.String r0 = r1.getString(r0)     // Catch:{ Exception -> 0x006d }
            goto L_0x006b
        L_0x006a:
            r0 = r12
        L_0x006b:
            r2 = r0
            goto L_0x0076
        L_0x006d:
            r0 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r15]
            r8[r5] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r14, r8)
            r2 = r12
        L_0x0076:
            java.lang.String r8 = "Finder.WebSearchService"
            if (r6 != r4) goto L_0x0080
            java.lang.String r0 = "[enterFinderSearch] selectIndex is error!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            return r5
        L_0x0080:
            gy3.f0 r4 = new gy3.f0
            r4.<init>()
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            java.lang.String r0 = "allSearchWord"
            boolean r10 = r1.has(r0)     // Catch:{ Exception -> 0x009c }
            if (r10 != r15) goto L_0x0094
            r10 = 1
            goto L_0x0095
        L_0x0094:
            r10 = 0
        L_0x0095:
            if (r10 == 0) goto L_0x00a4
            org.json.JSONArray r0 = r1.getJSONArray(r0)     // Catch:{ Exception -> 0x009c }
            goto L_0x00a5
        L_0x009c:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r15]
            r1[r5] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r3, r14, r1)
        L_0x00a4:
            r0 = r12
        L_0x00a5:
            if (r0 == 0) goto L_0x00b4
            gy3.d0 r1 = new gy3.d0
            r1.<init>()
            at1.b$a r3 = new at1.b$a
            r3.<init>(r9, r1, r6, r4)
            p170ic.C87689c.m109089b(r0, r3)
        L_0x00b4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[enterFinderSearch] selectIndex="
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = " searchWord="
            r0.append(r1)
            T r1 = r4.f27484d
            te3.ak1 r1 = (te3.C48727ak1) r1
            if (r1 == 0) goto L_0x00cf
            java.lang.String r1 = r1.f130586d
            goto L_0x00d0
        L_0x00cf:
            r1 = r12
        L_0x00d0:
            r0.append(r1)
            java.lang.String r1 = " hotWordList="
            r0.append(r1)
            int r1 = r9.size()
            r0.append(r1)
            java.lang.String r1 = " scene="
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = " reportInfo="
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            T r0 = r4.f27484d
            te3.ak1 r0 = (te3.C48727ak1) r0
            if (r0 == 0) goto L_0x0139
            android.content.Intent r11 = new android.content.Intent
            r11.<init>()
            rs1.s8$a r1 = rs1.C13442s8.f38060Q0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r16 = 252(0xfc, float:3.53E-43)
            r17 = 0
            r2 = r19
            r3 = r11
            r15 = r11
            r11 = r16
            r16 = r14
            r14 = r12
            r12 = r17
            rs1.C13442s8.C13443a.m12791e(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r0 = r0.f130586d
            if (r0 != 0) goto L_0x0122
            r0 = r16
        L_0x0122:
            java.lang.String r1 = "key_search_query"
            r15.putExtra(r1, r0)
            java.lang.String r0 = "key_search_is_from_wx_global_search"
            r1 = 1
            r15.putExtra(r0, r1)
            java.lang.Class<er1.b> r0 = er1.C58684b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            er1.b r0 = (er1.C58684b) r0
            r0.Hx0(r13, r14, r15)
            return r1
        L_0x0139:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: at1.C0217b.mo244Rt(android.content.Context, org.json.JSONObject):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0058 A[Catch:{ Exception -> 0x0065 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005a A[Catch:{ Exception -> 0x0065 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d A[Catch:{ Exception -> 0x0065 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d14.C45252f<java.lang.String> xj0(android.content.Context r32, org.json.JSONObject r33) {
        /*
            r31 = this;
            r1 = r32
            r2 = r33
            java.lang.String r3 = ""
            java.lang.String r4 = "safeGetString"
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "json"
            gy3.C87412m.m108594g(r2, r0)
            r5 = 0
            r6 = 0
            r0 = 7
            c14.h r7 = c14.C54629k.m61479a(r5, r6, r6, r0, r6)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r8 = "[getFinderItemDetail] "
            r0.append(r8)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r8 = "Finder.WebSearchService"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            java.lang.String r0 = "feedid"
            r8 = 1
            boolean r9 = r2.has(r0)     // Catch:{ Exception -> 0x0043 }
            if (r9 != r8) goto L_0x003b
            r9 = 1
            goto L_0x003c
        L_0x003b:
            r9 = 0
        L_0x003c:
            if (r9 == 0) goto L_0x004b
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x0043 }
            goto L_0x004c
        L_0x0043:
            r0 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r8]
            r9[r5] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r4, r3, r9)
        L_0x004b:
            r0 = r6
        L_0x004c:
            long r10 = o40.C61926c.m72671P(r0)
            java.lang.String r0 = "nonceid"
            boolean r9 = r2.has(r0)     // Catch:{ Exception -> 0x0065 }
            if (r9 != r8) goto L_0x005a
            r9 = 1
            goto L_0x005b
        L_0x005a:
            r9 = 0
        L_0x005b:
            if (r9 == 0) goto L_0x0062
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x0065 }
            goto L_0x0063
        L_0x0062:
            r0 = r6
        L_0x0063:
            r12 = r0
            goto L_0x006e
        L_0x0065:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r2[r5] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r4, r3, r2)
            r12 = r6
        L_0x006e:
            je1.x1 r0 = new je1.x1
            r13 = 1100001(0x10c8e1, float:1.54143E-39)
            r14 = 2
            r16 = 1
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            rs1.s8$a r2 = rs1.C13442s8.f38060Q0
            rs1.s8 r2 = r2.mo12873f(r1)
            if (r2 == 0) goto L_0x0090
            te3.hj1 r6 = r2.mo12861q3()
        L_0x0090:
            r25 = r6
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 122816(0x1dfc0, float:1.72102E-40)
            r30 = 0
            java.lang.String r15 = ""
            r9 = r0
            r9.<init>(r10, r12, r13, r14, r15, r16, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            nr3.e r0 = r0.mo9225i()
            r2 = r1
            com.tencent.mm.ui.MMActivity r2 = (com.tencent.p014mm.p136ui.MMActivity) r2
            r0.mo11397F(r2)
            at1.b$b r2 = new at1.b$b
            r3 = r31
            r2.<init>(r1, r7, r3)
            r0.mo123064p(r2)
            d14.f r0 = d14.C58042h.m67195d(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: at1.C0217b.xj0(android.content.Context, org.json.JSONObject):d14.f");
    }
}
