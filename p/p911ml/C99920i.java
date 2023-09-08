package p911ml;

import hp3.C87581a;
import ob0.C89132b;
import te3.bn4;

/* renamed from: ml.i */
public class C99920i implements C87581a<Void, C89132b.C89134c<bn4>> {

    /* renamed from: a */
    public final /* synthetic */ C99922k f292780a;

    public C99920i(C99922k kVar) {
        this.f292780a = kVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0028, code lost:
        r10 = ((te3.bn4) r10).f131227d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call(java.lang.Object r10) {
        /*
            r9 = this;
            ob0.b$c r10 = (ob0.C89132b.C89134c) r10
            int r0 = r10.f256793a
            int r1 = r10.f256794b
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r5 = 0
            r3[r5] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r6 = 1
            r3[r6] = r4
            java.lang.String r4 = "MicroMsg.EmojiUploadCDN"
            java.lang.String r7 = "prepare callback: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r7, r3)
            r3 = 0
            if (r0 != 0) goto L_0x00ec
            if (r1 != 0) goto L_0x00ec
            T r10 = r10.f256796d
            if (r10 == 0) goto L_0x0033
            te3.bn4 r10 = (te3.bn4) r10
            pe3.b r10 = r10.f131227d
            if (r10 == 0) goto L_0x0033
            java.lang.String r10 = r10.mo123705h()
            goto L_0x0035
        L_0x0033:
            java.lang.String r10 = ""
        L_0x0035:
            ml.k r0 = r9.f292780a
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.tencent.mm.storage.emotion.EmojiInfo r2 = r0.f292771a
            java.lang.String r2 = r2.field_md5
            r1[r5] = r2
            r1[r6] = r10
            java.lang.String r2 = "upload: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r1)
            com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            boolean r1 = r0.f292773c
            if (r1 == 0) goto L_0x0051
            r1 = 20403(0x4fb3, float:2.859E-41)
            goto L_0x0053
        L_0x0051:
            r1 = 20401(0x4fb1, float:2.8588E-41)
        L_0x0053:
            r0.f292782g = r1
            gi.g r1 = new gi.g
            r1.<init>()
            java.lang.String r2 = "task_EmojiUploadCDN"
            r1.f287660d = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "emoji_upload_"
            r2.append(r5)
            com.tencent.mm.storage.emotion.EmojiInfo r5 = r0.f292771a
            java.lang.String r5 = r5.field_md5
            r2.append(r5)
            long r7 = java.lang.System.currentTimeMillis()
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r1.field_mediaId = r2
            r2 = 110(0x6e, float:1.54E-43)
            r1.field_appType = r2
            int r2 = r0.f292782g
            r1.field_fileType = r2
            r1.f287649F = r10
            com.tencent.mm.storage.emotion.EmojiInfo r10 = r0.f292771a
            java.lang.String r10 = r10.mo62640K1()
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r10)
            if (r2 != 0) goto L_0x009f
            java.lang.String r10 = "upload: file not exists"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r10)
            r10 = 10
            r0.mo139265a(r10, r3)
            goto L_0x00f1
        L_0x009f:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.ImgUtil.isImgFile(r10)
            if (r2 != 0) goto L_0x00d5
            boolean r2 = com.tencent.p014mm.sdk.platformtools.ImgUtil.isWXGF((java.lang.String) r10)
            if (r2 != 0) goto L_0x00d5
            java.lang.Class<z51.g> r2 = z51.C39315g.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            z51.g r2 = (z51.C39315g) r2
            zc3.b r2 = r2.getProvider()
            com.tencent.mm.storage.emotion.EmojiInfo r4 = r0.f292771a
            byte[] r2 = r2.mo138036u(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r10)
            java.lang.String r10 = "_temp"
            r4.append(r10)
            java.lang.String r10 = r4.toString()
            r0.f292783h = r10
            com.tencent.p014mm.vfs.C86013q1.m106437S(r10, r2)
            java.lang.String r10 = r0.f292783h
        L_0x00d5:
            r1.field_fullpath = r10
            r1.field_bzScene = r6
            ml.j r10 = new ml.j
            r10.<init>(r0)
            r1.f287662f = r10
            java.lang.Class<qo.l> r10 = p663qo.C101213l.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            qo.l r10 = (p663qo.C101213l) r10
            r10.if0(r1)
            goto L_0x00f1
        L_0x00ec:
            ml.k r10 = r9.f292780a
            r10.mo139266b()
        L_0x00f1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p911ml.C99920i.call(java.lang.Object):java.lang.Object");
    }
}
