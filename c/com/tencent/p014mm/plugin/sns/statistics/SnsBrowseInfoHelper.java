package com.tencent.p014mm.plugin.sns.statistics;

import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.SnsTimelineRespListNotifyEvent;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashSet;
import java.util.Iterator;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper */
public class SnsBrowseInfoHelper {

    /* renamed from: A */
    public int f275383A = 0;

    /* renamed from: A0 */
    public long f275384A0 = 0;

    /* renamed from: B */
    public int f275385B = 0;

    /* renamed from: B0 */
    public long f275386B0 = 0;

    /* renamed from: C */
    public int f275387C = 0;

    /* renamed from: C0 */
    public long f275388C0 = 0;

    /* renamed from: D */
    public int f275389D = 0;

    /* renamed from: D0 */
    public HashSet<String> f275390D0 = new HashSet<>();

    /* renamed from: E */
    public int f275391E = 0;

    /* renamed from: E0 */
    public HashSet<String> f275392E0 = new HashSet<>();

    /* renamed from: F */
    public int f275393F = 0;

    /* renamed from: F0 */
    public HashSet<String> f275394F0 = new HashSet<>();

    /* renamed from: G */
    public int f275395G = 0;

    /* renamed from: G0 */
    public HashSet<String> f275396G0 = new HashSet<>();

    /* renamed from: H */
    public int f275397H = 0;

    /* renamed from: H0 */
    public HashSet<String> f275398H0 = new HashSet<>();

    /* renamed from: I */
    public int f275399I = 0;

    /* renamed from: I0 */
    public HashSet<String> f275400I0 = new HashSet<>();

    /* renamed from: J */
    public int f275401J = 0;

    /* renamed from: J0 */
    public HashSet<String> f275402J0 = new HashSet<>();

    /* renamed from: K */
    public int f275403K = 0;

    /* renamed from: K0 */
    public HashSet<String> f275404K0 = new HashSet<>();

    /* renamed from: L */
    public int f275405L = 0;

    /* renamed from: L0 */
    public HashSet<String> f275406L0 = new HashSet<>();

    /* renamed from: M */
    public long f275407M = 0;

    /* renamed from: M0 */
    public HashSet<String> f275408M0 = new HashSet<>();

    /* renamed from: N */
    public long f275409N = 0;

    /* renamed from: N0 */
    public HashSet<String> f275410N0 = new HashSet<>();

    /* renamed from: O */
    public long f275411O = 0;

    /* renamed from: O0 */
    public HashSet<String> f275412O0 = new HashSet<>();

    /* renamed from: P */
    public long f275413P = 0;

    /* renamed from: P0 */
    public HashSet<String> f275414P0 = new HashSet<>();

    /* renamed from: Q */
    public long f275415Q = 0;

    /* renamed from: Q0 */
    public HashSet<String> f275416Q0 = new HashSet<>();

    /* renamed from: R */
    public long f275417R = 0;

    /* renamed from: R0 */
    public HashSet<String> f275418R0 = new HashSet<>();

    /* renamed from: S */
    public long f275419S = 0;

    /* renamed from: S0 */
    public HashSet<String> f275420S0 = new HashSet<>();

    /* renamed from: T */
    public long f275421T = 0;

    /* renamed from: T0 */
    public int f275422T0 = Integer.MAX_VALUE;

    /* renamed from: U */
    public long f275423U = 0;

    /* renamed from: U0 */
    public int f275424U0 = 0;

    /* renamed from: V */
    public long f275425V = 0;

    /* renamed from: V0 */
    public HashSet<String> f275426V0 = new HashSet<>();

    /* renamed from: W */
    public long f275427W = 0;

    /* renamed from: W0 */
    public HashSet<String> f275428W0 = new HashSet<>();

    /* renamed from: X */
    public long f275429X = 0;

    /* renamed from: X0 */
    public HashSet<String> f275430X0 = new HashSet<>();

    /* renamed from: Y */
    public long f275431Y = 0;

    /* renamed from: Y0 */
    public HashSet<String> f275432Y0 = new HashSet<>();

    /* renamed from: Z */
    public long f275433Z = 0;

    /* renamed from: Z0 */
    public HashSet<String> f275434Z0 = new HashSet<>();

    /* renamed from: a */
    public long f275435a = -1;

    /* renamed from: a0 */
    public long f275436a0 = 0;

    /* renamed from: a1 */
    public HashSet<String> f275437a1 = new HashSet<>();

