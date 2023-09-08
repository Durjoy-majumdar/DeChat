package br2;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.plugin.sns.p104ad.widget.living.AdLivingStreamContainer;
import com.tencent.p014mm.plugin.sns.p104ad.widget.living.C94762a;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import com.tencent.p014mm.storage.C96983o3;
import gy3.C8480h;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import p204mr.C11078h;
import p565ir.C60606n;
import te3.C101804kv2;
import te3.C51713vn0;
import vr2.C102236a0;
import vr2.C102260r;

/* renamed from: br2.e */
public final class C54550e {

    /* renamed from: e */
    public static final C54551a f152917e = new C54551a((C8480h) null);

    /* renamed from: f */
    public static final LruCache<String, Bitmap> f152918f = new LruCache<>(3);

    /* renamed from: a */
    public final AdLivingStreamContainer f152919a;

    /* renamed from: b */
    public SnsInfo f152920b;

    /* renamed from: c */
    public boolean f152921c;

    /* renamed from: d */
    public C54551a.C54552a f152922d;

    /* renamed from: br2.e$a */
    public static final class C54551a {

        /* renamed from: br2.e$a$a */
        public static final class C54552a implements C60606n.C60609c {

            /* renamed from: a */
            public final WeakReference<C54550e> f152923a;

            /* renamed from: b */
            public final String f152924b;

            /* renamed from: c */
            public final Long f152925c;

            public C54552a(WeakReference<C54550e> weakReference, String str, Long l) {
                C87412m.m108594g(weakReference, "helperRef");
                C87412m.m108594g(str, "snsId");
                this.f152923a = weakReference;
                this.f152924b = str;
                this.f152925c = l;
            }

