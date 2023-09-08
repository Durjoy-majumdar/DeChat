package com.tencent.p014mm.p136ui.chatting.presenter;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.p136ui.tools.C45082x0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import dk3.C75414f;
import eb0.C97625j3;
import f40.C86709a0;
import gc0.C20828a;
import hc0.C20937c;
import java.util.HashSet;
import kg3.C76577a;
import nj3.C11184p0;
import p158gt.C98201k;
import p243tn.C14050a;
import p248ug.C102027b;
import p763ym.C79138l;
import qo3.C77407n;
import rk3.C63462a;
import uj3.C78211g;
import wd3.C22898h;
import wd3.C22908r;

/* renamed from: com.tencent.mm.ui.chatting.presenter.r */
public class C73822r extends C73787b {

    /* renamed from: p */
    public HashSet<Integer> f216631p = new HashSet<>();

    /* renamed from: q */
    public int f216632q = -1;

    /* renamed from: com.tencent.mm.ui.chatting.presenter.r$a */
    public class C73823a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f216633d;

        /* renamed from: com.tencent.mm.ui.chatting.presenter.r$a$a */
        public class C73824a implements Runnable {
            public C73824a() {
            }

            public void run() {
                C73823a aVar = C73823a.this;
                C73822r rVar = C73822r.this;
                C75414f fVar = rVar.f216569f;
                if (fVar != null) {
                    fVar.mo102730k(aVar.f216633d, rVar.f216572i.size());
                }
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.presenter.r$a$b */
        public class C73825b implements Runnable {
            public C73825b() {
            }

            public void run() {
                C73823a aVar = C73823a.this;
                C73822r rVar = C73822r.this;
                C75414f fVar = rVar.f216569f;
                if (fVar != null) {
                    fVar.mo102730k(aVar.f216633d, rVar.f216572i.size());
                }
            }
        }

        public C73823a(boolean z) {
            this.f216633d = z;
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: type inference failed for: r6v0 */
        /* JADX WARNING: type inference failed for: r6v1, types: [eb0.w2$a, java.lang.String] */
        /* JADX WARNING: type inference failed for: r6v2 */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x012b A[Catch:{ all -> 0x022d }] */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x0161 A[Catch:{ all -> 0x022d }] */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0173 A[Catch:{ all -> 0x022d }] */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x0178 A[Catch:{ all -> 0x022d }] */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0189 A[Catch:{ all -> 0x022d }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r29 = this;
                r1 = r29
                java.util.LinkedList r0 = new java.util.LinkedList
                r0.<init>()
                eb0.c r2 = eb0.C97625j3.m125812b()
                g62.l r2 = r2.mo105911z()
                com.tencent.mm.ui.chatting.presenter.r r3 = com.tencent.p014mm.p136ui.chatting.presenter.C73822r.this
                java.lang.String r4 = r3.f216568e
                int r3 = r3.f216632q
                com.tencent.mm.storage.g4 r2 = (com.tencent.p014mm.storage.C72972g4) r2
                r5 = 0
                android.database.Cursor r2 = r2.mo101073LL(r4, r5, r3)
                java.lang.String r3 = "MicroMsg.UrlHistoryListPresenter"
                if (r2 != 0) goto L_0x0026
                java.lang.String r0 = "[loadData] cursor is null!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
                return
            L_0x0026:
                com.tencent.mm.ui.chatting.presenter.r r4 = com.tencent.p014mm.p136ui.chatting.presenter.C73822r.this
                java.lang.String r4 = r4.f216568e
                boolean r4 = com.tencent.p014mm.storage.C72996z1.m85820U5(r4)
                r6 = 0
                if (r4 == 0) goto L_0x0044
                eb0.c r4 = eb0.C97625j3.m125812b()
                eb0.m2 r4 = r4.mo105902q()
                com.tencent.mm.ui.chatting.presenter.r r7 = com.tencent.p014mm.p136ui.chatting.presenter.C73822r.this
                java.lang.String r7 = r7.f216568e
                com.tencent.mm.storage.n1 r4 = (com.tencent.p014mm.storage.C44662n1) r4
                com.tencent.mm.storage.m1 r4 = r4.mo69799Lo(r7)
                goto L_0x0045
            L_0x0044:
                r4 = r6
            L_0x0045:
                r7 = 0
            L_0x0047:
                boolean r9 = r2.moveToNext()     // Catch:{ all -> 0x022d }
                if (r9 == 0) goto L_0x01e2
                com.tencent.mm.storage.f4 r9 = new com.tencent.mm.storage.f4     // Catch:{ all -> 0x022d }
                r9.<init>()     // Catch:{ all -> 0x022d }
                r9.convertFrom(r2)     // Catch:{ all -> 0x022d }
                java.lang.String r12 = r9.getContent()     // Catch:{ all -> 0x022d }
                if (r12 == 0) goto L_0x01de
                com.tencent.mm.message.l$b r12 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r12, r6)     // Catch:{ all -> 0x022d }
                if (r12 == 0) goto L_0x01de
                com.tencent.mm.ui.chatting.presenter.r r13 = com.tencent.p014mm.p136ui.chatting.presenter.C73822r.this     // Catch:{ all -> 0x022d }
                int r14 = r12.f195582i     // Catch:{ all -> 0x022d }
                r13.getType()     // Catch:{ all -> 0x022d }
                java.util.HashSet<java.lang.Integer> r13 = r13.f216631p     // Catch:{ all -> 0x022d }
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x022d }
                boolean r13 = r13.contains(r14)     // Catch:{ all -> 0x022d }
                if (r13 == 0) goto L_0x01de
                java.util.Date r13 = new java.util.Date     // Catch:{ all -> 0x022d }
                long r14 = r9.getCreateTime()     // Catch:{ all -> 0x022d }
                r13.<init>(r14)     // Catch:{ all -> 0x022d }
                com.tencent.mm.ui.gridviewheaders.a r14 = com.tencent.p014mm.p136ui.gridviewheaders.C74763a.m89510e()     // Catch:{ all -> 0x022d }
                long r13 = r14.mo103933a(r13)     // Catch:{ all -> 0x022d }
                int r15 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
                if (r15 == 0) goto L_0x009a
                uj3.g$d r7 = new uj3.g$d     // Catch:{ all -> 0x022d }
                long r10 = r9.getCreateTime()     // Catch:{ all -> 0x022d }
                r7.<init>(r10)     // Catch:{ all -> 0x022d }
                r0.add(r7)     // Catch:{ all -> 0x022d }
                com.tencent.mm.ui.chatting.presenter.r r7 = com.tencent.p014mm.p136ui.chatting.presenter.C73822r.this     // Catch:{ all -> 0x022d }
                r7.getClass()     // Catch:{ all -> 0x022d }
            L_0x009a:
                com.tencent.mm.ui.chatting.presenter.r r7 = com.tencent.p014mm.p136ui.chatting.presenter.C73822r.this     // Catch:{ all -> 0x022d }
                java.lang.String r8 = r7.f216568e     // Catch:{ all -> 0x022d }
                boolean r8 = com.tencent.p014mm.storage.C72996z1.m85820U5(r8)     // Catch:{ all -> 0x022d }
                java.lang.String r7 = r7.mo102843r(r9, r8, r5)     // Catch:{ all -> 0x022d }
                java.lang.Class<f62.k0> r8 = f62.C75700k0.class
                k40.a r8 = f40.C86709a0.m107533q(r8)     // Catch:{ all -> 0x022d }
                f62.k0 r8 = (f62.C75700k0) r8     // Catch:{ all -> 0x022d }
                com.tencent.mm.storage.u3 r8 = r8.mo96097Ni()     // Catch:{ all -> 0x022d }
                com.tencent.mm.storage.z1 r8 = r8.get(r7)     // Catch:{ all -> 0x022d }
                java.lang.String r10 = ""
                if (r4 == 0) goto L_0x00c1
                java.lang.String r7 = r4.mo69789q2(r7)     // Catch:{ all -> 0x022d }
                r27 = r7
                goto L_0x00c3
            L_0x00c1:
                r27 = r10
            L_0x00c3:
                java.lang.String r7 = r12.f195602n     // Catch:{ all -> 0x022d }
                com.tencent.p014mm.plugin.fav.p047ui.C93693r.m118403d(r7)     // Catch:{ all -> 0x022d }
                com.tencent.mm.ui.chatting.presenter.r r7 = com.tencent.p014mm.p136ui.chatting.presenter.C73822r.this     // Catch:{ all -> 0x022d }
                android.content.Context r7 = r7.f216567d     // Catch:{ all -> 0x022d }
                java.lang.String r11 = r12.f195634v     // Catch:{ all -> 0x022d }
                java.lang.String r7 = pb1.C100734q.m131876u(r7, r11)     // Catch:{ all -> 0x022d }
                eb0.c r11 = eb0.C97625j3.m125812b()     // Catch:{ all -> 0x022d }
                com.tencent.mm.storage.u3 r11 = r11.mo105907v()     // Catch:{ all -> 0x022d }
                java.lang.String r15 = r12.f195634v     // Catch:{ all -> 0x022d }
                com.tencent.mm.storage.z1 r11 = r11.get(r15)     // Catch:{ all -> 0x022d }
                if (r11 == 0) goto L_0x00f4
                java.lang.String r15 = r11.getUsername()     // Catch:{ all -> 0x022d }
                java.lang.String r5 = r12.f195634v     // Catch:{ all -> 0x022d }
                boolean r5 = r15.equals(r5)     // Catch:{ all -> 0x022d }
                if (r5 != 0) goto L_0x00ef
                goto L_0x00f4
            L_0x00ef:
                java.lang.String r7 = r11.mo62898f()     // Catch:{ all -> 0x022d }
                goto L_0x00fd
            L_0x00f4:
                eb0.w2 r5 = eb0.C31519v2.m39436a()     // Catch:{ all -> 0x022d }
                java.lang.String r11 = r12.f195634v     // Catch:{ all -> 0x022d }
                r5.mo55988e(r11, r10, r6)     // Catch:{ all -> 0x022d }
            L_0x00fd:
                com.tencent.mm.ui.chatting.presenter.r$c r5 = new com.tencent.mm.ui.chatting.presenter.r$c     // Catch:{ all -> 0x022d }
                com.tencent.mm.ui.chatting.presenter.r r10 = com.tencent.p014mm.p136ui.chatting.presenter.C73822r.this     // Catch:{ all -> 0x022d }
                long r18 = r9.getCreateTime()     // Catch:{ all -> 0x022d }
                int r11 = r12.f195582i     // Catch:{ all -> 0x022d }
                java.lang.String r15 = r12.f195570f     // Catch:{ all -> 0x022d }
                long r22 = r9.getMsgId()     // Catch:{ all -> 0x022d }
                java.lang.String r24 = r8.getUsername()     // Catch:{ all -> 0x022d }
                java.lang.String r25 = r8.mo62909j3()     // Catch:{ all -> 0x022d }
                java.lang.String r26 = r8.mo73969n2()     // Catch:{ all -> 0x022d }
                r28 = 0
                r16 = r5
                r17 = r10
                r20 = r11
                r21 = r15
                r16.<init>(r17, r18, r20, r21, r22, r24, r25, r26, r27, r28)     // Catch:{ all -> 0x022d }
                int r8 = r12.f195582i     // Catch:{ all -> 0x022d }
                r10 = 5
                if (r8 != r10) goto L_0x015b
                java.lang.String r11 = "alvinluo loadData type: %d"
                r15 = 1
                java.lang.Object[] r6 = new java.lang.Object[r15]     // Catch:{ all -> 0x022d }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x022d }
                r15 = 0
                r6[r15] = r8     // Catch:{ all -> 0x022d }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r11, r6)     // Catch:{ all -> 0x022d }
                com.tencent.mm.ui.chatting.presenter.r$d r6 = new com.tencent.mm.ui.chatting.presenter.r$d     // Catch:{ all -> 0x022d }
                com.tencent.mm.ui.chatting.presenter.r r8 = com.tencent.p014mm.p136ui.chatting.presenter.C73822r.this     // Catch:{ all -> 0x022d }
                r6.<init>(r8)     // Catch:{ all -> 0x022d }
                java.lang.Class<com.tencent.mm.message.f> r8 = com.tencent.p014mm.message.C68065f.class
                com.tencent.mm.message.g r8 = r12.mo93555w(r8)     // Catch:{ all -> 0x022d }
                com.tencent.mm.message.f r8 = (com.tencent.p014mm.message.C68065f) r8     // Catch:{ all -> 0x022d }
                if (r8 == 0) goto L_0x0156
                int r11 = r8.f195422g     // Catch:{ all -> 0x022d }
                r15 = 1
                if (r11 != r15) goto L_0x0156
                int r8 = r8.f195417b     // Catch:{ all -> 0x022d }
                if (r8 != r10) goto L_0x0156
                r8 = 1
                goto L_0x0157
            L_0x0156:
                r8 = 0
            L_0x0157:
                r6.f216645a = r8     // Catch:{ all -> 0x022d }
                r5.f216644m = r6     // Catch:{ all -> 0x022d }
            L_0x015b:
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)     // Catch:{ all -> 0x022d }
                if (r6 == 0) goto L_0x0163
                java.lang.String r7 = r12.f195574g     // Catch:{ all -> 0x022d }
            L_0x0163:
                r5.f216642k = r7     // Catch:{ all -> 0x022d }
                java.lang.String r6 = r12.f195562d     // Catch:{ all -> 0x022d }
                r5.f216641j = r6     // Catch:{ all -> 0x022d }
                java.lang.String r6 = r9.mo108765s2()     // Catch:{ all -> 0x022d }
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)     // Catch:{ all -> 0x022d }
                if (r6 == 0) goto L_0x0178
                java.lang.String r6 = r12.f195646y     // Catch:{ all -> 0x022d }
                r5.f216643l = r6     // Catch:{ all -> 0x022d }
                goto L_0x017e
            L_0x0178:
                java.lang.String r6 = r9.mo108765s2()     // Catch:{ all -> 0x022d }
                r5.f216643l = r6     // Catch:{ all -> 0x022d }
            L_0x017e:
                r0.add(r5)     // Catch:{ all -> 0x022d }
                int r5 = r0.size()     // Catch:{ all -> 0x022d }
                int r5 = r5 % 20
                if (r5 != 0) goto L_0x01dd
                com.tencent.mm.ui.chatting.presenter.r r5 = com.tencent.p014mm.p136ui.chatting.presenter.C73822r.this     // Catch:{ all -> 0x022d }
                java.util.ArrayList<uj3.g$c> r5 = r5.f216572i     // Catch:{ all -> 0x022d }
                int r5 = r5.size()     // Catch:{ all -> 0x022d }
                if (r5 <= 0) goto L_0x01b9
                com.tencent.mm.ui.chatting.presenter.r r5 = com.tencent.p014mm.p136ui.chatting.presenter.C73822r.this     // Catch:{ all -> 0x022d }
                java.util.ArrayList<uj3.g$c> r5 = r5.f216572i     // Catch:{ all -> 0x022d }
                int r6 = r5.size()     // Catch:{ all -> 0x022d }
                r7 = 1
                int r6 = r6 - r7
                java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x022d }
                uj3.g$c r5 = (uj3.C78211g.C78216c) r5     // Catch:{ all -> 0x022d }
                int r5 = r5.mo102836a()     // Catch:{ all -> 0x022d }
                r6 = 2147483646(0x7ffffffe, float:NaN)
                if (r5 != r6) goto L_0x01b9
                com.tencent.mm.ui.chatting.presenter.r r5 = com.tencent.p014mm.p136ui.chatting.presenter.C73822r.this     // Catch:{ all -> 0x022d }
                java.util.ArrayList<uj3.g$c> r5 = r5.f216572i     // Catch:{ all -> 0x022d }
                int r6 = r5.size()     // Catch:{ all -> 0x022d }
                r7 = 1
                int r6 = r6 - r7
                r5.remove(r6)     // Catch:{ all -> 0x022d }
            L_0x01b9:
                com.tencent.mm.ui.chatting.presenter.r r5 = com.tencent.p014mm.p136ui.chatting.presenter.C73822r.this     // Catch:{ all -> 0x022d }
                java.util.ArrayList<uj3.g$c> r5 = r5.f216572i     // Catch:{ all -> 0x022d }
                r5.addAll(r0)     // Catch:{ all -> 0x022d }
                com.tencent.mm.ui.chatting.presenter.r r5 = com.tencent.p014mm.p136ui.chatting.presenter.C73822r.this     // Catch:{ all -> 0x022d }
                java.util.ArrayList<uj3.g$c> r5 = r5.f216572i     // Catch:{ all -> 0x022d }
                uj3.g$h r6 = new uj3.g$h     // Catch:{ all -> 0x022d }
                r6.<init>()     // Catch:{ all -> 0x022d }
                r5.add(r6)     // Catch:{ all -> 0x022d }
                com.tencent.mm.ui.chatting.presenter.r r5 = com.tencent.p014mm.p136ui.chatting.presenter.C73822r.this     // Catch:{ all -> 0x022d }
                java.util.ArrayList<uj3.g$c> r6 = r5.f216572i     // Catch:{ all -> 0x022d }
                r5.f216573j = r6     // Catch:{ all -> 0x022d }
                r0.clear()     // Catch:{ all -> 0x022d }
                com.tencent.mm.ui.chatting.presenter.r$a$a r5 = new com.tencent.mm.ui.chatting.presenter.r$a$a     // Catch:{ all -> 0x022d }
                r5.<init>()     // Catch:{ all -> 0x022d }
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r5)     // Catch:{ all -> 0x022d }
            L_0x01dd:
                r7 = r13
            L_0x01de:
                r5 = 0
                r6 = 0
                goto L_0x0047
            L_0x01e2:
                r2.close()
                com.tencent.mm.ui.chatting.presenter.r r2 = com.tencent.p014mm.p136ui.chatting.presenter.C73822r.this
                java.util.ArrayList<uj3.g$c> r2 = r2.f216572i
                int r2 = r2.size()
                if (r2 <= 0) goto L_0x0214
                com.tencent.mm.ui.chatting.presenter.r r2 = com.tencent.p014mm.p136ui.chatting.presenter.C73822r.this
                java.util.ArrayList<uj3.g$c> r2 = r2.f216572i
                int r3 = r2.size()
                r4 = 1
                int r3 = r3 - r4
                java.lang.Object r2 = r2.get(r3)
                uj3.g$c r2 = (uj3.C78211g.C78216c) r2
                int r2 = r2.mo102836a()
                r3 = 2147483646(0x7ffffffe, float:NaN)
                if (r2 != r3) goto L_0x0214
                com.tencent.mm.ui.chatting.presenter.r r2 = com.tencent.p014mm.p136ui.chatting.presenter.C73822r.this
                java.util.ArrayList<uj3.g$c> r2 = r2.f216572i
                int r3 = r2.size()
                int r3 = r3 - r4
                r2.remove(r3)
            L_0x0214:
                com.tencent.mm.ui.chatting.presenter.r r2 = com.tencent.p014mm.p136ui.chatting.presenter.C73822r.this
                java.util.ArrayList<uj3.g$c> r2 = r2.f216572i
                r2.addAll(r0)
                com.tencent.mm.ui.chatting.presenter.r r2 = com.tencent.p014mm.p136ui.chatting.presenter.C73822r.this
                java.util.ArrayList<uj3.g$c> r3 = r2.f216572i
                r2.f216573j = r3
                r0.clear()
                com.tencent.mm.ui.chatting.presenter.r$a$b r0 = new com.tencent.mm.ui.chatting.presenter.r$a$b
                r0.<init>()
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
                return
            L_0x022d:
                r0 = move-exception
                r2.close()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.presenter.C73822r.C73823a.run():void");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.presenter.r$b */
    public class C73826b implements C78211g.C78219f {

        /* renamed from: com.tencent.mm.ui.chatting.presenter.r$b$a */
        public class C73827a implements View.OnCreateContextMenuListener {
            public C73827a(C73826b bVar) {
            }

            public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
                contextMenu.add(0, 0, 0, view.getContext().getString(C0966R.string.i4e));
                contextMenu.add(0, 1, 0, view.getContext().getString(C0966R.string.b7o));
                contextMenu.add(0, 2, 0, view.getContext().getString(C0966R.string.n3j));
                contextMenu.add(0, 3, 0, view.getContext().getString(C0966R.string.b_1));
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.presenter.r$b$b */
        public class C73828b implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ C78211g.C78216c f216638d;

            /* renamed from: e */
            public final /* synthetic */ int f216639e;

            public C73828b(C78211g.C78216c cVar, int i) {
                this.f216638d = cVar;
                this.f216639e = i;
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                if (this.f216638d == null) {
                    Log.m105921e("MicroMsg.UrlHistoryListPresenter", "item is null! position:%s", Integer.valueOf(this.f216639e));
                    return;
                }
                C73822r.this.mo102845t(menuItem.getItemId(), ((C72972g4) C97625j3.m125812b().mo105911z()).b00(this.f216638d.f229172d), 2);
            }
        }

        public C73826b() {
        }

        /* renamed from: a */
        public void mo102833a(View view, int i, C78211g.C78216c cVar) {
            Log.m105925i("MicroMsg.UrlHistoryListPresenter", "[onItemLongClick] position:%s", Integer.valueOf(i));
            C63462a.f180011a.mo88333h(14, 2);
            new C45082x0(view.getContext()).mo70436b(view, new C73827a(this), new C73828b(cVar, i), (C77407n.C47880p) null);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0117, code lost:
            if (r1 != false) goto L_0x0148;
         */
        /* JADX WARNING: Removed duplicated region for block: B:203:0x0795  */
        /* JADX WARNING: Removed duplicated region for block: B:204:0x0799  */
        /* JADX WARNING: Removed duplicated region for block: B:206:0x07a0  */
        /* JADX WARNING: Removed duplicated region for block: B:207:0x07a2  */
        /* JADX WARNING: Removed duplicated region for block: B:210:0x07ac  */
        /* JADX WARNING: Removed duplicated region for block: B:211:0x07ae  */
        /* JADX WARNING: Removed duplicated region for block: B:214:0x07be  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x02ed  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x02f4  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x02f7 A[SYNTHETIC, Splitter:B:85:0x02f7] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo102834b(android.view.View r27, int r28, uj3.C78211g.C78216c r29) {
            /*
                r26 = this;
                r1 = r26
                java.lang.Class<ym.l> r0 = p763ym.C79138l.class
                java.lang.Class<ym.p> r2 = p763ym.C79139p.class
                r3 = 1
                java.lang.Object[] r4 = new java.lang.Object[r3]
                java.lang.Integer r5 = java.lang.Integer.valueOf(r28)
                r6 = 0
                r4[r6] = r5
                java.lang.String r5 = "MicroMsg.UrlHistoryListPresenter"
                java.lang.String r7 = "[onItemClick] position:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r7, r4)
                if (r29 != 0) goto L_0x0027
                java.lang.Object[] r0 = new java.lang.Object[r3]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r28)
                r0[r6] = r2
                java.lang.String r2 = "[onItemClick] null == baseItem, position:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r2, r0)
                return
            L_0x0027:
                r4 = r29
                com.tencent.mm.ui.chatting.presenter.r$c r4 = (com.tencent.p014mm.p136ui.chatting.presenter.C73822r.C73829c) r4
                int r7 = r4.f229170b
                java.lang.String r8 = ""
                java.lang.String r9 = ".ui.tools.WebViewUI"
                java.lang.String r10 = "webview"
                java.lang.String r11 = "geta8key_username"
                java.lang.String r12 = "rawUrl"
                r14 = 5
                r15 = 0
                if (r7 == r14) goto L_0x0667
                r13 = 4
                if (r7 != r13) goto L_0x0041
                goto L_0x0667
            L_0x0041:
                r13 = 7
                if (r7 != r13) goto L_0x0413
                com.tencent.mm.ui.chatting.presenter.r r7 = com.tencent.p014mm.p136ui.chatting.presenter.C73822r.this
                r7.getClass()
                eb0.c r11 = eb0.C97625j3.m125812b()
                g62.l r11 = r11.mo105911z()
                long r3 = r4.f229172d
                com.tencent.mm.storage.g4 r11 = (com.tencent.p014mm.storage.C72972g4) r11
                com.tencent.mm.storage.f4 r3 = r11.b00(r3)
                java.lang.String r4 = r3.getContent()
                com.tencent.mm.message.l$b r4 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r4, r15)
                di3.d r11 = di3.C86312j.m106911c(r0)
                ym.l r11 = (p763ym.C79138l) r11
                java.lang.String r13 = r4.f195562d
                com.tencent.mm.pluginsdk.model.app.j r11 = r11.mo73990GW(r13, r6)
                if (r11 == 0) goto L_0x040f
                java.lang.String r13 = r7.f216568e
                boolean r17 = com.tencent.p014mm.storage.C72996z1.m85820U5(r13)
                if (r17 == 0) goto L_0x007f
                java.lang.String r13 = r3.getContent()
                java.lang.String r13 = eb0.C75604z3.m90847s(r13)
            L_0x007f:
                long r14 = r3.mo108774y2()
                android.content.Context r6 = r7.f216567d
                r18 = r13
                java.lang.String r13 = r11.field_packageName
                boolean r6 = com.tencent.p014mm.pluginsdk.model.app.C72688j0.m85020f(r6, r13)
                if (r6 == 0) goto L_0x0091
                r6 = 3
                goto L_0x0092
            L_0x0091:
                r6 = 6
            L_0x0092:
                int r13 = r4.f195582i
                r27 = r6
                r6 = 2
                if (r13 != r6) goto L_0x009d
                r6 = r18
                r13 = 4
                goto L_0x00a6
            L_0x009d:
                r6 = r18
                r1 = 5
                if (r13 != r1) goto L_0x00a4
                r13 = 1
                goto L_0x00a6
            L_0x00a4:
                r13 = r27
            L_0x00a6:
                com.tencent.mm.autogen.events.ReportMsgClickEvent r1 = new com.tencent.mm.autogen.events.ReportMsgClickEvent
                r1.<init>()
                r29 = r9
                com.tencent.mm.autogen.events.ReportMsgClickEvent$a r9 = r1.f193900d
                r17 = r10
                android.content.Context r10 = r7.f216567d
                r9.f193901a = r10
                r10 = 1
                r9.f193907g = r10
                java.lang.String r10 = r4.f195562d
                r9.f193902b = r10
                java.lang.String r10 = r11.field_packageName
                r9.f193903c = r10
                int r10 = r4.f195582i
                r9.f193905e = r10
                r9.f193904d = r6
                r9.f193908h = r13
                java.lang.String r6 = r4.f195536V
                r9.f193906f = r6
                r9.f193909i = r14
                r9.f193910j = r8
                java.lang.String r6 = r7.f216568e
                r9.f193911k = r6
                r1.publish()
                sw1.m r20 = sw1.C48477m.C13789a.m13091a()
                di3.d r1 = di3.C86312j.m106911c(r0)
                ym.l r1 = (p763ym.C79138l) r1
                android.content.Context r6 = r7.f216567d
                boolean r1 = r1.mo74016tz(r6, r11)
                if (r1 != 0) goto L_0x014a
                if (r20 == 0) goto L_0x014a
                java.lang.String r1 = r11.f149247P
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r1 != 0) goto L_0x011a
                java.lang.Class<gw.f> r1 = p159gw.C45962f.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                gw.f r1 = (p159gw.C45962f) r1
                android.content.Context r6 = r7.f216567d
                java.lang.String r9 = r11.f149247P
                boolean r1 = r1.Qt0(r6, r9)
                r6 = 2
                java.lang.Object[] r9 = new java.lang.Object[r6]
                java.lang.String r6 = r11.f149247P
                r10 = 0
                r9[r10] = r6
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
                r10 = 1
                r9[r10] = r6
                java.lang.String r6 = "oversea game info and gpdownload url is not empty, jump to google play directy:[%s], jump result: [%b]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r9)
                if (r1 == 0) goto L_0x011b
                goto L_0x0148
            L_0x011a:
                r10 = 1
            L_0x011b:
                com.tencent.mm.autogen.events.GameCenterOperationEvent r1 = new com.tencent.mm.autogen.events.GameCenterOperationEvent
                r1.<init>()
                com.tencent.mm.autogen.events.GameCenterOperationEvent$a r6 = r1.f107543d
                r9 = 2
                r6.f107544a = r9
                r6.f107549f = r10
                java.lang.String r9 = r11.field_appId
                r6.f107546c = r9
                android.content.Context r9 = r7.f216567d
                r6.f107545b = r9
                r1.publish()
                android.content.Intent r1 = new android.content.Intent
                r1.<init>()
                android.content.Context r1 = r7.f216567d
                java.lang.String r6 = r11.field_appId
                r23 = 1
                r25 = 1
                r21 = r1
                r22 = r6
                r24 = r25
                r20.dn0(r21, r22, r23, r24, r25)
            L_0x0148:
                r1 = 1
                goto L_0x014b
            L_0x014a:
                r1 = 0
            L_0x014b:
                if (r1 == 0) goto L_0x014f
                goto L_0x040f
            L_0x014f:
                java.lang.String r1 = r4.f195606o
                if (r1 == 0) goto L_0x01cf
                int r1 = r1.length()
                if (r1 != 0) goto L_0x015a
                goto L_0x01cf
            L_0x015a:
                long r0 = r7.f216575o
                r4 = 30000(0x7530, double:1.4822E-319)
                long r0 = r0 + r4
                long r4 = java.lang.System.currentTimeMillis()
                r7.f216575o = r4
                int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r2 >= 0) goto L_0x0173
                eb0.c r0 = eb0.C97625j3.m125812b()
                boolean r0 = r0.mo105883I()
                r7.f216574n = r0
            L_0x0173:
                boolean r0 = r7.f216574n
                if (r0 != 0) goto L_0x017f
                android.content.Context r0 = r7.f216567d
                r1 = 0
                nj3.C76912y0.m92771j(r0, r1)
                goto L_0x040f
            L_0x017f:
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                android.content.Context r1 = r7.f216567d
                java.lang.String r2 = "com.tencent.mm.ui.chatting.AppAttachDownloadUI"
                r0.setClassName(r1, r2)
                long r1 = r3.getMsgId()
                java.lang.String r3 = "app_msg_id"
                r0.putExtra(r3, r1)
                android.content.Context r1 = r7.f216567d
                k20.a r2 = new k20.a
                r2.<init>()
                r2.mo10233c(r0)
                java.lang.Object[] r9 = r2.mo10232b()
                java.lang.String r10 = "com/tencent/mm/ui/chatting/presenter/UrlHistoryListPresenter"
                java.lang.String r11 = "enterAppDataProfile"
                java.lang.String r12 = "(Lcom/tencent/mm/ui/chatting/presenter/UrlHistoryListPresenter$UrlMediaHistoryListItem;)V"
                java.lang.String r13 = "Undefined"
                java.lang.String r14 = "startActivity"
                java.lang.String r15 = "(Landroid/content/Intent;)V"
                r8 = r1
                j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
                r3 = 0
                java.lang.Object r0 = r2.mo10231a(r3)
                android.content.Intent r0 = (android.content.Intent) r0
                r1.startActivity(r0)
                java.lang.String r9 = "com/tencent/mm/ui/chatting/presenter/UrlHistoryListPresenter"
                java.lang.String r10 = "enterAppDataProfile"
                java.lang.String r11 = "(Lcom/tencent/mm/ui/chatting/presenter/UrlHistoryListPresenter$UrlMediaHistoryListItem;)V"
                java.lang.String r12 = "Undefined"
                java.lang.String r13 = "startActivity"
                java.lang.String r14 = "(Landroid/content/Intent;)V"
                j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
                goto L_0x040f
            L_0x01cf:
                java.lang.String r1 = r3.getContent()
                int r4 = r3.mo108769t2()
                if (r4 != 0) goto L_0x01ed
                int r4 = r3.mo108769t2()
                java.lang.String r6 = r7.f216568e
                boolean r6 = com.tencent.p014mm.storage.C72996z1.m85820U5(r6)
                if (r6 == 0) goto L_0x01ed
                if (r1 == 0) goto L_0x01ed
                if (r4 != 0) goto L_0x01ed
                java.lang.String r1 = eb0.C75604z3.m90849u(r1)
            L_0x01ed:
                r4 = 0
                com.tencent.mm.message.l$b r1 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r1, r4)
                di3.d r4 = di3.C86312j.m106911c(r0)
                ym.l r4 = (p763ym.C79138l) r4
                java.lang.String r6 = r1.f195562d
                com.tencent.mm.pluginsdk.model.app.j r4 = r4.getAppInfo(r6)
                if (r4 == 0) goto L_0x03ed
                android.content.Context r6 = r7.f216567d
                java.lang.String r9 = r4.field_packageName
                boolean r6 = com.tencent.p014mm.pluginsdk.model.app.C72688j0.m85020f(r6, r9)
                if (r6 == 0) goto L_0x03ed
                int r6 = r4.field_status
                r9 = 3
                if (r6 != r9) goto L_0x0227
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "requestAppShow fail, app is in blacklist, packageName = "
                r0.append(r1)
                java.lang.String r1 = r4.field_packageName
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
                goto L_0x040f
            L_0x0227:
                di3.d r2 = di3.C86312j.m106911c(r2)
                ym.p r2 = (p763ym.C79139p) r2
                android.content.Context r6 = r7.f216567d
                boolean r2 = r2.mo108864OB(r6, r4)
                if (r2 != 0) goto L_0x0264
                r2 = 1
                java.lang.Object[] r1 = new java.lang.Object[r2]
                java.lang.String r3 = r4.field_appName
                r6 = 0
                r1[r6] = r3
                java.lang.String r3 = "The app %s signature is incorrect."
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r3, r1)
                android.content.Context r1 = r7.f216567d
                r3 = 2131830801(0x7f112811, float:1.929461E38)
                java.lang.Object[] r5 = new java.lang.Object[r2]
                di3.d r0 = di3.C86312j.m106911c(r0)
                ym.l r0 = (p763ym.C79138l) r0
                android.content.Context r7 = r7.f216567d
                java.lang.String r0 = r0.mo74011hv(r7, r4)
                r5[r6] = r0
                java.lang.String r0 = r1.getString(r3, r5)
                android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r1, (java.lang.CharSequence) r0, (int) r2)
                r0.show()
                goto L_0x040f
            L_0x0264:
                java.lang.String r2 = "utf-8"
                java.lang.String r0 = r3.mo108768t()
                java.lang.String r6 = "@qqim"
                boolean r0 = r0.endsWith(r6)
                if (r0 == 0) goto L_0x0376
                java.lang.String r0 = r4.field_packageName
                java.lang.String r6 = "com.tencent.mobileqq"
                boolean r0 = r0.equals(r6)
                if (r0 != 0) goto L_0x027f
                goto L_0x0376
            L_0x027f:
                java.lang.String r0 = "jacks open QQ"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r0)
                android.content.Intent r9 = new android.content.Intent
                java.lang.String r0 = "android.intent.action.MAIN"
                r10 = 0
                r9.<init>(r0, r10)
                java.lang.String r10 = "android.intent.category.LAUNCHER"
                r9.addCategory(r10)
                r11 = 268435456(0x10000000, float:2.5243549E-29)
                r9.addFlags(r11)
                android.content.Context r11 = r7.f216567d
                android.content.pm.PackageManager r11 = r11.getPackageManager()
                r12 = 0
                android.content.pm.PackageInfo r13 = r11.getPackageInfo(r6, r12)     // Catch:{ Exception -> 0x02c5 }
                android.content.Intent r12 = new android.content.Intent     // Catch:{ Exception -> 0x02c5 }
                r14 = 0
                r12.<init>(r0, r14)     // Catch:{ Exception -> 0x02c5 }
                r12.addCategory(r10)     // Catch:{ Exception -> 0x02c5 }
                java.lang.String r0 = r13.packageName     // Catch:{ Exception -> 0x02c5 }
                r12.setPackage(r0)     // Catch:{ Exception -> 0x02c5 }
                r10 = 0
                java.util.List r0 = r11.queryIntentActivities(r12, r10)     // Catch:{ Exception -> 0x02c5 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x02c5 }
                java.lang.Object r0 = r0.next()     // Catch:{ Exception -> 0x02c5 }
                android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0     // Catch:{ Exception -> 0x02c5 }
                if (r0 == 0) goto L_0x02cc
                android.content.pm.ActivityInfo r0 = r0.activityInfo     // Catch:{ Exception -> 0x02c5 }
                java.lang.String r0 = r0.name     // Catch:{ Exception -> 0x02c5 }
                goto L_0x02cd
            L_0x02c5:
                r0 = move-exception
                r10 = 0
                java.lang.Object[] r11 = new java.lang.Object[r10]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r8, r11)
            L_0x02cc:
                r0 = 0
            L_0x02cd:
                r9.setClassName(r6, r0)
                java.lang.String r0 = "platformId"
                java.lang.String r6 = "wechat"
                r9.putExtra(r0, r6)
                eb0.c r0 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.v1 r0 = r0.mo105906u()
                r6 = 9
                r10 = 0
                java.lang.Object r0 = r0.mo119684e(r6, r10)
                if (r0 == 0) goto L_0x02f4
                boolean r6 = r0 instanceof java.lang.Integer
                if (r6 == 0) goto L_0x02f4
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                goto L_0x02f5
            L_0x02f4:
                r0 = 0
            L_0x02f5:
                if (r0 == 0) goto L_0x0335
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x032e }
                r6.<init>()     // Catch:{ UnsupportedEncodingException -> 0x032e }
                r6.append(r8)     // Catch:{ UnsupportedEncodingException -> 0x032e }
                r6.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x032e }
                java.lang.String r0 = r6.toString()     // Catch:{ UnsupportedEncodingException -> 0x032e }
                byte[] r0 = r0.getBytes(r2)     // Catch:{ UnsupportedEncodingException -> 0x032e }
                java.lang.String r6 = "asdfghjkl;'"
                byte[] r2 = r6.getBytes(r2)     // Catch:{ UnsupportedEncodingException -> 0x032e }
                int r6 = r2.length     // Catch:{ UnsupportedEncodingException -> 0x032e }
                r10 = 0
                r11 = 0
            L_0x0313:
                if (r10 >= r6) goto L_0x0327
                byte r12 = r2[r10]     // Catch:{ UnsupportedEncodingException -> 0x032e }
                int r13 = r0.length     // Catch:{ UnsupportedEncodingException -> 0x032e }
                if (r11 < r13) goto L_0x031b
                goto L_0x0327
            L_0x031b:
                int r13 = r11 + 1
                byte r14 = r0[r11]     // Catch:{ UnsupportedEncodingException -> 0x032e }
                r12 = r12 ^ r14
                byte r12 = (byte) r12     // Catch:{ UnsupportedEncodingException -> 0x032e }
                r0[r11] = r12     // Catch:{ UnsupportedEncodingException -> 0x032e }
                int r10 = r10 + 1
                r11 = r13
                goto L_0x0313
            L_0x0327:
                java.lang.String r2 = "tencent_gif"
                r9.putExtra(r2, r0)     // Catch:{ UnsupportedEncodingException -> 0x032e }
                goto L_0x0335
            L_0x032e:
                r0 = move-exception
                r2 = 0
                java.lang.Object[] r6 = new java.lang.Object[r2]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r8, r6)
            L_0x0335:
                android.content.Context r0 = r7.f216567d     // Catch:{ Exception -> 0x0372 }
                k20.a r2 = new k20.a     // Catch:{ Exception -> 0x0372 }
                r2.<init>()     // Catch:{ Exception -> 0x0372 }
                r2.mo10233c(r9)     // Catch:{ Exception -> 0x0372 }
                java.lang.Object[] r19 = r2.mo10232b()     // Catch:{ Exception -> 0x0372 }
                java.lang.String r20 = "com/tencent/mm/ui/chatting/presenter/UrlHistoryListPresenter"
                java.lang.String r21 = "dealOpenQQ"
                java.lang.String r22 = "(Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/pluginsdk/model/app/AppInfo;)Z"
                java.lang.String r23 = "Undefined"
                java.lang.String r24 = "startActivity"
                java.lang.String r25 = "(Landroid/content/Intent;)V"
                r18 = r0
                j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ Exception -> 0x0372 }
                r5 = 0
                java.lang.Object r2 = r2.mo10231a(r5)     // Catch:{ Exception -> 0x0372 }
                android.content.Intent r2 = (android.content.Intent) r2     // Catch:{ Exception -> 0x0372 }
                r0.startActivity(r2)     // Catch:{ Exception -> 0x0372 }
                java.lang.String r19 = "com/tencent/mm/ui/chatting/presenter/UrlHistoryListPresenter"
                java.lang.String r20 = "dealOpenQQ"
                java.lang.String r21 = "(Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/pluginsdk/model/app/AppInfo;)Z"
                java.lang.String r22 = "Undefined"
                java.lang.String r23 = "startActivity"
                java.lang.String r24 = "(Landroid/content/Intent;)V"
                r18 = r0
                j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x0372 }
                goto L_0x0373
            L_0x0372:
            L_0x0373:
                r16 = 1
                goto L_0x0378
            L_0x0376:
                r16 = 0
            L_0x0378:
                if (r16 == 0) goto L_0x037c
                goto L_0x040f
            L_0x037c:
                com.tencent.mm.opensdk.modelmsg.WXAppExtendObject r0 = new com.tencent.mm.opensdk.modelmsg.WXAppExtendObject
                r0.<init>()
                java.lang.String r2 = r1.f195614q
                r0.extInfo = r2
                java.lang.String r2 = r1.f195606o
                if (r2 == 0) goto L_0x03a1
                int r2 = r2.length()
                if (r2 <= 0) goto L_0x03a1
                com.tencent.mm.pluginsdk.model.app.e r2 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.vx0()
                java.lang.String r5 = r1.f195606o
                com.tencent.mm.pluginsdk.model.app.d r2 = r2.mo100154qq(r5)
                if (r2 != 0) goto L_0x039d
                r15 = 0
                goto L_0x039f
            L_0x039d:
                java.lang.String r15 = r2.field_fileFullPath
            L_0x039f:
                r0.filePath = r15
            L_0x03a1:
                com.tencent.mm.opensdk.modelmsg.WXMediaMessage r10 = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage
                r10.<init>()
                r2 = 638064131(0x26081603, float:4.721431E-16)
                r10.sdkVer = r2
                r10.mediaObject = r0
                java.lang.String r0 = r1.f195570f
                r10.title = r0
                java.lang.String r0 = r1.f195574g
                r10.description = r0
                java.lang.String r0 = r1.f195539W
                r10.messageAction = r0
                java.lang.String r0 = r1.f195542X
                r10.messageExt = r0
                java.lang.Class<gt.k> r0 = p158gt.C98201k.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                gt.k r0 = (p158gt.C98201k) r0
                gt.m r0 = r0.mo137277xi()
                java.lang.String r1 = r3.mo108765s2()
                com.tencent.mm.modelimage.m r0 = (com.tencent.p014mm.modelimage.C92839m) r0
                java.lang.String r0 = r0.mo127161CZ(r1)
                r1 = -1
                r2 = 0
                byte[] r0 = com.tencent.p014mm.vfs.C86013q1.m106433O(r0, r2, r1)
                r10.thumbData = r0
                com.tencent.mm.ui.chatting.d5 r8 = new com.tencent.mm.ui.chatting.d5
                android.content.Context r0 = r7.f216567d
                r8.<init>(r0)
                java.lang.String r9 = r4.field_packageName
                java.lang.String r11 = r4.field_appId
                java.lang.String r12 = r4.field_openId
                r13 = 0
                r8.mo102719b(r9, r10, r11, r12, r13)
                goto L_0x040f
            L_0x03ed:
                di3.d r0 = di3.C86312j.m106911c(r2)
                ym.p r0 = (p763ym.C79139p) r0
                android.content.Context r2 = r7.f216567d
                java.lang.String r1 = r1.f195562d
                java.lang.String r3 = "message"
                java.lang.String r0 = r0.I90(r2, r1, r3)
                android.content.Intent r1 = new android.content.Intent
                r1.<init>()
                r1.putExtra(r12, r0)
                android.content.Context r0 = r7.f216567d
                r3 = r29
                r6 = r17
                r2 = 0
                ke3.C88144b.m109791i(r0, r6, r3, r1, r2)
            L_0x040f:
                r9 = r26
                goto L_0x0863
            L_0x0413:
                r3 = r9
                r6 = r10
                r0 = 15
                r1 = 23
                java.lang.String r2 = "emoji"
                if (r7 != r0) goto L_0x04b2
                r9 = r26
                com.tencent.mm.ui.chatting.presenter.r r0 = com.tencent.p014mm.p136ui.chatting.presenter.C73822r.this
                r0.getClass()
                eb0.c r7 = eb0.C97625j3.m125812b()
                g62.l r7 = r7.mo105911z()
                long r14 = r4.f229172d
                com.tencent.mm.storage.g4 r7 = (com.tencent.p014mm.storage.C72972g4) r7
                com.tencent.mm.storage.f4 r4 = r7.b00(r14)
                java.lang.String r4 = r4.getContent()
                r7 = 0
                com.tencent.mm.message.l$b r4 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r4, r7)
                java.lang.String r7 = r4.f195583i0
                boolean r8 = android.text.TextUtils.isEmpty(r7)
                if (r8 == 0) goto L_0x0459
                java.lang.Class<z51.g> r7 = z51.C39315g.class
                di3.d r7 = di3.C86312j.m106911c(r7)
                z51.g r7 = (z51.C39315g) r7
                zc3.a r7 = r7.mo58035cm()
                java.lang.String r8 = r4.f195586j
                i61.h r7 = (i61.C98602h) r7
                java.lang.String r7 = r7.mo138003J(r8)
            L_0x0459:
                boolean r8 = android.text.TextUtils.isEmpty(r7)
                if (r8 == 0) goto L_0x0478
                android.content.Intent r1 = new android.content.Intent
                r1.<init>()
                java.lang.String r2 = eb0.C75592q0.m90789s()
                r1.putExtra(r11, r2)
                java.lang.String r2 = r4.f195586j
                r1.putExtra(r12, r2)
                android.content.Context r0 = r0.f216567d
                r2 = 0
                ke3.C88144b.m109791i(r0, r6, r3, r1, r2)
                goto L_0x0863
            L_0x0478:
                java.lang.String r3 = "start emoji detail from brandcontact"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r3)
                android.content.Intent r3 = new android.content.Intent
                r3.<init>()
                java.lang.String r4 = "extra_id"
                r3.putExtra(r4, r7)
                r4 = 123(0x7b, float:1.72E-43)
                java.lang.String r5 = "preceding_scence"
                r3.putExtra(r5, r4)
                java.lang.String r4 = "download_entrance_scene"
                r3.putExtra(r4, r1)
                android.content.Context r0 = r0.f216567d
                java.lang.String r1 = ".ui.EmojiStoreDetailUI"
                r4 = 0
                ke3.C88144b.m109791i(r0, r2, r1, r3, r4)
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r1 = 10993(0x2af1, float:1.5404E-41)
                r2 = 2
                java.lang.Object[] r3 = new java.lang.Object[r2]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r4 = 0
                r3[r4] = r2
                r2 = 1
                r3[r2] = r7
                r0.mo160131h(r1, r3)
                goto L_0x0863
            L_0x04b2:
                r9 = r26
                r0 = 26
                java.lang.String r3 = "topic id is zero."
                if (r7 == r0) goto L_0x05f3
                r0 = 97
                if (r7 != r0) goto L_0x04c1
                goto L_0x05f3
            L_0x04c1:
                r0 = 27
                if (r7 != r0) goto L_0x0536
                com.tencent.mm.ui.chatting.presenter.r r0 = com.tencent.p014mm.p136ui.chatting.presenter.C73822r.this
                r0.getClass()
                eb0.c r1 = eb0.C97625j3.m125812b()
                g62.l r1 = r1.mo105911z()
                long r6 = r4.f229172d
                com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
                com.tencent.mm.storage.f4 r1 = r1.b00(r6)
                java.lang.String r4 = r1.getContent()
                r6 = 0
                com.tencent.mm.message.l$b r4 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r4, r6)
                int r6 = r4.f195511M1
                java.lang.String r7 = r4.f195514N1
                java.lang.String r8 = r4.f195517O1
                java.lang.String r10 = r4.f195520P1
                java.lang.String r13 = r4.f195523Q1
                int r14 = r4.f195526R1
                if (r6 == 0) goto L_0x0531
                android.content.Intent r3 = new android.content.Intent
                r3.<init>()
                java.lang.String r5 = r0.f216568e
                boolean r5 = com.tencent.p014mm.storage.C72996z1.m85820U5(r5)
                r15 = 0
                java.lang.String r1 = r0.mo102843r(r1, r5, r15)
                r3.putExtra(r11, r1)
                java.lang.String r1 = r4.f195642x
                r3.putExtra(r12, r1)
                java.lang.String r1 = "set_id"
                r3.putExtra(r1, r6)
                java.lang.String r1 = "set_title"
                r3.putExtra(r1, r7)
                java.lang.String r1 = "set_iconURL"
                r3.putExtra(r1, r10)
                java.lang.String r1 = "set_desc"
                r3.putExtra(r1, r8)
                java.lang.String r1 = "headurl"
                r3.putExtra(r1, r13)
                java.lang.String r1 = "pageType"
                r3.putExtra(r1, r14)
                android.content.Context r0 = r0.f216567d
                java.lang.String r1 = ".ui.v2.EmojiStoreV2SingleProductUI"
                r4 = 0
                ke3.C88144b.m109791i(r0, r2, r1, r3, r4)
                goto L_0x0863
            L_0x0531:
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
                goto L_0x0863
            L_0x0536:
                r0 = 51
                if (r7 != r0) goto L_0x05e2
                com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r0 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.SessionChannels
                com.tencent.mm.ui.chatting.presenter.r r1 = com.tencent.p014mm.p136ui.chatting.presenter.C73822r.this
                android.content.Context r1 = r1.f216567d
                boolean r0 = r0.checkAvailable(r1)
                if (r0 != 0) goto L_0x0547
                return
            L_0x0547:
                com.tencent.mm.ui.chatting.presenter.r r0 = com.tencent.p014mm.p136ui.chatting.presenter.C73822r.this
                r0.getClass()
                java.lang.Class<ht1.t1> r1 = ht1.C60200t1.class
                eb0.c r2 = eb0.C97625j3.m125812b()
                g62.l r2 = r2.mo105911z()
                long r3 = r4.f229172d
                com.tencent.mm.storage.g4 r2 = (com.tencent.p014mm.storage.C72972g4) r2
                com.tencent.mm.storage.f4 r2 = r2.b00(r3)
                java.lang.String r3 = r2.getContent()
                r4 = 0
                com.tencent.mm.message.l$b r3 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r3, r4)
                java.lang.Class<ht1.f> r4 = ht1.C60166f.class
                com.tencent.mm.message.g r3 = r3.mo93555w(r4)
                ht1.f r3 = (ht1.C60166f) r3
                android.content.Intent r4 = new android.content.Intent
                r4.<init>()
                java.lang.String r5 = r2.mo108768t()
                boolean r5 = com.tencent.p014mm.storage.C72996z1.m85820U5(r5)
                java.lang.String r6 = "report_scene"
                if (r5 == 0) goto L_0x0585
                r5 = 2
                r4.putExtra(r6, r5)
                goto L_0x0589
            L_0x0585:
                r5 = 1
                r4.putExtra(r6, r5)
            L_0x0589:
                java.lang.String r2 = r2.mo108768t()
                java.lang.String r5 = "from_user"
                r4.putExtra(r5, r2)
                te3.rk1 r2 = r3.f171710b
                java.lang.String r2 = r2.f185183d
                if (r2 == 0) goto L_0x05a9
                boolean r5 = r2.isEmpty()
                if (r5 == 0) goto L_0x059f
                goto L_0x05a9
            L_0x059f:
                java.math.BigInteger r5 = new java.math.BigInteger
                r5.<init>(r2)
                long r5 = r5.longValue()
                goto L_0x05ab
            L_0x05a9:
                r5 = 0
            L_0x05ab:
                java.lang.String r2 = "feed_object_id"
                r4.putExtra(r2, r5)
                te3.rk1 r2 = r3.f171710b
                java.lang.String r2 = r2.f185191o
                java.lang.String r5 = "feed_object_nonceId"
                r4.putExtra(r5, r2)
                java.lang.String r2 = "business_type"
                r5 = 0
                r4.putExtra(r2, r5)
                te3.rk1 r2 = r3.f171710b
                java.lang.String r2 = r2.f185184e
                java.lang.String r3 = "finder_user_name"
                r4.putExtra(r3, r2)
                di3.d r2 = di3.C86312j.m106911c(r1)
                ht1.t1 r2 = (ht1.C60200t1) r2
                r3 = 25
                r5 = 6
                r6 = 2
                r2.mo76842e7(r5, r6, r3, r4)
                di3.d r1 = di3.C86312j.m106911c(r1)
                ht1.t1 r1 = (ht1.C60200t1) r1
                android.content.Context r0 = r0.f216567d
                r1.mo76864nr(r0, r4)
                goto L_0x0863
            L_0x05e2:
                r1 = 1
                java.lang.Object[] r0 = new java.lang.Object[r1]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
                r2 = 0
                r0[r2] = r1
                java.lang.String r1 = "[onItemClick] type:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r1, r0)
                goto L_0x0863
            L_0x05f3:
                com.tencent.mm.ui.chatting.presenter.r r0 = com.tencent.p014mm.p136ui.chatting.presenter.C73822r.this
                r0.getClass()
                eb0.c r6 = eb0.C97625j3.m125812b()
                g62.l r6 = r6.mo105911z()
                long r7 = r4.f229172d
                com.tencent.mm.storage.g4 r6 = (com.tencent.p014mm.storage.C72972g4) r6
                com.tencent.mm.storage.f4 r4 = r6.b00(r7)
                java.lang.String r6 = r4.getContent()
                r7 = 0
                com.tencent.mm.message.l$b r6 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r6, r7)
                int r7 = r6.f195511M1
                java.lang.String r8 = r6.f195514N1
                java.lang.String r10 = r6.f195517O1
                java.lang.String r13 = r6.f195520P1
                java.lang.String r14 = r6.f195523Q1
                if (r7 == 0) goto L_0x0662
                android.content.Intent r3 = new android.content.Intent
                r3.<init>()
                java.lang.String r5 = r0.f216568e
                boolean r5 = com.tencent.p014mm.storage.C72996z1.m85820U5(r5)
                r15 = 0
                java.lang.String r4 = r0.mo102843r(r4, r5, r15)
                r3.putExtra(r11, r4)
                java.lang.String r4 = r6.f195642x
                r3.putExtra(r12, r4)
                java.lang.String r4 = "topic_id"
                r3.putExtra(r4, r7)
                java.lang.String r4 = "topic_name"
                r3.putExtra(r4, r8)
                java.lang.String r4 = "topic_desc"
                r3.putExtra(r4, r10)
                java.lang.String r4 = "topic_icon_url"
                r3.putExtra(r4, r13)
                java.lang.String r4 = "topic_ad_url"
                r3.putExtra(r4, r14)
                java.lang.String r4 = "extra_scence"
                r3.putExtra(r4, r1)
                android.content.Context r0 = r0.f216567d
                java.lang.String r1 = ".ui.EmojiStoreTopicUI"
                r4 = 0
                ke3.C88144b.m109791i(r0, r2, r1, r3, r4)
                goto L_0x0863
            L_0x0662:
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
                goto L_0x0863
            L_0x0667:
                r3 = r9
                r6 = r10
                r9 = r1
                com.tencent.mm.ui.chatting.presenter.r r1 = com.tencent.p014mm.p136ui.chatting.presenter.C73822r.this
                r1.getClass()
                eb0.c r7 = eb0.C97625j3.m125812b()
                g62.l r7 = r7.mo105911z()
                long r13 = r4.f229172d
                com.tencent.mm.storage.g4 r7 = (com.tencent.p014mm.storage.C72972g4) r7
                com.tencent.mm.storage.f4 r7 = r7.b00(r13)
                java.lang.String r10 = r7.getContent()
                r13 = 0
                com.tencent.mm.message.l$b r10 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r10, r13)
                com.tencent.mm.ui.chatting.presenter.r$d r4 = r4.f216644m
                if (r4 == 0) goto L_0x06c1
                boolean r4 = r4.f216645a
                if (r4 == 0) goto L_0x06c1
                r4 = 10000(0x2710, float:1.4013E-41)
                android.os.Bundle r13 = new android.os.Bundle
                r13.<init>()
                java.lang.String r14 = "biz_video_scene"
                r15 = 1
                r13.putInt(r14, r15)
                java.lang.String r14 = com.tencent.p014mm.p136ui.C74928u.C74929b.f220309a
                r13.putInt(r14, r4)
                java.lang.String r4 = "geta8key_scene"
                r13.putInt(r4, r15)
                java.lang.String r4 = r1.f216568e
                r13.putString(r11, r4)
                android.content.Context r18 = r27.getContext()
                long r19 = r7.getMsgId()
                long r21 = r7.mo108774y2()
                r23 = 0
                r24 = r13
                cy0.C75308c.m90328a(r18, r19, r21, r23, r24)
                r4 = 1
                goto L_0x06c2
            L_0x06c1:
                r4 = 0
            L_0x06c2:
                if (r4 == 0) goto L_0x06c6
                goto L_0x0863
            L_0x06c6:
                java.lang.String r4 = r10.f195586j
                if (r4 == 0) goto L_0x0863
                boolean r4 = r4.equals(r8)
                if (r4 != 0) goto L_0x0863
                di3.d r2 = di3.C86312j.m106911c(r2)
                ym.p r2 = (p763ym.C79139p) r2
                java.lang.String r4 = r10.f195586j
                java.lang.String r13 = r1.f216568e
                boolean r13 = com.tencent.p014mm.storage.C72996z1.m85820U5(r13)
                if (r13 == 0) goto L_0x06e3
                java.lang.String r13 = "groupmessage"
                goto L_0x06e5
            L_0x06e3:
                java.lang.String r13 = "singlemessage"
            L_0x06e5:
                java.lang.String r2 = r2.mo108862K3(r4, r13)
                java.lang.String r4 = r10.f195586j
                android.content.Context r13 = r1.f216567d
                java.lang.String r14 = r10.f195562d
                if (r14 == 0) goto L_0x0708
                int r15 = r14.length()
                if (r15 != 0) goto L_0x06f8
                goto L_0x0708
            L_0x06f8:
                di3.d r0 = di3.C86312j.m106911c(r0)
                ym.l r0 = (p763ym.C79138l) r0
                com.tencent.mm.pluginsdk.model.app.j r0 = r0.getAppInfo(r14)
                if (r0 != 0) goto L_0x0705
                goto L_0x0708
            L_0x0705:
                java.lang.String r0 = r0.field_packageName
                goto L_0x0709
            L_0x0708:
                r0 = 0
            L_0x0709:
                if (r0 != 0) goto L_0x070c
                goto L_0x071f
            L_0x070c:
                android.content.pm.PackageManager r13 = r13.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0718 }
                r14 = 0
                android.content.pm.PackageInfo r0 = r13.getPackageInfo(r0, r14)     // Catch:{ NameNotFoundException -> 0x0716 }
                goto L_0x0720
            L_0x0716:
                r0 = move-exception
                goto L_0x071a
            L_0x0718:
                r0 = move-exception
                r14 = 0
            L_0x071a:
                java.lang.Object[] r13 = new java.lang.Object[r14]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r8, r13)
            L_0x071f:
                r0 = 0
            L_0x0720:
                android.content.Intent r5 = new android.content.Intent
                r5.<init>()
                r5.putExtra(r12, r2)
                java.lang.String r2 = r10.f195570f
                java.lang.String r8 = "webpageTitle"
                r5.putExtra(r8, r2)
                java.lang.String r2 = r10.f195562d
                if (r2 == 0) goto L_0x0764
                java.lang.String r12 = "wx751a1acca5688ba3"
                boolean r2 = r12.equals(r2)
                if (r2 != 0) goto L_0x0753
                java.lang.String r2 = r10.f195562d
                java.lang.String r12 = "wxfbc915ff7c30e335"
                boolean r2 = r12.equals(r2)
                if (r2 != 0) goto L_0x0753
                java.lang.String r2 = r10.f195562d
                java.lang.String r12 = "wx482a4001c37e2b74"
                boolean r2 = r12.equals(r2)
                if (r2 == 0) goto L_0x0764
            L_0x0753:
                android.os.Bundle r2 = new android.os.Bundle
                r2.<init>()
                java.lang.String r12 = r10.f195562d
                java.lang.String r13 = "jsapi_args_appid"
                r2.putString(r13, r12)
                java.lang.String r12 = "jsapiargs"
                r5.putExtra(r12, r2)
            L_0x0764:
                java.util.Map<java.lang.String, java.lang.String> r2 = r10.f195558c
                if (r2 == 0) goto L_0x078d
                java.lang.String r12 = ".msg.appmsg.mmreadershare.itemshowtype"
                java.lang.Object r2 = r2.get(r12)
                java.lang.String r2 = (java.lang.String) r2
                r12 = -1
                int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r12)
                r12 = 16
                if (r2 != r12) goto L_0x078d
                java.lang.String r2 = "immersiveVideoStyle"
                r12 = 1
                r5.putExtra(r2, r12)
                java.lang.String r2 = "immersivePageBgIsDark"
                r5.putExtra(r2, r12)
                r2 = 17170444(0x106000c, float:2.4611947E-38)
                java.lang.String r12 = "webview_bg_color_rsID"
                r5.putExtra(r12, r2)
            L_0x078d:
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
                java.lang.String r12 = "shortUrl"
                if (r2 != 0) goto L_0x0799
                r5.putExtra(r12, r4)
                goto L_0x079e
            L_0x0799:
                java.lang.String r2 = r10.f195586j
                r5.putExtra(r12, r2)
            L_0x079e:
                if (r0 != 0) goto L_0x07a2
                r2 = 0
                goto L_0x07a4
            L_0x07a2:
                java.lang.String r2 = r0.versionName
            L_0x07a4:
                java.lang.String r4 = "version_name"
                r5.putExtra(r4, r2)
                if (r0 != 0) goto L_0x07ae
                r0 = 0
                goto L_0x07b0
            L_0x07ae:
                int r0 = r0.versionCode
            L_0x07b0:
                java.lang.String r2 = "version_code"
                r5.putExtra(r2, r0)
                java.lang.String r0 = r10.f195634v
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 != 0) goto L_0x07ce
                java.lang.String r0 = r10.f195634v
                java.lang.String r2 = "srcUsername"
                r5.putExtra(r2, r0)
                java.lang.String r0 = r10.f195638w
                java.lang.String r2 = "srcDisplayname"
                r5.putExtra(r2, r0)
            L_0x07ce:
                long r12 = r7.getMsgId()
                java.lang.String r0 = "msg_id"
                r5.putExtra(r0, r12)
                java.lang.String r0 = "key_enable_teen_mode_check"
                r2 = 1
                r5.putExtra(r0, r2)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "msg_"
                r0.append(r2)
                long r12 = r7.mo108774y2()
                java.lang.String r4 = java.lang.Long.toString(r12)
                r0.append(r4)
                java.lang.String r0 = r0.toString()
                java.lang.String r4 = "KPublisherId"
                r5.putExtra(r4, r0)
                java.lang.String r0 = r10.f195562d
                java.lang.String r4 = "KAppId"
                r5.putExtra(r4, r0)
                java.lang.String r0 = r10.f195570f
                r5.putExtra(r8, r0)
                java.lang.String r0 = r10.f195646y
                java.lang.String r4 = "thumbUrl"
                r5.putExtra(r4, r0)
                java.lang.String r0 = r1.f216568e
                r5.putExtra(r11, r0)
                java.lang.String r0 = r1.f216568e
                boolean r0 = com.tencent.p014mm.storage.C72996z1.m85820U5(r0)
                r4 = 0
                java.lang.String r0 = r1.mo102843r(r7, r0, r4)
                java.lang.String r4 = "pre_username"
                r5.putExtra(r4, r0)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r2)
                long r7 = r7.mo108774y2()
                java.lang.String r2 = java.lang.Long.toString(r7)
                r4.append(r2)
                java.lang.String r2 = r4.toString()
                java.lang.String r4 = "prePublishId"
                r5.putExtra(r4, r2)
                java.lang.String r2 = "preUsername"
                r5.putExtra(r2, r0)
                java.lang.String r2 = r1.f216568e
                java.lang.String r4 = "preChatName"
                r5.putExtra(r4, r2)
                java.lang.String r2 = r1.f216568e
                int r0 = eb0.C45629t0.m50815b(r0, r2)
                java.lang.String r2 = "preChatTYPE"
                r5.putExtra(r2, r0)
                java.lang.String r0 = "preMsgIndex"
                r2 = 0
                r5.putExtra(r0, r2)
                android.content.Context r0 = r1.f216567d
                r1 = 0
                ke3.C88144b.m109791i(r0, r6, r3, r5, r1)
            L_0x0863:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.presenter.C73822r.C73826b.mo102834b(android.view.View, int, uj3.g$c):void");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.presenter.r$c */
    public class C73829c extends C78211g.C78216c {

        /* renamed from: j */
        public String f216641j;

        /* renamed from: k */
        public String f216642k;

        /* renamed from: l */
        public String f216643l;

        /* renamed from: m */
        public C73830d f216644m;

        public C73829c(C73822r rVar, long j, int i, String str, long j2, String str2, String str3, String str4, String str5, C73830d dVar) {
            super(j, i, str, j2, str2, str3, str4, str5);
            this.f216644m = dVar;
        }

        /* renamed from: d */
        public boolean mo102837d(String str) {
            if (str == null) {
                return false;
            }
            String lowerCase = str.toLowerCase();
            if (!mo108239b(lowerCase)) {
                if (!Util.isNullOrNil(this.f216642k) && mo108240c(lowerCase, this.f216642k.toLowerCase())) {
                    return true;
                }
            } else if (!Util.isNullOrNil(this.f216642k) && this.f216642k.toLowerCase().contains(lowerCase)) {
                return true;
            }
            return super.mo102837d(lowerCase);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.presenter.r$d */
    public class C73830d {

        /* renamed from: a */
        public boolean f216645a = false;

        public C73830d(C73822r rVar) {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.presenter.r$e */
    public class C73831e extends C78211g.C78213b {

        /* renamed from: E */
        public ImageView f216646E;

        /* renamed from: F */
        public TextView f216647F;

        /* renamed from: G */
        public TextView f216648G;

        public C73831e(C73822r rVar, View view) {
            super(view);
            this.f216646E = (ImageView) view.findViewById(C0966R.C0970id.cv_);
            this.f216647F = (TextView) view.findViewById(C0966R.C0970id.cuv);
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.cw9);
            this.f216648G = textView;
            textView.setVisibility(0);
        }
    }

    public C73822r(Context context) {
        super(context);
    }

    /* renamed from: c */
    public String mo102824c() {
        return this.f216567d.getString(C0966R.string.f7551je);
    }

    /* renamed from: e */
    public String mo102825e() {
        return this.f216567d.getString(C0966R.string.f7551je);
    }

    /* renamed from: f */
    public void mo102826f(C78211g.C78213b bVar, int i, int i2) {
        C73831e eVar = (C73831e) bVar;
        C73829c cVar = (C73829c) mo102842q(i);
        cVar.getClass();
        int i3 = 0;
        if (Util.isNullOrNil((String) null) || !Util.isNullOrNil(cVar.f216642k)) {
            eVar.f216647F.setVisibility(8);
        } else {
            eVar.f216647F.setVisibility(0);
            eVar.f216647F.setText(Util.nullAs((String) null, ""));
        }
        Bitmap jo = ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).mo127188jo(cVar.f216643l, C76577a.m92156g(this.f216567d), false);
        if (jo == null || jo.isRecycled()) {
            Bitmap ub = ((C79138l) C86312j.m106911c(C79138l.class)).mo74018ub(cVar.f216641j, 1, C76577a.m92156g(this.f216567d));
            C73830d dVar = cVar.f216644m;
            boolean z = dVar != null && dVar.f216645a;
            String a = C102027b.m134386a(cVar.f216643l, 4, z);
            Log.m105927v("MicroMsg.UrlHistoryListPresenter", "alvinluo fillDetail coverUrl: %s, isBizNativeVideo: %b", a, Boolean.valueOf(z));
            if (ub == null || ub.isRecycled()) {
                if (z) {
                    i3 = 4;
                }
                C20937c.C20939b bVar2 = new C20937c.C20939b();
                bVar2.f59359o = C0966R.color.f3237k_;
                bVar2.f59347c = true;
                bVar2.f59350f = C14050a.m13405b(a);
                int b = C76577a.m92151b(MMApplicationContext.getContext(), 50);
                int b2 = C76577a.m92151b(MMApplicationContext.getContext(), 50);
                bVar2.f59354j = b;
                bVar2.f59355k = b2;
                bVar2.f59369y = new C22908r(i3);
                bVar2.f59370z = new C22898h(i3);
                bVar2.f59345a = true;
                C20828a.m22825b().mo32519h(a, eVar.f216646E, bVar2.mo32666a());
            } else {
                eVar.f216646E.setImageBitmap(ub);
            }
        } else {
            eVar.f216646E.setImageBitmap(jo);
        }
        eVar.f216648G.setText(Util.nullAs(cVar.f216642k, ""));
        eVar.mo108236y(eVar.f216648G, this.f216570g.f229163e);
    }

    /* renamed from: g */
    public void mo102827g(boolean z) {
        this.f216569f.mo102729f(z);
        C86709a0.m107528h();
        C86709a0.m107525e().postToWorker(new C73823a(z));
    }

    public int getType() {
        this.f216631p.add(5);
        this.f216631p.add(7);
        this.f216631p.add(27);
        this.f216631p.add(26);
        this.f216631p.add(97);
        this.f216631p.add(15);
        this.f216631p.add(4);
        this.f216631p.add(68);
        return -1;
    }

    /* renamed from: o */
    public RecyclerView.C16631z mo102829o(ViewGroup viewGroup, int i) {
        return new C73831e(this, LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.cb8, viewGroup, false));
    }

    /* renamed from: p */
    public C78211g.C78219f mo102830p() {
        return new C73826b();
    }
}