    /* renamed from: b */
    public long f275438b = 0;

    /* renamed from: b0 */
    public long f275439b0 = 0;

    /* renamed from: b1 */
    public HashSet<String> f275440b1 = new HashSet<>();

    /* renamed from: c */
    public int f275441c = 0;

    /* renamed from: c0 */
    public long f275442c0 = 0;

    /* renamed from: c1 */
    public HashSet<String> f275443c1 = new HashSet<>();

    /* renamed from: d */
    public int f275444d = 0;

    /* renamed from: d0 */
    public long f275445d0 = 0;

    /* renamed from: d1 */
    public HashSet<String> f275446d1 = new HashSet<>();

    /* renamed from: e */
    public int f275447e = 0;

    /* renamed from: e0 */
    public long f275448e0 = 0;

    /* renamed from: e1 */
    public HashSet<String> f275449e1 = new HashSet<>();

    /* renamed from: f */
    public int f275450f = 0;

    /* renamed from: f0 */
    public long f275451f0 = 0;

    /* renamed from: f1 */
    public HashSet<String> f275452f1 = new HashSet<>();

    /* renamed from: g */
    public int f275453g = 0;

    /* renamed from: g0 */
    public long f275454g0 = 0;

    /* renamed from: g1 */
    public HashSet<String> f275455g1 = new HashSet<>();

    /* renamed from: h */
    public int f275456h = 0;

    /* renamed from: h0 */
    public long f275457h0 = 0;

    /* renamed from: h1 */
    public HashSet<String> f275458h1 = new HashSet<>();

    /* renamed from: i */
    public int f275459i = 0;

    /* renamed from: i0 */
    public long f275460i0 = 0;

    /* renamed from: i1 */
    public HashSet<String> f275461i1 = new HashSet<>();

    /* renamed from: j */
    public int f275462j = 0;

    /* renamed from: j0 */
    public long f275463j0 = 0;

