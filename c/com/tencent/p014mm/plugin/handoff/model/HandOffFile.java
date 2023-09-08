package com.tencent.p014mm.plugin.handoff.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import d02.C31039a;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13604l;
import te3.C101828pe0;
import te3.C101834rc0;
import te3.C64459j13;
import z04.C66725r;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b5\b\u0007\u0018\u0000 c2\u00020\u0001:\u0001dB³\u0001\b\u0017\u0012\u0006\u0010!\u001a\u00020\b\u0012\u0006\u0010'\u001a\u00020\b\u0012\u0006\u0010*\u001a\u00020\b\u0012\u0006\u0010-\u001a\u00020\b\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00107\u001a\u00020\u0002\u0012\u0006\u0010=\u001a\u00020\b\u0012\u0006\u0010@\u001a\u00020\b\u0012\u0006\u0010C\u001a\u00020\b\u0012\u0006\u0010F\u001a\u00020\b\u0012\u0006\u0010I\u001a\u00020\b\u0012\u0006\u0010L\u001a\u00020\u0002\u0012\u0006\u0010O\u001a\u00020\b\u0012\u0006\u0010R\u001a\u00020\u0002\u0012\u0006\u0010U\u001a\u00020\b\u0012\b\b\u0002\u0010X\u001a\u000200\u0012\b\b\u0002\u0010[\u001a\u00020\u0002\u0012\b\b\u0002\u0010\\\u001a\u00020\b\u0012\b\b\u0002\u0010]\u001a\u00020\b\u0012\b\b\u0002\u0010^\u001a\u00020\b¢\u0006\u0004\b_\u0010`B\t\b\u0016¢\u0006\u0004\b_\u0010aB\u0011\b\u0016\u0012\u0006\u00107\u001a\u00020\u000b¢\u0006\u0004\b_\u0010bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0015J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010J\u0012\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0010H\u0014J\u0016\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018H\u0014J\b\u0010\u001c\u001a\u00020\bH\u0016J\u0013\u0010\u001f\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002J\b\u0010 \u001a\u00020\u0002H\u0016R\"\u0010!\u001a\u00020\b8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010'\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R\"\u0010*\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&R\"\u0010-\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b-\u0010\"\u001a\u0004\b.\u0010$\"\u0004\b/\u0010&R\"\u00101\u001a\u0002008\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u00107\u001a\u00020\u00028\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010=\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b=\u0010\"\u001a\u0004\b>\u0010$\"\u0004\b?\u0010&R\"\u0010@\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b@\u0010\"\u001a\u0004\bA\u0010$\"\u0004\bB\u0010&R\"\u0010C\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bC\u0010\"\u001a\u0004\bD\u0010$\"\u0004\bE\u0010&R\"\u0010F\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bF\u0010\"\u001a\u0004\bG\u0010$\"\u0004\bH\u0010&R\"\u0010I\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bI\u0010\"\u001a\u0004\bJ\u0010$\"\u0004\bK\u0010&R\"\u0010L\u001a\u00020\u00028\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\bL\u00108\u001a\u0004\bM\u0010:\"\u0004\bN\u0010<R\"\u0010O\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bO\u0010\"\u001a\u0004\bP\u0010$\"\u0004\bQ\u0010&R\"\u0010R\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bR\u00108\u001a\u0004\bS\u0010:\"\u0004\bT\u0010<R\"\u0010U\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bU\u0010\"\u001a\u0004\bV\u0010$\"\u0004\bW\u0010&R\"\u0010X\u001a\u0002008\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bX\u00102\u001a\u0004\bY\u00104\"\u0004\bZ\u00106¨\u0006e"}, mo182094d2 = {"Lcom/tencent/mm/plugin/handoff/model/HandOffFile;", "Lcom/tencent/mm/plugin/handoff/model/AbsHandOffFile;", "", "getDataType", "Lcom/tencent/mm/plugin/handoff/model/HandOff;", "newHandOff", "", "update", "", "body", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "Lrx3/b0;", "writeToParcel", "Lcom/tencent/mm/plugin/ball/model/BallInfo;", "ballInfo", "saveToBallInfo", "Lcom/tencent/mm/plugin/multitask/model/MultiTaskInfo;", "multiTaskInfo", "saveToMultiTaskInfo", "copy", "doCreateBallInfo", "Lrx3/l;", "Lte3/j13;", "", "doCreateMultiTaskInfo", "toString", "", "other", "equals", "hashCode", "fullPath", "Ljava/lang/String;", "getFullPath", "()Ljava/lang/String;", "setFullPath", "(Ljava/lang/String;)V", "fileType", "getFileType", "setFileType", "title", "getTitle", "setTitle", "md5", "getMd5", "setMd5", "", "size", "J", "getSize", "()J", "setSize", "(J)V", "source", "I", "getSource", "()I", "setSource", "(I)V", "svrId", "getSvrId", "setSvrId", "extId", "getExtId", "setExtId", "cdnURL", "getCdnURL", "setCdnURL", "aesKey", "getAesKey", "setAesKey", "authKey", "getAuthKey", "setAuthKey", "fileStatus", "getFileStatus", "setFileStatus", "appId", "getAppId", "setAppId", "sdkVersion", "getSdkVersion", "setSdkVersion", "mediaId", "getMediaId", "setMediaId", "uploadedSize", "getUploadedSize", "setUploadedSize", "handOffType", "from", "to", "key", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()V", "(Landroid/os/Parcel;)V", "Companion", "b", "api-handoff_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.handoff.model.HandOffFile */
public final class HandOffFile extends AbsHandOffFile {
    public static final Parcelable.Creator<HandOffFile> CREATOR = new C30123a();
    public static final C94143b Companion = new C94143b((C8480h) null);
    private static final String KAesKey = "handoff#aesKey";
    private static final String KAppId = "handoff#appId";
    private static final String KAuthKey = "handoff#authKey";
    private static final String KCdnURL = "handoff#cdnURL";
    private static final String KExtId = "handoff#extId";
    private static final String KFileStatus = "handoff#fileStatus";
    private static final String KFileType = "handoff#fileType";
    private static final String KFrom = "handoff#from";
    private static final String KFullPath = "handoff#fullPath";
    private static final String KKey = "handoff#key";
    private static final String KMd5 = "handoff#md5";
    private static final String KMediaId = "handoff#KmediaId";
    private static final String KSdkVersion = "handoff#sdkVersion";
    private static final String KSize = "handoff#size";
    private static final String KSource = "handoff#source";
    private static final String KSvrId = "handoff#svrId";
    private static final String KTitle = "handoff#title";
    private static final String KTo = "handoff#to";
    private static final String KUploadedSize = "handoff#KUploadedSize";
    private String aesKey;
    private String appId;
    private String authKey;
    private String cdnURL;
    private String extId;
    private int fileStatus;
    private String fileType;
    private String fullPath;
    private String md5;
    private String mediaId;
    private int sdkVersion;
    private long size;
    private int source;
    private String svrId;
    private String title;
    private long uploadedSize;

    /* renamed from: com.tencent.mm.plugin.handoff.model.HandOffFile$a */
    public static final class C30123a implements Parcelable.Creator<HandOffFile> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, FirebaseAnalytics.C113379b.SOURCE);
            return new HandOffFile(parcel);
        }

        public Object[] newArray(int i) {
            return new HandOffFile[i];
        }
    }

    /* renamed from: com.tencent.mm.plugin.handoff.model.HandOffFile$b */
    public static final class C94143b {
        public C94143b(C8480h hVar) {
        }

        /* renamed from: a */
        public final HandOffFile mo129299a(BallInfo ballInfo) {
            long j;
            long j2;
            int i;
            long j3;
            BallInfo ballInfo2 = ballInfo;
            C87412m.m108594g(ballInfo2, "ballInfo");
            String h = ballInfo2.mo149045h(HandOffFile.KFullPath, "");
            String h2 = ballInfo2.mo149045h(HandOffFile.KFileType, "");
            String h3 = ballInfo2.mo149045h(HandOffFile.KTitle, "");
            String h4 = ballInfo2.mo149045h(HandOffFile.KMd5, "");
            synchronized (ballInfo) {
                j = ballInfo2.mo149047j(HandOffFile.KSize) ? ballInfo2.f311678C.getLong(HandOffFile.KSize, 0) : 0;
            }
            int g = ballInfo2.mo149044g(HandOffFile.KSource, 0);
            String h5 = ballInfo2.mo149045h(HandOffFile.KSvrId, "");
            String h6 = ballInfo2.mo149045h(HandOffFile.KExtId, "");
            String h7 = ballInfo2.mo149045h(HandOffFile.KCdnURL, "");
            String h8 = ballInfo2.mo149045h(HandOffFile.KAesKey, "");
            String h9 = ballInfo2.mo149045h(HandOffFile.KAuthKey, "");
            int g2 = ballInfo2.mo149044g(HandOffFile.KFileStatus, 0);
            String h15 = ballInfo2.mo149045h(HandOffFile.KAppId, "");
            int i2 = g;
            int g3 = ballInfo2.mo149044g(HandOffFile.KSdkVersion, 0);
            String h16 = ballInfo2.mo149045h(HandOffFile.KMediaId, "");
            synchronized (ballInfo) {
                if (ballInfo2.mo149047j(HandOffFile.KUploadedSize)) {
                    i = g3;
                    j2 = j;
                    j3 = ballInfo2.f311678C.getLong(HandOffFile.KUploadedSize, 0);
                } else {
                    i = g3;
                    j2 = j;
                    j3 = 0;
                }
            }
            String h17 = ballInfo2.mo149045h(HandOffFile.KFrom, "");
            String h18 = ballInfo2.mo149045h(HandOffFile.KTo, "");
            String h19 = ballInfo2.mo149045h(HandOffFile.KKey, "");
            String str = h16;
            HandOffFile handOffFile = r3;
            C87412m.m108593f(h, "fullPath");
            C87412m.m108593f(h2, "fileType");
            C87412m.m108593f(h3, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            C87412m.m108593f(h4, "md5");
            C87412m.m108593f(h5, "svrId");
            C87412m.m108593f(h6, "extId");
            C87412m.m108593f(h7, "cdnURL");
            C87412m.m108593f(h8, "aesKey");
            C87412m.m108593f(h9, "authKey");
            C87412m.m108593f(h15, "appId");
            C87412m.m108593f(str, "mediaId");
            C87412m.m108593f(h17, "from");
            C87412m.m108593f(h18, "to");
            C87412m.m108593f(h19, "key");
            HandOffFile handOffFile2 = new HandOffFile(h, h2, h3, h4, j2, i2, h5, h6, h7, h8, h9, g2, h15, i, str, j3, 2, h17, h18, h19);
            return handOffFile;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0061, code lost:
            r0 = r0.f299405d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00b9  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00bb  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00be  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00c0  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.tencent.p014mm.plugin.handoff.model.HandOffFile mo129300b(te3.C101834rc0 r28, java.lang.String r29, com.tencent.p014mm.storage.C72963f4 r30, java.lang.String r31) {
            /*
                r27 = this;
                r0 = r28
                java.lang.String r1 = "dataItem"
                gy3.C87412m.m108594g(r0, r1)
                java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r31)
                java.lang.String r1 = r0.f299262K
                java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
                java.lang.String r1 = r0.f299297d
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
                java.lang.String r1 = r0.f299266M
                java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
                long r1 = r0.f299276R
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                long r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Long) r1)
                java.lang.String r1 = r0.f299325s
                java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
                java.lang.String r2 = r0.f299329u
                java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
                java.lang.String r2 = r0.f299340y1
                java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
                java.lang.String r2 = r0.f299342z1
                java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
                java.lang.String r9 = r0.f299280T
                java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r9)
                r9 = 3
                java.lang.String r12 = ""
                if (r29 == 0) goto L_0x0053
                r0 = 2
                r10 = r29
                r22 = r12
                r23 = r22
                r9 = 2
                goto L_0x0093
            L_0x0053:
                if (r30 == 0) goto L_0x008e
                long r15 = r30.mo108774y2()     // Catch:{ Exception -> 0x007e }
                java.lang.String r9 = java.lang.String.valueOf(r15)     // Catch:{ Exception -> 0x007e }
                te3.sc0 r0 = r0.f299296c1     // Catch:{ Exception -> 0x007c }
                if (r0 == 0) goto L_0x0068
                te3.tc0 r0 = r0.f299405d     // Catch:{ Exception -> 0x007c }
                if (r0 == 0) goto L_0x0068
                java.lang.String r0 = r0.f299519f     // Catch:{ Exception -> 0x007c }
                goto L_0x0069
            L_0x0068:
                r0 = 0
            L_0x0069:
                if (r0 != 0) goto L_0x006c
                r0 = r12
            L_0x006c:
                java.lang.String r15 = r30.mo108768t()     // Catch:{ Exception -> 0x0080 }
                java.lang.String r10 = "msg.talker"
                gy3.C87412m.m108593f(r15, r10)     // Catch:{ Exception -> 0x0080 }
                r22 = r0
                r10 = r9
                r23 = r15
                goto L_0x008c
            L_0x007c:
                r0 = r12
                goto L_0x0080
            L_0x007e:
                r0 = r12
                r9 = r0
            L_0x0080:
                java.lang.String r10 = "HandOffService"
                java.lang.String r15 = "Get null from record msg, use default value"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r15)
                r22 = r0
                r10 = r9
                r23 = r12
            L_0x008c:
                r9 = 1
                goto L_0x0093
            L_0x008e:
                r10 = r12
                r22 = r10
                r23 = r22
            L_0x0093:
                com.tencent.mm.plugin.handoff.model.HandOffFile r0 = new com.tencent.mm.plugin.handoff.model.HandOffFile
                java.lang.String r12 = "fullPath"
                gy3.C87412m.m108593f(r3, r12)
                java.lang.String r12 = "fileExt"
                gy3.C87412m.m108593f(r4, r12)
                java.lang.String r12 = "fileName"
                gy3.C87412m.m108593f(r5, r12)
                java.lang.String r12 = "fileMd5"
                gy3.C87412m.m108593f(r6, r12)
                java.lang.String r12 = "extId"
                gy3.C87412m.m108593f(r11, r12)
                java.lang.String r12 = "cdnURL"
                gy3.C87412m.m108593f(r1, r12)
                int r12 = r1.length()
                if (r12 <= 0) goto L_0x00bb
                r12 = 1
                goto L_0x00bc
            L_0x00bb:
                r12 = 0
            L_0x00bc:
                if (r12 == 0) goto L_0x00c0
                r12 = r1
                goto L_0x00c1
            L_0x00c0:
                r12 = r2
            L_0x00c1:
                java.lang.String r1 = "if (cdnURL.isNotEmpty()) cdnURL else tpURL"
                gy3.C87412m.m108593f(r12, r1)
                java.lang.String r1 = "aesKey"
                gy3.C87412m.m108593f(r13, r1)
                java.lang.String r1 = "authKey"
                gy3.C87412m.m108593f(r14, r1)
                r15 = 1
                r17 = 0
                r19 = 0
                r21 = 1
                r24 = 0
                r25 = 524288(0x80000, float:7.34684E-40)
                r26 = 0
                java.lang.String r16 = ""
                java.lang.String r18 = ""
                r2 = r0
                r2.<init>(r3, r4, r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r22, r23, r24, r25, r26)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.handoff.model.HandOffFile.C94143b.mo129300b(te3.rc0, java.lang.String, com.tencent.mm.storage.f4, java.lang.String):com.tencent.mm.plugin.handoff.model.HandOffFile");
        }

        /* renamed from: c */
        public final HandOffFile mo129301c(MultiTaskInfo multiTaskInfo) {
            MultiTaskInfo multiTaskInfo2 = multiTaskInfo;
            if (multiTaskInfo2 == null) {
                return null;
            }
            C64459j13 m2 = multiTaskInfo.mo80305m2();
            C101828pe0 pe02 = new C101828pe0();
            pe02.parseFrom(multiTaskInfo2.field_data);
            String nullAsNil = Util.nullAsNil(pe02.f299161e);
            String nullAsNil2 = Util.nullAsNil(pe02.f299162f);
            String str = nullAsNil2;
            String nullAsNil3 = Util.nullAsNil(m2.f183752e);
            String nullAsNil4 = Util.nullAsNil(pe02.f299175v);
            String str2 = nullAsNil4;
            long j = pe02.f299159J;
            int i = pe02.f299176w;
            String nullAsNil5 = Util.nullAsNil(pe02.f299177x);
            String str3 = nullAsNil5;
            String nullAsNil6 = Util.nullAsNil(pe02.f299178y);
            String str4 = nullAsNil2;
            String nullAsNil7 = Util.nullAsNil(pe02.f299179z);
            String str5 = nullAsNil5;
            String str6 = nullAsNil7;
            String str7 = nullAsNil7;
            String nullAsNil8 = Util.nullAsNil(pe02.f299150A);
            String str8 = str;
            String str9 = nullAsNil4;
            String str10 = nullAsNil8;
            String str11 = nullAsNil8;
            String nullAsNil9 = Util.nullAsNil(pe02.f299151B);
            String str12 = nullAsNil9;
            String str13 = nullAsNil9;
            int i2 = pe02.f299152C;
            String nullAsNil10 = Util.nullAsNil(pe02.f299153D);
            String str14 = nullAsNil10;
            String str15 = nullAsNil10;
            int i3 = pe02.f299154E;
            String nullAsNil11 = Util.nullAsNil(pe02.f299155F);
            String str16 = str2;
            long j2 = pe02.f299156G;
            String nullAsNil12 = Util.nullAsNil(pe02.f299157H);
            String nullAsNil13 = Util.nullAsNil(pe02.f299158I);
            String nullAsNil14 = Util.nullAsNil(multiTaskInfo2.field_id);
            String str17 = str4;
            String str18 = str7;
            String str19 = str3;
            C87412m.m108593f(nullAsNil, "fullPath");
            C87412m.m108593f(str17, "fileType");
            C87412m.m108593f(nullAsNil3, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            C87412m.m108593f(str9, "md5");
            C87412m.m108593f(str5, "svrId");
            C87412m.m108593f(nullAsNil6, "extId");
            C87412m.m108593f(str18, "cdnURL");
            C87412m.m108593f(str11, "aesKey");
            C87412m.m108593f(str13, "authKey");
            C87412m.m108593f(str15, "appId");
            C87412m.m108593f(nullAsNil11, "mediaId");
            C87412m.m108593f(nullAsNil12, "from");
            C87412m.m108593f(nullAsNil13, "to");
            C87412m.m108593f(nullAsNil14, "key");
            return new HandOffFile(nullAsNil, str8, nullAsNil3, str16, j, i, str19, nullAsNil6, str6, str10, str12, i2, str14, i3, nullAsNil11, j2, 2, nullAsNil12, nullAsNil13, nullAsNil14);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HandOffFile(java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, long r32, int r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, int r40, java.lang.String r41, int r42, java.lang.String r43) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r32
            r7 = r34
            r8 = r35
            r9 = r36
            r10 = r37
            r11 = r38
            r12 = r39
            r13 = r40
            r14 = r41
            r15 = r42
            r16 = r43
            r25 = r0
            java.lang.String r0 = "fullPath"
            r26 = r1
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "fileType"
            r1 = r29
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "title"
            r1 = r30
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "md5"
            r1 = r31
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "svrId"
            r1 = r35
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "extId"
            r1 = r36
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "cdnURL"
            r1 = r37
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "aesKey"
            r1 = r38
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "authKey"
            r1 = r39
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "appId"
            r1 = r41
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "mediaId"
            r1 = r43
            gy3.C87412m.m108594g(r1, r0)
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 1015808(0xf8000, float:1.42345E-39)
            r24 = 0
            r0 = r25
            r1 = r26
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.handoff.model.HandOffFile.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HandOffFile(java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, long r32, int r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, int r40, java.lang.String r41, int r42, java.lang.String r43, long r44) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r32
            r7 = r34
            r8 = r35
            r9 = r36
            r10 = r37
            r11 = r38
            r12 = r39
            r13 = r40
            r14 = r41
            r15 = r42
            r16 = r43
            r17 = r44
            r25 = r0
            java.lang.String r0 = "fullPath"
            r26 = r1
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "fileType"
            r1 = r29
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "title"
            r1 = r30
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "md5"
            r1 = r31
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "svrId"
            r1 = r35
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "extId"
            r1 = r36
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "cdnURL"
            r1 = r37
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "aesKey"
            r1 = r38
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "authKey"
            r1 = r39
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "appId"
            r1 = r41
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "mediaId"
            r1 = r43
            gy3.C87412m.m108594g(r1, r0)
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 983040(0xf0000, float:1.377532E-39)
            r24 = 0
            r0 = r25
            r1 = r26
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.handoff.model.HandOffFile.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String, long):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HandOffFile(java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, long r32, int r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, int r40, java.lang.String r41, int r42, java.lang.String r43, long r44, int r46) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r32
            r7 = r34
            r8 = r35
            r9 = r36
            r10 = r37
            r11 = r38
            r12 = r39
            r13 = r40
            r14 = r41
            r15 = r42
            r16 = r43
            r17 = r44
            r19 = r46
            r25 = r0
            java.lang.String r0 = "fullPath"
            r26 = r1
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "fileType"
            r1 = r29
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "title"
            r1 = r30
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "md5"
            r1 = r31
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "svrId"
            r1 = r35
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "extId"
            r1 = r36
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "cdnURL"
            r1 = r37
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "aesKey"
            r1 = r38
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "authKey"
            r1 = r39
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "appId"
            r1 = r41
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "mediaId"
            r1 = r43
            gy3.C87412m.m108594g(r1, r0)
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 917504(0xe0000, float:1.285697E-39)
            r24 = 0
            r0 = r25
            r1 = r26
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.handoff.model.HandOffFile.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String, long, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HandOffFile(java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, long r32, int r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, int r40, java.lang.String r41, int r42, java.lang.String r43, long r44, int r46, java.lang.String r47) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r32
            r7 = r34
            r8 = r35
            r9 = r36
            r10 = r37
            r11 = r38
            r12 = r39
            r13 = r40
            r14 = r41
            r15 = r42
            r16 = r43
            r17 = r44
            r19 = r46
            r20 = r47
            r25 = r0
            java.lang.String r0 = "fullPath"
            r26 = r1
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "fileType"
            r1 = r29
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "title"
            r1 = r30
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "md5"
            r1 = r31
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "svrId"
            r1 = r35
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "extId"
            r1 = r36
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "cdnURL"
            r1 = r37
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "aesKey"
            r1 = r38
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "authKey"
            r1 = r39
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "appId"
            r1 = r41
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "mediaId"
            r1 = r43
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "from"
            r1 = r47
            gy3.C87412m.m108594g(r1, r0)
            r21 = 0
            r22 = 0
            r23 = 786432(0xc0000, float:1.102026E-39)
            r24 = 0
            r0 = r25
            r1 = r26
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.handoff.model.HandOffFile.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String, long, int, java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HandOffFile(java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, long r32, int r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, int r40, java.lang.String r41, int r42, java.lang.String r43, long r44, int r46, java.lang.String r47, java.lang.String r48) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r32
            r7 = r34
            r8 = r35
            r9 = r36
            r10 = r37
            r11 = r38
            r12 = r39
            r13 = r40
            r14 = r41
            r15 = r42
            r16 = r43
            r17 = r44
            r19 = r46
            r20 = r47
            r21 = r48
            r25 = r0
            java.lang.String r0 = "fullPath"
            r26 = r1
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "fileType"
            r1 = r29
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "title"
            r1 = r30
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "md5"
            r1 = r31
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "svrId"
            r1 = r35
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "extId"
            r1 = r36
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "cdnURL"
            r1 = r37
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "aesKey"
            r1 = r38
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "authKey"
            r1 = r39
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "appId"
            r1 = r41
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "mediaId"
            r1 = r43
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "from"
            r1 = r47
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "to"
            r1 = r48
            gy3.C87412m.m108594g(r1, r0)
            r22 = 0
            r23 = 524288(0x80000, float:7.34684E-40)
            r24 = 0
            r0 = r25
            r1 = r26
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.handoff.model.HandOffFile.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String, long, int, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HandOffFile(java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, long r26, int r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, int r34, java.lang.String r35, int r36, java.lang.String r37, long r38, int r40, java.lang.String r41, java.lang.String r42, java.lang.String r43) {
        /*
            r21 = this;
            r10 = r21
            r11 = r23
            r12 = r24
            r13 = r25
            r14 = r29
            r15 = r30
            r9 = r31
            r8 = r32
            r6 = r33
            r7 = r35
            r5 = r37
            java.lang.String r0 = "fullPath"
            r4 = r22
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r0 = "fileType"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = "title"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.String r0 = "md5"
            gy3.C87412m.m108594g(r13, r0)
            java.lang.String r0 = "svrId"
            gy3.C87412m.m108594g(r14, r0)
            java.lang.String r0 = "extId"
            gy3.C87412m.m108594g(r15, r0)
            java.lang.String r0 = "cdnURL"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "aesKey"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = "authKey"
            gy3.C87412m.m108594g(r6, r0)
            java.lang.String r0 = "appId"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.String r0 = "mediaId"
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r0 = "from"
            r2 = r41
            gy3.C87412m.m108594g(r2, r0)
            java.lang.String r0 = "to"
            r3 = r42
            gy3.C87412m.m108594g(r3, r0)
            java.lang.String r0 = "key"
            r1 = r43
            gy3.C87412m.m108594g(r1, r0)
            r16 = 0
            r17 = 0
            r19 = 48
            r20 = 0
            r0 = r21
            r1 = r40
            r4 = r43
            r5 = r16
            r6 = r17
            r8 = r19
            r9 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9)
            r21.setFullPath(r22)
            r10.fileType = r11
            r10.title = r12
            r10.md5 = r13
            r0 = r26
            r10.setSize(r0)
            r0 = r28
            r10.setSource(r0)
            r10.svrId = r14
            r10.extId = r15
            r0 = r31
            r10.cdnURL = r0
            r0 = r32
            r10.aesKey = r0
            r0 = r33
            r10.authKey = r0
            r0 = r34
            r10.setFileStatus(r0)
            r0 = r35
            r10.appId = r0
            r0 = r36
            r10.sdkVersion = r0
            r0 = r37
            r10.mediaId = r0
            r0 = r38
            r10.uploadedSize = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.handoff.model.HandOffFile.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String, long, int, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static final HandOffFile fromBallInfo(BallInfo ballInfo) {
        return Companion.mo129299a(ballInfo);
    }

    public static final HandOffFile fromFavItem(C101834rc0 rc02, String str) {
        C94143b bVar = Companion;
        bVar.getClass();
        C87412m.m108594g(rc02, "dataItem");
        return bVar.mo129300b(rc02, (String) null, (C72963f4) null, str);
    }

    public static final HandOffFile fromFavItem(C101834rc0 rc02, String str, C72963f4 f4Var, String str2) {
        return Companion.mo129300b(rc02, str, f4Var, str2);
    }

    public static final HandOffFile fromMultiTask(MultiTaskInfo multiTaskInfo) {
        return Companion.mo129301c(multiTaskInfo);
    }

    public static final boolean isSupportOpenFile(String str) {
        Companion.getClass();
        return AbsHandOffFile.Companion.mo23889a(str);
    }

    public String body() {
        return C66725r.m78728b("\n        <filetype>" + C31039a.m39287a(this.fileType) + "</filetype>\n        <title>" + C31039a.m39287a(this.title) + "</title>\n        <md5>" + C31039a.m39287a(this.md5) + "</md5>\n        <uploadedsize>" + C31039a.m39287a(Long.valueOf(this.uploadedSize)) + "</uploadedsize>\n        <size>" + C31039a.m39287a(Long.valueOf(getSize())) + "</size>\n        <source>" + C31039a.m39287a(Integer.valueOf(getSource())) + "</source>\n        <id>" + C31039a.m39287a(this.svrId) + "</id>\n        <extid>" + C31039a.m39287a(this.extId) + "</extid>\n        <cdnurl>" + C31039a.m39287a(this.cdnURL) + "</cdnurl>\n        <aeskey>" + C31039a.m39287a(this.aesKey) + "</aeskey>\n        <authkey>" + C31039a.m39287a(this.authKey) + "</authkey>\n        <filestatus>" + C31039a.m39287a(Integer.valueOf(getFileStatus())) + "</filestatus>\n        <appid>" + C31039a.m39287a(this.appId) + "</appid>\n        <sdkversion>" + C31039a.m39287a(Integer.valueOf(this.sdkVersion)) + "</sdkversion>\n        <mediaid>" + C31039a.m39287a(this.mediaId) + "</mediaid>\n    ");
    }

    public HandOff copy() {
        HandOffFile handOffFile = r1;
        HandOffFile handOffFile2 = new HandOffFile(getFullPath(), this.fileType, this.title, this.md5, getSize(), getSource(), this.svrId, this.extId, this.cdnURL, this.aesKey, this.authKey, getFileStatus(), this.appId, this.sdkVersion, this.mediaId, this.uploadedSize, getHandOffType(), getFrom(), getTo(), getKey());
        HandOffFile handOffFile3 = handOffFile;
        handOffFile3.setId(getId());
        return handOffFile3;
    }

    public int describeContents() {
        return 0;
    }

    public BallInfo doCreateBallInfo() {
        return null;
    }

    public C13604l<C64459j13, byte[]> doCreateMultiTaskInfo() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HandOffFile) || !super.equals(obj)) {
            return false;
        }
        HandOffFile handOffFile = (HandOffFile) obj;
        return C87412m.m108589b(getFullPath(), handOffFile.getFullPath()) && C87412m.m108589b(this.fileType, handOffFile.fileType) && C87412m.m108589b(this.title, handOffFile.title) && C87412m.m108589b(this.md5, handOffFile.md5) && getSize() == handOffFile.getSize() && getSource() == handOffFile.getSource() && C87412m.m108589b(this.svrId, handOffFile.svrId) && C87412m.m108589b(this.extId, handOffFile.extId) && C87412m.m108589b(this.cdnURL, handOffFile.cdnURL) && C87412m.m108589b(this.aesKey, handOffFile.aesKey) && C87412m.m108589b(this.authKey, handOffFile.authKey) && getFileStatus() == handOffFile.getFileStatus() && C87412m.m108589b(this.appId, handOffFile.appId) && this.sdkVersion == handOffFile.sdkVersion && C87412m.m108589b(this.mediaId, handOffFile.mediaId) && this.uploadedSize == handOffFile.uploadedSize;
    }

    public final String getAesKey() {
        return this.aesKey;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getAuthKey() {
        return this.authKey;
    }

    public final String getCdnURL() {
        return this.cdnURL;
    }

    public int getDataType() {
        return 1;
    }

    public final String getExtId() {
        return this.extId;
    }

    public int getFileStatus() {
        return this.fileStatus;
    }

    public final String getFileType() {
        return this.fileType;
    }

    public String getFullPath() {
        return this.fullPath;
    }

    public final String getMd5() {
        return this.md5;
    }

    public final String getMediaId() {
        return this.mediaId;
    }

    public final int getSdkVersion() {
        return this.sdkVersion;
    }

    public long getSize() {
        return this.size;
    }

    public int getSource() {
        return this.source;
    }

    public final String getSvrId() {
        return this.svrId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final long getUploadedSize() {
        return this.uploadedSize;
    }

    public int hashCode() {
        long size2 = getSize();
        long j = this.uploadedSize;
        return (((((((((((((((((((((((((((((((super.hashCode() * 31) + getFullPath().hashCode()) * 31) + this.fileType.hashCode()) * 31) + this.title.hashCode()) * 31) + this.md5.hashCode()) * 31) + ((int) (size2 ^ (size2 >>> 32)))) * 31) + getSource()) * 31) + this.svrId.hashCode()) * 31) + this.extId.hashCode()) * 31) + this.cdnURL.hashCode()) * 31) + this.aesKey.hashCode()) * 31) + this.authKey.hashCode()) * 31) + getFileStatus()) * 31) + this.appId.hashCode()) * 31) + this.sdkVersion) * 31) + this.mediaId.hashCode()) * 31) + ((int) (j ^ (j >>> 32)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void saveToBallInfo(com.tencent.p014mm.plugin.ball.model.BallInfo r5) {
        /*
            r4 = this;
            java.lang.String r0 = "ballInfo"
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r0 = "handoff#fullPath"
            java.lang.String r1 = r4.getFullPath()     // Catch:{ Exception -> 0x00b9 }
            r5.mo149049o(r0, r1)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r0 = "handoff#fileType"
            java.lang.String r1 = r4.fileType     // Catch:{ Exception -> 0x00b9 }
            r5.mo149049o(r0, r1)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r0 = "handoff#title"
            java.lang.String r1 = r4.title     // Catch:{ Exception -> 0x00b9 }
            r5.mo149049o(r0, r1)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r0 = "handoff#md5"
            java.lang.String r1 = r4.md5     // Catch:{ Exception -> 0x00b9 }
            r5.mo149049o(r0, r1)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r0 = "handoff#size"
            long r1 = r4.getSize()     // Catch:{ Exception -> 0x00b9 }
            monitor-enter(r5)     // Catch:{ Exception -> 0x00b9 }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ all -> 0x00b6 }
            if (r3 != 0) goto L_0x0038
            r5.mo149039d()     // Catch:{ all -> 0x00b6 }
            android.os.Bundle r3 = r5.f311678C     // Catch:{ all -> 0x00b6 }
            r3.putLong(r0, r1)     // Catch:{ all -> 0x00b6 }
        L_0x0038:
            monitor-exit(r5)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r0 = "handoff#source"
            int r1 = r4.getSource()     // Catch:{ Exception -> 0x00b9 }
            r5.mo149048m(r0, r1)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r0 = "handoff#svrId"
            java.lang.String r1 = r4.svrId     // Catch:{ Exception -> 0x00b9 }
            r5.mo149049o(r0, r1)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r0 = "handoff#extId"
            java.lang.String r1 = r4.extId     // Catch:{ Exception -> 0x00b9 }
            r5.mo149049o(r0, r1)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r0 = "handoff#cdnURL"
            java.lang.String r1 = r4.cdnURL     // Catch:{ Exception -> 0x00b9 }
            r5.mo149049o(r0, r1)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r0 = "handoff#aesKey"
            java.lang.String r1 = r4.aesKey     // Catch:{ Exception -> 0x00b9 }
            r5.mo149049o(r0, r1)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r0 = "handoff#authKey"
            java.lang.String r1 = r4.authKey     // Catch:{ Exception -> 0x00b9 }
            r5.mo149049o(r0, r1)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r0 = "handoff#fileStatus"
            int r1 = r4.getFileStatus()     // Catch:{ Exception -> 0x00b9 }
            r5.mo149048m(r0, r1)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r0 = "handoff#appId"
            java.lang.String r1 = r4.appId     // Catch:{ Exception -> 0x00b9 }
            r5.mo149049o(r0, r1)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r0 = "handoff#sdkVersion"
            int r1 = r4.sdkVersion     // Catch:{ Exception -> 0x00b9 }
            r5.mo149048m(r0, r1)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r0 = "handoff#KmediaId"
            java.lang.String r1 = r4.mediaId     // Catch:{ Exception -> 0x00b9 }
            r5.mo149049o(r0, r1)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r0 = "handoff#KUploadedSize"
            long r1 = r4.uploadedSize     // Catch:{ Exception -> 0x00b9 }
            monitor-enter(r5)     // Catch:{ Exception -> 0x00b9 }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ all -> 0x00b3 }
            if (r3 != 0) goto L_0x0096
            r5.mo149039d()     // Catch:{ all -> 0x00b3 }
            android.os.Bundle r3 = r5.f311678C     // Catch:{ all -> 0x00b3 }
            r3.putLong(r0, r1)     // Catch:{ all -> 0x00b3 }
        L_0x0096:
            monitor-exit(r5)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r0 = "handoff#from"
            java.lang.String r1 = r4.getFrom()     // Catch:{ Exception -> 0x00b9 }
            r5.mo149049o(r0, r1)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r0 = "handoff#to"
            java.lang.String r1 = r4.getTo()     // Catch:{ Exception -> 0x00b9 }
            r5.mo149049o(r0, r1)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r0 = "handoff#key"
            java.lang.String r1 = r4.getKey()     // Catch:{ Exception -> 0x00b9 }
            r5.mo149049o(r0, r1)     // Catch:{ Exception -> 0x00b9 }
            goto L_0x00b9
        L_0x00b3:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ Exception -> 0x00b9 }
            throw r0     // Catch:{ Exception -> 0x00b9 }
        L_0x00b6:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ Exception -> 0x00b9 }
            throw r0     // Catch:{ Exception -> 0x00b9 }
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.handoff.model.HandOffFile.saveToBallInfo(com.tencent.mm.plugin.ball.model.BallInfo):void");
    }

    public void saveToMultiTaskInfo(MultiTaskInfo multiTaskInfo) {
        if (multiTaskInfo != null) {
            C101828pe0 pe02 = new C101828pe0();
            pe02.parseFrom(multiTaskInfo.field_data);
            pe02.f299159J = getSize();
            pe02.f299175v = this.md5;
            pe02.f299176w = getSource();
            pe02.f299177x = this.svrId;
            pe02.f299178y = this.extId;
            pe02.f299179z = this.cdnURL;
            pe02.f299150A = this.aesKey;
            pe02.f299151B = this.authKey;
            pe02.f299152C = getFileStatus();
            pe02.f299153D = this.appId;
            pe02.f299154E = this.sdkVersion;
            pe02.f299155F = this.mediaId;
            pe02.f299156G = this.uploadedSize;
            pe02.f299157H = getFrom();
            pe02.f299158I = getTo();
            multiTaskInfo.field_data = pe02.toByteArray();
        }
    }

    public final void setAesKey(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.aesKey = str;
    }

    public final void setAppId(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.appId = str;
    }

    public final void setAuthKey(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.authKey = str;
    }

    public final void setCdnURL(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.cdnURL = str;
    }

    public final void setExtId(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.extId = str;
    }

    public void setFileStatus(int i) {
        this.fileStatus = i;
    }

    public final void setFileType(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.fileType = str;
    }

    public void setFullPath(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.fullPath = str;
    }

    public final void setMd5(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.md5 = str;
    }

    public final void setMediaId(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.mediaId = str;
    }

    public final void setSdkVersion(int i) {
        this.sdkVersion = i;
    }

    public void setSize(long j) {
        this.size = j;
    }

    public void setSource(int i) {
        this.source = i;
    }

    public final void setSvrId(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.svrId = str;
    }

    public final void setTitle(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.title = str;
    }

    public final void setUploadedSize(long j) {
        this.uploadedSize = j;
    }

    public String toString() {
        return "HandOffFile(key='" + getKey() + "', id='" + getId() + "', createTime='" + getCreateTime() + ", fullPath='" + getFullPath() + "', fileType='" + this.fileType + "', title='" + this.title + "', md5='" + this.md5 + "', size=" + getSize() + ", source=" + getSource() + ", svrId='" + this.svrId + "', extId='" + this.extId + "', cdnURL='" + this.cdnURL + "', aesKey='" + this.aesKey + "', authKey='" + this.authKey + "', fileStatus=" + getFileStatus() + ", appId='" + this.appId + "', sdkVersion=" + this.sdkVersion + ", mediaId='" + this.mediaId + "', uploadedSize=" + this.uploadedSize + ')';
    }

    public boolean update(HandOff handOff) {
        C87412m.m108594g(handOff, "newHandOff");
        boolean update = super.update(handOff);
        if (!(handOff instanceof HandOffFile) || C87412m.m108589b(handOff, this)) {
            return update;
        }
        HandOffFile handOffFile = (HandOffFile) handOff;
        boolean z = false;
        if (handOffFile.getFullPath().length() > 0) {
            setFullPath(handOffFile.getFullPath());
        }
        if (handOffFile.fileType.length() > 0) {
            this.fileType = handOffFile.fileType;
        }
        if (handOffFile.title.length() > 0) {
            this.title = handOffFile.title;
        }
        if (handOffFile.md5.length() > 0) {
            this.md5 = handOffFile.md5;
        }
        if (handOffFile.getSize() != 0) {
            setSize(handOffFile.getSize());
        }
        if (handOffFile.getSource() != 0) {
            setSource(handOffFile.getSource());
        }
        if (handOffFile.svrId.length() > 0) {
            this.svrId = handOffFile.svrId;
        }
        if (handOffFile.extId.length() > 0) {
            this.extId = handOffFile.extId;
        }
        if (handOffFile.cdnURL.length() > 0) {
            this.cdnURL = handOffFile.cdnURL;
        }
        if (handOffFile.aesKey.length() > 0) {
            this.aesKey = handOffFile.aesKey;
        }
        if (handOffFile.authKey.length() > 0) {
            this.authKey = handOffFile.authKey;
        }
        if (handOffFile.getFileStatus() != 0) {
            setFileStatus(handOffFile.getFileStatus());
        }
        if (handOffFile.appId.length() > 0) {
            this.appId = handOffFile.appId;
        }
        int i = handOffFile.sdkVersion;
        if (i != 0) {
            this.sdkVersion = i;
        }
        if (handOffFile.mediaId.length() > 0) {
            z = true;
        }
        if (z) {
            this.mediaId = handOffFile.mediaId;
        }
        long j = handOffFile.uploadedSize;
        if (j != 0) {
            this.uploadedSize = j;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "dest");
        super.writeToParcel(parcel, i);
        parcel.writeString(getFullPath());
        parcel.writeString(this.fileType);
        parcel.writeString(this.title);
        parcel.writeString(this.md5);
        parcel.writeLong(getSize());
        parcel.writeInt(getSource());
        parcel.writeString(this.svrId);
        parcel.writeString(this.extId);
        parcel.writeString(this.cdnURL);
        parcel.writeString(this.aesKey);
        parcel.writeString(this.authKey);
        parcel.writeInt(getFileStatus());
        parcel.writeString(this.appId);
        parcel.writeInt(this.sdkVersion);
        parcel.writeString(this.mediaId);
        parcel.writeLong(this.uploadedSize);
    }

    public static final HandOffFile fromFavItem(C101834rc0 rc02, String str, String str2) {
        C94143b bVar = Companion;
        bVar.getClass();
        C87412m.m108594g(rc02, "dataItem");
        return bVar.mo129300b(rc02, str, (C72963f4) null, str2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ HandOffFile(java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, long r30, int r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, int r38, java.lang.String r39, int r40, java.lang.String r41, long r42, int r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, int r48, gy3.C8480h r49) {
        /*
            r25 = this;
            r0 = 32768(0x8000, float:4.5918E-41)
            r0 = r48 & r0
            if (r0 == 0) goto L_0x000c
            r0 = 0
            r19 = r0
            goto L_0x000e
        L_0x000c:
            r19 = r42
        L_0x000e:
            r0 = 65536(0x10000, float:9.18355E-41)
            r0 = r48 & r0
            r1 = 1
            if (r0 == 0) goto L_0x0017
            r0 = 1
            goto L_0x0019
        L_0x0017:
            r0 = r44
        L_0x0019:
            r2 = 131072(0x20000, float:1.83671E-40)
            r2 = r48 & r2
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x0024
            r22 = r3
            goto L_0x0026
        L_0x0024:
            r22 = r45
        L_0x0026:
            r2 = 262144(0x40000, float:3.67342E-40)
            r2 = r48 & r2
            if (r2 == 0) goto L_0x002f
            r23 = r3
            goto L_0x0031
        L_0x002f:
            r23 = r46
        L_0x0031:
            r2 = 524288(0x80000, float:7.34684E-40)
            r2 = r48 & r2
            if (r2 == 0) goto L_0x0040
            com.tencent.mm.plugin.handoff.model.HandOff$a r2 = com.tencent.p014mm.plugin.handoff.model.HandOff.Companion
            java.lang.String r1 = r2.mo57158a(r1, r0)
            r24 = r1
            goto L_0x0042
        L_0x0040:
            r24 = r47
        L_0x0042:
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r28
            r6 = r29
            r7 = r30
            r9 = r32
            r10 = r33
            r11 = r34
            r12 = r35
            r13 = r36
            r14 = r37
            r15 = r38
            r16 = r39
            r17 = r40
            r18 = r41
            r21 = r0
            r2.<init>(r3, r4, r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.handoff.model.HandOffFile.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String, long, int, java.lang.String, java.lang.String, java.lang.String, int, gy3.h):void");
    }

    public HandOffFile() {
        this("", "", "", "", 0, 0, "", "", "", "", "", 0, "", 0, "", 0, 0, (String) null, (String) null, (String) null, 1015808, (C8480h) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandOffFile(Parcel parcel) {
        super(parcel);
        C87412m.m108594g(parcel, FirebaseAnalytics.C113379b.SOURCE);
        String readString = parcel.readString();
        C87412m.m108591d(readString);
        setFullPath(readString);
        String readString2 = parcel.readString();
        C87412m.m108591d(readString2);
        this.fileType = readString2;
        String readString3 = parcel.readString();
        C87412m.m108591d(readString3);
        this.title = readString3;
        String readString4 = parcel.readString();
        C87412m.m108591d(readString4);
        this.md5 = readString4;
        setSize(parcel.readLong());
        setSource(parcel.readInt());
        String readString5 = parcel.readString();
        C87412m.m108591d(readString5);
        this.svrId = readString5;
        String readString6 = parcel.readString();
        C87412m.m108591d(readString6);
        this.extId = readString6;
        String readString7 = parcel.readString();
        C87412m.m108591d(readString7);
        this.cdnURL = readString7;
        String readString8 = parcel.readString();
        C87412m.m108591d(readString8);
        this.aesKey = readString8;
        String readString9 = parcel.readString();
        C87412m.m108591d(readString9);
        this.authKey = readString9;
        setFileStatus(parcel.readInt());
        String readString10 = parcel.readString();
        C87412m.m108591d(readString10);
        this.appId = readString10;
        this.sdkVersion = parcel.readInt();
        String readString11 = parcel.readString();
        C87412m.m108591d(readString11);
        this.mediaId = readString11;
        this.uploadedSize = parcel.readLong();
    }
}
