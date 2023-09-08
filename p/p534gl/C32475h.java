package p534gl;

import com.tencent.p014mm.autogen.mmdata.rpt.SuggestEmoiconPreloadStruct;
import hp3.C87581a;

/* renamed from: gl.h */
public final class C32475h<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C32476i f86279a;

    /* renamed from: b */
    public final /* synthetic */ SuggestEmoiconPreloadStruct f86280b;

    /* renamed from: c */
    public final /* synthetic */ String f86281c;

    public C32475h(C32476i iVar, SuggestEmoiconPreloadStruct suggestEmoiconPreloadStruct, String str) {
        this.f86279a = iVar;
        this.f86280b = suggestEmoiconPreloadStruct;
        this.f86281c = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x002a, code lost:
        r4 = r8.f145438d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call(java.lang.Object r8) {
        /*
            r7 = this;
            ob0.b$c r8 = (ob0.C89132b.C89134c) r8
            int r0 = r8.f256793a
            int r1 = r8.f256794b
            T r8 = r8.f256796d
            te3.yo3 r8 = (te3.C52147yo3) r8
            gl.i r2 = r7.f86279a
            r2.getClass()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "checkUpdate: cgi result: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = ", "
            r2.append(r3)
            r2.append(r1)
            r2.append(r3)
            r3 = 0
            if (r8 == 0) goto L_0x0037
            java.util.LinkedList<te3.no3> r4 = r8.f145438d
            if (r4 == 0) goto L_0x0037
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0038
        L_0x0037:
            r4 = r3
        L_0x0038:
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "MicroMsg.EmojiSuggestMatchWord"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            com.tencent.mm.autogen.mmdata.rpt.SuggestEmoiconPreloadStruct r2 = r7.f86280b
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r2.f79165f = r5
            com.tencent.mm.autogen.mmdata.rpt.SuggestEmoiconPreloadStruct r2 = r7.f86280b
            long r5 = (long) r1
            r2.f79167h = r5
            if (r0 != 0) goto L_0x00fd
            if (r1 != 0) goto L_0x00fd
            r0 = 1
            r2.f79166g = r0
            com.tencent.mm.storage.w2 r0 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.i r0 = r0.f82785q
            gl.e r1 = new gl.e
            r1.<init>()
            java.lang.String r2 = r7.f86281c
            r1.field_desc = r2
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            int r2 = (int) r5
            r1.field_updateTime = r2
            byte[] r2 = r8.toByteArray()
            r1.field_content = r2
            r0.mo61533Lo(r1)
            java.util.LinkedList<te3.no3> r0 = r8.f145438d
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0087
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r1
            if (r0 != r1) goto L_0x0087
            r0 = 1
            goto L_0x0088
        L_0x0087:
            r0 = 0
        L_0x0088:
            if (r0 == 0) goto L_0x00f0
            gl.i r0 = r7.f86279a
            r0.getClass()
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r5 = h81.C32735h.C32737c.clicfg_emoji_suggest_remote_prefetch
            int r0 = r0.mo58779Qe(r5, r2)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r2)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "checkPrefetch: config: "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r6 = ", isWifi: "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            if (r0 != r1) goto L_0x00c5
            if (r2 != 0) goto L_0x00c8
        L_0x00c5:
            r1 = 2
            if (r0 != r1) goto L_0x00f0
        L_0x00c8:
            java.util.LinkedList<te3.no3> r8 = r8.f145438d
            if (r8 == 0) goto L_0x00f0
            java.util.Iterator r8 = r8.iterator()
        L_0x00d0:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00f0
            java.lang.Object r0 = r8.next()
            te3.no3 r0 = (te3.C50572no3) r0
            com.tencent.mm.storage.emotion.EmojiInfo r1 = new com.tencent.mm.storage.emotion.EmojiInfo
            r1.<init>()
            te3.k70 r0 = r0.f138703d
            u61.C101964h.m134219a(r0, r1)
            r0 = 65
            r1.field_catalog = r0
            wk.e r0 = p260wk.C102457e.f301712a
            r0.mo142073e(r1, r3)
            goto L_0x00d0
        L_0x00f0:
            r8 = 41
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            long r3 = (long) r8
            r1 = 1418(0x58a, double:7.006E-321)
            r5 = 1
            r0.mo175913w(r1, r3, r5)
            goto L_0x0101
        L_0x00fd:
            r0 = 2
            r2.f79166g = r0
        L_0x0101:
            com.tencent.mm.autogen.mmdata.rpt.SuggestEmoiconPreloadStruct r8 = r7.f86280b
            boolean r8 = r8.mo86054n()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p534gl.C32475h.call(java.lang.Object):java.lang.Object");
    }
}