    /* renamed from: j1 */
    public IListener f275464j1 = new IListener<SnsTimelineRespListNotifyEvent>(C40008f.f107254d) {
        {
            this.__eventId = 770619130;
        }

        public boolean callback(IEvent iEvent) {
            SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper$1");
            SnsTimelineRespListNotifyEvent snsTimelineRespListNotifyEvent = (SnsTimelineRespListNotifyEvent) iEvent;
            SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper$1");
            if (snsTimelineRespListNotifyEvent instanceof SnsTimelineRespListNotifyEvent) {
                Log.m105924i("MicroMsg.SnsBrowseInfoHelper", "IListener callback " + SnsBrowseInfoHelper.m120659a(SnsBrowseInfoHelper.this));
                if (SnsBrowseInfoHelper.m120659a(SnsBrowseInfoHelper.this) == -1) {
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper$1");
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper$1");
                    return false;
                } else if (SnsBrowseInfoHelper.m120659a(SnsBrowseInfoHelper.this) < 0) {
                    Iterator<Long> it = snsTimelineRespListNotifyEvent.f265199d.f265200a.iterator();
                    while (it.hasNext()) {
                        if (it.next().longValue() > SnsBrowseInfoHelper.m120659a(SnsBrowseInfoHelper.this)) {
                            SnsBrowseInfoHelper snsBrowseInfoHelper = SnsBrowseInfoHelper.this;
                            SnsMethodCalculate.markStartTimeMs("access$108", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                            snsBrowseInfoHelper.f275462j++;
                            SnsMethodCalculate.markEndTimeMs("access$108", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                        }
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper$1");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper$1");
            return false;
        }
    };

    /* renamed from: k */
    public int f275465k = 0;

    /* renamed from: k0 */
    public long f275466k0 = 0;

    /* renamed from: k1 */
    public long f275467k1 = 0;

    /* renamed from: l */
    public int f275468l = 0;

    /* renamed from: l0 */
    public long f275469l0 = 0;

    /* renamed from: m */
    public String f275470m = "";

    /* renamed from: m0 */
    public long f275471m0 = 0;

    /* renamed from: n */
    public String f275472n = "";

    /* renamed from: n0 */
    public long f275473n0 = 0;

    /* renamed from: o */
    public String f275474o = "";

    /* renamed from: o0 */
    public long f275475o0 = 0;

    /* renamed from: p */
    public int f275476p;

    /* renamed from: p0 */
    public long f275477p0 = 0;

    /* renamed from: q */
    public int f275478q = 0;

    /* renamed from: q0 */
    public long f275479q0 = 0;

    /* renamed from: r */
    public int f275480r = 0;

    /* renamed from: r0 */
    public long f275481r0 = 0;

    /* renamed from: s */
    public int f275482s = 0;

    /* renamed from: s0 */
    public int f275483s0;

    /* renamed from: t */
    public int f275484t = 0;

    /* renamed from: t0 */
    public String f275485t0;

    /* renamed from: u */
    public int f275486u = 0;

    /* renamed from: u0 */
    public int f275487u0;

    /* renamed from: v */
    public int f275488v = 0;

    /* renamed from: v0 */
    public String f275489v0;

    /* renamed from: w */
    public int f275490w = 0;

    /* renamed from: w0 */
    public long f275491w0 = 0;

    /* renamed from: x */
    public int f275492x = 0;

    /* renamed from: x0 */
    public long f275493x0 = 0;

    /* renamed from: y */
    public int f275494y = 0;

    /* renamed from: y0 */
    public long f275495y0 = 0;

    /* renamed from: z */
    public int f275496z = 0;

    /* renamed from: z0 */
    public long f275497z0 = 0;

    public SnsBrowseInfoHelper() {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        this.f275464j1.alive();
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
    }

    /* renamed from: a */
    public static /* synthetic */ long m120659a(SnsBrowseInfoHelper snsBrowseInfoHelper) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        long j = snsBrowseInfoHelper.f275435a;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        return j;
    }

    /* renamed from: A */
    public void mo131314A(long j) {
        SnsMethodCalculate.markStartTimeMs("setListFirstId", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        this.f275435a = j;
        SnsMethodCalculate.markEndTimeMs("setListFirstId", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
    }

    /* renamed from: b */
    public void mo131315b(SnsInfo snsInfo, TimeLineObject timeLineObject, int i) {
        SnsMethodCalculate.markStartTimeMs("addFeed", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        if (snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("addFeed", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
            return;
        }
        String localid = snsInfo.getLocalid();
        this.f275426V0.add(localid);
        if (snsInfo.isAd()) {
            this.f275443c1.add(localid);
        }
        this.f275446d1.add(snsInfo.field_userName);
        int i2 = snsInfo.field_type;
        if (i2 == 1) {
            this.f275430X0.add(localid);
        } else if (i2 == 2) {
            this.f275428W0.add(localid);
        } else if (i2 != 3) {
            if (i2 == 4) {
                this.f275434Z0.add(localid);
            } else if (i2 == 5) {
                this.f275455g1.add(localid);
            } else if (i2 == 15) {
                this.f275432Y0.add(localid);
            } else if (i2 == 18) {
                this.f275458h1.add(localid);
            } else if (i2 == 28) {
                this.f275440b1.add(localid);
            } else if (i2 != 42) {
                this.f275461i1.add(localid);
            } else {
                this.f275437a1.add(localid);
            }
        } else if (!Util.isNullOrNil(timeLineObject.publicUserName)) {
            this.f275449e1.add(localid);
        } else {
            this.f275452f1.add(localid);
        }
        if (i < this.f275422T0) {
            this.f275422T0 = i;
            this.f275470m = C102236a0.m134728W(snsInfo);
        }
        if (i > this.f275424U0) {
            this.f275424U0 = i;
            this.f275472n = C102236a0.m134728W(snsInfo);
        }
        this.f275482s = this.f275428W0.size();
        this.f275484t = this.f275430X0.size();
        this.f275486u = this.f275432Y0.size();
        this.f275490w = this.f275434Z0.size();
        this.f275488v = this.f275443c1.size();
        this.f275492x = this.f275440b1.size();
        this.f275494y = this.f275437a1.size();
        this.f275496z = this.f275455g1.size();
        this.f275401J = this.f275458h1.size();
        this.f275446d1.size();
        this.f275478q = this.f275449e1.size();
        this.f275480r = this.f275452f1.size();
        this.f275399I = this.f275461i1.size();
        this.f275441c = this.f275426V0.size();
        SnsMethodCalculate.markEndTimeMs("addFeed", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
    }

    /* renamed from: c */
    public void mo131316c(boolean z) {
        SnsMethodCalculate.markStartTimeMs("handleBrowseAdCanvasTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        if (z) {
            this.f275493x0 = System.currentTimeMillis();
        } else if (this.f275493x0 > 0) {
            this.f275491w0 += System.currentTimeMillis() - this.f275493x0;
            this.f275493x0 = 0;
        }
        SnsMethodCalculate.markEndTimeMs("handleBrowseAdCanvasTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
    }

    /* renamed from: d */
    public void mo131317d(boolean z) {
        SnsMethodCalculate.markStartTimeMs("handleBrowseExternalArticleTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        if (z) {
            this.f275463j0 = System.currentTimeMillis();
        } else if (this.f275463j0 > 0) {
            this.f275460i0 += System.currentTimeMillis() - this.f275463j0;
            this.f275463j0 = 0;
        }
        SnsMethodCalculate.markEndTimeMs("handleBrowseExternalArticleTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
    }

    /* renamed from: e */
    public void mo131318e(boolean z) {
        SnsMethodCalculate.markStartTimeMs("handleBrowseFinderChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        if (z) {
            this.f275421T = System.currentTimeMillis();
        } else if (this.f275421T > 0) {
            this.f275419S += System.currentTimeMillis() - this.f275421T;
            this.f275421T = 0;
        }
        SnsMethodCalculate.markEndTimeMs("handleBrowseFinderChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
    }

    /* renamed from: f */
    public void mo131319f(boolean z) {
        SnsMethodCalculate.markStartTimeMs("handleBrowseForwardAdLongVideoTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        if (z) {
            this.f275481r0 = System.currentTimeMillis();
        } else if (this.f275481r0 > 0) {
            this.f275479q0 += System.currentTimeMillis() - this.f275481r0;
            this.f275481r0 = 0;
        }
        SnsMethodCalculate.markEndTimeMs("handleBrowseForwardAdLongVideoTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
    }

    /* renamed from: g */
    public void mo131320g(boolean z) {
        SnsMethodCalculate.markStartTimeMs("handleBrowseFullScreenAdImageTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        if (z) {
            this.f275469l0 = System.currentTimeMillis();
        } else if (this.f275469l0 > 0) {
            this.f275466k0 += System.currentTimeMillis() - this.f275469l0;
            this.f275469l0 = 0;
        }
        SnsMethodCalculate.markEndTimeMs("handleBrowseFullScreenAdImageTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
    }

    /* renamed from: h */
    public void mo131321h(boolean z) {
        SnsMethodCalculate.markStartTimeMs("handleBrowseFullScreenAdLongVideoTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        if (z) {
            this.f275477p0 = System.currentTimeMillis();
        } else if (this.f275477p0 > 0) {
            this.f275475o0 += System.currentTimeMillis() - this.f275477p0;
            this.f275477p0 = 0;
        }
        SnsMethodCalculate.markEndTimeMs("handleBrowseFullScreenAdLongVideoTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
    }

    /* renamed from: i */
    public void mo131322i(boolean z) {
        SnsMethodCalculate.markStartTimeMs("handleBrowseFullScreenAdSightTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        if (z) {
            this.f275473n0 = System.currentTimeMillis();
        } else if (this.f275473n0 > 0) {
            this.f275471m0 += System.currentTimeMillis() - this.f275473n0;
            this.f275473n0 = 0;
        }
        SnsMethodCalculate.markEndTimeMs("handleBrowseFullScreenAdSightTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
    }

    /* renamed from: j */
    public void mo131323j(boolean z) {
        SnsMethodCalculate.markStartTimeMs("handleBrowseFullScreenImageTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        if (z) {
            this.f275445d0 = System.currentTimeMillis();
        } else if (this.f275445d0 > 0) {
            this.f275442c0 += System.currentTimeMillis() - this.f275445d0;
            this.f275445d0 = 0;
        }
        SnsMethodCalculate.markEndTimeMs("handleBrowseFullScreenImageTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
    }

    /* renamed from: k */
    public void mo131324k(boolean z) {
        SnsMethodCalculate.markStartTimeMs("handleBrowseFullScreenSightTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        if (z) {
            this.f275451f0 = System.currentTimeMillis();
        } else if (this.f275451f0 > 0) {
            this.f275448e0 += System.currentTimeMillis() - this.f275451f0;
            this.f275451f0 = 0;
        }
        SnsMethodCalculate.markEndTimeMs("handleBrowseFullScreenSightTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
    }

    /* renamed from: l */
    public void mo131325l(boolean z) {
        SnsMethodCalculate.markStartTimeMs("handleBrowseMPArticleTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        if (z) {
            this.f275457h0 = System.currentTimeMillis();
        } else if (this.f275457h0 > 0) {
            this.f275454g0 += System.currentTimeMillis() - this.f275457h0;
            this.f275457h0 = 0;
        }
        SnsMethodCalculate.markEndTimeMs("handleBrowseMPArticleTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
    }

    /* renamed from: m */
    public void mo131326m(boolean z) {
        SnsMethodCalculate.markStartTimeMs("handleBrowseMessageListTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        if (z) {
            this.f275433Z = System.currentTimeMillis();
        } else if (this.f275433Z > 0) {
            this.f275431Y += System.currentTimeMillis() - this.f275433Z;
            this.f275433Z = 0;
        }
        SnsMethodCalculate.markEndTimeMs("handleBrowseMessageListTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
    }

    /* renamed from: n */
    public void mo131327n(boolean z) {
        SnsMethodCalculate.markStartTimeMs("handleBrowseMusicPlayerChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        if (z) {
            this.f275425V = System.currentTimeMillis();
        } else if (this.f275425V > 0) {
            this.f275423U += System.currentTimeMillis() - this.f275425V;
            this.f275425V = 0;
        }
        SnsMethodCalculate.markEndTimeMs("handleBrowseMusicPlayerChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
    }

    /* renamed from: o */
    public void mo131328o(boolean z) {
        SnsMethodCalculate.markStartTimeMs("handleBrowseMyAlbumTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        if (z) {
            this.f275417R = System.currentTimeMillis();
        } else if (this.f275417R > 0) {
            this.f275415Q += System.currentTimeMillis() - this.f275417R;
            this.f275417R = 0;
        }
        SnsMethodCalculate.markEndTimeMs("handleBrowseMyAlbumTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
    }

    /* renamed from: p */
    public void mo131329p(boolean z) {
        SnsMethodCalculate.markStartTimeMs("handleBrowseOtherAlbumTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        if (z) {
            this.f275429X = System.currentTimeMillis();
        } else if (this.f275429X > 0) {
            this.f275427W += System.currentTimeMillis() - this.f275429X;
            this.f275429X = 0;
        }
        SnsMethodCalculate.markEndTimeMs("handleBrowseOtherAlbumTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
    }

    /* renamed from: q */
    public void mo131330q(boolean z) {
        SnsMethodCalculate.markStartTimeMs("handleBrowseTimelineTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        if (z) {
            this.f275413P = System.currentTimeMillis();
        } else if (this.f275413P > 0) {
            this.f275411O += System.currentTimeMillis() - this.f275413P;
            this.f275413P = 0;
        }
        SnsMethodCalculate.markEndTimeMs("handleBrowseTimelineTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
    }

    /* renamed from: r */
    public void mo131331r(boolean z) {
        SnsMethodCalculate.markStartTimeMs("handleClickNewPostTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        if (z) {
            this.f275439b0 = System.currentTimeMillis();
        } else if (this.f275439b0 > 0) {
            this.f275436a0 += System.currentTimeMillis() - this.f275439b0;
            this.f275439b0 = 0;
        }
        SnsMethodCalculate.markEndTimeMs("handleClickNewPostTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
    }

    /* renamed from: s */
    public void mo131332s(boolean z) {
        SnsMethodCalculate.markStartTimeMs("handleForwardBrowseAdCanvasTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        if (z) {
            this.f275497z0 = System.currentTimeMillis();
        } else if (this.f275497z0 > 0) {
            this.f275495y0 += System.currentTimeMillis() - this.f275497z0;
            this.f275497z0 = 0;
        }
        SnsMethodCalculate.markEndTimeMs("handleForwardBrowseAdCanvasTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
    }

    /* renamed from: t */
    public final String mo131333t(HashSet<String> hashSet) {
        SnsMethodCalculate.markStartTimeMs("mergeStringList", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<String> it = hashSet.iterator();
        boolean z = true;
        while (it.hasNext()) {
            String next = it.next();
            if (z) {
                stringBuffer.append(next);
                z = false;
            } else {
                stringBuffer.append("|" + next);
            }
        }
        String stringBuffer2 = stringBuffer.toString();
        SnsMethodCalculate.markEndTimeMs("mergeStringList", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        return stringBuffer2;
    }

    /* renamed from: u */
    public void mo131334u(SnsInfo snsInfo, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onClickAbum", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        if (snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("onClickAbum", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
            return;
        }
        if (z) {
            this.f275404K0.add(C102236a0.m134728W(snsInfo));
        } else {
            this.f275406L0.add(C102236a0.m134728W(snsInfo));
        }
        this.f275412O0.add(snsInfo.getUserName());
        this.f275450f = this.f275412O0.size();
        if (C94866e1.Mx0().equals(snsInfo.getUserName())) {
            mo131328o(true);
        } else {
            mo131329p(true);
        }
        SnsMethodCalculate.markEndTimeMs("onClickAbum", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
    }

    /* renamed from: v */
    public void mo131335v(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("onClickFeed", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        if (snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("onClickFeed", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
            return;
        }
        String localid = snsInfo.getLocalid();
        String W = C102236a0.m134728W(snsInfo);
        if (this.f275396G0.contains(W)) {
            SnsMethodCalculate.markEndTimeMs("onClickFeed", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
            return;
        }
        Log.m105925i("MicroMsg.SnsBrowseInfoHelper", "onClickFeed localId:Td, snsId:%s", localid, W);
        this.f275447e++;
        this.f275396G0.add(W);
        if (snsInfo.isAd()) {
            this.f275405L++;
        }
        int i = snsInfo.field_type;
        if (i == 1) {
            this.f275387C++;
        } else if (i == 15) {
            this.f275389D++;
        } else if (i == 18) {
            this.f275403K++;
        } else if (i == 28) {
            this.f275397H++;
        } else if (i == 42) {
            this.f275395G++;
        } else if (i != 3) {
            if (i == 4) {
                this.f275391E++;
            } else if (i == 5) {
                this.f275393F++;
            }
        } else if (!Util.isNullOrNil(snsInfo.getTimeLine().publicUserName)) {
            this.f275383A++;
        } else {
            this.f275385B++;
        }
        if (snsInfo.isAd()) {
            if (snsInfo.getAdXml() == null || !snsInfo.getAdXml().isLandingPagesAd()) {
                int i2 = snsInfo.field_type;
                if (i2 == 1) {
                    mo131320g(true);
                } else if (i2 == 15) {
                    mo131322i(true);
                }
            } else {
                mo131316c(true);
            }
        } else if (snsInfo.getTimeLine() == null || Util.isNullOrNil(snsInfo.getTimeLine().canvasInfo)) {
            int i3 = snsInfo.field_type;
            if (i3 == 1) {
                mo131323j(true);
            } else if (i3 == 15) {
                mo131324k(true);
            } else if (i3 == 18) {
                mo131319f(true);
            } else if (i3 == 28) {
                mo131318e(true);
            } else if (i3 == 42) {
                mo131327n(true);
            } else if (i3 != 3) {
                if (i3 == 4) {
                    mo131317d(true);
                } else if (i3 == 5) {
                    mo131317d(true);
                }
            } else if (!Util.isNullOrNil(snsInfo.getTimeLine().publicUserName)) {
                mo131325l(true);
            } else {
                mo131317d(true);
            }
        } else {
            mo131332s(true);
        }
        SnsMethodCalculate.markEndTimeMs("onClickFeed", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
    }

    /* renamed from: w */
    public void mo131336w(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("onCommentLikeEvent", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        if (snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("onCommentLikeEvent", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
            return;
        }
        this.f275390D0.add(snsInfo.getLocalid());
        this.f275444d = this.f275390D0.size();
        SnsMethodCalculate.markEndTimeMs("onCommentLikeEvent", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
    }

    /* renamed from: x */
    public void mo131337x(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("onFavFeed", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        this.f275400I0.add(str2);
        this.f275416Q0.add(str);
        this.f275416Q0.size();
        SnsMethodCalculate.markEndTimeMs("onFavFeed", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
    }

    /* renamed from: y */
    public void mo131338y() {
        SnsMethodCalculate.markStartTimeMs("onTimelineCreate", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        Log.m105924i("MicroMsg.SnsBrowseInfoHelper", "onTimelineCreate");
        this.f275467k1 = System.currentTimeMillis();
        SnsMethodCalculate.markEndTimeMs("onTimelineCreate", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
    }

    /* renamed from: z */
    public void mo131339z(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setHasNewSnsMsgWhenEntrance", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        this.f275465k = z ? 1 : 0;
        SnsMethodCalculate.markEndTimeMs("setHasNewSnsMsgWhenEntrance", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
    }
}
