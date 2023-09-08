package com.tencent.p014mm.modelvideoh265toh264;

import android.media.MediaFormat;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.mmsight.segment.MP4MuxerJNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p914oj.C110052b;

/* renamed from: com.tencent.mm.modelvideoh265toh264.h */
public class C104692h {

    /* renamed from: a */
    public C110052b f310887a;

    /* renamed from: b */
    public C104693a f310888b;

    /* renamed from: c */
    public C104693a f310889c;

    /* renamed from: d */
    public List<C104693a> f310890d = new ArrayList();

    /* renamed from: e */
    public List<C104693a> f310891e = new ArrayList();

    /* renamed from: f */
    public String f310892f;

    /* renamed from: g */
    public String f310893g;

    /* renamed from: h */
    public String f310894h;

    /* renamed from: i */
    public VideoTransPara f310895i;

    /* renamed from: j */
    public long f310896j;

    /* renamed from: k */
    public long f310897k;

    /* renamed from: l */
    public int f310898l = -1;

    /* renamed from: m */
    public int f310899m = -1;

    /* renamed from: n */
    public int f310900n;

    /* renamed from: o */
    public boolean f310901o = false;

    /* renamed from: p */
    public boolean f310902p = false;

    /* renamed from: q */
    public boolean f310903q = false;

    /* renamed from: com.tencent.mm.modelvideoh265toh264.h$a */
    public class C104693a {

        /* renamed from: a */
        public MediaFormat f310904a;

        /* renamed from: b */
        public int f310905b;

        public C104693a(C104692h hVar, MediaFormat mediaFormat, int i) {
            this.f310904a = mediaFormat;
            this.f310905b = i;
        }
    }

