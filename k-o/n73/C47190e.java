package n73;

import java.util.ArrayList;
import java.util.List;

/* renamed from: n73.e */
public class C47190e extends C47188b {
    /* renamed from: a */
    public List<Integer> mo11243a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(11001);
        arrayList.add(11004);
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo11244b(int r7, byte[] r8) {
        /*
            r6 = this;
            java.lang.Class<z51.g> r0 = z51.C39315g.class
            r1 = 0
            r2 = 0
            r3 = 11001(0x2af9, float:1.5416E-41)
            if (r7 != r3) goto L_0x0052
            te3.k05 r7 = new te3.k05
            r7.<init>()
            r7.parseFrom(r8)     // Catch:{ IOException -> 0x0010 }
        L_0x0010:
            com.tencent.mm.smiley.e r8 = com.tencent.p014mm.smiley.C96931e.m124499a()
            r8.getClass()
            boolean r8 = com.tencent.p014mm.smiley.C96965r.f284067d
            com.tencent.mm.smiley.r r8 = com.tencent.p014mm.smiley.C96965r.C44649c.f121057a
            long r3 = r8.mo135554f()
            long r7 = r7.f136502d
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ce
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ IOException -> 0x003f, all -> 0x003d }
            android.content.res.AssetManager r7 = r7.getAssets()     // Catch:{ IOException -> 0x003f, all -> 0x003d }
            java.lang.String r8 = "color_emoji"
            java.io.InputStream r7 = r7.open(r8)     // Catch:{ IOException -> 0x003f, all -> 0x003d }
            byte[] r2 = p823sg.C48377f.m53723b(r7)     // Catch:{ IOException -> 0x003b }
        L_0x0037:
            com.tencent.p014mm.vfs.C116299g2.m163847c(r7)
            goto L_0x004b
        L_0x003b:
            r8 = move-exception
            goto L_0x0041
        L_0x003d:
            r8 = move-exception
            goto L_0x004e
        L_0x003f:
            r8 = move-exception
            r7 = r2
        L_0x0041:
            java.lang.String r0 = "MicroMsg.Wear.EmojiServer"
            java.lang.String r3 = ""
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x004c }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r8, r3, r1)     // Catch:{ all -> 0x004c }
            goto L_0x0037
        L_0x004b:
            return r2
        L_0x004c:
            r8 = move-exception
            r2 = r7
        L_0x004e:
            com.tencent.p014mm.vfs.C116299g2.m163847c(r2)
            throw r8
        L_0x0052:
            r3 = 11004(0x2afc, float:1.542E-41)
            if (r7 != r3) goto L_0x00ce
            r7 = 9
            l73.C46836a.m52128a(r7)
            te3.l05 r7 = new te3.l05
            r7.<init>()
            r7.parseFrom(r8)     // Catch:{ IOException -> 0x0064 }
            goto L_0x0065
        L_0x0064:
        L_0x0065:
            te3.m05 r8 = new te3.m05
            r8.<init>()
            di3.d r3 = di3.C86312j.m106911c(r0)
            z51.g r3 = (z51.C39315g) r3
            zc3.a r3 = r3.mo58035cm()
            if (r3 == 0) goto L_0x00ac
            di3.d r0 = di3.C86312j.m106911c(r0)
            z51.g r0 = (z51.C39315g) r0
            zc3.a r0 = r0.mo58035cm()
            java.lang.String r3 = r7.f137126d
            i61.h r0 = (i61.C98602h) r0
            java.util.List r0 = r0.mo138000H(r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x008c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00ac
            java.lang.Object r3 = r0.next()
            com.tencent.mm.storage.emotion.EmojiInfo r3 = (com.tencent.p014mm.storage.emotion.EmojiInfo) r3
            java.lang.String r4 = r3.getMd5()
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x008c
            java.util.LinkedList<java.lang.String> r4 = r8.f137743d
            java.lang.String r3 = r3.getMd5()
            r4.add(r3)
            goto L_0x008c
        L_0x00ac:
            java.util.LinkedList<java.lang.String> r0 = r8.f137743d
            int r0 = r0.size()
            if (r0 != 0) goto L_0x00c9
            com.tencent.mm.autogen.events.WearDownloadEmojiEvent r0 = new com.tencent.mm.autogen.events.WearDownloadEmojiEvent
            r0.<init>()
            com.tencent.mm.autogen.events.WearDownloadEmojiEvent$a r3 = r0.f107823d
            r4 = 1
            java.lang.String[] r5 = new java.lang.String[r4]
            java.lang.String r7 = r7.f137126d
            r5[r1] = r7
            r3.f107825b = r5
            r3.f107824a = r4
            r0.publish()
        L_0x00c9:
            byte[] r7 = r8.toByteArray()     // Catch:{ IOException -> 0x00ce }
            return r7
        L_0x00ce:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n73.C47190e.mo11244b(int, byte[]):byte[]");
    }
}
