package com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.GalleryPhotoInfoEvent;
import com.tencent.p014mm.plugin.choosemsgfile.p318ui.C93015m;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import f11.C97792a;
import f40.C86709a0;
import g11.C98065a;
import java.util.Iterator;

/* renamed from: com.tencent.mm.plugin.choosemsgfile.logic.ui.ChooseMsgFileUIController */
public class ChooseMsgFileUIController extends C92978b {

    /* renamed from: d */
    public C92979c f267780d;

    /* renamed from: e */
    public IListener f267781e = new IListener<GalleryPhotoInfoEvent>(C40008f.f107254d) {
        {
            this.__eventId = 1036677180;
        }

        public boolean callback(IEvent iEvent) {
            View childAt;
            GalleryPhotoInfoEvent galleryPhotoInfoEvent = (GalleryPhotoInfoEvent) iEvent;
            long j = galleryPhotoInfoEvent.f264882d.f264886c;
            ChooseMsgFileUIController chooseMsgFileUIController = ChooseMsgFileUIController.this;
            Iterator<C97792a> it = chooseMsgFileUIController.f267780d.f267794e.iterator();
            int i = -1;
            int i2 = -1;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                i2++;
                C72963f4 f4Var = it.next().f286878b;
                if (f4Var != null && f4Var.getMsgId() == j) {
                    i = i2;
                    break;
                }
            }
            GridLayoutManager gridLayoutManager = (GridLayoutManager) chooseMsgFileUIController.mo127388b(chooseMsgFileUIController.f267798b.getContext());
            int C = gridLayoutManager.mo16957C();
            int E = gridLayoutManager.mo16959E();
            Log.m105925i("MicroMsg.ChooseMsgFileUIController", "[getPhotoInfo] msgId:%s pos:%s [%s:%s]", Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(C), Integer.valueOf(E));
            if (i >= C && i <= E && (childAt = chooseMsgFileUIController.f267798b.getChildAt(i - C)) != null) {
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

    /* renamed from: f */
    public GridLayoutManager f267782f;

    /* renamed from: g */
    public int f267783g = 0;

    /* renamed from: h */
    public int f267784h = 0;

    /* renamed from: com.tencent.mm.plugin.choosemsgfile.logic.ui.ChooseMsgFileUIController$a */
    public class C92974a extends GridLayoutManager.C0127b {
        public C92974a() {
        }

        /* renamed from: c */
        public int mo118c(int i) {
            return ChooseMsgFileUIController.this.f267799c.get(i).mo137124h() == 0 ? 4 : 1;
        }
    }

    /* renamed from: com.tencent.mm.plugin.choosemsgfile.logic.ui.ChooseMsgFileUIController$b */
    public class C92975b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f267787d;

        /* renamed from: e */
        public final /* synthetic */ String f267788e;

        /* renamed from: f */
        public final /* synthetic */ boolean f267789f;

        /* renamed from: com.tencent.mm.plugin.choosemsgfile.logic.ui.ChooseMsgFileUIController$b$a */
        public class C92976a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f267791d;

            public C92976a(int i) {
                this.f267791d = i;
            }

            public void run() {
                C92975b bVar = C92975b.this;
                ChooseMsgFileUIController chooseMsgFileUIController = ChooseMsgFileUIController.this;
                chooseMsgFileUIController.f267780d.f267800h = false;
                chooseMsgFileUIController.f267798b.mo127413k(bVar.f267789f, this.f267791d);
            }
        }

        public C92975b(String str, String str2, boolean z) {
            this.f267787d = str;
            this.f267788e = str2;
            this.f267789f = z;
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x01ea A[SYNTHETIC, Splitter:B:35:0x01ea] */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x026d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r22 = this;
                r1 = r22
                java.lang.Class<f62.k0> r0 = f62.C75700k0.class
                java.util.LinkedList r2 = new java.util.LinkedList
                r2.<init>()
                k40.a r3 = f40.C86709a0.m107533q(r0)
                f62.k0 r3 = (f62.C75700k0) r3
                g62.l r3 = r3.mo96095LE()
                com.tencent.mm.plugin.choosemsgfile.logic.ui.ChooseMsgFileUIController r4 = com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.ChooseMsgFileUIController.this
                java.lang.String r5 = r4.f267797a
                int r4 = r4.f267783g
                com.tencent.mm.storage.g4 r3 = (com.tencent.p014mm.storage.C72972g4) r3
                r3.getClass()
                r6 = 200(0xc8, float:2.8E-43)
                java.lang.String r9 = "createTime"
                java.lang.String r10 = "type IN (3,39,13,43,62,44,49,1090519089,268435505)"
                java.lang.String r11 = " AND "
                java.lang.String r12 = " where"
                java.lang.String r13 = "getAllFileMessage fail, argument is invalid"
                java.lang.String r14 = "MicroMsg.MsgInfoStorage"
                if (r5 == 0) goto L_0x008b
                int r15 = r5.length()
                if (r15 != 0) goto L_0x0036
                goto L_0x008b
            L_0x0036:
                java.lang.String r15 = r3.hy0(r5)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "select * from ( select * from "
                r7.append(r8)
                r7.append(r15)
                r7.append(r12)
                java.lang.String r5 = r3.iy0(r5)
                r7.append(r5)
                r7.append(r11)
                r7.append(r10)
                java.lang.String r5 = "  order by "
                r7.append(r5)
                r7.append(r9)
                java.lang.String r5 = " DESC limit "
                r7.append(r5)
                r7.append(r6)
                java.lang.String r5 = " OFFSET "
                r7.append(r5)
                r7.append(r4)
                java.lang.String r4 = ") order by "
                r7.append(r4)
                r7.append(r9)
                java.lang.String r4 = " ASC "
                r7.append(r4)
                java.lang.String r4 = r7.toString()
                zh3.f r3 = r3.f212775p
                r5 = 2
                r7 = 0
                android.database.Cursor r3 = r3.rawQuery(r4, r7, r5)
                r7 = r3
                goto L_0x008f
            L_0x008b:
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r13)
                r7 = 0
            L_0x008f:
                java.lang.String r3 = "MicroMsg.ChooseMsgFileUIController"
                if (r7 != 0) goto L_0x0099
                java.lang.String r0 = "[loadData] NULL == cursor "
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
                return
            L_0x0099:
                r4 = 0
            L_0x009b:
                boolean r8 = r7.moveToNext()     // Catch:{ all -> 0x02b8 }
                r15 = 1
                if (r8 == 0) goto L_0x0103
                com.tencent.mm.plugin.choosemsgfile.logic.ui.ChooseMsgFileUIController r8 = com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.ChooseMsgFileUIController.this     // Catch:{ all -> 0x02b8 }
                int r6 = r8.f267783g     // Catch:{ all -> 0x02b8 }
                int r6 = r6 + r15
                r8.f267783g = r6     // Catch:{ all -> 0x02b8 }
                com.tencent.mm.storage.f4 r6 = new com.tencent.mm.storage.f4     // Catch:{ all -> 0x02b8 }
                r6.<init>()     // Catch:{ all -> 0x02b8 }
                r6.convertFrom(r7)     // Catch:{ all -> 0x02b8 }
                com.tencent.mm.plugin.choosemsgfile.logic.ui.ChooseMsgFileUIController r8 = com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.ChooseMsgFileUIController.this     // Catch:{ all -> 0x02b8 }
                com.tencent.mm.plugin.choosemsgfile.logic.ui.c r15 = r8.f267780d     // Catch:{ all -> 0x02b8 }
                java.lang.String r8 = r8.f267797a     // Catch:{ all -> 0x02b8 }
                r18 = r13
                java.lang.String r13 = r1.f267787d     // Catch:{ all -> 0x02b8 }
                r19 = r14
                java.lang.String r14 = r1.f267788e     // Catch:{ all -> 0x02b8 }
                f11.a r8 = g11.C98068c.m126676a(r15, r6, r8, r13, r14)     // Catch:{ all -> 0x02b8 }
                if (r8 == 0) goto L_0x00fc
                java.util.Date r13 = new java.util.Date     // Catch:{ all -> 0x02b8 }
                long r14 = r6.getCreateTime()     // Catch:{ all -> 0x02b8 }
                r13.<init>(r14)     // Catch:{ all -> 0x02b8 }
                com.tencent.mm.ui.gridviewheaders.a r14 = com.tencent.p014mm.p136ui.gridviewheaders.C74763a.m89510e()     // Catch:{ all -> 0x02b8 }
                long r13 = r14.mo103933a(r13)     // Catch:{ all -> 0x02b8 }
                int r15 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
                if (r15 == 0) goto L_0x00f5
                f11.c r4 = new f11.c     // Catch:{ all -> 0x02b8 }
                com.tencent.mm.plugin.choosemsgfile.logic.ui.ChooseMsgFileUIController r5 = com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.ChooseMsgFileUIController.this     // Catch:{ all -> 0x02b8 }
                com.tencent.mm.plugin.choosemsgfile.logic.ui.c r5 = r5.f267780d     // Catch:{ all -> 0x02b8 }
                r20 = r13
                long r13 = r6.getCreateTime()     // Catch:{ all -> 0x02b8 }
                r4.<init>(r5, r13)     // Catch:{ all -> 0x02b8 }
                r2.add(r4)     // Catch:{ all -> 0x02b8 }
                com.tencent.mm.plugin.choosemsgfile.logic.ui.ChooseMsgFileUIController r4 = com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.ChooseMsgFileUIController.this     // Catch:{ all -> 0x02b8 }
                int r5 = r4.f267784h     // Catch:{ all -> 0x02b8 }
                r6 = 1
                int r5 = r5 + r6
                r4.f267784h = r5     // Catch:{ all -> 0x02b8 }
                goto L_0x00f7
            L_0x00f5:
                r20 = r13
            L_0x00f7:
                r2.add(r8)     // Catch:{ all -> 0x02b8 }
                r4 = r20
            L_0x00fc:
                r13 = r18
                r14 = r19
                r6 = 200(0xc8, float:2.8E-43)
                goto L_0x009b
            L_0x0103:
                r18 = r13
                r19 = r14
                r7.close()
                java.util.LinkedList r4 = new java.util.LinkedList
                r4.<init>()
                int r5 = r2.size()
                com.tencent.mm.plugin.choosemsgfile.logic.ui.ChooseMsgFileUIController r6 = com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.ChooseMsgFileUIController.this
                int r6 = r6.f267784h
                int r5 = r5 - r6
                r6 = 0
                r7 = 200(0xc8, float:2.8E-43)
                if (r5 != r7) goto L_0x0271
                java.lang.Object r5 = r2.get(r6)
                f11.a r5 = (f11.C97792a) r5
                long r7 = r5.mo137123g()
                com.tencent.mm.ui.gridviewheaders.a r5 = com.tencent.p014mm.p136ui.gridviewheaders.C74763a.m89510e()
                long r13 = r5.mo103934b(r7)
                r5 = 3
                java.lang.Object[] r5 = new java.lang.Object[r5]
                int r15 = r2.size()
                java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
                r5[r6] = r15
                java.lang.Long r15 = java.lang.Long.valueOf(r13)
                r17 = 1
                r5[r17] = r15
                java.lang.Long r15 = java.lang.Long.valueOf(r7)
                r16 = 2
                r5[r16] = r15
                java.lang.String r15 = "[loadData] list size:%s start:%s end:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r15, r5)
                k40.a r0 = f40.C86709a0.m107533q(r0)
                f62.k0 r0 = (f62.C75700k0) r0
                g62.l r0 = r0.mo96095LE()
                com.tencent.mm.plugin.choosemsgfile.logic.ui.ChooseMsgFileUIController r5 = com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.ChooseMsgFileUIController.this
                java.lang.String r5 = r5.f267797a
                com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
                r0.getClass()
                if (r5 == 0) goto L_0x01d1
                int r15 = r5.length()
                if (r15 != 0) goto L_0x0174
                r20 = r3
                r0 = r18
                r3 = r19
                r6 = 0
                goto L_0x01d8
            L_0x0174:
                java.lang.String r15 = r0.hy0(r5)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r20 = r3
                java.lang.String r3 = "select * from "
                r6.append(r3)
                r6.append(r15)
                r6.append(r12)
                java.lang.String r3 = r0.iy0(r5)
                r6.append(r3)
                java.lang.String r3 = "AND "
                r6.append(r3)
                r6.append(r10)
                r6.append(r11)
                r6.append(r9)
                java.lang.String r3 = " >= "
                r6.append(r3)
                r6.append(r13)
                r6.append(r11)
                r6.append(r9)
                java.lang.String r3 = "< "
                r6.append(r3)
                r6.append(r7)
                java.lang.String r3 = " order by "
                r6.append(r3)
                r6.append(r9)
                java.lang.String r3 = " ASC"
                r6.append(r3)
                java.lang.String r3 = r6.toString()
                zh3.f r0 = r0.f212775p
                r5 = 2
                r6 = 0
                android.database.Cursor r0 = r0.rawQuery(r3, r6, r5)
                r6 = r0
                goto L_0x01db
            L_0x01d1:
                r20 = r3
                r6 = 0
                r0 = r18
                r3 = r19
            L_0x01d8:
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            L_0x01db:
                java.util.Date r0 = new java.util.Date
                r0.<init>(r7)
                com.tencent.mm.ui.gridviewheaders.a r3 = com.tencent.p014mm.p136ui.gridviewheaders.C74763a.m89510e()
                long r7 = r3.mo103933a(r0)
            L_0x01e8:
                if (r6 == 0) goto L_0x026b
                boolean r3 = r6.moveToNext()     // Catch:{ all -> 0x024b }
                if (r3 == 0) goto L_0x026b
                com.tencent.mm.plugin.choosemsgfile.logic.ui.ChooseMsgFileUIController r3 = com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.ChooseMsgFileUIController.this     // Catch:{ all -> 0x024b }
                int r5 = r3.f267783g     // Catch:{ all -> 0x024b }
                r9 = 1
                int r5 = r5 + r9
                r3.f267783g = r5     // Catch:{ all -> 0x024b }
                com.tencent.mm.storage.f4 r3 = new com.tencent.mm.storage.f4     // Catch:{ all -> 0x024b }
                r3.<init>()     // Catch:{ all -> 0x024b }
                r3.convertFrom(r6)     // Catch:{ all -> 0x024b }
                com.tencent.mm.plugin.choosemsgfile.logic.ui.ChooseMsgFileUIController r5 = com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.ChooseMsgFileUIController.this     // Catch:{ all -> 0x024b }
                com.tencent.mm.plugin.choosemsgfile.logic.ui.c r9 = r5.f267780d     // Catch:{ all -> 0x024b }
                java.lang.String r5 = r5.f267797a     // Catch:{ all -> 0x024b }
                java.lang.String r10 = r1.f267787d     // Catch:{ all -> 0x024b }
                java.lang.String r11 = r1.f267788e     // Catch:{ all -> 0x024b }
                f11.a r5 = g11.C98068c.m126676a(r9, r3, r5, r10, r11)     // Catch:{ all -> 0x024b }
                if (r5 == 0) goto L_0x01e8
                java.util.Date r9 = new java.util.Date     // Catch:{ all -> 0x024b }
                long r10 = r3.getCreateTime()     // Catch:{ all -> 0x024b }
                r9.<init>(r10)     // Catch:{ all -> 0x024b }
                com.tencent.mm.ui.gridviewheaders.a r10 = com.tencent.p014mm.p136ui.gridviewheaders.C74763a.m89510e()     // Catch:{ all -> 0x024b }
                long r9 = r10.mo103933a(r9)     // Catch:{ all -> 0x024b }
                int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r11 == 0) goto L_0x024d
                com.tencent.mm.ui.gridviewheaders.a r11 = com.tencent.p014mm.p136ui.gridviewheaders.C74763a.m89510e()     // Catch:{ all -> 0x024b }
                long r11 = r11.mo103933a(r0)     // Catch:{ all -> 0x024b }
                int r13 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r13 == 0) goto L_0x024d
                f11.c r7 = new f11.c     // Catch:{ all -> 0x024b }
                com.tencent.mm.plugin.choosemsgfile.logic.ui.ChooseMsgFileUIController r8 = com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.ChooseMsgFileUIController.this     // Catch:{ all -> 0x024b }
                com.tencent.mm.plugin.choosemsgfile.logic.ui.c r8 = r8.f267780d     // Catch:{ all -> 0x024b }
                long r11 = r3.getCreateTime()     // Catch:{ all -> 0x024b }
                r7.<init>(r8, r11)     // Catch:{ all -> 0x024b }
                r4.add(r7)     // Catch:{ all -> 0x024b }
                com.tencent.mm.plugin.choosemsgfile.logic.ui.ChooseMsgFileUIController r3 = com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.ChooseMsgFileUIController.this     // Catch:{ all -> 0x024b }
                int r7 = r3.f267784h     // Catch:{ all -> 0x024b }
                r8 = 1
                int r7 = r7 + r8
                r3.f267784h = r7     // Catch:{ all -> 0x024b }
                r7 = r9
                goto L_0x0263
            L_0x024b:
                r0 = move-exception
                goto L_0x0267
            L_0x024d:
                int r3 = r2.size()     // Catch:{ all -> 0x024b }
                if (r3 <= 0) goto L_0x0263
                int r3 = r4.size()     // Catch:{ all -> 0x024b }
                if (r3 != 0) goto L_0x0263
                r3 = 0
                java.lang.Object r9 = r2.remove(r3)     // Catch:{ all -> 0x024b }
                f11.a r9 = (f11.C97792a) r9     // Catch:{ all -> 0x024b }
                r4.add(r3, r9)     // Catch:{ all -> 0x024b }
            L_0x0263:
                r4.add(r5)     // Catch:{ all -> 0x024b }
                goto L_0x01e8
            L_0x0267:
                r6.close()
                throw r0
            L_0x026b:
                if (r6 == 0) goto L_0x0273
                r6.close()
                goto L_0x0273
            L_0x0271:
                r20 = r3
            L_0x0273:
                int r0 = r2.size()
                int r3 = r4.size()
                int r0 = r0 + r3
                com.tencent.mm.plugin.choosemsgfile.logic.ui.ChooseMsgFileUIController r3 = com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.ChooseMsgFileUIController.this
                java.util.ArrayList<f11.a> r3 = r3.f267799c
                r5 = 0
                r3.addAll(r5, r4)
                com.tencent.mm.plugin.choosemsgfile.logic.ui.ChooseMsgFileUIController r3 = com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.ChooseMsgFileUIController.this
                java.util.ArrayList<f11.a> r3 = r3.f267799c
                int r6 = r4.size()
                r3.addAll(r6, r2)
                r2.clear()
                r4.clear()
                com.tencent.mm.plugin.choosemsgfile.logic.ui.ChooseMsgFileUIController r2 = com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.ChooseMsgFileUIController.this
                r2.f267784h = r5
                r3 = 1
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.util.ArrayList<f11.a> r2 = r2.f267799c
                int r2 = r2.size()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3[r5] = r2
                java.lang.String r2 = "[loadData] %s"
                r4 = r20
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r3)
                com.tencent.mm.plugin.choosemsgfile.logic.ui.ChooseMsgFileUIController$b$a r2 = new com.tencent.mm.plugin.choosemsgfile.logic.ui.ChooseMsgFileUIController$b$a
                r2.<init>(r0)
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)
                return
            L_0x02b8:
                r0 = move-exception
                r7.close()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.choosemsgfile.logic.p881ui.ChooseMsgFileUIController.C92975b.run():void");
        }
    }

    public ChooseMsgFileUIController(C93015m mVar) {
        super(mVar);
    }

    /* renamed from: a */
    public static C98065a m117285a(ChooseMsgFileUIController chooseMsgFileUIController) {
        return chooseMsgFileUIController.f267798b.mo127409Q3();
    }

    /* renamed from: b */
    public <T extends RecyclerView.LayoutManager> T mo127388b(Context context) {
        if (this.f267782f == null) {
            GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 4);
            this.f267782f = gridLayoutManager;
            gridLayoutManager.f44666B = new C92974a();
        }
        return this.f267782f;
    }

    /* renamed from: c */
    public void mo127389c(boolean z, String str, String str2) {
        if (z) {
            this.f267799c.clear();
            this.f267783g = 0;
        }
        this.f267780d.f267800h = true;
        this.f267798b.mo127410f(z);
        C86709a0.m107528h();
        C86709a0.m107525e().postToWorker(new C92975b(str, str2, z));
    }
}
