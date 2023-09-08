package com.tencent.p014mm.modelavatar;

import com.tencent.p014mm.modelcdntran.C92779i0;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.io.ByteArrayOutputStream;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p196ln.C99514m;

/* renamed from: com.tencent.mm.modelavatar.m */
public final class C92725m implements C99514m {

    /* renamed from: a */
    public final String f266857a;

    /* renamed from: b */
    public final String f266858b;

    /* renamed from: c */
    public long f266859c = System.currentTimeMillis();

    /* renamed from: d */
    public final C98124g.C98125a f266860d;

    /* renamed from: com.tencent.mm.modelavatar.m$a */
    public static final class C92726a implements C98124g.C98125a {

        /* renamed from: d */
        public final /* synthetic */ C99514m.C99515a f266861d;

        /* renamed from: e */
        public final /* synthetic */ C92725m f266862e;

        public C92726a(C99514m.C99515a aVar, C92725m mVar) {
            this.f266861d = aVar;
            this.f266862e = mVar;
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            C87412m.m108594g(str, "mediaId");
            if (i == -21005) {
                Log.m105919d("MicroMsg.KidsWatch.KidsWatchHeadImageUploader", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, Integer.valueOf(i), cVar, dVar);
                return 0;
            } else if (dVar != null && dVar.field_retCode == 0) {
                Log.m105925i("MicroMsg.KidsWatch.KidsWatchHeadImageUploader", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s], aesKey:" + dVar.field_aesKey, str, Integer.valueOf(i), cVar, dVar);
                C99514m.C99515a aVar = this.f266861d;
                String str2 = dVar.field_fileId;
                C87412m.m108593f(str2, "sceneResult.field_fileId");
                String str3 = dVar.field_aesKey;
                C87412m.m108593f(str3, "sceneResult.field_aesKey");
                aVar.mo138915v(str2, str3);
                Log.m105924i("MicroMsg.KidsWatch.KidsWatchHeadImageUploader", "uploadsns cdndone pass: " + (System.currentTimeMillis() - this.f266862e.f266859c) + ' ' + dVar.field_filemd5);
                return 0;
            } else if (dVar != null && dVar.field_retCode != 0) {
                Log.m105925i("MicroMsg.KidsWatch.KidsWatchHeadImageUploader", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, Integer.valueOf(i), cVar, dVar);
                this.f266861d.mo138914e(3, -1, "doScene failed");
                return 0;
            } else if (i != 0) {
                Log.m105925i("MicroMsg.KidsWatch.KidsWatchHeadImageUploader", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, Integer.valueOf(i), cVar, dVar);
                this.f266861d.mo138914e(3, -1, "doScene failed");
                return 0;
            } else {
                Log.m105919d("MicroMsg.KidsWatch.KidsWatchHeadImageUploader", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, Integer.valueOf(i), cVar, dVar);
                return 0;
            }
        }

        /* renamed from: h */
        public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(byteArrayOutputStream, "buff");
        }

