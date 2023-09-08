package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.util.SparseArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import ck3.C67391b;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.gallery.C73703d;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.widget.MMPinProgressBtn;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.p136ui.widget.progress.RoundProgressBtn;
import com.tencent.p014mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import di3.C86312j;
import hd0.C98408n0;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import p682rz.C101489t;
import p682rz.C101491u;
import vd3.C78404m;
import zj3.C79345d;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.m7 */
public class C74123m7 extends C74023i.C74026c {

    /* renamed from: y */
    public static SparseArray<String> f217553y = new SparseArray<>();

    /* renamed from: z */
    public static Map<String, WeakReference<C74123m7>> f217554z = new HashMap();

    /* renamed from: b */
    public ImageView f217555b;

    /* renamed from: c */
    public TextView f217556c;

    /* renamed from: d */
    public TextView f217557d;

    /* renamed from: e */
    public ImageView f217558e;

    /* renamed from: f */
    public ImageView f217559f;

    /* renamed from: g */
    public ImageView f217560g;

    /* renamed from: h */
    public MMPinProgressBtn f217561h;

    /* renamed from: i */
    public View f217562i;

    /* renamed from: j */
    public TextView f217563j;

    /* renamed from: k */
    public ImageView f217564k;

    /* renamed from: l */
    public View f217565l;

    /* renamed from: m */
    public LinearLayout f217566m;

    /* renamed from: n */
    public ImageView f217567n;

    /* renamed from: o */
    public ImageView f217568o;

    /* renamed from: p */
    public ProgressBar f217569p;

    /* renamed from: q */
    public View f217570q;

    /* renamed from: r */
    public ProgressBar f217571r;

    /* renamed from: s */
    public RoundProgressBtn f217572s;

    /* renamed from: t */
    public TextView f217573t;

    /* renamed from: u */
    public WeImageView f217574u;

    /* renamed from: v */
    public View f217575v;

    /* renamed from: w */
    public RoundProgressBtn f217576w;

    /* renamed from: x */
    public View f217577x;

