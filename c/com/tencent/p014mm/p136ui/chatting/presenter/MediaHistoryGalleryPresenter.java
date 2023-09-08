package com.tencent.p014mm.p136ui.chatting.presenter;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.autogen.events.GalleryPhotoInfoEvent;
import com.tencent.p014mm.modelimage.C92822e;
import com.tencent.p014mm.p136ui.chatting.C73304a;
import com.tencent.p014mm.p136ui.chatting.C73313b1;
import com.tencent.p014mm.p136ui.chatting.C73764n3;
import com.tencent.p014mm.p136ui.chatting.gallery.C73708v;
import com.tencent.p014mm.p136ui.chatting.gallery.C97056h;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.C96789p0;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import dk3.C97482c;
import dk3.C97483d;
import eb0.C97625j3;
import f40.C86709a0;
import hd0.C98408n0;
import hd0.C98410o0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C117747y;
import p158gt.C76051j;
import p158gt.C98201k;
import p159gw.C98250h;
import p682rz.C101488s;
import p682rz.C101489t;
import p682rz.C101491u;
import te3.C64878zd0;
import uj3.C102039f;

/* renamed from: com.tencent.mm.ui.chatting.presenter.MediaHistoryGalleryPresenter */
public class MediaHistoryGalleryPresenter implements C97482c, C73708v.C73711c, C76051j.C76052a, C101489t.C77595a {

    /* renamed from: d */
    public C97483d f285110d;

    /* renamed from: e */
    public ArrayList<C102039f.C102042c> f285111e = null;

    /* renamed from: f */
    public Context f285112f;

    /* renamed from: g */
    public String f285113g;

    /* renamed from: h */
    public long f285114h;

    /* renamed from: i */
    public C102039f f285115i;

    /* renamed from: j */
    public GridLayoutManager f285116j;

