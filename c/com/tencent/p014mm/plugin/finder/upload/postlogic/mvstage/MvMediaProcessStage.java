package com.tencent.p014mm.plugin.finder.upload.postlogic.mvstage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Size;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FeedPostProgressEvent;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sight.base.AdaptiveAdjustBitrate;
import com.tencent.p014mm.plugin.vlog.model.C57463v;
import com.tencent.p014mm.plugin.vlog.model.C57465w;
import com.tencent.p014mm.plugin.vlog.model.C57467x;
import com.tencent.p014mm.plugin.vlog.model.C57468y;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderMediaReportInfo;
import com.tencent.p014mm.protocal.protobuf.FinderMediaReportObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import cr1.C57977a;
import cr1.C57978b;
import cr1.C57985h;
import di3.C7335d;
import di3.C86312j;
import eb0.C31543z5;
import er1.C58741j5;
import er1.C58784w3;
import gy3.C59741c0;
import gy3.C8477a0;
import gy3.C8478d0;
import gy3.C8480h;
import gy3.C87412m;
import h81.C32735h;
import iy3.C60641c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import p232rw.C63679m;
import p707tz.C65000f;
import p707tz.C65002h;
import pl1.C62344b0;
import pl1.C62367r0;
import rx3.C13598b0;
import sx3.C26236u;
import sx3.C64197v;
import te3.C101758az;
import te3.C64339ea;
import te3.C64417hb1;
import te3.C64477jr2;
import te3.C64550mb1;
import te3.C64689rq2;
import te3.C64825xb1;
import te3.C64869yy;
import te3.C64899zy;
import up1.C27696y;
import up1.C37521f;
import uq1.C65433e;
import wp1.C15585f;
import wq1.C66177f;
import xq1.C66408e;

/* renamed from: com.tencent.mm.plugin.finder.upload.postlogic.mvstage.MvMediaProcessStage */
public final class MvMediaProcessStage extends C66177f {

    /* renamed from: h */
    public final FinderItem f161615h;

    /* renamed from: i */
    public C57463v f161616i;

    /* renamed from: j */
    public final MvMediaProcessStage$feedDeleteListener$1 f161617j = new MvMediaProcessStage$feedDeleteListener$1(this, C40008f.f107254d);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MvMediaProcessStage(FinderItem finderItem) {
        super(String.valueOf(finderItem.getLocalId()));
        C87412m.m108594g(finderItem, "mainFinderObj");
        this.f161615h = finderItem;
    }

    /* renamed from: a */
    public int mo75100a() {
        return 2;
    }

    /* renamed from: d */
    public void mo75102d(C66408e eVar) {
        C87412m.m108594g(eVar, "nextStage");
        boolean isLongVideo = this.f161615h.isLongVideo();
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175913w(1253, 20, 1);
        if (isLongVideo) {
            if ((1253 == 1253 ? 1523 : 0) > 0) {
                nVar.mo175913w(1253 == 1253 ? 1523 : 0, 20, 1);
            }
        }
    }

    /* renamed from: e */
    public void mo75103e(C66408e eVar) {
        C87412m.m108594g(eVar, "nextStage");
    }

    /* renamed from: f */
    public void mo75104f(C66408e eVar) {
        C87412m.m108594g(eVar, "nextStage");
        boolean isLongVideo = this.f161615h.isLongVideo();
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175913w(1253, 20, 1);
        if (isLongVideo) {
            if ((1253 == 1253 ? 1523 : 0) > 0) {
                nVar.mo175913w(1253 == 1253 ? 1523 : 0, 20, 1);
            }
        }
    }

