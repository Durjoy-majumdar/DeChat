package com.tencent.p014mm.plugin.sns.p106ui.item;

import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.C95713a5;
import com.tencent.p014mm.plugin.sns.p106ui.MaskImageView;
import com.tencent.p014mm.plugin.sns.p106ui.PhotosContent;
import com.tencent.p014mm.plugin.sns.p106ui.TagImageView;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.util.ArrayList;
import java.util.List;
import p599lr.C61381b;
import ps2.C100880k;
import ps2.C100894u;
import uo3.C78253a;
import zp3.C23555k;

/* renamed from: com.tencent.mm.plugin.sns.ui.item.m */
public class C95929m extends BaseTimeLineItem {

    /* renamed from: q */
    public int f280090q;

    /* renamed from: r */
    public MaskImageView f280091r;

    /* renamed from: s */
    public ImageView f280092s;

    /* renamed from: t */
    public ImageView f280093t;

    /* renamed from: u */
    public List<ImageView> f280094u = new ArrayList();

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.m$a */
    public class C95930a extends C23555k.C23562d {

        /* renamed from: a */
        public final /* synthetic */ SnsInfo f280095a;

        public C95930a(C95929m mVar, SnsInfo snsInfo) {
            this.f280095a = snsInfo;
        }

        /* renamed from: a */
        public long mo52a(View view) {
            SnsMethodCalculate.markStartTimeMs("getExposedId", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem$1");
            long j = (long) this.f280095a.localid;
            SnsMethodCalculate.markEndTimeMs("getExposedId", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem$1");
            return j;
        }

        /* renamed from: b */
        public void mo53b(View view, long j, long j2, boolean z) {
            SnsMethodCalculate.markStartTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem$1");
            if (z) {
                SnsInfo snsInfo = this.f280095a;
                ((C61381b) C86312j.m106911c(C61381b.class)).fd0(false, snsInfo.field_snsId, "", (long) snsInfo.localid, true);
            }
            SnsMethodCalculate.markEndTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.m$b */
    public class C95931b implements C100880k.C100881a {

        /* renamed from: a */
        public final /* synthetic */ PhotosContent f280096a;

        /* renamed from: b */
        public final /* synthetic */ ADXml f280097b;

        /* renamed from: c */
        public final /* synthetic */ TagImageView f280098c;

        public C95931b(PhotosContent photosContent, ADXml aDXml, TagImageView tagImageView) {
            this.f280096a = photosContent;
            this.f280097b = aDXml;
            this.f280098c = tagImageView;
        }

        /* renamed from: a */
        public void mo76113a() {
            SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem$2");
            SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem$2");
        }

        /* renamed from: b */
        public void mo76114b() {
            SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem$2");
            SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem$2");
        }

        /* renamed from: c */
        public void mo76115c(String str) {
            SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem$2");
            C95929m mVar = C95929m.this;
            SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
            mVar.f280091r = (MaskImageView) this.f280096a.findViewById(C0966R.C0970id.gq9);
            SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
            if (C95929m.m122867C(C95929m.this) != null) {
                C95929m.m122867C(C95929m.this).setVisibility(0);
                C95929m.m122867C(C95929m.this).setImageBitmap(BitmapUtil.decodeFile(str));
                ADXml aDXml = this.f280097b;
                float n = C100894u.m132234n((double) aDXml.adMediaIconWidth, 1, aDXml.adBasicRemWidth, aDXml.adBasicRootFontSize);
                ADXml aDXml2 = this.f280097b;
                float n2 = C100894u.m132234n((double) aDXml2.adMediaIconHeight, 1, aDXml2.adBasicRemWidth, aDXml2.adBasicRootFontSize);
                ADXml aDXml3 = this.f280097b;
                float n3 = C100894u.m132234n((double) aDXml3.adMediaIconPaddingRight, 1, aDXml3.adBasicRemWidth, aDXml3.adBasicRootFontSize);
                ADXml aDXml4 = this.f280097b;
                float n4 = C100894u.m132234n((double) aDXml4.adMediaIconPaddingBottom, 1, aDXml4.adBasicRemWidth, aDXml4.adBasicRootFontSize);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) n, (int) n2);
                layoutParams.setMargins((int) ((((float) this.f280098c.getRight()) - n3) - n), (int) ((((float) this.f280098c.getBottom()) - n4) - n2), 0, 0);
                C95929m.m122867C(C95929m.this).setLayoutParams(layoutParams);
            }
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.m$c */
    public static class C95932c extends BaseTimeLineItem.BaseViewHolder {
    }

    /* renamed from: C */
    public static /* synthetic */ MaskImageView m122867C(C95929m mVar) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
        MaskImageView maskImageView = mVar.f280091r;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
        return maskImageView;
    }

    /* renamed from: h */
    public void mo81014h(ViewStub viewStub, BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.f279904e.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        Log.m105924i("MiroMsg.PhotoTimeLineItem", "viewtype" + this.f279905f);
        Point point = new Point();
        point.x = displayMetrics.widthPixels;
        point.y = displayMetrics.heightPixels;
        C94866e1.uy0(point);
        this.f280090q = C94866e1.Hx0();
        if (BaseTimeLineItem.m122773q(baseViewHolder) == null || BaseTimeLineItem.m122773q(baseViewHolder).getParent() == null || !(BaseTimeLineItem.m122773q(baseViewHolder).getParent() instanceof ViewGroup)) {
            baseViewHolder.f279936S = (PhotosContent) baseViewHolder.f279960i.findViewById(C0966R.C0970id.hvu);
            baseViewHolder.f279976q = true;
        } else {
            int i = this.f279905f;
            if (i == 2) {
                BaseTimeLineItem.m122773q(baseViewHolder).setLayoutResource(C0966R.C0971layout.c4q);
            } else if (i == 3) {
                BaseTimeLineItem.m122773q(baseViewHolder).setLayoutResource(C0966R.C0971layout.c4n);
            } else if (i == 4) {
                BaseTimeLineItem.m122773q(baseViewHolder).setLayoutResource(C0966R.C0971layout.c4o);
            } else if (i == 5) {
                BaseTimeLineItem.m122773q(baseViewHolder).setLayoutResource(C0966R.C0971layout.c4p);
            } else {
                Log.m105920e("MiroMsg.PhotoTimeLineItem", "error viewtyoe in photo item  " + this.f279905f);
            }
            if (!baseViewHolder.f279976q) {
                baseViewHolder.f279936S = (PhotosContent) BaseTimeLineItem.m122773q(baseViewHolder).inflate();
                baseViewHolder.f279976q = true;
            }
        }
        PhotosContent photosContent = baseViewHolder.f279936S;
        photosContent.getClass();
        SnsMethodCalculate.markStartTimeMs("clearImageView", "com.tencent.mm.plugin.sns.ui.PhotosContent");
        photosContent.f277344e.clear();
        SnsMethodCalculate.markEndTimeMs("clearImageView", "com.tencent.mm.plugin.sns.ui.PhotosContent");
        for (int i2 = 0; i2 < C95713a5.f279136b[this.f279905f]; i2++) {
            TagImageView tagImageView = (TagImageView) baseViewHolder.f279936S.findViewById(C95713a5.f279140f[i2]);
            baseViewHolder.f279936S.mo132425a(tagImageView);
            tagImageView.setOnClickListener(this.f279906g.f278572f.f280385o);
            C78253a k = this.f279906g.mo132921k();
            TimelineClickListener timelineClickListener = this.f279906g.f278572f;
            k.mo108275j(tagImageView, timelineClickListener.f280395y, timelineClickListener.f280381k);
        }
        baseViewHolder.f279936S.setImageViewWidth(this.f280090q);
        SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x03da  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x043e  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0448  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x04c9  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x055a  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x03b7  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x03c8  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo81015o(com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.BaseViewHolder r40, int r41, com.tencent.p014mm.plugin.sns.p106ui.C96275w6 r42, com.tencent.p014mm.protocal.protobuf.TimeLineObject r43, int r44, com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter r45) {
        /*
            r39 = this;
            r1 = r39
            r2 = r40
            r3 = r42
            r6 = r43
            r15 = r44
            r4 = r45
            java.lang.String r14 = "fillItem"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r13)
            com.tencent.mm.plugin.sns.ui.PhotosContent r0 = r2.f279936S
            if (r0 != 0) goto L_0x001b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r13)
            return
        L_0x001b:
            java.lang.String r0 = ""
            java.lang.String r8 = "MiroMsg.PhotoTimeLineItem"
            r7 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0120
            if (r6 == 0) goto L_0x0120
            r12 = 7
            java.lang.Object[] r12 = new java.lang.Object[r12]
            java.lang.String r17 = "[image-flow]"
            r12[r5] = r17
            java.lang.String r5 = r3.f281382i
            r12[r7] = r5
            ks2.f r5 = ks2.C99181f.f290857a
            com.tencent.mm.plugin.sns.storage.SnsInfo r7 = r3.f281367a
            java.lang.String r10 = "encryptContent"
            java.lang.String r11 = "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r11)
            java.lang.String r9 = "snsInfo"
            gy3.C87412m.m108594g(r7, r9)
            java.lang.Class<f62.k0> r9 = f62.C75700k0.class
            k40.a r9 = f40.C86709a0.m107533q(r9)
            f62.k0 r9 = (f62.C75700k0) r9
            com.tencent.mm.storage.u3 r9 = r9.mo96097Ni()
            r19 = r14
            com.tencent.mm.protocal.protobuf.TimeLineObject r14 = r7.getTimeLine()
            java.lang.String r14 = r14.UserName
            com.tencent.mm.storage.z1 r9 = r9.get(r14)
            if (r9 == 0) goto L_0x0060
            java.lang.String r9 = r9.mo62909j3()
            goto L_0x0061
        L_0x0060:
            r9 = 0
        L_0x0061:
            java.lang.String r9 = r5.mo138550k(r9)
            com.tencent.mm.protocal.protobuf.TimeLineObject r14 = r7.getTimeLine()
            java.lang.String r14 = r14.ContentDesc
            java.lang.String r5 = r5.mo138550k(r14)
            java.text.SimpleDateFormat r14 = new java.text.SimpleDateFormat
            r20 = r13
            java.lang.String r13 = "dd/MM/yyyy HH:mm:ss"
            r14.<init>(r13)
            java.util.Date r13 = new java.util.Date
            int r7 = r7.getCreateTime()
            long r1 = (long) r7
            r21 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r21
            r13.<init>(r1)
            java.lang.String r1 = r14.format(r13)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            r7 = 45
            r2.append(r7)
            r2.append(r5)
            r2.append(r7)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
            r2 = 2
            r12[r2] = r1
            te3.j00 r1 = r6.ContentObj
            java.util.LinkedList<te3.kv2> r1 = r1.f298427h
            android.os.Vibrator r2 = vr2.C102236a0.f301037a
            java.lang.String r2 = "listToString"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.data.SnsUtil"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r5)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            if (r1 == 0) goto L_0x00f6
            int r9 = r1.size()
            if (r9 != 0) goto L_0x00c6
            goto L_0x00f6
        L_0x00c6:
            r9 = 0
        L_0x00c7:
            int r10 = r1.size()
            if (r9 >= r10) goto L_0x00ee
            java.lang.Object r10 = r1.get(r9)
            te3.kv2 r10 = (te3.C101804kv2) r10
            int r11 = r1.size()
            int r11 = r11 + -1
            if (r9 != r11) goto L_0x00e1
            java.lang.String r10 = r10.f298689d
            r7.append(r10)
            goto L_0x00eb
        L_0x00e1:
            java.lang.String r10 = r10.f298689d
            r7.append(r10)
            java.lang.String r10 = ";"
            r7.append(r10)
        L_0x00eb:
            int r9 = r9 + 1
            goto L_0x00c7
        L_0x00ee:
            java.lang.String r1 = r7.toString()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r5)
            goto L_0x00fa
        L_0x00f6:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r5)
            r1 = r0
        L_0x00fa:
            r2 = 3
            r12[r2] = r1
            int r1 = r3.f281376e0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5 = 4
            r12[r5] = r1
            int r1 = r39.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r13 = 5
            r12[r13] = r1
            r1 = 6
            boolean r5 = r3.f281391r
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r12[r1] = r5
            java.lang.String r1 = "[%s][id:%s][info:%s] fillItem mediaList:%s, photoItem, pos=%d, hash=%d isAd:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r1, r12)
            goto L_0x0126
        L_0x0120:
            r20 = r13
            r19 = r14
            r2 = 3
            r13 = 5
        L_0x0126:
            r1 = r40
            com.tencent.mm.plugin.sns.ui.PhotosContent r5 = r1.f279936S
            r7 = 0
            r5.setVisibility(r7)
            java.util.LinkedList r14 = new java.util.LinkedList
            r14.<init>()
            r12 = r39
            android.app.Activity r5 = r12.f279904e
            java.lang.String r7 = "window"
            java.lang.Object r5 = r5.getSystemService(r7)
            android.view.WindowManager r5 = (android.view.WindowManager) r5
            android.view.Display r5 = r5.getDefaultDisplay()
            int r5 = r5.getWidth()
            android.widget.ImageView r7 = r12.f280092s
            r11 = 8
            if (r7 == 0) goto L_0x0151
            r7.setVisibility(r11)
        L_0x0151:
            com.tencent.mm.plugin.sns.storage.SnsInfo r10 = r3.f281367a
            yn2.s0 r7 = yn2.C102882s0.f303681a
            java.lang.String r9 = r10.getLocalid()
            boolean r7 = r7.mo142590b(r9)
            if (r7 == 0) goto L_0x01e7
            android.view.View r7 = r1.f279981s0
            r9 = 2131314079(0x7f09459f, float:1.8246573E38)
            if (r7 != 0) goto L_0x0187
            android.view.ViewStub r7 = r1.f279979r0
            android.view.View r7 = r7.inflate()
            r1.f279981s0 = r7
            android.view.View r7 = r7.findViewById(r9)
            android.widget.TextView r7 = (android.widget.TextView) r7
            java.lang.Class<lr.b> r16 = p599lr.C61381b.class
            di3.d r16 = di3.C86312j.m106911c(r16)
            r2 = r16
            lr.b r2 = (p599lr.C61381b) r2
            com.tencent.mm.ui.MMActivity r13 = r4.f278575i
            java.lang.String r2 = r2.mo78553iZ(r13)
            r7.setText(r2)
        L_0x0187:
            android.view.View r2 = r1.f279981s0
            lu2.h$$a r7 = new lu2.h$$a
            r7.<init>(r10, r4)
            r2.setOnClickListener(r7)
            com.tencent.mm.plugin.sns.storage.SnsInfo r2 = r3.f281367a
            android.view.View r7 = r1.f279981s0
            android.view.View r7 = r7.findViewById(r9)
            com.tencent.mm.plugin.sns.ui.item.m$a r9 = new com.tencent.mm.plugin.sns.ui.item.m$a
            r9.<init>(r12, r2)
            zp3.C23564m.m28138h(r7, r9)
            android.view.View r2 = r1.f279981s0
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            r9 = 0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            r7.mo10233c(r13)
            java.lang.Object[] r22 = r7.mo10232b()
            java.lang.String r23 = "com/tencent/mm/plugin/sns/ui/item/PhotoTimeLineItem"
            java.lang.String r24 = "fillItem"
            java.lang.String r25 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            r21 = r2
            j20.C117292a.m165358d(r21, r22, r23, r24, r25, r26, r27, r28)
            r9 = 0
            java.lang.Object r7 = r7.mo10231a(r9)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r2.setVisibility(r7)
            java.lang.String r22 = "com/tencent/mm/plugin/sns/ui/item/PhotoTimeLineItem"
            java.lang.String r23 = "fillItem"
            java.lang.String r24 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            j20.C117292a.m165359e(r21, r22, r23, r24, r25, r26, r27)
            goto L_0x022d
        L_0x01e7:
            android.view.View r2 = r1.f279981s0
            if (r2 == 0) goto L_0x022d
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r11)
            r7.mo10233c(r9)
            java.lang.Object[] r29 = r7.mo10232b()
            java.lang.String r30 = "com/tencent/mm/plugin/sns/ui/item/PhotoTimeLineItem"
            java.lang.String r31 = "fillItem"
            java.lang.String r32 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V"
            java.lang.String r33 = "android/view/View_EXEC_"
            java.lang.String r34 = "setVisibility"
            java.lang.String r35 = "(I)V"
            r28 = r2
            j20.C117292a.m165358d(r28, r29, r30, r31, r32, r33, r34, r35)
            r9 = 0
            java.lang.Object r7 = r7.mo10231a(r9)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r2.setVisibility(r7)
            java.lang.String r29 = "com/tencent/mm/plugin/sns/ui/item/PhotoTimeLineItem"
            java.lang.String r30 = "fillItem"
            java.lang.String r31 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            j20.C117292a.m165359e(r28, r29, r30, r31, r32, r33, r34)
        L_0x022d:
            android.widget.ImageView r2 = r12.f280093t
            if (r2 == 0) goto L_0x0234
            r2.setVisibility(r11)
        L_0x0234:
            java.util.List<android.widget.ImageView> r2 = r12.f280094u
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x023c:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0251
            java.lang.Object r7 = r2.next()
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r7.setVisibility(r11)
            com.tencent.mm.plugin.sns.ui.PhotosContent r9 = r1.f279936S
            r9.removeView(r7)
            goto L_0x023c
        L_0x0251:
            boolean r2 = r3.f281391r
            if (r2 == 0) goto L_0x0285
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "ad fillItem, photoAd, pos="
            r2.append(r7)
            r13 = r41
            r2.append(r13)
            java.lang.String r7 = ", snsId="
            r2.append(r7)
            if (r6 != 0) goto L_0x026c
            goto L_0x026e
        L_0x026c:
            java.lang.String r0 = r6.f283893Id
        L_0x026e:
            r2.append(r0)
            java.lang.String r0 = ", hash="
            r2.append(r0)
            int r0 = r39.hashCode()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            goto L_0x0287
        L_0x0285:
            r13 = r41
        L_0x0287:
            boolean r0 = r3.f281391r
            if (r0 == 0) goto L_0x0466
            r7 = 2
            if (r15 != r7) goto L_0x0466
            com.tencent.mm.plugin.sns.storage.ADXml r7 = r10.getAdXml()
            if (r7 == 0) goto L_0x03aa
            float r0 = r7.adMediaDisplayWidth
            r9 = 0
            int r21 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r21 <= 0) goto L_0x03aa
            float r11 = r7.adMediaDisplayHeight
            int r9 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r9 <= 0) goto L_0x03aa
            double r2 = (double) r0
            int r0 = r7.adBasicRemWidth
            int r9 = r7.adBasicRootFontSize
            r11 = 1
            float r0 = ps2.C100894u.m132234n(r2, r11, r0, r9)
            float r2 = r7.adMediaDisplayHeight
            double r2 = (double) r2
            int r9 = r7.adBasicRemWidth
            int r13 = r7.adBasicRootFontSize
            float r2 = ps2.C100894u.m132234n(r2, r11, r9, r13)
            int r3 = r7.adMediaDisplayMode
            r9 = 50
            r11 = 2131165590(0x7f070196, float:1.7945401E38)
            if (r3 != 0) goto L_0x0323
            te3.mv2 r3 = new te3.mv2
            r3.<init>()
            r3.f298875d = r0
            r3.f298876e = r2
            android.app.Activity r2 = r12.f279904e
            int r2 = kg3.C76577a.m92151b(r2, r9)
            int r2 = r5 - r2
            android.app.Activity r13 = r12.f279904e
            android.content.res.Resources r13 = r13.getResources()
            int r13 = r13.getDimensionPixelSize(r11)
            int r2 = r2 - r13
            android.app.Activity r13 = r12.f279904e
            android.content.res.Resources r13 = r13.getResources()
            int r13 = r13.getDimensionPixelSize(r11)
            int r2 = r2 - r13
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0316
            android.app.Activity r0 = r12.f279904e
            int r0 = kg3.C76577a.m92151b(r0, r9)
            int r5 = r5 - r0
            android.app.Activity r0 = r12.f279904e
            android.content.res.Resources r0 = r0.getResources()
            int r0 = r0.getDimensionPixelSize(r11)
            int r5 = r5 - r0
            android.app.Activity r0 = r12.f279904e
            android.content.res.Resources r0 = r0.getResources()
            int r0 = r0.getDimensionPixelSize(r11)
            int r5 = r5 - r0
            float r0 = (float) r5
            r3.f298875d = r0
            float r2 = r7.adMediaDisplayHeight
            float r0 = r0 * r2
            float r2 = r7.adMediaDisplayWidth
            float r0 = r0 / r2
            int r0 = (int) r0
            float r0 = (float) r0
            r3.f298876e = r0
        L_0x0316:
            float r0 = r3.f298875d
            float r2 = r3.f298876e
            float r0 = r0 * r2
            r3.f298877f = r0
            r14.add(r3)
            goto L_0x03aa
        L_0x0323:
            r13 = 1
            if (r3 != r13) goto L_0x036a
            android.app.Activity r3 = r12.f279904e
            int r3 = kg3.C76577a.m92151b(r3, r9)
            int r5 = r5 - r3
            android.app.Activity r3 = r12.f279904e
            int r3 = kg3.C76577a.m92151b(r3, r9)
            int r5 = r5 - r3
            android.app.Activity r3 = r12.f279904e
            android.content.res.Resources r3 = r3.getResources()
            int r3 = r3.getDimensionPixelSize(r11)
            int r5 = r5 - r3
            android.app.Activity r3 = r12.f279904e
            android.content.res.Resources r3 = r3.getResources()
            int r3 = r3.getDimensionPixelSize(r11)
            int r5 = r5 - r3
            float r3 = (float) r5
            float r9 = r7.adMediaDisplayHeight
            float r9 = r9 * r3
            float r11 = r7.adMediaDisplayWidth
            float r9 = r9 / r11
            int r9 = (int) r9
            te3.mv2 r11 = new te3.mv2
            r11.<init>()
            if (r5 <= 0) goto L_0x035b
            r0 = r3
        L_0x035b:
            r11.f298875d = r0
            if (r9 <= 0) goto L_0x0360
            float r2 = (float) r9
        L_0x0360:
            r11.f298876e = r2
            float r0 = r0 * r2
            r11.f298877f = r0
            r14.add(r11)
            goto L_0x03aa
        L_0x036a:
            r13 = 2
            if (r3 != r13) goto L_0x03ab
            android.app.Activity r3 = r12.f279904e
            int r3 = kg3.C76577a.m92151b(r3, r9)
            int r5 = r5 - r3
            android.app.Activity r3 = r12.f279904e
            android.content.res.Resources r3 = r3.getResources()
            int r3 = r3.getDimensionPixelSize(r11)
            int r5 = r5 - r3
            android.app.Activity r3 = r12.f279904e
            android.content.res.Resources r3 = r3.getResources()
            int r3 = r3.getDimensionPixelSize(r11)
            int r5 = r5 - r3
            float r3 = (float) r5
            float r9 = r7.adMediaDisplayHeight
            float r9 = r9 * r3
            float r11 = r7.adMediaDisplayWidth
            float r9 = r9 / r11
            int r9 = (int) r9
            te3.mv2 r11 = new te3.mv2
            r11.<init>()
            if (r5 <= 0) goto L_0x039b
            r0 = r3
        L_0x039b:
            r11.f298875d = r0
            if (r9 <= 0) goto L_0x03a0
            float r2 = (float) r9
        L_0x03a0:
            r11.f298876e = r2
            float r0 = r0 * r2
            r11.f298877f = r0
            r14.add(r11)
            goto L_0x03ab
        L_0x03aa:
            r13 = 2
        L_0x03ab:
            if (r7 == 0) goto L_0x03cd
            boolean r0 = r7.isShowPlayIconOnCover()
            if (r0 == 0) goto L_0x03cd
            android.widget.ImageView r0 = r12.f280092s
            if (r0 != 0) goto L_0x03c4
            com.tencent.mm.plugin.sns.ui.PhotosContent r0 = r1.f279936S
            r2 = 2131314339(0x7f0946a3, float:1.82471E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r12.f280092s = r0
        L_0x03c4:
            android.widget.ImageView r0 = r12.f280092s
            if (r0 == 0) goto L_0x03cd
            r2 = 0
            r0.setVisibility(r2)
            goto L_0x03ce
        L_0x03cd:
            r2 = 0
        L_0x03ce:
            boolean r0 = vr2.C102260r.m134867g(r10, r2)
            if (r0 == 0) goto L_0x043e
            boolean r0 = vr2.C102260r.m134866f(r10)
            if (r0 != 0) goto L_0x043e
            com.tencent.mm.plugin.sns.ui.PhotosContent r0 = r1.f279936S
            java.lang.String r2 = "addAdWeAppIcon"
            r3 = r20
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            if (r0 != 0) goto L_0x03e9
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            goto L_0x0440
        L_0x03e9:
            android.widget.ImageView r5 = r12.f280093t     // Catch:{ all -> 0x0432 }
            if (r5 != 0) goto L_0x03f6
            android.widget.ImageView r5 = new android.widget.ImageView     // Catch:{ all -> 0x0432 }
            android.app.Activity r9 = r12.f279904e     // Catch:{ all -> 0x0432 }
            r5.<init>(r9)     // Catch:{ all -> 0x0432 }
            r12.f280093t = r5     // Catch:{ all -> 0x0432 }
        L_0x03f6:
            android.widget.ImageView r5 = r12.f280093t     // Catch:{ all -> 0x0432 }
            r0.removeView(r5)     // Catch:{ all -> 0x0432 }
            android.app.Activity r5 = r12.f279904e     // Catch:{ all -> 0x0432 }
            r9 = 24
            int r5 = kg3.C76577a.m92151b(r5, r9)     // Catch:{ all -> 0x0432 }
            android.app.Activity r9 = r12.f279904e     // Catch:{ all -> 0x0432 }
            r11 = 4
            int r9 = kg3.C76577a.m92151b(r9, r11)     // Catch:{ all -> 0x0432 }
            android.widget.FrameLayout$LayoutParams r11 = new android.widget.FrameLayout$LayoutParams     // Catch:{ all -> 0x0432 }
            r11.<init>(r5, r5)     // Catch:{ all -> 0x0432 }
            r11.leftMargin = r9     // Catch:{ all -> 0x0432 }
            r11.topMargin = r9     // Catch:{ all -> 0x0432 }
            android.widget.ImageView r5 = r12.f280093t     // Catch:{ all -> 0x0432 }
            android.app.Activity r9 = r12.f279904e     // Catch:{ all -> 0x0432 }
            r13 = 2131235646(0x7f08133e, float:1.8087492E38)
            android.graphics.drawable.Drawable r9 = kg3.C76577a.m92158i(r9, r13)     // Catch:{ all -> 0x0432 }
            r5.setImageDrawable(r9)     // Catch:{ all -> 0x0432 }
            android.widget.ImageView r5 = r12.f280093t     // Catch:{ all -> 0x0432 }
            r5.setLayoutParams(r11)     // Catch:{ all -> 0x0432 }
            android.widget.ImageView r5 = r12.f280093t     // Catch:{ all -> 0x0432 }
            r9 = 0
            r5.setVisibility(r9)     // Catch:{ all -> 0x0432 }
            android.widget.ImageView r5 = r12.f280093t     // Catch:{ all -> 0x0432 }
            r0.addView(r5)     // Catch:{ all -> 0x0432 }
            goto L_0x043a
        L_0x0432:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
        L_0x043a:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            goto L_0x0440
        L_0x043e:
            r3 = r20
        L_0x0440:
            java.lang.String r0 = r7.adMediaIconUrl
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0468
            com.tencent.mm.plugin.sns.ui.PhotosContent r0 = r1.f279936S
            r2 = 0
            com.tencent.mm.plugin.sns.ui.TagImageView r5 = r0.mo132426b(r2)
            java.lang.String r9 = r7.adMediaIconUrl
            r25 = 0
            r26 = 41
            r27 = 0
            com.tencent.mm.plugin.sns.ui.item.m$b r11 = new com.tencent.mm.plugin.sns.ui.item.m$b
            r11.<init>(r0, r7, r5)
            java.lang.String r23 = "adId"
            r24 = r9
            r28 = r11
            ps2.C100891r.m132207b(r23, r24, r25, r26, r27, r28)
            goto L_0x0469
        L_0x0466:
            r3 = r20
        L_0x0468:
            r2 = 0
        L_0x0469:
            com.tencent.mm.plugin.sns.ui.a5 r0 = r4.f278577k
            com.tencent.mm.plugin.sns.ui.PhotosContent r5 = r1.f279936S
            r13 = r42
            java.lang.String r7 = r13.f281381h
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r4 = r4.f278572f
            android.view.View$OnClickListener r9 = r4.f280385o
            android.app.Activity r4 = r12.f279904e
            int r17 = r4.hashCode()
            boolean r4 = r13.f281391r
            boolean r2 = r12.f279907h
            com.tencent.mm.storage.o3 r11 = com.tencent.p014mm.storage.C96983o3.m124651c()
            r23 = r3
            int r3 = r6.CreateTime
            r11.f284145b = r3
            java.lang.String r3 = r13.f281382i
            r24 = r4
            r4 = r0
            r6 = r43
            r36 = r8
            r8 = r9
            r0 = 0
            r9 = r0
            r43 = r10
            r10 = r17
            r0 = r11
            r11 = r44
            r12 = r41
            r37 = r23
            r13 = r24
            r16 = r14
            r38 = r19
            r14 = r2
            r2 = r15
            r15 = r0
            r17 = r3
            r18 = r43
            r4.mo133159d(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            com.tencent.mm.plugin.sns.ui.PhotosContent r0 = r1.f279936S
            r3 = 0
            com.tencent.mm.plugin.sns.ui.TagImageView r0 = r0.mo132426b(r3)
            com.tencent.mm.ui.widget.QImageView$a r4 = com.tencent.p014mm.p136ui.widget.QImageView.C97274a.CENTER_CROP
            r0.setScaleType(r4)
            java.lang.String r4 = "checkShowStatusIcon"
            r5 = r37
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            r6 = r42
            boolean r0 = r6.f281391r
            if (r0 == 0) goto L_0x055a
            r7 = r39
            int r0 = r7.f279905f
            r8 = 2
            if (r0 != r8) goto L_0x0555
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r6.f281367a     // Catch:{ all -> 0x0530 }
            com.tencent.mm.plugin.sns.storage.ADXml r0 = r0.getAdXml()     // Catch:{ all -> 0x0530 }
            if (r0 == 0) goto L_0x0555
            boolean r0 = r0.isShowPlayIconOnCover()     // Catch:{ all -> 0x0530 }
            if (r0 == 0) goto L_0x0555
            android.widget.ImageView r0 = r7.f280092s     // Catch:{ all -> 0x0530 }
            if (r0 != 0) goto L_0x04ef
            com.tencent.mm.plugin.sns.ui.PhotosContent r0 = r1.f279936S     // Catch:{ all -> 0x0530 }
            r9 = 2131314339(0x7f0946a3, float:1.82471E38)
            android.view.View r0 = r0.findViewById(r9)     // Catch:{ all -> 0x0530 }
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch:{ all -> 0x0530 }
            r7.f280092s = r0     // Catch:{ all -> 0x0530 }
        L_0x04ef:
            android.widget.ImageView r0 = r7.f280092s     // Catch:{ all -> 0x0530 }
            if (r0 == 0) goto L_0x0555
            r0.setVisibility(r3)     // Catch:{ all -> 0x0530 }
            com.tencent.mm.plugin.sns.ui.PhotosContent r0 = r1.f279936S     // Catch:{ all -> 0x0530 }
            com.tencent.mm.plugin.sns.ui.TagImageView r0 = r0.mo132426b(r3)     // Catch:{ all -> 0x0530 }
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()     // Catch:{ all -> 0x0530 }
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0     // Catch:{ all -> 0x0530 }
            android.widget.ImageView r9 = r7.f280092s     // Catch:{ all -> 0x0530 }
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()     // Catch:{ all -> 0x0530 }
            android.widget.FrameLayout$LayoutParams r9 = (android.widget.FrameLayout.LayoutParams) r9     // Catch:{ all -> 0x0530 }
            int r10 = r0.width     // Catch:{ all -> 0x0530 }
            int r10 = r10 / r8
            int r11 = r9.width     // Catch:{ all -> 0x0530 }
            int r11 = r11 / r8
            int r10 = r10 - r11
            int r11 = r0.leftMargin     // Catch:{ all -> 0x0530 }
            int r10 = r10 + r11
            int r11 = r0.height     // Catch:{ all -> 0x0530 }
            int r11 = r11 / r8
            int r12 = r9.height     // Catch:{ all -> 0x0530 }
            int r12 = r12 / r8
            int r11 = r11 - r12
            int r0 = r0.topMargin     // Catch:{ all -> 0x0530 }
            int r11 = r11 + r0
            int r0 = r9.leftMargin     // Catch:{ all -> 0x0530 }
            if (r10 != r0) goto L_0x0526
            int r0 = r9.topMargin     // Catch:{ all -> 0x0530 }
            if (r11 == r0) goto L_0x0555
        L_0x0526:
            r9.leftMargin = r10     // Catch:{ all -> 0x0530 }
            r9.topMargin = r11     // Catch:{ all -> 0x0530 }
            android.widget.ImageView r0 = r7.f280092s     // Catch:{ all -> 0x0530 }
            r0.setLayoutParams(r9)     // Catch:{ all -> 0x0530 }
            goto L_0x0555
        L_0x0530:
            r0 = move-exception
            android.widget.ImageView r8 = r7.f280092s
            r9 = 8
            if (r8 == 0) goto L_0x053a
            r8.setVisibility(r9)
        L_0x053a:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "checkShowStatusIcon exp="
            r8.append(r10)
            java.lang.String r0 = r0.toString()
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            r8 = r36
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            goto L_0x0560
        L_0x0555:
            r8 = r36
            r9 = 8
            goto L_0x0560
        L_0x055a:
            r9 = 8
            r7 = r39
            r8 = r36
        L_0x0560:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            boolean r0 = r6.f281391r
            if (r0 == 0) goto L_0x0620
            r4 = 3
            if (r2 == r4) goto L_0x0570
            r4 = 4
            if (r2 == r4) goto L_0x0570
            r4 = 5
            if (r2 != r4) goto L_0x0620
        L_0x0570:
            r4 = r43
            boolean r0 = vr2.C102260r.m134867g(r4, r3)
            if (r0 == 0) goto L_0x0620
            boolean r0 = vr2.C102260r.m134866f(r4)
            if (r0 != 0) goto L_0x0620
            int[] r0 = com.tencent.p014mm.plugin.sns.p106ui.C95713a5.f279136b
            r0 = r0[r2]
            com.tencent.mm.plugin.sns.ui.PhotosContent r1 = r1.f279936S
            java.lang.String r2 = "addAdWeAppIconForPics"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r5)
            r4 = 1
            if (r1 == 0) goto L_0x0616
            if (r0 > r4) goto L_0x0590
            goto L_0x0616
        L_0x0590:
            android.app.Activity r10 = r7.f279904e     // Catch:{ all -> 0x060a }
            r11 = 20
            int r10 = kg3.C76577a.m92151b(r10, r11)     // Catch:{ all -> 0x060a }
            r11 = 0
        L_0x0599:
            if (r11 >= r0) goto L_0x0612
            java.util.List<android.widget.ImageView> r12 = r7.f280094u     // Catch:{ all -> 0x060a }
            java.util.ArrayList r12 = (java.util.ArrayList) r12     // Catch:{ all -> 0x060a }
            int r12 = r12.size()     // Catch:{ all -> 0x060a }
            if (r12 >= r0) goto L_0x05e3
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x060a }
            r12.<init>()     // Catch:{ all -> 0x060a }
            java.lang.String r13 = "current index = "
            r12.append(r13)     // Catch:{ all -> 0x060a }
            r12.append(r11)     // Catch:{ all -> 0x060a }
            java.lang.String r13 = ", weAppIcons current size = "
            r12.append(r13)     // Catch:{ all -> 0x060a }
            java.util.List<android.widget.ImageView> r13 = r7.f280094u     // Catch:{ all -> 0x060a }
            java.util.ArrayList r13 = (java.util.ArrayList) r13     // Catch:{ all -> 0x060a }
            int r13 = r13.size()     // Catch:{ all -> 0x060a }
            r12.append(r13)     // Catch:{ all -> 0x060a }
            java.lang.String r13 = ", total imgNums = "
            r12.append(r13)     // Catch:{ all -> 0x060a }
            r12.append(r0)     // Catch:{ all -> 0x060a }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x060a }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r12)     // Catch:{ all -> 0x060a }
            android.app.Activity r12 = r7.f279904e     // Catch:{ all -> 0x060a }
            android.widget.ImageView r12 = jq2.C46568m.m51894a(r12, r1, r11, r10)     // Catch:{ all -> 0x060a }
            if (r12 == 0) goto L_0x05e3
            r12.setVisibility(r9)     // Catch:{ all -> 0x060a }
            java.util.List<android.widget.ImageView> r13 = r7.f280094u     // Catch:{ all -> 0x060a }
            java.util.ArrayList r13 = (java.util.ArrayList) r13     // Catch:{ all -> 0x060a }
            r13.add(r12)     // Catch:{ all -> 0x060a }
        L_0x05e3:
            com.tencent.mm.plugin.sns.ui.TagImageView r12 = r1.mo132426b(r11)     // Catch:{ all -> 0x060a }
            int r12 = r12.getVisibility()     // Catch:{ all -> 0x060a }
            if (r12 != r9) goto L_0x05ee
            goto L_0x0607
        L_0x05ee:
            java.util.List<android.widget.ImageView> r12 = r7.f280094u     // Catch:{ all -> 0x060a }
            java.util.ArrayList r12 = (java.util.ArrayList) r12     // Catch:{ all -> 0x060a }
            java.lang.Object r12 = r12.get(r11)     // Catch:{ all -> 0x060a }
            android.widget.ImageView r12 = (android.widget.ImageView) r12     // Catch:{ all -> 0x060a }
            if (r12 == 0) goto L_0x0601
            r1.addView(r12)     // Catch:{ all -> 0x060a }
            r12.setVisibility(r3)     // Catch:{ all -> 0x060a }
            goto L_0x0607
        L_0x0601:
            java.lang.String r12 = "weAppIcons get weAppIv is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r12)     // Catch:{ all -> 0x060a }
        L_0x0607:
            int r11 = r11 + 1
            goto L_0x0599
        L_0x060a:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
        L_0x0612:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r5)
            goto L_0x0621
        L_0x0616:
            java.lang.String r0 = "photosContent == null or imgNums <= 1"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r5)
            goto L_0x0621
        L_0x0620:
            r4 = 1
        L_0x0621:
            r7.mo133391g(r6, r4)
            r1 = r38
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.item.C95929m.mo81015o(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder, int, com.tencent.mm.plugin.sns.ui.w6, com.tencent.mm.protocal.protobuf.TimeLineObject, int, com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter):void");
    }

    /* renamed from: t */
    public String mo81016t() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
        return "PhotoTimeLineItem";
    }
}