    /* renamed from: a */
    public String mo148343a() {
        if (this.f310894h == null) {
            this.f310894h = this.f310893g + "video_temp.mp4";
        }
        return this.f310894h;
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x021a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo148344b(java.lang.String r12, java.lang.String r13, com.tencent.p014mm.modelcontrol.VideoTransPara r14) {
        /*
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "init() called with: src = ["
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = "], dst = ["
            r0.append(r1)
            r0.append(r13)
            java.lang.String r1 = "], para = ["
            r0.append(r1)
            r0.append(r14)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.VideoTranferH265toH264"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            r4 = 2
            r5 = 0
            r6 = 1
            if (r0 != 0) goto L_0x0238
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r0 != 0) goto L_0x0238
            if (r14 == 0) goto L_0x0238
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            r0.<init>((java.lang.String) r12)
            android.net.Uri r7 = com.tencent.p014mm.vfs.C116299g2.m163858n(r13)
            java.lang.String r8 = r7.getPath()
            if (r8 == 0) goto L_0x0068
            java.lang.String r8 = com.tencent.p014mm.vfs.C116299g2.m163855k(r8, r5, r5)
            java.lang.String r9 = r7.getPath()
            boolean r9 = r9.equals(r8)
            if (r9 != 0) goto L_0x0068
            android.net.Uri$Builder r7 = r7.buildUpon()
            android.net.Uri$Builder r7 = r7.path(r8)
            r7.build()
        L_0x0068:
            boolean r7 = r0.mo119967g()
            if (r7 == 0) goto L_0x0226
            boolean r7 = r0.mo119961a()
            if (r7 == 0) goto L_0x0226
            long r7 = r0.mo119980r()
            r9 = 0
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0226
            r11.f310892f = r12
            r11.f310893g = r13
            r11.f310895i = r14
            oj.b r13 = new oj.b
            r13.<init>()
            r11.f310887a = r13
            r13.mo161392k(r12)
            oj.b r13 = r11.f310887a
            int r14 = r13.mo161385d()
            r0 = 0
        L_0x0095:
            if (r0 >= r14) goto L_0x00e8
            android.media.MediaFormat r7 = r13.mo161386e(r0)
            java.lang.String r8 = "mime"
            boolean r9 = r7.containsKey(r8)
            if (r9 == 0) goto L_0x00e5
            java.lang.String r9 = r7.getString(r8)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 == 0) goto L_0x00ae
            goto L_0x00e5
        L_0x00ae:
            java.lang.String r8 = r7.getString(r8)
            java.lang.Object[] r9 = new java.lang.Object[r6]
            r9[r5] = r8
            java.lang.String r10 = "mime: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r10, r9)
            java.lang.String r9 = "audio/"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x00d0
            java.util.List<com.tencent.mm.modelvideoh265toh264.h$a> r8 = r11.f310891e
            com.tencent.mm.modelvideoh265toh264.h$a r9 = new com.tencent.mm.modelvideoh265toh264.h$a
            r9.<init>(r11, r7, r0)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            r8.add(r9)
            goto L_0x00e5
        L_0x00d0:
            java.lang.String r9 = "video/"
            boolean r8 = r8.startsWith(r9)
            if (r8 == 0) goto L_0x00e5
            java.util.List<com.tencent.mm.modelvideoh265toh264.h$a> r8 = r11.f310890d
            com.tencent.mm.modelvideoh265toh264.h$a r9 = new com.tencent.mm.modelvideoh265toh264.h$a
            r9.<init>(r11, r7, r0)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            r8.add(r9)
        L_0x00e5:
            int r0 = r0 + 1
            goto L_0x0095
        L_0x00e8:
            java.lang.Object[] r13 = new java.lang.Object[r4]
            java.util.List<com.tencent.mm.modelvideoh265toh264.h$a> r14 = r11.f310891e
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            int r14 = r14.size()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13[r5] = r14
            java.util.List<com.tencent.mm.modelvideoh265toh264.h$a> r14 = r11.f310890d
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            int r14 = r14.size()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13[r6] = r14
            java.lang.String r14 = "findMediaFormat mAudioSelectedTrackList.size() = %d, mVideoSelectedTrackList.size() = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r14, r13)
            java.util.List<com.tencent.mm.modelvideoh265toh264.h$a> r13 = r11.f310890d
            if (r13 == 0) goto L_0x021e
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            int r13 = r13.size()
            if (r13 == 0) goto L_0x021e
            java.util.List<com.tencent.mm.modelvideoh265toh264.h$a> r13 = r11.f310891e
            java.lang.String r14 = "max-input-size"
            r0 = -1
            if (r13 == 0) goto L_0x014d
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            int r13 = r13.size()
            if (r13 == 0) goto L_0x014d
            java.util.List<com.tencent.mm.modelvideoh265toh264.h$a> r13 = r11.f310891e
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.util.Iterator r13 = r13.iterator()
        L_0x012e:
            boolean r4 = r13.hasNext()
            if (r4 == 0) goto L_0x014d
            java.lang.Object r4 = r13.next()
            com.tencent.mm.modelvideoh265toh264.h$a r4 = (com.tencent.p014mm.modelvideoh265toh264.C104692h.C104693a) r4
            android.media.MediaFormat r7 = r4.f310904a
            boolean r7 = r7.containsKey(r14)
            if (r7 == 0) goto L_0x012e
            android.media.MediaFormat r4 = r4.f310904a
            int r4 = r4.getInteger(r14)
            int r0 = java.lang.Math.max(r4, r0)
            goto L_0x012e
        L_0x014d:
            java.util.List<com.tencent.mm.modelvideoh265toh264.h$a> r13 = r11.f310890d
            if (r13 == 0) goto L_0x0180
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            int r13 = r13.size()
            if (r13 == 0) goto L_0x0180
            java.util.List<com.tencent.mm.modelvideoh265toh264.h$a> r13 = r11.f310890d
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.util.Iterator r13 = r13.iterator()
        L_0x0161:
            boolean r4 = r13.hasNext()
            if (r4 == 0) goto L_0x0180
            java.lang.Object r4 = r13.next()
            com.tencent.mm.modelvideoh265toh264.h$a r4 = (com.tencent.p014mm.modelvideoh265toh264.C104692h.C104693a) r4
            android.media.MediaFormat r7 = r4.f310904a
            boolean r7 = r7.containsKey(r14)
            if (r7 == 0) goto L_0x0161
            android.media.MediaFormat r4 = r4.f310904a
            int r4 = r4.getInteger(r14)
            int r0 = java.lang.Math.max(r4, r0)
            goto L_0x0161
        L_0x0180:
            r11.f310898l = r0
            r13 = 0
            oj.c r14 = new oj.c     // Catch:{ all -> 0x0217 }
            r14.<init>()     // Catch:{ all -> 0x0217 }
            r14.setDataSource(r12)     // Catch:{ all -> 0x0214 }
            r13 = 17
            boolean r13 = p206nj.C11171e.m11046c(r13)     // Catch:{ all -> 0x0214 }
            if (r13 == 0) goto L_0x019a
            r12 = 24
            java.lang.String r12 = r14.extractMetadata(r12)     // Catch:{ all -> 0x0214 }
            goto L_0x01af
        L_0x019a:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0214 }
            r13.<init>()     // Catch:{ all -> 0x0214 }
            int r12 = com.tencent.p014mm.plugin.sight.base.SightVideoJNI.getMp4RotateVFS(r12)     // Catch:{ all -> 0x0214 }
            r13.append(r12)     // Catch:{ all -> 0x0214 }
            java.lang.String r12 = ""
            r13.append(r12)     // Catch:{ all -> 0x0214 }
            java.lang.String r12 = r13.toString()     // Catch:{ all -> 0x0214 }
        L_0x01af:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0214 }
            r13.<init>()     // Catch:{ all -> 0x0214 }
            java.lang.String r0 = "findRotationMessage sDegree = "
            r13.append(r0)     // Catch:{ all -> 0x0214 }
            r13.append(r12)     // Catch:{ all -> 0x0214 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0214 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r13)     // Catch:{ all -> 0x0214 }
            r13 = 19
            java.lang.String r13 = r14.extractMetadata(r13)     // Catch:{ all -> 0x0214 }
            r0 = 18
            java.lang.String r0 = r14.extractMetadata(r0)     // Catch:{ all -> 0x0214 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0214 }
            r4.<init>()     // Catch:{ all -> 0x0214 }
            java.lang.String r7 = "findRotationMessage sHeight = "
            r4.append(r7)     // Catch:{ all -> 0x0214 }
            r4.append(r13)     // Catch:{ all -> 0x0214 }
            java.lang.String r13 = r4.toString()     // Catch:{ all -> 0x0214 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r13)     // Catch:{ all -> 0x0214 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0214 }
            r13.<init>()     // Catch:{ all -> 0x0214 }
            java.lang.String r4 = "findRotationMessage sWidth = "
            r13.append(r4)     // Catch:{ all -> 0x0214 }
            r13.append(r0)     // Catch:{ all -> 0x0214 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0214 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r13)     // Catch:{ all -> 0x0214 }
            int r12 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r12, (int) r5)     // Catch:{ all -> 0x0214 }
            r14.release()
            r11.f310899m = r12
            r11.f310901o = r6
            java.lang.Object[] r12 = new java.lang.Object[r6]
            long r13 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r2)
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r12[r5] = r13
            java.lang.String r13 = "init cost time %dms"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r13, r12)
            return
        L_0x0214:
            r12 = move-exception
            r13 = r14
            goto L_0x0218
        L_0x0217:
            r12 = move-exception
        L_0x0218:
            if (r13 == 0) goto L_0x021d
            r13.release()
        L_0x021d:
            throw r12
        L_0x021e:
            com.tencent.mm.modelvideoh265toh264.g r12 = new com.tencent.mm.modelvideoh265toh264.g
            java.lang.String r13 = "Can not find video or audio track in this video file."
            r12.<init>(r13)
            throw r12
        L_0x0226:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.util.Locale r14 = java.util.Locale.CHINA
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r5] = r12
            java.lang.String r12 = "Argument src video file can not be read or empty %s"
            java.lang.String r12 = java.lang.String.format(r14, r12, r0)
            r13.<init>(r12)
            throw r13
        L_0x0238:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.CHINA
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r5] = r12
            r2[r6] = r13
            r2[r4] = r14
            java.lang.String r12 = "Argument's null or nil. src = %s; dst = %s; param = %s"
            java.lang.String r12 = java.lang.String.format(r1, r12, r2)
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelvideoh265toh264.C104692h.mo148344b(java.lang.String, java.lang.String, com.tencent.mm.modelcontrol.VideoTransPara):void");
    }

    /* renamed from: c */
    public final boolean mo148345c(C110052b bVar, int i, int i2) {
        C104693a aVar = this.f310889c;
        if (aVar == null) {
            return false;
        }
        bVar.mo161390i(aVar.f310905b);
        bVar.mo161389h(this.f310896j * 1000, 0);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
        try {
            this.f310889c.f310904a.getInteger("channel-count");
        } catch (Exception unused) {
            Log.m105921e("MicroMsg.VideoTranferH265toH264", "get channel count error: %s", 1);
        }
        Log.m105924i("MicroMsg.VideoTranferH265toH264", "audio channel count");
        while (true) {
            allocateDirect.clear();
            int f = bVar.mo161387f(allocateDirect, 0);
            if (f > 0) {
                if (bVar.mo161383b() >= this.f310897k * 1000) {
                    break;
                } else if (bVar.mo161384c() != this.f310889c.f310905b) {
                    Log.m105920e("MicroMsg.VideoTranferH265toH264", "track index not match! break");
                    break;
                } else {
                    allocateDirect.position(0);
                    MP4MuxerJNI.writeAACDataLock(i2, allocateDirect, f);
                    bVar.mo161382a();
                }
            } else {
                Log.m105925i("MicroMsg.VideoTranferH265toH264", "VideoClipperAPI18.muxAudio size = %d. Saw eos.", Integer.valueOf(f));
                break;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x011f A[RETURN] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo148346d(long r10, long r12) {
        /*
            r9 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            boolean r2 = r9.f310901o
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "MicroMsg.VideoTranferH265toH264"
            java.lang.String r4 = "init %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r4, r1)
            boolean r1 = r9.f310901o
            if (r1 != 0) goto L_0x001c
            java.lang.String r1 = "checkTimeParameter has not been initialized."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
        L_0x001c:
            r4 = 0
            int r1 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x0023
            r10 = r4
        L_0x0023:
            r9.f310896j = r10
            java.util.List<com.tencent.mm.modelvideoh265toh264.h$a> r10 = r9.f310890d
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            java.lang.Object r10 = r10.get(r3)
            com.tencent.mm.modelvideoh265toh264.h$a r10 = (com.tencent.p014mm.modelvideoh265toh264.C104692h.C104693a) r10
            android.media.MediaFormat r10 = r10.f310904a
            java.lang.String r11 = "durationUs"
            boolean r1 = r10.containsKey(r11)
            if (r1 == 0) goto L_0x0120
            r6 = 1000(0x3e8, double:4.94E-321)
            int r1 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x0048
            long r4 = r10.getLong(r11)
            long r4 = r4 / r6
            int r1 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x004e
        L_0x0048:
            long r10 = r10.getLong(r11)
            long r12 = r10 / r6
        L_0x004e:
            r9.f310897k = r12
            java.util.List<com.tencent.mm.modelvideoh265toh264.h$a> r10 = r9.f310890d
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            java.lang.Object r10 = r10.get(r3)
            com.tencent.mm.modelvideoh265toh264.h$a r10 = (com.tencent.p014mm.modelvideoh265toh264.C104692h.C104693a) r10
            r9.f310888b = r10
            java.util.List<com.tencent.mm.modelvideoh265toh264.h$a> r10 = r9.f310891e
            if (r10 == 0) goto L_0x0074
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            int r10 = r10.size()
            if (r10 == 0) goto L_0x0074
            java.util.List<com.tencent.mm.modelvideoh265toh264.h$a> r10 = r9.f310891e
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            java.lang.Object r10 = r10.get(r3)
            com.tencent.mm.modelvideoh265toh264.h$a r10 = (com.tencent.p014mm.modelvideoh265toh264.C104692h.C104693a) r10
            r9.f310889c = r10
        L_0x0074:
            oj.b r10 = r9.f310887a
            int r11 = r9.f310898l
            if (r11 > 0) goto L_0x007c
            r11 = 1048576(0x100000, float:1.469368E-39)
        L_0x007c:
            int r12 = r9.f310900n
            java.lang.String r13 = r9.f310892f
            java.lang.String r1 = "MicroMsg.VideoTranscoder"
            java.lang.String r4 = "VideoClipperAPI18.transcodeAndMux(88) "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            r4 = 0
            r5 = -1
            com.tencent.mm.modelvideoh265toh264.j r6 = new com.tencent.mm.modelvideoh265toh264.j     // Catch:{ Exception -> 0x00fe }
            int r7 = r9.f310900n     // Catch:{ Exception -> 0x00fe }
            r6.<init>(r7)     // Catch:{ Exception -> 0x00fe }
            long r7 = r9.f310896j     // Catch:{ Exception -> 0x00fb }
            r6.f310907a = r7     // Catch:{ Exception -> 0x00fb }
            long r7 = r9.f310897k     // Catch:{ Exception -> 0x00fb }
            r6.f310908b = r7     // Catch:{ Exception -> 0x00fb }
            com.tencent.mm.modelcontrol.VideoTransPara r4 = r9.f310895i     // Catch:{ Exception -> 0x00fb }
            java.lang.Object[] r7 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x00fb }
            r7[r3] = r4     // Catch:{ Exception -> 0x00fb }
            java.lang.String r8 = "setVideoPara: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r8, r7)     // Catch:{ Exception -> 0x00fb }
            r6.f310921o = r4     // Catch:{ Exception -> 0x00fb }
            int r7 = r9.f310899m     // Catch:{ Exception -> 0x00fb }
            r8 = 90
            if (r7 == r8) goto L_0x00b9
            r8 = 270(0x10e, float:3.78E-43)
            if (r7 != r8) goto L_0x00b1
            goto L_0x00b9
        L_0x00b1:
            int r7 = r4.f267166d     // Catch:{ Exception -> 0x00fb }
            int r4 = r4.f267167e     // Catch:{ Exception -> 0x00fb }
            r6.mo148350c(r7, r4)     // Catch:{ Exception -> 0x00fb }
            goto L_0x00c0
        L_0x00b9:
            int r7 = r4.f267167e     // Catch:{ Exception -> 0x00fb }
            int r4 = r4.f267166d     // Catch:{ Exception -> 0x00fb }
            r6.mo148350c(r7, r4)     // Catch:{ Exception -> 0x00fb }
        L_0x00c0:
            r6.f310922p = r13     // Catch:{ Exception -> 0x00fb }
            int r13 = r9.f310899m     // Catch:{ Exception -> 0x00fb }
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x00fb }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x00fb }
            r4[r3] = r13     // Catch:{ Exception -> 0x00fb }
            java.lang.String r13 = "setSrcVideoRotate: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r13, r4)     // Catch:{ Exception -> 0x00fb }
            boolean r13 = r9.f310903q     // Catch:{ Exception -> 0x00fb }
            r6.f310917k = r13     // Catch:{ Exception -> 0x00fb }
            java.lang.String r13 = "VideoClipperAPI18.transcodeAndMux(101) "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r13)
            r9.mo148347e(r6, r10, r11, r12)     // Catch:{ Exception -> 0x00e5 }
            r6.mo148351d()     // Catch:{ Exception -> 0x00e1 }
        L_0x00e1:
            r10 = 0
            goto L_0x010d
        L_0x00e3:
            r10 = move-exception
            goto L_0x00f7
        L_0x00e5:
            r10 = move-exception
            java.lang.String r11 = "Transcode and mux failed %s"
            java.lang.Object[] r12 = new java.lang.Object[r0]     // Catch:{ all -> 0x00e3 }
            java.lang.String r13 = r10.getMessage()     // Catch:{ all -> 0x00e3 }
            r12[r3] = r13     // Catch:{ all -> 0x00e3 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r10, r11, r12)     // Catch:{ all -> 0x00e3 }
            r6.mo148351d()     // Catch:{ Exception -> 0x010c }
            goto L_0x010c
        L_0x00f7:
            r6.mo148351d()     // Catch:{ Exception -> 0x00fa }
        L_0x00fa:
            throw r10
        L_0x00fb:
            r10 = move-exception
            r4 = r6
            goto L_0x00ff
        L_0x00fe:
            r10 = move-exception
        L_0x00ff:
            java.lang.Object[] r11 = new java.lang.Object[r3]
            java.lang.String r12 = "trascodeAndMux error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r10, r12, r11)
            if (r4 == 0) goto L_0x010c
            r4.mo148351d()
        L_0x010c:
            r10 = -1
        L_0x010d:
            if (r10 != r5) goto L_0x011f
            java.lang.String r10 = "transcodeAndMux error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r10)
            r9.f310901o = r3
            oj.b r10 = r9.f310887a
            if (r10 == 0) goto L_0x011e
            r10.mo161388g()
        L_0x011e:
            return r5
        L_0x011f:
            return r3
        L_0x0120:
            com.tencent.mm.modelvideoh265toh264.g r10 = new com.tencent.mm.modelvideoh265toh264.g
            java.lang.String r11 = "Can not find duration."
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelvideoh265toh264.C104692h.mo148346d(long, long):int");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|(1:4)(1:5)|6|(2:8|9)|10|11|(1:13)|14|15|16|17|18|25|(1:27)(1:28)|29|(1:31)|32|(1:34)(1:35)|36|37|38|39|47|53) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0051 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0066 A[Catch:{ Exception -> 0x01ad, all -> 0x01ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0119 A[Catch:{ Exception -> 0x01ad, all -> 0x01ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0138 A[Catch:{ Exception -> 0x01ad, all -> 0x01ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0152 A[Catch:{ Exception -> 0x01ad, all -> 0x01ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0164 A[Catch:{ Exception -> 0x01ad, all -> 0x01ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0170 A[Catch:{ Exception -> 0x01ad, all -> 0x01ab }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo148347e(com.tencent.p014mm.modelvideoh265toh264.C104695j r23, p914oj.C110052b r24, int r25, int r26) {
        /*
            r22 = this;
            r1 = r22
            r2 = r23
            r3 = r24
            java.lang.String r4 = "MicroMsg.VideoTranferH265toH264"
            java.lang.String r0 = "VideoClipperAPI18.transcodeAndMux(118) "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            com.tencent.mm.modelvideoh265toh264.h$a r0 = r1.f310888b
            int r0 = r0.f310905b
            r3.mo161390i(r0)
            long r5 = r1.f310896j
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r7
            r7 = 0
            r3.mo161389h(r5, r7)
            r5 = 1
            com.tencent.mm.modelcontrol.VideoTransPara r6 = r1.f310895i     // Catch:{ Exception -> 0x01ad }
            int r0 = r6.f267170h     // Catch:{ Exception -> 0x01ad }
            if (r0 <= 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 10
        L_0x0028:
            int r0 = com.tencent.p014mm.plugin.mmsight.segment.MP4MuxerJNI.initDataBufLock(r0)     // Catch:{ Exception -> 0x01ad }
            r1.f310900n = r0     // Catch:{ Exception -> 0x01ad }
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()     // Catch:{ Exception -> 0x01ad }
            com.tencent.mm.modelvideoh265toh264.h$a r0 = r1.f310888b     // Catch:{ Exception -> 0x01ad }
            int r10 = r0.f310905b     // Catch:{ Exception -> 0x01ad }
            r2.f310923q = r3     // Catch:{ Exception -> 0x01ad }
            r2.f310924r = r10     // Catch:{ Exception -> 0x01ad }
            android.media.MediaFormat r0 = r0.f310904a     // Catch:{ Exception -> 0x01ad }
            boolean r10 = r1.f310902p     // Catch:{ Exception -> 0x01ad }
            int r0 = r2.mo148349b(r0, r10)     // Catch:{ Exception -> 0x01ad }
            if (r0 >= 0) goto L_0x0051
            int r0 = r1.f310900n     // Catch:{ Exception -> 0x0051 }
            com.tencent.p014mm.plugin.mmsight.segment.MP4MuxerJNI.releaseDataBuf(r0)     // Catch:{ Exception -> 0x0051 }
            r24.mo161388g()     // Catch:{ Exception -> 0x0051 }
            com.tencent.mm.modelvideoh265toh264.b r0 = com.tencent.p014mm.modelvideoh265toh264.C92861b.f267508d     // Catch:{ Exception -> 0x0051 }
            r0.mo126892c()     // Catch:{ Exception -> 0x0051 }
        L_0x0051:
            r23.mo148348a()     // Catch:{ Exception -> 0x01ad }
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r8)     // Catch:{ Exception -> 0x01ad }
            com.tencent.mm.modelvideoh265toh264.h$a r0 = r1.f310888b     // Catch:{ Exception -> 0x01ad }
            int r0 = r0.f310905b     // Catch:{ Exception -> 0x01ad }
            android.media.MediaExtractor r10 = r3.f329324a     // Catch:{ Exception -> 0x01ad }
            r10.unselectTrack(r0)     // Catch:{ Exception -> 0x01ad }
            com.tencent.mm.modelvideoh265toh264.h$a r0 = r1.f310889c     // Catch:{ Exception -> 0x01ad }
            r10 = 2
            if (r0 == 0) goto L_0x0086
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()     // Catch:{ Exception -> 0x01ad }
            r0 = r25
            r13 = r26
            r1.mo148345c(r3, r0, r13)     // Catch:{ Exception -> 0x01ad }
            java.lang.String r0 = "process audio used %sms, compressAudio: %s"
            java.lang.Object[] r13 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x01ad }
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r11)     // Catch:{ Exception -> 0x01ad }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ Exception -> 0x01ad }
            r13[r7] = r11     // Catch:{ Exception -> 0x01ad }
            java.lang.Boolean r11 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x01ad }
            r13[r5] = r11     // Catch:{ Exception -> 0x01ad }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r0, r13)     // Catch:{ Exception -> 0x01ad }
        L_0x0086:
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()     // Catch:{ Exception -> 0x01ad }
            java.lang.String r18 = r22.mo148343a()     // Catch:{ Exception -> 0x01ad }
            java.lang.String r0 = "process video used %sms"
            java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x01ad }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ Exception -> 0x01ad }
            r13[r7] = r8     // Catch:{ Exception -> 0x01ad }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r0, r13)     // Catch:{ Exception -> 0x01ad }
            java.lang.String r0 = "start muxing, tempPath: %s"
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x01ad }
            r8[r7] = r18     // Catch:{ Exception -> 0x01ad }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r0, r8)     // Catch:{ Exception -> 0x01ad }
            int r8 = r6.f267174o     // Catch:{ Exception -> 0x01ad }
            int r9 = r6.f267173n     // Catch:{ Exception -> 0x01ad }
            com.tencent.mm.modelvideoh265toh264.h$a r0 = r1.f310889c     // Catch:{ Exception -> 0x00ca }
            android.media.MediaFormat r0 = r0.f310904a     // Catch:{ Exception -> 0x00ca }
            java.lang.String r13 = "channel-count"
            int r13 = r0.getInteger(r13)     // Catch:{ Exception -> 0x00ca }
            com.tencent.mm.modelvideoh265toh264.h$a r0 = r1.f310889c     // Catch:{ Exception -> 0x00c8 }
            android.media.MediaFormat r0 = r0.f310904a     // Catch:{ Exception -> 0x00c8 }
            java.lang.String r14 = "sample-rate"
            int r8 = r0.getInteger(r14)     // Catch:{ Exception -> 0x00c8 }
            com.tencent.mm.modelvideoh265toh264.h$a r0 = r1.f310889c     // Catch:{ Exception -> 0x00c8 }
            android.media.MediaFormat r0 = r0.f310904a     // Catch:{ Exception -> 0x00c8 }
            java.lang.String r14 = "bitrate"
            int r9 = r0.getInteger(r14)     // Catch:{ Exception -> 0x00c8 }
            goto L_0x00d9
        L_0x00c8:
            r0 = move-exception
            goto L_0x00cc
        L_0x00ca:
            r0 = move-exception
            r13 = 1
        L_0x00cc:
            java.lang.String r14 = "get audio channel count error: %s"
            java.lang.Object[] r15 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x01ad }
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x01ad }
            r15[r7] = r0     // Catch:{ Exception -> 0x01ad }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r14, r15)     // Catch:{ Exception -> 0x01ad }
        L_0x00d9:
            r14 = r8
            r17 = r13
            java.lang.String r0 = "final muxing channel count: %s, aac sample rate: %s, aacBitRate: %s"
            r8 = 3
            java.lang.Object[] r13 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x01ad }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r17)     // Catch:{ Exception -> 0x01ad }
            r13[r7] = r15     // Catch:{ Exception -> 0x01ad }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x01ad }
            r13[r5] = r15     // Catch:{ Exception -> 0x01ad }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x01ad }
            r13[r10] = r9     // Catch:{ Exception -> 0x01ad }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r13)     // Catch:{ Exception -> 0x01ad }
            java.lang.String r0 = "start muxing, aacSampleRate: %s, channelCount: %s, fps: %s, tempPath: %s"
            r9 = 4
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x01ad }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x01ad }
            r9[r7] = r13     // Catch:{ Exception -> 0x01ad }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r17)     // Catch:{ Exception -> 0x01ad }
            r9[r5] = r13     // Catch:{ Exception -> 0x01ad }
            int r13 = r6.f267168f     // Catch:{ Exception -> 0x01ad }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x01ad }
            r9[r10] = r13     // Catch:{ Exception -> 0x01ad }
            r9[r8] = r18     // Catch:{ Exception -> 0x01ad }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r0, r9)     // Catch:{ Exception -> 0x01ad }
            boolean r0 = r2.f310917k     // Catch:{ Exception -> 0x01ad }
            if (r0 == 0) goto L_0x0138
            r0 = 1024(0x400, float:1.435E-42)
            r15 = 2
            int r2 = r6.f267168f     // Catch:{ Exception -> 0x01ad }
            float r2 = (float) r2     // Catch:{ Exception -> 0x01ad }
            long r8 = r1.f310897k     // Catch:{ Exception -> 0x01ad }
            long r5 = r1.f310896j     // Catch:{ Exception -> 0x01ad }
            long r8 = r8 - r5
            int r5 = (int) r8     // Catch:{ Exception -> 0x01ad }
            r20 = 0
            r21 = 0
            r13 = r14
            r14 = r0
            r16 = r17
            r17 = r18
            r18 = r2
            r19 = r5
            int r0 = com.tencent.p014mm.plugin.mmsight.segment.MP4MuxerJNI.muxingForX264Lock(r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x01ad }
            goto L_0x014b
        L_0x0138:
            int r13 = r1.f310900n     // Catch:{ Exception -> 0x01ad }
            r15 = 1024(0x400, float:1.435E-42)
            r16 = 2
            int r0 = r6.f267168f     // Catch:{ Exception -> 0x01ad }
            float r0 = (float) r0     // Catch:{ Exception -> 0x01ad }
            r20 = 0
            r21 = 0
            r19 = r0
            int r0 = com.tencent.p014mm.plugin.mmsight.segment.MP4MuxerJNI.muxingLock(r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x01ad }
        L_0x014b:
            java.lang.String r2 = "finish muxing "
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r2)     // Catch:{ Exception -> 0x01ad }
            if (r0 >= 0) goto L_0x0160
            java.lang.String r2 = "muxing failed! %d"
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x01ad }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x01ad }
            r6[r7] = r0     // Catch:{ Exception -> 0x01ad }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r2, r6)     // Catch:{ Exception -> 0x01ad }
        L_0x0160:
            int r0 = r1.f310899m     // Catch:{ Exception -> 0x01ad }
            if (r0 <= 0) goto L_0x0170
            java.lang.String r0 = r22.mo148343a()     // Catch:{ Exception -> 0x01ad }
            java.lang.String r2 = r1.f310893g     // Catch:{ Exception -> 0x01ad }
            int r5 = r1.f310899m     // Catch:{ Exception -> 0x01ad }
            com.tencent.p014mm.plugin.sight.base.SightVideoJNI.tagRotateVideoVFS(r0, r2, r5)     // Catch:{ Exception -> 0x01ad }
            goto L_0x0179
        L_0x0170:
            java.lang.String r0 = r22.mo148343a()     // Catch:{ Exception -> 0x01ad }
            java.lang.String r2 = r1.f310893g     // Catch:{ Exception -> 0x01ad }
            com.tencent.p014mm.vfs.C86013q1.m106463x(r0, r2)     // Catch:{ Exception -> 0x01ad }
        L_0x0179:
            java.lang.String r0 = "mux and tagRotate used %sms"
            r2 = 1
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x01ad }
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r11)     // Catch:{ Exception -> 0x01ad }
            java.lang.Long r2 = java.lang.Long.valueOf(r8)     // Catch:{ Exception -> 0x01ad }
            r5[r7] = r2     // Catch:{ Exception -> 0x01ad }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r0, r5)     // Catch:{ Exception -> 0x01ad }
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()     // Catch:{ Exception -> 0x01ad }
            java.lang.String r0 = "tagMP4Dscp used %sms"
            r2 = 1
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x01ad }
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r5)     // Catch:{ Exception -> 0x01ad }
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x01ad }
            r8[r7] = r2     // Catch:{ Exception -> 0x01ad }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r0, r8)     // Catch:{ Exception -> 0x01ad }
            int r0 = r1.f310900n     // Catch:{ Exception -> 0x01c4 }
        L_0x01a4:
            com.tencent.p014mm.plugin.mmsight.segment.MP4MuxerJNI.releaseDataBufLock(r0)     // Catch:{ Exception -> 0x01c4 }
            r24.mo161388g()     // Catch:{ Exception -> 0x01c4 }
            goto L_0x01bf
        L_0x01ab:
            r0 = move-exception
            goto L_0x01c5
        L_0x01ad:
            r0 = move-exception
            java.lang.String r2 = "The source video file is malformed %s"
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x01ab }
            java.lang.String r6 = r0.getMessage()     // Catch:{ all -> 0x01ab }
            r5[r7] = r6     // Catch:{ all -> 0x01ab }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r2, r5)     // Catch:{ all -> 0x01ab }
            int r0 = r1.f310900n     // Catch:{ Exception -> 0x01c4 }
            goto L_0x01a4
        L_0x01bf:
            com.tencent.mm.modelvideoh265toh264.b r0 = com.tencent.p014mm.modelvideoh265toh264.C92861b.f267508d     // Catch:{ Exception -> 0x01c4 }
            r0.mo126892c()     // Catch:{ Exception -> 0x01c4 }
        L_0x01c4:
            return
        L_0x01c5:
            int r2 = r1.f310900n     // Catch:{ Exception -> 0x01d2 }
            com.tencent.p014mm.plugin.mmsight.segment.MP4MuxerJNI.releaseDataBufLock(r2)     // Catch:{ Exception -> 0x01d2 }
            r24.mo161388g()     // Catch:{ Exception -> 0x01d2 }
            com.tencent.mm.modelvideoh265toh264.b r2 = com.tencent.p014mm.modelvideoh265toh264.C92861b.f267508d     // Catch:{ Exception -> 0x01d2 }
            r2.mo126892c()     // Catch:{ Exception -> 0x01d2 }
        L_0x01d2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelvideoh265toh264.C104692h.mo148347e(com.tencent.mm.modelvideoh265toh264.j, oj.b, int, int):void");
    }
}