        /* renamed from: j */
        public byte[] mo1775j(String str, byte[] bArr) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(bArr, "inbuf");
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00fe  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C92725m(java.lang.String r13, p196ln.C99514m.C99515a r14) {
        /*
            r12 = this;
            java.lang.String r0 = "imgPath"
            gy3.C87412m.m108594g(r13, r0)
            java.lang.String r0 = "iImgUploadCallback"
            gy3.C87412m.m108594g(r14, r0)
            r12.<init>()
            com.tencent.mm.modelavatar.m$a r0 = new com.tencent.mm.modelavatar.m$a
            r0.<init>(r14, r12)
            r12.f266860d = r0
            long r0 = java.lang.System.currentTimeMillis()
            r12.f266859c = r0
            r12.f266857a = r13
            java.util.Random r14 = new java.util.Random
            r14.<init>()
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            int r14 = r14.nextInt()
            java.lang.String r14 = java.lang.String.valueOf(r14)
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r4 = "kidsupload"
            r2[r3] = r4
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            r6 = 1
            r2[r6] = r5
            r5 = 2
            r2[r5] = r14
            com.tencent.mm.sdk.platformtools.MMStack r7 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            r8 = 3
            r2[r8] = r7
            java.lang.String r7 = "MicroMsg.KidsWatch.KidsWatchHeadImageUploader"
            java.lang.String r8 = "cdntra genClientId prefix[%s] createtime:%d suffix:[%s] stack[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r8, r2)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            r8 = 0
            if (r2 != 0) goto L_0x006f
            r2 = 10
            r9 = 0
        L_0x0058:
            if (r9 >= r2) goto L_0x006f
            char r10 = r4.charAt(r9)
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isAlpha(r10)
            if (r11 != 0) goto L_0x006c
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNum(r10)
            if (r10 != 0) goto L_0x006c
            r2 = r8
            goto L_0x0070
        L_0x006c:
            int r9 = r9 + 1
            goto L_0x0058
        L_0x006f:
            r2 = r4
        L_0x0070:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x007e
            java.lang.String r14 = "prefix is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r14)
            goto L_0x00fc
        L_0x007e:
            r9 = 0
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x008a
            java.lang.String r14 = "createTime <= 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r14)
            goto L_0x00fc
        L_0x008a:
            java.lang.String r2 = r12.f266857a
            java.nio.charset.Charset r8 = z04.C119027c.f356488a
            byte[] r2 = r2.getBytes(r8)
            java.lang.String r8 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r2, r8)
            java.lang.String r2 = p823sg.C90193h.m112878f(r2)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r9 = 97
            r8.append(r9)
            r8.append(r4)
            r4 = 95
            r8.append(r4)
            java.lang.String r9 = "md5"
            gy3.C87412m.m108593f(r2, r9)
            r9 = 16
            java.lang.String r2 = r2.substring(r3, r9)
            java.lang.String r9 = "this as java.lang.String…ing(startIndex, endIndex)"
            gy3.C87412m.m108593f(r2, r9)
            r8.append(r2)
            r8.append(r4)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r1 != 0) goto L_0x00e7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r4)
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r8 = r14
            goto L_0x00e8
        L_0x00e7:
            r8 = r0
        L_0x00e8:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "clientid:"
            r14.append(r0)
            r14.append(r8)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r14)
        L_0x00fc:
            if (r8 != 0) goto L_0x0100
            java.lang.String r8 = ""
        L_0x0100:
            r12.f266858b = r8
            java.lang.Object[] r14 = new java.lang.Object[r5]
            r14[r3] = r13
            r14[r6] = r8
            java.lang.String r13 = "KidsWatchHeadImageUploader imgPath:%s mediaId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelavatar.C92725m.<init>(java.lang.String, ln.m$a):void");
    }

    /* renamed from: a */
    public boolean mo126948a() {
        C98124g gVar = new C98124g();
        gVar.f287660d = "task_KidsWatchHeadImageUpload";
        gVar.f287662f = this.f266860d;
        gVar.field_mediaId = this.f266858b;
        gVar.field_fullpath = this.f266857a;
        gVar.field_thumbpath = "";
        gVar.field_fileType = 5;
        gVar.field_talker = "";
        gVar.field_priority = 2;
        gVar.field_needStorage = false;
        gVar.field_isStreamMedia = false;
        gVar.field_appType = 1;
        gVar.field_bzScene = 0;
        gVar.f287663g = 5;
        gVar.field_trysafecdn = true;
        gVar.field_enable_hitcheck = false;
        if (C92779i0.Ex0().mo126952f(gVar)) {
            return true;
        }
        Log.m105921e("MicroMsg.KidsWatch.KidsWatchHeadImageUploader", "cdntra addSendTask failed. mediaId:%s", this.f266858b);
        return false;
    }
}