    /* renamed from: g */
    public C66408e mo75105g() {
        MvMediaProcessStage mvMediaProcessStage;
        C66408e eVar;
        LinkedList<C64550mb1> linkedList;
        boolean z;
        T t;
        Class cls;
        Class cls2;
        int i;
        boolean z2;
        int i2;
        C64869yy yyVar;
        LinkedList<C64339ea> linkedList2;
        LinkedList<FinderMedia> linkedList3;
        T t2;
        Log.m105924i("LogPost.MvMediaProcessStage", "start localId:" + this.f161615h.getLocalId());
        this.f161617j.alive();
        Class cls3 = C63679m.class;
        Class cls4 = C65000f.class;
        Log.m105924i("LogPost.MvMediaProcessStage", "start localId:" + this.f161615h.getLocalId());
        this.f161617j.alive();
        this.f161615h.trackPost("mediaProcess");
        FinderFeedReportObject finderFeedReportObject = this.f161615h.field_reportObject;
        int i3 = 2;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.postStage = 2;
        }
        C37521f.f99374d.getClass();
        boolean z3 = true;
        if (C37521f.f99562y.mo60266n().intValue() == 1) {
            eVar = new C57985h(this.f161615h, 2);
        } else {
            FinderObjectDesc finderObjectDesc = this.f161615h.getFeedObject().objectDesc;
            C64417hb1 hb12 = finderObjectDesc != null ? finderObjectDesc.mvInfo : null;
            if (hb12 == null) {
                eVar = new C57985h(this.f161615h, 2);
            } else {
                if (hb12.f183461j == 1) {
                    linkedList = hb12.f183460i;
                    C87412m.m108593f(linkedList, "mvInfo.ordered_track_list_flex_clip");
                } else {
                    linkedList = hb12.f183455d;
                    C87412m.m108593f(linkedList, "mvInfo.orderedTrackList");
                }
                LinkedList<C64550mb1> linkedList4 = new LinkedList<>();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = linkedList.iterator();
                while (true) {
                    z = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (((C64550mb1) next).f184260f == 0) {
                        z = true;
                    }
                    if (z) {
                        arrayList.add(next);
                    }
                }
                linkedList4.addAll(arrayList);
                for (C64550mb1 mb12 : linkedList4) {
                    Iterator<T> it4 = this.f161615h.getClipListExt().iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            t2 = null;
                            break;
                        }
                        t2 = it4.next();
                        if (C87412m.m108589b(((FinderItem) t2).getObjectNonceId(), mb12.f184261g)) {
                            break;
                        }
                    }
                    FinderItem finderItem = (FinderItem) t2;
                }
                Log.m105924i("LogPost.MvMediaProcessStage", "processTracks size:" + linkedList4.size());
                int size = linkedList4.size();
                Iterator it5 = linkedList4.iterator();
                mvMediaProcessStage = this;
                MvMediaProcessStage mvMediaProcessStage2 = mvMediaProcessStage;
                int i4 = 0;
                while (true) {
                    if (!it5.hasNext()) {
                        eVar = new MvUploadStage(mvMediaProcessStage2.f161615h);
                        break;
                    }
                    Object next2 = it5.next();
                    int i5 = i4 + 1;
                    if (i4 >= 0) {
                        C64550mb1 mb13 = (C64550mb1) next2;
                        Iterator<T> it6 = mvMediaProcessStage2.f161615h.getClipListExt().iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                t = null;
                                break;
                            }
                            t = it6.next();
                            if (C87412m.m108589b(((FinderItem) t).getObjectNonceId(), mb13.f184261g)) {
                                break;
                            }
                        }
                        FinderItem finderItem2 = (FinderItem) t;
                        if (finderItem2 != null) {
                            LinkedList<Integer> linkedList5 = mb13.f184269r;
                            if (!(linkedList5 != null && linkedList5.contains(Integer.valueOf(z3 ? 1 : 0)) == z3)) {
                                FinderObjectDesc finderObjectDesc2 = finderItem2.getFinderObject().objectDesc;
                                FinderMedia first = (finderObjectDesc2 == null || (linkedList3 = finderObjectDesc2.media) == null) ? null : linkedList3.getFirst();
                                C64689rq2 cropInfo = finderItem2.getCropInfo(z ? 1 : 0);
                                if (cropInfo != null) {
                                    C64477jr2 jr22 = cropInfo.f185281u;
                                    int i6 = jr22 != null ? jr22.f183837n : 0;
                                    C37521f fVar = C37521f.f99374d;
                                    fVar.getClass();
                                    if (i6 <= C37521f.f99120A) {
                                        if (first == null) {
                                            Log.m105924i("LogPost.MvMediaProcessStage", "error cannot get mvTrack and mvMedia");
                                            eVar = new C57985h(mvMediaProcessStage2.f161615h, 2);
                                            break;
                                        }
                                        long currentTicks = Util.currentTicks();
                                        C64477jr2 jr23 = cropInfo.f185281u;
                                        if (jr23 != null) {
                                            jr23.f183837n++;
                                        }
                                        C15585f.C15586a aVar = C15585f.f42211a;
                                        aVar.mo14347j(this.f161615h);
                                        String str = first.url;
                                        if (str == null) {
                                            str = "";
                                        }
                                        if (!C86013q1.m106450k(str)) {
                                            Log.m105924i("LogPost.MvMediaProcessStage", "start process mv, file not exist:" + str);
                                            eVar = new C57985h(mvMediaProcessStage2.f161615h, i3);
                                            break;
                                        }
                                        float f = first.width;
                                        float f2 = first.height;
                                        int i7 = first.videoDuration;
                                        FinderItem finderItem3 = finderItem2;
                                        long j = mb13.f184262h;
                                        C15585f.C15586a aVar2 = aVar;
                                        long j2 = ((long) mb13.f184259e) + j;
                                        C63679m.C63680a UU = ((C63679m) C86312j.m106911c(cls3)).mo88484UU(str, true);
                                        cls = cls3;
                                        StringBuilder sb = new StringBuilder();
                                        int i8 = i4;
                                        sb.append("start process mv, size:[");
                                        sb.append(f);
                                        sb.append(',');
                                        sb.append(f2);
                                        sb.append("], videoDuration:");
                                        sb.append(i7);
                                        sb.append(", clipRange:[");
                                        sb.append(j);
                                        sb.append(',');
                                        sb.append(j2);
                                        sb.append("], path:");
                                        sb.append(str);
                                        Log.m105924i("LogPost.MvMediaProcessStage", sb.toString());
                                        Log.m105924i("LogPost.MvMediaProcessStage", "start process mv, videoInfo:" + UU);
                                        if (UU == null) {
                                            Log.m105924i("LogPost.MvMediaProcessStage", "start process mv, fail to get origin video info");
                                            eVar = new C57985h(this.f161615h, 2);
                                            break;
                                        }
                                        VideoTransPara O = fVar.mo61161O();
                                        StringBuilder sb4 = new StringBuilder();
                                        int i9 = size;
                                        sb4.append("process mv videoParams ");
                                        sb4.append(O);
                                        Log.m105924i("LogPost.MvMediaProcessStage", sb4.toString());
                                        FinderMediaReportObject finderMediaReportObject = new FinderMediaReportObject();
                                        finderMediaReportObject.mediaType = cropInfo.f185268f;
                                        finderMediaReportObject.origin = new FinderMediaReportInfo();
                                        finderMediaReportObject.multiMediaInfo = new LinkedList<>();
                                        FinderMediaReportInfo finderMediaReportInfo = new FinderMediaReportInfo();
                                        finderMediaReportInfo.fileSize = (int) C86013q1.m106451l(str);
                                        finderMediaReportInfo.width = (int) f;
                                        finderMediaReportInfo.height = (int) f2;
                                        finderMediaReportInfo.videoBitrate = UU.f180529e;
                                        finderMediaReportInfo.videoDuration = i7;
                                        finderMediaReportInfo.audioBitrate = UU.f180532h;
                                        finderMediaReportInfo.fps = (int) UU.f180527c;
                                        Log.m105924i("LogPost.MvMediaProcessStage", "put multiMediaInfo:" + finderMediaReportInfo);
                                        finderMediaReportObject.multiMediaInfo.add(finderMediaReportInfo);
                                        String h = C58741j5.f168184a.mo83734h(new C62367r0(cropInfo, C27696y.V99_VIDEO, "xV99", 0, 0, (String) null, 56, (C8480h) null), String.valueOf(System.currentTimeMillis()));
                                        C7335d c = C86312j.m106911c(cls4);
                                        C87412m.m108593f(c, "getService(IFinderVlogFinderService::class.java)");
                                        C57468y a = C65000f.C65001a.m76631a((C65000f) c, str, false, 2, (Object) null);
                                        C57467x la = ((C65000f) C86312j.m106911c(cls4)).mo89196la(C26236u.m33719b(a));
                                        la.mo81182a(j, j2);
                                        Rect rect = new Rect();
                                        int i15 = UU.f180525a;
                                        int i16 = UU.f180526b;
                                        int i17 = UU.f180530f;
                                        if (i17 == 90 || i17 == 270) {
                                            int i18 = i16;
                                            i16 = i15;
                                            i15 = i18;
                                        }
                                        a.mo81192f().f316486d.set(0, 0, i15, i16);
                                        la.mo81184c(i15, i16);
                                        rect.set(0, 0, i15, i16);
                                        la.mo81183b(rect);
                                        la.mo81185d(false);
                                        C57465w wN = ((C65000f) C86312j.m106911c(cls4)).mo89207wN(la);
                                        wN.mo81181b(h, O, new Size(i15, i16), rect, true, true);
                                        C64899zy a2 = wN.mo81180a();
                                        C101758az azVar = a2.f186904i;
                                        azVar.f297896d = h;
                                        C57463v mn = ((C65000f) C86312j.m106911c(cls4)).mo89198mn();
                                        mn.mo81175c(((C65002h) C86312j.m106911c(C65002h.class)).mo89210Gv());
                                        C64477jr2 jr24 = cropInfo.f185281u;
                                        mn.mo81178f(jr24 != null ? jr24.f183837n : 0);
                                        if (fVar.mo61153G()) {
                                            mn.mo81173a(true, O);
                                        }
                                        int i19 = i8;
                                        int i25 = i9;
                                        mn.mo81174b(new C57977a(new C59741c0(), this, i19, i25));
                                        this.f161616i = mn;
                                        Object obj = new Object();
                                        C8477a0 a0Var = new C8477a0();
                                        C8478d0 d0Var = new C8478d0();
                                        d0Var.f27483d = -1;
                                        C8478d0 d0Var2 = d0Var;
                                        C8477a0 a0Var2 = a0Var;
                                        cls2 = cls4;
                                        C8478d0 d0Var3 = d0Var2;
                                        FinderItem finderItem4 = finderItem3;
                                        FinderMediaReportObject finderMediaReportObject2 = finderMediaReportObject;
                                        int i26 = i19;
                                        int i27 = i25;
                                        String str2 = h;
                                        VideoTransPara videoTransPara = O;
                                        C15585f.C15586a aVar3 = aVar2;
                                        C64689rq2 rq22 = cropInfo;
                                        float b = C57463v.C57464a.m66220b(mn, a2, false, new C57978b(d0Var2, this, currentTicks, finderMediaReportObject, h, azVar, O, a2, obj, a0Var2), 2, (Object) null);
                                        synchronized (obj) {
                                            if (!a0Var2.f27482d) {
                                                Log.m105924i("LogPost.MvMediaProcessStage", "wait");
                                                obj.wait();
                                                Log.m105924i("LogPost.MvMediaProcessStage", "notify " + d0Var3.f27483d);
                                            }
                                            C13598b0 b0Var = C13598b0.f38549a;
                                        }
                                        C63679m.C63680a UU2 = ((C63679m) C86312j.m106911c(cls)).mo88484UU(str2, true);
                                        Log.m105924i("LogPost.MvMediaProcessStage", "remux finished, ret:" + d0Var3.f27483d + ", videoQuality:" + b + ", outputVideoInfo:" + UU2);
                                        FinderItem finderItem5 = this.f161615h;
                                        FinderFeedReportObject finderFeedReportObject2 = finderItem5.field_reportObject;
                                        if (finderFeedReportObject2 != null) {
                                            finderFeedReportObject2.mpError = d0Var3.f27483d;
                                        }
                                        C15585f.C15586a aVar4 = aVar2;
                                        aVar4.mo14347j(finderItem5);
                                        if (d0Var3.f27483d < 0 || UU2 == null || UU2.f180525a < 0 || UU2.f180526b < 0 || UU2.f180528d < 0) {
                                            eVar = new C57985h(this.f161615h, 2);
                                        } else {
                                            i = i27;
                                            mo79373h(1.0f, i26, i);
                                            float f3 = (float) UU2.f180525a;
                                            C64689rq2 rq23 = rq22;
                                            rq23.f185270h = f3;
                                            float f4 = (float) UU2.f180526b;
                                            rq23.f185271i = f4;
                                            VideoTransPara videoTransPara2 = videoTransPara;
                                            int i28 = videoTransPara2.f267179t;
                                            int i29 = (int) ((f4 / f3) * ((float) i28));
                                            String f5 = C65433e.f188292a.mo89555f(str2, i28, i29, (Rect) null);
                                            if (fVar.mo61155I()) {
                                                z2 = false;
                                                i2 = AdaptiveAdjustBitrate.m119559e(C37521f.f99419i, 0, i28, i29, 0.8f);
                                            } else {
                                                z2 = false;
                                                i2 = 0;
                                            }
                                            Log.m105924i("LogPost.MvMediaProcessStage", "qipengfeng, audio quality level: " + (fVar.mo61155I() ? AdaptiveAdjustBitrate.m119556a(str2, (float) videoTransPara2.f267173n, (float) videoTransPara2.f267174o, videoTransPara2.f267175p, ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_audio_quality_analysis_switch, z2 ? 1 : 0) == 1, true) : 0.0f));
                                            rq23.f185262W0 = finderMediaReportObject2;
                                            rq23.f185266d = str2;
                                            rq23.f185267e = f5;
                                            rq23.f185280t = z2;
                                            rq23.f185275p = MD5Util.getMD5String(str2);
                                            rq23.f185285x0 = C58784w3.f168295a.mo83984z1(rq23.f185267e);
                                            rq23.f185273n = (int) C86013q1.m106451l(str2);
                                            FinderMediaReportObject finderMediaReportObject3 = rq23.f185262W0;
                                            if (finderMediaReportObject3 != null) {
                                                finderMediaReportObject3.target = new FinderMediaReportInfo();
                                            }
                                            FinderMediaReportObject finderMediaReportObject4 = rq23.f185262W0;
                                            FinderMediaReportInfo finderMediaReportInfo2 = finderMediaReportObject4 != null ? finderMediaReportObject4.target : null;
                                            if (finderMediaReportInfo2 != null) {
                                                finderMediaReportInfo2.fileSize = rq23.f185273n;
                                            }
                                            if (finderMediaReportObject4 != null) {
                                                FinderMediaReportInfo finderMediaReportInfo3 = finderMediaReportObject4.target;
                                                finderMediaReportObject4.videoFinalSize = finderMediaReportInfo3 != null ? finderMediaReportInfo3.fileSize : 0;
                                            }
                                            C64899zy zyVar = rq23.f185235B;
                                            if (zyVar != null) {
                                                zyVar.f186905j = z2;
                                            }
                                            if (rq23.f185236C == null) {
                                                rq23.f185236C = new C64825xb1();
                                            }
                                            C64825xb1 xb12 = rq23.f185236C;
                                            if (xb12 != null) {
                                                xb12.f186282d = b;
                                                xb12.f186284f = 0.0f;
                                                xb12.f186285g = (float) i2;
                                                C64899zy zyVar2 = rq23.f185235B;
                                                xb12.f186287i = ((zyVar2 == null || (yyVar = zyVar2.f186906n) == null || (linkedList2 = yyVar.f186611e) == null) ? 0 : linkedList2.size()) > 0;
                                                Log.m105924i("LogPost.MvMediaProcessStage", "codec_info video_score:" + xb12.f186282d + ",video_cover_score:" + xb12.f186283e + ",video_audio_score:" + xb12.f186284f + ",thumb_score:" + xb12.f186285g + ",hdimg_score:" + xb12.f186286h + ",has_stickers:" + xb12.f186287i);
                                            }
                                            FinderMediaReportObject finderMediaReportObject5 = rq23.f185262W0;
                                            if ((finderMediaReportObject5 != null ? finderMediaReportObject5.codecInfo : null) == null && finderMediaReportObject5 != null) {
                                                finderMediaReportObject5.codecInfo = rq23.f185236C;
                                            }
                                            rq23.f185269g = C60641c.m70921b(((float) UU2.f180528d) / 1000.0f);
                                            FinderMediaReportObject finderMediaReportObject6 = rq23.f185262W0;
                                            FinderMediaReportInfo finderMediaReportInfo4 = finderMediaReportObject6 != null ? finderMediaReportObject6.target : null;
                                            if (finderMediaReportInfo4 != null) {
                                                finderMediaReportInfo4.videoDuration = (int) UU2.f180528d;
                                            }
                                            FinderMediaReportInfo finderMediaReportInfo5 = finderMediaReportObject6 != null ? finderMediaReportObject6.target : null;
                                            if (finderMediaReportInfo5 != null) {
                                                finderMediaReportInfo5.width = UU2.f180525a;
                                            }
                                            FinderMediaReportInfo finderMediaReportInfo6 = finderMediaReportObject6 != null ? finderMediaReportObject6.target : null;
                                            if (finderMediaReportInfo6 != null) {
                                                finderMediaReportInfo6.height = UU2.f180526b;
                                            }
                                            FinderMediaReportInfo finderMediaReportInfo7 = finderMediaReportObject6 != null ? finderMediaReportObject6.target : null;
                                            if (finderMediaReportInfo7 != null) {
                                                finderMediaReportInfo7.videoBitrate = UU2.f180529e;
                                            }
                                            FinderMediaReportInfo finderMediaReportInfo8 = finderMediaReportObject6 != null ? finderMediaReportObject6.target : null;
                                            if (finderMediaReportInfo8 != null) {
                                                finderMediaReportInfo8.audioBitrate = UU2.f180532h;
                                            }
                                            FinderMediaReportInfo finderMediaReportInfo9 = finderMediaReportObject6 != null ? finderMediaReportObject6.target : null;
                                            if (finderMediaReportInfo9 != null) {
                                                finderMediaReportInfo9.fps = (int) UU2.f180527c;
                                            }
                                            LinkedList linkedList6 = new LinkedList();
                                            linkedList6.add(rq23);
                                            FinderItem finderItem6 = finderItem4;
                                            finderItem6.setMediaList(linkedList6);
                                            FinderFeedReportObject finderFeedReportObject3 = finderItem6.field_reportObject;
                                            if (finderFeedReportObject3 != null) {
                                                finderFeedReportObject3.remuxEndTime = C31543z5.m39453c();
                                                finderFeedReportObject3.remuxType = 2;
                                            }
                                            Log.m105924i("LogPost.MvMediaProcessStage", "processList url " + rq23.f185266d + " thumbUrl: " + rq23.f185267e + " newMd5: " + MD5Util.getMD5String(rq23.f185266d) + " size:" + Util.getSizeKB(C86013q1.m106451l(rq23.f185266d)));
                                            aVar4.mo14347j(this.f161615h);
                                            mvMediaProcessStage = this;
                                            mvMediaProcessStage2 = mvMediaProcessStage;
                                            size = i;
                                            i4 = i5;
                                            cls4 = cls2;
                                            cls3 = cls;
                                            z = false;
                                            z3 = true;
                                            i3 = 2;
                                        }
                                    } else {
                                        eVar = new C57985h(mvMediaProcessStage2.f161615h, i3);
                                        break;
                                    }
                                } else {
                                    Log.m105924i("LogPost.MvMediaProcessStage", "cannot get local finder media");
                                    eVar = new C57985h(mvMediaProcessStage2.f161615h, i3);
                                    break;
                                }
                            } else {
                                C64689rq2 cropInfo2 = finderItem2.getCropInfo(z);
                                if (cropInfo2 != null) {
                                    String d = C58741j5.f168184a.mo83730d(new C62344b0(cropInfo2, C27696y.RAW_IMAGE, (String) null, (String) null, 12, (C8480h) null), String.valueOf(System.currentTimeMillis()));
                                    float f6 = cropInfo2.f185270h;
                                    float f7 = cropInfo2.f185271i;
                                    C37521f fVar2 = C37521f.f99374d;
                                    float min = Math.min((((float) fVar2.mo61199y()) * 1.0f) / f6, (((float) fVar2.mo61198x()) * 1.0f) / f7);
                                    if (min > 1.0f) {
                                        C86013q1.m106442c(cropInfo2.f185266d, d);
                                    } else {
                                        BitmapUtil.saveBitmapToImage(BitmapUtil.scaleBitmap(BitmapUtil.decodeFile(cropInfo2.f185266d), min, min), 100, Bitmap.CompressFormat.JPEG, d, z);
                                        cropInfo2.f185270h = (float) ((int) (f6 * min));
                                        cropInfo2.f185271i = (float) ((int) (f7 * min));
                                    }
                                    cropInfo2.f185266d = d;
                                    cropInfo2.f185275p = MD5Util.getMD5String(d);
                                    cropInfo2.f185285x0 = C58784w3.f168295a.mo83984z1(cropInfo2.f185267e);
                                    LinkedList linkedList7 = new LinkedList();
                                    linkedList7.add(cropInfo2);
                                    C13598b0 b0Var2 = C13598b0.f38549a;
                                    finderItem2.setMediaList(linkedList7);
                                    C15585f.f42211a.mo14347j(this.f161615h);
                                }
                            }
                        }
                        cls = cls3;
                        i = size;
                        cls2 = cls4;
                        size = i;
                        i4 = i5;
                        cls4 = cls2;
                        cls3 = cls;
                        z = false;
                        z3 = true;
                        i3 = 2;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                mvMediaProcessStage.f161617j.dead();
                return eVar;
            }
        }
        mvMediaProcessStage = this;
        mvMediaProcessStage.f161617j.dead();
        return eVar;
    }

    /* renamed from: h */
    public final void mo79373h(float f, int i, int i2) {
        float f2 = (f > 1.0f ? 1.0f : f) * ((((float) i) + 1.0f) / ((float) i2));
        C37521f.f99374d.getClass();
        int i3 = (int) (((float) C37521f.f99138C) * f2);
        Log.m105924i("LogPost.MvMediaProcessStage", "feed " + this.f161615h.getLocalId() + " updateProgress " + f + ", " + f2 + ", " + i3 + ", index:" + i + ", size:" + i2);
        if (this.f161615h.getPostInfo().f185649h < i3) {
            this.f161615h.getPostInfo().f185649h = i3;
            C15585f.f42211a.mo14345h(this.f161615h);
        }
        FeedPostProgressEvent feedPostProgressEvent = new FeedPostProgressEvent();
        feedPostProgressEvent.f154751d.f154752a = this.f161615h.getLocalId();
        feedPostProgressEvent.f154751d.f154753b = this.f161615h.getPostInfo().f185649h;
        feedPostProgressEvent.publish();
    }
}
