package uy1;

import com.tencent.p014mm.plugin.game.p061ui.GameRegionPreference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: uy1.a */
public class C52638a {

    /* renamed from: a */
    public Map<String, GameRegionPreference.C42228a> f146971a;

    /* renamed from: b */
    public boolean f146972b = false;

    /* renamed from: c */
    public C52641c f146973c = new C52641c();

    /* renamed from: d */
    public Map<String, Boolean> f146974d = new ConcurrentHashMap();

    /* renamed from: uy1.a$b */
    public static class C52640b {

        /* renamed from: a */
        public static C52638a f146975a = new C52638a((C52639a) null);
    }

    /* renamed from: uy1.a$c */
    public static class C52641c {

        /* renamed from: a */
        public long f146976a;

        /* renamed from: b */
        public long f146977b;

        /* renamed from: c */
        public long f146978c;

        /* renamed from: d */
        public long f146979d;
    }

    public C52638a(C52639a aVar) {
    }

    /* renamed from: a */
    public synchronized void mo73588a() {
        Map<String, GameRegionPreference.C42228a> map = this.f146971a;
        if (map != null) {
            ((LinkedHashMap) map).clear();
        }
        this.f146972b = false;
    }

    /* renamed from: b */
    public synchronized Map<String, GameRegionPreference.C42228a> mo73589b() {
        mo73590c();
        return this.f146971a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105921e("MicroMsg.GameCacheUtil", "exception:%s", com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0157, code lost:
        if (r0 != null) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x015d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105921e("MicroMsg.GameCacheUtil", "exception:%s", com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x016d, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:11:0x0035, B:21:0x0053] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo73590c() {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.Map<java.lang.String, com.tencent.mm.plugin.game.ui.GameRegionPreference$a> r0 = r8.f146971a     // Catch:{ all -> 0x0170 }
            if (r0 != 0) goto L_0x000c
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0170 }
            r0.<init>()     // Catch:{ all -> 0x0170 }
            r8.f146971a = r0     // Catch:{ all -> 0x0170 }
        L_0x000c:
            java.util.Map<java.lang.String, com.tencent.mm.plugin.game.ui.GameRegionPreference$a> r0 = r8.f146971a     // Catch:{ all -> 0x0170 }
            int r0 = r0.size()     // Catch:{ all -> 0x0170 }
            if (r0 > 0) goto L_0x016e
            r0 = 0
            java.lang.String r1 = ""
            r2 = 1
            r3 = 0
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ IOException -> 0x004e }
            android.content.res.AssetManager r4 = r4.getAssets()     // Catch:{ IOException -> 0x004e }
            java.lang.String r5 = "game_region_data.txt"
            java.io.InputStream r0 = r4.open(r5)     // Catch:{ IOException -> 0x004e }
            int r4 = r0.available()     // Catch:{ IOException -> 0x004e }
            byte[] r4 = new byte[r4]     // Catch:{ IOException -> 0x004e }
            r0.read(r4)     // Catch:{ IOException -> 0x004e }
            java.lang.String r5 = new java.lang.String     // Catch:{ IOException -> 0x004e }
            r5.<init>(r4)     // Catch:{ IOException -> 0x004e }
            r0.close()     // Catch:{ IOException -> 0x0039 }
            goto L_0x0049
        L_0x0039:
            r0 = move-exception
            java.lang.String r1 = "MicroMsg.GameCacheUtil"
            java.lang.String r4 = "exception:%s"
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x0170 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)     // Catch:{ all -> 0x0170 }
            r6[r3] = r0     // Catch:{ all -> 0x0170 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r4, r6)     // Catch:{ all -> 0x0170 }
        L_0x0049:
            r1 = r5
            goto L_0x0074
        L_0x004b:
            r1 = move-exception
            goto L_0x0157
        L_0x004e:
            r4 = move-exception
            java.lang.String r5 = "MicroMsg.GameCacheUtil"
            java.lang.String r6 = "exception:%s"
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x004b }
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r4)     // Catch:{ all -> 0x004b }
            r7[r3] = r4     // Catch:{ all -> 0x004b }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r6, r7)     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x0074
            r0.close()     // Catch:{ IOException -> 0x0064 }
            goto L_0x0074
        L_0x0064:
            r0 = move-exception
            java.lang.String r4 = "MicroMsg.GameCacheUtil"
            java.lang.String r5 = "exception:%s"
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x0170 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)     // Catch:{ all -> 0x0170 }
            r6[r3] = r0     // Catch:{ all -> 0x0170 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r5, r6)     // Catch:{ all -> 0x0170 }
        L_0x0074:
            java.lang.String r0 = r1.trim()     // Catch:{ all -> 0x0170 }
            java.lang.String r1 = "\n|\r\n|\r"
            java.lang.String[] r0 = r0.split(r1)     // Catch:{ all -> 0x0170 }
            r1 = 0
        L_0x007f:
            int r4 = r0.length     // Catch:{ all -> 0x0170 }
            if (r1 >= r4) goto L_0x00c3
            r4 = r0[r1]     // Catch:{ all -> 0x0170 }
            java.lang.String r4 = r4.trim()     // Catch:{ all -> 0x0170 }
            java.lang.String r5 = "\\|"
            java.lang.String[] r4 = r4.split(r5)     // Catch:{ all -> 0x0170 }
            int r5 = r4.length     // Catch:{ all -> 0x0170 }
            r6 = 4
            if (r5 >= r6) goto L_0x00a0
            java.lang.String r4 = "MicroMsg.GameCacheUtil"
            java.lang.String r5 = "this GameRegion item has problem %s"
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x0170 }
            r7 = r0[r1]     // Catch:{ all -> 0x0170 }
            r6[r3] = r7     // Catch:{ all -> 0x0170 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r5, r6)     // Catch:{ all -> 0x0170 }
            goto L_0x00c0
        L_0x00a0:
            com.tencent.mm.plugin.game.ui.GameRegionPreference$a r5 = new com.tencent.mm.plugin.game.ui.GameRegionPreference$a     // Catch:{ all -> 0x0170 }
            r5.<init>()     // Catch:{ all -> 0x0170 }
            r6 = r4[r3]     // Catch:{ all -> 0x0170 }
            r5.f114141a = r6     // Catch:{ all -> 0x0170 }
            r6 = r4[r2]     // Catch:{ all -> 0x0170 }
            r5.f114142b = r6     // Catch:{ all -> 0x0170 }
            r6 = 2
            r6 = r4[r6]     // Catch:{ all -> 0x0170 }
            r5.f114143c = r6     // Catch:{ all -> 0x0170 }
            r6 = 3
            r4 = r4[r6]     // Catch:{ all -> 0x0170 }
            r5.f114144d = r4     // Catch:{ all -> 0x0170 }
            r5.f114145e = r3     // Catch:{ all -> 0x0170 }
            r5.f114146f = r3     // Catch:{ all -> 0x0170 }
            java.util.Map<java.lang.String, com.tencent.mm.plugin.game.ui.GameRegionPreference$a> r6 = r8.f146971a     // Catch:{ all -> 0x0170 }
            r6.put(r4, r5)     // Catch:{ all -> 0x0170 }
        L_0x00c0:
            int r1 = r1 + 1
            goto L_0x007f
        L_0x00c3:
            java.lang.String r0 = com.tencent.p014mm.plugin.game.model.C42046d.m45743b()     // Catch:{ all -> 0x0170 }
            java.util.Map<java.lang.String, com.tencent.mm.plugin.game.ui.GameRegionPreference$a> r1 = r8.f146971a     // Catch:{ all -> 0x0170 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0170 }
            com.tencent.mm.plugin.game.ui.GameRegionPreference$a r0 = (com.tencent.p014mm.plugin.game.p061ui.GameRegionPreference.C42228a) r0     // Catch:{ all -> 0x0170 }
            if (r0 == 0) goto L_0x016e
            java.lang.String r1 = com.tencent.p014mm.plugin.game.model.C42046d.m45743b()     // Catch:{ all -> 0x0170 }
            uy1.a r3 = uy1.C52638a.C52640b.f146975a     // Catch:{ all -> 0x0170 }
            java.util.Map r3 = r3.mo73589b()     // Catch:{ all -> 0x0170 }
            java.lang.Object r1 = r3.get(r1)     // Catch:{ all -> 0x0170 }
            com.tencent.mm.plugin.game.ui.GameRegionPreference$a r1 = (com.tencent.p014mm.plugin.game.p061ui.GameRegionPreference.C42228a) r1     // Catch:{ all -> 0x0170 }
            java.lang.StringBuffer r3 = new java.lang.StringBuffer     // Catch:{ all -> 0x0170 }
            r3.<init>()     // Catch:{ all -> 0x0170 }
            if (r1 == 0) goto L_0x00f7
            java.lang.String r1 = r1.f114141a     // Catch:{ all -> 0x0170 }
            r3.append(r1)     // Catch:{ all -> 0x0170 }
            java.lang.String r1 = "zh_CN"
            java.lang.String r1 = com.tencent.p014mm.plugin.game.model.C42046d.m45744c(r1)     // Catch:{ all -> 0x0170 }
            r3.append(r1)     // Catch:{ all -> 0x0170 }
        L_0x00f7:
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0170 }
            r0.f114141a = r1     // Catch:{ all -> 0x0170 }
            java.lang.String r1 = com.tencent.p014mm.plugin.game.model.C42046d.m45743b()     // Catch:{ all -> 0x0170 }
            uy1.a r3 = uy1.C52638a.C52640b.f146975a     // Catch:{ all -> 0x0170 }
            java.util.Map r3 = r3.mo73589b()     // Catch:{ all -> 0x0170 }
            java.lang.Object r1 = r3.get(r1)     // Catch:{ all -> 0x0170 }
            com.tencent.mm.plugin.game.ui.GameRegionPreference$a r1 = (com.tencent.p014mm.plugin.game.p061ui.GameRegionPreference.C42228a) r1     // Catch:{ all -> 0x0170 }
            java.lang.StringBuffer r3 = new java.lang.StringBuffer     // Catch:{ all -> 0x0170 }
            r3.<init>()     // Catch:{ all -> 0x0170 }
            if (r1 == 0) goto L_0x0123
            java.lang.String r1 = r1.f114142b     // Catch:{ all -> 0x0170 }
            r3.append(r1)     // Catch:{ all -> 0x0170 }
            java.lang.String r1 = "zh_TW"
            java.lang.String r1 = com.tencent.p014mm.plugin.game.model.C42046d.m45744c(r1)     // Catch:{ all -> 0x0170 }
            r3.append(r1)     // Catch:{ all -> 0x0170 }
        L_0x0123:
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0170 }
            r0.f114142b = r1     // Catch:{ all -> 0x0170 }
            java.lang.String r1 = com.tencent.p014mm.plugin.game.model.C42046d.m45743b()     // Catch:{ all -> 0x0170 }
            uy1.a r3 = uy1.C52638a.C52640b.f146975a     // Catch:{ all -> 0x0170 }
            java.util.Map r3 = r3.mo73589b()     // Catch:{ all -> 0x0170 }
            java.lang.Object r1 = r3.get(r1)     // Catch:{ all -> 0x0170 }
            com.tencent.mm.plugin.game.ui.GameRegionPreference$a r1 = (com.tencent.p014mm.plugin.game.p061ui.GameRegionPreference.C42228a) r1     // Catch:{ all -> 0x0170 }
            java.lang.StringBuffer r3 = new java.lang.StringBuffer     // Catch:{ all -> 0x0170 }
            r3.<init>()     // Catch:{ all -> 0x0170 }
            if (r1 == 0) goto L_0x014e
            java.lang.String r1 = r1.f114143c     // Catch:{ all -> 0x0170 }
            r3.append(r1)     // Catch:{ all -> 0x0170 }
            java.lang.String r1 = "en"
            java.lang.String r1 = com.tencent.p014mm.plugin.game.model.C42046d.m45744c(r1)     // Catch:{ all -> 0x0170 }
            r3.append(r1)     // Catch:{ all -> 0x0170 }
        L_0x014e:
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0170 }
            r0.f114143c = r1     // Catch:{ all -> 0x0170 }
            r0.f114146f = r2     // Catch:{ all -> 0x0170 }
            goto L_0x016e
        L_0x0157:
            if (r0 == 0) goto L_0x016d
            r0.close()     // Catch:{ IOException -> 0x015d }
            goto L_0x016d
        L_0x015d:
            r0 = move-exception
            java.lang.String r4 = "MicroMsg.GameCacheUtil"
            java.lang.String r5 = "exception:%s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0170 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)     // Catch:{ all -> 0x0170 }
            r2[r3] = r0     // Catch:{ all -> 0x0170 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r5, r2)     // Catch:{ all -> 0x0170 }
        L_0x016d:
            throw r1     // Catch:{ all -> 0x0170 }
        L_0x016e:
            monitor-exit(r8)
            return
        L_0x0170:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: uy1.C52638a.mo73590c():void");
    }
}