    /* JADX WARNING: type inference failed for: r2v42, types: [java.lang.CharSequence, android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r2v44 */
    /* JADX WARNING: type inference failed for: r2v45 */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0595  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0928  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0956  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0309  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x030f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m88220b(com.tencent.p014mm.p136ui.chatting.viewitems.C74023i r27, com.tencent.p014mm.p136ui.chatting.viewitems.C74123m7 r28, com.tencent.p014mm.storage.C72963f4 r29, boolean r30, uj3.C78208e r31, ck3.C67391b r32, int r33, android.view.View.OnClickListener r34, android.view.View.OnLongClickListener r35) {
        /*
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r32
            r6 = r33
            r7 = r34
            java.lang.Class<hw.e> r8 = p556hw.C76247e.class
            java.lang.Class<gt.k> r9 = p158gt.C98201k.class
            java.lang.Class<rz.u> r10 = p682rz.C101491u.class
            android.view.View r11 = r1.convertView
            com.tencent.mm.ui.chatting.viewitems.m7$$f r12 = new com.tencent.mm.ui.chatting.viewitems.m7$$f
            r12.<init>(r2, r3)
            zp3.C23564m.m28138h(r11, r12)
            android.util.SparseArray<java.lang.String> r11 = f217553y
            int r12 = r28.hashCode()
            java.lang.Object r11 = r11.get(r12)
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L_0x0035
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<com.tencent.mm.ui.chatting.viewitems.m7>> r12 = f217554z
            java.util.HashMap r12 = (java.util.HashMap) r12
            r12.remove(r11)
        L_0x0035:
            android.util.SparseArray<java.lang.String> r11 = f217553y
            int r12 = r28.hashCode()
            java.lang.String r13 = r29.mo108765s2()
            r11.put(r12, r13)
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<com.tencent.mm.ui.chatting.viewitems.m7>> r11 = f217554z
            java.lang.String r12 = r29.mo108765s2()
            java.lang.ref.WeakReference r13 = new java.lang.ref.WeakReference
            r13.<init>(r1)
            java.util.HashMap r11 = (java.util.HashMap) r11
            r11.put(r12, r13)
            di3.d r11 = di3.C86312j.m106911c(r10)
            rz.u r11 = (p682rz.C101491u) r11
            java.lang.String r12 = r29.mo108765s2()
            hd0.n0 r11 = r11.mo140806Zd(r12)
            if (r11 != 0) goto L_0x0067
            hd0.n0 r11 = new hd0.n0
            r11.<init>()
        L_0x0067:
            java.lang.String r12 = "MicroMsg.VideoItemHoder"
            java.lang.String r13 = "alvinluo fillingVideo %s"
            r14 = 1
            java.lang.Object[] r15 = new java.lang.Object[r14]
            java.lang.String r16 = r11.mo137705i()
            r14 = 0
            r15[r14] = r16
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r13, r15)
            java.lang.Class<rz.s> r12 = p682rz.C101488s.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            rz.s r12 = (p682rz.C101488s) r12
            rz.t r12 = r12.Kj0()
            java.lang.String r13 = r29.mo108765s2()
            hd0.o0 r12 = (hd0.C98410o0) r12
            java.lang.String r12 = r12.mo137729r(r13)
            boolean r13 = r29.mo100983V3()
            if (r13 == 0) goto L_0x0156
            java.lang.String r0 = r29.getContent()
            java.lang.String r12 = r29.mo108775z2()
            com.tencent.mm.message.l$b r0 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r0, r12)
            java.lang.String r12 = r0.f195646y
            java.lang.String r12 = p243tn.C14050a.m13405b(r12)
            di3.d r9 = di3.C86312j.m106911c(r9)
            gt.k r9 = (p158gt.C98201k) r9
            gt.m r9 = r9.mo137277xi()
            android.app.Activity r13 = r32.mo91565f()
            float r13 = kg3.C76577a.m92156g(r13)
            android.app.Activity r15 = r32.mo91565f()
            com.tencent.mm.modelimage.m r9 = (com.tencent.p014mm.modelimage.C92839m) r9
            android.graphics.Bitmap r9 = r9.fq0(r12, r13, r15, r6)
            if (r9 != 0) goto L_0x00e8
            java.lang.ref.WeakReference r13 = new java.lang.ref.WeakReference
            r13.<init>(r5)
            gc0.a r15 = gc0.C20828a.m22825b()
            java.lang.String r14 = r0.f195646y
            r27 = r9
            hc0.c$b r9 = new hc0.c$b
            r9.<init>()
            r9.f59350f = r12
            r12 = 1
            r9.f59346b = r12
            hc0.c r9 = r9.mo32666a()
            com.tencent.mm.ui.chatting.viewitems.n7 r12 = new com.tencent.mm.ui.chatting.viewitems.n7
            r12.<init>(r13)
            r15.mo32515d(r14, r9, r12)
            goto L_0x00ea
        L_0x00e8:
            r27 = r9
        L_0x00ea:
            java.lang.Class<com.tencent.mm.message.f> r9 = com.tencent.p014mm.message.C68065f.class
            com.tencent.mm.message.g r9 = r0.mo93555w(r9)
            com.tencent.mm.message.f r9 = (com.tencent.p014mm.message.C68065f) r9
            if (r9 == 0) goto L_0x00fd
            s90.n r9 = r9.f195427l
            if (r9 == 0) goto L_0x00fd
            int r12 = r9.f133371i
            r11.f288566m = r12
            goto L_0x00fe
        L_0x00fd:
            r9 = 0
        L_0x00fe:
            android.view.View r12 = r1.f217565l
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r14 = k20.C60958c.f173611a
            r14 = 0
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            r13.mo10233c(r15)
            java.lang.Object[] r19 = r13.mo10232b()
            java.lang.String r20 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder"
            java.lang.String r21 = "parseVideo"
            java.lang.String r22 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder;Lcom/tencent/mm/storage/MsgInfo;ZLcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;ILandroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r12
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r14 = 0
            java.lang.Object r13 = r13.mo10231a(r14)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r12.setVisibility(r13)
            java.lang.String r19 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder"
            java.lang.String r20 = "parseVideo"
            java.lang.String r21 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder;Lcom/tencent/mm/storage/MsgInfo;ZLcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;ILandroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            android.app.Activity r12 = r32.mo91565f()
            android.widget.ImageView r13 = r1.f217564k
            android.widget.TextView r14 = r1.f217563j
            com.tencent.p014mm.p136ui.chatting.viewitems.C6805l4.m7091a(r12, r0, r13, r14)
            m88222d(r5, r1, r3)
            r0 = r9
            r26 = r10
            r9 = r27
            goto L_0x034e
        L_0x0156:
            android.view.View r13 = r1.f217565l
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r15 = k20.C60958c.f173611a
            r15 = 8
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)
            r14.mo10233c(r7)
            java.lang.Object[] r19 = r14.mo10232b()
            java.lang.String r20 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder"
            java.lang.String r21 = "parseVideo"
            java.lang.String r22 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder;Lcom/tencent/mm/storage/MsgInfo;ZLcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;ILandroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r13
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r7 = 0
            java.lang.Object r14 = r14.mo10231a(r7)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r7 = r14.intValue()
            r13.setVisibility(r7)
            java.lang.String r19 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder"
            java.lang.String r20 = "parseVideo"
            java.lang.String r21 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder;Lcom/tencent/mm/storage/MsgInfo;ZLcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;ILandroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            java.lang.String r7 = r11.mo137705i()
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 == 0) goto L_0x01b1
            java.lang.String r7 = r11.f288543K
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x01ad
            goto L_0x01b1
        L_0x01ad:
            r26 = r10
            goto L_0x02fe
        L_0x01b1:
            java.lang.Class<ym.l> r7 = p763ym.C79138l.class
            java.lang.String r13 = r11.mo137705i()
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r14 == 0) goto L_0x01c3
            java.lang.String r13 = r11.f288543K
            java.lang.String r13 = com.tencent.p014mm.modelimage.C80999a.m98902b(r13)
        L_0x01c3:
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r14 == 0) goto L_0x020c
            android.view.View r0 = r1.f217565l
            k20.a r7 = new k20.a
            r7.<init>()
            r13 = 8
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            r7.mo10233c(r14)
            java.lang.Object[] r19 = r7.mo10232b()
            java.lang.String r20 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder"
            java.lang.String r21 = "fillVideoMsgSourceLayout"
            java.lang.String r22 = "(Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/modelvideo/VideoInfo;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Z)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r0
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r13 = 0
            java.lang.Object r7 = r7.mo10231a(r13)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.setVisibility(r7)
            java.lang.String r19 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder"
            java.lang.String r20 = "fillVideoMsgSourceLayout"
            java.lang.String r21 = "(Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/modelvideo/VideoInfo;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Z)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x01ad
        L_0x020c:
            r14 = 38
            com.tencent.mm.message.l$b r13 = com.tencent.p014mm.message.C68070l.C68072b.m80423v(r14, r13)
            if (r13 == 0) goto L_0x02ba
            java.lang.String r14 = r13.f195562d
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r14 != 0) goto L_0x02ba
            java.lang.String r14 = r13.f195562d
            di3.d r15 = di3.C86312j.m106911c(r7)
            ym.l r15 = (p763ym.C79138l) r15
            int r4 = r13.f195480E
            com.tencent.mm.pluginsdk.model.app.j r4 = r15.mo74003UV(r14, r4)
            if (r4 == 0) goto L_0x022f
            r0.mo103095k(r5, r13, r2)
        L_0x022f:
            if (r4 == 0) goto L_0x0243
            java.lang.String r14 = r4.field_appName
            if (r14 == 0) goto L_0x0243
            java.lang.String r14 = r14.trim()
            int r14 = r14.length()
            if (r14 > 0) goto L_0x0240
            goto L_0x0243
        L_0x0240:
            java.lang.String r14 = r4.field_appName
            goto L_0x0245
        L_0x0243:
            java.lang.String r14 = r13.f195484F
        L_0x0245:
            boolean r15 = r0.mo103084W(r14)
            if (r15 == 0) goto L_0x01ad
            android.view.View r15 = r1.f217565l
            k20.a r2 = new k20.a
            r2.<init>()
            r26 = r10
            r17 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r17)
            r2.mo10233c(r10)
            java.lang.Object[] r19 = r2.mo10232b()
            java.lang.String r20 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder"
            java.lang.String r21 = "fillVideoMsgSourceLayout"
            java.lang.String r22 = "(Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/modelvideo/VideoInfo;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Z)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r15
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r10 = 0
            java.lang.Object r2 = r2.mo10231a(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r15.setVisibility(r2)
            java.lang.String r19 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder"
            java.lang.String r20 = "fillVideoMsgSourceLayout"
            java.lang.String r21 = "(Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/modelvideo/VideoInfo;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Z)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            di3.d r2 = di3.C86312j.m106911c(r7)
            ym.l r2 = (p763ym.C79138l) r2
            android.app.Activity r7 = r32.mo91565f()
            java.lang.String r2 = r2.mo74019xG(r7, r4, r14)
            android.widget.TextView r4 = r1.f217563j
            r4.setText(r2)
            android.widget.TextView r2 = r1.f217563j
            r4 = 0
            r2.setCompoundDrawables(r4, r4, r4, r4)
            android.widget.TextView r2 = r1.f217563j
            java.lang.String r4 = r13.f195562d
            r0.mo103076J(r5, r2, r4)
            android.widget.ImageView r2 = r1.f217564k
            java.lang.String r4 = r13.f195562d
            r0.mo103078L(r5, r2, r4)
            m88222d(r5, r1, r3)
            goto L_0x02fe
        L_0x02ba:
            r26 = r10
            android.view.View r0 = r1.f217565l
            k20.a r2 = new k20.a
            r2.<init>()
            r4 = 8
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r2.mo10233c(r7)
            java.lang.Object[] r19 = r2.mo10232b()
            java.lang.String r20 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder"
            java.lang.String r21 = "fillVideoMsgSourceLayout"
            java.lang.String r22 = "(Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/modelvideo/VideoInfo;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Z)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r0
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r4 = 0
            java.lang.Object r2 = r2.mo10231a(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r19 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder"
            java.lang.String r20 = "fillVideoMsgSourceLayout"
            java.lang.String r21 = "(Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/modelvideo/VideoInfo;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Z)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
        L_0x02fe:
            boolean r0 = eb0.C75569c4.m90663I(r29)
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L_0x0309
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x030b
        L_0x0309:
            float r0 = eb0.C75569c4.f222001d
        L_0x030b:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x032f
            com.tencent.mm.autogen.mmdata.rpt.SpamMediaToEmojiOPStruct r2 = new com.tencent.mm.autogen.mmdata.rpt.SpamMediaToEmojiOPStruct
            r2.<init>()
            long r13 = r29.mo108774y2()
            r2.f194459d = r13
            int r4 = r29.getType()
            long r13 = (long) r4
            r2.f194460e = r13
            int r4 = eb0.C75569c4.m90678k(r29)
            long r13 = (long) r4
            r2.f194461f = r13
            r13 = 1
            r2.f194462g = r13
            r2.mo86054n()
        L_0x032f:
            di3.d r2 = di3.C86312j.m106911c(r9)
            gt.k r2 = (p158gt.C98201k) r2
            gt.m r2 = r2.mo137277xi()
            android.app.Activity r4 = r32.mo91565f()
            float r4 = kg3.C76577a.m92156g(r4)
            float r4 = r4 * r0
            android.app.Activity r0 = r32.mo91565f()
            com.tencent.mm.modelimage.m r2 = (com.tencent.p014mm.modelimage.C92839m) r2
            android.graphics.Bitmap r9 = r2.fq0(r12, r4, r0, r6)
            r0 = 0
        L_0x034e:
            android.widget.ImageView r2 = r1.f217567n
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r7 = 0
            r4.<init>(r7, r7)
            r2.setLayoutParams(r4)
            if (r9 != 0) goto L_0x03fc
            android.app.Activity r2 = r32.mo91565f()
            r4 = 85
            int r2 = kg3.C76577a.m92151b(r2, r4)
            android.app.Activity r4 = r32.mo91565f()
            r7 = 2131165216(0x7f070020, float:1.7944643E38)
            int r4 = kg3.C76577a.m92157h(r4, r7)
            boolean r7 = r29.mo100983V3()
            if (r7 == 0) goto L_0x03a5
            if (r0 == 0) goto L_0x03a5
            int r7 = r0.f133372j
            if (r7 <= 0) goto L_0x03a5
            int r9 = r0.f133373n
            if (r9 <= 0) goto L_0x03a5
            r2 = 150(0x96, float:2.1E-43)
            if (r7 < r9) goto L_0x0392
            android.app.Activity r4 = r32.mo91565f()
            int r2 = kg3.C76577a.m92151b(r4, r2)
            int r4 = r0.f133373n
            float r4 = (float) r4
            int r0 = r0.f133372j
            goto L_0x039f
        L_0x0392:
            android.app.Activity r4 = r32.mo91565f()
            int r2 = kg3.C76577a.m92151b(r4, r2)
            int r4 = r0.f133372j
            float r4 = (float) r4
            int r0 = r0.f133373n
        L_0x039f:
            float r0 = (float) r0
            float r4 = r4 / r0
            float r0 = (float) r2
            float r4 = r4 * r0
            int r4 = (int) r4
        L_0x03a5:
            android.app.Activity r0 = r32.mo91565f()
            android.content.res.Resources r0 = r0.getResources()
            r7 = 2131100893(0x7f0604dd, float:1.781418E38)
            int r0 = r0.getColor(r7)
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createColorBitmap(r0, r2, r4)
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createMaskImage(r0, r6, r2, r4)
            eb0.c r7 = eb0.C97625j3.m125812b()
            boolean r7 = r7.mo105883I()
            if (r7 != 0) goto L_0x03e1
            android.widget.ImageView r6 = r1.f217555b
            android.app.Activity r7 = r32.mo91565f()
            r9 = 2131757107(0x7f100833, float:1.914514E38)
            android.graphics.drawable.Drawable r7 = kg3.C76577a.m92158i(r7, r9)
            r6.setImageDrawable(r7)
            android.widget.ImageView r6 = r1.f217555b
            android.graphics.drawable.BitmapDrawable r7 = new android.graphics.drawable.BitmapDrawable
            r7.<init>(r0)
            r6.setBackground(r7)
            goto L_0x03ea
        L_0x03e1:
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createMaskImage(r0, r6, r2, r4)
            android.widget.ImageView r6 = r1.f217555b
            r6.setImageBitmap(r0)
        L_0x03ea:
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r2, r4)
            android.widget.ImageView r2 = r1.f217567n
            r2.setLayoutParams(r0)
            android.view.View r2 = r1.f217570q
            if (r2 == 0) goto L_0x041a
            r2.setLayoutParams(r0)
            goto L_0x041a
        L_0x03fc:
            android.widget.ImageView r0 = r1.f217555b
            r0.setImageBitmap(r9)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            int r2 = r9.getWidth()
            int r4 = r9.getHeight()
            r0.<init>(r2, r4)
            android.widget.ImageView r2 = r1.f217567n
            r2.setLayoutParams(r0)
            android.view.View r2 = r1.f217570q
            if (r2 == 0) goto L_0x041a
            r2.setLayoutParams(r0)
        L_0x041a:
            long r6 = eb0.C31543z5.m39451a()
            long r9 = r29.getCreateTime()
            long r6 = r6 - r9
            r9 = 432000000(0x19bfcc00, double:2.13436359E-315)
            r0 = 5
            int r2 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x0433
            int r2 = r29.getStatus()
            if (r2 != r0) goto L_0x0433
            r12 = 1
            goto L_0x0434
        L_0x0433:
            r12 = 0
        L_0x0434:
            r2 = 198(0xc6, float:2.77E-43)
            r4 = 2
            r6 = 2131756957(0x7f10079d, float:1.9144836E38)
            r7 = 6
            if (r3 == 0) goto L_0x05e0
            android.widget.TextView r0 = r1.f217556c
            int r3 = r11.f288559f
            long r9 = (long) r3
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.getSizeKB(r9)
            r0.setText(r3)
            android.widget.TextView r0 = r1.f217557d
            int r3 = r11.f288566m
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.formatSecToMin(r3)
            r0.setText(r3)
            int r0 = r11.f288562i
            java.lang.String r3 = "MicroMsg.VideoItemHoder"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "parseVideo from video status : "
            r9.append(r10)
            r9.append(r0)
            java.lang.String r10 = " info : "
            r9.append(r10)
            java.lang.String r10 = r11.mo137700d()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r9)
            r3 = 199(0xc7, float:2.79E-43)
            if (r0 != r3) goto L_0x048a
            android.widget.ImageView r3 = r1.f217558e
            android.app.Activity r9 = r32.mo91565f()
            android.graphics.drawable.Drawable r6 = kg3.C76577a.m92158i(r9, r6)
            r3.setImageDrawable(r6)
            goto L_0x049e
        L_0x048a:
            android.widget.ImageView r3 = r1.f217558e
            android.app.Activity r9 = r32.mo91565f()
            android.graphics.drawable.Drawable r6 = kg3.C76577a.m92158i(r9, r6)
            r3.setImageDrawable(r6)
            android.widget.TextView r3 = r1.f217556c
            r6 = 8
            r3.setVisibility(r6)
        L_0x049e:
            r3 = 112(0x70, float:1.57E-43)
            if (r0 == r3) goto L_0x050a
            r3 = 122(0x7a, float:1.71E-43)
            if (r0 == r3) goto L_0x050a
            r3 = 120(0x78, float:1.68E-43)
            if (r0 != r3) goto L_0x04ab
            goto L_0x050a
        L_0x04ab:
            r3 = 113(0x71, float:1.58E-43)
            if (r0 == r3) goto L_0x04d8
            if (r0 == r2) goto L_0x04d8
            boolean r0 = r11.mo137712p()
            if (r0 == 0) goto L_0x04b8
            goto L_0x04d8
        L_0x04b8:
            android.widget.ImageView r0 = r1.f217560g
            r2 = 8
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r1.f217559f
            r0.setVisibility(r2)
            com.tencent.mm.ui.widget.MMPinProgressBtn r0 = r1.f217561h
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r1.f217558e
            r2 = 0
            r0.setVisibility(r2)
            java.lang.String r0 = "MicroMsg.VideoItemHoder"
            java.lang.String r2 = "status gone"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r0, r2)
            goto L_0x0542
        L_0x04d8:
            di3.d r0 = di3.C86312j.m106911c(r8)
            hw.e r0 = (p556hw.C76247e) r0
            long r2 = r29.getMsgId()
            boolean r0 = r0.mo106502wR(r2)
            if (r0 != 0) goto L_0x04ef
            android.widget.ImageView r0 = r1.f217559f
            r2 = 0
            r0.setVisibility(r2)
            goto L_0x04f0
        L_0x04ef:
            r2 = 0
        L_0x04f0:
            android.widget.ImageView r0 = r1.f217560g
            r3 = 8
            r0.setVisibility(r3)
            com.tencent.mm.ui.widget.MMPinProgressBtn r0 = r1.f217561h
            r0.setVisibility(r3)
            android.widget.ImageView r0 = r1.f217558e
            r0.setVisibility(r2)
            java.lang.String r0 = "MicroMsg.VideoItemHoder"
            java.lang.String r2 = "status pause"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r0, r2)
            goto L_0x0542
        L_0x050a:
            r3 = 8
            android.widget.ImageView r0 = r1.f217559f
            r0.setVisibility(r3)
            di3.d r0 = di3.C86312j.m106911c(r8)
            hw.e r0 = (p556hw.C76247e) r0
            long r8 = r29.getMsgId()
            boolean r0 = r0.mo106502wR(r8)
            if (r0 != 0) goto L_0x0526
            android.widget.ImageView r0 = r1.f217558e
            r0.setVisibility(r3)
        L_0x0526:
            com.tencent.mm.ui.widget.MMPinProgressBtn r0 = r1.f217561h
            r2 = 0
            r0.setVisibility(r2)
            com.tencent.mm.ui.widget.MMPinProgressBtn r0 = r1.f217561h
            int r2 = hd0.C98429r0.m127817h(r11)
            r0.setProgress(r2)
            java.lang.String r0 = "MicroMsg.VideoItemHoder"
            java.lang.String r2 = "status begin"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r0, r2)
            com.tencent.mm.ui.widget.MMPinProgressBtn r0 = r1.f217561h
            r0.invalidate()
        L_0x0542:
            hd0.x0$a r0 = hd0.C98442x0.f288734i
            java.lang.String r2 = r29.mo108775z2()
            hd0.x0 r0 = r0.mo137781b(r2)
            if (r0 == 0) goto L_0x057d
            boolean r2 = r0.f288738b
            if (r2 == 0) goto L_0x057d
            android.widget.ImageView r2 = r1.f217560g
            r3 = 8
            r2.setVisibility(r3)
            android.widget.ImageView r2 = r1.f217559f
            r2.setVisibility(r3)
            com.tencent.mm.ui.widget.MMPinProgressBtn r2 = r1.f217561h
            r2.setVisibility(r3)
            android.widget.ImageView r2 = r1.f217558e
            boolean r3 = r0.f288744h
            if (r3 == 0) goto L_0x056c
            r3 = 8
            goto L_0x056d
        L_0x056c:
            r3 = 0
        L_0x056d:
            r2.setVisibility(r3)
            android.widget.ProgressBar r2 = r1.f217571r
            if (r2 == 0) goto L_0x0587
            boolean r0 = r0.f288744h
            if (r0 == 0) goto L_0x0587
            r3 = 0
            r2.setVisibility(r3)
            goto L_0x0587
        L_0x057d:
            android.widget.ProgressBar r0 = r1.f217571r
            if (r0 == 0) goto L_0x0587
            r2 = 8
            r0.setVisibility(r2)
            goto L_0x0589
        L_0x0587:
            r2 = 8
        L_0x0589:
            com.tencent.mm.ui.chatting.gallery.d r0 = com.tencent.p014mm.p136ui.chatting.gallery.C73703d.f216412a
            long r8 = r29.getMsgId()
            com.tencent.mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader r0 = r0.mo102767a(r8)
            if (r0 != 0) goto L_0x07b4
            com.tencent.mm.ui.widget.progress.RoundProgressBtn r0 = r1.f217576w
            if (r0 == 0) goto L_0x059c
            r0.setVisibility(r2)
        L_0x059c:
            android.view.View r0 = r1.f217577x
            if (r0 == 0) goto L_0x07b4
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.mo10233c(r2)
            java.lang.Object[] r19 = r3.mo10232b()
            java.lang.String r20 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder"
            java.lang.String r21 = "parseVideo"
            java.lang.String r22 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder;Lcom/tencent/mm/storage/MsgInfo;ZLcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;ILandroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r0
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r2 = 0
            java.lang.Object r2 = r3.mo10231a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r19 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder"
            java.lang.String r20 = "parseVideo"
            java.lang.String r21 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder;Lcom/tencent/mm/storage/MsgInfo;ZLcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;ILandroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x07b4
        L_0x05e0:
            android.widget.TextView r3 = r1.f217556c
            int r8 = r11.f288559f
            long r8 = (long) r8
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.getSizeKB(r8)
            r3.setText(r8)
            android.widget.TextView r3 = r1.f217557d
            int r8 = r11.f288566m
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.formatSecToMin(r8)
            r3.setText(r8)
            int r3 = r11.f288562i
            android.widget.ImageView r8 = r1.f217558e
            android.app.Activity r9 = r32.mo91565f()
            android.graphics.drawable.Drawable r6 = kg3.C76577a.m92158i(r9, r6)
            r8.setImageDrawable(r6)
            android.widget.ProgressBar r6 = r1.f217569p
            r8 = 8
            if (r6 == 0) goto L_0x060f
            r6.setVisibility(r8)
        L_0x060f:
            android.view.View r6 = r1.f217570q
            if (r6 == 0) goto L_0x0651
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            r9.mo10233c(r10)
            java.lang.Object[] r19 = r9.mo10232b()
            java.lang.String r20 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder"
            java.lang.String r21 = "parseVideo"
            java.lang.String r22 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder;Lcom/tencent/mm/storage/MsgInfo;ZLcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;ILandroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r6
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r8 = 0
            java.lang.Object r9 = r9.mo10231a(r8)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r8 = r9.intValue()
            r6.setVisibility(r8)
            java.lang.String r19 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder"
            java.lang.String r20 = "parseVideo"
            java.lang.String r21 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder;Lcom/tencent/mm/storage/MsgInfo;ZLcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;ILandroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
        L_0x0651:
            java.lang.String r6 = "MicroMsg.VideoItemHoder"
            java.lang.String r8 = "video status %d"
            r9 = 1
            java.lang.Object[] r10 = new java.lang.Object[r9]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            r13 = 0
            r10[r13] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r6, r8, r10)
            r6 = 104(0x68, float:1.46E-43)
            if (r3 == r6) goto L_0x07b7
            r6 = 103(0x67, float:1.44E-43)
            if (r3 != r6) goto L_0x066d
            goto L_0x07b7
        L_0x066d:
            r6 = 105(0x69, float:1.47E-43)
            if (r3 == r6) goto L_0x073c
            int r8 = r29.getStatus()
            if (r8 == r0) goto L_0x073c
            if (r3 == r2) goto L_0x073c
            boolean r2 = r11.mo137712p()
            if (r2 == 0) goto L_0x0681
            goto L_0x073c
        L_0x0681:
            r0 = 106(0x6a, float:1.49E-43)
            if (r3 != r0) goto L_0x0718
            java.lang.String r0 = r29.mo108765s2()
            boolean r0 = com.tencent.p014mm.pluginsdk.model.C96790t0.m124282c(r0)
            if (r0 != 0) goto L_0x069e
            di3.d r0 = di3.C86312j.m106911c(r26)
            rz.u r0 = (p682rz.C101491u) r0
            java.lang.String r2 = r29.mo108765s2()
            r0.We0(r2)
            goto L_0x07b4
        L_0x069e:
            android.widget.ProgressBar r0 = r1.f217569p
            r2 = 0
            if (r0 == 0) goto L_0x06a6
            r0.setVisibility(r2)
        L_0x06a6:
            android.view.View r0 = r1.f217570q
            if (r0 == 0) goto L_0x06ea
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r3.mo10233c(r6)
            java.lang.Object[] r19 = r3.mo10232b()
            java.lang.String r20 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder"
            java.lang.String r21 = "parseVideo"
            java.lang.String r22 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder;Lcom/tencent/mm/storage/MsgInfo;ZLcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;ILandroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r0
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r2 = 0
            java.lang.Object r2 = r3.mo10231a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r18 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder"
            java.lang.String r19 = "parseVideo"
            java.lang.String r20 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder;Lcom/tencent/mm/storage/MsgInfo;ZLcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;ILandroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r17 = r0
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
        L_0x06ea:
            boolean r0 = hd0.C98429r0.m127830u()
            if (r0 != 0) goto L_0x06f7
            android.widget.TextView r0 = r1.f217557d
            r2 = 0
            r0.setText(r2)
            goto L_0x06f8
        L_0x06f7:
            r2 = 0
        L_0x06f8:
            android.widget.TextView r0 = r1.f217556c
            r0.setText(r2)
            android.widget.ImageView r0 = r1.f217558e
            r0.setImageDrawable(r2)
            android.widget.ImageView r0 = r1.f217560g
            r2 = 8
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r1.f217559f
            r0.setVisibility(r2)
            com.tencent.mm.ui.widget.MMPinProgressBtn r0 = r1.f217561h
            r0.setVisibility(r2)
            m88221c(r1, r2)
            goto L_0x07b4
        L_0x0718:
            r2 = 8
            m88221c(r1, r2)
            android.widget.ImageView r0 = r1.f217560g
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r1.f217559f
            r0.setVisibility(r2)
            com.tencent.mm.ui.widget.MMPinProgressBtn r0 = r1.f217561h
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r1.f217558e
            r2 = 0
            r0.setVisibility(r2)
            java.lang.String r0 = "MicroMsg.VideoItemHoder"
            java.lang.String r2 = "status gone"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r0, r2)
            goto L_0x07b4
        L_0x073c:
            android.widget.ImageView r2 = r1.f217560g
            r8 = 8
            r2.setVisibility(r8)
            com.tencent.mm.ui.widget.MMPinProgressBtn r2 = r1.f217561h
            r2.setVisibility(r8)
            boolean r2 = hd0.C98429r0.m127830u()
            if (r2 == 0) goto L_0x079a
            android.widget.ImageView r2 = r1.f217559f
            r2.setVisibility(r8)
            android.widget.ImageView r2 = r1.f217558e
            r2.setVisibility(r8)
            if (r12 == 0) goto L_0x076c
            m88221c(r1, r8)
            android.widget.ImageView r2 = r1.f217558e
            r7 = 0
            r2.setVisibility(r7)
            android.widget.ImageView r2 = r1.f217558e
            r3 = 2131756959(0x7f10079f, float:1.914484E38)
            r2.setImageResource(r3)
            goto L_0x07ab
        L_0x076c:
            r7 = 0
            m88221c(r1, r7)
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r1.f217574u
            if (r2 == 0) goto L_0x0786
            r7 = 2131755078(0x7f100046, float:1.9141025E38)
            r2.setImageResource(r7)
            zt3.t r2 = zt3.C119157j.f356862d
            com.tencent.mm.ui.chatting.viewitems.m7$$b r7 = new com.tencent.mm.ui.chatting.viewitems.m7$$b
            r7.<init>(r11, r1)
            zt3.j r2 = (zt3.C119157j) r2
            r2.mo183875f(r7)
        L_0x0786:
            com.tencent.mm.ui.widget.progress.RoundProgressBtn r2 = r1.f217572s
            if (r2 == 0) goto L_0x078e
            r7 = 0
            r2.setHasPause(r7)
        L_0x078e:
            if (r3 != r6) goto L_0x07ab
            android.widget.TextView r2 = r1.f217573t
            if (r2 == 0) goto L_0x07ab
            r3 = 8
            r2.setVisibility(r3)
            goto L_0x07ab
        L_0x079a:
            r3 = 8
            m88221c(r1, r3)
            android.widget.ImageView r0 = r1.f217559f
            r2 = 0
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r1.f217558e
            r0.setVisibility(r2)
            r0 = 6
        L_0x07ab:
            java.lang.String r2 = "MicroMsg.VideoItemHoder"
            java.lang.String r3 = "status pause"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r2, r3)
            r7 = r0
        L_0x07b4:
            r2 = 0
            goto L_0x091e
        L_0x07b7:
            long r2 = r11.f288567n
            java.util.concurrent.ConcurrentSkipListSet<java.lang.Long> r0 = f72.C86778a.f251888a
            java.lang.Class<f72.a> r6 = f72.C86778a.class
            monitor-enter(r6)
            java.util.concurrent.ConcurrentSkipListSet<java.lang.Long> r0 = f72.C86778a.f251888a     // Catch:{ Exception -> 0x07e7 }
            java.lang.Long r8 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x07e7 }
            boolean r0 = r0.contains(r8)     // Catch:{ Exception -> 0x07e7 }
            java.lang.String r8 = "MicroMsg.MMSightCaptureVideoRemuxStatus"
            java.lang.String r9 = "isMsgRemuxing: %s, %s"
            java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x07e7 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x07e7 }
            r3 = 0
            r10[r3] = r2     // Catch:{ Exception -> 0x07e7 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x07e7 }
            r3 = 1
            r10[r3] = r2     // Catch:{ Exception -> 0x07e7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r9, r10)     // Catch:{ Exception -> 0x07e7 }
            monitor-exit(r6)
            r17 = r0
            r8 = 0
            goto L_0x07fc
        L_0x07e4:
            r0 = move-exception
            goto L_0x09c4
        L_0x07e7:
            r0 = move-exception
            java.lang.String r2 = "MicroMsg.MMSightCaptureVideoRemuxStatus"
            java.lang.String r3 = "isMsgRemuxing error: %s"
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x07e4 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x07e4 }
            r8 = 0
            r9[r8] = r0     // Catch:{ all -> 0x07e4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r3, r9)     // Catch:{ all -> 0x07e4 }
            monitor-exit(r6)
            r17 = 0
        L_0x07fc:
            if (r17 == 0) goto L_0x0871
            android.widget.ProgressBar r0 = r1.f217569p
            if (r0 == 0) goto L_0x0805
            r0.setVisibility(r8)
        L_0x0805:
            android.view.View r0 = r1.f217570q
            if (r0 == 0) goto L_0x084b
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r2.mo10233c(r3)
            java.lang.Object[] r19 = r2.mo10232b()
            java.lang.String r20 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder"
            java.lang.String r21 = "parseVideo"
            java.lang.String r22 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder;Lcom/tencent/mm/storage/MsgInfo;ZLcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;ILandroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r0
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r18 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder"
            java.lang.String r19 = "parseVideo"
            java.lang.String r20 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder;Lcom/tencent/mm/storage/MsgInfo;ZLcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;ILandroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r17 = r0
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
        L_0x084b:
            android.widget.TextView r0 = r1.f217557d
            r2 = 0
            r0.setText(r2)
            android.widget.TextView r0 = r1.f217556c
            r0.setText(r2)
            android.widget.ImageView r0 = r1.f217558e
            r0.setImageDrawable(r2)
            android.widget.ImageView r0 = r1.f217560g
            r3 = 8
            r0.setVisibility(r3)
            android.widget.ImageView r0 = r1.f217559f
            r0.setVisibility(r3)
            com.tencent.mm.ui.widget.MMPinProgressBtn r0 = r1.f217561h
            r0.setVisibility(r3)
            m88221c(r1, r3)
            goto L_0x0916
        L_0x0871:
            r2 = 0
            r3 = 8
            android.widget.ProgressBar r0 = r1.f217569p
            if (r0 == 0) goto L_0x087b
            r0.setVisibility(r3)
        L_0x087b:
            android.view.View r0 = r1.f217570q
            if (r0 == 0) goto L_0x08bf
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            r6.mo10233c(r8)
            java.lang.Object[] r19 = r6.mo10232b()
            java.lang.String r20 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder"
            java.lang.String r21 = "parseVideo"
            java.lang.String r22 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder;Lcom/tencent/mm/storage/MsgInfo;ZLcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;ILandroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r0
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r3 = 0
            java.lang.Object r6 = r6.mo10231a(r3)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r3 = r6.intValue()
            r0.setVisibility(r3)
            java.lang.String r19 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder"
            java.lang.String r20 = "parseVideo"
            java.lang.String r21 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder;Lcom/tencent/mm/storage/MsgInfo;ZLcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;ILandroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
        L_0x08bf:
            android.widget.ImageView r0 = r1.f217559f
            r3 = 8
            r0.setVisibility(r3)
            android.widget.ImageView r0 = r1.f217558e
            r0.setVisibility(r3)
            boolean r0 = hd0.C98429r0.m127830u()
            if (r0 == 0) goto L_0x0904
            com.tencent.mm.ui.widget.MMPinProgressBtn r0 = r1.f217561h
            r0.setVisibility(r3)
            r6 = 0
            m88221c(r1, r6)
            android.widget.TextView r0 = r1.f217573t
            if (r0 == 0) goto L_0x08e1
            r0.setVisibility(r3)
        L_0x08e1:
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r1.f217574u
            if (r0 == 0) goto L_0x08eb
            r3 = 2131756113(0x7f100451, float:1.9143124E38)
            r0.setImageResource(r3)
        L_0x08eb:
            com.tencent.mm.ui.widget.progress.RoundProgressBtn r0 = r1.f217572s
            if (r0 == 0) goto L_0x08f3
            r3 = 1
            r0.setHasPause(r3)
        L_0x08f3:
            com.tencent.mm.ui.widget.progress.RoundProgressBtn r0 = r1.f217572s
            if (r0 == 0) goto L_0x0916
            zt3.t r0 = zt3.C119157j.f356862d
            com.tencent.mm.ui.chatting.viewitems.m7$$a r3 = new com.tencent.mm.ui.chatting.viewitems.m7$$a
            r3.<init>(r11, r1)
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183875f(r3)
            goto L_0x0916
        L_0x0904:
            m88221c(r1, r3)
            com.tencent.mm.ui.widget.MMPinProgressBtn r0 = r1.f217561h
            r3 = 0
            r0.setVisibility(r3)
            com.tencent.mm.ui.widget.MMPinProgressBtn r0 = r1.f217561h
            int r3 = hd0.C98429r0.m127824o(r11)
            r0.setProgress(r3)
        L_0x0916:
            java.lang.String r0 = "MicroMsg.VideoItemHoder"
            java.lang.String r3 = "status begin"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r0, r3)
        L_0x091e:
            boolean r0 = hd0.C98429r0.m127830u()
            if (r0 == 0) goto L_0x0956
            android.view.View r0 = r1.f217575v
            if (r0 == 0) goto L_0x0956
            com.tencent.mm.ui.chatting.viewitems.o7 r3 = new com.tencent.mm.ui.chatting.viewitems.o7
            boolean r6 = r32.mo91583x()
            java.lang.String r8 = r29.mo108768t()
            r9 = r29
            r10 = r31
            r3.<init>(r9, r6, r10, r8)
            r3.f217686T = r7
            r0.setTag(r3)
            android.view.View r0 = r1.f217575v
            if (r12 == 0) goto L_0x0944
            r15 = r2
            goto L_0x0946
        L_0x0944:
            r15 = r34
        L_0x0946:
            r0.setOnClickListener(r15)
            android.view.View r0 = r1.f217575v
            r2 = 1
            r2 = r2 ^ r12
            r0.setClickable(r2)
            android.view.View r0 = r1.f217575v
            r0.setFocusable(r2)
            goto L_0x095a
        L_0x0956:
            r9 = r29
            r10 = r31
        L_0x095a:
            android.widget.ImageView r0 = r1.f217560g
            com.tencent.mm.ui.chatting.viewitems.o7 r2 = new com.tencent.mm.ui.chatting.viewitems.o7
            boolean r3 = r32.mo91583x()
            java.lang.String r6 = r29.mo108768t()
            r2.<init>(r9, r3, r10, r6)
            r3 = 4
            r2.f217686T = r3
            r0.setTag(r2)
            android.widget.ImageView r0 = r1.f217560g
            r2 = r34
            r0.setOnClickListener(r2)
            android.widget.ImageView r0 = r1.f217559f
            com.tencent.mm.ui.chatting.viewitems.o7 r3 = new com.tencent.mm.ui.chatting.viewitems.o7
            boolean r6 = r32.mo91583x()
            java.lang.String r7 = r29.mo108768t()
            r3.<init>(r9, r6, r10, r7)
            r6 = 3
            r3.f217686T = r6
            r0.setTag(r3)
            android.widget.ImageView r0 = r1.f217559f
            r0.setOnClickListener(r2)
            android.view.View r0 = r1.clickArea
            com.tencent.mm.ui.chatting.viewitems.o7 r3 = new com.tencent.mm.ui.chatting.viewitems.o7
            boolean r6 = r32.mo91583x()
            java.lang.String r7 = r29.mo108768t()
            r3.<init>(r9, r6, r10, r7)
            r3.f217686T = r4
            r0.setTag(r3)
            android.view.View r0 = r1.clickArea
            r0.setOnClickListener(r2)
            android.view.View r0 = r1.clickArea
            r2 = r35
            r0.setOnLongClickListener(r2)
            android.view.View r0 = r1.clickArea
            java.lang.Class<zj3.l> r1 = zj3.C79368l.class
            com.tencent.mm.ui.chatting.manager.a r2 = r5.f193278b
            xi.d r1 = r2.mo102812a(r1)
            zj3.l r1 = (zj3.C79368l) r1
            com.tencent.mm.ui.chatting.h2 r1 = r1.mo108189Z4()
            r0.setOnTouchListener(r1)
            return
        L_0x09c4:
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74123m7.m88220b(com.tencent.mm.ui.chatting.viewitems.i, com.tencent.mm.ui.chatting.viewitems.m7, com.tencent.mm.storage.f4, boolean, uj3.e, ck3.b, int, android.view.View$OnClickListener, android.view.View$OnLongClickListener):void");
    }

    /* renamed from: c */
    public static void m88221c(C74123m7 m7Var, int i) {
        View view = m7Var.f217575v;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder", "setOriginVideoStatusAreaVisibility", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder", "setOriginVideoStatusAreaVisibility", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemVideo$VideoItemHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        TextView textView = m7Var.f217573t;
        if (textView != null) {
            textView.setVisibility(i);
        }
        WeImageView weImageView = m7Var.f217574u;
        if (weImageView != null) {
            weImageView.setVisibility(i);
        }
        RoundProgressBtn roundProgressBtn = m7Var.f217572s;
        if (roundProgressBtn != null) {
            roundProgressBtn.setVisibility(i);
        }
    }

    /* renamed from: d */
    public static void m88222d(C67391b bVar, C74123m7 m7Var, boolean z) {
        C78404m O1 = ((C79345d) bVar.f193278b.mo102812a(C79345d.class)).mo70145O1();
        if (O1 == null || !O1.f229738e) {
            m7Var.f217565l.setBackgroundResource(C0966R.C0969drawable.f4809ni);
            m7Var.f217563j.setTextColor(C76577a.m92153d(bVar.mo91565f(), C0966R.color.BW_0_Alpha_0_3));
        } else {
            m7Var.f217565l.setBackgroundResource(C0966R.C0969drawable.f4810nj);
            m7Var.f217563j.setTextColor(C76577a.m92153d(bVar.mo91565f(), C0966R.color.BW_0_Alpha_0_5));
        }
        m7Var.f217565l.getViewTreeObserver().addOnPreDrawListener(new m7$$g(m7Var, z));
    }

    /* renamed from: e */
    public static boolean m88223e(C101489t.C77595a.C77596a aVar) {
        Class cls = C101491u.class;
        if (aVar.f226216b != C101489t.C77595a.C77598b.UPDATE) {
            return false;
        }
        String str = aVar.f226215a;
        if (str != null && str.contains(FirebaseAnalytics.C113379b.ORIGIN)) {
            str = str.substring(0, str.indexOf(FirebaseAnalytics.C113379b.ORIGIN));
        }
        C98408n0 Zd = ((C101491u) C86312j.m106911c(cls)).mo140806Zd(str);
        if (Zd == null) {
            Log.m105929w("MicroMsg.VideoItemHoder", "update status, filename %s, videoInfo not found", aVar.f226215a);
            return false;
        }
        CdnVideoResourceDownloader a = C73703d.f216412a.mo102767a(Zd.f288567n);
        C98408n0 Zd2 = ((C101491u) C86312j.m106911c(cls)).mo140806Zd(Zd.f288546N);
        int i = Zd.f288562i;
        if (i != 112 && i != 104 && i != 103 && a == null) {
            return false;
        }
        MMHandlerThread.postToMainThread(new m7$$e(Zd, Zd2, a));
        return true;
    }

    /* renamed from: a */
    public C74023i.C74026c mo103182a(View view, boolean z) {
        super.create(view);
        this.timeTV = (TextView) view.findViewById(C0966R.C0970id.b8z);
        this.f217555b = (ImageView) view.findViewById(C0966R.C0970id.b4c);
        this.userTV = (TextView) view.findViewById(C0966R.C0970id.b9_);
        this.f217556c = (TextView) view.findViewById(C0966R.C0970id.b8p);
        this.f217557d = (TextView) view.findViewById(C0966R.C0970id.b77);
        this.f217558e = (ImageView) view.findViewById(C0966R.C0970id.b8w);
        this.f217559f = (ImageView) view.findViewById(C0966R.C0970id.b4g);
        this.f217560g = (ImageView) view.findViewById(C0966R.C0970id.b8y);
        this.f217561h = (MMPinProgressBtn) view.findViewById(C0966R.C0970id.b4k);
        this.f217562i = view.findViewById(C0966R.C0970id.b9c);
        this.clickArea = view.findViewById(C0966R.C0970id.b47);
        this.f217563j = (TextView) view.findViewById(C0966R.C0970id.b9g);
        this.f217564k = (ImageView) view.findViewById(C0966R.C0970id.b9f);
        this.f217565l = view.findViewById(C0966R.C0970id.b9e);
        this.f217566m = (LinearLayout) view.findViewById(C0966R.C0970id.f359488l53);
        this.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
        this.maskView = view.findViewById(C0966R.C0970id.b7h);
        this.f217567n = (ImageView) view.findViewById(C0966R.C0970id.b4e);
        View view2 = null;
        this.f217568o = !z ? (ImageView) view.findViewById(C0966R.C0970id.b8x) : null;
        this.f217569p = !z ? (ProgressBar) view.findViewById(C0966R.C0970id.b9d) : null;
        this.f217570q = !z ? view.findViewById(C0966R.C0970id.l16) : null;
        this.f217571r = z ? (ProgressBar) view.findViewById(C0966R.C0970id.lxe) : null;
        this.f217572s = !z ? (RoundProgressBtn) view.findViewById(C0966R.C0970id.lxf) : null;
        this.f217574u = !z ? (WeImageView) view.findViewById(C0966R.C0970id.lxd) : null;
        this.f217573t = !z ? (TextView) view.findViewById(C0966R.C0970id.lxh) : null;
        this.f217575v = !z ? view.findViewById(C0966R.C0970id.lxg) : null;
        this.f217576w = z ? (RoundProgressBtn) view.findViewById(C0966R.C0970id.lxc) : null;
        if (z) {
            view2 = view.findViewById(C0966R.C0970id.lxb);
        }
        this.f217577x = view2;
        return this;
    }
}
