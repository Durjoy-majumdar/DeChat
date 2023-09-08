package p534gl;

import com.tencent.p014mm.autogen.mmdata.rpt.SuggestEmoiconWordListStruct;
import hp3.C87581a;

/* renamed from: gl.l */
public final class C32479l<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ SuggestEmoiconWordListStruct f86291a;

    public C32479l(SuggestEmoiconWordListStruct suggestEmoiconWordListStruct) {
        this.f86291a = suggestEmoiconWordListStruct;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0026, code lost:
        r3 = r7.f145035d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call(java.lang.Object r7) {
        /*
            r6 = this;
            ob0.b$c r7 = (ob0.C89132b.C89134c) r7
            int r0 = r7.f256793a
            int r1 = r7.f256794b
            T r7 = r7.f256796d
            te3.xz1 r7 = (te3.C52041xz1) r7
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "updateWordList: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = ", "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r3 = "; "
            r2.append(r3)
            if (r7 == 0) goto L_0x0033
            java.util.LinkedList<te3.kd3> r3 = r7.f145035d
            if (r3 == 0) goto L_0x0033
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0034
        L_0x0033:
            r3 = 0
        L_0x0034:
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.EmojiSuggestCache"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            r2 = 0
            p534gl.C32480m.f86292a = r2
            com.tencent.mm.autogen.mmdata.rpt.SuggestEmoiconWordListStruct r3 = r6.f86291a
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r3.f79185e = r4
            if (r0 != 0) goto L_0x00b6
            if (r1 != 0) goto L_0x00b6
            com.tencent.mm.autogen.mmdata.rpt.SuggestEmoiconWordListStruct r0 = r6.f86291a
            r3 = 1
            r0.f79186f = r3
            if (r7 == 0) goto L_0x0060
            java.util.LinkedList<te3.kd3> r1 = r7.f145035d
            if (r1 == 0) goto L_0x0060
            int r1 = r1.size()
            goto L_0x0061
        L_0x0060:
            r1 = 0
        L_0x0061:
            long r3 = (long) r1
            r0.f79187g = r3
            com.tencent.mm.autogen.mmdata.rpt.SuggestEmoiconWordListStruct r0 = r6.f86291a
            if (r7 == 0) goto L_0x006b
            long r3 = r7.f145037f
            goto L_0x006d
        L_0x006b:
            r3 = 0
        L_0x006d:
            java.lang.String r1 = java.lang.String.valueOf(r3)
            r3 = 1
            java.lang.String r4 = "WordVersion"
            java.lang.String r1 = r0.mo86045b(r4, r1, r3)
            r0.f79188h = r1
            if (r7 == 0) goto L_0x00bc
            java.util.LinkedList<te3.kd3> r0 = r7.f145035d
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00bc
            dl.p r0 = p490dl.C97491p.f286143a
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            int r1 = (int) r3
            r0.mo136773a(r2)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = r0.mo136774c()
            java.lang.String r2 = "word_list_update_time"
            r0.putInt(r2, r1)
            byte[] r7 = r7.toByteArray()
            com.tencent.mm.storage.w2 r0 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.u r0 = r0.mo57720g()
            r0.getClass()
            wh3.t r1 = new wh3.t
            java.lang.String r2 = "cache_type_words_list"
            r1.<init>(r2, r7)
            r0.replace(r1)
            gl.j r7 = p534gl.C32477j.f86286a
            r7.mo58654c()
            goto L_0x00bc
        L_0x00b6:
            com.tencent.mm.autogen.mmdata.rpt.SuggestEmoiconWordListStruct r7 = r6.f86291a
            r0 = 2
            r7.f79186f = r0
        L_0x00bc:
            com.tencent.mm.autogen.mmdata.rpt.SuggestEmoiconWordListStruct r7 = r6.f86291a
            boolean r7 = r7.mo86054n()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p534gl.C32479l.call(java.lang.Object):java.lang.Object");
    }
}
