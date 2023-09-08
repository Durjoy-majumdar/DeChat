package p534gl;

import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import gy3.C87412m;
import i61.C98602h;
import i61.C98603i;
import java.util.ArrayList;
import java.util.LinkedList;
import sx3.C36907w;
import te3.C50116kd3;
import te3.C52041xz1;
import z04.C112550d0;
import z51.C39315g;

/* renamed from: gl.j */
public final class C32477j {

    /* renamed from: a */
    public static final C32477j f86286a;

    /* renamed from: b */
    public static int f86287b = 3;

    /* renamed from: c */
    public static long f86288c;

    /* renamed from: d */
    public static final LinkedList<String> f86289d = new LinkedList<>();

    static {
        C32477j jVar = new C32477j();
        f86286a = jVar;
        jVar.mo58654c();
    }

    /* renamed from: a */
    public final void mo58652a(C52041xz1 xz12) {
        LinkedList<String> linkedList = f86289d;
        linkedList.clear();
        LinkedList<C50116kd3> linkedList2 = xz12.f145035d;
        C87412m.m108593f(linkedList2, "rsp.PersonalWords");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList2, 10));
        for (C50116kd3 kd32 : linkedList2) {
            arrayList.add(kd32.f136671d);
        }
        linkedList.addAll(arrayList);
        f86287b = xz12.f145036e;
        f86288c = xz12.f145037f;
    }

    /* renamed from: b */
    public final void mo58653b() {
        LinkedList<String> linkedList = f86289d;
        linkedList.clear();
        StringBuilder sb = new StringBuilder();
        ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).getClass();
        sb.append(C98603i.m128192c());
        sb.append("/suggest_word/word2emoji.txt");
        String sb4 = sb.toString();
        if (C86013q1.m106450k(sb4)) {
            String N = C86013q1.m106432N(sb4);
            C87412m.m108593f(N, "content");
            linkedList.addAll(C112550d0.m153785U(N, new String[]{"\n"}, false, 0, 6, (Object) null));
        }
        f86287b = 3;
        f86288c = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037 A[Catch:{ Exception -> 0x0028 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049 A[Catch:{ Exception -> 0x0028 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c A[Catch:{ Exception -> 0x0028 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58654c() {
        /*
            r12 = this;
            java.util.LinkedList<java.lang.String> r0 = f86289d
            monitor-enter(r0)
            java.lang.String r1 = "MicroMsg.EmojiSuggestCache"
            java.lang.String r2 = "initWordList: start"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ all -> 0x008d }
            com.tencent.mm.storage.w2 r1 = com.tencent.p014mm.storage.C30790w2.m39221h()     // Catch:{ all -> 0x008d }
            wh3.u r1 = r1.mo57720g()     // Catch:{ all -> 0x008d }
            java.lang.String r2 = "cache_type_words_list"
            byte[] r1 = r1.mo61543Lo(r2)     // Catch:{ all -> 0x008d }
            te3.xz1 r2 = new te3.xz1     // Catch:{ all -> 0x008d }
            r2.<init>()     // Catch:{ all -> 0x008d }
            r3 = 0
            r4 = 1
            r5 = 0
            if (r1 != 0) goto L_0x0024
        L_0x0022:
            r2 = r5
            goto L_0x0035
        L_0x0024:
            r2.parseFrom(r1)     // Catch:{ Exception -> 0x0028 }
            goto L_0x0035
        L_0x0028:
            r1 = move-exception
            java.lang.String r2 = "safeParser"
            java.lang.String r6 = ""
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ all -> 0x008d }
            r7[r3] = r1     // Catch:{ all -> 0x008d }
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r6, r7)     // Catch:{ all -> 0x008d }
            goto L_0x0022
        L_0x0035:
            if (r2 == 0) goto L_0x0049
            r1 = 31
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x008d }
            long r8 = (long) r1     // Catch:{ all -> 0x008d }
            r6 = 1418(0x58a, double:7.006E-321)
            r10 = 1
            r5.mo175913w(r6, r8, r10)     // Catch:{ all -> 0x008d }
            gl.j r1 = f86286a     // Catch:{ all -> 0x008d }
            r1.mo58652a(r2)     // Catch:{ all -> 0x008d }
            goto L_0x004e
        L_0x0049:
            gl.j r1 = f86286a     // Catch:{ all -> 0x008d }
            r1.mo58653b()     // Catch:{ all -> 0x008d }
        L_0x004e:
            java.lang.String r1 = "MicroMsg.EmojiSuggestCache"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x008d }
            r5.<init>()     // Catch:{ all -> 0x008d }
            java.lang.String r6 = "initWordList: personal:"
            r5.append(r6)     // Catch:{ all -> 0x008d }
            if (r2 == 0) goto L_0x005d
            r3 = 1
        L_0x005d:
            r5.append(r3)     // Catch:{ all -> 0x008d }
            java.lang.String r2 = ", size:"
            r5.append(r2)     // Catch:{ all -> 0x008d }
            java.util.LinkedList<java.lang.String> r2 = f86289d     // Catch:{ all -> 0x008d }
            int r2 = r2.size()     // Catch:{ all -> 0x008d }
            r5.append(r2)     // Catch:{ all -> 0x008d }
            java.lang.String r2 = ", type:"
            r5.append(r2)     // Catch:{ all -> 0x008d }
            int r2 = f86287b     // Catch:{ all -> 0x008d }
            r5.append(r2)     // Catch:{ all -> 0x008d }
            java.lang.String r2 = ", version:"
            r5.append(r2)     // Catch:{ all -> 0x008d }
            long r2 = f86288c     // Catch:{ all -> 0x008d }
            r5.append(r2)     // Catch:{ all -> 0x008d }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x008d }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ all -> 0x008d }
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x008d }
            monitor-exit(r0)
            return
        L_0x008d:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p534gl.C32477j.mo58654c():void");
    }
}