    /* renamed from: n */
    public IListener f285117n = new IListener<GalleryPhotoInfoEvent>(C40008f.f107254d) {
        {
            this.__eventId = 1036677180;
        }

        public boolean callback(IEvent iEvent) {
            View childAt;
            GalleryPhotoInfoEvent galleryPhotoInfoEvent = (GalleryPhotoInfoEvent) iEvent;
            long j = galleryPhotoInfoEvent.f264882d.f264886c;
            MediaHistoryGalleryPresenter mediaHistoryGalleryPresenter = MediaHistoryGalleryPresenter.this;
            Iterator<C102039f.C102042c> it = mediaHistoryGalleryPresenter.f285115i.f300492e.iterator();
            int i = -1;
            int i2 = -1;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                i2++;
                C72963f4 f4Var = it.next().f300505b;
                if (f4Var != null && f4Var.getMsgId() == j) {
                    i = i2;
                    break;
                }
            }
            GridLayoutManager gridLayoutManager = (GridLayoutManager) mediaHistoryGalleryPresenter.mo136065b(mediaHistoryGalleryPresenter.f285112f);
            int C = gridLayoutManager.mo16957C();
            int E = gridLayoutManager.mo16959E();
            Log.m105925i("MicroMsg.MediaHistoryGalleryPresenter", "[getPhotoInfo] msgId:%s pos:%s [%s:%s]", Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(C), Integer.valueOf(E));
            if (i >= C && i <= E && (childAt = mediaHistoryGalleryPresenter.f285110d.getChildAt(i - C)) != null) {
                int[] iArr = new int[2];
                childAt.getLocationInWindow(iArr);
                GalleryPhotoInfoEvent.C92523b bVar = galleryPhotoInfoEvent.f264883e;
                bVar.f264888a = iArr[0];
                bVar.f264889b = iArr[1];
                bVar.f264890c = childAt.getWidth();
                galleryPhotoInfoEvent.f264883e.f264891d = childAt.getHeight();
            }
            return false;
        }
    };

    /* renamed from: o */
    public boolean f285118o = false;

    /* renamed from: p */
    public int f285119p = 0;

    /* renamed from: q */
    public MMHandler f285120q = new MMHandler(Looper.getMainLooper());

    /* renamed from: r */
    public boolean f285121r = false;

    /* renamed from: s */
    public int f285122s = 0;

    /* renamed from: t */
    public int f285123t = 0;

    /* renamed from: com.tencent.mm.ui.chatting.presenter.MediaHistoryGalleryPresenter$c */
    public class C73777c extends RecyclerView.C0129l {

        /* renamed from: d */
        public final /* synthetic */ Context f216546d;

        public C73777c(MediaHistoryGalleryPresenter mediaHistoryGalleryPresenter, Context context) {
            this.f216546d = context;
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            int dimension = (int) this.f216546d.getResources().getDimension(C0966R.dimen.f3928j9);
            rect.bottom = dimension;
            rect.top = dimension;
            rect.left = dimension;
            rect.right = dimension;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.presenter.MediaHistoryGalleryPresenter$a */
    public class C97160a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f285125d;

        /* renamed from: e */
        public final /* synthetic */ int f285126e;

        /* renamed from: com.tencent.mm.ui.chatting.presenter.MediaHistoryGalleryPresenter$a$a */
        public class C97161a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ LinkedList f285128d;

            public C97161a(LinkedList linkedList) {
                this.f285128d = linkedList;
            }

            public void run() {
                MediaHistoryGalleryPresenter.this.f285111e.addAll(0, this.f285128d);
                MediaHistoryGalleryPresenter mediaHistoryGalleryPresenter = MediaHistoryGalleryPresenter.this;
                mediaHistoryGalleryPresenter.f285122s = 0;
                Log.m105925i("MicroMsg.MediaHistoryGalleryPresenter", "[loadData] %s", Integer.valueOf(mediaHistoryGalleryPresenter.f285111e.size()));
                C97160a aVar = C97160a.this;
                C97483d dVar = MediaHistoryGalleryPresenter.this.f285110d;
                if (dVar != null) {
                    dVar.mo135869k(aVar.f285125d, this.f285128d.size());
                }
                MediaHistoryGalleryPresenter.this.f285115i.f300497j = false;
            }
        }

        public C97160a(boolean z, int i) {
            this.f285125d = z;
            this.f285126e = i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x01dc  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x01e4  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r33 = this;
                r1 = r33
                boolean r0 = r1.f285125d
                r2 = -1
                if (r0 == 0) goto L_0x0039
                com.tencent.mm.ui.chatting.presenter.MediaHistoryGalleryPresenter r0 = com.tencent.p014mm.p136ui.chatting.presenter.MediaHistoryGalleryPresenter.this
                long r4 = r0.f285114h
                int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r6 != 0) goto L_0x0025
                eb0.c r4 = eb0.C97625j3.m125812b()
                g62.l r4 = r4.mo105911z()
                com.tencent.mm.ui.chatting.presenter.MediaHistoryGalleryPresenter r5 = com.tencent.p014mm.p136ui.chatting.presenter.MediaHistoryGalleryPresenter.this
                java.lang.String r5 = r5.f285113g
                com.tencent.mm.storage.g4 r4 = (com.tencent.p014mm.storage.C72972g4) r4
                int r4 = r4.wx0(r5)
                r0.f285123t = r4
                goto L_0x0039
            L_0x0025:
                eb0.c r4 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.a0 r4 = r4.mo105897l()
                com.tencent.mm.ui.chatting.presenter.MediaHistoryGalleryPresenter r5 = com.tencent.p014mm.p136ui.chatting.presenter.MediaHistoryGalleryPresenter.this
                java.lang.String r6 = r5.f285113g
                long r7 = r5.f285114h
                int r4 = r4.mo100927k(r6, r7)
                r0.f285123t = r4
            L_0x0039:
                int r0 = r1.f285126e
                r4 = 200(0xc8, float:2.8E-43)
                if (r0 >= 0) goto L_0x0040
                goto L_0x0048
            L_0x0040:
                com.tencent.mm.ui.chatting.presenter.MediaHistoryGalleryPresenter r5 = com.tencent.p014mm.p136ui.chatting.presenter.MediaHistoryGalleryPresenter.this
                int r5 = r5.f285123t
                int r5 = r5 - r0
                if (r5 <= r4) goto L_0x0048
                r4 = r5
            L_0x0048:
                r5 = 2
                java.lang.Object[] r6 = new java.lang.Object[r5]
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r7 = 0
                r6[r7] = r0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
                r8 = 1
                r6[r8] = r0
                java.lang.String r0 = "MicroMsg.MediaHistoryGalleryPresenter"
                java.lang.String r9 = "offset:%s limit:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r9, r6)
                java.util.LinkedList r6 = new java.util.LinkedList
                r6.<init>()
                com.tencent.mm.ui.chatting.presenter.MediaHistoryGalleryPresenter r9 = com.tencent.p014mm.p136ui.chatting.presenter.MediaHistoryGalleryPresenter.this
                long r9 = r9.f285114h
                java.lang.String r11 = " ASC "
                java.lang.String r12 = ") order by "
                java.lang.String r13 = " OFFSET "
                java.lang.String r14 = " DESC limit "
                java.lang.String r15 = " INDEXED BY bizmessageBizChatIdTypeCreateTimeIndex "
                java.lang.String r7 = " "
                java.lang.String r8 = "select * from ( select * from "
                java.lang.String r5 = "MicroMsg.BizChatMessageStorage"
                java.lang.String r2 = " AND "
                java.lang.String r3 = " order by "
                r21 = r6
                java.lang.String r6 = "AND "
                r22 = r0
                java.lang.String r0 = "createTime"
                r23 = r5
                java.lang.String r5 = "type IN (3,39,13,43,62,44,268435505,486539313,1124073521)"
                r24 = r3
                java.lang.String r3 = " where"
                r25 = r6
                java.lang.String r6 = "getImgMessage fail, argument is invalid"
                r26 = r15
                java.lang.String r15 = "MicroMsg.MsgInfoStorage"
                r27 = r7
                r19 = -1
                int r28 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
                if (r28 != 0) goto L_0x012e
                eb0.c r9 = eb0.C97625j3.m125812b()
                g62.l r9 = r9.mo105911z()
                com.tencent.mm.ui.chatting.presenter.MediaHistoryGalleryPresenter r10 = com.tencent.p014mm.p136ui.chatting.presenter.MediaHistoryGalleryPresenter.this
                java.lang.String r7 = r10.f285113g
                java.util.ArrayList<uj3.f$c> r10 = r10.f285111e
                int r10 = r10.size()
                r29 = r6
                com.tencent.mm.ui.chatting.presenter.MediaHistoryGalleryPresenter r6 = com.tencent.p014mm.p136ui.chatting.presenter.MediaHistoryGalleryPresenter.this
                int r6 = r6.f285122s
                int r10 = r10 - r6
                com.tencent.mm.storage.g4 r9 = (com.tencent.p014mm.storage.C72972g4) r9
                r9.getClass()
                if (r7 == 0) goto L_0x011a
                int r6 = r7.length()
                if (r6 != 0) goto L_0x00c7
                goto L_0x011a
            L_0x00c7:
                java.lang.String r6 = r9.hy0(r7)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r8)
                r1.append(r6)
                r1.append(r3)
                java.lang.String r6 = r9.mo101130mL(r7)
                r1.append(r6)
                java.lang.String r6 = r9.iy0(r7)
                r1.append(r6)
                r1.append(r2)
                r1.append(r5)
                java.lang.String r6 = "  order by "
                r1.append(r6)
                r1.append(r0)
                r1.append(r14)
                r1.append(r4)
                r1.append(r13)
                r1.append(r10)
                r1.append(r12)
                r1.append(r0)
                r1.append(r11)
                java.lang.String r1 = r1.toString()
                zh3.f r6 = r9.f212775p
                r7 = 2
                r8 = 0
                android.database.Cursor r1 = r6.rawQuery(r1, r8, r7)
                r6 = r1
                r1 = r29
                goto L_0x0120
            L_0x011a:
                r1 = r29
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r1)
                r6 = 0
            L_0x0120:
                r30 = r1
                r29 = r2
                r31 = r15
                r2 = r24
                r1 = r25
                r8 = r27
                goto L_0x01c6
            L_0x012e:
                r1 = r6
                eb0.c r6 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.a0 r6 = r6.mo105897l()
                r7 = r33
                com.tencent.mm.ui.chatting.presenter.MediaHistoryGalleryPresenter r9 = com.tencent.p014mm.p136ui.chatting.presenter.MediaHistoryGalleryPresenter.this
                java.lang.String r10 = r9.f285113g
                r30 = r1
                r29 = r2
                long r1 = r9.f285114h
                java.util.ArrayList<uj3.f$c> r9 = r9.f285111e
                int r9 = r9.size()
                r31 = r15
                com.tencent.mm.ui.chatting.presenter.MediaHistoryGalleryPresenter r15 = com.tencent.p014mm.p136ui.chatting.presenter.MediaHistoryGalleryPresenter.this
                int r15 = r15.f285122s
                int r9 = r9 - r15
                r6.getClass()
                if (r10 == 0) goto L_0x01cc
                int r15 = r10.length()
                if (r15 != 0) goto L_0x0165
                r6 = r23
                r2 = r24
                r1 = r25
                r8 = r27
                goto L_0x01d4
            L_0x0165:
                java.lang.String r15 = r6.mo100941e(r10)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r8)
                r7.append(r15)
                r8 = r27
                r7.append(r8)
                r15 = r26
                r7.append(r15)
                r7.append(r3)
                java.lang.String r15 = r6.mo100925i(r10)
                r7.append(r15)
                java.lang.String r1 = r6.mo100928l(r10, r1)
                r7.append(r1)
                r1 = r25
                r7.append(r1)
                g62.l r2 = r6.f212648a
                r2.getClass()
                r7.append(r5)
                r2 = r24
                r7.append(r2)
                r7.append(r0)
                r7.append(r14)
                r7.append(r4)
                r7.append(r13)
                r7.append(r9)
                r7.append(r12)
                r7.append(r0)
                r7.append(r11)
                java.lang.String r7 = r7.toString()
                zh3.f r6 = r6.mo100940c()
                r9 = 0
                android.database.Cursor r6 = r6.rawQuery(r7, r9)
            L_0x01c6:
                r9 = r6
                r6 = r23
                r7 = r30
                goto L_0x01da
            L_0x01cc:
                r2 = r24
                r1 = r25
                r8 = r27
                r6 = r23
            L_0x01d4:
                r7 = r30
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r7)
                r9 = 0
            L_0x01da:
                if (r9 != 0) goto L_0x01e4
                java.lang.String r0 = "[loadData] NULL == cursor "
                r10 = r22
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
                return
            L_0x01e4:
                r10 = r22
                r11 = 0
            L_0x01e8:
                boolean r13 = r9.moveToNext()     // Catch:{ all -> 0x04a1 }
                if (r13 == 0) goto L_0x0242
                com.tencent.mm.storage.f4 r13 = new com.tencent.mm.storage.f4     // Catch:{ all -> 0x04a1 }
                r13.<init>()     // Catch:{ all -> 0x04a1 }
                r13.convertFrom(r9)     // Catch:{ all -> 0x04a1 }
                java.util.Date r14 = new java.util.Date     // Catch:{ all -> 0x04a1 }
                r23 = r6
                r30 = r7
                long r6 = r13.getCreateTime()     // Catch:{ all -> 0x04a1 }
                r14.<init>(r6)     // Catch:{ all -> 0x04a1 }
                com.tencent.mm.ui.gridviewheaders.a r6 = com.tencent.p014mm.p136ui.gridviewheaders.C74763a.m89510e()     // Catch:{ all -> 0x04a1 }
                long r6 = r6.mo103933a(r14)     // Catch:{ all -> 0x04a1 }
                int r14 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
                if (r14 == 0) goto L_0x022a
                uj3.f$c r11 = new uj3.f$c     // Catch:{ all -> 0x04a1 }
                long r14 = r13.getCreateTime()     // Catch:{ all -> 0x04a1 }
                r11.<init>((long) r14)     // Catch:{ all -> 0x04a1 }
                r12 = r21
                r12.add(r11)     // Catch:{ all -> 0x04a1 }
                r11 = r33
                com.tencent.mm.ui.chatting.presenter.MediaHistoryGalleryPresenter r14 = com.tencent.p014mm.p136ui.chatting.presenter.MediaHistoryGalleryPresenter.this     // Catch:{ all -> 0x023e }
                int r15 = r14.f285122s     // Catch:{ all -> 0x023e }
                r17 = 1
                int r15 = r15 + 1
                r14.f285122s = r15     // Catch:{ all -> 0x023e }
                goto L_0x022e
            L_0x022a:
                r11 = r33
                r12 = r21
            L_0x022e:
                uj3.f$c r14 = new uj3.f$c     // Catch:{ all -> 0x023e }
                r14.<init>((com.tencent.p014mm.storage.C72963f4) r13)     // Catch:{ all -> 0x023e }
                r12.add(r14)     // Catch:{ all -> 0x023e }
                r21 = r12
                r11 = r6
                r6 = r23
                r7 = r30
                goto L_0x01e8
            L_0x023e:
                r0 = move-exception
                r8 = r11
                goto L_0x04a4
            L_0x0242:
                r11 = r33
                r23 = r6
                r30 = r7
                r12 = r21
                r9.close()
                java.util.LinkedList r6 = new java.util.LinkedList
                r6.<init>()
                int r7 = r12.size()
                com.tencent.mm.ui.chatting.presenter.MediaHistoryGalleryPresenter r9 = com.tencent.p014mm.p136ui.chatting.presenter.MediaHistoryGalleryPresenter.this
                int r9 = r9.f285122s
                int r7 = r7 - r9
                r9 = 3
                if (r7 != r4) goto L_0x045e
                r4 = 0
                java.lang.Object r7 = r12.get(r4)
                uj3.f$c r7 = (uj3.C102039f.C102042c) r7
                long r13 = r7.f300507d
                com.tencent.mm.ui.gridviewheaders.a r7 = com.tencent.p014mm.p136ui.gridviewheaders.C74763a.m89510e()
                r15 = r5
                long r4 = r7.mo103934b(r13)
                java.lang.Object[] r7 = new java.lang.Object[r9]
                int r21 = r12.size()
                java.lang.Integer r21 = java.lang.Integer.valueOf(r21)
                r16 = 0
                r7[r16] = r21
                java.lang.Long r21 = java.lang.Long.valueOf(r4)
                r17 = 1
                r7[r17] = r21
                java.lang.Long r21 = java.lang.Long.valueOf(r13)
                r18 = 2
                r7[r18] = r21
                java.lang.String r9 = "[loadData] list size:%s start:%s end:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r9, r7)
                com.tencent.mm.ui.chatting.presenter.MediaHistoryGalleryPresenter r7 = com.tencent.p014mm.p136ui.chatting.presenter.MediaHistoryGalleryPresenter.this
                r22 = r10
                long r9 = r7.f285114h
                java.lang.String r7 = " ASC"
                r24 = r15
                java.lang.String r15 = "< "
                r25 = r12
                java.lang.String r12 = " >= "
                r27 = r6
                java.lang.String r6 = "select * from "
                r19 = -1
                int r32 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
                if (r32 != 0) goto L_0x0324
                eb0.c r8 = eb0.C97625j3.m125812b()
                g62.l r8 = r8.mo105911z()
                com.tencent.mm.ui.chatting.presenter.MediaHistoryGalleryPresenter r9 = com.tencent.p014mm.p136ui.chatting.presenter.MediaHistoryGalleryPresenter.this
                java.lang.String r9 = r9.f285113g
                com.tencent.mm.storage.g4 r8 = (com.tencent.p014mm.storage.C72972g4) r8
                r8.getClass()
                if (r9 == 0) goto L_0x0319
                int r10 = r9.length()
                if (r10 != 0) goto L_0x02c8
                goto L_0x0319
            L_0x02c8:
                java.lang.String r10 = r8.hy0(r9)
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r6)
                r11.append(r10)
                r11.append(r3)
                java.lang.String r3 = r8.iy0(r9)
                r11.append(r3)
                r11.append(r1)
                r9 = r24
                r11.append(r9)
                r10 = r29
                r11.append(r10)
                r11.append(r0)
                r11.append(r12)
                r11.append(r4)
                r11.append(r10)
                r11.append(r0)
                r11.append(r15)
                r11.append(r13)
                r11.append(r2)
                r11.append(r0)
                r11.append(r7)
                java.lang.String r0 = r11.toString()
                zh3.f r1 = r8.f212775p
                r2 = 2
                r3 = 0
                android.database.Cursor r7 = r1.rawQuery(r0, r3, r2)
                goto L_0x0321
            L_0x0319:
                r11 = r30
                r0 = r31
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r11)
                r7 = 0
            L_0x0321:
                r1 = r13
                goto L_0x03c5
            L_0x0324:
                r9 = r24
                r10 = r29
                r11 = r30
                eb0.c r19 = eb0.C97625j3.m125812b()
                r29 = r11
                com.tencent.mm.storage.a0 r11 = r19.mo105897l()
                r24 = r2
                r19 = r7
                r7 = r33
                com.tencent.mm.ui.chatting.presenter.MediaHistoryGalleryPresenter r2 = com.tencent.p014mm.p136ui.chatting.presenter.MediaHistoryGalleryPresenter.this
                java.lang.String r7 = r2.f285113g
                r30 = r13
                long r13 = r2.f285114h
                r11.getClass()
                if (r7 == 0) goto L_0x03ba
                int r2 = r7.length()
                if (r2 != 0) goto L_0x0355
                r0 = r23
                r3 = r29
                r1 = r30
                r4 = 0
                goto L_0x03c1
            L_0x0355:
                java.lang.String r2 = r11.mo100941e(r7)
                r20 = r15
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                r15.append(r6)
                r15.append(r2)
                r15.append(r8)
                r2 = r26
                r15.append(r2)
                r15.append(r3)
                java.lang.String r2 = r11.mo100928l(r7, r13)
                r15.append(r2)
                r15.append(r1)
                g62.l r1 = r11.f212648a
                r1.getClass()
                r15.append(r9)
                r15.append(r10)
                r15.append(r0)
                r15.append(r12)
                r15.append(r4)
                r15.append(r10)
                r15.append(r0)
                r1 = r20
                r15.append(r1)
                r1 = r30
                r15.append(r1)
                r3 = r24
                r15.append(r3)
                r15.append(r0)
                r0 = r19
                r15.append(r0)
                java.lang.String r0 = r15.toString()
                zh3.f r3 = r11.mo100940c()
                r4 = 0
                android.database.Cursor r7 = r3.rawQuery(r0, r4)
                goto L_0x03c5
            L_0x03ba:
                r1 = r30
                r4 = 0
                r0 = r23
                r3 = r29
            L_0x03c1:
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r3)
                r7 = r4
            L_0x03c5:
                java.util.Date r0 = new java.util.Date
                r0.<init>(r1)
                com.tencent.mm.ui.gridviewheaders.a r1 = com.tencent.p014mm.p136ui.gridviewheaders.C74763a.m89510e()
                long r1 = r1.mo103933a(r0)
            L_0x03d2:
                if (r7 == 0) goto L_0x0452
                boolean r3 = r7.moveToNext()     // Catch:{ all -> 0x044b }
                if (r3 == 0) goto L_0x0452
                com.tencent.mm.storage.f4 r3 = new com.tencent.mm.storage.f4     // Catch:{ all -> 0x044b }
                r3.<init>()     // Catch:{ all -> 0x044b }
                r3.convertFrom(r7)     // Catch:{ all -> 0x044b }
                java.util.Date r4 = new java.util.Date     // Catch:{ all -> 0x044b }
                long r5 = r3.getCreateTime()     // Catch:{ all -> 0x044b }
                r4.<init>(r5)     // Catch:{ all -> 0x044b }
                com.tencent.mm.ui.gridviewheaders.a r5 = com.tencent.p014mm.p136ui.gridviewheaders.C74763a.m89510e()     // Catch:{ all -> 0x044b }
                long r4 = r5.mo103933a(r4)     // Catch:{ all -> 0x044b }
                int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r6 == 0) goto L_0x041f
                com.tencent.mm.ui.gridviewheaders.a r6 = com.tencent.p014mm.p136ui.gridviewheaders.C74763a.m89510e()     // Catch:{ all -> 0x044b }
                long r8 = r6.mo103933a(r0)     // Catch:{ all -> 0x044b }
                int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r6 == 0) goto L_0x041f
                uj3.f$c r1 = new uj3.f$c     // Catch:{ all -> 0x044b }
                long r8 = r3.getCreateTime()     // Catch:{ all -> 0x044b }
                r1.<init>((long) r8)     // Catch:{ all -> 0x044b }
                r6 = r27
                r6.add(r1)     // Catch:{ all -> 0x044b }
                r8 = r33
                com.tencent.mm.ui.chatting.presenter.MediaHistoryGalleryPresenter r1 = com.tencent.p014mm.p136ui.chatting.presenter.MediaHistoryGalleryPresenter.this     // Catch:{ all -> 0x041d }
                int r2 = r1.f285122s     // Catch:{ all -> 0x041d }
                r9 = 1
                int r2 = r2 + r9
                r1.f285122s = r2     // Catch:{ all -> 0x041d }
                r1 = r4
                goto L_0x043c
            L_0x041d:
                r0 = move-exception
                goto L_0x044e
            L_0x041f:
                r8 = r33
                r6 = r27
                int r4 = r25.size()     // Catch:{ all -> 0x041d }
                if (r4 <= 0) goto L_0x043c
                int r4 = r6.size()     // Catch:{ all -> 0x041d }
                if (r4 != 0) goto L_0x043c
                r4 = r25
                r5 = 0
                java.lang.Object r9 = r4.remove(r5)     // Catch:{ all -> 0x041d }
                uj3.f$c r9 = (uj3.C102039f.C102042c) r9     // Catch:{ all -> 0x041d }
                r6.add(r5, r9)     // Catch:{ all -> 0x041d }
                goto L_0x043e
            L_0x043c:
                r4 = r25
            L_0x043e:
                uj3.f$c r5 = new uj3.f$c     // Catch:{ all -> 0x041d }
                r5.<init>((com.tencent.p014mm.storage.C72963f4) r3)     // Catch:{ all -> 0x041d }
                r6.add(r5)     // Catch:{ all -> 0x041d }
                r25 = r4
                r27 = r6
                goto L_0x03d2
            L_0x044b:
                r0 = move-exception
                r8 = r33
            L_0x044e:
                r7.close()
                throw r0
            L_0x0452:
                r8 = r33
                r4 = r25
                r6 = r27
                if (r7 == 0) goto L_0x0462
                r7.close()
                goto L_0x0462
            L_0x045e:
                r22 = r10
                r8 = r11
                r4 = r12
            L_0x0462:
                java.util.LinkedList r0 = new java.util.LinkedList
                r0.<init>()
                r0.addAll(r6)
                r0.addAll(r4)
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                int r2 = r4.size()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3 = 0
                r1[r3] = r2
                int r2 = r6.size()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3 = 1
                r1[r3] = r2
                int r2 = r0.size()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3 = 2
                r1[r3] = r2
                java.lang.String r2 = "[loadData] linkedList:%s linkedList1:%s finalAddList:%s"
                r3 = r22
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r1)
                com.tencent.mm.ui.chatting.presenter.MediaHistoryGalleryPresenter$a$a r1 = new com.tencent.mm.ui.chatting.presenter.MediaHistoryGalleryPresenter$a$a
                r1.<init>(r0)
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r1)
                return
            L_0x04a1:
                r0 = move-exception
                r8 = r33
            L_0x04a4:
                r9.close()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.presenter.MediaHistoryGalleryPresenter.C97160a.run():void");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.presenter.MediaHistoryGalleryPresenter$b */
    public class C97162b extends GridLayoutManager.C0127b {
        public C97162b() {
        }

        /* renamed from: c */
        public int mo118c(int i) {
            return MediaHistoryGalleryPresenter.this.f285111e.get(i).f300506c == Integer.MAX_VALUE ? 4 : 1;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.presenter.MediaHistoryGalleryPresenter$d */
    public class C97163d implements Runnable {
        public C97163d() {
        }

        public void run() {
            C97483d dVar = MediaHistoryGalleryPresenter.this.f285110d;
            if (dVar != null) {
                dVar.mo135858B6();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.presenter.MediaHistoryGalleryPresenter$e */
    public class C97164e implements Runnable {
        public C97164e() {
        }

        public void run() {
            C97483d dVar = MediaHistoryGalleryPresenter.this.f285110d;
            if (dVar != null) {
                dVar.mo135871u3(C0966R.string.f6o);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.presenter.MediaHistoryGalleryPresenter$f */
    public class C97165f implements Runnable {
        public C97165f() {
        }

        public void run() {
            C97483d dVar = MediaHistoryGalleryPresenter.this.f285110d;
            if (dVar != null) {
                dVar.mo135871u3(C0966R.string.f6o);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.presenter.MediaHistoryGalleryPresenter$g */
    public class C97166g implements Runnable {
        public C97166g() {
        }

        public void run() {
            C97483d dVar = MediaHistoryGalleryPresenter.this.f285110d;
            if (dVar != null) {
                dVar.mo135858B6();
            }
        }
    }

    public MediaHistoryGalleryPresenter(Context context) {
        this.f285112f = context;
        this.f285111e = new ArrayList<>();
    }

    /* renamed from: F0 */
    public void mo102736F0(C72963f4 f4Var, boolean z) {
        this.f285118o = true;
    }

    /* renamed from: O */
    public void mo136061O() {
        ((C92822e) ((C98201k) C86312j.m106911c(C98201k.class)).Jp0()).mo127102d(this);
        ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137731u(this);
        this.f285110d.mo135863O();
    }

    /* renamed from: P */
    public C102039f mo136062P(String str, long j) {
        this.f285113g = str;
        this.f285114h = j;
        if (j == -1) {
            this.f285115i = new C102039f(this.f285112f, this.f285111e, 4, str);
        } else {
            this.f285115i = new C102039f(this.f285112f, this.f285111e, 4, str, j);
        }
        C102039f fVar = this.f285115i;
        fVar.f300499o = new C97179n(this);
        return fVar;
    }

    /* renamed from: Q */
    public int mo136063Q() {
        return C73708v.C73710b.f216437a.mo102782f();
    }

    /* renamed from: T2 */
    public void mo102581T2(long j, long j2, int i, int i2, Object obj, int i3, int i4, String str, C117747y yVar) {
        boolean z = false;
        Log.m105925i("MicroMsg.MediaHistoryGalleryPresenter", "[onImgTaskEnd] mNeedDownloadCount:%s imgLocalId:%s msgLocalId:%s err[%s:%s:%s]", Integer.valueOf(this.f285119p), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i3), Integer.valueOf(i4), str);
        if (this.f285110d.mo135864X0()) {
            this.f285119p--;
            if (!C97056h.m124957k(this.f285112f, ((C72972g4) C97625j3.m125812b().mo105911z()).b00(j2), false)) {
                this.f285121r = true;
            }
            if (this.f285119p == 0) {
                z = true;
            }
            if (!z) {
                return;
            }
            if (!this.f285121r) {
                this.f285120q.post(new C97163d());
            } else {
                this.f285120q.post(new C97164e());
            }
        }
    }

    /* renamed from: a */
    public RecyclerView.C0129l mo136064a(Context context) {
        return new C73777c(this, context);
    }

    /* renamed from: b */
    public <T extends RecyclerView.LayoutManager> T mo136065b(Context context) {
        if (this.f285116j == null) {
            GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 4);
            this.f285116j = gridLayoutManager;
            gridLayoutManager.f44666B = new C97162b();
        }
        return this.f285116j;
    }

    /* renamed from: c */
    public String mo136066c() {
        return this.f285112f.getString(C0966R.string.f7554jh);
    }

    public void clear() {
    }

    /* renamed from: d5 */
    public void mo102579d5(C101489t.C77595a.C77596a aVar) {
        C97483d dVar = this.f285110d;
        if (dVar != null && dVar.mo135864X0()) {
            C98408n0 Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(aVar.f226215a);
            boolean z = false;
            Log.m105919d("MicroMsg.MediaHistoryGalleryPresenter", "[notifyChanged] mNeedDownloadCount:%s statusType:%s %s", Integer.valueOf(this.f285119p), aVar.f226217c, aVar.f226215a);
            if (Zd == null) {
                Log.m105920e("MicroMsg.MediaHistoryGalleryPresenter", "[notifyChanged] videoInfo is null!");
                mo136061O();
                this.f285110d.mo135871u3(0);
            } else if (Zd.mo137710n()) {
                this.f285119p--;
                C97056h.m124959m(this.f285112f, ((C72972g4) C97625j3.m125812b().mo105911z()).b00(Zd.f288567n), false);
            }
            if (this.f285119p == 0) {
                z = true;
            }
            if (!z) {
                return;
            }
            if (this.f285121r) {
                this.f285120q.post(new C97165f());
            } else {
                this.f285120q.post(new C97166g());
            }
        }
    }

    /* renamed from: f */
    public final void mo136067f(DoFavoriteEvent doFavoriteEvent) {
        DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
        aVar.f264688m = 45;
        aVar.f264684i = (Activity) this.f285112f;
        doFavoriteEvent.publish();
        int i = doFavoriteEvent.f264675e.f9046a;
        if (i != -2 && i <= 0 && i <= 0) {
            DoFavoriteEvent.C92474a aVar2 = doFavoriteEvent.f264674d;
            if (14 != aVar2.f264678c) {
                Log.m105918d("MicroMsg.MediaHistoryGalleryPresenter", "not record type, do not report");
                return;
            }
            C64878zd0 zd02 = aVar2.f264677b;
            if (zd02 == null) {
                Log.m105920e("MicroMsg.MediaHistoryGalleryPresenter", "want to report record fav, but type count is null");
                return;
            }
            C115669n.INSTANCE.mo160131h(11142, Integer.valueOf(zd02.f186671d), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186672e), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186673f), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186674g), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186675h), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186676i), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186677j), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186678n), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186679o), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186680p), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186681q), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186682r), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186683s), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186684t), Integer.valueOf(doFavoriteEvent.f264674d.f264677b.f186685u));
        }
    }

    /* renamed from: f0 */
    public void mo102582f0(long j, long j2, int i, int i2, Object obj, int i3, int i4, C117747y yVar) {
        Log.m105919d("MicroMsg.MediaHistoryGalleryPresenter", "[onImgTaskProgress] offset:%s totalLen:%s", Integer.valueOf(i3), Integer.valueOf(i4));
    }

    /* renamed from: i */
    public void mo136068i() {
        this.f285115i.f300501q = false;
        C73708v vVar = C73708v.C73710b.f216437a;
        vVar.mo102778b();
        vVar.f216435b = false;
        this.f285115i.notifyDataSetChanged();
    }

    /* renamed from: j */
    public RecyclerView.C16613e mo136069j() {
        return this.f285115i;
    }

    /* renamed from: k */
    public void mo136070k(boolean z, int i) {
        if (z || this.f285123t + this.f285122s != this.f285111e.size()) {
            this.f285115i.f300497j = true;
            this.f285110d.mo135865f(z);
            C86709a0.m107528h();
            C86709a0.m107525e().postToWorker(new C97160a(z, i));
            return;
        }
        Log.m105925i("MicroMsg.MediaHistoryGalleryPresenter", "[loadData] that's all msg :%s offset:%s", Integer.valueOf(this.f285123t), Integer.valueOf(i));
    }

    /* renamed from: l */
    public void mo136071l() {
        this.f285115i.f300501q = true;
        C73708v.C73710b.f216437a.f216435b = true;
        GridLayoutManager gridLayoutManager = (GridLayoutManager) mo136065b(this.f285112f);
        int C = gridLayoutManager.mo16957C();
        this.f285115i.notifyItemRangeChanged(C, (gridLayoutManager.mo16959E() - C) + 1, 0);
    }

    /* renamed from: m */
    public boolean mo136072m() {
        return C73708v.C73710b.f216437a.f216435b;
    }

    /* renamed from: n */
    public void mo136073n(int i) {
        int i2;
        Context context;
        Log.m105925i("MicroMsg.MediaHistoryGalleryPresenter", "[handleSelectedItem] type:%s", Integer.valueOf(i));
        ArrayList<C72963f4> arrayList = C73708v.C73710b.f216437a.f216434a;
        if (i == 0) {
            C115669n.INSTANCE.idkeyStat(219, 19, 1, true);
            C73313b1.m86457c(this.f285112f, arrayList, C72996z1.m85820U5(this.f285113g), this.f285113g, new C97178m(this));
            this.f285110d.mo135868i();
        } else if (i == 1) {
            Iterator<C72963f4> it = arrayList.iterator();
            while (it.hasNext()) {
                if (!C73764n3.m87370b(it.next())) {
                    C76912y0.makeText(this.f285112f, (int) C0966R.string.co_, 0).show();
                    return;
                }
            }
            C115669n.INSTANCE.idkeyStat(219, 18, 1, true);
            DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
            if (C96789p0.m124273f(this.f285112f, doFavoriteEvent, this.f285113g, arrayList, false, false)) {
                mo136067f(doFavoriteEvent);
                Iterator<C72963f4> it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    C73304a.m86447c(C73304a.C73306b.Fav, C73304a.C73307c.Samll, it4.next(), 0);
                }
            } else if (arrayList.size() > 1) {
                Context context2 = this.f285112f;
                String string = context2.getString(doFavoriteEvent.f264674d.f264687l >= 0 ? C0966R.string.coe : C0966R.string.cod);
                if (doFavoriteEvent.f264674d.f264687l >= 0) {
                    context = this.f285112f;
                    i2 = C0966R.string.bjb;
                } else {
                    context = this.f285112f;
                    i2 = C0966R.string.f361137hk2;
                }
                C76879j.m92707A(context2, string, "", context.getString(i2), this.f285112f.getString(C0966R.string.bj_), new C73807k(this, doFavoriteEvent, arrayList), (DialogInterface.OnClickListener) null);
            } else {
                C76879j.m92738i(this.f285112f, doFavoriteEvent.f264674d.f264687l, 0);
            }
            this.f285110d.mo135868i();
        } else if (i == 2) {
            C115669n.INSTANCE.mo160131h(11627, 5);
            TreeSet treeSet = new TreeSet();
            Iterator<C72963f4> it5 = arrayList.iterator();
            while (it5.hasNext()) {
                treeSet.add(Long.valueOf(it5.next().getMsgId()));
            }
            Context context3 = this.f285112f;
            C76879j.m92707A(context3, context3.getString(C0966R.string.bj6), "", this.f285112f.getString(C0966R.string.byd), this.f285112f.getString(C0966R.string.f7926wf), new C97176l(this, treeSet, arrayList), (DialogInterface.OnClickListener) null);
        } else if (i == 3) {
            ((C98250h) C86312j.m106911c(C98250h.class)).mo137341Iy(this.f285112f, new C97180o(this, arrayList), new C97167h(this));
        }
    }

    public void onDetach() {
        this.f285117n.dead();
        this.f285110d.mo82061t5(null);
        this.f285110d = null;
        ((C92822e) ((C98201k) C86312j.m106911c(C98201k.class)).Jp0()).mo127102d(this);
        ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137731u(this);
        C73708v vVar = C73708v.C73710b.f216437a;
        vVar.f216436c.clear();
        vVar.mo102778b();
        vVar.f216435b = false;
        C73313b1.C73320g gVar = C73313b1.f215414a;
        gVar.f215425a = null;
        gVar.f215426b = false;
        gVar.f215427c = null;
        gVar.f215428d = null;
        gVar.f215429e = null;
        gVar.f215430f = null;
    }

    public void onResume() {
        if (this.f285118o) {
            C73708v vVar = C73708v.C73710b.f216437a;
            if (vVar.f216435b) {
                this.f285110d.mo135859H(vVar.mo102782f());
                this.f285115i.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: x4 */
    public void mo102583x4(long j, long j2, int i, int i2, Object obj) {
    }
}
