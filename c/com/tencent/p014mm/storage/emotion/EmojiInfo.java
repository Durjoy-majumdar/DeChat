package com.tencent.p014mm.storage.emotion;

import a70.C112760b;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.api.EmotionStrategyInfo;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.emoji.decode.MMGIFJNIFactory;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.IOException;
import java.io.InputStream;
import p207nl.C89008j;
import p749xh.C102678y1;
import u61.C101964h;
import v51.C52762d;

/* renamed from: com.tencent.mm.storage.emotion.EmojiInfo */
public class EmojiInfo extends C102678y1 implements IEmojiInfo, Parcelable {
    public static final Parcelable.Creator<EmojiInfo> CREATOR = new C96982a();

    /* renamed from: W1 */
    public static IAutoDBItem.MAutoDBInfo f284123W1 = C102678y1.initAutoDBInfo(EmojiInfo.class);

    /* renamed from: P1 */
    public final String f284124P1;

    /* renamed from: Q1 */
    public String f284125Q1;

    /* renamed from: R1 */
    public String f284126R1;

    /* renamed from: S1 */
    public int f284127S1;

    /* renamed from: T1 */
    public int f284128T1;

    /* renamed from: U1 */
    public String f284129U1;

    /* renamed from: V1 */
    public EmotionStrategyInfo f284130V1;