            public void onLiveStatusCallback(long j, int i, Object obj) {
                int i2;
                long j2 = j;
                int i3 = i;
                Object obj2 = obj;
                SnsMethodCalculate.markStartTimeMs("onLiveStatusCallback", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper$Companion$FinderLiveStatusCallback");
                try {
                    C54550e eVar = this.f152923a.get();
                    if (eVar == null) {
                        SnsMethodCalculate.markEndTimeMs("onLiveStatusCallback", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper$Companion$FinderLiveStatusCallback");
                        return;
                    }
                    SnsMethodCalculate.markStartTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
                    SnsMethodCalculate.markEndTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
                    StringBuilder sb = new StringBuilder();
                    sb.append("doRequestFinderObject, onLiveStatusCallback, snsId is ");
                    sb.append(this.f152924b);
                    sb.append(", liveId is ");
                    sb.append(this.f152925c);
                    sb.append(", respLiveId is ");
                    sb.append(j2);
                    sb.append(", status is ");
                    sb.append(i3);
                    sb.append(", mShouldVideoPlay is ");
                    SnsMethodCalculate.markStartTimeMs("getMShouldVideoPlay", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
                    boolean z = eVar.f152921c;
                    SnsMethodCalculate.markEndTimeMs("getMShouldVideoPlay", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
                    sb.append(z);
                    sb.append(", mPlayerStatus is ");
                    AdLivingStreamContainer e = eVar.mo75430e();
                    sb.append(e != null ? Integer.valueOf(e.getMPlayerStatus()) : null);
                    Log.m105924i("MicroMsg.AdLivingStreamHelper", sb.toString());
                    Long l = this.f152925c;
                    boolean z2 = true;
                    if (l != null) {
                        if (j2 == l.longValue()) {
                            if (i3 != 2) {
                                AdLivingStreamContainer e2 = eVar.mo75430e();
                                if (e2 != null) {
                                    e2.setMIsPlayCompleted(false);
                                }
                                i2 = 770;
                            } else {
                                AdLivingStreamContainer e3 = eVar.mo75430e();
                                if (e3 != null) {
                                    e3.setMIsPlayCompleted(true);
                                }
                                i2 = 771;
                            }
                            C94762a.m120038g(this.f152924b, i2);
                        }
                    }
                    Long l2 = this.f152925c;
                    if (l2 != null) {
                        if (j2 == l2.longValue() && (obj2 instanceof C51713vn0)) {
                            if (((C51713vn0) obj2).f143572d == null) {
                                SnsMethodCalculate.markStartTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
                                SnsMethodCalculate.markEndTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
                                Log.m105920e("MicroMsg.AdLivingStreamHelper", "liveInfoResp liveInfo is null");
                                SnsMethodCalculate.markEndTimeMs("onLiveStatusCallback", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper$Companion$FinderLiveStatusCallback");
                                return;
                            }
                            AdLivingStreamContainer e4 = eVar.mo75430e();
                            if (e4 != null) {
                                e4.setMGetLiveInfoResp((C51713vn0) obj2);
                            }
                            FinderObject finderObject = new FinderObject();
                            finderObject.liveInfo = ((C51713vn0) obj2).f143572d;
                            AdLivingStreamContainer e5 = eVar.mo75430e();
                            if (e5 != null) {
                                e5.setMFinderObject(finderObject);
                            }
                            SnsMethodCalculate.markStartTimeMs("getMShouldVideoPlay", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
                            boolean z3 = eVar.f152921c;
                            SnsMethodCalculate.markEndTimeMs("getMShouldVideoPlay", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
                            if (z3) {
                                AdLivingStreamContainer e6 = eVar.mo75430e();
                                if (e6 == null || e6.getMPlayerStatus() != 0) {
                                    z2 = false;
                                }
                                if (z2) {
                                    eVar.mo75430e().mo80898j();
                                }
                            }
                        }
                    }
                    SnsMethodCalculate.markEndTimeMs("onLiveStatusCallback", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper$Companion$FinderLiveStatusCallback");
                } catch (Throwable unused) {
                }
            }
        }

        public C54551a(C8480h hVar) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0099, code lost:
            r10 = (r10 = r10.mo76116a()).mo76117a();
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo75435a(com.tencent.p014mm.plugin.sns.storage.SnsInfo r10) {
            /*
                r9 = this;
                java.lang.String r0 = "checkShowAdLivingStream"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper$Companion"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                r2 = 0
                if (r10 != 0) goto L_0x000e
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                return r2
            L_0x000e:
                com.tencent.mm.plugin.sns.storage.ADXml r3 = r10.getAdXml()
                co2.j r3 = r3.adFinderLiveStreamInfo
                if (r3 != 0) goto L_0x001a
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                return r2
            L_0x001a:
                com.tencent.mm.plugin.sns.storage.ADXml r3 = r10.getAdXml()
                co2.j r3 = r3.adFinderLiveStreamInfo
                if (r3 == 0) goto L_0x00b8
                co2.j$a r3 = r3.mo76116a()
                if (r3 != 0) goto L_0x002a
                goto L_0x00b8
            L_0x002a:
                r3 = 3
                java.lang.String[] r3 = new java.lang.String[r3]
                com.tencent.mm.plugin.sns.storage.ADXml r4 = r10.getAdXml()
                co2.j r4 = r4.adFinderLiveStreamInfo
                r5 = 0
                java.lang.String r6 = "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$FinderLiveInfo"
                if (r4 == 0) goto L_0x0049
                co2.j$a r4 = r4.mo76116a()
                if (r4 == 0) goto L_0x0049
                java.lang.String r7 = "getFinderLiveExportId"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r6)
                java.lang.String r4 = r4.f154585a
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r6)
                goto L_0x004a
            L_0x0049:
                r4 = r5
            L_0x004a:
                r3[r2] = r4
                com.tencent.mm.plugin.sns.storage.ADXml r4 = r10.getAdXml()
                co2.j r4 = r4.adFinderLiveStreamInfo
                if (r4 == 0) goto L_0x0065
                co2.j$a r4 = r4.mo76116a()
                if (r4 == 0) goto L_0x0065
                java.lang.String r7 = "getFinderLiveFeedNonceId"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r6)
                java.lang.String r4 = r4.f154587c
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r6)
                goto L_0x0066
            L_0x0065:
                r4 = r5
            L_0x0066:
                r7 = 1
                r3[r7] = r4
                r4 = 2
                com.tencent.mm.plugin.sns.storage.ADXml r8 = r10.getAdXml()
                co2.j r8 = r8.adFinderLiveStreamInfo
                if (r8 == 0) goto L_0x0083
                co2.j$a r8 = r8.mo76116a()
                if (r8 == 0) goto L_0x0083
                java.lang.String r5 = "getFinderUsername"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
                java.lang.String r8 = r8.f154588d
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
                r5 = r8
            L_0x0083:
                r3[r4] = r5
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String[]) r3)
                if (r3 != 0) goto L_0x00b4
                com.tencent.mm.plugin.sns.storage.ADXml r10 = r10.getAdXml()
                co2.j r10 = r10.adFinderLiveStreamInfo
                if (r10 == 0) goto L_0x00ac
                co2.j$a r10 = r10.mo76116a()
                if (r10 == 0) goto L_0x00ac
                java.lang.Long r10 = r10.mo76117a()
                r3 = 0
                if (r10 != 0) goto L_0x00a2
                goto L_0x00ac
            L_0x00a2:
                long r5 = r10.longValue()
                int r10 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r10 != 0) goto L_0x00ac
                r10 = 1
                goto L_0x00ad
            L_0x00ac:
                r10 = 0
            L_0x00ad:
                if (r10 == 0) goto L_0x00b0
                goto L_0x00b4
            L_0x00b0:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                return r7
            L_0x00b4:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                return r2
            L_0x00b8:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: br2.C54550e.C54551a.mo75435a(com.tencent.mm.plugin.sns.storage.SnsInfo):boolean");
        }
    }

    public C54550e(AdLivingStreamContainer adLivingStreamContainer) {
        this.f152919a = adLivingStreamContainer;
    }

    /* renamed from: a */
    public static final boolean m61296a(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("checkShowAdLivingStream", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
        boolean a = f152917e.mo75435a(snsInfo);
        SnsMethodCalculate.markEndTimeMs("checkShowAdLivingStream", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        r7 = r7.f143588w;
     */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c9 A[Catch:{ all -> 0x01bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cc A[Catch:{ all -> 0x01bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d1 A[Catch:{ all -> 0x01bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00d4 A[Catch:{ all -> 0x01bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0123 A[Catch:{ all -> 0x01bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0125 A[Catch:{ all -> 0x01bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0128 A[Catch:{ all -> 0x01bc }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo75427b() {
        /*
            r31 = this;
            java.lang.String r1 = "doExitAdLiveRoom"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            r3 = r31
            com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer r4 = r3.f152919a
            if (r4 == 0) goto L_0x01d6
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r5)
            java.lang.String r0 = r4.f164266d     // Catch:{ all -> 0x01bc }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01bc }
            r6.<init>()     // Catch:{ all -> 0x01bc }
            java.lang.String r7 = "doExitAdLiveRoom, enable is "
            r6.append(r7)     // Catch:{ all -> 0x01bc }
            te3.vn0 r7 = r4.f164277r     // Catch:{ all -> 0x01bc }
            if (r7 == 0) goto L_0x002d
            te3.op2 r7 = r7.f143588w     // Catch:{ all -> 0x01bc }
            if (r7 == 0) goto L_0x002d
            boolean r7 = r7.f139308d     // Catch:{ all -> 0x01bc }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x01bc }
            goto L_0x002e
        L_0x002d:
            r7 = 0
        L_0x002e:
            r6.append(r7)     // Catch:{ all -> 0x01bc }
            java.lang.String r7 = ", mIsEnterAdRoom is "
            r6.append(r7)     // Catch:{ all -> 0x01bc }
            boolean r7 = r4.f164283x     // Catch:{ all -> 0x01bc }
            r6.append(r7)     // Catch:{ all -> 0x01bc }
            java.lang.String r7 = ", mNeedExitAdRoomReq is "
            r6.append(r7)     // Catch:{ all -> 0x01bc }
            boolean r7 = r4.f164279t     // Catch:{ all -> 0x01bc }
            r6.append(r7)     // Catch:{ all -> 0x01bc }
            java.lang.String r7 = ", mIsPlayerPaused is "
            r6.append(r7)     // Catch:{ all -> 0x01bc }
            boolean r7 = r4.f164247D     // Catch:{ all -> 0x01bc }
            r6.append(r7)     // Catch:{ all -> 0x01bc }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x01bc }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)     // Catch:{ all -> 0x01bc }
            boolean r0 = r4.f164247D     // Catch:{ all -> 0x01bc }
            if (r0 != 0) goto L_0x005d
            r4.mo80864b()     // Catch:{ all -> 0x01bc }
        L_0x005d:
            long r6 = r4.f164281v     // Catch:{ all -> 0x01bc }
            r4.f164244A = r6     // Catch:{ all -> 0x01bc }
            te3.vn0 r0 = r4.f164277r     // Catch:{ all -> 0x01bc }
            r6 = 0
            r7 = 1
            if (r0 == 0) goto L_0x0071
            te3.op2 r9 = r0.f143588w     // Catch:{ all -> 0x01bc }
            if (r9 == 0) goto L_0x0071
            boolean r9 = r9.f139308d     // Catch:{ all -> 0x01bc }
            if (r9 != r7) goto L_0x0071
            r9 = 1
            goto L_0x0072
        L_0x0071:
            r9 = 0
        L_0x0072:
            if (r9 == 0) goto L_0x01b5
            boolean r9 = r4.f164279t     // Catch:{ all -> 0x01bc }
            if (r9 == 0) goto L_0x01b5
            boolean r9 = r4.f164283x     // Catch:{ all -> 0x01bc }
            if (r9 == 0) goto L_0x01b5
            r4.f164283x = r6     // Catch:{ all -> 0x01bc }
            if (r0 == 0) goto L_0x0087
            long r9 = r0.f143589x     // Catch:{ all -> 0x01bc }
            java.lang.Long r0 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x01bc }
            goto L_0x0088
        L_0x0087:
            r0 = 0
        L_0x0088:
            com.tencent.mm.plugin.sns.storage.SnsInfo r9 = r4.f164276q     // Catch:{ all -> 0x01bc }
            if (r9 == 0) goto L_0x00a1
            com.tencent.mm.plugin.sns.storage.ADXml r9 = r9.getAdXml()     // Catch:{ all -> 0x01bc }
            if (r9 == 0) goto L_0x00a1
            co2.j r9 = r9.adFinderLiveStreamInfo     // Catch:{ all -> 0x01bc }
            if (r9 == 0) goto L_0x00a1
            co2.j$a r9 = r9.mo76116a()     // Catch:{ all -> 0x01bc }
            if (r9 == 0) goto L_0x00a1
            java.lang.Long r9 = r9.mo76117a()     // Catch:{ all -> 0x01bc }
            goto L_0x00a2
        L_0x00a1:
            r9 = 0
        L_0x00a2:
            com.tencent.mm.plugin.sns.storage.SnsInfo r10 = r4.f164276q     // Catch:{ all -> 0x01bc }
            java.lang.String r11 = "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$FinderLiveInfo"
            if (r10 == 0) goto L_0x00c4
            com.tencent.mm.plugin.sns.storage.ADXml r10 = r10.getAdXml()     // Catch:{ all -> 0x01bc }
            if (r10 == 0) goto L_0x00c4
            co2.j r10 = r10.adFinderLiveStreamInfo     // Catch:{ all -> 0x01bc }
            if (r10 == 0) goto L_0x00c4
            co2.j$a r10 = r10.mo76116a()     // Catch:{ all -> 0x01bc }
            if (r10 == 0) goto L_0x00c4
            java.lang.String r12 = "getFinderLiveFeedNonceId"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r11)     // Catch:{ all -> 0x01bc }
            java.lang.String r10 = r10.f154587c     // Catch:{ all -> 0x01bc }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r11)     // Catch:{ all -> 0x01bc }
            r14 = r10
            goto L_0x00c5
        L_0x00c4:
            r14 = 0
        L_0x00c5:
            te3.vn0 r10 = r4.f164277r     // Catch:{ all -> 0x01bc }
            if (r10 == 0) goto L_0x00cc
            java.lang.String r10 = r10.f143591z     // Catch:{ all -> 0x01bc }
            goto L_0x00cd
        L_0x00cc:
            r10 = 0
        L_0x00cd:
            te3.xq0 r12 = r4.f164278s     // Catch:{ all -> 0x01bc }
            if (r12 == 0) goto L_0x00d4
            pe3.b r12 = r12.f144842d     // Catch:{ all -> 0x01bc }
            goto L_0x00d5
        L_0x00d4:
            r12 = 0
        L_0x00d5:
            long r15 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01bc }
            r13 = 1000(0x3e8, float:1.401E-42)
            long r6 = (long) r13     // Catch:{ all -> 0x01bc }
            long r6 = r15 / r6
            r4.f164246C = r6     // Catch:{ all -> 0x01bc }
            java.lang.String r6 = r4.f164266d     // Catch:{ all -> 0x01bc }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x01bc }
            r7.<init>()     // Catch:{ all -> 0x01bc }
            java.lang.String r13 = "doExitAdLiveRoom, liveId is "
            r7.append(r13)     // Catch:{ all -> 0x01bc }
            r7.append(r9)     // Catch:{ all -> 0x01bc }
            java.lang.String r13 = ", objectId is "
            r7.append(r13)     // Catch:{ all -> 0x01bc }
            r7.append(r0)     // Catch:{ all -> 0x01bc }
            java.lang.String r13 = ", nonceId is "
            r7.append(r13)     // Catch:{ all -> 0x01bc }
            r7.append(r14)     // Catch:{ all -> 0x01bc }
            java.lang.String r13 = ", sessionBuffer is "
            r7.append(r13)     // Catch:{ all -> 0x01bc }
            r7.append(r10)     // Catch:{ all -> 0x01bc }
            java.lang.String r10 = ", mJoinLiveEndTimestamp is "
            r7.append(r10)     // Catch:{ all -> 0x01bc }
            r13 = r9
            long r8 = r4.f164246C     // Catch:{ all -> 0x01bc }
            r7.append(r8)     // Catch:{ all -> 0x01bc }
            java.lang.String r8 = ", liveCookies is "
            r7.append(r8)     // Catch:{ all -> 0x01bc }
            r7.append(r12)     // Catch:{ all -> 0x01bc }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x01bc }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)     // Catch:{ all -> 0x01bc }
            if (r13 != 0) goto L_0x0125
            r6 = 1
            goto L_0x0126
        L_0x0125:
            r6 = 0
        L_0x0126:
            if (r6 != 0) goto L_0x01b5
            if (r0 != 0) goto L_0x012c
            r6 = 1
            goto L_0x012d
        L_0x012c:
            r6 = 0
        L_0x012d:
            if (r6 != 0) goto L_0x01b5
            if (r14 != 0) goto L_0x0133
            r6 = 1
            goto L_0x0134
        L_0x0133:
            r6 = 0
        L_0x0134:
            if (r6 != 0) goto L_0x01b5
            java.lang.String r6 = r4.f164266d     // Catch:{ all -> 0x01bc }
            java.lang.String r7 = "do getLiveMsg"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)     // Catch:{ all -> 0x01bc }
            br2.c r6 = new br2.c     // Catch:{ all -> 0x01bc }
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x01bc }
            r7.<init>(r4)     // Catch:{ all -> 0x01bc }
            r6.<init>(r7)     // Catch:{ all -> 0x01bc }
            r4.f164252I = r6     // Catch:{ all -> 0x01bc }
            java.lang.Class<ls3.h> r6 = ls3.C61398h.class
            di3.d r6 = di3.C86312j.m106911c(r6)     // Catch:{ all -> 0x01bc }
            ls3.h r6 = (ls3.C61398h) r6     // Catch:{ all -> 0x01bc }
            com.tencent.mm.plugin.sns.storage.SnsInfo r7 = r4.f164276q     // Catch:{ all -> 0x01bc }
            if (r7 == 0) goto L_0x0171
            com.tencent.mm.plugin.sns.storage.ADXml r7 = r7.getAdXml()     // Catch:{ all -> 0x01bc }
            if (r7 == 0) goto L_0x0171
            co2.j r7 = r7.adFinderLiveStreamInfo     // Catch:{ all -> 0x01bc }
            if (r7 == 0) goto L_0x0171
            co2.j$a r7 = r7.mo76116a()     // Catch:{ all -> 0x01bc }
            if (r7 == 0) goto L_0x0171
            java.lang.String r8 = "getFinderUsername"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r11)     // Catch:{ all -> 0x01bc }
            java.lang.String r7 = r7.f154588d     // Catch:{ all -> 0x01bc }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r11)     // Catch:{ all -> 0x01bc }
            r8 = r7
            goto L_0x0172
        L_0x0171:
            r8 = 0
        L_0x0172:
            if (r12 == 0) goto L_0x017a
            byte[] r7 = r12.mo123703f()     // Catch:{ all -> 0x01bc }
            r9 = r7
            goto L_0x017b
        L_0x017a:
            r9 = 0
        L_0x017b:
            br2.c r12 = r4.f164252I     // Catch:{ all -> 0x01bc }
            gy3.C87412m.m108591d(r12)     // Catch:{ all -> 0x01bc }
            java.lang.String r7 = "getService(ILiveCgiFactoryService::class.java)"
            gy3.C87412m.m108593f(r6, r7)     // Catch:{ all -> 0x01bc }
            r7 = 0
            long r10 = r13.longValue()     // Catch:{ all -> 0x01bc }
            long r29 = r0.longValue()     // Catch:{ all -> 0x01bc }
            r15 = 11
            r16 = 1
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 204544(0x31f00, float:2.86627E-40)
            r28 = 0
            r0 = r12
            r12 = r29
            r22 = r0
            ob0.b r0 = ls3.C61398h.C61399a.m72075a(r6, r7, r8, r9, r10, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ all -> 0x01bc }
            r0.mo9225i()     // Catch:{ all -> 0x01bc }
        L_0x01b5:
            r4.mo80865c()     // Catch:{ all -> 0x01bc }
            r4.mo80896h()     // Catch:{ all -> 0x01bc }
            goto L_0x01d3
        L_0x01bc:
            r0 = move-exception
            java.lang.String r4 = r4.f164266d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "doExitAdLiveRoom, exp is"
            r6.append(r7)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
        L_0x01d3:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r5)
        L_0x01d6:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: br2.C54550e.mo75427b():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0032, code lost:
        r9 = r9.getAdInfo(r4.f164286z);
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo75428c(int r20, int r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.String r2 = "doRequestFinderObject"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer r4 = r0.f152919a
            if (r4 != 0) goto L_0x0010
            goto L_0x0013
        L_0x0010:
            r4.setMSource(r1)
        L_0x0013:
            com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer r4 = r0.f152919a
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x0065
            java.lang.String r7 = "setReportParams"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            com.tencent.mm.plugin.sns.storage.SnsInfo r9 = r4.f164276q
            java.lang.String r9 = vr2.C102236a0.m134728W(r9)
            java.lang.String r10 = "getSnsStringId(mSnsInfo)"
            gy3.C87412m.m108593f(r9, r10)
            r4.f164261S = r9
            com.tencent.mm.plugin.sns.storage.SnsInfo r9 = r4.f164276q
            if (r9 == 0) goto L_0x003d
            int r10 = r4.f164286z
            com.tencent.mm.plugin.sns.storage.ADInfo r9 = r9.getAdInfo(r10)
            if (r9 == 0) goto L_0x003d
            java.lang.String r9 = r9.uxInfo
            goto L_0x003e
        L_0x003d:
            r9 = r5
        L_0x003e:
            java.lang.String r10 = ""
            if (r9 != 0) goto L_0x0043
            r9 = r10
        L_0x0043:
            r4.f164262T = r9
            com.tencent.mm.plugin.sns.storage.SnsInfo r9 = r4.f164276q
            if (r9 == 0) goto L_0x0052
            com.tencent.mm.plugin.sns.storage.ADXml r9 = r9.getAdXml()
            if (r9 == 0) goto L_0x0052
            java.lang.String r9 = r9.adExtInfo
            goto L_0x0053
        L_0x0052:
            r9 = r5
        L_0x0053:
            if (r9 != 0) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r10 = r9
        L_0x0057:
            r4.f164263U = r10
            int r9 = r4.f164286z
            if (r9 != 0) goto L_0x005f
            r9 = 1
            goto L_0x0060
        L_0x005f:
            r9 = 2
        L_0x0060:
            r4.f164264V = r9
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
        L_0x0065:
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r0.f152920b
            java.lang.String r4 = vr2.C102236a0.m134728W(r4)
            com.tencent.mm.plugin.sns.storage.SnsInfo r7 = r0.f152920b
            if (r7 == 0) goto L_0x008c
            com.tencent.mm.plugin.sns.storage.ADXml r7 = r7.getAdXml()
            if (r7 == 0) goto L_0x008c
            co2.j r7 = r7.adFinderLiveStreamInfo
            if (r7 == 0) goto L_0x008c
            co2.j$a r7 = r7.mo76116a()
            if (r7 == 0) goto L_0x008c
            java.lang.String r8 = "getFinderLiveExportId"
            java.lang.String r9 = "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo$FinderLiveInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r9)
            java.lang.String r7 = r7.f154585a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
            goto L_0x008d
        L_0x008c:
            r7 = r5
        L_0x008d:
            com.tencent.mm.plugin.sns.storage.SnsInfo r8 = r0.f152920b
            if (r8 == 0) goto L_0x00a6
            com.tencent.mm.plugin.sns.storage.ADXml r8 = r8.getAdXml()
            if (r8 == 0) goto L_0x00a6
            co2.j r8 = r8.adFinderLiveStreamInfo
            if (r8 == 0) goto L_0x00a6
            co2.j$a r8 = r8.mo76116a()
            if (r8 == 0) goto L_0x00a6
            java.lang.Long r8 = r8.mo76117a()
            goto L_0x00a7
        L_0x00a6:
            r8 = r5
        L_0x00a7:
            r9 = 0
            if (r7 == 0) goto L_0x00b3
            int r10 = r7.length()
            if (r10 != 0) goto L_0x00b1
            goto L_0x00b3
        L_0x00b1:
            r10 = 0
            goto L_0x00b4
        L_0x00b3:
            r10 = 1
        L_0x00b4:
            java.lang.String r11 = "MicroMsg.AdLivingStreamHelper"
            if (r10 != 0) goto L_0x0194
            if (r8 != 0) goto L_0x00bb
            goto L_0x00bc
        L_0x00bb:
            r6 = 0
        L_0x00bc:
            if (r6 == 0) goto L_0x00c0
            goto L_0x0194
        L_0x00c0:
            r9 = 0
            if (r8 != 0) goto L_0x00c5
            goto L_0x00d6
        L_0x00c5:
            long r12 = r8.longValue()
            int r6 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r6 != 0) goto L_0x00d6
            java.lang.String r1 = "doRequestFinderObject, liveId is 0L"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x00d6:
            com.tencent.mm.plugin.sns.storage.SnsInfo r6 = r0.f152920b
            if (r6 == 0) goto L_0x00e2
            com.tencent.mm.plugin.sns.storage.ADInfo r6 = r6.getAdInfo(r1)
            if (r6 == 0) goto L_0x00e2
            java.lang.String r5 = r6.uxInfo
        L_0x00e2:
            com.tencent.mm.plugin.sns.storage.SnsInfo r6 = r0.f152920b
            java.lang.String r6 = vr2.C102236a0.m134728W(r6)
            r12 = r21
            java.lang.String r5 = lo2.C99542h0.m129912j(r5, r6, r12)
            te3.mo2 r6 = new te3.mo2
            r6.<init>()
            r6.f138134d = r5
            com.tencent.mm.plugin.sns.storage.SnsInfo r12 = r0.f152920b
            if (r12 == 0) goto L_0x0115
            com.tencent.mm.plugin.sns.storage.ADXml r12 = r12.getAdXml()
            if (r12 == 0) goto L_0x0115
            co2.j r12 = r12.adFinderLiveStreamInfo
            if (r12 == 0) goto L_0x0115
            java.lang.String r13 = "getPreviewJoinliveAdControlFlag"
            java.lang.String r14 = "com.tencent.mm.plugin.sns.ad.adxml.AdFinderLiveStreamInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r14)
            java.lang.Long r12 = r12.f154584b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r14)
            if (r12 == 0) goto L_0x0115
            long r9 = r12.longValue()
        L_0x0115:
            r6.f138135e = r9
            com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer r9 = r0.f152919a
            if (r9 != 0) goto L_0x011c
            goto L_0x0124
        L_0x011c:
            java.lang.String r10 = "adInfoExtra"
            gy3.C87412m.m108593f(r5, r10)
            r9.setMAdData(r5)
        L_0x0124:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = "doRequestFinderObject, snsId is "
            r5.append(r9)
            r5.append(r4)
            java.lang.String r9 = ", liveId is "
            r5.append(r9)
            r5.append(r8)
            java.lang.String r9 = ", exportId is "
            r5.append(r9)
            r5.append(r7)
            java.lang.String r9 = ", adInfoExtra is "
            r5.append(r9)
            java.lang.String r9 = r6.f138134d
            r5.append(r9)
            java.lang.String r9 = ", preview_joinlive_ad_control_flag is "
            r5.append(r9)
            long r9 = r6.f138135e
            r5.append(r9)
            java.lang.String r9 = ", source is "
            r5.append(r9)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
            br2.e$a$a r1 = new br2.e$a$a
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r5.<init>(r0)
            java.lang.String r9 = "snsId"
            gy3.C87412m.m108593f(r4, r9)
            r1.<init>(r5, r4, r8)
            r0.f152922d = r1
            java.lang.Class<ir.n> r1 = p565ir.C60606n.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            r10 = r1
            ir.n r10 = (p565ir.C60606n) r10
            long r11 = r8.longValue()
            r13 = 0
            r14 = 0
            br2.e$a$a r15 = r0.f152922d
            r16 = 11
            r17 = r7
            r18 = r6
            r10.Kc0(r11, r13, r14, r15, r16, r17, r18)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x0194:
            java.lang.String r1 = "doRequestFinderObject, but exportId or liveId is null or empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: br2.C54550e.mo75428c(int, int):void");
    }

    /* renamed from: d */
    public final void mo75429d(SnsInfo snsInfo, int i, C101804kv2 kv22, Integer num, Integer num2) {
        SnsMethodCalculate.markStartTimeMs("fillAdLivingStreamViewInfo", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
        if (snsInfo == null || kv22 == null) {
            Log.m105920e("MicroMsg.AdLivingStreamHelper", "fillAdLivingStreamViewInfo, but snsInfo or media is null");
            SnsMethodCalculate.markEndTimeMs("fillAdLivingStreamViewInfo", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
            return;
        }
        try {
            if (this.f152919a == null) {
                Log.m105920e("MicroMsg.AdLivingStreamHelper", "fillAdLivingStreamViewInfo, but adLivingViewContainer is null");
                SnsMethodCalculate.markEndTimeMs("fillAdLivingStreamViewInfo", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
                return;
            }
            if (!C102260r.m134840I(this.f152920b, snsInfo)) {
                mo75433h();
            }
            boolean z = true;
            if (!C102260r.m134840I(this.f152919a.getMSnsInfo(), snsInfo)) {
                this.f152921c = false;
                AdLivingStreamContainer adLivingStreamContainer = this.f152919a;
                adLivingStreamContainer.getClass();
                SnsMethodCalculate.markStartTimeMs("resetParams", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
                adLivingStreamContainer.f164280u = 0;
                adLivingStreamContainer.f164281v = 0;
                adLivingStreamContainer.f164246C = 0;
                adLivingStreamContainer.f164245B = 0;
                adLivingStreamContainer.f164248E = false;
                adLivingStreamContainer.f164247D = true;
                adLivingStreamContainer.f164283x = false;
                adLivingStreamContainer.f164278s = null;
                adLivingStreamContainer.setEventListenerEnabled(true);
                SnsMethodCalculate.markEndTimeMs("resetParams", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
            }
            this.f152919a.setVisibility(0);
            int c = C94762a.m120036c(C102236a0.m134728W(snsInfo), 2);
            AdLivingStreamContainer adLivingStreamContainer2 = this.f152919a;
            if (c != 771) {
                z = false;
            }
            adLivingStreamContainer2.setMIsPlayCompleted(z);
            if (this.f152919a.getMSnsInfo() == null || this.f152920b == null) {
                this.f152920b = snsInfo;
                this.f152919a.setMSnsInfo(snsInfo);
                this.f152921c = false;
                mo75428c(i, 3);
                ImageView mStatusIcon = this.f152919a.getMStatusIcon();
                if (mStatusIcon != null) {
                    mStatusIcon.setVisibility(0);
                }
                this.f152919a.mo80897i(kv22, num, num2);
            }
            ImageView mThumbView = this.f152919a.getMThumbView();
            if (mThumbView != null) {
                Context context = this.f152919a.getContext();
                C94901o Fx0 = C94866e1.Fx0();
                int hashCode = context.hashCode();
                C96983o3 c2 = C96983o3.m124651c();
                c2.f284145b = snsInfo.getTimeLine().CreateTime;
                Fx0.mo131114e0(kv22, mThumbView, -1, hashCode, c2);
            }
            SnsMethodCalculate.markEndTimeMs("fillAdLivingStreamViewInfo", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.AdLivingStreamHelper", "fillAdLivingStreamViewInfo, exp is " + th);
        }
    }

    /* renamed from: e */
    public final AdLivingStreamContainer mo75430e() {
        SnsMethodCalculate.markStartTimeMs("getAdLivingViewContainer", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
        AdLivingStreamContainer adLivingStreamContainer = this.f152919a;
        SnsMethodCalculate.markEndTimeMs("getAdLivingViewContainer", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
        return adLivingStreamContainer;
    }

    /* renamed from: f */
    public final void mo75431f() {
        SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
        try {
            f152918f.evictAll();
            AdLivingStreamContainer adLivingStreamContainer = this.f152919a;
            if (adLivingStreamContainer != null) {
                adLivingStreamContainer.mo80869g();
            }
            mo75433h();
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.AdLivingStreamHelper", "onUIDestroy, exp is " + th);
        }
        SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
    }

    /* renamed from: g */
    public final void mo75432g() {
        SnsMethodCalculate.markStartTimeMs("pausePlayerStream", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
        this.f152921c = false;
        AdLivingStreamContainer adLivingStreamContainer = this.f152919a;
        if (adLivingStreamContainer != null) {
            adLivingStreamContainer.mo80868f();
        }
        SnsMethodCalculate.markEndTimeMs("pausePlayerStream", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
    }

    /* renamed from: h */
    public final void mo75433h() {
        SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
        this.f152921c = false;
        this.f152920b = null;
        AdLivingStreamContainer adLivingStreamContainer = this.f152919a;
        if (adLivingStreamContainer != null) {
            adLivingStreamContainer.mo80896h();
        }
        SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
    }

    /* renamed from: i */
    public final void mo75434i() {
        SnsMethodCalculate.markStartTimeMs("startAdStreamPlayer", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
        this.f152921c = true;
        AdLivingStreamContainer adLivingStreamContainer = this.f152919a;
        Integer valueOf = adLivingStreamContainer != null ? Integer.valueOf(adLivingStreamContainer.getMPlayerStatus()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            AdLivingStreamContainer adLivingStreamContainer2 = this.f152919a;
            if (adLivingStreamContainer2 != null) {
                adLivingStreamContainer2.mo80898j();
            }
        } else {
            AdLivingStreamContainer adLivingStreamContainer3 = this.f152919a;
            if (adLivingStreamContainer3 != null) {
                SnsMethodCalculate.markStartTimeMs("resumePlayerStream", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
                try {
                    String str = adLivingStreamContainer3.f164266d;
                    Log.m105924i(str, "resumePlayerStream, mIsPlayCompleted is " + adLivingStreamContainer3.f164284x0 + ", mIsPlayerPaused is " + adLivingStreamContainer3.f164247D);
                    if (adLivingStreamContainer3.f164284x0) {
                        SnsMethodCalculate.markEndTimeMs("resumePlayerStream", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
                    } else {
                        if (adLivingStreamContainer3.f164247D) {
                            adLivingStreamContainer3.mo80866d();
                        }
                        adLivingStreamContainer3.f164247D = false;
                        adLivingStreamContainer3.f164256M = 1;
                        ImageView imageView = adLivingStreamContainer3.f164271i;
                        if (imageView != null) {
                            imageView.setVisibility(8);
                        }
                        C11078h hVar = adLivingStreamContainer3.f164274o;
                        if (hVar != null) {
                            hVar.mo11221g();
                        }
                        SnsMethodCalculate.markEndTimeMs("resumePlayerStream", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
                    }
                } catch (Throwable th) {
                    String str2 = adLivingStreamContainer3.f164266d;
                    Log.m105920e(str2, "resumePlayerStream, exp is" + th);
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("startAdStreamPlayer", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
    }
}