    /* renamed from: com.tencent.mm.storage.emotion.EmojiInfo$a */
    public class C96982a implements Parcelable.Creator<EmojiInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new EmojiInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new EmojiInfo[i];
        }
    }

    public EmojiInfo() {
        this.f284128T1 = 2;
        this.f284124P1 = C89008j.f256613a.mo123385d();
        reset();
    }

    /* renamed from: n2 */
    public static boolean m124590n2(int i) {
        return i == 50 || i == 49;
    }

    /* renamed from: A */
    public void mo62630A(String str) {
        this.field_attachTextColor = str;
    }

    /* renamed from: C */
    public String mo62631C() {
        return this.field_externUrl;
    }

    /* renamed from: C0 */
    public void mo62632C0(int i) {
        this.field_height = i;
    }

    /* renamed from: C1 */
    public boolean mo62633C1() {
        int i;
        boolean z = true;
        if (C101964h.m134229k(this.field_md5) || (i = this.field_catalog) == 18 || i == 50 || i == 49) {
            return true;
        }
        String K1 = mo62640K1();
        if (Util.isNullOrNil(K1)) {
            return false;
        }
        C86009m1 m1Var = new C86009m1(K1);
        boolean z2 = m1Var.mo119967g() && m1Var.mo119980r() > 0;
        if (z2) {
            return z2;
        }
        if (C86013q1.m106451l(this.f284124P1 + this.field_md5) <= 0) {
            return z2;
        }
        C86013q1.m106442c(this.f284124P1 + this.field_md5, K1);
        if (!m1Var.mo119967g() || m1Var.mo119980r() <= 0) {
            z = false;
        }
        return z;
    }

    /* renamed from: E */
    public void mo62634E(String str) {
        this.field_groupId = str;
    }

    /* renamed from: F0 */
    public String mo62635F0() {
        return this.field_lensId;
    }

    /* renamed from: I */
    public void mo62636I(String str) {
        this.field_thumbUrl = str;
    }

    /* renamed from: I0 */
    public boolean mo62637I0() {
        int i = this.field_catalog;
        return i == 50 || i == 49 || i == 18;
    }

    /* renamed from: I1 */
    public void mo62638I1(String str) {
        this.field_externUrl = str;
    }

    /* renamed from: J */
    public EmotionStrategyInfo mo62639J() {
        return this.f284130V1;
    }

    /* renamed from: K1 */
    public String mo62640K1() {
        String str;
        if (Util.isNullOrNil(this.field_groupId) && Util.isNullOrNil(this.field_md5)) {
            Log.m105928w("MicroMsg.emoji.EmojiInfo", "[cpan] get icon path failed. product id and md5 are null.");
            return null;
        } else if (Util.isNullOrNil(this.field_md5)) {
            return null;
        } else {
            if (Util.isNullOrNil(this.field_groupId) || Util.isEqual(this.field_groupId, "capture")) {
                str = this.f284124P1;
            } else {
                str = this.f284124P1 + this.field_groupId + "/";
            }
            C86013q1.m106461v(str);
            return str + this.field_md5;
        }
    }

    /* renamed from: L */
    public int mo62641L() {
        return this.field_captureStatus;
    }

    /* renamed from: M0 */
    public boolean mo62642M0() {
        int i = this.field_catalog;
        if (i == 50 || i == 49) {
            return true;
        }
        String K1 = mo62640K1();
        if (Util.isNullOrNil(K1)) {
            return false;
        }
        Uri n = C116299g2.m163858n(K1);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (!l.mo177810a()) {
            return false;
        }
        return l.f348991a.mo119948x(l.f348992b);
    }

    /* renamed from: P0 */
    public void mo62643P0(String str) {
        this.field_activityid = str;
    }

    /* renamed from: P1 */
    public String mo62644P1() {
        return this.field_externMd5;
    }

    /* renamed from: S0 */
    public void mo62645S0() {
        int i = this.field_catalog;
        if (i != 50 && i != 49) {
            String K1 = mo62640K1();
            if (!Util.isNullOrNil(K1)) {
                C86009m1 m1Var = new C86009m1(K1);
                if (m1Var.mo119967g()) {
                    m1Var.mo119966f();
                }
            }
        }
    }

    /* renamed from: T */
    public String mo62646T() {
        return this.field_attachedText;
    }

    /* renamed from: T1 */
    public IEmojiInfo.C40005a mo62647T1() {
        IEmojiInfo.C40005a aVar = IEmojiInfo.C40005a.STATUS_SUCCESS;
        int i = this.field_captureStatus;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? aVar : IEmojiInfo.C40005a.STATUS_UPLOAD_FAIL : IEmojiInfo.C40005a.STATUS_UPLOADING : IEmojiInfo.C40005a.STATUS_MIX_FAIL : IEmojiInfo.C40005a.STATUS_MIXING : aVar;
    }

    /* renamed from: U1 */
    public int mo62648U1() {
        return this.field_reserved3;
    }

    /* renamed from: V0 */
    public void mo62649V0(String str) {
        this.field_activityid = str;
    }

    /* renamed from: V1 */
    public int mo62650V1() {
        return this.f284128T1;
    }

    /* renamed from: X1 */
    public IEmojiInfo.C40006b mo62651X1() {
        IEmojiInfo.C40006b bVar = IEmojiInfo.C40006b.ERR_OTHERS;
        switch (this.field_captureUploadErrCode) {
            case 0:
                return IEmojiInfo.C40006b.ERR_SUCCESS;
            case 1:
                return IEmojiInfo.C40006b.ERR_NON_NETWORK;
            case 2:
                return IEmojiInfo.C40006b.ERR_WIFI_NETWORK;
            case 3:
                return IEmojiInfo.C40006b.ERR_MOBILE_NETWORK;
            case 4:
                return IEmojiInfo.C40006b.ERR_NOT_COMPLETED;
            case 5:
                return IEmojiInfo.C40006b.ERR_OVER_LIMIT;
            case 7:
                return IEmojiInfo.C40006b.ERR_LOCAL_FILE;
            case 8:
                return IEmojiInfo.C40006b.ERR_OVER_SIZE;
            case 9:
                return IEmojiInfo.C40006b.ERR_SPAM;
            case 10:
                return IEmojiInfo.C40006b.ERR_OVER_UPLOAD_TIME;
            default:
                return bVar;
        }
    }

    /* renamed from: Z1 */
    public String mo62652Z1() {
        return this.f284129U1;
    }

    /* renamed from: a1 */
    public void mo62653a1(String str) {
        this.field_cdnUrl = str;
    }

    /* renamed from: b0 */
    public int mo62654b0() {
        return this.f284127S1;
    }

    /* renamed from: c0 */
    public void mo62655c0(int i) {
        this.field_reserved4 = i;
    }

    /* renamed from: c2 */
    public void mo62656c2(int i) {
        this.field_catalog = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0115, code lost:
        return r11;
     */
    /* renamed from: d1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.Bitmap mo62657d1(android.content.Context r11, int r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            int r0 = r10.field_catalog     // Catch:{ all -> 0x0241 }
            r1 = 18
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r0 == r1) goto L_0x0172
            r1 = 50
            if (r0 == r1) goto L_0x0172
            r1 = 49
            if (r0 != r1) goto L_0x0016
            goto L_0x0172
        L_0x0016:
            r1 = 17
            if (r0 != r1) goto L_0x0094
            java.lang.String r12 = r10.getName()     // Catch:{ all -> 0x0241 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)     // Catch:{ all -> 0x0241 }
            if (r0 != 0) goto L_0x0040
            java.lang.String r12 = r10.getContent()     // Catch:{ all -> 0x0241 }
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)     // Catch:{ all -> 0x0241 }
            if (r12 == 0) goto L_0x0033
            java.lang.String r12 = r10.getName()     // Catch:{ all -> 0x0241 }
            goto L_0x0037
        L_0x0033:
            java.lang.String r12 = r10.getContent()     // Catch:{ all -> 0x0241 }
        L_0x0037:
            java.lang.String r0 = ".png"
            java.lang.String r1 = ""
            java.lang.String r12 = r12.replaceAll(r0, r1)     // Catch:{ all -> 0x0241 }
            goto L_0x0048
        L_0x0040:
            java.lang.String r0 = "MicroMsg.emoji.EmojiInfo"
            java.lang.String r1 = "name is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x0241 }
        L_0x0048:
            java.lang.String r0 = "MicroMsg.emoji.EmojiInfo"
            java.lang.String r1 = "[addEmoji] drawable name:%s"
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x0241 }
            r2[r6] = r12     // Catch:{ all -> 0x0241 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r2)     // Catch:{ all -> 0x0241 }
            android.content.res.Resources r0 = r11.getResources()     // Catch:{ all -> 0x0241 }
            java.lang.String r1 = "drawable"
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()     // Catch:{ all -> 0x0241 }
            int r12 = r0.getIdentifier(r12, r1, r2)     // Catch:{ all -> 0x0241 }
            android.content.res.Resources r11 = r11.getResources()     // Catch:{ all -> 0x0241 }
            android.graphics.drawable.Drawable r11 = r11.getDrawable(r12)     // Catch:{ all -> 0x0241 }
            android.graphics.Bitmap r11 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.transformDrawableToBitmap(r11)     // Catch:{ all -> 0x0241 }
            java.lang.String r12 = "MicroMsg.emoji.EmojiInfo"
            java.lang.String r0 = "id:%s width:%s height:%s"
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ all -> 0x0241 }
            int r2 = r10.field_catalog     // Catch:{ all -> 0x0241 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0241 }
            r1[r6] = r2     // Catch:{ all -> 0x0241 }
            int r2 = r11.getWidth()     // Catch:{ all -> 0x0241 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0241 }
            r1[r5] = r2     // Catch:{ all -> 0x0241 }
            int r2 = r11.getHeight()     // Catch:{ all -> 0x0241 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0241 }
            r1[r4] = r2     // Catch:{ all -> 0x0241 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r0, r1)     // Catch:{ all -> 0x0241 }
            monitor-exit(r10)
            return r11
        L_0x0094:
            java.lang.String r11 = r10.getCoverPath()     // Catch:{ all -> 0x0241 }
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r11)     // Catch:{ all -> 0x0241 }
            java.lang.String r1 = "MicroMsg.emoji.EmojiInfo"
            java.lang.String r7 = "[addEmoji] thumbPath:%s isExist:%s"
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ all -> 0x0241 }
            r8[r6] = r11     // Catch:{ all -> 0x0241 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0241 }
            r8[r5] = r9     // Catch:{ all -> 0x0241 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r7, r8)     // Catch:{ all -> 0x0241 }
            if (r0 != 0) goto L_0x0129
            java.lang.String r11 = r10.mo62640K1()     // Catch:{ all -> 0x0241 }
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r11)     // Catch:{ all -> 0x0241 }
            if (r0 == 0) goto L_0x0116
            java.lang.Class<z51.g> r11 = z51.C39315g.class
            di3.d r11 = di3.C86312j.m106911c(r11)     // Catch:{ all -> 0x0241 }
            z51.g r11 = (z51.C39315g) r11     // Catch:{ all -> 0x0241 }
            zc3.b r11 = r11.getProvider()     // Catch:{ all -> 0x0241 }
            byte[] r11 = r11.mo138036u(r10)     // Catch:{ all -> 0x0241 }
            if (r11 != 0) goto L_0x00d4
            java.lang.String r11 = "MicroMsg.emoji.EmojiInfo"
            java.lang.String r12 = "bytes is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r12)     // Catch:{ all -> 0x0241 }
            monitor-exit(r10)
            return r2
        L_0x00d4:
            java.lang.String r0 = "MicroMsg.emoji.EmojiInfo"
            java.lang.String r1 = "bytes size:%s"
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x0241 }
            int r7 = r11.length     // Catch:{ all -> 0x0241 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0241 }
            r2[r6] = r7     // Catch:{ all -> 0x0241 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r2)     // Catch:{ all -> 0x0241 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.ImgUtil.isWXGF((byte[]) r11)     // Catch:{ all -> 0x0241 }
            if (r0 == 0) goto L_0x00ef
            android.graphics.Bitmap r11 = qz1.C101333i.m132961a(r11)     // Catch:{ all -> 0x0241 }
            goto L_0x00f3
        L_0x00ef:
            android.graphics.Bitmap r11 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeByteArray(r11, r12, r12)     // Catch:{ all -> 0x0241 }
        L_0x00f3:
            if (r11 == 0) goto L_0x0114
            java.lang.String r12 = "MicroMsg.emoji.EmojiInfo"
            java.lang.String r0 = "emoji:%s width:%s height:%s"
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ all -> 0x0241 }
            r1[r6] = r10     // Catch:{ all -> 0x0241 }
            int r2 = r11.getWidth()     // Catch:{ all -> 0x0241 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0241 }
            r1[r5] = r2     // Catch:{ all -> 0x0241 }
            int r2 = r11.getHeight()     // Catch:{ all -> 0x0241 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0241 }
            r1[r4] = r2     // Catch:{ all -> 0x0241 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r0, r1)     // Catch:{ all -> 0x0241 }
        L_0x0114:
            monitor-exit(r10)
            return r11
        L_0x0116:
            java.lang.String r12 = "MicroMsg.emoji.EmojiInfo"
            java.lang.String r1 = "[addEmoji] Path:%s isExist:%s"
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ all -> 0x0241 }
            r3[r6] = r11     // Catch:{ all -> 0x0241 }
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0241 }
            r3[r5] = r11     // Catch:{ all -> 0x0241 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r12, r1, r3)     // Catch:{ all -> 0x0241 }
            goto L_0x0234
        L_0x0129:
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x0241 }
            r0.<init>()     // Catch:{ all -> 0x0241 }
            r0.inJustDecodeBounds = r5     // Catch:{ all -> 0x0241 }
            com.tencent.p014mm.graphics.MMBitmapFactory.m98735d(r11, r0)     // Catch:{ all -> 0x0241 }
            int r1 = r0.outHeight     // Catch:{ all -> 0x0241 }
            if (r1 >= r12) goto L_0x0140
            int r0 = r0.outWidth     // Catch:{ all -> 0x0241 }
            if (r0 >= r12) goto L_0x0140
            android.graphics.Bitmap r11 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createThumbBitmap(r11, r1, r0, r5, r6)     // Catch:{ all -> 0x0241 }
            goto L_0x0144
        L_0x0140:
            android.graphics.Bitmap r11 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createThumbBitmap(r11, r12, r12, r5, r6)     // Catch:{ all -> 0x0241 }
        L_0x0144:
            java.lang.String r12 = "MicroMsg.emoji.EmojiInfo"
            java.lang.String r0 = "id:%s width:%s height:%s"
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ all -> 0x0241 }
            int r2 = r10.field_catalog     // Catch:{ all -> 0x0241 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0241 }
            r1[r6] = r2     // Catch:{ all -> 0x0241 }
            if (r11 != 0) goto L_0x0156
            r2 = 0
            goto L_0x015a
        L_0x0156:
            int r2 = r11.getWidth()     // Catch:{ all -> 0x0241 }
        L_0x015a:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0241 }
            r1[r5] = r2     // Catch:{ all -> 0x0241 }
            if (r11 != 0) goto L_0x0163
            goto L_0x0167
        L_0x0163:
            int r6 = r11.getHeight()     // Catch:{ all -> 0x0241 }
        L_0x0167:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0241 }
            r1[r4] = r2     // Catch:{ all -> 0x0241 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r0, r1)     // Catch:{ all -> 0x0241 }
            monitor-exit(r10)
            return r11
        L_0x0172:
            java.lang.String r12 = r10.getName()     // Catch:{ all -> 0x0241 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)     // Catch:{ all -> 0x0241 }
            if (r0 != 0) goto L_0x022c
            java.lang.String r0 = "MicroMsg.emoji.EmojiInfo"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0241 }
            r1.<init>()     // Catch:{ all -> 0x0241 }
            java.lang.String r7 = "#getBitmap, name = "
            r1.append(r7)     // Catch:{ all -> 0x0241 }
            r1.append(r12)     // Catch:{ all -> 0x0241 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0241 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = "jsb"
            boolean r0 = r12.startsWith(r0)     // Catch:{ all -> 0x0241 }
            if (r0 == 0) goto L_0x019f
            java.lang.String r12 = "jsb"
            goto L_0x01b2
        L_0x019f:
            java.lang.String r0 = "dice"
            boolean r0 = r12.startsWith(r0)     // Catch:{ all -> 0x0241 }
            if (r0 == 0) goto L_0x01aa
            java.lang.String r12 = "dice"
            goto L_0x01b2
        L_0x01aa:
            java.lang.String r0 = ".png"
            java.lang.String r1 = ""
            java.lang.String r12 = r12.replaceAll(r0, r1)     // Catch:{ all -> 0x0241 }
        L_0x01b2:
            android.content.res.Resources r0 = r11.getResources()     // Catch:{ NotFoundException -> 0x0211 }
            java.lang.String r1 = "drawable"
            java.lang.String r7 = r11.getPackageName()     // Catch:{ NotFoundException -> 0x0211 }
            int r0 = r0.getIdentifier(r12, r1, r7)     // Catch:{ NotFoundException -> 0x0211 }
            java.lang.String r1 = "MicroMsg.emoji.EmojiInfo"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ NotFoundException -> 0x0211 }
            r7.<init>()     // Catch:{ NotFoundException -> 0x0211 }
            java.lang.String r8 = "#getBitmap, get res identifier, name = "
            r7.append(r8)     // Catch:{ NotFoundException -> 0x0211 }
            r7.append(r12)     // Catch:{ NotFoundException -> 0x0211 }
            java.lang.String r8 = ", resId = "
            r7.append(r8)     // Catch:{ NotFoundException -> 0x0211 }
            r7.append(r0)     // Catch:{ NotFoundException -> 0x0211 }
            java.lang.String r7 = r7.toString()     // Catch:{ NotFoundException -> 0x0211 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r7)     // Catch:{ NotFoundException -> 0x0211 }
            android.content.res.Resources r11 = r11.getResources()     // Catch:{ NotFoundException -> 0x0211 }
            android.graphics.drawable.Drawable r11 = r11.getDrawable(r0)     // Catch:{ NotFoundException -> 0x0211 }
            android.graphics.Bitmap r11 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.transformDrawableToBitmap(r11)     // Catch:{ NotFoundException -> 0x0211 }
            java.lang.String r0 = "MicroMsg.emoji.EmojiInfo"
            java.lang.String r1 = "id:%s width:%s height:%s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ NotFoundException -> 0x0211 }
            int r7 = r10.field_catalog     // Catch:{ NotFoundException -> 0x0211 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ NotFoundException -> 0x0211 }
            r3[r6] = r7     // Catch:{ NotFoundException -> 0x0211 }
            int r7 = r11.getWidth()     // Catch:{ NotFoundException -> 0x0211 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ NotFoundException -> 0x0211 }
            r3[r5] = r7     // Catch:{ NotFoundException -> 0x0211 }
            int r5 = r11.getHeight()     // Catch:{ NotFoundException -> 0x0211 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ NotFoundException -> 0x0211 }
            r3[r4] = r5     // Catch:{ NotFoundException -> 0x0211 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r3)     // Catch:{ NotFoundException -> 0x0211 }
            monitor-exit(r10)
            return r11
        L_0x0211:
            r11 = move-exception
            java.lang.String r0 = "MicroMsg.emoji.EmojiInfo"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0241 }
            r1.<init>()     // Catch:{ all -> 0x0241 }
            java.lang.String r3 = "get res fail, name = "
            r1.append(r3)     // Catch:{ all -> 0x0241 }
            r1.append(r12)     // Catch:{ all -> 0x0241 }
            java.lang.String r12 = r1.toString()     // Catch:{ all -> 0x0241 }
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ all -> 0x0241 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r11, r12, r1)     // Catch:{ all -> 0x0241 }
            monitor-exit(r10)
            return r2
        L_0x022c:
            java.lang.String r11 = "MicroMsg.emoji.EmojiInfo"
            java.lang.String r12 = "name is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)     // Catch:{ all -> 0x0241 }
        L_0x0234:
            java.lang.String r11 = "MicroMsg.emoji.EmojiInfo"
            java.lang.String r12 = "emoji:%s"
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x0241 }
            r0[r6] = r10     // Catch:{ all -> 0x0241 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r12, r0)     // Catch:{ all -> 0x0241 }
            monitor-exit(r10)
            return r2
        L_0x0241:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.emotion.EmojiInfo.mo62657d1(android.content.Context, int):android.graphics.Bitmap");
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e1 */
    public void mo62658e1(String str) {
        this.field_encrypturl = str;
    }

    /* renamed from: e2 */
    public void mo62659e2(IEmojiInfo.C40005a aVar) {
        this.field_captureStatus = aVar.ordinal();
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof EmojiInfo) && ((EmojiInfo) obj).getMd5().equalsIgnoreCase(this.field_md5);
    }

    /* renamed from: g2 */
    public String mo62660g2() {
        return this.field_encrypturl;
    }

    public String getAesKey() {
        return this.field_aeskey;
    }

    public String getAppid() {
        return this.field_app_id;
    }

    public String getContent() {
        String str = this.field_content;
        return str == null ? "" : str;
    }

    public String getCoverPath() {
        String str;
        String K1 = mo62640K1();
        if (K1 == null) {
            str = null;
        } else {
            str = K1 + "_cover";
        }
        if (!C101964h.m134227i(this)) {
            return str;
        }
        return C112760b.m154225d() + "emoji/cover/" + getMd5() + "_cover";
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f284123W1;
    }

    public int getExtFlag() {
        return this.field_reserved4;
    }

    public int getGroup() {
        return this.field_catalog;
    }

    public String getGroupId() {
        return this.field_groupId;
    }

    public int getHeight() {
        return this.field_height;
    }

    public int getIndex() {
        return this.field_idx;
    }

    public String getMd5() {
        String str = this.field_md5;
        return str == null ? "" : str;
    }

    public String getName() {
        String str = this.field_name;
        return str == null ? "" : str;
    }

    public int getSize() {
        return this.field_size;
    }

    public String getThumbUrl() {
        return this.field_thumbUrl;
    }

    public int getType() {
        return this.field_type;
    }

    public int getWidth() {
        return this.field_width;
    }

    /* renamed from: i0 */
    public String mo62676i0() {
        return this.field_md5;
    }

    /* renamed from: j2 */
    public void mo62677j2(String str) {
        this.field_lensId = str;
    }

    /* renamed from: k */
    public boolean mo62678k() {
        int i = this.field_catalog;
        return i == 50 || i == 49;
    }

    /* renamed from: k0 */
    public void mo62679k0(String str, String str2) {
        this.f284130V1 = new EmotionStrategyInfo(str, str2);
    }

    /* renamed from: l */
    public String mo62680l() {
        return this.f284126R1;
    }

    /* renamed from: l0 */
    public void mo62681l0(int i) {
        this.field_start = i;
    }

    /* renamed from: l1 */
    public void mo62682l1(int i) {
        this.field_size = i;
    }

    /* renamed from: l2 */
    public synchronized Bitmap mo135615l2(Context context, boolean z) {
        Bitmap decodeThumb;
        Bitmap decodeFile;
        if (C86013q1.m106450k(getCoverPath()) && (decodeFile = BitmapUtil.decodeFile(getCoverPath(), (BitmapFactory.Options) null)) != null) {
            return decodeFile;
        }
        decodeThumb = MMGIFJNIFactory.Companion.decodeThumb(this);
        if (decodeThumb != null) {
            try {
                BitmapUtil.saveBitmapToImage(decodeThumb, 100, Bitmap.CompressFormat.PNG, getCoverPath(), false);
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.emoji.EmojiInfo", e, "save emoji thumb error", new Object[0]);
            }
        }
        return decodeThumb;
    }

    /* renamed from: m1 */
    public String mo62683m1() {
        return this.field_attachTextColor;
    }

    /* renamed from: m2 */
    public boolean mo135616m2() {
        if (C101964h.m134229k(this.field_md5)) {
            return true;
        }
        String coverPath = getCoverPath();
        if (Util.isNullOrNil(coverPath)) {
            return false;
        }
        return C86013q1.m106450k(coverPath);
    }

    /* renamed from: n */
    public String mo62684n() {
        return this.field_activityid;
    }

    /* renamed from: o0 */
    public String mo62685o0() {
        return this.field_designerID;
    }

    /* renamed from: o1 */
    public String mo62686o1() {
        return this.field_cdnUrl;
    }

    /* renamed from: o2 */
    public boolean mo135617o2() {
        int i = this.field_type;
        return i == 2 || i == 10;
    }

    /* renamed from: p1 */
    public void mo62687p1(int i) {
        this.field_catalog = i;
    }

    /* renamed from: p2 */
    public boolean mo135618p2() {
        return getMd5().length() == 32;
    }

    /* renamed from: q0 */
    public long mo62688q0() {
        return this.field_captureEnterTime;
    }

    /* renamed from: q1 */
    public void mo62689q1(String str) {
        this.field_externMd5 = str;
    }

    /* renamed from: q2 */
    public boolean mo135619q2() {
        return Util.isNullOrNil(this.field_app_id) && !Util.isNullOrNil(this.field_groupId) && !this.field_groupId.equals(String.valueOf(18)) && !this.field_groupId.equals(String.valueOf(17)) && !this.field_groupId.equals(String.valueOf(81)) && !this.field_groupId.equals(String.valueOf(65)) && !this.field_groupId.equals("capture");
    }

    /* renamed from: r */
    public void mo62690r(int i) {
        this.field_state = i;
    }

    /* renamed from: r2 */
    public byte[] mo135620r2(int i, int i2) {
        InputStream inputStream = null;
        if (i < 0 || i2 < 0) {
            return null;
        }
        int i3 = this.field_catalog;
        if (i3 == 17 || i3 == 50 || i3 == 49) {
            try {
                Log.m105919d("MicroMsg.emoji.EmojiInfo", "get name %s", getName());
                inputStream = C52762d.m59141a(MMApplicationContext.getContext(), getName());
                inputStream.skip((long) i);
                byte[] bArr = new byte[i2];
                inputStream.read(bArr, 0, i2);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    Log.m105921e("MicroMsg.emoji.EmojiInfo", "exception:%s", Util.stackTraceToString(e));
                }
                return bArr;
            } catch (IOException e2) {
                Log.m105921e("MicroMsg.emoji.EmojiInfo", "exception:%s", Util.stackTraceToString(e2));
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e3) {
                        Log.m105921e("MicroMsg.emoji.EmojiInfo", "exception:%s", Util.stackTraceToString(e3));
                    }
                }
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e4) {
                        Log.m105921e("MicroMsg.emoji.EmojiInfo", "exception:%s", Util.stackTraceToString(e4));
                    }
                }
                throw th;
            }
        }
        return C86013q1.m106433O(mo62640K1(), this.field_start, i2);
    }

    public void reset() {
        this.field_md5 = "";
        this.field_svrid = "";
        this.field_catalog = 65;
        this.field_type = 1;
        this.field_size = 0;
        this.field_start = 0;
        this.field_state = 0;
        this.field_name = "";
        this.field_content = "";
        this.field_reserved1 = "";
        this.field_reserved2 = "";
        this.field_reserved3 = 0;
        this.field_reserved4 = 0;
        this.field_app_id = "";
        this.field_temp = 0;
        this.field_captureStatus = 0;
        this.field_captureUploadErrCode = 0;
        this.field_captureUploadCounter = 0;
        this.field_imitateMd5 = "";
        this.field_attachedEmojiMD5 = new byte[0];
        this.f284129U1 = "";
        this.f284130V1 = null;
    }

    /* renamed from: s */
    public void mo62691s(String str) {
        this.field_designerID = str;
    }

    /* renamed from: s0 */
    public void mo62692s0(int i) {
        this.field_temp = i;
    }

    /* renamed from: s1 */
    public void mo62693s1(int i) {
        this.field_width = i;
    }

    /* renamed from: s2 */
    public void mo135622s2(int i) {
        this.field_idx = i;
    }

    public void setAesKey(String str) {
        this.field_aeskey = str;
    }

    public void setMd5(String str) {
        this.field_md5 = str;
    }

    public void setType(int i) {
        this.field_type = i;
    }

    /* renamed from: t2 */
    public void mo135623t2(String str) {
        this.field_name = str;
    }

    public String toString() {
        return "field_md5:" + this.field_md5 + "\n" + "field_svrid:" + this.field_svrid + "\n" + "field_catalog:" + this.field_catalog + "\n" + "field_type:" + this.field_type + "\n" + "field_size:" + this.field_size + "\n" + "field_start:" + this.field_start + "\n" + "field_state:" + this.field_state + "\n" + "field_name:" + this.field_name + "\n" + "field_content:" + this.field_content + "\n" + "field_reserved1:" + this.field_reserved1 + "\n" + "field_reserved2:" + this.field_reserved2 + "\n" + "field_reserved3:" + this.field_reserved3 + "\n" + "field_reserved4:" + this.field_reserved4 + "\n" + "field_app_id:" + this.field_app_id + "\n" + "field_groupId:" + this.field_groupId + "\n" + "field_lastUseTime:" + this.field_lastUseTime + "\n" + "field_framesInfo:" + this.field_framesInfo + "\n" + "field_idx:" + this.field_idx + "\n" + "field_temp:" + this.field_temp + "\n" + "field_source:" + this.field_source + "\n" + "field_needupload:" + this.field_needupload + "\n" + "field_designerID:" + this.field_designerID + "\n" + "field_thumbUrl:" + this.field_thumbUrl + "\n" + "field_captureStatus:" + this.field_captureStatus + "\n" + "field_captureUploadErrCode" + this.field_captureUploadErrCode + "\n" + "field_captureUploadCounter" + this.field_captureUploadCounter + "\n";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f284124P1);
        parcel.writeString(this.field_md5);
        parcel.writeString(this.field_svrid);
        parcel.writeInt(this.field_catalog);
        parcel.writeInt(this.field_type);
        parcel.writeInt(this.field_size);
        parcel.writeInt(this.field_start);
        parcel.writeInt(this.field_state);
        parcel.writeString(this.field_name);
        parcel.writeString(this.field_content);
        parcel.writeString(this.field_reserved1);
        parcel.writeString(this.field_reserved2);
        parcel.writeInt(this.field_reserved3);
        parcel.writeInt(this.field_reserved4);
        parcel.writeString(this.field_app_id);
        parcel.writeString(this.field_groupId);
        parcel.writeLong(this.field_lastUseTime);
        parcel.writeString(this.field_framesInfo);
        parcel.writeInt(this.field_idx);
        parcel.writeInt(this.field_temp);
        parcel.writeInt(this.field_source);
        parcel.writeInt(this.field_needupload);
        parcel.writeString(this.field_designerID);
        parcel.writeString(this.field_thumbUrl);
        parcel.writeString(this.field_cdnUrl);
        parcel.writeString(this.field_encrypturl);
        parcel.writeString(this.field_aeskey);
        parcel.writeInt(this.field_width);
        parcel.writeInt(this.field_height);
        parcel.writeString(this.field_activityid);
        parcel.writeLong(this.systemRowid);
        parcel.writeString(this.field_wxamMd5);
        parcel.writeString(this.field_attachedText);
        parcel.writeInt(this.field_captureStatus);
        byte[] bArr = this.field_attachedEmojiMD5;
        if (bArr == null || bArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(this.field_attachedEmojiMD5);
        }
        parcel.writeString(this.field_imitateMd5);
        parcel.writeInt(this.field_captureUploadErrCode);
        parcel.writeInt(this.field_captureUploadCounter);
        parcel.writeLong(this.field_captureEnterTime);
        parcel.writeString(this.field_lensId);
        parcel.writeString(this.field_attachTextColor);
        parcel.writeInt(this.field_captureScene);
        parcel.writeString(this.field_externMd5);
    }

    /* renamed from: x0 */
    public void mo62697x0(String str) {
        this.field_attachedText = str;
    }

    /* renamed from: y */
    public synchronized Bitmap mo62698y(Context context) {
        return mo135615l2(context, true);
    }

    public EmojiInfo(String str) {
        this.f284128T1 = 2;
        this.f284124P1 = str;
        reset();
    }

    public EmojiInfo(Parcel parcel) {
        this.f284128T1 = 2;
        this.f284124P1 = parcel.readString();
        this.field_md5 = parcel.readString();
        this.field_svrid = parcel.readString();
        this.field_catalog = parcel.readInt();
        this.field_type = parcel.readInt();
        this.field_size = parcel.readInt();
        this.field_start = parcel.readInt();
        this.field_state = parcel.readInt();
        this.field_name = parcel.readString();
        this.field_content = parcel.readString();
        this.field_reserved1 = parcel.readString();
        this.field_reserved2 = parcel.readString();
        this.field_reserved3 = parcel.readInt();
        this.field_reserved4 = parcel.readInt();
        this.field_app_id = parcel.readString();
        this.field_groupId = parcel.readString();
        this.field_lastUseTime = parcel.readLong();
        this.field_framesInfo = parcel.readString();
        this.field_idx = parcel.readInt();
        this.field_temp = parcel.readInt();
        this.field_source = parcel.readInt();
        this.field_needupload = parcel.readInt();
        this.field_designerID = parcel.readString();
        this.field_thumbUrl = parcel.readString();
        this.field_cdnUrl = parcel.readString();
        this.field_encrypturl = parcel.readString();
        this.field_aeskey = parcel.readString();
        this.field_width = parcel.readInt();
        this.field_height = parcel.readInt();
        this.field_activityid = parcel.readString();
        this.systemRowid = parcel.readLong();
        this.field_wxamMd5 = parcel.readString();
        this.field_attachedText = parcel.readString();
        this.field_captureStatus = parcel.readInt();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            byte[] bArr = new byte[readInt];
            this.field_attachedEmojiMD5 = bArr;
            parcel.readByteArray(bArr);
        }
        this.field_imitateMd5 = parcel.readString();
        this.field_captureUploadErrCode = parcel.readInt();
        this.field_captureUploadCounter = parcel.readInt();
        this.field_captureEnterTime = parcel.readLong();
        this.field_lensId = parcel.readString();
        this.field_attachTextColor = parcel.readString();
        this.field_captureScene = parcel.readInt();
        this.field_externMd5 = parcel.readString();
    }
}
